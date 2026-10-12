package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;
import org.telegram.ui.oh1;
public final class j0 extends ImageView {
    public final int f20384a;
    public final Object f20385b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f20384a = i10;
        this.f20385b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20384a) {
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
        switch (this.f20384a) {
            case 0:
                u0 u0Var = (u0) this.f20385b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f20696s.setVisibility(4);
                    u0Var.f20696s.setAlpha(0.0f);
                    u0Var.f20696s.setRotation(45.0f);
                    u0Var.f20696s.setScaleX(0.0f);
                    u0Var.f20696s.setScaleY(0.0f);
                    return;
                }
                u0Var.f20696s.setAlpha(1.0f);
                u0Var.f20696s.setRotation(0.0f);
                u0Var.f20696s.setScaleX(1.0f);
                u0Var.f20696s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f20384a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((oh1) this.f20385b).f38974n.getTransformationMethod() != null) {
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
        switch (this.f20384a) {
            case 1:
                super.setAlpha(f7);
                ((zq) this.f20385b).f31973x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f20384a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f20385b;
                ArrayList arrayList = photoViewer.f32253h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((di.d4) obj).setTranslationY(f7);
                    }
                }
                gt0 gt0Var = photoViewer.f32244g1;
                if (gt0Var != null) {
                    gt0Var.setTranslationY(f7);
                }
                fa0 fa0Var = photoViewer.f32236f1;
                if (fa0Var != null) {
                    fa0Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
