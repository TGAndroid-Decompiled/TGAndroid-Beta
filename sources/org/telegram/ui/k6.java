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

public final class k6 extends FrameLayout {
    public final z6 A;

    public final org.telegram.ui.Components.j6 f39611a;

    public final TextView[] f39612b;

    public final RectF f39613c;
    public final org.telegram.ui.Components.t80 d;

    public Float f39614e;

    public Float f39615f;
    public final org.telegram.ui.Components.y5 h;

    public final org.telegram.ui.Components.y5 f39616n;

    public final org.telegram.ui.Components.y5 f39617r;

    public final Paint f39618s;
    public final Paint v;

    public final Paint f39619w;

    public Path f39620x;

    public float[] f39621y;

    public k6(z6 z6Var, Context context) {
        super(context);
        this.A = z6Var;
        this.f39612b = new TextView[3];
        this.f39613c = new RectF();
        this.d = new org.telegram.ui.Components.t80();
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.h = new org.telegram.ui.Components.y5(this, 450L, erVar);
        this.f39616n = new org.telegram.ui.Components.y5(this, 450L, erVar);
        this.f39617r = new org.telegram.ui.Components.y5(this, 450L, erVar);
        this.f39618s = new Paint(1);
        this.v = new Paint(1);
        this.f39619w = new Paint(1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f39611a = j6Var;
        j6Var.b(0.35f, 350L, erVar);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setText(LocaleController.getString(R.string.StorageUsage));
        j6Var.setGravity(17);
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(j6Var, h7.z5.e(-2, 26, 49));
        int i10 = 0;
        while (i10 < 3) {
            this.f39612b[i10] = new TextView(context);
            this.f39612b[i10].setTextSize(1, 13.0f);
            this.f39612b[i10].setGravity(17);
            this.f39612b[i10].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            if (i10 == 0) {
                this.f39612b[i10].setText(LocaleController.getString(R.string.StorageUsageCalculating));
            } else if (i10 == 1) {
                this.f39612b[i10].setAlpha(0.0f);
                this.f39612b[i10].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                this.f39612b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.f39612b[i10].setText(LocaleController.getString(R.string.StorageCleared2));
                this.f39612b[i10].setAlpha(0.0f);
                this.f39612b[i10].setVisibility(4);
            }
            this.f39612b[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            addView(this.f39612b[i10], h7.z5.d(-2, -2.0f, 17, 0.0f, i10 == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i10++;
        }
        this.d.e(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23443z8, false), org.telegram.ui.ActionBar.g6.l1(0.2f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false)));
        this.d.j(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f39620x;
        if (path == null) {
            this.f39620x = new Path();
        } else {
            path.rewind();
        }
        if (this.f39621y == null) {
            this.f39621y = new float[8];
        }
        float[] fArr = this.f39621y;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
        this.f39620x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f39620x, paint);
    }

    public final void b(float f10, float f11, boolean z10) {
        this.f39611a.setText(z10 ? LocaleController.getString(R.string.StorageUsage) : LocaleController.getString(R.string.StorageCleared));
        if (z10) {
            z6 z6Var = this.A;
            TextView[] textViewArr = this.f39612b;
            if (f10 < 0.01f) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, z6.c0(z6Var, f10)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, z6.c0(z6Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.f39614e = Float.valueOf(f10);
        this.f39615f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i10) {
        boolean z10 = System.currentTimeMillis() - this.A.Q > 40;
        TextView[] textViewArr = this.f39612b;
        d(textViewArr[0], i10 == 0, z10);
        d(textViewArr[1], i10 == 1, z10);
        d(textViewArr[2], i10 == 2, z10);
    }

    public final void d(TextView textView, boolean z10, boolean z11) {
        if (textView == null) {
            return;
        }
        if (textView.getParent() == null) {
            z11 = false;
        }
        textView.animate().setListener(null).cancel();
        if (!z11) {
            textView.setVisibility(z10 ? 0 : 4);
            textView.setTag(z10 ? 1 : null);
            textView.setAlpha(z10 ? 1.0f : 0.0f);
            textView.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
            invalidate();
            return;
        }
        if (!z10) {
            final int i10 = 1;
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new go(textView)).setInterpolator(org.telegram.ui.Components.er.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final k6 f39268b;

                {
                    this.f39268b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            this.f39268b.invalidate();
                            break;
                        default:
                            this.f39268b.invalidate();
                            break;
                    }
                }
            }).start();
            return;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
            textView.setTranslationY(AndroidUtilities.dp(8.0f));
        }
        final int i11 = 0;
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.er.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final k6 f39268b;

            {
                this.f39268b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        this.f39268b.invalidate();
                        break;
                    default:
                        this.f39268b.invalidate();
                        break;
                }
            }
        }).start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float alpha = 1.0f - this.f39612b[2].getAlpha();
        float fD = this.f39617r.d(this.f39614e == null ? 1.0f : 0.0f, false);
        Float f10 = this.f39614e;
        float fFloatValue = f10 == null ? 0.0f : f10.floatValue();
        org.telegram.ui.Components.y5 y5Var = this.h;
        float fD2 = y5Var.d(fFloatValue, false);
        Float f11 = this.f39615f;
        float fD3 = this.f39616n.d(f11 == null ? 0.0f : f11.floatValue(), false);
        int i10 = org.telegram.ui.ActionBar.g6.f23443z8;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        Paint paint = this.f39618s;
        paint.setColor(iW0);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF = AndroidUtilities.rectTmp;
        RectF rectF2 = this.f39613c;
        float f12 = 1.0f - fD;
        rectF.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * fD3) * f12) + rectF2.left, (Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * fD2) * f12) + rectF2.left) + AndroidUtilities.dp(1.0f), rectF2.top, rectF2.right, rectF2.bottom);
        if (rectF.left < rectF.right && rectF.width() > AndroidUtilities.dp(3.0f)) {
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, fD)), AndroidUtilities.dp(2.0f), canvas, paint, rectF);
        }
        org.telegram.ui.Components.t80 t80Var = this.d;
        t80Var.d(rectF2);
        t80Var.setAlpha((int) (255.0f * alpha * fD));
        t80Var.draw(canvas);
        int i11 = org.telegram.ui.ActionBar.g6.f23126h7;
        int iD = i0.b.d(0.75f, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        Paint paint2 = this.f39619w;
        paint2.setColor(iD);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF.set((Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * fD2) * f12) + rectF2.left + AndroidUtilities.dp(1.0f), rectF2.top, (Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * fD3) * f12) + rectF2.left, rectF2.bottom);
        if (rectF.width() > AndroidUtilities.dp(3.0f)) {
            a(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(fD3 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF);
        }
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        Paint paint3 = this.v;
        paint3.setColor(iW1);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f13 = rectF2.left;
        rectF.set(f13, rectF2.top, (Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * fD2) * f12) + f13, rectF2.bottom);
        a(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(fD2 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF);
        if (fD > 0.0f || y5Var.f34816i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iMin = (int) Math.min(AndroidUtilities.dp(174.0f), ((double) size) * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
        int iDp = AndroidUtilities.dp(72.0f);
        int i12 = 0;
        int iMax = 0;
        while (true) {
            TextView[] textViewArr = this.f39612b;
            if (i12 >= textViewArr.length) {
                int i13 = iDp + iMax;
                setMeasuredDimension(size, i13);
                this.f39613c.set((size - iMin) / 2.0f, i13 - AndroidUtilities.dp(30.0f), (size + iMin) / 2.0f, i13 - AndroidUtilities.dp(26.0f));
                return;
            }
            iMax = Math.max(iMax, textViewArr[i12].getMeasuredHeight() - (i12 == 2 ? AndroidUtilities.dp(16.0f) : 0));
            i12++;
        }
    }
}
