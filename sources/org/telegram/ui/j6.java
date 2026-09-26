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
public final class j6 extends FrameLayout {
    public final z6 E;
    public final org.telegram.ui.Components.p6 f34648a;
    public final TextView[] f34649b;
    public final RectF f34650c;
    public final org.telegram.ui.Components.r90 d;
    public Float e;
    public Float f34651f;
    public final org.telegram.ui.Components.e6 h;
    public final org.telegram.ui.Components.e6 f34652n;
    public final org.telegram.ui.Components.e6 f34653r;
    public final Paint f34654s;
    public final Paint v;
    public final Paint f34655w;
    public Path f34656x;
    public float[] f34657y;

    public j6(z6 z6Var, Context context) {
        super(context);
        float f7;
        this.E = z6Var;
        this.f34649b = new TextView[3];
        this.f34650c = new RectF();
        this.d = new org.telegram.ui.Components.r90();
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        this.h = new org.telegram.ui.Components.e6(this, 450L, rrVar);
        this.f34652n = new org.telegram.ui.Components.e6(this, 450L, rrVar);
        this.f34653r = new org.telegram.ui.Components.e6(this, 450L, rrVar);
        this.f34654s = new Paint(1);
        this.v = new Paint(1);
        this.f34655w = new Paint(1);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
        this.f34648a = p6Var;
        p6Var.b(0.35f, 350L, rrVar);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(20.0f));
        p6Var.setText(LocaleController.getString(R.string.StorageUsage));
        p6Var.setGravity(17);
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        addView(p6Var, w7.y5.e(-2, 26, 49));
        for (int i10 = 0; i10 < 3; i10++) {
            this.f34649b[i10] = new TextView(context);
            this.f34649b[i10].setTextSize(1, 13.0f);
            this.f34649b[i10].setGravity(17);
            this.f34649b[i10].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            if (i10 == 0) {
                this.f34649b[i10].setText(LocaleController.getString(R.string.StorageUsageCalculating));
            } else if (i10 == 1) {
                this.f34649b[i10].setAlpha(0.0f);
                this.f34649b[i10].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                this.f34649b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.f34649b[i10].setText(LocaleController.getString(R.string.StorageCleared2));
                this.f34649b[i10].setAlpha(0.0f);
                this.f34649b[i10].setVisibility(4);
            }
            this.f34649b[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
            View view = this.f34649b[i10];
            if (i10 == 2) {
                f7 = 12.0f;
            } else {
                f7 = -6.0f;
            }
            addView(view, w7.y5.d(-2, -2.0f, 17, 0.0f, f7, 0.0f, 0.0f));
        }
        this.d.e(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19463z8, false), org.telegram.ui.ActionBar.h6.l1(0.2f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false)));
        this.d.j(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f34656x;
        if (path == null) {
            this.f34656x = new Path();
        } else {
            path.rewind();
        }
        if (this.f34657y == null) {
            this.f34657y = new float[8];
        }
        float[] fArr = this.f34657y;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        this.f34656x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f34656x, paint);
    }

    public final void b(float f7, float f10, boolean z10) {
        String string;
        if (z10) {
            string = LocaleController.getString(R.string.StorageUsage);
        } else {
            string = LocaleController.getString(R.string.StorageCleared);
        }
        this.f34648a.setText(string);
        if (z10) {
            z6 z6Var = this.E;
            TextView[] textViewArr = this.f34649b;
            if (f7 < 0.01f) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, z6.c0(z6Var, f7)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, z6.c0(z6Var, f7)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f7);
        this.f34651f = Float.valueOf(f10);
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
        TextView[] textViewArr = this.f34649b;
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
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final j6 f34419b;

                {
                    this.f34419b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f34419b.invalidate();
                            return;
                        default:
                            this.f34419b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new org.telegram.ui.Components.ca(textView)).setInterpolator(org.telegram.ui.Components.rr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final j6 f34419b;

                {
                    this.f34419b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f34419b.invalidate();
                            return;
                        default:
                            this.f34419b.invalidate();
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
        float alpha = 1.0f - this.f34649b[2].getAlpha();
        if (this.e == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f34653r.d(f7, false);
        Float f12 = this.e;
        if (f12 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f12.floatValue();
        }
        org.telegram.ui.Components.e6 e6Var = this.h;
        float d10 = e6Var.d(floatValue, false);
        Float f13 = this.f34651f;
        if (f13 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f13.floatValue();
        }
        float d11 = this.f34652n.d(floatValue2, false);
        int i11 = org.telegram.ui.ActionBar.h6.f19463z8;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        Paint paint = this.f34654s;
        paint.setColor(w02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = AndroidUtilities.rectTmp;
        RectF rectF3 = this.f34650c;
        float f14 = 1.0f - d;
        rectF2.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d11) * f14) + rectF3.left, (Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d10) * f14) + rectF3.left) + AndroidUtilities.dp(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > AndroidUtilities.dp(3.0f)) {
            rectF = rectF3;
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, d)), AndroidUtilities.dp(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.r90 r90Var = this.d;
        r90Var.d(rectF);
        r90Var.setAlpha((int) (255.0f * alpha * d));
        r90Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.h6.f19131h7;
        int d12 = i0.a.d(0.75f, org.telegram.ui.ActionBar.h6.w0(null, i12, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        Paint paint2 = this.f34655w;
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
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        Paint paint3 = this.v;
        paint3.setColor(w03);
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
        if (d > 0.0f || e6Var.f23847i) {
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
            TextView[] textViewArr = this.f34649b;
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
                this.f34650c.set((size - min) / 2.0f, i15 - AndroidUtilities.dp(30.0f), (size + min) / 2.0f, i15 - AndroidUtilities.dp(26.0f));
                return;
            }
        }
    }
}
