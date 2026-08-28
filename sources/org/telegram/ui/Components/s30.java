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
public class s30 extends FrameLayout {
    public long A;
    public final org.telegram.ui.ActionBar.b6 B;
    public boolean C;
    public boolean D;
    public final bg.t f32342a;
    public ImageView f32343b;
    public final ImageView f32344c;
    public org.telegram.ui.Cells.t1 d;
    public View f32345e;
    public AnimatorSet f32346f;
    public Runnable h;
    public final int f32347n;
    public final boolean f32348r;
    public String f32349s;
    public int v;
    public float f32350w;
    public float f32351x;
    public int f32352y;

    public s30(Context context, int i9) {
        this(i9, context, null, false);
    }

    public final void a() {
        float f10;
        float f11;
        this.f32342a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.D = true;
        ImageView imageView = new ImageView(getContext());
        this.f32343b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f32343b.setScaleType(ImageView.ScaleType.CENTER);
        this.f32343b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23219pf, this.B), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f32343b;
        boolean z10 = this.f32348r;
        if (z10) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView2, g7.e6.d(34, 34.0f, 21, 0.0f, f10, 0.0f, f11));
        setOnClickListener(new f0(this, 26));
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
        AnimatorSet animatorSet = this.f32346f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32346f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32346f = animatorSet2;
            boolean z11 = this.C;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f32346f.setDuration(150L);
                this.f32346f.setInterpolator(gr.f28844f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f32346f.setDuration(300L);
            }
            this.f32346f.addListener(new q30(this, 2));
            this.f32346f.start();
            return;
        }
        setVisibility(4);
        this.f32345e = null;
        this.d = null;
        this.f32346f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f10;
        bg.t tVar = this.f32342a;
        tVar.setTextColor(-1);
        this.f32344c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i9 = this.f32347n;
        if (i9 != 7 && i9 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(f10), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.t1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s30.e(org.telegram.ui.Cells.t1, java.lang.Integer, int, int, boolean):boolean");
    }

    public final void f(View view, boolean z10) {
        if (this.f32345e != view && getTag() == null) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            g(view);
            this.f32345e = view;
            AnimatorSet animatorSet = this.f32346f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f32346f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32346f = animatorSet2;
                boolean z11 = this.C;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f32344c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f32346f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f32346f.setDuration(350L);
                    this.f32346f.setInterpolator(gr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f32346f.setDuration(300L);
                }
                this.f32346f.addListener(new q30(this, 1));
                this.f32346f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s30.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f32350w;
    }

    public org.telegram.ui.Cells.t1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    public void setBottomOffset(int i9) {
        this.f32352y = i9;
    }

    public void setExtraTranslationY(float f10) {
        this.f32351x = f10;
        setTranslationY(f10 + this.f32350w);
    }

    public void setOverrideText(String str) {
        this.f32349s = str;
        this.f32342a.setText(str);
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null) {
            this.d = null;
            e(t1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.A = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f32342a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.C = z10;
    }

    public s30(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        this(2, activity, b6Var, false);
    }

    public s30(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.A = 2000L;
        this.B = b6Var;
        this.f32347n = i9;
        this.f32348r = z10;
        bg.t tVar = new bg.t(context, 23);
        this.f32342a = tVar;
        int i10 = org.telegram.ui.ActionBar.f6.f23219pf;
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        tVar.setTextSize(1, 14.0f);
        tVar.setMaxLines(2);
        if (i9 == 7 || i9 == 8 || i9 == 9) {
            tVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i9 == 4) {
            tVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            tVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i9 == 3) {
            tVar.setGravity(19);
            tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23238qf, b6Var)));
            tVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(tVar, g7.e6.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            tVar.setGravity(51);
            tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23238qf, b6Var)));
            tVar.setPadding(AndroidUtilities.dp(i9 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(tVar, g7.e6.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i9 == 0) {
            tVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f32343b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f32343b.setScaleType(ImageView.ScaleType.CENTER);
            this.f32343b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f32343b, g7.e6.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f32344c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23238qf, b6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, g7.e6.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(r30 r30Var) {
    }
}
