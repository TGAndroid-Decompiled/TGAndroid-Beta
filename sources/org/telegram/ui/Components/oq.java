package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
public class oq extends Path {
    public static ArrayList f38243g;
    public int f38247e;
    public int f38248f;
    public boolean f38245b = false;
    public boolean f38246c = true;
    public float d = 0.0f;
    public final ArrayList f38244a = new ArrayList(1);

    public oq() {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 34 && this.f38246c && !this.f38245b) {
            b(this.f38244a);
            this.f38245b = true;
        }
    }

    @Override
    public final void addRect(RectF rectF, Path.Direction direction) {
        RectF rectF2;
        if (Build.VERSION.SDK_INT >= 34 && this.f38246c) {
            ArrayList arrayList = this.f38244a;
            if (arrayList.size() <= 0 || !((RectF) i5.c.h(1, arrayList)).contains(rectF)) {
                if (arrayList.size() > 0 && Math.abs(rectF.top - ((RectF) i5.c.h(1, arrayList)).top) <= this.d && Math.abs(rectF.bottom - ((RectF) i5.c.h(1, arrayList)).bottom) <= this.d) {
                    ((RectF) i5.c.h(1, arrayList)).union(rectF);
                } else {
                    ArrayList arrayList2 = f38243g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF2 = (RectF) f38243g.remove(0);
                    } else {
                        rectF2 = new RectF();
                    }
                    rectF2.set(rectF);
                    arrayList.add(rectF2);
                }
                this.f38245b = false;
                return;
            }
            return;
        }
        float f10 = rectF.left;
        int i7 = this.f38247e;
        float f11 = f10 - i7;
        float f12 = rectF.top;
        int i10 = this.f38248f;
        super.addRect(f11, f12 - i10, rectF.right + i7, rectF.bottom + i10, direction);
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            boolean z10 = false;
            if (list.size() == 1) {
                super.addRect(((RectF) list.get(0)).left - this.f38247e, ((RectF) list.get(0)).top - this.f38248f, ((RectF) list.get(0)).right + this.f38247e, ((RectF) list.get(0)).bottom + this.f38248f, Path.Direction.CW);
                return;
            }
            RectF rectF = (RectF) list.get(0);
            int size = list.size() - 1;
            super.moveTo(rectF.left - this.f38247e, rectF.top - this.f38248f);
            for (int i7 = 1; i7 < list.size(); i7++) {
                RectF rectF2 = (RectF) list.get(i7);
                if (rectF2.width() != 0.0f) {
                    float f10 = rectF.bottom;
                    int i10 = this.f38248f;
                    float f11 = f10 + i10;
                    float f12 = rectF2.top;
                    if (f11 >= f12 - i10) {
                        float f13 = rectF.left;
                        if (f13 <= rectF2.right) {
                            float f14 = rectF.right;
                            float f15 = rectF2.left;
                            if (f14 >= f15) {
                                if (f13 != f15) {
                                    super.lineTo(f13 - this.f38247e, f12);
                                    super.lineTo(rectF2.left - this.f38247e, rectF2.top);
                                }
                                rectF = rectF2;
                            }
                        }
                    }
                    z10 = true;
                    size = i7;
                    break;
                }
            }
            super.lineTo(rectF.left - this.f38247e, rectF.bottom + this.f38248f);
            super.lineTo(rectF.right + this.f38247e, rectF.bottom + this.f38248f);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                RectF rectF3 = (RectF) list.get(i11);
                if (rectF3.width() != 0.0f) {
                    float f16 = rectF.right;
                    if (f16 != rectF3.right) {
                        super.lineTo(f16 + this.f38247e, rectF.top);
                        super.lineTo(rectF3.right + this.f38247e, rectF.top);
                    }
                    rectF = rectF3;
                }
            }
            super.lineTo(rectF.right + this.f38247e, rectF.top - this.f38248f);
            super.close();
            if (z10) {
                b(list.subList(size, list.size()));
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT >= 34 && this.f38246c) {
            ArrayList arrayList = f38243g;
            ArrayList arrayList2 = this.f38244a;
            if (arrayList == null) {
                f38243g = new ArrayList(arrayList2.size());
            }
            f38243g.addAll(arrayList2);
            arrayList2.clear();
            this.f38245b = false;
        }
    }

    @Override
    public final void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT >= 34 && this.f38246c) {
            ArrayList arrayList = f38243g;
            ArrayList arrayList2 = this.f38244a;
            if (arrayList == null) {
                f38243g = new ArrayList(arrayList2.size());
            }
            f38243g.addAll(arrayList2);
            arrayList2.clear();
            this.f38245b = false;
        }
    }

    public oq(int i7) {
    }

    @Override
    public void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.f38246c) {
            ArrayList arrayList = this.f38244a;
            if (arrayList.size() <= 0 || !((RectF) i5.c.h(1, arrayList)).contains(f10, f11, f12, f13)) {
                if (arrayList.size() > 0 && Math.abs(f11 - ((RectF) i5.c.h(1, arrayList)).top) <= this.d && Math.abs(f13 - ((RectF) i5.c.h(1, arrayList)).bottom) <= this.d) {
                    ((RectF) i5.c.h(1, arrayList)).union(f10, f11, f12, f13);
                } else {
                    ArrayList arrayList2 = f38243g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF = (RectF) f38243g.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f10, f11, f12, f13);
                    arrayList.add(rectF);
                }
                this.f38245b = false;
                return;
            }
            return;
        }
        int i7 = this.f38247e;
        float f14 = f10 - i7;
        int i10 = this.f38248f;
        super.addRect(f14, f11 - i10, f12 + i7, f13 + i10, direction);
    }
}
