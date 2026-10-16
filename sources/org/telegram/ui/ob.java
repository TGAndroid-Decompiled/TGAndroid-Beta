package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class ob extends xb {
    public final ih.k f38596x0;
    public final ac f38597y0;

    public ob(ac acVar, Context context) {
        super(acVar, context);
        this.f38597y0 = acVar;
        this.f38596x0 = new ih.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.cd0) {
            ((org.telegram.ui.Components.cd0) drawable).p();
        }
        ih.k kVar = this.f38596x0;
        gh.a c10 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c10));
        ac acVar = this.f38597y0;
        acVar.f33834a.f10160a = c10;
        kh.f fVar = acVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f4122a) {
            w4 w4Var = (w4) c2.b.m().d;
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
            ac acVar = this.f38597y0;
            if (dialogId == (-acVar.f33842f.f18916id)) {
                MediaController.getInstance().setTextureView(acVar.Q0(false), acVar.f33841e0, acVar.f33840d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ac acVar = this.f38597y0;
        gh.a aVar = acVar.f33834a.f10160a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != acVar.v && childAt != acVar.f33850n) {
                        if (childAt == acVar.H) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (acVar.e * 2), 1073741824));
                    }
                }
            }
        }
    }
}
