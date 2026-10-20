package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class cx0 {
    public MessagesController.PeerColor f25276a;
    public org.telegram.ui.ActionBar.d6 f25277b;
    public int f25278c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f25276a = peerColor;
        if (peerColor == null) {
            this.f25278c = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, this.f25277b);
            this.d = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21269s8, this.f25277b);
            this.f25278c = i0.a.f(this.e, this.f25278c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.d6 d6Var = this.f25277b;
        int f7 = i0.a.f(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21323v6, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, f7);
        }
        this.f25278c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f25278c = i0.a.f(this.e, this.f25278c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
