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
    public final Context f27701r;
    public final nh0 f27702s;

    public jh0(nh0 nh0Var, Context context) {
        this.f27702s = nh0Var;
        this.f27701r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(lm0 lm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        mh0 mh0Var = (mh0) this.f27702s.f28917x.get(i10 - 1);
        int b10 = mh0Var.b() + 1;
        if (TextUtils.isEmpty(mh0Var.f28601c) && !mh0Var.e) {
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
            nh0 nh0Var = this.f27702s;
            if (i13 < nh0Var.f28917x.size() && (i12 = i11 - 1) < ((mh0) nh0Var.f28917x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((mh0) nh0Var.f28917x.get(i13)).f28600b.get(i12)).peer))));
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
        if (i11 - 1 < ((mh0) this.f27702s.f28917x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f27702s.f28917x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        nh0 nh0Var = this.f27702s;
        TLRPC.Poll poll = nh0Var.f28914r;
        MessageObject messageObject = nh0Var.f28913n;
        if (view == null) {
            view = new ih0(this, this.f27701r);
        }
        lh0 lh0Var = (lh0) view;
        if (i10 == 0) {
            lh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        mh0 mh0Var = (mh0) nh0Var.f28917x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, mh0Var.d) && ((kh0) nh0Var.f28916w.get(mh0Var)) != null) {
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
                lh0Var.a(str2, arrayList, nh0Var.R(mh0Var.d), mh0Var.f28599a, mh0Var.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f27702s.F;
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
        nh0 nh0Var = this.f27702s;
        TLRPC.Poll poll = nh0Var.f28914r;
        ArrayList arrayList2 = nh0Var.f28917x;
        MessageObject messageObject = nh0Var.f28913n;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                mh0 mh0Var = (mh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).o(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", mh0Var.f28599a - mh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        lh0 lh0Var = (lh0) view;
        mh0 mh0Var2 = (mh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = mh0Var2.f28600b;
        byte[] bArr = mh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((kh0) nh0Var.f28916w.get(mh0Var2)) != null) {
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
                lh0Var.a(str2, arrayList, nh0Var.R(bArr), mh0Var2.f28599a, mh0Var2.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        nh0 nh0Var = this.f27702s;
        View view = nh0Var.f28918y;
        Context context = this.f27701r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    int i11 = org.telegram.ui.ActionBar.k6.f21255h5;
                    g6Var = ((org.telegram.ui.ActionBar.h3) nh0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.r6.i(i11, r8Var2, g6Var);
                    r8Var2.g(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.q6);
                    r8Var = r8Var2;
                } else {
                    View ih0Var = new ih0(this, context);
                    ih0Var.setTag(-33024);
                    r8Var = ih0Var;
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
            r8Var = new PollVotesAlert$UserCell(nh0Var, context);
        }
        return new s4.b1(r8Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (b1Var.f46345f == 0) {
            int b10 = b1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) b1Var.f46342a;
            nh0 nh0Var = this.f27702s;
            mh0 mh0Var = (mh0) nh0Var.f28917x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) mh0Var.f28600b.get(Q);
            TLObject userOrChat = nh0Var.S().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == mh0Var.b() - 1 && TextUtils.isEmpty(mh0Var.f28601c) && !mh0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            u9 u9Var = pollVotesAlert$UserCell.f24414a;
            org.telegram.ui.ActionBar.n5 n5Var = pollVotesAlert$UserCell.f24415b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f24418n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24418n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24418n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f24416c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f24422x = z12;
            pollVotesAlert$UserCell.f24421w = Q;
            if (userOrChat == null) {
                n5Var.l("", false);
                u9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24420s;
                f9 f9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24418n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    f9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24418n;
                    if (chat2 != null) {
                        f9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24419r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f24419r = Emoji.replaceEmoji(userName, n5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24418n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24419r = str;
                        pollVotesAlert$UserCell.f24419r = Emoji.replaceEmoji(str, n5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24419r = "";
                    }
                }
                n5Var.l(pollVotesAlert$UserCell.f24419r, z11);
                ix0 ix0Var = pollVotesAlert$UserCell.f24417f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24418n;
                int i12 = org.telegram.ui.ActionBar.k6.f21592z9;
                g6Var = ((org.telegram.ui.ActionBar.h3) pollVotesAlert$UserCell.F).resourcesProvider;
                n5Var.i(ix0Var.b(user3, chat4, org.telegram.ui.ActionBar.k6.w0(i12, g6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24418n;
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
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(n5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, nh0.R, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24422x) {
                pollVotesAlert$UserCell.f24423y = 0.0f;
            }
        }
    }
}
