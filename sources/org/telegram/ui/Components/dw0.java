package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class dw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7 = org.telegram.messenger.p10.f24474s0;
        Context context = f2Var.getContext();
        fi.k2 k2Var = new fi.k2(context, h6Var, true, false);
        k2Var.f12265y1 = new jg.a2(i7, context, tL_messages_stickerSet, 8);
        if (f2Var.visibleDialog != null) {
            k2Var.show();
        } else {
            f2Var.showDialog(k2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.h6 h6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            String M0 = org.telegram.messenger.id.M0(2131744859, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131744860, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new e2(18, runnable, stickerSet));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var.show();
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, h6Var);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.h6 h6Var, Context context, org.telegram.messenger.v10 v10Var) {
        boolean z9;
        int i7;
        float f10;
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        if (stickerSet != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 2131751222;
        } else {
            i7 = 2131748262;
        }
        String M0 = org.telegram.messenger.id.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131744864, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i12 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i12, h6Var);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.m6.f28009jg, h6Var);
        org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 35, org.telegram.ui.ActionBar.m6.L6, h6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new xj(1, editTextBoldCursor)});
        org.telegram.ui.ActionBar.t6.F(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f28019k6, org.telegram.ui.ActionBar.m6.f28037l6, org.telegram.ui.ActionBar.m6.f28111p7, h6Var);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f11 = 0.0f;
        if (org.telegram.messenger.id.f23161a0) {
            f10 = 28.0f;
        } else {
            f10 = 0.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.id.f23161a0) {
            f11 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        frameLayout.addView(numberTextView, c8.ha.d(26, 20.0f, i10 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new cw0(numberTextView, editTextBoldCursor));
        if (z9) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        u1Var.G = 4;
        if (z9) {
            i11 = 2131751354;
        } else {
            i11 = 2131751753;
        }
        alertDialog$Builder.k(org.telegram.messenger.id.M0(i11, null), new a3.g((Object) editTextBoldCursor, v10Var, context, z9, 6));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new ax(editTextBoldCursor, 23));
        org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
        p10.f28560j0 = false;
        editTextBoldCursor.setOnEditorActionListener(new s0(p10, 9));
    }
}
