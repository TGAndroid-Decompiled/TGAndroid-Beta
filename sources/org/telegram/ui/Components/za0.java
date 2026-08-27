package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

public final class za0 extends f2.q0 {

    public final ab0 f35217c;

    public za0(ab0 ab0Var) {
        this.f35217c = ab0Var;
    }

    public static int D(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        int iC;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (s1Var != null) {
            org.telegram.ui.Cells.r1 r1Var = s1Var.Vc;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = s1Var.Y3) == null) {
                    s1Var.t3(true);
                    int i11 = s1Var.f25440n0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    iC = s1Var.f25469p1 ? org.telegram.messenger.y1.C(10.0f, s1Var.f25370i2, i11) : i11;
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    iC = (int) s1Var.f25428m4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                }
                if (arrayList != null && charSequence != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i12);
                        StaticLayout staticLayout = textLayoutBlock.textLayout;
                        String string = staticLayout.getText().toString();
                        int i13 = textLayoutBlock.charactersOffset;
                        if (i10 > i13) {
                            if (i10 - i13 > string.length() - 1) {
                                lineBottom = iC + ((int) (textLayoutBlock.textYOffset(arrayList, r1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset)) + textLayoutBlock.textYOffset(arrayList, r1Var) + iC + textLayoutBlock.padTop;
                            }
                            return (int) lineBottom;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public final int h() {
        MessagePreviewParams.Messages messages = this.f35217c.f26718r;
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
    public final void v(f2.o1 o1Var, int i10) {
        ab0 ab0Var = this.f35217c;
        ta0 ta0Var = ab0Var.f26716f;
        int i11 = ab0Var.f26712a;
        MessagePreviewParams.Messages messages = ab0Var.f26718r;
        if (messages != null && o1Var.f5793f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) o1Var.f5789a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.Y3(ta0Var.getMeasuredWidth(), ta0Var.getMeasuredHeight());
            int id2 = s1Var.getMessageObject() != null ? s1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                ab0Var.V.d.checkCurrentLink(ab0Var.f26718r.previewMessages.get(i10));
            }
            MessageObject messageObject = ab0Var.f26718r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = ab0Var.f26718r;
            s1Var.W3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                s1Var.setDelegate(new xa.a(18));
            }
            if (ab0Var.f26718r.previewMessages.size() > 1) {
                s1Var.I3(i11 == 1, false);
                boolean z10 = id2 == ab0Var.f26718r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = ab0Var.f26718r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.K3(z11, z11, z10);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ab0 ab0Var = this.f35217c;
        gb0 gb0Var = ab0Var.V;
        xa0 xa0Var = new xa0(this, context, gb0Var.f28588w, ab0Var.F, gb0Var.B);
        xa0Var.setClipChildren(false);
        xa0Var.setClipToPadding(false);
        xa0Var.setDelegate(new ya0(this));
        return new lk0(xa0Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        int i10;
        MessageObject messageObjectC;
        ab0 ab0Var = this.f35217c;
        sa0 sa0Var = ab0Var.f26715e;
        gb0 gb0Var = ab0Var.V;
        if (ab0Var.f26718r == null || (i10 = ab0Var.f26712a) == 1) {
            return;
        }
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            if (i10 != 0) {
                s1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages groupedMessagesA = ab0.a(ab0Var, s1Var.getMessageObject());
            s1Var.setDrawSelectionBackground(groupedMessagesA == null);
            s1Var.K3(true, groupedMessagesA == null, false);
            MessagePreviewParams messagePreviewParams = gb0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || s1Var.getMessageObject() == null || (messageObjectC = ab0Var.c(null)) == null) {
                return;
            }
            if ((s1Var.getMessageObject() == messageObjectC || s1Var.getMessageObject().getId() == messageObjectC.getId()) && !sa0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = gb0Var.d;
                sa0Var.a0(s1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (ab0Var.U) {
                    ab0Var.H = D(s1Var, gb0Var.d.quoteStart, false);
                    ab0Var.I = D(s1Var, gb0Var.d.quoteEnd, true);
                    ab0Var.J = true;
                    ab0Var.U = false;
                }
            }
        }
    }
}
