package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hh1;
import org.telegram.ui.zs0;
public final class k0 extends ImageView {
    public final int f19337a;
    public final Object f19338b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f19337a = i10;
        this.f19338b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19337a) {
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
        switch (this.f19337a) {
            case 0:
                v0 v0Var = (v0) this.f19338b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f19595s.setVisibility(4);
                    v0Var.f19595s.setAlpha(0.0f);
                    v0Var.f19595s.setRotation(45.0f);
                    v0Var.f19595s.setScaleX(0.0f);
                    v0Var.f19595s.setScaleY(0.0f);
                    return;
                }
                v0Var.f19595s.setAlpha(1.0f);
                v0Var.f19595s.setRotation(0.0f);
                v0Var.f19595s.setScaleX(1.0f);
                v0Var.f19595s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19337a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((hh1) this.f19338b).f34282n.getTransformationMethod() != null) {
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
        switch (this.f19337a) {
            case 1:
                super.setAlpha(f7);
                ((mq) this.f19338b).f26225x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19337a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19338b;
                ArrayList arrayList = photoViewer.f30961h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.f4) obj).setTranslationY(f7);
                    }
                }
                zs0 zs0Var = photoViewer.f30952g1;
                if (zs0Var != null) {
                    zs0Var.setTranslationY(f7);
                }
                e90 e90Var = photoViewer.f30944f1;
                if (e90Var != null) {
                    e90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
