package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class CapsuleBlobDrawable extends Drawable {
    public static final CapsuleBlobDrawable$$ExternalSyntheticLambda0 SMOOTHER = new CapsuleBlobDrawable$$ExternalSyntheticLambda0(0);
    public float amplitude;
    public float animateAmplitudeDiff;
    public float animateToAmplitude;
    public final Layer big;
    public float breathPhase;
    public int currentColor;
    public int fromColor;
    public float halfHeight;
    public float halfWidth;
    public float innerX;
    public float innerY;
    public long lastFrameTime;
    public float radius;
    public boolean running;
    public final Layer small;
    public float straightH;
    public float straightV;
    public int toColor;
    public float weightedArc;
    public float weightedTotal;
    public final float cornerRadius = AndroidUtilities.dp(18.0f);
    public final float targetSpacing = AndroidUtilities.dp(22.0f);
    public final float curvatureBoost = 2.4f;
    public final float waveDepth = AndroidUtilities.dp(12.0f);
    public final float breathDepth = AndroidUtilities.dp(1.5f);
    public final float breathPeriodMs = 3600.0f;
    public final float neighborCoherence = 0.25f;
    public final Path path = new Path();
    public final float[] sample = new float[4];
    public int colorState = -1;
    public float colorProgress = 1.0f;
    public final Bulletin$2$$ExternalSyntheticLambda1 mInvalidateSelf = new Bulletin$2$$ExternalSyntheticLambda1(this, 8);
    public int mAlpha = 255;

    public final class Layer {
        public int baseAlpha;
        public float breathScale;
        public float[] depth;
        public float[] depthEff;
        public float[] depthNext;
        public float[] depthTmp;
        public int n;
        public float[] offset;
        public float[] offsetEff;
        public float[] offsetNext;
        public float phaseOffset;
        public float[] progress;
        public float pushMax;
        public float pushMin;
        public float[] px;
        public float[] py;
        public float[] speed;
        public float speedScale;
        public float[] tx;
        public float[] ty;
        public float waveScale;
        public int color = -11318601;
        public final Paint paint = new Paint(1);
        public final Random random = new Random();
        public int mAlpha = 255;

        public final void applyColor() {
            Paint paint = this.paint;
            paint.setColor(this.color);
            paint.setAlpha((this.baseAlpha * this.mAlpha) / 255);
        }

        public final void next(int i) {
            float f = 0.18f / this.n;
            float f2 = this.depth[i];
            Random random = this.random;
            float fNextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f2;
            float[] fArr = this.depthNext;
            if (fNextFloat < 0.0f) {
                fNextFloat = 0.0f;
            } else if (fNextFloat > 1.0f) {
                fNextFloat = 1.0f;
            }
            fArr[i] = fNextFloat;
            float fNextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f * 0.35f) + this.offset[i];
            float[] fArr2 = this.offsetNext;
            float f3 = -f;
            if (fNextFloat2 < f3) {
                f = f3;
            } else if (fNextFloat2 <= f) {
                f = fNextFloat2;
            }
            fArr2[i] = f;
            this.speed[i] = ((random.nextFloat() * 0.003f) + 0.017f) * this.speedScale;
        }

        public final void resize(int i) {
            this.n = i;
            this.depth = new float[i];
            this.depthNext = new float[i];
            this.offset = new float[i];
            this.offsetNext = new float[i];
            this.progress = new float[i];
            this.speed = new float[i];
            this.px = new float[i];
            this.py = new float[i];
            this.tx = new float[i];
            this.ty = new float[i];
            this.depthEff = new float[i];
            this.depthTmp = new float[i];
            this.offsetEff = new float[i];
            for (int i2 = 0; i2 < this.n; i2++) {
                float[] fArr = this.depth;
                Random random = this.random;
                fArr[i2] = random.nextFloat();
                this.offset[i2] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.n;
                next(i2);
                this.progress[i2] = random.nextFloat();
            }
            applyColor();
        }

        public final void update(float f) {
            for (int i = 0; i < this.n; i++) {
                float[] fArr = this.progress;
                float f2 = fArr[i];
                float f3 = this.speed[i];
                CapsuleBlobDrawable$$ExternalSyntheticLambda0 capsuleBlobDrawable$$ExternalSyntheticLambda0 = CapsuleBlobDrawable.SMOOTHER;
                float f4 = (f3 * f * 8.2f) + (0.8f * f3) + f2;
                fArr[i] = f4;
                if (f4 >= 1.0f) {
                    fArr[i] = 0.0f;
                    this.depth[i] = this.depthNext[i];
                    this.offset[i] = this.offsetNext[i];
                    next(i);
                }
            }
        }
    }

    public CapsuleBlobDrawable() {
        Layer layer = new Layer();
        this.big = layer;
        layer.speedScale = 1.0f;
        layer.phaseOffset = 0.0f;
        layer.pushMin = AndroidUtilities.dp(0.5f);
        layer.pushMax = AndroidUtilities.dp(8.5f);
        layer.waveScale = 1.0f;
        layer.breathScale = 1.0f;
        layer.baseAlpha = 61;
        Layer layer2 = new Layer();
        this.small = layer2;
        layer2.speedScale = 0.82f;
        layer2.phaseOffset = 0.6f;
        layer2.pushMin = AndroidUtilities.dp(0.0f);
        layer2.pushMax = AndroidUtilities.dp(4.25f);
        layer2.waveScale = 0.55f;
        layer2.breathScale = 0.55f;
        layer2.baseAlpha = 128;
        setState(0, false);
    }

    public final void arc(float f, float f2, float f3, float[] fArr) {
        double d = f3;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f4 = this.radius;
        fArr[0] = (f4 * fCos) + f;
        fArr[1] = (f4 * fSin) + f2;
        fArr[2] = -fSin;
        fArr[3] = fCos;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.halfWidth < 1.0f) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = (this.running || this.colorProgress < 1.0f) ? Math.min(40L, Math.max(0L, jElapsedRealtime - this.lastFrameTime)) : 0L;
        this.lastFrameTime = jElapsedRealtime;
        boolean zIsEnabled = LiteMode.isEnabled(512);
        Layer layer = this.big;
        Layer layer2 = this.small;
        if (zIsEnabled && jMin > 0) {
            float f = this.animateToAmplitude;
            float f2 = this.amplitude;
            if (f != f2) {
                float f3 = this.animateAmplitudeDiff;
                float f4 = (jMin * f3) + f2;
                this.amplitude = f4;
                if (f3 > 0.0f) {
                    if (f4 > f) {
                        this.amplitude = f;
                    }
                } else if (f4 < f) {
                    this.amplitude = f;
                }
            }
            this.breathPhase = zzjd.m(jMin, this.breathPeriodMs, 6.2831855f, this.breathPhase);
            layer.update(this.amplitude);
            layer2.update(this.amplitude);
        }
        float f5 = this.colorProgress;
        if (f5 < 1.0f && jMin > 0) {
            float f6 = (jMin / 250.0f) + f5;
            this.colorProgress = f6;
            if (f6 > 1.0f) {
                this.colorProgress = 1.0f;
            }
            int iBlendARGB = ColorUtils.blendARGB(this.colorProgress, this.fromColor, this.toColor);
            this.currentColor = iBlendARGB;
            layer.color = iBlendARGB;
            layer2.color = iBlendARGB;
            layer.applyColor();
            layer2.applyColor();
        }
        float fExactCenterX = bounds.exactCenterX();
        float fExactCenterY = bounds.exactCenterY();
        float f7 = 1.0f - (this.amplitude * 0.7f);
        float f8 = layer.breathScale;
        float f9 = this.breathDepth;
        float fM = AndroidUtilities$$ExternalSyntheticOutline0.m((float) Math.sin(this.breathPhase), 0.5f, 0.5f, f8 * f9 * f7);
        float fM2 = AndroidUtilities$$ExternalSyntheticOutline0.m((float) Math.sin(this.breathPhase + layer2.phaseOffset), 0.5f, 0.5f, f9 * layer2.breathScale * f7);
        drawLayer(canvas, this.big, fExactCenterX, fExactCenterY, fM);
        drawLayer(canvas, this.small, fExactCenterX, fExactCenterY, fM2);
        if (this.colorProgress < 1.0f) {
            invalidateSelf();
        }
    }

    public final void drawLayer(Canvas canvas, Layer layer, float f, float f2, float f3) {
        char c;
        char c2;
        int i = layer.n;
        if (i == 0) {
            return;
        }
        float f4 = layer.pushMin;
        float f5 = layer.pushMax - f4;
        float f6 = this.amplitude;
        float f7 = (f5 * f6) + f4;
        float fM = AndroidUtilities$$ExternalSyntheticOutline0.m(f6, 1.0f, 0.0f, this.waveDepth * layer.waveScale);
        float[] fArr = layer.depthEff;
        float[] fArr2 = layer.depthTmp;
        float[] fArr3 = layer.offsetEff;
        char c3 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            float interpolation = SMOOTHER.getInterpolation(layer.progress[i2]);
            float f8 = 1.0f - interpolation;
            fArr[i2] = (layer.depthNext[i2] * interpolation) + (layer.depth[i2] * f8);
            fArr3[i2] = (layer.offsetNext[i2] * interpolation) + (layer.offset[i2] * f8);
        }
        float f9 = this.neighborCoherence;
        if (f9 > 0.0f) {
            int i3 = 0;
            while (i3 < 2) {
                int i4 = 0;
                while (i4 < i) {
                    int i5 = i4 + 1;
                    float f10 = (fArr[i4 == 0 ? i - 1 : i4 - 1] + fArr[i5 == i ? 0 : i5]) * 0.5f;
                    float f11 = fArr[i4];
                    fArr2[i4] = DiffUtil.m(f10, f11, f9, f11);
                    i4 = i5;
                }
                i3++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            float f12 = (i6 / i) + fArr3[i6];
            float fFloor = (f12 - ((float) Math.floor(f12))) * this.weightedTotal;
            float f13 = this.straightH;
            float[] fArr5 = this.sample;
            if (fFloor < f13) {
                fArr5[c3] = (-this.innerX) + fFloor;
                fArr5[1] = -this.halfHeight;
                fArr5[2] = 1.0f;
                fArr5[3] = 0.0f;
                c = 0;
                c2 = 1;
            } else {
                float f14 = fFloor - f13;
                float f15 = this.weightedArc;
                c = 0;
                float f16 = this.curvatureBoost;
                if (f14 < f15) {
                    c2 = 1;
                    arc(this.innerX, -this.innerY, (f14 / (f16 * this.radius)) - 1.5707964f, fArr5);
                } else {
                    c2 = 1;
                    float f17 = f14 - f15;
                    float f18 = this.straightV;
                    if (f17 < f18) {
                        fArr5[0] = this.halfWidth;
                        fArr5[1] = (-this.innerY) + f17;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f19 = f17 - f18;
                        if (f19 < f15) {
                            arc(this.innerX, this.innerY, f19 / (f16 * this.radius), fArr5);
                        } else {
                            float f20 = f19 - f15;
                            if (f20 < f13) {
                                fArr5[0] = this.innerX - f20;
                                fArr5[1] = this.halfHeight;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f21 = f20 - f13;
                                if (f21 < f15) {
                                    arc(-this.innerX, this.innerY, (f21 / (f16 * this.radius)) + 1.5707964f, fArr5);
                                } else {
                                    float f22 = f21 - f15;
                                    if (f22 < f18) {
                                        fArr5[0] = -this.halfWidth;
                                        fArr5[1] = this.innerY - f22;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        arc(-this.innerX, -this.innerY, ((f22 - f18) / (f16 * this.radius)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f23 = fArr5[3];
            float f24 = -fArr5[2];
            float f25 = (fArr[i6] * fM) + f7 + f3;
            layer.px[i6] = (f23 * f25) + f + fArr5[c];
            layer.py[i6] = (f24 * f25) + f2 + fArr5[c2];
            layer.tx[i6] = fArr5[2];
            layer.ty[i6] = fArr5[3];
            i6++;
            c3 = 0;
        }
        Path path = this.path;
        path.rewind();
        path.moveTo(layer.px[0], layer.py[0]);
        int i7 = 0;
        while (i7 < i) {
            int i8 = i7 + 1;
            int i9 = i8 < i ? i8 : 0;
            float[] fArr6 = layer.px;
            float f26 = fArr6[i9] - fArr6[i7];
            float[] fArr7 = layer.py;
            float f27 = fArr7[i9] - fArr7[i7];
            float fSqrt = ((float) Math.sqrt((f27 * f27) + (f26 * f26))) / 3.0f;
            float[] fArr8 = layer.px;
            float f28 = fArr8[i7];
            float[] fArr9 = layer.tx;
            float f29 = (fArr9[i7] * fSqrt) + f28;
            float[] fArr10 = layer.py;
            float f30 = fArr10[i7];
            float[] fArr11 = layer.ty;
            float f31 = (fArr11[i7] * fSqrt) + f30;
            float f32 = fArr8[i9];
            float f33 = f32 - (fArr9[i9] * fSqrt);
            float f34 = fArr10[i9];
            path.cubicTo(f29, f31, f33, f34 - (fArr11[i9] * fSqrt), f32, f34);
            i7 = i8;
        }
        path.close();
        canvas.drawPath(path, layer.paint);
    }

    @Override
    public final int getAlpha() {
        return this.mAlpha;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        Layer layer = this.big;
        float f = layer.pushMax;
        float f2 = layer.breathScale;
        float f3 = this.breathDepth;
        float f4 = (f2 * f3) + f;
        float f5 = layer.waveScale;
        float f6 = this.waveDepth;
        float f7 = (f5 * f6) + f4;
        Layer layer2 = this.small;
        float fMax = Math.max(f7, (f6 * layer2.waveScale) + (f3 * layer2.breathScale) + layer2.pushMax) + AndroidUtilities.dp(1.0f);
        float fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
        if (fMax > fMin) {
            fMax = Math.max(0.0f, fMin);
        }
        this.halfWidth = (bounds.width() / 2.0f) - fMax;
        float fHeight = (bounds.height() / 2.0f) - fMax;
        this.halfHeight = fHeight;
        float f8 = this.halfWidth;
        if (f8 < 1.0f || fHeight < 1.0f) {
            return;
        }
        float fMin2 = Math.min(this.cornerRadius, Math.min(f8, fHeight));
        this.radius = fMin2;
        float f9 = this.halfWidth - fMin2;
        this.innerX = f9;
        float f10 = this.halfHeight - fMin2;
        this.innerY = f10;
        float f11 = f9 * 2.0f;
        this.straightH = f11;
        float f12 = f10 * 2.0f;
        this.straightV = f12;
        float f13 = this.curvatureBoost * 1.5707964f * fMin2;
        this.weightedArc = f13;
        float f14 = (f12 * 2.0f) + (f11 * 2.0f);
        this.weightedTotal = (f13 * 4.0f) + f14;
        int iMax = Math.max(12, Math.min(80, Math.round(((fMin2 * 6.2831855f) + f14) / this.targetSpacing)));
        if (iMax != layer.n) {
            layer.resize(iMax);
            layer2.resize(iMax);
        }
    }

    @Override
    public final void setAlpha(int i) {
        if (this.mAlpha != i) {
            this.mAlpha = i;
            Layer layer = this.big;
            layer.mAlpha = i;
            layer.applyColor();
            Layer layer2 = this.small;
            layer2.mAlpha = i;
            layer2.applyColor();
            invalidateSelf();
        }
    }

    public final void setAmplitude(float f) {
        this.animateToAmplitude = f;
        if (LiteMode.isEnabled(512)) {
            float f2 = this.animateToAmplitude - this.amplitude;
            this.animateAmplitudeDiff = f2 / (((f2 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.big.paint.setColorFilter(colorFilter);
        this.small.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setState(int i, boolean z) {
        int iBlendARGB;
        if (i != this.colorState || this.colorProgress < 1.0f) {
            this.colorState = i;
            if (i == 0) {
                iBlendARGB = ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_topPanelGreen1, false), Theme.getColor(null, Theme.key_voipgroup_topPanelGreen2, false));
            } else if (i != 1) {
                iBlendARGB = i != 3 ? Theme.getColor(null, Theme.key_voipgroup_topPanelGray, false) : ColorUtils.blendARGB(0.5f, ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient2, false)), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false));
            } else {
                iBlendARGB = ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_topPanelBlue1, false), Theme.getColor(null, Theme.key_voipgroup_topPanelBlue2, false));
            }
            if (z && this.currentColor != 0 && LiteMode.isEnabled(512)) {
                this.fromColor = this.currentColor;
                this.toColor = iBlendARGB;
                this.colorProgress = 0.0f;
            } else {
                this.colorProgress = 1.0f;
                this.currentColor = iBlendARGB;
                Layer layer = this.big;
                layer.color = iBlendARGB;
                Layer layer2 = this.small;
                layer2.color = iBlendARGB;
                layer.applyColor();
                layer2.applyColor();
            }
            invalidateSelf();
        }
    }

    public final void updateState(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            setState(2, z);
            return;
        }
        ChatObject.Call call = sharedInstance.groupCall;
        if (call == null) {
            setState(sharedInstance.isMicMute() ? 1 : 0, z);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
        if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
            setState(sharedInstance.isMicMute() ? 1 : 0, z);
        } else {
            sharedInstance.setMicMute(true, false, false);
            setState(3, z);
        }
    }
}
