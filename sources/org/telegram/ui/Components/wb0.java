package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class wb0 extends s4.h0 {
    public final xb0 f30020c;

    public wb0(xb0 xb0Var) {
        this.f30020c = xb0Var;
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
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = u1Var.f21257c4) != null) {
                    i11 = (int) u1Var.f21453q4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    u1Var.u3(true);
                    int i12 = u1Var.f21464r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (u1Var.f21496t1) {
                        i11 = org.telegram.messenger.l0.C(10.0f, u1Var.f21395m2, i12);
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
        MessagePreviewParams.Messages messages = this.f30020c.f30232r;
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
        xb0 xb0Var = this.f30020c;
        pb0 pb0Var = xb0Var.f30230f;
        int i12 = xb0Var.f30224a;
        MessagePreviewParams.Messages messages = xb0Var.f30232r;
        if (messages != null && c1Var.f42977f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.f42974a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(pb0Var.getMeasuredWidth(), pb0Var.getMeasuredHeight());
            if (u1Var.getMessageObject() != null) {
                i11 = u1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                xb0Var.f30229c0.d.checkCurrentLink(xb0Var.f30232r.previewMessages.get(i10));
            }
            MessageObject messageObject = xb0Var.f30232r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = xb0Var.f30232r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                u1Var.setDelegate(new rb.a(16));
            }
            if (xb0Var.f30232r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1Var.J3(z10, false);
                if (i11 != xb0Var.f30232r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = xb0Var.f30232r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        xb0 xb0Var = this.f30020c;
        dc0 dc0Var = xb0Var.f30229c0;
        ub0 ub0Var = new ub0(this, context, dc0Var.f23557w, xb0Var.J, dc0Var.F);
        ub0Var.setClipChildren(false);
        ub0Var.setClipToPadding(false);
        ub0Var.setDelegate(new vb0(this));
        return new s4.c1(ub0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject c10;
        xb0 xb0Var = this.f30020c;
        ob0 ob0Var = xb0Var.e;
        dc0 dc0Var = xb0Var.f30229c0;
        if (xb0Var.f30232r != null && (i10 = xb0Var.f30224a) != 1) {
            View view = c1Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = xb0.a(xb0Var, u1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = dc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && u1Var.getMessageObject() != null && (c10 = xb0Var.c(null)) != null) {
                        if ((u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) && !ob0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = dc0Var.d;
                            ob0Var.a0(u1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (xb0Var.f30227b0) {
                                xb0Var.L = D(u1Var, dc0Var.d.quoteStart, false);
                                xb0Var.M = D(u1Var, dc0Var.d.quoteEnd, true);
                                xb0Var.N = true;
                                xb0Var.f30227b0 = false;
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
