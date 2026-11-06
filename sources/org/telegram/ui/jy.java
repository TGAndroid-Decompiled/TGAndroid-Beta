package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jy implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final int f47052a;
    public final gz f47053b;

    public jy(gz gzVar, int i7) {
        this.f47052a = i7;
        this.f47053b = gzVar;
    }

    @Override
    public boolean c(int i7, View view) {
        gz gzVar = this.f47053b;
        yy yyVar = (yy) gzVar.P.get(i7);
        if (yyVar != null && (view instanceof org.telegram.ui.Cells.pa)) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            gzVar.B0(yyVar, paVar.getName(), paVar.getCurrentObject(), yyVar.f52370g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47052a) {
            case 1:
                gz gzVar = this.f47053b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (gzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, gzVar.getParentActivity(), null);
                    u1Var3.f28569i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f27078id = gzVar.f46165r.f26064a;
                gzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ld(26, gzVar, u1Var2));
                return;
            case 2:
                this.f47053b.w0();
                return;
            case 3:
                this.f47053b.w0();
                return;
            default:
                this.f47053b.finishFragment();
                return;
        }
    }
}
