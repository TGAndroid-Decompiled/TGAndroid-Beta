package org.telegram.ui.Cells;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.zz;
import org.telegram.ui.z00;
public final class l7 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.z5 {
    public final int D;
    public jj E;
    public boolean F;
    public boolean G;
    public final int H;
    public final SpannableStringBuilder I;
    public CharSequence J;
    public final bi0 K;
    public final org.telegram.ui.ActionBar.p6 L;
    public zz M;
    public long N;
    public boolean O;
    public float P;
    public boolean Q;
    public float R;
    public final ImageView f22247a;
    public final ag.d2 f22248b;
    public final TextView f22249c;
    public final TextView d;
    public final org.telegram.ui.Components.n5 e;
    public final ei0 f22250f;
    public final a80 h;
    public final ep f22251n;
    public final TextView f22252r;
    public final TextView f22253s;
    public boolean f22254w;
    public boolean f22255x;
    public final int f22256y;

    public l7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13;
        float f13;
        float f14;
        int i14;
        float f15;
        int i15;
        float f16;
        float f17;
        int i16;
        float f18;
        float f19;
        int i17;
        int i18;
        float f20;
        float f21;
        int i19;
        float f22;
        float f23;
        int i20;
        int i21;
        float f24;
        float f25;
        int i22;
        float f26;
        float f27;
        int i23;
        float f28;
        float f29;
        int i24;
        float f30;
        float f31;
        int i25;
        float f32;
        float f33;
        int i26;
        float f34;
        float f35;
        int i27;
        float f36;
        float f37;
        int i28;
        float f38;
        float f39;
        int i29;
        float f40;
        float f41;
        int i30;
        float f42;
        float f43;
        this.f22254w = true;
        int i31 = d20.f15147s0;
        this.f22256y = i31;
        this.R = 1.0f;
        this.L = p6Var;
        this.H = i10;
        this.D = org.telegram.messenger.b6.q(i31).k();
        ImageView imageView = new ImageView(context);
        this.f22247a = imageView;
        if (i10 == 1) {
            boolean z10 = cd.X;
            if (z10) {
                i30 = 5;
            } else {
                i30 = 3;
            }
            int i32 = i30 | 48;
            if (z10) {
                f42 = 0.0f;
            } else {
                f42 = 15.0f;
            }
            if (z10) {
                f43 = 15.0f;
            } else {
                f43 = 0.0f;
            }
            addView(imageView, w7.b6.d(42, 42.0f, i32, f42, 12.0f, f43, 0.0f));
        } else {
            boolean z11 = cd.X;
            if (z11) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i33 = i11 | 48;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = 12.0f;
            }
            if (z11) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            addView(imageView, w7.b6.d(40, 40.0f, i33, f7, 8.0f, f10, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.pj, p6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i10 == 1) {
            boolean z12 = cd.X;
            if (z12) {
                i29 = 5;
            } else {
                i29 = 3;
            }
            int i34 = i29 | 48;
            if (z12) {
                f40 = 0.0f;
            } else {
                f40 = 20.0f;
            }
            if (z12) {
                f41 = 20.0f;
            } else {
                f41 = 0.0f;
            }
            addView(textView, w7.b6.d(32, -2.0f, i34, f40, 28.0f, f41, 0.0f));
        } else {
            boolean z13 = cd.X;
            if (z13) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i35 = i12 | 48;
            if (z13) {
                f11 = 0.0f;
            } else {
                f11 = 16.0f;
            }
            if (z13) {
                f12 = 16.0f;
            } else {
                f12 = 0.0f;
            }
            addView(textView, w7.b6.d(32, -2.0f, i35, f11, 22.0f, f12, 0.0f));
        }
        ag.d2 d2Var = new ag.d2(this, context, 1);
        this.f22248b = d2Var;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
        if (i10 == 1) {
            boolean z14 = cd.X;
            if (z14) {
                i28 = 5;
            } else {
                i28 = 3;
            }
            int i36 = i28 | 48;
            if (z14) {
                f38 = 0.0f;
            } else {
                f38 = 16.0f;
            }
            if (z14) {
                f39 = 16.0f;
            } else {
                f39 = 0.0f;
            }
            addView(d2Var, w7.b6.d(42, 42.0f, i36, f38, 12.0f, f39, 0.0f));
        } else {
            boolean z15 = cd.X;
            if (z15) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i37 = i13 | 48;
            if (z15) {
                f13 = 0.0f;
            } else {
                f13 = 12.0f;
            }
            if (z15) {
                f14 = 12.0f;
            } else {
                f14 = 0.0f;
            }
            addView(d2Var, w7.b6.d(40, 40.0f, i37, f13, 8.0f, f14, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f22249c = textView2;
        int i38 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.messenger.m5.m(textView2, i38, p6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (cd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14 | 16);
        if (i10 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = cd.X;
            if (z16) {
                i27 = 5;
            } else {
                i27 = 3;
            }
            int i39 = i27 | 48;
            if (z16) {
                f36 = 8.0f;
            } else {
                f36 = 72.0f;
            }
            if (z16) {
                f37 = 72.0f;
            } else {
                f37 = 8.0f;
            }
            addView(textView2, w7.b6.d(-1, -2.0f, i39, f36, 9.0f, f37, 0.0f));
            f15 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout f44 = org.telegram.messenger.m5.f(context, 0);
            boolean z17 = cd.X;
            if (z17) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i40 = i16 | 48;
            if (z17) {
                f18 = 16.0f;
            } else {
                f18 = 72.0f;
            }
            if (z17) {
                f19 = 72.0f;
            } else {
                f19 = 16.0f;
            }
            addView(f44, w7.b6.d(-1, -2.0f, i40, f18, 5.0f, f19, 0.0f));
            TextView textView3 = new TextView(context);
            this.f22252r = textView3;
            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.A6, p6Var);
            textView3.setTextSize(1, 14.0f);
            f15 = 14.0f;
            if (!cd.X) {
                f44.addView(textView2, w7.b6.l(1.0f, -2, -2));
                f44.addView(textView3, w7.b6.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                f44.addView(textView3, w7.b6.l(0.0f, -2, -2));
                f44.addView(textView2, w7.b6.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f22253s = textView4;
            org.telegram.ui.ActionBar.a7.V(textView4, i38, p6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (cd.X) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            textView4.setGravity(i17 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = cd.X;
            if (z18) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i41 = i18 | 48;
            if (z18) {
                f20 = 8.0f;
            } else {
                f20 = 72.0f;
            }
            if (z18) {
                f21 = 72.0f;
            } else {
                f21 = 8.0f;
            }
            addView(textView4, w7.b6.d(-1, -2.0f, i41, f20, 30.0f, f21, 0.0f));
            textView4.setVisibility(8);
        } else {
            f15 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = cd.X;
            if (z19) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i42 = i15 | 48;
            if (z19) {
                f16 = 8.0f;
            } else {
                f16 = 72.0f;
            }
            if (z19) {
                f17 = 72.0f;
            } else {
                f17 = 8.0f;
            }
            addView(textView2, w7.b6.d(-1, -2.0f, i42, f16, 5.0f, f17, 0.0f));
        }
        bi0 bi0Var = new bi0(2131624002, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), true, null);
        this.K = bi0Var;
        ?? imageView2 = new ImageView(context);
        this.f22250f = imageView2;
        imageView2.setAnimation(bi0Var);
        imageView2.setVisibility(4);
        int i43 = org.telegram.ui.ActionBar.t6.wi;
        org.telegram.ui.ActionBar.a7.t(imageView2, i43, p6Var, PorterDuff.Mode.SRC_IN);
        if (i10 == 1) {
            boolean z20 = cd.X;
            if (z20) {
                i26 = 5;
            } else {
                i26 = 3;
            }
            int i44 = i26 | 48;
            if (z20) {
                f34 = 8.0f;
            } else {
                f34 = 70.0f;
            }
            if (z20) {
                f35 = 72.0f;
            } else {
                f35 = 8.0f;
            }
            addView((View) imageView2, w7.b6.d(14, 14.0f, i44, f34, 37.0f, f35, 0.0f));
        } else {
            boolean z21 = cd.X;
            if (z21) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            int i45 = i19 | 48;
            if (z21) {
                f22 = 8.0f;
            } else {
                f22 = 70.0f;
            }
            if (z21) {
                f23 = 72.0f;
            } else {
                f23 = 8.0f;
            }
            addView((View) imageView2, w7.b6.d(14, 14.0f, i45, f22, 33.0f, f23, 0.0f));
        }
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.e = n5Var;
        org.telegram.ui.ActionBar.a7.V(n5Var, org.telegram.ui.ActionBar.t6.A6, p6Var);
        n5Var.setLines(1);
        n5Var.setMaxLines(1);
        n5Var.setSingleLine(true);
        n5Var.setEllipsize(truncateAt);
        if (cd.X) {
            i20 = 5;
        } else {
            i20 = 3;
        }
        n5Var.setGravity(i20 | 16);
        zs.i(n5Var);
        if (i10 == 1) {
            n5Var.setTextSize(1, 13.0f);
            boolean z22 = cd.X;
            if (z22) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i46 = i25 | 48;
            if (z22) {
                f32 = 8.0f;
            } else {
                f32 = 72.0f;
            }
            if (z22) {
                f33 = 72.0f;
            } else {
                f33 = 8.0f;
            }
            addView(n5Var, w7.b6.d(-1, -2.0f, i46, f32, 34.0f, f33, 0.0f));
        } else {
            n5Var.setTextSize(1, 13.0f);
            boolean z23 = cd.X;
            if (z23) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i47 = i21 | 48;
            if (z23) {
                f24 = 8.0f;
            } else {
                f24 = 72.0f;
            }
            if (z23) {
                f25 = 72.0f;
            } else {
                f25 = 8.0f;
            }
            addView(n5Var, w7.b6.d(-1, -2.0f, i47, f24, 30.0f, f25, 0.0f));
        }
        a80 a80Var = new a80(context);
        this.h = a80Var;
        a80Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i43, p6Var));
        boolean z24 = cd.X;
        if (z24) {
            i22 = 5;
        } else {
            i22 = 3;
        }
        int i48 = i22 | 48;
        if (z24) {
            f26 = 0.0f;
        } else {
            f26 = 72.0f;
        }
        if (z24) {
            f27 = 72.0f;
        } else {
            f27 = 0.0f;
        }
        addView(a80Var, w7.b6.d(-1, 2.0f, i48, f26, 54.0f, f27, 0.0f));
        ep epVar = new ep(21, context, p6Var);
        this.f22251n = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(2);
        if (i10 == 1) {
            boolean z25 = cd.X;
            if (z25) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i49 = i24 | 48;
            if (z25) {
                f30 = 0.0f;
            } else {
                f30 = 38.0f;
            }
            if (z25) {
                f31 = 38.0f;
            } else {
                f31 = 0.0f;
            }
            addView(epVar, w7.b6.d(24, 24.0f, i49, f30, 36.0f, f31, 0.0f));
        } else {
            boolean z26 = cd.X;
            if (z26) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i50 = i23 | 48;
            if (z26) {
                f28 = 0.0f;
            } else {
                f28 = 33.0f;
            }
            if (z26) {
                f29 = 33.0f;
            } else {
                f29 = 0.0f;
            }
            addView(epVar, w7.b6.d(24, 24.0f, i50, f28, 28.0f, f29, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.I = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
    }

    @Override
    public final void C(boolean z10) {
        f(true);
        this.N = 0L;
        e();
    }

    @Override
    public final void M(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.N = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.f22255x) {
            canvas.drawLine(org.telegram.messenger.i0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", this.L));
        }
    }

    public final void b(boolean z10, boolean z11) {
        ep epVar = this.f22251n;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
    }

    public final void c(jj jjVar, boolean z10) {
        boolean z11;
        String str;
        String str2;
        String str3;
        int i10;
        boolean z12;
        boolean z13;
        String str4;
        String str5;
        String str6;
        jj jjVar2 = this.E;
        if (jjVar2 != null && jjVar != null && jjVar2.f1() != jjVar.f1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22255x = z10;
        this.E = jjVar;
        this.G = false;
        this.F = false;
        if (!z11) {
            this.N = 0L;
        }
        TLRPC.Document F0 = jjVar.F0();
        TextView textView = this.f22253s;
        TextView textView2 = this.f22249c;
        String str7 = "";
        ImageView imageView = this.f22247a;
        TextView textView3 = this.d;
        ag.d2 d2Var = this.f22248b;
        if (F0 != null) {
            if (jjVar.I3()) {
                str = null;
                for (int i11 = 0; i11 < F0.attributes.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = jjVar.x1(true) + " - " + jjVar.z1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!jj.L4(jjVar.f16337k) && !(jjVar.f16337k.media instanceof TLRPC.TL_messageMediaPhoto) && !jj.s3(F0, false)) {
                str2 = org.telegram.messenger.b8.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (jj.s3(F0, false)) {
                        str2 = cd.L0(2131753971, null);
                    } else {
                        str2 = cd.L0(2131753933, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (jj.s3(F0, false)) {
                        str2 = cd.L0(2131753971, null);
                    } else {
                        str2 = cd.L0(2131753948, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = cd.L0(2131753982, null);
                } else {
                    str2 = cd.L0(2131753975, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = jjVar.Y1;
            org.telegram.ui.ActionBar.p6 p6Var = this.L;
            CharSequence x12 = org.telegram.messenger.i0.x1(str3, arrayList, p6Var);
            if (x12 != null) {
                textView2.setText(x12);
            } else {
                textView2.setText(str3);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(org.telegram.messenger.i0.m1(str2, false));
            int lastIndexOf = str2.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str7 = str2.substring(lastIndexOf + 1).toLowerCase();
            }
            textView3.setText(str7);
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, 320, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F0.thumbs, 40, false, null, false);
            if (w10 == w9) {
                w9 = null;
            }
            if (!(w10 instanceof TLRPC.TL_photoSizeEmpty) && w10 != null) {
                ImageReceiver imageReceiver = d2Var.getImageReceiver();
                if (w9 == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver.F0 = z12;
                ImageReceiver imageReceiver2 = d2Var.getImageReceiver();
                if (w9 == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                imageReceiver2.G0 = z13;
                d2Var.setVisibility(0);
                if (jjVar.G1 != null) {
                    d2Var.o(ic.c(w9, F0), "40_40", null, null, jjVar.G1, null, 1, jjVar);
                } else {
                    d2Var.g(1, 0L, jjVar, "40_40", "40_40_b", null, ic.c(w9, F0), ic.c(w10, F0));
                }
            } else {
                d2Var.setVisibility(4);
                d2Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (jjVar.s2() && !TextUtils.isEmpty(this.E.f16337k.message)) {
                CharSequence x13 = org.telegram.messenger.i0.x1(this.E.f16337k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.E.Y1, p6Var);
                this.J = x13;
                if (textView != null) {
                    if (x13 == null) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            d2Var.setVisibility(4);
            d2Var.setImageBitmap(null);
            this.J = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f22255x);
        this.h.a(false, 0.0f);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i10, boolean z10) {
        int i11;
        int i12;
        this.f22249c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f22255x = z10;
        ImageView imageView = this.f22247a;
        if (i10 == 0) {
            imageView.setImageResource(org.telegram.messenger.i0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.H;
        ag.d2 d2Var = this.f22248b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                d2Var.setImageBitmap(null);
                d2Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i13 != 3) {
                    d2Var.h(str4, "42_42", null);
                }
            } else {
                eq N = org.telegram.ui.ActionBar.t6.N(org.telegram.messenger.i0.L(42.0f), i10);
                if (i10 == 2131231074) {
                    i11 = org.telegram.ui.ActionBar.t6.f21119na;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else if (i10 == 2131231071) {
                    i11 = org.telegram.ui.ActionBar.t6.f21080la;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else if (i10 == 2131231073) {
                    i11 = org.telegram.ui.ActionBar.t6.f21062ka;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else if (i10 == 2131231072) {
                    i11 = org.telegram.ui.ActionBar.t6.f21042ja;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.oj;
                    i12 = org.telegram.ui.ActionBar.t6.nj;
                }
                org.telegram.ui.ActionBar.p6 p6Var = this.L;
                org.telegram.ui.ActionBar.t6.B1(N, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), false);
                org.telegram.ui.ActionBar.t6.B1(N, org.telegram.ui.ActionBar.t6.w0(i12, p6Var), true);
                d2Var.setImageDrawable(N);
            }
            d2Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.f22255x);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.R != 1.0f && this.M != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.R) * 255.0f), 31);
            this.M.setViewType(3);
            this.M.updateColors();
            this.M.f();
            this.M.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.R * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
            a(canvas);
        }
        boolean z10 = this.O;
        if (!z10 && this.P == 0.0f) {
            return;
        }
        if (z10) {
            float f7 = this.P;
            if (f7 != 1.0f) {
                this.P = f7 + 0.10666667f;
                invalidate();
                this.P = Utilities.i(this.P, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.P;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.t6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.P;
            if (f11 != 0.0f) {
                this.P = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.P = Utilities.i(this.P, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.P;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.t6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String C;
        jj jjVar = this.E;
        if (jjVar != null && jjVar.F0() != null) {
            jj jjVar2 = this.E;
            long j10 = jjVar2.f16337k.date * 1000;
            long j11 = this.N;
            if (j11 == 0) {
                C = org.telegram.messenger.i0.i0(jjVar2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                C = a1.g.C(org.telegram.messenger.i0.i0(j11, false, false), " / ", org.telegram.messenger.i0.i0(this.E.F0().size, false, false));
            }
            int i10 = this.H;
            org.telegram.ui.Components.n5 n5Var = this.e;
            if (i10 == 2) {
                n5Var.setText(new SpannableStringBuilder().append((CharSequence) C).append(' ').append((CharSequence) this.I).append(' ').append(z00.d(this.E, true, 2, n5Var.getPaint())));
                this.f22252r.setText(cd.a1(this.E.f16337k.date));
                return;
            }
            String a02 = cd.a0("formatDateAtTime", null, 2131742808, cd.D0().B0().format(new Date(j10)), cd.D0().o0().format(new Date(j10)));
            n5Var.setText(C + ", " + a02);
        }
    }

    public final void f(boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) gr.f26495f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        jj jjVar = this.E;
        float f12 = 72.0f;
        int i11 = this.f22256y;
        ei0 ei0Var = this.f22250f;
        a80 a80Var = this.h;
        float f13 = 8.0f;
        org.telegram.ui.Components.n5 n5Var = this.e;
        if (jjVar != null && jjVar.f16337k.media != null) {
            this.G = false;
            if (!jjVar.f16383w0 && !jjVar.f16387x0 && this.f22254w) {
                String r10 = org.telegram.messenger.b8.r(null, jjVar.F0());
                org.telegram.messenger.b6.q(i11).a(r10, this.E, this);
                this.F = org.telegram.messenger.b8.G(i11).T(r10);
                ei0Var.setVisibility(0);
                int i12 = 15;
                if (this.F) {
                    i10 = 15;
                } else {
                    i10 = 0;
                }
                bi0 bi0Var = this.K;
                bi0Var.P(i10);
                bi0Var.h = true;
                if (z10) {
                    ei0Var.d();
                } else {
                    if (!this.F) {
                        i12 = 0;
                    }
                    bi0Var.M(i12);
                    ei0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
                if (layoutParams != null) {
                    if (cd.X) {
                        f11 = 8.0f;
                    } else {
                        f11 = 86.0f;
                    }
                    layoutParams.leftMargin = org.telegram.messenger.i0.L(f11);
                    if (cd.X) {
                        f13 = 86.0f;
                    }
                    layoutParams.rightMargin = org.telegram.messenger.i0.L(f13);
                    n5Var.requestLayout();
                }
                if (this.F) {
                    a80Var.setVisibility(0);
                    Float w9 = hc.D().w(r10);
                    if (w9 == null) {
                        w9 = Float.valueOf(0.0f);
                    }
                    a80Var.a(false, w9.floatValue());
                    return;
                }
                a80Var.setVisibility(4);
                return;
            }
            ei0Var.setVisibility(4);
            a80Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            if (layoutParams2 != null) {
                if (cd.X) {
                    f10 = 8.0f;
                } else {
                    f10 = 72.0f;
                }
                layoutParams2.leftMargin = org.telegram.messenger.i0.L(f10);
                if (!cd.X) {
                    f12 = 8.0f;
                }
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(f12);
                n5Var.requestLayout();
            }
            this.F = false;
            this.G = true;
            org.telegram.messenger.b6.q(i11).v(this);
            return;
        }
        this.F = false;
        this.G = true;
        a80Var.setVisibility(4);
        a80Var.a(false, 0.0f);
        ei0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (cd.X) {
                f7 = 8.0f;
            } else {
                f7 = 72.0f;
            }
            layoutParams3.leftMargin = org.telegram.messenger.i0.L(f7);
            if (!cd.X) {
                f12 = 8.0f;
            }
            layoutParams3.rightMargin = org.telegram.messenger.i0.L(f12);
            n5Var.requestLayout();
        }
        org.telegram.messenger.b6.q(i11).v(this);
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.f22248b;
    }

    public jj getMessage() {
        return this.E;
    }

    @Override
    public int getObserverTag() {
        return this.D;
    }

    @Override
    public final void i(long j10, long j11) {
        a80 a80Var = this.h;
        if (a80Var.getVisibility() != 0) {
            f(true);
        }
        this.N = j10;
        e();
        a80Var.a(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h.getVisibility() == 0) {
            f(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.b6.q(this.f22256y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ep epVar = this.f22251n;
        if (epVar.f25836a.f23919q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(epVar.f25836a.f23919q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H != 1) {
            TextView textView = this.f22249c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f22253s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.i0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.m5.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.n5 n5Var = this.e;
                n5Var.layout(n5Var.getLeft(), n5Var.getTop() + measuredHeight, n5Var.getRight(), n5Var.getBottom() + measuredHeight);
                ei0 ei0Var = this.f22250f;
                ei0Var.layout(ei0Var.getLeft(), ei0Var.getTop() + measuredHeight, ei0Var.getRight(), ei0Var.getBottom() + measuredHeight);
                a80 a80Var = this.h;
                a80Var.layout(a80Var.getLeft(), (getMeasuredHeight() - a80Var.getMeasuredHeight()) - (this.f22255x ? 1 : 0), a80Var.getRight(), getMeasuredHeight() - (this.f22255x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.H;
        if (i12 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.f22255x ? 1 : 0), 1073741824));
        } else if (i12 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
            int measuredHeight = this.f22249c.getMeasuredHeight() + org.telegram.messenger.i0.L(34.0f) + (this.f22255x ? 1 : 0);
            if (this.J != null && (textView = this.f22253s) != null && this.E.s2()) {
                this.Q = true;
                textView.setText(org.telegram.messenger.i0.Q(this.J, (String) this.E.Y1.get(0), textView.getMeasuredWidth(), textView.getPaint()));
                this.Q = false;
                measuredHeight = org.telegram.messenger.m5.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.f22254w = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.R != f7) {
            this.R = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(zz zzVar) {
        this.M = zzVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ag.d2 d2Var = this.f22248b;
        if (endsWith) {
            d2Var.h("vthumb://0:".concat(str), null, null);
            d2Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            d2Var.setVisibility(8);
        } else {
            d2Var.h("thumb://0:".concat(str), null, null);
            d2Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(ef efVar) {
        String str = efVar.f19508c;
        long j10 = efVar.H;
        int i10 = efVar.G;
        int i11 = efVar.F;
        int i12 = efVar.C;
        String str2 = efVar.I;
        ag.d2 d2Var = this.f22248b;
        if (str != null) {
            d2Var.h(str, null, org.telegram.ui.ActionBar.t6.R4);
            str2 = efVar.f19508c;
        } else if (str2 != null) {
            if (efVar.f19507b) {
                d2Var.r();
                d2Var.h("vthumb://" + i12 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
            } else {
                d2Var.s(efVar.J, efVar.K, true);
                d2Var.h("thumb://" + i12 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
            }
        } else {
            d2Var.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
            str2 = "";
        }
        File file = new File(str2);
        this.f22249c.setText(file.getName());
        org.telegram.messenger.b8.D(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (i11 != 0 && i10 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(i11 + "x" + i10);
        }
        if (efVar.f19507b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.i0.g0(efVar.E, false, false));
        }
        if (j10 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.i0.i0(j10, false, false));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(cd.D0().y0().format(efVar.D));
        this.e.setText(sb2);
        this.f22247a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wi, this.L));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
