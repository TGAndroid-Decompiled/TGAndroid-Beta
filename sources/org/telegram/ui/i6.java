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
public final class i6 extends FrameLayout {
    public final y6 A;
    public final org.telegram.ui.Components.j6 f39021a;
    public final TextView[] f39022b;
    public final RectF f39023c;
    public final org.telegram.ui.Components.p80 d;
    public Float f39024e;
    public Float f39025f;
    public final org.telegram.ui.Components.y5 h;
    public final org.telegram.ui.Components.y5 f39026n;
    public final org.telegram.ui.Components.y5 f39027r;
    public final Paint f39028s;
    public final Paint v;
    public final Paint f39029w;
    public Path f39030x;
    public float[] f39031y;

    public i6(y6 y6Var, Context context) {
        super(context);
        float f10;
        this.A = y6Var;
        this.f39022b = new TextView[3];
        this.f39023c = new RectF();
        this.d = new org.telegram.ui.Components.p80();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.y5(this, 450L, grVar);
        this.f39026n = new org.telegram.ui.Components.y5(this, 450L, grVar);
        this.f39027r = new org.telegram.ui.Components.y5(this, 450L, grVar);
        this.f39028s = new Paint(1);
        this.v = new Paint(1);
        this.f39029w = new Paint(1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f39021a = j6Var;
        j6Var.b(0.35f, 350L, grVar);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setText(LocaleController.getString(R.string.StorageUsage));
        j6Var.setGravity(17);
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        addView(j6Var, g7.e6.e(-2, 26, 49));
        for (int i9 = 0; i9 < 3; i9++) {
            this.f39022b[i9] = new TextView(context);
            this.f39022b[i9].setTextSize(1, 13.0f);
            this.f39022b[i9].setGravity(17);
            this.f39022b[i9].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            if (i9 == 0) {
                this.f39022b[i9].setText(LocaleController.getString(R.string.StorageUsageCalculating));
            } else if (i9 == 1) {
                this.f39022b[i9].setAlpha(0.0f);
                this.f39022b[i9].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                this.f39022b[i9].setVisibility(4);
            } else if (i9 == 2) {
                this.f39022b[i9].setText(LocaleController.getString(R.string.StorageCleared2));
                this.f39022b[i9].setAlpha(0.0f);
                this.f39022b[i9].setVisibility(4);
            }
            this.f39022b[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
            View view = this.f39022b[i9];
            if (i9 == 2) {
                f10 = 12.0f;
            } else {
                f10 = -6.0f;
            }
            addView(view, g7.e6.d(-2, -2.0f, 17, 0.0f, f10, 0.0f, 0.0f));
        }
        this.d.e(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23388z8, false), org.telegram.ui.ActionBar.f6.l1(0.2f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false)));
        this.d.j(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f39030x;
        if (path == null) {
            this.f39030x = new Path();
        } else {
            path.rewind();
        }
        if (this.f39031y == null) {
            this.f39031y = new float[8];
        }
        float[] fArr = this.f39031y;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
        this.f39030x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f39030x, paint);
    }

