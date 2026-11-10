package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class mm implements ai {
    public final org.telegram.ui.ActionBar.f2 f35992a;
    public final org.telegram.messenger.c20 f35993b;
    public final di.u2 f35994c;

    public mm(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f35992a = f2Var;
        this.f35993b = c20Var;
        this.f35994c = u2Var;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void c0(pg pgVar) {
        org.telegram.messenger.qs.f(this.f35992a.getCurrentAccount()).d(pgVar);
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di.u2 u2Var = this.f35994c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var.d2;
        org.telegram.messenger.c20 c20Var = this.f35993b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f35992a;
            u4.d0(f2Var.getContext(), f2Var.getResourceProvider(), null, null, new lm(c20Var, 0), null);
        } else if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                ?? obj2 = new Object();
                String str = null;
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    String str2 = gfVar.h;
                    if (str2 != null) {
                        obj2.f22516c = str2;
                    } else {
                        obj2.f22516c = gfVar.I;
                    }
                    obj2.f22517e = gfVar.f26850c;
                    obj2.f22518f = gfVar.f26853g;
                    obj2.f22522k = gfVar.f26864s;
                    obj2.f22527p = gfVar.d();
                    obj2.f22536z = gfVar.f26858m;
                    obj2.f22528q = true;
                    obj2.f22526o = gfVar.f26849b;
                    CharSequence charSequence = gfVar.f26848a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f22520i = gfVar.f26859n;
                    obj2.f22521j = gfVar.f26863r;
                    obj2.h = gfVar.f26868x;
                    obj2.v = gfVar.S;
                    obj2.f22535y = gfVar;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str3 = kfVar.h;
                    if (str3 != null) {
                        obj2.f22516c = str3;
                    } else {
                        obj2.f22523l = kfVar;
                    }
                    obj2.f22517e = kfVar.f26850c;
                    obj2.f22518f = kfVar.f26853g;
                    obj2.f22522k = kfVar.f26864s;
                    CharSequence charSequence2 = kfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f22520i = kfVar.f26859n;
                    obj2.f22521j = kfVar.f26863r;
                    obj2.h = kfVar.f26868x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        obj2.f22524m = botInlineResult;
                        obj2.f22525n = kfVar.O;
                    }
                    System.currentTimeMillis();
                }
                c20Var.a(new th.d(obj2));
            }
        }
        u2Var.a(true);
    }

    @Override
    public final void M0(Object obj) {
    }

    @Override
    public final void Y0(TLRPC.User user) {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
