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
public class si extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.r2, te.b {
    public static final int I4 = 0;
    public boolean A1;
    public final kg.j A2;
    public final RadialProgressView A3;
    public boolean A4;
    public boolean B1;
    public final sh B2;
    public boolean B3;
    public boolean B4;
    public boolean C1;
    public final vh C2;
    public final n6 C3;
    public hi.i C4;
    public int D1;
    public final ImageView D2;
    public float D3;
    public final dh.g D4;
    public org.telegram.messenger.q10 E1;
    public final int[] E2;
    public int E3;
    public final ui.c E4;
    public int F1;
    public final sh F2;
    public org.telegram.messenger.fj F3;
    public final dh.c F4;
    public int G1;
    public final ai G2;
    public boolean G3;
    public final dh.c G4;
    public boolean H1;
    public final TextPaint H2;
    public final int H3;
    public final ih H4;
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
    public final ai.k0 M2;
    public boolean M3;
    public final pc0 N1;
    public final xh N2;
    public boolean N3;
    public sn O1;
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
    public ak S1;
    public boolean S2;
    public boolean S3;
    public zi T1;
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
    public qi X3;
    public float Y1;
    public final org.telegram.ui.ActionBar.r0 Y2;
    public dn Y3;
    public final di Z1;
    public final hi.v Z2;
    public final int[] Z3;
    public final org.telegram.ui.ActionBar.h2 f39659a2;
    public final org.telegram.ui.ActionBar.r0 f39660a3;
    public int f39661a4;
    public final boolean f39662b2;
    public hi.m3 f39663b3;
    public float f39664b4;
    public df f39665c2;
    public final org.telegram.ui.ActionBar.r0 f39666c3;
    public float f39667c4;
    public boolean d2;
    public final gi.j f39668d3;
    public boolean f39669d4;
    public final ChatAttachAlertPhotoLayout f39670e2;
    public float f39671e3;
    public float f39672e4;
    public tj f39673f2;
    public float f39674f3;
    public final boolean f39675f4;
    public cj f39676g2;
    public final sh f39677g3;
    public boolean f39678g4;
    public rn f39679h2;
    public final TextView f39680h3;
    public final ArrayList f39681h4;
    public rn f39682i2;
    public final org.telegram.ui.ActionBar.r0 f39683i3;
    public final Rect f39684i4;
    public kl f39685j2;
    public final LinearLayout j3;
    public float f39686j4;
    public kk f39687k2;
    public final ImageView f39688k3;
    public boolean f39689k4;
    public pm f39690l2;
    public final LinearLayout f39691l3;
    public int f39692l4;
    public final te.a f39693m1;
    public fj f39694m2;
    public final TextView f39695m3;
    public final di f39696m4;
    public final te.a n1;
    public kg.g0 f39697n2;
    public float f39698n3;
    public r1.g f39699n4;
    public final te.a f39700o1;
    public lk f39701o2;
    public boolean f39702o3;
    public AnimatorSet o4;
    public final te.a f39703p1;
    public lk f39704p2;
    public final fi f39705p3;
    public int f39706p4;
    public final te.a f39707q1;
    public oi.o f39708q2;
    public boolean f39709q3;
    public int f39710q4;
    public final te.a f39711r1;
    public xk f39712r2;
    public Object f39713r3;
    public boolean f39714r4;
    public final te.j f39715s1;
    public boolean f39716s2;
    public boolean f39717s3;
    public boolean f39718s4;
    public org.telegram.ui.zm f39719t1;
    public float f39720t2;
    public final lh.f f39721t3;
    public boolean f39722t4;
    public final n6 f39723u1;
    public final ki[] f39724u2;
    public final uh f39725u3;
    public jl f39726u4;
    public final n6 f39727v1;
    public final LongSparseArray f39728v2;
    public final sh f39729v3;
    public boolean f39730v4;
    public final ImageView f39731w1;
    public ki f39732w2;
    public final th f39733w3;
    public boolean f39734w4;
    public final org.telegram.ui.ActionBar.w2 f39735x1;
    public ki f39736x2;
    public final v4.c0 f39737x3;
    public File f39738x4;
    public final ImageView f39739y1;
    public final fh.g f39740y2;
    public final pi f39741y3;
    public double[] f39742y4;
    public final org.telegram.ui.ActionBar.w2 f39743z1;
    public final fh.g f39744z2;
    public boolean f39745z3;
    public boolean f39746z4;

    public si(Activity activity, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11) {
        this(activity, h2Var, z10, z11, true, null);
    }

