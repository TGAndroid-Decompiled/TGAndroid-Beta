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
public final class o8 extends org.telegram.ui.ActionBar.k2 {
    public static final int[][] f29042c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f29043d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout D;
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.l H;
    public f2 I;
    public l8 J;
    public jc K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.t0 R;
    public org.telegram.messenger.i9 S;
    public final z30 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final b40 X;
    public k8 Y;
    public boolean Z;
    public h8 f29044a;
    public float f29045a0;
    public i8 f29046b;
    public ValueAnimator f29047b0;
    public int f29048c;
    public int d;
    public View e;
    public boolean f29049f;
    public boolean h;
    public boolean f29050n;
    public org.telegram.ui.s71 f29051r;
    public CharSequence f29052s;
    public SpannableStringBuilder f29053w;
    public boolean f29054x;
    public vh.d f29055y;

    public o8(b40 b40Var, z30 z30Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f29045a0 = 0.0f;
        this.X = b40Var;
        this.T = z30Var;
    }

    public static void Z(o8 o8Var) {
        if (o8Var.getParentActivity() == null) {
            return;
        }
        if (o8Var.f29050n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o8Var.getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131747294, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.T = L0;
            x1Var.R = org.telegram.messenger.dd.L0(2131751406, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747596, null), new c8(o8Var, 1));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            o8Var.showDialog(x1Var);
            x1Var.i();
            return;
        }
        o8Var.finishFragment();
    }

    @Override
    public final View createView(Context context) {
        String L0;
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 5, i10, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21021i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131747296, null));
        this.actionBar.setActionBarMenuOnItemClick(new f8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.l lVar2 = new org.telegram.ui.ActionBar.l(getParentActivity(), null);
        this.H = lVar2;
        lVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int o10 = i0.b.o(-1, 60);
        this.H.D(-1, false);
        this.H.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.H.setAllowOverlayTitle(false);
        this.H.C(o10, false);
        org.telegram.ui.ActionBar.y p5 = this.H.p();
        p5.setClipChildren(false);
        z30 z30Var = this.T;
        if (z30Var != null && z30Var.f32985c == 2) {
            L0 = org.telegram.messenger.dd.L0(2131744434, null);
        } else {
            L0 = org.telegram.messenger.dd.L0(2131745536, null);
        }
        org.telegram.ui.ActionBar.t0 e = p5.e(1, L0);
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.t6.h0(o10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new f8(this, 1));
        this.f29051r = new org.telegram.ui.s71(this, getParentActivity(), 6);
        g8 g8Var = new g8(this, context);
        g8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, g8Var, null);
        this.f29051r.setClipChildren(false);
        this.f29051r.setClipToPadding(false);
        this.f29051r.setPadding(0, org.telegram.messenger.i0.f16166m, 0, 0);
        this.f29051r.setOrientation(1);
        org.telegram.ui.s71 s71Var = this.f29051r;
        h8 h8Var = new h8(this, getParentActivity(), g8Var);
        this.f29044a = h8Var;
        s71Var.addView(h8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(org.telegram.messenger.dd.L0(2131752139, null));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.t6.f21312y6;
        org.telegram.ui.ActionBar.a7.V(textView2, i11, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f29051r.addView(this.W, w7.b6.t(-1, -2, 0, 21, 10, 21, 10));
        jg.a3 a3Var = new jg.a3(this, getParentActivity());
        l8 l8Var = new l8(this, getParentActivity());
        this.J = l8Var;
        a3Var.addView(l8Var);
        this.f29051r.addView(a3Var, w7.b6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(org.telegram.messenger.dd.L0(2131752131, null));
        org.telegram.ui.ActionBar.a7.V(this.V, i11, null);
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f29051r.addView(this.V, w7.b6.t(-1, -2, 0, 21, 18, 21, 10));
        i8 i8Var = new i8(this, this, getParentActivity(), getThemedColor(i10));
        this.f29046b = i8Var;
        i8Var.R = true;
        i8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f29046b.setClipChildren(false);
        this.f29051r.addView(this.f29046b, w7.b6.t(-1, -1, 0, 12, 0, 12, 12));
        this.f29051r.setClipChildren(false);
        g8Var.addView(this.f29051r, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.f29055y = dVar;
        dVar.f();
        this.f29055y.d.r(false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.f29052s = org.telegram.messenger.dd.L0(2131745556, null);
        } else if (i12 == 3) {
            this.f29052s = org.telegram.messenger.dd.L0(2131745553, null);
        } else if (i12 == 2) {
            this.f29052s = org.telegram.messenger.dd.L0(2131745542, null);
        } else if (z30Var != null && z30Var.f32985c == 2) {
            this.f29052s = org.telegram.messenger.dd.L0(2131744434, null);
        } else {
            this.f29052s = org.telegram.messenger.dd.L0(2131745540, null);
        }
        this.f29052s = new SpannableStringBuilder(this.f29052s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29052s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new dq(2131232241, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f29053w = spannableStringBuilder;
        this.f29054x = false;
        this.f29055y.i(this.f29052s, false, true);
        this.f29055y.setOnClickListener(new h0(this, 2));
        this.D = new FrameLayout(context);
        g8Var.addView(this.f29055y, w7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        g8Var.addView(this.D, w7.b6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        g8Var.addView(this.actionBar);
        g8Var.addView(this.H);
        g8Var.addView(this.e, w7.b6.c(-1.0f, -1));
        jc jcVar = new jc(g8Var);
        this.K = jcVar;
        jcVar.h = new b8(this, 0);
        this.fragmentView = g8Var;
        return g8Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o8.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.e20.i(this.currentAccount).q()) {
            return false;
        }
        h8 h8Var = this.f29044a;
        k8 k8Var = h8Var.h;
        if ((k8Var == null || !k8Var.f27769b) && !h8Var.f28705n) {
            return false;
        }
        return true;
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o8.k0():void");
    }

    public final void l0(boolean z10, boolean z11, boolean z12) {
        float f7;
        if (this.U) {
            return;
        }
        i0();
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.G = ValueAnimator.ofFloat(f10, f7);
        if (z11) {
            this.f29044a.f28709x = this.E;
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14777r4, new Object[0]);
        }
        this.G.addUpdateListener(new jg.o0(4, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.G.setInterpolator(gr.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(gr.f26523f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void m0(boolean z10, long j10, TLRPC.Document document) {
        h8 h8Var = this.f29044a;
        h8Var.f28701a = j10;
        ag.d2 d2Var = h8Var.f28703c;
        h8Var.f28702b = document;
        if (j10 == 0) {
            d2Var.setAnimatedEmojiDrawable(null);
            this.f29044a.f28703c.getImageReceiver().r0(org.telegram.messenger.jc.b(document), "100_100", null, null, org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            d2Var.setAnimatedEmojiDrawable(new f5(14, this.currentAccount, j10));
            this.f29044a.f28703c.getImageReceiver().f();
        }
        if (this.f29044a.getImageReceiver() != null && this.f29044a.getImageReceiver().m() != null) {
            this.f29044a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.f29044a.getImageReceiver() != null && this.f29044a.getImageReceiver().B() != null) {
            this.f29044a.getImageReceiver().B().N(0, false, true);
        }
        this.f29050n = true;
        s0();
    }

    public final void n0(boolean z10, float f7) {
        boolean z11;
        this.E = f7;
        float f10 = ((this.d - this.f29048c) - org.telegram.messenger.i0.f16166m) * f7;
        if (this.N == 0.0f) {
            this.f29051r.setTranslationY(f10);
            this.f29055y.setTranslationY(f10);
        }
        this.f29044a.setTranslationY(((-(this.d - this.f29048c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            h8 h8Var = this.f29044a;
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            h8Var.setExpanded(z11);
        }
    }

    public final void o0(float f7) {
        if (this.f29045a0 != f7) {
            this.f29045a0 = f7;
            int f10 = i0.b.f(f7, -16777216, -1);
            int o10 = i0.b.o(f10, 60);
            this.H.D(f10, false);
            this.R.setBackground(org.telegram.ui.ActionBar.t6.h0(o10, 3, -1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f29050n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131747294, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.T = L0;
                x1Var.R = org.telegram.messenger.dd.L0(2131751406, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747596, null), new c8(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                showDialog(x1Var);
                x1Var.i();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), getClassGuid());
    }

    public final void p0(long j10) {
        h8 h8Var = this.f29044a;
        if (h8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f29042c0[0];
        obj.f27770c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f27771f = iArr[3];
        h8Var.b(obj, false);
        s0();
        h8 h8Var2 = this.f29044a;
        h8Var2.f28701a = j10;
        h8Var2.f28703c.setAnimatedEmojiDrawable(new f5(14, this.currentAccount, j10));
        this.J.z1(obj);
        this.f29046b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f27770c = i0.b.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i10 = i0.b.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i10 = 0;
        }
        obj.d = i10;
        if (videoSize.background_colors.size() > 2) {
            i11 = i0.b.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.e = i11;
        if (videoSize.background_colors.size() > 3) {
            i12 = i0.b.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i12 = 0;
        }
        obj.f27771f = i12;
        this.f29044a.b(obj, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.vi.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i13 = 0; i13 < m0.documents.size(); i13++) {
                    if (m0.documents.get(i13).f19800id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i13);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.J.z1(obj);
        this.f29046b.setForUser(true);
    }

    public final void r0(q8 q8Var) {
        k8 backgroundGradient = q8Var.getBackgroundGradient();
        h8 h8Var = this.f29044a;
        if (h8Var == null) {
            return;
        }
        h8Var.b(backgroundGradient, false);
        s0();
        if (q8Var.getAnimatedEmoji() != null) {
            long h = q8Var.getAnimatedEmoji().h();
            h8 h8Var2 = this.f29044a;
            h8Var2.f28701a = h;
            h8Var2.f28703c.setAnimatedEmojiDrawable(new f5(14, this.currentAccount, h));
        }
        this.J.z1(backgroundGradient);
        this.f29046b.setForUser(false);
    }

    public final void s0() {
        CharSequence charSequence;
        boolean j02 = j0();
        if (this.f29054x != j02) {
            vh.d dVar = this.f29055y;
            this.f29054x = j02;
            if (j02) {
                charSequence = this.f29053w;
            } else {
                charSequence = this.f29052s;
            }
            dVar.i(charSequence, true, true);
        }
    }
}
