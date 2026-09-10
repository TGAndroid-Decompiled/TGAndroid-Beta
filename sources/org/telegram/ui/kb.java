package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class kb extends tb {
    public final gh.l f34324x0;
    public final wb f34325y0;

    public kb(wb wbVar, Context context) {
        super(wbVar, context);
        this.f34325y0 = wbVar;
        this.f34324x0 = new gh.l();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.lc0) {
            ((org.telegram.ui.Components.lc0) drawable).p();
        }
        gh.l lVar = this.f34324x0;
        eh.a c10 = lVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(lVar.a(c10));
        wb wbVar = this.f34325y0;
        wbVar.f37789a.f7525a = c10;
        ih.f fVar = wbVar.f37790a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
        if (mVar != null && mVar.f6100a) {
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
            wb wbVar = this.f34325y0;
            if (dialogId == (-wbVar.f37812s.f17195id)) {
                MediaController.getInstance().setTextureView(wbVar.Q0(false), wbVar.f37801i0, wbVar.f37800h0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        wb wbVar = this.f34325y0;
        wbVar.T0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        eh.a aVar = wbVar.f37789a.f7525a;
        if (aVar instanceof eh.b) {
            ((eh.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar4 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                if (childAt != lVar4) {
                    if (childAt != wbVar.E && childAt != wbVar.f37817w) {
                        if (childAt == wbVar.L) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (wbVar.f37810r * 2), 1073741824));
                    }
                }
            }
        }
    }
}
