package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class rw0 {
    public MessagesController.PeerColor f28055a;
    public org.telegram.ui.ActionBar.d6 f28056b;
    public int f28057c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f28055a = peerColor;
        if (peerColor == null) {
            this.f28057c = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, this.f28056b);
            this.d = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19338s8, this.f28056b);
            this.f28057c = i0.a.d(this.e, this.f28057c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f28056b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19391v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, d);
        }
        this.f28057c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f28057c = i0.a.d(this.e, this.f28057c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
