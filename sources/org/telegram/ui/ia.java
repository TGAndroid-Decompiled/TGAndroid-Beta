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
    public final org.telegram.ui.Components.v5 D;
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.v5 I;
    public boolean f46587a;
    public final org.telegram.ui.ActionBar.h6 f46588b;
    public final org.telegram.ui.ActionBar.m5 f46589c;
    public final ImageView d;
    public final org.telegram.ui.Components.cp f46590e;
    public final org.telegram.ui.Components.i6 f46591f;
    public final Drawable[] h;
    public float f46592n;
    public boolean f46593r;
    public ValueAnimator f46594s;
    public TLRPC.TL_username f46595w;
    public boolean f46596x;
    public long f46597y;

    public ia(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f46587a = false;
        this.D = new org.telegram.ui.Components.v5(this, 300L, org.telegram.ui.Components.wq.f40046f);
        this.I = new org.telegram.ui.Components.v5(this, 400L, org.telegram.ui.Components.wq.h);
        this.f46588b = h6Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, this, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
        this.f46589c = m5Var;
        m5Var.setTextSize(16);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        m5Var.setEllipsizeByGradient(true);
        addView(m5Var, c8.ha.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(1.35f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var));
        this.f46590e = cpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(cpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        cpVar.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        addView(imageView, c8.ha.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(getContext(), false, true, true);
        this.f46591f = i6Var;
        i6Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var));
        i6Var.b(0.4f, 120L, org.telegram.ui.Components.wq.f40047g);
        i6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        addView(i6Var, c8.ha.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(2131232205).mutate(), context.getDrawable(2131232206).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        la.H.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var));
        la.I.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.V8, h6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z9, boolean z10, long j3) {
        boolean z11;
        int i7;
        boolean z12;
        int i10;
        this.f46595w = tL_username;
        this.f46596x = z9;
        this.f46597y = j3;
        invalidate();
        if (this.f46595w == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        if (j3 == 0 && tL_username.editable) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.H = z11;
        b(tL_username.username);
        boolean z13 = this.f46587a;
        org.telegram.ui.Components.i6 i6Var = this.f46591f;
        if (z13) {
            if (this.H) {
                i10 = 2131743646;
            } else if (this.G) {
                i10 = 2131743647;
            } else {
                i10 = 2131743645;
            }
            i6Var.c(org.telegram.messenger.id.M0(i10, null), z10, !this.G);
        } else {
            if (this.H) {
                i7 = 2131743650;
            } else if (this.G) {
                i7 = 2131743651;
            } else {
                i7 = 2131743649;
            }
            i6Var.c(org.telegram.messenger.id.M0(i7, null), z10, !this.G);
        }
        if (!this.G && !this.H) {
            z12 = false;
        } else {
            z12 = true;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.E;
            if (z12) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new ha(this, 1));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.wq.f40047g);
            this.F.start();
            return;
        }
        if (z12) {
            f10 = 1.0f;
        }
        this.E = f10;
        int i11 = org.telegram.ui.ActionBar.m6.f28300z6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f46588b;
        int f12 = i0.a.f(this.E, org.telegram.ui.ActionBar.m6.w0(i11, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var));
        this.f46590e.b(f12);
        i6Var.setTextColor(f12);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28072n6));
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.m5 m5Var = this.f46589c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.id.M0(2131743648, null));
            spannableString.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.H6, this.f46588b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            m5Var.l(spannableStringBuilder, false);
            return;
        }
        m5Var.l("@" + str, false);
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
        if (this.G) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.I.e(false, f10);
        int i7 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        Drawable[] drawableArr = this.h;
        if (i7 < 0) {
            f12 = 0.0f;
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f), la.I);
            drawableArr[1].setAlpha((int) ((1.0f - e10) * 255.0f));
            f11 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f11 = 255.0f;
            f12 = 0.0f;
        }
        if (e10 > f12) {
            Paint paint = la.H;
            int i10 = (int) (e10 * f11);
            paint.setAlpha(i10);
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f) * e10, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f46596x) {
            f13 = 1.0f;
        } else {
            f13 = f12;
        }
        float e11 = this.D.e(false, f13);
        if (e11 > f12) {
            int alpha = org.telegram.ui.ActionBar.m6.f28013k0.getAlpha();
            org.telegram.ui.ActionBar.m6.f28013k0.setAlpha((int) (alpha * e11));
            canvas.drawRect(org.telegram.messenger.g0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.m6.f28013k0);
            org.telegram.ui.ActionBar.m6.f28013k0.setAlpha(alpha);
        }
        Paint paint2 = la.J;
        paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ii, false));
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

    public void setLoading(boolean z9) {
        float f10;
        if (this.f46593r != z9) {
            this.f46593r = z9;
            ValueAnimator valueAnimator = this.f46594s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f11 = this.f46592n;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f46594s = ofFloat;
            ofFloat.addUpdateListener(new ha(this, 0));
            this.f46594s.addListener(new ch.y(26, this, z9));
            this.f46594s.setInterpolator(org.telegram.ui.Components.wq.f40047g);
            this.f46594s.setDuration(200L);
            this.f46594s.start();
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.cp cpVar;
        org.telegram.ui.Components.i6 i6Var;
        org.telegram.ui.ActionBar.h6 h6Var = this.f46588b;
        try {
            la.H.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var));
            la.I.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.V8, h6Var));
            ValueAnimator valueAnimator = this.F;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (cpVar = this.f46590e) != null && (i6Var = this.f46591f) != null) {
                int f10 = i0.a.f(this.E, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var));
                cpVar.b(f10);
                i6Var.setTextColor(f10);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
