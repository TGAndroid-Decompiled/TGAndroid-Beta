package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class mx0 {
    public MessagesController.PeerColor f30771a;
    public org.telegram.ui.ActionBar.u6 f30772b;
    public int f30773c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f30771a = peerColor;
        if (peerColor == null) {
            this.f30773c = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, this.f30772b);
            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23636s8, this.f30772b);
            this.f30773c = i0.a.f(this.e, this.f30773c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.y6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
        org.telegram.ui.ActionBar.u6 u6Var = this.f30772b;
        int f7 = i0.a.f(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23692v6, u6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, f7);
        }
        this.f30773c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f30773c = i0.a.f(this.e, this.f30773c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
