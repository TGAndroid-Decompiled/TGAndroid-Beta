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
public final class gh1 extends org.telegram.ui.Components.voip.y2 {
    public final Path f38595s;
    public final RectF v;
    public final oh1 f38596w;

    public gh1(Activity activity, boolean z10, oh1 oh1Var) {
        super(activity);
        this.f38596w = oh1Var;
        this.f34140c = new AnimationNotificationsLocker();
        this.f34138a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f34141e = true;
        }
        this.f38595s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        oh1 oh1Var = this.f38596w;
        if (oh1Var.A0 && getAlpha() != 0.0f) {
            float scaleX = oh1Var.Y.getScaleX() * oh1Var.Y.getWidth();
            float scaleY = oh1Var.Y.getScaleY() * oh1Var.Y.getHeight();
            float x4 = oh1Var.Y.getX() + ((oh1Var.Y.getWidth() - scaleX) / 2.0f);
            float y8 = oh1Var.Y.getY() + ((oh1Var.Y.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f38595s;
            path.rewind();
            RectF rectF = this.v;
            rectF.set(x4, y8, scaleX + x4, scaleY + y8);
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
        oh1 oh1Var = this.f38596w;
        if (!oh1Var.C0 && !oh1Var.A0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                oh1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && oh1Var.f41161l0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f38596w.f41158i1) {
            return;
        }
        super.draw(canvas);
    }
}
