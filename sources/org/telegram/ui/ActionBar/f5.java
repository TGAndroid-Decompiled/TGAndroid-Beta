package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.nc;
import vh.k9;
import vh.l9;
public final class f5 extends View implements fe.e {
    public final int f20323a = 1;
    public Object f20324b;
    public Object f20325c;
    public final Object d;
    public Object e;
    public Object f20326f;
    public final Object h;

    public f5(Context context, p6 p6Var) {
        super(context);
        this.h = p6Var;
        this.f20324b = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f20325c = new Matrix();
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f20326f = new qz0(cd.L0(2131745054, null), 14.16f, org.telegram.messenger.i0.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = org.telegram.messenger.i0.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f11));
        canvas.save();
        canvas.rotate(f12, f7, f10);
        float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, f11);
        canvas.scale(T1, T1, f7, f10);
        canvas.translate(f7 - (intrinsicWidth / 2.0f), f10 - (intrinsicHeight / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public void E(float f7, int i10) {
        if (i10 == 1 && f7 == 1.0f) {
            this.f20325c = null;
        }
    }

    public void b(boolean z10, boolean z11) {
        float f7;
        fe.b bVar = (fe.b) this.e;
        Drawable drawable = (Drawable) this.f20324b;
        if (drawable == null) {
            if (z10) {
                bVar.a(true, false);
            }
        } else if (drawable instanceof c2) {
            c2 c2Var = (c2) drawable;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            c2Var.c(z11, f7);
        } else {
            bVar.a(z10, z11);
        }
    }

    public void c(Drawable drawable) {
        fe.f fVar = (fe.f) this.f20326f;
        fVar.b();
        fVar.c(1.0f);
        this.f20325c = null;
        Drawable drawable2 = (Drawable) this.f20324b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f20324b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((i5) this.h).G) {
                ((fe.b) this.e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public void d() {
        i5 i5Var = (i5) this.h;
        setBackground(t6.h0(i5Var.f20416h0, 1, -1));
        Drawable drawable = (Drawable) this.f20324b;
        if (drawable instanceof c2) {
            ((c2) drawable).a(i5Var.f20414f0);
            ((c2) ((Drawable) this.f20324b)).b(i5Var.f20415g0);
        } else if (drawable instanceof a5) {
            ((a5) drawable).f20151j = i5Var.f20414f0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i5Var.f20414f0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.d).setColorFilter(new PorterDuffColorFilter(i5Var.f20415g0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float[] fArr;
        switch (this.f20323a) {
            case 1:
                Matrix matrix = (Matrix) this.f20325c;
                matrix.reset();
                matrix.postTranslate(org.telegram.messenger.i0.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - org.telegram.messenger.i0.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.f20324b;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.d;
                paint.setShader(linearGradient);
                qz0 qz0Var = (qz0) this.f20326f;
                float L = qz0Var.f29774c + org.telegram.messenger.i0.L(30.0f);
                Paint paint2 = (Paint) this.e;
                paint2.setColor(t6.w0(t6.f20930d7, (p6) this.h));
                canvas.drawRect(org.telegram.messenger.i0.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - org.telegram.messenger.i0.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(org.telegram.messenger.i0.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - org.telegram.messenger.i0.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((qz0) this.f20326f).c((getWidth() - qz0Var.f29774c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) this.d;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    try {
                        fArr = (float[]) this.e;
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    if (i11 < fArr.length) {
                        fArr[i11] = 0.0f;
                        i11++;
                    } else {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            vh.q1 q1Var = (vh.q1) obj;
                            int i13 = q1Var.e - 1;
                            float[] fArr2 = (float[]) this.e;
                            float f7 = fArr2[i13];
                            if (f7 > 0.0f) {
                                fArr2[i13] = f7 + org.telegram.messenger.i0.L(10.0f);
                            }
                            float[] fArr3 = (float[]) this.e;
                            fArr3[i13] = fArr3[i13] + q1Var.h.e(false, q1Var.f51782b);
                        }
                        int size2 = arrayList.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            vh.q1 q1Var2 = (vh.q1) obj2;
                            q1Var2.a(canvas, c3.i0.B((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), ((float[]) this.e)[q1Var2.e - 1], 2.0f, getPaddingLeft()) + q1Var2.d, org.telegram.messenger.m5.D(48.0f, q1Var2.e - 1, org.telegram.messenger.i0.L(12.0f)));
                        }
                        return;
                    }
                }
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f20323a) {
            case 2:
                super.onAttachedToWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((vh.q1) obj).b(true);
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f20323a) {
            case 2:
                super.onDetachedFromWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((vh.q1) obj).b(false);
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        switch (this.f20323a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((fe.b) this.e).e;
                float f11 = ((fe.f) this.f20326f).f7031f;
                Drawable drawable = (Drawable) this.f20325c;
                if (drawable != null && f11 < 0.5f) {
                    float D = c3.i0.D(f11, 2.0f, 1.0f, 1.0f - f10);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, D, 0.0f);
                } else {
                    Drawable drawable2 = (Drawable) this.f20324b;
                    if (drawable2 != null && f10 < 1.0f) {
                        float f12 = 1.0f - f10;
                        float f13 = (f11 - 0.5f) * 2.0f;
                        if (drawable == null) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        canvas2 = canvas;
                        a(canvas2, drawable2, width, height, Math.min(1.0f, f13 + f7) * f12, (-90.0f) * f10);
                    } else {
                        canvas2 = canvas;
                    }
                }
                if (f10 > 0.0f) {
                    a(canvas2, (Drawable) this.d, width, height, f10, (1.0f - f10) * 90.0f);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f20323a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                ArrayList arrayList = (ArrayList) this.d;
                int size2 = arrayList.size();
                int i12 = 0;
                int i13 = 1;
                float f7 = 0.0f;
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    vh.q1 q1Var = (vh.q1) obj;
                    q1Var.d = f7;
                    float L = q1Var.f51782b + org.telegram.messenger.i0.L(10.0f) + f7;
                    if (L > paddingLeft) {
                        i13++;
                        q1Var.d = 0.0f;
                        f7 = q1Var.f51782b + org.telegram.messenger.i0.L(10.0f) + 0.0f;
                    } else {
                        f7 = L;
                    }
                    q1Var.e = i13;
                }
                float[] fArr = (float[]) this.e;
                if (fArr != null && fArr.length == i13) {
                    Arrays.fill(fArr, 0.0f);
                } else {
                    this.e = new float[i13];
                }
                int size3 = arrayList.size();
                while (i12 < size3) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    vh.q1 q1Var2 = (vh.q1) obj2;
                    int i15 = q1Var2.e - 1;
                    float[] fArr2 = (float[]) this.e;
                    float f10 = fArr2[i15];
                    if (f10 > 0.0f) {
                        fArr2[i15] = f10 + org.telegram.messenger.i0.L(10.0f);
                    }
                    float[] fArr3 = (float[]) this.e;
                    fArr3[i15] = fArr3[i15] + q1Var2.f51782b;
                }
                setMeasuredDimension(size, org.telegram.messenger.m5.D(12.0f, i13 - 1, org.telegram.messenger.m5.D(36.0f, i13, org.telegram.messenger.i0.L(24.0f))));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vh.q1 q1Var;
        vh.v0 v0Var;
        boolean z10;
        switch (this.f20323a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        q1Var = (vh.q1) obj;
                        if (q1Var.f51784f.contains(motionEvent.getX(), motionEvent.getY())) {
                        }
                    } else {
                        q1Var = null;
                    }
                }
                int size2 = arrayList.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    vh.q1 q1Var2 = (vh.q1) obj2;
                    if (q1Var2 != q1Var) {
                        q1Var2.f51785g.c(false);
                    }
                }
                if (q1Var != null) {
                    dc dcVar = q1Var.f51785g;
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dcVar.c(z10);
                }
                if (motionEvent.getAction() == 1 && q1Var != null && (v0Var = (vh.v0) this.f20326f) != null) {
                    v0Var.a(Integer.valueOf(q1Var.f51781a));
                }
                if (q1Var == null) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f20323a) {
            case 0:
                super.setAlpha(f7);
                ((i5) this.h).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f20323a) {
            case 0:
                super.setTranslationX(f7);
                ((i5) this.h).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f20323a) {
            case 0:
                if (drawable != ((Drawable) this.f20324b) && drawable != ((Drawable) this.f20325c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public f5(i5 i5Var, Context context) {
        super(context);
        this.h = i5Var;
        gr grVar = gr.h;
        this.e = new fe.b(0, this, grVar, 380L, false);
        this.f20326f = new fe.f(1, this, grVar, 380L, 1.0f);
        this.d = context.getDrawable(2131231242).mutate();
        d();
    }

    public f5(vh.u1 u1Var, Context context) {
        super(context);
        this.h = u1Var;
        Paint paint = new Paint(1);
        this.f20324b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f20325c = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(org.telegram.messenger.i0.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        setPadding(0, 0, 0, 0);
        if (u1Var.J0(4)) {
            vh.r1 r1Var = new vh.r1(this, 4, 2131232199, cd.L0(2131744469, null));
            int i10 = vh.u1.f51993y1;
            if (!d20.i(u1Var.f21583a).q()) {
                Drawable mutate = getContext().getResources().getDrawable(2131232242).mutate();
                r1Var.f51833j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(t6.r1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                r1Var.f51837n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(r1Var);
        }
        if (u1Var.J0(0)) {
            arrayList.add(new vh.r1(this, 0, 2131231647, cd.L0(2131744468, null)));
        }
        if (u1Var.J0(5)) {
            k9 k9Var = l9.f51460b;
            vh.r1[] r1VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k9Var == null ? "🌤" : k9Var.f51440c);
            sb2.append(" ");
            sb2.append(k9Var == null ? l9.a() ? "24°C" : "72°F" : k9Var.a());
            CharSequence m10 = org.telegram.messenger.k6.m(sb2.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder = m10;
            if (vp.r1(u1Var.f21583a).X5) {
                spannableStringBuilder = m10;
                spannableStringBuilder = m10;
                if (w7.c6.d("android.permission.ACCESS_COARSE_LOCATION") && k9Var == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new u80(org.telegram.messenger.i0.L(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    r1VarArr[0] = new vh.r1(this, spannableStringBuilder2);
                    w7.c6.c(2131624117, 2131747318, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new nc(10, new nc(9, new rh.e3(3, this, r1VarArr), false), false));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            vh.r1 r1Var2 = r1VarArr[0];
            arrayList.add(r1Var2 == null ? new vh.r1(this, spannableStringBuilder) : r1Var2);
        }
        if (u1Var.J0(1)) {
            arrayList.add(new vh.r1(this, 1, 2131231188, cd.L0(2131744470, null)));
        }
        if (u1Var.J0(2)) {
            arrayList.add(new vh.r1(this, 2, 2131231146, cd.L0(2131744467, null)));
        }
        if (u1Var.J0(3)) {
            arrayList.add(new vh.s1(this));
        }
    }
}
