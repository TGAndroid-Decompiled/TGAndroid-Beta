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
public final class kh0 extends im0 {
    public final Context f28039r;
    public final oh0 f28040s;

    public kh0(oh0 oh0Var, Context context) {
        this.f28040s = oh0Var;
        this.f28039r = context;
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
        nh0 nh0Var = (nh0) this.f28040s.f29182x.get(i10 - 1);
        int b10 = nh0Var.b() + 1;
        if (TextUtils.isEmpty(nh0Var.f28951c) && !nh0Var.e) {
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
            oh0 oh0Var = this.f28040s;
            if (i13 < oh0Var.f29182x.size() && (i12 = i11 - 1) < ((nh0) oh0Var.f29182x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((nh0) oh0Var.f29182x.get(i13)).f28950b.get(i12)).peer))));
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
        if (i11 - 1 < ((nh0) this.f28040s.f29182x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f28040s.f29182x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        oh0 oh0Var = this.f28040s;
        TLRPC.Poll poll = oh0Var.f29179r;
        MessageObject messageObject = oh0Var.f29178n;
        if (view == null) {
            view = new jh0(this, this.f28039r);
        }
        mh0 mh0Var = (mh0) view;
        if (i10 == 0) {
            mh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        nh0 nh0Var = (nh0) oh0Var.f29182x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, nh0Var.d) && ((lh0) oh0Var.f29181w.get(nh0Var)) != null) {
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
                mh0Var.a(str2, arrayList, oh0Var.R(nh0Var.d), nh0Var.f28949a, nh0Var.a(), false);
                mh0Var.setTag(R.id.object_tag, nh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f28040s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        oh0 oh0Var = this.f28040s;
        TLRPC.Poll poll = oh0Var.f29179r;
        ArrayList arrayList2 = oh0Var.f29182x;
        MessageObject messageObject = oh0Var.f29178n;
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                nh0 nh0Var = (nh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).o(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", nh0Var.f28949a - nh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        mh0 mh0Var = (mh0) view;
        nh0 nh0Var2 = (nh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = nh0Var2.f28950b;
        byte[] bArr = nh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((lh0) oh0Var.f29181w.get(nh0Var2)) != null) {
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
                mh0Var.a(str2, arrayList, oh0Var.R(bArr), nh0Var2.f28949a, nh0Var2.a(), false);
                mh0Var.setTag(R.id.object_tag, nh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        oh0 oh0Var = this.f28040s;
        View view = oh0Var.f29183y;
        Context context = this.f28039r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    int i11 = org.telegram.ui.ActionBar.k6.f21254h5;
                    g6Var = ((org.telegram.ui.ActionBar.h3) oh0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.r6.i(i11, r8Var2, g6Var);
                    r8Var2.g(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.q6);
                    r8Var = r8Var2;
                } else {
                    View jh0Var = new jh0(this, context);
                    jh0Var.setTag(-33024);
                    r8Var = jh0Var;
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
            r8Var = new PollVotesAlert$UserCell(oh0Var, context);
        }
        return new s4.b1(r8Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (b1Var.f46346f == 0) {
            int b10 = b1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) b1Var.f46343a;
            oh0 oh0Var = this.f28040s;
            nh0 nh0Var = (nh0) oh0Var.f29182x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) nh0Var.f28950b.get(Q);
            TLObject userOrChat = oh0Var.S().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == nh0Var.b() - 1 && TextUtils.isEmpty(nh0Var.f28951c) && !nh0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            w9 w9Var = pollVotesAlert$UserCell.f24413a;
            org.telegram.ui.ActionBar.n5 n5Var = pollVotesAlert$UserCell.f24414b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f24417n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24417n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24417n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f24415c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f24421x = z12;
            pollVotesAlert$UserCell.f24420w = Q;
            if (userOrChat == null) {
                n5Var.l("", false);
                w9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24419s;
                h9 h9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24417n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    h9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24417n;
                    if (chat2 != null) {
                        h9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24418r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f24418r = Emoji.replaceEmoji(userName, n5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24417n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24418r = str;
                        pollVotesAlert$UserCell.f24418r = Emoji.replaceEmoji(str, n5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24418r = "";
                    }
                }
                n5Var.l(pollVotesAlert$UserCell.f24418r, z11);
                jx0 jx0Var = pollVotesAlert$UserCell.f24416f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24417n;
                int i12 = org.telegram.ui.ActionBar.k6.f21591z9;
                g6Var = ((org.telegram.ui.ActionBar.h3) pollVotesAlert$UserCell.F).resourcesProvider;
                n5Var.i(jx0Var.b(user3, chat4, org.telegram.ui.ActionBar.k6.w0(i12, g6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24417n;
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
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(n5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, oh0.R, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24421x) {
                pollVotesAlert$UserCell.f24422y = 0.0f;
            }
        }
    }
}
