package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u6 implements org.telegram.messenger.q20 {
    public final int f30826a;
    public final w7 f30827b;

    public u6(w7 w7Var, int i10) {
        this.f30826a = i10;
        this.f30827b = w7Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f30826a) {
            case 0:
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                if (jjVar != null) {
                    w7 w7Var = this.f30827b;
                    if (w7Var.f32059m2 != null && (F0 = jjVar.F0()) != null) {
                        if (F0.f19799id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19821id = tL_inputDocument;
                            tL_inputDocument.f19805id = F0.f19799id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.pp ppVar = w7Var.f32059m2;
                            if (ppVar != null) {
                                ppVar.f17469c.add(0, ppVar.d(F0));
                                ppVar.e();
                            }
                            w7Var.f32061n2.clear();
                            w7Var.f32061n2.addAll(w7Var.f32059m2.f17469c);
                            w7Var.f32066q1.f();
                            ConnectionsManager.getInstance(w7Var.f21583a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, w7Var.getContext(), null);
                        x1Var.r(180L);
                        File file = new File(jjVar.f16337k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.b8.G(w7Var.f21583a).g0(file.getAbsolutePath(), new kg.d0(w7Var, x1Var, F0, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                w7 w7Var2 = this.f30827b;
                org.telegram.ui.ActionBar.p6 p6Var = w7Var2.I0;
                new cc((FrameLayout) w7Var2.f21586b, p6Var).o(bc.F, p6Var).j();
                return;
        }
    }
}
