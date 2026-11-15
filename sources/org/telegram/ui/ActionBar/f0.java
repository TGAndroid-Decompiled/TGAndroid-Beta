package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.dq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vo0;
import org.telegram.ui.xa1;
import org.telegram.ui.y10;
public final class f0 extends ImageView {
    public final int f28523a;
    public final Object f28524b;

    public f0(int i7, Context context, Object obj) {
        super(context);
        this.f28523a = i7;
        this.f28524b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28523a) {
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
        switch (this.f28523a) {
            case 2:
                super.invalidate();
                y10 y10Var = (y10) this.f28524b;
                y10Var.f40736g0.invalidate();
                y10Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28523a) {
            case 0:
                q0 q0Var = (q0) this.f28524b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    q0Var.f29519s.setVisibility(4);
                    q0Var.f29519s.setAlpha(0.0f);
                    q0Var.f29519s.setRotation(45.0f);
                    q0Var.f29519s.setScaleX(0.0f);
                    q0Var.f29519s.setScaleY(0.0f);
                    return;
                }
                q0Var.f29519s.setAlpha(1.0f);
                q0Var.f29519s.setRotation(0.0f);
                q0Var.f29519s.setScaleX(1.0f);
                q0Var.f29519s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28523a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((xa1) this.f28524b).f53154n.getTransformationMethod() != null) {
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
        switch (this.f28523a) {
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
        switch (this.f28523a) {
            case 1:
                super.setAlpha(f10);
                ((dq) this.f28524b).f34033y.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f28523a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f28524b;
                ArrayList arrayList = photoViewer.f42790i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((hi.l3) obj).setTranslationY(f10);
                    }
                }
                vo0 vo0Var = photoViewer.f42782h1;
                if (vo0Var != null) {
                    vo0Var.setTranslationY(f10);
                }
                b80 b80Var = photoViewer.f42773g1;
                if (b80Var != null) {
                    b80Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
