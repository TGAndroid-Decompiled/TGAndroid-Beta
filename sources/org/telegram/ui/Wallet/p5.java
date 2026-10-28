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
import org.telegram.ui.Components.rw0;
public final class p5 extends FrameLayout {
    public final int f37122a;
    public final Object f37123b;

    public p5(Object obj, Context context, int i10) {
        super(context);
        this.f37122a = i10;
        this.f37123b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f37122a) {
            case 4:
                sg.u2 u2Var = (sg.u2) this.f37123b;
                if (u2Var.f48570y > 0.0f && u2Var.f48567s != null) {
                    u2Var.v.reset();
                    float width = getWidth() / u2Var.f48565n.getWidth();
                    u2Var.v.postScale(width, width);
                    u2Var.f48566r.setLocalMatrix(u2Var.v);
                    u2Var.f48567s.setAlpha((int) (u2Var.f48570y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), u2Var.f48567s);
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
        switch (this.f37122a) {
            case 4:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((sg.u2) this.f37123b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f37122a) {
            case 0:
                if (((r5) this.f37123b).f37190a && view.getTag() != r5.f37189n0) {
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
        switch (this.f37122a) {
            case 2:
                sg.y1 y1Var = (sg.y1) this.f37123b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                rw0 rw0Var = y1Var.f48630v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.f48634z0 != null) {
                    canvas.save();
                    float e = y1Var.f48629u0.e(y1Var.f48628t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, rw0Var.f32392a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.t.A(1.0f, e, 4.0f * e, 0.25f));
                    float e10 = y1Var.f48633y0.e(y1Var.f48632x0);
                    if (!y1Var.f48632x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(p5Var.getWidth() / 2.0f, p5Var.getHeight() / 2.0f);
                            canvas.rotate(y1Var.f48631w0);
                            float max = Math.max(rw0Var.f32392a / bitmap.getWidth(), rw0Var.f32393b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y1Var.G0 != null) {
                                canvas.rotate(-y1Var.getOrientation());
                                int contentWidth = y1Var.getContentWidth();
                                int contentHeight = y1Var.getContentHeight();
                                if (((y1Var.getOrientation() + y1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y1Var.getContentHeight();
                                    contentHeight = y1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = y1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = y1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(y1Var.G0.cropRotate + cropState.transformRotation);
                                if (y1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y1Var.getOrientation());
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
                sg.p2 p2Var = (sg.p2) this.f37123b;
                ImageReceiver imageReceiver = p2Var.f48508x0;
                rw0 rw0Var2 = p2Var.f48506v0;
                if (p2Var.f48507w0 != null) {
                    canvas.save();
                    float e11 = p2Var.f48505u0.e(p2Var.f48504t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, rw0Var2.f32392a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.t.A(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) rw0Var2.f32392a, (int) rw0Var2.f32393b);
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
        switch (this.f37122a) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                tg.p0 p0Var = (tg.p0) this.f37123b;
                if (p0Var.f49018r && (o0Var2 = p0Var.h) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = p0Var.f49016f) != null) {
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
        switch (this.f37122a) {
            case 0:
                if (!((r5) this.f37123b).f37190a && !super.onInterceptTouchEvent(motionEvent)) {
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
        switch (this.f37122a) {
            case 6:
                tg.y0 y0Var = (tg.y0) this.f37123b;
                z10 = ((org.telegram.ui.ActionBar.k3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f49167s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f49167s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 7:
                super.onMeasure(i10, i11);
                tg.m1 m1Var = ((tg.l1) this.f37123b).f48965c;
                qd qdVar = m1Var.f48984r0;
                if (qdVar != null) {
                    top = qdVar.getTop();
                    measuredHeight = m1Var.f48984r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f48983q0.setTranslationY(f7 - (eVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f48983q0.setTranslationY(f7 - (eVar.getMeasuredHeight() / 2.0f));
                return;
            case 8:
                super.onMeasure(i10, i11);
                ((zh.g1) this.f37123b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f37122a) {
            case 1:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r9) this.f37123b).g0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z10);
                return;
        }
    }

    public p5(sg.p2 p2Var, Context context) {
        super(context);
        this.f37122a = 3;
        this.f37123b = p2Var;
        setWillNotDraw(false);
    }

    public p5(sg.y1 y1Var, Context context) {
        super(context);
        this.f37122a = 2;
        this.f37123b = y1Var;
        setWillNotDraw(false);
    }
}
