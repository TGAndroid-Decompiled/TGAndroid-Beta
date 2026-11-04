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
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.wz;
public final class g7 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.x5 {
    public final int E;
    public zi F;
    public boolean G;
    public boolean H;
    public final int I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final ch0 L;
    public final org.telegram.ui.ActionBar.e6 M;
    public iz N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView f29264a;
    public final ei.d4 f29265b;
    public final TextView f29266c;
    public final TextView d;
    public final org.telegram.ui.Components.o5 f29267e;
    public final fh0 f29268f;
    public final d70 h;
    public final wo f29269n;
    public final TextView f29270r;
    public final TextView f29271s;
    public boolean f29272w;
    public boolean f29273x;
    public final int f29274y;

    public g7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        float f14;
        float f15;
        int i13;
        float f16;
        int i14;
        float f17;
        float f18;
        int i15;
        float f19;
        float f20;
        int i16;
        int i17;
        float f21;
        float f22;
        int i18;
        float f23;
        float f24;
        int i19;
        int i20;
        float f25;
        float f26;
        int i21;
        float f27;
        float f28;
        int i22;
        float f29;
        float f30;
        int i23;
        float f31;
        float f32;
        int i24;
        float f33;
        float f34;
        int i25;
        float f35;
        float f36;
        int i26;
        float f37;
        float f38;
        int i27;
        float f39;
        float f40;
        int i28;
        float f41;
        float f42;
        int i29;
        float f43;
        float f44;
        this.f29272w = true;
        int i30 = h10.f22829t0;
        this.f29274y = i30;
        this.S = 1.0f;
        this.M = e6Var;
        this.I = i3;
        this.E = org.telegram.messenger.z5.q(i30).k();
        ImageView imageView = new ImageView(context);
        this.f29264a = imageView;
        if (i3 == 1) {
            boolean z10 = bd.f21784a0;
            if (z10) {
                i29 = 5;
            } else {
                i29 = 3;
            }
            int i31 = i29 | 48;
            if (z10) {
                f43 = 0.0f;
            } else {
                f43 = 15.0f;
            }
            if (z10) {
                f44 = 15.0f;
            } else {
                f44 = 0.0f;
            }
            addView(imageView, mf.d(42, 42.0f, i31, f43, 12.0f, f44, 0.0f));
        } else {
            boolean z11 = bd.f21784a0;
            if (z11) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i32 = i10 | 48;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 12.0f;
            }
            if (z11) {
                f11 = 12.0f;
            } else {
                f11 = 0.0f;
            }
            addView(imageView, mf.d(40, 40.0f, i32, f10, 8.0f, f11, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.pj, e6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i3 == 1) {
            boolean z12 = bd.f21784a0;
            if (z12) {
                i28 = 5;
            } else {
                i28 = 3;
            }
            int i33 = i28 | 48;
            if (z12) {
                f41 = 0.0f;
            } else {
                f41 = 20.0f;
            }
            if (z12) {
                f42 = 20.0f;
            } else {
                f42 = 0.0f;
            }
            addView(textView, mf.d(32, -2.0f, i33, f41, 28.0f, f42, 0.0f));
        } else {
            boolean z13 = bd.f21784a0;
            if (z13) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i34 = i11 | 48;
            if (z13) {
                f12 = 0.0f;
            } else {
                f12 = 16.0f;
            }
            if (z13) {
                f13 = 16.0f;
            } else {
                f13 = 0.0f;
            }
            addView(textView, mf.d(32, -2.0f, i34, f12, 22.0f, f13, 0.0f));
        }
        ei.d4 d4Var = new ei.d4(2, context, this);
        this.f29265b = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        if (i3 == 1) {
            boolean z14 = bd.f21784a0;
            if (z14) {
                i27 = 5;
            } else {
                i27 = 3;
            }
            int i35 = i27 | 48;
            if (z14) {
                f39 = 0.0f;
            } else {
                f39 = 16.0f;
            }
            if (z14) {
                f40 = 16.0f;
            } else {
                f40 = 0.0f;
            }
            addView(d4Var, mf.d(42, 42.0f, i35, f39, 12.0f, f40, 0.0f));
        } else {
            boolean z15 = bd.f21784a0;
            if (z15) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i36 = i12 | 48;
            if (z15) {
                f14 = 0.0f;
            } else {
                f14 = 12.0f;
            }
            if (z15) {
                f15 = 12.0f;
            } else {
                f15 = 0.0f;
            }
            addView(d4Var, mf.d(40, 40.0f, i36, f14, 8.0f, f15, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f29266c = textView2;
        int i37 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView2, i37, e6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (bd.f21784a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        if (i3 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = bd.f21784a0;
            if (z16) {
                i26 = 5;
            } else {
                i26 = 3;
            }
            int i38 = i26 | 48;
            if (z16) {
                f37 = 8.0f;
            } else {
                f37 = 72.0f;
            }
            if (z16) {
                f38 = 72.0f;
            } else {
                f38 = 8.0f;
            }
            addView(textView2, mf.d(-1, -2.0f, i38, f37, 9.0f, f38, 0.0f));
            f16 = 14.0f;
        } else if (i3 == 2) {
            LinearLayout f45 = org.telegram.messenger.k5.f(context, 0);
            boolean z17 = bd.f21784a0;
            if (z17) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i39 = i15 | 48;
            if (z17) {
                f19 = 16.0f;
            } else {
                f19 = 72.0f;
            }
            if (z17) {
                f20 = 72.0f;
            } else {
                f20 = 16.0f;
            }
            addView(f45, mf.d(-1, -2.0f, i39, f19, 5.0f, f20, 0.0f));
            TextView textView3 = new TextView(context);
            this.f29270r = textView3;
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.A6, e6Var);
            textView3.setTextSize(1, 14.0f);
            f16 = 14.0f;
            if (!bd.f21784a0) {
                f45.addView(textView2, mf.l(1.0f, -2, -2));
                f45.addView(textView3, mf.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                f45.addView(textView3, mf.l(0.0f, -2, -2));
                f45.addView(textView2, mf.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f29271s = textView4;
            org.telegram.ui.ActionBar.r6.V(textView4, i37, e6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (bd.f21784a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView4.setGravity(i16 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = bd.f21784a0;
            if (z18) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i40 = i17 | 48;
            if (z18) {
                f21 = 8.0f;
            } else {
                f21 = 72.0f;
            }
            if (z18) {
                f22 = 72.0f;
            } else {
                f22 = 8.0f;
            }
            addView(textView4, mf.d(-1, -2.0f, i40, f21, 30.0f, f22, 0.0f));
            textView4.setVisibility(8);
        } else {
            f16 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = bd.f21784a0;
            if (z19) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i41 = i14 | 48;
            if (z19) {
                f17 = 8.0f;
            } else {
                f17 = 72.0f;
            }
            if (z19) {
                f18 = 72.0f;
            } else {
                f18 = 8.0f;
            }
            addView(textView2, mf.d(-1, -2.0f, i41, f17, 5.0f, f18, 0.0f));
        }
        ch0 ch0Var = new ch0(2131624002, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), true, null);
        this.L = ch0Var;
        ?? imageView2 = new ImageView(context);
        this.f29268f = imageView2;
        imageView2.setAnimation(ch0Var);
        imageView2.setVisibility(4);
        int i42 = org.telegram.ui.ActionBar.k6.f28246wi;
        org.telegram.ui.ActionBar.r6.t(imageView2, i42, e6Var, PorterDuff.Mode.SRC_IN);
        if (i3 == 1) {
            boolean z20 = bd.f21784a0;
            if (z20) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i43 = i25 | 48;
            if (z20) {
                f35 = 8.0f;
            } else {
                f35 = 70.0f;
            }
            if (z20) {
                f36 = 72.0f;
            } else {
                f36 = 8.0f;
            }
            addView((View) imageView2, mf.d(14, 14.0f, i43, f35, 37.0f, f36, 0.0f));
        } else {
            boolean z21 = bd.f21784a0;
            if (z21) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i44 = i18 | 48;
            if (z21) {
                f23 = 8.0f;
            } else {
                f23 = 70.0f;
            }
            if (z21) {
                f24 = 72.0f;
            } else {
                f24 = 8.0f;
            }
            addView((View) imageView2, mf.d(14, 14.0f, i44, f23, 33.0f, f24, 0.0f));
        }
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.f29267e = o5Var;
        org.telegram.ui.ActionBar.r6.V(o5Var, org.telegram.ui.ActionBar.k6.A6, e6Var);
        o5Var.setLines(1);
        o5Var.setMaxLines(1);
        o5Var.setSingleLine(true);
        o5Var.setEllipsize(truncateAt);
        if (bd.f21784a0) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        o5Var.setGravity(i19 | 16);
        hs.i(o5Var);
        if (i3 == 1) {
            o5Var.setTextSize(1, 13.0f);
            boolean z22 = bd.f21784a0;
            if (z22) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i45 = i24 | 48;
            if (z22) {
                f33 = 8.0f;
            } else {
                f33 = 72.0f;
            }
            if (z22) {
                f34 = 72.0f;
            } else {
                f34 = 8.0f;
            }
            addView(o5Var, mf.d(-1, -2.0f, i45, f33, 34.0f, f34, 0.0f));
        } else {
            o5Var.setTextSize(1, 13.0f);
            boolean z23 = bd.f21784a0;
            if (z23) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            int i46 = i20 | 48;
            if (z23) {
                f25 = 8.0f;
            } else {
                f25 = 72.0f;
            }
            if (z23) {
                f26 = 72.0f;
            } else {
                f26 = 8.0f;
            }
            addView(o5Var, mf.d(-1, -2.0f, i46, f25, 30.0f, f26, 0.0f));
        }
        d70 d70Var = new d70(context);
        this.h = d70Var;
        d70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i42, e6Var));
        boolean z24 = bd.f21784a0;
        if (z24) {
            i21 = 5;
        } else {
            i21 = 3;
        }
        int i47 = i21 | 48;
        if (z24) {
            f27 = 0.0f;
        } else {
            f27 = 72.0f;
        }
        if (z24) {
            f28 = 72.0f;
        } else {
            f28 = 0.0f;
        }
        addView(d70Var, mf.d(-1, 2.0f, i47, f27, 54.0f, f28, 0.0f));
        wo woVar = new wo(21, context, e6Var);
        this.f29269n = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        if (i3 == 1) {
            boolean z25 = bd.f21784a0;
            if (z25) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i48 = i23 | 48;
            if (z25) {
                f31 = 0.0f;
            } else {
                f31 = 38.0f;
            }
            if (z25) {
                f32 = 38.0f;
            } else {
                f32 = 0.0f;
            }
            addView(woVar, mf.d(24, 24.0f, i48, f31, 36.0f, f32, 0.0f));
        } else {
            boolean z26 = bd.f21784a0;
            if (z26) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            int i49 = i22 | 48;
            if (z26) {
                f29 = 0.0f;
            } else {
                f29 = 33.0f;
            }
            if (z26) {
                f30 = 33.0f;
            } else {
                f30 = 0.0f;
            }
            addView(woVar, mf.d(24, 24.0f, i49, f29, 28.0f, f30, 0.0f));
        }
        if (i3 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    @Override
    public final void C(boolean z10) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override
    public final void M(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.f29273x) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", this.M));
        }
    }

    public final void b(boolean z10, boolean z11) {
        wo woVar = this.f29269n;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
    }

    public final void c(zi ziVar, boolean z10) {
        boolean z11;
        String str;
        String str2;
        String str3;
        int i3;
        boolean z12;
        boolean z13;
        String str4;
        String str5;
        String str6;
        zi ziVar2 = this.F;
        if (ziVar2 != null && ziVar != null && ziVar2.f1() != ziVar.f1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29273x = z10;
        this.F = ziVar;
        this.H = false;
        this.G = false;
        if (!z11) {
            this.O = 0L;
        }
        TLRPC.Document F0 = ziVar.F0();
        TextView textView = this.f29271s;
        TextView textView2 = this.f29266c;
        String str7 = "";
        ImageView imageView = this.f29264a;
        TextView textView3 = this.d;
        ei.d4 d4Var = this.f29265b;
        if (F0 != null) {
            if (ziVar.J3()) {
                str = null;
                for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = ziVar.x1(true) + " - " + ziVar.z1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!zi.M4(ziVar.f26868k) && !(ziVar.f26868k.media instanceof TLRPC.TL_messageMediaPhoto) && !zi.t3(F0, false)) {
                str2 = org.telegram.messenger.w7.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (zi.t3(F0, false)) {
                        str2 = bd.M0(2131753971, null);
                    } else {
                        str2 = bd.M0(2131753933, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (zi.t3(F0, false)) {
                        str2 = bd.M0(2131753971, null);
                    } else {
                        str2 = bd.M0(2131753948, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = bd.M0(2131753982, null);
                } else {
                    str2 = bd.M0(2131753975, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = ziVar.Y1;
            org.telegram.ui.ActionBar.e6 e6Var = this.M;
            CharSequence x12 = org.telegram.messenger.g0.x1(str3, arrayList, e6Var);
            if (x12 != null) {
                textView2.setText(x12);
            } else {
                textView2.setText(str3);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(org.telegram.messenger.g0.m1(str2, false));
            int lastIndexOf = str2.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str7 = str2.substring(lastIndexOf + 1).toLowerCase();
            }
            textView3.setText(str7);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 40, false, null, false);
            if (w11 == w10) {
                w10 = null;
            }
            if (!(w11 instanceof TLRPC.TL_photoSizeEmpty) && w11 != null) {
                ImageReceiver imageReceiver = d4Var.getImageReceiver();
                if (w10 == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver.G0 = z12;
                ImageReceiver imageReceiver2 = d4Var.getImageReceiver();
                if (w10 == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                imageReceiver2.H0 = z13;
                d4Var.setVisibility(0);
                if (ziVar.G1 != null) {
                    d4Var.n(ac.c(w10, F0), "40_40", null, null, ziVar.G1, null, 1, ziVar);
                } else {
                    d4Var.g(1, 0L, ziVar, "40_40", "40_40_b", null, ac.c(w10, F0), ac.c(w11, F0));
                }
            } else {
                d4Var.setVisibility(4);
                d4Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (ziVar.s2() && !TextUtils.isEmpty(this.F.f26868k.message)) {
                CharSequence x13 = org.telegram.messenger.g0.x1(this.F.f26868k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.Y1, e6Var);
                this.K = x13;
                if (textView != null) {
                    if (x13 == null) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    textView.setVisibility(i3);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.f29267e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            d4Var.setVisibility(4);
            d4Var.setImageBitmap(null);
            this.K = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f29273x);
        this.h.a(false, 0.0f);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i3, boolean z10) {
        int i10;
        int i11;
        this.f29266c.setText(str);
        this.f29267e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f29273x = z10;
        ImageView imageView = this.f29264a;
        if (i3 == 0) {
            imageView.setImageResource(org.telegram.messenger.g0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.I;
        ei.d4 d4Var = this.f29265b;
        if (str4 == null && i3 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                d4Var.setImageBitmap(null);
                d4Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i12 != 3) {
                    d4Var.h(str4, "42_42", null);
                }
            } else {
                xp N = org.telegram.ui.ActionBar.k6.N(org.telegram.messenger.g0.L(42.0f), i3);
                if (i3 == 2131231074) {
                    i10 = org.telegram.ui.ActionBar.k6.f28066na;
                    i11 = org.telegram.ui.ActionBar.k6.f27976ia;
                } else if (i3 == 2131231071) {
                    i10 = org.telegram.ui.ActionBar.k6.la;
                    i11 = org.telegram.ui.ActionBar.k6.f27976ia;
                } else if (i3 == 2131231073) {
                    i10 = org.telegram.ui.ActionBar.k6.f28011ka;
                    i11 = org.telegram.ui.ActionBar.k6.f27976ia;
                } else if (i3 == 2131231072) {
                    i10 = org.telegram.ui.ActionBar.k6.f27993ja;
                    i11 = org.telegram.ui.ActionBar.k6.f27976ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.oj;
                    i11 = org.telegram.ui.ActionBar.k6.nj;
                }
                org.telegram.ui.ActionBar.e6 e6Var = this.M;
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i10, e6Var), false);
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i11, e6Var), true);
                d4Var.setImageDrawable(N);
            }
            d4Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.f29273x);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.S != 1.0f && this.N != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.S) * 255.0f), 31);
            this.N.setViewType(3);
            this.N.updateColors();
            this.N.f();
            this.N.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.S * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
            a(canvas);
        }
        boolean z10 = this.P;
        if (!z10 && this.Q == 0.0f) {
            return;
        }
        if (z10) {
            float f10 = this.Q;
            if (f10 != 1.0f) {
                this.Q = f10 + 0.10666667f;
                invalidate();
                this.Q = Utilities.i(this.Q, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.Q;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f12 = this.Q;
            if (f12 != 0.0f) {
                this.Q = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.Q = Utilities.i(this.Q, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.Q;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String C;
        zi ziVar = this.F;
        if (ziVar != null && ziVar.F0() != null) {
            zi ziVar2 = this.F;
            long j10 = ziVar2.f26868k.date * 1000;
            long j11 = this.O;
            if (j11 == 0) {
                C = org.telegram.messenger.g0.i0(ziVar2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                C = a1.g.C(org.telegram.messenger.g0.i0(j11, false, false), " / ", org.telegram.messenger.g0.i0(this.F.F0().size, false, false));
            }
            int i3 = this.I;
            org.telegram.ui.Components.o5 o5Var = this.f29267e;
            if (i3 == 2) {
                o5Var.setText(new SpannableStringBuilder().append((CharSequence) C).append(' ').append((CharSequence) this.J).append(' ').append(wz.d(this.F, true, 2, o5Var.getPaint())));
                this.f29270r.setText(bd.e1(this.F.f26868k.date));
                return;
            }
            String a02 = bd.a0("formatDateAtTime", null, 2131742793, bd.E0().C0().format(new Date(j10)), bd.E0().p0().format(new Date(j10)));
            o5Var.setText(C + ", " + a02);
        }
    }

    public final void f(boolean z10) {
        float f10;
        float f11;
        int i3;
        float f12;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f40452f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        zi ziVar = this.F;
        float f13 = 72.0f;
        int i10 = this.f29274y;
        fh0 fh0Var = this.f29268f;
        d70 d70Var = this.h;
        float f14 = 8.0f;
        org.telegram.ui.Components.o5 o5Var = this.f29267e;
        if (ziVar != null && ziVar.f26868k.media != null) {
            this.H = false;
            if (!ziVar.f26913w0 && !ziVar.f26917x0 && this.f29272w) {
                String r5 = org.telegram.messenger.w7.r(null, ziVar.F0());
                org.telegram.messenger.z5.q(i10).a(r5, this.F, this);
                this.G = org.telegram.messenger.w7.G(i10).T(r5);
                fh0Var.setVisibility(0);
                int i11 = 15;
                if (this.G) {
                    i3 = 15;
                } else {
                    i3 = 0;
                }
                ch0 ch0Var = this.L;
                ch0Var.P(i3);
                ch0Var.h = true;
                if (z10) {
                    fh0Var.d();
                } else {
                    if (!this.G) {
                        i11 = 0;
                    }
                    ch0Var.M(i11);
                    fh0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
                if (layoutParams != null) {
                    if (bd.f21784a0) {
                        f12 = 8.0f;
                    } else {
                        f12 = 86.0f;
                    }
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(f12);
                    if (bd.f21784a0) {
                        f14 = 86.0f;
                    }
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(f14);
                    o5Var.requestLayout();
                }
                if (this.G) {
                    d70Var.setVisibility(0);
                    Float w10 = zb.D().w(r5);
                    if (w10 == null) {
                        w10 = Float.valueOf(0.0f);
                    }
                    d70Var.a(false, w10.floatValue());
                    return;
                }
                d70Var.setVisibility(4);
                return;
            }
            fh0Var.setVisibility(4);
            d70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
            if (layoutParams2 != null) {
                if (bd.f21784a0) {
                    f11 = 8.0f;
                } else {
                    f11 = 72.0f;
                }
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(f11);
                if (!bd.f21784a0) {
                    f13 = 8.0f;
                }
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(f13);
                o5Var.requestLayout();
            }
            this.G = false;
            this.H = true;
            org.telegram.messenger.z5.q(i10).v(this);
            return;
        }
        this.G = false;
        this.H = true;
        d70Var.setVisibility(4);
        d70Var.a(false, 0.0f);
        fh0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (bd.f21784a0) {
                f10 = 8.0f;
            } else {
                f10 = 72.0f;
            }
            layoutParams3.leftMargin = org.telegram.messenger.g0.L(f10);
            if (!bd.f21784a0) {
                f13 = 8.0f;
            }
            layoutParams3.rightMargin = org.telegram.messenger.g0.L(f13);
            o5Var.requestLayout();
        }
        org.telegram.messenger.z5.q(i10).v(this);
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f29265b;
    }

    public zi getMessage() {
        return this.F;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void i(long j10, long j11) {
        d70 d70Var = this.h;
        if (d70Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j10;
        e();
        d70Var.a(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
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
        org.telegram.messenger.z5.q(this.f29274y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.f29269n;
        if (woVar.f40035a.f31334q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.f40035a.f31334q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.I != 1) {
            TextView textView = this.f29266c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f29271s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.k5.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.o5 o5Var = this.f29267e;
                o5Var.layout(o5Var.getLeft(), o5Var.getTop() + measuredHeight, o5Var.getRight(), o5Var.getBottom() + measuredHeight);
                fh0 fh0Var = this.f29268f;
                fh0Var.layout(fh0Var.getLeft(), fh0Var.getTop() + measuredHeight, fh0Var.getRight(), fh0Var.getBottom() + measuredHeight);
                d70 d70Var = this.h;
                d70Var.layout(d70Var.getLeft(), (getMeasuredHeight() - d70Var.getMeasuredHeight()) - (this.f29273x ? 1 : 0), d70Var.getRight(), getMeasuredHeight() - (this.f29273x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TextView textView;
        int i11 = this.I;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f29273x ? 1 : 0), 1073741824));
        } else if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
            int measuredHeight = this.f29266c.getMeasuredHeight() + org.telegram.messenger.g0.L(34.0f) + (this.f29273x ? 1 : 0);
            if (this.K != null && (textView = this.f29271s) != null && this.F.s2()) {
                this.R = true;
                textView.setText(org.telegram.messenger.g0.Q(this.K, (String) this.F.Y1.get(0), textView.getMeasuredWidth(), textView.getPaint()));
                this.R = false;
                measuredHeight = org.telegram.messenger.k5.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.R) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.f29272w = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(iz izVar) {
        this.N = izVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ei.d4 d4Var = this.f29265b;
        if (endsWith) {
            d4Var.h("vthumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            d4Var.setVisibility(8);
        } else {
            d4Var.h("thumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(ye yeVar) {
        String str = yeVar.f25311c;
        long j10 = yeVar.H;
        int i3 = yeVar.G;
        int i10 = yeVar.F;
        int i11 = yeVar.C;
        String str2 = yeVar.I;
        ei.d4 d4Var = this.f29265b;
        if (str != null) {
            d4Var.h(str, null, org.telegram.ui.ActionBar.k6.R4);
            str2 = yeVar.f25311c;
        } else if (str2 != null) {
            if (yeVar.f25310b) {
                d4Var.r();
                d4Var.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
            } else {
                d4Var.s(yeVar.J, yeVar.K, true);
                d4Var.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
            }
        } else {
            d4Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            str2 = "";
        }
        File file = new File(str2);
        this.f29266c.setText(file.getName());
        org.telegram.messenger.w7.D(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0 && i3 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(i10 + "x" + i3);
        }
        if (yeVar.f25310b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.g0(yeVar.E, false, false));
        }
        if (j10 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.i0(j10, false, false));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(bd.E0().z0().format(yeVar.D));
        this.f29267e.setText(sb2);
        this.f29264a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28246wi, this.M));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
