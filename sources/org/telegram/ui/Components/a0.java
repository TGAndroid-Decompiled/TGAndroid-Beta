package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.Components.ThemeEditorView;
public final class a0 extends FrameLayout {
    public LinearGradient E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final DecelerateInterpolator I;
    public final ThemeEditorView.EditorAlert J;
    public final LinearLayout a;
    public final int b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Drawable f;
    public Bitmap h;
    public final EditTextBoldCursor[] n;
    public int r;
    public final float[] s;
    public float w;
    public final float[] x;
    public LinearGradient y;

    public a0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i;
        float f;
        this.J = editorAlert;
        this.b = hl.L(20.0f);
        this.n = new EditTextBoldCursor[4];
        this.s = new float[]{0.0f, 0.0f, 1.0f};
        this.w = 1.0f;
        this.x = new float[3];
        this.I = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.e = new Paint(1);
        this.f = c00.e(context, 2131231603);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.e(-2, -2, 49));
        for (int i2 = 0; i2 < 4; i2++) {
            this.n[i2] = new EditTextBoldCursor(context);
            this.n[i2].setInputType(2);
            this.n[i2].setTextColor(-14606047);
            this.n[i2].setCursorColor(-14606047);
            this.n[i2].setCursorSize(hl.L(20.0f));
            this.n[i2].setCursorWidth(1.5f);
            this.n[i2].setTextSize(1, 18.0f);
            this.n[i2].setBackground(null);
            yob.F(this.n[i2], aob.u5, aob.v5, aob.q7, null);
            this.n[i2].setMaxLines(1);
            this.n[i2].setTag(Integer.valueOf(i2));
            this.n[i2].setGravity(17);
            if (i2 == 0) {
                this.n[i2].setHint("red");
            } else if (i2 == 1) {
                this.n[i2].setHint("green");
            } else if (i2 == 2) {
                this.n[i2].setHint("blue");
            } else if (i2 == 3) {
                this.n[i2].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.n[i2];
            if (i2 == 3) {
                i = 6;
            } else {
                i = 5;
            }
            editTextBoldCursor.setImeOptions(i | 268435456);
            this.n[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.a;
            EditTextBoldCursor editTextBoldCursor2 = this.n[i2];
            if (i2 != 3) {
                f = 16.0f;
            } else {
                f = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, tre.k(0.0f, 0.0f, f, 0.0f, 55, 36));
            this.n[i2].addTextChangedListener(new z(this, i2));
            this.n[i2].setOnEditorActionListener(new mh((byte) 5));
        }
    }

    public final void a(Canvas canvas, int i, int i2, int i3) {
        int L = hl.L(13.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i - L, i2 - L, i + L, L + i2);
        drawable.draw(canvas);
        Paint paint = this.e;
        paint.setColor(-1);
        float f = i;
        float f2 = i2;
        canvas.drawCircle(f, f2, hl.L(11.0f), paint);
        paint.setColor(i3);
        canvas.drawCircle(f, f2, hl.L(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.s) & 16777215) | (((int) (this.w * 255.0f)) << 24);
    }

    public final void c(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (!editorAlert.E1) {
            editorAlert.E1 = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.n;
            editTextBoldCursorArr[0].setText(String.valueOf(red));
            editTextBoldCursorArr[1].setText(String.valueOf(green));
            editTextBoldCursorArr[2].setText(String.valueOf(blue));
            editTextBoldCursorArr[3].setText(String.valueOf(alpha));
            for (int i2 = 0; i2 < 4; i2++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            editorAlert.E1 = false;
        }
        this.E = null;
        this.y = null;
        this.w = alpha / 255.0f;
        Color.colorToHSV(i, this.s);
        invalidate();
    }

    public final void d(boolean z) {
        int i;
        float f;
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (editorAlert.D1 == z) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.C1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.D1 = z;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.C1 = animatorSet2;
        hc hcVar = editorAlert.Z;
        qn qnVar = sn.d;
        if (z) {
            i = 0;
        } else {
            i = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(hcVar, qnVar, i);
        ViewGroup viewGroup = editorAlert.b;
        if (z) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f));
        editorAlert.C1.setDuration(150L);
        editorAlert.C1.setInterpolator(this.I);
        editorAlert.C1.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c;
        int i = this.b;
        int width = (getWidth() / 2) - (i << 1);
        int height = (getHeight() / 2) - hl.L(8.0f);
        Bitmap bitmap = this.h;
        int i2 = this.r;
        canvas.drawBitmap(bitmap, width - i2, height - i2, (Paint) null);
        float[] fArr = this.s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f = fArr[1];
        float f2 = fArr[0];
        float[] fArr2 = this.x;
        fArr2[0] = f2;
        fArr2[1] = f;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.r)) + width, ((int) ((-Math.sin(radians)) * f * this.r)) + height, Color.HSVToColor(fArr2));
        int i3 = this.r;
        int i4 = width + i3 + i;
        int i5 = height - i3;
        int L = hl.L(9.0f);
        int i6 = this.r << 1;
        LinearGradient linearGradient = this.y;
        if (linearGradient == null) {
            c = 2;
            linearGradient = new LinearGradient(i4, i5, i4 + L, i5 + i6, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
            this.y = linearGradient;
        } else {
            c = 2;
        }
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f3 = i5;
        float f4 = i5 + i6;
        canvas.drawRect(i4, f3, i4 + L, f4, paint);
        int i7 = L / 2;
        float f5 = i6;
        a(canvas, i4 + i7, (int) ((fArr[c] * f5) + f3), Color.HSVToColor(fArr));
        int i8 = i4 + (i << 1);
        LinearGradient linearGradient2 = this.E;
        if (linearGradient2 == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            linearGradient2 = new LinearGradient(i8, f3, i8 + L, f4, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
            this.E = linearGradient2;
        }
        paint.setShader(linearGradient2);
        canvas.drawRect(i8, f3, L + i8, f4, paint);
        a(canvas, i8 + i7, (int) qd4.A(1.0f, this.w, f5, f3), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.w * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        measureChild(this.a, i, i2);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int d = c00.d(20.0f, (i / 2) - (this.b << 1), 1);
        this.r = d;
        int i5 = d << 1;
        int i6 = d << 1;
        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i7 = 0; i7 < 13; i7++) {
            fArr[0] = ((i7 * 30) + 180) % 360;
            iArr[i7] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f = i5 / 2;
        float f2 = i6 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f, f2, iArr, (float[]) null), new RadialGradient(f, f2, this.r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f, f2, this.r, paint);
        this.h = createBitmap;
        this.y = null;
        this.E = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
