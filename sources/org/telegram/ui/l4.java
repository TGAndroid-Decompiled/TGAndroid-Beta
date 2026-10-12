package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class l4 extends FrameLayout {
    public final k4 f39628a;
    public float f39629b;
    public int f39630c;
    public boolean d;
    public int f39631e;
    public final Matrix f39632f;

    public l4(Context context) {
        super(context);
        this.f39632f = new Matrix();
        this.f39630c = 0;
        this.f39628a = new k4(this, 0);
    }

    public final void a(float f7, int i10) {
        if (this.f39629b != f7) {
            this.f39629b = f7;
            this.f39631e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f39629b;
    }

    public int getResizeMode() {
        return this.f39630c;
    }

    public int getVideoRotation() {
        return this.f39631e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f39629b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f39629b / (f11 / f12)) - 1.0f;
            int i12 = (Math.abs(f13) > 0.01f ? 1 : (Math.abs(f13) == 0.01f ? 0 : -1));
            k4 k4Var = this.f39628a;
            if (i12 <= 0) {
                if (!k4Var.f39357b) {
                    k4Var.f39357b = true;
                    ((l4) k4Var.f39358c).post(k4Var);
                    return;
                }
                return;
            }
            int i13 = this.f39630c;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                if (f13 > 0.0f) {
                                    f7 = this.f39629b;
                                } else {
                                    f10 = this.f39629b;
                                }
                            }
                        } else if (f13 <= 0.0f) {
                            f10 = this.f39629b;
                        } else {
                            f7 = this.f39629b;
                        }
                    } else {
                        f7 = this.f39629b;
                    }
                    measuredWidth = (int) (f12 * f7);
                } else {
                    f10 = this.f39629b;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > 0.0f) {
                f10 = this.f39629b;
                measuredHeight = (int) (f11 / f10);
            } else {
                f7 = this.f39629b;
                measuredWidth = (int) (f12 * f7);
            }
            if (!k4Var.f39357b) {
                k4Var.f39357b = true;
                ((l4) k4Var.f39358c).post(k4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f39632f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f39631e, width, height);
                    int i15 = this.f39631e;
                    if (i15 == 90 || i15 == 270) {
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

    public void setResizeMode(int i10) {
        if (this.f39630c != i10) {
            this.f39630c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(j4 j4Var) {
    }
}
