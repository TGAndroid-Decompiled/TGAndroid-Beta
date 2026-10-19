package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class bx0 {
    public MessagesController.PeerColor f25033a;
    public org.telegram.ui.ActionBar.d6 f25034b;
    public int f25035c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f25033a = peerColor;
        if (peerColor == null) {
            this.f25035c = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, this.f25034b);
            this.d = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21266s8, this.f25034b);
            this.f25035c = i0.a.f(this.e, this.f25035c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f25034b;
        int f7 = i0.a.f(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21320v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, f7);
        }
        this.f25035c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f25035c = i0.a.f(this.e, this.f25035c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
