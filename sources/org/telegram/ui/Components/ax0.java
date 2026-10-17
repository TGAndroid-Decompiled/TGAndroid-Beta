package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ax0 {
    public MessagesController.PeerColor f24728a;
    public org.telegram.ui.ActionBar.d6 f24729b;
    public int f24730c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f24728a = peerColor;
        if (peerColor == null) {
            this.f24730c = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, this.f24729b);
            this.d = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21265s8, this.f24729b);
            this.f24730c = i0.b.f(this.e, this.f24730c, 603979776);
            this.d = i0.b.f(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f24729b;
        int f7 = i0.b.f(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21319v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, f7);
        }
        this.f24730c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f24730c = i0.b.f(this.e, this.f24730c, 603979776);
        this.d = i0.b.f(this.e, this.d, -1);
    }
}
