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
import org.telegram.messenger.ec;
import org.telegram.messenger.ef;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vz;
import org.telegram.ui.b00;
public final class h7 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.y5 {
    public final int E;
    public fj F;
    public boolean G;
    public boolean H;
    public final int I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final nh0 L;
    public final org.telegram.ui.ActionBar.i6 M;
    public vz N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView f30844a;
    public final fi.t3 f30845b;
    public final TextView f30846c;
    public final TextView d;
    public final org.telegram.ui.Components.w5 f30847e;
    public final qh0 f30848f;
    public final u70 h;
    public final lp f30849n;
    public final TextView f30850r;
    public final TextView f30851s;
    public boolean f30852w;
    public boolean f30853x;
    public final int f30854y;

    public h7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
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
        this.f30852w = true;
        int i30 = i10.f24637t0;
        this.f30854y = i30;
        this.S = 1.0f;
        this.M = i6Var;
        this.I = i7;
        this.E = org.telegram.messenger.a6.q(i30).k();
        ImageView imageView = new ImageView(context);
        this.f30844a = imageView;
        if (i7 == 1) {
            boolean z10 = gd.f24314a0;
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
            addView(imageView, c8.na.d(42, 42.0f, i31, f43, 12.0f, f44, 0.0f));
        } else {
            boolean z11 = gd.f24314a0;
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
            addView(imageView, c8.na.d(40, 40.0f, i32, f10, 8.0f, f11, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.sj, i6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i7 == 1) {
            boolean z12 = gd.f24314a0;
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
            addView(textView, c8.na.d(32, -2.0f, i33, f41, 28.0f, f42, 0.0f));
        } else {
            boolean z13 = gd.f24314a0;
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
            addView(textView, c8.na.d(32, -2.0f, i34, f12, 22.0f, f13, 0.0f));
        }
        fi.t3 t3Var = new fi.t3(2, context, this);
        this.f30845b = t3Var;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        if (i7 == 1) {
            boolean z14 = gd.f24314a0;
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
            addView(t3Var, c8.na.d(42, 42.0f, i35, f39, 12.0f, f40, 0.0f));
        } else {
            boolean z15 = gd.f24314a0;
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
            addView(t3Var, c8.na.d(40, 40.0f, i36, f14, 8.0f, f15, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f30846c = textView2;
        int i37 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.messenger.f3.l(textView2, i37, i6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (gd.f24314a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        if (i7 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = gd.f24314a0;
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
            addView(textView2, c8.na.d(-1, -2.0f, i38, f37, 9.0f, f38, 0.0f));
            f16 = 14.0f;
        } else if (i7 == 2) {
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
            boolean z17 = gd.f24314a0;
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
            addView(g10, c8.na.d(-1, -2.0f, i39, f19, 5.0f, f20, 0.0f));
            TextView textView3 = new TextView(context);
            this.f30850r = textView3;
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.A6, i6Var);
            textView3.setTextSize(1, 14.0f);
            f16 = 14.0f;
            if (!gd.f24314a0) {
                g10.addView(textView2, c8.na.l(1.0f, -2, -2));
                g10.addView(textView3, c8.na.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                g10.addView(textView3, c8.na.l(0.0f, -2, -2));
                g10.addView(textView2, c8.na.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f30851s = textView4;
            org.telegram.ui.ActionBar.u6.U(textView4, i37, i6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (gd.f24314a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView4.setGravity(i16 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = gd.f24314a0;
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
            addView(textView4, c8.na.d(-1, -2.0f, i40, f21, 30.0f, f22, 0.0f));
            textView4.setVisibility(8);
        } else {
            f16 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = gd.f24314a0;
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
            addView(textView2, c8.na.d(-1, -2.0f, i41, f17, 5.0f, f18, 0.0f));
        }
        nh0 nh0Var = new nh0(2131624003, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), true, null);
        this.L = nh0Var;
        ?? imageView2 = new ImageView(context);
        this.f30848f = imageView2;
        imageView2.setAnimation(nh0Var);
        imageView2.setVisibility(4);
        int i42 = org.telegram.ui.ActionBar.n6.f29874zi;
        org.telegram.ui.ActionBar.u6.s(imageView2, i42, i6Var, PorterDuff.Mode.SRC_IN);
        if (i7 == 1) {
            boolean z20 = gd.f24314a0;
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
            addView((View) imageView2, c8.na.d(14, 14.0f, i43, f35, 37.0f, f36, 0.0f));
        } else {
            boolean z21 = gd.f24314a0;
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
            addView((View) imageView2, c8.na.d(14, 14.0f, i44, f23, 33.0f, f24, 0.0f));
        }
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.f30847e = w5Var;
        org.telegram.ui.ActionBar.u6.U(w5Var, org.telegram.ui.ActionBar.n6.A6, i6Var);
        w5Var.setLines(1);
        w5Var.setMaxLines(1);
        w5Var.setSingleLine(true);
        w5Var.setEllipsize(truncateAt);
        if (gd.f24314a0) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        w5Var.setGravity(i19 | 16);
        ks.i(w5Var);
        if (i7 == 1) {
            w5Var.setTextSize(1, 13.0f);
            boolean z22 = gd.f24314a0;
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
            addView(w5Var, c8.na.d(-1, -2.0f, i45, f33, 34.0f, f34, 0.0f));
        } else {
            w5Var.setTextSize(1, 13.0f);
            boolean z23 = gd.f24314a0;
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
            addView(w5Var, c8.na.d(-1, -2.0f, i46, f25, 30.0f, f26, 0.0f));
        }
        u70 u70Var = new u70(context);
        this.h = u70Var;
        u70Var.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i42, i6Var));
        boolean z24 = gd.f24314a0;
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
        addView(u70Var, c8.na.d(-1, 2.0f, i47, f27, 54.0f, f28, 0.0f));
        lp lpVar = new lp(21, context, i6Var);
        this.f30849n = lpVar;
        lpVar.setVisibility(4);
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(2);
        if (i7 == 1) {
            boolean z25 = gd.f24314a0;
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
            addView(lpVar, c8.na.d(24, 24.0f, i48, f31, 36.0f, f32, 0.0f));
        } else {
            boolean z26 = gd.f24314a0;
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
            addView(lpVar, c8.na.d(24, 24.0f, i49, f29, 28.0f, f30, 0.0f));
        }
        if (i7 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new rs(), 0, 1, 0);
        }
    }

    @Override
    public final void C(boolean z10) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override
    public final void N(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.f30853x) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.W0("paintDivider", this.M));
        }
    }

    public final void b(boolean z10, boolean z11) {
        lp lpVar = this.f30849n;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z10, z11);
    }

    public final void c(fj fjVar, boolean z10) {
        boolean z11;
        String str;
        String str2;
        String str3;
        int i7;
        boolean z12;
        boolean z13;
        String str4;
        String str5;
        String str6;
        fj fjVar2 = this.F;
        if (fjVar2 != null && fjVar != null && fjVar2.e1() != fjVar.e1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30853x = z10;
        this.F = fjVar;
        this.H = false;
        this.G = false;
        if (!z11) {
            this.O = 0L;
        }
        TLRPC.Document F0 = fjVar.F0();
        TextView textView = this.f30851s;
        TextView textView2 = this.f30846c;
        String str7 = "";
        ImageView imageView = this.f30844a;
        TextView textView3 = this.d;
        fi.t3 t3Var = this.f30845b;
        if (F0 != null) {
            if (fjVar.I3()) {
                str = null;
                for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = fjVar.w1(true) + " - " + fjVar.y1(true);
                    }
                }
            } else {
                str = null;
            }
            if (!fj.L4(fjVar.f24073k) && !(fjVar.f24073k.media instanceof TLRPC.TL_messageMediaPhoto) && !fj.s3(F0, false)) {
                str2 = org.telegram.messenger.w7.B(F0);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = F0.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (fj.s3(F0, false)) {
                        str2 = gd.N0(2131753968, null);
                    } else {
                        str2 = gd.N0(2131753930, null);
                    }
                } else if (F0.mime_type.startsWith("image")) {
                    if (fj.s3(F0, false)) {
                        str2 = gd.N0(2131753968, null);
                    } else {
                        str2 = gd.N0(2131753945, null);
                    }
                } else if (F0.mime_type.startsWith("audio")) {
                    str2 = gd.N0(2131753979, null);
                } else {
                    str2 = gd.N0(2131753972, null);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList arrayList = fjVar.f24030a2;
            org.telegram.ui.ActionBar.i6 i6Var = this.M;
            CharSequence x12 = org.telegram.messenger.g0.x1(str3, arrayList, i6Var);
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
                ImageReceiver imageReceiver = t3Var.getImageReceiver();
                if (w10 == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver.G0 = z12;
                ImageReceiver imageReceiver2 = t3Var.getImageReceiver();
                if (w10 == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                imageReceiver2.H0 = z13;
                t3Var.setVisibility(0);
                if (fjVar.I1 != null) {
                    t3Var.n(fc.c(w10, F0), "40_40", null, null, fjVar.I1, null, 1, fjVar);
                } else {
                    t3Var.g(1, 0L, fjVar, "40_40", "40_40_b", null, fc.c(w10, F0), fc.c(w11, F0));
                }
            } else {
                t3Var.setVisibility(4);
                t3Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            }
            e();
            if (fjVar.r2() && !TextUtils.isEmpty(this.F.f24073k.message)) {
                CharSequence x13 = org.telegram.messenger.g0.x1(this.F.f24073k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.f24030a2, i6Var);
                this.K = x13;
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
            this.f30847e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            t3Var.setVisibility(4);
            t3Var.setImageBitmap(null);
            this.K = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f30853x);
        this.h.a(false, 0.0f);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i7, boolean z10) {
        int i10;
        int i11;
        this.f30846c.setText(str);
        this.f30847e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f30853x = z10;
        ImageView imageView = this.f30844a;
        if (i7 == 0) {
            imageView.setImageResource(org.telegram.messenger.g0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.I;
        fi.t3 t3Var = this.f30845b;
        if (str4 == null && i7 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                t3Var.setImageBitmap(null);
                t3Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i12 != 3) {
                    t3Var.h(str4, "42_42", null);
                }
            } else {
                lq N = org.telegram.ui.ActionBar.n6.N(org.telegram.messenger.g0.L(42.0f), i7);
                if (i7 == 2131231076) {
                    i10 = org.telegram.ui.ActionBar.n6.f29637na;
                    i11 = org.telegram.ui.ActionBar.n6.f29546ia;
                } else if (i7 == 2131231073) {
                    i10 = org.telegram.ui.ActionBar.n6.f29602la;
                    i11 = org.telegram.ui.ActionBar.n6.f29546ia;
                } else if (i7 == 2131231075) {
                    i10 = org.telegram.ui.ActionBar.n6.f29584ka;
                    i11 = org.telegram.ui.ActionBar.n6.f29546ia;
                } else if (i7 == 2131231074) {
                    i10 = org.telegram.ui.ActionBar.n6.f29564ja;
                    i11 = org.telegram.ui.ActionBar.n6.f29546ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.rj;
                    i11 = org.telegram.ui.ActionBar.n6.qj;
                }
                org.telegram.ui.ActionBar.i6 i6Var = this.M;
                org.telegram.ui.ActionBar.n6.B1(N, org.telegram.ui.ActionBar.n6.w0(i10, i6Var), false);
                org.telegram.ui.ActionBar.n6.B1(N, org.telegram.ui.ActionBar.n6.w0(i11, i6Var), true);
                t3Var.setImageDrawable(N);
            }
            t3Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.f30853x);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.S != 1.0f && this.N != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.S) * 255.0f), 31);
            this.N.setViewType(3);
            this.N.updateColors();
            this.N.g();
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
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.Q;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.n6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.n6.Z0.draw(canvas);
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
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.Q;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.n6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.n6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String E;
        fj fjVar = this.F;
        if (fjVar != null && fjVar.F0() != null) {
            fj fjVar2 = this.F;
            long j3 = fjVar2.f24073k.date * 1000;
            long j10 = this.O;
            if (j10 == 0) {
                E = org.telegram.messenger.g0.i0(fjVar2.F0().size, false, false);
            } else {
                Locale locale = Locale.ENGLISH;
                E = a8.p0.E(org.telegram.messenger.g0.i0(j10, false, false), " / ", org.telegram.messenger.g0.i0(this.F.F0().size, false, false));
            }
            int i7 = this.I;
            org.telegram.ui.Components.w5 w5Var = this.f30847e;
            if (i7 == 2) {
                w5Var.setText(new SpannableStringBuilder().append((CharSequence) E).append(' ').append((CharSequence) this.J).append(' ').append(b00.d(this.F, true, 2, w5Var.getPaint())));
                this.f30850r.setText(gd.f1(this.F.f24073k.date));
                return;
            }
            String a02 = gd.a0("formatDateAtTime", null, 2131742512, gd.E0().C0().format(new Date(j3)), gd.E0().p0().format(new Date(j3)));
            w5Var.setText(E + ", " + a02);
        }
    }

    public final void f(boolean z10) {
        float f10;
        float f11;
        int i7;
        float f12;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) kr.f36858f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        fj fjVar = this.F;
        float f13 = 72.0f;
        int i10 = this.f30854y;
        qh0 qh0Var = this.f30848f;
        u70 u70Var = this.h;
        float f14 = 8.0f;
        org.telegram.ui.Components.w5 w5Var = this.f30847e;
        if (fjVar != null && fjVar.f24073k.media != null) {
            this.H = false;
            if (!fjVar.f24128y0 && !fjVar.f24132z0 && this.f30852w) {
                String r10 = org.telegram.messenger.w7.r(null, fjVar.F0());
                org.telegram.messenger.a6.q(i10).a(r10, this.F, this);
                this.G = org.telegram.messenger.w7.G(i10).S(r10);
                qh0Var.setVisibility(0);
                int i11 = 15;
                if (this.G) {
                    i7 = 15;
                } else {
                    i7 = 0;
                }
                nh0 nh0Var = this.L;
                nh0Var.P(i7);
                nh0Var.h = true;
                if (z10) {
                    qh0Var.d();
                } else {
                    if (!this.G) {
                        i11 = 0;
                    }
                    nh0Var.M(i11);
                    qh0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
                if (layoutParams != null) {
                    if (gd.f24314a0) {
                        f12 = 8.0f;
                    } else {
                        f12 = 86.0f;
                    }
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(f12);
                    if (gd.f24314a0) {
                        f14 = 86.0f;
                    }
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(f14);
                    w5Var.requestLayout();
                }
                if (this.G) {
                    u70Var.setVisibility(0);
                    Float w10 = ec.D().w(r10);
                    if (w10 == null) {
                        w10 = Float.valueOf(0.0f);
                    }
                    u70Var.a(false, w10.floatValue());
                    return;
                }
                u70Var.setVisibility(4);
                return;
            }
            qh0Var.setVisibility(4);
            u70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
            if (layoutParams2 != null) {
                if (gd.f24314a0) {
                    f11 = 8.0f;
                } else {
                    f11 = 72.0f;
                }
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(f11);
                if (!gd.f24314a0) {
                    f13 = 8.0f;
                }
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(f13);
                w5Var.requestLayout();
            }
            this.G = false;
            this.H = true;
            org.telegram.messenger.a6.q(i10).v(this);
            return;
        }
        this.G = false;
        this.H = true;
        u70Var.setVisibility(4);
        u70Var.a(false, 0.0f);
        qh0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (gd.f24314a0) {
                f10 = 8.0f;
            } else {
                f10 = 72.0f;
            }
            layoutParams3.leftMargin = org.telegram.messenger.g0.L(f10);
            if (!gd.f24314a0) {
                f13 = 8.0f;
            }
            layoutParams3.rightMargin = org.telegram.messenger.g0.L(f13);
            w5Var.requestLayout();
        }
        org.telegram.messenger.a6.q(i10).v(this);
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.f30845b;
    }

    public fj getMessage() {
        return this.F;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void i(long j3, long j10) {
        u70 u70Var = this.h;
        if (u70Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j3;
        e();
        u70Var.a(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
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
        org.telegram.messenger.a6.q(this.f30854y).v(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lp lpVar = this.f30849n;
        if (lpVar.f37189a.f32938q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(lpVar.f37189a.f32938q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.I != 1) {
            TextView textView = this.f30846c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f30851s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.f3.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.w5 w5Var = this.f30847e;
                w5Var.layout(w5Var.getLeft(), w5Var.getTop() + measuredHeight, w5Var.getRight(), w5Var.getBottom() + measuredHeight);
                qh0 qh0Var = this.f30848f;
                qh0Var.layout(qh0Var.getLeft(), qh0Var.getTop() + measuredHeight, qh0Var.getRight(), qh0Var.getBottom() + measuredHeight);
                u70 u70Var = this.h;
                u70Var.layout(u70Var.getLeft(), (getMeasuredHeight() - u70Var.getMeasuredHeight()) - (this.f30853x ? 1 : 0), u70Var.getRight(), getMeasuredHeight() - (this.f30853x ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11 = this.I;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f30853x ? 1 : 0), 1073741824));
        } else if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
            int measuredHeight = this.f30846c.getMeasuredHeight() + org.telegram.messenger.g0.L(34.0f) + (this.f30853x ? 1 : 0);
            if (this.K != null && (textView = this.f30851s) != null && this.F.r2()) {
                this.R = true;
                textView.setText(org.telegram.messenger.g0.Q(this.K, (String) this.F.f24030a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
                this.R = false;
                measuredHeight = org.telegram.messenger.f3.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
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
        this.f30852w = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(vz vzVar) {
        this.N = vzVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        fi.t3 t3Var = this.f30845b;
        if (endsWith) {
            t3Var.h("vthumb://0:".concat(str), null, null);
            t3Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            t3Var.setVisibility(8);
        } else {
            t3Var.h("thumb://0:".concat(str), null, null);
            t3Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(ef efVar) {
        String str = efVar.f27964c;
        long j3 = efVar.H;
        int i7 = efVar.G;
        int i10 = efVar.F;
        int i11 = efVar.C;
        String str2 = efVar.I;
        fi.t3 t3Var = this.f30845b;
        if (str != null) {
            t3Var.h(str, null, org.telegram.ui.ActionBar.n6.R4);
            str2 = efVar.f27964c;
        } else if (str2 != null) {
            if (efVar.f27963b) {
                t3Var.r();
                t3Var.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.n6.R4);
            } else {
                t3Var.s(efVar.J, efVar.K, true);
                t3Var.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.n6.R4);
            }
        } else {
            t3Var.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
            str2 = "";
        }
        File file = new File(str2);
        this.f30846c.setText(file.getName());
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
        if (efVar.f27963b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.g0(efVar.E, false, false));
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
        sb2.append(gd.E0().z0().format(efVar.D));
        this.f30847e.setText(sb2);
        this.f30844a.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29874zi, this.M));
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
