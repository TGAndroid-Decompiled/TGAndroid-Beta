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
    public View f35339a;
    public org.telegram.ui.ActionBar.m1 f35340b;
    public final Rect f35341c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.k20 f35342f;
    public final int[] h;
    public View f35343n;
    public float f35344r;
    public float f35345s;
    public final View v;
    public final wn f35346w;

    public lj(wn wnVar, ImageView imageView) {
        this.f35346w = wnVar;
        this.v = imageView;
        org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20((Context) null, new g(this, 24));
        this.f35342f = k20Var;
        this.h = new int[2];
        k20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f35339a = view;
        if (motionEvent.getAction() == 0) {
            this.f35344r = motionEvent.getX();
            this.f35345s = motionEvent.getY();
            this.e = false;
        }
        this.f35342f.a(motionEvent);
        if (this.f35340b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f35339a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f35340b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f35343n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35340b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f35341c;
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
                        this.f35343n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f35344r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f35345s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f35339a.setPressed(false);
            this.f35339a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f35343n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f35340b == null && (view2 = this.f35339a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
