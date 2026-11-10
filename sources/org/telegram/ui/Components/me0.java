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
public final class me0 extends kj0 {
    public final Context f35947r;
    public final qe0 f35948s;

    public me0(qe0 qe0Var, Context context) {
        this.f35948s = qe0Var;
        this.f35947r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        pe0 pe0Var = (pe0) this.f35948s.f37285w1.get(i7 - 1);
        int b10 = pe0Var.b() + 1;
        if (TextUtils.isEmpty(pe0Var.f36900c) && !pe0Var.f36901e) {
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
            qe0 qe0Var = this.f35948s;
            if (i12 < qe0Var.f37285w1.size() && (i11 = i10 - 1) < ((pe0) qe0Var.f37285w1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((pe0) qe0Var.f37285w1.get(i12)).f36899b.get(i11)).peer))));
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
        if (i10 - 1 < ((pe0) this.f35948s.f37285w1.get(i7 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f35948s.f37285w1.size() + 1;
    }

    @Override
    public final View T(int i7, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        qe0 qe0Var = this.f35948s;
        TLRPC.Poll poll = qe0Var.f37281s1;
        org.telegram.messenger.ij ijVar = qe0Var.f37280r1;
        if (view == null) {
            view = new le0(this, this.f35947r);
        }
        oe0 oe0Var = (oe0) view;
        if (i7 == 0) {
            oe0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        pe0 pe0Var = (pe0) qe0Var.f37285w1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, pe0Var.d) && ((ne0) qe0Var.f37284v1.get(pe0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.f23266k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= ijVar.f23266k.translatedPoll.f21776b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.f23266k.translatedPoll.f21776b.get(i10);
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
                oe0Var.a(str2, arrayList, qe0Var.K0(pe0Var.d), pe0Var.f36898a, pe0Var.a(), false);
                oe0Var.setTag(2131296585, pe0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 != 0 && i10 != 0) {
            ArrayList arrayList = this.f35948s.f37288z1;
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
        qe0 qe0Var = this.f35948s;
        TLRPC.Poll poll = qe0Var.f37281s1;
        ArrayList arrayList2 = qe0Var.f37285w1;
        org.telegram.messenger.ij ijVar = qe0Var.f37280r1;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                pe0 pe0Var = (pe0) arrayList2.get(i7 - 1);
                ((org.telegram.ui.Cells.m8) view).o(2131230871, org.telegram.messenger.id.G(pe0Var.f36898a - pe0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        oe0 oe0Var = (oe0) view;
        pe0 pe0Var2 = (pe0) arrayList2.get(i7 - 1);
        ArrayList arrayList3 = pe0Var2.f36899b;
        byte[] bArr = pe0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ne0) qe0Var.f37284v1.get(pe0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.f23266k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= ijVar.f23266k.translatedPoll.f21776b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.f23266k.translatedPoll.f21776b.get(i12);
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
                oe0Var.a(str2, arrayList, qe0Var.K0(bArr), pe0Var2.f36898a, pe0Var2.a(), false);
                oe0Var.setTag(2131296585, pe0Var2);
                return;
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        qe0 qe0Var = this.f35948s;
        View view = qe0Var.f37286x1;
        Context context = this.f35947r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context, true);
                    m8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, m8Var2, qe0Var.I0);
                    m8Var2.g(org.telegram.ui.ActionBar.m6.N6, org.telegram.ui.ActionBar.m6.f28130q6);
                    m8Var = m8Var2;
                } else {
                    View le0Var = new le0(this, context);
                    le0Var.setTag(-33024);
                    m8Var = le0Var;
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
            m8Var = new PollVotesAlert$UserCell(qe0Var, context);
        }
        return new v4.d1(m8Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9;
        TLRPC.Chat chat;
        boolean z10;
        if (d1Var.f57056f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.f57052a;
            qe0 qe0Var = this.f35948s;
            pe0 pe0Var = (pe0) qe0Var.f37285w1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) pe0Var.f36899b.get(Q);
            TLObject e22 = org.telegram.messenger.qp.s1(qe0Var.f28669a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z11 = true;
            if (Q == pe0Var.b() - 1 && TextUtils.isEmpty(pe0Var.f36900c) && !pe0Var.f36901e) {
                z9 = false;
            } else {
                z9 = true;
            }
            k9 k9Var = pollVotesAlert$UserCell.f31453a;
            org.telegram.ui.ActionBar.m5 m5Var = pollVotesAlert$UserCell.f31454b;
            if (e22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) e22;
                pollVotesAlert$UserCell.f31458n = null;
            } else if (e22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f31458n = (TLRPC.Chat) e22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f31458n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.id.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.f31455c.setText(org.telegram.messenger.id.r(j3, true));
            pollVotesAlert$UserCell.f31460s = z9;
            if (e22 != null) {
                z11 = false;
            }
            pollVotesAlert$UserCell.f31462x = z11;
            pollVotesAlert$UserCell.f31461w = Q;
            if (e22 == null) {
                m5Var.l("", false);
                k9Var.setImageDrawable(null);
            } else {
                v8 v8Var = pollVotesAlert$UserCell.f31456e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f31458n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    v8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f31458n;
                    if (chat2 != null) {
                        v8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.t10.p(user2);
                    pollVotesAlert$UserCell.f31459r = p10;
                    z10 = false;
                    pollVotesAlert$UserCell.f31459r = org.telegram.messenger.i6.m(p10, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f31458n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f31459r = str;
                        pollVotesAlert$UserCell.f31459r = org.telegram.messenger.i6.m(str, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f31459r = "";
                    }
                }
                m5Var.l(pollVotesAlert$UserCell.f31459r, z10);
                ou0 ou0Var = pollVotesAlert$UserCell.f31457f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f31458n;
                int i10 = org.telegram.ui.ActionBar.m6.z9;
                qe0 qe0Var2 = pollVotesAlert$UserCell.E;
                org.telegram.ui.Cells.o8 o8Var = qe0.L1;
                m5Var.i(ou0Var.b(user3, chat4, org.telegram.ui.ActionBar.m6.w0(i10, qe0Var2.I0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f31458n;
                if (chat5 != null) {
                    k9Var.e(chat5, v8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        k9Var.e(user4, v8Var);
                    } else {
                        k9Var.setImageDrawable(v8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.D;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(k9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(m5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qe0.L1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f31462x) {
                pollVotesAlert$UserCell.f31463y = 0.0f;
            }
        }
    }
}
