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
public final class se0 extends org.telegram.ui.ActionBar.t2 {
    public static final org.telegram.ui.Cells.n8 J1 = new org.telegram.ui.Cells.n8("placeholderAlpha", 9);
    public Matrix A1;
    public float B1;
    public float C1;
    public boolean D1;
    public final RectF E1;
    public final TLRPC.TL_messageMediaPoll F1;
    public boolean G1;
    public int H1;
    public int I1;
    public final me0 f37989j1;
    public final oe0 k1;
    public final Drawable f37990l1;
    public final View m1;
    public final p7 f37991n1;
    public AnimatorSet f37992o1;
    public final org.telegram.messenger.zi f37993p1;
    public final TLRPC.Poll f37994q1;
    public final TLRPC.InputPeer f37995r1;
    public final HashSet f37996s1;
    public final HashMap f37997t1;
    public final ArrayList f37998u1;
    public final o5 f37999v1;
    public int f38000w1;
    public final ArrayList f38001x1;
    public final Paint f38002y1;
    public LinearGradient f38003z1;

    public se0(Context context, int i3, org.telegram.messenger.zi ziVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.u00 u00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11;
        int i12 = 1;
        this.f37996s1 = new HashSet();
        this.f37997t1 = new HashMap();
        this.f37998u1 = new ArrayList();
        this.f38001x1 = new ArrayList();
        this.f38002y1 = new Paint(1);
        this.D1 = true;
        this.E1 = new RectF();
        this.f28583a = i3;
        this.f28622x = true;
        N();
        this.f37993p1 = ziVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ziVar.f26868k.media;
        this.F1 = tL_messageMediaPoll;
        this.f37994q1 = tL_messageMediaPoll.poll;
        this.f37995r1 = org.telegram.messenger.hp.s1(this.f28583a).j1(org.telegram.messenger.zi.B0(ziVar.f26868k));
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
                this.f37998u1.add(new re0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f37995r1;
                tL_messages_getPollVotes.f27100id = this.f37993p1.f1();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_getPollVotes, new cg.j0(this, numArr, i13, arrayList, pollAnswerVoters, 7)));
                numArr[i13] = valueOf;
                this.f38001x1.add(valueOf);
            }
            i13++;
            i12 = i10;
        }
        L0();
        Collections.sort(this.f37998u1, new le0(this));
        M0();
        Drawable mutate = context.getResources().getDrawable(2131232726).mutate();
        this.f37990l1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27971i5, false), PorterDuff.Mode.MULTIPLY));
        gi.q3 q3Var = new gi.q3(this, context);
        this.f28586b = q3Var;
        q3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28586b;
        int i17 = this.f28618u0;
        viewGroup.setPadding(i17, 0, i17, 0);
        me0 me0Var = new me0(this, context);
        this.f37989j1 = me0Var;
        me0Var.setSections(false);
        u4.k kVar = new u4.k();
        kVar.f55616c = 150L;
        kVar.f55617e = 350L;
        kVar.f55618f = 0L;
        kVar.f55619g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f55620i = new OvershootInterpolator(1.1f);
        kVar.f55597o = xq.h;
        me0Var.setItemAnimator(kVar);
        me0Var.setClipToPadding(false);
        getContext();
        me0Var.setLayoutManager(new kg.y(i12, false, 9));
        me0Var.setHorizontalScrollBarEnabled(false);
        me0Var.setVerticalScrollBarEnabled(false);
        me0Var.setSectionsType(2);
        this.f28586b.addView(me0Var, b8.mf.e(-1, -1, 51));
        oe0 oe0Var = new oe0(this, context);
        this.k1 = oe0Var;
        me0Var.setAdapter(oe0Var);
        org.telegram.ui.ActionBar.r6.m(me0Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        me0Var.setOnItemClickListener(new ei.q4(13, this, context));
        me0Var.setOnScrollListener(new ji(this, 13));
        o5 o5Var = new o5(context);
        this.f37999v1 = o5Var;
        o5Var.setTextSize(1, 18.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(o5Var, i18, null);
        o5Var.setTag(-33024);
        o5Var.setLayoutParams(new u4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f37994q1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.zi ziVar2 = this.f37993p1;
            if (ziVar2 != null && ziVar2.J2 && (message = ziVar2.f26868k) != null && (u00Var = message.translatedPoll) != null && (tL_textWithEntities = u00Var.f25638a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.hs.i(o5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.li.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.zi.C5(m10, tL_textWithEntities2.entities, o5Var.getPaint().getFontMetricsInt(), false);
            o5Var.setText(m10);
        }
        p7 p7Var = new p7(2, context, this);
        this.f37991n1 = p7Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, p7Var, null);
        p7Var.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i18, null);
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, org.telegram.ui.ActionBar.k6.I5, null);
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, i18, null);
        org.telegram.ui.ActionBar.r6.m(p7Var, 6, org.telegram.ui.ActionBar.k6.Dj, null);
        p7Var.setOccupyStatusBar(false);
        p7Var.setAlpha(0.0f);
        p7Var.setTitle(org.telegram.messenger.bd.M0(2131747169, null));
        if (this.f37994q1.quiz) {
            p7Var.setSubtitle(org.telegram.messenger.bd.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            p7Var.setSubtitle(org.telegram.messenger.bd.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.f28586b.addView(p7Var, b8.mf.c(-2.0f, -1));
        p7Var.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 17));
        View view = new View(context);
        this.m1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.f28586b.addView(view, b8.mf.c(1.0f, -1));
    }

    public static void I0(se0 se0Var) {
        boolean z10;
        Integer num;
        float f10;
        p7 p7Var = se0Var.f37991n1;
        me0 me0Var = se0Var.f37989j1;
        if (me0Var.getChildCount() <= 0) {
            int paddingTop = me0Var.getPaddingTop();
            se0Var.f38000w1 = paddingTop;
            me0Var.setTopGlowOffset(paddingTop);
            se0Var.f28586b.invalidate();
            return;
        }
        View childAt = me0Var.getChildAt(0);
        bj0 bj0Var = (bj0) me0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        if (top <= org.telegram.messenger.g0.L(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && p7Var.getTag() == null) || (!z10 && p7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            p7Var.setTag(num);
            AnimatorSet animatorSet = se0Var.f37992o1;
            if (animatorSet != null) {
                animatorSet.cancel();
                se0Var.f37992o1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            se0Var.f37992o1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = se0Var.f37992o1;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p7Var, property, f10);
            View view = se0Var.m1;
            if (z10) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            se0Var.f37992o1.addListener(new a60(se0Var, 9));
            se0Var.f37992o1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) me0Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin, top);
        if (se0Var.f38000w1 != D) {
            se0Var.f38000w1 = D;
            me0Var.setTopGlowOffset(D - layoutParams.topMargin);
            se0Var.f28586b.invalidate();
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(View view) {
        me0 me0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i3 = -2;
        while (true) {
            me0Var = this.f37989j1;
            int i10 = 0;
            if (i3 >= me0Var.getChildCount()) {
                break;
            }
            if (i3 == -2) {
                childAt = view;
            } else if (i3 == -1) {
                childAt = me0Var.getPinnedHeader();
            } else {
                childAt = me0Var.getChildAt(i3);
            }
            if ((childAt instanceof qe0) && (childAt.getTag(2131296585) instanceof re0)) {
                qe0 qe0Var = (qe0) childAt;
                re0 re0Var = (re0) childAt.getTag(2131296585);
                TLRPC.Poll poll = this.f37994q1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (Arrays.equals(pollAnswer.option, re0Var.d) && ((pe0) this.f37997t1.get(re0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.zi ziVar = this.f37993p1;
                            if (ziVar != null && ziVar.J2 && (message = ziVar.f26868k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i10 >= ziVar.f26868k.translatedPoll.f25639b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ziVar.f26868k.translatedPoll.f25639b.get(i10);
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
                            qe0Var.a(str2, arrayList, K0(re0Var.d), re0Var.f37712a, re0Var.a(), true);
                            qe0Var.setTag(2131296585, re0Var);
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i3++;
        }
        View view2 = me0Var.f38463q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(me0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(me0Var.getMeasuredHeight(), 0));
            View view3 = me0Var.f38463q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), me0Var.f38463q1.getMeasuredHeight());
            me0Var.invalidate();
        }
        me0Var.invalidate();
    }

    @Override
    public final void K() {
        ArrayList arrayList = this.f38001x1;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(((Integer) arrayList.get(i3)).intValue(), true);
        }
        super.K();
    }

    public final int K0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f37998u1;
            if (i3 >= arrayList.size()) {
                break;
            }
            re0 re0Var = (re0) arrayList.get(i3);
            if (re0Var != null) {
                i10 += re0Var.f37712a;
                if (Arrays.equals(re0Var.d, bArr)) {
                    i11 += re0Var.f37712a;
                }
            }
            i3++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.F1;
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
        HashMap hashMap2 = this.f37997t1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f37993p1.f26868k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f37998u1;
        int size = arrayList2.size();
        int i3 = 100;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            re0 re0Var = (re0) arrayList2.get(i10);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(re0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                    hashMap = hashMap2;
                    if (Arrays.equals(re0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        obj.f37144a = f10 - i14;
                        if (i11 == 0) {
                            i11 = i14;
                        } else if (i14 != 0 && i11 != i14) {
                            z10 = true;
                        }
                        i3 -= i14;
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
        if (z10 && i3 != 0) {
            Collections.sort(arrayList, new d80(2));
            int min = Math.min(i3, arrayList.size());
            for (int i15 = 0; i15 < min; i15++) {
                ((pe0) arrayList.get(i15)).getClass();
            }
        }
    }

    public final void M0() {
        Paint paint = this.f38002y1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27971i5, false);
        int w02 = org.telegram.messenger.g0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.g0.L(500.0f);
        this.C1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.f38003z1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.A1 = matrix;
        this.f38003z1.setLocalMatrix(matrix);
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28586b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        ViewGroup viewGroup = this.f28586b;
        Drawable[] drawableArr = {this.f37990l1};
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f37991n1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27988j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f37989j1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, q6Var, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f37989j1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.f27971i5));
        int i10 = org.telegram.ui.ActionBar.k6.f28121q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f37989j1, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f37989j1, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27971i5, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
            if (this.G1 && x02 == this.H1 && x03 == this.I1) {
                return;
            }
            this.G1 = true;
            this.H1 = x02;
            this.I1 = x03;
            Drawable drawable = this.f37990l1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            M0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
