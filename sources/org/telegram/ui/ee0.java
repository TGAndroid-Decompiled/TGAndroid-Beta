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
public final class ee0 extends gb1 implements org.telegram.messenger.cs, qe.b {
    public sa1 E;
    public FrameLayout F;
    public ge0 G;
    public gh.g H;
    public View I;
    public Integer J;
    public uw K;
    public rh.b[] L;
    public int M;
    public int N;
    public int O;
    public za.p P;
    public gi.l3 Q;
    public boolean R;
    public final si.c S;
    public final si.f T;
    public final si.f U;
    public org.telegram.ui.Components.s41 f44972x;
    public boolean f44973y;
    public final qe.a f44971w = new qe.a(0, this, org.telegram.ui.Components.xq.h, 380, true);
    public final RectF V = new RectF();
    public final RectF W = new RectF();
    public final ae0 X = new ae0(this, 0);

    public ee0() {
        if (Build.VERSION.SDK_INT >= 31) {
            si.f fVar = new si.f(null);
            ba.i iVar = new ba.i(this, false);
            if (fVar.f54754c == null) {
                fVar.f54754c = new eh.i(fVar.f54753b, iVar);
            }
            this.T = fVar;
            si.f fVar2 = new si.f(null);
            ba.i iVar2 = new ba.i(this, true);
            if (fVar2.f54754c == null) {
                fVar2.f54754c = new eh.i(fVar2.f54753b, iVar2);
            }
            this.U = fVar2;
        } else {
            this.T = null;
            this.U = null;
        }
        this.S = new si.c();
        x8 x8Var = new x8(this, 5);
        setBulletinDelegate(x8Var);
        org.telegram.ui.Components.ac.a(this.f45621b, x8Var);
    }

    public static void d0(ee0 ee0Var, int i3, org.telegram.ui.Components.f60 f60Var) {
        if (ee0Var.currentAccount != i3) {
            f60Var.u();
            LaunchActivity launchActivity = LaunchActivity.K1;
            if (launchActivity != null) {
                launchActivity.O0(i3);
            }
        }
    }

