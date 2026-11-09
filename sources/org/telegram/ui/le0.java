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
public final class le0 extends qb1 implements org.telegram.messenger.ls, te.b {
    public cb1 D;
    public FrameLayout E;
    public ne0 F;
    public fh.g G;
    public View H;
    public Integer I;
    public yw J;
    public qh.b[] K;
    public int L;
    public int M;
    public int N;
    public ab.b0 O;
    public fi.m3 P;
    public boolean Q;
    public final ri.c R;
    public final ri.f S;
    public final ri.f T;
    public org.telegram.ui.Components.z41 f47585x;
    public boolean f47586y;
    public final te.a f47584w = new te.a(0, this, org.telegram.ui.Components.xq.h, 380, true);
    public final RectF U = new RectF();
    public final RectF V = new RectF();
    public final he0 W = new he0(this, 0);

    public le0() {
        if (Build.VERSION.SDK_INT >= 31) {
            ri.f fVar = new ri.f(null);
            ca.i iVar = new ca.i(this, false);
            if (fVar.f54583c == null) {
                fVar.f54583c = new dh.i(fVar.f54582b, iVar);
            }
            this.S = fVar;
            ri.f fVar2 = new ri.f(null);
            ca.i iVar2 = new ca.i(this, true);
            if (fVar2.f54583c == null) {
                fVar2.f54583c = new dh.i(fVar2.f54582b, iVar2);
            }
            this.T = fVar2;
        } else {
            this.S = null;
            this.T = null;
        }
        this.R = new ri.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.cc.a(this.f49013b, y8Var);
    }

