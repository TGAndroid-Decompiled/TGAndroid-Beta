package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class qb0 extends f2.o0 {
    public final rb0 f28139c;

    public qb0(rb0 rb0Var) {
        this.f28139c = rb0Var;
    }

    public static int D(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z4) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (s1Var != null) {
            org.telegram.ui.Cells.r1 r1Var = s1Var.Wc;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = s1Var.Z3) != null) {
                    i11 = (int) s1Var.f22095n4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    s1Var.u3(true);
                    int i12 = s1Var.f22105o0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (s1Var.f22135q1) {
                        i11 = org.telegram.messenger.y3.C(10.0f, s1Var.f22036j2, i12);
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
                                textYOffset = i11 + ((int) (textLayoutBlock.textYOffset(arrayList, r1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                if (z4) {
                                    lineTop = staticLayout.getLineBottom(lineForOffset);
                                } else {
                                    lineTop = staticLayout.getLineTop(lineForOffset);
                                }
                                textYOffset = lineTop + textLayoutBlock.textYOffset(arrayList, r1Var) + i11 + textLayoutBlock.padTop;
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
        MessagePreviewParams.Messages messages = this.f28139c.f28445r;
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
        rb0 rb0Var = this.f28139c;
        jb0 jb0Var = rb0Var.f28443f;
        int i12 = rb0Var.f28440a;
        MessagePreviewParams.Messages messages = rb0Var.f28445r;
        if (messages != null && l1Var.f5777f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) l1Var.f5774a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.Z3(jb0Var.getMeasuredWidth(), jb0Var.getMeasuredHeight());
            if (s1Var.getMessageObject() != null) {
                i11 = s1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                rb0Var.W.d.checkCurrentLink(rb0Var.f28445r.previewMessages.get(i10));
            }
            MessageObject messageObject = rb0Var.f28445r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = rb0Var.f28445r;
            s1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z10 = true;
            if (i12 == 1) {
                s1Var.setDelegate(new h7.u(16));
            }
            if (rb0Var.f28445r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                s1Var.J3(z4, false);
                if (i11 != rb0Var.f28445r.previewMessages.get(i10).getId()) {
                    z10 = false;
                }
                MessagePreviewParams.Messages messages3 = rb0Var.f28445r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        rb0 rb0Var = this.f28139c;
        xb0 xb0Var = rb0Var.W;
        ob0 ob0Var = new ob0(this, context, xb0Var.f30580w, rb0Var.G, xb0Var.C);
        ob0Var.setClipChildren(false);
        ob0Var.setClipToPadding(false);
        ob0Var.setDelegate(new pb0(this));
        return new f2.l1(ob0Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10;
        boolean z4;
        boolean z10;
        MessageObject c3;
        rb0 rb0Var = this.f28139c;
        ib0 ib0Var = rb0Var.e;
        xb0 xb0Var = rb0Var.W;
        if (rb0Var.f28445r != null && (i10 = rb0Var.f28440a) != 1) {
            View view = l1Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = rb0.a(rb0Var, s1Var.getMessageObject());
                    if (a2 == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    s1Var.setDrawSelectionBackground(z4);
                    if (a2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s1Var.L3(true, z10, false);
                    MessagePreviewParams messagePreviewParams = xb0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && s1Var.getMessageObject() != null && (c3 = rb0Var.c(null)) != null) {
                        if ((s1Var.getMessageObject() == c3 || s1Var.getMessageObject().getId() == c3.getId()) && !ib0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = xb0Var.d;
                            ib0Var.a0(s1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (rb0Var.V) {
                                rb0Var.I = D(s1Var, xb0Var.d.quoteStart, false);
                                rb0Var.J = D(s1Var, xb0Var.d.quoteEnd, true);
                                rb0Var.K = true;
                                rb0Var.V = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                s1Var.setDrawSelectionBackground(false);
            }
        }
    }
}
