package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class kb extends tb {
    public final hh.l f37921x0;
    public final wb f37922y0;

    public kb(wb wbVar, Context context) {
        super(wbVar, context);
        this.f37922y0 = wbVar;
        this.f37921x0 = new hh.l();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.pc0) {
            ((org.telegram.ui.Components.pc0) drawable).p();
        }
        hh.l lVar = this.f37921x0;
        fh.a c10 = lVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(lVar.a(c10));
        wb wbVar = this.f37922y0;
        wbVar.f42021a.f9867a = c10;
        jh.f fVar = wbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.f7901e;
        if (mVar != null && mVar.f7902a) {
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
            wb wbVar = this.f37922y0;
            if (dialogId == (-wbVar.f42030f.f20042id)) {
                MediaController.getInstance().setTextureView(wbVar.Q0(false), wbVar.f42029e0, wbVar.f42027d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        wb wbVar = this.f37922y0;
        fh.a aVar = wbVar.f42021a.f9867a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(wb.Z(wbVar), i10, 0, i11, 0);
        int measuredHeight = wb.b0(wbVar).getMeasuredHeight();
        if (wb.c0(wbVar).getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != wb.d0(wbVar)) {
                if (childAt != wbVar.v && childAt != wbVar.f42038n) {
                    if (childAt == wbVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (wbVar.f42028e * 2), 1073741824));
                }
            }
        }
    }
}
