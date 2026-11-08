package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class nm implements bi {
    public final org.telegram.ui.ActionBar.f2 f36387a;
    public final org.telegram.messenger.c20 f36388b;
    public final di.u2 f36389c;

    public nm(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f36387a = f2Var;
        this.f36388b = c20Var;
        this.f36389c = u2Var;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void c0(qg qgVar) {
        org.telegram.messenger.qs.f(this.f36387a.getCurrentAccount()).d(qgVar);
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di.u2 u2Var = this.f36389c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var.f32932a2;
        org.telegram.messenger.c20 c20Var = this.f36388b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f36387a;
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
                        obj2.f22512c = str2;
                    } else {
                        obj2.f22512c = gfVar.I;
                    }
                    obj2.f22513e = gfVar.f26846c;
                    obj2.f22514f = gfVar.f26849g;
                    obj2.f22518k = gfVar.f26860s;
                    obj2.f22523p = gfVar.d();
                    obj2.f22532z = gfVar.f26854m;
                    obj2.f22524q = true;
                    obj2.f22522o = gfVar.f26845b;
                    CharSequence charSequence = gfVar.f26844a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f22516i = gfVar.f26855n;
                    obj2.f22517j = gfVar.f26859r;
                    obj2.h = gfVar.f26864x;
                    obj2.v = gfVar.S;
                    obj2.f22531y = gfVar;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str3 = kfVar.h;
                    if (str3 != null) {
                        obj2.f22512c = str3;
                    } else {
                        obj2.f22519l = kfVar;
                    }
                    obj2.f22513e = kfVar.f26846c;
                    obj2.f22514f = kfVar.f26849g;
                    obj2.f22518k = kfVar.f26860s;
                    CharSequence charSequence2 = kfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f22516i = kfVar.f26855n;
                    obj2.f22517j = kfVar.f26859r;
                    obj2.h = kfVar.f26864x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        obj2.f22520m = botInlineResult;
                        obj2.f22521n = kfVar.O;
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
