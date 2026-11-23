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
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class b extends m41 {
    public static final int f44075b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        float f10;
        c cVar = (c) view;
        boolean z12 = false;
        if (n41Var.v == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) n41Var.H;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f44114c;
        org.telegram.ui.Components.p9 p9Var = cVar.f44113b;
        fc fcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(gd.N0(2131742925, null));
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
            textView.setText(gd.V(null, null, 2131742923, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        fc c10 = c.c(nftitem, !cVar.f44116f);
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29843y6, cVar.f44112a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(2131232841).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f44116f) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
        lq lqVar = new lq(d02, mutate);
        cVar.h = mutate;
        cVar.f44117n = d02;
        cVar.f44118r = w02;
        if (c10 != null && cVar.f44116f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                fcVar = c.c(nftitem, true);
            }
            p9Var.f38429a.s0(c10, "160_160", fcVar, "100_100", lqVar, 0L, null, nftitem, 0);
            p9Var.e();
        } else if (c10 != null) {
            p9Var.j(c10, "46_46", lqVar, nftitem);
        } else {
            p9Var.setImageDrawable(lqVar);
        }
        if (z10 && !cVar.f44116f) {
            z12 = true;
        }
        cVar.f44115e = z12;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (e(n41Var, n41Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) n41Var.H;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) n41Var2.H;
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
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new c(context, i6Var);
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) n41Var.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) n41Var2.H;
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
