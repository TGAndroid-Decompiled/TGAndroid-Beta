package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class b1 implements Runnable {
    public final int f18906a;
    public final t1 f18907b;

    public b1(int i10, t1 t1Var) {
        this.f18906a = i10;
        this.f18907b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f18906a) {
            case 0:
                this.f18907b.b3();
                return;
            case 1:
                t1 t1Var = this.f18907b;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.q(t1Var);
                    return;
                }
                return;
            case 2:
                this.f18907b.H3();
                return;
            case 3:
                t1 t1Var2 = this.f18907b;
                m.g3 g3Var = t1Var2.f20366w;
                g3Var.l(t1Var2.Qd);
                g3Var.l(t1Var2.Rd);
                t1Var2.H3();
                MessageObject messageObject = t1Var2.f20403y7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = t1Var2.f20403y7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    k1 k1Var2 = t1Var2.Jc;
                    if (k1Var2 != null) {
                        k1Var2.S(t1Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                t1 t1Var3 = this.f18907b;
                if (t1Var3.Q9 && !t1Var3.R9 && t1Var3.S9) {
                    t1Var3.R9 = true;
                    t1Var3.f20423zc.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 5:
                t1 t1Var4 = this.f18907b;
                t1Var4.f20423zc.setState(new int[0]);
                t1Var4.invalidate();
                return;
            case 6:
                t1 t1Var5 = this.f18907b;
                t1Var5.f20423zc.setState(new int[0]);
                t1Var5.invalidate();
                return;
            case 7:
                t1 t1Var6 = this.f18907b;
                int i10 = 0;
                t1Var6.f20389x7 = false;
                t1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = t1Var6.f20155h4;
                if (textLayoutBlocks != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = textLayoutBlocks.textLayoutBlocks;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        i11++;
                        textLayoutBlock.spoilers.clear();
                    }
                }
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = t1Var6.f20086c4;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = t1Var6.f20403y7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i10);
                            i10++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                t1Var6.invalidate();
                return;
            case 8:
                t1 t1Var7 = this.f18907b;
                t1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                t1Var7.Ld.clear();
                t1Var7.invalidate();
                return;
            case 9:
                t1 t1Var8 = this.f18907b;
                t1Var8.post(new b1(7, t1Var8));
                return;
            default:
                this.f18907b.a3();
                return;
        }
    }
}
