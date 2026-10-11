package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class k4 extends FrameLayout {
    public final j4 f39220a;
    public float f39221b;
    public int f39222c;
    public boolean d;
    public int f39223e;
    public final Matrix f39224f;

    public k4(Context context) {
        super(context);
        this.f39224f = new Matrix();
        this.f39222c = 0;
        this.f39220a = new j4(this, 0);
    }

    public final void a(float f7, int i10) {
        if (this.f39221b != f7) {
            this.f39221b = f7;
            this.f39223e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f39221b;
    }

    public int getResizeMode() {
        return this.f39222c;
    }

    public int getVideoRotation() {
        return this.f39223e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f39221b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f39221b / (f11 / f12)) - 1.0f;
            int i12 = (Math.abs(f13) > 0.01f ? 1 : (Math.abs(f13) == 0.01f ? 0 : -1));
            j4 j4Var = this.f39220a;
            if (i12 <= 0) {
                if (!j4Var.f38865b) {
                    j4Var.f38865b = true;
                    ((k4) j4Var.f38866c).post(j4Var);
                    return;
                }
                return;
            }
            int i13 = this.f39222c;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                if (f13 > 0.0f) {
                                    f7 = this.f39221b;
                                } else {
                                    f10 = this.f39221b;
                                }
                            }
                        } else if (f13 <= 0.0f) {
                            f10 = this.f39221b;
                        } else {
                            f7 = this.f39221b;
                        }
                    } else {
                        f7 = this.f39221b;
                    }
                    measuredWidth = (int) (f12 * f7);
                } else {
                    f10 = this.f39221b;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > 0.0f) {
                f10 = this.f39221b;
                measuredHeight = (int) (f11 / f10);
            } else {
                f7 = this.f39221b;
                measuredWidth = (int) (f12 * f7);
            }
            if (!j4Var.f38865b) {
                j4Var.f38865b = true;
                ((k4) j4Var.f38866c).post(j4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f39224f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f39223e, width, height);
                    int i15 = this.f39223e;
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
        if (this.f39222c != i10) {
            this.f39222c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(i4 i4Var) {
    }
}
