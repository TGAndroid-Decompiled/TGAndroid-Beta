package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.ao0;
public final class j9 implements TextWatcher {
    public final int f44539a;
    public final Object f44540b;

    public j9(Object obj, int i7) {
        this.f44539a = i7;
        this.f44540b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        hi.o7 o7Var;
        boolean z14;
        long j3;
        long j10;
        long j11;
        int i7;
        int i10;
        int[] iArr;
        int i11;
        switch (this.f44539a) {
            case 0:
                return;
            case 1:
                ((ea) this.f44540b).C0();
                return;
            case 2:
                final oa oaVar = (oa) this.f44540b;
                ArrayList arrayList = oaVar.f44845w;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = oaVar.L;
                String str2 = null;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    oaVar.L = null;
                }
                boolean z15 = false;
                if (oaVar.F != 0) {
                    oaVar.getConnectionsManager().cancelRequest(oaVar.F, true);
                    oaVar.F = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str = trim;
                } else {
                    str = null;
                }
                oaVar.f44847y = str;
                if (str == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                oaVar.E = str2;
                final int i12 = oaVar.K + 1;
                oaVar.K = i12;
                if (!TextUtils.isEmpty(trim) && oaVar.f44847y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                oaVar.M = z10;
                oaVar.f44846x.g(null, true, false, false, false, 0L, false, 0, i12);
                hi.e eVar = oaVar.f44835a0;
                if (eVar != null) {
                    if (oaVar.f44847y != null) {
                        z15 = true;
                    }
                    eVar.setEnabled(z15);
                }
                if (!TextUtils.isEmpty(trim) && oaVar.f44847y == null && oaVar.E == null) {
                    oaVar.j0(trim);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    oa.f0(oaVar, trim, i12);
                                    return;
                                default:
                                    oa oaVar2 = oaVar;
                                    oaVar2.L = null;
                                    jg.z1 z1Var = oaVar2.f44846x;
                                    int i13 = i12;
                                    z1Var.h(trim, true, false, false, false, false, 0L, false, 0, i13, 0L, new ao0(oaVar2, i13, 12));
                                    return;
                            }
                        }
                    };
                    oaVar.L = runnable2;
                    org.telegram.messenger.g0.h3(runnable2, 300L);
                } else {
                    arrayList.clear();
                    oaVar.f34213a.f35323g3.O(true);
                    final String str3 = oaVar.E;
                    if (str3 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        oa.f0(oaVar, str3, i12);
                                        return;
                                    default:
                                        oa oaVar2 = oaVar;
                                        oaVar2.L = null;
                                        jg.z1 z1Var = oaVar2.f44846x;
                                        int i13 = i12;
                                        z1Var.h(str3, true, false, false, false, false, 0L, false, 0, i13, 0L, new ao0(oaVar2, i13, 12));
                                        return;
                                }
                            }
                        };
                        oaVar.L = runnable3;
                        org.telegram.messenger.g0.h3(runnable3, 300L);
                    }
                }
                oaVar.p0(true);
                return;
            case 3:
                eb ebVar = (eb) this.f44540b;
                if (ebVar.f44264w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && ebVar.b()) {
                    ebVar.setError(false);
                }
                ebVar.e();
                ebVar.d();
                if (ebVar.f44256a.hasFocus()) {
                    ebVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = ebVar.f44260f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f44540b;
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
                ai.e1 e1Var = g4Var.X0;
                if (e1Var != null) {
                    org.telegram.messenger.g0.r(e1Var);
                    g4Var.X0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    g4Var.F.clear();
                    g4Var.G = lowerCase2;
                    g4Var.f48084v0[0].f49289c.E.clear();
                    g4Var.b0(false);
                    if (g4Var.f48084v0[0].f()) {
                        if (g4Var.f48084v0[0].getWebView() != null) {
                            org.telegram.ui.web.s0 webView = g4Var.f48084v0[0].getWebView();
                            webView.J = new org.telegram.ui.z(g4Var, 9);
                            webView.findAllAsync("");
                            g4Var.f0();
                        }
                    } else {
                        g4Var.f48084v0[0].f49288b.g1();
                        g4Var.U(0);
                    }
                    g4Var.Y0 = -1;
                    return;
                }
                int i13 = g4Var.Y0 + 1;
                g4Var.Y0 = i13;
                if (g4Var.f48084v0[0].f()) {
                    g4Var.b0(true);
                    if (g4Var.f48084v0[0].getWebView() != null) {
                        org.telegram.ui.web.s0 webView2 = g4Var.f48084v0[0].getWebView();
                        webView2.J = new org.telegram.ui.z(g4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        g4Var.f0();
                        return;
                    }
                    return;
                }
                ai.e1 e1Var2 = new ai.e1(g4Var, lowerCase2, i13, 29);
                g4Var.X0 = e1Var2;
                org.telegram.messenger.g0.h3(e1Var2, 400L);
                return;
            case 5:
                sh.b bVar = (sh.b) this.f44540b;
                int length = bVar.f57541a.getText().length();
                te.a aVar = bVar.I;
                int i14 = bVar.f57551y;
                if (length > (i14 * 7) / 10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                aVar.a(z12, true);
                te.a aVar2 = bVar.J;
                if (length > i14) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                aVar2.a(z13, true);
                bVar.f57545f.l(Integer.toString(i14 - length), false);
                return;
            case 6:
                tg.d dVar = (tg.d) this.f44540b;
                if (!dVar.H0 && dVar.G0 && (o7Var = dVar.E0) != null) {
                    o7Var.f15161c = new SpannableStringBuilder(editable);
                    hi.o7 o7Var2 = dVar.E0;
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    int i16 = -1;
                    int i17 = 0;
                    while (true) {
                        int i18 = 1;
                        if (i17 <= editable.length()) {
                            if (i17 != editable.length() && !Character.isWhitespace(editable.charAt(i17))) {
                                i18 = 0;
                            }
                            if (i18 == 0 && i16 < 0) {
                                i16 = i17;
                            } else if (i18 != 0 && i16 >= 0) {
                                arrayList2.add(Integer.valueOf(i16));
                                arrayList2.add(Integer.valueOf(i17));
                                i16 = -1;
                            }
                            i17++;
                        } else {
                            int size = arrayList2.size() / 2;
                            int[] iArr2 = o7Var2.d;
                            if (iArr2 != null && iArr2.length == size * 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr2 != null && iArr2.length >= 4) {
                                j3 = iArr2[2];
                            } else {
                                j3 = o7Var2.f15159a;
                            }
                            if (iArr2 != null && iArr2.length >= 4) {
                                j10 = iArr2[iArr2.length - 1];
                            } else {
                                j10 = o7Var2.f15160b;
                            }
                            long max = Math.max(j3, j10);
                            int[] iArr3 = new int[size * 4];
                            while (i15 < size) {
                                int i19 = i15 * 4;
                                int i20 = i15 * 2;
                                iArr3[i19] = ((Integer) arrayList2.get(i20)).intValue();
                                iArr3[i19 + 1] = ((Integer) arrayList2.get(i20 + i18)).intValue();
                                int i21 = i19 + 2;
                                if (z14) {
                                    i7 = iArr2[i21];
                                    j11 = j3;
                                } else {
                                    j11 = j3;
                                    i7 = (int) ((((max - j3) * i15) / size) + j11);
                                }
                                iArr3[i21] = i7;
                                int i22 = i19 + 3;
                                if (z14) {
                                    i11 = iArr2[i22];
                                    i10 = i15;
                                    iArr = iArr2;
                                } else {
                                    i10 = i15;
                                    iArr = iArr2;
                                    i11 = (int) ((((max - j11) * (i15 + 1)) / size) + j11);
                                }
                                iArr3[i22] = i11;
                                i15 = i10 + 1;
                                iArr2 = iArr;
                                j3 = j11;
                                i18 = 1;
                            }
                            o7Var2.d = iArr3;
                            dVar.E0.f15162e = true;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 7:
                vh.g gVar = (vh.g) this.f44540b;
                gVar.Y0();
                gVar.Y1 = editable.toString();
                gVar.Z1.O(true);
                return;
            default:
                yg.k kVar = ((yg.l) this.f44540b).f61373c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    wg.z zVar = ((wg.t) kVar).f59931a;
                    zVar.f59985r2 = trim2;
                    zVar.l1(false, false);
                    zVar.l1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f44539a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f44539a) {
            case 0:
                ((w4) this.f44540b).a(charSequence.toString());
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
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

    private final void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
