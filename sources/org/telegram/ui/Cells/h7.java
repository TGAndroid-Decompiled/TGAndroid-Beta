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
import org.telegram.messenger.gc;
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.yz;
public final class h7 extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.x5 {
    public final int D;
    public ij E;
    public boolean F;
    public boolean G;
    public final int H;
    public final SpannableStringBuilder I;
    public CharSequence J;
    public final zg0 K;
    public final org.telegram.ui.ActionBar.f6 L;
    public lz M;
    public long N;
    public boolean O;
    public float P;
    public boolean Q;
    public float R;
    public final ImageView f29281a;
    public final di.c4 f29282b;
    public final TextView f29283c;
    public final TextView d;
    public final org.telegram.ui.Components.q5 f29284e;
    public final ch0 f29285f;
    public final h70 h;
    public final wo f29286n;
    public final TextView f29287r;
    public final TextView f29288s;
    public boolean f29289w;
    public boolean f29290x;
    public final int f29291y;

    public h7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f29289w = true;
        int i30 = p10.f24467s0;
        this.f29291y = i30;
        this.R = 1.0f;
        this.L = f6Var;
        this.H = i7;
        this.D = org.telegram.messenger.z5.q(i30).k();
        ImageView imageView = new ImageView(context);
        this.f29281a = imageView;
        if (i7 == 1) {
            boolean z9 = hd.f22878a0;
            if (z9) {
                i29 = 5;
            } else {
                i29 = 3;
            }
            int i31 = i29 | 48;
            if (z9) {
                f43 = 0.0f;
            } else {
                f43 = 15.0f;
            }
            if (z9) {
                f44 = 15.0f;
            } else {
                f44 = 0.0f;
            }
            addView(imageView, c8.ha.d(42, 42.0f, i31, f43, 12.0f, f44, 0.0f));
        } else {
            boolean z10 = hd.f22878a0;
            if (z10) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i32 = i10 | 48;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 12.0f;
            }
            if (z10) {
                f11 = 12.0f;
            } else {
                f11 = 0.0f;
            }
            addView(imageView, c8.ha.d(40, 40.0f, i32, f10, 8.0f, f11, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.pj, f6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i7 == 1) {
            boolean z11 = hd.f22878a0;
            if (z11) {
                i28 = 5;
            } else {
                i28 = 3;
            }
            int i33 = i28 | 48;
            if (z11) {
                f41 = 0.0f;
            } else {
                f41 = 20.0f;
            }
            if (z11) {
                f42 = 20.0f;
            } else {
                f42 = 0.0f;
            }
            addView(textView, c8.ha.d(32, -2.0f, i33, f41, 28.0f, f42, 0.0f));
        } else {
            boolean z12 = hd.f22878a0;
            if (z12) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i34 = i11 | 48;
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 16.0f;
            }
            if (z12) {
                f13 = 16.0f;
            } else {
                f13 = 0.0f;
            }
            addView(textView, c8.ha.d(32, -2.0f, i34, f12, 22.0f, f13, 0.0f));
        }
        di.c4 c4Var = new di.c4(2, context, this);
        this.f29282b = c4Var;
        c4Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        if (i7 == 1) {
            boolean z13 = hd.f22878a0;
            if (z13) {
                i27 = 5;
            } else {
                i27 = 3;
            }
            int i35 = i27 | 48;
            if (z13) {
                f39 = 0.0f;
            } else {
                f39 = 16.0f;
            }
            if (z13) {
                f40 = 16.0f;
            } else {
                f40 = 0.0f;
            }
            addView(c4Var, c8.ha.d(42, 42.0f, i35, f39, 12.0f, f40, 0.0f));
        } else {
            boolean z14 = hd.f22878a0;
            if (z14) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i36 = i12 | 48;
            if (z14) {
                f14 = 0.0f;
            } else {
                f14 = 12.0f;
            }
            if (z14) {
                f15 = 12.0f;
            } else {
                f15 = 0.0f;
            }
            addView(c4Var, c8.ha.d(40, 40.0f, i36, f14, 8.0f, f15, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f29283c = textView2;
        int i37 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView2, i37, f6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (hd.f22878a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        if (i7 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z15 = hd.f22878a0;
            if (z15) {
                i26 = 5;
            } else {
                i26 = 3;
            }
            int i38 = i26 | 48;
            if (z15) {
                f37 = 8.0f;
            } else {
                f37 = 72.0f;
            }
            if (z15) {
                f38 = 72.0f;
            } else {
                f38 = 8.0f;
            }
            addView(textView2, c8.ha.d(-1, -2.0f, i38, f37, 9.0f, f38, 0.0f));
            f16 = 14.0f;
        } else if (i7 == 2) {
            LinearLayout f45 = org.telegram.messenger.k5.f(context, 0);
            boolean z16 = hd.f22878a0;
            if (z16) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i39 = i15 | 48;
            if (z16) {
                f19 = 16.0f;
            } else {
                f19 = 72.0f;
            }
            if (z16) {
                f20 = 72.0f;
            } else {
                f20 = 16.0f;
            }
            addView(f45, c8.ha.d(-1, -2.0f, i39, f19, 5.0f, f20, 0.0f));
            TextView textView3 = new TextView(context);
            this.f29287r = textView3;
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.A6, f6Var);
            textView3.setTextSize(1, 14.0f);
            f16 = 14.0f;
            if (!hd.f22878a0) {
                f45.addView(textView2, c8.ha.l(1.0f, -2, -2));
                f45.addView(textView3, c8.ha.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                f45.addView(textView3, c8.ha.l(0.0f, -2, -2));
                f45.addView(textView2, c8.ha.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f29288s = textView4;
            org.telegram.ui.ActionBar.r6.V(textView4, i37, f6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (hd.f22878a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView4.setGravity(i16 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z17 = hd.f22878a0;
            if (z17) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i40 = i17 | 48;
            if (z17) {
                f21 = 8.0f;
            } else {
                f21 = 72.0f;
            }
            if (z17) {
                f22 = 72.0f;
            } else {
                f22 = 8.0f;
            }
            addView(textView4, c8.ha.d(-1, -2.0f, i40, f21, 30.0f, f22, 0.0f));
            textView4.setVisibility(8);
        } else {
            f16 = 14.0f;
            textView2.setMaxLines(1);
            boolean z18 = hd.f22878a0;
            if (z18) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i41 = i14 | 48;
            if (z18) {
                f17 = 8.0f;
            } else {
                f17 = 72.0f;
            }
            if (z18) {
                f18 = 72.0f;
            } else {
                f18 = 8.0f;
            }
            addView(textView2, c8.ha.d(-1, -2.0f, i41, f17, 5.0f, f18, 0.0f));
        }
        zg0 zg0Var = new zg0(2131624002, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), true, null);
        this.K = zg0Var;
        ?? imageView2 = new ImageView(context);
        this.f29285f = imageView2;
        imageView2.setAnimation(zg0Var);
        imageView2.setVisibility(4);
        int i42 = org.telegram.ui.ActionBar.k6.f28214wi;
        org.telegram.ui.ActionBar.r6.t(imageView2, i42, f6Var, PorterDuff.Mode.SRC_IN);
        if (i7 == 1) {
            boolean z19 = hd.f22878a0;
            if (z19) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i43 = i25 | 48;
            if (z19) {
                f35 = 8.0f;
            } else {
                f35 = 70.0f;
            }
            if (z19) {
                f36 = 72.0f;
            } else {
                f36 = 8.0f;
            }
            addView((View) imageView2, c8.ha.d(14, 14.0f, i43, f35, 37.0f, f36, 0.0f));
        } else {
            boolean z20 = hd.f22878a0;
            if (z20) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i44 = i18 | 48;
            if (z20) {
                f23 = 8.0f;
            } else {
                f23 = 70.0f;
            }
            if (z20) {
                f24 = 72.0f;
            } else {
                f24 = 8.0f;
            }
            addView((View) imageView2, c8.ha.d(14, 14.0f, i44, f23, 33.0f, f24, 0.0f));
        }
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.f29284e = q5Var;
        org.telegram.ui.ActionBar.r6.V(q5Var, org.telegram.ui.ActionBar.k6.A6, f6Var);
        q5Var.setLines(1);
        q5Var.setMaxLines(1);
        q5Var.setSingleLine(true);
        q5Var.setEllipsize(truncateAt);
        if (hd.f22878a0) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        q5Var.setGravity(i19 | 16);
        qs.i(q5Var);
        if (i7 == 1) {
            q5Var.setTextSize(1, 13.0f);
            boolean z21 = hd.f22878a0;
            if (z21) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i45 = i24 | 48;
            if (z21) {
                f33 = 8.0f;
            } else {
                f33 = 72.0f;
            }
            if (z21) {
                f34 = 72.0f;
            } else {
                f34 = 8.0f;
            }
            addView(q5Var, c8.ha.d(-1, -2.0f, i45, f33, 34.0f, f34, 0.0f));
        } else {
            q5Var.setTextSize(1, 13.0f);
            boolean z22 = hd.f22878a0;
            if (z22) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            int i46 = i20 | 48;
            if (z22) {
                f25 = 8.0f;
            } else {
                f25 = 72.0f;
            }
            if (z22) {
                f26 = 72.0f;
            } else {
                f26 = 8.0f;
            }
            addView(q5Var, c8.ha.d(-1, -2.0f, i46, f25, 30.0f, f26, 0.0f));
        }
        h70 h70Var = new h70(context);
        this.h = h70Var;
        h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i42, f6Var));
        boolean z23 = hd.f22878a0;
        if (z23) {
            i21 = 5;
        } else {
            i21 = 3;
        }
        int i47 = i21 | 48;
        if (z23) {
            f27 = 0.0f;
        } else {
            f27 = 72.0f;
        }
        if (z23) {
            f28 = 72.0f;
        } else {
            f28 = 0.0f;
        }
        addView(h70Var, c8.ha.d(-1, 2.0f, i47, f27, 54.0f, f28, 0.0f));
        wo woVar = new wo(21, context, f6Var);
        this.f29286n = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27849d6, org.telegram.ui.ActionBar.k6.f27979k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        if (i7 == 1) {
            boolean z24 = hd.f22878a0;
            if (z24) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i48 = i23 | 48;
            if (z24) {
                f31 = 0.0f;
            } else {
                f31 = 38.0f;
            }
            if (z24) {
                f32 = 38.0f;
            } else {
                f32 = 0.0f;
            }
            addView(woVar, c8.ha.d(24, 24.0f, i48, f31, 36.0f, f32, 0.0f));
        } else {
            boolean z25 = hd.f22878a0;
            if (z25) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            int i49 = i22 | 48;
            if (z25) {
                f29 = 0.0f;
            } else {
                f29 = 33.0f;
            }
            if (z25) {
                f30 = 33.0f;
            } else {
                f30 = 0.0f;
            }
            addView(woVar, c8.ha.d(24, 24.0f, i49, f29, 28.0f, f30, 0.0f));
        }
        if (i7 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.I = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    @Override
    public final void C(boolean z9) {
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
        if (this.f29290x) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", this.L));
        }
    }

    public final void b(boolean z9, boolean z10) {
        wo woVar = this.f29286n;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, z10);
    }

    public final void c(ij ijVar, boolean z9) {
        boolean z10;
        String str;
        String str2;
        String str3;
        int i7;
        boolean z11;
        boolean z12;
        String str4;
        String str5;
        String str6;
        ij ijVar2 = this.E;
        if (ijVar2 != null && ijVar != null && ijVar2.f1() != ijVar.f1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29290x = z9;
        this.E = ijVar;
        this.G = false;
        this.F = false;
        if (!z10) {
            this.N = 0L;
        }
        TLRPC.Document F0 = ijVar.F0();
        TextView textView = this.f29288s;
        TextView textView2 = this.f29283c;
        String str7 = "";
        ImageView imageView = this.f29281a;
        TextView textView3 = this.d;
        di.c4 c4Var = this.f29282b;
        if (F0 != null) {
            if (ijVar.J3()) {
                str = null;
                for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = ijVar.x1(true) + " - " + ijVar.z1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!ij.M4(ijVar.f23244k) && !(ijVar.f23244k.media instanceof TLRPC.TL_messageMediaPhoto) && !ij.t3(F0, false)) {
                str2 = org.telegram.messenger.w7.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (ij.t3(F0, false)) {
                        str2 = hd.M0(2131753971, null);
                    } else {
                        str2 = hd.M0(2131753933, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (ij.t3(F0, false)) {
                        str2 = hd.M0(2131753971, null);
                    } else {
                        str2 = hd.M0(2131753948, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = hd.M0(2131753982, null);
                } else {
                    str2 = hd.M0(2131753975, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = ijVar.Y1;
            org.telegram.ui.ActionBar.f6 f6Var = this.L;
            CharSequence x12 = org.telegram.messenger.g0.x1(str3, arrayList, f6Var);
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
                ImageReceiver imageReceiver = c4Var.getImageReceiver();
                if (w10 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                imageReceiver.F0 = z11;
                ImageReceiver imageReceiver2 = c4Var.getImageReceiver();
                if (w10 == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver2.G0 = z12;
                c4Var.setVisibility(0);
                if (ijVar.G1 != null) {
                    c4Var.n(hc.c(w10, F0), "40_40", null, null, ijVar.G1, null, 1, ijVar);
                } else {
                    c4Var.g(1, 0L, ijVar, "40_40", "40_40_b", null, hc.c(w10, F0), hc.c(w11, F0));
                }
            } else {
                c4Var.setVisibility(4);
                c4Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (ijVar.s2() && !TextUtils.isEmpty(this.E.f23244k.message)) {
                CharSequence x13 = org.telegram.messenger.g0.x1(this.E.f23244k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.E.Y1, f6Var);
                this.J = x13;
                if (textView != null) {
                    if (x13 == null) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    textView.setVisibility(i7);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.f29284e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            c4Var.setVisibility(4);
            c4Var.setImageBitmap(null);
            this.J = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f29290x);
        this.h.a(false, 0.0f);
        f(z10);
    }

    public final void d(String str, String str2, String str3, String str4, int i7, boolean z9) {
        int i10;
        int i11;
        this.f29283c.setText(str);
        this.f29284e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f29290x = z9;
        ImageView imageView = this.f29281a;
        if (i7 == 0) {
            imageView.setImageResource(org.telegram.messenger.g0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.H;
        di.c4 c4Var = this.f29282b;
        if (str4 == null && i7 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                c4Var.setImageBitmap(null);
                c4Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i12 != 3) {
                    c4Var.h(str4, "42_42", null);
                }
            } else {
                xp N = org.telegram.ui.ActionBar.k6.N(org.telegram.messenger.g0.L(42.0f), i7);
                if (i7 == 2131231074) {
                    i10 = org.telegram.ui.ActionBar.k6.f28035na;
                    i11 = org.telegram.ui.ActionBar.k6.f27944ia;
                } else if (i7 == 2131231071) {
                    i10 = org.telegram.ui.ActionBar.k6.f28000la;
                    i11 = org.telegram.ui.ActionBar.k6.f27944ia;
                } else if (i7 == 2131231073) {
                    i10 = org.telegram.ui.ActionBar.k6.f27982ka;
                    i11 = org.telegram.ui.ActionBar.k6.f27944ia;
                } else if (i7 == 2131231072) {
                    i10 = org.telegram.ui.ActionBar.k6.f27962ja;
                    i11 = org.telegram.ui.ActionBar.k6.f27944ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.oj;
                    i11 = org.telegram.ui.ActionBar.k6.nj;
                }
                org.telegram.ui.ActionBar.f6 f6Var = this.L;
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i10, f6Var), false);
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i11, f6Var), true);
                c4Var.setImageDrawable(N);
            }
            c4Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.f29290x);
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
        boolean z9 = this.O;
        if (!z9 && this.P == 0.0f) {
            return;
        }
        if (z9) {
            float f10 = this.P;
            if (f10 != 1.0f) {
                this.P = f10 + 0.10666667f;
                invalidate();
                this.P = Utilities.i(this.P, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.P;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z9) {
            float f12 = this.P;
            if (f12 != 0.0f) {
                this.P = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.P = Utilities.i(this.P, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.P;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String D;
        ij ijVar = this.E;
        if (ijVar != null && ijVar.F0() != null) {
            ij ijVar2 = this.E;
            long j3 = ijVar2.f23244k.date * 1000;
            long j10 = this.N;
            if (j10 == 0) {
                D = org.telegram.messenger.g0.i0(ijVar2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                D = a8.p0.D(org.telegram.messenger.g0.i0(j10, false, false), " / ", org.telegram.messenger.g0.i0(this.E.F0().size, false, false));
            }
            int i7 = this.H;
            org.telegram.ui.Components.q5 q5Var = this.f29284e;
            if (i7 == 2) {
                q5Var.setText(new SpannableStringBuilder().append((CharSequence) D).append(' ').append((CharSequence) this.I).append(' ').append(yz.d(this.E, true, 2, q5Var.getPaint())));
                this.f29287r.setText(hd.e1(this.E.f23244k.date));
                return;
            }
            String a02 = hd.a0("formatDateAtTime", null, 2131742784, hd.E0().C0().format(new Date(j3)), hd.E0().p0().format(new Date(j3)));
            q5Var.setText(D + ", " + a02);
        }
    }

    public final void f(boolean z9) {
        float f10;
        float f11;
        int i7;
        float f12;
        if (z9) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f40345f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        ij ijVar = this.E;
        float f13 = 72.0f;
        int i10 = this.f29291y;
        ch0 ch0Var = this.f29285f;
        h70 h70Var = this.h;
        float f14 = 8.0f;
        org.telegram.ui.Components.q5 q5Var = this.f29284e;
        if (ijVar != null && ijVar.f23244k.media != null) {
            this.G = false;
            if (!ijVar.f23289w0 && !ijVar.f23293x0 && this.f29289w) {
                String r10 = org.telegram.messenger.w7.r(null, ijVar.F0());
                org.telegram.messenger.z5.q(i10).a(r10, this.E, this);
                this.F = org.telegram.messenger.w7.G(i10).S(r10);
                ch0Var.setVisibility(0);
                int i11 = 15;
                if (this.F) {
                    i7 = 15;
                } else {
                    i7 = 0;
                }
                zg0 zg0Var = this.K;
                zg0Var.P(i7);
                zg0Var.h = true;
                if (z9) {
                    ch0Var.d();
                } else {
                    if (!this.F) {
                        i11 = 0;
                    }
                    zg0Var.M(i11);
                    ch0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
                if (layoutParams != null) {
                    if (hd.f22878a0) {
                        f12 = 8.0f;
                    } else {
                        f12 = 86.0f;
                    }
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(f12);
                    if (hd.f22878a0) {
                        f14 = 86.0f;
                    }
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(f14);
                    q5Var.requestLayout();
                }
                if (this.F) {
                    h70Var.setVisibility(0);
                    Float w10 = gc.D().w(r10);
                    if (w10 == null) {
                        w10 = Float.valueOf(0.0f);
                    }
                    h70Var.a(false, w10.floatValue());
                    return;
                }
                h70Var.setVisibility(4);
                return;
            }
            ch0Var.setVisibility(4);
            h70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
            if (layoutParams2 != null) {
                if (hd.f22878a0) {
                    f11 = 8.0f;
                } else {
                    f11 = 72.0f;
                }
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(f11);
                if (!hd.f22878a0) {
                    f13 = 8.0f;
                }
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(f13);
                q5Var.requestLayout();
            }
            this.F = false;
            this.G = true;
            org.telegram.messenger.z5.q(i10).v(this);
            return;
        }
        this.F = false;
        this.G = true;
        h70Var.setVisibility(4);
        h70Var.a(false, 0.0f);
        ch0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (hd.f22878a0) {
                f10 = 8.0f;
            } else {
                f10 = 72.0f;
            }
            layoutParams3.leftMargin = org.telegram.messenger.g0.L(f10);
            if (!hd.f22878a0) {
                f13 = 8.0f;
            }
            layoutParams3.rightMargin = org.telegram.messenger.g0.L(f13);
            q5Var.requestLayout();
        }
        org.telegram.messenger.z5.q(i10).v(this);
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f29282b;
    }

    public ij getMessage() {
        return this.E;
    }

    @Override
    public int getObserverTag() {
        return this.D;
    }

    @Override
    public final void i(long j3, long j10) {
        h70 h70Var = this.h;
        if (h70Var.getVisibility() != 0) {
            f(true);
        }
        this.N = j3;
        e();
        h70Var.a(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
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
        org.telegram.messenger.z5.q(this.f29291y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.f29286n;
        if (woVar.f40058a.f31259q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.f40058a.f31259q);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.H != 1) {
            TextView textView = this.f29283c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f29288s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.k5.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.q5 q5Var = this.f29284e;
                q5Var.layout(q5Var.getLeft(), q5Var.getTop() + measuredHeight, q5Var.getRight(), q5Var.getBottom() + measuredHeight);
                ch0 ch0Var = this.f29285f;
                ch0Var.layout(ch0Var.getLeft(), ch0Var.getTop() + measuredHeight, ch0Var.getRight(), ch0Var.getBottom() + measuredHeight);
                h70 h70Var = this.h;
                h70Var.layout(h70Var.getLeft(), (getMeasuredHeight() - h70Var.getMeasuredHeight()) - (this.f29290x ? 1 : 0), h70Var.getRight(), getMeasuredHeight() - (this.f29290x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11 = this.H;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f29290x ? 1 : 0), 1073741824));
        } else if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
            int measuredHeight = this.f29283c.getMeasuredHeight() + org.telegram.messenger.g0.L(34.0f) + (this.f29290x ? 1 : 0);
            if (this.J != null && (textView = this.f29288s) != null && this.E.s2()) {
                this.Q = true;
                textView.setText(org.telegram.messenger.g0.Q(this.J, (String) this.E.Y1.get(0), textView.getMeasuredWidth(), textView.getPaint()));
                this.Q = false;
                measuredHeight = org.telegram.messenger.k5.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
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

    public void setDrawDownloadIcon(boolean z9) {
        this.f29289w = z9;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(lz lzVar) {
        this.M = lzVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        di.c4 c4Var = this.f29282b;
        if (endsWith) {
            c4Var.h("vthumb://0:".concat(str), null, null);
            c4Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            c4Var.setVisibility(8);
        } else {
            c4Var.h("thumb://0:".concat(str), null, null);
            c4Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(gf gfVar) {
        String str = gfVar.f26825c;
        long j3 = gfVar.H;
        int i7 = gfVar.G;
        int i10 = gfVar.F;
        int i11 = gfVar.C;
        String str2 = gfVar.I;
        di.c4 c4Var = this.f29282b;
        if (str != null) {
            c4Var.h(str, null, org.telegram.ui.ActionBar.k6.R4);
            str2 = gfVar.f26825c;
        } else if (str2 != null) {
            if (gfVar.f26824b) {
                c4Var.r();
                c4Var.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
            } else {
                c4Var.s(gfVar.J, gfVar.K, true);
                c4Var.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
            }
        } else {
            c4Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            str2 = "";
        }
        File file = new File(str2);
        this.f29283c.setText(file.getName());
        org.telegram.messenger.w7.D(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0 && i7 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(i10 + "x" + i7);
        }
        if (gfVar.f26824b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.g0(gfVar.E, false, false));
        }
        if (j3 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.i0(j3, false, false));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(hd.E0().z0().format(gfVar.D));
        this.f29284e.setText(sb2);
        this.f29281a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214wi, this.L));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
