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
public final class pf0 extends ok0 {
    public final Context f29353r;
    public final tf0 f29354s;

    public pf0(tf0 tf0Var, Context context) {
        this.f29354s = tf0Var;
        this.f29353r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        sf0 sf0Var = (sf0) this.f29354s.f30563t1.get(i10 - 1);
        int b10 = sf0Var.b() + 1;
        if (TextUtils.isEmpty(sf0Var.f30235c) && !sf0Var.e) {
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
            tf0 tf0Var = this.f29354s;
            if (i13 < tf0Var.f30563t1.size() && (i12 = i11 - 1) < ((sf0) tf0Var.f30563t1.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.o5.o(((TLRPC.MessagePeerVote) ((sf0) tf0Var.f30563t1.get(i13)).f30234b.get(i12)).peer))));
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
        if (i11 - 1 < ((sf0) this.f29354s.f30563t1.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f29354s.f30563t1.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        tf0 tf0Var = this.f29354s;
        TLRPC.Poll poll = tf0Var.f30559p1;
        org.telegram.messenger.jj jjVar = tf0Var.f30558o1;
        if (view == null) {
            view = new of0(this, this.f29353r);
        }
        rf0 rf0Var = (rf0) view;
        if (i10 == 0) {
            rf0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        sf0 sf0Var = (sf0) tf0Var.f30563t1.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, sf0Var.d) && ((qf0) tf0Var.f30562s1.get(sf0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (jjVar != null && jjVar.J2 && (message = jjVar.f16337k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i11 >= jjVar.f16337k.translatedPoll.f17547b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) jjVar.f16337k.translatedPoll.f17547b.get(i11);
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
                rf0Var.a(str2, arrayList, tf0Var.K0(sf0Var.d), sf0Var.f30233a, sf0Var.a(), false);
                rf0Var.setTag(2131296585, sf0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f29354s.f30566w1;
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
        tf0 tf0Var = this.f29354s;
        TLRPC.Poll poll = tf0Var.f30559p1;
        ArrayList arrayList2 = tf0Var.f30563t1;
        org.telegram.messenger.jj jjVar = tf0Var.f30558o1;
        int i12 = c1Var.f47901f;
        View view = c1Var.f47898a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                sf0 sf0Var = (sf0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.p8) view).o(2131230871, org.telegram.messenger.cd.G(sf0Var.f30233a - sf0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        rf0 rf0Var = (rf0) view;
        sf0 sf0Var2 = (sf0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = sf0Var2.f30234b;
        byte[] bArr = sf0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((qf0) tf0Var.f30562s1.get(sf0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (jjVar != null && jjVar.J2 && (message = jjVar.f16337k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i13 >= jjVar.f16337k.translatedPoll.f17547b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) jjVar.f16337k.translatedPoll.f17547b.get(i13);
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
                rf0Var.a(str2, arrayList, tf0Var.K0(bArr), sf0Var2.f30233a, sf0Var2.a(), false);
                rf0Var.setTag(2131296585, sf0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        tf0 tf0Var = this.f29354s;
        View view = tf0Var.f30564u1;
        Context context = this.f29353r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(23, context, true);
                    p8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, p8Var2, tf0Var.I0);
                    p8Var2.g(org.telegram.ui.ActionBar.t6.N6, org.telegram.ui.ActionBar.t6.q6);
                    p8Var = p8Var2;
                } else {
                    View of0Var = new of0(this, context);
                    of0Var.setTag(-33024);
                    p8Var = of0Var;
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
            p8Var = new PollVotesAlert$UserCell(tf0Var, context);
        }
        return new s4.c1(p8Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        if (c1Var.f47901f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.f47898a;
            tf0 tf0Var = this.f29354s;
            sf0 sf0Var = (sf0) tf0Var.f30563t1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) sf0Var.f30234b.get(Q);
            TLObject d22 = org.telegram.messenger.vp.r1(tf0Var.f21583a).d2(org.telegram.messenger.o5.o(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == sf0Var.b() - 1 && TextUtils.isEmpty(sf0Var.f30235c) && !sf0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            g9 g9Var = pollVotesAlert$UserCell.f24086a;
            org.telegram.ui.ActionBar.u5 u5Var = pollVotesAlert$UserCell.f24087b;
            if (d22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) d22;
                pollVotesAlert$UserCell.f24090n = null;
            } else if (d22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24090n = (TLRPC.Chat) d22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24090n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.cd.D0().o0().format(j10 * 1000));
            pollVotesAlert$UserCell.f24088c.setText(org.telegram.messenger.cd.r(j10, true));
            pollVotesAlert$UserCell.f24092s = z10;
            if (d22 != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f24094x = z12;
            pollVotesAlert$UserCell.f24093w = Q;
            if (d22 == null) {
                u5Var.l("", false);
                g9Var.setImageDrawable(null);
            } else {
                r8 r8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24090n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    r8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24090n;
                    if (chat2 != null) {
                        r8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p5 = org.telegram.messenger.h20.p(user2);
                    pollVotesAlert$UserCell.f24091r = p5;
                    z11 = false;
                    pollVotesAlert$UserCell.f24091r = org.telegram.messenger.k6.m(p5, u5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24090n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24091r = str;
                        pollVotesAlert$UserCell.f24091r = org.telegram.messenger.k6.m(str, u5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f24091r = "";
                    }
                }
                u5Var.l(pollVotesAlert$UserCell.f24091r, z11);
                pv0 pv0Var = pollVotesAlert$UserCell.f24089f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24090n;
                int i11 = org.telegram.ui.ActionBar.t6.f21333z9;
                tf0 tf0Var2 = pollVotesAlert$UserCell.E;
                mh.g gVar = tf0.I1;
                u5Var.i(pv0Var.b(user3, chat4, org.telegram.ui.ActionBar.t6.w0(i11, tf0Var2.I0), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24090n;
                if (chat5 != null) {
                    g9Var.e(chat5, r8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        g9Var.e(user4, r8Var);
                    } else {
                        g9Var.setImageDrawable(r8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.D;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(g9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(u5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, tf0.I1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24094x) {
                pollVotesAlert$UserCell.f24095y = 0.0f;
            }
        }
    }
}
