package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.gq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cg1;
import org.telegram.ui.vr0;
public final class m0 extends ImageView {
    public final int f23671a;
    public final Object f23672b;

    public m0(Object obj, Context context, int i10) {
        super(context);
        this.f23671a = i10;
        this.f23672b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f23671a) {
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
        switch (this.f23671a) {
            case 0:
                w0 w0Var = (w0) this.f23672b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f23936s.setVisibility(4);
                    w0Var.f23936s.setAlpha(0.0f);
                    w0Var.f23936s.setRotation(45.0f);
                    w0Var.f23936s.setScaleX(0.0f);
                    w0Var.f23936s.setScaleY(0.0f);
                    return;
                }
                w0Var.f23936s.setAlpha(1.0f);
                w0Var.f23936s.setRotation(0.0f);
                w0Var.f23936s.setScaleX(1.0f);
                w0Var.f23936s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f23671a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((cg1) this.f23672b).f37115n.getTransformationMethod() != null) {
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
    public void setAlpha(float f9) {
        switch (this.f23671a) {
            case 1:
                super.setAlpha(f9);
                ((gq) this.f23672b).f28955x.invalidate();
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f23671a) {
            case 2:
                super.setTranslationY(f9);
                PhotoViewer photoViewer = (PhotoViewer) this.f23672b;
                ArrayList arrayList = photoViewer.f35674d1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((nh.t3) obj).setTranslationY(f9);
                    }
                }
                vr0 vr0Var = photoViewer.f35667c1;
                if (vr0Var != null) {
                    vr0Var.setTranslationY(f9);
                }
                a90 a90Var = photoViewer.f35657b1;
                if (a90Var != null) {
                    a90Var.setTranslationY(f9);
                    return;
                }
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }
}
