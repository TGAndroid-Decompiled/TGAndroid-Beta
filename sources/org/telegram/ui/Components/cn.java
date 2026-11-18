package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class cn implements qi {
    public final org.telegram.ui.ActionBar.h2 f34114a;
    public final org.telegram.messenger.x10 f34115b;
    public final fi.n2 f34116c;

    public cn(fi.n2 n2Var, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f34114a = h2Var;
        this.f34115b = x10Var;
        this.f34116c = n2Var;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(eh ehVar) {
        org.telegram.messenger.ks.f(this.f34114a.getCurrentAccount()).d(ehVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var = this.f34116c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var.f39670e2;
        org.telegram.messenger.x10 x10Var = this.f34115b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.h2 h2Var = this.f34114a;
            b5.d0(h2Var.getContext(), h2Var.getResourceProvider(), null, null, new bn(x10Var, 0), null);
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
                        obj2.f28211c = str2;
                    } else {
                        obj2.f28211c = efVar.I;
                    }
                    obj2.f28212e = efVar.f27848c;
                    obj2.f28213f = efVar.f27851g;
                    obj2.f28217k = efVar.f27862s;
                    obj2.f28222p = efVar.d();
                    obj2.f28231z = efVar.f27856m;
                    obj2.f28223q = true;
                    obj2.f28221o = efVar.f27847b;
                    CharSequence charSequence = efVar.f27846a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28215i = efVar.f27857n;
                    obj2.f28216j = efVar.f27861r;
                    obj2.h = efVar.f27866x;
                    obj2.v = efVar.S;
                    obj2.f28230y = efVar;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28211c = str3;
                    } else {
                        obj2.f28218l = hfVar;
                    }
                    obj2.f28212e = hfVar.f27848c;
                    obj2.f28213f = hfVar.f27851g;
                    obj2.f28217k = hfVar.f27862s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28215i = hfVar.f27857n;
                    obj2.f28216j = hfVar.f27861r;
                    obj2.h = hfVar.f27866x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28219m = botInlineResult;
                        obj2.f28220n = hfVar.O;
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
