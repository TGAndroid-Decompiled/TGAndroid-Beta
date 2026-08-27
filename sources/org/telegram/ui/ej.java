package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class ej implements View.OnTouchListener {

    public View f37774a;

    public org.telegram.ui.ActionBar.n1 f37775b;

    public final Rect f37776c = new Rect();
    public boolean d;

    public boolean f37777e;

    public final org.telegram.ui.Components.x10 f37778f;
    public final int[] h;

    public View f37779n;

    public float f37780r;

    public float f37781s;
    public final View v;

    public final rn f37782w;

    public ej(rn rnVar, ImageView imageView) {
        this.f37782w = rnVar;
        this.v = imageView;
        org.telegram.ui.Components.x10 x10Var = new org.telegram.ui.Components.x10((Context) null, new g(this, 24));
        this.f37778f = x10Var;
        this.h = new int[2];
        x10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f37774a = view;
        if (motionEvent.getAction() == 0) {
            this.f37780r = motionEvent.getX();
            this.f37781s = motionEvent.getY();
            this.f37777e = false;
        }
        this.f37778f.a(motionEvent);
        if (this.f37775b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f37774a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x8 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f37775b.getContentView().getLocationOnScreen(iArr);
            float f10 = x8 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f37779n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f37775b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
                Rect rect = this.f37776c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (rect.contains((int) f10, (int) f11)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.f37779n = childAt;
                    } else {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(false, false);
                        }
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f37780r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f37781s) > AndroidUtilities.touchSlop * 2.0f) {
            this.f37777e = true;
            this.f37774a.setPressed(false);
            this.f37774a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f37777e) {
            View view4 = this.f37779n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            }
            if (this.f37775b == null && (view2 = this.f37774a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
