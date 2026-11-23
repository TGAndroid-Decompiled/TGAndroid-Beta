package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yw extends nv {
    public final ty f42537h0;

    public yw(ty tyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, ov ovVar, boolean z11) {
        super(context, h6Var, true, false, true, z10, 0, ovVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29682v6, h6Var), z11);
        this.f42537h0 = tyVar;
    }

    @Override
    public final boolean d() {
        return this.f42537h0.V0;
    }

    @Override
    public final void e() {
        ty tyVar = this.f42537h0;
        ArrayList arrayList = tyVar.f40106o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.np.u1(tyVar.f40074d1).i7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28425id) {
            org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0);
        }
    }

    @Override
    public final boolean g(hx hxVar) {
        if (!hxVar.f35939f && !this.f42537h0.f40112q1.contains(Long.valueOf(hxVar.f35936b.f28425id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f42537h0.f40082f2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            ty tyVar = this.f42537h0;
            View view = tyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            tyVar.K.invalidate();
        }
    }
}