    public static void J0(si siVar) {
        boolean z10;
        boolean q10;
        int i7;
        v7 v7Var = siVar.V2;
        lh.f fVar = siVar.f39721t3;
        if (fVar != null && v7Var != null) {
            ki kiVar = siVar.f39736x2;
            if (kiVar == null) {
                kiVar = siVar.f39732w2;
            }
            int i10 = 0;
            if (kiVar != null && kiVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.i6 i6Var = siVar.J0;
            if (i6Var != null) {
                q10 = i6Var.d();
            } else {
                q10 = org.telegram.ui.ActionBar.n6.I.q();
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

    public static void L0(si siVar) {
        hi.i iVar = new hi.i(siVar, siVar.getContext(), siVar.U1, LaunchActivity.Q(), siVar.J0, 1);
        siVar.C4 = iVar;
        iVar.p(new of(siVar, 1));
        ViewGroup viewGroup = siVar.f30190b;
        viewGroup.addView(siVar.C4, viewGroup.indexOfChild(siVar.B2), c8.ma.e(-1, -1, 83));
        hi.i iVar2 = siVar.C4;
        iVar2.getAdapter().f17502c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f17505e = false;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        boolean z10 = true;
        if (h2Var instanceof org.telegram.ui.bn) {
            iVar2.getAdapter().f17516n0 = false;
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            jg.h1 adapter = iVar2.getAdapter();
            bnVar.j();
            TLRPC.Chat chat = bnVar.f45978e;
            adapter.getClass();
            adapter.m0 = chat;
            iVar2.getAdapter().W(bnVar.f46154r8);
            jg.h1 adapter2 = iVar2.getAdapter();
            if (bnVar.f45978e == null) {
                z10 = false;
            }
            adapter2.f17508f0 = z10;
        } else {
            iVar2.getAdapter().f17516n0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f17508f0 = false;
        }
        iVar2.getAdapter().f17509g0 = false;
        siVar.K1();
    }

    public static int M0(si siVar) {
        ki kiVar = siVar.f39732w2;
        rn rnVar = siVar.f39679h2;
        if (kiVar == rnVar && rnVar.F != null) {
            return rnVar.getEmojiPadding();
        }
        rn rnVar2 = siVar.f39682i2;
        if (kiVar == rnVar2 && rnVar2.F != null) {
            return rnVar2.getEmojiPadding();
        }
        if (siVar.X1) {
            return siVar.N2.getEmojiPadding();
        }
        return siVar.C2.getEmojiPadding();
    }

    public static boolean h1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.o10.C(user) && !org.telegram.messenger.o10.u(user) && !org.telegram.messenger.o10.y(user) && !org.telegram.messenger.o10.B(user.f28552id) && !org.telegram.messenger.o10.A(user) && !org.telegram.messenger.o10.t(user) && user.f28552id != 489000 && !org.telegram.messenger.mp.L2(user)) {
            return true;
        }
        return false;
    }

    public static void t1(ki kiVar) {
        if (kiVar != null) {
            int i7 = org.telegram.ui.ActionBar.u6.f30083b;
            Object tag = kiVar.getTag(2131296710);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
                return;
            }
            kiVar.setTag(2131296710, Integer.valueOf(i7));
            try {
                org.telegram.ui.ActionBar.u6.c0(kiVar, true);
                kiVar.d();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void A1(float f10) {
        boolean z10 = false;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29337a7, this.J0), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o4;
        org.telegram.messenger.g0.s3(this, o4, false, null);
        if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.m3(this, z10);
        this.f30193c.invalidate();
    }

    public final void B1(String str) {
        boolean z10 = true;
        this.O2 = 1;
        this.A1 = true;
        this.Q2 = false;
        this.K3 = false;
        this.f39729v3.setVisibility(8);
        this.f39680h3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
        if (chatAttachAlertPhotoLayout != null) {
            si siVar = chatAttachAlertPhotoLayout.f36766b;
            if (siVar.O2 == 0 || siVar.A1) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f32782h1 = z10;
        }
    }

    public final void C1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.C1(boolean):void");
    }

    public final void D1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.D1(long, java.lang.String, boolean, boolean):void");
    }

    public final void E1(org.telegram.ui.ActionBar.h2 h2Var) {
        if ((h2Var instanceof org.telegram.ui.bn) && org.telegram.messenger.v3.V(((org.telegram.ui.bn) h2Var).f45978e)) {
            new lc(this.f39705p3, this.J0).f(org.telegram.messenger.mp.u1(this.H3).X4, new mg(2, this, h2Var)).j();
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
        ki kiVar;
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
        sh shVar = this.B2;
        if (shVar.getTag() != null) {
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
        shVar.setTag(num);
        vh vhVar = this.C2;
        if (vhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(vhVar.getEditText());
        }
        vhVar.k(true);
        this.N2.k(true);
        sh shVar2 = this.f39729v3;
        sh shVar3 = this.F2;
        if (z10) {
            if (!this.I1) {
                shVar.setVisibility(0);
            }
            shVar3.setVisibility(0);
        } else if (this.Q2) {
            shVar2.setVisibility(0);
        }
        ki kiVar2 = this.f39732w2;
        if ((kiVar2 == this.f39670e2 || kiVar2 == this.f39690l2) && this.X1) {
            z13 = true;
        } else {
            z13 = false;
        }
        v7 v7Var2 = this.V2;
        ai.k0 k0Var = this.M2;
        kg.j jVar = this.A2;
        ai aiVar = this.G2;
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
            arrayList.add(ObjectAnimator.ofFloat(shVar, property, f20));
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
            arrayList.add(ObjectAnimator.ofFloat(k0Var, property, f22));
            Property property2 = View.SCALE_X;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(shVar3, property2, f23));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(shVar3, property3, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(shVar3, property, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar, property2, f26));
            if (z10) {
                f27 = 1.0f;
            } else {
                f27 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar, property3, f27));
            if (v7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(shVar, property4, L2));
            } else if (this.Q2) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f28 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(shVar2, property5, f28));
                if (z10) {
                    f29 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(shVar2, property, f29));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ch(this, 5));
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
            shVar.setAlpha(f10);
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
            shVar3.setScaleX(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            shVar3.setScaleY(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = f12;
            }
            shVar3.setAlpha(f15);
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
            aiVar.setScaleX(f17);
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            aiVar.setScaleY(f18);
            if (v7Var2.getTag() != null) {
                if (z10) {
                    L = f12;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                shVar.setTranslationY(L);
            } else if (this.Q2 && ((kiVar = this.f39732w2) == null || kiVar.N())) {
                if (z10) {
                    f19 = org.telegram.messenger.g0.L(84.0f);
                } else {
                    f19 = f12;
                }
                shVar2.setTranslationY(f19);
            }
            if (!z10) {
                shVar.setVisibility(4);
                shVar3.setVisibility(4);
            }
            if (z13) {
                R1();
            }
        }
        if (z10) {
            i7 = Math.max(1, this.f39732w2.getSelectedItemsCount());
        }
        aiVar.e(i7, z11);
        if (this.F3 != null) {
            P1 = 0;
        } else {
            P1 = org.telegram.messenger.mp.u1(this.H3).P1(c1());
        }
        aiVar.i(Y0() + this.f39732w2.getSelectedItemsCount(), P1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), aiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            vhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(ki kiVar) {
        long j3 = this.U2;
        sn snVar = this.O1;
        if (kiVar == snVar) {
            j3 = snVar.f39790s;
        } else if (kiVar == this.f39670e2) {
            j3 = 1;
        } else if (kiVar == this.f39676g2) {
            j3 = 3;
        } else if (kiVar == this.f39687k2) {
            j3 = 4;
        } else if (kiVar == this.f39673f2) {
            j3 = 5;
        } else if (kiVar == this.f39685j2) {
            j3 = 6;
        } else if (kiVar == this.f39679h2) {
            j3 = 9;
        } else if (kiVar == this.f39694m2) {
            j3 = 10;
        } else if (kiVar == this.f39697n2) {
            j3 = 11;
        } else if (kiVar == this.f39682i2) {
            j3 = 12;
        } else if (kiVar == this.f39701o2) {
            j3 = 14;
        } else if (kiVar == this.f39704p2) {
            j3 = 13;
        } else if (kiVar == this.f39708q2) {
            j3 = 16;
        } else if (kiVar == this.f39712r2) {
            j3 = 17;
        }
        H1(kiVar, j3, true);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ki kiVar;
        int i10;
        if (i7 == 0) {
            V0();
            S0();
            return;
        }
        int i11 = 1;
        if (i7 == 2) {
            S0();
            rn rnVar = this.f39679h2;
            if (rnVar != null && ((kiVar = this.f39736x2) == rnVar || this.f39732w2 == rnVar)) {
                if (kiVar == rnVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                Q1(i10);
            }
            rn rnVar2 = this.f39682i2;
            if (rnVar2 != null) {
                ki kiVar2 = this.f39736x2;
                if (kiVar2 == rnVar2 || this.f39732w2 == rnVar2) {
                    if (kiVar2 != rnVar2) {
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
            ai aiVar = this.G2;
            if (aiVar != null) {
                aiVar.setEphemeralFactor(f10);
                aiVar.setSameWidthFactor(f10);
            }
        }
    }

    @Override
    public final boolean H0() {
        ki kiVar = this.f39732w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
        if (kiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f32786j1) {
            return true;
        }
        return false;
    }

    public final void H1(ki kiVar, long j3, boolean z10) {
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
        if (this.f39713r3 == null && this.K2 == null) {
            ki kiVar2 = this.f39732w2;
            if (kiVar2 == kiVar) {
                kiVar2.K();
            } else if (kiVar == this.f39682i2 && !org.telegram.messenger.j10.i(this.H3).q()) {
                new ug.z0(this.f39659a2, 39, false).show();
            } else {
                int i12 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f39707q1.a(z11, z10);
                this.f39715s1.f(Long.valueOf(j3), z10);
                this.B3 = false;
                this.f39745z3 = false;
                this.D3 = 0.0f;
                this.C3.setVisibility(8);
                RadialProgressView radialProgressView = this.A3;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                sh shVar = this.f39729v3;
                shVar.setAlpha(1.0f);
                shVar.setTranslationY(this.D3);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f39728v2;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((ki.t3) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.U2 = j3;
                th thVar = this.f39733w3;
                int childCount = thVar.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = thVar.getChildAt(i14);
                    if (childAt instanceof mi) {
                        mi miVar = (mi) childAt;
                        i11 = childCount;
                        f10 = valueOf;
                        if (miVar.f37515b == miVar.f37516c.U2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        miVar.f37793a.f(z13, true);
                    } else {
                        f10 = valueOf;
                        i11 = childCount;
                        if (childAt instanceof li) {
                            ((li) childAt).a(true);
                        }
                    }
                    i14++;
                    childCount = i11;
                    valueOf = f10;
                }
                Float f11 = valueOf;
                int firstOffset = (this.f39732w2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Z3[0];
                this.f39736x2 = kiVar;
                T0(kiVar);
                if (this.f39736x2.j() != 0) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                v7 v7Var = this.V2;
                v7Var.setVisibility(i7);
                if (v7Var.f29086o0) {
                    v7Var.o(true);
                }
                this.f39732w2.u();
                ki kiVar3 = this.f39736x2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
                if (kiVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f39736x2.I(this.f39732w2);
                this.f39736x2.setVisibility(0);
                if (kiVar.getParent() != null) {
                    this.f30190b.removeView(this.f39736x2);
                }
                int indexOfChild = this.f30190b.indexOfChild(this.f39732w2);
                if (this.f39736x2.getParent() != this.f30190b) {
                    t1(this.f39736x2);
                    ViewGroup viewGroup = this.f30190b;
                    ki kiVar4 = this.f39736x2;
                    if (kiVar4 != this.f39685j2) {
                        indexOfChild++;
                    }
                    viewGroup.addView(kiVar4, indexOfChild, c8.ma.c(-1.0f, -1));
                }
                eh ehVar = new eh(this, 5);
                ki kiVar5 = this.f39732w2;
                boolean z14 = kiVar5 instanceof pm;
                di diVar = this.Z1;
                if (!z14 && !(this.f39736x2 instanceof pm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f39736x2.setAlpha(0.0f);
                        this.f39736x2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f39732w2, View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f39732w2, diVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(v7Var, View.ALPHA, v7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(lr.f37208f);
                        animatorSet.addListener(new di.a4(this, firstOffset, ehVar, 1));
                        this.f39713r3 = animatorSet;
                        ki kiVar6 = this.f39732w2;
                        diVar.getClass();
                        diVar.a(kiVar6, f11);
                        animatorSet.start();
                    } else {
                        kiVar5.setAlpha(0.0f);
                        ehVar.run();
                        Q1(0);
                        this.f30190b.invalidate();
                    }
                } else {
                    int max = Math.max(this.f39736x2.getWidth(), this.f39732w2.getWidth());
                    ki kiVar7 = this.f39736x2;
                    if (kiVar7 instanceof pm) {
                        kiVar7.setTranslationX(max);
                        ki kiVar8 = this.f39732w2;
                        if ((kiVar8 instanceof ChatAttachAlertPhotoLayout) && (emVar2 = ((ChatAttachAlertPhotoLayout) kiVar8).Q) != null) {
                            emVar2.setVisibility(4);
                        }
                    } else {
                        this.f39732w2.setTranslationX(-max);
                        ki kiVar9 = this.f39736x2;
                        if (kiVar9 == chatAttachAlertPhotoLayout && (emVar = ((ChatAttachAlertPhotoLayout) kiVar9).Q) != null) {
                            emVar.setVisibility(0);
                        }
                    }
                    this.f39736x2.setAlpha(1.0f);
                    this.f39732w2.setAlpha(1.0f);
                    if (z10) {
                        ki kiVar10 = this.f39732w2;
                        diVar.getClass();
                        diVar.a(kiVar10, f11);
                        org.telegram.messenger.g0.g3(new k7(this, kiVar, ehVar, 5));
                    } else {
                        if (this.f39736x2.getCurrentItemTop() <= kiVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f39732w2.v(1.0f);
                        this.f39736x2.v(1.0f);
                        this.f39732w2.m(this.f39686j4);
                        this.f39736x2.m(this.f39686j4);
                        this.f30190b.invalidate();
                        this.Y0.g();
                        ki kiVar11 = this.f39732w2;
                        Float valueOf2 = Float.valueOf(1.0f);
                        diVar.getClass();
                        diVar.a(kiVar11, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        v7Var.setTag(num);
                        ehVar.run();
                    }
                }
                if (this.f39689k4 && !(kiVar instanceof ki.t3)) {
                    i10 = 0;
                    this.f39689k4 = false;
                    v7Var.updateColors();
                    v7Var.invalidate();
                    j1();
                } else {
                    i10 = 0;
                }
                if (i12 != 0 && j3 != 6 && j3 != 17 && !(kiVar instanceof ki.t3)) {
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
        return this.f39732w2.b();
    }

    public final void I1(boolean z10, Boolean bool) {
        si siVar;
        if (this.f39679h2 == null) {
            siVar = this;
            rn rnVar = new rn(siVar, getContext(), false, this.J0, bool);
            siVar.f39679h2 = rnVar;
            siVar.f39724u2[1] = rnVar;
            rnVar.setDelegate(new bh(this, 17));
        } else {
            siVar = this;
        }
        H1(siVar.f39679h2, 9L, z10);
    }

    public final void J1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f10;
        float f11;
        ki kiVar;
        float f12;
        float f13;
        float f14;
        int i7;
        boolean z13;
        this.f39700o1.a(z10, z11);
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
            if (!this.A1 && !this.R2 && ((this.O2 != 0 || !this.f39702o3) && this.f39732w2 == this.f39670e2 && (this.J3 || this.K3))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f39732w2 == this.O1) {
                z12 = false;
            }
            sh shVar = this.f39729v3;
            org.telegram.ui.ActionBar.r0 r0Var = this.Y2;
            if (z10) {
                if (z12) {
                    r0Var.setVisibility(0);
                    r0Var.setClickable(true);
                }
            } else if (this.Q2 && this.B2.getTag() == null) {
                shVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
            if (h2Var != null) {
                if (z10) {
                    if (this.f39675f4) {
                        i7 = org.telegram.ui.ActionBar.n6.f29533kh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29467h5;
                    }
                    if (i0.a.h(org.telegram.ui.ActionBar.n6.w0(i7, this.J0)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.messenger.g0.p3(this, z13);
                } else {
                    org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
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
                ofFloat.addUpdateListener(new ch(this, 4));
                arrayList.add(ofFloat);
                if (z12) {
                    if (z10) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property, f16));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property2, f14));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property3, f15));
                }
                this.W2.playTogether(arrayList);
                this.W2.addListener(new org.telegram.ui.on(3, this, z10));
                this.W2.setInterpolator(lr.h);
                this.W2.setDuration(380L);
                this.W2.start();
                return;
            }
            if (z10 && this.Q2 && ((kiVar = this.f39732w2) == null || kiVar.N())) {
                shVar.setVisibility(4);
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
                r0Var.setAlpha(f16);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                r0Var.setScaleX(f11);
                if (z10) {
                    f15 = 1.0f;
                }
                r0Var.setScaleY(f15);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.r0 r0Var2 = this.f39666c3;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(4);
                }
                if (this.O2 != 0 || !this.f39702o3) {
                    r0Var.setVisibility(4);
                }
            }
        }
    }

    @Override
    public final void K() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.f39699n4;
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
        vh vhVar = this.C2;
        vhVar.getLocationOnScreen(iArr);
        if (this.C4 != null) {
            ki kiVar = this.f39732w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
            if ((kiVar == chatAttachAlertPhotoLayout || kiVar == this.f39690l2) && this.X1) {
                ai.k0 k0Var = this.M2;
                alpha = (k0Var.getAlpha() * k0Var.getMeasuredHeight()) + (k0Var.getY() - this.C4.getTop());
            } else {
                alpha = -vhVar.getHeight();
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
        qi qiVar = this.X3;
        if (qiVar != null) {
            qiVar.f0(new eh(this, 4));
        } else {
            u1();
        }
    }

    public final void L1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.L1(int):void");
    }

    @Override
    public final void M(int i7) {
        super.M(i7);
        this.f39732w2.r(i7);
    }

    public final void M1() {
        boolean i7;
        float f10;
        float f11;
        float f12;
        ki kiVar = this.f39732w2;
        int i10 = 0;
        if (kiVar == null) {
            i7 = false;
        } else {
            i7 = kiVar.i();
        }
        gi.j jVar = this.f39668d3;
        jVar.setEnabled(i7);
        ki kiVar2 = this.f39732w2;
        float f13 = 0.5f;
        if (kiVar2 != null) {
            if (kiVar2.i()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f39736x2 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.Y1;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        ki kiVar3 = this.f39736x2;
        if (kiVar3 != null) {
            if (kiVar3.i()) {
                f13 = 1.0f;
            }
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.Y1, f13, f10);
        }
        this.f39671e3 = f10;
        if (jVar != null) {
            float f14 = f10 * this.f39674f3;
            jVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            jVar.setVisibility(i10);
        }
    }

    public final void N0() {
        if (b1().f41786a.length() <= 0) {
            return;
        }
        this.f39732w2.a(b1().getText());
    }

    public final void N1(ki kiVar, int i7) {
        boolean z10;
        int i10;
        int i11;
        if (kiVar != null) {
            dh.g gVar = this.D4;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                gVar.f(0.0f, i7);
            }
            int currentItemTop = kiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (kiVar == this.f39732w2 && currentItemTop <= kiVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.M1 = z10;
                if (kiVar == this.f39732w2) {
                    J1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kiVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int i12 = org.telegram.ui.Cells.c0.i(11.0f, i10, currentItemTop);
                ki kiVar2 = this.f39732w2;
                if (kiVar2 == kiVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((kiVar2 instanceof pm) || (this.f39736x2 instanceof pm)) {
                    Object obj = this.f39713r3;
                    if ((obj instanceof r1.g) && ((r1.g) obj).f56317f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.Z3;
                int i13 = iArr[i11];
                if (i13 == i12 && !z11) {
                    if (i7 != 0) {
                        this.f39661a4 = i13;
                        return;
                    }
                    return;
                }
                this.f39661a4 = i13;
                iArr[i11] = i12;
                Q1(i11);
                this.f30190b.invalidate();
            }
        }
    }

    public final boolean O0() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).Z6()) {
            return true;
        }
        return false;
    }

    public final void O1(boolean z10) {
        hi.v vVar;
        boolean z11;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
        if (chatAttachAlertPhotoLayout != null && (vVar = this.Z2) != null) {
            int i7 = 0;
            if (this.f39702o3 && this.d2 && this.f39732w2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.V();
            vVar.f15554f = z12;
            if (!z10) {
                ((c6) vVar.f15555g).a(z12);
            }
            vVar.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.r0 r0Var = this.f39660a3;
            if (z10 && this.f39702o3) {
                r0Var.setVisibility(0);
                ViewPropertyAnimator animate = r0Var.animate();
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
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(lr.h).withEndAction(new nh(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i7 = 8;
            }
            r0Var.setVisibility(i7);
            if (z11) {
                f12 = 1.0f;
            }
            r0Var.setAlpha(f12);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            r0Var.setScaleX(f10);
            if (z11) {
                f13 = 1.0f;
            }
            r0Var.setScaleY(f13);
        }
    }

    public final boolean P0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            return ChatActivityEnterView.N(this.H3, ((org.telegram.ui.bn) h2Var).a(), h2Var, charSequence);
        }
        return false;
    }

    public final void P1(boolean z10) {
        boolean z11;
        float f10;
        ki kiVar = this.f39670e2;
        if (z10) {
            if (!this.H1) {
                return;
            }
            if (this.f39690l2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.i6 i6Var = this.f39719t1;
                if (i6Var == null) {
                    i6Var = this.J0;
                }
                ?? kiVar2 = new ki(context, i6Var, this);
                kiVar2.E = 0.0f;
                kiVar2.F = 0.0f;
                kiVar2.G = 0.0f;
                kiVar2.H = 0.0f;
                kiVar2.I = 0.0f;
                kiVar2.J = 0.0f;
                kiVar2.K = null;
                kiVar2.L = false;
                kiVar2.N = 0.0f;
                kiVar2.R = false;
                kiVar2.T = false;
                Point point = org.telegram.messenger.g0.f24118q;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kiVar2.U = z11;
                kiVar2.f38486n = i6Var;
                kiVar2.f36769f = true;
                kiVar2.setWillNotDraw(false);
                si siVar = kiVar2.f36766b;
                org.telegram.ui.ActionBar.z t6 = siVar.V2.t();
                TextView textView = new TextView(context);
                kiVar2.f38491y = textView;
                org.telegram.ui.ActionBar.i6 i6Var2 = kiVar2.f36765a;
                hi.v2 v2Var = new hi.v2(kiVar2, context, t6, i6Var2, 2);
                v7 v7Var = siVar.V2;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                v7Var.addView(v2Var, 0, c8.ma.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, i6Var2);
                textView.setText(org.telegram.messenger.gd.M0(2131753956, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                v2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                di.b1 b1Var = new di.b1(kiVar2, context, i6Var2, 17);
                kiVar2.f38487r = b1Var;
                b1Var.setAdapter(new org.telegram.ui.y7(kiVar2, 3));
                v4.c0 c0Var = new v4.c0(1, false);
                kiVar2.f38488s = c0Var;
                b1Var.setLayoutManager(c0Var);
                b1Var.setClipChildren(false);
                b1Var.setClipToPadding(false);
                b1Var.setOverScrollMode(2);
                b1Var.setVerticalScrollBarEnabled(false);
                om omVar = new om(kiVar2, context);
                kiVar2.f38489w = omVar;
                omVar.setClipToPadding(true);
                omVar.setClipChildren(true);
                kiVar2.addView(b1Var, c8.ma.c(-1.0f, -1));
                kiVar2.Q = siVar.f39670e2;
                omVar.f38126c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar2.Q;
                omVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                omVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                omVar.c();
                UndoView undoView = new UndoView(context, null, false, siVar.f39719t1);
                kiVar2.f38490x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                kiVar2.addView(undoView, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                kiVar2.O = context.getResources().getDrawable(2131232551);
                this.f39690l2 = kiVar2;
                kiVar2.bringToFront();
            }
            ki kiVar3 = this.f39732w2;
            pm pmVar = this.f39690l2;
            if (kiVar3 != pmVar) {
                kiVar = pmVar;
            }
            G1(kiVar);
            return;
        }
        G1(kiVar);
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
        th thVar = this.f39733w3;
        if (thVar == null) {
            return;
        }
        int childCount = thVar.getChildCount();
        boolean z11 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            thVar.getChildAt(i17);
        }
        boolean z12 = this.f39675f4;
        if (z12) {
            i7 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29502j5;
        }
        org.telegram.ui.ActionBar.u6.U(this.f39680h3, i7, this.J0);
        if (z12) {
            i10 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29502j5;
        }
        org.telegram.ui.ActionBar.u6.U(this.f39695m3, i10, this.J0);
        org.telegram.ui.ActionBar.u6.U(this.f39668d3, org.telegram.ui.ActionBar.n6.Ji, this.J0);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29502j5;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        if (this.f39714r4 && w02 == this.f39710q4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f39714r4 = true;
        this.f39710q4 = w02;
        org.telegram.ui.ActionBar.r0 r0Var = this.Y2;
        if (z10) {
            r0Var.setIconColor(w02);
        }
        Drawable background = r0Var.getBackground();
        if (z12) {
            i12 = org.telegram.ui.ActionBar.n6.Zg;
        } else {
            i12 = org.telegram.ui.ActionBar.n6.I5;
        }
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), background);
        int i18 = org.telegram.ui.ActionBar.n6.E8;
        r0Var.P(org.telegram.ui.ActionBar.n6.w0(i18, this.J0), false);
        r0Var.P(org.telegram.ui.ActionBar.n6.w0(i18, this.J0), true);
        r0Var.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.J0));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f39660a3;
        if (r0Var2 != null && z10) {
            r0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.f39666c3;
        if (r0Var3 != null) {
            if (z10) {
                r0Var3.setIconColor(w02);
            }
            Drawable background2 = r0Var3.getBackground();
            if (z12) {
                i16 = org.telegram.ui.ActionBar.n6.Zg;
            } else {
                i16 = org.telegram.ui.ActionBar.n6.I5;
            }
            org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i16, this.J0), background2);
        }
        vh vhVar = this.C2;
        org.telegram.ui.ActionBar.i6 i6Var = vhVar.N;
        rt rtVar = vhVar.f41786a;
        int i19 = vhVar.M;
        if (i19 == 0) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, i6Var));
            int i20 = org.telegram.ui.ActionBar.n6.G6;
            rtVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i20, i6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(i20, i6Var));
        } else if (i19 != 2 && i19 != 3) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29690t5, i6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29502j5, i6Var));
        } else {
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.E = -1;
        }
        vhVar.f41788c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Oe, i6Var), PorterDuff.Mode.MULTIPLY));
        st stVar = vhVar.d;
        if (stVar != null) {
            stVar.updateColors();
        }
        org.telegram.ui.ActionBar.u6.l(thVar, 21, org.telegram.ui.ActionBar.n6.A5, this.J0);
        if (z12) {
            i13 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i13 = org.telegram.ui.ActionBar.n6.f29502j5;
        }
        org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
        v7 v7Var = this.V2;
        org.telegram.ui.ActionBar.u6.l(v7Var, 1, i13, i6Var2);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.n6.Zg;
        } else {
            i14 = org.telegram.ui.ActionBar.n6.I5;
        }
        org.telegram.ui.ActionBar.u6.l(v7Var, 3, i14, this.J0);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.n6.Yg;
        } else {
            i15 = org.telegram.ui.ActionBar.n6.f29502j5;
        }
        org.telegram.ui.ActionBar.u6.l(v7Var, 5, i15, this.J0);
        int e12 = e1(false);
        org.telegram.ui.ActionBar.n6.C1(e12, this.f30223s0);
        ui.c cVar = this.E4;
        if (cVar.f58999b != e12) {
            cVar.a(e12);
            lh.f fVar = this.f39721t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            uh uhVar = this.f39725u3;
            if (uhVar != null) {
                uhVar.invalidate();
            }
        }
        this.f30190b.invalidate();
        int i21 = 0;
        while (true) {
            ki[] kiVarArr = this.f39724u2;
            if (i21 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i21];
            if (kiVar != null) {
                kiVar.d();
            }
            i21++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29485i5, this.J0);
            org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z11 = true;
            }
            org.telegram.messenger.g0.m3(this, z11);
            return;
        }
        Q(org.telegram.ui.ActionBar.n6.f29467h5);
    }

    public final void Q1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.Q1(int):void");
    }

    public final void R0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.R0(boolean):void");
    }

    public final void R1() {
        int i7 = 0;
        Q1(0);
        this.f39705p3.invalidate();
        ai.k0 k0Var = this.M2;
        k0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
        if (chatAttachAlertPhotoLayout != null) {
            xl xlVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.Y();
            if (xlVar != null && xlVar.getFastScroll() != null) {
                hj0 fastScroll = xlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f32798q1;
                if (this.X1) {
                    i7 = (int) (k0Var.getAlpha() * k0Var.getMeasuredHeight());
                }
                fastScroll.f35905i0 = currentActionBarHeight + i7;
                xlVar.getFastScroll().invalidate();
            }
        }
        K1();
        V0();
    }

    public final void S0() {
        float f10 = this.n1.f57657e;
        float f11 = (1.0f - this.f39693m1.f57657e) * f10;
        this.f39725u3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.f39700o1.f57657e))), 1.0f - f11));
    }

    public final void T0(ki kiVar) {
        int L;
        boolean e10 = kiVar.e();
        int i7 = 0;
        lh.f fVar = this.f39721t3;
        if (fVar != null) {
            if (e10) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            fVar.setFadeHeightBottom(L);
        }
        uh uhVar = this.f39725u3;
        if (uhVar != null) {
            if (e10) {
                i7 = 4;
            }
            uhVar.setVisibility(i7);
        }
    }

    public final void U0() {
        float f10;
        float f11 = this.f39703p1.f57657e;
        float f12 = this.f39707q1.f57657e;
        float a10 = a8.m7.a(this.f39711r1.f57657e);
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
            ki[] kiVarArr = this.f39724u2;
            if (i7 < kiVarArr.length) {
                ki kiVar = kiVarArr[i7];
                if (kiVar != null && (themeDescriptions = kiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i7++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f30193c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29485i5));
                return arrayList;
            }
        }
    }

    public final void V0() {
        ai aiVar = this.G2;
        sh shVar = this.F2;
        ai.k0 k0Var = this.M2;
        if (k0Var != null && k0Var.getVisibility() == 0 && k0Var.getAlpha() != 0.0f) {
            float f10 = this.f39693m1.f57657e;
            float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
            aiVar.setAlpha(abs * abs * abs * abs);
            shVar.setTranslationY(org.telegram.messenger.g0.T1(this.f39672e4, ((k0Var.getTranslationY() + k0Var.getTop()) - shVar.getTop()) + org.telegram.messenger.g0.L(8.0f), lr.f37211j.getInterpolation(f10)));
            return;
        }
        shVar.setTranslationY(this.f39672e4);
        aiVar.setAlpha(1.0f);
    }

    public final void W0(int i7) {
        this.Q2 = true;
        this.f39729v3.setVisibility(0);
        this.C1 = true;
        this.D1 = i7;
        this.O2 = 0;
        this.A1 = false;
        this.B1 = false;
        this.E1 = null;
        org.telegram.ui.ActionBar.r0 r0Var = this.f39683i3;
        if (r0Var != null) {
            this.f39680h3.setTranslationY(0.0f);
            r0Var.setVisibility(8);
        }
    }

    public final void X0(hi.e7 e7Var) {
        String M0 = org.telegram.messenger.gd.M0(2131752111, null);
        TextView textView = this.f39680h3;
        textView.setText(M0);
        this.Q2 = false;
        this.f39729v3.setVisibility(8);
        this.O2 = 1;
        this.A1 = true;
        this.B1 = true;
        this.d2 = false;
        this.E1 = e7Var;
        org.telegram.ui.ActionBar.r0 r0Var = this.f39683i3;
        if (r0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            r0Var.setVisibility(0);
            r0Var.setClickable(true);
            r0Var.setAlpha(1.0f);
            r0Var.setScaleX(1.0f);
            r0Var.setScaleY(1.0f);
        }
    }

    public final int Y0() {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.hj hjVar;
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (!(h2Var instanceof org.telegram.ui.bn) || (jjVar = ((org.telegram.ui.bn) h2Var).f46228x5) == null || (hjVar = jjVar.f24865b) == null) {
            return 0;
        }
        return hjVar.f24457g.size();
    }

    public final TLRPC.Chat Z0() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) h2Var).f45978e;
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
        sh shVar = this.B2;
        float alpha = 1.0f - shVar.getAlpha();
        return shVar.getMeasuredHeight() - (alpha * (shVar.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    public final wt b1() {
        ki kiVar;
        if (this.X1 && ((kiVar = this.f39732w2) == this.f39670e2 || kiVar == this.f39690l2)) {
            return this.N2;
        }
        return this.C2;
    }

    public final long c1() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) h2Var).a();
        }
        return this.U1;
    }

    public final int d1(int i7) {
        ki kiVar = this.f39736x2;
        int[] iArr = this.Z3;
        if (kiVar != null && ((this.f39732w2 instanceof pm) || (kiVar instanceof pm))) {
            return org.telegram.messenger.g0.W1(this.Y1, iArr[0], iArr[1]);
        }
        return iArr[i7];
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.T0 && i7 != org.telegram.messenger.ks.Z4 && i7 != org.telegram.messenger.ks.F1) {
            if (i7 == org.telegram.messenger.ks.f25133i5) {
                this.F1 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).J0();
                return;
            }
            return;
        }
        pi piVar = this.f39741y3;
        if (piVar != null) {
            piVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z10;
        xh xhVar;
        vh vhVar;
        if (!this.f39732w2.q() && !this.J) {
            ki kiVar = this.f39732w2;
            xk xkVar = this.f39712r2;
            if (kiVar == xkVar && xkVar != null && !xkVar.L && xkVar.Q0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39716s2 = z10;
            if (!z10 && (vhVar = this.C2) != null) {
                org.telegram.messenger.g0.v1(vhVar.getEditText());
            }
            if (!this.f39716s2 && (xhVar = this.N2) != null) {
                org.telegram.messenger.g0.v1(xhVar.getEditText());
            }
            this.f39728v2.clear();
            org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
            if (h2Var == null) {
                h2Var = LaunchActivity.Q();
            }
            if (!this.B4 && h2Var != null && this.f39732w2.getSelectedItemsCount() > 0 && !this.A1) {
                if (!this.A4) {
                    this.A4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), this.J0);
                    String M0 = org.telegram.messenger.gd.M0(2131751388, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131751389, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751395, null), new bh(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    u1Var.setOnCancelListener(new hh(this, 0));
                    u1Var.O = new y0(this, 3);
                    u1Var.show();
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = 0;
            while (true) {
                ki[] kiVarArr = this.f39724u2;
                if (i7 >= kiVarArr.length) {
                    break;
                }
                ki kiVar2 = kiVarArr[i7];
                if (kiVar2 != null && this.f39732w2 != kiVar2) {
                    kiVar2.q();
                }
                i7++;
            }
            org.telegram.messenger.g0.s3(this, i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29337a7, this.J0), 0), true, new bh(this, 11));
            if (h2Var != null) {
                org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
            }
            this.f39678g4 = false;
            super.dismiss();
            this.B4 = false;
        }
    }

    public final int e1(boolean z10) {
        boolean q10;
        int i7;
        v7 v7Var;
        if (this.f39675f4) {
            return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29533kh, this.J0);
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        if (i6Var != null) {
            q10 = i6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        Iterator it = this.f39715s1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.f57666a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = c8.l9.a(f10, 0.0f, 1.0f);
        if (z10 && (v7Var = this.V2) != null && v7Var.getVisibility() == 0) {
            a10 *= 1.0f - v7Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.J0);
        if (q10) {
            i7 = org.telegram.ui.ActionBar.n6.f29337a7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29485i5;
        }
        return i0.a.f(a10, w02, org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f39732w2.o(motionEvent);
    }

    public final void f1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.f1():void");
    }

    public final boolean g1() {
        if (this.X1) {
            ki kiVar = this.f39732w2;
            if (kiVar == this.f39670e2 || kiVar == this.f39690l2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        qi qiVar = this.X3;
        if (qiVar != null && !this.f39717s3) {
            boolean g02 = qiVar.g0();
            this.f39717s3 = true;
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
        final xk xkVar = this.f39712r2;
        if (xkVar != null && this.f39732w2 == xkVar) {
            final eh ehVar = new eh(this, 1);
            int i7 = xkVar.f42118n;
            org.telegram.ui.Wallet.ca caVar = xkVar.S;
            si siVar = xkVar.f36766b;
            AnimatorSet animatorSet = null;
            if (!xkVar.L && (wallettransaction = xkVar.Q0) != null && xkVar.R0 == null && xkVar.S0 == null) {
                if (xkVar.T0) {
                    org.telegram.ui.Wallet.n6 n6Var = new org.telegram.ui.Wallet.n6();
                    n6Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                    if (h2Var != null && h2Var.presentFragment(n6Var, false, true)) {
                        org.telegram.ui.Wallet.ra raVar = new org.telegram.ui.Wallet.ra(siVar.f30193c, siVar.f30190b, caVar.getDiamondView(), n6Var, xkVar.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!xkVar.L) {
                                            ehVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!xkVar.L) {
                                            ehVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, siVar);
                        xkVar.S0 = raVar;
                        animatorSet = raVar.f44955m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.m7 diamondView = caVar.getDiamondView();
                    if (diamondView.f44577f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar.f39659a2;
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var2;
                            if (bnVar.getCurrentAccount() == i7 && bnVar.a() == xkVar.f42123r.f28552id && bnVar.f46009g4 == 0 && bnVar.getFragmentView() != null && bnVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.e7 e7Var = new org.telegram.ui.Wallet.e7(siVar.f30193c, siVar.f30190b, caVar.getDiamondView(), bnVar, xkVar.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!xkVar.L) {
                                                    ehVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!xkVar.L) {
                                                    ehVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, siVar);
                                xkVar.R0 = e7Var;
                                animatorSet = e7Var.f44124m;
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
        if (this.f30223s0 != null && this.f30190b != null) {
            int e12 = e1(false);
            org.telegram.ui.ActionBar.n6.C1(e12, this.f30223s0);
            ui.c cVar = this.E4;
            if (cVar.f58999b != e12) {
                cVar.a(e12);
                lh.f fVar = this.f39721t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                uh uhVar = this.f39725u3;
                if (uhVar != null) {
                    uhVar.invalidate();
                }
            }
            M1();
            this.f30190b.invalidate();
        }
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        boolean z10;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
        c81 c81Var = chatAttachAlertPhotoLayout.m0;
        bi.a3 a3Var = chatAttachAlertPhotoLayout.f32787k0;
        TextView textView = chatAttachAlertPhotoLayout.f32797q0;
        xl xlVar = chatAttachAlertPhotoLayout.f32799r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = org.telegram.messenger.g0.f24113n;
        if (view == a3Var) {
            if (z10) {
                if (xlVar.getVisibility() == 0) {
                    a3Var.layout(0, org.telegram.messenger.f3.z(222.0f, i12, i15), i13, org.telegram.messenger.f3.z(96.0f, i12, i15));
                    return true;
                }
                a3Var.layout(0, org.telegram.messenger.f3.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (xlVar.getVisibility() == 0) {
                a3Var.layout(org.telegram.messenger.f3.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            } else {
                a3Var.layout(org.telegram.messenger.f3.z(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == c81Var) {
            if (z10) {
                if (xlVar.getVisibility() == 0) {
                    c81Var.layout(0, org.telegram.messenger.f3.z(310.0f, i12, i15), i13, org.telegram.messenger.f3.z(260.0f, i12, i15));
                    return true;
                }
                c81Var.layout(0, org.telegram.messenger.f3.z(176.0f, i12, i15), i13, org.telegram.messenger.f3.z(126.0f, i12, i15));
                return true;
            } else if (xlVar.getVisibility() == 0) {
                c81Var.layout(org.telegram.messenger.f3.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            } else {
                c81Var.layout(org.telegram.messenger.f3.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
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
            ki[] kiVarArr = this.f39724u2;
            if (i7 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null) {
                kiVar.p();
            }
            i7++;
        }
        int i10 = this.H3;
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.T0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.Z4);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25133i5);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.F1);
        this.Q1 = true;
        vh vhVar = this.C2;
        if (vhVar != null) {
            vhVar.o();
        }
        xh xhVar = this.N2;
        if (xhVar != null) {
            xhVar.o();
        }
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39670e2;
        hm hmVar = chatAttachAlertPhotoLayout.f32806w;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        xl xlVar = chatAttachAlertPhotoLayout.f32799r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.f32801s;
        if (i7 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.f32771c0 && !chatAttachAlertPhotoLayout.f32775e0) {
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(siVar.U() + siVar.T() + i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            bi.a3 a3Var = chatAttachAlertPhotoLayout.f32787k0;
            if (view == a3Var) {
                if (z10) {
                    a3Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824));
                    return true;
                }
                a3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            c81 c81Var = chatAttachAlertPhotoLayout.m0;
            if (view == c81Var) {
                if (z10) {
                    c81Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                    return true;
                }
                c81Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == xlVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    xlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
                    if (b0Var.f59075o != 0) {
                        xlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        hmVar.f();
                    }
                } else {
                    xlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (b0Var.f59075o != 1) {
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
            q10 = org.telegram.messenger.o10.q(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ri.d0(this.H3).f26599b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.f28552id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.gd.a0("BotRemoveFromMenu", null, 2131752991, q10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.gd.M0(2131752990, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.gd.a0("BotRemoveInlineFromMenu", null, 2131752989, q10);
        }
        u1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, "OK"), new a3.h(this, tL_attachMenuBot, user, 25));
        i5.c.y("Cancel", 2131752578, alertDialog$Builder, null);
    }

    @Override
    public final boolean m0() {
        int i7;
        this.f39670e2.setTranslationX(0.0f);
        this.f39691l3.setAlpha(0.0f);
        this.j3.setAlpha(1.0f);
        this.f30190b.setTranslationY(this.f30190b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.o4 = animatorSet;
        di diVar = this.f39696m4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, diVar, 0.0f, 400.0f));
        this.o4.setDuration(400L);
        this.o4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        diVar.getClass();
        diVar.a(this, valueOf);
        this.o4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new ch(this, 2));
        r1.g gVar = this.f39699n4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.f30190b, (r1.e) r1.g.f56307p, 0.0f);
        this.f39699n4 = gVar2;
        if (this.F3 != null) {
            gVar2.f56323m.a(0.75f);
            this.f39699n4.f56323m.b(350.0f);
        } else {
            gVar2.f56323m.a(0.75f);
            this.f39699n4.f56323m.b(350.0f);
        }
        this.f39699n4.h();
        if (this.K) {
            this.f30193c.setLayerType(2, null);
        }
        this.B0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        o6 o6Var = q6.d;
        if (this.f30218p0) {
            i7 = this.f30219q0;
        } else {
            i7 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, o6Var, i7));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.f30214l0);
        h2.f fVar = new h2.f((int[]) null);
        k7 k7Var = new k7(this, fVar, this.f30233z0, 6);
        this.f39699n4.a(new bi.v0(3, this, k7Var));
        this.A0.addListener(new ah.l(25, this, k7Var));
        fVar.d();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25135j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        A1(0.0f);
        ofFloat2.addUpdateListener(new ch(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(lr.f37208f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        while (true) {
            ki[] kiVarArr = this.f39724u2;
            if (i7 < kiVarArr.length) {
                ki kiVar = kiVarArr[i7];
                if (kiVar != null) {
                    kiVar.A();
                }
                i7++;
            } else {
                this.f39669d4 = true;
                return;
            }
        }
    }

    public final void n1() {
        int i7 = 0;
        this.f39669d4 = false;
        while (true) {
            ki[] kiVarArr = this.f39724u2;
            if (i7 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null) {
                kiVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.X3.g0();
        }
        pi piVar = this.f39741y3;
        if (piVar != null) {
            piVar.f();
        }
    }

    @Override
    public final void o0() {
        if (this.f39732w2.s()) {
            dismiss();
        }
    }

    public final void o1() {
        org.telegram.messenger.fj fjVar = this.F3;
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        int i7 = this.H3;
        if (fjVar != null && fjVar.p5() && !org.telegram.messenger.v3.z(i7, 24, org.telegram.messenger.fj.B0(this.F3.f23965k)) && (h2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            org.telegram.messenger.kj kjVar = bnVar.f46241y5;
            if (kjVar == null) {
                kjVar = org.telegram.messenger.kj.b(this.F3.f23965k.suggested_post);
            }
            if (!di.x8.S(i7, kjVar.f25040a)) {
                bnVar.Ac(kjVar);
                return;
            }
        }
        if (this.F1 - this.G1 < 0) {
            org.telegram.messenger.g0.D3(this.f39723u1);
            org.telegram.messenger.g0.D3(this.f39727v1);
            try {
                this.G2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.mp.u1(i7).K3() && org.telegram.messenger.mp.u1(i7).X4 > this.G1) {
                E1(h2Var);
                return;
            }
            return;
        }
        if (this.F3 == null && (h2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) h2Var;
            if (bnVar2.c()) {
                b5.J(getContext(), bnVar2.a(), new bh(this, 14), this.J0);
                return;
            }
        }
        ki kiVar = this.f39732w2;
        if (kiVar != this.f39670e2 && kiVar != this.f39690l2) {
            if (!kiVar.M(true, 0, 0, this.L2, g1())) {
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
        if (v7Var.f29086o0) {
            v7Var.o(true);
        } else if (this.f39732w2.k()) {
        } else {
            if (b1() != null && b1().f41789e) {
                b1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var != null) {
            org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f39732w2.G(i7)) {
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
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (i7 == 3) {
            if (this.L3 || !O0()) {
                if (h2Var != null) {
                    activity = h2Var.getParentActivity();
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
        } else if (i7 == 6 && org.telegram.messenger.g0.J1(h2Var)) {
            if (this.f39685j2 == null) {
                kl klVar = new kl(this, getContext(), this.J0, (this.C1 || this.P3) ? false : false);
                this.f39685j2 = klVar;
                this.f39724u2[5] = klVar;
                jl jlVar = this.f39726u4;
                if (jlVar != null) {
                    klVar.setDelegate(jlVar);
                } else if (h2Var instanceof org.telegram.ui.bn) {
                    klVar.setDelegate(new bh(this, 18));
                }
            }
            G1(this.f39685j2);
        }
    }

    public final void q1(boolean z10) {
        if (!this.L3 && z10) {
            sn snVar = new sn(3, getContext(), this.J0, this);
            this.O1 = snVar;
            G1(snVar);
        }
        int i7 = 1;
        if (this.f39676g2 == null) {
            cj cjVar = new cj(getContext(), this.J0, this);
            this.f39676g2 = cjVar;
            this.f39724u2[3] = cjVar;
            cjVar.setupBlurredSearchField(this.F4);
            this.f39676g2.setDelegate(new bh(this, 15));
            if (this.C1) {
                this.f39676g2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) h2Var).f45978e;
            cj cjVar2 = this.f39676g2;
            if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                i7 = -1;
            }
            cjVar2.setMaxSelectedFiles(i7);
        }
        if (z10) {
            G1(this.f39676g2);
        }
    }

    public final void r1() {
        boolean z10;
        if (!this.O3) {
            sn snVar = new sn(5, getContext(), this.J0, this);
            this.O1 = snVar;
            G1(snVar);
        }
        if (this.f39673f2 == null) {
            tj tjVar = new tj(getContext(), this.J0, this);
            this.f39673f2 = tjVar;
            this.f39724u2[2] = tjVar;
            tjVar.setupBlurredSearchField(this.F4);
            this.f39673f2.setDelegate(new bi(this));
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) h2Var).f45978e;
            tj tjVar2 = this.f39673f2;
            if (chat != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            tjVar2.setMultipleSelectionAllowed(z10);
        }
        G1(this.f39673f2);
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
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29502j5, this.J0);
            org.telegram.ui.ActionBar.r0 r0Var = this.f39683i3;
            if (r0Var != null && w02 != this.f39706p4) {
                this.f39706p4 = w02;
                r0Var.setIconColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(boolean z10) {
        int i7;
        if (!this.I3 && z10) {
            sn snVar = new sn(4, getContext(), this.J0, this);
            this.O1 = snVar;
            G1(snVar);
        }
        boolean z11 = false;
        if (this.f39687k2 == null) {
            if (this.I1) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            kk kkVar = new kk(i7, getContext(), this.J0, this);
            this.f39687k2 = kkVar;
            this.f39724u2[4] = kkVar;
            kkVar.setDelegate(new ci(this));
        }
        int i10 = 1;
        if (this.C1) {
            this.f39687k2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
            if (h2Var instanceof org.telegram.ui.bn) {
                TLRPC.Chat chat = ((org.telegram.ui.bn) h2Var).f45978e;
                kk kkVar2 = this.f39687k2;
                if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                    i10 = -1;
                }
                kkVar2.setMaxSelectedFiles(i10);
            } else {
                this.f39687k2.setMaxSelectedFiles(this.Q3);
                kk kkVar3 = this.f39687k2;
                if (!this.I1 && !this.R1) {
                    z11 = true;
                }
                kkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        kk kkVar4 = this.f39687k2;
        kkVar4.f36777e0 = this.I1;
        if (z10) {
            G1(kkVar4);
        }
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.G3 = false;
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            this.f30208i0 = ((org.telegram.ui.bn) h2Var).V9();
        }
        M1();
        this.f39709q3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29337a7, this.J0), 0);
            this.H0 = o4;
            org.telegram.messenger.g0.s3(this, o4, false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        }
        if (this.f39689k4) {
            this.f39689k4 = false;
            v7 v7Var = this.V2;
            v7Var.updateColors();
            v7Var.invalidate();
            j1();
        }
    }

    @Override
    public final void u0(boolean z10) {
        this.f30221r0 = true;
    }

    public final void u1() {
        ViewGroup viewGroup = this.f30190b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        v7 v7Var = this.V2;
        int i7 = 1;
        if (v7Var.f29086o0) {
            v7Var.o(true);
        }
        this.f39673f2 = null;
        this.f39697n2 = null;
        this.f39676g2 = null;
        this.f39679h2 = null;
        this.f39682i2 = null;
        this.f39685j2 = null;
        this.f39687k2 = null;
        this.f39712r2 = null;
        while (true) {
            ki[] kiVarArr = this.f39724u2;
            if (i7 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null) {
                kiVar.p();
                this.f30190b.removeView(kiVarArr[i7]);
                kiVarArr[i7] = null;
            }
            i7++;
        }
        J1(false, false);
        super.L();
        if (this.f39716s2) {
            this.f39716s2 = false;
            this.f39720t2 = 0.0f;
            org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
            if (h2Var != null && h2Var.getFragmentView() != null) {
                View fragmentView = h2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f56244a;
                r0.y.c(fragmentView);
            }
        }
    }

    @Override
    public final void v() {
        if (this.f39659a2 instanceof org.telegram.ui.bn) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.f39732w2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.gd.M0(2131754921, "AccDescrAttachButton"));
        this.f39709q3 = true;
        if (!this.K3 && !this.J3) {
            O0();
        }
    }

    public final boolean v1(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        if (this.G3) {
            return false;
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            TLRPC.Chat chat = bnVar.f45978e;
            if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat) && chat.megagroup) || !org.telegram.messenger.v3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.H3).f25658g7.edit();
                edit.putBoolean("silent_" + bnVar.a(), !z10).commit();
            }
        }
        int i11 = 1;
        if (P0(b1().getText())) {
            return true;
        }
        N0();
        if (this.f39711r1.f57658f) {
            this.G3 = true;
            this.X3.y1(7, true, z10, i7, i10, j3, z11, false, 0L);
            return true;
        }
        long c12 = c1();
        ki kiVar = this.f39732w2;
        if (kiVar != null) {
            i11 = kiVar.getSelectedItemsCount();
        }
        return b5.Y(this.H3, c12, Y0() + i11, new org.telegram.messenger.x10() {
            @Override
            public final void a(Object obj) {
                si siVar = si.this;
                siVar.G3 = true;
                siVar.X3.y1(7, true, z10, i7, i10, j3, z11, false, ((Long) obj).longValue());
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
        this.f39693m1.a(z10, z11);
        wt b12 = b1();
        this.X1 = z10;
        wt b13 = b1();
        int i10 = 0;
        if (this.B2.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ki kiVar = this.f39732w2;
        if (kiVar != this.f39670e2 && kiVar != this.f39690l2) {
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
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).setUpdateListener(new ch(this, 0)).withEndAction(new Runnable(this) {
                public final si f34438b;

                {
                    this.f34438b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            si siVar = this.f34438b;
                            if (!z14 || !z12) {
                                siVar.M2.setVisibility(8);
                            }
                            siVar.R1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f34438b.A2.setVisibility(8);
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
            translationY.alpha(f12).setDuration(320L).setInterpolator(lrVar).setUpdateListener(new ch(this, 1)).withEndAction(new Runnable(this) {
                public final si f34438b;

                {
                    this.f34438b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            si siVar = this.f34438b;
                            if (!z14 || !z12) {
                                siVar.M2.setVisibility(8);
                            }
                            siVar.R1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f34438b.A2.setVisibility(8);
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
        org.telegram.messenger.g0.g3(new eh(this, 0));
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(int i7, org.telegram.messenger.fj fjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (fjVar != null && (chatAttachAlertPhotoLayout = this.f39670e2) != null) {
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
        this.f39741y3.f();
        L1(0);
    }

    public final void y1(float f10) {
        int i7;
        float translationY = this.f30190b.getTranslationY() - this.f39720t2;
        this.f39720t2 = this.f30190b.getHeight() * f10;
        this.f30190b.setTranslationY(translationY);
        xk xkVar = this.f39712r2;
        if (xkVar != null) {
            xkVar.setSendTransitionProgress(f10);
        }
        if (this.f30218p0) {
            i7 = Math.round((1.0f - f10) * this.f30219q0);
        } else {
            i7 = 0;
        }
        this.Z.setAlpha(i7);
        this.D0 = 1.0f - f10;
        this.f30193c.invalidate();
    }

    public final void z1(int i7, boolean z10) {
        if (this.F3 != null) {
            return;
        }
        this.Q3 = i7;
        this.R3 = z10;
    }

    public si(Context context, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        float f10;
        TextPaint textPaint;
        te.j jVar;
        boolean z13;
        org.telegram.ui.ActionBar.r0 r0Var;
        gi.j jVar2;
        lr lrVar = lr.h;
        this.f39693m1 = new te.a(0, this, lrVar, 380L, false);
        this.n1 = new te.a(1, this, lrVar, 380L, false);
        this.f39700o1 = new te.a(2, this, lrVar, 380L, false);
        this.f39703p1 = new te.a(3, this, lrVar, 380L, false);
        this.f39707q1 = new te.a(4, this, lrVar, 380L, true);
        this.f39711r1 = new te.a(5, this, lrVar, 320L, false);
        te.j jVar3 = new te.j(new bh(this, 2), lrVar, 380L);
        this.f39715s1 = jVar3;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Y1 = 0.0f;
        this.Z1 = new di(this, 0);
        this.d2 = false;
        ki[] kiVarArr = new ki[12];
        this.f39724u2 = kiVarArr;
        this.f39728v2 = new LongSparseArray();
        this.E2 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.H2 = textPaint2;
        this.I2 = new RectF();
        this.J2 = new Paint(1);
        this.S2 = true;
        this.T2 = 1.0f;
        this.f39745z3 = false;
        this.B3 = false;
        int i7 = org.telegram.messenger.j10.f24770t0;
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
        this.f39678g4 = false;
        ArrayList arrayList = new ArrayList();
        this.f39681h4 = arrayList;
        Rect rect = new Rect();
        this.f39684i4 = rect;
        this.f39696m4 = new di(this, 1);
        this.f39718s4 = true;
        this.f39722t4 = false;
        this.A4 = false;
        this.B4 = false;
        this.f30231y = true;
        ui.c cVar = new ui.c();
        this.E4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, this.J0));
        this.Y0.E.add(new ri.o(cVar, new bh(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f()) {
            dh.g gVar = new dh.g(false);
            this.D4 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(cVar);
            fVar.f59008f = cVar;
            fVar.d = gVar;
            fVar.f59007e = -2;
            ui.f fVar2 = new ui.f(null);
            fVar2.f59008f = cVar;
            fVar2.d = gVar;
            fVar2.f59007e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.F4 = cVar2;
            cVar2.f8379k = true;
            int L = org.telegram.messenger.pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.f8374e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.G4 = cVar3;
            cVar3.f8379k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.f8374e = L2;
        } else {
            this.D4 = null;
            this.F4 = new dh.c(cVar, cVar, cVar);
            this.G4 = new dh.c(cVar, cVar, cVar);
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.H4 = new ih(this, 0);
        this.f39675f4 = z10;
        this.f39662b2 = (h2Var instanceof org.telegram.ui.bn) && h2Var.isInBubbleMode();
        this.f30214l0 = new OvershootInterpolator(0.7f);
        this.f39659a2 = h2Var;
        this.G = true;
        this.f30233z0 = this;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.T0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.Z4);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25133i5);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.F1);
        arrayList.add(rect);
        fi fiVar = new fi(this, context);
        this.f39705p3 = fiVar;
        fiVar.setDelegate(new gi(this));
        this.f30190b = fiVar;
        fiVar.setWillNotDraw(false);
        this.f30190b.setClipChildren(false);
        this.f30190b.setClipToPadding(false);
        ViewGroup viewGroup = this.f30190b;
        int i10 = this.f30225u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        v7 v7Var = new v7(this, context, i6Var, 1);
        this.V2 = v7Var;
        v7Var.f29065d1 = true;
        v7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        v7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i11 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.l(v7Var, 1, i11, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.I5;
        org.telegram.ui.ActionBar.u6.l(v7Var, 3, i12, i6Var);
        org.telegram.ui.ActionBar.u6.l(v7Var, 5, i11, i6Var);
        v7Var.setOccupyStatusBar(true);
        v7Var.setAlpha(0.0f);
        v7Var.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 15));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
        this.Y2 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(2131231244);
        r0Var2.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        r0Var2.setVisibility(4);
        r0Var2.setAlpha(0.0f);
        r0Var2.setScaleX(0.6f);
        r0Var2.setScaleY(0.6f);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setDelegate(new bh(this, 10));
        r0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(r0Var2, h02, null, M, i6Var);
        r0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var3 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i13 = 2131748640;
                            } else {
                                i13 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i13, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var3.getWidth() / 2.0f) + r0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
        this.f39660a3 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        hi.v vVar = new hi.v();
        this.Z2 = vVar;
        r0Var3.setIcon(vVar);
        r0Var3.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        r0Var3.setVisibility(8);
        r0Var3.setAlpha(0.0f);
        r0Var3.setScaleX(0.6f);
        r0Var3.setScaleY(0.6f);
        r0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        r0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(r0Var3, h03, null, M2, i6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i13 = 2131748640;
                            } else {
                                i13 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i13, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        gi.j jVar4 = new gi.j(this, context);
        org.telegram.ui.ActionBar.u6.U(jVar4, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        jVar4.setText(org.telegram.messenger.gd.M0(2131751742, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        jVar4.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i13 = 2131748640;
                            } else {
                                i13 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i13, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        c8.ra.a(jVar4);
        this.f39668d3 = jVar4;
        M1();
        if (h2Var != null) {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            r0Var = r0Var3;
            jVar2 = jVar4;
            org.telegram.ui.ActionBar.r0 r0Var4 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
            this.f39666c3 = r0Var4;
            r0Var4.setLongClickEnabled(false);
            r0Var4.setIcon(2131232488);
            r0Var4.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
            r0Var4.setVisibility(4);
            z13 = false;
            r0Var4.setAlpha(0.0f);
            r0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 6, -1);
            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i12);
            r0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.u6.j(r0Var4, h04, null, M3, i6Var);
            r0Var4.setOnClickListener(new fi.v1(5, this, z11));
        } else {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            z13 = false;
            r0Var = r0Var3;
            jVar2 = jVar4;
        }
        org.telegram.ui.ActionBar.r0 r0Var5 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i11, this.J0), false, i6Var);
        this.f39683i3 = r0Var5;
        r0Var5.setLongClickEnabled(false);
        r0Var5.setIcon(2131231244);
        r0Var5.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        r0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 3, -1);
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i12);
        r0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(r0Var5, h05, null, M4, i6Var);
        r0Var5.e(1, 2131232046, org.telegram.messenger.gd.M0(2131744642, null)).setOnClickListener(new View.OnClickListener(this) {
            public final si f35501b;

            {
                this.f35501b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final si siVar = this.f35501b;
                        vh vhVar = siVar.C2;
                        if (vhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(siVar.getContext(), i6Var);
                            m0Var.x1(vhVar.getText());
                            m0Var.f37285f2 = new org.telegram.messenger.x10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            vh vhVar2 = siVar.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            xh xhVar = siVar.N2;
                                            xhVar.setText(charSequence);
                                            xhVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = siVar.U1;
                            if (siVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            m0Var.v1(j3, z14, new kh(siVar, 0));
                            m0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final si siVar2 = this.f35501b;
                        xh xhVar = siVar2.N2;
                        if (xhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(siVar2.getContext(), i6Var);
                            m0Var2.x1(xhVar.getText());
                            m0Var2.f37285f2 = new org.telegram.messenger.x10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            vh vhVar2 = siVar2.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            xh xhVar2 = siVar2.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = siVar2.U1;
                            if (siVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m0Var2.v1(j10, z15, new kh(siVar2, 1));
                            m0Var2.show();
                            return;
                        }
                        return;
                    default:
                        si siVar3 = this.f35501b;
                        siVar3.f39683i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar3.f39659a2;
                        p12.I2(null, h2Var2, i6Var);
                        PhotoViewer.p1().J2(siVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i13 = siVar3.Q3;
                        boolean z16 = siVar3.R3;
                        p13.h = i13;
                        p13.f43275n = z16;
                        if (!siVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(h2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(siVar3.f30193c.findFocus());
                        }
                        File w10 = hi.d7.w(siVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24118q;
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
                        ji jiVar = new ji(siVar3, efVar);
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) h2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, jiVar, bnVar);
                        if (siVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, siVar3.E1);
                            return;
                        }
                        return;
                }
            }
        });
        r0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        r0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        r0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i13 = 2131748640;
                            } else {
                                i13 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i13, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        sh shVar = new sh(this, context, 0);
        this.f39677g3 = shVar;
        shVar.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i13 = 2131748640;
                            } else {
                                i13 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i13, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        shVar.setAlpha(0.0f);
        shVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f39680h3 = textView;
        org.telegram.messenger.f3.l(textView, i11, i6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f39688k3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.x(imageView, mutate, i11, i6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ma.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        shVar.addView(linearLayout, c8.ma.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f39691l3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.u6.x(imageView2, mutate2, i11, i6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ma.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f39695m3 = textView2;
        org.telegram.messenger.f3.l(textView2, i11, i6Var, 1, 16.0f);
        org.telegram.messenger.f3.k(textView2, 19, "AttachMediaPreview", 2131753956);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ma.r(-2, -2, 16));
        shVar.addView(linearLayout2, c8.ma.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, i6Var);
        this.f39670e2 = chatAttachAlertPhotoLayout;
        kiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f39732w2 = chatAttachAlertPhotoLayout;
        this.U2 = 1L;
        this.f30190b.addView(chatAttachAlertPhotoLayout, c8.ma.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.f39721t3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24112m);
        this.f30190b.addView(fVar3, c8.ma.g());
        this.f30190b.addView(shVar, c8.ma.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.k0 k0Var = new ai.k0(context, 15);
        this.M2 = k0Var;
        this.f30190b.addView(k0Var, c8.ma.e(-1, -2, 55));
        this.f30190b.addView(v7Var, c8.ma.c(-2.0f, -1));
        this.f30190b.addView(r0Var2, c8.ma.e(48, 48, 53));
        this.f30190b.addView(r0Var, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f39666c3;
        if (r0Var6 != null) {
            this.f30190b.addView(r0Var6, c8.ma.e(48, 48, 53));
        }
        shVar.addView(r0Var5, c8.ma.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f30190b.addView(jVar2, c8.ma.e(-2, 48, 53));
        sh shVar2 = new sh(this, context, 1);
        this.f39729v3 = shVar2;
        th thVar = new th(context, 0);
        this.f39733w3 = thVar;
        thVar.setClipChildren(true);
        thVar.setClipToPadding(false);
        pi piVar = new pi(this, context);
        this.f39741y3 = piVar;
        thVar.setAdapter(piVar);
        v4.c0 c0Var = new v4.c0(0, false);
        this.f39737x3 = c0Var;
        thVar.setLayoutManager(c0Var);
        thVar.setVerticalScrollBarEnabled(false);
        thVar.setHorizontalScrollBarEnabled(false);
        thVar.setItemAnimator(null);
        thVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.u6.l(thVar, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        thVar.f34096z2 = true;
        thVar.setOverScrollMode(2);
        dh.c cVar5 = this.F4;
        ri.q qVar = this.Y0;
        cVar5.f8378j = qVar;
        this.G4.f8378j = qVar;
        cVar4.f8378j = qVar;
        uh uhVar = new uh(this, context, 0);
        this.f39725u3 = uhVar;
        dh.d dVar = new dh.d(cVar4.c(uhVar, null, false));
        this.W1 = dVar;
        if (org.telegram.messenger.bz.f()) {
            org.telegram.messenger.pc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.f30190b.addView(uhVar, c8.ma.g());
        fh.g c10 = this.F4.c(shVar2, c8.i0.g(i6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        shVar2.setBackground(c10);
        thVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        thVar.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3343a;
        thVar.setOutlineProvider(new bg.s0(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(28.0f)));
        thVar.setImportantForAccessibility(1);
        shVar2.addView(thVar, c8.ma.g());
        this.f30190b.addView(shVar2, c8.ma.e(-1, 70, 81));
        thVar.setOnItemClickListener(new fi.g4(9, this, i6Var));
        thVar.setOnItemLongClickListener(new bh(this, 3));
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
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i13 = 2131748640;
                            } else {
                                i13 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i13, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        this.f30190b.addView(n6Var, c8.ma.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f30190b.addView(radialProgressView, c8.ma.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.D2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.n6.f29805z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView3, i13, i6Var, mode2);
        imageView3.setImageResource(2131231839);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i132 = 2131748640;
                            } else {
                                i132 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i132, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        sh shVar3 = new sh(this, context, 2);
        this.B2 = shVar3;
        kg.j jVar5 = new kg.j(this, context);
        this.A2 = jVar5;
        shVar3.addView(jVar5, c8.ma.e(-1, -1, 119));
        fh.g c11 = this.G4.c(fiVar, c8.i0.o(i6Var), false);
        this.f39740y2 = c11;
        c11.T = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.R.f11641g = 0.4f;
        c11.n();
        fh.g c12 = this.F4.c(jVar5, c8.i0.o(i6Var), false);
        this.f39744z2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        shVar3.setWillNotDraw(false);
        shVar3.setVisibility(4);
        shVar3.setAlpha(0.0f);
        this.f30190b.addView(shVar3, c8.ma.e(-1, -2, 83));
        shVar3.setOnTouchListener(new gi.a(14));
        n6 n6Var2 = new n6(context, false, false, false);
        this.f39723u1 = n6Var2;
        n6Var2.setAllowCancel(true);
        n6Var2.setScaleProperty(0.6f);
        n6Var2.setVisibility(8);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i14 = org.telegram.ui.ActionBar.n6.f29786y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i14, i6Var);
        n6Var2.setTypeface(org.telegram.messenger.g0.o());
        n6Var2.setGravity(17);
        jVar5.addView(n6Var2, c8.ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f39731w1 = imageView4;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(context);
        this.f39735x1 = w2Var;
        imageView4.setImageDrawable(w2Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.n6.Nl;
        org.telegram.ui.ActionBar.u6.s(imageView4, i15, i6Var, mode);
        int i16 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i16);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(imageView4, h06, null, M5, i6Var);
        jVar5.addView(imageView4, c8.ma.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.gd.M0(2131755006, null));
        c8.ra.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final si f35501b;

            {
                this.f35501b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final si siVar = this.f35501b;
                        vh vhVar = siVar.C2;
                        if (vhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(siVar.getContext(), i6Var);
                            m0Var.x1(vhVar.getText());
                            m0Var.f37285f2 = new org.telegram.messenger.x10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            vh vhVar2 = siVar.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            xh xhVar2 = siVar.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = siVar.U1;
                            if (siVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            m0Var.v1(j3, z14, new kh(siVar, 0));
                            m0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final si siVar2 = this.f35501b;
                        xh xhVar = siVar2.N2;
                        if (xhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(siVar2.getContext(), i6Var);
                            m0Var2.x1(xhVar.getText());
                            m0Var2.f37285f2 = new org.telegram.messenger.x10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            vh vhVar2 = siVar2.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            xh xhVar2 = siVar2.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = siVar2.U1;
                            if (siVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m0Var2.v1(j10, z15, new kh(siVar2, 1));
                            m0Var2.show();
                            return;
                        }
                        return;
                    default:
                        si siVar3 = this.f35501b;
                        siVar3.f39683i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar3.f39659a2;
                        p12.I2(null, h2Var2, i6Var);
                        PhotoViewer.p1().J2(siVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = siVar3.Q3;
                        boolean z16 = siVar3.R3;
                        p13.h = i132;
                        p13.f43275n = z16;
                        if (!siVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(h2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(siVar3.f30193c.findFocus());
                        }
                        File w10 = hi.d7.w(siVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24118q;
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
                        ji jiVar = new ji(siVar3, efVar);
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) h2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, jiVar, bnVar);
                        if (siVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, siVar3.E1);
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
        this.F1 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).J0();
        vh vhVar = new vh(this, context, fiVar, i6Var);
        this.C2 = vhVar;
        vhVar.K = true;
        vhVar.setHint(org.telegram.messenger.gd.M0(2131754452, "AddCaption"));
        vhVar.s();
        vhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        vhVar.getEditText().addTextChangedListener(new wh(this, 0));
        jVar5.addView(vhVar, c8.ma.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        shVar3.setClipChildren(false);
        vhVar.setClipChildren(false);
        k0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        k0Var.setWillNotDraw(false);
        xh xhVar = new xh(this, context, fiVar, i6Var);
        this.N2 = xhVar;
        xhVar.K = true;
        xhVar.getEditText().addTextChangedListener(new zh(this, h2Var));
        xhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        xhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        xhVar.getEditText().setTextSize(1, 17.0f);
        xhVar.getEmojiButton().setLayoutParams(c8.ma.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        xhVar.setHint(org.telegram.messenger.gd.M0(2131754452, "AddCaption"));
        k0Var.addView(xhVar, c8.ma.e(-1, -2, 119));
        k0Var.setAlpha(0.0f);
        k0Var.setVisibility(8);
        vhVar.addView(imageView3, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.F4.c(k0Var, c8.i0.o(i6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        k0Var.setBackground(c13);
        k0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        n6 n6Var3 = new n6(context, false, false, false);
        this.f39727v1 = n6Var3;
        n6Var3.setScaleProperty(0.6f);
        n6Var3.setVisibility(8);
        n6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var3, i14, i6Var);
        n6Var3.setTypeface(org.telegram.messenger.g0.o());
        n6Var3.setGravity(17);
        n6Var3.setAllowCancel(true);
        k0Var.addView(n6Var3, c8.ma.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231840);
        org.telegram.ui.ActionBar.u6.s(imageView5, org.telegram.ui.ActionBar.n6.Oe, i6Var, mode2);
        xhVar.addView(imageView5, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i132 = 2131748640;
                            } else {
                                i132 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i132, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f39739y1 = imageView6;
        org.telegram.ui.ActionBar.w2 w2Var2 = new org.telegram.ui.ActionBar.w2(context);
        this.f39743z1 = w2Var2;
        imageView6.setImageDrawable(w2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView6, i15, i6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M6 = org.telegram.ui.ActionBar.u6.M(i16);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.u6.j(imageView6, h07, null, M6, i6Var);
        k0Var.addView(imageView6, c8.ma.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.gd.M0(2131755006, null));
        c8.ra.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final si f35501b;

            {
                this.f35501b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.bn bnVar;
                switch (r3) {
                    case 0:
                        final si siVar = this.f35501b;
                        vh vhVar2 = siVar.C2;
                        if (vhVar2 != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(siVar.getContext(), i6Var);
                            m0Var.x1(vhVar2.getText());
                            m0Var.f37285f2 = new org.telegram.messenger.x10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            vh vhVar22 = siVar.C2;
                                            vhVar22.setText(charSequence);
                                            vhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            xh xhVar2 = siVar.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = siVar.U1;
                            if (siVar.F3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            m0Var.v1(j3, z14, new kh(siVar, 0));
                            m0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final si siVar2 = this.f35501b;
                        xh xhVar2 = siVar2.N2;
                        if (xhVar2 != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(siVar2.getContext(), i6Var);
                            m0Var2.x1(xhVar2.getText());
                            m0Var2.f37285f2 = new org.telegram.messenger.x10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            vh vhVar22 = siVar2.C2;
                                            vhVar22.setText(charSequence);
                                            vhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            xh xhVar22 = siVar2.N2;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = siVar2.U1;
                            if (siVar2.F3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m0Var2.v1(j10, z15, new kh(siVar2, 1));
                            m0Var2.show();
                            return;
                        }
                        return;
                    default:
                        si siVar3 = this.f35501b;
                        siVar3.f39683i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar3.f39659a2;
                        p12.I2(null, h2Var2, i6Var);
                        PhotoViewer.p1().J2(siVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = siVar3.Q3;
                        boolean z16 = siVar3.R3;
                        p13.h = i132;
                        p13.f43275n = z16;
                        if (!siVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(h2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(siVar3.f30193c.findFocus());
                        }
                        File w10 = hi.d7.w(siVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.f24118q;
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
                        ji jiVar = new ji(siVar3, efVar);
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            bnVar = (org.telegram.ui.bn) h2Var2;
                        } else {
                            bnVar = null;
                        }
                        p14.f2(arrayList2, 0, 11, false, jiVar, bnVar);
                        if (siVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, siVar3.E1);
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
        sh shVar4 = new sh(this, context, 3);
        this.F2 = shVar4;
        shVar4.setFocusable(true);
        shVar4.setFocusableInTouchMode(true);
        shVar4.setVisibility(4);
        shVar4.setScaleX(0.2f);
        shVar4.setScaleY(0.2f);
        shVar4.setAlpha(0.0f);
        shVar4.setClipChildren(false);
        shVar4.setClipToPadding(false);
        this.f30190b.addView(shVar4, c8.ma.e(110, 50, 85));
        ai aiVar = new ai(context, i6Var, this);
        this.G2 = aiVar;
        aiVar.setImportantForAccessibility(2);
        shVar4.addView(aiVar, c8.ma.e(-1, -1, 119));
        aiVar.setTranslationX(this.f30225u0);
        int L4 = org.telegram.messenger.g0.L(52.0f);
        int L5 = org.telegram.messenger.g0.L(38.0f);
        aiVar.L = L4;
        aiVar.M = L5;
        aiVar.P = org.telegram.messenger.g0.L(7.0f);
        aiVar.Q = org.telegram.messenger.g0.L(6.0f);
        aiVar.f39643s0 = true;
        aiVar.setOnClickListener(new View.OnClickListener(this) {
            public final si f35098b;

            {
                this.f35098b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.t3 t3Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        si siVar = this.f35098b;
                        if (siVar.f39732w2 != siVar.f39690l2) {
                            z14 = true;
                        }
                        siVar.P1(z14);
                        return;
                    case 1:
                        si siVar2 = this.f35098b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.f39728v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        si siVar3 = this.f35098b;
                        boolean z15 = siVar3.X1;
                        if (!z15) {
                            siVar3.w1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        si siVar4 = this.f35098b;
                        boolean z16 = siVar4.X1;
                        if (z16) {
                            siVar4.w1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f35098b.o1();
                        return;
                    case 5:
                        this.f35098b.Y2.V(null, null);
                        return;
                    case 6:
                        si siVar5 = this.f35098b;
                        if (siVar5.f39670e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z17 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.f39670e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == efVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.f23169i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.f39660a3;
                            hi.m3 m3Var = siVar5.f39663b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.f39663b3 = m3Var2;
                            if (!V) {
                                i132 = 2131748640;
                            } else {
                                i132 = 2131748641;
                            }
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i132, null)));
                            siVar5.f39663b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.f39663b3.p(1.0f, -((siVar5.f30190b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.f39663b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.f39663b3;
                            m3Var3.f15011r0 = new mg(1, siVar5, m3Var2);
                            siVar5.f30190b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.f39663b3.x();
                            return;
                        }
                        return;
                    case 7:
                        ki kiVar = this.f35098b.f39732w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f35098b.f39683i3.V(null, null);
                        return;
                }
            }
        });
        aiVar.setOnLongClickListener(new org.telegram.ui.of(this, context, i6Var, h2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        uh uhVar2 = new uh(this, context, 1);
        uhVar2.setAlpha(0.0f);
        uhVar2.setScaleX(0.2f);
        uhVar2.setScaleY(0.2f);
        if (z10) {
            Q0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.F4, c8.i0.o(i6Var));
        pc0 pc0Var = new pc0(context);
        this.N1 = pc0Var;
        this.f30190b.addView(pc0Var, c8.ma.c(-1.0f, -1));
        gh.e eVar = new gh.e(i6Var);
        eVar.f13625e = new bh(this, 5);
        eVar.f13624c = new bh(this, 6);
        eVar.d = new bh(this, 7);
        eVar.f13623b = new bh(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13627n = N;
        eVar.f13628r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13626f = N3;
        eVar.h = N4;
        v7Var.Q(this.F4, eVar, false);
        jVar.f(1L, false);
        this.Y0.i(this.f30190b);
        ri.q qVar2 = this.Y0;
        qVar2.f56694a = new bh(this, 9);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
