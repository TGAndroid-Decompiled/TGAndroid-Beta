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
public abstract class ha extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.u5 J;
    public boolean f45869a;
    public final org.telegram.ui.ActionBar.e6 f45870b;
    public final org.telegram.ui.ActionBar.k5 f45871c;
    public final ImageView d;
    public final org.telegram.ui.Components.cp f45872e;
    public final org.telegram.ui.Components.h6 f45873f;
    public final Drawable[] h;
    public float f45874n;
    public boolean f45875r;
    public ValueAnimator f45876s;
    public TLRPC.TL_username f45877w;
    public boolean f45878x;
    public long f45879y;

    public ha(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f45869a = false;
        this.E = new org.telegram.ui.Components.u5(this, 300L, org.telegram.ui.Components.xq.f40452f);
        this.J = new org.telegram.ui.Components.u5(this, 400L, org.telegram.ui.Components.xq.h);
        this.f45870b = e6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this, e6Var);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.f45871c = k5Var;
        k5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, b8.mf.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(1.35f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var));
        this.f45872e = cpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(cpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        cpVar.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        addView(imageView, b8.mf.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), false, true, true);
        this.f45873f = h6Var;
        h6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var));
        h6Var.b(0.4f, 120L, org.telegram.ui.Components.xq.f40453g);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        addView(h6Var, b8.mf.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(2131232205).mutate(), context.getDrawable(2131232206).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ka.I.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        ka.J.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V8, e6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        boolean z12;
        int i3;
        boolean z13;
        int i10;
        this.f45877w = tL_username;
        this.f45878x = z10;
        this.f45879y = j10;
        invalidate();
        if (this.f45877w == null) {
            this.H = false;
            this.I = false;
            return;
        }
        this.H = tL_username.active;
        if (j10 == 0 && tL_username.editable) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.I = z12;
        b(tL_username.username);
        boolean z14 = this.f45869a;
        org.telegram.ui.Components.h6 h6Var = this.f45873f;
        if (z14) {
            if (this.I) {
                i10 = 2131743656;
            } else if (this.H) {
                i10 = 2131743657;
            } else {
                i10 = 2131743655;
            }
            h6Var.c(org.telegram.messenger.bd.M0(i10, null), z11, !this.H);
        } else {
            if (this.I) {
                i3 = 2131743660;
            } else if (this.H) {
                i3 = 2131743661;
            } else {
                i3 = 2131743659;
            }
            h6Var.c(org.telegram.messenger.bd.M0(i3, null), z11, !this.H);
        }
        if (!this.H && !this.I) {
            z13 = false;
        } else {
            z13 = true;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.F;
            if (z13) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new ga(this, 1));
            this.G.setDuration(120L);
            this.G.setInterpolator(org.telegram.ui.Components.xq.f40453g);
            this.G.start();
            return;
        }
        if (z13) {
            f10 = 1.0f;
        }
        this.F = f10;
        int i11 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f45870b;
        int f12 = i0.a.f(this.F, org.telegram.ui.ActionBar.k6.w0(i11, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var));
        this.f45872e.b(f12);
        h6Var.setTextColor(f12);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28062n6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.k5 k5Var = this.f45871c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.bd.M0(2131743658, null));
            spannableString.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.H6, this.f45870b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            k5Var.l(spannableStringBuilder, false);
            return;
        }
        k5Var.l("@" + str, false);
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        super.onDraw(canvas);
        if (this.H) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.J.e(false, f10);
        int i3 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        Drawable[] drawableArr = this.h;
        if (i3 < 0) {
            f12 = 0.0f;
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f), ka.J);
            drawableArr[1].setAlpha((int) ((1.0f - e10) * 255.0f));
            f11 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.f1.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.B(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.i(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f11 = 255.0f;
            f12 = 0.0f;
        }
        if (e10 > f12) {
            Paint paint = ka.I;
            int i10 = (int) (e10 * f11);
            paint.setAlpha(i10);
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f) * e10, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.ui.Cells.f1.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.B(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.i(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f45878x) {
            f13 = 1.0f;
        } else {
            f13 = f12;
        }
        float e11 = this.E.e(false, f13);
        if (e11 > f12) {
            int alpha = org.telegram.ui.ActionBar.k6.f28002k0.getAlpha();
            org.telegram.ui.ActionBar.k6.f28002k0.setAlpha((int) (alpha * e11));
            canvas.drawRect(org.telegram.messenger.g0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
            org.telegram.ui.ActionBar.k6.f28002k0.setAlpha(alpha);
        }
        Paint paint2 = ka.K;
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ii, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(25.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(27.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(31.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(33.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setLoading(boolean z10) {
        float f10;
        if (this.f45875r != z10) {
            this.f45875r = z10;
            ValueAnimator valueAnimator = this.f45876s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f11 = this.f45874n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f45876s = ofFloat;
            ofFloat.addUpdateListener(new ga(this, 0));
            this.f45876s.addListener(new dh.x(26, this, z10));
            this.f45876s.setInterpolator(org.telegram.ui.Components.xq.f40453g);
            this.f45876s.setDuration(200L);
            this.f45876s.start();
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.cp cpVar;
        org.telegram.ui.Components.h6 h6Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.f45870b;
        try {
            ka.I.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
            ka.J.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V8, e6Var));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (cpVar = this.f45872e) != null && (h6Var = this.f45873f) != null) {
                int f10 = i0.a.f(this.F, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var));
                cpVar.b(f10);
                h6Var.setTextColor(f10);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
