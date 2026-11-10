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
public class ci extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.q2, te.b {
    public static final int H4 = 0;
    public boolean A1;
    public final ch A2;
    public boolean A3;
    public boolean A4;
    public boolean B1;
    public final fh B2;
    public final i6 B3;
    public fi.i B4;
    public int C1;
    public final ImageView C2;
    public float C3;
    public final dh.g C4;
    public org.telegram.messenger.v10 D1;
    public final int[] D2;
    public int D3;
    public final ri.c D4;
    public int E1;
    public final ch E2;
    public org.telegram.messenger.ij E3;
    public final dh.c E4;
    public int F1;
    public final kh F2;
    public boolean F3;
    public final dh.c F4;
    public boolean G1;
    public final TextPaint G2;
    public final int G3;
    public final tg G4;
    public boolean H1;
    public final RectF H2;
    public boolean H3;
    public boolean I1;
    public final Paint I2;
    public boolean I3;
    public boolean J1;
    public AnimatorSet J2;
    public boolean J3;
    public h30 K1;
    public long K2;
    public boolean K3;
    public boolean L1;
    public final bi.x5 L2;
    public boolean L3;
    public final ec0 M1;
    public final hh M2;
    public boolean M3;
    public bn N1;
    public int N2;
    public boolean N3;
    public j30 O1;
    public ps O2;
    public boolean O3;
    public boolean P1;
    public boolean P2;
    public int P3;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public lj R1;
    public boolean R2;
    public boolean R3;
    public ji S1;
    public final float S2;
    public float S3;
    public long T1;
    public long T2;
    public float T3;
    public boolean U1;
    public final q7 U2;
    public ValueAnimator U3;
    public final dh.d V1;
    public AnimatorSet V2;
    public int V3;
    public boolean W1;
    public AnimatorSet W2;
    public ai W3;
    public float X1;
    public final org.telegram.ui.ActionBar.r0 X2;
    public nm X3;
    public final nh Y1;
    public final fi.u Y2;
    public final int[] Y3;
    public final org.telegram.ui.ActionBar.f2 Z1;
    public final org.telegram.ui.ActionBar.r0 Z2;
    public int Z3;
    public final boolean f32591a2;
    public fi.m3 f32592a3;
    public float f32593a4;
    public te f32594b2;
    public final org.telegram.ui.ActionBar.r0 f32595b3;
    public float f32596b4;
    public boolean f32597c2;
    public final ei.k f32598c3;
    public boolean f32599c4;
    public final ChatAttachAlertPhotoLayout d2;
    public float f32600d3;
    public float f32601d4;
    public ej f32602e2;
    public float f32603e3;
    public final boolean f32604e4;
    public mi f32605f2;
    public final ch f32606f3;
    public boolean f32607f4;
    public an f32608g2;
    public final TextView f32609g3;
    public final ArrayList f32610g4;
    public an f32611h2;
    public final org.telegram.ui.ActionBar.r0 f32612h3;
    public final Rect f32613h4;
    public vk f32614i2;
    public final LinearLayout f32615i3;
    public float f32616i4;
    public uj f32617j2;
    public final ImageView j3;
    public boolean f32618j4;
    public am f32619k2;
    public final LinearLayout f32620k3;
    public int f32621k4;
    public final te.a l1;
    public pi f32622l2;
    public final TextView f32623l3;
    public final nh f32624l4;
    public final te.a f32625m1;
    public kg.g0 f32626m2;
    public float f32627m3;
    public r1.g f32628m4;
    public final te.a n1;
    public vj f32629n2;
    public boolean f32630n3;
    public AnimatorSet f32631n4;
    public final te.a f32632o1;
    public vj f32633o2;
    public final ph f32634o3;
    public int o4;
    public final te.a f32635p1;
    public li.p f32636p2;
    public boolean f32637p3;
    public int f32638p4;
    public final te.a f32639q1;
    public hk f32640q2;
    public Object f32641q3;
    public boolean f32642q4;
    public final te.j f32643r1;
    public boolean f32644r2;
    public boolean f32645r3;
    public boolean f32646r4;
    public org.telegram.ui.an f32647s1;
    public float f32648s2;
    public final lh.f f32649s3;
    public boolean f32650s4;
    public final i6 f32651t1;
    public final uh[] f32652t2;
    public final eh f32653t3;
    public uk f32654t4;
    public final i6 f32655u1;
    public final LongSparseArray f32656u2;
    public final ch f32657u3;
    public boolean f32658u4;
    public final ImageView f32659v1;
    public uh f32660v2;
    public final dh f32661v3;
    public boolean f32662v4;
    public final org.telegram.ui.ActionBar.v2 f32663w1;
    public uh f32664w2;
    public final v4.b0 f32665w3;
    public File f32666w4;
    public final ImageView f32667x1;
    public final fh.g f32668x2;
    public final zh f32669x3;
    public double[] f32670x4;
    public final org.telegram.ui.ActionBar.v2 f32671y1;
    public final fh.g f32672y2;
    public boolean f32673y3;
    public boolean f32674y4;
    public boolean f32675z1;
    public final kg.j f32676z2;
    public final RadialProgressView f32677z3;
    public boolean f32678z4;

    public ci(Activity activity, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10) {
        this(activity, f2Var, z9, z10, true, null);
    }

