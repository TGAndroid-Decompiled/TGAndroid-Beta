package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ut implements qx {
    public final wt f40468a;

    public ut(wt wtVar) {
        this.f40468a = wtVar;
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
        wt wtVar = this.f40468a;
        if (wtVar.b()) {
            if (i7 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wtVar.f41729y = z10;
            wtVar.y();
            cu0 cu0Var = wtVar.f41723f;
            if (cu0Var != null) {
                cu0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        rt rtVar = this.f40468a.f41719a;
        if (rtVar.length() == 0) {
            return false;
        }
        rtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        rt rtVar = this.f40468a.f41719a;
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
        wt wtVar = this.f40468a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wtVar.getContext(), wtVar.N);
        String N0 = org.telegram.messenger.gd.N0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131752057, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new b0(this, 27));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        org.telegram.ui.ActionBar.g2 g2Var = wtVar.h;
        if (g2Var != null) {
            g2Var.showDialog(t1Var);
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f40468a.h;
        if (g2Var == null) {
            new ug.y0((org.telegram.ui.ActionBar.g2) new bi.e9(this, 6), 11, false).show();
        } else {
            g2Var.showDialog(new ug.y0(g2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        x5 x5Var;
        wt wtVar = this.f40468a;
        rt rtVar = wtVar.f41719a;
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
            x5Var.cacheType = wtVar.d.f39042c;
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
        return this.f40468a.f41729y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(j41 j41Var) {
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
