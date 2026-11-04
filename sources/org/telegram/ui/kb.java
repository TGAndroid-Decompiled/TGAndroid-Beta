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
public final class kb extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static int R0 = 10;
    public static final int[] S0 = {org.telegram.messenger.hs.T, org.telegram.messenger.hs.f23298s, org.telegram.messenger.hs.f23305t, org.telegram.messenger.hs.D, org.telegram.messenger.hs.G0};
    public HashMap A0;
    public boolean B0;
    public final ya C0;
    public bb D0;
    public org.telegram.ui.Components.vi0 E;
    public final ArrayList E0;
    public hb F;
    public final a0.h F0;
    public TextView G;
    public wa G0;
    public mh.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.jn J;
    public pa J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.q1 K0;
    public ImageView L;
    public int L0;
    public ci.ec M;
    public final jb M0;
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
    public mh.f X;
    public ib Y;
    public org.telegram.messenger.zi Z;
    public final si.g f46856a;
    public TLRPC.ChannelParticipant f46857a0;
    public final eh.c f46858b;
    public FrameLayout f46859b0;
    public final eh.c f46860c;
    public ImageView f46861c0;
    public final eh.g d;
    public org.telegram.ui.ActionBar.k5 f46862d0;
    public final int f46863e;
    public l0 f46864e0;
    public final TLRPC.Chat f46865f;
    public l4 f46866f0;
    public TextureView f46867g0;
    public final ArrayList h;
    public int f46868h0;
    public int f46869i0;
    public boolean f46870j0;
    public boolean f46871k0;
    public final a0.h f46872l0;
    public final a0.h m0;
    public FrameLayout f46873n;
    public final HashMap f46874n0;
    public final ArrayList f46875o0;
    public final ArrayList f46876p0;
    public final HashSet f46877q0;
    public View f46878r;
    public boolean f46879r0;
    public RadialProgressView f46880s;
    public boolean f46881s0;
    public boolean f46882t0;
    public ArrayList f46883u0;
    public TLRPC.TL_channelAdminLogEventsFilter f46884v0;
    public ci.j1 f46885w;
    public String f46886w0;
    public UndoView f46887x;
    public a0.h f46888x0;
    public kg.y f46889y;
    public final g2.g f46890y0;
    public final HashMap f46891z0;

    public kb(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.f46868h0 = -1;
        this.f46869i0 = 0;
        this.f46870j0 = true;
        this.f46871k0 = false;
        this.f46872l0 = new a0.h();
        this.m0 = new a0.h();
        this.f46874n0 = new HashMap();
        this.f46875o0 = new ArrayList();
        this.f46876p0 = new ArrayList();
        this.f46877q0 = new HashSet();
        this.f46884v0 = null;
        this.f46886w0 = "";
        this.f46890y0 = new g2.g(S0);
        this.f46891z0 = new HashMap();
        this.C0 = new ya(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = Integer.MAX_VALUE;
        this.I0 = -1;
        this.M0 = new jb(this);
        this.O0 = -1;
        this.Q0 = new RectF();
        pi.q qVar = this.glassEngine;
        qVar.f53602a = new qa(this);
        qVar.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
        ?? obj = new Object();
        this.f46856a = obj;
        eh.c cVar = new eh.c(obj, obj, obj);
        this.f46858b = cVar;
        cVar.f9987j = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.az.f()) {
            eh.g gVar = new eh.g(false);
            this.d = gVar;
            this.glassEngine.a(gVar);
            si.f fVar = new si.f(obj);
            fVar.d = gVar;
            fVar.f54755e = -3;
            fVar.f54756f = obj;
            if (org.telegram.messenger.lc.e(262144)) {
                si.f fVar2 = new si.f(obj);
                fVar2.d = gVar;
                fVar2.f54755e = -2;
                fVar2.f54756f = obj;
                eh.c cVar2 = new eh.c(fVar2, fVar2, fVar2);
                this.f46860c = cVar2;
                cVar2.f9987j = this.glassEngine;
                if (org.telegram.messenger.lc.e(262144)) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                cVar2.d = L2;
                cVar2.f9983e = L2;
                cVar2.f9988k = true;
                this.f46863e = 0;
            } else {
                eh.c cVar3 = new eh.c(fVar, fVar, fVar);
                this.f46860c = cVar3;
                cVar3.f9987j = this.glassEngine;
                if (org.telegram.messenger.lc.e(262144)) {
                    L = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                cVar3.d = L;
                cVar3.f9983e = L;
                this.f46863e = org.telegram.messenger.g0.L(48.0f);
            }
        } else {
            this.d = null;
            this.f46863e = 0;
            eh.c cVar4 = new eh.c(obj, obj, obj);
            this.f46860c = cVar4;
            cVar4.f9987j = this.glassEngine;
        }
        this.f46865f = chat;
    }

    public static void A0(kb kbVar, org.telegram.messenger.zi ziVar) {
        if (kbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        if (ziVar.D == 3) {
            s1Var.U = org.telegram.messenger.bd.M0(2131748186, null);
        } else {
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131748213, ziVar.F0().mime_type);
        }
        kbVar.showDialog(s1Var);
    }

    public static int B0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int C0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int D0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int E0(kb kbVar) {
        return kbVar.classGuid;
    }

    public static void F0(kb kbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.hp messagesController = kbVar.getMessagesController();
        TLRPC.Chat chat = kbVar.f46865f;
        TLRPC.ChatFull N0 = messagesController.N0(chat.f27001id);
        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(kbVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, N0, hashMap, kbVar, N0.f27002id, false, org.telegram.messenger.t3.T(chat));
        i50Var.f34600b2 = new za(kbVar);
        i50Var.show();
    }

    public static org.telegram.ui.ActionBar.k L0(kb kbVar) {
        return kbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k M0(kb kbVar) {
        return kbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k N0(kb kbVar) {
        return kbVar.actionBar;
    }

    public static void P0(kb kbVar) {
        if (kbVar.f46885w != null && !kbVar.f46875o0.isEmpty()) {
            kbVar.f46889y.h1(kbVar.f46876p0.size() - 1, (-100000) - kbVar.f46885w.getPaddingTop());
        }
    }

    public static mw0 X0(CharSequence charSequence) {
        org.telegram.ui.Components.wp[] wpVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.wp wpVar : (org.telegram.ui.Components.wp[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.wp.class)) {
                if (wpVar != null) {
                    Drawable drawable = wpVar.f40041c;
                    if (drawable instanceof mw0) {
                        return (mw0) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void Z(kb kbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.zi ziVar;
        a0.h hVar = kbVar.f46872l0;
        int i3 = 0;
        kbVar.D0.N = false;
        kbVar.b1(false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = kbVar.f46875o0;
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.f27033id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                kbVar.P = Math.min(kbVar.P, tL_channelAdminLogEvent.f27033id);
                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(kbVar.currentAccount, tL_channelAdminLogEvent, arrayList, kbVar.f46874n0, kbVar.f46865f, kbVar.U, false);
                if (ziVar2.U >= 0) {
                    hVar.k(ziVar2, tL_channelAdminLogEvent.f27033id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(size);
            if (ziVar3 != null && ziVar3.U != 0 && ziVar3.M1() >= 0) {
                kbVar.m0.k(ziVar3, ziVar3.M1());
            }
            if (ziVar3 != null && (message = ziVar3.f26868k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (size != i11) {
                                ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
                                if (ziVar.U != 1 && ziVar.M1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i11++;
                        } else {
                            ziVar = null;
                            break;
                        }
                    }
                    if (ziVar != null) {
                        ziVar3.C = ziVar;
                    }
                }
                arrayList2.add(ziVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.li.b0(kbVar.currentAccount).X0(arrayList2, -kbVar.f46865f.f27001id, 0, 0L, new pa(kbVar, 1), kbVar.getClassGuid(), null);
        }
        kbVar.W0();
        kbVar.f46881s0 = false;
        if (!z10) {
            kbVar.f46879r0 = true;
        }
        org.telegram.messenger.g0.Z3(kbVar.f46873n, false, 0.3f, true, true);
        kbVar.f46885w.setEmptyView(kbVar.I);
        hb hbVar = kbVar.F;
        if (hbVar != null) {
            hbVar.f();
        }
        org.telegram.ui.ActionBar.q0 q0Var = kbVar.O;
        if (q0Var != null) {
            if (kbVar.f46876p0.isEmpty() && TextUtils.isEmpty(kbVar.f46886w0)) {
                i3 = 8;
            }
            q0Var.setVisibility(i3);
        }
    }

    public static void a0(kb kbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && kbVar.getParentActivity() != null) {
            int i3 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232562, 0, kbVar.getParentActivity(), kbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
            Rect rect = new Rect();
            kbVar.getParentActivity().getResources().getDrawable(2131232562).mutate().getPadding(rect);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, kbVar.getResourceProvider());
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                if (arrayList4.get(i10) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.c1(kbVar.getParentActivity(), kbVar.getResourceProvider()), b8.mf.o(-1, 8));
                } else {
                    Activity parentActivity = kbVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, parentActivity, kbVar.getResourceProvider(), z10, z11);
                    y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    y0Var.j((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                    if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                        y0Var.d(kbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28122q7), kbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28102p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                    y0Var.setOnClickListener(new ei.t5(kbVar, i10, arrayList4, (Integer) arrayList4.get(i10), 1));
                }
                i10++;
                arrayList4 = arrayList;
            }
            va vaVar = new va(0, kbVar.Y.getContext(), kbVar);
            vaVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            vaVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            wa waVar = new wa(kbVar, vaVar);
            kbVar.G0 = waVar;
            waVar.f27495e = true;
            waVar.f27494c = 220;
            waVar.setOutsideTouchable(true);
            kbVar.G0.setClippingEnabled(true);
            kbVar.G0.setAnimationStyle(2131755192);
            kbVar.G0.setFocusable(true);
            vaVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            kbVar.G0.setInputMethodMode(2);
            kbVar.G0.setSoftInputMode(48);
            kbVar.G0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f10)) - vaVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.g0.L(28.0f);
            if (left < org.telegram.messenger.g0.L(6.0f)) {
                left = org.telegram.messenger.g0.L(6.0f);
            } else if (left > (kbVar.f46885w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - vaVar.getMeasuredWidth()) {
                left = (kbVar.f46885w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - vaVar.getMeasuredWidth();
            }
            if (org.telegram.messenger.g0.Q1()) {
                int[] iArr = new int[2];
                kbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = kbVar.Y.getHeight();
            int L = org.telegram.messenger.g0.L(48.0f) + vaVar.getMeasuredHeight();
            int Q = kbVar.Y.Q();
            if (Q > org.telegram.messenger.g0.L(20.0f)) {
                height += Q;
            }
            if (L < height) {
                int y9 = (int) (kbVar.f46885w.getY() + view.getTop() + f11);
                if ((L - rect.top) - rect.bottom > org.telegram.messenger.g0.L(240.0f)) {
                    i3 = (org.telegram.messenger.g0.L(240.0f) - L) + y9;
                } else {
                    i3 = y9;
                }
                if (i3 < kbVar.f46885w.getY() + org.telegram.messenger.g0.L(24.0f)) {
                    i3 = (int) (kbVar.f46885w.getY() + org.telegram.messenger.g0.L(24.0f));
                } else {
                    int i11 = height - L;
                    if (i3 > i11 - org.telegram.messenger.g0.L(8.0f)) {
                        i3 = i11 - org.telegram.messenger.g0.L(8.0f);
                    }
                }
            } else if (!kbVar.inBubbleMode) {
                i3 = org.telegram.messenger.g0.f22602m;
            }
            vaVar.setMaxHeight(height - i3);
            kbVar.G0.showAtLocation(kbVar.f46885w, 51, left, i3);
            kbVar.G0.b();
        }
    }

    public static void b0(org.telegram.ui.kb r23, int r24, java.util.ArrayList r25, java.lang.Integer r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.b0(org.telegram.ui.kb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void c0(kb kbVar, int i3) {
        eh.g gVar = kbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (x7.u.a(i3, 4)) {
                ri.a e10 = kbVar.glassEngine.e();
                e10.b(kbVar.f46885w.getY(), kbVar.Y.getWidth(), kbVar.f46885w.getY() + kbVar.f46885w.getHeight());
                gVar.h(e10);
            }
            ib ibVar = kbVar.Y;
            Objects.requireNonNull(ibVar);
            gVar.e(new na(ibVar, 0), kbVar.Y.getWidth(), kbVar.Y.getHeight());
        }
    }

    public static void d0(kb kbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = kbVar.f46872l0;
        kbVar.f46882t0 = false;
        kbVar.D0.N = false;
        kbVar.b1(false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i3 = 0; i3 < tL_channels_adminLogResults.events.size(); i3++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i3);
            if (hVar.h(tL_channelAdminLogEvent2.f27033id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                kbVar.P = Math.min(kbVar.P, tL_channelAdminLogEvent2.f27033id);
                org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(kbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, kbVar.f46865f, kbVar.U, false);
                if (ziVar.U >= 0 && (((tL_channelAdminLogEvent = ziVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f27033id))) {
                    kbVar.f46875o0.add(0, ziVar);
                    hVar.k(ziVar, tL_channelAdminLogEvent2.f27033id);
                    z10 = true;
                }
            }
        }
        if (kbVar.F != null && z10) {
            kbVar.W0();
            kbVar.F.f();
        }
    }

    public static void e0(kb kbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull N0;
        TLRPC.Chat chat = kbVar.f46865f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            kbVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
            kbVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
            kbVar.f46883u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (N0 = kbVar.getMessagesController().N0(chat.f27001id)) != null && N0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = kbVar.getMessagesController().f22997e5;
                channelParticipant.peer = kbVar.getMessagesController().z1(channelParticipant.user_id);
                long j10 = kbVar.getMessagesController().f22997e5;
                if (kbVar.getMessagesController().a2(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f27144id.add(tL_inputUser);
                    ConnectionsManager.getInstance(kbVar.currentAccount).sendRequest(tL_users_getUsers, new oa(kbVar, 1));
                }
                kbVar.f46883u0.add(0, channelParticipant);
            }
            Dialog dialog = kbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).e1(kbVar.f46883u0);
            }
        }
    }

    public static void e1(int i3, org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return;
        }
        if (i3 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = ziVar.f26868k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = ziVar.f26868k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            ziVar.f26868k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.bd.G(i3, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        ziVar.j5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t10 = org.telegram.messenger.g0.t(spannableStringBuilder, "\n\n");
        if (t10 >= 0 && Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(8.0f)), t10 + 1, t10 + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int q0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int r0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int s0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int t0(kb kbVar) {
        return kbVar.classGuid;
    }

    public static void u0(org.telegram.ui.kb r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.u0(org.telegram.ui.kb, android.os.Bundle, long):void");
    }

    public static int v0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int w0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int x0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int y0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public static int z0(kb kbVar) {
        return kbVar.currentAccount;
    }

    public final org.telegram.messenger.zi S0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        String str;
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f46876p0;
            ziVar = null;
            if (i3 < arrayList2.size()) {
                ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i3);
                if (ziVar2 != null && ziVar2.U == 1 && ziVar2.H0 == j10) {
                    break;
                }
                i3++;
            } else {
                ziVar2 = null;
                break;
            }
        }
        if (ziVar2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f46865f.f27001id;
            tL_message.f27022id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.zi) arrayList.get(0)).f26868k.date;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ziVar2 = new org.telegram.messenger.zi(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j11));
        ziVar2.U = 1;
        if (z11 && arrayList.size() > 1) {
            ziVar2.H0 = j10;
        } else {
            ziVar2.H0 = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new fa.b(8)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                kb kbVar = kb.this;
                kbVar.getClass();
                if (l10.longValue() < 0) {
                    TLRPC.Chat M0 = kbVar.getMessagesController().M0(Long.valueOf(-l10.longValue()));
                    if (M0 == null) {
                        return null;
                    }
                    return M0.title;
                }
                return org.telegram.messenger.l10.k(kbVar.getMessagesController().a2(l10));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new ai.t1(2)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.zi.F5(org.telegram.messenger.bd.G(arrayList.size(), str, join), "un1", a22));
        if (z11 && arrayList.size() > 1) {
            mw0 X0 = X0(ziVar2.v);
            int i10 = 2131751036;
            if (X0 == null) {
                if (z10) {
                    i10 = 2131751037;
                }
                X0 = new mw0(org.telegram.messenger.bd.M0(i10, null));
                Typeface o10 = org.telegram.messenger.g0.o();
                org.telegram.ui.Components.g6 g6Var = X0.f47802a;
                g6Var.x(o10);
                g6Var.w(org.telegram.messenger.g0.L(10.0f));
                if (X0.f47804c != -1) {
                    X0.f47804c = -1;
                    X0.invalidateSelf();
                }
                X0.a(503316480);
            } else {
                org.telegram.ui.Components.g6 g6Var2 = X0.f47802a;
                if (z10) {
                    i10 = 2131751037;
                }
                g6Var2.t(org.telegram.messenger.bd.M0(i10, null), false, true);
            }
            X0.setBounds(0, 0, X0.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(0, X0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ziVar2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList);
        }
        if (ziVar != null) {
            long j12 = ziVar.T;
            a0.h hVar = this.F0;
            if (!hVar.d(j12)) {
                long j13 = ziVar.T;
                int i11 = R0;
                R0 = i11 + 1;
                hVar.k(Integer.valueOf(i11), j13);
            }
            ziVar2.k1 = ((Integer) hVar.f(ziVar.T)).intValue();
        }
        return ziVar2;
    }

    public final void T0(boolean z10) {
        int abs;
        kg.y yVar = this.f46889y;
        if (yVar != null && !this.f46870j0) {
            int L0 = yVar.L0();
            int i3 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f46889y.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.F.getClass();
                if (z10) {
                    i3 = 4;
                }
                if (L0 <= i3 && !this.f46881s0 && !this.f46879r0) {
                    Z0(false);
                }
            }
        }
    }

    public final boolean U0(android.view.View r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.U0(android.view.View, float, float):boolean");
    }

    public final TextureView V0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f46864e0 == null) {
            l0 l0Var = new l0(4, getParentActivity(), this);
            this.f46864e0 = l0Var;
            l0Var.setOutlineProvider(new cg.p0(10));
            this.f46864e0.setClipToOutline(true);
            this.f46864e0.setWillNotDraw(false);
            this.f46864e0.setVisibility(4);
            l4 l4Var = new l4(getParentActivity());
            this.f46866f0 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.f46864e0.addView(this.f46866f0, b8.mf.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f46867g0 = textureView;
            textureView.setOpaque(false);
            this.f46866f0.addView(this.f46867g0, b8.mf.c(-1.0f, -1));
        }
        if (this.f46864e0.getParent() == null) {
            ib ibVar = this.Y;
            l0 l0Var2 = this.f46864e0;
            int i3 = org.telegram.messenger.g0.f22612u;
            ibVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i3, i3));
        }
        this.f46864e0.setVisibility(4);
        this.f46866f0.setDrawingReady(false);
        return this.f46867g0;
    }

    public final void W0() {
        long j10;
        org.telegram.messenger.zi ziVar;
        long j11;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i3;
        int i10;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = this.f46875o0;
            if (i11 < arrayList4.size()) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList4.get(i11);
                if (ziVar2 != null && (tL_channelAdminLogEvent2 = ziVar2.J1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j10 = 0;
                }
                if (ziVar2.k1 <= 0) {
                    int i12 = R0;
                    R0 = i12 + 1;
                    ziVar2.k1 = i12;
                }
                int i13 = i11 + 1;
                if (i13 < arrayList4.size()) {
                    ziVar = (org.telegram.messenger.zi) arrayList4.get(i13);
                } else {
                    ziVar = null;
                }
                if (ziVar != null && (tL_channelAdminLogEvent = ziVar.J1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j11 = tL_channelAdminLogEvent.user_id;
                } else {
                    j11 = 0;
                }
                if (j10 != 0) {
                    arrayList3.add(ziVar2);
                } else {
                    arrayList2.add(ziVar2);
                }
                if (j10 != j11 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = ziVar2.f26868k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.zi) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((org.telegram.messenger.zi) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) k2.p1.h(1, arrayList3);
                        if (TextUtils.isEmpty(this.f46886w0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(ziVar3.T);
                        HashSet hashSet = this.f46877q0;
                        if (!hashSet.contains(valueOf) && z11) {
                            e1(arrayList3.size() - 1, ziVar3);
                            arrayList2.add(ziVar3);
                        } else {
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                e1(0, (org.telegram.messenger.zi) arrayList3.get(i14));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = ziVar3.f26868k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z10 != z12) {
                            ziVar3.K1 = true;
                            hb hbVar = this.F;
                            if (z10) {
                                i3 = arrayList3.size() - 1;
                            } else {
                                i3 = 0;
                            }
                            hbVar.g(i3 + size);
                            hb hbVar2 = this.F;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            hbVar2.g(size + i10 + 1);
                        }
                        long j12 = ziVar2.T;
                        arrayList = arrayList3;
                        arrayList2.add(S0(j12, ziVar2.J1.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) k2.p1.h(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(S0(ziVar4.T, ziVar4.J1.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i11 = i13;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f46876p0;
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
        hb hbVar;
        if (!this.f46881s0) {
            ArrayList arrayList = this.f46875o0;
            if (z10) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f46873n;
                if (frameLayout != null) {
                    org.telegram.messenger.g0.Z3(frameLayout, true, 0.3f, true, true);
                    this.I.setVisibility(4);
                    this.f46885w.setEmptyView(null);
                }
                this.f46872l0.b();
                arrayList.clear();
                this.f46874n0.clear();
                W0();
            }
            this.f46881s0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = org.telegram.messenger.hp.i1(this.f46865f);
            tL_channels_getAdminLog.f27036q = this.f46886w0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.P;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f46884v0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f46888x0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i3 = 0; i3 < this.f46888x0.m(); i3++) {
                    tL_channels_getAdminLog.admins.add(org.telegram.messenger.hp.s1(this.currentAccount).q1((TLRPC.User) this.f46888x0.n(i3)));
                }
            }
            g1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new oa(this, 3));
            if (z10 && (hbVar = this.F) != null) {
                hbVar.f();
            }
        }
    }

    public final void a1() {
        if (this.f46882t0) {
            return;
        }
        this.f46882t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.hp.i1(this.f46865f);
        tL_channels_getAdminLog.f27036q = this.f46886w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f46884v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f46888x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i3 = 0; i3 < this.f46888x0.m(); i3++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.hp.s1(this.currentAccount).q1((TLRPC.User) this.f46888x0.n(i3)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new oa(this, 0));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28166sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27906ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27945gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27926ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27995jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27979id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28279ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28296zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28261xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28242we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28222ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28203ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28220vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28184te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28164sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28145rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28109pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28127qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28089oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28107pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28070ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28087oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28051me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28068nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27996je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28033le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27994jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27961he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27978ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27959hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27925fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27886de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27942gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27923fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27903ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28297zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28278yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28260xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28241wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28202ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28183td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28125qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28141r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28239wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28165sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28108pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28088od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28069nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28050md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28032ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27943gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28295zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28277yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27829ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28106pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28182tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28163sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28144rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28086ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28126qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28181ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28143ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28083o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28064n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28045m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28028l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28009k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27991j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27974i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    public final void b1(boolean z10) {
        int i3;
        long j10;
        ci.j1 j1Var = this.f46885w;
        if (j1Var != null && this.f46889y != null && j1Var.getChildCount() > 0) {
            if (z10) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.q1 q1Var = null;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f46885w.getChildCount(); i11++) {
                View childAt = this.f46885w.getChildAt(i11);
                this.f46885w.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i3) {
                        }
                        i3 = childAt.getTop();
                        q1Var = childAt;
                        i10 = R;
                    } else {
                        if (top <= i3) {
                        }
                        i3 = childAt.getTop();
                        q1Var = childAt;
                        i10 = R;
                    }
                }
            }
            if (q1Var != null) {
                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                    j10 = q1Var.getMessageObject().T;
                } else if (q1Var instanceof org.telegram.ui.Cells.t0) {
                    j10 = q1Var.getMessageObject().T;
                } else {
                    j10 = 0;
                }
                this.N0 = j10;
                this.O0 = i10;
                this.P0 = (this.f46885w.getMeasuredHeight() - q1Var.getBottom()) - this.f46885w.getPaddingBottom();
            }
        }
    }

    public final int c1(org.telegram.messenger.zi ziVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i3;
        StaticLayout staticLayout;
        float lineTop;
        float f10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.xi xiVar;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(ziVar.f26924z) && (q1Var = this.K0) != null && (xiVar = q1Var.f29985l3) != null) {
                i3 = (int) q1Var.f30073s3;
                charSequence = ziVar.f26924z;
                arrayList = xiVar.f26387e;
            } else {
                CharSequence charSequence2 = ziVar.v;
                arrayList = ziVar.f26927z2;
                org.telegram.ui.Cells.q1 q1Var2 = this.K0;
                if (q1Var2 != null && q1Var2.f30095u1) {
                    i3 = q1Var2.V1 + org.telegram.messenger.g0.L(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i3 = 0;
                }
            }
            org.telegram.ui.Cells.q1 q1Var3 = this.K0;
            if (q1Var3 != null) {
                q1Var3.Sc = 0;
                q1Var3.Tc = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.zi.Y(this.I0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) arrayList.get(i10);
                        String charSequence3 = wiVar.f26210e.getText().toString();
                        int i11 = wiVar.f26212n;
                        if (Y > i11) {
                            if (Y - i11 > charSequence3.length() - 1) {
                                lineTop = i3 + ((int) (wiVar.o(arrayList) + wiVar.f26211f + wiVar.f26215w));
                            } else {
                                lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(Y - wiVar.f26212n)) + wiVar.o(arrayList) + i3 + wiVar.f26211f;
                            }
                            Point point = org.telegram.messenger.g0.f22608q;
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
                q1Var4.Sc = 0;
                q1Var4.Tc = null;
            }
        }
        return 0;
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i3 = 0; i3 < 8; i3++) {
                arrayList.add(new org.telegram.ui.Cells.q1(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.k6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 3));
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, null, false, null);
        this.J = jnVar;
        kk kkVar = jnVar.h;
        if (kkVar != null) {
            kkVar.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        }
        kk kkVar2 = jnVar.f35142r;
        if (kkVar2 != null) {
            kkVar2.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        }
        jnVar.m0 = true;
        this.J.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.addView(this.J, 0, b8.mf.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.I = new lg.w1(this, 1);
        this.O = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.jn jnVar2 = this.J;
        TLRPC.Chat chat = this.f46865f;
        jnVar2.setTitle(chat.title);
        this.J.setSubtitle(org.telegram.messenger.bd.M0(2131751075, null));
        this.J.setChatAvatar(chat);
        ab abVar = new ab(this, context);
        this.fragmentView = abVar;
        this.Y = abVar;
        abVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.Y.U(org.telegram.ui.ActionBar.k6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        ih.b p10 = b8.cd.p(this.resourceProvider);
        eh.c cVar = this.f46860c;
        kVar.M(cVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, b8.mf.e(-1, -2, 17));
        this.I.setOnTouchListener(new fi.a(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.v5(this.M, this.Y, org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.f27913f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(2131231611);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, b8.mf.t(54, 54, 17, 16, 20, 16, -4));
        ci.ec ecVar = new ci.ec(context, 10);
        this.M = ecVar;
        ecVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        ci.ec ecVar2 = this.M;
        int i10 = org.telegram.ui.ActionBar.k6.Wc;
        org.telegram.ui.ActionBar.r6.V(ecVar2, i10, null);
        this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        this.K.addView(this.M, b8.mf.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, b8.mf.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        ci.j1 j1Var = new ci.j1(9, context, this);
        this.f46885w = j1Var;
        j1Var.setOnItemClickListener(new f(this, 7));
        this.f46885w.setTag(1);
        this.f46885w.setVerticalScrollBarEnabled(true);
        ci.j1 j1Var2 = this.f46885w;
        hb hbVar = new hb(this, context);
        this.F = hbVar;
        j1Var2.setAdapter(hbVar);
        this.f46885w.setClipToPadding(false);
        ci.j1 j1Var3 = this.f46885w;
        int i11 = org.telegram.messenger.g0.f22602m;
        int i12 = this.f46863e;
        j1Var3.setPadding(0, org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + i12, 0, org.telegram.messenger.g0.L(60.0f) + i12 + org.telegram.messenger.g0.f22603n);
        ci.j1 j1Var4 = this.f46885w;
        bb bbVar = new bb(this, this.f46885w, this.resourceProvider);
        this.D0 = bbVar;
        j1Var4.setItemAnimator(bbVar);
        this.D0.Q = true;
        this.f46885w.setLayoutAnimation(null);
        kg.y yVar = new kg.y(this);
        this.f46889y = yVar;
        yVar.j1(1);
        this.f46889y.l1(true);
        this.f46885w.setLayoutManager(this.f46889y);
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(this.f46885w, this.f46889y);
        this.E = vi0Var;
        vi0Var.h = new qa(this);
        vi0Var.f39131i = this.M0;
        this.Y.addView(this.f46885w, b8.mf.c(-1.0f, -1));
        this.f46885w.setOnScrollListener(new h3(this));
        this.glassEngine.b(this.f46885w);
        int i13 = this.f46868h0;
        if (i13 != -1) {
            this.f46889y.h1(i13, this.f46869i0);
            this.f46868h0 = -1;
        }
        mh.f fVar = new mh.f(context);
        this.X = fVar;
        fVar.setup(this.f46858b);
        this.X.setFadeZoneTop(org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m);
        this.X.setFadeHeightTop(org.telegram.messenger.g0.L(60.0f));
        this.X.setFadeZoneBottom(org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(44.0f) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.f22603n);
        this.X.setFadeHeightBottom(org.telegram.messenger.g0.L(60.0f));
        this.Y.addView(this.X, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46873n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.f46873n, b8.mf.e(-1, -1, 51));
        View view = new View(context);
        this.f46878r = view;
        view.setBackground(new org.telegram.ui.ActionBar.v5(this.f46878r, this.Y, org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.f27913f2));
        this.f46873n.addView(this.f46878r, b8.mf.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f46880s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        this.f46880s.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f46873n.addView(this.f46880s, b8.mf.e(32, 32, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        this.N = t0Var;
        t0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, b8.mf.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        mh.e eVar = new mh.e(context, cVar, b8.cd.b(e6Var), e6Var);
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-org.telegram.messenger.g0.f22603n);
        this.H.c(4, true, false);
        mh.e eVar2 = this.H;
        gh.g c2 = eVar2.f19401n.c(eVar2, null, false);
        c2.p(eVar2.f19402r);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(22.0f), 6.0f);
        eVar2.f19403s = c2;
        this.Y.addView(this.H, b8.mf.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final kb f49456b;

            {
                this.f49456b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                kb kbVar = this.f49456b;
                switch (i14) {
                    case 0:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(kbVar, kbVar.f46884v0, kbVar.f46888x0, kbVar.f46865f.megagroup);
                            g0Var.e1(kbVar.f46883u0);
                            g0Var.Z1 = new qa(kbVar);
                            kbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        boolean z10 = kbVar.f46865f.megagroup;
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        if (z10) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750978, null));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131750976, null);
                        kbVar.showDialog(s1Var);
                        return;
                    default:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(kbVar.O.getSearchField());
                            kbVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(kbVar.getParentActivity(), new ma(kbVar, 0), null).f14429b);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(this.G, org.telegram.ui.ActionBar.k6.f28110pf, null);
        this.G.setText(org.telegram.messenger.bd.M0(2131745993, null));
        this.G.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        this.H.getContainer().addView(this.G, b8.mf.e(-2, -2, 17));
        this.H.f19400f.add(this.G);
        this.H.d(false);
        this.H.f19397b[4] = new View.OnClickListener(this) {
            public final kb f49456b;

            {
                this.f49456b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                kb kbVar = this.f49456b;
                switch (i14) {
                    case 0:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(kbVar, kbVar.f46884v0, kbVar.f46888x0, kbVar.f46865f.megagroup);
                            g0Var.e1(kbVar.f46883u0);
                            g0Var.Z1 = new qa(kbVar);
                            kbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        boolean z10 = kbVar.f46865f.megagroup;
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        if (z10) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750978, null));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131750976, null);
                        kbVar.showDialog(s1Var);
                        return;
                    default:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(kbVar.O.getSearchField());
                            kbVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(kbVar.getParentActivity(), new ma(kbVar, 0), null).f14429b);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f46859b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f46859b0.setVisibility(4);
        this.f46859b0.setFocusable(true);
        this.f46859b0.setFocusableInTouchMode(true);
        this.f46859b0.setClickable(true);
        this.f46859b0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.Y.addView(this.f46859b0, b8.mf.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f46861c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f46861c0.setImageResource(2131232076);
        org.telegram.ui.ActionBar.r6.t(this.f46861c0, org.telegram.ui.ActionBar.k6.f28052mf, null, PorterDuff.Mode.MULTIPLY);
        this.f46859b0.addView(this.f46861c0, b8.mf.e(48, 48, 53));
        this.f46861c0.setOnClickListener(new View.OnClickListener(this) {
            public final kb f49456b;

            {
                this.f49456b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                kb kbVar = this.f49456b;
                switch (i14) {
                    case 0:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(kbVar, kbVar.f46884v0, kbVar.f46888x0, kbVar.f46865f.megagroup);
                            g0Var.e1(kbVar.f46883u0);
                            g0Var.Z1 = new qa(kbVar);
                            kbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        boolean z10 = kbVar.f46865f.megagroup;
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        if (z10) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750978, null));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131750976, null);
                        kbVar.showDialog(s1Var);
                        return;
                    default:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(kbVar.O.getSearchField());
                            kbVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(kbVar.getParentActivity(), new ma(kbVar, 0), null).f14429b);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f46862d0 = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.nf, null);
        this.f46862d0.setTextSize(15);
        this.f46862d0.setTypeface(org.telegram.messenger.g0.o());
        this.f46859b0.addView(this.f46862d0, b8.mf.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.f46881s0 && this.f46875o0.isEmpty()) {
            org.telegram.messenger.g0.Z3(this.f46873n, true, 0.3f, true, true);
            this.f46885w.setEmptyView(null);
        } else {
            org.telegram.messenger.g0.Z3(this.f46873n, false, 0.3f, true, true);
            this.f46885w.setEmptyView(this.I);
        }
        ci.j1 j1Var5 = this.f46885w;
        j1Var5.X1 = true;
        j1Var5.Y1 = 1;
        UndoView undoView = new UndoView(context);
        this.f46887x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.Y.addView(this.f46887x, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    public final void d1(org.telegram.messenger.zi r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.d1(org.telegram.messenger.zi):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.zi messageObject2;
        org.telegram.ui.Cells.q1 q1Var3;
        org.telegram.messenger.zi messageObject3;
        boolean z10;
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            ci.j1 j1Var = this.f46885w;
            if (j1Var != null) {
                j1Var.g1();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.f23239h2) {
            if (((org.telegram.messenger.zi) objArr[0]).i4()) {
                MediaController.B().p0(V0(true), this.f46866f0, this.f46864e0, true);
                int childCount = this.f46885w.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        View childAt = this.f46885w.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt;
                            org.telegram.messenger.zi messageObject4 = q1Var4.getMessageObject();
                            if (this.f46864e0 != null && messageObject4.i4() && MediaController.B().I(messageObject4)) {
                                ImageReceiver photoImage = q1Var4.getPhotoImage();
                                this.f46864e0.setTranslationX(photoImage.L0);
                                this.f46864e0.setTranslationY(q1Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                                this.fragmentView.invalidate();
                                this.f46864e0.invalidate();
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
                if (this.f46864e0 != null) {
                    org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                    if (!z10) {
                        this.f46864e0.setTranslationY((-org.telegram.messenger.g0.f22612u) - 100);
                        this.fragmentView.invalidate();
                        if (ziVar != null && ziVar.i4() && (this.W || PipRoundVideoView.G != null)) {
                            MediaController.B().k0(false);
                        }
                    } else {
                        MediaController.B().k0(true);
                    }
                }
            }
            ci.j1 j1Var2 = this.f46885w;
            if (j1Var2 != null) {
                int childCount2 = j1Var2.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.f46885w.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject3 = (q1Var3 = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null) {
                        if (!org.telegram.messenger.zi.S4(messageObject3.f26868k) && !messageObject3.J3()) {
                            if (messageObject3.i4()) {
                                q1Var3.o0(null, false);
                                if (!MediaController.B().I(messageObject3) && messageObject3.f26828b0 != 0.0f) {
                                    messageObject3.H5();
                                    q1Var3.invalidate();
                                }
                            }
                        } else {
                            q1Var3.M3(false, true, false);
                        }
                    }
                }
            }
        } else if (i3 != org.telegram.messenger.hs.f23227f2 && i3 != org.telegram.messenger.hs.f23233g2) {
            if (i3 == org.telegram.messenger.hs.f23221e2) {
                Integer num = (Integer) objArr[0];
                ci.j1 j1Var3 = this.f46885w;
                if (j1Var3 != null) {
                    int childCount3 = j1Var3.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = this.f46885w.getChildAt(i13);
                        if ((childAt3 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = (q1Var2 = (org.telegram.ui.Cells.q1) childAt3).getMessageObject()) != null && messageObject2.f1() == num.intValue()) {
                            org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
                            if (ziVar2 != null) {
                                messageObject2.f26828b0 = ziVar2.f26828b0;
                                messageObject2.f26851g0 = ziVar2.f26851g0;
                                messageObject2.f26855h0 = ziVar2.f26855h0;
                                q1Var2.Q3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i3 == org.telegram.messenger.hs.f23351z4 && this.fragmentView != null) {
                this.Y.U(org.telegram.ui.ActionBar.k6.s0());
                this.f46878r.invalidate();
                ci.ec ecVar = this.M;
                if (ecVar != null) {
                    ecVar.invalidate();
                }
                this.f46885w.g1();
            }
        } else {
            ci.j1 j1Var4 = this.f46885w;
            if (j1Var4 != null) {
                int childCount4 = j1Var4.getChildCount();
                for (int i14 = 0; i14 < childCount4; i14++) {
                    View childAt4 = this.f46885w.getChildAt(i14);
                    if ((childAt4 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt4).getMessageObject()) != null) {
                        if (!org.telegram.messenger.zi.S4(messageObject.f26868k) && !messageObject.J3()) {
                            if (messageObject.i4() && !MediaController.B().I(messageObject)) {
                                q1Var.o0(null, true);
                            }
                        } else {
                            q1Var.M3(false, true, false);
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
        if (!TextUtils.isEmpty(this.f46886w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748209, null)));
        } else if (this.f46888x0 == null && this.f46884v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            if (this.f46865f.megagroup) {
                ci.ec ecVar = this.M;
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751013, null));
                f1(X2);
                ecVar.setText(X2);
                return;
            }
            ci.ec ecVar2 = this.M;
            SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751012, null));
            f1(X22);
            ecVar2.setText(X22);
        } else {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748208, null)));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28013kc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28049mc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28031lc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27887df));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46885w, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28204uf));
        View view = this.f46878r;
        int i3 = org.telegram.ui.ActionBar.k6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.M, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    public final void h1() {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.zi messageObject;
        int i3;
        ci.j1 j1Var = this.f46885w;
        if (j1Var == null) {
            return;
        }
        int childCount = j1Var.getChildCount();
        int measuredHeight = this.f46885w.getMeasuredHeight();
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.q1 q1Var = null;
        View view = null;
        View view2 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f46885w.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) childAt;
                float y9 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                y1Var.f30978f = y9;
                y1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int top = q1Var2.getTop();
                q1Var2.getBottom();
                if (top >= 0) {
                    i3 = 0;
                } else {
                    i3 = -top;
                }
                int measuredHeight2 = q1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i3 + measuredHeight;
                }
                q1Var2.y3(i3, measuredHeight2 - i3, (this.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - this.f46885w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.zi messageObject2 = q1Var2.getMessageObject();
                if (this.f46864e0 != null && messageObject2.i4() && MediaController.B().I(messageObject2)) {
                    ImageReceiver photoImage = q1Var2.getPhotoImage();
                    this.f46864e0.setTranslationX(photoImage.L0);
                    this.f46864e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.f46864e0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) childAt;
                t0Var2.h0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (t0Var2.Q()) {
                    t0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.f46885w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.q1) || (childAt instanceof org.telegram.ui.Cells.t0)) {
                        q1Var = childAt;
                    }
                    i10 = bottom;
                    view2 = childAt;
                }
                bb bbVar = this.D0;
                if ((bbVar == null || (!bbVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.t0) && ((org.telegram.ui.Cells.t0) childAt).getMessageObject().f26864j0) {
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
        l0 l0Var = this.f46864e0;
        if (l0Var != null) {
            if (!z11) {
                l0Var.setTranslationY((-org.telegram.messenger.g0.f22612u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null && ziVar.i4() && this.W) {
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
            this.N.e0(messageObject.f26868k.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof org.telegram.ui.Cells.q1) && !(view2 instanceof org.telegram.ui.Cells.t0)) {
            z10 = true;
        }
        this.R = z10;
        if (view != null) {
            if (view.getTop() <= this.f46885w.getPaddingTop() && !this.R) {
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
            int bottom2 = view.getBottom() - this.f46885w.getPaddingTop();
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
        ci.j1 j1Var = this.f46885w;
        if (j1Var != null) {
            int childCount = j1Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f46885w.getChildAt(i3);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.v()) {
                            q1Var.setDrawSelectionBackground(false);
                            q1Var.h3(false, true);
                            q1Var.j3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.M1() == this.H0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        q1Var.setHighlighted(z10);
                        if (this.H0 != Integer.MAX_VALUE) {
                            pa paVar = this.J0;
                            if (paVar != null) {
                                org.telegram.messenger.g0.r(paVar);
                            }
                            pa paVar2 = new pa(this, 0);
                            this.J0 = paVar2;
                            org.telegram.messenger.g0.i3(paVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f46886w0)) {
                            q1Var.q3(this.f46886w0);
                        } else {
                            q1Var.q3(null);
                        }
                        if (this.f46885w.getScrollState() == 0) {
                            z11 = false;
                        }
                        q1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    t0Var.setMessageObject(t0Var.getMessageObject());
                    if (this.f46885w.getScrollState() == 0) {
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
        UndoView undoView = this.f46887x;
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
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23239h2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23233g2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23227f2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23221e2);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23351z4);
        Z0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.hp.i1(this.f46865f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new oa(this, 4)), this.classGuid);
        setBulletinDelegate(new ai.y(8));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23239h2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23233g2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23227f2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23221e2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23351z4);
        this.f46890y0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ib ibVar = this.Y;
        if (ibVar != null) {
            org.telegram.ui.Components.q61 q61Var = ibVar.f37539w;
            if (q61Var != null) {
                q61Var.c(false);
            }
            ibVar.G = true;
        }
        UndoView undoView = this.f46887x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f46870j0 = true;
        this.f46871k0 = true;
        b4.n nVar = b4.n.f2376e;
        if (nVar != null && nVar.f2377a) {
            b4.n p10 = b4.n.p();
            if (p10.f2377a) {
                int i3 = d5.G;
                ((t4) p10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.f46867g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        ib ibVar = this.Y;
        if (ibVar != null) {
            org.telegram.ui.Components.q61 q61Var = ibVar.f37539w;
            if (q61Var != null) {
                q61Var.c(true);
            }
            ibVar.G = false;
        }
        this.f46870j0 = false;
        T0(false);
        if (this.f46871k0) {
            this.f46871k0 = false;
            hb hbVar = this.F;
            if (hbVar != null) {
                hbVar.f();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.f46880s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f46890y0.e();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f46890y0.d();
        }
    }
}
