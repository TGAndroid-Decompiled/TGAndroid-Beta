package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class kb0 extends f2.p0 {
    public final lb0 f30006c;

    public kb0(lb0 lb0Var) {
        this.f30006c = lb0Var;
    }

    public static int D(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (s1Var != null) {
            org.telegram.ui.Cells.r1 r1Var = s1Var.Vc;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = s1Var.Y3) != null) {
                    i11 = (int) s1Var.f25439m4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    s1Var.u3(true);
                    int i12 = s1Var.f25450n0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (s1Var.f25480p1) {
                        i11 = org.telegram.messenger.x3.C(10.0f, s1Var.f25381i2, i12);
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
                                if (z10) {
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
        MessagePreviewParams.Messages messages = this.f30006c.f30279r;
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        lb0 lb0Var = this.f30006c;
        eb0 eb0Var = lb0Var.f30277f;
        int i12 = lb0Var.f30273a;
        MessagePreviewParams.Messages messages = lb0Var.f30279r;
        if (messages != null && n1Var.f6436f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) n1Var.f6432a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.Z3(eb0Var.getMeasuredWidth(), eb0Var.getMeasuredHeight());
            if (s1Var.getMessageObject() != null) {
                i11 = s1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                lb0Var.V.d.checkCurrentLink(lb0Var.f30279r.previewMessages.get(i10));
            }
            MessageObject messageObject = lb0Var.f30279r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = lb0Var.f30279r;
            s1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                s1Var.setDelegate(new bb.a(17));
            }
            if (lb0Var.f30279r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s1Var.J3(z10, false);
                if (i11 != lb0Var.f30279r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = lb0Var.f30279r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        lb0 lb0Var = this.f30006c;
        rb0 rb0Var = lb0Var.V;
        ib0 ib0Var = new ib0(this, context, rb0Var.f32257w, lb0Var.F, rb0Var.B);
        ib0Var.setClipChildren(false);
        ib0Var.setClipToPadding(false);
        ib0Var.setDelegate(new jb0(this));
        return new f2.n1(ib0Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject c3;
        lb0 lb0Var = this.f30006c;
        db0 db0Var = lb0Var.f30276e;
        rb0 rb0Var = lb0Var.V;
        if (lb0Var.f30279r != null && (i10 = lb0Var.f30273a) != 1) {
            View view = n1Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = lb0.a(lb0Var, s1Var.getMessageObject());
                    if (a2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s1Var.setDrawSelectionBackground(z10);
                    if (a2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s1Var.L3(true, z11, false);
                    MessagePreviewParams messagePreviewParams = rb0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && s1Var.getMessageObject() != null && (c3 = lb0Var.c(null)) != null) {
                        if ((s1Var.getMessageObject() == c3 || s1Var.getMessageObject().getId() == c3.getId()) && !db0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = rb0Var.d;
                            db0Var.a0(s1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (lb0Var.U) {
                                lb0Var.H = D(s1Var, rb0Var.d.quoteStart, false);
                                lb0Var.I = D(s1Var, rb0Var.d.quoteEnd, true);
                                lb0Var.J = true;
                                lb0Var.U = false;
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
