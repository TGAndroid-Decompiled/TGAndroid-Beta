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
    public final r2 f23356a;
    public int f23357b;
    public int f23358c;
    public boolean d;
    public boolean f23359e;
    public HashMap f23360f;
    public CharSequence f23361g;

    public q2(r2 r2Var) {
        this.f23356a = r2Var;
    }

    public static void a(q2 q2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        int i11;
        int i12;
        long j10;
        boolean z4;
        int i13;
        boolean z10;
        q2Var.getClass();
        if (messageObject != null && chat != null) {
            i11 = messageObject.getId();
        } else {
            i11 = 0;
        }
        if (q2Var.f23357b != i11 || q2Var.f23359e) {
            q2Var.f23360f = null;
            q2Var.f23358c = 0;
            q2Var.d = false;
            q2Var.f23359e = false;
            q2Var.f23357b = i11;
            TextPaint textPaint = org.telegram.ui.ActionBar.k6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.f20845id);
                boolean z11 = true;
                if (topics != null && !topics.isEmpty()) {
                    ArrayList arrayList = new ArrayList(topics);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new lf.d(11)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject != null && !ChatObject.isMonoForum(chat)) {
                        j10 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.f20845id, j10);
                        if (findTopic != null) {
                            CharSequence j11 = bg.e.j(findTopic, textPaint, null);
                            spannableStringBuilder.append(j11);
                            if (findTopic.unread_count > 0) {
                                i13 = j11.length();
                            } else {
                                i13 = 0;
                            }
                            q2Var.f23358c = j11.length();
                            if (messageObject.isOutOwner()) {
                                q2Var.d = false;
                            } else {
                                if (findTopic.unread_count > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                q2Var.d = z10;
                            }
                        } else {
                            q2Var.d = false;
                            i13 = 0;
                        }
                        if (q2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
                        q2Var.f23360f = new HashMap();
                        for (int i14 = 0; i14 < Math.min(4, arrayList.size()); i14++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i14)).from_id);
                            org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(i10, q2Var.f23356a);
                            i5Var.h = false;
                            i5Var.c(peerDialogId);
                            q2Var.f23360f.put(Long.valueOf(peerDialogId), i5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(i5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i15 = 0;
                        for (int i16 = 4; i15 < Math.min(i16, arrayList.size()); i16 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i15)).f20897id != j10) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z11 && z4) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(bg.e.j((TLRPC.ForumTopic) arrayList.get(i15), textPaint, null));
                                z11 = false;
                            }
                            i15++;
                        }
                    }
                    if (i13 > 0) {
                        Typeface bold = AndroidUtilities.bold();
                        int i17 = org.telegram.ui.ActionBar.k6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f26451a = bold;
                        metricAffectingSpan.f26453c = i17;
                        metricAffectingSpan.f26452b = org.telegram.ui.ActionBar.k6.w0(null, i17, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i13 + 2), 0);
                    }
                    q2Var.f23361g = spannableStringBuilder;
                } else if (!MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.f20845id)) {
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.f20845id);
                    q2Var.f23361g = LocaleController.getString(R.string.Loading);
                    q2Var.f23359e = true;
                } else {
                    if (ChatObject.isMonoForum(chat)) {
                        i12 = R.string.NoMonoforumTopicsCreated;
                    } else {
                        i12 = R.string.NoTopicsCreated;
                    }
                    q2Var.f23361g = LocaleController.getString(i12);
                }
            }
        }
    }
}
