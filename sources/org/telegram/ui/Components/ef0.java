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
public final class ef0 extends org.telegram.ui.ActionBar.w2 {
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
    public final ye0 f34702m1;
    public final af0 n1;
    public final Drawable f34703o1;
    public final View f34704p1;
    public final u7 f34705q1;
    public AnimatorSet f34706r1;
    public final org.telegram.messenger.fj f34707s1;
    public final TLRPC.Poll f34708t1;
    public final TLRPC.InputPeer f34709u1;
    public final HashSet f34710v1;
    public final HashMap f34711w1;
    public final ArrayList f34712x1;
    public final w5 f34713y1;
    public int f34714z1;

    public ef0(Context context, int i7, org.telegram.messenger.fj fjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.v00 v00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11;
        int i12 = 1;
        this.f34710v1 = new HashSet();
        this.f34711w1 = new HashMap();
        this.f34712x1 = new ArrayList();
        this.A1 = new ArrayList();
        this.B1 = new Paint(1);
        this.G1 = true;
        this.H1 = new RectF();
        this.f30223a = i7;
        this.f30265x = true;
        O();
        this.f34707s1 = fjVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) fjVar.f24073k.media;
        this.I1 = tL_messageMediaPoll;
        this.f34708t1 = tL_messageMediaPoll.poll;
        this.f34709u1 = org.telegram.messenger.mp.u1(this.f30223a).l1(org.telegram.messenger.fj.B0(fjVar.f24073k));
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
                this.f34712x1.add(new df0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f34709u1;
                tL_messages_getPollVotes.f28591id = this.f34707s1.e1();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_messages_getPollVotes, new bg.l0(this, numArr, i13, arrayList, pollAnswerVoters, 7)));
                numArr[i13] = valueOf;
                this.A1.add(valueOf);
            }
            i13++;
            i12 = i10;
        }
        M0();
        Collections.sort(this.f34712x1, new xe0(this));
        N0();
        Drawable mutate = context.getResources().getDrawable(2131232733).mutate();
        this.f34703o1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29542i5, false), PorterDuff.Mode.MULTIPLY));
        hi.y3 y3Var = new hi.y3(this, context);
        this.f30226b = y3Var;
        y3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30226b;
        int i17 = this.f30261u0;
        viewGroup.setPadding(i17, 0, i17, 0);
        ye0 ye0Var = new ye0(this, context);
        this.f34702m1 = ye0Var;
        ye0Var.setSections(false);
        v4.l lVar = new v4.l();
        lVar.f59318c = 150L;
        lVar.f59319e = 350L;
        lVar.f59320f = 0L;
        lVar.f59321g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f59322i = new OvershootInterpolator(1.1f);
        lVar.f59296o = kr.h;
        ye0Var.setItemAnimator(lVar);
        ye0Var.setClipToPadding(false);
        getContext();
        ye0Var.setLayoutManager(new jg.b0(i12, false, 9));
        ye0Var.setHorizontalScrollBarEnabled(false);
        ye0Var.setVerticalScrollBarEnabled(false);
        ye0Var.setSectionsType(2);
        this.f30226b.addView(ye0Var, c8.na.e(-1, -1, 51));
        af0 af0Var = new af0(this, context);
        this.n1 = af0Var;
        ye0Var.setAdapter(af0Var);
        org.telegram.ui.ActionBar.u6.l(ye0Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        ye0Var.setOnItemClickListener(new fi.g4(13, this, context));
        ye0Var.setOnScrollListener(new na(this, 14));
        w5 w5Var = new w5(context);
        this.f34713y1 = w5Var;
        w5Var.setTextSize(1, 18.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(w5Var, i18, null);
        w5Var.setTag(-33024);
        w5Var.setLayoutParams(new v4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f34708t1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.fj fjVar2 = this.f34707s1;
            if (fjVar2 != null && fjVar2.L2 && (message = fjVar2.f24073k) != null && (v00Var = message.translatedPoll) != null && (tL_textWithEntities = v00Var.f27409a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.ks.i(w5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ri.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.fj.B5(m10, tL_textWithEntities2.entities, w5Var.getPaint().getFontMetricsInt(), false);
            w5Var.setText(m10);
        }
        u7 u7Var = new u7(2, context, this);
        this.f34705q1 = u7Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, u7Var, null);
        u7Var.setBackButtonImage(2131231243);
        org.telegram.ui.ActionBar.u6.l(u7Var, 1, i18, null);
        org.telegram.ui.ActionBar.u6.l(u7Var, 3, org.telegram.ui.ActionBar.n6.I5, null);
        org.telegram.ui.ActionBar.u6.l(u7Var, 5, i18, null);
        org.telegram.ui.ActionBar.u6.l(u7Var, 6, org.telegram.ui.ActionBar.n6.Gj, null);
        u7Var.setOccupyStatusBar(false);
        u7Var.setAlpha(0.0f);
        u7Var.setTitle(org.telegram.messenger.gd.N0(2131746967, null));
        if (this.f34708t1.quiz) {
            u7Var.setSubtitle(org.telegram.messenger.gd.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            u7Var.setSubtitle(org.telegram.messenger.gd.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.f30226b.addView(u7Var, c8.na.c(-2.0f, -1));
        u7Var.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 19));
        View view = new View(context);
        this.f34704p1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, null);
        this.f30226b.addView(view, c8.na.c(1.0f, -1));
    }

    public static void J0(ef0 ef0Var) {
        boolean z10;
        Integer num;
        float f10;
        u7 u7Var = ef0Var.f34705q1;
        ye0 ye0Var = ef0Var.f34702m1;
        if (ye0Var.getChildCount() <= 0) {
            int paddingTop = ye0Var.getPaddingTop();
            ef0Var.f34714z1 = paddingTop;
            ye0Var.setTopGlowOffset(paddingTop);
            ef0Var.f30226b.invalidate();
            return;
        }
        View childAt = ye0Var.getChildAt(0);
        mj0 mj0Var = (mj0) ye0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        if (top <= org.telegram.messenger.g0.L(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && u7Var.getTag() == null) || (!z10 && u7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            u7Var.setTag(num);
            AnimatorSet animatorSet = ef0Var.f34706r1;
            if (animatorSet != null) {
                animatorSet.cancel();
                ef0Var.f34706r1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ef0Var.f34706r1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = ef0Var.f34706r1;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u7Var, property, f10);
            View view = ef0Var.f34704p1;
            if (z10) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            ef0Var.f34706r1.addListener(new p60(ef0Var, 9));
            ef0Var.f34706r1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ye0Var.getLayoutParams();
        int i7 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams.topMargin, top);
        if (ef0Var.f34714z1 != i7) {
            ef0Var.f34714z1 = i7;
            ye0Var.setTopGlowOffset(i7 - layoutParams.topMargin);
            ef0Var.f30226b.invalidate();
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29471e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29490f7));
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void K0(View view) {
        ye0 ye0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            ye0Var = this.f34702m1;
            int i10 = 0;
            if (i7 >= ye0Var.getChildCount()) {
                break;
            }
            if (i7 == -2) {
                childAt = view;
            } else if (i7 == -1) {
                childAt = ye0Var.getPinnedHeader();
            } else {
                childAt = ye0Var.getChildAt(i7);
            }
            if ((childAt instanceof cf0) && (childAt.getTag(2131296587) instanceof df0)) {
                cf0 cf0Var = (cf0) childAt;
                df0 df0Var = (df0) childAt.getTag(2131296587);
                TLRPC.Poll poll = this.f34708t1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (Arrays.equals(pollAnswer.option, df0Var.d) && ((bf0) this.f34711w1.get(df0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.fj fjVar = this.f34707s1;
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
                            cf0Var.a(str2, arrayList, L0(df0Var.d), df0Var.f34317a, df0Var.a(), true);
                            cf0Var.setTag(2131296587, df0Var);
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = ye0Var.f34770q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ye0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ye0Var.getMeasuredHeight(), 0));
            View view3 = ye0Var.f34770q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ye0Var.f34770q1.getMeasuredHeight());
            ye0Var.invalidate();
        }
        ye0Var.invalidate();
    }

    @Override
    public final void L() {
        ArrayList arrayList = this.A1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConnectionsManager.getInstance(this.f30223a).cancelRequest(((Integer) arrayList.get(i7)).intValue(), true);
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
            ArrayList arrayList = this.f34712x1;
            if (i7 >= arrayList.size()) {
                break;
            }
            df0 df0Var = (df0) arrayList.get(i7);
            if (df0Var != null) {
                i10 += df0Var.f34317a;
                if (Arrays.equals(df0Var.d, bArr)) {
                    i11 += df0Var.f34317a;
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
        HashMap hashMap2 = this.f34711w1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f34707s1.f24073k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f34712x1;
        int size = arrayList2.size();
        int i7 = 100;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            df0 df0Var = (df0) arrayList2.get(i10);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(df0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                    hashMap = hashMap2;
                    if (Arrays.equals(df0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        obj.f33752a = f10 - i14;
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
                ((bf0) arrayList.get(i15)).getClass();
            }
        }
    }

    public final void N0() {
        Paint paint = this.B1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29542i5, false);
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
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f30226b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.zj));
        ViewGroup viewGroup = this.f30226b;
        Drawable[] drawableArr = {this.f34703o1};
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f34705q1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29559j5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f34702m1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, w6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f34702m1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.f29542i5));
        int i10 = org.telegram.ui.ActionBar.n6.f29691q6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f34702m1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f34702m1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        return arrayList;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29542i5, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
            if (this.J1 && x02 == this.K1 && x03 == this.L1) {
                return;
            }
            this.J1 = true;
            this.K1 = x02;
            this.L1 = x03;
            Drawable drawable = this.f34703o1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            N0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
