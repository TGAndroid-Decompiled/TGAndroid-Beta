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
public final class oi1 extends org.telegram.ui.Components.voip.w2 {
    public final Path f40540s;
    public final RectF v;
    public final wi1 f40541w;

    public oi1(Activity activity, boolean z10, wi1 wi1Var) {
        super(activity);
        this.f40541w = wi1Var;
        this.f32349c = new AnimationNotificationsLocker();
        this.f32347a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f32350e = true;
        }
        this.f40540s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wi1 wi1Var = this.f40541w;
        if (wi1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = wi1Var.f43631c0.getScaleX() * wi1Var.f43631c0.getWidth();
            float scaleY = wi1Var.f43631c0.getScaleY() * wi1Var.f43631c0.getHeight();
            float x10 = wi1Var.f43631c0.getX() + ((wi1Var.f43631c0.getWidth() - scaleX) / 2.0f);
            float y3 = wi1Var.f43631c0.getY() + ((wi1Var.f43631c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f40540s;
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
        wi1 wi1Var = this.f40541w;
        if (!wi1Var.G0 && !wi1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                wi1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && wi1Var.f43656p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f40541w.f43652m1) {
            return;
        }
        super.draw(canvas);
    }
}
