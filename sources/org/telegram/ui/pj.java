package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pj implements View.OnTouchListener {
    public View f40812a;
    public org.telegram.ui.ActionBar.n1 f40813b;
    public final Rect f40814c = new Rect();
    public boolean d;
    public boolean f40815e;
    public final org.telegram.ui.Components.a30 f40816f;
    public final int[] h;
    public View f40817n;
    public float f40818r;
    public float f40819s;
    public final View v;
    public final zn f40820w;

    public pj(zn znVar, ImageView imageView) {
        this.f40820w = znVar;
        this.v = imageView;
        org.telegram.ui.Components.a30 a30Var = new org.telegram.ui.Components.a30((Context) null, new g(this, 24));
        this.f40816f = a30Var;
        this.h = new int[2];
        a30Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f40812a = view;
        if (motionEvent.getAction() == 0) {
            this.f40818r = motionEvent.getX();
            this.f40819s = motionEvent.getY();
            this.f40815e = false;
        }
        this.f40816f.a(motionEvent);
        if (this.f40813b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f40812a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f40813b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f40817n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40813b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f40814c;
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
                        this.f40817n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f40818r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f40819s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f40815e = true;
            this.f40812a.setPressed(false);
            this.f40812a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f40815e) {
            View view4 = this.f40817n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f40813b == null && (view2 = this.f40812a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
