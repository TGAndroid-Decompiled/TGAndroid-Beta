package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fj implements View.OnTouchListener {
    public View f38192a;
    public org.telegram.ui.ActionBar.o1 f38193b;
    public final Rect f38194c = new Rect();
    public boolean d;
    public boolean f38195e;
    public final org.telegram.ui.Components.f20 f38196f;
    public final int[] h;
    public View f38197n;
    public float f38198r;
    public float f38199s;
    public final View v;
    public final tn f38200w;

    public fj(tn tnVar, ImageView imageView) {
        this.f38200w = tnVar;
        this.v = imageView;
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20((Context) null, new h(this, 24));
        this.f38196f = f20Var;
        this.h = new int[2];
        f20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f38192a = view;
        if (motionEvent.getAction() == 0) {
            this.f38198r = motionEvent.getX();
            this.f38199s = motionEvent.getY();
            this.f38195e = false;
        }
        this.f38196f.a(motionEvent);
        if (this.f38193b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f38192a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x4 = motionEvent.getX() + iArr[0];
            float y8 = motionEvent.getY() + iArr[1];
            this.f38193b.getContentView().getLocationOnScreen(iArr);
            float f9 = x4 - iArr[0];
            float f10 = y8 - iArr[1];
            this.f38197n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f38193b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
                Rect rect = this.f38194c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f9, (int) f10)) {
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
                        childAt.drawableHotspotChanged(f9, f10 - childAt.getTop());
                        this.f38197n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f38198r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f38199s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f38195e = true;
            this.f38192a.setPressed(false);
            this.f38192a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f38195e) {
            View view4 = this.f38197n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f38193b == null && (view2 = this.f38192a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
