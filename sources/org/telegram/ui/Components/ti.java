package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class ti extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.q2, te.b {
    public static final int I4 = 0;
    public boolean A1;
    public final kg.j A2;
    public final RadialProgressView A3;
    public boolean A4;
    public boolean B1;
    public final th B2;
    public boolean B3;
    public boolean B4;
    public boolean C1;
    public final wh C2;
    public final n6 C3;
    public hi.j C4;
    public int D1;
    public final ImageView D2;
    public float D3;
    public final dh.g D4;
    public org.telegram.messenger.p10 E1;
    public final int[] E2;
    public int E3;
    public final ui.c E4;
    public int F1;
    public final th F2;
    public org.telegram.messenger.fj F3;
    public final dh.c F4;
    public int G1;
    public final bi G2;
    public boolean G3;
    public final dh.c G4;
    public boolean H1;
    public final TextPaint H2;
    public final int H3;
    public final jh H4;
    public boolean I1;
    public final RectF I2;
    public boolean I3;
    public boolean J1;
    public final Paint J2;
    public boolean J3;
    public boolean K1;
    public AnimatorSet K2;
    public boolean K3;
    public s30 L1;
    public long L2;
    public boolean L3;
    public boolean M1;
    public final ai.h0 M2;
    public boolean M3;
    public final oc0 N1;
    public final yh N2;
    public boolean N3;
    public rn O1;
    public int O2;
    public boolean O3;
    public u30 P1;
    public dt P2;
    public boolean P3;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public bk S1;
    public boolean S2;
    public boolean S3;
    public aj T1;
    public final float T2;
    public float T3;
    public long U1;
    public long U2;
    public float U3;
    public boolean V1;
    public final u7 V2;
    public ValueAnimator V3;
    public final dh.d W1;
    public AnimatorSet W2;
    public int W3;
    public boolean X1;
    public AnimatorSet X2;
    public ri X3;
    public float Y1;
    public final org.telegram.ui.ActionBar.q0 Y2;
    public dn Y3;
    public final ei Z1;
    public final hi.d0 Z2;
    public final int[] Z3;
    public final org.telegram.ui.ActionBar.g2 f39956a2;
    public final org.telegram.ui.ActionBar.q0 f39957a3;
    public int f39958a4;
    public final boolean f39959b2;
    public hi.u3 f39960b3;
    public float f39961b4;
    public ef f39962c2;
    public final org.telegram.ui.ActionBar.q0 f39963c3;
    public float f39964c4;
    public boolean d2;
    public final gi.j f39965d3;
    public boolean f39966d4;
    public final ChatAttachAlertPhotoLayout f39967e2;
    public float f39968e3;
    public float f39969e4;
    public uj f39970f2;
    public float f39971f3;
    public final boolean f39972f4;
    public dj f39973g2;
    public final th f39974g3;
    public boolean f39975g4;
    public qn f39976h2;
    public final TextView f39977h3;
    public final ArrayList f39978h4;
    public qn f39979i2;
    public final org.telegram.ui.ActionBar.q0 f39980i3;
    public final Rect f39981i4;
    public kl f39982j2;
    public final LinearLayout j3;
    public float f39983j4;
    public kk f39984k2;
    public final ImageView f39985k3;
    public boolean f39986k4;
    public pm f39987l2;
    public final LinearLayout f39988l3;
    public int f39989l4;
    public final te.a f39990m1;
    public gj f39991m2;
    public final TextView f39992m3;
    public final ei f39993m4;
    public final te.a n1;
    public kg.h0 f39994n2;
    public float f39995n3;
    public r1.g f39996n4;
    public final te.a f39997o1;
    public lk f39998o2;
    public boolean f39999o3;
    public AnimatorSet o4;
    public final te.a f40000p1;
    public lk f40001p2;
    public final gi f40002p3;
    public int f40003p4;
    public final te.a f40004q1;
    public oi.p f40005q2;
    public boolean f40006q3;
    public int f40007q4;
    public final te.a f40008r1;
    public xk f40009r2;
    public Object f40010r3;
    public boolean f40011r4;
    public final te.j f40012s1;
    public boolean f40013s2;
    public boolean f40014s3;
    public boolean f40015s4;
    public org.telegram.ui.zm f40016t1;
    public float f40017t2;
    public final lh.f f40018t3;
    public boolean f40019t4;
    public final n6 f40020u1;
    public final li[] f40021u2;
    public final vh f40022u3;
    public jl f40023u4;
    public final n6 f40024v1;
    public final LongSparseArray f40025v2;
    public final th f40026v3;
    public boolean f40027v4;
    public final ImageView f40028w1;
    public li f40029w2;
    public final uh f40030w3;
    public boolean f40031w4;
    public final org.telegram.ui.ActionBar.v2 f40032x1;
    public li f40033x2;
    public final v4.c0 f40034x3;
    public File f40035x4;
    public final ImageView f40036y1;
    public final fh.g f40037y2;
    public final qi f40038y3;
    public double[] f40039y4;
    public final org.telegram.ui.ActionBar.v2 f40040z1;
    public final fh.g f40041z2;
    public boolean f40042z3;
    public boolean f40043z4;

    public ti(Activity activity, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11) {
        this(activity, g2Var, z10, z11, true, null);
    }

    public static void J0(ti tiVar) {
        boolean z10;
        boolean q10;
        int i7;
        u7 u7Var = tiVar.V2;
        lh.f fVar = tiVar.f40018t3;
        if (fVar != null && u7Var != null) {
            li liVar = tiVar.f40033x2;
            if (liVar == null) {
                liVar = tiVar.f40029w2;
            }
            int i10 = 0;
            if (liVar != null && liVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.i6 i6Var = tiVar.J0;
            if (i6Var != null) {
                q10 = i6Var.b();
            } else {
                q10 = org.telegram.ui.ActionBar.n6.I.q();
            }
            if (!z10 && u7Var.getVisibility() == 0) {
                if (q10) {
                    i7 = 255;
                } else {
                    i7 = 160;
                }
                i10 = (int) (u7Var.getAlpha() * i7);
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void L0(ti tiVar) {
        hi.j jVar = new hi.j(tiVar, tiVar.getContext(), tiVar.U1, LaunchActivity.Q(), tiVar.J0, 1);
        tiVar.C4 = jVar;
        jVar.p(new org.telegram.ui.Cells.aa(tiVar, 3));
        ViewGroup viewGroup = tiVar.f30226b;
        viewGroup.addView(tiVar.C4, viewGroup.indexOfChild(tiVar.B2), c8.na.e(-1, -1, 83));
        hi.j jVar2 = tiVar.C4;
        jVar2.getAdapter().f17598c = false;
        jVar2.getAdapter().d = false;
        jVar2.getAdapter().f17601e = false;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
        boolean z10 = true;
        if (g2Var instanceof org.telegram.ui.bn) {
            jVar2.getAdapter().f17612n0 = false;
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            jg.h1 adapter = jVar2.getAdapter();
            bnVar.j();
            TLRPC.Chat chat = bnVar.f46173e;
            adapter.getClass();
            adapter.m0 = chat;
            jVar2.getAdapter().W(bnVar.f46349r8);
            jg.h1 adapter2 = jVar2.getAdapter();
            if (bnVar.f46173e == null) {
                z10 = false;
            }
            adapter2.f17604f0 = z10;
        } else {
            jVar2.getAdapter().f17612n0 = true;
            jVar2.getAdapter().W(null);
            jVar2.getAdapter().f17604f0 = false;
        }
        jVar2.getAdapter().f17605g0 = false;
        tiVar.K1();
    }

    public static int M0(ti tiVar) {
        li liVar = tiVar.f40029w2;
        qn qnVar = tiVar.f39976h2;
        if (liVar == qnVar && qnVar.F != null) {
            return qnVar.getEmojiPadding();
        }
        qn qnVar2 = tiVar.f39979i2;
        if (liVar == qnVar2 && qnVar2.F != null) {
            return qnVar2.getEmojiPadding();
        }
        if (tiVar.X1) {
            return tiVar.N2.getEmojiPadding();
        }
        return tiVar.C2.getEmojiPadding();
    }

    public static boolean h1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.n10.C(user) && !org.telegram.messenger.n10.u(user) && !org.telegram.messenger.n10.y(user) && !org.telegram.messenger.n10.B(user.f28641id) && !org.telegram.messenger.n10.A(user) && !org.telegram.messenger.n10.t(user) && user.f28641id != 489000 && !org.telegram.messenger.mp.L2(user)) {
            return true;
        }
        return false;
    }

    public static void t1(li liVar) {
        if (liVar != null) {
            int i7 = org.telegram.ui.ActionBar.u6.f30164b;
            Object tag = liVar.getTag(2131296712);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
                return;
            }
            liVar.setTag(2131296712, Integer.valueOf(i7));
            try {
                org.telegram.ui.ActionBar.u6.c0(liVar, true);
                liVar.d();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void A1(float f10) {
        boolean z10 = false;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o4;
        org.telegram.messenger.g0.s3(this, o4, false, null);
        if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.m3(this, z10);
        this.f30229c.invalidate();
    }

    public final void B1(String str) {
        boolean z10 = true;
        this.O2 = 1;
        this.A1 = true;
        this.Q2 = false;
        this.K3 = false;
        this.f40026v3.setVisibility(8);
        this.f39977h3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
        if (chatAttachAlertPhotoLayout != null) {
            ti tiVar = chatAttachAlertPhotoLayout.f37135b;
            if (tiVar.O2 == 0 || tiVar.A1) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f32882h1 = z10;
        }
    }

    public final void C1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.C1(boolean):void");
    }

    public final void D1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.D1(long, java.lang.String, boolean, boolean):void");
    }

    public final void E1(org.telegram.ui.ActionBar.g2 g2Var) {
        if ((g2Var instanceof org.telegram.ui.bn) && org.telegram.messenger.v3.V(((org.telegram.ui.bn) g2Var).f46173e)) {
            new kc(this.f40002p3, this.J0).f(org.telegram.messenger.mp.u1(this.H3).X4, new xd(6, this, g2Var)).j();
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final boolean F1(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        boolean z13;
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        li liVar;
        float f19;
        float L;
        long P1;
        float f20;
        float f21;
        u7 u7Var;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float L2;
        this.n1.a(z10, true);
        th thVar = this.B2;
        if (thVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return false;
        }
        AnimatorSet animatorSet = this.K2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        thVar.setTag(num);
        wh whVar = this.C2;
        if (whVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(whVar.getEditText());
        }
        whVar.k(true);
        this.N2.k(true);
        th thVar2 = this.f40026v3;
        th thVar3 = this.F2;
        if (z10) {
            if (!this.I1) {
                thVar.setVisibility(0);
            }
            thVar3.setVisibility(0);
        } else if (this.Q2) {
            thVar2.setVisibility(0);
        }
        li liVar2 = this.f40029w2;
        if ((liVar2 == this.f39967e2 || liVar2 == this.f39987l2) && this.X1) {
            z13 = true;
        } else {
            z13 = false;
        }
        u7 u7Var2 = this.V2;
        ai.h0 h0Var = this.M2;
        kg.j jVar = this.A2;
        bi biVar = this.G2;
        float f29 = 1.0f;
        if (z11) {
            this.K2 = new AnimatorSet();
            if (z13) {
                h0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar, property, f20));
            if (z10 && !z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f21));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                u7Var = u7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                u7Var = u7Var2;
            }
            if (z10 && z13) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h0Var, property, f22));
            Property property2 = View.SCALE_X;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar3, property2, f23));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar3, property3, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar3, property, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(biVar, property2, f26));
            if (z10) {
                f27 = 1.0f;
            } else {
                f27 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(biVar, property3, f27));
            if (u7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(thVar, property4, L2));
            } else if (this.Q2) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f28 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(thVar2, property5, f28));
                if (z10) {
                    f29 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(thVar2, property, f29));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dh(this, 5));
                arrayList.add(ofFloat);
            }
            this.K2.playTogether(arrayList);
            this.K2.setInterpolator(new DecelerateInterpolator());
            this.K2.setDuration(180L);
            this.K2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z13, 3));
            this.K2.start();
            i7 = 0;
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            thVar.setAlpha(f10);
            if (z10 && z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            jVar.setAlpha(f11);
            if (z10 && !z13) {
                i7 = 0;
                jVar.setVisibility(0);
                f12 = 0.0f;
                jVar.setTranslationY(0.0f);
            } else {
                f12 = 0.0f;
                i7 = 0;
            }
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            thVar3.setScaleX(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            thVar3.setScaleY(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = f12;
            }
            thVar3.setAlpha(f15);
            if (z10 && z13) {
                i10 = i7;
            } else {
                i10 = 8;
            }
            h0Var.setVisibility(i10);
            if (z10 && z13) {
                f16 = 1.0f;
            } else {
                f16 = f12;
            }
            h0Var.setAlpha(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            biVar.setScaleX(f17);
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            biVar.setScaleY(f18);
            if (u7Var2.getTag() != null) {
                if (z10) {
                    L = f12;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                thVar.setTranslationY(L);
            } else if (this.Q2 && ((liVar = this.f40029w2) == null || liVar.N())) {
                if (z10) {
                    f19 = org.telegram.messenger.g0.L(84.0f);
                } else {
                    f19 = f12;
                }
                thVar2.setTranslationY(f19);
            }
            if (!z10) {
                thVar.setVisibility(4);
                thVar3.setVisibility(4);
            }
            if (z13) {
                R1();
            }
        }
        if (z10) {
            i7 = Math.max(1, this.f40029w2.getSelectedItemsCount());
        }
        biVar.e(i7, z11);
        if (this.F3 != null) {
            P1 = 0;
        } else {
            P1 = org.telegram.messenger.mp.u1(this.H3).P1(c1());
        }
        biVar.i(Y0() + this.f40029w2.getSelectedItemsCount(), P1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) whVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), biVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            whVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void G1(li liVar) {
        long j3 = this.U2;
        rn rnVar = this.O1;
        if (liVar == rnVar) {
            j3 = rnVar.f39357s;
        } else if (liVar == this.f39967e2) {
            j3 = 1;
        } else if (liVar == this.f39973g2) {
            j3 = 3;
        } else if (liVar == this.f39984k2) {
            j3 = 4;
        } else if (liVar == this.f39970f2) {
            j3 = 5;
        } else if (liVar == this.f39982j2) {
            j3 = 6;
        } else if (liVar == this.f39976h2) {
            j3 = 9;
        } else if (liVar == this.f39991m2) {
            j3 = 10;
        } else if (liVar == this.f39994n2) {
            j3 = 11;
        } else if (liVar == this.f39979i2) {
            j3 = 12;
        } else if (liVar == this.f39998o2) {
            j3 = 14;
        } else if (liVar == this.f40001p2) {
            j3 = 13;
        } else if (liVar == this.f40005q2) {
            j3 = 16;
        } else if (liVar == this.f40009r2) {
            j3 = 17;
        }
        H1(liVar, j3, true);
    }

    @Override
    public final boolean H() {
        return this.f40029w2.b();
    }

    @Override
    public final boolean H0() {
        li liVar = this.f40029w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
        if (liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f32886j1) {
            return true;
        }
        return false;
    }

    public final void H1(li liVar, long j3, boolean z10) {
        boolean z11;
        int i7;
        em emVar;
        boolean z12;
        Integer num;
        em emVar2;
        int i10;
        int L;
        Float f10;
        int i11;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f40010r3 == null && this.K2 == null) {
            li liVar2 = this.f40029w2;
            if (liVar2 == liVar) {
                liVar2.J();
            } else if (liVar == this.f39979i2 && !org.telegram.messenger.i10.i(this.H3).q()) {
                new ug.y0(this.f39956a2, 39, false).show();
            } else {
                int i12 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f40004q1.a(z11, z10);
                this.f40012s1.f(Long.valueOf(j3), z10);
                this.B3 = false;
                this.f40042z3 = false;
                this.D3 = 0.0f;
                this.C3.setVisibility(8);
                RadialProgressView radialProgressView = this.A3;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                th thVar = this.f40026v3;
                thVar.setAlpha(1.0f);
                thVar.setTranslationY(this.D3);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f40025v2;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((ki.t3) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.U2 = j3;
                uh uhVar = this.f40030w3;
                int childCount = uhVar.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = uhVar.getChildAt(i14);
                    if (childAt instanceof ni) {
                        ni niVar = (ni) childAt;
                        i11 = childCount;
                        f10 = valueOf;
                        if (niVar.f37834b == niVar.f37835c.U2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar.f38160a.f(z13, true);
                    } else {
                        f10 = valueOf;
                        i11 = childCount;
                        if (childAt instanceof mi) {
                            ((mi) childAt).a(true);
                        }
                    }
                    i14++;
                    childCount = i11;
                    valueOf = f10;
                }
                Float f11 = valueOf;
                int firstOffset = (this.f40029w2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Z3[0];
                this.f40033x2 = liVar;
                T0(liVar);
                if (this.f40033x2.j() != 0) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                u7 u7Var = this.V2;
                u7Var.setVisibility(i7);
                if (u7Var.f29166o0) {
                    u7Var.n(true);
                }
                this.f40029w2.u();
                li liVar3 = this.f40033x2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
                if (liVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f40033x2.H(this.f40029w2);
                this.f40033x2.setVisibility(0);
                if (liVar.getParent() != null) {
                    this.f30226b.removeView(this.f40033x2);
                }
                int indexOfChild = this.f30226b.indexOfChild(this.f40029w2);
                if (this.f40033x2.getParent() != this.f30226b) {
                    t1(this.f40033x2);
                    ViewGroup viewGroup = this.f30226b;
                    li liVar4 = this.f40033x2;
                    if (liVar4 != this.f39982j2) {
                        indexOfChild++;
                    }
                    viewGroup.addView(liVar4, indexOfChild, c8.na.c(-1.0f, -1));
                }
                fh fhVar = new fh(this, 5);
                li liVar5 = this.f40029w2;
                boolean z14 = liVar5 instanceof pm;
                ei eiVar = this.Z1;
                if (!z14 && !(this.f40033x2 instanceof pm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f40033x2.setAlpha(0.0f);
                        this.f40033x2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40029w2, View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f40029w2, eiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(u7Var, View.ALPHA, u7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(kr.f36858f);
                        animatorSet.addListener(new di.a4(this, firstOffset, fhVar, 1));
                        this.f40010r3 = animatorSet;
                        li liVar6 = this.f40029w2;
                        eiVar.getClass();
                        eiVar.a(liVar6, f11);
                        animatorSet.start();
                    } else {
                        liVar5.setAlpha(0.0f);
                        fhVar.run();
                        Q1(0);
                        this.f30226b.invalidate();
                    }
                } else {
                    int max = Math.max(this.f40033x2.getWidth(), this.f40029w2.getWidth());
                    li liVar7 = this.f40033x2;
                    if (liVar7 instanceof pm) {
                        liVar7.setTranslationX(max);
                        li liVar8 = this.f40029w2;
                        if ((liVar8 instanceof ChatAttachAlertPhotoLayout) && (emVar2 = ((ChatAttachAlertPhotoLayout) liVar8).Q) != null) {
                            emVar2.setVisibility(4);
                        }
                    } else {
                        this.f40029w2.setTranslationX(-max);
                        li liVar9 = this.f40033x2;
                        if (liVar9 == chatAttachAlertPhotoLayout && (emVar = ((ChatAttachAlertPhotoLayout) liVar9).Q) != null) {
                            emVar.setVisibility(0);
                        }
                    }
                    this.f40033x2.setAlpha(1.0f);
                    this.f40029w2.setAlpha(1.0f);
                    if (z10) {
                        li liVar10 = this.f40029w2;
                        eiVar.getClass();
                        eiVar.a(liVar10, f11);
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa(this, liVar, fhVar, 7));
                    } else {
                        if (this.f40033x2.getCurrentItemTop() <= liVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f40029w2.v(1.0f);
                        this.f40033x2.v(1.0f);
                        this.f40029w2.m(this.f39983j4);
                        this.f40033x2.m(this.f39983j4);
                        this.f30226b.invalidate();
                        this.Y0.g();
                        li liVar11 = this.f40029w2;
                        Float valueOf2 = Float.valueOf(1.0f);
                        eiVar.getClass();
                        eiVar.a(liVar11, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        u7Var.setTag(num);
                        fhVar.run();
                    }
                }
                if (this.f39986k4 && !(liVar instanceof ki.t3)) {
                    i10 = 0;
                    this.f39986k4 = false;
                    u7Var.updateColors();
                    u7Var.invalidate();
                    j1();
                } else {
                    i10 = 0;
                }
                if (i12 != 0 && j3 != 6 && j3 != 17 && !(liVar instanceof ki.t3)) {
                    if (j3 == 4) {
                        L = org.telegram.messenger.g0.L(84.0f);
                    } else {
                        L = i10;
                    }
                } else {
                    L = org.telegram.messenger.g0.L(46.0f);
                }
                u7Var.setForcedMenuWidth(L);
            }
        }
    }

    public final void I1(boolean z10, Boolean bool) {
        ti tiVar;
        if (this.f39976h2 == null) {
            tiVar = this;
            qn qnVar = new qn(tiVar, getContext(), false, this.J0, bool);
            tiVar.f39976h2 = qnVar;
            tiVar.f40021u2[1] = qnVar;
            qnVar.setDelegate(new ch(this, 17));
        } else {
            tiVar = this;
        }
        H1(tiVar.f39976h2, 9L, z10);
    }

    @Override
    public final void J() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.f39996n4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.o4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = 0;
        }
    }

    public final void J1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f10;
        float f11;
        li liVar;
        float f12;
        float f13;
        float f14;
        int i7;
        boolean z13;
        this.f39997o1.a(z10, z11);
        u7 u7Var = this.V2;
        if ((z10 && u7Var.getTag() == null) || (!z10 && u7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            u7Var.setTag(num);
            AnimatorSet animatorSet = this.W2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W2 = null;
            }
            if (!this.A1 && !this.R2 && ((this.O2 != 0 || !this.f39999o3) && this.f40029w2 == this.f39967e2 && (this.J3 || this.K3))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f40029w2 == this.O1) {
                z12 = false;
            }
            th thVar = this.f40026v3;
            org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
            if (z10) {
                if (z12) {
                    q0Var.setVisibility(0);
                    q0Var.setClickable(true);
                }
            } else if (this.Q2 && this.B2.getTag() == null) {
                thVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
            if (g2Var != null) {
                if (z10) {
                    if (this.f39972f4) {
                        i7 = org.telegram.ui.ActionBar.n6.f29590kh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29524h5;
                    }
                    if (i0.a.h(org.telegram.ui.ActionBar.n6.w0(i7, this.J0)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.messenger.g0.p3(this, z13);
                } else {
                    org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
                }
            }
            float f15 = 0.6f;
            float f16 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W2 = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f12 - u7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u7Var, property, f13);
                ofFloat.addUpdateListener(new dh(this, 4));
                arrayList.add(ofFloat);
                if (z12) {
                    if (z10) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q0Var, property, f16));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q0Var, property2, f14));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q0Var, property3, f15));
                }
                this.W2.playTogether(arrayList);
                this.W2.addListener(new org.telegram.ui.on(3, this, z10));
                this.W2.setInterpolator(kr.h);
                this.W2.setDuration(380L);
                this.W2.start();
                return;
            }
            if (z10 && this.Q2 && ((liVar = this.f40029w2) == null || liVar.N())) {
                thVar.setVisibility(4);
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            u7Var.setAlpha(f10);
            if (z12) {
                if (z10) {
                    f16 = 1.0f;
                }
                q0Var.setAlpha(f16);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                q0Var.setScaleX(f11);
                if (z10) {
                    f15 = 1.0f;
                }
                q0Var.setScaleY(f15);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.q0 q0Var2 = this.f39963c3;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(4);
                }
                if (this.O2 != 0 || !this.f39999o3) {
                    q0Var.setVisibility(4);
                }
            }
        }
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        li liVar;
        int i10;
        if (i7 == 0) {
            V0();
            S0();
            return;
        }
        int i11 = 1;
        if (i7 == 2) {
            S0();
            qn qnVar = this.f39976h2;
            if (qnVar != null && ((liVar = this.f40033x2) == qnVar || this.f40029w2 == qnVar)) {
                if (liVar == qnVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                Q1(i10);
            }
            qn qnVar2 = this.f39979i2;
            if (qnVar2 != null) {
                li liVar2 = this.f40033x2;
                if (liVar2 == qnVar2 || this.f40029w2 == qnVar2) {
                    if (liVar2 != qnVar2) {
                        i11 = 0;
                    }
                    Q1(i11);
                }
            }
        } else if (i7 == 1) {
            S0();
        } else if (i7 == 3) {
            U0();
        } else if (i7 == 4) {
            U0();
        } else if (i7 == 5) {
            U0();
            bi biVar = this.G2;
            if (biVar != null) {
                biVar.setEphemeralFactor(f10);
                biVar.setSameWidthFactor(f10);
            }
        }
    }

    public final void K1() {
        float alpha;
        int[] iArr = this.E2;
        wh whVar = this.C2;
        whVar.getLocationOnScreen(iArr);
        if (this.C4 != null) {
            li liVar = this.f40029w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
            if ((liVar == chatAttachAlertPhotoLayout || liVar == this.f39987l2) && this.X1) {
                ai.h0 h0Var = this.M2;
                alpha = (h0Var.getAlpha() * h0Var.getMeasuredHeight()) + (h0Var.getY() - this.C4.getTop());
            } else {
                alpha = -whVar.getHeight();
            }
            if (Math.abs(this.C4.getTranslationY() - alpha) > 0.5f) {
                this.C4.setTranslationY(alpha);
                this.C4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                }
            }
        }
        V0();
    }

    @Override
    public void L() {
        ri riVar = this.X3;
        if (riVar != null) {
            riVar.S(new fh(this, 4));
        } else {
            u1();
        }
    }

    public final void L1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.L1(int):void");
    }

    @Override
    public final void M(int i7) {
        super.M(i7);
        this.f40029w2.r(i7);
    }

    public final void M1() {
        boolean i7;
        float f10;
        float f11;
        float f12;
        li liVar = this.f40029w2;
        int i10 = 0;
        if (liVar == null) {
            i7 = false;
        } else {
            i7 = liVar.i();
        }
        gi.j jVar = this.f39965d3;
        jVar.setEnabled(i7);
        li liVar2 = this.f40029w2;
        float f13 = 0.5f;
        if (liVar2 != null) {
            if (liVar2.i()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f40033x2 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.Y1;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        li liVar3 = this.f40033x2;
        if (liVar3 != null) {
            if (liVar3.i()) {
                f13 = 1.0f;
            }
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.Y1, f13, f10);
        }
        this.f39968e3 = f10;
        if (jVar != null) {
            float f14 = f10 * this.f39971f3;
            jVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            jVar.setVisibility(i10);
        }
    }

    public final void N0() {
        if (b1().f41719a.length() <= 0) {
            return;
        }
        this.f40029w2.a(b1().getText());
    }

    public final void N1(li liVar, int i7) {
        boolean z10;
        int i10;
        int i11;
        if (liVar != null) {
            dh.g gVar = this.D4;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                gVar.f(0.0f, i7);
            }
            int currentItemTop = liVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (liVar == this.f40029w2 && currentItemTop <= liVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.M1 = z10;
                if (liVar == this.f40029w2) {
                    J1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int i12 = org.telegram.ui.Cells.c0.i(11.0f, i10, currentItemTop);
                li liVar2 = this.f40029w2;
                if (liVar2 == liVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((liVar2 instanceof pm) || (this.f40033x2 instanceof pm)) {
                    Object obj = this.f40010r3;
                    if ((obj instanceof r1.g) && ((r1.g) obj).f56440f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.Z3;
                int i13 = iArr[i11];
                if (i13 == i12 && !z11) {
                    if (i7 != 0) {
                        this.f39958a4 = i13;
                        return;
                    }
                    return;
                }
                this.f39958a4 = i13;
                iArr[i11] = i12;
                Q1(i11);
                this.f30226b.invalidate();
            }
        }
    }

    public final boolean O0() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).Z6()) {
            return true;
        }
        return false;
    }

    public final void O1(boolean z10) {
        hi.d0 d0Var;
        boolean z11;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
        if (chatAttachAlertPhotoLayout != null && (d0Var = this.Z2) != null) {
            int i7 = 0;
            if (this.f39999o3 && this.d2 && this.f40029w2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.V();
            d0Var.f14294f = z12;
            if (!z10) {
                ((c6) d0Var.f14295g).a(z12);
            }
            d0Var.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.q0 q0Var = this.f39957a3;
            if (z10 && this.f39999o3) {
                q0Var.setVisibility(0);
                ViewPropertyAnimator animate = q0Var.animate();
                if (z11) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z11) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(kr.h).withEndAction(new oh(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i7 = 8;
            }
            q0Var.setVisibility(i7);
            if (z11) {
                f12 = 1.0f;
            }
            q0Var.setAlpha(f12);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            q0Var.setScaleX(f10);
            if (z11) {
                f13 = 1.0f;
            }
            q0Var.setScaleY(f13);
        }
    }

    public final boolean P0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ChatActivityEnterView.N(this.H3, ((org.telegram.ui.bn) g2Var).a(), g2Var, charSequence);
        }
        return false;
    }

    public final void P1(boolean z10) {
        boolean z11;
        float f10;
        li liVar = this.f39967e2;
        if (z10) {
            if (!this.H1) {
                return;
            }
            if (this.f39987l2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.i6 i6Var = this.f40016t1;
                if (i6Var == null) {
                    i6Var = this.J0;
                }
                ?? liVar2 = new li(context, i6Var, this);
                liVar2.E = 0.0f;
                liVar2.F = 0.0f;
                liVar2.G = 0.0f;
                liVar2.H = 0.0f;
                liVar2.I = 0.0f;
                liVar2.J = 0.0f;
                liVar2.K = null;
                liVar2.L = false;
                liVar2.N = 0.0f;
                liVar2.R = false;
                liVar2.T = false;
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                liVar2.U = z11;
                liVar2.f38509n = i6Var;
                liVar2.f37138f = true;
                liVar2.setWillNotDraw(false);
                ti tiVar = liVar2.f37135b;
                org.telegram.ui.ActionBar.y s5 = tiVar.V2.s();
                TextView textView = new TextView(context);
                liVar2.f38514y = textView;
                org.telegram.ui.ActionBar.i6 i6Var2 = liVar2.f37134a;
                hi.d3 d3Var = new hi.d3(liVar2, context, s5, i6Var2, 2);
                u7 u7Var = tiVar.V2;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                u7Var.addView(d3Var, 0, c8.na.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var2);
                textView.setText(org.telegram.messenger.gd.N0(2131753955, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                d3Var.addView(textView, c8.na.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                di.b1 b1Var = new di.b1(liVar2, context, i6Var2, 17);
                liVar2.f38510r = b1Var;
                b1Var.setAdapter(new org.telegram.ui.z7(liVar2, 3));
                v4.c0 c0Var = new v4.c0(1, false);
                liVar2.f38511s = c0Var;
                b1Var.setLayoutManager(c0Var);
                b1Var.setClipChildren(false);
                b1Var.setClipToPadding(false);
                b1Var.setOverScrollMode(2);
                b1Var.setVerticalScrollBarEnabled(false);
                om omVar = new om(liVar2, context);
                liVar2.f38512w = omVar;
                omVar.setClipToPadding(true);
                omVar.setClipChildren(true);
                liVar2.addView(b1Var, c8.na.c(-1.0f, -1));
                liVar2.Q = tiVar.f39967e2;
                omVar.f38209c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar2.Q;
                omVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                omVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                omVar.c();
                UndoView undoView = new UndoView(context, null, false, tiVar.f40016t1);
                liVar2.f38513x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                liVar2.addView(undoView, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                liVar2.O = context.getResources().getDrawable(2131232554);
                this.f39987l2 = liVar2;
                liVar2.bringToFront();
            }
            li liVar3 = this.f40029w2;
            pm pmVar = this.f39987l2;
            if (liVar3 != pmVar) {
                liVar = pmVar;
            }
            G1(liVar);
            return;
        }
        G1(liVar);
    }

    public final void Q0() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        uh uhVar = this.f40030w3;
        if (uhVar == null) {
            return;
        }
        int childCount = uhVar.getChildCount();
        boolean z11 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            uhVar.getChildAt(i17);
        }
        boolean z12 = this.f39972f4;
        if (z12) {
            i7 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        }
        org.telegram.ui.ActionBar.u6.U(this.f39977h3, i7, this.J0);
        if (z12) {
            i10 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29559j5;
        }
        org.telegram.ui.ActionBar.u6.U(this.f39992m3, i10, this.J0);
        org.telegram.ui.ActionBar.u6.U(this.f39965d3, org.telegram.ui.ActionBar.n6.Ji, this.J0);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29559j5;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        if (this.f40011r4 && w02 == this.f40007q4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f40011r4 = true;
        this.f40007q4 = w02;
        org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
        if (z10) {
            q0Var.setIconColor(w02);
        }
        Drawable background = q0Var.getBackground();
        if (z12) {
            i12 = org.telegram.ui.ActionBar.n6.Zg;
        } else {
            i12 = org.telegram.ui.ActionBar.n6.I5;
        }
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), background);
        int i18 = org.telegram.ui.ActionBar.n6.E8;
        q0Var.P(org.telegram.ui.ActionBar.n6.w0(i18, this.J0), false);
        q0Var.P(org.telegram.ui.ActionBar.n6.w0(i18, this.J0), true);
        q0Var.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.J0));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f39957a3;
        if (q0Var2 != null && z10) {
            q0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.f39963c3;
        if (q0Var3 != null) {
            if (z10) {
                q0Var3.setIconColor(w02);
            }
            Drawable background2 = q0Var3.getBackground();
            if (z12) {
                i16 = org.telegram.ui.ActionBar.n6.Zg;
            } else {
                i16 = org.telegram.ui.ActionBar.n6.I5;
            }
            org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i16, this.J0), background2);
        }
        wh whVar = this.C2;
        org.telegram.ui.ActionBar.i6 i6Var = whVar.N;
        rt rtVar = whVar.f41719a;
        int i19 = whVar.M;
        if (i19 == 0) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, i6Var));
            int i20 = org.telegram.ui.ActionBar.n6.G6;
            rtVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i20, i6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(i20, i6Var));
        } else if (i19 != 2 && i19 != 3) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29747t5, i6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29559j5, i6Var));
        } else {
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.E = -1;
        }
        whVar.f41721c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Oe, i6Var), PorterDuff.Mode.MULTIPLY));
        st stVar = whVar.d;
        if (stVar != null) {
            stVar.updateColors();
        }
        org.telegram.ui.ActionBar.u6.l(uhVar, 21, org.telegram.ui.ActionBar.n6.A5, this.J0);
        if (z12) {
            i13 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i13 = org.telegram.ui.ActionBar.n6.f29559j5;
        }
        org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
        u7 u7Var = this.V2;
        org.telegram.ui.ActionBar.u6.l(u7Var, 1, i13, i6Var2);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.n6.Zg;
        } else {
            i14 = org.telegram.ui.ActionBar.n6.I5;
        }
        org.telegram.ui.ActionBar.u6.l(u7Var, 3, i14, this.J0);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i15 = org.telegram.ui.ActionBar.n6.f29559j5;
        }
        org.telegram.ui.ActionBar.u6.l(u7Var, 5, i15, this.J0);
        int e12 = e1(false);
        org.telegram.ui.ActionBar.n6.C1(e12, this.f30259s0);
        ui.c cVar = this.E4;
        if (cVar.f59123b != e12) {
            cVar.a(e12);
            lh.f fVar = this.f40018t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            vh vhVar = this.f40022u3;
            if (vhVar != null) {
                vhVar.invalidate();
            }
        }
        this.f30226b.invalidate();
        int i21 = 0;
        while (true) {
            li[] liVarArr = this.f40021u2;
            if (i21 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i21];
            if (liVar != null) {
                liVar.d();
            }
            i21++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29542i5, this.J0);
            org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z11 = true;
            }
            org.telegram.messenger.g0.m3(this, z11);
            return;
        }
        Q(org.telegram.ui.ActionBar.n6.f29524h5);
    }

    public final void Q1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.Q1(int):void");
    }

    public final void R0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.R0(boolean):void");
    }

    public final void R1() {
        int i7 = 0;
        Q1(0);
        this.f40002p3.invalidate();
        ai.h0 h0Var = this.M2;
        h0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
        if (chatAttachAlertPhotoLayout != null) {
            xl xlVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.Y();
            if (xlVar != null && xlVar.getFastScroll() != null) {
                jj0 fastScroll = xlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f32898q1;
                if (this.X1) {
                    i7 = (int) (h0Var.getAlpha() * h0Var.getMeasuredHeight());
                }
                fastScroll.f36436i0 = currentActionBarHeight + i7;
                xlVar.getFastScroll().invalidate();
            }
        }
        K1();
        V0();
    }

    public final void S0() {
        float f10 = this.n1.f57779e;
        float f11 = (1.0f - this.f39990m1.f57779e) * f10;
        this.f40022u3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.f39997o1.f57779e))), 1.0f - f11));
    }

    public final void T0(li liVar) {
        int L;
        boolean e10 = liVar.e();
        int i7 = 0;
        lh.f fVar = this.f40018t3;
        if (fVar != null) {
            if (e10) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            fVar.setFadeHeightBottom(L);
        }
        vh vhVar = this.f40022u3;
        if (vhVar != null) {
            if (e10) {
                i7 = 4;
            }
            vhVar.setVisibility(i7);
        }
    }

    public final void U0() {
        float f10;
        float f11 = this.f40000p1.f57779e;
        float f12 = this.f40004q1.f57779e;
        float a10 = a8.n7.a(this.f40008r1.f57779e);
        if (this.P3) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        a10.d(this.D2, com.google.android.gms.internal.vision.e2.D(f11, f12, a10, f10));
    }

    @Override
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.w6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            li[] liVarArr = this.f40021u2;
            if (i7 < liVarArr.length) {
                li liVar = liVarArr[i7];
                if (liVar != null && (themeDescriptions = liVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i7++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f30229c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29542i5));
                return arrayList;
            }
        }
    }

    public final void V0() {
        bi biVar = this.G2;
        th thVar = this.F2;
        ai.h0 h0Var = this.M2;
        if (h0Var != null && h0Var.getVisibility() == 0 && h0Var.getAlpha() != 0.0f) {
            float f10 = this.f39990m1.f57779e;
            float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
            biVar.setAlpha(abs * abs * abs * abs);
            thVar.setTranslationY(org.telegram.messenger.g0.T1(this.f39969e4, ((h0Var.getTranslationY() + h0Var.getTop()) - thVar.getTop()) + org.telegram.messenger.g0.L(8.0f), kr.f36861j.getInterpolation(f10)));
            return;
        }
        thVar.setTranslationY(this.f39969e4);
        biVar.setAlpha(1.0f);
    }

    public final void W0(int i7) {
        this.Q2 = true;
        this.f40026v3.setVisibility(0);
        this.C1 = true;
        this.D1 = i7;
        this.O2 = 0;
        this.A1 = false;
        this.B1 = false;
        this.E1 = null;
        org.telegram.ui.ActionBar.q0 q0Var = this.f39980i3;
        if (q0Var != null) {
            this.f39977h3.setTranslationY(0.0f);
            q0Var.setVisibility(8);
        }
    }

    public final void X0(hi.y7 y7Var) {
        String N0 = org.telegram.messenger.gd.N0(2131752110, null);
        TextView textView = this.f39977h3;
        textView.setText(N0);
        this.Q2 = false;
        this.f40026v3.setVisibility(8);
        this.O2 = 1;
        this.A1 = true;
        this.B1 = true;
        this.d2 = false;
        this.E1 = y7Var;
        org.telegram.ui.ActionBar.q0 q0Var = this.f39980i3;
        if (q0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            q0Var.setVisibility(0);
            q0Var.setClickable(true);
            q0Var.setAlpha(1.0f);
            q0Var.setScaleX(1.0f);
            q0Var.setScaleY(1.0f);
        }
    }

    public final int Y0() {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.hj hjVar;
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (!(g2Var instanceof org.telegram.ui.bn) || (jjVar = ((org.telegram.ui.bn) g2Var).f46423x5) == null || (hjVar = jjVar.f24975b) == null) {
            return 0;
        }
        return hjVar.f24556g.size();
    }

    public final TLRPC.Chat Z0() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).f46173e;
        }
        return org.telegram.messenger.mp.u1(this.H3).O0(Long.valueOf(-this.U1));
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.B4 = z10;
        }
        dismiss();
    }

    public final float a1() {
        th thVar = this.B2;
        float alpha = 1.0f - thVar.getAlpha();
        return thVar.getMeasuredHeight() - (alpha * (thVar.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    public final wt b1() {
        li liVar;
        if (this.X1 && ((liVar = this.f40029w2) == this.f39967e2 || liVar == this.f39987l2)) {
            return this.N2;
        }
        return this.C2;
    }

    public final long c1() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return this.U1;
    }

    public final int d1(int i7) {
        li liVar = this.f40033x2;
        int[] iArr = this.Z3;
        if (liVar != null && ((this.f40029w2 instanceof pm) || (liVar instanceof pm))) {
            return org.telegram.messenger.g0.W1(this.Y1, iArr[0], iArr[1]);
        }
        return iArr[i7];
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.T0 && i7 != org.telegram.messenger.ks.Z4 && i7 != org.telegram.messenger.ks.F1) {
            if (i7 == org.telegram.messenger.ks.f25232i5) {
                this.F1 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).J0();
                return;
            }
            return;
        }
        qi qiVar = this.f40038y3;
        if (qiVar != null) {
            qiVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z10;
        yh yhVar;
        wh whVar;
        if (!this.f40029w2.q() && !this.J) {
            li liVar = this.f40029w2;
            xk xkVar = this.f40009r2;
            if (liVar == xkVar && xkVar != null && !xkVar.L && xkVar.Q0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f40013s2 = z10;
            if (!z10 && (whVar = this.C2) != null) {
                org.telegram.messenger.g0.v1(whVar.getEditText());
            }
            if (!this.f40013s2 && (yhVar = this.N2) != null) {
                org.telegram.messenger.g0.v1(yhVar.getEditText());
            }
            this.f40025v2.clear();
            org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
            if (g2Var == null) {
                g2Var = LaunchActivity.Q();
            }
            if (!this.B4 && g2Var != null && this.f40029w2.getSelectedItemsCount() > 0 && !this.A1) {
                if (!this.A4) {
                    this.A4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), this.J0);
                    String N0 = org.telegram.messenger.gd.N0(2131751387, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131751388, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751394, null), new ch(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    t1Var.setOnCancelListener(new ih(this, 0));
                    t1Var.O = new y0(this, 3);
                    t1Var.show();
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = 0;
            while (true) {
                li[] liVarArr = this.f40021u2;
                if (i7 >= liVarArr.length) {
                    break;
                }
                li liVar2 = liVarArr[i7];
                if (liVar2 != null && this.f40029w2 != liVar2) {
                    liVar2.q();
                }
                i7++;
            }
            org.telegram.messenger.g0.s3(this, i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0), 0), true, new ch(this, 11));
            if (g2Var != null) {
                org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
            }
            this.f39975g4 = false;
            super.dismiss();
            this.B4 = false;
        }
    }

    public final int e1(boolean z10) {
        boolean q10;
        int i7;
        u7 u7Var;
        if (this.f39972f4) {
            return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29590kh, this.J0);
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        Iterator it = this.f40012s1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.f57788a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = c8.m9.a(f10, 0.0f, 1.0f);
        if (z10 && (u7Var = this.V2) != null && u7Var.getVisibility() == 0) {
            a10 *= 1.0f - u7Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0);
        if (q10) {
            i7 = org.telegram.ui.ActionBar.n6.f29394a7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29542i5;
        }
        return i0.a.f(a10, w02, org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f40029w2.o(motionEvent);
    }

    public final void f1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.f1():void");
    }

    public final boolean g1() {
        if (this.X1) {
            li liVar = this.f40029w2;
            if (liVar == this.f39967e2 || liVar == this.f39987l2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        ri riVar = this.X3;
        if (riVar != null && !this.f40014s3) {
            boolean T = riVar.T();
            this.f40014s3 = true;
            di.p6 p6Var = new di.p6(this, editTextBoldCursor, z10, 19);
            if (T) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.h3(p6Var, j3);
        }
    }

    @Override
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final xk xkVar = this.f40009r2;
        if (xkVar != null && this.f40029w2 == xkVar) {
            final fh fhVar = new fh(this, 1);
            int i7 = xkVar.f42071n;
            org.telegram.ui.Wallet.da daVar = xkVar.S;
            ti tiVar = xkVar.f37135b;
            AnimatorSet animatorSet = null;
            if (!xkVar.L && (wallettransaction = xkVar.Q0) != null && xkVar.R0 == null && xkVar.S0 == null) {
                if (xkVar.T0) {
                    org.telegram.ui.Wallet.o6 o6Var = new org.telegram.ui.Wallet.o6();
                    o6Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                    if (g2Var != null && g2Var.presentFragment(o6Var, false, true)) {
                        org.telegram.ui.Wallet.sa saVar = new org.telegram.ui.Wallet.sa(tiVar.f30229c, tiVar.f30226b, daVar.getDiamondView(), o6Var, xkVar.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!xkVar.L) {
                                            fhVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!xkVar.L) {
                                            fhVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, tiVar);
                        xkVar.S0 = saVar;
                        animatorSet = saVar.f45127m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.n7 diamondView = daVar.getDiamondView();
                    if (diamondView.f44761f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.f39956a2;
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (bnVar.getCurrentAccount() == i7 && bnVar.a() == xkVar.f42076r.f28641id && bnVar.f46204g4 == 0 && bnVar.getFragmentView() != null && bnVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.f7 f7Var = new org.telegram.ui.Wallet.f7(tiVar.f30229c, tiVar.f30226b, daVar.getDiamondView(), bnVar, xkVar.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!xkVar.L) {
                                                    fhVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!xkVar.L) {
                                                    fhVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, tiVar);
                                xkVar.R0 = f7Var;
                                animatorSet = f7Var.f44297m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.A0 = animatorSet;
                this.B0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        if (this.f30259s0 != null && this.f30226b != null) {
            int e12 = e1(false);
            org.telegram.ui.ActionBar.n6.C1(e12, this.f30259s0);
            ui.c cVar = this.E4;
            if (cVar.f59123b != e12) {
                cVar.a(e12);
                lh.f fVar = this.f40018t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                vh vhVar = this.f40022u3;
                if (vhVar != null) {
                    vhVar.invalidate();
                }
            }
            M1();
            this.f30226b.invalidate();
        }
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        boolean z10;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
        g81 g81Var = chatAttachAlertPhotoLayout.m0;
        bi.g3 g3Var = chatAttachAlertPhotoLayout.f32887k0;
        TextView textView = chatAttachAlertPhotoLayout.f32897q0;
        xl xlVar = chatAttachAlertPhotoLayout.f32899r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = org.telegram.messenger.g0.f24221n;
        if (view == g3Var) {
            if (z10) {
                if (xlVar.getVisibility() == 0) {
                    g3Var.layout(0, org.telegram.messenger.f3.z(222.0f, i12, i15), i13, org.telegram.messenger.f3.z(96.0f, i12, i15));
                    return true;
                }
                g3Var.layout(0, org.telegram.messenger.f3.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (xlVar.getVisibility() == 0) {
                g3Var.layout(org.telegram.messenger.f3.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            } else {
                g3Var.layout(org.telegram.messenger.f3.z(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == g81Var) {
            if (z10) {
                if (xlVar.getVisibility() == 0) {
                    g81Var.layout(0, org.telegram.messenger.f3.z(310.0f, i12, i15), i13, org.telegram.messenger.f3.z(260.0f, i12, i15));
                    return true;
                }
                g81Var.layout(0, org.telegram.messenger.f3.z(176.0f, i12, i15), i13, org.telegram.messenger.f3.z(126.0f, i12, i15));
                return true;
            } else if (xlVar.getVisibility() == 0) {
                g81Var.layout(org.telegram.messenger.f3.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            } else {
                g81Var.layout(org.telegram.messenger.f3.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                L = (i13 - textView.getMeasuredWidth()) / 2;
                int L2 = i12 - org.telegram.messenger.g0.L(167.0f);
                textView.setRotation(0.0f);
                if (xlVar.getVisibility() == 0) {
                    L2 -= org.telegram.messenger.g0.L(96.0f);
                }
                measuredWidth = L2 - i15;
            } else {
                L = i11 - org.telegram.messenger.g0.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
                textView.setRotation(-90.0f);
                if (xlVar.getVisibility() == 0) {
                    L -= org.telegram.messenger.g0.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != xlVar) {
            return false;
        } else {
            if (z10) {
                int z11 = org.telegram.messenger.f3.z(88.0f, i14, i15);
                view.layout(0, z11, view.getMeasuredWidth(), view.getMeasuredHeight() + z11);
                return true;
            }
            int L3 = (i7 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void k1() {
        int i7 = 0;
        while (true) {
            li[] liVarArr = this.f40021u2;
            if (i7 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i7];
            if (liVar != null) {
                liVar.p();
            }
            i7++;
        }
        int i10 = this.H3;
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.T0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.Z4);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25232i5);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.F1);
        this.Q1 = true;
        wh whVar = this.C2;
        if (whVar != null) {
            whVar.o();
        }
        yh yhVar = this.N2;
        if (yhVar != null) {
            yhVar.o();
        }
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39967e2;
        hm hmVar = chatAttachAlertPhotoLayout.f32906w;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        xl xlVar = chatAttachAlertPhotoLayout.f32899r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.f32901s;
        if (i7 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.f32871c0 && !chatAttachAlertPhotoLayout.f32875e0) {
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(tiVar.U() + tiVar.T() + i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            bi.g3 g3Var = chatAttachAlertPhotoLayout.f32887k0;
            if (view == g3Var) {
                if (z10) {
                    g3Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824));
                    return true;
                }
                g3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            g81 g81Var = chatAttachAlertPhotoLayout.m0;
            if (view == g81Var) {
                if (z10) {
                    g81Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                    return true;
                }
                g81Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == xlVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    xlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
                    if (b0Var.f59199o != 0) {
                        xlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        hmVar.f();
                    }
                } else {
                    xlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (b0Var.f59199o != 1) {
                        xlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        hmVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        }
        return false;
    }

    public final void l1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String q10;
        if (tL_attachMenuBot != null) {
            q10 = tL_attachMenuBot.short_name;
        } else {
            q10 = org.telegram.messenger.n10.q(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ri.d0(this.H3).f26700b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.f28641id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.gd.a0("BotRemoveFromMenu", null, 2131752990, q10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String N0 = org.telegram.messenger.gd.N0(2131752989, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.gd.a0("BotRemoveInlineFromMenu", null, 2131752988, q10);
        }
        t1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, "OK"), new a3.h(this, tL_attachMenuBot, user, 25));
        i5.c.y("Cancel", 2131752577, alertDialog$Builder, null);
    }

    @Override
    public final boolean m0() {
        int i7;
        this.f39967e2.setTranslationX(0.0f);
        this.f39988l3.setAlpha(0.0f);
        this.j3.setAlpha(1.0f);
        this.f30226b.setTranslationY(this.f30226b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.o4 = animatorSet;
        ei eiVar = this.f39993m4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, eiVar, 0.0f, 400.0f));
        this.o4.setDuration(400L);
        this.o4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        eiVar.getClass();
        eiVar.a(this, valueOf);
        this.o4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new dh(this, 2));
        r1.g gVar = this.f39996n4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.f30226b, (r1.e) r1.g.f56430p, 0.0f);
        this.f39996n4 = gVar2;
        if (this.F3 != null) {
            gVar2.f56446m.a(0.75f);
            this.f39996n4.f56446m.b(350.0f);
        } else {
            gVar2.f56446m.a(0.75f);
            this.f39996n4.f56446m.b(350.0f);
        }
        this.f39996n4.h();
        if (this.K) {
            this.f30229c.setLayerType(2, null);
        }
        this.B0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        o6 o6Var = q6.d;
        if (this.f30254p0) {
            i7 = this.f30255q0;
        } else {
            i7 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, o6Var, i7));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.f30250l0);
        h2.f fVar = new h2.f((int[]) null);
        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(this, fVar, this.f30269z0, 8);
        this.f39996n4.a(new bi.y0(3, this, faVar));
        this.A0.addListener(new ah.l(26, this, faVar));
        fVar.d();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25234j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        A1(0.0f);
        ofFloat2.addUpdateListener(new dh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(kr.f36858f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        while (true) {
            li[] liVarArr = this.f40021u2;
            if (i7 < liVarArr.length) {
                li liVar = liVarArr[i7];
                if (liVar != null) {
                    liVar.A();
                }
                i7++;
            } else {
                this.f39966d4 = true;
                return;
            }
        }
    }

    public final void n1() {
        int i7 = 0;
        this.f39966d4 = false;
        while (true) {
            li[] liVarArr = this.f40021u2;
            if (i7 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i7];
            if (liVar != null) {
                liVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.X3.T();
        }
        qi qiVar = this.f40038y3;
        if (qiVar != null) {
            qiVar.f();
        }
    }

    @Override
    public final void o0() {
        if (this.f40029w2.s()) {
            dismiss();
        }
    }

    public final void o1() {
        org.telegram.messenger.fj fjVar = this.F3;
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        int i7 = this.H3;
        if (fjVar != null && fjVar.p5() && !org.telegram.messenger.v3.z(i7, 24, org.telegram.messenger.fj.B0(this.F3.f24073k)) && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            org.telegram.messenger.kj kjVar = bnVar.f46436y5;
            if (kjVar == null) {
                kjVar = org.telegram.messenger.kj.b(this.F3.f24073k.suggested_post);
            }
            if (!di.y8.S(i7, kjVar.f25139a)) {
                bnVar.Ac(kjVar);
                return;
            }
        }
        if (this.F1 - this.G1 < 0) {
            org.telegram.messenger.g0.D3(this.f40020u1);
            org.telegram.messenger.g0.D3(this.f40024v1);
            try {
                this.G2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.mp.u1(i7).K3() && org.telegram.messenger.mp.u1(i7).X4 > this.G1) {
                E1(g2Var);
                return;
            }
            return;
        }
        if (this.F3 == null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) g2Var;
            if (bnVar2.c()) {
                b5.J(getContext(), bnVar2.a(), new ch(this, 14), this.J0);
                return;
            }
        }
        li liVar = this.f40029w2;
        if (liVar != this.f39967e2 && liVar != this.f39987l2) {
            if (!liVar.M(true, 0, 0, this.L2, g1())) {
                this.B4 = true;
                dismiss();
                return;
            }
            return;
        }
        v1(true, 0, 0, this.L2, g1());
    }

    @Override
    public final void onBackPressed() {
        if (this.N1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        u7 u7Var = this.V2;
        if (u7Var.f29166o0) {
            u7Var.n(true);
        } else if (this.f40029w2.k()) {
        } else {
            if (b1() != null && b1().f41722e) {
                b1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var != null) {
            org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f40029w2.F(i7)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.N1);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.N1);
        }
    }

    public final void p1(int i7) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (i7 == 3) {
            if (this.L3 || !O0()) {
                if (g2Var != null) {
                    activity = g2Var.getParentActivity();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                q1(true);
            }
        } else if (i7 == 6 && org.telegram.messenger.g0.J1(g2Var)) {
            if (this.f39982j2 == null) {
                kl klVar = new kl(this, getContext(), this.J0, (this.C1 || this.P3) ? false : false);
                this.f39982j2 = klVar;
                this.f40021u2[5] = klVar;
                jl jlVar = this.f40023u4;
                if (jlVar != null) {
                    klVar.setDelegate(jlVar);
                } else if (g2Var instanceof org.telegram.ui.bn) {
                    klVar.setDelegate(new ch(this, 18));
                }
            }
            G1(this.f39982j2);
        }
    }

    public final void q1(boolean z10) {
        if (!this.L3 && z10) {
            rn rnVar = new rn(3, getContext(), this.J0, this);
            this.O1 = rnVar;
            G1(rnVar);
        }
        int i7 = 1;
        if (this.f39973g2 == null) {
            dj djVar = new dj(getContext(), this.J0, this);
            this.f39973g2 = djVar;
            this.f40021u2[3] = djVar;
            djVar.setupBlurredSearchField(this.F4);
            this.f39973g2.setDelegate(new ch(this, 15));
            if (this.C1) {
                this.f39973g2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).f46173e;
            dj djVar2 = this.f39973g2;
            if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                i7 = -1;
            }
            djVar2.setMaxSelectedFiles(i7);
        }
        if (z10) {
            G1(this.f39973g2);
        }
    }

    public final void r1() {
        boolean z10;
        if (!this.O3) {
            rn rnVar = new rn(5, getContext(), this.J0, this);
            this.O1 = rnVar;
            G1(rnVar);
        }
        if (this.f39970f2 == null) {
            uj ujVar = new uj(getContext(), this.J0, this);
            this.f39970f2 = ujVar;
            this.f40021u2[2] = ujVar;
            ujVar.setupBlurredSearchField(this.F4);
            this.f39970f2.setDelegate(new ci(this));
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).f46173e;
            uj ujVar2 = this.f39970f2;
            if (chat != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            ujVar2.setMultipleSelectionAllowed(z10);
        }
        G1(this.f39970f2);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            Q0();
            dh.d dVar = this.W1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29559j5, this.J0);
            org.telegram.ui.ActionBar.q0 q0Var = this.f39980i3;
            if (q0Var != null && w02 != this.f40003p4) {
                this.f40003p4 = w02;
                q0Var.setIconColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(boolean z10) {
        int i7;
        if (!this.I3 && z10) {
            rn rnVar = new rn(4, getContext(), this.J0, this);
            this.O1 = rnVar;
            G1(rnVar);
        }
        boolean z11 = false;
        if (this.f39984k2 == null) {
            if (this.I1) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            kk kkVar = new kk(i7, getContext(), this.J0, this);
            this.f39984k2 = kkVar;
            this.f40021u2[4] = kkVar;
            kkVar.setDelegate(new di(this));
        }
        int i10 = 1;
        if (this.C1) {
            this.f39984k2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
            if (g2Var instanceof org.telegram.ui.bn) {
                TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).f46173e;
                kk kkVar2 = this.f39984k2;
                if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                    i10 = -1;
                }
                kkVar2.setMaxSelectedFiles(i10);
            } else {
                this.f39984k2.setMaxSelectedFiles(this.Q3);
                kk kkVar3 = this.f39984k2;
                if (!this.I1 && !this.R1) {
                    z11 = true;
                }
                kkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        kk kkVar4 = this.f39984k2;
        kkVar4.f36762e0 = this.I1;
        if (z10) {
            G1(kkVar4);
        }
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.G3 = false;
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            this.f30244i0 = ((org.telegram.ui.bn) g2Var).V9();
        }
        M1();
        this.f40006q3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0), 0);
            this.H0 = o4;
            org.telegram.messenger.g0.s3(this, o4, false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        }
        if (this.f39986k4) {
            this.f39986k4 = false;
            u7 u7Var = this.V2;
            u7Var.updateColors();
            u7Var.invalidate();
            j1();
        }
    }

    @Override
    public final void u0(boolean z10) {
        this.f30257r0 = true;
    }

    public final void u1() {
        ViewGroup viewGroup = this.f30226b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        u7 u7Var = this.V2;
        int i7 = 1;
        if (u7Var.f29166o0) {
            u7Var.n(true);
        }
        this.f39970f2 = null;
        this.f39994n2 = null;
        this.f39973g2 = null;
        this.f39976h2 = null;
        this.f39979i2 = null;
        this.f39982j2 = null;
        this.f39984k2 = null;
        this.f40009r2 = null;
        while (true) {
            li[] liVarArr = this.f40021u2;
            if (i7 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i7];
            if (liVar != null) {
                liVar.p();
                this.f30226b.removeView(liVarArr[i7]);
                liVarArr[i7] = null;
            }
            i7++;
        }
        J1(false, false);
        super.L();
        if (this.f40013s2) {
            this.f40013s2 = false;
            this.f40017t2 = 0.0f;
            org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
            if (g2Var != null && g2Var.getFragmentView() != null) {
                View fragmentView = g2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f56367a;
                r0.y.c(fragmentView);
            }
        }
    }

    @Override
    public final void v() {
        if (this.f39956a2 instanceof org.telegram.ui.bn) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.f40029w2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.gd.N0(2131754921, "AccDescrAttachButton"));
        this.f40006q3 = true;
        if (!this.K3 && !this.J3) {
            O0();
        }
    }

    public final boolean v1(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        if (this.G3) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            TLRPC.Chat chat = bnVar.f46173e;
            if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat) && chat.megagroup) || !org.telegram.messenger.v3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.H3).f25753g7.edit();
                edit.putBoolean("silent_" + bnVar.a(), !z10).commit();
            }
        }
        int i11 = 1;
        if (P0(b1().getText())) {
            return true;
        }
        N0();
        if (this.f40008r1.f57780f) {
            this.G3 = true;
            this.X3.y1(7, true, z10, i7, i10, j3, z11, false, 0L);
            return true;
        }
        long c12 = c1();
        li liVar = this.f40029w2;
        if (liVar != null) {
            i11 = liVar.getSelectedItemsCount();
        }
        return b5.Y(this.H3, c12, Y0() + i11, new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj) {
                ti tiVar = ti.this;
                tiVar.G3 = true;
                tiVar.X3.y1(7, true, z10, i7, i10, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void w1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i7;
        float f10;
        float f11;
        float measuredHeight;
        this.f39990m1.a(z10, z11);
        wt b12 = b1();
        this.X1 = z10;
        wt b13 = b1();
        int i10 = 0;
        if (this.B2.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        li liVar = this.f40029w2;
        if (liVar != this.f39967e2 && liVar != this.f39987l2) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.X1 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i11 = 8;
        float f12 = 1.0f;
        ai.h0 h0Var = this.M2;
        kg.j jVar = this.A2;
        float f13 = 0.0f;
        if (z11) {
            if (z12) {
                i11 = 0;
            }
            h0Var.setVisibility(i11);
            ViewPropertyAnimator animate = h0Var.animate();
            if (z14 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            kr krVar = kr.h;
            duration.setInterpolator(krVar).setUpdateListener(new dh(this, 0)).withEndAction(new Runnable(this) {
                public final ti f34716b;

                {
                    this.f34716b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f34716b;
                            if (!z14 || !z12) {
                                tiVar.M2.setVisibility(8);
                            }
                            tiVar.R1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f34716b.A2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator animate2 = jVar.animate();
            if (!z14 && z12) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = jVar.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z14 || !z12) {
                f12 = 0.0f;
            }
            translationY.alpha(f12).setDuration(320L).setInterpolator(krVar).setUpdateListener(new dh(this, 1)).withEndAction(new Runnable(this) {
                public final ti f34716b;

                {
                    this.f34716b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f34716b;
                            if (!z14 || !z12) {
                                tiVar.M2.setVisibility(8);
                            }
                            tiVar.R1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f34716b.A2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z14 && z12) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            h0Var.setVisibility(i7);
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h0Var.setAlpha(f10);
            R1();
            if (z14 || !z12) {
                f12 = 0.0f;
            }
            jVar.setAlpha(f12);
            if (z14 || !z12) {
                f13 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f13);
            if (z14 || !z12) {
                i10 = 8;
            }
            jVar.setVisibility(i10);
        }
        if (b12 != b13) {
            b12.k(true);
            b13.setText(x5.cloneSpans(b12.getText()));
            b13.getEditText().setAllowTextEntitiesIntersection(b12.getEditText().getAllowTextEntitiesIntersection());
            if (b12.getEditText().isFocused()) {
                b13.getEditText().requestFocus();
                b13.getEditText().setSelection(b12.getEditText().getSelectionStart(), b12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.g3(new fh(this, 0));
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(int i7, org.telegram.messenger.fj fjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (fjVar != null && (chatAttachAlertPhotoLayout = this.f39967e2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.F3 == fjVar && this.E3 == i7) {
            return;
        }
        this.F3 = fjVar;
        if (fjVar != null && fjVar.z2()) {
            if (this.F3.I3()) {
                i7 = 2;
            } else if (this.F3.U2()) {
                i7 = 1;
            } else {
                i7 = 0;
            }
        }
        this.E3 = i7;
        if (this.F3 != null) {
            this.Q3 = 1;
            this.R3 = false;
        } else {
            this.Q3 = -1;
            this.R3 = true;
        }
        this.f40038y3.f();
        L1(0);
    }

    public final void y1(float f10) {
        int i7;
        float translationY = this.f30226b.getTranslationY() - this.f40017t2;
        this.f40017t2 = this.f30226b.getHeight() * f10;
        this.f30226b.setTranslationY(translationY);
        xk xkVar = this.f40009r2;
        if (xkVar != null) {
            xkVar.setSendTransitionProgress(f10);
        }
        if (this.f30254p0) {
            i7 = Math.round((1.0f - f10) * this.f30255q0);
        } else {
            i7 = 0;
        }
        this.Z.setAlpha(i7);
        this.D0 = 1.0f - f10;
        this.f30229c.invalidate();
    }

    public final void z1(int i7, boolean z10) {
        if (this.F3 != null) {
            return;
        }
        this.Q3 = i7;
        this.R3 = z10;
    }

    public ti(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        float f10;
        TextPaint textPaint;
        te.j jVar;
        boolean z13;
        org.telegram.ui.ActionBar.q0 q0Var;
        gi.j jVar2;
        kr krVar = kr.h;
        this.f39990m1 = new te.a(0, this, krVar, 380L, false);
        this.n1 = new te.a(1, this, krVar, 380L, false);
        this.f39997o1 = new te.a(2, this, krVar, 380L, false);
        this.f40000p1 = new te.a(3, this, krVar, 380L, false);
        this.f40004q1 = new te.a(4, this, krVar, 380L, true);
        this.f40008r1 = new te.a(5, this, krVar, 320L, false);
        te.j jVar3 = new te.j(new ch(this, 2), krVar, 380L);
        this.f40012s1 = jVar3;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Y1 = 0.0f;
        this.Z1 = new ei(this, 0);
        this.d2 = false;
        li[] liVarArr = new li[12];
        this.f40021u2 = liVarArr;
        this.f40025v2 = new LongSparseArray();
        this.E2 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.H2 = textPaint2;
        this.I2 = new RectF();
        this.J2 = new Paint(1);
        this.S2 = true;
        this.T2 = 1.0f;
        this.f40042z3 = false;
        this.B3 = false;
        int i7 = org.telegram.messenger.i10.f24637t0;
        this.H3 = i7;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.M3 = true;
        this.N3 = true;
        this.O3 = true;
        this.Q3 = -1;
        this.R3 = true;
        this.W3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.Z3 = new int[2];
        new Paint(1);
        this.f39975g4 = false;
        ArrayList arrayList = new ArrayList();
        this.f39978h4 = arrayList;
        Rect rect = new Rect();
        this.f39981i4 = rect;
        this.f39993m4 = new ei(this, 1);
        this.f40015s4 = true;
        this.f40019t4 = false;
        this.A4 = false;
        this.B4 = false;
        this.f30267y = true;
        ui.c cVar = new ui.c();
        this.E4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.J0));
        this.Y0.E.add(new ri.o(cVar, new ch(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f()) {
            dh.g gVar = new dh.g(false);
            this.D4 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(cVar);
            fVar.f59132f = cVar;
            fVar.d = gVar;
            fVar.f59131e = -2;
            ui.f fVar2 = new ui.f(null);
            fVar2.f59132f = cVar;
            fVar2.d = gVar;
            fVar2.f59131e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.F4 = cVar2;
            cVar2.f8373k = true;
            int L = org.telegram.messenger.pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.f8368e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.G4 = cVar3;
            cVar3.f8373k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.f8368e = L2;
        } else {
            this.D4 = null;
            this.F4 = new dh.c(cVar, cVar, cVar);
            this.G4 = new dh.c(cVar, cVar, cVar);
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.H4 = new jh(this, 0);
        this.f39972f4 = z10;
        this.f39959b2 = (g2Var instanceof org.telegram.ui.bn) && g2Var.isInBubbleMode();
        this.f30250l0 = new OvershootInterpolator(0.7f);
        this.f39956a2 = g2Var;
        this.G = true;
        this.f30269z0 = this;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.T0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.Z4);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25232i5);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.F1);
        arrayList.add(rect);
        gi giVar = new gi(this, context);
        this.f40002p3 = giVar;
        giVar.setDelegate(new hi(this));
        this.f30226b = giVar;
        giVar.setWillNotDraw(false);
        this.f30226b.setClipChildren(false);
        this.f30226b.setClipToPadding(false);
        ViewGroup viewGroup = this.f30226b;
        int i10 = this.f30261u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        u7 u7Var = new u7(this, context, i6Var, 1);
        this.V2 = u7Var;
        u7Var.f29145d1 = true;
        u7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        u7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        int i11 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.l(u7Var, 1, i11, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.I5;
        org.telegram.ui.ActionBar.u6.l(u7Var, 3, i12, i6Var);
        org.telegram.ui.ActionBar.u6.l(u7Var, 5, i11, i6Var);
        u7Var.setOccupyStatusBar(true);
        u7Var.setAlpha(0.0f);
        u7Var.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 15));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
        this.Y2 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131231247);
        q0Var2.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        q0Var2.setVisibility(4);
        q0Var2.setAlpha(0.0f);
        q0Var2.setScaleX(0.6f);
        q0Var2.setScaleY(0.6f);
        q0Var2.setSubMenuOpenSide(2);
        q0Var2.setDelegate(new ch(this, 10));
        q0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(q0Var2, h02, null, M, i6Var);
        q0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var3 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i13, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var3.getWidth() / 2.0f) + q0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
        this.f39957a3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        hi.d0 d0Var = new hi.d0();
        this.Z2 = d0Var;
        q0Var3.setIcon(d0Var);
        q0Var3.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        q0Var3.setVisibility(8);
        q0Var3.setAlpha(0.0f);
        q0Var3.setScaleX(0.6f);
        q0Var3.setScaleY(0.6f);
        q0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        q0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(q0Var3, h03, null, M2, i6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i13, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        gi.j jVar4 = new gi.j(this, context);
        org.telegram.ui.ActionBar.u6.U(jVar4, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        jVar4.setText(org.telegram.messenger.gd.N0(2131751741, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        jVar4.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i13, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        c8.sa.a(jVar4);
        this.f39965d3 = jVar4;
        M1();
        if (g2Var != null) {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            q0Var = q0Var3;
            jVar2 = jVar4;
            org.telegram.ui.ActionBar.q0 q0Var4 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
            this.f39963c3 = q0Var4;
            q0Var4.setLongClickEnabled(false);
            q0Var4.setIcon(2131232491);
            q0Var4.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
            q0Var4.setVisibility(4);
            z13 = false;
            q0Var4.setAlpha(0.0f);
            q0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 6, -1);
            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i12);
            q0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.u6.j(q0Var4, h04, null, M3, i6Var);
            q0Var4.setOnClickListener(new fi.v1(5, this, z11));
        } else {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            z13 = false;
            q0Var = q0Var3;
            jVar2 = jVar4;
        }
        org.telegram.ui.ActionBar.q0 q0Var5 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
        this.f39980i3 = q0Var5;
        q0Var5.setLongClickEnabled(false);
        q0Var5.setIcon(2131231247);
        q0Var5.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        q0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 3, -1);
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i12);
        q0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(q0Var5, h05, null, M4, i6Var);
        q0Var5.e(1, 2131232049, org.telegram.messenger.gd.N0(2131744636, null)).setOnClickListener(new View.OnClickListener(this) {
            public final ti f35739b;

            {
                this.f35739b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f35739b;
                        wh whVar = tiVar.C2;
                        if (whVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(tiVar.getContext(), i6Var);
                            m0Var.x1(whVar.getText());
                            m0Var.f37285f2 = new org.telegram.messenger.w10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar.C2;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar = tiVar.N2;
                                            yhVar.setText(charSequence);
                                            yhVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = tiVar.U1;
                            if (tiVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            m0Var.v1(j3, z14, new lh(tiVar, 0));
                            m0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f35739b;
                        yh yhVar = tiVar2.N2;
                        if (yhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(tiVar2.getContext(), i6Var);
                            m0Var2.x1(yhVar.getText());
                            m0Var2.f37285f2 = new org.telegram.messenger.w10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar2.C2;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar2.N2;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar2.U1;
                            if (tiVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m0Var2.v1(j10, z15, new lh(tiVar2, 1));
                            m0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f35739b;
                        tiVar3.f39980i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = tiVar3.f39956a2;
                        p12.J2(null, g2Var2, i6Var);
                        PhotoViewer.p1().K2(tiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i13 = tiVar3.Q3;
                        boolean z16 = tiVar3.R3;
                        p13.h = i13;
                        p13.f43401n = z16;
                        if (!tiVar3.X3.T()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(tiVar3.f30229c.findFocus());
                        }
                        File w10 = hi.x7.w(tiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24226q;
                        int i14 = point.x;
                        int i15 = point.y;
                        if (i14 > 1080 || i15 > 1080) {
                            float min = Math.min(i14, i15) / 1080.0f;
                            i14 = (int) (i14 * min);
                            i15 = (int) (i15 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        ki kiVar = new ki(tiVar3, efVar);
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) g2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.g2(arrayList2, 0, 11, false, kiVar, bnVar);
                        if (tiVar3.B1) {
                            PhotoViewer.p1().T0(null, null, true, tiVar3.E1);
                            return;
                        }
                        return;
                }
            }
        });
        q0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        q0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        q0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i13, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        th thVar = new th(this, context, 0);
        this.f39974g3 = thVar;
        thVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i13, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        thVar.setAlpha(0.0f);
        thVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f39977h3 = textView;
        org.telegram.messenger.f3.l(textView, i11, i6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.na.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f39985k3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.x(imageView, mutate, i11, i6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.na.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        thVar.addView(linearLayout, c8.na.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f39988l3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.u6.x(imageView2, mutate2, i11, i6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.na.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f39992m3 = textView2;
        org.telegram.messenger.f3.l(textView2, i11, i6Var, 1, 16.0f);
        org.telegram.messenger.f3.k(textView2, 19, "AttachMediaPreview", 2131753955);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.na.r(-2, -2, 16));
        thVar.addView(linearLayout2, c8.na.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, i6Var);
        this.f39967e2 = chatAttachAlertPhotoLayout;
        liVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f40029w2 = chatAttachAlertPhotoLayout;
        this.U2 = 1L;
        this.f30226b.addView(chatAttachAlertPhotoLayout, c8.na.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.f40018t3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m);
        this.f30226b.addView(fVar3, c8.na.g());
        this.f30226b.addView(thVar, c8.na.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.h0 h0Var = new ai.h0(context, 15);
        this.M2 = h0Var;
        this.f30226b.addView(h0Var, c8.na.e(-1, -2, 55));
        this.f30226b.addView(u7Var, c8.na.c(-2.0f, -1));
        this.f30226b.addView(q0Var2, c8.na.e(48, 48, 53));
        this.f30226b.addView(q0Var, c8.na.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f39963c3;
        if (q0Var6 != null) {
            this.f30226b.addView(q0Var6, c8.na.e(48, 48, 53));
        }
        thVar.addView(q0Var5, c8.na.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f30226b.addView(jVar2, c8.na.e(-2, 48, 53));
        th thVar2 = new th(this, context, 1);
        this.f40026v3 = thVar2;
        uh uhVar = new uh(context, 0);
        this.f40030w3 = uhVar;
        uhVar.setClipChildren(true);
        uhVar.setClipToPadding(false);
        qi qiVar = new qi(this, context);
        this.f40038y3 = qiVar;
        uhVar.setAdapter(qiVar);
        v4.c0 c0Var = new v4.c0(0, false);
        this.f40034x3 = c0Var;
        uhVar.setLayoutManager(c0Var);
        uhVar.setVerticalScrollBarEnabled(false);
        uhVar.setHorizontalScrollBarEnabled(false);
        uhVar.setItemAnimator(null);
        uhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.u6.l(uhVar, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        uhVar.f34789z2 = true;
        uhVar.setOverScrollMode(2);
        dh.c cVar5 = this.F4;
        ri.q qVar = this.Y0;
        cVar5.f8372j = qVar;
        this.G4.f8372j = qVar;
        cVar4.f8372j = qVar;
        vh vhVar = new vh(this, context, 0);
        this.f40022u3 = vhVar;
        dh.d dVar = new dh.d(cVar4.c(vhVar, null, false));
        this.W1 = dVar;
        if (org.telegram.messenger.bz.f()) {
            org.telegram.messenger.pc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.f30226b.addView(vhVar, c8.na.g());
        fh.g c10 = this.F4.c(thVar2, c8.j0.g(i6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        thVar2.setBackground(c10);
        uhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        uhVar.setClipToOutline(true);
        bg.q0 q0Var7 = bg.u0.f3313a;
        uhVar.setOutlineProvider(new bg.s0(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(28.0f)));
        uhVar.setImportantForAccessibility(1);
        thVar2.addView(uhVar, c8.na.g());
        this.f30226b.addView(thVar2, c8.na.e(-1, 70, 81));
        uhVar.setOnItemClickListener(new fi.g4(9, this, i6Var));
        uhVar.setOnItemLongClickListener(new ch(this, 3));
        n6 n6Var = new n6(context, true, false, true);
        this.C3 = n6Var;
        n6Var.setVisibility(8);
        n6Var.setAlpha(0.0f);
        n6Var.setGravity(17);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        n6Var.setPadding(L3, 0, L3, 0);
        n6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        n6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i13, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        this.f30226b.addView(n6Var, c8.na.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f30226b.addView(radialProgressView, c8.na.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.D2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.n6.f29862z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView3, i13, i6Var, mode2);
        imageView3.setImageResource(2131231842);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i132 = 2131748639;
                            } else {
                                i132 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i132, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        th thVar3 = new th(this, context, 2);
        this.B2 = thVar3;
        kg.j jVar5 = new kg.j(this, context);
        this.A2 = jVar5;
        thVar3.addView(jVar5, c8.na.e(-1, -1, 119));
        fh.g c11 = this.G4.c(giVar, c8.j0.o(i6Var), false);
        this.f40037y2 = c11;
        c11.T = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.R.f11635g = 0.4f;
        c11.n();
        fh.g c12 = this.F4.c(jVar5, c8.j0.o(i6Var), false);
        this.f40041z2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        thVar3.setWillNotDraw(false);
        thVar3.setVisibility(4);
        thVar3.setAlpha(0.0f);
        this.f30226b.addView(thVar3, c8.na.e(-1, -2, 83));
        thVar3.setOnTouchListener(new gi.a(14));
        n6 n6Var2 = new n6(context, false, false, false);
        this.f40020u1 = n6Var2;
        n6Var2.setAllowCancel(true);
        n6Var2.setScaleProperty(0.6f);
        n6Var2.setVisibility(8);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i14 = org.telegram.ui.ActionBar.n6.f29843y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i14, i6Var);
        n6Var2.setTypeface(org.telegram.messenger.g0.o());
        n6Var2.setGravity(17);
        jVar5.addView(n6Var2, c8.na.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f40028w1 = imageView4;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
        this.f40032x1 = v2Var;
        imageView4.setImageDrawable(v2Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.n6.Nl;
        org.telegram.ui.ActionBar.u6.s(imageView4, i15, i6Var, mode);
        int i16 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i16);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(imageView4, h06, null, M5, i6Var);
        jVar5.addView(imageView4, c8.na.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.gd.N0(2131755006, null));
        c8.sa.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35739b;

            {
                this.f35739b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f35739b;
                        wh whVar = tiVar.C2;
                        if (whVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(tiVar.getContext(), i6Var);
                            m0Var.x1(whVar.getText());
                            m0Var.f37285f2 = new org.telegram.messenger.w10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar.C2;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar.N2;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = tiVar.U1;
                            if (tiVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            m0Var.v1(j3, z14, new lh(tiVar, 0));
                            m0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f35739b;
                        yh yhVar = tiVar2.N2;
                        if (yhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(tiVar2.getContext(), i6Var);
                            m0Var2.x1(yhVar.getText());
                            m0Var2.f37285f2 = new org.telegram.messenger.w10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar2.C2;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar2.N2;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar2.U1;
                            if (tiVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m0Var2.v1(j10, z15, new lh(tiVar2, 1));
                            m0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f35739b;
                        tiVar3.f39980i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = tiVar3.f39956a2;
                        p12.J2(null, g2Var2, i6Var);
                        PhotoViewer.p1().K2(tiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = tiVar3.Q3;
                        boolean z16 = tiVar3.R3;
                        p13.h = i132;
                        p13.f43401n = z16;
                        if (!tiVar3.X3.T()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(tiVar3.f30229c.findFocus());
                        }
                        File w10 = hi.x7.w(tiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24226q;
                        int i142 = point.x;
                        int i152 = point.y;
                        if (i142 > 1080 || i152 > 1080) {
                            float min = Math.min(i142, i152) / 1080.0f;
                            i142 = (int) (i142 * min);
                            i152 = (int) (i152 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i142, i152, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        ki kiVar = new ki(tiVar3, efVar);
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) g2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.g2(arrayList2, 0, 11, false, kiVar, bnVar);
                        if (tiVar3.B1) {
                            PhotoViewer.p1().T0(null, null, true, tiVar3.E1);
                            return;
                        }
                        return;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.F1 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).J0();
        wh whVar = new wh(this, context, giVar, i6Var);
        this.C2 = whVar;
        whVar.K = true;
        whVar.setHint(org.telegram.messenger.gd.N0(2131754451, "AddCaption"));
        whVar.s();
        whVar.getEditText().setLayoutParams(c8.na.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        whVar.getEditText().addTextChangedListener(new xh(this, 0));
        jVar5.addView(whVar, c8.na.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        thVar3.setClipChildren(false);
        whVar.setClipChildren(false);
        h0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        h0Var.setWillNotDraw(false);
        yh yhVar = new yh(this, context, giVar, i6Var);
        this.N2 = yhVar;
        yhVar.K = true;
        yhVar.getEditText().addTextChangedListener(new ai(this, g2Var));
        yhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        yhVar.getEditText().setLayoutParams(c8.na.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        yhVar.getEditText().setTextSize(1, 17.0f);
        yhVar.getEmojiButton().setLayoutParams(c8.na.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        yhVar.setHint(org.telegram.messenger.gd.N0(2131754451, "AddCaption"));
        h0Var.addView(yhVar, c8.na.e(-1, -2, 119));
        h0Var.setAlpha(0.0f);
        h0Var.setVisibility(8);
        whVar.addView(imageView3, c8.na.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.F4.c(h0Var, c8.j0.o(i6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        h0Var.setBackground(c13);
        h0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        n6 n6Var3 = new n6(context, false, false, false);
        this.f40024v1 = n6Var3;
        n6Var3.setScaleProperty(0.6f);
        n6Var3.setVisibility(8);
        n6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var3, i14, i6Var);
        n6Var3.setTypeface(org.telegram.messenger.g0.o());
        n6Var3.setGravity(17);
        n6Var3.setAllowCancel(true);
        h0Var.addView(n6Var3, c8.na.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231843);
        org.telegram.ui.ActionBar.u6.s(imageView5, org.telegram.ui.ActionBar.n6.Oe, i6Var, mode2);
        yhVar.addView(imageView5, c8.na.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i132 = 2131748639;
                            } else {
                                i132 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i132, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f40036y1 = imageView6;
        org.telegram.ui.ActionBar.v2 v2Var2 = new org.telegram.ui.ActionBar.v2(context);
        this.f40040z1 = v2Var2;
        imageView6.setImageDrawable(v2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView6, i15, i6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M6 = org.telegram.ui.ActionBar.u6.M(i16);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.u6.j(imageView6, h07, null, M6, i6Var);
        h0Var.addView(imageView6, c8.na.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.gd.N0(2131755006, null));
        c8.sa.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35739b;

            {
                this.f35739b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f35739b;
                        wh whVar2 = tiVar.C2;
                        if (whVar2 != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(tiVar.getContext(), i6Var);
                            m0Var.x1(whVar2.getText());
                            m0Var.f37285f2 = new org.telegram.messenger.w10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar22 = tiVar.C2;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar.N2;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = tiVar.U1;
                            if (tiVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            m0Var.v1(j3, z14, new lh(tiVar, 0));
                            m0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f35739b;
                        yh yhVar2 = tiVar2.N2;
                        if (yhVar2 != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(tiVar2.getContext(), i6Var);
                            m0Var2.x1(yhVar2.getText());
                            m0Var2.f37285f2 = new org.telegram.messenger.w10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar22 = tiVar2.C2;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar22 = tiVar2.N2;
                                            yhVar22.setText(charSequence);
                                            yhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar2.U1;
                            if (tiVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m0Var2.v1(j10, z15, new lh(tiVar2, 1));
                            m0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f35739b;
                        tiVar3.f39980i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = tiVar3.f39956a2;
                        p12.J2(null, g2Var2, i6Var);
                        PhotoViewer.p1().K2(tiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = tiVar3.Q3;
                        boolean z16 = tiVar3.R3;
                        p13.h = i132;
                        p13.f43401n = z16;
                        if (!tiVar3.X3.T()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(tiVar3.f30229c.findFocus());
                        }
                        File w10 = hi.x7.w(tiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24226q;
                        int i142 = point.x;
                        int i152 = point.y;
                        if (i142 > 1080 || i152 > 1080) {
                            float min = Math.min(i142, i152) / 1080.0f;
                            i142 = (int) (i142 * min);
                            i152 = (int) (i152 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i142, i152, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        ki kiVar = new ki(tiVar3, efVar);
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) g2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.g2(arrayList2, 0, 11, false, kiVar, bnVar);
                        if (tiVar3.B1) {
                            PhotoViewer.p1().T0(null, null, true, tiVar3.E1);
                            return;
                        }
                        return;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        th thVar4 = new th(this, context, 3);
        this.F2 = thVar4;
        thVar4.setFocusable(true);
        thVar4.setFocusableInTouchMode(true);
        thVar4.setVisibility(4);
        thVar4.setScaleX(0.2f);
        thVar4.setScaleY(0.2f);
        thVar4.setAlpha(0.0f);
        thVar4.setClipChildren(false);
        thVar4.setClipToPadding(false);
        this.f30226b.addView(thVar4, c8.na.e(110, 50, 85));
        bi biVar = new bi(context, i6Var, this);
        this.G2 = biVar;
        biVar.setImportantForAccessibility(2);
        thVar4.addView(biVar, c8.na.e(-1, -1, 119));
        biVar.setTranslationX(this.f30261u0);
        int L4 = org.telegram.messenger.g0.L(52.0f);
        int L5 = org.telegram.messenger.g0.L(38.0f);
        biVar.L = L4;
        biVar.M = L5;
        biVar.P = org.telegram.messenger.g0.L(7.0f);
        biVar.Q = org.telegram.messenger.g0.L(6.0f);
        biVar.f39940s0 = true;
        biVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f35433b;

            {
                this.f35433b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f35433b;
                        if (tiVar.f40029w2 != tiVar.f39987l2) {
                            z14 = true;
                        }
                        tiVar.P1(z14);
                        return;
                    case 1:
                        ti tiVar2 = this.f35433b;
                        long j3 = tiVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) tiVar2.f40025v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f35433b;
                        boolean z15 = tiVar3.X1;
                        if (!z15) {
                            tiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f35433b;
                        boolean z16 = tiVar4.X1;
                        if (z16) {
                            tiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35433b.o1();
                        return;
                    case 5:
                        this.f35433b.Y2.V(null, null);
                        return;
                    case 6:
                        ti tiVar5 = this.f35433b;
                        if (tiVar5.f39967e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = tiVar5.f39967e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23294i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            tiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = tiVar5.f39957a3;
                            hi.u3 u3Var = tiVar5.f39960b3;
                            if (u3Var != null) {
                                u3Var.f(true);
                            }
                            hi.u3 u3Var2 = new hi.u3(tiVar5.getContext(), 1);
                            tiVar5.f39960b3 = u3Var2;
                            if (!V) {
                                i132 = 2131748639;
                            } else {
                                i132 = 2131748640;
                            }
                            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i132, null)));
                            tiVar5.f39960b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            tiVar5.f39960b3.p(1.0f, -((tiVar5.f30226b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            tiVar5.f39960b3.setTranslationY(tiVar5.Y2.getTranslationY());
                            hi.u3 u3Var3 = tiVar5.f39960b3;
                            u3Var3.f15506r0 = new xd(5, tiVar5, u3Var2);
                            tiVar5.f30226b.addView(u3Var3, c8.na.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            tiVar5.f39960b3.x();
                            return;
                        }
                        return;
                    case 7:
                        li liVar = this.f35433b.f40029w2;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35433b.f39980i3.V(null, null);
                        return;
                }
            }
        });
        biVar.setOnLongClickListener(new org.telegram.ui.of(this, context, i6Var, g2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        vh vhVar2 = new vh(this, context, 1);
        vhVar2.setAlpha(0.0f);
        vhVar2.setScaleX(0.2f);
        vhVar2.setScaleY(0.2f);
        if (z10) {
            Q0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.F4, c8.j0.o(i6Var));
        oc0 oc0Var = new oc0(context);
        this.N1 = oc0Var;
        this.f30226b.addView(oc0Var, c8.na.c(-1.0f, -1));
        gh.e eVar = new gh.e(i6Var);
        eVar.f13620e = new ch(this, 5);
        eVar.f13619c = new ch(this, 6);
        eVar.d = new ch(this, 7);
        eVar.f13618b = new ch(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13622n = N;
        eVar.f13623r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13621f = N3;
        eVar.h = N4;
        u7Var.P(this.F4, eVar, false);
        jVar.f(1L, false);
        this.Y0.i(this.f30226b);
        ri.q qVar2 = this.Y0;
        qVar2.f56817a = new ch(this, 9);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
