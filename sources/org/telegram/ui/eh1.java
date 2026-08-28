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
public final class eh1 extends org.telegram.ui.Components.voip.v2 {
    public final Path f37959s;
    public final RectF v;
    public final mh1 f37960w;

    public eh1(Activity activity, boolean z10, mh1 mh1Var) {
        super(activity);
        this.f37960w = mh1Var;
        this.f33909c = new AnimationNotificationsLocker();
        this.f33907a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f33910e = true;
        }
        this.f37959s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mh1 mh1Var = this.f37960w;
        if (mh1Var.A0 && getAlpha() != 0.0f) {
            float scaleX = mh1Var.Y.getScaleX() * mh1Var.Y.getWidth();
            float scaleY = mh1Var.Y.getScaleY() * mh1Var.Y.getHeight();
            float x10 = mh1Var.Y.getX() + ((mh1Var.Y.getWidth() - scaleX) / 2.0f);
            float y10 = mh1Var.Y.getY() + ((mh1Var.Y.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f37959s;
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
        mh1 mh1Var = this.f37960w;
        if (!mh1Var.C0 && !mh1Var.A0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                mh1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && mh1Var.f40453l0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f37960w.f40450i1) {
            return;
        }
        super.draw(canvas);
    }
}
