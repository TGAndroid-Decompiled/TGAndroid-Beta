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
public class au extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, gv0 {
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public org.telegram.ui.ActionBar.q1 G;
    public final int H;
    public final org.telegram.ui.ActionBar.c6 I;
    public boolean J;
    public boolean K;
    public final lh.m7 L;
    public boolean M;
    public float N;
    public boolean O;
    public boolean P;
    public int Q;
    public final vt f26882a;
    public final je f26883b;
    public final ol0 f26884c;
    public wt d;
    public boolean f26885e;
    public hv0 f26886f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean f26887n;
    public int f26888r;
    public int f26889s;
    public boolean v;
    public int f26890w;
    public boolean f26891x;
    public boolean f26892y;

    public au(Context context, org.telegram.ui.dd ddVar, org.telegram.ui.ko koVar) {
        this(context, ddVar, koVar, 0, false, null);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.H) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f26889s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26889s).commit();
            } else {
                this.f26888r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26888r).commit();
            }
        }
        boolean z12 = false;
        if (this.f26885e) {
            if (z10) {
                i11 = this.f26889s;
            } else {
                i11 = this.f26888r;
            }
            if (this.F) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f26891x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                hv0 hv0Var = this.f26886f;
                if (hv0Var != null) {
                    this.f26890w = layoutParams.height;
                    hv0Var.requestLayout();
                    this.f26886f.getHeight();
                    if (this.P != this.f26891x) {
                        p();
                    }
                }
            }
        }
        this.P = this.f26891x;
        int i17 = this.C;
        boolean z13 = true;
        vt vtVar = this.f26882a;
        if (i17 == i10 && this.D == z10) {
            if (b()) {
                if (vtVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f26886f.getHeight();
            return;
        }
        this.C = i10;
        this.D = z10;
        boolean z14 = this.v;
        z13 = (!vtVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.f26885e) {
            x(0);
        }
        if (this.f26890w != 0 && !(z11 = this.v) && z11 != z14 && !this.f26885e) {
            this.f26890w = 0;
            this.f26886f.requestLayout();
        }
        if (this.v && this.J) {
            this.J = false;
            AndroidUtilities.cancelRunOnUIThread(this.L);
        }
        this.f26886f.getHeight();
    }

    public boolean a() {
        int i10 = this.H;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.r30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f26882a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            wt wtVar = this.d;
            if (wtVar != null) {
                wtVar.L.f1();
            }
            vt vtVar = this.f26882a;
            if (vtVar != null) {
                int currentTextColor = vtVar.getCurrentTextColor();
                vtVar.setTextColor(-1);
                vtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        wt wtVar = this.d;
        if (wtVar != null && wtVar.Y0 != UserConfig.selectedAccount) {
            this.f26886f.removeView(wtVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.H;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        wt wtVar2 = new wt(this, this.h, this.E, context, b10, z10, this.I, this.O);
        this.d = wtVar2;
        wtVar2.f28581c = this.Q;
        wtVar2.Q0 = this.M;
        wtVar2.setVisibility(8);
        this.N = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new yt(this));
        this.f26886f.addView(this.d);
    }

    public st getEditText() {
        return this.f26882a;
    }

    public View getEmojiButton() {
        return this.f26883b;
    }

    public int getEmojiPadding() {
        return this.f26890w;
    }

    public float getEmojiPaddingShown() {
        return this.N;
    }

    public fz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.f26889s;
        } else {
            i10 = this.f26888r;
        }
        if (this.F) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f26891x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f26882a.getText();
    }

    public int h() {
        return p5.g();
    }

    public final void j() {
        wt wtVar;
        if (!this.f26885e && (wtVar = this.d) != null && wtVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.N = 0.0f;
        }
        this.f26890w = 0;
        boolean z10 = this.f26891x;
        this.f26891x = false;
        if (z10) {
            wt wtVar2 = this.d;
            if (wtVar2 != null) {
                wtVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f26885e) {
            x(0);
        }
        if (z10) {
            wt wtVar = this.d;
            if (wtVar != null && wtVar.getVisibility() == 0 && !this.J) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.N = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new gh.b(this, measuredHeight, 3));
                this.K = true;
                ofFloat.addListener(new org.telegram.ui.bm(this, 24));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f26891x;
        this.f26891x = false;
        if (z11) {
            wt wtVar2 = this.d;
            if (wtVar2 != null) {
                wtVar2.t(false);
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
        wt wtVar = this.d;
        if (wtVar != null && wtVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f26882a.length();
    }

    public final void o() {
        this.f26892y = true;
        wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.D();
        }
        hv0 hv0Var = this.f26886f;
        if (hv0Var != null) {
            hv0Var.f29257r.remove(this);
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
            vt vtVar = this.f26882a;
            vtVar.requestFocus();
            AndroidUtilities.showKeyboard(vtVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.J = true;
                u();
                lh.m7 m7Var = this.L;
                AndroidUtilities.cancelRunOnUIThread(m7Var);
                AndroidUtilities.runOnUIThread(m7Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.G = q1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.Q = i10;
        wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.f28581c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f9;
        int i11;
        int dp;
        vt vtVar = this.f26882a;
        vtVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f26883b.setVisibility(i10);
        if (this.H == 0) {
            f9 = 11.0f;
        } else {
            f9 = 8.0f;
        }
        int dp2 = AndroidUtilities.dp(f9);
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
            vtVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        vtVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f26882a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f26882a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f26882a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f26882a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f26882a.setSelection(i10);
    }

    public void setSizeNotifierLayout(hv0 hv0Var) {
        hv0 hv0Var2 = this.f26886f;
        if (hv0Var2 != null) {
            hv0Var2.f29257r.remove(this);
        }
        this.f26886f = hv0Var;
        hv0Var.f29257r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        vt vtVar = this.f26882a;
        int inputType = vtVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (vtVar.getInputType() != i10) {
            vtVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26882a.setText(charSequence);
    }

    public boolean t(int i10) {
        return true;
    }

    public final void v() {
        int i10;
        u();
        if (!AndroidUtilities.usingHardwareInput && !this.A) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        x(i10);
        vt vtVar = this.f26882a;
        vtVar.requestFocus();
        AndroidUtilities.showKeyboard(vtVar);
        if (this.A) {
            this.B = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.J = true;
            lh.m7 m7Var = this.L;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f26882a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        ol0 ol0Var = this.f26884c;
        int i12 = 0;
        if (i10 == 1) {
            wt wtVar = this.d;
            if (wtVar != null) {
                wtVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f26885e = true;
            this.N = 1.0f;
            wt wtVar2 = this.d;
            if (this.f26888r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f26888r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f26888r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f26889s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f26889s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f26889s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f26889s;
            } else {
                i11 = this.f26888r;
            }
            if (this.F) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f26891x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wtVar2.getLayoutParams();
            layoutParams.height = i13;
            wtVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f26882a);
            }
            hv0 hv0Var = this.f26886f;
            if (hv0Var != null) {
                this.f26890w = i13;
                hv0Var.requestLayout();
                ol0Var.a(R.drawable.input_keyboard, true);
                this.f26886f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.N = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f26883b != null) {
            if (this.H == 0) {
                ol0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                ol0Var.a(R.drawable.input_smile, true);
            }
        }
        if (this.d != null) {
            this.f26885e = false;
            p();
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                this.d.setVisibility(8);
                this.N = 0.0f;
            }
        }
        hv0 hv0Var2 = this.f26886f;
        if (hv0Var2 != null) {
            if (i10 == 0) {
                this.f26890w = 0;
                this.N = 0.0f;
            }
            hv0Var2.requestLayout();
            this.f26886f.getHeight();
        }
    }

    public au(Context context, hv0 hv0Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.A = true;
        this.L = new lh.m7(this, 19);
        this.Q = 2;
        this.E = z10;
        this.I = c6Var;
        this.H = i10;
        this.h = o2Var;
        this.f26886f = hv0Var;
        hv0Var.f29257r.add(this);
        vt vtVar = new vt(this, context, c6Var, i10);
        this.f26882a = vtVar;
        vtVar.setImeOptions(268435456);
        vtVar.setInputType(vtVar.getInputType() | 16384);
        vtVar.setFocusable(vtVar.isEnabled());
        vtVar.setCursorSize(AndroidUtilities.dp(20.0f));
        vtVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        vtVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (i10 == 0) {
            vtVar.setTextSize(1, 18.0f);
            vtVar.setMaxLines(4);
            vtVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            vtVar.setBackground(null);
            vtVar.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23189k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23206l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, c6Var));
            vtVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            vtVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            vtVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23392vf, c6Var));
            vtVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(vtVar, i7.f6.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            vtVar.setTextSize(1, 16.0f);
            vtVar.setMaxLines(8);
            vtVar.setGravity(19);
            vtVar.setAllowTextEntitiesIntersection(true);
            vtVar.setHintTextColor(-1929379841);
            vtVar.setTextColor(-1);
            vtVar.setCursorColor(-1);
            vtVar.setBackground(null);
            vtVar.setClipToPadding(false);
            vtVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            vtVar.setHandlesColor(-1);
            vtVar.setHighlightColor(822083583);
            vtVar.setLinkTextColor(-12147733);
            vtVar.quoteColor = -1;
            vtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(vtVar, i7.f6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            vtVar.setTextSize(1, 18.0f);
            vtVar.setMaxLines(4);
            vtVar.setGravity(19);
            vtVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23345t5, c6Var));
            vtVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
            vtVar.setBackground(null);
            vtVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(vtVar, i7.f6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            vtVar.setTextSize(1, 18.0f);
            vtVar.setMaxLines(4);
            vtVar.setGravity(19);
            vtVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23345t5, c6Var));
            vtVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
            vtVar.setBackground(null);
            vtVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(vtVar, i7.f6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        je jeVar = new je(this, context);
        this.f26883b = jeVar;
        jeVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ol0 ol0Var = new ol0(context);
        this.f26884c = ol0Var;
        jeVar.setImageDrawable(ol0Var);
        if (i10 == 0) {
            ol0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            ol0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(jeVar, i7.f6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            ol0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            ol0Var.a(R.drawable.input_smile, false);
            addView(jeVar, i7.f6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            ol0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            ol0Var.a(R.drawable.input_smile, false);
            addView(jeVar, i7.f6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            ol0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23100f7, c6Var), PorterDuff.Mode.MULTIPLY));
            ol0Var.a(R.drawable.input_smile, false);
            addView(jeVar, i7.f6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            ol0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            ol0Var.a(R.drawable.input_smile, false);
            addView(jeVar, i7.f6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        jeVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, -1));
        jeVar.setOnClickListener(new bg.q(this, hv0Var, c6Var, 27));
        jeVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f9) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(zt ztVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, wt wtVar) {
    }

    public void q(int i10, int i11) {
    }
}
