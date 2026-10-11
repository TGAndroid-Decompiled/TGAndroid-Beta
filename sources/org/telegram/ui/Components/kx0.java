package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class kx0 {
    public MessagesController.PeerColor f28145a;
    public org.telegram.ui.ActionBar.d6 f28146b;
    public int f28147c;
    public int d;
    public float f28148e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f28145a = peerColor;
        if (peerColor == null) {
            this.f28147c = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, this.f28146b);
            this.d = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21101s8, this.f28146b);
            this.f28147c = i0.a.d(this.f28148e, this.f28147c, 603979776);
            this.d = i0.a.d(this.f28148e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f28146b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21154v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, d);
        }
        this.f28147c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f28147c = i0.a.d(this.f28148e, this.f28147c, 603979776);
        this.d = i0.a.d(this.f28148e, this.d, -1);
    }
}
