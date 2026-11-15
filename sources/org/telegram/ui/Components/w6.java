package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w6 implements org.telegram.messenger.z10 {
    public final int f41290a;
    public final y7 f41291b;

    public w6(y7 y7Var, int i7) {
        this.f41290a = i7;
        this.f41291b = y7Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f41290a) {
            case 0:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                if (gjVar != null) {
                    y7 y7Var = this.f41291b;
                    if (y7Var.f41913q2 != null && (F0 = gjVar.F0()) != null) {
                        if (F0.f28057id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28079id = tL_inputDocument;
                            tL_inputDocument.f28063id = F0.f28057id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.hp hpVar = y7Var.f41913q2;
                            if (hpVar != null) {
                                hpVar.f24202c.add(0, hpVar.d(F0));
                                hpVar.e();
                            }
                            y7Var.f41915r2.clear();
                            y7Var.f41915r2.addAll(y7Var.f41913q2.f24202c);
                            y7Var.f41920u1.f();
                            ConnectionsManager.getInstance(y7Var.f29679a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, y7Var.getContext(), null);
                        t1Var.r(180L);
                        File file = new File(gjVar.f23817k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(y7Var.f29679a).f0(file.getAbsolutePath(), new bi.j(y7Var, t1Var, F0, 8));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                y7 y7Var2 = this.f41291b;
                org.telegram.ui.ActionBar.e6 e6Var = y7Var2.J0;
                new cc((FrameLayout) y7Var2.f29682b, e6Var).o(bc.G, e6Var).j();
                return;
        }
    }
}
