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
public final class jh1 extends org.telegram.ui.Components.voip.x2 {
    public final Path f40543s;
    public final RectF v;
    public final rh1 f40544w;

    public jh1(Activity activity, boolean z10, rh1 rh1Var) {
        super(activity);
        this.f40544w = rh1Var;
        this.f34313c = new AnimationNotificationsLocker();
        this.f34311a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f40543s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rh1 rh1Var = this.f40544w;
        if (rh1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = rh1Var.f43007c0.getScaleX() * rh1Var.f43007c0.getWidth();
            float scaleY = rh1Var.f43007c0.getScaleY() * rh1Var.f43007c0.getHeight();
            float x9 = rh1Var.f43007c0.getX() + ((rh1Var.f43007c0.getWidth() - scaleX) / 2.0f);
            float y3 = rh1Var.f43007c0.getY() + ((rh1Var.f43007c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f40543s;
            path.rewind();
            RectF rectF = this.v;
            rectF.set(x9, y3, scaleX + x9, scaleY + y3);
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
        rh1 rh1Var = this.f40544w;
        if (!rh1Var.G0 && !rh1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                rh1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && rh1Var.f43031p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f40544w.f43027m1) {
            return;
        }
        super.draw(canvas);
    }
}
