package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class gw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7 = org.telegram.messenger.m10.f24940t0;
        Context context = e2Var.getContext();
        hi.i2 i2Var = new hi.i2(context, e6Var, true, false);
        i2Var.f14415z1 = new ai.r1(i7, context, tL_messages_stickerSet, 9);
        if (e2Var.visibleDialog != null) {
            i2Var.show();
        } else {
            e2Var.showDialog(i2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            String M0 = org.telegram.messenger.hd.M0(2131744859, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131744860, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new f1(22, runnable, stickerSet));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            t1Var.show();
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, e6Var);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, org.telegram.messenger.s10 s10Var) {
        boolean z10;
        int i7;
        float f10;
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (stickerSet != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131751222;
        } else {
            i7 = 2131748262;
        }
        String M0 = org.telegram.messenger.hd.M0(i7, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131744864, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i12 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i12, e6Var);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i12, e6Var);
        org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
        org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 35, org.telegram.ui.ActionBar.j6.L6, e6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new gk(1, editTextBoldCursor)});
        org.telegram.ui.ActionBar.q6.F(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, e6Var);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f11 = 0.0f;
        if (org.telegram.messenger.hd.f24104a0) {
            f10 = 28.0f;
        } else {
            f10 = 0.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.hd.f24104a0) {
            f11 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        frameLayout.addView(numberTextView, c8.ja.d(26, 20.0f, i10 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new fw0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        t1Var.H = 4;
        if (z10) {
            i11 = 2131751354;
        } else {
            i11 = 2131751753;
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(i11, null), new a3.g((Object) editTextBoldCursor, s10Var, context, z10, 6));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new gx(editTextBoldCursor, 23));
        org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
        p10.f29639k0 = false;
        editTextBoldCursor.setOnEditorActionListener(new q0(p10, 9));
    }
}
