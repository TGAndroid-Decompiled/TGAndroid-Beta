package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.zn0;
public final class i9 implements TextWatcher {
    public final int f44377a;
    public final Object f44378b;

    public i9(Object obj, int i7) {
        this.f44377a = i7;
        this.f44378b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f44377a) {
            case 0:
                return;
            case 1:
                ((da) this.f44378b).C0();
                return;
            case 2:
                final na naVar = (na) this.f44378b;
                ArrayList arrayList = naVar.f44683w;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = naVar.L;
                String str2 = null;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    naVar.L = null;
                }
                boolean z14 = false;
                if (naVar.F != 0) {
                    naVar.getConnectionsManager().cancelRequest(naVar.F, true);
                    naVar.F = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str = trim;
                } else {
                    str = null;
                }
                naVar.f44685y = str;
                if (str == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                naVar.E = str2;
                final int i7 = naVar.K + 1;
                naVar.K = i7;
                if (!TextUtils.isEmpty(trim) && naVar.f44685y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                naVar.M = z10;
                naVar.f44684x.g(null, true, false, false, false, 0L, false, 0, i7);
                hi.d dVar = naVar.f44673a0;
                if (dVar != null) {
                    if (naVar.f44685y != null) {
                        z14 = true;
                    }
                    dVar.setEnabled(z14);
                }
                if (!TextUtils.isEmpty(trim) && naVar.f44685y == null && naVar.E == null) {
                    naVar.j0(trim);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    na.f0(naVar, trim, i7);
                                    return;
                                default:
                                    na naVar2 = naVar;
                                    naVar2.L = null;
                                    jg.z1 z1Var = naVar2.f44684x;
                                    int i10 = i7;
                                    z1Var.h(trim, true, false, false, false, false, 0L, false, 0, i10, 0L, new zn0(naVar2, i10, 12));
                                    return;
                            }
                        }
                    };
                    naVar.L = runnable2;
                    org.telegram.messenger.g0.h3(runnable2, 300L);
                } else {
                    arrayList.clear();
                    naVar.f34671a.f35742g3.O(true);
                    final String str3 = naVar.E;
                    if (str3 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        na.f0(naVar, str3, i7);
                                        return;
                                    default:
                                        na naVar2 = naVar;
                                        naVar2.L = null;
                                        jg.z1 z1Var = naVar2.f44684x;
                                        int i10 = i7;
                                        z1Var.h(str3, true, false, false, false, false, 0L, false, 0, i10, 0L, new zn0(naVar2, i10, 12));
                                        return;
                                }
                            }
                        };
                        naVar.L = runnable3;
                        org.telegram.messenger.g0.h3(runnable3, 300L);
                    }
                }
                naVar.p0(true);
                return;
            case 3:
                db dbVar = (db) this.f44378b;
                if (dbVar.f44102w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && dbVar.b()) {
                    dbVar.setError(false);
                }
                dbVar.e();
                dbVar.d();
                if (dbVar.f44094a.hasFocus()) {
                    dbVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = dbVar.f44098f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f44378b;
                ImageView imageView = l0Var.K;
                if (editable.length() > 0 && l0Var.U) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.g0.T3(imageView, z11, true);
                String obj = editable.toString();
                org.telegram.ui.g4 g4Var = l0Var.C0;
                String lowerCase2 = obj.toLowerCase();
                ai.d1 d1Var = g4Var.X0;
                if (d1Var != null) {
                    org.telegram.messenger.g0.r(d1Var);
                    g4Var.X0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    g4Var.F.clear();
                    g4Var.G = lowerCase2;
                    g4Var.f47920v0[0].f49137c.E.clear();
                    g4Var.b0(false);
                    if (g4Var.f47920v0[0].f()) {
                        if (g4Var.f47920v0[0].getWebView() != null) {
                            org.telegram.ui.web.s0 webView = g4Var.f47920v0[0].getWebView();
                            webView.J = new org.telegram.ui.z(g4Var, 9);
                            webView.findAllAsync("");
                            g4Var.f0();
                        }
                    } else {
                        g4Var.f47920v0[0].f49136b.g1();
                        g4Var.U(0);
                    }
                    g4Var.Y0 = -1;
                    return;
                }
                int i10 = g4Var.Y0 + 1;
                g4Var.Y0 = i10;
                if (g4Var.f47920v0[0].f()) {
                    g4Var.b0(true);
                    if (g4Var.f47920v0[0].getWebView() != null) {
                        org.telegram.ui.web.s0 webView2 = g4Var.f47920v0[0].getWebView();
                        webView2.J = new org.telegram.ui.z(g4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        g4Var.f0();
                        return;
                    }
                    return;
                }
                ai.d1 d1Var2 = new ai.d1(g4Var, lowerCase2, i10, 29);
                g4Var.X0 = d1Var2;
                org.telegram.messenger.g0.h3(d1Var2, 400L);
                return;
            case 5:
                sh.b bVar = (sh.b) this.f44378b;
                int length = bVar.f57430a.getText().length();
                te.a aVar = bVar.I;
                int i11 = bVar.f57440y;
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
                bVar.f57434f.l(Integer.toString(i11 - length), false);
                return;
            case 6:
                vh.g gVar = (vh.g) this.f44378b;
                gVar.Y0();
                gVar.Y1 = editable.toString();
                gVar.Z1.O(true);
                return;
            default:
                yg.k kVar = ((yg.l) this.f44378b).f61254c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    wg.a0 a0Var = ((wg.u) kVar).f59836a;
                    a0Var.f59719r2 = trim2;
                    a0Var.l1(false, false);
                    a0Var.l1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f44377a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f44377a) {
            case 0:
                ((v4) this.f44378b).a(charSequence.toString());
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                return;
        }
    }

    private final void a(Editable editable) {
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

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
