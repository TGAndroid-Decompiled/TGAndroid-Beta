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
public final class yg0 extends ul0 {
    public final Context f33277r;
    public final ch0 f33278s;

    public yg0(ch0 ch0Var, Context context) {
        this.f33278s = ch0Var;
        this.f33277r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        bh0 bh0Var = (bh0) this.f33278s.f25428x.get(i10 - 1);
        int b10 = bh0Var.b() + 1;
        if (TextUtils.isEmpty(bh0Var.f24977c) && !bh0Var.f24978e) {
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
            ch0 ch0Var = this.f33278s;
            if (i13 < ch0Var.f25428x.size() && (i12 = i11 - 1) < ((bh0) ch0Var.f25428x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((bh0) ch0Var.f25428x.get(i13)).f24976b.get(i12)).peer))));
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
        if (i11 - 1 < ((bh0) this.f33278s.f25428x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f33278s.f25428x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        ch0 ch0Var = this.f33278s;
        TLRPC.Poll poll = ch0Var.f25425r;
        MessageObject messageObject = ch0Var.f25424n;
        if (view == null) {
            view = new xg0(this, this.f33277r);
        }
        ah0 ah0Var = (ah0) view;
        if (i10 == 0) {
            ah0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        bh0 bh0Var = (bh0) ch0Var.f25428x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, bh0Var.d) && ((zg0) ch0Var.f25427w.get(bh0Var)) != null) {
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
                ah0Var.a(str2, arrayList, ch0Var.N(bh0Var.d), bh0Var.f24975a, bh0Var.a(), false);
                ah0Var.setTag(R.id.object_tag, bh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f33278s.F;
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
        ch0 ch0Var = this.f33278s;
        TLRPC.Poll poll = ch0Var.f25425r;
        ArrayList arrayList2 = ch0Var.f25428x;
        MessageObject messageObject = ch0Var.f25424n;
        int i12 = c1Var.f46542f;
        View view = c1Var.f46538a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                bh0 bh0Var = (bh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", bh0Var.f24975a - bh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        ah0 ah0Var = (ah0) view;
        bh0 bh0Var2 = (bh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = bh0Var2.f24976b;
        byte[] bArr = bh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((zg0) ch0Var.f25427w.get(bh0Var2)) != null) {
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
                ah0Var.a(str2, arrayList, ch0Var.N(bArr), bh0Var2.f24975a, bh0Var2.a(), false);
                ah0Var.setTag(R.id.object_tag, bh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        ch0 ch0Var = this.f33278s;
        View view = ch0Var.f25429y;
        Context context = this.f33277r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    r8Var2.setBackgroundColor(ch0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5));
                    r8Var2.e(org.telegram.ui.ActionBar.i6.N6, org.telegram.ui.ActionBar.i6.q6);
                    r8Var = r8Var2;
                } else {
                    View xg0Var = new xg0(this, context);
                    xg0Var.setTag(-33024);
                    r8Var = xg0Var;
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
            r8Var = new PollVotesAlert$UserCell(ch0Var, context);
        }
        return new s4.c1(r8Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (c1Var.f46542f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.f46538a;
            ch0 ch0Var = this.f33278s;
            bh0 bh0Var = (bh0) ch0Var.f25428x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) bh0Var.f24976b.get(Q);
            TLObject userOrChat = ch0Var.O().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == bh0Var.b() - 1 && TextUtils.isEmpty(bh0Var.f24977c) && !bh0Var.f24978e) {
                z10 = false;
            } else {
                z10 = true;
            }
            w9 w9Var = pollVotesAlert$UserCell.f24227a;
            org.telegram.ui.ActionBar.i5 i5Var = pollVotesAlert$UserCell.f24228b;
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
                i5Var.l("", false);
                w9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24234s;
                h9 h9Var = pollVotesAlert$UserCell.f24230e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24232n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    h9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24232n;
                    if (chat2 != null) {
                        h9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24233r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f24233r = Emoji.replaceEmoji(userName, i5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24232n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24233r = str;
                        pollVotesAlert$UserCell.f24233r = Emoji.replaceEmoji(str, i5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24233r = "";
                    }
                }
                i5Var.l(pollVotesAlert$UserCell.f24233r, z11);
                hx0 hx0Var = pollVotesAlert$UserCell.f24231f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24232n;
                int i12 = org.telegram.ui.ActionBar.i6.f21236z9;
                d6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.F).resourcesProvider;
                i5Var.i(hx0Var.a(user3, chat4, org.telegram.ui.ActionBar.i6.v0(i12, d6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24232n;
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
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(i5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ch0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24236x) {
                pollVotesAlert$UserCell.f24237y = 0.0f;
            }
        }
    }
}
