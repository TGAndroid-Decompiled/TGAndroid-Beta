package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zw extends mv {
    public final vy f33250g0;

    public zw(vy vyVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, nv nvVar, boolean z11) {
        super(context, p6Var, true, false, true, z10, 0, nvVar, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21259v6, p6Var), z11);
        this.f33250g0 = vyVar;
    }

    @Override
    public final boolean d() {
        return this.f33250g0.U0;
    }

    @Override
    public final void e() {
        vy vyVar = this.f33250g0;
        ArrayList arrayList = vyVar.f31898n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.vp.r1(vyVar.f31865c1).f18795g7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f19820id) {
            org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0);
        }
    }

    @Override
    public final boolean g(ix ixVar) {
        if (!ixVar.f27115f && !this.f33250g0.f31904p1.contains(Long.valueOf(ixVar.f27113b.f19820id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f33250g0.f31872e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            vy vyVar = this.f33250g0;
            View view = vyVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            vyVar.J.invalidate();
        }
    }
}
