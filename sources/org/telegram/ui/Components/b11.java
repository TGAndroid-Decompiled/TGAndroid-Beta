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
public final class b11 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public final DecelerateInterpolator D;
    public final ThemeEditorView.EditorAlert E;
    public final LinearLayout f26933a;
    public final int f26934b;
    public final Paint f26935c;
    public final Paint d;
    public final Paint f26936e;
    public final Drawable f26937f;
    public Bitmap h;
    public final EditTextBoldCursor[] f26938n;
    public int f26939r;
    public final float[] f26940s;
    public float v;
    public final float[] f26941w;
    public LinearGradient f26942x;
    public LinearGradient f26943y;

    public b11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i10;
        float f9;
        this.E = editorAlert;
        this.f26934b = AndroidUtilities.dp(20.0f);
        this.f26938n = new EditTextBoldCursor[4];
        this.f26940s = new float[]{0.0f, 0.0f, 1.0f};
        this.v = 1.0f;
        this.f26941w = new float[3];
        this.D = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.f26936e = new Paint(1);
        this.f26937f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        Paint paint = new Paint();
        this.f26935c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26933a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, i7.f6.e(-2, -2, 49));
        for (int i11 = 0; i11 < 4; i11++) {
            this.f26938n[i11] = new EditTextBoldCursor(context);
            this.f26938n[i11].setInputType(2);
            this.f26938n[i11].setTextColor(-14606047);
            this.f26938n[i11].setCursorColor(-14606047);
            this.f26938n[i11].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f26938n[i11].setCursorWidth(1.5f);
            this.f26938n[i11].setTextSize(1, 18.0f);
            this.f26938n[i11].setBackground(null);
            this.f26938n[i11].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23364u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23382v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            this.f26938n[i11].setMaxLines(1);
            this.f26938n[i11].setTag(Integer.valueOf(i11));
            this.f26938n[i11].setGravity(17);
            if (i11 == 0) {
                this.f26938n[i11].setHint("red");
            } else if (i11 == 1) {
                this.f26938n[i11].setHint("green");
            } else if (i11 == 2) {
                this.f26938n[i11].setHint("blue");
            } else if (i11 == 3) {
                this.f26938n[i11].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.f26938n[i11];
            if (i11 == 3) {
                i10 = 6;
            } else {
                i10 = 5;
            }
            editTextBoldCursor.setImeOptions(i10 | 268435456);
            this.f26938n[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.f26933a;
            EditTextBoldCursor editTextBoldCursor2 = this.f26938n[i11];
            if (i11 != 3) {
                f9 = 16.0f;
            } else {
                f9 = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, i7.f6.k(0.0f, 0.0f, f9, 0.0f, 55, 36));
            this.f26938n[i11].addTextChangedListener(new a11(this, i11));
            this.f26938n[i11].setOnEditorActionListener(new ag.b0(4));
        }
    }

    public final void a(Canvas canvas, int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(13.0f);
        Drawable drawable = this.f26937f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.f26936e;
        paint.setColor(-1);
        float f9 = i10;
        float f10 = i11;
        canvas.drawCircle(f9, f10, AndroidUtilities.dp(11.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f9, f10, AndroidUtilities.dp(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f26940s) & 16777215) | (((int) (this.v * 255.0f)) << 24);
    }

    public final void c(int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        ThemeEditorView.EditorAlert editorAlert = this.E;
        if (!editorAlert.G) {
            editorAlert.G = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f26938n;
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
            editTextBoldCursor.setText("" + red);
            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursorArr[1];
            editTextBoldCursor2.setText("" + green);
            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[2];
            editTextBoldCursor3.setText("" + blue);
            EditTextBoldCursor editTextBoldCursor4 = editTextBoldCursorArr[3];
            editTextBoldCursor4.setText("" + alpha);
            for (int i11 = 0; i11 < 4; i11++) {
                EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[i11];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
            editorAlert.G = false;
        }
        this.f26943y = null;
        this.f26942x = null;
        this.v = alpha / 255.0f;
        Color.colorToHSV(i10, this.f26940s);
        invalidate();
    }

    public final void d(boolean z10) {
        org.telegram.ui.ActionBar.e3 e3Var;
        int i10;
        ViewGroup viewGroup;
        float f9;
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
        p6 p6Var = r6.d;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var, p6Var, i10);
        viewGroup = ((org.telegram.ui.ActionBar.f3) editorAlert).containerView;
        if (z10) {
            f9 = 0.2f;
        } else {
            f9 = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f9));
        editorAlert.E.setDuration(150L);
        editorAlert.E.setInterpolator(this.D);
        editorAlert.E.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c3;
        int i10 = this.f26934b;
        int width = (getWidth() / 2) - (i10 * 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        Bitmap bitmap = this.h;
        int i11 = this.f26939r;
        canvas.drawBitmap(bitmap, width - i11, height - i11, (Paint) null);
        float[] fArr = this.f26940s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f9 = fArr[1];
        float f10 = fArr[0];
        float[] fArr2 = this.f26941w;
        fArr2[0] = f10;
        fArr2[1] = f9;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.f26939r)) + width, ((int) ((-Math.sin(radians)) * f9 * this.f26939r)) + height, Color.HSVToColor(fArr2));
        int i12 = this.f26939r;
        int i13 = width + i12 + i10;
        int i14 = height - i12;
        int dp = AndroidUtilities.dp(9.0f);
        int i15 = this.f26939r * 2;
        if (this.f26942x == null) {
            c3 = 2;
            this.f26942x = new LinearGradient(i13, i14, i13 + dp, i14 + i15, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c3 = 2;
        }
        LinearGradient linearGradient = this.f26942x;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f11 = i14;
        float f12 = i14 + i15;
        canvas.drawRect(i13, f11, i13 + dp, f12, paint);
        int i16 = dp / 2;
        float f13 = i15;
        a(canvas, i13 + i16, (int) ((fArr[c3] * f13) + f11), Color.HSVToColor(fArr));
        int i17 = (i10 * 2) + i13;
        if (this.f26943y == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.f26943y = new LinearGradient(i17, f11, i17 + dp, f12, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.f26943y);
        canvas.drawRect(i17, f11, dp + i17, f12, paint);
        a(canvas, i17 + i16, (int) com.google.android.recaptcha.internal.a.z(1.0f, this.v, f13, f11), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.v * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        measureChild(this.f26933a, i10, i11);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int d = j7.l1.d(20.0f, (i10 / 2) - (this.f26934b * 2), 1);
        this.f26939r = d;
        int i14 = d * 2;
        int i15 = d * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i16 = 0; i16 < 13; i16++) {
            fArr[0] = ((i16 * 30) + 180) % 360;
            iArr[i16] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f9 = i14 / 2;
        float f10 = i15 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f9, f10, iArr, (float[]) null), new RadialGradient(f9, f10, this.f26939r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f26935c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f9, f10, this.f26939r, paint);
        this.h = createBitmap;
        this.f26942x = null;
        this.f26943y = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
