package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sg extends j1.b {
    public final int[] f28108o;
    public final ChatActivityEnterView.RecordCircle f28109p;

    public sg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f28109p = recordCircle;
        this.f28108o = new int[2];
    }

    @Override
    public final int g(float f7, float f10) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f22055r4 && chatActivityEnterView.M1 != null) {
            if (chatActivityEnterView.S3.contains((int) f7, (int) f10)) {
                return 1;
            }
            if (chatActivityEnterView.R3.contains(f7, f10)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22011j1;
            if (slideTextView != null && (rect = slideTextView.J) != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22011j1;
                int[] iArr = this.f28108o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.M1.getLocationOnScreen(iArr);
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
        if (ChatActivityEnterView.this.f22055r4) {
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
            dVar.h(chatActivityEnterView.S3);
            dVar.o(LocaleController.getString("Send", R.string.Send));
        } else if (i10 == 2) {
            Rect rect2 = chatActivityEnterView.T3;
            RectF rectF = chatActivityEnterView.R3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.T3);
            dVar.o(LocaleController.getString(R.string.Stop));
        } else if (i10 == 3 && chatActivityEnterView.M1 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22011j1;
            if (slideTextView != null && (rect = slideTextView.J) != null) {
                Rect rect3 = AndroidUtilities.rectTmp2;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22011j1;
                int[] iArr = this.f28108o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.M1.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                dVar.h(rect3);
            }
            dVar.o(LocaleController.getString("Cancel", R.string.Cancel));
        }
    }
}
