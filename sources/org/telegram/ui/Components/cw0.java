package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class cw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3 = org.telegram.messenger.h10.f22829t0;
        Context context = d2Var.getContext();
        gi.i2 i2Var = new gi.i2(context, e6Var, true, false);
        i2Var.f12962w1 = new k2.y(i3, context, tL_messages_stickerSet, 10);
        if (d2Var.visibleDialog != null) {
            i2Var.show();
        } else {
            d2Var.showDialog(i2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            String M0 = org.telegram.messenger.bd.M0(2131744869, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131744870, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.jo(runnable, stickerSet));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var.show();
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, e6Var);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, org.telegram.messenger.n10 n10Var) {
        boolean z10;
        int i3;
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
            i3 = 2131751223;
        } else {
            i3 = 2131748270;
        }
        String M0 = org.telegram.messenger.bd.M0(i3, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131744874, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i12 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, e6Var);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, e6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.k6.L6, e6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new xj(1, editTextBoldCursor)});
        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, e6Var);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f11 = 0.0f;
        if (org.telegram.messenger.bd.f21784a0) {
            f10 = 28.0f;
        } else {
            f10 = 0.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.bd.f21784a0) {
            f11 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        frameLayout.addView(numberTextView, b8.mf.d(26, 20.0f, i10 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new bw0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        s1Var.H = 4;
        if (z10) {
            i11 = 2131751355;
        } else {
            i11 = 2131751753;
        }
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(i11, null), new ga.b((Object) editTextBoldCursor, n10Var, context, z10, 5));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new zw(editTextBoldCursor, 23));
        org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
        p10.f28548k0 = false;
        editTextBoldCursor.setOnEditorActionListener(new s0(p10, 9));
    }
}
