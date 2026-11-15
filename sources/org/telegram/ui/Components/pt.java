package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pt implements mx {
    public final rt f38408a;

    public pt(rt rtVar) {
        this.f38408a = rtVar;
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
        rt rtVar = this.f38408a;
        if (rtVar.b()) {
            if (i7 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rtVar.f39066y = z10;
            rtVar.y();
            st0 st0Var = rtVar.f39060f;
            if (st0Var != null) {
                st0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        mt mtVar = this.f38408a.f39056a;
        if (mtVar.length() == 0) {
            return false;
        }
        mtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        mt mtVar = this.f38408a.f39056a;
        int selectionEnd = mtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, mtVar.getPaint().getFontMetricsInt(), false, null, 0);
            mtVar.setText(mtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            mtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n() {
        rt rtVar = this.f38408a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, rtVar.getContext(), rtVar.N);
        String M0 = org.telegram.messenger.hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new s(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.e2 e2Var = rtVar.h;
        if (e2Var != null) {
            e2Var.showDialog(t1Var);
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
        org.telegram.ui.ActionBar.e2 e2Var = this.f38408a.h;
        if (e2Var == null) {
            new ug.x0((org.telegram.ui.ActionBar.e2) new bi.t6(this, 6), 11, false).show();
        } else {
            e2Var.showDialog(new ug.x0(e2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        p5 p5Var;
        rt rtVar = this.f38408a;
        mt mtVar = rtVar.f39056a;
        int selectionEnd = mtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                p5Var = new p5(document, mtVar.getPaint().getFontMetricsInt());
            } else {
                p5Var = new p5(j3, mtVar.getPaint().getFontMetricsInt());
            }
            p5Var.cacheType = rtVar.d.f36936c;
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
            mtVar.setText(mtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            mtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f38408a.f39066y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(x31 x31Var) {
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
