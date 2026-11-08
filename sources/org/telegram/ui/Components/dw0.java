package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class dw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7 = org.telegram.messenger.p10.f24470s0;
        Context context = f2Var.getContext();
        fi.k2 k2Var = new fi.k2(context, f6Var, true, false);
        k2Var.f12263v1 = new jg.a2(i7, context, tL_messages_stickerSet, 8);
        if (f2Var.visibleDialog != null) {
            k2Var.show();
        } else {
            f2Var.showDialog(k2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
            String M0 = org.telegram.messenger.id.M0(2131744862, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131744863, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new f2(18, runnable, stickerSet));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var.show();
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, f6Var);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, org.telegram.messenger.v10 v10Var) {
        boolean z9;
        int i7;
        float f10;
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        if (stickerSet != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 2131751223;
        } else {
            i7 = 2131748263;
        }
        String M0 = org.telegram.messenger.id.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131744867, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i12 = org.telegram.ui.ActionBar.k6.f27960j5;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, f6Var);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, f6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.f27971jg, f6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.k6.L6, f6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new yj(1, editTextBoldCursor)});
        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27981k6, org.telegram.ui.ActionBar.k6.f27999l6, org.telegram.ui.ActionBar.k6.f28073p7, f6Var);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f11 = 0.0f;
        if (org.telegram.messenger.id.f23157a0) {
            f10 = 28.0f;
        } else {
            f10 = 0.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.id.f23157a0) {
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
        if (org.telegram.messenger.id.f23157a0) {
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
            i11 = 2131751355;
        } else {
            i11 = 2131751753;
        }
        alertDialog$Builder.k(org.telegram.messenger.id.M0(i11, null), new a3.g((Object) editTextBoldCursor, v10Var, context, z9, 6));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new bx(editTextBoldCursor, 23));
        org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
        p10.f28574j0 = false;
        editTextBoldCursor.setOnEditorActionListener(new t0(p10, 9));
    }
}
