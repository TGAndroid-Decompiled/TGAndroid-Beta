package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class zh implements TextWatcher {
    public final int f33261a;
    public boolean f33262b;
    public boolean f33263c;
    public final KeyEvent.Callback d;

    public zh(KeyEvent.Callback callback, int i10) {
        this.f33261a = i10;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        switch (this.f33261a) {
            case 0:
                ri riVar = (ri) this.d;
                o6 o6Var = riVar.v;
                xh xhVar = riVar.H0;
                o6 o6Var2 = riVar.f30185s;
                if (this.f33263c != TextUtils.isEmpty(editable)) {
                    ji jiVar = riVar.B0;
                    if (jiVar != null) {
                        jiVar.D(jiVar.getSelectedItemsCount());
                    }
                    this.f33263c = !this.f33263c;
                }
                boolean z13 = false;
                if (this.f33262b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, xhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f33262b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                riVar.L = codePointCount;
                ne.b bVar = riVar.e;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.a(z10, true);
                int i11 = riVar.K;
                if (i11 > 0 && (i10 = i11 - riVar.L) <= 100) {
                    if (i10 < -9999) {
                        i10 = -9999;
                    }
                    long j10 = i10;
                    String formatNumber = LocaleController.formatNumber(j10, ',');
                    if (o6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o6Var2.c(formatNumber, z12, true);
                    if (o6Var2.getVisibility() != 0) {
                        o6Var2.setVisibility(0);
                        o6Var2.setAlpha(0.0f);
                        o6Var2.setScaleX(0.5f);
                        o6Var2.setScaleY(0.5f);
                    }
                    o6Var2.animate().setListener(null).cancel();
                    o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        int i12 = org.telegram.ui.ActionBar.k6.f21405p7;
                        g6Var2 = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.a0(o6Var2, i12, g6Var2);
                        z11 = false;
                    } else {
                        int i13 = org.telegram.ui.ActionBar.k6.f21572y6;
                        g6Var = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.a0(o6Var2, i13, g6Var);
                        z11 = true;
                    }
                    o6Var.c(LocaleController.formatNumber(j10, ','), false, true);
                    o6Var.setAlpha(1.0f);
                } else {
                    o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.pq(this, 9));
                    o6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (riVar.X0 != z11) {
                    riVar.X0 = z11;
                    riVar.L0.invalidate();
                }
                if (!riVar.f30136c0) {
                    if (xhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(xhVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    riVar.U1(z13);
                }
                riVar.i1(true);
                return;
            default:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.d;
                if (this.f33262b) {
                    this.f33262b = false;
                    this.f33263c = true;
                    try {
                        editable.append('.');
                        this.f33263c = false;
                        i9Var.f34613c.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f33263c = false;
                        throw th2;
                    }
                }
                i9Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f33261a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.d;
                org.telegram.ui.Wallet.e9 e9Var = i9Var.f34613c;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && e9Var.getLayout() != null) {
                    i9Var.N = e9Var.getLayout().getLineLeft(0) - e9Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        float f7;
        switch (this.f33261a) {
            case 0:
                ri riVar = (ri) this.d;
                if (i12 - i11 >= 1) {
                    this.f33262b = true;
                }
                if (riVar.H2 == null) {
                    ri.R(riVar);
                }
                if (riVar.H2.getAdapter() != null) {
                    riVar.H2.setReversed(false);
                    riVar.H2.getAdapter().U(charSequence, riVar.H0.getEditText().getSelectionStart(), null, false, false);
                    riVar.c2();
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
                this.f33262b = z10;
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.d;
                if (!i9Var.R && !this.f33263c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.m6 m6Var = i9Var.d;
                        if (i12 > 0 && i12 >= i11) {
                            z11 = true;
                        }
                        if (m6Var.f34879x && m6Var.f34876r && m6Var.f34880y == -1) {
                            ak0 ak0Var = m6Var.h;
                            if (ak0Var != null) {
                                if (!ak0Var.b()) {
                                    m6Var.h.setProgress(0.0f);
                                    m6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f10 = m6Var.f34865d0;
                            if (z11) {
                                f7 = -160.0f;
                            } else {
                                f7 = 160.0f;
                            }
                            m6Var.f34865d0 = Math.max(-360.0f, Math.min(360.0f, f10 + f7));
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
