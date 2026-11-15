package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class vm implements ii {
    public final org.telegram.ui.ActionBar.e2 f40461a;
    public final org.telegram.messenger.z10 f40462b;
    public final fi.p2 f40463c;

    public vm(fi.p2 p2Var, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f40461a = e2Var;
        this.f40462b = z10Var;
        this.f40463c = p2Var;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void d0(vg vgVar) {
        org.telegram.messenger.ns.f(this.f40461a.getCurrentAccount()).d(vgVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.p2 p2Var = this.f40463c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = p2Var.f36447e2;
        org.telegram.messenger.z10 z10Var = this.f40462b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f40461a;
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
                        obj2.f23189c = str2;
                    } else {
                        obj2.f23189c = ffVar.I;
                    }
                    obj2.f23190e = ffVar.f27709c;
                    obj2.f23191f = ffVar.f27712g;
                    obj2.f23195k = ffVar.f27723s;
                    obj2.f23200p = ffVar.d();
                    obj2.f23209z = ffVar.f27717m;
                    obj2.f23201q = true;
                    obj2.f23199o = ffVar.f27708b;
                    CharSequence charSequence = ffVar.f27707a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f23193i = ffVar.f27718n;
                    obj2.f23194j = ffVar.f27722r;
                    obj2.h = ffVar.f27727x;
                    obj2.v = ffVar.S;
                    obj2.f23208y = ffVar;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f23189c = str3;
                    } else {
                        obj2.f23196l = jfVar;
                    }
                    obj2.f23190e = jfVar.f27709c;
                    obj2.f23191f = jfVar.f27712g;
                    obj2.f23195k = jfVar.f27723s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f23193i = jfVar.f27718n;
                    obj2.f23194j = jfVar.f27722r;
                    obj2.h = jfVar.f27727x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f23197m = botInlineResult;
                        obj2.f23198n = jfVar.O;
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