    public static void I0(ci ciVar) {
        boolean z9;
        boolean q10;
        int i7;
        q7 q7Var = ciVar.U2;
        lh.f fVar = ciVar.f32649s3;
        if (fVar != null && q7Var != null) {
            uh uhVar = ciVar.f32664w2;
            if (uhVar == null) {
                uhVar = ciVar.f32660v2;
            }
            int i10 = 0;
            if (uhVar != null && uhVar.f()) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.ActionBar.h6 h6Var = ciVar.I0;
            if (h6Var != null) {
                q10 = h6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.m6.I.q();
            }
            if (!z9 && q7Var.getVisibility() == 0) {
                if (q10) {
                    i7 = 255;
                } else {
                    i7 = 160;
                }
                i10 = (int) (q7Var.getAlpha() * i7);
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void K0(ci ciVar) {
        fi.i iVar = new fi.i(ciVar, ciVar.getContext(), ciVar.T1, LaunchActivity.Q(), ciVar.I0, 1);
        ciVar.B4 = iVar;
        iVar.p(new h9.f1(ciVar, 29));
        ViewGroup viewGroup = ciVar.f28672b;
        viewGroup.addView(ciVar.B4, viewGroup.indexOfChild(ciVar.A2), c8.ha.e(-1, -1, 83));
        fi.i iVar2 = ciVar.B4;
        iVar2.getAdapter().f16776c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f16779e = false;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        boolean z9 = true;
        if (f2Var instanceof org.telegram.ui.cn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            jg.i1 adapter = iVar2.getAdapter();
            cnVar.j();
            TLRPC.Chat chat = cnVar.f44473e;
            adapter.getClass();
            adapter.f16788l0 = chat;
            iVar2.getAdapter().W(cnVar.f44620p8);
            jg.i1 adapter2 = iVar2.getAdapter();
            if (cnVar.f44473e == null) {
                z9 = false;
            }
            adapter2.f16780e0 = z9;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f16780e0 = false;
        }
        iVar2.getAdapter().f16782f0 = false;
        ciVar.J1();
    }

    public static int L0(ci ciVar) {
        uh uhVar = ciVar.f32660v2;
        an anVar = ciVar.f32608g2;
        if (uhVar == anVar && anVar.E != null) {
            return anVar.getEmojiPadding();
        }
        an anVar2 = ciVar.f32611h2;
        if (uhVar == anVar2 && anVar2.E != null) {
            return anVar2.getEmojiPadding();
        }
        if (ciVar.W1) {
            return ciVar.M2.getEmojiPadding();
        }
        return ciVar.B2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.t10.B(user) && !org.telegram.messenger.t10.t(user) && !org.telegram.messenger.t10.x(user) && !org.telegram.messenger.t10.A(user.f27109id) && !org.telegram.messenger.t10.z(user) && !org.telegram.messenger.t10.s(user) && user.f27109id != 489000 && !org.telegram.messenger.qp.F2(user)) {
            return true;
        }
        return false;
    }

    public static void s1(uh uhVar) {
        if (uhVar != null) {
            int i7 = org.telegram.ui.ActionBar.t6.f28531b;
            Object tag = uhVar.getTag(2131296710);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
                return;
            }
            uhVar.setTag(2131296710, Integer.valueOf(i7));
            try {
                org.telegram.ui.ActionBar.t6.c0(uhVar, true);
                uhVar.d();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void A1(String str) {
        boolean z9 = true;
        this.N2 = 1;
        this.f32675z1 = true;
        this.P2 = false;
        this.J3 = false;
        this.f32657u3.setVisibility(8);
        this.f32609g3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            ci ciVar = chatAttachAlertPhotoLayout.f38656b;
            if (ciVar.N2 == 0 || ciVar.f32675z1) {
                z9 = false;
            }
            chatAttachAlertPhotoLayout.f31222g1 = z9;
        }
    }

    public final void B1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci.B1(boolean):void");
    }

    public final void C1(long r28, java.lang.String r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci.C1(long, java.lang.String, boolean, boolean):void");
    }

    public final void D1(org.telegram.ui.ActionBar.f2 f2Var) {
        if ((f2Var instanceof org.telegram.ui.cn) && org.telegram.messenger.t3.V(((org.telegram.ui.cn) f2Var).f44473e)) {
            new gc(this.f32634o3, this.I0).f(org.telegram.messenger.qp.s1(this.G3).U4, new org.telegram.ui.fq(13, this, f2Var)).j();
        }
    }

    public final boolean E1(boolean z9, boolean z10) {
        boolean z11;
        Integer num;
        boolean z12;
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
        uh uhVar;
        float f19;
        float L;
        long N1;
        float f20;
        float f21;
        q7 q7Var;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float L2;
        this.f32625m1.a(z9, true);
        ch chVar = this.A2;
        if (chVar.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 == z11) {
            return false;
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        chVar.setTag(num);
        fh fhVar = this.B2;
        if (fhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(fhVar.getEditText());
        }
        fhVar.k(true);
        this.M2.k(true);
        ch chVar2 = this.f32657u3;
        ch chVar3 = this.E2;
        if (z9) {
            if (!this.H1) {
                chVar.setVisibility(0);
            }
            chVar3.setVisibility(0);
        } else if (this.P2) {
            chVar2.setVisibility(0);
        }
        uh uhVar2 = this.f32660v2;
        if ((uhVar2 == this.d2 || uhVar2 == this.f32619k2) && this.W1) {
            z12 = true;
        } else {
            z12 = false;
        }
        q7 q7Var2 = this.U2;
        bi.x5 x5Var = this.L2;
        kg.j jVar = this.f32676z2;
        kh khVar = this.F2;
        float f29 = 1.0f;
        if (z10) {
            this.J2 = new AnimatorSet();
            if (z12) {
                x5Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z9) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(chVar, property, f20));
            if (z9 && !z12) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f21));
            if (z9 && !z12) {
                jVar.setVisibility(0);
                q7Var = q7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                q7Var = q7Var2;
            }
            if (z9 && z12) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x5Var, property, f22));
            Property property2 = View.SCALE_X;
            if (z9) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(chVar3, property2, f23));
            Property property3 = View.SCALE_Y;
            if (z9) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(chVar3, property3, f24));
            if (z9) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(chVar3, property, f25));
            if (z9) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(khVar, property2, f26));
            if (z9) {
                f27 = 1.0f;
            } else {
                f27 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(khVar, property3, f27));
            if (q7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z9) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(chVar, property4, L2));
            } else if (this.P2) {
                Property property5 = View.TRANSLATION_Y;
                if (z9) {
                    f28 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(chVar2, property5, f28));
                if (z9) {
                    f29 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(chVar2, property, f29));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ng(this, 5));
                arrayList.add(ofFloat);
            }
            this.J2.playTogether(arrayList);
            this.J2.setInterpolator(new DecelerateInterpolator());
            this.J2.setDuration(180L);
            this.J2.addListener(new org.telegram.ui.ActionBar.h(this, z9, z12, 3));
            this.J2.start();
            i7 = 0;
        } else {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            chVar.setAlpha(f10);
            if (z9 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            jVar.setAlpha(f11);
            if (z9 && !z12) {
                i7 = 0;
                jVar.setVisibility(0);
                f12 = 0.0f;
                jVar.setTranslationY(0.0f);
            } else {
                f12 = 0.0f;
                i7 = 0;
            }
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            chVar3.setScaleX(f13);
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            chVar3.setScaleY(f14);
            if (z9) {
                f15 = 1.0f;
            } else {
                f15 = f12;
            }
            chVar3.setAlpha(f15);
            if (z9 && z12) {
                i10 = i7;
            } else {
                i10 = 8;
            }
            x5Var.setVisibility(i10);
            if (z9 && z12) {
                f16 = 1.0f;
            } else {
                f16 = f12;
            }
            x5Var.setAlpha(f16);
            if (z9) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            khVar.setScaleX(f17);
            if (z9) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            khVar.setScaleY(f18);
            if (q7Var2.getTag() != null) {
                if (z9) {
                    L = f12;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                chVar.setTranslationY(L);
            } else if (this.P2 && ((uhVar = this.f32660v2) == null || uhVar.M())) {
                if (z9) {
                    f19 = org.telegram.messenger.g0.L(84.0f);
                } else {
                    f19 = f12;
                }
                chVar2.setTranslationY(f19);
            }
            if (!z9) {
                chVar.setVisibility(4);
                chVar3.setVisibility(4);
            }
            if (z12) {
                Q1();
            }
        }
        if (z9) {
            i7 = Math.max(1, this.f32660v2.getSelectedItemsCount());
        }
        khVar.e(i7, z10);
        if (this.E3 != null) {
            N1 = 0;
        } else {
            N1 = org.telegram.messenger.qp.s1(this.G3).N1(b1());
        }
        khVar.i(X0() + this.f32660v2.getSelectedItemsCount(), N1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), khVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            fhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(uh uhVar) {
        long j3 = this.T2;
        bn bnVar = this.N1;
        if (uhVar == bnVar) {
            j3 = bnVar.f32288s;
        } else if (uhVar == this.d2) {
            j3 = 1;
        } else if (uhVar == this.f32605f2) {
            j3 = 3;
        } else if (uhVar == this.f32617j2) {
            j3 = 4;
        } else if (uhVar == this.f32602e2) {
            j3 = 5;
        } else if (uhVar == this.f32614i2) {
            j3 = 6;
        } else if (uhVar == this.f32608g2) {
            j3 = 9;
        } else if (uhVar == this.f32622l2) {
            j3 = 10;
        } else if (uhVar == this.f32626m2) {
            j3 = 11;
        } else if (uhVar == this.f32611h2) {
            j3 = 12;
        } else if (uhVar == this.f32629n2) {
            j3 = 14;
        } else if (uhVar == this.f32633o2) {
            j3 = 13;
        } else if (uhVar == this.f32636p2) {
            j3 = 16;
        } else if (uhVar == this.f32640q2) {
            j3 = 17;
        }
        G1(uhVar, j3, true);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(uh uhVar, long j3, boolean z9) {
        boolean z10;
        int i7;
        pl plVar;
        boolean z11;
        Integer num;
        pl plVar2;
        int i10;
        int L;
        Float f10;
        int i11;
        boolean z12;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f32641q3 == null && this.J2 == null) {
            uh uhVar2 = this.f32660v2;
            if (uhVar2 == uhVar) {
                uhVar2.J();
            } else if (uhVar == this.f32611h2 && !org.telegram.messenger.p10.i(this.G3).q()) {
                new ug.w0(this.Z1, 39, false).show();
            } else {
                int i12 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f32635p1.a(z10, z9);
                this.f32643r1.f(Long.valueOf(j3), z9);
                this.A3 = false;
                this.f32673y3 = false;
                this.C3 = 0.0f;
                this.B3.setVisibility(8);
                RadialProgressView radialProgressView = this.f32677z3;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                ch chVar = this.f32657u3;
                chVar.setAlpha(1.0f);
                chVar.setTranslationY(this.C3);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f32656u2;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((hi.c4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.T2 = j3;
                dh dhVar = this.f32661v3;
                int childCount = dhVar.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = dhVar.getChildAt(i14);
                    if (childAt instanceof wh) {
                        wh whVar = (wh) childAt;
                        i11 = childCount;
                        f10 = valueOf;
                        if (whVar.f39971b == whVar.f39972c.T2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        whVar.f40307a.f(z12, true);
                    } else {
                        f10 = valueOf;
                        i11 = childCount;
                        if (childAt instanceof vh) {
                            ((vh) childAt).a(true);
                        }
                    }
                    i14++;
                    childCount = i11;
                    valueOf = f10;
                }
                Float f11 = valueOf;
                int firstOffset = (this.f32660v2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Y3[0];
                this.f32664w2 = uhVar;
                S0(uhVar);
                if (this.f32664w2.j() != 0) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                q7 q7Var = this.U2;
                q7Var.setVisibility(i7);
                if (q7Var.f27691n0) {
                    q7Var.n(true);
                }
                this.f32660v2.u();
                uh uhVar3 = this.f32664w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
                if (uhVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f32664w2.H(this.f32660v2);
                this.f32664w2.setVisibility(0);
                if (uhVar.getParent() != null) {
                    this.f28672b.removeView(this.f32664w2);
                }
                int indexOfChild = this.f28672b.indexOfChild(this.f32660v2);
                if (this.f32664w2.getParent() != this.f28672b) {
                    s1(this.f32664w2);
                    ViewGroup viewGroup = this.f28672b;
                    uh uhVar4 = this.f32664w2;
                    if (uhVar4 != this.f32614i2) {
                        indexOfChild++;
                    }
                    viewGroup.addView(uhVar4, indexOfChild, c8.ha.c(-1.0f, -1));
                }
                pg pgVar = new pg(this, 5);
                uh uhVar5 = this.f32660v2;
                boolean z13 = uhVar5 instanceof am;
                nh nhVar = this.Y1;
                if (!z13 && !(this.f32664w2 instanceof am)) {
                    if (z9) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f32664w2.setAlpha(0.0f);
                        this.f32664w2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f32660v2, View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f32660v2, nhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(q7Var, View.ALPHA, q7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(wq.f40046f);
                        animatorSet.addListener(new bi.y4(this, firstOffset, pgVar, 1));
                        this.f32641q3 = animatorSet;
                        uh uhVar6 = this.f32660v2;
                        nhVar.getClass();
                        nhVar.a(uhVar6, f11);
                        animatorSet.start();
                    } else {
                        uhVar5.setAlpha(0.0f);
                        pgVar.run();
                        P1(0);
                        this.f28672b.invalidate();
                    }
                } else {
                    int max = Math.max(this.f32664w2.getWidth(), this.f32660v2.getWidth());
                    uh uhVar7 = this.f32664w2;
                    if (uhVar7 instanceof am) {
                        uhVar7.setTranslationX(max);
                        uh uhVar8 = this.f32660v2;
                        if ((uhVar8 instanceof ChatAttachAlertPhotoLayout) && (plVar2 = ((ChatAttachAlertPhotoLayout) uhVar8).P) != null) {
                            plVar2.setVisibility(4);
                        }
                    } else {
                        this.f32660v2.setTranslationX(-max);
                        uh uhVar9 = this.f32664w2;
                        if (uhVar9 == chatAttachAlertPhotoLayout && (plVar = ((ChatAttachAlertPhotoLayout) uhVar9).P) != null) {
                            plVar.setVisibility(0);
                        }
                    }
                    this.f32664w2.setAlpha(1.0f);
                    this.f32660v2.setAlpha(1.0f);
                    if (z9) {
                        uh uhVar10 = this.f32660v2;
                        nhVar.getClass();
                        nhVar.a(uhVar10, f11);
                        org.telegram.messenger.g0.h3(new mg(this, uhVar, pgVar, 0));
                    } else {
                        if (this.f32664w2.getCurrentItemTop() <= uhVar.getButtonsHideOffset()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f32660v2.v(1.0f);
                        this.f32664w2.v(1.0f);
                        this.f32660v2.m(this.f32616i4);
                        this.f32664w2.m(this.f32616i4);
                        this.f28672b.invalidate();
                        this.X0.g();
                        uh uhVar11 = this.f32660v2;
                        Float valueOf2 = Float.valueOf(1.0f);
                        nhVar.getClass();
                        nhVar.a(uhVar11, valueOf2);
                        if (z11) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        q7Var.setTag(num);
                        pgVar.run();
                    }
                }
                if (this.f32618j4 && !(uhVar instanceof hi.c4)) {
                    i10 = 0;
                    this.f32618j4 = false;
                    q7Var.updateColors();
                    q7Var.invalidate();
                    i1();
                } else {
                    i10 = 0;
                }
                if (i12 != 0 && j3 != 6 && j3 != 17 && !(uhVar instanceof hi.c4)) {
                    if (j3 == 4) {
                        L = org.telegram.messenger.g0.L(84.0f);
                    } else {
                        L = i10;
                    }
                } else {
                    L = org.telegram.messenger.g0.L(46.0f);
                }
                q7Var.setForcedMenuWidth(L);
            }
        }
    }

    @Override
    public final boolean H() {
        return this.f32660v2.b();
    }

    @Override
    public final boolean H0() {
        uh uhVar = this.f32660v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (uhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f31226i1) {
            return true;
        }
        return false;
    }

    public final void H1(boolean z9, Boolean bool) {
        ci ciVar;
        if (this.f32608g2 == null) {
            ciVar = this;
            an anVar = new an(ciVar, getContext(), false, this.I0, bool);
            ciVar.f32608g2 = anVar;
            ciVar.f32652t2[1] = anVar;
            anVar.setDelegate(new lg(this, 17));
        } else {
            ciVar = this;
        }
        G1(ciVar.f32608g2, 9L, z9);
    }

    public final void I1(boolean z9, boolean z10) {
        Integer num;
        boolean z11;
        float f10;
        float f11;
        uh uhVar;
        float f12;
        float f13;
        float f14;
        int i7;
        boolean z12;
        this.n1.a(z9, z10);
        q7 q7Var = this.U2;
        if ((z9 && q7Var.getTag() == null) || (!z9 && q7Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            q7Var.setTag(num);
            AnimatorSet animatorSet = this.V2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V2 = null;
            }
            if (!this.f32675z1 && !this.Q2 && ((this.N2 != 0 || !this.f32630n3) && this.f32660v2 == this.d2 && (this.I3 || this.J3))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f32660v2 == this.N1) {
                z11 = false;
            }
            ch chVar = this.f32657u3;
            org.telegram.ui.ActionBar.r0 r0Var = this.X2;
            if (z9) {
                if (z11) {
                    r0Var.setVisibility(0);
                    r0Var.setClickable(true);
                }
            } else if (this.P2 && this.A2.getTag() == null) {
                chVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
            if (f2Var != null) {
                if (z9) {
                    if (this.f32604e4) {
                        i7 = org.telegram.ui.ActionBar.m6.f27973hh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f27963h5;
                    }
                    if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(i7, this.I0)) > 0.699999988079071d) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    org.telegram.messenger.g0.q3(this, z12);
                } else {
                    org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
                }
            }
            float f15 = 0.6f;
            float f16 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V2 = animatorSet2;
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f12 - q7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q7Var, property, f13);
                ofFloat.addUpdateListener(new ng(this, 4));
                arrayList.add(ofFloat);
                if (z11) {
                    if (z9) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property, f16));
                    Property property2 = View.SCALE_X;
                    if (z9) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property2, f14));
                    Property property3 = View.SCALE_Y;
                    if (z9) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property3, f15));
                }
                this.V2.playTogether(arrayList);
                this.V2.addListener(new s9(2, this, z9));
                this.V2.setInterpolator(wq.h);
                this.V2.setDuration(380L);
                this.V2.start();
                return;
            }
            if (z9 && this.P2 && ((uhVar = this.f32660v2) == null || uhVar.M())) {
                chVar.setVisibility(4);
            }
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            q7Var.setAlpha(f10);
            if (z11) {
                if (z9) {
                    f16 = 1.0f;
                }
                r0Var.setAlpha(f16);
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                r0Var.setScaleX(f11);
                if (z9) {
                    f15 = 1.0f;
                }
                r0Var.setScaleY(f15);
            }
            if (!z9) {
                org.telegram.ui.ActionBar.r0 r0Var2 = this.f32595b3;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(4);
                }
                if (this.N2 != 0 || !this.f32630n3) {
                    r0Var.setVisibility(4);
                }
            }
        }
    }

    @Override
    public final void J() {
        AnimatorSet animatorSet = this.f28714z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.f32628m4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.f32631n4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.f28714z0 = null;
            this.A0 = 0;
        }
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.D2;
        fh fhVar = this.B2;
        fhVar.getLocationOnScreen(iArr);
        if (this.B4 != null) {
            uh uhVar = this.f32660v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if ((uhVar == chatAttachAlertPhotoLayout || uhVar == this.f32619k2) && this.W1) {
                bi.x5 x5Var = this.L2;
                alpha = (x5Var.getAlpha() * x5Var.getMeasuredHeight()) + (x5Var.getY() - this.B4.getTop());
            } else {
                alpha = -fhVar.getHeight();
            }
            if (Math.abs(this.B4.getTranslationY() - alpha) > 0.5f) {
                this.B4.setTranslationY(alpha);
                this.B4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                }
            }
        }
        U0();
    }

    @Override
    public void K() {
        ai aiVar = this.W3;
        if (aiVar != null) {
            aiVar.c0(new pg(this, 4));
        } else {
            t1();
        }
    }

    public final void K1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci.K1(int):void");
    }

    @Override
    public final void L(int i7) {
        super.L(i7);
        this.f32660v2.r(i7);
    }

    public final void L1() {
        boolean i7;
        float f10;
        float f11;
        float f12;
        uh uhVar = this.f32660v2;
        int i10 = 0;
        if (uhVar == null) {
            i7 = false;
        } else {
            i7 = uhVar.i();
        }
        ei.k kVar = this.f32598c3;
        kVar.setEnabled(i7);
        uh uhVar2 = this.f32660v2;
        float f13 = 0.5f;
        if (uhVar2 != null) {
            if (uhVar2.i()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f32664w2 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.X1;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        uh uhVar3 = this.f32664w2;
        if (uhVar3 != null) {
            if (uhVar3.i()) {
                f13 = 1.0f;
            }
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.X1, f13, f10);
        }
        this.f32600d3 = f10;
        if (kVar != null) {
            float f14 = f10 * this.f32603e3;
            kVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            kVar.setVisibility(i10);
        }
    }

    public final void M0() {
        if (a1().f35433a.length() <= 0) {
            return;
        }
        this.f32660v2.a(a1().getText());
    }

    public final void M1(uh uhVar, int i7) {
        boolean z9;
        int i10;
        int i11;
        if (uhVar != null) {
            dh.g gVar = this.C4;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                gVar.f(0.0f, i7);
            }
            int currentItemTop = uhVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z10 = false;
                if (uhVar == this.f32660v2 && currentItemTop <= uhVar.getButtonsHideOffset()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.L1 = z9;
                if (uhVar == this.f32660v2) {
                    I1(z9, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uhVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.camera.q.D(11.0f, i10, currentItemTop);
                uh uhVar2 = this.f32660v2;
                if (uhVar2 == uhVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((uhVar2 instanceof am) || (this.f32664w2 instanceof am)) {
                    Object obj = this.f32641q3;
                    if ((obj instanceof r1.g) && ((r1.g) obj).f54273f) {
                        z10 = true;
                    }
                }
                int[] iArr = this.Y3;
                int i12 = iArr[i11];
                if (i12 == D && !z10) {
                    if (i7 != 0) {
                        this.Z3 = i12;
                        return;
                    }
                    return;
                }
                this.Z3 = i12;
                iArr[i11] = D;
                P1(i11);
                this.f28672b.invalidate();
            }
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).Z6()) {
            return true;
        }
        return false;
    }

    public final void N1(boolean z9) {
        fi.u uVar;
        boolean z10;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.Y2) != null) {
            int i7 = 0;
            if (this.f32630n3 && this.f32597c2 && this.f32660v2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !ChatAttachAlertPhotoLayout.U();
            uVar.f12874f = z11;
            if (!z9) {
                ((v5) uVar.f12875g).a(z11);
            }
            uVar.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.r0 r0Var = this.Z2;
            if (z9 && this.f32630n3) {
                r0Var.setVisibility(0);
                ViewPropertyAnimator animate = r0Var.animate();
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(wq.h).withEndAction(new yg(this, z10, 0)).start();
                return;
            }
            if (!z10) {
                i7 = 8;
            }
            r0Var.setVisibility(i7);
            if (z10) {
                f12 = 1.0f;
            }
            r0Var.setAlpha(f12);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            r0Var.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            r0Var.setScaleY(f13);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ChatActivityEnterView.C(this.G3, ((org.telegram.ui.cn) f2Var).a(), f2Var, charSequence);
        }
        return false;
    }

    public final void O1(boolean z9) {
        boolean z10;
        float f10;
        uh uhVar = this.d2;
        if (z9) {
            if (!this.G1) {
                return;
            }
            if (this.f32619k2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.f32647s1;
                if (h6Var == null) {
                    h6Var = this.I0;
                }
                ?? uhVar2 = new uh(context, h6Var, this);
                uhVar2.D = 0.0f;
                uhVar2.E = 0.0f;
                uhVar2.F = 0.0f;
                uhVar2.G = 0.0f;
                uhVar2.H = 0.0f;
                uhVar2.I = 0.0f;
                uhVar2.J = null;
                uhVar2.K = false;
                uhVar2.M = 0.0f;
                uhVar2.Q = false;
                uhVar2.S = false;
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.y > point.x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uhVar2.T = z10;
                uhVar2.f31879n = h6Var;
                uhVar2.f38659f = true;
                uhVar2.setWillNotDraw(false);
                ci ciVar = uhVar2.f38656b;
                org.telegram.ui.ActionBar.y s5 = ciVar.U2.s();
                TextView textView = new TextView(context);
                uhVar2.f31884y = textView;
                org.telegram.ui.ActionBar.h6 h6Var2 = uhVar2.f38655a;
                fi.w2 w2Var = new fi.w2(uhVar2, context, s5, h6Var2, 2);
                q7 q7Var = ciVar.U2;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                q7Var.addView(w2Var, 0, c8.ha.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, h6Var2);
                textView.setText(org.telegram.messenger.id.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.q1 q1Var = new bi.q1(uhVar2, context, h6Var2, 17);
                uhVar2.f31880r = q1Var;
                q1Var.setAdapter(new org.telegram.ui.x7(uhVar2, 3));
                v4.b0 b0Var = new v4.b0(1, false);
                uhVar2.f31881s = b0Var;
                q1Var.setLayoutManager(b0Var);
                q1Var.setClipChildren(false);
                q1Var.setClipToPadding(false);
                q1Var.setOverScrollMode(2);
                q1Var.setVerticalScrollBarEnabled(false);
                zl zlVar = new zl(uhVar2, context);
                uhVar2.f31882w = zlVar;
                zlVar.setClipToPadding(true);
                zlVar.setClipChildren(true);
                uhVar2.addView(q1Var, c8.ha.c(-1.0f, -1));
                uhVar2.P = ciVar.d2;
                zlVar.f41055c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uhVar2.P;
                zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                zlVar.c();
                UndoView undoView = new UndoView(context, null, false, ciVar.f32647s1);
                uhVar2.f31883x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                uhVar2.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                uhVar2.N = context.getResources().getDrawable(2131232549);
                this.f32619k2 = uhVar2;
                uhVar2.bringToFront();
            }
            uh uhVar3 = this.f32660v2;
            am amVar = this.f32619k2;
            if (uhVar3 != amVar) {
                uhVar = amVar;
            }
            F1(uhVar);
            return;
        }
        F1(uhVar);
    }

    public final void P0() {
        int i7;
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        dh dhVar = this.f32661v3;
        if (dhVar == null) {
            return;
        }
        int childCount = dhVar.getChildCount();
        boolean z10 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            dhVar.getChildAt(i17);
        }
        boolean z11 = this.f32604e4;
        if (z11) {
            i7 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        }
        org.telegram.ui.ActionBar.t6.U(this.f32609g3, i7, this.I0);
        if (z11) {
            i10 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f27998j5;
        }
        org.telegram.ui.ActionBar.t6.U(this.f32623l3, i10, this.I0);
        org.telegram.ui.ActionBar.t6.U(this.f32598c3, org.telegram.ui.ActionBar.m6.Gi, this.I0);
        if (z11) {
            i11 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.f27998j5;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
        if (this.f32642q4 && w02 == this.f32638p4) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f32642q4 = true;
        this.f32638p4 = w02;
        org.telegram.ui.ActionBar.r0 r0Var = this.X2;
        if (z9) {
            r0Var.setIconColor(w02);
        }
        Drawable background = r0Var.getBackground();
        if (z11) {
            i12 = org.telegram.ui.ActionBar.m6.Wg;
        } else {
            i12 = org.telegram.ui.ActionBar.m6.I5;
        }
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), background);
        int i18 = org.telegram.ui.ActionBar.m6.E8;
        r0Var.O(org.telegram.ui.ActionBar.m6.w0(i18, this.I0), false);
        r0Var.O(org.telegram.ui.ActionBar.m6.w0(i18, this.I0), true);
        r0Var.H(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.I0));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.Z2;
        if (r0Var2 != null && z9) {
            r0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.f32595b3;
        if (r0Var3 != null) {
            if (z9) {
                r0Var3.setIconColor(w02);
            }
            Drawable background2 = r0Var3.getBackground();
            if (z11) {
                i16 = org.telegram.ui.ActionBar.m6.Wg;
            } else {
                i16 = org.telegram.ui.ActionBar.m6.I5;
            }
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i16, this.I0), background2);
        }
        fh fhVar = this.B2;
        org.telegram.ui.ActionBar.h6 h6Var = fhVar.M;
        et etVar = fhVar.f35433a;
        int i19 = fhVar.L;
        if (i19 == 0) {
            etVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, h6Var));
            int i20 = org.telegram.ui.ActionBar.m6.G6;
            etVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i20, h6Var));
            etVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(i20, h6Var));
        } else if (i19 != 2 && i19 != 3) {
            etVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28186t5, h6Var));
            etVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27998j5, h6Var));
        } else {
            etVar.setHintTextColor(-1929379841);
            etVar.setTextColor(-1);
            etVar.setCursorColor(-1);
            etVar.setHandlesColor(-1);
            etVar.setHighlightColor(822083583);
            etVar.D = -1;
        }
        fhVar.f35435c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Le, h6Var), PorterDuff.Mode.MULTIPLY));
        ft ftVar = fhVar.d;
        if (ftVar != null) {
            ftVar.updateColors();
        }
        org.telegram.ui.ActionBar.t6.l(dhVar, 21, org.telegram.ui.ActionBar.m6.A5, this.I0);
        if (z11) {
            i13 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i13 = org.telegram.ui.ActionBar.m6.f27998j5;
        }
        org.telegram.ui.ActionBar.h6 h6Var2 = this.I0;
        q7 q7Var = this.U2;
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i13, h6Var2);
        if (z11) {
            i14 = org.telegram.ui.ActionBar.m6.Wg;
        } else {
            i14 = org.telegram.ui.ActionBar.m6.I5;
        }
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, i14, this.I0);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i15 = org.telegram.ui.ActionBar.m6.f27998j5;
        }
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, i15, this.I0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.m6.C1(d12, this.f28702r0);
        ri.c cVar = this.D4;
        if (cVar.f54575b != d12) {
            cVar.a(d12);
            lh.f fVar = this.f32649s3;
            if (fVar != null) {
                fVar.invalidate();
            }
            eh ehVar = this.f32653t3;
            if (ehVar != null) {
                ehVar.invalidate();
            }
        }
        this.f28672b.invalidate();
        int i21 = 0;
        while (true) {
            uh[] uhVarArr = this.f32652t2;
            if (i21 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i21];
            if (uhVar != null) {
                uhVar.d();
            }
            i21++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            this.G0 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27981i5, this.I0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0), false, null);
            if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
                z10 = true;
            }
            org.telegram.messenger.g0.n3(this, z10);
            return;
        }
        P(org.telegram.ui.ActionBar.m6.f27963h5);
    }

    public final void P1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci.P1(int):void");
    }

    public final void Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci.Q0(boolean):void");
    }

    public final void Q1() {
        int i7 = 0;
        P1(0);
        this.f32634o3.invalidate();
        bi.x5 x5Var = this.L2;
        x5Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            il ilVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.X();
            if (ilVar != null && ilVar.getFastScroll() != null) {
                ui0 fastScroll = ilVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f31238p1;
                if (this.W1) {
                    i7 = (int) (x5Var.getAlpha() * x5Var.getMeasuredHeight());
                }
                fastScroll.f38676h0 = currentActionBarHeight + i7;
                ilVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.f32625m1.f55498e;
        float f11 = (1.0f - this.l1.f55498e) * f10;
        this.f32653t3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.n1.f55498e))), 1.0f - f11));
    }

    public final void S0(uh uhVar) {
        int L;
        boolean e10 = uhVar.e();
        int i7 = 0;
        lh.f fVar = this.f32649s3;
        if (fVar != null) {
            if (e10) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            fVar.setFadeHeightBottom(L);
        }
        eh ehVar = this.f32653t3;
        if (ehVar != null) {
            if (e10) {
                i7 = 4;
            }
            ehVar.setVisibility(i7);
        }
    }

    public final void T0() {
        float f10;
        float f11 = this.f32632o1.f55498e;
        float f12 = this.f32635p1.f55498e;
        float a10 = a8.j7.a(this.f32639q1.f55498e);
        if (this.O3) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        p00.d(this.C2, com.google.android.recaptcha.internal.a.D(f11, f12, a10, f10));
    }

    @Override
    public final ArrayList U() {
        ArrayList<org.telegram.ui.ActionBar.v6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            uh[] uhVarArr = this.f32652t2;
            if (i7 < uhVarArr.length) {
                uh uhVar = uhVarArr[i7];
                if (uhVar != null && (themeDescriptions = uhVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i7++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.f28675c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27981i5));
                return arrayList;
            }
        }
    }

    public final void U0() {
        kh khVar = this.F2;
        ch chVar = this.E2;
        bi.x5 x5Var = this.L2;
        if (x5Var != null && x5Var.getVisibility() == 0 && x5Var.getAlpha() != 0.0f) {
            float f10 = this.l1.f55498e;
            float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
            khVar.setAlpha(abs * abs * abs * abs);
            chVar.setTranslationY(org.telegram.messenger.g0.T1(this.f32601d4, ((x5Var.getTranslationY() + x5Var.getTop()) - chVar.getTop()) + org.telegram.messenger.g0.L(8.0f), wq.f40049j.getInterpolation(f10)));
            return;
        }
        chVar.setTranslationY(this.f32601d4);
        khVar.setAlpha(1.0f);
    }

    public final void V0(int i7) {
        this.P2 = true;
        this.f32657u3.setVisibility(0);
        this.B1 = true;
        this.C1 = i7;
        this.N2 = 0;
        this.f32675z1 = false;
        this.A1 = false;
        this.D1 = null;
        org.telegram.ui.ActionBar.r0 r0Var = this.f32612h3;
        if (r0Var != null) {
            this.f32609g3.setTranslationY(0.0f);
            r0Var.setVisibility(8);
        }
    }

    public final void W0(hi.u1 u1Var) {
        String M0 = org.telegram.messenger.id.M0(2131752122, null);
        TextView textView = this.f32609g3;
        textView.setText(M0);
        this.P2 = false;
        this.f32657u3.setVisibility(8);
        this.N2 = 1;
        this.f32675z1 = true;
        this.A1 = true;
        this.f32597c2 = false;
        this.D1 = u1Var;
        org.telegram.ui.ActionBar.r0 r0Var = this.f32612h3;
        if (r0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            r0Var.setVisibility(0);
            r0Var.setClickable(true);
            r0Var.setAlpha(1.0f);
            r0Var.setScaleX(1.0f);
            r0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (!(f2Var instanceof org.telegram.ui.cn) || (mjVar = ((org.telegram.ui.cn) f2Var).f44694v5) == null || (kjVar = mjVar.f24035b) == null) {
            return 0;
        }
        return kjVar.f23706g.size();
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        uh uhVar;
        int i10;
        if (i7 == 0) {
            U0();
            R0();
            return;
        }
        int i11 = 1;
        if (i7 == 2) {
            R0();
            an anVar = this.f32608g2;
            if (anVar != null && ((uhVar = this.f32664w2) == anVar || this.f32660v2 == anVar)) {
                if (uhVar == anVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                P1(i10);
            }
            an anVar2 = this.f32611h2;
            if (anVar2 != null) {
                uh uhVar2 = this.f32664w2;
                if (uhVar2 == anVar2 || this.f32660v2 == anVar2) {
                    if (uhVar2 != anVar2) {
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
            kh khVar = this.F2;
            if (khVar != null) {
                khVar.setEphemeralFactor(f10);
                khVar.setSameWidthFactor(f10);
            }
        }
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).f44473e;
        }
        return org.telegram.messenger.qp.s1(this.G3).M0(Long.valueOf(-this.T1));
    }

    public final float Z0() {
        ch chVar = this.A2;
        float alpha = 1.0f - chVar.getAlpha();
        return chVar.getMeasuredHeight() - (alpha * (chVar.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override
    public final void a(boolean z9) {
        if (z9) {
            this.A4 = z9;
        }
        dismiss();
    }

    public final kt a1() {
        uh uhVar;
        if (this.W1 && ((uhVar = this.f32660v2) == this.d2 || uhVar == this.f32619k2)) {
            return this.M2;
        }
        return this.B2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).a();
        }
        return this.T1;
    }

    public final int c1(int i7) {
        uh uhVar = this.f32664w2;
        int[] iArr = this.Y3;
        if (uhVar != null && ((this.f32660v2 instanceof am) || (uhVar instanceof am))) {
            return org.telegram.messenger.g0.W1(this.X1, iArr[0], iArr[1]);
        }
        return iArr[i7];
    }

    public final int d1(boolean z9) {
        boolean q10;
        int i7;
        q7 q7Var;
        if (this.f32604e4) {
            return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27973hh, this.I0);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        if (h6Var != null) {
            q10 = h6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        Iterator it = this.f32643r1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.f55507a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = c8.j9.a(f10, 0.0f, 1.0f);
        if (z9 && (q7Var = this.U2) != null && q7Var.getVisibility() == 0) {
            a10 *= 1.0f - q7Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0);
        if (q10) {
            i7 = org.telegram.ui.ActionBar.m6.f27834a7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f27981i5;
        }
        return i0.a.f(a10, w02, org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.T0 && i7 != org.telegram.messenger.qs.W4 && i7 != org.telegram.messenger.qs.F1) {
            if (i7 == org.telegram.messenger.qs.f25005f5) {
                this.E1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).H0();
                return;
            }
            return;
        }
        zh zhVar = this.f32669x3;
        if (zhVar != null) {
            zhVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z9;
        hh hhVar;
        fh fhVar;
        if (!this.f32660v2.q() && !this.I) {
            uh uhVar = this.f32660v2;
            hk hkVar = this.f32640q2;
            if (uhVar == hkVar && hkVar != null && !hkVar.K && hkVar.P0 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f32644r2 = z9;
            if (!z9 && (fhVar = this.B2) != null) {
                org.telegram.messenger.g0.v1(fhVar.getEditText());
            }
            if (!this.f32644r2 && (hhVar = this.M2) != null) {
                org.telegram.messenger.g0.v1(hhVar.getEditText());
            }
            this.f32656u2.clear();
            org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
            if (f2Var == null) {
                f2Var = LaunchActivity.Q();
            }
            if (!this.A4 && f2Var != null && this.f32660v2.getSelectedItemsCount() > 0 && !this.f32675z1) {
                if (!this.f32678z4) {
                    this.f32678z4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), this.I0);
                    String M0 = org.telegram.messenger.id.M0(2131751399, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131751400, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751406, null), new lg(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    u1Var.setOnCancelListener(new sg(this, 0));
                    u1Var.N = new o0(this, 4);
                    u1Var.show();
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, this.I0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = 0;
            while (true) {
                uh[] uhVarArr = this.f32652t2;
                if (i7 >= uhVarArr.length) {
                    break;
                }
                uh uhVar2 = uhVarArr[i7];
                if (uhVar2 != null && this.f32660v2 != uhVar2) {
                    uhVar2.q();
                }
                i7++;
            }
            org.telegram.messenger.g0.u3(this, i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0), 0), true, new lg(this, 11));
            if (f2Var != null) {
                org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
            }
            this.f32607f4 = false;
            super.dismiss();
            this.A4 = false;
        }
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci.e1():void");
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f32660v2.o(motionEvent);
    }

    public final boolean f1() {
        if (this.W1) {
            uh uhVar = this.f32660v2;
            if (uhVar == this.d2 || uhVar == this.f32619k2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z9) {
        long j3;
        ai aiVar = this.W3;
        if (aiVar != null && !this.f32645r3) {
            boolean f02 = aiVar.f0();
            this.f32645r3 = true;
            bi.u7 u7Var = new bi.u7(this, editTextBoldCursor, z9, 19);
            if (f02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(u7Var, j3);
        }
    }

    public final void i1() {
        if (this.f28702r0 != null && this.f28672b != null) {
            int d12 = d1(false);
            org.telegram.ui.ActionBar.m6.C1(d12, this.f28702r0);
            ri.c cVar = this.D4;
            if (cVar.f54575b != d12) {
                cVar.a(d12);
                lh.f fVar = this.f32649s3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                eh ehVar = this.f32653t3;
                if (ehVar != null) {
                    ehVar.invalidate();
                }
            }
            L1();
            this.f28672b.invalidate();
        }
    }

    @Override
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final hk hkVar = this.f32640q2;
        if (hkVar != null && this.f32660v2 == hkVar) {
            final pg pgVar = new pg(this, 1);
            int i7 = hkVar.f34380n;
            org.telegram.ui.Wallet.n9 n9Var = hkVar.R;
            ci ciVar = hkVar.f38656b;
            AnimatorSet animatorSet = null;
            if (!hkVar.K && (wallettransaction = hkVar.P0) != null && hkVar.Q0 == null && hkVar.R0 == null) {
                if (hkVar.S0) {
                    org.telegram.ui.Wallet.z5 z5Var = new org.telegram.ui.Wallet.z5();
                    z5Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                    if (f2Var != null && f2Var.presentFragment(z5Var, false, true)) {
                        org.telegram.ui.Wallet.ca caVar = new org.telegram.ui.Wallet.ca(ciVar.f28675c, ciVar.f28672b, n9Var.getDiamondView(), z5Var, hkVar.P0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!hkVar.K) {
                                            pgVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!hkVar.K) {
                                            pgVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, ciVar);
                        hkVar.R0 = caVar;
                        animatorSet = caVar.f42258m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.x6 diamondView = n9Var.getDiamondView();
                    if (diamondView.f43342f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
                        if (f2Var2 instanceof org.telegram.ui.cn) {
                            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var2;
                            if (cnVar.getCurrentAccount() == i7 && cnVar.a() == hkVar.f34385r.f27109id && cnVar.f44492f4 == 0 && cnVar.getFragmentView() != null && cnVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.p6 p6Var = new org.telegram.ui.Wallet.p6(ciVar.f28675c, ciVar.f28672b, n9Var.getDiamondView(), cnVar, hkVar.P0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!hkVar.K) {
                                                    pgVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!hkVar.K) {
                                                    pgVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, ciVar);
                                hkVar.Q0 = p6Var;
                                animatorSet = p6Var.f43000m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.f28714z0 = animatorSet;
                this.A0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        int i7 = 0;
        while (true) {
            uh[] uhVarArr = this.f32652t2;
            if (i7 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null) {
                uhVar.p();
            }
            i7++;
        }
        int i10 = this.G3;
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25005f5);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.F1);
        this.P1 = true;
        fh fhVar = this.B2;
        if (fhVar != null) {
            fhVar.o();
        }
        hh hhVar = this.M2;
        if (hhVar != null) {
            hhVar.o();
        }
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        boolean z9;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        r71 r71Var = chatAttachAlertPhotoLayout.f31231l0;
        bi.e5 e5Var = chatAttachAlertPhotoLayout.f31227j0;
        TextView textView = chatAttachAlertPhotoLayout.f31237p0;
        il ilVar = chatAttachAlertPhotoLayout.f31240r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i15 = org.telegram.messenger.g0.f22562n;
        if (view == e5Var) {
            if (z9) {
                if (ilVar.getVisibility() == 0) {
                    e5Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                e5Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (ilVar.getVisibility() == 0) {
                e5Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            } else {
                e5Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == r71Var) {
            if (z9) {
                if (ilVar.getVisibility() == 0) {
                    r71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                r71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            } else if (ilVar.getVisibility() == 0) {
                r71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            } else {
                r71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
                return true;
            }
        } else if (view == textView) {
            if (z9) {
                L = (i13 - textView.getMeasuredWidth()) / 2;
                int L2 = i12 - org.telegram.messenger.g0.L(167.0f);
                textView.setRotation(0.0f);
                if (ilVar.getVisibility() == 0) {
                    L2 -= org.telegram.messenger.g0.L(96.0f);
                }
                measuredWidth = L2 - i15;
            } else {
                L = i11 - org.telegram.messenger.g0.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
                textView.setRotation(-90.0f);
                if (ilVar.getVisibility() == 0) {
                    L -= org.telegram.messenger.g0.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != ilVar) {
            return false;
        } else {
            if (z9) {
                int z10 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z10, view.getMeasuredWidth(), view.getMeasuredHeight() + z10);
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
            p10 = org.telegram.messenger.t10.p(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(this.G3).f25806b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.f27109id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.id.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.id.M0(2131753001, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.id.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        u1Var.T = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, "OK"), new a3.h(this, tL_attachMenuBot, user, 24));
        jg.g.w("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        sl slVar = chatAttachAlertPhotoLayout.f31247w;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        il ilVar = chatAttachAlertPhotoLayout.f31240r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.f31242s;
        if (i7 < i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (view == chatAttachAlertPhotoLayout.P) {
            if (chatAttachAlertPhotoLayout.f31211b0 && !chatAttachAlertPhotoLayout.f31215d0) {
                chatAttachAlertPhotoLayout.P.measure(View.MeasureSpec.makeMeasureSpec(ciVar.T() + ciVar.S() + i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            bi.e5 e5Var = chatAttachAlertPhotoLayout.f31227j0;
            if (view == e5Var) {
                if (z9) {
                    e5Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824));
                    return true;
                }
                e5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            r71 r71Var = chatAttachAlertPhotoLayout.f31231l0;
            if (view == r71Var) {
                if (z9) {
                    r71Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                    return true;
                }
                r71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == ilVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z9) {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
                    if (b0Var.f57021o != 0) {
                        ilVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        slVar.f();
                    }
                } else {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (b0Var.f57021o != 1) {
                        ilVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        slVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        int i7 = 0;
        while (true) {
            uh[] uhVarArr = this.f32652t2;
            if (i7 < uhVarArr.length) {
                uh uhVar = uhVarArr[i7];
                if (uhVar != null) {
                    uhVar.A();
                }
                i7++;
            } else {
                this.f32599c4 = true;
                return;
            }
        }
    }

    @Override
    public final boolean m0() {
        int i7;
        this.d2.setTranslationX(0.0f);
        this.f32620k3.setAlpha(0.0f);
        this.f32615i3.setAlpha(1.0f);
        this.f28672b.setTranslationY(this.f28672b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32631n4 = animatorSet;
        nh nhVar = this.f32624l4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, nhVar, 0.0f, 400.0f));
        this.f32631n4.setDuration(400L);
        this.f32631n4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        nhVar.getClass();
        nhVar.a(this, valueOf);
        this.f32631n4.start();
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new ng(this, 2));
        r1.g gVar = this.f32628m4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.f28672b, (r1.e) r1.g.f54263p, 0.0f);
        this.f32628m4 = gVar2;
        if (this.E3 != null) {
            gVar2.f54279m.a(0.75f);
            this.f32628m4.f54279m.b(350.0f);
        } else {
            gVar2.f54279m.a(0.75f);
            this.f32628m4.f54279m.b(350.0f);
        }
        this.f32628m4.h();
        if (this.J) {
            this.f28675c.setLayerType(2, null);
        }
        this.A0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28714z0 = animatorSet2;
        j6 j6Var = l6.d;
        if (this.f28698o0) {
            i7 = this.f28699p0;
        } else {
            i7 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Y, j6Var, i7));
        this.f28714z0.setDuration(400L);
        this.f28714z0.setStartDelay(20L);
        this.f28714z0.setInterpolator(this.f28694k0);
        h2.f fVar = new h2.f((int[]) null);
        mg mgVar = new mg(this, fVar, this.f28713y0, 1);
        this.f32628m4.a(new hi.y3(2, this, mgVar));
        this.f28714z0.addListener(new ah.l(25, this, mgVar));
        fVar.d();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25025j1, 512);
        this.f28714z0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new ng(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(wq.f40046f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        this.f32599c4 = false;
        while (true) {
            uh[] uhVarArr = this.f32652t2;
            if (i7 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null) {
                uhVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.W3.f0();
        }
        zh zhVar = this.f32669x3;
        if (zhVar != null) {
            zhVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.ij ijVar = this.E3;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        int i7 = this.G3;
        if (ijVar != null && ijVar.p5() && !org.telegram.messenger.t3.z(i7, 24, org.telegram.messenger.ij.B0(this.E3.f23266k)) && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            org.telegram.messenger.nj njVar = cnVar.f44708w5;
            if (njVar == null) {
                njVar = org.telegram.messenger.nj.b(this.E3.f23266k.suggested_post);
            }
            if (!bi.ea.T(i7, njVar.f24206a)) {
                cnVar.zc(njVar);
                return;
            }
        }
        if (this.E1 - this.F1 < 0) {
            org.telegram.messenger.g0.F3(this.f32651t1);
            org.telegram.messenger.g0.F3(this.f32655u1);
            try {
                this.F2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.qp.s1(i7).D3() && org.telegram.messenger.qp.s1(i7).U4 > this.F1) {
                D1(f2Var);
                return;
            }
            return;
        }
        if (this.E3 == null && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.ui.cn cnVar2 = (org.telegram.ui.cn) f2Var;
            if (cnVar2.c()) {
                u4.J(getContext(), cnVar2.a(), new lg(this, 14), this.I0);
                return;
            }
        }
        uh uhVar = this.f32660v2;
        if (uhVar != this.d2 && uhVar != this.f32619k2) {
            if (!uhVar.L(true, 0, 0, this.K2, f1())) {
                this.A4 = true;
                dismiss();
                return;
            }
            return;
        }
        u1(true, 0, 0, this.K2, f1());
    }

    @Override
    public final void o0() {
        if (this.f32660v2.s()) {
            dismiss();
        }
    }

    public final void o1(int i7) {
        Activity activity;
        boolean z9 = true;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (i7 == 3) {
            if (this.K3 || !N0()) {
                if (f2Var != null) {
                    activity = f2Var.getParentActivity();
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
        } else if (i7 == 6 && org.telegram.messenger.g0.J1(f2Var)) {
            if (this.f32614i2 == null) {
                vk vkVar = new vk(this, getContext(), this.I0, (this.B1 || this.O3) ? false : false);
                this.f32614i2 = vkVar;
                this.f32652t2[5] = vkVar;
                uk ukVar = this.f32654t4;
                if (ukVar != null) {
                    vkVar.setDelegate(ukVar);
                } else if (f2Var instanceof org.telegram.ui.cn) {
                    vkVar.setDelegate(new lg(this, 18));
                }
            }
            F1(this.f32614i2);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.M1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        q7 q7Var = this.U2;
        if (q7Var.f27691n0) {
            q7Var.n(true);
        } else if (this.f32660v2.k()) {
        } else {
            if (a1() != null && a1().f35436e) {
                a1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f32660v2.G(i7)) {
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
            ((LaunchActivity) context).f41299z0.add(this.M1);
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
            ((LaunchActivity) context).f41299z0.remove(this.M1);
        }
    }

    public final void p1(boolean z9) {
        if (!this.K3 && z9) {
            bn bnVar = new bn(3, getContext(), this.I0, this);
            this.N1 = bnVar;
            F1(bnVar);
        }
        int i7 = 1;
        if (this.f32605f2 == null) {
            mi miVar = new mi(getContext(), this.I0, this);
            this.f32605f2 = miVar;
            this.f32652t2[3] = miVar;
            miVar.setupBlurredSearchField(this.E4);
            this.f32605f2.setDelegate(new lg(this, 15));
            if (this.B1) {
                this.f32605f2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            TLRPC.Chat chat = ((org.telegram.ui.cn) f2Var).f44473e;
            mi miVar2 = this.f32605f2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                i7 = -1;
            }
            miVar2.setMaxSelectedFiles(i7);
        }
        if (z9) {
            F1(this.f32605f2);
        }
    }

    public final void q1() {
        boolean z9;
        if (!this.N3) {
            bn bnVar = new bn(5, getContext(), this.I0, this);
            this.N1 = bnVar;
            F1(bnVar);
        }
        if (this.f32602e2 == null) {
            ej ejVar = new ej(getContext(), this.I0, this);
            this.f32602e2 = ejVar;
            this.f32652t2[2] = ejVar;
            ejVar.setupBlurredSearchField(this.E4);
            this.f32602e2.setDelegate(new lh(this));
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            TLRPC.Chat chat = ((org.telegram.ui.cn) f2Var).f44473e;
            ej ejVar2 = this.f32602e2;
            if (chat != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled) {
                z9 = false;
            } else {
                z9 = true;
            }
            ejVar2.setMultipleSelectionAllowed(z9);
        }
        F1(this.f32602e2);
    }

    public final void r1(boolean z9) {
        int i7;
        if (!this.H3 && z9) {
            bn bnVar = new bn(4, getContext(), this.I0, this);
            this.N1 = bnVar;
            F1(bnVar);
        }
        boolean z10 = false;
        if (this.f32617j2 == null) {
            if (this.H1) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            uj ujVar = new uj(i7, getContext(), this.I0, this);
            this.f32617j2 = ujVar;
            this.f32652t2[4] = ujVar;
            ujVar.setDelegate(new mh(this));
        }
        int i10 = 1;
        if (this.B1) {
            this.f32617j2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
            if (f2Var instanceof org.telegram.ui.cn) {
                TLRPC.Chat chat = ((org.telegram.ui.cn) f2Var).f44473e;
                uj ujVar2 = this.f32617j2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                    i10 = -1;
                }
                ujVar2.setMaxSelectedFiles(i10);
            } else {
                this.f32617j2.setMaxSelectedFiles(this.P3);
                uj ujVar3 = this.f32617j2;
                if (!this.H1 && !this.Q1) {
                    z10 = true;
                }
                ujVar3.setCanSelectOnlyImageFiles(z10);
            }
        }
        uj ujVar4 = this.f32617j2;
        ujVar4.f38694d0 = this.H1;
        if (z9) {
            F1(ujVar4);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P0();
            dh.d dVar = this.V1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27998j5, this.I0);
            org.telegram.ui.ActionBar.r0 r0Var = this.f32612h3;
            if (r0Var != null && w02 != this.o4) {
                this.o4 = w02;
                r0Var.setIconColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        boolean z9;
        super.show();
        this.F3 = false;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            this.f28688h0 = ((org.telegram.ui.cn) f2Var).U9();
        }
        L1();
        this.f32637p3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0), 0);
            this.G0 = o4;
            org.telegram.messenger.g0.u3(this, o4, false, null);
            if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
        }
        if (this.f32618j4) {
            this.f32618j4 = false;
            q7 q7Var = this.U2;
            q7Var.updateColors();
            q7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.f28672b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        q7 q7Var = this.U2;
        int i7 = 1;
        if (q7Var.f27691n0) {
            q7Var.n(true);
        }
        this.f32602e2 = null;
        this.f32626m2 = null;
        this.f32605f2 = null;
        this.f32608g2 = null;
        this.f32611h2 = null;
        this.f32614i2 = null;
        this.f32617j2 = null;
        this.f32640q2 = null;
        while (true) {
            uh[] uhVarArr = this.f32652t2;
            if (i7 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null) {
                uhVar.p();
                this.f28672b.removeView(uhVarArr[i7]);
                uhVarArr[i7] = null;
            }
            i7++;
        }
        I1(false, false);
        super.K();
        if (this.f32644r2) {
            this.f32644r2 = false;
            this.f32648s2 = 0.0f;
            org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
            if (f2Var != null && f2Var.getFragmentView() != null) {
                View fragmentView = f2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f54202a;
                r0.y.c(fragmentView);
            }
        }
    }

    @Override
    public final void u0(boolean z9) {
        this.f28700q0 = true;
    }

    public final boolean u1(final boolean z9, final int i7, final int i10, final long j3, final boolean z10) {
        if (this.F3) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            TLRPC.Chat chat = cnVar.f44473e;
            if (cnVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.G3).f24768d7.edit();
                edit.putBoolean("silent_" + cnVar.a(), !z9).commit();
            }
        }
        int i11 = 1;
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.f32639q1.f55499f) {
            this.F3 = true;
            this.W3.o1(7, true, z9, i7, i10, j3, z10, false, 0L);
            return true;
        }
        long b12 = b1();
        uh uhVar = this.f32660v2;
        if (uhVar != null) {
            i11 = uhVar.getSelectedItemsCount();
        }
        return u4.Y(this.G3, b12, X0() + i11, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                ci ciVar = ci.this;
                ciVar.F3 = true;
                ciVar.W3.o1(7, true, z9, i7, i10, j3, z10, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override
    public final void v() {
        if (this.Z1 instanceof org.telegram.ui.cn) {
            String[] strArr = MediaController.V1;
        } else {
            String[] strArr2 = MediaController.V1;
        }
        this.f32660v2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754921, "AccDescrAttachButton"));
        this.f32637p3 = true;
        if (!this.J3 && !this.I3) {
            N0();
        }
    }

    public final void v1(boolean z9, boolean z10) {
        final boolean z11;
        boolean z12;
        final boolean z13;
        int i7;
        float f10;
        float f11;
        float measuredHeight;
        this.l1.a(z9, z10);
        kt a12 = a1();
        this.W1 = z9;
        kt a13 = a1();
        int i10 = 0;
        if (this.A2.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        uh uhVar = this.f32660v2;
        if (uhVar != this.d2 && uhVar != this.f32619k2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.W1 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i11 = 8;
        float f12 = 1.0f;
        bi.x5 x5Var = this.L2;
        kg.j jVar = this.f32676z2;
        float f13 = 0.0f;
        if (z10) {
            if (z11) {
                i11 = 0;
            }
            x5Var.setVisibility(i11);
            ViewPropertyAnimator animate = x5Var.animate();
            if (z13 && z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            wq wqVar = wq.h;
            duration.setInterpolator(wqVar).setUpdateListener(new ng(this, 0)).withEndAction(new Runnable(this) {
                public final ci f36601b;

                {
                    this.f36601b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ci ciVar = this.f36601b;
                            if (!z13 || !z11) {
                                ciVar.L2.setVisibility(8);
                            }
                            ciVar.Q1();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f36601b.f32676z2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator animate2 = jVar.animate();
            if (!z13 && z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = jVar.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z13 || !z11) {
                f12 = 0.0f;
            }
            translationY.alpha(f12).setDuration(320L).setInterpolator(wqVar).setUpdateListener(new ng(this, 1)).withEndAction(new Runnable(this) {
                public final ci f36601b;

                {
                    this.f36601b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ci ciVar = this.f36601b;
                            if (!z13 || !z11) {
                                ciVar.L2.setVisibility(8);
                            }
                            ciVar.Q1();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f36601b.f32676z2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z13 && z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            x5Var.setVisibility(i7);
            if (z13 && z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x5Var.setAlpha(f10);
            Q1();
            if (z13 || !z11) {
                f12 = 0.0f;
            }
            jVar.setAlpha(f12);
            if (z13 || !z11) {
                f13 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f13);
            if (z13 || !z11) {
                i10 = 8;
            }
            jVar.setVisibility(i10);
        }
        if (a12 != a13) {
            a12.k(true);
            a13.setText(q5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new pg(this, 0));
    }

    public final void w1(int i7, org.telegram.messenger.ij ijVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (ijVar != null && (chatAttachAlertPhotoLayout = this.d2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.E3 == ijVar && this.D3 == i7) {
            return;
        }
        this.E3 = ijVar;
        if (ijVar != null && ijVar.z2()) {
            if (this.E3.I3()) {
                i7 = 2;
            } else if (this.E3.U2()) {
                i7 = 1;
            } else {
                i7 = 0;
            }
        }
        this.D3 = i7;
        if (this.E3 != null) {
            this.P3 = 1;
            this.Q3 = false;
        } else {
            this.P3 = -1;
            this.Q3 = true;
        }
        this.f32669x3.f();
        K1(0);
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i7;
        float translationY = this.f28672b.getTranslationY() - this.f32648s2;
        this.f32648s2 = this.f28672b.getHeight() * f10;
        this.f28672b.setTranslationY(translationY);
        hk hkVar = this.f32640q2;
        if (hkVar != null) {
            hkVar.setSendTransitionProgress(f10);
        }
        if (this.f28698o0) {
            i7 = Math.round((1.0f - f10) * this.f28699p0);
        } else {
            i7 = 0;
        }
        this.Y.setAlpha(i7);
        this.C0 = 1.0f - f10;
        this.f28675c.invalidate();
    }

    public final void y1(int i7, boolean z9) {
        if (this.E3 != null) {
            return;
        }
        this.P3 = i7;
        this.Q3 = z9;
    }

    public final void z1(float f10) {
        boolean z9 = false;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.G0 = o4;
        org.telegram.messenger.g0.u3(this, o4, false, null);
        if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
            z9 = true;
        }
        org.telegram.messenger.g0.n3(this, z9);
        this.f28675c.invalidate();
    }

    public ci(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, boolean z11, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        org.telegram.ui.ActionBar.r0 r0Var;
        ei.k kVar;
        boolean z12;
        float f10;
        wq wqVar = wq.h;
        this.l1 = new te.a(0, this, wqVar, 380L, false);
        this.f32625m1 = new te.a(1, this, wqVar, 380L, false);
        this.n1 = new te.a(2, this, wqVar, 380L, false);
        this.f32632o1 = new te.a(3, this, wqVar, 380L, false);
        this.f32635p1 = new te.a(4, this, wqVar, 380L, true);
        this.f32639q1 = new te.a(5, this, wqVar, 320L, false);
        te.j jVar = new te.j(new lg(this, 2), wqVar, 380L);
        this.f32643r1 = jVar;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.X1 = 0.0f;
        this.Y1 = new nh(this, 0);
        this.f32597c2 = false;
        uh[] uhVarArr = new uh[12];
        this.f32652t2 = uhVarArr;
        this.f32656u2 = new LongSparseArray();
        this.D2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G2 = textPaint;
        this.H2 = new RectF();
        this.I2 = new Paint(1);
        this.R2 = true;
        this.S2 = 1.0f;
        this.f32673y3 = false;
        this.A3 = false;
        int i7 = org.telegram.messenger.p10.f24474s0;
        this.G3 = i7;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.M3 = true;
        this.N3 = true;
        this.P3 = -1;
        this.Q3 = true;
        this.V3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.Y3 = new int[2];
        new Paint(1);
        this.f32607f4 = false;
        ArrayList arrayList = new ArrayList();
        this.f32610g4 = arrayList;
        Rect rect = new Rect();
        this.f32613h4 = rect;
        this.f32624l4 = new nh(this, 1);
        this.f32646r4 = true;
        this.f32650s4 = false;
        this.f32678z4 = false;
        this.A4 = false;
        this.f28712y = true;
        ri.c cVar = new ri.c();
        this.D4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, this.I0));
        this.X0.E.add(new oi.o(cVar, new lg(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f()) {
            dh.g gVar = new dh.g(false);
            this.C4 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(cVar);
            fVar.f54584f = cVar;
            fVar.d = gVar;
            fVar.f54583e = -2;
            ri.f fVar2 = new ri.f(null);
            fVar2.f54584f = cVar;
            fVar2.d = gVar;
            fVar2.f54583e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.E4 = cVar2;
            cVar2.f8713k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.f8708e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.F4 = cVar3;
            cVar3.f8713k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.f8708e = L2;
        } else {
            this.C4 = null;
            this.E4 = new dh.c(cVar, cVar, cVar);
            this.F4 = new dh.c(cVar, cVar, cVar);
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.G4 = new tg(this, 0);
        this.f32604e4 = z9;
        this.f32591a2 = (f2Var instanceof org.telegram.ui.cn) && f2Var.isInBubbleMode();
        this.f28694k0 = new OvershootInterpolator(0.7f);
        this.Z1 = f2Var;
        this.F = true;
        this.f28713y0 = this;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25005f5);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.F1);
        arrayList.add(rect);
        ph phVar = new ph(this, context);
        this.f32634o3 = phVar;
        phVar.setDelegate(new qh(this));
        this.f28672b = phVar;
        phVar.setWillNotDraw(false);
        this.f28672b.setClipChildren(false);
        this.f28672b.setClipToPadding(false);
        ViewGroup viewGroup = this.f28672b;
        int i10 = this.f28705t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        q7 q7Var = new q7(this, context, h6Var, 1);
        this.U2 = q7Var;
        q7Var.f27669c1 = true;
        q7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        q7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i11 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i11, h6Var);
        int i12 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, i11, h6Var);
        q7Var.setOccupyStatusBar(true);
        q7Var.setAlpha(0.0f);
        q7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 12));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.I0), false, h6Var);
        this.X2 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(2131231244);
        r0Var2.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        r0Var2.setVisibility(4);
        r0Var2.setAlpha(0.0f);
        r0Var2.setScaleX(0.6f);
        r0Var2.setScaleY(0.6f);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setDelegate(new lg(this, 10));
        r0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 6, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(r0Var2, h02, null, M, h6Var);
        r0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var3 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i13 = 2131748832;
                            } else {
                                i13 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i13, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var3.getWidth() / 2.0f) + r0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.I0), false, h6Var);
        this.Z2 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        fi.u uVar = new fi.u();
        this.Y2 = uVar;
        r0Var3.setIcon(uVar);
        r0Var3.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        r0Var3.setVisibility(8);
        r0Var3.setAlpha(0.0f);
        r0Var3.setScaleX(0.6f);
        r0Var3.setScaleY(0.6f);
        r0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 6, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        r0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(r0Var3, h03, null, M2, h6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i13 = 2131748832;
                            } else {
                                i13 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i13, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        ei.k kVar2 = new ei.k(this, context);
        org.telegram.ui.ActionBar.t6.U(kVar2, org.telegram.ui.ActionBar.m6.Gi, h6Var);
        kVar2.setText(org.telegram.messenger.id.M0(2131751753, null));
        kVar2.setTypeface(org.telegram.messenger.g0.o());
        kVar2.setTextSize(1, 14.0f);
        kVar2.setVisibility(4);
        kVar2.setAlpha(0.0f);
        kVar2.setGravity(17);
        kVar2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        kVar2.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        kVar2.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i13 = 2131748832;
                            } else {
                                i13 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i13, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        c8.ka.a(kVar2);
        this.f32598c3 = kVar2;
        L1();
        if (f2Var != null) {
            r0Var = r0Var3;
            kVar = kVar2;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.r0 r0Var4 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.I0), false, h6Var);
            this.f32595b3 = r0Var4;
            r0Var4.setLongClickEnabled(false);
            r0Var4.setIcon(2131232486);
            r0Var4.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
            r0Var4.setVisibility(4);
            z12 = false;
            r0Var4.setAlpha(0.0f);
            r0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 6, -1);
            org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i12);
            r0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.t6.j(r0Var4, h04, null, M3, h6Var);
            r0Var4.setOnClickListener(new di.a2(5, this, z10));
        } else {
            r0Var = r0Var3;
            kVar = kVar2;
            z12 = false;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.r0 r0Var5 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i11, this.I0), false, h6Var);
        this.f32612h3 = r0Var5;
        r0Var5.setLongClickEnabled(false);
        r0Var5.setIcon(2131231244);
        r0Var5.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        r0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 3, -1);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i12);
        r0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(r0Var5, h05, null, M4, h6Var);
        r0Var5.e(1, 2131232044, org.telegram.messenger.id.M0(2131744877, null)).setOnClickListener(new View.OnClickListener(this) {
            public final ci f37639b;

            {
                this.f37639b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.cn cnVar;
                switch (r3) {
                    case 0:
                        final ci ciVar = this.f37639b;
                        fh fhVar = ciVar.B2;
                        if (fhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(ciVar.getContext(), h6Var);
                            f0Var.r1(fhVar.getText());
                            f0Var.f33408e2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fh fhVar2 = ciVar.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            hh hhVar = ciVar.M2;
                                            hhVar.setText(charSequence);
                                            hhVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = ciVar.T1;
                            if (ciVar.E3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            vg vgVar = new vg(ciVar, 0);
                            f0Var.f33410g2 = j3;
                            f0Var.f33411h2 = z13;
                            f0Var.f33412i2 = vgVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ci ciVar2 = this.f37639b;
                        hh hhVar = ciVar2.M2;
                        if (hhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(ciVar2.getContext(), h6Var);
                            f0Var2.r1(hhVar.getText());
                            f0Var2.f33408e2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fh fhVar2 = ciVar2.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            hh hhVar2 = ciVar2.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = ciVar2.T1;
                            if (ciVar2.E3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            vg vgVar2 = new vg(ciVar2, 1);
                            f0Var2.f33410g2 = j10;
                            f0Var2.f33411h2 = z14;
                            f0Var2.f33412i2 = vgVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ci ciVar3 = this.f37639b;
                        ciVar3.f32612h3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar3.Z1;
                        p12.H2(null, f2Var2, h6Var);
                        PhotoViewer.p1().I2(ciVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i13 = ciVar3.P3;
                        boolean z15 = ciVar3.Q3;
                        p13.h = i13;
                        p13.f41459n = z15;
                        if (!ciVar3.W3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(ciVar3.f28675c.findFocus());
                        }
                        File w10 = fi.e7.w(ciVar3.G3, "webp");
                        Point point = org.telegram.messenger.g0.f22567q;
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
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        th thVar = new th(ciVar3, gfVar);
                        if (f2Var2 instanceof org.telegram.ui.cn) {
                            cnVar = (org.telegram.ui.cn) f2Var2;
                        } else {
                            cnVar = null;
                        }
                        p14.e2(arrayList2, 0, 11, false, thVar, cnVar);
                        if (ciVar3.A1) {
                            PhotoViewer.p1().S0(null, null, true, ciVar3.D1);
                            return;
                        }
                        return;
                }
            }
        });
        r0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        r0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        r0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i13 = 2131748832;
                            } else {
                                i13 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i13, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        ch chVar = new ch(this, context, 0);
        this.f32606f3 = chVar;
        chVar.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i13 = 2131748832;
                            } else {
                                i13 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i13, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        chVar.setAlpha(0.0f);
        chVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32615i3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f32609g3 = textView;
        org.telegram.messenger.k5.n(textView, i11, h6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.x(imageView, mutate, i11, h6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ha.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        chVar.addView(linearLayout, c8.ha.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f32620k3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.t6.x(imageView2, mutate2, i11, h6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ha.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f32623l3 = textView2;
        org.telegram.messenger.k5.n(textView2, i11, h6Var, 1, 16.0f);
        org.telegram.messenger.k5.m(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ha.r(-2, -2, 16));
        chVar.addView(linearLayout2, c8.ha.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z9, z11, h6Var);
        this.d2 = chatAttachAlertPhotoLayout;
        uhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f32660v2 = chatAttachAlertPhotoLayout;
        this.T2 = 1L;
        this.f28672b.addView(chatAttachAlertPhotoLayout, c8.ha.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.f32649s3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m);
        this.f28672b.addView(fVar3, c8.ha.g());
        this.f28672b.addView(chVar, c8.ha.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bi.x5 x5Var = new bi.x5(context, 12);
        this.L2 = x5Var;
        this.f28672b.addView(x5Var, c8.ha.e(-1, -2, 55));
        this.f28672b.addView(q7Var, c8.ha.c(-2.0f, -1));
        this.f28672b.addView(r0Var2, c8.ha.e(48, 48, 53));
        this.f28672b.addView(r0Var, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f32595b3;
        if (r0Var6 != null) {
            this.f28672b.addView(r0Var6, c8.ha.e(48, 48, 53));
        }
        chVar.addView(r0Var5, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f28672b.addView(kVar, c8.ha.e(-2, 48, 53));
        ch chVar2 = new ch(this, context, 1);
        this.f32657u3 = chVar2;
        dh dhVar = new dh(context, 0);
        this.f32661v3 = dhVar;
        dhVar.setClipChildren(true);
        dhVar.setClipToPadding(false);
        zh zhVar = new zh(this, context);
        this.f32669x3 = zhVar;
        dhVar.setAdapter(zhVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.f32665w3 = b0Var;
        dhVar.setLayoutManager(b0Var);
        dhVar.setVerticalScrollBarEnabled(false);
        dhVar.setHorizontalScrollBarEnabled(false);
        dhVar.setItemAnimator(null);
        dhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.t6.l(dhVar, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        dhVar.f37002y2 = true;
        dhVar.setOverScrollMode(2);
        dh.c cVar5 = this.E4;
        oi.q qVar = this.X0;
        cVar5.f8712j = qVar;
        this.F4.f8712j = qVar;
        cVar4.f8712j = qVar;
        eh ehVar = new eh(this, context, 0);
        this.f32653t3 = ehVar;
        dh.d dVar = new dh.d(cVar4.c(ehVar, null, false));
        this.V1 = dVar;
        if (org.telegram.messenger.iz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.f28672b.addView(ehVar, c8.ha.g());
        fh.g c10 = this.E4.c(chVar2, c8.g0.f(h6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        chVar2.setBackground(c10);
        dhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        dhVar.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3380a;
        dhVar.setOutlineProvider(new bg.s0(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(28.0f)));
        dhVar.setImportantForAccessibility(1);
        chVar2.addView(dhVar, c8.ha.g());
        this.f28672b.addView(chVar2, c8.ha.e(-1, 70, 81));
        dhVar.setOnItemClickListener(new di.q4(9, this, h6Var));
        dhVar.setOnItemLongClickListener(new lg(this, 3));
        i6 i6Var = new i6(context, true, false, true);
        this.B3 = i6Var;
        i6Var.setVisibility(8);
        i6Var.setAlpha(0.0f);
        i6Var.setGravity(17);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        i6Var.setPadding(L3, 0, L3, 0);
        i6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        i6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i13 = 2131748832;
                            } else {
                                i13 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i13, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        this.f28672b.addView(i6Var, c8.ha.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f32677z3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f28672b.addView(radialProgressView, c8.ha.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.m6.f28300z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView3, i13, h6Var, mode2);
        imageView3.setImageResource(2131231838);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i132;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i132 = 2131748832;
                            } else {
                                i132 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i132, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        ch chVar3 = new ch(this, context, 2);
        this.A2 = chVar3;
        kg.j jVar2 = new kg.j(this, context);
        this.f32676z2 = jVar2;
        chVar3.addView(jVar2, c8.ha.e(-1, -1, 119));
        fh.g c11 = this.F4.c(phVar, c8.g0.n(h6Var), false);
        this.f32668x2 = c11;
        c11.S = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.Q.f11515g = 0.4f;
        c11.n();
        fh.g c12 = this.E4.c(jVar2, c8.g0.n(h6Var), false);
        this.f32672y2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar2.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        chVar3.setWillNotDraw(false);
        chVar3.setVisibility(4);
        chVar3.setAlpha(0.0f);
        this.f28672b.addView(chVar3, c8.ha.e(-1, -2, 83));
        chVar3.setOnTouchListener(new ei.b(13));
        i6 i6Var2 = new i6(context, false, false, false);
        this.f32651t1 = i6Var2;
        i6Var2.setAllowCancel(true);
        i6Var2.setScaleProperty(0.6f);
        i6Var2.setVisibility(8);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i14 = org.telegram.ui.ActionBar.m6.f28282y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i14, h6Var);
        i6Var2.setTypeface(org.telegram.messenger.g0.o());
        i6Var2.setGravity(17);
        jVar2.addView(i6Var2, c8.ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f32659v1 = imageView4;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
        this.f32663w1 = v2Var;
        imageView4.setImageDrawable(v2Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.m6.Kl;
        org.telegram.ui.ActionBar.t6.s(imageView4, i15, h6Var, mode);
        int i16 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i16, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i16);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(imageView4, h06, null, M5, h6Var);
        jVar2.addView(imageView4, c8.ha.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37639b;

            {
                this.f37639b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.cn cnVar;
                switch (r3) {
                    case 0:
                        final ci ciVar = this.f37639b;
                        fh fhVar = ciVar.B2;
                        if (fhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(ciVar.getContext(), h6Var);
                            f0Var.r1(fhVar.getText());
                            f0Var.f33408e2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fh fhVar2 = ciVar.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            hh hhVar2 = ciVar.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = ciVar.T1;
                            if (ciVar.E3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            vg vgVar = new vg(ciVar, 0);
                            f0Var.f33410g2 = j3;
                            f0Var.f33411h2 = z13;
                            f0Var.f33412i2 = vgVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ci ciVar2 = this.f37639b;
                        hh hhVar = ciVar2.M2;
                        if (hhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(ciVar2.getContext(), h6Var);
                            f0Var2.r1(hhVar.getText());
                            f0Var2.f33408e2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fh fhVar2 = ciVar2.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            hh hhVar2 = ciVar2.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = ciVar2.T1;
                            if (ciVar2.E3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            vg vgVar2 = new vg(ciVar2, 1);
                            f0Var2.f33410g2 = j10;
                            f0Var2.f33411h2 = z14;
                            f0Var2.f33412i2 = vgVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ci ciVar3 = this.f37639b;
                        ciVar3.f32612h3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar3.Z1;
                        p12.H2(null, f2Var2, h6Var);
                        PhotoViewer.p1().I2(ciVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = ciVar3.P3;
                        boolean z15 = ciVar3.Q3;
                        p13.h = i132;
                        p13.f41459n = z15;
                        if (!ciVar3.W3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(ciVar3.f28675c.findFocus());
                        }
                        File w10 = fi.e7.w(ciVar3.G3, "webp");
                        Point point = org.telegram.messenger.g0.f22567q;
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
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        th thVar = new th(ciVar3, gfVar);
                        if (f2Var2 instanceof org.telegram.ui.cn) {
                            cnVar = (org.telegram.ui.cn) f2Var2;
                        } else {
                            cnVar = null;
                        }
                        p14.e2(arrayList2, 0, 11, false, thVar, cnVar);
                        if (ciVar3.A1) {
                            PhotoViewer.p1().S0(null, null, true, ciVar3.D1);
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
        this.E1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).H0();
        fh fhVar = new fh(this, context, phVar, h6Var);
        this.B2 = fhVar;
        fhVar.J = true;
        fhVar.setHint(org.telegram.messenger.id.M0(2131754454, "AddCaption"));
        fhVar.s();
        fhVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        fhVar.getEditText().addTextChangedListener(new gh(this, 0));
        jVar2.addView(fhVar, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar2.setClipChildren(false);
        chVar3.setClipChildren(false);
        fhVar.setClipChildren(false);
        x5Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        x5Var.setWillNotDraw(false);
        hh hhVar = new hh(this, context, phVar, h6Var);
        this.M2 = hhVar;
        hhVar.J = true;
        hhVar.getEditText().addTextChangedListener(new jh(this, f2Var));
        hhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        hhVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        hhVar.getEditText().setTextSize(1, 17.0f);
        hhVar.getEmojiButton().setLayoutParams(c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        hhVar.setHint(org.telegram.messenger.id.M0(2131754454, "AddCaption"));
        x5Var.addView(hhVar, c8.ha.e(-1, -2, 119));
        x5Var.setAlpha(0.0f);
        x5Var.setVisibility(8);
        fhVar.addView(imageView3, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.E4.c(x5Var, c8.g0.n(h6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        x5Var.setBackground(c13);
        x5Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        i6 i6Var3 = new i6(context, false, false, false);
        this.f32655u1 = i6Var3;
        i6Var3.setScaleProperty(0.6f);
        i6Var3.setVisibility(8);
        i6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(i6Var3, i14, h6Var);
        i6Var3.setTypeface(org.telegram.messenger.g0.o());
        i6Var3.setGravity(17);
        i6Var3.setAllowCancel(true);
        x5Var.addView(i6Var3, c8.ha.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231839);
        org.telegram.ui.ActionBar.t6.s(imageView5, org.telegram.ui.ActionBar.m6.Le, h6Var, mode2);
        hhVar.addView(imageView5, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i132;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.E.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i132 = 2131748832;
                            } else {
                                i132 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i132, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f32667x1 = imageView6;
        org.telegram.ui.ActionBar.v2 v2Var2 = new org.telegram.ui.ActionBar.v2(context);
        this.f32671y1 = v2Var2;
        imageView6.setImageDrawable(v2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView6, i15, h6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i16, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M6 = org.telegram.ui.ActionBar.t6.M(i16);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.t6.j(imageView6, h07, null, M6, h6Var);
        x5Var.addView(imageView6, c8.ha.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37639b;

            {
                this.f37639b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.cn cnVar;
                switch (r3) {
                    case 0:
                        final ci ciVar = this.f37639b;
                        fh fhVar2 = ciVar.B2;
                        if (fhVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(ciVar.getContext(), h6Var);
                            f0Var.r1(fhVar2.getText());
                            f0Var.f33408e2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fh fhVar22 = ciVar.B2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            hh hhVar2 = ciVar.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = ciVar.T1;
                            if (ciVar.E3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            vg vgVar = new vg(ciVar, 0);
                            f0Var.f33410g2 = j3;
                            f0Var.f33411h2 = z13;
                            f0Var.f33412i2 = vgVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ci ciVar2 = this.f37639b;
                        hh hhVar2 = ciVar2.M2;
                        if (hhVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(ciVar2.getContext(), h6Var);
                            f0Var2.r1(hhVar2.getText());
                            f0Var2.f33408e2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fh fhVar22 = ciVar2.B2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            hh hhVar22 = ciVar2.M2;
                                            hhVar22.setText(charSequence);
                                            hhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = ciVar2.T1;
                            if (ciVar2.E3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            vg vgVar2 = new vg(ciVar2, 1);
                            f0Var2.f33410g2 = j10;
                            f0Var2.f33411h2 = z14;
                            f0Var2.f33412i2 = vgVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ci ciVar3 = this.f37639b;
                        ciVar3.f32612h3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar3.Z1;
                        p12.H2(null, f2Var2, h6Var);
                        PhotoViewer.p1().I2(ciVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = ciVar3.P3;
                        boolean z15 = ciVar3.Q3;
                        p13.h = i132;
                        p13.f41459n = z15;
                        if (!ciVar3.W3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(ciVar3.f28675c.findFocus());
                        }
                        File w10 = fi.e7.w(ciVar3.G3, "webp");
                        Point point = org.telegram.messenger.g0.f22567q;
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
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        th thVar = new th(ciVar3, gfVar);
                        if (f2Var2 instanceof org.telegram.ui.cn) {
                            cnVar = (org.telegram.ui.cn) f2Var2;
                        } else {
                            cnVar = null;
                        }
                        p14.e2(arrayList2, 0, 11, false, thVar, cnVar);
                        if (ciVar3.A1) {
                            PhotoViewer.p1().S0(null, null, true, ciVar3.D1);
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
        ch chVar4 = new ch(this, context, 3);
        this.E2 = chVar4;
        chVar4.setFocusable(true);
        chVar4.setFocusableInTouchMode(true);
        chVar4.setVisibility(4);
        chVar4.setScaleX(0.2f);
        chVar4.setScaleY(0.2f);
        chVar4.setAlpha(0.0f);
        chVar4.setClipChildren(false);
        chVar4.setClipToPadding(false);
        this.f28672b.addView(chVar4, c8.ha.e(110, 50, 85));
        kh khVar = new kh(context, h6Var, this);
        this.F2 = khVar;
        khVar.setImportantForAccessibility(2);
        chVar4.addView(khVar, c8.ha.e(-1, -1, 119));
        khVar.setTranslationX(this.f28705t0);
        int L4 = org.telegram.messenger.g0.L(52.0f);
        int L5 = org.telegram.messenger.g0.L(38.0f);
        khVar.I = L4;
        khVar.J = L5;
        khVar.M = org.telegram.messenger.g0.L(7.0f);
        khVar.N = org.telegram.messenger.g0.L(6.0f);
        khVar.f32570h0 = true;
        khVar.setOnClickListener(new View.OnClickListener(this) {
            public final ci f37291b;

            {
                this.f37291b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i132;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        ci ciVar = this.f37291b;
                        if (ciVar.f32660v2 != ciVar.f32619k2) {
                            z13 = true;
                        }
                        ciVar.O1(z13);
                        return;
                    case 1:
                        ci ciVar2 = this.f37291b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.f32656u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ci ciVar3 = this.f37291b;
                        boolean z14 = ciVar3.W1;
                        if (!z14) {
                            ciVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ci ciVar4 = this.f37291b;
                        boolean z15 = ciVar4.W1;
                        if (z15) {
                            ciVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37291b.n1();
                        return;
                    case 5:
                        this.f37291b.X2.U(null, null);
                        return;
                    case 6:
                        ci ciVar5 = this.f37291b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.E.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23413i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.f32592a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.f32592a3 = m3Var2;
                            if (!U) {
                                i132 = 2131748832;
                            } else {
                                i132 = 2131748833;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i132, null)));
                            ciVar5.f32592a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.f32592a3.p(1.0f, -((ciVar5.f28672b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.f32592a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.f32592a3;
                            m3Var3.f12438q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.f28672b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.f32592a3.w();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f37291b.f32660v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37291b.f32612h3.U(null, null);
                        return;
                }
            }
        });
        khVar.setOnLongClickListener(new org.telegram.ui.pf(this, context, h6Var, f2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        eh ehVar2 = new eh(this, context, 1);
        ehVar2.setAlpha(0.0f);
        ehVar2.setScaleX(0.2f);
        ehVar2.setScaleY(0.2f);
        if (z9) {
            P0();
            this.F0 = -1;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().a(this.E4, c8.g0.n(h6Var));
        ec0 ec0Var = new ec0(context);
        this.M1 = ec0Var;
        this.f28672b.addView(ec0Var, c8.ha.c(-1.0f, -1));
        gh.e eVar = new gh.e(h6Var);
        eVar.f13973e = new lg(this, 5);
        eVar.f13972c = new lg(this, 6);
        eVar.d = new lg(this, 7);
        eVar.f13971b = new lg(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13975n = N;
        eVar.f13976r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13974f = N3;
        eVar.h = N4;
        q7Var.O(this.E4, eVar, false);
        jVar.f(1L, false);
        this.X0.i(this.f28672b);
        oi.q qVar2 = this.X0;
        qVar2.f21104a = new lg(this, 9);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
