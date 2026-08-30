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
public final class rg0 extends ol0 {
    public final Context f28462r;
    public final vg0 f28463s;

    public rg0(vg0 vg0Var, Context context) {
        this.f28463s = vg0Var;
        this.f28462r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        ug0 ug0Var = (ug0) this.f28463s.f29468x.get(i10 - 1);
        int b10 = ug0Var.b() + 1;
        if (TextUtils.isEmpty(ug0Var.f29217c) && !ug0Var.e) {
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
            vg0 vg0Var = this.f28463s;
            if (i13 < vg0Var.f29468x.size() && (i12 = i11 - 1) < ((ug0) vg0Var.f29468x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((ug0) vg0Var.f29468x.get(i13)).f29216b.get(i12)).peer))));
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
        if (i11 - 1 < ((ug0) this.f28463s.f29468x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f28463s.f29468x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        vg0 vg0Var = this.f28463s;
        TLRPC.Poll poll = vg0Var.f29465r;
        MessageObject messageObject = vg0Var.f29464n;
        if (view == null) {
            view = new qg0(this, this.f28462r);
        }
        tg0 tg0Var = (tg0) view;
        if (i10 == 0) {
            tg0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ug0 ug0Var = (ug0) vg0Var.f29468x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, ug0Var.d) && ((sg0) vg0Var.f29467w.get(ug0Var)) != null) {
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
                tg0Var.a(str2, arrayList, vg0Var.P(ug0Var.d), ug0Var.f29215a, ug0Var.a(), false);
                tg0Var.setTag(R.id.object_tag, ug0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f28463s.C;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.l1 l1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        vg0 vg0Var = this.f28463s;
        TLRPC.Poll poll = vg0Var.f29465r;
        ArrayList arrayList2 = vg0Var.f29468x;
        MessageObject messageObject = vg0Var.f29464n;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                ug0 ug0Var = (ug0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.o8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", ug0Var.f29215a - ug0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        tg0 tg0Var = (tg0) view;
        ug0 ug0Var2 = (ug0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = ug0Var2.f29216b;
        byte[] bArr = ug0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((sg0) vg0Var.f29467w.get(ug0Var2)) != null) {
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
                tg0Var.a(str2, arrayList, vg0Var.P(bArr), ug0Var2.f29215a, ug0Var2.a(), false);
                tg0Var.setTag(R.id.object_tag, ug0Var2);
                return;
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        vg0 vg0Var = this.f28463s;
        View view = vg0Var.f29469y;
        Context context = this.f28462r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(23, context, true);
                    o8Var2.setOffsetFromImage(65);
                    o8Var2.setBackgroundColor(vg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
                    o8Var2.e(org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.f20140q6);
                    o8Var = o8Var2;
                } else {
                    View qg0Var = new qg0(this, context);
                    qg0Var.setTag(-33024);
                    o8Var = qg0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                o8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    o8Var = view;
                }
            }
        } else {
            o8Var = new PollVotesAlert$UserCell(vg0Var, context);
        }
        return new f2.l1(o8Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        boolean z4;
        TLRPC.Chat chat;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (l1Var.f5788f == 0) {
            int b10 = l1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) l1Var.f5785a;
            vg0 vg0Var = this.f28463s;
            ug0 ug0Var = (ug0) vg0Var.f29468x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ug0Var.f29216b.get(Q);
            TLObject userOrChat = vg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = true;
            if (Q == ug0Var.b() - 1 && TextUtils.isEmpty(ug0Var.f29217c) && !ug0Var.e) {
                z4 = false;
            } else {
                z4 = true;
            }
            p9 p9Var = pollVotesAlert$UserCell.f23080a;
            org.telegram.ui.ActionBar.k5 k5Var = pollVotesAlert$UserCell.f23081b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f23084n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f23084n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f23084n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f23082c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z4;
            if (userOrChat != null) {
                z11 = false;
            }
            pollVotesAlert$UserCell.f23088x = z11;
            pollVotesAlert$UserCell.f23087w = Q;
            if (userOrChat == null) {
                k5Var.l("", false);
                p9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f23086s;
                z8 z8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f23084n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    z8Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f23084n;
                    if (chat2 != null) {
                        z8Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f23085r = userName;
                    z10 = false;
                    pollVotesAlert$UserCell.f23085r = Emoji.replaceEmoji(userName, k5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f23084n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f23085r = str;
                        pollVotesAlert$UserCell.f23085r = Emoji.replaceEmoji(str, k5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f23085r = "";
                    }
                }
                k5Var.l(pollVotesAlert$UserCell.f23085r, z10);
                lw0 lw0Var = pollVotesAlert$UserCell.f23083f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f23084n;
                int i12 = org.telegram.ui.ActionBar.j6.f20301z9;
                f6Var = ((org.telegram.ui.ActionBar.g3) pollVotesAlert$UserCell.C).resourcesProvider;
                k5Var.i(lw0Var.a(user3, chat4, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f23084n;
                if (chat5 != null) {
                    p9Var.e(chat5, z8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        p9Var.e(user4, z8Var);
                    } else {
                        p9Var.setImageDrawable(z8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.B;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(p9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, vg0.L, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f23088x) {
                pollVotesAlert$UserCell.f23089y = 0.0f;
            }
        }
    }
}
