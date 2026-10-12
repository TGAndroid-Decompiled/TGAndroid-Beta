package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class mb extends vb {
    public final hh.k f39982x0;
    public final yb f39983y0;

    public mb(yb ybVar, Context context) {
        super(ybVar, context);
        this.f39983y0 = ybVar;
        this.f39982x0 = new hh.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.gd0) {
            ((org.telegram.ui.Components.gd0) drawable).p();
        }
        hh.k kVar = this.f39982x0;
        fh.a c10 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c10));
        yb ybVar = this.f39983y0;
        ybVar.f44405a.f9940a = c10;
        jh.f fVar = ybVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.f7946e;
        if (mVar != null && mVar.f7947a) {
            u4 u4Var = (u4) com.google.firebase.messaging.m.m().d;
            if (u4Var != null) {
                u4Var.onTouchEvent(motionEvent);
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
            yb ybVar = this.f39983y0;
            if (dialogId == (-ybVar.f44414f.f19802id)) {
                MediaController.getInstance().setTextureView(ybVar.Q0(false), ybVar.f44413e0, ybVar.f44411d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        yb ybVar = this.f39983y0;
        fh.a aVar = ybVar.f44405a.f9940a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(yb.a0(ybVar), i10, 0, i11, 0);
        int measuredHeight = yb.b0(ybVar).getMeasuredHeight();
        if (yb.c0(ybVar).getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != yb.d0(ybVar)) {
                if (childAt != ybVar.v && childAt != ybVar.f44422n) {
                    if (childAt == ybVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (ybVar.f44412e * 2), 1073741824));
                }
            }
        }
    }
}
