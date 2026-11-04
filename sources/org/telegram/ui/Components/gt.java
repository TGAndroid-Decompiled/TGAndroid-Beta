package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gt implements fx {
    public final jt f34185a;

    public gt(jt jtVar) {
        this.f34185a = jtVar;
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
        jt jtVar = this.f34185a;
        if (jtVar.b()) {
            if (i3 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jtVar.f35198y = z10;
            jtVar.y();
            qt0 qt0Var = jtVar.f35192f;
            if (qt0Var != null) {
                qt0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        dt dtVar = this.f34185a.f35188a;
        if (dtVar.length() == 0) {
            return false;
        }
        dtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        dt dtVar = this.f34185a.f35188a;
        int selectionEnd = dtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, dtVar.getPaint().getFontMetricsInt(), false, null, 0);
            dtVar.setText(dtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            dtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n() {
        jt jtVar = this.f34185a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jtVar.getContext(), jtVar.N);
        String M0 = org.telegram.messenger.bd.M0(2131752068, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new t(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.d2 d2Var = jtVar.h;
        if (d2Var != null) {
            d2Var.showDialog(s1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f34185a.h;
        if (d2Var == null) {
            new vg.v0((org.telegram.ui.ActionBar.d2) new ai.c7(this, 6), 11, false).show();
        } else {
            d2Var.showDialog(new vg.v0(d2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        p5 p5Var;
        jt jtVar = this.f34185a;
        dt dtVar = jtVar.f35188a;
        int selectionEnd = dtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                p5Var = new p5(document, dtVar.getPaint().getFontMetricsInt());
            } else {
                p5Var = new p5(j10, dtVar.getPaint().getFontMetricsInt());
            }
            p5Var.cacheType = jtVar.d.f33525c;
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
            dtVar.setText(dtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            dtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f34185a.f35198y;
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
