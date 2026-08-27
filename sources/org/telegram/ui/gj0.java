package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.Layout;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;

public final class gj0 implements Choreographer.FrameCallback {
    public static final Matrix A = new Matrix();

    public static final Paint f38425x;

    public static final LinearGradient f38426y;

    public final Choreographer f38427a = Choreographer.getInstance();

    public List f38428b = new ArrayList();

    public final ArrayList f38429c = new ArrayList();
    public int d = 0;

    public int f38430e = 0;

    public float f38431f = 0.0f;
    public boolean h = false;

    public boolean f38432n = true;

    public long f38433r = 0;

    public float f38434s = AndroidUtilities.dp(40.0f);
    public View v;

    public hh.d9 f38435w;

    static {
        Paint paint = new Paint(1);
        f38425x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        f38426y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f10, fj0 fj0Var) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i10 < 0 || i10 >= lineCount) {
            return;
        }
        fj0 ztVar = fj0Var != null ? fj0Var : new zt(layout, 24);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            ztVar.b(canvas);
            canvas.restore();
        }
        float lineLeft = layout.getLineLeft(i10);
        float lineRight = layout.getLineRight(i10);
        float fMin = Math.min(lineLeft, lineRight);
        float fMax = Math.max(lineLeft, lineRight);
        if (fMax <= fMin) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(i10);
        float f11 = fMax - fMin;
        float fA = h7.n.a(f10, 0.0f, f11);
        float f12 = fA / f11;
        if (fA <= 0.0f) {
            return;
        }
        if (fA >= f11) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            ztVar.b(canvas);
            canvas.restore();
            return;
        }
        float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f11, f12);
        AndroidUtilities.dp(50.0f);
        float f13 = lineTop;
        float f14 = lineBottom;
        int iSaveLayer = canvas.saveLayer(fMin, f13, fMax, f14, null);
        canvas.save();
        canvas.clipRect(fMin, f13, fMax, f14);
        ztVar.b(canvas);
        canvas.restore();
        Matrix matrix = A;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(fLerp, 0.0f);
        } else {
            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(f11 - fLerp, 0.0f);
        }
        f38426y.setLocalMatrix(matrix);
        canvas.drawRect(fMin, f13, fMax, f14, f38425x);
        canvas.restoreToCount(iSaveLayer);
    }

    public static float i(Layout layout, int i10) {
        float lineRight = layout.getLineRight(i10) - layout.getLineLeft(i10);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public final void a(float f10) {
        int size = this.f38428b.size();
        View view = null;
        int i10 = 0;
        while (i10 < size) {
            ej0 ej0Var = (ej0) this.f38428b.get(i10);
            float fMin = (this.f38432n || i10 <= this.d) ? 1.0f : 0.0f;
            ArrayList arrayList = this.f38429c;
            float fFloatValue = i10 < arrayList.size() ? ((Float) arrayList.get(i10)).floatValue() : fMin;
            if (fFloatValue == fMin) {
                fMin = fFloatValue;
            } else if (f10 > 0.0f) {
                float f11 = f10 / 0.2f;
                fMin = fMin > fFloatValue ? Math.min(fMin, f11 + fFloatValue) : Math.max(fMin, fFloatValue - f11);
            }
            if (i10 < arrayList.size() && fMin != fFloatValue) {
                arrayList.set(i10, Float.valueOf(fMin));
            }
            View parentView = ej0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != fMin) {
                    parentView.setAlpha(fMin);
                }
                view = parentView;
            }
            i10++;
        }
    }

    public final float c(ej0 ej0Var) {
        int iD = d(ej0Var);
        if (iD < 0) {
            return 1.0f;
        }
        ArrayList arrayList = this.f38429c;
        if (iD >= arrayList.size()) {
            return 1.0f;
        }
        return ((Float) arrayList.get(iD)).floatValue();
    }

    public final int d(ej0 ej0Var) {
        int size = this.f38428b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f38428b.get(i10) == ej0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j10) {
        if (this.h) {
            long j11 = this.f38433r;
            float f10 = 0.0f;
            if (j11 != 0) {
                float f11 = (j10 - j11) * 1.0E-9f;
                if (this.f38428b.isEmpty() || f11 <= 0.0f) {
                    this.f38432n = this.f38428b.isEmpty();
                } else {
                    float f12 = this.f38434s * f11;
                    while (f12 > 0.0f) {
                        if (this.d >= this.f38428b.size()) {
                            this.f38432n = true;
                            break;
                        }
                        Layout layout = ((ej0) this.f38428b.get(this.d)).getLayout();
                        if (layout != null && layout.getLineCount() != 0) {
                            if (this.f38430e >= layout.getLineCount()) {
                                int lineCount = layout.getLineCount() - 1;
                                this.f38430e = lineCount;
                                this.f38431f = i(layout, lineCount);
                            }
                            float fI = i(layout, this.f38430e);
                            if (fI <= 0.001f) {
                                if (k(layout)) {
                                    break;
                                }
                            } else {
                                float f13 = this.f38431f;
                                float f14 = fI - f13;
                                if (f14 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    if (f12 < f14) {
                                        f14 = f12;
                                    }
                                    float f15 = f13 + f14;
                                    this.f38431f = f15;
                                    f12 -= f14;
                                    if (fI - f15 <= 0.001f && !k(layout)) {
                                        f12 = 0.0f;
                                    }
                                }
                            }
                        } else {
                            this.d++;
                            this.f38430e = 0;
                            this.f38431f = 0.0f;
                        }
                    }
                    this.f38432n = f();
                }
                f10 = f11;
            }
            this.f38433r = j10;
            a(f10);
            e();
            if (!this.f38432n) {
                this.f38427a.postFrameCallback(this);
                return;
            }
            this.h = false;
            ArrayList arrayList = this.f38429c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.set(i10, Float.valueOf(1.0f));
            }
            int size2 = this.f38428b.size();
            View view = null;
            for (int i11 = 0; i11 < size2; i11++) {
                View parentView = ((ej0) this.f38428b.get(i11)).getParentView();
                if (parentView != null && parentView != view) {
                    if (parentView.getAlpha() != 1.0f) {
                        parentView.setAlpha(1.0f);
                    }
                    view = parentView;
                }
            }
            hh.d9 d9Var = this.f38435w;
            if (d9Var != null) {
                d9Var.run();
                this.f38435w = null;
            }
        }
    }

    public final void e() {
        ej0 ej0Var;
        int i10 = this.d;
        View parentView = (i10 < 0 || i10 >= this.f38428b.size() || (ej0Var = (ej0) this.f38428b.get(this.d)) == null) ? null : ej0Var.getParentView();
        if (parentView != null) {
            parentView.invalidate();
            View view = this.v;
            if (view != null && view != parentView) {
                view.invalidate();
            }
            this.v = parentView;
        }
    }

    public final boolean f() {
        if (!this.f38428b.isEmpty()) {
            int size = this.f38428b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((ej0) this.f38428b.get(size)).getLayout();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i10 = this.d;
                if (i10 < size) {
                    return false;
                }
                if (i10 <= size) {
                    int lineCount = layout.getLineCount() - 1;
                    float fI = i(layout, lineCount);
                    if (this.f38430e < lineCount || this.f38431f < fI - 0.001f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean g(ej0 ej0Var) {
        Layout layout;
        return d(ej0Var) == this.d && (layout = ej0Var.getLayout()) != null && this.f38430e < layout.getLineCount();
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(ej0 ej0Var) {
        int iD = d(ej0Var);
        if (iD < 0 || this.f38428b.isEmpty()) {
            return false;
        }
        int i10 = this.d;
        return iD < i10 || iD <= i10;
    }

    public final boolean k(Layout layout) {
        int i10 = this.f38430e + 1;
        this.f38430e = i10;
        this.f38431f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.f38430e = 0;
            this.f38431f = 0.0f;
            if (i11 >= this.f38428b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void l(List list) {
        float f10;
        ArrayList arrayList;
        boolean z10;
        if (!this.f38428b.isEmpty() && this.d >= this.f38428b.size()) {
            int size = this.f38428b.size() - 1;
            this.d = size;
            Layout layout = ((ej0) this.f38428b.get(size)).getLayout();
            int iMax = Math.max(0, layout == null ? 0 : layout.getLineCount() - 1);
            this.f38430e = iMax;
            this.f38431f = layout == null ? 0.0f : layout.getLineWidth(iMax);
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f38428b = list;
        if (list.isEmpty()) {
            f10 = 0.0f;
        } else {
            int i10 = this.d;
            f10 = 0.0f;
            while (i10 < this.f38428b.size()) {
                Layout layout2 = ((ej0) this.f38428b.get(i10)).getLayout();
                if (layout2 != null) {
                    int iMin = i10 == this.d ? Math.min(Math.max(this.f38430e, 0), Math.max(0, layout2.getLineCount() - 1)) : 0;
                    for (int i11 = iMin; i11 < layout2.getLineCount(); i11++) {
                        float fI = i(layout2, i11);
                        if (fI > 0.001f) {
                            if (i10 == this.d && i11 == iMin) {
                                fI -= this.f38431f;
                                if (fI > 0.001f) {
                                    f10 += fI;
                                }
                            } else {
                                f10 += fI;
                            }
                        }
                    }
                }
                i10++;
            }
        }
        float fDp = AndroidUtilities.dp(40.0f);
        if (f10 <= 0.001f) {
            this.f38434s = fDp;
        } else {
            this.f38434s = Math.max(fDp, f10 / 1.05f);
        }
        this.f38432n = f();
        while (true) {
            arrayList = this.f38429c;
            if (arrayList.size() <= this.f38428b.size()) {
                break;
            } else {
                a9.p.s(1, arrayList);
            }
        }
        int size2 = arrayList.size();
        while (size2 < this.f38428b.size()) {
            arrayList.add(Float.valueOf((this.f38432n || size2 <= this.d) ? 1.0f : 0.0f));
            size2++;
        }
        if (!this.f38432n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f38432n = true;
            }
            this.f38433r = 0L;
            this.f38427a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void m(hh.d9 d9Var) {
        this.f38435w = d9Var;
    }
}
