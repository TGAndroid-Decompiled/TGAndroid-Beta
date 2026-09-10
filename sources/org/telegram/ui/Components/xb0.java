package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class xb0 extends s4.h0 {
    public final yb0 f29002c;

    public xb0(yb0 yb0Var) {
        this.f29002c = yb0Var;
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
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = t1Var.f20086c4) != null) {
                    i11 = (int) t1Var.f20281q4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    t1Var.u3(true);
                    int i12 = t1Var.f20292r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (t1Var.f20324t1) {
                        i11 = org.telegram.messenger.a2.C(10.0f, t1Var.f20223m2, i12);
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
        MessagePreviewParams.Messages messages = this.f29002c.f29298r;
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
        yb0 yb0Var = this.f29002c;
        rb0 rb0Var = yb0Var.f29296f;
        int i12 = yb0Var.f29290a;
        MessagePreviewParams.Messages messages = yb0Var.f29298r;
        if (messages != null && c1Var.f41613f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.f41610a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(rb0Var.getMeasuredWidth(), rb0Var.getMeasuredHeight());
            if (t1Var.getMessageObject() != null) {
                i11 = t1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                yb0Var.f29295c0.d.checkCurrentLink(yb0Var.f29298r.previewMessages.get(i10));
            }
            MessageObject messageObject = yb0Var.f29298r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = yb0Var.f29298r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                t1Var.setDelegate(new rb.a(16));
            }
            if (yb0Var.f29298r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t1Var.J3(z10, false);
                if (i11 != yb0Var.f29298r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = yb0Var.f29298r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        yb0 yb0Var = this.f29002c;
        ec0 ec0Var = yb0Var.f29295c0;
        vb0 vb0Var = new vb0(this, context, ec0Var.f22668w, yb0Var.J, ec0Var.F);
        vb0Var.setClipChildren(false);
        vb0Var.setClipToPadding(false);
        vb0Var.setDelegate(new wb0(this));
        return new s4.c1(vb0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject c10;
        yb0 yb0Var = this.f29002c;
        qb0 qb0Var = yb0Var.e;
        ec0 ec0Var = yb0Var.f29295c0;
        if (yb0Var.f29298r != null && (i10 = yb0Var.f29290a) != 1) {
            View view = c1Var.f41610a;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = yb0.a(yb0Var, t1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = ec0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && t1Var.getMessageObject() != null && (c10 = yb0Var.c(null)) != null) {
                        if ((t1Var.getMessageObject() == c10 || t1Var.getMessageObject().getId() == c10.getId()) && !qb0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = ec0Var.d;
                            qb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (yb0Var.f29293b0) {
                                yb0Var.L = D(t1Var, ec0Var.d.quoteStart, false);
                                yb0Var.M = D(t1Var, ec0Var.d.quoteEnd, true);
                                yb0Var.N = true;
                                yb0Var.f29293b0 = false;
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
