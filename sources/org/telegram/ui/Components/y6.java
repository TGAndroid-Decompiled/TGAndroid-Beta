package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y6 implements org.telegram.messenger.c20 {
    public final int f40558a;
    public final b8 f40559b;

    public y6(b8 b8Var, int i7) {
        this.f40558a = i7;
        this.f40559b = b8Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f40558a) {
            case 0:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (ijVar != null) {
                    b8 b8Var = this.f40559b;
                    if (b8Var.f32077m2 != null && (F0 = ijVar.F0()) != null) {
                        if (F0.f26959id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26981id = tL_inputDocument;
                            tL_inputDocument.f26965id = F0.f26959id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.kp kpVar = b8Var.f32077m2;
                            if (kpVar != null) {
                                kpVar.f23741c.add(0, kpVar.d(F0));
                                kpVar.e();
                            }
                            b8Var.f32078n2.clear();
                            b8Var.f32078n2.addAll(b8Var.f32077m2.f23741c);
                            b8Var.f32083q1.f();
                            ConnectionsManager.getInstance(b8Var.f28613a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, b8Var.getContext(), null);
                        u1Var.r(180L);
                        File file = new File(ijVar.f23244k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(b8Var.f28613a).f0(file.getAbsolutePath(), new bi.v3(b8Var, u1Var, F0, 6));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                b8 b8Var2 = this.f40559b;
                org.telegram.ui.ActionBar.f6 f6Var = b8Var2.I0;
                new hc((FrameLayout) b8Var2.f28616b, f6Var).o(gc.F, f6Var).j();
                return;
        }
    }
}
