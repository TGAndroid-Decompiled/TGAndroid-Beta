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
public class j40 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.d6 F;
    public boolean G;
    public boolean H;
    public final ai.p4 f25267a;
    public ImageView f25268b;
    public final ImageView f25269c;
    public org.telegram.ui.Cells.u1 d;
    public View e;
    public AnimatorSet f25270f;
    public Runnable h;
    public final int f25271n;
    public final boolean f25272r;
    public String f25273s;
    public int v;
    public float f25274w;
    public float f25275x;
    public int f25276y;

    public j40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f25267a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f25268b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f25268b.setScaleType(ImageView.ScaleType.CENTER);
        this.f25268b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19288pf, this.F), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f25268b;
        boolean z10 = this.f25272r;
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
        addView(imageView2, w7.y5.d(34, 34.0f, 21, 0.0f, f7, 0.0f, f10));
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
        AnimatorSet animatorSet = this.f25270f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f25270f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25270f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f25270f.setDuration(150L);
                this.f25270f.setInterpolator(rr.f28031f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f25270f.setDuration(300L);
            }
            this.f25270f.addListener(new h40(this, 2));
            this.f25270f.start();
            return;
        }
        setVisibility(4);
        this.e = null;
        this.d = null;
        this.f25270f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        ai.p4 p4Var = this.f25267a;
        p4Var.setTextColor(-1);
        this.f25269c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f25271n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        p4Var.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.u1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j40.e(org.telegram.ui.Cells.u1, java.lang.Integer, int, int, boolean):boolean");
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
            AnimatorSet animatorSet = this.f25270f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f25270f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f25270f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f25269c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f25270f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f25270f.setDuration(350L);
                    this.f25270f.setInterpolator(rr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f25270f.setDuration(300L);
                }
                this.f25270f.addListener(new h40(this, 1));
                this.f25270f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j40.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f25274w;
    }

    public org.telegram.ui.Cells.u1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f25276y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f25275x = f7;
        setTranslationY(f7 + this.f25274w);
    }

    public void setOverrideText(String str) {
        this.f25273s = str;
        this.f25267a.setText(str);
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
        this.f25267a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public j40(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        this(2, activity, d6Var, false);
    }

    public j40(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = d6Var;
        this.f25271n = i10;
        this.f25272r = z10;
        ai.p4 p4Var = new ai.p4(context, 22);
        this.f25267a = p4Var;
        int i11 = org.telegram.ui.ActionBar.h6.f19288pf;
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        p4Var.setTextSize(1, 14.0f);
        p4Var.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            p4Var.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            p4Var.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            p4Var.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            p4Var.setGravity(19);
            p4Var.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19307qf, d6Var)));
            p4Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(p4Var, w7.y5.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            p4Var.setGravity(51);
            p4Var.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19307qf, d6Var)));
            p4Var.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(p4Var, w7.y5.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            p4Var.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f25268b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f25268b.setScaleType(ImageView.ScaleType.CENTER);
            this.f25268b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f25268b, w7.y5.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f25269c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19307qf, d6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.y5.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(i40 i40Var) {
    }
}
