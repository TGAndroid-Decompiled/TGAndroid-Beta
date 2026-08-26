package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Random;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Stories.StoriesGradientTools;

public class AvatarsDrawable {
    public static final int STYLE_GROUP_CALL_TOOLTIP = 10;
    public static final int STYLE_MESSAGE_SEEN = 11;
    private boolean attached;
    boolean centered;
    public int count;
    int currentStyle;
    public boolean drawStoriesCircle;
    public int height;
    private boolean isInCall;
    public float maxX;
    private int overrideSize;
    View parent;
    private boolean showSavedMessages;
    StoriesGradientTools storiesTools;
    private boolean transitionInProgress;
    ValueAnimator transitionProgressAnimator;
    boolean updateAfterTransition;
    Runnable updateDelegate;
    boolean wasDraw;
    public int width;
    public DrawingState[] currentStates = new DrawingState[3];
    public DrawingState[] animatingStates = new DrawingState[3];
    float transitionProgress = 1.0f;
    private Paint paint = new Paint(1);
    private Paint xRefP = new Paint(1);
    public int strokeWidth = AndroidUtilities.dp(1.67f);
    private float overrideSizeStepFactor = 0.8f;
    private float overrideAlpha = 1.0f;
    public long transitionDuration = 220;
    public Interpolator transitionInterpolator = CubicBezierInterpolator.DEFAULT;
    Random random = new Random();

    public static class DrawingState {
        public static final int ANIMATION_TYPE_IN = 0;
        public static final int ANIMATION_TYPE_MOVE = 2;
        public static final int ANIMATION_TYPE_NONE = -1;
        public static final int ANIMATION_TYPE_OUT = 1;
        private int animationType;
        public AvatarDrawable avatarDrawable;
        private long id;
        private ImageReceiver imageReceiver;
        private long lastSpeakTime;
        private long lastUpdateTime;
        private int moveFromIndex;
        private TLObject object;
        TLRPC.GroupCallParticipant participant;
        private GroupCallUserCell.AvatarWavesDrawable wavesDrawable;
    }

