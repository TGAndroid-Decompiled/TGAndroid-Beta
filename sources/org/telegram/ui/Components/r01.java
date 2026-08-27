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
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class r01 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public final DecelerateInterpolator D;
    public final ThemeEditorView.EditorAlert E;

    public final LinearLayout f32021a;

    public final int f32022b;

    public final Paint f32023c;
    public final Paint d;

    public final Paint f32024e;

    public final Drawable f32025f;
    public Bitmap h;

    public final EditTextBoldCursor[] f32026n;

    public int f32027r;

    public final float[] f32028s;
    public float v;

    public final float[] f32029w;

    public LinearGradient f32030x;

    public LinearGradient f32031y;

    public r01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.E = editorAlert;
        this.f32022b = AndroidUtilities.dp(20.0f);
        this.f32026n = new EditTextBoldCursor[4];
        this.f32028s = new float[]{0.0f, 0.0f, 1.0f};
        this.v = 1.0f;
        this.f32029w = new float[3];
        this.D = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.f32024e = new Paint(1);
        this.f32025f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        Paint paint = new Paint();
        this.f32023c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32021a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, h7.z5.e(-2, -2, 49));
        int i10 = 0;
        while (i10 < 4) {
            this.f32026n[i10] = new EditTextBoldCursor(context);
            this.f32026n[i10].setInputType(2);
            this.f32026n[i10].setTextColor(-14606047);
            this.f32026n[i10].setCursorColor(-14606047);
            this.f32026n[i10].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f32026n[i10].setCursorWidth(1.5f);
            this.f32026n[i10].setTextSize(1, 18.0f);
            this.f32026n[i10].setBackground(null);
            this.f32026n[i10].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23356u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23372v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            this.f32026n[i10].setMaxLines(1);
            this.f32026n[i10].setTag(Integer.valueOf(i10));
            this.f32026n[i10].setGravity(17);
            if (i10 == 0) {
                this.f32026n[i10].setHint("red");
            } else if (i10 == 1) {
                this.f32026n[i10].setHint("green");
            } else if (i10 == 2) {
                this.f32026n[i10].setHint("blue");
            } else if (i10 == 3) {
                this.f32026n[i10].setHint("alpha");
            }
            this.f32026n[i10].setImeOptions((i10 == 3 ? 6 : 5) | 268435456);
            this.f32026n[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            this.f32021a.addView(this.f32026n[i10], h7.z5.k(0.0f, 0.0f, i10 != 3 ? 16.0f : 0.0f, 0.0f, 55, 36));
            this.f32026n[i10].addTextChangedListener(new q01(this, i10));
            this.f32026n[i10].setOnEditorActionListener(new o2(2));
            i10++;
        }
    }

    public final void a(Canvas canvas, int i10, int i11, int i12) {
        int iDp = AndroidUtilities.dp(13.0f);
        Drawable drawable = this.f32025f;
        drawable.setBounds(i10 - iDp, i11 - iDp, i10 + iDp, iDp + i11);
        drawable.draw(canvas);
        Paint paint = this.f32024e;
        paint.setColor(-1);
        float f10 = i10;
        float f11 = i11;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(11.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f32028s) & 16777215) | (((int) (this.v * 255.0f)) << 24);
    }

    public final void c(int i10) {
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        int iAlpha = Color.alpha(i10);
        ThemeEditorView.EditorAlert editorAlert = this.E;
        if (!editorAlert.G) {
            editorAlert.G = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f32026n;
            editTextBoldCursorArr[0].setText("" + iRed);
            editTextBoldCursorArr[1].setText("" + iGreen);
            editTextBoldCursorArr[2].setText("" + iBlue);
            editTextBoldCursorArr[3].setText("" + iAlpha);
            for (int i11 = 0; i11 < 4; i11++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            editorAlert.G = false;
        }
        this.f32031y = null;
        this.f32030x = null;
        this.v = iAlpha / 255.0f;
        Color.colorToHSV(i10, this.f32028s);
        invalidate();
    }

    public final void d(boolean z10) {
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
        animatorSet2.playTogether(ObjectAnimator.ofInt(((org.telegram.ui.ActionBar.e3) editorAlert).backDrawable, m6.d, z10 ? 0 : 51), ObjectAnimator.ofFloat(((org.telegram.ui.ActionBar.e3) editorAlert).containerView, (Property<ViewGroup, Float>) View.ALPHA, z10 ? 0.2f : 1.0f));
        editorAlert.E.setDuration(150L);
        editorAlert.E.setInterpolator(this.D);
        editorAlert.E.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c10;
        int width = getWidth() / 2;
        int i10 = this.f32022b;
        int i11 = width - (i10 * 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        Bitmap bitmap = this.h;
        int i12 = this.f32027r;
        canvas.drawBitmap(bitmap, i11 - i12, height - i12, (Paint) null);
        float[] fArr = this.f32028s;
        double radians = (float) Math.toRadians(fArr[0]);
        int i13 = ((int) ((-Math.cos(radians)) * ((double) fArr[1]) * ((double) this.f32027r))) + i11;
        double d = -Math.sin(radians);
        float f10 = fArr[1];
        int i14 = ((int) (d * ((double) f10) * ((double) this.f32027r))) + height;
        float f11 = fArr[0];
        float[] fArr2 = this.f32029w;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, i13, i14, Color.HSVToColor(fArr2));
        int i15 = this.f32027r;
        int i16 = i11 + i15 + i10;
        int i17 = height - i15;
        int iDp = AndroidUtilities.dp(9.0f);
        int i18 = this.f32027r * 2;
        if (this.f32030x == null) {
            c10 = 2;
            this.f32030x = new LinearGradient(i16, i17, i16 + iDp, i17 + i18, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.f32030x;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i17;
        float f13 = i17 + i18;
        canvas.drawRect(i16, f12, i16 + iDp, f13, paint);
        int i19 = iDp / 2;
        float f14 = i18;
        a(canvas, i16 + i19, (int) ((fArr[c10] * f14) + f12), Color.HSVToColor(fArr));
        int i20 = (i10 * 2) + i16;
        if (this.f32031y == null) {
            int iHSVToColor = Color.HSVToColor(fArr2);
            this.f32031y = new LinearGradient(i20, f12, i20 + iDp, f13, new int[]{iHSVToColor, iHSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.f32031y);
        canvas.drawRect(i20, f12, iDp + i20, f13, paint);
        a(canvas, i20 + i19, (int) com.google.android.recaptcha.internal.a.z(1.0f, this.v, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.v * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        measureChild(this.f32021a, i10, i11);
        setMeasuredDimension(iMin, iMin);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int iD = i0.a.d(20.0f, (i10 / 2) - (this.f32022b * 2), 1);
        this.f32027r = iD;
        int i14 = iD * 2;
        int i15 = iD * 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i16 = 0; i16 < 13; i16++) {
            fArr[0] = ((i16 * 30) + 180) % 360;
            iArr[i16] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f10 = i14 / 2;
        float f11 = i15 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f10, f11, iArr, (float[]) null), new RadialGradient(f10, f11, this.f32027r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f32023c;
        paint.setShader(composeShader);
        new Canvas(bitmapCreateBitmap).drawCircle(f10, f11, this.f32027r, paint);
        this.h = bitmapCreateBitmap;
        this.f32030x = null;
        this.f32031y = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
