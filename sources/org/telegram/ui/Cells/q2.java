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
    public final r2 f24894a;
    public int f24895b;
    public int f24896c;
    public boolean d;
    public boolean f24897e;
    public HashMap f24898f;
    public CharSequence f24899g;

    public q2(r2 r2Var) {
        this.f24894a = r2Var;
    }

    public static void a(q2 q2Var, int i9, MessageObject messageObject, TLRPC.Chat chat) {
        int i10;
        int i11;
        long j10;
        boolean z10;
        int i12;
        boolean z11;
        q2Var.getClass();
        if (messageObject != null && chat != null) {
            i10 = messageObject.getId();
        } else {
            i10 = 0;
        }
        if (q2Var.f24895b != i10 || q2Var.f24897e) {
            q2Var.f24898f = null;
            q2Var.f24896c = 0;
            q2Var.d = false;
            q2Var.f24897e = false;
            q2Var.f24895b = i10;
            TextPaint textPaint = org.telegram.ui.ActionBar.f6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i9).getTopicsController().getTopics(chat.f22380id);
                boolean z12 = true;
                if (topics != null && !topics.isEmpty()) {
                    ArrayList arrayList = new ArrayList(topics);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new ff.d(11)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject != null && !ChatObject.isMonoForum(chat)) {
                        j10 = MessageObject.getTopicId(i9, messageObject.messageOwner, true);
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i9).getTopicsController().findTopic(chat.f22380id, j10);
                        if (findTopic != null) {
                            CharSequence j11 = vf.c.j(findTopic, textPaint, null);
                            spannableStringBuilder.append(j11);
                            if (findTopic.unread_count > 0) {
                                i12 = j11.length();
                            } else {
                                i12 = 0;
                            }
                            q2Var.f24896c = j11.length();
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
                            i12 = 0;
                        }
                        if (q2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        j10 = 0;
                        z10 = false;
                        i12 = 0;
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        q2Var.f24898f = new HashMap();
                        for (int i13 = 0; i13 < Math.min(4, arrayList.size()); i13++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i13)).from_id);
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i9, q2Var.f24894a);
                            f5Var.h = false;
                            f5Var.c(peerDialogId);
                            q2Var.f24898f.put(Long.valueOf(peerDialogId), f5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(f5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i14 = 0;
                        for (int i15 = 4; i14 < Math.min(i15, arrayList.size()); i15 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i14)).f22432id != j10) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z12 && z10) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(vf.c.j((TLRPC.ForumTopic) arrayList.get(i14), textPaint, null));
                                z12 = false;
                            }
                            i14++;
                        }
                    }
                    if (i12 > 0) {
                        Typeface bold = AndroidUtilities.bold();
                        int i16 = org.telegram.ui.ActionBar.f6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f29312a = bold;
                        metricAffectingSpan.f29314c = i16;
                        metricAffectingSpan.f29313b = org.telegram.ui.ActionBar.f6.w0(null, i16, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i12 + 2), 0);
                    }
                    q2Var.f24899g = spannableStringBuilder;
                } else if (!MessagesController.getInstance(i9).getTopicsController().endIsReached(chat.f22380id)) {
                    MessagesController.getInstance(i9).getTopicsController().preloadTopics(chat.f22380id);
                    q2Var.f24899g = LocaleController.getString(R.string.Loading);
                    q2Var.f24897e = true;
                } else {
                    if (ChatObject.isMonoForum(chat)) {
                        i11 = R.string.NoMonoforumTopicsCreated;
                    } else {
                        i11 = R.string.NoTopicsCreated;
                    }
                    q2Var.f24899g = LocaleController.getString(i11);
                }
            }
        }
    }
}
