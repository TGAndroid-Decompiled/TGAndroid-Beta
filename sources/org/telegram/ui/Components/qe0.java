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
public final class qe0 extends org.telegram.ui.ActionBar.w2 {
    public static final org.telegram.ui.Cells.o8 L1 = new org.telegram.ui.Cells.o8("placeholderAlpha", 9);
    public final Paint A1;
    public LinearGradient B1;
    public Matrix C1;
    public float D1;
    public float E1;
    public boolean F1;
    public final RectF G1;
    public final TLRPC.TL_messageMediaPoll H1;
    public boolean I1;
    public int J1;
    public int K1;
    public final ke0 l1;
    public final me0 f37276m1;
    public final Drawable n1;
    public final View f37277o1;
    public final q7 f37278p1;
    public AnimatorSet f37279q1;
    public final org.telegram.messenger.ij f37280r1;
    public final TLRPC.Poll f37281s1;
    public final TLRPC.InputPeer f37282t1;
    public final HashSet f37283u1;
    public final HashMap f37284v1;
    public final ArrayList f37285w1;
    public final p5 f37286x1;
    public int f37287y1;
    public final ArrayList f37288z1;

    public qe0(Context context, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.c10 c10Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11;
        int i12 = 1;
        this.f37283u1 = new HashSet();
        this.f37284v1 = new HashMap();
        this.f37285w1 = new ArrayList();
        this.f37288z1 = new ArrayList();
        this.A1 = new Paint(1);
        this.F1 = true;
        this.G1 = new RectF();
        this.f28669a = i7;
        this.f28710x = true;
        N();
        this.f37280r1 = ijVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ijVar.f23266k.media;
        this.H1 = tL_messageMediaPoll;
        this.f37281s1 = tL_messageMediaPoll.poll;
        this.f37282t1 = org.telegram.messenger.qp.s1(this.f28669a).j1(org.telegram.messenger.ij.B0(ijVar.f23266k));
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
                this.f37285w1.add(new pe0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f37282t1;
                tL_messages_getPollVotes.f27059id = this.f37280r1.e1();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_messages_getPollVotes, new bg.k0(this, numArr, i13, arrayList, pollAnswerVoters, 7)));
                numArr[i13] = valueOf;
                this.f37288z1.add(valueOf);
            }
            i13++;
            i12 = i10;
        }
        L0();
        Collections.sort(this.f37285w1, new je0(this));
        M0();
        Drawable mutate = context.getResources().getDrawable(2131232728).mutate();
        this.n1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27981i5, false), PorterDuff.Mode.MULTIPLY));
        fi.r3 r3Var = new fi.r3(this, context);
        this.f28672b = r3Var;
        r3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28672b;
        int i17 = this.f28705t0;
        viewGroup.setPadding(i17, 0, i17, 0);
        ke0 ke0Var = new ke0(this, context);
        this.l1 = ke0Var;
        ke0Var.setSections(false);
        v4.k kVar = new v4.k();
        kVar.f57124c = 150L;
        kVar.f57125e = 350L;
        kVar.f57126f = 0L;
        kVar.f57127g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f57128i = new OvershootInterpolator(1.1f);
        kVar.f57108o = wq.h;
        ke0Var.setItemAnimator(kVar);
        ke0Var.setClipToPadding(false);
        getContext();
        ke0Var.setLayoutManager(new jg.b0(i12, false, 9));
        ke0Var.setHorizontalScrollBarEnabled(false);
        ke0Var.setVerticalScrollBarEnabled(false);
        ke0Var.setSectionsType(2);
        this.f28672b.addView(ke0Var, c8.ha.e(-1, -1, 51));
        me0 me0Var = new me0(this, context);
        this.f37276m1 = me0Var;
        ke0Var.setAdapter(me0Var);
        org.telegram.ui.ActionBar.t6.l(ke0Var, 21, org.telegram.ui.ActionBar.m6.A5, null);
        ke0Var.setOnItemClickListener(new di.q4(13, this, context));
        ke0Var.setOnScrollListener(new ti(this, 11));
        p5 p5Var = new p5(context);
        this.f37286x1 = p5Var;
        p5Var.setTextSize(1, 18.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        p5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(p5Var, i18, null);
        p5Var.setTag(-33024);
        p5Var.setLayoutParams(new v4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f37281s1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.ij ijVar2 = this.f37280r1;
            if (ijVar2 != null && ijVar2.J2 && (message = ijVar2.f23266k) != null && (c10Var = message.translatedPoll) != null && (tL_textWithEntities = c10Var.f21775a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.qs.i(p5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, p5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.ij.B5(m10, tL_textWithEntities2.entities, p5Var.getPaint().getFontMetricsInt(), false);
            p5Var.setText(m10);
        }
        q7 q7Var = new q7(2, context, this);
        this.f37278p1 = q7Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, q7Var, null);
        q7Var.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i18, null);
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, org.telegram.ui.ActionBar.m6.I5, null);
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, i18, null);
        org.telegram.ui.ActionBar.t6.l(q7Var, 6, org.telegram.ui.ActionBar.m6.Dj, null);
        q7Var.setOccupyStatusBar(false);
        q7Var.setAlpha(0.0f);
        q7Var.setTitle(org.telegram.messenger.id.M0(2131747161, null));
        if (this.f37281s1.quiz) {
            q7Var.setSubtitle(org.telegram.messenger.id.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            q7Var.setSubtitle(org.telegram.messenger.id.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.f28672b.addView(q7Var, c8.ha.c(-2.0f, -1));
        q7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 16));
        View view = new View(context);
        this.f37277o1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.f28672b.addView(view, c8.ha.c(1.0f, -1));
    }

    public static void I0(qe0 qe0Var) {
        boolean z9;
        Integer num;
        float f10;
        q7 q7Var = qe0Var.f37278p1;
        ke0 ke0Var = qe0Var.l1;
        if (ke0Var.getChildCount() <= 0) {
            int paddingTop = ke0Var.getPaddingTop();
            qe0Var.f37287y1 = paddingTop;
            ke0Var.setTopGlowOffset(paddingTop);
            qe0Var.f28672b.invalidate();
            return;
        }
        View childAt = ke0Var.getChildAt(0);
        xi0 xi0Var = (xi0) ke0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        if (top <= org.telegram.messenger.g0.L(12.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((z9 && q7Var.getTag() == null) || (!z9 && q7Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            q7Var.setTag(num);
            AnimatorSet animatorSet = qe0Var.f37279q1;
            if (animatorSet != null) {
                animatorSet.cancel();
                qe0Var.f37279q1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            qe0Var.f37279q1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = qe0Var.f37279q1;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q7Var, property, f10);
            View view = qe0Var.f37277o1;
            if (z9) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            qe0Var.f37279q1.addListener(new e60(qe0Var, 9));
            qe0Var.f37279q1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ke0Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin, top);
        if (qe0Var.f37287y1 != D) {
            qe0Var.f37287y1 = D;
            ke0Var.setTopGlowOffset(D - layoutParams.topMargin);
            qe0Var.f28672b.invalidate();
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27910e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27929f7));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(View view) {
        ke0 ke0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            ke0Var = this.l1;
            int i10 = 0;
            if (i7 >= ke0Var.getChildCount()) {
                break;
            }
            if (i7 == -2) {
                childAt = view;
            } else if (i7 == -1) {
                childAt = ke0Var.getPinnedHeader();
            } else {
                childAt = ke0Var.getChildAt(i7);
            }
            if ((childAt instanceof oe0) && (childAt.getTag(2131296585) instanceof pe0)) {
                oe0 oe0Var = (oe0) childAt;
                pe0 pe0Var = (pe0) childAt.getTag(2131296585);
                TLRPC.Poll poll = this.f37281s1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (Arrays.equals(pollAnswer.option, pe0Var.d) && ((ne0) this.f37284v1.get(pe0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.ij ijVar = this.f37280r1;
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
                            oe0Var.a(str2, arrayList, K0(pe0Var.d), pe0Var.f36898a, pe0Var.a(), true);
                            oe0Var.setTag(2131296585, pe0Var);
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = ke0Var.f36983p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ke0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ke0Var.getMeasuredHeight(), 0));
            View view3 = ke0Var.f36983p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ke0Var.f36983p1.getMeasuredHeight());
            ke0Var.invalidate();
        }
        ke0Var.invalidate();
    }

    @Override
    public final void K() {
        ArrayList arrayList = this.f37288z1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConnectionsManager.getInstance(this.f28669a).cancelRequest(((Integer) arrayList.get(i7)).intValue(), true);
        }
        super.K();
    }

    public final int K0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f37285w1;
            if (i7 >= arrayList.size()) {
                break;
            }
            pe0 pe0Var = (pe0) arrayList.get(i7);
            if (pe0Var != null) {
                i10 += pe0Var.f36898a;
                if (Arrays.equals(pe0Var.d, bArr)) {
                    i11 += pe0Var.f36898a;
                }
            }
            i7++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.H1;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i10 = tL_messageMediaPoll.results.total_voters;
        }
        if (i10 <= 0) {
            return 0;
        }
        return Math.round((i11 / i10) * 100.0f);
    }

    public final void L0() {
        HashMap hashMap;
        HashMap hashMap2 = this.f37284v1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f37280r1.f23266k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f37285w1;
        int size = arrayList2.size();
        int i7 = 100;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            pe0 pe0Var = (pe0) arrayList2.get(i10);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(pe0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                    hashMap = hashMap2;
                    if (Arrays.equals(pe0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        obj.f36302a = f10 - i14;
                        if (i11 == 0) {
                            i11 = i14;
                        } else if (i14 != 0 && i11 != i14) {
                            z9 = true;
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
        if (z9 && i7 != 0) {
            Collections.sort(arrayList, new org.telegram.ui.pe(12));
            int min = Math.min(i7, arrayList.size());
            for (int i15 = 0; i15 < min; i15++) {
                ((ne0) arrayList.get(i15)).getClass();
            }
        }
    }

    public final void M0() {
        Paint paint = this.A1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27981i5, false);
        int w02 = org.telegram.messenger.g0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.g0.L(500.0f);
        this.E1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.B1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.C1 = matrix;
        this.B1.setLocalMatrix(matrix);
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        r6 r6Var = new r6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f28672b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        ViewGroup viewGroup = this.f28672b;
        Drawable[] drawableArr = {this.n1};
        int i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f37278p1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27998j5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, r6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.m6.f27981i5));
        int i10 = org.telegram.ui.ActionBar.m6.f28130q6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        return arrayList;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27981i5, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false);
            if (this.I1 && x02 == this.J1 && x03 == this.K1) {
                return;
            }
            this.I1 = true;
            this.J1 = x02;
            this.K1 = x03;
            Drawable drawable = this.n1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            M0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
