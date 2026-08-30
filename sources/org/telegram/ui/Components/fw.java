package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class fw extends xv {
    public final kz f24967d0;

    public fw(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, yv yvVar, boolean z10) {
        super(context, f6Var, true, false, true, z4, 0, yvVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20225v6, f6Var), z10);
        this.f24967d0 = kzVar;
    }

    @Override
    public final boolean d() {
        return this.f24967d0.R0;
    }

    @Override
    public final void e() {
        kz kzVar = this.f24967d0;
        ArrayList arrayList = kzVar.f26443k1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(kzVar.Z0).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f19211id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(vx vxVar) {
        if (!vxVar.f30102f && !this.f24967d0.f26447m1.contains(Long.valueOf(vxVar.f30100b.f19211id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f24967d0.f26415b2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            kz kzVar = this.f24967d0;
            View view = kzVar.L;
            if (view != null) {
                view.setTranslationY(f10);
            }
            kzVar.G.invalidate();
        }
    }
}
