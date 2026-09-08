package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class l4 extends FrameLayout {
    public final k4 f38208a;
    public float f38209b;
    public int f38210c;
    public boolean d;
    public int f38211e;
    public final Matrix f38212f;

    public l4(Context context) {
        super(context);
        this.f38212f = new Matrix();
        this.f38210c = 0;
        this.f38208a = new k4(this, 0);
    }

    public final void a(float f7, int i10) {
        if (this.f38209b != f7) {
            this.f38209b = f7;
            this.f38211e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f38209b;
    }

    public int getResizeMode() {
        return this.f38210c;
    }

    public int getVideoRotation() {
        return this.f38211e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f38209b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f38209b / (f11 / f12)) - 1.0f;
            float abs = Math.abs(f13);
            k4 k4Var = this.f38208a;
            if (abs <= 0.01f) {
                if (!k4Var.f37933b) {
                    k4Var.f37933b = true;
                    ((l4) k4Var.f37934c).post(k4Var);
                    return;
                }
                return;
            }
            int i12 = this.f38210c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f13 > 0.0f) {
                                    f7 = this.f38209b;
                                } else {
                                    f10 = this.f38209b;
                                }
                            }
                        } else if (f13 <= 0.0f) {
                            f10 = this.f38209b;
                        } else {
                            f7 = this.f38209b;
                        }
                    } else {
                        f7 = this.f38209b;
                    }
                    measuredWidth = (int) (f12 * f7);
                } else {
                    f10 = this.f38209b;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > 0.0f) {
                f10 = this.f38209b;
                measuredHeight = (int) (f11 / f10);
            } else {
                f7 = this.f38209b;
                measuredWidth = (int) (f12 * f7);
            }
            if (!k4Var.f37933b) {
                k4Var.f37933b = true;
                ((l4) k4Var.f37934c).post(k4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f38212f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f38211e, width, height);
                    int i14 = this.f38211e;
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
        if (this.f38210c != i10) {
            this.f38210c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(j4 j4Var) {
    }
}
