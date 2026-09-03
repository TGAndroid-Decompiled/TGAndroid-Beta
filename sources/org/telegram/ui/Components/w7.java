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
import org.telegram.messenger.AndroidUtilities;
public abstract class w7 extends FrameLayout {
    public final TextView[] f32658a;
    public final float[] f32659b;
    public final int f32660c;
    public final Matrix d;
    public final Paint f32661e;
    public final Paint f32662f;
    public int h;
    public AnimatorSet f32663n;
    public LinearGradient f32664r;
    public int f32665s;
    public final RectF v;
    public int f32666w;
    public boolean f32667x;

    public w7(Context context) {
        super(context);
        this.f32658a = new TextView[2];
        this.f32659b = new float[]{0.0f, 0.75f};
        this.f32660c = AndroidUtilities.dp(24.0f);
        this.f32665s = -1;
        this.v = new RectF();
        for (int i10 = 0; i10 < 2; i10++) {
            this.f32658a[i10] = a();
            if (i10 == 1) {
                this.f32658a[i10].setAlpha(0.0f);
                this.f32658a[i10].setVisibility(8);
            }
            addView(this.f32658a[i10], k7.c6.c(-1.0f, -2));
        }
        this.d = new Matrix();
        Paint paint = new Paint(1);
        this.f32661e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f32662f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public abstract TextView a();

    public final void b(CharSequence charSequence, boolean z4) {
        final int i10;
        int i11 = this.h;
        TextView[] textViewArr = this.f32658a;
        CharSequence text = textViewArr[i11].getText();
        if (!TextUtils.isEmpty(text) && z4) {
            if (TextUtils.equals(charSequence, text)) {
                return;
            }
            this.f32665s = 0;
            int min = Math.min(charSequence.length(), text.length());
            for (int i12 = 0; i12 < min && charSequence.charAt(i12) == text.charAt(i12); i12++) {
                this.f32665s++;
            }
            if (this.f32665s <= 3) {
                this.f32665s = -1;
            }
            final int i13 = this.h;
            if (i13 == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.h = i10;
            AnimatorSet animatorSet = this.f32663n;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32663n = animatorSet2;
            animatorSet2.addListener(new org.telegram.ui.Cells.b4(this, i13, 2));
            textViewArr[i10].setText(charSequence);
            textViewArr[i10].bringToFront();
            textViewArr[i10].setVisibility(0);
            float[] fArr = this.f32659b;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i13], 0.75f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w7 f31813b;

                {
                    this.f31813b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            w7 w7Var = this.f31813b;
                            w7Var.f32659b[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var.invalidate();
                            return;
                        default:
                            w7 w7Var2 = this.f31813b;
                            w7Var2.f32659b[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var2.invalidate();
                            return;
                    }
                }
            });
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr[i10], 0.0f);
            ofFloat2.setStartDelay(100L);
            ofFloat2.setDuration(200L);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w7 f31813b;

                {
                    this.f31813b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            w7 w7Var = this.f31813b;
                            w7Var.f32659b[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var.invalidate();
                            return;
                        default:
                            w7 w7Var2 = this.f31813b;
                            w7Var2.f32659b[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var2.invalidate();
                            return;
                    }
                }
            });
            Property property = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[i13], property, 0.0f);
            ofFloat3.setStartDelay(75L);
            ofFloat3.setDuration(150L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[i10], property, 1.0f);
            ofFloat4.setStartDelay(75L);
            ofFloat4.setDuration(150L);
            this.f32663n.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.f32663n.start();
            return;
        }
        textViewArr[this.h].setText(charSequence);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        boolean z4;
        Canvas canvas2;
        TextView[] textViewArr = this.f32658a;
        boolean z10 = true;
        if (view == textViewArr[0]) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (this.f32667x) {
            this.f32665s = -1;
        }
        if (this.f32665s > 0) {
            int length = textViewArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                TextView textView = textViewArr[i11];
                if ((textView instanceof v90) && ((v90) textView).d) {
                    this.f32665s = -1;
                    break;
                }
                i11++;
            }
        }
        int i12 = this.f32665s;
        RectF rectF = this.v;
        if (i12 > 0 && textViewArr[this.h].getAlpha() != 1.0f && textViewArr[this.h].getLayout() != null) {
            float primaryHorizontal = textViewArr[this.h].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h].getLayout().getPrimaryHorizontal(this.f32665s);
            if (primaryHorizontal == primaryHorizontal2) {
                z10 = false;
            } else if (primaryHorizontal2 > primaryHorizontal) {
                rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
            } else {
                rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
            }
            if (z10 && i10 == this.h) {
                canvas.save();
                canvas.clipRect(rectF);
                textViewArr[0].draw(canvas);
                canvas.restore();
            }
            z4 = z10;
        } else {
            z4 = false;
        }
        float[] fArr = this.f32659b;
        if (fArr[i10] <= 0.0f && !z4) {
            return super.drawChild(canvas, view, j10);
        }
        float min = Math.min(view.getWidth(), getWidth());
        float min2 = Math.min(view.getHeight(), getHeight());
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, min, min2, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        float f10 = (1.0f - fArr[i10]) * min;
        float f11 = f10 + this.f32660c;
        Matrix matrix = this.d;
        matrix.setTranslate(f10, 0.0f);
        this.f32664r.setLocalMatrix(matrix);
        canvas.drawRect(f10, 0.0f, f11, min2, this.f32661e);
        Paint paint = this.f32662f;
        if (min > f11) {
            canvas2 = canvas;
            canvas2.drawRect(f11, 0.0f, min, min2, paint);
        } else {
            canvas2 = canvas;
        }
        if (z4) {
            canvas2.drawRect(rectF, paint);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    public int getCustomPaddingRight() {
        return this.f32666w;
    }

    public TextView getNextTextView() {
        char c3;
        if (this.h == 0) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        return this.f32658a[c3];
    }

    public TextView getTextView() {
        return this.f32658a[this.h];
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.f32667x) {
            int i14 = 0;
            while (true) {
                TextView[] textViewArr = this.f32658a;
                if (i14 < textViewArr.length) {
                    TextView textView = textViewArr[i14];
                    if (textView != null && textView.getMeasuredWidth() < getMeasuredWidth()) {
                        int measuredWidth = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
                        textView.layout(measuredWidth, 0, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight());
                    }
                    i14++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        LinearGradient linearGradient = new LinearGradient(this.f32660c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.f32664r = linearGradient;
        this.f32661e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i10) {
        TextView[] textViewArr;
        this.f32666w = i10;
        for (TextView textView : this.f32658a) {
            if (textView instanceof v90) {
                ((v90) textView).setCustomPaddingRight(i10);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
