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
public class ki extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is, org.telegram.ui.ActionBar.o2, te.b {
    public static final int I4 = 0;
    public boolean A1;
    public final kg.j A2;
    public final RadialProgressView A3;
    public boolean A4;
    public boolean B1;
    public final kh B2;
    public boolean B3;
    public boolean B4;
    public boolean C1;
    public final nh C2;
    public final h6 C3;
    public hi.i C4;
    public int D1;
    public final ImageView D2;
    public float D3;
    public final dh.g D4;
    public org.telegram.messenger.s10 E1;
    public final int[] E2;
    public int E3;
    public final ui.c E4;
    public int F1;
    public final kh F2;
    public org.telegram.messenger.gj F3;
    public final dh.c F4;
    public int G1;
    public final sh G2;
    public boolean G3;
    public final dh.c G4;
    public boolean H1;
    public final TextPaint H2;
    public final int H3;
    public final zg H4;
    public boolean I1;
    public final RectF I2;
    public boolean I3;
    public boolean J1;
    public final Paint J2;
    public boolean J3;
    public boolean K1;
    public AnimatorSet K2;
    public boolean K3;
    public k30 L1;
    public long L2;
    public boolean L3;
    public boolean M1;
    public final ai.k0 M2;
    public boolean M3;
    public final fc0 N1;
    public final ph N2;
    public boolean N3;
    public kn O1;
    public int O2;
    public boolean O3;
    public m30 P1;
    public xs P2;
    public boolean P3;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public tj S1;
    public boolean S2;
    public boolean S3;
    public si T1;
    public final float T2;
    public float T3;
    public long U1;
    public long U2;
    public float U3;
    public boolean V1;
    public final o7 V2;
    public ValueAnimator V3;
    public final dh.d W1;
    public AnimatorSet W2;
    public int W3;
    public boolean X1;
    public AnimatorSet X2;
    public ii X3;
    public float Y1;
    public final org.telegram.ui.ActionBar.q0 Y2;
    public wm Y3;
    public final vh Z1;
    public final hi.u Z2;
    public final int[] Z3;
    public final org.telegram.ui.ActionBar.e2 f36424a2;
    public final org.telegram.ui.ActionBar.q0 f36425a3;
    public int f36426a4;
    public final boolean f36427b2;
    public hi.l3 f36428b3;
    public float f36429b4;
    public ue f36430c2;
    public final org.telegram.ui.ActionBar.q0 f36431c3;
    public float f36432c4;
    public boolean d2;
    public final gi.j f36433d3;
    public boolean f36434d4;
    public final ChatAttachAlertPhotoLayout f36435e2;
    public float f36436e3;
    public float f36437e4;
    public mj f36438f2;
    public float f36439f3;
    public final boolean f36440f4;
    public vi f36441g2;
    public final kh f36442g3;
    public boolean f36443g4;
    public jn f36444h2;
    public final TextView f36445h3;
    public final ArrayList f36446h4;
    public jn f36447i2;
    public final org.telegram.ui.ActionBar.q0 f36448i3;
    public final Rect f36449i4;
    public dl f36450j2;
    public final LinearLayout j3;
    public float f36451j4;
    public dk f36452k2;
    public final ImageView f36453k3;
    public boolean f36454k4;
    public im f36455l2;
    public final LinearLayout f36456l3;
    public int f36457l4;
    public final te.a f36458m1;
    public yi f36459m2;
    public final TextView f36460m3;
    public final vh f36461m4;
    public final te.a n1;
    public kg.g0 f36462n2;
    public float f36463n3;
    public r1.g f36464n4;
    public final te.a f36465o1;
    public ek f36466o2;
    public boolean f36467o3;
    public AnimatorSet o4;
    public final te.a f36468p1;
    public ek f36469p2;
    public final xh f36470p3;
    public int f36471p4;
    public final te.a f36472q1;
    public oi.o f36473q2;
    public boolean f36474q3;
    public int f36475q4;
    public final te.a f36476r1;
    public qk f36477r2;
    public Object f36478r3;
    public boolean f36479r4;
    public final te.j f36480s1;
    public boolean f36481s2;
    public boolean f36482s3;
    public boolean f36483s4;
    public org.telegram.ui.ym f36484t1;
    public float f36485t2;
    public final lh.f f36486t3;
    public boolean f36487t4;
    public final h6 f36488u1;
    public final ci[] f36489u2;
    public final mh f36490u3;
    public cl f36491u4;
    public final h6 f36492v1;
    public final LongSparseArray f36493v2;
    public final kh f36494v3;
    public boolean f36495v4;
    public final ImageView f36496w1;
    public ci f36497w2;
    public final lh f36498w3;
    public boolean f36499w4;
    public final org.telegram.ui.ActionBar.t2 f36500x1;
    public ci f36501x2;
    public final v4.b0 f36502x3;
    public File f36503x4;
    public final ImageView f36504y1;
    public final fh.g f36505y2;
    public final hi f36506y3;
    public double[] f36507y4;
    public final org.telegram.ui.ActionBar.t2 f36508z1;
    public final fh.g f36509z2;
    public boolean f36510z3;
    public boolean f36511z4;

    public ki(Activity activity, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11) {
        this(activity, e2Var, z10, z11, true, null);
    }

