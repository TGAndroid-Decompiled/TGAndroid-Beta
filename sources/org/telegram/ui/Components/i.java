package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f24824a;
    public final Object f24825b;
    public final Object f24826c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f24824a = i10;
        this.f24825b = obj;
        this.f24826c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        of ofVar;
        boolean z10;
        switch (this.f24824a) {
            case 0:
                return e0.X((e0) this.f24825b, (org.telegram.ui.ActionBar.e6) this.f24826c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24825b;
                MessageObject messageObject = (MessageObject) this.f24826c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.V3;
                if (messageObject.isMediaEmpty() || (ofVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(ofVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.bj0 bj0Var = new org.telegram.ui.bj0(chatActivityEnterView.getContext(), e6Var);
                bj0Var.f32186h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.g0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.g0(messageObject, true));
                }
                bj0Var.q(arrayList);
                n70 F = n70.F(chatActivityEnterView.l1, e6Var, chatActivityEnterView.E1);
                ub0 ub0Var = new ub0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                ub0Var.a(!chatActivityEnterView.Q4, false);
                ub0Var.setOnClickListener(new ai.p5(chatActivityEnterView, arrayList, ub0Var, bj0Var, 10));
                F.q(ub0Var);
                F.Y();
                bj0Var.p(F);
                bj0Var.r(chatActivityEnterView.E1, false, new ai.p5(chatActivityEnterView, groupedMessages, messageObject, bj0Var, 11));
                bj0Var.show();
                return true;
        }
    }
}
