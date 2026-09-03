package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class hw0 {
    public MessagesController.PeerColor f27640a;
    public org.telegram.ui.ActionBar.g6 f27641b;
    public int f27642c;
    public int d;
    public float f27643e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f27640a = peerColor;
        if (peerColor == null) {
            this.f27642c = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A8, this.f27641b);
            this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21932s8, this.f27641b);
            this.f27642c = i0.a.d(this.f27643e, this.f27642c, 603979776);
            this.d = i0.a.d(this.f27643e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.k6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.ui.ActionBar.g6 g6Var = this.f27641b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v6, g6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, d);
        }
        this.f27642c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f27642c = i0.a.d(this.f27643e, this.f27642c, 603979776);
        this.d = i0.a.d(this.f27643e, this.d, -1);
    }
}
