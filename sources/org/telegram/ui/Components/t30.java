package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class t30 implements si {
    public final x30 f39757a;

    public t30(x30 x30Var) {
        this.f39757a = x30Var;
    }

    @Override
    public final void K0() {
        org.telegram.messenger.g0.v1(this.f39757a.f41958a.getFragmentView().findFocus());
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void v0() {
        this.f39757a.q();
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar;
        x30 x30Var = this.f39757a;
        org.telegram.ui.ActionBar.g2 g2Var = x30Var.f41958a;
        if (g2Var != null && g2Var.getParentActivity() != null && (uiVar = x30Var.f41960c) != null) {
            if (i7 != 8 && i7 != 7) {
                uiVar.M(i7);
                if (i7 == 0) {
                    x30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = uiVar.f40378e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = x30Var.f41960c.f40378e2.getSelectedPhotosOrder();
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
                        obj2.f28407c = str2;
                    } else {
                        obj2.f28407c = ffVar.I;
                    }
                    obj2.f28408e = ffVar.f28060c;
                    obj2.f28409f = ffVar.f28063g;
                    obj2.f28413k = ffVar.f28074s;
                    obj2.f28418p = ffVar.d();
                    obj2.f28417o = ffVar.f28059b;
                    obj2.f28427z = ffVar.f28068m;
                    obj2.f28419q = true;
                    CharSequence charSequence = ffVar.f28058a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28411i = ffVar.f28069n;
                    obj2.f28412j = ffVar.f28073r;
                    obj2.h = ffVar.f28078x;
                    TLRPC.VideoSize videoSize = ffVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f28407c = str3;
                    } else {
                        obj2.f28414l = jfVar;
                    }
                    obj2.f28408e = jfVar.f28060c;
                    obj2.f28409f = jfVar.f28063g;
                    obj2.f28413k = jfVar.f28074s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28411i = jfVar.f28069n;
                    obj2.f28412j = jfVar.f28073r;
                    obj2.h = jfVar.f28078x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f28415m = botInlineResult;
                        obj2.f28416n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            x30.a(x30Var, z14, arrayList);
            if (i7 != 8) {
                x30Var.f41960c.a(true);
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
