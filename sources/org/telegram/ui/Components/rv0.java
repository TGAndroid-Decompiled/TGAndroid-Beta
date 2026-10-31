package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rv0 implements org.telegram.messenger.q20 {
    public final int f30028a;
    public final int f30029b;

    public rv0(int i10, int i11) {
        this.f30028a = i11;
        this.f30029b = i10;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f30028a) {
            case 0:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                        i10++;
                        f5.g(this.f30029b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
            default:
                th.l lVar = (th.l) ((View) obj);
                lVar.invalidate();
                lVar.D.setTextColor(this.f30029b);
                return;
        }
    }
}
