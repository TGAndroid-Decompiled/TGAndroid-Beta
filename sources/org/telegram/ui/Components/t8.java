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
public final class t8 extends org.telegram.ui.ActionBar.f2 {
    public static final int[][] f38290c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f38291d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout D;
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public f2 I;
    public q8 J;
    public pc K;
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
    public p8 Y;
    public boolean Z;
    public m8 f38292a;
    public float f38293a0;
    public n8 f38294b;
    public ValueAnimator f38295b0;
    public int f38296c;
    public int d;
    public View f38297e;
    public boolean f38298f;
    public boolean h;
    public boolean f38299n;
    public org.telegram.ui.c61 f38300r;
    public CharSequence f38301s;
    public SpannableStringBuilder f38302w;
    public boolean f38303x;
    public fi.d f38304y;

    public t8(j30 j30Var, h30 h30Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f38293a0 = 0.0f;
        this.X = j30Var;
        this.T = h30Var;
    }

    public static void Z(t8 t8Var) {
        if (t8Var.getParentActivity() == null) {
            return;
        }
        if (t8Var.f38299n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t8Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747279, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.T = M0;
            u1Var.R = org.telegram.messenger.id.M0(2131751406, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747581, null), new h8(t8Var, 1));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            t8Var.showDialog(u1Var);
            u1Var.i();
            return;
        }
        t8Var.finishFragment();
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
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i7, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f27944i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747281, null));
        this.actionBar.setActionBarMenuOnItemClick(new k8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int o4 = i0.a.o(-1, 60);
        this.H.D(-1, false);
        this.H.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.H.setAllowOverlayTitle(false);
        this.H.C(o4, false);
        org.telegram.ui.ActionBar.y q10 = this.H.q();
        q10.setClipChildren(false);
        h30 h30Var = this.T;
        if (h30Var != null && h30Var.f34104c == 2) {
            M0 = org.telegram.messenger.id.M0(2131744411, null);
        } else {
            M0 = org.telegram.messenger.id.M0(2131745522, null);
        }
        org.telegram.ui.ActionBar.r0 e10 = q10.e(1, M0);
        this.R = e10;
        e10.setBackground(org.telegram.ui.ActionBar.k6.h0(o4, 3, -1));
        this.H.setActionBarMenuOnItemClick(new k8(this, 1));
        this.f38300r = new org.telegram.ui.c61(10, getParentActivity(), this);
        l8 l8Var = new l8(this, context);
        l8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27796a7, l8Var, null);
        this.f38300r.setClipChildren(false);
        this.f38300r.setClipToPadding(false);
        this.f38300r.setPadding(0, org.telegram.messenger.g0.f22557m, 0, 0);
        this.f38300r.setOrientation(1);
        org.telegram.ui.c61 c61Var = this.f38300r;
        m8 m8Var = new m8(this, getParentActivity(), l8Var);
        this.f38292a = m8Var;
        c61Var.addView(m8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(org.telegram.messenger.id.M0(2131752139, null));
        TextView textView2 = this.W;
        int i10 = org.telegram.ui.ActionBar.k6.f28244y6;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f38300r.addView(this.W, c8.ha.t(-1, -2, 0, 21, 10, 21, 10));
        bi.s1 s1Var = new bi.s1(this, getParentActivity());
        q8 q8Var = new q8(this, getParentActivity());
        this.J = q8Var;
        s1Var.addView(q8Var);
        this.f38300r.addView(s1Var, c8.ha.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(org.telegram.messenger.id.M0(2131752131, null));
        org.telegram.ui.ActionBar.r6.V(this.V, i10, null);
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f38300r.addView(this.V, c8.ha.t(-1, -2, 0, 21, 18, 21, 10));
        n8 n8Var = new n8(this, this, getParentActivity(), getThemedColor(i7));
        this.f38294b = n8Var;
        n8Var.R = true;
        n8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f38294b.setClipChildren(false);
        this.f38300r.addView(this.f38294b, c8.ha.t(-1, -1, 0, 12, 0, 12, 12));
        this.f38300r.setClipChildren(false);
        l8Var.addView(this.f38300r, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f38297e = view;
        view.setVisibility(8);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.f38304y = dVar;
        dVar.f();
        this.f38304y.d.r(false, false);
        int i11 = this.X.V;
        if (i11 == 1) {
            this.f38301s = org.telegram.messenger.id.M0(2131745542, null);
        } else if (i11 == 3) {
            this.f38301s = org.telegram.messenger.id.M0(2131745539, null);
        } else if (i11 == 2) {
            this.f38301s = org.telegram.messenger.id.M0(2131745528, null);
        } else if (h30Var != null && h30Var.f34104c == 2) {
            this.f38301s = org.telegram.messenger.id.M0(2131744411, null);
        } else {
            this.f38301s = org.telegram.messenger.id.M0(2131745526, null);
        }
        this.f38301s = new SpannableStringBuilder(this.f38301s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f38301s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new wp(2131232242, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f38302w = spannableStringBuilder;
        this.f38303x = false;
        this.f38304y.i(this.f38301s, false, true);
        this.f38304y.setOnClickListener(new h0(this, 2));
        this.D = new FrameLayout(context);
        l8Var.addView(this.f38304y, c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        l8Var.addView(this.D, c8.ha.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        l8Var.addView(this.actionBar);
        l8Var.addView(this.H);
        l8Var.addView(this.f38297e, c8.ha.c(-1.0f, -1));
        pc pcVar = new pc(l8Var);
        this.K = pcVar;
        pcVar.h = new g8(this, 0);
        this.fragmentView = l8Var;
        return l8Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t8.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.p10.i(this.currentAccount).q()) {
            return false;
        }
        m8 m8Var = this.f38292a;
        p8 p8Var = m8Var.h;
        if ((p8Var == null || !p8Var.f36838b) && !m8Var.f37951n) {
            return false;
        }
        return true;
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t8.k0():void");
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
            this.f38292a.f37955x = this.E;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25068r4, new Object[0]);
        }
        this.G.addUpdateListener(new ch.u(6, this, z10));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z9, z10, 2));
        if (z11) {
            this.G.setInterpolator(xq.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(xq.f40366f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void m0(boolean z9, long j3, TLRPC.Document document) {
        m8 m8Var = this.f38292a;
        m8Var.f37946a = j3;
        di.c4 c4Var = m8Var.f37948c;
        m8Var.f37947b = document;
        if (j3 == 0) {
            c4Var.setAnimatedEmojiDrawable(null);
            this.f38292a.f37948c.getImageReceiver().r0(org.telegram.messenger.hc.b(document), "100_100", null, null, org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f28017m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            c4Var.setAnimatedEmojiDrawable(new i5(14, this.currentAccount, j3));
            this.f38292a.f37948c.getImageReceiver().f();
        }
        if (this.f38292a.getImageReceiver() != null && this.f38292a.getImageReceiver().m() != null) {
            this.f38292a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.f38292a.getImageReceiver() != null && this.f38292a.getImageReceiver().B() != null) {
            this.f38292a.getImageReceiver().B().N(0, false, true);
        }
        this.f38299n = true;
        s0();
    }

    public final void n0(boolean z9, float f10) {
        boolean z10;
        this.E = f10;
        float f11 = ((this.d - this.f38296c) - org.telegram.messenger.g0.f22557m) * f10;
        if (this.N == 0.0f) {
            this.f38300r.setTranslationY(f11);
            this.f38304y.setTranslationY(f11);
        }
        this.f38292a.setTranslationY(((-(this.d - this.f38296c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z9) {
            m8 m8Var = this.f38292a;
            if (f10 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            m8Var.setExpanded(z10);
        }
    }

    public final void o0(float f10) {
        if (this.f38293a0 != f10) {
            this.f38293a0 = f10;
            int f11 = i0.a.f(f10, -16777216, -1);
            int o4 = i0.a.o(f11, 60);
            this.H.D(f11, false);
            this.R.setBackground(org.telegram.ui.ActionBar.k6.h0(o4, 3, -1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.f38299n) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131747279, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.T = M0;
                u1Var.R = org.telegram.messenger.id.M0(2131751406, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747581, null), new h8(this, 0));
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
        m8 m8Var = this.f38292a;
        if (m8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f38290c0[0];
        obj.f36839c = iArr[0];
        obj.d = iArr[1];
        obj.f36840e = iArr[2];
        obj.f36841f = iArr[3];
        m8Var.b(obj, false);
        s0();
        m8 m8Var2 = this.f38292a;
        m8Var2.f37946a = j3;
        m8Var2.f37948c.setAnimatedEmojiDrawable(new i5(14, this.currentAccount, j3));
        this.J.z1(obj);
        this.f38294b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i7;
        int i10;
        int i11;
        ?? obj = new Object();
        obj.f36839c = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f36840e = i10;
        if (videoSize.background_colors.size() > 3) {
            i11 = i0.a.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.f36841f = i11;
        this.f38292a.b(obj, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i12 = 0; i12 < m0.documents.size(); i12++) {
                    if (m0.documents.get(i12).f26962id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i12);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.J.z1(obj);
        this.f38294b.setForUser(true);
    }

    public final void r0(v8 v8Var) {
        p8 backgroundGradient = v8Var.getBackgroundGradient();
        m8 m8Var = this.f38292a;
        if (m8Var == null) {
            return;
        }
        m8Var.b(backgroundGradient, false);
        s0();
        if (v8Var.getAnimatedEmoji() != null) {
            long h = v8Var.getAnimatedEmoji().h();
            m8 m8Var2 = this.f38292a;
            m8Var2.f37946a = h;
            m8Var2.f37948c.setAnimatedEmojiDrawable(new i5(14, this.currentAccount, h));
        }
        this.J.z1(backgroundGradient);
        this.f38294b.setForUser(false);
    }

    public final void s0() {
        CharSequence charSequence;
        boolean j02 = j0();
        if (this.f38303x != j02) {
            fi.d dVar = this.f38304y;
            this.f38303x = j02;
            if (j02) {
                charSequence = this.f38302w;
            } else {
                charSequence = this.f38301s;
            }
            dVar.i(charSequence, true, true);
        }
    }
}
