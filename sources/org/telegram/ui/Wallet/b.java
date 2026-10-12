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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.y9;
public final class b extends t61 {
    public static final int f34479a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        c cVar = (c) view;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) u61Var.G;
        y9 y9Var = cVar.f34529b;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f34530c;
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
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20946y6, cVar.f34528a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        hr hrVar = new hr(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, w02)), mutate);
        if (b10 != null) {
            y9Var.h(b10, "46_46", hrVar, nftitem);
        } else {
            y9Var.setImageDrawable(hrVar);
        }
        cVar.f34531e = z10;
        cVar.e();
        cVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (equals(u61Var, u61Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) u61Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) u61Var2.G;
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
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c(context, c6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) u61Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) u61Var2.G;
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
