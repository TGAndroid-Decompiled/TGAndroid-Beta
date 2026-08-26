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
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
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
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;

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
        ButtonBounce buttonBounce;
        public View child;
        public long crossfadeToDialog;
        public float crossfadeToDialogProgress;
        public int currentState;
        private long dialogId;
        public boolean drawHiddenStoriesAsSegments;
        public boolean drawInside;
        public boolean drawnLive;
        public boolean forceAnimateProgressToSegments;
        public int forceState;
        float globalAngle;
        public int globalState;
        boolean inc;
        public boolean isArchive;
        public boolean isDialogStoriesCell;
        public boolean isFirst;
        public boolean isLast;
        public final boolean isStoryCell;
        Runnable longPressRunnable;
        UserStoriesLoadOperation operation;
        boolean pressed;
        public int prevState;
        public int prevUnreadState;
        public float progressToProgressSegments;
        public Theme.ResourcesProvider resourcesProvider;
        float startX;
        float startY;
        public int storyId;
        public TL_stories.StoryItem storyItem;
        float sweepAngle;
        public int unreadState;
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
        public RectF originalAvatarRect = new RectF();
        public boolean allowLongress = false;

        public AvatarStoryParams(boolean z, Theme.ResourcesProvider resourcesProvider) {
            this.isStoryCell = z;
            this.resourcesProvider = resourcesProvider;
        }

        public static void access$100(AvatarStoryParams avatarStoryParams) {
            if (avatarStoryParams.inc) {
                float f = avatarStoryParams.sweepAngle + 0.016f;
                avatarStoryParams.sweepAngle = f;
                if (f >= 1.0f) {
                    avatarStoryParams.sweepAngle = 1.0f;
                    avatarStoryParams.inc = false;
                }
            } else {
                float f2 = avatarStoryParams.sweepAngle - 0.016f;
                avatarStoryParams.sweepAngle = f2;
                if (f2 < 0.0f) {
                    avatarStoryParams.sweepAngle = 0.0f;
                    avatarStoryParams.inc = true;
                }
            }
            avatarStoryParams.globalAngle += 1.152f;
        }

        public boolean checkOnTouchEvent(MotionEvent motionEvent, View view) {
            TLRPC.TL_recentStory tL_recentStory;
            TLRPC.TL_recentStory tL_recentStory2;
            TLRPC.User user;
            TLRPC.TL_recentStory tL_recentStory3;
            TLRPC.TL_recentStory tL_recentStory4;
            this.child = view;
            StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            TLRPC.Chat chat = null;
            boolean z = false;
            if (motionEvent.getAction() == 0 && this.originalAvatarRect.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.dialogId > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.dialogId));
                } else {
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.dialogId));
                    user = null;
                }
                if (isAvatarClickable(this.dialogId, chat, user)) {
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
                        StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0 = new StoryViewer$5$$ExternalSyntheticLambda0(14, this, view);
                        this.longPressRunnable = storyViewer$5$$ExternalSyntheticLambda0;
                        AndroidUtilities.runOnUIThread(storyViewer$5$$ExternalSyntheticLambda0, ViewConfiguration.getLongPressTimeout());
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.pressed) {
                if (Math.abs(this.startX - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.startY - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                    ButtonBounce buttonBounce2 = this.buttonBounce;
                    if (buttonBounce2 != null) {
                        buttonBounce2.setView(view);
                        this.buttonBounce.setPressed(false);
                    }
                    Runnable runnable2 = this.longPressRunnable;
                    if (runnable2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable2);
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
                if (this.pressed && motionEvent.getAction() == 1 && !onAvatarClick(view, this.dialogId)) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    StoriesController storiesController2 = messagesController.getStoriesController();
                    if (this.drawHiddenStoriesAsSegments) {
                        openStory(0L, null);
                    } else if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                        if (storiesController2.hasStories(this.dialogId)) {
                            openStory(this.dialogId, null);
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
                Runnable runnable3 = this.longPressRunnable;
                if (runnable3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable3);
                }
            }
            return this.pressed;
        }

        public float getScale() {
            ButtonBounce buttonBounce = this.buttonBounce;
            if (buttonBounce == null) {
                return 1.0f;
            }
            return buttonBounce.getScale(0.08f);
        }

        public boolean isAvatarClickable(long j, TLRPC.Chat chat, TLRPC.User user) {
            return false;
        }

        public final void lambda$checkOnTouchEvent$0(View view) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
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

        public boolean onAvatarClick(View view, long j) {
            return false;
        }

        public void onDetachFromWindow() {
            reset();
        }

        public void onLongPress() {
        }

        public void openStory(long j, Runnable runnable) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || this.child == null) {
                return;
            }
            lastFragment.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.child.getParent();
            lastFragment.getOrCreateStoryViewer().open(lastFragment.getContext(), j, parent instanceof RecyclerView ? new StoriesListPlaceProvider((RecyclerListView) parent, false) : null);
        }

        public void reset() {
            UserStoriesLoadOperation userStoriesLoadOperation = this.operation;
            if (userStoriesLoadOperation != null) {
                ConnectionsManager.getInstance(userStoriesLoadOperation.currentAccount).cancelRequest(userStoriesLoadOperation.reqId, false);
                this.operation = null;
            }
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
            Shaker$$ExternalSyntheticLambda0 shaker$$ExternalSyntheticLambda0 = new Shaker$$ExternalSyntheticLambda0(view, 0);
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
            gradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            gradientTools.paint.setStyle(Paint.Style.STROKE);
            gradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }

        public final Paint getPaint(RectF rectF) {
            GradientTools gradientTools = this.tools;
            gradientTools.setColors(this.animatedColor1.set(this.color1), this.animatedColor2.set(this.color2));
            gradientTools.setBounds(rectF.left, rectF.top, rectF.right, rectF.bottom);
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
        public int reqId;

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
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new PhotoUtilities$$ExternalSyntheticLambda2(this, j, view, avatarStoryParams, messagesController));
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
            text.draw(canvas2, rectF4.left + fLerp, rectF4.centerY(), -1, f);
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
        Paint paint5;
        Paint paint6;
        RectF rectF;
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
        AvatarStoryParams avatarStoryParams2;
        Paint paint10;
        int unreadState;
        long j;
        TL_stories.PeerStories storiesFromFullPeer;
        Paint paint11;
        float f4;
        int i5;
        TL_stories.StoryItem storyItem;
        AvatarStoryParams avatarStoryParams3 = avatarStoryParams;
        checkGrayPaint(avatarStoryParams3.resourcesProvider);
        checkStoryCellGrayPaint(avatarStoryParams3.resourcesProvider, avatarStoryParams3.isArchive);
        long j2 = avatarStoryParams3.crossfadeToDialog;
        int i6 = 0;
        int unreadState2 = j2 != 0 ? storiesController.getUnreadState(0, j2) : storiesController.getUnreadState(0, avatarStoryParams3.dialogId);
        avatarStoryParams3.globalState = unreadState2 == 0 ? 2 : 1;
        long j3 = avatarStoryParams3.dialogId;
        LongSparseArray longSparseArray = storiesController.allStoriesMap;
        TL_stories.PeerStories storiesFromFullPeer2 = (TL_stories.PeerStories) longSparseArray.get(j3);
        if (storiesFromFullPeer2 == null) {
            storiesFromFullPeer2 = storiesController.getStoriesFromFullPeer(avatarStoryParams3.dialogId);
        }
        TL_stories.PeerStories peerStories = storiesFromFullPeer2;
        boolean z2 = avatarStoryParams3.drawHiddenStoriesAsSegments;
        ArrayList arrayList = storiesController.hiddenListStories;
        if (!z2) {
            if (peerStories == null || peerStories.stories.size() == 1) {
                i = 1;
            } else {
                size = peerStories.stories.size();
            }
            paintArr = storyCellGreyPaint;
            i2 = 3;
            if (unreadState2 == 2) {
                getCloseFriendsPaint(imageReceiver);
                paint5 = closeFriendsGradientTools.paint;
            } else if (unreadState2 == 3) {
                getLivePaint(imageReceiver);
                paint5 = liveGradientTools.paint;
            } else if (unreadState2 == 1) {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams3.isStoryCell);
                paint5 = storiesGradientTools[avatarStoryParams3.isStoryCell ? 1 : 0].paint;
            } else if (avatarStoryParams3.isStoryCell) {
                paint5 = paintArr[avatarStoryParams3.isArchive ? 1 : 0];
            } else {
                paint5 = grayPaint;
            }
            paint6 = paint5;
            rectF = rectTmp;
            if (i <= 1) {
                j = avatarStoryParams3.dialogId;
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
                Paint paint12 = paint11;
                drawSegment(canvas, rectF, paint12, -90.0f, 90.0f, avatarStoryParams3, z);
                drawSegment(canvas, rectF, paint12, 90.0f, 270.0f, avatarStoryParams, z);
                f4 = avatarStoryParams.progressToSegments;
                if (f4 != 1.0f || paint12 == paint6) {
                    return;
                }
                paint6.setAlpha((int) ((1.0f - f4) * 255.0f));
                drawSegment(canvas, rectF, paint6, -90.0f, 90.0f, avatarStoryParams, z);
                drawSegment(canvas, rectF, paint6, 90.0f, 270.0f, avatarStoryParams, z);
                paint6.setAlpha(255);
                return;
            }
            rectF2 = rectF;
            paint7 = paint6;
            f = 360.0f / i;
            if (i > 20) {
                i3 = 3;
            } else {
                i3 = 5;
            }
            f2 = i3 * avatarStoryParams3.progressToSegments;
            if (f2 > f) {
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
                iMax = 0;
            } else {
                iMax = Math.max(peerStories.max_read_id, storiesController.dialogIdToMaxReadId.get(avatarStoryParams3.dialogId, 0));
            }
            i4 = 0;
            while (i4 < i) {
                if (avatarStoryParams3.isStoryCell) {
                    paint8 = paintArr[avatarStoryParams3.isArchive ? 1 : 0];
                } else {
                    paint8 = grayPaint;
                }
                if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
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
                Paint paint13 = paint8;
                avatarStoryParams2 = avatarStoryParams3;
                drawSegment(canvas, rectF2, paint13, f7, f8, avatarStoryParams2, z);
                RectF rectF3 = rectF2;
                if (avatarStoryParams2.progressToSegments != 1.0f || paint13 == paint9) {
                    paint10 = paint9;
                } else {
                    paint9.getStrokeWidth();
                    paint9.setAlpha((int) ((1.0f - avatarStoryParams2.progressToSegments) * 255.0f));
                    drawSegment(canvas, rectF3, paint9, f7, f8, avatarStoryParams2, z);
                    rectF3 = rectF3;
                    paint10 = paint9;
                    paint10.setAlpha(255);
                }
                i4++;
                Paint paint14 = paint10;
                rectF2 = rectF3;
                paint7 = paint14;
                avatarStoryParams3 = avatarStoryParams;
                i6 = 0;
                i2 = 3;
            }
        }
        size = arrayList.size();
        i = size;
        paintArr = storyCellGreyPaint;
        i2 = 3;
        if (unreadState2 == 2) {
            getCloseFriendsPaint(imageReceiver);
            paint5 = closeFriendsGradientTools.paint;
        } else if (unreadState2 == 3) {
            getLivePaint(imageReceiver);
            paint5 = liveGradientTools.paint;
        } else if (unreadState2 == 1) {
            getUnreadCirclePaint(imageReceiver, avatarStoryParams3.isStoryCell);
            paint5 = storiesGradientTools[avatarStoryParams3.isStoryCell ? 1 : 0].paint;
        } else if (avatarStoryParams3.isStoryCell) {
            paint5 = paintArr[avatarStoryParams3.isArchive ? 1 : 0];
        } else {
            paint5 = grayPaint;
        }
        paint6 = paint5;
        rectF = rectTmp;
        if (i <= 1) {
            j = avatarStoryParams3.dialogId;
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
            Paint paint15 = paint11;
            drawSegment(canvas, rectF, paint15, -90.0f, 90.0f, avatarStoryParams3, z);
            drawSegment(canvas, rectF, paint15, 90.0f, 270.0f, avatarStoryParams, z);
            f4 = avatarStoryParams.progressToSegments;
            if (f4 != 1.0f) {
                return;
            } else {
                return;
            }
        }
        rectF2 = rectF;
        paint7 = paint6;
        f = 360.0f / i;
        if (i > 20) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        f2 = i3 * avatarStoryParams3.progressToSegments;
        if (f2 > f) {
            f3 = 0.0f;
        } else {
            f3 = f2;
        }
        if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
            iMax = 0;
        } else {
            iMax = Math.max(peerStories.max_read_id, storiesController.dialogIdToMaxReadId.get(avatarStoryParams3.dialogId, 0));
        }
        i4 = 0;
        while (i4 < i) {
            if (avatarStoryParams3.isStoryCell) {
                paint8 = paintArr[avatarStoryParams3.isArchive ? 1 : 0];
            } else {
                paint8 = grayPaint;
            }
            if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
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
            Paint paint16 = paint8;
            avatarStoryParams2 = avatarStoryParams3;
            drawSegment(canvas, rectF2, paint16, f11, f12, avatarStoryParams2, z);
            RectF rectF4 = rectF2;
            if (avatarStoryParams2.progressToSegments != 1.0f) {
                paint10 = paint9;
            } else {
                paint10 = paint9;
            }
            i4++;
            Paint paint17 = paint10;
            rectF2 = rectF4;
            paint7 = paint17;
            avatarStoryParams3 = avatarStoryParams;
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
        ensureStoryFileLoadedObject.runnable = new StoryViewer$5$$ExternalSyntheticLambda0(12, ensureStoryFileLoadedObject, runnable);
        final Runnable[] runnableArr = {storyViewer$5$$ExternalSyntheticLambda0};
        StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0 = new StoryViewer$5$$ExternalSyntheticLambda0(13, runnableArr, ensureStoryFileLoadedObject);
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
                AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(this, 5));
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
            ensureStoryFileLoadedObject.imageReceiver.setImage(ImageLocation.getForDocument(document), zzhp.m(strM, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return ensureStoryFileLoadedObject;
    }

    public static Paint getCloseFriendsPaint(ImageReceiver imageReceiver) {
        if (closeFriendsGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            closeFriendsGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_closeFriends1, false), Theme.getColor(null, Theme.key_stories_circle_closeFriends2, false));
            closeFriendsGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            closeFriendsGradientTools.paint.setStyle(Paint.Style.STROKE);
            closeFriendsGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        closeFriendsGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
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
            gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_live1, false), Theme.getColor(null, Theme.key_stories_circle_live2, false));
            liveGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            liveGradientTools.paint.setStyle(Paint.Style.STROKE);
            liveGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        liveGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
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
                gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_dialog1, false), Theme.getColor(null, Theme.key_stories_circle_dialog2, false));
            } else {
                gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle1, false), Theme.getColor(null, Theme.key_stories_circle2, false));
            }
            gradientToolsArr[z ? 1 : 0].paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            gradientToolsArr[z ? 1 : 0].paint.setStyle(Paint.Style.STROKE);
            gradientToolsArr[z ? 1 : 0].paint.setStrokeCap(Paint.Cap.ROUND);
        }
        gradientToolsArr[z ? 1 : 0].setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
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
        float f2;
        int iDp;
        int i2;
        int i3;
        int iDp2;
        float fLerp;
        float f3;
        Canvas canvas2;
        RectF rectF;
        float f4;
        float f5;
        RectF rectF2;
        ImageReceiver imageReceiver2;
        AvatarStoryParams avatarStoryParams2;
        StoriesController storiesController;
        boolean z2;
        ImageReceiver imageReceiver3;
        AvatarStoryParams avatarStoryParams3;
        RectF rectF3;
        boolean z3;
        float f6;
        float f7;
        Paint paint;
        Paint unreadCirclePaint;
        Paint paint2;
        Paint paint3;
        float fDpf2;
        float f8;
        float fM;
        int i4;
        Paint paint4;
        Paint closeFriendsPaint;
        Paint paint5;
        Paint paint6;
        float fDpf3;
        float f9;
        float fM2;
        GradientTools gradientTools;
        float fM3;
        StoriesController storiesController2 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z4 = avatarStoryParams.animate;
        if (avatarStoryParams.dialogId != j) {
            avatarStoryParams.dialogId = j;
            avatarStoryParams.reset();
            z4 = false;
        }
        boolean z5 = storiesController2.loadingDialogsStories.get(j, 0) == 1;
        boolean z6 = ChatObject.isForum(UserConfig.selectedAccount, j) && !avatarStoryParams.isDialogStoriesCell;
        boolean z7 = avatarStoryParams.drawHiddenStoriesAsSegments ? !storiesController2.hiddenListStories.isEmpty() : z;
        if (avatarStoryParams.storyItem != null) {
            storiesController2.getUnreadState(avatarStoryParams.storyId, j);
            z5 = false;
        }
        if (z5) {
            if (storiesController2.hasStories(j)) {
                predictiveUnreadState = 3;
                predictiveUnreadState2 = 2;
            } else {
                predictiveUnreadState2 = getPredictiveUnreadState(storiesController2, j);
                predictiveUnreadState = 3;
            }
            z4 = false;
        } else if (z7) {
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
        int i5 = avatarStoryParams.forceState;
        if (i5 != 0) {
            predictiveUnreadState = i5;
            i = predictiveUnreadState;
        } else {
            i = predictiveUnreadState2;
        }
        int i6 = avatarStoryParams.currentState;
        if (i6 != predictiveUnreadState) {
            if (i6 == 3) {
                z4 = true;
            }
            if (predictiveUnreadState == 3) {
                avatarStoryParams.animateFromUnreadState = i;
                avatarStoryParams.progressToProgressSegments = 0.0f;
            }
            if (z4) {
                avatarStoryParams.prevState = i6;
                avatarStoryParams.prevUnreadState = avatarStoryParams.unreadState;
                avatarStoryParams.currentState = predictiveUnreadState;
                avatarStoryParams.progressToSate = 0.0f;
            } else {
                avatarStoryParams.currentState = predictiveUnreadState;
                avatarStoryParams.progressToSate = 1.0f;
            }
        }
        avatarStoryParams.unreadState = i;
        ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
        float scale = buttonBounce != null ? buttonBounce.getScale(0.08f) : 1.0f;
        if (avatarStoryParams.showProgress != z5 && z5) {
            avatarStoryParams.sweepAngle = 1.0f;
            avatarStoryParams.inc = false;
        }
        avatarStoryParams.showProgress = z5;
        if (avatarStoryParams.currentState == 0 && avatarStoryParams.progressToSate == 1.0f) {
            imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
            canvas.save();
            canvas.scale(scale, scale, avatarStoryParams.originalAvatarRect.centerX(), avatarStoryParams.originalAvatarRect.centerY());
            imageReceiver.draw(canvas);
            canvas.restore();
            return;
        }
        int iSave = canvas.save();
        if (scale != 1.0f) {
            canvas.scale(scale, scale, avatarStoryParams.originalAvatarRect.centerX(), avatarStoryParams.originalAvatarRect.centerY());
        }
        float f10 = storiesController2.hasLiveStory(avatarStoryParams.dialogId) ? avatarStoryParams.progressToSegments : 0.0f;
        float interpolation = avatarStoryParams.progressToSate;
        if (interpolation != 1.0f) {
            interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(interpolation);
        }
        if (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) {
            int i7 = avatarStoryParams.prevState;
            f = 0.0f;
            int i8 = avatarStoryParams.animateFromUnreadState;
            if (i7 == 3) {
                i7 = i8;
            }
            if (i7 == 2) {
                iDp = AndroidUtilities.dp(3.0f);
            } else {
                if (i7 == 1) {
                    iDp = AndroidUtilities.dp(4.0f);
                } else {
                    f2 = 3.0f;
                    iDp = 0;
                }
                i2 = avatarStoryParams.currentState;
                i3 = avatarStoryParams.animateFromUnreadState;
                if (i2 == 3) {
                    i2 = i3;
                }
                if (i2 == 2) {
                    iDp2 = AndroidUtilities.dp(f2);
                } else if (i2 == 1) {
                    iDp2 = AndroidUtilities.dp(4.0f);
                } else {
                    iDp2 = 0;
                }
                fLerp = AndroidUtilities.lerp(iDp, iDp2, avatarStoryParams.progressToSate);
            }
            f2 = 3.0f;
            i2 = avatarStoryParams.currentState;
            i3 = avatarStoryParams.animateFromUnreadState;
            if (i2 == 3) {
                i2 = i3;
            }
            if (i2 == 2) {
                iDp2 = AndroidUtilities.dp(f2);
            } else if (i2 == 1) {
                iDp2 = AndroidUtilities.dp(4.0f);
            } else {
                iDp2 = 0;
            }
            fLerp = AndroidUtilities.lerp(iDp, iDp2, avatarStoryParams.progressToSate);
        } else {
            f = 0.0f;
            fLerp = 0.0f;
        }
        RectF rectF4 = rectTmp;
        if (fLerp == f) {
            imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
        } else {
            rectF4.set(avatarStoryParams.originalAvatarRect);
            rectF4.inset(fLerp, fLerp);
            imageReceiver.setImageCoords(rectF4);
        }
        if (f10 > f) {
            rectF = rectF4;
            f4 = 0.08f;
            f5 = 1.0f;
            canvas2 = canvas;
            f3 = interpolation;
            canvas2.saveLayerAlpha(rectF4.left - AndroidUtilities.dp(15.0f), rectF4.top - AndroidUtilities.dp(15.0f), rectF4.right + AndroidUtilities.dp(15.0f), rectF4.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f3 = interpolation;
            canvas2 = canvas;
            rectF = rectF4;
            f4 = 0.08f;
            f5 = 1.0f;
        }
        int i9 = avatarStoryParams.prevState;
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if ((i9 != 1 || avatarStoryParams.progressToSate == f5) && avatarStoryParams.currentState != 1) {
            rectF2 = rectF;
        } else {
            if (i == 2) {
                getCloseFriendsPaint(imageReceiver);
                gradientTools = closeFriendsGradientTools;
            } else if (i == 3) {
                getLivePaint(imageReceiver);
                gradientTools = liveGradientTools;
            } else {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                gradientTools = gradientToolsArr[avatarStoryParams.isStoryCell ? 1 : 0];
            }
            boolean z8 = avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != f5;
            float f11 = (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z8) {
                fM3 = (AndroidUtilities.dp(5.0f) * f3) + f11;
                gradientTools.paint.setAlpha((int) ((f5 - f3) * avatarStoryParams.alpha * 255.0f));
            } else {
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f3));
                fM3 = DiffUtil.m(f5, f3, AndroidUtilities.dp(5.0f), f11);
            }
            float f12 = fM3 + avatarStoryParams.additionalInset;
            rectF2 = rectF;
            rectF2.set(avatarStoryParams.originalAvatarRect);
            rectF2.inset(f12, f12);
            imageReceiver.getParentView();
            drawCircleInternal(canvas2, avatarStoryParams, gradientTools.paint, z6);
        }
        int i10 = avatarStoryParams.prevState;
        Paint[] paintArr = storyCellGreyPaint;
        if ((i10 != 2 || avatarStoryParams.progressToSate == f5) && avatarStoryParams.currentState != 2) {
            imageReceiver2 = imageReceiver;
            avatarStoryParams2 = avatarStoryParams;
            storiesController = storiesController2;
            z2 = z6;
        } else {
            boolean z9 = i10 == 2 && avatarStoryParams.progressToSate != f5;
            if (avatarStoryParams.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams.resourcesProvider, avatarStoryParams.isArchive);
                paint4 = paintArr[avatarStoryParams.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint4 = grayPaint;
            }
            Paint paint7 = paint4;
            if (avatarStoryParams.drawSegments) {
                Paint unreadCirclePaint2 = getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                unreadCirclePaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                closeFriendsPaint = getCloseFriendsPaint(imageReceiver);
                closeFriendsPaint.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint livePaint2 = getLivePaint(imageReceiver);
                livePaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint6 = livePaint2;
                paint5 = unreadCirclePaint2;
            } else {
                closeFriendsPaint = null;
                paint5 = null;
                paint6 = null;
            }
            if (avatarStoryParams.drawSegments) {
                if (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) {
                    f9 = 0.0f;
                } else {
                    fDpf3 = AndroidUtilities.dpf2(3.5f);
                    f9 = -fDpf3;
                }
            } else if (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) {
                f9 = 0.0f;
            } else {
                fDpf3 = AndroidUtilities.dpf2(2.7f);
                f9 = -fDpf3;
            }
            if (z9) {
                fM2 = (AndroidUtilities.dp(5.0f) * f3) + f9;
                paint7.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (f5 - f3)));
            } else {
                paint7.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f3));
                fM2 = DiffUtil.m(f5, f3, AndroidUtilities.dp(5.0f), f9);
            }
            float f13 = fM2 + avatarStoryParams.additionalInset;
            rectF2.set(avatarStoryParams.originalAvatarRect);
            rectF2.inset(f13, f13);
            if (avatarStoryParams.drawSegments) {
                imageReceiver2 = imageReceiver;
                storiesController = storiesController2;
                Paint paint8 = closeFriendsPaint;
                avatarStoryParams2 = avatarStoryParams;
                z2 = z6;
                drawSegmentsInternal(canvas2, storiesController, imageReceiver2, avatarStoryParams2, paint7, paint5, paint6, paint8, z2);
            } else {
                imageReceiver2 = imageReceiver;
                avatarStoryParams2 = avatarStoryParams;
                storiesController = storiesController2;
                z2 = z6;
                imageReceiver2.getParentView();
                drawCircleInternal(canvas2, avatarStoryParams2, paint7, z2);
            }
        }
        if ((avatarStoryParams2.prevState == 3 && avatarStoryParams2.progressToSate != f5) || avatarStoryParams2.currentState == 3) {
            if (avatarStoryParams2.animateFromUnreadState == 1) {
                getUnreadCirclePaint(imageReceiver2, avatarStoryParams2.isStoryCell);
                paint = gradientToolsArr[avatarStoryParams2.isStoryCell ? 1 : 0].paint;
            } else if (avatarStoryParams2.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams2.resourcesProvider, avatarStoryParams2.isArchive);
                paint = paintArr[avatarStoryParams2.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams2.resourcesProvider);
                paint = grayPaint;
            }
            paint.setAlpha((int) (f3 * 255.0f));
            if (avatarStoryParams2.drawSegments) {
                unreadCirclePaint = getUnreadCirclePaint(imageReceiver2, avatarStoryParams2.isStoryCell);
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
                if (!avatarStoryParams2.isStoryCell || avatarStoryParams2.drawInside) {
                    f8 = 0.0f;
                } else {
                    fDpf2 = AndroidUtilities.dpf2(3.5f);
                    f8 = -fDpf2;
                }
            } else if (!avatarStoryParams2.isStoryCell || avatarStoryParams2.drawInside) {
                f8 = 0.0f;
            } else {
                fDpf2 = AndroidUtilities.dpf2(2.7f);
                f8 = -fDpf2;
            }
            if (avatarStoryParams2.prevState == 3 && avatarStoryParams2.progressToSate != 1.0f) {
                fM = (AndroidUtilities.dp(7.0f) * f3) + f8;
                paint.setAlpha((int) ((1.0f - f3) * avatarStoryParams2.alpha * 255.0f));
            } else {
                paint.setAlpha((int) (avatarStoryParams2.alpha * 255.0f * f3));
                fM = DiffUtil.m(1.0f, f3, AndroidUtilities.dp(5.0f), f8);
            }
            float f14 = fM + avatarStoryParams2.additionalInset;
            rectF2.set(avatarStoryParams2.originalAvatarRect);
            rectF2.inset(f14, f14);
            boolean z10 = avatarStoryParams2.drawSegments;
            if (z10 && avatarStoryParams2.currentState == 3) {
                float f15 = avatarStoryParams2.progressToProgressSegments;
                if (f15 != 1.0f) {
                    float f16 = f15 + f4;
                    avatarStoryParams2.progressToProgressSegments = f16;
                    if (f16 > 1.0f) {
                        avatarStoryParams2.progressToProgressSegments = 1.0f;
                    }
                    float f17 = avatarStoryParams2.progressToSegments;
                    avatarStoryParams2.progressToSegments = 1.0f - avatarStoryParams2.progressToProgressSegments;
                    drawSegmentsInternal(canvas2, storiesController, imageReceiver2, avatarStoryParams2, paint, unreadCirclePaint, paint2, paint3, z2);
                    imageReceiver3 = imageReceiver2;
                    avatarStoryParams3 = avatarStoryParams2;
                    avatarStoryParams3.progressToSegments = f17;
                    if (imageReceiver3.getParentView() != null) {
                        imageReceiver3.invalidate();
                        imageReceiver3.getParentView().invalidate();
                    }
                    canvas2 = canvas;
                }
                imageReceiver3.draw(canvas2);
                if (f10 > 0.5f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                avatarStoryParams3.drawnLive = z3;
                if (f10 > f) {
                    float f18 = fLerp + avatarStoryParams3.additionalInset;
                    rectF3.set(avatarStoryParams3.originalAvatarRect);
                    rectF3.inset(f18, f18);
                    drawLive(canvas2, rectF3, f10, imageReceiver3.getVisible(), 0.0f);
                }
                f6 = avatarStoryParams3.progressToSate;
                if (f6 != 1.0f) {
                    f7 = (AndroidUtilities.screenRefreshTime / 250.0f) + f6;
                    avatarStoryParams3.progressToSate = f7;
                    if (f7 > 1.0f) {
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
            if (z10) {
                int unreadState2 = storiesController.getUnreadState(0, avatarStoryParams3.dialogId);
                if (unreadState2 != 2) {
                    if (unreadState2 == 3) {
                        unreadCirclePaint = paint2;
                    } else if (unreadState2 != 1) {
                    }
                    View parentView = imageReceiver3.getParentView();
                    AvatarStoryParams.access$100(avatarStoryParams3);
                    parentView.invalidate();
                    if (avatarStoryParams3.inc) {
                        rectF3 = rectF2;
                        canvas.drawArc(rectF3, avatarStoryParams3.globalAngle, avatarStoryParams3.sweepAngle * 360.0f, false, unreadCirclePaint);
                    } else {
                        rectF3 = rectF2;
                        canvas.drawArc(rectF3, avatarStoryParams3.globalAngle + 360.0f, avatarStoryParams3.sweepAngle * (-360.0f), false, unreadCirclePaint);
                    }
                    for (i4 = 0; i4 < 16; i4++) {
                        float f19 = (i4 * 22.5f) + 10.0f;
                        canvas.drawArc(rectF3, avatarStoryParams3.globalAngle + f19, ((22.5f + f19) - 10.0f) - f19, false, unreadCirclePaint);
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    if (f10 > 0.5f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    avatarStoryParams3.drawnLive = z3;
                    if (f10 > f) {
                        float f110 = fLerp + avatarStoryParams3.additionalInset;
                        rectF3.set(avatarStoryParams3.originalAvatarRect);
                        rectF3.inset(f110, f110);
                        drawLive(canvas2, rectF3, f10, imageReceiver3.getVisible(), 0.0f);
                    }
                    f6 = avatarStoryParams3.progressToSate;
                    if (f6 != 1.0f) {
                        f7 = (AndroidUtilities.screenRefreshTime / 250.0f) + f6;
                        avatarStoryParams3.progressToSate = f7;
                        if (f7 > 1.0f) {
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
                unreadCirclePaint = paint9;
                View parentView2 = imageReceiver3.getParentView();
                AvatarStoryParams.access$100(avatarStoryParams3);
                parentView2.invalidate();
                if (avatarStoryParams3.inc) {
                    rectF3 = rectF2;
                    canvas.drawArc(rectF3, avatarStoryParams3.globalAngle, avatarStoryParams3.sweepAngle * 360.0f, false, unreadCirclePaint);
                } else {
                    rectF3 = rectF2;
                    canvas.drawArc(rectF3, avatarStoryParams3.globalAngle + 360.0f, avatarStoryParams3.sweepAngle * (-360.0f), false, unreadCirclePaint);
                }
                while (i4 < 16) {
                    float f111 = (i4 * 22.5f) + 10.0f;
                    canvas.drawArc(rectF3, avatarStoryParams3.globalAngle + f111, ((22.5f + f111) - 10.0f) - f111, false, unreadCirclePaint);
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                if (f10 > 0.5f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                avatarStoryParams3.drawnLive = z3;
                if (f10 > f) {
                    float f112 = fLerp + avatarStoryParams3.additionalInset;
                    rectF3.set(avatarStoryParams3.originalAvatarRect);
                    rectF3.inset(f112, f112);
                    drawLive(canvas2, rectF3, f10, imageReceiver3.getVisible(), 0.0f);
                }
                f6 = avatarStoryParams3.progressToSate;
                if (f6 != 1.0f) {
                    f7 = (AndroidUtilities.screenRefreshTime / 250.0f) + f6;
                    avatarStoryParams3.progressToSate = f7;
                    if (f7 > 1.0f) {
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
            unreadCirclePaint = paint;
            View parentView3 = imageReceiver3.getParentView();
            AvatarStoryParams.access$100(avatarStoryParams3);
            parentView3.invalidate();
            if (avatarStoryParams3.inc) {
                rectF3 = rectF2;
                canvas.drawArc(rectF3, avatarStoryParams3.globalAngle, avatarStoryParams3.sweepAngle * 360.0f, false, unreadCirclePaint);
            } else {
                rectF3 = rectF2;
                canvas.drawArc(rectF3, avatarStoryParams3.globalAngle + 360.0f, avatarStoryParams3.sweepAngle * (-360.0f), false, unreadCirclePaint);
            }
            while (i4 < 16) {
                float f113 = (i4 * 22.5f) + 10.0f;
                canvas.drawArc(rectF3, avatarStoryParams3.globalAngle + f113, ((22.5f + f113) - 10.0f) - f113, false, unreadCirclePaint);
            }
            canvas2 = canvas;
            imageReceiver3.draw(canvas2);
            if (f10 > 0.5f) {
                z3 = true;
            } else {
                z3 = false;
            }
            avatarStoryParams3.drawnLive = z3;
            if (f10 > f) {
                float f114 = fLerp + avatarStoryParams3.additionalInset;
                rectF3.set(avatarStoryParams3.originalAvatarRect);
                rectF3.inset(f114, f114);
                drawLive(canvas2, rectF3, f10, imageReceiver3.getVisible(), 0.0f);
            }
            f6 = avatarStoryParams3.progressToSate;
            if (f6 != 1.0f) {
                f7 = (AndroidUtilities.screenRefreshTime / 250.0f) + f6;
                avatarStoryParams3.progressToSate = f7;
                if (f7 > 1.0f) {
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
        rectF3 = rectF2;
        imageReceiver3.draw(canvas2);
        if (f10 > 0.5f) {
            z3 = true;
        } else {
            z3 = false;
        }
        avatarStoryParams3.drawnLive = z3;
        if (f10 > f) {
            float f115 = fLerp + avatarStoryParams3.additionalInset;
            rectF3.set(avatarStoryParams3.originalAvatarRect);
            rectF3.inset(f115, f115);
            drawLive(canvas2, rectF3, f10, imageReceiver3.getVisible(), 0.0f);
        }
        f6 = avatarStoryParams3.progressToSate;
        if (f6 != 1.0f) {
            f7 = (AndroidUtilities.screenRefreshTime / 250.0f) + f6;
            avatarStoryParams3.progressToSate = f7;
            if (f7 > 1.0f) {
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
