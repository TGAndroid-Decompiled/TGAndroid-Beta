package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gj implements View.OnTouchListener {
    public View f37342a;
    public org.telegram.ui.ActionBar.m1 f37343b;
    public final Rect f37344c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.s20 f37345f;
    public final int[] h;
    public View f37346n;
    public float f37347r;
    public float f37348s;
    public final View v;
    public final qn f37349w;

    public gj(qn qnVar, ImageView imageView) {
        this.f37349w = qnVar;
        this.v = imageView;
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20((Context) null, new g(this, 24));
        this.f37345f = s20Var;
        this.h = new int[2];
        s20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f37342a = view;
        if (motionEvent.getAction() == 0) {
            this.f37347r = motionEvent.getX();
            this.f37348s = motionEvent.getY();
            this.e = false;
        }
        this.f37345f.a(motionEvent);
        if (this.f37343b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f37342a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f37343b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f37346n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f37343b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f37344c;
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
                        this.f37346n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f37347r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f37348s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f37342a.setPressed(false);
            this.f37342a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f37346n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f37343b == null && (view2 = this.f37342a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
