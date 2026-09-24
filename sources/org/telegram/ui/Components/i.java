package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f24865a;
    public final Object f24866b;
    public final Object f24867c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f24865a = i10;
        this.f24866b = obj;
        this.f24867c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        qf qfVar;
        boolean z10;
        switch (this.f24865a) {
            case 0:
                return e0.X((e0) this.f24866b, (org.telegram.ui.ActionBar.d6) this.f24867c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24866b;
                MessageObject messageObject = (MessageObject) this.f24867c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView.W3;
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
                org.telegram.ui.vi0 vi0Var = new org.telegram.ui.vi0(chatActivityEnterView.getContext(), d6Var);
                vi0Var.f38721h0 = true;
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
                vi0Var.q(arrayList);
                y70 F = y70.F(chatActivityEnterView.f22011m1, d6Var, chatActivityEnterView.F1);
                ec0 ec0Var = new ec0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                ec0Var.a(!chatActivityEnterView.R4, false);
                ec0Var.setOnClickListener(new ai.o5(chatActivityEnterView, arrayList, ec0Var, vi0Var, 10));
                F.q(ec0Var);
                F.Y();
                vi0Var.p(F);
                vi0Var.r(chatActivityEnterView.F1, false, new ai.o5(chatActivityEnterView, groupedMessages, messageObject, vi0Var, 11));
                vi0Var.show();
                return true;
        }
    }
}
