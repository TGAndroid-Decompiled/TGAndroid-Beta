package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class nx0 {
    public MessagesController.PeerColor f31092a;
    public org.telegram.ui.ActionBar.u6 f31093b;
    public int f31094c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f31092a = peerColor;
        if (peerColor == null) {
            this.f31094c = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, this.f31093b);
            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, this.f31093b);
            this.f31094c = i0.a.f(this.e, this.f31094c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.y6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
        org.telegram.ui.ActionBar.u6 u6Var = this.f31093b;
        int f7 = i0.a.f(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23693v6, u6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, f7);
        }
        this.f31094c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f31094c = i0.a.f(this.e, this.f31094c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
