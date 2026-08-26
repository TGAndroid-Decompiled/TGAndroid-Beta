package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
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
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Stories.StoriesGradientTools;

public final class AvatarsDrawable {
    public boolean attached;
    public boolean centered;
    public int count;
    public int currentStyle;
    public boolean drawStoriesCircle;
    public int height;
    public final boolean isInCall;
    public float maxX;
    public int overrideSize;
    public final View parent;
    public final Random random;
    public boolean showSavedMessages;
    public StoriesGradientTools storiesTools;
    public boolean transitionInProgress;
    public ValueAnimator transitionProgressAnimator;
    public boolean updateAfterTransition;
    public Runnable updateDelegate;
    public boolean wasDraw;
    public int width;
    public final DrawingState[] currentStates = new DrawingState[3];
    public final DrawingState[] animatingStates = new DrawingState[3];
    public float transitionProgress = 1.0f;
    public final Paint paint = new Paint(1);
    public final Paint xRefP = new Paint(1);
    public int strokeWidth = AndroidUtilities.dp(1.67f);
    public float overrideSizeStepFactor = 0.8f;
    public float overrideAlpha = 1.0f;
    public long transitionDuration = 220;

    public final class DrawingState {
        public int animationType;
        public AvatarDrawable avatarDrawable;
        public long id;
        public ImageReceiver imageReceiver;
        public long lastSpeakTime;
        public long lastUpdateTime;
        public int moveFromIndex;
        public TLObject object;
        public TLRPC.GroupCallParticipant participant;
        public GroupCallUserCell.AvatarWavesDrawable wavesDrawable;
    }

