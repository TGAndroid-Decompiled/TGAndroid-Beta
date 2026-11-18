package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b20;
import org.telegram.ui.bb1;
import org.telegram.ui.yo0;
public final class g0 extends ImageView {
    public final int f28959a;
    public final Object f28960b;

    public g0(int i7, Context context, Object obj) {
        super(context);
        this.f28959a = i7;
        this.f28960b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28959a) {
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
    public void invalidate() {
        switch (this.f28959a) {
            case 2:
                super.invalidate();
                b20 b20Var = (b20) this.f28960b;
                b20Var.f40982g0.invalidate();
                b20Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28959a) {
            case 0:
                r0 r0Var = (r0) this.f28960b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    r0Var.f29938s.setVisibility(4);
                    r0Var.f29938s.setAlpha(0.0f);
                    r0Var.f29938s.setRotation(45.0f);
                    r0Var.f29938s.setScaleX(0.0f);
                    r0Var.f29938s.setScaleY(0.0f);
                    return;
                }
                r0Var.f29938s.setAlpha(1.0f);
                r0Var.f29938s.setRotation(0.0f);
                r0Var.f29938s.setScaleX(1.0f);
                r0Var.f29938s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28959a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((bb1) this.f28960b).f45815n.getTransformationMethod() != null) {
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
    public void onMeasure(int i7, int i10) {
        switch (this.f28959a) {
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(k.getCurrentActionBarHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f28959a) {
            case 1:
                super.setAlpha(f10);
                ((kq) this.f28960b).f36861y.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f28959a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f28960b;
                ArrayList arrayList = photoViewer.f43235i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((hi.m3) obj).setTranslationY(f10);
                    }
                }
                yo0 yo0Var = photoViewer.f43227h1;
                if (yo0Var != null) {
                    yo0Var.setTranslationY(f10);
                }
                m80 m80Var = photoViewer.f43218g1;
                if (m80Var != null) {
                    m80Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
