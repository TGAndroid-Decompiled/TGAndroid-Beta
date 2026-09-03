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
public final class tg0 extends ol0 {
    public final Context f31353r;
    public final xg0 f31354s;

    public tg0(xg0 xg0Var, Context context) {
        this.f31354s = xg0Var;
        this.f31353r = context;
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
        wg0 wg0Var = (wg0) this.f31354s.f33074x.get(i10 - 1);
        int b10 = wg0Var.b() + 1;
        if (TextUtils.isEmpty(wg0Var.f32751c) && !wg0Var.f32752e) {
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
            xg0 xg0Var = this.f31354s;
            if (i13 < xg0Var.f33074x.size() && (i12 = i11 - 1) < ((wg0) xg0Var.f33074x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((wg0) xg0Var.f33074x.get(i13)).f32750b.get(i12)).peer))));
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
        if (i11 - 1 < ((wg0) this.f31354s.f33074x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f31354s.f33074x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        xg0 xg0Var = this.f31354s;
        TLRPC.Poll poll = xg0Var.f33071r;
        MessageObject messageObject = xg0Var.f33070n;
        if (view == null) {
            view = new sg0(this, this.f31353r);
        }
        vg0 vg0Var = (vg0) view;
        if (i10 == 0) {
            vg0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        wg0 wg0Var = (wg0) xg0Var.f33074x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, wg0Var.d) && ((ug0) xg0Var.f33073w.get(wg0Var)) != null) {
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
                vg0Var.a(str2, arrayList, xg0Var.P(wg0Var.d), wg0Var.f32749a, wg0Var.a(), false);
                vg0Var.setTag(R.id.object_tag, wg0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f31354s.C;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.m1 m1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        xg0 xg0Var = this.f31354s;
        TLRPC.Poll poll = xg0Var.f33071r;
        ArrayList arrayList2 = xg0Var.f33074x;
        MessageObject messageObject = xg0Var.f33070n;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                wg0 wg0Var = (wg0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.o8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", wg0Var.f32749a - wg0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        vg0 vg0Var = (vg0) view;
        wg0 wg0Var2 = (wg0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = wg0Var2.f32750b;
        byte[] bArr = wg0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ug0) xg0Var.f33073w.get(wg0Var2)) != null) {
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
                vg0Var.a(str2, arrayList, xg0Var.P(bArr), wg0Var2.f32749a, wg0Var2.a(), false);
                vg0Var.setTag(R.id.object_tag, wg0Var2);
                return;
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        xg0 xg0Var = this.f31354s;
        View view = xg0Var.f33075y;
        Context context = this.f31353r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(23, context, true);
                    o8Var2.setOffsetFromImage(65);
                    o8Var2.setBackgroundColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
                    o8Var2.e(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.f21896q6);
                    o8Var = o8Var2;
                } else {
                    View sg0Var = new sg0(this, context);
                    sg0Var.setTag(-33024);
                    o8Var = sg0Var;
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
            o8Var = new PollVotesAlert$UserCell(xg0Var, context);
        }
        return new f2.m1(o8Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean z4;
        TLRPC.Chat chat;
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (m1Var.f5879f == 0) {
            int b10 = m1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) m1Var.f5875a;
            xg0 xg0Var = this.f31354s;
            wg0 wg0Var = (wg0) xg0Var.f33074x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) wg0Var.f32750b.get(Q);
            TLObject userOrChat = xg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = true;
            if (Q == wg0Var.b() - 1 && TextUtils.isEmpty(wg0Var.f32751c) && !wg0Var.f32752e) {
                z4 = false;
            } else {
                z4 = true;
            }
            p9 p9Var = pollVotesAlert$UserCell.f24934a;
            org.telegram.ui.ActionBar.l5 l5Var = pollVotesAlert$UserCell.f24935b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f24939n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24939n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24939n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f24936c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z4;
            if (userOrChat != null) {
                z11 = false;
            }
            pollVotesAlert$UserCell.f24943x = z11;
            pollVotesAlert$UserCell.f24942w = Q;
            if (userOrChat == null) {
                l5Var.l("", false);
                p9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24941s;
                z8 z8Var = pollVotesAlert$UserCell.f24937e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24939n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    z8Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24939n;
                    if (chat2 != null) {
                        z8Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24940r = userName;
                    z10 = false;
                    pollVotesAlert$UserCell.f24940r = Emoji.replaceEmoji(userName, l5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24939n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24940r = str;
                        pollVotesAlert$UserCell.f24940r = Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24940r = "";
                    }
                }
                l5Var.l(pollVotesAlert$UserCell.f24940r, z10);
                lw0 lw0Var = pollVotesAlert$UserCell.f24938f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24939n;
                int i12 = org.telegram.ui.ActionBar.k6.f22058z9;
                g6Var = ((org.telegram.ui.ActionBar.h3) pollVotesAlert$UserCell.C).resourcesProvider;
                l5Var.i(lw0Var.a(user3, chat4, org.telegram.ui.ActionBar.k6.v0(i12, g6Var), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24939n;
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
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(l5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, xg0.L, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24943x) {
                pollVotesAlert$UserCell.f24944y = 0.0f;
            }
        }
    }
}
