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
public class ui extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.q2, te.b {
    public static final int I4 = 0;
    public boolean A1;
    public final kg.j A2;
    public final RadialProgressView A3;
    public boolean A4;
    public boolean B1;
    public final uh B2;
    public boolean B3;
    public boolean B4;
    public boolean C1;
    public final xh C2;
    public final o6 C3;
    public hi.j C4;
    public int D1;
    public final ImageView D2;
    public float D3;
    public final dh.g D4;
    public org.telegram.messenger.r10 E1;
    public final int[] E2;
    public int E3;
    public final ui.c E4;
    public int F1;
    public final uh F2;
    public org.telegram.messenger.gj F3;
    public final dh.c F4;
    public int G1;
    public final ci G2;
    public boolean G3;
    public final dh.c G4;
    public boolean H1;
    public final TextPaint H2;
    public final int H3;
    public final kh H4;
    public boolean I1;
    public final RectF I2;
    public boolean I3;
    public boolean J1;
    public final Paint J2;
    public boolean J3;
    public boolean K1;
    public AnimatorSet K2;
    public boolean K3;
    public v30 L1;
    public long L2;
    public boolean L3;
    public boolean M1;
    public final ai.l0 M2;
    public boolean M3;
    public final qc0 N1;
    public final zh N2;
    public boolean N3;
    public un O1;
    public int O2;
    public boolean O3;
    public x30 P1;
    public ft P2;
    public boolean P3;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public ck S1;
    public boolean S2;
    public boolean S3;
    public bj T1;
    public final float T2;
    public float T3;
    public long U1;
    public long U2;
    public float U3;
    public boolean V1;
    public final v7 V2;
    public ValueAnimator V3;
    public final dh.d W1;
    public AnimatorSet W2;
    public int W3;
    public boolean X1;
    public AnimatorSet X2;
    public si X3;
    public float Y1;
    public final org.telegram.ui.ActionBar.q0 Y2;
    public fn Y3;
    public final fi Z1;
    public final hi.w Z2;
    public final int[] Z3;
    public final org.telegram.ui.ActionBar.g2 f40368a2;
    public final org.telegram.ui.ActionBar.q0 f40369a3;
    public int f40370a4;
    public final boolean f40371b2;
    public hi.l3 f40372b3;
    public float f40373b4;
    public df f40374c2;
    public final org.telegram.ui.ActionBar.q0 f40375c3;
    public float f40376c4;
    public boolean d2;
    public final gi.j f40377d3;
    public boolean f40378d4;
    public final ChatAttachAlertPhotoLayout f40379e2;
    public float f40380e3;
    public float f40381e4;
    public vj f40382f2;
    public float f40383f3;
    public final boolean f40384f4;
    public ej f40385g2;
    public final uh f40386g3;
    public boolean f40387g4;
    public tn f40388h2;
    public final TextView f40389h3;
    public final ArrayList f40390h4;
    public tn f40391i2;
    public final org.telegram.ui.ActionBar.q0 f40392i3;
    public final Rect f40393i4;
    public ml f40394j2;
    public final LinearLayout j3;
    public float f40395j4;
    public mk f40396k2;
    public final ImageView f40397k3;
    public boolean f40398k4;
    public rm f40399l2;
    public final LinearLayout f40400l3;
    public int f40401l4;
    public final te.a f40402m1;
    public hj f40403m2;
    public final TextView f40404m3;
    public final fi f40405m4;
    public final te.a n1;
    public kg.h0 f40406n2;
    public float f40407n3;
    public r1.g f40408n4;
    public final te.a f40409o1;
    public nk f40410o2;
    public boolean f40411o3;
    public AnimatorSet o4;
    public final te.a f40412p1;
    public nk f40413p2;
    public final hi f40414p3;
    public int f40415p4;
    public final te.a f40416q1;
    public oi.o f40417q2;
    public boolean f40418q3;
    public int f40419q4;
    public final te.a f40420r1;
    public zk f40421r2;
    public Object f40422r3;
    public boolean f40423r4;
    public final te.j f40424s1;
    public boolean f40425s2;
    public boolean f40426s3;
    public boolean f40427s4;
    public org.telegram.ui.zm f40428t1;
    public float f40429t2;
    public final lh.f f40430t3;
    public boolean f40431t4;
    public final o6 f40432u1;
    public final mi[] f40433u2;
    public final wh f40434u3;
    public ll f40435u4;
    public final o6 f40436v1;
    public final LongSparseArray f40437v2;
    public final uh f40438v3;
    public boolean f40439v4;
    public final ImageView f40440w1;
    public mi f40441w2;
    public final vh f40442w3;
    public boolean f40443w4;
    public final org.telegram.ui.ActionBar.v2 f40444x1;
    public mi f40445x2;
    public final v4.c0 f40446x3;
    public File f40447x4;
    public final ImageView f40448y1;
    public final fh.g f40449y2;
    public final ri f40450y3;
    public double[] f40451y4;
    public final org.telegram.ui.ActionBar.v2 f40452z1;
    public final fh.g f40453z2;
    public boolean f40454z3;
    public boolean f40455z4;

    public ui(Activity activity, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11) {
        this(activity, g2Var, z10, z11, true, null);
    }

