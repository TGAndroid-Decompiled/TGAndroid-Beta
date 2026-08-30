package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class j implements View.OnLongClickListener {
    public final int f25807a;
    public final Object f25808b;
    public final Object f25809c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f25807a = i10;
        this.f25808b = obj;
        this.f25809c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        ff ffVar;
        boolean z4;
        switch (this.f25807a) {
            case 0:
                return f0.X((f0) this.f25808b, (org.telegram.ui.ActionBar.f6) this.f25809c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25808b;
                MessageObject messageObject = (MessageObject) this.f25809c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = chatActivityEnterView.S3;
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
                org.telegram.ui.si0 si0Var = new org.telegram.ui.si0(chatActivityEnterView.getContext(), f6Var);
                si0Var.f38357e0 = true;
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
                si0Var.q(arrayList);
                o70 F = o70.F(chatActivityEnterView.f22781i1, f6Var, chatActivityEnterView.B1);
                vb0 vb0Var = new vb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.S3);
                vb0Var.a(!chatActivityEnterView.N4, false);
                vb0Var.setOnClickListener(new kh.u3(chatActivityEnterView, arrayList, vb0Var, si0Var, 8));
                F.q(vb0Var);
                F.Y();
                si0Var.p(F);
                si0Var.r(chatActivityEnterView.B1, false, new kh.u3(chatActivityEnterView, groupedMessages, messageObject, si0Var, 9));
                si0Var.show();
                return true;
        }
    }
}
