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
public final class r8 extends org.telegram.ui.ActionBar.d2 {
    public static final int[][] f37665d0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f37666e0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public org.telegram.ui.ActionBar.k I;
    public org.telegram.ui.jo J;
    public o8 K;
    public nc L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final Paint P;
    public int Q;
    public boolean R;
    public org.telegram.ui.ActionBar.q0 S;
    public org.telegram.messenger.b9 T;
    public final d30 U;
    public boolean V;
    public TextView W;
    public TextView X;
    public final f30 Y;
    public n8 Z;
    public k8 f37667a;
    public boolean f37668a0;
    public l8 f37669b;
    public float f37670b0;
    public int f37671c;
    public ValueAnimator f37672c0;
    public int d;
    public View f37673e;
    public boolean f37674f;
    public boolean h;
    public boolean f37675n;
    public org.telegram.ui.s51 f37676r;
    public CharSequence f37677s;
    public SpannableStringBuilder f37678w;
    public boolean f37679x;
    public gi.d f37680y;

    public r8(f30 f30Var, d30 d30Var) {
        super(null);
        this.P = new Paint();
        this.R = true;
        this.f37668a0 = false;
        this.f37670b0 = 0.0f;
        this.Y = f30Var;
        this.U = d30Var;
    }

    public static void Z(r8 r8Var) {
        if (r8Var.getParentActivity() == null) {
            return;
        }
        if (r8Var.f37675n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r8Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131747286, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.U = M0;
            s1Var.S = org.telegram.messenger.bd.M0(2131751406, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new f8(r8Var, 1));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            r8Var.showDialog(s1Var);
            s1Var.i();
            return;
        }
        r8Var.finishFragment();
    }

