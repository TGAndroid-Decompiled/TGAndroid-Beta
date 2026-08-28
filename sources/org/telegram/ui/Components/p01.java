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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ThemeEditorView;
public final class p01 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public final DecelerateInterpolator D;
    public final ThemeEditorView.EditorAlert E;
    public final LinearLayout f31489a;
    public final int f31490b;
    public final Paint f31491c;
    public final Paint d;
    public final Paint f31492e;
    public final Drawable f31493f;
    public Bitmap h;
    public final EditTextBoldCursor[] f31494n;
    public int f31495r;
    public final float[] f31496s;
    public float v;
    public final float[] f31497w;
    public LinearGradient f31498x;
    public LinearGradient f31499y;

    public p01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i9;
        float f10;
        this.E = editorAlert;
        this.f31490b = AndroidUtilities.dp(20.0f);
        this.f31494n = new EditTextBoldCursor[4];
        this.f31496s = new float[]{0.0f, 0.0f, 1.0f};
        this.v = 1.0f;
        this.f31497w = new float[3];
        this.D = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.f31492e = new Paint(1);
        this.f31493f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        Paint paint = new Paint();
        this.f31491c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31489a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.e(-2, -2, 49));
        for (int i10 = 0; i10 < 4; i10++) {
            this.f31494n[i10] = new EditTextBoldCursor(context);
            this.f31494n[i10].setInputType(2);
            this.f31494n[i10].setTextColor(-14606047);
            this.f31494n[i10].setCursorColor(-14606047);
            this.f31494n[i10].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f31494n[i10].setCursorWidth(1.5f);
            this.f31494n[i10].setTextSize(1, 18.0f);
            this.f31494n[i10].setBackground(null);
            this.f31494n[i10].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23302u5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23318v5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            this.f31494n[i10].setMaxLines(1);
            this.f31494n[i10].setTag(Integer.valueOf(i10));
            this.f31494n[i10].setGravity(17);
            if (i10 == 0) {
                this.f31494n[i10].setHint("red");
            } else if (i10 == 1) {
                this.f31494n[i10].setHint("green");
            } else if (i10 == 2) {
                this.f31494n[i10].setHint("blue");
            } else if (i10 == 3) {
                this.f31494n[i10].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.f31494n[i10];
            if (i10 == 3) {
                i9 = 6;
            } else {
                i9 = 5;
            }
            editTextBoldCursor.setImeOptions(i9 | 268435456);
            this.f31494n[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.f31489a;
            EditTextBoldCursor editTextBoldCursor2 = this.f31494n[i10];
            if (i10 != 3) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, g7.e6.k(0.0f, 0.0f, f10, 0.0f, 55, 36));
            this.f31494n[i10].addTextChangedListener(new o01(this, i10));
            this.f31494n[i10].setOnEditorActionListener(new o2(2));
        }
    }

    public final void a(Canvas canvas, int i9, int i10, int i11) {
        int dp = AndroidUtilities.dp(13.0f);
        Drawable drawable = this.f31493f;
        drawable.setBounds(i9 - dp, i10 - dp, i9 + dp, dp + i10);
        drawable.draw(canvas);
        Paint paint = this.f31492e;
        paint.setColor(-1);
        float f10 = i9;
        float f11 = i10;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(11.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f31496s) & 16777215) | (((int) (this.v * 255.0f)) << 24);
    }

    public final void c(int i9) {
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        int alpha = Color.alpha(i9);
        ThemeEditorView.EditorAlert editorAlert = this.E;
        if (!editorAlert.G) {
            editorAlert.G = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f31494n;
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
            editorAlert.G = false;
        }
        this.f31499y = null;
        this.f31498x = null;
        this.v = alpha / 255.0f;
        Color.colorToHSV(i9, this.f31496s);
        invalidate();
    }

    public final void d(boolean z10) {
        org.telegram.ui.ActionBar.e3 e3Var;
        int i9;
        ViewGroup viewGroup;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.E;
        if (editorAlert.F == z10) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.F = z10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.E = animatorSet2;
        e3Var = ((org.telegram.ui.ActionBar.f3) editorAlert).backDrawable;
        k6 k6Var = m6.d;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var, k6Var, i9);
        viewGroup = ((org.telegram.ui.ActionBar.f3) editorAlert).containerView;
        if (z10) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f10));
        editorAlert.E.setDuration(150L);
        editorAlert.E.setInterpolator(this.D);
        editorAlert.E.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c10;
        int i9 = this.f31490b;
        int width = (getWidth() / 2) - (i9 * 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        Bitmap bitmap = this.h;
        int i10 = this.f31495r;
        canvas.drawBitmap(bitmap, width - i10, height - i10, (Paint) null);
        float[] fArr = this.f31496s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.f31497w;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.f31495r)) + width, ((int) ((-Math.sin(radians)) * f10 * this.f31495r)) + height, Color.HSVToColor(fArr2));
        int i11 = this.f31495r;
        int i12 = width + i11 + i9;
        int i13 = height - i11;
        int dp = AndroidUtilities.dp(9.0f);
        int i14 = this.f31495r * 2;
        if (this.f31498x == null) {
            c10 = 2;
            this.f31498x = new LinearGradient(i12, i13, i12 + dp, i13 + i14, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.f31498x;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i13;
        float f13 = i13 + i14;
        canvas.drawRect(i12, f12, i12 + dp, f13, paint);
        int i15 = dp / 2;
        float f14 = i14;
        a(canvas, i12 + i15, (int) ((fArr[c10] * f14) + f12), Color.HSVToColor(fArr));
        int i16 = (i9 * 2) + i12;
        if (this.f31499y == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.f31499y = new LinearGradient(i16, f12, i16 + dp, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.f31499y);
        canvas.drawRect(i16, f12, dp + i16, f13, paint);
        a(canvas, i16 + i15, (int) e2.c.z(1.0f, this.v, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.v * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        measureChild(this.f31489a, i9, i10);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int b10 = org.telegram.messenger.l0.b(20.0f, (i9 / 2) - (this.f31490b * 2), 1);
        this.f31495r = b10;
        int i13 = b10 * 2;
        int i14 = b10 * 2;
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
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f10, f11, iArr, (float[]) null), new RadialGradient(f10, f11, this.f31495r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f31491c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f10, f11, this.f31495r, paint);
        this.h = createBitmap;
        this.f31498x = null;
        this.f31499y = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
