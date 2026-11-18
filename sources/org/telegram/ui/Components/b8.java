package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public abstract class b8 extends FrameLayout {
    public final TextView[] f33576a;
    public final float[] f33577b;
    public final int f33578c;
    public final Matrix d;
    public final Paint f33579e;
    public final Paint f33580f;
    public int h;
    public AnimatorSet f33581n;
    public LinearGradient f33582r;
    public int f33583s;
    public final RectF f33584w;
    public int f33585x;
    public boolean f33586y;

    public b8(Context context) {
        super(context);
        this.f33576a = new TextView[2];
        this.f33577b = new float[]{0.0f, 0.75f};
        this.f33578c = org.telegram.messenger.g0.L(24.0f);
        this.f33583s = -1;
        this.f33584w = new RectF();
        for (int i7 = 0; i7 < 2; i7++) {
            this.f33576a[i7] = a();
            if (i7 == 1) {
                this.f33576a[i7].setAlpha(0.0f);
                this.f33576a[i7].setVisibility(8);
            }
            addView(this.f33576a[i7], c8.ma.c(-1.0f, -2));
        }
        this.d = new Matrix();
        Paint paint = new Paint(1);
        this.f33579e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f33580f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public abstract TextView a();

    public final void b(CharSequence charSequence, boolean z10) {
        final int i7;
        int i10 = this.h;
        TextView[] textViewArr = this.f33576a;
        CharSequence text = textViewArr[i10].getText();
        if (!TextUtils.isEmpty(text) && z10) {
            if (TextUtils.equals(charSequence, text)) {
                return;
            }
            this.f33583s = 0;
            int min = Math.min(charSequence.length(), text.length());
            for (int i11 = 0; i11 < min && charSequence.charAt(i11) == text.charAt(i11); i11++) {
                this.f33583s++;
            }
            if (this.f33583s <= 3) {
                this.f33583s = -1;
            }
            final int i12 = this.h;
            if (i12 == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            this.h = i7;
            AnimatorSet animatorSet = this.f33581n;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33581n = animatorSet2;
            animatorSet2.addListener(new ki.f2(this, i12, 8));
            textViewArr[i7].setText(charSequence);
            textViewArr[i7].bringToFront();
            textViewArr[i7].setVisibility(0);
            float[] fArr = this.f33577b;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i12], 0.75f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final b8 f33260b;

                {
                    this.f33260b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            b8 b8Var = this.f33260b;
                            b8Var.f33577b[i12] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b8Var.invalidate();
                            return;
                        default:
                            b8 b8Var2 = this.f33260b;
                            b8Var2.f33577b[i12] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b8Var2.invalidate();
                            return;
                    }
                }
            });
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr[i7], 0.0f);
            ofFloat2.setStartDelay(100L);
            ofFloat2.setDuration(200L);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final b8 f33260b;

                {
                    this.f33260b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            b8 b8Var = this.f33260b;
                            b8Var.f33577b[i7] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b8Var.invalidate();
                            return;
                        default:
                            b8 b8Var2 = this.f33260b;
                            b8Var2.f33577b[i7] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b8Var2.invalidate();
                            return;
                    }
                }
            });
            Property property = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[i12], property, 0.0f);
            ofFloat3.setStartDelay(75L);
            ofFloat3.setDuration(150L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[i7], property, 1.0f);
            ofFloat4.setStartDelay(75L);
            ofFloat4.setDuration(150L);
            this.f33581n.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.f33581n.start();
            return;
        }
        textViewArr[this.h].setText(charSequence);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        boolean z10;
        Canvas canvas2;
        TextView[] textViewArr = this.f33576a;
        boolean z11 = true;
        if (view == textViewArr[0]) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (this.f33586y) {
            this.f33583s = -1;
        }
        if (this.f33583s > 0) {
            int length = textViewArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                TextView textView = textViewArr[i10];
                if ((textView instanceof c90) && ((c90) textView).d) {
                    this.f33583s = -1;
                    break;
                }
                i10++;
            }
        }
        int i11 = this.f33583s;
        RectF rectF = this.f33584w;
        if (i11 > 0 && textViewArr[this.h].getAlpha() != 1.0f && textViewArr[this.h].getLayout() != null) {
            float primaryHorizontal = textViewArr[this.h].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h].getLayout().getPrimaryHorizontal(this.f33583s);
            if (primaryHorizontal == primaryHorizontal2) {
                z11 = false;
            } else if (primaryHorizontal2 > primaryHorizontal) {
                rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
            } else {
                rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
            }
            if (z11 && i7 == this.h) {
                canvas.save();
                canvas.clipRect(rectF);
                textViewArr[0].draw(canvas);
                canvas.restore();
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        float[] fArr = this.f33577b;
        if (fArr[i7] <= 0.0f && !z10) {
            return super.drawChild(canvas, view, j3);
        }
        float min = Math.min(view.getWidth(), getWidth());
        float min2 = Math.min(view.getHeight(), getHeight());
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, min, min2, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        float f10 = (1.0f - fArr[i7]) * min;
        float f11 = f10 + this.f33578c;
        Matrix matrix = this.d;
        matrix.setTranslate(f10, 0.0f);
        this.f33582r.setLocalMatrix(matrix);
        canvas.drawRect(f10, 0.0f, f11, min2, this.f33579e);
        int i12 = (min > f11 ? 1 : (min == f11 ? 0 : -1));
        Paint paint = this.f33580f;
        if (i12 > 0) {
            canvas2 = canvas;
            canvas2.drawRect(f11, 0.0f, min, min2, paint);
        } else {
            canvas2 = canvas;
        }
        if (z10) {
            canvas2.drawRect(rectF, paint);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    public int getCustomPaddingRight() {
        return this.f33585x;
    }

    public TextView getNextTextView() {
        char c10;
        if (this.h == 0) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return this.f33576a[c10];
    }

    public TextView getTextView() {
        return this.f33576a[this.h];
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f33586y) {
            int i13 = 0;
            while (true) {
                TextView[] textViewArr = this.f33576a;
                if (i13 < textViewArr.length) {
                    TextView textView = textViewArr[i13];
                    if (textView != null && textView.getMeasuredWidth() < getMeasuredWidth()) {
                        int measuredWidth = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
                        textView.layout(measuredWidth, 0, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight());
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        LinearGradient linearGradient = new LinearGradient(this.f33578c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.f33582r = linearGradient;
        this.f33579e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i7) {
        TextView[] textViewArr;
        this.f33585x = i7;
        for (TextView textView : this.f33576a) {
            if (textView instanceof c90) {
                ((c90) textView).setCustomPaddingRight(i7);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
