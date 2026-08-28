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
public final class wf0 extends sk0 {
    public final Context f34220r;
    public final ag0 f34221s;

    public wf0(ag0 ag0Var, Context context) {
        this.f34221s = ag0Var;
        this.f34220r = context;
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i9) {
        int i10 = 1;
        if (i9 == 0) {
            return 1;
        }
        zf0 zf0Var = (zf0) this.f34221s.f26791x.get(i9 - 1);
        int b10 = zf0Var.b() + 1;
        if (TextUtils.isEmpty(zf0Var.f35300c) && !zf0Var.f35301e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override
    public final Object O(int i9, int i10) {
        int i11;
        if (i9 == 0) {
            return 293145;
        }
        int i12 = i9 - 1;
        if (i10 == 0) {
            return -928312;
        }
        if (i12 >= 0) {
            ag0 ag0Var = this.f34221s;
            if (i12 < ag0Var.f26791x.size() && (i11 = i10 - 1) < ((zf0) ag0Var.f26791x.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((zf0) ag0Var.f26791x.get(i12)).f35299b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override
    public final int P(int i9, int i10) {
        if (i9 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        if (i10 - 1 < ((zf0) this.f34221s.f26791x.get(i9 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f34221s.f26791x.size() + 1;
    }

    @Override
    public final View T(int i9, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        ag0 ag0Var = this.f34221s;
        TLRPC.Poll poll = ag0Var.f26788r;
        MessageObject messageObject = ag0Var.f26787n;
        if (view == null) {
            view = new vf0(this, this.f34220r);
        }
        yf0 yf0Var = (yf0) view;
        if (i9 == 0) {
            yf0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        zf0 zf0Var = (zf0) ag0Var.f26791x.get(i9 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, zf0Var.d) && ((xf0) ag0Var.f26790w.get(zf0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i10);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i10++;
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
                yf0Var.a(str2, arrayList, ag0Var.O(zf0Var.d), zf0Var.f35298a, zf0Var.a(), false);
                yf0Var.setTag(R.id.object_tag, zf0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        if (i9 != 0 && i10 != 0) {
            ArrayList arrayList = this.f34221s.B;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        ag0 ag0Var = this.f34221s;
        TLRPC.Poll poll = ag0Var.f26788r;
        ArrayList arrayList2 = ag0Var.f26791x;
        MessageObject messageObject = ag0Var.f26787n;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                zf0 zf0Var = (zf0) arrayList2.get(i9 - 1);
                ((org.telegram.ui.Cells.p8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", zf0Var.f35298a - zf0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        yf0 yf0Var = (yf0) view;
        zf0 zf0Var2 = (zf0) arrayList2.get(i9 - 1);
        ArrayList arrayList3 = zf0Var2.f35299b;
        byte[] bArr = zf0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((xf0) ag0Var.f26790w.get(zf0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i12++;
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
                yf0Var.a(str2, arrayList, ag0Var.O(bArr), zf0Var2.f35298a, zf0Var2.a(), false);
                yf0Var.setTag(R.id.object_tag, zf0Var2);
                return;
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.p8 p8Var;
        ag0 ag0Var = this.f34221s;
        View view = ag0Var.f26792y;
        Context context = this.f34220r;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(23, context, true);
                    p8Var2.setOffsetFromImage(65);
                    p8Var2.setBackgroundColor(ag0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
                    p8Var2.e(org.telegram.ui.ActionBar.f6.N6, org.telegram.ui.ActionBar.f6.f23229q6);
                    p8Var = p8Var2;
                } else {
                    View vf0Var = new vf0(this, context);
                    vf0Var.setTag(-33024);
                    p8Var = vf0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                p8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    p8Var = view;
                }
            }
        } else {
            p8Var = new PollVotesAlert$UserCell(ag0Var, context);
        }
        return new f2.q1(p8Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (q1Var.f5505f == 0) {
            int b10 = q1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) q1Var.f5501a;
            ag0 ag0Var = this.f34221s;
            zf0 zf0Var = (zf0) ag0Var.f26791x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) zf0Var.f35299b.get(Q);
            TLObject userOrChat = ag0Var.P().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i9 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == zf0Var.b() - 1 && TextUtils.isEmpty(zf0Var.f35300c) && !zf0Var.f35301e) {
                z10 = false;
            } else {
                z10 = true;
            }
            o9 o9Var = pollVotesAlert$UserCell.f26435a;
            org.telegram.ui.ActionBar.h5 h5Var = pollVotesAlert$UserCell.f26436b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f26440n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f26440n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f26440n = null;
            }
            long j10 = i9;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f26437c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f26444x = z12;
            pollVotesAlert$UserCell.f26443w = Q;
            if (userOrChat == null) {
                h5Var.l("", false);
                o9Var.setImageDrawable(null);
            } else {
                int i10 = pollVotesAlert$UserCell.f26442s;
                z8 z8Var = pollVotesAlert$UserCell.f26438e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f26440n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    z8Var.m(i10, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f26440n;
                    if (chat2 != null) {
                        z8Var.k(i10, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f26441r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f26441r = Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f26440n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f26441r = str;
                        pollVotesAlert$UserCell.f26441r = Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f26441r = "";
                    }
                }
                h5Var.l(pollVotesAlert$UserCell.f26441r, z11);
                sv0 sv0Var = pollVotesAlert$UserCell.f26439f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f26440n;
                int i11 = org.telegram.ui.ActionBar.f6.f23389z9;
                b6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.B).resourcesProvider;
                h5Var.i(sv0Var.a(user3, chat4, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f26440n;
                if (chat5 != null) {
                    o9Var.e(chat5, z8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        o9Var.e(user4, z8Var);
                    } else {
                        o9Var.setImageDrawable(z8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.A;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(o9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ag0.K, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f26444x) {
                pollVotesAlert$UserCell.f26445y = 0.0f;
            }
        }
    }
}
