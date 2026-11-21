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
public final class qa0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.y0 E;
    public final va0 F;
    public final FrameLayout G;
    public final va0 H;
    public final va0 I;
    public final int J;
    public final h6.m K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public AnimatorSet Q;
    public final Rect R;
    public int S;
    public float T;
    public int U;
    public boolean V;
    public boolean W;
    public final int f38858a;
    public int f38859a0;
    public final org.telegram.ui.w8 f38860b;
    public int f38861b0;
    public final ea0 f38862c;
    public boolean f38863c0;
    public final org.telegram.ui.Cells.v9 d;
    public final wa0 f38864d0;
    public final ka0 f38865e;
    public final di.b1 f38866f;
    public final ma0 h;
    public final org.telegram.ui.y7 f38867n;
    public org.telegram.messenger.hj f38868r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38869s;
    public final ja0 f38870w;
    public final ja0 f38871x;
    public final org.telegram.ui.ActionBar.y0 f38872y;

    public qa0(org.telegram.ui.Components.wa0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa0.<init>(org.telegram.ui.Components.wa0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.aj a(qa0 qa0Var, org.telegram.messenger.fj fjVar) {
        if (fjVar.c1() != 0) {
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) qa0Var.f38868r.d.get(fjVar.c1());
            if (ajVar == null || (ajVar.d.size() > 1 && ajVar.d(fjVar) != null)) {
                return ajVar;
            }
            return null;
        }
        return null;
    }

    public static void b(qa0 qa0Var, org.telegram.ui.Cells.r1 r1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (qa0Var.f38858a == 2) {
            org.telegram.messenger.jj jjVar = qa0Var.f38864d0.d;
            if (!jjVar.f24903n && (uRLSpan = jjVar.f24911w) != null && (webPage = jjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                r1Var.s3(uRLSpan);
                return;
            }
        }
        r1Var.s3(null);
    }

    public final org.telegram.messenger.fj c(org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.aj ajVar;
        org.telegram.messenger.jj jjVar = this.f38864d0.d;
        org.telegram.messenger.hj hjVar = jjVar.f24892a;
        if (hjVar != null) {
            LongSparseArray longSparseArray = hjVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (ajVar = (org.telegram.messenger.aj) jjVar.f24892a.d.valueAt(0)) != null) {
                if (ajVar.f22929i) {
                    if (fjVar != null) {
                        return fjVar;
                    }
                    org.telegram.ui.rm rmVar = jjVar.d;
                    if (rmVar != null) {
                        return rmVar.f51615a;
                    }
                }
                return ajVar.h;
            }
            return (org.telegram.messenger.fj) jjVar.f24892a.f24483e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa0.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj c10;
        if (r1Var != null && r1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (r1Var.getMessageObject() == c10 || r1Var.getMessageObject().e1() == c10.e1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f10, int i7) {
        boolean z10 = this.f38864d0.f41751w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f38869s;
        ea0 ea0Var = this.f38862c;
        org.telegram.ui.w8 w8Var = this.f38860b;
        if (z10) {
            ea0Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            ea0Var.setTranslationY(i7);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + w8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.v9 v9Var = this.d;
        v9Var.setTranslationX(x10);
        v9Var.setTranslationY(w8Var.getY());
    }

    public final void g() {
        wa0 wa0Var = this.f38864d0;
        new lc(wa0Var, wa0Var.G).I(2131624012, org.telegram.messenger.gd.N0(2131746241, null), org.telegram.messenger.gd.N0(2131746240, null)).j();
    }

    public final void h(boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        int i10;
        float f12;
        int i11;
        float f13;
        float f14;
        float f15;
        int i12 = 0;
        if (this.f38864d0.f41744b) {
            z10 = false;
        }
        if (!z11 || this.P != z10) {
            this.P = z10;
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Q = null;
            }
            org.telegram.ui.ActionBar.y0 y0Var = this.E;
            org.telegram.ui.ActionBar.y0 y0Var2 = this.f38872y;
            ja0 ja0Var = this.f38871x;
            ja0 ja0Var2 = this.f38870w;
            float f16 = 0.0f;
            if (z11) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (ja0Var2 != null) {
                    ja0Var2.setVisibility(0);
                    if (!z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ja0Var2, property, f15));
                }
                if (ja0Var != null) {
                    ja0Var.setVisibility(0);
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ja0Var, property, f14));
                }
                if (y0Var2 != null) {
                    y0Var2.setVisibility(0);
                    if (!z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(y0Var2, property, f13));
                }
                if (y0Var != null) {
                    y0Var.setVisibility(0);
                    if (z10) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(y0Var, property, f16));
                }
                this.Q.playTogether(arrayList);
                this.Q.setDuration(360L);
                this.Q.setInterpolator(nr.h);
                this.Q.addListener(new org.telegram.ui.on(16, this, z10));
                this.Q.start();
                return;
            }
            if (ja0Var2 != null) {
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ja0Var2.setAlpha(f12);
                if (!z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                ja0Var2.setVisibility(i11);
            }
            if (ja0Var != null) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ja0Var.setAlpha(f11);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                ja0Var.setVisibility(i10);
            }
            if (y0Var2 != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y0Var2.setAlpha(f10);
                if (!z10) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                y0Var2.setVisibility(i7);
            }
            if (y0Var != null) {
                if (z10) {
                    f16 = 1.0f;
                }
                y0Var.setAlpha(f16);
                if (!z10) {
                    i12 = 4;
                }
                y0Var.setVisibility(i12);
            }
        }
    }

    public final void i() {
        int i7;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        wa0 wa0Var = this.f38864d0;
        org.telegram.messenger.jj jjVar = wa0Var.d;
        ma0 ma0Var = this.h;
        if (ma0Var.k()) {
            this.W = true;
            return;
        }
        for (int i10 = 0; i10 < this.f38868r.f24484f.size(); i10++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f38868r.f24484f.get(i10);
            fjVar.M1 = true;
            fjVar.f23982h2 = wa0Var.f41743a;
            if (!jjVar.f24900k) {
                fjVar.f23993k.flags |= 4;
                fjVar.f23978g2 = false;
            } else {
                fjVar.f23993k.flags &= -5;
                fjVar.f23978g2 = true;
            }
            if (this.f38858a == 2) {
                TLRPC.WebPage webPage = jjVar.v;
                if (webPage != null && ((messageMedia = (message = fjVar.f23993k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = fjVar.f23993k.media;
                    messageMedia2.webpage = jjVar.v;
                    boolean z10 = jjVar.f24906q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    fjVar.f24047y = null;
                    fjVar.o0();
                    fjVar.f24013p0 = null;
                    fjVar.f24017q0 = null;
                    fjVar.f24006n0 = null;
                    fjVar.f24009o0 = null;
                    fjVar.r0(true);
                    fjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = fjVar.f23993k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (jjVar.f24901l) {
                fjVar.f24051z = null;
            } else {
                fjVar.k0();
            }
            if (fjVar.T3()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) fjVar.f23993k.media;
                TLRPC.PollResults pollResults = ijVar.results;
                if (jjVar.f24901l) {
                    i7 = 0;
                } else {
                    i7 = ijVar.f24707a;
                }
                pollResults.total_voters = i7;
            }
        }
        for (int i11 = 0; i11 < this.f38868r.h.size(); i11++) {
            ((TLRPC.PollAnswerVoters) this.f38868r.h.get(i11)).chosen = !jjVar.f24900k;
        }
        for (int i12 = 0; i12 < this.f38868r.d.size(); i12++) {
            ma0Var.V((org.telegram.messenger.aj) this.f38868r.d.valueAt(i12));
        }
        this.f38867n.k(0, this.f38868r.f24484f.size());
    }

    public final void j() {
        int i7 = this.S;
        float f10 = this.T;
        wa0 wa0Var = this.f38864d0;
        boolean z10 = wa0Var.f41751w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f38869s;
        di.b1 b1Var = this.f38866f;
        int i10 = 0;
        if (!z10) {
            int measuredHeight = b1Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < b1Var.getChildCount(); i12++) {
                View childAt = b1Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            org.telegram.messenger.hj hjVar = this.f38868r;
            if (hjVar != null && i11 != 0 && i11 <= hjVar.f24484f.size()) {
                int d = i5.c.d(4.0f, measuredHeight, 0);
                this.S = d;
                int measuredHeight2 = (b1Var.getMeasuredHeight() - this.S) + d;
                int i13 = org.telegram.messenger.g0.f24146q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i10 = org.telegram.messenger.g0.f24141n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i13 - i10) * 0.8f) - this.f38859a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.f38860b.getMeasuredHeight() - this.S) + (this.f38859a0 - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.S;
            this.T = A;
            if (A > org.telegram.messenger.g0.L(8.0f)) {
                this.T = org.telegram.messenger.g0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + b1Var.getMeasuredWidth());
        }
        boolean z11 = this.L;
        if (!z11 && (this.S != i7 || this.T != f10)) {
            ValueAnimator valueAnimator = wa0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            wa0Var.h = ofFloat;
            ofFloat.addUpdateListener(new xj(this, i7, f10, 1));
            wa0Var.h.setDuration(250L);
            wa0Var.h.setInterpolator(pi.k.V);
            wa0Var.h.addListener(new s60(this, 4));
            org.telegram.messenger.g0.h3(wa0Var.E, 50L);
            this.U = i7;
            f(f10, i7);
        } else if (z11) {
            float f11 = this.T;
            int i14 = this.S;
            this.U = i14;
            f(f11, i14);
        }
    }

    public final void k() {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        wa0 wa0Var = this.f38864d0;
        org.telegram.messenger.jj jjVar = wa0Var.d;
        if (this.f38858a == 0) {
            ka0 ka0Var = this.f38865e;
            if (ka0Var.v - ka0Var.f32297u <= org.telegram.messenger.mp.u1(wa0Var.f41752x).f25777r4) {
                org.telegram.ui.Cells.r9 r9Var = ka0Var.W;
                if (r9Var != null) {
                    fjVar = ((org.telegram.ui.Cells.r1) r9Var).getMessageObject();
                } else {
                    fjVar = null;
                }
                org.telegram.messenger.fj c10 = c(fjVar);
                if (jjVar.d != null && ka0Var.x()) {
                    jjVar.f24895e = ka0Var.f32297u;
                    jjVar.f24896f = ka0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.rm rmVar = jjVar.d;
                        if (rmVar.f51625m || (fjVar2 = rmVar.f51615a) == null || fjVar2.e1() != c10.e1()) {
                            jjVar.d = org.telegram.ui.rm.b(jjVar.f24895e, jjVar.f24896f, c10);
                            wa0Var.b();
                        }
                    }
                }
                ka0Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String N0;
        wa0 wa0Var = this.f38864d0;
        TLRPC.User user = wa0Var.f41748n;
        org.telegram.messenger.jj jjVar = wa0Var.d;
        TLRPC.Chat chat = wa0Var.f41749r;
        ea0 ea0Var = this.f38862c;
        int i7 = this.f38858a;
        if (i7 == 1) {
            org.telegram.messenger.hj hjVar = jjVar.f24893b;
            if (hjVar == null) {
                size = 0;
            } else {
                size = hjVar.f24485g.size();
            }
            ea0Var.b(org.telegram.messenger.gd.G(size, "PreviewForwardMessagesCount", new Object[0]), z10);
            if (!jjVar.h) {
                if (jjVar.f24902m) {
                    if (user != null) {
                        N0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                    } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                        N0 = org.telegram.messenger.gd.N0(2131750561, null);
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131750560, null);
                    }
                } else if (user != null) {
                    N0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                    N0 = org.telegram.messenger.gd.N0(2131750564, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131750563, null);
                }
            } else if (!jjVar.f24900k) {
                if (user != null) {
                    N0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                    N0 = org.telegram.messenger.gd.N0(2131750561, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131750560, null);
                }
            } else if (user != null) {
                N0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameHidden", null, 2131750565, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                N0 = org.telegram.messenger.gd.N0(2131750564, null);
            } else {
                N0 = org.telegram.messenger.gd.N0(2131750563, null);
            }
            ea0Var.a(N0, z10);
        } else if (i7 == 0) {
            if (jjVar.d != null && jjVar.f24892a.f24487j) {
                ea0Var.b(org.telegram.messenger.gd.N0(2131746686, null), z10);
                ea0Var.a(org.telegram.messenger.gd.N0(2131746685, null), z10);
                return;
            }
            ea0Var.b(org.telegram.messenger.gd.N0(2131748352, null), z10);
            if (jjVar.f24892a.f24487j) {
                str = org.telegram.messenger.gd.N0(2131748353, null);
            } else {
                str = "";
            }
            ea0Var.a(str, z10);
        } else if (i7 == 2) {
            ea0Var.b(org.telegram.messenger.gd.N0(2131748355, null), z10);
            ea0Var.a(org.telegram.messenger.gd.N0(2131748356, null), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38858a == 0) {
            org.telegram.messenger.g0.d0(this.f38866f, new z2(this, 9));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f38863c0 = true;
        this.L = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        j();
        this.L = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int size;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        wa0 wa0Var = this.f38864d0;
        wa0Var.f41751w = z10;
        this.f38859a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f38869s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.f38859a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.f38859a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f38866f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = wa0Var.f41751w;
        org.telegram.ui.w8 w8Var = this.f38860b;
        if (z11) {
            w8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            w8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = 0;
            w8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.f38859a0;
            if (w8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                w8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            w8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - w8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.f38861b0 != size2) {
            for (int i12 = 0; i12 < this.f38868r.f24484f.size(); i12++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f38868r.f24484f.get(i12);
                if (wa0Var.f41751w) {
                    size = w8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                }
                fjVar.d2 = size;
                fjVar.S1 = false;
                fjVar.M1 = true;
                org.telegram.ui.y7 y7Var = this.f38867n;
                if (y7Var != null) {
                    y7Var.f();
                }
            }
            this.L = true;
        }
        this.f38861b0 = size2;
        super.onMeasure(i7, i10);
    }
}
