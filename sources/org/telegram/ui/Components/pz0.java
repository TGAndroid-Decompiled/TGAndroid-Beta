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
public final class pz0 extends FrameLayout {
    public LinearGradient D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final DecelerateInterpolator H;
    public final ThemeEditorView.EditorAlert I;
    public final LinearLayout f37102a;
    public final int f37103b;
    public final Paint f37104c;
    public final Paint d;
    public final Paint f37105e;
    public final Drawable f37106f;
    public Bitmap h;
    public final EditTextBoldCursor[] f37107n;
    public int f37108r;
    public final float[] f37109s;
    public float f37110w;
    public final float[] f37111x;
    public LinearGradient f37112y;

    public pz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i7;
        float f10;
        this.I = editorAlert;
        this.f37103b = org.telegram.messenger.g0.L(20.0f);
        this.f37107n = new EditTextBoldCursor[4];
        this.f37109s = new float[]{0.0f, 0.0f, 1.0f};
        this.f37110w = 1.0f;
        this.f37111x = new float[3];
        this.H = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.f37105e = new Paint(1);
        this.f37106f = jg.g.h(context, 2131231599);
        Paint paint = new Paint();
        this.f37104c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37102a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.e(-2, -2, 49));
        for (int i10 = 0; i10 < 4; i10++) {
            this.f37107n[i10] = new EditTextBoldCursor(context);
            this.f37107n[i10].setInputType(2);
            this.f37107n[i10].setTextColor(-14606047);
            this.f37107n[i10].setCursorColor(-14606047);
            this.f37107n[i10].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f37107n[i10].setCursorWidth(1.5f);
            this.f37107n[i10].setTextSize(1, 18.0f);
            this.f37107n[i10].setBackground(null);
            org.telegram.ui.ActionBar.t6.F(this.f37107n[i10], org.telegram.ui.ActionBar.m6.f28205u5, org.telegram.ui.ActionBar.m6.f28224v5, org.telegram.ui.ActionBar.m6.f28131q7, null);
            this.f37107n[i10].setMaxLines(1);
            this.f37107n[i10].setTag(Integer.valueOf(i10));
            this.f37107n[i10].setGravity(17);
            if (i10 == 0) {
                this.f37107n[i10].setHint("red");
            } else if (i10 == 1) {
                this.f37107n[i10].setHint("green");
            } else if (i10 == 2) {
                this.f37107n[i10].setHint("blue");
            } else if (i10 == 3) {
                this.f37107n[i10].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.f37107n[i10];
            if (i10 == 3) {
                i7 = 6;
            } else {
                i7 = 5;
            }
            editTextBoldCursor.setImeOptions(i7 | 268435456);
            this.f37107n[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.f37102a;
            EditTextBoldCursor editTextBoldCursor2 = this.f37107n[i10];
            if (i10 != 3) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, c8.ha.k(0.0f, 0.0f, f10, 0.0f, 55, 36));
            this.f37107n[i10].addTextChangedListener(new oz0(this, i10));
            this.f37107n[i10].setOnEditorActionListener(new k2(2));
        }
    }

    public final void a(Canvas canvas, int i7, int i10, int i11) {
        int L = org.telegram.messenger.g0.L(13.0f);
        Drawable drawable = this.f37106f;
        drawable.setBounds(i7 - L, i10 - L, i7 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.f37105e;
        paint.setColor(-1);
        float f10 = i7;
        float f11 = i10;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(11.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f37109s) & 16777215) | (((int) (this.f37110w * 255.0f)) << 24);
    }

    public final void c(int i7) {
        int red = Color.red(i7);
        int green = Color.green(i7);
        int blue = Color.blue(i7);
        int alpha = Color.alpha(i7);
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (!editorAlert.E1) {
            editorAlert.E1 = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f37107n;
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
            editorAlert.E1 = false;
        }
        this.D = null;
        this.f37112y = null;
        this.f37110w = alpha / 255.0f;
        Color.colorToHSV(i7, this.f37109s);
        invalidate();
    }

    public final void d(boolean z9) {
        int i7;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (editorAlert.D1 == z9) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.C1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.D1 = z9;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.C1 = animatorSet2;
        org.telegram.ui.ActionBar.v2 v2Var = editorAlert.Y;
        j6 j6Var = l6.d;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(v2Var, j6Var, i7);
        ViewGroup viewGroup = editorAlert.f28672b;
        if (z9) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f10));
        editorAlert.C1.setDuration(150L);
        editorAlert.C1.setInterpolator(this.H);
        editorAlert.C1.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c10;
        int i7 = this.f37103b;
        int width = (getWidth() / 2) - (i7 * 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f);
        Bitmap bitmap = this.h;
        int i10 = this.f37108r;
        canvas.drawBitmap(bitmap, width - i10, height - i10, (Paint) null);
        float[] fArr = this.f37109s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.f37111x;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.f37108r)) + width, ((int) ((-Math.sin(radians)) * f10 * this.f37108r)) + height, Color.HSVToColor(fArr2));
        int i11 = this.f37108r;
        int i12 = width + i11 + i7;
        int i13 = height - i11;
        int L = org.telegram.messenger.g0.L(9.0f);
        int i14 = this.f37108r * 2;
        if (this.f37112y == null) {
            c10 = 2;
            this.f37112y = new LinearGradient(i12, i13, i12 + L, i13 + i14, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.f37112y;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i13;
        float f13 = i13 + i14;
        canvas.drawRect(i12, f12, i12 + L, f13, paint);
        int i15 = L / 2;
        float f14 = i14;
        a(canvas, i12 + i15, (int) ((fArr[c10] * f14) + f12), Color.HSVToColor(fArr));
        int i16 = (i7 * 2) + i12;
        if (this.D == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.D = new LinearGradient(i16, f12, i16 + L, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.D);
        canvas.drawRect(i16, f12, L + i16, f13, paint);
        a(canvas, i16 + i15, (int) com.google.android.recaptcha.internal.a.z(1.0f, this.f37110w, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.f37110w * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        measureChild(this.f37102a, i7, i10);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int e10 = jg.g.e(20.0f, (i7 / 2) - (this.f37103b * 2), 1);
        this.f37108r = e10;
        int i13 = e10 * 2;
        int i14 = e10 * 2;
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
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f10, f11, iArr, (float[]) null), new RadialGradient(f10, f11, this.f37108r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f37104c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f10, f11, this.f37108r, paint);
        this.h = createBitmap;
        this.f37112y = null;
        this.D = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
