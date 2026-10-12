package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class yy0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = m2Var.getContext();
        di.r2 r2Var = new di.r2(context, c6Var, true, false);
        r2Var.f7696y = new hg.b2(i10, context, tL_messages_stickerSet, 10);
        if (m2Var.visibleDialog != null) {
            r2Var.show();
        } else {
            m2Var.showDialog(r2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new t2(20, runnable, stickerSet));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, c6Var));
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Utilities.Callback2 callback2) {
        boolean z10;
        int i10;
        float f7;
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
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = string;
        a2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i13 = org.telegram.ui.ActionBar.g6.f20007j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20242vf, c6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new tk(1, editTextBoldCursor)});
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20028k6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20045l6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20122p7, c6Var));
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
        numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(numberTextView, w7.a6.a(20.0f, 0.0f, 2.0f, 4.0f, 0.0f, 26, i11 | 16));
        editTextBoldCursor.addTextChangedListener(new xy0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        a2Var.G = 4;
        if (z10) {
            i12 = R.string.Done;
        } else {
            i12 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i12), new da.b((Object) editTextBoldCursor, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xv(editTextBoldCursor, 25));
        org.telegram.ui.ActionBar.a2 o10 = alertDialog$Builder.o();
        o10.f19570h0 = false;
        editTextBoldCursor.setOnEditorActionListener(new e1(o10, 9));
    }
}
