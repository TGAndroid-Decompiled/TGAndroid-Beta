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
public class du extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.r1 H;
    public final int I;
    public final org.telegram.ui.ActionBar.f6 J;
    public boolean K;
    public boolean L;
    public final m2.b M;
    public boolean N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public final yt f24367a;
    public final ge f24368b;
    public final yl0 f24369c;
    public zt d;
    public boolean e;
    public qv0 f24370f;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean f24371n;
    public int f24372r;
    public int f24373s;
    public boolean v;
    public int f24374w;
    public boolean f24375x;
    public boolean f24376y;

    public du(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.po poVar) {
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
                this.f24373s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f24373s).commit();
            } else {
                this.f24372r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f24372r).commit();
            }
        }
        boolean z11 = false;
        if (this.e) {
            if (z4) {
                i11 = this.f24373s;
            } else {
                i11 = this.f24372r;
            }
            if (this.G) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f24375x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                qv0 qv0Var = this.f24370f;
                if (qv0Var != null) {
                    this.f24374w = layoutParams.height;
                    qv0Var.requestLayout();
                    this.f24370f.getHeight();
                    if (this.Q != this.f24375x) {
                        p();
                    }
                }
            }
        }
        this.Q = this.f24375x;
        int i17 = this.D;
        boolean z12 = true;
        yt ytVar = this.f24367a;
        if (i17 == i10 && this.E == z4) {
            if (b()) {
                if (ytVar.isFocused() && i10 > 0) {
                    z11 = true;
                }
                this.v = z11;
            }
            this.f24370f.getHeight();
            return;
        }
        this.D = i10;
        this.E = z4;
        boolean z13 = this.v;
        z12 = (!ytVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z12;
        if (z12 && this.e) {
            x(0);
        }
        if (this.f24374w != 0 && !(z10 = this.v) && z10 != z13 && !this.e) {
            this.f24374w = 0;
            this.f24370f.requestLayout();
        }
        if (this.v && this.K) {
            this.K = false;
            AndroidUtilities.cancelRunOnUIThread(this.M);
        }
        this.f24370f.getHeight();
    }

    public boolean a() {
        int i10 = this.I;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.d40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f24367a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            zt ztVar = this.d;
            if (ztVar != null) {
                ztVar.M.f1();
            }
            yt ytVar = this.f24367a;
            if (ytVar != null) {
                int currentTextColor = ytVar.getCurrentTextColor();
                ytVar.setTextColor(-1);
                ytVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z4;
        zt ztVar = this.d;
        if (ztVar != null && ztVar.Z0 != UserConfig.selectedAccount) {
            this.f24370f.removeView(ztVar);
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
        zt ztVar2 = new zt(this, this.h, this.F, context, b10, z4, this.J, this.P);
        this.d = ztVar2;
        ztVar2.f26416c = this.R;
        ztVar2.R0 = this.N;
        ztVar2.setVisibility(8);
        this.O = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new bu(this));
        this.f24370f.addView(this.d);
    }

    public vt getEditText() {
        return this.f24367a;
    }

    public View getEmojiButton() {
        return this.f24368b;
    }

    public int getEmojiPadding() {
        return this.f24374w;
    }

    public float getEmojiPaddingShown() {
        return this.O;
    }

    public kz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f24373s;
        } else {
            i10 = this.f24372r;
        }
        if (this.G) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f24375x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f24367a.getText();
    }

    public int h() {
        return l5.g();
    }

    public final void j() {
        zt ztVar;
        if (!this.e && (ztVar = this.d) != null && ztVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.O = 0.0f;
        }
        this.f24374w = 0;
        boolean z4 = this.f24375x;
        this.f24375x = false;
        if (z4) {
            zt ztVar2 = this.d;
            if (ztVar2 != null) {
                ztVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z4) {
        if (this.e) {
            x(0);
        }
        if (z4) {
            zt ztVar = this.d;
            if (ztVar != null && ztVar.getVisibility() == 0 && !this.K) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.O = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new ih.b(this, measuredHeight, 3));
                this.L = true;
                ofFloat.addListener(new a9(this, 15));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z10 = this.f24375x;
        this.f24375x = false;
        if (z10) {
            zt ztVar2 = this.d;
            if (ztVar2 != null) {
                ztVar2.t(false);
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
        zt ztVar = this.d;
        if (ztVar != null && ztVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f24367a.length();
    }

    public final void o() {
        this.f24376y = true;
        zt ztVar = this.d;
        if (ztVar != null) {
            ztVar.D();
        }
        qv0 qv0Var = this.f24370f;
        if (qv0Var != null) {
            qv0Var.f28290r.remove(this);
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
            yt ytVar = this.f24367a;
            ytVar.requestFocus();
            AndroidUtilities.showKeyboard(ytVar);
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
        zt ztVar = this.d;
        if (ztVar != null) {
            ztVar.f26416c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z4) {
        int i10;
        float f10;
        int i11;
        int dp;
        yt ytVar = this.f24367a;
        ytVar.setEnabled(z4);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f24368b.setVisibility(i10);
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
            ytVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        ytVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f24367a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z4) {
        this.f24367a.setFocusable(z4);
    }

    public void setHint(CharSequence charSequence) {
        this.f24367a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f24367a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f24367a.setSelection(i10);
    }

    public void setSizeNotifierLayout(qv0 qv0Var) {
        qv0 qv0Var2 = this.f24370f;
        if (qv0Var2 != null) {
            qv0Var2.f28290r.remove(this);
        }
        this.f24370f = qv0Var;
        qv0Var.f28290r.add(this);
    }

    public void setSuggestionsEnabled(boolean z4) {
        int i10;
        yt ytVar = this.f24367a;
        int inputType = ytVar.getInputType();
        if (!z4) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (ytVar.getInputType() != i10) {
            ytVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f24367a.setText(charSequence);
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
        yt ytVar = this.f24367a;
        ytVar.requestFocus();
        AndroidUtilities.showKeyboard(ytVar);
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
        this.f24367a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        yl0 yl0Var = this.f24369c;
        int i12 = 0;
        if (i10 == 1) {
            zt ztVar = this.d;
            if (ztVar != null) {
                ztVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.O = 1.0f;
            zt ztVar2 = this.d;
            if (this.f24372r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f24372r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f24372r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f24373s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f24373s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f24373s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f24373s;
            } else {
                i11 = this.f24372r;
            }
            if (this.G) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f24375x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ztVar2.getLayoutParams();
            layoutParams.height = i13;
            ztVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f24367a);
            }
            qv0 qv0Var = this.f24370f;
            if (qv0Var != null) {
                this.f24374w = i13;
                qv0Var.requestLayout();
                yl0Var.a(R.drawable.input_keyboard, true);
                this.f24370f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.O = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f24368b != null) {
            if (this.I == 0) {
                yl0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                yl0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.O = 0.0f;
            }
        }
        qv0 qv0Var2 = this.f24370f;
        if (qv0Var2 != null) {
            if (i10 == 0) {
                this.f24374w = 0;
                this.O = 0.0f;
            }
            qv0Var2.requestLayout();
            this.f24370f.getHeight();
        }
    }

    public du(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.B = true;
        this.M = new m2.b(this, 18);
        this.R = 2;
        this.F = z4;
        this.J = f6Var;
        this.I = i10;
        this.h = p2Var;
        this.f24370f = qv0Var;
        qv0Var.f28290r.add(this);
        yt ytVar = new yt(this, context, f6Var, i10);
        this.f24367a = ytVar;
        ytVar.setImeOptions(268435456);
        ytVar.setInputType(ytVar.getInputType() | 16384);
        ytVar.setFocusable(ytVar.isEnabled());
        ytVar.setCursorSize(AndroidUtilities.dp(20.0f));
        ytVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        ytVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            ytVar.setTextSize(1, 18.0f);
            ytVar.setMaxLines(4);
            ytVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            ytVar.setBackground(null);
            ytVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20031k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20049l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var));
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            ytVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20234vf, f6Var));
            ytVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z10 = LocaleController.isRTL;
            addView(ytVar, k7.b6.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            ytVar.setTextSize(1, 16.0f);
            ytVar.setMaxLines(8);
            ytVar.setGravity(19);
            ytVar.setAllowTextEntitiesIntersection(true);
            ytVar.setHintTextColor(-1929379841);
            ytVar.setTextColor(-1);
            ytVar.setCursorColor(-1);
            ytVar.setBackground(null);
            ytVar.setClipToPadding(false);
            ytVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            ytVar.setHandlesColor(-1);
            ytVar.setHighlightColor(822083583);
            ytVar.setLinkTextColor(-12147733);
            ytVar.quoteColor = -1;
            ytVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(ytVar, k7.b6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            ytVar.setTextSize(1, 18.0f);
            ytVar.setMaxLines(4);
            ytVar.setGravity(19);
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20190t5, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f6Var));
            ytVar.setBackground(null);
            ytVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ytVar, k7.b6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ytVar.setTextSize(1, 18.0f);
            ytVar.setMaxLines(4);
            ytVar.setGravity(19);
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20190t5, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f6Var));
            ytVar.setBackground(null);
            ytVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ytVar, k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.f24368b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        yl0 yl0Var = new yl0(context);
        this.f24369c = yl0Var;
        geVar.setImageDrawable(yl0Var);
        if (i10 == 0) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, k7.b6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19943f7, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        geVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 1, -1));
        geVar.setOnClickListener(new dg.p(this, qv0Var, f6Var, 24));
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

    public void setDelegate(cu cuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, zt ztVar) {
    }

    public void q(int i10, int i11) {
    }
}
