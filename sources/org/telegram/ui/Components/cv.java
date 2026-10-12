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
public class cv extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.o1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.c6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.l7 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final xu f25023a;
    public final hg.l f25024b;
    public final bn0 f25025c;
    public yu d;
    public boolean f25026e;
    public yw0 f25027f;
    public final org.telegram.ui.ActionBar.m2 h;
    public boolean f25028n;
    public int f25029r;
    public int f25030s;
    public boolean v;
    public int f25031w;
    public boolean f25032x;
    public boolean f25033y;

    public cv(Context context, org.telegram.ui.md mdVar, org.telegram.ui.xo xoVar) {
        this(context, mdVar, xoVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f25030s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f25030s).commit();
            } else {
                this.f25029r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f25029r).commit();
            }
        }
        boolean z12 = false;
        if (this.f25026e) {
            if (z10) {
                i11 = this.f25030s;
            } else {
                i11 = this.f25029r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f25032x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                yw0 yw0Var = this.f25027f;
                if (yw0Var != null) {
                    this.f25031w = layoutParams.height;
                    yw0Var.requestLayout();
                    this.f25027f.getHeight();
                    if (this.T != this.f25032x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f25032x;
        int i17 = this.G;
        boolean z13 = true;
        xu xuVar = this.f25023a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (xuVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f25027f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        if (!xuVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.v = z13;
        if (z13 && this.f25026e) {
            x(0);
        }
        if (this.f25031w != 0 && !(z11 = this.v) && z11 != z14 && !this.f25026e) {
            this.f25031w = 0;
            this.f25027f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f25027f.getHeight();
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
        AndroidUtilities.hideKeyboard(this.f25023a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            yu yuVar = this.d;
            if (yuVar != null) {
                yuVar.P.f1();
            }
            xu xuVar = this.f25023a;
            if (xuVar != null) {
                int currentTextColor = xuVar.getCurrentTextColor();
                xuVar.setTextColor(-1);
                xuVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        yu yuVar = this.d;
        if (yuVar != null && yuVar.f25080c1 != UserConfig.selectedAccount) {
            this.f25027f.removeView(yuVar);
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
        yu yuVar2 = new yu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = yuVar2;
        yuVar2.f25078c = this.U;
        yuVar2.U0 = this.Q;
        yuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new av(this));
        this.f25027f.addView(this.d);
    }

    public uu getEditText() {
        return this.f25023a;
    }

    public View getEmojiButton() {
        return this.f25024b;
    }

    public int getEmojiPadding() {
        return this.f25031w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public d00 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f25030s;
        } else {
            i10 = this.f25029r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f25032x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f25023a.getText();
    }

    public int h() {
        return s5.g();
    }

    public final void j() {
        yu yuVar;
        if (!this.f25026e && (yuVar = this.d) != null && yuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f25031w = 0;
        boolean z10 = this.f25032x;
        this.f25032x = false;
        if (z10) {
            yu yuVar2 = this.d;
            if (yuVar2 != null) {
                yuVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f25026e) {
            x(0);
        }
        if (z10) {
            yu yuVar = this.d;
            if (yuVar != null && yuVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new t8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21181w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f25032x;
        this.f25032x = false;
        if (z11) {
            yu yuVar2 = this.d;
            if (yuVar2 != null) {
                yuVar2.u(false);
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
        yu yuVar = this.d;
        if (yuVar != null && yuVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f25023a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f25033y = true;
        yu yuVar = this.d;
        if (yuVar != null && (observersGroup = yuVar.I2) != null) {
            observersGroup.removeAllObservers();
            yuVar.I2 = null;
        }
        yw0 yw0Var = this.f25027f;
        if (yw0Var != null) {
            yw0Var.f33206r.remove(this);
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
            xu xuVar = this.f25023a;
            xuVar.requestFocus();
            AndroidUtilities.showKeyboard(xuVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.l7 l7Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(l7Var);
                AndroidUtilities.runOnUIThread(l7Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.K = o1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        yu yuVar = this.d;
        if (yuVar != null) {
            yuVar.f25078c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        xu xuVar = this.f25023a;
        xuVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f25024b.setVisibility(i10);
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
            xuVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        xuVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f25023a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f25023a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f25023a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f25023a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f25023a.setSelection(i10);
    }

    public void setSizeNotifierLayout(yw0 yw0Var) {
        yw0 yw0Var2 = this.f25027f;
        if (yw0Var2 != null) {
            yw0Var2.f33206r.remove(this);
        }
        this.f25027f = yw0Var;
        yw0Var.f33206r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        xu xuVar = this.f25023a;
        int inputType = xuVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (xuVar.getInputType() != i10) {
            xuVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f25023a.setText(charSequence);
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
        xu xuVar = this.f25023a;
        xuVar.requestFocus();
        AndroidUtilities.showKeyboard(xuVar);
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
        this.f25023a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        bn0 bn0Var = this.f25025c;
        int i12 = 0;
        if (i10 == 1) {
            yu yuVar = this.d;
            if (yuVar != null) {
                yuVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f25026e = true;
            this.R = 1.0f;
            yu yuVar2 = this.d;
            if (this.f25029r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25029r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25029r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f25030s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25030s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25030s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f25030s;
            } else {
                i11 = this.f25029r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f25032x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yuVar2.getLayoutParams();
            layoutParams.height = i13;
            yuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f25023a);
            }
            yw0 yw0Var = this.f25027f;
            if (yw0Var != null) {
                this.f25031w = i13;
                yw0Var.requestLayout();
                bn0Var.a(R.drawable.input_keyboard, true);
                this.f25027f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f25024b != null) {
            if (this.L == 0) {
                bn0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                bn0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f25026e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        yw0 yw0Var2 = this.f25027f;
        if (yw0Var2 != null) {
            if (i10 == 0) {
                this.f25031w = 0;
                this.R = 0.0f;
            }
            yw0Var2.requestLayout();
            this.f25027f.getHeight();
        }
    }

    public cv(Context context, yw0 yw0Var, org.telegram.ui.ActionBar.m2 m2Var, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.l7(this, 8);
        this.U = 2;
        this.I = z10;
        this.M = c6Var;
        this.L = i10;
        this.h = m2Var;
        this.f25027f = yw0Var;
        yw0Var.f33206r.add(this);
        xu xuVar = new xu(this, context, c6Var, i10);
        this.f25023a = xuVar;
        xuVar.setImeOptions(268435456);
        xuVar.setInputType(xuVar.getInputType() | 16384);
        xuVar.setFocusable(xuVar.isEnabled());
        xuVar.setCursorSize(AndroidUtilities.dp(20.0f));
        xuVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        xuVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        if (i10 == 0) {
            xuVar.setTextSize(1, 18.0f);
            xuVar.setMaxLines(4);
            xuVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            xuVar.setBackground(null);
            xuVar.setLineColors(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20687k6, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20705l6, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20780p7, c6Var));
            xuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, c6Var));
            xuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
            xuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20900vf, c6Var));
            xuVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(xuVar, w7.w5.a(-2.0f, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f, -1, 19));
        } else if (i10 == 2 || i10 == 3) {
            xuVar.setTextSize(1, 16.0f);
            xuVar.setMaxLines(8);
            xuVar.setGravity(19);
            xuVar.setAllowTextEntitiesIntersection(true);
            xuVar.setHintTextColor(-1929379841);
            xuVar.setTextColor(-1);
            xuVar.setCursorColor(-1);
            xuVar.setBackground(null);
            xuVar.setClipToPadding(false);
            xuVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            xuVar.setHandlesColor(-1);
            xuVar.setHighlightColor(822083583);
            xuVar.setLinkTextColor(-12147733);
            xuVar.quoteColor = -1;
            xuVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(xuVar, w7.w5.a(-1.0f, 40.0f, 0.0f, 24.0f, 0.0f, -1, 19));
        } else if (i10 == 4) {
            xuVar.setTextSize(1, 18.0f);
            xuVar.setMaxLines(4);
            xuVar.setGravity(19);
            xuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20855t5, c6Var));
            xuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20667j5, c6Var));
            xuVar.setBackground(null);
            xuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(xuVar, w7.w5.a(-1.0f, 14.0f, 0.0f, 48.0f, 0.0f, -1, 19));
        } else {
            xuVar.setTextSize(1, 18.0f);
            xuVar.setMaxLines(4);
            xuVar.setGravity(19);
            xuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20855t5, c6Var));
            xuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20667j5, c6Var));
            xuVar.setBackground(null);
            xuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(xuVar, w7.w5.a(-1.0f, 48.0f, 0.0f, 0.0f, 0.0f, -1, 19));
        }
        hg.l lVar = new hg.l(this, context);
        this.f25024b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bn0 bn0Var = new bn0(context);
        this.f25025c = bn0Var;
        lVar.setImageDrawable(bn0Var);
        if (i10 == 0) {
            bn0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            bn0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.w5.a(48.0f, 0.0f, 0.0f, 0.0f, 5.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        } else if (i10 == 2 || i10 == 3) {
            bn0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            bn0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.w5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        } else if (i10 == 4) {
            bn0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            bn0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.w5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 53));
        } else if (i10 == 5) {
            bn0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f7, c6Var), PorterDuff.Mode.MULTIPLY));
            bn0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.w5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        } else {
            bn0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            bn0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.w5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, c6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, yw0Var, c6Var, 21));
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

    public void setDelegate(bv bvVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, yu yuVar) {
    }

    public void q(int i10, int i11) {
    }
}
