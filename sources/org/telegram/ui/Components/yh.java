package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class yh implements TextWatcher {
    public final int f42414a;
    public boolean f42415b;
    public boolean f42416c;
    public final KeyEvent.Callback d;

    public yh(KeyEvent.Callback callback, int i7) {
        this.f42414a = i7;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f42414a) {
            case 0:
                ui uiVar = (ui) this.d;
                o6 o6Var = uiVar.f40420v1;
                xh xhVar = uiVar.C2;
                o6 o6Var2 = uiVar.f40416u1;
                if (this.f42416c != TextUtils.isEmpty(editable)) {
                    mi miVar = uiVar.f40425w2;
                    if (miVar != null) {
                        miVar.E(miVar.getSelectedItemsCount());
                    }
                    this.f42416c = !this.f42416c;
                }
                boolean z13 = false;
                if (this.f42415b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, xhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f42415b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                uiVar.G1 = codePointCount;
                te.a aVar = uiVar.f40396p1;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10, true);
                int i10 = uiVar.F1;
                if (i10 > 0 && (i7 = i10 - uiVar.G1) <= 100) {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    String E = org.telegram.messenger.hd.E(j3, ',');
                    if (o6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o6Var2.c(E, z12, true);
                    if (o6Var2.getVisibility() != 0) {
                        o6Var2.setVisibility(0);
                        o6Var2.setAlpha(0.0f);
                        o6Var2.setScaleX(0.5f);
                        o6Var2.setScaleY(0.5f);
                    }
                    o6Var2.animate().setListener(null).cancel();
                    o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.f29568p7, uiVar.J0);
                        z11 = false;
                    } else {
                        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.f29739y6, uiVar.J0);
                        z11 = true;
                    }
                    o6Var.c(org.telegram.messenger.hd.E(j3, ','), false, true);
                    o6Var.setAlpha(1.0f);
                } else {
                    o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y(this, 9));
                    o6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (uiVar.S2 != z11) {
                    uiVar.S2 = z11;
                    uiVar.G2.invalidate();
                }
                if (!uiVar.X1) {
                    if (xhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(xhVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    uiVar.C1(z13);
                }
                uiVar.R0(true);
                return;
            default:
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                if (this.f42415b) {
                    this.f42415b = false;
                    this.f42416c = true;
                    try {
                        editable.append('.');
                        this.f42416c = false;
                        caVar.f44017c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f42416c = false;
                        throw th2;
                    }
                }
                caVar.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f42414a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                org.telegram.ui.Wallet.y9 y9Var = caVar.f44017c;
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
        switch (this.f42414a) {
            case 0:
                ui uiVar = (ui) this.d;
                if (i11 - i10 >= 1) {
                    this.f42415b = true;
                }
                if (uiVar.C4 == null) {
                    ui.L0(uiVar);
                }
                if (uiVar.C4.getAdapter() != null) {
                    uiVar.C4.setReversed(false);
                    uiVar.C4.getAdapter().U(charSequence, uiVar.C2.getEditText().getSelectionStart(), null, false, false);
                    uiVar.K1();
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
                this.f42415b = z10;
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                if (!caVar.S && !this.f42416c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.m7 m7Var = caVar.d;
                        if (i11 > 0 && i11 >= i10) {
                            z11 = true;
                        }
                        if (m7Var.f44600y && m7Var.f44596r && m7Var.E == -1) {
                            rh0 rh0Var = m7Var.h;
                            if (rh0Var != null) {
                                if (!rh0Var.b()) {
                                    m7Var.h.setProgress(0.0f);
                                    m7Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f11 = m7Var.f44586e0;
                            if (z11) {
                                f10 = -160.0f;
                            } else {
                                f10 = 160.0f;
                            }
                            m7Var.f44586e0 = org.telegram.messenger.o10.A(f11, f10, 360.0f, -360.0f);
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
