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
public class hu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, nv0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.p1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.f6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.l7 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final cu f26847a;
    public final ig.k f26848b;
    public final ql0 f26849c;
    public du d;
    public boolean f26850e;
    public ov0 f26851f;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f26852n;
    public int f26853r;
    public int f26854s;
    public boolean v;
    public int f26855w;
    public boolean f26856x;
    public boolean f26857y;

    public hu(Context context, org.telegram.ui.id idVar, org.telegram.ui.xo xoVar) {
        this(context, idVar, xoVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f26854s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26854s).commit();
            } else {
                this.f26853r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26853r).commit();
            }
        }
        boolean z12 = false;
        if (this.f26850e) {
            if (z10) {
                i11 = this.f26854s;
            } else {
                i11 = this.f26853r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f26856x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                ov0 ov0Var = this.f26851f;
                if (ov0Var != null) {
                    this.f26855w = layoutParams.height;
                    ov0Var.requestLayout();
                    this.f26851f.getHeight();
                    if (this.T != this.f26856x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f26856x;
        int i17 = this.G;
        boolean z13 = true;
        cu cuVar = this.f26847a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (cuVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f26851f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        z13 = (!cuVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.f26850e) {
            x(0);
        }
        if (this.f26855w != 0 && !(z11 = this.v) && z11 != z14 && !this.f26850e) {
            this.f26855w = 0;
            this.f26851f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f26851f.getHeight();
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
        AndroidUtilities.hideKeyboard(this.f26847a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            du duVar = this.d;
            if (duVar != null) {
                duVar.P.e1();
            }
            cu cuVar = this.f26847a;
            if (cuVar != null) {
                int currentTextColor = cuVar.getCurrentTextColor();
                cuVar.setTextColor(-1);
                cuVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        du duVar = this.d;
        if (duVar != null && duVar.f27932c1 != UserConfig.selectedAccount) {
            this.f26851f.removeView(duVar);
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
        du duVar2 = new du(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = duVar2;
        duVar2.f27930c = this.U;
        duVar2.U0 = this.Q;
        duVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new fu(this));
        this.f26851f.addView(this.d);
    }

    public zt getEditText() {
        return this.f26847a;
    }

    public View getEmojiButton() {
        return this.f26848b;
    }

    public int getEmojiPadding() {
        return this.f26855w;
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
            i10 = this.f26854s;
        } else {
            i10 = this.f26853r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f26856x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f26847a.getText();
    }

    public int h() {
        return q5.g();
    }

    public final void j() {
        du duVar;
        if (!this.f26850e && (duVar = this.d) != null && duVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f26855w = 0;
        boolean z10 = this.f26856x;
        this.f26856x = false;
        if (z10) {
            du duVar2 = this.d;
            if (duVar2 != null) {
                duVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f26850e) {
            x(0);
        }
        if (z10) {
            du duVar = this.d;
            if (duVar != null && duVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new j6(this, 19));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21275w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f26856x;
        this.f26856x = false;
        if (z11) {
            du duVar2 = this.d;
            if (duVar2 != null) {
                duVar2.t(false);
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
        du duVar = this.d;
        if (duVar != null && duVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f26847a.length();
    }

    public final void o() {
        this.f26857y = true;
        du duVar = this.d;
        if (duVar != null) {
            duVar.D();
        }
        ov0 ov0Var = this.f26851f;
        if (ov0Var != null) {
            ov0Var.f29219r.remove(this);
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
            cu cuVar = this.f26847a;
            cuVar.requestFocus();
            AndroidUtilities.showKeyboard(cuVar);
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
        du duVar = this.d;
        if (duVar != null) {
            duVar.f27930c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        cu cuVar = this.f26847a;
        cuVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f26848b.setVisibility(i10);
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
            cuVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        cuVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f26847a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f26847a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f26847a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f26847a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f26847a.setSelection(i10);
    }

    public void setSizeNotifierLayout(ov0 ov0Var) {
        ov0 ov0Var2 = this.f26851f;
        if (ov0Var2 != null) {
            ov0Var2.f29219r.remove(this);
        }
        this.f26851f = ov0Var;
        ov0Var.f29219r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        cu cuVar = this.f26847a;
        int inputType = cuVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (cuVar.getInputType() != i10) {
            cuVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26847a.setText(charSequence);
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
        cu cuVar = this.f26847a;
        cuVar.requestFocus();
        AndroidUtilities.showKeyboard(cuVar);
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
        this.f26847a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        ql0 ql0Var = this.f26849c;
        int i12 = 0;
        if (i10 == 1) {
            du duVar = this.d;
            if (duVar != null) {
                duVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f26850e = true;
            this.R = 1.0f;
            du duVar2 = this.d;
            if (this.f26853r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f26853r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f26853r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f26854s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f26854s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f26854s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f26854s;
            } else {
                i11 = this.f26853r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f26856x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) duVar2.getLayoutParams();
            layoutParams.height = i13;
            duVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f26847a);
            }
            ov0 ov0Var = this.f26851f;
            if (ov0Var != null) {
                this.f26855w = i13;
                ov0Var.requestLayout();
                ql0Var.a(R.drawable.input_keyboard, true);
                this.f26851f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f26848b != null) {
            if (this.L == 0) {
                ql0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                ql0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f26850e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        ov0 ov0Var2 = this.f26851f;
        if (ov0Var2 != null) {
            if (i10 == 0) {
                this.f26855w = 0;
                this.R = 0.0f;
            }
            ov0Var2.requestLayout();
            this.f26851f.getHeight();
        }
    }

    public hu(Context context, ov0 ov0Var, org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.l7(this, 9);
        this.U = 2;
        this.I = z10;
        this.M = f6Var;
        this.L = i10;
        this.h = n2Var;
        this.f26851f = ov0Var;
        ov0Var.f29219r.add(this);
        cu cuVar = new cu(this, context, f6Var, i10);
        this.f26847a = cuVar;
        cuVar.setImeOptions(268435456);
        cuVar.setInputType(cuVar.getInputType() | 16384);
        cuVar.setFocusable(cuVar.isEnabled());
        cuVar.setCursorSize(AndroidUtilities.dp(20.0f));
        cuVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        cuVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            cuVar.setTextSize(1, 18.0f);
            cuVar.setMaxLines(4);
            cuVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            cuVar.setBackground(null);
            cuVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20791k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20809l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20880p7, f6Var));
            cuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            cuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            cuVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20998vf, f6Var));
            cuVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(cuVar, w7.x5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            cuVar.setTextSize(1, 16.0f);
            cuVar.setMaxLines(8);
            cuVar.setGravity(19);
            cuVar.setAllowTextEntitiesIntersection(true);
            cuVar.setHintTextColor(-1929379841);
            cuVar.setTextColor(-1);
            cuVar.setCursorColor(-1);
            cuVar.setBackground(null);
            cuVar.setClipToPadding(false);
            cuVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            cuVar.setHandlesColor(-1);
            cuVar.setHighlightColor(822083583);
            cuVar.setLinkTextColor(-12147733);
            cuVar.quoteColor = -1;
            cuVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(cuVar, w7.x5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            cuVar.setTextSize(1, 18.0f);
            cuVar.setMaxLines(4);
            cuVar.setGravity(19);
            cuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20953t5, f6Var));
            cuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
            cuVar.setBackground(null);
            cuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(cuVar, w7.x5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            cuVar.setTextSize(1, 18.0f);
            cuVar.setMaxLines(4);
            cuVar.setGravity(19);
            cuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20953t5, f6Var));
            cuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
            cuVar.setBackground(null);
            cuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(cuVar, w7.x5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ig.k kVar = new ig.k(this, context);
        this.f26848b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ql0 ql0Var = new ql0(context);
        this.f26849c = ql0Var;
        kVar.setImageDrawable(ql0Var);
        if (i10 == 0) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, f6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            ql0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            ql0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        kVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var), 1, -1));
        kVar.setOnClickListener(new bi.x(this, ov0Var, f6Var, 21));
        kVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f7) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(gu guVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, du duVar) {
    }

    public void q(int i10, int i11) {
    }
}
