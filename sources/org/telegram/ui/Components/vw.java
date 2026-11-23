package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vw extends lv {
    public final qy f41440h0;

    public vw(qy qyVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, mv mvVar, boolean z11) {
        super(context, i6Var, true, false, true, z10, 0, mvVar, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29786v6, i6Var), z11);
        this.f41440h0 = qyVar;
    }

    @Override
    public final boolean d() {
        return this.f41440h0.V0;
    }

    @Override
    public final void e() {
        qy qyVar = this.f41440h0;
        ArrayList arrayList = qyVar.f39079o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.mp.u1(qyVar.f39047d1).i7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28519id) {
            org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0);
        }
    }

    @Override
    public final boolean g(ex exVar) {
        if (!exVar.f34859f && !this.f41440h0.f39085q1.contains(Long.valueOf(exVar.f34856b.f28519id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f41440h0.f39055f2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            qy qyVar = this.f41440h0;
            View view = qyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            qyVar.K.invalidate();
        }
    }
}
