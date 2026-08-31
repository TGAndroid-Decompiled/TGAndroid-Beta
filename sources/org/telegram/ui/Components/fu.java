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
public class fu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.r1 H;
    public final int I;
    public final org.telegram.ui.ActionBar.g6 J;
    public boolean K;
    public boolean L;
    public final m2.b M;
    public boolean N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public final au f27001a;
    public final ge f27002b;
    public final zl0 f27003c;
    public bu d;
    public boolean f27004e;
    public qv0 f27005f;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean f27006n;
    public int f27007r;
    public int f27008s;
    public boolean v;
    public int f27009w;
    public boolean f27010x;
    public boolean f27011y;

    public fu(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.po poVar) {
        this(context, jdVar, poVar, 0, false, null);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.I) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z4) {
                this.f27008s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f27008s).commit();
            } else {
                this.f27007r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f27007r).commit();
            }
        }
        boolean z11 = false;
        if (this.f27004e) {
            if (z4) {
                i11 = this.f27008s;
            } else {
                i11 = this.f27007r;
            }
            if (this.G) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f27010x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                qv0 qv0Var = this.f27005f;
                if (qv0Var != null) {
                    this.f27009w = layoutParams.height;
                    qv0Var.requestLayout();
                    this.f27005f.getHeight();
                    if (this.Q != this.f27010x) {
                        p();
                    }
                }
            }
        }
        this.Q = this.f27010x;
        int i17 = this.D;
        boolean z12 = true;
        au auVar = this.f27001a;
        if (i17 == i10 && this.E == z4) {
            if (b()) {
                if (auVar.isFocused() && i10 > 0) {
                    z11 = true;
                }
                this.v = z11;
            }
            this.f27005f.getHeight();
            return;
        }
        this.D = i10;
        this.E = z4;
        boolean z13 = this.v;
        z12 = (!auVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z12;
        if (z12 && this.f27004e) {
            x(0);
        }
        if (this.f27009w != 0 && !(z10 = this.v) && z10 != z13 && !this.f27004e) {
            this.f27009w = 0;
            this.f27005f.requestLayout();
        }
        if (this.v && this.K) {
            this.K = false;
            AndroidUtilities.cancelRunOnUIThread(this.M);
        }
        this.f27005f.getHeight();
    }

    public boolean a() {
        int i10 = this.I;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.e40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f27001a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bu buVar = this.d;
            if (buVar != null) {
                buVar.M.f1();
            }
            au auVar = this.f27001a;
            if (auVar != null) {
                int currentTextColor = auVar.getCurrentTextColor();
                auVar.setTextColor(-1);
                auVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z4;
        bu buVar = this.d;
        if (buVar != null && buVar.Z0 != UserConfig.selectedAccount) {
            this.f27005f.removeView(buVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.I;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            z4 = true;
        } else {
            z4 = false;
        }
        bu buVar2 = new bu(this, this.h, this.F, context, b10, z4, this.J, this.P);
        this.d = buVar2;
        buVar2.f29270c = this.R;
        buVar2.R0 = this.N;
        buVar2.setVisibility(8);
        this.O = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new du(this));
        this.f27005f.addView(this.d);
    }

    public xt getEditText() {
        return this.f27001a;
    }

    public View getEmojiButton() {
        return this.f27002b;
    }

    public int getEmojiPadding() {
        return this.f27009w;
    }

    public float getEmojiPaddingShown() {
        return this.O;
    }

    public mz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f27008s;
        } else {
            i10 = this.f27007r;
        }
        if (this.G) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f27010x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f27001a.getText();
    }

    public int h() {
        return l5.g();
    }

    public final void j() {
        bu buVar;
        if (!this.f27004e && (buVar = this.d) != null && buVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.O = 0.0f;
        }
        this.f27009w = 0;
        boolean z4 = this.f27010x;
        this.f27010x = false;
        if (z4) {
            bu buVar2 = this.d;
            if (buVar2 != null) {
                buVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z4) {
        if (this.f27004e) {
            x(0);
        }
        if (z4) {
            bu buVar = this.d;
            if (buVar != null && buVar.getVisibility() == 0 && !this.K) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.O = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new jh.b(this, measuredHeight, 3));
                this.L = true;
                ofFloat.addListener(new a9(this, 15));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z10 = this.f27010x;
        this.f27010x = false;
        if (z10) {
            bu buVar2 = this.d;
            if (buVar2 != null) {
                buVar2.t(false);
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
        bu buVar = this.d;
        if (buVar != null && buVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f27001a.length();
    }

    public final void o() {
        this.f27011y = true;
        bu buVar = this.d;
        if (buVar != null) {
            buVar.D();
        }
        qv0 qv0Var = this.f27005f;
        if (qv0Var != null) {
            qv0Var.f30509r.remove(this);
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
        this.B = true;
        d();
    }

    public final void s() {
        this.B = false;
        if (this.C) {
            this.C = false;
            au auVar = this.f27001a;
            auVar.requestFocus();
            AndroidUtilities.showKeyboard(auVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.K = true;
                u();
                m2.b bVar = this.M;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.r1 r1Var) {
        this.H = r1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.R = i10;
        bu buVar = this.d;
        if (buVar != null) {
            buVar.f29270c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z4) {
        int i10;
        float f10;
        int i11;
        int dp;
        au auVar = this.f27001a;
        auVar.setEnabled(z4);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f27002b.setVisibility(i10);
        if (this.I == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int dp2 = AndroidUtilities.dp(f10);
        if (z4) {
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
            auVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        auVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f27001a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z4) {
        this.f27001a.setFocusable(z4);
    }

    public void setHint(CharSequence charSequence) {
        this.f27001a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f27001a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f27001a.setSelection(i10);
    }

    public void setSizeNotifierLayout(qv0 qv0Var) {
        qv0 qv0Var2 = this.f27005f;
        if (qv0Var2 != null) {
            qv0Var2.f30509r.remove(this);
        }
        this.f27005f = qv0Var;
        qv0Var.f30509r.add(this);
    }

    public void setSuggestionsEnabled(boolean z4) {
        int i10;
        au auVar = this.f27001a;
        int inputType = auVar.getInputType();
        if (!z4) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (auVar.getInputType() != i10) {
            auVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f27001a.setText(charSequence);
    }

    public boolean t(int i10) {
        return true;
    }

    public final void v() {
        int i10;
        u();
        if (!AndroidUtilities.usingHardwareInput && !this.B) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        x(i10);
        au auVar = this.f27001a;
        auVar.requestFocus();
        AndroidUtilities.showKeyboard(auVar);
        if (this.B) {
            this.C = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.K = true;
            m2.b bVar = this.M;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f27001a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        zl0 zl0Var = this.f27003c;
        int i12 = 0;
        if (i10 == 1) {
            bu buVar = this.d;
            if (buVar != null) {
                buVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f27004e = true;
            this.O = 1.0f;
            bu buVar2 = this.d;
            if (this.f27007r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f27007r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f27007r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f27008s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f27008s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f27008s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f27008s;
            } else {
                i11 = this.f27007r;
            }
            if (this.G) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f27010x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) buVar2.getLayoutParams();
            layoutParams.height = i13;
            buVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f27001a);
            }
            qv0 qv0Var = this.f27005f;
            if (qv0Var != null) {
                this.f27009w = i13;
                qv0Var.requestLayout();
                zl0Var.a(R.drawable.input_keyboard, true);
                this.f27005f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.O = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f27002b != null) {
            if (this.I == 0) {
                zl0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                zl0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f27004e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.O = 0.0f;
            }
        }
        qv0 qv0Var2 = this.f27005f;
        if (qv0Var2 != null) {
            if (i10 == 0) {
                this.f27009w = 0;
                this.O = 0.0f;
            }
            qv0Var2.requestLayout();
            this.f27005f.getHeight();
        }
    }

    public fu(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.B = true;
        this.M = new m2.b(this, 18);
        this.R = 2;
        this.F = z4;
        this.J = g6Var;
        this.I = i10;
        this.h = p2Var;
        this.f27005f = qv0Var;
        qv0Var.f30509r.add(this);
        au auVar = new au(this, context, g6Var, i10);
        this.f27001a = auVar;
        auVar.setImeOptions(268435456);
        auVar.setInputType(auVar.getInputType() | 16384);
        auVar.setFocusable(auVar.isEnabled());
        auVar.setCursorSize(AndroidUtilities.dp(20.0f));
        auVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        auVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        if (i10 == 0) {
            auVar.setTextSize(1, 18.0f);
            auVar.setMaxLines(4);
            auVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            auVar.setBackground(null);
            auVar.setLineColors(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21785k6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21803l6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21876p7, g6Var));
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            auVar.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21988vf, g6Var));
            auVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z10 = LocaleController.isRTL;
            addView(auVar, k7.c6.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            auVar.setTextSize(1, 16.0f);
            auVar.setMaxLines(8);
            auVar.setGravity(19);
            auVar.setAllowTextEntitiesIntersection(true);
            auVar.setHintTextColor(-1929379841);
            auVar.setTextColor(-1);
            auVar.setCursorColor(-1);
            auVar.setBackground(null);
            auVar.setClipToPadding(false);
            auVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            auVar.setHandlesColor(-1);
            auVar.setHighlightColor(822083583);
            auVar.setLinkTextColor(-12147733);
            auVar.quoteColor = -1;
            auVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(auVar, k7.c6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            auVar.setTextSize(1, 18.0f);
            auVar.setMaxLines(4);
            auVar.setGravity(19);
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21944t5, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
            auVar.setBackground(null);
            auVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(auVar, k7.c6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            auVar.setTextSize(1, 18.0f);
            auVar.setMaxLines(4);
            auVar.setGravity(19);
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21944t5, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
            auVar.setBackground(null);
            auVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(auVar, k7.c6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.f27002b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        zl0 zl0Var = new zl0(context);
        this.f27003c = zl0Var;
        geVar.setImageDrawable(zl0Var);
        if (i10 == 0) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, k7.c6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21697f7, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        geVar.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 1, -1));
        geVar.setOnClickListener(new eg.o(this, qv0Var, g6Var, 24));
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

    public void setDelegate(eu euVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, bu buVar) {
    }

    public void q(int i10, int i11) {
    }
}
