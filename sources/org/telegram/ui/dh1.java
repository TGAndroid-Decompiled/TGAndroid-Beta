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

public final class dh1 extends org.telegram.ui.Components.voip.v2 {

    public final Path f37404s;
    public final RectF v;

    public final lh1 f37405w;

    public dh1(Activity activity, boolean z10, lh1 lh1Var) {
        super(activity);
        this.f37405w = lh1Var;
        this.f33959c = new AnimationNotificationsLocker();
        this.f33957a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f33960e = true;
        }
        this.f37404s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        lh1 lh1Var = this.f37405w;
        if (!lh1Var.A0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = lh1Var.Y.getScaleX() * lh1Var.Y.getWidth();
        float scaleY = lh1Var.Y.getScaleY() * lh1Var.Y.getHeight();
        float width = (lh1Var.Y.getWidth() - scaleX) / 2.0f;
        float height = (lh1Var.Y.getHeight() - scaleY) / 2.0f;
        float x8 = lh1Var.Y.getX() + width;
        float y10 = lh1Var.Y.getY() + height;
        canvas.save();
        Path path = this.f37404s;
        path.rewind();
        RectF rectF = this.v;
        rectF.set(x8, y10, scaleX + x8, scaleY + y10);
        float fDp = AndroidUtilities.dp(4.0f);
        path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        lh1 lh1Var = this.f37405w;
        if (lh1Var.C0 || lh1Var.A0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            lh1Var.p();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || lh1Var.f40114l0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f37405w.f40111i1) {
            return;
        }
        super.draw(canvas);
    }
}
