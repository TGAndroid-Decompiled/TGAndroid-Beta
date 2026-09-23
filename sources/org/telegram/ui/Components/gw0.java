package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class gw0 {
    public MessagesController.PeerColor f24430a;
    public org.telegram.ui.ActionBar.d6 f24431b;
    public int f24432c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f24430a = peerColor;
        if (peerColor == null) {
            this.f24432c = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, this.f24431b);
            this.d = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, this.f24431b);
            this.f24432c = i0.a.d(this.e, this.f24432c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f24431b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19118v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, d);
        }
        this.f24432c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f24432c = i0.a.d(this.e, this.f24432c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
