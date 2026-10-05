package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mj implements View.OnTouchListener {
    public View f38643a;
    public org.telegram.ui.ActionBar.n1 f38644b;
    public final Rect f38645c = new Rect();
    public boolean d;
    public boolean f38646e;
    public final org.telegram.ui.Components.n20 f38647f;
    public final int[] h;
    public View f38648n;
    public float f38649r;
    public float f38650s;
    public final View v;
    public final yn f38651w;

    public mj(yn ynVar, ImageView imageView) {
        this.f38651w = ynVar;
        this.v = imageView;
        org.telegram.ui.Components.n20 n20Var = new org.telegram.ui.Components.n20((Context) null, new g(this, 24));
        this.f38647f = n20Var;
        this.h = new int[2];
        n20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f38643a = view;
        if (motionEvent.getAction() == 0) {
            this.f38649r = motionEvent.getX();
            this.f38650s = motionEvent.getY();
            this.f38646e = false;
        }
        this.f38647f.a(motionEvent);
        if (this.f38644b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f38643a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f38644b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f38648n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f38644b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f38645c;
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
                        this.f38648n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f38649r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f38650s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f38646e = true;
            this.f38643a.setPressed(false);
            this.f38643a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f38646e) {
            View view4 = this.f38648n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f38644b == null && (view2 = this.f38643a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
