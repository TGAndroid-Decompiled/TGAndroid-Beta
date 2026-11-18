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
public final class ac1 extends org.telegram.ui.Components.voip.r2 {
    public final Path f45534s;
    public final RectF f45535w;
    public wn0 f45536x;
    public final hc1 f45537y;

    public ac1(Activity activity, boolean z10, hc1 hc1Var) {
        super(activity);
        this.f45537y = hc1Var;
        this.f41192c = new h2.f((int[]) null);
        this.f41190a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f41193e = true;
        }
        this.f45534s = new Path();
        this.f45535w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        hc1 hc1Var = this.f45537y;
        if (hc1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = hc1Var.f48341d0.getScaleX() * hc1Var.f48341d0.getWidth();
            float scaleY = hc1Var.f48341d0.getScaleY() * hc1Var.f48341d0.getHeight();
            float x10 = hc1Var.f48341d0.getX() + ((hc1Var.f48341d0.getWidth() - scaleX) / 2.0f);
            float y10 = hc1Var.f48341d0.getY() + ((hc1Var.f48341d0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f45534s;
            path.rewind();
            RectF rectF = this.f45535w;
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
        hc1 hc1Var = this.f45537y;
        if (!hc1Var.G0 && !hc1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                hc1Var.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && hc1Var.f48363p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f45537y.l1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.f45536x == null) {
            this.f45536x = ai.d.j(this, new tb1(this.f45537y, 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        wn0 wn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (wn0Var = this.f45536x) != null) {
            ai.d.l(this, wn0Var);
            this.f45536x = null;
        }
        super.onDetachedFromWindow();
    }
}
