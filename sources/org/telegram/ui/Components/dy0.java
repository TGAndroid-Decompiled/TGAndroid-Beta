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
public abstract class dy0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = p2Var.getContext();
        ph.y1 y1Var = new ph.y1(context, f6Var, true, false);
        y1Var.f42611y = new e3.d(i10, context, tL_messages_stickerSet, 7);
        if (p2Var.visibleDialog != null) {
            y1Var.show();
        } else {
            p2Var.showDialog(y1Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new o1(24, runnable, stickerSet));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20141q7, f6Var));
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Utilities.Callback2 callback2) {
        boolean z4;
        int i10;
        float f10;
        int i11;
        int i12;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (stickerSet != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = R.string.EditStickerPack;
        } else {
            i10 = R.string.NewStickerPack;
        }
        String string = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = string;
        d2Var.Q = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i13 = org.telegram.ui.ActionBar.j6.f20012j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20234vf, f6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(by0.this.getText()) || i16 == 0) {
                        return "";
                    }
                    return charSequence;
                }
                return charSequence;
            }
        }});
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20031k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20049l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f11 = 0.0f;
        if (LocaleController.isRTL) {
            f10 = 28.0f;
        } else {
            f10 = 0.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (!LocaleController.isRTL) {
            f11 = 28.0f;
        }
        editTextBoldCursor.setPadding(dp, 0, AndroidUtilities.dp(f11), 0);
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
        frameLayout.addView(numberTextView, k7.b6.d(26, 20.0f, i11 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new cy0(numberTextView, editTextBoldCursor));
        if (z4) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        d2Var.D = 4;
        if (z4) {
            i12 = R.string.Done;
        } else {
            i12 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i12), new o9.b((Object) editTextBoldCursor, callback2, context, z4, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fv(editTextBoldCursor, 24));
        org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
        o10.f19591e0 = false;
        editTextBoldCursor.setOnEditorActionListener(new d1(o10, 8));
    }
}
