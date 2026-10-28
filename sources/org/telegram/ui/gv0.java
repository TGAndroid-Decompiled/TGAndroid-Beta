package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class gv0 extends org.telegram.ui.ActionBar.j {
    public final ov0 f39697a;

    public gv0(ov0 ov0Var) {
        this.f39697a = ov0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ov0 ov0Var = this.f39697a;
        boolean[] zArr = ov0Var.f42235w;
        CharSequence[] charSequenceArr = ov0Var.v;
        wn wnVar = ov0Var.f42215f;
        if (i10 == -1) {
            if (ov0Var.i0(true)) {
                ov0Var.finishFragment();
            }
        } else if (i10 == 1) {
            int i18 = 0;
            if (ov0Var.f42213d0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.go.b0(ov0Var.E)};
                i15 = ((org.telegram.ui.ActionBar.r2) ov0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i15).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = entities.size();
                for (int i19 = 0; i19 < size; i19++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i19);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = ov0Var.H;
                todoList.others_can_complete = ov0Var.J;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (ov0Var.f42228r != null) {
                    int i20 = 0;
                    i16 = 0;
                    while (true) {
                        int[] iArr = ov0Var.f42228r;
                        if (i20 >= iArr.length) {
                            break;
                        }
                        i16 = Math.max(i16, iArr[i20]);
                        i20++;
                    }
                } else {
                    i16 = 0;
                }
                for (int i21 = 0; i21 < charSequenceArr.length; i21++) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.go.b0(charSequenceArr[i21]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.go.b0(charSequenceArr[i21])};
                        i17 = ((org.telegram.ui.ActionBar.r2) ov0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i17).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = entities2.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i22);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        int[] iArr2 = ov0Var.f42228r;
                        if (iArr2 != null && i21 < iArr2.length) {
                            todoItem.f22175id = iArr2[i21];
                        } else {
                            i16++;
                            todoItem.f22175id = i16;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (wnVar.c()) {
                    org.telegram.ui.Components.g5.K(wnVar.getParentActivity(), wnVar.a(), new cf0(11, this, tL_messageMediaToDo));
                    return;
                }
                ov0Var.f42214e0.a(tL_messageMediaToDo);
                ov0Var.finishFragment();
            } else if (!ov0Var.L || ov0Var.f42207a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.go.b0(ov0Var.E)};
                i11 = ((org.telegram.ui.ActionBar.r2) ov0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i11).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = entities3.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    TLRPC.MessageEntity messageEntity3 = entities3.get(i23);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = ov0Var.K;
                tL_poll.quiz = ov0Var.L;
                tL_poll.public_voters = !ov0Var.G;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(ov0Var.f42223n);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(org.telegram.ui.Components.go.b0(charSequenceArr[i24]))) {
                        i14 = i18;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i18] = org.telegram.ui.Components.go.b0(charSequenceArr[i24]);
                        i13 = ((org.telegram.ui.ActionBar.r2) ov0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i13).getEntities(charSequenceArr5, true);
                        CharSequence charSequence4 = charSequenceArr5[i18];
                        int size4 = entities4.size();
                        int i25 = i18;
                        while (i25 < size4) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i25);
                            int i26 = i18;
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                            i25++;
                            i18 = i26;
                        }
                        i14 = i18;
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i14] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((ov0Var.K || ov0Var.L) && zArr[i24]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i18 = i14;
                }
                int i27 = i18;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence b02 = org.telegram.ui.Components.go.b0(ov0Var.F);
                if (b02 != null) {
                    tL_messageMediaPoll.results.solution = b02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i27] = b02;
                    i12 = ((org.telegram.ui.ActionBar.r2) ov0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i12).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (wnVar.c()) {
                    org.telegram.ui.Components.g5.K(wnVar.getParentActivity(), wnVar.a(), new cf0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                ov0Var.f42214e0.a(tL_messageMediaPoll);
                ov0Var.finishFragment();
            } else {
                int i28 = 0;
                while (i18 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.go.b0(charSequenceArr[i18])) && zArr[i18]) {
                        i28++;
                    }
                    i18++;
                }
                if (i28 <= 0) {
                    for (int i29 = ov0Var.f42224n0; i29 < ov0Var.f42224n0 + ov0Var.f42239y; i29++) {
                        s4.e1 K = ov0Var.f42211c.K(i29);
                        if (K != null) {
                            View view = K.f47773a;
                            if (view instanceof org.telegram.ui.Cells.h6) {
                                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                                if (h6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    ov0Var.h.f(h6Var.getCheckBox(), true);
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
