package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.qr;
public final class ha extends t1 {
    public final GestureDetector Ge;
    public final org.telegram.ui.Components.f5 He;
    public final org.telegram.ui.Components.f5 Ie;
    public final int Je;
    public final ja Ke;

    public ha(ja jaVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, Context context2, int i11) {
        super(context, i10, false, null, e6Var);
        this.Ke = jaVar;
        this.Je = i11;
        this.Ge = new GestureDetector(context2, new ga(this));
        qr qrVar = qr.f27421g;
        this.He = new org.telegram.ui.Components.f5(this, 180L, qrVar, 0);
        this.Ie = new org.telegram.ui.Components.f5(this, 180L, qrVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.f5 f5Var = this.Ie;
        org.telegram.ui.Components.f5 f5Var2 = this.He;
        org.telegram.ui.Components.f9 f9Var = this.f21148n9;
        if (messageObject != null && getMessageObject().overrideLinkColor >= 0) {
            int i10 = getMessageObject().overrideLinkColor;
            if (i10 >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColor peerColor = null;
                if (messagesController != null) {
                    peerColors = messagesController.peerColors;
                } else {
                    peerColors = null;
                }
                if (peerColors != null) {
                    peerColor = peerColors.getColor(i10);
                }
                if (peerColor != null) {
                    int color1 = peerColor.getColor1();
                    v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19054p8[org.telegram.ui.Components.f9.f(color1)], this.Id);
                    v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19072q8[org.telegram.ui.Components.f9.f(color1)], this.Id);
                } else {
                    long j3 = i10;
                    v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19054p8[org.telegram.ui.Components.f9.e(j3)], this.Id);
                    v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19072q8[org.telegram.ui.Components.f9.e(j3)], this.Id);
                }
            } else {
                long j10 = i10;
                v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19054p8[org.telegram.ui.Components.f9.e(j10)], this.Id);
                v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19072q8[org.telegram.ui.Components.f9.e(j10)], this.Id);
            }
            f9Var.i(f5Var2.a(v02, false), f5Var.a(v03, false));
        } else {
            f5Var2.a(f9Var.b(), false);
            f5Var.a(f9Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
            getAvatarImage().draw(canvas);
        } else if (this.Je == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Ke.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ge.onTouchEvent(motionEvent);
        return true;
    }
}
