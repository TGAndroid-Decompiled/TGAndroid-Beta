package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.jr;
public final class ba extends s1 {
    public final GestureDetector Be;
    public final org.telegram.ui.Components.f5 Ce;
    public final org.telegram.ui.Components.f5 De;
    public final int Ee;
    public final ca Fe;

    public ba(ca caVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context2, int i11) {
        super(context, i10, false, null, c6Var);
        this.Fe = caVar;
        this.Ee = i11;
        this.Be = new GestureDetector(context2, new aa(this));
        jr jrVar = jr.f29801g;
        this.Ce = new org.telegram.ui.Components.f5(this, 180L, jrVar, 0);
        this.De = new org.telegram.ui.Components.f5(this, 180L, jrVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.f5 f5Var = this.De;
        org.telegram.ui.Components.f5 f5Var2 = this.Ce;
        org.telegram.ui.Components.e9 e9Var = this.f25403j9;
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
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.f(color1)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[org.telegram.ui.Components.e9.f(color1)], this.Ed);
                } else {
                    long j10 = i10;
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.e(j10)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[org.telegram.ui.Components.e9.e(j10)], this.Ed);
                }
            } else {
                long j11 = i10;
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.e(j11)], this.Ed);
                v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[org.telegram.ui.Components.e9.e(j11)], this.Ed);
            }
            e9Var.i(f5Var2.a(v02, false), f5Var.a(v03, false));
        } else {
            f5Var2.a(e9Var.b(), false);
            f5Var.a(e9Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
            getAvatarImage().draw(canvas);
        } else if (this.Ee == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Fe.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Be.onTouchEvent(motionEvent);
        return true;
    }
}
