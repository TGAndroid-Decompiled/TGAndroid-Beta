package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class lx0 {
    public MessagesController.PeerColor f28470a;
    public org.telegram.ui.ActionBar.d6 f28471b;
    public int f28472c;
    public int d;
    public float f28473e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f28470a = peerColor;
        if (peerColor == null) {
            this.f28472c = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, this.f28471b);
            this.d = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065s8, this.f28471b);
            this.f28472c = i0.a.d(this.f28473e, this.f28472c, 603979776);
            this.d = i0.a.d(this.f28473e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f28471b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21118v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, d);
        }
        this.f28472c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f28472c = i0.a.d(this.f28473e, this.f28472c, 603979776);
        this.d = i0.a.d(this.f28473e, this.d, -1);
    }
}
