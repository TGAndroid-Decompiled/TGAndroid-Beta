package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class hi implements TextWatcher {
    public final int f26777a;
    public boolean f26778b;
    public boolean f26779c;
    public final KeyEvent.Callback d;

    public hi(KeyEvent.Callback callback, int i10) {
        this.f26777a = i10;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f26777a) {
            case 0:
                aj ajVar = (aj) this.d;
                r6 r6Var = ajVar.v;
                fi fiVar = ajVar.H0;
                r6 r6Var2 = ajVar.f24381s;
                if (this.f26779c != TextUtils.isEmpty(editable)) {
                    si siVar = ajVar.B0;
                    if (siVar != null) {
                        siVar.E(siVar.getSelectedItemsCount());
                    }
                    this.f26779c = !this.f26779c;
                }
                boolean z13 = false;
                if (this.f26778b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, fiVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f26778b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                ajVar.L = codePointCount;
                me.b bVar = ajVar.f24337e;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.a(z10, true);
                int i11 = ajVar.K;
                if (i11 > 0 && (i10 = i11 - ajVar.L) <= 100) {
                    if (i10 < -9999) {
                        i10 = -9999;
                    }
                    long j3 = i10;
                    String formatNumber = LocaleController.formatNumber(j3, ',');
                    if (r6Var2.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    r6Var2.c(formatNumber, z12, true);
                    if (r6Var2.getVisibility() != 0) {
                        r6Var2.setVisibility(0);
                        r6Var2.setAlpha(0.0f);
                        r6Var2.setScaleX(0.5f);
                        r6Var2.setScaleY(0.5f);
                    }
                    r6Var2.animate().setListener(null).cancel();
                    r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        r6Var2.setTextColor(ajVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20780p7));
                        z11 = false;
                    } else {
                        r6Var2.setTextColor(ajVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20945y6));
                        z11 = true;
                    }
                    r6Var.c(LocaleController.formatNumber(j3, ','), false, true);
                    r6Var.setAlpha(1.0f);
                } else {
                    r6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new t8(this, 4));
                    r6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (ajVar.X0 != z11) {
                    ajVar.X0 = z11;
                    ajVar.L0.invalidate();
                }
                if (!ajVar.f24331c0) {
                    if (fiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fiVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    ajVar.Q1(z13);
                }
                ajVar.f1(true);
                return;
            default:
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) this.d;
                if (this.f26778b) {
                    this.f26778b = false;
                    this.f26779c = true;
                    try {
                        editable.append('.');
                        this.f26779c = false;
                        k8Var.f34981b.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f26779c = false;
                        throw th2;
                    }
                }
                k8Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f26777a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) this.d;
                org.telegram.ui.Wallet.g8 g8Var = k8Var.f34981b;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && g8Var.getLayout() != null) {
                    k8Var.M = g8Var.getLayout().getLineLeft(0) - g8Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        float f7;
        switch (this.f26777a) {
            case 0:
                aj ajVar = (aj) this.d;
                if (i12 - i11 >= 1) {
                    this.f26778b = true;
                }
                if (ajVar.E2 == null) {
                    aj.S(ajVar);
                }
                if (ajVar.E2.getAdapter() != null) {
                    ajVar.E2.setReversed(false);
                    ajVar.E2.getAdapter().U(charSequence, ajVar.H0.getEditText().getSelectionStart(), null, false, false);
                    ajVar.Y1();
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
                this.f26778b = z10;
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) this.d;
                if (!k8Var.Q && !this.f26779c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.e6 e6Var = k8Var.f34982c;
                        if (i12 > 0 && i12 >= i11) {
                            z11 = true;
                        }
                        if (e6Var.f34678x && e6Var.f34675r && e6Var.f34679y == -1) {
                            ik0 ik0Var = e6Var.h;
                            if (ik0Var != null) {
                                if (!ik0Var.b()) {
                                    e6Var.h.setProgress(0.0f);
                                    e6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f10 = e6Var.f34663d0;
                            if (z11) {
                                f7 = -160.0f;
                            } else {
                                f7 = 160.0f;
                            }
                            e6Var.f34663d0 = Math.max(-360.0f, Math.min(360.0f, f10 + f7));
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
