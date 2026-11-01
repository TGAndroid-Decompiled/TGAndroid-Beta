package org.telegram.ui;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.tgnet.TLRPC;
public final class of0 extends hd1 implements org.telegram.messenger.vs, fe.e {
    public tc1 D;
    public FrameLayout E;
    public qf0 F;
    public vg.f G;
    public View H;
    public Integer I;
    public zx J;
    public gh.b[] K;
    public int L;
    public int M;
    public int N;
    public xa.n O;
    public vh.p2 P;
    public boolean Q;
    public final hi.c R;
    public final hi.f S;
    public final hi.f T;
    public org.telegram.ui.Components.c61 f40152x;
    public boolean f40153y;
    public final fe.b f40151w = new fe.b(0, this, org.telegram.ui.Components.gr.h, 380, true);
    public final RectF U = new RectF();
    public final RectF V = new RectF();
    public final kf0 W = new kf0(this, 0);

    public of0() {
        if (Build.VERSION.SDK_INT >= 31) {
            hi.f fVar = new hi.f(null);
            b2.u uVar = new b2.u(this, false);
            if (fVar.f7719c == null) {
                fVar.f7719c = new tg.h(fVar.f7718b, uVar);
            }
            this.S = fVar;
            hi.f fVar2 = new hi.f(null);
            b2.u uVar2 = new b2.u(this, true);
            if (fVar2.f7719c == null) {
                fVar2.f7719c = new tg.h(fVar2.f7718b, uVar2);
            }
            this.T = fVar2;
        } else {
            this.S = null;
            this.T = null;
        }
        this.R = new hi.c();
        z8 z8Var = new z8(this, 5);
        setBulletinDelegate(z8Var);
        org.telegram.ui.Components.wb.a(this.f37788b, z8Var);
    }