    public AvatarsDrawable(View view, boolean z) {
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.random = new Random();
        this.parent = view;
        for (int i = 0; i < 3; i++) {
            DrawingState[] drawingStateArr = this.currentStates;
            DrawingState drawingState = new DrawingState();
            drawingStateArr[i] = drawingState;
            drawingState.imageReceiver = new ImageReceiver(view);
            this.currentStates[i].imageReceiver.setInvalidateAll(true);
            this.currentStates[i].imageReceiver.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.currentStates[i].avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.currentStates[i].avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
            DrawingState[] drawingStateArr2 = this.animatingStates;
            DrawingState drawingState2 = new DrawingState();
            drawingStateArr2[i] = drawingState2;
            drawingState2.imageReceiver = new ImageReceiver(view);
            this.animatingStates[i].imageReceiver.setInvalidateAll(true);
            this.animatingStates[i].imageReceiver.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.animatingStates[i].avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.animatingStates[i].avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.isInCall = z;
        this.xRefP.setColor(0);
        this.xRefP.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void commitTransition() {
        commitTransition(false, true);
    }

    public final float getMaxX() {
        return this.maxX;
    }

    public final int getSize() {
        int i = this.overrideSize;
        if (i != 0) {
            return i;
        }
        int i2 = this.currentStyle;
        return AndroidUtilities.dp((i2 == 4 || i2 == 10) ? 32.0f : 24.0f);
    }

    public final float getUsedWidth() {
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

    public final void onAttachedToWindow() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        for (int i = 0; i < 3; i++) {
            this.currentStates[i].imageReceiver.onAttachedToWindow();
            this.animatingStates[i].imageReceiver.onAttachedToWindow();
        }
    }

    public final void onDetachedFromWindow() {
        if (this.attached) {
            this.attached = false;
            this.wasDraw = false;
            for (int i = 0; i < 3; i++) {
                this.currentStates[i].imageReceiver.onDetachedFromWindow();
                this.animatingStates[i].imageReceiver.onDetachedFromWindow();
            }
            if (this.currentStyle == 3) {
                FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable = Theme.getFragmentContextViewWavesDrawable();
                fragmentContextViewWavesDrawable.animateToAmplitude = 0.0f;
                float f = 0.0f - fragmentContextViewWavesDrawable.amplitude;
                fragmentContextViewWavesDrawable.animateAmplitudeDiff = f / 250.0f;
                fragmentContextViewWavesDrawable.animateAmplitudeDiff2 = f / 120.0f;
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        int iDp;
        DrawingState[] drawingStateArr;
        DrawingState[] drawingStateArr2;
        Canvas canvas2;
        DrawingState[] drawingStateArr3;
        int i;
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        int i2;
        Paint paint;
        DrawingState[] drawingStateArr4;
        int i3;
        DrawingState drawingState;
        DrawingState drawingState2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float avatarScale;
        int i4;
        int iM$2;
        float f5;
        float f6;
        int iM$3;
        float f7;
        boolean z2;
        float f8;
        int i5;
        int iM$4;
        float f9;
        int iM$5;
        int i6 = 1;
        this.wasDraw = true;
        int i7 = this.currentStyle;
        int i8 = 10;
        int i9 = 4;
        boolean z3 = i7 == 4 || i7 == 10;
        int size = getSize();
        if (this.currentStyle == 11) {
            iDp = AndroidUtilities.dp(12.0f);
        } else {
            int i10 = this.overrideSize;
            if (i10 != 0) {
                iDp = (int) (i10 * this.overrideSizeStepFactor);
            } else {
                iDp = AndroidUtilities.dp(z3 ? 24.0f : 20.0f);
            }
        }
        int i11 = iDp;
        int i12 = 0;
        while (true) {
            drawingStateArr = this.currentStates;
            if (i12 >= 3) {
                break;
            }
            long j = drawingStateArr[i12].id;
            i12++;
        }
        int i13 = this.currentStyle;
        int iDp2 = (i13 == 0 || i13 == 10 || i13 == 11) ? 0 : AndroidUtilities.dp(10.0f);
        int usedWidth = this.centered ? (this.width - ((int) getUsedWidth())) / 2 : iDp2;
        boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i14 = this.currentStyle;
        Paint paint2 = this.paint;
        if (i14 == 4) {
            paint2.setColor(Theme.getColor(null, Theme.key_inappPlayerBackground, false));
        } else if (i14 != 3) {
            paint2.setColor(Theme.getColor(null, z4 ? Theme.key_returnToCallMutedBackground : Theme.key_returnToCallBackground, false));
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            drawingStateArr2 = this.animatingStates;
            if (i15 >= 3) {
                break;
            }
            DrawingState[] drawingStateArr5 = drawingStateArr;
            if (drawingStateArr2[i15].id != 0) {
                i16++;
            }
            i15++;
            drawingStateArr = drawingStateArr5;
        }
        DrawingState[] drawingStateArr6 = drawingStateArr;
        int i17 = this.currentStyle;
        boolean z5 = i17 == 0 || i17 == 1 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 10 || i17 == 11;
        if (z5) {
            float fDp = i17 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
            if (this.drawStoriesCircle) {
                fDp += AndroidUtilities.dp(20.0f);
            }
            float f10 = -fDp;
            float f11 = this.width + fDp;
            float f12 = this.height + fDp;
            drawingStateArr3 = drawingStateArr2;
            i = 2;
            f = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f10, f10, f11, f12, 255, 31);
        } else {
            canvas2 = canvas;
            drawingStateArr3 = drawingStateArr2;
            i = 2;
            f = 0.0f;
        }
        this.maxX = f;
        boolean z6 = this.drawStoriesCircle;
        View view = this.parent;
        float f13 = 1.0f;
        if (z6) {
            int i18 = 2;
            while (i18 >= 0) {
                int i19 = 0;
                while (i19 < i) {
                    if (i19 == 0 && this.transitionProgress == f13) {
                        i5 = i18;
                    } else {
                        DrawingState[] drawingStateArr7 = i19 == 0 ? drawingStateArr3 : drawingStateArr6;
                        if (i19 != i6 || this.transitionProgress == f13 || drawingStateArr7[i18].animationType == i6) {
                            ImageReceiver imageReceiver = drawingStateArr7[i18].imageReceiver;
                            if (imageReceiver.hasImageSet()) {
                                if (i19 == 0) {
                                    if (this.centered) {
                                        f7 = 1.0f;
                                        iM$5 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i16 * i11), i);
                                    } else {
                                        f7 = 1.0f;
                                        iM$5 = iDp2;
                                    }
                                    imageReceiver.setImageX((i11 * i18) + iM$5);
                                } else {
                                    f7 = 1.0f;
                                    imageReceiver.setImageX((i11 * i18) + usedWidth);
                                }
                                int i20 = this.currentStyle;
                                if (i20 == 0 || i20 == i8 || i20 == 11) {
                                    imageReceiver.setImageY((this.height - size) / 2.0f);
                                } else {
                                    imageReceiver.setImageY(AndroidUtilities.dp(i20 == i9 ? 8.0f : 6.0f));
                                }
                                if (this.transitionProgress == f7) {
                                    z2 = false;
                                    f8 = 1.0f;
                                } else {
                                    int i21 = drawingStateArr7[i18].animationType;
                                    if (i21 == i6) {
                                        canvas2.save();
                                        float f14 = f7 - this.transitionProgress;
                                        canvas2.scale(f14, f14, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f9 = f7 - this.transitionProgress;
                                    } else if (i21 == 0) {
                                        canvas2.save();
                                        float f15 = this.transitionProgress;
                                        canvas2.scale(f15, f15, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f9 = this.transitionProgress;
                                    } else {
                                        if (i21 == i) {
                                            if (this.centered) {
                                                iM$4 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i16 * i11), i);
                                            } else {
                                                iM$4 = iDp2;
                                            }
                                            int i22 = (i11 * i18) + iM$4;
                                            int i23 = (drawingStateArr7[i18].moveFromIndex * i11) + usedWidth;
                                            float f16 = this.transitionProgress;
                                            imageReceiver.setImageX((int) DiffUtil.m(1.0f, f16, i23, i22 * f16));
                                        } else if (i21 == -1 && this.centered) {
                                            int i24 = i11 * i18;
                                            int iM$6 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i16 * i11), i) + i24;
                                            float f17 = this.transitionProgress;
                                            imageReceiver.setImageX((int) DiffUtil.m(1.0f, f17, usedWidth + i24, iM$6 * f17));
                                        }
                                        z2 = false;
                                        f8 = 1.0f;
                                    }
                                    f8 = f9;
                                    z2 = true;
                                }
                                float f18 = f8 * this.overrideAlpha;
                                float size2 = (getSize() / 2.0f) + AndroidUtilities.dp(4.0f);
                                if (this.storiesTools == null) {
                                    this.storiesTools = new StoriesGradientTools();
                                }
                                StoriesGradientTools storiesGradientTools = this.storiesTools;
                                float measuredHeight = view.getMeasuredHeight();
                                float fDp2 = AndroidUtilities.dp(40.0f);
                                storiesGradientTools.getClass();
                                RectF rectF = AndroidUtilities.rectTmp;
                                i5 = i18;
                                rectF.set(0.0f, 0.0f, measuredHeight, fDp2);
                                storiesGradientTools.setBounds(rectF);
                                this.storiesTools.paint.setAlpha((int) (f18 * 255.0f));
                                canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), size2, this.storiesTools.paint);
                                if (z2) {
                                    canvas2.restore();
                                }
                            } else {
                                i5 = i18;
                            }
                        } else {
                            i5 = i18;
                        }
                    }
                    i19++;
                    i18 = i5;
                    f13 = 1.0f;
                    i6 = 1;
                    i8 = 10;
                    i = 2;
                    i9 = 4;
                }
                i18--;
                f13 = 1.0f;
                i6 = 1;
                i8 = 10;
                i = 2;
                i9 = 4;
            }
        }
        int i25 = 2;
        while (i25 >= 0) {
            int i26 = 0;
            while (i26 < 2) {
                if (i26 == 0) {
                    f2 = 1.0f;
                    if (this.transitionProgress == 1.0f) {
                    }
                    i3 = i26;
                    i26 = i3 + 1;
                    paint2 = paint2;
                    i25 = i25;
                } else {
                    f2 = 1.0f;
                }
                DrawingState[] drawingStateArr8 = i26 == 0 ? drawingStateArr3 : drawingStateArr6;
                if (i26 != 1 || this.transitionProgress == f2 || drawingStateArr8[i25].animationType == 1) {
                    ImageReceiver imageReceiver2 = drawingStateArr8[i25].imageReceiver;
                    if (imageReceiver2.hasImageSet()) {
                        if (i26 == 0) {
                            if (this.centered) {
                                iM$3 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i16 * i11), 2);
                            } else {
                                iM$3 = iDp2;
                            }
                            imageReceiver2.setImageX((i11 * i25) + iM$3);
                        } else {
                            imageReceiver2.setImageX((i11 * i25) + usedWidth);
                        }
                        int i27 = this.currentStyle;
                        if (i27 != 0 && i27 != 10) {
                            if (i27 != 11) {
                                imageReceiver2.setImageY(AndroidUtilities.dp(i27 == 4 ? 8.0f : 6.0f));
                            }
                            if (this.transitionProgress == 1.0f) {
                                z = false;
                                f3 = 1.0f;
                            } else {
                                i4 = drawingStateArr8[i25].animationType;
                                if (i4 == 1) {
                                    canvas2.save();
                                    float f19 = 1.0f - this.transitionProgress;
                                    canvas2.scale(f19, f19, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    f6 = 1.0f - this.transitionProgress;
                                } else if (i4 == 0) {
                                    canvas2.save();
                                    float f20 = this.transitionProgress;
                                    canvas2.scale(f20, f20, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    f6 = this.transitionProgress;
                                } else {
                                    if (i4 == 2) {
                                        if (this.centered) {
                                            int i28 = this.width - (i16 * i11);
                                            if (z3) {
                                                f5 = 8.0f;
                                            } else {
                                                f5 = 4.0f;
                                            }
                                            iM$2 = OKLCH.m$2(f5, i28, 2);
                                        } else {
                                            iM$2 = iDp2;
                                        }
                                        int i29 = (i11 * i25) + iM$2;
                                        int i30 = (drawingStateArr8[i25].moveFromIndex * i11) + usedWidth;
                                        float f21 = this.transitionProgress;
                                        imageReceiver2.setImageX((int) DiffUtil.m(1.0f, f21, i30, i29 * f21));
                                    } else if (i4 != -1 && this.centered) {
                                        int i31 = i11 * i25;
                                        int iM$7 = OKLCH.m$2(z3 ? 8.0f : 4.0f, this.width - (i16 * i11), 2) + i31;
                                        float f22 = this.transitionProgress;
                                        imageReceiver2.setImageX((int) DiffUtil.m(1.0f, f22, usedWidth + i31, iM$7 * f22));
                                    }
                                    z = false;
                                    f3 = 1.0f;
                                }
                                f3 = f6;
                                z = true;
                            }
                            f4 = f3 * this.overrideAlpha;
                            if (i25 == drawingStateArr8.length - 1 || this.drawStoriesCircle) {
                                i2 = this.currentStyle;
                                paint = this.xRefP;
                                if (i2 != 1 || i2 == 3 || i2 == 5) {
                                    drawingStateArr4 = drawingStateArr8;
                                    i25 = i25;
                                    paint2 = paint2;
                                    i3 = i26;
                                    canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                    drawingState = drawingStateArr4[i25];
                                    if (drawingState.wavesDrawable == null) {
                                        if (this.currentStyle == 5) {
                                            drawingState.wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                        } else {
                                            drawingState.wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                        }
                                    }
                                    if (this.currentStyle == 5) {
                                        drawingStateArr4[i25].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f4 * 76.5f)));
                                    }
                                    drawingState2 = drawingStateArr4[i25];
                                    groupCallParticipant = drawingState2.participant;
                                    if (groupCallParticipant != null || groupCallParticipant.amplitude <= 0.0f) {
                                        drawingState2.wavesDrawable.setShowWaves(view, false);
                                    } else {
                                        drawingState2.wavesDrawable.setShowWaves(view, true);
                                        DrawingState drawingState3 = drawingStateArr4[i25];
                                        drawingState3.wavesDrawable.setAmplitude(drawingState3.participant.amplitude * 15.0f);
                                    }
                                    if (this.currentStyle == 5 && SystemClock.uptimeMillis() - drawingStateArr4[i25].participant.lastSpeakTime > 500) {
                                        this.updateDelegate.run();
                                    }
                                    drawingStateArr4[i25].wavesDrawable.update();
                                    if (this.currentStyle == 5) {
                                        drawingStateArr4[i25].wavesDrawable.draw(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                        if (view != null) {
                                            view.invalidate();
                                        }
                                    }
                                    avatarScale = drawingStateArr4[i25].wavesDrawable.getAvatarScale();
                                } else if (i2 == 4 || i2 == 10) {
                                    paint2 = paint2;
                                    i3 = i26;
                                    canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), paint);
                                    DrawingState drawingState4 = drawingStateArr8[i25];
                                    if (drawingState4.wavesDrawable == null) {
                                        drawingState4.wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                    }
                                    if (this.currentStyle == 10) {
                                        drawingStateArr8[i25].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f4 * 76.5f)));
                                    } else {
                                        drawingStateArr8[i25].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_listeningText, false), (int) (f4 * 76.5f)));
                                    }
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    DrawingState drawingState5 = drawingStateArr8[i25];
                                    DrawingState[] drawingStateArr9 = drawingStateArr8;
                                    i25 = i25;
                                    if (jCurrentTimeMillis - drawingState5.lastUpdateTime > 100) {
                                        drawingState5.lastUpdateTime = jCurrentTimeMillis;
                                        if (this.currentStyle == 10) {
                                            TLRPC.GroupCallParticipant groupCallParticipant2 = drawingState5.participant;
                                            if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                drawingState5.wavesDrawable.setShowWaves(view, false);
                                            } else {
                                                drawingState5.wavesDrawable.setShowWaves(view, true);
                                                DrawingState drawingState6 = drawingStateArr9[i25];
                                                drawingState6.wavesDrawable.setAmplitude(drawingState6.participant.amplitude * 15.0f);
                                            }
                                        } else {
                                            long currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                                            DrawingState drawingState7 = drawingStateArr9[i25];
                                            if (currentTime - drawingState7.lastSpeakTime <= 5) {
                                                drawingState7.wavesDrawable.setShowWaves(view, true);
                                                drawingStateArr9[i25].wavesDrawable.setAmplitude(this.random.nextInt() % 100);
                                            } else {
                                                drawingState7.wavesDrawable.setShowWaves(view, false);
                                                drawingStateArr9[i25].wavesDrawable.setAmplitude(0.0d);
                                            }
                                        }
                                    }
                                    drawingStateArr9[i25].wavesDrawable.update();
                                    drawingStateArr9[i25].wavesDrawable.draw(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                    avatarScale = drawingStateArr9[i25].wavesDrawable.getAvatarScale();
                                } else {
                                    float size3 = (getSize() / 2.0f) + this.strokeWidth;
                                    if (z5) {
                                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, paint);
                                        paint2 = paint2;
                                        i3 = i26;
                                    } else {
                                        int alpha = paint2.getAlpha();
                                        if (f4 != 1.0f) {
                                            paint2 = paint2;
                                            paint2.setAlpha((int) (alpha * f4));
                                        } else {
                                            paint2 = paint2;
                                        }
                                        i3 = i26;
                                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, paint2);
                                        if (f4 != 1.0f) {
                                            paint2.setAlpha(alpha);
                                        }
                                    }
                                    i25 = i25;
                                    avatarScale = 1.0f;
                                }
                            } else {
                                paint2 = paint2;
                                i3 = i26;
                                i25 = i25;
                                avatarScale = 1.0f;
                            }
                            imageReceiver2.setAlpha(f4);
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
                        if (this.transitionProgress == 1.0f) {
                            z = false;
                            f3 = 1.0f;
                        } else {
                            i4 = drawingStateArr8[i25].animationType;
                            if (i4 == 1) {
                                canvas2.save();
                                float f110 = 1.0f - this.transitionProgress;
                                canvas2.scale(f110, f110, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                f6 = 1.0f - this.transitionProgress;
                            } else if (i4 == 0) {
                                canvas2.save();
                                float f23 = this.transitionProgress;
                                canvas2.scale(f23, f23, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                f6 = this.transitionProgress;
                            } else {
                                if (i4 == 2) {
                                    if (this.centered) {
                                        int i210 = this.width - (i16 * i11);
                                        if (z3) {
                                            f5 = 8.0f;
                                        } else {
                                            f5 = 4.0f;
                                        }
                                        iM$2 = OKLCH.m$2(f5, i210, 2);
                                    } else {
                                        iM$2 = iDp2;
                                    }
                                    int i211 = (i11 * i25) + iM$2;
                                    int i32 = (drawingStateArr8[i25].moveFromIndex * i11) + usedWidth;
                                    float f24 = this.transitionProgress;
                                    imageReceiver2.setImageX((int) DiffUtil.m(1.0f, f24, i32, i211 * f24));
                                } else if (i4 != -1) {
                                }
                                z = false;
                                f3 = 1.0f;
                            }
                            f3 = f6;
                            z = true;
                        }
                        f4 = f3 * this.overrideAlpha;
                        if (i25 == drawingStateArr8.length - 1) {
                            i2 = this.currentStyle;
                            paint = this.xRefP;
                            if (i2 != 1) {
                            }
                            drawingStateArr4 = drawingStateArr8;
                            i25 = i25;
                            paint2 = paint2;
                            i3 = i26;
                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                            drawingState = drawingStateArr4[i25];
                            if (drawingState.wavesDrawable == null) {
                                if (this.currentStyle == 5) {
                                    drawingState.wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                } else {
                                    drawingState.wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                }
                            }
                            if (this.currentStyle == 5) {
                                drawingStateArr4[i25].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f4 * 76.5f)));
                            }
                            drawingState2 = drawingStateArr4[i25];
                            groupCallParticipant = drawingState2.participant;
                            if (groupCallParticipant != null) {
                            }
                            drawingState2.wavesDrawable.setShowWaves(view, false);
                            if (this.currentStyle == 5) {
                                this.updateDelegate.run();
                            }
                            drawingStateArr4[i25].wavesDrawable.update();
                            if (this.currentStyle == 5) {
                                drawingStateArr4[i25].wavesDrawable.draw(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                if (view != null) {
                                    view.invalidate();
                                }
                            }
                            avatarScale = drawingStateArr4[i25].wavesDrawable.getAvatarScale();
                        } else {
                            i2 = this.currentStyle;
                            paint = this.xRefP;
                            if (i2 != 1) {
                            }
                            drawingStateArr4 = drawingStateArr8;
                            i25 = i25;
                            paint2 = paint2;
                            i3 = i26;
                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                            drawingState = drawingStateArr4[i25];
                            if (drawingState.wavesDrawable == null) {
                                if (this.currentStyle == 5) {
                                    drawingState.wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                } else {
                                    drawingState.wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                }
                            }
                            if (this.currentStyle == 5) {
                                drawingStateArr4[i25].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_speakingText, false), (int) (f4 * 76.5f)));
                            }
                            drawingState2 = drawingStateArr4[i25];
                            groupCallParticipant = drawingState2.participant;
                            if (groupCallParticipant != null) {
                            }
                            drawingState2.wavesDrawable.setShowWaves(view, false);
                            if (this.currentStyle == 5) {
                                this.updateDelegate.run();
                            }
                            drawingStateArr4[i25].wavesDrawable.update();
                            if (this.currentStyle == 5) {
                                drawingStateArr4[i25].wavesDrawable.draw(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                if (view != null) {
                                    view.invalidate();
                                }
                            }
                            avatarScale = drawingStateArr4[i25].wavesDrawable.getAvatarScale();
                        }
                        imageReceiver2.setAlpha(f4);
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
                    i26 = i3 + 1;
                    paint2 = paint2;
                    i25 = i25;
                }
                i3 = i26;
                i26 = i3 + 1;
                paint2 = paint2;
                i25 = i25;
            }
            i25--;
        }
        if (z5) {
            canvas2.restore();
        }
    }

    public final void setAvatarsTextSize(int i) {
        AvatarDrawable avatarDrawable;
        AvatarDrawable avatarDrawable2;
        for (int i2 = 0; i2 < 3; i2++) {
            DrawingState drawingState = this.currentStates[i2];
            if (drawingState != null && (avatarDrawable2 = drawingState.avatarDrawable) != null) {
                avatarDrawable2.namePaint.setTextSize(i);
            }
            DrawingState drawingState2 = this.animatingStates[i2];
            if (drawingState2 != null && (avatarDrawable = drawingState2.avatarDrawable) != null) {
                avatarDrawable.namePaint.setTextSize(i);
            }
        }
    }

    public final void setCount(int i) {
        this.count = i;
        View view = this.parent;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void setObject(int i, TLObject tLObject, int i2) {
        TLRPC.User user;
        TLRPC.Chat chat;
        DrawingState[] drawingStateArr = this.animatingStates;
        DrawingState drawingState = drawingStateArr[i];
        drawingState.id = 0L;
        drawingState.participant = null;
        View view = this.parent;
        if (tLObject == null) {
            drawingState.imageReceiver.setImageBitmap((Drawable) null);
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        drawingState.lastSpeakTime = -1L;
        drawingState.object = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            drawingState.participant = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i2).getUser(Long.valueOf(peerId));
                drawingStateArr[i].avatarDrawable.setInfo(i2, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerId));
                drawingStateArr[i].avatarDrawable.setInfo(i2, chat2);
                chat = chat2;
                user = null;
            }
            if (this.currentStyle != 4) {
                drawingStateArr[i].lastSpeakTime = groupCallParticipant.active_date;
            } else if (peerId == AccountInstance.getInstance(i2).getUserConfig().getClientUserId()) {
                drawingStateArr[i].lastSpeakTime = 0L;
            } else if (this.isInCall) {
                drawingStateArr[i].lastSpeakTime = groupCallParticipant.lastActiveDate;
            } else {
                drawingStateArr[i].lastSpeakTime = groupCallParticipant.active_date;
            }
            drawingStateArr[i].id = peerId;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject;
                if (user2.self && this.showSavedMessages) {
                    drawingState.avatarDrawable.setAvatarType(1);
                    drawingStateArr[i].avatarDrawable.scaleSize = 0.6f;
                } else {
                    drawingState.avatarDrawable.setAvatarType(0);
                    AvatarDrawable avatarDrawable = drawingStateArr[i].avatarDrawable;
                    avatarDrawable.scaleSize = 1.0f;
                    avatarDrawable.setInfo(i2, user2);
                }
                drawingStateArr[i].id = user2.id;
                user = user2;
            } else if (tLObject instanceof TLRPC.Chat) {
                chat = (TLRPC.Chat) tLObject;
                drawingState.avatarDrawable.setAvatarType(0);
                AvatarDrawable avatarDrawable2 = drawingStateArr[i].avatarDrawable;
                avatarDrawable2.scaleSize = 1.0f;
                avatarDrawable2.setInfo(i2, chat);
                drawingStateArr[i].id = -chat.id;
                user = null;
            } else {
                user = null;
            }
            chat = null;
        }
        int size = getSize();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            drawingStateArr[i].id = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                drawingStateArr[i].imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), DiffUtil.m(size, size, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), DiffUtil.m(size, size, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    drawingStateArr[i].imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), DiffUtil.m(size, size, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), DiffUtil.m(size, size, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            DrawingState drawingState2 = drawingStateArr[i];
            drawingState2.imageReceiver.setForUserOrChat(chat, drawingState2.avatarDrawable);
        } else if (user.self && this.showSavedMessages) {
            DrawingState drawingState3 = drawingStateArr[i];
            drawingState3.imageReceiver.setImageBitmap(drawingState3.avatarDrawable);
        } else {
            DrawingState drawingState4 = drawingStateArr[i];
            drawingState4.imageReceiver.setForUserOrChat(user, drawingState4.avatarDrawable);
        }
        drawingStateArr[i].imageReceiver.setRoundRadius(size / 2);
        float f = size;
        drawingStateArr[i].imageReceiver.setImageCoords(0.0f, 0.0f, f, f);
        if (view != null) {
            view.invalidate();
        }
    }

    public final void setSize(int i) {
        this.overrideSize = i;
    }

    public final void swapStates() {
        for (int i = 0; i < 3; i++) {
            DrawingState[] drawingStateArr = this.currentStates;
            DrawingState drawingState = drawingStateArr[i];
            DrawingState[] drawingStateArr2 = this.animatingStates;
            drawingStateArr[i] = drawingStateArr2[i];
            drawingStateArr2[i] = drawingState;
        }
    }

    public final void commitTransition(boolean z, boolean z2) {
        DrawingState[] drawingStateArr;
        DrawingState[] drawingStateArr2;
        if (!this.wasDraw || !z) {
            this.transitionProgress = 1.0f;
            swapStates();
            return;
        }
        DrawingState[] drawingStateArr3 = new DrawingState[3];
        int i = 0;
        boolean z3 = false;
        while (true) {
            drawingStateArr = this.currentStates;
            drawingStateArr2 = this.animatingStates;
            if (i >= 3) {
                break;
            }
            drawingStateArr3[i] = drawingStateArr[i];
            DrawingState drawingState = drawingStateArr[i];
            long j = drawingState.id;
            DrawingState drawingState2 = drawingStateArr2[i];
            if (j != drawingState2.id) {
                z3 = true;
            } else {
                drawingState.lastSpeakTime = drawingState2.lastSpeakTime;
            }
            i++;
        }
        if (!z3) {
            this.transitionProgress = 1.0f;
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    drawingStateArr2[i2].animationType = 0;
                    break;
                }
                if (drawingStateArr[i3].id == drawingStateArr2[i2].id) {
                    drawingStateArr3[i3] = null;
                    if (i2 == i3) {
                        DrawingState drawingState3 = drawingStateArr2[i2];
                        drawingState3.animationType = -1;
                        GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable = drawingState3.wavesDrawable;
                        DrawingState drawingState4 = drawingStateArr[i2];
                        drawingState3.wavesDrawable = drawingState4.wavesDrawable;
                        drawingState4.wavesDrawable = avatarWavesDrawable;
                        break;
                    }
                    DrawingState drawingState5 = drawingStateArr2[i2];
                    drawingState5.animationType = 2;
                    drawingState5.moveFromIndex = i3;
                    break;
                }
                i3++;
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            DrawingState drawingState6 = drawingStateArr3[i4];
            if (drawingState6 != null) {
                drawingState6.animationType = 1;
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
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 22));
            this.transitionProgressAnimator.addListener(new CheckBox.AnonymousClass1(this, 10));
            this.transitionProgressAnimator.setDuration(this.transitionDuration);
            this.transitionProgressAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.transitionProgressAnimator.start();
        } else {
            this.transitionInProgress = true;
        }
        View view = this.parent;
        if (view != null) {
            view.invalidate();
        }
    }
}
