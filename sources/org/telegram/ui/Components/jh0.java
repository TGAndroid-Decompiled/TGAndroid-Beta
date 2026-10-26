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
public final class jh0 extends hm0 {
    public final Context f29648r;
    public final nh0 f29649s;

    public jh0(nh0 nh0Var, Context context) {
        this.f29649s = nh0Var;
        this.f29648r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        mh0 mh0Var = (mh0) this.f29649s.f30982x.get(i10 - 1);
        int b10 = mh0Var.b() + 1;
        if (TextUtils.isEmpty(mh0Var.f30588c) && !mh0Var.e) {
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
            nh0 nh0Var = this.f29649s;
            if (i13 < nh0Var.f30982x.size() && (i12 = i11 - 1) < ((mh0) nh0Var.f30982x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((mh0) nh0Var.f30982x.get(i13)).f30587b.get(i12)).peer))));
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
        if (i11 - 1 < ((mh0) this.f29649s.f30982x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f29649s.f30982x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        nh0 nh0Var = this.f29649s;
        TLRPC.Poll poll = nh0Var.f30979r;
        MessageObject messageObject = nh0Var.f30978n;
        if (view == null) {
            view = new ih0(this, this.f29648r);
        }
        lh0 lh0Var = (lh0) view;
        if (i10 == 0) {
            lh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        mh0 mh0Var = (mh0) nh0Var.f30982x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, mh0Var.d) && ((kh0) nh0Var.f30981w.get(mh0Var)) != null) {
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
                lh0Var.a(str2, arrayList, nh0Var.R(mh0Var.d), mh0Var.f30586a, mh0Var.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f29649s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.e1 e1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        nh0 nh0Var = this.f29649s;
        TLRPC.Poll poll = nh0Var.f30979r;
        ArrayList arrayList2 = nh0Var.f30982x;
        MessageObject messageObject = nh0Var.f30978n;
        int i12 = e1Var.f47741f;
        View view = e1Var.f47738a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                mh0 mh0Var = (mh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.v8) view).o(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", mh0Var.f30586a - mh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        lh0 lh0Var = (lh0) view;
        mh0 mh0Var2 = (mh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = mh0Var2.f30587b;
        byte[] bArr = mh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((kh0) nh0Var.f30981w.get(mh0Var2)) != null) {
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
                lh0Var.a(str2, arrayList, nh0Var.R(bArr), mh0Var2.f30586a, mh0Var2.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        nh0 nh0Var = this.f29649s;
        View view = nh0Var.f30983y;
        Context context = this.f29648r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(23, context, true);
                    v8Var2.setOffsetFromImage(65);
                    int i11 = org.telegram.ui.ActionBar.y6.f23427h5;
                    u6Var = ((org.telegram.ui.ActionBar.k3) nh0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.i(i11, v8Var2, u6Var);
                    v8Var2.g(org.telegram.ui.ActionBar.y6.N6, org.telegram.ui.ActionBar.y6.f23597q6);
                    v8Var = v8Var2;
                } else {
                    View ih0Var = new ih0(this, context);
                    ih0Var.setTag(-33024);
                    v8Var = ih0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                v8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    v8Var = view;
                }
            }
        } else {
            v8Var = new PollVotesAlert$UserCell(nh0Var, context);
        }
        return new s4.e1(v8Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.u6 u6Var;
        if (e1Var.f47741f == 0) {
            int b10 = e1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) e1Var.f47738a;
            nh0 nh0Var = this.f29649s;
            mh0 mh0Var = (mh0) nh0Var.f30982x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) mh0Var.f30587b.get(Q);
            TLObject userOrChat = nh0Var.S().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == mh0Var.b() - 1 && TextUtils.isEmpty(mh0Var.f30588c) && !mh0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            y9 y9Var = pollVotesAlert$UserCell.f26206a;
            org.telegram.ui.ActionBar.b6 b6Var = pollVotesAlert$UserCell.f26207b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f26210n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f26210n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f26210n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f26208c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f26214x = z12;
            pollVotesAlert$UserCell.f26213w = Q;
            if (userOrChat == null) {
                b6Var.l("", false);
                y9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f26212s;
                j9 j9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f26210n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    j9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f26210n;
                    if (chat2 != null) {
                        j9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f26211r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f26211r = Emoji.replaceEmoji(userName, b6Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f26210n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f26211r = str;
                        pollVotesAlert$UserCell.f26211r = Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f26211r = "";
                    }
                }
                b6Var.l(pollVotesAlert$UserCell.f26211r, z11);
                qx0 qx0Var = pollVotesAlert$UserCell.f26209f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f26210n;
                int i12 = org.telegram.ui.ActionBar.y6.f23770z9;
                u6Var = ((org.telegram.ui.ActionBar.k3) pollVotesAlert$UserCell.F).resourcesProvider;
                b6Var.i(qx0Var.b(user3, chat4, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f26210n;
                if (chat5 != null) {
                    y9Var.f(chat5, j9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        y9Var.f(user4, j9Var);
                    } else {
                        y9Var.setImageDrawable(j9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(y9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(b6Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, nh0.R, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f26214x) {
                pollVotesAlert$UserCell.f26215y = 0.0f;
            }
        }
    }
}
