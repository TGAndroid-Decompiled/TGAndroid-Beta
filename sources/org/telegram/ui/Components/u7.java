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
public abstract class u7 extends FrameLayout {
    public final TextView[] f38663a;
    public final float[] f38664b;
    public final int f38665c;
    public final Matrix d;
    public final Paint f38666e;
    public final Paint f38667f;
    public int h;
    public AnimatorSet f38668n;
    public LinearGradient f38669r;
    public int f38670s;
    public final RectF f38671w;
    public int f38672x;
    public boolean f38673y;

    public u7(Context context) {
        super(context);
        this.f38663a = new TextView[2];
        this.f38664b = new float[]{0.0f, 0.75f};
        this.f38665c = org.telegram.messenger.g0.L(24.0f);
        this.f38670s = -1;
        this.f38671w = new RectF();
        for (int i3 = 0; i3 < 2; i3++) {
            this.f38663a[i3] = a();
            if (i3 == 1) {
                this.f38663a[i3].setAlpha(0.0f);
                this.f38663a[i3].setVisibility(8);
            }
            addView(this.f38663a[i3], b8.mf.c(-1.0f, -2));
        }
        this.d = new Matrix();
        Paint paint = new Paint(1);
        this.f38666e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f38667f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public abstract TextView a();

    public final void b(CharSequence charSequence, boolean z10) {
        final int i3;
        int i10 = this.h;
        TextView[] textViewArr = this.f38663a;
        CharSequence text = textViewArr[i10].getText();
        if (!TextUtils.isEmpty(text) && z10) {
            if (TextUtils.equals(charSequence, text)) {
                return;
            }
            this.f38670s = 0;
            int min = Math.min(charSequence.length(), text.length());
            for (int i11 = 0; i11 < min && charSequence.charAt(i11) == text.charAt(i11); i11++) {
                this.f38670s++;
            }
            if (this.f38670s <= 3) {
                this.f38670s = -1;
            }
            final int i12 = this.h;
            if (i12 == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.h = i3;
            AnimatorSet animatorSet = this.f38668n;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f38668n = animatorSet2;
            animatorSet2.addListener(new ii.m2(this, i12, 8));
            textViewArr[i3].setText(charSequence);
            textViewArr[i3].bringToFront();
            textViewArr[i3].setVisibility(0);
            float[] fArr = this.f38664b;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i12], 0.75f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final u7 f38319b;

                {
                    this.f38319b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            u7 u7Var = this.f38319b;
                            u7Var.f38664b[i12] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            u7Var.invalidate();
                            return;
                        default:
                            u7 u7Var2 = this.f38319b;
                            u7Var2.f38664b[i12] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            u7Var2.invalidate();
                            return;
                    }
                }
            });
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr[i3], 0.0f);
            ofFloat2.setStartDelay(100L);
            ofFloat2.setDuration(200L);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final u7 f38319b;

                {
                    this.f38319b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            u7 u7Var = this.f38319b;
                            u7Var.f38664b[i3] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            u7Var.invalidate();
                            return;
                        default:
                            u7 u7Var2 = this.f38319b;
                            u7Var2.f38664b[i3] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            u7Var2.invalidate();
                            return;
                    }
                }
            });
            Property property = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[i12], property, 0.0f);
            ofFloat3.setStartDelay(75L);
            ofFloat3.setDuration(150L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[i3], property, 1.0f);
            ofFloat4.setStartDelay(75L);
            ofFloat4.setDuration(150L);
            this.f38668n.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.f38668n.start();
            return;
        }
        textViewArr[this.h].setText(charSequence);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i3;
        boolean z10;
        Canvas canvas2;
        TextView[] textViewArr = this.f38663a;
        boolean z11 = true;
        if (view == textViewArr[0]) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (this.f38673y) {
            this.f38670s = -1;
        }
        if (this.f38670s > 0) {
            int length = textViewArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                TextView textView = textViewArr[i10];
                if ((textView instanceof l80) && ((l80) textView).d) {
                    this.f38670s = -1;
                    break;
                }
                i10++;
            }
        }
        int i11 = this.f38670s;
        RectF rectF = this.f38671w;
        if (i11 > 0 && textViewArr[this.h].getAlpha() != 1.0f && textViewArr[this.h].getLayout() != null) {
            float primaryHorizontal = textViewArr[this.h].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h].getLayout().getPrimaryHorizontal(this.f38670s);
            if (primaryHorizontal == primaryHorizontal2) {
                z11 = false;
            } else if (primaryHorizontal2 > primaryHorizontal) {
                rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
            } else {
                rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
            }
            if (z11 && i3 == this.h) {
                canvas.save();
                canvas.clipRect(rectF);
                textViewArr[0].draw(canvas);
                canvas.restore();
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        float[] fArr = this.f38664b;
        if (fArr[i3] <= 0.0f && !z10) {
            return super.drawChild(canvas, view, j10);
        }
        float min = Math.min(view.getWidth(), getWidth());
        float min2 = Math.min(view.getHeight(), getHeight());
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, min, min2, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        float f10 = (1.0f - fArr[i3]) * min;
        float f11 = f10 + this.f38665c;
        Matrix matrix = this.d;
        matrix.setTranslate(f10, 0.0f);
        this.f38669r.setLocalMatrix(matrix);
        canvas.drawRect(f10, 0.0f, f11, min2, this.f38666e);
        int i12 = (min > f11 ? 1 : (min == f11 ? 0 : -1));
        Paint paint = this.f38667f;
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
        return this.f38672x;
    }

    public TextView getNextTextView() {
        char c2;
        if (this.h == 0) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        return this.f38663a[c2];
    }

    public TextView getTextView() {
        return this.f38663a[this.h];
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f38673y) {
            int i13 = 0;
            while (true) {
                TextView[] textViewArr = this.f38663a;
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
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        LinearGradient linearGradient = new LinearGradient(this.f38665c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.f38669r = linearGradient;
        this.f38666e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i3) {
        TextView[] textViewArr;
        this.f38672x = i3;
        for (TextView textView : this.f38663a) {
            if (textView instanceof l80) {
                ((l80) textView).setCustomPaddingRight(i3);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
