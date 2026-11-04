package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gm implements fx {
    public final an f34151a;

    public gm(an anVar) {
        this.f34151a = anVar;
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
    public final void i(int i3) {
        boolean z10;
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        an anVar = this.f34151a;
        anVar.f31921i1 = z10;
        anVar.f38416b.f32249m3.requestLayout();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.z5 z5Var = this.f34151a.f31919h1;
        if (z5Var == null || (editField = z5Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.z5 z5Var = this.f34151a.f31919h1;
        if (z5Var == null || (editField = z5Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n() {
        an anVar = this.f34151a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getContext(), anVar.f38415a);
        String M0 = org.telegram.messenger.bd.M0(2131752068, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new t(this, 24));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        EditTextBoldCursor editField;
        p5 p5Var;
        org.telegram.ui.Cells.z5 z5Var = this.f34151a.f31919h1;
        if (z5Var == null || (editField = z5Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                p5Var = new p5(document, editField.getPaint().getFontMetricsInt());
            } else {
                p5Var = new p5(j10, editField.getPaint().getFontMetricsInt());
            }
            p5Var.cacheType = 3;
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean z() {
        return this.f34151a.f31921i1;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(n31 n31Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i3) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j10) {
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, int i3) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
    }
}
