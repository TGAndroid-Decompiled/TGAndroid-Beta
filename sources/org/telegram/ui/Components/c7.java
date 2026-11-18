package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c7 implements org.telegram.messenger.x10 {
    public final int f33905a;
    public final g8 f33906b;

    public c7(g8 g8Var, int i7) {
        this.f33905a = i7;
        this.f33906b = g8Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f33905a) {
            case 0:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                if (fjVar != null) {
                    g8 g8Var = this.f33906b;
                    if (g8Var.f35405q2 != null && (F0 = fjVar.F0()) != null) {
                        if (F0.f28411id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28433id = tL_inputDocument;
                            tL_inputDocument.f28417id = F0.f28411id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.gp gpVar = g8Var.f35405q2;
                            if (gpVar != null) {
                                gpVar.f24294c.add(0, gpVar.d(F0));
                                gpVar.e();
                            }
                            g8Var.f35407r2.clear();
                            g8Var.f35407r2.addAll(g8Var.f35405q2.f24294c);
                            g8Var.f35412u1.f();
                            ConnectionsManager.getInstance(g8Var.f30189a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, g8Var.getContext(), null);
                        u1Var.r(180L);
                        File file = new File(fjVar.f23968k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(g8Var.f30189a).f0(file.getAbsolutePath(), new bi.j(g8Var, u1Var, F0, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                g8 g8Var2 = this.f33906b;
                org.telegram.ui.ActionBar.i6 i6Var = g8Var2.J0;
                new lc((FrameLayout) g8Var2.f30192b, i6Var).o(kc.G, i6Var).j();
                return;
        }
    }
}
