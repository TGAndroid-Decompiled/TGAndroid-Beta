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
public final class q8 extends org.telegram.ui.ActionBar.e2 {
    public static final int[][] f38560d0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f38561e0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public org.telegram.ui.ActionBar.k I;
    public f1 J;
    public n8 K;
    public kc L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final Paint P;
    public int Q;
    public boolean R;
    public org.telegram.ui.ActionBar.q0 S;
    public org.telegram.messenger.b9 T;
    public final k30 U;
    public boolean V;
    public TextView W;
    public TextView X;
    public final m30 Y;
    public m8 Z;
    public j8 f38562a;
    public boolean f38563a0;
    public k8 f38564b;
    public float f38565b0;
    public int f38566c;
    public ValueAnimator f38567c0;
    public int d;
    public View f38568e;
    public boolean f38569f;
    public boolean h;
    public boolean f38570n;
    public org.telegram.ui.z51 f38571r;
    public CharSequence f38572s;
    public SpannableStringBuilder f38573w;
    public boolean f38574x;
    public hi.d f38575y;

    public q8(m30 m30Var, k30 k30Var) {
        super(null);
        this.P = new Paint();
        this.R = true;
        this.f38563a0 = false;
        this.f38565b0 = 0.0f;
        this.Y = m30Var;
        this.U = k30Var;
    }

