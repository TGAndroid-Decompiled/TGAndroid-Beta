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
public final class oz0 extends FrameLayout {
    public LinearGradient E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final DecelerateInterpolator I;
    public final ThemeEditorView.EditorAlert J;
    public final LinearLayout f36987a;
    public final int f36988b;
    public final Paint f36989c;
    public final Paint d;
    public final Paint f36990e;
    public final Drawable f36991f;
    public Bitmap h;
    public final EditTextBoldCursor[] f36992n;
    public int f36993r;
    public final float[] f36994s;
    public float f36995w;
    public final float[] f36996x;
    public LinearGradient f36997y;

    public oz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i3;
        float f10;
        this.J = editorAlert;
        this.f36988b = org.telegram.messenger.g0.L(20.0f);
        this.f36992n = new EditTextBoldCursor[4];
        this.f36994s = new float[]{0.0f, 0.0f, 1.0f};
        this.f36995w = 1.0f;
        this.f36996x = new float[3];
        this.I = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.f36990e = new Paint(1);
        this.f36991f = k2.p1.g(context, 2131231599);
        Paint paint = new Paint();
        this.f36989c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36987a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.e(-2, -2, 49));
        for (int i10 = 0; i10 < 4; i10++) {
            this.f36992n[i10] = new EditTextBoldCursor(context);
            this.f36992n[i10].setInputType(2);
            this.f36992n[i10].setTextColor(-14606047);
            this.f36992n[i10].setCursorColor(-14606047);
            this.f36992n[i10].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f36992n[i10].setCursorWidth(1.5f);
            this.f36992n[i10].setTextSize(1, 18.0f);
            this.f36992n[i10].setBackground(null);
            org.telegram.ui.ActionBar.r6.G(this.f36992n[i10], org.telegram.ui.ActionBar.k6.f28195u5, org.telegram.ui.ActionBar.k6.f28213v5, org.telegram.ui.ActionBar.k6.f28122q7, null);
            this.f36992n[i10].setMaxLines(1);
            this.f36992n[i10].setTag(Integer.valueOf(i10));
            this.f36992n[i10].setGravity(17);
            if (i10 == 0) {
                this.f36992n[i10].setHint("red");
            } else if (i10 == 1) {
                this.f36992n[i10].setHint("green");
            } else if (i10 == 2) {
                this.f36992n[i10].setHint("blue");
            } else if (i10 == 3) {
                this.f36992n[i10].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.f36992n[i10];
            if (i10 == 3) {
                i3 = 6;
            } else {
                i3 = 5;
            }
            editTextBoldCursor.setImeOptions(i3 | 268435456);
            this.f36992n[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.f36987a;
            EditTextBoldCursor editTextBoldCursor2 = this.f36992n[i10];
            if (i10 != 3) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, b8.mf.k(0.0f, 0.0f, f10, 0.0f, 55, 36));
            this.f36992n[i10].addTextChangedListener(new nz0(this, i10));
            this.f36992n[i10].setOnEditorActionListener(new i2(2));
        }
    }

    public final void a(Canvas canvas, int i3, int i10, int i11) {
        int L = org.telegram.messenger.g0.L(13.0f);
        Drawable drawable = this.f36991f;
        drawable.setBounds(i3 - L, i10 - L, i3 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.f36990e;
        paint.setColor(-1);
        float f10 = i3;
        float f11 = i10;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(11.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f36994s) & 16777215) | (((int) (this.f36995w * 255.0f)) << 24);
    }

    public final void c(int i3) {
        int red = Color.red(i3);
        int green = Color.green(i3);
        int blue = Color.blue(i3);
        int alpha = Color.alpha(i3);
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (!editorAlert.C1) {
            editorAlert.C1 = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f36992n;
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
            editorAlert.C1 = false;
        }
        this.E = null;
        this.f36997y = null;
        this.f36995w = alpha / 255.0f;
        Color.colorToHSV(i3, this.f36994s);
        invalidate();
    }

    public final void d(boolean z10) {
        int i3;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (editorAlert.B1 == z10) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.A1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.B1 = z10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.A1 = animatorSet2;
        org.telegram.ui.ActionBar.s2 s2Var = editorAlert.Z;
        i6 i6Var = k6.d;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(s2Var, i6Var, i3);
        ViewGroup viewGroup = editorAlert.f28586b;
        if (z10) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f10));
        editorAlert.A1.setDuration(150L);
        editorAlert.A1.setInterpolator(this.I);
        editorAlert.A1.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c2;
        int i3 = this.f36988b;
        int width = (getWidth() / 2) - (i3 * 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f);
        Bitmap bitmap = this.h;
        int i10 = this.f36993r;
        canvas.drawBitmap(bitmap, width - i10, height - i10, (Paint) null);
        float[] fArr = this.f36994s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.f36996x;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.f36993r)) + width, ((int) ((-Math.sin(radians)) * f10 * this.f36993r)) + height, Color.HSVToColor(fArr2));
        int i11 = this.f36993r;
        int i12 = width + i11 + i3;
        int i13 = height - i11;
        int L = org.telegram.messenger.g0.L(9.0f);
        int i14 = this.f36993r * 2;
        if (this.f36997y == null) {
            c2 = 2;
            this.f36997y = new LinearGradient(i12, i13, i12 + L, i13 + i14, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c2 = 2;
        }
        LinearGradient linearGradient = this.f36997y;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i13;
        float f13 = i13 + i14;
        canvas.drawRect(i12, f12, i12 + L, f13, paint);
        int i15 = L / 2;
        float f14 = i14;
        a(canvas, i12 + i15, (int) ((fArr[c2] * f14) + f12), Color.HSVToColor(fArr));
        int i16 = (i3 * 2) + i12;
        if (this.E == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.E = new LinearGradient(i16, f12, i16 + L, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.E);
        canvas.drawRect(i16, f12, L + i16, f13, paint);
        a(canvas, i16 + i15, (int) com.google.android.recaptcha.internal.a.y(1.0f, this.f36995w, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.f36995w * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        measureChild(this.f36987a, i3, i10);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        int d = k2.p1.d(20.0f, (i3 / 2) - (this.f36988b * 2), 1);
        this.f36993r = d;
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
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f10, f11, iArr, (float[]) null), new RadialGradient(f10, f11, this.f36993r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f36989c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f10, f11, this.f36993r, paint);
        this.h = createBitmap;
        this.f36997y = null;
        this.E = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
