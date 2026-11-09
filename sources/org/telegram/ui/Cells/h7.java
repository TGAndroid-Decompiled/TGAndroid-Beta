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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.a00;
public final class h7 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.x5 {
    public final int D;
    public ij E;
    public boolean F;
    public boolean G;
    public final int H;
    public final SpannableStringBuilder I;
    public CharSequence J;
    public final ah0 K;
    public final org.telegram.ui.ActionBar.g6 L;
    public mz M;
    public long N;
    public boolean O;
    public float P;
    public boolean Q;
    public float R;
    public final ImageView f29288a;
    public final di.d4 f29289b;
    public final TextView f29290c;
    public final TextView d;
    public final org.telegram.ui.Components.q5 f29291e;
    public final dh0 f29292f;
    public final i70 h;
    public final wo f29293n;
    public final TextView f29294r;
    public final TextView f29295s;
    public boolean f29296w;
    public boolean f29297x;
    public final int f29298y;

    public h7(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f29296w = true;
        int i30 = p10.f24470s0;
        this.f29298y = i30;
        this.R = 1.0f;
        this.L = g6Var;
        this.H = i7;
        this.D = org.telegram.messenger.z5.q(i30).k();
        ImageView imageView = new ImageView(context);
        this.f29288a = imageView;
        if (i7 == 1) {
            boolean z9 = id.f23157a0;
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
            boolean z10 = id.f23157a0;
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
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.pj, g6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i7 == 1) {
            boolean z11 = id.f23157a0;
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
            boolean z12 = id.f23157a0;
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
        di.d4 d4Var = new di.d4(2, context, this);
        this.f29289b = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        if (i7 == 1) {
            boolean z13 = id.f23157a0;
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
            addView(d4Var, c8.ha.d(42, 42.0f, i35, f39, 12.0f, f40, 0.0f));
        } else {
            boolean z14 = id.f23157a0;
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
            addView(d4Var, c8.ha.d(40, 40.0f, i36, f14, 8.0f, f15, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f29290c = textView2;
        int i37 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.messenger.k5.n(textView2, i37, g6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (id.f23157a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        if (i7 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z15 = id.f23157a0;
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
            boolean z16 = id.f23157a0;
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
            this.f29294r = textView3;
            org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.A6, g6Var);
            textView3.setTextSize(1, 14.0f);
            f16 = 14.0f;
            if (!id.f23157a0) {
                f45.addView(textView2, c8.ha.l(1.0f, -2, -2));
                f45.addView(textView3, c8.ha.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                f45.addView(textView3, c8.ha.l(0.0f, -2, -2));
                f45.addView(textView2, c8.ha.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f29295s = textView4;
            org.telegram.ui.ActionBar.s6.U(textView4, i37, g6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (id.f23157a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView4.setGravity(i16 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z17 = id.f23157a0;
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
            boolean z18 = id.f23157a0;
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
        ah0 ah0Var = new ah0(2131624002, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), true, null);
        this.K = ah0Var;
        ?? imageView2 = new ImageView(context);
        this.f29292f = imageView2;
        imageView2.setAnimation(ah0Var);
        imageView2.setVisibility(4);
        int i42 = org.telegram.ui.ActionBar.l6.f28230wi;
        org.telegram.ui.ActionBar.s6.s(imageView2, i42, g6Var, PorterDuff.Mode.SRC_IN);
        if (i7 == 1) {
            boolean z19 = id.f23157a0;
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
            boolean z20 = id.f23157a0;
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
        this.f29291e = q5Var;
        org.telegram.ui.ActionBar.s6.U(q5Var, org.telegram.ui.ActionBar.l6.A6, g6Var);
        q5Var.setLines(1);
        q5Var.setMaxLines(1);
        q5Var.setSingleLine(true);
        q5Var.setEllipsize(truncateAt);
        if (id.f23157a0) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        q5Var.setGravity(i19 | 16);
        qs.i(q5Var);
        if (i7 == 1) {
            q5Var.setTextSize(1, 13.0f);
            boolean z21 = id.f23157a0;
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
            boolean z22 = id.f23157a0;
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
        i70 i70Var = new i70(context);
        this.h = i70Var;
        i70Var.setProgressColor(org.telegram.ui.ActionBar.l6.w0(i42, g6Var));
        boolean z23 = id.f23157a0;
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
        addView(i70Var, c8.ha.d(-1, 2.0f, i47, f27, 54.0f, f28, 0.0f));
        wo woVar = new wo(21, context, g6Var);
        this.f29293n = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f27995k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        if (i7 == 1) {
            boolean z24 = id.f23157a0;
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
            boolean z25 = id.f23157a0;
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
        if (this.f29297x) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.l6.W0("paintDivider", this.L));
        }
    }

    public final void b(boolean z9, boolean z10) {
        wo woVar = this.f29293n;
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
        if (ijVar2 != null && ijVar != null && ijVar2.e1() != ijVar.e1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29297x = z9;
        this.E = ijVar;
        this.G = false;
        this.F = false;
        if (!z10) {
            this.N = 0L;
        }
        TLRPC.Document F0 = ijVar.F0();
        TextView textView = this.f29295s;
        TextView textView2 = this.f29290c;
        String str7 = "";
        ImageView imageView = this.f29288a;
        TextView textView3 = this.d;
        di.d4 d4Var = this.f29289b;
        if (F0 != null) {
            if (ijVar.I3()) {
                str = null;
                for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = ijVar.w1(true) + " - " + ijVar.y1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!ij.L4(ijVar.f23262k) && !(ijVar.f23262k.media instanceof TLRPC.TL_messageMediaPhoto) && !ij.s3(F0, false)) {
                str2 = org.telegram.messenger.w7.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (ij.s3(F0, false)) {
                        str2 = id.M0(2131753971, null);
                    } else {
                        str2 = id.M0(2131753933, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (ij.s3(F0, false)) {
                        str2 = id.M0(2131753971, null);
                    } else {
                        str2 = id.M0(2131753948, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = id.M0(2131753982, null);
                } else {
                    str2 = id.M0(2131753975, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = ijVar.Y1;
            org.telegram.ui.ActionBar.g6 g6Var = this.L;
            CharSequence x12 = org.telegram.messenger.g0.x1(str3, arrayList, g6Var);
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
                    z11 = true;
                } else {
                    z11 = false;
                }
                imageReceiver.F0 = z11;
                ImageReceiver imageReceiver2 = d4Var.getImageReceiver();
                if (w10 == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver2.G0 = z12;
                d4Var.setVisibility(0);
                if (ijVar.G1 != null) {
                    d4Var.n(hc.c(w10, F0), "40_40", null, null, ijVar.G1, null, 1, ijVar);
                } else {
                    d4Var.g(1, 0L, ijVar, "40_40", "40_40_b", null, hc.c(w10, F0), hc.c(w11, F0));
                }
            } else {
                d4Var.setVisibility(4);
                d4Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (ijVar.r2() && !TextUtils.isEmpty(this.E.f23262k.message)) {
                CharSequence x13 = org.telegram.messenger.g0.x1(this.E.f23262k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.E.Y1, g6Var);
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
            this.f29291e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            d4Var.setVisibility(4);
            d4Var.setImageBitmap(null);
            this.J = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f29297x);
        this.h.a(false, 0.0f);
        f(z10);
    }

    public final void d(String str, String str2, String str3, String str4, int i7, boolean z9) {
        int i10;
        int i11;
        this.f29290c.setText(str);
        this.f29291e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f29297x = z9;
        ImageView imageView = this.f29288a;
        if (i7 == 0) {
            imageView.setImageResource(org.telegram.messenger.g0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.H;
        di.d4 d4Var = this.f29289b;
        if (str4 == null && i7 == 0) {
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
                xp N = org.telegram.ui.ActionBar.l6.N(org.telegram.messenger.g0.L(42.0f), i7);
                if (i7 == 2131231074) {
                    i10 = org.telegram.ui.ActionBar.l6.f28051na;
                    i11 = org.telegram.ui.ActionBar.l6.f27960ia;
                } else if (i7 == 2131231071) {
                    i10 = org.telegram.ui.ActionBar.l6.f28016la;
                    i11 = org.telegram.ui.ActionBar.l6.f27960ia;
                } else if (i7 == 2131231073) {
                    i10 = org.telegram.ui.ActionBar.l6.f27998ka;
                    i11 = org.telegram.ui.ActionBar.l6.f27960ia;
                } else if (i7 == 2131231072) {
                    i10 = org.telegram.ui.ActionBar.l6.f27978ja;
                    i11 = org.telegram.ui.ActionBar.l6.f27960ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.l6.oj;
                    i11 = org.telegram.ui.ActionBar.l6.nj;
                }
                org.telegram.ui.ActionBar.g6 g6Var = this.L;
                org.telegram.ui.ActionBar.l6.B1(N, org.telegram.ui.ActionBar.l6.w0(i10, g6Var), false);
                org.telegram.ui.ActionBar.l6.B1(N, org.telegram.ui.ActionBar.l6.w0(i11, g6Var), true);
                d4Var.setImageDrawable(N);
            }
            d4Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.f29297x);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.R != 1.0f && this.M != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.R) * 255.0f), 31);
            this.M.setViewType(3);
            this.M.updateColors();
            this.M.g();
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
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.l6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.l6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.P;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.l6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.l6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.l6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.l6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.l6.Z0.draw(canvas);
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
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.l6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.l6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.P;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.l6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.l6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.l6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.l6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.l6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String D;
        ij ijVar = this.E;
        if (ijVar != null && ijVar.F0() != null) {
            ij ijVar2 = this.E;
            long j3 = ijVar2.f23262k.date * 1000;
            long j10 = this.N;
            if (j10 == 0) {
                D = org.telegram.messenger.g0.i0(ijVar2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                D = a8.p0.D(org.telegram.messenger.g0.i0(j10, false, false), " / ", org.telegram.messenger.g0.i0(this.E.F0().size, false, false));
            }
            int i7 = this.H;
            org.telegram.ui.Components.q5 q5Var = this.f29291e;
            if (i7 == 2) {
                q5Var.setText(new SpannableStringBuilder().append((CharSequence) D).append(' ').append((CharSequence) this.I).append(' ').append(a00.d(this.E, true, 2, q5Var.getPaint())));
                this.f29294r.setText(id.e1(this.E.f23262k.date));
                return;
            }
            String a02 = id.a0("formatDateAtTime", null, 2131742783, id.E0().C0().format(new Date(j3)), id.E0().p0().format(new Date(j3)));
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
            transitionSet.setInterpolator((TimeInterpolator) xq.f40458f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        ij ijVar = this.E;
        float f13 = 72.0f;
        int i10 = this.f29298y;
        dh0 dh0Var = this.f29292f;
        i70 i70Var = this.h;
        float f14 = 8.0f;
        org.telegram.ui.Components.q5 q5Var = this.f29291e;
        if (ijVar != null && ijVar.f23262k.media != null) {
            this.G = false;
            if (!ijVar.f23307w0 && !ijVar.f23311x0 && this.f29296w) {
                String r10 = org.telegram.messenger.w7.r(null, ijVar.F0());
                org.telegram.messenger.z5.q(i10).a(r10, this.E, this);
                this.F = org.telegram.messenger.w7.G(i10).S(r10);
                dh0Var.setVisibility(0);
                int i11 = 15;
                if (this.F) {
                    i7 = 15;
                } else {
                    i7 = 0;
                }
                ah0 ah0Var = this.K;
                ah0Var.P(i7);
                ah0Var.h = true;
                if (z9) {
                    dh0Var.d();
                } else {
                    if (!this.F) {
                        i11 = 0;
                    }
                    ah0Var.M(i11);
                    dh0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
                if (layoutParams != null) {
                    if (id.f23157a0) {
                        f12 = 8.0f;
                    } else {
                        f12 = 86.0f;
                    }
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(f12);
                    if (id.f23157a0) {
                        f14 = 86.0f;
                    }
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(f14);
                    q5Var.requestLayout();
                }
                if (this.F) {
                    i70Var.setVisibility(0);
                    Float w10 = gc.D().w(r10);
                    if (w10 == null) {
                        w10 = Float.valueOf(0.0f);
                    }
                    i70Var.a(false, w10.floatValue());
                    return;
                }
                i70Var.setVisibility(4);
                return;
            }
            dh0Var.setVisibility(4);
            i70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
            if (layoutParams2 != null) {
                if (id.f23157a0) {
                    f11 = 8.0f;
                } else {
                    f11 = 72.0f;
                }
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(f11);
                if (!id.f23157a0) {
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
        i70Var.setVisibility(4);
        i70Var.a(false, 0.0f);
        dh0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (id.f23157a0) {
                f10 = 8.0f;
            } else {
                f10 = 72.0f;
            }
            layoutParams3.leftMargin = org.telegram.messenger.g0.L(f10);
            if (!id.f23157a0) {
                f13 = 8.0f;
            }
            layoutParams3.rightMargin = org.telegram.messenger.g0.L(f13);
            q5Var.requestLayout();
        }
        org.telegram.messenger.z5.q(i10).v(this);
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f29289b;
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
        i70 i70Var = this.h;
        if (i70Var.getVisibility() != 0) {
            f(true);
        }
        this.N = j3;
        e();
        i70Var.a(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
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
        org.telegram.messenger.z5.q(this.f29298y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.f29293n;
        if (woVar.f40108a.f31268q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.f40108a.f31268q);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.H != 1) {
            TextView textView = this.f29290c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f29295s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.k5.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.q5 q5Var = this.f29291e;
                q5Var.layout(q5Var.getLeft(), q5Var.getTop() + measuredHeight, q5Var.getRight(), q5Var.getBottom() + measuredHeight);
                dh0 dh0Var = this.f29292f;
                dh0Var.layout(dh0Var.getLeft(), dh0Var.getTop() + measuredHeight, dh0Var.getRight(), dh0Var.getBottom() + measuredHeight);
                i70 i70Var = this.h;
                i70Var.layout(i70Var.getLeft(), (getMeasuredHeight() - i70Var.getMeasuredHeight()) - (this.f29297x ? 1 : 0), i70Var.getRight(), getMeasuredHeight() - (this.f29297x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11 = this.H;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f29297x ? 1 : 0), 1073741824));
        } else if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
            int measuredHeight = this.f29290c.getMeasuredHeight() + org.telegram.messenger.g0.L(34.0f) + (this.f29297x ? 1 : 0);
            if (this.J != null && (textView = this.f29295s) != null && this.E.r2()) {
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
        this.f29296w = z9;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(mz mzVar) {
        this.M = mzVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        di.d4 d4Var = this.f29289b;
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

    public void setPhotoEntry(gf gfVar) {
        String str = gfVar.f26846c;
        long j3 = gfVar.H;
        int i7 = gfVar.G;
        int i10 = gfVar.F;
        int i11 = gfVar.C;
        String str2 = gfVar.I;
        di.d4 d4Var = this.f29289b;
        if (str != null) {
            d4Var.h(str, null, org.telegram.ui.ActionBar.l6.R4);
            str2 = gfVar.f26846c;
        } else if (str2 != null) {
            if (gfVar.f26845b) {
                d4Var.r();
                d4Var.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.l6.R4);
            } else {
                d4Var.s(gfVar.J, gfVar.K, true);
                d4Var.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.l6.R4);
            }
        } else {
            d4Var.setImageDrawable(org.telegram.ui.ActionBar.l6.R4);
            str2 = "";
        }
        File file = new File(str2);
        this.f29290c.setText(file.getName());
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
        if (gfVar.f26845b) {
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
        sb2.append(id.E0().z0().format(gfVar.D));
        this.f29291e.setText(sb2);
        this.f29288a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28230wi, this.L));
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
