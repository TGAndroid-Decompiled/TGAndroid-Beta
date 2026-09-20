package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class rw0 {
    public MessagesController.PeerColor f27961a;
    public org.telegram.ui.ActionBar.f6 f27962b;
    public int f27963c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f27961a = peerColor;
        if (peerColor == null) {
            this.f27963c = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.f27962b);
            this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19372s8, this.f27962b);
            this.f27963c = i0.a.d(this.e, this.f27963c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
        org.telegram.ui.ActionBar.f6 f6Var = this.f27962b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19425v6, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, d);
        }
        this.f27963c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f27963c = i0.a.d(this.e, this.f27963c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
