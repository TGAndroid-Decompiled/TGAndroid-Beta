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
import org.telegram.ui.zb1;
public final class w01 extends FrameLayout {
    public final int f41466a;
    public final Object f41467b;

    public w01(int i7, Context context, Object obj) {
        super(context);
        this.f41466a = i7;
        this.f41467b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f41466a) {
            case 4:
                int save = canvas.save();
                canvas.clipPath((Path) this.f41467b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            case 9:
                tg.o2 o2Var = (tg.o2) this.f41467b;
                if (o2Var.E > 0.0f && o2Var.f58159s != null) {
                    o2Var.f58160w.reset();
                    float width = getWidth() / o2Var.f58157n.getWidth();
                    o2Var.f58160w.postScale(width, width);
                    o2Var.f58158r.setLocalMatrix(o2Var.f58160w);
                    o2Var.f58159s.setAlpha((int) (o2Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), o2Var.f58159s);
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
        switch (this.f41466a) {
            case 9:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tg.o2) this.f41467b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41466a) {
            case 0:
                float a10 = ((lc) this.f41467b).a(0.03f);
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
        switch (this.f41466a) {
            case 3:
                if (((org.telegram.ui.Wallet.t6) this.f41467b).f45166a && view.getTag() != org.telegram.ui.Wallet.t6.f45165o0) {
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
        switch (this.f41466a) {
            case 1:
                m51 m51Var = (m51) this.f41467b;
                m51Var.f37385m1.setBounds(0, (int) ((m51Var.f37389r1 - m51Var.f30260t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                m51Var.f37385m1.draw(canvas);
                return;
            case 6:
                super.onDraw(canvas);
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f41467b;
                Paint paint = vp0Var.l1;
                tg.j1 j1Var = vp0Var.f58028e1;
                paint.setAlpha((int) ((1.0f - vp0Var.n1) * j1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                j1Var.b(rectF);
                tg.j0 j0Var = vp0Var.M0;
                int top = j0Var.getTop();
                float translationY = j1Var.getTranslationY() + j0Var.getTranslationY() + j1Var.getTop() + top;
                float f10 = rectF.left;
                tg.o1 o1Var = vp0Var.f58029f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, o1Var.getLeft(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.top + translationY, o1Var.getTop() - o1Var.getTranslationY(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.right, o1Var.getRight(), vp0Var.n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, o1Var.getBottom() - o1Var.getTranslationY(), vp0Var.n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(vp0Var.n1, 32, 16));
                Paint paint2 = vp0Var.f58037m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * vp0Var.n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            case 7:
                tg.s1 s1Var = (tg.s1) this.f41467b;
                Rect rect = s1Var.G0;
                Rect rect2 = s1Var.F0;
                Paint paint3 = s1Var.H0;
                xt0 xt0Var = s1Var.f58228x0;
                Bitmap bitmap = s1Var.C0;
                if (s1Var.B0 != null) {
                    canvas.save();
                    float d = s1Var.f58227w0.d(s1Var.f58226v0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, xt0Var.f42189a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = s1Var.A0.d(s1Var.f58230z0);
                    if (!s1Var.f58230z0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(w01Var.getWidth() / 2.0f, w01Var.getHeight() / 2.0f);
                            canvas.rotate(s1Var.f58229y0);
                            float max = Math.max(xt0Var.f42189a / bitmap.getWidth(), xt0Var.f42190b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (s1Var.I0 != null) {
                                canvas.rotate(-s1Var.getOrientation());
                                int contentWidth = s1Var.getContentWidth();
                                int contentHeight = s1Var.getContentHeight();
                                if (((s1Var.getOrientation() + s1Var.I0.f27775k) / 90) % 2 == 1) {
                                    contentWidth = s1Var.getContentHeight();
                                    contentHeight = s1Var.getContentWidth();
                                }
                                org.telegram.messenger.we weVar2 = s1Var.I0;
                                float f11 = weVar2.f27771e;
                                float f12 = weVar2.f27772f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = s1Var.I0.f27770c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.we weVar3 = s1Var.I0;
                                canvas.translate(weVar3.f27768a * f13, weVar3.f27769b * f14);
                                canvas.rotate(s1Var.I0.d + weVar.f27775k);
                                if (s1Var.I0.f27776l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(s1Var.getOrientation());
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
                tg.j2 j2Var = (tg.j2) this.f41467b;
                ImageReceiver imageReceiver = j2Var.f58008z0;
                xt0 xt0Var2 = j2Var.f58006x0;
                if (j2Var.f58007y0 != null) {
                    canvas.save();
                    float d10 = j2Var.f58005w0.d(j2Var.f58004v0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, xt0Var2.f42189a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.z0(0.0f, 0.0f, (int) xt0Var2.f42189a, (int) xt0Var2.f42190b);
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
        switch (this.f41466a) {
            case 10:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.r0 r0Var = (ug.r0) this.f41467b;
                if (r0Var.f58986r && (q0Var2 = r0Var.h) != null) {
                    charSequence = q0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (q0Var = r0Var.f58984f) != null) {
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
        switch (this.f41466a) {
            case 1:
                m51 m51Var = (m51) this.f41467b;
                if (motionEvent.getAction() == 0 && m51Var.f37389r1 != 0 && motionEvent.getY() < m51Var.f37389r1) {
                    m51Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 2:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 3:
                if (!((org.telegram.ui.Wallet.t6) this.f41467b).f45166a && !super.onInterceptTouchEvent(motionEvent)) {
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
        switch (this.f41466a) {
            case 11:
                ug.y0 y0Var = (ug.y0) this.f41467b;
                if (y0Var.K0) {
                    y0Var.f59085u1 = View.MeasureSpec.getSize(i7);
                } else {
                    y0Var.f59085u1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                return;
            case 12:
                super.onMeasure(i7, i10);
                ug.h1 h1Var = (ug.h1) ((di.l4) this.f41467b).d;
                di.bc bcVar = h1Var.f58808n2;
                if (bcVar != null) {
                    top = bcVar.getTop();
                    measuredHeight = h1Var.f58808n2.getMeasuredHeight();
                } else {
                    View view = h1Var.f58818x2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = h1Var.f58818x2.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        h1Var.f58807m2.setTranslationY(f10 - (eVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                h1Var.f58807m2.setTranslationY(f10 - (eVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f41466a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                Path path = (Path) this.f41467b;
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
        switch (this.f41466a) {
            case 1:
                if (!((m51) this.f41467b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                ((zb1) this.f41467b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f41467b;
                    if (vp0Var.f58040o1) {
                        vp0Var.C0(false);
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
        switch (this.f41466a) {
            case 5:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.oa) this.f41467b).k0(true);
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
        switch (this.f41466a) {
            case 0:
                super.setPressed(z10);
                ((lc) this.f41467b).c(z10);
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f41466a) {
            case 1:
                super.setTranslationY(f10);
                m51.J0((m51) this.f41467b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public w01(tg.j2 j2Var, Context context) {
        super(context);
        this.f41466a = 8;
        this.f41467b = j2Var;
        setWillNotDraw(false);
    }

    public w01(tg.s1 s1Var, Context context) {
        super(context);
        this.f41466a = 7;
        this.f41467b = s1Var;
        setWillNotDraw(false);
    }

    public w01(Context context, int i7) {
        super(context);
        this.f41466a = i7;
        switch (i7) {
            case 4:
                super(context);
                this.f41467b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
            default:
                this.f41467b = new lc(this);
                return;
        }
    }

    public w01(org.telegram.ui.vp0 vp0Var, Context context) {
        super(context);
        this.f41466a = 6;
        this.f41467b = vp0Var;
        setWillNotDraw(false);
    }
}
