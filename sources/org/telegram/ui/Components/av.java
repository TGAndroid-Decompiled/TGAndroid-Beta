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
public class av extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, sw0 {
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
    public final vu f24637a;
    public final hg.l f24638b;
    public final wm0 f24639c;
    public wu d;
    public boolean f24640e;
    public tw0 f24641f;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f24642n;
    public int f24643r;
    public int f24644s;
    public boolean v;
    public int f24645w;
    public boolean f24646x;
    public boolean f24647y;

    public av(Context context, org.telegram.ui.id idVar, org.telegram.ui.uo uoVar) {
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
                this.f24644s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f24644s).commit();
            } else {
                this.f24643r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f24643r).commit();
            }
        }
        boolean z12 = false;
        if (this.f24640e) {
            if (z10) {
                i11 = this.f24644s;
            } else {
                i11 = this.f24643r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f24646x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                tw0 tw0Var = this.f24641f;
                if (tw0Var != null) {
                    this.f24645w = layoutParams.height;
                    tw0Var.requestLayout();
                    this.f24641f.getHeight();
                    if (this.T != this.f24646x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f24646x;
        int i17 = this.G;
        boolean z13 = true;
        vu vuVar = this.f24637a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (vuVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f24641f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        if (!vuVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.v = z13;
        if (z13 && this.f24640e) {
            x(0);
        }
        if (this.f24645w != 0 && !(z11 = this.v) && z11 != z14 && !this.f24640e) {
            this.f24645w = 0;
            this.f24641f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f24641f.getHeight();
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
        AndroidUtilities.hideKeyboard(this.f24637a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            wu wuVar = this.d;
            if (wuVar != null) {
                wuVar.P.f1();
            }
            vu vuVar = this.f24637a;
            if (vuVar != null) {
                int currentTextColor = vuVar.getCurrentTextColor();
                vuVar.setTextColor(-1);
                vuVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        wu wuVar = this.d;
        if (wuVar != null && wuVar.f24689c1 != UserConfig.selectedAccount) {
            this.f24641f.removeView(wuVar);
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
        wu wuVar2 = new wu(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = wuVar2;
        wuVar2.f24687c = this.U;
        wuVar2.U0 = this.Q;
        wuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new yu(this));
        this.f24641f.addView(this.d);
    }

    public su getEditText() {
        return this.f24637a;
    }

    public View getEmojiButton() {
        return this.f24638b;
    }

    public int getEmojiPadding() {
        return this.f24645w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public b00 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f24644s;
        } else {
            i10 = this.f24643r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f24646x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f24637a.getText();
    }

    public int h() {
        return s5.g();
    }

    public final void j() {
        wu wuVar;
        if (!this.f24640e && (wuVar = this.d) != null && wuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f24645w = 0;
        boolean z10 = this.f24646x;
        this.f24646x = false;
        if (z10) {
            wu wuVar2 = this.d;
            if (wuVar2 != null) {
                wuVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f24640e) {
            x(0);
        }
        if (z10) {
            wu wuVar = this.d;
            if (wuVar != null && wuVar.getVisibility() == 0 && !this.N) {
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
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21459w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f24646x;
        this.f24646x = false;
        if (z11) {
            wu wuVar2 = this.d;
            if (wuVar2 != null) {
                wuVar2.u(false);
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
        wu wuVar = this.d;
        if (wuVar != null && wuVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f24637a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f24647y = true;
        wu wuVar = this.d;
        if (wuVar != null && (observersGroup = wuVar.I2) != null) {
            observersGroup.removeAllObservers();
            wuVar.I2 = null;
        }
        tw0 tw0Var = this.f24641f;
        if (tw0Var != null) {
            tw0Var.f31264r.remove(this);
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
            vu vuVar = this.f24637a;
            vuVar.requestFocus();
            AndroidUtilities.showKeyboard(vuVar);
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
        wu wuVar = this.d;
        if (wuVar != null) {
            wuVar.f24687c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        vu vuVar = this.f24637a;
        vuVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f24638b.setVisibility(i10);
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
            vuVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        vuVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f24637a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f24637a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f24637a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f24637a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f24637a.setSelection(i10);
    }

    public void setSizeNotifierLayout(tw0 tw0Var) {
        tw0 tw0Var2 = this.f24641f;
        if (tw0Var2 != null) {
            tw0Var2.f31264r.remove(this);
        }
        this.f24641f = tw0Var;
        tw0Var.f31264r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        vu vuVar = this.f24637a;
        int inputType = vuVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (vuVar.getInputType() != i10) {
            vuVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f24637a.setText(charSequence);
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
        vu vuVar = this.f24637a;
        vuVar.requestFocus();
        AndroidUtilities.showKeyboard(vuVar);
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
        this.f24637a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        wm0 wm0Var = this.f24639c;
        int i12 = 0;
        if (i10 == 1) {
            wu wuVar = this.d;
            if (wuVar != null) {
                wuVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f24640e = true;
            this.R = 1.0f;
            wu wuVar2 = this.d;
            if (this.f24643r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f24643r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f24643r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f24644s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f24644s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f24644s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f24644s;
            } else {
                i11 = this.f24643r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f24646x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wuVar2.getLayoutParams();
            layoutParams.height = i13;
            wuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f24637a);
            }
            tw0 tw0Var = this.f24641f;
            if (tw0Var != null) {
                this.f24645w = i13;
                tw0Var.requestLayout();
                wm0Var.a(R.drawable.input_keyboard, true);
                this.f24641f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f24638b != null) {
            if (this.L == 0) {
                wm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                wm0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f24640e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        tw0 tw0Var2 = this.f24641f;
        if (tw0Var2 != null) {
            if (i10 == 0) {
                this.f24645w = 0;
                this.R = 0.0f;
            }
            tw0Var2.requestLayout();
            this.f24641f.getHeight();
        }
    }

    public av(Context context, tw0 tw0Var, org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.t6(this, 9);
        this.U = 2;
        this.I = z10;
        this.M = e6Var;
        this.L = i10;
        this.h = n2Var;
        this.f24641f = tw0Var;
        tw0Var.f31264r.add(this);
        vu vuVar = new vu(this, context, e6Var, i10);
        this.f24637a = vuVar;
        vuVar.setImeOptions(268435456);
        vuVar.setInputType(vuVar.getInputType() | 16384);
        vuVar.setFocusable(vuVar.isEnabled());
        vuVar.setCursorSize(AndroidUtilities.dp(20.0f));
        vuVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        vuVar.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        if (i10 == 0) {
            vuVar.setTextSize(1, 18.0f);
            vuVar.setMaxLines(4);
            vuVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            vuVar.setBackground(null);
            vuVar.setLineColors(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20929k6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20947l6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21022p7, e6Var));
            vuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H6, e6Var));
            vuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
            vuVar.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21140vf, e6Var));
            vuVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(vuVar, w7.x5.a(-2.0f, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f, -1, 19));
        } else if (i10 == 2 || i10 == 3) {
            vuVar.setTextSize(1, 16.0f);
            vuVar.setMaxLines(8);
            vuVar.setGravity(19);
            vuVar.setAllowTextEntitiesIntersection(true);
            vuVar.setHintTextColor(-1929379841);
            vuVar.setTextColor(-1);
            vuVar.setCursorColor(-1);
            vuVar.setBackground(null);
            vuVar.setClipToPadding(false);
            vuVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            vuVar.setHandlesColor(-1);
            vuVar.setHighlightColor(822083583);
            vuVar.setLinkTextColor(-12147733);
            vuVar.quoteColor = -1;
            vuVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(vuVar, w7.x5.a(-1.0f, 40.0f, 0.0f, 24.0f, 0.0f, -1, 19));
        } else if (i10 == 4) {
            vuVar.setTextSize(1, 18.0f);
            vuVar.setMaxLines(4);
            vuVar.setGravity(19);
            vuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21095t5, e6Var));
            vuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
            vuVar.setBackground(null);
            vuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(vuVar, w7.x5.a(-1.0f, 14.0f, 0.0f, 48.0f, 0.0f, -1, 19));
        } else {
            vuVar.setTextSize(1, 18.0f);
            vuVar.setMaxLines(4);
            vuVar.setGravity(19);
            vuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21095t5, e6Var));
            vuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
            vuVar.setBackground(null);
            vuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(vuVar, w7.x5.a(-1.0f, 48.0f, 0.0f, 0.0f, 0.0f, -1, 19));
        }
        hg.l lVar = new hg.l(this, context);
        this.f24638b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        wm0 wm0Var = new wm0(context);
        this.f24639c = wm0Var;
        lVar.setImageDrawable(wm0Var);
        if (i10 == 0) {
            wm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            wm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 5.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        } else if (i10 == 2 || i10 == 3) {
            wm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            wm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        } else if (i10 == 4) {
            wm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            wm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 53));
        } else if (i10 == 5) {
            wm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f7, e6Var), PorterDuff.Mode.MULTIPLY));
            wm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        } else {
            wm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
            wm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 83));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, tw0Var, e6Var, 21));
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

    public void setDelegate(zu zuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, wu wuVar) {
    }

    public void q(int i10, int i11) {
    }
}
