package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class o4 extends FrameLayout {
    public final n4 f36785a;
    public float f36786b;
    public int f36787c;
    public boolean d;
    public int e;
    public final Matrix f36788f;

    public o4(Context context) {
        super(context);
        this.f36788f = new Matrix();
        this.f36787c = 0;
        this.f36785a = new n4(this, 0);
    }

    public final void a(float f10, int i10) {
        if (this.f36786b != f10) {
            this.f36786b = f10;
            this.e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f36786b;
    }

    public int getResizeMode() {
        return this.f36787c;
    }

    public int getVideoRotation() {
        return this.e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f36786b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = measuredWidth;
            float f13 = measuredHeight;
            float f14 = (this.f36786b / (f12 / f13)) - 1.0f;
            float abs = Math.abs(f14);
            n4 n4Var = this.f36785a;
            if (abs <= 0.01f) {
                if (!n4Var.f36445b) {
                    n4Var.f36445b = true;
                    ((o4) n4Var.f36446c).post(n4Var);
                    return;
                }
                return;
            }
            int i12 = this.f36787c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f14 > 0.0f) {
                                    f10 = this.f36786b;
                                } else {
                                    f11 = this.f36786b;
                                }
                            }
                        } else if (f14 <= 0.0f) {
                            f11 = this.f36786b;
                        } else {
                            f10 = this.f36786b;
                        }
                    } else {
                        f10 = this.f36786b;
                    }
                    measuredWidth = (int) (f13 * f10);
                } else {
                    f11 = this.f36786b;
                }
                measuredHeight = (int) (f12 / f11);
            } else if (f14 > 0.0f) {
                f11 = this.f36786b;
                measuredHeight = (int) (f12 / f11);
            } else {
                f10 = this.f36786b;
                measuredWidth = (int) (f13 * f10);
            }
            if (!n4Var.f36445b) {
                n4Var.f36445b = true;
                ((o4) n4Var.f36446c).post(n4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f36788f;
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

    public void setDrawingReady(boolean z4) {
        if (this.d == z4) {
            return;
        }
        this.d = z4;
    }

    public void setResizeMode(int i10) {
        if (this.f36787c != i10) {
            this.f36787c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(m4 m4Var) {
    }
}
