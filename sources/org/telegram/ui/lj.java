package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lj implements View.OnTouchListener {
    public View f34992a;
    public org.telegram.ui.ActionBar.n1 f34993b;
    public final Rect f34994c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.k20 f34995f;
    public final int[] h;
    public View f34996n;
    public float f34997r;
    public float f34998s;
    public final View v;
    public final xn f34999w;

    public lj(xn xnVar, ImageView imageView) {
        this.f34999w = xnVar;
        this.v = imageView;
        org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20((Context) null, new g(this, 24));
        this.f34995f = k20Var;
        this.h = new int[2];
        k20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f34992a = view;
        if (motionEvent.getAction() == 0) {
            this.f34997r = motionEvent.getX();
            this.f34998s = motionEvent.getY();
            this.e = false;
        }
        this.f34995f.a(motionEvent);
        if (this.f34993b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f34992a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f34993b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f34996n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f34993b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f34994c;
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
                        this.f34996n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f34997r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f34998s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f34992a.setPressed(false);
            this.f34992a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f34996n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f34993b == null && (view2 = this.f34992a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
