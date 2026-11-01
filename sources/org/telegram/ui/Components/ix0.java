package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class ix0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10 = org.telegram.messenger.e20.f15506s0;
        Context context = k2Var.getContext();
        vh.u1 u1Var = new vh.u1(context, p6Var, true, false);
        u1Var.f52013v1 = new ag.b0(i10, context, tL_messages_stickerSet, 9);
        if (k2Var.visibleDialog != null) {
            u1Var.show();
        } else {
            k2Var.showDialog(u1Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.p6 p6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
            String L0 = org.telegram.messenger.dd.L0(2131744877, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131744878, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new f2(19, runnable, stickerSet));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            x1Var.show();
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, p6Var);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.p6 p6Var, Context context, org.telegram.messenger.k20 k20Var) {
        boolean z10;
        int i10;
        float f7;
        int i11;
        int i12;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        if (stickerSet != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 2131751223;
        } else {
            i10 = 2131748279;
        }
        String L0 = org.telegram.messenger.dd.L0(i10, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131744882, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i13 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, p6Var);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, p6Var);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.t6.f21049jg, p6Var);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.t6.L6, p6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new ak(1, editTextBoldCursor)});
        org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, p6Var);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f10 = 0.0f;
        if (org.telegram.messenger.dd.X) {
            f7 = 28.0f;
        } else {
            f7 = 0.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        if (!org.telegram.messenger.dd.X) {
            f10 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, org.telegram.messenger.i0.L(f10), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (org.telegram.messenger.dd.X) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(numberTextView, w7.b6.d(26, 20.0f, i11 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new hx0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        x1Var.G = 4;
        if (z10) {
            i12 = 2131751355;
        } else {
            i12 = 2131751753;
        }
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(i12, null), new bi.o4((Object) editTextBoldCursor, k20Var, context, z10, 4));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new px(editTextBoldCursor, 23));
        org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder.p();
        p5.f21491j0 = false;
        editTextBoldCursor.setOnEditorActionListener(new t0(p5, 9));
    }
}
