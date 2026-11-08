package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class f30 implements bi {
    public final j30 f33450a;

    public f30(j30 j30Var) {
        this.f33450a = j30Var;
    }

    @Override
    public final void F0() {
        org.telegram.messenger.g0.v1(this.f33450a.f34879a.getFragmentView().findFocus());
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void c0(qg qgVar) {
        qgVar.run();
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di diVar;
        j30 j30Var = this.f33450a;
        org.telegram.ui.ActionBar.f2 f2Var = j30Var.f34879a;
        if (f2Var != null && f2Var.getParentActivity() != null && (diVar = j30Var.f34881c) != null) {
            if (i7 != 8 && i7 != 7) {
                diVar.L(i7);
                if (i7 == 0) {
                    j30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = diVar.f32932a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = j30Var.f34881c.f32932a2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z13 = false;
            for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                ?? obj2 = new Object();
                arrayList.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    String str2 = gfVar.h;
                    if (str2 != null) {
                        obj2.f22512c = str2;
                    } else {
                        obj2.f22512c = gfVar.I;
                    }
                    obj2.f22513e = gfVar.f26846c;
                    obj2.f22514f = gfVar.f26849g;
                    obj2.f22518k = gfVar.f26860s;
                    obj2.f22523p = gfVar.d();
                    obj2.f22522o = gfVar.f26845b;
                    obj2.f22532z = gfVar.f26854m;
                    obj2.f22524q = true;
                    CharSequence charSequence = gfVar.f26844a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f22516i = gfVar.f26855n;
                    obj2.f22517j = gfVar.f26859r;
                    obj2.h = gfVar.f26864x;
                    TLRPC.VideoSize videoSize = gfVar.S;
                    obj2.v = videoSize;
                    z13 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str3 = kfVar.h;
                    if (str3 != null) {
                        obj2.f22512c = str3;
                    } else {
                        obj2.f22519l = kfVar;
                    }
                    obj2.f22513e = kfVar.f26846c;
                    obj2.f22514f = kfVar.f26849g;
                    obj2.f22518k = kfVar.f26860s;
                    CharSequence charSequence2 = kfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f22516i = kfVar.f26855n;
                    obj2.f22517j = kfVar.f26859r;
                    obj2.h = kfVar.f26864x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        obj2.f22520m = botInlineResult;
                        obj2.f22521n = kfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            j30.a(j30Var, z13, arrayList);
            if (i7 != 8) {
                j30Var.f34881c.a(true);
            }
        }
    }

    @Override
    public final void t0() {
        this.f33450a.q();
    }

    @Override
    public final void M0(Object obj) {
    }

    @Override
    public final void Y0(TLRPC.User user) {
    }

    @Override
    public final void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
