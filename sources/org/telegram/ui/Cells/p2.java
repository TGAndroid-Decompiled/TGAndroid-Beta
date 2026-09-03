package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
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
public final class p2 {
    public final q2 f21499a;
    public int f21500b;
    public int f21501c;
    public boolean d;
    public boolean e;
    public HashMap f21502f;
    public CharSequence f21503g;

    public p2(q2 q2Var) {
        this.f21499a = q2Var;
    }

    public static void a(p2 p2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        int i11;
        int i12;
        long j10;
        boolean z4;
        int i13;
        boolean z10;
        p2Var.getClass();
        if (messageObject != null && chat != null) {
            i11 = messageObject.getId();
        } else {
            i11 = 0;
        }
        if (p2Var.f21500b != i11 || p2Var.e) {
            p2Var.f21502f = null;
            p2Var.f21501c = 0;
            p2Var.d = false;
            p2Var.e = false;
            p2Var.f21500b = i11;
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.f19159id);
                boolean z11 = true;
                if (topics != null && !topics.isEmpty()) {
                    ArrayList arrayList = new ArrayList(topics);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new kf.d(11)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject != null && !ChatObject.isMonoForum(chat)) {
                        j10 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.f19159id, j10);
                        if (findTopic != null) {
                            CharSequence j11 = ag.f.j(findTopic, textPaint, null);
                            spannableStringBuilder.append(j11);
                            if (findTopic.unread_count > 0) {
                                i13 = j11.length();
                            } else {
                                i13 = 0;
                            }
                            p2Var.f21501c = j11.length();
                            if (messageObject.isOutOwner()) {
                                p2Var.d = false;
                            } else {
                                if (findTopic.unread_count > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                p2Var.d = z10;
                            }
                        } else {
                            p2Var.d = false;
                            i13 = 0;
                        }
                        if (p2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new o2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        j10 = 0;
                        z4 = false;
                        i13 = 0;
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        p2Var.f21502f = new HashMap();
                        for (int i14 = 0; i14 < Math.min(4, arrayList.size()); i14++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i14)).from_id);
                            org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(i10, p2Var.f21499a);
                            k5Var.h = false;
                            k5Var.c(peerDialogId);
                            p2Var.f21502f.put(Long.valueOf(peerDialogId), k5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(k5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i15 = 0;
                        for (int i16 = 4; i15 < Math.min(i16, arrayList.size()); i16 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i15)).f19211id != j10) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z11 && z4) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(ag.f.j((TLRPC.ForumTopic) arrayList.get(i15), textPaint, null));
                                z11 = false;
                            }
                            i15++;
                        }
                    }
                    if (i13 > 0) {
                        Typeface bold = AndroidUtilities.bold();
                        int i17 = org.telegram.ui.ActionBar.j6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f24804a = bold;
                        metricAffectingSpan.f24806c = i17;
                        metricAffectingSpan.f24805b = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i13 + 2), 0);
                    }
                    p2Var.f21503g = spannableStringBuilder;
                } else if (!MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.f19159id)) {
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.f19159id);
                    p2Var.f21503g = LocaleController.getString(R.string.Loading);
                    p2Var.e = true;
                } else {
                    if (ChatObject.isMonoForum(chat)) {
                        i12 = R.string.NoMonoforumTopicsCreated;
                    } else {
                        i12 = R.string.NoTopicsCreated;
                    }
                    p2Var.f21503g = LocaleController.getString(i12);
                }
            }
        }
    }
}
