package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class i implements View.OnLongClickListener {

    public final int f29188a;

    public final Object f29189b;

    public final Object f29190c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f29188a = i10;
        this.f29189b = obj;
        this.f29190c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        bf bfVar;
        switch (this.f29188a) {
            case 0:
                return e0.X((e0) this.f29189b, (org.telegram.ui.ActionBar.c6) this.f29190c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29189b;
                MessageObject messageObject = (MessageObject) this.f29190c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = chatActivityEnterView.R3;
                if (messageObject.isMediaEmpty() || (bfVar = chatActivityEnterView.A0) == null || TextUtils.isEmpty(bfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.ni0 ni0Var = new org.telegram.ui.ni0(chatActivityEnterView.getContext(), c6Var);
                ni0Var.f40846d0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    int i11 = 0;
                    while (i11 < groupedMessages.messages.size()) {
                        arrayList.add(chatActivityEnterView.g0(groupedMessages.messages.get(i11), i11 == 0));
                        i11++;
                    }
                } else {
                    arrayList.add(chatActivityEnterView.g0(messageObject, true));
                }
                ni0Var.q(arrayList);
                b70 b70VarF = b70.F(chatActivityEnterView.f26117h1, c6Var, chatActivityEnterView.A1);
                fb0 fb0Var = new fb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.R3);
                fb0Var.a(!chatActivityEnterView.M4, false);
                fb0Var.setOnClickListener(new gh.a4(chatActivityEnterView, arrayList, fb0Var, ni0Var, 11));
                b70VarF.q(fb0Var);
                b70VarF.Y();
                ni0Var.p(b70VarF);
                ni0Var.r(chatActivityEnterView.A1, false, new gh.a4(chatActivityEnterView, groupedMessages, messageObject, ni0Var, 12));
                ni0Var.show();
                return true;
        }
    }
}
