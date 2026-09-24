package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class yb0 extends s4.h0 {
    public final zb0 f30577c;

    public yb0(zb0 zb0Var) {
        this.f30577c = zb0Var;
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
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = u1Var.f21276c4) != null) {
                    i11 = (int) u1Var.f21471q4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    u1Var.u3(true);
                    int i12 = u1Var.f21482r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (u1Var.f21514t1) {
                        i11 = org.telegram.messenger.f0.C(10.0f, u1Var.f21413m2, i12);
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
        MessagePreviewParams.Messages messages = this.f30577c.f30832r;
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
        zb0 zb0Var = this.f30577c;
        sb0 sb0Var = zb0Var.f30830f;
        int i12 = zb0Var.f30824a;
        MessagePreviewParams.Messages messages = zb0Var.f30832r;
        if (messages != null && c1Var.f42949f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.f42946a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(sb0Var.getMeasuredWidth(), sb0Var.getMeasuredHeight());
            if (u1Var.getMessageObject() != null) {
                i11 = u1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                zb0Var.f30829c0.d.checkCurrentLink(zb0Var.f30832r.previewMessages.get(i10));
            }
            MessageObject messageObject = zb0Var.f30832r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = zb0Var.f30832r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                u1Var.setDelegate(new rb.a(16));
            }
            if (zb0Var.f30832r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1Var.J3(z10, false);
                if (i11 != zb0Var.f30832r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = zb0Var.f30832r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        zb0 zb0Var = this.f30577c;
        fc0 fc0Var = zb0Var.f30829c0;
        wb0 wb0Var = new wb0(this, context, fc0Var.f24140w, zb0Var.J, fc0Var.F);
        wb0Var.setClipChildren(false);
        wb0Var.setClipToPadding(false);
        wb0Var.setDelegate(new xb0(this));
        return new s4.c1(wb0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject c10;
        zb0 zb0Var = this.f30577c;
        rb0 rb0Var = zb0Var.e;
        fc0 fc0Var = zb0Var.f30829c0;
        if (zb0Var.f30832r != null && (i10 = zb0Var.f30824a) != 1) {
            View view = c1Var.f42946a;
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = zb0.a(zb0Var, u1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = fc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && u1Var.getMessageObject() != null && (c10 = zb0Var.c(null)) != null) {
                        if ((u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) && !rb0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = fc0Var.d;
                            rb0Var.a0(u1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (zb0Var.f30827b0) {
                                zb0Var.L = D(u1Var, fc0Var.d.quoteStart, false);
                                zb0Var.M = D(u1Var, fc0Var.d.quoteEnd, true);
                                zb0Var.N = true;
                                zb0Var.f30827b0 = false;
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
