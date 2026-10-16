package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class ci implements TextWatcher {
    public final int f23731a;
    public boolean f23732b;
    public boolean f23733c;
    public final KeyEvent.Callback d;

    public ci(KeyEvent.Callback callback, int i10) {
        this.f23731a = i10;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f23731a) {
            case 0:
                vi viVar = (vi) this.d;
                s6 s6Var = viVar.v;
                ai aiVar = viVar.H0;
                s6 s6Var2 = viVar.f29711s;
                if (this.f23733c != TextUtils.isEmpty(editable)) {
                    ni niVar = viVar.B0;
                    if (niVar != null) {
                        niVar.E(niVar.getSelectedItemsCount());
                    }
                    this.f23733c = !this.f23733c;
                }
                boolean z13 = false;
                if (this.f23732b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, aiVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.f23732b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                viVar.L = codePointCount;
                ne.b bVar = viVar.e;
                if (codePointCount > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.a(z10, true);
                int i11 = viVar.K;
                if (i11 > 0 && (i10 = i11 - viVar.L) <= 100) {
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
                        s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19822p7));
                        z11 = false;
                    } else {
                        s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19988y6));
                        z11 = true;
                    }
                    s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
                    s6Var.setAlpha(1.0f);
                } else {
                    s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new l6(this, 7));
                    s6Var.setAlpha(0.0f);
                    z11 = true;
                }
                if (viVar.X0 != z11) {
                    viVar.X0 = z11;
                    viVar.L0.invalidate();
                }
                if (!viVar.f29662c0) {
                    if (aiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(aiVar.getText().toString().trim())) {
                        z13 = true;
                    }
                    viVar.Q1(z13);
                }
                viVar.f1(true);
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.d;
                if (this.f23732b) {
                    this.f23732b = false;
                    this.f23733c = true;
                    try {
                        editable.append('.');
                        this.f23733c = false;
                        i8Var.f33034b.setSelection(editable.length());
                        return;
                    } catch (Throwable th2) {
                        this.f23733c = false;
                        throw th2;
                    }
                }
                i8Var.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f23731a) {
            case 0:
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.d;
                org.telegram.ui.Wallet.e8 e8Var = i8Var.f33034b;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && e8Var.getLayout() != null) {
                    i8Var.M = e8Var.getLayout().getLineLeft(0) - e8Var.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        float f7;
        switch (this.f23731a) {
            case 0:
                vi viVar = (vi) this.d;
                if (i12 - i11 >= 1) {
                    this.f23732b = true;
                }
                if (viVar.E2 == null) {
                    vi.S(viVar);
                }
                if (viVar.E2.getAdapter() != null) {
                    viVar.E2.setReversed(false);
                    viVar.E2.getAdapter().U(charSequence, viVar.H0.getEditText().getSelectionStart(), null, false, false);
                    viVar.Y1();
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
                this.f23732b = z10;
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.d;
                if (!i8Var.Q && !this.f23733c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.c6 c6Var = i8Var.f33035c;
                        if (i12 > 0 && i12 >= i11) {
                            z11 = true;
                        }
                        if (c6Var.f32761x && c6Var.f32758r && c6Var.f32762y == -1) {
                            bk0 bk0Var = c6Var.h;
                            if (bk0Var != null) {
                                if (!bk0Var.b()) {
                                    c6Var.h.setProgress(0.0f);
                                    c6Var.h.d();
                                    return;
                                }
                                return;
                            }
                            float f10 = c6Var.f32747d0;
                            if (z11) {
                                f7 = -160.0f;
                            } else {
                                f7 = 160.0f;
                            }
                            c6Var.f32747d0 = Math.max(-360.0f, Math.min(360.0f, f10 + f7));
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
