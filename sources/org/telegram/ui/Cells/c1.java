package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class c1 implements Runnable {
    public final int f22079a;
    public final u1 f22080b;

    public c1(int i10, u1 u1Var) {
        this.f22079a = i10;
        this.f22080b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f22079a) {
            case 0:
                this.f22080b.b3();
                return;
            case 1:
                u1 u1Var = this.f22080b;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.p(u1Var);
                    return;
                }
                return;
            case 2:
                this.f22080b.H3();
                return;
            case 3:
                u1 u1Var2 = this.f22080b;
                l2.f fVar = u1Var2.f23523w;
                fVar.t(u1Var2.Qd);
                fVar.t(u1Var2.Rd);
                u1Var2.H3();
                MessageObject messageObject = u1Var2.f23561y7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = u1Var2.f23561y7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    l1 l1Var2 = u1Var2.Jc;
                    if (l1Var2 != null) {
                        l1Var2.T(u1Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                u1 u1Var3 = this.f22080b;
                if (u1Var3.Q9 && !u1Var3.R9 && u1Var3.S9) {
                    u1Var3.R9 = true;
                    u1Var3.zc.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 5:
                u1 u1Var4 = this.f22080b;
                u1Var4.zc.setState(new int[0]);
                u1Var4.invalidate();
                return;
            case 6:
                u1 u1Var5 = this.f22080b;
                u1Var5.zc.setState(new int[0]);
                u1Var5.invalidate();
                return;
            case 7:
                u1 u1Var6 = this.f22080b;
                int i10 = 0;
                u1Var6.f23546x7 = false;
                u1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = u1Var6.f23314h4;
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
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = u1Var6.f23243c4;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = u1Var6.f23561y7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i10);
                            i10++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                u1Var6.invalidate();
                return;
            case 8:
                u1 u1Var7 = this.f22080b;
                u1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                u1Var7.Ld.clear();
                u1Var7.invalidate();
                return;
            case 9:
                u1 u1Var8 = this.f22080b;
                u1Var8.post(new c1(7, u1Var8));
                return;
            default:
                this.f22080b.a3();
                return;
        }
    }
}
