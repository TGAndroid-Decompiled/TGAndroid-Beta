package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fr0 extends org.telegram.ui.ActionBar.j {
    public final nr0 f47172a;

    public fr0(nr0 nr0Var) {
        this.f47172a = nr0Var;
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
        nr0 nr0Var = this.f47172a;
        boolean[] zArr = nr0Var.f49635x;
        CharSequence[] charSequenceArr = nr0Var.f49633w;
        an anVar = nr0Var.f49613f;
        if (i7 == -1) {
            if (nr0Var.m0(true)) {
                nr0Var.finishFragment();
            }
        } else if (i7 == 1) {
            int i17 = 0;
            if (nr0Var.f49612e0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.jn.d0(nr0Var.F)};
                i14 = ((org.telegram.ui.ActionBar.e2) nr0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.si.b0(i14).W(charSequenceArr2, true, true);
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
                todoList.others_can_append = nr0Var.I;
                todoList.others_can_complete = nr0Var.K;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = W;
                if (nr0Var.f49626r != null) {
                    int i19 = 0;
                    i15 = 0;
                    while (true) {
                        int[] iArr = nr0Var.f49626r;
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
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.d0(charSequenceArr[i20]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.jn.d0(charSequenceArr[i20])};
                        i16 = ((org.telegram.ui.ActionBar.e2) nr0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.si.b0(i16).W(charSequenceArr3, true, true);
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
                        int[] iArr2 = nr0Var.f49626r;
                        if (iArr2 != null && i20 < iArr2.length) {
                            todoItem.f28198id = iArr2[i20];
                        } else {
                            i15++;
                            todoItem.f28198id = i15;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (anVar.c()) {
                    org.telegram.ui.Components.t4.I(anVar.getParentActivity(), anVar.a(), new xi0(9, this, tL_messageMediaToDo));
                    return;
                }
                nr0Var.f49614f0.a(tL_messageMediaToDo);
                nr0Var.finishFragment();
            } else if (!nr0Var.M || nr0Var.f49604a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.jn.d0(nr0Var.F)};
                i10 = ((org.telegram.ui.ActionBar.e2) nr0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.si.b0(i10).W(charSequenceArr4, true, true);
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
                tL_poll.multiple_choice = nr0Var.L;
                tL_poll.quiz = nr0Var.M;
                tL_poll.public_voters = !nr0Var.H;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = W3;
                ArrayList arrayList = new ArrayList(nr0Var.f49621n);
                int i23 = 0;
                while (i23 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(org.telegram.ui.Components.jn.d0(charSequenceArr[i23]))) {
                        i13 = i17;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i17] = org.telegram.ui.Components.jn.d0(charSequenceArr[i23]);
                        i12 = ((org.telegram.ui.ActionBar.e2) nr0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.si.b0(i12).W(charSequenceArr5, true, true);
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
                        if ((nr0Var.L || nr0Var.M) && zArr[i23]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i23++;
                    i17 = i13;
                }
                int i26 = i17;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence d02 = org.telegram.ui.Components.jn.d0(nr0Var.G);
                if (d02 != null) {
                    tL_messageMediaPoll.results.solution = d02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i26] = d02;
                    i11 = ((org.telegram.ui.ActionBar.e2) nr0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.si.b0(i11).W(charSequenceArr6, true, true);
                    if (W5 != null && !W5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = W5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (anVar.c()) {
                    org.telegram.ui.Components.t4.I(anVar.getParentActivity(), anVar.a(), new xi0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                nr0Var.f49614f0.a(tL_messageMediaPoll);
                nr0Var.finishFragment();
            } else {
                int i27 = 0;
                while (i17 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.d0(charSequenceArr[i17])) && zArr[i17]) {
                        i27++;
                    }
                    i17++;
                }
                if (i27 <= 0) {
                    for (int i28 = nr0Var.f49623o0; i28 < nr0Var.f49623o0 + nr0Var.E; i28++) {
                        v4.e1 K = nr0Var.f49608c.K(i28);
                        if (K != null) {
                            View view = K.f58535a;
                            if (view instanceof org.telegram.ui.Cells.z5) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    nr0Var.h.c(z5Var.getCheckBox());
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
