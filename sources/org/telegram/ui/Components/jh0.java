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
    public final Context f29646r;
    public final nh0 f29647s;

    public jh0(nh0 nh0Var, Context context) {
        this.f29647s = nh0Var;
        this.f29646r = context;
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
        mh0 mh0Var = (mh0) this.f29647s.f30980x.get(i10 - 1);
        int b10 = mh0Var.b() + 1;
        if (TextUtils.isEmpty(mh0Var.f30586c) && !mh0Var.e) {
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
            nh0 nh0Var = this.f29647s;
            if (i13 < nh0Var.f30980x.size() && (i12 = i11 - 1) < ((mh0) nh0Var.f30980x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((mh0) nh0Var.f30980x.get(i13)).f30585b.get(i12)).peer))));
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
        if (i11 - 1 < ((mh0) this.f29647s.f30980x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f29647s.f30980x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        nh0 nh0Var = this.f29647s;
        TLRPC.Poll poll = nh0Var.f30977r;
        MessageObject messageObject = nh0Var.f30976n;
        if (view == null) {
            view = new ih0(this, this.f29646r);
        }
        lh0 lh0Var = (lh0) view;
        if (i10 == 0) {
            lh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        mh0 mh0Var = (mh0) nh0Var.f30980x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, mh0Var.d) && ((kh0) nh0Var.f30979w.get(mh0Var)) != null) {
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
                lh0Var.a(str2, arrayList, nh0Var.R(mh0Var.d), mh0Var.f30584a, mh0Var.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f29647s.F;
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
        nh0 nh0Var = this.f29647s;
        TLRPC.Poll poll = nh0Var.f30977r;
        ArrayList arrayList2 = nh0Var.f30980x;
        MessageObject messageObject = nh0Var.f30976n;
        int i12 = e1Var.f47738f;
        View view = e1Var.f47735a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                mh0 mh0Var = (mh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.v8) view).o(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", mh0Var.f30584a - mh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        lh0 lh0Var = (lh0) view;
        mh0 mh0Var2 = (mh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = mh0Var2.f30585b;
        byte[] bArr = mh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((kh0) nh0Var.f30979w.get(mh0Var2)) != null) {
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
                lh0Var.a(str2, arrayList, nh0Var.R(bArr), mh0Var2.f30584a, mh0Var2.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        nh0 nh0Var = this.f29647s;
        View view = nh0Var.f30981y;
        Context context = this.f29646r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(23, context, true);
                    v8Var2.setOffsetFromImage(65);
                    int i11 = org.telegram.ui.ActionBar.y6.f23425h5;
                    u6Var = ((org.telegram.ui.ActionBar.k3) nh0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.i(i11, v8Var2, u6Var);
                    v8Var2.g(org.telegram.ui.ActionBar.y6.N6, org.telegram.ui.ActionBar.y6.f23595q6);
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
        if (e1Var.f47738f == 0) {
            int b10 = e1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) e1Var.f47735a;
            nh0 nh0Var = this.f29647s;
            mh0 mh0Var = (mh0) nh0Var.f30980x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) mh0Var.f30585b.get(Q);
            TLObject userOrChat = nh0Var.S().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == mh0Var.b() - 1 && TextUtils.isEmpty(mh0Var.f30586c) && !mh0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            y9 y9Var = pollVotesAlert$UserCell.f26204a;
            org.telegram.ui.ActionBar.b6 b6Var = pollVotesAlert$UserCell.f26205b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f26208n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f26208n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f26208n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f26206c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f26212x = z12;
            pollVotesAlert$UserCell.f26211w = Q;
            if (userOrChat == null) {
                b6Var.l("", false);
                y9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f26210s;
                j9 j9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f26208n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    j9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f26208n;
                    if (chat2 != null) {
                        j9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f26209r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f26209r = Emoji.replaceEmoji(userName, b6Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f26208n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f26209r = str;
                        pollVotesAlert$UserCell.f26209r = Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f26209r = "";
                    }
                }
                b6Var.l(pollVotesAlert$UserCell.f26209r, z11);
                qx0 qx0Var = pollVotesAlert$UserCell.f26207f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f26208n;
                int i12 = org.telegram.ui.ActionBar.y6.f23768z9;
                u6Var = ((org.telegram.ui.ActionBar.k3) pollVotesAlert$UserCell.F).resourcesProvider;
                b6Var.i(qx0Var.b(user3, chat4, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f26208n;
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
            } else if (!pollVotesAlert$UserCell.f26212x) {
                pollVotesAlert$UserCell.f26213y = 0.0f;
            }
        }
    }
}
