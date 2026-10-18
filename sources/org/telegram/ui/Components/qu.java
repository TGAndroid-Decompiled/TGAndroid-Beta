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
public class qu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, iw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.o1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.d6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.k7 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final lu f29749a;
    public final ig.k f29750b;
    public final nm0 f29751c;
    public mu d;
    public boolean e;
    public jw0 f29752f;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f29753n;
    public int f29754r;
    public int f29755s;
    public boolean v;
    public int f29756w;
    public boolean f29757x;
    public boolean f29758y;

    public qu(Context context, org.telegram.ui.kd kdVar, org.telegram.ui.ko koVar) {
        this(context, kdVar, koVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f29755s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f29755s).commit();
            } else {
                this.f29754r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f29754r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f29755s;
            } else {
                i11 = this.f29754r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f29757x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                jw0 jw0Var = this.f29752f;
                if (jw0Var != null) {
                    this.f29756w = layoutParams.height;
                    jw0Var.requestLayout();
                    this.f29752f.getHeight();
                    if (this.T != this.f29757x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f29757x;
        int i17 = this.G;
        boolean z13 = true;
        lu luVar = this.f29749a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (luVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f29752f.getHeight();
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
        if (this.f29756w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f29756w = 0;
            this.f29752f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f29752f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.r30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f29749a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            mu muVar = this.d;
            if (muVar != null) {
                muVar.P.f1();
            }
            lu luVar = this.f29749a;
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
        if (muVar != null && muVar.f30754c1 != UserConfig.selectedAccount) {
            this.f29752f.removeView(muVar);
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
        muVar2.f30752c = this.U;
        muVar2.U0 = this.Q;
        muVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ou(this));
        this.f29752f.addView(this.d);
    }

    public iu getEditText() {
        return this.f29749a;
    }

    public View getEmojiButton() {
        return this.f29750b;
    }

    public int getEmojiPadding() {
        return this.f29756w;
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
            i10 = this.f29755s;
        } else {
            i10 = this.f29754r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f29757x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f29749a.getText();
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
        this.f29756w = 0;
        boolean z10 = this.f29757x;
        this.f29757x = false;
        if (z10) {
            mu muVar2 = this.d;
            if (muVar2 != null) {
                muVar2.t(false);
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
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new org.telegram.ui.pq(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21635w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f29757x;
        this.f29757x = false;
        if (z11) {
            mu muVar2 = this.d;
            if (muVar2 != null) {
                muVar2.t(false);
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
        return this.f29749a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f29758y = true;
        mu muVar = this.d;
        if (muVar != null && (observersGroup = muVar.I2) != null) {
            observersGroup.removeAllObservers();
            muVar.I2 = null;
        }
        jw0 jw0Var = this.f29752f;
        if (jw0Var != null) {
            jw0Var.f27639r.remove(this);
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
            lu luVar = this.f29749a;
            luVar.requestFocus();
            AndroidUtilities.showKeyboard(luVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.k7 k7Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(k7Var);
                AndroidUtilities.runOnUIThread(k7Var, 100L);
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
            muVar.f30752c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        lu luVar = this.f29749a;
        luVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f29750b.setVisibility(i10);
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
        this.f29749a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f29749a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f29749a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f29749a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f29749a.setSelection(i10);
    }

    public void setSizeNotifierLayout(jw0 jw0Var) {
        jw0 jw0Var2 = this.f29752f;
        if (jw0Var2 != null) {
            jw0Var2.f27639r.remove(this);
        }
        this.f29752f = jw0Var;
        jw0Var.f27639r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        lu luVar = this.f29749a;
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
        this.f29749a.setText(charSequence);
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
        lu luVar = this.f29749a;
        luVar.requestFocus();
        AndroidUtilities.showKeyboard(luVar);
        if (this.E) {
            this.F = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.N = true;
            org.telegram.ui.Cells.k7 k7Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(k7Var);
            AndroidUtilities.runOnUIThread(k7Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f29749a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        nm0 nm0Var = this.f29751c;
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
            if (this.f29754r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f29754r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f29754r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f29755s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f29755s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f29755s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f29755s;
            } else {
                i11 = this.f29754r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f29757x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) muVar2.getLayoutParams();
            layoutParams.height = i13;
            muVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f29749a);
            }
            jw0 jw0Var = this.f29752f;
            if (jw0Var != null) {
                this.f29756w = i13;
                jw0Var.requestLayout();
                nm0Var.a(R.drawable.input_keyboard, true);
                this.f29752f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f29750b != null) {
            if (this.L == 0) {
                nm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                nm0Var.a(R.drawable.input_smile, true);
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
        jw0 jw0Var2 = this.f29752f;
        if (jw0Var2 != null) {
            if (i10 == 0) {
                this.f29756w = 0;
                this.R = 0.0f;
            }
            jw0Var2.requestLayout();
            this.f29752f.getHeight();
        }
    }

    public qu(Context context, jw0 jw0Var, org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.k7(this, 8);
        this.U = 2;
        this.I = z10;
        this.M = d6Var;
        this.L = i10;
        this.h = n2Var;
        this.f29752f = jw0Var;
        jw0Var.f27639r.add(this);
        lu luVar = new lu(this, context, d6Var, i10);
        this.f29749a = luVar;
        luVar.setImeOptions(268435456);
        luVar.setInputType(luVar.getInputType() | 16384);
        luVar.setFocusable(luVar.isEnabled());
        luVar.setCursorSize(AndroidUtilities.dp(20.0f));
        luVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        luVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        if (i10 == 0) {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            luVar.setBackground(null);
            luVar.setLineColors(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21120k6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21137l6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21214p7, d6Var));
            luVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
            luVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21335vf, d6Var));
            luVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(luVar, w7.z5.a(-2.0f, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f, -1, 19));
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
            addView(luVar, w7.z5.a(-1.0f, 40.0f, 0.0f, 24.0f, 0.0f, -1, 19));
        } else if (i10 == 4) {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity(19);
            luVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21288t5, d6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21099j5, d6Var));
            luVar.setBackground(null);
            luVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(luVar, w7.z5.a(-1.0f, 14.0f, 0.0f, 48.0f, 0.0f, -1, 19));
        } else {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity(19);
            luVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21288t5, d6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21099j5, d6Var));
            luVar.setBackground(null);
            luVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(luVar, w7.z5.a(-1.0f, 48.0f, 0.0f, 0.0f, 0.0f, -1, 19));
        }
        ig.k kVar = new ig.k(this, context);
        this.f29750b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        nm0 nm0Var = new nm0(context);
        this.f29751c = nm0Var;
        kVar.setImageDrawable(nm0Var);
        if (i10 == 0) {
            nm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            nm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 5.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        } else if (i10 == 2 || i10 == 3) {
            nm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            nm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        } else if (i10 == 4) {
            nm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            nm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 53));
        } else if (i10 == 5) {
            nm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f7, d6Var), PorterDuff.Mode.MULTIPLY));
            nm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        } else {
            nm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            nm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        }
        kVar.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, d6Var), 1, -1));
        kVar.setOnClickListener(new ai.v0(this, jw0Var, d6Var, 24));
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

    public void setDelegate(pu puVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, mu muVar) {
    }

    public void q(int i10, int i11) {
    }
}
