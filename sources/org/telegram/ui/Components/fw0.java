package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class fw0 {
    public MessagesController.PeerColor f26214a;
    public org.telegram.ui.ActionBar.f6 f26215b;
    public int f26216c;
    public int d;
    public float f26217e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f26214a = peerColor;
        if (peerColor == null) {
            this.f26216c = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.f26215b);
            this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20964s8, this.f26215b);
            this.f26216c = i0.a.d(this.f26217e, this.f26216c, 603979776);
            this.d = i0.a.d(this.f26217e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
        org.telegram.ui.ActionBar.f6 f6Var = this.f26215b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21017v6, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, d);
        }
        this.f26216c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f26216c = i0.a.d(this.f26217e, this.f26216c, 603979776);
        this.d = i0.a.d(this.f26217e, this.d, -1);
    }
}
