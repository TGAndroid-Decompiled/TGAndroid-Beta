package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class ib extends rb {
    public final ug.j f34889u0;
    public final ub f34890v0;

    public ib(ub ubVar, Context context) {
        super(ubVar, context);
        this.f34890v0 = ubVar;
        this.f34889u0 = new ug.j();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.ec0) {
            ((org.telegram.ui.Components.ec0) drawable).p();
        }
        ug.j jVar = this.f34889u0;
        sg.a c3 = jVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(jVar.a(c3));
        ub ubVar = this.f34890v0;
        ubVar.f38729a.f44382a = c3;
        wg.f fVar = ubVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb.m mVar = cb.m.e;
        if (mVar != null && mVar.f2255a) {
            w4 w4Var = (w4) cb.m.l().d;
            if (w4Var != null) {
                w4Var.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && playingMessageObject.eventId != 0) {
            long dialogId = playingMessageObject.getDialogId();
            ub ubVar = this.f34890v0;
            if (dialogId == (-ubVar.f38752s.f19159id)) {
                MediaController.getInstance().setTextureView(ubVar.Q0(false), ubVar.f38738f0, ubVar.f38736e0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ib.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        ub ubVar = this.f34890v0;
        ubVar.Q0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        sg.a aVar = ubVar.f38729a.f44382a;
        if (aVar instanceof sg.b) {
            ((sg.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.p2) ubVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) ubVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.p2) ubVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.p2) ubVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != ubVar.B && childAt != ubVar.f38757w) {
                        if (childAt == ubVar.I) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (ubVar.f38750r * 2), 1073741824));
                    }
                }
            }
        }
    }
}
