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
    public View f39286a;
    public org.telegram.ui.ActionBar.n1 f39287b;
    public final Rect f39288c = new Rect();
    public boolean d;
    public boolean f39289e;
    public final org.telegram.ui.Components.j20 f39290f;
    public final int[] h;
    public View f39291n;
    public float f39292r;
    public float f39293s;
    public final View v;
    public final co f39294w;

    public oj(co coVar, ImageView imageView) {
        this.f39294w = coVar;
        this.v = imageView;
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20((Context) null, new g(this, 24));
        this.f39290f = j20Var;
        this.h = new int[2];
        j20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f39286a = view;
        if (motionEvent.getAction() == 0) {
            this.f39292r = motionEvent.getX();
            this.f39293s = motionEvent.getY();
            this.f39289e = false;
        }
        this.f39290f.a(motionEvent);
        if (this.f39287b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f39286a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f39287b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f39291n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f39287b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f39288c;
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
                        this.f39291n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f39292r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f39293s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f39289e = true;
            this.f39286a.setPressed(false);
            this.f39286a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f39289e) {
            View view4 = this.f39291n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f39287b == null && (view2 = this.f39286a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
