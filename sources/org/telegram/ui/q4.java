package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class q4 extends FrameLayout {
    public final p4 f37294a;
    public float f37295b;
    public int f37296c;
    public boolean d;
    public int e;
    public final Matrix f37297f;

    public q4(Context context) {
        super(context);
        this.f37297f = new Matrix();
        this.f37296c = 0;
        this.f37294a = new p4(this, 0);
    }

    public final void a(float f10, int i10) {
        if (this.f37295b != f10) {
            this.f37295b = f10;
            this.e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f37295b;
    }

    public int getResizeMode() {
        return this.f37296c;
    }

    public int getVideoRotation() {
        return this.e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f37295b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = measuredWidth;
            float f13 = measuredHeight;
            float f14 = (this.f37295b / (f12 / f13)) - 1.0f;
            float abs = Math.abs(f14);
            p4 p4Var = this.f37294a;
            if (abs <= 0.01f) {
                if (!p4Var.f36937b) {
                    p4Var.f36937b = true;
                    ((q4) p4Var.f36938c).post(p4Var);
                    return;
                }
                return;
            }
            int i12 = this.f37296c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f14 > 0.0f) {
                                    f10 = this.f37295b;
                                } else {
                                    f11 = this.f37295b;
                                }
                            }
                        } else if (f14 <= 0.0f) {
                            f11 = this.f37295b;
                        } else {
                            f10 = this.f37295b;
                        }
                    } else {
                        f10 = this.f37295b;
                    }
                    measuredWidth = (int) (f13 * f10);
                } else {
                    f11 = this.f37295b;
                }
                measuredHeight = (int) (f12 / f11);
            } else if (f14 > 0.0f) {
                f11 = this.f37295b;
                measuredHeight = (int) (f12 / f11);
            } else {
                f10 = this.f37295b;
                measuredWidth = (int) (f13 * f10);
            }
            if (!p4Var.f36937b) {
                p4Var.f36937b = true;
                ((q4) p4Var.f36938c).post(p4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f37297f;
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
        if (this.f37296c != i10) {
            this.f37296c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(o4 o4Var) {
    }
}
