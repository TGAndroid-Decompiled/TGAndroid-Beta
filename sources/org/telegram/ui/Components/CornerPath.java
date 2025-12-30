package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

public class CornerPath extends Path {
    private static ArrayList recycled;
    private boolean isPathCreated;
    private int paddingX;
    private int paddingY;
    private final ArrayList rects;
    private float rectsUnionDiffDelta;
    protected boolean useCornerPathImplementation;

    public CornerPath() {
        this.isPathCreated = false;
        this.useCornerPathImplementation = true;
        this.rectsUnionDiffDelta = 0.0f;
        this.rects = new ArrayList(1);
    }

    public CornerPath(int i) {
        this.isPathCreated = false;
        this.useCornerPathImplementation = true;
        this.rectsUnionDiffDelta = 0.0f;
        this.rects = new ArrayList(i);
    }

    public void setPadding(int i, int i2) {
        this.paddingX = i;
        this.paddingY = i2;
    }

    @Override
    public void addRect(android.graphics.RectF r9, android.graphics.Path.Direction r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CornerPath.addRect(android.graphics.RectF, android.graphics.Path$Direction):void");
    }

    @Override
    public void addRect(float r8, float r9, float r10, float r11, android.graphics.Path.Direction r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CornerPath.addRect(float, float, float, float, android.graphics.Path$Direction):void");
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
            recycled = new ArrayList(this.rects.size());
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

    private void createClosedPathsFromRects(List list) {
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
}
