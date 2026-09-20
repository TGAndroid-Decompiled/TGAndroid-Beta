package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nj implements View.OnTouchListener {
    public View f36036a;
    public org.telegram.ui.ActionBar.n1 f36037b;
    public final Rect f36038c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.j20 f36039f;
    public final int[] h;
    public View f36040n;
    public float f36041r;
    public float f36042s;
    public final View v;
    public final zn f36043w;

    public nj(zn znVar, ImageView imageView) {
        this.f36043w = znVar;
        this.v = imageView;
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20((Context) null, new g(this, 24));
        this.f36039f = j20Var;
        this.h = new int[2];
        j20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f36036a = view;
        if (motionEvent.getAction() == 0) {
            this.f36041r = motionEvent.getX();
            this.f36042s = motionEvent.getY();
            this.e = false;
        }
        this.f36039f.a(motionEvent);
        if (this.f36037b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f36036a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f36037b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f36040n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36037b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f36038c;
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
                        this.f36040n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f36041r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f36042s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f36036a.setPressed(false);
            this.f36036a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f36040n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f36037b == null && (view2 = this.f36036a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
