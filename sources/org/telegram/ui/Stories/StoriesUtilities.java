package org.telegram.ui.Stories;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported;
import org.telegram.tgnet.TLRPC$TL_stories_getUserStories;
import org.telegram.tgnet.TLRPC$TL_storyViews;
import org.telegram.tgnet.TLRPC$TL_userStories;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesUtilities;
public class StoriesUtilities {
    public static GradientTools closeFriendsGradientTools;
    public static Drawable expiredStoryDrawable;
    public static int grayLastColor;
    public static Paint grayPaint;
    public static int storyCellGrayLastColor;
    public static GradientTools[] storiesGradientTools = new GradientTools[2];
    public static Paint[] storyCellGreyPaint = new Paint[2];
    private static final RectF rectTmp = new RectF();
    static int debugState = 0;
    static Runnable debugRunnable = new Runnable() {
        @Override
        public void run() {
            int abs = Math.abs(Utilities.random.nextInt() % 3);
            StoriesUtilities.debugState = abs;
            if (abs == 2) {
                StoriesUtilities.debugState = 1;
            } else {
                StoriesUtilities.debugState = 2;
            }
            NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
            AndroidUtilities.runOnUIThread(StoriesUtilities.debugRunnable, 1000L);
            LaunchActivity.getLastFragment().getFragmentView();
        }
    };

    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, AvatarStoryParams avatarStoryParams) {
        drawAvatarWithStory(j, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(j), avatarStoryParams);
    }

    public static void drawAvatarWithStory(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesUtilities.drawAvatarWithStory(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, org.telegram.ui.Stories.StoriesUtilities$AvatarStoryParams):void");
    }

    private static int getPredictiveUnreadState(StoriesController storiesController, long j) {
        TLRPC$User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
        if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || user.stories_max_id <= 0 || user.stories_unavailable) {
            return 0;
        }
        return user.stories_max_id > storiesController.dialogIdToMaxReadId.get(j, 0) ? 1 : 2;
    }

    private static void drawProgress(Canvas canvas, AvatarStoryParams avatarStoryParams, View view, Paint paint) {
        avatarStoryParams.updateProgressParams();
        view.invalidate();
        if (avatarStoryParams.inc) {
            canvas.drawArc(rectTmp, avatarStoryParams.globalAngle, avatarStoryParams.sweepAngle * 360.0f, false, paint);
        } else {
            canvas.drawArc(rectTmp, avatarStoryParams.globalAngle + 360.0f, avatarStoryParams.sweepAngle * (-360.0f), false, paint);
        }
        for (int i = 0; i < 16; i++) {
            float f = (i * 22.5f) + 10.0f;
            canvas.drawArc(rectTmp, avatarStoryParams.globalAngle + f, ((22.5f + f) - 10.0f) - f, false, paint);
        }
    }

    private static void checkStoryCellGrayPaint(boolean z) {
        Paint[] paintArr = storyCellGreyPaint;
        if (paintArr[z ? 1 : 0] == null) {
            paintArr[z ? 1 : 0] = new Paint(1);
            storyCellGreyPaint[z ? 1 : 0].setStyle(Paint.Style.STROKE);
            storyCellGreyPaint[z ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            storyCellGreyPaint[z ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int color = Theme.getColor(!z ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived);
        if (storyCellGrayLastColor != color) {
            storyCellGrayLastColor = color;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (!(computePerceivedBrightness < 0.721f)) {
                storyCellGreyPaint[z ? 1 : 0].setColor(ColorUtils.blendARGB(color, -16777216, 0.2f));
            } else if (computePerceivedBrightness < 0.25f) {
                storyCellGreyPaint[z ? 1 : 0].setColor(ColorUtils.blendARGB(color, -1, 0.2f));
            } else {
                storyCellGreyPaint[z ? 1 : 0].setColor(ColorUtils.blendARGB(color, -1, 0.44f));
            }
        }
    }

    private static void checkGrayPaint() {
        if (grayPaint == null) {
            Paint paint = new Paint(1);
            grayPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            grayPaint.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            grayPaint.setStrokeCap(Paint.Cap.ROUND);
        }
        int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        if (grayLastColor != color) {
            grayLastColor = color;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (!(computePerceivedBrightness < 0.721f)) {
                grayPaint.setColor(ColorUtils.blendARGB(color, -16777216, 0.2f));
            } else if (computePerceivedBrightness < 0.25f) {
                grayPaint.setColor(ColorUtils.blendARGB(color, -1, 0.2f));
            } else {
                grayPaint.setColor(ColorUtils.blendARGB(color, -1, 0.44f));
            }
        }
    }

    private static void drawCircleInternal(Canvas canvas, View view, AvatarStoryParams avatarStoryParams, Paint paint) {
        float f = avatarStoryParams.progressToArc;
        if (f == 0.0f) {
            RectF rectF = rectTmp;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
            return;
        }
        canvas.drawArc(rectTmp, (f / 2.0f) + 360.0f, 360.0f - f, false, paint);
    }

    private static void drawSegment(Canvas canvas, RectF rectF, Paint paint, float f, float f2, AvatarStoryParams avatarStoryParams) {
        boolean z = avatarStoryParams.isFirst;
        if (!z && !avatarStoryParams.isLast) {
            if (f < 90.0f) {
                float f3 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f3) / 2.0f, f3 / 2.0f);
                return;
            }
            float f4 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f4) / 2.0f) + 180.0f, (f4 / 2.0f) + 180.0f);
        } else if (avatarStoryParams.isLast) {
            float f5 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f5) / 2.0f) + 180.0f, (f5 / 2.0f) + 180.0f);
        } else if (z) {
            float f6 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f6) / 2.0f, f6 / 2.0f);
        } else {
            canvas.drawArc(rectF, f, f2 - f, false, paint);
        }
    }

    private static int getInset(int i, int i2) {
        if (i == 3) {
            i = i2;
        }
        if (i == 2) {
            return AndroidUtilities.dp(3.0f);
        }
        if (i == 1) {
            return AndroidUtilities.dp(4.0f);
        }
        return 0;
    }

    public static Paint getActiveCirclePaint(ImageReceiver imageReceiver, boolean z) {
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if (gradientToolsArr[z ? 1 : 0] == null) {
            gradientToolsArr[z ? 1 : 0] = new GradientTools();
            GradientTools[] gradientToolsArr2 = storiesGradientTools;
            gradientToolsArr2[z ? 1 : 0].isDiagonal = true;
            gradientToolsArr2[z ? 1 : 0].isRotate = true;
            if (z) {
                gradientToolsArr2[z ? 1 : 0].setColors(-11866795, -11680769);
            } else {
                gradientToolsArr2[z ? 1 : 0].setColors(-12984516, -11682817);
            }
            storiesGradientTools[z ? 1 : 0].paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            storiesGradientTools[z ? 1 : 0].paint.setStyle(Paint.Style.STROKE);
            storiesGradientTools[z ? 1 : 0].paint.setStrokeCap(Paint.Cap.ROUND);
        }
        storiesGradientTools[z ? 1 : 0].setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return storiesGradientTools[z ? 1 : 0].paint;
    }

    public static Paint getCloseFriendsPaint(ImageReceiver imageReceiver) {
        if (closeFriendsGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            closeFriendsGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(-3544264, -16137881);
            closeFriendsGradientTools.paint.setStrokeWidth(AndroidUtilities.dp(2.3f));
            closeFriendsGradientTools.paint.setStyle(Paint.Style.STROKE);
            closeFriendsGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        closeFriendsGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return closeFriendsGradientTools.paint;
    }

    public static void setStoryMiniImage(ImageReceiver imageReceiver, TLRPC$StoryItem tLRPC$StoryItem) {
        ArrayList<TLRPC$PhotoSize> arrayList;
        if (tLRPC$StoryItem == null) {
            return;
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$StoryItem.media;
        TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
        if (tLRPC$Document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 1000), tLRPC$StoryItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(tLRPC$StoryItem.media.document.thumbs), 0L, null, tLRPC$StoryItem, 0);
            return;
        }
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
        if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000), tLRPC$Photo), "100_100", null, null, ImageLoader.createStripedBitmap(tLRPC$Photo.sizes), 0L, null, tLRPC$StoryItem, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    public static void setImage(ImageReceiver imageReceiver, TLRPC$StoryItem tLRPC$StoryItem) {
        setImage(imageReceiver, tLRPC$StoryItem, "320_320");
    }

    public static void setImage(ImageReceiver imageReceiver, TLRPC$StoryItem tLRPC$StoryItem, String str) {
        ArrayList<TLRPC$PhotoSize> arrayList;
        TLRPC$Document tLRPC$Document;
        if (tLRPC$StoryItem == null) {
            return;
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$StoryItem.media;
        if (tLRPC$MessageMedia != null && (tLRPC$Document = tLRPC$MessageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID), tLRPC$StoryItem.media.document), str, null, null, ImageLoader.createStripedBitmap(tLRPC$StoryItem.media.document.thumbs), 0L, null, tLRPC$StoryItem, 0);
            return;
        }
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
            imageReceiver.setImageBitmap(createBitmap);
        } else if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), tLRPC$Photo), str, null, null, ImageLoader.createStripedBitmap(tLRPC$Photo.sizes), 0L, null, tLRPC$StoryItem, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    public static void setImage(ImageReceiver imageReceiver, StoriesController.UploadingStory uploadingStory) {
        if (uploadingStory.entry.isVideo) {
            imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.firstFramePath), "320_180", null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.path), "320_180", null, null, null, 0L, null, null, 0);
        }
    }

    public static void setThumbImage(ImageReceiver imageReceiver, TLRPC$StoryItem tLRPC$StoryItem, int i, int i2) {
        ArrayList<TLRPC$PhotoSize> arrayList;
        TLRPC$Document tLRPC$Document;
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$StoryItem.media;
        if (tLRPC$MessageMedia != null && (tLRPC$Document = tLRPC$MessageMedia.document) != null) {
            ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), tLRPC$StoryItem.media.document);
            imageReceiver.setImage(forDocument, i + "_" + i2, null, null, ImageLoader.createStripedBitmap(tLRPC$StoryItem.media.document.thumbs), 0L, null, tLRPC$StoryItem, 0);
            return;
        }
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
        if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
            ImageLocation forPhoto = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), tLRPC$Photo);
            imageReceiver.setImage(null, null, forPhoto, i + "_" + i2, null, null, ImageLoader.createStripedBitmap(tLRPC$Photo.sizes), 0L, null, tLRPC$StoryItem, 0);
            return;
        }
        imageReceiver.clearImage();
    }

    public static Drawable getExpiredStoryDrawable() {
        if (expiredStoryDrawable == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(ColorUtils.setAlphaComponent(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            expiredStoryDrawable = new BitmapDrawable(createBitmap);
        }
        return expiredStoryDrawable;
    }

    public static CharSequence getUploadingStr(TextView textView, boolean z, boolean z2) {
        String string;
        if (z2) {
            string = LocaleController.getString("StoryEditing", R.string.StoryEditing);
        } else {
            string = LocaleController.getString("UploadingStory", R.string.UploadingStory);
        }
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
            valueOf.setSpan(uploadingDotsSpannable, valueOf.length() - 1, valueOf.length(), 0);
            uploadingDotsSpannable.setParent(textView, z);
            return valueOf;
        }
        return string;
    }

    public static void applyUploadingStr(SimpleTextView simpleTextView, boolean z, boolean z2) {
        String string;
        if (z2) {
            string = LocaleController.getString("StoryEditing", R.string.StoryEditing);
        } else {
            string = LocaleController.getString("UploadingStory", R.string.UploadingStory);
        }
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
            valueOf.setSpan(uploadingDotsSpannable, valueOf.length() - 1, valueOf.length(), 0);
            uploadingDotsSpannable.setParent(simpleTextView, z);
            simpleTextView.setText(valueOf);
            return;
        }
        simpleTextView.setText(string);
    }

    public static CharSequence createExpiredStoryString() {
        return createExpiredStoryString(false, "ExpiredStory", R.string.ExpiredStory, new Object[0]);
    }

    public static CharSequence createExpiredStoryString(boolean z, String str, int i, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(str, i, objArr));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_bomb);
        if (z) {
            coloredImageSpan.setScale(0.8f);
        } else {
            coloredImageSpan.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static CharSequence createReplyStoryString() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString("Story", R.string.Story));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_replystory2), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static boolean hasExpiredViews(TLRPC$StoryItem tLRPC$StoryItem) {
        return tLRPC$StoryItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > tLRPC$StoryItem.expire_date + 86400;
    }

    public static void applyViewedUser(TLRPC$StoryItem tLRPC$StoryItem, TLRPC$User tLRPC$User) {
        if (tLRPC$User == null || tLRPC$StoryItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || hasExpiredViews(tLRPC$StoryItem)) {
            return;
        }
        if (tLRPC$StoryItem.views == null) {
            tLRPC$StoryItem.views = new TLRPC$TL_storyViews();
        }
        TLRPC$TL_storyViews tLRPC$TL_storyViews = tLRPC$StoryItem.views;
        if (tLRPC$TL_storyViews.views_count == 0) {
            tLRPC$TL_storyViews.views_count = 1;
            tLRPC$TL_storyViews.recent_viewers.add(Long.valueOf(tLRPC$User.id));
        }
    }

    public static void drawArcExcludeArc(Canvas canvas, RectF rectF, Paint paint, float f, float f2, float f3, float f4) {
        boolean z;
        float f5 = f2 - f;
        if (f >= f3 || f2 >= f3 + f5) {
            z = false;
        } else {
            z = true;
            canvas.drawArc(rectF, f, Math.min(f2, f3) - f, false, paint);
        }
        float max = Math.max(f, f4);
        float min = Math.min(f2, f3 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else if (z) {
        } else {
            if (f <= f3 || f2 >= f4) {
                canvas.drawArc(rectF, f, f5, false, paint);
            }
        }
    }

    public static boolean isExpired(int i, TLRPC$StoryItem tLRPC$StoryItem) {
        return ConnectionsManager.getInstance(i).getCurrentTime() > tLRPC$StoryItem.expire_date;
    }

    public static String getStoryImageFilter() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return max + "_" + max;
    }

    public static class AvatarStoryParams {
        public int animateFromUnreadState;
        ButtonBounce buttonBounce;
        public View child;
        public long crossfadeToDialog;
        public float crossfadeToDialogProgress;
        public int currentState;
        private long dialogId;
        public boolean drawHiddenStoriesAsSegments;
        public boolean forceAnimateProgressToSegments;
        float globalAngle;
        public int globalState;
        boolean inc;
        public boolean isArchive;
        public boolean isFirst;
        public boolean isLast;
        private final boolean isStoryCell;
        Runnable longPressRunnable;
        UserStoriesLoadOperation operation;
        boolean pressed;
        public int prevState;
        float startX;
        float startY;
        public int storyId;
        public TLRPC$StoryItem storyItem;
        float sweepAngle;
        public int unreadState;
        public boolean drawSegments = true;
        public boolean animate = true;
        public float progressToSegments = 1.0f;
        public float progressToArc = 0.0f;
        public float progressToSate = 1.0f;
        public boolean showProgress = false;
        public RectF originalAvatarRect = new RectF();
        public boolean allowLongress = false;

        public void onLongPress() {
        }

        public AvatarStoryParams(boolean z) {
            this.isStoryCell = z;
        }

        public void updateProgressParams() {
            if (this.inc) {
                float f = this.sweepAngle + 0.016f;
                this.sweepAngle = f;
                if (f >= 1.0f) {
                    this.sweepAngle = 1.0f;
                    this.inc = false;
                }
            } else {
                float f2 = this.sweepAngle - 0.016f;
                this.sweepAngle = f2;
                if (f2 < 0.0f) {
                    this.sweepAngle = 0.0f;
                    this.inc = true;
                }
            }
            this.globalAngle += 1.152f;
        }

        public boolean checkOnTouchEvent(MotionEvent motionEvent, final View view) {
            boolean z;
            this.child = view;
            StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            boolean z2 = false;
            if (motionEvent.getAction() == 0 && this.originalAvatarRect.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC$User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.dialogId));
                if (this.drawHiddenStoriesAsSegments) {
                    z = storiesController.hasHiddenStories();
                } else {
                    if (MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (user != null && !user.stories_unavailable && user.stories_max_id > 0)) {
                        z2 = true;
                    }
                    z = z2;
                }
                if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z) {
                    ButtonBounce buttonBounce = this.buttonBounce;
                    if (buttonBounce == null) {
                        this.buttonBounce = new ButtonBounce(view, 1.5f);
                    } else {
                        buttonBounce.setView(view);
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.buttonBounce.setPressed(true);
                    this.pressed = true;
                    this.startX = motionEvent.getX();
                    this.startY = motionEvent.getY();
                    if (this.allowLongress) {
                        Runnable runnable = this.longPressRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        Runnable runnable2 = new Runnable() {
                            @Override
                            public final void run() {
                                StoriesUtilities.AvatarStoryParams.this.lambda$checkOnTouchEvent$0(view);
                            }
                        };
                        this.longPressRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2, ViewConfiguration.getLongPressTimeout());
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.pressed) {
                if (Math.abs(this.startX - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.startY - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                    ButtonBounce buttonBounce2 = this.buttonBounce;
                    if (buttonBounce2 != null) {
                        buttonBounce2.setView(view);
                        this.buttonBounce.setPressed(false);
                    }
                    Runnable runnable3 = this.longPressRunnable;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    this.pressed = false;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                ButtonBounce buttonBounce3 = this.buttonBounce;
                if (buttonBounce3 != null) {
                    buttonBounce3.setView(view);
                    this.buttonBounce.setPressed(false);
                }
                if (this.pressed && motionEvent.getAction() == 1) {
                    processOpenStory(view);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                this.pressed = false;
                Runnable runnable4 = this.longPressRunnable;
                if (runnable4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable4);
                }
            }
            return this.pressed;
        }

        public void lambda$checkOnTouchEvent$0(View view) {
            view.performHapticFeedback(0);
            ButtonBounce buttonBounce = this.buttonBounce;
            if (buttonBounce != null) {
                buttonBounce.setPressed(false);
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.pressed = false;
            onLongPress();
        }

        private void processOpenStory(View view) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            StoriesController storiesController = messagesController.getStoriesController();
            if (this.drawHiddenStoriesAsSegments) {
                openStory(0L, null);
            } else if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                if (storiesController.hasStories(this.dialogId)) {
                    openStory(this.dialogId, null);
                    return;
                }
                TLRPC$User user = messagesController.getUser(Long.valueOf(this.dialogId));
                if (user == null || user.stories_unavailable || user.stories_max_id <= 0) {
                    return;
                }
                new UserStoriesLoadOperation().load(this.dialogId, view, this);
            }
        }

        public void openStory(long j, Runnable runnable) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || this.child == null) {
                return;
            }
            lastFragment.getOrCreateStoryViewer().doOnAnimationReady(runnable);
            lastFragment.getOrCreateStoryViewer().open(lastFragment.getContext(), j, StoriesListPlaceProvider.of((RecyclerListView) this.child.getParent()));
        }

        public float getScale() {
            ButtonBounce buttonBounce = this.buttonBounce;
            if (buttonBounce == null) {
                return 1.0f;
            }
            return buttonBounce.getScale(0.08f);
        }

        public void reset() {
            UserStoriesLoadOperation userStoriesLoadOperation = this.operation;
            if (userStoriesLoadOperation != null) {
                userStoriesLoadOperation.cancel();
                this.operation = null;
            }
            this.buttonBounce = null;
            this.pressed = false;
        }

        public void onDetachFromWindow() {
            reset();
        }
    }

    public static class UserStoriesLoadOperation {
        private int currentAccount;
        int reqId;

        public UserStoriesLoadOperation() {
            ConnectionsManager.generateClassGuid();
        }

        void load(final long j, final View view, final AvatarStoryParams avatarStoryParams) {
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            final MessagesController messagesController = MessagesController.getInstance(i);
            messagesController.getStoriesController().setLoading(j, true);
            view.invalidate();
            messagesController.getUser(Long.valueOf(j));
            TLRPC$TL_stories_getUserStories tLRPC$TL_stories_getUserStories = new TLRPC$TL_stories_getUserStories();
            tLRPC$TL_stories_getUserStories.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stories_getUserStories, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesUtilities.UserStoriesLoadOperation.this.lambda$load$3(j, view, avatarStoryParams, messagesController, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$load$3(final long j, final View view, final AvatarStoryParams avatarStoryParams, final MessagesController messagesController, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesUtilities.UserStoriesLoadOperation.this.lambda$load$2(tLObject, j, view, avatarStoryParams, messagesController);
                }
            });
        }

        public void lambda$load$2(org.telegram.tgnet.TLObject r10, final long r11, final android.view.View r13, final org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams r14, org.telegram.messenger.MessagesController r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesUtilities.UserStoriesLoadOperation.lambda$load$2(org.telegram.tgnet.TLObject, long, android.view.View, org.telegram.ui.Stories.StoriesUtilities$AvatarStoryParams, org.telegram.messenger.MessagesController):void");
        }

        public void lambda$load$1(final View view, final long j, AvatarStoryParams avatarStoryParams) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesUtilities.UserStoriesLoadOperation.this.lambda$load$0(view, j);
                }
            }, 500L);
            avatarStoryParams.openStory(j, null);
        }

        public void lambda$load$0(View view, long j) {
            view.invalidate();
            MessagesController.getInstance(this.currentAccount).getStoriesController().setLoading(j, false);
        }

        private void ensureStoryFileLoaded(TLRPC$TL_userStories tLRPC$TL_userStories, final Runnable runnable) {
            TLRPC$StoryItem tLRPC$StoryItem;
            ArrayList<TLRPC$PhotoSize> arrayList;
            TLRPC$Document tLRPC$Document;
            if (tLRPC$TL_userStories == null || tLRPC$TL_userStories.stories.isEmpty()) {
                runnable.run();
                return;
            }
            int i = MessagesController.getInstance(this.currentAccount).storiesController.dialogIdToMaxReadId.get(tLRPC$TL_userStories.user_id);
            int i2 = 0;
            while (true) {
                if (i2 >= tLRPC$TL_userStories.stories.size()) {
                    tLRPC$StoryItem = null;
                    break;
                } else if (tLRPC$TL_userStories.stories.get(i2).id > i) {
                    tLRPC$StoryItem = tLRPC$TL_userStories.stories.get(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (tLRPC$StoryItem == null) {
                tLRPC$StoryItem = tLRPC$TL_userStories.stories.get(0);
            }
            final Runnable[] runnableArr = {new Runnable() {
                @Override
                public final void run() {
                    StoriesUtilities.UserStoriesLoadOperation.lambda$ensureStoryFileLoaded$4(runnableArr, runnable);
                }
            }};
            AndroidUtilities.runOnUIThread(runnableArr[0], 1000L);
            ImageReceiver imageReceiver = new ImageReceiver(this) {
                @Override
                public boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                    boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i3, z, i4);
                    Runnable[] runnableArr2 = runnableArr;
                    if (runnableArr2[0] != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnableArr2[0]);
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            onDetachedFromWindow();
                        }
                    });
                    return imageBitmapByKey;
                }
            };
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver.onAttachedToWindow();
            String storyImageFilter = StoriesUtilities.getStoryImageFilter();
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$StoryItem.media;
            if (tLRPC$MessageMedia != null && (tLRPC$Document = tLRPC$MessageMedia.document) != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), storyImageFilter + "_pframe", null, null, null, 0L, null, tLRPC$StoryItem, 0);
                return;
            }
            TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
            if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), tLRPC$Photo), storyImageFilter, null, null, null, 0L, null, tLRPC$StoryItem, 0);
            } else {
                runnable.run();
            }
        }

        public static void lambda$ensureStoryFileLoaded$4(Runnable[] runnableArr, Runnable runnable) {
            runnableArr[0] = null;
            runnable.run();
        }

        void cancel() {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, false);
        }
    }
}
