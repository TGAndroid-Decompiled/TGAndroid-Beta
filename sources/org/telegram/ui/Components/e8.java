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
public abstract class e8 extends FrameLayout {
    public final TextView[] f25590a;
    public final float[] f25591b;
    public final int f25592c;
    public final Matrix d;
    public final Paint f25593e;
    public final Paint f25594f;
    public int h;
    public AnimatorSet f25595n;
    public LinearGradient f25596r;
    public int f25597s;
    public final RectF v;
    public int f25598w;
    public boolean f25599x;

    public e8(Context context) {
        super(context);
        this.f25590a = new TextView[2];
        this.f25591b = new float[]{0.0f, 0.75f};
        this.f25592c = AndroidUtilities.dp(24.0f);
        this.f25597s = -1;
        this.v = new RectF();
        for (int i10 = 0; i10 < 2; i10++) {
            this.f25590a[i10] = a();
            if (i10 == 1) {
                this.f25590a[i10].setAlpha(0.0f);
                this.f25590a[i10].setVisibility(8);
            }
            addView(this.f25590a[i10], w7.x5.c(-1.0f, -2));
        }
        this.d = new Matrix();
        Paint paint = new Paint(1);
        this.f25593e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f25594f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public abstract TextView a();

    public final void b(CharSequence charSequence, boolean z10) {
        final int i10;
        int i11 = this.h;
        TextView[] textViewArr = this.f25590a;
        CharSequence text = textViewArr[i11].getText();
        if (!TextUtils.isEmpty(text) && z10) {
            if (TextUtils.equals(charSequence, text)) {
                return;
            }
            this.f25597s = 0;
            int min = Math.min(charSequence.length(), text.length());
            for (int i12 = 0; i12 < min && charSequence.charAt(i12) == text.charAt(i12); i12++) {
                this.f25597s++;
            }
            if (this.f25597s <= 3) {
                this.f25597s = -1;
            }
            final int i13 = this.h;
            if (i13 == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.h = i10;
            AnimatorSet animatorSet = this.f25595n;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25595n = animatorSet2;
            animatorSet2.addListener(new fi.v2(this, i13, 5));
            textViewArr[i10].setText(charSequence);
            textViewArr[i10].bringToFront();
            textViewArr[i10].setVisibility(0);
            float[] fArr = this.f25591b;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i13], 0.75f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final e8 f25289b;

                {
                    this.f25289b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            e8 e8Var = this.f25289b;
                            e8Var.f25591b[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            e8Var.invalidate();
                            return;
                        default:
                            e8 e8Var2 = this.f25289b;
                            e8Var2.f25591b[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            e8Var2.invalidate();
                            return;
                    }
                }
            });
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr[i10], 0.0f);
            ofFloat2.setStartDelay(100L);
            ofFloat2.setDuration(200L);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final e8 f25289b;

                {
                    this.f25289b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            e8 e8Var = this.f25289b;
                            e8Var.f25591b[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            e8Var.invalidate();
                            return;
                        default:
                            e8 e8Var2 = this.f25289b;
                            e8Var2.f25591b[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            e8Var2.invalidate();
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
            this.f25595n.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.f25595n.start();
            return;
        }
        textViewArr[this.h].setText(charSequence);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        boolean z10;
        Canvas canvas2;
        TextView[] textViewArr = this.f25590a;
        boolean z11 = true;
        if (view == textViewArr[0]) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (this.f25599x) {
            this.f25597s = -1;
        }
        if (this.f25597s > 0) {
            int length = textViewArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                TextView textView = textViewArr[i11];
                if ((textView instanceof s90) && ((s90) textView).d) {
                    this.f25597s = -1;
                    break;
                }
                i11++;
            }
        }
        int i12 = this.f25597s;
        RectF rectF = this.v;
        if (i12 > 0 && textViewArr[this.h].getAlpha() != 1.0f && textViewArr[this.h].getLayout() != null) {
            float primaryHorizontal = textViewArr[this.h].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h].getLayout().getPrimaryHorizontal(this.f25597s);
            if (primaryHorizontal == primaryHorizontal2) {
                z11 = false;
            } else if (primaryHorizontal2 > primaryHorizontal) {
                rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
            } else {
                rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
            }
            if (z11 && i10 == this.h) {
                canvas.save();
                canvas.clipRect(rectF);
                textViewArr[0].draw(canvas);
                canvas.restore();
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        float[] fArr = this.f25591b;
        if (fArr[i10] <= 0.0f && !z10) {
            return super.drawChild(canvas, view, j3);
        }
        float min = Math.min(view.getWidth(), getWidth());
        float min2 = Math.min(view.getHeight(), getHeight());
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, min, min2, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        float f7 = (1.0f - fArr[i10]) * min;
        float f10 = f7 + this.f25592c;
        Matrix matrix = this.d;
        matrix.setTranslate(f7, 0.0f);
        this.f25596r.setLocalMatrix(matrix);
        canvas.drawRect(f7, 0.0f, f10, min2, this.f25593e);
        Paint paint = this.f25594f;
        if (min > f10) {
            canvas2 = canvas;
            canvas2.drawRect(f10, 0.0f, min, min2, paint);
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
        return this.f25598w;
    }

    public TextView getNextTextView() {
        char c10;
        if (this.h == 0) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return this.f25590a[c10];
    }

    public TextView getTextView() {
        return this.f25590a[this.h];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f25599x) {
            int i14 = 0;
            while (true) {
                TextView[] textViewArr = this.f25590a;
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
        LinearGradient linearGradient = new LinearGradient(this.f25592c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.f25596r = linearGradient;
        this.f25593e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i10) {
        TextView[] textViewArr;
        this.f25598w = i10;
        for (TextView textView : this.f25590a) {
            if (textView instanceof s90) {
                ((s90) textView).setCustomPaddingRight(i10);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
