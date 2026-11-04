package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class n61 extends FrameLayout {
    public final int f47903a;
    public final Object f47904b;
    public final Object f47905c;

    public n61(Object obj, Context context, Object obj2, int i3) {
        super(context);
        this.f47903a = i3;
        this.f47904b = obj;
        this.f47905c = obj2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f47903a) {
            case 2:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.w5) this.f47904b).getClass();
                return;
            case 3:
            case 5:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                cg.b0 b0Var = (cg.b0) this.f47904b;
                b0Var.b(org.telegram.ui.ActionBar.k6.r1(0.65f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, (org.telegram.ui.ActionBar.e6) this.f47905c)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 6:
                ((vg.x0) this.f47905c).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                vg.x0 x0Var = (vg.x0) this.f47905c;
                x0Var.f56911f.setAlpha(((vg.v0) this.f47904b).C1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(24.0f) - 1, org.telegram.messenger.g0.L(24.0f) - 1, x0Var.f56911f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47903a) {
            case 4:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f10;
        switch (this.f47903a) {
            case 2:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f47904b;
                if (view == w5Var.f43342t0 && w5Var.G) {
                    int save = canvas.save();
                    canvas.concat(w5Var.J);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restoreToCount(save);
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 5:
                Path path = (Path) this.f47905c;
                ug.e0 e0Var = (ug.e0) this.f47904b;
                if (e0Var.h != null && (((z10 = e0Var.f55955f) && view == e0Var.d) || (!z10 && view == e0Var.f55953c))) {
                    if (z10) {
                        f10 = e0Var.f55954e;
                    } else {
                        f10 = 1.0f - e0Var.f55954e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f47903a) {
            case 1:
                super.invalidate();
                org.telegram.ui.ActionBar.k0 k0Var = ((l71) this.f47904b).f47199v0;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
            case 2:
            default:
                super.invalidate();
                return;
            case 3:
                super.invalidate();
                ((qg.h) this.f47904b).invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f47903a) {
            case 2:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.j5) this.f47905c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f47903a) {
            case 2:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.j5) this.f47905c);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f47903a) {
            case 0:
                int intrinsicHeight = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
                Paint paint = (Paint) this.f47905c;
                paint.setColor(((l71) this.f47904b).getThemedColor(org.telegram.ui.ActionBar.k6.Ge));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                return;
            case 1:
                int[] iArr = (int[]) this.f47905c;
                l71 l71Var = (l71) this.f47904b;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    float translationY = l71Var.f47197u0.getTranslationY();
                    int i3 = iArr[1];
                    if (translationY != i3) {
                        l71Var.f47197u0.setTranslationY(-i3);
                        l71Var.f47199v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < l71Var.R) {
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f47903a) {
            case 6:
                super.onMeasure(i3, org.telegram.messenger.camera.q.B(2.0f, ((vg.v0) this.f47904b).f56880r1, 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f47903a) {
            case 4:
                super.onSizeChanged(i3, i10, i11, i12);
                cg.b0 b0Var = (cg.b0) this.f47904b;
                b0Var.setBounds(0, 0, i3, i10);
                b0Var.c(0, org.telegram.messenger.g0.L(24.0f) + getPaddingBottom());
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.f47903a) {
            case 3:
                qg.h hVar = (qg.h) this.f47904b;
                qg.c cVar = hVar.f53936r;
                boolean onTouchEvent = ((GestureDetector) ((org.telegram.ui.Components.y00) this.f47905c).f40562a).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    org.telegram.messenger.g0.i3(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(cVar);
                    if (!hVar.h) {
                        q1.h hVar2 = hVar.f53932c.f53653m;
                        if (((float) hVar2.f53661i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        hVar2.f53661i = qg.h.a(displayMetrics, f10);
                        hVar.d.f53653m.f53661i = qg.h.b(getResources().getDisplayMetrics(), (float) hVar.d.f53653m.f53661i);
                        hVar.f53932c.h();
                        hVar.d.h();
                    }
                    hVar.f53935n = false;
                    hVar.f53934f = false;
                    hVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f47903a) {
            case 3:
                super.setTranslationX(f10);
                ((qg.h) this.f47904b).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f47903a) {
            case 3:
                super.setTranslationY(f10);
                ((qg.h) this.f47904b).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public n61(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47903a = 4;
        this.f47904b = new cg.b0(8);
        this.f47905c = e6Var;
    }

    public n61(org.telegram.ui.Wallet.w5 w5Var, Context context) {
        super(context);
        this.f47903a = 2;
        this.f47904b = w5Var;
        this.f47905c = new org.telegram.ui.Wallet.j5(0, this);
    }

    public n61(l71 l71Var, Context context, int i3) {
        super(context);
        this.f47903a = i3;
        switch (i3) {
            case 1:
                this.f47904b = l71Var;
                super(context);
                this.f47905c = new int[2];
                return;
            default:
                this.f47904b = l71Var;
                this.f47905c = new Paint();
                return;
        }
    }

    public n61(ug.e0 e0Var, Context context) {
        super(context);
        this.f47903a = 5;
        this.f47904b = e0Var;
        this.f47905c = new Path();
    }
}
