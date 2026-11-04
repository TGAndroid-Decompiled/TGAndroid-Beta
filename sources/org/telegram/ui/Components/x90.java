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
public final class x90 extends FrameLayout {
    public final org.telegram.ui.ActionBar.y0 E;
    public final ca0 F;
    public final FrameLayout G;
    public final ca0 H;
    public final ca0 I;
    public final int J;
    public final k4.j K;
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
    public final int f40285a;
    public int f40286a0;
    public final ai.h5 f40287b;
    public int f40288b0;
    public final l90 f40289c;
    public boolean f40290c0;
    public final org.telegram.ui.Cells.t9 d;
    public final da0 f40291d0;
    public final r90 f40292e;
    public final ci.j1 f40293f;
    public final t90 h;
    public final org.telegram.ui.y7 f40294n;
    public org.telegram.messenger.bj f40295r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40296s;
    public final q90 f40297w;
    public final q90 f40298x;
    public final org.telegram.ui.ActionBar.y0 f40299y;

    public x90(org.telegram.ui.Components.da0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x90.<init>(org.telegram.ui.Components.da0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.ui a(x90 x90Var, org.telegram.messenger.zi ziVar) {
        if (ziVar.d1() != 0) {
            org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) x90Var.f40295r.d.get(ziVar.d1());
            if (uiVar == null || (uiVar.d.size() > 1 && uiVar.d(ziVar) != null)) {
                return uiVar;
            }
            return null;
        }
        return null;
    }

    public static void b(x90 x90Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (x90Var.f40285a == 2) {
            org.telegram.messenger.dj djVar = x90Var.f40291d0.d;
            if (!djVar.f22208n && (uRLSpan = djVar.f22216w) != null && (webPage = djVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.o3(uRLSpan);
                return;
            }
        }
        q1Var.o3(null);
    }

    public final org.telegram.messenger.zi c(org.telegram.messenger.zi ziVar) {
        org.telegram.messenger.ui uiVar;
        org.telegram.messenger.dj djVar = this.f40291d0.d;
        org.telegram.messenger.bj bjVar = djVar.f22197a;
        if (bjVar != null) {
            LongSparseArray longSparseArray = bjVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (uiVar = (org.telegram.messenger.ui) djVar.f22197a.d.valueAt(0)) != null) {
                if (uiVar.f25705i) {
                    if (ziVar != null) {
                        return ziVar;
                    }
                    org.telegram.ui.mm mmVar = djVar.d;
                    if (mmVar != null) {
                        return mmVar.f47700a;
                    }
                }
                return uiVar.h;
            }
            return (org.telegram.messenger.zi) djVar.f22197a.f21841e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x90.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi c2;
        if (q1Var != null && q1Var.getMessageObject() != null && (c2 = c(null)) != null) {
            if (q1Var.getMessageObject() == c2 || q1Var.getMessageObject().f1() == c2.f1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f10, int i3) {
        boolean z10 = this.f40291d0.f33041w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f40296s;
        l90 l90Var = this.f40289c;
        ai.h5 h5Var = this.f40287b;
        if (z10) {
            l90Var.setTranslationY(0.0f);
            h5Var.invalidateOutline();
            h5Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            l90Var.setTranslationY(i3);
            h5Var.invalidateOutline();
            h5Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + h5Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = h5Var.getX();
        org.telegram.ui.Cells.t9 t9Var = this.d;
        t9Var.setTranslationX(x10);
        t9Var.setTranslationY(h5Var.getY());
    }

    public final void g() {
        da0 da0Var = this.f40291d0;
        new fc(da0Var, da0Var.G).I(2131624011, org.telegram.messenger.bd.M0(2131746445, null), org.telegram.messenger.bd.M0(2131746444, null)).j();
    }

    public final void h(boolean z10, boolean z11) {
        float f10;
        int i3;
        float f11;
        int i10;
        float f12;
        int i11;
        float f13;
        float f14;
        float f15;
        int i12 = 0;
        if (this.f40291d0.f33034b) {
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
            org.telegram.ui.ActionBar.y0 y0Var2 = this.f40299y;
            q90 q90Var = this.f40298x;
            q90 q90Var2 = this.f40297w;
            float f16 = 0.0f;
            if (z11) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (q90Var2 != null) {
                    q90Var2.setVisibility(0);
                    if (!z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q90Var2, property, f15));
                }
                if (q90Var != null) {
                    q90Var.setVisibility(0);
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q90Var, property, f14));
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
                this.Q.setInterpolator(xq.h);
                this.Q.addListener(new s9(15, this, z10));
                this.Q.start();
                return;
            }
            if (q90Var2 != null) {
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                q90Var2.setAlpha(f12);
                if (!z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                q90Var2.setVisibility(i11);
            }
            if (q90Var != null) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                q90Var.setAlpha(f11);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                q90Var.setVisibility(i10);
            }
            if (y0Var2 != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y0Var2.setAlpha(f10);
                if (!z10) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                y0Var2.setVisibility(i3);
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
        int i3;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        da0 da0Var = this.f40291d0;
        org.telegram.messenger.dj djVar = da0Var.d;
        t90 t90Var = this.h;
        if (t90Var.k()) {
            this.W = true;
            return;
        }
        for (int i10 = 0; i10 < this.f40295r.f21842f.size(); i10++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f40295r.f21842f.get(i10);
            ziVar.K1 = true;
            ziVar.f26848f2 = da0Var.f33033a;
            if (!djVar.f22205k) {
                ziVar.f26868k.flags |= 4;
                ziVar.f26843e2 = false;
            } else {
                ziVar.f26868k.flags &= -5;
                ziVar.f26843e2 = true;
            }
            if (this.f40285a == 2) {
                TLRPC.WebPage webPage = djVar.v;
                if (webPage != null && ((messageMedia = (message = ziVar.f26868k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = ziVar.f26868k.media;
                    messageMedia2.webpage = djVar.v;
                    boolean z10 = djVar.f22211q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    ziVar.f26920y = null;
                    ziVar.o0();
                    ziVar.f26878n0 = null;
                    ziVar.f26882o0 = null;
                    ziVar.f26872l0 = null;
                    ziVar.m0 = null;
                    ziVar.r0(true);
                    ziVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = ziVar.f26868k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (djVar.f22206l) {
                ziVar.f26924z = null;
            } else {
                ziVar.k0();
            }
            if (ziVar.U3()) {
                org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) ziVar.f26868k.media;
                TLRPC.PollResults pollResults = cjVar.results;
                if (djVar.f22206l) {
                    i3 = 0;
                } else {
                    i3 = cjVar.f22032a;
                }
                pollResults.total_voters = i3;
            }
        }
        for (int i11 = 0; i11 < this.f40295r.h.size(); i11++) {
            ((TLRPC.PollAnswerVoters) this.f40295r.h.get(i11)).chosen = !djVar.f22205k;
        }
        for (int i12 = 0; i12 < this.f40295r.d.size(); i12++) {
            t90Var.V((org.telegram.messenger.ui) this.f40295r.d.valueAt(i12));
        }
        this.f40294n.k(0, this.f40295r.f21842f.size());
    }

    public final void j() {
        int i3 = this.S;
        float f10 = this.T;
        da0 da0Var = this.f40291d0;
        boolean z10 = da0Var.f33041w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f40296s;
        ci.j1 j1Var = this.f40293f;
        int i10 = 0;
        if (!z10) {
            int measuredHeight = j1Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < j1Var.getChildCount(); i12++) {
                View childAt = j1Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            org.telegram.messenger.bj bjVar = this.f40295r;
            if (bjVar != null && i11 != 0 && i11 <= bjVar.f21842f.size()) {
                int d = k2.p1.d(4.0f, measuredHeight, 0);
                this.S = d;
                int measuredHeight2 = (j1Var.getMeasuredHeight() - this.S) + d;
                int i13 = org.telegram.messenger.g0.f22608q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i10 = org.telegram.messenger.g0.f22603n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i13 - i10) * 0.8f) - this.f40286a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float z11 = com.google.android.recaptcha.internal.a.z(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.f40287b.getMeasuredHeight() - this.S) + (this.f40286a0 - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.S;
            this.T = z11;
            if (z11 > org.telegram.messenger.g0.L(8.0f)) {
                this.T = org.telegram.messenger.g0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + j1Var.getMeasuredWidth());
        }
        boolean z12 = this.L;
        if (!z12 && (this.S != i3 || this.T != f10)) {
            ValueAnimator valueAnimator = da0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            da0Var.h = ofFloat;
            ofFloat.addUpdateListener(new gj(this, i3, f10, 1));
            da0Var.h.setDuration(250L);
            da0Var.h.setInterpolator(ni.l.V);
            da0Var.h.addListener(new a60(this, 4));
            org.telegram.messenger.g0.i3(da0Var.E, 50L);
            this.U = i3;
            f(f10, i3);
        } else if (z12) {
            float f11 = this.T;
            int i14 = this.S;
            this.U = i14;
            f(f11, i14);
        }
    }

    public final void k() {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        da0 da0Var = this.f40291d0;
        org.telegram.messenger.dj djVar = da0Var.d;
        if (this.f40285a == 0) {
            r90 r90Var = this.f40292e;
            if (r90Var.v - r90Var.f30691u <= org.telegram.messenger.hp.s1(da0Var.f33042x).f23081o4) {
                org.telegram.ui.Cells.p9 p9Var = r90Var.W;
                if (p9Var != null) {
                    ziVar = ((org.telegram.ui.Cells.q1) p9Var).getMessageObject();
                } else {
                    ziVar = null;
                }
                org.telegram.messenger.zi c2 = c(ziVar);
                if (djVar.d != null && r90Var.x()) {
                    djVar.f22200e = r90Var.f30691u;
                    djVar.f22201f = r90Var.v;
                    if (c2 != null) {
                        org.telegram.ui.mm mmVar = djVar.d;
                        if (mmVar.f47710m || (ziVar2 = mmVar.f47700a) == null || ziVar2.f1() != c2.f1()) {
                            djVar.d = org.telegram.ui.mm.b(djVar.f22200e, djVar.f22201f, c2);
                            da0Var.b();
                        }
                    }
                }
                r90Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String M0;
        da0 da0Var = this.f40291d0;
        TLRPC.User user = da0Var.f33038n;
        org.telegram.messenger.dj djVar = da0Var.d;
        TLRPC.Chat chat = da0Var.f33039r;
        l90 l90Var = this.f40289c;
        int i3 = this.f40285a;
        if (i3 == 1) {
            org.telegram.messenger.bj bjVar = djVar.f22198b;
            if (bjVar == null) {
                size = 0;
            } else {
                size = bjVar.f21843g.size();
            }
            l90Var.b(org.telegram.messenger.bd.G(size, "PreviewForwardMessagesCount", new Object[0]), z10);
            if (!djVar.h) {
                if (djVar.f22207m) {
                    if (user != null) {
                        M0 = org.telegram.messenger.bd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                    } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                        M0 = org.telegram.messenger.bd.M0(2131750579, null);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131750578, null);
                    }
                } else if (user != null) {
                    M0 = org.telegram.messenger.bd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.bd.M0(2131750582, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131750581, null);
                }
            } else if (!djVar.f22205k) {
                if (user != null) {
                    M0 = org.telegram.messenger.bd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.bd.M0(2131750579, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131750578, null);
                }
            } else if (user != null) {
                M0 = org.telegram.messenger.bd.a0("ForwardPreviewSendersNameHidden", null, 2131750583, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
            } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                M0 = org.telegram.messenger.bd.M0(2131750582, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131750581, null);
            }
            l90Var.a(M0, z10);
        } else if (i3 == 0) {
            if (djVar.d != null && djVar.f22197a.f21845j) {
                l90Var.b(org.telegram.messenger.bd.M0(2131746888, null), z10);
                l90Var.a(org.telegram.messenger.bd.M0(2131746887, null), z10);
                return;
            }
            l90Var.b(org.telegram.messenger.bd.M0(2131748553, null), z10);
            if (djVar.f22197a.f21845j) {
                str = org.telegram.messenger.bd.M0(2131748554, null);
            } else {
                str = "";
            }
            l90Var.a(str, z10);
        } else if (i3 == 2) {
            l90Var.b(org.telegram.messenger.bd.M0(2131748556, null), z10);
            l90Var.a(org.telegram.messenger.bd.M0(2131748557, null), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40285a == 0) {
            org.telegram.messenger.g0.d0(this.f40293f, new p2(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f40290c0 = true;
        this.L = true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        j();
        this.L = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        int size;
        if (View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        da0 da0Var = this.f40291d0;
        da0Var.f33041w = z10;
        this.f40286a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f40296s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i3, makeMeasureSpec);
        int i11 = this.f40286a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.f40286a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f40293f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = da0Var.f33041w;
        ai.h5 h5Var = this.f40287b;
        if (z11) {
            h5Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            h5Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i3), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i3) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).bottomMargin = 0;
            h5Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.f40286a0;
            if (h5Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                h5Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            h5Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - h5Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i3)) << 16;
        if (this.f40288b0 != size2) {
            for (int i12 = 0; i12 < this.f40295r.f21842f.size(); i12++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f40295r.f21842f.get(i12);
                if (da0Var.f33041w) {
                    size = h5Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(16.0f);
                }
                ziVar.f26830b2 = size;
                ziVar.Q1 = false;
                ziVar.K1 = true;
                org.telegram.ui.y7 y7Var = this.f40294n;
                if (y7Var != null) {
                    y7Var.f();
                }
            }
            this.L = true;
        }
        this.f40288b0 = size2;
        super.onMeasure(i3, i10);
    }
}
