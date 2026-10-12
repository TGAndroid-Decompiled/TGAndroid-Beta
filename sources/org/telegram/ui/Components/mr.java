package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
public class mr extends Path {
    public static ArrayList f28644g;
    public int f28648e;
    public int f28649f;
    public boolean f28646b = false;
    public boolean f28647c = true;
    public float d = 0.0f;
    public final ArrayList f28645a = new ArrayList(1);

    public mr() {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 34 && this.f28647c && !this.f28646b) {
            b(this.f28645a);
            this.f28646b = true;
        }
    }

    @Override
    public final void addRect(RectF rectF, Path.Direction direction) {
        RectF rectF2;
        if (Build.VERSION.SDK_INT >= 34 && this.f28647c) {
            ArrayList arrayList = this.f28645a;
            if (arrayList.size() <= 0 || !((RectF) hg.c.h(1, arrayList)).contains(rectF)) {
                if (arrayList.size() > 0 && Math.abs(rectF.top - ((RectF) hg.c.h(1, arrayList)).top) <= this.d && Math.abs(rectF.bottom - ((RectF) hg.c.h(1, arrayList)).bottom) <= this.d) {
                    ((RectF) hg.c.h(1, arrayList)).union(rectF);
                } else {
                    ArrayList arrayList2 = f28644g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF2 = (RectF) f28644g.remove(0);
                    } else {
                        rectF2 = new RectF();
                    }
                    rectF2.set(rectF);
                    arrayList.add(rectF2);
                }
                this.f28646b = false;
                return;
            }
            return;
        }
        float f7 = rectF.left;
        int i10 = this.f28648e;
        float f10 = f7 - i10;
        float f11 = rectF.top;
        int i11 = this.f28649f;
        super.addRect(f10, f11 - i11, rectF.right + i10, rectF.bottom + i11, direction);
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            boolean z10 = false;
            if (list.size() == 1) {
                super.addRect(((RectF) list.get(0)).left - this.f28648e, ((RectF) list.get(0)).top - this.f28649f, ((RectF) list.get(0)).right + this.f28648e, ((RectF) list.get(0)).bottom + this.f28649f, Path.Direction.CW);
                return;
            }
            RectF rectF = (RectF) list.get(0);
            int size = list.size() - 1;
            super.moveTo(rectF.left - this.f28648e, rectF.top - this.f28649f);
            for (int i10 = 1; i10 < list.size(); i10++) {
                RectF rectF2 = (RectF) list.get(i10);
                if (rectF2.width() != 0.0f) {
                    float f7 = rectF.bottom;
                    int i11 = this.f28649f;
                    float f10 = f7 + i11;
                    float f11 = rectF2.top;
                    if (f10 >= f11 - i11) {
                        float f12 = rectF.left;
                        if (f12 <= rectF2.right) {
                            float f13 = rectF.right;
                            float f14 = rectF2.left;
                            if (f13 >= f14) {
                                if (f12 != f14) {
                                    super.lineTo(f12 - this.f28648e, f11);
                                    super.lineTo(rectF2.left - this.f28648e, rectF2.top);
                                }
                                rectF = rectF2;
                            }
                        }
                    }
                    z10 = true;
                    size = i10;
                    break;
                }
            }
            super.lineTo(rectF.left - this.f28648e, rectF.bottom + this.f28649f);
            super.lineTo(rectF.right + this.f28648e, rectF.bottom + this.f28649f);
            for (int i12 = size - 1; i12 >= 0; i12--) {
                RectF rectF3 = (RectF) list.get(i12);
                if (rectF3.width() != 0.0f) {
                    float f15 = rectF.right;
                    if (f15 != rectF3.right) {
                        super.lineTo(f15 + this.f28648e, rectF.top);
                        super.lineTo(rectF3.right + this.f28648e, rectF.top);
                    }
                    rectF = rectF3;
                }
            }
            super.lineTo(rectF.right + this.f28648e, rectF.top - this.f28649f);
            super.close();
            if (z10) {
                b(list.subList(size, list.size()));
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT >= 34 && this.f28647c) {
            ArrayList arrayList = f28644g;
            ArrayList arrayList2 = this.f28645a;
            if (arrayList == null) {
                f28644g = new ArrayList(arrayList2.size());
            }
            f28644g.addAll(arrayList2);
            arrayList2.clear();
            this.f28646b = false;
        }
    }

    @Override
    public final void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT >= 34 && this.f28647c) {
            ArrayList arrayList = f28644g;
            ArrayList arrayList2 = this.f28645a;
            if (arrayList == null) {
                f28644g = new ArrayList(arrayList2.size());
            }
            f28644g.addAll(arrayList2);
            arrayList2.clear();
            this.f28646b = false;
        }
    }

    public mr(int i10) {
    }

    @Override
    public void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.f28647c) {
            ArrayList arrayList = this.f28645a;
            if (arrayList.size() <= 0 || !((RectF) hg.c.h(1, arrayList)).contains(f7, f10, f11, f12)) {
                if (arrayList.size() > 0 && Math.abs(f10 - ((RectF) hg.c.h(1, arrayList)).top) <= this.d && Math.abs(f12 - ((RectF) hg.c.h(1, arrayList)).bottom) <= this.d) {
                    ((RectF) hg.c.h(1, arrayList)).union(f7, f10, f11, f12);
                } else {
                    ArrayList arrayList2 = f28644g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF = (RectF) f28644g.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f7, f10, f11, f12);
                    arrayList.add(rectF);
                }
                this.f28646b = false;
                return;
            }
            return;
        }
        int i10 = this.f28648e;
        float f13 = f7 - i10;
        int i11 = this.f28649f;
        super.addRect(f13, f10 - i11, f11 + i10, f12 + i11, direction);
    }
}
