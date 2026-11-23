package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class en implements si {
    public final org.telegram.ui.ActionBar.g2 f34913a;
    public final org.telegram.messenger.y10 f34914b;
    public final fi.n2 f34915c;

    public en(fi.n2 n2Var, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f34913a = g2Var;
        this.f34914b = y10Var;
        this.f34915c = n2Var;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(gh ghVar) {
        org.telegram.messenger.ls.f(this.f34913a.getCurrentAccount()).d(ghVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var = this.f34915c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var.f40378e2;
        org.telegram.messenger.y10 y10Var = this.f34914b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f34913a;
            c5.d0(g2Var.getContext(), g2Var.getResourceProvider(), null, null, new dn(y10Var, 0), null);
        } else if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                ?? obj2 = new Object();
                String str = null;
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    String str2 = ffVar.h;
                    if (str2 != null) {
                        obj2.f28407c = str2;
                    } else {
                        obj2.f28407c = ffVar.I;
                    }
                    obj2.f28408e = ffVar.f28060c;
                    obj2.f28409f = ffVar.f28063g;
                    obj2.f28413k = ffVar.f28074s;
                    obj2.f28418p = ffVar.d();
                    obj2.f28427z = ffVar.f28068m;
                    obj2.f28419q = true;
                    obj2.f28417o = ffVar.f28059b;
                    CharSequence charSequence = ffVar.f28058a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28411i = ffVar.f28069n;
                    obj2.f28412j = ffVar.f28073r;
                    obj2.h = ffVar.f28078x;
                    obj2.v = ffVar.S;
                    obj2.f28426y = ffVar;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f28407c = str3;
                    } else {
                        obj2.f28414l = jfVar;
                    }
                    obj2.f28408e = jfVar.f28060c;
                    obj2.f28409f = jfVar.f28063g;
                    obj2.f28413k = jfVar.f28074s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28411i = jfVar.f28069n;
                    obj2.f28412j = jfVar.f28073r;
                    obj2.h = jfVar.f28078x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f28415m = botInlineResult;
                        obj2.f28416n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
                y10Var.a(new th.d(obj2));
            }
        }
        n2Var.a(true);
    }

    @Override
    public final void R0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
