package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class fy extends tw {
    public final b00 f26532g0;

    public fy(b00 b00Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, uw uwVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, uwVar, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21132v6, e6Var), z11);
        this.f26532g0 = b00Var;
    }

    @Override
    public final boolean d() {
        return this.f26532g0.U0;
    }

    @Override
    public final void e() {
        b00 b00Var = this.f26532g0;
        ArrayList arrayList = b00Var.f24723n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(b00Var.f24689c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f20069id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(oy oyVar) {
        if (!oyVar.f29622f && !this.f26532g0.f24729p1.contains(Long.valueOf(oyVar.f29619b.f20069id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f26532g0.f24697e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fy.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            b00 b00Var = this.f26532g0;
            View view = b00Var.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            b00Var.J.invalidate();
        }
    }
}
