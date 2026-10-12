package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xg extends j1.b {
    public final int[] f32746o;
    public final ChatActivityEnterView.RecordCircle f32747p;

    public xg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f32747p = recordCircle;
        this.f32746o = new int[2];
    }

    @Override
    public final int g(float f7, float f10) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.V4 && chatActivityEnterView.N1 != null) {
            if (chatActivityEnterView.f23756w4.contains((int) f7, (int) f10)) {
                return 1;
            }
            if (chatActivityEnterView.f23743u4.contains(f7, f10)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23681k1;
            if (slideTextView != null && (rect = slideTextView.K) != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23681k1;
                int[] iArr = this.f32746o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.N1.getLocationOnScreen(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
                if (rectF.contains(f7, f10)) {
                    return 3;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.V4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i10 == 1) {
            dVar.h(chatActivityEnterView.f23756w4);
            dVar.p(LocaleController.getString("Send", R.string.Send));
        } else if (i10 == 2) {
            Rect rect2 = chatActivityEnterView.f23763x4;
            RectF rectF = chatActivityEnterView.f23743u4;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.f23763x4);
            dVar.p(LocaleController.getString(R.string.Stop));
        } else if (i10 == 3 && chatActivityEnterView.N1 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23681k1;
            if (slideTextView != null && (rect = slideTextView.K) != null) {
                Rect rect3 = AndroidUtilities.rectTmp2;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23681k1;
                int[] iArr = this.f32746o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.N1.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                dVar.h(rect3);
            }
            dVar.p(LocaleController.getString("Cancel", R.string.Cancel));
        }
    }
}
