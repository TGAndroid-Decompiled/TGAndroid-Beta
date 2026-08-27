package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;

public final class o2 {

    public final p2 f24772a;

    public int f24773b;

    public int f24774c;
    public boolean d;

    public boolean f24775e;

    public HashMap f24776f;

    public CharSequence f24777g;

    public o2(p2 p2Var) {
        this.f24772a = p2Var;
    }

    public static void a(o2 o2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        long topicId;
        boolean z10;
        int length;
        o2Var.getClass();
        int id2 = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (o2Var.f24773b != id2 || o2Var.f24775e) {
            o2Var.f24776f = null;
            o2Var.f24774c = 0;
            o2Var.d = false;
            o2Var.f24775e = false;
            o2Var.f24773b = id2;
            TextPaint textPaint = org.telegram.ui.ActionBar.g6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.f22380id);
                boolean z11 = true;
                if (topics == null || topics.isEmpty()) {
                    if (MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.f22380id)) {
                        o2Var.f24777g = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.f22380id);
                    o2Var.f24777g = LocaleController.getString(R.string.Loading);
                    o2Var.f24775e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(topics);
                Collections.sort(arrayList, Comparator$CC.comparingInt(new gf.d(11)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (messageObject == null || ChatObject.isMonoForum(chat)) {
                    topicId = 0;
                    z10 = false;
                    length = 0;
                } else {
                    topicId = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.f22380id, topicId);
                    if (tL_forumTopicFindTopic != null) {
                        CharSequence charSequenceJ = wf.c.j(tL_forumTopicFindTopic, textPaint, null);
                        spannableStringBuilder.append(charSequenceJ);
                        length = tL_forumTopicFindTopic.unread_count > 0 ? charSequenceJ.length() : 0;
                        o2Var.f24774c = charSequenceJ.length();
                        if (messageObject.isOutOwner()) {
                            o2Var.d = false;
                        } else {
                            o2Var.d = tL_forumTopicFindTopic.unread_count > 0;
                        }
                    } else {
                        o2Var.d = false;
                        length = 0;
                    }
                    if (o2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new n2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (ChatObject.isMonoForum(chat)) {
                    o2Var.f24776f = new HashMap();
                    for (int i11 = 0; i11 < Math.min(4, arrayList.size()); i11++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i11)).from_id);
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(i10, o2Var.f24772a);
                        g5Var.h = false;
                        g5Var.c(peerDialogId);
                        o2Var.f24776f.put(Long.valueOf(peerDialogId), g5Var);
                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                        spannableStringBuilderValueOf.insert(0, (CharSequence) "  ");
                        spannableStringBuilderValueOf.setSpan(g5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) spannableStringBuilderValueOf);
                    }
                } else {
                    int i12 = 0;
                    for (int i13 = 4; i12 < Math.min(i13, arrayList.size()); i13 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i12)).f22432id != topicId) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z11 && z10) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(wf.c.j((TLRPC.ForumTopic) arrayList.get(i12), textPaint, null));
                            z11 = false;
                        }
                        i12++;
                    }
                }
                if (length > 0) {
                    Typeface typefaceBold = AndroidUtilities.bold();
                    int i14 = org.telegram.ui.ActionBar.g6.X8;
                    k41 k41Var = new k41();
                    k41Var.f29944a = typefaceBold;
                    k41Var.f29946c = i14;
                    k41Var.f29945b = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
                    spannableStringBuilder.setSpan(k41Var, 0, Math.min(spannableStringBuilder.length(), length + 2), 0);
                }
                o2Var.f24777g = spannableStringBuilder;
            }
        }
    }
}
