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
public final class ze0 extends xj0 {
    public final Context f42880r;
    public final df0 f42881s;

    public ze0(df0 df0Var, Context context) {
        this.f42881s = df0Var;
        this.f42880r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        cf0 cf0Var = (cf0) this.f42881s.f34430x1.get(i7 - 1);
        int b10 = cf0Var.b() + 1;
        if (TextUtils.isEmpty(cf0Var.f33988c) && !cf0Var.f33989e) {
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
            df0 df0Var = this.f42881s;
            if (i12 < df0Var.f34430x1.size() && (i11 = i10 - 1) < ((cf0) df0Var.f34430x1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.MessagePeerVote) ((cf0) df0Var.f34430x1.get(i12)).f33987b.get(i11)).peer))));
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
        if (i10 - 1 < ((cf0) this.f42881s.f34430x1.get(i7 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f42881s.f34430x1.size() + 1;
    }

    @Override
    public final View T(int i7, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        df0 df0Var = this.f42881s;
        TLRPC.Poll poll = df0Var.f34426t1;
        org.telegram.messenger.fj fjVar = df0Var.f34425s1;
        if (view == null) {
            view = new ye0(this, this.f42880r);
        }
        bf0 bf0Var = (bf0) view;
        if (i7 == 0) {
            bf0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        cf0 cf0Var = (cf0) df0Var.f34430x1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, cf0Var.d) && ((af0) df0Var.f34429w1.get(cf0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (fjVar != null && fjVar.L2 && (message = fjVar.f23965k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= fjVar.f23965k.translatedPoll.f27626b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.f23965k.translatedPoll.f27626b.get(i10);
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
                bf0Var.a(str2, arrayList, df0Var.L0(cf0Var.d), cf0Var.f33986a, cf0Var.a(), false);
                bf0Var.setTag(2131296585, cf0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 != 0 && i10 != 0) {
            ArrayList arrayList = this.f42881s.A1;
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
        df0 df0Var = this.f42881s;
        TLRPC.Poll poll = df0Var.f34426t1;
        ArrayList arrayList2 = df0Var.f34430x1;
        org.telegram.messenger.fj fjVar = df0Var.f34425s1;
        int i11 = f1Var.f59127f;
        View view = f1Var.f59123a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                cf0 cf0Var = (cf0) arrayList2.get(i7 - 1);
                ((org.telegram.ui.Cells.n8) view).o(2131230871, org.telegram.messenger.gd.G(cf0Var.f33986a - cf0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        bf0 bf0Var = (bf0) view;
        cf0 cf0Var2 = (cf0) arrayList2.get(i7 - 1);
        ArrayList arrayList3 = cf0Var2.f33987b;
        byte[] bArr = cf0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((af0) df0Var.f34429w1.get(cf0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (fjVar != null && fjVar.L2 && (message = fjVar.f23965k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= fjVar.f23965k.translatedPoll.f27626b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.f23965k.translatedPoll.f27626b.get(i12);
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
                bf0Var.a(str2, arrayList, df0Var.L0(bArr), cf0Var2.f33986a, cf0Var2.a(), false);
                bf0Var.setTag(2131296585, cf0Var2);
                return;
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        df0 df0Var = this.f42881s;
        View view = df0Var.f34431y1;
        Context context = this.f42880r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(23, context, true);
                    n8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29467h5, n8Var2, df0Var.J0);
                    n8Var2.g(org.telegram.ui.ActionBar.n6.N6, org.telegram.ui.ActionBar.n6.f29634q6);
                    n8Var = n8Var2;
                } else {
                    View ye0Var = new ye0(this, context);
                    ye0Var.setTag(-33024);
                    n8Var = ye0Var;
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
            n8Var = new PollVotesAlert$UserCell(df0Var, context);
        }
        return new v4.f1(n8Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        if (f1Var.f59127f == 0) {
            int b10 = f1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) f1Var.f59123a;
            df0 df0Var = this.f42881s;
            cf0 cf0Var = (cf0) df0Var.f34430x1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) cf0Var.f33987b.get(Q);
            TLObject g22 = org.telegram.messenger.mp.u1(df0Var.f30187a).g2(org.telegram.messenger.n5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == cf0Var.b() - 1 && TextUtils.isEmpty(cf0Var.f33988c) && !cf0Var.f33989e) {
                z10 = false;
            } else {
                z10 = true;
            }
            q9 q9Var = pollVotesAlert$UserCell.f33012a;
            org.telegram.ui.ActionBar.n5 n5Var = pollVotesAlert$UserCell.f33013b;
            if (g22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) g22;
                pollVotesAlert$UserCell.f33017n = null;
            } else if (g22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f33017n = (TLRPC.Chat) g22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f33017n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.gd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.f33014c.setText(org.telegram.messenger.gd.r(j3, true));
            pollVotesAlert$UserCell.f33019s = z10;
            if (g22 != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f33021x = z12;
            pollVotesAlert$UserCell.f33020w = Q;
            if (g22 == null) {
                n5Var.l("", false);
                q9Var.setImageDrawable(null);
            } else {
                b9 b9Var = pollVotesAlert$UserCell.f33015e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f33017n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    b9Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f33017n;
                    if (chat2 != null) {
                        b9Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String q10 = org.telegram.messenger.o10.q(user2);
                    pollVotesAlert$UserCell.f33018r = q10;
                    z11 = false;
                    pollVotesAlert$UserCell.f33018r = org.telegram.messenger.j6.m(q10, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f33017n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f33018r = str;
                        pollVotesAlert$UserCell.f33018r = org.telegram.messenger.j6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f33018r = "";
                    }
                }
                n5Var.l(pollVotesAlert$UserCell.f33018r, z11);
                xu0 xu0Var = pollVotesAlert$UserCell.f33016f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f33017n;
                int i10 = org.telegram.ui.ActionBar.n6.f29808z9;
                df0 df0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.p8 p8Var = df0.M1;
                n5Var.i(xu0Var.b(user3, chat4, org.telegram.ui.ActionBar.n6.w0(i10, df0Var2.J0), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f33017n;
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
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(n5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, df0.M1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f33021x) {
                pollVotesAlert$UserCell.f33022y = 0.0f;
            }
        }
    }
}
