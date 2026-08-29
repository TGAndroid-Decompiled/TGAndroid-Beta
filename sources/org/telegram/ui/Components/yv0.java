package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class yv0 {
    public MessagesController.PeerColor f35133a;
    public org.telegram.ui.ActionBar.c6 f35134b;
    public int f35135c;
    public int d;
    public float f35136e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f35133a = peerColor;
        if (peerColor == null) {
            this.f35135c = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, this.f35134b);
            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, this.f35134b);
            this.f35135c = i0.a.d(this.f35136e, this.f35135c, 603979776);
            this.d = i0.a.d(this.f35136e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        org.telegram.ui.ActionBar.c6 c6Var = this.f35134b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, d);
        }
        this.f35135c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f35135c = i0.a.d(this.f35136e, this.f35135c, 603979776);
        this.d = i0.a.d(this.f35136e, this.d, -1);
    }
}
