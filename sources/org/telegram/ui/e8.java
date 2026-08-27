package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class e8 extends FrameLayout {

    public final org.telegram.ui.ActionBar.h5 f37653a;

    public int f37654b;

    public int f37655c;
    public int d;

    public int f37656e;

    public int f37657f;
    public int h;

    public SparseArray f37658n;

    public SparseArray f37659r;

    public final m5.o f37660s;
    public final SparseArray v;

    public final SparseArray f37661w;

    public final h8 f37662x;

    public e8(h8 h8Var, Context context) {
        super(context);
        this.f37662x = h8Var;
        this.f37658n = new SparseArray();
        this.f37659r = new SparseArray();
        this.v = new SparseArray();
        this.f37661w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f37653a = h5Var;
        if (h8Var.f38699a0 == 0 && h8Var.Z) {
            h5Var.setOnLongClickListener(new v(this, 1));
            h5Var.setOnClickListener(new y7(this, 0));
        }
        h5Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(17);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(h5Var, h7.z5.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        m5.o oVar = new m5.o(context, new c8(this, context));
        this.f37660s = oVar;
        ((GestureDetector) oVar.f17823b).setIsLongpressEnabled(h8Var.f38699a0 == 0);
    }

    public static void a(e8 e8Var, int i10, int i11) {
        if (e8Var.f37658n != null) {
            for (int i12 = 0; i12 < e8Var.d; i12++) {
                f8 f8Var = (f8) e8Var.f37658n.get(i12, null);
                if (f8Var != null) {
                    f8Var.f37968m = f8Var.f37967l;
                    int i13 = f8Var.h;
                    f8Var.f37969n = (i13 < i10 || i13 > i11) ? 0.0f : 1.0f;
                    f8Var.f37965j = f8Var.f37964i;
                    if (i13 == i10 || i13 == i11) {
                        f8Var.f37966k = 1.0f;
                    } else {
                        f8Var.f37966k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(e8 e8Var, float f10) {
        if (e8Var.f37658n != null) {
            for (int i10 = 0; i10 < e8Var.d; i10++) {
                f8 f8Var = (f8) e8Var.f37658n.get(i10, null);
                if (f8Var != null) {
                    float f11 = f8Var.f37968m;
                    f8Var.f37967l = com.google.android.recaptcha.internal.a.z(f8Var.f37969n, f11, f10, f11);
                    float f12 = f8Var.f37965j;
                    f8Var.f37964i = com.google.android.recaptcha.internal.a.z(f8Var.f37966k, f12, f10, f12);
                }
            }
        }
        e8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z10, boolean z11) {
        float f10;
        float f11;
        final float f12;
        float f13;
        final float f14;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f37661w;
        g8 g8Var = (g8) sparseArray2.get(i10);
        if (g8Var != null) {
            float f15 = g8Var.f38332a;
            f11 = g8Var.f38333b;
            f12 = g8Var.f38334c;
            f10 = f15;
        } else {
            f10 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        if (z10) {
            f13 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
        } else {
            f13 = f10;
        }
        if (z10) {
            f14 = (measuredWidth / 2.0f) + (i12 * measuredWidth);
        } else {
            f14 = f11;
        }
        float f16 = z10 ? 1.0f : 0.0f;
        final g8 g8Var2 = new g8();
        g8Var2.f38332a = f10;
        g8Var2.f38333b = f11;
        sparseArray2.put(i10, g8Var2);
        if (!z11) {
            g8Var2.f38332a = f13;
            g8Var2.f38333b = f14;
            g8Var2.f38334c = f16;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.ws.f34319e);
        final float f17 = f11;
        final float f18 = f16;
        final float f19 = f10;
        final float f20 = f13;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                e8 e8Var = this.f44296a;
                e8Var.getClass();
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f21 = f20;
                float f22 = f19;
                float fZ = com.google.android.recaptcha.internal.a.z(f21, f22, fFloatValue, f22);
                g8 g8Var3 = g8Var2;
                g8Var3.f38332a = fZ;
                float f23 = f14;
                float f24 = f17;
                g8Var3.f38333b = com.google.android.recaptcha.internal.a.z(f23, f24, fFloatValue, f24);
                float f25 = f18;
                float f26 = f12;
                g8Var3.f38334c = com.google.android.recaptcha.internal.a.z(f25, f26, fFloatValue, f26);
                e8Var.invalidate();
            }
        });
        duration.addListener(new d8(this, g8Var2, f20, f14, f18, i10, z10));
        duration.start();
        sparseArray.put(i10, duration);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37659r != null) {
            for (int i10 = 0; i10 < this.f37659r.size(); i10++) {
                ((ImageReceiver) this.f37659r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37659r != null) {
            for (int i10 = 0; i10 < this.f37659r.size(); i10++) {
                ((ImageReceiver) this.f37659r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        Paint paint;
        Paint paint2;
        Paint paint3;
        int i11;
        Paint paint4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Paint paint5;
        e8 e8Var = this;
        Canvas canvas2 = canvas;
        h8 h8Var = e8Var.f37662x;
        Paint paint6 = h8Var.f38715w;
        eh.k kVar = h8Var.f38709g0;
        Path path = h8Var.f38708f0;
        Paint paint7 = h8Var.f38713r;
        TextPaint textPaint = h8Var.f38705e;
        Paint paint8 = h8Var.f38714s;
        TextPaint textPaint2 = h8Var.d;
        super.onDraw(canvas);
        int i12 = e8Var.f37656e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float fDp = AndroidUtilities.dp(52.0f);
        int iDp = AndroidUtilities.dp(44.0f);
        Paint paint9 = paint7;
        int i13 = 0;
        while (true) {
            i10 = i12;
            f10 = fDp;
            if (i13 >= Math.ceil((e8Var.f37656e + e8Var.d) / 7.0f)) {
                break;
            }
            float fDp2 = (f10 / 2.0f) + (i13 * f10) + AndroidUtilities.dp(44.0f);
            g8 g8Var = (g8) e8Var.f37661w.get(i13);
            if (g8Var != null) {
                paint8.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23044cf, false));
                paint8.setAlpha((int) (g8Var.f38334c * 40.8f));
                RectF rectF = AndroidUtilities.rectTmp;
                float f16 = iDp / 2.0f;
                rectF.set(g8Var.f38332a - f16, fDp2 - f16, g8Var.f38333b + f16, fDp2 + f16);
                float fDp3 = AndroidUtilities.dp(32.0f);
                canvas2.drawRoundRect(rectF, fDp3, fDp3, paint8);
            }
            i13++;
            i12 = i10;
            fDp = f10;
            iDp = iDp;
        }
        int i14 = i10;
        int i15 = 0;
        int i16 = 0;
        while (i15 < e8Var.d) {
            float f17 = (i14 * measuredWidth) + (measuredWidth / 2.0f);
            float fDp4 = (f10 / 2.0f) + (i16 * f10) + AndroidUtilities.dp(44.0f);
            int i17 = i16;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = e8Var.f37658n;
            int i18 = i14;
            f8 f8Var = sparseArray != null ? (f8) sparseArray.get(i15, null) : null;
            int i19 = e8Var.h;
            int i20 = i15 + 1;
            if (iCurrentTimeMillis < (i20 * 86400) + i19 || ((i11 = h8Var.Y) > 0 && i11 > ((i15 + 2) * 86400) + i19)) {
                paint = paint6;
                paint2 = paint8;
                measuredWidth = measuredWidth;
                paint3 = paint9;
                h8Var = h8Var;
                int alpha = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i20), f17, AndroidUtilities.dp(5.0f) + fDp4, textPaint2);
                textPaint2.setAlpha(alpha);
            } else if (f8Var == null || !f8Var.f37963g) {
                Paint paint10 = paint8;
                measuredWidth = measuredWidth;
                Paint paint11 = paint9;
                h8Var = h8Var;
                if (f8Var == null || f8Var.f37964i < 0.01f) {
                    paint = paint6;
                    paint2 = paint10;
                    paint3 = paint11;
                    canvas2.drawText(Integer.toString(i20), f17, AndroidUtilities.dp(5.0f) + fDp4, textPaint2);
                } else {
                    paint10.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    paint10.setAlpha((int) (f8Var.f37964i * 255.0f));
                    canvas2.drawCircle(f17, fDp4, AndroidUtilities.dp(44.0f) / 2.0f, paint10);
                    int i21 = org.telegram.ui.ActionBar.g6.f23044cf;
                    paint3 = paint11;
                    paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f17 - (AndroidUtilities.dp(44.0f) / 2.0f), fDp4 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f17, (AndroidUtilities.dp(44.0f) / 2.0f) + fDp4);
                    paint2 = paint10;
                    paint = paint6;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, f8Var.f37964i * 360.0f, false, paint3);
                    int iDp2 = (int) (AndroidUtilities.dp(7.0f) * f8Var.f37964i);
                    paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
                    paint2.setAlpha((int) (f8Var.f37964i * 255.0f));
                    canvas2.drawCircle(f17, fDp4, (AndroidUtilities.dp(44.0f) - iDp2) / 2.0f, paint2);
                    float f18 = f8Var.f37964i;
                    if (f18 != 1.0f) {
                        int alpha2 = textPaint2.getAlpha();
                        textPaint2.setAlpha((int) ((1.0f - f18) * alpha2));
                        canvas2.drawText(Integer.toString(i20), f17, AndroidUtilities.dp(5.0f) + fDp4, textPaint2);
                        textPaint2.setAlpha(alpha2);
                        int alpha3 = textPaint2.getAlpha();
                        textPaint.setAlpha((int) (alpha3 * f18));
                        canvas2.drawText(Integer.toString(i20), f17, AndroidUtilities.dp(5.0f) + fDp4, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawText(Integer.toString(i20), f17, AndroidUtilities.dp(5.0f) + fDp4, textPaint);
                    }
                }
            } else {
                if (e8Var.f37659r.get(i15) != null) {
                    float f19 = 0.0f;
                    if (h8Var.B && !f8Var.f37962f) {
                        f8Var.d = 0.0f;
                        f19 = 0.0f;
                        f8Var.f37961e = Math.max(0.0f, ((e8Var.getY() + fDp4) / h8Var.f38700b.getMeasuredHeight()) * 150.0f);
                    }
                    float f20 = f8Var.f37961e;
                    if (f20 > f19) {
                        float f21 = f20 - 16.0f;
                        f8Var.f37961e = f21;
                        if (f21 < f19) {
                            f8Var.f37961e = f19;
                        } else {
                            e8Var.invalidate();
                        }
                    }
                    if (f8Var.f37961e >= f19) {
                        float f22 = f8Var.d;
                        if (f22 != 1.0f) {
                            float f23 = f22 + 0.07272727f;
                            f8Var.d = f23;
                            if (f23 > 1.0f) {
                                f14 = 1.0f;
                                f8Var.d = 1.0f;
                            } else {
                                f14 = 1.0f;
                                e8Var.invalidate();
                            }
                        } else {
                            f14 = 1.0f;
                        }
                    } else {
                        f14 = 1.0f;
                    }
                    float f24 = f8Var.d;
                    if (f24 != f14) {
                        canvas2.save();
                        float f25 = (0.2f * f24) + 0.8f;
                        canvas2.scale(f25, f25, f17, fDp4);
                    }
                    int i22 = i15;
                    int iDp3 = (int) (AndroidUtilities.dp(7.0f) * f8Var.f37967l);
                    if (f8Var.f37964i >= 0.01f) {
                        paint8.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                        paint8.setAlpha((int) (f8Var.f37964i * 255.0f));
                        canvas2.drawCircle(f17, fDp4, AndroidUtilities.dp(44.0f) / 2.0f, paint8);
                        paint9.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23044cf, false));
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(f17 - (AndroidUtilities.dp(44.0f) / 2.0f), fDp4 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f17, (AndroidUtilities.dp(44.0f) / 2.0f) + fDp4);
                        canvas2 = canvas;
                        f15 = f24;
                        f11 = 1.0f;
                        paint5 = paint9;
                        f12 = f17;
                        canvas2.drawArc(rectF3, -90.0f, f8Var.f37964i * 360.0f, false, paint5);
                    } else {
                        f15 = f24;
                        f11 = 1.0f;
                        f12 = f17;
                        paint5 = paint9;
                    }
                    ((ImageReceiver) e8Var.f37659r.get(i22)).setAlpha(f8Var.d);
                    paint4 = paint5;
                    ((ImageReceiver) e8Var.f37659r.get(i22)).setImageCoords(f12 - ((AndroidUtilities.dp(44.0f) - iDp3) / 2.0f), fDp4 - ((AndroidUtilities.dp(44.0f) - iDp3) / 2.0f), AndroidUtilities.dp(44.0f) - iDp3, AndroidUtilities.dp(44.0f) - iDp3);
                    ((ImageReceiver) e8Var.f37659r.get(i22)).draw(canvas2);
                    if (e8Var.f37658n.get(i22) != null && ((f8) e8Var.f37658n.get(i22)).f37958a != null && ((f8) e8Var.f37658n.get(i22)).f37958a.hasMediaSpoilers()) {
                        float fDp5 = (AndroidUtilities.dp(44.0f) - iDp3) / 2.0f;
                        path.rewind();
                        path.addCircle(f12, fDp4, fDp5, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        kVar.h(i0.b.k(-1, (int) (Color.alpha(-1) * 0.325f * f8Var.d)));
                        kVar.setBounds((int) (f12 - fDp5), (int) (fDp4 - fDp5), (int) (f12 + fDp5), (int) (fDp4 + fDp5));
                        kVar.draw(canvas2);
                        e8Var.invalidate();
                        canvas2.restore();
                    }
                    paint6.setColor(i0.b.k(-16777216, (int) (f8Var.d * 80.0f)));
                    canvas2.drawCircle(f12, fDp4, (AndroidUtilities.dp(44.0f) - iDp3) / 2.0f, paint6);
                    f8Var.f37962f = true;
                    if (f24 != f14) {
                        canvas2.restore();
                    }
                    f13 = f15;
                } else {
                    paint8 = paint8;
                    measuredWidth = measuredWidth;
                    paint4 = paint9;
                    f11 = 1.0f;
                    f12 = f17;
                    fDp4 = fDp4;
                    h8Var = h8Var;
                    f13 = 1.0f;
                }
                if (f13 != f11) {
                    int alpha4 = textPaint2.getAlpha();
                    textPaint2.setAlpha((int) ((f11 - f13) * alpha4));
                    canvas2.drawText(Integer.toString(i20), f12, fDp4 + AndroidUtilities.dp(5.0f), textPaint2);
                    textPaint2.setAlpha(alpha4);
                    int alpha5 = textPaint2.getAlpha();
                    textPaint.setAlpha((int) (alpha5 * f13));
                    canvas2.drawText(Integer.toString(i20), f12, fDp4 + AndroidUtilities.dp(5.0f), textPaint);
                    textPaint.setAlpha(alpha5);
                } else {
                    canvas2.drawText(Integer.toString(i20), f12, fDp4 + AndroidUtilities.dp(5.0f), textPaint);
                }
                paint = paint6;
                paint2 = paint8;
                paint3 = paint4;
            }
            i14 = i18 + 1;
            if (i14 >= 7) {
                i16 = i17 + 1;
                i14 = 0;
            } else {
                i16 = i17;
            }
            paint8 = paint2;
            h8Var = h8Var;
            measuredWidth = measuredWidth;
            i15 = i20;
            paint6 = paint;
            e8Var = this;
            paint9 = paint3;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f37657f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f37660s.f17823b).onTouchEvent(motionEvent);
    }
}
