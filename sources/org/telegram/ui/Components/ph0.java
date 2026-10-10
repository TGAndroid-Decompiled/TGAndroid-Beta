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
public final class ph0 extends nm0 {
    public final Context f29769r;
    public final th0 f29770s;

    public ph0(th0 th0Var, Context context) {
        this.f29770s = th0Var;
        this.f29769r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rm0 rm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        sh0 sh0Var = (sh0) this.f29770s.f31144x.get(i10 - 1);
        int b10 = sh0Var.b() + 1;
        if (TextUtils.isEmpty(sh0Var.f30788c) && !sh0Var.f30789e) {
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
            th0 th0Var = this.f29770s;
            if (i13 < th0Var.f31144x.size() && (i12 = i11 - 1) < ((sh0) th0Var.f31144x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((sh0) th0Var.f31144x.get(i13)).f30787b.get(i12)).peer))));
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
        if (i11 - 1 < ((sh0) this.f29770s.f31144x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f29770s.f31144x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        th0 th0Var = this.f29770s;
        TLRPC.Poll poll = th0Var.f31141r;
        MessageObject messageObject = th0Var.f31140n;
        if (view == null) {
            view = new oh0(this, this.f29769r);
        }
        rh0 rh0Var = (rh0) view;
        if (i10 == 0) {
            rh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        sh0 sh0Var = (sh0) th0Var.f31144x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, sh0Var.d) && ((qh0) th0Var.f31143w.get(sh0Var)) != null) {
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
                rh0Var.a(str2, arrayList, th0Var.Q(sh0Var.d), sh0Var.f30786a, sh0Var.a(), false);
                rh0Var.setTag(R.id.object_tag, sh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f29770s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        th0 th0Var = this.f29770s;
        TLRPC.Poll poll = th0Var.f31141r;
        ArrayList arrayList2 = th0Var.f31144x;
        MessageObject messageObject = th0Var.f31140n;
        int i12 = d1Var.f47706f;
        View view = d1Var.f47702a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                sh0 sh0Var = (sh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", sh0Var.f30786a - sh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        rh0 rh0Var = (rh0) view;
        sh0 sh0Var2 = (sh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = sh0Var2.f30787b;
        byte[] bArr = sh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((qh0) th0Var.f31143w.get(sh0Var2)) != null) {
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
                rh0Var.a(str2, arrayList, th0Var.Q(bArr), sh0Var2.f30786a, sh0Var2.a(), false);
                rh0Var.setTag(R.id.object_tag, sh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        th0 th0Var = this.f29770s;
        View view = th0Var.f31145y;
        Context context = this.f29769r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    r8Var2.setBackgroundColor(th0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5));
                    r8Var2.e(org.telegram.ui.ActionBar.i6.N6, org.telegram.ui.ActionBar.i6.q6);
                    r8Var = r8Var2;
                } else {
                    View oh0Var = new oh0(this, context);
                    oh0Var.setTag(-33024);
                    r8Var = oh0Var;
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
            r8Var = new PollVotesAlert$UserCell(th0Var, context);
        }
        return new s4.d1(r8Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.e6 e6Var;
        if (d1Var.f47706f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.f47702a;
            th0 th0Var = this.f29770s;
            sh0 sh0Var = (sh0) th0Var.f31144x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) sh0Var.f30787b.get(Q);
            TLObject userOrChat = th0Var.R().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == sh0Var.b() - 1 && TextUtils.isEmpty(sh0Var.f30788c) && !sh0Var.f30789e) {
                z10 = false;
            } else {
                z10 = true;
            }
            y9 y9Var = pollVotesAlert$UserCell.f24227a;
            org.telegram.ui.ActionBar.j5 j5Var = pollVotesAlert$UserCell.f24228b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f24232n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24232n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24232n = null;
            }
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.f24229c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f24236x = z12;
            pollVotesAlert$UserCell.f24235w = Q;
            if (userOrChat == null) {
                j5Var.l("", false);
                y9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24234s;
                j9 j9Var = pollVotesAlert$UserCell.f24230e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24232n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    j9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24232n;
                    if (chat2 != null) {
                        j9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24233r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f24233r = Emoji.replaceEmoji(userName, j5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24232n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24233r = str;
                        pollVotesAlert$UserCell.f24233r = Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24233r = "";
                    }
                }
                j5Var.l(pollVotesAlert$UserCell.f24233r, z11);
                ox0 ox0Var = pollVotesAlert$UserCell.f24231f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24232n;
                int i12 = org.telegram.ui.ActionBar.i6.f21206z9;
                e6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.F).resourcesProvider;
                j5Var.i(ox0Var.a(user3, chat4, org.telegram.ui.ActionBar.i6.w0(i12, e6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24232n;
                if (chat5 != null) {
                    y9Var.e(chat5, j9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        y9Var.e(user4, j9Var);
                    } else {
                        y9Var.setImageDrawable(j9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(y9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, th0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24236x) {
                pollVotesAlert$UserCell.f24237y = 0.0f;
            }
        }
    }
}
