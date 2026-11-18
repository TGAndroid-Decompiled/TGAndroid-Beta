package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i9 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, le0 {
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.cs I;
    public FrameLayout J;
    public x8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public xi.e O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public di.n4 f48651a;
    public v4.c0 f48652b;
    public org.telegram.ui.Components.e51 f48653c;
    public View d;
    public org.telegram.ui.ActionBar.l5 f48654e;
    public org.telegram.ui.Components.a10 f48655f;
    public org.telegram.ui.Components.wz h;
    public v8 f48656n;
    public boolean f48657r;
    public boolean f48658s;
    public org.telegram.ui.ActionBar.h5 f48659w;
    public final ArrayList f48660x;
    public boolean f48661y;

    public i9() {
        this(null);
    }

    public static void Z(org.telegram.ui.i9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i9.Z(org.telegram.ui.i9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void a0(i9 i9Var, org.telegram.ui.Components.l41 l41Var, View view) {
        int i7 = l41Var.d;
        if (i7 == 2) {
            i9Var.m0(true);
            org.telegram.ui.Components.gc J = org.telegram.ui.Components.lc.b0(i9Var).J(2131623990, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749266, null)), org.telegram.messenger.gd.M0(2131743648, null), 5000, true, new m8(i9Var, 0));
            J.f35461j = 5000;
            J.j();
        } else if (i7 == 1) {
            l0(i9Var);
        } else {
            Object obj = l41Var.H;
            boolean z10 = obj instanceof f9;
            int i10 = org.telegram.messenger.ks.f25190t;
            if (z10) {
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f47574c;
                if (i9Var.simpleActionBar.x()) {
                    i9Var.f0(arrayList, (e9) view);
                } else if (f9Var.f47572a != 0 && !arrayList.isEmpty()) {
                    boolean z11 = f9Var.f47575e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = f9Var.f47573b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f28552id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f28424id;
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, i9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i9Var.getMessagesController().S6;
                    u1Var.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, u1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), 0));
                    u1Var.r(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", org.telegram.messenger.fj.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f28424id);
                    i9Var.getNotificationCenter().k(i10, new Object[0]);
                    i9Var.presentFragment(new bn(bundle), i9Var.f48657r);
                }
            } else if (view instanceof h9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((h9) view).f48220c.f28403id);
                i9Var.getNotificationCenter().k(i10, new Object[0]);
                i9Var.presentFragment(new bn(bundle2), i9Var.f48657r);
            }
        }
    }

    public static void b0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().f4(groupcall.users, false);
            i9Var.getMessagesController().Z3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.b2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.lc.b0(i9Var).g0(tL_error, false);
        }
    }

    public static void c0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().f4(groupcall.users, false);
            i9Var.getMessagesController().Z3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.b2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.lc.b0(i9Var).g0(tL_error, false);
        }
    }

    public static void e0(i9 i9Var, boolean z10) {
        int i7;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9Var.getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        if (z10) {
            u1Var.S = org.telegram.messenger.gd.M0(2131751578, null);
            u1Var.U = org.telegram.messenger.gd.M0(2131751577, null);
        } else {
            u1Var.S = org.telegram.messenger.gd.M0(2131751548, null);
            u1Var.U = org.telegram.messenger.gd.M0(2131751488, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(i9Var.getParentActivity());
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(i9Var.getParentActivity(), 1);
        d2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        d2Var.e(org.telegram.messenger.gd.M0(2131751547, null), "", false, false, false);
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.gd.f24213a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        d2Var.setPadding(i7, 0, L, 0);
        frameLayout.addView(d2Var, c8.ma.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        d2Var.setOnClickListener(new k8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ab.j(i9Var, z10, zArr, 3));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        i9Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.h2 h2Var) {
        h2Var.presentFragment(new c9(a8.p0.k("isCall", true), h2Var.getCurrentAccount(), h2Var));
    }

    public static void n0(final Context context, int i7, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.i6 i6Var, boolean z10, final boolean z11) {
        String str2;
        int i10;
        int i11 = org.telegram.ui.ActionBar.n6.f29467h5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        final org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, context, i6Var, false);
        x2Var.v0(w02);
        x2Var.P(w02);
        x2Var.w0(i11);
        x2Var.Q(i11);
        final String[] strArr = {str};
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, c8.ma.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232768);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ma.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, i6Var);
        frameLayout.addView(frameLayout2, c8.ma.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231244);
        int i13 = org.telegram.ui.ActionBar.n6.f29786y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView2, i13, i6Var, mode);
        int i14 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        if (z11) {
            frameLayout.addView(imageView2, c8.ma.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.Components.k80 a10 = c8.va.a(context, 20.0f, i15, true, i6Var);
        a10.setText(org.telegram.messenger.gd.M0(2131749280, null));
        a10.setGravity(17);
        g10.addView(a10, c8.ma.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.k80 a11 = c8.va.a(context, 14.0f, i15, false, i6Var);
        a11.setText(org.telegram.messenger.gd.M0(2131749281, null));
        a11.setGravity(17);
        a11.setMaxWidth(hi.m3.a(a11.getText(), a11.getPaint()));
        g10.addView(a11, c8.ma.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        c8.ra.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.n6.f29337a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(org.telegram.ui.ActionBar.n6.w0(i16, i6Var), org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i16, i6Var), org.telegram.ui.ActionBar.n6.w0(i14, i6Var)), 12, 12);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i16);
        org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.u6.j(frameLayout3, b02, M3, p10, i6Var);
        g10.addView(frameLayout3, c8.ma.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.k80 a12 = c8.va.a(context, 13.0f, i15, false, i6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(str2);
        frameLayout3.addView(a12, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231244));
        imageView3.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.f29652r5, i6Var, mode);
        frameLayout3.addView(imageView3, c8.ma.e(40, 48, 21));
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        g10.addView(g11, c8.ma.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        hi.d dVar = new hi.d(context, i6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131749288, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(2131232106, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        g11.addView(dVar, c8.ma.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        hi.d dVar2 = new hi.d(context, i6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.M0(2131749282, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lq(2131232366, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        g11.addView(dVar2, c8.ma.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.x2[] x2VarArr = new org.telegram.ui.ActionBar.x2[1];
        if (z10) {
            z8 z8Var = new z8(context, i6Var);
            z8Var.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(z8Var, org.telegram.ui.ActionBar.n6.f29805z6, i6Var);
            z8Var.setText(" " + org.telegram.messenger.gd.M0(2131749287, null) + " ");
            z8Var.setTextSize(14.0f);
            g10.addView(z8Var, c8.ma.t(190, -2, 1, 28, 12, 28, 8));
            i10 = i7;
            b0 b0Var = new b0(str, i10, x2VarArr);
            org.telegram.ui.Components.k80 a13 = c8.va.a(context, 14.0f, i15, false, i6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131749286, null), b0Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(hi.m3.a(a13.getText(), a13.getPaint()));
            g10.addView(a13, c8.ma.t(-1, -2, 17, 32, 8, 32, 12));
            c8.ra.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(b0Var, 8));
        } else {
            i10 = i7;
        }
        x2Var.O = g10;
        x2Var.show();
        x2VarArr[0] = x2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                }
                org.telegram.messenger.n10.t(null, 2131748729, lcVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                }
                org.telegram.messenger.n10.t(null, 2131748729, lcVar);
            }
        });
        final bi.c5 c5Var = new bi.c5(i10, frameLayout3, inputGroupCall, x2Var, i6Var, a12, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.x2 x2Var2 = org.telegram.ui.ActionBar.x2.this;
                org.telegram.ui.ActionBar.n2 n2Var = x2Var2.f30193c;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.Components.y60 G = org.telegram.ui.Components.y60.G(n2Var, i6Var2, frameLayout3);
                String M0 = org.telegram.messenger.gd.M0(2131751756, null);
                String[] strArr2 = strArr;
                G.c(2131232105, M0, new o1(strArr2, x2Var2, i6Var2, 7), false);
                G.c(2131232322, org.telegram.messenger.gd.M0(2131750456, null), new oi.s2(28, context, strArr2), false);
                G.m(2131232110, c5Var, org.telegram.messenger.gd.M0(2131745828, null), z11, true);
                G.a0();
            }
        });
        dVar2.setOnClickListener(new fi.d0(context, str, strArr, i6Var, x2Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new bi.m6(x2Var, i6Var, imageView2, c5Var, 6));
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56717a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29654r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29614p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29808z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29377c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        if (!this.f48658s) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752585, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 1));
        org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(10, 2131231244);
        this.f48659w = b10;
        b10.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        org.telegram.ui.ActionBar.z0 e10 = this.f48659w.e(3, 2131232110, org.telegram.messenger.gd.M0(2131751578, null));
        int i10 = org.telegram.ui.ActionBar.n6.f29615p7;
        e10.d(getThemedColor(i10), getThemedColor(i10));
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(this, new a5(this, 1), new u8(this), new u8(this));
        this.f48653c = e51Var;
        e51Var.setCaptureSectionsDecoratorAllowed(true);
        this.f48653c.r1();
        this.f48653c.setSectionsDrawBackground(true);
        this.f48653c.f34607g3.f42809r = false;
        v8 v8Var = new v8(0, context, this);
        this.f48656n = v8Var;
        this.fragmentView = v8Var;
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        this.h = wzVar;
        wzVar.setViewType(8);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, this.h, null);
        this.h.f41829x = false;
        this.f48651a = new di.n4(this, context, this.h);
        this.f48653c.setClipToPadding(false);
        this.f48653c.setEmptyView(this.f48651a);
        org.telegram.ui.Components.e51 e51Var2 = this.f48653c;
        v4.c0 c0Var = new v4.c0(1, false);
        this.f48652b = c0Var;
        e51Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.e51 e51Var3 = this.f48653c;
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        e51Var3.setVerticalScrollbarPosition(i7);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(this.f48653c, this.f48652b);
        this.f48654e = l5Var;
        ri.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        l5Var.f29203n = new w0(qVar, 12);
        this.f48656n.addView(this.f48653c, c8.ma.e(-1, -1, 3));
        this.f48656n.addView(this.f48651a, c8.ma.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.f48656n.addView(this.d, c8.ma.e(-1, 0, 48));
        this.f48653c.setOnScrollListener(new w8(this));
        if (this.f48661y) {
            this.f48651a.d();
        } else {
            this.f48651a.e();
        }
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.f48655f = a10Var;
        a10Var.f33212c.setImageResource(2131231090);
        this.f48655f.setContentDescription(org.telegram.messenger.gd.M0(2131752623, null));
        this.f48655f.setOnClickListener(new l8(this, 1));
        this.f48656n.addView(this.f48655f, org.telegram.ui.Components.a10.b());
        org.telegram.ui.Components.cs csVar = new org.telegram.ui.Components.cs(context);
        this.I = csVar;
        csVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new m8(this, 1));
        org.telegram.ui.Components.cs csVar2 = this.I;
        fh.g c10 = getBaseSimpleGlass().f56616c.c(this.I, null, false);
        c10.p(c8.i0.o(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(24.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        csVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.j(this.J, true, false);
        x8 x8Var = new x8(this, context, this, this.f48656n, this.resourceProvider);
        this.K = x8Var;
        this.J.addView(x8Var);
        this.I.setCallFragmentContextView(this.K);
        this.f48656n.addView(this.I, c8.ma.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.f48656n.addView(this.simpleActionBar);
        setBulletinDelegate(new y8(this, 0));
        if (this.f48658s) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.i0.f56244a;
            r0.a0.i(view2, u8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void f0(ArrayList arrayList, e9 e9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean k02 = k0(arrayList);
        ArrayList arrayList2 = this.H;
        if (k02) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f28424id));
            }
            org.telegram.ui.Components.mp mpVar = e9Var.f47137e;
            if (mpVar != null) {
                mpVar.a(false, true);
            }
            o0();
            return;
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f28424id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.mp mpVar2 = e9Var.f47137e;
        if (mpVar2 != null) {
            mpVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f48655f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f48653c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48653c, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29468h6));
        org.telegram.ui.Components.a10 a10Var = this.f48655f;
        if (a10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(a10Var.f33212c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48655f.f33212c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48655f.f33212c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.e51 e51Var = this.f48653c;
        i0.b bVar = this.mSystemInsets;
        ri.a.e(e51Var, bVar.f15890b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.I.d(org.telegram.messenger.g0.L(7.0f))), this.P);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15890b + ((int) this.I.d(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (ri.a.d(this.mSystemInsets.f15890b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.f48651a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15890b;
        this.f48651a.setPadding(0, 0, 0, this.S + this.P);
    }

    public final void i0(int i7, int i10) {
        if (this.f48661y) {
            return;
        }
        this.f48661y = true;
        di.n4 n4Var = this.f48651a;
        if (n4Var != null && !this.E) {
            n4Var.d();
        }
        org.telegram.ui.Components.e51 e51Var = this.f48653c;
        if (e51Var != null) {
            e51Var.f34607g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f28514q = "";
        tL_messages_search.offset_id = i7;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.mp mpVar;
        this.simpleActionBar.w();
        this.H.clear();
        int childCount = this.f48653c.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f48653c.getChildAt(i7);
            if ((childAt instanceof e9) && (mpVar = ((e9) childAt).f47137e) != null) {
                mpVar.a(false, z10);
            }
        }
        this.f48653c.f34607g3.O(true);
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56717a) {
            return baseSimpleGlass.f56620i;
        }
        return null;
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f28424id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().X) {
            return;
        }
        org.telegram.messenger.j10 userConfig = getUserConfig();
        if (userConfig.X != z10) {
            userConfig.X = z10;
            userConfig.v(false);
        }
        this.f48653c.f34607g3.O(true);
        org.telegram.messenger.ks.f(this.currentAccount).k(org.telegram.messenger.ks.R5, new Object[0]);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z10;
        boolean x10 = this.simpleActionBar.x();
        ArrayList arrayList = this.H;
        if (x10) {
            z10 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
            if (a5Var.f28765e == null) {
                a5Var.q().d(2, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
            }
            this.simpleActionBar.J();
            z10 = false;
        }
        this.simpleActionBar.E(arrayList.size(), z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.x()) {
            if (z10) {
                j0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        super.onFragmentCreate();
        int i10 = 0;
        i0(0, 50);
        org.telegram.messenger.mp messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        xi.e eVar = this.O;
        if (eVar != null) {
            eVar.b();
            this.O = null;
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ks.f25210w);
        eVar2.c(org.telegram.messenger.ks.A2);
        eVar2.c(org.telegram.messenger.ks.T);
        eVar2.c(org.telegram.messenger.ks.f25213w2);
        this.O = eVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f48657r = bundle.getBoolean("needFinishFragment", true);
            this.f48658s = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f48658s) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.P = i7;
        if (this.f48658s) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.Q = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.O;
        if (eVar != null) {
            eVar.b();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.S = i12;
        h0();
        g0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i7 != 101 && i7 != 102 && i7 != 103) {
            return;
        }
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (iArr[i10] != 0) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        TLRPC.UserFull userFull = null;
        if (iArr.length > 0 && z10) {
            if (i7 == 103) {
                org.telegram.ui.Components.voip.b2.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().d2(this.L.f28552id);
            }
            TLRPC.User user = this.L;
            if (i7 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i7 != 102 && (userFull == null || !userFull.video_calls_available)) {
                z12 = false;
            } else {
                z12 = true;
            }
            org.telegram.ui.Components.voip.b2.m(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.b2.h(getParentActivity(), null, i7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.e51 e51Var = this.f48653c;
        if (e51Var != null) {
            e51Var.f34607g3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.e51 e51Var = this.f48653c;
            if (e51Var != null) {
                int childCount = e51Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f48653c.getChildAt(i7);
                    if (childAt instanceof e9) {
                        ((e9) childAt).d.y(0);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.f48652b.L0() < 15) {
            this.f48653c.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f48654e;
        l5Var.f29199b = 1;
        l5Var.k(0, 0, false, false);
    }

    public i9(Bundle bundle) {
        super(bundle);
        this.f48657r = true;
        this.f48660x = new ArrayList();
        this.H = new ArrayList();
    }
}
