package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w6 implements org.telegram.messenger.u10 {
    public final int f39913a;
    public final z7 f39914b;

    public w6(z7 z7Var, int i3) {
        this.f39913a = i3;
        this.f39914b = z7Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f39913a) {
            case 0:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                if (ziVar != null) {
                    z7 z7Var = this.f39914b;
                    if (z7Var.f40955n2 != null && (F0 = ziVar.F0()) != null) {
                        if (F0.f27007id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f27029id = tL_inputDocument;
                            tL_inputDocument.f27013id = F0.f27007id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.bp bpVar = z7Var.f40955n2;
                            if (bpVar != null) {
                                bpVar.f21866c.add(0, bpVar.d(F0));
                                bpVar.e();
                            }
                            z7Var.f40957o2.clear();
                            z7Var.f40957o2.addAll(z7Var.f40955n2.f21866c);
                            z7Var.f40962r1.f();
                            ConnectionsManager.getInstance(z7Var.f28583a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, z7Var.getContext(), null);
                        s1Var.r(180L);
                        File file = new File(ziVar.f26868k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(z7Var.f28583a).g0(file.getAbsolutePath(), new ai.m(z7Var, s1Var, F0, 8));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                z7 z7Var2 = this.f39914b;
                org.telegram.ui.ActionBar.e6 e6Var = z7Var2.J0;
                new fc((FrameLayout) z7Var2.f28586b, e6Var).o(ec.G, e6Var).j();
                return;
        }
    }
}
