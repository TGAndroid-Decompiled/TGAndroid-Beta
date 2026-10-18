package org.telegram.ui.Wallet;

import ai.zd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.dw0;
public final class p9 extends FrameLayout {
    public final int f34719a;
    public final Object f34720b;

    public p9(Object obj, Context context, int i10) {
        super(context);
        this.f34719a = i10;
        this.f34720b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f34719a) {
            case 3:
                rg.s2 s2Var = (rg.s2) this.f34720b;
                if (s2Var.f45642y > 0.0f && s2Var.f45639s != null) {
                    s2Var.v.reset();
                    float width = getWidth() / s2Var.f45637n.getWidth();
                    s2Var.v.postScale(width, width);
                    s2Var.f45638r.setLocalMatrix(s2Var.v);
                    s2Var.f45639s.setAlpha((int) (s2Var.f45642y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), s2Var.f45639s);
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
        switch (this.f34719a) {
            case 3:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((rg.s2) this.f34720b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        p9 p9Var;
        MediaController.CropState cropState;
        switch (this.f34719a) {
            case 1:
                rg.x1 x1Var = (rg.x1) this.f34720b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                dw0 dw0Var = x1Var.f45702v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.f45706z0 != null) {
                    canvas.save();
                    float e = x1Var.f45701u0.e(x1Var.f45700t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, dw0Var.f25720a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = x1Var.f45705y0.e(x1Var.f45704x0);
                    if (!x1Var.f45704x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(p9Var.getWidth() / 2.0f, p9Var.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f45703w0);
                            float max = Math.max(dw0Var.f25720a / bitmap.getWidth(), dw0Var.f25721b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.G0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = x1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = x1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = x1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(x1Var.G0.cropRotate + cropState.transformRotation);
                                if (x1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(x1Var.getOrientation());
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
            case 2:
                rg.n2 n2Var = (rg.n2) this.f34720b;
                ImageReceiver imageReceiver = n2Var.f45548x0;
                dw0 dw0Var2 = n2Var.f45546v0;
                if (n2Var.f45547w0 != null) {
                    canvas.save();
                    float e10 = n2Var.f45545u0.e(n2Var.f45544t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, dw0Var2.f25720a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) dw0Var2.f25720a, (int) dw0Var2.f25721b);
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
        sg.p0 p0Var;
        sg.p0 p0Var2;
        switch (this.f34719a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.q0 q0Var = (sg.q0) this.f34720b;
                if (q0Var.h && (p0Var2 = q0Var.e) != null) {
                    charSequence = p0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (p0Var = q0Var.d) != null) {
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
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        gi.f fVar;
        switch (this.f34719a) {
            case 5:
                sg.y0 y0Var = (sg.y0) this.f34720b;
                z10 = ((org.telegram.ui.ActionBar.f3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f46507s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f46507s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                super.onMeasure(i10, i11);
                sg.m1 m1Var = ((sg.l1) this.f34720b).f46318c;
                zd zdVar = m1Var.f46336r0;
                if (zdVar != null) {
                    top = zdVar.getTop();
                    measuredHeight = m1Var.f46336r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f46335q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f46335q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 7:
                super.onMeasure(i10, i11);
                ((yh.g1) this.f34720b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f34719a) {
            case 0:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r9) this.f34720b).e0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z10);
                return;
        }
    }

    public p9(rg.n2 n2Var, Context context) {
        super(context);
        this.f34719a = 2;
        this.f34720b = n2Var;
        setWillNotDraw(false);
    }

    public p9(rg.x1 x1Var, Context context) {
        super(context);
        this.f34719a = 1;
        this.f34720b = x1Var;
        setWillNotDraw(false);
    }
}
