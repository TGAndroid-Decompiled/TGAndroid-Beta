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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z9;
public final class b extends l61 {
    public static final int f32680a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        c cVar = (c) view;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) m61Var.G;
        z9 z9Var = cVar.f32714b;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f32715c;
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
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, cVar.f32713a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        cr crVar = new cr(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.m1(0.1f, w02)), mutate);
        if (b10 != null) {
            z9Var.h(b10, "46_46", crVar, nftitem);
        } else {
            z9Var.setImageDrawable(crVar);
        }
        cVar.e = z10;
        cVar.d();
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
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c(context, c6Var);
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
