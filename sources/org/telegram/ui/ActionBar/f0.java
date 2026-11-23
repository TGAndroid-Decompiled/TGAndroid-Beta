package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b20;
import org.telegram.ui.bb1;
import org.telegram.ui.yo0;
public final class f0 extends ImageView {
    public final int f28944a;
    public final Object f28945b;

    public f0(int i7, Context context, Object obj) {
        super(context);
        this.f28944a = i7;
        this.f28945b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28944a) {
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
        switch (this.f28944a) {
            case 2:
                super.invalidate();
                b20 b20Var = (b20) this.f28945b;
                b20Var.f41118g0.invalidate();
                b20Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28944a) {
            case 0:
                q0 q0Var = (q0) this.f28945b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    q0Var.f29924s.setVisibility(4);
                    q0Var.f29924s.setAlpha(0.0f);
                    q0Var.f29924s.setRotation(45.0f);
                    q0Var.f29924s.setScaleX(0.0f);
                    q0Var.f29924s.setScaleY(0.0f);
                    return;
                }
                q0Var.f29924s.setAlpha(1.0f);
                q0Var.f29924s.setRotation(0.0f);
                q0Var.f29924s.setScaleX(1.0f);
                q0Var.f29924s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28944a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((bb1) this.f28945b).f45851n.getTransformationMethod() != null) {
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
        switch (this.f28944a) {
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
        switch (this.f28944a) {
            case 1:
                super.setAlpha(f10);
                ((mq) this.f28945b).f37615y.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f28944a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f28945b;
                ArrayList arrayList = photoViewer.f43280i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((hi.l3) obj).setTranslationY(f10);
                    }
                }
                yo0 yo0Var = photoViewer.f43272h1;
                if (yo0Var != null) {
                    yo0Var.setTranslationY(f10);
                }
                o80 o80Var = photoViewer.f43263g1;
                if (o80Var != null) {
                    o80Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
