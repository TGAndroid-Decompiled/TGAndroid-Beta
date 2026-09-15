package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class gw0 {
    public MessagesController.PeerColor f24460a;
    public org.telegram.ui.ActionBar.e6 f24461b;
    public int f24462c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f24460a = peerColor;
        if (peerColor == null) {
            this.f24462c = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, this.f24461b);
            this.d = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19113s8, this.f24461b);
            this.f24462c = i0.a.d(this.e, this.f24462c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.i6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.i6.I.q());
        org.telegram.ui.ActionBar.e6 e6Var = this.f24461b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19166v6, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, d);
        }
        this.f24462c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f24462c = i0.a.d(this.e, this.f24462c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
