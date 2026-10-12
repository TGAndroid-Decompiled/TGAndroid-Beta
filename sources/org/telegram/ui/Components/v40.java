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
public class v40 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.c6 F;
    public boolean G;
    public boolean H;
    public final bi.f4 f29877a;
    public ImageView f29878b;
    public final ImageView f29879c;
    public org.telegram.ui.Cells.u1 d;
    public View e;
    public AnimatorSet f29880f;
    public Runnable h;
    public final int f29881n;
    public final boolean f29882r;
    public String f29883s;
    public int v;
    public float f29884w;
    public float f29885x;
    public int f29886y;

    public v40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f29877a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f29878b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f29878b.setScaleType(ImageView.ScaleType.CENTER);
        this.f29878b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20128pf, this.F), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f29878b;
        boolean z10 = this.f29882r;
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
        addView(imageView2, w7.a6.a(34.0f, 0.0f, f7, 0.0f, f10, 34, 21));
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
        AnimatorSet animatorSet = this.f29880f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f29880f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29880f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f29880f.setDuration(150L);
                this.f29880f.setInterpolator(es.f24771f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f29880f.setDuration(300L);
            }
            this.f29880f.addListener(new t40(this, 2));
            this.f29880f.start();
            return;
        }
        setVisibility(4);
        this.e = null;
        this.d = null;
        this.f29880f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        bi.f4 f4Var = this.f29877a;
        f4Var.setTextColor(-1);
        this.f29879c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f29881n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        f4Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.u1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v40.e(org.telegram.ui.Cells.u1, java.lang.Integer, int, int, boolean):boolean");
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
            AnimatorSet animatorSet = this.f29880f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29880f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f29880f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f29879c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f29880f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f29880f.setDuration(350L);
                    this.f29880f.setInterpolator(es.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f29880f.setDuration(300L);
                }
                this.f29880f.addListener(new t40(this, 1));
                this.f29880f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f29884w;
    }

    public org.telegram.ui.Cells.u1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f29886y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f29885x = f7;
        setTranslationY(f7 + this.f29884w);
    }

    public void setOverrideText(String str) {
        this.f29883s = str;
        this.f29877a.setText(str);
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null) {
            this.d = null;
            e(u1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.E = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f29877a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public v40(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        this(2, activity, c6Var, false);
    }

    public v40(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = c6Var;
        this.f29881n = i10;
        this.f29882r = z10;
        bi.f4 f4Var = new bi.f4(context, 22);
        this.f29877a = f4Var;
        int i11 = org.telegram.ui.ActionBar.g6.f20128pf;
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        f4Var.setTextSize(1, 14.0f);
        f4Var.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            f4Var.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            f4Var.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            f4Var.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            f4Var.setGravity(19);
            f4Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20147qf, c6Var)));
            f4Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(f4Var, w7.a6.a(30.0f, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f, -2, 51));
        } else {
            f4Var.setGravity(51);
            f4Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20147qf, c6Var)));
            f4Var.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(f4Var, w7.a6.a(-2.0f, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f, -2, 51));
        }
        if (i10 == 0) {
            f4Var.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f29878b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f29878b.setScaleType(ImageView.ScaleType.CENTER);
            this.f29878b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f29878b, w7.a6.a(34.0f, 7.0f, 7.0f, 0.0f, 0.0f, 38, 51));
        }
        ImageView imageView2 = new ImageView(context);
        this.f29879c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20147qf, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.a6.a(6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 14, (z10 ? 48 : 80) | 3));
    }

    public void setVisibleListener(u40 u40Var) {
    }
}
