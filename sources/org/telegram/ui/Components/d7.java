package org.telegram.ui.Components;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d7 implements org.telegram.messenger.y10 {
    public final int f34356a;
    public final f8 f34357b;

    public d7(f8 f8Var, int i7) {
        this.f34356a = i7;
        this.f34357b = f8Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.f34356a) {
            case 0:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                if (gjVar != null) {
                    f8 f8Var = this.f34357b;
                    if (f8Var.f35105q2 != null && (F0 = gjVar.F0()) != null) {
                        if (F0.f28404id != 0) {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28426id = tL_inputDocument;
                            tL_inputDocument.f28410id = F0.f28404id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.hp hpVar = f8Var.f35105q2;
                            if (hpVar != null) {
                                hpVar.f24486c.add(0, hpVar.d(F0));
                                hpVar.e();
                            }
                            f8Var.f35107r2.clear();
                            f8Var.f35107r2.addAll(f8Var.f35105q2.f24486c);
                            f8Var.f35112u1.f();
                            ConnectionsManager.getInstance(f8Var.f30139a).sendRequest(tL_account_saveMusic, null);
                            return;
                        }
                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, f8Var.getContext(), null);
                        t1Var.r(180L);
                        File file = new File(gjVar.f24177k.attachPath);
                        if (file.exists()) {
                            org.telegram.messenger.w7.G(f8Var.f30139a).f0(file.getAbsolutePath(), new bi.j(f8Var, t1Var, F0, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                f8 f8Var2 = this.f34357b;
                org.telegram.ui.ActionBar.h6 h6Var = f8Var2.J0;
                new lc((FrameLayout) f8Var2.f30142b, h6Var).o(kc.G, h6Var).j();
                return;
        }
    }
}
