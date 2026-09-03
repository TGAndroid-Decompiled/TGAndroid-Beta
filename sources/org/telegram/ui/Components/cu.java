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
public class cu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
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
    public final xt f24030a;
    public final ge f24031b;
    public final xl0 f24032c;
    public yt d;
    public boolean e;
    public qv0 f24033f;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean f24034n;
    public int f24035r;
    public int f24036s;
    public boolean v;
    public int f24037w;
    public boolean f24038x;
    public boolean f24039y;

    public cu(Context context, org.telegram.ui.ld ldVar, org.telegram.ui.ro roVar) {
        this(context, ldVar, roVar, 0, false, null);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.I) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z4) {
                this.f24036s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f24036s).commit();
            } else {
                this.f24035r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f24035r).commit();
            }
        }
        boolean z11 = false;
        if (this.e) {
            if (z4) {
                i11 = this.f24036s;
            } else {
                i11 = this.f24035r;
            }
            if (this.G) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f24038x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                qv0 qv0Var = this.f24033f;
                if (qv0Var != null) {
                    this.f24037w = layoutParams.height;
                    qv0Var.requestLayout();
                    this.f24033f.getHeight();
                    if (this.Q != this.f24038x) {
                        p();
                    }
                }
            }
        }
        this.Q = this.f24038x;
        int i17 = this.D;
        boolean z12 = true;
        xt xtVar = this.f24030a;
        if (i17 == i10 && this.E == z4) {
            if (b()) {
                if (xtVar.isFocused() && i10 > 0) {
                    z11 = true;
                }
                this.v = z11;
            }
            this.f24033f.getHeight();
            return;
        }
        this.D = i10;
        this.E = z4;
        boolean z13 = this.v;
        z12 = (!xtVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z12;
        if (z12 && this.e) {
            x(0);
        }
        if (this.f24037w != 0 && !(z10 = this.v) && z10 != z13 && !this.e) {
            this.f24037w = 0;
            this.f24033f.requestLayout();
        }
        if (this.v && this.K) {
            this.K = false;
            AndroidUtilities.cancelRunOnUIThread(this.M);
        }
        this.f24033f.getHeight();
    }

    public boolean a() {
        int i10 = this.I;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.f40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f24030a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            yt ytVar = this.d;
            if (ytVar != null) {
                ytVar.M.e1();
            }
            xt xtVar = this.f24030a;
            if (xtVar != null) {
                int currentTextColor = xtVar.getCurrentTextColor();
                xtVar.setTextColor(-1);
                xtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z4;
        yt ytVar = this.d;
        if (ytVar != null && ytVar.Z0 != UserConfig.selectedAccount) {
            this.f24033f.removeView(ytVar);
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
        yt ytVar2 = new yt(this, this.h, this.F, context, b10, z4, this.J, this.P);
        this.d = ytVar2;
        ytVar2.f26428c = this.R;
        ytVar2.R0 = this.N;
        ytVar2.setVisibility(8);
        this.O = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new au(this));
        this.f24033f.addView(this.d);
    }

    public ut getEditText() {
        return this.f24030a;
    }

    public View getEmojiButton() {
        return this.f24031b;
    }

    public int getEmojiPadding() {
        return this.f24037w;
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
            i10 = this.f24036s;
        } else {
            i10 = this.f24035r;
        }
        if (this.G) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f24038x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f24030a.getText();
    }

    public int h() {
        return l5.g();
    }

    public final void j() {
        yt ytVar;
        if (!this.e && (ytVar = this.d) != null && ytVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.O = 0.0f;
        }
        this.f24037w = 0;
        boolean z4 = this.f24038x;
        this.f24038x = false;
        if (z4) {
            yt ytVar2 = this.d;
            if (ytVar2 != null) {
                ytVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z4) {
        if (this.e) {
            x(0);
        }
        if (z4) {
            yt ytVar = this.d;
            if (ytVar != null && ytVar.getVisibility() == 0 && !this.K) {
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
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z10 = this.f24038x;
        this.f24038x = false;
        if (z10) {
            yt ytVar2 = this.d;
            if (ytVar2 != null) {
                ytVar2.t(false);
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
        yt ytVar = this.d;
        if (ytVar != null && ytVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f24030a.length();
    }

    public final void o() {
        this.f24039y = true;
        yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.D();
        }
        qv0 qv0Var = this.f24033f;
        if (qv0Var != null) {
            qv0Var.f28304r.remove(this);
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
            xt xtVar = this.f24030a;
            xtVar.requestFocus();
            AndroidUtilities.showKeyboard(xtVar);
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
        yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.f26428c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z4) {
        int i10;
        float f10;
        int i11;
        int dp;
        xt xtVar = this.f24030a;
        xtVar.setEnabled(z4);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f24031b.setVisibility(i10);
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
            xtVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        xtVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f24030a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z4) {
        this.f24030a.setFocusable(z4);
    }

    public void setHint(CharSequence charSequence) {
        this.f24030a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f24030a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f24030a.setSelection(i10);
    }

    public void setSizeNotifierLayout(qv0 qv0Var) {
        qv0 qv0Var2 = this.f24033f;
        if (qv0Var2 != null) {
            qv0Var2.f28304r.remove(this);
        }
        this.f24033f = qv0Var;
        qv0Var.f28304r.add(this);
    }

    public void setSuggestionsEnabled(boolean z4) {
        int i10;
        xt xtVar = this.f24030a;
        int inputType = xtVar.getInputType();
        if (!z4) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (xtVar.getInputType() != i10) {
            xtVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f24030a.setText(charSequence);
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
        xt xtVar = this.f24030a;
        xtVar.requestFocus();
        AndroidUtilities.showKeyboard(xtVar);
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
        this.f24030a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        xl0 xl0Var = this.f24032c;
        int i12 = 0;
        if (i10 == 1) {
            yt ytVar = this.d;
            if (ytVar != null) {
                ytVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.O = 1.0f;
            yt ytVar2 = this.d;
            if (this.f24035r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f24035r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f24035r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f24036s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f24036s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f24036s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f24036s;
            } else {
                i11 = this.f24035r;
            }
            if (this.G) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f24038x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ytVar2.getLayoutParams();
            layoutParams.height = i13;
            ytVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f24030a);
            }
            qv0 qv0Var = this.f24033f;
            if (qv0Var != null) {
                this.f24037w = i13;
                qv0Var.requestLayout();
                xl0Var.a(R.drawable.input_keyboard, true);
                this.f24033f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.O = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f24031b != null) {
            if (this.I == 0) {
                xl0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                xl0Var.a(R.drawable.input_smile, true);
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
        qv0 qv0Var2 = this.f24033f;
        if (qv0Var2 != null) {
            if (i10 == 0) {
                this.f24037w = 0;
                this.O = 0.0f;
            }
            qv0Var2.requestLayout();
            this.f24033f.getHeight();
        }
    }

    public cu(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.B = true;
        this.M = new m2.b(this, 18);
        this.R = 2;
        this.F = z4;
        this.J = f6Var;
        this.I = i10;
        this.h = p2Var;
        this.f24033f = qv0Var;
        qv0Var.f28304r.add(this);
        xt xtVar = new xt(this, context, f6Var, i10);
        this.f24030a = xtVar;
        xtVar.setImeOptions(268435456);
        xtVar.setInputType(xtVar.getInputType() | 16384);
        xtVar.setFocusable(xtVar.isEnabled());
        xtVar.setCursorSize(AndroidUtilities.dp(20.0f));
        xtVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        xtVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            xtVar.setTextSize(1, 18.0f);
            xtVar.setMaxLines(4);
            xtVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            xtVar.setBackground(null);
            xtVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20006k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20024l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20097p7, f6Var));
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            xtVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20209vf, f6Var));
            xtVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z10 = LocaleController.isRTL;
            addView(xtVar, k7.b6.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            xtVar.setTextSize(1, 16.0f);
            xtVar.setMaxLines(8);
            xtVar.setGravity(19);
            xtVar.setAllowTextEntitiesIntersection(true);
            xtVar.setHintTextColor(-1929379841);
            xtVar.setTextColor(-1);
            xtVar.setCursorColor(-1);
            xtVar.setBackground(null);
            xtVar.setClipToPadding(false);
            xtVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            xtVar.setHandlesColor(-1);
            xtVar.setHighlightColor(822083583);
            xtVar.setLinkTextColor(-12147733);
            xtVar.quoteColor = -1;
            xtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(xtVar, k7.b6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            xtVar.setTextSize(1, 18.0f);
            xtVar.setMaxLines(4);
            xtVar.setGravity(19);
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20165t5, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
            xtVar.setBackground(null);
            xtVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(xtVar, k7.b6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            xtVar.setTextSize(1, 18.0f);
            xtVar.setMaxLines(4);
            xtVar.setGravity(19);
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20165t5, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
            xtVar.setBackground(null);
            xtVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(xtVar, k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.f24031b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xl0 xl0Var = new xl0(context);
        this.f24032c = xl0Var;
        geVar.setImageDrawable(xl0Var);
        if (i10 == 0) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, k7.b6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19918f7, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        geVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), 1, -1));
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

    public void setDelegate(bu buVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, yt ytVar) {
    }

    public void q(int i10, int i11) {
    }
}
