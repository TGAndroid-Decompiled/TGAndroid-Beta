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
public class ku extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, zv0 {
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
    public final fu f25880a;
    public final hg.l f25881b;
    public final bm0 f25882c;
    public gu d;
    public boolean e;
    public aw0 f25883f;
    public final org.telegram.ui.ActionBar.m2 h;
    public boolean f25884n;
    public int f25885r;
    public int f25886s;
    public boolean v;
    public int f25887w;
    public boolean f25888x;
    public boolean f25889y;

    public ku(Context context, org.telegram.ui.hd hdVar, org.telegram.ui.ro roVar) {
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
                this.f25886s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f25886s).commit();
            } else {
                this.f25885r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f25885r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f25886s;
            } else {
                i11 = this.f25885r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f25888x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                aw0 aw0Var = this.f25883f;
                if (aw0Var != null) {
                    this.f25887w = layoutParams.height;
                    aw0Var.requestLayout();
                    this.f25883f.getHeight();
                    if (this.T != this.f25888x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f25888x;
        int i17 = this.G;
        boolean z13 = true;
        fu fuVar = this.f25880a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (fuVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f25883f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        z13 = (!fuVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f25887w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f25887w = 0;
            this.f25883f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f25883f.getHeight();
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
        AndroidUtilities.hideKeyboard(this.f25880a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            gu guVar = this.d;
            if (guVar != null) {
                guVar.P.f1();
            }
            fu fuVar = this.f25880a;
            if (fuVar != null) {
                int currentTextColor = fuVar.getCurrentTextColor();
                fuVar.setTextColor(-1);
                fuVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        gu guVar = this.d;
        if (guVar != null && guVar.f26236c1 != UserConfig.selectedAccount) {
            this.f25883f.removeView(guVar);
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
        gu guVar2 = new gu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = guVar2;
        guVar2.f26234c = this.U;
        guVar2.U0 = this.Q;
        guVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new iu(this));
        this.f25883f.addView(this.d);
    }

    public cu getEditText() {
        return this.f25880a;
    }

    public View getEmojiButton() {
        return this.f25881b;
    }

    public int getEmojiPadding() {
        return this.f25887w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public lz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f25886s;
        } else {
            i10 = this.f25885r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f25888x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f25880a.getText();
    }

    public int h() {
        return q5.g();
    }

    public final void j() {
        gu guVar;
        if (!this.e && (guVar = this.d) != null && guVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f25887w = 0;
        boolean z10 = this.f25888x;
        this.f25888x = false;
        if (z10) {
            gu guVar2 = this.d;
            if (guVar2 != null) {
                guVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            gu guVar = this.d;
            if (guVar != null && guVar.getVisibility() == 0 && !this.N) {
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
        boolean z11 = this.f25888x;
        this.f25888x = false;
        if (z11) {
            gu guVar2 = this.d;
            if (guVar2 != null) {
                guVar2.t(false);
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
        gu guVar = this.d;
        if (guVar != null && guVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f25880a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f25889y = true;
        gu guVar = this.d;
        if (guVar != null && (observersGroup = guVar.I2) != null) {
            observersGroup.removeAllObservers();
            guVar.I2 = null;
        }
        aw0 aw0Var = this.f25883f;
        if (aw0Var != null) {
            aw0Var.f22807r.remove(this);
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
            fu fuVar = this.f25880a;
            fuVar.requestFocus();
            AndroidUtilities.showKeyboard(fuVar);
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
        gu guVar = this.d;
        if (guVar != null) {
            guVar.f26234c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        fu fuVar = this.f25880a;
        fuVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f25881b.setVisibility(i10);
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
            fuVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        fuVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f25880a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f25880a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f25880a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f25880a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f25880a.setSelection(i10);
    }

    public void setSizeNotifierLayout(aw0 aw0Var) {
        aw0 aw0Var2 = this.f25883f;
        if (aw0Var2 != null) {
            aw0Var2.f22807r.remove(this);
        }
        this.f25883f = aw0Var;
        aw0Var.f22807r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        fu fuVar = this.f25880a;
        int inputType = fuVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (fuVar.getInputType() != i10) {
            fuVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f25880a.setText(charSequence);
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
        fu fuVar = this.f25880a;
        fuVar.requestFocus();
        AndroidUtilities.showKeyboard(fuVar);
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
        this.f25880a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        bm0 bm0Var = this.f25882c;
        int i12 = 0;
        if (i10 == 1) {
            gu guVar = this.d;
            if (guVar != null) {
                guVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            gu guVar2 = this.d;
            if (this.f25885r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25885r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25885r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f25886s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25886s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25886s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f25886s;
            } else {
                i11 = this.f25885r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f25888x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) guVar2.getLayoutParams();
            layoutParams.height = i13;
            guVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f25880a);
            }
            aw0 aw0Var = this.f25883f;
            if (aw0Var != null) {
                this.f25887w = i13;
                aw0Var.requestLayout();
                bm0Var.a(R.drawable.input_keyboard, true);
                this.f25883f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f25881b != null) {
            if (this.L == 0) {
                bm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                bm0Var.a(R.drawable.input_smile, true);
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
        aw0 aw0Var2 = this.f25883f;
        if (aw0Var2 != null) {
            if (i10 == 0) {
                this.f25887w = 0;
                this.R = 0.0f;
            }
            aw0Var2.requestLayout();
            this.f25883f.getHeight();
        }
    }

    public ku(Context context, aw0 aw0Var, org.telegram.ui.ActionBar.m2 m2Var, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.t6(this, 10);
        this.U = 2;
        this.I = z10;
        this.M = d6Var;
        this.L = i10;
        this.h = m2Var;
        this.f25883f = aw0Var;
        aw0Var.f22807r.add(this);
        fu fuVar = new fu(this, context, d6Var, i10);
        this.f25880a = fuVar;
        fuVar.setImeOptions(268435456);
        fuVar.setInputType(fuVar.getInputType() | 16384);
        fuVar.setFocusable(fuVar.isEnabled());
        fuVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fuVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        fuVar.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (i10 == 0) {
            fuVar.setTextSize(1, 18.0f);
            fuVar.setMaxLines(4);
            fuVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            fuVar.setBackground(null);
            fuVar.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19186k6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19204l6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19279p7, d6Var));
            fuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            fuVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            fuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19398vf, d6Var));
            fuVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(fuVar, w7.y5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            fuVar.setTextSize(1, 16.0f);
            fuVar.setMaxLines(8);
            fuVar.setGravity(19);
            fuVar.setAllowTextEntitiesIntersection(true);
            fuVar.setHintTextColor(-1929379841);
            fuVar.setTextColor(-1);
            fuVar.setCursorColor(-1);
            fuVar.setBackground(null);
            fuVar.setClipToPadding(false);
            fuVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            fuVar.setHandlesColor(-1);
            fuVar.setHighlightColor(822083583);
            fuVar.setLinkTextColor(-12147733);
            fuVar.quoteColor = -1;
            fuVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(fuVar, w7.y5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            fuVar.setTextSize(1, 18.0f);
            fuVar.setMaxLines(4);
            fuVar.setGravity(19);
            fuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19353t5, d6Var));
            fuVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165j5, d6Var));
            fuVar.setBackground(null);
            fuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(fuVar, w7.y5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            fuVar.setTextSize(1, 18.0f);
            fuVar.setMaxLines(4);
            fuVar.setGravity(19);
            fuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19353t5, d6Var));
            fuVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165j5, d6Var));
            fuVar.setBackground(null);
            fuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(fuVar, w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        hg.l lVar = new hg.l(this, context);
        this.f25881b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bm0 bm0Var = new bm0(context);
        this.f25882c = bm0Var;
        lVar.setImageDrawable(bm0Var);
        if (i10 == 0) {
            bm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            bm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.y5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            bm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            bm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            bm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            bm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            bm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f7, d6Var), PorterDuff.Mode.MULTIPLY));
            bm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            bm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            bm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, aw0Var, d6Var, 21));
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

    public void setDelegate(ju juVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, gu guVar) {
    }

    public void q(int i10, int i11) {
    }
}
