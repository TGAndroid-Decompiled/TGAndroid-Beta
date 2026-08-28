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
public final class ej0 implements Choreographer.FrameCallback {
    public static final Matrix A = new Matrix();
    public static final Paint f37968x;
    public static final LinearGradient f37969y;
    public final Choreographer f37970a = Choreographer.getInstance();
    public List f37971b = new ArrayList();
    public final ArrayList f37972c = new ArrayList();
    public int d = 0;
    public int f37973e = 0;
    public float f37974f = 0.0f;
    public boolean h = false;
    public boolean f37975n = true;
    public long f37976r = 0;
    public float f37977s = AndroidUtilities.dp(40.0f);
    public View v;
    public gh.e9 f37978w;

    static {
        Paint paint = new Paint(1);
        f37968x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        f37969y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i9, float f10, dj0 dj0Var) {
        dj0 wtVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i9 >= 0 && i9 < lineCount) {
                if (dj0Var != null) {
                    wtVar = dj0Var;
                } else {
                    wtVar = new wt(layout, 24);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i9);
                int lineBottom = layout.getLineBottom(i9);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    wtVar.b(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i9);
                float lineRight = layout.getLineRight(i9);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i9);
                    float f11 = max - min;
                    float a2 = g7.n.a(f10, 0.0f, f11);
                    float f12 = a2 / f11;
                    if (a2 > 0.0f) {
                        if (a2 >= f11) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            wtVar.b(canvas);
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
                        wtVar.b(canvas);
                        canvas.restore();
                        Matrix matrix = A;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
                            matrix.postTranslate(lerp, 0.0f);
                        } else {
                            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
                            matrix.postTranslate(f11 - lerp, 0.0f);
                        }
                        f37969y.setLocalMatrix(matrix);
                        canvas.drawRect(min, f13, max, f14, f37968x);
                        canvas.restoreToCount(saveLayer);
                    }
                }
            }
        }
    }

    public static float i(Layout layout, int i9) {
        float lineRight = layout.getLineRight(i9) - layout.getLineLeft(i9);
        if (lineRight >= 0.0f) {
            return lineRight;
        }
        return -lineRight;
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int size = this.f37971b.size();
        View view = null;
        for (int i9 = 0; i9 < size; i9++) {
            cj0 cj0Var = (cj0) this.f37971b.get(i9);
            if (!this.f37975n && i9 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            ArrayList arrayList = this.f37972c;
            if (i9 < arrayList.size()) {
                f12 = ((Float) arrayList.get(i9)).floatValue();
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
            if (i9 < arrayList.size() && f11 != f12) {
                arrayList.set(i9, Float.valueOf(f11));
            }
            View parentView = cj0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f11) {
                    parentView.setAlpha(f11);
                }
                view = parentView;
            }
        }
    }

    public final float c(cj0 cj0Var) {
        int d = d(cj0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f37972c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(cj0 cj0Var) {
        int size = this.f37971b.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.f37971b.get(i9) == cj0Var) {
                return i9;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j10) {
        if (this.h) {
            long j11 = this.f37976r;
            float f10 = 0.0f;
            if (j11 != 0) {
                float f11 = ((float) (j10 - j11)) * 1.0E-9f;
                if (!this.f37971b.isEmpty() && f11 > 0.0f) {
                    float f12 = this.f37977s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f37971b.size()) {
                            this.f37975n = true;
                            break;
                        } else {
                            Layout layout = ((cj0) this.f37971b.get(this.d)).getLayout();
                            if (layout != null && layout.getLineCount() != 0) {
                                if (this.f37973e >= layout.getLineCount()) {
                                    int lineCount = layout.getLineCount() - 1;
                                    this.f37973e = lineCount;
                                    this.f37974f = i(layout, lineCount);
                                }
                                float i9 = i(layout, this.f37973e);
                                if (i9 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    float f13 = this.f37974f;
                                    float f14 = i9 - f13;
                                    if (f14 <= 0.001f) {
                                        if (k(layout)) {
                                            break;
                                        }
                                    } else {
                                        if (f12 < f14) {
                                            f14 = f12;
                                        }
                                        float f15 = f13 + f14;
                                        this.f37974f = f15;
                                        f12 -= f14;
                                        if (i9 - f15 <= 0.001f && !k(layout)) {
                                            f12 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f37973e = 0;
                                this.f37974f = 0.0f;
                            }
                        }
                    }
                    this.f37975n = f();
                } else {
                    this.f37975n = this.f37971b.isEmpty();
                }
                f10 = f11;
            }
            this.f37976r = j10;
            a(f10);
            e();
            if (this.f37975n) {
                this.h = false;
                ArrayList arrayList = this.f37972c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.set(i10, Float.valueOf(1.0f));
                }
                int size2 = this.f37971b.size();
                View view = null;
                for (int i11 = 0; i11 < size2; i11++) {
                    View parentView = ((cj0) this.f37971b.get(i11)).getParentView();
                    if (parentView != null && parentView != view) {
                        if (parentView.getAlpha() != 1.0f) {
                            parentView.setAlpha(1.0f);
                        }
                        view = parentView;
                    }
                }
                gh.e9 e9Var = this.f37978w;
                if (e9Var != null) {
                    e9Var.run();
                    this.f37978w = null;
                    return;
                }
                return;
            }
            this.f37970a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        cj0 cj0Var;
        int i9 = this.d;
        if (i9 >= 0 && i9 < this.f37971b.size() && (cj0Var = (cj0) this.f37971b.get(this.d)) != null) {
            view = cj0Var.getParentView();
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
        if (!this.f37971b.isEmpty()) {
            int size = this.f37971b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((cj0) this.f37971b.get(size)).getLayout();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i9 = this.d;
                if (i9 >= size) {
                    if (i9 <= size) {
                        int lineCount = layout.getLineCount() - 1;
                        float i10 = i(layout, lineCount);
                        if (this.f37973e < lineCount || this.f37974f < i10 - 0.001f) {
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

    public final boolean g(cj0 cj0Var) {
        Layout layout;
        if (d(cj0Var) == this.d && (layout = cj0Var.getLayout()) != null && this.f37973e < layout.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(cj0 cj0Var) {
        int d = d(cj0Var);
        if (d >= 0 && !this.f37971b.isEmpty()) {
            int i9 = this.d;
            if (d < i9 || d <= i9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k(Layout layout) {
        int i9 = this.f37973e + 1;
        this.f37973e = i9;
        this.f37974f = 0.0f;
        if (i9 >= layout.getLineCount()) {
            int i10 = this.d + 1;
            this.d = i10;
            this.f37973e = 0;
            this.f37974f = 0.0f;
            if (i10 >= this.f37971b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void l(List list) {
        float f10;
        int i9;
        ArrayList arrayList;
        boolean z10;
        float f11;
        int lineCount;
        float lineWidth;
        if (!this.f37971b.isEmpty() && this.d >= this.f37971b.size()) {
            int size = this.f37971b.size() - 1;
            this.d = size;
            Layout layout = ((cj0) this.f37971b.get(size)).getLayout();
            if (layout == null) {
                lineCount = 0;
            } else {
                lineCount = layout.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f37973e = max;
            if (layout == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = layout.getLineWidth(max);
            }
            this.f37974f = lineWidth;
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f37971b = list;
        if (list.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (int i10 = this.d; i10 < this.f37971b.size(); i10++) {
                Layout layout2 = ((cj0) this.f37971b.get(i10)).getLayout();
                if (layout2 != null) {
                    if (i10 == this.d) {
                        i9 = Math.min(Math.max(this.f37973e, 0), Math.max(0, layout2.getLineCount() - 1));
                    } else {
                        i9 = 0;
                    }
                    for (int i11 = i9; i11 < layout2.getLineCount(); i11++) {
                        float i12 = i(layout2, i11);
                        if (i12 > 0.001f) {
                            if (i10 == this.d && i11 == i9) {
                                i12 -= this.f37974f;
                                if (i12 <= 0.001f) {
                                }
                            }
                            f10 += i12;
                        }
                    }
                }
            }
        }
        float dp = AndroidUtilities.dp(40.0f);
        if (f10 <= 0.001f) {
            this.f37977s = dp;
        } else {
            this.f37977s = Math.max(dp, f10 / 1.05f);
        }
        this.f37975n = f();
        while (true) {
            arrayList = this.f37972c;
            if (arrayList.size() <= this.f37971b.size()) {
                break;
            }
            aa.d.u(1, arrayList);
        }
        for (int size2 = arrayList.size(); size2 < this.f37971b.size(); size2++) {
            if (!this.f37975n && size2 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(Float.valueOf(f11));
        }
        if (!this.f37975n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f37975n = true;
            }
            this.f37976r = 0L;
            this.f37970a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void m(gh.e9 e9Var) {
        this.f37978w = e9Var;
    }
}
