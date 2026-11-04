package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jw extends zu {
    public final ey f35204h0;

    public jw(ey eyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, av avVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, avVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, e6Var), z11);
        this.f35204h0 = eyVar;
    }

    @Override
    public final boolean d() {
        return this.f35204h0.V0;
    }

    @Override
    public final void e() {
        ey eyVar = this.f35204h0;
        ArrayList arrayList = eyVar.f33562o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && org.telegram.messenger.hp.s1(eyVar.f33529d1).f23009f7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f27028id) {
            org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0);
        }
    }

    @Override
    public final boolean g(sw swVar) {
        if (!swVar.f38128f && !this.f35204h0.f33568q1.contains(Long.valueOf(swVar.f38125b.f27028id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f35204h0.f33538f2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            ey eyVar = this.f35204h0;
            View view = eyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            eyVar.K.invalidate();
        }
    }
}
