package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
public class CornerPath extends Path {
    private static ArrayList<RectF> recycled;
    private boolean isPathCreated;
    private final ArrayList<RectF> rects;
    private float rectsUnionDiffDelta;
    protected boolean useCornerPathImplementation;

    public CornerPath() {
        this.isPathCreated = false;
        this.useCornerPathImplementation = true;
        this.rectsUnionDiffDelta = 0.0f;
        this.rects = new ArrayList<>(1);
    }

    public CornerPath(int i) {
        this.isPathCreated = false;
        this.useCornerPathImplementation = true;
        this.rectsUnionDiffDelta = 0.0f;
        this.rects = new ArrayList<>(i);
    }

    @Override
    public void addRect(RectF rectF, Path.Direction direction) {
        RectF rectF2;
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            super.addRect(rectF.left, rectF.top, rectF.right, rectF.bottom, direction);
            return;
        }
        if (this.rects.size() > 0) {
            ArrayList<RectF> arrayList = this.rects;
            if (arrayList.get(arrayList.size() - 1).contains(rectF)) {
                return;
            }
        }
        if (this.rects.size() > 0) {
            float f = rectF.top;
            ArrayList<RectF> arrayList2 = this.rects;
            if (Math.abs(f - arrayList2.get(arrayList2.size() - 1).top) <= this.rectsUnionDiffDelta) {
                float f2 = rectF.bottom;
                ArrayList<RectF> arrayList3 = this.rects;
                if (Math.abs(f2 - arrayList3.get(arrayList3.size() - 1).bottom) <= this.rectsUnionDiffDelta) {
                    ArrayList<RectF> arrayList4 = this.rects;
                    arrayList4.get(arrayList4.size() - 1).union(rectF);
                    this.isPathCreated = false;
                }
            }
        }
        ArrayList<RectF> arrayList5 = recycled;
        if (arrayList5 != null && arrayList5.size() > 0) {
            rectF2 = recycled.remove(0);
        } else {
            rectF2 = new RectF();
        }
        rectF2.set(rectF);
        this.rects.add(rectF2);
        this.isPathCreated = false;
    }

    @Override
    public void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation) {
            super.addRect(f, f2, f3, f4, direction);
            return;
        }
        if (this.rects.size() > 0) {
            ArrayList<RectF> arrayList = this.rects;
            if (arrayList.get(arrayList.size() - 1).contains(f, f2, f3, f4)) {
                return;
            }
        }
        if (this.rects.size() > 0) {
            ArrayList<RectF> arrayList2 = this.rects;
            if (Math.abs(f2 - arrayList2.get(arrayList2.size() - 1).top) <= this.rectsUnionDiffDelta) {
                ArrayList<RectF> arrayList3 = this.rects;
                if (Math.abs(f4 - arrayList3.get(arrayList3.size() - 1).bottom) <= this.rectsUnionDiffDelta) {
                    ArrayList<RectF> arrayList4 = this.rects;
                    arrayList4.get(arrayList4.size() - 1).union(f, f2, f3, f4);
                    this.isPathCreated = false;
                }
            }
        }
        ArrayList<RectF> arrayList5 = recycled;
        if (arrayList5 != null && arrayList5.size() > 0) {
            rectF = recycled.remove(0);
        } else {
            rectF = new RectF();
        }
        rectF.set(f, f2, f3, f4);
        this.rects.add(rectF);
        this.isPathCreated = false;
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

    private void resetRects() {
        if (recycled == null) {
            recycled = new ArrayList<>(this.rects.size());
        }
        recycled.addAll(this.rects);
        this.rects.clear();
        this.isPathCreated = false;
    }

    public void closeRects() {
        if (Build.VERSION.SDK_INT < 34 || !this.useCornerPathImplementation || this.isPathCreated) {
            return;
        }
        createClosedPathsFromRects(this.rects);
        this.isPathCreated = true;
    }

    public void setUseCornerPathImplementation(boolean z) {
        this.useCornerPathImplementation = z;
    }

    public void setRectsUnionDiffDelta(float f) {
        this.rectsUnionDiffDelta = f;
    }

    private void createClosedPathsFromRects(List<RectF> list) {
        if (list.isEmpty()) {
            return;
        }
        boolean z = false;
        if (list.size() == 1) {
            super.addRect(list.get(0).left, list.get(0).top, list.get(0).right, list.get(0).bottom, Path.Direction.CW);
            return;
        }
        RectF rectF = list.get(0);
        int size = list.size() - 1;
        super.moveTo(rectF.left, rectF.top);
        for (int i = 1; i < list.size(); i++) {
            RectF rectF2 = list.get(i);
            if (rectF2.width() != 0.0f) {
                float f = rectF.bottom;
                float f2 = rectF2.top;
                if (f >= f2) {
                    float f3 = rectF.left;
                    if (f3 <= rectF2.right) {
                        float f4 = rectF.right;
                        float f5 = rectF2.left;
                        if (f4 >= f5) {
                            if (f3 != f5) {
                                super.lineTo(f3, f2);
                                super.lineTo(rectF2.left, rectF2.top);
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
        super.lineTo(rectF.left, rectF.bottom);
        super.lineTo(rectF.right, rectF.bottom);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            RectF rectF3 = list.get(i2);
            if (rectF3.width() != 0.0f) {
                float f6 = rectF.right;
                if (f6 != rectF3.right) {
                    super.lineTo(f6, rectF.top);
                    super.lineTo(rectF3.right, rectF.top);
                }
                rectF = rectF3;
            }
        }
        super.lineTo(rectF.right, rectF.top);
        super.close();
        if (z) {
            createClosedPathsFromRects(list.subList(size, list.size()));
        }
    }
}
