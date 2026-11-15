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
public final class je0 extends mb1 implements org.telegram.messenger.is, te.b {
    public ya1 E;
    public FrameLayout F;
    public le0 G;
    public fh.g H;
    public View I;
    public Integer J;
    public yw K;
    public qh.b[] L;
    public int M;
    public int N;
    public int O;
    public xi.e P;
    public hi.l3 Q;
    public boolean R;
    public final ui.c S;
    public final ui.f T;
    public final ui.f U;
    public org.telegram.ui.Components.b51 f48300x;
    public boolean f48301y;
    public final te.a f48299w = new te.a(0, this, org.telegram.ui.Components.er.h, 380, true);
    public final RectF V = new RectF();
    public final RectF W = new RectF();
    public final fe0 X = new fe0(this, 0);

    public je0() {
        if (Build.VERSION.SDK_INT >= 31) {
            ui.f fVar = new ui.f(null);
            ca.i iVar = new ca.i(this, false);
            if (fVar.f58438c == null) {
                fVar.f58438c = new dh.i(fVar.f58437b, iVar);
            }
            this.T = fVar;
            ui.f fVar2 = new ui.f(null);
            ca.i iVar2 = new ca.i(this, true);
            if (fVar2.f58438c == null) {
                fVar2.f58438c = new dh.i(fVar2.f58437b, iVar2);
            }
            this.U = fVar2;
        } else {
            this.T = null;
            this.U = null;
        }
        this.S = new ui.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.xb.a(this.f49200b, y8Var);
    }

