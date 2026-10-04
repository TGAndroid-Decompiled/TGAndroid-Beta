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
    public final Path f36034s;
    public final RectF v;
    public final mi1 f36035w;

    public ei1(Activity activity, boolean z10, mi1 mi1Var) {
        super(activity);
        this.f36035w = mi1Var;
        this.f32292c = new AnimationNotificationsLocker();
        this.f32290a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f32293e = true;
        }
        this.f36034s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mi1 mi1Var = this.f36035w;
        if (mi1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = mi1Var.f38611c0.getScaleX() * mi1Var.f38611c0.getWidth();
            float scaleY = mi1Var.f38611c0.getScaleY() * mi1Var.f38611c0.getHeight();
            float x10 = mi1Var.f38611c0.getX() + ((mi1Var.f38611c0.getWidth() - scaleX) / 2.0f);
            float y3 = mi1Var.f38611c0.getY() + ((mi1Var.f38611c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f36034s;
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
        mi1 mi1Var = this.f36035w;
        if (!mi1Var.G0 && !mi1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                mi1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && mi1Var.f38636p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f36035w.f38632m1) {
            return;
        }
        super.draw(canvas);
    }
}
