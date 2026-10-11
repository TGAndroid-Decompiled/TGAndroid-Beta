package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class ib extends rb {
    public final hh.k f38642x0;
    public final ub f38643y0;

    public ib(ub ubVar, Context context) {
        super(ubVar, context);
        this.f38643y0 = ubVar;
        this.f38642x0 = new hh.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.dd0) {
            ((org.telegram.ui.Components.dd0) drawable).p();
        }
        hh.k kVar = this.f38642x0;
        fh.a c10 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c10));
        ub ubVar = this.f38643y0;
        ubVar.f42468a.f9941a = c10;
        jh.f fVar = ubVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.f7949e;
        if (mVar != null && mVar.f7950a) {
            q4 q4Var = (q4) com.google.firebase.messaging.m.m().d;
            if (q4Var != null) {
                q4Var.onTouchEvent(motionEvent);
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
            ub ubVar = this.f38643y0;
            if (dialogId == (-ubVar.f42477f.f20032id)) {
                MediaController.getInstance().setTextureView(ubVar.Q0(false), ubVar.f42476e0, ubVar.f42474d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ib.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ub ubVar = this.f38643y0;
        fh.a aVar = ubVar.f42468a.f9941a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).b(size, size2);
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
                if (childAt != ubVar.v && childAt != ubVar.f42485n) {
                    if (childAt == ubVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (ubVar.f42475e * 2), 1073741824));
                }
            }
        }
    }
}
