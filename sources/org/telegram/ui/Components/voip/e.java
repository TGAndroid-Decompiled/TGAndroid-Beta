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
import org.telegram.messenger.bd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
public final class e extends View {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public final float J;
    public float K;
    public float L;
    public float M;
    public final Rect N;
    public final Rect O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public d R;
    public boolean S;
    public org.telegram.ui.Cells.y T;
    public final Paint U;
    public final ch0 V;
    public final Drawable W;
    public final FabBackgroundDrawable f39295a;
    public final b0 f39296a0;
    public final FabBackgroundDrawable f39297b;
    public final Paint f39298b0;
    public final Drawable f39299c;
    public ValueAnimator f39300c0;
    public final Drawable d;
    public final StaticLayout f39301e;
    public final StaticLayout f39302f;
    public final StaticLayout h;
    public final gc f39303n;
    public final gc f39304r;
    public b f39305s;
    public final int f39306w;
    public float f39307x;
    public float f39308y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f39303n = new gc(this);
        this.f39304r = new gc(this);
        this.E = true;
        this.F = true;
        this.N = new Rect();
        this.O = new Rect();
        this.U = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f39298b0 = paint2;
        b0 b0Var = new b0(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(8.0f), 4);
        this.f39296a0 = b0Var;
        b0Var.h = true;
        b0Var.f39236i = 0.0f;
        b0Var.d = 0.0f;
        b0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.J = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = org.telegram.messenger.g0.L(60.0f);
        this.f39306w = L;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f39295a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f39297b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, L, L);
        fabBackgroundDrawable.setBounds(0, 0, L, L);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint.setColor(-1);
        String M0 = bd.M0(2131754716, null);
        String M02 = bd.M0(2131751604, null);
        String M03 = bd.M0(2131746061, null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f39301e = new StaticLayout(M0, textPaint, (int) textPaint.measureText(M0), alignment, 1.0f, 0.0f, false);
        this.f39302f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.f39299c = activity.getDrawable(2131230918).mutate();
        Drawable mutate = activity.getDrawable(2131231269).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        ch0 ch0Var = new ch0(2131623956, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.V = ch0Var;
        ch0Var.K(1);
        ch0Var.P(90);
        ch0Var.R(this);
        this.W = activity.getDrawable(2131230926).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, i0.a.o(-1, 76));
        this.T = j02;
        j02.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.T.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f39305s == null) {
            this.f39305s = new b(this, this);
        }
        return this.f39305s;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.T;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f39300c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39300c0 = null;
            this.V.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        float f10;
        Rect rect2;
        if (!this.S) {
            if (this.E) {
                float L = (org.telegram.messenger.g0.L(2.0f) * 0.04f) + this.f39307x;
                this.f39307x = L;
                if (L > org.telegram.messenger.g0.L(4.0f)) {
                    this.f39307x = org.telegram.messenger.g0.L(4.0f);
                    this.E = false;
                }
            } else {
                float L2 = this.f39307x - (org.telegram.messenger.g0.L(2.0f) * 0.04f);
                this.f39307x = L2;
                if (L2 < 0.0f) {
                    this.f39307x = 0.0f;
                    this.E = true;
                }
            }
            if (this.F) {
                float L3 = (org.telegram.messenger.g0.L(4.0f) * 0.03f) + this.f39308y;
                this.f39308y = L3;
                if (L3 > org.telegram.messenger.g0.L(10.0f)) {
                    this.f39308y = org.telegram.messenger.g0.L(10.0f);
                    this.F = false;
                }
            } else {
                float L4 = this.f39308y - (org.telegram.messenger.g0.L(5.0f) * 0.03f);
                this.f39308y = L4;
                if (L4 < org.telegram.messenger.g0.L(5.0f)) {
                    this.f39308y = org.telegram.messenger.g0.L(5.0f);
                    this.F = true;
                }
            }
            invalidate();
        }
        this.f39308y = (org.telegram.messenger.g0.L(8.0f) * 0.005f) + this.f39308y;
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f39306w;
        this.O.set(k5.z(46.0f, measuredWidth, i3), org.telegram.messenger.g0.L(40.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(40.0f) + i3);
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(40.0f));
        canvas.save();
        float a10 = this.f39304r.a(0.1f);
        float f11 = i3;
        float f12 = f11 / 2.0f;
        canvas.scale(a10, a10, rect.centerX(), rect.top + f12);
        canvas.translate(((this.L + getMeasuredWidth()) - org.telegram.messenger.g0.L(46.0f)) - f11, 0.0f);
        boolean z10 = this.S;
        FabBackgroundDrawable fabBackgroundDrawable = this.f39297b;
        if (z10) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.f39298b0);
                }
            }
            canvas.restore();
        } else {
            f10 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f39299c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f39302f;
        canvas.translate(f12 - (staticLayout.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i3);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.H) {
            this.T.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        this.N.set(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(46.0f) + i3, org.telegram.messenger.g0.L(40.0f) + i3);
        canvas.save();
        float a11 = this.f39303n.a(0.1f);
        canvas.scale(a11, a11, rect2.centerX(), rect2.top + f12);
        canvas.translate(this.K + org.telegram.messenger.g0.L(46.0f), 0.0f);
        if (!this.S) {
            b0 b0Var = this.f39296a0;
            b0Var.c();
            float f13 = (int) f12;
            b0Var.a(canvas, f13, f13, this);
        }
        this.f39295a.draw(canvas);
        if (this.S) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i3);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.f39301e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i3);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        this.V.draw(canvas);
        canvas.restore();
        if (!this.H) {
            this.T.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.G) {
            invalidate();
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        b bVar = this.f39305s;
        if (bVar != null) {
            Rect rect = bVar.f39243c;
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.f39244e != -1) {
                    bVar.f39244e = -1;
                    return true;
                }
            } else {
                for (int i3 = 0; i3 < bVar.f39242b; i3++) {
                    e eVar = bVar.f39229g;
                    if (i3 == 0) {
                        rect.set(eVar.N);
                    } else if (i3 == 1) {
                        rect.set(eVar.O);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y9)) {
                        if (i3 != bVar.f39244e) {
                            bVar.f39244e = i3;
                            bVar.a(i3);
                        }
                        return true;
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int i11 = this.f39306w;
        this.M = (getMeasuredWidth() / 2.0f) - ((i11 / 2.0f) + org.telegram.messenger.g0.L(46.0f));
        int y9 = org.telegram.messenger.camera.q.y(28.0f, i11, 2);
        this.f39299c.setBounds(y9, y9, org.telegram.messenger.g0.L(28.0f) + y9, org.telegram.messenger.g0.L(28.0f) + y9);
        this.d.setBounds(y9, y9, org.telegram.messenger.g0.L(28.0f) + y9, org.telegram.messenger.g0.L(28.0f) + y9);
        Paint paint = this.U;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(d dVar) {
        this.R = dVar;
    }

    public void setRetryMod(boolean z10) {
        this.S = z10;
        FabBackgroundDrawable fabBackgroundDrawable = this.f39297b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.V.start();
        b0 b0Var = this.f39296a0;
        if (!b0Var.f39233e) {
            invalidate();
        }
        b0Var.f39233e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.f39300c0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.f39300c0.setDuration(1500L);
        this.f39300c0.setRepeatMode(1);
        this.f39300c0.setRepeatCount(-1);
        this.f39300c0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.T != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
