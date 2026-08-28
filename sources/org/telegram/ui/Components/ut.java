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
public class ut extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, wu0 {
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public org.telegram.ui.ActionBar.q1 G;
    public final int H;
    public final org.telegram.ui.ActionBar.b6 I;
    public boolean J;
    public boolean K;
    public final m.i3 L;
    public boolean M;
    public float N;
    public boolean O;
    public boolean P;
    public int Q;
    public final pt f33121a;
    public final ge f33122b;
    public final bl0 f33123c;
    public qt d;
    public boolean f33124e;
    public xu0 f33125f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean f33126n;
    public int f33127r;
    public int f33128s;
    public boolean v;
    public int f33129w;
    public boolean f33130x;
    public boolean f33131y;

    public ut(Context context, org.telegram.ui.ed edVar, org.telegram.ui.ho hoVar) {
        this(context, edVar, hoVar, 0, false, null);
    }

    @Override
    public final void G(int i9, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        if (i9 > AndroidUtilities.dp(50.0f) && ((this.v || (i12 = this.H) == 2 || i12 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f33128s = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f33128s).commit();
            } else {
                this.f33127r = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f33127r).commit();
            }
        }
        boolean z12 = false;
        if (this.f33124e) {
            if (z10) {
                i10 = this.f33128s;
            } else {
                i10 = this.f33127r;
            }
            if (this.F) {
                i11 = AndroidUtilities.navigationBarHeight;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f33130x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = AndroidUtilities.displaySize.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                xu0 xu0Var = this.f33125f;
                if (xu0Var != null) {
                    this.f33129w = layoutParams.height;
                    xu0Var.requestLayout();
                    this.f33125f.getHeight();
                    if (this.P != this.f33130x) {
                        p();
                    }
                }
            }
        }
        this.P = this.f33130x;
        int i16 = this.C;
        boolean z13 = true;
        pt ptVar = this.f33121a;
        if (i16 == i9 && this.D == z10) {
            if (b()) {
                if (ptVar.isFocused() && i9 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f33125f.getHeight();
            return;
        }
        this.C = i9;
        this.D = z10;
        boolean z14 = this.v;
        z13 = (!ptVar.isFocused() || i9 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.f33124e) {
            x(0);
        }
        if (this.f33129w != 0 && !(z11 = this.v) && z11 != z14 && !this.f33124e) {
            this.f33129w = 0;
            this.f33125f.requestLayout();
        }
        if (this.v && this.J) {
            this.J = false;
            AndroidUtilities.cancelRunOnUIThread(this.L);
        }
        this.f33125f.getHeight();
    }

    public boolean a() {
        int i9 = this.H;
        if (i9 != 2 && i9 != 3 && i9 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.o30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f33121a);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            qt qtVar = this.d;
            if (qtVar != null) {
                qtVar.L.f1();
            }
            pt ptVar = this.f33121a;
            if (ptVar != null) {
                int currentTextColor = ptVar.getCurrentTextColor();
                ptVar.setTextColor(-1);
                ptVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        qt qtVar = this.d;
        if (qtVar != null && qtVar.Y0 != UserConfig.selectedAccount) {
            this.f33125f.removeView(qtVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i9 = this.H;
        if (i9 != 2 && i9 != 3 && i9 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        qt qtVar2 = new qt(this, this.h, this.E, context, b10, z10, this.I, this.O);
        this.d = qtVar2;
        qtVar2.f34390c = this.Q;
        qtVar2.Q0 = this.M;
        qtVar2.setVisibility(8);
        this.N = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new st(this));
        this.f33125f.addView(this.d);
    }

    public mt getEditText() {
        return this.f33121a;
    }

    public View getEmojiButton() {
        return this.f33122b;
    }

    public int getEmojiPadding() {
        return this.f33129w;
    }

    public float getEmojiPaddingShown() {
        return this.N;
    }

    public wy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i9;
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i9 = this.f33128s;
        } else {
            i9 = this.f33127r;
        }
        if (this.F) {
            i10 = AndroidUtilities.navigationBarHeight;
        } else {
            i10 = 0;
        }
        int i11 = i9 + i10;
        if (this.f33130x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i11, AndroidUtilities.displaySize.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f33121a.getText();
    }

    public int h() {
        return k5.g();
    }

    public final void j() {
        qt qtVar;
        if (!this.f33124e && (qtVar = this.d) != null && qtVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.N = 0.0f;
        }
        this.f33129w = 0;
        boolean z10 = this.f33130x;
        this.f33130x = false;
        if (z10) {
            qt qtVar2 = this.d;
            if (qtVar2 != null) {
                qtVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f33124e) {
            x(0);
        }
        if (z10) {
            qt qtVar = this.d;
            if (qtVar != null && qtVar.getVisibility() == 0 && !this.J) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.N = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new dh.b(this, measuredHeight, 3));
                this.K = true;
                ofFloat.addListener(new org.telegram.ui.xp(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f33130x;
        this.f33130x = false;
        if (z11) {
            qt qtVar2 = this.d;
            if (qtVar2 != null) {
                qtVar2.t(false);
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
        qt qtVar = this.d;
        if (qtVar != null && qtVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f33121a.length();
    }

    public final void o() {
        this.f33131y = true;
        qt qtVar = this.d;
        if (qtVar != null) {
            qtVar.D();
        }
        xu0 xu0Var = this.f33125f;
        if (xu0Var != null) {
            xu0Var.f34792r.remove(this);
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
        this.A = true;
        d();
    }

    public final void s() {
        this.A = false;
        if (this.B) {
            this.B = false;
            pt ptVar = this.f33121a;
            ptVar.requestFocus();
            AndroidUtilities.showKeyboard(ptVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.J = true;
                u();
                m.i3 i3Var = this.L;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                AndroidUtilities.runOnUIThread(i3Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.G = q1Var;
    }

    public void setEmojiViewCacheType(int i9) {
        this.Q = i9;
        qt qtVar = this.d;
        if (qtVar != null) {
            qtVar.f34390c = i9;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i9;
        float f10;
        int i10;
        int dp;
        pt ptVar = this.f33121a;
        ptVar.setEnabled(z10);
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f33122b.setVisibility(i9);
        if (this.H == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int dp2 = AndroidUtilities.dp(f10);
        if (z10) {
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(40.0f);
            } else {
                i10 = 0;
            }
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(40.0f);
            }
            ptVar.setPadding(i10, 0, dp, dp2);
            return;
        }
        ptVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f33121a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f33121a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f33121a.setHint(charSequence);
    }

    public void setMaxLines(int i9) {
        this.f33121a.setMaxLines(i9);
    }

    public void setSelection(int i9) {
        this.f33121a.setSelection(i9);
    }

    public void setSizeNotifierLayout(xu0 xu0Var) {
        xu0 xu0Var2 = this.f33125f;
        if (xu0Var2 != null) {
            xu0Var2.f34792r.remove(this);
        }
        this.f33125f = xu0Var;
        xu0Var.f34792r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i9;
        pt ptVar = this.f33121a;
        int inputType = ptVar.getInputType();
        if (!z10) {
            i9 = 524288 | inputType;
        } else {
            i9 = (-524289) & inputType;
        }
        if (ptVar.getInputType() != i9) {
            ptVar.setInputType(i9);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f33121a.setText(charSequence);
    }

    public boolean t(int i9) {
        return true;
    }

    public final void v() {
        int i9;
        u();
        if (!AndroidUtilities.usingHardwareInput && !this.A) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        x(i9);
        pt ptVar = this.f33121a;
        ptVar.requestFocus();
        AndroidUtilities.showKeyboard(ptVar);
        if (this.A) {
            this.B = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.J = true;
            m.i3 i3Var = this.L;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 100L);
        }
    }

    public final void w(int i9, int i10) {
        this.f33121a.setSelection(i9, i10);
    }

    public void x(int i9) {
        int i10;
        bl0 bl0Var = this.f33123c;
        int i11 = 0;
        if (i9 == 1) {
            qt qtVar = this.d;
            if (qtVar != null) {
                qtVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f33124e = true;
            this.N = 1.0f;
            qt qtVar2 = this.d;
            if (this.f33127r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f33127r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f33127r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f33128s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f33128s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f33128s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f33128s;
            } else {
                i10 = this.f33127r;
            }
            if (this.F) {
                i11 = AndroidUtilities.navigationBarHeight;
            }
            int i12 = i10 + i11;
            if (this.f33130x) {
                i12 = Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qtVar2.getLayoutParams();
            layoutParams.height = i12;
            qtVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f33121a);
            }
            xu0 xu0Var = this.f33125f;
            if (xu0Var != null) {
                this.f33129w = i12;
                xu0Var.requestLayout();
                bl0Var.a(R.drawable.input_keyboard, true);
                this.f33125f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.N = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f33122b != null) {
            if (this.H == 0) {
                bl0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                bl0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f33124e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.N = 0.0f;
            }
        }
        xu0 xu0Var2 = this.f33125f;
        if (xu0Var2 != null) {
            if (i9 == 0) {
                this.f33129w = 0;
                this.N = 0.0f;
            }
            xu0Var2.requestLayout();
            this.f33125f.getHeight();
        }
    }

    public ut(Context context, xu0 xu0Var, org.telegram.ui.ActionBar.o2 o2Var, int i9, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.A = true;
        this.L = new m.i3(this, 16);
        this.Q = 2;
        this.E = z10;
        this.I = b6Var;
        this.H = i9;
        this.h = o2Var;
        this.f33125f = xu0Var;
        xu0Var.f34792r.add(this);
        pt ptVar = new pt(this, context, b6Var, i9);
        this.f33121a = ptVar;
        ptVar.setImeOptions(268435456);
        ptVar.setInputType(ptVar.getInputType() | 16384);
        ptVar.setFocusable(ptVar.isEnabled());
        ptVar.setCursorSize(AndroidUtilities.dp(20.0f));
        ptVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        ptVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        if (i9 == 0) {
            ptVar.setTextSize(1, 18.0f);
            ptVar.setMaxLines(4);
            ptVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            ptVar.setBackground(null);
            ptVar.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23127k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23144l6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, b6Var));
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            ptVar.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23325vf, b6Var));
            ptVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(ptVar, g7.e6.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i9 == 2 || i9 == 3) {
            ptVar.setTextSize(1, 16.0f);
            ptVar.setMaxLines(8);
            ptVar.setGravity(19);
            ptVar.setAllowTextEntitiesIntersection(true);
            ptVar.setHintTextColor(-1929379841);
            ptVar.setTextColor(-1);
            ptVar.setCursorColor(-1);
            ptVar.setBackground(null);
            ptVar.setClipToPadding(false);
            ptVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            ptVar.setHandlesColor(-1);
            ptVar.setHighlightColor(822083583);
            ptVar.setLinkTextColor(-12147733);
            ptVar.quoteColor = -1;
            ptVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(ptVar, g7.e6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i9 == 4) {
            ptVar.setTextSize(1, 18.0f);
            ptVar.setMaxLines(4);
            ptVar.setGravity(19);
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23284t5, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
            ptVar.setBackground(null);
            ptVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ptVar, g7.e6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ptVar.setTextSize(1, 18.0f);
            ptVar.setMaxLines(4);
            ptVar.setGravity(19);
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23284t5, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
            ptVar.setBackground(null);
            ptVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ptVar, g7.e6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.f33122b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bl0 bl0Var = new bl0(context);
        this.f33123c = bl0Var;
        geVar.setImageDrawable(bl0Var);
        if (i9 == 0) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i9 == 2 || i9 == 3) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i9 == 4) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i9 == 5) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23038f7, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        geVar.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, -1));
        geVar.setOnClickListener(new fg.f(this, xu0Var, b6Var, 26));
        geVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f10) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(tt ttVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, qt qtVar) {
    }

    public void q(int i9, int i10) {
    }
}
