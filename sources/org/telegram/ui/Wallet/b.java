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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.zq;
public final class b extends f61 {
    public static final int f34003a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        boolean z11;
        float f7;
        ImageLocation imageLocation;
        c cVar = (c) view;
        boolean z12 = false;
        if (g61Var.f26506u == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) g61Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f34050c;
        org.telegram.ui.Components.w9 w9Var = cVar.f34049b;
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
        ImageLocation c10 = c.c(nftitem, !cVar.f34051f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21375y6, cVar.f34048a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f34051f) {
            f7 = 11.0f;
        } else {
            f7 = 8.0f;
        }
        zq zqVar = new zq(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.h6.m1(0.1f, w02)), mutate);
        if (c10 != null && cVar.f34051f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                imageLocation = c.c(nftitem, true);
            } else {
                imageLocation = null;
            }
            w9Var.f32040a.setImage(c10, "160_160", imageLocation, "100_100", zqVar, 0L, null, nftitem, 0);
            w9Var.d();
        } else if (c10 != null) {
            w9Var.h(c10, "46_46", zqVar, nftitem);
        } else {
            w9Var.setImageDrawable(zqVar);
        }
        if (z10 && !cVar.f34051f) {
            z12 = true;
        }
        cVar.e = z12;
        cVar.d();
        cVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (equals(g61Var, g61Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) g61Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) g61Var2.G;
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
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c(context, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) g61Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) g61Var2.G;
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
