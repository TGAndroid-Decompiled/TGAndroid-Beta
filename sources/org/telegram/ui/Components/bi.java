package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class bi implements TextWatcher {
    public final int f24950a;
    public boolean f24951b;
    public boolean f24952c;
    public final KeyEvent.Callback d;

    public bi(KeyEvent.Callback callback, int i10) {
        this.f24950a = i10;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f24950a) {
            case 0:
                ti tiVar = (ti) this.d;
                q6 q6Var = tiVar.v;
                zh zhVar = tiVar.H0;
                q6 q6Var2 = tiVar.f30588s;
                if (this.f24952c != TextUtils.isEmpty(editable)) {
                    li liVar = tiVar.B0;
                    if (liVar != null) {
                        liVar.D(liVar.getSelectedItemsCount());
                    }
                    this.f24952c = !this.f24952c;
                }
                boolean z13 = false;
                if (this.f24951b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, zhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f24951b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                tiVar.L = codePointCount;
                ne.b bVar = tiVar.e;
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
                    if (q6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    q6Var2.c(formatNumber, z12, true);
                    if (q6Var2.getVisibility() != 0) {
                        q6Var2.setVisibility(0);
                        q6Var2.setAlpha(0.0f);
                        q6Var2.setScaleX(0.5f);
                        q6Var2.setScaleY(0.5f);
                    }
                    q6Var2.animate().setListener(null).cancel();
                    q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        q6Var2.setTextColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21214p7));
                        z11 = false;
                    } else {
                        q6Var2.setTextColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21381y6));
                        z11 = true;
                    }
                    q6Var.c(LocaleController.formatNumber(j10, ','), false, true);
                    q6Var.setAlpha(1.0f);
                } else {
                    q6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.nq(this, 9));
                    q6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (tiVar.X0 != z11) {
                    tiVar.X0 = z11;
                    tiVar.L0.invalidate();
                }
                if (!tiVar.f30539c0) {
                    if (zhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(zhVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    tiVar.Q1(z13);
                }
                tiVar.f1(true);
                return;
            default:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                if (this.f24951b) {
                    this.f24951b = false;
                    this.f24952c = true;
                    try {
                        editable.append('.');
                        this.f24952c = false;
                        h9Var.f34297b.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f24952c = false;
                        throw th2;
                    }
                }
                h9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f24950a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                org.telegram.ui.Wallet.d9 d9Var = h9Var.f34297b;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && d9Var.getLayout() != null) {
                    h9Var.M = d9Var.getLayout().getLineLeft(0) - d9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        float f7;
        switch (this.f24950a) {
            case 0:
                ti tiVar = (ti) this.d;
                if (i12 - i11 >= 1) {
                    this.f24951b = true;
                }
                if (tiVar.E2 == null) {
                    ti.S(tiVar);
                }
                if (tiVar.E2.getAdapter() != null) {
                    tiVar.E2.setReversed(false);
                    tiVar.E2.getAdapter().U(charSequence, tiVar.H0.getEditText().getSelectionStart(), null, false, false);
                    tiVar.Y1();
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
                this.f24951b = z10;
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                if (!h9Var.Q && !this.f24952c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.m6 m6Var = h9Var.f34298c;
                        if (i12 > 0 && i12 >= i11) {
                            z11 = true;
                        }
                        if (m6Var.f34539x && m6Var.f34536r && m6Var.f34540y == -1) {
                            yj0 yj0Var = m6Var.h;
                            if (yj0Var != null) {
                                if (!yj0Var.b()) {
                                    m6Var.h.setProgress(0.0f);
                                    m6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f10 = m6Var.f34525d0;
                            if (z11) {
                                f7 = -160.0f;
                            } else {
                                f7 = 160.0f;
                            }
                            m6Var.f34525d0 = Math.max(-360.0f, Math.min(360.0f, f10 + f7));
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
