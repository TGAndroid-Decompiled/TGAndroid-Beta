package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class q30 implements qi {
    public final u30 f38688a;

    public q30(u30 u30Var) {
        this.f38688a = u30Var;
    }

    @Override
    public final void K0() {
        org.telegram.messenger.g0.v1(this.f38688a.f40195a.getFragmentView().findFocus());
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(eh ehVar) {
        ehVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void v0() {
        this.f38688a.q();
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        si siVar;
        u30 u30Var = this.f38688a;
        org.telegram.ui.ActionBar.h2 h2Var = u30Var.f40195a;
        if (h2Var != null && h2Var.getParentActivity() != null && (siVar = u30Var.f40197c) != null) {
            if (i7 != 8 && i7 != 7) {
                siVar.M(i7);
                if (i7 == 0) {
                    u30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = siVar.f39670e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = u30Var.f40197c.f39670e2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z14 = false;
            for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                ?? obj2 = new Object();
                arrayList.add(obj2);
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
                    obj2.f28221o = efVar.f27847b;
                    obj2.f28231z = efVar.f27856m;
                    obj2.f28223q = true;
                    CharSequence charSequence = efVar.f27846a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28215i = efVar.f27857n;
                    obj2.f28216j = efVar.f27861r;
                    obj2.h = efVar.f27866x;
                    TLRPC.VideoSize videoSize = efVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            u30.a(u30Var, z14, arrayList);
            if (i7 != 8) {
                u30Var.f40197c.a(true);
            }
        }
    }

    @Override
    public final void R0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