    public AvatarsDrawable(View view, boolean z) {
        this.parent = view;
        for (int i = 0; i < 3; i++) {
            this.currentStates[i] = new DrawingState();
            this.currentStates[i].imageReceiver = new ImageReceiver(view);
            this.currentStates[i].imageReceiver.setInvalidateAll(true);
            this.currentStates[i].imageReceiver.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.currentStates[i].avatarDrawable = new AvatarDrawable();
            this.currentStates[i].avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            this.animatingStates[i] = new DrawingState();
            this.animatingStates[i].imageReceiver = new ImageReceiver(view);
            this.animatingStates[i].imageReceiver.setInvalidateAll(true);
            this.animatingStates[i].imageReceiver.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.animatingStates[i].avatarDrawable = new AvatarDrawable();
            this.animatingStates[i].avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.isInCall = z;
        this.xRefP.setColor(0);
        this.xRefP.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void invalidate() {
        View view = this.parent;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$commitTransition$0(ValueAnimator valueAnimator) {
        this.transitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void swapStates() {
        for (int i = 0; i < 3; i++) {
            DrawingState[] drawingStateArr = this.currentStates;
            DrawingState drawingState = drawingStateArr[i];
            DrawingState[] drawingStateArr2 = this.animatingStates;
            drawingStateArr[i] = drawingStateArr2[i];
            drawingStateArr2[i] = drawingState;
        }
    }

    public void animateFromState(AvatarsDrawable avatarsDrawable, int i, boolean z) {
        if (avatarsDrawable == null) {
            return;
        }
        ValueAnimator valueAnimator = avatarsDrawable.transitionProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.transitionInProgress) {
                this.transitionInProgress = false;
                swapStates();
            }
        }
        TLObject[] tLObjectArr = new TLObject[3];
        for (int i2 = 0; i2 < 3; i2++) {
            tLObjectArr[i2] = this.currentStates[i2].object;
            setObject(i2, i, avatarsDrawable.currentStates[i2].object);
        }
        commitTransition(false);
        for (int i3 = 0; i3 < 3; i3++) {
            setObject(i3, i, tLObjectArr[i3]);
        }
        this.wasDraw = true;
        commitTransition(true, z);
    }

    public void commitTransition(boolean z) {
        commitTransition(z, true);
    }

    public float getMaxX() {
        return this.maxX;
    }

    public int getSize() {
        int i = this.overrideSize;
        if (i != 0) {
            return i;
        }
        int i2 = this.currentStyle;
        return AndroidUtilities.dp((i2 == 4 || i2 == 10) ? 32.0f : 24.0f);
    }

    public float getUsedWidth() {
        int iDp;
        int i = this.currentStyle;
        boolean z = i == 4 || i == 10;
        if (i == 11) {
            iDp = AndroidUtilities.dp(12.0f);
        } else {
            int i2 = this.overrideSize;
            iDp = i2 != 0 ? (int) (i2 * this.overrideSizeStepFactor) : AndroidUtilities.dp(z ? 24.0f : 20.0f);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (this.currentStates[i4].id != 0) {
                i3++;
            }
        }
        return (Math.max(0, i3 - 1) * iDp) + (i3 > 0 ? getSize() : 0);
    }

    public void onAttachedToWindow() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        for (int i = 0; i < 3; i++) {
            this.currentStates[i].imageReceiver.onAttachedToWindow();
            this.animatingStates[i].imageReceiver.onAttachedToWindow();
        }
    }

    public void onDetachedFromWindow() {
        if (this.attached) {
            this.attached = false;
            this.wasDraw = false;
            for (int i = 0; i < 3; i++) {
                this.currentStates[i].imageReceiver.onDetachedFromWindow();
                this.animatingStates[i].imageReceiver.onDetachedFromWindow();
            }
            if (this.currentStyle == 3) {
                Theme.getFragmentContextViewWavesDrawable().setAmplitude(0.0f);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        int iDp;
        Canvas canvas2;
        int i;
        float f;
        boolean z;
        float f2;
        float f3;
        int i2;
        float f4;
        DrawingState drawingState;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float avatarScale;
        float f5;
        float f6;
        int iM$2;
        float f7;
        float f8;
        int iM$3;
        float f9;
        boolean z2;
        int iM$4;
        int iM$5;
        int i3 = 1;
        this.wasDraw = true;
        int i4 = this.currentStyle;
        int i5 = 10;
        boolean z3 = i4 == 4 || i4 == 10;
        int size = getSize();
        int i6 = 11;
        if (this.currentStyle == 11) {
            iDp = AndroidUtilities.dp(12.0f);
        } else {
            int i7 = this.overrideSize;
            iDp = i7 != 0 ? (int) (i7 * this.overrideSizeStepFactor) : AndroidUtilities.dp(z3 ? 24.0f : 20.0f);
        }
        int i8 = iDp;
        for (int i9 = 0; i9 < 3; i9++) {
            long unused = this.currentStates[i9].id;
        }
        int i10 = this.currentStyle;
        int iDp2 = (i10 == 0 || i10 == 10 || i10 == 11) ? 0 : AndroidUtilities.dp(10.0f);
        int usedWidth = this.centered ? (this.width - ((int) getUsedWidth())) / 2 : iDp2;
        boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i11 = this.currentStyle;
        if (i11 == 4) {
            this.paint.setColor(Theme.getColor(null, Theme.key_inappPlayerBackground, false));
        } else if (i11 != 3) {
            this.paint.setColor(Theme.getColor(null, z4 ? Theme.key_returnToCallMutedBackground : Theme.key_returnToCallBackground, false));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.animatingStates[i13].id != 0) {
                i12++;
            }
        }
        int i14 = this.currentStyle;
        boolean z5 = i14 == 0 || i14 == 1 || i14 == 3 || i14 == 4 || i14 == 5 || i14 == 10 || i14 == 11;
        if (z5) {
            float fDp = i14 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
            if (this.drawStoriesCircle) {
                fDp += AndroidUtilities.dp(20.0f);
            }
            float f10 = -fDp;
            float f11 = this.width + fDp;
            float f12 = this.height + fDp;
            canvas2 = canvas;
            i = 2;
            f = 0.0f;
            canvas2.saveLayerAlpha(f10, f10, f11, f12, 255, 31);
        } else {
            canvas2 = canvas;
            i = 2;
            f = 0.0f;
        }
        this.maxX = f;
        float f13 = 1.0f;
        if (this.drawStoriesCircle) {
            int i15 = 2;
            while (i15 >= 0) {
                int i16 = 0;
                while (i16 < i) {
                    if (i16 != 0 || this.transitionProgress != f13) {
                        DrawingState[] drawingStateArr = i16 == 0 ? this.animatingStates : this.currentStates;
                        if (i16 != i3 || this.transitionProgress == f13 || drawingStateArr[i15].animationType == i3) {
                            ImageReceiver imageReceiver = drawingStateArr[i15].imageReceiver;
                            if (imageReceiver.hasImageSet()) {
                                if (i16 == 0) {
                                    if (this.centered) {
                                        iM$5 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i12 * i8), i);
                                    } else {
                                        iM$5 = iDp2;
                                    }
                                    imageReceiver.setImageX((i8 * i15) + iM$5);
                                } else {
                                    imageReceiver.setImageX((i8 * i15) + usedWidth);
                                }
                                int i17 = this.currentStyle;
                                if (i17 == 0 || i17 == i5 || i17 == i6) {
                                    imageReceiver.setImageY((this.height - size) / 2.0f);
                                } else {
                                    imageReceiver.setImageY(AndroidUtilities.dp(i17 == 4 ? 8.0f : 6.0f));
                                }
                                if (this.transitionProgress == f13) {
                                    f9 = 1.0f;
                                    z2 = false;
                                } else {
                                    if (drawingStateArr[i15].animationType == i3) {
                                        canvas2.save();
                                        float f14 = f13 - this.transitionProgress;
                                        canvas2.scale(f14, f14, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f9 = f13 - this.transitionProgress;
                                    } else if (drawingStateArr[i15].animationType == 0) {
                                        canvas2.save();
                                        float f15 = this.transitionProgress;
                                        canvas2.scale(f15, f15, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f9 = this.transitionProgress;
                                    } else {
                                        if (drawingStateArr[i15].animationType == i) {
                                            if (this.centered) {
                                                iM$4 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i12 * i8), i);
                                            } else {
                                                iM$4 = iDp2;
                                            }
                                            int i18 = (i8 * i15) + iM$4;
                                            int i19 = (drawingStateArr[i15].moveFromIndex * i8) + usedWidth;
                                            float f16 = i18;
                                            float f17 = this.transitionProgress;
                                            imageReceiver.setImageX((int) DiffUtil.m(f13, f17, i19, f16 * f17));
                                        } else if (drawingStateArr[i15].animationType == -1 && this.centered) {
                                            int i20 = i8 * i15;
                                            int iM$6 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i12 * i8), i) + i20;
                                            float f18 = this.transitionProgress;
                                            imageReceiver.setImageX((int) DiffUtil.m(f13, f18, usedWidth + i20, iM$6 * f18));
                                        }
                                        f9 = 1.0f;
                                        z2 = false;
                                    }
                                    z2 = true;
                                }
                                float f19 = f9 * this.overrideAlpha;
                                float size2 = (getSize() / 2.0f) + AndroidUtilities.dp(4.0f);
                                if (this.storiesTools == null) {
                                    this.storiesTools = new StoriesGradientTools();
                                }
                                this.storiesTools.setBounds(0.0f, 0.0f, this.parent.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                this.storiesTools.paint.setAlpha((int) (f19 * 255.0f));
                                canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), size2, this.storiesTools.paint);
                                if (z2) {
                                    canvas2.restore();
                                }
                            }
                        }
                    }
                    i16++;
                    f13 = 1.0f;
                    i3 = 1;
                    i5 = 10;
                    i6 = 11;
                }
                i15--;
                f13 = 1.0f;
                i3 = 1;
                i5 = 10;
                i6 = 11;
            }
        }
        float f20 = 1.0f;
        int i21 = 2;
        while (i21 >= 0) {
            int i22 = 0;
            while (i22 < i) {
                if (i22 != 0 || this.transitionProgress != f20) {
                    DrawingState[] drawingStateArr2 = i22 == 0 ? this.animatingStates : this.currentStates;
                    if (i22 != 1 || this.transitionProgress == f20 || drawingStateArr2[i21].animationType == 1) {
                        ImageReceiver imageReceiver2 = drawingStateArr2[i21].imageReceiver;
                        if (imageReceiver2.hasImageSet()) {
                            if (i22 == 0) {
                                if (this.centered) {
                                    iM$3 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i12 * i8), i);
                                } else {
                                    iM$3 = iDp2;
                                }
                                imageReceiver2.setImageX((i8 * i21) + iM$3);
                            } else {
                                imageReceiver2.setImageX((i8 * i21) + usedWidth);
                            }
                            int i23 = this.currentStyle;
                            if (i23 != 0 && i23 != 10) {
                                if (i23 != 11) {
                                    imageReceiver2.setImageY(AndroidUtilities.dp(i23 == 4 ? 8.0f : 6.0f));
                                }
                                if (this.transitionProgress == f20) {
                                    z = false;
                                    f2 = 1.0f;
                                } else {
                                    if (drawingStateArr2[i21].animationType == 1) {
                                        canvas2.save();
                                        float f21 = f20 - this.transitionProgress;
                                        canvas2.scale(f21, f21, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f8 = f20 - this.transitionProgress;
                                    } else if (drawingStateArr2[i21].animationType == 0) {
                                        canvas2.save();
                                        float f22 = this.transitionProgress;
                                        canvas2.scale(f22, f22, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f8 = this.transitionProgress;
                                    } else {
                                        if (drawingStateArr2[i21].animationType == i) {
                                            if (this.centered) {
                                                int i24 = this.width - (i12 * i8);
                                                if (z3) {
                                                    f7 = 8.0f;
                                                } else {
                                                    f7 = 4.0f;
                                                }
                                                iM$2 = OKLCH.m$2(f7, i24, i);
                                            } else {
                                                iM$2 = iDp2;
                                            }
                                            int i25 = (i8 * i21) + iM$2;
                                            int i26 = (drawingStateArr2[i21].moveFromIndex * i8) + usedWidth;
                                            float f23 = this.transitionProgress;
                                            imageReceiver2.setImageX((int) DiffUtil.m(1.0f, f23, i26, i25 * f23));
                                        } else if (drawingStateArr2[i21].animationType == -1 && this.centered) {
                                            int i27 = this.width - (i12 * i8);
                                            if (z3) {
                                                f6 = 8.0f;
                                            } else {
                                                f6 = 4.0f;
                                            }
                                            int iM$7 = OKLCH.m$2(f6, i27, i);
                                            int i28 = i8 * i21;
                                            float f24 = this.transitionProgress;
                                            imageReceiver2.setImageX((int) DiffUtil.m(1.0f, f24, usedWidth + i28, (iM$7 + i28) * f24));
                                        }
                                        z = false;
                                        f2 = 1.0f;
                                    }
                                    f2 = f8;
                                    z = true;
                                }
                                f3 = f2 * this.overrideAlpha;
                                if (i21 == drawingStateArr2.length - 1 || this.drawStoriesCircle) {
                                    i2 = this.currentStyle;
                                    if (i2 != 1 || i2 == 3 || i2 == 5) {
                                        f4 = f3;
                                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                        if (drawingStateArr2[i21].wavesDrawable == null) {
                                            if (this.currentStyle == 5) {
                                                drawingStateArr2[i21].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                            } else {
                                                drawingStateArr2[i21].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                            }
                                        }
                                        if (this.currentStyle == 5) {
                                            drawingStateArr2[i21].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f4 * 76.5f)));
                                        }
                                        drawingState = drawingStateArr2[i21];
                                        groupCallParticipant = drawingState.participant;
                                        if (groupCallParticipant != null || groupCallParticipant.amplitude <= 0.0f) {
                                            drawingState.wavesDrawable.setShowWaves(this.parent, false);
                                        } else {
                                            drawingState.wavesDrawable.setShowWaves(this.parent, true);
                                            DrawingState drawingState2 = drawingStateArr2[i21];
                                            drawingState2.wavesDrawable.setAmplitude(drawingState2.participant.amplitude * 15.0f);
                                        }
                                        if (this.currentStyle == 5 && SystemClock.uptimeMillis() - drawingStateArr2[i21].participant.lastSpeakTime > 500) {
                                            this.updateDelegate.run();
                                        }
                                        drawingStateArr2[i21].wavesDrawable.update();
                                        if (this.currentStyle == 5) {
                                            drawingStateArr2[i21].wavesDrawable.draw(canvas2, this.parent, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                            invalidate();
                                        }
                                        avatarScale = drawingStateArr2[i21].wavesDrawable.getAvatarScale();
                                    } else if (i2 == 4 || i2 == 10) {
                                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), this.xRefP);
                                        if (drawingStateArr2[i21].wavesDrawable == null) {
                                            drawingStateArr2[i21].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                        }
                                        if (this.currentStyle == 10) {
                                            f5 = 15.0f;
                                            drawingStateArr2[i21].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f3 * 76.5f)));
                                        } else {
                                            f5 = 15.0f;
                                            drawingStateArr2[i21].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_listeningText, false), (int) (f3 * 76.5f)));
                                        }
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        if (jCurrentTimeMillis - drawingStateArr2[i21].lastUpdateTime > 100) {
                                            drawingStateArr2[i21].lastUpdateTime = jCurrentTimeMillis;
                                            if (this.currentStyle == 10) {
                                                DrawingState drawingState3 = drawingStateArr2[i21];
                                                TLRPC.GroupCallParticipant groupCallParticipant2 = drawingState3.participant;
                                                if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                    f4 = f3;
                                                    drawingState3.wavesDrawable.setShowWaves(this.parent, false);
                                                } else {
                                                    drawingState3.wavesDrawable.setShowWaves(this.parent, true);
                                                    DrawingState drawingState4 = drawingStateArr2[i21];
                                                    f4 = f3;
                                                    drawingState4.wavesDrawable.setAmplitude(drawingState4.participant.amplitude * f5);
                                                }
                                            } else {
                                                f4 = f3;
                                                if (((long) ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime()) - drawingStateArr2[i21].lastSpeakTime <= 5) {
                                                    drawingStateArr2[i21].wavesDrawable.setShowWaves(this.parent, true);
                                                    drawingStateArr2[i21].wavesDrawable.setAmplitude(this.random.nextInt() % 100);
                                                } else {
                                                    drawingStateArr2[i21].wavesDrawable.setShowWaves(this.parent, false);
                                                    drawingStateArr2[i21].wavesDrawable.setAmplitude(0.0d);
                                                }
                                            }
                                        } else {
                                            f4 = f3;
                                        }
                                        drawingStateArr2[i21].wavesDrawable.update();
                                        drawingStateArr2[i21].wavesDrawable.draw(canvas2, this.parent, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        avatarScale = drawingStateArr2[i21].wavesDrawable.getAvatarScale();
                                    } else {
                                        float size3 = (getSize() / 2.0f) + this.strokeWidth;
                                        if (z5) {
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, this.xRefP);
                                        } else {
                                            int alpha = this.paint.getAlpha();
                                            if (f3 != 1.0f) {
                                                this.paint.setAlpha((int) (alpha * f3));
                                            }
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, this.paint);
                                            if (f3 != 1.0f) {
                                                this.paint.setAlpha(alpha);
                                            }
                                        }
                                        f4 = f3;
                                        avatarScale = 1.0f;
                                    }
                                } else {
                                    f4 = f3;
                                    avatarScale = 1.0f;
                                }
                                imageReceiver2.setAlpha(f4);
                                f20 = 1.0f;
                                if (avatarScale != 1.0f) {
                                    canvas2.save();
                                    canvas2.scale(avatarScale, avatarScale, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    imageReceiver2.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    imageReceiver2.draw(canvas2);
                                }
                                this.maxX = Math.max(this.maxX, ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale) + imageReceiver2.getCenterX());
                                if (z) {
                                    canvas2.restore();
                                }
                            }
                            imageReceiver2.setImageY((this.height - size) / 2.0f);
                            if (this.transitionProgress == f20) {
                                z = false;
                                f2 = 1.0f;
                            } else {
                                if (drawingStateArr2[i21].animationType == 1) {
                                    canvas2.save();
                                    float f25 = f20 - this.transitionProgress;
                                    canvas2.scale(f25, f25, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    f8 = f20 - this.transitionProgress;
                                } else if (drawingStateArr2[i21].animationType == 0) {
                                    canvas2.save();
                                    float f26 = this.transitionProgress;
                                    canvas2.scale(f26, f26, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    f8 = this.transitionProgress;
                                } else {
                                    if (drawingStateArr2[i21].animationType == i) {
                                        if (this.centered) {
                                            int i29 = this.width - (i12 * i8);
                                            if (z3) {
                                                f7 = 8.0f;
                                            } else {
                                                f7 = 4.0f;
                                            }
                                            iM$2 = OKLCH.m$2(f7, i29, i);
                                        } else {
                                            iM$2 = iDp2;
                                        }
                                        int i210 = (i8 * i21) + iM$2;
                                        int i211 = (drawingStateArr2[i21].moveFromIndex * i8) + usedWidth;
                                        float f27 = this.transitionProgress;
                                        imageReceiver2.setImageX((int) DiffUtil.m(1.0f, f27, i211, i210 * f27));
                                    } else if (drawingStateArr2[i21].animationType == -1) {
                                        int i212 = this.width - (i12 * i8);
                                        if (z3) {
                                            f6 = 8.0f;
                                        } else {
                                            f6 = 4.0f;
                                        }
                                        int iM$8 = OKLCH.m$2(f6, i212, i);
                                        int i213 = i8 * i21;
                                        float f28 = this.transitionProgress;
                                        imageReceiver2.setImageX((int) DiffUtil.m(1.0f, f28, usedWidth + i213, (iM$8 + i213) * f28));
                                    }
                                    z = false;
                                    f2 = 1.0f;
                                }
                                f2 = f8;
                                z = true;
                            }
                            f3 = f2 * this.overrideAlpha;
                            if (i21 == drawingStateArr2.length - 1) {
                                i2 = this.currentStyle;
                                if (i2 != 1) {
                                }
                                f4 = f3;
                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                if (drawingStateArr2[i21].wavesDrawable == null) {
                                    if (this.currentStyle == 5) {
                                        drawingStateArr2[i21].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                    } else {
                                        drawingStateArr2[i21].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                    }
                                }
                                if (this.currentStyle == 5) {
                                    drawingStateArr2[i21].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f4 * 76.5f)));
                                }
                                drawingState = drawingStateArr2[i21];
                                groupCallParticipant = drawingState.participant;
                                if (groupCallParticipant != null) {
                                }
                                drawingState.wavesDrawable.setShowWaves(this.parent, false);
                                if (this.currentStyle == 5) {
                                    this.updateDelegate.run();
                                }
                                drawingStateArr2[i21].wavesDrawable.update();
                                if (this.currentStyle == 5) {
                                    drawingStateArr2[i21].wavesDrawable.draw(canvas2, this.parent, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    invalidate();
                                }
                                avatarScale = drawingStateArr2[i21].wavesDrawable.getAvatarScale();
                            } else {
                                i2 = this.currentStyle;
                                if (i2 != 1) {
                                }
                                f4 = f3;
                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                if (drawingStateArr2[i21].wavesDrawable == null) {
                                    if (this.currentStyle == 5) {
                                        drawingStateArr2[i21].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                    } else {
                                        drawingStateArr2[i21].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                    }
                                }
                                if (this.currentStyle == 5) {
                                    drawingStateArr2[i21].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f4 * 76.5f)));
                                }
                                drawingState = drawingStateArr2[i21];
                                groupCallParticipant = drawingState.participant;
                                if (groupCallParticipant != null) {
                                }
                                drawingState.wavesDrawable.setShowWaves(this.parent, false);
                                if (this.currentStyle == 5) {
                                    this.updateDelegate.run();
                                }
                                drawingStateArr2[i21].wavesDrawable.update();
                                if (this.currentStyle == 5) {
                                    drawingStateArr2[i21].wavesDrawable.draw(canvas2, this.parent, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    invalidate();
                                }
                                avatarScale = drawingStateArr2[i21].wavesDrawable.getAvatarScale();
                            }
                            imageReceiver2.setAlpha(f4);
                            f20 = 1.0f;
                            if (avatarScale != 1.0f) {
                                canvas2.save();
                                canvas2.scale(avatarScale, avatarScale, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                imageReceiver2.draw(canvas2);
                                canvas2.restore();
                            } else {
                                imageReceiver2.draw(canvas2);
                            }
                            this.maxX = Math.max(this.maxX, ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale) + imageReceiver2.getCenterX());
                            if (z) {
                                canvas2.restore();
                            }
                        }
                    }
                }
                i22++;
                i = 2;
            }
            i21--;
            i = 2;
        }
        if (z5) {
            canvas2.restore();
        }
    }

    public void reset() {
        for (int i = 0; i < this.animatingStates.length; i++) {
            setObject(0, 0, null);
        }
    }

    public void setAlpha(float f) {
        this.overrideAlpha = f;
    }

    public void setAvatarsTextSize(int i) {
        AvatarDrawable avatarDrawable;
        AvatarDrawable avatarDrawable2;
        for (int i2 = 0; i2 < 3; i2++) {
            DrawingState drawingState = this.currentStates[i2];
            if (drawingState != null && (avatarDrawable2 = drawingState.avatarDrawable) != null) {
                avatarDrawable2.setTextSize(i);
            }
            DrawingState drawingState2 = this.animatingStates[i2];
            if (drawingState2 != null && (avatarDrawable = drawingState2.avatarDrawable) != null) {
                avatarDrawable.setTextSize(i);
            }
        }
    }

    public void setCentered(boolean z) {
        this.centered = z;
    }

    public void setCount(int i) {
        this.count = i;
        View view = this.parent;
        if (view != null) {
            view.requestLayout();
        }
    }

    public void setDelegate(Runnable runnable) {
        this.updateDelegate = runnable;
    }

    public void setObject(int i, int i2, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        this.animatingStates[i].id = 0L;
        DrawingState drawingState = this.animatingStates[i];
        drawingState.participant = null;
        if (tLObject == null) {
            drawingState.imageReceiver.setImageBitmap((Drawable) null);
            invalidate();
            return;
        }
        drawingState.lastSpeakTime = -1L;
        this.animatingStates[i].object = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            this.animatingStates[i].participant = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i2).getUser(Long.valueOf(peerId));
                this.animatingStates[i].avatarDrawable.setInfo(i2, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerId));
                this.animatingStates[i].avatarDrawable.setInfo(i2, chat2);
                chat = chat2;
                user = null;
            }
            if (this.currentStyle != 4) {
                this.animatingStates[i].lastSpeakTime = groupCallParticipant.active_date;
            } else if (peerId == AccountInstance.getInstance(i2).getUserConfig().getClientUserId()) {
                this.animatingStates[i].lastSpeakTime = 0L;
            } else if (this.isInCall) {
                this.animatingStates[i].lastSpeakTime = groupCallParticipant.lastActiveDate;
            } else {
                this.animatingStates[i].lastSpeakTime = groupCallParticipant.active_date;
            }
            this.animatingStates[i].id = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            if (user.self && this.showSavedMessages) {
                this.animatingStates[i].avatarDrawable.setAvatarType(1);
                this.animatingStates[i].avatarDrawable.setScaleSize(0.6f);
            } else {
                this.animatingStates[i].avatarDrawable.setAvatarType(0);
                this.animatingStates[i].avatarDrawable.setScaleSize(1.0f);
                this.animatingStates[i].avatarDrawable.setInfo(i2, user);
            }
            this.animatingStates[i].id = user.id;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            this.animatingStates[i].avatarDrawable.setAvatarType(0);
            this.animatingStates[i].avatarDrawable.setScaleSize(1.0f);
            this.animatingStates[i].avatarDrawable.setInfo(i2, chat);
            this.animatingStates[i].id = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int size = getSize();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            this.animatingStates[i].id = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                this.animatingStates[i].imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), DiffUtil.m(size, size, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), DiffUtil.m(size, size, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    this.animatingStates[i].imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), DiffUtil.m(size, size, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), DiffUtil.m(size, size, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            this.animatingStates[i].imageReceiver.setForUserOrChat(chat, this.animatingStates[i].avatarDrawable);
        } else if (user.self && this.showSavedMessages) {
            this.animatingStates[i].imageReceiver.setImageBitmap(this.animatingStates[i].avatarDrawable);
        } else {
            this.animatingStates[i].imageReceiver.setForUserOrChat(user, this.animatingStates[i].avatarDrawable);
        }
        this.animatingStates[i].imageReceiver.setRoundRadius(size / 2);
        float f = size;
        this.animatingStates[i].imageReceiver.setImageCoords(0.0f, 0.0f, f, f);
        invalidate();
    }

    public void setShowSavedMessages(boolean z) {
        this.showSavedMessages = z;
    }

    public void setSize(int i) {
        this.overrideSize = i;
    }

    public void setStepFactor(float f) {
        this.overrideSizeStepFactor = f;
    }

    public void setStyle(int i) {
        this.currentStyle = i;
        invalidate();
    }

    public void setTransitionProgress(float f) {
        if (!this.transitionInProgress || this.transitionProgress == f) {
            return;
        }
        this.transitionProgress = f;
        if (f == 1.0f) {
            swapStates();
            this.transitionInProgress = false;
        }
    }

    public void updateAfterTransitionEnd() {
        this.updateAfterTransition = true;
    }

    public void commitTransition(boolean z, boolean z2) {
        if (!this.wasDraw || !z) {
            this.transitionProgress = 1.0f;
            swapStates();
            return;
        }
        DrawingState[] drawingStateArr = new DrawingState[3];
        boolean z3 = false;
        for (int i = 0; i < 3; i++) {
            DrawingState[] drawingStateArr2 = this.currentStates;
            drawingStateArr[i] = drawingStateArr2[i];
            if (drawingStateArr2[i].id != this.animatingStates[i].id) {
                z3 = true;
            } else {
                this.currentStates[i].lastSpeakTime = this.animatingStates[i].lastSpeakTime;
            }
        }
        if (!z3) {
            this.transitionProgress = 1.0f;
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    this.animatingStates[i2].animationType = 0;
                    break;
                }
                if (this.currentStates[i3].id == this.animatingStates[i2].id) {
                    drawingStateArr[i3] = null;
                    if (i2 != i3) {
                        this.animatingStates[i2].animationType = 2;
                        this.animatingStates[i2].moveFromIndex = i3;
                        break;
                    }
                    this.animatingStates[i2].animationType = -1;
                    GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable = this.animatingStates[i2].wavesDrawable;
                    this.animatingStates[i2].wavesDrawable = this.currentStates[i2].wavesDrawable;
                    this.currentStates[i2].wavesDrawable = avatarWavesDrawable;
                    break;
                }
                i3++;
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            DrawingState drawingState = drawingStateArr[i4];
            if (drawingState != null) {
                drawingState.animationType = 1;
            }
        }
        ValueAnimator valueAnimator = this.transitionProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.transitionProgressAnimator.cancel();
            if (this.transitionInProgress) {
                swapStates();
                this.transitionInProgress = false;
            }
        }
        this.transitionProgress = 0.0f;
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.transitionProgressAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 25));
            this.transitionProgressAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AvatarsDrawable avatarsDrawable = AvatarsDrawable.this;
                    if (avatarsDrawable.transitionProgressAnimator != null) {
                        avatarsDrawable.transitionProgress = 1.0f;
                        avatarsDrawable.swapStates();
                        AvatarsDrawable avatarsDrawable2 = AvatarsDrawable.this;
                        if (avatarsDrawable2.updateAfterTransition) {
                            avatarsDrawable2.updateAfterTransition = false;
                            Runnable runnable = avatarsDrawable2.updateDelegate;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                        AvatarsDrawable.this.invalidate();
                    }
                    AvatarsDrawable.this.transitionProgressAnimator = null;
                }
            });
            this.transitionProgressAnimator.setDuration(this.transitionDuration);
            this.transitionProgressAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.transitionProgressAnimator.start();
        } else {
            this.transitionInProgress = true;
        }
        invalidate();
    }
}
