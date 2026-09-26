package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class sw0 {
    public MessagesController.PeerColor f28363a;
    public org.telegram.ui.ActionBar.d6 f28364b;
    public int f28365c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f28363a = peerColor;
        if (peerColor == null) {
            this.f28365c = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, this.f28364b);
            this.d = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19337s8, this.f28364b);
            this.f28365c = i0.a.d(this.e, this.f28365c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f28364b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19390v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, d);
        }
        this.f28365c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f28365c = i0.a.d(this.e, this.f28365c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
