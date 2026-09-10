package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.sq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mh1;
import org.telegram.ui.ys0;
public final class l0 extends ImageView {
    public final int f18413a;
    public final Object f18414b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f18413a = i10;
        this.f18414b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f18413a) {
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
        switch (this.f18413a) {
            case 0:
                w0 w0Var = (w0) this.f18414b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f18707s.setVisibility(4);
                    w0Var.f18707s.setAlpha(0.0f);
                    w0Var.f18707s.setRotation(45.0f);
                    w0Var.f18707s.setScaleX(0.0f);
                    w0Var.f18707s.setScaleY(0.0f);
                    return;
                }
                w0Var.f18707s.setAlpha(1.0f);
                w0Var.f18707s.setRotation(0.0f);
                w0Var.f18707s.setScaleX(1.0f);
                w0Var.f18707s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f18413a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((mh1) this.f18414b).f34966n.getTransformationMethod() != null) {
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
        switch (this.f18413a) {
            case 1:
                super.setAlpha(f7);
                ((sq) this.f18414b).f27163x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f18413a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f18414b;
                ArrayList arrayList = photoViewer.f30076h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((bi.x4) obj).setTranslationY(f7);
                    }
                }
                ys0 ys0Var = photoViewer.f30067g1;
                if (ys0Var != null) {
                    ys0Var.setTranslationY(f7);
                }
                o90 o90Var = photoViewer.f30059f1;
                if (o90Var != null) {
                    o90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
