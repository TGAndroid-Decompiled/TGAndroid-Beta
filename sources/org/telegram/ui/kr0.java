package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kr0 implements org.telegram.ui.Components.tx {
    public final qr0 f49346a;

    public kr0(qr0 qr0Var) {
        this.f49346a = qr0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(int i7) {
        boolean z10;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qr0 qr0Var = this.f49346a;
        qr0Var.C0 = z10;
        qr0Var.f51288e.requestLayout();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        EditTextBoldCursor editField = this.f49346a.f51286c0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        EditTextBoldCursor editField = this.f49346a.f51286c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.h6 h6Var;
        qr0 qr0Var = this.f49346a;
        Activity parentActivity = qr0Var.getParentActivity();
        h6Var = ((org.telegram.ui.ActionBar.g2) qr0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, h6Var);
        String N0 = org.telegram.messenger.hd.N0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131752057, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new qi0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.y5 y5Var;
        qr0 qr0Var = this.f49346a;
        EditTextBoldCursor editField = qr0Var.f51286c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new org.telegram.ui.Components.y5(document, editField.getPaint().getFontMetricsInt());
            } else {
                y5Var = new org.telegram.ui.Components.y5(j3, editField.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = qr0Var.S.f40069c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean z() {
        return this.f49346a.C0;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(org.telegram.ui.Components.k41 k41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i7) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j3) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
