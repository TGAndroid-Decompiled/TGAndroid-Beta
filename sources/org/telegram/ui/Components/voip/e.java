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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oi0;

public final class e extends View {
    public boolean A;
    public boolean B;
    public boolean C;
    public float D;
    public final float E;
    public float F;
    public float G;
    public float H;
    public final Rect I;
    public final Rect J;
    public ValueAnimator K;
    public ValueAnimator L;
    public d M;
    public boolean N;
    public org.telegram.ui.Cells.z O;
    public final Paint P;
    public final oi0 Q;
    public final Drawable R;
    public final p0 S;
    public final Paint T;
    public ValueAnimator U;

    public final FabBackgroundDrawable f33532a;

    public final FabBackgroundDrawable f33533b;

    public final Drawable f33534c;
    public final Drawable d;

    public final StaticLayout f33535e;

    public final StaticLayout f33536f;
    public final StaticLayout h;

    public final nc f33537n;

    public final nc f33538r;

    public b f33539s;
    public final int v;

    public float f33540w;

    public float f33541x;

    public boolean f33542y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f33537n = new nc(this);
        this.f33538r = new nc(this);
        this.f33542y = true;
        this.A = true;
        this.I = new Rect();
        this.J = new Rect();
        this.P = new Paint(1);
        Paint paint2 = new Paint(1);
        this.T = paint2;
        p0 p0Var = new p0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.S = p0Var;
        p0Var.h = true;
        p0Var.f33796i = 0.0f;
        p0Var.d = 0.0f;
        p0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.E = ViewConfiguration.get(activity).getScaledTouchSlop();
        int iDp = AndroidUtilities.dp(60.0f);
        this.v = iDp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f33532a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f33533b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, iDp, iDp);
        fabBackgroundDrawable.setBounds(0, 0, iDp, iDp);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint.setColor(-1);
        String string = LocaleController.getString(R.string.AcceptCall);
        String string2 = LocaleController.getString(R.string.DeclineCall);
        String string3 = LocaleController.getString(R.string.RetryCall);
        int iMeasureText = (int) textPaint.measureText(string);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f33535e = new StaticLayout(string, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
        this.f33536f = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.f33534c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable drawableMutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        oi0 oi0Var = new oi0(R.raw.call_accept, "" + R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.Q = oi0Var;
        oi0Var.I(1);
        oi0Var.N(90);
        oi0Var.f31328r0 = this;
        this.R = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.z zVarH0 = g6.h0(AndroidUtilities.dp(52.0f), 0, i0.b.k(-1, 76));
        this.O = zVarH0;
        zVarH0.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.O.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f33539s == null) {
            this.f33539s = new b(this, this);
        }
        return this.f33539s;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.O;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
            this.Q.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (!this.N) {
            if (this.f33542y) {
                float fDp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.f33540w;
                this.f33540w = fDp;
                if (fDp > AndroidUtilities.dp(4.0f)) {
                    this.f33540w = AndroidUtilities.dp(4.0f);
                    this.f33542y = false;
                }
            } else {
                float fDp2 = this.f33540w - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.f33540w = fDp2;
                if (fDp2 < 0.0f) {
                    this.f33540w = 0.0f;
                    this.f33542y = true;
                }
            }
            if (this.A) {
                float fDp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.f33541x;
                this.f33541x = fDp3;
                if (fDp3 > AndroidUtilities.dp(10.0f)) {
                    this.f33541x = AndroidUtilities.dp(10.0f);
                    this.A = false;
                }
            } else {
                float fDp4 = this.f33541x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.f33541x = fDp4;
                if (fDp4 < AndroidUtilities.dp(5.0f)) {
                    this.f33541x = AndroidUtilities.dp(5.0f);
                    this.A = true;
                }
            }
            invalidate();
        }
        this.f33541x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.f33541x;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.v;
        int iB = org.telegram.messenger.y1.B(46.0f, measuredWidth, i10);
        int iDp = AndroidUtilities.dp(40.0f);
        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(46.0f);
        int iDp2 = AndroidUtilities.dp(40.0f) + i10;
        Rect rect = this.J;
        rect.set(iB, iDp, measuredWidth2, iDp2);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float fA = this.f33538r.a(0.1f);
        float f11 = i10;
        float f12 = f11 / 2.0f;
        canvas.scale(fA, fA, rect.centerX(), rect.top + f12);
        canvas.translate(((this.G + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f11, 0.0f);
        boolean z10 = this.N;
        FabBackgroundDrawable fabBackgroundDrawable = this.f33533b;
        if (z10) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.P, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.T);
                }
            }
            canvas.restore();
        } else {
            f10 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f33534c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f33536f;
        canvas.translate(f12 - (staticLayout.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.C) {
            this.O.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.O.draw(canvas);
        }
        canvas.restore();
        int iDp3 = AndroidUtilities.dp(46.0f);
        int iDp4 = AndroidUtilities.dp(40.0f);
        int iDp5 = AndroidUtilities.dp(46.0f) + i10;
        int iDp6 = AndroidUtilities.dp(40.0f) + i10;
        Rect rect2 = this.I;
        rect2.set(iDp3, iDp4, iDp5, iDp6);
        canvas.save();
        float fA2 = this.f33537n.a(0.1f);
        canvas.scale(fA2, fA2, rect2.centerX(), rect2.top + f12);
        canvas.translate(this.F + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.N) {
            p0 p0Var = this.S;
            p0Var.c();
            float f13 = (int) f12;
            p0Var.a(canvas, f13, f13, this);
        }
        this.f33532a.draw(canvas);
        if (this.N) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.f33535e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.Q.draw(canvas);
        canvas.restore();
        if (!this.C) {
            this.O.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.O.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.B) {
            invalidate();
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        b bVar = this.f33539s;
        if (bVar != null) {
            Rect rect = bVar.f33511c;
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                for (int i10 = 0; i10 < bVar.f33510b; i10++) {
                    e eVar = bVar.f33491g;
                    if (i10 == 0) {
                        rect.set(eVar.I);
                    } else if (i10 == 1) {
                        rect.set(eVar.J);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x8, y10)) {
                        if (i10 != bVar.f33512e) {
                            bVar.f33512e = i10;
                            bVar.a(i10);
                        }
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 10 && bVar.f33512e != -1) {
                bVar.f33512e = -1;
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        int i12 = this.v;
        this.H = measuredWidth - ((i12 / 2.0f) + AndroidUtilities.dp(46.0f));
        int iX = rl.x(28.0f, i12, 2);
        this.f33534c.setBounds(iX, iX, AndroidUtilities.dp(28.0f) + iX, AndroidUtilities.dp(28.0f) + iX);
        this.d.setBounds(iX, iX, AndroidUtilities.dp(28.0f) + iX, AndroidUtilities.dp(28.0f) + iX);
        float fDp = AndroidUtilities.dp(3.0f);
        Paint paint = this.P;
        paint.setStrokeWidth(fDp);
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(d dVar) {
        this.M = dVar;
    }

    public void setRetryMod(boolean z10) {
        this.N = z10;
        FabBackgroundDrawable fabBackgroundDrawable = this.f33533b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.Q.start();
        p0 p0Var = this.S;
        if (!p0Var.f33793e) {
            invalidate();
        }
        p0Var.f33793e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.U = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new a(this, 2));
        this.U.setDuration(1500L);
        this.U.setRepeatMode(1);
        this.U.setRepeatCount(-1);
        this.U.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }
}
