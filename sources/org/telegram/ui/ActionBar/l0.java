package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.kq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ds0;
import org.telegram.ui.og1;
public final class l0 extends ImageView {
    public final int f20418a;
    public final Object f20419b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f20418a = i10;
        this.f20419b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20418a) {
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
        switch (this.f20418a) {
            case 0:
                w0 w0Var = (w0) this.f20419b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f20670s.setVisibility(4);
                    w0Var.f20670s.setAlpha(0.0f);
                    w0Var.f20670s.setRotation(45.0f);
                    w0Var.f20670s.setScaleX(0.0f);
                    w0Var.f20670s.setScaleY(0.0f);
                    return;
                }
                w0Var.f20670s.setAlpha(1.0f);
                w0Var.f20670s.setRotation(0.0f);
                w0Var.f20670s.setScaleX(1.0f);
                w0Var.f20670s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f20418a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z4 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((og1) this.f20419b).f36904n.getTransformationMethod() != null) {
                    z4 = false;
                }
                accessibilityNodeInfo.setChecked(z4);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f20418a) {
            case 1:
                super.setAlpha(f10);
                ((kq) this.f20419b).f26363x.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f20418a) {
            case 2:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f20419b;
                ArrayList arrayList = photoViewer.f31733e1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ph.f3) obj).setTranslationY(f10);
                    }
                }
                ds0 ds0Var = photoViewer.f31724d1;
                if (ds0Var != null) {
                    ds0Var.setTranslationY(f10);
                }
                g90 g90Var = photoViewer.f31716c1;
                if (g90Var != null) {
                    g90Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
