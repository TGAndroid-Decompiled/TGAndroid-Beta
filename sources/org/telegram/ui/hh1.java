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
public final class hh1 extends org.telegram.ui.Components.voip.x2 {
    public final Path f40013s;
    public final RectF v;
    public final ph1 f40014w;

    public hh1(Activity activity, boolean z10, ph1 ph1Var) {
        super(activity);
        this.f40014w = ph1Var;
        this.f34208c = new AnimationNotificationsLocker();
        this.f34206a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f40013s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ph1 ph1Var = this.f40014w;
        if (ph1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = ph1Var.f42517c0.getScaleX() * ph1Var.f42517c0.getWidth();
            float scaleY = ph1Var.f42517c0.getScaleY() * ph1Var.f42517c0.getHeight();
            float x9 = ph1Var.f42517c0.getX() + ((ph1Var.f42517c0.getWidth() - scaleX) / 2.0f);
            float y3 = ph1Var.f42517c0.getY() + ((ph1Var.f42517c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f40013s;
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
        ph1 ph1Var = this.f40014w;
        if (!ph1Var.G0 && !ph1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ph1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ph1Var.f42541p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f40014w.f42537m1) {
            return;
        }
        super.draw(canvas);
    }
}