    public static void I0(ki kiVar) {
        boolean z10;
        boolean q10;
        int i7;
        o7 o7Var = kiVar.V2;
        lh.f fVar = kiVar.f36486t3;
        if (fVar != null && o7Var != null) {
            ci ciVar = kiVar.f36501x2;
            if (ciVar == null) {
                ciVar = kiVar.f36497w2;
            }
            int i10 = 0;
            if (ciVar != null && ciVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.e6 e6Var = kiVar.J0;
            if (e6Var != null) {
                q10 = e6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            if (!z10 && o7Var.getVisibility() == 0) {
                if (q10) {
                    i7 = 255;
                } else {
                    i7 = 160;
                }
                i10 = (int) (o7Var.getAlpha() * i7);
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void K0(ki kiVar) {
        hi.i iVar = new hi.i(kiVar, kiVar.getContext(), kiVar.U1, LaunchActivity.Q(), kiVar.J0, 1);
        kiVar.C4 = iVar;
        iVar.p(new ff(kiVar, 1));
        ViewGroup viewGroup = kiVar.f29682b;
        viewGroup.addView(kiVar.C4, viewGroup.indexOfChild(kiVar.B2), c8.ja.e(-1, -1, 83));
        hi.i iVar2 = kiVar.C4;
        iVar2.getAdapter().f17119c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f17122e = false;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
        boolean z10 = true;
        if (e2Var instanceof org.telegram.ui.an) {
            iVar2.getAdapter().f17133n0 = false;
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            jg.h1 adapter = iVar2.getAdapter();
            anVar.j();
            TLRPC.Chat chat = anVar.f45172e;
            adapter.getClass();
            adapter.m0 = chat;
            iVar2.getAdapter().W(anVar.f45333q8);
            jg.h1 adapter2 = iVar2.getAdapter();
            if (anVar.f45172e == null) {
                z10 = false;
            }
            adapter2.f17125f0 = z10;
        } else {
            iVar2.getAdapter().f17133n0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f17125f0 = false;
        }
        iVar2.getAdapter().f17126g0 = false;
        kiVar.J1();
    }

    public static int L0(ki kiVar) {
        ci ciVar = kiVar.f36497w2;
        jn jnVar = kiVar.f36444h2;
        if (ciVar == jnVar && jnVar.F != null) {
            return jnVar.getEmojiPadding();
        }
        jn jnVar2 = kiVar.f36447i2;
        if (ciVar == jnVar2 && jnVar2.F != null) {
            return jnVar2.getEmojiPadding();
        }
        if (kiVar.X1) {
            return kiVar.N2.getEmojiPadding();
        }
        return kiVar.C2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.q10.B(user) && !org.telegram.messenger.q10.t(user) && !org.telegram.messenger.q10.x(user) && !org.telegram.messenger.q10.A(user.f28200id) && !org.telegram.messenger.q10.z(user) && !org.telegram.messenger.q10.s(user) && user.f28200id != 489000 && !org.telegram.messenger.np.F2(user)) {
            return true;
        }
        return false;
    }

    public static void s1(ci ciVar) {
        if (ciVar != null) {
            int i7 = org.telegram.ui.ActionBar.q6.f29535b;
            Object tag = ciVar.getTag(2131296710);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
                return;
            }
            ciVar.setTag(2131296710, Integer.valueOf(i7));
            try {
                org.telegram.ui.ActionBar.q6.c0(ciVar, true);
                ciVar.d();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void A1(String str) {
        boolean z10 = true;
        this.O2 = 1;
        this.A1 = true;
        this.Q2 = false;
        this.K3 = false;
        this.f36494v3.setVisibility(8);
        this.f36445h3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
        if (chatAttachAlertPhotoLayout != null) {
            ki kiVar = chatAttachAlertPhotoLayout.f33609b;
            if (kiVar.O2 == 0 || kiVar.A1) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f32385h1 = z10;
        }
    }

    public final void B1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.B1(boolean):void");
    }

    public final void C1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.C1(long, java.lang.String, boolean, boolean):void");
    }

    public final void D1(org.telegram.ui.ActionBar.e2 e2Var) {
        if ((e2Var instanceof org.telegram.ui.an) && org.telegram.messenger.t3.V(((org.telegram.ui.an) e2Var).f45172e)) {
            new cc(this.f36470p3, this.J0).f(org.telegram.messenger.np.s1(this.H3).V4, new od(6, this, e2Var)).j();
        }
    }

    public final boolean E1(boolean z10, boolean z11) {
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
        ci ciVar;
        float f19;
        float L;
        long N1;
        float f20;
        float f21;
        o7 o7Var;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float L2;
        this.n1.a(z10, true);
        kh khVar = this.B2;
        if (khVar.getTag() != null) {
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
        khVar.setTag(num);
        nh nhVar = this.C2;
        if (nhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(nhVar.getEditText());
        }
        nhVar.k(true);
        this.N2.k(true);
        kh khVar2 = this.f36494v3;
        kh khVar3 = this.F2;
        if (z10) {
            if (!this.I1) {
                khVar.setVisibility(0);
            }
            khVar3.setVisibility(0);
        } else if (this.Q2) {
            khVar2.setVisibility(0);
        }
        ci ciVar2 = this.f36497w2;
        if ((ciVar2 == this.f36435e2 || ciVar2 == this.f36455l2) && this.X1) {
            z13 = true;
        } else {
            z13 = false;
        }
        o7 o7Var2 = this.V2;
        ai.k0 k0Var = this.M2;
        kg.j jVar = this.A2;
        sh shVar = this.G2;
        float f29 = 1.0f;
        if (z11) {
            this.K2 = new AnimatorSet();
            if (z13) {
                k0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(khVar, property, f20));
            if (z10 && !z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f21));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                o7Var = o7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                o7Var = o7Var2;
            }
            if (z10 && z13) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(k0Var, property, f22));
            Property property2 = View.SCALE_X;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(khVar3, property2, f23));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(khVar3, property3, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(khVar3, property, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(shVar, property2, f26));
            if (z10) {
                f27 = 1.0f;
            } else {
                f27 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(shVar, property3, f27));
            if (o7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(khVar, property4, L2));
            } else if (this.Q2) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f28 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(khVar2, property5, f28));
                if (z10) {
                    f29 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(khVar2, property, f29));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new tg(this, 5));
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
            khVar.setAlpha(f10);
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
            khVar3.setScaleX(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            khVar3.setScaleY(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = f12;
            }
            khVar3.setAlpha(f15);
            if (z10 && z13) {
                i10 = i7;
            } else {
                i10 = 8;
            }
            k0Var.setVisibility(i10);
            if (z10 && z13) {
                f16 = 1.0f;
            } else {
                f16 = f12;
            }
            k0Var.setAlpha(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            shVar.setScaleX(f17);
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            shVar.setScaleY(f18);
            if (o7Var2.getTag() != null) {
                if (z10) {
                    L = f12;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                khVar.setTranslationY(L);
            } else if (this.Q2 && ((ciVar = this.f36497w2) == null || ciVar.N())) {
                if (z10) {
                    f19 = org.telegram.messenger.g0.L(84.0f);
                } else {
                    f19 = f12;
                }
                khVar2.setTranslationY(f19);
            }
            if (!z10) {
                khVar.setVisibility(4);
                khVar3.setVisibility(4);
            }
            if (z13) {
                Q1();
            }
        }
        if (z10) {
            i7 = Math.max(1, this.f36497w2.getSelectedItemsCount());
        }
        shVar.e(i7, z11);
        if (this.F3 != null) {
            N1 = 0;
        } else {
            N1 = org.telegram.messenger.np.s1(this.H3).N1(b1());
        }
        shVar.i(X0() + this.f36497w2.getSelectedItemsCount(), N1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), shVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            nhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(ci ciVar) {
        long j3 = this.U2;
        kn knVar = this.O1;
        if (ciVar == knVar) {
            j3 = knVar.f36556s;
        } else if (ciVar == this.f36435e2) {
            j3 = 1;
        } else if (ciVar == this.f36441g2) {
            j3 = 3;
        } else if (ciVar == this.f36452k2) {
            j3 = 4;
        } else if (ciVar == this.f36438f2) {
            j3 = 5;
        } else if (ciVar == this.f36450j2) {
            j3 = 6;
        } else if (ciVar == this.f36444h2) {
            j3 = 9;
        } else if (ciVar == this.f36459m2) {
            j3 = 10;
        } else if (ciVar == this.f36462n2) {
            j3 = 11;
        } else if (ciVar == this.f36447i2) {
            j3 = 12;
        } else if (ciVar == this.f36466o2) {
            j3 = 14;
        } else if (ciVar == this.f36469p2) {
            j3 = 13;
        } else if (ciVar == this.f36473q2) {
            j3 = 16;
        } else if (ciVar == this.f36477r2) {
            j3 = 17;
        }
        G1(ciVar, j3, true);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ci ciVar;
        int i10;
        if (i7 == 0) {
            U0();
            R0();
            return;
        }
        int i11 = 1;
        if (i7 == 2) {
            R0();
            jn jnVar = this.f36444h2;
            if (jnVar != null && ((ciVar = this.f36501x2) == jnVar || this.f36497w2 == jnVar)) {
                if (ciVar == jnVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                P1(i10);
            }
            jn jnVar2 = this.f36447i2;
            if (jnVar2 != null) {
                ci ciVar2 = this.f36501x2;
                if (ciVar2 == jnVar2 || this.f36497w2 == jnVar2) {
                    if (ciVar2 != jnVar2) {
                        i11 = 0;
                    }
                    P1(i11);
                }
            }
        } else if (i7 == 1) {
            R0();
        } else if (i7 == 3) {
            T0();
        } else if (i7 == 4) {
            T0();
        } else if (i7 == 5) {
            T0();
            sh shVar = this.G2;
            if (shVar != null) {
                shVar.setEphemeralFactor(f10);
                shVar.setSameWidthFactor(f10);
            }
        }
    }

    public final void G1(ci ciVar, long j3, boolean z10) {
        boolean z11;
        int i7;
        xl xlVar;
        boolean z12;
        Integer num;
        xl xlVar2;
        int i10;
        int L;
        Float f10;
        int i11;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f36478r3 == null && this.K2 == null) {
            ci ciVar2 = this.f36497w2;
            if (ciVar2 == ciVar) {
                ciVar2.K();
            } else if (ciVar == this.f36447i2 && !org.telegram.messenger.m10.i(this.H3).q()) {
                new ug.x0(this.f36424a2, 39, false).show();
            } else {
                int i12 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f36472q1.a(z11, z10);
                this.f36480s1.f(Long.valueOf(j3), z10);
                this.B3 = false;
                this.f36510z3 = false;
                this.D3 = 0.0f;
                this.C3.setVisibility(8);
                RadialProgressView radialProgressView = this.A3;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                kh khVar = this.f36494v3;
                khVar.setAlpha(1.0f);
                khVar.setTranslationY(this.D3);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f36493v2;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((ki.y3) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.U2 = j3;
                lh lhVar = this.f36498w3;
                int childCount = lhVar.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = lhVar.getChildAt(i14);
                    if (childAt instanceof ei) {
                        ei eiVar = (ei) childAt;
                        i11 = childCount;
                        f10 = valueOf;
                        if (eiVar.f34321b == eiVar.f34322c.U2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        eiVar.f34616a.f(z13, true);
                    } else {
                        f10 = valueOf;
                        i11 = childCount;
                        if (childAt instanceof di) {
                            ((di) childAt).a(true);
                        }
                    }
                    i14++;
                    childCount = i11;
                    valueOf = f10;
                }
                Float f11 = valueOf;
                int firstOffset = (this.f36497w2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Z3[0];
                this.f36501x2 = ciVar;
                S0(ciVar);
                if (this.f36501x2.j() != 0) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                o7 o7Var = this.V2;
                o7Var.setVisibility(i7);
                if (o7Var.f29304o0) {
                    o7Var.n(true);
                }
                this.f36497w2.u();
                ci ciVar3 = this.f36501x2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
                if (ciVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f36501x2.I(this.f36497w2);
                this.f36501x2.setVisibility(0);
                if (ciVar.getParent() != null) {
                    this.f29682b.removeView(this.f36501x2);
                }
                int indexOfChild = this.f29682b.indexOfChild(this.f36497w2);
                if (this.f36501x2.getParent() != this.f29682b) {
                    s1(this.f36501x2);
                    ViewGroup viewGroup = this.f29682b;
                    ci ciVar4 = this.f36501x2;
                    if (ciVar4 != this.f36450j2) {
                        indexOfChild++;
                    }
                    viewGroup.addView(ciVar4, indexOfChild, c8.ja.c(-1.0f, -1));
                }
                vg vgVar = new vg(this, 5);
                ci ciVar5 = this.f36497w2;
                boolean z14 = ciVar5 instanceof im;
                vh vhVar = this.Z1;
                if (!z14 && !(this.f36501x2 instanceof im)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f36501x2.setAlpha(0.0f);
                        this.f36501x2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f36497w2, View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f36497w2, vhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(o7Var, View.ALPHA, o7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(er.f34419f);
                        animatorSet.addListener(new di.y3(this, firstOffset, vgVar, 1));
                        this.f36478r3 = animatorSet;
                        ci ciVar6 = this.f36497w2;
                        vhVar.getClass();
                        vhVar.a(ciVar6, f11);
                        animatorSet.start();
                    } else {
                        ciVar5.setAlpha(0.0f);
                        vgVar.run();
                        P1(0);
                        this.f29682b.invalidate();
                    }
                } else {
                    int max = Math.max(this.f36501x2.getWidth(), this.f36497w2.getWidth());
                    ci ciVar7 = this.f36501x2;
                    if (ciVar7 instanceof im) {
                        ciVar7.setTranslationX(max);
                        ci ciVar8 = this.f36497w2;
                        if ((ciVar8 instanceof ChatAttachAlertPhotoLayout) && (xlVar2 = ((ChatAttachAlertPhotoLayout) ciVar8).Q) != null) {
                            xlVar2.setVisibility(4);
                        }
                    } else {
                        this.f36497w2.setTranslationX(-max);
                        ci ciVar9 = this.f36501x2;
                        if (ciVar9 == chatAttachAlertPhotoLayout && (xlVar = ((ChatAttachAlertPhotoLayout) ciVar9).Q) != null) {
                            xlVar.setVisibility(0);
                        }
                    }
                    this.f36501x2.setAlpha(1.0f);
                    this.f36497w2.setAlpha(1.0f);
                    if (z10) {
                        ci ciVar10 = this.f36497w2;
                        vhVar.getClass();
                        vhVar.a(ciVar10, f11);
                        org.telegram.messenger.g0.h3(new yf(this, ciVar, vgVar, 2));
                    } else {
                        if (this.f36501x2.getCurrentItemTop() <= ciVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f36497w2.v(1.0f);
                        this.f36501x2.v(1.0f);
                        this.f36497w2.m(this.f36451j4);
                        this.f36501x2.m(this.f36451j4);
                        this.f29682b.invalidate();
                        this.Y0.g();
                        ci ciVar11 = this.f36497w2;
                        Float valueOf2 = Float.valueOf(1.0f);
                        vhVar.getClass();
                        vhVar.a(ciVar11, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        o7Var.setTag(num);
                        vgVar.run();
                    }
                }
                if (this.f36454k4 && !(ciVar instanceof ki.y3)) {
                    i10 = 0;
                    this.f36454k4 = false;
                    o7Var.updateColors();
                    o7Var.invalidate();
                    i1();
                } else {
                    i10 = 0;
                }
                if (i12 != 0 && j3 != 6 && j3 != 17 && !(ciVar instanceof ki.y3)) {
                    if (j3 == 4) {
                        L = org.telegram.messenger.g0.L(84.0f);
                    } else {
                        L = i10;
                    }
                } else {
                    L = org.telegram.messenger.g0.L(46.0f);
                }
                o7Var.setForcedMenuWidth(L);
            }
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean H0() {
        ci ciVar = this.f36497w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
        if (ciVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f32389j1) {
            return true;
        }
        return false;
    }

    public final void H1(boolean z10, Boolean bool) {
        ki kiVar;
        if (this.f36444h2 == null) {
            kiVar = this;
            jn jnVar = new jn(kiVar, getContext(), false, this.J0, bool);
            kiVar.f36444h2 = jnVar;
            kiVar.f36489u2[1] = jnVar;
            jnVar.setDelegate(new sg(this, 17));
        } else {
            kiVar = this;
        }
        G1(kiVar.f36444h2, 9L, z10);
    }

    @Override
    public final boolean I() {
        return this.f36497w2.b();
    }

    public final void I1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f10;
        float f11;
        ci ciVar;
        float f12;
        float f13;
        float f14;
        int i7;
        boolean z13;
        this.f36465o1.a(z10, z11);
        o7 o7Var = this.V2;
        if ((z10 && o7Var.getTag() == null) || (!z10 && o7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            o7Var.setTag(num);
            AnimatorSet animatorSet = this.W2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W2 = null;
            }
            if (!this.A1 && !this.R2 && ((this.O2 != 0 || !this.f36467o3) && this.f36497w2 == this.f36435e2 && (this.J3 || this.K3))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f36497w2 == this.O1) {
                z12 = false;
            }
            kh khVar = this.f36494v3;
            org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
            if (z10) {
                if (z12) {
                    q0Var.setVisibility(0);
                    q0Var.setClickable(true);
                }
            } else if (this.Q2 && this.B2.getTag() == null) {
                khVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
            if (e2Var != null) {
                if (z10) {
                    if (this.f36440f4) {
                        i7 = org.telegram.ui.ActionBar.j6.f28988kh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.f28922h5;
                    }
                    if (i0.a.h(org.telegram.ui.ActionBar.j6.w0(i7, this.J0)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.messenger.g0.q3(this, z13);
                } else {
                    org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
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
                animatorSet2.setDuration(Math.abs(f12 - o7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o7Var, property, f13);
                ofFloat.addUpdateListener(new tg(this, 4));
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
                this.W2.addListener(new org.telegram.ui.nn(3, this, z10));
                this.W2.setInterpolator(er.h);
                this.W2.setDuration(380L);
                this.W2.start();
                return;
            }
            if (z10 && this.Q2 && ((ciVar = this.f36497w2) == null || ciVar.N())) {
                khVar.setVisibility(4);
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            o7Var.setAlpha(f10);
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
                org.telegram.ui.ActionBar.q0 q0Var2 = this.f36431c3;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(4);
                }
                if (this.O2 != 0 || !this.f36467o3) {
                    q0Var.setVisibility(4);
                }
            }
        }
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.E2;
        nh nhVar = this.C2;
        nhVar.getLocationOnScreen(iArr);
        if (this.C4 != null) {
            ci ciVar = this.f36497w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
            if ((ciVar == chatAttachAlertPhotoLayout || ciVar == this.f36455l2) && this.X1) {
                ai.k0 k0Var = this.M2;
                alpha = (k0Var.getAlpha() * k0Var.getMeasuredHeight()) + (k0Var.getY() - this.C4.getTop());
            } else {
                alpha = -nhVar.getHeight();
            }
            if (Math.abs(this.C4.getTranslationY() - alpha) > 0.5f) {
                this.C4.setTranslationY(alpha);
                this.C4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                }
            }
        }
        U0();
    }

    @Override
    public final void K() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.f36464n4;
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

    public final void K1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.K1(int):void");
    }

    @Override
    public void L() {
        ii iiVar = this.X3;
        if (iiVar != null) {
            iiVar.d0(new vg(this, 4));
        } else {
            t1();
        }
    }

    public final void L1() {
        boolean i7;
        float f10;
        float f11;
        float f12;
        ci ciVar = this.f36497w2;
        int i10 = 0;
        if (ciVar == null) {
            i7 = false;
        } else {
            i7 = ciVar.i();
        }
        gi.j jVar = this.f36433d3;
        jVar.setEnabled(i7);
        ci ciVar2 = this.f36497w2;
        float f13 = 0.5f;
        if (ciVar2 != null) {
            if (ciVar2.i()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f36501x2 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.Y1;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        ci ciVar3 = this.f36501x2;
        if (ciVar3 != null) {
            if (ciVar3.i()) {
                f13 = 1.0f;
            }
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.Y1, f13, f10);
        }
        this.f36436e3 = f10;
        if (jVar != null) {
            float f14 = f10 * this.f36439f3;
            jVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            jVar.setVisibility(i10);
        }
    }

    @Override
    public final void M(int i7) {
        super.M(i7);
        this.f36497w2.r(i7);
    }

    public final void M0() {
        if (a1().f39053a.length() <= 0) {
            return;
        }
        this.f36497w2.a(a1().getText());
    }

    public final void M1(ci ciVar, int i7) {
        boolean z10;
        int i10;
        int i11;
        if (ciVar != null) {
            dh.g gVar = this.D4;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                gVar.f(0.0f, i7);
            }
            int currentItemTop = ciVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (ciVar == this.f36497w2 && currentItemTop <= ciVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.M1 = z10;
                if (ciVar == this.f36497w2) {
                    I1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ciVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.i20.D(11.0f, i10, currentItemTop);
                ci ciVar2 = this.f36497w2;
                if (ciVar2 == ciVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((ciVar2 instanceof im) || (this.f36501x2 instanceof im)) {
                    Object obj = this.f36478r3;
                    if ((obj instanceof r1.g) && ((r1.g) obj).f55742f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.Z3;
                int i12 = iArr[i11];
                if (i12 == D && !z11) {
                    if (i7 != 0) {
                        this.f36426a4 = i12;
                        return;
                    }
                    return;
                }
                this.f36426a4 = i12;
                iArr[i11] = D;
                P1(i11);
                this.f29682b.invalidate();
            }
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).Z6()) {
            return true;
        }
        return false;
    }

    public final void N1(boolean z10) {
        hi.u uVar;
        boolean z11;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.Z2) != null) {
            int i7 = 0;
            if (this.f36467o3 && this.d2 && this.f36497w2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.V();
            uVar.f15166f = z12;
            if (!z10) {
                ((u5) uVar.f15167g).a(z12);
            }
            uVar.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.q0 q0Var = this.f36425a3;
            if (z10 && this.f36467o3) {
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
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(er.h).withEndAction(new eh(this, z11, 0)).start();
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

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            return ChatActivityEnterView.K(this.H3, ((org.telegram.ui.an) e2Var).a(), e2Var, charSequence);
        }
        return false;
    }

    public final void O1(boolean z10) {
        boolean z11;
        float f10;
        ci ciVar = this.f36435e2;
        if (z10) {
            if (!this.H1) {
                return;
            }
            if (this.f36455l2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f36484t1;
                if (e6Var == null) {
                    e6Var = this.J0;
                }
                ?? ciVar2 = new ci(context, e6Var, this);
                ciVar2.E = 0.0f;
                ciVar2.F = 0.0f;
                ciVar2.G = 0.0f;
                ciVar2.H = 0.0f;
                ciVar2.I = 0.0f;
                ciVar2.J = 0.0f;
                ciVar2.K = null;
                ciVar2.L = false;
                ciVar2.N = 0.0f;
                ciVar2.R = false;
                ciVar2.T = false;
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ciVar2.U = z11;
                ciVar2.f35649n = e6Var;
                ciVar2.f33612f = true;
                ciVar2.setWillNotDraw(false);
                ki kiVar = ciVar2.f33609b;
                org.telegram.ui.ActionBar.y s5 = kiVar.V2.s();
                TextView textView = new TextView(context);
                ciVar2.f35654y = textView;
                org.telegram.ui.ActionBar.e6 e6Var2 = ciVar2.f33608a;
                hi.u2 u2Var = new hi.u2(ciVar2, context, s5, e6Var2, 2);
                o7 o7Var = kiVar.V2;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                o7Var.addView(u2Var, 0, c8.ja.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var2);
                textView.setText(org.telegram.messenger.hd.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                u2Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                di.c1 c1Var = new di.c1(ciVar2, context, e6Var2, 17);
                ciVar2.f35650r = c1Var;
                c1Var.setAdapter(new org.telegram.ui.y7(ciVar2, 3));
                v4.b0 b0Var = new v4.b0(1, false);
                ciVar2.f35651s = b0Var;
                c1Var.setLayoutManager(b0Var);
                c1Var.setClipChildren(false);
                c1Var.setClipToPadding(false);
                c1Var.setOverScrollMode(2);
                c1Var.setVerticalScrollBarEnabled(false);
                hm hmVar = new hm(ciVar2, context);
                ciVar2.f35652w = hmVar;
                hmVar.setClipToPadding(true);
                hmVar.setClipChildren(true);
                ciVar2.addView(c1Var, c8.ja.c(-1.0f, -1));
                ciVar2.Q = kiVar.f36435e2;
                hmVar.f35290c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar2.Q;
                hmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                hmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                hmVar.c();
                UndoView undoView = new UndoView(context, null, false, kiVar.f36484t1);
                ciVar2.f35653x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                ciVar2.addView(undoView, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                ciVar2.O = context.getResources().getDrawable(2131232550);
                this.f36455l2 = ciVar2;
                ciVar2.bringToFront();
            }
            ci ciVar3 = this.f36497w2;
            im imVar = this.f36455l2;
            if (ciVar3 != imVar) {
                ciVar = imVar;
            }
            F1(ciVar);
            return;
        }
        F1(ciVar);
    }

    public final void P0() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        lh lhVar = this.f36498w3;
        if (lhVar == null) {
            return;
        }
        int childCount = lhVar.getChildCount();
        boolean z11 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            lhVar.getChildAt(i17);
        }
        boolean z12 = this.f36440f4;
        if (z12) {
            i7 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        }
        org.telegram.ui.ActionBar.q6.U(this.f36445h3, i7, this.J0);
        if (z12) {
            i10 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        }
        org.telegram.ui.ActionBar.q6.U(this.f36460m3, i10, this.J0);
        org.telegram.ui.ActionBar.q6.U(this.f36433d3, org.telegram.ui.ActionBar.j6.Ji, this.J0);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f28957j5;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
        if (this.f36479r4 && w02 == this.f36475q4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f36479r4 = true;
        this.f36475q4 = w02;
        org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
        if (z10) {
            q0Var.setIconColor(w02);
        }
        Drawable background = q0Var.getBackground();
        if (z12) {
            i12 = org.telegram.ui.ActionBar.j6.Zg;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.I5;
        }
        org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(i12, this.J0), background);
        int i18 = org.telegram.ui.ActionBar.j6.E8;
        q0Var.P(org.telegram.ui.ActionBar.j6.w0(i18, this.J0), false);
        q0Var.P(org.telegram.ui.ActionBar.j6.w0(i18, this.J0), true);
        q0Var.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.J0));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f36425a3;
        if (q0Var2 != null && z10) {
            q0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.f36431c3;
        if (q0Var3 != null) {
            if (z10) {
                q0Var3.setIconColor(w02);
            }
            Drawable background2 = q0Var3.getBackground();
            if (z12) {
                i16 = org.telegram.ui.ActionBar.j6.Zg;
            } else {
                i16 = org.telegram.ui.ActionBar.j6.I5;
            }
            org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(i16, this.J0), background2);
        }
        nh nhVar = this.C2;
        org.telegram.ui.ActionBar.e6 e6Var = nhVar.N;
        mt mtVar = nhVar.f39053a;
        int i19 = nhVar.M;
        if (i19 == 0) {
            mtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.H6, e6Var));
            int i20 = org.telegram.ui.ActionBar.j6.G6;
            mtVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(i20, e6Var));
            mtVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(i20, e6Var));
        } else if (i19 != 2 && i19 != 3) {
            mtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29145t5, e6Var));
            mtVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, e6Var));
        } else {
            mtVar.setHintTextColor(-1929379841);
            mtVar.setTextColor(-1);
            mtVar.setCursorColor(-1);
            mtVar.setHandlesColor(-1);
            mtVar.setHighlightColor(822083583);
            mtVar.E = -1;
        }
        nhVar.f39055c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Oe, e6Var), PorterDuff.Mode.MULTIPLY));
        nt ntVar = nhVar.d;
        if (ntVar != null) {
            ntVar.updateColors();
        }
        org.telegram.ui.ActionBar.q6.l(lhVar, 21, org.telegram.ui.ActionBar.j6.A5, this.J0);
        if (z12) {
            i13 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f28957j5;
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        o7 o7Var = this.V2;
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, i13, e6Var2);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.j6.Zg;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.I5;
        }
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, i14, this.J0);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i15 = org.telegram.ui.ActionBar.j6.f28957j5;
        }
        org.telegram.ui.ActionBar.q6.l(o7Var, 5, i15, this.J0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.j6.C1(d12, this.f29715s0);
        ui.c cVar = this.E4;
        if (cVar.f58431b != d12) {
            cVar.a(d12);
            lh.f fVar = this.f36486t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            mh mhVar = this.f36490u3;
            if (mhVar != null) {
                mhVar.invalidate();
            }
        }
        this.f29682b.invalidate();
        int i21 = 0;
        while (true) {
            ci[] ciVarArr = this.f36489u2;
            if (i21 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i21];
            if (ciVar != null) {
                ciVar.d();
            }
            i21++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, this.J0);
            org.telegram.messenger.g0.t3(this, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z11 = true;
            }
            org.telegram.messenger.g0.n3(this, z11);
            return;
        }
        Q(org.telegram.ui.ActionBar.j6.f28922h5);
    }

    public final void P1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.P1(int):void");
    }

    public final void Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.Q0(boolean):void");
    }

    public final void Q1() {
        int i7 = 0;
        P1(0);
        this.f36470p3.invalidate();
        ai.k0 k0Var = this.M2;
        k0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
        if (chatAttachAlertPhotoLayout != null) {
            ql qlVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.Y();
            if (qlVar != null && qlVar.getFastScroll() != null) {
                zi0 fastScroll = qlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f32401q1;
                if (this.X1) {
                    i7 = (int) (k0Var.getAlpha() * k0Var.getMeasuredHeight());
                }
                fastScroll.f42381i0 = currentActionBarHeight + i7;
                qlVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.n1.f57085e;
        float f11 = (1.0f - this.f36458m1.f57085e) * f10;
        this.f36490u3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.f36465o1.f57085e))), 1.0f - f11));
    }

    public final void S0(ci ciVar) {
        int L;
        boolean e10 = ciVar.e();
        int i7 = 0;
        lh.f fVar = this.f36486t3;
        if (fVar != null) {
            if (e10) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            fVar.setFadeHeightBottom(L);
        }
        mh mhVar = this.f36490u3;
        if (mhVar != null) {
            if (e10) {
                i7 = 4;
            }
            mhVar.setVisibility(i7);
        }
    }

    public final void T0() {
        float f10;
        float f11 = this.f36468p1.f57085e;
        float f12 = this.f36472q1.f57085e;
        float a10 = a8.m7.a(this.f36476r1.f57085e);
        if (this.P3) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        t00.d(this.D2, com.google.android.gms.internal.vision.e2.D(f11, f12, a10, f10));
    }

    public final void U0() {
        sh shVar = this.G2;
        kh khVar = this.F2;
        ai.k0 k0Var = this.M2;
        if (k0Var != null && k0Var.getVisibility() == 0 && k0Var.getAlpha() != 0.0f) {
            float f10 = this.f36458m1.f57085e;
            float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
            shVar.setAlpha(abs * abs * abs * abs);
            khVar.setTranslationY(org.telegram.messenger.g0.T1(this.f36437e4, ((k0Var.getTranslationY() + k0Var.getTop()) - khVar.getTop()) + org.telegram.messenger.g0.L(8.0f), er.f34422j.getInterpolation(f10)));
            return;
        }
        khVar.setTranslationY(this.f36437e4);
        shVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.s6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            ci[] ciVarArr = this.f36489u2;
            if (i7 < ciVarArr.length) {
                ci ciVar = ciVarArr[i7];
                if (ciVar != null && (themeDescriptions = ciVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i7++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.f29685c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28940i5));
                return arrayList;
            }
        }
    }

    public final void V0(int i7) {
        this.Q2 = true;
        this.f36494v3.setVisibility(0);
        this.C1 = true;
        this.D1 = i7;
        this.O2 = 0;
        this.A1 = false;
        this.B1 = false;
        this.E1 = null;
        org.telegram.ui.ActionBar.q0 q0Var = this.f36448i3;
        if (q0Var != null) {
            this.f36445h3.setTranslationY(0.0f);
            q0Var.setVisibility(8);
        }
    }

    public final void W0(hi.q4 q4Var) {
        String M0 = org.telegram.messenger.hd.M0(2131752122, null);
        TextView textView = this.f36445h3;
        textView.setText(M0);
        this.Q2 = false;
        this.f36494v3.setVisibility(8);
        this.O2 = 1;
        this.A1 = true;
        this.B1 = true;
        this.d2 = false;
        this.E1 = q4Var;
        org.telegram.ui.ActionBar.q0 q0Var = this.f36448i3;
        if (q0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            q0Var.setVisibility(0);
            q0Var.setClickable(true);
            q0Var.setAlpha(1.0f);
            q0Var.setScaleX(1.0f);
            q0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (!(e2Var instanceof org.telegram.ui.an) || (kjVar = ((org.telegram.ui.an) e2Var).f45408w5) == null || (ijVar = kjVar.f24707b) == null) {
            return 0;
        }
        return ijVar.f24405g.size();
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) e2Var).f45172e;
        }
        return org.telegram.messenger.np.s1(this.H3).M0(Long.valueOf(-this.U1));
    }

    public final float Z0() {
        kh khVar = this.B2;
        float alpha = 1.0f - khVar.getAlpha();
        return khVar.getMeasuredHeight() - (alpha * (khVar.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.B4 = z10;
        }
        dismiss();
    }

    public final rt a1() {
        ci ciVar;
        if (this.X1 && ((ciVar = this.f36497w2) == this.f36435e2 || ciVar == this.f36455l2)) {
            return this.N2;
        }
        return this.C2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) e2Var).a();
        }
        return this.U1;
    }

    public final int c1(int i7) {
        ci ciVar = this.f36501x2;
        int[] iArr = this.Z3;
        if (ciVar != null && ((this.f36497w2 instanceof im) || (ciVar instanceof im))) {
            return org.telegram.messenger.g0.W1(this.Y1, iArr[0], iArr[1]);
        }
        return iArr[i7];
    }

    public final int d1(boolean z10) {
        boolean q10;
        int i7;
        o7 o7Var;
        if (this.f36440f4) {
            return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28988kh, this.J0);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        Iterator it = this.f36480s1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.f57094a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = c8.i9.a(f10, 0.0f, 1.0f);
        if (z10 && (o7Var = this.V2) != null && o7Var.getVisibility() == 0) {
            a10 *= 1.0f - o7Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
        if (q10) {
            i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f28940i5;
        }
        return i0.a.f(a10, w02, org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.T0 && i7 != org.telegram.messenger.ns.W4 && i7 != org.telegram.messenger.ns.F1) {
            if (i7 == org.telegram.messenger.ns.f25498f5) {
                this.F1 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).H0();
                return;
            }
            return;
        }
        hi hiVar = this.f36506y3;
        if (hiVar != null) {
            hiVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z10;
        ph phVar;
        nh nhVar;
        if (!this.f36497w2.q() && !this.J) {
            ci ciVar = this.f36497w2;
            qk qkVar = this.f36477r2;
            if (ciVar == qkVar && qkVar != null && !qkVar.L && qkVar.Q0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36481s2 = z10;
            if (!z10 && (nhVar = this.C2) != null) {
                org.telegram.messenger.g0.v1(nhVar.getEditText());
            }
            if (!this.f36481s2 && (phVar = this.N2) != null) {
                org.telegram.messenger.g0.v1(phVar.getEditText());
            }
            this.f36493v2.clear();
            org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
            if (e2Var == null) {
                e2Var = LaunchActivity.Q();
            }
            if (!this.B4 && e2Var != null && this.f36497w2.getSelectedItemsCount() > 0 && !this.A1) {
                if (!this.A4) {
                    this.A4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), this.J0);
                    String M0 = org.telegram.messenger.hd.M0(2131751399, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131751400, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751406, null), new sg(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    t1Var.setOnCancelListener(new yg(this, 0));
                    t1Var.O = new m0(this, 3);
                    t1Var.show();
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = 0;
            while (true) {
                ci[] ciVarArr = this.f36489u2;
                if (i7 >= ciVarArr.length) {
                    break;
                }
                ci ciVar2 = ciVarArr[i7];
                if (ciVar2 != null && this.f36497w2 != ciVar2) {
                    ciVar2.q();
                }
                i7++;
            }
            org.telegram.messenger.g0.t3(this, i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0), 0), true, new sg(this, 11));
            if (e2Var != null) {
                org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
            }
            this.f36443g4 = false;
            super.dismiss();
            this.B4 = false;
        }
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.e1():void");
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f36497w2.o(motionEvent);
    }

    public final boolean f1() {
        if (this.X1) {
            ci ciVar = this.f36497w2;
            if (ciVar == this.f36435e2 || ciVar == this.f36455l2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        ii iiVar = this.X3;
        if (iiVar != null && !this.f36482s3) {
            boolean g02 = iiVar.g0();
            this.f36482s3 = true;
            di.m6 m6Var = new di.m6(this, editTextBoldCursor, z10, 19);
            if (g02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(m6Var, j3);
        }
    }

    public final void i1() {
        if (this.f29715s0 != null && this.f29682b != null) {
            int d12 = d1(false);
            org.telegram.ui.ActionBar.j6.C1(d12, this.f29715s0);
            ui.c cVar = this.E4;
            if (cVar.f58431b != d12) {
                cVar.a(d12);
                lh.f fVar = this.f36486t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                mh mhVar = this.f36490u3;
                if (mhVar != null) {
                    mhVar.invalidate();
                }
            }
            L1();
            this.f29682b.invalidate();
        }
    }

    @Override
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final qk qkVar = this.f36477r2;
        if (qkVar != null && this.f36497w2 == qkVar) {
            final vg vgVar = new vg(this, 1);
            int i7 = qkVar.f38676n;
            org.telegram.ui.Wallet.o9 o9Var = qkVar.S;
            ki kiVar = qkVar.f33609b;
            AnimatorSet animatorSet = null;
            if (!qkVar.L && (wallettransaction = qkVar.Q0) != null && qkVar.R0 == null && qkVar.S0 == null) {
                if (qkVar.T0) {
                    org.telegram.ui.Wallet.y5 y5Var = new org.telegram.ui.Wallet.y5();
                    y5Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
                    if (e2Var != null && e2Var.presentFragment(y5Var, false, true)) {
                        org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(kiVar.f29685c, kiVar.f29682b, o9Var.getDiamondView(), y5Var, qkVar.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!qkVar.L) {
                                            vgVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!qkVar.L) {
                                            vgVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, kiVar);
                        qkVar.S0 = daVar;
                        animatorSet = daVar.f43771m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.w6 diamondView = o9Var.getDiamondView();
                    if (diamondView.f44641f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36424a2;
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (anVar.getCurrentAccount() == i7 && anVar.a() == qkVar.f38681r.f28200id && anVar.f45203g4 == 0 && anVar.getFragmentView() != null && anVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.o6 o6Var = new org.telegram.ui.Wallet.o6(kiVar.f29685c, kiVar.f29682b, o9Var.getDiamondView(), anVar, qkVar.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!qkVar.L) {
                                                    vgVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!qkVar.L) {
                                                    vgVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, kiVar);
                                qkVar.R0 = o6Var;
                                animatorSet = o6Var.f44258m;
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
        int i7 = 0;
        while (true) {
            ci[] ciVarArr = this.f36489u2;
            if (i7 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null) {
                ciVar.p();
            }
            i7++;
        }
        int i10 = this.H3;
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.T0);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.W4);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25498f5);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.F1);
        this.Q1 = true;
        nh nhVar = this.C2;
        if (nhVar != null) {
            nhVar.o();
        }
        ph phVar = this.N2;
        if (phVar != null) {
            phVar.o();
        }
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        boolean z10;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
        s71 s71Var = chatAttachAlertPhotoLayout.m0;
        bi.g2 g2Var = chatAttachAlertPhotoLayout.f32390k0;
        TextView textView = chatAttachAlertPhotoLayout.f32400q0;
        ql qlVar = chatAttachAlertPhotoLayout.f32402r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = org.telegram.messenger.g0.f23606n;
        if (view == g2Var) {
            if (z10) {
                if (qlVar.getVisibility() == 0) {
                    g2Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                g2Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (qlVar.getVisibility() == 0) {
                g2Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            } else {
                g2Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == s71Var) {
            if (z10) {
                if (qlVar.getVisibility() == 0) {
                    s71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                s71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            } else if (qlVar.getVisibility() == 0) {
                s71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            } else {
                s71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                L = (i13 - textView.getMeasuredWidth()) / 2;
                int L2 = i12 - org.telegram.messenger.g0.L(167.0f);
                textView.setRotation(0.0f);
                if (qlVar.getVisibility() == 0) {
                    L2 -= org.telegram.messenger.g0.L(96.0f);
                }
                measuredWidth = L2 - i15;
            } else {
                L = i11 - org.telegram.messenger.g0.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
                textView.setRotation(-90.0f);
                if (qlVar.getVisibility() == 0) {
                    L -= org.telegram.messenger.g0.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != qlVar) {
            return false;
        } else {
            if (z10) {
                int z11 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z11, view.getMeasuredWidth(), view.getMeasuredHeight() + z11);
                return true;
            }
            int L3 = (i7 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void k1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p10;
        if (tL_attachMenuBot != null) {
            p10 = tL_attachMenuBot.short_name;
        } else {
            p10 = org.telegram.messenger.q10.p(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.b0(this.H3).f26471b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.f28200id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.hd.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.hd.M0(2131753001, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.hd.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        t1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, "OK"), new a3.h(this, tL_attachMenuBot, user, 25));
        i5.c.x("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36435e2;
        am amVar = chatAttachAlertPhotoLayout.f32409w;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        ql qlVar = chatAttachAlertPhotoLayout.f32402r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.f32404s;
        if (i7 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.f32374c0 && !chatAttachAlertPhotoLayout.f32378e0) {
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(kiVar.U() + kiVar.T() + i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            bi.g2 g2Var = chatAttachAlertPhotoLayout.f32390k0;
            if (view == g2Var) {
                if (z10) {
                    g2Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824));
                    return true;
                }
                g2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            s71 s71Var = chatAttachAlertPhotoLayout.m0;
            if (view == s71Var) {
                if (z10) {
                    s71Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                    return true;
                }
                s71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == qlVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    qlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
                    if (b0Var.f58489o != 0) {
                        qlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        amVar.f();
                    }
                } else {
                    qlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (b0Var.f58489o != 1) {
                        qlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        amVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        int i7 = 0;
        while (true) {
            ci[] ciVarArr = this.f36489u2;
            if (i7 < ciVarArr.length) {
                ci ciVar = ciVarArr[i7];
                if (ciVar != null) {
                    ciVar.A();
                }
                i7++;
            } else {
                this.f36434d4 = true;
                return;
            }
        }
    }

    @Override
    public final boolean m0() {
        int i7;
        this.f36435e2.setTranslationX(0.0f);
        this.f36456l3.setAlpha(0.0f);
        this.j3.setAlpha(1.0f);
        this.f29682b.setTranslationY(this.f29682b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.o4 = animatorSet;
        vh vhVar = this.f36461m4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, vhVar, 0.0f, 400.0f));
        this.o4.setDuration(400L);
        this.o4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        vhVar.getClass();
        vhVar.a(this, valueOf);
        this.o4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new tg(this, 2));
        r1.g gVar = this.f36464n4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.f29682b, (r1.e) r1.g.f55732p, 0.0f);
        this.f36464n4 = gVar2;
        if (this.F3 != null) {
            gVar2.f55748m.a(0.75f);
            this.f36464n4.f55748m.b(350.0f);
        } else {
            gVar2.f55748m.a(0.75f);
            this.f36464n4.f55748m.b(350.0f);
        }
        this.f36464n4.h();
        if (this.K) {
            this.f29685c.setLayerType(2, null);
        }
        this.B0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        i6 i6Var = k6.d;
        if (this.f29710p0) {
            i7 = this.f29711q0;
        } else {
            i7 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, i6Var, i7));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.f29706l0);
        h2.f fVar = new h2.f((int[]) null);
        yf yfVar = new yf(this, fVar, this.f29725z0, 3);
        this.f36464n4.a(new bi.v0(3, this, yfVar));
        this.A0.addListener(new ah.l(25, this, yfVar));
        fVar.d();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25518j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new tg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(er.f34419f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        this.f36434d4 = false;
        while (true) {
            ci[] ciVarArr = this.f36489u2;
            if (i7 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null) {
                ciVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.X3.g0();
        }
        hi hiVar = this.f36506y3;
        if (hiVar != null) {
            hiVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.gj gjVar = this.F3;
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        int i7 = this.H3;
        if (gjVar != null && gjVar.p5() && !org.telegram.messenger.t3.z(i7, 24, org.telegram.messenger.gj.B0(this.F3.f23819k)) && (e2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            org.telegram.messenger.lj ljVar = anVar.f45421x5;
            if (ljVar == null) {
                ljVar = org.telegram.messenger.lj.b(this.F3.f23819k.suggested_post);
            }
            if (!di.u8.T(i7, ljVar.f24844a)) {
                anVar.Ac(ljVar);
                return;
            }
        }
        if (this.F1 - this.G1 < 0) {
            org.telegram.messenger.g0.E3(this.f36488u1);
            org.telegram.messenger.g0.E3(this.f36492v1);
            try {
                this.G2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.np.s1(i7).D3() && org.telegram.messenger.np.s1(i7).V4 > this.G1) {
                D1(e2Var);
                return;
            }
            return;
        }
        if (this.F3 == null && (e2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar2 = (org.telegram.ui.an) e2Var;
            if (anVar2.c()) {
                t4.J(getContext(), anVar2.a(), new sg(this, 14), this.J0);
                return;
            }
        }
        ci ciVar = this.f36497w2;
        if (ciVar != this.f36435e2 && ciVar != this.f36455l2) {
            if (!ciVar.M(true, 0, 0, this.L2, f1())) {
                this.B4 = true;
                dismiss();
                return;
            }
            return;
        }
        u1(true, 0, 0, this.L2, f1());
    }

    @Override
    public final void o0() {
        if (this.f36497w2.s()) {
            dismiss();
        }
    }

    public final void o1(int i7) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (i7 == 3) {
            if (this.L3 || !N0()) {
                if (e2Var != null) {
                    activity = e2Var.getParentActivity();
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
                p1(true);
            }
        } else if (i7 == 6 && org.telegram.messenger.g0.J1(e2Var)) {
            if (this.f36450j2 == null) {
                dl dlVar = new dl(this, getContext(), this.J0, (this.C1 || this.P3) ? false : false);
                this.f36450j2 = dlVar;
                this.f36489u2[5] = dlVar;
                cl clVar = this.f36491u4;
                if (clVar != null) {
                    dlVar.setDelegate(clVar);
                } else if (e2Var instanceof org.telegram.ui.an) {
                    dlVar.setDelegate(new sg(this, 18));
                }
            }
            F1(this.f36450j2);
        }
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
        o7 o7Var = this.V2;
        if (o7Var.f29304o0) {
            o7Var.n(true);
        } else if (this.f36497w2.k()) {
        } else {
            if (a1() != null && a1().f39056e) {
                a1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var != null) {
            org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f36497w2.H(i7)) {
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

    public final void p1(boolean z10) {
        if (!this.L3 && z10) {
            kn knVar = new kn(3, getContext(), this.J0, this);
            this.O1 = knVar;
            F1(knVar);
        }
        int i7 = 1;
        if (this.f36441g2 == null) {
            vi viVar = new vi(getContext(), this.J0, this);
            this.f36441g2 = viVar;
            this.f36489u2[3] = viVar;
            viVar.setupBlurredSearchField(this.F4);
            this.f36441g2.setDelegate(new sg(this, 15));
            if (this.C1) {
                this.f36441g2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) e2Var).f45172e;
            vi viVar2 = this.f36441g2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                i7 = -1;
            }
            viVar2.setMaxSelectedFiles(i7);
        }
        if (z10) {
            F1(this.f36441g2);
        }
    }

    public final void q1() {
        boolean z10;
        if (!this.O3) {
            kn knVar = new kn(5, getContext(), this.J0, this);
            this.O1 = knVar;
            F1(knVar);
        }
        if (this.f36438f2 == null) {
            mj mjVar = new mj(getContext(), this.J0, this);
            this.f36438f2 = mjVar;
            this.f36489u2[2] = mjVar;
            mjVar.setupBlurredSearchField(this.F4);
            this.f36438f2.setDelegate(new th(this));
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) e2Var).f45172e;
            mj mjVar2 = this.f36438f2;
            if (chat != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            mjVar2.setMultipleSelectionAllowed(z10);
        }
        F1(this.f36438f2);
    }

    public final void r1(boolean z10) {
        int i7;
        if (!this.I3 && z10) {
            kn knVar = new kn(4, getContext(), this.J0, this);
            this.O1 = knVar;
            F1(knVar);
        }
        boolean z11 = false;
        if (this.f36452k2 == null) {
            if (this.I1) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            dk dkVar = new dk(i7, getContext(), this.J0, this);
            this.f36452k2 = dkVar;
            this.f36489u2[4] = dkVar;
            dkVar.setDelegate(new uh(this));
        }
        int i10 = 1;
        if (this.C1) {
            this.f36452k2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
            if (e2Var instanceof org.telegram.ui.an) {
                TLRPC.Chat chat = ((org.telegram.ui.an) e2Var).f45172e;
                dk dkVar2 = this.f36452k2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                    i10 = -1;
                }
                dkVar2.setMaxSelectedFiles(i10);
            } else {
                this.f36452k2.setMaxSelectedFiles(this.Q3);
                dk dkVar3 = this.f36452k2;
                if (!this.I1 && !this.R1) {
                    z11 = true;
                }
                dkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        dk dkVar4 = this.f36452k2;
        dkVar4.f33948e0 = this.I1;
        if (z10) {
            F1(dkVar4);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P0();
            dh.d dVar = this.W1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, this.J0);
            org.telegram.ui.ActionBar.q0 q0Var = this.f36448i3;
            if (q0Var != null && w02 != this.f36471p4) {
                this.f36471p4 = w02;
                q0Var.setIconColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.G3 = false;
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            this.f29700i0 = ((org.telegram.ui.an) e2Var).V9();
        }
        L1();
        this.f36474q3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0), 0);
            this.H0 = o4;
            org.telegram.messenger.g0.t3(this, o4, false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        }
        if (this.f36454k4) {
            this.f36454k4 = false;
            o7 o7Var = this.V2;
            o7Var.updateColors();
            o7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.f29682b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        o7 o7Var = this.V2;
        int i7 = 1;
        if (o7Var.f29304o0) {
            o7Var.n(true);
        }
        this.f36438f2 = null;
        this.f36462n2 = null;
        this.f36441g2 = null;
        this.f36444h2 = null;
        this.f36447i2 = null;
        this.f36450j2 = null;
        this.f36452k2 = null;
        this.f36477r2 = null;
        while (true) {
            ci[] ciVarArr = this.f36489u2;
            if (i7 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null) {
                ciVar.p();
                this.f29682b.removeView(ciVarArr[i7]);
                ciVarArr[i7] = null;
            }
            i7++;
        }
        I1(false, false);
        super.L();
        if (this.f36481s2) {
            this.f36481s2 = false;
            this.f36485t2 = 0.0f;
            org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
            if (e2Var != null && e2Var.getFragmentView() != null) {
                View fragmentView = e2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f55671a;
                r0.y.c(fragmentView);
            }
        }
    }

    @Override
    public final void u0(boolean z10) {
        this.f29713r0 = true;
    }

    public final boolean u1(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        if (this.G3) {
            return false;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            TLRPC.Chat chat = anVar.f45172e;
            if (anVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.H3).f25273e7.edit();
                edit.putBoolean("silent_" + anVar.a(), !z10).commit();
            }
        }
        int i11 = 1;
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.f36476r1.f57086f) {
            this.G3 = true;
            this.X3.y1(7, true, z10, i7, i10, j3, z11, false, 0L);
            return true;
        }
        long b12 = b1();
        ci ciVar = this.f36497w2;
        if (ciVar != null) {
            i11 = ciVar.getSelectedItemsCount();
        }
        return t4.Y(this.H3, b12, X0() + i11, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                ki kiVar = ki.this;
                kiVar.G3 = true;
                kiVar.X3.y1(7, true, z10, i7, i10, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override
    public final void v() {
        if (this.f36424a2 instanceof org.telegram.ui.an) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.f36497w2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.hd.M0(2131754921, "AccDescrAttachButton"));
        this.f36474q3 = true;
        if (!this.K3 && !this.J3) {
            N0();
        }
    }

    public final void v1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i7;
        float f10;
        float f11;
        float measuredHeight;
        this.f36458m1.a(z10, z11);
        rt a12 = a1();
        this.X1 = z10;
        rt a13 = a1();
        int i10 = 0;
        if (this.B2.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ci ciVar = this.f36497w2;
        if (ciVar != this.f36435e2 && ciVar != this.f36455l2) {
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
        ai.k0 k0Var = this.M2;
        kg.j jVar = this.A2;
        float f13 = 0.0f;
        if (z11) {
            if (z12) {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            ViewPropertyAnimator animate = k0Var.animate();
            if (z14 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).setUpdateListener(new tg(this, 0)).withEndAction(new Runnable(this) {
                public final ki f40022b;

                {
                    this.f40022b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ki kiVar = this.f40022b;
                            if (!z14 || !z12) {
                                kiVar.M2.setVisibility(8);
                            }
                            kiVar.Q1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f40022b.A2.setVisibility(8);
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
            translationY.alpha(f12).setDuration(320L).setInterpolator(erVar).setUpdateListener(new tg(this, 1)).withEndAction(new Runnable(this) {
                public final ki f40022b;

                {
                    this.f40022b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ki kiVar = this.f40022b;
                            if (!z14 || !z12) {
                                kiVar.M2.setVisibility(8);
                            }
                            kiVar.Q1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f40022b.A2.setVisibility(8);
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
            k0Var.setVisibility(i7);
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            k0Var.setAlpha(f10);
            Q1();
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
        if (a12 != a13) {
            a12.k(true);
            a13.setText(p5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new vg(this, 0));
    }

    public final void w1(int i7, org.telegram.messenger.gj gjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (gjVar != null && (chatAttachAlertPhotoLayout = this.f36435e2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.F3 == gjVar && this.E3 == i7) {
            return;
        }
        this.F3 = gjVar;
        if (gjVar != null && gjVar.z2()) {
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
        this.f36506y3.f();
        K1(0);
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i7;
        float translationY = this.f29682b.getTranslationY() - this.f36485t2;
        this.f36485t2 = this.f29682b.getHeight() * f10;
        this.f29682b.setTranslationY(translationY);
        qk qkVar = this.f36477r2;
        if (qkVar != null) {
            qkVar.setSendTransitionProgress(f10);
        }
        if (this.f29710p0) {
            i7 = Math.round((1.0f - f10) * this.f29711q0);
        } else {
            i7 = 0;
        }
        this.Z.setAlpha(i7);
        this.D0 = 1.0f - f10;
        this.f29685c.invalidate();
    }

    public final void y1(int i7, boolean z10) {
        if (this.F3 != null) {
            return;
        }
        this.Q3 = i7;
        this.R3 = z10;
    }

    public final void z1(float f10) {
        boolean z10 = false;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o4;
        org.telegram.messenger.g0.t3(this, o4, false, null);
        if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.n3(this, z10);
        this.f29685c.invalidate();
    }

    public ki(Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        org.telegram.ui.ActionBar.q0 q0Var;
        gi.j jVar;
        int i7;
        float f10;
        te.j jVar2;
        er erVar = er.h;
        this.f36458m1 = new te.a(0, this, erVar, 380L, false);
        this.n1 = new te.a(1, this, erVar, 380L, false);
        this.f36465o1 = new te.a(2, this, erVar, 380L, false);
        this.f36468p1 = new te.a(3, this, erVar, 380L, false);
        this.f36472q1 = new te.a(4, this, erVar, 380L, true);
        this.f36476r1 = new te.a(5, this, erVar, 320L, false);
        te.j jVar3 = new te.j(new sg(this, 2), erVar, 380L);
        this.f36480s1 = jVar3;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Y1 = 0.0f;
        this.Z1 = new vh(this, 0);
        this.d2 = false;
        ci[] ciVarArr = new ci[12];
        this.f36489u2 = ciVarArr;
        this.f36493v2 = new LongSparseArray();
        this.E2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.H2 = textPaint;
        this.I2 = new RectF();
        this.J2 = new Paint(1);
        this.S2 = true;
        this.T2 = 1.0f;
        this.f36510z3 = false;
        this.B3 = false;
        int i10 = org.telegram.messenger.m10.f24940t0;
        this.H3 = i10;
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
        this.f36443g4 = false;
        ArrayList arrayList = new ArrayList();
        this.f36446h4 = arrayList;
        Rect rect = new Rect();
        this.f36449i4 = rect;
        this.f36461m4 = new vh(this, 1);
        this.f36483s4 = true;
        this.f36487t4 = false;
        this.A4 = false;
        this.B4 = false;
        this.f29723y = true;
        ui.c cVar = new ui.c();
        this.E4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0));
        this.Y0.E.add(new ri.o(cVar, new sg(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.gz.f()) {
            dh.g gVar = new dh.g(false);
            this.D4 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(cVar);
            fVar.f58440f = cVar;
            fVar.d = gVar;
            fVar.f58439e = -2;
            ui.f fVar2 = new ui.f(null);
            fVar2.f58440f = cVar;
            fVar2.d = gVar;
            fVar2.f58439e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.F4 = cVar2;
            cVar2.f8100k = true;
            int L = org.telegram.messenger.qc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.f8095e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.G4 = cVar3;
            cVar3.f8100k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.f8095e = L2;
        } else {
            this.D4 = null;
            this.F4 = new dh.c(cVar, cVar, cVar);
            this.G4 = new dh.c(cVar, cVar, cVar);
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.H4 = new zg(this, 0);
        this.f36440f4 = z10;
        this.f36427b2 = (e2Var instanceof org.telegram.ui.an) && e2Var.isInBubbleMode();
        this.f29706l0 = new OvershootInterpolator(0.7f);
        this.f36424a2 = e2Var;
        this.G = true;
        this.f29725z0 = this;
        org.telegram.messenger.ns.f(i10).c(this, org.telegram.messenger.ns.T0);
        org.telegram.messenger.ns.f(i10).c(this, org.telegram.messenger.ns.W4);
        org.telegram.messenger.ns.f(i10).c(this, org.telegram.messenger.ns.f25498f5);
        org.telegram.messenger.ns.f(i10).c(this, org.telegram.messenger.ns.F1);
        arrayList.add(rect);
        xh xhVar = new xh(this, context);
        this.f36470p3 = xhVar;
        xhVar.setDelegate(new yh(this));
        this.f29682b = xhVar;
        xhVar.setWillNotDraw(false);
        this.f29682b.setClipChildren(false);
        this.f29682b.setClipToPadding(false);
        ViewGroup viewGroup = this.f29682b;
        int i11 = this.f29717u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        o7 o7Var = new o7(this, context, e6Var, 1);
        this.V2 = o7Var;
        o7Var.f29283d1 = true;
        o7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        o7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        int i12 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, i12, e6Var);
        int i13 = org.telegram.ui.ActionBar.j6.I5;
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, i13, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 5, i12, e6Var);
        o7Var.setOccupyStatusBar(true);
        o7Var.setAlpha(0.0f);
        o7Var.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 13));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i12, this.J0), false, e6Var);
        this.Y2 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131231244);
        q0Var2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        q0Var2.setVisibility(4);
        q0Var2.setAlpha(0.0f);
        q0Var2.setScaleX(0.6f);
        q0Var2.setScaleY(0.6f);
        q0Var2.setSubMenuOpenSide(2);
        q0Var2.setDelegate(new sg(this, 10));
        q0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(q0Var2, h02, null, M, e6Var);
        q0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i14;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var3 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i14 = 2131748832;
                            } else {
                                i14 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i14, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var3.getWidth() / 2.0f) + q0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i12, this.J0), false, e6Var);
        this.f36425a3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        hi.u uVar = new hi.u();
        this.Z2 = uVar;
        q0Var3.setIcon(uVar);
        q0Var3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        q0Var3.setVisibility(8);
        q0Var3.setAlpha(0.0f);
        q0Var3.setScaleX(0.6f);
        q0Var3.setScaleY(0.6f);
        q0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i13);
        q0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(q0Var3, h03, null, M2, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i14;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i14 = 2131748832;
                            } else {
                                i14 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i14, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        gi.j jVar4 = new gi.j(this, context);
        org.telegram.ui.ActionBar.q6.U(jVar4, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        jVar4.setText(org.telegram.messenger.hd.M0(2131751753, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        jVar4.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i14;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i14 = 2131748832;
                            } else {
                                i14 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i14, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        c8.na.a(jVar4);
        this.f36433d3 = jVar4;
        L1();
        if (e2Var != null) {
            i7 = i12;
            jVar = jVar4;
            q0Var = q0Var3;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.q0 q0Var4 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i7, this.J0), false, e6Var);
            this.f36431c3 = q0Var4;
            q0Var4.setLongClickEnabled(false);
            q0Var4.setIcon(2131232487);
            q0Var4.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
            q0Var4.setVisibility(4);
            q0Var4.setAlpha(0.0f);
            q0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, this.J0), 6, -1);
            org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i13);
            q0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.q6.j(q0Var4, h04, null, M3, e6Var);
            q0Var4.setOnClickListener(new fi.x1(5, this, z11));
        } else {
            q0Var = q0Var3;
            jVar = jVar4;
            i7 = i12;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.q0 q0Var5 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i7, this.J0), false, e6Var);
        this.f36448i3 = q0Var5;
        q0Var5.setLongClickEnabled(false);
        q0Var5.setIcon(2131231244);
        q0Var5.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        q0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, this.J0), 3, -1);
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i13);
        q0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.q6.j(q0Var5, h05, null, M4, e6Var);
        q0Var5.e(1, 2131232045, org.telegram.messenger.hd.M0(2131744877, null)).setOnClickListener(new View.OnClickListener(this) {
            public final ki f41674b;

            {
                this.f41674b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.an anVar;
                switch (r3) {
                    case 0:
                        final ki kiVar = this.f41674b;
                        nh nhVar = kiVar.C2;
                        if (nhVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var = new d0(kiVar.getContext(), e6Var);
                            d0Var.s1(nhVar.getText());
                            d0Var.f33753f2 = new org.telegram.messenger.z10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            nh nhVar2 = kiVar.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ph phVar = kiVar.N2;
                                            phVar.setText(charSequence);
                                            phVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = kiVar.U1;
                            if (kiVar.F3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            bh bhVar = new bh(kiVar, 0);
                            d0Var.f33755h2 = j3;
                            d0Var.f33756i2 = z13;
                            d0Var.f33757j2 = bhVar;
                            d0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ki kiVar2 = this.f41674b;
                        ph phVar = kiVar2.N2;
                        if (phVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var2 = new d0(kiVar2.getContext(), e6Var);
                            d0Var2.s1(phVar.getText());
                            d0Var2.f33753f2 = new org.telegram.messenger.z10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            nh nhVar2 = kiVar2.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ph phVar2 = kiVar2.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = kiVar2.U1;
                            if (kiVar2.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            bh bhVar2 = new bh(kiVar2, 1);
                            d0Var2.f33755h2 = j10;
                            d0Var2.f33756i2 = z14;
                            d0Var2.f33757j2 = bhVar2;
                            d0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ki kiVar3 = this.f41674b;
                        kiVar3.f36448i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar3.f36424a2;
                        p12.I2(null, e2Var2, e6Var);
                        PhotoViewer.p1().J2(kiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i14 = kiVar3.Q3;
                        boolean z15 = kiVar3.R3;
                        p13.h = i14;
                        p13.f42830n = z15;
                        if (!kiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(e2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(kiVar3.f29685c.findFocus());
                        }
                        File w10 = hi.d7.w(kiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f23611q;
                        int i15 = point.x;
                        int i16 = point.y;
                        if (i15 > 1080 || i16 > 1080) {
                            float min = Math.min(i15, i16) / 1080.0f;
                            i15 = (int) (i15 * min);
                            i16 = (int) (i16 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        bi biVar = new bi(kiVar3, ffVar);
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            anVar = (org.telegram.ui.an) e2Var2;
                        } else {
                            anVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, biVar, anVar);
                        if (kiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, kiVar3.E1);
                            return;
                        }
                        return;
                }
            }
        });
        q0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        q0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        q0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i14;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i14 = 2131748832;
                            } else {
                                i14 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i14, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        kh khVar = new kh(this, context, 0);
        this.f36442g3 = khVar;
        khVar.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i14;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i14 = 2131748832;
                            } else {
                                i14 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i14, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        khVar.setAlpha(0.0f);
        khVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f36445h3 = textView;
        org.telegram.messenger.k5.m(textView, i7, e6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ja.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f36453k3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.x(imageView, mutate, i7, e6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ja.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        khVar.addView(linearLayout, c8.ja.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f36456l3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.q6.x(imageView2, mutate2, i7, e6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ja.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f36460m3 = textView2;
        org.telegram.messenger.k5.m(textView2, i7, e6Var, 1, 16.0f);
        org.telegram.messenger.k5.l(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ja.r(-2, -2, 16));
        khVar.addView(linearLayout2, c8.ja.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, e6Var);
        this.f36435e2 = chatAttachAlertPhotoLayout;
        ciVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f36497w2 = chatAttachAlertPhotoLayout;
        this.U2 = 1L;
        this.f29682b.addView(chatAttachAlertPhotoLayout, c8.ja.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.f36486t3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m);
        this.f29682b.addView(fVar3, c8.ja.g());
        this.f29682b.addView(khVar, c8.ja.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.k0 k0Var = new ai.k0(context, 14);
        this.M2 = k0Var;
        this.f29682b.addView(k0Var, c8.ja.e(-1, -2, 55));
        this.f29682b.addView(o7Var, c8.ja.c(-2.0f, -1));
        this.f29682b.addView(q0Var2, c8.ja.e(48, 48, 53));
        this.f29682b.addView(q0Var, c8.ja.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f36431c3;
        if (q0Var6 != null) {
            jVar2 = jVar3;
            this.f29682b.addView(q0Var6, c8.ja.e(48, 48, 53));
        } else {
            jVar2 = jVar3;
        }
        khVar.addView(q0Var5, c8.ja.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f29682b.addView(jVar, c8.ja.e(-2, 48, 53));
        kh khVar2 = new kh(this, context, 1);
        this.f36494v3 = khVar2;
        lh lhVar = new lh(context, 0);
        this.f36498w3 = lhVar;
        lhVar.setClipChildren(true);
        lhVar.setClipToPadding(false);
        hi hiVar = new hi(this, context);
        this.f36506y3 = hiVar;
        lhVar.setAdapter(hiVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.f36502x3 = b0Var;
        lhVar.setLayoutManager(b0Var);
        lhVar.setVerticalScrollBarEnabled(false);
        lhVar.setHorizontalScrollBarEnabled(false);
        lhVar.setItemAnimator(null);
        lhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.q6.l(lhVar, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        lhVar.f40091z2 = true;
        lhVar.setOverScrollMode(2);
        dh.c cVar5 = this.F4;
        ri.q qVar = this.Y0;
        cVar5.f8099j = qVar;
        this.G4.f8099j = qVar;
        cVar4.f8099j = qVar;
        mh mhVar = new mh(this, context, 0);
        this.f36490u3 = mhVar;
        dh.d dVar = new dh.d(cVar4.c(mhVar, null, false));
        this.W1 = dVar;
        if (org.telegram.messenger.gz.f()) {
            org.telegram.messenger.qc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.f29682b.addView(mhVar, c8.ja.g());
        fh.g c10 = this.F4.c(khVar2, c8.g0.f(e6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        khVar2.setBackground(c10);
        lhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        lhVar.setClipToOutline(true);
        bg.p0 p0Var = bg.t0.f3335a;
        lhVar.setOutlineProvider(new bg.r0(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(28.0f)));
        lhVar.setImportantForAccessibility(1);
        khVar2.addView(lhVar, c8.ja.g());
        this.f29682b.addView(khVar2, c8.ja.e(-1, 70, 81));
        lhVar.setOnItemClickListener(new fi.i4(9, this, e6Var));
        lhVar.setOnItemLongClickListener(new sg(this, 3));
        h6 h6Var = new h6(context, true, false, true);
        this.C3 = h6Var;
        h6Var.setVisibility(8);
        h6Var.setAlpha(0.0f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        h6Var.setPadding(L3, 0, L3, 0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        h6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i14;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout2.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i14 = 2131748832;
                            } else {
                                i14 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i14, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        this.f29682b.addView(h6Var, c8.ja.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f29682b.addView(radialProgressView, c8.ja.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.D2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i14 = org.telegram.ui.ActionBar.j6.f29260z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView3, i14, e6Var, mode2);
        imageView3.setImageResource(2131231838);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i142;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout2.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i142 = 2131748832;
                            } else {
                                i142 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i142, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        kh khVar3 = new kh(this, context, 2);
        this.B2 = khVar3;
        kg.j jVar5 = new kg.j(this, context);
        this.A2 = jVar5;
        khVar3.addView(jVar5, c8.ja.e(-1, -1, 119));
        fh.g c11 = this.G4.c(xhVar, c8.g0.n(e6Var), false);
        this.f36505y2 = c11;
        c11.T = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.R.f11324g = 0.4f;
        c11.n();
        fh.g c12 = this.F4.c(jVar5, c8.g0.n(e6Var), false);
        this.f36509z2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        khVar3.setWillNotDraw(false);
        khVar3.setVisibility(4);
        khVar3.setAlpha(0.0f);
        this.f29682b.addView(khVar3, c8.ja.e(-1, -2, 83));
        khVar3.setOnTouchListener(new gi.a(14));
        h6 h6Var2 = new h6(context, false, false, false);
        this.f36488u1 = h6Var2;
        h6Var2.setAllowCancel(true);
        h6Var2.setScaleProperty(0.6f);
        h6Var2.setVisibility(8);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i15 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i15, e6Var);
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        jVar5.addView(h6Var2, c8.ja.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f36496w1 = imageView4;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(context);
        this.f36500x1 = t2Var;
        imageView4.setImageDrawable(t2Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.j6.Nl;
        org.telegram.ui.ActionBar.q6.s(imageView4, i16, e6Var, mode);
        int i17 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i17, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i17);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.q6.j(imageView4, h06, null, M5, e6Var);
        jVar5.addView(imageView4, c8.ja.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.na.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41674b;

            {
                this.f41674b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.an anVar;
                switch (r3) {
                    case 0:
                        final ki kiVar = this.f41674b;
                        nh nhVar = kiVar.C2;
                        if (nhVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var = new d0(kiVar.getContext(), e6Var);
                            d0Var.s1(nhVar.getText());
                            d0Var.f33753f2 = new org.telegram.messenger.z10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            nh nhVar2 = kiVar.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ph phVar2 = kiVar.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = kiVar.U1;
                            if (kiVar.F3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            bh bhVar = new bh(kiVar, 0);
                            d0Var.f33755h2 = j3;
                            d0Var.f33756i2 = z13;
                            d0Var.f33757j2 = bhVar;
                            d0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ki kiVar2 = this.f41674b;
                        ph phVar = kiVar2.N2;
                        if (phVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var2 = new d0(kiVar2.getContext(), e6Var);
                            d0Var2.s1(phVar.getText());
                            d0Var2.f33753f2 = new org.telegram.messenger.z10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            nh nhVar2 = kiVar2.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ph phVar2 = kiVar2.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = kiVar2.U1;
                            if (kiVar2.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            bh bhVar2 = new bh(kiVar2, 1);
                            d0Var2.f33755h2 = j10;
                            d0Var2.f33756i2 = z14;
                            d0Var2.f33757j2 = bhVar2;
                            d0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ki kiVar3 = this.f41674b;
                        kiVar3.f36448i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar3.f36424a2;
                        p12.I2(null, e2Var2, e6Var);
                        PhotoViewer.p1().J2(kiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i142 = kiVar3.Q3;
                        boolean z15 = kiVar3.R3;
                        p13.h = i142;
                        p13.f42830n = z15;
                        if (!kiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(e2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(kiVar3.f29685c.findFocus());
                        }
                        File w10 = hi.d7.w(kiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f23611q;
                        int i152 = point.x;
                        int i162 = point.y;
                        if (i152 > 1080 || i162 > 1080) {
                            float min = Math.min(i152, i162) / 1080.0f;
                            i152 = (int) (i152 * min);
                            i162 = (int) (i162 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i152, i162, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        bi biVar = new bi(kiVar3, ffVar);
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            anVar = (org.telegram.ui.an) e2Var2;
                        } else {
                            anVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, biVar, anVar);
                        if (kiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, kiVar3.E1);
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
        this.F1 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).H0();
        nh nhVar = new nh(this, context, xhVar, e6Var);
        this.C2 = nhVar;
        nhVar.K = true;
        nhVar.setHint(org.telegram.messenger.hd.M0(2131754454, "AddCaption"));
        nhVar.s();
        nhVar.getEditText().setLayoutParams(c8.ja.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        nhVar.getEditText().addTextChangedListener(new oh(this, 0));
        jVar5.addView(nhVar, c8.ja.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        khVar3.setClipChildren(false);
        nhVar.setClipChildren(false);
        k0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        k0Var.setWillNotDraw(false);
        ph phVar = new ph(this, context, xhVar, e6Var);
        this.N2 = phVar;
        phVar.K = true;
        phVar.getEditText().addTextChangedListener(new rh(this, e2Var));
        phVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        phVar.getEditText().setLayoutParams(c8.ja.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        phVar.getEditText().setTextSize(1, 17.0f);
        phVar.getEmojiButton().setLayoutParams(c8.ja.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        phVar.setHint(org.telegram.messenger.hd.M0(2131754454, "AddCaption"));
        k0Var.addView(phVar, c8.ja.e(-1, -2, 119));
        k0Var.setAlpha(0.0f);
        k0Var.setVisibility(8);
        nhVar.addView(imageView3, c8.ja.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.F4.c(k0Var, c8.g0.n(e6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        k0Var.setBackground(c13);
        k0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        h6 h6Var3 = new h6(context, false, false, false);
        this.f36492v1 = h6Var3;
        h6Var3.setScaleProperty(0.6f);
        h6Var3.setVisibility(8);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var3, i15, e6Var);
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        h6Var3.setGravity(17);
        h6Var3.setAllowCancel(true);
        k0Var.addView(h6Var3, c8.ja.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231839);
        org.telegram.ui.ActionBar.q6.s(imageView5, org.telegram.ui.ActionBar.j6.Oe, e6Var, mode2);
        phVar.addView(imageView5, c8.ja.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i142;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i142 = 2131748832;
                            } else {
                                i142 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i142, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f36504y1 = imageView6;
        org.telegram.ui.ActionBar.t2 t2Var2 = new org.telegram.ui.ActionBar.t2(context);
        this.f36508z1 = t2Var2;
        imageView6.setImageDrawable(t2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView6, i16, e6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i17, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M6 = org.telegram.ui.ActionBar.q6.M(i17);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.q6.j(imageView6, h07, null, M6, e6Var);
        k0Var.addView(imageView6, c8.ja.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.na.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41674b;

            {
                this.f41674b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.an anVar;
                switch (r3) {
                    case 0:
                        final ki kiVar = this.f41674b;
                        nh nhVar2 = kiVar.C2;
                        if (nhVar2 != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var = new d0(kiVar.getContext(), e6Var);
                            d0Var.s1(nhVar2.getText());
                            d0Var.f33753f2 = new org.telegram.messenger.z10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            nh nhVar22 = kiVar.C2;
                                            nhVar22.setText(charSequence);
                                            nhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ph phVar2 = kiVar.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = kiVar.U1;
                            if (kiVar.F3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            bh bhVar = new bh(kiVar, 0);
                            d0Var.f33755h2 = j3;
                            d0Var.f33756i2 = z13;
                            d0Var.f33757j2 = bhVar;
                            d0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ki kiVar2 = this.f41674b;
                        ph phVar2 = kiVar2.N2;
                        if (phVar2 != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var2 = new d0(kiVar2.getContext(), e6Var);
                            d0Var2.s1(phVar2.getText());
                            d0Var2.f33753f2 = new org.telegram.messenger.z10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            nh nhVar22 = kiVar2.C2;
                                            nhVar22.setText(charSequence);
                                            nhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ph phVar22 = kiVar2.N2;
                                            phVar22.setText(charSequence);
                                            phVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = kiVar2.U1;
                            if (kiVar2.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            bh bhVar2 = new bh(kiVar2, 1);
                            d0Var2.f33755h2 = j10;
                            d0Var2.f33756i2 = z14;
                            d0Var2.f33757j2 = bhVar2;
                            d0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ki kiVar3 = this.f41674b;
                        kiVar3.f36448i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar3.f36424a2;
                        p12.I2(null, e2Var2, e6Var);
                        PhotoViewer.p1().J2(kiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i142 = kiVar3.Q3;
                        boolean z15 = kiVar3.R3;
                        p13.h = i142;
                        p13.f42830n = z15;
                        if (!kiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(e2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(kiVar3.f29685c.findFocus());
                        }
                        File w10 = hi.d7.w(kiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f23611q;
                        int i152 = point.x;
                        int i162 = point.y;
                        if (i152 > 1080 || i162 > 1080) {
                            float min = Math.min(i152, i162) / 1080.0f;
                            i152 = (int) (i152 * min);
                            i162 = (int) (i162 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i152, i162, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        bi biVar = new bi(kiVar3, ffVar);
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            anVar = (org.telegram.ui.an) e2Var2;
                        } else {
                            anVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, biVar, anVar);
                        if (kiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, kiVar3.E1);
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
        kh khVar4 = new kh(this, context, 3);
        this.F2 = khVar4;
        khVar4.setFocusable(true);
        khVar4.setFocusableInTouchMode(true);
        khVar4.setVisibility(4);
        khVar4.setScaleX(0.2f);
        khVar4.setScaleY(0.2f);
        khVar4.setAlpha(0.0f);
        khVar4.setClipChildren(false);
        khVar4.setClipToPadding(false);
        this.f29682b.addView(khVar4, c8.ja.e(110, 50, 85));
        sh shVar = new sh(context, e6Var, this);
        this.G2 = shVar;
        shVar.setImportantForAccessibility(2);
        khVar4.addView(shVar, c8.ja.e(-1, -1, 119));
        shVar.setTranslationX(this.f29717u0);
        int L4 = org.telegram.messenger.g0.L(52.0f);
        int L5 = org.telegram.messenger.g0.L(38.0f);
        shVar.L = L4;
        shVar.M = L5;
        shVar.P = org.telegram.messenger.g0.L(7.0f);
        shVar.Q = org.telegram.messenger.g0.L(6.0f);
        shVar.f35984q0 = true;
        shVar.setOnClickListener(new View.OnClickListener(this) {
            public final ki f41343b;

            {
                this.f41343b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.y3 y3Var;
                int i142;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f41343b;
                        if (kiVar.f36497w2 != kiVar.f36455l2) {
                            z13 = true;
                        }
                        kiVar.O1(z13);
                        return;
                    case 1:
                        ki kiVar2 = this.f41343b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.f36493v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f41343b;
                        boolean z14 = kiVar3.X1;
                        if (!z14) {
                            kiVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ki kiVar4 = this.f41343b;
                        boolean z15 = kiVar4.X1;
                        if (z15) {
                            kiVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f41343b.n1();
                        return;
                    case 5:
                        this.f41343b.Y2.V(null, null);
                        return;
                    case 6:
                        ki kiVar5 = this.f41343b;
                        if (kiVar5.f36435e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.f36435e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.f23956i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.f36425a3;
                            hi.l3 l3Var = kiVar5.f36428b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.f36428b3 = l3Var2;
                            if (!V) {
                                i142 = 2131748832;
                            } else {
                                i142 = 2131748833;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i142, null)));
                            kiVar5.f36428b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.f36428b3.p(1.0f, -((kiVar5.f29682b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.f36428b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.f36428b3;
                            l3Var3.f14570r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.f29682b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.f36428b3.w();
                            return;
                        }
                        return;
                    case 7:
                        ci ciVar = this.f41343b.f36497w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f41343b.f36448i3.V(null, null);
                        return;
                }
            }
        });
        shVar.setOnLongClickListener(new org.telegram.ui.mf(this, context, e6Var, e2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        mh mhVar2 = new mh(this, context, 1);
        mhVar2.setAlpha(0.0f);
        mhVar2.setScaleX(0.2f);
        mhVar2.setScaleY(0.2f);
        if (z10) {
            P0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.F4, c8.g0.n(e6Var));
        fc0 fc0Var = new fc0(context);
        this.N1 = fc0Var;
        this.f29682b.addView(fc0Var, c8.ja.c(-1.0f, -1));
        gh.e eVar = new gh.e(e6Var);
        eVar.f13313e = new sg(this, 5);
        eVar.f13312c = new sg(this, 6);
        eVar.d = new sg(this, 7);
        eVar.f13311b = new sg(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13315n = N;
        eVar.f13316r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13314f = N3;
        eVar.h = N4;
        o7Var.P(this.F4, eVar, false);
        jVar2.f(1L, false);
        this.Y0.i(this.f29682b);
        ri.q qVar2 = this.Y0;
        qVar2.f56120a = new sg(this, 9);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