    public final void b(float f10, float f11, boolean z10) {
        String string;
        if (z10) {
            string = LocaleController.getString(R.string.StorageUsage);
        } else {
            string = LocaleController.getString(R.string.StorageCleared);
        }
        this.f39021a.setText(string);
        if (z10) {
            y6 y6Var = this.A;
            TextView[] textViewArr = this.f39022b;
            if (f10 < 0.01f) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, y6.b0(y6Var, f10)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, y6.b0(y6Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.f39024e = Float.valueOf(f10);
        this.f39025f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (System.currentTimeMillis() - this.A.Q > 40) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView[] textViewArr = this.f39022b;
        TextView textView = textViewArr[0];
        if (i9 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d(textView, z11, z10);
        TextView textView2 = textViewArr[1];
        if (i9 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(textView2, z12, z10);
        TextView textView3 = textViewArr[2];
        if (i9 == 2) {
            z13 = true;
        }
        d(textView3, z13, z10);
    }

    public final void d(TextView textView, boolean z10, boolean z11) {
        if (textView == null) {
            return;
        }
        int i9 = 0;
        if (textView.getParent() == null) {
            z11 = false;
        }
        Integer num = null;
        textView.animate().setListener(null).cancel();
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z11) {
            if (!z10) {
                i9 = 4;
            }
            textView.setVisibility(i9);
            if (z10) {
                num = 1;
            }
            textView.setTag(num);
            if (!z10) {
                f10 = 0.0f;
            }
            textView.setAlpha(f10);
            if (!z10) {
                f11 = AndroidUtilities.dp(8.0f);
            }
            textView.setTranslationY(f11);
            invalidate();
        } else if (z10) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
                textView.setTranslationY(AndroidUtilities.dp(8.0f));
            }
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final i6 f38689b;

                {
                    this.f38689b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f38689b.invalidate();
                            return;
                        default:
                            this.f38689b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new org.telegram.ui.Components.u9(textView)).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final i6 f38689b;

                {
                    this.f38689b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f38689b.invalidate();
                            return;
                        default:
                            this.f38689b.invalidate();
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
        int i9;
        float f11;
        float f12;
        float alpha = 1.0f - this.f39022b[2].getAlpha();
        if (this.f39024e == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f39027r.d(f10, false);
        Float f13 = this.f39024e;
        if (f13 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f13.floatValue();
        }
        org.telegram.ui.Components.y5 y5Var = this.h;
        float d9 = y5Var.d(floatValue, false);
        Float f14 = this.f39025f;
        if (f14 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f14.floatValue();
        }
        float d10 = this.f39026n.d(floatValue2, false);
        int i10 = org.telegram.ui.ActionBar.f6.f23388z8;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        Paint paint = this.f39028s;
        paint.setColor(w02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = AndroidUtilities.rectTmp;
        RectF rectF3 = this.f39023c;
        float f15 = 1.0f - d;
        rectF2.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d10) * f15) + rectF3.left, (Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d9) * f15) + rectF3.left) + AndroidUtilities.dp(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > AndroidUtilities.dp(3.0f)) {
            rectF = rectF3;
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, d)), AndroidUtilities.dp(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.p80 p80Var = this.d;
        p80Var.d(rectF);
        p80Var.setAlpha((int) (255.0f * alpha * d));
        p80Var.draw(canvas);
        int i11 = org.telegram.ui.ActionBar.f6.f23074h7;
        int d11 = i0.a.d(0.75f, org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        Paint paint2 = this.f39029w;
        paint2.setColor(d11);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d9) * f15) + rectF.left + AndroidUtilities.dp(1.0f), rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f15) + rectF.left, rectF.bottom);
        if (rectF2.width() > AndroidUtilities.dp(3.0f)) {
            float dp = AndroidUtilities.dp(1.0f);
            if (d10 > 0.97f) {
                f12 = 2.0f;
            } else {
                f12 = 1.0f;
            }
            float dp2 = AndroidUtilities.dp(f12);
            i9 = i11;
            a(dp, dp2, canvas, paint2, rectF2);
        } else {
            i9 = i11;
        }
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        Paint paint3 = this.v;
        paint3.setColor(w03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f16 = rectF.left;
        rectF2.set(f16, rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d9) * f15) + f16, rectF.bottom);
        float dp3 = AndroidUtilities.dp(2.0f);
        if (d9 > 0.97f) {
            f11 = 2.0f;
        } else {
            f11 = 1.0f;
        }
        a(dp3, AndroidUtilities.dp(f11), canvas, paint3, rectF2);
        if (d > 0.0f || y5Var.f34858i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        int min = (int) Math.min(AndroidUtilities.dp(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
        int dp = AndroidUtilities.dp(72.0f);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.f39022b;
            if (i12 < textViewArr.length) {
                int measuredHeight = textViewArr[i12].getMeasuredHeight();
                if (i12 == 2) {
                    i11 = AndroidUtilities.dp(16.0f);
                } else {
                    i11 = 0;
                }
                i13 = Math.max(i13, measuredHeight - i11);
                i12++;
            } else {
                int i14 = dp + i13;
                setMeasuredDimension(size, i14);
                this.f39023c.set((size - min) / 2.0f, i14 - AndroidUtilities.dp(30.0f), (size + min) / 2.0f, i14 - AndroidUtilities.dp(26.0f));
                return;
            }
        }
    }
}
