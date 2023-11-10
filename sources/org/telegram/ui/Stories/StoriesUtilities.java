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
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DialogObject;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_stories$PeerStories;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$StoryViews;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getPeerStories;
import org.telegram.tgnet.tl.TL_stories$TL_storyViews;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesUtilities;
public class StoriesUtilities {
    public static GradientTools closeFriendsGradientTools;
    public static GradientTools errorGradientTools;
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

    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, boolean z, AvatarStoryParams avatarStoryParams) {
        int predictiveUnreadState;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        Paint paint;
        Paint paint2;
        Paint paint3;
        float dpf2;
        float f3;
        float dp;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        float dpf22;
        float f4;
        float dp2;
        GradientTools gradientTools;
        float dp3;
        StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z2 = avatarStoryParams.animate;
        if (avatarStoryParams.dialogId != j) {
            avatarStoryParams.dialogId = j;
            avatarStoryParams.reset();
            z2 = false;
        }
        boolean isLoading = storiesController.isLoading(j);
        boolean hasHiddenStories = avatarStoryParams.drawHiddenStoriesAsSegments ? storiesController.hasHiddenStories() : z;
        if (avatarStoryParams.storyItem != null) {
            storiesController.getUnreadState(j, avatarStoryParams.storyId);
            isLoading = false;
        }
        if (isLoading) {
            predictiveUnreadState = storiesController.hasStories(j) ? 2 : getPredictiveUnreadState(storiesController, j);
            i = 3;
            z2 = false;
        } else if (hasHiddenStories) {
            if (avatarStoryParams.drawSegments) {
                predictiveUnreadState = 2;
            } else {
                predictiveUnreadState = storiesController.getUnreadState(j, avatarStoryParams.storyId);
                if (predictiveUnreadState != 0) {
                    i = 1;
                }
            }
            i = 2;
        } else {
            predictiveUnreadState = getPredictiveUnreadState(storiesController, j);
            i = predictiveUnreadState;
        }
        int i4 = avatarStoryParams.currentState;
        if (i4 != i) {
            if (i4 == 3) {
                z2 = true;
            }
            if (i == 3) {
                avatarStoryParams.animateFromUnreadState = predictiveUnreadState;
                avatarStoryParams.progressToProgressSegments = 0.0f;
            }
            if (z2) {
                avatarStoryParams.prevState = i4;
                avatarStoryParams.currentState = i;
                avatarStoryParams.progressToSate = 0.0f;
            } else {
                avatarStoryParams.currentState = i;
                avatarStoryParams.progressToSate = 1.0f;
            }
        }
        avatarStoryParams.unreadState = predictiveUnreadState;
        ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
        float scale = buttonBounce != null ? buttonBounce.getScale(0.08f) : 1.0f;
        if (avatarStoryParams.showProgress != isLoading && isLoading) {
            avatarStoryParams.sweepAngle = 1.0f;
            avatarStoryParams.inc = false;
        }
        avatarStoryParams.showProgress = isLoading;
        if (avatarStoryParams.currentState == 0 && avatarStoryParams.progressToSate == 1.0f) {
            imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
            imageReceiver.draw(canvas);
            return;
        }
        if (scale != 1.0f) {
            int save = canvas.save();
            canvas.scale(scale, scale, avatarStoryParams.originalAvatarRect.centerX(), avatarStoryParams.originalAvatarRect.centerY());
            i2 = save;
        } else {
            i2 = 0;
        }
        float f5 = avatarStoryParams.progressToSate;
        if (f5 != 1.0f) {
            f5 = CubicBezierInterpolator.DEFAULT.getInterpolation(f5);
        }
        float f6 = f5;
        float lerp = (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) ? AndroidUtilities.lerp(getInset(avatarStoryParams.prevState, avatarStoryParams.animateFromUnreadState), getInset(avatarStoryParams.currentState, avatarStoryParams.animateFromUnreadState), avatarStoryParams.progressToSate) : 0.0f;
        if (lerp == 0.0f) {
            imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
        } else {
            RectF rectF = rectTmp;
            rectF.set(avatarStoryParams.originalAvatarRect);
            rectF.inset(lerp, lerp);
            imageReceiver.setImageCoords(rectF);
        }
        if ((avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != 1.0f) || avatarStoryParams.currentState == 1) {
            if (predictiveUnreadState == 2) {
                getCloseFriendsPaint(imageReceiver);
                gradientTools = closeFriendsGradientTools;
            } else {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                gradientTools = storiesGradientTools[avatarStoryParams.isStoryCell ? 1 : 0];
            }
            boolean z3 = avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != 1.0f;
            float f7 = (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z3) {
                dp3 = f7 + (AndroidUtilities.dp(5.0f) * f6);
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (1.0f - f6)));
            } else {
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f6));
                dp3 = f7 + (AndroidUtilities.dp(5.0f) * (1.0f - f6));
            }
            RectF rectF2 = rectTmp;
            rectF2.set(avatarStoryParams.originalAvatarRect);
            rectF2.inset(dp3, dp3);
            drawCircleInternal(canvas, imageReceiver.getParentView(), avatarStoryParams, gradientTools.paint);
        }
        int i5 = avatarStoryParams.prevState;
        if ((i5 != 2 || avatarStoryParams.progressToSate == 1.0f) && avatarStoryParams.currentState != 2) {
            i3 = i2;
            f = 1.0f;
            f2 = 0.08f;
        } else {
            boolean z4 = i5 == 2 && avatarStoryParams.progressToSate != 1.0f;
            if (avatarStoryParams.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams.isArchive, avatarStoryParams.resourcesProvider);
                paint4 = storyCellGreyPaint[avatarStoryParams.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint4 = grayPaint;
            }
            Paint paint7 = paint4;
            if (avatarStoryParams.drawSegments) {
                Paint unreadCirclePaint = getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                unreadCirclePaint.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint closeFriendsPaint = getCloseFriendsPaint(imageReceiver);
                closeFriendsPaint.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint5 = unreadCirclePaint;
                paint6 = closeFriendsPaint;
            } else {
                paint5 = null;
                paint6 = null;
            }
            if (avatarStoryParams.drawSegments) {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf22 = AndroidUtilities.dpf2(3.5f);
                    f4 = -dpf22;
                }
                f4 = 0.0f;
            } else {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf22 = AndroidUtilities.dpf2(2.7f);
                    f4 = -dpf22;
                }
                f4 = 0.0f;
            }
            if (z4) {
                dp2 = f4 + (AndroidUtilities.dp(5.0f) * f6);
                paint7.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (1.0f - f6)));
            } else {
                paint7.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f6));
                dp2 = f4 + (AndroidUtilities.dp(5.0f) * (1.0f - f6));
            }
            RectF rectF3 = rectTmp;
            rectF3.set(avatarStoryParams.originalAvatarRect);
            rectF3.inset(dp2, dp2);
            if (avatarStoryParams.drawSegments) {
                i3 = i2;
                f2 = 0.08f;
                f = 1.0f;
                drawSegmentsInternal(canvas, storiesController, imageReceiver, avatarStoryParams, paint7, paint5, paint6);
            } else {
                i3 = i2;
                f = 1.0f;
                f2 = 0.08f;
                drawCircleInternal(canvas, imageReceiver.getParentView(), avatarStoryParams, paint7);
            }
        }
        if ((avatarStoryParams.prevState == 3 && avatarStoryParams.progressToSate != f) || avatarStoryParams.currentState == 3) {
            if (avatarStoryParams.animateFromUnreadState == 1) {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                paint = storiesGradientTools[avatarStoryParams.isStoryCell ? 1 : 0].paint;
            } else if (avatarStoryParams.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams.isArchive, avatarStoryParams.resourcesProvider);
                paint = storyCellGreyPaint[avatarStoryParams.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint = grayPaint;
            }
            Paint paint8 = paint;
            paint8.setAlpha((int) (f6 * 255.0f));
            if (avatarStoryParams.drawSegments) {
                Paint unreadCirclePaint2 = getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                unreadCirclePaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint closeFriendsPaint2 = getCloseFriendsPaint(imageReceiver);
                closeFriendsPaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint2 = unreadCirclePaint2;
                paint3 = closeFriendsPaint2;
            } else {
                paint2 = null;
                paint3 = null;
            }
            if (avatarStoryParams.drawSegments) {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf2 = AndroidUtilities.dpf2(3.5f);
                    f3 = -dpf2;
                }
                f3 = 0.0f;
            } else {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf2 = AndroidUtilities.dpf2(2.7f);
                    f3 = -dpf2;
                }
                f3 = 0.0f;
            }
            if (avatarStoryParams.prevState == 3 && avatarStoryParams.progressToSate != f) {
                dp = f3 + (AndroidUtilities.dp(7.0f) * f6);
                paint8.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (f - f6)));
            } else {
                paint8.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f6));
                dp = f3 + (AndroidUtilities.dp(5.0f) * (f - f6));
            }
            RectF rectF4 = rectTmp;
            rectF4.set(avatarStoryParams.originalAvatarRect);
            rectF4.inset(dp, dp);
            boolean z5 = avatarStoryParams.drawSegments;
            if (z5 && avatarStoryParams.currentState == 3) {
                float f8 = avatarStoryParams.progressToProgressSegments;
                if (f8 != f) {
                    float f9 = f8 + f2;
                    avatarStoryParams.progressToProgressSegments = f9;
                    if (f9 > f) {
                        avatarStoryParams.progressToProgressSegments = f;
                    }
                    float f10 = avatarStoryParams.progressToSegments;
                    avatarStoryParams.progressToSegments = f - avatarStoryParams.progressToProgressSegments;
                    drawSegmentsInternal(canvas, storiesController, imageReceiver, avatarStoryParams, paint8, paint2, paint3);
                    avatarStoryParams.progressToSegments = f10;
                    if (imageReceiver.getParentView() != null) {
                        imageReceiver.invalidate();
                        imageReceiver.getParentView().invalidate();
                    }
                }
            }
            if (z5) {
                int unreadState = storiesController.getUnreadState(avatarStoryParams.dialogId);
                if (unreadState == 2) {
                    paint8 = paint3;
                } else if (unreadState == 1) {
                    paint8 = paint2;
                }
            }
            drawProgress(canvas, avatarStoryParams, imageReceiver.getParentView(), paint8);
        }
        imageReceiver.draw(canvas);
        float f11 = avatarStoryParams.progressToSate;
        if (f11 != f) {
            float f12 = f11 + (AndroidUtilities.screenRefreshTime / 250.0f);
            avatarStoryParams.progressToSate = f12;
            if (f12 > f) {
                avatarStoryParams.progressToSate = f;
            }
            if (imageReceiver.getParentView() != null) {
                imageReceiver.invalidate();
                imageReceiver.getParentView().invalidate();
            }
        }
        if (i3 != 0) {
            canvas.restoreToCount(i3);
        }
    }

    private static void drawSegmentsInternal(android.graphics.Canvas r23, org.telegram.ui.Stories.StoriesController r24, org.telegram.messenger.ImageReceiver r25, org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesUtilities.drawSegmentsInternal(android.graphics.Canvas, org.telegram.ui.Stories.StoriesController, org.telegram.messenger.ImageReceiver, org.telegram.ui.Stories.StoriesUtilities$AvatarStoryParams, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint):void");
    }

    public static int getPredictiveUnreadState(StoriesController storiesController, long j) {
        if (j == 0) {
            return 0;
        }
        if (j > 0) {
            TLRPC$User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
            if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || user.stories_max_id <= 0 || user.stories_unavailable) {
                return 0;
            }
            return user.stories_max_id > storiesController.dialogIdToMaxReadId.get(j, 0) ? 1 : 2;
        }
        TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        if (chat == null || chat.stories_max_id <= 0 || chat.stories_unavailable) {
            return 0;
        }
        return chat.stories_max_id > storiesController.dialogIdToMaxReadId.get(j, 0) ? 1 : 2;
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

    private static void checkStoryCellGrayPaint(boolean z, Theme.ResourcesProvider resourcesProvider) {
        Paint[] paintArr = storyCellGreyPaint;
        if (paintArr[z ? 1 : 0] == null) {
            paintArr[z ? 1 : 0] = new Paint(1);
            storyCellGreyPaint[z ? 1 : 0].setStyle(Paint.Style.STROKE);
            storyCellGreyPaint[z ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            storyCellGreyPaint[z ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int color = Theme.getColor(!z ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived, resourcesProvider);
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

    private static void checkGrayPaint(Theme.ResourcesProvider resourcesProvider) {
        if (grayPaint == null) {
            Paint paint = new Paint(1);
            grayPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            grayPaint.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            grayPaint.setStrokeCap(Paint.Cap.ROUND);
        }
        int color = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
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

    public static Paint getUnreadCirclePaint(ImageReceiver imageReceiver, boolean z) {
        checkStoriesGradientTools(z);
        storiesGradientTools[z ? 1 : 0].setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return storiesGradientTools[z ? 1 : 0].paint;
    }

    public static Paint getUnreadCirclePaint(RectF rectF, boolean z) {
        checkStoriesGradientTools(z);
        storiesGradientTools[z ? 1 : 0].setBounds(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return storiesGradientTools[z ? 1 : 0].paint;
    }

    private static void checkStoriesGradientTools(boolean z) {
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if (gradientToolsArr[z ? 1 : 0] == null) {
            gradientToolsArr[z ? 1 : 0] = new GradientTools();
            GradientTools[] gradientToolsArr2 = storiesGradientTools;
            gradientToolsArr2[z ? 1 : 0].isDiagonal = true;
            gradientToolsArr2[z ? 1 : 0].isRotate = true;
            if (z) {
                gradientToolsArr2[z ? 1 : 0].setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2));
            } else {
                gradientToolsArr2[z ? 1 : 0].setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2));
            }
            storiesGradientTools[z ? 1 : 0].paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            storiesGradientTools[z ? 1 : 0].paint.setStyle(Paint.Style.STROKE);
            storiesGradientTools[z ? 1 : 0].paint.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    public static void updateColors() {
        GradientTools gradientTools = closeFriendsGradientTools;
        if (gradientTools != null) {
            gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_closeFriends1), Theme.getColor(Theme.key_stories_circle_closeFriends2));
        }
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if (gradientToolsArr[0] != null) {
            gradientToolsArr[0].setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2));
        }
        GradientTools[] gradientToolsArr2 = storiesGradientTools;
        if (gradientToolsArr2[1] != null) {
            gradientToolsArr2[1].setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2));
        }
        if (errorGradientTools != null) {
            int color = Theme.getColor(Theme.key_color_orange);
            int color2 = Theme.getColor(Theme.key_text_RedBold);
            errorGradientTools.setColors(ColorUtils.blendARGB(color, color2, 0.25f), color2);
        }
    }

    public static Paint getCloseFriendsPaint(ImageReceiver imageReceiver) {
        if (closeFriendsGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            closeFriendsGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_closeFriends1), Theme.getColor(Theme.key_stories_circle_closeFriends2));
            closeFriendsGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            closeFriendsGradientTools.paint.setStyle(Paint.Style.STROKE);
            closeFriendsGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        closeFriendsGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return closeFriendsGradientTools.paint;
    }

    public static Paint getErrorPaint(ImageReceiver imageReceiver) {
        if (errorGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            errorGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            int color = Theme.getColor(Theme.key_color_orange);
            int color2 = Theme.getColor(Theme.key_text_RedBold);
            errorGradientTools.setColors(ColorUtils.blendARGB(color, color2, 0.25f), color2);
            errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            errorGradientTools.paint.setStyle(Paint.Style.STROKE);
            errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        errorGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return errorGradientTools.paint;
    }

    public static Paint getErrorPaint(RectF rectF) {
        if (errorGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            errorGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            int color = Theme.getColor(Theme.key_color_orange);
            int color2 = Theme.getColor(Theme.key_text_RedBold);
            errorGradientTools.setColors(ColorUtils.blendARGB(color, color2, 0.25f), color2);
            errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            errorGradientTools.paint.setStyle(Paint.Style.STROKE);
            errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        errorGradientTools.setBounds(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return errorGradientTools.paint;
    }

    public static void setStoryMiniImage(ImageReceiver imageReceiver, TL_stories$StoryItem tL_stories$StoryItem) {
        ArrayList<TLRPC$PhotoSize> arrayList;
        if (tL_stories$StoryItem == null) {
            return;
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
        TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
        if (tLRPC$Document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 1000), tL_stories$StoryItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(tL_stories$StoryItem.media.document.thumbs), 0L, null, tL_stories$StoryItem, 0);
            return;
        }
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
        if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000), tLRPC$Photo), "100_100", null, null, ImageLoader.createStripedBitmap(tLRPC$Photo.sizes), 0L, null, tL_stories$StoryItem, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    public static void setImage(ImageReceiver imageReceiver, TL_stories$StoryItem tL_stories$StoryItem) {
        setImage(imageReceiver, tL_stories$StoryItem, "320_320");
    }

    public static void setImage(ImageReceiver imageReceiver, TL_stories$StoryItem tL_stories$StoryItem, String str) {
        ArrayList<TLRPC$PhotoSize> arrayList;
        TLRPC$Document tLRPC$Document;
        if (tL_stories$StoryItem == null) {
            return;
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
        if (tLRPC$MessageMedia != null && (tLRPC$Document = tLRPC$MessageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID), tL_stories$StoryItem.media.document), str, null, null, ImageLoader.createStripedBitmap(tL_stories$StoryItem.media.document.thumbs), 0L, null, tL_stories$StoryItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(tL_stories$StoryItem));
            return;
        }
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(tL_stories$StoryItem));
        } else if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), tLRPC$Photo), str, null, null, ImageLoader.createStripedBitmap(tLRPC$Photo.sizes), 0L, null, tL_stories$StoryItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(tL_stories$StoryItem));
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

    public static void setThumbImage(ImageReceiver imageReceiver, TL_stories$StoryItem tL_stories$StoryItem, int i, int i2) {
        ArrayList<TLRPC$PhotoSize> arrayList;
        TLRPC$Document tLRPC$Document;
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
        if (tLRPC$MessageMedia != null && (tLRPC$Document = tLRPC$MessageMedia.document) != null) {
            ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), tL_stories$StoryItem.media.document);
            imageReceiver.setImage(forDocument, i + "_" + i2, null, null, ImageLoader.createStripedBitmap(tL_stories$StoryItem.media.document.thumbs), 0L, null, tL_stories$StoryItem, 0);
            return;
        }
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
        if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
            ImageLocation forPhoto = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), tLRPC$Photo);
            imageReceiver.setImage(null, null, forPhoto, i + "_" + i2, null, null, ImageLoader.createStripedBitmap(tLRPC$Photo.sizes), 0L, null, tL_stories$StoryItem, 0);
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
            coloredImageSpan.setScale(0.8f, 0.8f);
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

    public static boolean hasExpiredViews(TL_stories$StoryItem tL_stories$StoryItem) {
        return tL_stories$StoryItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > tL_stories$StoryItem.expire_date + 86400;
    }

    public static void applyViewedUser(TL_stories$StoryItem tL_stories$StoryItem, TLRPC$User tLRPC$User) {
        if (tLRPC$User == null || tL_stories$StoryItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || hasExpiredViews(tL_stories$StoryItem)) {
            return;
        }
        if (tL_stories$StoryItem.views == null) {
            tL_stories$StoryItem.views = new TL_stories$TL_storyViews();
        }
        TL_stories$StoryViews tL_stories$StoryViews = tL_stories$StoryItem.views;
        if (tL_stories$StoryViews.views_count == 0) {
            tL_stories$StoryViews.views_count = 1;
            tL_stories$StoryViews.recent_viewers.add(Long.valueOf(tLRPC$User.id));
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

    public static boolean isExpired(int i, TL_stories$StoryItem tL_stories$StoryItem) {
        return ConnectionsManager.getInstance(i).getCurrentTime() > tL_stories$StoryItem.expire_date;
    }

    public static String getStoryImageFilter() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return max + "_" + max;
    }

    public static class EnsureStoryFileLoadedObject {
        private boolean cancelled;
        long dialogId;
        ImageReceiver imageReceiver;
        public Runnable runnable;
        StoriesController storiesController;

        private EnsureStoryFileLoadedObject(StoriesController storiesController, long j) {
            this.cancelled = false;
            this.dialogId = j;
            this.storiesController = storiesController;
        }

        public void cancel() {
            this.cancelled = true;
            this.storiesController.setLoading(this.dialogId, false);
        }
    }

    public static EnsureStoryFileLoadedObject ensureStoryFileLoaded(TL_stories$PeerStories tL_stories$PeerStories, final Runnable runnable) {
        TL_stories$StoryItem tL_stories$StoryItem;
        ArrayList<TLRPC$PhotoSize> arrayList;
        ArrayList<TLRPC$PhotoSize> arrayList2;
        TLRPC$Document tLRPC$Document;
        int lastIndexOf;
        if (tL_stories$PeerStories == null || tL_stories$PeerStories.stories.isEmpty() || DialogObject.getPeerDialogId(tL_stories$PeerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i = storiesController.dialogIdToMaxReadId.get(DialogObject.getPeerDialogId(tL_stories$PeerStories.peer));
        int i2 = 0;
        while (true) {
            if (i2 >= tL_stories$PeerStories.stories.size()) {
                tL_stories$StoryItem = null;
                break;
            } else if (tL_stories$PeerStories.stories.get(i2).id > i) {
                tL_stories$StoryItem = tL_stories$PeerStories.stories.get(i2);
                break;
            } else {
                i2++;
            }
        }
        if (tL_stories$StoryItem == null) {
            tL_stories$StoryItem = tL_stories$PeerStories.stories.get(0);
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
        if (tLRPC$MessageMedia != null && tLRPC$MessageMedia.document != null) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_stories$StoryItem.media.document, BuildConfig.APP_CENTER_HASH, false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_stories$StoryItem.media.document, BuildConfig.APP_CENTER_HASH, true);
            if (pathToAttach2 != null) {
                try {
                    if (pathToAttach2.getName().lastIndexOf(".") > 0) {
                        File file = new File(pathToAttach2.getParentFile(), pathToAttach2.getName().substring(0, lastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.photo : null;
            if (tLRPC$Photo != null && (arrayList = tLRPC$Photo.sizes) != null) {
                File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), BuildConfig.APP_CENTER_HASH, false);
                if (pathToAttach3 != null && pathToAttach3.exists()) {
                    runnable.run();
                    return null;
                }
            } else {
                runnable.run();
                return null;
            }
        }
        final EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = new EnsureStoryFileLoadedObject(storiesController, DialogObject.getPeerDialogId(tL_stories$PeerStories.peer));
        ensureStoryFileLoadedObject.runnable = new Runnable() {
            @Override
            public final void run() {
                StoriesUtilities.lambda$ensureStoryFileLoaded$0(StoriesUtilities.EnsureStoryFileLoadedObject.this, runnable);
            }
        };
        final Runnable[] runnableArr = {new Runnable() {
            @Override
            public final void run() {
                StoriesUtilities.lambda$ensureStoryFileLoaded$1(runnableArr, ensureStoryFileLoadedObject);
            }
        }};
        AndroidUtilities.runOnUIThread(runnableArr[0], 3000L);
        ImageReceiver imageReceiver = new ImageReceiver() {
            @Override
            public boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i3, z, i4);
                Runnable[] runnableArr2 = runnableArr;
                if (runnableArr2[0] != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr2[0]);
                    ensureStoryFileLoadedObject.runnable.run();
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
        ensureStoryFileLoadedObject.imageReceiver = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        ensureStoryFileLoadedObject.imageReceiver.onAttachedToWindow();
        String storyImageFilter = getStoryImageFilter();
        TLRPC$MessageMedia tLRPC$MessageMedia2 = tL_stories$StoryItem.media;
        if (tLRPC$MessageMedia2 != null && (tLRPC$Document = tLRPC$MessageMedia2.document) != null) {
            ensureStoryFileLoadedObject.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), storyImageFilter + "_pframe", null, null, null, 0L, null, tL_stories$StoryItem, 0);
            return ensureStoryFileLoadedObject;
        }
        TLRPC$Photo tLRPC$Photo2 = tLRPC$MessageMedia2 != null ? tLRPC$MessageMedia2.photo : null;
        if (tLRPC$Photo2 != null && (arrayList2 = tLRPC$Photo2.sizes) != null) {
            ensureStoryFileLoadedObject.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID), tLRPC$Photo2), storyImageFilter, null, null, null, 0L, null, tL_stories$StoryItem, 0);
            return ensureStoryFileLoadedObject;
        }
        ensureStoryFileLoadedObject.runnable.run();
        return null;
    }

    public static void lambda$ensureStoryFileLoaded$0(EnsureStoryFileLoadedObject ensureStoryFileLoadedObject, Runnable runnable) {
        if (ensureStoryFileLoadedObject.cancelled) {
            return;
        }
        runnable.run();
    }

    public static void lambda$ensureStoryFileLoaded$1(Runnable[] runnableArr, EnsureStoryFileLoadedObject ensureStoryFileLoadedObject) {
        runnableArr[0] = null;
        ensureStoryFileLoadedObject.runnable.run();
        ImageReceiver imageReceiver = ensureStoryFileLoadedObject.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    public static class AvatarStoryParams {
        public boolean allowLongress;
        public float alpha;
        public boolean animate;
        public int animateFromUnreadState;
        ButtonBounce buttonBounce;
        public View child;
        public long crossfadeToDialog;
        public float crossfadeToDialogProgress;
        public int currentState;
        private long dialogId;
        public boolean drawHiddenStoriesAsSegments;
        public boolean drawInside;
        public boolean drawSegments;
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
        public RectF originalAvatarRect;
        boolean pressed;
        public int prevState;
        public float progressToArc;
        public float progressToProgressSegments;
        public float progressToSate;
        public float progressToSegments;
        public Theme.ResourcesProvider resourcesProvider;
        public boolean showProgress;
        float startX;
        float startY;
        public int storyId;
        public TL_stories$StoryItem storyItem;
        float sweepAngle;
        public int unreadState;

        public void onLongPress() {
        }

        public AvatarStoryParams(boolean z) {
            this(z, null);
        }

        public AvatarStoryParams(boolean z, Theme.ResourcesProvider resourcesProvider) {
            this.drawSegments = true;
            this.animate = true;
            this.progressToSegments = 1.0f;
            this.progressToArc = 0.0f;
            this.alpha = 1.0f;
            this.progressToSate = 1.0f;
            this.showProgress = false;
            this.originalAvatarRect = new RectF();
            this.allowLongress = false;
            this.isStoryCell = z;
            this.resourcesProvider = resourcesProvider;
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
            TLRPC$User tLRPC$User;
            boolean z;
            this.child = view;
            StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            boolean z2 = false;
            if (motionEvent.getAction() == 0 && this.originalAvatarRect.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC$Chat tLRPC$Chat = null;
                if (this.dialogId > 0) {
                    tLRPC$User = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.dialogId));
                } else {
                    tLRPC$User = null;
                    tLRPC$Chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.dialogId));
                }
                if (this.drawHiddenStoriesAsSegments) {
                    z = storiesController.hasHiddenStories();
                } else {
                    if (this.dialogId <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (tLRPC$Chat != null && !tLRPC$Chat.stories_unavailable && tLRPC$Chat.stories_max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (tLRPC$User != null && !tLRPC$User.stories_unavailable && tLRPC$User.stories_max_id > 0)) {
                        z2 = true;
                    }
                    z = z2;
                }
                if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z) {
                    ButtonBounce buttonBounce = this.buttonBounce;
                    if (buttonBounce == null) {
                        this.buttonBounce = new ButtonBounce(view, 1.5f, 5.0f);
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
                long j = this.dialogId;
                if (j > 0) {
                    TLRPC$User user = messagesController.getUser(Long.valueOf(j));
                    if (user == null || user.stories_unavailable || user.stories_max_id <= 0) {
                        return;
                    }
                    new UserStoriesLoadOperation().load(this.dialogId, view, this);
                    return;
                }
                TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-j));
                if (chat == null || chat.stories_unavailable || chat.stories_max_id <= 0) {
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
            ViewParent parent = this.child.getParent();
            lastFragment.getOrCreateStoryViewer().open(lastFragment.getContext(), j, parent instanceof RecyclerView ? StoriesListPlaceProvider.of((RecyclerListView) parent) : null);
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
            TL_stories$TL_stories_getPeerStories tL_stories$TL_stories_getPeerStories = new TL_stories$TL_stories_getPeerStories();
            tL_stories$TL_stories_getPeerStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_getPeerStories, new RequestDelegate() {
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

        void cancel() {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, false);
        }
    }
}
