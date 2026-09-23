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
public final class mg0 extends il0 {
    public final Context f26171r;
    public final qg0 f26172s;

    public mg0(qg0 qg0Var, Context context) {
        this.f26172s = qg0Var;
        this.f26171r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        pg0 pg0Var = (pg0) this.f26172s.f27347x.get(i10 - 1);
        int b10 = pg0Var.b() + 1;
        if (TextUtils.isEmpty(pg0Var.f27026c) && !pg0Var.e) {
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
            qg0 qg0Var = this.f26172s;
            if (i13 < qg0Var.f27347x.size() && (i12 = i11 - 1) < ((pg0) qg0Var.f27347x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((pg0) qg0Var.f27347x.get(i13)).f27025b.get(i12)).peer))));
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
        if (i11 - 1 < ((pg0) this.f26172s.f27347x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f26172s.f27347x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        qg0 qg0Var = this.f26172s;
        TLRPC.Poll poll = qg0Var.f27344r;
        MessageObject messageObject = qg0Var.f27343n;
        if (view == null) {
            view = new lg0(this, this.f26171r);
        }
        og0 og0Var = (og0) view;
        if (i10 == 0) {
            og0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        pg0 pg0Var = (pg0) qg0Var.f27347x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, pg0Var.d) && ((ng0) qg0Var.f27346w.get(pg0Var)) != null) {
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
                og0Var.a(str2, arrayList, qg0Var.P(pg0Var.d), pg0Var.f27024a, pg0Var.a(), false);
                og0Var.setTag(R.id.object_tag, pg0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f26172s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        qg0 qg0Var = this.f26172s;
        TLRPC.Poll poll = qg0Var.f27344r;
        ArrayList arrayList2 = qg0Var.f27347x;
        MessageObject messageObject = qg0Var.f27343n;
        int i12 = c1Var.f42630f;
        View view = c1Var.f42627a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                pg0 pg0Var = (pg0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.s8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", pg0Var.f27024a - pg0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        og0 og0Var = (og0) view;
        pg0 pg0Var2 = (pg0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = pg0Var2.f27025b;
        byte[] bArr = pg0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ng0) qg0Var.f27346w.get(pg0Var2)) != null) {
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
                og0Var.a(str2, arrayList, qg0Var.P(bArr), pg0Var2.f27024a, pg0Var2.a(), false);
                og0Var.setTag(R.id.object_tag, pg0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        qg0 qg0Var = this.f26172s;
        View view = qg0Var.f27348y;
        Context context = this.f26171r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(23, context, true);
                    s8Var2.setOffsetFromImage(65);
                    s8Var2.setBackgroundColor(qg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18859h5));
                    s8Var2.e(org.telegram.ui.ActionBar.h6.N6, org.telegram.ui.ActionBar.h6.q6);
                    s8Var = s8Var2;
                } else {
                    View lg0Var = new lg0(this, context);
                    lg0Var.setTag(-33024);
                    s8Var = lg0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                s8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    s8Var = view;
                }
            }
        } else {
            s8Var = new PollVotesAlert$UserCell(qg0Var, context);
        }
        return new s4.c1(s8Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (c1Var.f42630f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.f42627a;
            qg0 qg0Var = this.f26172s;
            pg0 pg0Var = (pg0) qg0Var.f27347x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) pg0Var.f27025b.get(Q);
            TLObject userOrChat = qg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == pg0Var.b() - 1 && TextUtils.isEmpty(pg0Var.f27026c) && !pg0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            w9 w9Var = pollVotesAlert$UserCell.f22061a;
            org.telegram.ui.ActionBar.i5 i5Var = pollVotesAlert$UserCell.f22062b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f22065n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f22065n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f22065n = null;
            }
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.f22063c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f22069x = z12;
            pollVotesAlert$UserCell.f22068w = Q;
            if (userOrChat == null) {
                i5Var.l("", false);
                w9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f22067s;
                h9 h9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f22065n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    h9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f22065n;
                    if (chat2 != null) {
                        h9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f22066r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f22066r = Emoji.replaceEmoji(userName, i5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f22065n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f22066r = str;
                        pollVotesAlert$UserCell.f22066r = Emoji.replaceEmoji(str, i5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f22066r = "";
                    }
                }
                i5Var.l(pollVotesAlert$UserCell.f22066r, z11);
                kw0 kw0Var = pollVotesAlert$UserCell.f22064f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f22065n;
                int i12 = org.telegram.ui.ActionBar.h6.f19192z9;
                d6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.F).resourcesProvider;
                i5Var.i(kw0Var.a(user3, chat4, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f22065n;
                if (chat5 != null) {
                    w9Var.e(chat5, h9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        w9Var.e(user4, h9Var);
                    } else {
                        w9Var.setImageDrawable(h9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(i5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qg0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f22069x) {
                pollVotesAlert$UserCell.f22070y = 0.0f;
            }
        }
    }
}
