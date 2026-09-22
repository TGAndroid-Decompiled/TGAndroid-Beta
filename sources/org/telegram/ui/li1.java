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
public final class li1 extends org.telegram.ui.Components.voip.w2 {
    public final Path f35477s;
    public final RectF v;
    public final ti1 f35478w;

    public li1(Activity activity, boolean z10, ti1 ti1Var) {
        super(activity);
        this.f35478w = ti1Var;
        this.f29698c = new AnimationNotificationsLocker();
        this.f29696a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f35477s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ti1 ti1Var = this.f35478w;
        if (ti1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = ti1Var.f37799c0.getScaleX() * ti1Var.f37799c0.getWidth();
            float scaleY = ti1Var.f37799c0.getScaleY() * ti1Var.f37799c0.getHeight();
            float x10 = ti1Var.f37799c0.getX() + ((ti1Var.f37799c0.getWidth() - scaleX) / 2.0f);
            float y3 = ti1Var.f37799c0.getY() + ((ti1Var.f37799c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f35477s;
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
        ti1 ti1Var = this.f35478w;
        if (!ti1Var.G0 && !ti1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ti1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ti1Var.f37823p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f35478w.f37819m1) {
            return;
        }
        super.draw(canvas);
    }
}
