package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
import java.util.List;

public class CornerPath extends Path {
    private static ArrayList<RectF> recycled;
    private boolean isPathCreated;
    private int paddingX;
    private int paddingY;
    private final ArrayList<RectF> rects;
    private float rectsUnionDiffDelta;
    protected boolean useCornerPathImplementation;

    public CornerPath() {
        this.isPathCreated = false;
        this.useCornerPathImplementation = true;
        this.rectsUnionDiffDelta = 0.0f;
        this.rects = new ArrayList<>(1);
    }

    private void createClosedPathsFromRects(List<RectF> list) {
        if (list.isEmpty()) {
            return;
        }
        boolean z = false;
        if (list.size() == 1) {
            super.addRect(list.get(0).left - this.paddingX, list.get(0).top - this.paddingY, list.get(0).right + this.paddingX, list.get(0).bottom + this.paddingY, Path.Direction.CW);
            return;
        }
        RectF rectF = list.get(0);
        int size = list.size() - 1;
        super.moveTo(rectF.left - this.paddingX, rectF.top - this.paddingY);
        for (int i = 1; i < list.size(); i++) {
            RectF rectF2 = list.get(i);
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
            RectF rectF3 = list.get(i2);
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

    private void resetRects() {
        if (recycled == null) {
            recycled = new ArrayList<>(this.rects.size());
        }
        recycled.addAll(this.rects);
        this.rects.clear();
        this.isPathCreated = false;
    }

    @Override
    public void addRect(RectF rectF, Path.Direction direction) {
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            float f = rectF.left;
            float f2 = this.paddingX;
            float f3 = f - f2;
            float f4 = rectF.top;
            float f5 = this.paddingY;
            super.addRect(f3, f4 - f5, rectF.right + f2, rectF.bottom + f5, direction);
            return;
        }
        if (this.rects.size() <= 0 || !((RectF) zzin.m(1, this.rects)).contains(rectF)) {
            if (this.rects.size() <= 0 || Math.abs(rectF.top - ((RectF) zzin.m(1, this.rects)).top) > this.rectsUnionDiffDelta || Math.abs(rectF.bottom - ((RectF) zzin.m(1, this.rects)).bottom) > this.rectsUnionDiffDelta) {
                ArrayList<RectF> arrayList = recycled;
                RectF rectF2 = (arrayList == null || arrayList.size() <= 0) ? new RectF() : recycled.remove(0);
                rectF2.set(rectF);
                this.rects.add(rectF2);
            } else {
                ((RectF) zzin.m(1, this.rects)).union(rectF);
            }
            this.isPathCreated = false;
        }
    }

    public void closeRects() {
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation || this.isPathCreated) {
            return;
        }
        createClosedPathsFromRects(this.rects);
        this.isPathCreated = true;
    }

    @Override
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            return;
        }
        resetRects();
    }

    @Override
    public void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            return;
        }
        resetRects();
    }

    public void setPadding(int i, int i2) {
        this.paddingX = i;
        this.paddingY = i2;
    }

    public void setRectsUnionDiffDelta(float f) {
        this.rectsUnionDiffDelta = f;
    }

    public void setUseCornerPathImplementation(boolean z) {
        this.useCornerPathImplementation = z;
    }

    public CornerPath(int i) {
        this.isPathCreated = false;
        this.useCornerPathImplementation = true;
        this.rectsUnionDiffDelta = 0.0f;
        this.rects = new ArrayList<>(i);
    }

    @Override
    public void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.useCornerPathImplementation) {
            if (this.rects.size() <= 0 || !((RectF) zzin.m(1, this.rects)).contains(f, f2, f3, f4)) {
                if (this.rects.size() > 0 && Math.abs(f2 - ((RectF) zzin.m(1, this.rects)).top) <= this.rectsUnionDiffDelta && Math.abs(f4 - ((RectF) zzin.m(1, this.rects)).bottom) <= this.rectsUnionDiffDelta) {
                    ((RectF) zzin.m(1, this.rects)).union(f, f2, f3, f4);
                } else {
                    ArrayList<RectF> arrayList = recycled;
                    if (arrayList != null && arrayList.size() > 0) {
                        rectF = recycled.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f, f2, f3, f4);
                    this.rects.add(rectF);
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
