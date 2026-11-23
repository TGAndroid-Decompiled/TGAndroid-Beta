package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aq0 extends pq0 {
    public final org.telegram.messenger.ic f45631a;
    public final vq0 f45632b;
    public final org.telegram.messenger.gj f45633c;
    public final org.telegram.messenger.ff d;
    public final boolean f45634e;
    public final boolean f45635f;
    public final PhotoViewer f45636g;

    public aq0(PhotoViewer photoViewer, vq0 vq0Var, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        this.f45636g = photoViewer;
        this.f45632b = vq0Var;
        this.f45633c = gjVar;
        this.d = ffVar;
        this.f45634e = z10;
        this.f45635f = z11;
        this.f45631a = photoViewer.C4.p();
    }

    @Override
    public final xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        vq0 vq0Var = this.f45632b;
        if (vq0Var != null) {
            return vq0Var.E(this.f45633c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.f20 f20Var) {
        org.telegram.messenger.ff ffVar = this.d;
        if (!ffVar.f28041w && !ffVar.v && !ffVar.f28040u && f20Var == null && TextUtils.isEmpty(ffVar.f28022a)) {
            return;
        }
        d0(f20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.gj V() {
        return this.f45633c;
    }

    public final void d0(org.telegram.messenger.f20 f20Var, boolean z10, int i7, boolean z11, boolean z12) {
        org.telegram.messenger.gj gjVar;
        PhotoViewer photoViewer = this.f45636g;
        if (photoViewer.f43272l4 != null) {
            rm rmVar = null;
            org.telegram.messenger.gj gjVar2 = this.f45633c;
            if (z11) {
                gjVar = gjVar2;
            } else {
                gjVar = null;
            }
            org.telegram.messenger.ff ffVar = this.d;
            if (gjVar != null && !TextUtils.isEmpty(ffVar.f28022a)) {
                gjVar.f24233y1 = ffVar.f28022a;
                gjVar.f24237z1 = ffVar.f28033n;
            }
            if (z11 || gjVar2 == null) {
                bn bnVar = photoViewer.f43272l4;
                gjVar2 = bnVar.F5;
                rmVar = bnVar.D5;
            }
            rm rmVar2 = rmVar;
            org.telegram.messenger.gj gjVar3 = gjVar2;
            if (ffVar.f28023b) {
                if (f20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f43272l4.getAccountInstance();
                    String str = ffVar.I;
                    long a10 = photoViewer.f43272l4.a();
                    bn bnVar2 = photoViewer.f43272l4;
                    org.telegram.messenger.gj gjVar4 = bnVar2.f46067m4;
                    ArrayList arrayList = ffVar.f28033n;
                    org.telegram.messenger.gj gjVar5 = gjVar;
                    org.telegram.messenger.az.b0(ffVar.f28042x, i7, 0, a10, 0L, 0L, photoViewer.f43272l4.j9(), ffVar.f28022a, str, null, arrayList, accountInstance, gjVar3, gjVar4, gjVar5, photoViewer.f43272l4.f46221y5, bnVar2.Y8(), f20Var, null, null, rmVar2, z10, z12, ffVar.M);
                    return;
                }
                org.telegram.messenger.gj gjVar6 = gjVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f43272l4.getAccountInstance();
                String str2 = ffVar.I;
                long a11 = photoViewer.f43272l4.a();
                bn bnVar3 = photoViewer.f43272l4;
                org.telegram.messenger.gj gjVar7 = bnVar3.f46067m4;
                ArrayList arrayList2 = ffVar.f28033n;
                org.telegram.messenger.az.b0(ffVar.f28042x, i7, 0, a11, 0L, 0L, photoViewer.f43272l4.j9(), ffVar.f28022a, str2, null, arrayList2, accountInstance2, gjVar3, gjVar7, gjVar6, photoViewer.f43272l4.f46221y5, bnVar3.Y8(), null, null, null, rmVar2, z10, z12, ffVar.M);
                return;
            }
            org.telegram.messenger.gj gjVar8 = gjVar;
            if (ffVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f43272l4.getAccountInstance();
                String str3 = ffVar.h;
                String str4 = ffVar.f28024c;
                long a12 = photoViewer.f43272l4.a();
                bn bnVar4 = photoViewer.f43272l4;
                org.telegram.messenger.az.Z(accountInstance3, str3, str4, null, a12, gjVar3, bnVar4.f46067m4, rmVar2, ffVar.f28033n, ffVar.f28037r, null, ffVar.f28042x, gjVar8, f20Var, z10, i7, z12, ffVar.f28022a, bnVar4.Y8(), 0L, 0L, photoViewer.f43272l4.j9(), photoViewer.f43272l4.f46221y5);
            } else if (ffVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f43272l4.getAccountInstance();
                String str5 = ffVar.I;
                String str6 = ffVar.f28024c;
                long a13 = photoViewer.f43272l4.a();
                bn bnVar5 = photoViewer.f43272l4;
                org.telegram.messenger.az.Z(accountInstance4, str5, str6, null, a13, gjVar3, bnVar5.f46067m4, rmVar2, ffVar.f28033n, ffVar.f28037r, null, ffVar.f28042x, gjVar8, f20Var, z10, i7, z12, ffVar.f28022a, bnVar5.Y8(), 0L, 0L, photoViewer.f43272l4.j9(), photoViewer.f43272l4.f46221y5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return this.f45631a;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(f20Var, z10, i10, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f45632b != null && this.f45634e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f45632b != null && this.f45635f) {
            return true;
        }
        return false;
    }
}
