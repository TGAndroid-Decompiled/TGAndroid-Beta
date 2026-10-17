package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bs;
public final class ea extends u1 {
    public final GestureDetector Ge;
    public final org.telegram.ui.Components.i5 He;
    public final org.telegram.ui.Components.i5 Ie;
    public final int Je;
    public final fa Ke;

    public ea(fa faVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, Context context2, int i11) {
        super(context, i10, false, null, d6Var);
        this.Ke = faVar;
        this.Je = i11;
        this.Ge = new GestureDetector(context2, new da(this));
        bs bsVar = bs.f25031g;
        this.He = new org.telegram.ui.Components.i5(this, 180L, bsVar, 0);
        this.Ie = new org.telegram.ui.Components.i5(this, 180L, bsVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.i5 i5Var = this.Ie;
        org.telegram.ui.Components.i5 i5Var2 = this.He;
        org.telegram.ui.Components.h9 h9Var = this.f23403n9;
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
                    w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21208p8[org.telegram.ui.Components.h9.f(color1)], this.Id);
                    w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21225q8[org.telegram.ui.Components.h9.f(color1)], this.Id);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21208p8[org.telegram.ui.Components.h9.e(j10)], this.Id);
                    w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21225q8[org.telegram.ui.Components.h9.e(j10)], this.Id);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21208p8[org.telegram.ui.Components.h9.e(j11)], this.Id);
                w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21225q8[org.telegram.ui.Components.h9.e(j11)], this.Id);
            }
            h9Var.i(i5Var2.a(w02, false), i5Var.a(w03, false));
        } else {
            i5Var2.a(h9Var.b(), false);
            i5Var.a(h9Var.c(), false);
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
