package org.telegram.ui.Stories;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
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
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.PhotoUtilities$$ExternalSyntheticLambda2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Shaker$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;

public abstract class StoriesUtilities {
    public static GradientTools closeFriendsGradientTools;
    public static GradientTools errorGradientTools;
    public static BitmapDrawable expiredStoryDrawable;
    public static int grayLastColor;
    public static Paint grayPaint;
    public static Paint liveCutPaint;
    public static GradientTools liveGradientTools;
    public static Paint livePaint;
    public static RectF liveRect;
    public static Text liveText;
    public static final GradientTools[] storiesGradientTools = new GradientTools[2];
    public static final Paint[] storyCellGreyPaint = new Paint[2];
    public static final int[] storyCellGrayLastColor = new int[2];
    public static final RectF rectTmp = new RectF();
    public static final Theme.AnonymousClass1 debugRunnable = new Theme.AnonymousClass1(5);
    public static final RectF forumRect = new RectF();
    public static final Path forumRoundRectPath = new Path();
    public static final Matrix forumRoundRectMatrix = new Matrix();
    public static final PathMeasure forumRoundRectPathMeasure = new PathMeasure();
    public static final Path forumSegmentPath = new Path();

    public class AvatarStoryParams {
        public float additionalInset;
        public int animateFromUnreadState;
        public ButtonBounce buttonBounce;
        public View child;
        public long crossfadeToDialog;
        public int currentState;
        public long dialogId;
        public boolean drawHiddenStoriesAsSegments;
        public boolean drawInside;
        public boolean drawnLive;
        public boolean forceAnimateProgressToSegments;
        public int forceState;
        public float globalAngle;
        public int globalState;
        public boolean inc;
        public boolean isArchive;
        public boolean isDialogStoriesCell;
        public boolean isFirst;
        public boolean isLast;
        public final boolean isStoryCell;
        public StoryViewer$5$$ExternalSyntheticLambda0 longPressRunnable;
        public boolean pressed;
        public int prevState;
        public float progressToProgressSegments;
        public Theme.ResourcesProvider resourcesProvider;
        public float startX;
        public float startY;
        public int storyId;
        public TL_stories.StoryItem storyItem;
        public float sweepAngle;
        public boolean drawSegments = true;
        public boolean animate = true;
        public float progressToSegments = 1.0f;
        public float progressToArc = 0.0f;
        public float rightTopAngleToExclude = 0.0f;
        public float rightBottomAngleToExclude = 0.0f;
        public float leftTopAngleToExclude = 0.0f;
        public float leftBottomAngleToExclude = 0.0f;
        public boolean useArcProgress = true;
        public float alpha = 1.0f;
        public float progressToSate = 1.0f;
        public boolean showProgress = false;
        public final RectF originalAvatarRect = new RectF();
        public boolean allowLongress = false;

        public AvatarStoryParams(Theme.ResourcesProvider resourcesProvider, boolean z) {
            this.isStoryCell = z;
            this.resourcesProvider = resourcesProvider;
        }

