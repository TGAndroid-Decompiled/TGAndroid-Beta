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
public final class na0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.y0 E;
    public final sa0 F;
    public final FrameLayout G;
    public final sa0 H;
    public final sa0 I;
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
    public final int f37736a;
    public int f37737a0;
    public final org.telegram.ui.w8 f37738b;
    public int f37739b0;
    public final ba0 f37740c;
    public boolean f37741c0;
    public final org.telegram.ui.Cells.u9 d;
    public final ta0 f37742d0;
    public final ha0 f37743e;
    public final di.b1 f37744f;
    public final ja0 h;
    public final org.telegram.ui.z7 f37745n;
    public org.telegram.messenger.hj f37746r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37747s;
    public final ga0 f37748w;
    public final ga0 f37749x;
    public final org.telegram.ui.ActionBar.y0 f37750y;

    public na0(org.telegram.ui.Components.ta0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na0.<init>(org.telegram.ui.Components.ta0, android.content.Context, int):void");
    }

    public static org.telegram.messenger.aj a(na0 na0Var, org.telegram.messenger.fj fjVar) {
        if (fjVar.c1() != 0) {
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) na0Var.f37746r.d.get(fjVar.c1());
            if (ajVar == null || (ajVar.d.size() > 1 && ajVar.d(fjVar) != null)) {
                return ajVar;
            }
            return null;
        }
        return null;
    }

    public static void b(na0 na0Var, org.telegram.ui.Cells.r1 r1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (na0Var.f37736a == 2) {
            org.telegram.messenger.jj jjVar = na0Var.f37742d0.d;
            if (!jjVar.f24985n && (uRLSpan = jjVar.f24993w) != null && (webPage = jjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                r1Var.s3(uRLSpan);
                return;
            }
        }
        r1Var.s3(null);
    }

    public final org.telegram.messenger.fj c(org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.aj ajVar;
        org.telegram.messenger.jj jjVar = this.f37742d0.d;
        org.telegram.messenger.hj hjVar = jjVar.f24974a;
        if (hjVar != null) {
            LongSparseArray longSparseArray = hjVar.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (ajVar = (org.telegram.messenger.aj) jjVar.f24974a.d.valueAt(0)) != null) {
                if (ajVar.f23012i) {
                    if (fjVar != null) {
                        return fjVar;
                    }
                    org.telegram.ui.rm rmVar = jjVar.d;
                    if (rmVar != null) {
                        return rmVar.f51746a;
                    }
                }
                return ajVar.h;
            }
            return (org.telegram.messenger.fj) jjVar.f24974a.f24554e.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na0.d():android.view.View");
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
        boolean z10 = this.f37742d0.f39889w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f37747s;
        ba0 ba0Var = this.f37740c;
        org.telegram.ui.w8 w8Var = this.f37738b;
        if (z10) {
            ba0Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            ba0Var.setTranslationY(i7);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + w8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.u9 u9Var = this.d;
        u9Var.setTranslationX(x10);
        u9Var.setTranslationY(w8Var.getY());
    }

    public final void g() {
        ta0 ta0Var = this.f37742d0;
        new kc(ta0Var, ta0Var.G).I(2131624012, org.telegram.messenger.gd.N0(2131746241, null), org.telegram.messenger.gd.N0(2131746240, null)).j();
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
        if (this.f37742d0.f39882b) {
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
            org.telegram.ui.ActionBar.y0 y0Var2 = this.f37750y;
            ga0 ga0Var = this.f37749x;
            ga0 ga0Var2 = this.f37748w;
            float f16 = 0.0f;
            if (z11) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (ga0Var2 != null) {
                    ga0Var2.setVisibility(0);
                    if (!z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ga0Var2, property, f15));
                }
                if (ga0Var != null) {
                    ga0Var.setVisibility(0);
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ga0Var, property, f14));
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
                this.Q.setInterpolator(kr.h);
                this.Q.addListener(new org.telegram.ui.on(16, this, z10));
                this.Q.start();
                return;
            }
            if (ga0Var2 != null) {
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ga0Var2.setAlpha(f12);
                if (!z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                ga0Var2.setVisibility(i11);
            }
            if (ga0Var != null) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ga0Var.setAlpha(f11);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                ga0Var.setVisibility(i10);
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
        ta0 ta0Var = this.f37742d0;
        org.telegram.messenger.jj jjVar = ta0Var.d;
        ja0 ja0Var = this.h;
        if (ja0Var.k()) {
            this.W = true;
            return;
        }
        for (int i10 = 0; i10 < this.f37746r.f24555f.size(); i10++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f37746r.f24555f.get(i10);
            fjVar.M1 = true;
            fjVar.f24062h2 = ta0Var.f39881a;
            if (!jjVar.f24982k) {
                fjVar.f24073k.flags |= 4;
                fjVar.f24058g2 = false;
            } else {
                fjVar.f24073k.flags &= -5;
                fjVar.f24058g2 = true;
            }
            if (this.f37736a == 2) {
                TLRPC.WebPage webPage = jjVar.v;
                if (webPage != null && ((messageMedia = (message = fjVar.f24073k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = fjVar.f24073k.media;
                    messageMedia2.webpage = jjVar.v;
                    boolean z10 = jjVar.f24988q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    fjVar.f24127y = null;
                    fjVar.o0();
                    fjVar.f24093p0 = null;
                    fjVar.f24097q0 = null;
                    fjVar.f24086n0 = null;
                    fjVar.f24089o0 = null;
                    fjVar.r0(true);
                    fjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = fjVar.f24073k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (jjVar.f24983l) {
                fjVar.f24131z = null;
            } else {
                fjVar.k0();
            }
            if (fjVar.T3()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) fjVar.f24073k.media;
                TLRPC.PollResults pollResults = ijVar.results;
                if (jjVar.f24983l) {
                    i7 = 0;
                } else {
                    i7 = ijVar.f24805a;
                }
                pollResults.total_voters = i7;
            }
        }
        for (int i11 = 0; i11 < this.f37746r.h.size(); i11++) {
            ((TLRPC.PollAnswerVoters) this.f37746r.h.get(i11)).chosen = !jjVar.f24982k;
        }
        for (int i12 = 0; i12 < this.f37746r.d.size(); i12++) {
            ja0Var.V((org.telegram.messenger.aj) this.f37746r.d.valueAt(i12));
        }
        this.f37745n.k(0, this.f37746r.f24555f.size());
    }

    public final void j() {
        int i7 = this.S;
        float f10 = this.T;
        ta0 ta0Var = this.f37742d0;
        boolean z10 = ta0Var.f39889w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f37747s;
        di.b1 b1Var = this.f37744f;
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
            org.telegram.messenger.hj hjVar = this.f37746r;
            if (hjVar != null && i11 != 0 && i11 <= hjVar.f24555f.size()) {
                int d = i5.c.d(4.0f, measuredHeight, 0);
                this.S = d;
                int measuredHeight2 = (b1Var.getMeasuredHeight() - this.S) + d;
                int i13 = org.telegram.messenger.g0.f24226q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i10 = org.telegram.messenger.g0.f24221n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i13 - i10) * 0.8f) - this.f37737a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.f37738b.getMeasuredHeight() - this.S) + (this.f37737a0 - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.S;
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
            ValueAnimator valueAnimator = ta0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ta0Var.h = ofFloat;
            ofFloat.addUpdateListener(new wj(this, i7, f10, 1));
            ta0Var.h.setDuration(250L);
            ta0Var.h.setInterpolator(pi.k.V);
            ta0Var.h.addListener(new p60(this, 4));
            org.telegram.messenger.g0.h3(ta0Var.E, 50L);
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
        ta0 ta0Var = this.f37742d0;
        org.telegram.messenger.jj jjVar = ta0Var.d;
        if (this.f37736a == 0) {
            ha0 ha0Var = this.f37743e;
            if (ha0Var.v - ha0Var.f32289u <= org.telegram.messenger.mp.u1(ta0Var.f39890x).f25844r4) {
                org.telegram.ui.Cells.q9 q9Var = ha0Var.W;
                if (q9Var != null) {
                    fjVar = ((org.telegram.ui.Cells.r1) q9Var).getMessageObject();
                } else {
                    fjVar = null;
                }
                org.telegram.messenger.fj c10 = c(fjVar);
                if (jjVar.d != null && ha0Var.x()) {
                    jjVar.f24977e = ha0Var.f32289u;
                    jjVar.f24978f = ha0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.rm rmVar = jjVar.d;
                        if (rmVar.f51756m || (fjVar2 = rmVar.f51746a) == null || fjVar2.e1() != c10.e1()) {
                            jjVar.d = org.telegram.ui.rm.b(jjVar.f24977e, jjVar.f24978f, c10);
                            ta0Var.b();
                        }
                    }
                }
                ha0Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String N0;
        ta0 ta0Var = this.f37742d0;
        TLRPC.User user = ta0Var.f39886n;
        org.telegram.messenger.jj jjVar = ta0Var.d;
        TLRPC.Chat chat = ta0Var.f39887r;
        ba0 ba0Var = this.f37740c;
        int i7 = this.f37736a;
        if (i7 == 1) {
            org.telegram.messenger.hj hjVar = jjVar.f24975b;
            if (hjVar == null) {
                size = 0;
            } else {
                size = hjVar.f24556g.size();
            }
            ba0Var.b(org.telegram.messenger.gd.G(size, "PreviewForwardMessagesCount", new Object[0]), z10);
            if (!jjVar.h) {
                if (jjVar.f24984m) {
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
            } else if (!jjVar.f24982k) {
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
            ba0Var.a(N0, z10);
        } else if (i7 == 0) {
            if (jjVar.d != null && jjVar.f24974a.f24558j) {
                ba0Var.b(org.telegram.messenger.gd.N0(2131746686, null), z10);
                ba0Var.a(org.telegram.messenger.gd.N0(2131746685, null), z10);
                return;
            }
            ba0Var.b(org.telegram.messenger.gd.N0(2131748352, null), z10);
            if (jjVar.f24974a.f24558j) {
                str = org.telegram.messenger.gd.N0(2131748353, null);
            } else {
                str = "";
            }
            ba0Var.a(str, z10);
        } else if (i7 == 2) {
            ba0Var.b(org.telegram.messenger.gd.N0(2131748355, null), z10);
            ba0Var.a(org.telegram.messenger.gd.N0(2131748356, null), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37736a == 0) {
            org.telegram.messenger.g0.d0(this.f37744f, new y2(this, 9));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f37741c0 = true;
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
        ta0 ta0Var = this.f37742d0;
        ta0Var.f39889w = z10;
        this.f37737a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f37747s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.f37737a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.f37737a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f37744f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = ta0Var.f39889w;
        org.telegram.ui.w8 w8Var = this.f37738b;
        if (z11) {
            w8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            w8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = 0;
            w8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.f37737a0;
            if (w8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                w8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            w8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - w8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.f37739b0 != size2) {
            for (int i12 = 0; i12 < this.f37746r.f24555f.size(); i12++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f37746r.f24555f.get(i12);
                if (ta0Var.f39889w) {
                    size = w8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                }
                fjVar.d2 = size;
                fjVar.S1 = false;
                fjVar.M1 = true;
                org.telegram.ui.z7 z7Var = this.f37745n;
                if (z7Var != null) {
                    z7Var.f();
                }
            }
            this.L = true;
        }
        this.f37739b0 = size2;
        super.onMeasure(i7, i10);
    }
}
