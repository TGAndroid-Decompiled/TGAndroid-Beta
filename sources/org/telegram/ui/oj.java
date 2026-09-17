package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oj implements View.OnTouchListener {
    public View f39260a;
    public org.telegram.ui.ActionBar.n1 f39261b;
    public final Rect f39262c = new Rect();
    public boolean d;
    public boolean f39263e;
    public final org.telegram.ui.Components.j20 f39264f;
    public final int[] h;
    public View f39265n;
    public float f39266r;
    public float f39267s;
    public final View v;
    public final co f39268w;

    public oj(co coVar, ImageView imageView) {
        this.f39268w = coVar;
        this.v = imageView;
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20((Context) null, new g(this, 24));
        this.f39264f = j20Var;
        this.h = new int[2];
        j20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f39260a = view;
        if (motionEvent.getAction() == 0) {
            this.f39266r = motionEvent.getX();
            this.f39267s = motionEvent.getY();
            this.f39263e = false;
        }
        this.f39264f.a(motionEvent);
        if (this.f39261b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f39260a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f39261b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f39265n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f39261b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f39262c;
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
                        this.f39265n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f39266r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f39267s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f39263e = true;
            this.f39260a.setPressed(false);
            this.f39260a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f39263e) {
            View view4 = this.f39265n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f39261b == null && (view2 = this.f39260a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
