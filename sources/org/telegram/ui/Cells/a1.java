package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class a1 implements Runnable {
    public final int f20789a;
    public final s1 f20790b;

    public a1(int i10, s1 s1Var) {
        this.f20789a = i10;
        this.f20790b = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f20789a) {
            case 0:
                this.f20790b.b3();
                return;
            case 1:
                s1 s1Var = this.f20790b;
                j1 j1Var = s1Var.Gc;
                if (j1Var != null) {
                    j1Var.q(s1Var);
                    return;
                }
                return;
            case 2:
                this.f20790b.H3();
                return;
            case 3:
                s1 s1Var2 = this.f20790b;
                androidx.biometric.e0 e0Var = s1Var2.f22218w;
                e0Var.b(s1Var2.Nd);
                e0Var.b(s1Var2.Od);
                s1Var2.H3();
                MessageObject messageObject = s1Var2.f22210v7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = s1Var2.f22210v7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    j1 j1Var2 = s1Var2.Gc;
                    if (j1Var2 != null) {
                        j1Var2.U(s1Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                s1 s1Var3 = this.f20790b;
                if (s1Var3.N9 && !s1Var3.O9 && s1Var3.P9) {
                    s1Var3.O9 = true;
                    s1Var3.f22231wc.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 5:
                s1 s1Var4 = this.f20790b;
                s1Var4.f22231wc.setState(new int[0]);
                s1Var4.invalidate();
                return;
            case 6:
                s1 s1Var5 = this.f20790b;
                s1Var5.f22231wc.setState(new int[0]);
                s1Var5.invalidate();
                return;
            case 7:
                s1 s1Var6 = this.f20790b;
                int i10 = 0;
                s1Var6.f22195u7 = false;
                s1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var6.f21966e4;
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
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = s1Var6.Z3;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = s1Var6.f22210v7.textLayoutBlocks;
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
                s1 s1Var7 = this.f20790b;
                s1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                s1Var7.Id.clear();
                s1Var7.invalidate();
                return;
            case 9:
                s1 s1Var8 = this.f20790b;
                s1Var8.post(new a1(7, s1Var8));
                return;
            default:
                this.f20790b.a3();
                return;
        }
    }
}
