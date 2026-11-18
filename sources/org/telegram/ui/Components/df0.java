package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class df0 extends org.telegram.ui.ActionBar.x2 {
    public static final org.telegram.ui.Cells.o8 M1 = new org.telegram.ui.Cells.o8("placeholderAlpha", 9);
    public final ArrayList A1;
    public final Paint B1;
    public LinearGradient C1;
    public Matrix D1;
    public float E1;
    public float F1;
    public boolean G1;
    public final RectF H1;
    public final TLRPC.TL_messageMediaPoll I1;
    public boolean J1;
    public int K1;
    public int L1;
    public final xe0 f34420m1;
    public final ze0 n1;
    public final Drawable f34421o1;
    public final View f34422p1;
    public final v7 f34423q1;
    public AnimatorSet f34424r1;
    public final org.telegram.messenger.fj f34425s1;
    public final TLRPC.Poll f34426t1;
    public final TLRPC.InputPeer f34427u1;
    public final HashSet f34428v1;
    public final HashMap f34429w1;
    public final ArrayList f34430x1;
    public final w5 f34431y1;
    public int f34432z1;

    public df0(Context context, int i7, org.telegram.messenger.fj fjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.w00 w00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11;
        int i12 = 1;
        this.f34428v1 = new HashSet();
        this.f34429w1 = new HashMap();
        this.f34430x1 = new ArrayList();
        this.A1 = new ArrayList();
        this.B1 = new Paint(1);
        this.G1 = true;
        this.H1 = new RectF();
        this.f30189a = i7;
        this.f30231x = true;
        O();
        this.f34425s1 = fjVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) fjVar.f23968k.media;
        this.I1 = tL_messageMediaPoll;
        this.f34426t1 = tL_messageMediaPoll.poll;
        this.f34427u1 = org.telegram.messenger.mp.u1(this.f30189a).l1(org.telegram.messenger.fj.B0(fjVar.f23968k));
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
            if (pollAnswerVoters.voters == 0) {
                i10 = i12;
            } else {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i14 = pollAnswerVoters.voters;
                i14 = i14 > 15 ? 10 : i14;
                int i15 = 0;
                while (i15 < i14) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                    i15++;
                    i12 = i12;
                }
                i10 = i12;
                int i16 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i14 < i16 ? "empty" : null;
                tL_messages_votesList.count = i16;
                this.f34430x1.add(new cf0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f34427u1;
                tL_messages_getPollVotes.f28504id = this.f34425s1.e1();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.f30189a).sendRequest(tL_messages_getPollVotes, new bg.l0(this, numArr, i13, arrayList, pollAnswerVoters, 7)));
                numArr[i13] = valueOf;
                this.A1.add(valueOf);
            }
            i13++;
            i12 = i10;
        }
        M0();
        Collections.sort(this.f34430x1, new we0(this));
        N0();
        Drawable mutate = context.getResources().getDrawable(2131232730).mutate();
        this.f34421o1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29487i5, false), PorterDuff.Mode.MULTIPLY));
        hi.q3 q3Var = new hi.q3(this, context);
        this.f30192b = q3Var;
        q3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30192b;
        int i17 = this.f30227u0;
        viewGroup.setPadding(i17, 0, i17, 0);
        xe0 xe0Var = new xe0(this, context);
        this.f34420m1 = xe0Var;
        xe0Var.setSections(false);
        v4.k kVar = new v4.k();
        kVar.f59195c = 150L;
        kVar.f59196e = 350L;
        kVar.f59197f = 0L;
        kVar.f59198g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f59199i = new OvershootInterpolator(1.1f);
        kVar.f59169o = lr.h;
        xe0Var.setItemAnimator(kVar);
        xe0Var.setClipToPadding(false);
        getContext();
        xe0Var.setLayoutManager(new jg.b0(i12, false, 9));
        xe0Var.setHorizontalScrollBarEnabled(false);
        xe0Var.setVerticalScrollBarEnabled(false);
        xe0Var.setSectionsType(2);
        this.f30192b.addView(xe0Var, c8.ma.e(-1, -1, 51));
        ze0 ze0Var = new ze0(this, context);
        this.n1 = ze0Var;
        xe0Var.setAdapter(ze0Var);
        org.telegram.ui.ActionBar.u6.l(xe0Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        xe0Var.setOnItemClickListener(new fi.g4(13, this, context));
        xe0Var.setOnScrollListener(new oa(this, 14));
        w5 w5Var = new w5(context);
        this.f34431y1 = w5Var;
        w5Var.setTextSize(1, 18.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.u6.U(w5Var, i18, null);
        w5Var.setTag(-33024);
        w5Var.setLayoutParams(new v4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f34426t1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.fj fjVar2 = this.f34425s1;
            if (fjVar2 != null && fjVar2.L2 && (message = fjVar2.f23968k) != null && (w00Var = message.translatedPoll) != null && (tL_textWithEntities = w00Var.f27627a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.ks.i(w5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ri.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.fj.B5(m10, tL_textWithEntities2.entities, w5Var.getPaint().getFontMetricsInt(), false);
            w5Var.setText(m10);
        }
        v7 v7Var = new v7(2, context, this);
        this.f34423q1 = v7Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, v7Var, null);
        v7Var.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.u6.l(v7Var, 1, i18, null);
        org.telegram.ui.ActionBar.u6.l(v7Var, 3, org.telegram.ui.ActionBar.n6.I5, null);
        org.telegram.ui.ActionBar.u6.l(v7Var, 5, i18, null);
        org.telegram.ui.ActionBar.u6.l(v7Var, 6, org.telegram.ui.ActionBar.n6.Gj, null);
        v7Var.setOccupyStatusBar(false);
        v7Var.setAlpha(0.0f);
        v7Var.setTitle(org.telegram.messenger.gd.M0(2131746968, null));
        if (this.f34426t1.quiz) {
            v7Var.setSubtitle(org.telegram.messenger.gd.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            v7Var.setSubtitle(org.telegram.messenger.gd.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.f30192b.addView(v7Var, c8.ma.c(-2.0f, -1));
        v7Var.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 19));
        View view = new View(context);
        this.f34422p1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, null);
        this.f30192b.addView(view, c8.ma.c(1.0f, -1));
    }

    public static void J0(df0 df0Var) {
        boolean z10;
        Integer num;
        float f10;
        v7 v7Var = df0Var.f34423q1;
        xe0 xe0Var = df0Var.f34420m1;
        if (xe0Var.getChildCount() <= 0) {
            int paddingTop = xe0Var.getPaddingTop();
            df0Var.f34432z1 = paddingTop;
            xe0Var.setTopGlowOffset(paddingTop);
            df0Var.f30192b.invalidate();
            return;
        }
        View childAt = xe0Var.getChildAt(0);
        kj0 kj0Var = (kj0) xe0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || kj0Var == null || kj0Var.b() != 0) {
            top = L;
        }
        if (top <= org.telegram.messenger.g0.L(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && v7Var.getTag() == null) || (!z10 && v7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            v7Var.setTag(num);
            AnimatorSet animatorSet = df0Var.f34424r1;
            if (animatorSet != null) {
                animatorSet.cancel();
                df0Var.f34424r1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            df0Var.f34424r1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = df0Var.f34424r1;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v7Var, property, f10);
            View view = df0Var.f34422p1;
            if (z10) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            df0Var.f34424r1.addListener(new q60(df0Var, 9));
            df0Var.f34424r1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xe0Var.getLayoutParams();
        int i7 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams.topMargin, top);
        if (df0Var.f34432z1 != i7) {
            df0Var.f34432z1 = i7;
            xe0Var.setTopGlowOffset(i7 - layoutParams.topMargin);
            df0Var.f30192b.invalidate();
        }
    }

    @Override
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29416e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29435f7));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void K0(View view) {
        xe0 xe0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            xe0Var = this.f34420m1;
            int i10 = 0;
            if (i7 >= xe0Var.getChildCount()) {
                break;
            }
            if (i7 == -2) {
                childAt = view;
            } else if (i7 == -1) {
                childAt = xe0Var.getPinnedHeader();
            } else {
                childAt = xe0Var.getChildAt(i7);
            }
            if ((childAt instanceof bf0) && (childAt.getTag(2131296585) instanceof cf0)) {
                bf0 bf0Var = (bf0) childAt;
                cf0 cf0Var = (cf0) childAt.getTag(2131296585);
                TLRPC.Poll poll = this.f34426t1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (Arrays.equals(pollAnswer.option, cf0Var.d) && ((af0) this.f34429w1.get(cf0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.fj fjVar = this.f34425s1;
                            if (fjVar != null && fjVar.L2 && (message = fjVar.f23968k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i10 >= fjVar.f23968k.translatedPoll.f27628b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.f23968k.translatedPoll.f27628b.get(i10);
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
                            bf0Var.a(str2, arrayList, L0(cf0Var.d), cf0Var.f33986a, cf0Var.a(), true);
                            bf0Var.setTag(2131296585, cf0Var);
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = xe0Var.f34077q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(xe0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(xe0Var.getMeasuredHeight(), 0));
            View view3 = xe0Var.f34077q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), xe0Var.f34077q1.getMeasuredHeight());
            xe0Var.invalidate();
        }
        xe0Var.invalidate();
    }

    @Override
    public final void L() {
        ArrayList arrayList = this.A1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConnectionsManager.getInstance(this.f30189a).cancelRequest(((Integer) arrayList.get(i7)).intValue(), true);
        }
        super.L();
    }

    public final int L0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f34430x1;
            if (i7 >= arrayList.size()) {
                break;
            }
            cf0 cf0Var = (cf0) arrayList.get(i7);
            if (cf0Var != null) {
                i10 += cf0Var.f33986a;
                if (Arrays.equals(cf0Var.d, bArr)) {
                    i11 += cf0Var.f33986a;
                }
            }
            i7++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.I1;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i10 = tL_messageMediaPoll.results.total_voters;
        }
        if (i10 <= 0) {
            return 0;
        }
        return Math.round((i11 / i10) * 100.0f);
    }

    public final void M0() {
        HashMap hashMap;
        HashMap hashMap2 = this.f34429w1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f34425s1.f23968k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f34430x1;
        int size = arrayList2.size();
        int i7 = 100;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            cf0 cf0Var = (cf0) arrayList2.get(i10);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(cf0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                    hashMap = hashMap2;
                    if (Arrays.equals(cf0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        obj.f33343a = f10 - i14;
                        if (i11 == 0) {
                            i11 = i14;
                        } else if (i14 != 0 && i11 != i14) {
                            z10 = true;
                        }
                        i7 -= i14;
                        i12 = Math.max(i14, i12);
                        i10++;
                        hashMap2 = hashMap;
                    } else {
                        i13++;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap = hashMap2;
            i10++;
            hashMap2 = hashMap;
        }
        if (z10 && i7 != 0) {
            Collections.sort(arrayList, new org.telegram.ui.pe(11));
            int min = Math.min(i7, arrayList.size());
            for (int i15 = 0; i15 < min; i15++) {
                ((af0) arrayList.get(i15)).getClass();
            }
        }
    }

    public final void N0() {
        Paint paint = this.B1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29487i5, false);
        int w02 = org.telegram.messenger.g0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.g0.L(500.0f);
        this.F1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.C1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.D1 = matrix;
        this.C1.setLocalMatrix(matrix);
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f30192b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.zj));
        ViewGroup viewGroup = this.f30192b;
        Drawable[] drawableArr = {this.f34421o1};
        int i7 = org.telegram.ui.ActionBar.n6.f29469h5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f34423q1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29504j5));
        xe0 xe0Var = this.f34420m1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, w6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.f29487i5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29636q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        return arrayList;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29487i5, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false);
            if (this.J1 && x02 == this.K1 && x03 == this.L1) {
                return;
            }
            this.J1 = true;
            this.K1 = x02;
            this.L1 = x03;
            Drawable drawable = this.f34421o1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            N0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
