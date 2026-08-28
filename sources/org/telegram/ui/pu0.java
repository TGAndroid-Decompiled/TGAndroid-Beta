package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class pu0 extends org.telegram.ui.ActionBar.j {
    public final xu0 f41591a;

    public pu0(xu0 xu0Var) {
        this.f41591a = xu0Var;
    }

    @Override
    public final void b(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        xu0 xu0Var = this.f41591a;
        boolean[] zArr = xu0Var.f44636w;
        CharSequence[] charSequenceArr = xu0Var.v;
        qn qnVar = xu0Var.f44616f;
        if (i9 == -1) {
            if (xu0Var.g0(true)) {
                xu0Var.finishFragment();
            }
        } else if (i9 == 1) {
            int i16 = 0;
            if (xu0Var.Z) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.jn.X(xu0Var.A)};
                i13 = ((org.telegram.ui.ActionBar.o2) xu0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = entities.size();
                for (int i17 = 0; i17 < size; i17++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i17);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = xu0Var.D;
                todoList.others_can_complete = xu0Var.F;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (xu0Var.f44629r != null) {
                    int i18 = 0;
                    i14 = 0;
                    while (true) {
                        int[] iArr = xu0Var.f44629r;
                        if (i18 >= iArr.length) {
                            break;
                        }
                        i14 = Math.max(i14, iArr[i18]);
                        i18++;
                    }
                } else {
                    i14 = 0;
                }
                for (int i19 = 0; i19 < charSequenceArr.length; i19++) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.X(charSequenceArr[i19]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.jn.X(charSequenceArr[i19])};
                        i15 = ((org.telegram.ui.ActionBar.o2) xu0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i15).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = entities2.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i20);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        int[] iArr2 = xu0Var.f44629r;
                        if (iArr2 != null && i19 < iArr2.length) {
                            todoItem.f22525id = iArr2[i19];
                        } else {
                            i14++;
                            todoItem.f22525id = i14;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (qnVar.c()) {
                    org.telegram.ui.Components.y4.L(qnVar.getParentActivity(), qnVar.a(), new nl0(9, this, tL_messageMediaToDo));
                    return;
                }
                xu0Var.f44608a0.b(tL_messageMediaToDo);
                xu0Var.finishFragment();
            } else if (!xu0Var.H || xu0Var.f44607a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.jn.X(xu0Var.A)};
                i10 = ((org.telegram.ui.ActionBar.o2) xu0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i10).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = entities3.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    TLRPC.MessageEntity messageEntity3 = entities3.get(i21);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = xu0Var.G;
                tL_poll.quiz = xu0Var.H;
                tL_poll.public_voters = !xu0Var.C;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(xu0Var.f44624n);
                int i22 = 0;
                while (i22 < charSequenceArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.X(charSequenceArr[i22]))) {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i16] = org.telegram.ui.Components.jn.X(charSequenceArr[i22]);
                        i12 = ((org.telegram.ui.ActionBar.o2) xu0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i12).getEntities(charSequenceArr5, true);
                        CharSequence charSequence4 = charSequenceArr5[i16];
                        int size4 = entities4.size();
                        for (int i23 = 0; i23 < size4; i23++) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i23);
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
                        if ((xu0Var.G || xu0Var.H) && zArr[i22]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i22++;
                    i16 = 0;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence X = org.telegram.ui.Components.jn.X(xu0Var.B);
                if (X != null) {
                    tL_messageMediaPoll.results.solution = X.toString();
                    CharSequence[] charSequenceArr6 = {X};
                    i11 = ((org.telegram.ui.ActionBar.o2) xu0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i11).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (qnVar.c()) {
                    org.telegram.ui.Components.y4.L(qnVar.getParentActivity(), qnVar.a(), new nl0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                xu0Var.f44608a0.b(tL_messageMediaPoll);
                xu0Var.finishFragment();
            } else {
                int i24 = 0;
                while (i16 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.X(charSequenceArr[i16])) && zArr[i16]) {
                        i24++;
                    }
                    i16++;
                }
                if (i24 <= 0) {
                    xu0Var.f44611c.getChildCount();
                    for (int i25 = xu0Var.f44621j0; i25 < xu0Var.f44621j0 + xu0Var.f44640y; i25++) {
                        f2.q1 K = xu0Var.f44611c.K(i25);
                        if (K != null) {
                            View view = K.f5501a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    xu0Var.h.f(c6Var.getCheckBox(), true);
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
