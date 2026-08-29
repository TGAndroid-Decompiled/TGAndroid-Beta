package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class cb extends lb {
    public final sg.k f37068t0;
    public final ob f37069u0;

    public cb(ob obVar, Context context) {
        super(obVar, context);
        this.f37069u0 = obVar;
        this.f37068t0 = new sg.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.yb0) {
            ((org.telegram.ui.Components.yb0) drawable).p();
        }
        sg.k kVar = this.f37068t0;
        qg.a c3 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c3));
        ob obVar = this.f37069u0;
        obVar.f41042a.f46676a = c3;
        ug.f fVar = obVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab.m mVar = ab.m.f323e;
        if (mVar != null && mVar.f324a) {
            s4 s4Var = (s4) ab.m.i().d;
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
            ob obVar = this.f37069u0;
            if (dialogId == (-obVar.f41066s.f22392id)) {
                MediaController.getInstance().setTextureView(obVar.Q0(false), obVar.f41050e0, obVar.f41048d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        ob obVar = this.f37069u0;
        obVar.P0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        qg.a aVar = obVar.f41042a.f46676a;
        if (aVar instanceof qg.b) {
            ((qg.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar4 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                if (childAt != lVar4) {
                    if (childAt != obVar.A && childAt != obVar.f41071w) {
                        if (childAt == obVar.H) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (obVar.f41064r * 2), 1073741824));
                    }
                }
            }
        }
    }
}
