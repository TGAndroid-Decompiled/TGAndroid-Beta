package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class j implements View.OnLongClickListener {
    public final int f29507a;
    public final Object f29508b;
    public final Object f29509c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f29507a = i10;
        this.f29508b = obj;
        this.f29509c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        jf jfVar;
        boolean z10;
        switch (this.f29507a) {
            case 0:
                return g0.X((g0) this.f29508b, (org.telegram.ui.ActionBar.c6) this.f29509c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29508b;
                MessageObject messageObject = (MessageObject) this.f29509c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = chatActivityEnterView.R3;
                if (messageObject.isMediaEmpty() || (jfVar = chatActivityEnterView.A0) == null || TextUtils.isEmpty(jfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.ki0 ki0Var = new org.telegram.ui.ki0(chatActivityEnterView.getContext(), c6Var);
                ki0Var.f39878d0 = true;
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
                ki0Var.q(arrayList);
                j70 F = j70.F(chatActivityEnterView.f26132h1, c6Var, chatActivityEnterView.A1);
                qb0 qb0Var = new qb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.R3);
                qb0Var.a(!chatActivityEnterView.M4, false);
                qb0Var.setOnClickListener(new ih.u3(chatActivityEnterView, arrayList, qb0Var, ki0Var, 8));
                F.q(qb0Var);
                F.Y();
                ki0Var.p(F);
                ki0Var.r(chatActivityEnterView.A1, false, new ih.u3(chatActivityEnterView, groupedMessages, messageObject, ki0Var, 9));
                ki0Var.show();
                return true;
        }
    }
}
