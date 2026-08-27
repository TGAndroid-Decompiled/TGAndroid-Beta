package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public abstract class kx0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = n2Var.getContext();
        lh.l2 l2Var = new lh.l2(context, c6Var, true, false);
        l2Var.f16294y = new c3.d(i10, context, tL_messages_stickerSet, 7);
        if (n2Var.visibleDialog != null) {
            l2Var.show();
        } else {
            n2Var.showDialog(l2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g1(25, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final ix0 ix0Var = new ix0(context);
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        ix0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        ix0Var.setInputType(16385);
        ix0Var.setTextSize(1, 16.0f);
        ix0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        ix0Var.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23382vf, c6Var));
        ix0Var.setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        ix0Var.setSingleLine(true);
        ix0Var.setFocusable(true);
        ix0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                if (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) {
                    return charSequence;
                }
                return (TextUtils.isEmpty(ix0Var.getText()) || i13 == 0) ? "" : charSequence;
            }
        }});
        ix0Var.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23181k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23198l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var));
        ix0Var.setImeOptions(6);
        ix0Var.setBackground(null);
        ix0Var.requestFocus();
        ix0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(ix0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, h7.z5.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        ix0Var.addTextChangedListener(new jx0(numberTextView, ix0Var));
        if (z10) {
            ix0Var.setText(stickerSet.title);
            ix0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        b2Var.C = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new l9.b(ix0Var, callback2, context, z10, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vu(ix0Var, 24));
        org.telegram.ui.ActionBar.b2 b2VarO = alertDialog$Builder.o();
        b2VarO.f22748d0 = false;
        ix0Var.setOnEditorActionListener(new c1(b2VarO, 8));
    }
}
