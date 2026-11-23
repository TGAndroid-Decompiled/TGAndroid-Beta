package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c7 implements org.telegram.messenger.w10 {
    public final int f33941a;
    public final e8 f33942b;

    public c7(e8 e8Var, int i7) {
        this.f33941a = i7;
        this.f33942b = e8Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f33941a) {
            case 0:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                if (fjVar != null) {
                    e8 e8Var = this.f33942b;
                    if (e8Var.f34611q2 != null && (F0 = fjVar.F0()) != null) {
                        if (F0.f28498id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28520id = tL_inputDocument;
                            tL_inputDocument.f28504id = F0.f28498id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.gp gpVar = e8Var.f34611q2;
                            if (gpVar != null) {
                                gpVar.f24392c.add(0, gpVar.d(F0));
                                gpVar.e();
                            }
                            e8Var.f34613r2.clear();
                            e8Var.f34613r2.addAll(e8Var.f34611q2.f24392c);
                            e8Var.f34618u1.f();
                            ConnectionsManager.getInstance(e8Var.f30223a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, e8Var.getContext(), null);
                        t1Var.r(180L);
                        File file = new File(fjVar.f24073k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(e8Var.f30223a).f0(file.getAbsolutePath(), new bi.j(e8Var, t1Var, F0, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                e8 e8Var2 = this.f33942b;
                org.telegram.ui.ActionBar.i6 i6Var = e8Var2.J0;
                new kc((FrameLayout) e8Var2.f30226b, i6Var).o(jc.G, i6Var).j();
                return;
        }
    }
}
