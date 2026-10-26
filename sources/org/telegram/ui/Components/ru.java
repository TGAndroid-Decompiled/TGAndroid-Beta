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
public class ru extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, uw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.q1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.u6 M;
    public boolean N;
    public boolean O;
    public final m.g3 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final mu f32325a;
    public final jg.l f32326b;
    public final um0 f32327c;
    public nu d;
    public boolean e;
    public vw0 f32328f;
    public final org.telegram.ui.ActionBar.r2 h;
    public boolean f32329n;
    public int f32330r;
    public int f32331s;
    public boolean v;
    public int f32332w;
    public boolean f32333x;
    public boolean f32334y;

    public ru(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.mo moVar) {
        this(context, jdVar, moVar, 0, false, null);
    }

    @Override
    public final void I(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f32331s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f32331s).commit();
            } else {
                this.f32330r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f32330r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f32331s;
            } else {
                i11 = this.f32330r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f32333x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                vw0 vw0Var = this.f32328f;
                if (vw0Var != null) {
                    this.f32332w = layoutParams.height;
                    vw0Var.requestLayout();
                    this.f32328f.getHeight();
                    if (this.T != this.f32333x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f32333x;
        int i17 = this.G;
        boolean z13 = true;
        mu muVar = this.f32325a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (muVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f32328f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        if (!muVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f32332w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f32332w = 0;
            this.f32328f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f32328f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.u30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f32325a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            nu nuVar = this.d;
            if (nuVar != null) {
                nuVar.P.g1();
            }
            mu muVar = this.f32325a;
            if (muVar != null) {
                int currentTextColor = muVar.getCurrentTextColor();
                muVar.setTextColor(-1);
                muVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        nu nuVar = this.d;
        if (nuVar != null && nuVar.f32719c1 != UserConfig.selectedAccount) {
            this.f32328f.removeView(nuVar);
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
        nu nuVar2 = new nu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = nuVar2;
        nuVar2.f32717c = this.U;
        nuVar2.U0 = this.Q;
        nuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new pu(this));
        this.f32328f.addView(this.d);
    }

    public ju getEditText() {
        return this.f32325a;
    }

    public View getEmojiButton() {
        return this.f32326b;
    }

    public int getEmojiPadding() {
        return this.f32332w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public sz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f32331s;
        } else {
            i10 = this.f32330r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f32333x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f32325a.getText();
    }

    public int h() {
        return t5.g();
    }

    public final void j() {
        nu nuVar;
        if (!this.e && (nuVar = this.d) != null && nuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f32332w = 0;
        boolean z10 = this.f32333x;
        this.f32333x = false;
        if (z10) {
            nu nuVar2 = this.d;
            if (nuVar2 != null) {
                nuVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            nu nuVar = this.d;
            if (nuVar != null && nuVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.u2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new org.telegram.ui.qp(this, 23));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f32333x;
        this.f32333x = false;
        if (z11) {
            nu nuVar2 = this.d;
            if (nuVar2 != null) {
                nuVar2.t(false);
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
        nu nuVar = this.d;
        if (nuVar != null && nuVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f32325a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f32334y = true;
        nu nuVar = this.d;
        if (nuVar != null && (observersGroup = nuVar.M2) != null) {
            observersGroup.removeAllObservers();
            nuVar.M2 = null;
        }
        vw0 vw0Var = this.f32328f;
        if (vw0Var != null) {
            vw0Var.f34290r.remove(this);
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
            mu muVar = this.f32325a;
            muVar.requestFocus();
            AndroidUtilities.showKeyboard(muVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                m.g3 g3Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(g3Var);
                AndroidUtilities.runOnUIThread(g3Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.K = q1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        nu nuVar = this.d;
        if (nuVar != null) {
            nuVar.f32717c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        mu muVar = this.f32325a;
        muVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f32326b.setVisibility(i10);
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
            muVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        muVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f32325a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f32325a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f32325a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f32325a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f32325a.setSelection(i10);
    }

    public void setSizeNotifierLayout(vw0 vw0Var) {
        vw0 vw0Var2 = this.f32328f;
        if (vw0Var2 != null) {
            vw0Var2.f34290r.remove(this);
        }
        this.f32328f = vw0Var;
        vw0Var.f34290r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        mu muVar = this.f32325a;
        int inputType = muVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (muVar.getInputType() != i10) {
            muVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f32325a.setText(charSequence);
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
        mu muVar = this.f32325a;
        muVar.requestFocus();
        AndroidUtilities.showKeyboard(muVar);
        if (this.E) {
            this.F = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.N = true;
            m.g3 g3Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            AndroidUtilities.runOnUIThread(g3Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f32325a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        um0 um0Var = this.f32327c;
        int i12 = 0;
        if (i10 == 1) {
            nu nuVar = this.d;
            if (nuVar != null) {
                nuVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            nu nuVar2 = this.d;
            if (this.f32330r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f32330r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f32330r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f32331s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f32331s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f32331s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f32331s;
            } else {
                i11 = this.f32330r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f32333x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nuVar2.getLayoutParams();
            layoutParams.height = i13;
            nuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f32325a);
            }
            vw0 vw0Var = this.f32328f;
            if (vw0Var != null) {
                this.f32332w = i13;
                vw0Var.requestLayout();
                um0Var.a(R.drawable.input_keyboard, true);
                this.f32328f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f32326b != null) {
            if (this.L == 0) {
                um0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                um0Var.a(R.drawable.input_smile, true);
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
        vw0 vw0Var2 = this.f32328f;
        if (vw0Var2 != null) {
            if (i10 == 0) {
                this.f32332w = 0;
                this.R = 0.0f;
            }
            vw0Var2.requestLayout();
            this.f32328f.getHeight();
        }
    }

    public ru(Context context, vw0 vw0Var, org.telegram.ui.ActionBar.r2 r2Var, int i10, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.E = true;
        this.P = new m.g3(this, 14);
        this.U = 2;
        this.I = z10;
        this.M = u6Var;
        this.L = i10;
        this.h = r2Var;
        this.f32328f = vw0Var;
        vw0Var.f34290r.add(this);
        mu muVar = new mu(this, context, u6Var, i10);
        this.f32325a = muVar;
        muVar.setImeOptions(268435456);
        muVar.setInputType(muVar.getInputType() | 16384);
        muVar.setFocusable(muVar.isEnabled());
        muVar.setCursorSize(AndroidUtilities.dp(20.0f));
        muVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.m(muVar, 30, i11, u6Var);
        if (i10 == 0) {
            muVar.setTextSize(1, 18.0f);
            muVar.setMaxLines(4);
            muVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            muVar.setBackground(null);
            org.telegram.ui.ActionBar.f7.G(muVar, org.telegram.ui.ActionBar.y6.f23484k6, org.telegram.ui.ActionBar.y6.f23502l6, org.telegram.ui.ActionBar.y6.f23581p7, u6Var);
            org.telegram.ui.ActionBar.f7.E(muVar, org.telegram.ui.ActionBar.y6.H6, u6Var);
            org.telegram.ui.ActionBar.f7.V(muVar, i11, u6Var);
            org.telegram.ui.ActionBar.f7.m(muVar, 36, org.telegram.ui.ActionBar.y6.f23700vf, u6Var);
            muVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(muVar, gb1.h(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            muVar.setTextSize(1, 16.0f);
            muVar.setMaxLines(8);
            muVar.setGravity(19);
            muVar.setAllowTextEntitiesIntersection(true);
            muVar.setHintTextColor(-1929379841);
            muVar.setTextColor(-1);
            muVar.setCursorColor(-1);
            muVar.setBackground(null);
            muVar.setClipToPadding(false);
            muVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            muVar.setHandlesColor(-1);
            muVar.setHighlightColor(822083583);
            muVar.setLinkTextColor(-12147733);
            muVar.quoteColor = -1;
            muVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(muVar, gb1.h(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            muVar.setTextSize(1, 18.0f);
            muVar.setMaxLines(4);
            muVar.setGravity(19);
            org.telegram.ui.ActionBar.f7.E(muVar, org.telegram.ui.ActionBar.y6.f23653t5, u6Var);
            org.telegram.ui.ActionBar.f7.V(muVar, org.telegram.ui.ActionBar.y6.f23464j5, u6Var);
            muVar.setBackground(null);
            muVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(muVar, gb1.h(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            muVar.setTextSize(1, 18.0f);
            muVar.setMaxLines(4);
            muVar.setGravity(19);
            org.telegram.ui.ActionBar.f7.E(muVar, org.telegram.ui.ActionBar.y6.f23653t5, u6Var);
            org.telegram.ui.ActionBar.f7.V(muVar, org.telegram.ui.ActionBar.y6.f23464j5, u6Var);
            muVar.setBackground(null);
            muVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(muVar, gb1.h(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        jg.l lVar = new jg.l(this, context);
        this.f32326b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        um0 um0Var = new um0(context);
        this.f32327c = um0Var;
        lVar.setImageDrawable(um0Var);
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f7.y(this, um0Var, org.telegram.ui.ActionBar.y6.Xd, u6Var, PorterDuff.Mode.MULTIPLY);
            um0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, gb1.h(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            um0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            um0Var.a(R.drawable.input_smile, false);
            addView(lVar, gb1.h(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.f7.y(this, um0Var, org.telegram.ui.ActionBar.y6.Xd, u6Var, PorterDuff.Mode.MULTIPLY);
            um0Var.a(R.drawable.input_smile, false);
            addView(lVar, gb1.h(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            org.telegram.ui.ActionBar.f7.y(this, um0Var, org.telegram.ui.ActionBar.y6.f7, u6Var, PorterDuff.Mode.MULTIPLY);
            um0Var.a(R.drawable.input_smile, false);
            addView(lVar, gb1.h(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.f7.y(this, um0Var, org.telegram.ui.ActionBar.y6.Xd, u6Var, PorterDuff.Mode.MULTIPLY);
            um0Var.a(R.drawable.input_smile, false);
            addView(lVar, gb1.h(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        lVar.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(lVar, g02, null, N, u6Var);
        lVar.setOnClickListener(new bi.w0(this, vw0Var, u6Var, 24));
        lVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void c(float f7) {
    }

    public void setDelegate(qu quVar) {
    }

    public void g(Canvas canvas, nu nuVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i10, int i11) {
    }
}
