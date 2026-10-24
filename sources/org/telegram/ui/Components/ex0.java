package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ex0 {
    public MessagesController.PeerColor f26133a;
    public org.telegram.ui.ActionBar.g6 f26134b;
    public int f26135c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f26133a = peerColor;
        if (peerColor == null) {
            this.f26135c = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.f26134b);
            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21463s8, this.f26134b);
            this.f26135c = i0.a.f(this.e, this.f26135c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.k6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.ui.ActionBar.g6 g6Var = this.f26134b;
        int f7 = i0.a.f(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21517v6, g6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, f7);
        }
        this.f26135c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f26135c = i0.a.f(this.e, this.f26135c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
