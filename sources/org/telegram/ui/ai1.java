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
public final class ai1 extends org.telegram.ui.Components.voip.w2 {
    public final Path f32596s;
    public final RectF v;
    public final ii1 f32597w;

    public ai1(Activity activity, boolean z4, ii1 ii1Var) {
        super(activity);
        this.f32597w = ii1Var;
        this.f29990c = new AnimationNotificationsLocker();
        this.f29988a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z4) {
            this.e = true;
        }
        this.f32596s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ii1 ii1Var = this.f32597w;
        if (ii1Var.B0 && getAlpha() != 0.0f) {
            float scaleX = ii1Var.Z.getScaleX() * ii1Var.Z.getWidth();
            float scaleY = ii1Var.Z.getScaleY() * ii1Var.Z.getHeight();
            float x10 = ii1Var.Z.getX() + ((ii1Var.Z.getWidth() - scaleX) / 2.0f);
            float y10 = ii1Var.Z.getY() + ((ii1Var.Z.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f32596s;
            path.rewind();
            RectF rectF = this.v;
            rectF.set(x10, y10, scaleX + x10, scaleY + y10);
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
        ii1 ii1Var = this.f32597w;
        if (!ii1Var.D0 && !ii1Var.B0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ii1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ii1Var.m0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f32597w.f34967j1) {
            return;
        }
        super.draw(canvas);
    }
}