    public static void Z(q8 q8Var) {
        if (q8Var.getParentActivity() == null) {
            return;
        }
        if (q8Var.f38570n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q8Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131747278, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.U = M0;
            t1Var.S = org.telegram.messenger.hd.M0(2131751405, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747580, null), new e8(q8Var, 1));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            q8Var.showDialog(t1Var);
            t1Var.i();
            return;
        }
        q8Var.finishFragment();
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
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.l(kVar, 5, i7, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.f28941i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747280, null));
        this.actionBar.setActionBarMenuOnItemClick(new h8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.I = kVar2;
        kVar2.setCastShadows(false);
        this.I.setAddToContainer(false);
        this.I.setOccupyStatusBar(true);
        this.I.setClipChildren(false);
        int o4 = i0.a.o(-1, 60);
        this.I.H(-1, false);
        this.I.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.I.setAllowOverlayTitle(false);
        this.I.F(o4, false);
        org.telegram.ui.ActionBar.y s5 = this.I.s();
        s5.setClipChildren(false);
        k30 k30Var = this.U;
        if (k30Var != null && k30Var.f36270c == 2) {
            M0 = org.telegram.messenger.hd.M0(2131744408, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131745519, null);
        }
        org.telegram.ui.ActionBar.q0 e10 = s5.e(1, M0);
        this.S = e10;
        e10.setBackground(org.telegram.ui.ActionBar.j6.h0(o4, 3, -1));
        this.I.setActionBarMenuOnItemClick(new h8(this, 1));
        this.f38571r = new org.telegram.ui.z51(11, getParentActivity(), this);
        i8 i8Var = new i8(this, context);
        i8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, i8Var, null);
        this.f38571r.setClipChildren(false);
        this.f38571r.setClipToPadding(false);
        this.f38571r.setPadding(0, org.telegram.messenger.g0.f23603m, 0, 0);
        this.f38571r.setOrientation(1);
        org.telegram.ui.z51 z51Var = this.f38571r;
        j8 j8Var = new j8(this, getParentActivity(), i8Var);
        this.f38562a = j8Var;
        z51Var.addView(j8Var);
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131752139, null));
        TextView textView2 = this.X;
        int i10 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.U(textView2, i10, null);
        this.X.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.f38571r.addView(this.X, c8.ja.t(-1, -2, 0, 21, 10, 21, 10));
        di.e1 e1Var = new di.e1(this, getParentActivity());
        n8 n8Var = new n8(this, getParentActivity());
        this.K = n8Var;
        e1Var.addView(n8Var);
        this.f38571r.addView(e1Var, c8.ja.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.W = textView3;
        textView3.setText(org.telegram.messenger.hd.M0(2131752131, null));
        org.telegram.ui.ActionBar.q6.U(this.W, i10, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f38571r.addView(this.W, c8.ja.t(-1, -2, 0, 21, 18, 21, 10));
        k8 k8Var = new k8(this, this, getParentActivity(), getThemedColor(i7));
        this.f38564b = k8Var;
        k8Var.S = true;
        k8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f38564b.setClipChildren(false);
        this.f38571r.addView(this.f38564b, c8.ja.t(-1, -1, 0, 12, 0, 12, 12));
        this.f38571r.setClipChildren(false);
        i8Var.addView(this.f38571r, c8.ja.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f38568e = view;
        view.setVisibility(8);
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.f38575y = dVar;
        dVar.f();
        this.f38575y.d.r(false, false);
        int i11 = this.Y.W;
        if (i11 == 1) {
            this.f38572s = org.telegram.messenger.hd.M0(2131745539, null);
        } else if (i11 == 3) {
            this.f38572s = org.telegram.messenger.hd.M0(2131745536, null);
        } else if (i11 == 2) {
            this.f38572s = org.telegram.messenger.hd.M0(2131745525, null);
        } else if (k30Var != null && k30Var.f36270c == 2) {
            this.f38572s = org.telegram.messenger.hd.M0(2131744408, null);
        } else {
            this.f38572s = org.telegram.messenger.hd.M0(2131745523, null);
        }
        this.f38572s = new SpannableStringBuilder(this.f38572s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f38572s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new eq(2131232243, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f38573w = spannableStringBuilder;
        this.f38574x = false;
        this.f38575y.i(this.f38572s, false, true);
        this.f38575y.setOnClickListener(new e0(this, 2));
        this.E = new FrameLayout(context);
        i8Var.addView(this.f38575y, c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        i8Var.addView(this.E, c8.ja.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        i8Var.addView(this.actionBar);
        i8Var.addView(this.I);
        i8Var.addView(this.f38568e, c8.ja.c(-1.0f, -1));
        kc kcVar = new kc(i8Var);
        this.L = kcVar;
        kcVar.h = new d8(this, 0);
        this.fragmentView = i8Var;
        return i8Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q8.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.m10.i(this.currentAccount).q()) {
            return false;
        }
        j8 j8Var = this.f38562a;
        m8 m8Var = j8Var.h;
        if ((m8Var == null || !m8Var.f37162b) && !j8Var.f38243n) {
            return false;
        }
        return true;
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q8.k0():void");
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
            this.f38562a.f38247x = this.F;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25564r4, new Object[0]);
        }
        this.H.addUpdateListener(new ch.u(6, this, z11));
        this.H.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.H.setInterpolator(er.h);
            this.H.setDuration(350L);
            this.H.setStartDelay(150L);
        } else {
            this.H.setInterpolator(er.f34420f);
            this.H.setDuration(250L);
        }
        this.H.start();
    }

    public final void m0(boolean z10, long j3, TLRPC.Document document) {
        j8 j8Var = this.f38562a;
        j8Var.f38238a = j3;
        fi.v3 v3Var = j8Var.f38240c;
        j8Var.f38239b = document;
        if (j3 == 0) {
            v3Var.setAnimatedEmojiDrawable(null);
            this.f38562a.f38240c.getImageReceiver().r0(org.telegram.messenger.gc.b(document), "100_100", null, null, org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            v3Var.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, j3));
            this.f38562a.f38240c.getImageReceiver().f();
        }
        if (this.f38562a.getImageReceiver() != null && this.f38562a.getImageReceiver().m() != null) {
            this.f38562a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.f38562a.getImageReceiver() != null && this.f38562a.getImageReceiver().B() != null) {
            this.f38562a.getImageReceiver().B().N(0, false, true);
        }
        this.f38570n = true;
        s0();
    }

    public final void n0(boolean z10, float f10) {
        boolean z11;
        this.F = f10;
        float f11 = ((this.d - this.f38566c) - org.telegram.messenger.g0.f23603m) * f10;
        if (this.O == 0.0f) {
            this.f38571r.setTranslationY(f11);
            this.f38575y.setTranslationY(f11);
        }
        this.f38562a.setTranslationY(((-(this.d - this.f38566c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z10) {
            j8 j8Var = this.f38562a;
            if (f10 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j8Var.setExpanded(z11);
        }
    }

    public final void o0(float f10) {
        if (this.f38565b0 != f10) {
            this.f38565b0 = f10;
            int f11 = i0.a.f(f10, -16777216, -1);
            int o4 = i0.a.o(f11, 60);
            this.I.H(f11, false);
            this.S.setBackground(org.telegram.ui.ActionBar.j6.h0(o4, 3, -1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f38570n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131747278, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.U = M0;
                t1Var.S = org.telegram.messenger.hd.M0(2131751405, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747580, null), new e8(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                showDialog(t1Var);
                t1Var.i();
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

    public final void p0(long j3) {
        j8 j8Var = this.f38562a;
        if (j8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f38560d0[0];
        obj.f37163c = iArr[0];
        obj.d = iArr[1];
        obj.f37164e = iArr[2];
        obj.f37165f = iArr[3];
        j8Var.b(obj, false);
        s0();
        j8 j8Var2 = this.f38562a;
        j8Var2.f38238a = j3;
        j8Var2.f38240c.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, j3));
        this.K.z1(obj);
        this.f38564b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i7;
        int i10;
        int i11;
        ?? obj = new Object();
        obj.f37163c = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f37164e = i10;
        if (videoSize.background_colors.size() > 3) {
            i11 = i0.a.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.f37165f = i11;
        this.f38562a.b(obj, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i12 = 0; i12 < m0.documents.size(); i12++) {
                    if (m0.documents.get(i12).f28057id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i12);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.K.z1(obj);
        this.f38564b.setForUser(true);
    }

    public final void r0(s8 s8Var) {
        m8 backgroundGradient = s8Var.getBackgroundGradient();
        j8 j8Var = this.f38562a;
        if (j8Var == null) {
            return;
        }
        j8Var.b(backgroundGradient, false);
        s0();
        if (s8Var.getAnimatedEmoji() != null) {
            long h = s8Var.getAnimatedEmoji().h();
            j8 j8Var2 = this.f38562a;
            j8Var2.f38238a = h;
            j8Var2.f38240c.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, h));
        }
        this.K.z1(backgroundGradient);
        this.f38564b.setForUser(false);
    }

    public final void s0() {
        CharSequence charSequence;
        boolean j02 = j0();
        if (this.f38574x != j02) {
            hi.d dVar = this.f38575y;
            this.f38574x = j02;
            if (j02) {
                charSequence = this.f38573w;
            } else {
                charSequence = this.f38572s;
            }
            dVar.i(charSequence, true, true);
        }
    }
}
