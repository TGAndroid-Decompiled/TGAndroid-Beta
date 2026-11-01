package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeProvider;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.dc;
public final class e extends View {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public final float I;
    public float J;
    public float K;
    public float L;
    public final Rect M;
    public final Rect N;
    public ValueAnimator O;
    public ValueAnimator P;
    public d Q;
    public boolean R;
    public org.telegram.ui.Cells.y S;
    public final Paint T;
    public final ci0 U;
    public final Drawable V;
    public final b0 W;
    public final FabBackgroundDrawable f31451a;
    public final Paint f31452a0;
    public final FabBackgroundDrawable f31453b;
    public ValueAnimator f31454b0;
    public final Drawable f31455c;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f31456f;
    public final StaticLayout h;
    public final dc f31457n;
    public final dc f31458r;
    public b f31459s;
    public final int f31460w;
    public float f31461x;
    public float f31462y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f31457n = new dc(this);
        this.f31458r = new dc(this);
        this.D = true;
        this.E = true;
        this.M = new Rect();
        this.N = new Rect();
        this.T = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f31452a0 = paint2;
        b0 b0Var = new b0(org.telegram.messenger.i0.L(45.0f), org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(8.0f), 4);
        this.W = b0Var;
        b0Var.h = true;
        b0Var.f31390i = 0.0f;
        b0Var.d = 0.0f;
        b0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = org.telegram.messenger.i0.L(60.0f);
        this.f31460w = L;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f31451a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f31453b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, L, L);
        fabBackgroundDrawable.setBounds(0, 0, L, L);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
        textPaint.setColor(-1);
        String L0 = dd.L0(2131754716, null);
        String L02 = dd.L0(2131751604, null);
        String L03 = dd.L0(2131746068, null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.e = new StaticLayout(L0, textPaint, (int) textPaint.measureText(L0), alignment, 1.0f, 0.0f, false);
        this.f31456f = new StaticLayout(L02, textPaint, (int) textPaint.measureText(L02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(L03, textPaint, (int) textPaint.measureText(L03), alignment, 1.0f, 0.0f, false);
        this.f31455c = activity.getDrawable(2131230918).mutate();
        Drawable mutate = activity.getDrawable(2131231270).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        ci0 ci0Var = new ci0(2131623956, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), true, null);
        this.U = ci0Var;
        ci0Var.K(1);
        ci0Var.P(90);
        ci0Var.R(this);
        this.V = activity.getDrawable(2131230926).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y j02 = t6.j0(org.telegram.messenger.i0.L(52.0f), 0, i0.b.o(-1, 76));
        this.S = j02;
        j02.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.S.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f31459s == null) {
            this.f31459s = new b(this, this);
        }
        return this.f31459s;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.S;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f31454b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31454b0 = null;
            this.U.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        float f7;
        Rect rect2;
        if (!this.R) {
            if (this.D) {
                float L = (org.telegram.messenger.i0.L(2.0f) * 0.04f) + this.f31461x;
                this.f31461x = L;
                if (L > org.telegram.messenger.i0.L(4.0f)) {
                    this.f31461x = org.telegram.messenger.i0.L(4.0f);
                    this.D = false;
                }
            } else {
                float L2 = this.f31461x - (org.telegram.messenger.i0.L(2.0f) * 0.04f);
                this.f31461x = L2;
                if (L2 < 0.0f) {
                    this.f31461x = 0.0f;
                    this.D = true;
                }
            }
            if (this.E) {
                float L3 = (org.telegram.messenger.i0.L(4.0f) * 0.03f) + this.f31462y;
                this.f31462y = L3;
                if (L3 > org.telegram.messenger.i0.L(10.0f)) {
                    this.f31462y = org.telegram.messenger.i0.L(10.0f);
                    this.E = false;
                }
            } else {
                float L4 = this.f31462y - (org.telegram.messenger.i0.L(5.0f) * 0.03f);
                this.f31462y = L4;
                if (L4 < org.telegram.messenger.i0.L(5.0f)) {
                    this.f31462y = org.telegram.messenger.i0.L(5.0f);
                    this.E = true;
                }
            }
            invalidate();
        }
        this.f31462y = (org.telegram.messenger.i0.L(8.0f) * 0.005f) + this.f31462y;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f31460w;
        this.N.set(m5.z(46.0f, measuredWidth, i10), org.telegram.messenger.i0.L(40.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(40.0f) + i10);
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.i0.L(40.0f));
        canvas.save();
        float a2 = this.f31458r.a(0.1f);
        float f10 = i10;
        float f11 = f10 / 2.0f;
        canvas.scale(a2, a2, rect.centerX(), rect.top + f11);
        canvas.translate(((this.K + getMeasuredWidth()) - org.telegram.messenger.i0.L(46.0f)) - f10, 0.0f);
        boolean z10 = this.R;
        FabBackgroundDrawable fabBackgroundDrawable = this.f31453b;
        if (z10) {
            f7 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.f31452a0);
                }
            }
            canvas.restore();
        } else {
            f7 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f31455c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f31456f;
        canvas.translate(f11 - (staticLayout.getWidth() / f7), org.telegram.messenger.i0.L(4.0f) + i10);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.G) {
            this.S.setBounds(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), i10 - org.telegram.messenger.i0.L(4.0f), i10 - org.telegram.messenger.i0.L(4.0f));
            this.S.draw(canvas);
        }
        canvas.restore();
        this.M.set(org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(46.0f) + i10, org.telegram.messenger.i0.L(40.0f) + i10);
        canvas.save();
        float a10 = this.f31457n.a(0.1f);
        canvas.scale(a10, a10, rect2.centerX(), rect2.top + f11);
        canvas.translate(this.J + org.telegram.messenger.i0.L(46.0f), 0.0f);
        if (!this.R) {
            b0 b0Var = this.W;
            b0Var.c();
            float f12 = (int) f11;
            b0Var.a(canvas, f12, f12, this);
        }
        this.f31451a.draw(canvas);
        if (this.R) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f11 - (staticLayout2.getWidth() / f7), org.telegram.messenger.i0.L(4.0f) + i10);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f11 - (staticLayout3.getWidth() / f7), org.telegram.messenger.i0.L(4.0f) + i10);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        this.U.draw(canvas);
        canvas.restore();
        if (!this.G) {
            this.S.setBounds(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), i10 - org.telegram.messenger.i0.L(4.0f), i10 - org.telegram.messenger.i0.L(4.0f));
            this.S.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.F) {
            invalidate();
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        b bVar = this.f31459s;
        if (bVar != null) {
            Rect rect = bVar.f31397c;
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.e != -1) {
                    bVar.e = -1;
                    return true;
                }
            } else {
                for (int i10 = 0; i10 < bVar.f31396b; i10++) {
                    e eVar = bVar.f31384g;
                    if (i10 == 0) {
                        rect.set(eVar.M);
                    } else if (i10 == 1) {
                        rect.set(eVar.N);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y3)) {
                        if (i10 != bVar.e) {
                            bVar.e = i10;
                            bVar.a(i10);
                        }
                        return true;
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f31460w;
        this.L = (getMeasuredWidth() / 2.0f) - ((i12 / 2.0f) + org.telegram.messenger.i0.L(46.0f));
        int y3 = a30.y(28.0f, i12, 2);
        this.f31455c.setBounds(y3, y3, org.telegram.messenger.i0.L(28.0f) + y3, org.telegram.messenger.i0.L(28.0f) + y3);
        this.d.setBounds(y3, y3, org.telegram.messenger.i0.L(28.0f) + y3, org.telegram.messenger.i0.L(28.0f) + y3);
        Paint paint = this.T;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(d dVar) {
        this.Q = dVar;
    }

    public void setRetryMod(boolean z10) {
        this.R = z10;
        FabBackgroundDrawable fabBackgroundDrawable = this.f31453b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.U.start();
        b0 b0Var = this.W;
        if (!b0Var.e) {
            invalidate();
        }
        b0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.f31454b0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.f31454b0.setDuration(1500L);
        this.f31454b0.setRepeatMode(1);
        this.f31454b0.setRepeatCount(-1);
        this.f31454b0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.S != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
