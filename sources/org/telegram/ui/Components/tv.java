package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class tv extends nw {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.f2 E0;
    public final boolean F0;
    public final gy G0;

    public tv(gy gyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        super(gyVar, context, f6Var);
        this.G0 = gyVar;
        this.E0 = f2Var;
        this.F0 = z9;
    }

    @Override
    public final void j() {
        uv uvVar = this.G0.C0;
        if (uvVar != null) {
            uvVar.invalidate();
        }
    }

    @Override
    public final void o(int i7, int i10) {
        gy gyVar = this.G0;
        dt dtVar = gyVar.f34035f2;
        int i11 = gyVar.E1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = gyVar.f34024c1;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i14);
        ArrayList arrayList = gyVar.f34027d1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(b02.s0(0), new el(this, 1));
        ArrayList arrayList2 = gyVar.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            gyVar.F2.addAll(arrayList);
        }
        gyVar.D();
        org.telegram.messenger.g0.r(dtVar);
        org.telegram.messenger.g0.i3(dtVar, 1500L);
        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i14);
        b03.X[0] = org.telegram.messenger.ui.q(b03.G[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i15 = gyVar.f34029e0; i15 < arrayList.size(); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f26979id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new di.u5(19));
        org.telegram.messenger.qs.f(i14).k(org.telegram.messenger.qs.f25087x0, 0, Boolean.TRUE);
        gyVar.X(true);
        if (org.telegram.messenger.iz.X) {
            org.telegram.messenger.iz.P();
            org.telegram.ui.ActionBar.f2 f2Var = this.E0;
            if (f2Var != null) {
                hc.a0(f2Var).L(2131624017, org.telegram.messenger.hd.M0(2131751338, null), org.telegram.messenger.hd.M0(2131751337, null), org.telegram.messenger.hd.N0("Settings"), new dd(1, f2Var)).j();
                return;
            }
            FrameLayout frameLayout = gyVar.f34067r;
            if (frameLayout != null) {
                new hc(frameLayout, gyVar.Z1).I(2131624017, org.telegram.messenger.hd.M0(2131751338, null), org.telegram.messenger.hd.M0(2131751337, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        gy gyVar = this.G0;
        gyVar.Z();
        uv uvVar = gyVar.C0;
        if (uvVar != null) {
            uvVar.invalidate();
        }
        invalidate();
        hx hxVar = gyVar.f34076t1;
        if (hxVar != null) {
            hxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.F0) {
                this.G0.f34089x0.invalidate();
            }
        }
    }
}
