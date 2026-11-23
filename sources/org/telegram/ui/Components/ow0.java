package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class ow0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7 = org.telegram.messenger.i10.f24637t0;
        Context context = g2Var.getContext();
        hi.r2 r2Var = new hi.r2(context, i6Var, true, false);
        r2Var.f15288z1 = new ai.o1(i7, context, tL_messages_stickerSet, 10);
        if (g2Var.visibleDialog != null) {
            r2Var.show();
        } else {
            g2Var.showDialog(r2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.i6 i6Var, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            String N0 = org.telegram.messenger.gd.N0(2131744618, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131744619, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new g2(21, runnable, stickerSet));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.show();
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, i6Var);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.i6 i6Var, Context context, org.telegram.messenger.p10 p10Var) {
        boolean z10;
        int i7;
        float f10;
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        if (stickerSet != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131751210;
        } else {
            i7 = 2131748069;
        }
        String N0 = org.telegram.messenger.gd.N0(i7, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131744623, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i12 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i12, i6Var);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i12, i6Var);
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.n6.f29624mg, i6Var);
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 35, org.telegram.ui.ActionBar.n6.L6, i6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new nk(1, editTextBoldCursor)});
        org.telegram.ui.ActionBar.u6.F(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29580k6, org.telegram.ui.ActionBar.n6.f29598l6, org.telegram.ui.ActionBar.n6.f29672p7, i6Var);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f11 = 0.0f;
        if (org.telegram.messenger.gd.f24314a0) {
            f10 = 28.0f;
        } else {
            f10 = 0.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.gd.f24314a0) {
            f11 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        frameLayout.addView(numberTextView, c8.na.d(26, 20.0f, i10 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new nw0(numberTextView, editTextBoldCursor));
        if (z10) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        t1Var.H = 4;
        if (z10) {
            i11 = 2131751342;
        } else {
            i11 = 2131751741;
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(i11, null), new a3.g((Object) editTextBoldCursor, p10Var, context, z10, 7));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new hy(editTextBoldCursor, 22));
        org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
        p10.f30093k0 = false;
        editTextBoldCursor.setOnEditorActionListener(new g(p10, 10));
    }
}
