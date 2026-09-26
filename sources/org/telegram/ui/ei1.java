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
public final class ei1 extends org.telegram.ui.Components.voip.x2 {
    public final Path f33426s;
    public final RectF v;
    public final mi1 f33427w;

    public ei1(Activity activity, boolean z10, mi1 mi1Var) {
        super(activity);
        this.f33427w = mi1Var;
        this.f29755c = new AnimationNotificationsLocker();
        this.f29753a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f33426s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mi1 mi1Var = this.f33427w;
        if (mi1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = mi1Var.f35574c0.getScaleX() * mi1Var.f35574c0.getWidth();
            float scaleY = mi1Var.f35574c0.getScaleY() * mi1Var.f35574c0.getHeight();
            float x10 = mi1Var.f35574c0.getX() + ((mi1Var.f35574c0.getWidth() - scaleX) / 2.0f);
            float y3 = mi1Var.f35574c0.getY() + ((mi1Var.f35574c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f33426s;
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
        mi1 mi1Var = this.f33427w;
        if (!mi1Var.G0 && !mi1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                mi1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && mi1Var.f35598p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f33427w.f35594m1) {
            return;
        }
        super.draw(canvas);
    }
}
