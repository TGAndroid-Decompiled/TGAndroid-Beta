package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class j implements View.OnLongClickListener {
    public final int f27936a;
    public final Object f27937b;
    public final Object f27938c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f27936a = i10;
        this.f27937b = obj;
        this.f27938c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        ff ffVar;
        boolean z4;
        switch (this.f27936a) {
            case 0:
                return f0.X((f0) this.f27937b, (org.telegram.ui.ActionBar.g6) this.f27938c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27937b;
                MessageObject messageObject = (MessageObject) this.f27938c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = chatActivityEnterView.S3;
                if (messageObject.isMediaEmpty() || (ffVar = chatActivityEnterView.B0) == null || TextUtils.isEmpty(ffVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.ti0 ti0Var = new org.telegram.ui.ti0(chatActivityEnterView.getContext(), g6Var);
                ti0Var.f41632e0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        arrayList.add(chatActivityEnterView.g0(messageObject2, z4));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.g0(messageObject, true));
                }
                ti0Var.q(arrayList);
                q70 F = q70.F(chatActivityEnterView.f24621i1, g6Var, chatActivityEnterView.B1);
                xb0 xb0Var = new xb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.S3);
                xb0Var.a(!chatActivityEnterView.N4, false);
                xb0Var.setOnClickListener(new lh.u3(chatActivityEnterView, arrayList, xb0Var, ti0Var, 8));
                F.q(xb0Var);
                F.Y();
                ti0Var.p(F);
                ti0Var.r(chatActivityEnterView.B1, false, new lh.u3(chatActivityEnterView, groupedMessages, messageObject, ti0Var, 9));
                ti0Var.show();
                return true;
        }
    }
}
