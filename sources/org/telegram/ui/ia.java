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
public abstract class ia extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.c6 E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.c6 J;
    public boolean f48665a;
    public final org.telegram.ui.ActionBar.i6 f48666b;
    public final org.telegram.ui.ActionBar.n5 f48667c;
    public final ImageView d;
    public final org.telegram.ui.Components.sp f48668e;
    public final org.telegram.ui.Components.n6 f48669f;
    public final Drawable[] h;
    public float f48670n;
    public boolean f48671r;
    public ValueAnimator f48672s;
    public TLRPC.TL_username f48673w;
    public boolean f48674x;
    public long f48675y;

    public ia(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f48665a = false;
        this.E = new org.telegram.ui.Components.c6(this, 300L, org.telegram.ui.Components.lr.f37208f);
        this.J = new org.telegram.ui.Components.c6(this, 400L, org.telegram.ui.Components.lr.h);
        this.f48666b = i6Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, this, i6Var);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.f48667c = n5Var;
        n5Var.setTextSize(16);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n5Var.setEllipsizeByGradient(true);
        addView(n5Var, c8.ma.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(1.35f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29576n6, i6Var));
        this.f48668e = spVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(spVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        spVar.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        addView(imageView, c8.ma.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getContext(), false, true, true);
        this.f48669f = n6Var;
        n6Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29805z6, i6Var));
        n6Var.b(0.4f, 120L, org.telegram.ui.Components.lr.f37209g);
        n6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        addView(n6Var, c8.ma.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(2131232207).mutate(), context.getDrawable(2131232208).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        la.I.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        la.J.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.V8, i6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j3) {
        boolean z12;
        int i7;
        boolean z13;
        int i10;
        this.f48673w = tL_username;
        this.f48674x = z10;
        this.f48675y = j3;
        invalidate();
        if (this.f48673w == null) {
            this.H = false;
            this.I = false;
            return;
        }
        this.H = tL_username.active;
        if (j3 == 0 && tL_username.editable) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.I = z12;
        b(tL_username.username);
        boolean z14 = this.f48665a;
        org.telegram.ui.Components.n6 n6Var = this.f48669f;
        if (z14) {
            if (this.I) {
                i10 = 2131743409;
            } else if (this.H) {
                i10 = 2131743410;
            } else {
                i10 = 2131743408;
            }
            n6Var.c(org.telegram.messenger.gd.M0(i10, null), z11, !this.H);
        } else {
            if (this.I) {
                i7 = 2131743413;
            } else if (this.H) {
                i7 = 2131743414;
            } else {
                i7 = 2131743412;
            }
            n6Var.c(org.telegram.messenger.gd.M0(i7, null), z11, !this.H);
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
            ofFloat.addUpdateListener(new ha(this, 1));
            this.G.setDuration(120L);
            this.G.setInterpolator(org.telegram.ui.Components.lr.f37209g);
            this.G.start();
            return;
        }
        if (z13) {
            f10 = 1.0f;
        }
        this.F = f10;
        int i11 = org.telegram.ui.ActionBar.n6.f29805z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f48666b;
        int f12 = i0.a.f(this.F, org.telegram.ui.ActionBar.n6.w0(i11, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29576n6, i6Var));
        this.f48668e.b(f12);
        n6Var.setTextColor(f12);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29576n6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.n5 n5Var = this.f48667c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.gd.M0(2131743411, null));
            spannableString.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.H6, this.f48666b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            n5Var.l(spannableStringBuilder, false);
            return;
        }
        n5Var.l("@" + str, false);
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
        int i7 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        Drawable[] drawableArr = this.h;
        if (i7 < 0) {
            f12 = 0.0f;
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f), la.J);
            drawableArr[1].setAlpha((int) ((1.0f - e10) * 255.0f));
            f11 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.c0.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.c0.A(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.c0.y(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.c0.j(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f11 = 255.0f;
            f12 = 0.0f;
        }
        if (e10 > f12) {
            Paint paint = la.I;
            int i10 = (int) (e10 * f11);
            paint.setAlpha(i10);
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f) * e10, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.ui.Cells.c0.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.c0.A(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.c0.y(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.c0.j(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f48674x) {
            f13 = 1.0f;
        } else {
            f13 = f12;
        }
        float e11 = this.E.e(false, f13);
        if (e11 > f12) {
            int alpha = org.telegram.ui.ActionBar.n6.f29517k0.getAlpha();
            org.telegram.ui.ActionBar.n6.f29517k0.setAlpha((int) (alpha * e11));
            canvas.drawRect(org.telegram.messenger.g0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.n6.f29517k0);
            org.telegram.ui.ActionBar.n6.f29517k0.setAlpha(alpha);
        }
        Paint paint2 = la.K;
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Li, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(25.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(27.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(31.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(33.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setLoading(boolean z10) {
        float f10;
        if (this.f48671r != z10) {
            this.f48671r = z10;
            ValueAnimator valueAnimator = this.f48672s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f11 = this.f48670n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f48672s = ofFloat;
            ofFloat.addUpdateListener(new ha(this, 0));
            this.f48672s.addListener(new bi.d7(27, this, z10));
            this.f48672s.setInterpolator(org.telegram.ui.Components.lr.f37209g);
            this.f48672s.setDuration(200L);
            this.f48672s.start();
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.sp spVar;
        org.telegram.ui.Components.n6 n6Var;
        org.telegram.ui.ActionBar.i6 i6Var = this.f48666b;
        try {
            la.I.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
            la.J.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.V8, i6Var));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (spVar = this.f48668e) != null && (n6Var = this.f48669f) != null) {
                int f10 = i0.a.f(this.F, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29805z6, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29576n6, i6Var));
                spVar.b(f10);
                n6Var.setTextColor(f10);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
