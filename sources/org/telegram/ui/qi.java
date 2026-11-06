package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qi implements org.telegram.messenger.sr {
    public final int f49238a;
    public final boolean f49239b;
    public final Object f49240c;

    public qi(int i7, Object obj, boolean z9) {
        this.f49238a = i7;
        this.f49240c = obj;
        this.f49239b = z9;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.gc gcVar;
        switch (this.f49238a) {
            case 0:
                an anVar = ((si) this.f49240c).f49778b;
                if (i7 > 0 && anVar.getParentActivity() != null) {
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar);
                    if (this.f49239b) {
                        gcVar = org.telegram.ui.Components.gc.G;
                    } else {
                        gcVar = org.telegram.ui.Components.gc.I;
                    }
                    a02.m(gcVar, i7, 0, 0, anVar.f44022xa).j();
                    return;
                }
                return;
            default:
                ri riVar = (ri) this.f49240c;
                an anVar2 = riVar.f49520b.f49778b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = anVar2.f43771e;
                    TLRPC.User user = anVar2.f43785f;
                    boolean z9 = this.f49239b;
                    org.telegram.ui.Components.v4.r(anVar2, true, chat, user, false, false, false, z9, new w0(riVar, z9));
                    return;
                }
                anVar2.Qa(anVar2.f43939r4, true);
                return;
        }
    }
}
