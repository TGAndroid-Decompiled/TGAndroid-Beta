package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public class ju extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ov0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.p1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.e6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.l7 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final eu f25419a;
    public final hg.l f25420b;
    public final ql0 f25421c;
    public fu d;
    public boolean e;
    public pv0 f25422f;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f25423n;
    public int f25424r;
    public int f25425s;
    public boolean v;
    public int f25426w;
    public boolean f25427x;
    public boolean f25428y;

    public ju(Context context, org.telegram.ui.hd hdVar, org.telegram.ui.wo woVar) {
        this(context, hdVar, woVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f25425s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f25425s).commit();
            } else {
                this.f25424r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f25424r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f25425s;
            } else {
                i11 = this.f25424r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f25427x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                pv0 pv0Var = this.f25422f;
                if (pv0Var != null) {
                    this.f25426w = layoutParams.height;
                    pv0Var.requestLayout();
                    this.f25422f.getHeight();
                    if (this.T != this.f25427x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f25427x;
        int i17 = this.G;
        boolean z13 = true;
        eu euVar = this.f25419a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (euVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f25422f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        z13 = (!euVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f25426w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f25426w = 0;
            this.f25422f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f25422f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.i40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f25419a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            fu fuVar = this.d;
            if (fuVar != null) {
                fuVar.P.f1();
            }
            eu euVar = this.f25419a;
            if (euVar != null) {
                int currentTextColor = euVar.getCurrentTextColor();
                euVar.setTextColor(-1);
                euVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        fu fuVar = this.d;
        if (fuVar != null && fuVar.f25700c1 != UserConfig.selectedAccount) {
            this.f25422f.removeView(fuVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        fu fuVar2 = new fu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = fuVar2;
        fuVar2.f25698c = this.U;
        fuVar2.U0 = this.Q;
        fuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new hu(this));
        this.f25422f.addView(this.d);
    }

    public bu getEditText() {
        return this.f25419a;
    }

    public View getEmojiButton() {
        return this.f25420b;
    }

    public int getEmojiPadding() {
        return this.f25426w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public kz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f25425s;
        } else {
            i10 = this.f25424r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f25427x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f25419a.getText();
    }

    public int h() {
        return o5.g();
    }

    public final void j() {
        fu fuVar;
        if (!this.e && (fuVar = this.d) != null && fuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f25426w = 0;
        boolean z10 = this.f25427x;
        this.f25427x = false;
        if (z10) {
            fu fuVar2 = this.d;
            if (fuVar2 != null) {
                fuVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            fu fuVar = this.d;
            if (fuVar != null && fuVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new p8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19476w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f25427x;
        this.f25427x = false;
        if (z11) {
            fu fuVar2 = this.d;
            if (fuVar2 != null) {
                fuVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        if (view == this.d) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        fu fuVar = this.d;
        if (fuVar != null && fuVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f25419a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f25428y = true;
        fu fuVar = this.d;
        if (fuVar != null && (observersGroup = fuVar.I2) != null) {
            observersGroup.removeAllObservers();
            fuVar.I2 = null;
        }
        pv0 pv0Var = this.f25422f;
        if (pv0Var != null) {
            pv0Var.f27176r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void r() {
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            eu euVar = this.f25419a;
            euVar.requestFocus();
            AndroidUtilities.showKeyboard(euVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.l7 l7Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(l7Var);
                AndroidUtilities.runOnUIThread(l7Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.K = p1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        fu fuVar = this.d;
        if (fuVar != null) {
            fuVar.f25698c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        eu euVar = this.f25419a;
        euVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f25420b.setVisibility(i10);
        if (this.L == 0) {
            f7 = 11.0f;
        } else {
            f7 = 8.0f;
        }
        int dp2 = AndroidUtilities.dp(f7);
        if (z10) {
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(40.0f);
            } else {
                i11 = 0;
            }
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(40.0f);
            }
            euVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        euVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f25419a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f25419a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f25419a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f25419a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f25419a.setSelection(i10);
    }

    public void setSizeNotifierLayout(pv0 pv0Var) {
        pv0 pv0Var2 = this.f25422f;
        if (pv0Var2 != null) {
            pv0Var2.f27176r.remove(this);
        }
        this.f25422f = pv0Var;
        pv0Var.f27176r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        eu euVar = this.f25419a;
        int inputType = euVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (euVar.getInputType() != i10) {
            euVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f25419a.setText(charSequence);
    }

    public boolean t(int i10) {
        return true;
    }

    public final void v() {
        int i10;
        u();
        if (!AndroidUtilities.usingHardwareInput && !this.E) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        x(i10);
        eu euVar = this.f25419a;
        euVar.requestFocus();
        AndroidUtilities.showKeyboard(euVar);
        if (this.E) {
            this.F = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.N = true;
            org.telegram.ui.Cells.l7 l7Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f25419a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        ql0 ql0Var = this.f25421c;
        int i12 = 0;
        if (i10 == 1) {
            fu fuVar = this.d;
            if (fuVar != null) {
                fuVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            fu fuVar2 = this.d;
            if (this.f25424r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25424r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25424r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f25425s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25425s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25425s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f25425s;
            } else {
                i11 = this.f25424r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f25427x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fuVar2.getLayoutParams();
            layoutParams.height = i13;
            fuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f25419a);
            }
            pv0 pv0Var = this.f25422f;
            if (pv0Var != null) {
                this.f25426w = i13;
                pv0Var.requestLayout();
                ql0Var.a(R.drawable.input_keyboard, true);
                this.f25422f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f25420b != null) {
            if (this.L == 0) {
                ql0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                ql0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        pv0 pv0Var2 = this.f25422f;
        if (pv0Var2 != null) {
            if (i10 == 0) {
                this.f25426w = 0;
                this.R = 0.0f;
            }
            pv0Var2.requestLayout();
            this.f25422f.getHeight();
        }
    }

    public ju(Context context, pv0 pv0Var, org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.l7(this, 9);
        this.U = 2;
        this.I = z10;
        this.M = e6Var;
        this.L = i10;
        this.h = n2Var;
        this.f25422f = pv0Var;
        pv0Var.f27176r.add(this);
        eu euVar = new eu(this, context, e6Var, i10);
        this.f25419a = euVar;
        euVar.setImeOptions(268435456);
        euVar.setInputType(euVar.getInputType() | 16384);
        euVar.setFocusable(euVar.isEnabled());
        euVar.setCursorSize(AndroidUtilities.dp(20.0f));
        euVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        euVar.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        if (i10 == 0) {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            euVar.setBackground(null);
            euVar.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18961k6, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18979l6, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19053p7, e6Var));
            euVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, e6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
            euVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19171vf, e6Var));
            euVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(euVar, w7.x5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            euVar.setTextSize(1, 16.0f);
            euVar.setMaxLines(8);
            euVar.setGravity(19);
            euVar.setAllowTextEntitiesIntersection(true);
            euVar.setHintTextColor(-1929379841);
            euVar.setTextColor(-1);
            euVar.setCursorColor(-1);
            euVar.setBackground(null);
            euVar.setClipToPadding(false);
            euVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            euVar.setHandlesColor(-1);
            euVar.setHighlightColor(822083583);
            euVar.setLinkTextColor(-12147733);
            euVar.quoteColor = -1;
            euVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity(19);
            euVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19126t5, e6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18940j5, e6Var));
            euVar.setBackground(null);
            euVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity(19);
            euVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19126t5, e6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18940j5, e6Var));
            euVar.setBackground(null);
            euVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        hg.l lVar = new hg.l(this, context);
        this.f25420b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ql0 ql0Var = new ql0(context);
        this.f25421c = ql0Var;
        lVar.setImageDrawable(ql0Var);
        if (i10 == 0) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f7, e6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18923i6, e6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, pv0Var, e6Var, 21));
        lVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f7) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(iu iuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, fu fuVar) {
    }

    public void q(int i10, int i11) {
    }
}