    public static void J0(ui uiVar) {
        boolean z10;
        boolean q10;
        int i7;
        v7 v7Var = uiVar.V2;
        lh.f fVar = uiVar.f40430t3;
        if (fVar != null && v7Var != null) {
            mi miVar = uiVar.f40445x2;
            if (miVar == null) {
                miVar = uiVar.f40441w2;
            }
            int i10 = 0;
            if (miVar != null && miVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.h6 h6Var = uiVar.J0;
            if (h6Var != null) {
                q10 = h6Var.d();
            } else {
                q10 = org.telegram.ui.ActionBar.m6.I.q();
            }
            if (!z10 && v7Var.getVisibility() == 0) {
                if (q10) {
                    i7 = 255;
                } else {
                    i7 = 160;
                }
                i10 = (int) (v7Var.getAlpha() * i7);
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void L0(ui uiVar) {
        hi.j jVar = new hi.j(uiVar, uiVar.getContext(), uiVar.U1, LaunchActivity.Q(), uiVar.J0, 1);
        uiVar.C4 = jVar;
        jVar.p(new qf(uiVar, 1));
        ViewGroup viewGroup = uiVar.f30176b;
        viewGroup.addView(uiVar.C4, viewGroup.indexOfChild(uiVar.B2), c8.ma.e(-1, -1, 83));
        hi.j jVar2 = uiVar.C4;
        jVar2.getAdapter().f17530c = false;
        jVar2.getAdapter().d = false;
        jVar2.getAdapter().f17533e = false;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40368a2;
        boolean z10 = true;
        if (g2Var instanceof org.telegram.ui.bn) {
            jVar2.getAdapter().f17544n0 = false;
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            jg.h1 adapter = jVar2.getAdapter();
            bnVar.j();
            TLRPC.Chat chat = bnVar.f46005e;
            adapter.getClass();
            adapter.m0 = chat;
            jVar2.getAdapter().W(bnVar.f46181r8);
            jg.h1 adapter2 = jVar2.getAdapter();
            if (bnVar.f46005e == null) {
                z10 = false;
            }
            adapter2.f17536f0 = z10;
        } else {
            jVar2.getAdapter().f17544n0 = true;
            jVar2.getAdapter().W(null);
            jVar2.getAdapter().f17536f0 = false;
        }
        jVar2.getAdapter().f17537g0 = false;
        uiVar.K1();
    }

    public static int M0(ui uiVar) {
        mi miVar = uiVar.f40441w2;
        tn tnVar = uiVar.f40388h2;
        if (miVar == tnVar && tnVar.F != null) {
            return tnVar.getEmojiPadding();
        }
        tn tnVar2 = uiVar.f40391i2;
        if (miVar == tnVar2 && tnVar2.F != null) {
            return tnVar2.getEmojiPadding();
        }
        if (uiVar.X1) {
            return uiVar.N2.getEmojiPadding();
        }
        return uiVar.C2.getEmojiPadding();
    }

    public static boolean h1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.p10.C(user) && !org.telegram.messenger.p10.u(user) && !org.telegram.messenger.p10.y(user) && !org.telegram.messenger.p10.B(user.f28583id) && !org.telegram.messenger.p10.A(user) && !org.telegram.messenger.p10.t(user) && user.f28583id != 489000 && !org.telegram.messenger.np.L2(user)) {
            return true;
        }
        return false;
    }

    public static void t1(mi miVar) {
        if (miVar != null) {
            int i7 = org.telegram.ui.ActionBar.t6.f30069b;
            Object tag = miVar.getTag(2131296712);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
                return;
            }
            miVar.setTag(2131296712, Integer.valueOf(i7));
            try {
                org.telegram.ui.ActionBar.t6.c0(miVar, true);
                miVar.d();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void A1(float f10) {
        boolean z10 = false;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o4;
        org.telegram.messenger.g0.s3(this, o4, false, null);
        if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.m3(this, z10);
        this.f30179c.invalidate();
    }

    public final void B1(String str) {
        boolean z10 = true;
        this.O2 = 1;
        this.A1 = true;
        this.Q2 = false;
        this.K3 = false;
        this.f40438v3.setVisibility(8);
        this.f40389h3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
        if (chatAttachAlertPhotoLayout != null) {
            ui uiVar = chatAttachAlertPhotoLayout.f37520b;
            if (uiVar.O2 == 0 || uiVar.A1) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f32818h1 = z10;
        }
    }

    public final void C1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui.C1(boolean):void");
    }

    public final void D1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui.D1(long, java.lang.String, boolean, boolean):void");
    }

    public final void E1(org.telegram.ui.ActionBar.g2 g2Var) {
        if ((g2Var instanceof org.telegram.ui.bn) && org.telegram.messenger.v3.V(((org.telegram.ui.bn) g2Var).f46005e)) {
            new lc(this.f40414p3, this.J0).f(org.telegram.messenger.np.u1(this.H3).X4, new mf(4, this, g2Var)).j();
        }
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
        mi miVar;
        float f19;
        float L;
        long P1;
        float f20;
        float f21;
        v7 v7Var;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float L2;
        this.n1.a(z10, true);
        uh uhVar = this.B2;
        if (uhVar.getTag() != null) {
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
        uhVar.setTag(num);
        xh xhVar = this.C2;
        if (xhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(xhVar.getEditText());
        }
        xhVar.k(true);
        this.N2.k(true);
        uh uhVar2 = this.f40438v3;
        uh uhVar3 = this.F2;
        if (z10) {
            if (!this.I1) {
                uhVar.setVisibility(0);
            }
            uhVar3.setVisibility(0);
        } else if (this.Q2) {
            uhVar2.setVisibility(0);
        }
        mi miVar2 = this.f40441w2;
        if ((miVar2 == this.f40379e2 || miVar2 == this.f40399l2) && this.X1) {
            z13 = true;
        } else {
            z13 = false;
        }
        v7 v7Var2 = this.V2;
        ai.l0 l0Var = this.M2;
        kg.j jVar = this.A2;
        ci ciVar = this.G2;
        float f29 = 1.0f;
        if (z11) {
            this.K2 = new AnimatorSet();
            if (z13) {
                l0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(uhVar, property, f20));
            if (z10 && !z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f21));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                v7Var = v7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                v7Var = v7Var2;
            }
            if (z10 && z13) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(l0Var, property, f22));
            Property property2 = View.SCALE_X;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, property2, f23));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, property3, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, property, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar, property2, f26));
            if (z10) {
                f27 = 1.0f;
            } else {
                f27 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar, property3, f27));
            if (v7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(uhVar, property4, L2));
            } else if (this.Q2) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f28 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(uhVar2, property5, f28));
                if (z10) {
                    f29 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(uhVar2, property, f29));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eh(this, 5));
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
            uhVar.setAlpha(f10);
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
            uhVar3.setScaleX(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            uhVar3.setScaleY(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = f12;
            }
            uhVar3.setAlpha(f15);
            if (z10 && z13) {
                i10 = i7;
            } else {
                i10 = 8;
            }
            l0Var.setVisibility(i10);
            if (z10 && z13) {
                f16 = 1.0f;
            } else {
                f16 = f12;
            }
            l0Var.setAlpha(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            ciVar.setScaleX(f17);
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            ciVar.setScaleY(f18);
            if (v7Var2.getTag() != null) {
                if (z10) {
                    L = f12;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                uhVar.setTranslationY(L);
            } else if (this.Q2 && ((miVar = this.f40441w2) == null || miVar.N())) {
                if (z10) {
                    f19 = org.telegram.messenger.g0.L(84.0f);
                } else {
                    f19 = f12;
                }
                uhVar2.setTranslationY(f19);
            }
            if (!z10) {
                uhVar.setVisibility(4);
                uhVar3.setVisibility(4);
            }
            if (z13) {
                R1();
            }
        }
        if (z10) {
            i7 = Math.max(1, this.f40441w2.getSelectedItemsCount());
        }
        ciVar.e(i7, z11);
        if (this.F3 != null) {
            P1 = 0;
        } else {
            P1 = org.telegram.messenger.np.u1(this.H3).P1(c1());
        }
        ciVar.i(Y0() + this.f40441w2.getSelectedItemsCount(), P1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), ciVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            xhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(mi miVar) {
        long j3 = this.U2;
        un unVar = this.O1;
        if (miVar == unVar) {
            j3 = unVar.f40526s;
        } else if (miVar == this.f40379e2) {
            j3 = 1;
        } else if (miVar == this.f40385g2) {
            j3 = 3;
        } else if (miVar == this.f40396k2) {
            j3 = 4;
        } else if (miVar == this.f40382f2) {
            j3 = 5;
        } else if (miVar == this.f40394j2) {
            j3 = 6;
        } else if (miVar == this.f40388h2) {
            j3 = 9;
        } else if (miVar == this.f40403m2) {
            j3 = 10;
        } else if (miVar == this.f40406n2) {
            j3 = 11;
        } else if (miVar == this.f40391i2) {
            j3 = 12;
        } else if (miVar == this.f40410o2) {
            j3 = 14;
        } else if (miVar == this.f40413p2) {
            j3 = 13;
        } else if (miVar == this.f40417q2) {
            j3 = 16;
        } else if (miVar == this.f40421r2) {
            j3 = 17;
        }
        H1(miVar, j3, true);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        mi miVar;
        int i10;
        if (i7 == 0) {
            V0();
            S0();
            return;
        }
        int i11 = 1;
        if (i7 == 2) {
            S0();
            tn tnVar = this.f40388h2;
            if (tnVar != null && ((miVar = this.f40445x2) == tnVar || this.f40441w2 == tnVar)) {
                if (miVar == tnVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                Q1(i10);
            }
            tn tnVar2 = this.f40391i2;
            if (tnVar2 != null) {
                mi miVar2 = this.f40445x2;
                if (miVar2 == tnVar2 || this.f40441w2 == tnVar2) {
                    if (miVar2 != tnVar2) {
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
            ci ciVar = this.G2;
            if (ciVar != null) {
                ciVar.setEphemeralFactor(f10);
                ciVar.setSameWidthFactor(f10);
            }
        }
    }

    @Override
    public final boolean H0() {
        mi miVar = this.f40441w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
        if (miVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f32822j1) {
            return true;
        }
        return false;
    }

    public final void H1(mi miVar, long j3, boolean z10) {
        boolean z11;
        int i7;
        gm gmVar;
        boolean z12;
        Integer num;
        gm gmVar2;
        int i10;
        int L;
        Float f10;
        int i11;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f40422r3 == null && this.K2 == null) {
            mi miVar2 = this.f40441w2;
            if (miVar2 == miVar) {
                miVar2.K();
            } else if (miVar == this.f40391i2 && !org.telegram.messenger.k10.i(this.H3).q()) {
                new ug.y0(this.f40368a2, 39, false).show();
            } else {
                int i12 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f40416q1.a(z11, z10);
                this.f40424s1.f(Long.valueOf(j3), z10);
                this.B3 = false;
                this.f40454z3 = false;
                this.D3 = 0.0f;
                this.C3.setVisibility(8);
                RadialProgressView radialProgressView = this.A3;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                uh uhVar = this.f40438v3;
                uhVar.setAlpha(1.0f);
                uhVar.setTranslationY(this.D3);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f40437v2;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((ki.s3) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.U2 = j3;
                vh vhVar = this.f40442w3;
                int childCount = vhVar.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = vhVar.getChildAt(i14);
                    if (childAt instanceof oi) {
                        oi oiVar = (oi) childAt;
                        i11 = childCount;
                        f10 = valueOf;
                        if (oiVar.f38240b == oiVar.f38241c.U2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        oiVar.f38602a.f(z13, true);
                    } else {
                        f10 = valueOf;
                        i11 = childCount;
                        if (childAt instanceof ni) {
                            ((ni) childAt).a(true);
                        }
                    }
                    i14++;
                    childCount = i11;
                    valueOf = f10;
                }
                Float f11 = valueOf;
                int firstOffset = (this.f40441w2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Z3[0];
                this.f40445x2 = miVar;
                T0(miVar);
                if (this.f40445x2.j() != 0) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                v7 v7Var = this.V2;
                v7Var.setVisibility(i7);
                if (v7Var.f29150o0) {
                    v7Var.n(true);
                }
                this.f40441w2.u();
                mi miVar3 = this.f40445x2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
                if (miVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f40445x2.I(this.f40441w2);
                this.f40445x2.setVisibility(0);
                if (miVar.getParent() != null) {
                    this.f30176b.removeView(this.f40445x2);
                }
                int indexOfChild = this.f30176b.indexOfChild(this.f40441w2);
                if (this.f40445x2.getParent() != this.f30176b) {
                    t1(this.f40445x2);
                    ViewGroup viewGroup = this.f30176b;
                    mi miVar4 = this.f40445x2;
                    if (miVar4 != this.f40394j2) {
                        indexOfChild++;
                    }
                    viewGroup.addView(miVar4, indexOfChild, c8.ma.c(-1.0f, -1));
                }
                gh ghVar = new gh(this, 5);
                mi miVar5 = this.f40441w2;
                boolean z14 = miVar5 instanceof rm;
                fi fiVar = this.Z1;
                if (!z14 && !(this.f40445x2 instanceof rm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f40445x2.setAlpha(0.0f);
                        this.f40445x2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40441w2, View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f40441w2, fiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(v7Var, View.ALPHA, v7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(nr.f37961f);
                        animatorSet.addListener(new di.a4(this, firstOffset, ghVar, 1));
                        this.f40422r3 = animatorSet;
                        mi miVar6 = this.f40441w2;
                        fiVar.getClass();
                        fiVar.a(miVar6, f11);
                        animatorSet.start();
                    } else {
                        miVar5.setAlpha(0.0f);
                        ghVar.run();
                        Q1(0);
                        this.f30176b.invalidate();
                    }
                } else {
                    int max = Math.max(this.f40445x2.getWidth(), this.f40441w2.getWidth());
                    mi miVar7 = this.f40445x2;
                    if (miVar7 instanceof rm) {
                        miVar7.setTranslationX(max);
                        mi miVar8 = this.f40441w2;
                        if ((miVar8 instanceof ChatAttachAlertPhotoLayout) && (gmVar2 = ((ChatAttachAlertPhotoLayout) miVar8).Q) != null) {
                            gmVar2.setVisibility(4);
                        }
                    } else {
                        this.f40441w2.setTranslationX(-max);
                        mi miVar9 = this.f40445x2;
                        if (miVar9 == chatAttachAlertPhotoLayout && (gmVar = ((ChatAttachAlertPhotoLayout) miVar9).Q) != null) {
                            gmVar.setVisibility(0);
                        }
                    }
                    this.f40445x2.setAlpha(1.0f);
                    this.f40441w2.setAlpha(1.0f);
                    if (z10) {
                        mi miVar10 = this.f40441w2;
                        fiVar.getClass();
                        fiVar.a(miVar10, f11);
                        org.telegram.messenger.g0.g3(new g(this, miVar, ghVar, 6));
                    } else {
                        if (this.f40445x2.getCurrentItemTop() <= miVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f40441w2.v(1.0f);
                        this.f40445x2.v(1.0f);
                        this.f40441w2.m(this.f40395j4);
                        this.f40445x2.m(this.f40395j4);
                        this.f30176b.invalidate();
                        this.Y0.g();
                        mi miVar11 = this.f40441w2;
                        Float valueOf2 = Float.valueOf(1.0f);
                        fiVar.getClass();
                        fiVar.a(miVar11, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        v7Var.setTag(num);
                        ghVar.run();
                    }
                }
                if (this.f40398k4 && !(miVar instanceof ki.s3)) {
                    i10 = 0;
                    this.f40398k4 = false;
                    v7Var.updateColors();
                    v7Var.invalidate();
                    j1();
                } else {
                    i10 = 0;
                }
                if (i12 != 0 && j3 != 6 && j3 != 17 && !(miVar instanceof ki.s3)) {
                    if (j3 == 4) {
                        L = org.telegram.messenger.g0.L(84.0f);
                    } else {
                        L = i10;
                    }
                } else {
                    L = org.telegram.messenger.g0.L(46.0f);
                }
                v7Var.setForcedMenuWidth(L);
            }
        }
    }

    @Override
    public final boolean I() {
        return this.f40441w2.b();
    }

    public final void I1(boolean z10, Boolean bool) {
        ui uiVar;
        if (this.f40388h2 == null) {
            uiVar = this;
            tn tnVar = new tn(uiVar, getContext(), false, this.J0, bool);
            uiVar.f40388h2 = tnVar;
            uiVar.f40433u2[1] = tnVar;
            tnVar.setDelegate(new dh(this, 17));
        } else {
            uiVar = this;
        }
        H1(uiVar.f40388h2, 9L, z10);
    }

    public final void J1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f10;
        float f11;
        mi miVar;
        float f12;
        float f13;
        float f14;
        int i7;
        boolean z13;
        this.f40409o1.a(z10, z11);
        v7 v7Var = this.V2;
        if ((z10 && v7Var.getTag() == null) || (!z10 && v7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            v7Var.setTag(num);
            AnimatorSet animatorSet = this.W2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W2 = null;
            }
            if (!this.A1 && !this.R2 && ((this.O2 != 0 || !this.f40411o3) && this.f40441w2 == this.f40379e2 && (this.J3 || this.K3))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f40441w2 == this.O1) {
                z12 = false;
            }
            uh uhVar = this.f40438v3;
            org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
            if (z10) {
                if (z12) {
                    q0Var.setVisibility(0);
                    q0Var.setClickable(true);
                }
            } else if (this.Q2 && this.B2.getTag() == null) {
                uhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
            if (g2Var != null) {
                if (z10) {
                    if (this.f40384f4) {
                        i7 = org.telegram.ui.ActionBar.m6.f29520kh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f29454h5;
                    }
                    if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(i7, this.J0)) > 0.699999988079071d) {
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
                animatorSet2.setDuration(Math.abs(f12 - v7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v7Var, property, f13);
                ofFloat.addUpdateListener(new eh(this, 4));
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
                this.W2.setInterpolator(nr.h);
                this.W2.setDuration(380L);
                this.W2.start();
                return;
            }
            if (z10 && this.Q2 && ((miVar = this.f40441w2) == null || miVar.N())) {
                uhVar.setVisibility(4);
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            v7Var.setAlpha(f10);
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
                org.telegram.ui.ActionBar.q0 q0Var2 = this.f40375c3;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(4);
                }
                if (this.O2 != 0 || !this.f40411o3) {
                    q0Var.setVisibility(4);
                }
            }
        }
    }

    @Override
    public final void K() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.f40408n4;
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

    public final void K1() {
        float alpha;
        int[] iArr = this.E2;
        xh xhVar = this.C2;
        xhVar.getLocationOnScreen(iArr);
        if (this.C4 != null) {
            mi miVar = this.f40441w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
            if ((miVar == chatAttachAlertPhotoLayout || miVar == this.f40399l2) && this.X1) {
                ai.l0 l0Var = this.M2;
                alpha = (l0Var.getAlpha() * l0Var.getMeasuredHeight()) + (l0Var.getY() - this.C4.getTop());
            } else {
                alpha = -xhVar.getHeight();
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
        si siVar = this.X3;
        if (siVar != null) {
            siVar.f0(new gh(this, 4));
        } else {
            u1();
        }
    }

    public final void L1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui.L1(int):void");
    }

    @Override
    public final void M(int i7) {
        super.M(i7);
        this.f40441w2.r(i7);
    }

    public final void M1() {
        boolean i7;
        float f10;
        float f11;
        float f12;
        mi miVar = this.f40441w2;
        int i10 = 0;
        if (miVar == null) {
            i7 = false;
        } else {
            i7 = miVar.i();
        }
        gi.j jVar = this.f40377d3;
        jVar.setEnabled(i7);
        mi miVar2 = this.f40441w2;
        float f13 = 0.5f;
        if (miVar2 != null) {
            if (miVar2.i()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f40445x2 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.Y1;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        mi miVar3 = this.f40445x2;
        if (miVar3 != null) {
            if (miVar3.i()) {
                f13 = 1.0f;
            }
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.Y1, f13, f10);
        }
        this.f40380e3 = f10;
        if (jVar != null) {
            float f14 = f10 * this.f40383f3;
            jVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            jVar.setVisibility(i10);
        }
    }

    public final void N0() {
        if (b1().f42535a.length() <= 0) {
            return;
        }
        this.f40441w2.a(b1().getText());
    }

    public final void N1(mi miVar, int i7) {
        boolean z10;
        int i10;
        int i11;
        if (miVar != null) {
            dh.g gVar = this.D4;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                gVar.f(0.0f, i7);
            }
            int currentItemTop = miVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (miVar == this.f40441w2 && currentItemTop <= miVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.M1 = z10;
                if (miVar == this.f40441w2) {
                    J1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) miVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int i12 = org.telegram.ui.Cells.c0.i(11.0f, i10, currentItemTop);
                mi miVar2 = this.f40441w2;
                if (miVar2 == miVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((miVar2 instanceof rm) || (this.f40445x2 instanceof rm)) {
                    Object obj = this.f40422r3;
                    if ((obj instanceof r1.g) && ((r1.g) obj).f56362f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.Z3;
                int i13 = iArr[i11];
                if (i13 == i12 && !z11) {
                    if (i7 != 0) {
                        this.f40370a4 = i13;
                        return;
                    }
                    return;
                }
                this.f40370a4 = i13;
                iArr[i11] = i12;
                Q1(i11);
                this.f30176b.invalidate();
            }
        }
    }

    public final boolean O0() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).Z6()) {
            return true;
        }
        return false;
    }

    public final void O1(boolean z10) {
        hi.w wVar;
        boolean z11;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
        if (chatAttachAlertPhotoLayout != null && (wVar = this.Z2) != null) {
            int i7 = 0;
            if (this.f40411o3 && this.d2 && this.f40441w2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.V();
            wVar.f15683f = z12;
            if (!z10) {
                ((d6) wVar.f15684g).a(z12);
            }
            wVar.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.q0 q0Var = this.f40369a3;
            if (z10 && this.f40411o3) {
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
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(nr.h).withEndAction(new ph(this, z11, 0)).start();
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ChatActivityEnterView.N(this.H3, ((org.telegram.ui.bn) g2Var).a(), g2Var, charSequence);
        }
        return false;
    }

    public final void P1(boolean z10) {
        boolean z11;
        float f10;
        mi miVar = this.f40379e2;
        if (z10) {
            if (!this.H1) {
                return;
            }
            if (this.f40399l2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.f40428t1;
                if (h6Var == null) {
                    h6Var = this.J0;
                }
                ?? miVar2 = new mi(context, h6Var, this);
                miVar2.E = 0.0f;
                miVar2.F = 0.0f;
                miVar2.G = 0.0f;
                miVar2.H = 0.0f;
                miVar2.I = 0.0f;
                miVar2.J = 0.0f;
                miVar2.K = null;
                miVar2.L = false;
                miVar2.N = 0.0f;
                miVar2.R = false;
                miVar2.T = false;
                Point point = org.telegram.messenger.g0.f24046q;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                miVar2.U = z11;
                miVar2.f39280n = h6Var;
                miVar2.f37523f = true;
                miVar2.setWillNotDraw(false);
                ui uiVar = miVar2.f37520b;
                org.telegram.ui.ActionBar.y s5 = uiVar.V2.s();
                TextView textView = new TextView(context);
                miVar2.f39285y = textView;
                org.telegram.ui.ActionBar.h6 h6Var2 = miVar2.f37519a;
                hi.u2 u2Var = new hi.u2(miVar2, context, s5, h6Var2, 2);
                v7 v7Var = uiVar.V2;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                v7Var.addView(u2Var, 0, c8.ma.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, h6Var2);
                textView.setText(org.telegram.messenger.hd.N0(2131753955, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                u2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                di.b1 b1Var = new di.b1(miVar2, context, h6Var2, 17);
                miVar2.f39281r = b1Var;
                b1Var.setAdapter(new org.telegram.ui.y7(miVar2, 3));
                v4.c0 c0Var = new v4.c0(1, false);
                miVar2.f39282s = c0Var;
                b1Var.setLayoutManager(c0Var);
                b1Var.setClipChildren(false);
                b1Var.setClipToPadding(false);
                b1Var.setOverScrollMode(2);
                b1Var.setVerticalScrollBarEnabled(false);
                qm qmVar = new qm(miVar2, context);
                miVar2.f39283w = qmVar;
                qmVar.setClipToPadding(true);
                qmVar.setClipChildren(true);
                miVar2.addView(b1Var, c8.ma.c(-1.0f, -1));
                miVar2.Q = uiVar.f40379e2;
                qmVar.f38946c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar2.Q;
                qmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                qmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                qmVar.c();
                UndoView undoView = new UndoView(context, null, false, uiVar.f40428t1);
                miVar2.f39284x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                miVar2.addView(undoView, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                miVar2.O = context.getResources().getDrawable(2131232551);
                this.f40399l2 = miVar2;
                miVar2.bringToFront();
            }
            mi miVar3 = this.f40441w2;
            rm rmVar = this.f40399l2;
            if (miVar3 != rmVar) {
                miVar = rmVar;
            }
            G1(miVar);
            return;
        }
        G1(miVar);
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
        vh vhVar = this.f40442w3;
        if (vhVar == null) {
            return;
        }
        int childCount = vhVar.getChildCount();
        boolean z11 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            vhVar.getChildAt(i17);
        }
        boolean z12 = this.f40384f4;
        if (z12) {
            i7 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29489j5;
        }
        org.telegram.ui.ActionBar.t6.U(this.f40389h3, i7, this.J0);
        if (z12) {
            i10 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f29489j5;
        }
        org.telegram.ui.ActionBar.t6.U(this.f40404m3, i10, this.J0);
        org.telegram.ui.ActionBar.t6.U(this.f40377d3, org.telegram.ui.ActionBar.m6.Ji, this.J0);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.f29489j5;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.J0);
        if (this.f40423r4 && w02 == this.f40419q4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f40423r4 = true;
        this.f40419q4 = w02;
        org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
        if (z10) {
            q0Var.setIconColor(w02);
        }
        Drawable background = q0Var.getBackground();
        if (z12) {
            i12 = org.telegram.ui.ActionBar.m6.Zg;
        } else {
            i12 = org.telegram.ui.ActionBar.m6.I5;
        }
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i12, this.J0), background);
        int i18 = org.telegram.ui.ActionBar.m6.E8;
        q0Var.P(org.telegram.ui.ActionBar.m6.w0(i18, this.J0), false);
        q0Var.P(org.telegram.ui.ActionBar.m6.w0(i18, this.J0), true);
        q0Var.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.J0));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f40369a3;
        if (q0Var2 != null && z10) {
            q0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.f40375c3;
        if (q0Var3 != null) {
            if (z10) {
                q0Var3.setIconColor(w02);
            }
            Drawable background2 = q0Var3.getBackground();
            if (z12) {
                i16 = org.telegram.ui.ActionBar.m6.Zg;
            } else {
                i16 = org.telegram.ui.ActionBar.m6.I5;
            }
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i16, this.J0), background2);
        }
        xh xhVar = this.C2;
        org.telegram.ui.ActionBar.h6 h6Var = xhVar.N;
        tt ttVar = xhVar.f42535a;
        int i19 = xhVar.M;
        if (i19 == 0) {
            ttVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, h6Var));
            int i20 = org.telegram.ui.ActionBar.m6.G6;
            ttVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i20, h6Var));
            ttVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(i20, h6Var));
        } else if (i19 != 2 && i19 != 3) {
            ttVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29677t5, h6Var));
            ttVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, h6Var));
        } else {
            ttVar.setHintTextColor(-1929379841);
            ttVar.setTextColor(-1);
            ttVar.setCursorColor(-1);
            ttVar.setHandlesColor(-1);
            ttVar.setHighlightColor(822083583);
            ttVar.E = -1;
        }
        xhVar.f42537c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Oe, h6Var), PorterDuff.Mode.MULTIPLY));
        ut utVar = xhVar.d;
        if (utVar != null) {
            utVar.updateColors();
        }
        org.telegram.ui.ActionBar.t6.l(vhVar, 21, org.telegram.ui.ActionBar.m6.A5, this.J0);
        if (z12) {
            i13 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i13 = org.telegram.ui.ActionBar.m6.f29489j5;
        }
        org.telegram.ui.ActionBar.h6 h6Var2 = this.J0;
        v7 v7Var = this.V2;
        org.telegram.ui.ActionBar.t6.l(v7Var, 1, i13, h6Var2);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.m6.Zg;
        } else {
            i14 = org.telegram.ui.ActionBar.m6.I5;
        }
        org.telegram.ui.ActionBar.t6.l(v7Var, 3, i14, this.J0);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i15 = org.telegram.ui.ActionBar.m6.f29489j5;
        }
        org.telegram.ui.ActionBar.t6.l(v7Var, 5, i15, this.J0);
        int e12 = e1(false);
        org.telegram.ui.ActionBar.m6.C1(e12, this.f30209s0);
        ui.c cVar = this.E4;
        if (cVar.f59041b != e12) {
            cVar.a(e12);
            lh.f fVar = this.f40430t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            wh whVar = this.f40434u3;
            if (whVar != null) {
                whVar.invalidate();
            }
        }
        this.f30176b.invalidate();
        int i21 = 0;
        while (true) {
            mi[] miVarArr = this.f40433u2;
            if (i21 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i21];
            if (miVar != null) {
                miVar.d();
            }
            i21++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29472i5, this.J0);
            org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z11 = true;
            }
            org.telegram.messenger.g0.m3(this, z11);
            return;
        }
        Q(org.telegram.ui.ActionBar.m6.f29454h5);
    }

    public final void Q1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui.Q1(int):void");
    }

    public final void R0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui.R0(boolean):void");
    }

    public final void R1() {
        int i7 = 0;
        Q1(0);
        this.f40414p3.invalidate();
        ai.l0 l0Var = this.M2;
        l0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
        if (chatAttachAlertPhotoLayout != null) {
            zl zlVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.Y();
            if (zlVar != null && zlVar.getFastScroll() != null) {
                jj0 fastScroll = zlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f32834q1;
                if (this.X1) {
                    i7 = (int) (l0Var.getAlpha() * l0Var.getMeasuredHeight());
                }
                fastScroll.f36536i0 = currentActionBarHeight + i7;
                zlVar.getFastScroll().invalidate();
            }
        }
        K1();
        V0();
    }

    public final void S0() {
        float f10 = this.n1.f57700e;
        float f11 = (1.0f - this.f40402m1.f57700e) * f10;
        this.f40434u3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.f40409o1.f57700e))), 1.0f - f11));
    }

    public final void T0(mi miVar) {
        int L;
        boolean e10 = miVar.e();
        int i7 = 0;
        lh.f fVar = this.f40430t3;
        if (fVar != null) {
            if (e10) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            fVar.setFadeHeightBottom(L);
        }
        wh whVar = this.f40434u3;
        if (whVar != null) {
            if (e10) {
                i7 = 4;
            }
            whVar.setVisibility(i7);
        }
    }

    public final void U0() {
        float f10;
        float f11 = this.f40412p1.f57700e;
        float f12 = this.f40416q1.f57700e;
        float a10 = a8.m7.a(this.f40420r1.f57700e);
        if (this.P3) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        c10.d(this.D2, com.google.android.gms.internal.vision.e2.D(f11, f12, a10, f10));
    }

    @Override
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.v6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            mi[] miVarArr = this.f40433u2;
            if (i7 < miVarArr.length) {
                mi miVar = miVarArr[i7];
                if (miVar != null && (themeDescriptions = miVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i7++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.f30179c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29472i5));
                return arrayList;
            }
        }
    }

    public final void V0() {
        ci ciVar = this.G2;
        uh uhVar = this.F2;
        ai.l0 l0Var = this.M2;
        if (l0Var != null && l0Var.getVisibility() == 0 && l0Var.getAlpha() != 0.0f) {
            float f10 = this.f40402m1.f57700e;
            float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
            ciVar.setAlpha(abs * abs * abs * abs);
            uhVar.setTranslationY(org.telegram.messenger.g0.T1(this.f40381e4, ((l0Var.getTranslationY() + l0Var.getTop()) - uhVar.getTop()) + org.telegram.messenger.g0.L(8.0f), nr.f37964j.getInterpolation(f10)));
            return;
        }
        uhVar.setTranslationY(this.f40381e4);
        ciVar.setAlpha(1.0f);
    }

    public final void W0(int i7) {
        this.Q2 = true;
        this.f40438v3.setVisibility(0);
        this.C1 = true;
        this.D1 = i7;
        this.O2 = 0;
        this.A1 = false;
        this.B1 = false;
        this.E1 = null;
        org.telegram.ui.ActionBar.q0 q0Var = this.f40392i3;
        if (q0Var != null) {
            this.f40389h3.setTranslationY(0.0f);
            q0Var.setVisibility(8);
        }
    }

    public final void X0(hi.d7 d7Var) {
        String N0 = org.telegram.messenger.hd.N0(2131752110, null);
        TextView textView = this.f40389h3;
        textView.setText(N0);
        this.Q2 = false;
        this.f40438v3.setVisibility(8);
        this.O2 = 1;
        this.A1 = true;
        this.B1 = true;
        this.d2 = false;
        this.E1 = d7Var;
        org.telegram.ui.ActionBar.q0 q0Var = this.f40392i3;
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
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (!(g2Var instanceof org.telegram.ui.bn) || (kjVar = ((org.telegram.ui.bn) g2Var).f46255x5) == null || (ijVar = kjVar.f25080b) == null) {
            return 0;
        }
        return ijVar.f24738g.size();
    }

    public final TLRPC.Chat Z0() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).f46005e;
        }
        return org.telegram.messenger.np.u1(this.H3).O0(Long.valueOf(-this.U1));
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.B4 = z10;
        }
        dismiss();
    }

    public final float a1() {
        uh uhVar = this.B2;
        float alpha = 1.0f - uhVar.getAlpha();
        return uhVar.getMeasuredHeight() - (alpha * (uhVar.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    public final yt b1() {
        mi miVar;
        if (this.X1 && ((miVar = this.f40441w2) == this.f40379e2 || miVar == this.f40399l2)) {
            return this.N2;
        }
        return this.C2;
    }

    public final long c1() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return this.U1;
    }

    public final int d1(int i7) {
        mi miVar = this.f40445x2;
        int[] iArr = this.Z3;
        if (miVar != null && ((this.f40441w2 instanceof rm) || (miVar instanceof rm))) {
            return org.telegram.messenger.g0.W1(this.Y1, iArr[0], iArr[1]);
        }
        return iArr[i7];
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ls.T0 && i7 != org.telegram.messenger.ls.Z4 && i7 != org.telegram.messenger.ls.F1) {
            if (i7 == org.telegram.messenger.ls.f25327i5) {
                this.F1 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).J0();
                return;
            }
            return;
        }
        ri riVar = this.f40450y3;
        if (riVar != null) {
            riVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z10;
        zh zhVar;
        xh xhVar;
        if (!this.f40441w2.q() && !this.J) {
            mi miVar = this.f40441w2;
            zk zkVar = this.f40421r2;
            if (miVar == zkVar && zkVar != null && !zkVar.L && zkVar.Q0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f40425s2 = z10;
            if (!z10 && (xhVar = this.C2) != null) {
                org.telegram.messenger.g0.v1(xhVar.getEditText());
            }
            if (!this.f40425s2 && (zhVar = this.N2) != null) {
                org.telegram.messenger.g0.v1(zhVar.getEditText());
            }
            this.f40437v2.clear();
            org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
            if (g2Var == null) {
                g2Var = LaunchActivity.Q();
            }
            if (!this.B4 && g2Var != null && this.f40441w2.getSelectedItemsCount() > 0 && !this.A1) {
                if (!this.A4) {
                    this.A4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), this.J0);
                    String N0 = org.telegram.messenger.hd.N0(2131751387, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.hd.N0(2131751388, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751394, null), new dh(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    t1Var.setOnCancelListener(new jh(this, 0));
                    t1Var.O = new z0(this, 3);
                    t1Var.show();
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = 0;
            while (true) {
                mi[] miVarArr = this.f40433u2;
                if (i7 >= miVarArr.length) {
                    break;
                }
                mi miVar2 = miVarArr[i7];
                if (miVar2 != null && this.f40441w2 != miVar2) {
                    miVar2.q();
                }
                i7++;
            }
            org.telegram.messenger.g0.s3(this, i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0), 0), true, new dh(this, 11));
            if (g2Var != null) {
                org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
            }
            this.f40387g4 = false;
            super.dismiss();
            this.B4 = false;
        }
    }

    public final int e1(boolean z10) {
        boolean q10;
        int i7;
        v7 v7Var;
        if (this.f40384f4) {
            return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29520kh, this.J0);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        Iterator it = this.f40424s1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.f57709a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = c8.l9.a(f10, 0.0f, 1.0f);
        if (z10 && (v7Var = this.V2) != null && v7Var.getVisibility() == 0) {
            a10 *= 1.0f - v7Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0);
        if (q10) {
            i7 = org.telegram.ui.ActionBar.m6.f29324a7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29472i5;
        }
        return i0.a.f(a10, w02, org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f40441w2.o(motionEvent);
    }

    public final void f1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui.f1():void");
    }

    public final boolean g1() {
        if (this.X1) {
            mi miVar = this.f40441w2;
            if (miVar == this.f40379e2 || miVar == this.f40399l2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        si siVar = this.X3;
        if (siVar != null && !this.f40426s3) {
            boolean g02 = siVar.g0();
            this.f40426s3 = true;
            di.p6 p6Var = new di.p6(this, editTextBoldCursor, z10, 19);
            if (g02) {
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
        final zk zkVar = this.f40421r2;
        if (zkVar != null && this.f40441w2 == zkVar) {
            final gh ghVar = new gh(this, 1);
            int i7 = zkVar.f42915n;
            org.telegram.ui.Wallet.ca caVar = zkVar.S;
            ui uiVar = zkVar.f37520b;
            AnimatorSet animatorSet = null;
            if (!zkVar.L && (wallettransaction = zkVar.Q0) != null && zkVar.R0 == null && zkVar.S0 == null) {
                if (zkVar.T0) {
                    org.telegram.ui.Wallet.n6 n6Var = new org.telegram.ui.Wallet.n6();
                    n6Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40368a2;
                    if (g2Var != null && g2Var.presentFragment(n6Var, false, true)) {
                        org.telegram.ui.Wallet.ra raVar = new org.telegram.ui.Wallet.ra(uiVar.f30179c, uiVar.f30176b, caVar.getDiamondView(), n6Var, zkVar.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!zkVar.L) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!zkVar.L) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, uiVar);
                        zkVar.S0 = raVar;
                        animatorSet = raVar.f44999m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.m7 diamondView = caVar.getDiamondView();
                    if (diamondView.f44621f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40368a2;
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (bnVar.getCurrentAccount() == i7 && bnVar.a() == zkVar.f42920r.f28583id && bnVar.f46036g4 == 0 && bnVar.getFragmentView() != null && bnVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.e7 e7Var = new org.telegram.ui.Wallet.e7(uiVar.f30179c, uiVar.f30176b, caVar.getDiamondView(), bnVar, zkVar.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!zkVar.L) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!zkVar.L) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, uiVar);
                                zkVar.R0 = e7Var;
                                animatorSet = e7Var.f44168m;
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
        if (this.f30209s0 != null && this.f30176b != null) {
            int e12 = e1(false);
            org.telegram.ui.ActionBar.m6.C1(e12, this.f30209s0);
            ui.c cVar = this.E4;
            if (cVar.f59041b != e12) {
                cVar.a(e12);
                lh.f fVar = this.f40430t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                wh whVar = this.f40434u3;
                if (whVar != null) {
                    whVar.invalidate();
                }
            }
            M1();
            this.f30176b.invalidate();
        }
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        boolean z10;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
        f81 f81Var = chatAttachAlertPhotoLayout.m0;
        bi.e3 e3Var = chatAttachAlertPhotoLayout.f32823k0;
        TextView textView = chatAttachAlertPhotoLayout.f32833q0;
        zl zlVar = chatAttachAlertPhotoLayout.f32835r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = org.telegram.messenger.g0.f24041n;
        if (view == e3Var) {
            if (z10) {
                if (zlVar.getVisibility() == 0) {
                    e3Var.layout(0, org.telegram.messenger.f3.z(222.0f, i12, i15), i13, org.telegram.messenger.f3.z(96.0f, i12, i15));
                    return true;
                }
                e3Var.layout(0, org.telegram.messenger.f3.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (zlVar.getVisibility() == 0) {
                e3Var.layout(org.telegram.messenger.f3.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            } else {
                e3Var.layout(org.telegram.messenger.f3.z(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == f81Var) {
            if (z10) {
                if (zlVar.getVisibility() == 0) {
                    f81Var.layout(0, org.telegram.messenger.f3.z(310.0f, i12, i15), i13, org.telegram.messenger.f3.z(260.0f, i12, i15));
                    return true;
                }
                f81Var.layout(0, org.telegram.messenger.f3.z(176.0f, i12, i15), i13, org.telegram.messenger.f3.z(126.0f, i12, i15));
                return true;
            } else if (zlVar.getVisibility() == 0) {
                f81Var.layout(org.telegram.messenger.f3.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            } else {
                f81Var.layout(org.telegram.messenger.f3.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                L = (i13 - textView.getMeasuredWidth()) / 2;
                int L2 = i12 - org.telegram.messenger.g0.L(167.0f);
                textView.setRotation(0.0f);
                if (zlVar.getVisibility() == 0) {
                    L2 -= org.telegram.messenger.g0.L(96.0f);
                }
                measuredWidth = L2 - i15;
            } else {
                L = i11 - org.telegram.messenger.g0.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
                textView.setRotation(-90.0f);
                if (zlVar.getVisibility() == 0) {
                    L -= org.telegram.messenger.g0.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != zlVar) {
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
            mi[] miVarArr = this.f40433u2;
            if (i7 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null) {
                miVar.p();
            }
            i7++;
        }
        int i10 = this.H3;
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.T0);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.Z4);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.f25327i5);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.F1);
        this.Q1 = true;
        xh xhVar = this.C2;
        if (xhVar != null) {
            xhVar.o();
        }
        zh zhVar = this.N2;
        if (zhVar != null) {
            zhVar.o();
        }
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40379e2;
        jm jmVar = chatAttachAlertPhotoLayout.f32842w;
        ui uiVar = chatAttachAlertPhotoLayout.f37520b;
        zl zlVar = chatAttachAlertPhotoLayout.f32835r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.f32837s;
        if (i7 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.f32807c0 && !chatAttachAlertPhotoLayout.f32811e0) {
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(uiVar.U() + uiVar.T() + i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            bi.e3 e3Var = chatAttachAlertPhotoLayout.f32823k0;
            if (view == e3Var) {
                if (z10) {
                    e3Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824));
                    return true;
                }
                e3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            f81 f81Var = chatAttachAlertPhotoLayout.m0;
            if (view == f81Var) {
                if (z10) {
                    f81Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                    return true;
                }
                f81Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == zlVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    zlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
                    if (b0Var.f59117o != 0) {
                        zlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        jmVar.f();
                    }
                } else {
                    zlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (b0Var.f59117o != 1) {
                        zlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        jmVar.f();
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
            q10 = org.telegram.messenger.p10.q(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.d0(this.H3).f26813b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.f28583id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.hd.a0("BotRemoveFromMenu", null, 2131752990, q10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String N0 = org.telegram.messenger.hd.N0(2131752989, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.hd.a0("BotRemoveInlineFromMenu", null, 2131752988, q10);
        }
        t1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, "OK"), new a3.h(this, tL_attachMenuBot, user, 25));
        i5.c.y("Cancel", 2131752577, alertDialog$Builder, null);
    }

    @Override
    public final boolean m0() {
        int i7;
        this.f40379e2.setTranslationX(0.0f);
        this.f40400l3.setAlpha(0.0f);
        this.j3.setAlpha(1.0f);
        this.f30176b.setTranslationY(this.f30176b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.o4 = animatorSet;
        fi fiVar = this.f40405m4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, fiVar, 0.0f, 400.0f));
        this.o4.setDuration(400L);
        this.o4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        fiVar.getClass();
        fiVar.a(this, valueOf);
        this.o4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new eh(this, 2));
        r1.g gVar = this.f40408n4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.f30176b, (r1.e) r1.g.f56352p, 0.0f);
        this.f40408n4 = gVar2;
        if (this.F3 != null) {
            gVar2.f56368m.a(0.75f);
            this.f40408n4.f56368m.b(350.0f);
        } else {
            gVar2.f56368m.a(0.75f);
            this.f40408n4.f56368m.b(350.0f);
        }
        this.f40408n4.h();
        if (this.K) {
            this.f30179c.setLayerType(2, null);
        }
        this.B0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        p6 p6Var = r6.d;
        if (this.f30204p0) {
            i7 = this.f30205q0;
        } else {
            i7 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, p6Var, i7));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.f30200l0);
        h2.f fVar = new h2.f((int[]) null);
        g gVar3 = new g(this, fVar, this.f30219z0, 7);
        this.f40408n4.a(new bi.y0(3, this, gVar3));
        this.A0.addListener(new ah.l(26, this, gVar3));
        fVar.d();
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25329j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        A1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(nr.f37961f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        while (true) {
            mi[] miVarArr = this.f40433u2;
            if (i7 < miVarArr.length) {
                mi miVar = miVarArr[i7];
                if (miVar != null) {
                    miVar.A();
                }
                i7++;
            } else {
                this.f40378d4 = true;
                return;
            }
        }
    }

    public final void n1() {
        int i7 = 0;
        this.f40378d4 = false;
        while (true) {
            mi[] miVarArr = this.f40433u2;
            if (i7 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null) {
                miVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.X3.g0();
        }
        ri riVar = this.f40450y3;
        if (riVar != null) {
            riVar.f();
        }
    }

    @Override
    public final void o0() {
        if (this.f40441w2.s()) {
            dismiss();
        }
    }

    public final void o1() {
        org.telegram.messenger.gj gjVar = this.F3;
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        int i7 = this.H3;
        if (gjVar != null && gjVar.p5() && !org.telegram.messenger.v3.z(i7, 24, org.telegram.messenger.gj.B0(this.F3.f24213k)) && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            org.telegram.messenger.lj ljVar = bnVar.f46268y5;
            if (ljVar == null) {
                ljVar = org.telegram.messenger.lj.b(this.F3.f24213k.suggested_post);
            }
            if (!di.y8.S(i7, ljVar.f25234a)) {
                bnVar.Ac(ljVar);
                return;
            }
        }
        if (this.F1 - this.G1 < 0) {
            org.telegram.messenger.g0.D3(this.f40432u1);
            org.telegram.messenger.g0.D3(this.f40436v1);
            try {
                this.G2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.np.u1(i7).K3() && org.telegram.messenger.np.u1(i7).X4 > this.G1) {
                E1(g2Var);
                return;
            }
            return;
        }
        if (this.F3 == null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) g2Var;
            if (bnVar2.c()) {
                c5.J(getContext(), bnVar2.a(), new dh(this, 14), this.J0);
                return;
            }
        }
        mi miVar = this.f40441w2;
        if (miVar != this.f40379e2 && miVar != this.f40399l2) {
            if (!miVar.M(true, 0, 0, this.L2, g1())) {
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
        v7 v7Var = this.V2;
        if (v7Var.f29150o0) {
            v7Var.n(true);
        } else if (this.f40441w2.k()) {
        } else {
            if (b1() != null && b1().f42538e) {
                b1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var != null) {
            org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f40441w2.G(i7)) {
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
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
            if (this.f40394j2 == null) {
                ml mlVar = new ml(this, getContext(), this.J0, (this.C1 || this.P3) ? false : false);
                this.f40394j2 = mlVar;
                this.f40433u2[5] = mlVar;
                ll llVar = this.f40435u4;
                if (llVar != null) {
                    mlVar.setDelegate(llVar);
                } else if (g2Var instanceof org.telegram.ui.bn) {
                    mlVar.setDelegate(new dh(this, 18));
                }
            }
            G1(this.f40394j2);
        }
    }

    public final void q1(boolean z10) {
        if (!this.L3 && z10) {
            un unVar = new un(3, getContext(), this.J0, this);
            this.O1 = unVar;
            G1(unVar);
        }
        int i7 = 1;
        if (this.f40385g2 == null) {
            ej ejVar = new ej(getContext(), this.J0, this);
            this.f40385g2 = ejVar;
            this.f40433u2[3] = ejVar;
            ejVar.setupBlurredSearchField(this.F4);
            this.f40385g2.setDelegate(new dh(this, 15));
            if (this.C1) {
                this.f40385g2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).f46005e;
            ej ejVar2 = this.f40385g2;
            if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                i7 = -1;
            }
            ejVar2.setMaxSelectedFiles(i7);
        }
        if (z10) {
            G1(this.f40385g2);
        }
    }

    public final void r1() {
        boolean z10;
        if (!this.O3) {
            un unVar = new un(5, getContext(), this.J0, this);
            this.O1 = unVar;
            G1(unVar);
        }
        if (this.f40382f2 == null) {
            vj vjVar = new vj(getContext(), this.J0, this);
            this.f40382f2 = vjVar;
            this.f40433u2[2] = vjVar;
            vjVar.setupBlurredSearchField(this.F4);
            this.f40382f2.setDelegate(new di(this));
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).f46005e;
            vj vjVar2 = this.f40382f2;
            if (chat != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            vjVar2.setMultipleSelectionAllowed(z10);
        }
        G1(this.f40382f2);
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
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, this.J0);
            org.telegram.ui.ActionBar.q0 q0Var = this.f40392i3;
            if (q0Var != null && w02 != this.f40415p4) {
                this.f40415p4 = w02;
                q0Var.setIconColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(boolean z10) {
        int i7;
        if (!this.I3 && z10) {
            un unVar = new un(4, getContext(), this.J0, this);
            this.O1 = unVar;
            G1(unVar);
        }
        boolean z11 = false;
        if (this.f40396k2 == null) {
            if (this.I1) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            mk mkVar = new mk(i7, getContext(), this.J0, this);
            this.f40396k2 = mkVar;
            this.f40433u2[4] = mkVar;
            mkVar.setDelegate(new ei(this));
        }
        int i10 = 1;
        if (this.C1) {
            this.f40396k2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
            if (g2Var instanceof org.telegram.ui.bn) {
                TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).f46005e;
                mk mkVar2 = this.f40396k2;
                if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                    i10 = -1;
                }
                mkVar2.setMaxSelectedFiles(i10);
            } else {
                this.f40396k2.setMaxSelectedFiles(this.Q3);
                mk mkVar3 = this.f40396k2;
                if (!this.I1 && !this.R1) {
                    z11 = true;
                }
                mkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        mk mkVar4 = this.f40396k2;
        mkVar4.f37531e0 = this.I1;
        if (z10) {
            G1(mkVar4);
        }
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.G3 = false;
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            this.f30194i0 = ((org.telegram.ui.bn) g2Var).V9();
        }
        M1();
        this.f40418q3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0), 0);
            this.H0 = o4;
            org.telegram.messenger.g0.s3(this, o4, false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        }
        if (this.f40398k4) {
            this.f40398k4 = false;
            v7 v7Var = this.V2;
            v7Var.updateColors();
            v7Var.invalidate();
            j1();
        }
    }

    @Override
    public final void u0(boolean z10) {
        this.f30207r0 = true;
    }

    public final void u1() {
        ViewGroup viewGroup = this.f30176b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        v7 v7Var = this.V2;
        int i7 = 1;
        if (v7Var.f29150o0) {
            v7Var.n(true);
        }
        this.f40382f2 = null;
        this.f40406n2 = null;
        this.f40385g2 = null;
        this.f40388h2 = null;
        this.f40391i2 = null;
        this.f40394j2 = null;
        this.f40396k2 = null;
        this.f40421r2 = null;
        while (true) {
            mi[] miVarArr = this.f40433u2;
            if (i7 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null) {
                miVar.p();
                this.f30176b.removeView(miVarArr[i7]);
                miVarArr[i7] = null;
            }
            i7++;
        }
        J1(false, false);
        super.L();
        if (this.f40425s2) {
            this.f40425s2 = false;
            this.f40429t2 = 0.0f;
            org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
            if (g2Var != null && g2Var.getFragmentView() != null) {
                View fragmentView = g2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f56289a;
                r0.y.c(fragmentView);
            }
        }
    }

    @Override
    public final void v() {
        if (this.f40368a2 instanceof org.telegram.ui.bn) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.f40441w2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.hd.N0(2131754921, "AccDescrAttachButton"));
        this.f40418q3 = true;
        if (!this.K3 && !this.J3) {
            O0();
        }
    }

    public final boolean v1(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        if (this.G3) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f40368a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            TLRPC.Chat chat = bnVar.f46005e;
            if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat) && chat.megagroup) || !org.telegram.messenger.v3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.H3).f25857g7.edit();
                edit.putBoolean("silent_" + bnVar.a(), !z10).commit();
            }
        }
        int i11 = 1;
        if (P0(b1().getText())) {
            return true;
        }
        N0();
        if (this.f40420r1.f57701f) {
            this.G3 = true;
            this.X3.y1(7, true, z10, i7, i10, j3, z11, false, 0L);
            return true;
        }
        long c12 = c1();
        mi miVar = this.f40441w2;
        if (miVar != null) {
            i11 = miVar.getSelectedItemsCount();
        }
        return c5.Y(this.H3, c12, Y0() + i11, new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                ui uiVar = ui.this;
                uiVar.G3 = true;
                uiVar.X3.y1(7, true, z10, i7, i10, j3, z11, false, ((Long) obj).longValue());
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
        this.f40402m1.a(z10, z11);
        yt b12 = b1();
        this.X1 = z10;
        yt b13 = b1();
        int i10 = 0;
        if (this.B2.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        mi miVar = this.f40441w2;
        if (miVar != this.f40379e2 && miVar != this.f40399l2) {
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
        ai.l0 l0Var = this.M2;
        kg.j jVar = this.A2;
        float f13 = 0.0f;
        if (z11) {
            if (z12) {
                i11 = 0;
            }
            l0Var.setVisibility(i11);
            ViewPropertyAnimator animate = l0Var.animate();
            if (z14 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).setUpdateListener(new eh(this, 0)).withEndAction(new Runnable(this) {
                public final ui f35232b;

                {
                    this.f35232b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ui uiVar = this.f35232b;
                            if (!z14 || !z12) {
                                uiVar.M2.setVisibility(8);
                            }
                            uiVar.R1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f35232b.A2.setVisibility(8);
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
            translationY.alpha(f12).setDuration(320L).setInterpolator(nrVar).setUpdateListener(new eh(this, 1)).withEndAction(new Runnable(this) {
                public final ui f35232b;

                {
                    this.f35232b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ui uiVar = this.f35232b;
                            if (!z14 || !z12) {
                                uiVar.M2.setVisibility(8);
                            }
                            uiVar.R1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f35232b.A2.setVisibility(8);
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
            l0Var.setVisibility(i7);
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            l0Var.setAlpha(f10);
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
            b13.setText(y5.cloneSpans(b12.getText()));
            b13.getEditText().setAllowTextEntitiesIntersection(b12.getEditText().getAllowTextEntitiesIntersection());
            if (b12.getEditText().isFocused()) {
                b13.getEditText().requestFocus();
                b13.getEditText().setSelection(b12.getEditText().getSelectionStart(), b12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.g3(new gh(this, 0));
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(int i7, org.telegram.messenger.gj gjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (gjVar != null && (chatAttachAlertPhotoLayout = this.f40379e2) != null) {
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
        this.f40450y3.f();
        L1(0);
    }

    public final void y1(float f10) {
        int i7;
        float translationY = this.f30176b.getTranslationY() - this.f40429t2;
        this.f40429t2 = this.f30176b.getHeight() * f10;
        this.f30176b.setTranslationY(translationY);
        zk zkVar = this.f40421r2;
        if (zkVar != null) {
            zkVar.setSendTransitionProgress(f10);
        }
        if (this.f30204p0) {
            i7 = Math.round((1.0f - f10) * this.f30205q0);
        } else {
            i7 = 0;
        }
        this.Z.setAlpha(i7);
        this.D0 = 1.0f - f10;
        this.f30179c.invalidate();
    }

    public final void z1(int i7, boolean z10) {
        if (this.F3 != null) {
            return;
        }
        this.Q3 = i7;
        this.R3 = z10;
    }

    public ui(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        float f10;
        TextPaint textPaint;
        te.j jVar;
        boolean z13;
        org.telegram.ui.ActionBar.q0 q0Var;
        gi.j jVar2;
        nr nrVar = nr.h;
        this.f40402m1 = new te.a(0, this, nrVar, 380L, false);
        this.n1 = new te.a(1, this, nrVar, 380L, false);
        this.f40409o1 = new te.a(2, this, nrVar, 380L, false);
        this.f40412p1 = new te.a(3, this, nrVar, 380L, false);
        this.f40416q1 = new te.a(4, this, nrVar, 380L, true);
        this.f40420r1 = new te.a(5, this, nrVar, 320L, false);
        te.j jVar3 = new te.j(new dh(this, 2), nrVar, 380L);
        this.f40424s1 = jVar3;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Y1 = 0.0f;
        this.Z1 = new fi(this, 0);
        this.d2 = false;
        mi[] miVarArr = new mi[12];
        this.f40433u2 = miVarArr;
        this.f40437v2 = new LongSparseArray();
        this.E2 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.H2 = textPaint2;
        this.I2 = new RectF();
        this.J2 = new Paint(1);
        this.S2 = true;
        this.T2 = 1.0f;
        this.f40454z3 = false;
        this.B3 = false;
        int i7 = org.telegram.messenger.k10.f24968t0;
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
        this.f40387g4 = false;
        ArrayList arrayList = new ArrayList();
        this.f40390h4 = arrayList;
        Rect rect = new Rect();
        this.f40393i4 = rect;
        this.f40405m4 = new fi(this, 1);
        this.f40427s4 = true;
        this.f40431t4 = false;
        this.A4 = false;
        this.B4 = false;
        this.f30217y = true;
        ui.c cVar = new ui.c();
        this.E4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, this.J0));
        this.Y0.E.add(new ri.o(cVar, new dh(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.cz.f()) {
            dh.g gVar = new dh.g(false);
            this.D4 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(cVar);
            fVar.f59050f = cVar;
            fVar.d = gVar;
            fVar.f59049e = -2;
            ui.f fVar2 = new ui.f(null);
            fVar2.f59050f = cVar;
            fVar2.d = gVar;
            fVar2.f59049e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.F4 = cVar2;
            cVar2.f8411k = true;
            int L = org.telegram.messenger.qc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.f8406e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.G4 = cVar3;
            cVar3.f8411k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.f8406e = L2;
        } else {
            this.D4 = null;
            this.F4 = new dh.c(cVar, cVar, cVar);
            this.G4 = new dh.c(cVar, cVar, cVar);
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.H4 = new kh(this, 0);
        this.f40384f4 = z10;
        this.f40371b2 = (g2Var instanceof org.telegram.ui.bn) && g2Var.isInBubbleMode();
        this.f30200l0 = new OvershootInterpolator(0.7f);
        this.f40368a2 = g2Var;
        this.G = true;
        this.f30219z0 = this;
        org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.T0);
        org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.Z4);
        org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.f25327i5);
        org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.F1);
        arrayList.add(rect);
        hi hiVar = new hi(this, context);
        this.f40414p3 = hiVar;
        hiVar.setDelegate(new ii(this));
        this.f30176b = hiVar;
        hiVar.setWillNotDraw(false);
        this.f30176b.setClipChildren(false);
        this.f30176b.setClipToPadding(false);
        ViewGroup viewGroup = this.f30176b;
        int i10 = this.f30211u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        v7 v7Var = new v7(this, context, h6Var, 1);
        this.V2 = v7Var;
        v7Var.f29129d1 = true;
        v7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        v7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        int i11 = org.telegram.ui.ActionBar.m6.f29489j5;
        org.telegram.ui.ActionBar.t6.l(v7Var, 1, i11, h6Var);
        int i12 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.ActionBar.t6.l(v7Var, 3, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(v7Var, 5, i11, h6Var);
        v7Var.setOccupyStatusBar(true);
        v7Var.setAlpha(0.0f);
        v7Var.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 15));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.J0), false, h6Var);
        this.Y2 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131231244);
        q0Var2.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        q0Var2.setVisibility(4);
        q0Var2.setAlpha(0.0f);
        q0Var2.setScaleX(0.6f);
        q0Var2.setScaleY(0.6f);
        q0Var2.setSubMenuOpenSide(2);
        q0Var2.setDelegate(new dh(this, 10));
        q0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(q0Var2, h02, null, M, h6Var);
        q0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var3 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i13, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var3.getWidth() / 2.0f) + q0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.J0), false, h6Var);
        this.f40369a3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        hi.w wVar = new hi.w();
        this.Z2 = wVar;
        q0Var3.setIcon(wVar);
        q0Var3.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        q0Var3.setVisibility(8);
        q0Var3.setAlpha(0.0f);
        q0Var3.setScaleX(0.6f);
        q0Var3.setScaleY(0.6f);
        q0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        q0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(q0Var3, h03, null, M2, h6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i13, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        gi.j jVar4 = new gi.j(this, context);
        org.telegram.ui.ActionBar.t6.U(jVar4, org.telegram.ui.ActionBar.m6.Ji, h6Var);
        jVar4.setText(org.telegram.messenger.hd.N0(2131751741, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        jVar4.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i13, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        c8.ra.a(jVar4);
        this.f40377d3 = jVar4;
        M1();
        if (g2Var != null) {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            q0Var = q0Var3;
            jVar2 = jVar4;
            org.telegram.ui.ActionBar.q0 q0Var4 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.J0), false, h6Var);
            this.f40375c3 = q0Var4;
            q0Var4.setLongClickEnabled(false);
            q0Var4.setIcon(2131232488);
            q0Var4.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
            q0Var4.setVisibility(4);
            z13 = false;
            q0Var4.setAlpha(0.0f);
            q0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0), 6, -1);
            org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i12);
            q0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.t6.j(q0Var4, h04, null, M3, h6Var);
            q0Var4.setOnClickListener(new fi.v1(5, this, z11));
        } else {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            z13 = false;
            q0Var = q0Var3;
            jVar2 = jVar4;
        }
        org.telegram.ui.ActionBar.q0 q0Var5 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.J0), false, h6Var);
        this.f40392i3 = q0Var5;
        q0Var5.setLongClickEnabled(false);
        q0Var5.setIcon(2131231244);
        q0Var5.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        q0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0), 3, -1);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i12);
        q0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(q0Var5, h05, null, M4, h6Var);
        q0Var5.e(1, 2131232046, org.telegram.messenger.hd.N0(2131744634, null)).setOnClickListener(new View.OnClickListener(this) {
            public final ui f36255b;

            {
                this.f36255b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final ui uiVar = this.f36255b;
                        xh xhVar = uiVar.C2;
                        if (xhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var = new n0(uiVar.getContext(), h6Var);
                            n0Var.x1(xhVar.getText());
                            n0Var.f37686f2 = new org.telegram.messenger.y10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = uiVar.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            zh zhVar = uiVar.N2;
                                            zhVar.setText(charSequence);
                                            zhVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = uiVar.U1;
                            if (uiVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            n0Var.v1(j3, z14, new mh(uiVar, 0));
                            n0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ui uiVar2 = this.f36255b;
                        zh zhVar = uiVar2.N2;
                        if (zhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var2 = new n0(uiVar2.getContext(), h6Var);
                            n0Var2.x1(zhVar.getText());
                            n0Var2.f37686f2 = new org.telegram.messenger.y10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = uiVar2.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            zh zhVar2 = uiVar2.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = uiVar2.U1;
                            if (uiVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            n0Var2.v1(j10, z15, new mh(uiVar2, 1));
                            n0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ui uiVar3 = this.f36255b;
                        uiVar3.f40392i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar3.f40368a2;
                        p12.I2(null, g2Var2, h6Var);
                        PhotoViewer.p1().J2(uiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i13 = uiVar3.Q3;
                        boolean z16 = uiVar3.R3;
                        p13.h = i13;
                        p13.f43320n = z16;
                        if (!uiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(uiVar3.f30179c.findFocus());
                        }
                        File w10 = hi.c7.w(uiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24046q;
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
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        li liVar = new li(uiVar3, ffVar);
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) g2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, liVar, bnVar);
                        if (uiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, uiVar3.E1);
                            return;
                        }
                        return;
                }
            }
        });
        q0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        q0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        q0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i13, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        uh uhVar = new uh(this, context, 0);
        this.f40386g3 = uhVar;
        uhVar.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i13, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        uhVar.setAlpha(0.0f);
        uhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f40389h3 = textView;
        org.telegram.messenger.f3.l(textView, i11, h6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f40397k3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.x(imageView, mutate, i11, h6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ma.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        uhVar.addView(linearLayout, c8.ma.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f40400l3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.t6.x(imageView2, mutate2, i11, h6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ma.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f40404m3 = textView2;
        org.telegram.messenger.f3.l(textView2, i11, h6Var, 1, 16.0f);
        org.telegram.messenger.f3.k(textView2, 19, "AttachMediaPreview", 2131753955);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ma.r(-2, -2, 16));
        uhVar.addView(linearLayout2, c8.ma.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, h6Var);
        this.f40379e2 = chatAttachAlertPhotoLayout;
        miVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f40441w2 = chatAttachAlertPhotoLayout;
        this.U2 = 1L;
        this.f30176b.addView(chatAttachAlertPhotoLayout, c8.ma.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.f40430t3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m);
        this.f30176b.addView(fVar3, c8.ma.g());
        this.f30176b.addView(uhVar, c8.ma.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.l0 l0Var = new ai.l0(context, 15);
        this.M2 = l0Var;
        this.f30176b.addView(l0Var, c8.ma.e(-1, -2, 55));
        this.f30176b.addView(v7Var, c8.ma.c(-2.0f, -1));
        this.f30176b.addView(q0Var2, c8.ma.e(48, 48, 53));
        this.f30176b.addView(q0Var, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f40375c3;
        if (q0Var6 != null) {
            this.f30176b.addView(q0Var6, c8.ma.e(48, 48, 53));
        }
        uhVar.addView(q0Var5, c8.ma.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f30176b.addView(jVar2, c8.ma.e(-2, 48, 53));
        uh uhVar2 = new uh(this, context, 1);
        this.f40438v3 = uhVar2;
        vh vhVar = new vh(context, 0);
        this.f40442w3 = vhVar;
        vhVar.setClipChildren(true);
        vhVar.setClipToPadding(false);
        ri riVar = new ri(this, context);
        this.f40450y3 = riVar;
        vhVar.setAdapter(riVar);
        v4.c0 c0Var = new v4.c0(0, false);
        this.f40446x3 = c0Var;
        vhVar.setLayoutManager(c0Var);
        vhVar.setVerticalScrollBarEnabled(false);
        vhVar.setHorizontalScrollBarEnabled(false);
        vhVar.setItemAnimator(null);
        vhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.t6.l(vhVar, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        vhVar.f34895z2 = true;
        vhVar.setOverScrollMode(2);
        dh.c cVar5 = this.F4;
        ri.q qVar = this.Y0;
        cVar5.f8410j = qVar;
        this.G4.f8410j = qVar;
        cVar4.f8410j = qVar;
        wh whVar = new wh(this, context, 0);
        this.f40434u3 = whVar;
        dh.d dVar = new dh.d(cVar4.c(whVar, null, false));
        this.W1 = dVar;
        if (org.telegram.messenger.cz.f()) {
            org.telegram.messenger.qc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.f30176b.addView(whVar, c8.ma.g());
        fh.g c10 = this.F4.c(uhVar2, c8.i0.g(h6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        uhVar2.setBackground(c10);
        vhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        vhVar.setClipToOutline(true);
        bg.q0 q0Var7 = bg.u0.f3362a;
        vhVar.setOutlineProvider(new bg.s0(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(28.0f)));
        vhVar.setImportantForAccessibility(1);
        uhVar2.addView(vhVar, c8.ma.g());
        this.f30176b.addView(uhVar2, c8.ma.e(-1, 70, 81));
        vhVar.setOnItemClickListener(new fi.g4(9, this, h6Var));
        vhVar.setOnItemLongClickListener(new dh(this, 3));
        o6 o6Var = new o6(context, true, false, true);
        this.C3 = o6Var;
        o6Var.setVisibility(8);
        o6Var.setAlpha(0.0f);
        o6Var.setGravity(17);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        o6Var.setPadding(L3, 0, L3, 0);
        o6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        o6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i13 = 2131748639;
                            } else {
                                i13 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i13, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        this.f30176b.addView(o6Var, c8.ma.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f30176b.addView(radialProgressView, c8.ma.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.D2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.m6.f29792z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView3, i13, h6Var, mode2);
        imageView3.setImageResource(2131231839);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i132 = 2131748639;
                            } else {
                                i132 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i132, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        uh uhVar3 = new uh(this, context, 2);
        this.B2 = uhVar3;
        kg.j jVar5 = new kg.j(this, context);
        this.A2 = jVar5;
        uhVar3.addView(jVar5, c8.ma.e(-1, -1, 119));
        fh.g c11 = this.G4.c(hiVar, c8.i0.o(h6Var), false);
        this.f40449y2 = c11;
        c11.T = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.R.f11673g = 0.4f;
        c11.n();
        fh.g c12 = this.F4.c(jVar5, c8.i0.o(h6Var), false);
        this.f40453z2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        uhVar3.setWillNotDraw(false);
        uhVar3.setVisibility(4);
        uhVar3.setAlpha(0.0f);
        this.f30176b.addView(uhVar3, c8.ma.e(-1, -2, 83));
        uhVar3.setOnTouchListener(new gi.a(14));
        o6 o6Var2 = new o6(context, false, false, false);
        this.f40432u1 = o6Var2;
        o6Var2.setAllowCancel(true);
        o6Var2.setScaleProperty(0.6f);
        o6Var2.setVisibility(8);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i14 = org.telegram.ui.ActionBar.m6.f29773y6;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i14, h6Var);
        o6Var2.setTypeface(org.telegram.messenger.g0.o());
        o6Var2.setGravity(17);
        jVar5.addView(o6Var2, c8.ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f40440w1 = imageView4;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
        this.f40444x1 = v2Var;
        imageView4.setImageDrawable(v2Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.m6.Nl;
        org.telegram.ui.ActionBar.t6.s(imageView4, i15, h6Var, mode);
        int i16 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i16);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(imageView4, h06, null, M5, h6Var);
        jVar5.addView(imageView4, c8.ma.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.N0(2131755006, null));
        c8.ra.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ui f36255b;

            {
                this.f36255b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final ui uiVar = this.f36255b;
                        xh xhVar = uiVar.C2;
                        if (xhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var = new n0(uiVar.getContext(), h6Var);
                            n0Var.x1(xhVar.getText());
                            n0Var.f37686f2 = new org.telegram.messenger.y10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = uiVar.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            zh zhVar2 = uiVar.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = uiVar.U1;
                            if (uiVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            n0Var.v1(j3, z14, new mh(uiVar, 0));
                            n0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ui uiVar2 = this.f36255b;
                        zh zhVar = uiVar2.N2;
                        if (zhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var2 = new n0(uiVar2.getContext(), h6Var);
                            n0Var2.x1(zhVar.getText());
                            n0Var2.f37686f2 = new org.telegram.messenger.y10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = uiVar2.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            zh zhVar2 = uiVar2.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = uiVar2.U1;
                            if (uiVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            n0Var2.v1(j10, z15, new mh(uiVar2, 1));
                            n0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ui uiVar3 = this.f36255b;
                        uiVar3.f40392i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar3.f40368a2;
                        p12.I2(null, g2Var2, h6Var);
                        PhotoViewer.p1().J2(uiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = uiVar3.Q3;
                        boolean z16 = uiVar3.R3;
                        p13.h = i132;
                        p13.f43320n = z16;
                        if (!uiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(uiVar3.f30179c.findFocus());
                        }
                        File w10 = hi.c7.w(uiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24046q;
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
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        li liVar = new li(uiVar3, ffVar);
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) g2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, liVar, bnVar);
                        if (uiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, uiVar3.E1);
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
        this.F1 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).J0();
        xh xhVar = new xh(this, context, hiVar, h6Var);
        this.C2 = xhVar;
        xhVar.K = true;
        xhVar.setHint(org.telegram.messenger.hd.N0(2131754451, "AddCaption"));
        xhVar.s();
        xhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        xhVar.getEditText().addTextChangedListener(new yh(this, 0));
        jVar5.addView(xhVar, c8.ma.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        uhVar3.setClipChildren(false);
        xhVar.setClipChildren(false);
        l0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        l0Var.setWillNotDraw(false);
        zh zhVar = new zh(this, context, hiVar, h6Var);
        this.N2 = zhVar;
        zhVar.K = true;
        zhVar.getEditText().addTextChangedListener(new bi(this, g2Var));
        zhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        zhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        zhVar.getEditText().setTextSize(1, 17.0f);
        zhVar.getEmojiButton().setLayoutParams(c8.ma.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        zhVar.setHint(org.telegram.messenger.hd.N0(2131754451, "AddCaption"));
        l0Var.addView(zhVar, c8.ma.e(-1, -2, 119));
        l0Var.setAlpha(0.0f);
        l0Var.setVisibility(8);
        xhVar.addView(imageView3, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.F4.c(l0Var, c8.i0.o(h6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        l0Var.setBackground(c13);
        l0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        o6 o6Var3 = new o6(context, false, false, false);
        this.f40436v1 = o6Var3;
        o6Var3.setScaleProperty(0.6f);
        o6Var3.setVisibility(8);
        o6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var3, i14, h6Var);
        o6Var3.setTypeface(org.telegram.messenger.g0.o());
        o6Var3.setGravity(17);
        o6Var3.setAllowCancel(true);
        l0Var.addView(o6Var3, c8.ma.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231840);
        org.telegram.ui.ActionBar.t6.s(imageView5, org.telegram.ui.ActionBar.m6.Oe, h6Var, mode2);
        zhVar.addView(imageView5, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i132 = 2131748639;
                            } else {
                                i132 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i132, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f40448y1 = imageView6;
        org.telegram.ui.ActionBar.v2 v2Var2 = new org.telegram.ui.ActionBar.v2(context);
        this.f40452z1 = v2Var2;
        imageView6.setImageDrawable(v2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView6, i15, h6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M6 = org.telegram.ui.ActionBar.t6.M(i16);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.t6.j(imageView6, h07, null, M6, h6Var);
        l0Var.addView(imageView6, c8.ma.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.hd.N0(2131755006, null));
        c8.ra.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ui f36255b;

            {
                this.f36255b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final ui uiVar = this.f36255b;
                        xh xhVar2 = uiVar.C2;
                        if (xhVar2 != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var = new n0(uiVar.getContext(), h6Var);
                            n0Var.x1(xhVar2.getText());
                            n0Var.f37686f2 = new org.telegram.messenger.y10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar22 = uiVar.C2;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            zh zhVar2 = uiVar.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = uiVar.U1;
                            if (uiVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            n0Var.v1(j3, z14, new mh(uiVar, 0));
                            n0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ui uiVar2 = this.f36255b;
                        zh zhVar2 = uiVar2.N2;
                        if (zhVar2 != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var2 = new n0(uiVar2.getContext(), h6Var);
                            n0Var2.x1(zhVar2.getText());
                            n0Var2.f37686f2 = new org.telegram.messenger.y10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar22 = uiVar2.C2;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            zh zhVar22 = uiVar2.N2;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = uiVar2.U1;
                            if (uiVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            n0Var2.v1(j10, z15, new mh(uiVar2, 1));
                            n0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ui uiVar3 = this.f36255b;
                        uiVar3.f40392i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar3.f40368a2;
                        p12.I2(null, g2Var2, h6Var);
                        PhotoViewer.p1().J2(uiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = uiVar3.Q3;
                        boolean z16 = uiVar3.R3;
                        p13.h = i132;
                        p13.f43320n = z16;
                        if (!uiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(uiVar3.f30179c.findFocus());
                        }
                        File w10 = hi.c7.w(uiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24046q;
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
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        li liVar = new li(uiVar3, ffVar);
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) g2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, liVar, bnVar);
                        if (uiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, uiVar3.E1);
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
        uh uhVar4 = new uh(this, context, 3);
        this.F2 = uhVar4;
        uhVar4.setFocusable(true);
        uhVar4.setFocusableInTouchMode(true);
        uhVar4.setVisibility(4);
        uhVar4.setScaleX(0.2f);
        uhVar4.setScaleY(0.2f);
        uhVar4.setAlpha(0.0f);
        uhVar4.setClipChildren(false);
        uhVar4.setClipToPadding(false);
        this.f30176b.addView(uhVar4, c8.ma.e(110, 50, 85));
        ci ciVar = new ci(context, h6Var, this);
        this.G2 = ciVar;
        ciVar.setImportantForAccessibility(2);
        uhVar4.addView(ciVar, c8.ma.e(-1, -1, 119));
        ciVar.setTranslationX(this.f30211u0);
        int L4 = org.telegram.messenger.g0.L(52.0f);
        int L5 = org.telegram.messenger.g0.L(38.0f);
        ciVar.L = L4;
        ciVar.M = L5;
        ciVar.P = org.telegram.messenger.g0.L(7.0f);
        ciVar.Q = org.telegram.messenger.g0.L(6.0f);
        ciVar.f40352s0 = true;
        ciVar.setOnClickListener(new View.OnClickListener(this) {
            public final ui f35899b;

            {
                this.f35899b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s3 s3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        ui uiVar = this.f35899b;
                        if (uiVar.f40441w2 != uiVar.f40399l2) {
                            z14 = true;
                        }
                        uiVar.P1(z14);
                        return;
                    case 1:
                        ui uiVar2 = this.f35899b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.f40437v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ui uiVar3 = this.f35899b;
                        boolean z15 = uiVar3.X1;
                        if (!z15) {
                            uiVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        ui uiVar4 = this.f35899b;
                        boolean z16 = uiVar4.X1;
                        if (z16) {
                            uiVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35899b.o1();
                        return;
                    case 5:
                        this.f35899b.Y2.V(null, null);
                        return;
                    case 6:
                        ui uiVar5 = this.f35899b;
                        if (uiVar5.f40379e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.f40379e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.f23414i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.f40369a3;
                            hi.l3 l3Var = uiVar5.f40372b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.f40372b3 = l3Var2;
                            if (!V) {
                                i132 = 2131748639;
                            } else {
                                i132 = 2131748640;
                            }
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i132, null)));
                            uiVar5.f40372b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.f40372b3.p(1.0f, -((uiVar5.f30176b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.f40372b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.f40372b3;
                            l3Var3.f14988r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.f30176b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.f40372b3.x();
                            return;
                        }
                        return;
                    case 7:
                        mi miVar = this.f35899b.f40441w2;
                        if (miVar != null) {
                            miVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35899b.f40392i3.V(null, null);
                        return;
                }
            }
        });
        ciVar.setOnLongClickListener(new org.telegram.ui.of(this, context, h6Var, g2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        wh whVar2 = new wh(this, context, 1);
        whVar2.setAlpha(0.0f);
        whVar2.setScaleX(0.2f);
        whVar2.setScaleY(0.2f);
        if (z10) {
            Q0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.F4, c8.i0.o(h6Var));
        qc0 qc0Var = new qc0(context);
        this.N1 = qc0Var;
        this.f30176b.addView(qc0Var, c8.ma.c(-1.0f, -1));
        gh.e eVar = new gh.e(h6Var);
        eVar.f13657e = new dh(this, 5);
        eVar.f13656c = new dh(this, 6);
        eVar.d = new dh(this, 7);
        eVar.f13655b = new dh(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13659n = N;
        eVar.f13660r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13658f = N3;
        eVar.h = N4;
        v7Var.P(this.F4, eVar, false);
        jVar.f(1L, false);
        this.Y0.i(this.f30176b);
        ri.q qVar2 = this.Y0;
        qVar2.f56739a = new dh(this, 9);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
