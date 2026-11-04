package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class b30 implements zh {
    public final f30 f32076a;

    public b30(f30 f30Var) {
        this.f32076a = f30Var;
    }

    @Override
    public final boolean L1() {
        return false;
    }

    @Override
    public final void Y(ng ngVar) {
        ngVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        bi biVar;
        f30 f30Var = this.f32076a;
        org.telegram.ui.ActionBar.d2 d2Var = f30Var.f33681a;
        if (d2Var != null && d2Var.getParentActivity() != null && (biVar = f30Var.f33683c) != null) {
            if (i3 != 8 && i3 != 7) {
                biVar.L(i3);
                if (i3 == 0) {
                    f30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = biVar.f32215b2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = f30Var.f33683c.f32215b2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z14 = false;
            for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                ?? obj2 = new Object();
                arrayList.add(obj2);
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
                    obj2.f26487o = yeVar.f25310b;
                    obj2.f26497z = yeVar.f25319m;
                    obj2.f26489q = true;
                    CharSequence charSequence = yeVar.f25309a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f26481i = yeVar.f25320n;
                    obj2.f26482j = yeVar.f25324r;
                    obj2.h = yeVar.f25329x;
                    TLRPC.VideoSize videoSize = yeVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            f30.a(f30Var, z14, arrayList);
            if (i3 != 8) {
                f30Var.f33683c.a(true);
            }
        }
    }

    @Override
    public final void r0() {
        this.f32076a.q();
    }

    @Override
    public final void v0() {
        org.telegram.messenger.g0.v1(this.f32076a.f33681a.getFragmentView().findFocus());
    }

    @Override
    public final void I0(Object obj) {
    }

    @Override
    public final void a1(TLRPC.User user) {
    }

    @Override
    public final void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
