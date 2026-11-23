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
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
public final class b extends n41 {
    public static final int f43951b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        float f10;
        c cVar = (c) view;
        boolean z12 = false;
        if (o41Var.v == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) o41Var.H;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f43986c;
        org.telegram.ui.Components.q9 q9Var = cVar.f43985b;
        gc gcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(hd.N0(2131742932, null));
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
            textView.setText(hd.V(null, null, 2131742930, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        gc c10 = c.c(nftitem, !cVar.f43988f);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29739y6, cVar.f43984a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(2131232838).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f43988f) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
        oq oqVar = new oq(d02, mutate);
        cVar.h = mutate;
        cVar.f43989n = d02;
        cVar.f43990r = w02;
        if (c10 != null && cVar.f43988f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                gcVar = c.c(nftitem, true);
            }
            q9Var.f38789a.r0(c10, "160_160", gcVar, "100_100", oqVar, 0L, null, nftitem, 0);
            q9Var.d();
        } else if (c10 != null) {
            q9Var.j(c10, "46_46", oqVar, nftitem);
        } else {
            q9Var.setImageDrawable(oqVar);
        }
        if (z10 && !cVar.f43988f) {
            z12 = true;
        }
        cVar.f43987e = z12;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (e(o41Var, o41Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) o41Var.H;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) o41Var2.H;
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
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new c(context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) o41Var.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) o41Var2.H;
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
