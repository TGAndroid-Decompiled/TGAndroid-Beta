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
public final class ng0 implements Choreographer.FrameCallback {
    public static final LinearGradient E;
    public static final Matrix F = new Matrix();
    public static final Paint f47991y;
    public final Choreographer f47992a = Choreographer.getInstance();
    public List f47993b = new ArrayList();
    public final ArrayList f47994c = new ArrayList();
    public int d = 0;
    public int f47995e = 0;
    public float f47996f = 0.0f;
    public boolean h = false;
    public boolean f47997n = true;
    public long f47998r = 0;
    public float f47999s = org.telegram.messenger.g0.L(40.0f);
    public View f48000w;
    public ci.i9 f48001x;

    static {
        Paint paint = new Paint(1);
        f47991y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        E = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i3, float f10, mg0 mg0Var) {
        mg0 urVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i3 >= 0 && i3 < lineCount) {
                if (mg0Var != null) {
                    urVar = mg0Var;
                } else {
                    urVar = new ur(layout, 25);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i3);
                int lineBottom = layout.getLineBottom(i3);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    urVar.d(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i3);
                float lineRight = layout.getLineRight(i3);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i3);
                    float f11 = max - min;
                    float a10 = b8.be.a(f10, 0.0f, f11);
                    float f12 = a10 / f11;
                    if (a10 > 0.0f) {
                        if (a10 >= f11) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            urVar.d(canvas);
                            canvas.restore();
                            return;
                        }
                        float T1 = org.telegram.messenger.g0.T1(-org.telegram.messenger.g0.L(50.0f), f11, f12);
                        org.telegram.messenger.g0.L(50.0f);
                        float f13 = lineTop;
                        float f14 = lineBottom;
                        int saveLayer = canvas.saveLayer(min, f13, max, f14, null);
                        canvas.save();
                        canvas.clipRect(min, f13, max, f14);
                        urVar.d(canvas);
                        canvas.restore();
                        Matrix matrix = F;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(org.telegram.messenger.g0.L(50.0f), 1.0f);
                            matrix.postTranslate(T1, 0.0f);
                        } else {
                            matrix.setScale(-org.telegram.messenger.g0.L(50.0f), 1.0f);
                            matrix.postTranslate(f11 - T1, 0.0f);
                        }
                        E.setLocalMatrix(matrix);
                        canvas.drawRect(min, f13, max, f14, f47991y);
                        canvas.restoreToCount(saveLayer);
                    }
                }
            }
        }
    }

    public static float h(Layout layout, int i3) {
        float lineRight = layout.getLineRight(i3) - layout.getLineLeft(i3);
        if (lineRight >= 0.0f) {
            return lineRight;
        }
        return -lineRight;
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int size = this.f47993b.size();
        View view = null;
        for (int i3 = 0; i3 < size; i3++) {
            lg0 lg0Var = (lg0) this.f47993b.get(i3);
            if (!this.f47997n && i3 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            ArrayList arrayList = this.f47994c;
            if (i3 < arrayList.size()) {
                f12 = ((Float) arrayList.get(i3)).floatValue();
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
            if (i3 < arrayList.size() && f11 != f12) {
                arrayList.set(i3, Float.valueOf(f11));
            }
            View e10 = lg0Var.e();
            if (e10 != null && e10 != view) {
                if (e10.getAlpha() != f11) {
                    e10.setAlpha(f11);
                }
                view = e10;
            }
        }
    }

    public final float c(lg0 lg0Var) {
        int d = d(lg0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f47994c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(lg0 lg0Var) {
        int size = this.f47993b.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f47993b.get(i3) == lg0Var) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j10) {
        if (this.h) {
            long j11 = this.f47998r;
            float f10 = 0.0f;
            if (j11 != 0) {
                float f11 = ((float) (j10 - j11)) * 1.0E-9f;
                if (!this.f47993b.isEmpty() && f11 > 0.0f) {
                    float f12 = this.f47999s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f47993b.size()) {
                            this.f47997n = true;
                            break;
                        } else {
                            Layout a10 = ((lg0) this.f47993b.get(this.d)).a();
                            if (a10 != null && a10.getLineCount() != 0) {
                                if (this.f47995e >= a10.getLineCount()) {
                                    int lineCount = a10.getLineCount() - 1;
                                    this.f47995e = lineCount;
                                    this.f47996f = h(a10, lineCount);
                                }
                                float h = h(a10, this.f47995e);
                                if (h <= 0.001f) {
                                    if (j(a10)) {
                                        break;
                                    }
                                } else {
                                    float f13 = this.f47996f;
                                    float f14 = h - f13;
                                    if (f14 <= 0.001f) {
                                        if (j(a10)) {
                                            break;
                                        }
                                    } else {
                                        if (f12 < f14) {
                                            f14 = f12;
                                        }
                                        float f15 = f13 + f14;
                                        this.f47996f = f15;
                                        f12 -= f14;
                                        if (h - f15 <= 0.001f && !j(a10)) {
                                            f12 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f47995e = 0;
                                this.f47996f = 0.0f;
                            }
                        }
                    }
                    this.f47997n = f();
                } else {
                    this.f47997n = this.f47993b.isEmpty();
                }
                f10 = f11;
            }
            this.f47998r = j10;
            a(f10);
            e();
            if (this.f47997n) {
                this.h = false;
                ArrayList arrayList = this.f47994c;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.set(i3, Float.valueOf(1.0f));
                }
                int size2 = this.f47993b.size();
                View view = null;
                for (int i10 = 0; i10 < size2; i10++) {
                    View e10 = ((lg0) this.f47993b.get(i10)).e();
                    if (e10 != null && e10 != view) {
                        if (e10.getAlpha() != 1.0f) {
                            e10.setAlpha(1.0f);
                        }
                        view = e10;
                    }
                }
                ci.i9 i9Var = this.f48001x;
                if (i9Var != null) {
                    i9Var.run();
                    this.f48001x = null;
                    return;
                }
                return;
            }
            this.f47992a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        lg0 lg0Var;
        int i3 = this.d;
        if (i3 >= 0 && i3 < this.f47993b.size() && (lg0Var = (lg0) this.f47993b.get(this.d)) != null) {
            view = lg0Var.e();
        } else {
            view = null;
        }
        if (view != null) {
            view.invalidate();
            View view2 = this.f48000w;
            if (view2 != null && view2 != view) {
                view2.invalidate();
            }
            this.f48000w = view;
        }
    }

    public final boolean f() {
        if (!this.f47993b.isEmpty()) {
            int size = this.f47993b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((lg0) this.f47993b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i3 = this.d;
                if (i3 >= size) {
                    if (i3 <= size) {
                        int lineCount = layout.getLineCount() - 1;
                        float h = h(layout, lineCount);
                        if (this.f47995e < lineCount || this.f47996f < h - 0.001f) {
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

    public final boolean g(lg0 lg0Var) {
        Layout a10;
        if (d(lg0Var) == this.d && (a10 = lg0Var.a()) != null && this.f47995e < a10.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean i(lg0 lg0Var) {
        int d = d(lg0Var);
        if (d >= 0 && !this.f47993b.isEmpty()) {
            int i3 = this.d;
            if (d < i3 || d <= i3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j(Layout layout) {
        int i3 = this.f47995e + 1;
        this.f47995e = i3;
        this.f47996f = 0.0f;
        if (i3 >= layout.getLineCount()) {
            int i10 = this.d + 1;
            this.d = i10;
            this.f47995e = 0;
            this.f47996f = 0.0f;
            if (i10 >= this.f47993b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f10;
        int i3;
        ArrayList arrayList2;
        boolean z10;
        float f11;
        int lineCount;
        float lineWidth;
        if (!this.f47993b.isEmpty() && this.d >= this.f47993b.size()) {
            int size = this.f47993b.size() - 1;
            this.d = size;
            Layout a10 = ((lg0) this.f47993b.get(size)).a();
            if (a10 == null) {
                lineCount = 0;
            } else {
                lineCount = a10.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f47995e = max;
            if (a10 == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = a10.getLineWidth(max);
            }
            this.f47996f = lineWidth;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f47993b = arrayList;
        if (arrayList.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (int i10 = this.d; i10 < this.f47993b.size(); i10++) {
                Layout a11 = ((lg0) this.f47993b.get(i10)).a();
                if (a11 != null) {
                    if (i10 == this.d) {
                        i3 = Math.min(Math.max(this.f47995e, 0), Math.max(0, a11.getLineCount() - 1));
                    } else {
                        i3 = 0;
                    }
                    for (int i11 = i3; i11 < a11.getLineCount(); i11++) {
                        float h = h(a11, i11);
                        if (h > 0.001f) {
                            if (i10 == this.d && i11 == i3) {
                                h -= this.f47996f;
                                if (h <= 0.001f) {
                                }
                            }
                            f10 += h;
                        }
                    }
                }
            }
        }
        float L = org.telegram.messenger.g0.L(40.0f);
        if (f10 <= 0.001f) {
            this.f47999s = L;
        } else {
            this.f47999s = Math.max(L, f10 / 1.05f);
        }
        this.f47997n = f();
        while (true) {
            arrayList2 = this.f47994c;
            if (arrayList2.size() <= this.f47993b.size()) {
                break;
            }
            a1.g.y(1, arrayList2);
        }
        for (int size2 = arrayList2.size(); size2 < this.f47993b.size(); size2++) {
            if (!this.f47997n && size2 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList2.add(Float.valueOf(f11));
        }
        if (!this.f47997n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f47997n = true;
            }
            this.f47998r = 0L;
            this.f47992a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void l(ci.i9 i9Var) {
        this.f48001x = i9Var;
    }
}
