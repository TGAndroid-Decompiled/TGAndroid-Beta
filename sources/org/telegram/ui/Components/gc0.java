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
public final class gc0 extends s4.h0 {
    public final hc0 f28533c;

    public gc0(hc0 hc0Var) {
        this.f28533c = hc0Var;
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
                                int y3 = richMessageLayout.textBlocks.get(size).getY() + s1Var.f25252r0;
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
                    if (!TextUtils.isEmpty(messageObject.caption) && (textLayoutBlocks = s1Var.f25044c4) != null) {
                        i11 = (int) s1Var.f25243q4;
                        charSequence = messageObject.caption;
                        arrayList = textLayoutBlocks.textLayoutBlocks;
                    } else {
                        s1Var.w3(true);
                        int i12 = s1Var.f25252r0;
                        CharSequence charSequence2 = messageObject.messageText;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                        if (s1Var.f25283t1) {
                            i11 = org.telegram.messenger.t.D(10.0f, s1Var.f25182m2, i12);
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
        MessagePreviewParams.Messages messages = this.f28533c.f28920r;
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
        hc0 hc0Var = this.f28533c;
        ac0 ac0Var = hc0Var.f28918f;
        int i12 = hc0Var.f28912a;
        MessagePreviewParams.Messages messages = hc0Var.f28920r;
        if (messages != null && e1Var.f47738f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) e1Var.f47735a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.b4(ac0Var.getMeasuredWidth(), ac0Var.getMeasuredHeight());
            if (s1Var.getMessageObject() != null) {
                i11 = s1Var.getMessageObject().getId();
            } else {
                i11 = 0;
            }
            if (i12 == 2) {
                hc0Var.f28917c0.d.checkCurrentLink(hc0Var.f28920r.previewMessages.get(i10));
            }
            MessageObject messageObject = hc0Var.f28920r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = hc0Var.f28920r;
            s1Var.Z3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            boolean z11 = true;
            if (i12 == 1) {
                s1Var.setDelegate(new tb.a(15));
            }
            if (hc0Var.f28920r.previewMessages.size() > 1) {
                if (i12 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s1Var.L3(z10, false);
                if (i11 != hc0Var.f28920r.previewMessages.get(i10).getId()) {
                    z11 = false;
                }
                MessagePreviewParams.Messages messages3 = hc0Var.f28920r;
                boolean z12 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.N3(z12, z12, z11);
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        hc0 hc0Var = this.f28533c;
        nc0 nc0Var = hc0Var.f28917c0;
        ec0 ec0Var = new ec0(this, context, nc0Var.f30961w, hc0Var.J, nc0Var.F);
        ec0Var.setClipChildren(false);
        ec0Var.setClipToPadding(false);
        ec0Var.setDelegate(new fc0(this));
        return new s4.e1(ec0Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int[] findQuote;
        hc0 hc0Var = this.f28533c;
        zb0 zb0Var = hc0Var.e;
        nc0 nc0Var = hc0Var.f28917c0;
        if (hc0Var.f28920r != null && (i10 = hc0Var.f28912a) != 1) {
            View view = e1Var.f47735a;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                if (i10 == 0) {
                    MessageObject.GroupedMessages a2 = hc0.a(hc0Var, s1Var.getMessageObject());
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
                    MessagePreviewParams messagePreviewParams = nc0Var.d;
                    if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && hc0Var.e(s1Var)) {
                        MessageObject messageObject = s1Var.getMessageObject();
                        MessagePreviewParams messagePreviewParams2 = nc0Var.d;
                        MessagePreviewParams messagePreviewParams3 = nc0Var.d;
                        org.telegram.ui.kn knVar = messagePreviewParams3.quote;
                        if (knVar.f40985m && messageObject != null && messageObject.richLayout != null && ((i11 = messagePreviewParams3.quoteStart) < 0 || messagePreviewParams3.quoteEnd <= i11)) {
                            String str = knVar.f40981i;
                            if (str == null) {
                                findQuote = null;
                            } else {
                                findQuote = RichQuote.findQuote(messageObject, str, knVar.f40987o);
                            }
                            if (findQuote != null) {
                                messagePreviewParams2.quoteStart = findQuote[0];
                                messagePreviewParams2.quoteEnd = findQuote[1];
                            } else {
                                messagePreviewParams2.quoteStart = 0;
                                messagePreviewParams2.quoteEnd = Math.min(MessagesController.getInstance(nc0Var.f30961w).quoteLengthMax, org.telegram.ui.kn.d(messageObject));
                            }
                        }
                    }
                    MessagePreviewParams messagePreviewParams4 = nc0Var.d;
                    if (!messagePreviewParams4.isSecret && messagePreviewParams4.quote != null && messagePreviewParams4.quoteStart >= 0 && hc0Var.e(s1Var) && !zb0Var.x()) {
                        MessagePreviewParams messagePreviewParams5 = nc0Var.d;
                        zb0Var.Z(s1Var, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                        if (hc0Var.f28915b0) {
                            hc0Var.L = D(s1Var, nc0Var.d.quoteStart, false);
                            hc0Var.M = D(s1Var, nc0Var.d.quoteEnd, true);
                            hc0Var.N = true;
                            hc0Var.f28915b0 = false;
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
