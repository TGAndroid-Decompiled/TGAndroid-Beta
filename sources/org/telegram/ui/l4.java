package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class l4 extends FrameLayout {
    public final k4 f47096a;
    public float f47097b;
    public int f47098c;
    public boolean d;
    public int f47099e;
    public final Matrix f47100f;

    public l4(Context context) {
        super(context);
        this.f47100f = new Matrix();
        this.f47098c = 0;
        this.f47096a = new k4(this, 0);
    }

    public final void a(float f10, int i3) {
        if (this.f47097b != f10) {
            this.f47097b = f10;
            this.f47099e = i3;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f47097b;
    }

    public int getResizeMode() {
        return this.f47098c;
    }

    public int getVideoRotation() {
        return this.f47099e;
    }

    @Override
    public void onMeasure(int i3, int i10) {
        float f10;
        float f11;
        super.onMeasure(i3, i10);
        if (this.f47097b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = measuredWidth;
            float f13 = measuredHeight;
            float f14 = (this.f47097b / (f12 / f13)) - 1.0f;
            int i11 = (Math.abs(f14) > 0.01f ? 1 : (Math.abs(f14) == 0.01f ? 0 : -1));
            k4 k4Var = this.f47096a;
            if (i11 <= 0) {
                if (!k4Var.f46761b) {
                    k4Var.f46761b = true;
                    ((l4) k4Var.f46762c).post(k4Var);
                    return;
                }
                return;
            }
            int i12 = this.f47098c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f14 > 0.0f) {
                                    f10 = this.f47097b;
                                } else {
                                    f11 = this.f47097b;
                                }
                            }
                        } else if (f14 <= 0.0f) {
                            f11 = this.f47097b;
                        } else {
                            f10 = this.f47097b;
                        }
                    } else {
                        f10 = this.f47097b;
                    }
                    measuredWidth = (int) (f13 * f10);
                } else {
                    f11 = this.f47097b;
                }
                measuredHeight = (int) (f12 / f11);
            } else if (f14 > 0.0f) {
                f11 = this.f47097b;
                measuredHeight = (int) (f12 / f11);
            } else {
                f10 = this.f47097b;
                measuredWidth = (int) (f13 * f10);
            }
            if (!k4Var.f46761b) {
                k4Var.f46761b = true;
                ((l4) k4Var.f46762c).post(k4Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f47100f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f47099e, width, height);
                    int i14 = this.f47099e;
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

    public void setResizeMode(int i3) {
        if (this.f47098c != i3) {
            this.f47098c = i3;
            requestLayout();
        }
    }

    public void setAspectRatioListener(j4 j4Var) {
    }
}
