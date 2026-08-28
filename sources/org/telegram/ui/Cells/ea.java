package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.gr;
public final class ea extends t1 {
    public final GestureDetector Be;
    public final org.telegram.ui.Components.b5 Ce;
    public final org.telegram.ui.Components.b5 De;
    public final int Ee;
    public final fa Fe;

    public ea(fa faVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, Context context2, int i10) {
        super(context, i9, false, null, b6Var);
        this.Fe = faVar;
        this.Ee = i10;
        this.Be = new GestureDetector(context2, new da(this));
        gr grVar = gr.f28845g;
        this.Ce = new org.telegram.ui.Components.b5(this, 180L, grVar, 0);
        this.De = new org.telegram.ui.Components.b5(this, 180L, grVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.b5 b5Var = this.De;
        org.telegram.ui.Components.b5 b5Var2 = this.Ce;
        org.telegram.ui.Components.z8 z8Var = this.f25439j9;
        if (messageObject != null && getMessageObject().overrideLinkColor >= 0) {
            int i9 = getMessageObject().overrideLinkColor;
            if (i9 >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColor peerColor = null;
                if (messagesController != null) {
                    peerColors = messagesController.peerColors;
                } else {
                    peerColors = null;
                }
                if (peerColors != null) {
                    peerColor = peerColors.getColor(i9);
                }
                if (peerColor != null) {
                    int color1 = peerColor.getColor1();
                    v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[org.telegram.ui.Components.z8.f(color1)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[org.telegram.ui.Components.z8.f(color1)], this.Ed);
                } else {
                    long j10 = i9;
                    v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[org.telegram.ui.Components.z8.e(j10)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[org.telegram.ui.Components.z8.e(j10)], this.Ed);
                }
            } else {
                long j11 = i9;
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[org.telegram.ui.Components.z8.e(j11)], this.Ed);
                v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[org.telegram.ui.Components.z8.e(j11)], this.Ed);
            }
            z8Var.i(b5Var2.a(v02, false), b5Var.a(v03, false));
        } else {
            b5Var2.a(z8Var.b(), false);
            b5Var.a(z8Var.c(), false);
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
