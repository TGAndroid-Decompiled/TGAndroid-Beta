package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class gh implements TextWatcher {
    public final int f33896a;
    public boolean f33897b;
    public boolean f33898c;
    public final KeyEvent.Callback d;

    public gh(KeyEvent.Callback callback, int i7) {
        this.f33896a = i7;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        switch (this.f33896a) {
            case 0:
                ci ciVar = (ci) this.d;
                i6 i6Var = ciVar.f32655u1;
                fh fhVar = ciVar.B2;
                i6 i6Var2 = ciVar.f32651t1;
                if (this.f33898c != TextUtils.isEmpty(editable)) {
                    uh uhVar = ciVar.f32660v2;
                    if (uhVar != null) {
                        uhVar.D(uhVar.getSelectedItemsCount());
                    }
                    this.f33898c = !this.f33898c;
                }
                boolean z12 = false;
                if (this.f33897b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.i6.l(editable, fhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f33897b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                ciVar.F1 = codePointCount;
                te.a aVar = ciVar.f32632o1;
                if (codePointCount > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                aVar.a(z9, true);
                int i10 = ciVar.E1;
                if (i10 > 0 && (i7 = i10 - ciVar.F1) <= 100) {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    String E = org.telegram.messenger.id.E(j3, ',');
                    if (i6Var2.getVisibility() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i6Var2.c(E, z11, true);
                    if (i6Var2.getVisibility() != 0) {
                        i6Var2.setVisibility(0);
                        i6Var2.setAlpha(0.0f);
                        i6Var2.setScaleX(0.5f);
                        i6Var2.setScaleY(0.5f);
                    }
                    i6Var2.animate().setListener(null).cancel();
                    i6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.f28111p7, ciVar.I0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.f28282y6, ciVar.I0);
                        z10 = true;
                    }
                    i6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
                    i6Var.setAlpha(1.0f);
                } else {
                    i6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y5(this, 8));
                    i6Var.setAlpha(0.0f);
                    z10 = true;
                }
                if (ciVar.R2 != z10) {
                    ciVar.R2 = z10;
                    ciVar.F2.invalidate();
                }
                if (!ciVar.W1) {
                    if (fhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fhVar.getText().toString().trim())) {
                        z12 = true;
                    }
                    ciVar.B1(z12);
                }
                ciVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) this.d;
                if (this.f33897b) {
                    this.f33897b = false;
                    this.f33898c = true;
                    try {
                        editable.append('.');
                        this.f33898c = false;
                        n9Var.f42869c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f33898c = false;
                        throw th2;
                    }
                }
                n9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f33896a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) this.d;
                org.telegram.ui.Wallet.j9 j9Var = n9Var.f42869c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && j9Var.getLayout() != null) {
                    n9Var.N = j9Var.getLayout().getLineLeft(0) - j9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9;
        float f10;
        switch (this.f33896a) {
            case 0:
                ci ciVar = (ci) this.d;
                if (i11 - i10 >= 1) {
                    this.f33897b = true;
                }
                if (ciVar.B4 == null) {
                    ci.K0(ciVar);
                }
                if (ciVar.B4.getAdapter() != null) {
                    ciVar.B4.setReversed(false);
                    ciVar.B4.getAdapter().U(charSequence, ciVar.B2.getEditText().getSelectionStart(), null, false, false);
                    ciVar.J1();
                    return;
                }
                return;
            default:
                boolean z10 = false;
                if (i11 > 0 && TextUtils.equals(charSequence, "0")) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f33897b = z9;
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) this.d;
                if (!n9Var.R && !this.f33898c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.x6 x6Var = n9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z10 = true;
                        }
                        if (x6Var.f43355y && x6Var.f43351r && x6Var.D == -1) {
                            ch0 ch0Var = x6Var.h;
                            if (ch0Var != null) {
                                if (!ch0Var.b()) {
                                    x6Var.h.setProgress(0.0f);
                                    x6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f11 = x6Var.f43339d0;
                            if (z10) {
                                f10 = -160.0f;
                            } else {
                                f10 = 160.0f;
                            }
                            x6Var.f43339d0 = org.telegram.messenger.camera.q.z(f11, f10, 360.0f, -360.0f);
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
