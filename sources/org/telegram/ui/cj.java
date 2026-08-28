package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cj implements View.OnTouchListener {
    public View f37222a;
    public org.telegram.ui.ActionBar.o1 f37223b;
    public final Rect f37224c = new Rect();
    public boolean d;
    public boolean f37225e;
    public final org.telegram.ui.Components.u10 f37226f;
    public final int[] h;
    public View f37227n;
    public float f37228r;
    public float f37229s;
    public final View v;
    public final qn f37230w;

    public cj(qn qnVar, ImageView imageView) {
        this.f37230w = qnVar;
        this.v = imageView;
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10((Context) null, new g(this, 24));
        this.f37226f = u10Var;
        this.h = new int[2];
        u10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f37222a = view;
        if (motionEvent.getAction() == 0) {
            this.f37228r = motionEvent.getX();
            this.f37229s = motionEvent.getY();
            this.f37225e = false;
        }
        this.f37226f.a(motionEvent);
        if (this.f37223b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f37222a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f37223b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f37227n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f37223b.getContentView();
            for (int i9 = 0; i9 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i9++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9);
                Rect rect = this.f37224c;
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
                        this.f37227n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f37228r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f37229s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f37225e = true;
            this.f37222a.setPressed(false);
            this.f37222a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f37225e) {
            View view4 = this.f37227n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f37223b == null && (view2 = this.f37222a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
