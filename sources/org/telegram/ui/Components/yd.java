package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class yd extends FrameLayout {

    public final ChatActivityEnterView f34883a;

    public yd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f34883a = chatActivityEnterView;
    }

    @Override
    public final boolean drawChild(final Canvas canvas, final View view, final long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f34883a;
        if (view != null && view == chatActivityEnterView.A0) {
            return chatActivityEnterView.f0(canvas, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                }
            });
        }
        if (chatActivityEnterView.f26187u4 && view == chatActivityEnterView.f26073a1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.f34883a;
        if (chatActivityEnterView.f26199x0.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Float f10 = (Float) chatActivityEnterView.f26199x0.get(childAt);
            if (f10 != null) {
                childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(er.f28122f).start();
            }
        }
        chatActivityEnterView.f26199x0.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.f34883a;
        ud.c cVar = chatActivityEnterView.f26075a5;
        if (cVar.f48502e > 0.0f) {
            cVar.a(iMax);
        } else {
            cVar.c(iMax);
        }
        chatActivityEnterView.N();
    }
}
