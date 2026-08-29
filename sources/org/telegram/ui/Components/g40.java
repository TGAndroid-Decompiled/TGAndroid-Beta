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
public class g40 extends FrameLayout {
    public long A;
    public final org.telegram.ui.ActionBar.c6 B;
    public boolean C;
    public boolean D;
    public final eg.r f28745a;
    public ImageView f28746b;
    public final ImageView f28747c;
    public org.telegram.ui.Cells.s1 d;
    public View f28748e;
    public AnimatorSet f28749f;
    public Runnable h;
    public final int f28750n;
    public final boolean f28751r;
    public String f28752s;
    public int v;
    public float f28753w;
    public float f28754x;
    public int f28755y;

    public g40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f9;
        float f10;
        this.f28745a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.D = true;
        ImageView imageView = new ImageView(getContext());
        this.f28746b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f28746b.setScaleType(ImageView.ScaleType.CENTER);
        this.f28746b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.pf, this.B), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f28746b;
        boolean z10 = this.f28751r;
        if (z10) {
            f9 = 3.0f;
        } else {
            f9 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 3.0f;
        }
        addView(imageView2, i7.f6.d(34, 34.0f, 21, 0.0f, f9, 0.0f, f10));
        setOnClickListener(new h0(this, 26));
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
        AnimatorSet animatorSet = this.f28749f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28749f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28749f = animatorSet2;
            boolean z11 = this.C;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f28749f.setDuration(150L);
                this.f28749f.setInterpolator(jr.f29800f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f28749f.setDuration(300L);
            }
            this.f28749f.addListener(new e40(this, 2));
            this.f28749f.start();
            return;
        }
        setVisibility(4);
        this.f28748e = null;
        this.d = null;
        this.f28749f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f9;
        eg.r rVar = this.f28745a;
        rVar.setTextColor(-1);
        this.f28747c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f28750n;
        if (i10 != 7 && i10 != 8) {
            f9 = 3.0f;
        } else {
            f9 = 6.0f;
        }
        rVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(f9), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.s1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g40.e(org.telegram.ui.Cells.s1, java.lang.Integer, int, int, boolean):boolean");
    }

    public final void f(View view, boolean z10) {
        if (this.f28748e != view && getTag() == null) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            g(view);
            this.f28748e = view;
            AnimatorSet animatorSet = this.f28749f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f28749f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f28749f = animatorSet2;
                boolean z11 = this.C;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f28747c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f28749f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f28749f.setDuration(350L);
                    this.f28749f.setInterpolator(jr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f28749f.setDuration(300L);
                }
                this.f28749f.addListener(new e40(this, 1));
                this.f28749f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f28753w;
    }

    public org.telegram.ui.Cells.s1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f28755y = i10;
    }

    public void setExtraTranslationY(float f9) {
        this.f28754x = f9;
        setTranslationY(f9 + this.f28753w);
    }

    public void setOverrideText(String str) {
        this.f28752s = str;
        this.f28745a.setText(str);
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var != null) {
            this.d = null;
            e(s1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.A = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f28745a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.C = z10;
    }

    public g40(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        this(2, activity, c6Var, false);
    }

    public g40(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.A = 2000L;
        this.B = c6Var;
        this.f28750n = i10;
        this.f28751r = z10;
        eg.r rVar = new eg.r(context, 21);
        this.f28745a = rVar;
        int i11 = org.telegram.ui.ActionBar.g6.pf;
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        rVar.setTextSize(1, 14.0f);
        rVar.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            rVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            rVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            rVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            rVar.setGravity(19);
            rVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23301qf, c6Var)));
            rVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(rVar, i7.f6.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            rVar.setGravity(51);
            rVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23301qf, c6Var)));
            rVar.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(rVar, i7.f6.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            rVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f28746b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f28746b.setScaleType(ImageView.ScaleType.CENTER);
            this.f28746b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f28746b, i7.f6.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f28747c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23301qf, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, i7.f6.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(f40 f40Var) {
    }
}
