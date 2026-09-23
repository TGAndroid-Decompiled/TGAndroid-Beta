package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.nq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ss0;
import org.telegram.ui.zg1;
public final class k0 extends ImageView {
    public final int f19320a;
    public final Object f19321b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f19320a = i10;
        this.f19321b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19320a) {
            case 0:
                getBackground().draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f19320a) {
            case 0:
                v0 v0Var = (v0) this.f19321b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f19582s.setVisibility(4);
                    v0Var.f19582s.setAlpha(0.0f);
                    v0Var.f19582s.setRotation(45.0f);
                    v0Var.f19582s.setScaleX(0.0f);
                    v0Var.f19582s.setScaleY(0.0f);
                    return;
                }
                v0Var.f19582s.setAlpha(1.0f);
                v0Var.f19582s.setRotation(0.0f);
                v0Var.f19582s.setScaleX(1.0f);
                v0Var.f19582s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19320a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((zg1) this.f19321b).f40141n.getTransformationMethod() != null) {
                    z10 = false;
                }
                accessibilityNodeInfo.setChecked(z10);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f19320a) {
            case 1:
                super.setAlpha(f7);
                ((nq) this.f19321b).f26490x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19320a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19321b;
                ArrayList arrayList = photoViewer.f30935h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.e4) obj).setTranslationY(f7);
                    }
                }
                ss0 ss0Var = photoViewer.f30926g1;
                if (ss0Var != null) {
                    ss0Var.setTranslationY(f7);
                }
                f90 f90Var = photoViewer.f30918f1;
                if (f90Var != null) {
                    f90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
