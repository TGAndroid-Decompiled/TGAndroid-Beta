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

public abstract class v7 extends FrameLayout {

    public final TextView[] f33282a;

    public final float[] f33283b;

    public final int f33284c;
    public final Matrix d;

    public final Paint f33285e;

    public final Paint f33286f;
    public int h;

    public AnimatorSet f33287n;

    public LinearGradient f33288r;

    public int f33289s;
    public final RectF v;

    public int f33290w;

    public boolean f33291x;

    public v7(Context context) {
        super(context);
        this.f33282a = new TextView[2];
        this.f33283b = new float[]{0.0f, 0.75f};
        this.f33284c = AndroidUtilities.dp(24.0f);
        this.f33289s = -1;
        this.v = new RectF();
        for (int i10 = 0; i10 < 2; i10++) {
            this.f33282a[i10] = a();
            if (i10 == 1) {
                this.f33282a[i10].setAlpha(0.0f);
                this.f33282a[i10].setVisibility(8);
            }
            addView(this.f33282a[i10], h7.z5.c(-1.0f, -2));
        }
        this.d = new Matrix();
        Paint paint = new Paint(1);
        this.f33285e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f33286f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public abstract TextView a();

    public final void b(CharSequence charSequence, boolean z10) {
        final int i10;
        int i11 = this.h;
        TextView[] textViewArr = this.f33282a;
        CharSequence text = textViewArr[i11].getText();
        if (TextUtils.isEmpty(text) || !z10) {
            textViewArr[this.h].setText(charSequence);
            return;
        }
        if (TextUtils.equals(charSequence, text)) {
            return;
        }
        final int i12 = 0;
        this.f33289s = 0;
        int iMin = Math.min(charSequence.length(), text.length());
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= iMin || charSequence.charAt(i13) != text.charAt(i13)) {
                break;
            }
            this.f33289s++;
            i13++;
        }
        if (this.f33289s <= 3) {
            this.f33289s = -1;
        }
        final int i14 = this.h;
        final int i15 = i14 == 0 ? 1 : 0;
        this.h = i15;
        AnimatorSet animatorSet = this.f33287n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33287n = animatorSet2;
        animatorSet2.addListener(new nh.n2(this, i14, 4));
        textViewArr[i15].setText(charSequence);
        textViewArr[i15].bringToFront();
        textViewArr[i15].setVisibility(0);
        float[] fArr = this.f33283b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr[i14], 0.75f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final v7 f32997b;

            {
                this.f32997b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        v7 v7Var = this.f32997b;
                        v7Var.f33283b[i14] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        v7Var.invalidate();
                        break;
                    default:
                        v7 v7Var2 = this.f32997b;
                        v7Var2.f33283b[i14] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        v7Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr[i15], 0.0f);
        valueAnimatorOfFloat2.setStartDelay(100L);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final v7 f32997b;

            {
                this.f32997b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        v7 v7Var = this.f32997b;
                        v7Var.f33283b[i15] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        v7Var.invalidate();
                        break;
                    default:
                        v7 v7Var2 = this.f32997b;
                        v7Var2.f33283b[i15] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        v7Var2.invalidate();
                        break;
                }
            }
        });
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textViewArr[i14], (Property<TextView, Float>) property, 0.0f);
        objectAnimatorOfFloat.setStartDelay(75L);
        objectAnimatorOfFloat.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textViewArr[i15], (Property<TextView, Float>) property, 1.0f);
        objectAnimatorOfFloat2.setStartDelay(75L);
        objectAnimatorOfFloat2.setDuration(150L);
        this.f33287n.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f33287n.start();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        Canvas canvas2;
        TextView[] textViewArr = this.f33282a;
        boolean z11 = true;
        int i10 = view == textViewArr[0] ? 0 : 1;
        if (this.f33291x) {
            this.f33289s = -1;
        }
        if (this.f33289s > 0) {
            for (TextView textView : textViewArr) {
                if ((textView instanceof e90) && ((e90) textView).d) {
                    this.f33289s = -1;
                    break;
                }
            }
        }
        int i11 = this.f33289s;
        RectF rectF = this.v;
        if (i11 <= 0 || textViewArr[this.h].getAlpha() == 1.0f || textViewArr[this.h].getLayout() == null) {
            z10 = false;
        } else {
            float primaryHorizontal = textViewArr[this.h].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h].getLayout().getPrimaryHorizontal(this.f33289s);
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
        }
        float[] fArr = this.f33283b;
        if (fArr[i10] <= 0.0f && !z10) {
            return super.drawChild(canvas, view, j10);
        }
        float fMin = Math.min(view.getWidth(), getWidth());
        float fMin2 = Math.min(view.getHeight(), getHeight());
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, fMin, fMin2, null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        float f10 = (1.0f - fArr[i10]) * fMin;
        float f11 = f10 + this.f33284c;
        Matrix matrix = this.d;
        matrix.setTranslate(f10, 0.0f);
        this.f33288r.setLocalMatrix(matrix);
        canvas.drawRect(f10, 0.0f, f11, fMin2, this.f33285e);
        Paint paint = this.f33286f;
        if (fMin > f11) {
            canvas2 = canvas;
            canvas2.drawRect(f11, 0.0f, fMin, fMin2, paint);
        } else {
            canvas2 = canvas;
        }
        if (z10) {
            canvas2.drawRect(rectF, paint);
        }
        canvas2.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    public int getCustomPaddingRight() {
        return this.f33290w;
    }

    public TextView getNextTextView() {
        return this.f33282a[this.h == 0 ? (char) 1 : (char) 0];
    }

    public TextView getTextView() {
        return this.f33282a[this.h];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f33291x) {
            return;
        }
        int i14 = 0;
        while (true) {
            TextView[] textViewArr = this.f33282a;
            if (i14 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i14];
            if (textView != null && textView.getMeasuredWidth() < getMeasuredWidth()) {
                int measuredWidth = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
                textView.layout(measuredWidth, 0, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight());
            }
            i14++;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        LinearGradient linearGradient = new LinearGradient(this.f33284c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.f33288r = linearGradient;
        this.f33285e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i10) {
        this.f33290w = i10;
        for (TextView textView : this.f33282a) {
            if (textView instanceof e90) {
                ((e90) textView).setCustomPaddingRight(i10);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
