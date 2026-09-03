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
public final class mj0 implements Choreographer.FrameCallback {
    public static final Matrix B = new Matrix();
    public static final Paint f36115x;
    public static final LinearGradient f36116y;
    public final Choreographer f36117a = Choreographer.getInstance();
    public List f36118b = new ArrayList();
    public final ArrayList f36119c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f36120f = 0.0f;
    public boolean h = false;
    public boolean f36121n = true;
    public long f36122r = 0;
    public float f36123s = AndroidUtilities.dp(40.0f);
    public View v;
    public lh.a9 f36124w;

    static {
        Paint paint = new Paint(1);
        f36115x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        f36116y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f10, lj0 lj0Var) {
        lj0 huVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i10 >= 0 && i10 < lineCount) {
                if (lj0Var != null) {
                    huVar = lj0Var;
                } else {
                    huVar = new hu(layout, 24);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i10);
                int lineBottom = layout.getLineBottom(i10);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    huVar.a(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i10);
                float lineRight = layout.getLineRight(i10);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i10);
                    float f11 = max - min;
                    float a2 = k7.n.a(f10, 0.0f, f11);
                    float f12 = a2 / f11;
                    if (a2 > 0.0f) {
                        if (a2 >= f11) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            huVar.a(canvas);
                            canvas.restore();
                            return;
                        }
                        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f11, f12);
                        AndroidUtilities.dp(50.0f);
                        float f13 = lineTop;
                        float f14 = lineBottom;
                        int saveLayer = canvas.saveLayer(min, f13, max, f14, null);
                        canvas.save();
                        canvas.clipRect(min, f13, max, f14);
                        huVar.a(canvas);
                        canvas.restore();
                        Matrix matrix = B;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
                            matrix.postTranslate(lerp, 0.0f);
                        } else {
                            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
                            matrix.postTranslate(f11 - lerp, 0.0f);
                        }
                        f36116y.setLocalMatrix(matrix);
                        canvas.drawRect(min, f13, max, f14, f36115x);
                        canvas.restoreToCount(saveLayer);
                    }
                }
            }
        }
    }

    public static float i(Layout layout, int i10) {
        float lineRight = layout.getLineRight(i10) - layout.getLineLeft(i10);
        if (lineRight >= 0.0f) {
            return lineRight;
        }
        return -lineRight;
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int size = this.f36118b.size();
        View view = null;
        for (int i10 = 0; i10 < size; i10++) {
            kj0 kj0Var = (kj0) this.f36118b.get(i10);
            if (!this.f36121n && i10 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            ArrayList arrayList = this.f36119c;
            if (i10 < arrayList.size()) {
                f12 = ((Float) arrayList.get(i10)).floatValue();
            } else {
                f12 = f11;
            }
            if (f12 == f11) {
                f11 = f12;
            } else if (f10 > 0.0f) {
                float f13 = f10 / 0.2f;
                if (f11 > f12) {
                    f11 = Math.min(f11, f13 + f12);
                } else {
                    f11 = Math.max(f11, f12 - f13);
                }
            }
            if (i10 < arrayList.size() && f11 != f12) {
                arrayList.set(i10, Float.valueOf(f11));
            }
            View parentView = kj0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f11) {
                    parentView.setAlpha(f11);
                }
                view = parentView;
            }
        }
    }

    public final float c(kj0 kj0Var) {
        int d = d(kj0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f36119c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(kj0 kj0Var) {
        int size = this.f36118b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f36118b.get(i10) == kj0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j10) {
        if (this.h) {
            long j11 = this.f36122r;
            float f10 = 0.0f;
            if (j11 != 0) {
                float f11 = ((float) (j10 - j11)) * 1.0E-9f;
                if (!this.f36118b.isEmpty() && f11 > 0.0f) {
                    float f12 = this.f36123s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f36118b.size()) {
                            this.f36121n = true;
                            break;
                        } else {
                            Layout layout = ((kj0) this.f36118b.get(this.d)).getLayout();
                            if (layout != null && layout.getLineCount() != 0) {
                                if (this.e >= layout.getLineCount()) {
                                    int lineCount = layout.getLineCount() - 1;
                                    this.e = lineCount;
                                    this.f36120f = i(layout, lineCount);
                                }
                                float i10 = i(layout, this.e);
                                if (i10 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    float f13 = this.f36120f;
                                    float f14 = i10 - f13;
                                    if (f14 <= 0.001f) {
                                        if (k(layout)) {
                                            break;
                                        }
                                    } else {
                                        if (f12 < f14) {
                                            f14 = f12;
                                        }
                                        float f15 = f13 + f14;
                                        this.f36120f = f15;
                                        f12 -= f14;
                                        if (i10 - f15 <= 0.001f && !k(layout)) {
                                            f12 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.e = 0;
                                this.f36120f = 0.0f;
                            }
                        }
                    }
                    this.f36121n = f();
                } else {
                    this.f36121n = this.f36118b.isEmpty();
                }
                f10 = f11;
            }
            this.f36122r = j10;
            a(f10);
            e();
            if (this.f36121n) {
                this.h = false;
                ArrayList arrayList = this.f36119c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.set(i11, Float.valueOf(1.0f));
                }
                int size2 = this.f36118b.size();
                View view = null;
                for (int i12 = 0; i12 < size2; i12++) {
                    View parentView = ((kj0) this.f36118b.get(i12)).getParentView();
                    if (parentView != null && parentView != view) {
                        if (parentView.getAlpha() != 1.0f) {
                            parentView.setAlpha(1.0f);
                        }
                        view = parentView;
                    }
                }
                lh.a9 a9Var = this.f36124w;
                if (a9Var != null) {
                    a9Var.run();
                    this.f36124w = null;
                    return;
                }
                return;
            }
            this.f36117a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        kj0 kj0Var;
        int i10 = this.d;
        if (i10 >= 0 && i10 < this.f36118b.size() && (kj0Var = (kj0) this.f36118b.get(this.d)) != null) {
            view = kj0Var.getParentView();
        } else {
            view = null;
        }
        if (view != null) {
            view.invalidate();
            View view2 = this.v;
            if (view2 != null && view2 != view) {
                view2.invalidate();
            }
            this.v = view;
        }
    }

    public final boolean f() {
        if (!this.f36118b.isEmpty()) {
            int size = this.f36118b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((kj0) this.f36118b.get(size)).getLayout();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i10 = this.d;
                if (i10 >= size) {
                    if (i10 <= size) {
                        int lineCount = layout.getLineCount() - 1;
                        float i11 = i(layout, lineCount);
                        if (this.e < lineCount || this.f36120f < i11 - 0.001f) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean g(kj0 kj0Var) {
        Layout layout;
        if (d(kj0Var) == this.d && (layout = kj0Var.getLayout()) != null && this.e < layout.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(kj0 kj0Var) {
        int d = d(kj0Var);
        if (d >= 0 && !this.f36118b.isEmpty()) {
            int i10 = this.d;
            if (d < i10 || d <= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k(Layout layout) {
        int i10 = this.e + 1;
        this.e = i10;
        this.f36120f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.e = 0;
            this.f36120f = 0.0f;
            if (i11 >= this.f36118b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void l(List list) {
        float f10;
        int i10;
        ArrayList arrayList;
        boolean z4;
        float f11;
        int lineCount;
        float lineWidth;
        if (!this.f36118b.isEmpty() && this.d >= this.f36118b.size()) {
            int size = this.f36118b.size() - 1;
            this.d = size;
            Layout layout = ((kj0) this.f36118b.get(size)).getLayout();
            if (layout == null) {
                lineCount = 0;
            } else {
                lineCount = layout.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.e = max;
            if (layout == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = layout.getLineWidth(max);
            }
            this.f36120f = lineWidth;
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f36118b = list;
        if (list.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (int i11 = this.d; i11 < this.f36118b.size(); i11++) {
                Layout layout2 = ((kj0) this.f36118b.get(i11)).getLayout();
                if (layout2 != null) {
                    if (i11 == this.d) {
                        i10 = Math.min(Math.max(this.e, 0), Math.max(0, layout2.getLineCount() - 1));
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = i10; i12 < layout2.getLineCount(); i12++) {
                        float i13 = i(layout2, i12);
                        if (i13 > 0.001f) {
                            if (i11 == this.d && i12 == i10) {
                                i13 -= this.f36120f;
                                if (i13 <= 0.001f) {
                                }
                            }
                            f10 += i13;
                        }
                    }
                }
            }
        }
        float dp = AndroidUtilities.dp(40.0f);
        if (f10 <= 0.001f) {
            this.f36123s = dp;
        } else {
            this.f36123s = Math.max(dp, f10 / 1.05f);
        }
        this.f36121n = f();
        while (true) {
            arrayList = this.f36119c;
            if (arrayList.size() <= this.f36118b.size()) {
                break;
            }
            android.support.v4.media.a.u(1, arrayList);
        }
        for (int size2 = arrayList.size(); size2 < this.f36118b.size(); size2++) {
            if (!this.f36121n && size2 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(Float.valueOf(f11));
        }
        if (!this.f36121n && !(z4 = this.h) && !z4) {
            this.h = true;
            if (f()) {
                this.f36121n = true;
            }
            this.f36122r = 0L;
            this.f36117a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void m(lh.a9 a9Var) {
        this.f36124w = a9Var;
    }
}
