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
import org.telegram.ui.bc1;
public final class x01 extends FrameLayout {
    public final int f41896a;
    public final Object f41897b;

    public x01(int i7, Context context, Object obj) {
        super(context);
        this.f41896a = i7;
        this.f41897b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f41896a) {
            case 4:
                int save = canvas.save();
                canvas.clipPath((Path) this.f41897b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            case 9:
                tg.l2 l2Var = (tg.l2) this.f41897b;
                if (l2Var.E > 0.0f && l2Var.f58019s != null) {
                    l2Var.f58020w.reset();
                    float width = getWidth() / l2Var.f58017n.getWidth();
                    l2Var.f58020w.postScale(width, width);
                    l2Var.f58018r.setLocalMatrix(l2Var.f58020w);
                    l2Var.f58019s.setAlpha((int) (l2Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), l2Var.f58019s);
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
        switch (this.f41896a) {
            case 9:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tg.l2) this.f41897b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41896a) {
            case 0:
                float a10 = ((mc) this.f41897b).a(0.03f);
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
        switch (this.f41896a) {
            case 3:
                if (((org.telegram.ui.Wallet.s6) this.f41897b).f45004a && view.getTag() != org.telegram.ui.Wallet.s6.f45003o0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        x01 x01Var;
        org.telegram.messenger.xe xeVar;
        switch (this.f41896a) {
            case 1:
                n51 n51Var = (n51) this.f41897b;
                n51Var.f37742m1.setBounds(0, (int) ((n51Var.f37746r1 - n51Var.f30176t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                n51Var.f37742m1.draw(canvas);
                return;
            case 6:
                super.onDraw(canvas);
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.f41897b;
                Paint paint = wp0Var.l1;
                tg.f1 f1Var = wp0Var.f57877e1;
                paint.setAlpha((int) ((1.0f - wp0Var.n1) * f1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                f1Var.b(rectF);
                tg.f0 f0Var = wp0Var.M0;
                int top = f0Var.getTop();
                float translationY = f1Var.getTranslationY() + f0Var.getTranslationY() + f1Var.getTop() + top;
                float f10 = rectF.left;
                tg.k1 k1Var = wp0Var.f57878f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, k1Var.getLeft(), wp0Var.n1), org.telegram.messenger.g0.T1(rectF.top + translationY, k1Var.getTop() - k1Var.getTranslationY(), wp0Var.n1), org.telegram.messenger.g0.T1(rectF.right, k1Var.getRight(), wp0Var.n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, k1Var.getBottom() - k1Var.getTranslationY(), wp0Var.n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(wp0Var.n1, 32, 16));
                Paint paint2 = wp0Var.f57886m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * wp0Var.n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            case 7:
                tg.p1 p1Var = (tg.p1) this.f41897b;
                Rect rect = p1Var.F0;
                Rect rect2 = p1Var.E0;
                Paint paint3 = p1Var.G0;
                yt0 yt0Var = p1Var.f58095w0;
                Bitmap bitmap = p1Var.B0;
                if (p1Var.A0 != null) {
                    canvas.save();
                    float d = p1Var.f58094v0.d(p1Var.f58093u0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, yt0Var.f42506a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = p1Var.f58098z0.d(p1Var.f58097y0);
                    if (!p1Var.f58097y0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(x01Var.getWidth() / 2.0f, x01Var.getHeight() / 2.0f);
                            canvas.rotate(p1Var.f58096x0);
                            float max = Math.max(yt0Var.f42506a / bitmap.getWidth(), yt0Var.f42507b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (p1Var.H0 != null) {
                                canvas.rotate(-p1Var.getOrientation());
                                int contentWidth = p1Var.getContentWidth();
                                int contentHeight = p1Var.getContentHeight();
                                if (((p1Var.getOrientation() + p1Var.H0.f27845k) / 90) % 2 == 1) {
                                    contentWidth = p1Var.getContentHeight();
                                    contentHeight = p1Var.getContentWidth();
                                }
                                org.telegram.messenger.xe xeVar2 = p1Var.H0;
                                float f11 = xeVar2.f27841e;
                                float f12 = xeVar2.f27842f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = p1Var.H0.f27840c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.xe xeVar3 = p1Var.H0;
                                canvas.translate(xeVar3.f27838a * f13, xeVar3.f27839b * f14);
                                canvas.rotate(p1Var.H0.d + xeVar.f27845k);
                                if (p1Var.H0.f27846l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(p1Var.getOrientation());
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
                tg.g2 g2Var = (tg.g2) this.f41897b;
                ImageReceiver imageReceiver = g2Var.f57872y0;
                yt0 yt0Var2 = g2Var.f57870w0;
                if (g2Var.f57871x0 != null) {
                    canvas.save();
                    float d10 = g2Var.f57869v0.d(g2Var.f57868u0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, yt0Var2.f42506a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) yt0Var2.f42506a, (int) yt0Var2.f42507b);
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
        ug.q0 q0Var;
        ug.q0 q0Var2;
        switch (this.f41896a) {
            case 10:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.r0 r0Var = (ug.r0) this.f41897b;
                if (r0Var.f58871r && (q0Var2 = r0Var.h) != null) {
                    charSequence = q0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (q0Var = r0Var.f58869f) != null) {
                    charSequence = q0Var.getText();
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
        switch (this.f41896a) {
            case 1:
                n51 n51Var = (n51) this.f41897b;
                if (motionEvent.getAction() == 0 && n51Var.f37746r1 != 0 && motionEvent.getY() < n51Var.f37746r1) {
                    n51Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 2:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 3:
                if (!((org.telegram.ui.Wallet.s6) this.f41897b).f45004a && !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        float top;
        int measuredHeight;
        ki.e eVar;
        switch (this.f41896a) {
            case 11:
                ug.y0 y0Var = (ug.y0) this.f41897b;
                if (y0Var.K0) {
                    y0Var.f58968u1 = View.MeasureSpec.getSize(i7);
                } else {
                    y0Var.f58968u1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                return;
            case 12:
                super.onMeasure(i7, i10);
                ug.h1 h1Var = (ug.h1) ((di.l4) this.f41897b).d;
                di.bc bcVar = h1Var.f58693n2;
                if (bcVar != null) {
                    top = bcVar.getTop();
                    measuredHeight = h1Var.f58693n2.getMeasuredHeight();
                } else {
                    View view = h1Var.f58703x2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = h1Var.f58703x2.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        h1Var.f58692m2.setTranslationY(f10 - (eVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                h1Var.f58692m2.setTranslationY(f10 - (eVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f41896a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                Path path = (Path) this.f41897b;
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
        switch (this.f41896a) {
            case 1:
                if (!((n51) this.f41897b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                ((bc1) this.f41897b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.f41897b;
                    if (wp0Var.f57889o1) {
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
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f41896a) {
            case 5:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.na) this.f41897b).k0(true);
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
        switch (this.f41896a) {
            case 0:
                super.setPressed(z10);
                ((mc) this.f41897b).c(z10);
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f41896a) {
            case 1:
                super.setTranslationY(f10);
                n51.J0((n51) this.f41897b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public x01(tg.g2 g2Var, Context context) {
        super(context);
        this.f41896a = 8;
        this.f41897b = g2Var;
        setWillNotDraw(false);
    }

    public x01(tg.p1 p1Var, Context context) {
        super(context);
        this.f41896a = 7;
        this.f41897b = p1Var;
        setWillNotDraw(false);
    }

    public x01(Context context, int i7) {
        super(context);
        this.f41896a = i7;
        switch (i7) {
            case 4:
                super(context);
                this.f41897b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
            default:
                this.f41897b = new mc(this);
                return;
        }
    }

    public x01(org.telegram.ui.wp0 wp0Var, Context context) {
        super(context);
        this.f41896a = 6;
        this.f41897b = wp0Var;
        setWillNotDraw(false);
    }
}
