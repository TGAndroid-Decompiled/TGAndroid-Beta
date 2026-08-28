package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ce extends FrameLayout {
    public final ChatActivityEnterView f27471a;

    public ce(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f27471a = chatActivityEnterView;
    }

    @Override
    public final boolean drawChild(final Canvas canvas, final View view, final long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f27471a;
        if (view != null && view == chatActivityEnterView.A0) {
            return chatActivityEnterView.e0(canvas, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                    return valueOf;
                }
            });
        }
        if (chatActivityEnterView.f26191u4 && view == chatActivityEnterView.f26077a1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ChatActivityEnterView chatActivityEnterView = this.f27471a;
        if (!chatActivityEnterView.f26203x0.isEmpty()) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                Float f10 = (Float) chatActivityEnterView.f26203x0.get(childAt);
                if (f10 != null) {
                    childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                    childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(gr.f28844f).start();
                }
            }
            chatActivityEnterView.f26203x0.clear();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.f27471a;
        td.c cVar = chatActivityEnterView.f26079a5;
        if (cVar.f47780e > 0.0f) {
            cVar.a(max);
        } else {
            cVar.c(max);
        }
        chatActivityEnterView.M();
    }
}
