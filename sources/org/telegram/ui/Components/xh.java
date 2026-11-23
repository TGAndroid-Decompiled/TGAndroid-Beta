package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class xh implements TextWatcher {
    public final int f42000a;
    public boolean f42001b;
    public boolean f42002c;
    public final KeyEvent.Callback d;

    public xh(KeyEvent.Callback callback, int i7) {
        this.f42000a = i7;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f42000a) {
            case 0:
                ti tiVar = (ti) this.d;
                n6 n6Var = tiVar.f40024v1;
                wh whVar = tiVar.C2;
                n6 n6Var2 = tiVar.f40020u1;
                if (this.f42002c != TextUtils.isEmpty(editable)) {
                    li liVar = tiVar.f40029w2;
                    if (liVar != null) {
                        liVar.D(liVar.getSelectedItemsCount());
                    }
                    this.f42002c = !this.f42002c;
                }
                boolean z13 = false;
                if (this.f42001b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, whVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f42001b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                tiVar.G1 = codePointCount;
                te.a aVar = tiVar.f40000p1;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10, true);
                int i10 = tiVar.F1;
                if (i10 > 0 && (i7 = i10 - tiVar.G1) <= 100) {
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
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29672p7, tiVar.J0);
                        z11 = false;
                    } else {
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29843y6, tiVar.J0);
                        z11 = true;
                    }
                    n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
                    n6Var.setAlpha(1.0f);
                } else {
                    n6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x(this, 9));
                    n6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (tiVar.S2 != z11) {
                    tiVar.S2 = z11;
                    tiVar.G2.invalidate();
                }
                if (!tiVar.X1) {
                    if (whVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(whVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    tiVar.C1(z13);
                }
                tiVar.R0(true);
                return;
            default:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.d;
                if (this.f42001b) {
                    this.f42001b = false;
                    this.f42002c = true;
                    try {
                        editable.append('.');
                        this.f42002c = false;
                        daVar.f44177c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f42002c = false;
                        throw th2;
                    }
                }
                daVar.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f42000a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.d;
                org.telegram.ui.Wallet.z9 z9Var = daVar.f44177c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && z9Var.getLayout() != null) {
                    daVar.O = z9Var.getLayout().getLineLeft(0) - z9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        float f10;
        switch (this.f42000a) {
            case 0:
                ti tiVar = (ti) this.d;
                if (i11 - i10 >= 1) {
                    this.f42001b = true;
                }
                if (tiVar.C4 == null) {
                    ti.L0(tiVar);
                }
                if (tiVar.C4.getAdapter() != null) {
                    tiVar.C4.setReversed(false);
                    tiVar.C4.getAdapter().U(charSequence, tiVar.C2.getEditText().getSelectionStart(), null, false, false);
                    tiVar.K1();
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
                this.f42001b = z10;
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.d;
                if (!daVar.S && !this.f42002c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.n7 n7Var = daVar.d;
                        if (i11 > 0 && i11 >= i10) {
                            z11 = true;
                        }
                        if (n7Var.f44774y && n7Var.f44770r && n7Var.E == -1) {
                            qh0 qh0Var = n7Var.h;
                            if (qh0Var != null) {
                                if (!qh0Var.b()) {
                                    n7Var.h.setProgress(0.0f);
                                    n7Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f11 = n7Var.f44760e0;
                            if (z11) {
                                f10 = -160.0f;
                            } else {
                                f10 = 160.0f;
                            }
                            n7Var.f44760e0 = org.telegram.messenger.m10.A(f11, f10, 360.0f, -360.0f);
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
