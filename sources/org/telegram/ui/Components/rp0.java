package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class rp0 extends FrameLayout {
    public final int f30056a = 0;
    public final Object f30057b;
    public final Object f30058c;
    public final Object d;
    public Object e;
    public Object f30059f;
    public Object h;
    public final Object f30060n;
    public final Object f30061r;
    public Object f30062s;
    public final Object f30063w;

    public rp0(tp0 tp0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f30063w = tp0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30057b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.t6.c0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var), 20, 20, 6, 6));
        w7.e6.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, w7.b6.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f30058c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21010hf, p6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, w7.b6.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30060n = frameLayout;
        linearLayout.addView(frameLayout, w7.b6.t(-2, -1, 115, 6, 0, 0, 0));
        this.f30061r = new g9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            ((g9[]) this.f30061r)[i10] = new g9(context);
            ((g9[]) this.f30061r)[i10].setRoundRadius(org.telegram.messenger.i0.L(6.0f));
            ((g9[]) this.f30061r)[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            ((FrameLayout) this.f30060n).addView(((g9[]) this.f30061r)[i10], w7.b6.d(i11, i11, 19, i10 * 12, 0.0f, 0.0f, 0.0f));
        }
        g9 g9Var = new g9(context);
        this.f30062s = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
        g9Var.setVisibility(8);
        ((LinearLayout) this.f30057b).addView(g9Var, w7.b6.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ((LinearLayout) this.f30057b).addView(frameLayout2, w7.b6.p(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var;
        u5Var.setTextSize(14);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21068kf, p6Var);
        frameLayout2.addView(u5Var, w7.b6.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f30059f = u5Var2;
        u5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.t6.Ll;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i12, p6Var);
        frameLayout2.addView(u5Var2, w7.b6.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var3 = new org.telegram.ui.ActionBar.u5(context);
        this.h = u5Var3;
        u5Var3.setTextSize(14);
        org.telegram.ui.ActionBar.a7.Y(u5Var3, i12, p6Var);
        u5Var3.setAlpha(0.0f);
        frameLayout2.addView(u5Var3, w7.b6.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231501);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Kl, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var), 1, org.telegram.messenger.i0.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new db0(this, 12));
        ((LinearLayout) this.f30057b).addView(imageView2, w7.b6.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        switch (this.f30056a) {
            case 1:
                RectF rectF = (RectF) this.f30061r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.f30057b;
                int i10 = org.telegram.ui.ActionBar.t6.f21002h5;
                vh.u1 u1Var = (vh.u1) this.f30063w;
                org.telegram.ui.hk hkVar = u1Var.f52004m1;
                paint2.setColor(org.telegram.ui.ActionBar.t6.w0(i10, u1Var.I0));
                if (((Bitmap) this.e) == null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.85f;
                }
                paint2.setAlpha((int) (f7 * 255.0f));
                View[] viewPages = hkVar.getViewPages();
                u1Var.f52012u1 = 0.0f;
                boolean z11 = false;
                for (View view : viewPages) {
                    if (view instanceof vh.h1) {
                        vh.h1 h1Var = (vh.h1) view;
                        u1Var.f52012u1 += Utilities.i(1.0f - Math.abs(h1Var.getTranslationX() / h1Var.getMeasuredWidth()), 1.0f, 0.0f) * h1Var.b();
                        if (h1Var.getVisibility() == 0) {
                            h1Var.c();
                        }
                    }
                }
                t5 t5Var = (t5) this.f30060n;
                if (u1Var.f52012u1 <= 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e = t5Var.e(false, f10);
                float paddingTop = (u1Var.f52012u1 + hkVar.getPaddingTop()) - org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(8.0f), hkVar.getPaddingTop());
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(u1Var.f21616t0, paddingTop, getWidth() - u1Var.f21616t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
                if (((Bitmap) this.e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f30059f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), (Paint) this.f30058c);
                }
                if (rectF2.top < org.telegram.messenger.i0.f16166m) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f30062s;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f30062s = Boolean.valueOf(z10);
                    Window window = u1Var.getWindow();
                    if (z10 && org.telegram.messenger.i0.B(paint2.getColor()) >= 0.721f) {
                        z11 = true;
                    }
                    org.telegram.messenger.i0.r3(window, z11);
                }
                float f11 = 1.0f - e;
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(14.0f) * f11, org.telegram.messenger.i0.L(14.0f) * f11, paint2);
                rectF.set((getWidth() - org.telegram.messenger.i0.L(36.0f)) / 2.0f, org.telegram.messenger.i0.L(9.66f) + paddingTop, (org.telegram.messenger.i0.L(36.0f) + getWidth()) / 2.0f, paddingTop + org.telegram.messenger.i0.L(13.66f));
                paint.setColor(1367573379);
                paint.setAlpha((int) (f11 * 81.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                canvas.save();
                canvas.clipRect(rectF2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f30056a) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    vh.u1 u1Var = (vh.u1) this.f30063w;
                    if (y3 < u1Var.f52012u1) {
                        u1Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f30056a) {
            case 1:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.f30058c).setShader(null);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f30056a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                vh.u1 u1Var = (vh.u1) this.f30063w;
                if (((Bitmap) this.e) == null) {
                    org.telegram.ui.ActionBar.p6 p6Var = u1Var.I0;
                    if (p6Var == null) {
                        if (!org.telegram.ui.ActionBar.t6.I.q()) {
                            return;
                        }
                    } else if (!p6Var.a()) {
                        return;
                    }
                    if (u1Var.f52011t1 != null && org.telegram.messenger.uz.o() > 0 && !org.telegram.messenger.tc.f()) {
                        Point point = org.telegram.messenger.i0.f16172q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        u1Var.f52011t1.a(createBitmap, Float.valueOf(16.0f));
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.e = createBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader((Bitmap) this.e, tileMode, tileMode);
                        this.f30059f = bitmapShader;
                        ((Paint) this.f30058c).setShader(bitmapShader);
                        if (((Matrix) this.h) == null) {
                            this.h = new Matrix();
                        }
                        ((Matrix) this.h).postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f30059f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30056a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                float min = Math.min(size2 * 0.45f, (org.telegram.messenger.i0.L(350.0f) / 0.55f) * 0.45f);
                vh.u1 u1Var = (vh.u1) this.f30063w;
                u1Var.f52006o1 = min;
                org.telegram.ui.hk hkVar = u1Var.f52004m1;
                hkVar.setPadding(0, org.telegram.messenger.i0.f16166m, 0, 0);
                hkVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                vh.t1 t1Var = u1Var.f52005n1;
                if (t1Var != null) {
                    t1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f30056a) {
            case 1:
                super.setTranslationY(f7);
                invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public rp0(vh.u1 u1Var, Context context) {
        super(context);
        this.f30063w = u1Var;
        this.f30057b = new Paint(1);
        this.f30058c = new Paint(3);
        this.d = new Paint(1);
        this.f30060n = new t5(this, 0L, 250L, gr.h);
        this.f30061r = new RectF();
    }
}
