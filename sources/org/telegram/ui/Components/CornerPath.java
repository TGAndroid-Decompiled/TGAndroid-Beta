package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import java.util.List;

public class CornerPath extends Path {
    public static ArrayList recycled;
    public int paddingX;
    public int paddingY;
    public boolean isPathCreated = false;
    public boolean useCornerPathImplementation = true;
    public float rectsUnionDiffDelta = 0.0f;
    public final ArrayList rects = new ArrayList(1);

    public CornerPath() {
    }

    @Override
    public final void addRect(RectF rectF, Path.Direction direction) {
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            float f = rectF.left;
            float f2 = this.paddingX;
            float f3 = f - f2;
            float f4 = rectF.top;
            float f5 = this.paddingY;
            super.addRect(f3, f4 - f5, rectF.right + f2, rectF.bottom + f5, direction);
            return;
        }
        ArrayList arrayList = this.rects;
        if (arrayList.size() <= 0 || !((RectF) zziq.m(1, arrayList)).contains(rectF)) {
            if (arrayList.size() <= 0 || Math.abs(rectF.top - ((RectF) zziq.m(1, arrayList)).top) > this.rectsUnionDiffDelta || Math.abs(rectF.bottom - ((RectF) zziq.m(1, arrayList)).bottom) > this.rectsUnionDiffDelta) {
                ArrayList arrayList2 = recycled;
                RectF rectF2 = (arrayList2 == null || arrayList2.size() <= 0) ? new RectF() : (RectF) recycled.remove(0);
                rectF2.set(rectF);
                arrayList.add(rectF2);
            } else {
                ((RectF) zziq.m(1, arrayList)).union(rectF);
            }
            this.isPathCreated = false;
        }
    }

    public final void closeRects() {
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation || this.isPathCreated) {
            return;
        }
        createClosedPathsFromRects(this.rects);
        this.isPathCreated = true;
    }

    public final void createClosedPathsFromRects(List list) {
        if (list.isEmpty()) {
            return;
        }
        boolean z = false;
        if (list.size() == 1) {
            super.addRect(((RectF) list.get(0)).left - this.paddingX, ((RectF) list.get(0)).top - this.paddingY, ((RectF) list.get(0)).right + this.paddingX, ((RectF) list.get(0)).bottom + this.paddingY, Path.Direction.CW);
            return;
        }
        RectF rectF = (RectF) list.get(0);
        int size = list.size() - 1;
        super.moveTo(rectF.left - this.paddingX, rectF.top - this.paddingY);
        for (int i = 1; i < list.size(); i++) {
            RectF rectF2 = (RectF) list.get(i);
            if (rectF2.width() != 0.0f) {
                float f = rectF.bottom;
                float f2 = this.paddingY;
                float f3 = f + f2;
                float f4 = rectF2.top;
                if (f3 >= f4 - f2) {
                    float f5 = rectF.left;
                    if (f5 <= rectF2.right) {
                        float f6 = rectF.right;
                        float f7 = rectF2.left;
                        if (f6 >= f7) {
                            if (f5 != f7) {
                                super.lineTo(f5 - this.paddingX, f4);
                                super.lineTo(rectF2.left - this.paddingX, rectF2.top);
                            }
                            rectF = rectF2;
                        }
                    }
                }
                size = i;
                z = true;
                break;
            }
        }
        super.lineTo(rectF.left - this.paddingX, rectF.bottom + this.paddingY);
        super.lineTo(rectF.right + this.paddingX, rectF.bottom + this.paddingY);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            RectF rectF3 = (RectF) list.get(i2);
            if (rectF3.width() != 0.0f) {
                float f8 = rectF.right;
                if (f8 != rectF3.right) {
                    super.lineTo(f8 + this.paddingX, rectF.top);
                    super.lineTo(rectF3.right + this.paddingX, rectF.top);
                }
                rectF = rectF3;
            }
        }
        super.lineTo(rectF.right + this.paddingX, rectF.top - this.paddingY);
        super.close();
        if (z) {
            createClosedPathsFromRects(list.subList(size, list.size()));
        }
    }

    @Override
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            return;
        }
        ArrayList arrayList = recycled;
        ArrayList arrayList2 = this.rects;
        if (arrayList == null) {
            recycled = new ArrayList(arrayList2.size());
        }
        recycled.addAll(arrayList2);
        arrayList2.clear();
        this.isPathCreated = false;
    }

    @Override
    public final void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            return;
        }
        ArrayList arrayList = recycled;
        ArrayList arrayList2 = this.rects;
        if (arrayList == null) {
            recycled = new ArrayList(arrayList2.size());
        }
        recycled.addAll(arrayList2);
        arrayList2.clear();
        this.isPathCreated = false;
    }

    public CornerPath(int i) {
    }

    @Override
    public void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.useCornerPathImplementation) {
            ArrayList arrayList = this.rects;
            if (arrayList.size() <= 0 || !((RectF) zziq.m(1, arrayList)).contains(f, f2, f3, f4)) {
                if (arrayList.size() > 0 && Math.abs(f2 - ((RectF) zziq.m(1, arrayList)).top) <= this.rectsUnionDiffDelta && Math.abs(f4 - ((RectF) zziq.m(1, arrayList)).bottom) <= this.rectsUnionDiffDelta) {
                    ((RectF) zziq.m(1, arrayList)).union(f, f2, f3, f4);
                } else {
                    ArrayList arrayList2 = recycled;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF = (RectF) recycled.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f, f2, f3, f4);
                    arrayList.add(rectF);
                }
                this.isPathCreated = false;
                return;
            }
            return;
        }
        float f5 = this.paddingX;
        float f6 = f - f5;
        float f7 = this.paddingY;
        super.addRect(f6, f2 - f7, f3 + f5, f4 + f7, direction);
    }
}
