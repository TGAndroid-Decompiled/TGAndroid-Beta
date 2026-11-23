package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yw extends ov {
    public final ty f42580h0;

    public yw(ty tyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, pv pvVar, boolean z11) {
        super(context, h6Var, true, false, true, z10, 0, pvVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29716v6, h6Var), z11);
        this.f42580h0 = tyVar;
    }

    @Override
    public final boolean d() {
        return this.f42580h0.V0;
    }

    @Override
    public final void e() {
        ty tyVar = this.f42580h0;
        ArrayList arrayList = tyVar.f40124o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.np.u1(tyVar.f40092d1).i7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28461id) {
            org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0);
        }
    }

    @Override
    public final boolean g(hx hxVar) {
        if (!hxVar.f35985f && !this.f42580h0.f40130q1.contains(Long.valueOf(hxVar.f35982b.f28461id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f42580h0.f40100f2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            ty tyVar = this.f42580h0;
            View view = tyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            tyVar.K.invalidate();
        }
    }
}
