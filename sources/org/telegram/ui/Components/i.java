package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f26984a;
    public final Object f26985b;
    public final Object f26986c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f26984a = i10;
        this.f26985b = obj;
        this.f26986c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        uf ufVar;
        boolean z10;
        switch (this.f26984a) {
            case 0:
                return e0.Y((e0) this.f26985b, (org.telegram.ui.ActionBar.c6) this.f26986c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26985b;
                MessageObject messageObject = (MessageObject) this.f26986c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = chatActivityEnterView.f23775z4;
                if (messageObject.isMediaEmpty() || (ufVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(ufVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.ej0 ej0Var = new org.telegram.ui.ej0(chatActivityEnterView.getContext(), c6Var);
                ej0Var.f37142h0 = true;
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
                ej0Var.q(arrayList);
                s80 F = s80.F(chatActivityEnterView.f23690m1, c6Var, chatActivityEnterView.F1);
                yc0 yc0Var = new yc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.f23775z4);
                yc0Var.a(!chatActivityEnterView.f23744u5, false);
                yc0Var.setOnClickListener(new ai.p5(chatActivityEnterView, arrayList, yc0Var, ej0Var, 10));
                F.q(yc0Var);
                F.Y();
                ej0Var.p(F);
                ej0Var.r(chatActivityEnterView.F1, false, new ai.p5(chatActivityEnterView, groupedMessages, messageObject, ej0Var, 11));
                ej0Var.show();
                return true;
        }
    }
}
