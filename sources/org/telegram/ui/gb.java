package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class gb extends pb {
    public final ug.j f34562u0;
    public final sb f34563v0;

    public gb(sb sbVar, Context context) {
        super(sbVar, context);
        this.f34563v0 = sbVar;
        this.f34562u0 = new ug.j();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.dc0) {
            ((org.telegram.ui.Components.dc0) drawable).p();
        }
        ug.j jVar = this.f34562u0;
        sg.a c3 = jVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(jVar.a(c3));
        sb sbVar = this.f34563v0;
        sbVar.f38250a.f44317a = c3;
        wg.f fVar = sbVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb.m mVar = cb.m.e;
        if (mVar != null && mVar.f2232a) {
            u4 u4Var = (u4) cb.m.l().d;
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
            sb sbVar = this.f34563v0;
            if (dialogId == (-sbVar.f38273s.f19184id)) {
                MediaController.getInstance().setTextureView(sbVar.Q0(false), sbVar.f38259f0, sbVar.f38257e0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        sb sbVar = this.f34563v0;
        sbVar.Q0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        sg.a aVar = sbVar.f38250a.f44317a;
        if (aVar instanceof sg.b) {
            ((sg.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != sbVar.B && childAt != sbVar.f38278w) {
                        if (childAt == sbVar.I) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (sbVar.f38271r * 2), 1073741824));
                    }
                }
            }
        }
    }
}
