package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f29248a;
    public final Object f29249b;
    public final Object f29250c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i9) {
        this.f29248a = i9;
        this.f29249b = obj;
        this.f29250c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        ff ffVar;
        boolean z10;
        switch (this.f29248a) {
            case 0:
                return e0.W((e0) this.f29249b, (org.telegram.ui.ActionBar.b6) this.f29250c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29249b;
                MessageObject messageObject = (MessageObject) this.f29250c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = chatActivityEnterView.R3;
                if (messageObject.isMediaEmpty() || (ffVar = chatActivityEnterView.A0) == null || TextUtils.isEmpty(ffVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i9 = messageObject.type;
                if (i9 != 1 && i9 != 3 && i9 != 8) {
                    return false;
                }
                org.telegram.ui.li0 li0Var = new org.telegram.ui.li0(chatActivityEnterView.getContext(), b6Var);
                li0Var.f40153d0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i10 = 0; i10 < groupedMessages.messages.size(); i10++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i10);
                        if (i10 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.f0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.f0(messageObject, true));
                }
                li0Var.q(arrayList);
                x60 F = x60.F(chatActivityEnterView.f26121h1, b6Var, chatActivityEnterView.A1);
                bb0 bb0Var = new bb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.R3);
                bb0Var.a(!chatActivityEnterView.M4, false);
                bb0Var.setOnClickListener(new fh.g4(chatActivityEnterView, arrayList, bb0Var, li0Var, 11));
                F.q(bb0Var);
                F.Y();
                li0Var.p(F);
                li0Var.r(chatActivityEnterView.A1, false, new fh.g4(chatActivityEnterView, groupedMessages, messageObject, li0Var, 12));
                li0Var.show();
                return true;
        }
    }
}
