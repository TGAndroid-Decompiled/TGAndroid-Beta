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
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yj0;
public final class e extends View {
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
    public final yj0 U;
    public final Drawable V;
    public final q0 W;
    public final FabBackgroundDrawable f33878a;
    public final Paint f33879a0;
    public final FabBackgroundDrawable f33880b;
    public ValueAnimator f33881b0;
    public final Drawable f33882c;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f33883f;
    public final StaticLayout h;
    public final xc f33884n;
    public final xc f33885r;
    public b f33886s;
    public final int v;
    public float f33887w;
    public float f33888x;
    public boolean f33889y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f33884n = new xc(this);
        this.f33885r = new xc(this);
        this.f33889y = true;
        this.E = true;
        this.M = new Rect();
        this.N = new Rect();
        this.T = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f33879a0 = paint2;
        q0 q0Var = new q0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.W = q0Var;
        q0Var.h = true;
        q0Var.f34132i = 0.0f;
        q0Var.d = 0.0f;
        q0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = ViewConfiguration.get(activity).getScaledTouchSlop();
        int dp = AndroidUtilities.dp(60.0f);
        this.v = dp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f33878a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f33880b = fabBackgroundDrawable2;
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
        this.f33883f = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.f33882c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        yj0 yj0Var = new yj0(R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.U = yj0Var;
        yj0Var.K(1);
        yj0Var.P(90);
        yj0Var.R(this);
        this.V = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y i02 = y6.i0(AndroidUtilities.dp(52.0f), 0, i0.a.o(-1, 76));
        this.S = i02;
        i02.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.S.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f33886s == null) {
            this.f33886s = new b(this, this);
        }
        return this.f33886s;
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
        ValueAnimator valueAnimator = this.f33881b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33881b0 = null;
            this.U.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        float f7;
        Rect rect2;
        if (!this.R) {
            if (this.f33889y) {
                float dp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.f33887w;
                this.f33887w = dp;
                if (dp > AndroidUtilities.dp(4.0f)) {
                    this.f33887w = AndroidUtilities.dp(4.0f);
                    this.f33889y = false;
                }
            } else {
                float dp2 = this.f33887w - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.f33887w = dp2;
                if (dp2 < 0.0f) {
                    this.f33887w = 0.0f;
                    this.f33889y = true;
                }
            }
            if (this.E) {
                float dp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.f33888x;
                this.f33888x = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.f33888x = AndroidUtilities.dp(10.0f);
                    this.E = false;
                }
            } else {
                float dp4 = this.f33888x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.f33888x = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.f33888x = AndroidUtilities.dp(5.0f);
                    this.E = true;
                }
            }
            invalidate();
        }
        this.f33888x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.f33888x;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.v;
        this.N.set(org.telegram.messenger.t.C(46.0f, measuredWidth, i10), AndroidUtilities.dp(40.0f), getMeasuredWidth() - AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f) + i10);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float a2 = this.f33885r.a(0.1f);
        float f10 = i10;
        float f11 = f10 / 2.0f;
        canvas.scale(a2, a2, rect.centerX(), rect.top + f11);
        canvas.translate(((this.K + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f10, 0.0f);
        boolean z10 = this.R;
        FabBackgroundDrawable fabBackgroundDrawable = this.f33880b;
        if (z10) {
            f7 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.f33879a0);
                }
            }
            canvas.restore();
        } else {
            f7 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f33882c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f33883f;
        canvas.translate(f11 - (staticLayout.getWidth() / f7), AndroidUtilities.dp(4.0f) + i10);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.G) {
            this.S.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.S.draw(canvas);
        }
        canvas.restore();
        this.M.set(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(46.0f) + i10, AndroidUtilities.dp(40.0f) + i10);
        canvas.save();
        float a10 = this.f33884n.a(0.1f);
        canvas.scale(a10, a10, rect2.centerX(), rect2.top + f11);
        canvas.translate(this.J + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.R) {
            q0 q0Var = this.W;
            q0Var.c();
            float f12 = (int) f11;
            q0Var.a(canvas, f12, f12, this);
        }
        this.f33878a.draw(canvas);
        if (this.R) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f11 - (staticLayout2.getWidth() / f7), AndroidUtilities.dp(4.0f) + i10);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f11 - (staticLayout3.getWidth() / f7), AndroidUtilities.dp(4.0f) + i10);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.U.draw(canvas);
        canvas.restore();
        if (!this.G) {
            this.S.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
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
        b bVar = this.f33886s;
        if (bVar != null) {
            Rect rect = bVar.f33856c;
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.e != -1) {
                    bVar.e = -1;
                    return true;
                }
            } else {
                for (int i10 = 0; i10 < bVar.f33855b; i10++) {
                    e eVar = bVar.f33836g;
                    if (i10 == 0) {
                        rect.set(eVar.M);
                    } else if (i10 == 1) {
                        rect.set(eVar.N);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x9, y3)) {
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
        this.L = (getMeasuredWidth() / 2.0f) - ((i12 / 2.0f) + AndroidUtilities.dp(46.0f));
        int B = wh.B(28.0f, i12, 2);
        this.f33882c.setBounds(B, B, AndroidUtilities.dp(28.0f) + B, AndroidUtilities.dp(28.0f) + B);
        this.d.setBounds(B, B, AndroidUtilities.dp(28.0f) + B, AndroidUtilities.dp(28.0f) + B);
        Paint paint = this.T;
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
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
        FabBackgroundDrawable fabBackgroundDrawable = this.f33880b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.U.start();
        q0 q0Var = this.W;
        if (!q0Var.e) {
            invalidate();
        }
        q0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.f33881b0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.f33881b0.setDuration(1500L);
        this.f33881b0.setRepeatMode(1);
        this.f33881b0.setRepeatCount(-1);
        this.f33881b0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.S != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
