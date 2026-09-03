package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class rb0 extends f2.p0 {
    public final sb0 f30719c;

    public rb0(sb0 sb0Var) {
        this.f30719c = sb0Var;
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
                    i11 = (int) t1Var.f23960n4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    t1Var.u3(true);
                    int i12 = t1Var.f23970o0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (t1Var.f24000q1) {
                        i11 = org.telegram.messenger.y3.C(10.0f, t1Var.f23901j2, i12);
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
        MessagePreviewParams.Messages messages = this.f30719c.f31033r;
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        sb0 sb0Var = this.f30719c;
        kb0 kb0Var = sb0Var.f31031f;
        int i12 = sb0Var.f31027a;
        MessagePreviewParams.Messages messages = sb0Var.f31033r;
        if (messages != null && m1Var.f5879f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) m1Var.f5875a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(kb0Var.getMeasuredWidth(), kb0Var.getMeasuredHeight());
            if (t1Var.getMessageObject() != null) {
                i11 = t1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                sb0Var.W.d.checkCurrentLink(sb0Var.f31033r.previewMessages.get(i10));
            }
            MessageObject messageObject = sb0Var.f31033r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = sb0Var.f31033r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z10 = true;
            if (i12 == 1) {
                t1Var.setDelegate(new ab.a(16));
            }
            if (sb0Var.f31033r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t1Var.J3(z4, false);
                if (i11 != sb0Var.f31033r.previewMessages.get(i10).getId()) {
                    z10 = false;
                }
                MessagePreviewParams.Messages messages3 = sb0Var.f31033r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        sb0 sb0Var = this.f30719c;
        yb0 yb0Var = sb0Var.W;
        pb0 pb0Var = new pb0(this, context, yb0Var.f33461w, sb0Var.G, yb0Var.C);
        pb0Var.setClipChildren(false);
        pb0Var.setClipToPadding(false);
        pb0Var.setDelegate(new qb0(this));
        return new f2.m1(pb0Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        int i10;
        boolean z4;
        boolean z10;
        MessageObject c3;
        sb0 sb0Var = this.f30719c;
        jb0 jb0Var = sb0Var.f31030e;
        yb0 yb0Var = sb0Var.W;
        if (sb0Var.f31033r != null && (i10 = sb0Var.f31027a) != 1) {
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = sb0.a(sb0Var, t1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = yb0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && t1Var.getMessageObject() != null && (c3 = sb0Var.c(null)) != null) {
                        if ((t1Var.getMessageObject() == c3 || t1Var.getMessageObject().getId() == c3.getId()) && !jb0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = yb0Var.d;
                            jb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (sb0Var.V) {
                                sb0Var.I = D(t1Var, yb0Var.d.quoteStart, false);
                                sb0Var.J = D(t1Var, yb0Var.d.quoteEnd, true);
                                sb0Var.K = true;
                                sb0Var.V = false;
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
