package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class fi implements TextWatcher {
    public final int f26421a;
    public boolean f26422b;
    public boolean f26423c;
    public final KeyEvent.Callback d;

    public fi(KeyEvent.Callback callback, int i10) {
        this.f26421a = i10;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f26421a) {
            case 0:
                yi yiVar = (yi) this.d;
                r6 r6Var = yiVar.v;
                di diVar = yiVar.H0;
                r6 r6Var2 = yiVar.f33274s;
                if (this.f26423c != TextUtils.isEmpty(editable)) {
                    qi qiVar = yiVar.B0;
                    if (qiVar != null) {
                        qiVar.E(qiVar.getSelectedItemsCount());
                    }
                    this.f26423c = !this.f26423c;
                }
                boolean z13 = false;
                if (this.f26422b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, diVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f26422b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                yiVar.L = codePointCount;
                me.b bVar = yiVar.f33230e;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.a(z10, true);
                int i11 = yiVar.K;
                if (i11 > 0 && (i10 = i11 - yiVar.L) <= 100) {
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
                        r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21022p7));
                        z11 = false;
                    } else {
                        r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21185y6));
                        z11 = true;
                    }
                    r6Var.c(LocaleController.formatNumber(j3, ','), false, true);
                    r6Var.setAlpha(1.0f);
                } else {
                    r6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new t8(this, 4));
                    r6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (yiVar.X0 != z11) {
                    yiVar.X0 = z11;
                    yiVar.L0.invalidate();
                }
                if (!yiVar.f33224c0) {
                    if (diVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(diVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    yiVar.Q1(z13);
                }
                yiVar.f1(true);
                return;
            default:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.d;
                if (this.f26422b) {
                    this.f26422b = false;
                    this.f26423c = true;
                    try {
                        editable.append('.');
                        this.f26423c = false;
                        j8Var.f35143b.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f26423c = false;
                        throw th2;
                    }
                }
                j8Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f26421a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.d;
                org.telegram.ui.Wallet.f8 f8Var = j8Var.f35143b;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && f8Var.getLayout() != null) {
                    j8Var.M = f8Var.getLayout().getLineLeft(0) - f8Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        float f7;
        switch (this.f26421a) {
            case 0:
                yi yiVar = (yi) this.d;
                if (i12 - i11 >= 1) {
                    this.f26422b = true;
                }
                if (yiVar.E2 == null) {
                    yi.S(yiVar);
                }
                if (yiVar.E2.getAdapter() != null) {
                    yiVar.E2.setReversed(false);
                    yiVar.E2.getAdapter().U(charSequence, yiVar.H0.getEditText().getSelectionStart(), null, false, false);
                    yiVar.Y1();
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
                this.f26422b = z10;
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.d;
                if (!j8Var.Q && !this.f26423c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.d6 d6Var = j8Var.f35144c;
                        if (i12 > 0 && i12 >= i11) {
                            z11 = true;
                        }
                        if (d6Var.f34839x && d6Var.f34836r && d6Var.f34840y == -1) {
                            gk0 gk0Var = d6Var.h;
                            if (gk0Var != null) {
                                if (!gk0Var.b()) {
                                    d6Var.h.setProgress(0.0f);
                                    d6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f10 = d6Var.f34824d0;
                            if (z11) {
                                f7 = -160.0f;
                            } else {
                                f7 = 160.0f;
                            }
                            d6Var.f34824d0 = Math.max(-360.0f, Math.min(360.0f, f10 + f7));
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
