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
public final class gh0 extends em0 {
    public final Context f26593r;
    public final kh0 f26594s;

    public gh0(kh0 kh0Var, Context context) {
        this.f26594s = kh0Var;
        this.f26593r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        jh0 jh0Var = (jh0) this.f26594s.f27860x.get(i10 - 1);
        int b10 = jh0Var.b() + 1;
        if (TextUtils.isEmpty(jh0Var.f27529c) && !jh0Var.e) {
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
            kh0 kh0Var = this.f26594s;
            if (i13 < kh0Var.f27860x.size() && (i12 = i11 - 1) < ((jh0) kh0Var.f27860x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((jh0) kh0Var.f27860x.get(i13)).f27528b.get(i12)).peer))));
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
        if (i11 - 1 < ((jh0) this.f26594s.f27860x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f26594s.f27860x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        kh0 kh0Var = this.f26594s;
        TLRPC.Poll poll = kh0Var.f27857r;
        MessageObject messageObject = kh0Var.f27856n;
        if (view == null) {
            view = new fh0(this, this.f26593r);
        }
        ih0 ih0Var = (ih0) view;
        if (i10 == 0) {
            ih0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        jh0 jh0Var = (jh0) kh0Var.f27860x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, jh0Var.d) && ((hh0) kh0Var.f27859w.get(jh0Var)) != null) {
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
                ih0Var.a(str2, arrayList, kh0Var.Q(jh0Var.d), jh0Var.f27527a, jh0Var.a(), false);
                ih0Var.setTag(R.id.object_tag, jh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f26594s.F;
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
        kh0 kh0Var = this.f26594s;
        TLRPC.Poll poll = kh0Var.f27857r;
        ArrayList arrayList2 = kh0Var.f27860x;
        MessageObject messageObject = kh0Var.f27856n;
        int i12 = b1Var.f45915f;
        View view = b1Var.f45912a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                jh0 jh0Var = (jh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.q8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", jh0Var.f27527a - jh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        ih0 ih0Var = (ih0) view;
        jh0 jh0Var2 = (jh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = jh0Var2.f27528b;
        byte[] bArr = jh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((hh0) kh0Var.f27859w.get(jh0Var2)) != null) {
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
                ih0Var.a(str2, arrayList, kh0Var.Q(bArr), jh0Var2.f27527a, jh0Var2.a(), false);
                ih0Var.setTag(R.id.object_tag, jh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q8 q8Var;
        kh0 kh0Var = this.f26594s;
        View view = kh0Var.f27861y;
        Context context = this.f26593r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(23, context, true);
                    q8Var2.setOffsetFromImage(65);
                    q8Var2.setBackgroundColor(kh0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5));
                    q8Var2.e(org.telegram.ui.ActionBar.h6.N6, org.telegram.ui.ActionBar.h6.q6);
                    q8Var = q8Var2;
                } else {
                    View fh0Var = new fh0(this, context);
                    fh0Var.setTag(-33024);
                    q8Var = fh0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                q8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    q8Var = view;
                }
            }
        } else {
            q8Var = new PollVotesAlert$UserCell(kh0Var, context);
        }
        return new s4.b1(q8Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (b1Var.f45915f == 0) {
            int b10 = b1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) b1Var.f45912a;
            kh0 kh0Var = this.f26594s;
            jh0 jh0Var = (jh0) kh0Var.f27860x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) jh0Var.f27528b.get(Q);
            TLObject userOrChat = kh0Var.R().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == jh0Var.b() - 1 && TextUtils.isEmpty(jh0Var.f27529c) && !jh0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            w9 w9Var = pollVotesAlert$UserCell.f24266a;
            org.telegram.ui.ActionBar.j5 j5Var = pollVotesAlert$UserCell.f24267b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f24270n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24270n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24270n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f24268c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f24274x = z12;
            pollVotesAlert$UserCell.f24273w = Q;
            if (userOrChat == null) {
                j5Var.l("", false);
                w9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24272s;
                h9 h9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24270n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    h9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24270n;
                    if (chat2 != null) {
                        h9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24271r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f24271r = Emoji.replaceEmoji(userName, j5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24270n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24271r = str;
                        pollVotesAlert$UserCell.f24271r = Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24271r = "";
                    }
                }
                j5Var.l(pollVotesAlert$UserCell.f24271r, z11);
                fx0 fx0Var = pollVotesAlert$UserCell.f24269f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24270n;
                int i12 = org.telegram.ui.ActionBar.h6.f21395z9;
                d6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.F).resourcesProvider;
                j5Var.i(fx0Var.a(user3, chat4, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24270n;
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
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, kh0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24274x) {
                pollVotesAlert$UserCell.f24275y = 0.0f;
            }
        }
    }
}
