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
public final class lj0 implements Choreographer.FrameCallback {
    public static final Matrix B = new Matrix();
    public static final Paint f38763x;
    public static final LinearGradient f38764y;
    public final Choreographer f38765a = Choreographer.getInstance();
    public List f38766b = new ArrayList();
    public final ArrayList f38767c = new ArrayList();
    public int d = 0;
    public int f38768e = 0;
    public float f38769f = 0.0f;
    public boolean h = false;
    public boolean f38770n = true;
    public long f38771r = 0;
    public float f38772s = AndroidUtilities.dp(40.0f);
    public View v;
    public mh.a9 f38773w;

    static {
        Paint paint = new Paint(1);
        f38763x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        f38764y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f10, kj0 kj0Var) {
        kj0 guVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i10 >= 0 && i10 < lineCount) {
                if (kj0Var != null) {
                    guVar = kj0Var;
                } else {
                    guVar = new gu(layout, 24);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i10);
                int lineBottom = layout.getLineBottom(i10);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    guVar.a(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i10);
                float lineRight = layout.getLineRight(i10);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i10);
                    float f11 = max - min;
                    float a2 = k7.o.a(f10, 0.0f, f11);
                    float f12 = a2 / f11;
                    if (a2 > 0.0f) {
                        if (a2 >= f11) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            guVar.a(canvas);
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
                        guVar.a(canvas);
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
                        f38764y.setLocalMatrix(matrix);
                        canvas.drawRect(min, f13, max, f14, f38763x);
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
        int size = this.f38766b.size();
        View view = null;
        for (int i10 = 0; i10 < size; i10++) {
            jj0 jj0Var = (jj0) this.f38766b.get(i10);
            if (!this.f38770n && i10 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            ArrayList arrayList = this.f38767c;
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
            View parentView = jj0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f11) {
                    parentView.setAlpha(f11);
                }
                view = parentView;
            }
        }
    }

    public final float c(jj0 jj0Var) {
        int d = d(jj0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f38767c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(jj0 jj0Var) {
        int size = this.f38766b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f38766b.get(i10) == jj0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j10) {
        if (this.h) {
            long j11 = this.f38771r;
            float f10 = 0.0f;
            if (j11 != 0) {
                float f11 = ((float) (j10 - j11)) * 1.0E-9f;
                if (!this.f38766b.isEmpty() && f11 > 0.0f) {
                    float f12 = this.f38772s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f38766b.size()) {
                            this.f38770n = true;
                            break;
                        } else {
                            Layout layout = ((jj0) this.f38766b.get(this.d)).getLayout();
                            if (layout != null && layout.getLineCount() != 0) {
                                if (this.f38768e >= layout.getLineCount()) {
                                    int lineCount = layout.getLineCount() - 1;
                                    this.f38768e = lineCount;
                                    this.f38769f = i(layout, lineCount);
                                }
                                float i10 = i(layout, this.f38768e);
                                if (i10 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    float f13 = this.f38769f;
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
                                        this.f38769f = f15;
                                        f12 -= f14;
                                        if (i10 - f15 <= 0.001f && !k(layout)) {
                                            f12 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f38768e = 0;
                                this.f38769f = 0.0f;
                            }
                        }
                    }
                    this.f38770n = f();
                } else {
                    this.f38770n = this.f38766b.isEmpty();
                }
                f10 = f11;
            }
            this.f38771r = j10;
            a(f10);
            e();
            if (this.f38770n) {
                this.h = false;
                ArrayList arrayList = this.f38767c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.set(i11, Float.valueOf(1.0f));
                }
                int size2 = this.f38766b.size();
                View view = null;
                for (int i12 = 0; i12 < size2; i12++) {
                    View parentView = ((jj0) this.f38766b.get(i12)).getParentView();
                    if (parentView != null && parentView != view) {
                        if (parentView.getAlpha() != 1.0f) {
                            parentView.setAlpha(1.0f);
                        }
                        view = parentView;
                    }
                }
                mh.a9 a9Var = this.f38773w;
                if (a9Var != null) {
                    a9Var.run();
                    this.f38773w = null;
                    return;
                }
                return;
            }
            this.f38765a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        jj0 jj0Var;
        int i10 = this.d;
        if (i10 >= 0 && i10 < this.f38766b.size() && (jj0Var = (jj0) this.f38766b.get(this.d)) != null) {
            view = jj0Var.getParentView();
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
        if (!this.f38766b.isEmpty()) {
            int size = this.f38766b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((jj0) this.f38766b.get(size)).getLayout();
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
                        if (this.f38768e < lineCount || this.f38769f < i11 - 0.001f) {
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

    public final boolean g(jj0 jj0Var) {
        Layout layout;
        if (d(jj0Var) == this.d && (layout = jj0Var.getLayout()) != null && this.f38768e < layout.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(jj0 jj0Var) {
        int d = d(jj0Var);
        if (d >= 0 && !this.f38766b.isEmpty()) {
            int i10 = this.d;
            if (d < i10 || d <= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k(Layout layout) {
        int i10 = this.f38768e + 1;
        this.f38768e = i10;
        this.f38769f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.f38768e = 0;
            this.f38769f = 0.0f;
            if (i11 >= this.f38766b.size()) {
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
        if (!this.f38766b.isEmpty() && this.d >= this.f38766b.size()) {
            int size = this.f38766b.size() - 1;
            this.d = size;
            Layout layout = ((jj0) this.f38766b.get(size)).getLayout();
            if (layout == null) {
                lineCount = 0;
            } else {
                lineCount = layout.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f38768e = max;
            if (layout == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = layout.getLineWidth(max);
            }
            this.f38769f = lineWidth;
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f38766b = list;
        if (list.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (int i11 = this.d; i11 < this.f38766b.size(); i11++) {
                Layout layout2 = ((jj0) this.f38766b.get(i11)).getLayout();
                if (layout2 != null) {
                    if (i11 == this.d) {
                        i10 = Math.min(Math.max(this.f38768e, 0), Math.max(0, layout2.getLineCount() - 1));
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = i10; i12 < layout2.getLineCount(); i12++) {
                        float i13 = i(layout2, i12);
                        if (i13 > 0.001f) {
                            if (i11 == this.d && i12 == i10) {
                                i13 -= this.f38769f;
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
            this.f38772s = dp;
        } else {
            this.f38772s = Math.max(dp, f10 / 1.05f);
        }
        this.f38770n = f();
        while (true) {
            arrayList = this.f38767c;
            if (arrayList.size() <= this.f38766b.size()) {
                break;
            }
            android.support.v4.media.a.u(1, arrayList);
        }
        for (int size2 = arrayList.size(); size2 < this.f38766b.size(); size2++) {
            if (!this.f38770n && size2 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(Float.valueOf(f11));
        }
        if (!this.f38770n && !(z4 = this.h) && !z4) {
            this.h = true;
            if (f()) {
                this.f38770n = true;
            }
            this.f38771r = 0L;
            this.f38765a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void m(mh.a9 a9Var) {
        this.f38773w = a9Var;
    }
}
