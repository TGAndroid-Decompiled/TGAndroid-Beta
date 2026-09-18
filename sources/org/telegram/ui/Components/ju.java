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
public class ju extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.q1 K;
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
    public final eu f25433a;
    public final hg.k f25434b;
    public final rl0 f25435c;
    public fu d;
    public boolean e;
    public qv0 f25436f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean f25437n;
    public int f25438r;
    public int f25439s;
    public boolean v;
    public int f25440w;
    public boolean f25441x;
    public boolean f25442y;

    public ju(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.wo woVar) {
        this(context, jdVar, woVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f25439s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f25439s).commit();
            } else {
                this.f25438r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f25438r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f25439s;
            } else {
                i11 = this.f25438r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f25441x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                qv0 qv0Var = this.f25436f;
                if (qv0Var != null) {
                    this.f25440w = layoutParams.height;
                    qv0Var.requestLayout();
                    this.f25436f.getHeight();
                    if (this.T != this.f25441x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f25441x;
        int i17 = this.G;
        boolean z13 = true;
        eu euVar = this.f25433a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (euVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f25436f.getHeight();
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
        if (this.f25440w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f25440w = 0;
            this.f25436f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f25436f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.k40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f25433a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            fu fuVar = this.d;
            if (fuVar != null) {
                fuVar.P.g1();
            }
            eu euVar = this.f25433a;
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
        if (fuVar != null && fuVar.f25716c1 != UserConfig.selectedAccount) {
            this.f25436f.removeView(fuVar);
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
        fuVar2.f25714c = this.U;
        fuVar2.U0 = this.Q;
        fuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new hu(this));
        this.f25436f.addView(this.d);
    }

    public bu getEditText() {
        return this.f25433a;
    }

    public View getEmojiButton() {
        return this.f25434b;
    }

    public int getEmojiPadding() {
        return this.f25440w;
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
            i10 = this.f25439s;
        } else {
            i10 = this.f25438r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f25441x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f25433a.getText();
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
        this.f25440w = 0;
        boolean z10 = this.f25441x;
        this.f25441x = false;
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
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new p8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f19508w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f25441x;
        this.f25441x = false;
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
        return this.f25433a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f25442y = true;
        fu fuVar = this.d;
        if (fuVar != null && (observersGroup = fuVar.I2) != null) {
            observersGroup.removeAllObservers();
            fuVar.I2 = null;
        }
        qv0 qv0Var = this.f25436f;
        if (qv0Var != null) {
            qv0Var.f27435r.remove(this);
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
            eu euVar = this.f25433a;
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

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.K = q1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        fu fuVar = this.d;
        if (fuVar != null) {
            fuVar.f25714c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        eu euVar = this.f25433a;
        euVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f25434b.setVisibility(i10);
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
        this.f25433a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f25433a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f25433a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f25433a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f25433a.setSelection(i10);
    }

    public void setSizeNotifierLayout(qv0 qv0Var) {
        qv0 qv0Var2 = this.f25436f;
        if (qv0Var2 != null) {
            qv0Var2.f27435r.remove(this);
        }
        this.f25436f = qv0Var;
        qv0Var.f27435r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        eu euVar = this.f25433a;
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
        this.f25433a.setText(charSequence);
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
        eu euVar = this.f25433a;
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
        this.f25433a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        rl0 rl0Var = this.f25435c;
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
            if (this.f25438r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25438r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25438r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f25439s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25439s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25439s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f25439s;
            } else {
                i11 = this.f25438r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f25441x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fuVar2.getLayoutParams();
            layoutParams.height = i13;
            fuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f25433a);
            }
            qv0 qv0Var = this.f25436f;
            if (qv0Var != null) {
                this.f25440w = i13;
                qv0Var.requestLayout();
                rl0Var.a(R.drawable.input_keyboard, true);
                this.f25436f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f25434b != null) {
            if (this.L == 0) {
                rl0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                rl0Var.a(R.drawable.input_smile, true);
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
        qv0 qv0Var2 = this.f25436f;
        if (qv0Var2 != null) {
            if (i10 == 0) {
                this.f25440w = 0;
                this.R = 0.0f;
            }
            qv0Var2.requestLayout();
            this.f25436f.getHeight();
        }
    }

    public ju(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.l7(this, 9);
        this.U = 2;
        this.I = z10;
        this.M = f6Var;
        this.L = i10;
        this.h = o2Var;
        this.f25436f = qv0Var;
        qv0Var.f27435r.add(this);
        eu euVar = new eu(this, context, f6Var, i10);
        this.f25433a = euVar;
        euVar.setImeOptions(268435456);
        euVar.setInputType(euVar.getInputType() | 16384);
        euVar.setFocusable(euVar.isEnabled());
        euVar.setCursorSize(AndroidUtilities.dp(20.0f));
        euVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        euVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            euVar.setBackground(null);
            euVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18991k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19009l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19083p7, f6Var));
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            euVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19201vf, f6Var));
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
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19156t5, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18970j5, f6Var));
            euVar.setBackground(null);
            euVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity(19);
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19156t5, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18970j5, f6Var));
            euVar.setBackground(null);
            euVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        hg.k kVar = new hg.k(this, context);
        this.f25434b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        rl0 rl0Var = new rl0(context);
        this.f25435c = rl0Var;
        kVar.setImageDrawable(rl0Var);
        if (i10 == 0) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        kVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18953i6, f6Var), 1, -1));
        kVar.setOnClickListener(new ai.d0(this, qv0Var, f6Var, 21));
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
