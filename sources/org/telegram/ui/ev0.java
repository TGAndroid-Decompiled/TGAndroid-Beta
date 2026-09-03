package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ev0 extends org.telegram.ui.ActionBar.j {
    public final mv0 f36596a;

    public ev0(mv0 mv0Var) {
        this.f36596a = mv0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        mv0 mv0Var = this.f36596a;
        boolean[] zArr = mv0Var.f39118w;
        CharSequence[] charSequenceArr = mv0Var.v;
        xn xnVar = mv0Var.f39098f;
        if (i10 == -1) {
            if (mv0Var.h0(true)) {
                mv0Var.finishFragment();
            }
        } else if (i10 == 1) {
            int i17 = 0;
            if (mv0Var.f39090a0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.rn.Y(mv0Var.B)};
                i14 = ((org.telegram.ui.ActionBar.p2) mv0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = entities.size();
                for (int i18 = 0; i18 < size; i18++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i18);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = mv0Var.E;
                todoList.others_can_complete = mv0Var.G;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (mv0Var.f39111r != null) {
                    int i19 = 0;
                    i15 = 0;
                    while (true) {
                        int[] iArr = mv0Var.f39111r;
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
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.rn.Y(charSequenceArr[i20]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.rn.Y(charSequenceArr[i20])};
                        i16 = ((org.telegram.ui.ActionBar.p2) mv0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i16).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = entities2.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i21);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        int[] iArr2 = mv0Var.f39111r;
                        if (iArr2 != null && i20 < iArr2.length) {
                            todoItem.f20990id = iArr2[i20];
                        } else {
                            i15++;
                            todoItem.f20990id = i15;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (xnVar.c()) {
                    org.telegram.ui.Components.z4.L(xnVar.getParentActivity(), xnVar.a(), new vl0(8, this, tL_messageMediaToDo));
                    return;
                }
                mv0Var.f39092b0.a(tL_messageMediaToDo);
                mv0Var.finishFragment();
            } else if (!mv0Var.I || mv0Var.f39089a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.rn.Y(mv0Var.B)};
                i11 = ((org.telegram.ui.ActionBar.p2) mv0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i11).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = entities3.size();
                for (int i22 = 0; i22 < size3; i22++) {
                    TLRPC.MessageEntity messageEntity3 = entities3.get(i22);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = mv0Var.H;
                tL_poll.quiz = mv0Var.I;
                tL_poll.public_voters = !mv0Var.D;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(mv0Var.f39106n);
                int i23 = 0;
                while (i23 < charSequenceArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.rn.Y(charSequenceArr[i23]))) {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i17] = org.telegram.ui.Components.rn.Y(charSequenceArr[i23]);
                        i13 = ((org.telegram.ui.ActionBar.p2) mv0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i13).getEntities(charSequenceArr5, true);
                        CharSequence charSequence4 = charSequenceArr5[i17];
                        int size4 = entities4.size();
                        for (int i24 = 0; i24 < size4; i24++) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i24);
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        tL_pollAnswer.option = r10;
                        byte[] bArr = {(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                        if ((mv0Var.H || mv0Var.I) && zArr[i23]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i23++;
                    i17 = 0;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y = org.telegram.ui.Components.rn.Y(mv0Var.C);
                if (Y != null) {
                    tL_messageMediaPoll.results.solution = Y.toString();
                    CharSequence[] charSequenceArr6 = {Y};
                    i12 = ((org.telegram.ui.ActionBar.p2) mv0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i12).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (xnVar.c()) {
                    org.telegram.ui.Components.z4.L(xnVar.getParentActivity(), xnVar.a(), new vl0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                mv0Var.f39092b0.a(tL_messageMediaPoll);
                mv0Var.finishFragment();
            } else {
                int i25 = 0;
                while (i17 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.rn.Y(charSequenceArr[i17])) && zArr[i17]) {
                        i25++;
                    }
                    i17++;
                }
                if (i25 <= 0) {
                    mv0Var.f39093c.getChildCount();
                    for (int i26 = mv0Var.f39104k0; i26 < mv0Var.f39104k0 + mv0Var.f39122y; i26++) {
                        f2.m1 K = mv0Var.f39093c.K(i26);
                        if (K != null) {
                            View view = K.f5875a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    mv0Var.h.f(c6Var.getCheckBox(), true);
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
