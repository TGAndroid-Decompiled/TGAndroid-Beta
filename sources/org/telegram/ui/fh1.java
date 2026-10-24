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
public final class fh1 extends org.telegram.ui.Components.voip.u2 {
    public final Path f37337s;
    public final RectF v;
    public final nh1 f37338w;

    public fh1(Activity activity, boolean z10, nh1 nh1Var) {
        super(activity);
        this.f37338w = nh1Var;
        this.f31929c = new AnimationNotificationsLocker();
        this.f31927a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f37337s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        nh1 nh1Var = this.f37338w;
        if (nh1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = nh1Var.f39833c0.getScaleX() * nh1Var.f39833c0.getWidth();
            float scaleY = nh1Var.f39833c0.getScaleY() * nh1Var.f39833c0.getHeight();
            float x10 = nh1Var.f39833c0.getX() + ((nh1Var.f39833c0.getWidth() - scaleX) / 2.0f);
            float y3 = nh1Var.f39833c0.getY() + ((nh1Var.f39833c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f37337s;
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
        nh1 nh1Var = this.f37338w;
        if (!nh1Var.G0 && !nh1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                nh1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && nh1Var.f39857p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f37338w.f39853m1) {
            return;
        }
        super.draw(canvas);
    }
}
