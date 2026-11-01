package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gr0 extends xr0 {
    public final org.telegram.messenger.lc f37548a;
    public final ds0 f37549b;
    public final org.telegram.messenger.kj f37550c;
    public final org.telegram.messenger.ff d;
    public final boolean e;
    public final boolean f37551f;
    public final PhotoViewer f37552g;

    public gr0(PhotoViewer photoViewer, ds0 ds0Var, org.telegram.messenger.kj kjVar, org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        this.f37552g = photoViewer;
        this.f37549b = ds0Var;
        this.f37550c = kjVar;
        this.d = ffVar;
        this.e = z10;
        this.f37551f = z11;
        this.f37548a = photoViewer.C4.p();
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ds0 ds0Var = this.f37549b;
        if (ds0Var != null) {
            return ds0Var.E(this.f37550c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.y20 y20Var) {
        org.telegram.messenger.ff ffVar = this.d;
        if (!ffVar.f14620w && !ffVar.v && !ffVar.f14619u && y20Var == null && TextUtils.isEmpty(ffVar.f14602a)) {
            return;
        }
        d0(y20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.kj V() {
        return this.f37550c;
    }

    public final void d0(org.telegram.messenger.y20 y20Var, boolean z10, int i10, boolean z11, boolean z12) {
        org.telegram.messenger.kj kjVar;
        PhotoViewer photoViewer = this.f37552g;
        if (photoViewer.l4 != null) {
            kn knVar = null;
            org.telegram.messenger.kj kjVar2 = this.f37550c;
            if (z11) {
                kjVar = kjVar2;
            } else {
                kjVar = null;
            }
            org.telegram.messenger.ff ffVar = this.d;
            if (kjVar != null && !TextUtils.isEmpty(ffVar.f14602a)) {
                kjVar.f16737w1 = ffVar.f14602a;
                kjVar.f16741x1 = ffVar.f14612n;
            }
            if (z11 || kjVar2 == null) {
                un unVar = photoViewer.l4;
                kjVar2 = unVar.D5;
                knVar = unVar.B5;
            }
            kn knVar2 = knVar;
            org.telegram.messenger.kj kjVar3 = kjVar2;
            if (ffVar.f14603b) {
                if (y20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.l4.getAccountInstance();
                    String str = ffVar.I;
                    long a2 = photoViewer.l4.a();
                    un unVar2 = photoViewer.l4;
                    org.telegram.messenger.kj kjVar4 = unVar2.l4;
                    ArrayList arrayList = ffVar.f14612n;
                    org.telegram.messenger.kj kjVar5 = kjVar;
                    org.telegram.messenger.rz.b0(ffVar.f14621x, i10, 0, a2, 0L, 0L, photoViewer.l4.e9(), ffVar.f14602a, str, null, arrayList, accountInstance, kjVar3, kjVar4, kjVar5, photoViewer.l4.f42270w5, unVar2.T8(), y20Var, null, null, knVar2, z10, z12, ffVar.M);
                    return;
                }
                org.telegram.messenger.kj kjVar6 = kjVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = ffVar.I;
                long a10 = photoViewer.l4.a();
                un unVar3 = photoViewer.l4;
                org.telegram.messenger.kj kjVar7 = unVar3.l4;
                ArrayList arrayList2 = ffVar.f14612n;
                org.telegram.messenger.rz.b0(ffVar.f14621x, i10, 0, a10, 0L, 0L, photoViewer.l4.e9(), ffVar.f14602a, str2, null, arrayList2, accountInstance2, kjVar3, kjVar7, kjVar6, photoViewer.l4.f42270w5, unVar3.T8(), null, null, null, knVar2, z10, z12, ffVar.M);
                return;
            }
            org.telegram.messenger.kj kjVar8 = kjVar;
            if (ffVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = ffVar.h;
                String str4 = ffVar.f14604c;
                long a11 = photoViewer.l4.a();
                un unVar4 = photoViewer.l4;
                org.telegram.messenger.rz.Z(accountInstance3, str3, str4, null, a11, kjVar3, unVar4.l4, knVar2, ffVar.f14612n, ffVar.f14616r, null, ffVar.f14621x, kjVar8, y20Var, z10, i10, z12, ffVar.f14602a, unVar4.T8(), 0L, 0L, photoViewer.l4.e9(), photoViewer.l4.f42270w5);
            } else if (ffVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = ffVar.I;
                String str6 = ffVar.f14604c;
                long a12 = photoViewer.l4.a();
                un unVar5 = photoViewer.l4;
                org.telegram.messenger.rz.Z(accountInstance4, str5, str6, null, a12, kjVar3, unVar5.l4, knVar2, ffVar.f14612n, ffVar.f14616r, null, ffVar.f14621x, kjVar8, y20Var, z10, i10, z12, ffVar.f14602a, unVar5.T8(), 0L, 0L, photoViewer.l4.e9(), photoViewer.l4.f42270w5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.lc j(int i10) {
        return this.f37548a;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        d0(y20Var, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f37549b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f37549b != null && this.f37551f) {
            return true;
        }
        return false;
    }
}
