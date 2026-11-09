package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class hh implements TextWatcher {
    public final int f34296a;
    public boolean f34297b;
    public boolean f34298c;
    public final KeyEvent.Callback d;

    public hh(KeyEvent.Callback callback, int i7) {
        this.f34296a = i7;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        switch (this.f34296a) {
            case 0:
                di diVar = (di) this.d;
                j6 j6Var = diVar.f33042r1;
                gh ghVar = diVar.f33071y2;
                j6 j6Var2 = diVar.f33038q1;
                if (this.f34298c != TextUtils.isEmpty(editable)) {
                    vh vhVar = diVar.f33047s2;
                    if (vhVar != null) {
                        vhVar.D(vhVar.getSelectedItemsCount());
                    }
                    this.f34298c = !this.f34298c;
                }
                boolean z12 = false;
                if (this.f34297b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.i6.l(editable, ghVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f34297b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                diVar.C1 = codePointCount;
                te.a aVar = diVar.l1;
                if (codePointCount > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                aVar.a(z9, true);
                int i10 = diVar.B1;
                if (i10 > 0 && (i7 = i10 - diVar.C1) <= 100) {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    String E = org.telegram.messenger.id.E(j3, ',');
                    if (j6Var2.getVisibility() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j6Var2.c(E, z11, true);
                    if (j6Var2.getVisibility() != 0) {
                        j6Var2.setVisibility(0);
                        j6Var2.setAlpha(0.0f);
                        j6Var2.setScaleX(0.5f);
                        j6Var2.setScaleY(0.5f);
                    }
                    j6Var2.animate().setListener(null).cancel();
                    j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.f28086p7, diVar.I0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.f28257y6, diVar.I0);
                        z10 = true;
                    }
                    j6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
                    j6Var.setAlpha(1.0f);
                } else {
                    j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new z5(this, 8));
                    j6Var.setAlpha(0.0f);
                    z10 = true;
                }
                if (diVar.O2 != z10) {
                    diVar.O2 = z10;
                    diVar.C2.invalidate();
                }
                if (!diVar.T1) {
                    if (ghVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ghVar.getText().toString().trim())) {
                        z12 = true;
                    }
                    diVar.B1(z12);
                }
                diVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) this.d;
                if (this.f34297b) {
                    this.f34297b = false;
                    this.f34298c = true;
                    try {
                        editable.append('.');
                        this.f34298c = false;
                        k9Var.f42668c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f34298c = false;
                        throw th2;
                    }
                }
                k9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f34296a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) this.d;
                org.telegram.ui.Wallet.g9 g9Var = k9Var.f42668c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && g9Var.getLayout() != null) {
                    k9Var.N = g9Var.getLayout().getLineLeft(0) - g9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9;
        float f10;
        switch (this.f34296a) {
            case 0:
                di diVar = (di) this.d;
                if (i11 - i10 >= 1) {
                    this.f34297b = true;
                }
                if (diVar.f33073y4 == null) {
                    di.K0(diVar);
                }
                if (diVar.f33073y4.getAdapter() != null) {
                    diVar.f33073y4.setReversed(false);
                    diVar.f33073y4.getAdapter().U(charSequence, diVar.f33071y2.getEditText().getSelectionStart(), null, false, false);
                    diVar.J1();
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
                this.f34297b = z9;
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) this.d;
                if (!k9Var.R && !this.f34298c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.u6 u6Var = k9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z10 = true;
                        }
                        if (u6Var.f43196y && u6Var.f43192r && u6Var.D == -1) {
                            dh0 dh0Var = u6Var.h;
                            if (dh0Var != null) {
                                if (!dh0Var.b()) {
                                    u6Var.h.setProgress(0.0f);
                                    u6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f11 = u6Var.f43180d0;
                            if (z10) {
                                f10 = -160.0f;
                            } else {
                                f10 = 160.0f;
                            }
                            u6Var.f43180d0 = org.telegram.messenger.camera.q.z(f11, f10, 360.0f, -360.0f);
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
