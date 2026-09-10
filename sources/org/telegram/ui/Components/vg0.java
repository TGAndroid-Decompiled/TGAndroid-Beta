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
public final class vg0 extends rl0 {
    public final Context f27933r;
    public final zg0 f27934s;

    public vg0(zg0 zg0Var, Context context) {
        this.f27934s = zg0Var;
        this.f27933r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        yg0 yg0Var = (yg0) this.f27934s.f29685x.get(i10 - 1);
        int b10 = yg0Var.b() + 1;
        if (TextUtils.isEmpty(yg0Var.f29324c) && !yg0Var.e) {
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
            zg0 zg0Var = this.f27934s;
            if (i13 < zg0Var.f29685x.size() && (i12 = i11 - 1) < ((yg0) zg0Var.f29685x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((yg0) zg0Var.f29685x.get(i13)).f29323b.get(i12)).peer))));
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
        if (i11 - 1 < ((yg0) this.f27934s.f29685x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f27934s.f29685x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        zg0 zg0Var = this.f27934s;
        TLRPC.Poll poll = zg0Var.f29682r;
        MessageObject messageObject = zg0Var.f29681n;
        if (view == null) {
            view = new ug0(this, this.f27933r);
        }
        xg0 xg0Var = (xg0) view;
        if (i10 == 0) {
            xg0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        yg0 yg0Var = (yg0) zg0Var.f29685x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, yg0Var.d) && ((wg0) zg0Var.f29684w.get(yg0Var)) != null) {
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
                xg0Var.a(str2, arrayList, zg0Var.P(yg0Var.d), yg0Var.f29322a, yg0Var.a(), false);
                xg0Var.setTag(R.id.object_tag, yg0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f27934s.F;
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
        zg0 zg0Var = this.f27934s;
        TLRPC.Poll poll = zg0Var.f29682r;
        ArrayList arrayList2 = zg0Var.f29685x;
        MessageObject messageObject = zg0Var.f29681n;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                yg0 yg0Var = (yg0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.s8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", yg0Var.f29322a - yg0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        xg0 xg0Var = (xg0) view;
        yg0 yg0Var2 = (yg0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = yg0Var2.f29323b;
        byte[] bArr = yg0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((wg0) zg0Var.f29684w.get(yg0Var2)) != null) {
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
                xg0Var.a(str2, arrayList, zg0Var.P(bArr), yg0Var2.f29322a, yg0Var2.a(), false);
                xg0Var.setTag(R.id.object_tag, yg0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        zg0 zg0Var = this.f27934s;
        View view = zg0Var.f29686y;
        Context context = this.f27933r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(23, context, true);
                    s8Var2.setOffsetFromImage(65);
                    s8Var2.setBackgroundColor(zg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
                    s8Var2.e(org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.q6);
                    s8Var = s8Var2;
                } else {
                    View ug0Var = new ug0(this, context);
                    ug0Var.setTag(-33024);
                    s8Var = ug0Var;
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
            s8Var = new PollVotesAlert$UserCell(zg0Var, context);
        }
        return new s4.c1(s8Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (c1Var.f41613f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.f41610a;
            zg0 zg0Var = this.f27934s;
            yg0 yg0Var = (yg0) zg0Var.f29685x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) yg0Var.f29323b.get(Q);
            TLObject userOrChat = zg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == yg0Var.b() - 1 && TextUtils.isEmpty(yg0Var.f29324c) && !yg0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            w9 w9Var = pollVotesAlert$UserCell.f21175a;
            org.telegram.ui.ActionBar.l5 l5Var = pollVotesAlert$UserCell.f21176b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f21179n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f21179n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f21179n = null;
            }
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.f21177c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f21183x = z12;
            pollVotesAlert$UserCell.f21182w = Q;
            if (userOrChat == null) {
                l5Var.l("", false);
                w9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f21181s;
                g9 g9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f21179n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    g9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f21179n;
                    if (chat2 != null) {
                        g9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f21180r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f21180r = Emoji.replaceEmoji(userName, l5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f21179n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f21180r = str;
                        pollVotesAlert$UserCell.f21180r = Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f21180r = "";
                    }
                }
                l5Var.l(pollVotesAlert$UserCell.f21180r, z11);
                vw0 vw0Var = pollVotesAlert$UserCell.f21178f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f21179n;
                int i12 = org.telegram.ui.ActionBar.j6.f18328z9;
                f6Var = ((org.telegram.ui.ActionBar.h3) pollVotesAlert$UserCell.F).resourcesProvider;
                l5Var.i(vw0Var.a(user3, chat4, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f21179n;
                if (chat5 != null) {
                    w9Var.e(chat5, g9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        w9Var.e(user4, g9Var);
                    } else {
                        w9Var.setImageDrawable(g9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(l5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, zg0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f21183x) {
                pollVotesAlert$UserCell.f21184y = 0.0f;
            }
        }
    }
}
