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
public abstract class ny0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = p2Var.getContext();
        bi.f3 f3Var = new bi.f3(context, f6Var, true, false);
        f3Var.f2699y = new fg.e2(i10, context, tL_messages_stickerSet, 9);
        if (p2Var.visibleDialog != null) {
            f3Var.show();
        } else {
            p2Var.showDialog(f3Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new km(11, runnable, stickerSet));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var));
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Utilities.Callback2 callback2) {
        boolean z10;
        int i10;
        float f7;
        int i11;
        int i12;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (stickerSet != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.string.EditStickerPack;
        } else {
            i10 = R.string.NewStickerPack;
        }
        String string = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i13 = org.telegram.ui.ActionBar.j6.f18034j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(ly0.this.getText()) || i16 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
            }
        }});
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18055k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18073l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18144p7, f6Var));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f10 = 0.0f;
        if (LocaleController.isRTL) {
            f7 = 28.0f;
        } else {
            f7 = 0.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (!LocaleController.isRTL) {
            f10 = 28.0f;
        }
        editTextBoldCursor.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(numberTextView, w7.a6.d(26, 20.0f, i11 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new my0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        d2Var.G = 4;
        if (z10) {
            i12 = R.string.Done;
        } else {
            i12 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i12), new ca.b((Object) editTextBoldCursor, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pv(editTextBoldCursor, 24));
        org.telegram.ui.ActionBar.d2 o9 = alertDialog$Builder.o();
        o9.f17622h0 = false;
        editTextBoldCursor.setOnEditorActionListener(new g1(o9, 8));
    }
}
