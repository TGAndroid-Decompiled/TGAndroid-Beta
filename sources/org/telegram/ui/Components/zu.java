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
public class zu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, rw0 {
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
    public final org.telegram.ui.Cells.t6 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final uu f33649a;
    public final hg.l f33650b;
    public final vm0 f33651c;
    public vu d;
    public boolean f33652e;
    public sw0 f33653f;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f33654n;
    public int f33655r;
    public int f33656s;
    public boolean v;
    public int f33657w;
    public boolean f33658x;
    public boolean f33659y;

    public zu(Context context, org.telegram.ui.id idVar, org.telegram.ui.uo uoVar) {
        this(context, idVar, uoVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f33656s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f33656s).commit();
            } else {
                this.f33655r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f33655r).commit();
            }
        }
        boolean z12 = false;
        if (this.f33652e) {
            if (z10) {
                i11 = this.f33656s;
            } else {
                i11 = this.f33655r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f33658x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                sw0 sw0Var = this.f33653f;
                if (sw0Var != null) {
                    this.f33657w = layoutParams.height;
                    sw0Var.requestLayout();
                    this.f33653f.getHeight();
                    if (this.T != this.f33658x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f33658x;
        int i17 = this.G;
        boolean z13 = true;
        uu uuVar = this.f33649a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (uuVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f33653f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        if (!uuVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.v = z13;
        if (z13 && this.f33652e) {
            x(0);
        }
        if (this.f33657w != 0 && !(z11 = this.v) && z11 != z14 && !this.f33652e) {
            this.f33657w = 0;
            this.f33653f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f33653f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.g40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f33649a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            vu vuVar = this.d;
            if (vuVar != null) {
                vuVar.P.f1();
            }
            uu uuVar = this.f33649a;
            if (uuVar != null) {
                int currentTextColor = uuVar.getCurrentTextColor();
                uuVar.setTextColor(-1);
                uuVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        vu vuVar = this.d;
        if (vuVar != null && vuVar.f24401c1 != UserConfig.selectedAccount) {
            this.f33653f.removeView(vuVar);
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
        vu vuVar2 = new vu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = vuVar2;
        vuVar2.f24399c = this.U;
        vuVar2.U0 = this.Q;
        vuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new xu(this));
        this.f33653f.addView(this.d);
    }

    public ru getEditText() {
        return this.f33649a;
    }

    public View getEmojiButton() {
        return this.f33650b;
    }

    public int getEmojiPadding() {
        return this.f33657w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public a00 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f33656s;
        } else {
            i10 = this.f33655r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f33658x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f33649a.getText();
    }

    public int h() {
        return s5.g();
    }

    public final void j() {
        vu vuVar;
        if (!this.f33652e && (vuVar = this.d) != null && vuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f33657w = 0;
        boolean z10 = this.f33658x;
        this.f33658x = false;
        if (z10) {
            vu vuVar2 = this.d;
            if (vuVar2 != null) {
                vuVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f33652e) {
            x(0);
        }
        if (z10) {
            vu vuVar = this.d;
            if (vuVar != null && vuVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new t8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f33658x;
        this.f33658x = false;
        if (z11) {
            vu vuVar2 = this.d;
            if (vuVar2 != null) {
                vuVar2.u(false);
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
        vu vuVar = this.d;
        if (vuVar != null && vuVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f33649a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f33659y = true;
        vu vuVar = this.d;
        if (vuVar != null && (observersGroup = vuVar.I2) != null) {
            observersGroup.removeAllObservers();
            vuVar.I2 = null;
        }
        sw0 sw0Var = this.f33653f;
        if (sw0Var != null) {
            sw0Var.f30938r.remove(this);
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
            uu uuVar = this.f33649a;
            uuVar.requestFocus();
            AndroidUtilities.showKeyboard(uuVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.t6 t6Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                AndroidUtilities.runOnUIThread(t6Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.K = p1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        vu vuVar = this.d;
        if (vuVar != null) {
            vuVar.f24399c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        uu uuVar = this.f33649a;
        uuVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f33650b.setVisibility(i10);
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
            uuVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        uuVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f33649a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f33649a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f33649a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f33649a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f33649a.setSelection(i10);
    }

    public void setSizeNotifierLayout(sw0 sw0Var) {
        sw0 sw0Var2 = this.f33653f;
        if (sw0Var2 != null) {
            sw0Var2.f30938r.remove(this);
        }
        this.f33653f = sw0Var;
        sw0Var.f30938r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        uu uuVar = this.f33649a;
        int inputType = uuVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (uuVar.getInputType() != i10) {
            uuVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f33649a.setText(charSequence);
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
        uu uuVar = this.f33649a;
        uuVar.requestFocus();
        AndroidUtilities.showKeyboard(uuVar);
        if (this.E) {
            this.F = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.N = true;
            org.telegram.ui.Cells.t6 t6Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            AndroidUtilities.runOnUIThread(t6Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f33649a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        vm0 vm0Var = this.f33651c;
        int i12 = 0;
        if (i10 == 1) {
            vu vuVar = this.d;
            if (vuVar != null) {
                vuVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f33652e = true;
            this.R = 1.0f;
            vu vuVar2 = this.d;
            if (this.f33655r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f33655r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f33655r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f33656s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f33656s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f33656s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f33656s;
            } else {
                i11 = this.f33655r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f33658x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vuVar2.getLayoutParams();
            layoutParams.height = i13;
            vuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f33649a);
            }
            sw0 sw0Var = this.f33653f;
            if (sw0Var != null) {
                this.f33657w = i13;
                sw0Var.requestLayout();
                vm0Var.a(R.drawable.input_keyboard, true);
                this.f33653f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f33650b != null) {
            if (this.L == 0) {
                vm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                vm0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f33652e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        sw0 sw0Var2 = this.f33653f;
        if (sw0Var2 != null) {
            if (i10 == 0) {
                this.f33657w = 0;
                this.R = 0.0f;
            }
            sw0Var2.requestLayout();
            this.f33653f.getHeight();
        }
    }

    public zu(Context context, sw0 sw0Var, org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.t6(this, 9);
        this.U = 2;
        this.I = z10;
        this.M = e6Var;
        this.L = i10;
        this.h = n2Var;
        this.f33653f = sw0Var;
        sw0Var.f30938r.add(this);
        uu uuVar = new uu(this, context, e6Var, i10);
        this.f33649a = uuVar;
        uuVar.setImeOptions(268435456);
        uuVar.setInputType(uuVar.getInputType() | 16384);
        uuVar.setFocusable(uuVar.isEnabled());
        uuVar.setCursorSize(AndroidUtilities.dp(20.0f));
        uuVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        uuVar.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        if (i10 == 0) {
            uuVar.setTextSize(1, 18.0f);
            uuVar.setMaxLines(4);
            uuVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            uuVar.setBackground(null);
            uuVar.setLineColors(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20925k6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20943l6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21018p7, e6Var));
            uuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H6, e6Var));
            uuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
            uuVar.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21136vf, e6Var));
            uuVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(uuVar, w7.x5.a(-2.0f, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f, -1, 19));
        } else if (i10 == 2 || i10 == 3) {
            uuVar.setTextSize(1, 16.0f);
            uuVar.setMaxLines(8);
            uuVar.setGravity(19);
            uuVar.setAllowTextEntitiesIntersection(true);
            uuVar.setHintTextColor(-1929379841);
            uuVar.setTextColor(-1);
            uuVar.setCursorColor(-1);
            uuVar.setBackground(null);
            uuVar.setClipToPadding(false);
            uuVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            uuVar.setHandlesColor(-1);
            uuVar.setHighlightColor(822083583);
            uuVar.setLinkTextColor(-12147733);
            uuVar.quoteColor = -1;
            uuVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(uuVar, w7.x5.a(-1.0f, 40.0f, 0.0f, 24.0f, 0.0f, -1, 19));
        } else if (i10 == 4) {
            uuVar.setTextSize(1, 18.0f);
            uuVar.setMaxLines(4);
            uuVar.setGravity(19);
            uuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21091t5, e6Var));
            uuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, e6Var));
            uuVar.setBackground(null);
            uuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(uuVar, w7.x5.a(-1.0f, 14.0f, 0.0f, 48.0f, 0.0f, -1, 19));
        } else {
            uuVar.setTextSize(1, 18.0f);
            uuVar.setMaxLines(4);
            uuVar.setGravity(19);
            uuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21091t5, e6Var));
            uuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, e6Var));
            uuVar.setBackground(null);
            uuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(uuVar, w7.x5.a(-1.0f, 48.0f, 0.0f, 0.0f, 0.0f, -1, 19));
        }
        hg.l lVar = new hg.l(this, context);
        this.f33650b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        vm0 vm0Var = new vm0(context);
        this.f33651c = vm0Var;
        lVar.setImageDrawable(vm0Var);
        if (i10 == 0) {
            vm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            vm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 5.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        } else if (i10 == 2 || i10 == 3) {
            vm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        } else if (i10 == 4) {
            vm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 53));
        } else if (i10 == 5) {
            vm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f7, e6Var), PorterDuff.Mode.MULTIPLY));
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        } else {
            vm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, sw0Var, e6Var, 21));
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

    public void setDelegate(yu yuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, vu vuVar) {
    }

    public void q(int i10, int i11) {
    }
}
