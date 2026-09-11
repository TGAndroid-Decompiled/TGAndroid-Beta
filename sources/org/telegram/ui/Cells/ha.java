package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.pr;
public final class ha extends t1 {
    public final GestureDetector Fe;
    public final org.telegram.ui.Components.h5 Ge;
    public final org.telegram.ui.Components.h5 He;
    public final int Ie;
    public final ia Je;

    public ha(ia iaVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, Context context2, int i11) {
        super(context, i10, false, null, f6Var);
        this.Je = iaVar;
        this.Ie = i11;
        this.Fe = new GestureDetector(context2, new ga(this));
        pr prVar = pr.f29467g;
        this.Ge = new org.telegram.ui.Components.h5(this, 180L, prVar, 0);
        this.He = new org.telegram.ui.Components.h5(this, 180L, prVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.h5 h5Var = this.He;
        org.telegram.ui.Components.h5 h5Var2 = this.Ge;
        org.telegram.ui.Components.i9 i9Var = this.f23048n9;
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
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20881p8[org.telegram.ui.Components.i9.f(color1)], this.Id);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20899q8[org.telegram.ui.Components.i9.f(color1)], this.Id);
                } else {
                    long j3 = i10;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20881p8[org.telegram.ui.Components.i9.e(j3)], this.Id);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20899q8[org.telegram.ui.Components.i9.e(j3)], this.Id);
                }
            } else {
                long j10 = i10;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20881p8[org.telegram.ui.Components.i9.e(j10)], this.Id);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20899q8[org.telegram.ui.Components.i9.e(j10)], this.Id);
            }
            i9Var.i(h5Var2.a(v02, false), h5Var.a(v03, false));
        } else {
            h5Var2.a(i9Var.b(), false);
            h5Var.a(i9Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
            getAvatarImage().draw(canvas);
        } else if (this.Ie == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Je.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Fe.onTouchEvent(motionEvent);
        return true;
    }
}
