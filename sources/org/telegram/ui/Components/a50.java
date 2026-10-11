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
public class a50 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.d6 F;
    public boolean G;
    public boolean H;
    public final ai.q4 f24436a;
    public ImageView f24437b;
    public final ImageView f24438c;
    public org.telegram.ui.Cells.u1 d;
    public View f24439e;
    public AnimatorSet f24440f;
    public Runnable h;
    public final int f24441n;
    public final boolean f24442r;
    public String f24443s;
    public int v;
    public float f24444w;
    public float f24445x;
    public int f24446y;

    public a50(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f24436a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f24437b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f24437b.setScaleType(ImageView.ScaleType.CENTER);
        this.f24437b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21015pf, this.F), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f24437b;
        boolean z10 = this.f24442r;
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
        addView(imageView2, w7.x5.a(34.0f, 0.0f, f7, 0.0f, f10, 34, 21));
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
        AnimatorSet animatorSet = this.f24440f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24440f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24440f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f24440f.setDuration(150L);
                this.f24440f.setInterpolator(is.f27451f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f24440f.setDuration(300L);
            }
            this.f24440f.addListener(new y40(this, 2));
            this.f24440f.start();
            return;
        }
        setVisibility(4);
        this.f24439e = null;
        this.d = null;
        this.f24440f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        ai.q4 q4Var = this.f24436a;
        q4Var.setTextColor(-1);
        this.f24438c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f24441n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        q4Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.u1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a50.e(org.telegram.ui.Cells.u1, java.lang.Integer, int, int, boolean):boolean");
    }

    public final void f(View view, boolean z10) {
        if (this.f24439e != view && getTag() == null) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            g(view);
            this.f24439e = view;
            AnimatorSet animatorSet = this.f24440f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f24440f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24440f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f24438c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f24440f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f24440f.setDuration(350L);
                    this.f24440f.setInterpolator(is.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f24440f.setDuration(300L);
                }
                this.f24440f.addListener(new y40(this, 1));
                this.f24440f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a50.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f24444w;
    }

    public org.telegram.ui.Cells.u1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f24446y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f24445x = f7;
        setTranslationY(f7 + this.f24444w);
    }

    public void setOverrideText(String str) {
        this.f24443s = str;
        this.f24436a.setText(str);
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null) {
            this.d = null;
            e(u1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j3) {
        this.E = j3;
    }

    public void setText(CharSequence charSequence) {
        this.f24436a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public a50(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        this(2, activity, d6Var, false);
    }

    public a50(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = d6Var;
        this.f24441n = i10;
        this.f24442r = z10;
        ai.q4 q4Var = new ai.q4(context, 22);
        this.f24436a = q4Var;
        int i11 = org.telegram.ui.ActionBar.h6.f21015pf;
        q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        q4Var.setTextSize(1, 14.0f);
        q4Var.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            q4Var.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            q4Var.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            q4Var.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            q4Var.setGravity(19);
            q4Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21034qf, d6Var)));
            q4Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(q4Var, w7.x5.a(30.0f, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f, -2, 51));
        } else {
            q4Var.setGravity(51);
            q4Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21034qf, d6Var)));
            q4Var.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(q4Var, w7.x5.a(-2.0f, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f, -2, 51));
        }
        if (i10 == 0) {
            q4Var.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f24437b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f24437b.setScaleType(ImageView.ScaleType.CENTER);
            this.f24437b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f24437b, w7.x5.a(34.0f, 7.0f, 7.0f, 0.0f, 0.0f, 38, 51));
        }
        ImageView imageView2 = new ImageView(context);
        this.f24438c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21034qf, d6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.x5.a(6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 14, (z10 ? 48 : 80) | 3));
    }

    public void setVisibleListener(z40 z40Var) {
    }
}
