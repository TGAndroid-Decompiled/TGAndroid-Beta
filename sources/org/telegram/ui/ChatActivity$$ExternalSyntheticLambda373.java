package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class ChatActivity$$ExternalSyntheticLambda373 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final int f$1;
    public final ChatActivity$$ExternalSyntheticLambda372 f$10;
    public final ArrayList f$2;
    public final String f$3;
    public final String f$4;
    public final Serializable f$5;
    public final TLRPC.InputPeer f$6;
    public final int[] f$7;
    public final Object f$8;
    public final boolean f$9;

    public ChatActivity$$ExternalSyntheticLambda373(ChatActivity chatActivity, int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z, ChatActivity$$ExternalSyntheticLambda372 chatActivity$$ExternalSyntheticLambda372, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = str3;
        this.f$6 = inputPeer;
        this.f$7 = iArr;
        this.f$8 = obj;
        this.f$9 = z;
        this.f$10 = chatActivity$$ExternalSyntheticLambda372;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity$$ExternalSyntheticLambda372 chatActivity$$ExternalSyntheticLambda372 = this.f$10;
                this.f$0.lambda$createMenu$288(this.f$1, this.f$2, this.f$3, this.f$4, (String) this.f$5, this.f$6, this.f$7, (TL_iv.RichMessage) this.f$8, this.f$9, chatActivity$$ExternalSyntheticLambda372, view);
                break;
            case 1:
                ChatActivity$$ExternalSyntheticLambda372 chatActivity$$ExternalSyntheticLambda373 = this.f$10;
                this.f$0.lambda$createMenu$290(this.f$1, this.f$2, this.f$3, this.f$4, (String) this.f$5, this.f$6, this.f$7, (CharSequence) this.f$8, this.f$9, chatActivity$$ExternalSyntheticLambda373, view);
                break;
            default:
                ChatActivity$$ExternalSyntheticLambda372 chatActivity$$ExternalSyntheticLambda374 = this.f$10;
                this.f$0.lambda$createMenu$294(this.f$1, this.f$2, (String[]) this.f$5, this.f$3, this.f$4, this.f$6, this.f$7, (CharSequence) this.f$8, this.f$9, chatActivity$$ExternalSyntheticLambda374, view);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda373(ChatActivity chatActivity, int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, ChatActivity$$ExternalSyntheticLambda372 chatActivity$$ExternalSyntheticLambda372) {
        this.$r8$classId = 2;
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$5 = strArr;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$6 = inputPeer;
        this.f$7 = iArr;
        this.f$8 = charSequence;
        this.f$9 = z;
        this.f$10 = chatActivity$$ExternalSyntheticLambda372;
    }
}
