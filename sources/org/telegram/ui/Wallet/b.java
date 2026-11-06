package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.xp;
public final class b extends v31 {
    public static final int f42113b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        boolean z10;
        float f10;
        c cVar = (c) view;
        boolean z11 = false;
        if (w31Var.f39839u == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.setGrid(z10);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) w31Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f42202c;
        org.telegram.ui.Components.l9 l9Var = cVar.f42201b;
        hc hcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(hd.M0(2131743177, null));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nftitem.name);
            int indexOf = nftitem.name.indexOf(35);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new CharacterStyle(), indexOf, spannableStringBuilder.length(), 33);
            }
            textView2.setText(spannableStringBuilder);
        }
        String b10 = c.b(nftitem, "Model");
        String b11 = c.b(nftitem, "Backdrop");
        if (!TextUtils.isEmpty(b10) && !TextUtils.isEmpty(b11)) {
            textView.setText(hd.V(null, null, 2131743175, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        hc c10 = c.c(nftitem, !cVar.f42204f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28240y6, cVar.f42200a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(2131232835).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f42204f) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
        xp xpVar = new xp(d02, mutate);
        cVar.h = mutate;
        cVar.f42205n = d02;
        cVar.f42206r = w02;
        if (c10 != null && cVar.f42204f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                hcVar = c.c(nftitem, true);
            }
            l9Var.f35562a.r0(c10, "160_160", hcVar, "100_100", xpVar, 0L, null, nftitem, 0);
            l9Var.d();
        } else if (c10 != null) {
            l9Var.j(c10, "46_46", xpVar, nftitem);
        } else {
            l9Var.setImageDrawable(xpVar);
        }
        if (z9 && !cVar.f42204f) {
            z11 = true;
        }
        cVar.f42203e = z11;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (e(w31Var, w31Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) w31Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) w31Var2.G;
            if (nftitem != nftitem2) {
                if (nftitem == null || nftitem2 == null || !Objects.equals(nftitem.name, nftitem2.name) || !Objects.equals(nftitem.image, nftitem2.image) || !Objects.equals(nftitem.image_small, nftitem2.image_small) || !Objects.equals(nftitem.description, nftitem2.description) || !Objects.equals(nftitem.attributes, nftitem2.attributes) || !Objects.equals(nftitem.extra, nftitem2.extra)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new c(context, f6Var);
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) w31Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) w31Var2.G;
        if (nftitem != null && nftitem2 != null) {
            return TextUtils.equals(nftitem.address, nftitem2.address);
        }
        if (nftitem == nftitem2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}
