package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class b1 implements Runnable {
    public final int f24122a;
    public final t1 f24123b;

    public b1(int i9, t1 t1Var) {
        this.f24122a = i9;
        this.f24123b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f24122a) {
            case 0:
                this.f24123b.b3();
                return;
            case 1:
                t1 t1Var = this.f24123b;
                k1 k1Var = t1Var.Fc;
                if (k1Var != null) {
                    k1Var.v(t1Var);
                    return;
                }
                return;
            case 2:
                this.f24123b.H3();
                return;
            case 3:
                t1 t1Var2 = this.f24123b;
                i8.i0 i0Var = t1Var2.f25612w;
                i0Var.a(t1Var2.Md);
                i0Var.a(t1Var2.Nd);
                t1Var2.H3();
                MessageObject messageObject = t1Var2.f25593u7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = t1Var2.f25593u7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    k1 k1Var2 = t1Var2.Fc;
                    if (k1Var2 != null) {
                        k1Var2.a0(t1Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                t1 t1Var3 = this.f24123b;
                if (t1Var3.M9 && !t1Var3.N9 && t1Var3.O9) {
                    t1Var3.N9 = true;
                    t1Var3.f25610vc.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 5:
                t1 t1Var4 = this.f24123b;
                t1Var4.f25610vc.setState(new int[0]);
                t1Var4.invalidate();
                return;
            case 6:
                t1 t1Var5 = this.f24123b;
                t1Var5.f25610vc.setState(new int[0]);
                t1Var5.invalidate();
                return;
            case 7:
                t1 t1Var6 = this.f24123b;
                int i9 = 0;
                t1Var6.f25578t7 = false;
                t1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = t1Var6.f25347d4;
                if (textLayoutBlocks != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = textLayoutBlocks.textLayoutBlocks;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                        i10++;
                        textLayoutBlock.spoilers.clear();
                    }
                }
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = t1Var6.Y3;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i9 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i9);
                        i9++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = t1Var6.f25593u7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i9 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i9);
                            i9++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                t1Var6.invalidate();
                return;
            case 8:
                t1 t1Var7 = this.f24123b;
                t1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                t1Var7.Hd.clear();
                t1Var7.invalidate();
                return;
            case 9:
                t1 t1Var8 = this.f24123b;
                t1Var8.post(new b1(7, t1Var8));
                return;
            default:
                this.f24123b.a3();
                return;
        }
    }
}
