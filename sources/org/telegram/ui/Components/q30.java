package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class q30 implements ri {
    public final u30 f38680a;

    public q30(u30 u30Var) {
        this.f38680a = u30Var;
    }

    @Override
    public final void B0() {
        org.telegram.messenger.g0.v1(this.f38680a.f40250a.getFragmentView().findFocus());
    }

    @Override
    public final void S(fh fhVar) {
        fhVar.run();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void l0() {
        this.f38680a.q();
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ti tiVar;
        u30 u30Var = this.f38680a;
        org.telegram.ui.ActionBar.g2 g2Var = u30Var.f40250a;
        if (g2Var != null && g2Var.getParentActivity() != null && (tiVar = u30Var.f40252c) != null) {
            if (i7 != 8 && i7 != 7) {
                tiVar.M(i7);
                if (i7 == 0) {
                    u30Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = tiVar.f39967e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = u30Var.f40252c.f39967e2.getSelectedPhotosOrder();
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
                        obj2.f28311c = str2;
                    } else {
                        obj2.f28311c = efVar.I;
                    }
                    obj2.f28312e = efVar.f27964c;
                    obj2.f28313f = efVar.f27967g;
                    obj2.f28317k = efVar.f27978s;
                    obj2.f28322p = efVar.d();
                    obj2.f28321o = efVar.f27963b;
                    obj2.f28331z = efVar.f27972m;
                    obj2.f28323q = true;
                    CharSequence charSequence = efVar.f27962a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28315i = efVar.f27973n;
                    obj2.f28316j = efVar.f27977r;
                    obj2.h = efVar.f27982x;
                    TLRPC.VideoSize videoSize = efVar.S;
                    obj2.v = videoSize;
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28311c = str3;
                    } else {
                        obj2.f28318l = hfVar;
                    }
                    obj2.f28312e = hfVar.f27964c;
                    obj2.f28313f = hfVar.f27967g;
                    obj2.f28317k = hfVar.f27978s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28315i = hfVar.f27973n;
                    obj2.f28316j = hfVar.f27977r;
                    obj2.h = hfVar.f27982x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28319m = botInlineResult;
                        obj2.f28320n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            u30.a(u30Var, z14, arrayList);
            if (i7 != 8) {
                u30Var.f40252c.a(true);
            }
        }
    }

    @Override
    public final void O0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
