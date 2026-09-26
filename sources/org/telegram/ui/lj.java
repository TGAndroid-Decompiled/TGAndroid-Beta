package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lj implements View.OnTouchListener {
    public View f35370a;
    public org.telegram.ui.ActionBar.m1 f35371b;
    public final Rect f35372c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.l20 f35373f;
    public final int[] h;
    public View f35374n;
    public float f35375r;
    public float f35376s;
    public final View v;
    public final wn f35377w;

    public lj(wn wnVar, ImageView imageView) {
        this.f35377w = wnVar;
        this.v = imageView;
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20((Context) null, new g(this, 24));
        this.f35373f = l20Var;
        this.h = new int[2];
        l20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f35370a = view;
        if (motionEvent.getAction() == 0) {
            this.f35375r = motionEvent.getX();
            this.f35376s = motionEvent.getY();
            this.e = false;
        }
        this.f35373f.a(motionEvent);
        if (this.f35371b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f35370a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f35371b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f35374n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35371b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f35372c;
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
                        this.f35374n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f35375r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f35376s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f35370a.setPressed(false);
            this.f35370a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f35374n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f35371b == null && (view2 = this.f35370a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
