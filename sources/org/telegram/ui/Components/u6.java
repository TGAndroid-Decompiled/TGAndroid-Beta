package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u6 implements org.telegram.messenger.r20 {
    public final int f30866a;
    public final w7 f30867b;

    public u6(w7 w7Var, int i10) {
        this.f30866a = i10;
        this.f30867b = w7Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f30866a) {
            case 0:
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                if (kjVar != null) {
                    w7 w7Var = this.f30867b;
                    if (w7Var.f32107m2 != null && (F0 = kjVar.F0()) != null) {
                        if (F0.f19800id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19822id = tL_inputDocument;
                            tL_inputDocument.f19806id = F0.f19800id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.qp qpVar = w7Var.f32107m2;
                            if (qpVar != null) {
                                qpVar.f17804c.add(0, qpVar.d(F0));
                                qpVar.e();
                            }
                            w7Var.f32109n2.clear();
                            w7Var.f32109n2.addAll(w7Var.f32107m2.f17804c);
                            w7Var.f32114q1.f();
                            ConnectionsManager.getInstance(w7Var.f21584a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, w7Var.getContext(), null);
                        x1Var.r(180L);
                        File file = new File(kjVar.f16690k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.b8.G(w7Var.f21584a).g0(file.getAbsolutePath(), new kg.d0(w7Var, x1Var, F0, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                w7 w7Var2 = this.f30867b;
                org.telegram.ui.ActionBar.p6 p6Var = w7Var2.I0;
                new cc((FrameLayout) w7Var2.f21587b, p6Var).o(bc.F, p6Var).j();
                return;
        }
    }
}
