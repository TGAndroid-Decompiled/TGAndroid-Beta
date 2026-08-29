package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fe extends FrameLayout {
    public final ChatActivityEnterView f28386a;

    public fe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f28386a = chatActivityEnterView;
    }

    @Override
    public final boolean drawChild(final Canvas canvas, final View view, final long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f28386a;
        if (view != null && view == chatActivityEnterView.A0) {
            return chatActivityEnterView.f0(canvas, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                    return valueOf;
                }
            });
        }
        if (chatActivityEnterView.f26202u4 && view == chatActivityEnterView.f26088a1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.f28386a;
        if (!chatActivityEnterView.f26215x0.isEmpty()) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                Float f9 = (Float) chatActivityEnterView.f26215x0.get(childAt);
                if (f9 != null) {
                    childAt.setTranslationX(f9.floatValue() - childAt.getLeft());
                    childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(jr.f29800f).start();
                }
            }
            chatActivityEnterView.f26215x0.clear();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.f28386a;
        vd.c cVar = chatActivityEnterView.f26091a5;
        if (cVar.f49510e > 0.0f) {
            cVar.a(max);
        } else {
            cVar.c(max);
        }
        chatActivityEnterView.M();
    }
}
