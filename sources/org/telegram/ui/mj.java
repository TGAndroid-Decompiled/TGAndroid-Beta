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
    public View f36107a;
    public org.telegram.ui.ActionBar.p1 f36108b;
    public final Rect f36109c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.l20 f36110f;
    public final int[] h;
    public View f36111n;
    public float f36112r;
    public float f36113s;
    public final View v;
    public final zn f36114w;

    public mj(zn znVar, ImageView imageView) {
        this.f36114w = znVar;
        this.v = imageView;
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20((Context) null, new h(this, 24));
        this.f36110f = l20Var;
        this.h = new int[2];
        l20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f36107a = view;
        if (motionEvent.getAction() == 0) {
            this.f36112r = motionEvent.getX();
            this.f36113s = motionEvent.getY();
            this.e = false;
        }
        this.f36110f.a(motionEvent);
        if (this.f36108b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f36107a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f36108b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f36111n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36108b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
                Rect rect = this.f36109c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f10, (int) f11)) {
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
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.f36111n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f36112r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f36113s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f36107a.setPressed(false);
            this.f36107a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f36111n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f36108b == null && (view2 = this.f36107a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
