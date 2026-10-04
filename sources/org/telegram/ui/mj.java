package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mj implements View.OnTouchListener {
    public View f38652a;
    public org.telegram.ui.ActionBar.n1 f38653b;
    public final Rect f38654c = new Rect();
    public boolean d;
    public boolean f38655e;
    public final org.telegram.ui.Components.n20 f38656f;
    public final int[] h;
    public View f38657n;
    public float f38658r;
    public float f38659s;
    public final View v;
    public final yn f38660w;

    public mj(yn ynVar, ImageView imageView) {
        this.f38660w = ynVar;
        this.v = imageView;
        org.telegram.ui.Components.n20 n20Var = new org.telegram.ui.Components.n20((Context) null, new g(this, 24));
        this.f38656f = n20Var;
        this.h = new int[2];
        n20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f38652a = view;
        if (motionEvent.getAction() == 0) {
            this.f38658r = motionEvent.getX();
            this.f38659s = motionEvent.getY();
            this.f38655e = false;
        }
        this.f38656f.a(motionEvent);
        if (this.f38653b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f38652a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f38653b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f38657n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f38653b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f38654c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f7, (int) f10)) {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(false, false);
                        }
                    } else {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f7, f10 - childAt.getTop());
                        this.f38657n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f38658r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f38659s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f38655e = true;
            this.f38652a.setPressed(false);
            this.f38652a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f38655e) {
            View view4 = this.f38657n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f38653b == null && (view2 = this.f38652a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
