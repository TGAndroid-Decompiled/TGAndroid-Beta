package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class i30 implements ii {
    public final m30 f35435a;

    public i30(m30 m30Var) {
        this.f35435a = m30Var;
    }

    @Override
    public final void K0() {
        org.telegram.messenger.g0.v1(this.f35435a.f37040a.getFragmentView().findFocus());
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void d0(vg vgVar) {
        vgVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void v0() {
        this.f35435a.q();
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ki kiVar;
        m30 m30Var = this.f35435a;
        org.telegram.ui.ActionBar.e2 e2Var = m30Var.f37040a;
        if (e2Var != null && e2Var.getParentActivity() != null && (kiVar = m30Var.f37042c) != null) {
            if (i7 != 8 && i7 != 7) {
                kiVar.M(i7);
                if (i7 == 0) {
                    m30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = kiVar.f36447e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = m30Var.f37042c.f36447e2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z14 = false;
            for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                ?? obj2 = new Object();
                arrayList.add(obj2);
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
                    obj2.f23199o = ffVar.f27708b;
                    obj2.f23209z = ffVar.f27717m;
                    obj2.f23201q = true;
                    CharSequence charSequence = ffVar.f27707a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f23193i = ffVar.f27718n;
                    obj2.f23194j = ffVar.f27722r;
                    obj2.h = ffVar.f27727x;
                    TLRPC.VideoSize videoSize = ffVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            m30.a(m30Var, z14, arrayList);
            if (i7 != 8) {
                m30Var.f37042c.a(true);
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
