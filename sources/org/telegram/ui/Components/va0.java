package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
public final class va0 extends f2.r0 {
    public final wa0 f33339c;

    public va0(wa0 wa0Var) {
        this.f33339c = wa0Var;
    }

    public static int D(org.telegram.ui.Cells.t1 t1Var, int i9, boolean z10) {
        int i10;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (t1Var != null) {
            org.telegram.ui.Cells.s1 s1Var = t1Var.Vc;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = t1Var.Y3) != null) {
                    i10 = (int) t1Var.f25475m4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    t1Var.u3(true);
                    int i11 = t1Var.f25486n0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (t1Var.f25512p1) {
                        i10 = org.telegram.messenger.l0.C(10.0f, t1Var.f25418i2, i11);
                    } else {
                        i10 = i11;
                    }
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                }
                if (arrayList != null && charSequence != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i12);
                        StaticLayout staticLayout = textLayoutBlock.textLayout;
                        String charSequence3 = staticLayout.getText().toString();
                        int i13 = textLayoutBlock.charactersOffset;
                        if (i9 > i13) {
                            if (i9 - i13 > charSequence3.length() - 1) {
                                textYOffset = i10 + ((int) (textLayoutBlock.textYOffset(arrayList, s1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i9 - textLayoutBlock.charactersOffset);
                                if (z10) {
                                    lineTop = staticLayout.getLineBottom(lineForOffset);
                                } else {
                                    lineTop = staticLayout.getLineTop(lineForOffset);
                                }
                                textYOffset = lineTop + textLayoutBlock.textYOffset(arrayList, s1Var) + i10 + textLayoutBlock.padTop;
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
        MessagePreviewParams.Messages messages = this.f33339c.f34174r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        wa0 wa0Var = this.f33339c;
        pa0 pa0Var = wa0Var.f34172f;
        int i11 = wa0Var.f34168a;
        MessagePreviewParams.Messages messages = wa0Var.f34174r;
        if (messages != null && q1Var.f5505f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q1Var.f5501a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(pa0Var.getMeasuredWidth(), pa0Var.getMeasuredHeight());
            if (t1Var.getMessageObject() != null) {
                i10 = t1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            if (i11 == 2) {
                wa0Var.V.d.checkCurrentLink(wa0Var.f34174r.previewMessages.get(i9));
            }
            MessageObject messageObject = wa0Var.f34174r.previewMessages.get(i9);
            MessagePreviewParams.Messages messages2 = wa0Var.f34174r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i9).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i11 == 1) {
                t1Var.setDelegate(new wa.a(18));
            }
            if (wa0Var.f34174r.previewMessages.size() > 1) {
                if (i11 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t1Var.J3(z10, false);
                if (i10 != wa0Var.f34174r.previewMessages.get(i9).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = wa0Var.f34174r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i9).getId(), false);
                t1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = viewGroup.getContext();
        wa0 wa0Var = this.f33339c;
        cb0 cb0Var = wa0Var.V;
        ta0 ta0Var = new ta0(this, context, cb0Var.f27462w, wa0Var.F, cb0Var.B);
        ta0Var.setClipChildren(false);
        ta0Var.setClipToPadding(false);
        ta0Var.setDelegate(new ua0(this));
        return new f2.q1(ta0Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9;
        boolean z10;
        boolean z11;
        MessageObject c10;
        wa0 wa0Var = this.f33339c;
        oa0 oa0Var = wa0Var.f34171e;
        cb0 cb0Var = wa0Var.V;
        if (wa0Var.f34174r != null && (i9 = wa0Var.f34168a) != 1) {
            View view = q1Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                if (i9 == 0) {
                    MessageObject.GroupedMessages a2 = wa0.a(wa0Var, t1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = cb0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && t1Var.getMessageObject() != null && (c10 = wa0Var.c(null)) != null) {
                        if ((t1Var.getMessageObject() == c10 || t1Var.getMessageObject().getId() == c10.getId()) && !oa0Var.y()) {
                            MessagePreviewParams messagePreviewParams2 = cb0Var.d;
                            oa0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            if (wa0Var.U) {
                                wa0Var.H = D(t1Var, cb0Var.d.quoteStart, false);
                                wa0Var.I = D(t1Var, cb0Var.d.quoteEnd, true);
                                wa0Var.J = true;
                                wa0Var.U = false;
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