    @Override
    public final View createView(Context context) {
        String M0;
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i3, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i3, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f27972i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747288, null));
        this.actionBar.setActionBarMenuOnItemClick(new i8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.I = kVar2;
        kVar2.setCastShadows(false);
        this.I.setAddToContainer(false);
        this.I.setOccupyStatusBar(true);
        this.I.setClipChildren(false);
        int o10 = i0.a.o(-1, 60);
        this.I.D(-1, false);
        this.I.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.I.setAllowOverlayTitle(false);
        this.I.C(o10, false);
        org.telegram.ui.ActionBar.x q10 = this.I.q();
        q10.setClipChildren(false);
        d30 d30Var = this.U;
        if (d30Var != null && d30Var.f32925c == 2) {
            M0 = org.telegram.messenger.bd.M0(2131744418, null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131745529, null);
        }
        org.telegram.ui.ActionBar.q0 e10 = q10.e(1, M0);
        this.S = e10;
        e10.setBackground(org.telegram.ui.ActionBar.k6.h0(o10, 3, -1));
        this.I.setActionBarMenuOnItemClick(new i8(this, 1));
        this.f37676r = new org.telegram.ui.s51(11, getParentActivity(), this);
        j8 j8Var = new j8(this, context);
        j8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, j8Var, null);
        this.f37676r.setClipChildren(false);
        this.f37676r.setClipToPadding(false);
        this.f37676r.setPadding(0, org.telegram.messenger.g0.f22602m, 0, 0);
        this.f37676r.setOrientation(1);
        org.telegram.ui.s51 s51Var = this.f37676r;
        k8 k8Var = new k8(this, getParentActivity(), j8Var);
        this.f37667a = k8Var;
        s51Var.addView(k8Var);
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131752139, null));
        TextView textView2 = this.X;
        int i10 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        this.X.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.f37676r.addView(this.X, b8.mf.t(-1, -2, 0, 21, 10, 21, 10));
        ci.l1 l1Var = new ci.l1(this, getParentActivity());
        o8 o8Var = new o8(this, getParentActivity());
        this.K = o8Var;
        l1Var.addView(o8Var);
        this.f37676r.addView(l1Var, b8.mf.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.W = textView3;
        textView3.setText(org.telegram.messenger.bd.M0(2131752131, null));
        org.telegram.ui.ActionBar.r6.V(this.W, i10, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f37676r.addView(this.W, b8.mf.t(-1, -2, 0, 21, 18, 21, 10));
        l8 l8Var = new l8(this, this, getParentActivity(), getThemedColor(i3));
        this.f37669b = l8Var;
        l8Var.S = true;
        l8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f37669b.setClipChildren(false);
        this.f37676r.addView(this.f37669b, b8.mf.t(-1, -1, 0, 12, 0, 12, 12));
        this.f37676r.setClipChildren(false);
        j8Var.addView(this.f37676r, b8.mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f37673e = view;
        view.setVisibility(8);
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.f37680y = dVar;
        dVar.f();
        this.f37680y.d.r(false, false);
        int i11 = this.Y.W;
        if (i11 == 1) {
            this.f37677s = org.telegram.messenger.bd.M0(2131745549, null);
        } else if (i11 == 3) {
            this.f37677s = org.telegram.messenger.bd.M0(2131745546, null);
        } else if (i11 == 2) {
            this.f37677s = org.telegram.messenger.bd.M0(2131745535, null);
        } else if (d30Var != null && d30Var.f32925c == 2) {
            this.f37677s = org.telegram.messenger.bd.M0(2131744418, null);
        } else {
            this.f37677s = org.telegram.messenger.bd.M0(2131745533, null);
        }
        this.f37677s = new SpannableStringBuilder(this.f37677s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37677s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new wp(2131232242, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f37678w = spannableStringBuilder;
        this.f37679x = false;
        this.f37680y.i(this.f37677s, false, true);
        this.f37680y.setOnClickListener(new f0(this, 2));
        this.E = new FrameLayout(context);
        j8Var.addView(this.f37680y, b8.mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        j8Var.addView(this.E, b8.mf.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        j8Var.addView(this.actionBar);
        j8Var.addView(this.I);
        j8Var.addView(this.f37673e, b8.mf.c(-1.0f, -1));
        nc ncVar = new nc(j8Var);
        this.L = ncVar;
        ncVar.h = new e8(this, 0);
        this.fragmentView = j8Var;
        return j8Var;
    }

    public final void i0() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
            this.H = null;
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.h10.i(this.currentAccount).q()) {
            return false;
        }
        k8 k8Var = this.f37667a;
        n8 n8Var = k8Var.h;
        if ((n8Var == null || !n8Var.f36412b) && !k8Var.f37374n) {
            return false;
        }
        return true;
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.k0():void");
    }

    public final void l0(boolean z10, boolean z11, boolean z12) {
        float f10;
        if (this.V) {
            return;
        }
        i0();
        float f11 = this.F;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.H = ValueAnimator.ofFloat(f11, f10);
        if (z11) {
            this.f37667a.f37378x = this.F;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, new Object[0]);
        }
        this.H.addUpdateListener(new dh.u(6, this, z11));
        this.H.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.H.setInterpolator(xq.h);
            this.H.setDuration(350L);
            this.H.setStartDelay(150L);
        } else {
            this.H.setInterpolator(xq.f40452f);
            this.H.setDuration(250L);
        }
        this.H.start();
    }

    public final void m0(boolean z10, long j10, TLRPC.Document document) {
        k8 k8Var = this.f37667a;
        k8Var.f37369a = j10;
        ei.d4 d4Var = k8Var.f37371c;
        k8Var.f37370b = document;
        if (j10 == 0) {
            d4Var.setAnimatedEmojiDrawable(null);
            this.f37667a.f37371c.getImageReceiver().r0(org.telegram.messenger.ac.b(document), "100_100", null, null, org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            d4Var.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, j10));
            this.f37667a.f37371c.getImageReceiver().f();
        }
        if (this.f37667a.getImageReceiver() != null && this.f37667a.getImageReceiver().m() != null) {
            this.f37667a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.f37667a.getImageReceiver() != null && this.f37667a.getImageReceiver().B() != null) {
            this.f37667a.getImageReceiver().B().N(0, false, true);
        }
        this.f37675n = true;
        s0();
    }

    public final void n0(boolean z10, float f10) {
        boolean z11;
        this.F = f10;
        float f11 = ((this.d - this.f37671c) - org.telegram.messenger.g0.f22602m) * f10;
        if (this.O == 0.0f) {
            this.f37676r.setTranslationY(f11);
            this.f37680y.setTranslationY(f11);
        }
        this.f37667a.setTranslationY(((-(this.d - this.f37671c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z10) {
            k8 k8Var = this.f37667a;
            if (f10 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            k8Var.setExpanded(z11);
        }
    }

    public final void o0(float f10) {
        if (this.f37670b0 != f10) {
            this.f37670b0 = f10;
            int f11 = i0.a.f(f10, -16777216, -1);
            int o10 = i0.a.o(f11, 60);
            this.I.D(f11, false);
            this.S.setBackground(org.telegram.ui.ActionBar.k6.h0(o10, 3, -1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f37675n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131747286, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.U = M0;
                s1Var.S = org.telegram.messenger.bd.M0(2131751406, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new f8(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                showDialog(s1Var);
                s1Var.i();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), getClassGuid());
    }

    public final void p0(long j10) {
        k8 k8Var = this.f37667a;
        if (k8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f37665d0[0];
        obj.f36413c = iArr[0];
        obj.d = iArr[1];
        obj.f36414e = iArr[2];
        obj.f36415f = iArr[3];
        k8Var.b(obj, false);
        s0();
        k8 k8Var2 = this.f37667a;
        k8Var2.f37369a = j10;
        k8Var2.f37371c.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, j10));
        this.K.z1(obj);
        this.f37669b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i3;
        int i10;
        int i11;
        ?? obj = new Object();
        obj.f36413c = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i3 = i0.a.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i3 = 0;
        }
        obj.d = i3;
        if (videoSize.background_colors.size() > 2) {
            i10 = i0.a.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i10 = 0;
        }
        obj.f36414e = i10;
        if (videoSize.background_colors.size() > 3) {
            i11 = i0.a.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.f36415f = i11;
        this.f37667a.b(obj, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i12 = 0; i12 < m0.documents.size(); i12++) {
                    if (m0.documents.get(i12).f27007id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i12);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.K.z1(obj);
        this.f37669b.setForUser(true);
    }

    public final void r0(t8 t8Var) {
        n8 backgroundGradient = t8Var.getBackgroundGradient();
        k8 k8Var = this.f37667a;
        if (k8Var == null) {
            return;
        }
        k8Var.b(backgroundGradient, false);
        s0();
        if (t8Var.getAnimatedEmoji() != null) {
            long h = t8Var.getAnimatedEmoji().h();
            k8 k8Var2 = this.f37667a;
            k8Var2.f37369a = h;
            k8Var2.f37371c.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, h));
        }
        this.K.z1(backgroundGradient);
        this.f37669b.setForUser(false);
    }

    public final void s0() {
        CharSequence charSequence;
        boolean j02 = j0();
        if (this.f37679x != j02) {
            gi.d dVar = this.f37680y;
            this.f37679x = j02;
            if (j02) {
                charSequence = this.f37678w;
            } else {
                charSequence = this.f37677s;
            }
            dVar.i(charSequence, true, true);
        }
    }
}
