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
public abstract class q4 extends View implements org.telegram.ui.Components.rf0 {
    public final GradientDrawable[] E;
    public final boolean[] F;
    public final float[] G;
    public float H;
    public float[] I;
    public long J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public org.telegram.ui.Components.vf0 Q;
    public final TextPaint R;
    public float S;
    public int T;
    public String U;
    public final RectF f50450a;
    public int f50451b;
    public final Rect f50452c;
    public final Rect d;
    public final RectF f50453e;
    public final GradientDrawable f50454f;
    public final GradientDrawable h;
    public final float[] f50455n;
    public final Paint f50456r;
    public final Paint f50457s;
    public final Paint f50458w;
    public final Path f50459x;
    public final RectF f50460y;

    public q4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f50450a = new RectF();
        this.f50451b = 1;
        this.f50452c = new Rect();
        this.d = new Rect();
        this.f50453e = new RectF();
        this.f50455n = new float[]{0.0f, 1.0f};
        this.f50459x = new Path();
        this.f50460y = new RectF();
        this.E = new GradientDrawable[2];
        this.F = new boolean[2];
        this.G = new float[2];
        this.H = 0.0f;
        this.I = null;
        this.L = -1;
        this.P = 1;
        this.T = -1;
        Paint paint = new Paint(1);
        this.f50457s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f50458w = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f50454f = gradientDrawable;
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
            this.E[i7] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.E[i7].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f50456r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.er.f34422j);
        ofFloat.addUpdateListener(new a3(this, 1));
        ofFloat.addListener(new ki.s3(this, 16));
        TextPaint textPaint = new TextPaint(1);
        this.R = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
    }

    private String getCurrentTitle() {
        if (this.T != this.Q.getCurrentItem()) {
            this.U = ((String) this.Q.getAdapter().d(this.Q.getCurrentItem())).toString();
            this.T = this.Q.getCurrentItem();
        }
        return this.U;
    }

    @Override
    public final void a() {
        Arrays.fill(this.F, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.F[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.vf0 getProfileGalleryView() {
        return this.Q;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Path path = this.f50459x;
        path.reset();
        RectF rectF = this.f50460y;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.f50452c;
        rect.set(0, 0, i7, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i7, i10);
        this.f50454f.setBounds(0, rect.bottom, i7, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i10 - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i7, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.E;
        int i13 = i7 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i7 - i13, 0, i7, i10);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.vf0 vf0Var) {
        this.Q = vf0Var;
    }

    @Override
    public void c() {
    }
}
