package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class cx0 {
    public MessagesController.PeerColor f25469a;
    public org.telegram.ui.ActionBar.d6 f25470b;
    public int f25471c;
    public int d;
    public float f25472e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f25469a = peerColor;
        if (peerColor == null) {
            this.f25471c = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, this.f25470b);
            this.d = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21100s8, this.f25470b);
            this.f25471c = i0.a.d(this.f25472e, this.f25471c, 603979776);
            this.d = i0.a.d(this.f25472e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.i6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.i6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f25470b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21153v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, d);
        }
        this.f25471c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f25471c = i0.a.d(this.f25472e, this.f25471c, 603979776);
        this.d = i0.a.d(this.f25472e, this.d, -1);
    }
}
