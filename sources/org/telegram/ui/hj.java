package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hj implements View.OnTouchListener {
    public View f40018a;
    public org.telegram.ui.ActionBar.o1 f40019b;
    public final Rect f40020c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.u20 f40021f;
    public final int[] h;
    public View f40022n;
    public float f40023r;
    public float f40024s;
    public final View v;
    public final un f40025w;

    public hj(un unVar, ImageView imageView) {
        this.f40025w = unVar;
        this.v = imageView;
        org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20((Context) null, new f(this, 24));
        this.f40021f = u20Var;
        this.h = new int[2];
        u20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f40018a = view;
        if (motionEvent.getAction() == 0) {
            this.f40023r = motionEvent.getX();
            this.f40024s = motionEvent.getY();
            this.e = false;
        }
        this.f40021f.a(motionEvent);
        if (this.f40019b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f40018a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x9 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f40019b.getContentView().getLocationOnScreen(iArr);
            float f7 = x9 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f40022n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40019b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f40020c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f7, (int) f10)) {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    } else {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        childAt.drawableHotspotChanged(f7, f10 - childAt.getTop());
                        this.f40022n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f40023r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f40024s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f40018a.setPressed(false);
            this.f40018a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f40022n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f40019b == null && (view2 = this.f40018a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
