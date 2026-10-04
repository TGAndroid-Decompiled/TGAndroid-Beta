package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.s90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bh1;
import org.telegram.ui.us0;
public final class k0 extends ImageView {
    public final int f21308a;
    public final Object f21309b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f21308a = i10;
        this.f21309b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f21308a) {
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
        switch (this.f21308a) {
            case 0:
                v0 v0Var = (v0) this.f21309b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f21597s.setVisibility(4);
                    v0Var.f21597s.setAlpha(0.0f);
                    v0Var.f21597s.setRotation(45.0f);
                    v0Var.f21597s.setScaleX(0.0f);
                    v0Var.f21597s.setScaleY(0.0f);
                    return;
                }
                v0Var.f21597s.setAlpha(1.0f);
                v0Var.f21597s.setRotation(0.0f);
                v0Var.f21597s.setScaleX(1.0f);
                v0Var.f21597s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f21308a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((bh1) this.f21309b).f35109n.getTransformationMethod() != null) {
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
        switch (this.f21308a) {
            case 1:
                super.setAlpha(f7);
                ((pq) this.f21309b).f29727x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21308a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f21309b;
                ArrayList arrayList = photoViewer.f33928h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.e4) obj).setTranslationY(f7);
                    }
                }
                us0 us0Var = photoViewer.f33919g1;
                if (us0Var != null) {
                    us0Var.setTranslationY(f7);
                }
                s90 s90Var = photoViewer.f33911f1;
                if (s90Var != null) {
                    s90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
