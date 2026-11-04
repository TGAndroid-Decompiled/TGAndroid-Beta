package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.ImageView;
public final class ma implements TextWatcher {
    public final int f42900a;
    public final KeyEvent.Callback f42901b;

    public ma(KeyEvent.Callback callback, int i3) {
        this.f42900a = i3;
        this.f42901b = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f42900a) {
            case 0:
                na naVar = (na) this.f42901b;
                if (naVar.f42968w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && naVar.b()) {
                    naVar.setError(false);
                }
                naVar.e();
                naVar.d();
                if (naVar.f42960a.hasFocus()) {
                    naVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable = naVar.f42964f;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f42901b;
                ImageView imageView = m0Var.K;
                if (editable.length() > 0 && m0Var.U) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.messenger.g0.V3(imageView, z10, true);
                String obj = editable.toString();
                org.telegram.ui.i4 i4Var = m0Var.C0;
                String lowerCase = obj.toLowerCase();
                ai.e3 e3Var = i4Var.X0;
                if (e3Var != null) {
                    org.telegram.messenger.g0.r(e3Var);
                    i4Var.X0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    i4Var.F.clear();
                    i4Var.G = lowerCase;
                    i4Var.f46100v0[0].f47084c.E.clear();
                    i4Var.b0(false);
                    if (i4Var.f46100v0[0].f()) {
                        if (i4Var.f46100v0[0].getWebView() != null) {
                            org.telegram.ui.web.t0 webView = i4Var.f46100v0[0].getWebView();
                            webView.J = new org.telegram.ui.b0(i4Var, 9);
                            webView.findAllAsync("");
                            i4Var.f0();
                        }
                    } else {
                        i4Var.f46100v0[0].f47083b.g1();
                        i4Var.U(0);
                    }
                    i4Var.Y0 = -1;
                    return;
                }
                int i3 = i4Var.Y0 + 1;
                i4Var.Y0 = i3;
                if (i4Var.f46100v0[0].f()) {
                    i4Var.b0(true);
                    if (i4Var.f46100v0[0].getWebView() != null) {
                        org.telegram.ui.web.t0 webView2 = i4Var.f46100v0[0].getWebView();
                        webView2.J = new org.telegram.ui.b0(i4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        i4Var.f0();
                        return;
                    }
                    return;
                }
                ai.e3 e3Var2 = new ai.e3(i4Var, lowerCase, i3, 27);
                i4Var.X0 = e3Var2;
                org.telegram.messenger.g0.i3(e3Var2, 400L);
                return;
            case 2:
                th.b bVar = (th.b) this.f42901b;
                int length = bVar.f55387a.getText().length();
                qe.a aVar = bVar.I;
                int i10 = bVar.f55397y;
                if (length > (i10 * 7) / 10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar.a(z11, true);
                qe.a aVar2 = bVar.J;
                if (length > i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                aVar2.a(z12, true);
                bVar.f55391f.l(Integer.toString(i10 - length), false);
                return;
            case 3:
                wh.h hVar = (wh.h) this.f42901b;
                hVar.X0();
                hVar.V1 = editable.toString();
                hVar.W1.O(true);
                return;
            default:
                zg.k kVar = ((zg.l) this.f42901b).f60505c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    xg.a0 a0Var = ((xg.u) kVar).f58763a;
                    a0Var.f58645o2 = trim;
                    a0Var.k1(false, false);
                    a0Var.k1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f42900a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f42900a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
