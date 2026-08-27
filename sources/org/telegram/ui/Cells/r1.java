package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.zy;
import org.telegram.ui.gj0;

public final class r1 {
    public boolean A;
    public int[] A0;
    public int A1;
    public float A2;
    public boolean B;
    public boolean B0;
    public boolean B1;
    public int B2;
    public float C;
    public boolean C0;
    public boolean C1;
    public int C2;
    public float D;
    public boolean D1;
    public boolean D2;
    public int E;
    public boolean E0;
    public boolean E1;
    public StaticLayout E2;
    public boolean F;
    public boolean F0;
    public boolean F1;
    public boolean F2;
    public StaticLayout G;
    public boolean G0;
    public int G1;
    public int G2;
    public StaticLayout H;
    public ArrayList H0;
    public int H1;
    public int H2;
    public float I;
    public ArrayList I0;
    public boolean I1;
    public int I2;
    public float J;
    public int J0;
    public boolean J1;
    public float J2;
    public float K;
    public boolean K0;
    public boolean K2;
    public float L;
    public RichMessageLayout L0;
    public boolean L2;
    public int M;
    public RichMessageLayout M0;
    public boolean M2;
    public int N;
    public float N0;
    public boolean N1;
    public boolean N2;
    public int O;
    public org.telegram.ui.Components.p5 O0;
    public int O1;
    public boolean O2;
    public int P;
    public float P0;
    public int P1;
    public boolean P2;
    public boolean Q;
    public float Q0;
    public boolean Q2;
    public float R;
    public StaticLayout R0;
    public boolean R2;
    public boolean S;
    public org.telegram.ui.Components.p5 S0;
    public float S1;
    public int S2;
    public StaticLayout T;
    public boolean T0;
    public float T1;
    public int T2;
    public boolean U;
    public StaticLayout U0;
    public float U1;
    public boolean U2;
    public StaticLayout V;
    public StaticLayout V0;
    public float V1;
    public int V2;
    public float W;
    public int W0;
    public boolean W1;
    public int W2;
    public int X;
    public int X0;
    public int X1;
    public boolean X2;
    public int Y;
    public int Y0;
    public int Y1;
    public boolean Y2;
    public int Z;
    public boolean Z0;
    public boolean Z1;
    public boolean Z2;

    public float f25091a;

    public boolean f25092a0;

    public boolean f25093a1;
    public boolean a3;

    public float f25094b;

    public boolean f25095b0;

    public MessageObject.TextLayoutBlocks f25096b1;

    public int f25097b2;

    public boolean f25098b3;

    public float f25099c;

    public boolean f25100c0;

    public MessageObject.TextLayoutBlocks f25101c1;

    public StaticLayout f25102c2;

    public HashSet f25103c3;
    public float d;

    public float f25104d0;

    public boolean f25105d1;

    public StaticLayout f25106d2;

    public HashSet f25107d3;

    public float f25108e;

    public String f25109e0;

    public boolean f25110e1;

    public boolean f25111e2;

    public boolean f25112e3;

    public float f25113f;

    public boolean f25114f0;

    public int f25115f1;

    public boolean f25116f2;

    public boolean f25117f3;

    public boolean f25118g;

    public float f25119g0;

    public int f25120g1;

    public boolean f25121g2;

    public boolean f25122g3;
    public boolean h;

    public float f25123h0;

    public boolean f25124h1;

    public boolean f25125h2;

    public boolean f25126h3;

    public boolean f25127i;

    public float f25128i0;

    public int f25129i1;

    public StaticLayout f25130i2;

    public boolean f25131i3;

    public boolean f25132j;

    public float f25133j0;

    public int f25134j1;

    public boolean f25135j2;

    public StaticLayout f25136j3;

    public String f25137k;

    public float f25138k0;

    public boolean f25139k1;

    public boolean f25140k2;

    public StaticLayout f25141k3;

    public float f25142l;

    public float f25143l0;
    public boolean l1;

    public boolean f25144l2;

    public org.telegram.ui.Components.p5 f25145l3;

    public StaticLayout f25146m;
    public float m0;

    public boolean f25147m1;

    public float f25148m2;

    public final s1 f25149m3;

    public StaticLayout f25150n;

    public float f25151n0;

    public boolean f25152n1;

    public float f25153n2;

    public boolean f25154o;

    public float f25155o0;

    public float f25156o1;

    public float f25157o2;

    public boolean f25158p;

    public float f25159p0;

    public float f25160p1;

    public int f25161p2;

    public float f25162q;

    public float f25163q0;

    public float f25164q1;

    public int f25165q2;

    public float f25166r;

    public float f25167r0;

    public float f25168r1;

    public boolean f25169r2;

    public float f25170s;

    public boolean f25171s0;

    public boolean f25172s1;

    public int f25173s2;

    public float f25174t;

    public int f25176t1;

    public boolean f25177t2;

    public boolean f25178u;

    public boolean f25180u1;

    public int f25181u2;
    public int v;

    public boolean f25182v0;

    public boolean f25183v1;

    public int f25184v2;

    public int f25185w;

    public boolean f25186w0;

    public boolean f25187w1;

    public boolean f25188w2;

    public int f25189x;

    public boolean f25190x0;

    public int f25191x1;

    public boolean f25193y;

    public boolean f25194y0;

    public boolean f25195y1;

    public boolean f25197z;

    public boolean f25199z1;

    public float f25200z2;

    public final int[] f25175t0 = new int[4];

    public float f25179u0 = 1.0f;

