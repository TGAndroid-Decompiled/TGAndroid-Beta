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
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pc;
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
    public final mi0 Q;
    public final Drawable R;
    public final p0 S;
    public final Paint T;
    public ValueAnimator U;
    public final FabBackgroundDrawable f33482a;
    public final FabBackgroundDrawable f33483b;
    public final Drawable f33484c;
    public final Drawable d;
    public final StaticLayout f33485e;
    public final StaticLayout f33486f;
    public final StaticLayout h;
    public final pc f33487n;
    public final pc f33488r;
    public b f33489s;
    public final int v;
    public float f33490w;
    public float f33491x;
    public boolean f33492y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f33487n = new pc(this);
        this.f33488r = new pc(this);
        this.f33492y = true;
        this.A = true;
        this.I = new Rect();
        this.J = new Rect();
        this.P = new Paint(1);
        Paint paint2 = new Paint(1);
        this.T = paint2;
        p0 p0Var = new p0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.S = p0Var;
        p0Var.h = true;
        p0Var.f33746i = 0.0f;
        p0Var.d = 0.0f;
        p0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.E = ViewConfiguration.get(activity).getScaledTouchSlop();
        int dp = AndroidUtilities.dp(60.0f);
        this.v = dp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f33482a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f33483b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, dp, dp);
        fabBackgroundDrawable.setBounds(0, 0, dp, dp);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint.setColor(-1);
        String string = LocaleController.getString(R.string.AcceptCall);
        String string2 = LocaleController.getString(R.string.DeclineCall);
        String string3 = LocaleController.getString(R.string.RetryCall);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f33485e = new StaticLayout(string, textPaint, (int) textPaint.measureText(string), alignment, 1.0f, 0.0f, false);
        this.f33486f = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.f33484c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        int i9 = R.raw.call_accept;
        mi0 mi0Var = new mi0(i9, "" + R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.Q = mi0Var;
        mi0Var.I(1);
        mi0Var.N(90);
        mi0Var.f30863r0 = this;
        this.R = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.z h02 = f6.h0(AndroidUtilities.dp(52.0f), 0, i0.a.k(-1, 76));
        this.O = h02;
        h02.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.O.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f33489s == null) {
            this.f33489s = new b(this, this);
        }
        return this.f33489s;
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
        Rect rect;
        float f10;
        Rect rect2;
        if (!this.N) {
            if (this.f33492y) {
                float dp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.f33490w;
                this.f33490w = dp;
                if (dp > AndroidUtilities.dp(4.0f)) {
                    this.f33490w = AndroidUtilities.dp(4.0f);
                    this.f33492y = false;
                }
            } else {
                float dp2 = this.f33490w - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.f33490w = dp2;
                if (dp2 < 0.0f) {
                    this.f33490w = 0.0f;
                    this.f33492y = true;
                }
            }
            if (this.A) {
                float dp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.f33491x;
                this.f33491x = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.f33491x = AndroidUtilities.dp(10.0f);
                    this.A = false;
                }
            } else {
                float dp4 = this.f33491x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.f33491x = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.f33491x = AndroidUtilities.dp(5.0f);
                    this.A = true;
                }
            }
            invalidate();
        }
        this.f33491x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.f33491x;
        int measuredWidth = getMeasuredWidth();
        int i9 = this.v;
        this.J.set(org.telegram.messenger.l0.B(46.0f, measuredWidth, i9), AndroidUtilities.dp(40.0f), getMeasuredWidth() - AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f) + i9);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float a2 = this.f33488r.a(0.1f);
        float f11 = i9;
        float f12 = f11 / 2.0f;
        canvas.scale(a2, a2, rect.centerX(), rect.top + f12);
        canvas.translate(((this.G + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f11, 0.0f);
        boolean z10 = this.N;
        FabBackgroundDrawable fabBackgroundDrawable = this.f33483b;
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
            this.f33484c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f33486f;
        canvas.translate(f12 - (staticLayout.getWidth() / f10), AndroidUtilities.dp(4.0f) + i9);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.C) {
            this.O.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i9 - AndroidUtilities.dp(4.0f), i9 - AndroidUtilities.dp(4.0f));
            this.O.draw(canvas);
        }
        canvas.restore();
        this.I.set(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(46.0f) + i9, AndroidUtilities.dp(40.0f) + i9);
        canvas.save();
        float a3 = this.f33487n.a(0.1f);
        canvas.scale(a3, a3, rect2.centerX(), rect2.top + f12);
        canvas.translate(this.F + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.N) {
            p0 p0Var = this.S;
            p0Var.c();
            float f13 = (int) f12;
            p0Var.a(canvas, f13, f13, this);
        }
        this.f33482a.draw(canvas);
        if (this.N) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), AndroidUtilities.dp(4.0f) + i9);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.f33485e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), AndroidUtilities.dp(4.0f) + i9);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.Q.draw(canvas);
        canvas.restore();
        if (!this.C) {
            this.O.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i9 - AndroidUtilities.dp(4.0f), i9 - AndroidUtilities.dp(4.0f));
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
        b bVar = this.f33489s;
        if (bVar != null) {
            Rect rect = bVar.f33461c;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.f33462e != -1) {
                    bVar.f33462e = -1;
                    return true;
                }
            } else {
                for (int i9 = 0; i9 < bVar.f33460b; i9++) {
                    e eVar = bVar.f33441g;
                    if (i9 == 0) {
                        rect.set(eVar.I);
                    } else if (i9 == 1) {
                        rect.set(eVar.J);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y10)) {
                        if (i9 != bVar.f33462e) {
                            bVar.f33462e = i9;
                            bVar.a(i9);
                        }
                        return true;
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int i11 = this.v;
        this.H = (getMeasuredWidth() / 2.0f) - ((i11 / 2.0f) + AndroidUtilities.dp(46.0f));
        int y10 = ll.y(28.0f, i11, 2);
        this.f33484c.setBounds(y10, y10, AndroidUtilities.dp(28.0f) + y10, AndroidUtilities.dp(28.0f) + y10);
        this.d.setBounds(y10, y10, AndroidUtilities.dp(28.0f) + y10, AndroidUtilities.dp(28.0f) + y10);
        Paint paint = this.P;
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
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
        FabBackgroundDrawable fabBackgroundDrawable = this.f33483b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.Q.start();
        p0 p0Var = this.S;
        if (!p0Var.f33743e) {
            invalidate();
        }
        p0Var.f33743e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.U = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.U.setDuration(1500L);
        this.U.setRepeatMode(1);
        this.U.setRepeatCount(-1);
        this.U.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
