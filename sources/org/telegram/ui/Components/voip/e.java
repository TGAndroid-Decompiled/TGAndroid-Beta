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
import org.telegram.messenger.ul;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yi0;
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
    public org.telegram.ui.Cells.z S;
    public final Paint T;
    public final yi0 U;
    public final Drawable V;
    public final s0 W;
    public final FabBackgroundDrawable f28891a;
    public final Paint f28892a0;
    public final FabBackgroundDrawable f28893b;
    public ValueAnimator f28894b0;
    public final Drawable f28895c;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f28896f;
    public final StaticLayout h;
    public final yc f28897n;
    public final yc f28898r;
    public b f28899s;
    public final int v;
    public float f28900w;
    public float f28901x;
    public boolean f28902y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f28897n = new yc(this);
        this.f28898r = new yc(this);
        this.f28902y = true;
        this.E = true;
        this.M = new Rect();
        this.N = new Rect();
        this.T = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f28892a0 = paint2;
        s0 s0Var = new s0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.W = s0Var;
        s0Var.h = true;
        s0Var.f29168i = 0.0f;
        s0Var.d = 0.0f;
        s0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = ViewConfiguration.get(activity).getScaledTouchSlop();
        int dp = AndroidUtilities.dp(60.0f);
        this.v = dp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.f28891a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.f28893b = fabBackgroundDrawable2;
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
        this.f28896f = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.f28895c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        yi0 yi0Var = new yi0(R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.U = yi0Var;
        yi0Var.K(1);
        yi0Var.P(90);
        yi0Var.R(this);
        this.V = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.z h02 = h6.h0(AndroidUtilities.dp(52.0f), 0, i0.a.k(-1, 76));
        this.S = h02;
        h02.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.S.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f28899s == null) {
            this.f28899s = new b(this, this);
        }
        return this.f28899s;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.S;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f28894b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28894b0 = null;
            this.U.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        float f7;
        Rect rect2;
        if (!this.R) {
            if (this.f28902y) {
                float dp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.f28900w;
                this.f28900w = dp;
                if (dp > AndroidUtilities.dp(4.0f)) {
                    this.f28900w = AndroidUtilities.dp(4.0f);
                    this.f28902y = false;
                }
            } else {
                float dp2 = this.f28900w - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.f28900w = dp2;
                if (dp2 < 0.0f) {
                    this.f28900w = 0.0f;
                    this.f28902y = true;
                }
            }
            if (this.E) {
                float dp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.f28901x;
                this.f28901x = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.f28901x = AndroidUtilities.dp(10.0f);
                    this.E = false;
                }
            } else {
                float dp4 = this.f28901x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.f28901x = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.f28901x = AndroidUtilities.dp(5.0f);
                    this.E = true;
                }
            }
            invalidate();
        }
        this.f28901x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.f28901x;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.v;
        this.N.set(org.telegram.messenger.z0.B(46.0f, measuredWidth, i10), AndroidUtilities.dp(40.0f), getMeasuredWidth() - AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f) + i10);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float a2 = this.f28898r.a(0.1f);
        float f10 = i10;
        float f11 = f10 / 2.0f;
        canvas.scale(a2, a2, rect.centerX(), rect.top + f11);
        canvas.translate(((this.K + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f10, 0.0f);
        boolean z10 = this.R;
        FabBackgroundDrawable fabBackgroundDrawable = this.f28893b;
        if (z10) {
            f7 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.f28892a0);
                }
            }
            canvas.restore();
        } else {
            f7 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.f28895c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f28896f;
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
        float a10 = this.f28897n.a(0.1f);
        canvas.scale(a10, a10, rect2.centerX(), rect2.top + f11);
        canvas.translate(this.J + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.R) {
            s0 s0Var = this.W;
            s0Var.c();
            float f12 = (int) f11;
            s0Var.a(canvas, f12, f12, this);
        }
        this.f28891a.draw(canvas);
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
        b bVar = this.f28899s;
        if (bVar != null) {
            Rect rect = bVar.f28859c;
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && bVar.e != -1) {
                    bVar.e = -1;
                    return true;
                }
            } else {
                for (int i10 = 0; i10 < bVar.f28858b; i10++) {
                    e eVar = bVar.f28848g;
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
        int i12 = this.v;
        this.L = (getMeasuredWidth() / 2.0f) - ((i12 / 2.0f) + AndroidUtilities.dp(46.0f));
        int y3 = ul.y(28.0f, i12, 2);
        this.f28895c.setBounds(y3, y3, AndroidUtilities.dp(28.0f) + y3, AndroidUtilities.dp(28.0f) + y3);
        this.d.setBounds(y3, y3, AndroidUtilities.dp(28.0f) + y3, AndroidUtilities.dp(28.0f) + y3);
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
        FabBackgroundDrawable fabBackgroundDrawable = this.f28893b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.U.start();
        s0 s0Var = this.W;
        if (!s0Var.e) {
            invalidate();
        }
        s0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.f28894b0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.f28894b0.setDuration(1500L);
        this.f28894b0.setRepeatMode(1);
        this.f28894b0.setRepeatCount(-1);
        this.f28894b0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.S != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
