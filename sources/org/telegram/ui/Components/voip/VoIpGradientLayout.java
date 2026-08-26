package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.firebase.messaging.GmsRpc;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.PhotoViewer$41$1;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;

public final class VoIpGradientLayout extends FrameLayout {
    public final boolean allowAnimations;
    public int alphaBlueGreen;
    public int alphaBlueViolet;
    public int alphaGreen;
    public int alphaOrangeRed;
    public final VoIPBackgroundProvider backgroundProvider;
    public ValueAnimator badConnectionAnimator;
    public final Drawable bgBlueGreen;
    public final Drawable bgBlueGreenDark;
    public final Drawable bgBlueGreenLight;
    public final Drawable bgBlueViolet;
    public final Drawable bgBlueVioletDark;
    public final Drawable bgBlueVioletLight;
    public final MotionBackgroundDrawable bgGreen;
    public final MotionBackgroundDrawable bgGreenDark;
    public final MotionBackgroundDrawable bgGreenDarkReveal;
    public final MotionBackgroundDrawable bgGreenLight;
    public final MotionBackgroundDrawable bgGreenLightReveal;
    public final MotionBackgroundDrawable bgOrangeRed;
    public final MotionBackgroundDrawable bgOrangeRedDark;
    public final MotionBackgroundDrawable bgOrangeRedLight;
    public ValueAnimator callingAnimator;
    public int clipCx;
    public int clipCy;
    public final Path clipPath;
    public float clipRadius;
    public AnimatorSet connectedAnimatorSet;
    public final AnimatorSet defaultAnimatorSet;
    public boolean isPaused;
    public volatile boolean lockDrawing;
    public boolean showClip;
    public int state;

    public final class PureColorDrawable extends Drawable {
        public final int color = -15130842;

