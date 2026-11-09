package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import java.util.Arrays;
public abstract class q4 extends View implements org.telegram.ui.Components.pf0 {
    public final GradientDrawable[] D;
    public final boolean[] E;
    public final float[] F;
    public float G;
    public float[] H;
    public long I;
    public float J;
    public int K;
    public float L;
    public int M;
    public float N;
    public int O;
    public org.telegram.ui.Components.tf0 P;
    public final TextPaint Q;
    public float R;
    public int S;
    public String T;
    public final RectF f48882a;
    public int f48883b;
    public final Rect f48884c;
    public final Rect d;
    public final RectF f48885e;
    public final GradientDrawable f48886f;
    public final GradientDrawable h;
    public final float[] f48887n;
    public final Paint f48888r;
    public final Paint f48889s;
    public final Paint f48890w;
    public final Path f48891x;
    public final RectF f48892y;

    public q4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f48882a = new RectF();
        this.f48883b = 1;
        this.f48884c = new Rect();
        this.d = new Rect();
        this.f48885e = new RectF();
        this.f48887n = new float[]{0.0f, 1.0f};
        this.f48891x = new Path();
        this.f48892y = new RectF();
        this.D = new GradientDrawable[2];
        this.E = new boolean[2];
        this.F = new float[2];
        this.G = 0.0f;
        this.H = null;
        this.K = -1;
        this.O = 1;
        this.S = -1;
        Paint paint = new Paint(1);
        this.f48889s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f48890w = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f48886f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            } else {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            }
            this.D[i7] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.D[i7].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f48888r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40461j);
        ofFloat.addUpdateListener(new a3(this, 1));
        ofFloat.addListener(new m.a(this, 15));
        TextPaint textPaint = new TextPaint(1);
        this.Q = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
    }

    private String getCurrentTitle() {
        if (this.S != this.P.getCurrentItem()) {
            this.T = ((String) this.P.getAdapter().d(this.P.getCurrentItem())).toString();
            this.S = this.P.getCurrentItem();
        }
        return this.T;
    }

    @Override
    public final void a() {
        Arrays.fill(this.E, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z9) {
        this.E[!z9 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.tf0 getProfileGalleryView() {
        return this.P;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Path path = this.f48891x;
        path.reset();
        RectF rectF = this.f48892y;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.f48884c;
        rect.set(0, 0, i7, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i7, i10);
        this.f48886f.setBounds(0, rect.bottom, i7, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i10 - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i7, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.D;
        int i13 = i7 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i7 - i13, 0, i7, i10);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.tf0 tf0Var) {
        this.P = tf0Var;
    }

    public void c() {
    }
}
