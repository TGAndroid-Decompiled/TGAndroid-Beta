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
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xp;
public final class b extends q31 {
    public static final int f42210b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        float f10;
        c cVar = (c) view;
        boolean z12 = false;
        if (r31Var.f37636u == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) r31Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f42355c;
        org.telegram.ui.Components.k9 k9Var = cVar.f42354b;
        ac acVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(bd.M0(2131743186, null));
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
            textView.setText(bd.V(null, null, 2131743184, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        ac c2 = c.c(nftitem, !cVar.f42357f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, cVar.f42353a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(2131232833).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f42357f) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
        xp xpVar = new xp(d02, mutate);
        cVar.h = mutate;
        cVar.f42358n = d02;
        cVar.f42359r = w02;
        if (c2 != null && cVar.f42357f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                acVar = c.c(nftitem, true);
            }
            k9Var.f35342a.r0(c2, "160_160", acVar, "100_100", xpVar, 0L, null, nftitem, 0);
            k9Var.d();
        } else if (c2 != null) {
            k9Var.j(c2, "46_46", xpVar, nftitem);
        } else {
            k9Var.setImageDrawable(xpVar);
        }
        if (z10 && !cVar.f42357f) {
            z12 = true;
        }
        cVar.f42356e = z12;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (e(r31Var, r31Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) r31Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) r31Var2.G;
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
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new c(context, e6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) r31Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) r31Var2.G;
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
