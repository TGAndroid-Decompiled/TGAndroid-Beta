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
public final class w01 extends FrameLayout {
    public final int f41515a;
    public final Object f41516b;

    public w01(int i7, Context context, Object obj) {
        super(context);
        this.f41515a = i7;
        this.f41516b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f41515a) {
            case 4:
                int save = canvas.save();
                canvas.clipPath((Path) this.f41516b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            case 9:
                tg.k2 k2Var = (tg.k2) this.f41516b;
                if (k2Var.E > 0.0f && k2Var.f57994s != null) {
                    k2Var.f57995w.reset();
                    float width = getWidth() / k2Var.f57992n.getWidth();
                    k2Var.f57995w.postScale(width, width);
                    k2Var.f57993r.setLocalMatrix(k2Var.f57995w);
                    k2Var.f57994s.setAlpha((int) (k2Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), k2Var.f57994s);
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
        switch (this.f41515a) {
            case 9:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tg.k2) this.f41516b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41515a) {
            case 0:
                float a10 = ((mc) this.f41516b).a(0.03f);
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
        switch (this.f41515a) {
            case 3:
                if (((org.telegram.ui.Wallet.s6) this.f41516b).f44994a && view.getTag() != org.telegram.ui.Wallet.s6.f44993o0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        w01 w01Var;
        org.telegram.messenger.we weVar;
        switch (this.f41515a) {
            case 1:
                k51 k51Var = (k51) this.f41516b;
                k51Var.f36684m1.setBounds(0, (int) ((k51Var.f36688r1 - k51Var.f30226t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                k51Var.f36684m1.draw(canvas);
                return;
            case 6:
                super.onDraw(canvas);
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f41516b;
                Paint paint = vp0Var.l1;
                tg.e1 e1Var = vp0Var.f57854e1;
                paint.setAlpha((int) ((1.0f - vp0Var.n1) * e1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                tg.e0 e0Var = vp0Var.M0;
                int top = e0Var.getTop();
                float translationY = e1Var.getTranslationY() + e0Var.getTranslationY() + e1Var.getTop() + top;
                float f10 = rectF.left;
                tg.j1 j1Var = vp0Var.f57855f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), vp0Var.n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), vp0Var.n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(vp0Var.n1, 32, 16));
                Paint paint2 = vp0Var.f57863m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * vp0Var.n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            case 7:
                tg.n1 n1Var = (tg.n1) this.f41516b;
                Rect rect = n1Var.F0;
                Rect rect2 = n1Var.E0;
                Paint paint3 = n1Var.G0;
                vt0 vt0Var = n1Var.f58049w0;
                Bitmap bitmap = n1Var.B0;
                if (n1Var.A0 != null) {
                    canvas.save();
                    float d = n1Var.f58048v0.d(n1Var.f58047u0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, vt0Var.f41433a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = n1Var.f58052z0.d(n1Var.f58051y0);
                    if (!n1Var.f58051y0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(w01Var.getWidth() / 2.0f, w01Var.getHeight() / 2.0f);
                            canvas.rotate(n1Var.f58050x0);
                            float max = Math.max(vt0Var.f41433a / bitmap.getWidth(), vt0Var.f41434b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (n1Var.H0 != null) {
                                canvas.rotate(-n1Var.getOrientation());
                                int contentWidth = n1Var.getContentWidth();
                                int contentHeight = n1Var.getContentHeight();
                                if (((n1Var.getOrientation() + n1Var.H0.f27683k) / 90) % 2 == 1) {
                                    contentWidth = n1Var.getContentHeight();
                                    contentHeight = n1Var.getContentWidth();
                                }
                                org.telegram.messenger.we weVar2 = n1Var.H0;
                                float f11 = weVar2.f27679e;
                                float f12 = weVar2.f27680f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = n1Var.H0.f27678c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.we weVar3 = n1Var.H0;
                                canvas.translate(weVar3.f27676a * f13, weVar3.f27677b * f14);
                                canvas.rotate(n1Var.H0.d + weVar.f27683k);
                                if (n1Var.H0.f27684l) {
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
                tg.f2 f2Var = (tg.f2) this.f41516b;
                ImageReceiver imageReceiver = f2Var.f57847y0;
                vt0 vt0Var2 = f2Var.f57845w0;
                if (f2Var.f57846x0 != null) {
                    canvas.save();
                    float d10 = f2Var.f57844v0.d(f2Var.f57843u0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, vt0Var2.f41433a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) vt0Var2.f41433a, (int) vt0Var2.f41434b);
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
        ug.r0 r0Var;
        ug.r0 r0Var2;
        switch (this.f41515a) {
            case 10:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.s0 s0Var = (ug.s0) this.f41516b;
                if (s0Var.f58865r && (r0Var2 = s0Var.h) != null) {
                    charSequence = r0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (r0Var = s0Var.f58863f) != null) {
                    charSequence = r0Var.getText();
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
        switch (this.f41515a) {
            case 1:
                k51 k51Var = (k51) this.f41516b;
                if (motionEvent.getAction() == 0 && k51Var.f36688r1 != 0 && motionEvent.getY() < k51Var.f36688r1) {
                    k51Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 2:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 3:
                if (!((org.telegram.ui.Wallet.s6) this.f41516b).f44994a && !super.onInterceptTouchEvent(motionEvent)) {
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
        ki.f fVar;
        switch (this.f41515a) {
            case 11:
                ug.z0 z0Var = (ug.z0) this.f41516b;
                if (z0Var.K0) {
                    z0Var.f58964u1 = View.MeasureSpec.getSize(i7);
                } else {
                    z0Var.f58964u1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                return;
            case 12:
                super.onMeasure(i7, i10);
                ug.i1 i1Var = (ug.i1) ((di.l4) this.f41516b).d;
                di.bc bcVar = i1Var.f58689n2;
                if (bcVar != null) {
                    top = bcVar.getTop();
                    measuredHeight = i1Var.f58689n2.getMeasuredHeight();
                } else {
                    View view = i1Var.f58699x2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = i1Var.f58699x2.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        i1Var.f58688m2.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                i1Var.f58688m2.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f41515a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                Path path = (Path) this.f41516b;
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
        switch (this.f41515a) {
            case 1:
                if (!((k51) this.f41516b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                ((bc1) this.f41516b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f41516b;
                    if (vp0Var.f57866o1) {
                        vp0Var.z0(false);
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
        switch (this.f41515a) {
            case 5:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.na) this.f41516b).k0(true);
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
        switch (this.f41515a) {
            case 0:
                super.setPressed(z10);
                ((mc) this.f41516b).c(z10);
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f41515a) {
            case 1:
                super.setTranslationY(f10);
                k51.J0((k51) this.f41516b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public w01(tg.f2 f2Var, Context context) {
        super(context);
        this.f41515a = 8;
        this.f41516b = f2Var;
        setWillNotDraw(false);
    }

    public w01(tg.n1 n1Var, Context context) {
        super(context);
        this.f41515a = 7;
        this.f41516b = n1Var;
        setWillNotDraw(false);
    }

    public w01(Context context, int i7) {
        super(context);
        this.f41515a = i7;
        switch (i7) {
            case 4:
                super(context);
                this.f41516b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
            default:
                this.f41516b = new mc(this);
                return;
        }
    }

    public w01(org.telegram.ui.vp0 vp0Var, Context context) {
        super(context);
        this.f41515a = 6;
        this.f41516b = vp0Var;
        setWillNotDraw(false);
    }
}
