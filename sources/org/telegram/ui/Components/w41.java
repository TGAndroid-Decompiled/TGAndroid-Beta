package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.cc1;
public final class w41 extends FrameLayout {
    public final int f39906a;
    public final Object f39907b;

    public w41(int i7, Context context, Object obj) {
        super(context);
        this.f39906a = i7;
        this.f39907b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f39906a) {
            case 4:
                int save = canvas.save();
                canvas.clipPath((Path) this.f39907b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            case 9:
                tg.i2 i2Var = (tg.i2) this.f39907b;
                if (i2Var.D > 0.0f && i2Var.f55775s != null) {
                    i2Var.f55776w.reset();
                    float width = getWidth() / i2Var.f55773n.getWidth();
                    i2Var.f55776w.postScale(width, width);
                    i2Var.f55774r.setLocalMatrix(i2Var.f55776w);
                    i2Var.f55775s.setAlpha((int) (i2Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), i2Var.f55775s);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39906a) {
            case 9:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tg.i2) this.f39907b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f39906a) {
            case 3:
                if (((org.telegram.ui.Wallet.a6) this.f39907b).f42111a && view.getTag() != org.telegram.ui.Wallet.a6.f42110n0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        w41 w41Var;
        org.telegram.messenger.ye yeVar;
        switch (this.f39906a) {
            case 0:
                y41 y41Var = (y41) this.f39907b;
                y41Var.f40588i1.setBounds(0, (int) ((y41Var.n1 - y41Var.f28653s0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                y41Var.f40588i1.draw(canvas);
                return;
            case 6:
                super.onDraw(canvas);
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.f39907b;
                Paint paint = wp0Var.f55690k1;
                tg.e1 e1Var = wp0Var.f55681d1;
                paint.setAlpha((int) ((1.0f - wp0Var.f55692m1) * e1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                tg.e0 e0Var = wp0Var.L0;
                int top = e0Var.getTop();
                float translationY = e1Var.getTranslationY() + e0Var.getTranslationY() + e1Var.getTop() + top;
                float f10 = rectF.left;
                tg.j1 j1Var = wp0Var.f55682e1;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), wp0Var.f55692m1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), wp0Var.f55692m1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), wp0Var.f55692m1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), wp0Var.f55692m1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(wp0Var.f55692m1, 32, 16));
                Paint paint2 = wp0Var.l1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * wp0Var.f55692m1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            case 7:
                tg.n1 n1Var = (tg.n1) this.f39907b;
                Rect rect = n1Var.E0;
                Rect rect2 = n1Var.D0;
                Paint paint3 = n1Var.F0;
                ot0 ot0Var = n1Var.f55877v0;
                Bitmap bitmap = n1Var.A0;
                if (n1Var.f55881z0 != null) {
                    canvas.save();
                    float d = n1Var.f55876u0.d(n1Var.f55875t0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, ot0Var.f36801a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = n1Var.f55880y0.d(n1Var.f55879x0);
                    if (!n1Var.f55879x0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(w41Var.getWidth() / 2.0f, w41Var.getHeight() / 2.0f);
                            canvas.rotate(n1Var.f55878w0);
                            float max = Math.max(ot0Var.f36801a / bitmap.getWidth(), ot0Var.f36802b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (n1Var.G0 != null) {
                                canvas.rotate(-n1Var.getOrientation());
                                int contentWidth = n1Var.getContentWidth();
                                int contentHeight = n1Var.getContentHeight();
                                if (((n1Var.getOrientation() + n1Var.G0.f26642k) / 90) % 2 == 1) {
                                    contentWidth = n1Var.getContentHeight();
                                    contentHeight = n1Var.getContentWidth();
                                }
                                org.telegram.messenger.ye yeVar2 = n1Var.G0;
                                float f11 = yeVar2.f26638e;
                                float f12 = yeVar2.f26639f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = n1Var.G0.f26637c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.ye yeVar3 = n1Var.G0;
                                canvas.translate(yeVar3.f26635a * f13, yeVar3.f26636b * f14);
                                canvas.rotate(n1Var.G0.d + yeVar.f26642k);
                                if (n1Var.G0.f26643l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(n1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint3);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 8:
                tg.d2 d2Var = (tg.d2) this.f39907b;
                ImageReceiver imageReceiver = d2Var.f55644x0;
                ot0 ot0Var2 = d2Var.f55642v0;
                if (d2Var.f55643w0 != null) {
                    canvas.save();
                    float d10 = d2Var.f55641u0.d(d2Var.f55640t0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, ot0Var2.f36801a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) ot0Var2.f36801a, (int) ot0Var2.f36802b);
                    imageReceiver.h(canvas, null);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        ug.o0 o0Var;
        ug.o0 o0Var2;
        switch (this.f39906a) {
            case 10:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.p0 p0Var = (ug.p0) this.f39907b;
                if (p0Var.f56771r && (o0Var2 = p0Var.h) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = p0Var.f56769f) != null) {
                    charSequence = o0Var.getText();
                }
                if (charSequence != null) {
                    accessibilityNodeInfo.setText(charSequence);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f39906a) {
            case 0:
                y41 y41Var = (y41) this.f39907b;
                if (motionEvent.getAction() == 0 && y41Var.n1 != 0 && motionEvent.getY() < y41Var.n1) {
                    y41Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 3:
                if (!((org.telegram.ui.Wallet.a6) this.f39907b).f42111a && !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        float top;
        int measuredHeight;
        hi.e eVar;
        switch (this.f39906a) {
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.w5) this.f39907b).S.c(org.telegram.messenger.g0.L(4.0f))));
                return;
            case 11:
                ug.w0 w0Var = (ug.w0) this.f39907b;
                if (w0Var.J0) {
                    w0Var.f56862q1 = View.MeasureSpec.getSize(i7);
                } else {
                    w0Var.f56862q1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                return;
            case 12:
                super.onMeasure(i7, i10);
                ug.f1 f1Var = (ug.f1) ((bi.k5) this.f39907b).d;
                bi.qd qdVar = f1Var.f56583j2;
                if (qdVar != null) {
                    top = qdVar.getTop();
                    measuredHeight = f1Var.f56583j2.getMeasuredHeight();
                } else {
                    View view = f1Var.f56593t2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = f1Var.f56593t2.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        f1Var.f56582i2.setTranslationY(f10 - (eVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                f1Var.f56582i2.setTranslationY(f10 - (eVar.getMeasuredHeight() / 2.0f));
                return;
            case 13:
                super.onMeasure(i7, i10);
                ((zh.y0) this.f39907b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f39906a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                Path path = (Path) this.f39907b;
                float paddingLeft = (i7 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i10 - getPaddingTop()) - getPaddingBottom();
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path.offset(getPaddingLeft(), getPaddingTop());
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39906a) {
            case 0:
                if (!((y41) this.f39907b).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 1:
                ((cc1) this.f39907b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.f39907b;
                    if (wp0Var.n1) {
                        wp0Var.z0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z9) {
        switch (this.f39906a) {
            case 5:
                super.onWindowFocusChanged(z9);
                if (z9) {
                    ((org.telegram.ui.Wallet.v9) this.f39907b).k0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f39906a) {
            case 0:
                super.setTranslationY(f10);
                y41.I0((y41) this.f39907b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public w41(tg.d2 d2Var, Context context) {
        super(context);
        this.f39906a = 8;
        this.f39907b = d2Var;
        setWillNotDraw(false);
    }

    public w41(tg.n1 n1Var, Context context) {
        super(context);
        this.f39906a = 7;
        this.f39907b = n1Var;
        setWillNotDraw(false);
    }

    public w41(org.telegram.ui.wp0 wp0Var, Context context) {
        super(context);
        this.f39906a = 6;
        this.f39907b = wp0Var;
        setWillNotDraw(false);
    }

    public w41(Context context) {
        super(context);
        this.f39906a = 4;
        this.f39907b = new Path();
        setClipChildren(false);
        setClipToPadding(false);
    }
}
