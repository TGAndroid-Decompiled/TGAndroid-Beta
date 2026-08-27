package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class uv extends mv {

    public final yy f33216e0;

    public uv(yy yyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, nv nvVar, boolean z11) {
        super(context, c6Var, true, false, true, z10, 0, nvVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, c6Var), z11);
        this.f33216e0 = yyVar;
    }

    @Override
    public final boolean d() {
        return this.f33216e0.Q0;
    }

    @Override
    public final void e() {
        yy yyVar = this.f33216e0;
        ArrayList arrayList = yyVar.f35008j1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(yyVar.Y0).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f22407id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final boolean g(kx kxVar) {
        return kxVar.f30208f || this.f33216e0.l1.contains(Long.valueOf(kxVar.f30205b.f22407id));
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f33216e0.a2;
    }

    @Override
    public final boolean h(int i10) {
        Integer numValueOf;
        int iDp;
        jy jyVar;
        yy yyVar = this.f33216e0;
        ArrayList arrayList = yyVar.f35015m1;
        gx gxVar = yyVar.N;
        if (yyVar.f34980b0) {
            return false;
        }
        wx wxVar = yyVar.O;
        if (wxVar != null) {
            wxVar.F(null, true);
        }
        vv vvVar = yyVar.R;
        if (vvVar != null && (jyVar = vvVar.f30218r) != null) {
            jyVar.F1(null);
        }
        if (i10 == 0) {
            numValueOf = Integer.valueOf(yyVar.W ? 1 : 0);
        } else {
            i10--;
            numValueOf = null;
        }
        if (numValueOf == null && i10 < EmojiData.dataColored.length && gxVar.f28860s.indexOfKey(i10) >= 0) {
            numValueOf = Integer.valueOf(gxVar.f28860s.get(i10));
        }
        if (numValueOf == null) {
            ArrayList<kx> emojipacks = yyVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks == null || length < 0 || length >= emojipacks.size()) {
                iDp = 0;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        i11 = -1;
                        break;
                    }
                    if (((kx) arrayList.get(i11)).f30205b.f22407id == emojipacks.get(length).f30205b.f22407id) {
                        break;
                    }
                    i11++;
                }
                numValueOf = Integer.valueOf(gxVar.f28860s.get(i11 + EmojiData.dataColored.length));
                iDp = AndroidUtilities.dp(-9.0f);
            }
        } else {
            iDp = 0;
        }
        if (numValueOf != null) {
            yyVar.L.B0();
            yyVar.W(numValueOf.intValue());
            yyVar.I(numValueOf.intValue(), iDp);
            yyVar.n(null, 0);
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            yy yyVar = this.f33216e0;
            View view = yyVar.K;
            if (view != null) {
                view.setTranslationY(f10);
            }
            yyVar.F.invalidate();
        }
    }
}
