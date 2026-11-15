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
public final class da0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.z0 E;
    public final ia0 F;
    public final FrameLayout G;
    public final ia0 H;
    public final ia0 I;
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
    public final int f33894a;
    public int f33895a0;
    public final org.telegram.ui.v8 f33896b;
    public int f33897b0;
    public final r90 f33898c;
    public boolean f33899c0;
    public final org.telegram.ui.Cells.t9 d;
    public final ja0 f33900d0;
    public final x90 f33901e;
    public final di.c1 f33902f;
    public final z90 h;
    public final org.telegram.ui.y7 f33903n;
    public org.telegram.messenger.ij f33904r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33905s;
    public final w90 f33906w;
    public final w90 f33907x;
    public final org.telegram.ui.ActionBar.z0 f33908y;

    public da0(org.telegram.ui.Components.ja0 r40, android.content.Context r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.<init>(org.telegram.ui.Components.ja0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.bj a(da0 da0Var, org.telegram.messenger.gj gjVar) {
        if (gjVar.c1() != 0) {
            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) da0Var.f33904r.d.get(gjVar.c1());
            if (bjVar == null || (bjVar.d.size() > 1 && bjVar.d(gjVar) != null)) {
                return bjVar;
            }
            return null;
        }
        return null;
    }

    public static void b(da0 da0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (da0Var.f33894a == 2) {
            org.telegram.messenger.kj kjVar = da0Var.f33900d0.d;
            if (!kjVar.f24714n && (uRLSpan = kjVar.f24722w) != null && (webPage = kjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.r3(uRLSpan);
                return;
            }
        }
        q1Var.r3(null);
    }

    public final org.telegram.messenger.gj c(org.telegram.messenger.gj gjVar) {
        org.telegram.messenger.bj bjVar;
        org.telegram.messenger.kj kjVar = this.f33900d0.d;
        org.telegram.messenger.ij ijVar = kjVar.f24703a;
        if (ijVar != null) {
            LongSparseArray longSparseArray = ijVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (bjVar = (org.telegram.messenger.bj) kjVar.f24703a.d.valueAt(0)) != null) {
                if (bjVar.f22713i) {
                    if (gjVar != null) {
                        return gjVar;
                    }
                    org.telegram.ui.qm qmVar = kjVar.d;
                    if (qmVar != null) {
                        return qmVar.f50643a;
                    }
                }
                return bjVar.h;
            }
            return (org.telegram.messenger.gj) kjVar.f24703a.f24403e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj c10;
        if (q1Var != null && q1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (q1Var.getMessageObject() == c10 || q1Var.getMessageObject().e1() == c10.e1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f10, int i7) {
        boolean z10 = this.f33900d0.f35956w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f33905s;
        r90 r90Var = this.f33898c;
        org.telegram.ui.v8 v8Var = this.f33896b;
        if (z10) {
            r90Var.setTranslationY(0.0f);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            r90Var.setTranslationY(i7);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + v8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = v8Var.getX();
        org.telegram.ui.Cells.t9 t9Var = this.d;
        t9Var.setTranslationX(x10);
        t9Var.setTranslationY(v8Var.getY());
    }

    public final void g() {
        ja0 ja0Var = this.f33900d0;
        new cc(ja0Var, ja0Var.G).I(2131624012, org.telegram.messenger.hd.M0(2131746437, null), org.telegram.messenger.hd.M0(2131746436, null)).j();
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
        if (this.f33900d0.f35949b) {
            z10 = false;
        }
        if (!z11 || this.P != z10) {
            this.P = z10;
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Q = null;
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.E;
            org.telegram.ui.ActionBar.z0 z0Var2 = this.f33908y;
            w90 w90Var = this.f33907x;
            w90 w90Var2 = this.f33906w;
            float f16 = 0.0f;
            if (z11) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (w90Var2 != null) {
                    w90Var2.setVisibility(0);
                    if (!z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w90Var2, property, f15));
                }
                if (w90Var != null) {
                    w90Var.setVisibility(0);
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w90Var, property, f14));
                }
                if (z0Var2 != null) {
                    z0Var2.setVisibility(0);
                    if (!z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(z0Var2, property, f13));
                }
                if (z0Var != null) {
                    z0Var.setVisibility(0);
                    if (z10) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(z0Var, property, f16));
                }
                this.Q.playTogether(arrayList);
                this.Q.setDuration(360L);
                this.Q.setInterpolator(er.h);
                this.Q.addListener(new org.telegram.ui.nn(16, this, z10));
                this.Q.start();
                return;
            }
            if (w90Var2 != null) {
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                w90Var2.setAlpha(f12);
                if (!z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                w90Var2.setVisibility(i11);
            }
            if (w90Var != null) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w90Var.setAlpha(f11);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                w90Var.setVisibility(i10);
            }
            if (z0Var2 != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z0Var2.setAlpha(f10);
                if (!z10) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                z0Var2.setVisibility(i7);
            }
            if (z0Var != null) {
                if (z10) {
                    f16 = 1.0f;
                }
                z0Var.setAlpha(f16);
                if (!z10) {
                    i12 = 4;
                }
                z0Var.setVisibility(i12);
            }
        }
    }

    public final void i() {
        int i7;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ja0 ja0Var = this.f33900d0;
        org.telegram.messenger.kj kjVar = ja0Var.d;
        z90 z90Var = this.h;
        if (z90Var.k()) {
            this.W = true;
            return;
        }
        for (int i10 = 0; i10 < this.f33904r.f24404f.size(); i10++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f33904r.f24404f.get(i10);
            gjVar.M1 = true;
            gjVar.f23806h2 = ja0Var.f35948a;
            if (!kjVar.f24711k) {
                gjVar.f23817k.flags |= 4;
                gjVar.f23802g2 = false;
            } else {
                gjVar.f23817k.flags &= -5;
                gjVar.f23802g2 = true;
            }
            if (this.f33894a == 2) {
                TLRPC.WebPage webPage = kjVar.v;
                if (webPage != null && ((messageMedia = (message = gjVar.f23817k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = gjVar.f23817k.media;
                    messageMedia2.webpage = kjVar.v;
                    boolean z10 = kjVar.f24717q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    gjVar.f23871y = null;
                    gjVar.o0();
                    gjVar.f23837p0 = null;
                    gjVar.f23841q0 = null;
                    gjVar.f23830n0 = null;
                    gjVar.f23833o0 = null;
                    gjVar.r0(true);
                    gjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = gjVar.f23817k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (kjVar.f24712l) {
                gjVar.f23875z = null;
            } else {
                gjVar.k0();
            }
            if (gjVar.T3()) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) gjVar.f23817k.media;
                TLRPC.PollResults pollResults = jjVar.results;
                if (kjVar.f24712l) {
                    i7 = 0;
                } else {
                    i7 = jjVar.f24564a;
                }
                pollResults.total_voters = i7;
            }
        }
        for (int i11 = 0; i11 < this.f33904r.h.size(); i11++) {
            ((TLRPC.PollAnswerVoters) this.f33904r.h.get(i11)).chosen = !kjVar.f24711k;
        }
        for (int i12 = 0; i12 < this.f33904r.d.size(); i12++) {
            z90Var.V((org.telegram.messenger.bj) this.f33904r.d.valueAt(i12));
        }
        this.f33903n.k(0, this.f33904r.f24404f.size());
    }

    public final void j() {
        int i7 = this.S;
        float f10 = this.T;
        ja0 ja0Var = this.f33900d0;
        boolean z10 = ja0Var.f35956w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f33905s;
        di.c1 c1Var = this.f33902f;
        int i10 = 0;
        if (!z10) {
            int measuredHeight = c1Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < c1Var.getChildCount(); i12++) {
                View childAt = c1Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            org.telegram.messenger.ij ijVar = this.f33904r;
            if (ijVar != null && i11 != 0 && i11 <= ijVar.f24404f.size()) {
                int d = i5.c.d(4.0f, measuredHeight, 0);
                this.S = d;
                int measuredHeight2 = (c1Var.getMeasuredHeight() - this.S) + d;
                int i13 = org.telegram.messenger.g0.f23609q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i10 = org.telegram.messenger.g0.f23604n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i13 - i10) * 0.8f) - this.f33895a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.f33896b.getMeasuredHeight() - this.S) + (this.f33895a0 - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.S;
            this.T = A;
            if (A > org.telegram.messenger.g0.L(8.0f)) {
                this.T = org.telegram.messenger.g0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + c1Var.getMeasuredWidth());
        }
        boolean z11 = this.L;
        if (!z11 && (this.S != i7 || this.T != f10)) {
            ValueAnimator valueAnimator = ja0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ja0Var.h = ofFloat;
            ofFloat.addUpdateListener(new oj(this, i7, f10, 1));
            ja0Var.h.setDuration(250L);
            ja0Var.h.setInterpolator(pi.k.V);
            ja0Var.h.addListener(new h60(this, 4));
            org.telegram.messenger.g0.i3(ja0Var.E, 50L);
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
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        ja0 ja0Var = this.f33900d0;
        org.telegram.messenger.kj kjVar = ja0Var.d;
        if (this.f33894a == 0) {
            x90 x90Var = this.f33901e;
            if (x90Var.v - x90Var.f31767u <= org.telegram.messenger.np.s1(ja0Var.f35957x).f25361p4) {
                org.telegram.ui.Cells.p9 p9Var = x90Var.W;
                if (p9Var != null) {
                    gjVar = ((org.telegram.ui.Cells.q1) p9Var).getMessageObject();
                } else {
                    gjVar = null;
                }
                org.telegram.messenger.gj c10 = c(gjVar);
                if (kjVar.d != null && x90Var.x()) {
                    kjVar.f24706e = x90Var.f31767u;
                    kjVar.f24707f = x90Var.v;
                    if (c10 != null) {
                        org.telegram.ui.qm qmVar = kjVar.d;
                        if (qmVar.f50653m || (gjVar2 = qmVar.f50643a) == null || gjVar2.e1() != c10.e1()) {
                            kjVar.d = org.telegram.ui.qm.b(kjVar.f24706e, kjVar.f24707f, c10);
                            ja0Var.b();
                        }
                    }
                }
                x90Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String M0;
        ja0 ja0Var = this.f33900d0;
        TLRPC.User user = ja0Var.f35953n;
        org.telegram.messenger.kj kjVar = ja0Var.d;
        TLRPC.Chat chat = ja0Var.f35954r;
        r90 r90Var = this.f33898c;
        int i7 = this.f33894a;
        if (i7 == 1) {
            org.telegram.messenger.ij ijVar = kjVar.f24704b;
            if (ijVar == null) {
                size = 0;
            } else {
                size = ijVar.f24405g.size();
            }
            r90Var.b(org.telegram.messenger.hd.G(size, "PreviewForwardMessagesCount", new Object[0]), z10);
            if (!kjVar.h) {
                if (kjVar.f24713m) {
                    if (user != null) {
                        M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                    } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                        M0 = org.telegram.messenger.hd.M0(2131750578, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131750577, null);
                    }
                } else if (user != null) {
                    M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.hd.M0(2131750581, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131750580, null);
                }
            } else if (!kjVar.f24711k) {
                if (user != null) {
                    M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.hd.M0(2131750578, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131750577, null);
                }
            } else if (user != null) {
                M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameHidden", null, 2131750582, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
            } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                M0 = org.telegram.messenger.hd.M0(2131750581, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131750580, null);
            }
            r90Var.a(M0, z10);
        } else if (i7 == 0) {
            if (kjVar.d != null && kjVar.f24703a.f24407j) {
                r90Var.b(org.telegram.messenger.hd.M0(2131746880, null), z10);
                r90Var.a(org.telegram.messenger.hd.M0(2131746879, null), z10);
                return;
            }
            r90Var.b(org.telegram.messenger.hd.M0(2131748545, null), z10);
            if (kjVar.f24703a.f24407j) {
                str = org.telegram.messenger.hd.M0(2131748546, null);
            } else {
                str = "";
            }
            r90Var.a(str, z10);
        } else if (i7 == 2) {
            r90Var.b(org.telegram.messenger.hd.M0(2131748548, null), z10);
            r90Var.a(org.telegram.messenger.hd.M0(2131748549, null), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33894a == 0) {
            org.telegram.messenger.g0.d0(this.f33902f, new q2(this, 9));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f33899c0 = true;
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
        ja0 ja0Var = this.f33900d0;
        ja0Var.f35956w = z10;
        this.f33895a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f33905s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.f33895a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.f33895a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f33902f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = ja0Var.f35956w;
        org.telegram.ui.v8 v8Var = this.f33896b;
        if (z11) {
            v8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            v8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = 0;
            v8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.f33895a0;
            if (v8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                v8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            v8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - v8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.f33897b0 != size2) {
            for (int i12 = 0; i12 < this.f33904r.f24404f.size(); i12++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f33904r.f24404f.get(i12);
                if (ja0Var.f35956w) {
                    size = v8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                }
                gjVar.d2 = size;
                gjVar.S1 = false;
                gjVar.M1 = true;
                org.telegram.ui.y7 y7Var = this.f33903n;
                if (y7Var != null) {
                    y7Var.f();
                }
            }
            this.L = true;
        }
        this.f33897b0 = size2;
        super.onMeasure(i7, i10);
    }
}
