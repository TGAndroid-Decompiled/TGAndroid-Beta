package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class eh implements TextWatcher {
    public final int f25833a;
    public boolean f25834b;
    public boolean f25835c;
    public final KeyEvent.Callback d;

    public eh(KeyEvent.Callback callback, int i10) {
        this.f25833a = i10;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f25833a) {
            case 0:
                bi biVar = (bi) this.d;
                f6 f6Var = biVar.f24807r1;
                dh dhVar = biVar.f24836y2;
                f6 f6Var2 = biVar.f24803q1;
                if (this.f25835c != TextUtils.isEmpty(editable)) {
                    uh uhVar = biVar.f24812s2;
                    if (uhVar != null) {
                        uhVar.D(uhVar.getSelectedItemsCount());
                    }
                    this.f25835c = !this.f25835c;
                }
                boolean z13 = false;
                if (this.f25834b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.k6.l(editable, dhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f25834b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                biVar.C1 = codePointCount;
                fe.b bVar = biVar.l1;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.a(z10, true);
                int i11 = biVar.B1;
                if (i11 > 0 && (i10 = i11 - biVar.C1) <= 100) {
                    if (i10 < -9999) {
                        i10 = -9999;
                    }
                    long j10 = i10;
                    String E = org.telegram.messenger.dd.E(j10, ',');
                    if (f6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f6Var2.c(E, z12, true);
                    if (f6Var2.getVisibility() != 0) {
                        f6Var2.setVisibility(0);
                        f6Var2.setAlpha(0.0f);
                        f6Var2.setScaleX(0.5f);
                        f6Var2.setScaleY(0.5f);
                    }
                    f6Var2.animate().setListener(null).cancel();
                    f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.f21154p7, biVar.I0);
                        z11 = false;
                    } else {
                        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.f21312y6, biVar.I0);
                        z11 = true;
                    }
                    f6Var.c(org.telegram.messenger.dd.E(j10, ','), false, true);
                    f6Var.setAlpha(1.0f);
                } else {
                    f6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new w5(this, 8));
                    f6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (biVar.O2 != z11) {
                    biVar.O2 = z11;
                    biVar.C2.invalidate();
                }
                if (!biVar.T1) {
                    if (dhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(dhVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    biVar.A1(z13);
                }
                biVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) this.d;
                if (this.f25834b) {
                    this.f25834b = false;
                    this.f25835c = true;
                    try {
                        editable.append('.');
                        this.f25835c = false;
                        q9Var.f35094c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f25835c = false;
                        throw th2;
                    }
                }
                q9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25833a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) this.d;
                org.telegram.ui.Wallet.m9 m9Var = q9Var.f35094c;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && m9Var.getLayout() != null) {
                    q9Var.N = m9Var.getLayout().getLineLeft(0) - m9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        float f7;
        switch (this.f25833a) {
            case 0:
                bi biVar = (bi) this.d;
                if (i12 - i11 >= 1) {
                    this.f25834b = true;
                }
                if (biVar.f24837y4 == null) {
                    bi.K0(biVar);
                }
                if (biVar.f24837y4.getAdapter() != null) {
                    biVar.f24837y4.setReversed(false);
                    biVar.f24837y4.getAdapter().U(charSequence, biVar.f24836y2.getEditText().getSelectionStart(), null, false, false);
                    biVar.I1();
                    return;
                }
                return;
            default:
                boolean z11 = false;
                if (i12 > 0 && TextUtils.equals(charSequence, "0")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25834b = z10;
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) this.d;
                if (!q9Var.R && !this.f25835c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.a7 a7Var = q9Var.d;
                        if (i12 > 0 && i12 >= i11) {
                            z11 = true;
                        }
                        if (a7Var.f34212y && a7Var.f34208r && a7Var.D == -1) {
                            fi0 fi0Var = a7Var.h;
                            if (fi0Var != null) {
                                if (!fi0Var.b()) {
                                    a7Var.h.setProgress(0.0f);
                                    a7Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f10 = a7Var.f34197d0;
                            if (z11) {
                                f7 = -160.0f;
                            } else {
                                f7 = 160.0f;
                            }
                            a7Var.f34197d0 = org.telegram.messenger.a30.z(f10, f7, 360.0f, -360.0f);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
