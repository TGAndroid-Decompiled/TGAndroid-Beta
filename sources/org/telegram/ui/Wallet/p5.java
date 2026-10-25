package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import bi.qd;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.qw0;
public final class p5 extends FrameLayout {
    public final int f37096a;
    public final Object f37097b;

    public p5(Object obj, Context context, int i10) {
        super(context);
        this.f37096a = i10;
        this.f37097b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f37096a) {
            case 4:
                sg.v2 v2Var = (sg.v2) this.f37097b;
                if (v2Var.f48542y > 0.0f && v2Var.f48539s != null) {
                    v2Var.v.reset();
                    float width = getWidth() / v2Var.f48537n.getWidth();
                    v2Var.v.postScale(width, width);
                    v2Var.f48538r.setLocalMatrix(v2Var.v);
                    v2Var.f48539s.setAlpha((int) (v2Var.f48542y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v2Var.f48539s);
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
        switch (this.f37096a) {
            case 4:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((sg.v2) this.f37097b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f37096a) {
            case 0:
                if (((r5) this.f37097b).f37163a && view.getTag() != r5.f37162n0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        p5 p5Var;
        MediaController.CropState cropState;
        switch (this.f37096a) {
            case 2:
                sg.z1 z1Var = (sg.z1) this.f37097b;
                Rect rect = z1Var.E0;
                Rect rect2 = z1Var.D0;
                Paint paint = z1Var.F0;
                qw0 qw0Var = z1Var.f48602v0;
                Bitmap bitmap = z1Var.A0;
                if (z1Var.f48606z0 != null) {
                    canvas.save();
                    float e = z1Var.f48601u0.e(z1Var.f48600t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, qw0Var.f32052a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.t.A(1.0f, e, 4.0f * e, 0.25f));
                    float e10 = z1Var.f48605y0.e(z1Var.f48604x0);
                    if (!z1Var.f48604x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(p5Var.getWidth() / 2.0f, p5Var.getHeight() / 2.0f);
                            canvas.rotate(z1Var.f48603w0);
                            float max = Math.max(qw0Var.f32052a / bitmap.getWidth(), qw0Var.f32053b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (z1Var.G0 != null) {
                                canvas.rotate(-z1Var.getOrientation());
                                int contentWidth = z1Var.getContentWidth();
                                int contentHeight = z1Var.getContentHeight();
                                if (((z1Var.getOrientation() + z1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = z1Var.getContentHeight();
                                    contentHeight = z1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = z1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = z1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = z1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(z1Var.G0.cropRotate + cropState.transformRotation);
                                if (z1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(z1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 3:
                sg.q2 q2Var = (sg.q2) this.f37097b;
                ImageReceiver imageReceiver = q2Var.f48478x0;
                qw0 qw0Var2 = q2Var.f48476v0;
                if (q2Var.f48477w0 != null) {
                    canvas.save();
                    float e11 = q2Var.f48475u0.e(q2Var.f48474t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, qw0Var2.f32052a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.t.A(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) qw0Var2.f32052a, (int) qw0Var2.f32053b);
                    imageReceiver.draw(canvas);
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
        tg.o0 o0Var;
        tg.o0 o0Var2;
        switch (this.f37096a) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                tg.p0 p0Var = (tg.p0) this.f37097b;
                if (p0Var.f48980r && (o0Var2 = p0Var.h) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = p0Var.f48978f) != null) {
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
        switch (this.f37096a) {
            case 0:
                if (!((r5) this.f37097b).f37163a && !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        hi.e eVar;
        switch (this.f37096a) {
            case 6:
                tg.y0 y0Var = (tg.y0) this.f37097b;
                z10 = ((org.telegram.ui.ActionBar.k3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f49129s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f49129s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 7:
                super.onMeasure(i10, i11);
                tg.m1 m1Var = ((tg.l1) this.f37097b).f48927c;
                qd qdVar = m1Var.f48946r0;
                if (qdVar != null) {
                    top = qdVar.getTop();
                    measuredHeight = m1Var.f48946r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f48945q0.setTranslationY(f7 - (eVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f48945q0.setTranslationY(f7 - (eVar.getMeasuredHeight() / 2.0f));
                return;
            case 8:
                super.onMeasure(i10, i11);
                ((zh.g1) this.f37097b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f37096a) {
            case 1:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r9) this.f37097b).g0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z10);
                return;
        }
    }

    public p5(sg.q2 q2Var, Context context) {
        super(context);
        this.f37096a = 3;
        this.f37097b = q2Var;
        setWillNotDraw(false);
    }

    public p5(sg.z1 z1Var, Context context) {
        super(context);
        this.f37096a = 2;
        this.f37097b = z1Var;
        setWillNotDraw(false);
    }
}
