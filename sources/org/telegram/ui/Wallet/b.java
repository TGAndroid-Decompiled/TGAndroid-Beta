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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.z41;
public final class b extends k41 {
    public static final int f43941b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        float f10;
        c cVar = (c) view;
        boolean z12 = false;
        if (l41Var.v == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) l41Var.H;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f43976c;
        org.telegram.ui.Components.q9 q9Var = cVar.f43975b;
        fc fcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(gd.M0(2131742938, null));
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
            textView.setText(gd.V(null, null, 2131742936, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        fc c10 = c.c(nftitem, !cVar.f43978f);
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, cVar.f43974a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(2131232838).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f43978f) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
        mq mqVar = new mq(d02, mutate);
        cVar.h = mutate;
        cVar.f43979n = d02;
        cVar.f43980r = w02;
        if (c10 != null && cVar.f43978f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                fcVar = c.c(nftitem, true);
            }
            q9Var.f38742a.r0(c10, "160_160", fcVar, "100_100", mqVar, 0L, null, nftitem, 0);
            q9Var.d();
        } else if (c10 != null) {
            q9Var.j(c10, "46_46", mqVar, nftitem);
        } else {
            q9Var.setImageDrawable(mqVar);
        }
        if (z10 && !cVar.f43978f) {
            z12 = true;
        }
        cVar.f43977e = z12;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (e(l41Var, l41Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) l41Var.H;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) l41Var2.H;
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
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new c(context, i6Var);
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) l41Var.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) l41Var2.H;
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
