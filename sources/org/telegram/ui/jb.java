package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class jb extends sb {
    public final hh.k f38894x0;
    public final vb f38895y0;

    public jb(vb vbVar, Context context) {
        super(vbVar, context);
        this.f38895y0 = vbVar;
        this.f38894x0 = new hh.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.cd0) {
            ((org.telegram.ui.Components.cd0) drawable).p();
        }
        hh.k kVar = this.f38894x0;
        fh.a c10 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c10));
        vb vbVar = this.f38895y0;
        vbVar.f42766a.f9942a = c10;
        jh.f fVar = vbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.f7950e;
        if (mVar != null && mVar.f7951a) {
            r4 r4Var = (r4) com.google.firebase.messaging.m.m().d;
            if (r4Var != null) {
                r4Var.onTouchEvent(motionEvent);
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
            vb vbVar = this.f38895y0;
            if (dialogId == (-vbVar.f42775f.f20038id)) {
                MediaController.getInstance().setTextureView(vbVar.Q0(false), vbVar.f42774e0, vbVar.f42772d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        vb vbVar = this.f38895y0;
        fh.a aVar = vbVar.f42766a.f9942a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.n2) vbVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) vbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.n2) vbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.n2) vbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != vbVar.v && childAt != vbVar.f42783n) {
                        if (childAt == vbVar.H) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (vbVar.f42773e * 2), 1073741824));
                    }
                }
            }
        }
    }
}
