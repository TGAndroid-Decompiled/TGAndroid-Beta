package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class lb extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public static int R0 = 10;
    public static final int[] S0 = {org.telegram.messenger.ns.T, org.telegram.messenger.ns.f25567s, org.telegram.messenger.ns.f25573t, org.telegram.messenger.ns.D, org.telegram.messenger.ns.G0};
    public HashMap A0;
    public boolean B0;
    public final za C0;
    public cb D0;
    public org.telegram.ui.Components.wi0 E;
    public final ArrayList E0;
    public ib F;
    public final a0.h F0;
    public TextView G;
    public xa G0;
    public lh.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.sn J;
    public qa J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.q1 K0;
    public ImageView L;
    public int L0;
    public di.tb M;
    public final kb M0;
    public org.telegram.ui.Cells.t0 N;
    public long N0;
    public org.telegram.ui.ActionBar.q0 O;
    public int O0;
    public long P;
    public int P0;
    public boolean Q;
    public final RectF Q0;
    public boolean R;
    public AnimatorSet S;
    public boolean T;
    public final int[] U;
    public boolean V;
    public boolean W;
    public lh.f X;
    public jb Y;
    public org.telegram.messenger.gj Z;
    public final ui.g f48925a;
    public TLRPC.ChannelParticipant f48926a0;
    public final dh.c f48927b;
    public FrameLayout f48928b0;
    public final dh.c f48929c;
    public ImageView f48930c0;
    public final dh.g d;
    public org.telegram.ui.ActionBar.j5 f48931d0;
    public final int f48932e;
    public k0 f48933e0;
    public final TLRPC.Chat f48934f;
    public j4 f48935f0;
    public TextureView f48936g0;
    public final ArrayList h;
    public int f48937h0;
    public int f48938i0;
    public boolean f48939j0;
    public boolean f48940k0;
    public final a0.h f48941l0;
    public final a0.h m0;
    public FrameLayout f48942n;
    public final HashMap f48943n0;
    public final ArrayList f48944o0;
    public final ArrayList f48945p0;
    public final HashSet f48946q0;
    public View f48947r;
    public boolean f48948r0;
    public RadialProgressView f48949s;
    public boolean f48950s0;
    public boolean f48951t0;
    public ArrayList f48952u0;
    public TLRPC.TL_channelAdminLogEventsFilter f48953v0;
    public di.c1 f48954w;
    public String f48955w0;
    public UndoView f48956x;
    public a0.h f48957x0;
    public jg.b0 f48958y;
    public final h2.f f48959y0;
    public final HashMap f48960z0;

    public lb(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.f48937h0 = -1;
        this.f48938i0 = 0;
        this.f48939j0 = true;
        this.f48940k0 = false;
        this.f48941l0 = new a0.h();
        this.m0 = new a0.h();
        this.f48943n0 = new HashMap();
        this.f48944o0 = new ArrayList();
        this.f48945p0 = new ArrayList();
        this.f48946q0 = new HashSet();
        this.f48953v0 = null;
        this.f48955w0 = "";
        this.f48959y0 = new h2.f(S0);
        this.f48960z0 = new HashMap();
        this.C0 = new za(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = Integer.MAX_VALUE;
        this.I0 = -1;
        this.M0 = new kb(this);
        this.O0 = -1;
        this.Q0 = new RectF();
        ri.q qVar = this.glassEngine;
        qVar.f56120a = new ra(this);
        qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        ?? obj = new Object();
        this.f48925a = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.f48927b = cVar;
        cVar.f8099j = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.gz.f()) {
            dh.g gVar = new dh.g(false);
            this.d = gVar;
            this.glassEngine.a(gVar);
            ui.f fVar = new ui.f(obj);
            fVar.d = gVar;
            fVar.f58439e = -3;
            fVar.f58440f = obj;
            if (org.telegram.messenger.qc.e(262144)) {
                ui.f fVar2 = new ui.f(obj);
                fVar2.d = gVar;
                fVar2.f58439e = -2;
                fVar2.f58440f = obj;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.f48929c = cVar2;
                cVar2.f8099j = this.glassEngine;
                if (org.telegram.messenger.qc.e(262144)) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                cVar2.d = L2;
                cVar2.f8095e = L2;
                cVar2.f8100k = true;
                this.f48932e = 0;
            } else {
                dh.c cVar3 = new dh.c(fVar, fVar, fVar);
                this.f48929c = cVar3;
                cVar3.f8099j = this.glassEngine;
                if (org.telegram.messenger.qc.e(262144)) {
                    L = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                cVar3.d = L;
                cVar3.f8095e = L;
                this.f48932e = org.telegram.messenger.g0.L(48.0f);
            }
        } else {
            this.d = null;
            this.f48932e = 0;
            dh.c cVar4 = new dh.c(obj, obj, obj);
            this.f48929c = cVar4;
            cVar4.f8099j = this.glassEngine;
        }
        this.f48934f = chat;
    }

    public static void A0(lb lbVar, org.telegram.messenger.gj gjVar) {
        if (lbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        if (gjVar.D == 3) {
            t1Var.U = org.telegram.messenger.hd.M0(2131748178, null);
        } else {
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131748205, gjVar.F0().mime_type);
        }
        lbVar.showDialog(t1Var);
    }

    public static int B0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int C0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int D0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int E0(lb lbVar) {
        return lbVar.classGuid;
    }

    public static void F0(lb lbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.np messagesController = lbVar.getMessagesController();
        TLRPC.Chat chat = lbVar.f48934f;
        TLRPC.ChatFull N0 = messagesController.N0(chat.f28051id);
        org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(lbVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, N0, hashMap, lbVar, N0.f28052id, false, org.telegram.messenger.t3.T(chat));
        p50Var.f38208e2 = new ab(lbVar);
        p50Var.show();
    }

    public static org.telegram.ui.ActionBar.k L0(lb lbVar) {
        return lbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k M0(lb lbVar) {
        return lbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k N0(lb lbVar) {
        return lbVar.actionBar;
    }

    public static int O0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static void P0(lb lbVar) {
        if (lbVar.f48954w != null && !lbVar.f48944o0.isEmpty()) {
            lbVar.f48958y.h1(lbVar.f48945p0.size() - 1, (-100000) - lbVar.f48954w.getPaddingTop());
        }
    }

    public static int Q0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static tw0 X0(CharSequence charSequence) {
        org.telegram.ui.Components.eq[] eqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.eq eqVar : (org.telegram.ui.Components.eq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.eq.class)) {
                if (eqVar != null) {
                    Drawable drawable = eqVar.f34410c;
                    if (drawable instanceof tw0) {
                        return (tw0) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void Z(lb lbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.gj gjVar;
        a0.h hVar = lbVar.f48941l0;
        int i7 = 0;
        lbVar.D0.N = false;
        lbVar.b1(false);
        org.telegram.messenger.np.s1(lbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.np.s1(lbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = lbVar.f48944o0;
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.f28083id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                lbVar.P = Math.min(lbVar.P, tL_channelAdminLogEvent.f28083id);
                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(lbVar.currentAccount, tL_channelAdminLogEvent, arrayList, lbVar.f48943n0, lbVar.f48934f, lbVar.U, false);
                if (gjVar2.U >= 0) {
                    hVar.k(gjVar2, tL_channelAdminLogEvent.f28083id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(size);
            if (gjVar3 != null && gjVar3.U != 0 && gjVar3.L1() >= 0) {
                lbVar.m0.k(gjVar3, gjVar3.L1());
            }
            if (gjVar3 != null && (message = gjVar3.f23819k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (size != i11) {
                                gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
                                if (gjVar.U != 1 && gjVar.L1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i11++;
                        } else {
                            gjVar = null;
                            break;
                        }
                    }
                    if (gjVar != null) {
                        gjVar3.C = gjVar;
                    }
                }
                arrayList2.add(gjVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.si.b0(lbVar.currentAccount).X0(arrayList2, -lbVar.f48934f.f28051id, 0, 0L, new qa(lbVar, 1), lbVar.getClassGuid(), null);
        }
        lbVar.W0();
        lbVar.f48950s0 = false;
        if (!z10) {
            lbVar.f48948r0 = true;
        }
        org.telegram.messenger.g0.Y3(lbVar.f48942n, false, 0.3f, true, true);
        lbVar.f48954w.setEmptyView(lbVar.I);
        ib ibVar = lbVar.F;
        if (ibVar != null) {
            ibVar.f();
        }
        org.telegram.ui.ActionBar.q0 q0Var = lbVar.O;
        if (q0Var != null) {
            if (lbVar.f48945p0.isEmpty() && TextUtils.isEmpty(lbVar.f48955w0)) {
                i7 = 8;
            }
            q0Var.setVisibility(i7);
        }
    }

    public static void a0(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && lbVar.getParentActivity() != null) {
            int i7 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 0, lbVar.getParentActivity(), lbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
            Rect rect = new Rect();
            lbVar.getParentActivity().getResources().getDrawable(2131232565).mutate().getPadding(rect);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, lbVar.getResourceProvider());
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                if (arrayList4.get(i10) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(lbVar.getParentActivity(), lbVar.getResourceProvider()), c8.ja.o(-1, 8));
                } else {
                    Activity parentActivity = lbVar.getParentActivity();
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == size - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, parentActivity, lbVar.getResourceProvider(), z10, z11);
                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    z0Var.j((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                    if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                        z0Var.d(lbVar.getThemedColor(org.telegram.ui.ActionBar.j6.f29090q7), lbVar.getThemedColor(org.telegram.ui.ActionBar.j6.f29070p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    z0Var.setOnClickListener(new fi.l5(lbVar, i10, arrayList4, (Integer) arrayList4.get(i10), 1));
                }
                i10++;
                arrayList4 = arrayList;
            }
            wa waVar = new wa(0, lbVar.Y.getContext(), lbVar);
            waVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ja.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            waVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            xa xaVar = new xa(lbVar, waVar);
            lbVar.G0 = xaVar;
            xaVar.f28555e = true;
            xaVar.f28554c = 220;
            xaVar.setOutsideTouchable(true);
            lbVar.G0.setClippingEnabled(true);
            lbVar.G0.setAnimationStyle(2131755192);
            lbVar.G0.setFocusable(true);
            waVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            lbVar.G0.setInputMethodMode(2);
            lbVar.G0.setSoftInputMode(48);
            lbVar.G0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f10)) - waVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.g0.L(28.0f);
            if (left < org.telegram.messenger.g0.L(6.0f)) {
                left = org.telegram.messenger.g0.L(6.0f);
            } else if (left > (lbVar.f48954w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - waVar.getMeasuredWidth()) {
                left = (lbVar.f48954w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - waVar.getMeasuredWidth();
            }
            if (org.telegram.messenger.g0.Q1()) {
                int[] iArr = new int[2];
                lbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = lbVar.Y.getHeight();
            int L = org.telegram.messenger.g0.L(48.0f) + waVar.getMeasuredHeight();
            int Q = lbVar.Y.Q();
            if (Q > org.telegram.messenger.g0.L(20.0f)) {
                height += Q;
            }
            if (L < height) {
                int y10 = (int) (lbVar.f48954w.getY() + view.getTop() + f11);
                if ((L - rect.top) - rect.bottom > org.telegram.messenger.g0.L(240.0f)) {
                    i7 = (org.telegram.messenger.g0.L(240.0f) - L) + y10;
                } else {
                    i7 = y10;
                }
                if (i7 < lbVar.f48954w.getY() + org.telegram.messenger.g0.L(24.0f)) {
                    i7 = (int) (lbVar.f48954w.getY() + org.telegram.messenger.g0.L(24.0f));
                } else {
                    int i11 = height - L;
                    if (i7 > i11 - org.telegram.messenger.g0.L(8.0f)) {
                        i7 = i11 - org.telegram.messenger.g0.L(8.0f);
                    }
                }
            } else if (!lbVar.inBubbleMode) {
                i7 = org.telegram.messenger.g0.f23605m;
            }
            waVar.setMaxHeight(height - i7);
            lbVar.G0.showAtLocation(lbVar.f48954w, 51, left, i7);
            lbVar.G0.b();
        }
    }

    public static void b0(org.telegram.ui.lb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.b0(org.telegram.ui.lb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void c0(lb lbVar, int i7) {
        dh.g gVar = lbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                ti.a e10 = lbVar.glassEngine.e();
                e10.b(lbVar.f48954w.getY(), lbVar.Y.getWidth(), lbVar.f48954w.getY() + lbVar.f48954w.getHeight());
                gVar.h(e10);
            }
            jb jbVar = lbVar.Y;
            Objects.requireNonNull(jbVar);
            gVar.e(new oa(jbVar, 0), lbVar.Y.getWidth(), lbVar.Y.getHeight());
        }
    }

    public static void d0(lb lbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = lbVar.f48941l0;
        lbVar.f48951t0 = false;
        lbVar.D0.N = false;
        lbVar.b1(false);
        org.telegram.messenger.np.s1(lbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.np.s1(lbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i7 = 0; i7 < tL_channels_adminLogResults.events.size(); i7++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i7);
            if (hVar.h(tL_channelAdminLogEvent2.f28083id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                lbVar.P = Math.min(lbVar.P, tL_channelAdminLogEvent2.f28083id);
                org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(lbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, lbVar.f48934f, lbVar.U, false);
                if (gjVar.U >= 0 && (((tL_channelAdminLogEvent = gjVar.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f28083id))) {
                    lbVar.f48944o0.add(0, gjVar);
                    hVar.k(gjVar, tL_channelAdminLogEvent2.f28083id);
                    z10 = true;
                }
            }
        }
        if (lbVar.F != null && z10) {
            lbVar.W0();
            lbVar.F.f();
        }
    }

    public static void e0(lb lbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull N0;
        TLRPC.Chat chat = lbVar.f48934f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            lbVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
            lbVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
            lbVar.f48952u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (N0 = lbVar.getMessagesController().N0(chat.f28051id)) != null && N0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = lbVar.getMessagesController().f25281f5;
                channelParticipant.peer = lbVar.getMessagesController().z1(channelParticipant.user_id);
                long j3 = lbVar.getMessagesController().f25281f5;
                if (lbVar.getMessagesController().a2(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.f28194id.add(tL_inputUser);
                    ConnectionsManager.getInstance(lbVar.currentAccount).sendRequest(tL_users_getUsers, new pa(lbVar, 1));
                }
                lbVar.f48952u0.add(0, channelParticipant);
            }
            Dialog dialog = lbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.f0) {
                ((org.telegram.ui.Components.f0) dialog).e1(lbVar.f48952u0);
            }
        }
    }

    public static void e1(int i7, org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return;
        }
        if (i7 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = gjVar.f23819k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = gjVar.f23819k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            gjVar.f23819k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.hd.G(i7, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        gjVar.i5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t6 = org.telegram.messenger.g0.t(spannableStringBuilder, "\n\n");
        if (t6 >= 0 && Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(8.0f)), t6 + 1, t6 + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int q0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int r0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int s0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int t0(lb lbVar) {
        return lbVar.classGuid;
    }

    public static void u0(org.telegram.ui.lb r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.u0(org.telegram.ui.lb, android.os.Bundle, long):void");
    }

    public static int v0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int w0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int x0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int y0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static int z0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public final org.telegram.messenger.gj S0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        String str;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f48945p0;
            gjVar = null;
            if (i7 < arrayList2.size()) {
                gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i7);
                if (gjVar2 != null && gjVar2.U == 1 && gjVar2.J0 == j3) {
                    break;
                }
                i7++;
            } else {
                gjVar2 = null;
                break;
            }
        }
        if (gjVar2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f48934f.f28051id;
            tL_message.f28072id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.gj) arrayList.get(0)).f23819k.date;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            gjVar2 = new org.telegram.messenger.gj(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        gjVar2.U = 1;
        if (z11 && arrayList.size() > 1) {
            gjVar2.J0 = j3;
        } else {
            gjVar2.J0 = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new aa.l(9)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                lb lbVar = lb.this;
                lbVar.getClass();
                if (l10.longValue() < 0) {
                    TLRPC.Chat M0 = lbVar.getMessagesController().M0(Long.valueOf(-l10.longValue()));
                    if (M0 == null) {
                        return null;
                    }
                    return M0.title;
                }
                return org.telegram.messenger.q10.k(lbVar.getMessagesController().a2(l10));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new aa.m(5)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gj.E5(org.telegram.messenger.hd.G(arrayList.size(), str, join), "un1", a22));
        if (z11 && arrayList.size() > 1) {
            tw0 X0 = X0(gjVar2.v);
            int i10 = 2131751035;
            if (X0 == null) {
                if (z10) {
                    i10 = 2131751036;
                }
                X0 = new tw0(org.telegram.messenger.hd.M0(i10, null));
                Typeface o4 = org.telegram.messenger.g0.o();
                org.telegram.ui.Components.g6 g6Var = X0.f51679a;
                g6Var.x(o4);
                g6Var.w(org.telegram.messenger.g0.L(10.0f));
                if (X0.f51681c != -1) {
                    X0.f51681c = -1;
                    X0.invalidateSelf();
                }
                X0.a(503316480);
            } else {
                org.telegram.ui.Components.g6 g6Var2 = X0.f51679a;
                if (z10) {
                    i10 = 2131751036;
                }
                g6Var2.t(org.telegram.messenger.hd.M0(i10, null), false, true);
            }
            X0.setBounds(0, 0, X0.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(0, X0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        gjVar2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
        }
        if (gjVar != null) {
            long j11 = gjVar.T;
            a0.h hVar = this.F0;
            if (!hVar.d(j11)) {
                long j12 = gjVar.T;
                int i11 = R0;
                R0 = i11 + 1;
                hVar.k(Integer.valueOf(i11), j12);
            }
            gjVar2.f23829m1 = ((Integer) hVar.f(gjVar.T)).intValue();
        }
        return gjVar2;
    }

    public final void T0(boolean z10) {
        int abs;
        jg.b0 b0Var = this.f48958y;
        if (b0Var != null && !this.f48939j0) {
            int L0 = b0Var.L0();
            int i7 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f48958y.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.F.getClass();
                if (z10) {
                    i7 = 4;
                }
                if (L0 <= i7 && !this.f48950s0 && !this.f48948r0) {
                    Z0(false);
                }
            }
        }
    }

    public final boolean U0(android.view.View r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.U0(android.view.View, float, float):boolean");
    }

    public final TextureView V0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f48933e0 == null) {
            k0 k0Var = new k0(4, getParentActivity(), this);
            this.f48933e0 = k0Var;
            k0Var.setOutlineProvider(new bg.p0(9));
            this.f48933e0.setClipToOutline(true);
            this.f48933e0.setWillNotDraw(false);
            this.f48933e0.setVisibility(4);
            j4 j4Var = new j4(getParentActivity());
            this.f48935f0 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z10) {
                this.f48933e0.addView(this.f48935f0, c8.ja.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f48936g0 = textureView;
            textureView.setOpaque(false);
            this.f48935f0.addView(this.f48936g0, c8.ja.c(-1.0f, -1));
        }
        if (this.f48933e0.getParent() == null) {
            jb jbVar = this.Y;
            k0 k0Var2 = this.f48933e0;
            int i7 = org.telegram.messenger.g0.f23615u;
            jbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i7, i7));
        }
        this.f48933e0.setVisibility(4);
        this.f48935f0.setDrawingReady(false);
        return this.f48936g0;
    }

    public final void W0() {
        long j3;
        org.telegram.messenger.gj gjVar;
        long j10;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = this.f48944o0;
            if (i11 < arrayList4.size()) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList4.get(i11);
                if (gjVar2 != null && (tL_channelAdminLogEvent2 = gjVar2.L1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j3 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j3 = 0;
                }
                if (gjVar2.f23829m1 <= 0) {
                    int i12 = R0;
                    R0 = i12 + 1;
                    gjVar2.f23829m1 = i12;
                }
                int i13 = i11 + 1;
                if (i13 < arrayList4.size()) {
                    gjVar = (org.telegram.messenger.gj) arrayList4.get(i13);
                } else {
                    gjVar = null;
                }
                if (gjVar != null && (tL_channelAdminLogEvent = gjVar.L1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent.user_id;
                } else {
                    j10 = 0;
                }
                if (j3 != 0) {
                    arrayList3.add(gjVar2);
                } else {
                    arrayList2.add(gjVar2);
                }
                if (j3 != j10 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = gjVar2.f23819k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.gj) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((org.telegram.messenger.gj) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) i5.c.h(1, arrayList3);
                        if (TextUtils.isEmpty(this.f48955w0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(gjVar3.T);
                        HashSet hashSet = this.f48946q0;
                        if (!hashSet.contains(valueOf) && z11) {
                            e1(arrayList3.size() - 1, gjVar3);
                            arrayList2.add(gjVar3);
                        } else {
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                e1(0, (org.telegram.messenger.gj) arrayList3.get(i14));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = gjVar3.f23819k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z10 != z12) {
                            gjVar3.M1 = true;
                            ib ibVar = this.F;
                            if (z10) {
                                i7 = arrayList3.size() - 1;
                            } else {
                                i7 = 0;
                            }
                            ibVar.g(i7 + size);
                            ib ibVar2 = this.F;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            ibVar2.g(size + i10 + 1);
                        }
                        long j11 = gjVar2.T;
                        arrayList = arrayList3;
                        arrayList2.add(S0(j11, gjVar2.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) i5.c.h(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(S0(gjVar4.T, gjVar4.L1.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i11 = i13;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f48945p0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void Y0(boolean z10) {
        if (this.N.getTag() != null && !this.Q) {
            if (!this.T || this.R) {
                this.N.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.S = animatorSet;
                    animatorSet.setDuration(150L);
                    this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
                    this.S.addListener(new org.telegram.ui.Cells.w9(this, 2));
                    this.S.setStartDelay(500L);
                    this.S.start();
                    return;
                }
                AnimatorSet animatorSet2 = this.S;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.S = null;
                }
                this.N.setAlpha(0.0f);
            }
        }
    }

    public final void Z0(boolean z10) {
        ib ibVar;
        if (!this.f48950s0) {
            ArrayList arrayList = this.f48944o0;
            if (z10) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f48942n;
                if (frameLayout != null) {
                    org.telegram.messenger.g0.Y3(frameLayout, true, 0.3f, true, true);
                    this.I.setVisibility(4);
                    this.f48954w.setEmptyView(null);
                }
                this.f48941l0.b();
                arrayList.clear();
                this.f48943n0.clear();
                W0();
            }
            this.f48950s0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = org.telegram.messenger.np.i1(this.f48934f);
            tL_channels_getAdminLog.f28086q = this.f48955w0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.P;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f48953v0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f48957x0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i7 = 0; i7 < this.f48957x0.m(); i7++) {
                    tL_channels_getAdminLog.admins.add(org.telegram.messenger.np.s1(this.currentAccount).q1((TLRPC.User) this.f48957x0.n(i7)));
                }
            }
            g1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 3));
            if (z10 && (ibVar = this.F) != null) {
                ibVar.f();
            }
        }
    }

    public final void a1() {
        if (this.f48951t0) {
            return;
        }
        this.f48951t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.np.i1(this.f48934f);
        tL_channels_getAdminLog.f28086q = this.f48955w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f48953v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f48957x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i7 = 0; i7 < this.f48957x0.m(); i7++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.np.s1(this.currentAccount).q1((TLRPC.User) this.f48957x0.n(i7)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 0));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29211wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29192vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28931hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28986kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28967jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29019md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28800af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29003ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29268ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29248ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29266zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29229xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29246yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29210we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29173ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29190vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29153te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29171uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29134se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29151tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29116re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29132sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29097qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29114rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29077pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29095qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29020me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29057oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29018mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28985ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29002lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28966je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28983kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28948ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28837cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28912ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28873ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28964jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28875ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28819be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28946ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28799ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28928hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29267zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29228xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29209wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29093qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29109r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29265zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29191vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29172ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29152td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29133sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29115rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29096qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29076pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29056od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28855dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28838cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28798ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29208wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29189vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29170ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29150tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29051o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29033n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29016m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28998l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28980k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28960j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28942i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    public final void b1(boolean z10) {
        int i7;
        long j3;
        di.c1 c1Var = this.f48954w;
        if (c1Var != null && this.f48958y != null && c1Var.getChildCount() > 0) {
            if (z10) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.q1 q1Var = null;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f48954w.getChildCount(); i11++) {
                View childAt = this.f48954w.getChildAt(i11);
                this.f48954w.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i7) {
                        }
                        i7 = childAt.getTop();
                        q1Var = childAt;
                        i10 = R;
                    } else {
                        if (top <= i7) {
                        }
                        i7 = childAt.getTop();
                        q1Var = childAt;
                        i10 = R;
                    }
                }
            }
            if (q1Var != null) {
                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                    j3 = q1Var.getMessageObject().T;
                } else if (q1Var instanceof org.telegram.ui.Cells.t0) {
                    j3 = q1Var.getMessageObject().T;
                } else {
                    j3 = 0;
                }
                this.N0 = j3;
                this.O0 = i10;
                this.P0 = (this.f48954w.getMeasuredHeight() - q1Var.getBottom()) - this.f48954w.getPaddingBottom();
            }
        }
    }

    public final int c1(org.telegram.messenger.gj gjVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i7;
        StaticLayout staticLayout;
        float lineTop;
        float f10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ej ejVar;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(gjVar.f23877z) && (q1Var = this.K0) != null && (ejVar = q1Var.f31062m3) != null) {
                i7 = (int) q1Var.f31157t3;
                charSequence = gjVar.f23877z;
                arrayList = ejVar.f23317e;
            } else {
                CharSequence charSequence2 = gjVar.v;
                arrayList = gjVar.B2;
                org.telegram.ui.Cells.q1 q1Var2 = this.K0;
                if (q1Var2 != null && q1Var2.f31182v1) {
                    i7 = q1Var2.W1 + org.telegram.messenger.g0.L(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i7 = 0;
                }
            }
            org.telegram.ui.Cells.q1 q1Var3 = this.K0;
            if (q1Var3 != null) {
                q1Var3.f31007hd = 0;
                q1Var3.f31020id = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.gj.Y(this.I0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) arrayList.get(i10);
                        String charSequence3 = djVar.f23101e.getText().toString();
                        int i11 = djVar.f23103n;
                        if (Y > i11) {
                            if (Y - i11 > charSequence3.length() - 1) {
                                lineTop = i7 + ((int) (djVar.o(arrayList) + djVar.f23102f + djVar.f23106w));
                            } else {
                                lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(Y - djVar.f23103n)) + djVar.o(arrayList) + i7 + djVar.f23102f;
                            }
                            Point point = org.telegram.messenger.g0.f23611q;
                            float f11 = point.y;
                            float f12 = 0.5f;
                            if (this.Y.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
                                f10 = 0.7f;
                            } else {
                                f10 = 0.5f;
                            }
                            if (lineTop > f11 * f10) {
                                float f13 = point.y;
                                if (this.Y.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
                                    f12 = 0.7f;
                                }
                                return (int) (lineTop - (f13 * f12));
                            }
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            org.telegram.ui.Cells.q1 q1Var4 = this.K0;
            if (q1Var4 != null) {
                q1Var4.f31007hd = 0;
                q1Var4.f31020id = null;
            }
        }
        return 0;
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i7 = 0; i7 < 8; i7++) {
                arrayList.add(new org.telegram.ui.Cells.q1(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.j6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 3));
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, null);
        this.J = snVar;
        ok okVar = snVar.h;
        if (okVar != null) {
            okVar.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        }
        ok okVar2 = snVar.f39366r;
        if (okVar2 != null) {
            okVar2.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        }
        snVar.m0 = true;
        this.J.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.addView(this.J, 0, c8.ja.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232487);
        a10.O();
        a10.I = new kg.x1(this, 1);
        this.O = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.sn snVar2 = this.J;
        TLRPC.Chat chat = this.f48934f;
        snVar2.setTitle(chat.title);
        this.J.setSubtitle(org.telegram.messenger.hd.M0(2131751074, null));
        this.J.setChatAvatar(chat);
        bb bbVar = new bb(this, context);
        this.fragmentView = bbVar;
        this.Y = bbVar;
        bbVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.Y.U(org.telegram.ui.ActionBar.j6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        hh.b o4 = c8.g0.o(this.resourceProvider);
        dh.c cVar = this.f48929c;
        kVar.P(cVar, o4, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, c8.ja.e(-1, -2, 17));
        this.I.setOnTouchListener(new gi.a(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.v5(this.M, this.Y, org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.j6.f28883f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(2131231611);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, c8.ja.t(54, 54, 17, 16, 20, 16, -4));
        di.tb tbVar = new di.tb(context, 10);
        this.M = tbVar;
        tbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        di.tb tbVar2 = this.M;
        int i10 = org.telegram.ui.ActionBar.j6.Zc;
        org.telegram.ui.ActionBar.q6.U(tbVar2, i10, null);
        this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        this.K.addView(this.M, c8.ja.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, c8.ja.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        di.c1 c1Var = new di.c1(9, context, this);
        this.f48954w = c1Var;
        c1Var.setOnItemClickListener(new f(this, 7));
        this.f48954w.setTag(1);
        this.f48954w.setVerticalScrollBarEnabled(true);
        di.c1 c1Var2 = this.f48954w;
        ib ibVar = new ib(this, context);
        this.F = ibVar;
        c1Var2.setAdapter(ibVar);
        this.f48954w.setClipToPadding(false);
        di.c1 c1Var3 = this.f48954w;
        int i11 = org.telegram.messenger.g0.f23605m;
        int i12 = this.f48932e;
        c1Var3.setPadding(0, org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + i12, 0, org.telegram.messenger.g0.L(60.0f) + i12 + org.telegram.messenger.g0.f23606n);
        di.c1 c1Var4 = this.f48954w;
        cb cbVar = new cb(this, this.f48954w, this.resourceProvider);
        this.D0 = cbVar;
        c1Var4.setItemAnimator(cbVar);
        this.D0.Q = true;
        this.f48954w.setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(this);
        this.f48958y = b0Var;
        b0Var.j1(1);
        this.f48958y.l1(true);
        this.f48954w.setLayoutManager(this.f48958y);
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(this.f48954w, this.f48958y);
        this.E = wi0Var;
        wi0Var.h = new ra(this);
        wi0Var.f41362i = this.M0;
        this.Y.addView(this.f48954w, c8.ja.c(-1.0f, -1));
        this.f48954w.setOnScrollListener(new g3(this));
        this.glassEngine.b(this.f48954w);
        int i13 = this.f48937h0;
        if (i13 != -1) {
            this.f48958y.h1(i13, this.f48938i0);
            this.f48937h0 = -1;
        }
        lh.f fVar = new lh.f(context);
        this.X = fVar;
        fVar.setup(this.f48927b);
        this.X.setFadeZoneTop(org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m);
        this.X.setFadeHeightTop(org.telegram.messenger.g0.L(60.0f));
        this.X.setFadeZoneBottom(org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(44.0f) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.f23606n);
        this.X.setFadeHeightBottom(org.telegram.messenger.g0.L(60.0f));
        this.Y.addView(this.X, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48942n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.f48942n, c8.ja.e(-1, -1, 51));
        View view = new View(context);
        this.f48947r = view;
        view.setBackground(new org.telegram.ui.ActionBar.v5(this.f48947r, this.Y, org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.j6.f28883f2));
        this.f48942n.addView(this.f48947r, c8.ja.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f48949s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        this.f48949s.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        this.f48942n.addView(this.f48949s, c8.ja.e(32, 32, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        this.N = t0Var;
        t0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, c8.ja.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        lh.e eVar = new lh.e(context, cVar, c8.g0.b(e6Var), e6Var);
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-org.telegram.messenger.g0.f23606n);
        this.H.c(4, true, false);
        lh.e eVar2 = this.H;
        fh.g c10 = eVar2.f19495n.c(eVar2, null, false);
        c10.p(eVar2.f19496r);
        org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        eVar2.f19497s = c10;
        this.Y.addView(this.H, c8.ja.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final lb f51515b;

            {
                this.f51515b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                lb lbVar = this.f51515b;
                switch (i14) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(lbVar, lbVar.f48953v0, lbVar.f48957x0, lbVar.f48934f.megagroup);
                            f0Var.e1(lbVar.f48952u0);
                            f0Var.f34464c2 = new ra(lbVar);
                            lbVar.showDialog(f0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f48934f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750977, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750976, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                        t1Var.S = org.telegram.messenger.hd.M0(2131750975, null);
                        lbVar.showDialog(t1Var);
                        return;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.o(lbVar.getParentActivity(), new na(lbVar, 0), null).f25806b);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(this.G, org.telegram.ui.ActionBar.j6.f29135sf, null);
        this.G.setText(org.telegram.messenger.hd.M0(2131745983, null));
        this.G.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        this.H.getContainer().addView(this.G, c8.ja.e(-2, -2, 17));
        this.H.f19494f.add(this.G);
        this.H.d(false);
        this.H.f19491b[4] = new View.OnClickListener(this) {
            public final lb f51515b;

            {
                this.f51515b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                lb lbVar = this.f51515b;
                switch (i14) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(lbVar, lbVar.f48953v0, lbVar.f48957x0, lbVar.f48934f.megagroup);
                            f0Var.e1(lbVar.f48952u0);
                            f0Var.f34464c2 = new ra(lbVar);
                            lbVar.showDialog(f0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f48934f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750977, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750976, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                        t1Var.S = org.telegram.messenger.hd.M0(2131750975, null);
                        lbVar.showDialog(t1Var);
                        return;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.o(lbVar.getParentActivity(), new na(lbVar, 0), null).f25806b);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f48928b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f48928b0.setVisibility(4);
        this.f48928b0.setFocusable(true);
        this.f48928b0.setFocusableInTouchMode(true);
        this.f48928b0.setClickable(true);
        this.f48928b0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.Y.addView(this.f48928b0, c8.ja.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f48930c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f48930c0.setImageResource(2131232077);
        org.telegram.ui.ActionBar.q6.s(this.f48930c0, org.telegram.ui.ActionBar.j6.f29078pf, null, PorterDuff.Mode.MULTIPLY);
        this.f48928b0.addView(this.f48930c0, c8.ja.e(48, 48, 53));
        this.f48930c0.setOnClickListener(new View.OnClickListener(this) {
            public final lb f51515b;

            {
                this.f51515b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                lb lbVar = this.f51515b;
                switch (i14) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(lbVar, lbVar.f48953v0, lbVar.f48957x0, lbVar.f48934f.megagroup);
                            f0Var.e1(lbVar.f48952u0);
                            f0Var.f34464c2 = new ra(lbVar);
                            lbVar.showDialog(f0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f48934f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750977, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750976, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                        t1Var.S = org.telegram.messenger.hd.M0(2131750975, null);
                        lbVar.showDialog(t1Var);
                        return;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.o(lbVar.getParentActivity(), new na(lbVar, 0), null).f25806b);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f48931d0 = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.qf, null);
        this.f48931d0.setTextSize(15);
        this.f48931d0.setTypeface(org.telegram.messenger.g0.o());
        this.f48928b0.addView(this.f48931d0, c8.ja.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.f48950s0 && this.f48944o0.isEmpty()) {
            org.telegram.messenger.g0.Y3(this.f48942n, true, 0.3f, true, true);
            this.f48954w.setEmptyView(null);
        } else {
            org.telegram.messenger.g0.Y3(this.f48942n, false, 0.3f, true, true);
            this.f48954w.setEmptyView(this.I);
        }
        di.c1 c1Var5 = this.f48954w;
        c1Var5.X1 = true;
        c1Var5.Y1 = 1;
        UndoView undoView = new UndoView(context);
        this.f48956x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.Y.addView(this.f48956x, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    public final void d1(org.telegram.messenger.gj r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.d1(org.telegram.messenger.gj):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.gj messageObject2;
        org.telegram.ui.Cells.q1 q1Var3;
        org.telegram.messenger.gj messageObject3;
        boolean z10;
        if (i7 == org.telegram.messenger.ns.f25515i4) {
            di.c1 c1Var = this.f48954w;
            if (c1Var != null) {
                c1Var.g1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.f25507h2) {
            if (((org.telegram.messenger.gj) objArr[0]).h4()) {
                MediaController.B().p0(V0(true), this.f48935f0, this.f48933e0, true);
                int childCount = this.f48954w.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        View childAt = this.f48954w.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt;
                            org.telegram.messenger.gj messageObject4 = q1Var4.getMessageObject();
                            if (this.f48933e0 != null && messageObject4.h4() && MediaController.B().I(messageObject4)) {
                                ImageReceiver photoImage = q1Var4.getPhotoImage();
                                this.f48933e0.setTranslationX(photoImage.L0);
                                this.f48933e0.setTranslationY(q1Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                                this.fragmentView.invalidate();
                                this.f48933e0.invalidate();
                                z10 = true;
                                break;
                            }
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (this.f48933e0 != null) {
                    org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                    if (!z10) {
                        this.f48933e0.setTranslationY((-org.telegram.messenger.g0.f23615u) - 100);
                        this.fragmentView.invalidate();
                        if (gjVar != null && gjVar.h4() && (this.W || PipRoundVideoView.G != null)) {
                            MediaController.B().k0(false);
                        }
                    } else {
                        MediaController.B().k0(true);
                    }
                }
            }
            di.c1 c1Var2 = this.f48954w;
            if (c1Var2 != null) {
                int childCount2 = c1Var2.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.f48954w.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject3 = (q1Var3 = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null) {
                        if (!org.telegram.messenger.gj.R4(messageObject3.f23819k) && !messageObject3.I3()) {
                            if (messageObject3.h4()) {
                                q1Var3.p0(null, false);
                                if (!MediaController.B().I(messageObject3) && messageObject3.f23779b0 != 0.0f) {
                                    messageObject3.G5();
                                    q1Var3.invalidate();
                                }
                            }
                        } else {
                            q1Var3.P3(false, true, false);
                        }
                    }
                }
            }
        } else if (i7 != org.telegram.messenger.ns.f25495f2 && i7 != org.telegram.messenger.ns.f25501g2) {
            if (i7 == org.telegram.messenger.ns.f25489e2) {
                Integer num = (Integer) objArr[0];
                di.c1 c1Var3 = this.f48954w;
                if (c1Var3 != null) {
                    int childCount3 = c1Var3.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = this.f48954w.getChildAt(i13);
                        if ((childAt3 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = (q1Var2 = (org.telegram.ui.Cells.q1) childAt3).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                            org.telegram.messenger.gj gjVar2 = MediaController.B().f22377v0;
                            if (gjVar2 != null) {
                                messageObject2.f23779b0 = gjVar2.f23779b0;
                                messageObject2.f23811i0 = gjVar2.f23811i0;
                                messageObject2.f23816j0 = gjVar2.f23816j0;
                                q1Var2.T3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.ns.f25619z4 && this.fragmentView != null) {
                this.Y.U(org.telegram.ui.ActionBar.j6.s0());
                this.f48947r.invalidate();
                di.tb tbVar = this.M;
                if (tbVar != null) {
                    tbVar.invalidate();
                }
                this.f48954w.g1();
            }
        } else {
            di.c1 c1Var4 = this.f48954w;
            if (c1Var4 != null) {
                int childCount4 = c1Var4.getChildCount();
                for (int i14 = 0; i14 < childCount4; i14++) {
                    View childAt4 = this.f48954w.getChildAt(i14);
                    if ((childAt4 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt4).getMessageObject()) != null) {
                        if (!org.telegram.messenger.gj.R4(messageObject.f23819k) && !messageObject.I3()) {
                            if (messageObject.h4() && !MediaController.B().I(messageObject)) {
                                q1Var.p0(null, true);
                            }
                        } else {
                            q1Var.P3(false, true, false);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void g1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f48955w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748201, null)));
        } else if (this.f48957x0 == null && this.f48953v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            if (this.f48934f.megagroup) {
                di.tb tbVar = this.M;
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751012, null));
                f1(X2);
                tbVar.setText(X2);
                return;
            }
            di.tb tbVar2 = this.M;
            SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751011, null));
            f1(X22);
            tbVar2.setText(X22);
        } else {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748200, null)));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28797ac));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29037nc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29075pc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29055oc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28913gf));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48954w, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29230xf));
        View view = this.f48947r;
        int i7 = org.telegram.ui.ActionBar.j6.f28838cd;
        arrayList.add(new org.telegram.ui.ActionBar.s6(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        return arrayList;
    }

    public final void h1() {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.gj messageObject;
        int i7;
        di.c1 c1Var = this.f48954w;
        if (c1Var == null) {
            return;
        }
        int childCount = c1Var.getChildCount();
        int measuredHeight = this.f48954w.getMeasuredHeight();
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.q1 q1Var = null;
        View view = null;
        View view2 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f48954w.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                y1Var.f32053f = y10;
                y1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int top = q1Var2.getTop();
                q1Var2.getBottom();
                if (top >= 0) {
                    i7 = 0;
                } else {
                    i7 = -top;
                }
                int measuredHeight2 = q1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i7 + measuredHeight;
                }
                q1Var2.B3(i7, measuredHeight2 - i7, (this.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - this.f48954w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.gj messageObject2 = q1Var2.getMessageObject();
                if (this.f48933e0 != null && messageObject2.h4() && MediaController.B().I(messageObject2)) {
                    ImageReceiver photoImage = q1Var2.getPhotoImage();
                    this.f48933e0.setTranslationX(photoImage.L0);
                    this.f48933e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.f48933e0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) childAt;
                t0Var2.j0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (t0Var2.T()) {
                    t0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.f48954w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.q1) || (childAt instanceof org.telegram.ui.Cells.t0)) {
                        q1Var = childAt;
                    }
                    i10 = bottom;
                    view2 = childAt;
                }
                cb cbVar = this.D0;
                if ((cbVar == null || (!cbVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.t0) && ((org.telegram.ui.Cells.t0) childAt).getMessageObject().f23825l0) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i11) {
                        i11 = bottom;
                        view = childAt;
                    }
                }
            }
        }
        k0 k0Var = this.f48933e0;
        if (k0Var != null) {
            if (!z11) {
                k0Var.setTranslationY((-org.telegram.messenger.g0.f23615u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                if (gjVar != null && gjVar.h4() && this.W) {
                    MediaController.B().k0(false);
                }
            } else {
                MediaController.B().k0(true);
            }
        }
        if (q1Var != null) {
            if (q1Var instanceof org.telegram.ui.Cells.q1) {
                messageObject = q1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.t0) q1Var).getMessageObject();
            }
            this.N.g0(messageObject.f23819k.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof org.telegram.ui.Cells.q1) && !(view2 instanceof org.telegram.ui.Cells.t0)) {
            z10 = true;
        }
        this.R = z10;
        if (view != null) {
            if (view.getTop() <= this.f48954w.getPaddingTop() && !this.R) {
                if (view.getAlpha() != 0.0f) {
                    view.setAlpha(0.0f);
                }
                AnimatorSet animatorSet = this.S;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.S = null;
                }
                if (this.N.getTag() == null) {
                    this.N.setTag(1);
                }
                if (this.N.getAlpha() != 1.0f) {
                    this.N.setAlpha(1.0f);
                }
                this.Q = true;
            } else {
                if (view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                Y0(true ^ this.R);
            }
            int bottom2 = view.getBottom() - this.f48954w.getPaddingTop();
            if (bottom2 > this.N.getMeasuredHeight() && bottom2 < this.N.getMeasuredHeight() * 2) {
                this.N.setTranslationY(((-t0Var.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.N.setTranslationY(0.0f);
            return;
        }
        Y0(true);
        this.N.setTranslationY(0.0f);
    }

    public final void i1() {
        boolean z10;
        di.c1 c1Var = this.f48954w;
        if (c1Var != null) {
            int childCount = c1Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f48954w.getChildAt(i7);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.x()) {
                            q1Var.setDrawSelectionBackground(false);
                            q1Var.k3(false, true);
                            q1Var.m3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        q1Var.setHighlighted(z10);
                        if (this.H0 != Integer.MAX_VALUE) {
                            qa qaVar = this.J0;
                            if (qaVar != null) {
                                org.telegram.messenger.g0.r(qaVar);
                            }
                            qa qaVar2 = new qa(this, 0);
                            this.J0 = qaVar2;
                            org.telegram.messenger.g0.i3(qaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f48955w0)) {
                            q1Var.t3(this.f48955w0);
                        } else {
                            q1Var.t3(null);
                        }
                        if (this.f48954w.getScrollState() == 0) {
                            z11 = false;
                        }
                        q1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    t0Var.setMessageObject(t0Var.getMessageObject());
                    if (this.f48954w.getScrollState() == 0) {
                        z11 = false;
                    }
                    t0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f48956x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25507h2);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25501g2);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25495f2);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25489e2);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25619z4);
        Z0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.np.i1(this.f48934f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new pa(this, 4)), this.classGuid);
        setBulletinDelegate(new bi.t(8));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25507h2);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25501g2);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25495f2);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25489e2);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25619z4);
        this.f48959y0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        jb jbVar = this.Y;
        if (jbVar != null) {
            org.telegram.ui.Components.z61 z61Var = jbVar.f39421w;
            if (z61Var != null) {
                z61Var.c(false);
            }
            jbVar.G = true;
        }
        UndoView undoView = this.f48956x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f48939j0 = true;
        this.f48940k0 = true;
        ab.q qVar = ab.q.f987e;
        if (qVar != null && qVar.f988a) {
            ab.q o4 = ab.q.o();
            if (o4.f988a) {
                int i7 = b5.G;
                ((r4) o4.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.f48936g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        jb jbVar = this.Y;
        if (jbVar != null) {
            org.telegram.ui.Components.z61 z61Var = jbVar.f39421w;
            if (z61Var != null) {
                z61Var.c(true);
            }
            jbVar.G = false;
        }
        this.f48939j0 = false;
        T0(false);
        if (this.f48940k0) {
            this.f48940k0 = false;
            ib ibVar = this.F;
            if (ibVar != null) {
                ibVar.f();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.f48949s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zc, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f48959y0.e();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f48959y0.d();
        }
    }
}
