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
public final class w11 extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final DecelerateInterpolator H;
    public final ThemeEditorView.EditorAlert I;
    public final LinearLayout f28626a;
    public final int f28627b;
    public final Paint f28628c;
    public final Paint d;
    public final Paint e;
    public final Drawable f28629f;
    public Bitmap h;
    public final EditTextBoldCursor[] f28630n;
    public int f28631r;
    public final float[] f28632s;
    public float v;
    public final float[] f28633w;
    public LinearGradient f28634x;
    public LinearGradient f28635y;

    public w11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i10;
        float f7;
        this.I = editorAlert;
        this.f28627b = AndroidUtilities.dp(20.0f);
        this.f28630n = new EditTextBoldCursor[4];
        this.f28632s = new float[]{0.0f, 0.0f, 1.0f};
        this.v = 1.0f;
        this.f28633w = new float[3];
        this.H = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.e = new Paint(1);
        this.f28629f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        Paint paint = new Paint();
        this.f28628c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28626a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.a6.e(-2, -2, 49));
        for (int i11 = 0; i11 < 4; i11++) {
            this.f28630n[i11] = new EditTextBoldCursor(context);
            this.f28630n[i11].setInputType(2);
            this.f28630n[i11].setTextColor(-14606047);
            this.f28630n[i11].setCursorColor(-14606047);
            this.f28630n[i11].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f28630n[i11].setCursorWidth(1.5f);
            this.f28630n[i11].setTextSize(1, 18.0f);
            this.f28630n[i11].setBackground(null);
            this.f28630n[i11].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18235u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18253v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            this.f28630n[i11].setMaxLines(1);
            this.f28630n[i11].setTag(Integer.valueOf(i11));
            this.f28630n[i11].setGravity(17);
            if (i11 == 0) {
                this.f28630n[i11].setHint("red");
            } else if (i11 == 1) {
                this.f28630n[i11].setHint("green");
            } else if (i11 == 2) {
                this.f28630n[i11].setHint("blue");
            } else if (i11 == 3) {
                this.f28630n[i11].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.f28630n[i11];
            if (i11 == 3) {
                i10 = 6;
            } else {
                i10 = 5;
            }
            editTextBoldCursor.setImeOptions(i10 | 268435456);
            this.f28630n[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.f28626a;
            EditTextBoldCursor editTextBoldCursor2 = this.f28630n[i11];
            if (i11 != 3) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, w7.a6.k(0.0f, 0.0f, f7, 0.0f, 55, 36));
            this.f28630n[i11].addTextChangedListener(new v11(this, i11));
            this.f28630n[i11].setOnEditorActionListener(new og.w(4));
        }
    }

    public final void a(Canvas canvas, int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(13.0f);
        Drawable drawable = this.f28629f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.e;
        paint.setColor(-1);
        float f7 = i10;
        float f10 = i11;
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(11.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f28632s) & 16777215) | (((int) (this.v * 255.0f)) << 24);
    }

    public final void c(int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (!editorAlert.K) {
            editorAlert.K = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f28630n;
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
            editorAlert.K = false;
        }
        this.f28635y = null;
        this.f28634x = null;
        this.v = alpha / 255.0f;
        Color.colorToHSV(i10, this.f28632s);
        invalidate();
    }

    public final void d(boolean z10) {
        org.telegram.ui.ActionBar.g3 g3Var;
        int i10;
        ViewGroup viewGroup;
        float f7;
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (editorAlert.J == z10) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.J = z10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.I = animatorSet2;
        g3Var = ((org.telegram.ui.ActionBar.h3) editorAlert).backDrawable;
        p6 p6Var = r6.d;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var, p6Var, i10);
        viewGroup = ((org.telegram.ui.ActionBar.h3) editorAlert).containerView;
        if (z10) {
            f7 = 0.2f;
        } else {
            f7 = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f7));
        editorAlert.I.setDuration(150L);
        editorAlert.I.setInterpolator(this.H);
        editorAlert.I.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c10;
        int i10 = this.f28627b;
        int width = (getWidth() / 2) - (i10 * 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        Bitmap bitmap = this.h;
        int i11 = this.f28631r;
        canvas.drawBitmap(bitmap, width - i11, height - i11, (Paint) null);
        float[] fArr = this.f28632s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f7 = fArr[1];
        float f10 = fArr[0];
        float[] fArr2 = this.f28633w;
        fArr2[0] = f10;
        fArr2[1] = f7;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.f28631r)) + width, ((int) ((-Math.sin(radians)) * f7 * this.f28631r)) + height, Color.HSVToColor(fArr2));
        int i12 = this.f28631r;
        int i13 = width + i12 + i10;
        int i14 = height - i12;
        int dp = AndroidUtilities.dp(9.0f);
        int i15 = this.f28631r * 2;
        if (this.f28634x == null) {
            c10 = 2;
            this.f28634x = new LinearGradient(i13, i14, i13 + dp, i14 + i15, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.f28634x;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f11 = i14;
        float f12 = i14 + i15;
        canvas.drawRect(i13, f11, i13 + dp, f12, paint);
        int i16 = dp / 2;
        float f13 = i15;
        a(canvas, i13 + i16, (int) ((fArr[c10] * f13) + f11), Color.HSVToColor(fArr));
        int i17 = (i10 * 2) + i13;
        if (this.f28635y == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.f28635y = new LinearGradient(i17, f11, i17 + dp, f12, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.f28635y);
        canvas.drawRect(i17, f11, dp + i17, f12, paint);
        a(canvas, i17 + i16, (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.v, f13, f11), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.v * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        measureChild(this.f28626a, i10, i11);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int g10 = hc.b.g(20.0f, (i10 / 2) - (this.f28627b * 2), 1);
        this.f28631r = g10;
        int i14 = g10 * 2;
        int i15 = g10 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i16 = 0; i16 < 13; i16++) {
            fArr[0] = ((i16 * 30) + 180) % 360;
            iArr[i16] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f7 = i14 / 2;
        float f10 = i15 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f7, f10, iArr, (float[]) null), new RadialGradient(f7, f10, this.f28631r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f28628c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f7, f10, this.f28631r, paint);
        this.h = createBitmap;
        this.f28634x = null;
        this.f28635y = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
