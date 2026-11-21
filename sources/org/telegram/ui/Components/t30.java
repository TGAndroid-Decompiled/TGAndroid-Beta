package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class t30 implements si {
    public final x30 f39765a;

    public t30(x30 x30Var) {
        this.f39765a = x30Var;
    }

    @Override
    public final void K0() {
        org.telegram.messenger.g0.v1(this.f39765a.f41966a.getFragmentView().findFocus());
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
        this.f39765a.q();
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar;
        x30 x30Var = this.f39765a;
        org.telegram.ui.ActionBar.g2 g2Var = x30Var.f41966a;
        if (g2Var != null && g2Var.getParentActivity() != null && (uiVar = x30Var.f41968c) != null) {
            if (i7 != 8 && i7 != 7) {
                uiVar.M(i7);
                if (i7 == 0) {
                    x30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = uiVar.f40386e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = x30Var.f41968c.f40386e2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z14 = false;
            for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                ?? obj2 = new Object();
                arrayList.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    String str2 = efVar.h;
                    if (str2 != null) {
                        obj2.f28239c = str2;
                    } else {
                        obj2.f28239c = efVar.I;
                    }
                    obj2.f28240e = efVar.f27876c;
                    obj2.f28241f = efVar.f27879g;
                    obj2.f28245k = efVar.f27890s;
                    obj2.f28250p = efVar.d();
                    obj2.f28249o = efVar.f27875b;
                    obj2.f28259z = efVar.f27884m;
                    obj2.f28251q = true;
                    CharSequence charSequence = efVar.f27874a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28243i = efVar.f27885n;
                    obj2.f28244j = efVar.f27889r;
                    obj2.h = efVar.f27894x;
                    TLRPC.VideoSize videoSize = efVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28239c = str3;
                    } else {
                        obj2.f28246l = hfVar;
                    }
                    obj2.f28240e = hfVar.f27876c;
                    obj2.f28241f = hfVar.f27879g;
                    obj2.f28245k = hfVar.f27890s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28243i = hfVar.f27885n;
                    obj2.f28244j = hfVar.f27889r;
                    obj2.h = hfVar.f27894x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28247m = botInlineResult;
                        obj2.f28248n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            x30.a(x30Var, z14, arrayList);
            if (i7 != 8) {
                x30Var.f41968c.a(true);
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
