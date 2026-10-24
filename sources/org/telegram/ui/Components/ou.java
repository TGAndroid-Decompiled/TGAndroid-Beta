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
public class ou extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, mw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.o1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.g6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.u5 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final ju f29381a;
    public final ig.k f29382b;
    public final qm0 f29383c;
    public ku d;
    public boolean e;
    public nw0 f29384f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean f29385n;
    public int f29386r;
    public int f29387s;
    public boolean v;
    public int f29388w;
    public boolean f29389x;
    public boolean f29390y;

    public ou(Context context, org.telegram.ui.id idVar, org.telegram.ui.ko koVar) {
        this(context, idVar, koVar, 0, false, null);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f29387s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f29387s).commit();
            } else {
                this.f29386r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f29386r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f29387s;
            } else {
                i11 = this.f29386r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f29389x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                nw0 nw0Var = this.f29384f;
                if (nw0Var != null) {
                    this.f29388w = layoutParams.height;
                    nw0Var.requestLayout();
                    this.f29384f.getHeight();
                    if (this.T != this.f29389x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f29389x;
        int i17 = this.G;
        boolean z13 = true;
        ju juVar = this.f29381a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (juVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f29384f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        if (!juVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f29388w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f29388w = 0;
            this.f29384f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f29384f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.s30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f29381a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ku kuVar = this.d;
            if (kuVar != null) {
                kuVar.P.g1();
            }
            ju juVar = this.f29381a;
            if (juVar != null) {
                int currentTextColor = juVar.getCurrentTextColor();
                juVar.setTextColor(-1);
                juVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        ku kuVar = this.d;
        if (kuVar != null && kuVar.f30310c1 != UserConfig.selectedAccount) {
            this.f29384f.removeView(kuVar);
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
        ku kuVar2 = new ku(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = kuVar2;
        kuVar2.f30308c = this.U;
        kuVar2.U0 = this.Q;
        kuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new mu(this));
        this.f29384f.addView(this.d);
    }

    public gu getEditText() {
        return this.f29381a;
    }

    public View getEmojiButton() {
        return this.f29382b;
    }

    public int getEmojiPadding() {
        return this.f29388w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public rz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f29387s;
        } else {
            i10 = this.f29386r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f29389x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f29381a.getText();
    }

    public int h() {
        return p5.g();
    }

    public final void j() {
        ku kuVar;
        if (!this.e && (kuVar = this.d) != null && kuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f29388w = 0;
        boolean z10 = this.f29389x;
        this.f29389x = false;
        if (z10) {
            ku kuVar2 = this.d;
            if (kuVar2 != null) {
                kuVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            ku kuVar = this.d;
            if (kuVar != null && kuVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new org.telegram.ui.pq(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f29389x;
        this.f29389x = false;
        if (z11) {
            ku kuVar2 = this.d;
            if (kuVar2 != null) {
                kuVar2.u(false);
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
        ku kuVar = this.d;
        if (kuVar != null && kuVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f29381a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.f29390y = true;
        ku kuVar = this.d;
        if (kuVar != null && (observersGroup = kuVar.O2) != null) {
            observersGroup.removeAllObservers();
            kuVar.O2 = null;
        }
        nw0 nw0Var = this.f29384f;
        if (nw0Var != null) {
            nw0Var.f29067r.remove(this);
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
            ju juVar = this.f29381a;
            juVar.requestFocus();
            AndroidUtilities.showKeyboard(juVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.u5 u5Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(u5Var);
                AndroidUtilities.runOnUIThread(u5Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.K = o1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        ku kuVar = this.d;
        if (kuVar != null) {
            kuVar.f30308c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        ju juVar = this.f29381a;
        juVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f29382b.setVisibility(i10);
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
            juVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        juVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f29381a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f29381a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f29381a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f29381a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f29381a.setSelection(i10);
    }

    public void setSizeNotifierLayout(nw0 nw0Var) {
        nw0 nw0Var2 = this.f29384f;
        if (nw0Var2 != null) {
            nw0Var2.f29067r.remove(this);
        }
        this.f29384f = nw0Var;
        nw0Var.f29067r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        ju juVar = this.f29381a;
        int inputType = juVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (juVar.getInputType() != i10) {
            juVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f29381a.setText(charSequence);
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
        ju juVar = this.f29381a;
        juVar.requestFocus();
        AndroidUtilities.showKeyboard(juVar);
        if (this.E) {
            this.F = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.N = true;
            org.telegram.ui.Cells.u5 u5Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f29381a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        qm0 qm0Var = this.f29383c;
        int i12 = 0;
        if (i10 == 1) {
            ku kuVar = this.d;
            if (kuVar != null) {
                kuVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            ku kuVar2 = this.d;
            if (this.f29386r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f29386r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f29386r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f29387s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f29387s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f29387s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f29387s;
            } else {
                i11 = this.f29386r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f29389x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kuVar2.getLayoutParams();
            layoutParams.height = i13;
            kuVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f29381a);
            }
            nw0 nw0Var = this.f29384f;
            if (nw0Var != null) {
                this.f29388w = i13;
                nw0Var.requestLayout();
                qm0Var.a(R.drawable.input_keyboard, true);
                this.f29384f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f29382b != null) {
            if (this.L == 0) {
                qm0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                qm0Var.a(R.drawable.input_smile, true);
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
        nw0 nw0Var2 = this.f29384f;
        if (nw0Var2 != null) {
            if (i10 == 0) {
                this.f29388w = 0;
                this.R = 0.0f;
            }
            nw0Var2.requestLayout();
            this.f29384f.getHeight();
        }
    }

    public ou(Context context, nw0 nw0Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.u5(this, 10);
        this.U = 2;
        this.I = z10;
        this.M = g6Var;
        this.L = i10;
        this.h = o2Var;
        this.f29384f = nw0Var;
        nw0Var.f29067r.add(this);
        ju juVar = new ju(this, context, g6Var, i10);
        this.f29381a = juVar;
        juVar.setImeOptions(268435456);
        juVar.setInputType(juVar.getInputType() | 16384);
        juVar.setFocusable(juVar.isEnabled());
        juVar.setCursorSize(AndroidUtilities.dp(20.0f));
        juVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(juVar, 30, i11, g6Var);
        if (i10 == 0) {
            juVar.setTextSize(1, 18.0f);
            juVar.setMaxLines(4);
            juVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            juVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.H(juVar, org.telegram.ui.ActionBar.k6.f21311k6, org.telegram.ui.ActionBar.k6.f21328l6, org.telegram.ui.ActionBar.k6.f21405p7, g6Var);
            org.telegram.ui.ActionBar.r6.F(juVar, org.telegram.ui.ActionBar.k6.H6, g6Var);
            org.telegram.ui.ActionBar.r6.W(juVar, i11, g6Var);
            org.telegram.ui.ActionBar.r6.m(juVar, 36, org.telegram.ui.ActionBar.k6.f21526vf, g6Var);
            juVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(juVar, w7.z5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            juVar.setTextSize(1, 16.0f);
            juVar.setMaxLines(8);
            juVar.setGravity(19);
            juVar.setAllowTextEntitiesIntersection(true);
            juVar.setHintTextColor(-1929379841);
            juVar.setTextColor(-1);
            juVar.setCursorColor(-1);
            juVar.setBackground(null);
            juVar.setClipToPadding(false);
            juVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            juVar.setHandlesColor(-1);
            juVar.setHighlightColor(822083583);
            juVar.setLinkTextColor(-12147733);
            juVar.quoteColor = -1;
            juVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(juVar, w7.z5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            juVar.setTextSize(1, 18.0f);
            juVar.setMaxLines(4);
            juVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.F(juVar, org.telegram.ui.ActionBar.k6.f21479t5, g6Var);
            org.telegram.ui.ActionBar.r6.W(juVar, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
            juVar.setBackground(null);
            juVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(juVar, w7.z5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            juVar.setTextSize(1, 18.0f);
            juVar.setMaxLines(4);
            juVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.F(juVar, org.telegram.ui.ActionBar.k6.f21479t5, g6Var);
            org.telegram.ui.ActionBar.r6.W(juVar, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
            juVar.setBackground(null);
            juVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(juVar, w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ig.k kVar = new ig.k(this, context);
        this.f29382b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        qm0 qm0Var = new qm0(context);
        this.f29383c = qm0Var;
        kVar.setImageDrawable(qm0Var);
        if (i10 == 0) {
            org.telegram.ui.ActionBar.r6.z(this, qm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            qm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            qm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            qm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.r6.z(this, qm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            qm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            org.telegram.ui.ActionBar.r6.z(this, qm0Var, org.telegram.ui.ActionBar.k6.f7, g6Var, PorterDuff.Mode.MULTIPLY);
            qm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.z(this, qm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            qm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        kVar.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(kVar, g02, null, O, g6Var);
        kVar.setOnClickListener(new ai.v0(this, nw0Var, g6Var, 24));
        kVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f7) {
    }

    public void e() {
    }

    public void p() {
    }

    public void setDelegate(nu nuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, ku kuVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i10, int i11) {
    }
}
