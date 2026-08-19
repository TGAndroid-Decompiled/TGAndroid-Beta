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
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AvatarDrawable;
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
    public static Drawable expiredStoryDrawable;
    public static int grayLastColor;
    public static Paint grayPaint;
    public static Paint liveCutPaint;
    public static GradientTools liveGradientTools;
    public static Paint livePaint;
    public static RectF liveRect;
    public static Text liveText;
    public static GradientTools[] storiesGradientTools = new GradientTools[2];
    public static Paint[] storyCellGreyPaint = new Paint[2];
    private static final int[] storyCellGrayLastColor = new int[2];
    private static final RectF rectTmp = new RectF();
    static boolean scheduled = false;
    static int debugState = 0;
    static Runnable debugRunnable = new Runnable() {
        @Override
        public void run() {
            int iAbs = Math.abs(Utilities.random.nextInt() % 3);
            StoriesUtilities.debugState = iAbs;
            if (iAbs == 2) {
                StoriesUtilities.debugState = 1;
            } else {
                StoriesUtilities.debugState = 2;
            }
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationName(NotificationCenter.updateInterfaces, 0);
            AndroidUtilities.runOnUIThread(StoriesUtilities.debugRunnable, 1000L);
            LaunchActivity.getLastFragment().getFragmentView();
        }
    };
    private static final RectF forumRect = new RectF();
    private static final Path forumRoundRectPath = new Path();
    private static final Matrix forumRoundRectMatrix = new Matrix();
    private static final PathMeasure forumRoundRectPathMeasure = new PathMeasure();
    private static final Path forumSegmentPath = new Path();

    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, AvatarStoryParams avatarStoryParams) {
        drawAvatarWithStory(j, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(j), avatarStoryParams);
    }

    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, boolean z, AvatarStoryParams avatarStoryParams) {
        int predictiveUnreadState;
        int predictiveUnreadState2;
        int i;
        float f;
        float fLerp;
        float f2;
        Canvas canvas2;
        float f3;
        float f4;
        ImageReceiver imageReceiver2;
        AvatarStoryParams avatarStoryParams2;
        StoriesController storiesController;
        boolean z2;
        float f5;
        Paint paint;
        Paint unreadCirclePaint;
        Paint paint2;
        Paint paint3;
        float fDpf2;
        float f6;
        float fDp;
        int unreadState;
        Paint paint4;
        Paint closeFriendsPaint;
        Paint paint5;
        Paint paint6;
        float fDpf3;
        float f7;
        float fDp2;
        GradientTools gradientTools;
        float fDp3;
        StoriesController storiesController2 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z3 = avatarStoryParams.animate;
        if (avatarStoryParams.dialogId != j) {
            avatarStoryParams.dialogId = j;
            avatarStoryParams.reset();
            z3 = false;
        }
        boolean zIsLoading = storiesController2.isLoading(j);
        boolean z4 = ChatObject.isForum(UserConfig.selectedAccount, j) && !avatarStoryParams.isDialogStoriesCell;
        boolean zHasHiddenStories = avatarStoryParams.drawHiddenStoriesAsSegments ? storiesController2.hasHiddenStories() : z;
        if (avatarStoryParams.storyItem != null) {
            storiesController2.getUnreadState(j, avatarStoryParams.storyId);
            zIsLoading = false;
        }
        if (zIsLoading) {
            if (storiesController2.hasStories(j)) {
                predictiveUnreadState = 3;
                predictiveUnreadState2 = 2;
            } else {
                predictiveUnreadState2 = getPredictiveUnreadState(storiesController2, j);
                predictiveUnreadState = 3;
            }
            z3 = false;
        } else if (zHasHiddenStories) {
            if (avatarStoryParams.drawSegments) {
                predictiveUnreadState = 2;
                predictiveUnreadState2 = 2;
            } else {
                int unreadState2 = storiesController2.getUnreadState(j, avatarStoryParams.storyId);
                predictiveUnreadState2 = unreadState2;
                predictiveUnreadState = unreadState2 == 0 ? 2 : 1;
            }
        } else {
            predictiveUnreadState = getPredictiveUnreadState(storiesController2, j);
            predictiveUnreadState2 = predictiveUnreadState;
        }
        int i2 = avatarStoryParams.forceState;
        if (i2 != 0) {
            predictiveUnreadState = i2;
            i = predictiveUnreadState;
        } else {
            i = predictiveUnreadState2;
        }
        int i3 = avatarStoryParams.currentState;
        if (i3 != predictiveUnreadState) {
            if (i3 == 3) {
                z3 = true;
            }
            if (predictiveUnreadState == 3) {
                avatarStoryParams.animateFromUnreadState = i;
                avatarStoryParams.progressToProgressSegments = 0.0f;
            }
            if (z3) {
                avatarStoryParams.prevState = i3;
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
        if (avatarStoryParams.showProgress != zIsLoading && zIsLoading) {
            avatarStoryParams.sweepAngle = 1.0f;
            avatarStoryParams.inc = false;
        }
        avatarStoryParams.showProgress = zIsLoading;
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
        float f8 = storiesController2.hasLiveStory(avatarStoryParams.dialogId) ? avatarStoryParams.progressToSegments : 0.0f;
        float interpolation = avatarStoryParams.progressToSate;
        if (interpolation != 1.0f) {
            interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(interpolation);
        }
        float f9 = interpolation;
        if (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) {
            f = 0.0f;
            fLerp = AndroidUtilities.lerp(getInset(avatarStoryParams.prevState, avatarStoryParams.animateFromUnreadState), getInset(avatarStoryParams.currentState, avatarStoryParams.animateFromUnreadState), avatarStoryParams.progressToSate);
        } else {
            f = 0.0f;
            fLerp = 0.0f;
        }
        if (fLerp == f) {
            imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
        } else {
            RectF rectF = rectTmp;
            rectF.set(avatarStoryParams.originalAvatarRect);
            rectF.inset(fLerp, fLerp);
            imageReceiver.setImageCoords(rectF);
        }
        if (f8 > f) {
            RectF rectF2 = rectTmp;
            f2 = fLerp;
            f3 = 1.0f;
            f4 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF2.left - AndroidUtilities.dp(15.0f), rectF2.top - AndroidUtilities.dp(15.0f), rectF2.right + AndroidUtilities.dp(15.0f), rectF2.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f2 = fLerp;
            canvas2 = canvas;
            f3 = 1.0f;
            f4 = 0.08f;
        }
        if ((avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != f3) || avatarStoryParams.currentState == 1) {
            if (i == 2) {
                getCloseFriendsPaint(imageReceiver);
                gradientTools = closeFriendsGradientTools;
            } else if (i == 3) {
                getLivePaint(imageReceiver);
                gradientTools = liveGradientTools;
            } else {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                gradientTools = storiesGradientTools[avatarStoryParams.isStoryCell ? 1 : 0];
            }
            boolean z5 = avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != f3;
            float f10 = (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z5) {
                fDp3 = f10 + (AndroidUtilities.dp(5.0f) * f9);
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (f3 - f9)));
            } else {
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f9));
                fDp3 = f10 + (AndroidUtilities.dp(5.0f) * (f3 - f9));
            }
            float f11 = fDp3 + avatarStoryParams.additionalInset;
            RectF rectF3 = rectTmp;
            rectF3.set(avatarStoryParams.originalAvatarRect);
            rectF3.inset(f11, f11);
            drawCircleInternal(canvas2, imageReceiver.getParentView(), avatarStoryParams, gradientTools.paint, z4);
        }
        int i4 = avatarStoryParams.prevState;
        if ((i4 != 2 || avatarStoryParams.progressToSate == f3) && avatarStoryParams.currentState != 2) {
            imageReceiver2 = imageReceiver;
            avatarStoryParams2 = avatarStoryParams;
            storiesController = storiesController2;
            z2 = z4;
            f5 = 2.7f;
        } else {
            boolean z6 = i4 == 2 && avatarStoryParams.progressToSate != f3;
            if (avatarStoryParams.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams.isArchive, avatarStoryParams.resourcesProvider);
                paint4 = storyCellGreyPaint[avatarStoryParams.isArchive ? 1 : 0];
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
                    f7 = 0.0f;
                } else {
                    fDpf3 = AndroidUtilities.dpf2(3.5f);
                    f7 = -fDpf3;
                }
            } else if (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) {
                f7 = 0.0f;
            } else {
                fDpf3 = AndroidUtilities.dpf2(2.7f);
                f7 = -fDpf3;
            }
            if (z6) {
                fDp2 = f7 + (AndroidUtilities.dp(5.0f) * f9);
                paint7.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (f3 - f9)));
            } else {
                paint7.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f9));
                fDp2 = f7 + (AndroidUtilities.dp(5.0f) * (f3 - f9));
            }
            float f12 = fDp2 + avatarStoryParams.additionalInset;
            RectF rectF4 = rectTmp;
            f5 = 2.7f;
            rectF4.set(avatarStoryParams.originalAvatarRect);
            rectF4.inset(f12, f12);
            if (avatarStoryParams.drawSegments) {
                imageReceiver2 = imageReceiver;
                storiesController = storiesController2;
                Paint paint8 = closeFriendsPaint;
                avatarStoryParams2 = avatarStoryParams;
                z2 = z4;
                drawSegmentsInternal(canvas2, storiesController, imageReceiver2, avatarStoryParams2, paint7, paint5, paint6, paint8, z2);
            } else {
                imageReceiver2 = imageReceiver;
                avatarStoryParams2 = avatarStoryParams;
                storiesController = storiesController2;
                z2 = z4;
                drawCircleInternal(canvas2, imageReceiver2.getParentView(), avatarStoryParams2, paint7, z2);
            }
        }
        if ((avatarStoryParams2.prevState == 3 && avatarStoryParams2.progressToSate != f3) || avatarStoryParams2.currentState == 3) {
            if (avatarStoryParams2.animateFromUnreadState == 1) {
                getUnreadCirclePaint(imageReceiver2, avatarStoryParams2.isStoryCell);
                paint = storiesGradientTools[avatarStoryParams2.isStoryCell ? 1 : 0].paint;
            } else if (avatarStoryParams2.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams2.isArchive, avatarStoryParams2.resourcesProvider);
                paint = storyCellGreyPaint[avatarStoryParams2.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams2.resourcesProvider);
                paint = grayPaint;
            }
            paint.setAlpha((int) (f9 * 255.0f));
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
                    f6 = 0.0f;
                } else {
                    fDpf2 = AndroidUtilities.dpf2(3.5f);
                    f6 = -fDpf2;
                }
            } else if (!avatarStoryParams2.isStoryCell || avatarStoryParams2.drawInside) {
                f6 = 0.0f;
            } else {
                fDpf2 = AndroidUtilities.dpf2(f5);
                f6 = -fDpf2;
            }
            if (avatarStoryParams2.prevState == 3 && avatarStoryParams2.progressToSate != f3) {
                fDp = f6 + (AndroidUtilities.dp(7.0f) * f9);
                paint.setAlpha((int) (avatarStoryParams2.alpha * 255.0f * (f3 - f9)));
            } else {
                paint.setAlpha((int) (avatarStoryParams2.alpha * 255.0f * f9));
                fDp = f6 + (AndroidUtilities.dp(5.0f) * (f3 - f9));
            }
            float f13 = fDp + avatarStoryParams2.additionalInset;
            RectF rectF5 = rectTmp;
            rectF5.set(avatarStoryParams2.originalAvatarRect);
            rectF5.inset(f13, f13);
            boolean z7 = avatarStoryParams2.drawSegments;
            if (z7 && avatarStoryParams2.currentState == 3) {
                float f14 = avatarStoryParams2.progressToProgressSegments;
                if (f14 != f3) {
                    float f15 = f14 + f4;
                    avatarStoryParams2.progressToProgressSegments = f15;
                    if (f15 > f3) {
                        avatarStoryParams2.progressToProgressSegments = f3;
                    }
                    float f16 = avatarStoryParams2.progressToSegments;
                    avatarStoryParams2.progressToSegments = f3 - avatarStoryParams2.progressToProgressSegments;
                    drawSegmentsInternal(canvas2, storiesController, imageReceiver2, avatarStoryParams2, paint, unreadCirclePaint, paint2, paint3, z2);
                    avatarStoryParams2.progressToSegments = f16;
                    if (imageReceiver2.getParentView() != null) {
                        imageReceiver2.invalidate();
                        imageReceiver2.getParentView().invalidate();
                    }
                } else {
                    if (z7) {
                        unreadState = storiesController.getUnreadState(avatarStoryParams2.dialogId);
                        if (unreadState == 2) {
                            paint = paint3;
                        } else if (unreadState == 3) {
                            paint = paint2;
                        } else if (unreadState == 1) {
                            paint = unreadCirclePaint;
                        }
                    }
                    drawProgress(canvas2, avatarStoryParams2, imageReceiver2.getParentView(), paint);
                }
            } else {
                if (z7) {
                    unreadState = storiesController.getUnreadState(avatarStoryParams2.dialogId);
                    if (unreadState == 2) {
                        paint = paint3;
                    } else if (unreadState == 3) {
                        paint = paint2;
                    } else if (unreadState == 1) {
                        paint = unreadCirclePaint;
                    }
                }
                drawProgress(canvas2, avatarStoryParams2, imageReceiver2.getParentView(), paint);
            }
        }
        imageReceiver2.draw(canvas2);
        avatarStoryParams2.drawnLive = f8 > 0.5f;
        if (f8 > f) {
            float f17 = f2 + avatarStoryParams2.additionalInset;
            RectF rectF6 = rectTmp;
            rectF6.set(avatarStoryParams2.originalAvatarRect);
            rectF6.inset(f17, f17);
            drawLive(canvas2, rectF6, f8, imageReceiver2.getVisible(), 0.0f);
        }
        float f18 = avatarStoryParams2.progressToSate;
        if (f18 != f3) {
            float f19 = f18 + (AndroidUtilities.screenRefreshTime / 250.0f);
            avatarStoryParams2.progressToSate = f19;
            if (f19 > f3) {
                avatarStoryParams2.progressToSate = f3;
            }
            if (imageReceiver2.getParentView() != null) {
                imageReceiver2.invalidate();
                imageReceiver2.getParentView().invalidate();
            }
        }
        if (iSave != 0) {
            canvas2.restoreToCount(iSave);
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
        livePaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_stories_circle_live2), f));
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

    private static void drawSegmentsInternal(Canvas canvas, StoriesController storiesController, ImageReceiver imageReceiver, AvatarStoryParams avatarStoryParams, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z) {
        int unreadState;
        int i;
        int size;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        float f;
        int i2;
        float f2;
        float f3;
        int i3;
        int iMax;
        Paint paint8;
        Paint paint9;
        AvatarStoryParams avatarStoryParams2;
        Paint paint10;
        int unreadState2;
        int iHasUnreadStoriesLive;
        Paint paint11;
        float f4;
        AvatarStoryParams avatarStoryParams3 = avatarStoryParams;
        checkGrayPaint(avatarStoryParams3.resourcesProvider);
        checkStoryCellGrayPaint(avatarStoryParams3.isArchive, avatarStoryParams3.resourcesProvider);
        long j = avatarStoryParams3.crossfadeToDialog;
        if (j != 0) {
            unreadState = storiesController.getUnreadState(j);
        } else {
            unreadState = storiesController.getUnreadState(avatarStoryParams3.dialogId);
        }
        int i4 = 2;
        avatarStoryParams3.globalState = unreadState == 0 ? 2 : 1;
        TL_stories.PeerStories stories = storiesController.getStories(avatarStoryParams3.dialogId);
        if (stories == null) {
            stories = storiesController.getStoriesFromFullPeer(avatarStoryParams3.dialogId);
        }
        TL_stories.PeerStories peerStories = stories;
        if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
            size = storiesController.getHiddenList().size();
        } else {
            if (peerStories == null || peerStories.stories.size() == 1) {
                i = 1;
            } else {
                size = peerStories.stories.size();
            }
            if (unreadState == 2) {
                getCloseFriendsPaint(imageReceiver);
                paint5 = closeFriendsGradientTools.paint;
            } else if (unreadState == 3) {
                getLivePaint(imageReceiver);
                paint5 = liveGradientTools.paint;
            } else if (unreadState == 1) {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams3.isStoryCell);
                paint5 = storiesGradientTools[avatarStoryParams3.isStoryCell ? 1 : 0].paint;
            } else if (avatarStoryParams3.isStoryCell) {
                paint5 = storyCellGreyPaint[avatarStoryParams3.isArchive ? 1 : 0];
            } else {
                paint5 = grayPaint;
            }
            paint6 = paint5;
            if (i <= 1) {
                paint7 = paint6;
                f = 360.0f / i;
                if (i > 20) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                f2 = i2 * avatarStoryParams3.progressToSegments;
                if (f2 > f) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                i3 = 0;
                if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
                    iMax = 0;
                } else {
                    iMax = Math.max(peerStories.max_read_id, storiesController.dialogIdToMaxReadId.get(avatarStoryParams3.dialogId, 0));
                }
                while (i3 < i) {
                    if (avatarStoryParams3.isStoryCell) {
                        paint8 = storyCellGreyPaint[avatarStoryParams3.isArchive ? 1 : 0];
                    } else {
                        paint8 = grayPaint;
                    }
                    if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
                        unreadState2 = storiesController.getUnreadState(DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.getHiddenList().get((i - 1) - i3)).peer));
                        if (unreadState2 == i4) {
                            paint8 = paint4;
                        } else if (unreadState2 == 3) {
                            paint8 = paint3;
                        } else if (unreadState2 == 1) {
                            paint8 = paint2;
                        }
                    } else if (i3 >= peerStories.stories.size()) {
                        paint8 = paint2;
                    } else if (!peerStories.stories.get(i3).justUploaded || peerStories.stories.get(i3).id > iMax) {
                        if (peerStories.stories.get(i3).media instanceof TLRPC.TL_messageMediaVideoStream) {
                            paint8 = paint3;
                        } else if (peerStories.stories.get(i3).close_friends) {
                            paint8 = paint4;
                        } else {
                            paint8 = paint2;
                        }
                    }
                    float f5 = (i3 * f) - 90.0f;
                    float f6 = f5 + f;
                    float f7 = f5 + f3;
                    float f8 = f6 - f3;
                    int i5 = iMax;
                    RectF rectF = rectTmp;
                    paint9 = paint7;
                    int i6 = i3;
                    Paint paint12 = paint8;
                    avatarStoryParams2 = avatarStoryParams3;
                    drawSegment(canvas, rectF, paint12, f7, f8, avatarStoryParams2, z);
                    if (avatarStoryParams2.progressToSegments != 1.0f || paint12 == paint9) {
                        paint10 = paint9;
                    } else {
                        paint9.getStrokeWidth();
                        paint9.setAlpha((int) ((1.0f - avatarStoryParams2.progressToSegments) * 255.0f));
                        drawSegment(canvas, rectF, paint9, f7, f8, avatarStoryParams2, z);
                        paint10 = paint9;
                        paint10.setAlpha(255);
                    }
                    i3 = i6 + 1;
                    avatarStoryParams3 = avatarStoryParams;
                    paint7 = paint10;
                    iMax = i5;
                    i4 = 2;
                }
                return;
            }
            iHasUnreadStoriesLive = storiesController.hasUnreadStoriesLive(avatarStoryParams3.dialogId);
            if (iHasUnreadStoriesLive == 2) {
                paint11 = paint3;
            } else if (paint6 == closeFriendsGradientTools.paint) {
                paint11 = paint4;
            } else if (iHasUnreadStoriesLive == 1) {
                paint11 = paint2;
            } else {
                paint11 = paint;
            }
            RectF rectF2 = rectTmp;
            drawSegment(canvas, rectF2, paint11, -90.0f, 90.0f, avatarStoryParams3, z);
            drawSegment(canvas, rectF2, paint11, 90.0f, 270.0f, avatarStoryParams, z);
            f4 = avatarStoryParams.progressToSegments;
            if (f4 != 1.0f || paint11 == paint6) {
            }
            paint6.setAlpha((int) ((1.0f - f4) * 255.0f));
            drawSegment(canvas, rectF2, paint6, -90.0f, 90.0f, avatarStoryParams, z);
            drawSegment(canvas, rectF2, paint6, 90.0f, 270.0f, avatarStoryParams, z);
            paint6.setAlpha(255);
            return;
        }
        i = size;
        if (unreadState == 2) {
            getCloseFriendsPaint(imageReceiver);
            paint5 = closeFriendsGradientTools.paint;
        } else if (unreadState == 3) {
            getLivePaint(imageReceiver);
            paint5 = liveGradientTools.paint;
        } else if (unreadState == 1) {
            getUnreadCirclePaint(imageReceiver, avatarStoryParams3.isStoryCell);
            paint5 = storiesGradientTools[avatarStoryParams3.isStoryCell ? 1 : 0].paint;
        } else if (avatarStoryParams3.isStoryCell) {
            paint5 = storyCellGreyPaint[avatarStoryParams3.isArchive ? 1 : 0];
        } else {
            paint5 = grayPaint;
        }
        paint6 = paint5;
        if (i <= 1) {
            paint7 = paint6;
            f = 360.0f / i;
            if (i > 20) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            f2 = i2 * avatarStoryParams3.progressToSegments;
            if (f2 > f) {
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            i3 = 0;
            if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
                iMax = 0;
            } else {
                iMax = Math.max(peerStories.max_read_id, storiesController.dialogIdToMaxReadId.get(avatarStoryParams3.dialogId, 0));
            }
            while (i3 < i) {
                if (avatarStoryParams3.isStoryCell) {
                    paint8 = storyCellGreyPaint[avatarStoryParams3.isArchive ? 1 : 0];
                } else {
                    paint8 = grayPaint;
                }
                if (avatarStoryParams3.drawHiddenStoriesAsSegments) {
                    unreadState2 = storiesController.getUnreadState(DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.getHiddenList().get((i - 1) - i3)).peer));
                    if (unreadState2 == i4) {
                        paint8 = paint4;
                    } else if (unreadState2 == 3) {
                        paint8 = paint3;
                    } else if (unreadState2 == 1) {
                        paint8 = paint2;
                    }
                } else if (i3 >= peerStories.stories.size()) {
                    if (!peerStories.stories.get(i3).justUploaded) {
                    }
                    if (peerStories.stories.get(i3).media instanceof TLRPC.TL_messageMediaVideoStream) {
                        paint8 = paint3;
                    } else if (peerStories.stories.get(i3).close_friends) {
                        paint8 = paint4;
                    } else {
                        paint8 = paint2;
                    }
                } else {
                    paint8 = paint2;
                }
                float f9 = (i3 * f) - 90.0f;
                float f10 = f9 + f;
                float f11 = f9 + f3;
                float f12 = f10 - f3;
                int i7 = iMax;
                RectF rectF3 = rectTmp;
                paint9 = paint7;
                int i8 = i3;
                Paint paint13 = paint8;
                avatarStoryParams2 = avatarStoryParams3;
                drawSegment(canvas, rectF3, paint13, f11, f12, avatarStoryParams2, z);
                if (avatarStoryParams2.progressToSegments != 1.0f) {
                    paint10 = paint9;
                } else {
                    paint10 = paint9;
                }
                i3 = i8 + 1;
                avatarStoryParams3 = avatarStoryParams;
                paint7 = paint10;
                iMax = i7;
                i4 = 2;
            }
            return;
        }
        iHasUnreadStoriesLive = storiesController.hasUnreadStoriesLive(avatarStoryParams3.dialogId);
        if (iHasUnreadStoriesLive == 2) {
            paint11 = paint3;
        } else if (paint6 == closeFriendsGradientTools.paint) {
            paint11 = paint4;
        } else if (iHasUnreadStoriesLive == 1) {
            paint11 = paint2;
        } else {
            paint11 = paint;
        }
        RectF rectF4 = rectTmp;
        drawSegment(canvas, rectF4, paint11, -90.0f, 90.0f, avatarStoryParams3, z);
        drawSegment(canvas, rectF4, paint11, 90.0f, 270.0f, avatarStoryParams, z);
        f4 = avatarStoryParams.progressToSegments;
        if (f4 != 1.0f) {
        }
    }

    public static int getPredictiveUnreadState(StoriesController storiesController, long j) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j == 0) {
            return 0;
        }
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
            if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
                return 0;
            }
            int i = storiesController.dialogIdToMaxReadId.get(j, 0);
            TLRPC.TL_recentStory tL_recentStory3 = user.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i ? 1 : 2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
            return 0;
        }
        int i2 = storiesController.dialogIdToMaxReadId.get(j, 0);
        TLRPC.TL_recentStory tL_recentStory4 = chat.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i2 ? 1 : 2;
    }

    private static void drawProgress(Canvas canvas, AvatarStoryParams avatarStoryParams, View view, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        avatarStoryParams.updateProgressParams();
        view.invalidate();
        if (avatarStoryParams.inc) {
            canvas.drawArc(rectTmp, avatarStoryParams.globalAngle, avatarStoryParams.sweepAngle * 360.0f, false, paint);
            paint2 = paint;
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            paint2 = paint;
            canvas2.drawArc(rectTmp, avatarStoryParams.globalAngle + 360.0f, avatarStoryParams.sweepAngle * (-360.0f), false, paint2);
        }
        for (int i = 0; i < 16; i++) {
            float f = (i * 22.5f) + 10.0f;
            canvas2.drawArc(rectTmp, avatarStoryParams.globalAngle + f, ((22.5f + f) - 10.0f) - f, false, paint2);
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
        int[] iArr = storyCellGrayLastColor;
        if (iArr[z ? 1 : 0] != color) {
            iArr[z ? 1 : 0] = color;
            float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (fComputePerceivedBrightness >= 0.721f) {
                storyCellGreyPaint[z ? 1 : 0].setColor(ColorUtils.blendARGB(color, -16777216, 0.2f));
            } else if (fComputePerceivedBrightness < 0.25f) {
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
            float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (fComputePerceivedBrightness >= 0.721f) {
                grayPaint.setColor(ColorUtils.blendARGB(color, -16777216, 0.2f));
            } else if (fComputePerceivedBrightness < 0.25f) {
                grayPaint.setColor(ColorUtils.blendARGB(color, -1, 0.2f));
            } else {
                grayPaint.setColor(ColorUtils.blendARGB(color, -1, 0.44f));
            }
        }
    }

    private static void drawCircleInternal(Canvas canvas, View view, AvatarStoryParams avatarStoryParams, Paint paint, boolean z) {
        if (z) {
            RectF rectF = forumRect;
            rectF.set(rectTmp);
            rectF.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f = avatarStoryParams.progressToArc;
        if (f == 0.0f) {
            RectF rectF2 = rectTmp;
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectTmp, (f / 2.0f) + 360.0f, 360.0f - f, false, paint);
        }
    }

    private static void drawSegment(Canvas canvas, RectF rectF, Paint paint, float f, float f2, AvatarStoryParams avatarStoryParams, boolean z) {
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
        if (avatarStoryParams.useArcProgress) {
            boolean z2 = avatarStoryParams.isFirst;
            if (!z2 && !avatarStoryParams.isLast) {
                if (f < 90.0f) {
                    float f5 = avatarStoryParams.progressToArc;
                    drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f5) / 2.0f, f5 / 2.0f);
                    return;
                } else {
                    float f6 = avatarStoryParams.progressToArc;
                    drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f6) / 2.0f) + 180.0f, (f6 / 2.0f) + 180.0f);
                    return;
                }
            }
            if (avatarStoryParams.isLast) {
                float f7 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f7) / 2.0f) + 180.0f, (f7 / 2.0f) + 180.0f);
                return;
            } else if (z2) {
                float f8 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f8) / 2.0f, f8 / 2.0f);
                return;
            } else {
                canvas.drawArc(rectF, f, f2 - f, false, paint);
                return;
            }
        }
        if (avatarStoryParams.isLast) {
            float f9 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f9) / 2.0f) + 180.0f, (f9 / 2.0f) + 180.0f);
        } else if (f < 90.0f) {
            drawArcExcludeArc(canvas, rectF, paint, f, f2, avatarStoryParams.rightTopAngleToExclude, avatarStoryParams.rightBottomAngleToExclude);
        } else {
            drawArcExcludeArc(canvas, rectF, paint, f, f2, -avatarStoryParams.leftTopAngleToExclude, avatarStoryParams.leftBottomAngleToExclude);
        }
    }

    public static int getInset(int i, int i2) {
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

    private static void checkStoriesGradientTools(boolean z) {
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if (gradientToolsArr[z ? 1 : 0] == null) {
            gradientToolsArr[z ? 1 : 0] = new GradientTools();
            GradientTools gradientTools = storiesGradientTools[z ? 1 : 0];
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            if (z) {
                gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2));
            } else {
                gradientTools.setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2));
            }
            storiesGradientTools[z ? 1 : 0].paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            storiesGradientTools[z ? 1 : 0].paint.setStyle(Paint.Style.STROKE);
            storiesGradientTools[z ? 1 : 0].paint.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    public static void updateColors() {
        GradientTools gradientTools = closeFriendsGradientTools;
        if (gradientTools != null) {
            gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_closeFriends1), Theme.getColor(Theme.key_stories_circle_closeFriends2));
        }
        GradientTools gradientTools2 = liveGradientTools;
        if (gradientTools2 != null) {
            gradientTools2.setColors(Theme.getColor(Theme.key_stories_circle_live1), Theme.getColor(Theme.key_stories_circle_live2));
        }
        GradientTools gradientTools3 = storiesGradientTools[0];
        if (gradientTools3 != null) {
            gradientTools3.setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2));
        }
        GradientTools gradientTools4 = storiesGradientTools[1];
        if (gradientTools4 != null) {
            gradientTools4.setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2));
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
            closeFriendsGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            closeFriendsGradientTools.paint.setStyle(Paint.Style.STROKE);
            closeFriendsGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        closeFriendsGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return closeFriendsGradientTools.paint;
    }

    public static Paint getLivePaint(ImageReceiver imageReceiver) {
        if (liveGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            liveGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_live1), Theme.getColor(Theme.key_stories_circle_live2));
            liveGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            liveGradientTools.paint.setStyle(Paint.Style.STROKE);
            liveGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        liveGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return liveGradientTools.paint;
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
            errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
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
            errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            errorGradientTools.paint.setStyle(Paint.Style.STROKE);
            errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        errorGradientTools.setBounds(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return errorGradientTools.paint;
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
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    public static void setImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        setImage(imageReceiver, storyItem, "320_320");
    }

    public static void setImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem, String str) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, Integer.MAX_VALUE), storyItem.media.document), str, null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
            imageReceiver.setImageBitmap(bitmapCreateBitmap);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            return;
        }
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), str, null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
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

    public static void setThumbImage(AvatarDrawable avatarDrawable, ImageReceiver imageReceiver, TL_stories.StoryItem storyItem, int i, int i2) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            avatarDrawable.setInfo(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, avatarDrawable);
            return;
        }
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), storyItem.media.document), i + "_" + i2, null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), photo), i + "_" + i2, null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            return;
        }
        imageReceiver.clearImage();
    }

    public static Drawable getExpiredStoryDrawable() {
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

    public static CharSequence getUploadingStr(TextView textView, boolean z, boolean z2) {
        String string;
        if (z2) {
            string = LocaleController.getString(R.string.StoryEditing);
        } else {
            string = LocaleController.getString(R.string.UploadingStory);
        }
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
        UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
        spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
        uploadingDotsSpannable.setParent(textView, z);
        return spannableStringBuilderValueOf;
    }

    public static void applyUploadingStr(SimpleTextView simpleTextView, boolean z, boolean z2) {
        String string;
        if (z2) {
            string = LocaleController.getString(R.string.StoryEditing);
        } else {
            string = LocaleController.getString(R.string.UploadingStory);
        }
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
            UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
            spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
            uploadingDotsSpannable.setParent(simpleTextView, z);
            simpleTextView.setText(spannableStringBuilderValueOf);
            return;
        }
        simpleTextView.setText(string);
    }

    public static CharSequence createExpiredStoryString() {
        return createExpiredStoryString(false, R.string.ExpiredStory, new Object[0]);
    }

    public static CharSequence createExpiredStoryString(boolean z, int i, Object... objArr) {
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

    public static CharSequence createReplyStoryString() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_replystory2), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static boolean hasExpiredViews(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static void applyViewedUser(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || hasExpiredViews(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
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

    public static boolean isExpired(int i, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i).getCurrentTime() > storyItem.expire_date;
    }

    public static String getStoryImageFilter() {
        int iMax = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return iMax + "_" + iMax;
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

    public static EnsureStoryFileLoadedObject ensureStoryFileLoaded(TL_stories.PeerStories peerStories, final Runnable runnable) {
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
        if (messageMedia != null && messageMedia.document != null) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
            if (pathToAttach2 != null) {
                try {
                    int iLastIndexOf = pathToAttach2.getName().lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        File file = new File(pathToAttach2.getParentFile(), pathToAttach2.getName().substring(0, iLastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo != null && (arrayList = photo.sizes) != null) {
                File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), "", false);
                if (pathToAttach3 != null && pathToAttach3.exists()) {
                    runnable.run();
                    return null;
                }
            } else {
                runnable.run();
                return null;
            }
        }
        final EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = new EnsureStoryFileLoadedObject(storiesController, DialogObject.getPeerDialogId(peerStories.peer));
        ensureStoryFileLoadedObject.runnable = new Runnable() {
            @Override
            public final void run() {
                StoriesUtilities.m4434$r8$lambda$vj5KJCnxfshabut8bbOCF844fQ(ensureStoryFileLoadedObject, runnable);
            }
        };
        final Runnable[] runnableArr = {runnable};
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                StoriesUtilities.m4433$r8$lambda$kfHW3kZyQMzq2sFs9GFKip6YvU(runnableArr, ensureStoryFileLoadedObject);
            }
        };
        AndroidUtilities.runOnUIThread(runnable2, 3000L);
        ImageReceiver imageReceiver = new ImageReceiver() {
            @Override
            protected boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i3, z, i4);
                Runnable runnable3 = runnableArr[0];
                if (runnable3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable3);
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
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 != null && (document = messageMedia2.document) != null) {
            ensureStoryFileLoadedObject.imageReceiver.setImage(ImageLocation.getForDocument(document), storyImageFilter + "_pframe", null, null, null, 0L, null, storyItem2, 0);
        } else {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                ensureStoryFileLoadedObject.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), storyImageFilter, null, null, null, 0L, null, storyItem2, 0);
            } else {
                ensureStoryFileLoadedObject.runnable.run();
                return null;
            }
        }
        return ensureStoryFileLoadedObject;
    }

    public static void m4434$r8$lambda$vj5KJCnxfshabut8bbOCF844fQ(EnsureStoryFileLoadedObject ensureStoryFileLoadedObject, Runnable runnable) {
        if (ensureStoryFileLoadedObject.cancelled) {
            return;
        }
        runnable.run();
    }

    public static void m4433$r8$lambda$kfHW3kZyQMzq2sFs9GFKip6YvU(Runnable[] runnableArr, EnsureStoryFileLoadedObject ensureStoryFileLoadedObject) {
        runnableArr[0] = null;
        ensureStoryFileLoadedObject.runnable.run();
        ImageReceiver imageReceiver = ensureStoryFileLoadedObject.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    public static class AvatarStoryParams {
        public float additionalInset;
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
        public float leftBottomAngleToExclude;
        public float leftTopAngleToExclude;
        Runnable longPressRunnable;
        UserStoriesLoadOperation operation;
        public RectF originalAvatarRect;
        boolean pressed;
        public int prevState;
        public int prevUnreadState;
        public float progressToArc;
        public float progressToProgressSegments;
        public float progressToSate;
        public float progressToSegments;
        public Theme.ResourcesProvider resourcesProvider;
        public float rightBottomAngleToExclude;
        public float rightTopAngleToExclude;
        public boolean showProgress;
        float startX;
        float startY;
        public int storyId;
        public TL_stories.StoryItem storyItem;
        float sweepAngle;
        public int unreadState;
        public boolean useArcProgress;

        public boolean isAvatarClickable(long j, TLRPC.Chat chat, TLRPC.User user) {
            return false;
        }

        public boolean onAvatarClick(View view, long j) {
            return false;
        }

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
            this.rightTopAngleToExclude = 0.0f;
            this.rightBottomAngleToExclude = 0.0f;
            this.leftTopAngleToExclude = 0.0f;
            this.leftBottomAngleToExclude = 0.0f;
            this.useArcProgress = true;
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
            TLRPC.User user;
            TLRPC.TL_recentStory tL_recentStory;
            TLRPC.TL_recentStory tL_recentStory2;
            this.child = view;
            StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            boolean zHasHiddenStories = false;
            if (motionEvent.getAction() == 0 && this.originalAvatarRect.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.dialogId > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.dialogId));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.dialogId));
                }
                if (isAvatarClickable(this.dialogId, chat, user)) {
                    zHasHiddenStories = true;
                } else if (this.drawHiddenStoriesAsSegments) {
                    zHasHiddenStories = storiesController.hasHiddenStories();
                } else if (this.dialogId <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (chat != null && !chat.stories_unavailable && (tL_recentStory = chat.stories_max_id) != null && tL_recentStory.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (user != null && !user.stories_unavailable && (tL_recentStory2 = user.stories_max_id) != null && tL_recentStory2.max_id > 0)) {
                    zHasHiddenStories = true;
                }
                if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && zHasHiddenStories) {
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
                                StoriesUtilities.AvatarStoryParams.$r8$lambda$bxRP298Az0bVbN1hS11eDhfJsy4(this.f$0, view);
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

        public static void $r8$lambda$bxRP298Az0bVbN1hS11eDhfJsy4(AvatarStoryParams avatarStoryParams, View view) {
            avatarStoryParams.getClass();
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
            if (buttonBounce != null) {
                buttonBounce.setPressed(false);
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            avatarStoryParams.pressed = false;
            avatarStoryParams.onLongPress();
        }

        private void processOpenStory(View view) {
            TLRPC.TL_recentStory tL_recentStory;
            TLRPC.TL_recentStory tL_recentStory2;
            if (onAvatarClick(view, this.dialogId)) {
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            StoriesController storiesController = messagesController.getStoriesController();
            if (this.drawHiddenStoriesAsSegments) {
                openStory(0L, null);
                return;
            }
            if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                if (storiesController.hasStories(this.dialogId)) {
                    openStory(this.dialogId, null);
                    return;
                }
                long j = this.dialogId;
                if (j > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(j));
                    if (user == null || user.stories_unavailable || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0) {
                        return;
                    }
                    new UserStoriesLoadOperation().load(this.dialogId, view, this);
                    return;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
                if (chat == null || chat.stories_unavailable || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0) {
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
        boolean canceled;
        private int currentAccount;
        long dialogId;
        int guid = ConnectionsManager.generateClassGuid();
        AvatarStoryParams params;
        int reqId;
        View view;

        void load(final long j, final View view, final AvatarStoryParams avatarStoryParams) {
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            this.dialogId = j;
            this.params = avatarStoryParams;
            this.view = view;
            final MessagesController messagesController = MessagesController.getInstance(i);
            messagesController.getStoriesController().setLoading(j, true);
            view.invalidate();
            TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
            tL_stories_getPeerStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesUtilities.UserStoriesLoadOperation.$r8$lambda$4HQM__sx8sZeYET9UW4eInkO1FM(this.f$0, j, view, avatarStoryParams, messagesController, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$4HQM__sx8sZeYET9UW4eInkO1FM(final UserStoriesLoadOperation userStoriesLoadOperation, final long j, final View view, final AvatarStoryParams avatarStoryParams, final MessagesController messagesController, final TLObject tLObject, TLRPC.TL_error tL_error) {
            userStoriesLoadOperation.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesUtilities.UserStoriesLoadOperation.m4435$r8$lambda$qhT2XRmDn5TPVmximJlbpw7f5M(this.f$0, tLObject, j, view, avatarStoryParams, messagesController);
                }
            });
        }

        public static void m4435$r8$lambda$qhT2XRmDn5TPVmximJlbpw7f5M(UserStoriesLoadOperation userStoriesLoadOperation, TLObject tLObject, long j, View view, final AvatarStoryParams avatarStoryParams, MessagesController messagesController) {
            final UserStoriesLoadOperation userStoriesLoadOperation2;
            final long j2;
            final View view2;
            boolean z;
            TLRPC.Chat chat;
            TLRPC.User user;
            userStoriesLoadOperation.getClass();
            if (tLObject != null) {
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(userStoriesLoadOperation.currentAccount).putUsers(tL_stories_peerStories.users, false);
                MessagesController.getInstance(userStoriesLoadOperation.currentAccount).putChats(tL_stories_peerStories.chats, false);
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                if (peerStories.stories.isEmpty()) {
                    userStoriesLoadOperation2 = userStoriesLoadOperation;
                    j2 = j;
                    view2 = view;
                    z = true;
                } else {
                    MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().putStories(j, peerStories);
                    userStoriesLoadOperation2 = userStoriesLoadOperation;
                    j2 = j;
                    view2 = view;
                    StoriesUtilities.ensureStoryFileLoaded(peerStories, new Runnable() {
                        @Override
                        public final void run() {
                            StoriesUtilities.UserStoriesLoadOperation.m4436$r8$lambda$wc2gIjODncCXT3ensLLJQ5LDOE(this.f$0, view2, j2, avatarStoryParams);
                        }
                    });
                    z = false;
                }
            } else {
                userStoriesLoadOperation2 = userStoriesLoadOperation;
                j2 = j;
                view2 = view;
                z = true;
            }
            if (j2 > 0 && (user = messagesController.getUser(Long.valueOf(j2))) != null) {
                user.stories_unavailable = true;
                MessagesStorage.getInstance(userStoriesLoadOperation2.currentAccount).putUsersAndChats(Collections.singletonList(user), null, false, true);
                messagesController.putUser(user, false);
            }
            if (j2 < 0 && (chat = messagesController.getChat(Long.valueOf(-j2))) != null) {
                chat.stories_unavailable = true;
                MessagesStorage.getInstance(userStoriesLoadOperation2.currentAccount).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                messagesController.putChat(chat, false);
            }
            if (z) {
                view2.invalidate();
                MessagesController.getInstance(userStoriesLoadOperation2.currentAccount).getStoriesController().setLoading(j2, false);
            }
        }

        public static void m4436$r8$lambda$wc2gIjODncCXT3ensLLJQ5LDOE(final UserStoriesLoadOperation userStoriesLoadOperation, final View view, final long j, AvatarStoryParams avatarStoryParams) {
            userStoriesLoadOperation.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesUtilities.UserStoriesLoadOperation.$r8$lambda$FWzDKjcuI1fH0U61pPHWS6NNKvE(this.f$0, view, j);
                }
            }, 500L);
            avatarStoryParams.openStory(j, null);
        }

        public static void $r8$lambda$FWzDKjcuI1fH0U61pPHWS6NNKvE(UserStoriesLoadOperation userStoriesLoadOperation, View view, long j) {
            userStoriesLoadOperation.getClass();
            view.invalidate();
            MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().setLoading(j, false);
        }

        void cancel() {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, false);
            this.canceled = true;
            this.params = null;
        }
    }

    public static class StoryGradientTools {
        private final AnimatedColor animatedColor1;
        private final AnimatedColor animatedColor2;
        private int color1;
        private int color2;
        public final int currentAccount;
        private final Runnable invalidate;
        private final boolean isDialogCell;
        private final GradientTools tools;

        public StoryGradientTools(View view, boolean z) {
            this(new Shaker$$ExternalSyntheticLambda0(view), z);
            Objects.requireNonNull(view);
        }

        public StoryGradientTools(Runnable runnable, boolean z) {
            this.currentAccount = UserConfig.selectedAccount;
            this.invalidate = runnable;
            this.isDialogCell = z;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedColor1 = new AnimatedColor(runnable, 350L, cubicBezierInterpolator);
            this.animatedColor2 = new AnimatedColor(runnable, 350L, cubicBezierInterpolator);
            GradientTools gradientTools = new GradientTools();
            this.tools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            resetColors(false);
            gradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            gradientTools.paint.setStyle(Paint.Style.STROKE);
            gradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }

        public void setUser(TLRPC.User user, boolean z) {
            TLRPC.PeerColor peerColor;
            setColorId((user == null || (peerColor = user.profile_color) == null) ? -1 : peerColor.color, z);
        }

        public void setChat(TLRPC.Chat chat, boolean z) {
            TLRPC.PeerColor peerColor;
            setColorId((chat == null || (peerColor = chat.profile_color) == null) ? -1 : peerColor.color, z);
        }

        public void setColorId(int i, boolean z) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
            setColor(peerColors == null ? null : peerColors.getColor(i), z);
        }

        public void setColor(MessagesController.PeerColor peerColor, boolean z) {
            if (peerColor != null) {
                setColors(peerColor.getStoryColor1(Theme.isCurrentThemeDark()), peerColor.getStoryColor2(Theme.isCurrentThemeDark()), z);
            } else {
                resetColors(z);
            }
        }

        private void resetColors(boolean z) {
            if (this.isDialogCell) {
                setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2), z);
            } else {
                setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2), z);
            }
        }

        private void setColors(int i, int i2, boolean z) {
            this.color1 = i;
            this.color2 = i2;
            if (!z) {
                this.animatedColor1.set(i, true);
                this.animatedColor2.set(i2, true);
            }
            Runnable runnable = this.invalidate;
            if (runnable != null) {
                runnable.run();
            }
        }

        public Paint getPaint(RectF rectF) {
            this.tools.setColors(this.animatedColor1.set(this.color1), this.animatedColor2.set(this.color2));
            this.tools.setBounds(rectF.left, rectF.top, rectF.right, rectF.bottom);
            return this.tools.paint;
        }
    }
}
