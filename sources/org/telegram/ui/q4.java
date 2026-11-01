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
public abstract class q4 extends View implements org.telegram.ui.Components.rg0 {
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
    public org.telegram.ui.Components.vg0 P;
    public final TextPaint Q;
    public float R;
    public int S;
    public String T;
    public final RectF f40677a;
    public int f40678b;
    public final Rect f40679c;
    public final Rect d;
    public final RectF e;
    public final GradientDrawable f40680f;
    public final GradientDrawable h;
    public final float[] f40681n;
    public final Paint f40682r;
    public final Paint f40683s;
    public final Paint f40684w;
    public final Path f40685x;
    public final RectF f40686y;

    public q4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f40677a = new RectF();
        this.f40678b = 1;
        this.f40679c = new Rect();
        this.d = new Rect();
        this.e = new RectF();
        this.f40681n = new float[]{0.0f, 1.0f};
        this.f40685x = new Path();
        this.f40686y = new RectF();
        this.D = new GradientDrawable[2];
        this.E = new boolean[2];
        this.F = new float[2];
        this.G = 0.0f;
        this.H = null;
        this.K = -1;
        this.O = 1;
        this.S = -1;
        Paint paint = new Paint(1);
        this.f40683s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f40684w = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f40680f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            } else {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            }
            this.D[i10] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.D[i10].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f40682r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f26526j);
        ofFloat.addUpdateListener(new a3(this, 1));
        ofFloat.addListener(new bg.e(this, 26));
        TextPaint textPaint = new TextPaint(1);
        this.Q = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.i0.N(15.0f));
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
    public final void b(boolean z10) {
        this.E[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.vg0 getProfileGalleryView() {
        return this.P;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.f40685x;
        path.reset();
        RectF rectF = this.f40686y;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        Rect rect = this.f40679c;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i11 - (org.telegram.messenger.i0.L(72.0f) * 0.5f)), i10, i11);
        this.f40680f.setBounds(0, rect.bottom, i10, org.telegram.messenger.i0.L(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i11 - org.telegram.messenger.i0.L(72.0f)) - org.telegram.messenger.i0.L(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.D;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.vg0 vg0Var) {
        this.P = vg0Var;
    }

    @Override
    public void c() {
    }
}
