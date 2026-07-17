package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.core.graphics.ColorUtils;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class CapsuleBlobDrawable extends Drawable {
    public static float MAX_SPEED = 8.2f;
    public static float MIN_SPEED = 0.8f;
    private static final TimeInterpolator SMOOTHER = new TimeInterpolator() {
        @Override
        public final float getInterpolation(float f) {
            return CapsuleBlobDrawable.lambda$static$0(f);
        }
    };
    private float amplitude;
    private float animateAmplitudeDiff;
    private float animateToAmplitude;
    private final Layer big;
    private float breathPhase;
    private int currentColor;
    private int fromColor;
    private float halfHeight;
    private float halfWidth;
    private float innerX;
    private float innerY;
    private long lastFrameTime;
    private float perimeter;
    private float radius;
    private boolean running;
    private final Layer small;
    private float straightH;
    private float straightV;
    private int toColor;
    private float weightedArc;
    private float weightedTotal;
    private float cornerRadius = AndroidUtilities.dp(18.0f);
    private float targetSpacing = AndroidUtilities.dp(22.0f);
    private float curvatureBoost = 2.4f;
    private float waveDepth = AndroidUtilities.dp(12.0f);
    private float breathDepth = AndroidUtilities.dp(1.5f);
    private float breathPeriodMs = 3600.0f;
    private float neighborCoherence = 0.25f;
    private final Path path = new Path();
    private final float[] sample = new float[4];
    private int colorState = -1;
    private float colorProgress = 1.0f;
    private final Runnable mInvalidateSelf = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$1();
        }
    };
    private int mAlpha = 255;

    public static float lambda$static$0(float f) {
        return f * f * f * ((f * ((6.0f * f) - 15.0f)) + 10.0f);
    }

    @Override
    public int getOpacity() {
        return -3;
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
        setState(0);
    }

    public void setState(int i) {
        setState(i, false);
    }

    public void setState(int i, boolean z) {
        if (i != this.colorState || this.colorProgress < 1.0f) {
            this.colorState = i;
            int iResolveStateColor = resolveStateColor(i);
            if (z && this.currentColor != 0 && LiteMode.isEnabled(512)) {
                this.fromColor = this.currentColor;
                this.toColor = iResolveStateColor;
                this.colorProgress = 0.0f;
            } else {
                this.colorProgress = 1.0f;
                applyColor(iResolveStateColor);
            }
            invalidateSelf();
        }
    }

    public void updateState(boolean z) {
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

    private static int resolveStateColor(int i) {
        if (i == 0) {
            return ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_topPanelGreen1), Theme.getColor(Theme.key_voipgroup_topPanelGreen2), 0.5f);
        }
        if (i == 1) {
            return ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_topPanelBlue1), Theme.getColor(Theme.key_voipgroup_topPanelBlue2), 0.5f);
        }
        if (i == 3) {
            return ColorUtils.blendARGB(ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient2), 0.5f), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3), 0.5f);
        }
        return Theme.getColor(Theme.key_voipgroup_topPanelGray);
    }

    private void applyColor(int i) {
        this.currentColor = i;
        Layer layer = this.big;
        layer.color = i;
        this.small.color = i;
        layer.applyColor();
        this.small.applyColor();
    }

    public int getRequiredInset() {
        return ((int) maxOutwardExcursion()) + AndroidUtilities.dp(1.0f);
    }

    private float maxOutwardExcursion() {
        Layer layer = this.big;
        float f = layer.pushMax;
        float f2 = this.breathDepth;
        float f3 = f + (layer.breathScale * f2);
        float f4 = this.waveDepth;
        float f5 = f3 + (layer.waveScale * f4);
        Layer layer2 = this.small;
        return Math.max(f5, layer2.pushMax + (f2 * layer2.breathScale) + (f4 * layer2.waveScale));
    }

    public void lambda$new$1() {
        if (LiteMode.isEnabled(512)) {
            invalidateSelf();
        }
    }

    public void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        this.lastFrameTime = SystemClock.elapsedRealtime();
        Choreographer60FpsContent.getInstance().addFrameCallback(this.mInvalidateSelf, 60);
    }

    public void stop() {
        if (this.running) {
            this.running = false;
            Choreographer60FpsContent.getInstance().removeFrameCallback(this.mInvalidateSelf);
        }
    }

    public void setAmplitude(float f) {
        setAmplitude(f, false);
    }

    public void setAmplitude(float f, boolean z) {
        this.animateToAmplitude = f;
        if (LiteMode.isEnabled(512)) {
            float f2 = this.animateToAmplitude - this.amplitude;
            if (z) {
                this.animateAmplitudeDiff = f2 / (((f2 > 0.0f ? 300.0f : 500.0f) * 0.35000002f) + 100.0f);
            } else {
                this.animateAmplitudeDiff = f2 / (((f2 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
            }
        }
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        rebuildGeometry();
    }

    private void rebuildGeometry() {
        if (getBounds().isEmpty()) {
            return;
        }
        float fMaxOutwardExcursion = maxOutwardExcursion() + AndroidUtilities.dp(1.0f);
        float fMin = (Math.min(r0.width(), r0.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
        if (fMaxOutwardExcursion > fMin) {
            fMaxOutwardExcursion = Math.max(0.0f, fMin);
        }
        this.halfWidth = (r0.width() / 2.0f) - fMaxOutwardExcursion;
        float fHeight = (r0.height() / 2.0f) - fMaxOutwardExcursion;
        this.halfHeight = fHeight;
        float f = this.halfWidth;
        if (f < 1.0f || fHeight < 1.0f) {
            return;
        }
        float fMin2 = Math.min(this.cornerRadius, Math.min(f, fHeight));
        this.radius = fMin2;
        float f2 = this.halfWidth - fMin2;
        this.innerX = f2;
        float f3 = this.halfHeight - fMin2;
        this.innerY = f3;
        float f4 = f2 * 2.0f;
        this.straightH = f4;
        float f5 = f3 * 2.0f;
        this.straightV = f5;
        float f6 = this.curvatureBoost * 1.5707964f * fMin2;
        this.weightedArc = f6;
        float f7 = (f4 * 2.0f) + (f5 * 2.0f);
        this.weightedTotal = (f6 * 4.0f) + f7;
        float f8 = f7 + (fMin2 * 6.2831855f);
        this.perimeter = f8;
        int iMax = Math.max(12, Math.min(80, Math.round(f8 / this.targetSpacing)));
        if (iMax != this.big.count()) {
            this.big.resize(iMax);
            this.small.resize(iMax);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.halfWidth < 1.0f) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = (this.running || this.colorProgress < 1.0f) ? Math.min(40L, Math.max(0L, jElapsedRealtime - this.lastFrameTime)) : 0L;
        this.lastFrameTime = jElapsedRealtime;
        if (LiteMode.isEnabled(512) && jMin > 0) {
            updateAmplitude(jMin);
            this.breathPhase += (jMin / this.breathPeriodMs) * 6.2831855f;
            this.big.update(this.amplitude);
            this.small.update(this.amplitude);
        }
        float f = this.colorProgress;
        if (f < 1.0f && jMin > 0) {
            float f2 = f + (jMin / 250.0f);
            this.colorProgress = f2;
            if (f2 > 1.0f) {
                this.colorProgress = 1.0f;
            }
            applyColor(ColorUtils.blendARGB(this.fromColor, this.toColor, this.colorProgress));
        }
        float fExactCenterX = bounds.exactCenterX();
        float fExactCenterY = bounds.exactCenterY();
        float f3 = 1.0f - (this.amplitude * 0.7f);
        float fSin = this.breathDepth * this.big.breathScale * f3 * ((((float) Math.sin(this.breathPhase)) * 0.5f) + 0.5f);
        float fSin2 = this.breathDepth * this.small.breathScale * f3 * ((((float) Math.sin(this.breathPhase + r5.phaseOffset)) * 0.5f) + 0.5f);
        drawLayer(canvas, this.big, fExactCenterX, fExactCenterY, fSin);
        drawLayer(canvas, this.small, fExactCenterX, fExactCenterY, fSin2);
        if (this.colorProgress < 1.0f) {
            invalidateSelf();
        }
    }

    private void drawLayer(Canvas canvas, Layer layer, float f, float f2, float f3) {
        int iCount = layer.count();
        if (iCount == 0) {
            return;
        }
        float f4 = layer.pushMin;
        float f5 = layer.pushMax - f4;
        float f6 = this.amplitude;
        float f7 = f4 + (f5 * f6);
        float f8 = this.waveDepth * layer.waveScale * ((f6 * 1.0f) + 0.0f);
        float[] fArr = layer.depthEff;
        float[] fArr2 = layer.depthTmp;
        float[] fArr3 = layer.offsetEff;
        for (int i = 0; i < iCount; i++) {
            float interpolation = SMOOTHER.getInterpolation(layer.progress[i]);
            float f9 = 1.0f - interpolation;
            fArr[i] = (layer.depth[i] * f9) + (layer.depthNext[i] * interpolation);
            fArr3[i] = (layer.offset[i] * f9) + (layer.offsetNext[i] * interpolation);
        }
        if (this.neighborCoherence > 0.0f) {
            int i2 = 0;
            while (i2 < 2) {
                int i3 = 0;
                while (i3 < iCount) {
                    int i4 = i3 + 1;
                    float f10 = (fArr[i3 == 0 ? iCount - 1 : i3 - 1] + fArr[i4 == iCount ? 0 : i4]) * 0.5f;
                    float f11 = fArr[i3];
                    fArr2[i3] = f11 + (this.neighborCoherence * (f10 - f11));
                    i3 = i4;
                }
                i2++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
            }
        }
        for (int i5 = 0; i5 < iCount; i5++) {
            pointAt((i5 / iCount) + fArr3[i5], this.sample);
            float[] fArr5 = this.sample;
            float f12 = fArr5[3];
            float f13 = -fArr5[2];
            float f14 = f7 + f3 + (fArr[i5] * f8);
            layer.px[i5] = f + fArr5[0] + (f12 * f14);
            layer.py[i5] = f2 + fArr5[1] + (f13 * f14);
            layer.tx[i5] = fArr5[2];
            layer.ty[i5] = fArr5[3];
        }
        this.path.rewind();
        this.path.moveTo(layer.px[0], layer.py[0]);
        int i6 = 0;
        while (i6 < iCount) {
            int i7 = i6 + 1;
            int i8 = i7 < iCount ? i7 : 0;
            float[] fArr6 = layer.px;
            float f15 = fArr6[i8] - fArr6[i6];
            float[] fArr7 = layer.py;
            float f16 = fArr7[i8] - fArr7[i6];
            float fSqrt = ((float) Math.sqrt((f15 * f15) + (f16 * f16))) / 3.0f;
            Path path = this.path;
            float[] fArr8 = layer.px;
            float f17 = fArr8[i6];
            float[] fArr9 = layer.tx;
            float f18 = (fArr9[i6] * fSqrt) + f17;
            float[] fArr10 = layer.py;
            float f19 = fArr10[i6];
            float[] fArr11 = layer.ty;
            float f20 = f19 + (fArr11[i6] * fSqrt);
            float f21 = fArr8[i8];
            float f22 = f21 - (fArr9[i8] * fSqrt);
            float f23 = fArr10[i8];
            path.cubicTo(f18, f20, f22, f23 - (fArr11[i8] * fSqrt), f21, f23);
            i6 = i7;
        }
        this.path.close();
        canvas.drawPath(this.path, layer.paint);
    }

    private void pointAt(float f, float[] fArr) {
        float fFloor = (f - ((float) Math.floor(f))) * this.weightedTotal;
        float f2 = this.straightH;
        if (fFloor < f2) {
            fArr[0] = (-this.innerX) + fFloor;
            fArr[1] = -this.halfHeight;
            fArr[2] = 1.0f;
            fArr[3] = 0.0f;
            return;
        }
        float f3 = fFloor - f2;
        float f4 = this.weightedArc;
        if (f3 < f4) {
            arc(this.innerX, -this.innerY, (f3 / (this.curvatureBoost * this.radius)) - 1.5707964f, fArr);
            return;
        }
        float f5 = f3 - f4;
        float f6 = this.straightV;
        if (f5 < f6) {
            fArr[0] = this.halfWidth;
            fArr[1] = (-this.innerY) + f5;
            fArr[2] = 0.0f;
            fArr[3] = 1.0f;
            return;
        }
        float f7 = f5 - f6;
        if (f7 < f4) {
            arc(this.innerX, this.innerY, f7 / (this.curvatureBoost * this.radius), fArr);
            return;
        }
        float f8 = f7 - f4;
        if (f8 < f2) {
            fArr[0] = this.innerX - f8;
            fArr[1] = this.halfHeight;
            fArr[2] = -1.0f;
            fArr[3] = 0.0f;
            return;
        }
        float f9 = f8 - f2;
        if (f9 < f4) {
            arc(-this.innerX, this.innerY, (f9 / (this.curvatureBoost * this.radius)) + 1.5707964f, fArr);
            return;
        }
        float f10 = f9 - f4;
        if (f10 < f6) {
            fArr[0] = -this.halfWidth;
            fArr[1] = this.innerY - f10;
            fArr[2] = 0.0f;
            fArr[3] = -1.0f;
            return;
        }
        arc(-this.innerX, -this.innerY, ((f10 - f6) / (this.curvatureBoost * this.radius)) + 3.1415927f, fArr);
    }

    private void arc(float f, float f2, float f3, float[] fArr) {
        double d = f3;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f4 = this.radius;
        fArr[0] = f + (f4 * fCos);
        fArr[1] = f2 + (f4 * fSin);
        fArr[2] = -fSin;
        fArr[3] = fCos;
    }

    private void updateAmplitude(long j) {
        float f = this.animateToAmplitude;
        float f2 = this.amplitude;
        if (f != f2) {
            float f3 = this.animateAmplitudeDiff;
            float f4 = f2 + (j * f3);
            this.amplitude = f4;
            if (f3 > 0.0f) {
                if (f4 > f) {
                    this.amplitude = f;
                }
            } else if (f4 < f) {
                this.amplitude = f;
            }
        }
    }

    @Override
    public void setAlpha(int i) {
        if (this.mAlpha != i) {
            this.mAlpha = i;
            this.big.setLayerAlpha(i);
            this.small.setLayerAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public int getAlpha() {
        return this.mAlpha;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.big.paint.setColorFilter(colorFilter);
        this.small.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private static final class Layer {
        int baseAlpha;
        float breathScale;
        int color;
        float[] depth;
        float[] depthEff;
        float[] depthNext;
        float[] depthTmp;
        private int mAlpha;
        private int n;
        float[] offset;
        float[] offsetEff;
        float[] offsetNext;
        final Paint paint;
        float phaseOffset;
        float[] progress;
        float pushMax;
        float pushMin;
        float[] px;
        float[] py;
        final Random random;
        float[] speed;
        float speedScale;
        float[] tx;
        float[] ty;
        float waveScale;

        static float clamp(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        private Layer() {
            this.color = -11318601;
            this.paint = new Paint(1);
            this.random = new Random();
            this.mAlpha = 255;
        }

        int count() {
            return this.n;
        }

        void applyColor() {
            this.paint.setColor(this.color);
            this.paint.setAlpha((this.baseAlpha * this.mAlpha) / 255);
        }

        void setLayerAlpha(int i) {
            this.mAlpha = i;
            applyColor();
        }

        void resize(int i) {
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
                this.depth[i2] = this.random.nextFloat();
                this.offset[i2] = (((this.random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.n;
                next(i2);
                this.progress[i2] = this.random.nextFloat();
            }
            applyColor();
        }

        void next(int i) {
            float f = 0.18f / this.n;
            this.depthNext[i] = clamp(this.depth[i] + ((this.random.nextFloat() - 0.5f) * 2.0f * 0.35f), 0.0f, 1.0f);
            this.offsetNext[i] = clamp(this.offset[i] + ((this.random.nextFloat() - 0.5f) * 2.0f * f * 0.35f), -f, f);
            this.speed[i] = ((this.random.nextFloat() * 0.003f) + 0.017f) * this.speedScale;
        }

        void update(float f) {
            for (int i = 0; i < this.n; i++) {
                float[] fArr = this.progress;
                float f2 = fArr[i];
                float f3 = this.speed[i];
                float f4 = f2 + (CapsuleBlobDrawable.MIN_SPEED * f3) + (f3 * f * CapsuleBlobDrawable.MAX_SPEED);
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
}
