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
public class vu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, nw0 {
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
    public final org.telegram.ui.Cells.t6 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final qu f30649a;
    public final ig.k f30650b;
    public final rm0 f30651c;
    public ru d;
    public boolean e;
    public ow0 f30652f;
    public final org.telegram.ui.ActionBar.m2 h;
    public boolean f30653n;
    public int f30654r;
    public int f30655s;
    public boolean v;
    public int f30656w;
    public boolean f30657x;
    public boolean f30658y;

    public vu(Context context, org.telegram.ui.od odVar, org.telegram.ui.zo zoVar) {
        this(context, odVar, zoVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f30655s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f30655s).commit();
            } else {
                this.f30654r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f30654r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f30655s;
            } else {
                i11 = this.f30654r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f30657x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                ow0 ow0Var = this.f30652f;
                if (ow0Var != null) {
                    this.f30656w = layoutParams.height;
                    ow0Var.requestLayout();
                    this.f30652f.getHeight();
                    if (this.T != this.f30657x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f30657x;
        int i17 = this.G;
        boolean z13 = true;
        qu quVar = this.f30649a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (quVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f30652f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        if (!quVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f30656w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f30656w = 0;
            this.f30652f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f30652f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.m40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f30649a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ru ruVar = this.d;
            if (ruVar != null) {
                ruVar.P.f1();
            }
            qu quVar = this.f30649a;
            if (quVar != null) {
                int currentTextColor = quVar.getCurrentTextColor();
                quVar.setTextColor(-1);
                quVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        ru ruVar = this.d;
        if (ruVar != null && ruVar.f31014c1 != UserConfig.selectedAccount) {
            this.f30652f.removeView(ruVar);
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
        ru ruVar2 = new ru(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = ruVar2;
        ruVar2.f31012c = this.U;
        ruVar2.U0 = this.Q;
        ruVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new tu(this));
        this.f30652f.addView(this.d);
    }

    public nu getEditText() {
        return this.f30649a;
    }

    public View getEmojiButton() {
        return this.f30650b;
    }

    public int getEmojiPadding() {
        return this.f30656w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public wz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f30655s;
        } else {
            i10 = this.f30654r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f30657x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f30649a.getText();
    }

    public int h() {
        return s5.g();
    }

    public final void j() {
        ru ruVar;
        if (!this.e && (ruVar = this.d) != null && ruVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f30656w = 0;
        boolean z10 = this.f30657x;
        this.f30657x = false;
        if (z10) {
            ru ruVar2 = this.d;
            if (ruVar2 != null) {
                ruVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            ru ruVar = this.d;
            if (ruVar != null && ruVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new l6(this, 19));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20554w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f30657x;
        this.f30657x = false;
        if (z11) {
            ru ruVar2 = this.d;
            if (ruVar2 != null) {
                ruVar2.u(false);
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
        ru ruVar = this.d;
        if (ruVar != null && ruVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f30649a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f30658y = true;
        ru ruVar = this.d;
        if (ruVar != null && (observersGroup = ruVar.I2) != null) {
            observersGroup.removeAllObservers();
            ruVar.I2 = null;
        }
        ow0 ow0Var = this.f30652f;
        if (ow0Var != null) {
            ow0Var.f28101r.remove(this);
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
            qu quVar = this.f30649a;
            quVar.requestFocus();
            AndroidUtilities.showKeyboard(quVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.t6 t6Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                AndroidUtilities.runOnUIThread(t6Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.K = o1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        ru ruVar = this.d;
        if (ruVar != null) {
            ruVar.f31012c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        qu quVar = this.f30649a;
        quVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f30650b.setVisibility(i10);
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
            quVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        quVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f30649a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f30649a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f30649a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f30649a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f30649a.setSelection(i10);
    }

    public void setSizeNotifierLayout(ow0 ow0Var) {
        ow0 ow0Var2 = this.f30652f;
        if (ow0Var2 != null) {
            ow0Var2.f28101r.remove(this);
        }
        this.f30652f = ow0Var;
        ow0Var.f28101r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        qu quVar = this.f30649a;
        int inputType = quVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (quVar.getInputType() != i10) {
            quVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f30649a.setText(charSequence);
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
        qu quVar = this.f30649a;
        quVar.requestFocus();
        AndroidUtilities.showKeyboard(quVar);
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
        this.f30649a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        rm0 rm0Var = this.f30651c;
        int i12 = 0;
        if (i10 == 1) {
            ru ruVar = this.d;
            if (ruVar != null) {
                ruVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            ru ruVar2 = this.d;
            if (this.f30654r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f30654r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f30654r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f30655s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f30655s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f30655s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f30655s;
            } else {
                i11 = this.f30654r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f30657x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ruVar2.getLayoutParams();
            layoutParams.height = i13;
            ruVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f30649a);
            }
            ow0 ow0Var = this.f30652f;
            if (ow0Var != null) {
                this.f30656w = i13;
                ow0Var.requestLayout();
                rm0Var.a(R.drawable.input_keyboard, true);
                this.f30652f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f30650b != null) {
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
        ow0 ow0Var2 = this.f30652f;
        if (ow0Var2 != null) {
            if (i10 == 0) {
                this.f30656w = 0;
                this.R = 0.0f;
            }
            ow0Var2.requestLayout();
            this.f30652f.getHeight();
        }
    }

    public vu(Context context, ow0 ow0Var, org.telegram.ui.ActionBar.m2 m2Var, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.t6(this, 9);
        this.U = 2;
        this.I = z10;
        this.M = c6Var;
        this.L = i10;
        this.h = m2Var;
        this.f30652f = ow0Var;
        ow0Var.f28101r.add(this);
        qu quVar = new qu(this, context, c6Var, i10);
        this.f30649a = quVar;
        quVar.setImeOptions(268435456);
        quVar.setInputType(quVar.getInputType() | 16384);
        quVar.setFocusable(quVar.isEnabled());
        quVar.setCursorSize(AndroidUtilities.dp(20.0f));
        quVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        quVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        if (i10 == 0) {
            quVar.setTextSize(1, 18.0f);
            quVar.setMaxLines(4);
            quVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            quVar.setBackground(null);
            quVar.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20028k6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20045l6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20122p7, c6Var));
            quVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            quVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
            quVar.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20242vf, c6Var));
            quVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(quVar, w7.a6.a(-2.0f, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f, -1, 19));
        } else if (i10 == 2 || i10 == 3) {
            quVar.setTextSize(1, 16.0f);
            quVar.setMaxLines(8);
            quVar.setGravity(19);
            quVar.setAllowTextEntitiesIntersection(true);
            quVar.setHintTextColor(-1929379841);
            quVar.setTextColor(-1);
            quVar.setCursorColor(-1);
            quVar.setBackground(null);
            quVar.setClipToPadding(false);
            quVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            quVar.setHandlesColor(-1);
            quVar.setHighlightColor(822083583);
            quVar.setLinkTextColor(-12147733);
            quVar.quoteColor = -1;
            quVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(quVar, w7.a6.a(-1.0f, 40.0f, 0.0f, 24.0f, 0.0f, -1, 19));
        } else if (i10 == 4) {
            quVar.setTextSize(1, 18.0f);
            quVar.setMaxLines(4);
            quVar.setGravity(19);
            quVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20196t5, c6Var));
            quVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, c6Var));
            quVar.setBackground(null);
            quVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(quVar, w7.a6.a(-1.0f, 14.0f, 0.0f, 48.0f, 0.0f, -1, 19));
        } else {
            quVar.setTextSize(1, 18.0f);
            quVar.setMaxLines(4);
            quVar.setGravity(19);
            quVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20196t5, c6Var));
            quVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, c6Var));
            quVar.setBackground(null);
            quVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(quVar, w7.a6.a(-1.0f, 48.0f, 0.0f, 0.0f, 0.0f, -1, 19));
        }
        ig.k kVar = new ig.k(this, context);
        this.f30650b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        rm0 rm0Var = new rm0(context);
        this.f30651c = rm0Var;
        kVar.setImageDrawable(rm0Var);
        if (i10 == 0) {
            rm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            rm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.a6.a(48.0f, 0.0f, 0.0f, 0.0f, 5.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        } else if (i10 == 2 || i10 == 3) {
            rm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        } else if (i10 == 4) {
            rm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 53));
        } else if (i10 == 5) {
            rm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f7, c6Var), PorterDuff.Mode.MULTIPLY));
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        } else {
            rm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        }
        kVar.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 1, -1));
        kVar.setOnClickListener(new bi.x(this, ow0Var, c6Var, 21));
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

    public void setDelegate(uu uuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, ru ruVar) {
    }

    public void q(int i10, int i11) {
    }
}
