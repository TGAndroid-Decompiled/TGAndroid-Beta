package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class lb extends ub {
    public final ih.k f38787x0;
    public final xb f38788y0;

    public lb(xb xbVar, Context context) {
        super(xbVar, context);
        this.f38788y0 = xbVar;
        this.f38787x0 = new ih.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.wc0) {
            ((org.telegram.ui.Components.wc0) drawable).p();
        }
        ih.k kVar = this.f38787x0;
        gh.a c10 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c10));
        xb xbVar = this.f38788y0;
        xbVar.f43026a.f11064a = c10;
        kh.f fVar = xbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f4493a) {
            x4 x4Var = (x4) c2.b.m().d;
            if (x4Var != null) {
                x4Var.onTouchEvent(motionEvent);
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
            xb xbVar = this.f38788y0;
            if (dialogId == (-xbVar.f43034f.f20272id)) {
                MediaController.getInstance().setTextureView(xbVar.Q0(false), xbVar.f43033e0, xbVar.f43032d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        xb xbVar = this.f38788y0;
        gh.a aVar = xbVar.f43026a.f11064a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(xb.a0(xbVar), i10, 0, i11, 0);
        int measuredHeight = xb.b0(xbVar).getMeasuredHeight();
        if (xb.c0(xbVar).getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != xb.d0(xbVar)) {
                if (childAt != xbVar.v && childAt != xbVar.f43042n) {
                    if (childAt == xbVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (xbVar.e * 2), 1073741824));
                }
            }
        }
    }
}
