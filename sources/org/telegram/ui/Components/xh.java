package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class xh implements TextWatcher {
    public final int f34719a;
    public boolean f34720b;
    public boolean f34721c;
    public final KeyEvent.Callback d;

    public xh(KeyEvent.Callback callback, int i10) {
        this.f34719a = i10;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        switch (this.f34719a) {
            case 0:
                ti tiVar = (ti) this.d;
                s6 s6Var = tiVar.v;
                wh whVar = tiVar.H0;
                s6 s6Var2 = tiVar.f33060s;
                if (this.f34721c != TextUtils.isEmpty(editable)) {
                    li liVar = tiVar.B0;
                    if (liVar != null) {
                        liVar.D(liVar.getSelectedItemsCount());
                    }
                    this.f34721c = !this.f34721c;
                }
                boolean z13 = false;
                if (this.f34720b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, whVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f34720b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                tiVar.L = codePointCount;
                oe.b bVar = tiVar.e;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.a(z10, true);
                int i11 = tiVar.K;
                if (i11 > 0 && (i10 = i11 - tiVar.L) <= 100) {
                    if (i10 < -9999) {
                        i10 = -9999;
                    }
                    long j10 = i10;
                    String formatNumber = LocaleController.formatNumber(j10, ',');
                    if (s6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s6Var2.c(formatNumber, z12, true);
                    if (s6Var2.getVisibility() != 0) {
                        s6Var2.setVisibility(0);
                        s6Var2.setAlpha(0.0f);
                        s6Var2.setScaleX(0.5f);
                        s6Var2.setScaleY(0.5f);
                    }
                    s6Var2.animate().setListener(null).cancel();
                    s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        int i12 = org.telegram.ui.ActionBar.y6.f23581p7;
                        u6Var2 = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.Z(s6Var2, i12, u6Var2);
                        z11 = false;
                    } else {
                        int i13 = org.telegram.ui.ActionBar.y6.f23748y6;
                        u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, u6Var);
                        z11 = true;
                    }
                    s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
                    s6Var.setAlpha(1.0f);
                } else {
                    s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.qp(this, 10));
                    s6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (tiVar.X0 != z11) {
                    tiVar.X0 = z11;
                    tiVar.L0.invalidate();
                }
                if (!tiVar.f33011c0) {
                    if (whVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(whVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    tiVar.T1(z13);
                }
                tiVar.i1(true);
                return;
            default:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                if (this.f34720b) {
                    this.f34720b = false;
                    this.f34721c = true;
                    try {
                        editable.append('.');
                        this.f34721c = false;
                        h9Var.f36643c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f34721c = false;
                        throw th2;
                    }
                }
                h9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f34719a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                org.telegram.ui.Wallet.d9 d9Var = h9Var.f36643c;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && d9Var.getLayout() != null) {
                    h9Var.N = d9Var.getLayout().getLineLeft(0) - d9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        float f7;
        switch (this.f34719a) {
            case 0:
                ti tiVar = (ti) this.d;
                if (i12 - i11 >= 1) {
                    this.f34720b = true;
                }
                if (tiVar.H2 == null) {
                    ti.M(tiVar);
                }
                if (tiVar.H2.getAdapter() != null) {
                    tiVar.H2.setReversed(false);
                    tiVar.H2.getAdapter().U(charSequence, tiVar.H0.getEditText().getSelectionStart(), null, false, false);
                    tiVar.b2();
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
                this.f34720b = z10;
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                if (!h9Var.R && !this.f34721c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.l6 l6Var = h9Var.d;
                        if (i12 > 0 && i12 >= i11) {
                            z11 = true;
                        }
                        if (l6Var.f36866x && l6Var.f36863r && l6Var.f36867y == -1) {
                            ak0 ak0Var = l6Var.h;
                            if (ak0Var != null) {
                                if (!ak0Var.b()) {
                                    l6Var.h.setProgress(0.0f);
                                    l6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f10 = l6Var.f36852d0;
                            if (z11) {
                                f7 = -160.0f;
                            } else {
                                f7 = 160.0f;
                            }
                            l6Var.f36852d0 = org.telegram.messenger.vh.A(f10, f7, 360.0f, -360.0f);
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
