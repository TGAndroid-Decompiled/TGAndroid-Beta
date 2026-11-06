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
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.zg0;
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
    public final zg0 U;
    public final Drawable V;
    public final o0 W;
    public final FabBackgroundDrawable f39096a;
    public final Paint f39097a0;
    public final FabBackgroundDrawable f39098b;
    public ValueAnimator f39099b0;
    public final Drawable f39100c;
    public final Drawable d;
    public final StaticLayout f39101e;
    public final StaticLayout f39102f;
    public final StaticLayout h;
    public final ic f39103n;
    public final ic f39104r;
    public b f39105s;
    public final int f39106w;
    public float f39107x;
    public float f39108y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f39103n = new ic(this);
        this.f39104r = new ic(this);
        this.D = true;
        this.E = true;
        this.M = new Rect();
        this.N = new Rect();
        this.T = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f39097a0 = paint2;
        o0 o0Var = new o0(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(8.0f), 4);
        this.W = o0Var;
        o0Var.h = true;
        o0Var.f39379i = 0.0f;
        o0Var.d = 0.0f;
        o0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = org.telegram.messenger.g0.L(60.0f);
        this.f39106w = L;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f39096a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f39098b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, L, L);
        fabBackgroundDrawable.setBounds(0, 0, L, L);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint.setColor(-1);
        String M0 = hd.M0(2131754716, null);
        String M02 = hd.M0(2131751604, null);
        String M03 = hd.M0(2131746052, null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f39101e = new StaticLayout(M0, textPaint, (int) textPaint.measureText(M0), alignment, 1.0f, 0.0f, false);
        this.f39102f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.f39100c = activity.getDrawable(2131230918).mutate();
        Drawable mutate = activity.getDrawable(2131231269).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        zg0 zg0Var = new zg0(2131623956, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.U = zg0Var;
        zg0Var.K(1);
        zg0Var.P(90);
        zg0Var.R(this);
        this.V = activity.getDrawable(2131230926).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, i0.a.o(-1, 76));
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
        if (this.f39105s == null) {
            this.f39105s = new b(this, this);
        }
        return this.f39105s;
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
        ValueAnimator valueAnimator = this.f39099b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39099b0 = null;
            this.U.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        float f10;
        Rect rect2;
        if (!this.R) {
            if (this.D) {
                float L = (org.telegram.messenger.g0.L(2.0f) * 0.04f) + this.f39107x;
                this.f39107x = L;
                if (L > org.telegram.messenger.g0.L(4.0f)) {
                    this.f39107x = org.telegram.messenger.g0.L(4.0f);
                    this.D = false;
                }
            } else {
                float L2 = this.f39107x - (org.telegram.messenger.g0.L(2.0f) * 0.04f);
                this.f39107x = L2;
                if (L2 < 0.0f) {
                    this.f39107x = 0.0f;
                    this.D = true;
                }
            }
            if (this.E) {
                float L3 = (org.telegram.messenger.g0.L(4.0f) * 0.03f) + this.f39108y;
                this.f39108y = L3;
                if (L3 > org.telegram.messenger.g0.L(10.0f)) {
                    this.f39108y = org.telegram.messenger.g0.L(10.0f);
                    this.E = false;
                }
            } else {
                float L4 = this.f39108y - (org.telegram.messenger.g0.L(5.0f) * 0.03f);
                this.f39108y = L4;
                if (L4 < org.telegram.messenger.g0.L(5.0f)) {
                    this.f39108y = org.telegram.messenger.g0.L(5.0f);
                    this.E = true;
                }
            }
            invalidate();
        }
        this.f39108y = (org.telegram.messenger.g0.L(8.0f) * 0.005f) + this.f39108y;
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f39106w;
        this.N.set(k5.z(46.0f, measuredWidth, i7), org.telegram.messenger.g0.L(40.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(40.0f) + i7);
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(40.0f));
        canvas.save();
        float a10 = this.f39104r.a(0.1f);
        float f11 = i7;
        float f12 = f11 / 2.0f;
        canvas.scale(a10, a10, rect.centerX(), rect.top + f12);
        canvas.translate(((this.K + getMeasuredWidth()) - org.telegram.messenger.g0.L(46.0f)) - f11, 0.0f);
        boolean z9 = this.R;
        FabBackgroundDrawable fabBackgroundDrawable = this.f39098b;
        if (z9) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.f39097a0);
                }
            }
            canvas.restore();
        } else {
            f10 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f39100c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f39102f;
        canvas.translate(f12 - (staticLayout.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.G) {
            this.S.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f));
            this.S.draw(canvas);
        }
        canvas.restore();
        this.M.set(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(46.0f) + i7, org.telegram.messenger.g0.L(40.0f) + i7);
        canvas.save();
        float a11 = this.f39103n.a(0.1f);
        canvas.scale(a11, a11, rect2.centerX(), rect2.top + f12);
        canvas.translate(this.J + org.telegram.messenger.g0.L(46.0f), 0.0f);
        if (!this.R) {
            o0 o0Var = this.W;
            o0Var.c();
            float f13 = (int) f12;
            o0Var.a(canvas, f13, f13, this);
        }
        this.f39096a.draw(canvas);
        if (this.R) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.f39101e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        this.U.draw(canvas);
        canvas.restore();
        if (!this.G) {
            this.S.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f));
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
        b bVar = this.f39105s;
        if (bVar != null) {
            Rect rect = bVar.f39065c;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.f39066e != -1) {
                    bVar.f39066e = -1;
                    return true;
                }
            } else {
                for (int i7 = 0; i7 < bVar.f39064b; i7++) {
                    e eVar = bVar.f39053g;
                    if (i7 == 0) {
                        rect.set(eVar.M);
                    } else if (i7 == 1) {
                        rect.set(eVar.N);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y10)) {
                        if (i7 != bVar.f39066e) {
                            bVar.f39066e = i7;
                            bVar.a(i7);
                        }
                        return true;
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int i11 = this.f39106w;
        this.L = (getMeasuredWidth() / 2.0f) - ((i11 / 2.0f) + org.telegram.messenger.g0.L(46.0f));
        int y10 = org.telegram.messenger.camera.q.y(28.0f, i11, 2);
        this.f39100c.setBounds(y10, y10, org.telegram.messenger.g0.L(28.0f) + y10, org.telegram.messenger.g0.L(28.0f) + y10);
        this.d.setBounds(y10, y10, org.telegram.messenger.g0.L(28.0f) + y10, org.telegram.messenger.g0.L(28.0f) + y10);
        Paint paint = this.T;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(d dVar) {
        this.Q = dVar;
    }

    public void setRetryMod(boolean z9) {
        this.R = z9;
        FabBackgroundDrawable fabBackgroundDrawable = this.f39098b;
        if (z9) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.U.start();
        o0 o0Var = this.W;
        if (!o0Var.f39376e) {
            invalidate();
        }
        o0Var.f39376e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.f39099b0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.f39099b0.setDuration(1500L);
        this.f39099b0.setRepeatMode(1);
        this.f39099b0.setRepeatCount(-1);
        this.f39099b0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.S != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
