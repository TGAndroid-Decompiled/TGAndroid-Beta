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
public class m40 extends FrameLayout {
    public long B;
    public final org.telegram.ui.ActionBar.g6 C;
    public boolean D;
    public boolean E;
    public final hg.q f28967a;
    public ImageView f28968b;
    public final ImageView f28969c;
    public org.telegram.ui.Cells.t1 d;
    public View f28970e;
    public AnimatorSet f28971f;
    public Runnable h;
    public final int f28972n;
    public final boolean f28973r;
    public String f28974s;
    public int v;
    public float f28975w;
    public float f28976x;
    public int f28977y;

    public m40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f10;
        float f11;
        this.f28967a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.E = true;
        ImageView imageView = new ImageView(getContext());
        this.f28968b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f28968b.setScaleType(ImageView.ScaleType.CENTER);
        this.f28968b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21886pf, this.C), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f28968b;
        boolean z4 = this.f28973r;
        if (z4) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView2, k7.c6.d(34, 34.0f, 21, 0.0f, f10, 0.0f, f11));
        setOnClickListener(new g0(this, 26));
    }

    public final void b(boolean z4) {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.h;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.h = null;
        }
        AnimatorSet animatorSet = this.f28971f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28971f = null;
        }
        if (z4) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28971f = animatorSet2;
            boolean z10 = this.D;
            Property property = View.ALPHA;
            if (z10) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f28971f.setDuration(150L);
                this.f28971f.setInterpolator(pr.f30168f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f28971f.setDuration(300L);
            }
            this.f28971f.addListener(new k40(this, 2));
            this.f28971f.start();
            return;
        }
        setVisibility(4);
        this.f28970e = null;
        this.d = null;
        this.f28971f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f10;
        hg.q qVar = this.f28967a;
        qVar.setTextColor(-1);
        this.f28969c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f28972n;
        if (i10 != 7 && i10 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        qVar.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(f10), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.t1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m40.e(org.telegram.ui.Cells.t1, java.lang.Integer, int, int, boolean):boolean");
    }

    public final void f(View view, boolean z4) {
        if (this.f28970e != view && getTag() == null) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            g(view);
            this.f28970e = view;
            AnimatorSet animatorSet = this.f28971f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f28971f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z4) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f28971f = animatorSet2;
                boolean z10 = this.D;
                Property property = View.ALPHA;
                if (z10) {
                    ImageView imageView = this.f28969c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f28971f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f28971f.setDuration(350L);
                    this.f28971f.setInterpolator(pr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f28971f.setDuration(300L);
                }
                this.f28971f.addListener(new k40(this, 1));
                this.f28971f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f28975w;
    }

    public org.telegram.ui.Cells.t1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f28977y = i10;
    }

    public void setExtraTranslationY(float f10) {
        this.f28976x = f10;
        setTranslationY(f10 + this.f28975w);
    }

    public void setOverrideText(String str) {
        this.f28974s = str;
        this.f28967a.setText(str);
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null) {
            this.d = null;
            e(t1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.B = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f28967a.setText(charSequence);
    }

    public void setUseScale(boolean z4) {
        this.D = z4;
    }

    public m40(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        this(2, activity, g6Var, false);
    }

    public m40(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.B = 2000L;
        this.C = g6Var;
        this.f28972n = i10;
        this.f28973r = z4;
        hg.q qVar = new hg.q(context, 21);
        this.f28967a = qVar;
        int i11 = org.telegram.ui.ActionBar.k6.f21886pf;
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        qVar.setTextSize(1, 14.0f);
        qVar.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            qVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            qVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            qVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            qVar.setGravity(19);
            qVar.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21904qf, g6Var)));
            qVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(qVar, k7.c6.d(-2, 30.0f, 51, 0.0f, z4 ? 6.0f : 0.0f, 0.0f, z4 ? 0.0f : 6.0f));
        } else {
            qVar.setGravity(51);
            qVar.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21904qf, g6Var)));
            qVar.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(qVar, k7.c6.d(-2, -2.0f, 51, 0.0f, z4 ? 6.0f : 0.0f, 0.0f, z4 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            qVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f28968b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f28968b.setScaleType(ImageView.ScaleType.CENTER);
            this.f28968b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f28968b, k7.c6.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f28969c = imageView2;
        imageView2.setImageResource(z4 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21904qf, g6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, k7.c6.d(14, 6.0f, (z4 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(l40 l40Var) {
    }
}
