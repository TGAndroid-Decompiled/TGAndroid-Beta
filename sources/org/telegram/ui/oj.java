package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oj implements View.OnTouchListener {
    public View f40171a;
    public org.telegram.ui.ActionBar.k1 f40172b;
    public final Rect f40173c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.p10 f40174f;
    public final int[] h;
    public View f40175n;
    public float f40176r;
    public float f40177s;
    public final View f40178w;
    public final un f40179x;

    public oj(un unVar, ImageView imageView) {
        this.f40179x = unVar;
        this.f40178w = imageView;
        org.telegram.ui.Components.p10 p10Var = new org.telegram.ui.Components.p10((Context) null, new e(this, 22));
        this.f40174f = p10Var;
        this.h = new int[2];
        p10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f40171a = view;
        if (motionEvent.getAction() == 0) {
            this.f40176r = motionEvent.getX();
            this.f40177s = motionEvent.getY();
            this.e = false;
        }
        this.f40174f.a(motionEvent);
        if (this.f40172b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f40171a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f40172b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f40175n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40172b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f40173c;
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
                        this.f40175n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f40176r) > org.telegram.messenger.i0.e * 2.0f) || Math.abs(motionEvent.getY() - this.f40177s) > org.telegram.messenger.i0.e * 2.0f) {
            this.e = true;
            this.f40171a.setPressed(false);
            this.f40171a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f40175n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f40172b == null && (view2 = this.f40171a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
