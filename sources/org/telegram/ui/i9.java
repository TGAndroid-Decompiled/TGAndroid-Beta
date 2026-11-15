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
public final class i9 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, ie0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.vr J;
    public FrameLayout K;
    public x8 L;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public Long O;
    public xi.e P;
    public boolean Q;
    public int R;
    public int S;
    public float T;
    public int U;
    public di.k4 f47975a;
    public v4.b0 f47976b;
    public org.telegram.ui.Components.u41 f47977c;
    public View d;
    public org.telegram.ui.Components.wi0 f47978e;
    public org.telegram.ui.Components.t00 f47979f;
    public org.telegram.ui.Components.pz h;
    public v8 f47980n;
    public hi.l3 f47981r;
    public boolean f47982s;
    public boolean f47983w;
    public org.telegram.ui.ActionBar.d5 f47984x;
    public final ArrayList f47985y;

    public i9() {
        this(null);
    }

    public static void Z(org.telegram.ui.i9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i9.Z(org.telegram.ui.i9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void a0(i9 i9Var, org.telegram.ui.Components.b41 b41Var, View view) {
        int i7 = b41Var.d;
        if (i7 == 2) {
            i9Var.m0(true);
            org.telegram.ui.Components.xb J = org.telegram.ui.Components.cc.a0(i9Var).J(2131623990, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749458, null)), org.telegram.messenger.hd.M0(2131743885, null), 5000, true, new m8(i9Var, 0));
            J.f41643j = 5000;
            J.j();
        } else if (i7 == 1) {
            l0(i9Var);
        } else {
            Object obj = b41Var.G;
            boolean z10 = obj instanceof f9;
            int i10 = org.telegram.messenger.ns.f25572t;
            if (z10) {
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f47091c;
                if (i9Var.simpleActionBar.v()) {
                    i9Var.f0(arrayList, (e9) view);
                } else if (f9Var.f47089a != 0 && !arrayList.isEmpty()) {
                    boolean z11 = f9Var.f47092e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = f9Var.f47090b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f28200id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f28072id;
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, i9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i9Var.getMessagesController().Q6;
                    t1Var.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, t1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), 0));
                    t1Var.r(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", org.telegram.messenger.gj.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f28072id);
                    i9Var.getNotificationCenter().k(i10, new Object[0]);
                    i9Var.presentFragment(new an(bundle), i9Var.f47982s);
                }
            } else if (view instanceof h9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((h9) view).f47650c.f28051id);
                i9Var.getNotificationCenter().k(i10, new Object[0]);
                i9Var.presentFragment(new an(bundle2), i9Var.f47982s);
            }
        }
    }

    public static void b0(i9 i9Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        t1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.c2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void c0(i9 i9Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        t1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.c2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void e0(i9 i9Var, boolean z10) {
        int i7;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9Var.getParentActivity());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.M0(2131751589, null);
            t1Var.U = org.telegram.messenger.hd.M0(2131751588, null);
        } else {
            t1Var.S = org.telegram.messenger.hd.M0(2131751559, null);
            t1Var.U = org.telegram.messenger.hd.M0(2131751499, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(i9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
        c2Var.e(org.telegram.messenger.hd.M0(2131751558, null), "", false, false, false);
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.hd.f24101a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        c2Var.setPadding(i7, 0, L, 0);
        frameLayout.addView(c2Var, c8.ja.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new k8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ab.j(i9Var, z10, zArr, 3));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        i9Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.e2 e2Var) {
        e2Var.presentFragment(new c9(a8.p0.k("isCall", true), e2Var.getCurrentAccount(), e2Var));
    }

    public static void n0(final Context context, int i7, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10, final boolean z11) {
        String str2;
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f28922h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        final org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, e6Var, false);
        u2Var.v0(w02);
        u2Var.P(w02);
        u2Var.w0(i11);
        u2Var.Q(i11);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ja.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232767);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ja.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, e6Var);
        frameLayout.addView(frameLayout2, c8.ja.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231244);
        int i13 = org.telegram.ui.ActionBar.j6.f29241y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView2, i13, e6Var, mode);
        int i14 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 1, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M2, e6Var);
        if (z11) {
            frameLayout.addView(imageView2, c8.ja.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.z70 a10 = c8.sa.a(context, 20.0f, i15, true, e6Var);
        a10.setText(org.telegram.messenger.hd.M0(2131749472, null));
        a10.setGravity(17);
        f10.addView(a10, c8.ja.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.z70 a11 = c8.sa.a(context, 14.0f, i15, false, e6Var);
        a11.setText(org.telegram.messenger.hd.M0(2131749473, null));
        a11.setGravity(17);
        a11.setMaxWidth(hi.l3.a(a11.getText(), a11.getPaint()));
        f10.addView(a11, c8.ja.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        c8.na.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.j6.f28792a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(org.telegram.ui.ActionBar.j6.w0(i16, e6Var), org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(i16, e6Var), org.telegram.ui.ActionBar.j6.w0(i14, e6Var)), 12, 12);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i16);
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.q6.j(frameLayout3, b02, M3, p10, e6Var);
        f10.addView(frameLayout3, c8.ja.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.z70 a12 = c8.sa.a(context, 13.0f, i15, false, e6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(str2);
        frameLayout3.addView(a12, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231244));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.f29107r5, e6Var, mode);
        frameLayout3.addView(imageView3, c8.ja.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        f10.addView(f11, c8.ja.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749480, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131232105, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f11.addView(dVar, c8.ja.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        hi.d dVar2 = new hi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749474, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(2131232365, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f11.addView(dVar2, c8.ja.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        if (z10) {
            z8 z8Var = new z8(context, e6Var);
            z8Var.setGravity(17);
            org.telegram.ui.ActionBar.q6.U(z8Var, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
            z8Var.setText(" " + org.telegram.messenger.hd.M0(2131749479, null) + " ");
            z8Var.setTextSize(14.0f);
            f10.addView(z8Var, c8.ja.t(190, -2, 1, 28, 12, 28, 8));
            i10 = i7;
            f0 f0Var = new f0(str, i10, u2VarArr, 3);
            org.telegram.ui.Components.z70 a13 = c8.sa.a(context, 14.0f, i15, false, e6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131749478, null), f0Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(hi.l3.a(a13.getText(), a13.getPaint()));
            f10.addView(a13, c8.ja.t(-1, -2, 17, 32, 8, 32, 12));
            c8.na.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(f0Var, 8));
        } else {
            i10 = i7;
        }
        u2Var.O = f10;
        u2Var.show();
        u2VarArr[0] = u2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.i20.s(null, 2131748921, ccVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.i20.s(null, 2131748921, ccVar);
            }
        });
        final bi.u2 u2Var2 = new bi.u2(i10, frameLayout3, inputGroupCall, u2Var, e6Var, a12, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u2 u2Var3 = org.telegram.ui.ActionBar.u2.this;
                org.telegram.ui.ActionBar.k2 k2Var = u2Var3.f29685c;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(k2Var, e6Var2, frameLayout3);
                String M0 = org.telegram.messenger.hd.M0(2131751767, null);
                String[] strArr2 = strArr;
                F.c(2131232104, M0, new o1(strArr2, u2Var3, e6Var2, 7), false);
                F.c(2131232321, org.telegram.messenger.hd.M0(2131750472, null), new u5(2, context, strArr2), false);
                F.m(2131232109, u2Var2, org.telegram.messenger.hd.M0(2131746023, null), z11, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new fi.d0(context, str, strArr, e6Var, u2Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new bi.f4(u2Var, e6Var, imageView2, u2Var2, 6));
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29109r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29069p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29263z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28832c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        if (!this.f47983w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 29));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(10, 2131231244);
        this.f47984x = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        org.telegram.ui.ActionBar.z0 e10 = this.f47984x.e(3, 2131232109, org.telegram.messenger.hd.M0(2131751589, null));
        int i10 = org.telegram.ui.ActionBar.j6.f29070p7;
        e10.d(getThemedColor(i10), getThemedColor(i10));
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new a5(this, 1), new u8(this), new u8(this));
        this.f47977c = u41Var;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        this.f47977c.r1();
        this.f47977c.setSectionsDrawBackground(true);
        this.f47977c.f39895g3.f38201r = false;
        v8 v8Var = new v8(0, context, this);
        this.f47980n = v8Var;
        this.fragmentView = v8Var;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.h = pzVar;
        pzVar.setViewType(8);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, this.h, null);
        this.h.f38448x = false;
        this.f47975a = new di.k4(this, context, this.h);
        this.f47977c.setClipToPadding(false);
        this.f47977c.setEmptyView(this.f47975a);
        org.telegram.ui.Components.u41 u41Var2 = this.f47977c;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f47976b = b0Var;
        u41Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.u41 u41Var3 = this.f47977c;
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        u41Var3.setVerticalScrollbarPosition(i7);
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(this.f47977c, this.f47976b);
        this.f47978e = wi0Var;
        ri.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        wi0Var.h = new w0(qVar, 12);
        this.f47980n.addView(this.f47977c, c8.ja.e(-1, -1, 3));
        this.f47980n.addView(this.f47975a, c8.ja.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.f47980n.addView(this.d, c8.ja.e(-1, 0, 48));
        this.f47977c.setOnScrollListener(new w8(this));
        if (this.E) {
            this.f47975a.d();
        } else {
            this.f47975a.e();
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.f47979f = t00Var;
        t00Var.f39467c.setImageResource(2131231090);
        this.f47979f.setContentDescription(org.telegram.messenger.hd.M0(2131752634, null));
        this.f47979f.setOnClickListener(new l8(this, 1));
        this.f47980n.addView(this.f47979f, org.telegram.ui.Components.t00.b());
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(context);
        this.J = vrVar;
        vrVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.J.setOnAnimatedHeightChangedListener(new m8(this, 1));
        org.telegram.ui.Components.vr vrVar2 = this.J;
        fh.g c10 = getBaseSimpleGlass().f56042c.c(this.J, null, false);
        c10.p(c8.g0.n(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(24.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        vrVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        this.J.addView(frameLayout);
        this.J.i(this.K, true, false);
        x8 x8Var = new x8(this, context, this, this.f47980n, this.resourceProvider);
        this.L = x8Var;
        this.K.addView(x8Var);
        this.J.setCallFragmentContextView(this.L);
        this.f47980n.addView(this.J, c8.ja.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.f47980n.addView(this.simpleActionBar);
        setBulletinDelegate(new y8(this, 0));
        if (this.f47983w) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.i0.f55671a;
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
        ArrayList arrayList2 = this.I;
        if (k02) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f28072id));
            }
            org.telegram.ui.Components.fp fpVar = e9Var.f46650e;
            if (fpVar != null) {
                fpVar.a(false, true);
            }
            o0();
            return;
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f28072id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.fp fpVar2 = e9Var.f46650e;
        if (fpVar2 != null) {
            fpVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f47979f.setTranslationY(((-this.U) - this.S) - this.T);
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f47977c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47977c, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        org.telegram.ui.Components.t00 t00Var = this.f47979f;
        if (t00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(t00Var.f39467c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47979f.f39467c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47979f.f39467c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.u41 u41Var = this.f47977c;
        i0.c cVar = this.mSystemInsets;
        ri.a.e(u41Var, cVar.f15575b, cVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f))), this.R);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15575b + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = (ri.a.d(this.mSystemInsets.f15575b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.f47975a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15575b;
        this.f47975a.setPadding(0, 0, 0, this.U + this.R);
    }

    public final void i0(int i7, int i10) {
        if (this.E) {
            return;
        }
        this.E = true;
        di.k4 k4Var = this.f47975a;
        if (k4Var != null && !this.F) {
            k4Var.d();
        }
        org.telegram.ui.Components.u41 u41Var = this.f47977c;
        if (u41Var != null) {
            u41Var.f39895g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f28162q = "";
        tL_messages_search.offset_id = i7;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.fp fpVar;
        this.simpleActionBar.u();
        this.I.clear();
        int childCount = this.f47977c.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f47977c.getChildAt(i7);
            if ((childAt instanceof e9) && (fpVar = ((e9) childAt).f46650e) != null) {
                fpVar.a(false, z10);
            }
        }
        this.f47977c.f39895g3.O(true);
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
            return baseSimpleGlass.f56046i;
        }
        return null;
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.I.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f28072id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().X) {
            return;
        }
        org.telegram.messenger.m10 userConfig = getUserConfig();
        if (userConfig.X != z10) {
            userConfig.X = z10;
            userConfig.v(false);
        }
        this.f47977c.f39895g3.O(true);
        org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.O5, new Object[0]);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z10;
        boolean v = this.simpleActionBar.v();
        ArrayList arrayList = this.I;
        if (v) {
            z10 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
            if (w4Var.f29813e == null) {
                w4Var.o().d(2, 2131232109, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751598, null));
            }
            this.simpleActionBar.F();
            z10 = false;
        }
        this.simpleActionBar.A(arrayList.size(), z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.v()) {
            if (z10) {
                j0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Q && getUserConfig().X && org.telegram.messenger.np.e1().getInt("hidecallshint", 0) < 2) {
            hi.l3 l3Var = new hi.l3(getParentActivity(), 1);
            this.f47981r = l3Var;
            l3Var.d = 3000L;
            l3Var.o(1.0f, -25.0f);
            this.f47981r.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            this.f47981r.l(getBaseSimpleGlass().f56042c);
            this.f47981r.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744255, null)));
            this.f47980n.addView(this.f47981r, c8.ja.e(-1, 80, 48));
            this.f47981r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(16.0f));
            this.f47981r.w();
            this.Q = true;
            org.telegram.messenger.np.e1().edit().putInt("hidecallshint", org.telegram.messenger.np.e1().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        super.onFragmentCreate();
        int i10 = 0;
        i0(0, 50);
        org.telegram.messenger.np messagesController = getMessagesController();
        messagesController.getClass();
        this.H = new ArrayList(messagesController.h.keySet());
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ns.f25592w);
        eVar2.c(org.telegram.messenger.ns.A2);
        eVar2.c(org.telegram.messenger.ns.T);
        eVar2.c(org.telegram.messenger.ns.f25595w2);
        this.P = eVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f47982s = bundle.getBoolean("needFinishFragment", true);
            this.f47983w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f47983w) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.R = i7;
        if (this.f47983w) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.S = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.U = i12;
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
                org.telegram.ui.Components.voip.c2.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.M != null) {
                userFull = getMessagesController().b2(this.M.f28200id);
            }
            TLRPC.User user = this.M;
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
            org.telegram.ui.Components.voip.c2.m(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.c2.h(getParentActivity(), null, i7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u41 u41Var = this.f47977c;
        if (u41Var != null) {
            u41Var.f39895g3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.u41 u41Var = this.f47977c;
            if (u41Var != null) {
                int childCount = u41Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f47977c.getChildAt(i7);
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
        if (this.f47976b.L0() < 15) {
            this.f47977c.y0(0);
            return;
        }
        org.telegram.ui.Components.wi0 wi0Var = this.f47978e;
        wi0Var.f41354b = 1;
        wi0Var.d(0, 0, false, false);
    }

    public i9(Bundle bundle) {
        super(bundle);
        this.f47982s = true;
        this.f47985y = new ArrayList();
        this.I = new ArrayList();
        this.Q = false;
    }
}
