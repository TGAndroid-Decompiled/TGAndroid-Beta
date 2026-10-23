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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.yq;
public final class b extends l61 {
    public static final int f34314a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        boolean z11;
        float f7;
        ImageLocation imageLocation;
        c cVar = (c) view;
        boolean z12 = false;
        if (m61Var.f28568u == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) m61Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f34345c;
        org.telegram.ui.Components.w9 w9Var = cVar.f34344b;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(LocaleController.getString(R.string.WalletCollectible));
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
            textView.setText(LocaleController.formatSpannable(R.string.WalletCollectibleModelBackdrop, b10, b11));
        } else {
            textView.setText(nftitem.description);
        }
        ImageLocation c10 = c.c(nftitem, !cVar.f34346f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21571y6, cVar.f34343a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f34346f) {
            f7 = 11.0f;
        } else {
            f7 = 8.0f;
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.k6.o1(0.1f, w02));
        yq yqVar = new yq(c02, mutate);
        cVar.h = mutate;
        cVar.f34347n = c02;
        cVar.f34348r = w02;
        if (c10 != null && cVar.f34346f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                imageLocation = c.c(nftitem, true);
            } else {
                imageLocation = null;
            }
            w9Var.f32195a.setImage(c10, "160_160", imageLocation, "100_100", yqVar, 0L, null, nftitem, 0);
            w9Var.d();
        } else if (c10 != null) {
            w9Var.h(c10, "46_46", yqVar, nftitem);
        } else {
            w9Var.setImageDrawable(yqVar);
        }
        if (z10 && !cVar.f34346f) {
            z12 = true;
        }
        cVar.e = z12;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (equals(m61Var, m61Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) m61Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) m61Var2.G;
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
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new c(context, g6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) m61Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) m61Var2.G;
        if (nftitem != null && nftitem2 != null) {
            return TextUtils.equals(nftitem.address, nftitem2.address);
        }
        if (nftitem == nftitem2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
