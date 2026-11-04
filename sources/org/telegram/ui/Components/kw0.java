package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.sb1;
public final class kw0 extends FrameLayout {
    public final int f35499a;
    public final Object f35500b;

    public kw0(int i3, Context context, Object obj) {
        super(context);
        this.f35499a = i3;
        this.f35500b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        int size;
        boolean z11;
        float f12;
        int L;
        int i3;
        float f13;
        float f14;
        float f15;
        float L2;
        ArrayList arrayList;
        switch (this.f35499a) {
            case 0:
                ow0 ow0Var = (ow0) this.f35500b;
                mw0 mw0Var = ow0Var.f36962c;
                if (mw0Var != null && mw0Var.getEditField() != null) {
                    org.telegram.messenger.f6 f6Var = ow0Var.W;
                    if (f6Var != null && f6Var.h) {
                        float x10 = ow0Var.f36962c.getEditField().getX() + ow0Var.f36962c.getEditField().getPaddingLeft();
                        org.telegram.messenger.f6 f6Var2 = ow0Var.W;
                        ow0Var.f36964d0 = x10 + f6Var2.f22457n;
                        ow0Var.f36959a0 = f6Var2.f22458r;
                    } else if (ow0Var.f36961b0 != null && ow0Var.f36963c0 != null) {
                        ow0Var.f36964d0 = ow0Var.f36962c.getEditField().getX() + ow0Var.f36962c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                if (ow0Var.f36972s && !ow0Var.f36973w && (arrayList = ow0Var.f36974x) != null && !arrayList.isEmpty() && !ow0Var.f36975y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u5 u5Var = ow0Var.S;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = u5Var.e(false, f10);
                u5 u5Var2 = ow0Var.T;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e11 = u5Var2.e(false, f11);
                float e12 = ow0Var.f36966e0.e(false, ow0Var.f36964d0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z10) {
                    ow0Var.d.setVisibility(8);
                }
                ow0Var.P.rewind();
                float left = ow0Var.f36965e.getLeft();
                int left2 = ow0Var.f36965e.getLeft();
                ArrayList arrayList2 = ow0Var.f36974x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.k5.D(44.0f, size, left2);
                u5 u5Var3 = ow0Var.f36969g0;
                float f16 = u5Var3.f38645c;
                if (f16 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f17 = D - left;
                if (f17 > 0.0f) {
                    f16 = u5Var3.e(z11, f17);
                }
                float e13 = ow0Var.f36968f0.e(z11, (left + D) / 2.0f);
                mw0 mw0Var2 = ow0Var.f36962c;
                if (mw0Var2 != null && mw0Var2.getEditField() != null) {
                    int i10 = ow0Var.h;
                    if (i10 == 0) {
                        ow0Var.d.setTranslationY(((-ow0Var.f36962c.getEditField().getHeight()) - ow0Var.f36962c.getEditField().getScrollY()) + ow0Var.f36959a0 + org.telegram.messenger.g0.L(5.0f));
                    } else if (i10 == 1) {
                        ow0Var.d.setTranslationY(((-ow0Var.getMeasuredHeight()) - ow0Var.f36962c.getEditField().getScrollY()) + ow0Var.f36959a0 + org.telegram.messenger.g0.L(20.0f) + ow0Var.d.getHeight());
                    }
                }
                float f18 = f16 / 4.0f;
                float f19 = f16 / 2.0f;
                int max = (int) Math.max((ow0Var.f36964d0 - Math.max(f18, Math.min(f19, org.telegram.messenger.g0.L(66.0f)))) - ow0Var.f36965e.getLeft(), 0.0f);
                if (ow0Var.f36965e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    ow0Var.f36965e.setPadding(max, 0, 0, 0);
                    ow0Var.f36965e.scrollBy(ow0Var.f36965e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                ow0Var.f36965e.setTranslationX(((int) Math.max((e12 - Math.max(f18, Math.min(f19, org.telegram.messenger.g0.L(66.0f)))) - ow0Var.f36965e.getLeft(), 0.0f)) - max);
                float translationX = ow0Var.f36965e.getTranslationX() + (e13 - f19) + ow0Var.f36965e.getPaddingLeft();
                float translationY = ow0Var.f36965e.getTranslationY() + ow0Var.f36965e.getTop() + ow0Var.f36965e.getPaddingTop();
                if (ow0Var.h == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(6.66f);
                }
                float f20 = translationY + L;
                float min = Math.min(ow0Var.f36965e.getTranslationX() + e13 + f19 + ow0Var.f36965e.getPaddingLeft(), ow0Var.getWidth() - ow0Var.d.getPaddingRight());
                float translationY2 = ow0Var.f36965e.getTranslationY() + ow0Var.f36965e.getBottom();
                if (ow0Var.h == 0) {
                    i3 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    i3 = 0;
                }
                float f21 = translationY2 - i3;
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f19) * 2.0f;
                int i11 = ow0Var.h;
                if (i11 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f22 = f21 - min2;
                    float f23 = translationX + min2;
                    rectF.set(translationX, f22, f23, f21);
                    ow0Var.P.arcTo(rectF, 90.0f, 90.0f);
                    float f24 = f20 + min2;
                    rectF.set(translationX, f20, f23, f24);
                    ow0Var.P.arcTo(rectF, -180.0f, 90.0f);
                    float f25 = min - min2;
                    rectF.set(f25, f20, min, f24);
                    ow0Var.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f25, f22, min, f21);
                    ow0Var.P.arcTo(rectF, 0.0f, 90.0f);
                    ow0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f21);
                    ow0Var.P.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + f21);
                    ow0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f21);
                } else if (i11 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f26 = min - min2;
                    float f27 = f20 + min2;
                    rectF2.set(f26, f20, min, f27);
                    ow0Var.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f28 = f21 - min2;
                    rectF2.set(f26, f28, min, f21);
                    ow0Var.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f29 = min2 + translationX;
                    rectF2.set(translationX, f28, f29, f21);
                    ow0Var.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f20, f29, f27);
                    ow0Var.P.arcTo(rectF2, -180.0f, 90.0f);
                    ow0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f20);
                    ow0Var.P.lineTo(e12, f20 - org.telegram.messenger.g0.L(6.66f));
                    ow0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f20);
                }
                ow0Var.P.close();
                if (ow0Var.R == null) {
                    Paint paint = new Paint(1);
                    ow0Var.R = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    ow0Var.R.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    ow0Var.R.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28130qf, ow0Var.f36960b));
                }
                if (e10 < f12) {
                    ow0Var.Q.rewind();
                    if (ow0Var.h == 0) {
                        L2 = org.telegram.messenger.g0.L(6.66f) + f21;
                    } else {
                        L2 = f20 - org.telegram.messenger.g0.L(6.66f);
                    }
                    double d = e12 - translationX;
                    double d10 = L2 - f20;
                    f13 = 255.0f;
                    double d11 = e12 - min;
                    double d12 = L2 - f21;
                    ow0Var.Q.addCircle(e12, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d10, 2.0d) + Math.pow(d, 2.0d), Math.pow(d10, 2.0d) + Math.pow(d11, 2.0d)), Math.max(Math.pow(d12, 2.0d) + Math.pow(d, 2.0d), Math.pow(d12, 2.0d) + Math.pow(d11, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(ow0Var.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, ow0Var.getWidth(), ow0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(ow0Var.P, ow0Var.R);
                canvas.save();
                canvas.clipPath(ow0Var.P);
                super.dispatchDraw(canvas);
                float f30 = ow0Var.f36969g0.f38645c;
                float f31 = ow0Var.f36968f0.f38645c;
                float f32 = f30 / 2.0f;
                float translationX2 = ow0Var.f36965e.getTranslationX() + (f31 - f32) + ow0Var.f36965e.getPaddingLeft();
                float paddingTop = ow0Var.f36965e.getPaddingTop() + ow0Var.f36965e.getTop();
                float min3 = Math.min(ow0Var.f36965e.getTranslationX() + f31 + f32 + ow0Var.f36965e.getPaddingLeft(), ow0Var.getWidth() - ow0Var.d.getPaddingRight());
                float bottom = ow0Var.f36965e.getBottom();
                u5 u5Var4 = ow0Var.U;
                if (ow0Var.f36965e.canScrollHorizontally(-1)) {
                    f14 = f12;
                } else {
                    f14 = 0.0f;
                }
                float e14 = u5Var4.e(false, f14);
                if (e14 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.k6.F4.setBounds(i12, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.k6.F4.setAlpha((int) (e14 * f13));
                    org.telegram.ui.ActionBar.k6.F4.draw(canvas);
                }
                u5 u5Var5 = ow0Var.V;
                if (ow0Var.f36965e.canScrollHorizontally(1)) {
                    f15 = f12;
                } else {
                    f15 = 0.0f;
                }
                float e15 = u5Var5.e(false, f15);
                if (e15 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.k6.E4.setBounds(i13 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.k6.E4.setAlpha((int) (e15 * f13));
                    org.telegram.ui.ActionBar.k6.E4.draw(canvas);
                }
                canvas.restore();
                if (ow0Var.S.f38645c < f12) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 10:
                ug.j2 j2Var = (ug.j2) this.f35500b;
                if (j2Var.E > 0.0f && j2Var.f56108s != null) {
                    j2Var.f56109w.reset();
                    float width = getWidth() / j2Var.f56106n.getWidth();
                    j2Var.f56109w.postScale(width, width);
                    j2Var.f56107r.setLocalMatrix(j2Var.f56109w);
                    j2Var.f56108s.setAlpha((int) (j2Var.E * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), j2Var.f56108s);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f35499a) {
            case 10:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((ug.j2) this.f35500b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f35499a) {
            case 1:
                float a10 = ((gc) this.f35500b).a(0.03f);
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f35499a) {
            case 5:
                if (((org.telegram.ui.Wallet.a6) this.f35500b).f42136a && view.getTag() != org.telegram.ui.Wallet.a6.f42135o0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        kw0 kw0Var;
        org.telegram.messenger.re reVar;
        switch (this.f35499a) {
            case 2:
                r41 r41Var = (r41) this.f35500b;
                r41Var.f37647j1.setBounds(0, (int) ((r41Var.f37650o1 - r41Var.f28617t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                r41Var.f37647j1.draw(canvas);
                return;
            case 7:
                super.onDraw(canvas);
                org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.f35500b;
                Paint paint = lp0Var.f55976l1;
                ug.d1 d1Var = lp0Var.f55968e1;
                paint.setAlpha((int) ((1.0f - lp0Var.f55978n1) * d1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                d1Var.b(rectF);
                ug.d0 d0Var = lp0Var.M0;
                int top = d0Var.getTop();
                float translationY = d1Var.getTranslationY() + d0Var.getTranslationY() + d1Var.getTop() + top;
                float f10 = rectF.left;
                ug.i1 i1Var = lp0Var.f55969f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, i1Var.getLeft(), lp0Var.f55978n1), org.telegram.messenger.g0.T1(rectF.top + translationY, i1Var.getTop() - i1Var.getTranslationY(), lp0Var.f55978n1), org.telegram.messenger.g0.T1(rectF.right, i1Var.getRight(), lp0Var.f55978n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, i1Var.getBottom() - i1Var.getTranslationY(), lp0Var.f55978n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(lp0Var.f55978n1, 32, 16));
                Paint paint2 = lp0Var.m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * lp0Var.f55978n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            case 8:
                ug.n1 n1Var = (ug.n1) this.f35500b;
                Rect rect = n1Var.F0;
                Rect rect2 = n1Var.E0;
                Paint paint3 = n1Var.G0;
                lt0 lt0Var = n1Var.f56183w0;
                Bitmap bitmap = n1Var.B0;
                if (n1Var.A0 != null) {
                    canvas.save();
                    float d = n1Var.f56182v0.d(n1Var.f56181u0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, lt0Var.f35877a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d, 4.0f * d, 0.25f));
                    float d10 = n1Var.f56186z0.d(n1Var.f56185y0);
                    if (!n1Var.f56185y0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(kw0Var.getWidth() / 2.0f, kw0Var.getHeight() / 2.0f);
                            canvas.rotate(n1Var.f56184x0);
                            float max = Math.max(lt0Var.f35877a / bitmap.getWidth(), lt0Var.f35878b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (n1Var.H0 != null) {
                                canvas.rotate(-n1Var.getOrientation());
                                int contentWidth = n1Var.getContentWidth();
                                int contentHeight = n1Var.getContentHeight();
                                if (((n1Var.getOrientation() + n1Var.H0.f25117k) / 90) % 2 == 1) {
                                    contentWidth = n1Var.getContentHeight();
                                    contentHeight = n1Var.getContentWidth();
                                }
                                org.telegram.messenger.re reVar2 = n1Var.H0;
                                float f11 = reVar2.f25113e;
                                float f12 = reVar2.f25114f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = n1Var.H0.f25112c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.re reVar3 = n1Var.H0;
                                canvas.translate(reVar3.f25110a * f13, reVar3.f25111b * f14);
                                canvas.rotate(n1Var.H0.d + reVar.f25117k);
                                if (n1Var.H0.f25118l) {
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
                ug.d2 d2Var = (ug.d2) this.f35500b;
                ImageReceiver imageReceiver = d2Var.f55948y0;
                lt0 lt0Var2 = d2Var.f55946w0;
                if (d2Var.f55947x0 != null) {
                    canvas.save();
                    float d11 = d2Var.f55945v0.d(d2Var.f55944u0);
                    canvas.scale(1.0f - (d11 * 2.0f), 1.0f, lt0Var2.f35877a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d11, 4.0f * d11, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) lt0Var2.f35877a, (int) lt0Var2.f35878b);
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
        vg.n0 n0Var;
        vg.n0 n0Var2;
        switch (this.f35499a) {
            case 11:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                vg.o0 o0Var = (vg.o0) this.f35500b;
                if (o0Var.f56765r && (n0Var2 = o0Var.h) != null) {
                    charSequence = n0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (n0Var = o0Var.f56763f) != null) {
                    charSequence = n0Var.getText();
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
        switch (this.f35499a) {
            case 2:
                r41 r41Var = (r41) this.f35500b;
                if (motionEvent.getAction() == 0 && r41Var.f37650o1 != 0 && motionEvent.getY() < r41Var.f37650o1) {
                    r41Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 5:
                if (!((org.telegram.ui.Wallet.a6) this.f35500b).f42136a && !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int L;
        int L2;
        float f10;
        float top;
        int measuredHeight;
        ii.f fVar;
        switch (this.f35499a) {
            case 0:
                ow0 ow0Var = (ow0) this.f35500b;
                int i11 = ow0Var.f36970n;
                if (ow0Var.h == 0) {
                    L = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L = org.telegram.messenger.g0.L(6.66f);
                }
                int i12 = ow0Var.f36970n;
                if (ow0Var.h == 0) {
                    L2 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                }
                setPadding(i11, L, i12, L2);
                super.onMeasure(i3, i10);
                return;
            case 4:
                super.onMeasure(i3, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.w5) this.f35500b).T.c(org.telegram.messenger.g0.L(4.0f))));
                return;
            case 12:
                vg.v0 v0Var = (vg.v0) this.f35500b;
                if (v0Var.K0) {
                    v0Var.f56880r1 = View.MeasureSpec.getSize(i3);
                } else {
                    v0Var.f56880r1 = (int) (Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i3, i10);
                return;
            case 13:
                super.onMeasure(i3, i10);
                vg.h1 h1Var = (vg.h1) ((ci.r4) this.f35500b).d;
                ci.ic icVar = h1Var.f56633k2;
                if (icVar != null) {
                    top = icVar.getTop();
                    measuredHeight = h1Var.f56633k2.getMeasuredHeight();
                } else {
                    View view = h1Var.f56643u2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = h1Var.f56643u2.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        h1Var.f56632j2.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                h1Var.f56632j2.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35499a) {
            case 2:
                if (!((r41) this.f35500b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 3:
                ((sb1) this.f35500b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.f35500b;
                    if (lp0Var.f55980o1) {
                        lp0Var.z0(false);
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
        switch (this.f35499a) {
            case 6:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.w9) this.f35500b).k0(true);
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
        switch (this.f35499a) {
            case 1:
                super.setPressed(z10);
                ((gc) this.f35500b).c(z10);
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f35499a) {
            case 2:
                super.setTranslationY(f10);
                r41.I0((r41) this.f35500b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        boolean z10;
        boolean z11;
        switch (this.f35499a) {
            case 0:
                ow0 ow0Var = (ow0) this.f35500b;
                if (getVisibility() == i3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                super.setVisibility(i3);
                if (!z10) {
                    if (i3 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (ow0Var.f36965e != null) {
                        for (int i10 = 0; i10 < ow0Var.f36965e.getChildCount(); i10++) {
                            if (z11) {
                                nw0 nw0Var = (nw0) ow0Var.f36965e.getChildAt(i10);
                                Drawable drawable = nw0Var.f36632b;
                                if (drawable instanceof g5) {
                                    ((g5) drawable).a(nw0Var);
                                }
                                nw0Var.f36633c = true;
                            } else {
                                nw0 nw0Var2 = (nw0) ow0Var.f36965e.getChildAt(i10);
                                Drawable drawable2 = nw0Var2.f36632b;
                                if (drawable2 instanceof g5) {
                                    ((g5) drawable2).n(nw0Var2);
                                }
                                nw0Var2.f36633c = false;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    public kw0(ug.d2 d2Var, Context context) {
        super(context);
        this.f35499a = 9;
        this.f35500b = d2Var;
        setWillNotDraw(false);
    }

    public kw0(ug.n1 n1Var, Context context) {
        super(context);
        this.f35499a = 8;
        this.f35500b = n1Var;
        setWillNotDraw(false);
    }

    public kw0(Context context) {
        super(context);
        this.f35499a = 1;
        this.f35500b = new gc(this);
    }

    public kw0(org.telegram.ui.lp0 lp0Var, Context context) {
        super(context);
        this.f35499a = 7;
        this.f35500b = lp0Var;
        setWillNotDraw(false);
    }
}
