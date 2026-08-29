package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class nu0 extends org.telegram.ui.ActionBar.k {
    public final vu0 f40906a;

    public nu0(vu0 vu0Var) {
        this.f40906a = vu0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        vu0 vu0Var = this.f40906a;
        boolean[] zArr = vu0Var.f43781w;
        CharSequence[] charSequenceArr = vu0Var.v;
        tn tnVar = vu0Var.f43761f;
        if (i10 == -1) {
            if (vu0Var.h0(true)) {
                vu0Var.finishFragment();
            }
        } else if (i10 == 1) {
            int i17 = 0;
            if (vu0Var.Z) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.on.Y(vu0Var.A)};
                i14 = ((org.telegram.ui.ActionBar.o2) vu0Var).currentAccount;
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
                todoList.others_can_append = vu0Var.D;
                todoList.others_can_complete = vu0Var.F;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (vu0Var.f43774r != null) {
                    int i19 = 0;
                    i15 = 0;
                    while (true) {
                        int[] iArr = vu0Var.f43774r;
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
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.on.Y(charSequenceArr[i20]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.on.Y(charSequenceArr[i20])};
                        i16 = ((org.telegram.ui.ActionBar.o2) vu0Var).currentAccount;
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
                        int[] iArr2 = vu0Var.f43774r;
                        if (iArr2 != null && i20 < iArr2.length) {
                            todoItem.f22537id = iArr2[i20];
                        } else {
                            i15++;
                            todoItem.f22537id = i15;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (tnVar.c()) {
                    org.telegram.ui.Components.c5.L(tnVar.getParentActivity(), tnVar.a(), new kl0(9, this, tL_messageMediaToDo));
                    return;
                }
                vu0Var.f43753a0.a(tL_messageMediaToDo);
                vu0Var.finishFragment();
            } else if (!vu0Var.H || vu0Var.f43752a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.on.Y(vu0Var.A)};
                i11 = ((org.telegram.ui.ActionBar.o2) vu0Var).currentAccount;
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
                tL_poll.multiple_choice = vu0Var.G;
                tL_poll.quiz = vu0Var.H;
                tL_poll.public_voters = !vu0Var.C;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(vu0Var.f43769n);
                int i23 = 0;
                while (i23 < charSequenceArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.on.Y(charSequenceArr[i23]))) {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i17] = org.telegram.ui.Components.on.Y(charSequenceArr[i23]);
                        i13 = ((org.telegram.ui.ActionBar.o2) vu0Var).currentAccount;
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
                        if ((vu0Var.G || vu0Var.H) && zArr[i23]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i23++;
                    i17 = 0;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y = org.telegram.ui.Components.on.Y(vu0Var.B);
                if (Y != null) {
                    tL_messageMediaPoll.results.solution = Y.toString();
                    CharSequence[] charSequenceArr6 = {Y};
                    i12 = ((org.telegram.ui.ActionBar.o2) vu0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i12).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (tnVar.c()) {
                    org.telegram.ui.Components.c5.L(tnVar.getParentActivity(), tnVar.a(), new kl0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                vu0Var.f43753a0.a(tL_messageMediaPoll);
                vu0Var.finishFragment();
            } else {
                int i25 = 0;
                while (i17 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.on.Y(charSequenceArr[i17])) && zArr[i17]) {
                        i25++;
                    }
                    i17++;
                }
                if (i25 <= 0) {
                    vu0Var.f43756c.getChildCount();
                    for (int i26 = vu0Var.f43766j0; i26 < vu0Var.f43766j0 + vu0Var.f43785y; i26++) {
                        f2.n1 K = vu0Var.f43756c.K(i26);
                        if (K != null) {
                            View view = K.f6432a;
                            if (view instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                if (a6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    vu0Var.h.f(a6Var.getCheckBox(), true);
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
