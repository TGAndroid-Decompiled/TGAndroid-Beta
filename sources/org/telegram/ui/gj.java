package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gj implements View.OnTouchListener {
    public View f37338a;
    public org.telegram.ui.ActionBar.m1 f37339b;
    public final Rect f37340c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.s20 f37341f;
    public final int[] h;
    public View f37342n;
    public float f37343r;
    public float f37344s;
    public final View v;
    public final qn f37345w;

    public gj(qn qnVar, ImageView imageView) {
        this.f37345w = qnVar;
        this.v = imageView;
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20((Context) null, new g(this, 24));
        this.f37341f = s20Var;
        this.h = new int[2];
        s20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f37338a = view;
        if (motionEvent.getAction() == 0) {
            this.f37343r = motionEvent.getX();
            this.f37344s = motionEvent.getY();
            this.e = false;
        }
        this.f37341f.a(motionEvent);
        if (this.f37339b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f37338a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f37339b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f37342n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f37339b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f37340c;
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
                        this.f37342n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f37343r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f37344s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f37338a.setPressed(false);
            this.f37338a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f37342n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f37339b == null && (view2 = this.f37338a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
