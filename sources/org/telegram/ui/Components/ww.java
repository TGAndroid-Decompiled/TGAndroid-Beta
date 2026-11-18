package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ww extends lv {
    public final ry f41803h0;

    public ww(ry ryVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, mv mvVar, boolean z11) {
        super(context, i6Var, true, false, true, z10, 0, mvVar, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29729v6, i6Var), z11);
        this.f41803h0 = ryVar;
    }

    @Override
    public final boolean d() {
        return this.f41803h0.V0;
    }

    @Override
    public final void e() {
        ry ryVar = this.f41803h0;
        ArrayList arrayList = ryVar.f39377o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.mp.u1(ryVar.f39345d1).i7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28430id) {
            org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0);
        }
    }

    @Override
    public final boolean g(fx fxVar) {
        if (!fxVar.f35175f && !this.f41803h0.f39383q1.contains(Long.valueOf(fxVar.f35172b.f28430id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f41803h0.f39353f2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ww.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            ry ryVar = this.f41803h0;
            View view = ryVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            ryVar.K.invalidate();
        }
    }
}
