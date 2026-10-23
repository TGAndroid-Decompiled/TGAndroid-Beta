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
public final class gh1 extends org.telegram.ui.Components.voip.u2 {
    public final Path f37606s;
    public final RectF v;
    public final oh1 f37607w;

    public gh1(Activity activity, boolean z10, oh1 oh1Var) {
        super(activity);
        this.f37607w = oh1Var;
        this.f31959c = new AnimationNotificationsLocker();
        this.f31957a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f37606s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        oh1 oh1Var = this.f37607w;
        if (oh1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = oh1Var.f40170c0.getScaleX() * oh1Var.f40170c0.getWidth();
            float scaleY = oh1Var.f40170c0.getScaleY() * oh1Var.f40170c0.getHeight();
            float x10 = oh1Var.f40170c0.getX() + ((oh1Var.f40170c0.getWidth() - scaleX) / 2.0f);
            float y3 = oh1Var.f40170c0.getY() + ((oh1Var.f40170c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f37606s;
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
        oh1 oh1Var = this.f37607w;
        if (!oh1Var.G0 && !oh1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                oh1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && oh1Var.f40194p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f37607w.f40190m1) {
            return;
        }
        super.draw(canvas);
    }
}
