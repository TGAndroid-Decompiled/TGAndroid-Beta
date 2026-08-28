package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class vv extends nv {
    public final wy f34007c0;

    public vv(wy wyVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, ov ovVar, boolean z11) {
        super(context, b6Var, true, false, true, z10, 0, ovVar, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23319v6, b6Var), z11);
        this.f34007c0 = wyVar;
    }

    @Override
    public final boolean d() {
        return this.f34007c0.Q0;
    }

    @Override
    public final void e() {
        wy wyVar = this.f34007c0;
        ArrayList arrayList = wyVar.f34415j1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(wyVar.Y0).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f22407id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(jx jxVar) {
        if (!jxVar.f29868f && !this.f34007c0.l1.contains(Long.valueOf(jxVar.f29865b.f22407id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f34007c0.a2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vv.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            wy wyVar = this.f34007c0;
            View view = wyVar.K;
            if (view != null) {
                view.setTranslationY(f10);
            }
            wyVar.F.invalidate();
        }
    }
}
