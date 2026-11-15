package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class po implements org.telegram.messenger.z10 {
    public final int f38338a;
    public final ep f38339b;

    public po(ep epVar, int i7) {
        this.f38338a = i7;
        this.f38339b = epVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f38338a) {
            case 0:
                ep epVar = this.f38339b;
                epVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                epVar.Y1 = true;
                epVar.Z0(true);
                epVar.X1 = false;
                return;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                ep epVar2 = this.f38339b;
                if (epVar2.getContext() != null) {
                    org.telegram.ui.an anVar = epVar2.f34401v1;
                    ug.j0 j0Var = new ug.j0(22, epVar2.f29679a, epVar2.getContext(), anVar, epVar2.J0);
                    j0Var.A1(e3Var);
                    j0Var.z1(epVar2.Z1, true);
                    j0Var.B1(epVar2.f34401v1.a());
                    j0Var.M2 = new no(epVar2, 2);
                    j0Var.show();
                    return;
                }
                return;
        }
    }
}
