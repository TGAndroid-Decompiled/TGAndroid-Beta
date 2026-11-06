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
    public final Context f35994r;
    public final qe0 f35995s;

    public me0(qe0 qe0Var, Context context) {
        this.f35995s = qe0Var;
        this.f35994r = context;
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
        pe0 pe0Var = (pe0) this.f35995s.f37393t1.get(i7 - 1);
        int b10 = pe0Var.b() + 1;
        if (TextUtils.isEmpty(pe0Var.f36992c) && !pe0Var.f36993e) {
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
            qe0 qe0Var = this.f35995s;
            if (i12 < qe0Var.f37393t1.size() && (i11 = i10 - 1) < ((pe0) qe0Var.f37393t1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((pe0) qe0Var.f37393t1.get(i12)).f36991b.get(i11)).peer))));
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
        if (i10 - 1 < ((pe0) this.f35995s.f37393t1.get(i7 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f35995s.f37393t1.size() + 1;
    }

    @Override
    public final View T(int i7, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        qe0 qe0Var = this.f35995s;
        TLRPC.Poll poll = qe0Var.f37389p1;
        org.telegram.messenger.ij ijVar = qe0Var.f37388o1;
        if (view == null) {
            view = new le0(this, this.f35994r);
        }
        oe0 oe0Var = (oe0) view;
        if (i7 == 0) {
            oe0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        pe0 pe0Var = (pe0) qe0Var.f37393t1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, pe0Var.d) && ((ne0) qe0Var.f37392s1.get(pe0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.f23237k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= ijVar.f23237k.translatedPoll.f21729b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.f23237k.translatedPoll.f21729b.get(i10);
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
                oe0Var.a(str2, arrayList, qe0Var.K0(pe0Var.d), pe0Var.f36990a, pe0Var.a(), false);
                oe0Var.setTag(2131296585, pe0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 != 0 && i10 != 0) {
            ArrayList arrayList = this.f35995s.f37396w1;
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
        qe0 qe0Var = this.f35995s;
        TLRPC.Poll poll = qe0Var.f37389p1;
        ArrayList arrayList2 = qe0Var.f37393t1;
        org.telegram.messenger.ij ijVar = qe0Var.f37388o1;
        int i11 = d1Var.f56931f;
        View view = d1Var.f56927a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                pe0 pe0Var = (pe0) arrayList2.get(i7 - 1);
                ((org.telegram.ui.Cells.m8) view).o(2131230871, org.telegram.messenger.hd.G(pe0Var.f36990a - pe0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        oe0 oe0Var = (oe0) view;
        pe0 pe0Var2 = (pe0) arrayList2.get(i7 - 1);
        ArrayList arrayList3 = pe0Var2.f36991b;
        byte[] bArr = pe0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ne0) qe0Var.f37392s1.get(pe0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.f23237k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= ijVar.f23237k.translatedPoll.f21729b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.f23237k.translatedPoll.f21729b.get(i12);
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
                oe0Var.a(str2, arrayList, qe0Var.K0(bArr), pe0Var2.f36990a, pe0Var2.a(), false);
                oe0Var.setTag(2131296585, pe0Var2);
                return;
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        qe0 qe0Var = this.f35995s;
        View view = qe0Var.f37394u1;
        Context context = this.f35994r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context, true);
                    m8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, m8Var2, qe0Var.I0);
                    m8Var2.g(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.f28088q6);
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
        if (d1Var.f56931f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.f56927a;
            qe0 qe0Var = this.f35995s;
            pe0 pe0Var = (pe0) qe0Var.f37393t1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) pe0Var.f36991b.get(Q);
            TLObject e22 = org.telegram.messenger.qp.s1(qe0Var.f28612a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z11 = true;
            if (Q == pe0Var.b() - 1 && TextUtils.isEmpty(pe0Var.f36992c) && !pe0Var.f36993e) {
                z9 = false;
            } else {
                z9 = true;
            }
            l9 l9Var = pollVotesAlert$UserCell.f31432a;
            org.telegram.ui.ActionBar.k5 k5Var = pollVotesAlert$UserCell.f31433b;
            if (e22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) e22;
                pollVotesAlert$UserCell.f31437n = null;
            } else if (e22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f31437n = (TLRPC.Chat) e22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f31437n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.hd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.f31434c.setText(org.telegram.messenger.hd.r(j3, true));
            pollVotesAlert$UserCell.f31439s = z9;
            if (e22 != null) {
                z11 = false;
            }
            pollVotesAlert$UserCell.f31441x = z11;
            pollVotesAlert$UserCell.f31440w = Q;
            if (e22 == null) {
                k5Var.l("", false);
                l9Var.setImageDrawable(null);
            } else {
                w8 w8Var = pollVotesAlert$UserCell.f31435e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f31437n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    w8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f31437n;
                    if (chat2 != null) {
                        w8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.t10.p(user2);
                    pollVotesAlert$UserCell.f31438r = p10;
                    z10 = false;
                    pollVotesAlert$UserCell.f31438r = org.telegram.messenger.i6.m(p10, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f31437n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f31438r = str;
                        pollVotesAlert$UserCell.f31438r = org.telegram.messenger.i6.m(str, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f31438r = "";
                    }
                }
                k5Var.l(pollVotesAlert$UserCell.f31438r, z10);
                nu0 nu0Var = pollVotesAlert$UserCell.f31436f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f31437n;
                int i10 = org.telegram.ui.ActionBar.k6.z9;
                qe0 qe0Var2 = pollVotesAlert$UserCell.E;
                org.telegram.ui.Cells.o8 o8Var = qe0.I1;
                k5Var.i(nu0Var.b(user3, chat4, org.telegram.ui.ActionBar.k6.w0(i10, qe0Var2.I0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f31437n;
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
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qe0.I1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f31441x) {
                pollVotesAlert$UserCell.f31442y = 0.0f;
            }
        }
    }
}
