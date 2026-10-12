package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class px0 {
    public MessagesController.PeerColor f29605a;
    public org.telegram.ui.ActionBar.c6 f29606b;
    public int f29607c;
    public int d;
    public float f29608e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f29605a = peerColor;
        if (peerColor == null) {
            this.f29607c = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, this.f29606b);
            this.d = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20839s8, this.f29606b);
            this.f29607c = i0.a.d(this.f29608e, this.f29607c, 603979776);
            this.d = i0.a.d(this.f29608e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.c6 c6Var = this.f29606b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20892v6, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, d);
        }
        this.f29607c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f29607c = i0.a.d(this.f29608e, this.f29607c, 603979776);
        this.d = i0.a.d(this.f29608e, this.d, -1);
    }
}
