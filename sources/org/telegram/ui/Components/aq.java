package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
public class aq extends Path {
    public static ArrayList f31887g;
    public int f31891e;
    public int f31892f;
    public boolean f31889b = false;
    public boolean f31890c = true;
    public float d = 0.0f;
    public final ArrayList f31888a = new ArrayList(1);

    public aq() {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 34 && this.f31890c && !this.f31889b) {
            b(this.f31888a);
            this.f31889b = true;
        }
    }

    @Override
    public final void addRect(RectF rectF, Path.Direction direction) {
        RectF rectF2;
        if (Build.VERSION.SDK_INT >= 34 && this.f31890c) {
            ArrayList arrayList = this.f31888a;
            if (arrayList.size() <= 0 || !((RectF) jg.g.i(1, arrayList)).contains(rectF)) {
                if (arrayList.size() > 0 && Math.abs(rectF.top - ((RectF) jg.g.i(1, arrayList)).top) <= this.d && Math.abs(rectF.bottom - ((RectF) jg.g.i(1, arrayList)).bottom) <= this.d) {
                    ((RectF) jg.g.i(1, arrayList)).union(rectF);
                } else {
                    ArrayList arrayList2 = f31887g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF2 = (RectF) f31887g.remove(0);
                    } else {
                        rectF2 = new RectF();
                    }
                    rectF2.set(rectF);
                    arrayList.add(rectF2);
                }
                this.f31889b = false;
                return;
            }
            return;
        }
        float f10 = rectF.left;
        int i7 = this.f31891e;
        float f11 = f10 - i7;
        float f12 = rectF.top;
        int i10 = this.f31892f;
        super.addRect(f11, f12 - i10, rectF.right + i7, rectF.bottom + i10, direction);
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            boolean z9 = false;
            if (list.size() == 1) {
                super.addRect(((RectF) list.get(0)).left - this.f31891e, ((RectF) list.get(0)).top - this.f31892f, ((RectF) list.get(0)).right + this.f31891e, ((RectF) list.get(0)).bottom + this.f31892f, Path.Direction.CW);
                return;
            }
            RectF rectF = (RectF) list.get(0);
            int size = list.size() - 1;
            super.moveTo(rectF.left - this.f31891e, rectF.top - this.f31892f);
            for (int i7 = 1; i7 < list.size(); i7++) {
                RectF rectF2 = (RectF) list.get(i7);
                if (rectF2.width() != 0.0f) {
                    float f10 = rectF.bottom;
                    int i10 = this.f31892f;
                    float f11 = f10 + i10;
                    float f12 = rectF2.top;
                    if (f11 >= f12 - i10) {
                        float f13 = rectF.left;
                        if (f13 <= rectF2.right) {
                            float f14 = rectF.right;
                            float f15 = rectF2.left;
                            if (f14 >= f15) {
                                if (f13 != f15) {
                                    super.lineTo(f13 - this.f31891e, f12);
                                    super.lineTo(rectF2.left - this.f31891e, rectF2.top);
                                }
                                rectF = rectF2;
                            }
                        }
                    }
                    z9 = true;
                    size = i7;
                    break;
                }
            }
            super.lineTo(rectF.left - this.f31891e, rectF.bottom + this.f31892f);
            super.lineTo(rectF.right + this.f31891e, rectF.bottom + this.f31892f);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                RectF rectF3 = (RectF) list.get(i11);
                if (rectF3.width() != 0.0f) {
                    float f16 = rectF.right;
                    if (f16 != rectF3.right) {
                        super.lineTo(f16 + this.f31891e, rectF.top);
                        super.lineTo(rectF3.right + this.f31891e, rectF.top);
                    }
                    rectF = rectF3;
                }
            }
            super.lineTo(rectF.right + this.f31891e, rectF.top - this.f31892f);
            super.close();
            if (z9) {
                b(list.subList(size, list.size()));
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT >= 34 && this.f31890c) {
            ArrayList arrayList = f31887g;
            ArrayList arrayList2 = this.f31888a;
            if (arrayList == null) {
                f31887g = new ArrayList(arrayList2.size());
            }
            f31887g.addAll(arrayList2);
            arrayList2.clear();
            this.f31889b = false;
        }
    }

    @Override
    public final void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT >= 34 && this.f31890c) {
            ArrayList arrayList = f31887g;
            ArrayList arrayList2 = this.f31888a;
            if (arrayList == null) {
                f31887g = new ArrayList(arrayList2.size());
            }
            f31887g.addAll(arrayList2);
            arrayList2.clear();
            this.f31889b = false;
        }
    }

    public aq(int i7) {
    }

    @Override
    public void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.f31890c) {
            ArrayList arrayList = this.f31888a;
            if (arrayList.size() <= 0 || !((RectF) jg.g.i(1, arrayList)).contains(f10, f11, f12, f13)) {
                if (arrayList.size() > 0 && Math.abs(f11 - ((RectF) jg.g.i(1, arrayList)).top) <= this.d && Math.abs(f13 - ((RectF) jg.g.i(1, arrayList)).bottom) <= this.d) {
                    ((RectF) jg.g.i(1, arrayList)).union(f10, f11, f12, f13);
                } else {
                    ArrayList arrayList2 = f31887g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF = (RectF) f31887g.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f10, f11, f12, f13);
                    arrayList.add(rectF);
                }
                this.f31889b = false;
                return;
            }
            return;
        }
        int i7 = this.f31891e;
        float f14 = f10 - i7;
        int i10 = this.f31892f;
        super.addRect(f14, f11 - i10, f12 + i7, f13 + i10, direction);
    }
}
