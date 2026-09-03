package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ce extends FrameLayout {
    public final ChatActivityEnterView f25912a;

    public ce(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f25912a = chatActivityEnterView;
    }

    @Override
    public final boolean drawChild(final Canvas canvas, final View view, final long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f25912a;
        if (view != null && view == chatActivityEnterView.B0) {
            return chatActivityEnterView.f0(canvas, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                    return valueOf;
                }
            });
        }
        if (chatActivityEnterView.f24693v4 && view == chatActivityEnterView.f24579b1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.f25912a;
        if (!chatActivityEnterView.f24707y0.isEmpty()) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                Float f10 = (Float) chatActivityEnterView.f24707y0.get(childAt);
                if (f10 != null) {
                    childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                    childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(pr.f30168f).start();
                }
            }
            chatActivityEnterView.f24707y0.clear();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.f25912a;
        xd.c cVar = chatActivityEnterView.f24583b5;
        if (cVar.f50546e > 0.0f) {
            cVar.a(max);
        } else {
            cVar.c(max);
        }
        chatActivityEnterView.N();
    }
}
