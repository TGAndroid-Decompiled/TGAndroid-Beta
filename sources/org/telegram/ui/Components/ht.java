package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ht implements hx {
    public final kt f34400a;

    public ht(kt ktVar) {
        this.f34400a = ktVar;
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
        boolean z9;
        kt ktVar = this.f34400a;
        if (ktVar.b()) {
            if (i7 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ktVar.f35417y = z9;
            ktVar.y();
            rt0 rt0Var = ktVar.f35411f;
            if (rt0Var != null) {
                rt0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        et etVar = this.f34400a.f35407a;
        if (etVar.length() == 0) {
            return false;
        }
        etVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        et etVar = this.f34400a.f35407a;
        int selectionEnd = etVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, etVar.getPaint().getFontMetricsInt(), false, null, 0);
            etVar.setText(etVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            etVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n() {
        kt ktVar = this.f34400a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ktVar.getContext(), ktVar.M);
        String M0 = org.telegram.messenger.hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new u(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.f2 f2Var = ktVar.h;
        if (f2Var != null) {
            f2Var.showDialog(u1Var);
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
        org.telegram.ui.ActionBar.f2 f2Var = this.f34400a.h;
        if (f2Var == null) {
            new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4(this, 5), 11, false).show();
        } else {
            f2Var.showDialog(new ug.w0(f2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        r5 r5Var;
        kt ktVar = this.f34400a;
        et etVar = ktVar.f35407a;
        int selectionEnd = etVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                r5Var = new r5(document, etVar.getPaint().getFontMetricsInt());
            } else {
                r5Var = new r5(j3, etVar.getPaint().getFontMetricsInt());
            }
            r5Var.cacheType = ktVar.d.f34030c;
            spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
            etVar.setText(etVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            etVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f34400a.f35417y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(t31 t31Var) {
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
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
