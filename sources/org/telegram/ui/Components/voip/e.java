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
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ic;
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
    public final ah0 U;
    public final Drawable V;
    public final o0 W;
    public final FabBackgroundDrawable f39241a;
    public final Paint f39242a0;
    public final FabBackgroundDrawable f39243b;
    public ValueAnimator f39244b0;
    public final Drawable f39245c;
    public final Drawable d;
    public final StaticLayout f39246e;
    public final StaticLayout f39247f;
    public final StaticLayout h;
    public final ic f39248n;
    public final ic f39249r;
    public b f39250s;
    public final int f39251w;
    public float f39252x;
    public float f39253y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f39248n = new ic(this);
        this.f39249r = new ic(this);
        this.D = true;
        this.E = true;
        this.M = new Rect();
        this.N = new Rect();
        this.T = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f39242a0 = paint2;
        o0 o0Var = new o0(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(8.0f), 4);
        this.W = o0Var;
        o0Var.h = true;
        o0Var.f39524i = 0.0f;
        o0Var.d = 0.0f;
        o0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = org.telegram.messenger.g0.L(60.0f);
        this.f39251w = L;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f39241a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f39243b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, L, L);
        fabBackgroundDrawable.setBounds(0, 0, L, L);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint.setColor(-1);
        String M0 = id.M0(2131754716, null);
        String M02 = id.M0(2131751603, null);
        String M03 = id.M0(2131746051, null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f39246e = new StaticLayout(M0, textPaint, (int) textPaint.measureText(M0), alignment, 1.0f, 0.0f, false);
        this.f39247f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.f39245c = activity.getDrawable(2131230918).mutate();
        Drawable mutate = activity.getDrawable(2131231269).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        ah0 ah0Var = new ah0(2131623956, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.U = ah0Var;
        ah0Var.K(1);
        ah0Var.P(90);
        ah0Var.R(this);
        this.V = activity.getDrawable(2131230926).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y j02 = l6.j0(org.telegram.messenger.g0.L(52.0f), 0, i0.a.o(-1, 76));
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
        if (this.f39250s == null) {
            this.f39250s = new b(this, this);
        }
        return this.f39250s;
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
        ValueAnimator valueAnimator = this.f39244b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39244b0 = null;
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
                float L = (org.telegram.messenger.g0.L(2.0f) * 0.04f) + this.f39252x;
                this.f39252x = L;
                if (L > org.telegram.messenger.g0.L(4.0f)) {
                    this.f39252x = org.telegram.messenger.g0.L(4.0f);
                    this.D = false;
                }
            } else {
                float L2 = this.f39252x - (org.telegram.messenger.g0.L(2.0f) * 0.04f);
                this.f39252x = L2;
                if (L2 < 0.0f) {
                    this.f39252x = 0.0f;
                    this.D = true;
                }
            }
            if (this.E) {
                float L3 = (org.telegram.messenger.g0.L(4.0f) * 0.03f) + this.f39253y;
                this.f39253y = L3;
                if (L3 > org.telegram.messenger.g0.L(10.0f)) {
                    this.f39253y = org.telegram.messenger.g0.L(10.0f);
                    this.E = false;
                }
            } else {
                float L4 = this.f39253y - (org.telegram.messenger.g0.L(5.0f) * 0.03f);
                this.f39253y = L4;
                if (L4 < org.telegram.messenger.g0.L(5.0f)) {
                    this.f39253y = org.telegram.messenger.g0.L(5.0f);
                    this.E = true;
                }
            }
            invalidate();
        }
        this.f39253y = (org.telegram.messenger.g0.L(8.0f) * 0.005f) + this.f39253y;
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f39251w;
        this.N.set(k5.z(46.0f, measuredWidth, i7), org.telegram.messenger.g0.L(40.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(40.0f) + i7);
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(40.0f));
        canvas.save();
        float a10 = this.f39249r.a(0.1f);
        float f11 = i7;
        float f12 = f11 / 2.0f;
        canvas.scale(a10, a10, rect.centerX(), rect.top + f12);
        canvas.translate(((this.K + getMeasuredWidth()) - org.telegram.messenger.g0.L(46.0f)) - f11, 0.0f);
        boolean z9 = this.R;
        FabBackgroundDrawable fabBackgroundDrawable = this.f39243b;
        if (z9) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.f39242a0);
                }
            }
            canvas.restore();
        } else {
            f10 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f39245c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f39247f;
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
        float a11 = this.f39248n.a(0.1f);
        canvas.scale(a11, a11, rect2.centerX(), rect2.top + f12);
        canvas.translate(this.J + org.telegram.messenger.g0.L(46.0f), 0.0f);
        if (!this.R) {
            o0 o0Var = this.W;
            o0Var.c();
            float f13 = (int) f12;
            o0Var.a(canvas, f13, f13, this);
        }
        this.f39241a.draw(canvas);
        if (this.R) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.f39246e;
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
        b bVar = this.f39250s;
        if (bVar != null) {
            Rect rect = bVar.f39210c;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.f39211e != -1) {
                    bVar.f39211e = -1;
                    return true;
                }
            } else {
                for (int i7 = 0; i7 < bVar.f39209b; i7++) {
                    e eVar = bVar.f39198g;
                    if (i7 == 0) {
                        rect.set(eVar.M);
                    } else if (i7 == 1) {
                        rect.set(eVar.N);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y10)) {
                        if (i7 != bVar.f39211e) {
                            bVar.f39211e = i7;
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
        int i11 = this.f39251w;
        this.L = (getMeasuredWidth() / 2.0f) - ((i11 / 2.0f) + org.telegram.messenger.g0.L(46.0f));
        int y10 = org.telegram.messenger.camera.q.y(28.0f, i11, 2);
        this.f39245c.setBounds(y10, y10, org.telegram.messenger.g0.L(28.0f) + y10, org.telegram.messenger.g0.L(28.0f) + y10);
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
        FabBackgroundDrawable fabBackgroundDrawable = this.f39243b;
        if (z9) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.U.start();
        o0 o0Var = this.W;
        if (!o0Var.f39521e) {
            invalidate();
        }
        o0Var.f39521e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.f39244b0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.f39244b0.setDuration(1500L);
        this.f39244b0.setRepeatMode(1);
        this.f39244b0.setRepeatCount(-1);
        this.f39244b0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.S != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
