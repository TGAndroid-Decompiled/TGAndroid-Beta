package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a9 extends org.telegram.ui.Components.vw0 {
    public final int f37673l0;
    public final Object m0;

    public a9(Object obj, Context context, int i10) {
        super(context, null);
        this.f37673l0 = i10;
        this.m0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f37673l0) {
            case 2:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public boolean P() {
        switch (this.f37673l0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37673l0) {
            case 7:
                d81 d81Var = (d81) this.m0;
                d81Var.o0();
                super.dispatchDraw(canvas);
                d81.g0(d81Var).g();
                if (!d81Var.N) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, d81Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6), d81Var.f38763c0);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f37673l0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.hc0) this.m0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f37673l0) {
            case 1:
                Drawable l4 = ((sn) ((org.telegram.ui.Components.hc0) this.m0).f28919c0.F).l();
                if (l4 == null) {
                    return super.getNewDrawable();
                }
                return l4;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
        switch (this.f37673l0) {
            case 2:
                return ((org.telegram.ui.Components.i11) this.m0).f29144c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a9.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f37673l0) {
            case 0:
                ((o9) this.m0).d0();
                super.onMeasure(i10, i11);
                return;
            case 1:
            case 7:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.i11) this.m0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.m0;
                r5Var = ((org.telegram.ui.ActionBar.r2) contactsActivity).simpleActionBar;
                measureChildWithMargins(r5Var, i10, 0, i11, 0);
                r5Var2 = ((org.telegram.ui.ActionBar.r2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f35459c.getLayoutParams()).topMargin = r5Var2.getMeasuredHeight();
                super.onMeasure(i10, i11);
                return;
            case 4:
                db0 db0Var = (db0) this.m0;
                super.onMeasure(i10, i11);
                Q();
                int i17 = this.f34283f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    db0Var.F.clearFocus();
                    db0Var.K.clearFocus();
                }
                FrameLayout frameLayout = db0Var.H;
                if (this.f34283f > AndroidUtilities.dp(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 5:
                gg0 gg0Var = (gg0) this.m0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gg0Var.N.getLayoutParams();
                int i18 = 0;
                if (gg0Var.m1()) {
                    i13 = AndroidUtilities.dp(226.0f);
                } else {
                    i13 = 0;
                }
                if (gg0Var.m1() && Q() > AndroidUtilities.dp(20.0f)) {
                    i13 -= Q();
                }
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31882x;
                if (qcVar != null && qcVar.f31892m) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = d3.w(10.0f, org.telegram.ui.Components.qc.f31882x.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i13;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) gg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) gg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) gg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = gg0Var.f39660f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (Q() > AndroidUtilities.dp(20.0f) && gg0Var.f39655c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !gg0Var.f39652a0) {
                    ValueAnimator valueAnimator = gg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gg0Var.f39655c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.m0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (Q() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f35856b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f35856b.r0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f35856b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 8:
                zh.h4 h4Var = (zh.h4) this.m0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h4Var.f53036y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i21 = 0;
                if (zh.h4.a0(h4Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i14;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (zh.h4.b0(h4Var).getOccupyStatusBar()) {
                    i15 = AndroidUtilities.statusBarHeight;
                } else {
                    i15 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i15;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h4Var.f53031n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (zh.h4.c0(h4Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h4Var.f53034w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (zh.h4.d0(h4Var).getOccupyStatusBar()) {
                    i21 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i21;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void updateColors() {
        switch (this.f37673l0) {
            case 7:
                try {
                    ((d81) this.m0).p0();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                return;
        }
    }
}
