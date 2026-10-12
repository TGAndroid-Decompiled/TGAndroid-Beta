package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.es;
public final class fa extends u1 {
    public final GestureDetector Ge;
    public final org.telegram.ui.Components.j5 He;
    public final org.telegram.ui.Components.j5 Ie;
    public final int Je;
    public final ga Ke;

    public fa(ga gaVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context2, int i11) {
        super(context, i10, false, null, c6Var);
        this.Ke = gaVar;
        this.Je = i11;
        this.Ge = new GestureDetector(context2, new ea(this));
        es esVar = es.f24772g;
        this.He = new org.telegram.ui.Components.j5(this, 180L, esVar, 0);
        this.Ie = new org.telegram.ui.Components.j5(this, 180L, esVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.j5 j5Var = this.Ie;
        org.telegram.ui.Components.j5 j5Var2 = this.He;
        org.telegram.ui.Components.k9 k9Var = this.f22330n9;
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
                    w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20123p8[org.telegram.ui.Components.k9.f(color1)], this.Id);
                    w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20140q8[org.telegram.ui.Components.k9.f(color1)], this.Id);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20123p8[org.telegram.ui.Components.k9.e(j10)], this.Id);
                    w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20140q8[org.telegram.ui.Components.k9.e(j10)], this.Id);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20123p8[org.telegram.ui.Components.k9.e(j11)], this.Id);
                w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20140q8[org.telegram.ui.Components.k9.e(j11)], this.Id);
            }
            k9Var.i(j5Var2.a(w02, false), j5Var.a(w03, false));
        } else {
            j5Var2.a(k9Var.b(), false);
            j5Var.a(k9Var.c(), false);
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
