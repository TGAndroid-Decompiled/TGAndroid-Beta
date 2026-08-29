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
public abstract class tx0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = o2Var.getContext();
        nh.k2 k2Var = new nh.k2(context, c6Var, true, false);
        k2Var.f17999y = new e3.d(i10, context, tL_messages_stickerSet, 7);
        if (o2Var.visibleDialog != null) {
            k2Var.show();
        } else {
            o2Var.showDialog(k2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j1(25, runnable, stickerSet));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var));
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Utilities.Callback2 callback2) {
        boolean z10;
        int i10;
        float f9;
        int i11;
        int i12;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i13 = org.telegram.ui.ActionBar.g6.f23169j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23392vf, c6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(rx0.this.getText()) || i16 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
            }
        }});
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23189k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23206l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, c6Var));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f10 = 0.0f;
        if (LocaleController.isRTL) {
            f9 = 28.0f;
        } else {
            f9 = 0.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        if (!LocaleController.isRTL) {
            f10 = 28.0f;
        }
        editTextBoldCursor.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(numberTextView, i7.f6.d(26, 20.0f, i11 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new sx0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        c2Var.C = 4;
        if (z10) {
            i12 = R.string.Done;
        } else {
            i12 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i12), new m9.b((Object) editTextBoldCursor, callback2, context, z10, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cv(editTextBoldCursor, 24));
        org.telegram.ui.ActionBar.c2 o10 = alertDialog$Builder.o();
        o10.f22784d0 = false;
        editTextBoldCursor.setOnEditorActionListener(new f1(o10, 8));
    }
}
