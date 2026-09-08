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
public final class q2 {
    public final r2 f22510a;
    public int f22511b;
    public int f22512c;
    public boolean d;
    public boolean f22513e;
    public HashMap f22514f;
    public CharSequence f22515g;

    public q2(r2 r2Var) {
        this.f22510a = r2Var;
    }

    public static void a(q2 q2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        int i11;
        int i12;
        long j3;
        boolean z10;
        int i13;
        boolean z11;
        q2Var.getClass();
        if (messageObject != null && chat != null) {
            i11 = messageObject.getId();
        } else {
            i11 = 0;
        }
        if (q2Var.f22511b != i11 || q2Var.f22513e) {
            q2Var.f22514f = null;
            q2Var.f22512c = 0;
            q2Var.d = false;
            q2Var.f22513e = false;
            q2Var.f22511b = i11;
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.f19896id);
                boolean z12 = true;
                if (topics != null && !topics.isEmpty()) {
                    ArrayList arrayList = new ArrayList(topics);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.o6(5)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject != null && !ChatObject.isMonoForum(chat)) {
                        j3 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.f19896id, j3);
                        if (findTopic != null) {
                            CharSequence j10 = og.d.j(findTopic, textPaint, null);
                            spannableStringBuilder.append(j10);
                            if (findTopic.unread_count > 0) {
                                i13 = j10.length();
                            } else {
                                i13 = 0;
                            }
                            q2Var.f22512c = j10.length();
                            if (messageObject.isOutOwner()) {
                                q2Var.d = false;
                            } else {
                                if (findTopic.unread_count > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                q2Var.d = z11;
                            }
                        } else {
                            q2Var.d = false;
                            i13 = 0;
                        }
                        if (q2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        j3 = 0;
                        z10 = false;
                        i13 = 0;
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        q2Var.f22514f = new HashMap();
                        for (int i14 = 0; i14 < Math.min(4, arrayList.size()); i14++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i14)).from_id);
                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(i10, q2Var.f22510a);
                            g5Var.h = false;
                            g5Var.c(peerDialogId);
                            q2Var.f22514f.put(Long.valueOf(peerDialogId), g5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(g5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i15 = 0;
                        for (int i16 = 4; i15 < Math.min(i16, arrayList.size()); i16 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i15)).f19948id != j3) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z12 && z10) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(og.d.j((TLRPC.ForumTopic) arrayList.get(i15), textPaint, null));
                                z12 = false;
                            }
                            i15++;
                        }
                    }
                    if (i13 > 0) {
                        Typeface bold = AndroidUtilities.bold();
                        int i17 = org.telegram.ui.ActionBar.j6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f25587a = bold;
                        metricAffectingSpan.f25589c = i17;
                        metricAffectingSpan.f25588b = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i13 + 2), 0);
                    }
                    q2Var.f22515g = spannableStringBuilder;
                } else if (!MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.f19896id)) {
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.f19896id);
                    q2Var.f22515g = LocaleController.getString(R.string.Loading);
                    q2Var.f22513e = true;
                } else {
                    if (ChatObject.isMonoForum(chat)) {
                        i12 = R.string.NoMonoforumTopicsCreated;
                    } else {
                        i12 = R.string.NoTopicsCreated;
                    }
                    q2Var.f22515g = LocaleController.getString(i12);
                }
            }
        }
    }
}
