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
public final class j9 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, of0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.zr I;
    public FrameLayout J;
    public y8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public xa.n O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public jg.b1 f38466a;
    public s4.a0 f38467b;
    public org.telegram.ui.Components.u51 f38468c;
    public View d;
    public org.telegram.ui.Components.vj0 e;
    public org.telegram.ui.Components.f10 f38469f;
    public org.telegram.ui.Components.zz h;
    public w8 f38470n;
    public vh.p2 f38471r;
    public boolean f38472s;
    public boolean f38473w;
    public org.telegram.ui.ActionBar.p5 f38474x;
    public final ArrayList f38475y;

    public j9() {
        this(null);
    }

    public static void Y(org.telegram.ui.j9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j9.Y(org.telegram.ui.j9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void Z(j9 j9Var, org.telegram.ui.Components.a51 a51Var, View view) {
        int i10 = a51Var.d;
        if (i10 == 2) {
            j9Var.l0(true);
            org.telegram.ui.Components.wb J = org.telegram.ui.Components.cc.a0(j9Var).J(2131623989, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749467, null)), org.telegram.messenger.cd.L0(2131743910, null), 5000, true, new l8(j9Var, 0));
            J.f32135j = 5000;
            J.j();
        } else if (i10 == 1) {
            k0(j9Var);
        } else {
            Object obj = a51Var.G;
            boolean z10 = obj instanceof g9;
            int i11 = org.telegram.messenger.zs.f19690t;
            if (z10) {
                g9 g9Var = (g9) obj;
                ArrayList arrayList = g9Var.f37491c;
                if (j9Var.simpleActionBar.s()) {
                    j9Var.e0(arrayList, (f9) view);
                } else if (g9Var.f37489a != 0 && !arrayList.isEmpty()) {
                    boolean z11 = g9Var.e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = g9Var.f37490b;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f19942id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f19814id;
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, j9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = j9Var.getMessagesController().Q6;
                    x1Var.setOnCancelListener(new n8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(j9Var, x1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), 0));
                    x1Var.r(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", org.telegram.messenger.jj.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f19814id);
                    j9Var.getNotificationCenter().k(i11, new Object[0]);
                    j9Var.presentFragment(new un(bundle), j9Var.f38472s);
                }
            } else if (view instanceof i9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((i9) view).f38212c.f19793id);
                j9Var.getNotificationCenter().k(i11, new Object[0]);
                j9Var.presentFragment(new un(bundle2), j9Var.f38472s);
            }
        }
    }

    public static void a0(j9 j9Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        x1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().V3(groupcall.users, false);
            j9Var.getMessagesController().P3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.m1.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(j9Var).f0(tL_error, false);
        }
    }

    public static void b0(j9 j9Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        x1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().V3(groupcall.users, false);
            j9Var.getMessagesController().P3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.m1.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(j9Var).f0(tL_error, false);
        }
    }

    public static org.telegram.ui.ActionBar.i5 c0(j9 j9Var) {
        return j9Var.simpleActionBar;
    }

    public static void d0(j9 j9Var, boolean z10) {
        int i10;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j9Var.getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        if (z10) {
            x1Var.R = org.telegram.messenger.cd.L0(2131751590, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131751589, null);
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131751560, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131751500, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(j9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(j9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
        c2Var.e(org.telegram.messenger.cd.L0(2131751559, null), "", false, false, false);
        if (org.telegram.messenger.cd.X) {
            i10 = org.telegram.messenger.i0.L(8.0f);
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.cd.X) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(8.0f);
        }
        c2Var.setPadding(i10, 0, L, 0);
        frameLayout.addView(c2Var, w7.b6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new j8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ag.v0(j9Var, z10, zArr, 1));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        j9Var.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
        }
    }

    public static void k0(org.telegram.ui.ActionBar.k2 k2Var) {
        k2Var.presentFragment(new d9(a1.g.g("isCall", true), k2Var.getCurrentAccount(), k2Var));
    }

    public static void m0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.p6 p6Var, boolean z10, final boolean z11) {
        String str2;
        int i11;
        int i12 = org.telegram.ui.ActionBar.t6.f21001h5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, context, p6Var, false);
        z2Var.v0(w02);
        z2Var.P(w02);
        z2Var.w0(i12);
        z2Var.Q(i12);
        final String[] strArr = {str};
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.b6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232763);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.b6.e(-1, -1, 17));
        int L = org.telegram.messenger.i0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L2, N, null, p6Var);
        frameLayout.addView(frameLayout2, w7.b6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231245);
        int i14 = org.telegram.ui.ActionBar.t6.f21311y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView2, i14, p6Var, mode);
        int i15 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N2, p6Var);
        if (z11) {
            frameLayout.addView(imageView2, w7.b6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i16 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.Components.p80 a2 = w7.g6.a(context, 20.0f, i16, true, p6Var);
        a2.setText(org.telegram.messenger.cd.L0(2131749481, null));
        a2.setGravity(17);
        f7.addView(a2, w7.b6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.p80 a10 = w7.g6.a(context, 14.0f, i16, false, p6Var);
        a10.setText(org.telegram.messenger.cd.L0(2131749482, null));
        a10.setGravity(17);
        a10.setMaxWidth(vh.p2.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.b6.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.e6.b(frameLayout3, 0.01f, 1.2f);
        int i17 = org.telegram.ui.ActionBar.t6.f20872a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i17, p6Var), org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i17, p6Var), org.telegram.ui.ActionBar.t6.w0(i15, p6Var)), 12, 12);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i17);
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i17, i15);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.a7.k(frameLayout3, b02, N3, q6, p6Var);
        f7.addView(frameLayout3, w7.b6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.p80 a11 = w7.g6.a(context, 13.0f, i16, false, p6Var);
        a11.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231245));
        imageView3.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.f21185r5, p6Var, mode);
        frameLayout3.addView(imageView3, w7.b6.e(40, 48, 21));
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
        f7.addView(f10, w7.b6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131749489, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131232103, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.b6.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        vh.d dVar2 = new vh.d(context, p6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131749483, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(2131232363, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.b6.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.z2[] z2VarArr = new org.telegram.ui.ActionBar.z2[1];
        if (z10) {
            a9 a9Var = new a9(context, p6Var);
            a9Var.setGravity(17);
            org.telegram.ui.ActionBar.a7.V(a9Var, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
            a9Var.setText(" " + org.telegram.messenger.cd.L0(2131749488, null) + " ");
            a9Var.setTextSize(14.0f);
            f7.addView(a9Var, w7.b6.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ag.o0 o0Var = new ag.o0(str, i11, z2VarArr, 17);
            org.telegram.ui.Components.p80 a12 = w7.g6.a(context, 14.0f, i16, false, p6Var);
            a12.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131749487, null), o0Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(vh.p2.a(a12.getText(), a12.getPaint()));
            f7.addView(a12, w7.b6.t(-1, -2, 17, 32, 8, 32, 12));
            w7.e6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(o0Var, 8));
        } else {
            i11 = i10;
        }
        z2Var.N = f7;
        z2Var.show();
        z2VarArr[0] = z2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i18 = r4;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                String[] strArr2 = strArr;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                    default:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                }
                org.telegram.messenger.z20.r(null, 2131748931, ccVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i18 = r4;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                String[] strArr2 = strArr;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                    default:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                }
                org.telegram.messenger.z20.r(null, 2131748931, ccVar);
            }
        });
        final org.telegram.messenger.fe feVar = new org.telegram.messenger.fe(inputGroupCall, i11, strArr, frameLayout3, a11, z2Var, p6Var, 3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.z2 z2Var2 = org.telegram.ui.ActionBar.z2.this;
                org.telegram.ui.ActionBar.p2 p2Var = z2Var2.f21589c;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(p2Var, p6Var2, frameLayout3);
                String L0 = org.telegram.messenger.cd.L0(2131751767, null);
                String[] strArr2 = strArr;
                F.c(2131232102, L0, new p1(strArr2, z2Var2, p6Var2, 7), false);
                F.c(2131232319, org.telegram.messenger.cd.L0(2131750481, null), new h0(7, context, strArr2), false);
                F.m(2131232107, feVar, org.telegram.messenger.cd.L0(2131746040, null), z11, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new bi.c(context, str, strArr, p6Var, z2Var));
        if (z11) {
            imageView2.setOnClickListener(new org.telegram.messenger.video.h(z2Var, p6Var, imageView2, feVar, 1));
        }
    }

    @Override
    public final hi.f B() {
        return getBaseSimpleGlass().h;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21187r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21152p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21333z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20911c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        if (!this.f38473w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 18));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(10, 2131231245);
        this.f38474x = b10;
        b10.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        org.telegram.ui.ActionBar.b1 e = this.f38474x.e(3, 2131232107, org.telegram.messenger.cd.L0(2131751590, null));
        int i11 = org.telegram.ui.ActionBar.t6.f21153p7;
        e.d(getThemedColor(i11), getThemedColor(i11));
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new z4(this, 1), new u8(this), new u8(this));
        this.f38468c = u51Var;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        this.f38468c.r1();
        this.f38468c.setSectionsDrawBackground(true);
        this.f38468c.f30819f3.f29295r = false;
        w8 w8Var = new w8(this, context, 0);
        this.f38470n = w8Var;
        this.fragmentView = w8Var;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.h = zzVar;
        zzVar.setViewType(8);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, this.h, null);
        this.h.f33274x = false;
        this.f38466a = new jg.b1(this, context, this.h);
        this.f38468c.setClipToPadding(false);
        this.f38468c.setEmptyView(this.f38466a);
        org.telegram.ui.Components.u51 u51Var2 = this.f38468c;
        s4.a0 a0Var = new s4.a0(1, false);
        this.f38467b = a0Var;
        u51Var2.setLayoutManager(a0Var);
        org.telegram.ui.Components.u51 u51Var3 = this.f38468c;
        if (org.telegram.messenger.cd.X) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        u51Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(this.f38468c, this.f38467b);
        this.e = vj0Var;
        ei.r rVar = this.glassEngine;
        Objects.requireNonNull(rVar);
        vj0Var.h = new y0(rVar, 12);
        this.f38470n.addView(this.f38468c, w7.b6.e(-1, -1, 3));
        this.f38470n.addView(this.f38466a, w7.b6.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.f38470n.addView(this.d, w7.b6.e(-1, 0, 48));
        this.f38468c.setOnScrollListener(new x8(this));
        if (this.D) {
            this.f38466a.d();
        } else {
            this.f38466a.e();
        }
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.f38469f = f10Var;
        f10Var.f25929c.setImageResource(2131231090);
        this.f38469f.setContentDescription(org.telegram.messenger.cd.L0(2131752634, null));
        this.f38469f.setOnClickListener(new k8(this, 1));
        this.f38470n.addView(this.f38469f, org.telegram.ui.Components.f10.b());
        org.telegram.ui.Components.zr zrVar = new org.telegram.ui.Components.zr(context);
        this.I = zrVar;
        zrVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new l8(this, 1));
        org.telegram.ui.Components.zr zrVar2 = this.I;
        vg.f c10 = getBaseSimpleGlass().f6599c.c(this.I, null, false);
        c10.o(w7.b9.o(this.resourceProvider));
        c10.q(org.telegram.messenger.i0.L(24.0f));
        c10.p(org.telegram.messenger.i0.L(7.0f));
        zrVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        y8 y8Var = new y8(this, context, this, this.f38470n, this.resourceProvider);
        this.K = y8Var;
        this.J.addView(y8Var);
        this.I.setCallFragmentContextView(this.K);
        this.f38470n.addView(this.I, w7.b6.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.f38470n.addView(this.simpleActionBar);
        setBulletinDelegate(new z8(this, 0));
        if (this.f38473w) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.h0.f46123a;
            r0.z.i(view2, u8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(ArrayList arrayList, f9 f9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean j02 = j0(arrayList);
        ArrayList arrayList2 = this.H;
        if (j02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f19814id));
            }
            org.telegram.ui.Components.ep epVar = f9Var.e;
            if (epVar != null) {
                epVar.a(false, true);
            }
            n0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f19814id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.ep epVar2 = f9Var.e;
        if (epVar2 != null) {
            epVar2.a(true, true);
        }
        n0();
    }

    public final void f0() {
        this.f38469f.setTranslationY(((-this.T) - this.R) - this.S);
    }

    public final void g0() {
        org.telegram.ui.Components.u51 u51Var = this.f38468c;
        i0.c cVar = this.mSystemInsets;
        ei.b.e(u51Var, cVar.f7766b, cVar.d, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((int) this.I.c(org.telegram.messenger.i0.L(7.0f))), this.Q);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f7766b + ((int) this.I.c(org.telegram.messenger.i0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (ei.b.d(this.mSystemInsets.f7766b) - org.telegram.messenger.i0.L(14.0f)) - org.telegram.messenger.i0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.f38466a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f7766b;
        this.f38466a.setPadding(0, 0, 0, this.T + this.Q);
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f38468c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38468c, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        org.telegram.ui.Components.f10 f10Var = this.f38469f;
        if (f10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(f10Var.f25929c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38469f.f25929c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38469f.f25929c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q9));
        }
        return arrayList;
    }

    public final void h0(int i10, int i11) {
        if (this.D) {
            return;
        }
        this.D = true;
        jg.b1 b1Var = this.f38466a;
        if (b1Var != null && !this.E) {
            b1Var.d();
        }
        org.telegram.ui.Components.u51 u51Var = this.f38468c;
        if (u51Var != null) {
            u51Var.f30819f3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f19904q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new k(this, 1), 2), this.classGuid);
    }

    public final void i0(boolean z10) {
        org.telegram.ui.Components.ep epVar;
        this.simpleActionBar.r();
        this.H.clear();
        int childCount = this.f38468c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f38468c.getChildAt(i10);
            if ((childAt instanceof f9) && (epVar = ((f9) childAt).e) != null) {
                epVar.a(false, z10);
            }
        }
        this.f38468c.f30819f3.O(true);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f19814id))) {
                return true;
            }
        }
        return false;
    }

    public final void l0(boolean z10) {
        if (z10 == getUserConfig().W) {
            return;
        }
        org.telegram.messenger.d20 userConfig = getUserConfig();
        if (userConfig.W != z10) {
            userConfig.W = z10;
            userConfig.v(false);
        }
        this.f38468c.f30819f3.O(true);
        org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.O5, new Object[0]);
    }

    public final void n0() {
        boolean z10;
        boolean s10 = this.simpleActionBar.s();
        ArrayList arrayList = this.H;
        if (s10) {
            z10 = true;
            if (arrayList.isEmpty()) {
                i0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var.e == null) {
                i5Var.l().d(2, 2131232107, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
            }
            this.simpleActionBar.C();
            z10 = false;
        }
        this.simpleActionBar.y(arrayList.size(), z10);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.s()) {
            if (z10) {
                i0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.P && getUserConfig().W && org.telegram.messenger.vp.d1().getInt("hidecallshint", 0) < 2) {
            vh.p2 p2Var = new vh.p2(getParentActivity(), 1);
            this.f38471r = p2Var;
            p2Var.d = 3000L;
            p2Var.l(1.0f, -25.0f);
            this.f38471r.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
            this.f38471r.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744281, null)));
            this.f38470n.addView(this.f38471r, w7.b6.e(-1, 80, 48));
            this.f38471r.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(16.0f));
            this.f38471r.u();
            this.P = true;
            org.telegram.messenger.vp.d1().edit().putInt("hidecallshint", org.telegram.messenger.vp.d1().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        int i11 = 0;
        h0(0, 50);
        org.telegram.messenger.vp messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        xa.n nVar = this.O;
        if (nVar != null) {
            nVar.a();
            this.O = null;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar2 = new xa.n(notificationCenter, this);
        nVar2.e(1);
        nVar2.e(org.telegram.messenger.zs.f19710w);
        nVar2.e(org.telegram.messenger.zs.A2);
        nVar2.e(org.telegram.messenger.zs.T);
        nVar2.e(org.telegram.messenger.zs.f19713w2);
        this.O = nVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f38472s = bundle.getBoolean("needFinishFragment", true);
            this.f38473w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f38473w) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        this.Q = i10;
        if (this.f38473w) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        }
        this.R = i11;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        xa.n nVar = this.O;
        if (nVar != null) {
            nVar.a();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T = i13;
        g0();
        f0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i10 != 101 && i10 != 102 && i10 != 103) {
            return;
        }
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (iArr[i11] != 0) {
                    z10 = false;
                    break;
                }
                i11++;
            } else {
                z10 = true;
                break;
            }
        }
        TLRPC.UserFull userFull = null;
        if (iArr.length > 0 && z10) {
            if (i10 == 103) {
                org.telegram.ui.Components.voip.m1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().a2(this.L.f19942id);
            }
            TLRPC.User user = this.L;
            if (i10 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 != 102 && (userFull == null || !userFull.video_calls_available)) {
                z12 = false;
            } else {
                z12 = true;
            }
            org.telegram.ui.Components.voip.m1.m(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.m1.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u51 u51Var = this.f38468c;
        if (u51Var != null) {
            u51Var.f30819f3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.u51 u51Var = this.f38468c;
            if (u51Var != null) {
                int childCount = u51Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f38468c.getChildAt(i10);
                    if (childAt instanceof f9) {
                        ((f9) childAt).d.A(0);
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void u() {
        if (this.f38467b.L0() < 15) {
            this.f38468c.y0(0);
            return;
        }
        org.telegram.ui.Components.vj0 vj0Var = this.e;
        vj0Var.f31273b = 1;
        vj0Var.d(0, 0, false, false);
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public j9(Bundle bundle) {
        super(bundle);
        this.f38472s = true;
        this.f38475y = new ArrayList();
        this.H = new ArrayList();
        this.P = false;
    }
}
