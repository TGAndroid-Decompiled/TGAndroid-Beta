package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qj implements View.OnTouchListener {
    public View f36073a;
    public org.telegram.ui.ActionBar.p1 f36074b;
    public final Rect f36075c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.s20 f36076f;
    public final int[] h;
    public View f36077n;
    public float f36078r;
    public float f36079s;
    public final View v;
    public final eo f36080w;

    public qj(eo eoVar, ImageView imageView) {
        this.f36080w = eoVar;
        this.v = imageView;
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20((Context) null, new g(this, 24));
        this.f36076f = s20Var;
        this.h = new int[2];
        s20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f36073a = view;
        if (motionEvent.getAction() == 0) {
            this.f36078r = motionEvent.getX();
            this.f36079s = motionEvent.getY();
            this.e = false;
        }
        this.f36076f.a(motionEvent);
        if (this.f36074b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f36073a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f36074b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f36077n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36074b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f36075c;
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
                        this.f36077n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f36078r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f36079s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f36073a.setPressed(false);
            this.f36073a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f36077n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f36074b == null && (view2 = this.f36073a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
