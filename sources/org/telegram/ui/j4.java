package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class j4 extends FrameLayout {
    public final i4 f48897a;
    public float f48898b;
    public int f48899c;
    public boolean d;
    public int f48900e;
    public final Matrix f48901f;

    public j4(Context context) {
        super(context);
        this.f48901f = new Matrix();
        this.f48899c = 0;
        this.f48897a = new i4(this, 0);
    }

    public final void a(float f10, int i7) {
        if (this.f48898b != f10) {
            this.f48898b = f10;
            this.f48900e = i7;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f48898b;
    }

    public int getResizeMode() {
        return this.f48899c;
    }

    public int getVideoRotation() {
        return this.f48900e;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        super.onMeasure(i7, i10);
        if (this.f48898b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = measuredWidth;
            float f13 = measuredHeight;
            float f14 = (this.f48898b / (f12 / f13)) - 1.0f;
            int i11 = (Math.abs(f14) > 0.01f ? 1 : (Math.abs(f14) == 0.01f ? 0 : -1));
            i4 i4Var = this.f48897a;
            if (i11 <= 0) {
                if (!i4Var.f48542b) {
                    i4Var.f48542b = true;
                    ((j4) i4Var.f48543c).post(i4Var);
                    return;
                }
                return;
            }
            int i12 = this.f48899c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f14 > 0.0f) {
                                    f10 = this.f48898b;
                                } else {
                                    f11 = this.f48898b;
                                }
                            }
                        } else if (f14 <= 0.0f) {
                            f11 = this.f48898b;
                        } else {
                            f10 = this.f48898b;
                        }
                    } else {
                        f10 = this.f48898b;
                    }
                    measuredWidth = (int) (f13 * f10);
                } else {
                    f11 = this.f48898b;
                }
                measuredHeight = (int) (f12 / f11);
            } else if (f14 > 0.0f) {
                f11 = this.f48898b;
                measuredHeight = (int) (f12 / f11);
            } else {
                f10 = this.f48898b;
                measuredWidth = (int) (f13 * f10);
            }
            if (!i4Var.f48542b) {
                i4Var.f48542b = true;
                ((j4) i4Var.f48543c).post(i4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f48901f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f48900e, width, height);
                    int i14 = this.f48900e;
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

    public void setDrawingReady(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
    }

    public void setResizeMode(int i7) {
        if (this.f48899c != i7) {
            this.f48899c = i7;
            requestLayout();
        }
    }

    public void setAspectRatioListener(h4 h4Var) {
    }
}
