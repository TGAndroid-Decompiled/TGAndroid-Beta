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
public final class cc1 extends org.telegram.ui.Components.voip.o2 {
    public final Path f44325s;
    public final RectF f44326w;
    public vn0 f44327x;
    public final jc1 f44328y;

    public cc1(Activity activity, boolean z9, jc1 jc1Var) {
        super(activity);
        this.f44328y = jc1Var;
        this.f39450c = new h2.f((int[]) null);
        this.f39448a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z9) {
            this.f39451e = true;
        }
        this.f44325s = new Path();
        this.f44326w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        jc1 jc1Var = this.f44328y;
        if (jc1Var.D0 && getAlpha() != 0.0f) {
            float scaleX = jc1Var.f46914c0.getScaleX() * jc1Var.f46914c0.getWidth();
            float scaleY = jc1Var.f46914c0.getScaleY() * jc1Var.f46914c0.getHeight();
            float x10 = jc1Var.f46914c0.getX() + ((jc1Var.f46914c0.getWidth() - scaleX) / 2.0f);
            float y10 = jc1Var.f46914c0.getY() + ((jc1Var.f46914c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f44325s;
            path.rewind();
            RectF rectF = this.f44326w;
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
        jc1 jc1Var = this.f44328y;
        if (!jc1Var.F0 && !jc1Var.D0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                jc1Var.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && jc1Var.f46937o0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f44328y.f46933k1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.f44327x == null) {
            this.f44327x = g0.a.h(this, new vb1(this.f44328y, 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        vn0 vn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (vn0Var = this.f44327x) != null) {
            g0.a.j(this, vn0Var);
            this.f44327x = null;
        }
        super.onDetachedFromWindow();
    }
}
