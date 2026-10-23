package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f27077a;
    public final Object f27078b;
    public final Object f27079c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f27077a = i10;
        this.f27078b = obj;
        this.f27079c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        pf pfVar;
        boolean z10;
        switch (this.f27077a) {
            case 0:
                return e0.X((e0) this.f27078b, (org.telegram.ui.ActionBar.g6) this.f27079c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27078b;
                MessageObject messageObject = (MessageObject) this.f27079c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = chatActivityEnterView.W3;
                if (messageObject.isMediaEmpty() || (pfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(pfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.qi0 qi0Var = new org.telegram.ui.qi0(chatActivityEnterView.getContext(), g6Var);
                qi0Var.f40828g0 = true;
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
                qi0Var.p(arrayList);
                j80 F = j80.F(chatActivityEnterView.f24124m1, g6Var, chatActivityEnterView.F1);
                qc0 qc0Var = new qc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                qc0Var.a(!chatActivityEnterView.R4, false);
                qc0Var.setOnClickListener(new ci.b4(chatActivityEnterView, arrayList, qc0Var, qi0Var, 10));
                F.q(qc0Var);
                F.Y();
                qi0Var.o(F);
                qi0Var.q(chatActivityEnterView.F1, false, new ci.b4(chatActivityEnterView, groupedMessages, messageObject, qi0Var, 11));
                qi0Var.show();
                return true;
        }
    }
}