        public final boolean checkOnTouchEvent(MotionEvent motionEvent, View view) {
            TLRPC.TL_recentStory tL_recentStory;
            TLRPC.TL_recentStory tL_recentStory2;
            TLRPC.User user;
            TLRPC.TL_recentStory tL_recentStory3;
            TLRPC.TL_recentStory tL_recentStory4;
            this.child = view;
            StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            boolean z = false;
            if (motionEvent.getAction() == 0 && this.originalAvatarRect.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.dialogId > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.dialogId));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.dialogId));
                }
                if (isAvatarClickable(chat, user)) {
                    z = true;
                } else if (this.drawHiddenStoriesAsSegments) {
                    z = !storiesController.hiddenListStories.isEmpty();
                } else if (this.dialogId <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                    z = true;
                }
                if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z) {
                    ButtonBounce buttonBounce = this.buttonBounce;
                    if (buttonBounce == null) {
                        this.buttonBounce = new ButtonBounce(view, 1.5f, 5.0f);
                    } else {
                        buttonBounce.view = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.buttonBounce.setPressed(true);
                    this.pressed = true;
                    this.startX = motionEvent.getX();
                    this.startY = motionEvent.getY();
                    if (this.allowLongress) {
                        StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0 = this.longPressRunnable;
                        if (storyViewer$5$$ExternalSyntheticLambda0 != null) {
                            AndroidUtilities.cancelRunOnUIThread(storyViewer$5$$ExternalSyntheticLambda0);
                        }
                        StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda1 = new StoryViewer$5$$ExternalSyntheticLambda0(11, this, view);
                        this.longPressRunnable = storyViewer$5$$ExternalSyntheticLambda1;
                        AndroidUtilities.runOnUIThread(storyViewer$5$$ExternalSyntheticLambda1, ViewConfiguration.getLongPressTimeout());
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.pressed) {
                if (Math.abs(this.startX - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.startY - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                    ButtonBounce buttonBounce2 = this.buttonBounce;
                    if (buttonBounce2 != null) {
                        buttonBounce2.view = view;
                        buttonBounce2.setPressed(false);
                    }
                    StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda2 = this.longPressRunnable;
                    if (storyViewer$5$$ExternalSyntheticLambda2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(storyViewer$5$$ExternalSyntheticLambda2);
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    this.pressed = false;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                ButtonBounce buttonBounce3 = this.buttonBounce;
                if (buttonBounce3 != null) {
                    buttonBounce3.view = view;
                    buttonBounce3.setPressed(false);
                }
                if (this.pressed && motionEvent.getAction() == 1 && !onAvatarClick(this.dialogId)) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    StoriesController storiesController2 = messagesController.getStoriesController();
                    if (this.drawHiddenStoriesAsSegments) {
                        openStory(0L);
                    } else if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                        if (storiesController2.hasStories(this.dialogId)) {
                            openStory(this.dialogId);
                        } else {
                            long j = this.dialogId;
                            if (j > 0) {
                                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j));
                                if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                    new UserStoriesLoadOperation().load(view, this.dialogId, this);
                                }
                            } else {
                                TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j));
                                if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                    new UserStoriesLoadOperation().load(view, this.dialogId, this);
                                }
                            }
                        }
                    }
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                this.pressed = false;
                StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda3 = this.longPressRunnable;
                if (storyViewer$5$$ExternalSyntheticLambda3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(storyViewer$5$$ExternalSyntheticLambda3);
                }
            }
            return this.pressed;
        }

        public boolean isAvatarClickable(TLRPC.Chat chat, TLRPC.User user) {
            return false;
        }

        public boolean onAvatarClick(long j) {
            return false;
        }

        public void onLongPress() {
        }

        public void openStory(long j) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || this.child == null) {
                return;
            }
            lastFragment.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.child.getParent();
            lastFragment.getOrCreateStoryViewer().open(lastFragment.getContext(), j, parent instanceof RecyclerView ? new StoriesListPlaceProvider((RecyclerListView) parent, false) : null);
        }

        public final void reset() {
            this.buttonBounce = null;
            this.pressed = false;
        }
    }

    public final class EnsureStoryFileLoadedObject {
        public boolean cancelled = false;
        public final long dialogId;
        public AnonymousClass2 imageReceiver;
        public StoryViewer$5$$ExternalSyntheticLambda0 runnable;
        public final StoriesController storiesController;

        public EnsureStoryFileLoadedObject(StoriesController storiesController, long j) {
            this.dialogId = j;
            this.storiesController = storiesController;
        }
    }

    public final class StoryGradientTools {
        public final AnimatedColor animatedColor1;
        public final AnimatedColor animatedColor2;
        public int color1;
        public int color2;
        public final int currentAccount;
        public final Shaker$$ExternalSyntheticLambda0 invalidate;
        public final GradientTools tools;

        public StoryGradientTools(View view) {
            Shaker$$ExternalSyntheticLambda0 shaker$$ExternalSyntheticLambda0 = new Shaker$$ExternalSyntheticLambda0(0, view);
            this.currentAccount = UserConfig.selectedAccount;
            this.invalidate = shaker$$ExternalSyntheticLambda0;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedColor1 = new AnimatedColor(shaker$$ExternalSyntheticLambda0, 350L, cubicBezierInterpolator);
            this.animatedColor2 = new AnimatedColor(shaker$$ExternalSyntheticLambda0, 350L, cubicBezierInterpolator);
            GradientTools gradientTools = new GradientTools();
            this.tools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            resetColors(false);
            Paint paint = gradientTools.paint;
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
        }

        public final Paint getPaint(RectF rectF) {
            GradientTools gradientTools = this.tools;
            gradientTools.setColors(this.animatedColor1.set(this.color1, false), this.animatedColor2.set(this.color2, false), 0, 0);
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            gradientTools.getClass();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f, f2, f3, f4);
            gradientTools.setBounds(rectF2);
            return gradientTools.paint;
        }

        public final void resetColors(boolean z) {
            int color = Theme.getColor(null, Theme.key_stories_circle1, false);
            int color2 = Theme.getColor(null, Theme.key_stories_circle2, false);
            this.color1 = color;
            this.color2 = color2;
            if (!z) {
                this.animatedColor1.set(color, true);
                this.animatedColor2.set(color2, true);
            }
            this.invalidate.run();
        }

        public final void setColor(MessagesController.PeerColor peerColor, boolean z) {
            if (peerColor == null) {
                resetColors(z);
                return;
            }
            int storyColor1 = peerColor.getStoryColor1(Theme.currentTheme.isDark());
            int storyColor2 = peerColor.getStoryColor2(Theme.currentTheme.isDark());
            this.color1 = storyColor1;
            this.color2 = storyColor2;
            if (!z) {
                this.animatedColor1.set(storyColor1, true);
                this.animatedColor2.set(storyColor2, true);
            }
            this.invalidate.run();
        }
    }

    public final class UserStoriesLoadOperation {
        public int currentAccount;

        public UserStoriesLoadOperation() {
            ConnectionsManager.generateClassGuid();
        }

        public final void load(View view, long j, AvatarStoryParams avatarStoryParams) {
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            MessagesController messagesController = MessagesController.getInstance(i);
            messagesController.getStoriesController().setLoading(j, true);
            view.invalidate();
            TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
            tL_stories_getPeerStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new PhotoUtilities$$ExternalSyntheticLambda2(this, j, view, avatarStoryParams, messagesController));
        }
    }

    public static void applyViewedUser(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() <= storyItem.expire_date + 86400) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.id));
            }
        }
    }

    public static void checkGrayPaint(Theme.ResourcesProvider resourcesProvider) {
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
            float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (fComputePerceivedBrightness >= 0.721f) {
                grayPaint.setColor(ColorUtils.blendARGB(0.2f, color, -16777216));
            } else if (fComputePerceivedBrightness < 0.25f) {
                grayPaint.setColor(ColorUtils.blendARGB(0.2f, color, -1));
            } else {
                grayPaint.setColor(ColorUtils.blendARGB(0.44f, color, -1));
            }
        }
    }

    public static void checkStoryCellGrayPaint(Theme.ResourcesProvider resourcesProvider, boolean z) {
        Paint[] paintArr = storyCellGreyPaint;
        if (paintArr[z ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int color = Theme.getColor(!z ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived, resourcesProvider);
        int[] iArr = storyCellGrayLastColor;
        if (iArr[z ? 1 : 0] != color) {
            iArr[z ? 1 : 0] = color;
            float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (fComputePerceivedBrightness >= 0.721f) {
                paintArr[z ? 1 : 0].setColor(ColorUtils.blendARGB(0.2f, color, -16777216));
            } else if (fComputePerceivedBrightness < 0.25f) {
                paintArr[z ? 1 : 0].setColor(ColorUtils.blendARGB(0.2f, color, -1));
            } else {
                paintArr[z ? 1 : 0].setColor(ColorUtils.blendARGB(0.44f, color, -1));
            }
        }
    }

    public static SpannableStringBuilder createExpiredStoryString(int i, boolean z, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i, objArr));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_bomb);
        if (z) {
            coloredImageSpan.setScale(0.8f, 0.8f);
        } else {
            coloredImageSpan.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder createReplyStoryString() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_replystory2), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void drawArcExcludeArc(Canvas canvas, RectF rectF, Paint paint, float f, float f2, float f3, float f4) {
        float f5;
        boolean z;
        float f6 = f2 - f;
        if (f >= f3 || f2 >= f3 + f6) {
            f5 = f;
            z = false;
        } else {
            f5 = f;
            canvas.drawArc(rectF, f5, Math.min(f2, f3) - f, false, paint);
            z = true;
        }
        float fMax = Math.max(f5, f4);
        float fMin = Math.min(f2, f3 + 360.0f);
        if (fMin >= fMax) {
            canvas.drawArc(rectF, fMax, fMin - fMax, false, paint);
        } else {
            if (z) {
                return;
            }
            if (f5 <= f3 || f2 >= f4) {
                canvas.drawArc(rectF, f5, f6, false, paint);
            }
        }
    }

    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, AvatarStoryParams avatarStoryParams) {
        drawAvatarWithStory(j, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(j), avatarStoryParams);
    }

    public static void drawCircleInternal(Canvas canvas, AvatarStoryParams avatarStoryParams, Paint paint, boolean z) {
        RectF rectF = rectTmp;
        if (z) {
            RectF rectF2 = forumRect;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f = avatarStoryParams.progressToArc;
        if (f == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f / 2.0f) + 360.0f, 360.0f - f, false, paint);
        }
    }

    public static void drawLive(Canvas canvas, RectF rectF, float f, boolean z, float f2) {
        Canvas canvas2;
        if (liveText == null) {
            liveText = new Text(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (liveCutPaint == null) {
            Paint paint = new Paint(1);
            liveCutPaint = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (livePaint == null) {
            livePaint = new Paint(1);
        }
        if (liveRect == null) {
            liveRect = new RectF();
        }
        livePaint.setColor(Theme.multAlpha(f, Theme.getColor(null, Theme.key_stories_circle_live2, false)));
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f2);
        float width = liveText.getWidth() + fLerp + fLerp;
        float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f2);
        float fDp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f3 = width / 2.0f;
        float f4 = 0.8f * fLerp2;
        float f5 = fLerp2 * 0.2f;
        liveRect.set((rectF.centerX() - f3) - fDp, (rectF.bottom - f4) - fDp, rectF.centerX() + f3 + fDp, rectF.bottom + f5 + fDp);
        float fLerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f);
        canvas.scale(fLerp3, fLerp3, liveRect.centerX(), liveRect.centerY());
        AndroidUtilities.scaleRect(liveRect, f);
        RectF rectF2 = liveRect;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, liveRect.height() / 2.0f, liveCutPaint);
        if (z) {
            liveRect.set(rectF.centerX() - f3, rectF.bottom - f4, rectF.centerX() + f3, rectF.bottom + f5);
            RectF rectF3 = liveRect;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, liveRect.height() / 2.0f, livePaint);
            Text text = liveText;
            RectF rectF4 = liveRect;
            canvas2 = canvas;
            text.draw(rectF4.left + fLerp, rectF4.centerY(), f, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void drawSegment(Canvas canvas, RectF rectF, Paint paint, float f, float f2, AvatarStoryParams avatarStoryParams, boolean z) {
        if (z) {
            float fHeight = rectF.height() * 0.32f;
            float f3 = ((((int) f) / 90) * 90) + 90;
            float f4 = (-199.0f) + f3;
            Path path = forumRoundRectPath;
            path.rewind();
            path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
            Matrix matrix = forumRoundRectMatrix;
            matrix.reset();
            matrix.postRotate(f3, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = forumRoundRectPathMeasure;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = forumSegmentPath;
            path2.reset();
            pathMeasure.getSegment(((f - f4) / 360.0f) * length, length * ((f2 - f4) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!avatarStoryParams.useArcProgress) {
            if (avatarStoryParams.isLast) {
                float f5 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f5) / 2.0f) + 180.0f, (f5 / 2.0f) + 180.0f);
                return;
            } else if (f < 90.0f) {
                drawArcExcludeArc(canvas, rectF, paint, f, f2, avatarStoryParams.rightTopAngleToExclude, avatarStoryParams.rightBottomAngleToExclude);
                return;
            } else {
                drawArcExcludeArc(canvas, rectF, paint, f, f2, -avatarStoryParams.leftTopAngleToExclude, avatarStoryParams.leftBottomAngleToExclude);
                return;
            }
        }
        boolean z2 = avatarStoryParams.isFirst;
        if (!z2 && !avatarStoryParams.isLast) {
            if (f < 90.0f) {
                float f6 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f6) / 2.0f, f6 / 2.0f);
                return;
            } else {
                float f7 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f7) / 2.0f) + 180.0f, (f7 / 2.0f) + 180.0f);
                return;
            }
        }
        if (avatarStoryParams.isLast) {
            float f8 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f8) / 2.0f) + 180.0f, (f8 / 2.0f) + 180.0f);
        } else if (!z2) {
            canvas.drawArc(rectF, f, f2 - f, false, paint);
        } else {
            float f9 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f9) / 2.0f, f9 / 2.0f);
        }
    }

    public static void drawSegmentsInternal(Canvas canvas, StoriesController storiesController, ImageReceiver imageReceiver, AvatarStoryParams avatarStoryParams, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z) {
        int i;
        int size;
        Paint[] paintArr;
        int i2;
        boolean z2;
        Paint paint5;
        Paint paint6;
        RectF rectF;
        Object[] objArr;
        RectF rectF2;
        Paint paint7;
        float f;
        int i3;
        float f2;
        float f3;
        int iMax;
        int i4;
        Paint paint8;
        Paint paint9;
        Paint paint10;
        int unreadState;
        long j;
        TL_stories.PeerStories storiesFromFullPeer;
        Paint paint11;
        float f4;
        int i5;
        TL_stories.StoryItem storyItem;
        AvatarStoryParams avatarStoryParams2 = avatarStoryParams;
        checkGrayPaint(avatarStoryParams2.resourcesProvider);
        checkStoryCellGrayPaint(avatarStoryParams2.resourcesProvider, avatarStoryParams2.isArchive);
        long j2 = avatarStoryParams2.crossfadeToDialog;
        int i6 = 0;
        int unreadState2 = j2 != 0 ? storiesController.getUnreadState(0, j2) : storiesController.getUnreadState(0, avatarStoryParams2.dialogId);
        avatarStoryParams2.globalState = unreadState2 == 0 ? 2 : 1;
        long j3 = avatarStoryParams2.dialogId;
        LongSparseArray longSparseArray = storiesController.allStoriesMap;
        TL_stories.PeerStories storiesFromFullPeer2 = (TL_stories.PeerStories) longSparseArray.get(j3);
        if (storiesFromFullPeer2 == null) {
            storiesFromFullPeer2 = storiesController.getStoriesFromFullPeer(avatarStoryParams2.dialogId);
        }
        TL_stories.PeerStories peerStories = storiesFromFullPeer2;
        boolean z3 = avatarStoryParams2.drawHiddenStoriesAsSegments;
        ArrayList arrayList = storiesController.hiddenListStories;
        if (!z3) {
            if (peerStories == null || peerStories.stories.size() == 1) {
                i = 1;
            } else {
                size = peerStories.stories.size();
            }
            paintArr = storyCellGreyPaint;
            i2 = 3;
            z2 = avatarStoryParams2.isStoryCell;
            if (unreadState2 == 2) {
                getCloseFriendsPaint(imageReceiver);
                paint5 = closeFriendsGradientTools.paint;
            } else if (unreadState2 == 3) {
                getLivePaint(imageReceiver);
                paint5 = liveGradientTools.paint;
            } else if (unreadState2 == 1) {
                getUnreadCirclePaint(imageReceiver, z2);
                paint5 = storiesGradientTools[z2 ? 1 : 0].paint;
            } else if (z2) {
                paint5 = paintArr[avatarStoryParams2.isArchive ? 1 : 0];
            } else {
                paint5 = grayPaint;
            }
            paint6 = paint5;
            rectF = rectTmp;
            if (i <= 1) {
                j = avatarStoryParams2.dialogId;
                storiesFromFullPeer = (TL_stories.PeerStories) longSparseArray.get(j);
                if (storiesFromFullPeer == null) {
                    storiesFromFullPeer = storiesController.getStoriesFromFullPeer(j);
                }
                if (storiesFromFullPeer != null) {
                    if (j != UserConfig.getInstance(storiesController.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) storiesController.uploadingStoriesByDialogId.get(j))) {
                        i6 = 1;
                        break;
                    }
                    for (i5 = 0; i5 < storiesFromFullPeer.stories.size(); i5++) {
                        storyItem = storiesFromFullPeer.stories.get(i5);
                        if (storyItem != null) {
                            if (!(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                                if (storyItem.id > storiesFromFullPeer.max_read_id) {
                                    i6 = 1;
                                    break;
                                }
                            } else {
                                i6 = 2;
                                break;
                            }
                        }
                    }
                }
                if (i6 == 2) {
                    paint11 = paint3;
                } else if (paint6 == closeFriendsGradientTools.paint) {
                    paint11 = paint4;
                } else if (i6 == 1) {
                    paint11 = paint2;
                } else {
                    paint11 = paint;
                }
                drawSegment(canvas, rectF, paint11, -90.0f, 90.0f, avatarStoryParams2, z);
                drawSegment(canvas, rectF, paint11, 90.0f, 270.0f, avatarStoryParams, z);
                f4 = avatarStoryParams.progressToSegments;
                if (f4 != 1.0f || paint11 == paint6) {
                    return;
                }
                paint6.setAlpha((int) ((1.0f - f4) * 255.0f));
                drawSegment(canvas, rectF, paint6, -90.0f, 90.0f, avatarStoryParams, z);
                drawSegment(canvas, rectF, paint6, 90.0f, 270.0f, avatarStoryParams, z);
                paint6.setAlpha(255);
                return;
            }
            objArr = z2 ? 1 : 0;
            rectF2 = rectF;
            paint7 = paint6;
            f = 360.0f / i;
            if (i > 20) {
                i3 = 3;
            } else {
                i3 = 5;
            }
            f2 = i3 * avatarStoryParams2.progressToSegments;
            if (f2 > f) {
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            if (avatarStoryParams2.drawHiddenStoriesAsSegments) {
                iMax = 0;
            } else {
                iMax = Math.max(peerStories.max_read_id, storiesController.dialogIdToMaxReadId.get(avatarStoryParams2.dialogId, 0));
            }
            i4 = 0;
            while (i4 < i) {
                if (objArr != null) {
                    paint8 = paintArr[avatarStoryParams2.isArchive ? 1 : 0];
                } else {
                    paint8 = grayPaint;
                }
                if (avatarStoryParams2.drawHiddenStoriesAsSegments) {
                    unreadState = storiesController.getUnreadState(i6, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((i - 1) - i4)).peer));
                    if (unreadState == 2) {
                        paint8 = paint4;
                    } else if (unreadState == i2) {
                        paint8 = paint3;
                    } else if (unreadState == 1) {
                        paint8 = paint2;
                    }
                } else if (i4 >= peerStories.stories.size()) {
                    paint8 = paint2;
                } else if (!peerStories.stories.get(i4).justUploaded || peerStories.stories.get(i4).id > iMax) {
                    if (peerStories.stories.get(i4).media instanceof TLRPC.TL_messageMediaVideoStream) {
                        paint8 = paint3;
                    } else if (peerStories.stories.get(i4).close_friends) {
                        paint8 = paint4;
                    } else {
                        paint8 = paint2;
                    }
                }
                float f5 = (i4 * f) - 90.0f;
                float f6 = f5 + f;
                float f7 = f5 + f3;
                float f8 = f6 - f3;
                paint9 = paint7;
                Object[] objArr2 = objArr;
                Paint paint12 = paint8;
                drawSegment(canvas, rectF2, paint12, f7, f8, avatarStoryParams, z);
                RectF rectF3 = rectF2;
                if (avatarStoryParams.progressToSegments != 1.0f || paint12 == paint9) {
                    paint10 = paint9;
                } else {
                    paint9.getStrokeWidth();
                    paint9.setAlpha((int) ((1.0f - avatarStoryParams.progressToSegments) * 255.0f));
                    drawSegment(canvas, rectF3, paint9, f7, f8, avatarStoryParams, z);
                    rectF3 = rectF3;
                    paint10 = paint9;
                    paint10.setAlpha(255);
                }
                i4++;
                Paint paint13 = paint10;
                rectF2 = rectF3;
                paint7 = paint13;
                avatarStoryParams2 = avatarStoryParams;
                objArr = objArr2 == true ? 1 : 0;
                i6 = 0;
                i2 = 3;
            }
        }
        size = arrayList.size();
        i = size;
        paintArr = storyCellGreyPaint;
        i2 = 3;
        z2 = avatarStoryParams2.isStoryCell;
        if (unreadState2 == 2) {
            getCloseFriendsPaint(imageReceiver);
            paint5 = closeFriendsGradientTools.paint;
        } else if (unreadState2 == 3) {
            getLivePaint(imageReceiver);
            paint5 = liveGradientTools.paint;
        } else if (unreadState2 == 1) {
            getUnreadCirclePaint(imageReceiver, z2);
            paint5 = storiesGradientTools[z2 ? 1 : 0].paint;
        } else if (z2) {
            paint5 = paintArr[avatarStoryParams2.isArchive ? 1 : 0];
        } else {
            paint5 = grayPaint;
        }
        paint6 = paint5;
        rectF = rectTmp;
        if (i <= 1) {
            j = avatarStoryParams2.dialogId;
            storiesFromFullPeer = (TL_stories.PeerStories) longSparseArray.get(j);
            if (storiesFromFullPeer == null) {
                storiesFromFullPeer = storiesController.getStoriesFromFullPeer(j);
            }
            if (storiesFromFullPeer != null) {
                if (j != UserConfig.getInstance(storiesController.currentAccount).getClientUserId()) {
                    while (i5 < storiesFromFullPeer.stories.size()) {
                        storyItem = storiesFromFullPeer.stories.get(i5);
                        if (storyItem != null) {
                            if (!(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                                if (storyItem.id > storiesFromFullPeer.max_read_id) {
                                    i6 = 1;
                                    break;
                                }
                            } else {
                                i6 = 2;
                                break;
                            }
                        }
                    }
                } else {
                    while (i5 < storiesFromFullPeer.stories.size()) {
                        storyItem = storiesFromFullPeer.stories.get(i5);
                        if (storyItem != null) {
                            if (!(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                                if (storyItem.id > storiesFromFullPeer.max_read_id) {
                                    i6 = 1;
                                    break;
                                }
                            } else {
                                i6 = 2;
                                break;
                            }
                        }
                    }
                }
            }
            if (i6 == 2) {
                paint11 = paint3;
            } else if (paint6 == closeFriendsGradientTools.paint) {
                paint11 = paint4;
            } else if (i6 == 1) {
                paint11 = paint2;
            } else {
                paint11 = paint;
            }
            drawSegment(canvas, rectF, paint11, -90.0f, 90.0f, avatarStoryParams2, z);
            drawSegment(canvas, rectF, paint11, 90.0f, 270.0f, avatarStoryParams, z);
            f4 = avatarStoryParams.progressToSegments;
            if (f4 != 1.0f) {
                return;
            } else {
                return;
            }
        }
        objArr = z2 ? 1 : 0;
        rectF2 = rectF;
        paint7 = paint6;
        f = 360.0f / i;
        if (i > 20) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        f2 = i3 * avatarStoryParams2.progressToSegments;
        if (f2 > f) {
            f3 = 0.0f;
        } else {
            f3 = f2;
        }
        if (avatarStoryParams2.drawHiddenStoriesAsSegments) {
            iMax = 0;
        } else {
            iMax = Math.max(peerStories.max_read_id, storiesController.dialogIdToMaxReadId.get(avatarStoryParams2.dialogId, 0));
        }
        i4 = 0;
        while (i4 < i) {
            if (objArr != null) {
                paint8 = paintArr[avatarStoryParams2.isArchive ? 1 : 0];
            } else {
                paint8 = grayPaint;
            }
            if (avatarStoryParams2.drawHiddenStoriesAsSegments) {
                unreadState = storiesController.getUnreadState(i6, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((i - 1) - i4)).peer));
                if (unreadState == 2) {
                    paint8 = paint4;
                } else if (unreadState == i2) {
                    paint8 = paint3;
                } else if (unreadState == 1) {
                    paint8 = paint2;
                }
            } else if (i4 >= peerStories.stories.size()) {
                if (!peerStories.stories.get(i4).justUploaded) {
                }
                if (peerStories.stories.get(i4).media instanceof TLRPC.TL_messageMediaVideoStream) {
                    paint8 = paint3;
                } else if (peerStories.stories.get(i4).close_friends) {
                    paint8 = paint4;
                } else {
                    paint8 = paint2;
                }
            } else {
                paint8 = paint2;
            }
            float f9 = (i4 * f) - 90.0f;
            float f10 = f9 + f;
            float f11 = f9 + f3;
            float f12 = f10 - f3;
            paint9 = paint7;
            Object[] objArr3 = objArr;
            Paint paint14 = paint8;
            drawSegment(canvas, rectF2, paint14, f11, f12, avatarStoryParams, z);
            RectF rectF4 = rectF2;
            if (avatarStoryParams.progressToSegments != 1.0f) {
                paint10 = paint9;
            } else {
                paint10 = paint9;
            }
            i4++;
            Paint paint15 = paint10;
            rectF2 = rectF4;
            paint7 = paint15;
            avatarStoryParams2 = avatarStoryParams;
            objArr = objArr3 == true ? 1 : 0;
            i6 = 0;
            i2 = 3;
        }
    }

    public static EnsureStoryFileLoadedObject ensureStoryFileLoaded(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i = storiesController.dialogIdToMaxReadId.get(DialogObject.getPeerDialogId(peerStories.peer));
        int i2 = 0;
        while (true) {
            if (i2 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i2).id > i) {
                storyItem = peerStories.stories.get(i2);
                break;
            }
            i2++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia == null || messageMedia.document == null) {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                runnable.run();
                return null;
            }
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), "", false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
        } else {
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
            if (pathToAttach2 != null && pathToAttach2.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
            if (pathToAttach3 != null) {
                try {
                    int iLastIndexOf = pathToAttach3.getName().lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        File file = new File(pathToAttach3.getParentFile(), pathToAttach3.getName().substring(0, iLastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        final EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = new EnsureStoryFileLoadedObject(storiesController, DialogObject.getPeerDialogId(peerStories.peer));
        ensureStoryFileLoadedObject.runnable = new StoryViewer$5$$ExternalSyntheticLambda0(9, ensureStoryFileLoadedObject, runnable);
        final Runnable[] runnableArr = {storyViewer$5$$ExternalSyntheticLambda0};
        StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0 = new StoryViewer$5$$ExternalSyntheticLambda0(10, runnableArr, ensureStoryFileLoadedObject);
        AndroidUtilities.runOnUIThread(storyViewer$5$$ExternalSyntheticLambda0, 3000L);
        ?? r2 = new ImageReceiver() {
            @Override
            public final boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i3, z, i4);
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    ensureStoryFileLoadedObject.runnable.run();
                }
                AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(this, 18));
                return imageBitmapByKey;
            }
        };
        ensureStoryFileLoadedObject.imageReceiver = r2;
        r2.setAllowLoadingOnAttachedOnly(true);
        ensureStoryFileLoadedObject.imageReceiver.onAttachedToWindow();
        int iMax = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String strM = DiffUtil.m(iMax, iMax, "_");
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                ensureStoryFileLoadedObject.runnable.run();
                return null;
            }
            ensureStoryFileLoadedObject.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), strM, null, null, null, 0L, null, storyItem2, 0);
        } else {
            ensureStoryFileLoadedObject.imageReceiver.setImage(ImageLocation.getForDocument(document), zzhr.m(strM, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return ensureStoryFileLoadedObject;
    }

    public static Paint getCloseFriendsPaint(ImageReceiver imageReceiver) {
        if (closeFriendsGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            closeFriendsGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_closeFriends1, false), Theme.getColor(null, Theme.key_stories_circle_closeFriends2, false), 0, 0);
            closeFriendsGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            closeFriendsGradientTools.paint.setStyle(Paint.Style.STROKE);
            closeFriendsGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        GradientTools gradientTools2 = closeFriendsGradientTools;
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        gradientTools2.getClass();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(imageX, imageY, imageX2, imageY2);
        gradientTools2.setBounds(rectF);
        return closeFriendsGradientTools.paint;
    }

    public static BitmapDrawable getExpiredStoryDrawable() {
        if (expiredStoryDrawable == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(ColorUtils.setAlphaComponent(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            expiredStoryDrawable = new BitmapDrawable(bitmapCreateBitmap);
        }
        return expiredStoryDrawable;
    }

    public static Paint getLivePaint(ImageReceiver imageReceiver) {
        if (liveGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            liveGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_live1, false), Theme.getColor(null, Theme.key_stories_circle_live2, false), 0, 0);
            liveGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            liveGradientTools.paint.setStyle(Paint.Style.STROKE);
            liveGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        GradientTools gradientTools2 = liveGradientTools;
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        gradientTools2.getClass();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(imageX, imageY, imageX2, imageY2);
        gradientTools2.setBounds(rectF);
        return liveGradientTools.paint;
    }

    public static int getPredictiveUnreadState(StoriesController storiesController, long j) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j == 0) {
            return 0;
        }
        if (j <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
            if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
                return 0;
            }
            int i = storiesController.dialogIdToMaxReadId.get(j, 0);
            TLRPC.TL_recentStory tL_recentStory3 = chat.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i ? 1 : 2;
        }
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
        if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
            return 0;
        }
        int i2 = storiesController.dialogIdToMaxReadId.get(j, 0);
        TLRPC.TL_recentStory tL_recentStory4 = user.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i2 ? 1 : 2;
    }

    public static Paint getUnreadCirclePaint(ImageReceiver imageReceiver, boolean z) {
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if (gradientToolsArr[z ? 1 : 0] == null) {
            GradientTools gradientTools = new GradientTools();
            gradientToolsArr[z ? 1 : 0] = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            if (z) {
                gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_dialog1, false), Theme.getColor(null, Theme.key_stories_circle_dialog2, false), 0, 0);
            } else {
                gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle1, false), Theme.getColor(null, Theme.key_stories_circle2, false), 0, 0);
            }
            gradientToolsArr[z ? 1 : 0].paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            gradientToolsArr[z ? 1 : 0].paint.setStyle(Paint.Style.STROKE);
            gradientToolsArr[z ? 1 : 0].paint.setStrokeCap(Paint.Cap.ROUND);
        }
        GradientTools gradientTools2 = gradientToolsArr[z ? 1 : 0];
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        gradientTools2.getClass();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(imageX, imageY, imageX2, imageY2);
        gradientTools2.setBounds(rectF);
        return gradientToolsArr[z ? 1 : 0].paint;
    }

    public static CharSequence getUploadingStr(TextView textView, boolean z) {
        String string = z ? LocaleController.getString(R.string.StoryEditing) : LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
        UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
        spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
        uploadingDotsSpannable.parent = textView;
        uploadingDotsSpannable.isMediumTypeface = false;
        return spannableStringBuilderValueOf;
    }

    public static boolean isExpired(int i, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i).getCurrentTime() > storyItem.expire_date;
    }

    public static void setImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, Integer.MAX_VALUE), storyItem.media.document), "320_320", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(ColorUtils.blendARGB(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(bitmapCreateBitmap);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
        }
    }

    public static void setStoryMiniImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1000), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        }
    }

    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, boolean z, AvatarStoryParams avatarStoryParams) {
        int predictiveUnreadState;
        int predictiveUnreadState2;
        int i;
        float f;
        int iDp;
        int iDp2;
        float fLerp;
        float f2;
        float f3;
        Canvas canvas2;
        float f4;
        float f5;
        ?? r9;
        float f6;
        ImageReceiver imageReceiver2;
        AvatarStoryParams avatarStoryParams2;
        boolean z2;
        StoriesController storiesController;
        ImageReceiver imageReceiver3;
        AvatarStoryParams avatarStoryParams3;
        boolean z3;
        RectF rectF;
        float f7;
        float f8;
        float f9;
        Paint paint;
        Paint unreadCirclePaint;
        Paint paint2;
        Paint paint3;
        float fDpf2;
        float f10;
        float f11;
        float fM;
        int i2;
        boolean z4;
        Paint paint4;
        Paint paint5;
        Paint closeFriendsPaint;
        Paint paint6;
        Paint paint7;
        float fDpf3;
        float f12;
        float fM2;
        GradientTools gradientTools;
        float fM3;
        StoriesController storiesController2 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z5 = avatarStoryParams.animate;
        if (avatarStoryParams.dialogId != j) {
            avatarStoryParams.dialogId = j;
            avatarStoryParams.reset();
            z5 = false;
        }
        boolean z6 = storiesController2.loadingDialogsStories.get(j, 0) == 1;
        boolean z7 = ChatObject.isForum(UserConfig.selectedAccount, j) && !avatarStoryParams.isDialogStoriesCell;
        boolean z8 = avatarStoryParams.drawHiddenStoriesAsSegments ? !storiesController2.hiddenListStories.isEmpty() : z;
        if (avatarStoryParams.storyItem != null) {
            storiesController2.getUnreadState(avatarStoryParams.storyId, j);
            z6 = false;
        }
        if (z6) {
            if (storiesController2.hasStories(j)) {
                predictiveUnreadState = 3;
                predictiveUnreadState2 = 2;
            } else {
                predictiveUnreadState2 = getPredictiveUnreadState(storiesController2, j);
                predictiveUnreadState = 3;
            }
            z5 = false;
        } else if (z8) {
            if (avatarStoryParams.drawSegments) {
                predictiveUnreadState = 2;
                predictiveUnreadState2 = 2;
            } else {
                int unreadState = storiesController2.getUnreadState(avatarStoryParams.storyId, j);
                predictiveUnreadState2 = unreadState;
                predictiveUnreadState = unreadState == 0 ? 2 : 1;
            }
        } else {
            predictiveUnreadState = getPredictiveUnreadState(storiesController2, j);
            predictiveUnreadState2 = predictiveUnreadState;
        }
        int i3 = avatarStoryParams.forceState;
        if (i3 != 0) {
            predictiveUnreadState = i3;
            i = predictiveUnreadState;
        } else {
            i = predictiveUnreadState2;
        }
        int i4 = avatarStoryParams.currentState;
        if (i4 != predictiveUnreadState) {
            if (i4 == 3) {
                z5 = true;
            }
            if (predictiveUnreadState == 3) {
                avatarStoryParams.animateFromUnreadState = i;
                avatarStoryParams.progressToProgressSegments = 0.0f;
            }
            if (z5) {
                avatarStoryParams.prevState = i4;
                avatarStoryParams.currentState = predictiveUnreadState;
                avatarStoryParams.progressToSate = 0.0f;
            } else {
                avatarStoryParams.currentState = predictiveUnreadState;
                avatarStoryParams.progressToSate = 1.0f;
            }
        }
        ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
        float scale = buttonBounce != null ? buttonBounce.getScale(0.08f) : 1.0f;
        if (avatarStoryParams.showProgress != z6 && z6) {
            avatarStoryParams.sweepAngle = 1.0f;
            avatarStoryParams.inc = false;
        }
        avatarStoryParams.showProgress = z6;
        int i5 = avatarStoryParams.currentState;
        RectF rectF2 = avatarStoryParams.originalAvatarRect;
        if (i5 == 0 && avatarStoryParams.progressToSate == 1.0f) {
            imageReceiver.setImageCoords(rectF2);
            canvas.save();
            canvas.scale(scale, scale, rectF2.centerX(), rectF2.centerY());
            imageReceiver.draw(canvas);
            canvas.restore();
            return;
        }
        int iSave = canvas.save();
        if (scale != 1.0f) {
            f = 0.0f;
            canvas.scale(scale, scale, rectF2.centerX(), rectF2.centerY());
        } else {
            f = 0.0f;
        }
        float f13 = storiesController2.hasLiveStory(avatarStoryParams.dialogId) ? avatarStoryParams.progressToSegments : 0.0f;
        float interpolation = avatarStoryParams.progressToSate;
        if (interpolation != 1.0f) {
            interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(interpolation);
        }
        boolean z9 = avatarStoryParams.isStoryCell;
        if (!z9 || avatarStoryParams.drawInside) {
            int i6 = avatarStoryParams.prevState;
            int i7 = avatarStoryParams.animateFromUnreadState;
            if (i6 == 3) {
                i6 = i7;
            }
            if (i6 == 2) {
                iDp = AndroidUtilities.dp(3.0f);
            } else {
                iDp = i6 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            }
            int i8 = avatarStoryParams.currentState;
            int i9 = avatarStoryParams.animateFromUnreadState;
            if (i8 == 3) {
                i8 = i9;
            }
            if (i8 == 2) {
                iDp2 = AndroidUtilities.dp(3.0f);
            } else {
                iDp2 = i8 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            }
            fLerp = AndroidUtilities.lerp(iDp, iDp2, avatarStoryParams.progressToSate);
        } else {
            fLerp = 0.0f;
        }
        RectF rectF3 = rectTmp;
        if (fLerp == f) {
            imageReceiver.setImageCoords(rectF2);
        } else {
            rectF3.set(rectF2);
            rectF3.inset(fLerp, fLerp);
            imageReceiver.setImageCoords(rectF3);
        }
        if (f13 > f) {
            f2 = f13;
            f4 = 1.0f;
            r9 = z9;
            f5 = 0.08f;
            canvas2 = canvas;
            f3 = interpolation;
            canvas2.saveLayerAlpha(rectF3.left - AndroidUtilities.dp(15.0f), rectF3.top - AndroidUtilities.dp(15.0f), rectF3.right + AndroidUtilities.dp(15.0f), rectF3.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f2 = f13;
            f3 = interpolation;
            canvas2 = canvas;
            f4 = 1.0f;
            f5 = 0.08f;
            r9 = z9;
        }
        int i10 = avatarStoryParams.prevState;
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if ((i10 == 1 && avatarStoryParams.progressToSate != f4) || avatarStoryParams.currentState == 1) {
            if (i == 2) {
                getCloseFriendsPaint(imageReceiver);
                gradientTools = closeFriendsGradientTools;
            } else if (i == 3) {
                getLivePaint(imageReceiver);
                gradientTools = liveGradientTools;
            } else {
                getUnreadCirclePaint(imageReceiver, r9);
                gradientTools = gradientToolsArr[r9];
            }
            boolean z10 = avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != f4;
            float f14 = (r9 == 0 || avatarStoryParams.drawInside) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z10) {
                fM3 = (AndroidUtilities.dp(5.0f) * f3) + f14;
                gradientTools.paint.setAlpha((int) ((f4 - f3) * avatarStoryParams.alpha * 255.0f));
            } else {
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f3));
                fM3 = DiffUtil.m(1.0f, f3, AndroidUtilities.dp(5.0f), f14);
            }
            float f15 = fM3 + avatarStoryParams.additionalInset;
            rectF3.set(rectF2);
            rectF3.inset(f15, f15);
            imageReceiver.getParentView();
            drawCircleInternal(canvas2, avatarStoryParams, gradientTools.paint, z7);
        }
        int i11 = avatarStoryParams.prevState;
        Paint[] paintArr = storyCellGreyPaint;
        if (i11 == 2) {
            f6 = 1.0f;
            if (avatarStoryParams.progressToSate != 1.0f) {
                if (i11 == 2 || avatarStoryParams.progressToSate == f6) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (r9 != 0) {
                    checkStoryCellGrayPaint(avatarStoryParams.resourcesProvider, avatarStoryParams.isArchive);
                    paint4 = paintArr[avatarStoryParams.isArchive ? 1 : 0];
                } else {
                    checkGrayPaint(avatarStoryParams.resourcesProvider);
                    paint4 = grayPaint;
                }
                paint5 = paint4;
                if (avatarStoryParams.drawSegments) {
                    Paint unreadCirclePaint2 = getUnreadCirclePaint(imageReceiver, r9);
                    unreadCirclePaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                    closeFriendsPaint = getCloseFriendsPaint(imageReceiver);
                    closeFriendsPaint.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                    Paint livePaint2 = getLivePaint(imageReceiver);
                    livePaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                    checkGrayPaint(avatarStoryParams.resourcesProvider);
                    paint7 = livePaint2;
                    paint6 = unreadCirclePaint2;
                } else {
                    closeFriendsPaint = null;
                    paint6 = null;
                    paint7 = null;
                }
                if (avatarStoryParams.drawSegments) {
                    if (r9 != 0 || avatarStoryParams.drawInside) {
                        f12 = 0.0f;
                    } else {
                        fDpf3 = AndroidUtilities.dpf2(3.5f);
                        f12 = -fDpf3;
                    }
                } else if (r9 != 0 || avatarStoryParams.drawInside) {
                    f12 = 0.0f;
                } else {
                    fDpf3 = AndroidUtilities.dpf2(2.7f);
                    f12 = -fDpf3;
                }
                if (z4) {
                    fM2 = (AndroidUtilities.dp(5.0f) * f3) + f12;
                    paint5.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (1.0f - f3)));
                } else {
                    paint5.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f3));
                    fM2 = DiffUtil.m(1.0f, f3, AndroidUtilities.dp(5.0f), f12);
                }
                float f16 = fM2 + avatarStoryParams.additionalInset;
                rectF3.set(rectF2);
                rectF3.inset(f16, f16);
                if (avatarStoryParams.drawSegments) {
                    canvas2 = canvas;
                    imageReceiver2 = imageReceiver;
                    storiesController = storiesController2;
                    Paint paint8 = closeFriendsPaint;
                    avatarStoryParams2 = avatarStoryParams;
                    z2 = z7;
                    drawSegmentsInternal(canvas2, storiesController, imageReceiver2, avatarStoryParams2, paint5, paint6, paint7, paint8, z2);
                } else {
                    canvas2 = canvas;
                    imageReceiver2 = imageReceiver;
                    avatarStoryParams2 = avatarStoryParams;
                    z2 = z7;
                    storiesController = storiesController2;
                    imageReceiver2.getParentView();
                    drawCircleInternal(canvas2, avatarStoryParams2, paint5, z2);
                }
            }
            if ((avatarStoryParams2.prevState != 3 && avatarStoryParams2.progressToSate != 1.0f) || avatarStoryParams2.currentState == 3) {
                if (avatarStoryParams2.animateFromUnreadState == 1) {
                    getUnreadCirclePaint(imageReceiver2, r9);
                    paint = gradientToolsArr[r9].paint;
                } else if (r9 != 0) {
                    checkStoryCellGrayPaint(avatarStoryParams2.resourcesProvider, avatarStoryParams2.isArchive);
                    paint = paintArr[avatarStoryParams2.isArchive ? 1 : 0];
                } else {
                    checkGrayPaint(avatarStoryParams2.resourcesProvider);
                    paint = grayPaint;
                }
                paint.setAlpha((int) (f3 * 255.0f));
                if (avatarStoryParams2.drawSegments) {
                    unreadCirclePaint = getUnreadCirclePaint(imageReceiver2, r9);
                    unreadCirclePaint.setAlpha((int) (avatarStoryParams2.alpha * 255.0f));
                    Paint closeFriendsPaint2 = getCloseFriendsPaint(imageReceiver2);
                    closeFriendsPaint2.setAlpha((int) (avatarStoryParams2.alpha * 255.0f));
                    Paint livePaint3 = getLivePaint(imageReceiver2);
                    livePaint3.setAlpha((int) (avatarStoryParams2.alpha * 255.0f));
                    checkGrayPaint(avatarStoryParams2.resourcesProvider);
                    paint3 = closeFriendsPaint2;
                    paint2 = livePaint3;
                } else {
                    unreadCirclePaint = null;
                    paint2 = null;
                    paint3 = null;
                }
                if (avatarStoryParams2.drawSegments) {
                    if (r9 == 0 || avatarStoryParams2.drawInside) {
                        f10 = 0.0f;
                    } else {
                        fDpf2 = AndroidUtilities.dpf2(3.5f);
                        f10 = -fDpf2;
                    }
                } else if (r9 == 0 || avatarStoryParams2.drawInside) {
                    f10 = 0.0f;
                } else {
                    fDpf2 = AndroidUtilities.dpf2(2.7f);
                    f10 = -fDpf2;
                }
                if (avatarStoryParams2.prevState == 3 && avatarStoryParams2.progressToSate != 1.0f) {
                    fM = (AndroidUtilities.dp(7.0f) * f3) + f10;
                    paint.setAlpha((int) ((1.0f - f3) * avatarStoryParams2.alpha * 255.0f));
                    f11 = 1.0f;
                } else {
                    paint.setAlpha((int) (avatarStoryParams2.alpha * 255.0f * f3));
                    f11 = 1.0f;
                    fM = DiffUtil.m(1.0f, f3, AndroidUtilities.dp(5.0f), f10);
                }
                float f17 = fM + avatarStoryParams2.additionalInset;
                rectF3.set(rectF2);
                rectF3.inset(f17, f17);
                boolean z11 = avatarStoryParams2.drawSegments;
                if (z11 && avatarStoryParams2.currentState == 3) {
                    float f18 = avatarStoryParams2.progressToProgressSegments;
                    if (f18 != f11) {
                        float f19 = f18 + f5;
                        avatarStoryParams2.progressToProgressSegments = f19;
                        if (f19 > f11) {
                            avatarStoryParams2.progressToProgressSegments = f11;
                        }
                        float f20 = avatarStoryParams2.progressToSegments;
                        avatarStoryParams2.progressToSegments = f11 - avatarStoryParams2.progressToProgressSegments;
                        drawSegmentsInternal(canvas2, storiesController, imageReceiver2, avatarStoryParams2, paint, unreadCirclePaint, paint2, paint3, z2);
                        imageReceiver3 = imageReceiver2;
                        avatarStoryParams3 = avatarStoryParams2;
                        avatarStoryParams3.progressToSegments = f20;
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                        canvas2 = canvas;
                    }
                    imageReceiver3.draw(canvas2);
                    f7 = f2;
                    if (f7 > 0.5f) {
                        z3 = true;
                    }
                    avatarStoryParams3.drawnLive = z3;
                    if (f13 > f) {
                        float f21 = fLerp + avatarStoryParams3.additionalInset;
                        rectF.set(rectF2);
                        rectF.inset(f21, f21);
                        drawLive(canvas2, rectF, f7, imageReceiver3.getVisible(), 0.0f);
                    }
                    f8 = avatarStoryParams3.progressToSate;
                    if (f8 != 1.0f) {
                        f9 = (AndroidUtilities.screenRefreshTime / 250.0f) + f8;
                        avatarStoryParams3.progressToSate = f9;
                        if (f9 > 1.0f) {
                            avatarStoryParams3.progressToSate = 1.0f;
                        }
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                    }
                    if (iSave != 0) {
                        canvas2.restoreToCount(iSave);
                    }
                }
                avatarStoryParams3 = avatarStoryParams2;
                Paint paint9 = paint3;
                imageReceiver3 = imageReceiver2;
                if (z11) {
                    int unreadState2 = storiesController.getUnreadState(0, avatarStoryParams3.dialogId);
                    if (unreadState2 == 2) {
                        unreadCirclePaint = paint9;
                    } else if (unreadState2 == 3) {
                        unreadCirclePaint = paint2;
                    } else if (unreadState2 != 1) {
                        unreadCirclePaint = paint;
                    }
                } else {
                    unreadCirclePaint = paint;
                }
                View parentView = imageReceiver3.getParentView();
                if (avatarStoryParams3.inc) {
                    float f22 = avatarStoryParams3.sweepAngle + 0.016f;
                    avatarStoryParams3.sweepAngle = f22;
                    if (f22 >= 1.0f) {
                        avatarStoryParams3.sweepAngle = 1.0f;
                        z3 = false;
                        avatarStoryParams3.inc = false;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                    float f23 = avatarStoryParams3.sweepAngle - 0.016f;
                    avatarStoryParams3.sweepAngle = f23;
                    if (f23 < f) {
                        avatarStoryParams3.sweepAngle = 0.0f;
                        avatarStoryParams3.inc = true;
                    }
                    avatarStoryParams3.globalAngle += 1.152f;
                    parentView.invalidate();
                    if (avatarStoryParams3.inc) {
                        rectF = rectF3;
                        canvas.drawArc(rectF, avatarStoryParams3.globalAngle, avatarStoryParams3.sweepAngle * 360.0f, false, unreadCirclePaint);
                    } else {
                        rectF = rectF3;
                        canvas.drawArc(rectF, avatarStoryParams3.globalAngle + 360.0f, (-360.0f) * avatarStoryParams3.sweepAngle, false, unreadCirclePaint);
                    }
                    for (i2 = 0; i2 < 16; i2++) {
                        float f24 = (i2 * 22.5f) + 10.0f;
                        canvas.drawArc(rectF, avatarStoryParams3.globalAngle + f24, ((22.5f + f24) - 10.0f) - f24, false, unreadCirclePaint);
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    f7 = f2;
                    if (f7 > 0.5f) {
                        z3 = true;
                    }
                    avatarStoryParams3.drawnLive = z3;
                    if (f13 > f) {
                        float f25 = fLerp + avatarStoryParams3.additionalInset;
                        rectF.set(rectF2);
                        rectF.inset(f25, f25);
                        drawLive(canvas2, rectF, f7, imageReceiver3.getVisible(), 0.0f);
                    }
                    f8 = avatarStoryParams3.progressToSate;
                    if (f8 != 1.0f) {
                        f9 = (AndroidUtilities.screenRefreshTime / 250.0f) + f8;
                        avatarStoryParams3.progressToSate = f9;
                        if (f9 > 1.0f) {
                            avatarStoryParams3.progressToSate = 1.0f;
                        }
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                    }
                    if (iSave != 0) {
                        canvas2.restoreToCount(iSave);
                    }
                }
                avatarStoryParams3.globalAngle += 1.152f;
                parentView.invalidate();
                if (avatarStoryParams3.inc) {
                    rectF = rectF3;
                    canvas.drawArc(rectF, avatarStoryParams3.globalAngle, avatarStoryParams3.sweepAngle * 360.0f, false, unreadCirclePaint);
                } else {
                    rectF = rectF3;
                    canvas.drawArc(rectF, avatarStoryParams3.globalAngle + 360.0f, (-360.0f) * avatarStoryParams3.sweepAngle, false, unreadCirclePaint);
                }
                while (i2 < 16) {
                    float f26 = (i2 * 22.5f) + 10.0f;
                    canvas.drawArc(rectF, avatarStoryParams3.globalAngle + f26, ((22.5f + f26) - 10.0f) - f26, false, unreadCirclePaint);
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                f7 = f2;
                if (f7 > 0.5f) {
                    z3 = true;
                }
                avatarStoryParams3.drawnLive = z3;
                if (f13 > f) {
                    float f27 = fLerp + avatarStoryParams3.additionalInset;
                    rectF.set(rectF2);
                    rectF.inset(f27, f27);
                    drawLive(canvas2, rectF, f7, imageReceiver3.getVisible(), 0.0f);
                }
                f8 = avatarStoryParams3.progressToSate;
                if (f8 != 1.0f) {
                    f9 = (AndroidUtilities.screenRefreshTime / 250.0f) + f8;
                    avatarStoryParams3.progressToSate = f9;
                    if (f9 > 1.0f) {
                        avatarStoryParams3.progressToSate = 1.0f;
                    }
                    if (imageReceiver3.getParentView() != null) {
                        imageReceiver3.invalidate();
                        imageReceiver3.getParentView().invalidate();
                    }
                }
                if (iSave != 0) {
                    canvas2.restoreToCount(iSave);
                }
            }
            imageReceiver3 = imageReceiver2;
            avatarStoryParams3 = avatarStoryParams2;
            rectF = rectF3;
            z3 = false;
            imageReceiver3.draw(canvas2);
            f7 = f2;
            if (f7 > 0.5f) {
                z3 = true;
            }
            avatarStoryParams3.drawnLive = z3;
            if (f13 > f) {
                float f28 = fLerp + avatarStoryParams3.additionalInset;
                rectF.set(rectF2);
                rectF.inset(f28, f28);
                drawLive(canvas2, rectF, f7, imageReceiver3.getVisible(), 0.0f);
            }
            f8 = avatarStoryParams3.progressToSate;
            if (f8 != 1.0f) {
                f9 = (AndroidUtilities.screenRefreshTime / 250.0f) + f8;
                avatarStoryParams3.progressToSate = f9;
                if (f9 > 1.0f) {
                    avatarStoryParams3.progressToSate = 1.0f;
                }
                if (imageReceiver3.getParentView() != null) {
                    imageReceiver3.invalidate();
                    imageReceiver3.getParentView().invalidate();
                }
            }
            if (iSave != 0) {
                canvas2.restoreToCount(iSave);
            }
        }
        f6 = 1.0f;
        if (avatarStoryParams.currentState == 2) {
            if (i11 == 2) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (r9 != 0) {
                checkStoryCellGrayPaint(avatarStoryParams.resourcesProvider, avatarStoryParams.isArchive);
                paint4 = paintArr[avatarStoryParams.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint4 = grayPaint;
            }
            paint5 = paint4;
            if (avatarStoryParams.drawSegments) {
                Paint unreadCirclePaint3 = getUnreadCirclePaint(imageReceiver, r9);
                unreadCirclePaint3.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                closeFriendsPaint = getCloseFriendsPaint(imageReceiver);
                closeFriendsPaint.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint livePaint4 = getLivePaint(imageReceiver);
                livePaint4.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint7 = livePaint4;
                paint6 = unreadCirclePaint3;
            } else {
                closeFriendsPaint = null;
                paint6 = null;
                paint7 = null;
            }
            if (avatarStoryParams.drawSegments) {
                if (r9 != 0) {
                }
                f12 = 0.0f;
            } else {
                if (r9 != 0) {
                }
                f12 = 0.0f;
            }
            if (z4) {
                fM2 = (AndroidUtilities.dp(5.0f) * f3) + f12;
                paint5.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (1.0f - f3)));
            } else {
                paint5.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f3));
                fM2 = DiffUtil.m(1.0f, f3, AndroidUtilities.dp(5.0f), f12);
            }
            float f110 = fM2 + avatarStoryParams.additionalInset;
            rectF3.set(rectF2);
            rectF3.inset(f110, f110);
            if (avatarStoryParams.drawSegments) {
                canvas2 = canvas;
                imageReceiver2 = imageReceiver;
                storiesController = storiesController2;
                Paint paint10 = closeFriendsPaint;
                avatarStoryParams2 = avatarStoryParams;
                z2 = z7;
                drawSegmentsInternal(canvas2, storiesController, imageReceiver2, avatarStoryParams2, paint5, paint6, paint7, paint10, z2);
            } else {
                canvas2 = canvas;
                imageReceiver2 = imageReceiver;
                avatarStoryParams2 = avatarStoryParams;
                z2 = z7;
                storiesController = storiesController2;
                imageReceiver2.getParentView();
                drawCircleInternal(canvas2, avatarStoryParams2, paint5, z2);
            }
        } else {
            imageReceiver2 = imageReceiver;
            avatarStoryParams2 = avatarStoryParams;
            z2 = z7;
            storiesController = storiesController2;
        }
        if (avatarStoryParams2.prevState != 3) {
            imageReceiver3 = imageReceiver2;
            avatarStoryParams3 = avatarStoryParams2;
        } else {
            imageReceiver3 = imageReceiver2;
            avatarStoryParams3 = avatarStoryParams2;
        }
        rectF = rectF3;
        z3 = false;
        imageReceiver3.draw(canvas2);
        f7 = f2;
        if (f7 > 0.5f) {
            z3 = true;
        }
        avatarStoryParams3.drawnLive = z3;
        if (f13 > f) {
            float f29 = fLerp + avatarStoryParams3.additionalInset;
            rectF.set(rectF2);
            rectF.inset(f29, f29);
            drawLive(canvas2, rectF, f7, imageReceiver3.getVisible(), 0.0f);
        }
        f8 = avatarStoryParams3.progressToSate;
        if (f8 != 1.0f) {
            f9 = (AndroidUtilities.screenRefreshTime / 250.0f) + f8;
            avatarStoryParams3.progressToSate = f9;
            if (f9 > 1.0f) {
                avatarStoryParams3.progressToSate = 1.0f;
            }
            if (imageReceiver3.getParentView() != null) {
                imageReceiver3.invalidate();
                imageReceiver3.getParentView().invalidate();
            }
        }
        if (iSave != 0) {
            canvas2.restoreToCount(iSave);
        }
    }
}
