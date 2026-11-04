package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class eh implements TextWatcher {
    public final int f33393a;
    public boolean f33394b;
    public boolean f33395c;
    public final KeyEvent.Callback d;

    public eh(KeyEvent.Callback callback, int i3) {
        this.f33393a = i3;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i3;
        boolean z12;
        switch (this.f33393a) {
            case 0:
                bi biVar = (bi) this.d;
                h6 h6Var = biVar.f32270s1;
                dh dhVar = biVar.f32299z2;
                h6 h6Var2 = biVar.f32266r1;
                if (this.f33395c != TextUtils.isEmpty(editable)) {
                    th thVar = biVar.f32275t2;
                    if (thVar != null) {
                        thVar.D(thVar.getSelectedItemsCount());
                    }
                    this.f33395c = !this.f33395c;
                }
                boolean z13 = false;
                if (this.f33394b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.i6.l(editable, dhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f33394b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                biVar.D1 = codePointCount;
                qe.a aVar = biVar.m1;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10, true);
                int i10 = biVar.C1;
                if (i10 > 0 && (i3 = i10 - biVar.D1) <= 100) {
                    if (i3 < -9999) {
                        i3 = -9999;
                    }
                    long j10 = i3;
                    String E = org.telegram.messenger.bd.E(j10, ',');
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
                    if (i3 < 0) {
                        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.f28102p7, biVar.J0);
                        z11 = false;
                    } else {
                        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.f28273y6, biVar.J0);
                        z11 = true;
                    }
                    h6Var.c(org.telegram.messenger.bd.E(j10, ','), false, true);
                    h6Var.setAlpha(1.0f);
                } else {
                    h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 8));
                    h6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (biVar.P2 != z11) {
                    biVar.P2 = z11;
                    biVar.D2.invalidate();
                }
                if (!biVar.U1) {
                    if (dhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(dhVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    biVar.B1(z13);
                }
                biVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                if (this.f33394b) {
                    this.f33394b = false;
                    this.f33395c = true;
                    try {
                        editable.append('.');
                        this.f33395c = false;
                        l9Var.f42795c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f33395c = false;
                        throw th2;
                    }
                }
                l9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f33393a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                org.telegram.ui.Wallet.h9 h9Var = l9Var.f42795c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && h9Var.getLayout() != null) {
                    l9Var.O = h9Var.getLayout().getLineLeft(0) - h9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        boolean z10;
        float f10;
        switch (this.f33393a) {
            case 0:
                bi biVar = (bi) this.d;
                if (i11 - i10 >= 1) {
                    this.f33394b = true;
                }
                if (biVar.f32301z4 == null) {
                    bi.K0(biVar);
                }
                if (biVar.f32301z4.getAdapter() != null) {
                    biVar.f32301z4.setReversed(false);
                    biVar.f32301z4.getAdapter().U(charSequence, biVar.f32299z2.getEditText().getSelectionStart(), null, false, false);
                    biVar.J1();
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
                this.f33394b = z10;
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                if (!l9Var.S && !this.f33395c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.u6 u6Var = l9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z11 = true;
                        }
                        if (u6Var.f43267y && u6Var.f43263r && u6Var.E == -1) {
                            fh0 fh0Var = u6Var.h;
                            if (fh0Var != null) {
                                if (!fh0Var.b()) {
                                    u6Var.h.setProgress(0.0f);
                                    u6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f11 = u6Var.f43253e0;
                            if (z11) {
                                f10 = -160.0f;
                            } else {
                                f10 = 160.0f;
                            }
                            u6Var.f43253e0 = org.telegram.messenger.camera.q.z(f11, f10, 360.0f, -360.0f);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
