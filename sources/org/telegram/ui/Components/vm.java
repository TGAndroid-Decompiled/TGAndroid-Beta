package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class vm implements ai {
    public final org.telegram.ui.ActionBar.k2 f31344a;
    public final org.telegram.messenger.r20 f31345b;
    public final ag.v f31346c;

    public vm(ag.v vVar, org.telegram.messenger.r20 r20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f31344a = k2Var;
        this.f31345b = r20Var;
        this.f31346c = vVar;
    }

    @Override
    public final void C(mg mgVar) {
        org.telegram.messenger.at.f(this.f31344a.getCurrentAccount()).d(mgVar);
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ag.v vVar = this.f31346c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vVar.a2;
        org.telegram.messenger.r20 r20Var = this.f31345b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f31344a;
            s4.f0(k2Var.getContext(), k2Var.getResourceProvider(), null, null, new um(r20Var, 0), null);
        } else if (i10 == 7 || i10 == 8) {
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
                        obj2.f17850c = str2;
                    } else {
                        obj2.f17850c = ffVar.I;
                    }
                    obj2.e = ffVar.f14604c;
                    obj2.f17851f = ffVar.f14606g;
                    obj2.f17855k = ffVar.f14617s;
                    obj2.f17860p = ffVar.d();
                    obj2.f17869z = ffVar.f14611m;
                    obj2.f17861q = true;
                    obj2.f17859o = ffVar.f14603b;
                    CharSequence charSequence = ffVar.f14602a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f17853i = ffVar.f14612n;
                    obj2.f17854j = ffVar.f14616r;
                    obj2.h = ffVar.f14621x;
                    obj2.v = ffVar.S;
                    obj2.f17868y = ffVar;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f17850c = str3;
                    } else {
                        obj2.f17856l = jfVar;
                    }
                    obj2.e = jfVar.f14604c;
                    obj2.f17851f = jfVar.f14606g;
                    obj2.f17855k = jfVar.f14617s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f17853i = jfVar.f14612n;
                    obj2.f17854j = jfVar.f14616r;
                    obj2.h = jfVar.f14621x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f17857m = botInlineResult;
                        obj2.f17858n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
                r20Var.a(new jh.d(obj2));
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
