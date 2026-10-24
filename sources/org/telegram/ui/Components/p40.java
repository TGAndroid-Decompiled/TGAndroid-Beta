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
public class p40 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.g6 F;
    public boolean G;
    public boolean H;
    public final ai.wd f29461a;
    public ImageView f29462b;
    public final ImageView f29463c;
    public org.telegram.ui.Cells.t1 d;
    public View e;
    public AnimatorSet f29464f;
    public Runnable h;
    public final int f29465n;
    public final boolean f29466r;
    public String f29467s;
    public int v;
    public float f29468w;
    public float f29469x;
    public int f29470y;

    public p40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f29461a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f29462b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f29462b.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.u(this.f29462b, org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.f21411pf, 125), this.F, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.f29462b;
        boolean z10 = this.f29466r;
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
        addView(imageView2, w7.z5.d(34, 34.0f, 21, 0.0f, f7, 0.0f, f10));
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
        AnimatorSet animatorSet = this.f29464f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f29464f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29464f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f29464f.setDuration(150L);
                this.f29464f.setInterpolator(zr.f33337f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f29464f.setDuration(300L);
            }
            this.f29464f.addListener(new n40(this, 2));
            this.f29464f.start();
            return;
        }
        setVisibility(4);
        this.e = null;
        this.d = null;
        this.f29464f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        ai.wd wdVar = this.f29461a;
        org.telegram.ui.ActionBar.r6.r(wdVar);
        ImageView imageView = this.f29463c;
        org.telegram.ui.ActionBar.r6.r(imageView);
        wdVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f29465n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        wdVar.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.t1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p40.e(org.telegram.ui.Cells.t1, java.lang.Integer, int, int, boolean):boolean");
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
            AnimatorSet animatorSet = this.f29464f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29464f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f29464f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f29463c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f29464f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f29464f.setDuration(350L);
                    this.f29464f.setInterpolator(zr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f29464f.setDuration(300L);
                }
                this.f29464f.addListener(new n40(this, 1));
                this.f29464f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f29468w;
    }

    public org.telegram.ui.Cells.t1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f29470y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f29469x = f7;
        setTranslationY(f7 + this.f29468w);
    }

    public void setOverrideText(String str) {
        this.f29467s = str;
        this.f29461a.setText(str);
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null) {
            this.d = null;
            e(t1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.E = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f29461a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public p40(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        this(2, activity, g6Var, false);
    }

    public p40(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = g6Var;
        this.f29465n = i10;
        this.f29466r = z10;
        ai.wd wdVar = new ai.wd(context, 22);
        this.f29461a = wdVar;
        int i11 = org.telegram.ui.ActionBar.k6.f21411pf;
        org.telegram.ui.ActionBar.r6.W(wdVar, i11, g6Var);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            wdVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            wdVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            wdVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            wdVar.setGravity(19);
            int dp = AndroidUtilities.dp(5.0f);
            int i12 = org.telegram.ui.ActionBar.k6.f21430qf;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            wdVar.setBackground(c02);
            org.telegram.ui.ActionBar.r6.k(wdVar, c02, O, null, g6Var);
            wdVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(wdVar, w7.z5.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            wdVar.setGravity(51);
            int dp2 = AndroidUtilities.dp(10.0f);
            int i13 = org.telegram.ui.ActionBar.k6.f21430qf;
            ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
            wdVar.setBackground(c03);
            org.telegram.ui.ActionBar.r6.k(wdVar, c03, O2, null, g6Var);
            wdVar.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(wdVar, w7.z5.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            wdVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f29462b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f29462b.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(this.f29462b, i11, g6Var, PorterDuff.Mode.MULTIPLY);
            addView(this.f29462b, w7.z5.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f29463c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f21430qf, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, w7.z5.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(o40 o40Var) {
    }
}
