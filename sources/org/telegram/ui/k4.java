package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class k4 extends FrameLayout {
    public final j4 f35037a;
    public float f35038b;
    public int f35039c;
    public boolean d;
    public int e;
    public final Matrix f35040f;

    public k4(Context context) {
        super(context);
        this.f35040f = new Matrix();
        this.f35039c = 0;
        this.f35037a = new j4(this, 0);
    }

    public final void a(float f7, int i10) {
        if (this.f35038b != f7) {
            this.f35038b = f7;
            this.e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f35038b;
    }

    public int getResizeMode() {
        return this.f35039c;
    }

    public int getVideoRotation() {
        return this.e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f35038b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f35038b / (f11 / f12)) - 1.0f;
            float abs = Math.abs(f13);
            j4 j4Var = this.f35037a;
            if (abs <= 0.01f) {
                if (!j4Var.f34787b) {
                    j4Var.f34787b = true;
                    ((k4) j4Var.f34788c).post(j4Var);
                    return;
                }
                return;
            }
            int i12 = this.f35039c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f13 > 0.0f) {
                                    f7 = this.f35038b;
                                } else {
                                    f10 = this.f35038b;
                                }
                            }
                        } else if (f13 <= 0.0f) {
                            f10 = this.f35038b;
                        } else {
                            f7 = this.f35038b;
                        }
                    } else {
                        f7 = this.f35038b;
                    }
                    measuredWidth = (int) (f12 * f7);
                } else {
                    f10 = this.f35038b;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > 0.0f) {
                f10 = this.f35038b;
                measuredHeight = (int) (f11 / f10);
            } else {
                f7 = this.f35038b;
                measuredWidth = (int) (f12 * f7);
            }
            if (!j4Var.f34787b) {
                j4Var.f34787b = true;
                ((k4) j4Var.f34788c).post(j4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f35040f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.e, width, height);
                    int i14 = this.e;
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

    public void setResizeMode(int i10) {
        if (this.f35039c != i10) {
            this.f35039c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(i4 i4Var) {
    }
}