    public float f25198z0 = 1.0f;
    public final Rect D0 = new Rect();
    public float K1 = 1.0f;
    public final ArrayList L1 = new ArrayList();
    public final ArrayList M1 = new ArrayList();
    public float Q1 = 0.0f;
    public float R1 = 1.0f;
    public int a2 = -1;

    public final StaticLayout[] f25192x2 = new StaticLayout[2];

    public final StaticLayout[] f25196y2 = new StaticLayout[2];

    public r1(s1 s1Var) {
        this.f25149m3 = s1Var;
    }

    public static void b(r1 r1Var) {
        float fMax = Math.max(0.0f, Math.min(1.0f, r1Var.K1));
        r1Var.Q1 = (float) Math.pow(1.0f - fMax, 0.5d);
        r1Var.R1 = (float) Math.pow(fMax, 0.5d);
    }

    public final boolean f() {
        boolean z10;
        boolean z11;
        float f10;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        HashSet hashSet;
        MessageObject messageObject;
        boolean z14;
        MessageObject messageObject2;
        boolean z15;
        int i13;
        MessageObject messageObject3;
        boolean z16;
        StaticLayout staticLayout;
        float f11;
        float f12;
        int i14;
        float fDp;
        float f13;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2;
        boolean z17;
        boolean z18;
        o0 o0Var;
        RichMessageLayout richMessageLayout;
        org.telegram.ui.Components.r5 r5Var;
        s1 s1Var = this.f25149m3;
        ig.r0 r0Var = s1Var.J;
        ArrayList arrayList3 = s1Var.f25405k7;
        boolean z19 = false;
        if (!this.f25182v0) {
            return false;
        }
        this.f25183v1 = false;
        this.F0 = false;
        boolean z20 = this.E0;
        boolean z21 = s1Var.C8;
        if (z20 != z21) {
            this.F0 = true;
            z10 = true;
        } else {
            z10 = false;
        }
        this.G0 = false;
        MessageObject messageObject4 = s1Var.f25546u7;
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = messageObject4.textLayoutBlocks;
        ArrayList<MessageObject.TextLayoutBlock> arrayList5 = this.I0;
        if (arrayList4 != arrayList5) {
            boolean z22 = messageObject4.textWidth == this.J0 || z20 == z21;
            if (arrayList4 == null || arrayList5 == null || arrayList4.size() != this.I0.size()) {
                z22 = false;
                break;
            }
            for (int i15 = 0; i15 < this.I0.size(); i15++) {
                String string = s1Var.f25546u7.textLayoutBlocks.get(i15).textLayout == null ? null : s1Var.f25546u7.textLayoutBlocks.get(i15).textLayout.getText().toString();
                String string2 = ((MessageObject.TextLayoutBlock) this.I0.get(i15)).textLayout == null ? null : ((MessageObject.TextLayoutBlock) this.I0.get(i15)).textLayout.getText().toString();
                if ((string == null && string2 != null) || ((string != null && string2 == null) || !string.equals(string2))) {
                    z22 = false;
                    break;
                }
                org.telegram.ui.Components.p5 p5Var = s1Var.f25422lc;
                if (p5Var != null) {
                    StaticLayout staticLayout2 = s1Var.f25546u7.textLayoutBlocks.get(i15).textLayout;
                    StaticLayout staticLayout3 = ((MessageObject.TextLayoutBlock) this.I0.get(i15)).textLayout;
                    HashMap map = p5Var.f31504b;
                    if (staticLayout3 != null && (r5Var = (org.telegram.ui.Components.r5) map.remove(staticLayout3)) != null) {
                        ArrayList arrayList6 = r5Var.f32084b;
                        r5Var.f32083a = staticLayout2;
                        for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                            ((org.telegram.ui.Components.o5) arrayList6.get(i16)).f31158c = staticLayout2;
                        }
                        map.put(staticLayout2, r5Var);
                    }
                }
            }
            if (z22) {
                s1Var.f25422lc = org.telegram.ui.Components.t5.update(0, s1Var, s1Var.f25422lc, s1Var.f25546u7.textLayoutBlocks);
            } else {
                this.G0 = true;
                ArrayList arrayList7 = this.I0;
                this.H0 = arrayList7;
                this.N0 = this.f25157o2;
                this.O0 = org.telegram.ui.Components.t5.update(0, (View) s1Var, this.O0, (ArrayList<MessageObject.TextLayoutBlock>) arrayList7, true);
                s1Var.f25422lc = org.telegram.ui.Components.t5.update(0, s1Var, s1Var.f25422lc, s1Var.f25546u7.textLayoutBlocks);
                z10 = true;
            }
        }
        RichMessageLayout richMessageLayout2 = s1Var.f25546u7.richLayout;
        if (richMessageLayout2 != null && (richMessageLayout2.detailsAnimating || richMessageLayout2.blockquoteAnimating)) {
            this.f25183v1 = true;
            z10 = true;
        }
        this.K0 = false;
        if (richMessageLayout2 != this.M0) {
            gj0 gj0Var = s1Var.f25309de;
            boolean z23 = gj0Var != null && gj0Var.h;
            RichMessageLayout richMessageLayout3 = this.L0;
            if (richMessageLayout3 != null) {
                richMessageLayout3.detach(s1Var);
                this.L0 = null;
            }
            if (z23) {
                RichMessageLayout richMessageLayout4 = s1Var.f25546u7.richLayout;
                if (richMessageLayout4 != null && (richMessageLayout = this.M0) != null) {
                    richMessageLayout4.layout(richMessageLayout);
                }
            } else {
                this.K0 = true;
                RichMessageLayout richMessageLayout5 = this.M0;
                this.L0 = richMessageLayout5;
                if (richMessageLayout5 != null) {
                    richMessageLayout5.attach(s1Var);
                }
            }
        }
        this.O2 = false;
        if (s1Var.Va != this.M2) {
            this.O2 = true;
            z10 = true;
        }
        this.P2 = false;
        if (s1Var.Wa != this.N2) {
            this.P2 = true;
            z10 = true;
        }
        StaticLayout staticLayout4 = s1Var.f25621z9;
        if (staticLayout4 != this.E2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.E2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.Q0 = this.P0;
                StaticLayout staticLayout6 = this.E2;
                this.R0 = staticLayout6;
                this.J2 = this.I2;
                this.S0 = org.telegram.ui.Components.t5.update(0, (View) s1Var, false, this.S0, true, staticLayout6);
                z10 = true;
            }
        }
        boolean z24 = s1Var.Wc;
        if (z24 && !this.Z0 && s1Var.f25409kb != null) {
            String string3 = LocaleController.getString("EditedMessage", R.string.EditedMessage);
            CharSequence text2 = s1Var.f25409kb.getText();
            int iIndexOf = text2.toString().indexOf(string3);
            if (iIndexOf >= 0) {
                if (iIndexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.g6.T2;
                    int iDp = AndroidUtilities.dp(100.0f) + s1Var.f25435mb;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.U0 = new StaticLayout(string3, textPaint, iDp, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) string3);
                    spannableStringBuilder.append(text2.subSequence(string3.length(), text2.length()));
                    spannableStringBuilder.setSpan(new zy(z19), 0, string3.length(), 0);
                    this.V0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.g6.T2, AndroidUtilities.dp(100.0f) + s1Var.f25435mb, alignment, 1.0f, 0.0f, false);
                    this.Y0 = s1Var.f25421lb - this.X0;
                } else {
                    this.Y0 = 0;
                    this.U0 = null;
                    this.V0 = this.f25130i2;
                }
                this.T0 = true;
                this.W0 = this.X0;
                this.f25120g1 = this.f25115f1;
                this.f25124h1 = true;
                z10 = true;
            }
            s1Var.f25600y3 = null;
        } else if (!z24 && this.Z0 && s1Var.f25409kb != null) {
            this.V0 = this.f25130i2;
            int i17 = s1Var.f25421lb;
            int i18 = this.X0;
            this.Y0 = i17 - i18;
            this.T0 = true;
            this.W0 = i18;
            this.f25120g1 = this.f25115f1;
            this.f25124h1 = true;
            z10 = true;
        }
        this.l1 = false;
        if (s1Var.f25432m8 != this.f25139k1) {
            this.l1 = true;
            z10 = true;
        }
        this.f25172s1 = false;
        if (s1Var.f25494r1 != this.f25178u) {
            this.f25172s1 = true;
            float f14 = this.f25099c;
            this.f25156o1 = f14;
            float f15 = this.d;
            this.f25160p1 = f15;
            this.f25164q1 = (f14 / 2.0f) + this.f25091a;
            this.f25168r1 = (f15 / 2.0f) + this.f25094b;
            z10 = true;
        }
        this.f25180u1 = false;
        int i19 = s1Var.f25266b0;
        int i20 = this.v;
        if (i19 != i20) {
            this.f25183v1 = true;
            this.f25176t1 = i20;
            this.f25180u1 = true;
            z10 = true;
        }
        this.f25195y1 = false;
        int i21 = s1Var.R;
        int i22 = this.f25185w;
        if (i21 != i22) {
            this.f25191x1 = i22;
            this.f25195y1 = true;
            z10 = true;
        }
        this.f25187w1 = false;
        if ((s1Var.O != null) != this.f25193y) {
            this.f25187w1 = true;
            z10 = true;
        }
        this.B1 = false;
        int i23 = s1Var.W;
        int i24 = this.f25189x;
        if (i23 != i24) {
            this.A1 = i24;
            this.B1 = true;
            z10 = true;
        }
        this.f25199z1 = false;
        if ((s1Var.T != null) != this.f25197z) {
            this.f25199z1 = true;
            z10 = true;
        }
        this.L2 = false;
        if ((s1Var.f25546u7.type == 27 && (o0Var = s1Var.v) != null && o0Var.d()) != this.K2) {
            this.L2 = true;
            z10 = true;
        }
        this.D1 = false;
        if (s1Var.f25469p1 != this.C1) {
            this.D1 = true;
            z10 = true;
        }
        this.F1 = false;
        if (s1Var.f25480q1 != this.E1) {
            this.F1 = true;
            z10 = true;
        }
        this.I1 = false;
        if (s1Var.f25297d2) {
            int i25 = s1Var.f25370i2;
            int i26 = this.G1;
            if (i25 != i26) {
                this.I1 = true;
                this.H1 = i26;
                z10 = true;
            }
        }
        this.f25152n1 = false;
        if (s1Var.H5 != this.f25147m1) {
            this.f25152n1 = true;
            z10 = true;
        }
        MessageObject messageObject5 = s1Var.f25546u7;
        boolean z25 = messageObject5 != null ? messageObject5.summarized : false;
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = s1Var.Y3;
        MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.f25101c1;
        if (textLayoutBlocks3 != textLayoutBlocks4) {
            String string4 = textLayoutBlocks4 == null ? null : textLayoutBlocks4.text.toString();
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = s1Var.Y3;
            String string5 = textLayoutBlocks5 == null ? null : textLayoutBlocks5.text.toString();
            if (this.E0 == s1Var.C8 && this.f25105d1 == z25) {
                if (string5 == null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (string4 == null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z17 == z18) {
                    this.f25093a1 = true;
                    textLayoutBlocks = this.f25101c1;
                    this.f25096b1 = textLayoutBlocks;
                    if (textLayoutBlocks == null) {
                        arrayList = null;
                    } else {
                        arrayList = textLayoutBlocks.textLayoutBlocks;
                    }
                    this.O0 = org.telegram.ui.Components.t5.update(0, s1Var, (org.telegram.ui.Components.p5) null, arrayList);
                    org.telegram.ui.Components.p5 p5Var2 = s1Var.f25422lc;
                    textLayoutBlocks2 = s1Var.Y3;
                    if (textLayoutBlocks2 == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    }
                    s1Var.f25422lc = org.telegram.ui.Components.t5.update(0, s1Var, p5Var2, arrayList2);
                    if (this.E0 == s1Var.C8) {
                        this.f25171s0 = true;
                        this.f25163q0 = this.f25108e;
                        this.f25167r0 = this.f25113f;
                    } else {
                        this.f25171s0 = true;
                        this.f25163q0 = this.f25108e;
                        this.f25167r0 = this.f25113f;
                    }
                    z10 = true;
                } else {
                    this.f25093a1 = true;
                    textLayoutBlocks = this.f25101c1;
                    this.f25096b1 = textLayoutBlocks;
                    if (textLayoutBlocks == null) {
                        arrayList = null;
                    } else {
                        arrayList = textLayoutBlocks.textLayoutBlocks;
                    }
                    this.O0 = org.telegram.ui.Components.t5.update(0, s1Var, (org.telegram.ui.Components.p5) null, arrayList);
                    org.telegram.ui.Components.p5 p5Var3 = s1Var.f25422lc;
                    textLayoutBlocks2 = s1Var.Y3;
                    if (textLayoutBlocks2 == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    }
                    s1Var.f25422lc = org.telegram.ui.Components.t5.update(0, s1Var, p5Var3, arrayList2);
                    if (this.E0 == s1Var.C8) {
                        this.f25171s0 = true;
                        this.f25163q0 = this.f25108e;
                        this.f25167r0 = this.f25113f;
                    } else {
                        this.f25171s0 = true;
                        this.f25163q0 = this.f25108e;
                        this.f25167r0 = this.f25113f;
                    }
                    z10 = true;
                }
            } else {
                MessageObject.TextLayoutBlocks textLayoutBlocks6 = s1Var.Y3;
                int i27 = textLayoutBlocks6 == null ? 0 : textLayoutBlocks6.textWidth;
                MessageObject.TextLayoutBlocks textLayoutBlocks7 = this.f25101c1;
                if (i27 == (textLayoutBlocks7 == null ? 0 : textLayoutBlocks7.textWidth)) {
                    if (string5 == null) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (string4 == null) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z17 == z18 || !(string4 == null || string4.equals(string5))) {
                        this.f25093a1 = true;
                        textLayoutBlocks = this.f25101c1;
                        this.f25096b1 = textLayoutBlocks;
                        if (textLayoutBlocks == null) {
                            arrayList = null;
                        } else {
                            arrayList = textLayoutBlocks.textLayoutBlocks;
                        }
                        this.O0 = org.telegram.ui.Components.t5.update(0, s1Var, (org.telegram.ui.Components.p5) null, arrayList);
                        org.telegram.ui.Components.p5 p5Var4 = s1Var.f25422lc;
                        textLayoutBlocks2 = s1Var.Y3;
                        if (textLayoutBlocks2 == null) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                        }
                        s1Var.f25422lc = org.telegram.ui.Components.t5.update(0, s1Var, p5Var4, arrayList2);
                        if (this.E0 == s1Var.C8 || this.f25105d1 != z25) {
                            this.f25171s0 = true;
                            this.f25163q0 = this.f25108e;
                            this.f25167r0 = this.f25113f;
                        }
                    } else {
                        s1Var.m4();
                        float f16 = this.f25108e;
                        if (f16 != s1Var.f25415l4 || this.f25113f != s1Var.f25428m4) {
                            this.f25171s0 = true;
                            this.f25163q0 = f16;
                            this.f25167r0 = this.f25113f;
                        }
                    }
                    z10 = true;
                } else {
                    this.f25093a1 = true;
                    textLayoutBlocks = this.f25101c1;
                    this.f25096b1 = textLayoutBlocks;
                    if (textLayoutBlocks == null) {
                        arrayList = null;
                    } else {
                        arrayList = textLayoutBlocks.textLayoutBlocks;
                    }
                    this.O0 = org.telegram.ui.Components.t5.update(0, s1Var, (org.telegram.ui.Components.p5) null, arrayList);
                    org.telegram.ui.Components.p5 p5Var5 = s1Var.f25422lc;
                    textLayoutBlocks2 = s1Var.Y3;
                    if (textLayoutBlocks2 == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    }
                    s1Var.f25422lc = org.telegram.ui.Components.t5.update(0, s1Var, p5Var5, arrayList2);
                    if (this.E0 == s1Var.C8) {
                        this.f25171s0 = true;
                        this.f25163q0 = this.f25108e;
                        this.f25167r0 = this.f25113f;
                    } else {
                        this.f25171s0 = true;
                        this.f25163q0 = this.f25108e;
                        this.f25167r0 = this.f25113f;
                    }
                    z10 = true;
                }
            }
        } else if (textLayoutBlocks3 != null && textLayoutBlocks4 != null) {
            s1Var.m4();
            float f17 = this.f25108e;
            if (f17 != s1Var.f25415l4 || this.f25113f != s1Var.f25428m4) {
                this.f25171s0 = true;
                this.f25163q0 = f17;
                this.f25167r0 = this.f25113f;
                z10 = true;
            }
        }
        ArrayList arrayList8 = this.L1;
        if (!arrayList8.isEmpty() || !arrayList3.isEmpty()) {
            if (arrayList8.size() != arrayList3.size()) {
                this.D2 = true;
            }
            if (!this.D2) {
                for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                    e0 e0Var = (e0) arrayList3.get(i28);
                    e0 e0Var2 = (e0) arrayList8.get(i28);
                    if (!e0Var.f24232b && !e0Var2.f24232b && (Math.abs(e0Var.f24233c - e0Var2.f24233c) > 0.01f || Math.abs(e0Var.f24234e - e0Var2.f24234e) > 0.01f || !TextUtils.equals(e0Var.h.k(), e0Var2.h.k()))) {
                        this.D2 = true;
                        break;
                    }
                }
            }
            if (this.D2) {
                this.M1.addAll(arrayList8);
            }
        }
        int i29 = this.P1;
        if (i29 != s1Var.f25461o7) {
            this.O1 = i29;
            this.N1 = true;
        }
        int i30 = s1Var.G1;
        if (i30 == 5 || i30 == 3 || i30 == 1) {
            float f18 = s1Var.G4;
            float f19 = this.S1;
            if (f18 != f19 || s1Var.H4 != this.T1) {
                this.U1 = f19;
                this.V1 = this.T1;
                this.W1 = true;
                z10 = true;
            }
        }
        int i31 = s1Var.f25385j2;
        int i32 = this.X1;
        if (i31 != i32) {
            this.Y1 = i32;
            this.Z1 = true;
            z10 = true;
        }
        if (this.A != s1Var.U7) {
            this.B = true;
            s1Var.f25600y3 = null;
            z11 = true;
            z10 = true;
        } else {
            z11 = false;
        }
        if ((this.G != null || s1Var.Rb != null) && this.E != s1Var.getRepliesCount()) {
            this.H = this.G;
            this.F = true;
            s1Var.f25600y3 = null;
            z11 = true;
            z10 = true;
        }
        if (this.f25102c2 != null && this.f25097b2 != s1Var.getMessageObject().messageOwner.views) {
            this.f25106d2 = this.f25102c2;
            s1Var.f25600y3 = null;
            z11 = true;
            z10 = true;
        }
        if (s1Var.V8 != null && this.M != s1Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.T;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), s1Var.V8.getText())) {
                this.V = null;
            } else {
                this.V = this.T;
            }
            this.X = this.N;
            this.W = this.R;
            this.Y = this.O;
            this.Z = this.P;
            this.f25092a0 = this.Q;
            this.f25095b0 = this.S;
            this.U = true;
            z10 = true;
        }
        if (!TextUtils.equals(this.f25109e0, s1Var.f25273b7)) {
            this.f25100c0 = true;
            this.f25104d0 = s1Var.Sa;
            z10 = true;
        }
        if (this.f25110e1 != s1Var.f25504rb) {
            if (this.f25111e2 != s1Var.e4()) {
                this.T0 = false;
                this.f25116f2 = true;
                this.f25120g1 = this.f25115f1;
                this.V0 = this.f25130i2;
                this.W0 = this.X0;
            } else if (z11 || (Math.abs(s1Var.nb - this.f25115f1) > 1 && this.E0 == s1Var.C8)) {
                this.f25124h1 = true;
                this.W0 = this.X0;
                this.f25120g1 = this.f25115f1;
                this.K = this.L;
                this.I = this.J;
                this.D = this.C;
            }
            if (this.f25121g2 != s1Var.d4()) {
                this.f25125h2 = true;
            }
            if (this.f25132j != s1Var.S3) {
                this.f25127i = true;
            }
            if (this.f25135j2 != s1Var.f25452nd) {
                this.f25140k2 = true;
                z10 = true;
            }
            f10 = this.f25148m2;
            if (f10 != s1Var.f25440n0) {
                this.f25144l2 = true;
                this.f25153n2 = f10;
                z10 = true;
            }
            i10 = this.f25161p2;
            if (i10 != s1Var.f25412l0) {
                this.f25169r2 = true;
                this.f25165q2 = i10;
                z10 = true;
            }
            i11 = this.V2;
            if (i11 != s1Var.a2) {
                this.U2 = true;
                this.W2 = i11;
                z10 = true;
            }
            i12 = this.S2;
            if (i12 != s1Var.f25268b2) {
                this.X2 = true;
                this.T2 = i12;
                z10 = true;
            }
            z12 = this.Y2;
            if (s1Var.getPrimaryMessageObject() == null && s1Var.getPrimaryMessageObject().factCheckExpanded) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                this.Z2 = true;
                z10 = true;
            }
            if (this.Q2 != s1Var.J1) {
                this.R2 = true;
                z10 = true;
            }
            if (this.a3 != s1Var.f25305da) {
                this.f25098b3 = true;
                z10 = true;
            }
            hashSet = this.f25103c3;
            messageObject = s1Var.f25546u7;
            if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
                this.f25112e3 = true;
                this.f25107d3 = this.f25103c3;
                z10 = true;
            }
            z14 = this.f25117f3;
            messageObject2 = s1Var.f25546u7;
            if (messageObject2 == null && messageObject2.expandedExplanation) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z14 != z15) {
                this.f25126h3 = true;
                this.f25122g3 = z14;
                z10 = true;
            }
            if (messageObject2 != null || this.f25188w2 == messageObject2.needDrawForwarded()) {
                i13 = this.H2;
                if (i13 != s1Var.Hc) {
                    this.F2 = true;
                    this.G2 = i13;
                }
                s1Var.s4();
                if (r0Var.a()) {
                    z10 = true;
                }
                if (s1Var.f25546u7.isRoundVideo()) {
                    int i33 = s1Var.I8;
                    if (s1Var.F) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    fDp = i33 - AndroidUtilities.dp(28 - i14);
                    if (!r0Var.f11434s) {
                        fDp -= r0Var.f11431p;
                    }
                    f13 = this.f25162q;
                    if (fDp != f13) {
                        this.f25158p = true;
                        this.f25166r = f13;
                        z10 = true;
                    }
                }
                if (s1Var.f25606y9 != null) {
                    f11 = s1Var.C9;
                    f12 = this.f25170s;
                    if (f11 != f12 && f12 != 0.0f) {
                        this.f25174t = f12;
                        z10 = true;
                    }
                }
                messageObject3 = s1Var.f25546u7;
                if (messageObject3 == null && messageObject3.translated) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16 != this.f25131i3 || s1Var.F2 == null || (staticLayout = this.f25136j3) == null) {
                    return z10;
                }
                this.f25141k3 = staticLayout;
                this.f25145l3 = org.telegram.ui.Components.t5.update(0, (View) s1Var, false, this.f25145l3, staticLayout);
                return true;
            }
            this.f25177t2 = true;
            StaticLayout[] staticLayoutArr = this.f25192x2;
            StaticLayout staticLayout8 = staticLayoutArr[0];
            StaticLayout[] staticLayoutArr2 = this.f25196y2;
            staticLayoutArr2[0] = staticLayout8;
            staticLayoutArr2[1] = staticLayoutArr[1];
            this.f25200z2 = this.A2;
            this.f25181u2 = this.f25184v2;
            this.B2 = this.C2;
            z10 = true;
            s1Var.s4();
            if (r0Var.a()) {
                z10 = true;
            }
            if (s1Var.f25546u7.isRoundVideo()) {
                int i34 = s1Var.I8;
                if (s1Var.F) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                fDp = i34 - AndroidUtilities.dp(28 - i14);
                if (!r0Var.f11434s) {
                    fDp -= r0Var.f11431p;
                }
                f13 = this.f25162q;
                if (fDp != f13) {
                    this.f25158p = true;
                    this.f25166r = f13;
                    z10 = true;
                }
            }
            if (s1Var.f25606y9 != null) {
                f11 = s1Var.C9;
                f12 = this.f25170s;
                if (f11 != f12) {
                    this.f25174t = f12;
                    z10 = true;
                }
            }
            messageObject3 = s1Var.f25546u7;
            if (messageObject3 == null) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z16 != this.f25131i3) {
            }
            return z10;
        }
        this.J1 = true;
        this.f25106d2 = null;
        z10 = true;
        if (this.f25121g2 != s1Var.d4()) {
            this.f25125h2 = true;
        }
        if (this.f25132j != s1Var.S3) {
            this.f25127i = true;
        }
        if (this.f25135j2 != s1Var.f25452nd) {
            this.f25140k2 = true;
            z10 = true;
        }
        f10 = this.f25148m2;
        if (f10 != s1Var.f25440n0) {
            this.f25144l2 = true;
            this.f25153n2 = f10;
            z10 = true;
        }
        i10 = this.f25161p2;
        if (i10 != s1Var.f25412l0) {
            this.f25169r2 = true;
            this.f25165q2 = i10;
            z10 = true;
        }
        i11 = this.V2;
        if (i11 != s1Var.a2) {
            this.U2 = true;
            this.W2 = i11;
            z10 = true;
        }
        i12 = this.S2;
        if (i12 != s1Var.f25268b2) {
            this.X2 = true;
            this.T2 = i12;
            z10 = true;
        }
        z12 = this.Y2;
        if (s1Var.getPrimaryMessageObject() == null) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            this.Z2 = true;
            z10 = true;
        }
        if (this.Q2 != s1Var.J1) {
            this.R2 = true;
            z10 = true;
        }
        if (this.a3 != s1Var.f25305da) {
            this.f25098b3 = true;
            z10 = true;
        }
        hashSet = this.f25103c3;
        messageObject = s1Var.f25546u7;
        if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
            this.f25112e3 = true;
            this.f25107d3 = this.f25103c3;
            z10 = true;
        }
        z14 = this.f25117f3;
        messageObject2 = s1Var.f25546u7;
        if (messageObject2 == null) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (z14 != z15) {
            this.f25126h3 = true;
            this.f25122g3 = z14;
            z10 = true;
        }
        if (messageObject2 != null) {
            i13 = this.H2;
            if (i13 != s1Var.Hc) {
                this.F2 = true;
                this.G2 = i13;
                z10 = true;
            }
        } else {
            i13 = this.H2;
            if (i13 != s1Var.Hc) {
                this.F2 = true;
                this.G2 = i13;
                z10 = true;
            }
        }
        s1Var.s4();
        if (r0Var.a()) {
            z10 = true;
        }
        if (s1Var.f25546u7.isRoundVideo()) {
            int i35 = s1Var.I8;
            if (s1Var.F) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            fDp = i35 - AndroidUtilities.dp(28 - i14);
            if (!r0Var.f11434s) {
                fDp -= r0Var.f11431p;
            }
            f13 = this.f25162q;
            if (fDp != f13) {
                this.f25158p = true;
                this.f25166r = f13;
                z10 = true;
            }
        }
        if (s1Var.f25606y9 != null) {
            f11 = s1Var.C9;
            f12 = this.f25170s;
            if (f11 != f12) {
                this.f25174t = f12;
                z10 = true;
            }
        }
        messageObject3 = s1Var.f25546u7;
        if (messageObject3 == null) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (z16 != this.f25131i3) {
        }
        return z10;
    }

    public final int g() {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject messageObject;
        int i11;
        s1 s1Var = this.f25149m3;
        boolean z12 = true;
        if (!s1Var.f25546u7.isOutOwner()) {
            if (!s1Var.f25546u7.isSending() && !s1Var.f25546u7.isEditing()) {
                z12 = false;
            }
            return (z12 ? 4 : 0) | (s1Var.f25546u7.isSendError() ? 8 : 0);
        }
        if (!s1Var.f25546u7.isSending() && !s1Var.f25546u7.isEditing()) {
            if (s1Var.f25546u7.isSendError()) {
                i10 = 0;
                z12 = false;
                z10 = false;
                z11 = true;
            } else {
                if (s1Var.f25546u7.isSent()) {
                    MessageObject messageObject2 = s1Var.f25546u7;
                    i10 = (messageObject2.scheduled || messageObject2.isUnread()) ? 0 : 1;
                } else {
                    i10 = 0;
                    z12 = false;
                }
                z10 = false;
            }
            messageObject = s1Var.f25546u7;
            if (messageObject.notime || messageObject.isQuickReply()) {
                i10 = 0;
                z12 = false;
                z10 = false;
            }
            if (z12) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            return i11 | i10 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        }
        i10 = 0;
        z12 = false;
        z10 = true;
        z11 = false;
        messageObject = s1Var.f25546u7;
        if (messageObject.notime) {
            i10 = 0;
            z12 = false;
            z10 = false;
        } else {
            i10 = 0;
            z12 = false;
            z10 = false;
        }
        if (z12) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        return i11 | i10 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
    }

    public final void h() {
        o0 o0Var;
        this.f25182v0 = true;
        s1 s1Var = this.f25149m3;
        ArrayList arrayList = s1Var.f25405k7;
        jh.y2 y2Var = s1Var.O0;
        this.f25091a = y2Var.getImageX();
        this.f25094b = y2Var.getImageY();
        this.f25099c = y2Var.getImageWidth();
        this.d = y2Var.getImageHeight();
        System.arraycopy(y2Var.getRoundRadius(), 0, this.f25175t0, 0, 4);
        org.telegram.ui.ActionBar.d5 d5Var = s1Var.f25475p8;
        if (d5Var != null) {
            this.D0.set(d5Var.getBounds());
        }
        this.E0 = s1Var.C8;
        MessageObject messageObject = s1Var.f25546u7;
        this.I0 = messageObject != null ? messageObject.textLayoutBlocks : null;
        this.J0 = messageObject != null ? messageObject.textWidth : 0;
        this.Z0 = s1Var.Wc;
        this.M0 = messageObject != null ? messageObject.richLayout : null;
        this.f25108e = s1Var.f25415l4;
        this.f25113f = s1Var.f25428m4;
        this.f25101c1 = s1Var.Y3;
        this.f25105d1 = messageObject != null ? messageObject.summarized : false;
        ArrayList arrayList2 = this.L1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.f25178u = s1Var.f25494r1;
        this.v = s1Var.f25266b0;
        this.f25185w = s1Var.R;
        this.f25189x = s1Var.W;
        this.f25193y = s1Var.O != null;
        this.f25197z = s1Var.T != null;
        this.G1 = s1Var.f25370i2;
        this.C1 = s1Var.f25469p1;
        this.E1 = s1Var.f25480q1;
        MessageObject messageObject2 = s1Var.f25546u7;
        this.K2 = messageObject2 != null && messageObject2.type == 27 && (o0Var = s1Var.v) != null && o0Var.d();
        if (s1Var.V8 != null) {
            this.M = s1Var.getRepliesCount();
            this.N = s1Var.f25304d9;
            this.T = s1Var.V8;
            this.O = s1Var.Y8;
            this.P = s1Var.Z8;
            this.Q = s1Var.f25260a9;
            this.R = s1Var.f25290c9;
            this.S = s1Var.X8;
        }
        this.E = s1Var.getRepliesCount();
        this.f25097b2 = s1Var.getMessageObject().messageOwner.views;
        this.G = s1Var.Rb;
        this.f25102c2 = s1Var.Ob;
        this.A = s1Var.U7;
        this.f25109e0 = s1Var.f25273b7;
        this.f25139k1 = s1Var.f25432m8;
        this.f25147m1 = s1Var.H5;
        this.S1 = s1Var.G4;
        this.T1 = s1Var.H4;
        this.X1 = s1Var.f25385j2;
        this.f25110e1 = !s1Var.f25504rb;
        this.f25115f1 = s1Var.nb;
        this.f25130i2 = s1Var.f25409kb;
        this.X0 = s1Var.f25421lb;
        this.f25111e2 = s1Var.e4();
        this.f25173s2 = s1Var.getTopMediaOffset();
        this.f25121g2 = s1Var.d4();
        this.f25132j = s1Var.S3;
        this.f25135j2 = s1Var.f25452nd;
        this.f25148m2 = s1Var.f25440n0;
        this.f25161p2 = s1Var.f25412l0;
        this.P1 = s1Var.f25461o7;
        StaticLayout[] staticLayoutArr = s1Var.f25277bb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.f25192x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        MessageObject messageObject3 = s1Var.f25546u7;
        this.f25188w2 = messageObject3 != null && messageObject3.needDrawForwarded();
        this.A2 = s1Var.f25320eb;
        int i10 = s1Var.Hc;
        this.f25184v2 = i10;
        this.H2 = i10;
        this.C2 = s1Var.f25291cb;
        this.f25129i1 = s1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.d5 d5Var2 = s1Var.f25475p8;
        if (d5Var2 != null) {
            this.f25134j1 = d5Var2.getBounds().right;
        }
        MessageObject messageObject4 = s1Var.f25546u7;
        this.f25157o2 = messageObject4 != null ? messageObject4.textXOffset : 0.0f;
        this.P0 = s1Var.I9;
        this.E2 = s1Var.f25621z9;
        this.I2 = s1Var.J9;
        s1Var.J.r();
        if (s1Var.f25606y9 != null) {
            this.f25170s = s1Var.D9;
        } else {
            this.f25170s = 0.0f;
        }
        this.M2 = s1Var.Va;
        this.N2 = s1Var.Wa;
        this.S2 = s1Var.f25268b2;
        this.Y2 = s1Var.getPrimaryMessageObject() != null && s1Var.getPrimaryMessageObject().factCheckExpanded;
        this.Q2 = s1Var.J1;
        this.V2 = s1Var.a2;
        this.a3 = s1Var.f25305da;
        this.f25103c3 = s1Var.getPrimaryMessageObject() != null ? s1Var.getPrimaryMessageObject().expandedQuotes : null;
        MessageObject messageObject5 = s1Var.f25546u7;
        this.f25117f3 = messageObject5 != null && messageObject5.expandedExplanation;
        this.f25131i3 = messageObject5 != null && messageObject5.translated;
        this.f25136j3 = s1Var.F2;
    }

    public final void i() {
        s1 s1Var = this.f25149m3;
        StaticLayout[] staticLayoutArr = s1Var.f25277bb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.f25192x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.f25188w2 = s1Var.f25546u7.needDrawForwarded();
        this.A2 = s1Var.f25320eb;
        int i10 = s1Var.Hc;
        this.f25184v2 = i10;
        this.H2 = i10;
        this.C2 = s1Var.f25291cb;
    }

    public final void j() {
        s1 s1Var = this.f25149m3;
        jh.y2 y2Var = s1Var.O0;
        this.f25118g = false;
        this.B = false;
        this.f25186w0 = false;
        this.f25119g0 = 0.0f;
        this.f25123h0 = 0.0f;
        this.f25128i0 = 0.0f;
        this.f25133j0 = 0.0f;
        this.f25138k0 = 0.0f;
        this.f25143l0 = 0.0f;
        if (this.f25114f0) {
            float f10 = this.f25155o0;
            if (f10 != 0.0f) {
                float f11 = this.f25159p0;
                if (f11 != 0.0f) {
                    y2Var.setImageCoords(this.m0, this.f25151n0, f10, f11);
                }
            }
        }
        if (this.B0) {
            y2Var.setRoundRadius(this.A0);
        }
        this.m0 = 0.0f;
        this.f25151n0 = 0.0f;
        this.f25155o0 = 0.0f;
        this.f25159p0 = 0.0f;
        this.f25114f0 = false;
        this.f25198z0 = 1.0f;
        this.f25179u0 = 1.0f;
        this.B0 = false;
        this.K1 = 1.0f;
        this.Q1 = 0.0f;
        this.R1 = 1.0f;
        this.G0 = false;
        this.K0 = false;
        this.F0 = false;
        this.O2 = false;
        this.P2 = false;
        this.H0 = null;
        RichMessageLayout richMessageLayout = this.L0;
        if (richMessageLayout != null) {
            richMessageLayout.detach(s1Var);
        }
        this.L0 = null;
        this.U0 = null;
        this.V0 = null;
        this.T0 = false;
        this.f25093a1 = false;
        this.C0 = false;
        this.f25096b1 = null;
        org.telegram.ui.Components.t5.release(s1Var, this.O0);
        this.O0 = null;
        this.f25171s0 = false;
        this.J1 = false;
        this.M1.clear();
        this.W1 = false;
        this.D2 = false;
        this.N1 = false;
        this.Z1 = false;
        this.R0 = null;
        this.F = false;
        this.H = null;
        this.U = false;
        this.V = null;
        this.f25106d2 = null;
        this.f25116f2 = false;
        this.f25125h2 = false;
        this.f25124h1 = false;
        this.l1 = false;
        this.f25100c0 = false;
        this.f25172s1 = false;
        this.f25180u1 = false;
        this.f25195y1 = false;
        this.f25187w1 = false;
        this.f25199z1 = false;
        this.B1 = false;
        this.f25183v1 = false;
        this.D1 = false;
        this.F1 = false;
        this.L2 = false;
        this.J1 = false;
        this.f25127i = false;
        this.f25140k2 = false;
        this.f25144l2 = false;
        this.f25169r2 = false;
        this.X2 = false;
        this.Z2 = false;
        this.f25112e3 = false;
        this.f25126h3 = false;
        this.R2 = false;
        this.f25098b3 = false;
        this.f25177t2 = false;
        this.F2 = false;
        StaticLayout[] staticLayoutArr = this.f25196y2;
        staticLayoutArr[0] = null;
        staticLayoutArr[1] = null;
        this.f25158p = false;
        ig.r0 r0Var = s1Var.J;
        ArrayList arrayList = r0Var.v;
        ArrayList arrayList2 = r0Var.f11437w;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((ig.o0) arrayList2.get(i10)).b();
        }
        arrayList2.clear();
        r0Var.f11425j = false;
        r0Var.f11426k = false;
        r0Var.f11427l = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ig.o0) arrayList.get(i11)).f11381c = 0;
        }
        this.f25141k3 = null;
        org.telegram.ui.Components.t5.release(s1Var, this.f25145l3);
    }
}
