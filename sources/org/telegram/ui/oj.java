package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oj implements View.OnTouchListener {
    public View f40270a;
    public org.telegram.ui.ActionBar.k1 f40271b;
    public final Rect f40272c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.p10 f40273f;
    public final int[] h;
    public View f40274n;
    public float f40275r;
    public float f40276s;
    public final View f40277w;
    public final un f40278x;

    public oj(un unVar, ImageView imageView) {
        this.f40278x = unVar;
        this.f40277w = imageView;
        org.telegram.ui.Components.p10 p10Var = new org.telegram.ui.Components.p10((Context) null, new e(this, 22));
        this.f40273f = p10Var;
        this.h = new int[2];
        p10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f40270a = view;
        if (motionEvent.getAction() == 0) {
            this.f40275r = motionEvent.getX();
            this.f40276s = motionEvent.getY();
            this.e = false;
        }
        this.f40273f.a(motionEvent);
        if (this.f40271b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f40270a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f40271b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f40274n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40271b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f40272c;
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
                        this.f40274n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f40275r) > org.telegram.messenger.i0.e * 2.0f) || Math.abs(motionEvent.getY() - this.f40276s) > org.telegram.messenger.i0.e * 2.0f) {
            this.e = true;
            this.f40270a.setPressed(false);
            this.f40270a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f40274n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f40271b == null && (view2 = this.f40270a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
