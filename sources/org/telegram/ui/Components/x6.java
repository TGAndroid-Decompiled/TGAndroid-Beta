package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x6 implements org.telegram.messenger.c20 {
    public final int f40206a;
    public final a8 f40207b;

    public x6(a8 a8Var, int i7) {
        this.f40206a = i7;
        this.f40207b = a8Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f40206a) {
            case 0:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (ijVar != null) {
                    a8 a8Var = this.f40207b;
                    if (a8Var.f31751p2 != null && (F0 = ijVar.F0()) != null) {
                        if (F0.f26966id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26988id = tL_inputDocument;
                            tL_inputDocument.f26972id = F0.f26966id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.kp kpVar = a8Var.f31751p2;
                            if (kpVar != null) {
                                kpVar.f23745c.add(0, kpVar.d(F0));
                                kpVar.e();
                            }
                            a8Var.f31753q2.clear();
                            a8Var.f31753q2.addAll(a8Var.f31751p2.f23745c);
                            a8Var.f31758t1.f();
                            ConnectionsManager.getInstance(a8Var.f28669a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a8Var.getContext(), null);
                        u1Var.r(180L);
                        File file = new File(ijVar.f23266k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(a8Var.f28669a).f0(file.getAbsolutePath(), new bi.v3(a8Var, u1Var, F0, 6));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                a8 a8Var2 = this.f40207b;
                org.telegram.ui.ActionBar.h6 h6Var = a8Var2.I0;
                new gc((FrameLayout) a8Var2.f28672b, h6Var).o(fc.F, h6Var).j();
                return;
        }
    }
}
