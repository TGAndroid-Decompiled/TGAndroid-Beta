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

public class tt extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, yu0 {
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public org.telegram.ui.ActionBar.p1 G;
    public final int H;
    public final org.telegram.ui.ActionBar.c6 I;
    public boolean J;
    public boolean K;
    public final m.i3 L;
    public boolean M;
    public float N;
    public boolean O;
    public boolean P;
    public int Q;

    public final ot f32875a;

    public final ce f32876b;

    public final el0 f32877c;
    public pt d;

    public boolean f32878e;

    public zu0 f32879f;
    public final org.telegram.ui.ActionBar.n2 h;

    public boolean f32880n;

    public int f32881r;

    public int f32882s;
    public boolean v;

    public int f32883w;

    public boolean f32884x;

    public boolean f32885y;

    public tt(Context context, org.telegram.ui.ed edVar, org.telegram.ui.jo joVar) {
        this(context, edVar, joVar, 0, false, null);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i11 = this.H) == 2 || i11 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.f32882s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f32882s).commit();
            } else {
                this.f32881r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f32881r).commit();
            }
        }
        boolean z12 = false;
        if (this.f32878e) {
            int iMin = (z10 ? this.f32882s : this.f32881r) + (this.F ? AndroidUtilities.navigationBarHeight : 0);
            if (this.f32884x) {
                iMin = Math.min(AndroidUtilities.dp(200.0f) + iMin, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != iMin) {
                layoutParams.width = i13;
                layoutParams.height = iMin;
                this.d.setLayoutParams(layoutParams);
                zu0 zu0Var = this.f32879f;
                if (zu0Var != null) {
                    this.f32883w = layoutParams.height;
                    zu0Var.requestLayout();
                    this.f32879f.getHeight();
                    if (this.P != this.f32884x) {
                        p();
                    }
                }
            }
        }
        this.P = this.f32884x;
        int i14 = this.C;
        ot otVar = this.f32875a;
        if (i14 == i10 && this.D == z10) {
            if (b()) {
                if (otVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f32879f.getHeight();
            return;
        }
        this.C = i10;
        this.D = z10;
        boolean z13 = this.v;
        boolean z14 = otVar.isFocused() && i10 > 0;
        this.v = z14;
        if (z14 && this.f32878e) {
            x(0);
        }
        if (this.f32883w != 0 && !(z11 = this.v) && z11 != z13 && !this.f32878e) {
            this.f32883w = 0;
            this.f32879f.requestLayout();
        }
        if (this.v && this.J) {
            this.J = false;
            AndroidUtilities.cancelRunOnUIThread(this.L);
        }
        this.f32879f.getHeight();
    }

    public boolean a() {
        int i10 = this.H;
        return i10 == 2 || i10 == 3 || i10 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.r30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.f32875a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            pt ptVar = this.d;
            if (ptVar != null) {
                ptVar.L.f1();
            }
            ot otVar = this.f32875a;
            if (otVar != null) {
                int currentTextColor = otVar.getCurrentTextColor();
                otVar.setTextColor(-1);
                otVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        pt ptVar = this.d;
        if (ptVar != null && ptVar.Y0 != UserConfig.selectedAccount) {
            this.f32879f.removeView(ptVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean zB = b();
        int i10 = this.H;
        pt ptVar2 = new pt(this, this.h, this.E, context, zB, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.I, this.O);
        this.d = ptVar2;
        ptVar2.f34983c = this.Q;
        ptVar2.Q0 = this.M;
        ptVar2.setVisibility(8);
        this.N = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new rt(this));
        this.f32879f.addView(this.d);
    }

    public lt getEditText() {
        return this.f32875a;
    }

    public View getEmojiButton() {
        return this.f32876b;
    }

    public int getEmojiPadding() {
        return this.f32883w;
    }

    public float getEmojiPaddingShown() {
        return this.N;
    }

    public yy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = AndroidUtilities.displaySize;
        int i10 = (point.x > point.y ? this.f32882s : this.f32881r) + (this.F ? AndroidUtilities.navigationBarHeight : 0);
        return this.f32884x ? Math.min(AndroidUtilities.dp(200.0f) + i10, AndroidUtilities.displaySize.y) : i10;
    }

    public Editable getText() {
        return this.f32875a.getText();
    }

    public int h() {
        return k5.g();
    }

    public final void j() {
        pt ptVar;
        if (!this.f32878e && (ptVar = this.d) != null && ptVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.N = 0.0f;
        }
        this.f32883w = 0;
        boolean z10 = this.f32884x;
        this.f32884x = false;
        if (z10) {
            pt ptVar2 = this.d;
            if (ptVar2 != null) {
                ptVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f32878e) {
            x(0);
        }
        if (z10) {
            pt ptVar = this.d;
            if (ptVar == null || ptVar.getVisibility() != 0 || this.J) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.N = 1.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                valueAnimatorOfFloat.addUpdateListener(new eh.b(this, measuredHeight, 3));
                this.K = true;
                valueAnimatorOfFloat.addListener(new org.telegram.ui.am(this, 24));
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                valueAnimatorOfFloat.start();
            }
        }
        boolean z11 = this.f32884x;
        this.f32884x = false;
        if (z11) {
            pt ptVar2 = this.d;
            if (ptVar2 != null) {
                ptVar2.u(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        pt ptVar = this.d;
        return ptVar != null && ptVar.getVisibility() == 0;
    }

    public final int n() {
        return this.f32875a.length();
    }

    public final void o() {
        this.f32885y = true;
        pt ptVar = this.d;
        if (ptVar != null) {
            ptVar.E();
        }
        zu0 zu0Var = this.f32879f;
        if (zu0Var != null) {
            zu0Var.f35387r.remove(this);
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
            ot otVar = this.f32875a;
            otVar.requestFocus();
            AndroidUtilities.showKeyboard(otVar);
            if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.J = true;
            u();
            m.i3 i3Var = this.L;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.G = p1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.Q = i10;
        pt ptVar = this.d;
        if (ptVar != null) {
            ptVar.f34983c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        ot otVar = this.f32875a;
        otVar.setEnabled(z10);
        this.f32876b.setVisibility(z10 ? 0 : 8);
        int iDp = AndroidUtilities.dp(this.H == 0 ? 11.0f : 8.0f);
        if (z10) {
            otVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), iDp);
        } else {
            otVar.setPadding(0, 0, 0, iDp);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f32875a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f32875a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f32875a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f32875a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f32875a.setSelection(i10);
    }

    public void setSizeNotifierLayout(zu0 zu0Var) {
        zu0 zu0Var2 = this.f32879f;
        if (zu0Var2 != null) {
            zu0Var2.f35387r.remove(this);
        }
        this.f32879f = zu0Var;
        zu0Var.f35387r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        ot otVar = this.f32875a;
        int inputType = otVar.getInputType();
        int i10 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (otVar.getInputType() != i10) {
            otVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f32875a.setText(charSequence);
    }

    public boolean t(int i10) {
        return true;
    }

    public final void v() {
        u();
        x((AndroidUtilities.usingHardwareInput || this.A) ? 0 : 2);
        ot otVar = this.f32875a;
        otVar.requestFocus();
        AndroidUtilities.showKeyboard(otVar);
        if (this.A) {
            this.B = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.J = true;
        m.i3 i3Var = this.L;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 100L);
    }

    public final void w(int i10, int i11) {
        this.f32875a.setSelection(i10, i11);
    }

    public void x(int i10) {
        el0 el0Var = this.f32877c;
        if (i10 != 1) {
            if (this.f32876b != null) {
                if (this.H == 0) {
                    el0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    el0Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.f32878e = false;
                p();
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    this.d.setVisibility(8);
                    this.N = 0.0f;
                }
            }
            zu0 zu0Var = this.f32879f;
            if (zu0Var != null) {
                if (i10 == 0) {
                    this.f32883w = 0;
                    this.N = 0.0f;
                }
                zu0Var.requestLayout();
                this.f32879f.getHeight();
                return;
            }
            return;
        }
        pt ptVar = this.d;
        if (ptVar != null) {
            ptVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.f32878e = true;
        this.N = 1.0f;
        pt ptVar2 = this.d;
        if (this.f32881r <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.f32881r = AndroidUtilities.dp(150.0f);
            } else {
                this.f32881r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.f32882s <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.f32882s = AndroidUtilities.dp(150.0f);
            } else {
                this.f32882s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int iMin = (point.x > point.y ? this.f32882s : this.f32881r) + (this.F ? AndroidUtilities.navigationBarHeight : 0);
        if (this.f32884x) {
            iMin = Math.min(AndroidUtilities.dp(200.0f) + iMin, AndroidUtilities.displaySize.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ptVar2.getLayoutParams();
        layoutParams.height = iMin;
        ptVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.f32875a);
        }
        zu0 zu0Var2 = this.f32879f;
        if (zu0Var2 != null) {
            this.f32883w = iMin;
            zu0Var2.requestLayout();
            el0Var.a(R.drawable.input_keyboard, true);
            this.f32879f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.N = 1.0f;
        c(0.0f);
    }

    public tt(Context context, zu0 zu0Var, org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.A = true;
        this.L = new m.i3(this, 16);
        this.Q = 2;
        this.E = z10;
        this.I = c6Var;
        this.H = i10;
        this.h = n2Var;
        this.f32879f = zu0Var;
        zu0Var.f35387r.add(this);
        ot otVar = new ot(this, context, c6Var, i10);
        this.f32875a = otVar;
        otVar.setImeOptions(268435456);
        otVar.setInputType(otVar.getInputType() | 16384);
        otVar.setFocusable(otVar.isEnabled());
        otVar.setCursorSize(AndroidUtilities.dp(20.0f));
        otVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        otVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (i10 == 0) {
            otVar.setTextSize(1, 18.0f);
            otVar.setMaxLines(4);
            otVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            otVar.setBackground(null);
            otVar.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23181k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23198l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var));
            otVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            otVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            otVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23382vf, c6Var));
            otVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(otVar, h7.z5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            otVar.setTextSize(1, 16.0f);
            otVar.setMaxLines(8);
            otVar.setGravity(19);
            otVar.setAllowTextEntitiesIntersection(true);
            otVar.setHintTextColor(-1929379841);
            otVar.setTextColor(-1);
            otVar.setCursorColor(-1);
            otVar.setBackground(null);
            otVar.setClipToPadding(false);
            otVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            otVar.setHandlesColor(-1);
            otVar.setHighlightColor(822083583);
            otVar.setLinkTextColor(-12147733);
            otVar.quoteColor = -1;
            otVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(otVar, h7.z5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            otVar.setTextSize(1, 18.0f);
            otVar.setMaxLines(4);
            otVar.setGravity(19);
            otVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23338t5, c6Var));
            otVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
            otVar.setBackground(null);
            otVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(otVar, h7.z5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            otVar.setTextSize(1, 18.0f);
            otVar.setMaxLines(4);
            otVar.setGravity(19);
            otVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23338t5, c6Var));
            otVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
            otVar.setBackground(null);
            otVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(otVar, h7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ce ceVar = new ce(this, context);
        this.f32876b = ceVar;
        ceVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        el0 el0Var = new el0(context);
        this.f32877c = el0Var;
        ceVar.setImageDrawable(el0Var);
        if (i10 == 0) {
            el0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            el0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(ceVar, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            el0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            el0Var.a(R.drawable.input_smile, false);
            addView(ceVar, h7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            el0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            el0Var.a(R.drawable.input_smile, false);
            addView(ceVar, h7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            el0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23091f7, c6Var), PorterDuff.Mode.MULTIPLY));
            el0Var.a(R.drawable.input_smile, false);
            addView(ceVar, h7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            el0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
            el0Var.a(R.drawable.input_smile, false);
            addView(ceVar, h7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        ceVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 1, -1));
        ceVar.setOnClickListener(new gg.f(this, zu0Var, c6Var, 26));
        ceVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f10) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(st stVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, pt ptVar) {
    }

    public void q(int i10, int i11) {
    }
}
