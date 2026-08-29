package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hg0 extends fl0 {
    public final Context f29176r;
    public final lg0 f29177s;

    public hg0(lg0 lg0Var, Context context) {
        this.f29177s = lg0Var;
        this.f29176r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        kg0 kg0Var = (kg0) this.f29177s.f30323x.get(i10 - 1);
        int b10 = kg0Var.b() + 1;
        if (TextUtils.isEmpty(kg0Var.f30039c) && !kg0Var.f30040e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return 293145;
        }
        int i13 = i10 - 1;
        if (i11 == 0) {
            return -928312;
        }
        if (i13 >= 0) {
            lg0 lg0Var = this.f29177s;
            if (i13 < lg0Var.f30323x.size() && (i12 = i11 - 1) < ((kg0) lg0Var.f30323x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((kg0) lg0Var.f30323x.get(i13)).f30038b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        if (i11 - 1 < ((kg0) this.f29177s.f30323x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f29177s.f30323x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        lg0 lg0Var = this.f29177s;
        TLRPC.Poll poll = lg0Var.f30320r;
        MessageObject messageObject = lg0Var.f30319n;
        if (view == null) {
            view = new gg0(this, this.f29176r);
        }
        jg0 jg0Var = (jg0) view;
        if (i10 == 0) {
            jg0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        kg0 kg0Var = (kg0) lg0Var.f30323x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, kg0Var.d) && ((ig0) lg0Var.f30322w.get(kg0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i11 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i11);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i11++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                } else {
                    str = tL_textWithEntities.text;
                }
                String str2 = str;
                if (tL_textWithEntities == null) {
                    arrayList = null;
                } else {
                    arrayList = tL_textWithEntities.entities;
                }
                jg0Var.a(str2, arrayList, lg0Var.P(kg0Var.d), kg0Var.f30037a, kg0Var.a(), false);
                jg0Var.setTag(R.id.object_tag, kg0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f29177s.B;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        lg0 lg0Var = this.f29177s;
        TLRPC.Poll poll = lg0Var.f30320r;
        ArrayList arrayList2 = lg0Var.f30323x;
        MessageObject messageObject = lg0Var.f30319n;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                kg0 kg0Var = (kg0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.m8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", kg0Var.f30037a - kg0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        jg0 jg0Var = (jg0) view;
        kg0 kg0Var2 = (kg0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = kg0Var2.f30038b;
        byte[] bArr = kg0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ig0) lg0Var.f30322w.get(kg0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i13 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i13);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i13++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                } else {
                    str = tL_textWithEntities.text;
                }
                String str2 = str;
                if (tL_textWithEntities == null) {
                    arrayList = null;
                } else {
                    arrayList = tL_textWithEntities.entities;
                }
                jg0Var.a(str2, arrayList, lg0Var.P(bArr), kg0Var2.f30037a, kg0Var2.a(), false);
                jg0Var.setTag(R.id.object_tag, kg0Var2);
                return;
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        lg0 lg0Var = this.f29177s;
        View view = lg0Var.f30324y;
        Context context = this.f29176r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context, true);
                    m8Var2.setOffsetFromImage(65);
                    m8Var2.setBackgroundColor(lg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
                    m8Var2.e(org.telegram.ui.ActionBar.g6.N6, org.telegram.ui.ActionBar.g6.q6);
                    m8Var = m8Var2;
                } else {
                    View gg0Var = new gg0(this, context);
                    gg0Var.setTag(-33024);
                    m8Var = gg0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                m8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    m8Var = view;
                }
            }
        } else {
            m8Var = new PollVotesAlert$UserCell(lg0Var, context);
        }
        return new f2.n1(m8Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (n1Var.f6436f == 0) {
            int b10 = n1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) n1Var.f6432a;
            lg0 lg0Var = this.f29177s;
            kg0 kg0Var = (kg0) lg0Var.f30323x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) kg0Var.f30038b.get(Q);
            TLObject userOrChat = lg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == kg0Var.b() - 1 && TextUtils.isEmpty(kg0Var.f30039c) && !kg0Var.f30040e) {
                z10 = false;
            } else {
                z10 = true;
            }
            t9 t9Var = pollVotesAlert$UserCell.f26446a;
            org.telegram.ui.ActionBar.h5 h5Var = pollVotesAlert$UserCell.f26447b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f26451n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f26451n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f26451n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f26448c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f26455x = z12;
            pollVotesAlert$UserCell.f26454w = Q;
            if (userOrChat == null) {
                h5Var.l("", false);
                t9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f26453s;
                e9 e9Var = pollVotesAlert$UserCell.f26449e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f26451n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    e9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f26451n;
                    if (chat2 != null) {
                        e9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f26452r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f26452r = Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f26451n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f26452r = str;
                        pollVotesAlert$UserCell.f26452r = Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f26452r = "";
                    }
                }
                h5Var.l(pollVotesAlert$UserCell.f26452r, z11);
                cw0 cw0Var = pollVotesAlert$UserCell.f26450f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f26451n;
                int i12 = org.telegram.ui.ActionBar.g6.f23453z9;
                c6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.B).resourcesProvider;
                h5Var.i(cw0Var.a(user3, chat4, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f26451n;
                if (chat5 != null) {
                    t9Var.e(chat5, e9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        t9Var.e(user4, e9Var);
                    } else {
                        t9Var.setImageDrawable(e9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.A;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(t9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, lg0.K, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f26455x) {
                pollVotesAlert$UserCell.f26456y = 0.0f;
            }
        }
    }
}
