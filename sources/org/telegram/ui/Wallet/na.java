package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.ImageView;
public final class na implements TextWatcher {
    public final int f42850a;
    public final KeyEvent.Callback f42851b;

    public na(KeyEvent.Callback callback, int i7) {
        this.f42850a = i7;
        this.f42851b = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f42850a) {
            case 0:
                oa oaVar = (oa) this.f42851b;
                if (oaVar.f42925w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && oaVar.b()) {
                    oaVar.setError(false);
                }
                oaVar.e();
                oaVar.d();
                if (oaVar.f42917a.hasFocus()) {
                    oaVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable = oaVar.f42921f;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f42851b;
                ImageView imageView = l0Var.J;
                if (editable.length() > 0 && l0Var.T) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.messenger.g0.V3(imageView, z9, true);
                String obj = editable.toString();
                org.telegram.ui.g4 g4Var = l0Var.B0;
                String lowerCase = obj.toLowerCase();
                ai.e0 e0Var = g4Var.W0;
                if (e0Var != null) {
                    org.telegram.messenger.g0.r(e0Var);
                    g4Var.W0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    g4Var.E.clear();
                    g4Var.F = lowerCase;
                    g4Var.f45816u0[0].f47066c.D.clear();
                    g4Var.b0(false);
                    if (g4Var.f45816u0[0].f()) {
                        if (g4Var.f45816u0[0].getWebView() != null) {
                            org.telegram.ui.web.u0 webView = g4Var.f45816u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(g4Var, 9);
                            webView.findAllAsync("");
                            g4Var.f0();
                        }
                    } else {
                        g4Var.f45816u0[0].f47065b.g1();
                        g4Var.U(0);
                    }
                    g4Var.X0 = -1;
                    return;
                }
                int i7 = g4Var.X0 + 1;
                g4Var.X0 = i7;
                if (g4Var.f45816u0[0].f()) {
                    g4Var.b0(true);
                    if (g4Var.f45816u0[0].getWebView() != null) {
                        org.telegram.ui.web.u0 webView2 = g4Var.f45816u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(g4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        g4Var.f0();
                        return;
                    }
                    return;
                }
                ai.e0 e0Var2 = new ai.e0(g4Var, lowerCase, i7, 26);
                g4Var.W0 = e0Var2;
                org.telegram.messenger.g0.i3(e0Var2, 400L);
                return;
            case 2:
                sh.b bVar = (sh.b) this.f42851b;
                int length = bVar.f55166a.getText().length();
                te.a aVar = bVar.H;
                int i10 = bVar.f55176y;
                if (length > (i10 * 7) / 10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10, true);
                te.a aVar2 = bVar.I;
                if (length > i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar2.a(z11, true);
                bVar.f55170f.l(Integer.toString(i10 - length), false);
                return;
            case 3:
                vh.g gVar = (vh.g) this.f42851b;
                gVar.X0();
                gVar.U1 = editable.toString();
                gVar.V1.O(true);
                return;
            default:
                yg.k kVar = ((yg.l) this.f42851b).f59342c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    wg.a0 a0Var = ((wg.u) kVar).f57696a;
                    a0Var.f57573n2 = trim;
                    a0Var.k1(false, false);
                    a0Var.k1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f42850a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f42850a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
