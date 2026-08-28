package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ov0 {
    public MessagesController.PeerColor f31449a;
    public org.telegram.ui.ActionBar.b6 f31450b;
    public int f31451c;
    public int d;
    public float f31452e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i9;
        this.f31449a = peerColor;
        if (peerColor == null) {
            this.f31451c = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, this.f31450b);
            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, this.f31450b);
            this.f31451c = i0.a.d(this.f31452e, this.f31451c, 603979776);
            this.d = i0.a.d(this.f31452e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.f6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.f6.I.q());
        org.telegram.ui.ActionBar.b6 b6Var = this.f31450b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23319v6, b6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.f6.b(0.08f, -0.08f, d);
        }
        this.f31451c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i9 = -16777216;
        } else {
            i9 = -1;
        }
        this.d = i9;
        this.f31451c = i0.a.d(this.f31452e, this.f31451c, 603979776);
        this.d = i0.a.d(this.f31452e, this.d, -1);
    }
}
