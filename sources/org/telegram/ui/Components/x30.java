package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class x30 implements ai {
    public final b40 f32366a;

    public x30(b40 b40Var) {
        this.f32366a = b40Var;
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
        b40 b40Var = this.f32366a;
        org.telegram.ui.ActionBar.k2 k2Var = b40Var.f24618a;
        if (k2Var != null && k2Var.getParentActivity() != null && (biVar = b40Var.f24620c) != null) {
            if (i10 != 8 && i10 != 7) {
                biVar.M(i10);
                if (i10 == 0) {
                    b40Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = b40Var.f24620c.a2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z14 = false;
            for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                ?? obj2 = new Object();
                arrayList.add(obj2);
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
                    obj2.f17859o = ffVar.f14603b;
                    obj2.f17869z = ffVar.f14611m;
                    obj2.f17861q = true;
                    CharSequence charSequence = ffVar.f14602a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f17853i = ffVar.f14612n;
                    obj2.f17854j = ffVar.f14616r;
                    obj2.h = ffVar.f14621x;
                    TLRPC.VideoSize videoSize = ffVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            b40.a(b40Var, z14, arrayList);
            if (i10 != 8) {
                b40Var.f24620c.a(true);
            }
        }
    }

    @Override
    public final void N() {
        this.f32366a.q();
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final void j0() {
        org.telegram.messenger.i0.v1(this.f32366a.f24618a.getFragmentView().findFocus());
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
