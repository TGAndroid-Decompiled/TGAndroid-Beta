package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class vm implements ii {
    public final org.telegram.ui.ActionBar.e2 f40464a;
    public final org.telegram.messenger.z10 f40465b;
    public final fi.p2 f40466c;

    public vm(fi.p2 p2Var, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f40464a = e2Var;
        this.f40465b = z10Var;
        this.f40466c = p2Var;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void d0(vg vgVar) {
        org.telegram.messenger.ns.f(this.f40464a.getCurrentAccount()).d(vgVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.p2 p2Var = this.f40466c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = p2Var.f36435e2;
        org.telegram.messenger.z10 z10Var = this.f40465b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f40464a;
            t4.d0(e2Var.getContext(), e2Var.getResourceProvider(), null, null, new um(z10Var, 0), null);
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
                        obj2.f23196c = str2;
                    } else {
                        obj2.f23196c = ffVar.I;
                    }
                    obj2.f23197e = ffVar.f27711c;
                    obj2.f23198f = ffVar.f27714g;
                    obj2.f23202k = ffVar.f27725s;
                    obj2.f23207p = ffVar.d();
                    obj2.f23216z = ffVar.f27719m;
                    obj2.f23208q = true;
                    obj2.f23206o = ffVar.f27710b;
                    CharSequence charSequence = ffVar.f27709a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f23200i = ffVar.f27720n;
                    obj2.f23201j = ffVar.f27724r;
                    obj2.h = ffVar.f27729x;
                    obj2.v = ffVar.S;
                    obj2.f23215y = ffVar;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f23196c = str3;
                    } else {
                        obj2.f23203l = jfVar;
                    }
                    obj2.f23197e = jfVar.f27711c;
                    obj2.f23198f = jfVar.f27714g;
                    obj2.f23202k = jfVar.f27725s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f23200i = jfVar.f27720n;
                    obj2.f23201j = jfVar.f27724r;
                    obj2.h = jfVar.f27729x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f23204m = botInlineResult;
                        obj2.f23205n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
                z10Var.a(new th.d(obj2));
            }
        }
        p2Var.a(true);
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
