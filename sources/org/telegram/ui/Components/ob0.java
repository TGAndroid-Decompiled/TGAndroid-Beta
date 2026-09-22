package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class ob0 extends s4.h0 {
    public final pb0 f26743c;

    public ob0(pb0 pb0Var) {
        this.f26743c = pb0Var;
    }

    public static int D(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z10) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (t1Var != null) {
            org.telegram.ui.Cells.s1 s1Var = t1Var.Zc;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = t1Var.f20988c4) != null) {
                    i11 = (int) t1Var.f21183q4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    t1Var.u3(true);
                    int i12 = t1Var.f21194r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (t1Var.f21226t1) {
                        i11 = org.telegram.messenger.y0.C(10.0f, t1Var.f21125m2, i12);
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
                                if (z10) {
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
        MessagePreviewParams.Messages messages = this.f26743c.f27001r;
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        pb0 pb0Var = this.f26743c;
        hb0 hb0Var = pb0Var.f26999f;
        int i12 = pb0Var.f26993a;
        MessagePreviewParams.Messages messages = pb0Var.f27001r;
        if (messages != null && c1Var.f42674f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.f42671a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(hb0Var.getMeasuredWidth(), hb0Var.getMeasuredHeight());
            if (t1Var.getMessageObject() != null) {
                i11 = t1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                pb0Var.f26998c0.d.checkCurrentLink(pb0Var.f27001r.previewMessages.get(i10));
            }
            MessageObject messageObject = pb0Var.f27001r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = pb0Var.f27001r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                t1Var.setDelegate(new rb.a(16));
            }
            if (pb0Var.f27001r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t1Var.J3(z10, false);
                if (i11 != pb0Var.f27001r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = pb0Var.f27001r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        pb0 pb0Var = this.f26743c;
        vb0 vb0Var = pb0Var.f26998c0;
        mb0 mb0Var = new mb0(this, context, vb0Var.f28682w, pb0Var.J, vb0Var.F);
        mb0Var.setClipChildren(false);
        mb0Var.setClipToPadding(false);
        mb0Var.setDelegate(new nb0(this));
        return new s4.c1(mb0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject c10;
        pb0 pb0Var = this.f26743c;
        gb0 gb0Var = pb0Var.e;
        vb0 vb0Var = pb0Var.f26998c0;
        if (pb0Var.f27001r != null && (i10 = pb0Var.f26993a) != 1) {
            View view = c1Var.f42671a;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = pb0.a(pb0Var, t1Var.getMessageObject());
                    if (a2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t1Var.setDrawSelectionBackground(z10);
                    if (a2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t1Var.L3(true, z11, false);
                    MessagePreviewParams messagePreviewParams = vb0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && t1Var.getMessageObject() != null && (c10 = pb0Var.c(null)) != null) {
                        if ((t1Var.getMessageObject() == c10 || t1Var.getMessageObject().getId() == c10.getId()) && !gb0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = vb0Var.d;
                            gb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (pb0Var.f26996b0) {
                                pb0Var.L = D(t1Var, vb0Var.d.quoteStart, false);
                                pb0Var.M = D(t1Var, vb0Var.d.quoteEnd, true);
                                pb0Var.N = true;
                                pb0Var.f26996b0 = false;
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
