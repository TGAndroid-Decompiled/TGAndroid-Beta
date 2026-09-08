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
public final class lg0 extends hl0 {
    public final Context f28198r;
    public final pg0 f28199s;

    public lg0(pg0 pg0Var, Context context) {
        this.f28199s = pg0Var;
        this.f28198r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        og0 og0Var = (og0) this.f28199s.f29405x.get(i10 - 1);
        int b10 = og0Var.b() + 1;
        if (TextUtils.isEmpty(og0Var.f29074c) && !og0Var.f29075e) {
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
            pg0 pg0Var = this.f28199s;
            if (i13 < pg0Var.f29405x.size() && (i12 = i11 - 1) < ((og0) pg0Var.f29405x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((og0) pg0Var.f29405x.get(i13)).f29073b.get(i12)).peer))));
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
        if (i11 - 1 < ((og0) this.f28199s.f29405x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f28199s.f29405x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        pg0 pg0Var = this.f28199s;
        TLRPC.Poll poll = pg0Var.f29402r;
        MessageObject messageObject = pg0Var.f29401n;
        if (view == null) {
            view = new kg0(this, this.f28198r);
        }
        ng0 ng0Var = (ng0) view;
        if (i10 == 0) {
            ng0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        og0 og0Var = (og0) pg0Var.f29405x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, og0Var.d) && ((mg0) pg0Var.f29404w.get(og0Var)) != null) {
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
                ng0Var.a(str2, arrayList, pg0Var.P(og0Var.d), og0Var.f29072a, og0Var.a(), false);
                ng0Var.setTag(R.id.object_tag, og0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f28199s.F;
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
        pg0 pg0Var = this.f28199s;
        TLRPC.Poll poll = pg0Var.f29402r;
        ArrayList arrayList2 = pg0Var.f29405x;
        MessageObject messageObject = pg0Var.f29401n;
        int i12 = c1Var.f45770f;
        View view = c1Var.f45766a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                og0 og0Var = (og0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", og0Var.f29072a - og0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        ng0 ng0Var = (ng0) view;
        og0 og0Var2 = (og0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = og0Var2.f29073b;
        byte[] bArr = og0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((mg0) pg0Var.f29404w.get(og0Var2)) != null) {
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
                ng0Var.a(str2, arrayList, pg0Var.P(bArr), og0Var2.f29072a, og0Var2.a(), false);
                ng0Var.setTag(R.id.object_tag, og0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        pg0 pg0Var = this.f28199s;
        View view = pg0Var.f29406y;
        Context context = this.f28198r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    r8Var2.setBackgroundColor(pg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20761h5));
                    r8Var2.e(org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.q6);
                    r8Var = r8Var2;
                } else {
                    View kg0Var = new kg0(this, context);
                    kg0Var.setTag(-33024);
                    r8Var = kg0Var;
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
            r8Var = new PollVotesAlert$UserCell(pg0Var, context);
        }
        return new s4.c1(r8Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (c1Var.f45770f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.f45766a;
            pg0 pg0Var = this.f28199s;
            og0 og0Var = (og0) pg0Var.f29405x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) og0Var.f29073b.get(Q);
            TLObject userOrChat = pg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == og0Var.b() - 1 && TextUtils.isEmpty(og0Var.f29074c) && !og0Var.f29075e) {
                z10 = false;
            } else {
                z10 = true;
            }
            x9 x9Var = pollVotesAlert$UserCell.f24060a;
            org.telegram.ui.ActionBar.j5 j5Var = pollVotesAlert$UserCell.f24061b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f24065n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24065n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24065n = null;
            }
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.f24062c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f24069x = z12;
            pollVotesAlert$UserCell.f24068w = Q;
            if (userOrChat == null) {
                j5Var.l("", false);
                x9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24067s;
                i9 i9Var = pollVotesAlert$UserCell.f24063e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24065n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    i9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24065n;
                    if (chat2 != null) {
                        i9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24066r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f24066r = Emoji.replaceEmoji(userName, j5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24065n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24066r = str;
                        pollVotesAlert$UserCell.f24066r = Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24066r = "";
                    }
                }
                j5Var.l(pollVotesAlert$UserCell.f24066r, z11);
                jw0 jw0Var = pollVotesAlert$UserCell.f24064f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24065n;
                int i12 = org.telegram.ui.ActionBar.j6.f21091z9;
                f6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.F).resourcesProvider;
                j5Var.i(jw0Var.a(user3, chat4, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24065n;
                if (chat5 != null) {
                    x9Var.e(chat5, i9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        x9Var.e(user4, i9Var);
                    } else {
                        x9Var.setImageDrawable(i9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(x9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, pg0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24069x) {
                pollVotesAlert$UserCell.f24070y = 0.0f;
            }
        }
    }
}
