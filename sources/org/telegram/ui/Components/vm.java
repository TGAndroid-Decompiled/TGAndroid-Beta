package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class vm implements ai {
    public final org.telegram.ui.ActionBar.k2 f31285a;
    public final org.telegram.messenger.q20 f31286b;
    public final ag.v f31287c;

    public vm(ag.v vVar, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f31285a = k2Var;
        this.f31286b = q20Var;
        this.f31287c = vVar;
    }

    @Override
    public final void C(mg mgVar) {
        org.telegram.messenger.zs.f(this.f31285a.getCurrentAccount()).d(mgVar);
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ag.v vVar = this.f31287c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vVar.a2;
        org.telegram.messenger.q20 q20Var = this.f31286b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f31285a;
            s4.f0(k2Var.getContext(), k2Var.getResourceProvider(), null, null, new um(q20Var, 0), null);
        } else if (i10 == 7 || i10 == 8) {
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
                        obj2.f17515c = str2;
                    } else {
                        obj2.f17515c = efVar.I;
                    }
                    obj2.e = efVar.f19508c;
                    obj2.f17516f = efVar.f19510g;
                    obj2.f17520k = efVar.f19521s;
                    obj2.f17525p = efVar.d();
                    obj2.f17534z = efVar.f19515m;
                    obj2.f17526q = true;
                    obj2.f17524o = efVar.f19507b;
                    CharSequence charSequence = efVar.f19506a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f17518i = efVar.f19516n;
                    obj2.f17519j = efVar.f19520r;
                    obj2.h = efVar.f19525x;
                    obj2.v = efVar.S;
                    obj2.f17533y = efVar;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f17515c = str3;
                    } else {
                        obj2.f17521l = hfVar;
                    }
                    obj2.e = hfVar.f19508c;
                    obj2.f17516f = hfVar.f19510g;
                    obj2.f17520k = hfVar.f19521s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f17518i = hfVar.f19516n;
                    obj2.f17519j = hfVar.f19520r;
                    obj2.h = hfVar.f19525x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f17522m = botInlineResult;
                        obj2.f17523n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
                q20Var.a(new jh.d(obj2));
            }
        }
        vVar.a(true);
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final void n0(Object obj) {
    }

    @Override
    public final void v0(TLRPC.User user) {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
