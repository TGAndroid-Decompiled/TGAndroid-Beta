package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class pb0 extends f2.o0 {
    public final qb0 f27810c;

    public pb0(qb0 qb0Var) {
        this.f27810c = qb0Var;
    }

    public static int D(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z4) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (t1Var != null) {
            org.telegram.ui.Cells.s1 s1Var = t1Var.Wc;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = t1Var.Z3) != null) {
                    i11 = (int) t1Var.f22158n4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    t1Var.u3(true);
                    int i12 = t1Var.f22168o0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (t1Var.f22198q1) {
                        i11 = org.telegram.messenger.y3.C(10.0f, t1Var.f22099j2, i12);
                    } else {
                        i11 = i12;
                    }
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                }
                if (arrayList != null && charSequence != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i13);
                        StaticLayout staticLayout = textLayoutBlock.textLayout;
                        String charSequence3 = staticLayout.getText().toString();
                        int i14 = textLayoutBlock.charactersOffset;
                        if (i10 > i14) {
                            if (i10 - i14 > charSequence3.length() - 1) {
                                textYOffset = i11 + ((int) (textLayoutBlock.textYOffset(arrayList, s1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                if (z4) {
                                    lineTop = staticLayout.getLineBottom(lineForOffset);
                                } else {
                                    lineTop = staticLayout.getLineTop(lineForOffset);
                                }
                                textYOffset = lineTop + textLayoutBlock.textYOffset(arrayList, s1Var) + i11 + textLayoutBlock.padTop;
                            }
                            return (int) textYOffset;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public final int h() {
        MessagePreviewParams.Messages messages = this.f27810c.f28107r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        qb0 qb0Var = this.f27810c;
        ib0 ib0Var = qb0Var.f28105f;
        int i12 = qb0Var.f28102a;
        MessagePreviewParams.Messages messages = qb0Var.f28107r;
        if (messages != null && l1Var.f5788f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) l1Var.f5785a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(ib0Var.getMeasuredWidth(), ib0Var.getMeasuredHeight());
            if (t1Var.getMessageObject() != null) {
                i11 = t1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                qb0Var.W.d.checkCurrentLink(qb0Var.f28107r.previewMessages.get(i10));
            }
            MessageObject messageObject = qb0Var.f28107r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = qb0Var.f28107r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z10 = true;
            if (i12 == 1) {
                t1Var.setDelegate(new ab.a(16));
            }
            if (qb0Var.f28107r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t1Var.J3(z4, false);
                if (i11 != qb0Var.f28107r.previewMessages.get(i10).getId()) {
                    z10 = false;
                }
                MessagePreviewParams.Messages messages3 = qb0Var.f28107r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        qb0 qb0Var = this.f27810c;
        wb0 wb0Var = qb0Var.W;
        nb0 nb0Var = new nb0(this, context, wb0Var.f30292w, qb0Var.G, wb0Var.C);
        nb0Var.setClipChildren(false);
        nb0Var.setClipToPadding(false);
        nb0Var.setDelegate(new ob0(this));
        return new f2.l1(nb0Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10;
        boolean z4;
        boolean z10;
        MessageObject c3;
        qb0 qb0Var = this.f27810c;
        hb0 hb0Var = qb0Var.e;
        wb0 wb0Var = qb0Var.W;
        if (qb0Var.f28107r != null && (i10 = qb0Var.f28102a) != 1) {
            View view = l1Var.f5785a;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = qb0.a(qb0Var, t1Var.getMessageObject());
                    if (a2 == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t1Var.setDrawSelectionBackground(z4);
                    if (a2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t1Var.L3(true, z10, false);
                    MessagePreviewParams messagePreviewParams = wb0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && t1Var.getMessageObject() != null && (c3 = qb0Var.c(null)) != null) {
                        if ((t1Var.getMessageObject() == c3 || t1Var.getMessageObject().getId() == c3.getId()) && !hb0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = wb0Var.d;
                            hb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (qb0Var.V) {
                                qb0Var.I = D(t1Var, wb0Var.d.quoteStart, false);
                                qb0Var.J = D(t1Var, wb0Var.d.quoteEnd, true);
                                qb0Var.K = true;
                                qb0Var.V = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                t1Var.setDrawSelectionBackground(false);
            }
        }
    }
}
