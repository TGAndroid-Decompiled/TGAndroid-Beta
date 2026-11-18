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
public final class oa0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.z0 E;
    public final ta0 F;
    public final FrameLayout G;
    public final ta0 H;
    public final ta0 I;
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
    public final int f38039a;
    public int f38040a0;
    public final org.telegram.ui.v8 f38041b;
    public int f38042b0;
    public final ca0 f38043c;
    public boolean f38044c0;
    public final org.telegram.ui.Cells.u9 d;
    public final ua0 f38045d0;
    public final ia0 f38046e;
    public final di.b1 f38047f;
    public final ka0 h;
    public final org.telegram.ui.y7 f38048n;
    public org.telegram.messenger.hj f38049r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38050s;
    public final ha0 f38051w;
    public final ha0 f38052x;
    public final org.telegram.ui.ActionBar.z0 f38053y;

    public oa0(org.telegram.ui.Components.ua0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa0.<init>(org.telegram.ui.Components.ua0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.aj a(oa0 oa0Var, org.telegram.messenger.fj fjVar) {
        if (fjVar.c1() != 0) {
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) oa0Var.f38049r.d.get(fjVar.c1());
            if (ajVar == null || (ajVar.d.size() > 1 && ajVar.d(fjVar) != null)) {
                return ajVar;
            }
            return null;
        }
        return null;
    }

    public static void b(oa0 oa0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (oa0Var.f38039a == 2) {
            org.telegram.messenger.jj jjVar = oa0Var.f38045d0.d;
            if (!jjVar.f24878n && (uRLSpan = jjVar.f24886w) != null && (webPage = jjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.s3(uRLSpan);
                return;
            }
        }
        q1Var.s3(null);
    }

    public final org.telegram.messenger.fj c(org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.aj ajVar;
        org.telegram.messenger.jj jjVar = this.f38045d0.d;
        org.telegram.messenger.hj hjVar = jjVar.f24867a;
        if (hjVar != null) {
            LongSparseArray longSparseArray = hjVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (ajVar = (org.telegram.messenger.aj) jjVar.f24867a.d.valueAt(0)) != null) {
                if (ajVar.f22904i) {
                    if (fjVar != null) {
                        return fjVar;
                    }
                    org.telegram.ui.rm rmVar = jjVar.d;
                    if (rmVar != null) {
                        return rmVar.f51651a;
                    }
                }
                return ajVar.h;
            }
            return (org.telegram.messenger.fj) jjVar.f24867a.f24458e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa0.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj c10;
        if (q1Var != null && q1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (q1Var.getMessageObject() == c10 || q1Var.getMessageObject().e1() == c10.e1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f10, int i7) {
        boolean z10 = this.f38045d0.f40285w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f38050s;
        ca0 ca0Var = this.f38043c;
        org.telegram.ui.v8 v8Var = this.f38041b;
        if (z10) {
            ca0Var.setTranslationY(0.0f);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            ca0Var.setTranslationY(i7);
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
        ua0 ua0Var = this.f38045d0;
        new lc(ua0Var, ua0Var.G).I(2131624012, org.telegram.messenger.gd.M0(2131746242, null), org.telegram.messenger.gd.M0(2131746241, null)).j();
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
        if (this.f38045d0.f40278b) {
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
            org.telegram.ui.ActionBar.z0 z0Var2 = this.f38053y;
            ha0 ha0Var = this.f38052x;
            ha0 ha0Var2 = this.f38051w;
            float f16 = 0.0f;
            if (z11) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (ha0Var2 != null) {
                    ha0Var2.setVisibility(0);
                    if (!z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ha0Var2, property, f15));
                }
                if (ha0Var != null) {
                    ha0Var.setVisibility(0);
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ha0Var, property, f14));
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
                this.Q.setInterpolator(lr.h);
                this.Q.addListener(new org.telegram.ui.on(16, this, z10));
                this.Q.start();
                return;
            }
            if (ha0Var2 != null) {
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ha0Var2.setAlpha(f12);
                if (!z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                ha0Var2.setVisibility(i11);
            }
            if (ha0Var != null) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ha0Var.setAlpha(f11);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                ha0Var.setVisibility(i10);
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
        ua0 ua0Var = this.f38045d0;
        org.telegram.messenger.jj jjVar = ua0Var.d;
        ka0 ka0Var = this.h;
        if (ka0Var.k()) {
            this.W = true;
            return;
        }
        for (int i10 = 0; i10 < this.f38049r.f24459f.size(); i10++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f38049r.f24459f.get(i10);
            fjVar.M1 = true;
            fjVar.f23957h2 = ua0Var.f40277a;
            if (!jjVar.f24875k) {
                fjVar.f23968k.flags |= 4;
                fjVar.f23953g2 = false;
            } else {
                fjVar.f23968k.flags &= -5;
                fjVar.f23953g2 = true;
            }
            if (this.f38039a == 2) {
                TLRPC.WebPage webPage = jjVar.v;
                if (webPage != null && ((messageMedia = (message = fjVar.f23968k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = fjVar.f23968k.media;
                    messageMedia2.webpage = jjVar.v;
                    boolean z10 = jjVar.f24881q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    fjVar.f24022y = null;
                    fjVar.o0();
                    fjVar.f23988p0 = null;
                    fjVar.f23992q0 = null;
                    fjVar.f23981n0 = null;
                    fjVar.f23984o0 = null;
                    fjVar.r0(true);
                    fjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = fjVar.f23968k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (jjVar.f24876l) {
                fjVar.f24026z = null;
            } else {
                fjVar.k0();
            }
            if (fjVar.T3()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) fjVar.f23968k.media;
                TLRPC.PollResults pollResults = ijVar.results;
                if (jjVar.f24876l) {
                    i7 = 0;
                } else {
                    i7 = ijVar.f24682a;
                }
                pollResults.total_voters = i7;
            }
        }
        for (int i11 = 0; i11 < this.f38049r.h.size(); i11++) {
            ((TLRPC.PollAnswerVoters) this.f38049r.h.get(i11)).chosen = !jjVar.f24875k;
        }
        for (int i12 = 0; i12 < this.f38049r.d.size(); i12++) {
            ka0Var.V((org.telegram.messenger.aj) this.f38049r.d.valueAt(i12));
        }
        this.f38048n.k(0, this.f38049r.f24459f.size());
    }

    public final void j() {
        int i7 = this.S;
        float f10 = this.T;
        ua0 ua0Var = this.f38045d0;
        boolean z10 = ua0Var.f40285w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f38050s;
        di.b1 b1Var = this.f38047f;
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
            org.telegram.messenger.hj hjVar = this.f38049r;
            if (hjVar != null && i11 != 0 && i11 <= hjVar.f24459f.size()) {
                int d = i5.c.d(4.0f, measuredHeight, 0);
                this.S = d;
                int measuredHeight2 = (b1Var.getMeasuredHeight() - this.S) + d;
                int i13 = org.telegram.messenger.g0.f24121q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i10 = org.telegram.messenger.g0.f24116n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i13 - i10) * 0.8f) - this.f38040a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.f38041b.getMeasuredHeight() - this.S) + (this.f38040a0 - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.S;
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
            ValueAnimator valueAnimator = ua0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ua0Var.h = ofFloat;
            ofFloat.addUpdateListener(new vj(this, i7, f10, 1));
            ua0Var.h.setDuration(250L);
            ua0Var.h.setInterpolator(pi.k.V);
            ua0Var.h.addListener(new q60(this, 4));
            org.telegram.messenger.g0.h3(ua0Var.E, 50L);
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
        ua0 ua0Var = this.f38045d0;
        org.telegram.messenger.jj jjVar = ua0Var.d;
        if (this.f38039a == 0) {
            ia0 ia0Var = this.f38046e;
            if (ia0Var.v - ia0Var.f32211u <= org.telegram.messenger.mp.u1(ua0Var.f40286x).f25751r4) {
                org.telegram.ui.Cells.q9 q9Var = ia0Var.W;
                if (q9Var != null) {
                    fjVar = ((org.telegram.ui.Cells.q1) q9Var).getMessageObject();
                } else {
                    fjVar = null;
                }
                org.telegram.messenger.fj c10 = c(fjVar);
                if (jjVar.d != null && ia0Var.x()) {
                    jjVar.f24870e = ia0Var.f32211u;
                    jjVar.f24871f = ia0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.rm rmVar = jjVar.d;
                        if (rmVar.f51661m || (fjVar2 = rmVar.f51651a) == null || fjVar2.e1() != c10.e1()) {
                            jjVar.d = org.telegram.ui.rm.b(jjVar.f24870e, jjVar.f24871f, c10);
                            ua0Var.b();
                        }
                    }
                }
                ia0Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String M0;
        ua0 ua0Var = this.f38045d0;
        TLRPC.User user = ua0Var.f40282n;
        org.telegram.messenger.jj jjVar = ua0Var.d;
        TLRPC.Chat chat = ua0Var.f40283r;
        ca0 ca0Var = this.f38043c;
        int i7 = this.f38039a;
        if (i7 == 1) {
            org.telegram.messenger.hj hjVar = jjVar.f24868b;
            if (hjVar == null) {
                size = 0;
            } else {
                size = hjVar.f24460g.size();
            }
            ca0Var.b(org.telegram.messenger.gd.G(size, "PreviewForwardMessagesCount", new Object[0]), z10);
            if (!jjVar.h) {
                if (jjVar.f24877m) {
                    if (user != null) {
                        M0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750563, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                    } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                        M0 = org.telegram.messenger.gd.M0(2131750562, null);
                    } else {
                        M0 = org.telegram.messenger.gd.M0(2131750561, null);
                    }
                } else if (user != null) {
                    M0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750563, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.gd.M0(2131750565, null);
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131750564, null);
                }
            } else if (!jjVar.f24875k) {
                if (user != null) {
                    M0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750563, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                    M0 = org.telegram.messenger.gd.M0(2131750562, null);
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131750561, null);
                }
            } else if (user != null) {
                M0 = org.telegram.messenger.gd.a0("ForwardPreviewSendersNameHidden", null, 2131750566, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                M0 = org.telegram.messenger.gd.M0(2131750565, null);
            } else {
                M0 = org.telegram.messenger.gd.M0(2131750564, null);
            }
            ca0Var.a(M0, z10);
        } else if (i7 == 0) {
            if (jjVar.d != null && jjVar.f24867a.f24462j) {
                ca0Var.b(org.telegram.messenger.gd.M0(2131746687, null), z10);
                ca0Var.a(org.telegram.messenger.gd.M0(2131746686, null), z10);
                return;
            }
            ca0Var.b(org.telegram.messenger.gd.M0(2131748353, null), z10);
            if (jjVar.f24867a.f24462j) {
                str = org.telegram.messenger.gd.M0(2131748354, null);
            } else {
                str = "";
            }
            ca0Var.a(str, z10);
        } else if (i7 == 2) {
            ca0Var.b(org.telegram.messenger.gd.M0(2131748356, null), z10);
            ca0Var.a(org.telegram.messenger.gd.M0(2131748357, null), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38039a == 0) {
            org.telegram.messenger.g0.d0(this.f38047f, new y2(this, 9));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f38044c0 = true;
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
        ua0 ua0Var = this.f38045d0;
        ua0Var.f40285w = z10;
        this.f38040a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f38050s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.f38040a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.f38040a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f38047f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = ua0Var.f40285w;
        org.telegram.ui.v8 v8Var = this.f38041b;
        if (z11) {
            v8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            v8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = 0;
            v8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.f38040a0;
            if (v8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                v8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            v8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - v8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.f38042b0 != size2) {
            for (int i12 = 0; i12 < this.f38049r.f24459f.size(); i12++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f38049r.f24459f.get(i12);
                if (ua0Var.f40285w) {
                    size = v8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                }
                fjVar.d2 = size;
                fjVar.S1 = false;
                fjVar.M1 = true;
                org.telegram.ui.y7 y7Var = this.f38048n;
                if (y7Var != null) {
                    y7Var.f();
                }
            }
            this.L = true;
        }
        this.f38042b0 = size2;
        super.onMeasure(i7, i10);
    }
}
