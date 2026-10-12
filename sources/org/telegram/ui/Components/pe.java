package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pe extends FrameLayout {
    public final ChatActivityEnterView f29489a;

    public pe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f29489a = chatActivityEnterView;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f29489a;
        if (view != null && view == chatActivityEnterView.E0) {
            return chatActivityEnterView.g0(canvas, new oe(this, canvas, view, j3, 0));
        }
        if (chatActivityEnterView.f23636c5 && view == chatActivityEnterView.f23645e1) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.f29489a;
        if (!chatActivityEnterView.B0.isEmpty()) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                Float f7 = (Float) chatActivityEnterView.B0.get(childAt);
                if (f7 != null) {
                    childAt.setTranslationX(f7.floatValue() - childAt.getLeft());
                    childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(js.f27634f).start();
                }
            }
            chatActivityEnterView.B0.clear();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.f29489a;
        int i12 = max + chatActivityEnterView.f23683k3;
        me.e eVar = chatActivityEnterView.K5;
        if (eVar.f16096e > 0.0f) {
            eVar.a(i12);
        } else {
            eVar.c(i12);
        }
        chatActivityEnterView.O();
    }
}
