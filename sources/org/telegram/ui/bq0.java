package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bq0 extends qq0 {
    public final org.telegram.messenger.jc f44108a;
    public final xq0 f44109b;
    public final org.telegram.messenger.ij f44110c;
    public final org.telegram.messenger.gf d;
    public final boolean f44111e;
    public final boolean f44112f;
    public final PhotoViewer f44113g;

    public bq0(PhotoViewer photoViewer, xq0 xq0Var, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar, boolean z9, boolean z10) {
        this.f44113g = photoViewer;
        this.f44109b = xq0Var;
        this.f44110c = ijVar;
        this.d = gfVar;
        this.f44111e = z9;
        this.f44112f = z10;
        this.f44108a = photoViewer.B4.p();
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        xq0 xq0Var = this.f44109b;
        if (xq0Var != null) {
            return xq0Var.E(this.f44110c, null, 0, z9, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.j20 j20Var) {
        org.telegram.messenger.gf gfVar = this.d;
        if (!gfVar.f26867w && !gfVar.v && !gfVar.f26866u && j20Var == null && TextUtils.isEmpty(gfVar.f26848a)) {
            return;
        }
        d0(j20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.ij V() {
        return this.f44110c;
    }

    public final void d0(org.telegram.messenger.j20 j20Var, boolean z9, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ij ijVar;
        PhotoViewer photoViewer = this.f44113g;
        if (photoViewer.f41438k4 != null) {
            sm smVar = null;
            org.telegram.messenger.ij ijVar2 = this.f44110c;
            if (z10) {
                ijVar = ijVar2;
            } else {
                ijVar = null;
            }
            org.telegram.messenger.gf gfVar = this.d;
            if (ijVar != null && !TextUtils.isEmpty(gfVar.f26848a)) {
                ijVar.f23312w1 = gfVar.f26848a;
                ijVar.f23316x1 = gfVar.f26859n;
            }
            if (z10 || ijVar2 == null) {
                cn cnVar = photoViewer.f41438k4;
                ijVar2 = cnVar.D5;
                smVar = cnVar.B5;
            }
            sm smVar2 = smVar;
            org.telegram.messenger.ij ijVar3 = ijVar2;
            if (gfVar.f26849b) {
                if (j20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f41438k4.getAccountInstance();
                    String str = gfVar.I;
                    long a10 = photoViewer.f41438k4.a();
                    cn cnVar2 = photoViewer.f41438k4;
                    org.telegram.messenger.ij ijVar4 = cnVar2.f44568l4;
                    ArrayList arrayList = gfVar.f26859n;
                    org.telegram.messenger.ij ijVar5 = ijVar;
                    org.telegram.messenger.gz.b0(gfVar.f26868x, i7, 0, a10, 0L, 0L, photoViewer.f41438k4.i9(), gfVar.f26848a, str, null, arrayList, accountInstance, ijVar3, ijVar4, ijVar5, photoViewer.f41438k4.f44708w5, cnVar2.X8(), j20Var, null, null, smVar2, z9, z11, gfVar.M);
                    return;
                }
                org.telegram.messenger.ij ijVar6 = ijVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f41438k4.getAccountInstance();
                String str2 = gfVar.I;
                long a11 = photoViewer.f41438k4.a();
                cn cnVar3 = photoViewer.f41438k4;
                org.telegram.messenger.ij ijVar7 = cnVar3.f44568l4;
                ArrayList arrayList2 = gfVar.f26859n;
                org.telegram.messenger.gz.b0(gfVar.f26868x, i7, 0, a11, 0L, 0L, photoViewer.f41438k4.i9(), gfVar.f26848a, str2, null, arrayList2, accountInstance2, ijVar3, ijVar7, ijVar6, photoViewer.f41438k4.f44708w5, cnVar3.X8(), null, null, null, smVar2, z9, z11, gfVar.M);
                return;
            }
            org.telegram.messenger.ij ijVar8 = ijVar;
            if (gfVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f41438k4.getAccountInstance();
                String str3 = gfVar.h;
                String str4 = gfVar.f26850c;
                long a12 = photoViewer.f41438k4.a();
                cn cnVar4 = photoViewer.f41438k4;
                org.telegram.messenger.gz.Z(accountInstance3, str3, str4, null, a12, ijVar3, cnVar4.f44568l4, smVar2, gfVar.f26859n, gfVar.f26863r, null, gfVar.f26868x, ijVar8, j20Var, z9, i7, z11, gfVar.f26848a, cnVar4.X8(), 0L, 0L, photoViewer.f41438k4.i9(), photoViewer.f41438k4.f44708w5);
            } else if (gfVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f41438k4.getAccountInstance();
                String str5 = gfVar.I;
                String str6 = gfVar.f26850c;
                long a13 = photoViewer.f41438k4.a();
                cn cnVar5 = photoViewer.f41438k4;
                org.telegram.messenger.gz.Z(accountInstance4, str5, str6, null, a13, ijVar3, cnVar5.f44568l4, smVar2, gfVar.f26859n, gfVar.f26863r, null, gfVar.f26868x, ijVar8, j20Var, z9, i7, z11, gfVar.f26848a, cnVar5.X8(), 0L, 0L, photoViewer.f41438k4.i9(), photoViewer.f41438k4.f44708w5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return this.f44108a;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        d0(j20Var, z9, i10, false, z10);
    }

    @Override
    public final boolean p() {
        if (this.f44109b != null && this.f44111e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f44109b != null && this.f44112f) {
            return true;
        }
        return false;
    }
}
