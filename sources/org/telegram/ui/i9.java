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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i9 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, ie0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.pr I;
    public FrameLayout J;
    public x8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public ab.b0 O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public bi.m5 f46598a;
    public v4.b0 f46599b;
    public org.telegram.ui.Components.q41 f46600c;
    public View d;
    public org.telegram.ui.Components.ri0 f46601e;
    public org.telegram.ui.Components.q00 f46602f;
    public org.telegram.ui.Components.mz h;
    public v8 f46603n;
    public fi.m3 f46604r;
    public boolean f46605s;
    public boolean f46606w;
    public org.telegram.ui.ActionBar.f5 f46607x;
    public final ArrayList f46608y;

    public i9() {
        this(null);
    }

    public static void Z(org.telegram.ui.i9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i9.Z(org.telegram.ui.i9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void a0(i9 i9Var, org.telegram.ui.Components.x31 x31Var, View view) {
        int i7 = x31Var.d;
        if (i7 == 2) {
            i9Var.m0(true);
            org.telegram.ui.Components.cc J = org.telegram.ui.Components.hc.a0(i9Var).J(2131623989, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749459, null)), org.telegram.messenger.id.M0(2131743888, null), 5000, true, new l8(i9Var, 0));
            J.f32545j = 5000;
            J.j();
        } else if (i7 == 1) {
            l0(i9Var);
        } else {
            Object obj = x31Var.G;
            boolean z9 = obj instanceof f9;
            int i10 = org.telegram.messenger.qs.f25076t;
            if (z9) {
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f45517c;
                if (i9Var.simpleActionBar.s()) {
                    i9Var.f0(arrayList, (e9) view);
                } else if (f9Var.f45515a != 0 && !arrayList.isEmpty()) {
                    boolean z10 = f9Var.f45518e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = f9Var.f45516b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f27105id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f26977id;
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, i9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i9Var.getMessagesController().P6;
                    u1Var.setOnCancelListener(new n8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(i9Var, u1Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
                    u1Var.r(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", org.telegram.messenger.ij.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f26977id);
                    i9Var.getNotificationCenter().k(i10, new Object[0]);
                    i9Var.presentFragment(new an(bundle), i9Var.f46605s);
                }
            } else if (view instanceof h9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((h9) view).f46296c.f26956id);
                i9Var.getNotificationCenter().k(i10, new Object[0]);
                i9Var.presentFragment(new an(bundle2), i9Var.f46605s);
            }
        }
    }

    public static void b0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z9, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.y1.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z9, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.hc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void c0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z9, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.y1.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z9, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.hc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void e0(i9 i9Var, boolean z9) {
        int i7;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9Var.getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        if (z9) {
            u1Var.R = org.telegram.messenger.id.M0(2131751590, null);
            u1Var.T = org.telegram.messenger.id.M0(2131751589, null);
        } else {
            u1Var.R = org.telegram.messenger.id.M0(2131751560, null);
            u1Var.T = org.telegram.messenger.id.M0(2131751500, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(i9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        c2Var.e(org.telegram.messenger.id.M0(2131751559, null), "", false, false, false);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.id.f23157a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        c2Var.setPadding(i7, 0, L, 0);
        frameLayout.addView(c2Var, c8.ha.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new j8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new ab.j(i9Var, z9, zArr, 3));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        i9Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.f2 f2Var) {
        f2Var.presentFragment(new c9(a8.p0.k("isCall", true), f2Var.getCurrentAccount(), f2Var));
    }

    public static void n0(final Context context, int i7, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.f6 f6Var, boolean z9, final boolean z10) {
        String str2;
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.f27925h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        final org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, context, f6Var, false);
        v2Var.v0(w02);
        v2Var.O(w02);
        v2Var.w0(i11);
        v2Var.P(i11);
        final ?? r12 = {str};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ha.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232766);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ha.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, f6Var);
        frameLayout.addView(frameLayout2, c8.ha.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231244);
        int i13 = org.telegram.ui.ActionBar.k6.f28244y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView2, i13, f6Var, mode);
        int i14 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, f6Var);
        if (z10) {
            frameLayout.addView(imageView2, c8.ha.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.w70 a10 = c8.qa.a(context, 20.0f, i15, true, f6Var);
        a10.setText(org.telegram.messenger.id.M0(2131749473, null));
        a10.setGravity(17);
        f10.addView(a10, c8.ha.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.w70 a11 = c8.qa.a(context, 14.0f, i15, false, f6Var);
        a11.setText(org.telegram.messenger.id.M0(2131749474, null));
        a11.setGravity(17);
        a11.setMaxWidth(fi.m3.a(a11.getText(), a11.getPaint()));
        f10.addView(a11, c8.ha.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        c8.ka.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.k6.f27796a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.w0(i16, f6Var), org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i16, f6Var), org.telegram.ui.ActionBar.k6.w0(i14, f6Var)), 12, 12);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, b02, N3, q10, f6Var);
        f10.addView(frameLayout3, c8.ha.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.w70 a12 = c8.qa.a(context, 13.0f, i15, false, f6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(str2);
        frameLayout3.addView(a12, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231244));
        imageView3.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.f28110r5, f6Var, mode);
        frameLayout3.addView(imageView3, c8.ha.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        f10.addView(f11, c8.ha.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        fi.d dVar = new fi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131749481, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232104, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f11.addView(dVar, c8.ha.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        fi.d dVar2 = new fi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131749475, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(2131232364, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f11.addView(dVar2, c8.ha.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        if (z9) {
            z8 z8Var = new z8(context, f6Var);
            z8Var.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(z8Var, org.telegram.ui.ActionBar.k6.f28262z6, f6Var);
            z8Var.setText(" " + org.telegram.messenger.id.M0(2131749480, null) + " ");
            z8Var.setTextSize(14.0f);
            f10.addView(z8Var, c8.ha.t(190, -2, 1, 28, 12, 28, 8));
            i10 = i7;
            q8 q8Var = new q8(str, i10, v2VarArr, 0);
            org.telegram.ui.Components.w70 a13 = c8.qa.a(context, 14.0f, i15, false, f6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131749479, null), q8Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(fi.m3.a(a13.getText(), a13.getPaint()));
            f10.addView(a13, c8.ha.t(-1, -2, 17, 32, 8, 32, 12));
            c8.ka.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(q8Var, 8));
        } else {
            i10 = i7;
        }
        v2Var.N = f10;
        v2Var.show();
        v2VarArr[0] = v2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.hc hcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                String[] strArr = r12;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748922, hcVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.hc hcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                String[] strArr = r12;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748922, hcVar);
            }
        });
        final jg.c1 c1Var = new jg.c1(inputGroupCall, i10, (Serializable) r12, frameLayout3, a12, v2Var, f6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v2 v2Var2 = org.telegram.ui.ActionBar.v2.this;
                org.telegram.ui.ActionBar.l2 l2Var = v2Var2.f28622c;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(l2Var, f6Var2, frameLayout3);
                String M0 = org.telegram.messenger.id.M0(2131751767, null);
                String[] strArr = r12;
                F.c(2131232103, M0, new o1(strArr, v2Var2, f6Var2, 7), false);
                F.c(2131232320, org.telegram.messenger.id.M0(2131750473, null), new org.telegram.ui.ActionBar.p(13, context, strArr), false);
                F.m(2131232108, c1Var, org.telegram.messenger.id.M0(2131746026, null), z10, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new di.d0(context, str, r12, f6Var, v2Var, 6));
        if (z10) {
            imageView2.setOnClickListener(new di.u3(v2Var, f6Var, imageView2, c1Var, 5));
        }
    }

    @Override
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21122a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28112r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28072p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27835c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        if (!this.f46606w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 28));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(10, 2131231244);
        this.f46607x = b10;
        b10.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        org.telegram.ui.ActionBar.z0 e10 = this.f46607x.e(3, 2131232108, org.telegram.messenger.id.M0(2131751590, null));
        int i10 = org.telegram.ui.ActionBar.k6.f28073p7;
        e10.d(getThemedColor(i10), getThemedColor(i10));
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new a5(this, 1), new u8(this), new u8(this));
        this.f46600c = q41Var;
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        this.f46600c.r1();
        this.f46600c.setSectionsDrawBackground(true);
        this.f46600c.f37190f3.f35528r = false;
        v8 v8Var = new v8(0, context, this);
        this.f46603n = v8Var;
        this.fragmentView = v8Var;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.h = mzVar;
        mzVar.setViewType(8);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27796a7, this.h, null);
        this.h.f36172x = false;
        this.f46598a = new bi.m5(this, context, this.h);
        this.f46600c.setClipToPadding(false);
        this.f46600c.setEmptyView(this.f46598a);
        org.telegram.ui.Components.q41 q41Var2 = this.f46600c;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f46599b = b0Var;
        q41Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.q41 q41Var3 = this.f46600c;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        q41Var3.setVerticalScrollbarPosition(i7);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(this.f46600c, this.f46599b);
        this.f46601e = ri0Var;
        oi.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        ri0Var.h = new w0(qVar, 12);
        this.f46603n.addView(this.f46600c, c8.ha.e(-1, -1, 3));
        this.f46603n.addView(this.f46598a, c8.ha.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.f46603n.addView(this.d, c8.ha.e(-1, 0, 48));
        this.f46600c.setOnScrollListener(new w8(this));
        if (this.D) {
            this.f46598a.d();
        } else {
            this.f46598a.e();
        }
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.f46602f = q00Var;
        q00Var.f37140c.setImageResource(2131231090);
        this.f46602f.setContentDescription(org.telegram.messenger.id.M0(2131752634, null));
        this.f46602f.setOnClickListener(new k8(this, 1));
        this.f46603n.addView(this.f46602f, org.telegram.ui.Components.q00.b());
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.I = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new l8(this, 1));
        org.telegram.ui.Components.pr prVar2 = this.I;
        fh.g c10 = getBaseSimpleGlass().f21021c.c(this.I, null, false);
        c10.p(c8.g0.o(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(24.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        prVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        x8 x8Var = new x8(this, context, this, this.f46603n, this.resourceProvider);
        this.K = x8Var;
        this.J.addView(x8Var);
        this.I.setCallFragmentContextView(this.K);
        this.f46603n.addView(this.I, c8.ha.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.f46603n.addView(this.simpleActionBar);
        setBulletinDelegate(new y8(this, 0));
        if (this.f46606w) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.i0.f54191a;
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
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f26977id));
            }
            org.telegram.ui.Components.wo woVar = e9Var.f45242e;
            if (woVar != null) {
                woVar.a(false, true);
            }
            o0();
            return;
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f26977id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.wo woVar2 = e9Var.f45242e;
        if (woVar2 != null) {
            woVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f46602f.setTranslationY(((-this.T) - this.R) - this.S);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f46600c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46600c, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27926h6));
        org.telegram.ui.Components.q00 q00Var = this.f46602f;
        if (q00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(q00Var.f37140c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46602f.f37140c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46602f.f37140c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.q41 q41Var = this.f46600c;
        i0.b bVar = this.mSystemInsets;
        oi.a.e(q41Var, bVar.f15121b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.I.c(org.telegram.messenger.g0.L(7.0f))), this.Q);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15121b + ((int) this.I.c(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (oi.a.d(this.mSystemInsets.f15121b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.f46598a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15121b;
        this.f46598a.setPadding(0, 0, 0, this.T + this.Q);
    }

    public final void i0(int i7, int i10) {
        if (this.D) {
            return;
        }
        this.D = true;
        bi.m5 m5Var = this.f46598a;
        if (m5Var != null && !this.E) {
            m5Var.d();
        }
        org.telegram.ui.Components.q41 q41Var = this.f46600c;
        if (q41Var != null) {
            q41Var.f37190f3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f27067q = "";
        tL_messages_search.offset_id = i7;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        org.telegram.ui.Components.wo woVar;
        this.simpleActionBar.r();
        this.H.clear();
        int childCount = this.f46600c.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f46600c.getChildAt(i7);
            if ((childAt instanceof e9) && (woVar = ((e9) childAt).f45242e) != null) {
                woVar.a(false, z9);
            }
        }
        this.f46600c.f37190f3.O(true);
    }

    @Override
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21122a) {
            return baseSimpleGlass.f21025i;
        }
        return null;
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).f26977id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z9) {
        if (z9 == getUserConfig().W) {
            return;
        }
        org.telegram.messenger.p10 userConfig = getUserConfig();
        if (userConfig.W != z9) {
            userConfig.W = z9;
            userConfig.v(false);
        }
        this.f46600c.f37190f3.O(true);
        org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.O5, new Object[0]);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z9;
        boolean s5 = this.simpleActionBar.s();
        ArrayList arrayList = this.H;
        if (s5) {
            z9 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var.f28788e == null) {
                y4Var.l().d(2, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751599, null));
            }
            this.simpleActionBar.B();
            z9 = false;
        }
        this.simpleActionBar.x(arrayList.size(), z9);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.simpleActionBar.s()) {
            if (z9) {
                j0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.P && getUserConfig().W && org.telegram.messenger.qp.e1().getInt("hidecallshint", 0) < 2) {
            fi.m3 m3Var = new fi.m3(getParentActivity(), 1);
            this.f46604r = m3Var;
            m3Var.d = 3000L;
            m3Var.o(1.0f, -25.0f);
            this.f46604r.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            this.f46604r.l(getBaseSimpleGlass().f21021c);
            this.f46604r.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744258, null)));
            this.f46603n.addView(this.f46604r, c8.ha.e(-1, 80, 48));
            this.f46604r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(16.0f));
            this.f46604r.w();
            this.P = true;
            org.telegram.messenger.qp.e1().edit().putInt("hidecallshint", org.telegram.messenger.qp.e1().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        super.onFragmentCreate();
        int i10 = 0;
        i0(0, 50);
        org.telegram.messenger.qp messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        ab.b0 b0Var = this.O;
        if (b0Var != null) {
            b0Var.b();
            this.O = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var2 = new ab.b0(notificationCenter, this);
        b0Var2.c(1);
        b0Var2.c(org.telegram.messenger.qs.f25096w);
        b0Var2.c(org.telegram.messenger.qs.A2);
        b0Var2.c(org.telegram.messenger.qs.T);
        b0Var2.c(org.telegram.messenger.qs.f25099w2);
        this.O = b0Var2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f46605s = bundle.getBoolean("needFinishFragment", true);
            this.f46606w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f46606w) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.Q = i7;
        if (this.f46606w) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.R = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        ab.b0 b0Var = this.O;
        if (b0Var != null) {
            b0Var.b();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.T = i12;
        h0();
        g0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (i7 != 101 && i7 != 102 && i7 != 103) {
            return;
        }
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (iArr[i10] != 0) {
                    z9 = false;
                    break;
                }
                i10++;
            } else {
                z9 = true;
                break;
            }
        }
        TLRPC.UserFull userFull = null;
        if (iArr.length > 0 && z9) {
            if (i7 == 103) {
                org.telegram.ui.Components.voip.y1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().b2(this.L.f27105id);
            }
            TLRPC.User user = this.L;
            if (i7 == 102) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i7 != 102 && (userFull == null || !userFull.video_calls_available)) {
                z11 = false;
            } else {
                z11 = true;
            }
            org.telegram.ui.Components.voip.y1.m(user, z10, z11, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.q41 q41Var = this.f46600c;
        if (q41Var != null) {
            q41Var.f37190f3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.q41 q41Var = this.f46600c;
            if (q41Var != null) {
                int childCount = q41Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f46600c.getChildAt(i7);
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
        if (this.f46599b.L0() < 15) {
            this.f46600c.y0(0);
            return;
        }
        org.telegram.ui.Components.ri0 ri0Var = this.f46601e;
        ri0Var.f37673b = 1;
        ri0Var.d(0, 0, false, false);
    }

    public i9(Bundle bundle) {
        super(bundle);
        this.f46605s = true;
        this.f46608y = new ArrayList();
        this.H = new ArrayList();
        this.P = false;
    }
}
