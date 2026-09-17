package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class ib extends rb {
    public final ih.l f37312x0;
    public final ub f37313y0;

    public ib(ub ubVar, Context context) {
        super(ubVar, context);
        this.f37313y0 = ubVar;
        this.f37312x0 = new ih.l();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.dc0) {
            ((org.telegram.ui.Components.dc0) drawable).p();
        }
        ih.l lVar = this.f37312x0;
        gh.a c10 = lVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(lVar.a(c10));
        ub ubVar = this.f37313y0;
        ubVar.f41043a.f10689a = c10;
        kh.f fVar = ubVar.f41044a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.f6397e;
        if (mVar != null && mVar.f6398a) {
            s4 s4Var = (s4) com.google.firebase.messaging.m.k().d;
            if (s4Var != null) {
                s4Var.onTouchEvent(motionEvent);
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
            ub ubVar = this.f37313y0;
            if (dialogId == (-ubVar.f41067s.f19896id)) {
                MediaController.getInstance().setTextureView(ubVar.Q0(false), ubVar.f41056i0, ubVar.f41055h0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ib.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ub ubVar = this.f37313y0;
        ubVar.T0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        gh.a aVar = ubVar.f41043a.f10689a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(ub.a0(ubVar), i10, 0, i11, 0);
        int measuredHeight = ub.b0(ubVar).getMeasuredHeight();
        if (ub.c0(ubVar).getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != ub.d0(ubVar)) {
                if (childAt != ubVar.E && childAt != ubVar.f41072w) {
                    if (childAt == ubVar.L) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (ubVar.f41065r * 2), 1073741824));
                }
            }
        }
    }
}
