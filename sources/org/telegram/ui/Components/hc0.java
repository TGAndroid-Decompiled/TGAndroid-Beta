package org.telegram.ui.Components;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.RichQuote;
public final class hc0 extends s4.h0 {
    public final ic0 f28954c;

    public hc0(ic0 ic0Var) {
        this.f28954c = ic0Var;
    }

    public static int D(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int lineTop2;
        if (s1Var != null) {
            org.telegram.ui.Cells.r1 r1Var = s1Var.Zc;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.richLayout != null) {
                    s1Var.w3(true);
                    RichMessageLayout richMessageLayout = messageObject.richLayout;
                    int size = richMessageLayout.textBlocks.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = richMessageLayout.textBlockCharOffsets.get(size).intValue();
                        if (i10 < intValue) {
                            size--;
                        } else {
                            Layout layout = richMessageLayout.textBlocks.get(size).getLayout();
                            if (layout != null) {
                                int lineForOffset = layout.getLineForOffset(Math.min(i10 - intValue, layout.getText().length()));
                                int y3 = richMessageLayout.textBlocks.get(size).getY() + s1Var.f25256r0;
                                if (z10) {
                                    lineTop2 = layout.getLineBottom(lineForOffset);
                                } else {
                                    lineTop2 = layout.getLineTop(lineForOffset);
                                }
                                return y3 + lineTop2;
                            }
                        }
                    }
                } else if (messageObject.getGroupId() == 0) {
                    if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = s1Var.f25048c4) != null) {
                        i11 = (int) s1Var.f25247q4;
                        charSequence = messageObject.caption;
                        arrayList = textLayoutBlocks.textLayoutBlocks;
                    } else {
                        s1Var.w3(true);
                        int i12 = s1Var.f25256r0;
                        CharSequence charSequence2 = messageObject.messageText;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                        if (s1Var.f25287t1) {
                            i11 = org.telegram.messenger.t.D(10.0f, s1Var.f25186m2, i12);
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
                                    int lineForOffset2 = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    textYOffset = lineTop + textLayoutBlock.textYOffset(arrayList, r1Var) + i11 + textLayoutBlock.padTop;
                                }
                                return (int) textYOffset;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public final int h() {
        MessagePreviewParams.Messages messages = this.f28954c.f29309r;
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        ic0 ic0Var = this.f28954c;
        bc0 bc0Var = ic0Var.f29307f;
        int i12 = ic0Var.f29301a;
        MessagePreviewParams.Messages messages = ic0Var.f29309r;
        if (messages != null && e1Var.f47776f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) e1Var.f47773a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.b4(bc0Var.getMeasuredWidth(), bc0Var.getMeasuredHeight());
            if (s1Var.getMessageObject() != null) {
                i11 = s1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                ic0Var.f29306c0.d.checkCurrentLink(ic0Var.f29309r.previewMessages.get(i10));
            }
            MessageObject messageObject = ic0Var.f29309r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = ic0Var.f29309r;
            s1Var.Z3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                s1Var.setDelegate(new tb.a(15));
            }
            if (ic0Var.f29309r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s1Var.L3(z10, false);
                if (i11 != ic0Var.f29309r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = ic0Var.f29309r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.N3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ic0 ic0Var = this.f28954c;
        oc0 oc0Var = ic0Var.f29306c0;
        fc0 fc0Var = new fc0(this, context, oc0Var.f31270w, ic0Var.J, oc0Var.F);
        fc0Var.setClipChildren(false);
        fc0Var.setClipToPadding(false);
        fc0Var.setDelegate(new gc0(this));
        return new s4.e1(fc0Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int[] findQuote;
        ic0 ic0Var = this.f28954c;
        ac0 ac0Var = ic0Var.e;
        oc0 oc0Var = ic0Var.f29306c0;
        if (ic0Var.f29309r != null && (i10 = ic0Var.f29301a) != 1) {
            View view = e1Var.f47773a;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = ic0.a(ic0Var, s1Var.getMessageObject());
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
                    s1Var.N3(true, z11, false);
                    MessagePreviewParams messagePreviewParams = oc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && ic0Var.e(s1Var)) {
                        MessageObject messageObject = s1Var.getMessageObject();
                        MessagePreviewParams messagePreviewParams2 = oc0Var.d;
                        MessagePreviewParams messagePreviewParams3 = oc0Var.d;
                        org.telegram.ui.mn mnVar = messagePreviewParams3.quote;
                        if (mnVar.f41486m && messageObject != null && messageObject.richLayout != null && ((i11 = messagePreviewParams3.quoteStart) < 0 || messagePreviewParams3.quoteEnd <= i11)) {
                            String str = mnVar.f41482i;
                            if (str == null) {
                                findQuote = null;
                            } else {
                                findQuote = RichQuote.findQuote(messageObject, str, mnVar.f41488o);
                            }
                            if (findQuote != null) {
                                messagePreviewParams2.quoteStart = findQuote[0];
                                messagePreviewParams2.quoteEnd = findQuote[1];
                            } else {
                                messagePreviewParams2.quoteStart = 0;
                                messagePreviewParams2.quoteEnd = Math.min(MessagesController.getInstance(oc0Var.f31270w).quoteLengthMax, org.telegram.ui.mn.d(messageObject));
                            }
                        }
                    }
                    MessagePreviewParams messagePreviewParams4 = oc0Var.d;
                    if (!messagePreviewParams4.isSecret && messagePreviewParams4.quote != null && messagePreviewParams4.quoteStart >= 0 && ic0Var.e(s1Var) && !ac0Var.x()) {
                        MessagePreviewParams messagePreviewParams5 = oc0Var.d;
                        ac0Var.Z(s1Var, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                        if (ic0Var.f29304b0) {
                            ic0Var.L = D(s1Var, oc0Var.d.quoteStart, false);
                            ic0Var.M = D(s1Var, oc0Var.d.quoteEnd, true);
                            ic0Var.N = true;
                            ic0Var.f29304b0 = false;
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
