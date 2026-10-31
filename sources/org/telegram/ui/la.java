package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class la extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.t5 D;
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.t5 I;
    public boolean f39125a;
    public final org.telegram.ui.ActionBar.p6 f39126b;
    public final org.telegram.ui.ActionBar.u5 f39127c;
    public final ImageView d;
    public final org.telegram.ui.Components.kp e;
    public final org.telegram.ui.Components.f6 f39128f;
    public final Drawable[] h;
    public float f39129n;
    public boolean f39130r;
    public ValueAnimator f39131s;
    public TLRPC.TL_username f39132w;
    public boolean f39133x;
    public long f39134y;

    public la(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f39125a = false;
        this.D = new org.telegram.ui.Components.t5(this, 300L, org.telegram.ui.Components.gr.f26495f);
        this.I = new org.telegram.ui.Components.t5(this, 400L, org.telegram.ui.Components.gr.h);
        this.f39126b = p6Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.f39127c = u5Var;
        u5Var.setTextSize(16);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setEllipsizeByGradient(true);
        addView(u5Var, w7.b6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(1.35f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, p6Var));
        this.e = kpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(kpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        kpVar.setBounds(0, 0, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
        addView(imageView, w7.b6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), false, true, true);
        this.f39128f = f6Var;
        f6Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21330z6, p6Var));
        f6Var.b(0.4f, 120L, org.telegram.ui.Components.gr.f26496g);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        addView(f6Var, w7.b6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(2131232204).mutate(), context.getDrawable(2131232205).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        oa.H.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
        oa.I.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.V8, p6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.f39132w = tL_username;
        this.f39133x = z10;
        this.f39134y = j10;
        invalidate();
        if (this.f39132w == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        if (j10 == 0 && tL_username.editable) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.H = z12;
        b(tL_username.username);
        boolean z14 = this.f39125a;
        org.telegram.ui.Components.f6 f6Var = this.f39128f;
        if (z14) {
            if (this.H) {
                i11 = 2131743672;
            } else if (this.G) {
                i11 = 2131743673;
            } else {
                i11 = 2131743671;
            }
            f6Var.c(org.telegram.messenger.cd.L0(i11, null), z11, !this.G);
        } else {
            if (this.H) {
                i10 = 2131743676;
            } else if (this.G) {
                i10 = 2131743677;
            } else {
                i10 = 2131743675;
            }
            f6Var.c(org.telegram.messenger.cd.L0(i10, null), z11, !this.G);
        }
        if (!this.G && !this.H) {
            z13 = false;
        } else {
            z13 = true;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.E;
            if (z13) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new ka(this, 1));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.gr.f26496g);
            this.F.start();
            return;
        }
        if (z13) {
            f7 = 1.0f;
        }
        this.E = f7;
        int i12 = org.telegram.ui.ActionBar.t6.f21330z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f39126b;
        int f11 = i0.b.f(this.E, org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, p6Var));
        this.e.b(f11);
        f6Var.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21115n6));
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.u5 u5Var = this.f39127c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.cd.L0(2131743674, null));
            spannableString.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.H6, this.f39126b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            u5Var.l(spannableStringBuilder, false);
            return;
        }
        u5Var.l("@" + str, false);
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (this.G) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = this.I.e(false, f7);
        int i10 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        Drawable[] drawableArr = this.h;
        if (i10 < 0) {
            f11 = 0.0f;
            canvas.drawCircle(org.telegram.messenger.i0.L(35.0f), org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(16.0f), oa.I);
            drawableArr[1].setAlpha((int) ((1.0f - e) * 255.0f));
            f10 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.i0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.i0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.i0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.i0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e > f11) {
            Paint paint = oa.H;
            int i11 = (int) (e * f10);
            paint.setAlpha(i11);
            canvas.drawCircle(org.telegram.messenger.i0.L(35.0f), org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(16.0f) * e, paint);
            drawableArr[0].setAlpha(i11);
            drawableArr[0].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.i0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.i0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.i0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.i0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f39133x) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        float e7 = this.D.e(false, f12);
        if (e7 > f11) {
            int alpha = org.telegram.ui.ActionBar.t6.f21052k0.getAlpha();
            org.telegram.ui.ActionBar.t6.f21052k0.setAlpha((int) (alpha * e7));
            canvas.drawRect(org.telegram.messenger.i0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.t6.f21052k0);
            org.telegram.ui.ActionBar.t6.f21052k0.setAlpha(alpha);
        }
        Paint paint2 = oa.J;
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ii, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getWidth() - org.telegram.messenger.i0.L(37.0f), org.telegram.messenger.i0.L(25.0f), getWidth() - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(27.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(0.3f), org.telegram.messenger.i0.L(0.3f), paint2);
        rectF.set(getWidth() - org.telegram.messenger.i0.L(37.0f), org.telegram.messenger.i0.L(31.0f), getWidth() - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(33.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(0.3f), org.telegram.messenger.i0.L(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), 1073741824));
    }

    public void setLoading(boolean z10) {
        float f7;
        if (this.f39130r != z10) {
            this.f39130r = z10;
            ValueAnimator valueAnimator = this.f39131s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f39129n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39131s = ofFloat;
            ofFloat.addUpdateListener(new ka(this, 0));
            this.f39131s.addListener(new eg.m(12, this, z10));
            this.f39131s.setInterpolator(org.telegram.ui.Components.gr.f26496g);
            this.f39131s.setDuration(200L);
            this.f39131s.start();
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.kp kpVar;
        org.telegram.ui.Components.f6 f6Var;
        org.telegram.ui.ActionBar.p6 p6Var = this.f39126b;
        try {
            oa.H.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
            oa.I.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.V8, p6Var));
            ValueAnimator valueAnimator = this.F;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (kpVar = this.e) != null && (f6Var = this.f39128f) != null) {
                int f7 = i0.b.f(this.E, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21330z6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, p6Var));
                kpVar.b(f7);
                f6Var.setTextColor(f7);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