    public static boolean e0(ee0 ee0Var, View view) {
        ArrayList T0;
        String str;
        int i3;
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
        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null && (T0 = ee0Var.getMessagesController().T0()) != null) {
            boolean z12 = true;
            if (T0.size() > 1) {
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                int i13 = 0;
                while (i13 < T0.size()) {
                    org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.get(i13);
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, ee0Var.getParentActivity(), ee0Var.getResourceProvider(), false, false);
                    y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), r22, org.telegram.messenger.g0.L(18.0f), r22);
                    if (moVar.e()) {
                        str = org.telegram.messenger.bd.M0(2131750808, null);
                    } else {
                        str = moVar.f24238b;
                    }
                    CharSequence m10 = org.telegram.messenger.i6.m(str, y0Var.getTextView().getPaint().getFontMetricsInt(), r22, null, r22);
                    if (!moVar.e()) {
                        m10 = org.telegram.messenger.zi.C5(m10, moVar.f24239c, y0Var.getTextView().getPaint().getFontMetricsInt(), r22);
                    }
                    if (moVar.e()) {
                        i3 = org.telegram.messenger.qr.a0(ee0Var.currentAccount).L;
                    } else {
                        i3 = moVar.d;
                    }
                    if (i3 > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                        int length = spannableStringBuilder2.length();
                        spannableStringBuilder2.append((CharSequence) String.valueOf(i3));
                        org.telegram.messenger.hp messagesController = ee0Var.getMessagesController();
                        if (moVar.e()) {
                            z10 = z12;
                            arrayList = messagesController.W0(r22);
                        } else {
                            z10 = z12;
                            arrayList = messagesController.f23169y;
                        }
                        int i14 = r22;
                        while (true) {
                            if (i14 < arrayList.size()) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i14);
                                if (!moVar.e()) {
                                    long j10 = dialog.f27005id;
                                    if (org.telegram.messenger.m5.C(j10)) {
                                        arrayList2 = arrayList;
                                        i10 = i13;
                                        TLRPC.EncryptedChat a12 = messagesController.a1(Integer.valueOf((int) (j10 & 4294967295L)));
                                        if (a12 != null) {
                                            j10 = a12.user_id;
                                        }
                                    } else {
                                        arrayList2 = arrayList;
                                        i10 = i13;
                                    }
                                    if (!moVar.c(ee0Var.getAccountInstance(), j10, dialog)) {
                                        continue;
                                        i14++;
                                        i13 = i10;
                                        arrayList = arrayList2;
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    i10 = i13;
                                }
                                if ((messagesController.V0(dialog) > 0 || dialog.unread_mark) && !messagesController.r2(dialog.f27005id, 0L, null)) {
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
                        spannableStringBuilder2.setSpan(new ce0(ee0Var, i3, z11), length, spannableStringBuilder2.length(), 33);
                        if (moVar.e()) {
                            str2 = org.telegram.messenger.bd.M0(2131750808, null);
                        } else {
                            str2 = moVar.f24238b;
                        }
                        String G = org.telegram.messenger.bd.G(i3, "AccDescrUnreadCount", new Object[0]);
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = str2;
                        charSequenceArr[z10 ? 1 : 0] = "\n";
                        charSequenceArr[2] = G;
                        y0Var.setContentDescription(TextUtils.concat(charSequenceArr));
                        spannableStringBuilder = spannableStringBuilder2;
                    } else {
                        z10 = z12;
                        i10 = i13;
                        spannableStringBuilder = m10;
                    }
                    if (moVar.f24248n) {
                        i11 = 26;
                    } else {
                        i11 = 0;
                    }
                    y0Var.setEmojiCacheType(i11);
                    if (ee0Var.getMessagesController().A7) {
                        i12 = moVar.f24247m;
                    } else {
                        i12 = -1;
                    }
                    y0Var.j(spannableStringBuilder, 0, new org.telegram.ui.Components.sz(ee0Var.getParentActivity(), 2131232156, i12));
                    y0Var.getTextView().setEmojiColor(ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    y0Var.setMinimumWidth(160);
                    y0Var.setOnClickListener(new a0(ee0Var, H, moVar, 11));
                    H.r(y0Var, b8.mf.o(-1, -2));
                    i13 = i10 + 1;
                    z12 = z10;
                    r22 = 0;
                }
                boolean z13 = z12;
                H.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                H.X = org.telegram.messenger.g0.L(400.0f);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                H.W(d02);
                H.f33729i = 3;
                H.Z();
                return z13;
            }
        }
        return false;
    }

    public static void f0(ee0 ee0Var) {
        org.telegram.messenger.h10 userConfig = ee0Var.getUserConfig();
        if (!userConfig.X) {
            userConfig.X = true;
            userConfig.v(false);
        }
        ee0Var.m0(true, true);
        org.telegram.messenger.hs.f(ee0Var.currentAccount).k(org.telegram.messenger.hs.O5, new Object[0]);
    }

    public static void g0(ee0 ee0Var) {
        ee0Var.getClass();
        int i3 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.h10.i(i10).p()) {
                i3++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.h10.o()) {
            i3--;
        }
        if (i3 > 0 && num != null) {
            ee0Var.presentFragment(new xd0(num.intValue()));
        } else if (!org.telegram.messenger.h10.o()) {
            ee0Var.showDialog(new vg.i0(7, ee0Var.currentAccount, ee0Var.getParentActivity(), ee0Var, null));
        }
    }

    public static void h0(ee0 ee0Var) {
        org.telegram.messenger.h10 userConfig = ee0Var.getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.v(false);
        }
        ee0Var.m0(false, true);
        org.telegram.messenger.hs.f(ee0Var.currentAccount).k(org.telegram.messenger.hs.O5, new Object[0]);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            o0();
            n0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d2 a0(int i3) {
        if (i3 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i3 == 2) {
            if (getUserConfig().X) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new h9(bundle2);
            }
            return new c31(a1.g.k("hasMainTabs", true));
        } else if (i3 == 0) {
            uw uwVar = new uw(a1.g.k("hasMainTabs", true));
            this.K = uwVar;
            uwVar.J3 = new f(this, 23);
            return uwVar;
        } else if (i3 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", org.telegram.messenger.h10.i(this.currentAccount).e());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27954h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null && c02.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i3;
        super.createView(context);
        ge0 ge0Var = new ge0(context, this.resourceProvider);
        this.G = ge0Var;
        ge0Var.setClipChildren(false);
        this.G.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.G.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        rh.b[] bVarArr = new rh.b[5];
        this.L = bVarArr;
        bVarArr[0] = rh.b.c(context, this.resourceProvider, rh.a.f54518n, 2131748715);
        this.L[1] = rh.b.c(context, this.resourceProvider, rh.a.f54517f, 2131748714);
        this.L[2] = rh.b.c(context, this.resourceProvider, rh.a.f54519r, 2131745505);
        this.L[3] = rh.b.c(context, this.resourceProvider, rh.a.h, 2131748716);
        rh.b[] bVarArr2 = this.L;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        rh.b bVar = new rh.b(context);
        org.telegram.ui.Components.s41 s41Var = null;
        bVar.f54528a.setText(org.telegram.messenger.bd.M0(2131748713, null));
        bVar.f54529b.setVisibility(8);
        TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(org.telegram.messenger.h10.i(i10).e()));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(0, a22);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.e(a22, u8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.f54530c = k9Var;
        bVar.addView(k9Var, b8.mf.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f54537x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, e6Var);
        bVar.f54535s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, e6Var);
        bVar.f54536w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, e6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.L[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ee0 f44030b;

            {
                this.f44030b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                ee0 ee0Var = this.f44030b;
                switch (i11) {
                    case 0:
                        return ee0.e0(ee0Var, view);
                    case 1:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H.c(2131232099, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                        H.f33749u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f33729i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H2.c(2131231770, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                        if (ee0Var.getUserConfig().X) {
                            H2.c(2131232053, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                        }
                        H2.f33749u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        ee0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ee0 f44030b;

            {
                this.f44030b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                ee0 ee0Var = this.f44030b;
                switch (i11) {
                    case 0:
                        return ee0.e0(ee0Var, view);
                    case 1:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H.c(2131232099, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                        H.f33749u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f33729i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H2.c(2131231770, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                        if (ee0Var.getUserConfig().X) {
                            H2.c(2131232053, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                        }
                        H2.f33749u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        ee0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ee0 f44030b;

            {
                this.f44030b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                ee0 ee0Var = this.f44030b;
                switch (i11) {
                    case 0:
                        return ee0.e0(ee0Var, view);
                    case 1:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H.c(2131232099, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                        H.f33749u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f33729i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H2.c(2131231770, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                        if (ee0Var.getUserConfig().X) {
                            H2.c(2131232053, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                        }
                        H2.f33749u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        ee0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ee0 f44030b;

            {
                this.f44030b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                ee0 ee0Var = this.f44030b;
                switch (i11) {
                    case 0:
                        return ee0.e0(ee0Var, view);
                    case 1:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H.c(2131232099, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                        H.c(2131232083, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                        H.f33749u = true;
                        H.v = true;
                        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        H.f33729i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H.W(d02);
                        H.Z();
                        return true;
                    case 2:
                        if (ee0Var.getParentActivity() == null || ee0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                        H2.c(2131231770, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                        if (ee0Var.getUserConfig().X) {
                            H2.c(2131232053, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, 3), false);
                        } else {
                            H2.c(2131231764, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                        }
                        H2.f33749u = true;
                        H2.v = true;
                        H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                        H2.W(d03);
                        H2.Z();
                        return true;
                    default:
                        ee0Var.q0(view);
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
            rh.b[] bVarArr3 = this.L;
            if (i11 >= bVarArr3.length) {
                break;
            }
            rh.b bVar2 = bVarArr3[i11];
            if (i11 > 2) {
                i3 = i11 - 1;
            } else {
                i3 = i11;
            }
            bVar2.setOnClickListener(new bi.q(this, i3, 25));
            this.G.addView(this.L[i11]);
            this.G.i(bVar2, true, false);
            i11++;
        }
        m0(getUserConfig().X, false);
        s0(this.f45622c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6);
        si.c cVar = this.S;
        cVar.a(themedColor);
        kh.k kVar = new kh.k(this.f45621b);
        si.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        si.a aVar2 = this.U;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        eh.c cVar2 = new eh.c(aVar, aVar2, cVar);
        l0 l0Var = this.f45621b;
        cVar2.h = kVar;
        cVar2.f9986i = l0Var;
        cVar2.f9988k = true;
        gh.g c2 = cVar2.c(this.G, b8.cd.f(this.resourceProvider), false);
        this.H = c2;
        c2.r(org.telegram.messenger.g0.L(28.0f));
        this.H.q(org.telegram.messenger.g0.L(7.666f));
        this.G.setBackground(this.H);
        eh.c cVar3 = new eh.c(cVar, cVar, cVar);
        l0 l0Var2 = this.f45621b;
        cVar3.h = kVar;
        cVar3.f9986i = l0Var2;
        this.I = new View(context);
        eh.d dVar = new eh.d(cVar3.c(this.I, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.I.setBackground(dVar);
        this.f45621b.addView(this.I, b8.mf.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setOnClickListener(new ai.t(25));
        this.F.addView(this.G, b8.mf.e(-1, 72, 81));
        this.F.setClipToPadding(false);
        this.f45621b.addView(this.F, b8.mf.e(-1, -2, 80));
        sa1 sa1Var = new sa1(context);
        this.E = sa1Var;
        this.f45621b.addView(sa1Var, b8.mf.e(-1, -2, 80));
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25456a;
        Activity parentActivity = getParentActivity();
        sa1 sa1Var2 = this.E;
        if (((ApplicationLoaderImpl) t0Var).q()) {
            s41Var = new org.telegram.ui.Components.s41(parentActivity, sa1Var2);
        }
        this.f44972x = s41Var;
        if (s41Var != null) {
            s41Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.f45621b;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        rh.b bVar;
        LaunchActivity launchActivity;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i3 != org.telegram.messenger.hs.G4 && i3 != org.telegram.messenger.hs.f23292r) {
            if (i3 == org.telegram.messenger.hs.R4) {
                org.telegram.ui.Components.s41 s41Var = this.f44972x;
                if (s41Var != null) {
                    s41Var.updateFileProgress(null);
                    this.f44972x.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.Y1) {
                String str = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.az.f21639j1;
                if (tL_help_appUpdate != null && tL_help_appUpdate.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.Z1) {
                String str2 = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.az.f21639j1;
                if (tL_help_appUpdate2 != null && tL_help_appUpdate2.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.X1) {
                org.telegram.ui.Components.s41 s41Var2 = this.f44972x;
                if (s41Var2 != null) {
                    s41Var2.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.Q4) {
                org.telegram.ui.Components.s41 s41Var3 = this.f44972x;
                if (s41Var3 != null && (launchActivity = LaunchActivity.K1) != null) {
                    int i11 = this.currentAccount;
                    if (launchActivity.f41291e0.size() == 1) {
                        z11 = true;
                    }
                    s41Var3.updateAppUpdateViews(i11, z11);
                    return;
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.f23310t4) {
                int currentPosition = this.f45622c.getCurrentPosition();
                SparseArray sparseArray = this.f45620a;
                int size = sparseArray.size();
                for (int i12 = 0; i12 < size; i12++) {
                    eb1 eb1Var = (eb1) sparseArray.valueAt(i12);
                    if (sparseArray.keyAt(i12) != currentPosition && eb1Var != null) {
                        eb1Var.f44954a.clearViews();
                    }
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.O5) {
                m0(getUserConfig().X, true);
                fb1 fb1Var = this.f45622c;
                if (fb1Var != null && fb1Var.getCurrentPosition() == 2) {
                    this.f45622c.D(0);
                    s0(0, true);
                    this.f44973y = true;
                    return;
                }
                b0(2);
                return;
            } else if (i3 == org.telegram.messenger.hs.f23248j0) {
                rh.b[] bVarArr = this.L;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i13 = this.currentAccount;
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(i13).a2(Long.valueOf(org.telegram.messenger.h10.i(i13).e()));
                    bVar.f54530c.e(a22, new org.telegram.ui.Components.u8(0, a22));
                    return;
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.P5) {
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
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f28339c;
    }

    public final void i0() {
        si.f fVar;
        View view;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && (fVar = this.T) != null && (view = this.fragmentView) != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            k0();
            pi.r f10 = pi.q.f();
            if (!f10.f53625a) {
                fVar = null;
            } else if (!f10.f53626b || i3 < 33) {
                fVar = this.U;
            }
            if (fVar != null) {
                fVar.n(measuredWidth, measuredHeight);
                fVar.f54754c.a();
            }
        }
    }

    public final void j0() {
        float f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6);
        fb1 fb1Var = this.f45622c;
        if (fb1Var != null) {
            f10 = fb1Var.p(0);
        } else {
            f10 = 1.0f;
        }
        this.S.a(i0.a.f(f10, themedColor, themedColor2));
        View view = this.I;
        if (view != null) {
            view.invalidate();
        }
        gh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        View view2 = this.I;
        if (view2 != null) {
            view2.invalidate();
        }
        ge0 ge0Var = this.G;
        if (ge0Var != null) {
            ge0Var.invalidate();
        }
        rh.b[] bVarArr = this.L;
        if (bVarArr != null) {
            for (rh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        int i3;
        int height;
        if (Build.VERSION.SDK_INT >= 31 && this.T != null && this.f45621b != null) {
            sa1 sa1Var = this.E;
            if (sa1Var != null && sa1Var.a()) {
                i3 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i3 = 0;
            }
            int height2 = (((this.f45621b.getHeight() - this.M) - i3) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(56.0f);
            SparseArray sparseArray = this.f45620a;
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.ActionBar.d2 d2Var = ((eb1) sparseArray.valueAt(i10)).f44954a;
                View view = d2Var.fragmentView;
                if (view != null && view.getWidth() > 0 && (d2Var instanceof de0)) {
                    if (height2 >= view.getHeight()) {
                        d2Var.setParentGlass(null, null);
                    } else {
                        RectF rectF = this.W;
                        rectF.set(0.0f, height2 - org.telegram.messenger.g0.L(1.0f), view.getWidth(), org.telegram.messenger.g0.L(1.0f) + height);
                        d2Var.setParentGlass(rectF, this.X);
                    }
                }
            }
        }
    }

    public final void l0() {
        if (this.G != null && this.L[1] != null) {
            boolean w10 = org.telegram.messenger.g5.w();
            if (w10) {
                org.telegram.messenger.hp.f1().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (org.telegram.messenger.h10.i(this.currentAccount).V && !w10 && org.telegram.messenger.hp.f1().getBoolean("askAboutContacts2", true)) {
                this.L[1].e("!", true, true);
            } else {
                this.L[1].e(null, true, true);
            }
        }
    }

    public final void m0(boolean z10, boolean z11) {
        ge0 ge0Var = this.G;
        if (ge0Var != null) {
            ge0Var.i(this.L[2], !z10, z11);
            this.G.i(this.L[3], z10, z11);
        }
    }

    public final void n0() {
        int i3;
        fb1 fb1Var = this.f45622c;
        if (fb1Var != null && this.I != null) {
            float a10 = 1.0f - b8.be.a(Math.abs(3.0f - fb1Var.getPositionAnimated()), 0.0f, 1.0f);
            float T1 = (1.0f - ((1.0f - org.telegram.messenger.g0.T1(0.0f, 1.0f, org.telegram.messenger.g0.R0(this.M))) * a10)) * this.f44971w.f53840e;
            this.I.setAlpha(T1);
            this.I.setTranslationY(a10 * org.telegram.messenger.g0.L(48.0f));
            View view = this.I;
            if (T1 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
    }

    public final void o0() {
        int i3;
        boolean z10;
        int i10 = 0;
        if (this.E.a()) {
            i3 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i3 = 0;
        }
        int i11 = -i3;
        float f10 = this.f44971w.f53840e;
        this.F.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(40.0f) + i11, i11));
        ge0 ge0Var = this.G;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        boolean z11 = true;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ge0Var.setClickable(z10);
        ge0 ge0Var2 = this.G;
        if (i12 <= 0) {
            z11 = false;
        }
        ge0Var2.setEnabled(z11);
        this.G.setAlpha(f10);
        ge0 ge0Var3 = this.G;
        if (f10 <= 0.0f) {
            i10 = 8;
        }
        ge0Var3.setVisibility(i10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f45622c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f45622c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        za.p pVar = new za.p(org.telegram.messenger.hs.f(this.currentAccount), this);
        pVar.b(org.telegram.messenger.hs.Y1);
        pVar.b(org.telegram.messenger.hs.X1);
        pVar.b(org.telegram.messenger.hs.Z1);
        pVar.b(org.telegram.messenger.hs.G4);
        pVar.b(org.telegram.messenger.hs.f23292r);
        pVar.b(org.telegram.messenger.hs.O5);
        pVar.b(org.telegram.messenger.hs.f23248j0);
        pVar.b(org.telegram.messenger.hs.P5);
        pVar.d(org.telegram.messenger.hs.Q4);
        pVar.d(org.telegram.messenger.hs.R4);
        pVar.d(org.telegram.messenger.hs.f23310t4);
        this.P = pVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.ac.h(this.f45621b);
        za.p pVar = this.P;
        if (pVar != null) {
            pVar.a();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        gi.l3 l3Var = this.Q;
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
        if (this.Q == null && org.telegram.ui.Components.v20.f38964r.c()) {
            org.telegram.messenger.g0.i3(new ae0(this, 8), 1500L);
        }
        this.R = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.d2 c02 = c0();
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
        int i3 = org.telegram.messenger.qr.a0(this.currentAccount).L;
        if (i3 > 0) {
            this.L[0].e(org.telegram.messenger.bd.E(i3, ','), false, z10);
            return;
        }
        this.L[0].e(null, false, z10);
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z10, z11);
        }
    }

    public final void q0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i3 = 0; i3 < 4; i3++) {
            if (org.telegram.messenger.h10.i(i3).p()) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(14));
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
        if (org.telegram.messenger.h10.c() < 4) {
            H.c(2131232044, org.telegram.messenger.bd.M0(2131754484, null), new ae0(this, 1), false);
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
                int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
                Drawable a02 = org.telegram.ui.ActionBar.k6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.h10.i(intValue).f();
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.r(f10);
                gi.q3 q3Var = new gi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, b8.mf.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
                if (z10) {
                    k9Var.setScaleX(0.833f);
                    k9Var.setScaleY(0.833f);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().d = intValue;
                k9Var.e(f10, u8Var);
                q3Var.addView(k9Var, b8.mf.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, getResourceProvider());
                textView.setText(org.telegram.messenger.l10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, b8.mf.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ai.h3(this, intValue, H, 17));
                H.r(linearLayout, b8.mf.o(230, 48));
            }
        }
        H.f33749u = true;
        H.v = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
        H.W(d02);
        H.Z();
        org.telegram.ui.Components.v20.f38964r.a();
    }

    public final uw r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        uw uwVar = new uw(bundle);
        this.K = uwVar;
        uwVar.J3 = new f(this, 23);
        this.f45620a.put(0, new eb1(uwVar));
        return this.K;
    }

    public final void s0(int i3, boolean z10) {
        int i10;
        boolean z11;
        int i11 = 0;
        while (true) {
            rh.b[] bVarArr = this.L;
            if (i11 < bVarArr.length) {
                rh.b bVar = bVarArr[i11];
                if (i11 > 2) {
                    i10 = i11 - 1;
                } else {
                    i10 = i11;
                }
                if (i10 == i3) {
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
        for (int i3 = 0; i3 < this.L.length; i3++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i3 > 2 ? i3 - 1 : i3) - f10));
            rh.b bVar = this.L[i3];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.G.invalidate();
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
