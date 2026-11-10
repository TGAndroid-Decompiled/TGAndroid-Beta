package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kw extends av {
    public final gy f35453g0;

    public kw(gy gyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, bv bvVar, boolean z10) {
        super(context, h6Var, true, false, true, z9, 0, bvVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28225v6, h6Var), z10);
        this.f35453g0 = gyVar;
    }

    @Override
    public final boolean d() {
        return this.f35453g0.U0;
    }

    @Override
    public final void e() {
        gy gyVar = this.f35453g0;
        ArrayList arrayList = gyVar.n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.qp.s1(gyVar.f34016c1).f24788f7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f26987id) {
            org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0);
        }
    }

    @Override
    public final boolean g(tw twVar) {
        if (!twVar.f38407f && !this.f35453g0.f34054p1.contains(Long.valueOf(twVar.f38404b.f26987id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f35453g0.f34023e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            gy gyVar = this.f35453g0;
            View view = gyVar.O;
            if (view != null) {
                view.setTranslationY(f10);
            }
            gyVar.J.invalidate();
        }
    }
}
