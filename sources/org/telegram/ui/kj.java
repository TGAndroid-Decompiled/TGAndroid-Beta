package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kj implements View.OnTouchListener {
    public View f38327a;
    public org.telegram.ui.ActionBar.p1 f38328b;
    public final Rect f38329c = new Rect();
    public boolean d;
    public boolean f38330e;
    public final org.telegram.ui.Components.l20 f38331f;
    public final int[] h;
    public View f38332n;
    public float f38333r;
    public float f38334s;
    public final View v;
    public final xn f38335w;

    public kj(xn xnVar, ImageView imageView) {
        this.f38335w = xnVar;
        this.v = imageView;
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20((Context) null, new h(this, 24));
        this.f38331f = l20Var;
        this.h = new int[2];
        l20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f38327a = view;
        if (motionEvent.getAction() == 0) {
            this.f38333r = motionEvent.getX();
            this.f38334s = motionEvent.getY();
            this.f38330e = false;
        }
        this.f38331f.a(motionEvent);
        if (this.f38328b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f38327a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f38328b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f38332n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f38328b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
                Rect rect = this.f38329c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f10, (int) f11)) {
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
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.f38332n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f38333r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f38334s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f38330e = true;
            this.f38327a.setPressed(false);
            this.f38327a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f38330e) {
            View view4 = this.f38332n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f38328b == null && (view2 = this.f38327a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
