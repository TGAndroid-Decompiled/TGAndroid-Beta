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
import org.telegram.messenger.AndroidUtilities;
public abstract class q4 extends View implements org.telegram.ui.Components.vg0 {
    public final boolean[] A;
    public final float[] B;
    public float C;
    public float[] D;
    public long E;
    public float F;
    public int G;
    public float H;
    public int I;
    public float J;
    public int K;
    public org.telegram.ui.Components.ah0 L;
    public final TextPaint M;
    public float N;
    public int O;
    public String P;
    public final RectF f41664a;
    public int f41665b;
    public final Rect f41666c;
    public final Rect d;
    public final RectF f41667e;
    public final GradientDrawable f41668f;
    public final GradientDrawable h;
    public final float[] f41669n;
    public final Paint f41670r;
    public final Paint f41671s;
    public final Paint v;
    public final Path f41672w;
    public final RectF f41673x;
    public final GradientDrawable[] f41674y;

    public q4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f41664a = new RectF();
        this.f41665b = 1;
        this.f41666c = new Rect();
        this.d = new Rect();
        this.f41667e = new RectF();
        this.f41669n = new float[]{0.0f, 1.0f};
        this.f41672w = new Path();
        this.f41673x = new RectF();
        this.f41674y = new GradientDrawable[2];
        this.A = new boolean[2];
        this.B = new float[2];
        this.C = 0.0f;
        this.D = null;
        this.G = -1;
        this.K = 1;
        this.O = -1;
        Paint paint = new Paint(1);
        this.f41671s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f41668f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            } else {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            }
            this.f41674y[i9] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.f41674y[i9].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f41670r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f28847j);
        ofFloat.addUpdateListener(new f3(this, 1));
        ofFloat.addListener(new mh.x(this, 5));
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    private String getCurrentTitle() {
        if (this.O != this.L.getCurrentItem()) {
            this.P = ((String) this.L.getAdapter().d(this.L.getCurrentItem())).toString();
            this.O = this.L.getCurrentItem();
        }
        return this.P;
    }

    @Override
    public final void a() {
        Arrays.fill(this.A, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.A[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.ah0 getProfileGalleryView() {
        return this.L;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Path path = this.f41672w;
        path.reset();
        RectF rectF = this.f41673x;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.f41666c;
        rect.set(0, 0, i9, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i10 - (AndroidUtilities.dp(72.0f) * 0.5f)), i9, i10);
        this.f41668f.setBounds(0, rect.bottom, i9, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i10 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i9, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f41674y;
        int i13 = i9 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i9 - i13, 0, i9, i10);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.ah0 ah0Var) {
        this.L = ah0Var;
    }

    public void c() {
    }
}
