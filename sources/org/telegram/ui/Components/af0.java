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
public final class af0 extends zj0 {
    public final Context f33471r;
    public final ef0 f33472s;

    public af0(ef0 ef0Var, Context context) {
        this.f33472s = ef0Var;
        this.f33471r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        df0 df0Var = (df0) this.f33472s.f34712x1.get(i7 - 1);
        int b10 = df0Var.b() + 1;
        if (TextUtils.isEmpty(df0Var.f34319c) && !df0Var.f34320e) {
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
            ef0 ef0Var = this.f33472s;
            if (i12 < ef0Var.f34712x1.size() && (i11 = i10 - 1) < ((df0) ef0Var.f34712x1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.MessagePeerVote) ((df0) ef0Var.f34712x1.get(i12)).f34318b.get(i11)).peer))));
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
        if (i10 - 1 < ((df0) this.f33472s.f34712x1.get(i7 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f33472s.f34712x1.size() + 1;
    }

    @Override
    public final View T(int i7, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        ef0 ef0Var = this.f33472s;
        TLRPC.Poll poll = ef0Var.f34708t1;
        org.telegram.messenger.fj fjVar = ef0Var.f34707s1;
        if (view == null) {
            view = new ze0(this, this.f33471r);
        }
        cf0 cf0Var = (cf0) view;
        if (i7 == 0) {
            cf0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        df0 df0Var = (df0) ef0Var.f34712x1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, df0Var.d) && ((bf0) ef0Var.f34711w1.get(df0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (fjVar != null && fjVar.L2 && (message = fjVar.f24073k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= fjVar.f24073k.translatedPoll.f27410b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.f24073k.translatedPoll.f27410b.get(i10);
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
                cf0Var.a(str2, arrayList, ef0Var.L0(df0Var.d), df0Var.f34317a, df0Var.a(), false);
                cf0Var.setTag(2131296587, df0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 != 0 && i10 != 0) {
            ArrayList arrayList = this.f33472s.A1;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        ef0 ef0Var = this.f33472s;
        TLRPC.Poll poll = ef0Var.f34708t1;
        ArrayList arrayList2 = ef0Var.f34712x1;
        org.telegram.messenger.fj fjVar = ef0Var.f34707s1;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                df0 df0Var = (df0) arrayList2.get(i7 - 1);
                ((org.telegram.ui.Cells.m8) view).o(2131230871, org.telegram.messenger.gd.G(df0Var.f34317a - df0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        cf0 cf0Var = (cf0) view;
        df0 df0Var2 = (df0) arrayList2.get(i7 - 1);
        ArrayList arrayList3 = df0Var2.f34318b;
        byte[] bArr = df0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((bf0) ef0Var.f34711w1.get(df0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (fjVar != null && fjVar.L2 && (message = fjVar.f24073k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= fjVar.f24073k.translatedPoll.f27410b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.f24073k.translatedPoll.f27410b.get(i12);
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
                cf0Var.a(str2, arrayList, ef0Var.L0(bArr), df0Var2.f34317a, df0Var2.a(), false);
                cf0Var.setTag(2131296587, df0Var2);
                return;
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        ef0 ef0Var = this.f33472s;
        View view = ef0Var.f34713y1;
        Context context = this.f33471r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context, true);
                    m8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, m8Var2, ef0Var.J0);
                    m8Var2.g(org.telegram.ui.ActionBar.n6.N6, org.telegram.ui.ActionBar.n6.f29691q6);
                    m8Var = m8Var2;
                } else {
                    View ze0Var = new ze0(this, context);
                    ze0Var.setTag(-33024);
                    m8Var = ze0Var;
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
            m8Var = new PollVotesAlert$UserCell(ef0Var, context);
        }
        return new v4.f1(m8Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        if (f1Var.f59249f == 0) {
            int b10 = f1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) f1Var.f59245a;
            ef0 ef0Var = this.f33472s;
            df0 df0Var = (df0) ef0Var.f34712x1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) df0Var.f34318b.get(Q);
            TLObject g22 = org.telegram.messenger.mp.u1(ef0Var.f30223a).g2(org.telegram.messenger.n5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == df0Var.b() - 1 && TextUtils.isEmpty(df0Var.f34319c) && !df0Var.f34320e) {
                z10 = false;
            } else {
                z10 = true;
            }
            p9 p9Var = pollVotesAlert$UserCell.f33112a;
            org.telegram.ui.ActionBar.n5 n5Var = pollVotesAlert$UserCell.f33113b;
            if (g22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) g22;
                pollVotesAlert$UserCell.f33117n = null;
            } else if (g22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f33117n = (TLRPC.Chat) g22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f33117n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.gd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.f33114c.setText(org.telegram.messenger.gd.r(j3, true));
            pollVotesAlert$UserCell.f33119s = z10;
            if (g22 != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f33121x = z12;
            pollVotesAlert$UserCell.f33120w = Q;
            if (g22 == null) {
                n5Var.l("", false);
                p9Var.setImageDrawable(null);
            } else {
                a9 a9Var = pollVotesAlert$UserCell.f33115e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f33117n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    a9Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f33117n;
                    if (chat2 != null) {
                        a9Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String q10 = org.telegram.messenger.n10.q(user2);
                    pollVotesAlert$UserCell.f33118r = q10;
                    z11 = false;
                    pollVotesAlert$UserCell.f33118r = org.telegram.messenger.j6.m(q10, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f33117n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f33118r = str;
                        pollVotesAlert$UserCell.f33118r = org.telegram.messenger.j6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f33118r = "";
                    }
                }
                n5Var.l(pollVotesAlert$UserCell.f33118r, z11);
                zu0 zu0Var = pollVotesAlert$UserCell.f33116f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f33117n;
                int i10 = org.telegram.ui.ActionBar.n6.f29865z9;
                ef0 ef0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.o8 o8Var = ef0.M1;
                n5Var.i(zu0Var.b(user3, chat4, org.telegram.ui.ActionBar.n6.w0(i10, ef0Var2.J0), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f33117n;
                if (chat5 != null) {
                    p9Var.f(chat5, a9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        p9Var.f(user4, a9Var);
                    } else {
                        p9Var.setImageDrawable(a9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(p9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(n5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ef0.M1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f33121x) {
                pollVotesAlert$UserCell.f33122y = 0.0f;
            }
        }
    }
}
