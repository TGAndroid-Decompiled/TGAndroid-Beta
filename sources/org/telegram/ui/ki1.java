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
public final class ki1 extends org.telegram.ui.Components.voip.w2 {
    public final Path f35114s;
    public final RectF v;
    public final si1 f35115w;

    public ki1(Activity activity, boolean z10, si1 si1Var) {
        super(activity);
        this.f35115w = si1Var;
        this.f29629c = new AnimationNotificationsLocker();
        this.f29627a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f35114s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        si1 si1Var = this.f35115w;
        if (si1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = si1Var.f37302c0.getScaleX() * si1Var.f37302c0.getWidth();
            float scaleY = si1Var.f37302c0.getScaleY() * si1Var.f37302c0.getHeight();
            float x10 = si1Var.f37302c0.getX() + ((si1Var.f37302c0.getWidth() - scaleX) / 2.0f);
            float y3 = si1Var.f37302c0.getY() + ((si1Var.f37302c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f35114s;
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
        si1 si1Var = this.f35115w;
        if (!si1Var.G0 && !si1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                si1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && si1Var.f37326p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f35115w.f37322m1) {
            return;
        }
        super.draw(canvas);
    }
}
