package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class db extends mb {
    public final pg.j f37491t0;
    public final pb f37492u0;

    public db(pb pbVar, Context context) {
        super(pbVar, context);
        this.f37492u0 = pbVar;
        this.f37491t0 = new pg.j();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        pg.j jVar = this.f37491t0;
        ng.a c10 = jVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(jVar.a(c10));
        pb pbVar = this.f37492u0;
        pbVar.f41394a.f18609a = c10;
        rg.f fVar = pbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.f4156e;
        if (lVar != null && lVar.f4157a) {
            r4 r4Var = (r4) com.google.firebase.messaging.l.i().d;
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
            pb pbVar = this.f37492u0;
            if (dialogId == (-pbVar.f41418s.f22380id)) {
                MediaController.getInstance().setTextureView(pbVar.Q0(false), pbVar.f41402e0, pbVar.f41400d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.db.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        pb pbVar = this.f37492u0;
        pbVar.P0.a();
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        ng.a aVar = pbVar.f41394a.f18609a;
        if (aVar instanceof ng.b) {
            ((ng.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        measureChildWithMargins(kVar, i9, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != pbVar.A && childAt != pbVar.f41423w) {
                        if (childAt == pbVar.H) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i9, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i10)) + (pbVar.f41416r * 2), 1073741824));
                    }
                }
            }
        }
    }
}
