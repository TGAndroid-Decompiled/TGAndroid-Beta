package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n6 extends FrameLayout {
    public final d7 E;
    public final org.telegram.ui.Components.s6 f38146a;
    public final TextView[] f38147b;
    public final RectF f38148c;
    public final org.telegram.ui.Components.ha0 d;
    public Float e;
    public Float f38149f;
    public final org.telegram.ui.Components.g6 h;
    public final org.telegram.ui.Components.g6 f38150n;
    public final org.telegram.ui.Components.g6 f38151r;
    public final Paint f38152s;
    public final Paint v;
    public final Paint f38153w;
    public Path f38154x;
    public float[] f38155y;

    public n6(d7 d7Var, Context context) {
        super(context);
        float f7;
        this.E = d7Var;
        this.f38147b = new TextView[3];
        this.f38148c = new RectF();
        this.d = new org.telegram.ui.Components.ha0();
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.h = new org.telegram.ui.Components.g6(this, 450L, esVar);
        this.f38150n = new org.telegram.ui.Components.g6(this, 450L, esVar);
        this.f38151r = new org.telegram.ui.Components.g6(this, 450L, esVar);
        this.f38152s = new Paint(1);
        this.v = new Paint(1);
        this.f38153w = new Paint(1);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f38146a = s6Var;
        s6Var.b(0.35f, 350L, esVar);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(20.0f));
        s6Var.setText(LocaleController.getString(R.string.StorageUsage));
        s6Var.setGravity(17);
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(s6Var, w7.z5.e(-2, 26, 49));
        for (int i10 = 0; i10 < 3; i10++) {
            this.f38147b[i10] = new TextView(context);
            this.f38147b[i10].setTextSize(1, 13.0f);
            this.f38147b[i10].setGravity(17);
            this.f38147b[i10].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            if (i10 == 0) {
                this.f38147b[i10].setText(LocaleController.getString(R.string.StorageUsageCalculating));
            } else if (i10 == 1) {
                this.f38147b[i10].setAlpha(0.0f);
                this.f38147b[i10].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                this.f38147b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.f38147b[i10].setText(LocaleController.getString(R.string.StorageCleared2));
                this.f38147b[i10].setAlpha(0.0f);
                this.f38147b[i10].setVisibility(4);
            }
            this.f38147b[i10].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
            View view = this.f38147b[i10];
            if (i10 == 2) {
                f7 = 12.0f;
            } else {
                f7 = -6.0f;
            }
            addView(view, w7.z5.a(-2.0f, 0.0f, f7, 0.0f, 0.0f, -2, 17));
        }
        this.d.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007z8, false), org.telegram.ui.ActionBar.g6.m1(0.2f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f38154x;
        if (path == null) {
            this.f38154x = new Path();
        } else {
            path.rewind();
        }
        if (this.f38155y == null) {
            this.f38155y = new float[8];
        }
        float[] fArr = this.f38155y;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        this.f38154x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f38154x, paint);
    }

    public final void b(float f7, float f10, boolean z10) {
        String string;
        if (z10) {
            string = LocaleController.getString(R.string.StorageUsage);
        } else {
            string = LocaleController.getString(R.string.StorageCleared);
        }
        this.f38146a.setText(string);
        if (z10) {
            int i10 = (f7 > 0.01f ? 1 : (f7 == 0.01f ? 0 : -1));
            d7 d7Var = this.E;
            TextView[] textViewArr = this.f38147b;
            if (i10 < 0) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, d7.c0(d7Var, f7)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, d7.c0(d7Var, f7)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f7);
        this.f38149f = Float.valueOf(f10);
        invalidate();
    }

    public final void c(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (System.currentTimeMillis() - this.E.U > 40) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView[] textViewArr = this.f38147b;
        TextView textView = textViewArr[0];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d(textView, z11, z10);
        TextView textView2 = textViewArr[1];
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(textView2, z12, z10);
        TextView textView3 = textViewArr[2];
        if (i10 == 2) {
            z13 = true;
        }
        d(textView3, z13, z10);
    }

    public final void d(TextView textView, boolean z10, boolean z11) {
        if (textView == null) {
            return;
        }
        int i10 = 0;
        if (textView.getParent() == null) {
            z11 = false;
        }
        Integer num = null;
        textView.animate().setListener(null).cancel();
        float f7 = 1.0f;
        float f10 = 0.0f;
        if (!z11) {
            if (!z10) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            if (z10) {
                num = 1;
            }
            textView.setTag(num);
            if (!z10) {
                f7 = 0.0f;
            }
            textView.setAlpha(f7);
            if (!z10) {
                f10 = AndroidUtilities.dp(8.0f);
            }
            textView.setTranslationY(f10);
            invalidate();
        } else if (z10) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
                textView.setTranslationY(AndroidUtilities.dp(8.0f));
            }
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.es.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n6 f37915b;

                {
                    this.f37915b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f37915b.invalidate();
                            return;
                        default:
                            this.f37915b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new vo(textView)).setInterpolator(org.telegram.ui.Components.es.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n6 f37915b;

                {
                    this.f37915b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f37915b.invalidate();
                            return;
                        default:
                            this.f37915b.invalidate();
                            return;
                    }
                }
            }).start();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float floatValue;
        float floatValue2;
        RectF rectF;
        int i10;
        float f10;
        float f11;
        float alpha = 1.0f - this.f38147b[2].getAlpha();
        if (this.e == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f38151r.d(f7, false);
        Float f12 = this.e;
        if (f12 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f12.floatValue();
        }
        org.telegram.ui.Components.g6 g6Var = this.h;
        float d10 = g6Var.d(floatValue, false);
        Float f13 = this.f38149f;
        if (f13 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f13.floatValue();
        }
        float d11 = this.f38150n.d(floatValue2, false);
        int i11 = org.telegram.ui.ActionBar.g6.f20007z8;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        Paint paint = this.f38152s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = AndroidUtilities.rectTmp;
        RectF rectF3 = this.f38148c;
        float f14 = 1.0f - d;
        rectF2.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d11) * f14) + rectF3.left, (Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d10) * f14) + rectF3.left) + AndroidUtilities.dp(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > AndroidUtilities.dp(3.0f)) {
            rectF = rectF3;
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, d)), AndroidUtilities.dp(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.ha0 ha0Var = this.d;
        ha0Var.e(rectF);
        ha0Var.setAlpha((int) (255.0f * alpha * d));
        ha0Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.g6.f19674h7;
        int d12 = i0.a.d(0.75f, org.telegram.ui.ActionBar.g6.x0(null, i12, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        Paint paint2 = this.f38153w;
        paint2.setColor(d12);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f14) + rectF.left + AndroidUtilities.dp(1.0f), rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d11) * f14) + rectF.left, rectF.bottom);
        if (rectF2.width() > AndroidUtilities.dp(3.0f)) {
            float dp = AndroidUtilities.dp(1.0f);
            if (d11 > 0.97f) {
                f11 = 2.0f;
            } else {
                f11 = 1.0f;
            }
            float dp2 = AndroidUtilities.dp(f11);
            i10 = i12;
            a(dp, dp2, canvas, paint2, rectF2);
        } else {
            i10 = i12;
        }
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        Paint paint3 = this.v;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f15 = rectF.left;
        rectF2.set(f15, rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f14) + f15, rectF.bottom);
        float dp3 = AndroidUtilities.dp(2.0f);
        if (d10 > 0.97f) {
            f10 = 2.0f;
        } else {
            f10 = 1.0f;
        }
        a(dp3, AndroidUtilities.dp(f10), canvas, paint3, rectF2);
        if (d > 0.0f || g6Var.f24888i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int min = (int) Math.min(AndroidUtilities.dp(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
        int dp = AndroidUtilities.dp(72.0f);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.f38147b;
            if (i14 < textViewArr.length) {
                int measuredHeight = textViewArr[i14].getMeasuredHeight();
                if (i14 == 2) {
                    i13 = AndroidUtilities.dp(16.0f);
                } else {
                    i13 = 0;
                }
                i15 = Math.max(i15, measuredHeight - i13);
                i14++;
            } else {
                setMeasuredDimension(size, dp + i15);
                this.f38148c.set((size - min) / 2.0f, i12 - AndroidUtilities.dp(30.0f), (size + min) / 2.0f, i12 - AndroidUtilities.dp(26.0f));
                return;
            }
        }
    }
}
