package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class a1 implements Runnable {
    public final int f23841a;
    public final s1 f23842b;

    public a1(int i10, s1 s1Var) {
        this.f23841a = i10;
        this.f23842b = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f23841a) {
            case 0:
                this.f23842b.b3();
                return;
            case 1:
                s1 s1Var = this.f23842b;
                j1 j1Var = s1Var.Jc;
                if (j1Var != null) {
                    j1Var.p(s1Var);
                    return;
                }
                return;
            case 2:
                this.f23842b.J3();
                return;
            case 3:
                s1 s1Var2 = this.f23842b;
                i2.c cVar = s1Var2.f25329w;
                cVar.a(s1Var2.Qd);
                cVar.a(s1Var2.Rd);
                s1Var2.J3();
                MessageObject messageObject = s1Var2.f25367y7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = s1Var2.f25367y7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    j1 j1Var2 = s1Var2.Jc;
                    if (j1Var2 != null) {
                        j1Var2.Q(s1Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                s1 s1Var3 = this.f23842b;
                if (s1Var3.Q9 && !s1Var3.R9 && s1Var3.S9) {
                    s1Var3.R9 = true;
                    s1Var3.zc.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 5:
                s1 s1Var4 = this.f23842b;
                s1Var4.zc.setState(new int[0]);
                s1Var4.invalidate();
                return;
            case 6:
                s1 s1Var5 = this.f23842b;
                s1Var5.zc.setState(new int[0]);
                s1Var5.invalidate();
                return;
            case 7:
                s1 s1Var6 = this.f23842b;
                int i10 = 0;
                s1Var6.f25353x7 = false;
                s1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var6.f25119h4;
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
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = s1Var6.f25048c4;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = s1Var6.f25367y7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i10);
                            i10++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                s1Var6.invalidate();
                return;
            case 8:
                s1 s1Var7 = this.f23842b;
                s1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                s1Var7.Ld.clear();
                s1Var7.invalidate();
                return;
            case 9:
                s1 s1Var8 = this.f23842b;
                s1Var8.post(new a1(7, s1Var8));
                return;
            default:
                this.f23842b.a3();
                return;
        }
    }
}
