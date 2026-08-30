package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kj implements View.OnTouchListener {
    public View f35742a;
    public org.telegram.ui.ActionBar.p1 f35743b;
    public final Rect f35744c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.k20 f35745f;
    public final int[] h;
    public View f35746n;
    public float f35747r;
    public float f35748s;
    public final View v;
    public final xn f35749w;

    public kj(xn xnVar, ImageView imageView) {
        this.f35749w = xnVar;
        this.v = imageView;
        org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20((Context) null, new h(this, 24));
        this.f35745f = k20Var;
        this.h = new int[2];
        k20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f35742a = view;
        if (motionEvent.getAction() == 0) {
            this.f35747r = motionEvent.getX();
            this.f35748s = motionEvent.getY();
            this.e = false;
        }
        this.f35745f.a(motionEvent);
        if (this.f35743b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f35742a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f35743b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f35746n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35743b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
                Rect rect = this.f35744c;
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
                        this.f35746n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f35747r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f35748s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f35742a.setPressed(false);
            this.f35742a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f35746n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f35743b == null && (view2 = this.f35742a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
