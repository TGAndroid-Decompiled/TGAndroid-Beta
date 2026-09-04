package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class j implements View.OnLongClickListener {
    public final int f27288a;
    public final Object f27289b;
    public final Object f27290c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f27288a = i10;
        this.f27289b = obj;
        this.f27290c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        qf qfVar;
        boolean z10;
        switch (this.f27288a) {
            case 0:
                return f0.X((f0) this.f27289b, (org.telegram.ui.ActionBar.f6) this.f27290c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27289b;
                MessageObject messageObject = (MessageObject) this.f27290c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = chatActivityEnterView.V3;
                if (messageObject.isMediaEmpty() || (qfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(qfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.cj0 cj0Var = new org.telegram.ui.cj0(chatActivityEnterView.getContext(), f6Var);
                cj0Var.f35139h0 = true;
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
                cj0Var.q(arrayList);
                n70 F = n70.F(chatActivityEnterView.l1, f6Var, chatActivityEnterView.E1);
                vb0 vb0Var = new vb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                vb0Var.a(!chatActivityEnterView.Q4, false);
                vb0Var.setOnClickListener(new bi.z4(chatActivityEnterView, arrayList, vb0Var, cj0Var, 10));
                F.q(vb0Var);
                F.Y();
                cj0Var.p(F);
                cj0Var.r(chatActivityEnterView.E1, false, new bi.z4(chatActivityEnterView, groupedMessages, messageObject, cj0Var, 11));
                cj0Var.show();
                return true;
        }
    }
}
