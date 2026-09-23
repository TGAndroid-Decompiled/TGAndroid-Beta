package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.rr;
public final class ia extends t1 {
    public final GestureDetector Ge;
    public final org.telegram.ui.Components.h5 He;
    public final org.telegram.ui.Components.h5 Ie;
    public final int Je;
    public final ka Ke;

    public ia(ka kaVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, Context context2, int i11) {
        super(context, i10, false, null, d6Var);
        this.Ke = kaVar;
        this.Je = i11;
        this.Ge = new GestureDetector(context2, new ha(this));
        rr rrVar = rr.f27702g;
        this.He = new org.telegram.ui.Components.h5(this, 180L, rrVar, 0);
        this.Ie = new org.telegram.ui.Components.h5(this, 180L, rrVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.h5 h5Var = this.Ie;
        org.telegram.ui.Components.h5 h5Var2 = this.He;
        org.telegram.ui.Components.h9 h9Var = this.f21135n9;
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
                    v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19009p8[org.telegram.ui.Components.h9.f(color1)], this.Id);
                    v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19027q8[org.telegram.ui.Components.h9.f(color1)], this.Id);
                } else {
                    long j3 = i10;
                    v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19009p8[org.telegram.ui.Components.h9.e(j3)], this.Id);
                    v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19027q8[org.telegram.ui.Components.h9.e(j3)], this.Id);
                }
            } else {
                long j10 = i10;
                v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19009p8[org.telegram.ui.Components.h9.e(j10)], this.Id);
                v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19027q8[org.telegram.ui.Components.h9.e(j10)], this.Id);
            }
            h9Var.i(h5Var2.a(v02, false), h5Var.a(v03, false));
        } else {
            h5Var2.a(h9Var.b(), false);
            h5Var.a(h9Var.c(), false);
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
