package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ut implements rx {
    public final wt f40413a;

    public ut(wt wtVar) {
        this.f40413a = wtVar;
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
        wt wtVar = this.f40413a;
        if (wtVar.b()) {
            if (i7 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wtVar.f41796y = z10;
            wtVar.y();
            au0 au0Var = wtVar.f41790f;
            if (au0Var != null) {
                au0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        rt rtVar = this.f40413a.f41786a;
        if (rtVar.length() == 0) {
            return false;
        }
        rtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        rt rtVar = this.f40413a.f41786a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, rtVar.getPaint().getFontMetricsInt(), false, null, 0);
            rtVar.setText(rtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            rtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n() {
        wt wtVar = this.f40413a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wtVar.getContext(), wtVar.N);
        String M0 = org.telegram.messenger.gd.M0(2131752057, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752058, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new b0(this, 27));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        org.telegram.ui.ActionBar.h2 h2Var = wtVar.h;
        if (h2Var != null) {
            h2Var.showDialog(u1Var);
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
        org.telegram.ui.ActionBar.h2 h2Var = this.f40413a.h;
        if (h2Var == null) {
            new ug.z0((org.telegram.ui.ActionBar.h2) new bi.z8(this, 6), 11, false).show();
        } else {
            h2Var.showDialog(new ug.z0(h2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        x5 x5Var;
        wt wtVar = this.f40413a;
        rt rtVar = wtVar.f41786a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                x5Var = new x5(document, rtVar.getPaint().getFontMetricsInt());
            } else {
                x5Var = new x5(j3, rtVar.getPaint().getFontMetricsInt());
            }
            x5Var.cacheType = wtVar.d.f39340c;
            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
            rtVar.setText(rtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            rtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f40413a.f41796y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(h41 h41Var) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
