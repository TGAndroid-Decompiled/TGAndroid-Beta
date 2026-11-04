package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pi implements View.OnTouchListener {
    public View f48589a;
    public org.telegram.ui.ActionBar.f1 f48590b;
    public final Rect f48591c = new Rect();
    public boolean d;
    public boolean f48592e;
    public final org.telegram.ui.Components.v00 f48593f;
    public final int[] h;
    public View f48594n;
    public float f48595r;
    public float f48596s;
    public final View f48597w;
    public final wm f48598x;

    public pi(wm wmVar, ImageView imageView) {
        this.f48598x = wmVar;
        this.f48597w = imageView;
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00((Context) null, new f(this, 22));
        this.f48593f = v00Var;
        this.h = new int[2];
        v00Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f48589a = view;
        if (motionEvent.getAction() == 0) {
            this.f48595r = motionEvent.getX();
            this.f48596s = motionEvent.getY();
            this.f48592e = false;
        }
        this.f48593f.a(motionEvent);
        if (this.f48590b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f48589a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y9 = motionEvent.getY() + iArr[1];
            this.f48590b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y9 - iArr[1];
            this.f48594n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f48590b.getContentView();
            for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                Rect rect = this.f48591c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f10, (int) f11)) {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    } else {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.f48594n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f48595r) > org.telegram.messenger.g0.f22587e * 2.0f) || Math.abs(motionEvent.getY() - this.f48596s) > org.telegram.messenger.g0.f22587e * 2.0f) {
            this.f48592e = true;
            this.f48589a.setPressed(false);
            this.f48589a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f48592e) {
            View view4 = this.f48594n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f48590b == null && (view2 = this.f48589a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
