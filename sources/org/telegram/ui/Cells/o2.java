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
public final class o2 {
    public final p2 f24792a;
    public int f24793b;
    public int f24794c;
    public boolean d;
    public boolean f24795e;
    public HashMap f24796f;
    public CharSequence f24797g;

    public o2(p2 p2Var) {
        this.f24792a = p2Var;
    }

    public static void a(o2 o2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        int i11;
        int i12;
        long j10;
        boolean z10;
        int i13;
        boolean z11;
        o2Var.getClass();
        if (messageObject != null && chat != null) {
            i11 = messageObject.getId();
        } else {
            i11 = 0;
        }
        if (o2Var.f24793b != i11 || o2Var.f24795e) {
            o2Var.f24796f = null;
            o2Var.f24794c = 0;
            o2Var.d = false;
            o2Var.f24795e = false;
            o2Var.f24793b = i11;
            TextPaint textPaint = org.telegram.ui.ActionBar.g6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.f22392id);
                boolean z12 = true;
                if (topics != null && !topics.isEmpty()) {
                    ArrayList arrayList = new ArrayList(topics);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new jf.d(11)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject != null && !ChatObject.isMonoForum(chat)) {
                        j10 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.f22392id, j10);
                        if (findTopic != null) {
                            CharSequence j11 = yf.d.j(findTopic, textPaint, null);
                            spannableStringBuilder.append(j11);
                            if (findTopic.unread_count > 0) {
                                i13 = j11.length();
                            } else {
                                i13 = 0;
                            }
                            o2Var.f24794c = j11.length();
                            if (messageObject.isOutOwner()) {
                                o2Var.d = false;
                            } else {
                                if (findTopic.unread_count > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                o2Var.d = z11;
                            }
                        } else {
                            o2Var.d = false;
                            i13 = 0;
                        }
                        if (o2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new n2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        j10 = 0;
                        z10 = false;
                        i13 = 0;
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        o2Var.f24796f = new HashMap();
                        for (int i14 = 0; i14 < Math.min(4, arrayList.size()); i14++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i14)).from_id);
                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(i10, o2Var.f24792a);
                            g5Var.h = false;
                            g5Var.c(peerDialogId);
                            o2Var.f24796f.put(Long.valueOf(peerDialogId), g5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(g5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i15 = 0;
                        for (int i16 = 4; i15 < Math.min(i16, arrayList.size()); i16 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i15)).f22444id != j10) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z12 && z10) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(yf.d.j((TLRPC.ForumTopic) arrayList.get(i15), textPaint, null));
                                z12 = false;
                            }
                            i15++;
                        }
                    }
                    if (i13 > 0) {
                        Typeface bold = AndroidUtilities.bold();
                        int i17 = org.telegram.ui.ActionBar.g6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f32866a = bold;
                        metricAffectingSpan.f32868c = i17;
                        metricAffectingSpan.f32867b = org.telegram.ui.ActionBar.g6.w0(null, i17, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i13 + 2), 0);
                    }
                    o2Var.f24797g = spannableStringBuilder;
                } else if (!MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.f22392id)) {
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.f22392id);
                    o2Var.f24797g = LocaleController.getString(R.string.Loading);
                    o2Var.f24795e = true;
                } else {
                    if (ChatObject.isMonoForum(chat)) {
                        i12 = R.string.NoMonoforumTopicsCreated;
                    } else {
                        i12 = R.string.NoTopicsCreated;
                    }
                    o2Var.f24797g = LocaleController.getString(i12);
                }
            }
        }
    }
}
