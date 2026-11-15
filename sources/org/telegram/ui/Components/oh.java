package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class oh implements TextWatcher {
    public final int f37953a;
    public boolean f37954b;
    public boolean f37955c;
    public final KeyEvent.Callback d;

    public oh(KeyEvent.Callback callback, int i7) {
        this.f37953a = i7;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f37953a) {
            case 0:
                ki kiVar = (ki) this.d;
                h6 h6Var = kiVar.f36504v1;
                nh nhVar = kiVar.C2;
                h6 h6Var2 = kiVar.f36500u1;
                if (this.f37955c != TextUtils.isEmpty(editable)) {
                    ci ciVar = kiVar.f36509w2;
                    if (ciVar != null) {
                        ciVar.D(ciVar.getSelectedItemsCount());
                    }
                    this.f37955c = !this.f37955c;
                }
                boolean z13 = false;
                if (this.f37954b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, nhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f37954b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                kiVar.G1 = codePointCount;
                te.a aVar = kiVar.f36480p1;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10, true);
                int i10 = kiVar.F1;
                if (i10 > 0 && (i7 = i10 - kiVar.G1) <= 100) {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    String E = org.telegram.messenger.hd.E(j3, ',');
                    if (h6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h6Var2.c(E, z12, true);
                    if (h6Var2.getVisibility() != 0) {
                        h6Var2.setVisibility(0);
                        h6Var2.setAlpha(0.0f);
                        h6Var2.setScaleX(0.5f);
                        h6Var2.setScaleY(0.5f);
                    }
                    h6Var2.animate().setListener(null).cancel();
                    h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.f29070p7, kiVar.J0);
                        z11 = false;
                    } else {
                        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.f29241y6, kiVar.J0);
                        z11 = true;
                    }
                    h6Var.c(org.telegram.messenger.hd.E(j3, ','), false, true);
                    h6Var.setAlpha(1.0f);
                } else {
                    h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 8));
                    h6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (kiVar.S2 != z11) {
                    kiVar.S2 = z11;
                    kiVar.G2.invalidate();
                }
                if (!kiVar.X1) {
                    if (nhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(nhVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    kiVar.B1(z13);
                }
                kiVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.d;
                if (this.f37954b) {
                    this.f37954b = false;
                    this.f37955c = true;
                    try {
                        editable.append('.');
                        this.f37955c = false;
                        o9Var.f44275c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f37955c = false;
                        throw th2;
                    }
                }
                o9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f37953a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.d;
                org.telegram.ui.Wallet.k9 k9Var = o9Var.f44275c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && k9Var.getLayout() != null) {
                    o9Var.O = k9Var.getLayout().getLineLeft(0) - k9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        float f10;
        switch (this.f37953a) {
            case 0:
                ki kiVar = (ki) this.d;
                if (i11 - i10 >= 1) {
                    this.f37954b = true;
                }
                if (kiVar.C4 == null) {
                    ki.K0(kiVar);
                }
                if (kiVar.C4.getAdapter() != null) {
                    kiVar.C4.setReversed(false);
                    kiVar.C4.getAdapter().U(charSequence, kiVar.C2.getEditText().getSelectionStart(), null, false, false);
                    kiVar.J1();
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
                this.f37954b = z10;
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.d;
                if (!o9Var.S && !this.f37955c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.w6 w6Var = o9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z11 = true;
                        }
                        if (w6Var.f44654y && w6Var.f44650r && w6Var.E == -1) {
                            fh0 fh0Var = w6Var.h;
                            if (fh0Var != null) {
                                if (!fh0Var.b()) {
                                    w6Var.h.setProgress(0.0f);
                                    w6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f11 = w6Var.f44640e0;
                            if (z11) {
                                f10 = -160.0f;
                            } else {
                                f10 = 160.0f;
                            }
                            w6Var.f44640e0 = org.telegram.messenger.i20.z(f11, f10, 360.0f, -360.0f);
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
