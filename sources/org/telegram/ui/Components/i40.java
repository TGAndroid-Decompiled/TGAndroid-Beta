package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class i40 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.f6 F;
    public boolean G;
    public boolean H;
    public final bi.c4 f26957a;
    public ImageView f26958b;
    public final ImageView f26959c;
    public org.telegram.ui.Cells.t1 d;
    public View f26960e;
    public AnimatorSet f26961f;
    public Runnable h;
    public final int f26962n;
    public final boolean f26963r;
    public String f26964s;
    public int v;
    public float f26965w;
    public float f26966x;
    public int f26967y;

    public i40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f26957a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f26958b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f26958b.setScaleType(ImageView.ScaleType.CENTER);
        this.f26958b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20889pf, this.F), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f26958b;
        boolean z10 = this.f26963r;
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
        addView(imageView2, w7.x5.d(34, 34.0f, 21, 0.0f, f7, 0.0f, f10));
        setOnClickListener(new g0(this, 26));
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
        AnimatorSet animatorSet = this.f26961f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26961f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26961f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f26961f.setDuration(150L);
                this.f26961f.setInterpolator(pr.f29467f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f26961f.setDuration(300L);
            }
            this.f26961f.addListener(new g40(this, 2));
            this.f26961f.start();
            return;
        }
        setVisibility(4);
        this.f26960e = null;
        this.d = null;
        this.f26961f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        bi.c4 c4Var = this.f26957a;
        c4Var.setTextColor(-1);
        this.f26959c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f26962n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        c4Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.t1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i40.e(org.telegram.ui.Cells.t1, java.lang.Integer, int, int, boolean):boolean");
    }

    public final void f(View view, boolean z10) {
        if (this.f26960e != view && getTag() == null) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            g(view);
            this.f26960e = view;
            AnimatorSet animatorSet = this.f26961f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f26961f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26961f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f26959c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f26961f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f26961f.setDuration(350L);
                    this.f26961f.setInterpolator(pr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f26961f.setDuration(300L);
                }
                this.f26961f.addListener(new g40(this, 1));
                this.f26961f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f26965w;
    }

    public org.telegram.ui.Cells.t1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f26967y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f26966x = f7;
        setTranslationY(f7 + this.f26965w);
    }

    public void setOverrideText(String str) {
        this.f26964s = str;
        this.f26957a.setText(str);
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null) {
            this.d = null;
            e(t1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j3) {
        this.E = j3;
    }

    public void setText(CharSequence charSequence) {
        this.f26957a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public i40(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        this(2, activity, f6Var, false);
    }

    public i40(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = f6Var;
        this.f26962n = i10;
        this.f26963r = z10;
        bi.c4 c4Var = new bi.c4(context, 22);
        this.f26957a = c4Var;
        int i11 = org.telegram.ui.ActionBar.j6.f20889pf;
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        c4Var.setTextSize(1, 14.0f);
        c4Var.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            c4Var.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            c4Var.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            c4Var.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            c4Var.setGravity(19);
            c4Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20907qf, f6Var)));
            c4Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(c4Var, w7.x5.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            c4Var.setGravity(51);
            c4Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20907qf, f6Var)));
            c4Var.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(c4Var, w7.x5.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            c4Var.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f26958b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f26958b.setScaleType(ImageView.ScaleType.CENTER);
            this.f26958b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f26958b, w7.x5.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f26959c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20907qf, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.x5.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(h40 h40Var) {
    }
}
