package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class kb extends tb {
    public final jh.m m0;
    public final wb f40723n0;

    public kb(wb wbVar, Context context) {
        super(wbVar, context);
        this.f40723n0 = wbVar;
        this.m0 = new jh.m();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.vc0) {
            ((org.telegram.ui.Components.vc0) drawable).p();
        }
        jh.m mVar = this.m0;
        hh.a c10 = mVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(mVar.a(c10));
        wb wbVar = this.f40723n0;
        wbVar.f44586a.f12844a = c10;
        lh.f fVar = wbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f5929a) {
            v4 v4Var = (v4) c2.b.m().d;
            if (v4Var != null) {
                v4Var.onTouchEvent(motionEvent);
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
            wb wbVar = this.f40723n0;
            if (dialogId == (-wbVar.f44594f.f22028id)) {
                MediaController.getInstance().setTextureView(wbVar.R0(false), wbVar.f44593e0, wbVar.f44592d0, true);
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
        wb wbVar = this.f40723n0;
        hh.a aVar = wbVar.f44586a.f12844a;
        if (aVar instanceof hh.b) {
            ((hh.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(wb.b0(wbVar), i10, 0, i11, 0);
        int measuredHeight = wb.c0(wbVar).getMeasuredHeight();
        if (wb.d0(wbVar).getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != wb.e0(wbVar)) {
                if (childAt != wbVar.v && childAt != wbVar.f44602n) {
                    if (childAt == wbVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (wbVar.e * 2), 1073741824));
                }
            }
        }
    }
}
