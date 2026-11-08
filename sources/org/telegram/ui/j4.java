package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class j4 extends FrameLayout {
    public final i4 f46833a;
    public float f46834b;
    public int f46835c;
    public boolean d;
    public int f46836e;
    public final Matrix f46837f;

    public j4(Context context) {
        super(context);
        this.f46837f = new Matrix();
        this.f46835c = 0;
        this.f46833a = new i4(this, 0);
    }

    public final void a(float f10, int i7) {
        if (this.f46834b != f10) {
            this.f46834b = f10;
            this.f46836e = i7;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f46834b;
    }

    public int getResizeMode() {
        return this.f46835c;
    }

    public int getVideoRotation() {
        return this.f46836e;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        super.onMeasure(i7, i10);
        if (this.f46834b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = measuredWidth;
            float f13 = measuredHeight;
            float f14 = (this.f46834b / (f12 / f13)) - 1.0f;
            int i11 = (Math.abs(f14) > 0.01f ? 1 : (Math.abs(f14) == 0.01f ? 0 : -1));
            i4 i4Var = this.f46833a;
            if (i11 <= 0) {
                if (!i4Var.f46565b) {
                    i4Var.f46565b = true;
                    ((j4) i4Var.f46566c).post(i4Var);
                    return;
                }
                return;
            }
            int i12 = this.f46835c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f14 > 0.0f) {
                                    f10 = this.f46834b;
                                } else {
                                    f11 = this.f46834b;
                                }
                            }
                        } else if (f14 <= 0.0f) {
                            f11 = this.f46834b;
                        } else {
                            f10 = this.f46834b;
                        }
                    } else {
                        f10 = this.f46834b;
                    }
                    measuredWidth = (int) (f13 * f10);
                } else {
                    f11 = this.f46834b;
                }
                measuredHeight = (int) (f12 / f11);
            } else if (f14 > 0.0f) {
                f11 = this.f46834b;
                measuredHeight = (int) (f12 / f11);
            } else {
                f10 = this.f46834b;
                measuredWidth = (int) (f13 * f10);
            }
            if (!i4Var.f46565b) {
                i4Var.f46565b = true;
                ((j4) i4Var.f46566c).post(i4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f46837f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f46836e, width, height);
                    int i14 = this.f46836e;
                    if (i14 == 90 || i14 == 270) {
                        float height2 = getHeight() / getWidth();
                        matrix.postScale(1.0f / height2, height2, width, height);
                    }
                    ((TextureView) childAt).setTransform(matrix);
                    return;
                }
            }
        }
    }

    public void setDrawingReady(boolean z9) {
        if (this.d == z9) {
            return;
        }
        this.d = z9;
    }

    public void setResizeMode(int i7) {
        if (this.f46835c != i7) {
            this.f46835c = i7;
            requestLayout();
        }
    }

    public void setAspectRatioListener(h4 h4Var) {
    }
}
