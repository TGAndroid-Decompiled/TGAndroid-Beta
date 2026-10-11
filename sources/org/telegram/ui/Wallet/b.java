package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.y9;
public final class b extends q61 {
    public static final int f34668a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        c cVar = (c) view;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) r61Var.G;
        y9 y9Var = cVar.f34718b;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f34719c;
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
        String a2 = c.a(nftitem, "Model");
        String a10 = c.a(nftitem, "Backdrop");
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a10)) {
            textView.setText(LocaleController.formatSpannable(R.string.WalletCollectibleModelBackdrop, a2, a10));
        } else {
            textView.setText(nftitem.description);
        }
        ImageLocation b10 = c.b(nftitem, true);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21171y6, cVar.f34717a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        fr frVar = new fr(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, w02)), mutate);
        if (b10 != null) {
            y9Var.h(b10, "46_46", frVar, nftitem);
        } else {
            y9Var.setImageDrawable(frVar);
        }
        cVar.f34720e = z10;
        cVar.e();
        cVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (equals(r61Var, r61Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) r61Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) r61Var2.G;
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
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c(context, d6Var);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) r61Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) r61Var2.G;
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
