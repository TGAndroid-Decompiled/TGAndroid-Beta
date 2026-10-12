package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bt0;
import org.telegram.ui.kh1;
public final class j0 extends ImageView {
    public final int f20987a;
    public final Object f20988b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f20987a = i10;
        this.f20988b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20987a) {
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
        switch (this.f20987a) {
            case 0:
                u0 u0Var = (u0) this.f20988b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f21331s.setVisibility(4);
                    u0Var.f21331s.setAlpha(0.0f);
                    u0Var.f21331s.setRotation(45.0f);
                    u0Var.f21331s.setScaleX(0.0f);
                    u0Var.f21331s.setScaleY(0.0f);
                    return;
                }
                u0Var.f21331s.setAlpha(1.0f);
                u0Var.f21331s.setRotation(0.0f);
                u0Var.f21331s.setScaleX(1.0f);
                u0Var.f21331s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f20987a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((kh1) this.f20988b).f39512n.getTransformationMethod() != null) {
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
        switch (this.f20987a) {
            case 1:
                super.setAlpha(f7);
                ((er) this.f20988b).f25778x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f20987a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f20988b;
                ArrayList arrayList = photoViewer.f33768h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.d4) obj).setTranslationY(f7);
                    }
                }
                bt0 bt0Var = photoViewer.f33759g1;
                if (bt0Var != null) {
                    bt0Var.setTranslationY(f7);
                }
                ka0 ka0Var = photoViewer.f33751f1;
                if (ka0Var != null) {
                    ka0Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
