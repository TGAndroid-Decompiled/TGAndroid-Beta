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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ne0 extends lj0 {
    public final Context f36350r;
    public final re0 f36351s;

    public ne0(re0 re0Var, Context context) {
        this.f36351s = re0Var;
        this.f36350r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        qe0 qe0Var = (qe0) this.f36351s.f37694t1.get(i7 - 1);
        int b10 = qe0Var.b() + 1;
        if (TextUtils.isEmpty(qe0Var.f37301c) && !qe0Var.f37302e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override
    public final Object O(int i7, int i10) {
        int i11;
        if (i7 == 0) {
            return 293145;
        }
        int i12 = i7 - 1;
        if (i10 == 0) {
            return -928312;
        }
        if (i12 >= 0) {
            re0 re0Var = this.f36351s;
            if (i12 < re0Var.f37694t1.size() && (i11 = i10 - 1) < ((qe0) re0Var.f37694t1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((qe0) re0Var.f37694t1.get(i12)).f37300b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        if (i10 - 1 < ((qe0) this.f36351s.f37694t1.get(i7 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f36351s.f37694t1.size() + 1;
    }

    @Override
    public final View T(int i7, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        re0 re0Var = this.f36351s;
        TLRPC.Poll poll = re0Var.f37690p1;
        org.telegram.messenger.ij ijVar = re0Var.f37689o1;
        if (view == null) {
            view = new me0(this, this.f36350r);
        }
        pe0 pe0Var = (pe0) view;
        if (i7 == 0) {
            pe0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        qe0 qe0Var = (qe0) re0Var.f37694t1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, qe0Var.d) && ((oe0) re0Var.f37693s1.get(qe0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.f23262k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= ijVar.f23262k.translatedPoll.f21771b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.f23262k.translatedPoll.f21771b.get(i10);
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
                pe0Var.a(str2, arrayList, re0Var.K0(qe0Var.d), qe0Var.f37299a, qe0Var.a(), false);
                pe0Var.setTag(2131296585, qe0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 != 0 && i10 != 0) {
            ArrayList arrayList = this.f36351s.f37697w1;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        re0 re0Var = this.f36351s;
        TLRPC.Poll poll = re0Var.f37690p1;
        ArrayList arrayList2 = re0Var.f37694t1;
        org.telegram.messenger.ij ijVar = re0Var.f37689o1;
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                qe0 qe0Var = (qe0) arrayList2.get(i7 - 1);
                ((org.telegram.ui.Cells.m8) view).o(2131230871, org.telegram.messenger.id.G(qe0Var.f37299a - qe0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        pe0 pe0Var = (pe0) view;
        qe0 qe0Var2 = (qe0) arrayList2.get(i7 - 1);
        ArrayList arrayList3 = qe0Var2.f37300b;
        byte[] bArr = qe0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((oe0) re0Var.f37693s1.get(qe0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.f23262k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= ijVar.f23262k.translatedPoll.f21771b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.f23262k.translatedPoll.f21771b.get(i12);
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
                pe0Var.a(str2, arrayList, re0Var.K0(bArr), qe0Var2.f37299a, qe0Var2.a(), false);
                pe0Var.setTag(2131296585, qe0Var2);
                return;
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        re0 re0Var = this.f36351s;
        View view = re0Var.f37695u1;
        Context context = this.f36350r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context, true);
                    m8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, m8Var2, re0Var.I0);
                    m8Var2.g(org.telegram.ui.ActionBar.l6.N6, org.telegram.ui.ActionBar.l6.f28105q6);
                    m8Var = m8Var2;
                } else {
                    View me0Var = new me0(this, context);
                    me0Var.setTag(-33024);
                    m8Var = me0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                m8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    m8Var = view;
                }
            }
        } else {
            m8Var = new PollVotesAlert$UserCell(re0Var, context);
        }
        return new v4.d1(m8Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9;
        TLRPC.Chat chat;
        boolean z10;
        if (d1Var.f57060f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.f57056a;
            re0 re0Var = this.f36351s;
            qe0 qe0Var = (qe0) re0Var.f37694t1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) qe0Var.f37300b.get(Q);
            TLObject e22 = org.telegram.messenger.qp.s1(re0Var.f28621a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z11 = true;
            if (Q == qe0Var.b() - 1 && TextUtils.isEmpty(qe0Var.f37301c) && !qe0Var.f37302e) {
                z9 = false;
            } else {
                z9 = true;
            }
            l9 l9Var = pollVotesAlert$UserCell.f31442a;
            org.telegram.ui.ActionBar.l5 l5Var = pollVotesAlert$UserCell.f31443b;
            if (e22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) e22;
                pollVotesAlert$UserCell.f31447n = null;
            } else if (e22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f31447n = (TLRPC.Chat) e22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f31447n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.id.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.f31444c.setText(org.telegram.messenger.id.r(j3, true));
            pollVotesAlert$UserCell.f31449s = z9;
            if (e22 != null) {
                z11 = false;
            }
            pollVotesAlert$UserCell.f31451x = z11;
            pollVotesAlert$UserCell.f31450w = Q;
            if (e22 == null) {
                l5Var.l("", false);
                l9Var.setImageDrawable(null);
            } else {
                w8 w8Var = pollVotesAlert$UserCell.f31445e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f31447n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    w8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f31447n;
                    if (chat2 != null) {
                        w8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.t10.p(user2);
                    pollVotesAlert$UserCell.f31448r = p10;
                    z10 = false;
                    pollVotesAlert$UserCell.f31448r = org.telegram.messenger.i6.m(p10, l5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f31447n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f31448r = str;
                        pollVotesAlert$UserCell.f31448r = org.telegram.messenger.i6.m(str, l5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f31448r = "";
                    }
                }
                l5Var.l(pollVotesAlert$UserCell.f31448r, z10);
                pu0 pu0Var = pollVotesAlert$UserCell.f31446f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f31447n;
                int i10 = org.telegram.ui.ActionBar.l6.z9;
                re0 re0Var2 = pollVotesAlert$UserCell.E;
                org.telegram.ui.Cells.o8 o8Var = re0.I1;
                l5Var.i(pu0Var.b(user3, chat4, org.telegram.ui.ActionBar.l6.w0(i10, re0Var2.I0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f31447n;
                if (chat5 != null) {
                    l9Var.e(chat5, w8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        l9Var.e(user4, w8Var);
                    } else {
                        l9Var.setImageDrawable(w8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.D;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(l9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(l5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, re0.I1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f31451x) {
                pollVotesAlert$UserCell.f31452y = 0.0f;
            }
        }
    }
}
