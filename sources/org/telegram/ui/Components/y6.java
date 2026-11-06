package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y6 implements org.telegram.messenger.c20 {
    public final int f40551a;
    public final b8 f40552b;

    public y6(b8 b8Var, int i7) {
        this.f40551a = i7;
        this.f40552b = b8Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f40551a) {
            case 0:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (ijVar != null) {
                    b8 b8Var = this.f40552b;
                    if (b8Var.f32043m2 != null && (F0 = ijVar.F0()) != null) {
                        if (F0.f26958id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26980id = tL_inputDocument;
                            tL_inputDocument.f26964id = F0.f26958id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.kp kpVar = b8Var.f32043m2;
                            if (kpVar != null) {
                                kpVar.f23734c.add(0, kpVar.d(F0));
                                kpVar.e();
                            }
                            b8Var.f32044n2.clear();
                            b8Var.f32044n2.addAll(b8Var.f32043m2.f23734c);
                            b8Var.f32049q1.f();
                            ConnectionsManager.getInstance(b8Var.f28612a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, b8Var.getContext(), null);
                        u1Var.r(180L);
                        File file = new File(ijVar.f23237k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(b8Var.f28612a).g0(file.getAbsolutePath(), new bi.v3(b8Var, u1Var, F0, 6));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                b8 b8Var2 = this.f40552b;
                org.telegram.ui.ActionBar.f6 f6Var = b8Var2.I0;
                new hc((FrameLayout) b8Var2.f28615b, f6Var).o(gc.F, f6Var).j();
                return;
        }
    }
}
