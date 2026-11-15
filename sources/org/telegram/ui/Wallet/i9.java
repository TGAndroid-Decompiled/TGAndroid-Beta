package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.nb1;
public final class i9 implements TextWatcher {
    public final int f43994a;
    public final Object f43995b;

    public i9(Object obj, int i7) {
        this.f43994a = i7;
        this.f43995b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f43994a) {
            case 0:
                ((p9) this.f43995b).C0();
                return;
            case 1:
                final z9 z9Var = (z9) this.f43995b;
                ArrayList arrayList = z9Var.f44863w;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = z9Var.L;
                String str2 = null;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    z9Var.L = null;
                }
                boolean z14 = false;
                if (z9Var.F != 0) {
                    z9Var.getConnectionsManager().cancelRequest(z9Var.F, true);
                    z9Var.F = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str = trim;
                } else {
                    str = null;
                }
                z9Var.f44865y = str;
                if (str == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                z9Var.E = str2;
                final int i7 = z9Var.K + 1;
                z9Var.K = i7;
                if (!TextUtils.isEmpty(trim) && z9Var.f44865y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z9Var.M = z10;
                z9Var.f44864x.g(null, true, false, false, false, 0L, false, 0, i7);
                hi.d dVar = z9Var.f44853a0;
                if (dVar != null) {
                    if (z9Var.f44865y != null) {
                        z14 = true;
                    }
                    dVar.setEnabled(z14);
                }
                if (!TextUtils.isEmpty(trim) && z9Var.f44865y == null && z9Var.E == null) {
                    z9Var.j0(trim);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    z9.f0(z9Var, trim, i7);
                                    return;
                                default:
                                    z9 z9Var2 = z9Var;
                                    z9Var2.L = null;
                                    jg.z1 z1Var = z9Var2.f44864x;
                                    int i10 = i7;
                                    z1Var.h(trim, true, false, false, false, false, 0L, false, 0, i10, 0L, new nb1(z9Var2, i10, 7));
                                    return;
                            }
                        }
                    };
                    z9Var.L = runnable2;
                    org.telegram.messenger.g0.i3(runnable2, 300L);
                } else {
                    arrayList.clear();
                    z9Var.f38882a.f39895g3.O(true);
                    final String str3 = z9Var.E;
                    if (str3 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        z9.f0(z9Var, str3, i7);
                                        return;
                                    default:
                                        z9 z9Var2 = z9Var;
                                        z9Var2.L = null;
                                        jg.z1 z1Var = z9Var2.f44864x;
                                        int i10 = i7;
                                        z1Var.h(str3, true, false, false, false, false, 0L, false, 0, i10, 0L, new nb1(z9Var2, i10, 7));
                                        return;
                                }
                            }
                        };
                        z9Var.L = runnable3;
                        org.telegram.messenger.g0.i3(runnable3, 300L);
                    }
                }
                z9Var.p0(true);
                return;
            case 2:
                pa paVar = (pa) this.f43995b;
                if (paVar.f44372w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && paVar.b()) {
                    paVar.setError(false);
                }
                paVar.e();
                paVar.d();
                if (paVar.f44364a.hasFocus()) {
                    paVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = paVar.f44368f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f43995b;
                ImageView imageView = l0Var.K;
                if (editable.length() > 0 && l0Var.U) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.g0.U3(imageView, z11, true);
                String obj = editable.toString();
                org.telegram.ui.g4 g4Var = l0Var.C0;
                String lowerCase2 = obj.toLowerCase();
                ai.z0 z0Var = g4Var.X0;
                if (z0Var != null) {
                    org.telegram.messenger.g0.r(z0Var);
                    g4Var.X0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    g4Var.F.clear();
                    g4Var.G = lowerCase2;
                    g4Var.f47336v0[0].f48550c.E.clear();
                    g4Var.b0(false);
                    if (g4Var.f47336v0[0].f()) {
                        if (g4Var.f47336v0[0].getWebView() != null) {
                            org.telegram.ui.web.s0 webView = g4Var.f47336v0[0].getWebView();
                            webView.J = new org.telegram.ui.z(g4Var, 9);
                            webView.findAllAsync("");
                            g4Var.f0();
                        }
                    } else {
                        g4Var.f47336v0[0].f48549b.g1();
                        g4Var.U(0);
                    }
                    g4Var.Y0 = -1;
                    return;
                }
                int i10 = g4Var.Y0 + 1;
                g4Var.Y0 = i10;
                if (g4Var.f47336v0[0].f()) {
                    g4Var.b0(true);
                    if (g4Var.f47336v0[0].getWebView() != null) {
                        org.telegram.ui.web.s0 webView2 = g4Var.f47336v0[0].getWebView();
                        webView2.J = new org.telegram.ui.z(g4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        g4Var.f0();
                        return;
                    }
                    return;
                }
                ai.z0 z0Var2 = new ai.z0(g4Var, lowerCase2, i10, 29);
                g4Var.X0 = z0Var2;
                org.telegram.messenger.g0.i3(z0Var2, 400L);
                return;
            case 4:
                sh.b bVar = (sh.b) this.f43995b;
                int length = bVar.f56846a.getText().length();
                te.a aVar = bVar.I;
                int i11 = bVar.f56856y;
                if (length > (i11 * 7) / 10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                aVar.a(z12, true);
                te.a aVar2 = bVar.J;
                if (length > i11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                aVar2.a(z13, true);
                bVar.f56850f.l(Integer.toString(i11 - length), false);
                return;
            case 5:
                vh.h hVar = (vh.h) this.f43995b;
                hVar.X0();
                hVar.Y1 = editable.toString();
                hVar.Z1.O(true);
                return;
            default:
                yg.k kVar = ((yg.l) this.f43995b).f60676c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    wg.y yVar = ((wg.s) kVar).f59235a;
                    yVar.f59289r2 = trim2;
                    yVar.k1(false, false);
                    yVar.k1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f43994a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f43994a;
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

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
