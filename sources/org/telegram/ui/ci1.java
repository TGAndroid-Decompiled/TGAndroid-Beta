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
public final class ci1 extends org.telegram.ui.Components.voip.x2 {
    public final Path f35480s;
    public final RectF v;
    public final ki1 f35481w;

    public ci1(Activity activity, boolean z10, ki1 ki1Var) {
        super(activity);
        this.f35481w = ki1Var;
        this.f32365c = new AnimationNotificationsLocker();
        this.f32363a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f32366e = true;
        }
        this.f35480s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ki1 ki1Var = this.f35481w;
        if (ki1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = ki1Var.f38025c0.getScaleX() * ki1Var.f38025c0.getWidth();
            float scaleY = ki1Var.f38025c0.getScaleY() * ki1Var.f38025c0.getHeight();
            float x10 = ki1Var.f38025c0.getX() + ((ki1Var.f38025c0.getWidth() - scaleX) / 2.0f);
            float y3 = ki1Var.f38025c0.getY() + ((ki1Var.f38025c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f35480s;
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
        ki1 ki1Var = this.f35481w;
        if (!ki1Var.G0 && !ki1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ki1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ki1Var.f38050p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f35481w.f38046m1) {
            return;
        }
        super.draw(canvas);
    }
}
