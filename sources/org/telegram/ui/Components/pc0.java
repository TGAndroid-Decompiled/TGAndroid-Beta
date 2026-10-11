package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class pc0 extends s4.i0 {
    public final qc0 f29714c;

    public pc0(qc0 qc0Var) {
        this.f29714c = qc0Var;
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
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = u1Var.f23134c4) != null) {
                    i11 = (int) u1Var.f23328q4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    u1Var.u3(true);
                    int i12 = u1Var.f23339r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (u1Var.f23370t1) {
                        i11 = org.telegram.messenger.q.C(10.0f, u1Var.f23270m2, i12);
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
        MessagePreviewParams.Messages messages = this.f29714c.f30136r;
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        qc0 qc0Var = this.f29714c;
        jc0 jc0Var = qc0Var.f30134f;
        int i12 = qc0Var.f30127a;
        MessagePreviewParams.Messages messages = qc0Var.f30136r;
        if (messages != null && d1Var.f47752f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) d1Var.f47748a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(jc0Var.getMeasuredWidth(), jc0Var.getMeasuredHeight());
            if (u1Var.getMessageObject() != null) {
                i11 = u1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                qc0Var.f30132c0.d.checkCurrentLink(qc0Var.f30136r.previewMessages.get(i10));
            }
            MessageObject messageObject = qc0Var.f30136r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = qc0Var.f30136r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                u1Var.setDelegate(new rb.a(16));
            }
            if (qc0Var.f30136r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1Var.J3(z10, false);
                if (i11 != qc0Var.f30136r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = qc0Var.f30136r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        qc0 qc0Var = this.f29714c;
        wc0 wc0Var = qc0Var.f30132c0;
        nc0 nc0Var = new nc0(this, context, wc0Var.f32620w, qc0Var.J, wc0Var.F);
        nc0Var.setClipChildren(false);
        nc0Var.setClipToPadding(false);
        nc0Var.setDelegate(new oc0(this));
        return new s4.d1(nc0Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject c10;
        qc0 qc0Var = this.f29714c;
        ic0 ic0Var = qc0Var.f30133e;
        wc0 wc0Var = qc0Var.f30132c0;
        if (qc0Var.f30136r != null && (i10 = qc0Var.f30127a) != 1) {
            View view = d1Var.f47748a;
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = qc0.a(qc0Var, u1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = wc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && u1Var.getMessageObject() != null && (c10 = qc0Var.c(null)) != null) {
                        if ((u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) && !ic0Var.x()) {
                            MessagePreviewParams messagePreviewParams2 = wc0Var.d;
                            ic0Var.Z(u1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (qc0Var.f30130b0) {
                                qc0Var.L = D(u1Var, wc0Var.d.quoteStart, false);
                                qc0Var.M = D(u1Var, wc0Var.d.quoteEnd, true);
                                qc0Var.N = true;
                                qc0Var.f30130b0 = false;
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
