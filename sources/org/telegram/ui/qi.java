package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qi implements org.telegram.messenger.sr {
    public final int f49241a;
    public final boolean f49242b;
    public final Object f49243c;

    public qi(int i7, Object obj, boolean z9) {
        this.f49241a = i7;
        this.f49243c = obj;
        this.f49242b = z9;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.gc gcVar;
        switch (this.f49241a) {
            case 0:
                an anVar = ((si) this.f49243c).f49769b;
                if (i7 > 0 && anVar.getParentActivity() != null) {
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar);
                    if (this.f49242b) {
                        gcVar = org.telegram.ui.Components.gc.G;
                    } else {
                        gcVar = org.telegram.ui.Components.gc.I;
                    }
                    a02.m(gcVar, i7, 0, 0, anVar.f44028xa).j();
                    return;
                }
                return;
            default:
                ri riVar = (ri) this.f49243c;
                an anVar2 = riVar.f49499b.f49769b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = anVar2.f43777e;
                    TLRPC.User user = anVar2.f43791f;
                    boolean z9 = this.f49242b;
                    org.telegram.ui.Components.v4.r(anVar2, true, chat, user, false, false, false, z9, new w0(riVar, z9));
                    return;
                }
                anVar2.Qa(anVar2.f43945r4, true);
                return;
        }
    }
}
