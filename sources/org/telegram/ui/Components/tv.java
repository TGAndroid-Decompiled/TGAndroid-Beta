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

    public tv(gy gyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        super(gyVar, context, h6Var);
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
        dt dtVar = gyVar.f34027f2;
        int i11 = gyVar.E1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = gyVar.f34016c1;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i14);
        ArrayList arrayList = gyVar.f34019d1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(b02.s0(0), new dl(this, 1));
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
        for (int i15 = gyVar.f34021e0; i15 < arrayList.size(); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f26987id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new di.v5(19));
        org.telegram.messenger.qs.f(i14).k(org.telegram.messenger.qs.f25108x0, 0, Boolean.TRUE);
        gyVar.X(true);
        if (org.telegram.messenger.iz.X) {
            org.telegram.messenger.iz.P();
            org.telegram.ui.ActionBar.f2 f2Var = this.E0;
            if (f2Var != null) {
                gc.a0(f2Var).L(2131624017, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null), org.telegram.messenger.id.N0("Settings"), new cd(1, f2Var)).j();
                return;
            }
            FrameLayout frameLayout = gyVar.f34059r;
            if (frameLayout != null) {
                new gc(frameLayout, gyVar.Z1).I(2131624017, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null)).j();
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
        hx hxVar = gyVar.f34068t1;
        if (hxVar != null) {
            hxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.F0) {
                this.G0.f34081x0.invalidate();
            }
        }
    }
}
