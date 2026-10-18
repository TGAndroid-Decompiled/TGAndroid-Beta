package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class bh1 extends org.telegram.ui.Components.voip.u2 {
    public final Path f35667s;
    public final RectF v;
    public final jh1 f35668w;

    public bh1(Activity activity, boolean z10, jh1 jh1Var) {
        super(activity);
        this.f35668w = jh1Var;
        this.f31813c = new AnimationNotificationsLocker();
        this.f31811a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f35667s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        jh1 jh1Var = this.f35668w;
        if (jh1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = jh1Var.f38179c0.getScaleX() * jh1Var.f38179c0.getWidth();
            float scaleY = jh1Var.f38179c0.getScaleY() * jh1Var.f38179c0.getHeight();
            float x10 = jh1Var.f38179c0.getX() + ((jh1Var.f38179c0.getWidth() - scaleX) / 2.0f);
            float y3 = jh1Var.f38179c0.getY() + ((jh1Var.f38179c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f35667s;
            path.rewind();
            RectF rectF = this.v;
            rectF.set(x10, y3, scaleX + x10, scaleY + y3);
            float dp = AndroidUtilities.dp(4.0f);
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
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
        jh1 jh1Var = this.f35668w;
        if (!jh1Var.G0 && !jh1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                jh1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && jh1Var.f38203p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f35668w.f38199m1) {
            return;
        }
        super.draw(canvas);
    }
}
