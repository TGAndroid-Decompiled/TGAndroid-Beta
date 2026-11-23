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
public final class j9 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, le0 {
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.es I;
    public FrameLayout J;
    public y8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public xi.e O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public di.n4 f48933a;
    public v4.c0 f48934b;
    public org.telegram.ui.Components.h51 f48935c;
    public View d;
    public org.telegram.ui.ActionBar.k5 f48936e;
    public org.telegram.ui.Components.c10 f48937f;
    public org.telegram.ui.Components.yz h;
    public w8 f48938n;
    public boolean f48939r;
    public boolean f48940s;
    public org.telegram.ui.ActionBar.g5 f48941w;
    public final ArrayList f48942x;
    public boolean f48943y;

    public j9() {
        this(null);
    }

    public static void Z(org.telegram.ui.j9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j9.Z(org.telegram.ui.j9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void a0(j9 j9Var, org.telegram.ui.Components.o41 o41Var, View view) {
        int i7 = o41Var.d;
        if (i7 == 2) {
            j9Var.m0(true);
            org.telegram.ui.Components.gc J = org.telegram.ui.Components.lc.b0(j9Var).J(2131623990, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131749265, null)), org.telegram.messenger.hd.N0(2131743640, null), 5000, true, new m8(j9Var, 0));
            J.f35527j = 5000;
            J.j();
        } else if (i7 == 1) {
            l0(j9Var);
        } else {
            Object obj = o41Var.H;
            boolean z10 = obj instanceof g9;
            int i10 = org.telegram.messenger.ls.f25384t;
            if (z10) {
                g9 g9Var = (g9) obj;
                ArrayList arrayList = g9Var.f48013c;
                if (j9Var.simpleActionBar.x()) {
                    j9Var.f0(arrayList, (f9) view);
                } else if (g9Var.f48011a != 0 && !arrayList.isEmpty()) {
                    boolean z11 = g9Var.f48014e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = g9Var.f48012b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f28583id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f28455id;
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, j9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = j9Var.getMessagesController().S6;
                    t1Var.setOnCancelListener(new o8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(j9Var, t1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), 0));
                    t1Var.r(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", org.telegram.messenger.gj.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f28455id);
                    j9Var.getNotificationCenter().k(i10, new Object[0]);
                    j9Var.presentFragment(new bn(bundle), j9Var.f48939r);
                }
            } else if (view instanceof i9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((i9) view).f48695c.f28434id);
                j9Var.getNotificationCenter().k(i10, new Object[0]);
                j9Var.presentFragment(new bn(bundle2), j9Var.f48939r);
            }
        }
    }

    public static void b0(j9 j9Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        t1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().f4(groupcall.users, false);
            j9Var.getMessagesController().Z3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new ws(j9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.b2.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new ws(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.lc.b0(j9Var).g0(tL_error, false);
        }
    }

    public static void c0(j9 j9Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        t1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().f4(groupcall.users, false);
            j9Var.getMessagesController().Z3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new ws(j9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.b2.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new ws(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.lc.b0(j9Var).g0(tL_error, false);
        }
    }

    public static void e0(j9 j9Var, boolean z10) {
        int i7;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j9Var.getParentActivity());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.N0(2131751577, null);
            t1Var.U = org.telegram.messenger.hd.N0(2131751576, null);
        } else {
            t1Var.S = org.telegram.messenger.hd.N0(2131751547, null);
            t1Var.U = org.telegram.messenger.hd.N0(2131751487, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(j9Var.getParentActivity());
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(j9Var.getParentActivity(), 1);
        d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
        d2Var.e(org.telegram.messenger.hd.N0(2131751546, null), "", false, false, false);
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.hd.f24444a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        d2Var.setPadding(i7, 0, L, 0);
        frameLayout.addView(d2Var, c8.ma.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        d2Var.setOnClickListener(new k8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ab.j(j9Var, z10, zArr, 3));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        j9Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.g2 g2Var) {
        g2Var.presentFragment(new d9(a8.p0.k("isCall", true), g2Var.getCurrentAccount(), g2Var));
    }

    public static void n0(final Context context, int i7, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.h6 h6Var, boolean z10, final boolean z11) {
        String str2;
        int i10;
        int i11 = org.telegram.ui.ActionBar.m6.f29454h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        final org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
        w2Var.v0(w02);
        w2Var.P(w02);
        w2Var.w0(i11);
        w2Var.Q(i11);
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
        int i12 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, h6Var);
        frameLayout.addView(frameLayout2, c8.ma.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231244);
        int i13 = org.telegram.ui.ActionBar.m6.f29773y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView2, i13, h6Var, mode);
        int i14 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        if (z11) {
            frameLayout.addView(imageView2, c8.ma.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.Components.m80 a10 = c8.va.a(context, 20.0f, i15, true, h6Var);
        a10.setText(org.telegram.messenger.hd.N0(2131749279, null));
        a10.setGravity(17);
        g10.addView(a10, c8.ma.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.m80 a11 = c8.va.a(context, 14.0f, i15, false, h6Var);
        a11.setText(org.telegram.messenger.hd.N0(2131749280, null));
        a11.setGravity(17);
        a11.setMaxWidth(hi.l3.a(a11.getText(), a11.getPaint()));
        g10.addView(a11, c8.ma.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        c8.ra.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.m6.f29324a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(org.telegram.ui.ActionBar.m6.w0(i16, h6Var), org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(i16, h6Var), org.telegram.ui.ActionBar.m6.w0(i14, h6Var)), 12, 12);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i16);
        org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.t6.j(frameLayout3, b02, M3, p10, h6Var);
        g10.addView(frameLayout3, c8.ma.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.m80 a12 = c8.va.a(context, 13.0f, i15, false, h6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(str2);
        frameLayout3.addView(a12, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231244));
        imageView3.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.f29639r5, h6Var, mode);
        frameLayout3.addView(imageView3, c8.ma.e(40, 48, 21));
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        g10.addView(g11, c8.ma.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        hi.e eVar = new hi.e(context, h6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131749287, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(2131232106, 0), 0, 1, 33);
        eVar.i(spannableStringBuilder, false, true);
        g11.addView(eVar, c8.ma.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        hi.e eVar2 = new hi.e(context, h6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131749281, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(2131232366, 0), 0, 1, 33);
        eVar2.i(spannableStringBuilder2, false, true);
        g11.addView(eVar2, c8.ma.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.w2[] w2VarArr = new org.telegram.ui.ActionBar.w2[1];
        if (z10) {
            a9 a9Var = new a9(context, h6Var);
            a9Var.setGravity(17);
            org.telegram.ui.ActionBar.t6.U(a9Var, org.telegram.ui.ActionBar.m6.f29792z6, h6Var);
            a9Var.setText(" " + org.telegram.messenger.hd.N0(2131749286, null) + " ");
            a9Var.setTextSize(14.0f);
            g10.addView(a9Var, c8.ma.t(190, -2, 1, 28, 12, 28, 8));
            i10 = i7;
            f0 f0Var = new f0(str, i10, w2VarArr, 3);
            org.telegram.ui.Components.m80 a13 = c8.va.a(context, 14.0f, i15, false, h6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131749285, null), f0Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(hi.l3.a(a13.getText(), a13.getPaint()));
            g10.addView(a13, c8.ma.t(-1, -2, 17, 32, 8, 32, 12));
            c8.ra.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(f0Var, 8));
        } else {
            i10 = i7;
        }
        w2Var.O = g10;
        w2Var.show();
        w2VarArr[0] = w2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(w2Var2.F, h6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(w2Var2.F, h6Var2);
                        break;
                }
                org.telegram.messenger.o10.t(null, 2131748728, lcVar);
            }
        });
        eVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(w2Var2.F, h6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(w2Var2.F, h6Var2);
                        break;
                }
                org.telegram.messenger.o10.t(null, 2131748728, lcVar);
            }
        });
        final bi.f5 f5Var = new bi.f5(i10, frameLayout3, inputGroupCall, w2Var, h6Var, a12, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w2 w2Var2 = org.telegram.ui.ActionBar.w2.this;
                org.telegram.ui.ActionBar.m2 m2Var = w2Var2.f30179c;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                org.telegram.ui.Components.a70 G = org.telegram.ui.Components.a70.G(m2Var, h6Var2, frameLayout3);
                String N0 = org.telegram.messenger.hd.N0(2131751755, null);
                String[] strArr2 = strArr;
                G.c(2131232105, N0, new o1(strArr2, w2Var2, h6Var2, 7), false);
                G.c(2131232322, org.telegram.messenger.hd.N0(2131750455, null), new u8(0, context, strArr2), false);
                G.m(2131232110, f5Var, org.telegram.messenger.hd.N0(2131745827, null), z11, true);
                G.a0();
            }
        });
        eVar2.setOnClickListener(new fi.d0(context, str, strArr, h6Var, w2Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new bi.p6(w2Var, h6Var, imageView2, f5Var, 6));
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56762a) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29641r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29601p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29795z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29364c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        if (!this.f48940s) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752584, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 1));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(10, 2131231244);
        this.f48941w = b10;
        b10.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        org.telegram.ui.ActionBar.y0 e10 = this.f48941w.e(3, 2131232110, org.telegram.messenger.hd.N0(2131751577, null));
        int i10 = org.telegram.ui.ActionBar.m6.f29602p7;
        e10.d(getThemedColor(i10), getThemedColor(i10));
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(this, new a5(this, 1), new v8(this), new v8(this));
        this.f48935c = h51Var;
        h51Var.setCaptureSectionsDecoratorAllowed(true);
        this.f48935c.r1();
        this.f48935c.setSectionsDrawBackground(true);
        this.f48935c.f35790g3.f34062r = false;
        w8 w8Var = new w8(0, context, this);
        this.f48938n = w8Var;
        this.fragmentView = w8Var;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.h = yzVar;
        yzVar.setViewType(8);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, this.h, null);
        this.h.f42606x = false;
        this.f48933a = new di.n4(this, context, this.h);
        this.f48935c.setClipToPadding(false);
        this.f48935c.setEmptyView(this.f48933a);
        org.telegram.ui.Components.h51 h51Var2 = this.f48935c;
        v4.c0 c0Var = new v4.c0(1, false);
        this.f48934b = c0Var;
        h51Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.h51 h51Var3 = this.f48935c;
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        h51Var3.setVerticalScrollbarPosition(i7);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(this.f48935c, this.f48934b);
        this.f48936e = k5Var;
        ri.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        k5Var.f29190n = new w0(qVar, 12);
        this.f48938n.addView(this.f48935c, c8.ma.e(-1, -1, 3));
        this.f48938n.addView(this.f48933a, c8.ma.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.f48938n.addView(this.d, c8.ma.e(-1, 0, 48));
        this.f48935c.setOnScrollListener(new x8(this));
        if (this.f48943y) {
            this.f48933a.d();
        } else {
            this.f48933a.e();
        }
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
        this.f48937f = c10Var;
        c10Var.f33966c.setImageResource(2131231090);
        this.f48937f.setContentDescription(org.telegram.messenger.hd.N0(2131752622, null));
        this.f48937f.setOnClickListener(new l8(this, 1));
        this.f48938n.addView(this.f48937f, org.telegram.ui.Components.c10.b());
        org.telegram.ui.Components.es esVar = new org.telegram.ui.Components.es(context);
        this.I = esVar;
        esVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new m8(this, 1));
        org.telegram.ui.Components.es esVar2 = this.I;
        fh.g c10 = getBaseSimpleGlass().f56661c.c(this.I, null, false);
        c10.p(c8.i0.o(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(24.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        esVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.j(this.J, true, false);
        y8 y8Var = new y8(this, context, this, this.f48938n, this.resourceProvider);
        this.K = y8Var;
        this.J.addView(y8Var);
        this.I.setCallFragmentContextView(this.K);
        this.f48938n.addView(this.I, c8.ma.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.f48938n.addView(this.simpleActionBar);
        setBulletinDelegate(new z8(this, 0));
        if (this.f48940s) {
            View view2 = this.fragmentView;
            v8 v8Var = new v8(this);
            WeakHashMap weakHashMap = r0.i0.f56289a;
            r0.a0.i(view2, v8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void f0(ArrayList arrayList, f9 f9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean k02 = k0(arrayList);
        ArrayList arrayList2 = this.H;
        if (k02) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f28455id));
            }
            org.telegram.ui.Components.op opVar = f9Var.f47647e;
            if (opVar != null) {
                opVar.a(false, true);
            }
            o0();
            return;
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f28455id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.op opVar2 = f9Var.f47647e;
        if (opVar2 != null) {
            opVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f48937f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f48935c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48935c, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29455h6));
        org.telegram.ui.Components.c10 c10Var = this.f48937f;
        if (c10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(c10Var.f33966c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48937f.f33966c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48937f.f33966c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.h51 h51Var = this.f48935c;
        i0.b bVar = this.mSystemInsets;
        ri.a.e(h51Var, bVar.f15918b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.I.d(org.telegram.messenger.g0.L(7.0f))), this.P);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15918b + ((int) this.I.d(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (ri.a.d(this.mSystemInsets.f15918b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.f48933a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15918b;
        this.f48933a.setPadding(0, 0, 0, this.S + this.P);
    }

    public final void i0(int i7, int i10) {
        if (this.f48943y) {
            return;
        }
        this.f48943y = true;
        di.n4 n4Var = this.f48933a;
        if (n4Var != null && !this.E) {
            n4Var.d();
        }
        org.telegram.ui.Components.h51 h51Var = this.f48935c;
        if (h51Var != null) {
            h51Var.f35790g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f28545q = "";
        tL_messages_search.offset_id = i7;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.op opVar;
        this.simpleActionBar.w();
        this.H.clear();
        int childCount = this.f48935c.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f48935c.getChildAt(i7);
            if ((childAt instanceof f9) && (opVar = ((f9) childAt).f47647e) != null) {
                opVar.a(false, z10);
            }
        }
        this.f48935c.f35790g3.O(true);
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56762a) {
            return baseSimpleGlass.f56665i;
        }
        return null;
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f28455id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().X) {
            return;
        }
        org.telegram.messenger.k10 userConfig = getUserConfig();
        if (userConfig.X != z10) {
            userConfig.X = z10;
            userConfig.v(false);
        }
        this.f48935c.f35790g3.O(true);
        org.telegram.messenger.ls.f(this.currentAccount).k(org.telegram.messenger.ls.R5, new Object[0]);
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
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var.f30329e == null) {
                z4Var.q().d(2, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.N0(2131751586, null));
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
        org.telegram.messenger.np messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        xi.e eVar = this.O;
        if (eVar != null) {
            eVar.b();
            this.O = null;
        }
        org.telegram.messenger.ls notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ls.f25404w);
        eVar2.c(org.telegram.messenger.ls.A2);
        eVar2.c(org.telegram.messenger.ls.T);
        eVar2.c(org.telegram.messenger.ls.f25407w2);
        this.O = eVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f48939r = bundle.getBoolean("needFinishFragment", true);
            this.f48940s = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f48940s) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.P = i7;
        if (this.f48940s) {
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
                userFull = getMessagesController().d2(this.L.f28583id);
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
        org.telegram.ui.Components.h51 h51Var = this.f48935c;
        if (h51Var != null) {
            h51Var.f35790g3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.h51 h51Var = this.f48935c;
            if (h51Var != null) {
                int childCount = h51Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f48935c.getChildAt(i7);
                    if (childAt instanceof f9) {
                        ((f9) childAt).d.y(0);
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
        if (this.f48934b.L0() < 15) {
            this.f48935c.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f48936e;
        k5Var.f29186b = 1;
        k5Var.k(0, 0, false, false);
    }

    public j9(Bundle bundle) {
        super(bundle);
        this.f48939r = true;
        this.f48942x = new ArrayList();
        this.H = new ArrayList();
    }
}
