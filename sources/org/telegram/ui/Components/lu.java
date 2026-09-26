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
public class lu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, aw0 {
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
    public final org.telegram.ui.Cells.t6 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final gu f26172a;
    public final hg.l f26173b;
    public final cm0 f26174c;
    public hu d;
    public boolean e;
    public bw0 f26175f;
    public final org.telegram.ui.ActionBar.m2 h;
    public boolean f26176n;
    public int f26177r;
    public int f26178s;
    public boolean v;
    public int f26179w;
    public boolean f26180x;
    public boolean f26181y;

    public lu(Context context, org.telegram.ui.hd hdVar, org.telegram.ui.ro roVar) {
        this(context, hdVar, roVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f26178s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26178s).commit();
            } else {
                this.f26177r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26177r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f26178s;
            } else {
                i11 = this.f26177r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f26180x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                bw0 bw0Var = this.f26175f;
                if (bw0Var != null) {
                    this.f26179w = layoutParams.height;
                    bw0Var.requestLayout();
                    this.f26175f.getHeight();
                    if (this.T != this.f26180x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f26180x;
        int i17 = this.G;
        boolean z13 = true;
        gu guVar = this.f26172a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (guVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f26175f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        z13 = (!guVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f26179w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f26179w = 0;
            this.f26175f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f26175f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.d40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f26172a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            hu huVar = this.d;
            if (huVar != null) {
                huVar.P.f1();
            }
            gu guVar = this.f26172a;
            if (guVar != null) {
                int currentTextColor = guVar.getCurrentTextColor();
                guVar.setTextColor(-1);
                guVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        hu huVar = this.d;
        if (huVar != null && huVar.f26548c1 != UserConfig.selectedAccount) {
            this.f26175f.removeView(huVar);
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
        hu huVar2 = new hu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = huVar2;
        huVar2.f26546c = this.U;
        huVar2.U0 = this.Q;
        huVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ju(this));
        this.f26175f.addView(this.d);
    }

    public du getEditText() {
        return this.f26172a;
    }

    public View getEmojiButton() {
        return this.f26173b;
    }

    public int getEmojiPadding() {
        return this.f26179w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public mz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f26178s;
        } else {
            i10 = this.f26177r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f26180x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f26172a.getText();
    }

    public int h() {
        return q5.g();
    }

    public final void j() {
        hu huVar;
        if (!this.e && (huVar = this.d) != null && huVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f26179w = 0;
        boolean z10 = this.f26180x;
        this.f26180x = false;
        if (z10) {
            hu huVar2 = this.d;
            if (huVar2 != null) {
                huVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            hu huVar = this.d;
            if (huVar != null && huVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new r8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f19668w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f26180x;
        this.f26180x = false;
        if (z11) {
            hu huVar2 = this.d;
            if (huVar2 != null) {
                huVar2.t(false);
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
        hu huVar = this.d;
        if (huVar != null && huVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f26172a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f26181y = true;
        hu huVar = this.d;
        if (huVar != null && (observersGroup = huVar.I2) != null) {
            observersGroup.removeAllObservers();
            huVar.I2 = null;
        }
        bw0 bw0Var = this.f26175f;
        if (bw0Var != null) {
            bw0Var.f23140r.remove(this);
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
            gu guVar = this.f26172a;
            guVar.requestFocus();
            AndroidUtilities.showKeyboard(guVar);
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
        hu huVar = this.d;
        if (huVar != null) {
            huVar.f26546c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        gu guVar = this.f26172a;
        guVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f26173b.setVisibility(i10);
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
            guVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        guVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f26172a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f26172a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f26172a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f26172a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f26172a.setSelection(i10);
    }

    public void setSizeNotifierLayout(bw0 bw0Var) {
        bw0 bw0Var2 = this.f26175f;
        if (bw0Var2 != null) {
            bw0Var2.f23140r.remove(this);
        }
        this.f26175f = bw0Var;
        bw0Var.f23140r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        gu guVar = this.f26172a;
        int inputType = guVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (guVar.getInputType() != i10) {
            guVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26172a.setText(charSequence);
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
        gu guVar = this.f26172a;
        guVar.requestFocus();
        AndroidUtilities.showKeyboard(guVar);
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
        this.f26172a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        cm0 cm0Var = this.f26174c;
        int i12 = 0;
        if (i10 == 1) {
            hu huVar = this.d;
            if (huVar != null) {
                huVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            hu huVar2 = this.d;
            if (this.f26177r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f26177r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f26177r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f26178s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f26178s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f26178s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f26178s;
            } else {
                i11 = this.f26177r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f26180x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) huVar2.getLayoutParams();
            layoutParams.height = i13;
            huVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f26172a);
            }
            bw0 bw0Var = this.f26175f;
            if (bw0Var != null) {
                this.f26179w = i13;
                bw0Var.requestLayout();
                cm0Var.a(R.drawable.input_keyboard, true);
                this.f26175f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f26173b != null) {
            if (this.L == 0) {
                cm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                cm0Var.a(R.drawable.input_smile, true);
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
        bw0 bw0Var2 = this.f26175f;
        if (bw0Var2 != null) {
            if (i10 == 0) {
                this.f26179w = 0;
                this.R = 0.0f;
            }
            bw0Var2.requestLayout();
            this.f26175f.getHeight();
        }
    }

    public lu(Context context, bw0 bw0Var, org.telegram.ui.ActionBar.m2 m2Var, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.t6(this, 10);
        this.U = 2;
        this.I = z10;
        this.M = d6Var;
        this.L = i10;
        this.h = m2Var;
        this.f26175f = bw0Var;
        bw0Var.f23140r.add(this);
        gu guVar = new gu(this, context, d6Var, i10);
        this.f26172a = guVar;
        guVar.setImeOptions(268435456);
        guVar.setInputType(guVar.getInputType() | 16384);
        guVar.setFocusable(guVar.isEnabled());
        guVar.setCursorSize(AndroidUtilities.dp(20.0f));
        guVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        guVar.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (i10 == 0) {
            guVar.setTextSize(1, 18.0f);
            guVar.setMaxLines(4);
            guVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            guVar.setBackground(null);
            guVar.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19186k6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19204l6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19279p7, d6Var));
            guVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            guVar.setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19398vf, d6Var));
            guVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(guVar, w7.y5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            guVar.setTextSize(1, 16.0f);
            guVar.setMaxLines(8);
            guVar.setGravity(19);
            guVar.setAllowTextEntitiesIntersection(true);
            guVar.setHintTextColor(-1929379841);
            guVar.setTextColor(-1);
            guVar.setCursorColor(-1);
            guVar.setBackground(null);
            guVar.setClipToPadding(false);
            guVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            guVar.setHandlesColor(-1);
            guVar.setHighlightColor(822083583);
            guVar.setLinkTextColor(-12147733);
            guVar.quoteColor = -1;
            guVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(guVar, w7.y5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            guVar.setTextSize(1, 18.0f);
            guVar.setMaxLines(4);
            guVar.setGravity(19);
            guVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19353t5, d6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165j5, d6Var));
            guVar.setBackground(null);
            guVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(guVar, w7.y5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            guVar.setTextSize(1, 18.0f);
            guVar.setMaxLines(4);
            guVar.setGravity(19);
            guVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19353t5, d6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165j5, d6Var));
            guVar.setBackground(null);
            guVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(guVar, w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        hg.l lVar = new hg.l(this, context);
        this.f26173b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        cm0 cm0Var = new cm0(context);
        this.f26174c = cm0Var;
        lVar.setImageDrawable(cm0Var);
        if (i10 == 0) {
            cm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            cm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.y5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            cm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            cm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            cm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            cm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            cm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f7, d6Var), PorterDuff.Mode.MULTIPLY));
            cm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            cm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            cm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, bw0Var, d6Var, 21));
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

    public void setDelegate(ku kuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, hu huVar) {
    }

    public void q(int i10, int i11) {
    }
}
