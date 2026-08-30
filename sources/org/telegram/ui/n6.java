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
    public final b7 B;
    public final org.telegram.ui.Components.k6 f36460a;
    public final TextView[] f36461b;
    public final RectF f36462c;
    public final org.telegram.ui.Components.i90 d;
    public Float e;
    public Float f36463f;
    public final org.telegram.ui.Components.z5 h;
    public final org.telegram.ui.Components.z5 f36464n;
    public final org.telegram.ui.Components.z5 f36465r;
    public final Paint f36466s;
    public final Paint v;
    public final Paint f36467w;
    public Path f36468x;
    public float[] f36469y;

    public n6(b7 b7Var, Context context) {
        super(context);
        float f10;
        this.B = b7Var;
        this.f36461b = new TextView[3];
        this.f36462c = new RectF();
        this.d = new org.telegram.ui.Components.i90();
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.h = new org.telegram.ui.Components.z5(this, 450L, nrVar);
        this.f36464n = new org.telegram.ui.Components.z5(this, 450L, nrVar);
        this.f36465r = new org.telegram.ui.Components.z5(this, 450L, nrVar);
        this.f36466s = new Paint(1);
        this.v = new Paint(1);
        this.f36467w = new Paint(1);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f36460a = k6Var;
        k6Var.b(0.35f, 350L, nrVar);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(20.0f));
        k6Var.setText(LocaleController.getString(R.string.StorageUsage));
        k6Var.setGravity(17);
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(k6Var, k7.b6.e(-2, 26, 49));
        for (int i10 = 0; i10 < 3; i10++) {
            this.f36461b[i10] = new TextView(context);
            this.f36461b[i10].setTextSize(1, 13.0f);
            this.f36461b[i10].setGravity(17);
            this.f36461b[i10].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            if (i10 == 0) {
                this.f36461b[i10].setText(LocaleController.getString(R.string.StorageUsageCalculating));
            } else if (i10 == 1) {
                this.f36461b[i10].setAlpha(0.0f);
                this.f36461b[i10].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                this.f36461b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.f36461b[i10].setText(LocaleController.getString(R.string.StorageCleared2));
                this.f36461b[i10].setAlpha(0.0f);
                this.f36461b[i10].setVisibility(4);
            }
            this.f36461b[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            View view = this.f36461b[i10];
            if (i10 == 2) {
                f10 = 12.0f;
            } else {
                f10 = -6.0f;
            }
            addView(view, k7.b6.d(-2, -2.0f, 17, 0.0f, f10, 0.0f, 0.0f));
        }
        this.d.e(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20300z8, false), org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false)));
        this.d.j(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f36468x;
        if (path == null) {
            this.f36468x = new Path();
        } else {
            path.rewind();
        }
        if (this.f36469y == null) {
            this.f36469y = new float[8];
        }
        float[] fArr = this.f36469y;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
        this.f36468x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f36468x, paint);
    }

    public final void b(float f10, float f11, boolean z4) {
        String string;
        if (z4) {
            string = LocaleController.getString(R.string.StorageUsage);
        } else {
            string = LocaleController.getString(R.string.StorageCleared);
        }
        this.f36460a.setText(string);
        if (z4) {
            b7 b7Var = this.B;
            TextView[] textViewArr = this.f36461b;
            if (f10 < 0.01f) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, b7.c0(b7Var, f10)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, b7.c0(b7Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f10);
        this.f36463f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (System.currentTimeMillis() - this.B.R > 40) {
            z4 = true;
        } else {
            z4 = false;
        }
        TextView[] textViewArr = this.f36461b;
        TextView textView = textViewArr[0];
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(textView, z10, z4);
        TextView textView2 = textViewArr[1];
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        d(textView2, z11, z4);
        TextView textView3 = textViewArr[2];
        if (i10 == 2) {
            z12 = true;
        }
        d(textView3, z12, z4);
    }

    public final void d(TextView textView, boolean z4, boolean z10) {
        if (textView == null) {
            return;
        }
        int i10 = 0;
        if (textView.getParent() == null) {
            z10 = false;
        }
        Integer num = null;
        textView.animate().setListener(null).cancel();
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z4) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            if (z4) {
                num = 1;
            }
            textView.setTag(num);
            if (!z4) {
                f10 = 0.0f;
            }
            textView.setAlpha(f10);
            if (!z4) {
                f11 = AndroidUtilities.dp(8.0f);
            }
            textView.setTranslationY(f11);
            invalidate();
        } else if (z4) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
                textView.setTranslationY(AndroidUtilities.dp(8.0f));
            }
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n6 f36198b;

                {
                    this.f36198b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f36198b.invalidate();
                            return;
                        default:
                            this.f36198b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new org.telegram.ui.Components.l00(textView)).setInterpolator(org.telegram.ui.Components.nr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n6 f36198b;

                {
                    this.f36198b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f36198b.invalidate();
                            return;
                        default:
                            this.f36198b.invalidate();
                            return;
                    }
                }
            }).start();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float floatValue;
        float floatValue2;
        RectF rectF;
        int i10;
        float f11;
        float f12;
        float alpha = 1.0f - this.f36461b[2].getAlpha();
        if (this.e == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f36465r.d(f10, false);
        Float f13 = this.e;
        if (f13 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f13.floatValue();
        }
        org.telegram.ui.Components.z5 z5Var = this.h;
        float d10 = z5Var.d(floatValue, false);
        Float f14 = this.f36463f;
        if (f14 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f14.floatValue();
        }
        float d11 = this.f36464n.d(floatValue2, false);
        int i11 = org.telegram.ui.ActionBar.j6.f20300z8;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        Paint paint = this.f36466s;
        paint.setColor(w02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = AndroidUtilities.rectTmp;
        RectF rectF3 = this.f36462c;
        float f15 = 1.0f - d;
        rectF2.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d11) * f15) + rectF3.left, (Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d10) * f15) + rectF3.left) + AndroidUtilities.dp(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > AndroidUtilities.dp(3.0f)) {
            rectF = rectF3;
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, d)), AndroidUtilities.dp(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.i90 i90Var = this.d;
        i90Var.d(rectF);
        i90Var.setAlpha((int) (255.0f * alpha * d));
        i90Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.j6.f19979h7;
        int d12 = i0.a.d(0.75f, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Paint paint2 = this.f36467w;
        paint2.setColor(d12);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f15) + rectF.left + AndroidUtilities.dp(1.0f), rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d11) * f15) + rectF.left, rectF.bottom);
        if (rectF2.width() > AndroidUtilities.dp(3.0f)) {
            float dp = AndroidUtilities.dp(1.0f);
            if (d11 > 0.97f) {
                f12 = 2.0f;
            } else {
                f12 = 1.0f;
            }
            float dp2 = AndroidUtilities.dp(f12);
            i10 = i12;
            a(dp, dp2, canvas, paint2, rectF2);
        } else {
            i10 = i12;
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        Paint paint3 = this.v;
        paint3.setColor(w03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f16 = rectF.left;
        rectF2.set(f16, rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f15) + f16, rectF.bottom);
        float dp3 = AndroidUtilities.dp(2.0f);
        if (d10 > 0.97f) {
            f11 = 2.0f;
        } else {
            f11 = 1.0f;
        }
        a(dp3, AndroidUtilities.dp(f11), canvas, paint3, rectF2);
        if (d > 0.0f || z5Var.f31244i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int min = (int) Math.min(AndroidUtilities.dp(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
        int dp = AndroidUtilities.dp(72.0f);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            TextView[] textViewArr = this.f36461b;
            if (i13 < textViewArr.length) {
                int measuredHeight = textViewArr[i13].getMeasuredHeight();
                if (i13 == 2) {
                    i12 = AndroidUtilities.dp(16.0f);
                } else {
                    i12 = 0;
                }
                i14 = Math.max(i14, measuredHeight - i12);
                i13++;
            } else {
                int i15 = dp + i14;
                setMeasuredDimension(size, i15);
                this.f36462c.set((size - min) / 2.0f, i15 - AndroidUtilities.dp(30.0f), (size + min) / 2.0f, i15 - AndroidUtilities.dp(26.0f));
                return;
            }
        }
    }
}
