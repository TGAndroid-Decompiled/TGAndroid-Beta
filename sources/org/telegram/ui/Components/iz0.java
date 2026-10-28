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
public abstract class iz0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = r2Var.getContext();
        fi.l2 l2Var = new fi.l2(context, u6Var, true, false);
        l2Var.E = new i2.z(i10, context, tL_messages_stickerSet, 10);
        if (r2Var.visibleDialog != null) {
            l2Var.show();
        } else {
            r2Var.showDialog(l2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.u6 u6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p1(26, runnable, stickerSet));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.show();
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, u6Var);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.u6 u6Var, Context context, Utilities.Callback2 callback2) {
        boolean z10;
        int i10;
        float f7;
        int i11;
        int i12;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
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
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i13 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i13, u6Var);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i13, u6Var);
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.y6.f23701vf, u6Var);
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.y6.L6, u6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new qk(1, editTextBoldCursor)});
        org.telegram.ui.ActionBar.f7.G(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23485k6, org.telegram.ui.ActionBar.y6.f23503l6, org.telegram.ui.ActionBar.y6.f23582p7, u6Var);
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
        numberTextView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(numberTextView, kb1.h(26, 20.0f, i11 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new hz0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        e2Var.G = 4;
        if (z10) {
            i12 = R.string.Done;
        } else {
            i12 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i12), new ea.b((Object) editTextBoldCursor, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(editTextBoldCursor, 26));
        org.telegram.ui.ActionBar.e2 p10 = alertDialog$Builder.p();
        p10.f22578j0 = false;
        editTextBoldCursor.setOnEditorActionListener(new d1(p10, 9));
    }
}
