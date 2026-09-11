package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class fw0 {
    public MessagesController.PeerColor f26187a;
    public org.telegram.ui.ActionBar.f6 f26188b;
    public int f26189c;
    public int d;
    public float f26190e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f26187a = peerColor;
        if (peerColor == null) {
            this.f26189c = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.f26188b);
            this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20937s8, this.f26188b);
            this.f26189c = i0.a.d(this.f26190e, this.f26189c, 603979776);
            this.d = i0.a.d(this.f26190e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
        org.telegram.ui.ActionBar.f6 f6Var = this.f26188b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20990v6, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, d);
        }
        this.f26189c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f26189c = i0.a.d(this.f26190e, this.f26189c, 603979776);
        this.d = i0.a.d(this.f26190e, this.d, -1);
    }
}
