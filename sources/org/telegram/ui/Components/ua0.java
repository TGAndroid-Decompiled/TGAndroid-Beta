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
    public final int f30910a;
    public int f30911a0;
    public final org.telegram.ui.w8 f30912b;
    public boolean f30913b0;
    public final ia0 f30914c;
    public final ab0 f30915c0;
    public final org.telegram.ui.Cells.v9 d;
    public final oa0 e;
    public final ag.b1 f30916f;
    public final qa0 h;
    public final org.telegram.ui.x7 f30917n;
    public org.telegram.messenger.mj f30918r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f30919s;
    public final na0 f30920w;
    public final na0 f30921x;
    public final org.telegram.ui.ActionBar.b1 f30922y;

    public ua0(org.telegram.ui.Components.ab0 r36, android.content.Context r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.<init>(org.telegram.ui.Components.ab0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.fj a(ua0 ua0Var, org.telegram.messenger.kj kjVar) {
        if (kjVar.d1() != 0) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) ua0Var.f30918r.d.get(kjVar.d1());
            if (fjVar == null || (fjVar.d.size() > 1 && fjVar.d(kjVar) != null)) {
                return fjVar;
            }
            return null;
        }
        return null;
    }

    public static void b(ua0 ua0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (ua0Var.f30910a == 2) {
            org.telegram.messenger.oj ojVar = ua0Var.f30915c0.d;
            if (!ojVar.f17461n && (uRLSpan = ojVar.f17469w) != null && (webPage = ojVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.m3(uRLSpan);
                return;
            }
        }
        q1Var.m3(null);
    }

    public final org.telegram.messenger.kj c(org.telegram.messenger.kj kjVar) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.oj ojVar = this.f30915c0.d;
        org.telegram.messenger.mj mjVar = ojVar.f17451a;
        if (mjVar != null) {
            LongSparseArray longSparseArray = mjVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (fjVar = (org.telegram.messenger.fj) ojVar.f17451a.d.valueAt(0)) != null) {
                if (fjVar.f15740i) {
                    if (kjVar != null) {
                        return kjVar;
                    }
                    org.telegram.ui.kn knVar = ojVar.d;
                    if (knVar != null) {
                        return knVar.f38931a;
                    }
                }
                return fjVar.h;
            }
            return (org.telegram.messenger.kj) ojVar.f17451a.e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.kj c10;
        if (q1Var != null && q1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (q1Var.getMessageObject() == c10 || q1Var.getMessageObject().f1() == c10.f1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.f30915c0.f24343w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30919s;
        ia0 ia0Var = this.f30914c;
        org.telegram.ui.w8 w8Var = this.f30912b;
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
        ab0 ab0Var = this.f30915c0;
        new cc(ab0Var, ab0Var.F).I(2131624011, org.telegram.messenger.dd.L0(2131746452, null), org.telegram.messenger.dd.L0(2131746451, null)).j();
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
        if (this.f30915c0.f24337b) {
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
            org.telegram.ui.ActionBar.b1 b1Var2 = this.f30922y;
            na0 na0Var = this.f30921x;
            na0 na0Var2 = this.f30920w;
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
        ab0 ab0Var = this.f30915c0;
        org.telegram.messenger.oj ojVar = ab0Var.d;
        qa0 qa0Var = this.h;
        if (qa0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f30918r.f17133f.size(); i11++) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.f30918r.f17133f.get(i11);
            kjVar.K1 = true;
            kjVar.f16672f2 = ab0Var.f24336a;
            if (!ojVar.f17458k) {
                kjVar.f16690k.flags |= 4;
                kjVar.f16667e2 = false;
            } else {
                kjVar.f16690k.flags &= -5;
                kjVar.f16667e2 = true;
            }
            if (this.f30910a == 2) {
                TLRPC.WebPage webPage = ojVar.v;
                if (webPage != null && ((messageMedia = (message = kjVar.f16690k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = kjVar.f16690k.media;
                    messageMedia2.webpage = ojVar.v;
                    boolean z10 = ojVar.f17464q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    kjVar.f16743y = null;
                    kjVar.o0();
                    kjVar.f16701n0 = null;
                    kjVar.f16705o0 = null;
                    kjVar.f16695l0 = null;
                    kjVar.m0 = null;
                    kjVar.r0(true);
                    kjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = kjVar.f16690k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (ojVar.f17459l) {
                kjVar.f16747z = null;
            } else {
                kjVar.k0();
            }
            if (kjVar.T3()) {
                org.telegram.messenger.nj njVar = (org.telegram.messenger.nj) kjVar.f16690k.media;
                TLRPC.PollResults pollResults = njVar.results;
                if (ojVar.f17459l) {
                    i10 = 0;
                } else {
                    i10 = njVar.f17303a;
                }
                pollResults.total_voters = i10;
            }
        }
        for (int i12 = 0; i12 < this.f30918r.h.size(); i12++) {
            ((TLRPC.PollAnswerVoters) this.f30918r.h.get(i12)).chosen = !ojVar.f17458k;
        }
        for (int i13 = 0; i13 < this.f30918r.d.size(); i13++) {
            qa0Var.V((org.telegram.messenger.fj) this.f30918r.d.valueAt(i13));
        }
        this.f30917n.k(0, this.f30918r.f17133f.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        ab0 ab0Var = this.f30915c0;
        boolean z10 = ab0Var.f24343w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30919s;
        ag.b1 b1Var = this.f30916f;
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
            org.telegram.messenger.mj mjVar = this.f30918r;
            if (mjVar != null && i12 != 0 && i12 <= mjVar.f17133f.size()) {
                int d = i0.a.d(4.0f, measuredHeight, 0);
                this.R = d;
                int measuredHeight2 = (b1Var.getMeasuredHeight() - this.R) + d;
                int i14 = org.telegram.messenger.i0.f16172q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = org.telegram.messenger.i0.f16167n;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - org.telegram.messenger.i0.L(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float B = c3.i0.B(getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f), (this.f30912b.getMeasuredHeight() - this.R) + (this.W - org.telegram.messenger.i0.L(8.0f)), 2.0f, org.telegram.messenger.i0.L(8.0f)) - this.R;
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
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.kj kjVar2;
        ab0 ab0Var = this.f30915c0;
        org.telegram.messenger.oj ojVar = ab0Var.d;
        if (this.f30910a == 0) {
            oa0 oa0Var = this.e;
            if (oa0Var.v - oa0Var.f23444u <= org.telegram.messenger.wp.r1(ab0Var.f24344x).f19214p4) {
                org.telegram.ui.Cells.r9 r9Var = oa0Var.W;
                if (r9Var != null) {
                    kjVar = ((org.telegram.ui.Cells.q1) r9Var).getMessageObject();
                } else {
                    kjVar = null;
                }
                org.telegram.messenger.kj c10 = c(kjVar);
                if (ojVar.d != null && oa0Var.x()) {
                    ojVar.e = oa0Var.f23444u;
                    ojVar.f17454f = oa0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.kn knVar = ojVar.d;
                        if (knVar.f38940m || (kjVar2 = knVar.f38931a) == null || kjVar2.f1() != c10.f1()) {
                            ojVar.d = org.telegram.ui.kn.b(ojVar.e, ojVar.f17454f, c10);
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
        ab0 ab0Var = this.f30915c0;
        TLRPC.User user = ab0Var.f24340n;
        org.telegram.messenger.oj ojVar = ab0Var.d;
        TLRPC.Chat chat = ab0Var.f24341r;
        ia0 ia0Var = this.f30914c;
        int i10 = this.f30910a;
        if (i10 == 1) {
            org.telegram.messenger.mj mjVar = ojVar.f17452b;
            if (mjVar == null) {
                size = 0;
            } else {
                size = mjVar.f17134g.size();
            }
            ia0Var.b(org.telegram.messenger.dd.G(size, "PreviewForwardMessagesCount", new Object[0]), z10);
            if (!ojVar.h) {
                if (ojVar.f17460m) {
                    if (user != null) {
                        L0 = org.telegram.messenger.dd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                    } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                        L0 = org.telegram.messenger.dd.L0(2131750580, null);
                    } else {
                        L0 = org.telegram.messenger.dd.L0(2131750579, null);
                    }
                } else if (user != null) {
                    L0 = org.telegram.messenger.dd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                    L0 = org.telegram.messenger.dd.L0(2131750583, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131750582, null);
                }
            } else if (!ojVar.f17458k) {
                if (user != null) {
                    L0 = org.telegram.messenger.dd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                    L0 = org.telegram.messenger.dd.L0(2131750580, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131750579, null);
                }
            } else if (user != null) {
                L0 = org.telegram.messenger.dd.a0("ForwardPreviewSendersNameHidden", null, 2131750584, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                L0 = org.telegram.messenger.dd.L0(2131750583, null);
            } else {
                L0 = org.telegram.messenger.dd.L0(2131750582, null);
            }
            ia0Var.a(L0, z10);
        } else if (i10 == 0) {
            if (ojVar.d != null && ojVar.f17451a.f17136j) {
                ia0Var.b(org.telegram.messenger.dd.L0(2131746895, null), z10);
                ia0Var.a(org.telegram.messenger.dd.L0(2131746894, null), z10);
                return;
            }
            ia0Var.b(org.telegram.messenger.dd.L0(2131748560, null), z10);
            if (ojVar.f17451a.f17136j) {
                str = org.telegram.messenger.dd.L0(2131748561, null);
            } else {
                str = "";
            }
            ia0Var.a(str, z10);
        } else if (i10 == 2) {
            ia0Var.b(org.telegram.messenger.dd.L0(2131748563, null), z10);
            ia0Var.a(org.telegram.messenger.dd.L0(2131748564, null), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30910a == 0) {
            org.telegram.messenger.i0.d0(this.f30916f, new r2(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f30913b0 = true;
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
        ab0 ab0Var = this.f30915c0;
        ab0Var.f24343w = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30919s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f30916f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        boolean z11 = ab0Var.f24343w;
        org.telegram.ui.w8 w8Var = this.f30912b;
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
        if (this.f30911a0 != size2) {
            for (int i13 = 0; i13 < this.f30918r.f17133f.size(); i13++) {
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.f30918r.f17133f.get(i13);
                if (ab0Var.f24343w) {
                    size = w8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(16.0f);
                }
                kjVar.f16654b2 = size;
                kjVar.Q1 = false;
                kjVar.K1 = true;
                org.telegram.ui.x7 x7Var = this.f30917n;
                if (x7Var != null) {
                    x7Var.f();
                }
            }
            this.K = true;
        }
        this.f30911a0 = size2;
        super.onMeasure(i10, i11);
    }
}
