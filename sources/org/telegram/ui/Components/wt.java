package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wt implements tx {
    public final yt f41892a;

    public wt(yt ytVar) {
        this.f41892a = ytVar;
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
        yt ytVar = this.f41892a;
        if (ytVar.b()) {
            if (i7 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ytVar.f42545y = z10;
            ytVar.y();
            du0 du0Var = ytVar.f42539f;
            if (du0Var != null) {
                du0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        tt ttVar = this.f41892a.f42535a;
        if (ttVar.length() == 0) {
            return false;
        }
        ttVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        tt ttVar = this.f41892a.f42535a;
        int selectionEnd = ttVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, ttVar.getPaint().getFontMetricsInt(), false, null, 0);
            ttVar.setText(ttVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            ttVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n() {
        yt ytVar = this.f41892a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ytVar.getContext(), ytVar.N);
        String N0 = org.telegram.messenger.hd.N0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131752057, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new c0(this, 27));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        org.telegram.ui.ActionBar.g2 g2Var = ytVar.h;
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f41892a.h;
        if (g2Var == null) {
            new ug.y0((org.telegram.ui.ActionBar.g2) new bi.b9(this, 6), 11, false).show();
        } else {
            g2Var.showDialog(new ug.y0(g2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        yt ytVar = this.f41892a;
        tt ttVar = ytVar.f42535a;
        int selectionEnd = ttVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new y5(document, ttVar.getPaint().getFontMetricsInt());
            } else {
                y5Var = new y5(j3, ttVar.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = ytVar.d.f40087c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            ttVar.setText(ttVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            ttVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f41892a.f42545y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(k41 k41Var) {
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
