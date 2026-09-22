package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class zb0 extends s4.h0 {
    public final ac0 f30871c;

    public zb0(ac0 ac0Var) {
        this.f30871c = ac0Var;
    }

    public static int D(org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (u1Var != null) {
            org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
            MessageObject messageObject = u1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = u1Var.f21272c4) != null) {
                    i11 = (int) u1Var.f21468q4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    u1Var.u3(true);
                    int i12 = u1Var.f21479r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (u1Var.f21511t1) {
                        i11 = org.telegram.messenger.l0.C(10.0f, u1Var.f21410m2, i12);
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
                                textYOffset = i11 + ((int) (textLayoutBlock.textYOffset(arrayList, t1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                if (z10) {
                                    lineTop = staticLayout.getLineBottom(lineForOffset);
                                } else {
                                    lineTop = staticLayout.getLineTop(lineForOffset);
                                }
                                textYOffset = lineTop + textLayoutBlock.textYOffset(arrayList, t1Var) + i11 + textLayoutBlock.padTop;
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
        MessagePreviewParams.Messages messages = this.f30871c.f22628r;
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
        ac0 ac0Var = this.f30871c;
        sb0 sb0Var = ac0Var.f22626f;
        int i12 = ac0Var.f22620a;
        MessagePreviewParams.Messages messages = ac0Var.f22628r;
        if (messages != null && c1Var.f42998f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.f42995a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(sb0Var.getMeasuredWidth(), sb0Var.getMeasuredHeight());
            if (u1Var.getMessageObject() != null) {
                i11 = u1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                ac0Var.f22625c0.d.checkCurrentLink(ac0Var.f22628r.previewMessages.get(i10));
            }
            MessageObject messageObject = ac0Var.f22628r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = ac0Var.f22628r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                u1Var.setDelegate(new rb.a(16));
            }
            if (ac0Var.f22628r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1Var.J3(z10, false);
                if (i11 != ac0Var.f22628r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = ac0Var.f22628r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ac0 ac0Var = this.f30871c;
        gc0 gc0Var = ac0Var.f22625c0;
        xb0 xb0Var = new xb0(this, context, gc0Var.f24501w, ac0Var.J, gc0Var.F);
        xb0Var.setClipChildren(false);
        xb0Var.setClipToPadding(false);
        xb0Var.setDelegate(new yb0(this));
        return new s4.c1(xb0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject c10;
        ac0 ac0Var = this.f30871c;
        rb0 rb0Var = ac0Var.e;
        gc0 gc0Var = ac0Var.f22625c0;
        if (ac0Var.f22628r != null && (i10 = ac0Var.f22620a) != 1) {
            View view = c1Var.f42995a;
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = ac0.a(ac0Var, u1Var.getMessageObject());
                    if (a2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1Var.setDrawSelectionBackground(z10);
                    if (a2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u1Var.L3(true, z11, false);
                    MessagePreviewParams messagePreviewParams = gc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && u1Var.getMessageObject() != null && (c10 = ac0Var.c(null)) != null) {
                        if ((u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) && !rb0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = gc0Var.d;
                            rb0Var.a0(u1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (ac0Var.f22623b0) {
                                ac0Var.L = D(u1Var, gc0Var.d.quoteStart, false);
                                ac0Var.M = D(u1Var, gc0Var.d.quoteEnd, true);
                                ac0Var.N = true;
                                ac0Var.f22623b0 = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                u1Var.setDrawSelectionBackground(false);
            }
        }
    }
}
