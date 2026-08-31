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
public final class n11 extends FrameLayout {
    public boolean B;
    public boolean C;
    public boolean D;
    public final DecelerateInterpolator E;
    public final ThemeEditorView.EditorAlert F;
    public final LinearLayout f29365a;
    public final int f29366b;
    public final Paint f29367c;
    public final Paint d;
    public final Paint f29368e;
    public final Drawable f29369f;
    public Bitmap h;
    public final EditTextBoldCursor[] f29370n;
    public int f29371r;
    public final float[] f29372s;
    public float v;
    public final float[] f29373w;
    public LinearGradient f29374x;
    public LinearGradient f29375y;

    public n11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        int i10;
        float f10;
        this.F = editorAlert;
        this.f29366b = AndroidUtilities.dp(20.0f);
        this.f29370n = new EditTextBoldCursor[4];
        this.f29372s = new float[]{0.0f, 0.0f, 1.0f};
        this.v = 1.0f;
        this.f29373w = new float[3];
        this.E = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.f29368e = new Paint(1);
        this.f29369f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        Paint paint = new Paint();
        this.f29367c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f29365a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.c6.e(-2, -2, 49));
        for (int i11 = 0; i11 < 4; i11++) {
            this.f29370n[i11] = new EditTextBoldCursor(context);
            this.f29370n[i11].setInputType(2);
            this.f29370n[i11].setTextColor(-14606047);
            this.f29370n[i11].setCursorColor(-14606047);
            this.f29370n[i11].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f29370n[i11].setCursorWidth(1.5f);
            this.f29370n[i11].setTextSize(1, 18.0f);
            this.f29370n[i11].setBackground(null);
            this.f29370n[i11].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21960u5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21978v5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
            this.f29370n[i11].setMaxLines(1);
            this.f29370n[i11].setTag(Integer.valueOf(i11));
            this.f29370n[i11].setGravity(17);
            if (i11 == 0) {
                this.f29370n[i11].setHint("red");
            } else if (i11 == 1) {
                this.f29370n[i11].setHint("green");
            } else if (i11 == 2) {
                this.f29370n[i11].setHint("blue");
            } else if (i11 == 3) {
                this.f29370n[i11].setHint("alpha");
            }
            EditTextBoldCursor editTextBoldCursor = this.f29370n[i11];
            if (i11 == 3) {
                i10 = 6;
            } else {
                i10 = 5;
            }
            editTextBoldCursor.setImeOptions(i10 | 268435456);
            this.f29370n[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            LinearLayout linearLayout2 = this.f29365a;
            EditTextBoldCursor editTextBoldCursor2 = this.f29370n[i11];
            if (i11 != 3) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            linearLayout2.addView(editTextBoldCursor2, k7.c6.k(0.0f, 0.0f, f10, 0.0f, 55, 36));
            this.f29370n[i11].addTextChangedListener(new m11(this, i11));
            this.f29370n[i11].setOnEditorActionListener(new dg.a0(4));
        }
    }

    public final void a(Canvas canvas, int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(13.0f);
        Drawable drawable = this.f29369f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.f29368e;
        paint.setColor(-1);
        float f10 = i10;
        float f11 = i11;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(11.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.f29372s) & 16777215) | (((int) (this.v * 255.0f)) << 24);
    }

    public final void c(int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        ThemeEditorView.EditorAlert editorAlert = this.F;
        if (!editorAlert.H) {
            editorAlert.H = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.f29370n;
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
            editorAlert.H = false;
        }
        this.f29375y = null;
        this.f29374x = null;
        this.v = alpha / 255.0f;
        Color.colorToHSV(i10, this.f29372s);
        invalidate();
    }

    public final void d(boolean z4) {
        org.telegram.ui.ActionBar.g3 g3Var;
        int i10;
        ViewGroup viewGroup;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.F;
        if (editorAlert.G == z4) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.G = z4;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.F = animatorSet2;
        g3Var = ((org.telegram.ui.ActionBar.h3) editorAlert).backDrawable;
        l6 l6Var = n6.d;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 51;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var, l6Var, i10);
        viewGroup = ((org.telegram.ui.ActionBar.h3) editorAlert).containerView;
        if (z4) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, View.ALPHA, f10));
        editorAlert.F.setDuration(150L);
        editorAlert.F.setInterpolator(this.E);
        editorAlert.F.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c3;
        int i10 = this.f29366b;
        int width = (getWidth() / 2) - (i10 * 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        Bitmap bitmap = this.h;
        int i11 = this.f29371r;
        canvas.drawBitmap(bitmap, width - i11, height - i11, (Paint) null);
        float[] fArr = this.f29372s;
        double radians = (float) Math.toRadians(fArr[0]);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.f29373w;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, ((int) ((-Math.cos(radians)) * fArr[1] * this.f29371r)) + width, ((int) ((-Math.sin(radians)) * f10 * this.f29371r)) + height, Color.HSVToColor(fArr2));
        int i12 = this.f29371r;
        int i13 = width + i12 + i10;
        int i14 = height - i12;
        int dp = AndroidUtilities.dp(9.0f);
        int i15 = this.f29371r * 2;
        if (this.f29374x == null) {
            c3 = 2;
            this.f29374x = new LinearGradient(i13, i14, i13 + dp, i14 + i15, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c3 = 2;
        }
        LinearGradient linearGradient = this.f29374x;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i14;
        float f13 = i14 + i15;
        canvas.drawRect(i13, f12, i13 + dp, f13, paint);
        int i16 = dp / 2;
        float f14 = i15;
        a(canvas, i13 + i16, (int) ((fArr[c3] * f14) + f12), Color.HSVToColor(fArr));
        int i17 = (i10 * 2) + i13;
        if (this.f29375y == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.f29375y = new LinearGradient(i17, f12, i17 + dp, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.f29375y);
        canvas.drawRect(i17, f12, dp + i17, f13, paint);
        a(canvas, i17 + i16, (int) e2.c.w(1.0f, this.v, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.v * 255.0f)) << 24));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        measureChild(this.f29365a, i10, i11);
        setMeasuredDimension(min, min);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int c3 = l.d.c(20.0f, (i10 / 2) - (this.f29366b * 2), 1);
        this.f29371r = c3;
        int i14 = c3 * 2;
        int i15 = c3 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i16 = 0; i16 < 13; i16++) {
            fArr[0] = ((i16 * 30) + 180) % 360;
            iArr[i16] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f10 = i14 / 2;
        float f11 = i15 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f10, f11, iArr, (float[]) null), new RadialGradient(f10, f11, this.f29371r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.f29367c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f10, f11, this.f29371r, paint);
        this.h = createBitmap;
        this.f29374x = null;
        this.f29375y = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
