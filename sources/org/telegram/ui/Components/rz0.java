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
public final class rz0 extends FrameLayout {
    public LinearGradient E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final DecelerateInterpolator I;
    public final ThemeEditorView.EditorAlert J;
    public final LinearLayout f39104a;
    public final int f39105b;
    public final Paint f39106c;
    public final Paint d;
    public final Paint f39107e;
    public final Drawable f39108f;
    public Bitmap h;
    public final EditTextBoldCursor[] f39109n;
    public int f39110r;
    public final float[] f39111s;
    public float f39112w;
    public final float[] f39113x;
    public LinearGradient f39114y;

    public rz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i7;
        float f10;
        this.J = editorAlert;
        this.f39105b = org.telegram.messenger.g0.L(20.0f);
        this.f39109n = new EditTextBoldCursor[4];
        this.f39111s = new float[]{0.0f, 0.0f, 1.0f};
        this.f39112w = 1.0f;
        this.f39113x = new float[3];
        this.I = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.f39107e = new Paint(1);
        this.f39108f = i5.c.g(context, 2131231599);
        Paint paint = new Paint();
        this.f39106c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39104a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ja.e(-2, -2, 49));
        for (int i10 = 0; i10 < 4; i10++) {
            this.f39109n[i10] = new EditTextBoldCursor(context);
            this.f39109n[i10].setInputType(2);
            this.f39109n[i10].setTextColor(-14606047);
            this.f39109n[i10].setCursorColor(-14606047);
            this.f39109n[i10].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f39109n[i10].setCursorWidth(1.5f);
            this.f39109n[i10].setTextSize(1, 18.0f);
            this.f39109n[i10].setBackground(null);
            org.telegram.ui.ActionBar.q6.F(this.f39109n[i10], org.telegram.ui.ActionBar.j6.f29164u5, org.telegram.ui.ActionBar.j6.f29183v5, org.telegram.ui.ActionBar.j6.f29090q7, null);
            this.f39109n[i10].setMaxLines(1);
            this.f39109n[i10].setTag(Integer.valueOf(i10));
            this.f39109n[i10].setGravity(17);
            if (i10 == 0) {
                this.f39109n[i10].setHint("red");
            } else if (i10 == 1) {
                this.f39109n[i10].setHint("green");
            } else if (i10 == 2) {
                this.f39109n[i10].setHint("blue");
            } else if (i10 == 3) {
                this.f39109n[i10].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.f39109n[i10];
            if (i10 == 3) {
                i7 = 6;
            } else {
                i7 = 5;
            }
            editTextBoldCursor.setImeOptions(i7 | 268435456);
            this.f39109n[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.f39104a;
            EditTextBoldCursor editTextBoldCursor2 = this.f39109n[i10];
            if (i10 != 3) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, c8.ja.k(0.0f, 0.0f, f10, 0.0f, 55, 36));
            this.f39109n[i10].addTextChangedListener(new qz0(this, i10));
            this.f39109n[i10].setOnEditorActionListener(new j2(2));
        }
    }

    public final void a(Canvas canvas, int i7, int i10, int i11) {
        int L = org.telegram.messenger.g0.L(13.0f);
        Drawable drawable = this.f39108f;
        drawable.setBounds(i7 - L, i10 - L, i7 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.f39107e;
        paint.setColor(-1);
        float f10 = i7;
        float f11 = i10;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(11.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f39111s) & 16777215) | (((int) (this.f39112w * 255.0f)) << 24);
    }

    public final void c(int i7) {
        int red = Color.red(i7);
        int green = Color.green(i7);
        int blue = Color.blue(i7);
        int alpha = Color.alpha(i7);
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (!editorAlert.F1) {
            editorAlert.F1 = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f39109n;
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
            editTextBoldCursor.setText("" + red);
            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursorArr[1];
            editTextBoldCursor2.setText("" + green);
            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[2];
            editTextBoldCursor3.setText("" + blue);
            EditTextBoldCursor editTextBoldCursor4 = editTextBoldCursorArr[3];
            editTextBoldCursor4.setText("" + alpha);
            for (int i10 = 0; i10 < 4; i10++) {
                EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[i10];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
            editorAlert.F1 = false;
        }
        this.E = null;
        this.f39114y = null;
        this.f39112w = alpha / 255.0f;
        Color.colorToHSV(i7, this.f39111s);
        invalidate();
    }

    public final void d(boolean z10) {
        int i7;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (editorAlert.E1 == z10) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.D1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.E1 = z10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.D1 = animatorSet2;
        org.telegram.ui.ActionBar.t2 t2Var = editorAlert.Z;
        i6 i6Var = k6.d;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(t2Var, i6Var, i7);
        ViewGroup viewGroup = editorAlert.f29682b;
        if (z10) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f10));
        editorAlert.D1.setDuration(150L);
        editorAlert.D1.setInterpolator(this.I);
        editorAlert.D1.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c10;
        int i7 = this.f39105b;
        int width = (getWidth() / 2) - (i7 * 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f);
        Bitmap bitmap = this.h;
        int i10 = this.f39110r;
        canvas.drawBitmap(bitmap, width - i10, height - i10, (Paint) null);
        float[] fArr = this.f39111s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.f39113x;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.f39110r)) + width, ((int) ((-Math.sin(radians)) * f10 * this.f39110r)) + height, Color.HSVToColor(fArr2));
        int i11 = this.f39110r;
        int i12 = width + i11 + i7;
        int i13 = height - i11;
        int L = org.telegram.messenger.g0.L(9.0f);
        int i14 = this.f39110r * 2;
        if (this.f39114y == null) {
            c10 = 2;
            this.f39114y = new LinearGradient(i12, i13, i12 + L, i13 + i14, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.f39114y;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i13;
        float f13 = i13 + i14;
        canvas.drawRect(i12, f12, i12 + L, f13, paint);
        int i15 = L / 2;
        float f14 = i14;
        a(canvas, i12 + i15, (int) ((fArr[c10] * f14) + f12), Color.HSVToColor(fArr));
        int i16 = (i7 * 2) + i12;
        if (this.E == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.E = new LinearGradient(i16, f12, i16 + L, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.E);
        canvas.drawRect(i16, f12, L + i16, f13, paint);
        a(canvas, i16 + i15, (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.f39112w, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.f39112w * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        measureChild(this.f39104a, i7, i10);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int d = i5.c.d(20.0f, (i7 / 2) - (this.f39105b * 2), 1);
        this.f39110r = d;
        int i13 = d * 2;
        int i14 = d * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i15 = 0; i15 < 13; i15++) {
            fArr[0] = ((i15 * 30) + 180) % 360;
            iArr[i15] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f10 = i13 / 2;
        float f11 = i14 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f10, f11, iArr, (float[]) null), new RadialGradient(f10, f11, this.f39110r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f39106c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f10, f11, this.f39110r, paint);
        this.h = createBitmap;
        this.f39114y = null;
        this.E = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