    public static void d0(le0 le0Var, int i7, org.telegram.ui.Components.l60 l60Var) {
        if (le0Var.currentAccount != i7) {
            l60Var.u();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.O0(i7);
            }
        }
    }

    public static boolean e0(le0 le0Var, View view) {
        ArrayList T0;
        String str;
        int i7;
        boolean z9;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        int i12;
        ArrayList arrayList;
        boolean z10;
        String str2;
        ArrayList arrayList2;
        ?? r22 = 0;
        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null && (T0 = le0Var.getMessagesController().T0()) != null) {
            boolean z11 = true;
            if (T0.size() > 1) {
                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(le0Var, view);
                int i13 = 0;
                while (i13 < T0.size()) {
                    org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i13);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, le0Var.getParentActivity(), le0Var.getResourceProvider(), false, false);
                    z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), r22, org.telegram.messenger.g0.L(18.0f), r22);
                    if (voVar.e()) {
                        str = org.telegram.messenger.id.M0(2131750807, null);
                    } else {
                        str = voVar.f26071b;
                    }
                    CharSequence m10 = org.telegram.messenger.i6.m(str, z0Var.getTextView().getPaint().getFontMetricsInt(), r22, null, r22);
                    if (!voVar.e()) {
                        m10 = org.telegram.messenger.ij.B5(m10, voVar.f26072c, z0Var.getTextView().getPaint().getFontMetricsInt(), r22);
                    }
                    if (voVar.e()) {
                        i7 = org.telegram.messenger.yr.a0(le0Var.currentAccount).K;
                    } else {
                        i7 = voVar.d;
                    }
                    if (i7 > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                        int length = spannableStringBuilder2.length();
                        spannableStringBuilder2.append((CharSequence) String.valueOf(i7));
                        org.telegram.messenger.qp messagesController = le0Var.getMessagesController();
                        if (voVar.e()) {
                            z9 = z11;
                            arrayList = messagesController.W0(r22);
                        } else {
                            z9 = z11;
                            arrayList = messagesController.f24944y;
                        }
                        int i14 = r22;
                        while (true) {
                            if (i14 < arrayList.size()) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i14);
                                if (!voVar.e()) {
                                    long j3 = dialog.f26960id;
                                    if (org.telegram.messenger.m5.C(j3)) {
                                        arrayList2 = arrayList;
                                        i10 = i13;
                                        TLRPC.EncryptedChat a12 = messagesController.a1(Integer.valueOf((int) (j3 & 4294967295L)));
                                        if (a12 != null) {
                                            j3 = a12.user_id;
                                        }
                                    } else {
                                        arrayList2 = arrayList;
                                        i10 = i13;
                                    }
                                    if (!voVar.c(le0Var.getAccountInstance(), j3, dialog)) {
                                        continue;
                                        i14++;
                                        i13 = i10;
                                        arrayList = arrayList2;
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    i10 = i13;
                                }
                                if ((messagesController.V0(dialog) > 0 || dialog.unread_mark) && !messagesController.r2(dialog.f26960id, 0L, null)) {
                                    z10 = z9 ? 1 : 0;
                                    break;
                                }
                                i14++;
                                i13 = i10;
                                arrayList = arrayList2;
                            } else {
                                i10 = i13;
                                z10 = false;
                                break;
                            }
                        }
                        spannableStringBuilder2.setSpan(new je0(le0Var, i7, z10), length, spannableStringBuilder2.length(), 33);
                        if (voVar.e()) {
                            str2 = org.telegram.messenger.id.M0(2131750807, null);
                        } else {
                            str2 = voVar.f26071b;
                        }
                        String G = org.telegram.messenger.id.G(i7, "AccDescrUnreadCount", new Object[0]);
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = str2;
                        charSequenceArr[z9 ? 1 : 0] = "\n";
                        charSequenceArr[2] = G;
                        z0Var.setContentDescription(TextUtils.concat(charSequenceArr));
                        spannableStringBuilder = spannableStringBuilder2;
                    } else {
                        z9 = z11;
                        i10 = i13;
                        spannableStringBuilder = m10;
                    }
                    if (voVar.f26081n) {
                        i11 = 26;
                    } else {
                        i11 = 0;
                    }
                    z0Var.setEmojiCacheType(i11);
                    if (le0Var.getMessagesController().A7) {
                        i12 = voVar.f26080m;
                    } else {
                        i12 = -1;
                    }
                    z0Var.j(spannableStringBuilder, 0, new org.telegram.ui.Components.xz(le0Var.getParentActivity(), 2131232156, i12));
                    z0Var.getTextView().setEmojiColor(le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.Ci));
                    z0Var.setMinimumWidth(160);
                    z0Var.setOnClickListener(new z(le0Var, H, voVar, 11));
                    H.r(z0Var, c8.ha.o(-1, -2));
                    i13 = i10 + 1;
                    z11 = z9;
                    r22 = 0;
                }
                boolean z12 = z11;
                H.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                H.X = org.telegram.messenger.g0.L(400.0f);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                H.W(d02);
                H.f35599i = 3;
                H.Z();
                return z12;
            }
        }
        return false;
    }

    public static void f0(le0 le0Var) {
        org.telegram.messenger.p10 userConfig = le0Var.getUserConfig();
        if (!userConfig.W) {
            userConfig.W = true;
            userConfig.v(false);
        }
        le0Var.m0(true, true);
        org.telegram.messenger.qs.f(le0Var.currentAccount).k(org.telegram.messenger.qs.O5, new Object[0]);
    }

    public static void g0(le0 le0Var) {
        le0Var.getClass();
        int i7 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.p10.i(i10).p()) {
                i7++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.p10.o()) {
            i7--;
        }
        if (i7 > 0 && num != null) {
            le0Var.presentFragment(new ee0(num.intValue()));
        } else if (!org.telegram.messenger.p10.o()) {
            le0Var.showDialog(new ug.i0(7, le0Var.currentAccount, le0Var.getParentActivity(), le0Var, null));
        }
    }

    public static void h0(le0 le0Var) {
        org.telegram.messenger.p10 userConfig = le0Var.getUserConfig();
        if (userConfig.W) {
            userConfig.W = false;
            userConfig.v(false);
        }
        le0Var.m0(false, true);
        org.telegram.messenger.qs.f(le0Var.currentAccount).k(org.telegram.messenger.qs.O5, new Object[0]);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            o0();
            n0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f2 a0(int i7) {
        if (i7 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i7 == 2) {
            if (getUserConfig().W) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new i9(bundle2);
            }
            return new n31(a8.p0.k("hasMainTabs", true));
        } else if (i7 == 0) {
            yw ywVar = new yw(a8.p0.k("hasMainTabs", true));
            this.J = ywVar;
            ywVar.J3 = new f(this, 23);
            return ywVar;
        } else if (i7 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", org.telegram.messenger.p10.i(this.currentAccount).e());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27938h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null && c02.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        super.createView(context);
        ne0 ne0Var = new ne0(context, this.resourceProvider);
        this.F = ne0Var;
        ne0Var.setClipChildren(false);
        this.F.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.F.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        qh.b[] bVarArr = new qh.b[5];
        this.K = bVarArr;
        bVarArr[0] = qh.b.c(context, this.resourceProvider, qh.a.f54140n, 2131748707);
        this.K[1] = qh.b.c(context, this.resourceProvider, qh.a.f54139f, 2131748706);
        this.K[2] = qh.b.c(context, this.resourceProvider, qh.a.f54141r, 2131745495);
        this.K[3] = qh.b.c(context, this.resourceProvider, qh.a.h, 2131748708);
        qh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        qh.b bVar = new qh.b(context);
        org.telegram.ui.Components.z41 z41Var = null;
        bVar.f54150a.setText(org.telegram.messenger.id.M0(2131748705, null));
        bVar.f54151b.setVisibility(8);
        TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(org.telegram.messenger.p10.i(i10).e()));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(0, a22);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.e(a22, w8Var);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.f54152c = l9Var;
        bVar.addView(l9Var, c8.ha.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f54159x = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ql, g6Var);
        bVar.f54157s = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ol, g6Var);
        bVar.f54158w = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Pl, g6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f46657b;

            {
                this.f46657b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f46657b;
                switch (i11) {
                    case 0:
                        return le0.e0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(le0Var, view);
                        H.c(2131232099, org.telegram.messenger.id.M0(2131748283, null), new he0(le0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.id.M0(2131743439, null), new he0(le0Var, 7), false);
                        H.f35619u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f35599i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H2 = org.telegram.ui.Components.l60.H(le0Var, view);
                        H2.c(2131231770, org.telegram.messenger.id.M0(2131749490, null), new he0(le0Var, 2), false);
                        if (le0Var.getUserConfig().W) {
                            H2.c(2131232053, org.telegram.messenger.id.M0(2131749322, null), new he0(le0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.id.M0(2131749461, null), new he0(le0Var, 4), false);
                        }
                        H2.f35619u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f46657b;

            {
                this.f46657b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f46657b;
                switch (i11) {
                    case 0:
                        return le0.e0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(le0Var, view);
                        H.c(2131232099, org.telegram.messenger.id.M0(2131748283, null), new he0(le0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.id.M0(2131743439, null), new he0(le0Var, 7), false);
                        H.f35619u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f35599i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H2 = org.telegram.ui.Components.l60.H(le0Var, view);
                        H2.c(2131231770, org.telegram.messenger.id.M0(2131749490, null), new he0(le0Var, 2), false);
                        if (le0Var.getUserConfig().W) {
                            H2.c(2131232053, org.telegram.messenger.id.M0(2131749322, null), new he0(le0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.id.M0(2131749461, null), new he0(le0Var, 4), false);
                        }
                        H2.f35619u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f46657b;

            {
                this.f46657b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f46657b;
                switch (i11) {
                    case 0:
                        return le0.e0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(le0Var, view);
                        H.c(2131232099, org.telegram.messenger.id.M0(2131748283, null), new he0(le0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.id.M0(2131743439, null), new he0(le0Var, 7), false);
                        H.f35619u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f35599i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H2 = org.telegram.ui.Components.l60.H(le0Var, view);
                        H2.c(2131231770, org.telegram.messenger.id.M0(2131749490, null), new he0(le0Var, 2), false);
                        if (le0Var.getUserConfig().W) {
                            H2.c(2131232053, org.telegram.messenger.id.M0(2131749322, null), new he0(le0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.id.M0(2131749461, null), new he0(le0Var, 4), false);
                        }
                        H2.f35619u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f46657b;

            {
                this.f46657b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f46657b;
                switch (i11) {
                    case 0:
                        return le0.e0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(le0Var, view);
                        H.c(2131232099, org.telegram.messenger.id.M0(2131748283, null), new he0(le0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.id.M0(2131743439, null), new he0(le0Var, 7), false);
                        H.f35619u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f35599i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.l60 H2 = org.telegram.ui.Components.l60.H(le0Var, view);
                        H2.c(2131231770, org.telegram.messenger.id.M0(2131749490, null), new he0(le0Var, 2), false);
                        if (le0Var.getUserConfig().W) {
                            H2.c(2131232053, org.telegram.messenger.id.M0(2131749322, null), new he0(le0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.id.M0(2131749461, null), new he0(le0Var, 4), false);
                        }
                        H2.f35619u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.F.P.add(this.K[0]);
        this.F.P.add(this.K[1]);
        this.F.P.add(this.K[4]);
        this.F.P.add(this.K[3]);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr3 = this.K;
            if (i11 >= bVarArr3.length) {
                break;
            }
            qh.b bVar2 = bVarArr3[i11];
            if (i11 > 2) {
                i7 = i11 - 1;
            } else {
                i7 = i11;
            }
            bVar2.setOnClickListener(new ai.v(this, i7, 25));
            this.F.addView(this.K[i11]);
            this.F.i(bVar2, true, false);
            i11++;
        }
        m0(getUserConfig().W, false);
        s0(this.f49014c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6);
        ri.c cVar = this.R;
        cVar.a(themedColor);
        jh.k kVar = new jh.k(this.f49013b);
        ri.a aVar = this.S;
        if (aVar == null) {
            aVar = cVar;
        }
        ri.a aVar2 = this.T;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        dh.c cVar2 = new dh.c(aVar, aVar2, cVar);
        k0 k0Var = this.f49013b;
        cVar2.h = kVar;
        cVar2.f8706i = k0Var;
        cVar2.f8708k = true;
        fh.g c10 = cVar2.c(this.F, c8.g0.f(this.resourceProvider), false);
        this.G = c10;
        c10.r(org.telegram.messenger.g0.L(28.0f));
        this.G.q(org.telegram.messenger.g0.L(7.666f));
        this.F.setBackground(this.G);
        dh.c cVar3 = new dh.c(cVar, cVar, cVar);
        k0 k0Var2 = this.f49013b;
        cVar3.h = kVar;
        cVar3.f8706i = k0Var2;
        this.H = new View(context);
        dh.d dVar = new dh.d(cVar3.c(this.H, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.H.setBackground(dVar);
        this.f49013b.addView(this.H, c8.ha.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new bi.l1(19));
        this.E.addView(this.F, c8.ha.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f49013b.addView(this.E, c8.ha.e(-1, -2, 80));
        cb1 cb1Var = new cb1(context);
        this.D = cb1Var;
        this.f49013b.addView(cb1Var, c8.ha.e(-1, -2, 80));
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25565a;
        Activity parentActivity = getParentActivity();
        cb1 cb1Var2 = this.D;
        if (((ApplicationLoaderImpl) t0Var).q()) {
            z41Var = new org.telegram.ui.Components.z41(parentActivity, cb1Var2);
        }
        this.f47585x = z41Var;
        if (z41Var != null) {
            z41Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.f49013b;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qh.b bVar;
        LaunchActivity launchActivity;
        boolean z9 = false;
        boolean z10 = false;
        z9 = false;
        if (i7 != org.telegram.messenger.qs.G4 && i7 != org.telegram.messenger.qs.f25063r) {
            if (i7 == org.telegram.messenger.qs.R4) {
                org.telegram.ui.Components.z41 z41Var = this.f47585x;
                if (z41Var != null) {
                    z41Var.updateFileProgress(null);
                    this.f47585x.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.Y1) {
                String str = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.iz.f23412j1;
                if (tL_help_appUpdate != null && tL_help_appUpdate.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.Z1) {
                String str2 = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.iz.f23412j1;
                if (tL_help_appUpdate2 != null && tL_help_appUpdate2.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.X1) {
                org.telegram.ui.Components.z41 z41Var2 = this.f47585x;
                if (z41Var2 != null) {
                    z41Var2.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.Q4) {
                org.telegram.ui.Components.z41 z41Var3 = this.f47585x;
                if (z41Var3 != null && (launchActivity = LaunchActivity.G1) != null) {
                    int i11 = this.currentAccount;
                    if (launchActivity.f41267d0.size() == 1) {
                        z10 = true;
                    }
                    z41Var3.updateAppUpdateViews(i11, z10);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.f25081t4) {
                int currentPosition = this.f49014c.getCurrentPosition();
                SparseArray sparseArray = this.f49012a;
                int size = sparseArray.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ob1 ob1Var = (ob1) sparseArray.valueAt(i12);
                    if (sparseArray.keyAt(i12) != currentPosition && ob1Var != null) {
                        ob1Var.f48422a.clearViews();
                    }
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.O5) {
                m0(getUserConfig().W, true);
                pb1 pb1Var = this.f49014c;
                if (pb1Var != null && pb1Var.getCurrentPosition() == 2) {
                    this.f49014c.E(0);
                    s0(0, true);
                    this.f47586y = true;
                    return;
                }
                b0(2);
                return;
            } else if (i7 == org.telegram.messenger.qs.f25020j0) {
                qh.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i13 = this.currentAccount;
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(i13).a2(Long.valueOf(org.telegram.messenger.p10.i(i13).e()));
                    bVar.f54152c.e(a22, new org.telegram.ui.Components.w8(0, a22));
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.P5) {
                l0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        if (view != null && view.isAttachedToWindow()) {
            z9 = true;
        }
        p0(z9);
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z9, boolean z10, float f10) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z9, z10, f10);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.o3.f28341c;
    }

    public final void i0() {
        ri.f fVar;
        View view;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && (fVar = this.S) != null && (view = this.fragmentView) != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            k0();
            oi.r f10 = oi.q.f();
            if (!f10.f21122a) {
                fVar = null;
            } else if (!f10.f21123b || i7 < 33) {
                fVar = this.T;
            }
            if (fVar != null) {
                fVar.n(measuredWidth, measuredHeight);
                fVar.f54583c.a();
            }
        }
    }

    public final void j0() {
        float f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.f27809a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6);
        pb1 pb1Var = this.f49014c;
        if (pb1Var != null) {
            f10 = pb1Var.r(0);
        } else {
            f10 = 1.0f;
        }
        this.R.a(i0.a.f(f10, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        fh.g gVar = this.G;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        ne0 ne0Var = this.F;
        if (ne0Var != null) {
            ne0Var.invalidate();
        }
        qh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (qh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        int i7;
        int height;
        if (Build.VERSION.SDK_INT >= 31 && this.S != null && this.f49013b != null) {
            cb1 cb1Var = this.D;
            if (cb1Var != null && cb1Var.a()) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            int height2 = (((this.f49013b.getHeight() - this.L) - i7) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(56.0f);
            SparseArray sparseArray = this.f49012a;
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.ActionBar.f2 f2Var = ((ob1) sparseArray.valueAt(i10)).f48422a;
                View view = f2Var.fragmentView;
                if (view != null && view.getWidth() > 0 && (f2Var instanceof ke0)) {
                    if (height2 >= view.getHeight()) {
                        f2Var.setParentGlass(null, null);
                    } else {
                        RectF rectF = this.V;
                        rectF.set(0.0f, height2 - org.telegram.messenger.g0.L(1.0f), view.getWidth(), org.telegram.messenger.g0.L(1.0f) + height);
                        f2Var.setParentGlass(rectF, this.W);
                    }
                }
            }
        }
    }

    public final void l0() {
        if (this.F != null && this.K[1] != null) {
            boolean w10 = org.telegram.messenger.g5.w();
            if (w10) {
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (org.telegram.messenger.p10.i(this.currentAccount).U && !w10 && org.telegram.messenger.qp.f1().getBoolean("askAboutContacts2", true)) {
                this.K[1].e("!", true, true);
            } else {
                this.K[1].e(null, true, true);
            }
        }
    }

    public final void m0(boolean z9, boolean z10) {
        ne0 ne0Var = this.F;
        if (ne0Var != null) {
            ne0Var.i(this.K[2], !z9, z10);
            this.F.i(this.K[3], z9, z10);
        }
    }

    public final void n0() {
        int i7;
        pb1 pb1Var = this.f49014c;
        if (pb1Var != null && this.H != null) {
            float a10 = 1.0f - c8.j9.a(Math.abs(3.0f - pb1Var.getPositionAnimated()), 0.0f, 1.0f);
            float T1 = (1.0f - ((1.0f - org.telegram.messenger.g0.T1(0.0f, 1.0f, org.telegram.messenger.g0.R0(this.L))) * a10)) * this.f47584w.f55499e;
            this.H.setAlpha(T1);
            this.H.setTranslationY(a10 * org.telegram.messenger.g0.L(48.0f));
            View view = this.H;
            if (T1 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            view.setVisibility(i7);
        }
    }

    public final void o0() {
        int i7;
        boolean z9;
        int i10 = 0;
        if (this.D.a()) {
            i7 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i7 = 0;
        }
        int i11 = -i7;
        float f10 = this.f47584w.f55499e;
        this.E.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(40.0f) + i11, i11));
        ne0 ne0Var = this.F;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        boolean z10 = true;
        if (i12 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ne0Var.setClickable(z9);
        ne0 ne0Var2 = this.F;
        if (i12 <= 0) {
            z10 = false;
        }
        ne0Var2.setEnabled(z10);
        this.F.setAlpha(f10);
        ne0 ne0Var3 = this.F;
        if (f10 <= 0.0f) {
            i10 = 8;
        }
        ne0Var3.setVisibility(i10);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        boolean onBackPressed = super.onBackPressed(z9);
        if (onBackPressed && this.f49014c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z9) {
                this.f49014c.E(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = new ab.b0(org.telegram.messenger.qs.f(this.currentAccount), this);
        b0Var.c(org.telegram.messenger.qs.Y1);
        b0Var.c(org.telegram.messenger.qs.X1);
        b0Var.c(org.telegram.messenger.qs.Z1);
        b0Var.c(org.telegram.messenger.qs.G4);
        b0Var.c(org.telegram.messenger.qs.f25063r);
        b0Var.c(org.telegram.messenger.qs.O5);
        b0Var.c(org.telegram.messenger.qs.f25020j0);
        b0Var.c(org.telegram.messenger.qs.P5);
        b0Var.e(org.telegram.messenger.qs.Q4);
        b0Var.e(org.telegram.messenger.qs.R4);
        b0Var.e(org.telegram.messenger.qs.f25081t4);
        this.O = b0Var;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.cc.h(this.f49013b);
        ab.b0 b0Var = this.O;
        if (b0Var != null) {
            b0Var.b();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        fi.m3 m3Var = this.P;
        if (m3Var != null) {
            m3Var.f(true);
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
        if (this.P == null && org.telegram.ui.Components.a30.f31693r.c()) {
            org.telegram.messenger.g0.i3(new he0(this, 8), 1500L);
        }
        this.Q = true;
    }

    @Override
    public final void onSlideProgress(boolean z9, float f10) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z9, f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z9) {
        if (this.F == null) {
            return;
        }
        int i7 = org.telegram.messenger.yr.a0(this.currentAccount).K;
        if (i7 > 0) {
            this.K[0].e(org.telegram.messenger.id.E(i7, ','), false, z9);
            return;
        }
        this.K[0].e(null, false, z9);
    }

    @Override
    public final void prepareFragmentToSlide(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z9, z10);
        }
    }

    public final void q0(View view) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.p10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new oe(27));
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(this, view);
        if (org.telegram.messenger.p10.c() < 4) {
            H.c(2131232044, org.telegram.messenger.id.M0(2131754484, null), new he0(this, 1), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
                Drawable a02 = org.telegram.ui.ActionBar.l6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
                org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.s6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                w8Var.r(f10);
                fi.r3 r3Var = new fi.r3(this, getParentActivity(), z9);
                linearLayout.addView(r3Var, c8.ha.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getParentActivity());
                if (z9) {
                    l9Var.setScaleX(0.833f);
                    l9Var.setScaleY(0.833f);
                }
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                l9Var.getImageReceiver().d = intValue;
                l9Var.e(f10, w8Var);
                r3Var.addView(l9Var, c8.ha.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, getResourceProvider());
                textView.setText(org.telegram.messenger.t10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ha.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.la(this, intValue, H, 15));
                H.r(linearLayout, c8.ha.o(230, 48));
            }
        }
        H.f35619u = true;
        H.v = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
        H.W(d02);
        H.Z();
        org.telegram.ui.Components.a30.f31693r.a();
    }

    public final yw r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        yw ywVar = new yw(bundle);
        this.J = ywVar;
        ywVar.J3 = new f(this, 23);
        this.f49012a.put(0, new ob1(ywVar));
        return this.J;
    }

    public final void s0(int i7, boolean z9) {
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.K;
            if (i11 < bVarArr.length) {
                qh.b bVar = bVarArr[i11];
                if (i11 > 2) {
                    i10 = i11 - 1;
                } else {
                    i10 = i11;
                }
                if (i10 == i7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.f(z10, z9);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void t0(boolean z9, float f10) {
        for (int i7 = 0; i7 < this.K.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i7 > 2 ? i7 - 1 : i7) - f10));
            qh.b bVar = this.K[i7];
            bVar.J = max;
            bVar.I = z9;
            bVar.invalidate();
        }
        this.F.invalidate();
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
