package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gr0 extends org.telegram.ui.ActionBar.j {
    public final or0 f46061a;

    public gr0(or0 or0Var) {
        this.f46061a = or0Var;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        or0 or0Var = this.f46061a;
        boolean[] zArr = or0Var.f48538x;
        CharSequence[] charSequenceArr = or0Var.f48536w;
        an anVar = or0Var.f48516f;
        if (i7 == -1) {
            if (or0Var.m0(true)) {
                or0Var.finishFragment();
            }
        } else if (i7 == 1) {
            int i17 = 0;
            if (or0Var.f48513d0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.bn.d0(or0Var.E)};
                i14 = ((org.telegram.ui.ActionBar.f2) or0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.ui.b0(i14).W(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = W.size();
                for (int i18 = 0; i18 < size; i18++) {
                    TLRPC.MessageEntity messageEntity = W.get(i18);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = or0Var.H;
                todoList.others_can_complete = or0Var.J;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = W;
                if (or0Var.f48529r != null) {
                    int i19 = 0;
                    i15 = 0;
                    while (true) {
                        int[] iArr = or0Var.f48529r;
                        if (i19 >= iArr.length) {
                            break;
                        }
                        i15 = Math.max(i15, iArr[i19]);
                        i19++;
                    }
                } else {
                    i15 = 0;
                }
                for (int i20 = 0; i20 < charSequenceArr.length; i20++) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(charSequenceArr[i20]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.bn.d0(charSequenceArr[i20])};
                        i16 = ((org.telegram.ui.ActionBar.f2) or0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.ui.b0(i16).W(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = W2.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            TLRPC.MessageEntity messageEntity2 = W2.get(i21);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = W2;
                        int[] iArr2 = or0Var.f48529r;
                        if (iArr2 != null && i20 < iArr2.length) {
                            todoItem.f27099id = iArr2[i20];
                        } else {
                            i15++;
                            todoItem.f27099id = i15;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (anVar.c()) {
                    org.telegram.ui.Components.v4.I(anVar.getParentActivity(), anVar.a(), new lk0(5, this, tL_messageMediaToDo));
                    return;
                }
                or0Var.f48515e0.a(tL_messageMediaToDo);
                or0Var.finishFragment();
            } else if (!or0Var.L || or0Var.f48507a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.bn.d0(or0Var.E)};
                i10 = ((org.telegram.ui.ActionBar.f2) or0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.ui.b0(i10).W(charSequenceArr4, true, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = W3.size();
                for (int i22 = 0; i22 < size3; i22++) {
                    TLRPC.MessageEntity messageEntity3 = W3.get(i22);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = or0Var.K;
                tL_poll.quiz = or0Var.L;
                tL_poll.public_voters = !or0Var.G;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = W3;
                ArrayList arrayList = new ArrayList(or0Var.f48524n);
                int i23 = 0;
                while (i23 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(charSequenceArr[i23]))) {
                        i13 = i17;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i17] = org.telegram.ui.Components.bn.d0(charSequenceArr[i23]);
                        i12 = ((org.telegram.ui.ActionBar.f2) or0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.ui.b0(i12).W(charSequenceArr5, true, true);
                        CharSequence charSequence4 = charSequenceArr5[i17];
                        int size4 = W4.size();
                        int i24 = i17;
                        while (i24 < size4) {
                            TLRPC.MessageEntity messageEntity4 = W4.get(i24);
                            int i25 = i17;
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                            i24++;
                            i17 = i25;
                        }
                        i13 = i17;
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = W4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i13] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((or0Var.K || or0Var.L) && zArr[i23]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i23++;
                    i17 = i13;
                }
                int i26 = i17;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence d02 = org.telegram.ui.Components.bn.d0(or0Var.F);
                if (d02 != null) {
                    tL_messageMediaPoll.results.solution = d02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i26] = d02;
                    i11 = ((org.telegram.ui.ActionBar.f2) or0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.ui.b0(i11).W(charSequenceArr6, true, true);
                    if (W5 != null && !W5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = W5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (anVar.c()) {
                    org.telegram.ui.Components.v4.I(anVar.getParentActivity(), anVar.a(), new lk0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                or0Var.f48515e0.a(tL_messageMediaPoll);
                or0Var.finishFragment();
            } else {
                int i27 = 0;
                while (i17 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(charSequenceArr[i17])) && zArr[i17]) {
                        i27++;
                    }
                    i17++;
                }
                if (i27 <= 0) {
                    for (int i28 = or0Var.f48525n0; i28 < or0Var.f48525n0 + or0Var.D; i28++) {
                        v4.d1 K = or0Var.f48511c.K(i28);
                        if (K != null) {
                            View view = K.f56927a;
                            if (view instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    or0Var.h.c(a6Var.getCheckBox());
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }
}
