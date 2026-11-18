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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mh0;
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
    public final mh0 V;
    public final Drawable W;
    public final FabBackgroundDrawable f40836a;
    public final o0 f40837a0;
    public final FabBackgroundDrawable f40838b;
    public final Paint f40839b0;
    public final Drawable f40840c;
    public ValueAnimator f40841c0;
    public final Drawable d;
    public final StaticLayout f40842e;
    public final StaticLayout f40843f;
    public final StaticLayout h;
    public final mc f40844n;
    public final mc f40845r;
    public b f40846s;
    public final int f40847w;
    public float f40848x;
    public float f40849y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f40844n = new mc(this);
        this.f40845r = new mc(this);
        this.E = true;
        this.F = true;
        this.N = new Rect();
        this.O = new Rect();
        this.U = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f40839b0 = paint2;
        o0 o0Var = new o0(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(8.0f), 4);
        this.f40837a0 = o0Var;
        o0Var.h = true;
        o0Var.f41100i = 0.0f;
        o0Var.d = 0.0f;
        o0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.J = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = org.telegram.messenger.g0.L(60.0f);
        this.f40847w = L;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f40836a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f40838b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, L, L);
        fabBackgroundDrawable.setBounds(0, 0, L, L);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint.setColor(-1);
        String M0 = gd.M0(2131754716, null);
        String M02 = gd.M0(2131751592, null);
        String M03 = gd.M0(2131745856, null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f40842e = new StaticLayout(M0, textPaint, (int) textPaint.measureText(M0), alignment, 1.0f, 0.0f, false);
        this.f40843f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.f40840c = activity.getDrawable(2131230918).mutate();
        Drawable mutate = activity.getDrawable(2131231269).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        mh0 mh0Var = new mh0(2131623956, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.V = mh0Var;
        mh0Var.K(1);
        mh0Var.P(90);
        mh0Var.R(this);
        this.W = activity.getDrawable(2131230926).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y j02 = n6.j0(org.telegram.messenger.g0.L(52.0f), 0, i0.a.o(-1, 76));
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
        if (this.f40846s == null) {
            this.f40846s = new b(this, this);
        }
        return this.f40846s;
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
        ValueAnimator valueAnimator = this.f40841c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40841c0 = null;
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
                float L = (org.telegram.messenger.g0.L(2.0f) * 0.04f) + this.f40848x;
                this.f40848x = L;
                if (L > org.telegram.messenger.g0.L(4.0f)) {
                    this.f40848x = org.telegram.messenger.g0.L(4.0f);
                    this.E = false;
                }
            } else {
                float L2 = this.f40848x - (org.telegram.messenger.g0.L(2.0f) * 0.04f);
                this.f40848x = L2;
                if (L2 < 0.0f) {
                    this.f40848x = 0.0f;
                    this.E = true;
                }
            }
            if (this.F) {
                float L3 = (org.telegram.messenger.g0.L(4.0f) * 0.03f) + this.f40849y;
                this.f40849y = L3;
                if (L3 > org.telegram.messenger.g0.L(10.0f)) {
                    this.f40849y = org.telegram.messenger.g0.L(10.0f);
                    this.F = false;
                }
            } else {
                float L4 = this.f40849y - (org.telegram.messenger.g0.L(5.0f) * 0.03f);
                this.f40849y = L4;
                if (L4 < org.telegram.messenger.g0.L(5.0f)) {
                    this.f40849y = org.telegram.messenger.g0.L(5.0f);
                    this.F = true;
                }
            }
            invalidate();
        }
        this.f40849y = (org.telegram.messenger.g0.L(8.0f) * 0.005f) + this.f40849y;
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f40847w;
        this.O.set(org.telegram.messenger.f3.z(46.0f, measuredWidth, i7), org.telegram.messenger.g0.L(40.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(40.0f) + i7);
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(40.0f));
        canvas.save();
        float a10 = this.f40845r.a(0.1f);
        float f11 = i7;
        float f12 = f11 / 2.0f;
        canvas.scale(a10, a10, rect.centerX(), rect.top + f12);
        canvas.translate(((this.L + getMeasuredWidth()) - org.telegram.messenger.g0.L(46.0f)) - f11, 0.0f);
        boolean z10 = this.S;
        FabBackgroundDrawable fabBackgroundDrawable = this.f40838b;
        if (z10) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.f40839b0);
                }
            }
            canvas.restore();
        } else {
            f10 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f40840c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f40843f;
        canvas.translate(f12 - (staticLayout.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.H) {
            this.T.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        this.N.set(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(46.0f) + i7, org.telegram.messenger.g0.L(40.0f) + i7);
        canvas.save();
        float a11 = this.f40844n.a(0.1f);
        canvas.scale(a11, a11, rect2.centerX(), rect2.top + f12);
        canvas.translate(this.K + org.telegram.messenger.g0.L(46.0f), 0.0f);
        if (!this.S) {
            o0 o0Var = this.f40837a0;
            o0Var.c();
            float f13 = (int) f12;
            o0Var.a(canvas, f13, f13, this);
        }
        this.f40836a.draw(canvas);
        if (this.S) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.f40842e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        this.V.draw(canvas);
        canvas.restore();
        if (!this.H) {
            this.T.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f));
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
        b bVar = this.f40846s;
        if (bVar != null) {
            Rect rect = bVar.f40785c;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.f40786e != -1) {
                    bVar.f40786e = -1;
                    return true;
                }
            } else {
                for (int i7 = 0; i7 < bVar.f40784b; i7++) {
                    e eVar = bVar.f40777g;
                    if (i7 == 0) {
                        rect.set(eVar.N);
                    } else if (i7 == 1) {
                        rect.set(eVar.O);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y10)) {
                        if (i7 != bVar.f40786e) {
                            bVar.f40786e = i7;
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
        int i11 = this.f40847w;
        this.M = (getMeasuredWidth() / 2.0f) - ((i11 / 2.0f) + org.telegram.messenger.g0.L(46.0f));
        int z10 = n10.z(28.0f, i11, 2);
        this.f40840c.setBounds(z10, z10, org.telegram.messenger.g0.L(28.0f) + z10, org.telegram.messenger.g0.L(28.0f) + z10);
        this.d.setBounds(z10, z10, org.telegram.messenger.g0.L(28.0f) + z10, org.telegram.messenger.g0.L(28.0f) + z10);
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
        FabBackgroundDrawable fabBackgroundDrawable = this.f40838b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.V.start();
        o0 o0Var = this.f40837a0;
        if (!o0Var.f41097e) {
            invalidate();
        }
        o0Var.f41097e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.f40841c0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.f40841c0.setDuration(1500L);
        this.f40841c0.setRepeatMode(1);
        this.f40841c0.setRepeatCount(-1);
        this.f40841c0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.T != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
