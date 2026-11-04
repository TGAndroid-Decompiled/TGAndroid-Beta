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
public final class h9 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, de0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.pr J;
    public FrameLayout K;
    public w8 L;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public Long O;
    public za.p P;
    public boolean Q;
    public int R;
    public int S;
    public float T;
    public int U;
    public ci.t4 f45855a;
    public u4.b0 f45856b;
    public org.telegram.ui.Components.l41 f45857c;
    public View d;
    public org.telegram.ui.Components.vi0 f45858e;
    public org.telegram.ui.Components.l00 f45859f;
    public org.telegram.ui.Components.iz h;
    public ai.h5 f45860n;
    public gi.l3 f45861r;
    public boolean f45862s;
    public boolean f45863w;
    public org.telegram.ui.ActionBar.f5 f45864x;
    public final ArrayList f45865y;

    public h9() {
        this(null);
    }

    public static void Z(org.telegram.ui.h9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h9.Z(org.telegram.ui.h9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void a0(h9 h9Var, org.telegram.ui.Components.r31 r31Var, View view) {
        int i3 = r31Var.d;
        if (i3 == 2) {
            h9Var.m0(true);
            org.telegram.ui.Components.ac J = org.telegram.ui.Components.fc.a0(h9Var).J(2131623989, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749466, null)), org.telegram.messenger.bd.M0(2131743895, null), 5000, true, new m8(h9Var, 0));
            J.f31792j = 5000;
            J.j();
        } else if (i3 == 1) {
            l0(h9Var);
        } else {
            Object obj = r31Var.G;
            boolean z10 = obj instanceof e9;
            int i10 = org.telegram.messenger.hs.f23305t;
            if (z10) {
                e9 e9Var = (e9) obj;
                ArrayList arrayList = e9Var.f44928c;
                if (h9Var.simpleActionBar.s()) {
                    h9Var.f0(arrayList, (d9) view);
                } else if (e9Var.f44926a != 0 && !arrayList.isEmpty()) {
                    boolean z11 = e9Var.f44929e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = e9Var.f44927b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f27150id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f27022id;
                    org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, h9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = h9Var.getMessagesController().P6;
                    s1Var.setOnCancelListener(new o8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(h9Var, s1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), 0));
                    s1Var.r(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", org.telegram.messenger.zi.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f27022id);
                    h9Var.getNotificationCenter().k(i10, new Object[0]);
                    h9Var.presentFragment(new wm(bundle), h9Var.f45862s);
                }
            } else if (view instanceof g9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((g9) view).f45606c.f27001id);
                h9Var.getNotificationCenter().k(i10, new Object[0]);
                h9Var.presentFragment(new wm(bundle2), h9Var.f45862s);
            }
        }
    }

    public static void b0(h9 h9Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        s1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().Y3(groupcall.users, false);
            h9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.n1.g(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.fc.a0(h9Var).f0(tL_error, false);
        }
    }

    public static void c0(h9 h9Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        s1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().Y3(groupcall.users, false);
            h9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.n1.g(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.fc.a0(h9Var).f0(tL_error, false);
        }
    }

    public static org.telegram.ui.ActionBar.y4 d0(h9 h9Var) {
        return h9Var.simpleActionBar;
    }

    public static void e0(h9 h9Var, boolean z10) {
        int i3;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h9Var.getParentActivity());
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        if (z10) {
            s1Var.S = org.telegram.messenger.bd.M0(2131751590, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131751589, null);
        } else {
            s1Var.S = org.telegram.messenger.bd.M0(2131751560, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131751500, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(h9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(h9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        c2Var.e(org.telegram.messenger.bd.M0(2131751559, null), "", false, false, false);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i3 = 0;
        }
        if (org.telegram.messenger.bd.f21784a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        c2Var.setPadding(i3, 0, L, 0);
        frameLayout.addView(c2Var, b8.mf.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new k8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.l3(h9Var, z10, zArr, 2));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        h9Var.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.d2 d2Var) {
        d2Var.presentFragment(new b9(a1.g.k("isCall", true), d2Var.getCurrentAccount(), d2Var));
    }

    public static void n0(final Context context, int i3, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10, final boolean z11) {
        String str2;
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.f27954h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        final org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, e6Var, false);
        t2Var.v0(w02);
        t2Var.O(w02);
        t2Var.w0(i11);
        t2Var.P(i11);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, b8.mf.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232764);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, b8.mf.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, e6Var);
        frameLayout.addView(frameLayout2, b8.mf.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231244);
        int i13 = org.telegram.ui.ActionBar.k6.f28273y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView2, i13, e6Var, mode);
        int i14 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, e6Var);
        if (z11) {
            frameLayout.addView(imageView2, b8.mf.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.s70 a10 = b8.rf.a(context, 20.0f, i15, true, e6Var);
        a10.setText(org.telegram.messenger.bd.M0(2131749480, null));
        a10.setGravity(17);
        f10.addView(a10, b8.mf.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.s70 a11 = b8.rf.a(context, 14.0f, i15, false, e6Var);
        a11.setText(org.telegram.messenger.bd.M0(2131749481, null));
        a11.setGravity(17);
        a11.setMaxWidth(gi.l3.a(a11.getText(), a11.getPaint()));
        f10.addView(a11, b8.mf.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        b8.pf.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.k6.f27824a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.w0(i16, e6Var), org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i16, e6Var), org.telegram.ui.ActionBar.k6.w0(i14, e6Var)), 12, 12);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, b02, N3, q10, e6Var);
        f10.addView(frameLayout3, b8.mf.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.s70 a12 = b8.rf.a(context, 13.0f, i15, false, e6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(str2);
        frameLayout3.addView(a12, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231244));
        imageView3.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.r5, e6Var, mode);
        frameLayout3.addView(imageView3, b8.mf.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        f10.addView(f11, b8.mf.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131749488, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232104, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f11.addView(dVar, b8.mf.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        gi.d dVar2 = new gi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131749482, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(2131232364, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f11.addView(dVar2, b8.mf.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.t2[] t2VarArr = new org.telegram.ui.ActionBar.t2[1];
        if (z10) {
            y8 y8Var = new y8(context, e6Var);
            y8Var.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(y8Var, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
            y8Var.setText(" " + org.telegram.messenger.bd.M0(2131749487, null) + " ");
            y8Var.setTextSize(14.0f);
            f10.addView(y8Var, b8.mf.t(190, -2, 1, 28, 12, 28, 8));
            i10 = i3;
            f4 f4Var = new f4(str, i10, t2VarArr, 1);
            org.telegram.ui.Components.s70 a13 = b8.rf.a(context, 14.0f, i15, false, e6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131749486, null), f4Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(gi.l3.a(a13.getText(), a13.getPaint()));
            f10.addView(a13, b8.mf.t(-1, -2, 17, 32, 8, 32, 12));
            b8.pf.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(f4Var, 8));
        } else {
            i10 = i3;
        }
        t2Var.O = f10;
        t2Var.show();
        t2VarArr[0] = t2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.fc fcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748929, fcVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.fc fcVar;
                int i17 = r4;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                String[] strArr2 = strArr;
                switch (i17) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748929, fcVar);
            }
        });
        final ai.d3 d3Var = new ai.d3(i10, frameLayout3, inputGroupCall, t2Var, e6Var, a12, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t2 t2Var2 = org.telegram.ui.ActionBar.t2.this;
                org.telegram.ui.ActionBar.j2 j2Var = t2Var2.f28589c;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(j2Var, e6Var2, frameLayout3);
                String M0 = org.telegram.messenger.bd.M0(2131751767, null);
                String[] strArr2 = strArr;
                F.c(2131232103, M0, new p1(strArr2, t2Var2, e6Var2, 7), false);
                F.c(2131232320, org.telegram.messenger.bd.M0(2131750480, null), new org.telegram.messenger.voip.l0(18, context, strArr2), false);
                F.m(2131232108, d3Var, org.telegram.messenger.bd.M0(2131746033, null), z11, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ei.f0(context, str, strArr, e6Var, t2Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new ai.r4(t2Var, e6Var, imageView2, d3Var, 6));
        }
    }

    @Override
    public final si.f B() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28141r7));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28101p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27862c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        if (!this.f45863w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 29));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(10, 2131231244);
        this.f45864x = b10;
        b10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        org.telegram.ui.ActionBar.y0 e10 = this.f45864x.e(3, 2131232108, org.telegram.messenger.bd.M0(2131751590, null));
        int i10 = org.telegram.ui.ActionBar.k6.f28102p7;
        e10.d(getThemedColor(i10), getThemedColor(i10));
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new c5(this, 1), new u8(this), new u8(this));
        this.f45857c = l41Var;
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        this.f45857c.r1();
        this.f45857c.setSectionsDrawBackground(true);
        this.f45857c.f35594g3.f33698r = false;
        ai.h5 h5Var = new ai.h5(1, context, this);
        this.f45860n = h5Var;
        this.fragmentView = h5Var;
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.h = izVar;
        izVar.setViewType(8);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, this.h, null);
        this.h.f34869x = false;
        this.f45855a = new ci.t4(this, context, this.h);
        this.f45857c.setClipToPadding(false);
        this.f45857c.setEmptyView(this.f45855a);
        org.telegram.ui.Components.l41 l41Var2 = this.f45857c;
        u4.b0 b0Var = new u4.b0(1, false);
        this.f45856b = b0Var;
        l41Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.l41 l41Var3 = this.f45857c;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        l41Var3.setVerticalScrollbarPosition(i3);
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(this.f45857c, this.f45856b);
        this.f45858e = vi0Var;
        pi.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        vi0Var.h = new x0(qVar, 12);
        this.f45860n.addView(this.f45857c, b8.mf.e(-1, -1, 3));
        this.f45860n.addView(this.f45855a, b8.mf.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.f45860n.addView(this.d, b8.mf.e(-1, 0, 48));
        this.f45857c.setOnScrollListener(new v8(this));
        if (this.E) {
            this.f45855a.d();
        } else {
            this.f45855a.e();
        }
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.f45859f = l00Var;
        l00Var.f35530c.setImageResource(2131231090);
        this.f45859f.setContentDescription(org.telegram.messenger.bd.M0(2131752634, null));
        this.f45859f.setOnClickListener(new l8(this, 1));
        this.f45860n.addView(this.f45859f, org.telegram.ui.Components.l00.b());
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.J = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.J.setOnAnimatedHeightChangedListener(new m8(this, 1));
        org.telegram.ui.Components.pr prVar2 = this.J;
        gh.g c2 = getBaseSimpleGlass().f53525c.c(this.J, null, false);
        c2.p(b8.cd.o(this.resourceProvider));
        c2.r(org.telegram.messenger.g0.L(24.0f));
        c2.q(org.telegram.messenger.g0.L(7.0f));
        prVar2.setBlurredBackground(c2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        this.J.addView(frameLayout);
        this.J.i(this.K, true, false);
        w8 w8Var = new w8(this, context, this, this.f45860n, this.resourceProvider);
        this.L = w8Var;
        this.K.addView(w8Var);
        this.J.setCallFragmentContextView(this.L);
        this.f45860n.addView(this.J, b8.mf.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.f45860n.addView(this.simpleActionBar);
        setBulletinDelegate(new x8(this, 0));
        if (this.f45863w) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.i0.f54015a;
            r0.a0.i(view2, u8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void f0(ArrayList arrayList, d9 d9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean k02 = k0(arrayList);
        ArrayList arrayList2 = this.I;
        if (k02) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i3)).f27022id));
            }
            org.telegram.ui.Components.wo woVar = d9Var.f44607e;
            if (woVar != null) {
                woVar.a(false, true);
            }
            o0();
            return;
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f27022id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.wo woVar2 = d9Var.f44607e;
        if (woVar2 != null) {
            woVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f45859f.setTranslationY(((-this.U) - this.S) - this.T);
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f45857c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45857c, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        org.telegram.ui.Components.l00 l00Var = this.f45859f;
        if (l00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l00Var.f35530c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45859f.f35530c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45859f.f35530c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.l41 l41Var = this.f45857c;
        i0.b bVar = this.mSystemInsets;
        pi.a.e(l41Var, bVar.f14496b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f))), this.R);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f14496b + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = (pi.a.d(this.mSystemInsets.f14496b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.f45855a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f14496b;
        this.f45855a.setPadding(0, 0, 0, this.U + this.R);
    }

    public final void i0(int i3, int i10) {
        if (this.E) {
            return;
        }
        this.E = true;
        ci.t4 t4Var = this.f45855a;
        if (t4Var != null && !this.F) {
            t4Var.d();
        }
        org.telegram.ui.Components.l41 l41Var = this.f45857c;
        if (l41Var != null) {
            l41Var.f35594g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f27112q = "";
        tL_messages_search.offset_id = i3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.wo woVar;
        this.simpleActionBar.r();
        this.I.clear();
        int childCount = this.f45857c.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f45857c.getChildAt(i3);
            if ((childAt instanceof d9) && (woVar = ((d9) childAt).f44607e) != null) {
                woVar.a(false, z10);
            }
        }
        this.f45857c.f35594g3.O(true);
    }

    @Override
    public final si.f k() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.f53529i;
        }
        return null;
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.I.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i3)).f27022id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().X) {
            return;
        }
        org.telegram.messenger.h10 userConfig = getUserConfig();
        if (userConfig.X != z10) {
            userConfig.X = z10;
            userConfig.v(false);
        }
        this.f45857c.f35594g3.O(true);
        org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.O5, new Object[0]);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z10;
        boolean s6 = this.simpleActionBar.s();
        ArrayList arrayList = this.I;
        if (s6) {
            z10 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var.f28857e == null) {
                y4Var.l().d(2, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
            }
            this.simpleActionBar.B();
            z10 = false;
        }
        this.simpleActionBar.x(arrayList.size(), z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.s()) {
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
        if (!this.Q && getUserConfig().X && org.telegram.messenger.hp.e1().getInt("hidecallshint", 0) < 2) {
            gi.l3 l3Var = new gi.l3(getParentActivity(), 1);
            this.f45861r = l3Var;
            l3Var.d = 3000L;
            l3Var.o(1.0f, -25.0f);
            this.f45861r.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            this.f45861r.l(getBaseSimpleGlass().f53525c);
            this.f45861r.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744265, null)));
            this.f45860n.addView(this.f45861r, b8.mf.e(-1, 80, 48));
            this.f45861r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(16.0f));
            this.f45861r.w();
            this.Q = true;
            org.telegram.messenger.hp.e1().edit().putInt("hidecallshint", org.telegram.messenger.hp.e1().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i3;
        super.onFragmentCreate();
        int i10 = 0;
        i0(0, 50);
        org.telegram.messenger.hp messagesController = getMessagesController();
        messagesController.getClass();
        this.H = new ArrayList(messagesController.h.keySet());
        za.p pVar = this.P;
        if (pVar != null) {
            pVar.a();
            this.P = null;
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar2 = new za.p(notificationCenter, this);
        pVar2.b(1);
        pVar2.b(org.telegram.messenger.hs.f23325w);
        pVar2.b(org.telegram.messenger.hs.A2);
        pVar2.b(org.telegram.messenger.hs.T);
        pVar2.b(org.telegram.messenger.hs.f23328w2);
        this.P = pVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f45862s = bundle.getBoolean("needFinishFragment", true);
            this.f45863w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f45863w) {
            i3 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i3 = 0;
        }
        this.R = i3;
        if (this.f45863w) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.S = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        za.p pVar = this.P;
        if (pVar != null) {
            pVar.a();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.U = i12;
        h0();
        g0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i3 != 101 && i3 != 102 && i3 != 103) {
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
            if (i3 == 103) {
                org.telegram.ui.Components.voip.n1.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.M != null) {
                userFull = getMessagesController().b2(this.M.f27150id);
            }
            TLRPC.User user = this.M;
            if (i3 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i3 != 102 && (userFull == null || !userFull.video_calls_available)) {
                z12 = false;
            } else {
                z12 = true;
            }
            org.telegram.ui.Components.voip.n1.m(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i3);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.l41 l41Var = this.f45857c;
        if (l41Var != null) {
            l41Var.f35594g3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.l41 l41Var = this.f45857c;
            if (l41Var != null) {
                int childCount = l41Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.f45857c.getChildAt(i3);
                    if (childAt instanceof d9) {
                        ((d9) childAt).d.y(0);
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
        if (this.f45856b.L0() < 15) {
            this.f45857c.y0(0);
            return;
        }
        org.telegram.ui.Components.vi0 vi0Var = this.f45858e;
        vi0Var.f39126b = 1;
        vi0Var.d(0, 0, false, false);
    }

    public h9(Bundle bundle) {
        super(bundle);
        this.f45862s = true;
        this.f45865y = new ArrayList();
        this.I = new ArrayList();
        this.Q = false;
    }
}
