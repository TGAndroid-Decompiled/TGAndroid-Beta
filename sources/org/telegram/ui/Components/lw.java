package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lw extends bv {
    public final hy f35861g0;

    public lw(hy hyVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, cv cvVar, boolean z10) {
        super(context, g6Var, true, false, true, z9, 0, cvVar, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, g6Var), z10);
        this.f35861g0 = hyVar;
    }

    @Override
    public final boolean d() {
        return this.f35861g0.U0;
    }

    @Override
    public final void e() {
        hy hyVar = this.f35861g0;
        ArrayList arrayList = hyVar.n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.qp.s1(hyVar.f34415c1).f24784f7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f26983id) {
            org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0);
        }
    }

    @Override
    public final boolean g(uw uwVar) {
        if (!uwVar.f38813f && !this.f35861g0.f34453p1.contains(Long.valueOf(uwVar.f38810b.f26983id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f35861g0.f34422e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            hy hyVar = this.f35861g0;
            View view = hyVar.O;
            if (view != null) {
                view.setTranslationY(f10);
            }
            hyVar.J.invalidate();
        }
    }
}
