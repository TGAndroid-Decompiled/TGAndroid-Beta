package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.n80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ag1;
import org.telegram.ui.wr0;
public final class l0 extends ImageView {
    public final int f23616a;
    public final Object f23617b;

    public l0(Object obj, Context context, int i9) {
        super(context);
        this.f23616a = i9;
        this.f23617b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f23616a) {
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
        switch (this.f23616a) {
            case 0:
                w0 w0Var = (w0) this.f23617b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f23922s.setVisibility(4);
                    w0Var.f23922s.setAlpha(0.0f);
                    w0Var.f23922s.setRotation(45.0f);
                    w0Var.f23922s.setScaleX(0.0f);
                    w0Var.f23922s.setScaleY(0.0f);
                    return;
                }
                w0Var.f23922s.setAlpha(1.0f);
                w0Var.f23922s.setRotation(0.0f);
                w0Var.f23922s.setScaleX(1.0f);
                w0Var.f23922s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f23616a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((ag1) this.f23617b).f36492n.getTransformationMethod() != null) {
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
    public void setAlpha(float f10) {
        switch (this.f23616a) {
            case 1:
                super.setAlpha(f10);
                ((cq) this.f23617b).f27552x.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f23616a) {
            case 2:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f23617b;
                ArrayList arrayList = photoViewer.f35608d1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        ((kh.x3) obj).setTranslationY(f10);
                    }
                }
                wr0 wr0Var = photoViewer.f35599c1;
                if (wr0Var != null) {
                    wr0Var.setTranslationY(f10);
                }
                n80 n80Var = photoViewer.f35589b1;
                if (n80Var != null) {
                    n80Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
