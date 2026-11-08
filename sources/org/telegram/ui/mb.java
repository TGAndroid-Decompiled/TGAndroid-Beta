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
public final class mb extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static int Q0 = 10;
    public static final int[] R0 = {org.telegram.messenger.qs.T, org.telegram.messenger.qs.f25070s, org.telegram.messenger.qs.f25076t, org.telegram.messenger.qs.D, org.telegram.messenger.qs.G0};
    public boolean A0;
    public final ab B0;
    public db C0;
    public org.telegram.ui.Components.ri0 D;
    public final ArrayList D0;
    public jb E;
    public final a0.h E0;
    public TextView F;
    public ya F0;
    public lh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.kn I;
    public qa I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.q1 J0;
    public ImageView K;
    public int K0;
    public bi.md L;
    public final lb L0;
    public org.telegram.ui.Cells.t0 M;
    public long M0;
    public org.telegram.ui.ActionBar.r0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public final RectF P0;
    public boolean Q;
    public AnimatorSet R;
    public boolean S;
    public final int[] T;
    public boolean U;
    public boolean V;
    public lh.f W;
    public kb X;
    public org.telegram.messenger.ij Y;
    public TLRPC.ChannelParticipant Z;
    public final ri.g f47739a;
    public FrameLayout f47740a0;
    public final dh.c f47741b;
    public ImageView f47742b0;
    public final dh.c f47743c;
    public org.telegram.ui.ActionBar.k5 f47744c0;
    public final dh.g d;
    public k0 f47745d0;
    public final int f47746e;
    public j4 f47747e0;
    public final TLRPC.Chat f47748f;
    public TextureView f47749f0;
    public int f47750g0;
    public final ArrayList h;
    public int f47751h0;
    public boolean f47752i0;
    public boolean f47753j0;
    public final a0.h f47754k0;
    public final a0.h f47755l0;
    public final HashMap m0;
    public FrameLayout f47756n;
    public final ArrayList f47757n0;
    public final ArrayList f47758o0;
    public final HashSet f47759p0;
    public boolean f47760q0;
    public View f47761r;
    public boolean f47762r0;
    public RadialProgressView f47763s;
    public boolean f47764s0;
    public ArrayList f47765t0;
    public TLRPC.TL_channelAdminLogEventsFilter f47766u0;
    public String f47767v0;
    public bi.q1 f47768w;
    public a0.h f47769w0;
    public UndoView f47770x;
    public final h2.f f47771x0;
    public jg.b0 f47772y;
    public final HashMap f47773y0;
    public HashMap f47774z0;

    public mb(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f47750g0 = -1;
        this.f47751h0 = 0;
        this.f47752i0 = true;
        this.f47753j0 = false;
        this.f47754k0 = new a0.h();
        this.f47755l0 = new a0.h();
        this.m0 = new HashMap();
        this.f47757n0 = new ArrayList();
        this.f47758o0 = new ArrayList();
        this.f47759p0 = new HashSet();
        this.f47766u0 = null;
        this.f47767v0 = "";
        this.f47771x0 = new h2.f(R0);
        this.f47773y0 = new HashMap();
        this.B0 = new ab(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new lb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        oi.q qVar = this.glassEngine;
        qVar.f21099a = new ra(this);
        qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
        ?? obj = new Object();
        this.f47739a = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.f47741b = cVar;
        cVar.f8709j = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f()) {
            dh.g gVar = new dh.g(false);
            this.d = gVar;
            this.glassEngine.a(gVar);
            ri.f fVar = new ri.f(obj);
            fVar.d = gVar;
            fVar.f54572e = -3;
            fVar.f54573f = obj;
            if (org.telegram.messenger.sc.e(262144)) {
                ri.f fVar2 = new ri.f(obj);
                fVar2.d = gVar;
                fVar2.f54572e = -2;
                fVar2.f54573f = obj;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.f47743c = cVar2;
                cVar2.f8709j = this.glassEngine;
                if (org.telegram.messenger.sc.e(262144)) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                cVar2.d = L2;
                cVar2.f8705e = L2;
                cVar2.f8710k = true;
                this.f47746e = 0;
            } else {
                dh.c cVar3 = new dh.c(fVar, fVar, fVar);
                this.f47743c = cVar3;
                cVar3.f8709j = this.glassEngine;
                if (org.telegram.messenger.sc.e(262144)) {
                    L = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                cVar3.d = L;
                cVar3.f8705e = L;
                this.f47746e = org.telegram.messenger.g0.L(48.0f);
            }
        } else {
            this.d = null;
            this.f47746e = 0;
            dh.c cVar4 = new dh.c(obj, obj, obj);
            this.f47743c = cVar4;
            cVar4.f8709j = this.glassEngine;
        }
        this.f47748f = chat;
    }

    public static void A0(mb mbVar, org.telegram.messenger.ij ijVar) {
        if (mbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
        if (ijVar.D == 3) {
            u1Var.T = org.telegram.messenger.id.M0(2131748179, null);
        } else {
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131748206, ijVar.F0().mime_type);
        }
        mbVar.showDialog(u1Var);
    }

    public static int B0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int C0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int D0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int E0(mb mbVar) {
        return mbVar.classGuid;
    }

    public static void F0(mb mbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.qp messagesController = mbVar.getMessagesController();
        TLRPC.Chat chat = mbVar.f47748f;
        TLRPC.ChatFull N0 = messagesController.N0(chat.f26956id);
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(mbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, N0, hashMap, mbVar, N0.f26957id, false, org.telegram.messenger.t3.T(chat));
        m50Var.f35898a2 = new bb(mbVar);
        m50Var.show();
    }

    public static org.telegram.ui.ActionBar.k L0(mb mbVar) {
        return mbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k M0(mb mbVar) {
        return mbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k N0(mb mbVar) {
        return mbVar.actionBar;
    }

    public static int O0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static void P0(mb mbVar) {
        if (mbVar.f47768w != null && !mbVar.f47757n0.isEmpty()) {
            mbVar.f47772y.h1(mbVar.f47758o0.size() - 1, (-100000) - mbVar.f47768w.getPaddingTop());
        }
    }

    public static uw0 X0(CharSequence charSequence) {
        org.telegram.ui.Components.wp[] wpVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.wp wpVar : (org.telegram.ui.Components.wp[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.wp.class)) {
                if (wpVar != null) {
                    Drawable drawable = wpVar.f40016c;
                    if (drawable instanceof uw0) {
                        return (uw0) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void Z(mb mbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.ij ijVar;
        a0.h hVar = mbVar.f47754k0;
        int i7 = 0;
        mbVar.C0.N = false;
        mbVar.b1(false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = mbVar.f47757n0;
        boolean z9 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.f26988id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                mbVar.O = Math.min(mbVar.O, tL_channelAdminLogEvent.f26988id);
                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(mbVar.currentAccount, tL_channelAdminLogEvent, arrayList, mbVar.m0, mbVar.f47748f, mbVar.T, false);
                if (ijVar2.U >= 0) {
                    hVar.k(ijVar2, tL_channelAdminLogEvent.f26988id);
                }
                z9 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(size);
            if (ijVar3 != null && ijVar3.U != 0 && ijVar3.M1() >= 0) {
                mbVar.f47755l0.k(ijVar3, ijVar3.M1());
            }
            if (ijVar3 != null && (message = ijVar3.f23262k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (size != i11) {
                                ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
                                if (ijVar.U != 1 && ijVar.M1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i11++;
                        } else {
                            ijVar = null;
                            break;
                        }
                    }
                    if (ijVar != null) {
                        ijVar3.C = ijVar;
                    }
                }
                arrayList2.add(ijVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.ui.b0(mbVar.currentAccount).X0(arrayList2, -mbVar.f47748f.f26956id, 0, 0L, new qa(mbVar, 1), mbVar.getClassGuid(), null);
        }
        mbVar.W0();
        mbVar.f47762r0 = false;
        if (!z9) {
            mbVar.f47760q0 = true;
        }
        org.telegram.messenger.g0.Z3(mbVar.f47756n, false, 0.3f, true, true);
        mbVar.f47768w.setEmptyView(mbVar.H);
        jb jbVar = mbVar.E;
        if (jbVar != null) {
            jbVar.f();
        }
        org.telegram.ui.ActionBar.r0 r0Var = mbVar.N;
        if (r0Var != null) {
            if (mbVar.f47758o0.isEmpty() && TextUtils.isEmpty(mbVar.f47767v0)) {
                i7 = 8;
            }
            r0Var.setVisibility(i7);
        }
    }

    public static void a0(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        boolean z9;
        boolean z10;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && mbVar.getParentActivity() != null) {
            int i7 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232564, 0, mbVar.getParentActivity(), mbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
            Rect rect = new Rect();
            mbVar.getParentActivity().getResources().getDrawable(2131232564).mutate().getPadding(rect);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, mbVar.getResourceProvider());
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                if (arrayList4.get(i10) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(mbVar.getParentActivity(), mbVar.getResourceProvider()), c8.ha.o(-1, 8));
                } else {
                    Activity parentActivity = mbVar.getParentActivity();
                    if (i10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i10 == size - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, parentActivity, mbVar.getResourceProvider(), z9, z10);
                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    z0Var.j((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                    if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                        z0Var.d(mbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28093q7), mbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28073p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    z0Var.setOnClickListener(new di.t5(mbVar, i10, arrayList4, (Integer) arrayList4.get(i10), 1));
                }
                i10++;
                arrayList4 = arrayList;
            }
            xa xaVar = new xa(0, mbVar.X.getContext(), mbVar);
            xaVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            xaVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            ya yaVar = new ya(mbVar, xaVar);
            mbVar.F0 = yaVar;
            yaVar.f27485e = true;
            yaVar.f27484c = 220;
            yaVar.setOutsideTouchable(true);
            mbVar.F0.setClippingEnabled(true);
            mbVar.F0.setAnimationStyle(2131755192);
            mbVar.F0.setFocusable(true);
            xaVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            mbVar.F0.setInputMethodMode(2);
            mbVar.F0.setSoftInputMode(48);
            mbVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f10)) - xaVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.g0.L(28.0f);
            if (left < org.telegram.messenger.g0.L(6.0f)) {
                left = org.telegram.messenger.g0.L(6.0f);
            } else if (left > (mbVar.f47768w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - xaVar.getMeasuredWidth()) {
                left = (mbVar.f47768w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - xaVar.getMeasuredWidth();
            }
            if (org.telegram.messenger.g0.Q1()) {
                int[] iArr = new int[2];
                mbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = mbVar.X.getHeight();
            int L = org.telegram.messenger.g0.L(48.0f) + xaVar.getMeasuredHeight();
            int Q = mbVar.X.Q();
            if (Q > org.telegram.messenger.g0.L(20.0f)) {
                height += Q;
            }
            if (L < height) {
                int y10 = (int) (mbVar.f47768w.getY() + view.getTop() + f11);
                if ((L - rect.top) - rect.bottom > org.telegram.messenger.g0.L(240.0f)) {
                    i7 = (org.telegram.messenger.g0.L(240.0f) - L) + y10;
                } else {
                    i7 = y10;
                }
                if (i7 < mbVar.f47768w.getY() + org.telegram.messenger.g0.L(24.0f)) {
                    i7 = (int) (mbVar.f47768w.getY() + org.telegram.messenger.g0.L(24.0f));
                } else {
                    int i11 = height - L;
                    if (i7 > i11 - org.telegram.messenger.g0.L(8.0f)) {
                        i7 = i11 - org.telegram.messenger.g0.L(8.0f);
                    }
                }
            } else if (!mbVar.inBubbleMode) {
                i7 = org.telegram.messenger.g0.f22557m;
            }
            xaVar.setMaxHeight(height - i7);
            mbVar.F0.showAtLocation(mbVar.f47768w, 51, left, i7);
            mbVar.F0.b();
        }
    }

    public static void b0(org.telegram.ui.mb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.b0(org.telegram.ui.mb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void c0(mb mbVar, int i7) {
        dh.g gVar = mbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                qi.a e10 = mbVar.glassEngine.e();
                e10.b(mbVar.f47768w.getY(), mbVar.X.getWidth(), mbVar.f47768w.getY() + mbVar.f47768w.getHeight());
                gVar.h(e10);
            }
            kb kbVar = mbVar.X;
            Objects.requireNonNull(kbVar);
            gVar.e(new oa(kbVar, 0), mbVar.X.getWidth(), mbVar.X.getHeight());
        }
    }

    public static void d0(mb mbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = mbVar.f47754k0;
        mbVar.f47764s0 = false;
        mbVar.C0.N = false;
        mbVar.b1(false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z9 = false;
        for (int i7 = 0; i7 < tL_channels_adminLogResults.events.size(); i7++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i7);
            if (hVar.h(tL_channelAdminLogEvent2.f26988id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                mbVar.O = Math.min(mbVar.O, tL_channelAdminLogEvent2.f26988id);
                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(mbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, mbVar.f47748f, mbVar.T, false);
                if (ijVar.U >= 0 && (((tL_channelAdminLogEvent = ijVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f26988id))) {
                    mbVar.f47757n0.add(0, ijVar);
                    hVar.k(ijVar, tL_channelAdminLogEvent2.f26988id);
                    z9 = true;
                }
            }
        }
        if (mbVar.E != null && z9) {
            mbVar.W0();
            mbVar.E.f();
        }
    }

    public static void e0(mb mbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull N0;
        TLRPC.Chat chat = mbVar.f47748f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            mbVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
            mbVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
            mbVar.f47765t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (N0 = mbVar.getMessagesController().N0(chat.f26956id)) != null && N0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = mbVar.getMessagesController().f24772e5;
                channelParticipant.peer = mbVar.getMessagesController().z1(channelParticipant.user_id);
                long j3 = mbVar.getMessagesController().f24772e5;
                if (mbVar.getMessagesController().a2(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.f27099id.add(tL_inputUser);
                    ConnectionsManager.getInstance(mbVar.currentAccount).sendRequest(tL_users_getUsers, new pa(mbVar, 1));
                }
                mbVar.f47765t0.add(0, channelParticipant);
            }
            Dialog dialog = mbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.i0) {
                ((org.telegram.ui.Components.i0) dialog).e1(mbVar.f47765t0);
            }
        }
    }

    public static void e1(int i7, org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return;
        }
        if (i7 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = ijVar.f23262k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = ijVar.f23262k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            ijVar.f23262k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.id.G(i7, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        ijVar.j5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t6 = org.telegram.messenger.g0.t(spannableStringBuilder, "\n\n");
        if (t6 >= 0 && Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(8.0f)), t6 + 1, t6 + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int q0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int r0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int s0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int t0(mb mbVar) {
        return mbVar.classGuid;
    }

    public static void u0(org.telegram.ui.mb r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.u0(org.telegram.ui.mb, android.os.Bundle, long):void");
    }

    public static int v0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int w0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int x0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int y0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public static int z0(mb mbVar) {
        return mbVar.currentAccount;
    }

    public final org.telegram.messenger.ij S0(long j3, long j10, ArrayList arrayList, boolean z9, boolean z10) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        String str;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47758o0;
            ijVar = null;
            if (i7 < arrayList2.size()) {
                ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i7);
                if (ijVar2 != null && ijVar2.U == 1 && ijVar2.H0 == j3) {
                    break;
                }
                i7++;
            } else {
                ijVar2 = null;
                break;
            }
        }
        if (ijVar2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f47748f.f26956id;
            tL_message.f26977id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.ij) arrayList.get(0)).f23262k.date;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ijVar2 = new org.telegram.messenger.ij(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        ijVar2.U = 1;
        if (z10 && arrayList.size() > 1) {
            ijVar2.H0 = j3;
        } else {
            ijVar2.H0 = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new aa.l(9)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                mb mbVar = mb.this;
                mbVar.getClass();
                if (l10.longValue() < 0) {
                    TLRPC.Chat M0 = mbVar.getMessagesController().M0(Long.valueOf(-l10.longValue()));
                    if (M0 == null) {
                        return null;
                    }
                    return M0.title;
                }
                return org.telegram.messenger.t10.k(mbVar.getMessagesController().a2(l10));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new aa.m(4)).limit(4L).toArray());
        if (z10) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.ij.F5(org.telegram.messenger.id.G(arrayList.size(), str, join), "un1", a22));
        if (z10 && arrayList.size() > 1) {
            uw0 X0 = X0(ijVar2.v);
            int i10 = 2131751036;
            if (X0 == null) {
                if (z9) {
                    i10 = 2131751037;
                }
                X0 = new uw0(org.telegram.messenger.id.M0(i10, null));
                Typeface o4 = org.telegram.messenger.g0.o();
                org.telegram.ui.Components.i6 i6Var = X0.f50434a;
                i6Var.x(o4);
                i6Var.w(org.telegram.messenger.g0.L(10.0f));
                if (X0.f50436c != -1) {
                    X0.f50436c = -1;
                    X0.invalidateSelf();
                }
                X0.a(503316480);
            } else {
                org.telegram.ui.Components.i6 i6Var2 = X0.f50434a;
                if (z9) {
                    i10 = 2131751037;
                }
                i6Var2.t(org.telegram.messenger.id.M0(i10, null), false, true);
            }
            X0.setBounds(0, 0, X0.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(0, X0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ijVar2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
        }
        if (ijVar != null) {
            long j11 = ijVar.T;
            a0.h hVar = this.E0;
            if (!hVar.d(j11)) {
                long j12 = ijVar.T;
                int i11 = Q0;
                Q0 = i11 + 1;
                hVar.k(Integer.valueOf(i11), j12);
            }
            ijVar2.f23264k1 = ((Integer) hVar.f(ijVar.T)).intValue();
        }
        return ijVar2;
    }

    public final void T0(boolean z9) {
        int abs;
        jg.b0 b0Var = this.f47772y;
        if (b0Var != null && !this.f47752i0) {
            int L0 = b0Var.L0();
            int i7 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f47772y.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z9) {
                    i7 = 4;
                }
                if (L0 <= i7 && !this.f47762r0 && !this.f47760q0) {
                    Z0(false);
                }
            }
        }
    }

    public final boolean U0(android.view.View r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.U0(android.view.View, float, float):boolean");
    }

    public final TextureView V0(boolean z9) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f47745d0 == null) {
            k0 k0Var = new k0(4, getParentActivity(), this);
            this.f47745d0 = k0Var;
            k0Var.setOutlineProvider(new bg.q0(9));
            this.f47745d0.setClipToOutline(true);
            this.f47745d0.setWillNotDraw(false);
            this.f47745d0.setVisibility(4);
            j4 j4Var = new j4(getParentActivity());
            this.f47747e0 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z9) {
                this.f47745d0.addView(this.f47747e0, c8.ha.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f47749f0 = textureView;
            textureView.setOpaque(false);
            this.f47747e0.addView(this.f47749f0, c8.ha.c(-1.0f, -1));
        }
        if (this.f47745d0.getParent() == null) {
            kb kbVar = this.X;
            k0 k0Var2 = this.f47745d0;
            int i7 = org.telegram.messenger.g0.f22567u;
            kbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i7, i7));
        }
        this.f47745d0.setVisibility(4);
        this.f47747e0.setDrawingReady(false);
        return this.f47749f0;
    }

    public final void W0() {
        long j3;
        org.telegram.messenger.ij ijVar;
        long j10;
        ArrayList arrayList;
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = this.f47757n0;
            if (i11 < arrayList4.size()) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList4.get(i11);
                if (ijVar2 != null && (tL_channelAdminLogEvent2 = ijVar2.J1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j3 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j3 = 0;
                }
                if (ijVar2.f23264k1 <= 0) {
                    int i12 = Q0;
                    Q0 = i12 + 1;
                    ijVar2.f23264k1 = i12;
                }
                int i13 = i11 + 1;
                if (i13 < arrayList4.size()) {
                    ijVar = (org.telegram.messenger.ij) arrayList4.get(i13);
                } else {
                    ijVar = null;
                }
                if (ijVar != null && (tL_channelAdminLogEvent = ijVar.J1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent.user_id;
                } else {
                    j10 = 0;
                }
                if (j3 != 0) {
                    arrayList3.add(ijVar2);
                } else {
                    arrayList2.add(ijVar2);
                }
                if (j3 != j10 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = ijVar2.f23262k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.ij) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((org.telegram.messenger.ij) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) jg.g.i(1, arrayList3);
                        if (TextUtils.isEmpty(this.f47767v0) && arrayList3.size() > 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Long valueOf = Long.valueOf(ijVar3.T);
                        HashSet hashSet = this.f47759p0;
                        if (!hashSet.contains(valueOf) && z10) {
                            e1(arrayList3.size() - 1, ijVar3);
                            arrayList2.add(ijVar3);
                        } else {
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                e1(0, (org.telegram.messenger.ij) arrayList3.get(i14));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = ijVar3.f23262k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z9 != z11) {
                            ijVar3.K1 = true;
                            jb jbVar = this.E;
                            if (z9) {
                                i7 = arrayList3.size() - 1;
                            } else {
                                i7 = 0;
                            }
                            jbVar.g(i7 + size);
                            jb jbVar2 = this.E;
                            if (z9) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            jbVar2.g(size + i10 + 1);
                        }
                        long j11 = ijVar2.T;
                        arrayList = arrayList3;
                        arrayList2.add(S0(j11, ijVar2.J1.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z10));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) jg.g.i(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(S0(ijVar4.T, ijVar4.J1.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i11 = i13;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f47758o0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void Y0(boolean z9) {
        if (this.M.getTag() != null && !this.P) {
            if (!this.S || this.Q) {
                this.M.setTag(null);
                if (z9) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.R = animatorSet;
                    animatorSet.setDuration(150L);
                    this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
                    this.R.addListener(new va(this, 1));
                    this.R.setStartDelay(500L);
                    this.R.start();
                    return;
                }
                AnimatorSet animatorSet2 = this.R;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.R = null;
                }
                this.M.setAlpha(0.0f);
            }
        }
    }

    public final void Z0(boolean z9) {
        jb jbVar;
        if (!this.f47762r0) {
            ArrayList arrayList = this.f47757n0;
            if (z9) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f47756n;
                if (frameLayout != null) {
                    org.telegram.messenger.g0.Z3(frameLayout, true, 0.3f, true, true);
                    this.H.setVisibility(4);
                    this.f47768w.setEmptyView(null);
                }
                this.f47754k0.b();
                arrayList.clear();
                this.m0.clear();
                W0();
            }
            this.f47762r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = org.telegram.messenger.qp.i1(this.f47748f);
            tL_channels_getAdminLog.f26991q = this.f47767v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z9 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f47766u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f47769w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i7 = 0; i7 < this.f47769w0.m(); i7++) {
                    tL_channels_getAdminLog.admins.add(org.telegram.messenger.qp.s1(this.currentAccount).q1((TLRPC.User) this.f47769w0.n(i7)));
                }
            }
            g1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 3));
            if (z9 && (jbVar = this.E) != null) {
                jbVar.f();
            }
        }
    }

    public final void a1() {
        if (this.f47764s0) {
            return;
        }
        this.f47764s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.qp.i1(this.f47748f);
        tL_channels_getAdminLog.f26991q = this.f47767v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f47766u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f47769w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i7 = 0; i7 < this.f47769w0.m(); i7++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.qp.s1(this.currentAccount).q1((TLRPC.User) this.f47769w0.n(i7)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 0));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28157tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28138sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27916gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27896ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27968jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27950id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28251ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28267zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28232xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28249yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28213we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28176ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28193vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28156te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28174uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28137se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28154tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28119re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28135sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28100qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28117rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28080pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28098qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28060oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28078pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28058oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28023me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28040nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27969je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27988ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27951ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27967jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27933he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27949ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27915ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27931hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27859de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27821bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27842ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27913gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27822be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27876ec));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28268zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28250yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28231xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28212wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28175ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28155td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28096qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28112r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28211wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28136sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28118rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28099qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28079pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28059od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28041nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28022md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28006ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27914gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28266zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28248yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28230xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27802ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28077pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28153tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28134sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28116rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28057ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28097qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28152ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28115ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28054o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28036n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28019m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28001l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27983k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27963j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27945i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    public final void b1(boolean z9) {
        int i7;
        long j3;
        bi.q1 q1Var = this.f47768w;
        if (q1Var != null && this.f47772y != null && q1Var.getChildCount() > 0) {
            if (z9) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.q1 q1Var2 = null;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f47768w.getChildCount(); i11++) {
                View childAt = this.f47768w.getChildAt(i11);
                this.f47768w.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z9) {
                        if (top >= i7) {
                        }
                        i7 = childAt.getTop();
                        q1Var2 = childAt;
                        i10 = R;
                    } else {
                        if (top <= i7) {
                        }
                        i7 = childAt.getTop();
                        q1Var2 = childAt;
                        i10 = R;
                    }
                }
            }
            if (q1Var2 != null) {
                if (q1Var2 instanceof org.telegram.ui.Cells.q1) {
                    j3 = q1Var2.getMessageObject().T;
                } else if (q1Var2 instanceof org.telegram.ui.Cells.t0) {
                    j3 = q1Var2.getMessageObject().T;
                } else {
                    j3 = 0;
                }
                this.M0 = j3;
                this.N0 = i10;
                this.O0 = (this.f47768w.getMeasuredHeight() - q1Var2.getBottom()) - this.f47768w.getPaddingBottom();
            }
        }
    }

    public final int c1(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i7;
        StaticLayout staticLayout;
        float lineTop;
        float f10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj gjVar;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(ijVar.f23318z) && (q1Var = this.J0) != null && (gjVar = q1Var.f29913l3) != null) {
                i7 = (int) q1Var.f30002s3;
                charSequence = ijVar.f23318z;
                arrayList = gjVar.f22680e;
            } else {
                CharSequence charSequence2 = ijVar.v;
                arrayList = ijVar.f23321z2;
                org.telegram.ui.Cells.q1 q1Var2 = this.J0;
                if (q1Var2 != null && q1Var2.f30023u1) {
                    i7 = q1Var2.V1 + org.telegram.messenger.g0.L(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i7 = 0;
                }
            }
            org.telegram.ui.Cells.q1 q1Var3 = this.J0;
            if (q1Var3 != null) {
                q1Var3.Tc = 0;
                q1Var3.Uc = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.ij.Y(this.H0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
                        String charSequence3 = fjVar.f22424e.getText().toString();
                        int i11 = fjVar.f22426n;
                        if (Y > i11) {
                            if (Y - i11 > charSequence3.length() - 1) {
                                lineTop = i7 + ((int) (fjVar.o(arrayList) + fjVar.f22425f + fjVar.f22429w));
                            } else {
                                lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(Y - fjVar.f22426n)) + fjVar.o(arrayList) + i7 + fjVar.f22425f;
                            }
                            Point point = org.telegram.messenger.g0.f22563q;
                            float f11 = point.y;
                            float f12 = 0.5f;
                            if (this.X.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
                                f10 = 0.7f;
                            } else {
                                f10 = 0.5f;
                            }
                            if (lineTop > f11 * f10) {
                                float f13 = point.y;
                                if (this.X.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
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
            org.telegram.ui.Cells.q1 q1Var4 = this.J0;
            if (q1Var4 != null) {
                q1Var4.Tc = 0;
                q1Var4.Uc = null;
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
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.k6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 2));
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, null, false, null);
        this.I = knVar;
        ok okVar = knVar.h;
        if (okVar != null) {
            okVar.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        }
        ok okVar2 = knVar.f35382r;
        if (okVar2 != null) {
            okVar2.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        }
        knVar.f35376l0 = true;
        this.I.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.addView(this.I, 0, c8.ha.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 1);
        this.N = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.kn knVar2 = this.I;
        TLRPC.Chat chat = this.f47748f;
        knVar2.setTitle(chat.title);
        this.I.setSubtitle(org.telegram.messenger.id.M0(2131751075, null));
        this.I.setChatAvatar(chat);
        cb cbVar = new cb(this, context);
        this.fragmentView = cbVar;
        this.X = cbVar;
        cbVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.X.U(org.telegram.ui.ActionBar.k6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        hh.b p10 = c8.g0.p(this.resourceProvider);
        dh.c cVar = this.f47743c;
        kVar.M(cVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, c8.ha.e(-1, -2, 17));
        this.H.setOnTouchListener(new ei.b(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.w5(this.L, this.X, org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.f27886f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(2131231611);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, c8.ha.t(54, 54, 17, 16, 20, 16, -4));
        bi.md mdVar = new bi.md(context, 10);
        this.L = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        bi.md mdVar2 = this.L;
        int i10 = org.telegram.ui.ActionBar.k6.Wc;
        org.telegram.ui.ActionBar.r6.V(mdVar2, i10, null);
        this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        this.J.addView(this.L, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, c8.ha.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(9, context, this);
        this.f47768w = q1Var;
        q1Var.setOnItemClickListener(new f(this, 7));
        this.f47768w.setTag(1);
        this.f47768w.setVerticalScrollBarEnabled(true);
        bi.q1 q1Var2 = this.f47768w;
        jb jbVar = new jb(this, context);
        this.E = jbVar;
        q1Var2.setAdapter(jbVar);
        this.f47768w.setClipToPadding(false);
        bi.q1 q1Var3 = this.f47768w;
        int i11 = org.telegram.messenger.g0.f22557m;
        int i12 = this.f47746e;
        q1Var3.setPadding(0, org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + i12, 0, org.telegram.messenger.g0.L(60.0f) + i12 + org.telegram.messenger.g0.f22558n);
        bi.q1 q1Var4 = this.f47768w;
        db dbVar = new db(this, this.f47768w, this.resourceProvider);
        this.C0 = dbVar;
        q1Var4.setItemAnimator(dbVar);
        this.C0.Q = true;
        this.f47768w.setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(this);
        this.f47772y = b0Var;
        b0Var.j1(1);
        this.f47772y.l1(true);
        this.f47768w.setLayoutManager(this.f47772y);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(this.f47768w, this.f47772y);
        this.D = ri0Var;
        ri0Var.h = new ra(this);
        ri0Var.f37678i = this.L0;
        this.X.addView(this.f47768w, c8.ha.c(-1.0f, -1));
        this.f47768w.setOnScrollListener(new g3(this));
        this.glassEngine.b(this.f47768w);
        int i13 = this.f47750g0;
        if (i13 != -1) {
            this.f47772y.h1(i13, this.f47751h0);
            this.f47750g0 = -1;
        }
        lh.f fVar = new lh.f(context);
        this.W = fVar;
        fVar.setup(this.f47741b);
        this.W.setFadeZoneTop(org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m);
        this.W.setFadeHeightTop(org.telegram.messenger.g0.L(60.0f));
        this.W.setFadeZoneBottom(org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(44.0f) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.f22558n);
        this.W.setFadeHeightBottom(org.telegram.messenger.g0.L(60.0f));
        this.X.addView(this.W, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f47756n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f47756n, c8.ha.e(-1, -1, 51));
        View view = new View(context);
        this.f47761r = view;
        view.setBackground(new org.telegram.ui.ActionBar.w5(this.f47761r, this.X, org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.f27886f2));
        this.f47756n.addView(this.f47761r, c8.ha.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f47763s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        this.f47763s.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f47756n.addView(this.f47763s, c8.ha.e(32, 32, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        this.M = t0Var;
        t0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, c8.ha.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        lh.e eVar = new lh.e(context, cVar, c8.g0.b(f6Var), f6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-org.telegram.messenger.g0.f22558n);
        this.G.c(4, true, false);
        lh.e eVar2 = this.G;
        fh.g c10 = eVar2.f18362n.c(eVar2, null, false);
        c10.p(eVar2.f18363r);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        eVar2.f18364s = c10;
        this.X.addView(this.G, c8.ha.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final mb f49997b;

            {
                this.f49997b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                mb mbVar = this.f49997b;
                switch (i14) {
                    case 0:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(mbVar, mbVar.f47766u0, mbVar.f47769w0, mbVar.f47748f.megagroup);
                            i0Var.e1(mbVar.f47765t0);
                            i0Var.Y1 = new ra(mbVar);
                            mbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        boolean z9 = mbVar.f47748f.megagroup;
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        if (z9) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750978, null));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.R = org.telegram.messenger.id.M0(2131750976, null);
                        mbVar.showDialog(u1Var);
                        return;
                    default:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(mbVar.N.getSearchField());
                            mbVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(mbVar.getParentActivity(), new na(mbVar, 0), null).f14323b);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(this.F, org.telegram.ui.ActionBar.k6.f28081pf, null);
        this.F.setText(org.telegram.messenger.id.M0(2131745986, null));
        this.F.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        this.G.getContainer().addView(this.F, c8.ha.e(-2, -2, 17));
        this.G.f18361f.add(this.F);
        this.G.d(false);
        this.G.f18358b[4] = new View.OnClickListener(this) {
            public final mb f49997b;

            {
                this.f49997b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                mb mbVar = this.f49997b;
                switch (i14) {
                    case 0:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(mbVar, mbVar.f47766u0, mbVar.f47769w0, mbVar.f47748f.megagroup);
                            i0Var.e1(mbVar.f47765t0);
                            i0Var.Y1 = new ra(mbVar);
                            mbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        boolean z9 = mbVar.f47748f.megagroup;
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        if (z9) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750978, null));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.R = org.telegram.messenger.id.M0(2131750976, null);
                        mbVar.showDialog(u1Var);
                        return;
                    default:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(mbVar.N.getSearchField());
                            mbVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(mbVar.getParentActivity(), new na(mbVar, 0), null).f14323b);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f47740a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f47740a0.setVisibility(4);
        this.f47740a0.setFocusable(true);
        this.f47740a0.setFocusableInTouchMode(true);
        this.f47740a0.setClickable(true);
        this.f47740a0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.X.addView(this.f47740a0, c8.ha.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f47742b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f47742b0.setImageResource(2131232076);
        org.telegram.ui.ActionBar.r6.t(this.f47742b0, org.telegram.ui.ActionBar.k6.f28024mf, null, PorterDuff.Mode.MULTIPLY);
        this.f47740a0.addView(this.f47742b0, c8.ha.e(48, 48, 53));
        this.f47742b0.setOnClickListener(new View.OnClickListener(this) {
            public final mb f49997b;

            {
                this.f49997b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                mb mbVar = this.f49997b;
                switch (i14) {
                    case 0:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(mbVar, mbVar.f47766u0, mbVar.f47769w0, mbVar.f47748f.megagroup);
                            i0Var.e1(mbVar.f47765t0);
                            i0Var.Y1 = new ra(mbVar);
                            mbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        boolean z9 = mbVar.f47748f.megagroup;
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        if (z9) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750978, null));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.R = org.telegram.messenger.id.M0(2131750976, null);
                        mbVar.showDialog(u1Var);
                        return;
                    default:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(mbVar.N.getSearchField());
                            mbVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(mbVar.getParentActivity(), new na(mbVar, 0), null).f14323b);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f47744c0 = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f28042nf, null);
        this.f47744c0.setTextSize(15);
        this.f47744c0.setTypeface(org.telegram.messenger.g0.o());
        this.f47740a0.addView(this.f47744c0, c8.ha.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f47762r0 && this.f47757n0.isEmpty()) {
            org.telegram.messenger.g0.Z3(this.f47756n, true, 0.3f, true, true);
            this.f47768w.setEmptyView(null);
        } else {
            org.telegram.messenger.g0.Z3(this.f47756n, false, 0.3f, true, true);
            this.f47768w.setEmptyView(this.H);
        }
        bi.q1 q1Var5 = this.f47768w;
        q1Var5.W1 = true;
        q1Var5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.f47770x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.X.addView(this.f47770x, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    public final void d1(org.telegram.messenger.ij r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.d1(org.telegram.messenger.ij):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.ij messageObject2;
        org.telegram.ui.Cells.q1 q1Var3;
        org.telegram.messenger.ij messageObject3;
        boolean z9;
        if (i7 == org.telegram.messenger.qs.f25018i4) {
            bi.q1 q1Var4 = this.f47768w;
            if (q1Var4 != null) {
                q1Var4.g1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f25010h2) {
            if (((org.telegram.messenger.ij) objArr[0]).i4()) {
                MediaController.B().p0(V0(true), this.f47747e0, this.f47745d0, true);
                int childCount = this.f47768w.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        View childAt = this.f47768w.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) childAt;
                            org.telegram.messenger.ij messageObject4 = q1Var5.getMessageObject();
                            if (this.f47745d0 != null && messageObject4.i4() && MediaController.B().I(messageObject4)) {
                                ImageReceiver photoImage = q1Var5.getPhotoImage();
                                this.f47745d0.setTranslationX(photoImage.K0);
                                this.f47745d0.setTranslationY(q1Var5.getTop() + this.fragmentView.getPaddingTop() + photoImage.L0);
                                this.fragmentView.invalidate();
                                this.f47745d0.invalidate();
                                z9 = true;
                                break;
                            }
                        }
                        i11++;
                    } else {
                        z9 = false;
                        break;
                    }
                }
                if (this.f47745d0 != null) {
                    org.telegram.messenger.ij ijVar = MediaController.B().f21295u0;
                    if (!z9) {
                        this.f47745d0.setTranslationY((-org.telegram.messenger.g0.f22567u) - 100);
                        this.fragmentView.invalidate();
                        if (ijVar != null && ijVar.i4() && (this.V || PipRoundVideoView.F != null)) {
                            MediaController.B().k0(false);
                        }
                    } else {
                        MediaController.B().k0(true);
                    }
                }
            }
            bi.q1 q1Var6 = this.f47768w;
            if (q1Var6 != null) {
                int childCount2 = q1Var6.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.f47768w.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject3 = (q1Var3 = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null) {
                        if (!org.telegram.messenger.ij.S4(messageObject3.f23262k) && !messageObject3.J3()) {
                            if (messageObject3.i4()) {
                                q1Var3.o0(null, false);
                                if (!MediaController.B().I(messageObject3) && messageObject3.f23222b0 != 0.0f) {
                                    messageObject3.H5();
                                    q1Var3.invalidate();
                                }
                            }
                        } else {
                            q1Var3.O3(false, true, false);
                        }
                    }
                }
            }
        } else if (i7 != org.telegram.messenger.qs.f24998f2 && i7 != org.telegram.messenger.qs.f25004g2) {
            if (i7 == org.telegram.messenger.qs.f24992e2) {
                Integer num = (Integer) objArr[0];
                bi.q1 q1Var7 = this.f47768w;
                if (q1Var7 != null) {
                    int childCount3 = q1Var7.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = this.f47768w.getChildAt(i13);
                        if ((childAt3 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = (q1Var2 = (org.telegram.ui.Cells.q1) childAt3).getMessageObject()) != null && messageObject2.f1() == num.intValue()) {
                            org.telegram.messenger.ij ijVar2 = MediaController.B().f21295u0;
                            if (ijVar2 != null) {
                                messageObject2.f23222b0 = ijVar2.f23222b0;
                                messageObject2.f23245g0 = ijVar2.f23245g0;
                                messageObject2.f23249h0 = ijVar2.f23249h0;
                                q1Var2.S3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f25122z4 && this.fragmentView != null) {
                this.X.U(org.telegram.ui.ActionBar.k6.s0());
                this.f47761r.invalidate();
                bi.md mdVar = this.L;
                if (mdVar != null) {
                    mdVar.invalidate();
                }
                this.f47768w.g1();
            }
        } else {
            bi.q1 q1Var8 = this.f47768w;
            if (q1Var8 != null) {
                int childCount4 = q1Var8.getChildCount();
                for (int i14 = 0; i14 < childCount4; i14++) {
                    View childAt4 = this.f47768w.getChildAt(i14);
                    if ((childAt4 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt4).getMessageObject()) != null) {
                        if (!org.telegram.messenger.ij.S4(messageObject.f23262k) && !messageObject.J3()) {
                            if (messageObject.i4() && !MediaController.B().I(messageObject)) {
                                q1Var.o0(null, true);
                            }
                        } else {
                            q1Var.O3(false, true, false);
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
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f47767v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.L.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748202, null)));
        } else if (this.f47769w0 == null && this.f47766u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            if (this.f47748f.megagroup) {
                bi.md mdVar = this.L;
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751013, null));
                f1(X2);
                mdVar.setText(X2);
                return;
            }
            bi.md mdVar2 = this.L;
            SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751012, null));
            f1(X22);
            mdVar2.setText(X22);
        } else {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.L.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748201, null)));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27986kc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28021mc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28005lc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27860df));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47768w, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28177uf));
        View view = this.f47761r;
        int i7 = org.telegram.ui.ActionBar.k6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    public final void h1() {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.ij messageObject;
        int i7;
        bi.q1 q1Var = this.f47768w;
        if (q1Var == null) {
            return;
        }
        int childCount = q1Var.getChildCount();
        int measuredHeight = this.f47768w.getMeasuredHeight();
        int i10 = Integer.MAX_VALUE;
        boolean z9 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        org.telegram.ui.Cells.q1 q1Var2 = null;
        View view = null;
        View view2 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f47768w.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                y1Var.f30918f = y10;
                y1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt;
                int top = q1Var3.getTop();
                q1Var3.getBottom();
                if (top >= 0) {
                    i7 = 0;
                } else {
                    i7 = -top;
                }
                int measuredHeight2 = q1Var3.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i7 + measuredHeight;
                }
                q1Var3.A3(i7, measuredHeight2 - i7, (this.X.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - this.f47768w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.ij messageObject2 = q1Var3.getMessageObject();
                if (this.f47745d0 != null && messageObject2.i4() && MediaController.B().I(messageObject2)) {
                    ImageReceiver photoImage = q1Var3.getPhotoImage();
                    this.f47745d0.setTranslationX(photoImage.K0);
                    this.f47745d0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.L0);
                    this.fragmentView.invalidate();
                    this.f47745d0.invalidate();
                    z10 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) childAt;
                t0Var2.i0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (t0Var2.Q()) {
                    t0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.f47768w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.q1) || (childAt instanceof org.telegram.ui.Cells.t0)) {
                        q1Var2 = childAt;
                    }
                    i10 = bottom;
                    view2 = childAt;
                }
                db dbVar = this.C0;
                if ((dbVar == null || (!dbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.t0) && ((org.telegram.ui.Cells.t0) childAt).getMessageObject().f23259j0) {
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
        k0 k0Var = this.f47745d0;
        if (k0Var != null) {
            if (!z10) {
                k0Var.setTranslationY((-org.telegram.messenger.g0.f22567u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null && ijVar.i4() && this.V) {
                    MediaController.B().k0(false);
                }
            } else {
                MediaController.B().k0(true);
            }
        }
        if (q1Var2 != null) {
            if (q1Var2 instanceof org.telegram.ui.Cells.q1) {
                messageObject = q1Var2.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.t0) q1Var2).getMessageObject();
            }
            this.M.e0(messageObject.f23262k.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.q1) && !(view2 instanceof org.telegram.ui.Cells.t0)) {
            z9 = true;
        }
        this.Q = z9;
        if (view != null) {
            if (view.getTop() <= this.f47768w.getPaddingTop() && !this.Q) {
                if (view.getAlpha() != 0.0f) {
                    view.setAlpha(0.0f);
                }
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                if (this.M.getTag() == null) {
                    this.M.setTag(1);
                }
                if (this.M.getAlpha() != 1.0f) {
                    this.M.setAlpha(1.0f);
                }
                this.P = true;
            } else {
                if (view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                Y0(true ^ this.Q);
            }
            int bottom2 = view.getBottom() - this.f47768w.getPaddingTop();
            if (bottom2 > this.M.getMeasuredHeight() && bottom2 < this.M.getMeasuredHeight() * 2) {
                this.M.setTranslationY(((-t0Var.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.M.setTranslationY(0.0f);
            return;
        }
        Y0(true);
        this.M.setTranslationY(0.0f);
    }

    public final void i1() {
        boolean z9;
        bi.q1 q1Var = this.f47768w;
        if (q1Var != null) {
            int childCount = q1Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f47768w.getChildAt(i7);
                boolean z10 = true;
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    org.telegram.messenger.ij messageObject = q1Var2.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.v()) {
                            q1Var2.setDrawSelectionBackground(false);
                            q1Var2.j3(false, true);
                            q1Var2.l3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.M1() == this.G0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        q1Var2.setHighlighted(z9);
                        if (this.G0 != Integer.MAX_VALUE) {
                            qa qaVar = this.I0;
                            if (qaVar != null) {
                                org.telegram.messenger.g0.r(qaVar);
                            }
                            qa qaVar2 = new qa(this, 0);
                            this.I0 = qaVar2;
                            org.telegram.messenger.g0.i3(qaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f47767v0)) {
                            q1Var2.s3(this.f47767v0);
                        } else {
                            q1Var2.s3(null);
                        }
                        if (this.f47768w.getScrollState() == 0) {
                            z10 = false;
                        }
                        q1Var2.setSpoilersSuppressed(z10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    t0Var.setMessageObject(t0Var.getMessageObject());
                    if (this.f47768w.getScrollState() == 0) {
                        z10 = false;
                    }
                    t0Var.setSpoilersSuppressed(z10);
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
        UndoView undoView = this.f47770x;
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
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25010h2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25004g2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f24998f2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f24992e2);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25122z4);
        Z0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(this.f47748f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new pa(this, 4)), this.classGuid);
        setBulletinDelegate(new fi.r7(7));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25010h2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25004g2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24998f2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24992e2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25122z4);
        this.f47771x0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        kb kbVar = this.X;
        if (kbVar != null) {
            org.telegram.ui.Components.y61 y61Var = kbVar.f37772w;
            if (y61Var != null) {
                y61Var.c(false);
            }
            kbVar.F = true;
        }
        UndoView undoView = this.f47770x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f47752i0 = true;
        this.f47753j0 = true;
        ab.q qVar = ab.q.f988e;
        if (qVar != null && qVar.f989a) {
            ab.q o4 = ab.q.o();
            if (o4.f989a) {
                int i7 = b5.F;
                ((r4) o4.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.f47749f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        kb kbVar = this.X;
        if (kbVar != null) {
            org.telegram.ui.Components.y61 y61Var = kbVar.f37772w;
            if (y61Var != null) {
                y61Var.c(true);
            }
            kbVar.F = false;
        }
        this.f47752i0 = false;
        T0(false);
        if (this.f47753j0) {
            this.f47753j0 = false;
            jb jbVar = this.E;
            if (jbVar != null) {
                jbVar.f();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.f47763s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            this.f47771x0.e();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        if (z9) {
            this.f47771x0.d();
        }
    }
}