    public static boolean d0(of0 of0Var, View view) {
        ArrayList S0;
        String str;
        int i10;
        boolean z10;
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        int i13;
        ArrayList arrayList;
        boolean z11;
        String str2;
        ArrayList arrayList2;
        ?? r22 = 0;
        if (of0Var.getParentActivity() != null && of0Var.getParentActivity() != null && (S0 = of0Var.getMessagesController().S0()) != null) {
            boolean z12 = true;
            if (S0.size() > 1) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(of0Var, view);
                int i14 = 0;
                while (i14 < S0.size()) {
                    org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) S0.get(i14);
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, of0Var.getParentActivity(), of0Var.getResourceProvider(), false, false);
                    b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), r22, org.telegram.messenger.i0.L(18.0f), r22);
                    if (bpVar.e()) {
                        str = org.telegram.messenger.dd.L0(2131750808, null);
                    } else {
                        str = bpVar.f15001b;
                    }
                    CharSequence m10 = org.telegram.messenger.k6.m(str, b1Var.getTextView().getPaint().getFontMetricsInt(), r22, null, r22);
                    if (!bpVar.e()) {
                        m10 = org.telegram.messenger.kj.A5(m10, bpVar.f15002c, b1Var.getTextView().getPaint().getFontMetricsInt(), r22);
                    }
                    if (bpVar.e()) {
                        i10 = org.telegram.messenger.is.a0(of0Var.currentAccount).K;
                    } else {
                        i10 = bpVar.d;
                    }
                    if (i10 > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                        int length = spannableStringBuilder2.length();
                        spannableStringBuilder2.append((CharSequence) String.valueOf(i10));
                        org.telegram.messenger.wp messagesController = of0Var.getMessagesController();
                        if (bpVar.e()) {
                            z10 = z12;
                            arrayList = messagesController.V0(r22);
                        } else {
                            z10 = z12;
                            arrayList = messagesController.f19293y;
                        }
                        int i15 = r22;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i15);
                                if (!bpVar.e()) {
                                    long j10 = dialog.f19798id;
                                    if (org.telegram.messenger.o5.C(j10)) {
                                        arrayList2 = arrayList;
                                        i11 = i14;
                                        TLRPC.EncryptedChat Z0 = messagesController.Z0(Integer.valueOf((int) (j10 & 4294967295L)));
                                        if (Z0 != null) {
                                            j10 = Z0.user_id;
                                        }
                                    } else {
                                        arrayList2 = arrayList;
                                        i11 = i14;
                                    }
                                    if (!bpVar.c(of0Var.getAccountInstance(), j10, dialog)) {
                                        continue;
                                        i15++;
                                        i14 = i11;
                                        arrayList = arrayList2;
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    i11 = i14;
                                }
                                if ((messagesController.U0(dialog) > 0 || dialog.unread_mark) && !messagesController.q2(dialog.f19798id, 0L, null)) {
                                    z11 = z10 ? 1 : 0;
                                    break;
                                }
                                i15++;
                                i14 = i11;
                                arrayList = arrayList2;
                            } else {
                                i11 = i14;
                                z11 = false;
                                break;
                            }
                        }
                        spannableStringBuilder2.setSpan(new mf0(of0Var, i10, z11), length, spannableStringBuilder2.length(), 33);
                        if (bpVar.e()) {
                            str2 = org.telegram.messenger.dd.L0(2131750808, null);
                        } else {
                            str2 = bpVar.f15001b;
                        }
                        String G = org.telegram.messenger.dd.G(i10, "AccDescrUnreadCount", new Object[0]);
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = str2;
                        charSequenceArr[z10 ? 1 : 0] = "\n";
                        charSequenceArr[2] = G;
                        b1Var.setContentDescription(TextUtils.concat(charSequenceArr));
                        spannableStringBuilder = spannableStringBuilder2;
                    } else {
                        z10 = z12;
                        i11 = i14;
                        spannableStringBuilder = m10;
                    }
                    if (bpVar.f15010n) {
                        i12 = 26;
                    } else {
                        i12 = 0;
                    }
                    b1Var.setEmojiCacheType(i12);
                    if (of0Var.getMessagesController().B7) {
                        i13 = bpVar.f15009m;
                    } else {
                        i13 = -1;
                    }
                    b1Var.j(spannableStringBuilder, 0, new org.telegram.ui.Components.k00(of0Var.getParentActivity(), 2131232155, i13));
                    b1Var.getTextView().setEmojiColor(of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci));
                    b1Var.setMinimumWidth(160);
                    b1Var.setOnClickListener(new x(of0Var, H, bpVar, 11));
                    H.r(b1Var, w7.b6.o(-1, -2));
                    i14 = i11 + 1;
                    z12 = z10;
                    r22 = 0;
                }
                boolean z13 = z12;
                H.a0(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(4.0f));
                H.X = org.telegram.messenger.i0.L(400.0f);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                H.W(d02);
                H.f33026i = 3;
                H.Z();
                return z13;
            }
        }
        return false;
    }

    public static void e0(of0 of0Var) {
        org.telegram.messenger.e20 userConfig = of0Var.getUserConfig();
        if (!userConfig.W) {
            userConfig.W = true;
            userConfig.v(false);
        }
        of0Var.m0(true, true);
        org.telegram.messenger.at.f(of0Var.currentAccount).k(org.telegram.messenger.at.O5, new Object[0]);
    }

    public static void f0(of0 of0Var) {
        of0Var.getClass();
        int i10 = 0;
        Integer num = null;
        for (int i11 = 3; i11 >= 0; i11--) {
            if (!org.telegram.messenger.e20.i(i11).p()) {
                i10++;
                if (num == null) {
                    num = Integer.valueOf(i11);
                }
            }
        }
        if (!org.telegram.messenger.e20.o()) {
            i10--;
        }
        if (i10 > 0 && num != null) {
            of0Var.presentFragment(new gf0(num.intValue()));
        } else if (!org.telegram.messenger.e20.o()) {
            of0Var.showDialog(new kg.q0(7, of0Var.currentAccount, of0Var.getParentActivity(), of0Var, null));
        }
    }

    public static void g0(of0 of0Var, int i10, org.telegram.ui.Components.z60 z60Var) {
        if (of0Var.currentAccount != i10) {
            z60Var.u();
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.O0(i10);
            }
        }
    }

    public static void h0(of0 of0Var) {
        org.telegram.messenger.e20 userConfig = of0Var.getUserConfig();
        if (userConfig.W) {
            userConfig.W = false;
            userConfig.v(false);
        }
        of0Var.m0(false, true);
        org.telegram.messenger.at.f(of0Var.currentAccount).k(org.telegram.messenger.at.O5, new Object[0]);
    }

    @Override
    public final org.telegram.ui.ActionBar.k2 a0(int i10) {
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i10 == 2) {
            if (getUserConfig().W) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new j9(bundle2);
            }
            return new c51(a1.g.g("hasMainTabs", true));
        } else if (i10 == 0) {
            zx zxVar = new zx(a1.g.g("hasMainTabs", true));
            this.J = zxVar;
            zxVar.I3 = new e(this, 23);
            return zxVar;
        } else if (i10 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", org.telegram.messenger.e20.i(this.currentAccount).e());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21002h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.k2 c02 = c0();
        if (c02 != null && c02.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        super.createView(context);
        qf0 qf0Var = new qf0(context, this.resourceProvider);
        this.F = qf0Var;
        qf0Var.setClipChildren(false);
        this.F.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        this.F.setMaxWidth(org.telegram.messenger.i0.L(344.0f));
        gh.b[] bVarArr = new gh.b[5];
        this.K = bVarArr;
        bVarArr[0] = gh.b.c(context, this.resourceProvider, gh.a.f7510n, 2131748718);
        this.K[1] = gh.b.c(context, this.resourceProvider, gh.a.f7509f, 2131748717);
        this.K[2] = gh.b.c(context, this.resourceProvider, gh.a.f7511r, 2131745512);
        this.K[3] = gh.b.c(context, this.resourceProvider, gh.a.h, 2131748719);
        gh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        gh.b bVar = new gh.b(context);
        org.telegram.ui.Components.c61 c61Var = null;
        bVar.f7519a.setText(org.telegram.messenger.dd.L0(2131748716, null));
        bVar.f7520b.setVisibility(8);
        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i11).Z1(Long.valueOf(org.telegram.messenger.e20.i(i11).e()));
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(0, Z1);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.e(Z1, r8Var);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(11.0f));
        bVar.f7521c = g9Var;
        bVar.addView(g9Var, w7.b6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f7527x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ql, p6Var);
        bVar.f7525s = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ol, p6Var);
        bVar.f7526w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Pl, p6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final of0 f39270b;

            {
                this.f39270b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i12 = r2;
                of0 of0Var = this.f39270b;
                switch (i12) {
                    case 0:
                        return of0.d0(of0Var, view);
                    case 1:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(of0Var, view);
                        H.c(2131232098, org.telegram.messenger.dd.L0(2131748297, null), new kf0(of0Var, 5), false);
                        H.c(2131232082, org.telegram.messenger.dd.L0(2131743465, null), new kf0(of0Var, 6), false);
                        H.f33046u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        H.f33026i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H2 = org.telegram.ui.Components.z60.H(of0Var, view);
                        H2.c(2131231769, org.telegram.messenger.dd.L0(2131749499, null), new kf0(of0Var, 2), false);
                        if (of0Var.getUserConfig().W) {
                            H2.c(2131232052, org.telegram.messenger.dd.L0(2131749331, null), new kf0(of0Var, 3), false);
                        } else {
                            H2.c(2131231763, org.telegram.messenger.dd.L0(2131749470, null), new kf0(of0Var, 4), false);
                        }
                        H2.f33046u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        of0Var.q0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final of0 f39270b;

            {
                this.f39270b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i12 = r2;
                of0 of0Var = this.f39270b;
                switch (i12) {
                    case 0:
                        return of0.d0(of0Var, view);
                    case 1:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(of0Var, view);
                        H.c(2131232098, org.telegram.messenger.dd.L0(2131748297, null), new kf0(of0Var, 5), false);
                        H.c(2131232082, org.telegram.messenger.dd.L0(2131743465, null), new kf0(of0Var, 6), false);
                        H.f33046u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        H.f33026i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H2 = org.telegram.ui.Components.z60.H(of0Var, view);
                        H2.c(2131231769, org.telegram.messenger.dd.L0(2131749499, null), new kf0(of0Var, 2), false);
                        if (of0Var.getUserConfig().W) {
                            H2.c(2131232052, org.telegram.messenger.dd.L0(2131749331, null), new kf0(of0Var, 3), false);
                        } else {
                            H2.c(2131231763, org.telegram.messenger.dd.L0(2131749470, null), new kf0(of0Var, 4), false);
                        }
                        H2.f33046u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        of0Var.q0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final of0 f39270b;

            {
                this.f39270b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i12 = r2;
                of0 of0Var = this.f39270b;
                switch (i12) {
                    case 0:
                        return of0.d0(of0Var, view);
                    case 1:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(of0Var, view);
                        H.c(2131232098, org.telegram.messenger.dd.L0(2131748297, null), new kf0(of0Var, 5), false);
                        H.c(2131232082, org.telegram.messenger.dd.L0(2131743465, null), new kf0(of0Var, 6), false);
                        H.f33046u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        H.f33026i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H2 = org.telegram.ui.Components.z60.H(of0Var, view);
                        H2.c(2131231769, org.telegram.messenger.dd.L0(2131749499, null), new kf0(of0Var, 2), false);
                        if (of0Var.getUserConfig().W) {
                            H2.c(2131232052, org.telegram.messenger.dd.L0(2131749331, null), new kf0(of0Var, 3), false);
                        } else {
                            H2.c(2131231763, org.telegram.messenger.dd.L0(2131749470, null), new kf0(of0Var, 4), false);
                        }
                        H2.f33046u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        of0Var.q0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final of0 f39270b;

            {
                this.f39270b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i12 = r2;
                of0 of0Var = this.f39270b;
                switch (i12) {
                    case 0:
                        return of0.d0(of0Var, view);
                    case 1:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(of0Var, view);
                        H.c(2131232098, org.telegram.messenger.dd.L0(2131748297, null), new kf0(of0Var, 5), false);
                        H.c(2131232082, org.telegram.messenger.dd.L0(2131743465, null), new kf0(of0Var, 6), false);
                        H.f33046u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        H.f33026i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (of0Var.getParentActivity() == null || of0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.z60 H2 = org.telegram.ui.Components.z60.H(of0Var, view);
                        H2.c(2131231769, org.telegram.messenger.dd.L0(2131749499, null), new kf0(of0Var, 2), false);
                        if (of0Var.getUserConfig().W) {
                            H2.c(2131232052, org.telegram.messenger.dd.L0(2131749331, null), new kf0(of0Var, 3), false);
                        } else {
                            H2.c(2131231763, org.telegram.messenger.dd.L0(2131749470, null), new kf0(of0Var, 4), false);
                        }
                        H2.f33046u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        of0Var.q0(view);
                        return true;
                }
            }
        });
        this.F.P.add(this.K[0]);
        this.F.P.add(this.K[1]);
        this.F.P.add(this.K[4]);
        this.F.P.add(this.K[3]);
        int i12 = 0;
        while (true) {
            gh.b[] bVarArr3 = this.K;
            if (i12 >= bVarArr3.length) {
                break;
            }
            gh.b bVar2 = bVarArr3[i12];
            if (i12 > 2) {
                i10 = i12 - 1;
            } else {
                i10 = i12;
            }
            bVar2.setOnClickListener(new bh.f(this, i10, 20));
            this.F.addView(this.K[i12]);
            this.F.i(bVar2, true, false);
            i12++;
        }
        m0(getUserConfig().W, false);
        s0(this.f37789c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6);
        hi.c cVar = this.R;
        cVar.a(themedColor);
        zg.h hVar = new zg.h(this.f37788b);
        hi.a aVar = this.S;
        if (aVar == null) {
            aVar = cVar;
        }
        hi.a aVar2 = this.T;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        tg.b bVar3 = new tg.b(aVar, aVar2, cVar);
        l0 l0Var = this.f37788b;
        bVar3.h = hVar;
        bVar3.f48713i = l0Var;
        bVar3.f48715k = true;
        vg.f c10 = bVar3.c(this.F, w7.b9.f(this.resourceProvider), false);
        this.G = c10;
        c10.q(org.telegram.messenger.i0.L(28.0f));
        this.G.p(org.telegram.messenger.i0.L(7.666f));
        this.F.setBackground(this.G);
        tg.b bVar4 = new tg.b(cVar, cVar, cVar);
        l0 l0Var2 = this.f37788b;
        bVar4.h = hVar;
        bVar4.f48713i = l0Var2;
        this.H = new View(context);
        tg.c cVar2 = new tg.c(bVar4.c(this.H, null, false));
        cVar2.b(org.telegram.messenger.i0.L(60.0f), true);
        this.H.setBackground(cVar2);
        this.f37788b.addView(this.H, w7.b6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new bh.c(17));
        this.E.addView(this.F, w7.b6.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f37788b.addView(this.E, w7.b6.e(-1, -2, 80));
        tc1 tc1Var = new tc1(context);
        this.D = tc1Var;
        this.f37788b.addView(tc1Var, w7.b6.e(-1, -2, 80));
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.f18944a;
        Activity parentActivity = getParentActivity();
        tc1 tc1Var2 = this.D;
        if (((ApplicationLoaderImpl) w0Var).q()) {
            c61Var = new org.telegram.ui.Components.c61(parentActivity, tc1Var2);
        }
        this.f40152x = c61Var;
        if (c61Var != null) {
            c61Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.f37788b;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gh.b bVar;
        LaunchActivity launchActivity;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i10 != org.telegram.messenger.at.G4 && i10 != org.telegram.messenger.at.f14772r) {
            if (i10 == org.telegram.messenger.at.R4) {
                org.telegram.ui.Components.c61 c61Var = this.f40152x;
                if (c61Var != null) {
                    c61Var.updateFileProgress(null);
                    this.f40152x.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == org.telegram.messenger.at.Y1) {
                String str = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.uz.f18526j1;
                if (tL_help_appUpdate != null && tL_help_appUpdate.document != null) {
                    org.telegram.messenger.w0.u();
                    return;
                }
                return;
            } else if (i10 == org.telegram.messenger.at.Z1) {
                String str2 = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.uz.f18526j1;
                if (tL_help_appUpdate2 != null && tL_help_appUpdate2.document != null) {
                    org.telegram.messenger.w0.u();
                    return;
                }
                return;
            } else if (i10 == org.telegram.messenger.at.X1) {
                org.telegram.ui.Components.c61 c61Var2 = this.f40152x;
                if (c61Var2 != null) {
                    c61Var2.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == org.telegram.messenger.at.Q4) {
                org.telegram.ui.Components.c61 c61Var3 = this.f40152x;
                if (c61Var3 != null && (launchActivity = LaunchActivity.I1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f33360d0.size() == 1) {
                        z11 = true;
                    }
                    c61Var3.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == org.telegram.messenger.at.f14791t4) {
                int currentPosition = this.f37789c.getCurrentPosition();
                SparseArray sparseArray = this.f37787a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    fd1 fd1Var = (fd1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && fd1Var != null) {
                        fd1Var.f37108a.clearViews();
                    }
                }
                return;
            } else if (i10 == org.telegram.messenger.at.O5) {
                m0(getUserConfig().W, true);
                gd1 gd1Var = this.f37789c;
                if (gd1Var != null && gd1Var.getCurrentPosition() == 2) {
                    this.f37789c.E(0);
                    s0(0, true);
                    this.f40153y = true;
                    return;
                }
                b0(2);
                return;
            } else if (i10 == org.telegram.messenger.at.f14728j0) {
                gh.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(i14).Z1(Long.valueOf(org.telegram.messenger.e20.i(i14).e()));
                    bVar.f7521c.e(Z1, new org.telegram.ui.Components.r8(0, Z1));
                    return;
                }
                return;
            } else if (i10 == org.telegram.messenger.at.P5) {
                l0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        if (view != null && view.isAttachedToWindow()) {
            z10 = true;
        }
        p0(z10);
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.k2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.t3.f20864c;
    }

    public final void i0() {
        hi.f fVar;
        View view;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (fVar = this.S) != null && (view = this.fragmentView) != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            k0();
            ei.s f7 = ei.r.f();
            if (!f7.f6693a) {
                fVar = null;
            } else if (!f7.f6694b || i10 < 33) {
                fVar = this.T;
            }
            if (fVar != null) {
                fVar.n(measuredWidth, measuredHeight);
                fVar.f7719c.a();
            }
        }
    }

    public final void j0() {
        float f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6);
        gd1 gd1Var = this.f37789c;
        if (gd1Var != null) {
            f7 = gd1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.R.a(i0.b.f(f7, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        vg.f fVar = this.G;
        if (fVar != null) {
            fVar.updateColors();
        }
        i0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        qf0 qf0Var = this.F;
        if (qf0Var != null) {
            qf0Var.invalidate();
        }
        gh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (gh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        int i10;
        int height;
        if (Build.VERSION.SDK_INT >= 31 && this.S != null && this.f37788b != null) {
            tc1 tc1Var = this.D;
            if (tc1Var != null && tc1Var.a()) {
                i10 = org.telegram.messenger.i0.L(44.0f);
            } else {
                i10 = 0;
            }
            int height2 = (((this.f37788b.getHeight() - this.L) - i10) - org.telegram.messenger.i0.L(8.0f)) - org.telegram.messenger.i0.L(56.0f);
            SparseArray sparseArray = this.f37787a;
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.k2 k2Var = ((fd1) sparseArray.valueAt(i11)).f37108a;
                View view = k2Var.fragmentView;
                if (view != null && view.getWidth() > 0 && (k2Var instanceof nf0)) {
                    if (height2 >= view.getHeight()) {
                        k2Var.setParentGlass(null, null);
                    } else {
                        RectF rectF = this.V;
                        rectF.set(0.0f, height2 - org.telegram.messenger.i0.L(1.0f), view.getWidth(), org.telegram.messenger.i0.L(1.0f) + height);
                        k2Var.setParentGlass(rectF, this.W);
                    }
                }
            }
        }
    }

    public final void l0() {
        if (this.F != null && this.K[1] != null) {
            boolean w9 = org.telegram.messenger.i5.w();
            if (w9) {
                org.telegram.messenger.wp.e1().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (org.telegram.messenger.e20.i(this.currentAccount).U && !w9 && org.telegram.messenger.wp.e1().getBoolean("askAboutContacts2", true)) {
                this.K[1].e("!", true, true);
            } else {
                this.K[1].e(null, true, true);
            }
        }
    }

    public final void m0(boolean z10, boolean z11) {
        qf0 qf0Var = this.F;
        if (qf0Var != null) {
            qf0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    public final void n0() {
        int i10;
        gd1 gd1Var = this.f37789c;
        if (gd1Var != null && this.H != null) {
            float a2 = 1.0f - w7.u.a(Math.abs(3.0f - gd1Var.getPositionAnimated()), 0.0f, 1.0f);
            float T1 = (1.0f - ((1.0f - org.telegram.messenger.i0.T1(0.0f, 1.0f, org.telegram.messenger.i0.R0(this.L))) * a2)) * this.f40151w.e;
            this.H.setAlpha(T1);
            this.H.setTranslationY(a2 * org.telegram.messenger.i0.L(48.0f));
            View view = this.H;
            if (T1 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    public final void o0() {
        int i10;
        boolean z10;
        int i11 = 0;
        if (this.D.a()) {
            i10 = org.telegram.messenger.i0.L(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f7 = this.f40151w.e;
        this.E.setTranslationY(org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(40.0f) + i12, i12));
        qf0 qf0Var = this.F;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        boolean z11 = true;
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qf0Var.setClickable(z10);
        qf0 qf0Var2 = this.F;
        if (i13 <= 0) {
            z11 = false;
        }
        qf0Var2.setEnabled(z11);
        this.F.setAlpha(f7);
        qf0 qf0Var3 = this.F;
        if (f7 <= 0.0f) {
            i11 = 8;
        }
        qf0Var3.setVisibility(i11);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f37789c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f37789c.E(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.k2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        xa.n nVar = new xa.n(org.telegram.messenger.at.f(this.currentAccount), this);
        nVar.e(org.telegram.messenger.at.Y1);
        nVar.e(org.telegram.messenger.at.X1);
        nVar.e(org.telegram.messenger.at.Z1);
        nVar.e(org.telegram.messenger.at.G4);
        nVar.e(org.telegram.messenger.at.f14772r);
        nVar.e(org.telegram.messenger.at.O5);
        nVar.e(org.telegram.messenger.at.f14728j0);
        nVar.e(org.telegram.messenger.at.P5);
        nVar.h(org.telegram.messenger.at.Q4);
        nVar.h(org.telegram.messenger.at.R4);
        nVar.h(org.telegram.messenger.at.f14791t4);
        this.O = nVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.wb.h(this.f37788b);
        xa.n nVar = this.O;
        if (nVar != null) {
            nVar.a();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        vh.p2 p2Var = this.P;
        if (p2Var != null) {
            p2Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        j0();
        l0();
        p0(true);
        if (this.Q) {
            return;
        }
        if (this.P == null && org.telegram.ui.Components.r30.f29870r.c()) {
            org.telegram.messenger.i0.h3(new kf0(this, 7), 1500L);
        }
        this.Q = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.k2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z10, f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.F == null) {
            return;
        }
        int i10 = org.telegram.messenger.is.a0(this.currentAccount).K;
        if (i10 > 0) {
            this.K[0].e(org.telegram.messenger.dd.E(i10, ','), false, z10);
            return;
        }
        this.K[0].e(null, false, z10);
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z10, z11);
        }
    }

    public final void q0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.e20.i(i10).p()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new f6(26));
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        if (org.telegram.messenger.e20.c() < 4) {
            H.c(2131232043, org.telegram.messenger.dd.L0(2131754484, null), new kf0(this, 1), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
                Drawable a02 = org.telegram.ui.ActionBar.t6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f7 = org.telegram.messenger.e20.i(intValue).f();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.r(f7);
                kg.x xVar = new kg.x(this, getParentActivity(), z10);
                linearLayout.addView(xVar, w7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getParentActivity());
                if (z10) {
                    g9Var.setScaleX(0.833f);
                    g9Var.setScaleY(0.833f);
                }
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
                g9Var.getImageReceiver().d = intValue;
                g9Var.e(f7, r8Var);
                xVar.addView(g9Var, w7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, getResourceProvider());
                textView.setText(org.telegram.messenger.i20.p(f7));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.b6.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new jg.w1(this, intValue, H, 15));
                H.r(linearLayout, w7.b6.o(230, 48));
            }
        }
        H.f33046u = true;
        H.v = true;
        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
        H.W(d02);
        H.Z();
        org.telegram.ui.Components.r30.f29870r.a();
    }

    public final zx r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        zx zxVar = new zx(bundle);
        this.J = zxVar;
        zxVar.I3 = new e(this, 23);
        this.f37787a.put(0, new fd1(zxVar));
        return this.J;
    }

    public final void s0(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12 = 0;
        while (true) {
            gh.b[] bVarArr = this.K;
            if (i12 < bVarArr.length) {
                gh.b bVar = bVarArr[i12];
                if (i12 > 2) {
                    i11 = i12 - 1;
                } else {
                    i11 = i12;
                }
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i12++;
            } else {
                return;
            }
        }
    }

    public final void t0(boolean z10, float f7) {
        for (int i10 = 0; i10 < this.K.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f7));
            gh.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.F.invalidate();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            o0();
            n0();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
