package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class bc1 extends org.telegram.ui.Components.voip.o2 {
    public final Path f43975s;
    public final RectF f43976w;
    public un0 f43977x;
    public final ic1 f43978y;

    public bc1(Activity activity, boolean z9, ic1 ic1Var) {
        super(activity);
        this.f43978y = ic1Var;
        this.f39530c = new h2.f((int[]) null);
        this.f39528a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z9) {
            this.f39531e = true;
        }
        this.f43975s = new Path();
        this.f43976w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ic1 ic1Var = this.f43978y;
        if (ic1Var.D0 && getAlpha() != 0.0f) {
            float scaleX = ic1Var.f46578c0.getScaleX() * ic1Var.f46578c0.getWidth();
            float scaleY = ic1Var.f46578c0.getScaleY() * ic1Var.f46578c0.getHeight();
            float x10 = ic1Var.f46578c0.getX() + ((ic1Var.f46578c0.getWidth() - scaleX) / 2.0f);
            float y10 = ic1Var.f46578c0.getY() + ((ic1Var.f46578c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f43975s;
            path.rewind();
            RectF rectF = this.f43976w;
            rectF.set(x10, y10, scaleX + x10, scaleY + y10);
            float L = org.telegram.messenger.g0.L(4.0f);
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            path.close();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        ic1 ic1Var = this.f43978y;
        if (!ic1Var.F0 && !ic1Var.D0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ic1Var.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ic1Var.f46601o0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
                sharedState.stopRinging();
                return true;
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f43978y.f46597k1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.f43977x == null) {
            this.f43977x = g0.a.h(this, new tb1(this.f43978y, 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        un0 un0Var;
        if (Build.VERSION.SDK_INT >= 33 && (un0Var = this.f43977x) != null) {
            g0.a.j(this, un0Var);
            this.f43977x = null;
        }
        super.onDetachedFromWindow();
    }
}
