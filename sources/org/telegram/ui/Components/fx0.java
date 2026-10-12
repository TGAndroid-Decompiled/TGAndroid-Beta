package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class fx0 {
    public MessagesController.PeerColor f25131a;
    public org.telegram.ui.ActionBar.c6 f25132b;
    public int f25133c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f25131a = peerColor;
        if (peerColor == null) {
            this.f25133c = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A8, this.f25132b);
            this.d = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, this.f25132b);
            this.f25133c = i0.a.d(this.e, this.f25133c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        org.telegram.ui.ActionBar.c6 c6Var = this.f25132b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20233v6, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, d);
        }
        this.f25133c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f25133c = i0.a.d(this.e, this.f25133c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
