package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.er;

public final class aa extends s1 {
    public final GestureDetector Be;
    public final org.telegram.ui.Components.b5 Ce;
    public final org.telegram.ui.Components.b5 De;
    public final int Ee;
    public final ba Fe;

    public aa(ba baVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context2, int i11) {
        super(context, i10, false, null, c6Var);
        this.Fe = baVar;
        this.Ee = i11;
        this.Be = new GestureDetector(context2, new z9(this));
        er erVar = er.f28123g;
        this.Ce = new org.telegram.ui.Components.b5(this, 180L, erVar, 0);
        this.De = new org.telegram.ui.Components.b5(this, 180L, erVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iV0;
        int iV1;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.b5 b5Var = this.De;
        org.telegram.ui.Components.b5 b5Var2 = this.Ce;
        org.telegram.ui.Components.y8 y8Var = this.f25392j9;
        if (messageObject == null || getMessageObject().overrideLinkColor < 0) {
            b5Var2.a(y8Var.b(), false);
            b5Var.a(y8Var.c(), false);
        } else {
            int i10 = getMessageObject().overrideLinkColor;
            if (i10 >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
                if (color != null) {
                    int color1 = color.getColor1();
                    iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.f(color1)], this.Ed);
                    iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.f(color1)], this.Ed);
                } else {
                    long j10 = i10;
                    iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.e(j10)], this.Ed);
                    iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.e(j10)], this.Ed);
                }
            } else {
                long j11 = i10;
                iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.e(j11)], this.Ed);
                iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.e(j11)], this.Ed);
            }
            y8Var.i(b5Var2.a(iV0, false), b5Var.a(iV1, false));
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
