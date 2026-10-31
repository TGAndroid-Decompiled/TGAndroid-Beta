package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ir0 extends yr0 {
    public final org.telegram.messenger.kc f38332a;
    public final es0 f38333b;
    public final org.telegram.messenger.jj f38334c;
    public final org.telegram.messenger.ef d;
    public final boolean e;
    public final boolean f38335f;
    public final PhotoViewer f38336g;

    public ir0(PhotoViewer photoViewer, es0 es0Var, org.telegram.messenger.jj jjVar, org.telegram.messenger.ef efVar, boolean z10, boolean z11) {
        this.f38336g = photoViewer;
        this.f38333b = es0Var;
        this.f38334c = jjVar;
        this.d = efVar;
        this.e = z10;
        this.f38335f = z11;
        this.f38332a = photoViewer.C4.p();
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        es0 es0Var = this.f38333b;
        if (es0Var != null) {
            return es0Var.E(this.f38334c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.x20 x20Var) {
        org.telegram.messenger.ef efVar = this.d;
        if (!efVar.f19524w && !efVar.v && !efVar.f19523u && x20Var == null && TextUtils.isEmpty(efVar.f19506a)) {
            return;
        }
        d0(x20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.jj V() {
        return this.f38334c;
    }

    public final void d0(org.telegram.messenger.x20 x20Var, boolean z10, int i10, boolean z11, boolean z12) {
        org.telegram.messenger.jj jjVar;
        PhotoViewer photoViewer = this.f38336g;
        if (photoViewer.l4 != null) {
            kn knVar = null;
            org.telegram.messenger.jj jjVar2 = this.f38334c;
            if (z11) {
                jjVar = jjVar2;
            } else {
                jjVar = null;
            }
            org.telegram.messenger.ef efVar = this.d;
            if (jjVar != null && !TextUtils.isEmpty(efVar.f19506a)) {
                jjVar.f16384w1 = efVar.f19506a;
                jjVar.f16388x1 = efVar.f19516n;
            }
            if (z11 || jjVar2 == null) {
                un unVar = photoViewer.l4;
                jjVar2 = unVar.D5;
                knVar = unVar.B5;
            }
            kn knVar2 = knVar;
            org.telegram.messenger.jj jjVar3 = jjVar2;
            if (efVar.f19507b) {
                if (x20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.l4.getAccountInstance();
                    String str = efVar.I;
                    long a2 = photoViewer.l4.a();
                    un unVar2 = photoViewer.l4;
                    org.telegram.messenger.jj jjVar4 = unVar2.l4;
                    ArrayList arrayList = efVar.f19516n;
                    org.telegram.messenger.jj jjVar5 = jjVar;
                    org.telegram.messenger.qz.b0(efVar.f19525x, i10, 0, a2, 0L, 0L, photoViewer.l4.a9(), efVar.f19506a, str, null, arrayList, accountInstance, jjVar3, jjVar4, jjVar5, photoViewer.l4.f42459w5, unVar2.P8(), x20Var, null, null, knVar2, z10, z12, efVar.M);
                    return;
                }
                org.telegram.messenger.jj jjVar6 = jjVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = efVar.I;
                long a10 = photoViewer.l4.a();
                un unVar3 = photoViewer.l4;
                org.telegram.messenger.jj jjVar7 = unVar3.l4;
                ArrayList arrayList2 = efVar.f19516n;
                org.telegram.messenger.qz.b0(efVar.f19525x, i10, 0, a10, 0L, 0L, photoViewer.l4.a9(), efVar.f19506a, str2, null, arrayList2, accountInstance2, jjVar3, jjVar7, jjVar6, photoViewer.l4.f42459w5, unVar3.P8(), null, null, null, knVar2, z10, z12, efVar.M);
                return;
            }
            org.telegram.messenger.jj jjVar8 = jjVar;
            if (efVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = efVar.h;
                String str4 = efVar.f19508c;
                long a11 = photoViewer.l4.a();
                un unVar4 = photoViewer.l4;
                org.telegram.messenger.qz.Z(accountInstance3, str3, str4, null, a11, jjVar3, unVar4.l4, knVar2, efVar.f19516n, efVar.f19520r, null, efVar.f19525x, jjVar8, x20Var, z10, i10, z12, efVar.f19506a, unVar4.P8(), 0L, 0L, photoViewer.l4.a9(), photoViewer.l4.f42459w5);
            } else if (efVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = efVar.I;
                String str6 = efVar.f19508c;
                long a12 = photoViewer.l4.a();
                un unVar5 = photoViewer.l4;
                org.telegram.messenger.qz.Z(accountInstance4, str5, str6, null, a12, jjVar3, unVar5.l4, knVar2, efVar.f19516n, efVar.f19520r, null, efVar.f19525x, jjVar8, x20Var, z10, i10, z12, efVar.f19506a, unVar5.P8(), 0L, 0L, photoViewer.l4.a9(), photoViewer.l4.f42459w5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.kc j(int i10) {
        return this.f38332a;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        d0(x20Var, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f38333b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f38333b != null && this.f38335f) {
            return true;
        }
        return false;
    }
}
