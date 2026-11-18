package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class wh implements TextWatcher {
    public final int f41715a;
    public boolean f41716b;
    public boolean f41717c;
    public final KeyEvent.Callback d;

    public wh(KeyEvent.Callback callback, int i7) {
        this.f41715a = i7;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f41715a) {
            case 0:
                si siVar = (si) this.d;
                n6 n6Var = siVar.f39727v1;
                vh vhVar = siVar.C2;
                n6 n6Var2 = siVar.f39723u1;
                if (this.f41717c != TextUtils.isEmpty(editable)) {
                    ki kiVar = siVar.f39732w2;
                    if (kiVar != null) {
                        kiVar.E(kiVar.getSelectedItemsCount());
                    }
                    this.f41717c = !this.f41717c;
                }
                boolean z13 = false;
                if (this.f41716b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, vhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f41716b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                siVar.G1 = codePointCount;
                te.a aVar = siVar.f39703p1;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10, true);
                int i10 = siVar.F1;
                if (i10 > 0 && (i7 = i10 - siVar.G1) <= 100) {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    String E = org.telegram.messenger.gd.E(j3, ',');
                    if (n6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    n6Var2.c(E, z12, true);
                    if (n6Var2.getVisibility() != 0) {
                        n6Var2.setVisibility(0);
                        n6Var2.setAlpha(0.0f);
                        n6Var2.setScaleX(0.5f);
                        n6Var2.setScaleY(0.5f);
                    }
                    n6Var2.animate().setListener(null).cancel();
                    n6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29615p7, siVar.J0);
                        z11 = false;
                    } else {
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29786y6, siVar.J0);
                        z11 = true;
                    }
                    n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
                    n6Var.setAlpha(1.0f);
                } else {
                    n6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x(this, 9));
                    n6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (siVar.S2 != z11) {
                    siVar.S2 = z11;
                    siVar.G2.invalidate();
                }
                if (!siVar.X1) {
                    if (vhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(vhVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    siVar.C1(z13);
                }
                siVar.R0(true);
                return;
            default:
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                if (this.f41716b) {
                    this.f41716b = false;
                    this.f41717c = true;
                    try {
                        editable.append('.');
                        this.f41717c = false;
                        caVar.f44007c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f41717c = false;
                        throw th2;
                    }
                }
                caVar.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f41715a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                org.telegram.ui.Wallet.y9 y9Var = caVar.f44007c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && y9Var.getLayout() != null) {
                    caVar.O = y9Var.getLayout().getLineLeft(0) - y9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        float f10;
        switch (this.f41715a) {
            case 0:
                si siVar = (si) this.d;
                if (i11 - i10 >= 1) {
                    this.f41716b = true;
                }
                if (siVar.C4 == null) {
                    si.L0(siVar);
                }
                if (siVar.C4.getAdapter() != null) {
                    siVar.C4.setReversed(false);
                    siVar.C4.getAdapter().U(charSequence, siVar.C2.getEditText().getSelectionStart(), null, false, false);
                    siVar.K1();
                    return;
                }
                return;
            default:
                boolean z11 = false;
                if (i11 > 0 && TextUtils.equals(charSequence, "0")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f41716b = z10;
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                if (!caVar.S && !this.f41717c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.m7 m7Var = caVar.d;
                        if (i11 > 0 && i11 >= i10) {
                            z11 = true;
                        }
                        if (m7Var.f44590y && m7Var.f44586r && m7Var.E == -1) {
                            ph0 ph0Var = m7Var.h;
                            if (ph0Var != null) {
                                if (!ph0Var.b()) {
                                    m7Var.h.setProgress(0.0f);
                                    m7Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f11 = m7Var.f44576e0;
                            if (z11) {
                                f10 = -160.0f;
                            } else {
                                f10 = 160.0f;
                            }
                            m7Var.f44576e0 = org.telegram.messenger.n10.A(f11, f10, 360.0f, -360.0f);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
