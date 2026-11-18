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
public final class y8 extends org.telegram.ui.ActionBar.h2 {
    public static final int[][] f42392d0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f42393e0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public org.telegram.ui.ActionBar.k I;
    public g2 J;
    public v8 K;
    public tc L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final Paint P;
    public int Q;
    public boolean R;
    public org.telegram.ui.ActionBar.r0 S;
    public org.telegram.messenger.b9 T;
    public final s30 U;
    public boolean V;
    public TextView W;
    public TextView X;
    public final u30 Y;
    public u8 Z;
    public r8 f42394a;
    public boolean f42395a0;
    public s8 f42396b;
    public float f42397b0;
    public int f42398c;
    public ValueAnimator f42399c0;
    public int d;
    public View f42400e;
    public boolean f42401f;
    public boolean h;
    public boolean f42402n;
    public org.telegram.ui.d61 f42403r;
    public CharSequence f42404s;
    public SpannableStringBuilder f42405w;
    public boolean f42406x;
    public hi.d f42407y;

    public y8(u30 u30Var, s30 s30Var) {
        super(null);
        this.P = new Paint();
        this.R = true;
        this.f42395a0 = false;
        this.f42397b0 = 0.0f;
        this.Y = u30Var;
        this.U = s30Var;
    }

    public static void Z(y8 y8Var) {
        if (y8Var.getParentActivity() == null) {
            return;
        }
        if (y8Var.f42402n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y8Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131747085, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.U = M0;
            u1Var.S = org.telegram.messenger.gd.M0(2131751394, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747387, null), new m8(y8Var, 1));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            y8Var.showDialog(u1Var);
            u1Var.i();
            return;
        }
        y8Var.finishFragment();
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
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.l(kVar, 5, i7, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.f29486i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747087, null));
        this.actionBar.setActionBarMenuOnItemClick(new p8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.I = kVar2;
        kVar2.setCastShadows(false);
        this.I.setAddToContainer(false);
        this.I.setOccupyStatusBar(true);
        this.I.setClipChildren(false);
        int o4 = i0.a.o(-1, 60);
        this.I.I(-1, false);
        this.I.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.I.setAllowOverlayTitle(false);
        this.I.G(o4, false);
        org.telegram.ui.ActionBar.z t6 = this.I.t();
        t6.setClipChildren(false);
        s30 s30Var = this.U;
        if (s30Var != null && s30Var.f39470c == 2) {
            M0 = org.telegram.messenger.gd.M0(2131744173, null);
        } else {
            M0 = org.telegram.messenger.gd.M0(2131745324, null);
        }
        org.telegram.ui.ActionBar.r0 e10 = t6.e(1, M0);
        this.S = e10;
        e10.setBackground(org.telegram.ui.ActionBar.n6.h0(o4, 3, -1));
        this.I.setActionBarMenuOnItemClick(new p8(this, 1));
        this.f42403r = new org.telegram.ui.d61(10, getParentActivity(), this);
        q8 q8Var = new q8(this, context);
        q8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, q8Var, null);
        this.f42403r.setClipChildren(false);
        this.f42403r.setClipToPadding(false);
        this.f42403r.setPadding(0, org.telegram.messenger.g0.f24112m, 0, 0);
        this.f42403r.setOrientation(1);
        org.telegram.ui.d61 d61Var = this.f42403r;
        r8 r8Var = new r8(this, getParentActivity(), q8Var);
        this.f42394a = r8Var;
        d61Var.addView(r8Var);
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setText(org.telegram.messenger.gd.M0(2131752128, null));
        TextView textView2 = this.X;
        int i10 = org.telegram.ui.ActionBar.n6.f29786y6;
        org.telegram.ui.ActionBar.u6.U(textView2, i10, null);
        this.X.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.f42403r.addView(this.X, c8.ma.t(-1, -2, 0, 21, 10, 21, 10));
        di.d1 d1Var = new di.d1(this, getParentActivity());
        v8 v8Var = new v8(this, getParentActivity());
        this.K = v8Var;
        d1Var.addView(v8Var);
        this.f42403r.addView(d1Var, c8.ma.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.W = textView3;
        textView3.setText(org.telegram.messenger.gd.M0(2131752120, null));
        org.telegram.ui.ActionBar.u6.U(this.W, i10, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f42403r.addView(this.W, c8.ma.t(-1, -2, 0, 21, 18, 21, 10));
        s8 s8Var = new s8(this, this, getParentActivity(), getThemedColor(i7));
        this.f42396b = s8Var;
        s8Var.S = true;
        s8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f42396b.setClipChildren(false);
        this.f42403r.addView(this.f42396b, c8.ma.t(-1, -1, 0, 12, 0, 12, 12));
        this.f42403r.setClipChildren(false);
        q8Var.addView(this.f42403r, c8.ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f42400e = view;
        view.setVisibility(8);
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.f42407y = dVar;
        dVar.f();
        this.f42407y.d.r(false, false);
        int i11 = this.Y.W;
        if (i11 == 1) {
            this.f42404s = org.telegram.messenger.gd.M0(2131745344, null);
        } else if (i11 == 3) {
            this.f42404s = org.telegram.messenger.gd.M0(2131745341, null);
        } else if (i11 == 2) {
            this.f42404s = org.telegram.messenger.gd.M0(2131745330, null);
        } else if (s30Var != null && s30Var.f39470c == 2) {
            this.f42404s = org.telegram.messenger.gd.M0(2131744173, null);
        } else {
            this.f42404s = org.telegram.messenger.gd.M0(2131745328, null);
        }
        this.f42404s = new SpannableStringBuilder(this.f42404s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f42404s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new lq(2131232244, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f42405w = spannableStringBuilder;
        this.f42406x = false;
        this.f42407y.i(this.f42404s, false, true);
        this.f42407y.setOnClickListener(new n0(this, 2));
        this.E = new FrameLayout(context);
        q8Var.addView(this.f42407y, c8.ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        q8Var.addView(this.E, c8.ma.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        q8Var.addView(this.actionBar);
        q8Var.addView(this.I);
        q8Var.addView(this.f42400e, c8.ma.c(-1.0f, -1));
        tc tcVar = new tc(q8Var);
        this.L = tcVar;
        tcVar.h = new l8(this, 0);
        this.fragmentView = q8Var;
        return q8Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y8.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.j10.i(this.currentAccount).q()) {
            return false;
        }
        r8 r8Var = this.f42394a;
        u8 u8Var = r8Var.h;
        if ((u8Var == null || !u8Var.f40251b) && !r8Var.f41942n) {
            return false;
        }
        return true;
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y8.k0():void");
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
            this.f42394a.f41946x = this.F;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25202u4, new Object[0]);
        }
        this.H.addUpdateListener(new ch.v(6, this, z11));
        this.H.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.H.setInterpolator(lr.h);
            this.H.setDuration(350L);
            this.H.setStartDelay(150L);
        } else {
            this.H.setInterpolator(lr.f37208f);
            this.H.setDuration(250L);
        }
        this.H.start();
    }

    public final void m0(boolean z10, long j3, TLRPC.Document document) {
        r8 r8Var = this.f42394a;
        r8Var.f41937a = j3;
        fi.t3 t3Var = r8Var.f41939c;
        r8Var.f41938b = document;
        if (j3 == 0) {
            t3Var.setAnimatedEmojiDrawable(null);
            this.f42394a.f41939c.getImageReceiver().r0(org.telegram.messenger.fc.b(document), "100_100", null, null, org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29559m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            t3Var.setAnimatedEmojiDrawable(new o5(14, this.currentAccount, j3));
            this.f42394a.f41939c.getImageReceiver().f();
        }
        if (this.f42394a.getImageReceiver() != null && this.f42394a.getImageReceiver().m() != null) {
            this.f42394a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.f42394a.getImageReceiver() != null && this.f42394a.getImageReceiver().B() != null) {
            this.f42394a.getImageReceiver().B().N(0, false, true);
        }
        this.f42402n = true;
        s0();
    }

    public final void n0(boolean z10, float f10) {
        boolean z11;
        this.F = f10;
        float f11 = ((this.d - this.f42398c) - org.telegram.messenger.g0.f24112m) * f10;
        if (this.O == 0.0f) {
            this.f42403r.setTranslationY(f11);
            this.f42407y.setTranslationY(f11);
        }
        this.f42394a.setTranslationY(((-(this.d - this.f42398c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z10) {
            r8 r8Var = this.f42394a;
            if (f10 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            r8Var.setExpanded(z11);
        }
    }

    public final void o0(float f10) {
        if (this.f42397b0 != f10) {
            this.f42397b0 = f10;
            int f11 = i0.a.f(f10, -16777216, -1);
            int o4 = i0.a.o(f11, 60);
            this.I.I(f11, false);
            this.S.setBackground(org.telegram.ui.ActionBar.n6.h0(o4, 3, -1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f42402n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131747085, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.U = M0;
                u1Var.S = org.telegram.messenger.gd.M0(2131751394, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747387, null), new m8(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                showDialog(u1Var);
                u1Var.i();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), getClassGuid());
    }

    public final void p0(long j3) {
        r8 r8Var = this.f42394a;
        if (r8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f42392d0[0];
        obj.f40252c = iArr[0];
        obj.d = iArr[1];
        obj.f40253e = iArr[2];
        obj.f40254f = iArr[3];
        r8Var.b(obj, false);
        s0();
        r8 r8Var2 = this.f42394a;
        r8Var2.f41937a = j3;
        r8Var2.f41939c.setAnimatedEmojiDrawable(new o5(14, this.currentAccount, j3));
        this.K.z1(obj);
        this.f42396b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i7;
        int i10;
        int i11;
        ?? obj = new Object();
        obj.f40252c = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f40253e = i10;
        if (videoSize.background_colors.size() > 3) {
            i11 = i0.a.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.f40254f = i11;
        this.f42394a.b(obj, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(this.currentAccount).o0(tL_videoSizeStickerMarkup.stickerset, false);
            if (o02 != null) {
                for (int i12 = 0; i12 < o02.documents.size(); i12++) {
                    if (o02.documents.get(i12).f28409id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = o02.documents.get(i12);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.K.z1(obj);
        this.f42396b.setForUser(true);
    }

    public final void r0(a9 a9Var) {
        u8 backgroundGradient = a9Var.getBackgroundGradient();
        r8 r8Var = this.f42394a;
        if (r8Var == null) {
            return;
        }
        r8Var.b(backgroundGradient, false);
        s0();
        if (a9Var.getAnimatedEmoji() != null) {
            long h = a9Var.getAnimatedEmoji().h();
            r8 r8Var2 = this.f42394a;
            r8Var2.f41937a = h;
            r8Var2.f41939c.setAnimatedEmojiDrawable(new o5(14, this.currentAccount, h));
        }
        this.K.z1(backgroundGradient);
        this.f42396b.setForUser(false);
    }

    public final void s0() {
        CharSequence charSequence;
        boolean j02 = j0();
        if (this.f42406x != j02) {
            hi.d dVar = this.f42407y;
            this.f42406x = j02;
            if (j02) {
                charSequence = this.f42405w;
            } else {
                charSequence = this.f42404s;
            }
            dVar.i(charSequence, true, true);
        }
    }
}
