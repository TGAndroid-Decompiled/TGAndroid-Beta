package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class x30 implements ai {
    public final b40 f32305a;

    public x30(b40 b40Var) {
        this.f32305a = b40Var;
    }

    @Override
    public final void C(mg mgVar) {
        mgVar.run();
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar;
        b40 b40Var = this.f32305a;
        org.telegram.ui.ActionBar.k2 k2Var = b40Var.f24523a;
        if (k2Var != null && k2Var.getParentActivity() != null && (biVar = b40Var.f24525c) != null) {
            if (i10 != 8 && i10 != 7) {
                biVar.N(i10);
                if (i10 == 0) {
                    b40Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = b40Var.f24525c.a2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z14 = false;
            for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                ?? obj2 = new Object();
                arrayList.add(obj2);
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
                    obj2.f17524o = efVar.f19507b;
                    obj2.f17534z = efVar.f19515m;
                    obj2.f17526q = true;
                    CharSequence charSequence = efVar.f19506a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f17518i = efVar.f19516n;
                    obj2.f17519j = efVar.f19520r;
                    obj2.h = efVar.f19525x;
                    TLRPC.VideoSize videoSize = efVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            b40.a(b40Var, z14, arrayList);
            if (i10 != 8) {
                b40Var.f24525c.a(true);
            }
        }
    }

    @Override
    public final void N() {
        this.f32305a.q();
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final void j0() {
        org.telegram.messenger.i0.v1(this.f32305a.f24523a.getFragmentView().findFocus());
    }

    @Override
    public final void n0(Object obj) {
    }

    @Override
    public final void v0(TLRPC.User user) {
    }

    @Override
    public final void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
