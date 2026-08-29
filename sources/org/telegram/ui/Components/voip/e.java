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
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xi0;
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
    public final xi0 Q;
    public final Drawable R;
    public final q0 S;
    public final Paint T;
    public ValueAnimator U;
    public final FabBackgroundDrawable f33662a;
    public final FabBackgroundDrawable f33663b;
    public final Drawable f33664c;
    public final Drawable d;
    public final StaticLayout f33665e;
    public final StaticLayout f33666f;
    public final StaticLayout h;
    public final uc f33667n;
    public final uc f33668r;
    public b f33669s;
    public final int v;
    public float f33670w;
    public float f33671x;
    public boolean f33672y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f33667n = new uc(this);
        this.f33668r = new uc(this);
        this.f33672y = true;
        this.A = true;
        this.I = new Rect();
        this.J = new Rect();
        this.P = new Paint(1);
        Paint paint2 = new Paint(1);
        this.T = paint2;
        q0 q0Var = new q0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.S = q0Var;
        q0Var.h = true;
        q0Var.f33936i = 0.0f;
        q0Var.d = 0.0f;
        q0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.E = ViewConfiguration.get(activity).getScaledTouchSlop();
        int dp = AndroidUtilities.dp(60.0f);
        this.v = dp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f33662a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f33663b = fabBackgroundDrawable2;
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
        this.f33665e = new StaticLayout(string, textPaint, (int) textPaint.measureText(string), alignment, 1.0f, 0.0f, false);
        this.f33666f = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.f33664c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        int i10 = R.raw.call_accept;
        xi0 xi0Var = new xi0(i10, "" + R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.Q = xi0Var;
        xi0Var.I(1);
        xi0Var.N(90);
        xi0Var.f34753r0 = this;
        this.R = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.z h02 = g6.h0(AndroidUtilities.dp(52.0f), 0, i0.a.k(-1, 76));
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
        if (this.f33669s == null) {
            this.f33669s = new b(this, this);
        }
        return this.f33669s;
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
        float f9;
        Rect rect2;
        if (!this.N) {
            if (this.f33672y) {
                float dp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.f33670w;
                this.f33670w = dp;
                if (dp > AndroidUtilities.dp(4.0f)) {
                    this.f33670w = AndroidUtilities.dp(4.0f);
                    this.f33672y = false;
                }
            } else {
                float dp2 = this.f33670w - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.f33670w = dp2;
                if (dp2 < 0.0f) {
                    this.f33670w = 0.0f;
                    this.f33672y = true;
                }
            }
            if (this.A) {
                float dp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.f33671x;
                this.f33671x = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.f33671x = AndroidUtilities.dp(10.0f);
                    this.A = false;
                }
            } else {
                float dp4 = this.f33671x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.f33671x = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.f33671x = AndroidUtilities.dp(5.0f);
                    this.A = true;
                }
            }
            invalidate();
        }
        this.f33671x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.f33671x;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.v;
        this.J.set(x3.B(46.0f, measuredWidth, i10), AndroidUtilities.dp(40.0f), getMeasuredWidth() - AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f) + i10);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float a2 = this.f33668r.a(0.1f);
        float f10 = i10;
        float f11 = f10 / 2.0f;
        canvas.scale(a2, a2, rect.centerX(), rect.top + f11);
        canvas.translate(((this.G + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f10, 0.0f);
        boolean z10 = this.N;
        FabBackgroundDrawable fabBackgroundDrawable = this.f33663b;
        if (z10) {
            f9 = 2.0f;
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
            f9 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f33664c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f33666f;
        canvas.translate(f11 - (staticLayout.getWidth() / f9), AndroidUtilities.dp(4.0f) + i10);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.C) {
            this.O.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.O.draw(canvas);
        }
        canvas.restore();
        this.I.set(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(46.0f) + i10, AndroidUtilities.dp(40.0f) + i10);
        canvas.save();
        float a10 = this.f33667n.a(0.1f);
        canvas.scale(a10, a10, rect2.centerX(), rect2.top + f11);
        canvas.translate(this.F + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.N) {
            q0 q0Var = this.S;
            q0Var.c();
            float f12 = (int) f11;
            q0Var.a(canvas, f12, f12, this);
        }
        this.f33662a.draw(canvas);
        if (this.N) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f11 - (staticLayout2.getWidth() / f9), AndroidUtilities.dp(4.0f) + i10);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.f33665e;
            canvas.translate(f11 - (staticLayout3.getWidth() / f9), AndroidUtilities.dp(4.0f) + i10);
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
        b bVar = this.f33669s;
        if (bVar != null) {
            Rect rect = bVar.f33647c;
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.f33648e != -1) {
                    bVar.f33648e = -1;
                    return true;
                }
            } else {
                for (int i10 = 0; i10 < bVar.f33646b; i10++) {
                    e eVar = bVar.f33617g;
                    if (i10 == 0) {
                        rect.set(eVar.I);
                    } else if (i10 == 1) {
                        rect.set(eVar.J);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x4, y8)) {
                        if (i10 != bVar.f33648e) {
                            bVar.f33648e = i10;
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
        int i12 = this.v;
        this.H = (getMeasuredWidth() / 2.0f) - ((i12 / 2.0f) + AndroidUtilities.dp(46.0f));
        int x4 = org.telegram.ui.b.x(28.0f, i12, 2);
        this.f33664c.setBounds(x4, x4, AndroidUtilities.dp(28.0f) + x4, AndroidUtilities.dp(28.0f) + x4);
        this.d.setBounds(x4, x4, AndroidUtilities.dp(28.0f) + x4, AndroidUtilities.dp(28.0f) + x4);
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
        FabBackgroundDrawable fabBackgroundDrawable = this.f33663b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.Q.start();
        q0 q0Var = this.S;
        if (!q0Var.f33933e) {
            invalidate();
        }
        q0Var.f33933e = true;
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
