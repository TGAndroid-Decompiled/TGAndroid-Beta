package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
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
public class qu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, nw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.o1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.g6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.u5 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final lu f29989a;
    public final ig.k f29990b;
    public final rm0 f29991c;
    public mu d;
    public boolean e;
    public ow0 f29992f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean f29993n;
    public int f29994r;
    public int f29995s;
    public boolean v;
    public int f29996w;
    public boolean f29997x;
    public boolean f29998y;

    public qu(Context context, org.telegram.ui.id idVar, org.telegram.ui.ko koVar) {
        this(context, idVar, koVar, 0, false, null);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f29995s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f29995s).commit();
            } else {
                this.f29994r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f29994r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f29995s;
            } else {
                i11 = this.f29994r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f29997x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                ow0 ow0Var = this.f29992f;
                if (ow0Var != null) {
                    this.f29996w = layoutParams.height;
                    ow0Var.requestLayout();
                    this.f29992f.getHeight();
                    if (this.T != this.f29997x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f29997x;
        int i17 = this.G;
        boolean z13 = true;
        lu luVar = this.f29989a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (luVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f29992f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        if (!luVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f29996w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f29996w = 0;
            this.f29992f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f29992f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.s30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f29989a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            mu muVar = this.d;
            if (muVar != null) {
                muVar.P.g1();
            }
            lu luVar = this.f29989a;
            if (luVar != null) {
                int currentTextColor = luVar.getCurrentTextColor();
                luVar.setTextColor(-1);
                luVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        mu muVar = this.d;
        if (muVar != null && muVar.f30966c1 != UserConfig.selectedAccount) {
            this.f29992f.removeView(muVar);
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
        mu muVar2 = new mu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = muVar2;
        muVar2.f30964c = this.U;
        muVar2.U0 = this.Q;
        muVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ou(this));
        this.f29992f.addView(this.d);
    }

    public iu getEditText() {
        return this.f29989a;
    }

    public View getEmojiButton() {
        return this.f29990b;
    }

    public int getEmojiPadding() {
        return this.f29996w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public tz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f29995s;
        } else {
            i10 = this.f29994r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f29997x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f29989a.getText();
    }

    public int h() {
        return r5.g();
    }

    public final void j() {
        mu muVar;
        if (!this.e && (muVar = this.d) != null && muVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f29996w = 0;
        boolean z10 = this.f29997x;
        this.f29997x = false;
        if (z10) {
            mu muVar2 = this.d;
            if (muVar2 != null) {
                muVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            mu muVar = this.d;
            if (muVar != null && muVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new org.telegram.ui.pq(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f29997x;
        this.f29997x = false;
        if (z11) {
            mu muVar2 = this.d;
            if (muVar2 != null) {
                muVar2.u(false);
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
        mu muVar = this.d;
        if (muVar != null && muVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f29989a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f29998y = true;
        mu muVar = this.d;
        if (muVar != null && (observersGroup = muVar.O2) != null) {
            observersGroup.removeAllObservers();
            muVar.O2 = null;
        }
        ow0 ow0Var = this.f29992f;
        if (ow0Var != null) {
            ow0Var.f29348r.remove(this);
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
            lu luVar = this.f29989a;
            luVar.requestFocus();
            AndroidUtilities.showKeyboard(luVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.u5 u5Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(u5Var);
                AndroidUtilities.runOnUIThread(u5Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.K = o1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        mu muVar = this.d;
        if (muVar != null) {
            muVar.f30964c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        lu luVar = this.f29989a;
        luVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f29990b.setVisibility(i10);
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
            luVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        luVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f29989a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f29989a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f29989a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f29989a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f29989a.setSelection(i10);
    }

    public void setSizeNotifierLayout(ow0 ow0Var) {
        ow0 ow0Var2 = this.f29992f;
        if (ow0Var2 != null) {
            ow0Var2.f29348r.remove(this);
        }
        this.f29992f = ow0Var;
        ow0Var.f29348r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        lu luVar = this.f29989a;
        int inputType = luVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (luVar.getInputType() != i10) {
            luVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f29989a.setText(charSequence);
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
        lu luVar = this.f29989a;
        luVar.requestFocus();
        AndroidUtilities.showKeyboard(luVar);
        if (this.E) {
            this.F = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.N = true;
            org.telegram.ui.Cells.u5 u5Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f29989a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        rm0 rm0Var = this.f29991c;
        int i12 = 0;
        if (i10 == 1) {
            mu muVar = this.d;
            if (muVar != null) {
                muVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            mu muVar2 = this.d;
            if (this.f29994r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f29994r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f29994r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f29995s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f29995s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f29995s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f29995s;
            } else {
                i11 = this.f29994r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f29997x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) muVar2.getLayoutParams();
            layoutParams.height = i13;
            muVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f29989a);
            }
            ow0 ow0Var = this.f29992f;
            if (ow0Var != null) {
                this.f29996w = i13;
                ow0Var.requestLayout();
                rm0Var.a(R.drawable.input_keyboard, true);
                this.f29992f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f29990b != null) {
            if (this.L == 0) {
                rm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                rm0Var.a(R.drawable.input_smile, true);
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
        ow0 ow0Var2 = this.f29992f;
        if (ow0Var2 != null) {
            if (i10 == 0) {
                this.f29996w = 0;
                this.R = 0.0f;
            }
            ow0Var2.requestLayout();
            this.f29992f.getHeight();
        }
    }

    public qu(Context context, ow0 ow0Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.u5(this, 10);
        this.U = 2;
        this.I = z10;
        this.M = g6Var;
        this.L = i10;
        this.h = o2Var;
        this.f29992f = ow0Var;
        ow0Var.f29348r.add(this);
        lu luVar = new lu(this, context, g6Var, i10);
        this.f29989a = luVar;
        luVar.setImeOptions(268435456);
        luVar.setInputType(luVar.getInputType() | 16384);
        luVar.setFocusable(luVar.isEnabled());
        luVar.setCursorSize(AndroidUtilities.dp(20.0f));
        luVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(luVar, 30, i11, g6Var);
        if (i10 == 0) {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            luVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.H(luVar, org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.f21404p7, g6Var);
            org.telegram.ui.ActionBar.r6.F(luVar, org.telegram.ui.ActionBar.k6.H6, g6Var);
            org.telegram.ui.ActionBar.r6.W(luVar, i11, g6Var);
            org.telegram.ui.ActionBar.r6.m(luVar, 36, org.telegram.ui.ActionBar.k6.f21525vf, g6Var);
            luVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(luVar, w7.z5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            luVar.setTextSize(1, 16.0f);
            luVar.setMaxLines(8);
            luVar.setGravity(19);
            luVar.setAllowTextEntitiesIntersection(true);
            luVar.setHintTextColor(-1929379841);
            luVar.setTextColor(-1);
            luVar.setCursorColor(-1);
            luVar.setBackground(null);
            luVar.setClipToPadding(false);
            luVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            luVar.setHandlesColor(-1);
            luVar.setHighlightColor(822083583);
            luVar.setLinkTextColor(-12147733);
            luVar.quoteColor = -1;
            luVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(luVar, w7.z5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.F(luVar, org.telegram.ui.ActionBar.k6.f21478t5, g6Var);
            org.telegram.ui.ActionBar.r6.W(luVar, org.telegram.ui.ActionBar.k6.f21289j5, g6Var);
            luVar.setBackground(null);
            luVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(luVar, w7.z5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.F(luVar, org.telegram.ui.ActionBar.k6.f21478t5, g6Var);
            org.telegram.ui.ActionBar.r6.W(luVar, org.telegram.ui.ActionBar.k6.f21289j5, g6Var);
            luVar.setBackground(null);
            luVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(luVar, w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ig.k kVar = new ig.k(this, context);
        this.f29990b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        rm0 rm0Var = new rm0(context);
        this.f29991c = rm0Var;
        kVar.setImageDrawable(rm0Var);
        if (i10 == 0) {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            rm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.f7, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        kVar.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(kVar, g02, null, O, g6Var);
        kVar.setOnClickListener(new ai.v0(this, ow0Var, g6Var, 24));
        kVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f7) {
    }

    public void e() {
    }

    public void p() {
    }

    public void setDelegate(pu puVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, mu muVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i10, int i11) {
    }
}
