package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.zr;
public final class fa extends t1 {
    public final GestureDetector Ge;
    public final org.telegram.ui.Components.g5 He;
    public final org.telegram.ui.Components.g5 Ie;
    public final int Je;
    public final ga Ke;

    public fa(ga gaVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, Context context2, int i11) {
        super(context, i10, false, null, g6Var);
        this.Ke = gaVar;
        this.Je = i11;
        this.Ge = new GestureDetector(context2, new ea(this));
        zr zrVar = zr.f33338g;
        this.He = new org.telegram.ui.Components.g5(this, 180L, zrVar, 0);
        this.Ie = new org.telegram.ui.Components.g5(this, 180L, zrVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.g5 g5Var = this.Ie;
        org.telegram.ui.Components.g5 g5Var2 = this.He;
        org.telegram.ui.Components.f9 f9Var = this.f23502n9;
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
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406p8[org.telegram.ui.Components.f9.f(color1)], this.Id);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21423q8[org.telegram.ui.Components.f9.f(color1)], this.Id);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406p8[org.telegram.ui.Components.f9.e(j10)], this.Id);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21423q8[org.telegram.ui.Components.f9.e(j10)], this.Id);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406p8[org.telegram.ui.Components.f9.e(j11)], this.Id);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21423q8[org.telegram.ui.Components.f9.e(j11)], this.Id);
            }
            f9Var.i(g5Var2.a(w02, false), g5Var.a(w03, false));
        } else {
            g5Var2.a(f9Var.b(), false);
            g5Var.a(f9Var.c(), false);
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
