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
public class mu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, lw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.p1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.d6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.t6 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final hu f28793a;
    public final hg.l f28794b;
    public final hm0 f28795c;
    public iu d;
    public boolean f28796e;
    public mw0 f28797f;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f28798n;
    public int f28799r;
    public int f28800s;
    public boolean v;
    public int f28801w;
    public boolean f28802x;
    public boolean f28803y;

    public mu(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.to toVar) {
        this(context, jdVar, toVar, 0, false, null);
    }

    @Override
    public final void F(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f28800s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f28800s).commit();
            } else {
                this.f28799r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f28799r).commit();
            }
        }
        boolean z12 = false;
        if (this.f28796e) {
            if (z10) {
                i11 = this.f28800s;
            } else {
                i11 = this.f28799r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f28802x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                mw0 mw0Var = this.f28797f;
                if (mw0Var != null) {
                    this.f28801w = layoutParams.height;
                    mw0Var.requestLayout();
                    this.f28797f.getHeight();
                    if (this.T != this.f28802x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f28802x;
        int i17 = this.G;
        boolean z13 = true;
        hu huVar = this.f28793a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (huVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f28797f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        z13 = (!huVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.f28796e) {
            x(0);
        }
        if (this.f28801w != 0 && !(z11 = this.v) && z11 != z14 && !this.f28796e) {
            this.f28801w = 0;
            this.f28797f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f28797f.getHeight();
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
        AndroidUtilities.hideKeyboard(this.f28793a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            iu iuVar = this.d;
            if (iuVar != null) {
                iuVar.P.g1();
            }
            hu huVar = this.f28793a;
            if (huVar != null) {
                int currentTextColor = huVar.getCurrentTextColor();
                huVar.setTextColor(-1);
                huVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        iu iuVar = this.d;
        if (iuVar != null && iuVar.f29194c1 != UserConfig.selectedAccount) {
            this.f28797f.removeView(iuVar);
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
        iu iuVar2 = new iu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = iuVar2;
        iuVar2.f29192c = this.U;
        iuVar2.U0 = this.Q;
        iuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ku(this));
        this.f28797f.addView(this.d);
    }

    public eu getEditText() {
        return this.f28793a;
    }

    public View getEmojiButton() {
        return this.f28794b;
    }

    public int getEmojiPadding() {
        return this.f28801w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public nz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f28800s;
        } else {
            i10 = this.f28799r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f28802x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f28793a.getText();
    }

    public int h() {
        return q5.g();
    }

    public final void j() {
        iu iuVar;
        if (!this.f28796e && (iuVar = this.d) != null && iuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f28801w = 0;
        boolean z10 = this.f28802x;
        this.f28802x = false;
        if (z10) {
            iu iuVar2 = this.d;
            if (iuVar2 != null) {
                iuVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f28796e) {
            x(0);
        }
        if (z10) {
            iu iuVar = this.d;
            if (iuVar != null && iuVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new r8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21452w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f28802x;
        this.f28802x = false;
        if (z11) {
            iu iuVar2 = this.d;
            if (iuVar2 != null) {
                iuVar2.t(false);
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
        iu iuVar = this.d;
        if (iuVar != null && iuVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f28793a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f28803y = true;
        iu iuVar = this.d;
        if (iuVar != null && (observersGroup = iuVar.G2) != null) {
            observersGroup.removeAllObservers();
            iuVar.G2 = null;
        }
        mw0 mw0Var = this.f28797f;
        if (mw0Var != null) {
            mw0Var.f28850r.remove(this);
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
            hu huVar = this.f28793a;
            huVar.requestFocus();
            AndroidUtilities.showKeyboard(huVar);
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
        iu iuVar = this.d;
        if (iuVar != null) {
            iuVar.f29192c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        hu huVar = this.f28793a;
        huVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f28794b.setVisibility(i10);
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
            huVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        huVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f28793a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f28793a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f28793a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f28793a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f28793a.setSelection(i10);
    }

    public void setSizeNotifierLayout(mw0 mw0Var) {
        mw0 mw0Var2 = this.f28797f;
        if (mw0Var2 != null) {
            mw0Var2.f28850r.remove(this);
        }
        this.f28797f = mw0Var;
        mw0Var.f28850r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        hu huVar = this.f28793a;
        int inputType = huVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (huVar.getInputType() != i10) {
            huVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f28793a.setText(charSequence);
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
        hu huVar = this.f28793a;
        huVar.requestFocus();
        AndroidUtilities.showKeyboard(huVar);
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
        this.f28793a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        hm0 hm0Var = this.f28795c;
        int i12 = 0;
        if (i10 == 1) {
            iu iuVar = this.d;
            if (iuVar != null) {
                iuVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f28796e = true;
            this.R = 1.0f;
            iu iuVar2 = this.d;
            if (this.f28799r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f28799r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f28799r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f28800s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f28800s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f28800s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f28800s;
            } else {
                i11 = this.f28799r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f28802x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iuVar2.getLayoutParams();
            layoutParams.height = i13;
            iuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f28793a);
            }
            mw0 mw0Var = this.f28797f;
            if (mw0Var != null) {
                this.f28801w = i13;
                mw0Var.requestLayout();
                hm0Var.a(R.drawable.input_keyboard, true);
                this.f28797f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f28794b != null) {
            if (this.L == 0) {
                hm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                hm0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f28796e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        mw0 mw0Var2 = this.f28797f;
        if (mw0Var2 != null) {
            if (i10 == 0) {
                this.f28801w = 0;
                this.R = 0.0f;
            }
            mw0Var2.requestLayout();
            this.f28797f.getHeight();
        }
    }

    public mu(Context context, mw0 mw0Var, org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.t6(this, 10);
        this.U = 2;
        this.I = z10;
        this.M = d6Var;
        this.L = i10;
        this.h = n2Var;
        this.f28797f = mw0Var;
        mw0Var.f28850r.add(this);
        hu huVar = new hu(this, context, d6Var, i10);
        this.f28793a = huVar;
        huVar.setImeOptions(268435456);
        huVar.setInputType(huVar.getInputType() | 16384);
        huVar.setFocusable(huVar.isEnabled());
        huVar.setCursorSize(AndroidUtilities.dp(20.0f));
        huVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        huVar.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        if (i10 == 0) {
            huVar.setTextSize(1, 18.0f);
            huVar.setMaxLines(4);
            huVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            huVar.setBackground(null);
            huVar.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20956k6, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20974l6, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21049p7, d6Var));
            huVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
            huVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21170vf, d6Var));
            huVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(huVar, w7.z5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            huVar.setTextSize(1, 16.0f);
            huVar.setMaxLines(8);
            huVar.setGravity(19);
            huVar.setAllowTextEntitiesIntersection(true);
            huVar.setHintTextColor(-1929379841);
            huVar.setTextColor(-1);
            huVar.setCursorColor(-1);
            huVar.setBackground(null);
            huVar.setClipToPadding(false);
            huVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            huVar.setHandlesColor(-1);
            huVar.setHighlightColor(822083583);
            huVar.setLinkTextColor(-12147733);
            huVar.quoteColor = -1;
            huVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(huVar, w7.z5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            huVar.setTextSize(1, 18.0f);
            huVar.setMaxLines(4);
            huVar.setGravity(19);
            huVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21125t5, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20935j5, d6Var));
            huVar.setBackground(null);
            huVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(huVar, w7.z5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            huVar.setTextSize(1, 18.0f);
            huVar.setMaxLines(4);
            huVar.setGravity(19);
            huVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21125t5, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20935j5, d6Var));
            huVar.setBackground(null);
            huVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(huVar, w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        hg.l lVar = new hg.l(this, context);
        this.f28794b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        hm0 hm0Var = new hm0(context);
        this.f28795c = hm0Var;
        lVar.setImageDrawable(hm0Var);
        if (i10 == 0) {
            hm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            hm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            hm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            hm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            hm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            hm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            hm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f7, d6Var), PorterDuff.Mode.MULTIPLY));
            hm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            hm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            hm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20918i6, d6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, mw0Var, d6Var, 21));
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

    public void setDelegate(lu luVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, iu iuVar) {
    }

    public void q(int i10, int i11) {
    }
}
