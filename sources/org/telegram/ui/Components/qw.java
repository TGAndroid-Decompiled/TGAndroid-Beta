package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qw extends gv {
    public final ly f38774h0;

    public qw(ly lyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, hv hvVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, hvVar, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, e6Var), z11);
        this.f38774h0 = lyVar;
    }

    @Override
    public final boolean d() {
        return this.f38774h0.V0;
    }

    @Override
    public final void e() {
        ly lyVar = this.f38774h0;
        ArrayList arrayList = lyVar.f36973o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.np.s1(lyVar.f36941d1).f25292g7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28078id) {
            org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0);
        }
    }

    @Override
    public final boolean g(zw zwVar) {
        if (!zwVar.f42434f && !this.f38774h0.f36979q1.contains(Long.valueOf(zwVar.f42431b.f28078id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f38774h0.f36949f2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            ly lyVar = this.f38774h0;
            View view = lyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            lyVar.K.invalidate();
        }
    }
}
