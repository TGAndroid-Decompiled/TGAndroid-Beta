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
public final class hc0 extends s4.g0 {
    public final ic0 f26848c;

    public hc0(ic0 ic0Var) {
        this.f26848c = ic0Var;
    }

    public static int D(org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int lineTop2;
        if (u1Var != null) {
            org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
            MessageObject messageObject = u1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.richLayout != null) {
                    u1Var.u3(true);
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
                                int y3 = richMessageLayout.textBlocks.get(size).getY() + u1Var.f23452r0;
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
                    if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = u1Var.f23246c4) != null) {
                        i11 = (int) u1Var.f23441q4;
                        charSequence = messageObject.caption;
                        arrayList = textLayoutBlocks.textLayoutBlocks;
                    } else {
                        u1Var.u3(true);
                        int i12 = u1Var.f23452r0;
                        CharSequence charSequence2 = messageObject.messageText;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                        if (u1Var.f23483t1) {
                            i11 = org.telegram.messenger.g0.C(10.0f, u1Var.f23383m2, i12);
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
                                    int lineForOffset2 = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    textYOffset = lineTop + textLayoutBlock.textYOffset(arrayList, t1Var) + i11 + textLayoutBlock.padTop;
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
        MessagePreviewParams.Messages messages = this.f26848c.f27188r;
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        ic0 ic0Var = this.f26848c;
        bc0 bc0Var = ic0Var.f27186f;
        int i12 = ic0Var.f27180a;
        MessagePreviewParams.Messages messages = ic0Var.f27188r;
        if (messages != null && b1Var.f45913f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) b1Var.f45910a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(bc0Var.getMeasuredWidth(), bc0Var.getMeasuredHeight());
            if (u1Var.getMessageObject() != null) {
                i11 = u1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                ic0Var.f27185c0.d.checkCurrentLink(ic0Var.f27188r.previewMessages.get(i10));
            }
            MessageObject messageObject = ic0Var.f27188r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = ic0Var.f27188r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                u1Var.setDelegate(new oa.d(17));
            }
            if (ic0Var.f27188r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1Var.J3(z10, false);
                if (i11 != ic0Var.f27188r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = ic0Var.f27188r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ic0 ic0Var = this.f26848c;
        oc0 oc0Var = ic0Var.f27185c0;
        fc0 fc0Var = new fc0(this, context, oc0Var.f28928w, ic0Var.J, oc0Var.F);
        fc0Var.setClipChildren(false);
        fc0Var.setClipToPadding(false);
        fc0Var.setDelegate(new gc0(this));
        return new s4.b1(fc0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int[] findQuote;
        ic0 ic0Var = this.f26848c;
        ac0 ac0Var = ic0Var.e;
        oc0 oc0Var = ic0Var.f27185c0;
        if (ic0Var.f27188r != null && (i10 = ic0Var.f27180a) != 1) {
            View view = b1Var.f45910a;
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = ic0.a(ic0Var, u1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = oc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && ic0Var.e(u1Var)) {
                        MessageObject messageObject = u1Var.getMessageObject();
                        MessagePreviewParams messagePreviewParams2 = oc0Var.d;
                        MessagePreviewParams messagePreviewParams3 = oc0Var.d;
                        org.telegram.ui.in inVar = messagePreviewParams3.quote;
                        if (inVar.f37928m && messageObject != null && messageObject.richLayout != null && ((i11 = messagePreviewParams3.quoteStart) < 0 || messagePreviewParams3.quoteEnd <= i11)) {
                            String str = inVar.f37924i;
                            if (str == null) {
                                findQuote = null;
                            } else {
                                findQuote = RichQuote.findQuote(messageObject, str, inVar.f37930o);
                            }
                            if (findQuote != null) {
                                messagePreviewParams2.quoteStart = findQuote[0];
                                messagePreviewParams2.quoteEnd = findQuote[1];
                            } else {
                                messagePreviewParams2.quoteStart = 0;
                                messagePreviewParams2.quoteEnd = Math.min(MessagesController.getInstance(oc0Var.f28928w).quoteLengthMax, org.telegram.ui.in.d(messageObject));
                            }
                        }
                    }
                    MessagePreviewParams messagePreviewParams4 = oc0Var.d;
                    if (!messagePreviewParams4.isSecret && messagePreviewParams4.quote != null && messagePreviewParams4.quoteStart >= 0 && ic0Var.e(u1Var) && !ac0Var.x()) {
                        MessagePreviewParams messagePreviewParams5 = oc0Var.d;
                        ac0Var.Z(u1Var, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                        if (ic0Var.f27183b0) {
                            ic0Var.L = D(u1Var, oc0Var.d.quoteStart, false);
                            ic0Var.M = D(u1Var, oc0Var.d.quoteEnd, true);
                            ic0Var.N = true;
                            ic0Var.f27183b0 = false;
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
