package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s8 extends org.telegram.ui.ActionBar.f2 {
    public static final int[][] f37885c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f37886d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout D;
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.l H;
    public e2 I;
    public p8 J;
    public oc K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.r0 R;
    public org.telegram.messenger.c9 S;
    public final h30 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final j30 X;
    public o8 Y;
    public boolean Z;
    public l8 f37887a;
    public float f37888a0;
    public m8 f37889b;
    public ValueAnimator f37890b0;
    public int f37891c;
    public int d;
    public View f37892e;
    public boolean f37893f;
    public boolean h;
    public boolean f37894n;
    public org.telegram.ui.e61 f37895r;
    public CharSequence f37896s;
    public SpannableStringBuilder f37897w;
    public boolean f37898x;
    public fi.d f37899y;

    public s8(j30 j30Var, h30 h30Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f37888a0 = 0.0f;
        this.X = j30Var;
        this.T = h30Var;
    }

    public static void Z(s8 s8Var) {
        if (s8Var.getParentActivity() == null) {
            return;
        }
        if (s8Var.f37894n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s8Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747278, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.T = M0;
            u1Var.R = org.telegram.messenger.id.M0(2131751405, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747580, null), new g8(s8Var, 1));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            s8Var.showDialog(u1Var);
            u1Var.i();
            return;
        }
        s8Var.finishFragment();
    }

    @Override
    public final View createView(Context context) {
        String M0;
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.l(lVar, 5, i7, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.f27982i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747280, null));
        this.actionBar.setActionBarMenuOnItemClick(new j8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.l lVar2 = new org.telegram.ui.ActionBar.l(getParentActivity(), null);
        this.H = lVar2;
        lVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int o4 = i0.a.o(-1, 60);
        this.H.G(-1, false);
        this.H.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.H.setAllowOverlayTitle(false);
        this.H.E(o4, false);
        org.telegram.ui.ActionBar.y s5 = this.H.s();
        s5.setClipChildren(false);
        h30 h30Var = this.T;
        if (h30Var != null && h30Var.f34152c == 2) {
            M0 = org.telegram.messenger.id.M0(2131744408, null);
        } else {
            M0 = org.telegram.messenger.id.M0(2131745519, null);
        }
        org.telegram.ui.ActionBar.r0 e10 = s5.e(1, M0);
        this.R = e10;
        e10.setBackground(org.telegram.ui.ActionBar.m6.h0(o4, 3, -1));
        this.H.setActionBarMenuOnItemClick(new j8(this, 1));
        this.f37895r = new org.telegram.ui.e61(10, getParentActivity(), this);
        k8 k8Var = new k8(this, context);
        k8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, k8Var, null);
        this.f37895r.setClipChildren(false);
        this.f37895r.setClipToPadding(false);
        this.f37895r.setPadding(0, org.telegram.messenger.g0.f22561m, 0, 0);
        this.f37895r.setOrientation(1);
        org.telegram.ui.e61 e61Var = this.f37895r;
        l8 l8Var = new l8(this, getParentActivity(), k8Var);
        this.f37887a = l8Var;
        e61Var.addView(l8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(org.telegram.messenger.id.M0(2131752139, null));
        TextView textView2 = this.W;
        int i10 = org.telegram.ui.ActionBar.m6.f28282y6;
        org.telegram.ui.ActionBar.t6.U(textView2, i10, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f37895r.addView(this.W, c8.ha.t(-1, -2, 0, 21, 10, 21, 10));
        bi.s1 s1Var = new bi.s1(this, getParentActivity());
        p8 p8Var = new p8(this, getParentActivity());
        this.J = p8Var;
        s1Var.addView(p8Var);
        this.f37895r.addView(s1Var, c8.ha.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(org.telegram.messenger.id.M0(2131752131, null));
        org.telegram.ui.ActionBar.t6.U(this.V, i10, null);
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f37895r.addView(this.V, c8.ha.t(-1, -2, 0, 21, 18, 21, 10));
        m8 m8Var = new m8(this, this, getParentActivity(), getThemedColor(i7));
        this.f37889b = m8Var;
        m8Var.R = true;
        m8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f37889b.setClipChildren(false);
        this.f37895r.addView(this.f37889b, c8.ha.t(-1, -1, 0, 12, 0, 12, 12));
        this.f37895r.setClipChildren(false);
        k8Var.addView(this.f37895r, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f37892e = view;
        view.setVisibility(8);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.f37899y = dVar;
        dVar.f();
        this.f37899y.d.r(false, false);
        int i11 = this.X.V;
        if (i11 == 1) {
            this.f37896s = org.telegram.messenger.id.M0(2131745539, null);
        } else if (i11 == 3) {
            this.f37896s = org.telegram.messenger.id.M0(2131745536, null);
        } else if (i11 == 2) {
            this.f37896s = org.telegram.messenger.id.M0(2131745525, null);
        } else if (h30Var != null && h30Var.f34152c == 2) {
            this.f37896s = org.telegram.messenger.id.M0(2131744408, null);
        } else {
            this.f37896s = org.telegram.messenger.id.M0(2131745523, null);
        }
        this.f37896s = new SpannableStringBuilder(this.f37896s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37896s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new wp(2131232242, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f37897w = spannableStringBuilder;
        this.f37898x = false;
        this.f37899y.i(this.f37896s, false, true);
        this.f37899y.setOnClickListener(new g0(this, 2));
        this.D = new FrameLayout(context);
        k8Var.addView(this.f37899y, c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        k8Var.addView(this.D, c8.ha.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        k8Var.addView(this.actionBar);
        k8Var.addView(this.H);
        k8Var.addView(this.f37892e, c8.ha.c(-1.0f, -1));
        oc ocVar = new oc(k8Var);
        this.K = ocVar;
        ocVar.h = new f8(this, 0);
        this.fragmentView = k8Var;
        return k8Var;
    }

    public final void i0() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.G.cancel();
            this.G = null;
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s8.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.p10.i(this.currentAccount).q()) {
            return false;
        }
        l8 l8Var = this.f37887a;
        o8 o8Var = l8Var.h;
        if ((o8Var == null || !o8Var.f36534b) && !l8Var.f37561n) {
            return false;
        }
        return true;
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s8.k0():void");
    }

    public final void l0(boolean z9, boolean z10, boolean z11) {
        float f10;
        if (this.U) {
            return;
        }
        i0();
        float f11 = this.E;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.G = ValueAnimator.ofFloat(f11, f10);
        if (z10) {
            this.f37887a.f37565x = this.E;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25072r4, new Object[0]);
        }
        this.G.addUpdateListener(new ch.u(6, this, z10));
        this.G.addListener(new org.telegram.ui.ActionBar.h(this, z9, z10, 2));
        if (z11) {
            this.G.setInterpolator(wq.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(wq.f40046f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void m0(boolean z9, long j3, TLRPC.Document document) {
        l8 l8Var = this.f37887a;
        l8Var.f37556a = j3;
        di.d4 d4Var = l8Var.f37558c;
        l8Var.f37557b = document;
        if (j3 == 0) {
            d4Var.setAnimatedEmojiDrawable(null);
            this.f37887a.f37558c.getImageReceiver().r0(org.telegram.messenger.hc.b(document), "100_100", null, null, org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            d4Var.setAnimatedEmojiDrawable(new h5(14, this.currentAccount, j3));
            this.f37887a.f37558c.getImageReceiver().f();
        }
        if (this.f37887a.getImageReceiver() != null && this.f37887a.getImageReceiver().m() != null) {
            this.f37887a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.f37887a.getImageReceiver() != null && this.f37887a.getImageReceiver().B() != null) {
            this.f37887a.getImageReceiver().B().N(0, false, true);
        }
        this.f37894n = true;
        s0();
    }

    public final void n0(boolean z9, float f10) {
        boolean z10;
        this.E = f10;
        float f11 = ((this.d - this.f37891c) - org.telegram.messenger.g0.f22561m) * f10;
        if (this.N == 0.0f) {
            this.f37895r.setTranslationY(f11);
            this.f37899y.setTranslationY(f11);
        }
        this.f37887a.setTranslationY(((-(this.d - this.f37891c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z9) {
            l8 l8Var = this.f37887a;
            if (f10 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            l8Var.setExpanded(z10);
        }
    }

    public final void o0(float f10) {
        if (this.f37888a0 != f10) {
            this.f37888a0 = f10;
            int f11 = i0.a.f(f10, -16777216, -1);
            int o4 = i0.a.o(f11, 60);
            this.H.G(f11, false);
            this.R.setBackground(org.telegram.ui.ActionBar.m6.h0(o4, 3, -1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.f37894n) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131747278, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.T = M0;
                u1Var.R = org.telegram.messenger.id.M0(2131751405, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747580, null), new g8(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                showDialog(u1Var);
                u1Var.i();
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), getClassGuid());
    }

    public final void p0(long j3) {
        l8 l8Var = this.f37887a;
        if (l8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f37885c0[0];
        obj.f36535c = iArr[0];
        obj.d = iArr[1];
        obj.f36536e = iArr[2];
        obj.f36537f = iArr[3];
        l8Var.b(obj, false);
        s0();
        l8 l8Var2 = this.f37887a;
        l8Var2.f37556a = j3;
        l8Var2.f37558c.setAnimatedEmojiDrawable(new h5(14, this.currentAccount, j3));
        this.J.z1(obj);
        this.f37889b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i7;
        int i10;
        int i11;
        ?? obj = new Object();
        obj.f36535c = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i7 = i0.a.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i7 = 0;
        }
        obj.d = i7;
        if (videoSize.background_colors.size() > 2) {
            i10 = i0.a.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i10 = 0;
        }
        obj.f36536e = i10;
        if (videoSize.background_colors.size() > 3) {
            i11 = i0.a.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.f36537f = i11;
        this.f37887a.b(obj, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i12 = 0; i12 < m0.documents.size(); i12++) {
                    if (m0.documents.get(i12).f26966id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i12);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.J.z1(obj);
        this.f37889b.setForUser(true);
    }

    public final void r0(u8 u8Var) {
        o8 backgroundGradient = u8Var.getBackgroundGradient();
        l8 l8Var = this.f37887a;
        if (l8Var == null) {
            return;
        }
        l8Var.b(backgroundGradient, false);
        s0();
        if (u8Var.getAnimatedEmoji() != null) {
            long h = u8Var.getAnimatedEmoji().h();
            l8 l8Var2 = this.f37887a;
            l8Var2.f37556a = h;
            l8Var2.f37558c.setAnimatedEmojiDrawable(new h5(14, this.currentAccount, h));
        }
        this.J.z1(backgroundGradient);
        this.f37889b.setForUser(false);
    }

    public final void s0() {
        CharSequence charSequence;
        boolean j02 = j0();
        if (this.f37898x != j02) {
            fi.d dVar = this.f37899y;
            this.f37898x = j02;
            if (j02) {
                charSequence = this.f37897w;
            } else {
                charSequence = this.f37896s;
            }
            dVar.i(charSequence, true, true);
        }
    }
}
