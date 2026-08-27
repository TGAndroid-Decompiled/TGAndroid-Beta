package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public final class qv0 {

    public MessagesController.PeerColor f31984a;

    public org.telegram.ui.ActionBar.c6 f31985b;

    public int f31986c;
    public int d;

    public float f31987e;

    public final void a(MessagesController.PeerColor peerColor) {
        this.f31984a = peerColor;
        if (peerColor == null) {
            this.f31986c = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, this.f31985b);
            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, this.f31985b);
            this.f31986c = i0.b.d(this.f31987e, this.f31986c, 603979776);
            this.d = i0.b.d(this.f31987e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        org.telegram.ui.ActionBar.c6 c6Var = this.f31985b;
        int iD = i0.b.d(0.75f, bgColor2, bgColor1);
        int iV0 = AndroidUtilities.computePerceivedBrightness(iD) > 0.721f ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, c6Var) : org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, iD);
        this.f31986c = iV0;
        this.d = AndroidUtilities.computePerceivedBrightness(iV0) > 0.721f ? -16777216 : -1;
        this.f31986c = i0.b.d(this.f31987e, this.f31986c, 603979776);
        this.d = i0.b.d(this.f31987e, this.d, -1);
    }
}
