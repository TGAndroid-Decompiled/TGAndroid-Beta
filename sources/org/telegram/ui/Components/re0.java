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
public final class re0 extends org.telegram.ui.ActionBar.v2 {
    public static final org.telegram.ui.Cells.o8 I1 = new org.telegram.ui.Cells.o8("placeholderAlpha", 9);
    public float A1;
    public float B1;
    public boolean C1;
    public final RectF D1;
    public final TLRPC.TL_messageMediaPoll E1;
    public boolean F1;
    public int G1;
    public int H1;
    public final le0 f37685i1;
    public final ne0 f37686j1;
    public final Drawable f37687k1;
    public final View l1;
    public final r7 f37688m1;
    public AnimatorSet n1;
    public final org.telegram.messenger.ij f37689o1;
    public final TLRPC.Poll f37690p1;
    public final TLRPC.InputPeer f37691q1;
    public final HashSet f37692r1;
    public final HashMap f37693s1;
    public final ArrayList f37694t1;
    public final q5 f37695u1;
    public int f37696v1;
    public final ArrayList f37697w1;
    public final Paint f37698x1;
    public LinearGradient f37699y1;
    public Matrix f37700z1;

    public re0(Context context, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.c10 c10Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11;
        int i12 = 1;
        this.f37692r1 = new HashSet();
        this.f37693s1 = new HashMap();
        this.f37694t1 = new ArrayList();
        this.f37697w1 = new ArrayList();
        this.f37698x1 = new Paint(1);
        this.C1 = true;
        this.D1 = new RectF();
        this.f28621a = i7;
        this.f28659x = true;
        N();
        this.f37689o1 = ijVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ijVar.f23262k.media;
        this.E1 = tL_messageMediaPoll;
        this.f37690p1 = tL_messageMediaPoll.poll;
        this.f37691q1 = org.telegram.messenger.qp.s1(this.f28621a).j1(org.telegram.messenger.ij.B0(ijVar.f23262k));
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
                this.f37694t1.add(new qe0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f37691q1;
                tL_messages_getPollVotes.f27055id = this.f37689o1.e1();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_messages_getPollVotes, new bg.k0(this, numArr, i13, arrayList, pollAnswerVoters, 7)));
                numArr[i13] = valueOf;
                this.f37697w1.add(valueOf);
            }
            i13++;
            i12 = i10;
        }
        L0();
        Collections.sort(this.f37694t1, new ke0(this));
        M0();
        Drawable mutate = context.getResources().getDrawable(2131232728).mutate();
        this.f37687k1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27956i5, false), PorterDuff.Mode.MULTIPLY));
        fi.r3 r3Var = new fi.r3(this, context);
        this.f28624b = r3Var;
        r3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28624b;
        int i17 = this.f28654t0;
        viewGroup.setPadding(i17, 0, i17, 0);
        le0 le0Var = new le0(this, context);
        this.f37685i1 = le0Var;
        le0Var.setSections(false);
        v4.k kVar = new v4.k();
        kVar.f57128c = 150L;
        kVar.f57129e = 350L;
        kVar.f57130f = 0L;
        kVar.f57131g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f57132i = new OvershootInterpolator(1.1f);
        kVar.f57112o = xq.h;
        le0Var.setItemAnimator(kVar);
        le0Var.setClipToPadding(false);
        getContext();
        le0Var.setLayoutManager(new jg.b0(i12, false, 9));
        le0Var.setHorizontalScrollBarEnabled(false);
        le0Var.setVerticalScrollBarEnabled(false);
        le0Var.setSectionsType(2);
        this.f28624b.addView(le0Var, c8.ha.e(-1, -1, 51));
        ne0 ne0Var = new ne0(this, context);
        this.f37686j1 = ne0Var;
        le0Var.setAdapter(ne0Var);
        org.telegram.ui.ActionBar.s6.l(le0Var, 21, org.telegram.ui.ActionBar.l6.A5, null);
        le0Var.setOnItemClickListener(new di.q4(13, this, context));
        le0Var.setOnScrollListener(new ui(this, 11));
        q5 q5Var = new q5(context);
        this.f37695u1 = q5Var;
        q5Var.setTextSize(1, 18.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.s6.U(q5Var, i18, null);
        q5Var.setTag(-33024);
        q5Var.setLayoutParams(new v4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f37690p1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.ij ijVar2 = this.f37689o1;
            if (ijVar2 != null && ijVar2.J2 && (message = ijVar2.f23262k) != null && (c10Var = message.translatedPoll) != null && (tL_textWithEntities = c10Var.f21770a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.qs.i(q5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, q5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.ij.B5(m10, tL_textWithEntities2.entities, q5Var.getPaint().getFontMetricsInt(), false);
            q5Var.setText(m10);
        }
        r7 r7Var = new r7(2, context, this);
        this.f37688m1 = r7Var;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, r7Var, null);
        r7Var.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.s6.l(r7Var, 1, i18, null);
        org.telegram.ui.ActionBar.s6.l(r7Var, 3, org.telegram.ui.ActionBar.l6.I5, null);
        org.telegram.ui.ActionBar.s6.l(r7Var, 5, i18, null);
        org.telegram.ui.ActionBar.s6.l(r7Var, 6, org.telegram.ui.ActionBar.l6.Dj, null);
        r7Var.setOccupyStatusBar(false);
        r7Var.setAlpha(0.0f);
        r7Var.setTitle(org.telegram.messenger.id.M0(2131747161, null));
        if (this.f37690p1.quiz) {
            r7Var.setSubtitle(org.telegram.messenger.id.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            r7Var.setSubtitle(org.telegram.messenger.id.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.f28624b.addView(r7Var, c8.ha.c(-2.0f, -1));
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 16));
        View view = new View(context);
        this.l1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.V5, view, null);
        this.f28624b.addView(view, c8.ha.c(1.0f, -1));
    }

    public static void I0(re0 re0Var) {
        boolean z9;
        Integer num;
        float f10;
        r7 r7Var = re0Var.f37688m1;
        le0 le0Var = re0Var.f37685i1;
        if (le0Var.getChildCount() <= 0) {
            int paddingTop = le0Var.getPaddingTop();
            re0Var.f37696v1 = paddingTop;
            le0Var.setTopGlowOffset(paddingTop);
            re0Var.f28624b.invalidate();
            return;
        }
        View childAt = le0Var.getChildAt(0);
        yi0 yi0Var = (yi0) le0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || yi0Var == null || yi0Var.b() != 0) {
            top = L;
        }
        if (top <= org.telegram.messenger.g0.L(12.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((z9 && r7Var.getTag() == null) || (!z9 && r7Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            r7Var.setTag(num);
            AnimatorSet animatorSet = re0Var.n1;
            if (animatorSet != null) {
                animatorSet.cancel();
                re0Var.n1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            re0Var.n1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = re0Var.n1;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, property, f10);
            View view = re0Var.l1;
            if (z9) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            re0Var.n1.addListener(new f60(re0Var, 9));
            re0Var.n1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) le0Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin, top);
        if (re0Var.f37696v1 != D) {
            re0Var.f37696v1 = D;
            le0Var.setTopGlowOffset(D - layoutParams.topMargin);
            re0Var.f28624b.invalidate();
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27885e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27904f7));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(View view) {
        le0 le0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            le0Var = this.f37685i1;
            int i10 = 0;
            if (i7 >= le0Var.getChildCount()) {
                break;
            }
            if (i7 == -2) {
                childAt = view;
            } else if (i7 == -1) {
                childAt = le0Var.getPinnedHeader();
            } else {
                childAt = le0Var.getChildAt(i7);
            }
            if ((childAt instanceof pe0) && (childAt.getTag(2131296585) instanceof qe0)) {
                pe0 pe0Var = (pe0) childAt;
                qe0 qe0Var = (qe0) childAt.getTag(2131296585);
                TLRPC.Poll poll = this.f37690p1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (Arrays.equals(pollAnswer.option, qe0Var.d) && ((oe0) this.f37693s1.get(qe0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.ij ijVar = this.f37689o1;
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
                            pe0Var.a(str2, arrayList, K0(qe0Var.d), qe0Var.f37299a, qe0Var.a(), true);
                            pe0Var.setTag(2131296585, qe0Var);
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = le0Var.f37384p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(le0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(le0Var.getMeasuredHeight(), 0));
            View view3 = le0Var.f37384p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), le0Var.f37384p1.getMeasuredHeight());
            le0Var.invalidate();
        }
        le0Var.invalidate();
    }

    @Override
    public final void K() {
        ArrayList arrayList = this.f37697w1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConnectionsManager.getInstance(this.f28621a).cancelRequest(((Integer) arrayList.get(i7)).intValue(), true);
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
            ArrayList arrayList = this.f37694t1;
            if (i7 >= arrayList.size()) {
                break;
            }
            qe0 qe0Var = (qe0) arrayList.get(i7);
            if (qe0Var != null) {
                i10 += qe0Var.f37299a;
                if (Arrays.equals(qe0Var.d, bArr)) {
                    i11 += qe0Var.f37299a;
                }
            }
            i7++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.E1;
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
        HashMap hashMap2 = this.f37693s1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f37689o1.f23262k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f37694t1;
        int size = arrayList2.size();
        int i7 = 100;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            qe0 qe0Var = (qe0) arrayList2.get(i10);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(qe0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                    hashMap = hashMap2;
                    if (Arrays.equals(qe0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        obj.f36712a = f10 - i14;
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
            Collections.sort(arrayList, new org.telegram.ui.oe(12));
            int min = Math.min(i7, arrayList.size());
            for (int i15 = 0; i15 < min; i15++) {
                ((oe0) arrayList.get(i15)).getClass();
            }
        }
    }

    public final void M0() {
        Paint paint = this.f37698x1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
        int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27956i5, false);
        int w02 = org.telegram.messenger.g0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.g0.L(500.0f);
        this.B1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.f37699y1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.f37700z1 = matrix;
        this.f37699y1.setLocalMatrix(matrix);
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f28624b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.wj));
        ViewGroup viewGroup = this.f28624b;
        Drawable[] drawableArr = {this.f37687k1};
        int i7 = org.telegram.ui.ActionBar.l6.f27938h5;
        arrayList.add(new org.telegram.ui.ActionBar.u6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f37688m1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27973j5));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f37685i1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, s6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f37685i1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.f27956i5));
        int i10 = org.telegram.ui.ActionBar.l6.f28105q6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f37685i1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        int i11 = org.telegram.ui.ActionBar.l6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f37685i1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        return arrayList;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27956i5, false);
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
            if (this.F1 && x02 == this.G1 && x03 == this.H1) {
                return;
            }
            this.F1 = true;
            this.G1 = x02;
            this.H1 = x03;
            Drawable drawable = this.f37687k1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            M0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
