package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kw extends av {
    public final gy f35423g0;

    public kw(gy gyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, bv bvVar, boolean z10) {
        super(context, f6Var, true, false, true, z9, 0, bvVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28184v6, f6Var), z10);
        this.f35423g0 = gyVar;
    }

    @Override
    public final boolean d() {
        return this.f35423g0.U0;
    }

    @Override
    public final void e() {
        gy gyVar = this.f35423g0;
        ArrayList arrayList = gyVar.n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.qp.s1(gyVar.f34032c1).f24777f7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f26980id) {
            org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24467s0);
        }
    }

    @Override
    public final boolean g(tw twVar) {
        if (!twVar.f38403f && !this.f35423g0.f34070p1.contains(Long.valueOf(twVar.f38400b.f26980id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f35423g0.f34039e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            gy gyVar = this.f35423g0;
            View view = gyVar.O;
            if (view != null) {
                view.setTranslationY(f10);
            }
            gyVar.J.invalidate();
        }
    }
}
