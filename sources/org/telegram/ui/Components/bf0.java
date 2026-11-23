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
public final class bf0 extends zj0 {
    public final Context f33841r;
    public final ff0 f33842s;

    public bf0(ff0 ff0Var, Context context) {
        this.f33842s = ff0Var;
        this.f33841r = context;
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
        ef0 ef0Var = (ef0) this.f33842s.f35228x1.get(i7 - 1);
        int b10 = ef0Var.b() + 1;
        if (TextUtils.isEmpty(ef0Var.f34783c) && !ef0Var.f34784e) {
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
            ff0 ff0Var = this.f33842s;
            if (i12 < ff0Var.f35228x1.size() && (i11 = i10 - 1) < ((ef0) ff0Var.f35228x1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.MessagePeerVote) ((ef0) ff0Var.f35228x1.get(i12)).f34782b.get(i11)).peer))));
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
        if (i10 - 1 < ((ef0) this.f33842s.f35228x1.get(i7 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f33842s.f35228x1.size() + 1;
    }

    @Override
    public final View T(int i7, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        ff0 ff0Var = this.f33842s;
        TLRPC.Poll poll = ff0Var.f35224t1;
        org.telegram.messenger.gj gjVar = ff0Var.f35223s1;
        if (view == null) {
            view = new af0(this, this.f33841r);
        }
        df0 df0Var = (df0) view;
        if (i7 == 0) {
            df0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ef0 ef0Var = (ef0) ff0Var.f35228x1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, ef0Var.d) && ((cf0) ff0Var.f35227w1.get(ef0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (gjVar != null && gjVar.L2 && (message = gjVar.f24213k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= gjVar.f24213k.translatedPoll.f27834b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) gjVar.f24213k.translatedPoll.f27834b.get(i10);
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
                df0Var.a(str2, arrayList, ff0Var.L0(ef0Var.d), ef0Var.f34781a, ef0Var.a(), false);
                df0Var.setTag(2131296587, ef0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 != 0 && i10 != 0) {
            ArrayList arrayList = this.f33842s.A1;
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
        ff0 ff0Var = this.f33842s;
        TLRPC.Poll poll = ff0Var.f35224t1;
        ArrayList arrayList2 = ff0Var.f35228x1;
        org.telegram.messenger.gj gjVar = ff0Var.f35223s1;
        int i11 = f1Var.f59169f;
        View view = f1Var.f59165a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                ef0 ef0Var = (ef0) arrayList2.get(i7 - 1);
                ((org.telegram.ui.Cells.n8) view).o(2131230871, org.telegram.messenger.hd.G(ef0Var.f34781a - ef0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        df0 df0Var = (df0) view;
        ef0 ef0Var2 = (ef0) arrayList2.get(i7 - 1);
        ArrayList arrayList3 = ef0Var2.f34782b;
        byte[] bArr = ef0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((cf0) ff0Var.f35227w1.get(ef0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (gjVar != null && gjVar.L2 && (message = gjVar.f24213k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= gjVar.f24213k.translatedPoll.f27834b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) gjVar.f24213k.translatedPoll.f27834b.get(i12);
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
                df0Var.a(str2, arrayList, ff0Var.L0(bArr), ef0Var2.f34781a, ef0Var2.a(), false);
                df0Var.setTag(2131296587, ef0Var2);
                return;
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        ff0 ff0Var = this.f33842s;
        View view = ff0Var.f35229y1;
        Context context = this.f33841r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(23, context, true);
                    n8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, n8Var2, ff0Var.J0);
                    n8Var2.g(org.telegram.ui.ActionBar.m6.N6, org.telegram.ui.ActionBar.m6.f29621q6);
                    n8Var = n8Var2;
                } else {
                    View af0Var = new af0(this, context);
                    af0Var.setTag(-33024);
                    n8Var = af0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                n8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    n8Var = view;
                }
            }
        } else {
            n8Var = new PollVotesAlert$UserCell(ff0Var, context);
        }
        return new v4.f1(n8Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        if (f1Var.f59169f == 0) {
            int b10 = f1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) f1Var.f59165a;
            ff0 ff0Var = this.f33842s;
            ef0 ef0Var = (ef0) ff0Var.f35228x1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ef0Var.f34782b.get(Q);
            TLObject g22 = org.telegram.messenger.np.u1(ff0Var.f30173a).g2(org.telegram.messenger.n5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == ef0Var.b() - 1 && TextUtils.isEmpty(ef0Var.f34783c) && !ef0Var.f34784e) {
                z10 = false;
            } else {
                z10 = true;
            }
            q9 q9Var = pollVotesAlert$UserCell.f33048a;
            org.telegram.ui.ActionBar.m5 m5Var = pollVotesAlert$UserCell.f33049b;
            if (g22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) g22;
                pollVotesAlert$UserCell.f33053n = null;
            } else if (g22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f33053n = (TLRPC.Chat) g22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f33053n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.hd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.f33050c.setText(org.telegram.messenger.hd.r(j3, true));
            pollVotesAlert$UserCell.f33055s = z10;
            if (g22 != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f33057x = z12;
            pollVotesAlert$UserCell.f33056w = Q;
            if (g22 == null) {
                m5Var.l("", false);
                q9Var.setImageDrawable(null);
            } else {
                b9 b9Var = pollVotesAlert$UserCell.f33051e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f33053n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    b9Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f33053n;
                    if (chat2 != null) {
                        b9Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String q10 = org.telegram.messenger.p10.q(user2);
                    pollVotesAlert$UserCell.f33054r = q10;
                    z11 = false;
                    pollVotesAlert$UserCell.f33054r = org.telegram.messenger.j6.m(q10, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f33053n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f33054r = str;
                        pollVotesAlert$UserCell.f33054r = org.telegram.messenger.j6.m(str, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f33054r = "";
                    }
                }
                m5Var.l(pollVotesAlert$UserCell.f33054r, z11);
                av0 av0Var = pollVotesAlert$UserCell.f33052f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f33053n;
                int i10 = org.telegram.ui.ActionBar.m6.f29795z9;
                ff0 ff0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.p8 p8Var = ff0.M1;
                m5Var.i(av0Var.b(user3, chat4, org.telegram.ui.ActionBar.m6.w0(i10, ff0Var2.J0), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f33053n;
                if (chat5 != null) {
                    q9Var.f(chat5, b9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        q9Var.f(user4, b9Var);
                    } else {
                        q9Var.setImageDrawable(b9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(q9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(m5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ff0.M1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f33057x) {
                pollVotesAlert$UserCell.f33058y = 0.0f;
            }
        }
    }
}
