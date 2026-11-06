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
public final class ca0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.z0 D;
    public final ha0 E;
    public final FrameLayout F;
    public final ha0 G;
    public final ha0 H;
    public final int I;
    public final h6.m J;
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
    public final int f32498a;
    public int f32499a0;
    public final org.telegram.ui.v8 f32500b;
    public boolean f32501b0;
    public final p90 f32502c;
    public final ia0 f32503c0;
    public final org.telegram.ui.Cells.u9 d;
    public final w90 f32504e;
    public final bi.q1 f32505f;
    public final y90 h;
    public final org.telegram.ui.x7 f32506n;
    public org.telegram.messenger.kj f32507r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f32508s;
    public final v90 f32509w;
    public final v90 f32510x;
    public final org.telegram.ui.ActionBar.z0 f32511y;

    public ca0(org.telegram.ui.Components.ia0 r38, android.content.Context r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca0.<init>(org.telegram.ui.Components.ia0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.dj a(ca0 ca0Var, org.telegram.messenger.ij ijVar) {
        if (ijVar.d1() != 0) {
            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) ca0Var.f32507r.d.get(ijVar.d1());
            if (djVar == null || (djVar.d.size() > 1 && djVar.d(ijVar) != null)) {
                return djVar;
            }
            return null;
        }
        return null;
    }

    public static void b(ca0 ca0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (ca0Var.f32498a == 2) {
            org.telegram.messenger.mj mjVar = ca0Var.f32503c0.d;
            if (!mjVar.f24029n && (uRLSpan = mjVar.f24037w) != null && (webPage = mjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.p3(uRLSpan);
                return;
            }
        }
        q1Var.p3(null);
    }

    public final org.telegram.messenger.ij c(org.telegram.messenger.ij ijVar) {
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.mj mjVar = this.f32503c0.d;
        org.telegram.messenger.kj kjVar = mjVar.f24018a;
        if (kjVar != null) {
            LongSparseArray longSparseArray = kjVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (djVar = (org.telegram.messenger.dj) mjVar.f24018a.d.valueAt(0)) != null) {
                if (djVar.f22008i) {
                    if (ijVar != null) {
                        return ijVar;
                    }
                    org.telegram.ui.qm qmVar = mjVar.d;
                    if (qmVar != null) {
                        return qmVar.f49236a;
                    }
                }
                return djVar.h;
            }
            return (org.telegram.messenger.ij) mjVar.f24018a.f23689e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca0.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij c10;
        if (q1Var != null && q1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (q1Var.getMessageObject() == c10 || q1Var.getMessageObject().f1() == c10.f1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f10, int i7) {
        boolean z9 = this.f32503c0.f34583w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f32508s;
        p90 p90Var = this.f32502c;
        org.telegram.ui.v8 v8Var = this.f32500b;
        if (z9) {
            p90Var.setTranslationY(0.0f);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            p90Var.setTranslationY(i7);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + v8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = v8Var.getX();
        org.telegram.ui.Cells.u9 u9Var = this.d;
        u9Var.setTranslationX(x10);
        u9Var.setTranslationY(v8Var.getY());
    }

    public final void g() {
        ia0 ia0Var = this.f32503c0;
        new hc(ia0Var, ia0Var.F).I(2131624011, org.telegram.messenger.hd.M0(2131746436, null), org.telegram.messenger.hd.M0(2131746435, null)).j();
    }

    public final void h(boolean z9, boolean z10) {
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
        if (this.f32503c0.f34576b) {
            z9 = false;
        }
        if (!z10 || this.O != z9) {
            this.O = z9;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.D;
            org.telegram.ui.ActionBar.z0 z0Var2 = this.f32511y;
            v90 v90Var = this.f32510x;
            v90 v90Var2 = this.f32509w;
            float f16 = 0.0f;
            if (z10) {
                this.P = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (v90Var2 != null) {
                    v90Var2.setVisibility(0);
                    if (!z9) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v90Var2, property, f15));
                }
                if (v90Var != null) {
                    v90Var.setVisibility(0);
                    if (z9) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v90Var, property, f14));
                }
                if (z0Var2 != null) {
                    z0Var2.setVisibility(0);
                    if (!z9) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(z0Var2, property, f13));
                }
                if (z0Var != null) {
                    z0Var.setVisibility(0);
                    if (z9) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(z0Var, property, f16));
                }
                this.P.playTogether(arrayList);
                this.P.setDuration(360L);
                this.P.setInterpolator(xq.h);
                this.P.addListener(new t9(15, this, z9));
                this.P.start();
                return;
            }
            if (v90Var2 != null) {
                if (!z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                v90Var2.setAlpha(f12);
                if (!z9) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                v90Var2.setVisibility(i11);
            }
            if (v90Var != null) {
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                v90Var.setAlpha(f11);
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                v90Var.setVisibility(i10);
            }
            if (z0Var2 != null) {
                if (!z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z0Var2.setAlpha(f10);
                if (!z9) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                z0Var2.setVisibility(i7);
            }
            if (z0Var != null) {
                if (z9) {
                    f16 = 1.0f;
                }
                z0Var.setAlpha(f16);
                if (!z9) {
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
        ia0 ia0Var = this.f32503c0;
        org.telegram.messenger.mj mjVar = ia0Var.d;
        y90 y90Var = this.h;
        if (y90Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.f32507r.f23690f.size(); i10++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f32507r.f23690f.get(i10);
            ijVar.K1 = true;
            ijVar.f23217f2 = ia0Var.f34575a;
            if (!mjVar.f24026k) {
                ijVar.f23237k.flags |= 4;
                ijVar.f23212e2 = false;
            } else {
                ijVar.f23237k.flags &= -5;
                ijVar.f23212e2 = true;
            }
            if (this.f32498a == 2) {
                TLRPC.WebPage webPage = mjVar.v;
                if (webPage != null && ((messageMedia = (message = ijVar.f23237k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = ijVar.f23237k.media;
                    messageMedia2.webpage = mjVar.v;
                    boolean z9 = mjVar.f24032q;
                    messageMedia2.force_large_media = !z9;
                    messageMedia2.force_small_media = z9;
                    messageMedia2.manual = true;
                    ijVar.f23289y = null;
                    ijVar.o0();
                    ijVar.f23248n0 = null;
                    ijVar.f23251o0 = null;
                    ijVar.f23242l0 = null;
                    ijVar.m0 = null;
                    ijVar.r0(true);
                    ijVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = ijVar.f23237k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (mjVar.f24027l) {
                ijVar.f23293z = null;
            } else {
                ijVar.k0();
            }
            if (ijVar.U3()) {
                org.telegram.messenger.lj ljVar = (org.telegram.messenger.lj) ijVar.f23237k.media;
                TLRPC.PollResults pollResults = ljVar.results;
                if (mjVar.f24027l) {
                    i7 = 0;
                } else {
                    i7 = ljVar.f23892a;
                }
                pollResults.total_voters = i7;
            }
        }
        for (int i11 = 0; i11 < this.f32507r.h.size(); i11++) {
            ((TLRPC.PollAnswerVoters) this.f32507r.h.get(i11)).chosen = !mjVar.f24026k;
        }
        for (int i12 = 0; i12 < this.f32507r.d.size(); i12++) {
            y90Var.V((org.telegram.messenger.dj) this.f32507r.d.valueAt(i12));
        }
        this.f32506n.k(0, this.f32507r.f23690f.size());
    }

    public final void j() {
        int i7 = this.R;
        float f10 = this.S;
        ia0 ia0Var = this.f32503c0;
        boolean z9 = ia0Var.f34583w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f32508s;
        bi.q1 q1Var = this.f32505f;
        int i10 = 0;
        if (!z9) {
            int measuredHeight = q1Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < q1Var.getChildCount(); i12++) {
                View childAt = q1Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            org.telegram.messenger.kj kjVar = this.f32507r;
            if (kjVar != null && i11 != 0 && i11 <= kjVar.f23690f.size()) {
                int e10 = jg.g.e(4.0f, measuredHeight, 0);
                this.R = e10;
                int measuredHeight2 = (q1Var.getMeasuredHeight() - this.R) + e10;
                int i13 = org.telegram.messenger.g0.f22537q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i10 = org.telegram.messenger.g0.f22532n;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i13 - i10) * 0.8f) - this.W) - org.telegram.messenger.g0.L(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.f32500b.getMeasuredHeight() - this.R) + (this.W - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.R;
            this.S = A;
            if (A > org.telegram.messenger.g0.L(8.0f)) {
                this.S = org.telegram.messenger.g0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + q1Var.getMeasuredWidth());
        }
        boolean z10 = this.K;
        if (!z10 && (this.R != i7 || this.S != f10)) {
            ValueAnimator valueAnimator = ia0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ia0Var.h = ofFloat;
            ofFloat.addUpdateListener(new hj(this, i7, f10, 1));
            ia0Var.h.setDuration(250L);
            ia0Var.h.setInterpolator(mi.l.V);
            ia0Var.h.addListener(new e60(this, 4));
            org.telegram.messenger.g0.i3(ia0Var.D, 50L);
            this.T = i7;
            f(f10, i7);
        } else if (z10) {
            float f11 = this.S;
            int i14 = this.R;
            this.T = i14;
            f(f11, i14);
        }
    }

    public final void k() {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        ia0 ia0Var = this.f32503c0;
        org.telegram.messenger.mj mjVar = ia0Var.d;
        if (this.f32498a == 0) {
            w90 w90Var = this.f32504e;
            if (w90Var.v - w90Var.f30675u <= org.telegram.messenger.qp.s1(ia0Var.f34584x).o4) {
                org.telegram.ui.Cells.q9 q9Var = w90Var.W;
                if (q9Var != null) {
                    ijVar = ((org.telegram.ui.Cells.q1) q9Var).getMessageObject();
                } else {
                    ijVar = null;
                }
                org.telegram.messenger.ij c10 = c(ijVar);
                if (mjVar.d != null && w90Var.x()) {
                    mjVar.f24021e = w90Var.f30675u;
                    mjVar.f24022f = w90Var.v;
                    if (c10 != null) {
                        org.telegram.ui.qm qmVar = mjVar.d;
                        if (qmVar.f49246m || (ijVar2 = qmVar.f49236a) == null || ijVar2.f1() != c10.f1()) {
                            mjVar.d = org.telegram.ui.qm.b(mjVar.f24021e, mjVar.f24022f, c10);
                            ia0Var.b();
                        }
                    }
                }
                w90Var.f(false);
            }
        }
    }

    public final void l(boolean z9) {
        String str;
        int size;
        String M0;
        ia0 ia0Var = this.f32503c0;
        TLRPC.User user = ia0Var.f34580n;
        org.telegram.messenger.mj mjVar = ia0Var.d;
        TLRPC.Chat chat = ia0Var.f34581r;
        p90 p90Var = this.f32502c;
        int i7 = this.f32498a;
        if (i7 == 1) {
            org.telegram.messenger.kj kjVar = mjVar.f24019b;
            if (kjVar == null) {
                size = 0;
            } else {
                size = kjVar.f23691g.size();
            }
            p90Var.b(org.telegram.messenger.hd.G(size, "PreviewForwardMessagesCount", new Object[0]), z9);
            if (!mjVar.h) {
                if (mjVar.f24028m) {
                    if (user != null) {
                        M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                    } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                        M0 = org.telegram.messenger.hd.M0(2131750579, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131750578, null);
                    }
                } else if (user != null) {
                    M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.hd.M0(2131750582, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131750581, null);
                }
            } else if (!mjVar.f24026k) {
                if (user != null) {
                    M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.hd.M0(2131750579, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131750578, null);
                }
            } else if (user != null) {
                M0 = org.telegram.messenger.hd.a0("ForwardPreviewSendersNameHidden", null, 2131750583, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
            } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                M0 = org.telegram.messenger.hd.M0(2131750582, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131750581, null);
            }
            p90Var.a(M0, z9);
        } else if (i7 == 0) {
            if (mjVar.d != null && mjVar.f24018a.f23693j) {
                p90Var.b(org.telegram.messenger.hd.M0(2131746879, null), z9);
                p90Var.a(org.telegram.messenger.hd.M0(2131746878, null), z9);
                return;
            }
            p90Var.b(org.telegram.messenger.hd.M0(2131748544, null), z9);
            if (mjVar.f24018a.f23693j) {
                str = org.telegram.messenger.hd.M0(2131748545, null);
            } else {
                str = "";
            }
            p90Var.a(str, z9);
        } else if (i7 == 2) {
            p90Var.b(org.telegram.messenger.hd.M0(2131748547, null), z9);
            p90Var.a(org.telegram.messenger.hd.M0(2131748548, null), z9);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32498a == 0) {
            org.telegram.messenger.g0.d0(this.f32505f, new s2(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f32501b0 = true;
        this.K = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        j();
        this.K = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        int size;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia0 ia0Var = this.f32503c0;
        ia0Var.f34583w = z9;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f32508s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f32505f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z10 = ia0Var.f34583w;
        org.telegram.ui.v8 v8Var = this.f32500b;
        if (z10) {
            v8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            v8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = 0;
            v8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.W;
            if (v8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                v8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            v8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - v8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.f32499a0 != size2) {
            for (int i12 = 0; i12 < this.f32507r.f23690f.size(); i12++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f32507r.f23690f.get(i12);
                if (ia0Var.f34583w) {
                    size = v8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                }
                ijVar.f23199b2 = size;
                ijVar.Q1 = false;
                ijVar.K1 = true;
                org.telegram.ui.x7 x7Var = this.f32506n;
                if (x7Var != null) {
                    x7Var.f();
                }
            }
            this.K = true;
        }
        this.f32499a0 = size2;
        super.onMeasure(i7, i10);
    }
}
