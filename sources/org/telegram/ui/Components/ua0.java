package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ua0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b1 D;
    public final za0 E;
    public final FrameLayout F;
    public final za0 G;
    public final za0 H;
    public final int I;
    public final li.k J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public AnimatorSet P;
    public final Rect Q;
    public int R;
    public float S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public final int f30876a;
    public int f30877a0;
    public final org.telegram.ui.w8 f30878b;
    public boolean f30879b0;
    public final ia0 f30880c;
    public final ab0 f30881c0;
    public final org.telegram.ui.Cells.v9 d;
    public final oa0 e;
    public final ag.b1 f30882f;
    public final qa0 h;
    public final org.telegram.ui.x7 f30883n;
    public org.telegram.messenger.lj f30884r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f30885s;
    public final na0 f30886w;
    public final na0 f30887x;
    public final org.telegram.ui.ActionBar.b1 f30888y;

    public ua0(org.telegram.ui.Components.ab0 r36, android.content.Context r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.<init>(org.telegram.ui.Components.ab0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.ej a(ua0 ua0Var, org.telegram.messenger.jj jjVar) {
        if (jjVar.d1() != 0) {
            org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) ua0Var.f30884r.d.get(jjVar.d1());
            if (ejVar == null || (ejVar.d.size() > 1 && ejVar.d(jjVar) != null)) {
                return ejVar;
            }
            return null;
        }
        return null;
    }

    public static void b(ua0 ua0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (ua0Var.f30876a == 2) {
            org.telegram.messenger.nj njVar = ua0Var.f30881c0.d;
            if (!njVar.f17124n && (uRLSpan = njVar.f17132w) != null && (webPage = njVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.m3(uRLSpan);
                return;
            }
        }
        q1Var.m3(null);
    }

    public final org.telegram.messenger.jj c(org.telegram.messenger.jj jjVar) {
        org.telegram.messenger.ej ejVar;
        org.telegram.messenger.nj njVar = this.f30881c0.d;
        org.telegram.messenger.lj ljVar = njVar.f17114a;
        if (ljVar != null) {
            LongSparseArray longSparseArray = ljVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (ejVar = (org.telegram.messenger.ej) njVar.f17114a.d.valueAt(0)) != null) {
                if (ejVar.f15399i) {
                    if (jjVar != null) {
                        return jjVar;
                    }
                    org.telegram.ui.kn knVar = njVar.d;
                    if (knVar != null) {
                        return knVar.f38905a;
                    }
                }
                return ejVar.h;
            }
            return (org.telegram.messenger.jj) njVar.f17114a.e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj c10;
        if (q1Var != null && q1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (q1Var.getMessageObject() == c10 || q1Var.getMessageObject().f1() == c10.f1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.f30881c0.f24359w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30885s;
        ia0 ia0Var = this.f30880c;
        org.telegram.ui.w8 w8Var = this.f30878b;
        if (z10) {
            ia0Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            ia0Var.setTranslationY(i10);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + w8Var.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.v9 v9Var = this.d;
        v9Var.setTranslationX(x10);
        v9Var.setTranslationY(w8Var.getY());
    }

    public final void g() {
        ab0 ab0Var = this.f30881c0;
        new cc(ab0Var, ab0Var.F).I(2131624011, org.telegram.messenger.cd.L0(2131746452, null), org.telegram.messenger.cd.L0(2131746451, null)).j();
    }

    public final void h(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        int i13 = 0;
        if (this.f30881c0.f24353b) {
            z10 = false;
        }
        if (!z11 || this.O != z10) {
            this.O = z10;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.b1 b1Var = this.D;
            org.telegram.ui.ActionBar.b1 b1Var2 = this.f30888y;
            na0 na0Var = this.f30887x;
            na0 na0Var2 = this.f30886w;
            float f15 = 0.0f;
            if (z11) {
                this.P = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (na0Var2 != null) {
                    na0Var2.setVisibility(0);
                    if (!z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(na0Var2, property, f14));
                }
                if (na0Var != null) {
                    na0Var.setVisibility(0);
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(na0Var, property, f13));
                }
                if (b1Var2 != null) {
                    b1Var2.setVisibility(0);
                    if (!z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(b1Var2, property, f12));
                }
                if (b1Var != null) {
                    b1Var.setVisibility(0);
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(b1Var, property, f15));
                }
                this.P.playTogether(arrayList);
                this.P.setDuration(360L);
                this.P.setInterpolator(gr.h);
                this.P.addListener(new ha0(1, this, z10));
                this.P.start();
                return;
            }
            if (na0Var2 != null) {
                if (!z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                na0Var2.setAlpha(f11);
                if (!z10) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                na0Var2.setVisibility(i12);
            }
            if (na0Var != null) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                na0Var.setAlpha(f10);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                na0Var.setVisibility(i11);
            }
            if (b1Var2 != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b1Var2.setAlpha(f7);
                if (!z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                b1Var2.setVisibility(i10);
            }
            if (b1Var != null) {
                if (z10) {
                    f15 = 1.0f;
                }
                b1Var.setAlpha(f15);
                if (!z10) {
                    i13 = 4;
                }
                b1Var.setVisibility(i13);
            }
        }
    }

    public final void i() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ab0 ab0Var = this.f30881c0;
        org.telegram.messenger.nj njVar = ab0Var.d;
        qa0 qa0Var = this.h;
        if (qa0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f30884r.f16749f.size(); i11++) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.f30884r.f16749f.get(i11);
            jjVar.K1 = true;
            jjVar.f16319f2 = ab0Var.f24352a;
            if (!njVar.f17121k) {
                jjVar.f16337k.flags |= 4;
                jjVar.f16314e2 = false;
            } else {
                jjVar.f16337k.flags &= -5;
                jjVar.f16314e2 = true;
            }
            if (this.f30876a == 2) {
                TLRPC.WebPage webPage = njVar.v;
                if (webPage != null && ((messageMedia = (message = jjVar.f16337k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = jjVar.f16337k.media;
                    messageMedia2.webpage = njVar.v;
                    boolean z10 = njVar.f17127q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    jjVar.f16390y = null;
                    jjVar.o0();
                    jjVar.f16348n0 = null;
                    jjVar.f16352o0 = null;
                    jjVar.f16342l0 = null;
                    jjVar.m0 = null;
                    jjVar.r0(true);
                    jjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = jjVar.f16337k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (njVar.f17122l) {
                jjVar.f16394z = null;
            } else {
                jjVar.k0();
            }
            if (jjVar.T3()) {
                org.telegram.messenger.mj mjVar = (org.telegram.messenger.mj) jjVar.f16337k.media;
                TLRPC.PollResults pollResults = mjVar.results;
                if (njVar.f17122l) {
                    i10 = 0;
                } else {
                    i10 = mjVar.f16961a;
                }
                pollResults.total_voters = i10;
            }
        }
        for (int i12 = 0; i12 < this.f30884r.h.size(); i12++) {
            ((TLRPC.PollAnswerVoters) this.f30884r.h.get(i12)).chosen = !njVar.f17121k;
        }
        for (int i13 = 0; i13 < this.f30884r.d.size(); i13++) {
            qa0Var.V((org.telegram.messenger.ej) this.f30884r.d.valueAt(i13));
        }
        this.f30883n.k(0, this.f30884r.f16749f.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        ab0 ab0Var = this.f30881c0;
        boolean z10 = ab0Var.f24359w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30885s;
        ag.b1 b1Var = this.f30882f;
        int i11 = 0;
        if (!z10) {
            int measuredHeight = b1Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < b1Var.getChildCount(); i13++) {
                View childAt = b1Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            org.telegram.messenger.lj ljVar = this.f30884r;
            if (ljVar != null && i12 != 0 && i12 <= ljVar.f16749f.size()) {
                int d = i0.a.d(4.0f, measuredHeight, 0);
                this.R = d;
                int measuredHeight2 = (b1Var.getMeasuredHeight() - this.R) + d;
                int i14 = org.telegram.messenger.i0.f16026q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = org.telegram.messenger.i0.f16021n;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - org.telegram.messenger.i0.L(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float B = c3.i0.B(getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f), (this.f30878b.getMeasuredHeight() - this.R) + (this.W - org.telegram.messenger.i0.L(8.0f)), 2.0f, org.telegram.messenger.i0.L(8.0f)) - this.R;
            this.S = B;
            if (B > org.telegram.messenger.i0.L(8.0f)) {
                this.S = org.telegram.messenger.i0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.i0.L(8.0f) + b1Var.getMeasuredWidth());
        }
        boolean z11 = this.K;
        if (!z11 && (this.R != i10 || this.S != f7)) {
            ValueAnimator valueAnimator = ab0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ab0Var.h = ofFloat;
            ofFloat.addUpdateListener(new gj(this, i10, f7, 1));
            ab0Var.h.setDuration(250L);
            ab0Var.h.setInterpolator(ci.o.V);
            ab0Var.h.addListener(new t60(this, 4));
            org.telegram.messenger.i0.h3(ab0Var.D, 50L);
            this.T = i10;
            f(f7, i10);
        } else if (z11) {
            float f10 = this.S;
            int i15 = this.R;
            this.T = i15;
            f(f10, i15);
        }
    }

    public final void k() {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        ab0 ab0Var = this.f30881c0;
        org.telegram.messenger.nj njVar = ab0Var.d;
        if (this.f30876a == 0) {
            oa0 oa0Var = this.e;
            if (oa0Var.v - oa0Var.f23443u <= org.telegram.messenger.vp.r1(ab0Var.f24360x).f18871p4) {
                org.telegram.ui.Cells.r9 r9Var = oa0Var.W;
                if (r9Var != null) {
                    jjVar = ((org.telegram.ui.Cells.q1) r9Var).getMessageObject();
                } else {
                    jjVar = null;
                }
                org.telegram.messenger.jj c10 = c(jjVar);
                if (njVar.d != null && oa0Var.x()) {
                    njVar.e = oa0Var.f23443u;
                    njVar.f17117f = oa0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.kn knVar = njVar.d;
                        if (knVar.f38914m || (jjVar2 = knVar.f38905a) == null || jjVar2.f1() != c10.f1()) {
                            njVar.d = org.telegram.ui.kn.b(njVar.e, njVar.f17117f, c10);
                            ab0Var.b();
                        }
                    }
                }
                oa0Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String L0;
        ab0 ab0Var = this.f30881c0;
        TLRPC.User user = ab0Var.f24356n;
        org.telegram.messenger.nj njVar = ab0Var.d;
        TLRPC.Chat chat = ab0Var.f24357r;
        ia0 ia0Var = this.f30880c;
        int i10 = this.f30876a;
        if (i10 == 1) {
            org.telegram.messenger.lj ljVar = njVar.f17115b;
            if (ljVar == null) {
                size = 0;
            } else {
                size = ljVar.f16750g.size();
            }
            ia0Var.b(org.telegram.messenger.cd.G(size, "PreviewForwardMessagesCount", new Object[0]), z10);
            if (!njVar.h) {
                if (njVar.f17123m) {
                    if (user != null) {
                        L0 = org.telegram.messenger.cd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                    } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                        L0 = org.telegram.messenger.cd.L0(2131750580, null);
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131750579, null);
                    }
                } else if (user != null) {
                    L0 = org.telegram.messenger.cd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                    L0 = org.telegram.messenger.cd.L0(2131750583, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131750582, null);
                }
            } else if (!njVar.f17121k) {
                if (user != null) {
                    L0 = org.telegram.messenger.cd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                    L0 = org.telegram.messenger.cd.L0(2131750580, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131750579, null);
                }
            } else if (user != null) {
                L0 = org.telegram.messenger.cd.a0("ForwardPreviewSendersNameHidden", null, 2131750584, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                L0 = org.telegram.messenger.cd.L0(2131750583, null);
            } else {
                L0 = org.telegram.messenger.cd.L0(2131750582, null);
            }
            ia0Var.a(L0, z10);
        } else if (i10 == 0) {
            if (njVar.d != null && njVar.f17114a.f16752j) {
                ia0Var.b(org.telegram.messenger.cd.L0(2131746895, null), z10);
                ia0Var.a(org.telegram.messenger.cd.L0(2131746894, null), z10);
                return;
            }
            ia0Var.b(org.telegram.messenger.cd.L0(2131748560, null), z10);
            if (njVar.f17114a.f16752j) {
                str = org.telegram.messenger.cd.L0(2131748561, null);
            } else {
                str = "";
            }
            ia0Var.a(str, z10);
        } else if (i10 == 2) {
            ia0Var.b(org.telegram.messenger.cd.L0(2131748563, null), z10);
            ia0Var.a(org.telegram.messenger.cd.L0(2131748564, null), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30876a == 0) {
            org.telegram.messenger.i0.d0(this.f30882f, new r2(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f30879b0 = true;
        this.K = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
        this.K = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ab0 ab0Var = this.f30881c0;
        ab0Var.f24359w = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30885s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f30882f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        boolean z11 = ab0Var.f24359w;
        org.telegram.ui.w8 w8Var = this.f30878b;
        if (z11) {
            w8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(8.0f);
            w8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(org.telegram.messenger.i0.L(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = 0;
            w8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.L(6.0f)) - this.W;
            if (w8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                w8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            w8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - w8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.f30877a0 != size2) {
            for (int i13 = 0; i13 < this.f30884r.f16749f.size(); i13++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.f30884r.f16749f.get(i13);
                if (ab0Var.f24359w) {
                    size = w8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(16.0f);
                }
                jjVar.f16301b2 = size;
                jjVar.Q1 = false;
                jjVar.K1 = true;
                org.telegram.ui.x7 x7Var = this.f30883n;
                if (x7Var != null) {
                    x7Var.f();
                }
            }
            this.K = true;
        }
        this.f30877a0 = size2;
        super.onMeasure(i10, i11);
    }
}
