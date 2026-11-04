package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class mm implements zh {
    public final org.telegram.ui.ActionBar.d2 f36185a;
    public final org.telegram.messenger.u10 f36186b;
    public final ei.x2 f36187c;

    public mm(ei.x2 x2Var, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f36185a = d2Var;
        this.f36186b = u10Var;
        this.f36187c = x2Var;
    }

    @Override
    public final boolean L1() {
        return false;
    }

    @Override
    public final void Y(ng ngVar) {
        org.telegram.messenger.hs.f(this.f36185a.getCurrentAccount()).d(ngVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ei.x2 x2Var = this.f36187c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x2Var.f32215b2;
        org.telegram.messenger.u10 u10Var = this.f36186b;
        if (i3 == 15) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f36185a;
            t4.f0(d2Var.getContext(), d2Var.getResourceProvider(), null, null, new lm(u10Var, 0), null);
        } else if (i3 == 7 || i3 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                ?? obj2 = new Object();
                String str = null;
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    String str2 = yeVar.h;
                    if (str2 != null) {
                        obj2.f26477c = str2;
                    } else {
                        obj2.f26477c = yeVar.I;
                    }
                    obj2.f26478e = yeVar.f25311c;
                    obj2.f26479f = yeVar.f25314g;
                    obj2.f26483k = yeVar.f25325s;
                    obj2.f26488p = yeVar.d();
                    obj2.f26497z = yeVar.f25319m;
                    obj2.f26489q = true;
                    obj2.f26487o = yeVar.f25310b;
                    CharSequence charSequence = yeVar.f25309a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f26481i = yeVar.f25320n;
                    obj2.f26482j = yeVar.f25324r;
                    obj2.h = yeVar.f25329x;
                    obj2.v = yeVar.S;
                    obj2.f26496y = yeVar;
                } else if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    String str3 = bfVar.h;
                    if (str3 != null) {
                        obj2.f26477c = str3;
                    } else {
                        obj2.f26484l = bfVar;
                    }
                    obj2.f26478e = bfVar.f25311c;
                    obj2.f26479f = bfVar.f25314g;
                    obj2.f26483k = bfVar.f25325s;
                    CharSequence charSequence2 = bfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f26481i = bfVar.f25320n;
                    obj2.f26482j = bfVar.f25324r;
                    obj2.h = bfVar.f25329x;
                    TLRPC.BotInlineResult botInlineResult = bfVar.N;
                    if (botInlineResult != null && bfVar.H == 1) {
                        obj2.f26485m = botInlineResult;
                        obj2.f26486n = bfVar.O;
                    }
                    System.currentTimeMillis();
                }
                u10Var.a(new uh.d(obj2));
            }
        }
        x2Var.a(true);
    }

    @Override
    public final void I0(Object obj) {
    }

    @Override
    public final void a1(TLRPC.User user) {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
