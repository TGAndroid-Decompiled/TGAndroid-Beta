package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ut implements vx {
    public final wt f31083a;

    public ut(wt wtVar) {
        this.f31083a = wtVar;
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
    public final void i(int i10) {
        boolean z10;
        wt wtVar = this.f31083a;
        if (wtVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wtVar.f32317y = z10;
            wtVar.y();
            vu0 vu0Var = wtVar.f32311f;
            if (vu0Var != null) {
                vu0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        rt rtVar = this.f31083a.f32308a;
        if (rtVar.length() == 0) {
            return false;
        }
        rtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        rt rtVar = this.f31083a.f32308a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(str, rtVar.getPaint().getFontMetricsInt(), false, null, 0);
            rtVar.setText(rtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            rtVar.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void n() {
        wt wtVar = this.f31083a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wtVar.getContext(), wtVar.M);
        String L0 = org.telegram.messenger.dd.L0(2131752068, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new t(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        org.telegram.ui.ActionBar.k2 k2Var = wtVar.h;
        if (k2Var != null) {
            k2Var.showDialog(x1Var);
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
        org.telegram.ui.ActionBar.k2 k2Var = this.f31083a.h;
        if (k2Var == null) {
            new kg.i1((org.telegram.ui.ActionBar.k2) new kg.q1(this, 2), 11, false).show();
        } else {
            k2Var.showDialog(new kg.i1(k2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        o5 o5Var;
        wt wtVar = this.f31083a;
        rt rtVar = wtVar.f32308a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                o5Var = new o5(document, rtVar.getPaint().getFontMetricsInt());
            } else {
                o5Var = new o5(j10, rtVar.getPaint().getFontMetricsInt());
            }
            o5Var.cacheType = wtVar.d.f31941c;
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            rtVar.setText(rtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            rtVar.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f31083a.f32317y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(x41 x41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.gj gjVar, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
