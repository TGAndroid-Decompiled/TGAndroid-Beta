package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dg1;
import org.telegram.ui.ms0;
public final class k0 extends ImageView {
    public final int f22802a;
    public final Object f22803b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f22802a = i10;
        this.f22803b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f22802a) {
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
        switch (this.f22802a) {
            case 0:
                w0 w0Var = (w0) this.f22803b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f23197s.setVisibility(4);
                    w0Var.f23197s.setAlpha(0.0f);
                    w0Var.f23197s.setRotation(45.0f);
                    w0Var.f23197s.setScaleX(0.0f);
                    w0Var.f23197s.setScaleY(0.0f);
                    return;
                }
                w0Var.f23197s.setAlpha(1.0f);
                w0Var.f23197s.setRotation(0.0f);
                w0Var.f23197s.setScaleX(1.0f);
                w0Var.f23197s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22802a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((dg1) this.f22803b).f38879n.getTransformationMethod() != null) {
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
        switch (this.f22802a) {
            case 1:
                super.setAlpha(f7);
                ((yq) this.f22803b).f35127x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f22802a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f22803b;
                ArrayList arrayList = photoViewer.f35673h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((fi.v3) obj).setTranslationY(f7);
                    }
                }
                ms0 ms0Var = photoViewer.f35665g1;
                if (ms0Var != null) {
                    ms0Var.setTranslationY(f7);
                }
                ba0 ba0Var = photoViewer.f35657f1;
                if (ba0Var != null) {
                    ba0Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
