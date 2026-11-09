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
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y31;
public final class b extends x31 {
    public static final int f42201b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        float f10;
        c cVar = (c) view;
        boolean z11 = false;
        if (y31Var.f40577u == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.setGrid(z10);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) y31Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f42287c;
        org.telegram.ui.Components.l9 l9Var = cVar.f42286b;
        hc hcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(id.M0(2131743176, null));
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
            textView.setText(id.V(null, null, 2131743174, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        hc c10 = c.c(nftitem, !cVar.f42289f);
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, cVar.f42285a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(2131232835).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f42289f) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.l6.r1(0.1f, w02));
        xp xpVar = new xp(d02, mutate);
        cVar.h = mutate;
        cVar.f42290n = d02;
        cVar.f42291r = w02;
        if (c10 != null && cVar.f42289f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                hcVar = c.c(nftitem, true);
            }
            l9Var.f35647a.r0(c10, "160_160", hcVar, "100_100", xpVar, 0L, null, nftitem, 0);
            l9Var.d();
        } else if (c10 != null) {
            l9Var.j(c10, "46_46", xpVar, nftitem);
        } else {
            l9Var.setImageDrawable(xpVar);
        }
        if (z9 && !cVar.f42289f) {
            z11 = true;
        }
        cVar.f42288e = z11;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (e(y31Var, y31Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) y31Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) y31Var2.G;
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
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new c(context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) y31Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) y31Var2.G;
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
