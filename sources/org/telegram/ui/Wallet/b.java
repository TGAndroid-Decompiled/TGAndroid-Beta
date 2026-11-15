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
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class b extends a41 {
    public static final int f43490b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        float f10;
        c cVar = (c) view;
        boolean z12 = false;
        if (b41Var.f33190u == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b41Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f43542c;
        org.telegram.ui.Components.i9 i9Var = cVar.f43541b;
        gc gcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(hd.M0(2131743176, null));
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
            textView.setText(hd.V(null, null, 2131743174, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        gc c10 = c.c(nftitem, !cVar.f43544f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, cVar.f43540a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(2131232836).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f43544f) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
        fq fqVar = new fq(d02, mutate);
        cVar.h = mutate;
        cVar.f43545n = d02;
        cVar.f43546r = w02;
        if (c10 != null && cVar.f43544f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                gcVar = c.c(nftitem, true);
            }
            i9Var.f35508a.r0(c10, "160_160", gcVar, "100_100", fqVar, 0L, null, nftitem, 0);
            i9Var.e();
        } else if (c10 != null) {
            i9Var.j(c10, "46_46", fqVar, nftitem);
        } else {
            i9Var.setImageDrawable(fqVar);
        }
        if (z10 && !cVar.f43544f) {
            z12 = true;
        }
        cVar.f43543e = z12;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (e(b41Var, b41Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b41Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b41Var2.G;
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
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new c(context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b41Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b41Var2.G;
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
