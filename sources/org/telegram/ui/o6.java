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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o6 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final c7 E;
    public final org.telegram.ui.Components.s6 f41984a;
    public final TextView[] f41985b;
    public final RectF f41986c;
    public final org.telegram.ui.Components.ea0 d;
    public Float e;
    public Float f41987f;
    public final org.telegram.ui.Components.h6 h;
    public final org.telegram.ui.Components.h6 f41988n;
    public final org.telegram.ui.Components.h6 f41989r;
    public final Paint f41990s;
    public final Paint v;
    public final Paint f41991w;
    public Path f41992x;
    public float[] f41993y;

    public o6(c7 c7Var, Context context) {
        super(context);
        float f7;
        this.E = c7Var;
        this.f41985b = new TextView[3];
        this.f41986c = new RectF();
        this.d = new org.telegram.ui.Components.ea0();
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.h = new org.telegram.ui.Components.h6(this, 450L, dsVar);
        this.f41988n = new org.telegram.ui.Components.h6(this, 450L, dsVar);
        this.f41989r = new org.telegram.ui.Components.h6(this, 450L, dsVar);
        this.f41990s = new Paint(1);
        this.v = new Paint(1);
        this.f41991w = new Paint(1);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f41984a = s6Var;
        s6Var.b(0.35f, 350L, dsVar);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(20.0f));
        s6Var.setText(LocaleController.getString(R.string.StorageUsage));
        s6Var.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(s6Var, org.telegram.ui.ActionBar.y6.G6, null);
        addView(s6Var, org.telegram.ui.Components.kb1.i(-2, 26, 49));
        for (int i10 = 0; i10 < 3; i10++) {
            this.f41985b[i10] = new TextView(context);
            this.f41985b[i10].setTextSize(1, 13.0f);
            this.f41985b[i10].setGravity(17);
            this.f41985b[i10].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            if (i10 == 0) {
                this.f41985b[i10].setText(LocaleController.getString(R.string.StorageUsageCalculating));
            } else if (i10 == 1) {
                this.f41985b[i10].setAlpha(0.0f);
                this.f41985b[i10].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                this.f41985b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.f41985b[i10].setText(LocaleController.getString(R.string.StorageCleared2));
                this.f41985b[i10].setAlpha(0.0f);
                this.f41985b[i10].setVisibility(4);
            }
            org.telegram.ui.ActionBar.f7.V(this.f41985b[i10], org.telegram.ui.ActionBar.y6.B6, null);
            View view = this.f41985b[i10];
            if (i10 == 2) {
                f7 = 12.0f;
            } else {
                f7 = -6.0f;
            }
            addView(view, org.telegram.ui.Components.kb1.h(-2, -2.0f, 17, 0.0f, f7, 0.0f, 0.0f));
        }
        this.d.f(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23770z8, false), org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f41992x;
        if (path == null) {
            this.f41992x = new Path();
        } else {
            path.rewind();
        }
        if (this.f41993y == null) {
            this.f41993y = new float[8];
        }
        float[] fArr = this.f41993y;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        this.f41992x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f41992x, paint);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23770z8));
    }

    public final void b(float f7, float f10, boolean z10) {
        String string;
        if (z10) {
            string = LocaleController.getString(R.string.StorageUsage);
        } else {
            string = LocaleController.getString(R.string.StorageCleared);
        }
        this.f41984a.setText(string);
        if (z10) {
            int i10 = (f7 > 0.01f ? 1 : (f7 == 0.01f ? 0 : -1));
            c7 c7Var = this.E;
            TextView[] textViewArr = this.f41985b;
            if (i10 < 0) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, c7.f0(c7Var, f7)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, c7.f0(c7Var, f7)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f7);
        this.f41987f = Float.valueOf(f10);
        invalidate();
    }

    public final void c(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (System.currentTimeMillis() - this.E.f38189a0 > 40) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView[] textViewArr = this.f41985b;
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
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o6 f41639b;

                {
                    this.f41639b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f41639b.invalidate();
                            return;
                        default:
                            this.f41639b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new lo(textView)).setInterpolator(org.telegram.ui.Components.ds.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o6 f41639b;

                {
                    this.f41639b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f41639b.invalidate();
                            return;
                        default:
                            this.f41639b.invalidate();
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
        float alpha = 1.0f - this.f41985b[2].getAlpha();
        if (this.e == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f41989r.d(f7, false);
        Float f12 = this.e;
        if (f12 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f12.floatValue();
        }
        org.telegram.ui.Components.h6 h6Var = this.h;
        float d10 = h6Var.d(floatValue, false);
        Float f13 = this.f41987f;
        if (f13 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f13.floatValue();
        }
        float d11 = this.f41988n.d(floatValue2, false);
        int i11 = org.telegram.ui.ActionBar.y6.f23770z8;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        Paint paint = this.f41990s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = AndroidUtilities.rectTmp;
        RectF rectF3 = this.f41986c;
        float f14 = 1.0f - d;
        rectF2.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d11) * f14) + rectF3.left, (Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d10) * f14) + rectF3.left) + AndroidUtilities.dp(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > AndroidUtilities.dp(3.0f)) {
            rectF = rectF3;
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, d)), AndroidUtilities.dp(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.ea0 ea0Var = this.d;
        ea0Var.e(rectF);
        ea0Var.setAlpha((int) (255.0f * alpha * d));
        ea0Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.y6.f23430h7;
        int f15 = i0.a.f(0.75f, org.telegram.ui.ActionBar.y6.x0(null, i12, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        Paint paint2 = this.f41991w;
        paint2.setColor(f15);
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
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        Paint paint3 = this.v;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f16 = rectF.left;
        rectF2.set(f16, rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f14) + f16, rectF.bottom);
        float dp3 = AndroidUtilities.dp(2.0f);
        if (d10 > 0.97f) {
            f10 = 2.0f;
        } else {
            f10 = 1.0f;
        }
        a(dp3, AndroidUtilities.dp(f10), canvas, paint3, rectF2);
        if (d > 0.0f || h6Var.f28867i) {
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
            TextView[] textViewArr = this.f41985b;
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
                this.f41986c.set((size - min) / 2.0f, i12 - AndroidUtilities.dp(30.0f), (size + min) / 2.0f, i12 - AndroidUtilities.dp(26.0f));
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.ea0 ea0Var = this.d;
            if (ea0Var != null) {
                ea0Var.f(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23770z8, false), org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B6, false)));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
