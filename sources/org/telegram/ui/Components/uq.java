package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
public class uq extends Path {
    public static ArrayList f31666g;
    public int f31670e;
    public int f31671f;
    public boolean f31668b = false;
    public boolean f31669c = true;
    public float d = 0.0f;
    public final ArrayList f31667a = new ArrayList(1);

    public uq() {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 34 && this.f31669c && !this.f31668b) {
            b(this.f31667a);
            this.f31668b = true;
        }
    }

    @Override
    public final void addRect(RectF rectF, Path.Direction direction) {
        RectF rectF2;
        if (Build.VERSION.SDK_INT >= 34 && this.f31669c) {
            ArrayList arrayList = this.f31667a;
            if (arrayList.size() <= 0 || !((RectF) l.d.i(1, arrayList)).contains(rectF)) {
                if (arrayList.size() > 0 && Math.abs(rectF.top - ((RectF) l.d.i(1, arrayList)).top) <= this.d && Math.abs(rectF.bottom - ((RectF) l.d.i(1, arrayList)).bottom) <= this.d) {
                    ((RectF) l.d.i(1, arrayList)).union(rectF);
                } else {
                    ArrayList arrayList2 = f31666g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF2 = (RectF) f31666g.remove(0);
                    } else {
                        rectF2 = new RectF();
                    }
                    rectF2.set(rectF);
                    arrayList.add(rectF2);
                }
                this.f31668b = false;
                return;
            }
            return;
        }
        float f10 = rectF.left;
        int i10 = this.f31670e;
        float f11 = f10 - i10;
        float f12 = rectF.top;
        int i11 = this.f31671f;
        super.addRect(f11, f12 - i11, rectF.right + i10, rectF.bottom + i11, direction);
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            boolean z4 = false;
            if (list.size() == 1) {
                super.addRect(((RectF) list.get(0)).left - this.f31670e, ((RectF) list.get(0)).top - this.f31671f, ((RectF) list.get(0)).right + this.f31670e, ((RectF) list.get(0)).bottom + this.f31671f, Path.Direction.CW);
                return;
            }
            RectF rectF = (RectF) list.get(0);
            int size = list.size() - 1;
            super.moveTo(rectF.left - this.f31670e, rectF.top - this.f31671f);
            for (int i10 = 1; i10 < list.size(); i10++) {
                RectF rectF2 = (RectF) list.get(i10);
                if (rectF2.width() != 0.0f) {
                    float f10 = rectF.bottom;
                    int i11 = this.f31671f;
                    float f11 = f10 + i11;
                    float f12 = rectF2.top;
                    if (f11 >= f12 - i11) {
                        float f13 = rectF.left;
                        if (f13 <= rectF2.right) {
                            float f14 = rectF.right;
                            float f15 = rectF2.left;
                            if (f14 >= f15) {
                                if (f13 != f15) {
                                    super.lineTo(f13 - this.f31670e, f12);
                                    super.lineTo(rectF2.left - this.f31670e, rectF2.top);
                                }
                                rectF = rectF2;
                            }
                        }
                    }
                    size = i10;
                    z4 = true;
                    break;
                }
            }
            super.lineTo(rectF.left - this.f31670e, rectF.bottom + this.f31671f);
            super.lineTo(rectF.right + this.f31670e, rectF.bottom + this.f31671f);
            for (int i12 = size - 1; i12 >= 0; i12--) {
                RectF rectF3 = (RectF) list.get(i12);
                if (rectF3.width() != 0.0f) {
                    float f16 = rectF.right;
                    if (f16 != rectF3.right) {
                        super.lineTo(f16 + this.f31670e, rectF.top);
                        super.lineTo(rectF3.right + this.f31670e, rectF.top);
                    }
                    rectF = rectF3;
                }
            }
            super.lineTo(rectF.right + this.f31670e, rectF.top - this.f31671f);
            super.close();
            if (z4) {
                b(list.subList(size, list.size()));
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT >= 34 && this.f31669c) {
            ArrayList arrayList = f31666g;
            ArrayList arrayList2 = this.f31667a;
            if (arrayList == null) {
                f31666g = new ArrayList(arrayList2.size());
            }
            f31666g.addAll(arrayList2);
            arrayList2.clear();
            this.f31668b = false;
        }
    }

    @Override
    public final void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT >= 34 && this.f31669c) {
            ArrayList arrayList = f31666g;
            ArrayList arrayList2 = this.f31667a;
            if (arrayList == null) {
                f31666g = new ArrayList(arrayList2.size());
            }
            f31666g.addAll(arrayList2);
            arrayList2.clear();
            this.f31668b = false;
        }
    }

    public uq(int i10) {
    }

    @Override
    public void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.f31669c) {
            ArrayList arrayList = this.f31667a;
            if (arrayList.size() <= 0 || !((RectF) l.d.i(1, arrayList)).contains(f10, f11, f12, f13)) {
                if (arrayList.size() > 0 && Math.abs(f11 - ((RectF) l.d.i(1, arrayList)).top) <= this.d && Math.abs(f13 - ((RectF) l.d.i(1, arrayList)).bottom) <= this.d) {
                    ((RectF) l.d.i(1, arrayList)).union(f10, f11, f12, f13);
                } else {
                    ArrayList arrayList2 = f31666g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF = (RectF) f31666g.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f10, f11, f12, f13);
                    arrayList.add(rectF);
                }
                this.f31668b = false;
                return;
            }
            return;
        }
        int i10 = this.f31670e;
        float f14 = f10 - i10;
        int i11 = this.f31671f;
        super.addRect(f14, f11 - i11, f12 + i10, f13 + i11, direction);
    }
}
