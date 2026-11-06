package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class nm implements bi {
    public final org.telegram.ui.ActionBar.f2 f36371a;
    public final org.telegram.messenger.c20 f36372b;
    public final di.u2 f36373c;

    public nm(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f36371a = f2Var;
        this.f36372b = c20Var;
        this.f36373c = u2Var;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void c0(qg qgVar) {
        org.telegram.messenger.qs.f(this.f36371a.getCurrentAccount()).d(qgVar);
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di.u2 u2Var = this.f36373c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var.f32924a2;
        org.telegram.messenger.c20 c20Var = this.f36372b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f36371a;
            v4.d0(f2Var.getContext(), f2Var.getResourceProvider(), null, null, new mm(c20Var, 0), null);
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
                        obj2.f22493c = str2;
                    } else {
                        obj2.f22493c = gfVar.I;
                    }
                    obj2.f22494e = gfVar.f26825c;
                    obj2.f22495f = gfVar.f26828g;
                    obj2.f22499k = gfVar.f26839s;
                    obj2.f22504p = gfVar.d();
                    obj2.f22513z = gfVar.f26833m;
                    obj2.f22505q = true;
                    obj2.f22503o = gfVar.f26824b;
                    CharSequence charSequence = gfVar.f26823a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f22497i = gfVar.f26834n;
                    obj2.f22498j = gfVar.f26838r;
                    obj2.h = gfVar.f26843x;
                    obj2.v = gfVar.S;
                    obj2.f22512y = gfVar;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str3 = kfVar.h;
                    if (str3 != null) {
                        obj2.f22493c = str3;
                    } else {
                        obj2.f22500l = kfVar;
                    }
                    obj2.f22494e = kfVar.f26825c;
                    obj2.f22495f = kfVar.f26828g;
                    obj2.f22499k = kfVar.f26839s;
                    CharSequence charSequence2 = kfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f22497i = kfVar.f26834n;
                    obj2.f22498j = kfVar.f26838r;
                    obj2.h = kfVar.f26843x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        obj2.f22501m = botInlineResult;
                        obj2.f22502n = kfVar.O;
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
