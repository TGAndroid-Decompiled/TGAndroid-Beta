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
public class nu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, zv0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.r1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.f6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.l9 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final iu f25595a;
    public final gg.k f25596b;
    public final am0 f25597c;
    public ju d;
    public boolean e;
    public aw0 f25598f;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean f25599n;
    public int f25600r;
    public int f25601s;
    public boolean v;
    public int f25602w;
    public boolean f25603x;
    public boolean f25604y;

    public nu(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.yo yoVar) {
        this(context, jdVar, yoVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i13 = this.L) == 2 || i13 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f25601s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f25601s).commit();
            } else {
                this.f25600r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f25600r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f25601s;
            } else {
                i11 = this.f25600r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f25603x) {
                i14 = Math.min(AndroidUtilities.dp(200.0f) + i14, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = AndroidUtilities.displaySize.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                aw0 aw0Var = this.f25598f;
                if (aw0Var != null) {
                    this.f25602w = layoutParams.height;
                    aw0Var.requestLayout();
                    this.f25598f.getHeight();
                    if (this.T != this.f25603x) {
                        p();
                    }
                }
            }
        }
        this.T = this.f25603x;
        int i17 = this.G;
        boolean z13 = true;
        iu iuVar = this.f25595a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (iuVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f25598f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.v;
        z13 = (!iuVar.isFocused() || i10 <= 0) ? false : false;
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f25602w != 0 && !(z11 = this.v) && z11 != z14 && !this.e) {
            this.f25602w = 0;
            this.f25598f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f25598f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.j40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f25595a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ju juVar = this.d;
            if (juVar != null) {
                juVar.P.e1();
            }
            iu iuVar = this.f25595a;
            if (iuVar != null) {
                int currentTextColor = iuVar.getCurrentTextColor();
                iuVar.setTextColor(-1);
                iuVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        ju juVar = this.d;
        if (juVar != null && juVar.f26805c1 != UserConfig.selectedAccount) {
            this.f25598f.removeView(juVar);
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
        ju juVar2 = new ju(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = juVar2;
        juVar2.f26803c = this.U;
        juVar2.U0 = this.Q;
        juVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new lu(this));
        this.f25598f.addView(this.d);
    }

    public fu getEditText() {
        return this.f25595a;
    }

    public View getEmojiButton() {
        return this.f25596b;
    }

    public int getEmojiPadding() {
        return this.f25602w;
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
            i10 = this.f25601s;
        } else {
            i10 = this.f25600r;
        }
        if (this.J) {
            i11 = AndroidUtilities.navigationBarHeight;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f25603x) {
            return Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f25595a.getText();
    }

    public int h() {
        return p5.g();
    }

    public final void j() {
        ju juVar;
        if (!this.e && (juVar = this.d) != null && juVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f25602w = 0;
        boolean z10 = this.f25603x;
        this.f25603x = false;
        if (z10) {
            ju juVar2 = this.d;
            if (juVar2 != null) {
                juVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            ju juVar = this.d;
            if (juVar != null && juVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.s2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new rm(this, 6));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f25603x;
        this.f25603x = false;
        if (z11) {
            ju juVar2 = this.d;
            if (juVar2 != null) {
                juVar2.t(false);
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
        ju juVar = this.d;
        if (juVar != null && juVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f25595a.length();
    }

    public final void o() {
        this.f25604y = true;
        ju juVar = this.d;
        if (juVar != null) {
            juVar.D();
        }
        aw0 aw0Var = this.f25598f;
        if (aw0Var != null) {
            aw0Var.f21643r.remove(this);
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
            iu iuVar = this.f25595a;
            iuVar.requestFocus();
            AndroidUtilities.showKeyboard(iuVar);
            if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                this.N = true;
                u();
                org.telegram.ui.Cells.l9 l9Var = this.P;
                AndroidUtilities.cancelRunOnUIThread(l9Var);
                AndroidUtilities.runOnUIThread(l9Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.r1 r1Var) {
        this.K = r1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        ju juVar = this.d;
        if (juVar != null) {
            juVar.f26803c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int dp;
        iu iuVar = this.f25595a;
        iuVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f25596b.setVisibility(i10);
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
            iuVar.setPadding(i11, 0, dp, dp2);
            return;
        }
        iuVar.setPadding(0, 0, 0, dp2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f25595a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f25595a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f25595a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f25595a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f25595a.setSelection(i10);
    }

    public void setSizeNotifierLayout(aw0 aw0Var) {
        aw0 aw0Var2 = this.f25598f;
        if (aw0Var2 != null) {
            aw0Var2.f21643r.remove(this);
        }
        this.f25598f = aw0Var;
        aw0Var.f21643r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        iu iuVar = this.f25595a;
        int inputType = iuVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (iuVar.getInputType() != i10) {
            iuVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f25595a.setText(charSequence);
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
        iu iuVar = this.f25595a;
        iuVar.requestFocus();
        AndroidUtilities.showKeyboard(iuVar);
        if (this.E) {
            this.F = true;
        } else if (!AndroidUtilities.usingHardwareInput && !this.v && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.N = true;
            org.telegram.ui.Cells.l9 l9Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            AndroidUtilities.runOnUIThread(l9Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f25595a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        am0 am0Var = this.f25597c;
        int i12 = 0;
        if (i10 == 1) {
            ju juVar = this.d;
            if (juVar != null) {
                juVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            ju juVar2 = this.d;
            if (this.f25600r <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25600r = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25600r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f25601s <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f25601s = AndroidUtilities.dp(150.0f);
                } else {
                    this.f25601s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f25601s;
            } else {
                i11 = this.f25600r;
            }
            if (this.J) {
                i12 = AndroidUtilities.navigationBarHeight;
            }
            int i13 = i11 + i12;
            if (this.f25603x) {
                i13 = Math.min(AndroidUtilities.dp(200.0f) + i13, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) juVar2.getLayoutParams();
            layoutParams.height = i13;
            juVar2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.f25595a);
            }
            aw0 aw0Var = this.f25598f;
            if (aw0Var != null) {
                this.f25602w = i13;
                aw0Var.requestLayout();
                am0Var.a(R.drawable.input_keyboard, true);
                this.f25598f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f25596b != null) {
            if (this.L == 0) {
                am0Var.a(R.drawable.smiles_tab_smiles, true);
            } else {
                am0Var.a(R.drawable.input_smile, true);
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
        aw0 aw0Var2 = this.f25598f;
        if (aw0Var2 != null) {
            if (i10 == 0) {
                this.f25602w = 0;
                this.R = 0.0f;
            }
            aw0Var2.requestLayout();
            this.f25598f.getHeight();
        }
    }

    public nu(Context context, aw0 aw0Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.l9(this, 7);
        this.U = 2;
        this.I = z10;
        this.M = f6Var;
        this.L = i10;
        this.h = p2Var;
        this.f25598f = aw0Var;
        aw0Var.f21643r.add(this);
        iu iuVar = new iu(this, context, f6Var, i10);
        this.f25595a = iuVar;
        iuVar.setImeOptions(268435456);
        iuVar.setInputType(iuVar.getInputType() | 16384);
        iuVar.setFocusable(iuVar.isEnabled());
        iuVar.setCursorSize(AndroidUtilities.dp(20.0f));
        iuVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        iuVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            iuVar.setTextSize(1, 18.0f);
            iuVar.setMaxLines(4);
            iuVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            iuVar.setBackground(null);
            iuVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18055k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18073l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18144p7, f6Var));
            iuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            iuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            iuVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
            iuVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(iuVar, w7.a6.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            iuVar.setTextSize(1, 16.0f);
            iuVar.setMaxLines(8);
            iuVar.setGravity(19);
            iuVar.setAllowTextEntitiesIntersection(true);
            iuVar.setHintTextColor(-1929379841);
            iuVar.setTextColor(-1);
            iuVar.setCursorColor(-1);
            iuVar.setBackground(null);
            iuVar.setClipToPadding(false);
            iuVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            iuVar.setHandlesColor(-1);
            iuVar.setHighlightColor(822083583);
            iuVar.setLinkTextColor(-12147733);
            iuVar.quoteColor = -1;
            iuVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(iuVar, w7.a6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            iuVar.setTextSize(1, 18.0f);
            iuVar.setMaxLines(4);
            iuVar.setGravity(19);
            iuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18217t5, f6Var));
            iuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
            iuVar.setBackground(null);
            iuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(iuVar, w7.a6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            iuVar.setTextSize(1, 18.0f);
            iuVar.setMaxLines(4);
            iuVar.setGravity(19);
            iuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18217t5, f6Var));
            iuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
            iuVar.setBackground(null);
            iuVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(iuVar, w7.a6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        gg.k kVar = new gg.k(this, context);
        this.f25596b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        am0 am0Var = new am0(context);
        this.f25597c = am0Var;
        kVar.setImageDrawable(am0Var);
        if (i10 == 0) {
            am0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            am0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.a6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            am0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            am0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            am0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            am0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            am0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, f6Var), PorterDuff.Mode.MULTIPLY));
            am0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            am0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            am0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.a6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        kVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 1, -1));
        kVar.setOnClickListener(new bi.q(this, aw0Var, f6Var, 17));
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

    public void setDelegate(mu muVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, ju juVar) {
    }

    public void q(int i10, int i11) {
    }
}
