package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class fx0 {
    public MessagesController.PeerColor f24821a;
    public org.telegram.ui.ActionBar.c6 f24822b;
    public int f24823c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f24821a = peerColor;
        if (peerColor == null) {
            this.f24823c = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A8, this.f24822b);
            this.d = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19880s8, this.f24822b);
            this.f24823c = i0.a.d(this.e, this.f24823c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        org.telegram.ui.ActionBar.c6 c6Var = this.f24822b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19933v6, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, d);
        }
        this.f24823c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f24823c = i0.a.d(this.e, this.f24823c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
