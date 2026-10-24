package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class jb extends sb {
    public final ih.m f38525x0;
    public final vb f38526y0;

    public jb(vb vbVar, Context context) {
        super(vbVar, context);
        this.f38526y0 = vbVar;
        this.f38525x0 = new ih.m();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.wc0) {
            ((org.telegram.ui.Components.wc0) drawable).p();
        }
        ih.m mVar = this.f38525x0;
        gh.a c10 = mVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(mVar.a(c10));
        vb vbVar = this.f38526y0;
        vbVar.f42646a.f11082a = c10;
        kh.f fVar = vbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f4493a) {
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
            vb vbVar = this.f38526y0;
            if (dialogId == (-vbVar.f42654f.f20344id)) {
                MediaController.getInstance().setTextureView(vbVar.Q0(false), vbVar.f42653e0, vbVar.f42652d0, true);
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
        vb vbVar = this.f38526y0;
        gh.a aVar = vbVar.f42646a.f11082a;
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
                if (childAt != vbVar.v && childAt != vbVar.f42662n) {
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
