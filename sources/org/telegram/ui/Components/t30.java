package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class t30 implements si {
    public final x30 f39712a;

    public t30(x30 x30Var) {
        this.f39712a = x30Var;
    }

    @Override
    public final void K0() {
        org.telegram.messenger.g0.v1(this.f39712a.f41915a.getFragmentView().findFocus());
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
        this.f39712a.q();
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar;
        x30 x30Var = this.f39712a;
        org.telegram.ui.ActionBar.g2 g2Var = x30Var.f41915a;
        if (g2Var != null && g2Var.getParentActivity() != null && (uiVar = x30Var.f41917c) != null) {
            if (i7 != 8 && i7 != 7) {
                uiVar.M(i7);
                if (i7 == 0) {
                    x30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = uiVar.f40363e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = x30Var.f41917c.f40363e2.getSelectedPhotosOrder();
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
                        obj2.f28371c = str2;
                    } else {
                        obj2.f28371c = ffVar.I;
                    }
                    obj2.f28372e = ffVar.f28024c;
                    obj2.f28373f = ffVar.f28027g;
                    obj2.f28377k = ffVar.f28038s;
                    obj2.f28382p = ffVar.d();
                    obj2.f28381o = ffVar.f28023b;
                    obj2.f28391z = ffVar.f28032m;
                    obj2.f28383q = true;
                    CharSequence charSequence = ffVar.f28022a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28375i = ffVar.f28033n;
                    obj2.f28376j = ffVar.f28037r;
                    obj2.h = ffVar.f28042x;
                    TLRPC.VideoSize videoSize = ffVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f28371c = str3;
                    } else {
                        obj2.f28378l = jfVar;
                    }
                    obj2.f28372e = jfVar.f28024c;
                    obj2.f28373f = jfVar.f28027g;
                    obj2.f28377k = jfVar.f28038s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28375i = jfVar.f28033n;
                    obj2.f28376j = jfVar.f28037r;
                    obj2.h = jfVar.f28042x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f28379m = botInlineResult;
                        obj2.f28380n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            x30.a(x30Var, z14, arrayList);
            if (i7 != 8) {
                x30Var.f41917c.a(true);
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
