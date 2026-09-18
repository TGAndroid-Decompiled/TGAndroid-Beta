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
    public final Context f26146r;
    public final qg0 f26147s;

    public mg0(qg0 qg0Var, Context context) {
        this.f26147s = qg0Var;
        this.f26146r = context;
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
        pg0 pg0Var = (pg0) this.f26147s.f27308x.get(i10 - 1);
        int b10 = pg0Var.b() + 1;
        if (TextUtils.isEmpty(pg0Var.f27027c) && !pg0Var.e) {
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
            qg0 qg0Var = this.f26147s;
            if (i13 < qg0Var.f27308x.size() && (i12 = i11 - 1) < ((pg0) qg0Var.f27308x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((pg0) qg0Var.f27308x.get(i13)).f27026b.get(i12)).peer))));
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
        if (i11 - 1 < ((pg0) this.f26147s.f27308x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f26147s.f27308x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        qg0 qg0Var = this.f26147s;
        TLRPC.Poll poll = qg0Var.f27305r;
        MessageObject messageObject = qg0Var.f27304n;
        if (view == null) {
            view = new lg0(this, this.f26146r);
        }
        og0 og0Var = (og0) view;
        if (i10 == 0) {
            og0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        pg0 pg0Var = (pg0) qg0Var.f27308x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, pg0Var.d) && ((ng0) qg0Var.f27307w.get(pg0Var)) != null) {
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
                og0Var.a(str2, arrayList, qg0Var.P(pg0Var.d), pg0Var.f27025a, pg0Var.a(), false);
                og0Var.setTag(R.id.object_tag, pg0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f26147s.F;
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
        qg0 qg0Var = this.f26147s;
        TLRPC.Poll poll = qg0Var.f27305r;
        ArrayList arrayList2 = qg0Var.f27308x;
        MessageObject messageObject = qg0Var.f27304n;
        int i12 = c1Var.f42705f;
        View view = c1Var.f42702a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                pg0 pg0Var = (pg0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", pg0Var.f27025a - pg0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        og0 og0Var = (og0) view;
        pg0 pg0Var2 = (pg0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = pg0Var2.f27026b;
        byte[] bArr = pg0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ng0) qg0Var.f27307w.get(pg0Var2)) != null) {
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
                og0Var.a(str2, arrayList, qg0Var.P(bArr), pg0Var2.f27025a, pg0Var2.a(), false);
                og0Var.setTag(R.id.object_tag, pg0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        qg0 qg0Var = this.f26147s;
        View view = qg0Var.f27309y;
        Context context = this.f26146r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    r8Var2.setBackgroundColor(qg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18934h5));
                    r8Var2.e(org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.q6);
                    r8Var = r8Var2;
                } else {
                    View lg0Var = new lg0(this, context);
                    lg0Var.setTag(-33024);
                    r8Var = lg0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                r8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    r8Var = view;
                }
            }
        } else {
            r8Var = new PollVotesAlert$UserCell(qg0Var, context);
        }
        return new s4.c1(r8Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (c1Var.f42705f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.f42702a;
            qg0 qg0Var = this.f26147s;
            pg0 pg0Var = (pg0) qg0Var.f27308x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) pg0Var.f27026b.get(Q);
            TLObject userOrChat = qg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == pg0Var.b() - 1 && TextUtils.isEmpty(pg0Var.f27027c) && !pg0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            u9 u9Var = pollVotesAlert$UserCell.f22103a;
            org.telegram.ui.ActionBar.k5 k5Var = pollVotesAlert$UserCell.f22104b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f22107n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f22107n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f22107n = null;
            }
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.f22105c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f22111x = z12;
            pollVotesAlert$UserCell.f22110w = Q;
            if (userOrChat == null) {
                k5Var.l("", false);
                u9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f22109s;
                f9 f9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f22107n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    f9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f22107n;
                    if (chat2 != null) {
                        f9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f22108r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f22108r = Emoji.replaceEmoji(userName, k5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f22107n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f22108r = str;
                        pollVotesAlert$UserCell.f22108r = Emoji.replaceEmoji(str, k5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f22108r = "";
                    }
                }
                k5Var.l(pollVotesAlert$UserCell.f22108r, z11);
                lw0 lw0Var = pollVotesAlert$UserCell.f22106f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f22107n;
                int i12 = org.telegram.ui.ActionBar.j6.f19267z9;
                f6Var = ((org.telegram.ui.ActionBar.g3) pollVotesAlert$UserCell.F).resourcesProvider;
                k5Var.i(lw0Var.a(user3, chat4, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f22107n;
                if (chat5 != null) {
                    u9Var.e(chat5, f9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        u9Var.e(user4, f9Var);
                    } else {
                        u9Var.setImageDrawable(f9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(u9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qg0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f22111x) {
                pollVotesAlert$UserCell.f22112y = 0.0f;
            }
        }
    }
}
