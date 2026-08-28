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
    public final TextView[] f34125a;
    public final float[] f34126b;
    public final int f34127c;
    public final Matrix d;
    public final Paint f34128e;
    public final Paint f34129f;
    public int h;
    public AnimatorSet f34130n;
    public LinearGradient f34131r;
    public int f34132s;
    public final RectF v;
    public int f34133w;
    public boolean f34134x;

    public w7(Context context) {
        super(context);
        this.f34125a = new TextView[2];
        this.f34126b = new float[]{0.0f, 0.75f};
        this.f34127c = AndroidUtilities.dp(24.0f);
        this.f34132s = -1;
        this.v = new RectF();
        for (int i9 = 0; i9 < 2; i9++) {
            this.f34125a[i9] = a();
            if (i9 == 1) {
                this.f34125a[i9].setAlpha(0.0f);
                this.f34125a[i9].setVisibility(8);
            }
            addView(this.f34125a[i9], g7.e6.c(-1.0f, -2));
        }
        this.d = new Matrix();
        Paint paint = new Paint(1);
        this.f34128e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f34129f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public abstract TextView a();

    public final void b(CharSequence charSequence, boolean z10) {
        final int i9;
        int i10 = this.h;
        TextView[] textViewArr = this.f34125a;
        CharSequence text = textViewArr[i10].getText();
        if (!TextUtils.isEmpty(text) && z10) {
            if (TextUtils.equals(charSequence, text)) {
                return;
            }
            this.f34132s = 0;
            int min = Math.min(charSequence.length(), text.length());
            for (int i11 = 0; i11 < min && charSequence.charAt(i11) == text.charAt(i11); i11++) {
                this.f34132s++;
            }
            if (this.f34132s <= 3) {
                this.f34132s = -1;
            }
            final int i12 = this.h;
            if (i12 == 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            this.h = i9;
            AnimatorSet animatorSet = this.f34130n;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34130n = animatorSet2;
            animatorSet2.addListener(new mh.o2(this, i12, 4));
            textViewArr[i9].setText(charSequence);
            textViewArr[i9].bringToFront();
            textViewArr[i9].setVisibility(0);
            float[] fArr = this.f34126b;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i12], 0.75f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w7 f33295b;

                {
                    this.f33295b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            w7 w7Var = this.f33295b;
                            w7Var.f34126b[i12] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var.invalidate();
                            return;
                        default:
                            w7 w7Var2 = this.f33295b;
                            w7Var2.f34126b[i12] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var2.invalidate();
                            return;
                    }
                }
            });
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr[i9], 0.0f);
            ofFloat2.setStartDelay(100L);
            ofFloat2.setDuration(200L);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w7 f33295b;

                {
                    this.f33295b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            w7 w7Var = this.f33295b;
                            w7Var.f34126b[i9] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var.invalidate();
                            return;
                        default:
                            w7 w7Var2 = this.f33295b;
                            w7Var2.f34126b[i9] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            w7Var2.invalidate();
                            return;
                    }
                }
            });
            Property property = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[i12], property, 0.0f);
            ofFloat3.setStartDelay(75L);
            ofFloat3.setDuration(150L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[i9], property, 1.0f);
            ofFloat4.setStartDelay(75L);
            ofFloat4.setDuration(150L);
            this.f34130n.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.f34130n.start();
            return;
        }
        textViewArr[this.h].setText(charSequence);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i9;
        boolean z10;
        Canvas canvas2;
        TextView[] textViewArr = this.f34125a;
        boolean z11 = true;
        if (view == textViewArr[0]) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        if (this.f34134x) {
            this.f34132s = -1;
        }
        if (this.f34132s > 0) {
            int length = textViewArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                TextView textView = textViewArr[i10];
                if ((textView instanceof a90) && ((a90) textView).d) {
                    this.f34132s = -1;
                    break;
                }
                i10++;
            }
        }
        int i11 = this.f34132s;
        RectF rectF = this.v;
        if (i11 > 0 && textViewArr[this.h].getAlpha() != 1.0f && textViewArr[this.h].getLayout() != null) {
            float primaryHorizontal = textViewArr[this.h].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h].getLayout().getPrimaryHorizontal(this.f34132s);
            if (primaryHorizontal == primaryHorizontal2) {
                z11 = false;
            } else if (primaryHorizontal2 > primaryHorizontal) {
                rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
            } else {
                rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
            }
            if (z11 && i9 == this.h) {
                canvas.save();
                canvas.clipRect(rectF);
                textViewArr[0].draw(canvas);
                canvas.restore();
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        float[] fArr = this.f34126b;
        if (fArr[i9] <= 0.0f && !z10) {
            return super.drawChild(canvas, view, j10);
        }
        float min = Math.min(view.getWidth(), getWidth());
        float min2 = Math.min(view.getHeight(), getHeight());
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, min, min2, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        float f10 = (1.0f - fArr[i9]) * min;
        float f11 = f10 + this.f34127c;
        Matrix matrix = this.d;
        matrix.setTranslate(f10, 0.0f);
        this.f34131r.setLocalMatrix(matrix);
        canvas.drawRect(f10, 0.0f, f11, min2, this.f34128e);
        Paint paint = this.f34129f;
        if (min > f11) {
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
        return this.f34133w;
    }

    public TextView getNextTextView() {
        char c10;
        if (this.h == 0) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return this.f34125a[c10];
    }

    public TextView getTextView() {
        return this.f34125a[this.h];
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.f34134x) {
            int i13 = 0;
            while (true) {
                TextView[] textViewArr = this.f34125a;
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        LinearGradient linearGradient = new LinearGradient(this.f34127c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.f34131r = linearGradient;
        this.f34128e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i9) {
        TextView[] textViewArr;
        this.f34133w = i9;
        for (TextView textView : this.f34125a) {
            if (textView instanceof a90) {
                ((a90) textView).setCustomPaddingRight(i9);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
