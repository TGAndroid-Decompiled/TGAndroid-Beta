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
    public View f39259a;
    public org.telegram.ui.ActionBar.n1 f39260b;
    public final Rect f39261c = new Rect();
    public boolean d;
    public boolean f39262e;
    public final org.telegram.ui.Components.j20 f39263f;
    public final int[] h;
    public View f39264n;
    public float f39265r;
    public float f39266s;
    public final View v;
    public final co f39267w;

    public oj(co coVar, ImageView imageView) {
        this.f39267w = coVar;
        this.v = imageView;
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20((Context) null, new g(this, 24));
        this.f39263f = j20Var;
        this.h = new int[2];
        j20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f39259a = view;
        if (motionEvent.getAction() == 0) {
            this.f39265r = motionEvent.getX();
            this.f39266s = motionEvent.getY();
            this.f39262e = false;
        }
        this.f39263f.a(motionEvent);
        if (this.f39260b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f39259a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f39260b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f39264n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f39260b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f39261c;
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
                        this.f39264n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f39265r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f39266s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f39262e = true;
            this.f39259a.setPressed(false);
            this.f39259a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f39262e) {
            View view4 = this.f39264n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f39260b == null && (view2 = this.f39259a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
