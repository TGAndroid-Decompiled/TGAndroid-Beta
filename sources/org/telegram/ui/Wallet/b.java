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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class b extends s61 {
    public static final int f36374a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        float f7;
        ImageLocation imageLocation;
        c cVar = (c) view;
        boolean z12 = false;
        if (t61Var.f32881u == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.setGrid(z11);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) t61Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f36406c;
        org.telegram.ui.Components.y9 y9Var = cVar.f36405b;
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
        ImageLocation c10 = c.c(nftitem, !cVar.f36407f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23746y6, cVar.f36404a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (cVar.f36407f) {
            f7 = 11.0f;
        } else {
            f7 = 8.0f;
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.y6.o1(0.1f, w02));
        ar arVar = new ar(c02, mutate);
        cVar.h = mutate;
        cVar.f36408n = c02;
        cVar.f36409r = w02;
        if (c10 != null && cVar.f36407f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                imageLocation = c.c(nftitem, true);
            } else {
                imageLocation = null;
            }
            y9Var.f34981a.setImage(c10, "160_160", imageLocation, "100_100", arVar, 0L, null, nftitem, 0);
            y9Var.d();
        } else if (c10 != null) {
            y9Var.h(c10, "46_46", arVar, nftitem);
        } else {
            y9Var.setImageDrawable(arVar);
        }
        if (z10 && !cVar.f36407f) {
            z12 = true;
        }
        cVar.e = z12;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (equals(t61Var, t61Var2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) t61Var.G;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) t61Var2.G;
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
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c(context, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) t61Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) t61Var2.G;
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
