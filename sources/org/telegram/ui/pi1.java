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
public final class pi1 extends org.telegram.ui.Components.voip.x2 {
    public final Path f40976s;
    public final RectF v;
    public final xi1 f40977w;

    public pi1(Activity activity, boolean z10, xi1 xi1Var) {
        super(activity);
        this.f40977w = xi1Var;
        this.f32094c = new AnimationNotificationsLocker();
        this.f32092a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f32095e = true;
        }
        this.f40976s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xi1 xi1Var = this.f40977w;
        if (xi1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = xi1Var.f43990c0.getScaleX() * xi1Var.f43990c0.getWidth();
            float scaleY = xi1Var.f43990c0.getScaleY() * xi1Var.f43990c0.getHeight();
            float x10 = xi1Var.f43990c0.getX() + ((xi1Var.f43990c0.getWidth() - scaleX) / 2.0f);
            float y3 = xi1Var.f43990c0.getY() + ((xi1Var.f43990c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f40976s;
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
        xi1 xi1Var = this.f40977w;
        if (!xi1Var.G0 && !xi1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                xi1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && xi1Var.f44015p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f40977w.f44011m1) {
            return;
        }
        super.draw(canvas);
    }
}