        @Override
        public final void draw(Canvas canvas) {
            canvas.drawColor(this.color);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public VoIpGradientLayout(Activity activity, boolean z, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(activity);
        this.alphaBlueViolet = 0;
        this.alphaBlueGreen = 0;
        this.alphaGreen = 0;
        this.alphaOrangeRed = 0;
        this.clipRadius = 0.0f;
        this.showClip = false;
        this.clipPath = new Path();
        this.clipCx = 0;
        this.clipCy = 0;
        this.isPaused = false;
        this.lockDrawing = false;
        this.backgroundProvider = voIPBackgroundProvider;
        boolean zIsEnabled = LiteMode.isEnabled(512);
        this.allowAnimations = zIsEnabled;
        this.bgBlueViolet = z ? new PureColorDrawable() : new MotionBackgroundDrawable(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        this.bgBlueGreen = z ? new PureColorDrawable() : new MotionBackgroundDrawable(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        this.bgGreen = new MotionBackgroundDrawable(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.bgOrangeRed = new MotionBackgroundDrawable(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        Drawable pureColorDrawable = z ? new PureColorDrawable() : new MotionBackgroundDrawable(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        this.bgBlueVioletDark = pureColorDrawable;
        Drawable pureColorDrawable2 = z ? new PureColorDrawable() : new MotionBackgroundDrawable(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        this.bgBlueGreenDark = pureColorDrawable2;
        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.bgGreenDark = motionBackgroundDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.bgOrangeRedDark = motionBackgroundDrawable2;
        Drawable pureColorDrawable3 = z ? new PureColorDrawable() : new MotionBackgroundDrawable(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        this.bgBlueVioletLight = pureColorDrawable3;
        Drawable pureColorDrawable4 = z ? new PureColorDrawable() : new MotionBackgroundDrawable(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        this.bgBlueGreenLight = pureColorDrawable4;
        MotionBackgroundDrawable motionBackgroundDrawable3 = new MotionBackgroundDrawable(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.bgGreenLight = motionBackgroundDrawable3;
        MotionBackgroundDrawable motionBackgroundDrawable4 = new MotionBackgroundDrawable(-34714, -32091, -85931, -29103, false, 0, true);
        this.bgOrangeRedLight = motionBackgroundDrawable4;
        this.bgGreenLightReveal = new MotionBackgroundDrawable(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.bgGreenDarkReveal = new MotionBackgroundDrawable(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        pureColorDrawable.setBounds(0, 0, 80, 80);
        pureColorDrawable2.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable2.setBounds(0, 0, 80, 80);
        pureColorDrawable3.setBounds(0, 0, 80, 80);
        pureColorDrawable4.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable3.setBounds(0, 0, 80, 80);
        motionBackgroundDrawable4.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.defaultAnimatorSet = animatorSet;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(20, this, voIPBackgroundProvider));
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt);
        animatorSet.setDuration(12000L);
        if (zIsEnabled) {
            animatorSet.start();
        }
        if (this.state == 1) {
            return;
        }
        this.state = 1;
        this.alphaBlueGreen = 255;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0, 255);
        this.callingAnimator = valueAnimatorOfInt2;
        valueAnimatorOfInt2.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(this, 3));
        this.callingAnimator.setRepeatCount(-1);
        this.callingAnimator.setRepeatMode(1);
        this.callingAnimator.setInterpolator(new LinearInterpolator());
        this.callingAnimator.setDuration(12000L);
        if (zIsEnabled) {
            this.callingAnimator.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.defaultAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.connectedAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.callingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.lockDrawing) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float fSqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(fSqrt, fSqrt, width, height);
        canvas.rotate(this.backgroundProvider.degree, width, height);
        Canvas canvas2 = (Canvas) this.backgroundProvider.lightShaderTools.metadata;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        ((Canvas) this.backgroundProvider.darkShaderTools.metadata).drawColor(0, mode);
        int i = this.alphaGreen;
        if (i != 0 && this.alphaOrangeRed != 255) {
            this.bgGreen.setAlpha(i);
            this.bgGreenLight.setAlpha(this.alphaGreen);
            this.bgGreenDark.setAlpha(this.alphaGreen);
            this.bgGreen.draw(canvas);
            this.bgGreenLight.draw((Canvas) this.backgroundProvider.lightShaderTools.metadata);
            this.bgGreenDark.draw((Canvas) this.backgroundProvider.darkShaderTools.metadata);
        }
        int i2 = this.alphaBlueGreen;
        if (i2 != 0 && this.alphaOrangeRed != 255) {
            this.bgBlueGreen.setAlpha(i2);
            this.bgBlueGreenDark.setAlpha(this.alphaBlueGreen);
            this.bgBlueGreenLight.setAlpha(this.alphaBlueGreen);
            this.bgBlueGreen.draw(canvas);
            this.bgBlueGreenDark.draw((Canvas) this.backgroundProvider.darkShaderTools.metadata);
            this.bgBlueGreenLight.draw((Canvas) this.backgroundProvider.lightShaderTools.metadata);
        }
        int i3 = this.alphaBlueViolet;
        if (i3 != 0 && this.alphaOrangeRed != 255) {
            this.bgBlueViolet.setAlpha(i3);
            this.bgBlueVioletDark.setAlpha(this.alphaBlueViolet);
            this.bgBlueVioletLight.setAlpha(this.alphaBlueViolet);
            this.bgBlueViolet.draw(canvas);
            this.bgBlueVioletDark.draw((Canvas) this.backgroundProvider.darkShaderTools.metadata);
            this.bgBlueVioletLight.draw((Canvas) this.backgroundProvider.lightShaderTools.metadata);
        }
        int i4 = this.alphaOrangeRed;
        if (i4 != 0) {
            this.bgOrangeRed.setAlpha(i4);
            this.bgOrangeRedDark.setAlpha(this.alphaOrangeRed);
            this.bgOrangeRedLight.setAlpha(this.alphaOrangeRed);
            this.bgOrangeRed.draw(canvas);
            this.bgOrangeRedDark.draw((Canvas) this.backgroundProvider.darkShaderTools.metadata);
            this.bgOrangeRedLight.draw((Canvas) this.backgroundProvider.lightShaderTools.metadata);
        }
        canvas.restore();
        if (this.showClip) {
            this.clipPath.rewind();
            Path path = this.clipPath;
            float f = this.clipCx;
            float f2 = this.clipCy;
            float f3 = this.clipRadius;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f, f2, f3, direction);
            canvas.clipPath(this.clipPath);
            Objects.requireNonNull(this.backgroundProvider);
            Objects.requireNonNull(this.backgroundProvider);
            canvas.scale(1.12f, 1.12f, width, height);
            this.bgGreen.setAlpha(255);
            this.bgGreen.draw(canvas);
            this.clipPath.rewind();
            this.clipPath.addCircle(this.clipCx / 4.0f, this.clipCy / 4.0f, this.clipRadius / 4.0f, direction);
            ((Canvas) this.backgroundProvider.revealShaderTools.metadata).drawColor(0, mode);
            ((Canvas) this.backgroundProvider.revealShaderTools.metadata).save();
            ((Canvas) this.backgroundProvider.revealShaderTools.metadata).clipPath(this.clipPath);
            this.bgGreenLightReveal.setAlpha(255);
            this.bgGreenLightReveal.draw((Canvas) this.backgroundProvider.revealShaderTools.metadata);
            ((Canvas) this.backgroundProvider.revealShaderTools.metadata).restore();
            ((Canvas) this.backgroundProvider.revealDarkShaderTools.metadata).drawColor(0, mode);
            ((Canvas) this.backgroundProvider.revealDarkShaderTools.metadata).save();
            ((Canvas) this.backgroundProvider.revealDarkShaderTools.metadata).clipPath(this.clipPath);
            this.bgGreenDarkReveal.setAlpha(255);
            this.bgGreenDarkReveal.draw((Canvas) this.backgroundProvider.revealDarkShaderTools.metadata);
            ((Canvas) this.backgroundProvider.revealDarkShaderTools.metadata).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.bgGreen.setBounds(0, 0, getWidth(), getHeight());
        this.bgOrangeRed.setBounds(0, 0, getWidth(), getHeight());
        this.bgBlueGreen.setBounds(0, 0, getWidth(), getHeight());
        this.bgBlueViolet.setBounds(0, 0, getWidth(), getHeight());
        this.bgGreenLightReveal.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.bgGreenDarkReveal.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        VoIPBackgroundProvider voIPBackgroundProvider = this.backgroundProvider;
        voIPBackgroundProvider.totalWidth = width;
        voIPBackgroundProvider.totalHeight = height;
        int i5 = width / 4;
        int i6 = height / 4;
        voIPBackgroundProvider.revealShaderTools = new GmsRpc(i5, i6);
        GmsRpc gmsRpc = new GmsRpc(i5, i6);
        voIPBackgroundProvider.revealDarkShaderTools = gmsRpc;
        ((Paint) gmsRpc.app).setAlpha(180);
    }

    public final void resume() {
        if (this.isPaused) {
            this.isPaused = false;
            AnimatorSet animatorSet = this.defaultAnimatorSet;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.connectedAnimatorSet;
            if (animatorSet2 == null || !animatorSet2.isPaused()) {
                return;
            }
            this.connectedAnimatorSet.resume();
        }
    }

    public final void switchToCallConnected(int i, int i2, boolean z) {
        int i3 = 3;
        int i4 = this.state;
        if (i4 == 2 || i4 == 3) {
            return;
        }
        this.state = 2;
        ValueAnimator valueAnimator = this.callingAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.callingAnimator.cancel();
            this.callingAnimator = null;
        }
        this.clipCx = i;
        this.clipCy = i2;
        Point point = AndroidUtilities.displaySize;
        int i5 = point.x - i;
        int i6 = i5 * i5;
        int i7 = ((point.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight) - i2;
        int i8 = i7 * i7;
        int i9 = i * i;
        int i10 = i2 * i2;
        double dMax = Math.max(Math.max(Math.max(Math.sqrt(i6 + i8), Math.sqrt(i8 + i9)), Math.sqrt(i9 + i10)), Math.sqrt(i6 + i10));
        this.showClip = true;
        this.backgroundProvider.isReveal = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (float) dMax);
        valueAnimatorOfFloat.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(this, 1));
        valueAnimatorOfFloat.addListener(new PhotoViewer$41$1(this, i3));
        valueAnimatorOfFloat.setDuration(z ? 400L : 0L);
        valueAnimatorOfFloat.start();
    }

    public final void switchToConnectedAnimator() {
        if (this.connectedAnimatorSet != null) {
            return;
        }
        ValueAnimator valueAnimator = this.callingAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.callingAnimator.cancel();
            this.callingAnimator = null;
        }
        this.alphaGreen = 255;
        this.connectedAnimatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        valueAnimatorOfInt.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(this, 4));
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        valueAnimatorOfInt2.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(this, 5));
        valueAnimatorOfInt2.setRepeatCount(-1);
        valueAnimatorOfInt2.setRepeatMode(1);
        this.connectedAnimatorSet.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt);
        this.connectedAnimatorSet.setInterpolator(new LinearInterpolator());
        this.connectedAnimatorSet.setDuration(24000L);
        if (this.allowAnimations) {
            this.connectedAnimatorSet.start();
        } else {
            this.alphaBlueGreen = 0;
            this.alphaBlueViolet = 0;
        }
        invalidate();
    }
}
