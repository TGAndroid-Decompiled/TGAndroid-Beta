package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f24830a;
    public final Object f24831b;
    public final Object f24832c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f24830a = i10;
        this.f24831b = obj;
        this.f24832c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        of ofVar;
        boolean z10;
        switch (this.f24830a) {
            case 0:
                return e0.X((e0) this.f24831b, (org.telegram.ui.ActionBar.e6) this.f24832c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24831b;
                MessageObject messageObject = (MessageObject) this.f24832c;
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
                bj0Var.f32184h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.h0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.h0(messageObject, true));
                }
                bj0Var.q(arrayList);
                n70 F = n70.F(chatActivityEnterView.l1, e6Var, chatActivityEnterView.E1);
                ub0 ub0Var = new ub0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                ub0Var.a(!chatActivityEnterView.R4, false);
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
