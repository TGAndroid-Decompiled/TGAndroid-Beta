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
import org.telegram.ui.yb1;
public final class m01 extends FrameLayout {
    public final int f37021a;
    public final Object f37022b;

    public m01(int i7, Context context, Object obj) {
        super(context);
        this.f37021a = i7;
        this.f37022b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f37021a) {
            case 5:
                int save = canvas.save();
                canvas.clipPath((Path) this.f37022b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            case 10:
                tg.m2 m2Var = (tg.m2) this.f37022b;
                if (m2Var.E > 0.0f && m2Var.f57451s != null) {
                    m2Var.f57452w.reset();
                    float width = getWidth() / m2Var.f57449n.getWidth();
                    m2Var.f57452w.postScale(width, width);
                    m2Var.f57450r.setLocalMatrix(m2Var.f57452w);
                    m2Var.f57451s.setAlpha((int) (m2Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), m2Var.f57451s);
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
        switch (this.f37021a) {
            case 10:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tg.m2) this.f37022b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37021a) {
            case 0:
                float a10 = ((dc) this.f37022b).a(0.03f);
                canvas.save();
                canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f37021a) {
            case 4:
                if (((org.telegram.ui.Wallet.c6) this.f37022b).f43619a && view.getTag() != org.telegram.ui.Wallet.c6.f43618o0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        m01 m01Var;
        org.telegram.messenger.xe xeVar;
        switch (this.f37021a) {
            case 1:
                a51 a51Var = (a51) this.f37022b;
                a51Var.f32859m1.setBounds(0, (int) ((a51Var.f32863r1 - a51Var.f29716t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                a51Var.f32859m1.draw(canvas);
                return;
            case 7:
                super.onDraw(canvas);
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.f37022b;
                Paint paint = tp0Var.l1;
                tg.e1 e1Var = tp0Var.f57272e1;
                paint.setAlpha((int) ((1.0f - tp0Var.n1) * e1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                tg.e0 e0Var = tp0Var.M0;
                int top = e0Var.getTop();
                float translationY = e1Var.getTranslationY() + e0Var.getTranslationY() + e1Var.getTop() + top;
                float f10 = rectF.left;
                tg.j1 j1Var = tp0Var.f57273f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), tp0Var.n1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), tp0Var.n1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), tp0Var.n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), tp0Var.n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(tp0Var.n1, 32, 16));
                Paint paint2 = tp0Var.f57281m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * tp0Var.n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            case 8:
                tg.n1 n1Var = (tg.n1) this.f37022b;
                Rect rect = n1Var.F0;
                Rect rect2 = n1Var.E0;
                Paint paint3 = n1Var.G0;
                nt0 nt0Var = n1Var.f57468w0;
                Bitmap bitmap = n1Var.B0;
                if (n1Var.A0 != null) {
                    canvas.save();
                    float d = n1Var.f57467v0.d(n1Var.f57466u0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, nt0Var.f37713a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = n1Var.f57471z0.d(n1Var.f57470y0);
                    if (!n1Var.f57470y0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(m01Var.getWidth() / 2.0f, m01Var.getHeight() / 2.0f);
                            canvas.rotate(n1Var.f57469x0);
                            float max = Math.max(nt0Var.f37713a / bitmap.getWidth(), nt0Var.f37714b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (n1Var.H0 != null) {
                                canvas.rotate(-n1Var.getOrientation());
                                int contentWidth = n1Var.getContentWidth();
                                int contentHeight = n1Var.getContentHeight();
                                if (((n1Var.getOrientation() + n1Var.H0.f27495k) / 90) % 2 == 1) {
                                    contentWidth = n1Var.getContentHeight();
                                    contentHeight = n1Var.getContentWidth();
                                }
                                org.telegram.messenger.xe xeVar2 = n1Var.H0;
                                float f11 = xeVar2.f27491e;
                                float f12 = xeVar2.f27492f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = n1Var.H0.f27490c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.xe xeVar3 = n1Var.H0;
                                canvas.translate(xeVar3.f27488a * f13, xeVar3.f27489b * f14);
                                canvas.rotate(n1Var.H0.d + xeVar.f27495k);
                                if (n1Var.H0.f27496l) {
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
            case 9:
                tg.g2 g2Var = (tg.g2) this.f37022b;
                ImageReceiver imageReceiver = g2Var.f57314y0;
                nt0 nt0Var2 = g2Var.f57312w0;
                if (g2Var.f57313x0 != null) {
                    canvas.save();
                    float d10 = g2Var.f57311v0.d(g2Var.f57310u0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, nt0Var2.f37713a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) nt0Var2.f37713a, (int) nt0Var2.f37714b);
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
        ug.p0 p0Var;
        ug.p0 p0Var2;
        switch (this.f37021a) {
            case 11:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.q0 q0Var = (ug.q0) this.f37022b;
                if (q0Var.f58269r && (p0Var2 = q0Var.h) != null) {
                    charSequence = p0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (p0Var = q0Var.f58267f) != null) {
                    charSequence = p0Var.getText();
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
        switch (this.f37021a) {
            case 1:
                a51 a51Var = (a51) this.f37022b;
                if (motionEvent.getAction() == 0 && a51Var.f32863r1 != 0 && motionEvent.getY() < a51Var.f32863r1) {
                    a51Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 4:
                if (!((org.telegram.ui.Wallet.c6) this.f37022b).f43619a && !super.onInterceptTouchEvent(motionEvent)) {
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
        ki.f fVar;
        switch (this.f37021a) {
            case 3:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.y5) this.f37022b).T.c(org.telegram.messenger.g0.L(4.0f))));
                return;
            case 12:
                ug.x0 x0Var = (ug.x0) this.f37022b;
                if (x0Var.K0) {
                    x0Var.f58377u1 = View.MeasureSpec.getSize(i7);
                } else {
                    x0Var.f58377u1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                return;
            case 13:
                super.onMeasure(i7, i10);
                ug.g1 g1Var = (ug.g1) ((di.i4) this.f37022b).d;
                di.yb ybVar = g1Var.f58099n2;
                if (ybVar != null) {
                    top = ybVar.getTop();
                    measuredHeight = g1Var.f58099n2.getMeasuredHeight();
                } else {
                    View view = g1Var.f58109x2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = g1Var.f58109x2.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        g1Var.f58098m2.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                g1Var.f58098m2.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f37021a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                Path path = (Path) this.f37022b;
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
        switch (this.f37021a) {
            case 1:
                if (!((a51) this.f37022b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                ((yb1) this.f37022b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.f37022b;
                    if (tp0Var.f57284o1) {
                        tp0Var.z0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f37021a) {
            case 6:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.z9) this.f37022b).k0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z10);
                return;
        }
    }

    @Override
    public void setPressed(boolean z10) {
        switch (this.f37021a) {
            case 0:
                super.setPressed(z10);
                ((dc) this.f37022b).c(z10);
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f37021a) {
            case 1:
                super.setTranslationY(f10);
                a51.I0((a51) this.f37022b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public m01(tg.g2 g2Var, Context context) {
        super(context);
        this.f37021a = 9;
        this.f37022b = g2Var;
        setWillNotDraw(false);
    }

    public m01(tg.n1 n1Var, Context context) {
        super(context);
        this.f37021a = 8;
        this.f37022b = n1Var;
        setWillNotDraw(false);
    }

    public m01(Context context, int i7) {
        super(context);
        this.f37021a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.f37022b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
            default:
                this.f37022b = new dc(this);
                return;
        }
    }

    public m01(org.telegram.ui.tp0 tp0Var, Context context) {
        super(context);
        this.f37021a = 7;
        this.f37022b = tp0Var;
        setWillNotDraw(false);
    }
}
