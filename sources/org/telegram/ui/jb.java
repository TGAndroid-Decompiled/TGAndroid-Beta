package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class jb extends sb {
    public final ih.k f38221x0;
    public final vb f38222y0;

    public jb(vb vbVar, Context context) {
        super(vbVar, context);
        this.f38222y0 = vbVar;
        this.f38221x0 = new ih.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.wc0) {
            ((org.telegram.ui.Components.wc0) drawable).p();
        }
        ih.k kVar = this.f38221x0;
        gh.a c10 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c10));
        vb vbVar = this.f38222y0;
        vbVar.f42160a.f11063a = c10;
        kh.f fVar = vbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f4489a) {
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
            vb vbVar = this.f38222y0;
            if (dialogId == (-vbVar.f42168f.f20276id)) {
                MediaController.getInstance().setTextureView(vbVar.Q0(false), vbVar.f42167e0, vbVar.f42166d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        vb vbVar = this.f38222y0;
        gh.a aVar = vbVar.f42160a.f11063a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(vb.a0(vbVar), i10, 0, i11, 0);
        int measuredHeight = vb.b0(vbVar).getMeasuredHeight();
        if (vb.c0(vbVar).getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != vb.d0(vbVar)) {
                if (childAt != vbVar.v && childAt != vbVar.f42176n) {
                    if (childAt == vbVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (vbVar.e * 2), 1073741824));
                }
            }
        }
    }
}
