package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
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

public final class yf0 extends vk0 {

    public final Context f34892r;

    public final cg0 f34893s;

    public yf0(cg0 cg0Var, Context context) {
        this.f34893s = cg0Var;
        this.f34892r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        bg0 bg0Var = (bg0) this.f34893s.f27425x.get(i10 - 1);
        int iB = bg0Var.b() + 1;
        if (TextUtils.isEmpty(bg0Var.f27094c) && !bg0Var.f27095e) {
            i11 = 0;
        }
        return iB + i11;
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
            cg0 cg0Var = this.f34893s;
            if (i13 < cg0Var.f27425x.size() && (i12 = i11 - 1) < ((bg0) cg0Var.f27425x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((bg0) cg0Var.f27425x.get(i13)).f27093b.get(i12)).peer))));
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
        return i11 + (-1) < ((bg0) this.f34893s.f27425x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override
    public final int R() {
        return this.f34893s.f27425x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        TLRPC.Message message;
        cg0 cg0Var = this.f34893s;
        TLRPC.Poll poll = cg0Var.f27422r;
        MessageObject messageObject = cg0Var.f27421n;
        if (view == null) {
            view = new xf0(this, this.f34892r);
        }
        ag0 ag0Var = (ag0) view;
        if (i10 == 0) {
            ag0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        bg0 bg0Var = (bg0) cg0Var.f27425x.get(i10 - 1);
        int size = poll.answers.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, bg0Var.d) && ((zf0) cg0Var.f27424w.get(bg0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    for (int i12 = 0; i12 < messageObject.messageOwner.translatedPoll.answers.size(); i12++) {
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                    }
                }
                ag0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, cg0Var.P(bg0Var.d), bg0Var.f27092a, bg0Var.a(), false);
                ag0Var.setTag(R.id.object_tag, bg0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.f34893s.B;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override
    public final void W(int i10, int i11, f2.o1 o1Var) {
        TLRPC.Message message;
        cg0 cg0Var = this.f34893s;
        TLRPC.Poll poll = cg0Var.f27422r;
        ArrayList arrayList = cg0Var.f27425x;
        MessageObject messageObject = cg0Var.f27421n;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            bg0 bg0Var = (bg0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.l8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", bg0Var.f27092a - bg0Var.b(), new Object[0]), false);
            return;
        }
        ag0 ag0Var = (ag0) view;
        bg0 bg0Var2 = (bg0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = bg0Var2.f27093b;
        byte[] bArr = bg0Var2.d;
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((zf0) cg0Var.f27424w.get(bg0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    for (int i14 = 0; i14 < messageObject.messageOwner.translatedPoll.answers.size(); i14++) {
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i14);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                    }
                }
                ag0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, cg0Var.P(bArr), bg0Var2.f27092a, bg0Var2.a(), false);
                ag0Var.setTag(R.id.object_tag, bg0Var2);
                return;
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View pollVotesAlert$UserCell;
        cg0 cg0Var = this.f34893s;
        s5 s5Var = cg0Var.f27426y;
        Context context = this.f34892r;
        if (i10 == 0) {
            pollVotesAlert$UserCell = new PollVotesAlert$UserCell(cg0Var, context);
        } else if (i10 != 1) {
            if (i10 != 2) {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, context, true);
                l8Var.setOffsetFromImage(65);
                l8Var.setBackgroundColor(cg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                l8Var.e(org.telegram.ui.ActionBar.g6.N6, org.telegram.ui.ActionBar.g6.q6);
                pollVotesAlert$UserCell = l8Var;
            } else {
                xf0 xf0Var = new xf0(this, context);
                xf0Var.setTag(-33024);
                pollVotesAlert$UserCell = xf0Var;
            }
        } else if (s5Var.getParent() != null) {
            pollVotesAlert$UserCell = s5Var;
            ((ViewGroup) s5Var.getParent()).removeView(s5Var);
            pollVotesAlert$UserCell = s5Var;
        }
        pollVotesAlert$UserCell = s5Var;
        return new lk0(pollVotesAlert$UserCell);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        TLRPC.Chat chat;
        boolean z10;
        if (o1Var.f5793f == 0) {
            int iB = o1Var.b();
            int iS = S(iB);
            int iQ = Q(iB) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) o1Var.f5789a;
            cg0 cg0Var = this.f34893s;
            bg0 bg0Var = (bg0) cg0Var.f27425x.get(iS - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) bg0Var.f27093b.get(iQ);
            TLObject userOrChat = cg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = (iQ == bg0Var.b() - 1 && TextUtils.isEmpty(bg0Var.f27094c) && !bg0Var.f27095e) ? false : true;
            n9 n9Var = pollVotesAlert$UserCell.f26431a;
            org.telegram.ui.ActionBar.h5 h5Var = pollVotesAlert$UserCell.f26432b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f26436n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f26436n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f26436n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f26433c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z11;
            pollVotesAlert$UserCell.f26440x = userOrChat == null;
            pollVotesAlert$UserCell.f26439w = iQ;
            if (userOrChat == null) {
                h5Var.l("", false);
                n9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f26438s;
                y8 y8Var = pollVotesAlert$UserCell.f26434e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f26436n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    y8Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f26436n;
                    if (chat2 != null) {
                        y8Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f26437r = userName;
                    z10 = false;
                    pollVotesAlert$UserCell.f26437r = Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f26436n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f26437r = str;
                        pollVotesAlert$UserCell.f26437r = Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f26437r = "";
                    }
                }
                h5Var.l(pollVotesAlert$UserCell.f26437r, z10);
                h5Var.i(pollVotesAlert$UserCell.f26435f.a(pollVotesAlert$UserCell.h, pollVotesAlert$UserCell.f26436n, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, ((org.telegram.ui.ActionBar.e3) pollVotesAlert$UserCell.B).resourcesProvider), z10));
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f26436n;
                if (chat4 != null) {
                    n9Var.e(chat4, y8Var);
                } else {
                    TLRPC.User user3 = pollVotesAlert$UserCell.h;
                    if (user3 != null) {
                        n9Var.e(user3, y8Var);
                    } else {
                        n9Var.setImageDrawable(y8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.A;
            if (arrayList == null) {
                if (pollVotesAlert$UserCell.f26440x) {
                    return;
                }
                pollVotesAlert$UserCell.f26441y = 0.0f;
            } else {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, cg0.K, 1.0f, 0.0f));
            }
        }
    }
}
