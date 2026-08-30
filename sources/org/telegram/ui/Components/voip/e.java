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
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.rc;
public final class e extends View {
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public final float F;
    public float G;
    public float H;
    public float I;
    public final Rect J;
    public final Rect K;
    public ValueAnimator L;
    public ValueAnimator M;
    public d N;
    public boolean O;
    public org.telegram.ui.Cells.z P;
    public final Paint Q;
    public final gj0 R;
    public final Drawable S;
    public final p0 T;
    public final Paint U;
    public ValueAnimator V;
    public final FabBackgroundDrawable f29600a;
    public final FabBackgroundDrawable f29601b;
    public final Drawable f29602c;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f29603f;
    public final StaticLayout h;
    public final rc f29604n;
    public final rc f29605r;
    public b f29606s;
    public final int v;
    public float f29607w;
    public float f29608x;
    public boolean f29609y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f29604n = new rc(this);
        this.f29605r = new rc(this);
        this.f29609y = true;
        this.B = true;
        this.J = new Rect();
        this.K = new Rect();
        this.Q = new Paint(1);
        Paint paint2 = new Paint(1);
        this.U = paint2;
        p0 p0Var = new p0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.T = p0Var;
        p0Var.h = true;
        p0Var.f29850i = 0.0f;
        p0Var.d = 0.0f;
        p0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F = ViewConfiguration.get(activity).getScaledTouchSlop();
        int dp = AndroidUtilities.dp(60.0f);
        this.v = dp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f29600a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f29601b = fabBackgroundDrawable2;
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
        this.e = new StaticLayout(string, textPaint, (int) textPaint.measureText(string), alignment, 1.0f, 0.0f, false);
        this.f29603f = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.f29602c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        int i10 = R.raw.call_accept;
        gj0 gj0Var = new gj0(i10, "" + R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.R = gj0Var;
        gj0Var.I(1);
        gj0Var.N(90);
        gj0Var.f25170s0 = this;
        this.S = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(52.0f), 0, i0.a.k(-1, 76));
        this.P = h02;
        h02.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.P.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f29606s == null) {
            this.f29606s = new b(this, this);
        }
        return this.f29606s;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.P;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
            this.R.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        float f10;
        Rect rect2;
        if (!this.O) {
            if (this.f29609y) {
                float dp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.f29607w;
                this.f29607w = dp;
                if (dp > AndroidUtilities.dp(4.0f)) {
                    this.f29607w = AndroidUtilities.dp(4.0f);
                    this.f29609y = false;
                }
            } else {
                float dp2 = this.f29607w - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.f29607w = dp2;
                if (dp2 < 0.0f) {
                    this.f29607w = 0.0f;
                    this.f29609y = true;
                }
            }
            if (this.B) {
                float dp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.f29608x;
                this.f29608x = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.f29608x = AndroidUtilities.dp(10.0f);
                    this.B = false;
                }
            } else {
                float dp4 = this.f29608x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.f29608x = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.f29608x = AndroidUtilities.dp(5.0f);
                    this.B = true;
                }
            }
            invalidate();
        }
        this.f29608x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.f29608x;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.v;
        this.K.set(y3.B(46.0f, measuredWidth, i10), AndroidUtilities.dp(40.0f), getMeasuredWidth() - AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f) + i10);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float a2 = this.f29605r.a(0.1f);
        float f11 = i10;
        float f12 = f11 / 2.0f;
        canvas.scale(a2, a2, rect.centerX(), rect.top + f12);
        canvas.translate(((this.H + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f11, 0.0f);
        boolean z4 = this.O;
        FabBackgroundDrawable fabBackgroundDrawable = this.f29601b;
        if (z4) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.Q, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.U);
                }
            }
            canvas.restore();
        } else {
            f10 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f29602c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f29603f;
        canvas.translate(f12 - (staticLayout.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.D) {
            this.P.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.P.draw(canvas);
        }
        canvas.restore();
        this.J.set(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(46.0f) + i10, AndroidUtilities.dp(40.0f) + i10);
        canvas.save();
        float a10 = this.f29604n.a(0.1f);
        canvas.scale(a10, a10, rect2.centerX(), rect2.top + f12);
        canvas.translate(this.G + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.O) {
            p0 p0Var = this.T;
            p0Var.c();
            float f13 = (int) f12;
            p0Var.a(canvas, f13, f13, this);
        }
        this.f29600a.draw(canvas);
        if (this.O) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.R.draw(canvas);
        canvas.restore();
        if (!this.D) {
            this.P.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.P.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.C) {
            invalidate();
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        b bVar = this.f29606s;
        if (bVar != null) {
            Rect rect = bVar.f29579c;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.e != -1) {
                    bVar.e = -1;
                    return true;
                }
            } else {
                for (int i10 = 0; i10 < bVar.f29578b; i10++) {
                    e eVar = bVar.f29569g;
                    if (i10 == 0) {
                        rect.set(eVar.J);
                    } else if (i10 == 1) {
                        rect.set(eVar.K);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y10)) {
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
        int i12 = this.v;
        this.I = (getMeasuredWidth() / 2.0f) - ((i12 / 2.0f) + AndroidUtilities.dp(46.0f));
        int x10 = org.telegram.ui.b.x(28.0f, i12, 2);
        this.f29602c.setBounds(x10, x10, AndroidUtilities.dp(28.0f) + x10, AndroidUtilities.dp(28.0f) + x10);
        this.d.setBounds(x10, x10, AndroidUtilities.dp(28.0f) + x10, AndroidUtilities.dp(28.0f) + x10);
        Paint paint = this.Q;
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(d dVar) {
        this.N = dVar;
    }

    public void setRetryMod(boolean z4) {
        this.O = z4;
        FabBackgroundDrawable fabBackgroundDrawable = this.f29601b;
        if (z4) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.R.start();
        p0 p0Var = this.T;
        if (!p0Var.e) {
            invalidate();
        }
        p0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.V = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.V.setDuration(1500L);
        this.V.setRepeatMode(1);
        this.V.setRepeatCount(-1);
        this.V.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.P != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
