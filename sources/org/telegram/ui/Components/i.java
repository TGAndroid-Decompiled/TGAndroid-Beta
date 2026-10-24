package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f27209a;
    public final Object f27210b;
    public final Object f27211c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f27209a = i10;
        this.f27210b = obj;
        this.f27211c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        nf nfVar;
        boolean z10;
        switch (this.f27209a) {
            case 0:
                return e0.X((e0) this.f27210b, (org.telegram.ui.ActionBar.g6) this.f27211c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27210b;
                MessageObject messageObject = (MessageObject) this.f27211c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = chatActivityEnterView.W3;
                if (messageObject.isMediaEmpty() || (nfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(nfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.pi0 pi0Var = new org.telegram.ui.pi0(chatActivityEnterView.getContext(), g6Var);
                pi0Var.f40559g0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.d0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.d0(messageObject, true));
                }
                pi0Var.p(arrayList);
                h80 F = h80.F(chatActivityEnterView.f24125m1, g6Var, chatActivityEnterView.F1);
                oc0 oc0Var = new oc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                oc0Var.a(!chatActivityEnterView.R4, false);
                oc0Var.setOnClickListener(new ci.b4(chatActivityEnterView, arrayList, oc0Var, pi0Var, 10));
                F.q(oc0Var);
                F.Y();
                pi0Var.o(F);
                pi0Var.q(chatActivityEnterView.F1, false, new ci.b4(chatActivityEnterView, groupedMessages, messageObject, pi0Var, 11));
                pi0Var.show();
                return true;
        }
    }
}
