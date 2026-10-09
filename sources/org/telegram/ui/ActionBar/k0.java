package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ih1;
import org.telegram.ui.zs0;
public final class k0 extends ImageView {
    public final int f21310a;
    public final Object f21311b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f21310a = i10;
        this.f21311b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f21310a) {
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
        switch (this.f21310a) {
            case 0:
                v0 v0Var = (v0) this.f21311b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f21601s.setVisibility(4);
                    v0Var.f21601s.setAlpha(0.0f);
                    v0Var.f21601s.setRotation(45.0f);
                    v0Var.f21601s.setScaleX(0.0f);
                    v0Var.f21601s.setScaleY(0.0f);
                    return;
                }
                v0Var.f21601s.setAlpha(1.0f);
                v0Var.f21601s.setRotation(0.0f);
                v0Var.f21601s.setScaleX(1.0f);
                v0Var.f21601s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f21310a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((ih1) this.f21311b).f38657n.getTransformationMethod() != null) {
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
        switch (this.f21310a) {
            case 1:
                super.setAlpha(f7);
                ((cr) this.f21311b).f25497x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21310a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f21311b;
                ArrayList arrayList = photoViewer.f33931h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.d4) obj).setTranslationY(f7);
                    }
                }
                zs0 zs0Var = photoViewer.f33922g1;
                if (zs0Var != null) {
                    zs0Var.setTranslationY(f7);
                }
                ga0 ga0Var = photoViewer.f33914f1;
                if (ga0Var != null) {
                    ga0Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
