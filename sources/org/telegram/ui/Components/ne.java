package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ne extends FrameLayout {
    public final ChatActivityEnterView f25502a;

    public ne(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f25502a = chatActivityEnterView;
    }

    @Override
    public final boolean drawChild(final Canvas canvas, final View view, final long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f25502a;
        if (view != null && view == chatActivityEnterView.E0) {
            return chatActivityEnterView.f0(canvas, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j3));
                    return valueOf;
                }
            });
        }
        if (chatActivityEnterView.f20957y4 && view == chatActivityEnterView.f20844e1) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.f25502a;
        if (!chatActivityEnterView.B0.isEmpty()) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                Float f7 = (Float) chatActivityEnterView.B0.get(childAt);
                if (f7 != null) {
                    childAt.setTranslationX(f7.floatValue() - childAt.getLeft());
                    childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(wr.f28819f).start();
                }
            }
            chatActivityEnterView.B0.clear();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.f25502a;
        le.e eVar = chatActivityEnterView.f20848e5;
        if (eVar.e > 0.0f) {
            eVar.a(max);
        } else {
            eVar.c(max);
        }
        chatActivityEnterView.N();
    }
}
