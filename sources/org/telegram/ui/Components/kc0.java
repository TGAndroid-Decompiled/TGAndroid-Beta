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
public final class kc0 extends s4.g0 {
    public final lc0 f28004c;

    public kc0(lc0 lc0Var) {
        this.f28004c = lc0Var;
    }

    public static int D(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z10) {
        int i11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int lineTop;
        float textYOffset;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int lineTop2;
        if (t1Var != null) {
            org.telegram.ui.Cells.s1 s1Var = t1Var.Zc;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.richLayout != null) {
                    t1Var.t3(true);
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
                                int y3 = richMessageLayout.textBlocks.get(size).getY() + t1Var.f23547r0;
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
                    if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = t1Var.f23341c4) != null) {
                        i11 = (int) t1Var.f23536q4;
                        charSequence = messageObject.caption;
                        arrayList = textLayoutBlocks.textLayoutBlocks;
                    } else {
                        t1Var.t3(true);
                        int i12 = t1Var.f23547r0;
                        CharSequence charSequence2 = messageObject.messageText;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                        if (t1Var.f23578t1) {
                            i11 = org.telegram.messenger.v0.C(10.0f, t1Var.f23478m2, i12);
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
                                    int lineForOffset2 = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    textYOffset = lineTop + textLayoutBlock.textYOffset(arrayList, s1Var) + i11 + textLayoutBlock.padTop;
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
        MessagePreviewParams.Messages messages = this.f28004c.f28343r;
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
        lc0 lc0Var = this.f28004c;
        ec0 ec0Var = lc0Var.f28341f;
        int i12 = lc0Var.f28335a;
        MessagePreviewParams.Messages messages = lc0Var.f28343r;
        if (messages != null && b1Var.f46346f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) b1Var.f46343a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Y3(ec0Var.getMeasuredWidth(), ec0Var.getMeasuredHeight());
            if (t1Var.getMessageObject() != null) {
                i11 = t1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                lc0Var.f28340c0.d.checkCurrentLink(lc0Var.f28343r.previewMessages.get(i10));
            }
            MessageObject messageObject = lc0Var.f28343r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = lc0Var.f28343r;
            t1Var.W3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                t1Var.setDelegate(new oa.d(17));
            }
            if (lc0Var.f28343r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t1Var.I3(z10, false);
                if (i11 != lc0Var.f28343r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = lc0Var.f28343r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.K3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        lc0 lc0Var = this.f28004c;
        rc0 rc0Var = lc0Var.f28340c0;
        ic0 ic0Var = new ic0(this, context, rc0Var.f30150w, lc0Var.J, rc0Var.F);
        ic0Var.setClipChildren(false);
        ic0Var.setClipToPadding(false);
        ic0Var.setDelegate(new jc0(this));
        return new s4.b1(ic0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int[] findQuote;
        lc0 lc0Var = this.f28004c;
        dc0 dc0Var = lc0Var.e;
        rc0 rc0Var = lc0Var.f28340c0;
        if (lc0Var.f28343r != null && (i10 = lc0Var.f28335a) != 1) {
            View view = b1Var.f46343a;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = lc0.a(lc0Var, t1Var.getMessageObject());
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
                    t1Var.K3(true, z11, false);
                    MessagePreviewParams messagePreviewParams = rc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && lc0Var.e(t1Var)) {
                        MessageObject messageObject = t1Var.getMessageObject();
                        MessagePreviewParams messagePreviewParams2 = rc0Var.d;
                        MessagePreviewParams messagePreviewParams3 = rc0Var.d;
                        org.telegram.ui.in inVar = messagePreviewParams3.quote;
                        if (inVar.f38279m && messageObject != null && messageObject.richLayout != null && ((i11 = messagePreviewParams3.quoteStart) < 0 || messagePreviewParams3.quoteEnd <= i11)) {
                            String str = inVar.f38275i;
                            if (str == null) {
                                findQuote = null;
                            } else {
                                findQuote = RichQuote.findQuote(messageObject, str, inVar.f38281o);
                            }
                            if (findQuote != null) {
                                messagePreviewParams2.quoteStart = findQuote[0];
                                messagePreviewParams2.quoteEnd = findQuote[1];
                            } else {
                                messagePreviewParams2.quoteStart = 0;
                                messagePreviewParams2.quoteEnd = Math.min(MessagesController.getInstance(rc0Var.f30150w).quoteLengthMax, org.telegram.ui.in.d(messageObject));
                            }
                        }
                    }
                    MessagePreviewParams messagePreviewParams4 = rc0Var.d;
                    if (!messagePreviewParams4.isSecret && messagePreviewParams4.quote != null && messagePreviewParams4.quoteStart >= 0 && lc0Var.e(t1Var) && !dc0Var.x()) {
                        MessagePreviewParams messagePreviewParams5 = rc0Var.d;
                        dc0Var.Z(t1Var, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                        if (lc0Var.f28338b0) {
                            lc0Var.L = D(t1Var, rc0Var.d.quoteStart, false);
                            lc0Var.M = D(t1Var, rc0Var.d.quoteEnd, true);
                            lc0Var.N = true;
                            lc0Var.f28338b0 = false;
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
