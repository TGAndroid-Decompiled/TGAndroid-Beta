package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class t40 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.u6 F;
    public boolean G;
    public boolean H;
    public final bi.md f32834a;
    public ImageView f32835b;
    public final ImageView f32836c;
    public org.telegram.ui.Cells.s1 d;
    public View e;
    public AnimatorSet f32837f;
    public Runnable h;
    public final int f32838n;
    public final boolean f32839r;
    public String f32840s;
    public int v;
    public float f32841w;
    public float f32842x;
    public int f32843y;

    public t40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f32834a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f32835b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f32835b.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f32835b;
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.f23588pf, 125);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i10 = h.f22486a;
        float f11 = h.d;
        org.telegram.ui.ActionBar.u6 u6Var = this.F;
        int Q = org.telegram.ui.ActionBar.f7.Q(i10, -1, 1, f11, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.f7.O(imageView2, 5, i10, -1, 1, f11, u6Var, Q, porterDuffColorFilter).h = mode;
        ImageView imageView3 = this.f32835b;
        boolean z10 = this.f32839r;
        if (z10) {
            f7 = 3.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 3.0f;
        }
        addView(imageView3, kb1.h(34, 34.0f, 21, 0.0f, f7, 0.0f, f10));
        setOnClickListener(new f0(this, 25));
    }

    public final void b(boolean z10) {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.h;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.h = null;
        }
        AnimatorSet animatorSet = this.f32837f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32837f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32837f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f32837f.setDuration(150L);
                this.f32837f.setInterpolator(ds.f27530f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f32837f.setDuration(300L);
            }
            this.f32837f.addListener(new r40(this, 2));
            this.f32837f.start();
            return;
        }
        setVisibility(4);
        this.e = null;
        this.d = null;
        this.f32837f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        bi.md mdVar = this.f32834a;
        org.telegram.ui.ActionBar.f7.r(mdVar);
        ImageView imageView = this.f32836c;
        org.telegram.ui.ActionBar.f7.r(imageView);
        mdVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f32838n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        mdVar.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.s1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t40.e(org.telegram.ui.Cells.s1, java.lang.Integer, int, int, boolean):boolean");
    }

    public final void f(View view, boolean z10) {
        if (this.e != view && getTag() == null) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            g(view);
            this.e = view;
            AnimatorSet animatorSet = this.f32837f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f32837f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32837f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f32836c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f32837f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f32837f.setDuration(350L);
                    this.f32837f.setInterpolator(ds.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f32837f.setDuration(300L);
                }
                this.f32837f.addListener(new r40(this, 1));
                this.f32837f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f32841w;
    }

    public org.telegram.ui.Cells.s1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f32843y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f32842x = f7;
        setTranslationY(f7 + this.f32841w);
    }

    public void setOverrideText(String str) {
        this.f32840s = str;
        this.f32834a.setText(str);
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var != null) {
            this.d = null;
            e(s1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.E = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f32834a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public t40(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        this(2, activity, u6Var, false);
    }

    public t40(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = u6Var;
        this.f32838n = i10;
        this.f32839r = z10;
        bi.md mdVar = new bi.md(context, 22);
        this.f32834a = mdVar;
        int i11 = org.telegram.ui.ActionBar.y6.f23588pf;
        org.telegram.ui.ActionBar.f7.V(mdVar, i11, u6Var);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            mdVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            mdVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            mdVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            mdVar.setGravity(19);
            int dp = AndroidUtilities.dp(5.0f);
            int i12 = org.telegram.ui.ActionBar.y6.f23605qf;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            mdVar.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(mdVar, c02, N, null, u6Var);
            mdVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(mdVar, kb1.h(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            mdVar.setGravity(51);
            int dp2 = AndroidUtilities.dp(10.0f);
            int i13 = org.telegram.ui.ActionBar.y6.f23605qf;
            ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
            mdVar.setBackground(c03);
            org.telegram.ui.ActionBar.f7.k(mdVar, c03, N2, null, u6Var);
            mdVar.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(mdVar, kb1.h(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            mdVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f32835b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f32835b.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.f7.t(this.f32835b, i11, u6Var, PorterDuff.Mode.MULTIPLY);
            addView(this.f32835b, kb1.h(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f32836c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.f23605qf, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, kb1.h(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(s40 s40Var) {
    }
}
