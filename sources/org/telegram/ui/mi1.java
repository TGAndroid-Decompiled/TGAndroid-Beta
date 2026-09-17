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
public final class mi1 extends org.telegram.ui.Components.voip.u2 {
    public final Path f38719s;
    public final RectF v;
    public final ui1 f38720w;

    public mi1(Activity activity, boolean z10, ui1 ui1Var) {
        super(activity);
        this.f38720w = ui1Var;
        this.f31875c = new AnimationNotificationsLocker();
        this.f31873a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f31876e = true;
        }
        this.f38719s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ui1 ui1Var = this.f38720w;
        if (ui1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = ui1Var.f41115c0.getScaleX() * ui1Var.f41115c0.getWidth();
            float scaleY = ui1Var.f41115c0.getScaleY() * ui1Var.f41115c0.getHeight();
            float x10 = ui1Var.f41115c0.getX() + ((ui1Var.f41115c0.getWidth() - scaleX) / 2.0f);
            float y3 = ui1Var.f41115c0.getY() + ((ui1Var.f41115c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f38719s;
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
        ui1 ui1Var = this.f38720w;
        if (!ui1Var.G0 && !ui1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ui1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ui1Var.f41140p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f38720w.f41136m1) {
            return;
        }
        super.draw(canvas);
    }
}
