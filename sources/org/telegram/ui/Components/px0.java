package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class px0 {
    public MessagesController.PeerColor f29583a;
    public org.telegram.ui.ActionBar.c6 f29584b;
    public int f29585c;
    public int d;
    public float f29586e;

    public final void a(MessagesController.PeerColor peerColor) {
        int b10;
        int i10;
        this.f29583a = peerColor;
        if (peerColor == null) {
            this.f29585c = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, this.f29584b);
            this.d = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20840s8, this.f29584b);
            this.f29585c = i0.a.d(this.f29586e, this.f29585c, 603979776);
            this.d = i0.a.d(this.f29586e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        org.telegram.ui.ActionBar.c6 c6Var = this.f29584b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20893v6, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, d);
        }
        this.f29585c = b10;
        if (AndroidUtilities.computePerceivedBrightness(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f29585c = i0.a.d(this.f29586e, this.f29585c, 603979776);
        this.d = i0.a.d(this.f29586e, this.d, -1);
    }
}
