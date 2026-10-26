package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ds;
public final class ja extends s1 {
    public final GestureDetector He;
    public final org.telegram.ui.Components.j5 Ie;
    public final org.telegram.ui.Components.j5 Je;
    public final int Ke;
    public final ka Le;

    public ja(ka kaVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, Context context2, int i11) {
        super(context, i10, false, null, u6Var);
        this.Le = kaVar;
        this.Ke = i11;
        this.He = new GestureDetector(context2, new ia(this));
        ds dsVar = ds.f27587g;
        this.Ie = new org.telegram.ui.Components.j5(this, 180L, dsVar, 0);
        this.Je = new org.telegram.ui.Components.j5(this, 180L, dsVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.j5 j5Var = this.Je;
        org.telegram.ui.Components.j5 j5Var2 = this.Ie;
        org.telegram.ui.Components.j9 j9Var = this.f25207n9;
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
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[org.telegram.ui.Components.j9.f(color1)], this.Id);
                    w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[org.telegram.ui.Components.j9.f(color1)], this.Id);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[org.telegram.ui.Components.j9.e(j10)], this.Id);
                    w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[org.telegram.ui.Components.j9.e(j10)], this.Id);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[org.telegram.ui.Components.j9.e(j11)], this.Id);
                w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[org.telegram.ui.Components.j9.e(j11)], this.Id);
            }
            j9Var.i(j5Var2.a(w02, false), j5Var.a(w03, false));
        } else {
            j5Var2.a(j9Var.b(), false);
            j5Var.a(j9Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
            getAvatarImage().draw(canvas);
        } else if (this.Ke == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Le.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.He.onTouchEvent(motionEvent);
        return true;
    }
}
