package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.nr;
public final class da extends t1 {
    public final GestureDetector Ce;
    public final org.telegram.ui.Components.c5 De;
    public final org.telegram.ui.Components.c5 Ee;
    public final int Fe;
    public final ea Ge;

    public da(ea eaVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, Context context2, int i11) {
        super(context, i10, false, null, f6Var);
        this.Ge = eaVar;
        this.Fe = i11;
        this.Ce = new GestureDetector(context2, new ca(this));
        nr nrVar = nr.f27347g;
        this.De = new org.telegram.ui.Components.c5(this, 180L, nrVar, 0);
        this.Ee = new org.telegram.ui.Components.c5(this, 180L, nrVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.c5 c5Var = this.Ee;
        org.telegram.ui.Components.c5 c5Var2 = this.De;
        org.telegram.ui.Components.z8 z8Var = this.f22120k9;
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
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20123p8[org.telegram.ui.Components.z8.f(color1)], this.Fd);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20142q8[org.telegram.ui.Components.z8.f(color1)], this.Fd);
                } else {
                    long j10 = i10;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20123p8[org.telegram.ui.Components.z8.e(j10)], this.Fd);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20142q8[org.telegram.ui.Components.z8.e(j10)], this.Fd);
                }
            } else {
                long j11 = i10;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20123p8[org.telegram.ui.Components.z8.e(j11)], this.Fd);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20142q8[org.telegram.ui.Components.z8.e(j11)], this.Fd);
            }
            z8Var.i(c5Var2.a(v02, false), c5Var.a(v03, false));
        } else {
            c5Var2.a(z8Var.b(), false);
            c5Var.a(z8Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
            getAvatarImage().draw(canvas);
        } else if (this.Fe == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Ge.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ce.onTouchEvent(motionEvent);
        return true;
    }
}
