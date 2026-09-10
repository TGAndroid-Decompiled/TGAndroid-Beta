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
public class s40 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.f6 F;
    public boolean G;
    public boolean H;
    public final di.h f26935a;
    public ImageView f26936b;
    public final ImageView f26937c;
    public org.telegram.ui.Cells.t1 d;
    public View e;
    public AnimatorSet f26938f;
    public Runnable h;
    public final int f26939n;
    public final boolean f26940r;
    public String f26941s;
    public int v;
    public float f26942w;
    public float f26943x;
    public int f26944y;

    public s40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f26935a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f26936b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f26936b.setScaleType(ImageView.ScaleType.CENTER);
        this.f26936b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18152pf, this.F), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f26936b;
        boolean z10 = this.f26940r;
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
        addView(imageView2, w7.a6.d(34, 34.0f, 21, 0.0f, f7, 0.0f, f10));
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
        AnimatorSet animatorSet = this.f26938f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26938f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26938f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f26938f.setDuration(150L);
                this.f26938f.setInterpolator(wr.f28819f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f26938f.setDuration(300L);
            }
            this.f26938f.addListener(new q40(this, 2));
            this.f26938f.start();
            return;
        }
        setVisibility(4);
        this.e = null;
        this.d = null;
        this.f26938f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        di.h hVar = this.f26935a;
        hVar.setTextColor(-1);
        this.f26937c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f26939n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        hVar.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.t1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s40.e(org.telegram.ui.Cells.t1, java.lang.Integer, int, int, boolean):boolean");
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
            AnimatorSet animatorSet = this.f26938f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f26938f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26938f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f26937c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f26938f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f26938f.setDuration(350L);
                    this.f26938f.setInterpolator(wr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f26938f.setDuration(300L);
                }
                this.f26938f.addListener(new q40(this, 1));
                this.f26938f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f26942w;
    }

    public org.telegram.ui.Cells.t1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f26944y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f26943x = f7;
        setTranslationY(f7 + this.f26942w);
    }

    public void setOverrideText(String str) {
        this.f26941s = str;
        this.f26935a.setText(str);
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
        this.f26935a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public s40(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        this(2, activity, f6Var, false);
    }

    public s40(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = f6Var;
        this.f26939n = i10;
        this.f26940r = z10;
        di.h hVar = new di.h(context, 21);
        this.f26935a = hVar;
        int i11 = org.telegram.ui.ActionBar.j6.f18152pf;
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        hVar.setTextSize(1, 14.0f);
        hVar.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            hVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            hVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            hVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            hVar.setGravity(19);
            hVar.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18170qf, f6Var)));
            hVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(hVar, w7.a6.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            hVar.setGravity(51);
            hVar.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18170qf, f6Var)));
            hVar.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(hVar, w7.a6.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            hVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f26936b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f26936b.setScaleType(ImageView.ScaleType.CENTER);
            this.f26936b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f26936b, w7.a6.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f26937c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18170qf, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.a6.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(r40 r40Var) {
    }
}