    public static void d0(je0 je0Var, int i7, org.telegram.ui.Components.m60 m60Var) {
        if (je0Var.currentAccount != i7) {
            m60Var.u();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i7);
            }
        }
    }

    public static boolean e0(je0 je0Var, View view) {
        ArrayList T0;
        String str;
        int i7;
        boolean z10;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        int i12;
        ArrayList arrayList;
        boolean z11;
        String str2;
        ArrayList arrayList2;
        ?? r22 = 0;
        if (je0Var.getParentActivity() != null && je0Var.getParentActivity() != null && (T0 = je0Var.getMessagesController().T0()) != null) {
            boolean z12 = true;
            if (T0.size() > 1) {
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(je0Var, view);
                int i13 = 0;
                while (i13 < T0.size()) {
                    org.telegram.messenger.so soVar = (org.telegram.messenger.so) T0.get(i13);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, je0Var.getParentActivity(), je0Var.getResourceProvider(), false, false);
                    z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), r22, org.telegram.messenger.g0.L(18.0f), r22);
                    if (soVar.e()) {
                        str = org.telegram.messenger.hd.M0(2131750807, null);
                    } else {
                        str = soVar.f26553b;
                    }
                    CharSequence m10 = org.telegram.messenger.j6.m(str, z0Var.getTextView().getPaint().getFontMetricsInt(), r22, null, r22);
                    if (!soVar.e()) {
                        m10 = org.telegram.messenger.gj.B5(m10, soVar.f26554c, z0Var.getTextView().getPaint().getFontMetricsInt(), r22);
                    }
                    if (soVar.e()) {
                        i7 = org.telegram.messenger.vr.a0(je0Var.currentAccount).L;
                    } else {
                        i7 = soVar.d;
                    }
                    if (i7 > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                        int length = spannableStringBuilder2.length();
                        spannableStringBuilder2.append((CharSequence) String.valueOf(i7));
                        org.telegram.messenger.np messagesController = je0Var.getMessagesController();
                        if (soVar.e()) {
                            z10 = z12;
                            arrayList = messagesController.W0(r22);
                        } else {
                            z10 = z12;
                            arrayList = messagesController.f25443y;
                        }
                        int i14 = r22;
                        while (true) {
                            if (i14 < arrayList.size()) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i14);
                                if (!soVar.e()) {
                                    long j3 = dialog.f28055id;
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
                                    if (!soVar.c(je0Var.getAccountInstance(), j3, dialog)) {
                                        continue;
                                        i14++;
                                        i13 = i10;
                                        arrayList = arrayList2;
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    i10 = i13;
                                }
                                if ((messagesController.V0(dialog) > 0 || dialog.unread_mark) && !messagesController.r2(dialog.f28055id, 0L, null)) {
                                    z11 = z10 ? 1 : 0;
                                    break;
                                }
                                i14++;
                                i13 = i10;
                                arrayList = arrayList2;
                            } else {
                                i10 = i13;
                                z11 = false;
                                break;
                            }
                        }
                        spannableStringBuilder2.setSpan(new he0(je0Var, i7, z11), length, spannableStringBuilder2.length(), 33);
                        if (soVar.e()) {
                            str2 = org.telegram.messenger.hd.M0(2131750807, null);
                        } else {
                            str2 = soVar.f26553b;
                        }
                        String G = org.telegram.messenger.hd.G(i7, "AccDescrUnreadCount", new Object[0]);
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = str2;
                        charSequenceArr[z10 ? 1 : 0] = "\n";
                        charSequenceArr[2] = G;
                        z0Var.setContentDescription(TextUtils.concat(charSequenceArr));
                        spannableStringBuilder = spannableStringBuilder2;
                    } else {
                        z10 = z12;
                        i10 = i13;
                        spannableStringBuilder = m10;
                    }
                    if (soVar.f26563n) {
                        i11 = 26;
                    } else {
                        i11 = 0;
                    }
                    z0Var.setEmojiCacheType(i11);
                    if (je0Var.getMessagesController().B7) {
                        i12 = soVar.f26562m;
                    } else {
                        i12 = -1;
                    }
                    z0Var.j(spannableStringBuilder, 0, new org.telegram.ui.Components.a00(je0Var.getParentActivity(), 2131232157, i12));
                    z0Var.getTextView().setEmojiColor(je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                    z0Var.setMinimumWidth(160);
                    z0Var.setOnClickListener(new y(je0Var, H, soVar, 11));
                    H.r(z0Var, c8.ja.o(-1, -2));
                    i13 = i10 + 1;
                    z12 = z10;
                    r22 = 0;
                }
                boolean z13 = z12;
                H.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                H.X = org.telegram.messenger.g0.L(400.0f);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                H.W(d02);
                H.f37093i = 3;
                H.Z();
                return z13;
            }
        }
        return false;
    }

    public static void f0(je0 je0Var) {
        org.telegram.messenger.m10 userConfig = je0Var.getUserConfig();
        if (!userConfig.X) {
            userConfig.X = true;
            userConfig.v(false);
        }
        je0Var.m0(true, true);
        org.telegram.messenger.ns.f(je0Var.currentAccount).k(org.telegram.messenger.ns.O5, new Object[0]);
    }

    public static void g0(je0 je0Var) {
        je0Var.getClass();
        int i7 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.m10.i(i10).p()) {
                i7++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.m10.o()) {
            i7--;
        }
        if (i7 > 0 && num != null) {
            je0Var.presentFragment(new ce0(num.intValue()));
        } else if (!org.telegram.messenger.m10.o()) {
            je0Var.showDialog(new ug.j0(7, je0Var.currentAccount, je0Var.getParentActivity(), je0Var, null));
        }
    }

    public static void h0(je0 je0Var) {
        org.telegram.messenger.m10 userConfig = je0Var.getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.v(false);
        }
        je0Var.m0(false, true);
        org.telegram.messenger.ns.f(je0Var.currentAccount).k(org.telegram.messenger.ns.O5, new Object[0]);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            o0();
            n0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e2 a0(int i7) {
        if (i7 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i7 == 2) {
            if (getUserConfig().X) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new i9(bundle2);
            }
            return new k31(a8.p0.k("hasMainTabs", true));
        } else if (i7 == 0) {
            yw ywVar = new yw(a8.p0.k("hasMainTabs", true));
            this.K = ywVar;
            ywVar.K3 = new f(this, 23);
            return ywVar;
        } else if (i7 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", org.telegram.messenger.m10.i(this.currentAccount).e());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28922h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.e2 c02 = c0();
        if (c02 != null && c02.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        super.createView(context);
        le0 le0Var = new le0(context, this.resourceProvider);
        this.G = le0Var;
        le0Var.setClipChildren(false);
        this.G.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.G.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        qh.b[] bVarArr = new qh.b[5];
        this.L = bVarArr;
        bVarArr[0] = qh.b.c(context, this.resourceProvider, qh.a.f55572n, 2131748707);
        this.L[1] = qh.b.c(context, this.resourceProvider, qh.a.f55571f, 2131748706);
        this.L[2] = qh.b.c(context, this.resourceProvider, qh.a.f55573r, 2131745495);
        this.L[3] = qh.b.c(context, this.resourceProvider, qh.a.h, 2131748708);
        qh.b[] bVarArr2 = this.L;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        qh.b bVar = new qh.b(context);
        org.telegram.ui.Components.b51 b51Var = null;
        bVar.f55582a.setText(org.telegram.messenger.hd.M0(2131748705, null));
        bVar.f55583b.setVisibility(8);
        TLRPC.User a22 = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(org.telegram.messenger.m10.i(i10).e()));
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(0, a22);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        i9Var.f(a22, t8Var);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.f55584c = i9Var;
        bVar.addView(i9Var, c8.ja.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f55591x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Tl, e6Var);
        bVar.f55589s = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Rl, e6Var);
        bVar.f55590w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Sl, e6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.L[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final je0 f47425b;

            {
                this.f47425b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                je0 je0Var = this.f47425b;
                switch (i11) {
                    case 0:
                        return je0.e0(je0Var, view);
                    case 1:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(je0Var, view);
                        H.c(2131232100, org.telegram.messenger.hd.M0(2131748283, null), new fe0(je0Var, 6), false);
                        H.c(2131232084, org.telegram.messenger.hd.M0(2131743439, null), new fe0(je0Var, 7), false);
                        H.f37113u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f37093i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H2 = org.telegram.ui.Components.m60.H(je0Var, view);
                        H2.c(2131231770, org.telegram.messenger.hd.M0(2131749490, null), new fe0(je0Var, 2), false);
                        if (je0Var.getUserConfig().X) {
                            H2.c(2131232054, org.telegram.messenger.hd.M0(2131749322, null), new fe0(je0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.hd.M0(2131749461, null), new fe0(je0Var, 4), false);
                        }
                        H2.f37113u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        je0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final je0 f47425b;

            {
                this.f47425b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                je0 je0Var = this.f47425b;
                switch (i11) {
                    case 0:
                        return je0.e0(je0Var, view);
                    case 1:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(je0Var, view);
                        H.c(2131232100, org.telegram.messenger.hd.M0(2131748283, null), new fe0(je0Var, 6), false);
                        H.c(2131232084, org.telegram.messenger.hd.M0(2131743439, null), new fe0(je0Var, 7), false);
                        H.f37113u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f37093i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H2 = org.telegram.ui.Components.m60.H(je0Var, view);
                        H2.c(2131231770, org.telegram.messenger.hd.M0(2131749490, null), new fe0(je0Var, 2), false);
                        if (je0Var.getUserConfig().X) {
                            H2.c(2131232054, org.telegram.messenger.hd.M0(2131749322, null), new fe0(je0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.hd.M0(2131749461, null), new fe0(je0Var, 4), false);
                        }
                        H2.f37113u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        je0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final je0 f47425b;

            {
                this.f47425b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                je0 je0Var = this.f47425b;
                switch (i11) {
                    case 0:
                        return je0.e0(je0Var, view);
                    case 1:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(je0Var, view);
                        H.c(2131232100, org.telegram.messenger.hd.M0(2131748283, null), new fe0(je0Var, 6), false);
                        H.c(2131232084, org.telegram.messenger.hd.M0(2131743439, null), new fe0(je0Var, 7), false);
                        H.f37113u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f37093i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H2 = org.telegram.ui.Components.m60.H(je0Var, view);
                        H2.c(2131231770, org.telegram.messenger.hd.M0(2131749490, null), new fe0(je0Var, 2), false);
                        if (je0Var.getUserConfig().X) {
                            H2.c(2131232054, org.telegram.messenger.hd.M0(2131749322, null), new fe0(je0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.hd.M0(2131749461, null), new fe0(je0Var, 4), false);
                        }
                        H2.f37113u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        je0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final je0 f47425b;

            {
                this.f47425b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                je0 je0Var = this.f47425b;
                switch (i11) {
                    case 0:
                        return je0.e0(je0Var, view);
                    case 1:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(je0Var, view);
                        H.c(2131232100, org.telegram.messenger.hd.M0(2131748283, null), new fe0(je0Var, 6), false);
                        H.c(2131232084, org.telegram.messenger.hd.M0(2131743439, null), new fe0(je0Var, 7), false);
                        H.f37113u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f37093i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (je0Var.getParentActivity() == null || je0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m60 H2 = org.telegram.ui.Components.m60.H(je0Var, view);
                        H2.c(2131231770, org.telegram.messenger.hd.M0(2131749490, null), new fe0(je0Var, 2), false);
                        if (je0Var.getUserConfig().X) {
                            H2.c(2131232054, org.telegram.messenger.hd.M0(2131749322, null), new fe0(je0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.hd.M0(2131749461, null), new fe0(je0Var, 4), false);
                        }
                        H2.f37113u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        je0Var.q0(view);
                        return true;
                }
            }
        });
        this.G.Q.add(this.L[0]);
        this.G.Q.add(this.L[1]);
        this.G.Q.add(this.L[4]);
        this.G.Q.add(this.L[3]);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr3 = this.L;
            if (i11 >= bVarArr3.length) {
                break;
            }
            qh.b bVar2 = bVarArr3[i11];
            if (i11 > 2) {
                i7 = i11 - 1;
            } else {
                i7 = i11;
            }
            bVar2.setOnClickListener(new ci.q(this, i7, 25));
            this.G.addView(this.L[i11]);
            this.G.i(bVar2, true, false);
            i11++;
        }
        m0(getUserConfig().X, false);
        s0(this.f49201c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6);
        ui.c cVar = this.S;
        cVar.a(themedColor);
        jh.k kVar = new jh.k(this.f49200b);
        ui.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        ui.a aVar2 = this.U;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        dh.c cVar2 = new dh.c(aVar, aVar2, cVar);
        k0 k0Var = this.f49200b;
        cVar2.h = kVar;
        cVar2.f8098i = k0Var;
        cVar2.f8100k = true;
        fh.g c10 = cVar2.c(this.G, c8.g0.f(this.resourceProvider), false);
        this.H = c10;
        c10.r(org.telegram.messenger.g0.L(28.0f));
        this.H.q(org.telegram.messenger.g0.L(7.666f));
        this.G.setBackground(this.H);
        dh.c cVar3 = new dh.c(cVar, cVar, cVar);
        k0 k0Var2 = this.f49200b;
        cVar3.h = kVar;
        cVar3.f8098i = k0Var2;
        this.I = new View(context);
        dh.d dVar = new dh.d(cVar3.c(this.I, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.I.setBackground(dVar);
        this.f49200b.addView(this.I, c8.ja.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setOnClickListener(new bi.o(22));
        this.F.addView(this.G, c8.ja.e(-1, 72, 81));
        this.F.setClipToPadding(false);
        this.f49200b.addView(this.F, c8.ja.e(-1, -2, 80));
        ya1 ya1Var = new ya1(context);
        this.E = ya1Var;
        this.f49200b.addView(ya1Var, c8.ja.e(-1, -2, 80));
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26608a;
        Activity parentActivity = getParentActivity();
        ya1 ya1Var2 = this.E;
        if (((ApplicationLoaderImpl) t0Var).q()) {
            b51Var = new org.telegram.ui.Components.b51(parentActivity, ya1Var2);
        }
        this.f48300x = b51Var;
        if (b51Var != null) {
            b51Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.f49200b;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qh.b bVar;
        LaunchActivity launchActivity;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i7 != org.telegram.messenger.ns.G4 && i7 != org.telegram.messenger.ns.f25560r) {
            if (i7 == org.telegram.messenger.ns.R4) {
                org.telegram.ui.Components.b51 b51Var = this.f48300x;
                if (b51Var != null) {
                    b51Var.updateFileProgress(null);
                    this.f48300x.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.Y1) {
                String str = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.gz.f23959j1;
                if (tL_help_appUpdate != null && tL_help_appUpdate.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.Z1) {
                String str2 = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.gz.f23959j1;
                if (tL_help_appUpdate2 != null && tL_help_appUpdate2.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.X1) {
                org.telegram.ui.Components.b51 b51Var2 = this.f48300x;
                if (b51Var2 != null) {
                    b51Var2.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.Q4) {
                org.telegram.ui.Components.b51 b51Var3 = this.f48300x;
                if (b51Var3 != null && (launchActivity = LaunchActivity.H1) != null) {
                    int i11 = this.currentAccount;
                    if (launchActivity.f42630e0.size() == 1) {
                        z11 = true;
                    }
                    b51Var3.updateAppUpdateViews(i11, z11);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.f25578t4) {
                int currentPosition = this.f49201c.getCurrentPosition();
                SparseArray sparseArray = this.f49199a;
                int size = sparseArray.size();
                for (int i12 = 0; i12 < size; i12++) {
                    kb1 kb1Var = (kb1) sparseArray.valueAt(i12);
                    if (sparseArray.keyAt(i12) != currentPosition && kb1Var != null) {
                        kb1Var.f48620a.clearViews();
                    }
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.O5) {
                m0(getUserConfig().X, true);
                lb1 lb1Var = this.f49201c;
                if (lb1Var != null && lb1Var.getCurrentPosition() == 2) {
                    this.f49201c.C(0);
                    s0(0, true);
                    this.f48301y = true;
                    return;
                }
                b0(2);
                return;
            } else if (i7 == org.telegram.messenger.ns.f25517j0) {
                qh.b[] bVarArr = this.L;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i13 = this.currentAccount;
                    TLRPC.User a22 = org.telegram.messenger.np.s1(i13).a2(Long.valueOf(org.telegram.messenger.m10.i(i13).e()));
                    bVar.f55584c.f(a22, new org.telegram.ui.Components.t8(0, a22));
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.P5) {
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
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        org.telegram.ui.ActionBar.e2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f29382c;
    }

    public final void i0() {
        ui.f fVar;
        View view;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && (fVar = this.T) != null && (view = this.fragmentView) != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            k0();
            ri.r f10 = ri.q.f();
            if (!f10.f56143a) {
                fVar = null;
            } else if (!f10.f56144b || i7 < 33) {
                fVar = this.U;
            }
            if (fVar != null) {
                fVar.m(measuredWidth, measuredHeight);
                fVar.f58438c.a();
            }
        }
    }

    public final void j0() {
        float f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6);
        lb1 lb1Var = this.f49201c;
        if (lb1Var != null) {
            f10 = lb1Var.o(0);
        } else {
            f10 = 1.0f;
        }
        this.S.a(i0.a.f(f10, themedColor, themedColor2));
        View view = this.I;
        if (view != null) {
            view.invalidate();
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        View view2 = this.I;
        if (view2 != null) {
            view2.invalidate();
        }
        le0 le0Var = this.G;
        if (le0Var != null) {
            le0Var.invalidate();
        }
        qh.b[] bVarArr = this.L;
        if (bVarArr != null) {
            for (qh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        int i7;
        int height;
        if (Build.VERSION.SDK_INT >= 31 && this.T != null && this.f49200b != null) {
            ya1 ya1Var = this.E;
            if (ya1Var != null && ya1Var.a()) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            int height2 = (((this.f49200b.getHeight() - this.M) - i7) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(56.0f);
            SparseArray sparseArray = this.f49199a;
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.ActionBar.e2 e2Var = ((kb1) sparseArray.valueAt(i10)).f48620a;
                View view = e2Var.fragmentView;
                if (view != null && view.getWidth() > 0 && (e2Var instanceof ie0)) {
                    if (height2 >= view.getHeight()) {
                        e2Var.setParentGlass(null, null);
                    } else {
                        RectF rectF = this.W;
                        rectF.set(0.0f, height2 - org.telegram.messenger.g0.L(1.0f), view.getWidth(), org.telegram.messenger.g0.L(1.0f) + height);
                        e2Var.setParentGlass(rectF, this.X);
                    }
                }
            }
        }
    }

    public final void l0() {
        if (this.G != null && this.L[1] != null) {
            boolean w10 = org.telegram.messenger.g5.w();
            if (w10) {
                org.telegram.messenger.np.f1().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (org.telegram.messenger.m10.i(this.currentAccount).V && !w10 && org.telegram.messenger.np.f1().getBoolean("askAboutContacts2", true)) {
                this.L[1].e("!", true, true);
            } else {
                this.L[1].e(null, true, true);
            }
        }
    }

    public final void m0(boolean z10, boolean z11) {
        le0 le0Var = this.G;
        if (le0Var != null) {
            le0Var.i(this.L[2], !z10, z11);
            this.G.i(this.L[3], z10, z11);
        }
    }

    public final void n0() {
        int i7;
        lb1 lb1Var = this.f49201c;
        if (lb1Var != null && this.I != null) {
            float a10 = 1.0f - c8.i9.a(Math.abs(3.0f - lb1Var.getPositionAnimated()), 0.0f, 1.0f);
            float T1 = (1.0f - ((1.0f - org.telegram.messenger.g0.T1(0.0f, 1.0f, org.telegram.messenger.g0.R0(this.M))) * a10)) * this.f48299w.f57085e;
            this.I.setAlpha(T1);
            this.I.setTranslationY(a10 * org.telegram.messenger.g0.L(48.0f));
            View view = this.I;
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
        boolean z10;
        int i10 = 0;
        if (this.E.a()) {
            i7 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i7 = 0;
        }
        int i11 = -i7;
        float f10 = this.f48299w.f57085e;
        this.F.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(40.0f) + i11, i11));
        le0 le0Var = this.G;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        boolean z11 = true;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le0Var.setClickable(z10);
        le0 le0Var2 = this.G;
        if (i12 <= 0) {
            z11 = false;
        }
        le0Var2.setEnabled(z11);
        this.G.setAlpha(f10);
        le0 le0Var3 = this.G;
        if (f10 <= 0.0f) {
            i10 = 8;
        }
        le0Var3.setVisibility(i10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f49201c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f49201c.C(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.e2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        xi.e eVar = new xi.e(org.telegram.messenger.ns.f(this.currentAccount), this);
        eVar.c(org.telegram.messenger.ns.Y1);
        eVar.c(org.telegram.messenger.ns.X1);
        eVar.c(org.telegram.messenger.ns.Z1);
        eVar.c(org.telegram.messenger.ns.G4);
        eVar.c(org.telegram.messenger.ns.f25560r);
        eVar.c(org.telegram.messenger.ns.O5);
        eVar.c(org.telegram.messenger.ns.f25517j0);
        eVar.c(org.telegram.messenger.ns.P5);
        eVar.f(org.telegram.messenger.ns.Q4);
        eVar.f(org.telegram.messenger.ns.R4);
        eVar.f(org.telegram.messenger.ns.f25578t4);
        this.P = eVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.xb.h(this.f49200b);
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        hi.l3 l3Var = this.Q;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        j0();
        l0();
        p0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.c30.f33489r.c()) {
            org.telegram.messenger.g0.i3(new fe0(this, 8), 1500L);
        }
        this.R = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.e2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z10, f10);
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

    public final void p0(boolean z10) {
        if (this.G == null) {
            return;
        }
        int i7 = org.telegram.messenger.vr.a0(this.currentAccount).L;
        if (i7 > 0) {
            this.L[0].e(org.telegram.messenger.hd.E(i7, ','), false, z10);
            return;
        }
        this.L[0].e(null, false, z10);
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z10, z11);
        }
    }

    public final void q0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.m10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new me(26));
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
        if (org.telegram.messenger.m10.c() < 4) {
            H.c(2131232045, org.telegram.messenger.hd.M0(2131754484, null), new fe0(this, 1), false);
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
                Drawable a02 = org.telegram.ui.ActionBar.j6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.m10.i(intValue).f();
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.r(f10);
                hi.q3 q3Var = new hi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, c8.ja.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getParentActivity());
                if (z10) {
                    i9Var.setScaleX(0.833f);
                    i9Var.setScaleY(0.833f);
                }
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                i9Var.getImageReceiver().d = intValue;
                i9Var.f(f10, t8Var);
                q3Var.addView(i9Var, c8.ja.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, getResourceProvider());
                textView.setText(org.telegram.messenger.q10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ja.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.x2(this, intValue, H, 18));
                H.r(linearLayout, c8.ja.o(230, 48));
            }
        }
        H.f37113u = true;
        H.v = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
        H.W(d02);
        H.Z();
        org.telegram.ui.Components.c30.f33489r.a();
    }

    public final yw r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        yw ywVar = new yw(bundle);
        this.K = ywVar;
        ywVar.K3 = new f(this, 23);
        this.f49199a.put(0, new kb1(ywVar));
        return this.K;
    }

    public final void s0(int i7, boolean z10) {
        int i10;
        boolean z11;
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.L;
            if (i11 < bVarArr.length) {
                qh.b bVar = bVarArr[i11];
                if (i11 > 2) {
                    i10 = i11 - 1;
                } else {
                    i10 = i11;
                }
                if (i10 == i7) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void t0(boolean z10, float f10) {
        for (int i7 = 0; i7 < this.L.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i7 > 2 ? i7 - 1 : i7) - f10));
            qh.b bVar = this.L[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.G.invalidate();
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
