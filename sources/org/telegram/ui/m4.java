package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class m4 extends FrameLayout {
    public final l4 f41452a;
    public float f41453b;
    public int f41454c;
    public boolean d;
    public int e;
    public final Matrix f41455f;

    public m4(Context context) {
        super(context);
        this.f41455f = new Matrix();
        this.f41454c = 0;
        this.f41452a = new l4(this, 0);
    }

    public final void a(float f7, int i10) {
        if (this.f41453b != f7) {
            this.f41453b = f7;
            this.e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f41453b;
    }

    public int getResizeMode() {
        return this.f41454c;
    }

    public int getVideoRotation() {
        return this.e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f41453b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f41453b / (f11 / f12)) - 1.0f;
            int i12 = (Math.abs(f13) > 0.01f ? 1 : (Math.abs(f13) == 0.01f ? 0 : -1));
            l4 l4Var = this.f41452a;
            if (i12 <= 0) {
                if (!l4Var.f41132b) {
                    l4Var.f41132b = true;
                    ((m4) l4Var.f41133c).post(l4Var);
                    return;
                }
                return;
            }
            int i13 = this.f41454c;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                if (f13 > 0.0f) {
                                    f7 = this.f41453b;
                                } else {
                                    f10 = this.f41453b;
                                }
                            }
                        } else if (f13 <= 0.0f) {
                            f10 = this.f41453b;
                        } else {
                            f7 = this.f41453b;
                        }
                    } else {
                        f7 = this.f41453b;
                    }
                    measuredWidth = (int) (f12 * f7);
                } else {
                    f10 = this.f41453b;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > 0.0f) {
                f10 = this.f41453b;
                measuredHeight = (int) (f11 / f10);
            } else {
                f7 = this.f41453b;
                measuredWidth = (int) (f12 * f7);
            }
            if (!l4Var.f41132b) {
                l4Var.f41132b = true;
                ((m4) l4Var.f41133c).post(l4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f41455f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.e, width, height);
                    int i15 = this.e;
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
        if (this.f41454c != i10) {
            this.f41454c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(k4 k4Var) {
    }
}
