package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pp0 extends eq0 {
    public final org.telegram.messenger.cc f48625a;
    public final kq0 f48626b;
    public final org.telegram.messenger.zi f48627c;
    public final org.telegram.messenger.ye d;
    public final boolean f48628e;
    public final boolean f48629f;
    public final PhotoViewer f48630g;

    public pp0(PhotoViewer photoViewer, kq0 kq0Var, org.telegram.messenger.zi ziVar, org.telegram.messenger.ye yeVar, boolean z10, boolean z11) {
        this.f48630g = photoViewer;
        this.f48626b = kq0Var;
        this.f48627c = ziVar;
        this.d = yeVar;
        this.f48628e = z10;
        this.f48629f = z11;
        this.f48625a = photoViewer.D4.p();
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        kq0 kq0Var = this.f48626b;
        if (kq0Var != null) {
            return kq0Var.E(this.f48627c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.b20 b20Var) {
        org.telegram.messenger.ye yeVar = this.d;
        if (!yeVar.f25328w && !yeVar.v && !yeVar.f25327u && b20Var == null && TextUtils.isEmpty(yeVar.f25309a)) {
            return;
        }
        d0(b20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.zi V() {
        return this.f48627c;
    }

    public final void d0(org.telegram.messenger.b20 b20Var, boolean z10, int i3, boolean z11, boolean z12) {
        org.telegram.messenger.zi ziVar;
        PhotoViewer photoViewer = this.f48630g;
        if (photoViewer.f41481m4 != null) {
            mm mmVar = null;
            org.telegram.messenger.zi ziVar2 = this.f48627c;
            if (z11) {
                ziVar = ziVar2;
            } else {
                ziVar = null;
            }
            org.telegram.messenger.ye yeVar = this.d;
            if (ziVar != null && !TextUtils.isEmpty(yeVar.f25309a)) {
                ziVar.f26914w1 = yeVar.f25309a;
                ziVar.f26918x1 = yeVar.f25320n;
            }
            if (z11 || ziVar2 == null) {
                wm wmVar = photoViewer.f41481m4;
                ziVar2 = wmVar.E5;
                mmVar = wmVar.C5;
            }
            mm mmVar2 = mmVar;
            org.telegram.messenger.zi ziVar3 = ziVar2;
            if (yeVar.f25310b) {
                if (b20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f41481m4.getAccountInstance();
                    String str = yeVar.I;
                    long a10 = photoViewer.f41481m4.a();
                    wm wmVar2 = photoViewer.f41481m4;
                    org.telegram.messenger.zi ziVar4 = wmVar2.f51397m4;
                    ArrayList arrayList = yeVar.f25320n;
                    org.telegram.messenger.zi ziVar5 = ziVar;
                    org.telegram.messenger.yy.b0(yeVar.f25329x, i3, 0, a10, 0L, 0L, photoViewer.f41481m4.h9(), yeVar.f25309a, str, null, arrayList, accountInstance, ziVar3, ziVar4, ziVar5, photoViewer.f41481m4.f51540x5, wmVar2.W8(), b20Var, null, null, mmVar2, z10, z12, yeVar.M);
                    return;
                }
                org.telegram.messenger.zi ziVar6 = ziVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f41481m4.getAccountInstance();
                String str2 = yeVar.I;
                long a11 = photoViewer.f41481m4.a();
                wm wmVar3 = photoViewer.f41481m4;
                org.telegram.messenger.zi ziVar7 = wmVar3.f51397m4;
                ArrayList arrayList2 = yeVar.f25320n;
                org.telegram.messenger.yy.b0(yeVar.f25329x, i3, 0, a11, 0L, 0L, photoViewer.f41481m4.h9(), yeVar.f25309a, str2, null, arrayList2, accountInstance2, ziVar3, ziVar7, ziVar6, photoViewer.f41481m4.f51540x5, wmVar3.W8(), null, null, null, mmVar2, z10, z12, yeVar.M);
                return;
            }
            org.telegram.messenger.zi ziVar8 = ziVar;
            if (yeVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f41481m4.getAccountInstance();
                String str3 = yeVar.h;
                String str4 = yeVar.f25311c;
                long a12 = photoViewer.f41481m4.a();
                wm wmVar4 = photoViewer.f41481m4;
                org.telegram.messenger.yy.Z(accountInstance3, str3, str4, null, a12, ziVar3, wmVar4.f51397m4, mmVar2, yeVar.f25320n, yeVar.f25324r, null, yeVar.f25329x, ziVar8, b20Var, z10, i3, z12, yeVar.f25309a, wmVar4.W8(), 0L, 0L, photoViewer.f41481m4.h9(), photoViewer.f41481m4.f51540x5);
            } else if (yeVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f41481m4.getAccountInstance();
                String str5 = yeVar.I;
                String str6 = yeVar.f25311c;
                long a13 = photoViewer.f41481m4.a();
                wm wmVar5 = photoViewer.f41481m4;
                org.telegram.messenger.yy.Z(accountInstance4, str5, str6, null, a13, ziVar3, wmVar5.f51397m4, mmVar2, yeVar.f25320n, yeVar.f25324r, null, yeVar.f25329x, ziVar8, b20Var, z10, i3, z12, yeVar.f25309a, wmVar5.W8(), 0L, 0L, photoViewer.f41481m4.h9(), photoViewer.f41481m4.f51540x5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        return this.f48625a;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(b20Var, z10, i10, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f48626b != null && this.f48628e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f48626b != null && this.f48629f) {
            return true;
        }
        return false;
    }
}
