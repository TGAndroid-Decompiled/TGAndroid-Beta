package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class en implements si {
    public final org.telegram.ui.ActionBar.g2 f34915a;
    public final org.telegram.messenger.x10 f34916b;
    public final fi.n2 f34917c;

    public en(fi.n2 n2Var, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f34915a = g2Var;
        this.f34916b = x10Var;
        this.f34917c = n2Var;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(gh ghVar) {
        org.telegram.messenger.ks.f(this.f34915a.getCurrentAccount()).d(ghVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var = this.f34917c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var.f40386e2;
        org.telegram.messenger.x10 x10Var = this.f34916b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f34915a;
            c5.d0(g2Var.getContext(), g2Var.getResourceProvider(), null, null, new dn(x10Var, 0), null);
        } else if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                ?? obj2 = new Object();
                String str = null;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    String str2 = efVar.h;
                    if (str2 != null) {
                        obj2.f28239c = str2;
                    } else {
                        obj2.f28239c = efVar.I;
                    }
                    obj2.f28240e = efVar.f27876c;
                    obj2.f28241f = efVar.f27879g;
                    obj2.f28245k = efVar.f27890s;
                    obj2.f28250p = efVar.d();
                    obj2.f28259z = efVar.f27884m;
                    obj2.f28251q = true;
                    obj2.f28249o = efVar.f27875b;
                    CharSequence charSequence = efVar.f27874a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28243i = efVar.f27885n;
                    obj2.f28244j = efVar.f27889r;
                    obj2.h = efVar.f27894x;
                    obj2.v = efVar.S;
                    obj2.f28258y = efVar;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28239c = str3;
                    } else {
                        obj2.f28246l = hfVar;
                    }
                    obj2.f28240e = hfVar.f27876c;
                    obj2.f28241f = hfVar.f27879g;
                    obj2.f28245k = hfVar.f27890s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28243i = hfVar.f27885n;
                    obj2.f28244j = hfVar.f27889r;
                    obj2.h = hfVar.f27894x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28247m = botInlineResult;
                        obj2.f28248n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
                x10Var.a(new th.d(obj2));
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
