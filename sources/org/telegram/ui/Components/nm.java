package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class nm implements bi {
    public final org.telegram.ui.ActionBar.f2 f36438a;
    public final org.telegram.messenger.c20 f36439b;
    public final di.u2 f36440c;

    public nm(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f36438a = f2Var;
        this.f36439b = c20Var;
        this.f36440c = u2Var;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void c0(qg qgVar) {
        org.telegram.messenger.qs.f(this.f36438a.getCurrentAccount()).d(qgVar);
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di.u2 u2Var = this.f36440c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var.f32882a2;
        org.telegram.messenger.c20 c20Var = this.f36439b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f36438a;
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
                        obj2.f22486c = str2;
                    } else {
                        obj2.f22486c = gfVar.I;
                    }
                    obj2.f22487e = gfVar.f26825c;
                    obj2.f22488f = gfVar.f26828g;
                    obj2.f22492k = gfVar.f26839s;
                    obj2.f22497p = gfVar.d();
                    obj2.f22506z = gfVar.f26833m;
                    obj2.f22498q = true;
                    obj2.f22496o = gfVar.f26824b;
                    CharSequence charSequence = gfVar.f26823a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f22490i = gfVar.f26834n;
                    obj2.f22491j = gfVar.f26838r;
                    obj2.h = gfVar.f26843x;
                    obj2.v = gfVar.S;
                    obj2.f22505y = gfVar;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str3 = kfVar.h;
                    if (str3 != null) {
                        obj2.f22486c = str3;
                    } else {
                        obj2.f22493l = kfVar;
                    }
                    obj2.f22487e = kfVar.f26825c;
                    obj2.f22488f = kfVar.f26828g;
                    obj2.f22492k = kfVar.f26839s;
                    CharSequence charSequence2 = kfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f22490i = kfVar.f26834n;
                    obj2.f22491j = kfVar.f26838r;
                    obj2.h = kfVar.f26843x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        obj2.f22494m = botInlineResult;
                        obj2.f22495n = kfVar.O;
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
