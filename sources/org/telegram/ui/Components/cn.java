package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class cn implements ri {
    public final org.telegram.ui.ActionBar.g2 f34088a;
    public final org.telegram.messenger.w10 f34089b;
    public final fi.n2 f34090c;

    public cn(fi.n2 n2Var, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f34088a = g2Var;
        this.f34089b = w10Var;
        this.f34090c = n2Var;
    }

    @Override
    public final void S(fh fhVar) {
        org.telegram.messenger.ks.f(this.f34088a.getCurrentAccount()).d(fhVar);
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var = this.f34090c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var.f39967e2;
        org.telegram.messenger.w10 w10Var = this.f34089b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f34088a;
            b5.d0(g2Var.getContext(), g2Var.getResourceProvider(), null, null, new bn(w10Var, 0), null);
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
                        obj2.f28311c = str2;
                    } else {
                        obj2.f28311c = efVar.I;
                    }
                    obj2.f28312e = efVar.f27964c;
                    obj2.f28313f = efVar.f27967g;
                    obj2.f28317k = efVar.f27978s;
                    obj2.f28322p = efVar.d();
                    obj2.f28331z = efVar.f27972m;
                    obj2.f28323q = true;
                    obj2.f28321o = efVar.f27963b;
                    CharSequence charSequence = efVar.f27962a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28315i = efVar.f27973n;
                    obj2.f28316j = efVar.f27977r;
                    obj2.h = efVar.f27982x;
                    obj2.v = efVar.S;
                    obj2.f28330y = efVar;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28311c = str3;
                    } else {
                        obj2.f28318l = hfVar;
                    }
                    obj2.f28312e = hfVar.f27964c;
                    obj2.f28313f = hfVar.f27967g;
                    obj2.f28317k = hfVar.f27978s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28315i = hfVar.f27973n;
                    obj2.f28316j = hfVar.f27977r;
                    obj2.h = hfVar.f27982x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28319m = botInlineResult;
                        obj2.f28320n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
                w10Var.a(new th.d(obj2));
            }
        }
        n2Var.a(true);
    }

    @Override
    public final void O0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
