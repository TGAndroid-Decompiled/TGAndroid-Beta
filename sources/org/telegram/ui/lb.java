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
public final class lb extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public static int R0 = 10;
    public static final int[] S0 = {org.telegram.messenger.ks.T, org.telegram.messenger.ks.f25283s, org.telegram.messenger.ks.f25289t, org.telegram.messenger.ks.D, org.telegram.messenger.ks.G0};
    public HashMap A0;
    public boolean B0;
    public final za C0;
    public cb D0;
    public org.telegram.ui.ActionBar.l5 E;
    public final ArrayList E0;
    public ib F;
    public final a0.h F0;
    public TextView G;
    public xa G0;
    public lh.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.zn J;
    public qa J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.r1 K0;
    public ImageView L;
    public int L0;
    public di.xb M;
    public final kb M0;
    public org.telegram.ui.Cells.v0 N;
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
    public org.telegram.messenger.fj Z;
    public final ui.g f49678a;
    public TLRPC.ChannelParticipant f49679a0;
    public final dh.c f49680b;
    public FrameLayout f49681b0;
    public final dh.c f49682c;
    public ImageView f49683c0;
    public final dh.g d;
    public org.telegram.ui.ActionBar.n5 f49684d0;
    public final int f49685e;
    public k0 f49686e0;
    public final TLRPC.Chat f49687f;
    public j4 f49688f0;
    public TextureView f49689g0;
    public final ArrayList h;
    public int f49690h0;
    public int f49691i0;
    public boolean f49692j0;
    public boolean f49693k0;
    public final a0.h f49694l0;
    public final a0.h m0;
    public FrameLayout f49695n;
    public final HashMap f49696n0;
    public final ArrayList f49697o0;
    public final ArrayList f49698p0;
    public final HashSet f49699q0;
    public View f49700r;
    public boolean f49701r0;
    public RadialProgressView f49702s;
    public boolean f49703s0;
    public boolean f49704t0;
    public ArrayList f49705u0;
    public TLRPC.TL_channelAdminLogEventsFilter f49706v0;
    public di.b1 f49707w;
    public String f49708w0;
    public UndoView f49709x;
    public a0.h f49710x0;
    public jg.b0 f49711y;
    public final h2.f f49712y0;
    public final HashMap f49713z0;

    public lb(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.f49690h0 = -1;
        this.f49691i0 = 0;
        this.f49692j0 = true;
        this.f49693k0 = false;
        this.f49694l0 = new a0.h();
        this.m0 = new a0.h();
        this.f49696n0 = new HashMap();
        this.f49697o0 = new ArrayList();
        this.f49698p0 = new ArrayList();
        this.f49699q0 = new HashSet();
        this.f49706v0 = null;
        this.f49708w0 = "";
        this.f49712y0 = new h2.f(S0);
        this.f49713z0 = new HashMap();
        this.C0 = new za(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = Integer.MAX_VALUE;
        this.I0 = -1;
        this.M0 = new kb(this);
        this.O0 = -1;
        this.Q0 = new RectF();
        ri.q qVar = this.glassEngine;
        qVar.f56817a = new ra(this);
        qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        ?? obj = new Object();
        this.f49678a = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.f49680b = cVar;
        cVar.f8372j = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f()) {
            dh.g gVar = new dh.g(false);
            this.d = gVar;
            this.glassEngine.a(gVar);
            ui.f fVar = new ui.f(obj);
            fVar.d = gVar;
            fVar.f59131e = -3;
            fVar.f59132f = obj;
            if (org.telegram.messenger.pc.e(262144)) {
                ui.f fVar2 = new ui.f(obj);
                fVar2.d = gVar;
                fVar2.f59131e = -2;
                fVar2.f59132f = obj;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.f49682c = cVar2;
                cVar2.f8372j = this.glassEngine;
                if (org.telegram.messenger.pc.e(262144)) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                cVar2.d = L2;
                cVar2.f8368e = L2;
                cVar2.f8373k = true;
                this.f49685e = 0;
            } else {
                dh.c cVar3 = new dh.c(fVar, fVar, fVar);
                this.f49682c = cVar3;
                cVar3.f8372j = this.glassEngine;
                if (org.telegram.messenger.pc.e(262144)) {
                    L = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                cVar3.d = L;
                cVar3.f8368e = L;
                this.f49685e = org.telegram.messenger.g0.L(48.0f);
            }
        } else {
            this.d = null;
            this.f49685e = 0;
            dh.c cVar4 = new dh.c(obj, obj, obj);
            this.f49682c = cVar4;
            cVar4.f8372j = this.glassEngine;
        }
        this.f49687f = chat;
    }

    public static void A0(lb lbVar, org.telegram.messenger.fj fjVar) {
        if (lbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        if (fjVar.D == 3) {
            t1Var.U = org.telegram.messenger.gd.N0(2131747985, null);
        } else {
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131748012, fjVar.F0().mime_type);
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
        org.telegram.messenger.mp messagesController = lbVar.getMessagesController();
        TLRPC.Chat chat = lbVar.f49687f;
        TLRPC.ChatFull P0 = messagesController.P0(chat.f28492id);
        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(lbVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, P0, hashMap, lbVar, P0.f28493id, false, org.telegram.messenger.v3.T(chat));
        x50Var.f41832e2 = new ab(lbVar);
        x50Var.show();
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

    public static void P0(lb lbVar) {
        if (lbVar.f49707w != null && !lbVar.f49697o0.isEmpty()) {
            lbVar.f49711y.h1(lbVar.f49698p0.size() - 1, (-100000) - lbVar.f49707w.getPaddingTop());
        }
    }

    public static int Q0(lb lbVar) {
        return lbVar.currentAccount;
    }

    public static vw0 X0(CharSequence charSequence) {
        org.telegram.ui.Components.kq[] kqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.kq kqVar : (org.telegram.ui.Components.kq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.kq.class)) {
                if (kqVar != null) {
                    Drawable drawable = kqVar.f36849c;
                    if (drawable instanceof vw0) {
                        return (vw0) drawable;
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
        org.telegram.messenger.fj fjVar;
        a0.h hVar = lbVar.f49694l0;
        int i7 = 0;
        lbVar.D0.N = false;
        lbVar.b1(false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).f4(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).Z3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = lbVar.f49697o0;
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.f28524id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                lbVar.P = Math.min(lbVar.P, tL_channelAdminLogEvent.f28524id);
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(lbVar.currentAccount, tL_channelAdminLogEvent, arrayList, lbVar.f49696n0, lbVar.f49687f, lbVar.U, false);
                if (fjVar2.U >= 0) {
                    hVar.k(fjVar2, tL_channelAdminLogEvent.f28524id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(size);
            if (fjVar3 != null && fjVar3.U != 0 && fjVar3.L1() >= 0) {
                lbVar.m0.k(fjVar3, fjVar3.L1());
            }
            if (fjVar3 != null && (message = fjVar3.f24073k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (size != i11) {
                                fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
                                if (fjVar.U != 1 && fjVar.L1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i11++;
                        } else {
                            fjVar = null;
                            break;
                        }
                    }
                    if (fjVar != null) {
                        fjVar3.C = fjVar;
                    }
                }
                arrayList2.add(fjVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.ri.d0(lbVar.currentAccount).a1(arrayList2, -lbVar.f49687f.f28492id, 0, 0L, new qa(lbVar, 1), lbVar.getClassGuid(), null);
        }
        lbVar.W0();
        lbVar.f49703s0 = false;
        if (!z10) {
            lbVar.f49701r0 = true;
        }
        org.telegram.messenger.g0.X3(lbVar.f49695n, false, 0.3f, true, true);
        lbVar.f49707w.setEmptyView(lbVar.I);
        ib ibVar = lbVar.F;
        if (ibVar != null) {
            ibVar.f();
        }
        org.telegram.ui.ActionBar.q0 q0Var = lbVar.O;
        if (q0Var != null) {
            if (lbVar.f49698p0.isEmpty() && TextUtils.isEmpty(lbVar.f49708w0)) {
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
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 0, lbVar.getParentActivity(), lbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
            Rect rect = new Rect();
            lbVar.getParentActivity().getResources().getDrawable(2131232569).mutate().getPadding(rect);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, lbVar.getResourceProvider());
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                if (arrayList4.get(i10) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(lbVar.getParentActivity(), lbVar.getResourceProvider()), c8.na.o(-1, 8));
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
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, parentActivity, lbVar.getResourceProvider(), z10, z11);
                    y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    y0Var.j((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                    if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                        y0Var.d(lbVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29692q7), lbVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29672p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                    y0Var.setOnClickListener(new fi.k5(lbVar, i10, arrayList4, (Integer) arrayList4.get(i10), 1));
                }
                i10++;
                arrayList4 = arrayList;
            }
            wa waVar = new wa(0, lbVar.Y.getContext(), lbVar);
            waVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.na.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            waVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            xa xaVar = new xa(lbVar, waVar);
            lbVar.G0 = xaVar;
            xaVar.f29036e = true;
            xaVar.f29035c = 220;
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
            } else if (left > (lbVar.f49707w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - waVar.getMeasuredWidth()) {
                left = (lbVar.f49707w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - waVar.getMeasuredWidth();
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
                int y10 = (int) (lbVar.f49707w.getY() + view.getTop() + f11);
                if ((L - rect.top) - rect.bottom > org.telegram.messenger.g0.L(240.0f)) {
                    i7 = (org.telegram.messenger.g0.L(240.0f) - L) + y10;
                } else {
                    i7 = y10;
                }
                if (i7 < lbVar.f49707w.getY() + org.telegram.messenger.g0.L(24.0f)) {
                    i7 = (int) (lbVar.f49707w.getY() + org.telegram.messenger.g0.L(24.0f));
                } else {
                    int i11 = height - L;
                    if (i7 > i11 - org.telegram.messenger.g0.L(8.0f)) {
                        i7 = i11 - org.telegram.messenger.g0.L(8.0f);
                    }
                }
            } else if (!lbVar.inBubbleMode) {
                i7 = org.telegram.messenger.g0.f24220m;
            }
            waVar.setMaxHeight(height - i7);
            lbVar.G0.showAtLocation(lbVar.f49707w, 51, left, i7);
            lbVar.G0.b();
        }
    }

    public static void b0(org.telegram.ui.lb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.b0(org.telegram.ui.lb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void c0(lb lbVar, int i7) {
        dh.g gVar = lbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.ed.a(i7, 4)) {
                ti.a e10 = lbVar.glassEngine.e();
                e10.b(lbVar.f49707w.getY(), lbVar.Y.getWidth(), lbVar.f49707w.getY() + lbVar.f49707w.getHeight());
                gVar.h(e10);
            }
            jb jbVar = lbVar.Y;
            Objects.requireNonNull(jbVar);
            gVar.e(new oa(jbVar, 0), lbVar.Y.getWidth(), lbVar.Y.getHeight());
        }
    }

    public static void d0(lb lbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = lbVar.f49694l0;
        lbVar.f49704t0 = false;
        lbVar.D0.N = false;
        lbVar.b1(false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).f4(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).Z3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i7 = 0; i7 < tL_channels_adminLogResults.events.size(); i7++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i7);
            if (hVar.h(tL_channelAdminLogEvent2.f28524id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                lbVar.P = Math.min(lbVar.P, tL_channelAdminLogEvent2.f28524id);
                org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(lbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, lbVar.f49687f, lbVar.U, false);
                if (fjVar.U >= 0 && (((tL_channelAdminLogEvent = fjVar.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f28524id))) {
                    lbVar.f49697o0.add(0, fjVar);
                    hVar.k(fjVar, tL_channelAdminLogEvent2.f28524id);
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
        TLRPC.ChatFull P0;
        TLRPC.Chat chat = lbVar.f49687f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            lbVar.getMessagesController().f4(tL_channels_channelParticipants.users, false);
            lbVar.getMessagesController().Z3(tL_channels_channelParticipants.chats, false);
            lbVar.f49705u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (P0 = lbVar.getMessagesController().P0(chat.f28492id)) != null && P0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = lbVar.getMessagesController().f25760h5;
                channelParticipant.peer = lbVar.getMessagesController().B1(channelParticipant.user_id);
                long j3 = lbVar.getMessagesController().f25760h5;
                if (lbVar.getMessagesController().c2(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.f28635id.add(tL_inputUser);
                    ConnectionsManager.getInstance(lbVar.currentAccount).sendRequest(tL_users_getUsers, new pa(lbVar, 1));
                }
                lbVar.f49705u0.add(0, channelParticipant);
            }
            Dialog dialog = lbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.o0) {
                ((org.telegram.ui.Components.o0) dialog).f1(lbVar.f49705u0);
            }
        }
    }

    public static void e1(int i7, org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return;
        }
        if (i7 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = fjVar.f24073k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = fjVar.f24073k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            fjVar.f24073k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.gd.G(i7, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        fjVar.i5();
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

    public final org.telegram.messenger.fj S0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        String str;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f49698p0;
            fjVar = null;
            if (i7 < arrayList2.size()) {
                fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i7);
                if (fjVar2 != null && fjVar2.U == 1 && fjVar2.J0 == j3) {
                    break;
                }
                i7++;
            } else {
                fjVar2 = null;
                break;
            }
        }
        if (fjVar2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f49687f.f28492id;
            tL_message.f28513id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.fj) arrayList.get(0)).f24073k.date;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            fjVar2 = new org.telegram.messenger.fj(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j10));
        fjVar2.U = 1;
        if (z11 && arrayList.size() > 1) {
            fjVar2.J0 = j3;
        } else {
            fjVar2.J0 = -1L;
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
                    TLRPC.Chat O0 = lbVar.getMessagesController().O0(Long.valueOf(-l10.longValue()));
                    if (O0 == null) {
                        return null;
                    }
                    return O0.title;
                }
                return org.telegram.messenger.n10.l(lbVar.getMessagesController().c2(l10));
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.fj.E5(org.telegram.messenger.gd.G(arrayList.size(), str, join), "un1", c22));
        if (z11 && arrayList.size() > 1) {
            vw0 X0 = X0(fjVar2.v);
            int i10 = 2131751023;
            if (X0 == null) {
                if (z10) {
                    i10 = 2131751024;
                }
                X0 = new vw0(org.telegram.messenger.gd.N0(i10, null));
                Typeface o4 = org.telegram.messenger.g0.o();
                org.telegram.ui.Components.m6 m6Var = X0.f53044a;
                m6Var.x(o4);
                m6Var.w(org.telegram.messenger.g0.L(10.0f));
                if (X0.f53046c != -1) {
                    X0.f53046c = -1;
                    X0.invalidateSelf();
                }
                X0.a(503316480);
            } else {
                org.telegram.ui.Components.m6 m6Var2 = X0.f53044a;
                if (z10) {
                    i10 = 2131751024;
                }
                m6Var2.t(org.telegram.messenger.gd.N0(i10, null), false, true);
            }
            X0.setBounds(0, 0, X0.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(0, X0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fjVar2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList);
        }
        if (fjVar != null) {
            long j11 = fjVar.T;
            a0.h hVar = this.F0;
            if (!hVar.d(j11)) {
                long j12 = fjVar.T;
                int i11 = R0;
                R0 = i11 + 1;
                hVar.k(Integer.valueOf(i11), j12);
            }
            fjVar2.f24083m1 = ((Integer) hVar.f(fjVar.T)).intValue();
        }
        return fjVar2;
    }

    public final void T0(boolean z10) {
        int abs;
        jg.b0 b0Var = this.f49711y;
        if (b0Var != null && !this.f49692j0) {
            int L0 = b0Var.L0();
            int i7 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f49711y.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.F.getClass();
                if (z10) {
                    i7 = 4;
                }
                if (L0 <= i7 && !this.f49703s0 && !this.f49701r0) {
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
        if (this.f49686e0 == null) {
            k0 k0Var = new k0(4, getParentActivity(), this);
            this.f49686e0 = k0Var;
            k0Var.setOutlineProvider(new bg.q0(9));
            this.f49686e0.setClipToOutline(true);
            this.f49686e0.setWillNotDraw(false);
            this.f49686e0.setVisibility(4);
            j4 j4Var = new j4(getParentActivity());
            this.f49688f0 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z10) {
                this.f49686e0.addView(this.f49688f0, c8.na.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f49689g0 = textureView;
            textureView.setOpaque(false);
            this.f49688f0.addView(this.f49689g0, c8.na.c(-1.0f, -1));
        }
        if (this.f49686e0.getParent() == null) {
            jb jbVar = this.Y;
            k0 k0Var2 = this.f49686e0;
            int i7 = org.telegram.messenger.g0.f24230u;
            jbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i7, i7));
        }
        this.f49686e0.setVisibility(4);
        this.f49688f0.setDrawingReady(false);
        return this.f49689g0;
    }

    public final void W0() {
        long j3;
        org.telegram.messenger.fj fjVar;
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
            ArrayList arrayList4 = this.f49697o0;
            if (i11 < arrayList4.size()) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList4.get(i11);
                if (fjVar2 != null && (tL_channelAdminLogEvent2 = fjVar2.L1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j3 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j3 = 0;
                }
                if (fjVar2.f24083m1 <= 0) {
                    int i12 = R0;
                    R0 = i12 + 1;
                    fjVar2.f24083m1 = i12;
                }
                int i13 = i11 + 1;
                if (i13 < arrayList4.size()) {
                    fjVar = (org.telegram.messenger.fj) arrayList4.get(i13);
                } else {
                    fjVar = null;
                }
                if (fjVar != null && (tL_channelAdminLogEvent = fjVar.L1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent.user_id;
                } else {
                    j10 = 0;
                }
                if (j3 != 0) {
                    arrayList3.add(fjVar2);
                } else {
                    arrayList2.add(fjVar2);
                }
                if (j3 != j10 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = fjVar2.f24073k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.fj) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((org.telegram.messenger.fj) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) i5.c.h(1, arrayList3);
                        if (TextUtils.isEmpty(this.f49708w0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(fjVar3.T);
                        HashSet hashSet = this.f49699q0;
                        if (!hashSet.contains(valueOf) && z11) {
                            e1(arrayList3.size() - 1, fjVar3);
                            arrayList2.add(fjVar3);
                        } else {
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                e1(0, (org.telegram.messenger.fj) arrayList3.get(i14));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = fjVar3.f24073k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z10 != z12) {
                            fjVar3.M1 = true;
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
                        long j11 = fjVar2.T;
                        arrayList = arrayList3;
                        arrayList2.add(S0(j11, fjVar2.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) i5.c.h(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(S0(fjVar4.T, fjVar4.L1.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i11 = i13;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f49698p0;
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
                    this.S.addListener(new org.telegram.ui.Cells.x9(this, 2));
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
        if (!this.f49703s0) {
            ArrayList arrayList = this.f49697o0;
            if (z10) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f49695n;
                if (frameLayout != null) {
                    org.telegram.messenger.g0.X3(frameLayout, true, 0.3f, true, true);
                    this.I.setVisibility(4);
                    this.f49707w.setEmptyView(null);
                }
                this.f49694l0.b();
                arrayList.clear();
                this.f49696n0.clear();
                W0();
            }
            this.f49703s0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = org.telegram.messenger.mp.k1(this.f49687f);
            tL_channels_getAdminLog.f28527q = this.f49708w0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.P;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f49706v0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f49710x0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i7 = 0; i7 < this.f49710x0.m(); i7++) {
                    tL_channels_getAdminLog.admins.add(org.telegram.messenger.mp.u1(this.currentAccount).s1((TLRPC.User) this.f49710x0.n(i7)));
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
        if (this.f49704t0) {
            return;
        }
        this.f49704t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.mp.k1(this.f49687f);
        tL_channels_getAdminLog.f28527q = this.f49708w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f49706v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f49710x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i7 = 0; i7 < this.f49710x0.m(); i7++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.mp.u1(this.currentAccount).s1((TLRPC.User) this.f49710x0.n(i7)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 0));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29813wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29794vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29533hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29588kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29569jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29621md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29402af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29605ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29870ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29850ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29868zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29831xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29848yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29812we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29775ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29792vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29755te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29773uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29736se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29753tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29718re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29734sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29699qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29716rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29679pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29697qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29622me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29659oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29620mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29587ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29604lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29568je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29585kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29550ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29439cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29514ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29475ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29566jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29477ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29421be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29548ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29401ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29530hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29869zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29830xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29811wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29695qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29711r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29867zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29793vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29774ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29754td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29735sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29717rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29698qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29678pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29658od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29567jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29457dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29440cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29400ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29810wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29791vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29772ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29715rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29752tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29751ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29714ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29653o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29635n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29618m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29600l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29582k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29562j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29544i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    public final void b1(boolean z10) {
        int i7;
        long j3;
        di.b1 b1Var = this.f49707w;
        if (b1Var != null && this.f49711y != null && b1Var.getChildCount() > 0) {
            if (z10) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.r1 r1Var = null;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f49707w.getChildCount(); i11++) {
                View childAt = this.f49707w.getChildAt(i11);
                this.f49707w.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i7) {
                        }
                        i7 = childAt.getTop();
                        r1Var = childAt;
                        i10 = R;
                    } else {
                        if (top <= i7) {
                        }
                        i7 = childAt.getTop();
                        r1Var = childAt;
                        i10 = R;
                    }
                }
            }
            if (r1Var != null) {
                if (r1Var instanceof org.telegram.ui.Cells.r1) {
                    j3 = r1Var.getMessageObject().T;
                } else if (r1Var instanceof org.telegram.ui.Cells.v0) {
                    j3 = r1Var.getMessageObject().T;
                } else {
                    j3 = 0;
                }
                this.N0 = j3;
                this.O0 = i10;
                this.P0 = (this.f49707w.getMeasuredHeight() - r1Var.getBottom()) - this.f49707w.getPaddingBottom();
            }
        }
    }

    public final int c1(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i7;
        StaticLayout staticLayout;
        float lineTop;
        float f10;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.dj djVar;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(fjVar.f24131z) && (r1Var = this.K0) != null && (djVar = r1Var.f31565m3) != null) {
                i7 = (int) r1Var.f31660t3;
                charSequence = fjVar.f24131z;
                arrayList = djVar.f23662e;
            } else {
                CharSequence charSequence2 = fjVar.v;
                arrayList = fjVar.B2;
                org.telegram.ui.Cells.r1 r1Var2 = this.K0;
                if (r1Var2 != null && r1Var2.f31685v1) {
                    i7 = r1Var2.W1 + org.telegram.messenger.g0.L(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i7 = 0;
                }
            }
            org.telegram.ui.Cells.r1 r1Var3 = this.K0;
            if (r1Var3 != null) {
                r1Var3.f31510hd = 0;
                r1Var3.f31523id = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.fj.Y(this.I0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) arrayList.get(i10);
                        String charSequence3 = cjVar.f23476e.getText().toString();
                        int i11 = cjVar.f23478n;
                        if (Y > i11) {
                            if (Y - i11 > charSequence3.length() - 1) {
                                lineTop = i7 + ((int) (cjVar.o(arrayList) + cjVar.f23477f + cjVar.f23481w));
                            } else {
                                lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(Y - cjVar.f23478n)) + cjVar.o(arrayList) + i7 + cjVar.f23477f;
                            }
                            Point point = org.telegram.messenger.g0.f24226q;
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
            org.telegram.ui.Cells.r1 r1Var4 = this.K0;
            if (r1Var4 != null) {
                r1Var4.f31510hd = 0;
                r1Var4.f31523id = null;
            }
        }
        return 0;
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i7 = 0; i7 < 8; i7++) {
                arrayList.add(new org.telegram.ui.Cells.r1(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.n6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new y7(this, 5));
        org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, null, false, null);
        this.J = znVar;
        pk pkVar = znVar.h;
        if (pkVar != null) {
            pkVar.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        }
        pk pkVar2 = znVar.f42949r;
        if (pkVar2 != null) {
            pkVar2.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        }
        znVar.m0 = true;
        this.J.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.addView(this.J, 0, c8.na.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232491);
        a10.O();
        a10.I = new bi.x1(this, 2);
        this.O = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.zn znVar2 = this.J;
        TLRPC.Chat chat = this.f49687f;
        znVar2.setTitle(chat.title);
        this.J.setSubtitle(org.telegram.messenger.gd.N0(2131751062, null));
        this.J.setChatAvatar(chat);
        bb bbVar = new bb(this, context);
        this.fragmentView = bbVar;
        this.Y = bbVar;
        bbVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.Y.U(org.telegram.ui.ActionBar.n6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        hh.b p10 = c8.j0.p(this.resourceProvider);
        dh.c cVar = this.f49682c;
        kVar.P(cVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, c8.na.e(-1, -2, 17));
        this.I.setOnTouchListener(new gi.a(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.y5(this.M, this.Y, org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.n6.f29485f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(2131231615);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, c8.na.t(54, 54, 17, 16, 20, 16, -4));
        di.xb xbVar = new di.xb(context, 10);
        this.M = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        di.xb xbVar2 = this.M;
        int i10 = org.telegram.ui.ActionBar.n6.Zc;
        org.telegram.ui.ActionBar.u6.U(xbVar2, i10, null);
        this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        this.K.addView(this.M, c8.na.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, c8.na.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        di.b1 b1Var = new di.b1(9, context, this);
        this.f49707w = b1Var;
        b1Var.setOnItemClickListener(new f(this, 7));
        this.f49707w.setTag(1);
        this.f49707w.setVerticalScrollBarEnabled(true);
        di.b1 b1Var2 = this.f49707w;
        ib ibVar = new ib(this, context);
        this.F = ibVar;
        b1Var2.setAdapter(ibVar);
        this.f49707w.setClipToPadding(false);
        di.b1 b1Var3 = this.f49707w;
        int i11 = org.telegram.messenger.g0.f24220m;
        int i12 = this.f49685e;
        b1Var3.setPadding(0, org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + i12, 0, org.telegram.messenger.g0.L(60.0f) + i12 + org.telegram.messenger.g0.f24221n);
        di.b1 b1Var4 = this.f49707w;
        cb cbVar = new cb(this, this.f49707w, this.resourceProvider);
        this.D0 = cbVar;
        b1Var4.setItemAnimator(cbVar);
        this.D0.Q = true;
        this.f49707w.setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(this);
        this.f49711y = b0Var;
        b0Var.j1(1);
        this.f49711y.l1(true);
        this.f49707w.setLayoutManager(this.f49711y);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(this.f49707w, this.f49711y);
        this.E = l5Var;
        l5Var.f29288n = new ra(this);
        l5Var.f29289r = this.M0;
        this.Y.addView(this.f49707w, c8.na.c(-1.0f, -1));
        this.f49707w.setOnScrollListener(new g3(this));
        this.glassEngine.b(this.f49707w);
        int i13 = this.f49690h0;
        if (i13 != -1) {
            this.f49711y.h1(i13, this.f49691i0);
            this.f49690h0 = -1;
        }
        lh.f fVar = new lh.f(context);
        this.X = fVar;
        fVar.setup(this.f49680b);
        this.X.setFadeZoneTop(org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m);
        this.X.setFadeHeightTop(org.telegram.messenger.g0.L(60.0f));
        this.X.setFadeZoneBottom(org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(44.0f) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.f24221n);
        this.X.setFadeHeightBottom(org.telegram.messenger.g0.L(60.0f));
        this.Y.addView(this.X, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f49695n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.f49695n, c8.na.e(-1, -1, 51));
        View view = new View(context);
        this.f49700r = view;
        view.setBackground(new org.telegram.ui.ActionBar.y5(this.f49700r, this.Y, org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.f29485f2));
        this.f49695n.addView(this.f49700r, c8.na.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f49702s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        this.f49702s.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        this.f49695n.addView(this.f49702s, c8.na.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.N = v0Var;
        v0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, c8.na.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        lh.e eVar = new lh.e(context, cVar, c8.j0.b(i6Var), i6Var);
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-org.telegram.messenger.g0.f24221n);
        this.H.c(4, true, false);
        lh.e eVar2 = this.H;
        fh.g c10 = eVar2.f19956n.c(eVar2, null, false);
        c10.p(eVar2.f19957r);
        org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        eVar2.f19958s = c10;
        this.Y.addView(this.H, c8.na.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final lb f52330b;

            {
                this.f52330b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                lb lbVar = this.f52330b;
                switch (i14) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.o0 o0Var = new org.telegram.ui.Components.o0(lbVar, lbVar.f49706v0, lbVar.f49710x0, lbVar.f49687f.megagroup);
                            o0Var.f1(lbVar.f49705u0);
                            o0Var.f37968c2 = new ra(lbVar);
                            lbVar.showDialog(o0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f49687f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750965, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750964, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131750963, null);
                        lbVar.showDialog(t1Var);
                        return;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.o(lbVar.getParentActivity(), new na(lbVar, 0), null).f13936b);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(this.G, org.telegram.ui.ActionBar.n6.f29737sf, null);
        this.G.setText(org.telegram.messenger.gd.N0(2131745787, null));
        this.G.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        this.H.getContainer().addView(this.G, c8.na.e(-2, -2, 17));
        this.H.f19955f.add(this.G);
        this.H.d(false);
        this.H.f19952b[4] = new View.OnClickListener(this) {
            public final lb f52330b;

            {
                this.f52330b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                lb lbVar = this.f52330b;
                switch (i14) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.o0 o0Var = new org.telegram.ui.Components.o0(lbVar, lbVar.f49706v0, lbVar.f49710x0, lbVar.f49687f.megagroup);
                            o0Var.f1(lbVar.f49705u0);
                            o0Var.f37968c2 = new ra(lbVar);
                            lbVar.showDialog(o0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f49687f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750965, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750964, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131750963, null);
                        lbVar.showDialog(t1Var);
                        return;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.o(lbVar.getParentActivity(), new na(lbVar, 0), null).f13936b);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f49681b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f49681b0.setVisibility(4);
        this.f49681b0.setFocusable(true);
        this.f49681b0.setFocusableInTouchMode(true);
        this.f49681b0.setClickable(true);
        this.f49681b0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.Y.addView(this.f49681b0, c8.na.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f49683c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f49683c0.setImageResource(2131232081);
        org.telegram.ui.ActionBar.u6.s(this.f49683c0, org.telegram.ui.ActionBar.n6.f29680pf, null, PorterDuff.Mode.MULTIPLY);
        this.f49681b0.addView(this.f49683c0, c8.na.e(48, 48, 53));
        this.f49683c0.setOnClickListener(new View.OnClickListener(this) {
            public final lb f52330b;

            {
                this.f52330b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                lb lbVar = this.f52330b;
                switch (i14) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.o0 o0Var = new org.telegram.ui.Components.o0(lbVar, lbVar.f49706v0, lbVar.f49710x0, lbVar.f49687f.megagroup);
                            o0Var.f1(lbVar.f49705u0);
                            o0Var.f37968c2 = new ra(lbVar);
                            lbVar.showDialog(o0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f49687f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750965, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750964, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131750963, null);
                        lbVar.showDialog(t1Var);
                        return;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.o(lbVar.getParentActivity(), new na(lbVar, 0), null).f13936b);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f49684d0 = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.qf, null);
        this.f49684d0.setTextSize(15);
        this.f49684d0.setTypeface(org.telegram.messenger.g0.o());
        this.f49681b0.addView(this.f49684d0, c8.na.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.f49703s0 && this.f49697o0.isEmpty()) {
            org.telegram.messenger.g0.X3(this.f49695n, true, 0.3f, true, true);
            this.f49707w.setEmptyView(null);
        } else {
            org.telegram.messenger.g0.X3(this.f49695n, false, 0.3f, true, true);
            this.f49707w.setEmptyView(this.I);
        }
        di.b1 b1Var5 = this.f49707w;
        b1Var5.X1 = true;
        b1Var5.Y1 = 1;
        UndoView undoView = new UndoView(context);
        this.f49709x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.Y.addView(this.f49709x, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    public final void d1(org.telegram.messenger.fj r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.d1(org.telegram.messenger.fj):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Cells.r1 r1Var2;
        org.telegram.messenger.fj messageObject2;
        org.telegram.ui.Cells.r1 r1Var3;
        org.telegram.messenger.fj messageObject3;
        boolean z10;
        if (i7 == org.telegram.messenger.ks.f25247l4) {
            di.b1 b1Var = this.f49707w;
            if (b1Var != null) {
                b1Var.g1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.f25223h2) {
            if (((org.telegram.messenger.fj) objArr[0]).h4()) {
                MediaController.B().p0(V0(true), this.f49688f0, this.f49686e0, true);
                int childCount = this.f49707w.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        View childAt = this.f49707w.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.r1) {
                            org.telegram.ui.Cells.r1 r1Var4 = (org.telegram.ui.Cells.r1) childAt;
                            org.telegram.messenger.fj messageObject4 = r1Var4.getMessageObject();
                            if (this.f49686e0 != null && messageObject4.h4() && MediaController.B().I(messageObject4)) {
                                ImageReceiver photoImage = r1Var4.getPhotoImage();
                                this.f49686e0.setTranslationX(photoImage.L0);
                                this.f49686e0.setTranslationY(r1Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                                this.fragmentView.invalidate();
                                this.f49686e0.invalidate();
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
                if (this.f49686e0 != null) {
                    org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                    if (!z10) {
                        this.f49686e0.setTranslationY((-org.telegram.messenger.g0.f24230u) - 100);
                        this.fragmentView.invalidate();
                        if (fjVar != null && fjVar.h4() && (this.W || PipRoundVideoView.G != null)) {
                            MediaController.B().k0(false);
                        }
                    } else {
                        MediaController.B().k0(true);
                    }
                }
            }
            di.b1 b1Var2 = this.f49707w;
            if (b1Var2 != null) {
                int childCount2 = b1Var2.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.f49707w.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.r1) && (messageObject3 = (r1Var3 = (org.telegram.ui.Cells.r1) childAt2).getMessageObject()) != null) {
                        if (!org.telegram.messenger.fj.R4(messageObject3.f24073k) && !messageObject3.I3()) {
                            if (messageObject3.h4()) {
                                r1Var3.p0(null, false);
                                if (!MediaController.B().I(messageObject3) && messageObject3.f24033b0 != 0.0f) {
                                    messageObject3.G5();
                                    r1Var3.invalidate();
                                }
                            }
                        } else {
                            r1Var3.Q3(false, true, false);
                        }
                    }
                }
            }
        } else if (i7 != org.telegram.messenger.ks.f25211f2 && i7 != org.telegram.messenger.ks.f25217g2) {
            if (i7 == org.telegram.messenger.ks.f25205e2) {
                Integer num = (Integer) objArr[0];
                di.b1 b1Var3 = this.f49707w;
                if (b1Var3 != null) {
                    int childCount3 = b1Var3.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = this.f49707w.getChildAt(i13);
                        if ((childAt3 instanceof org.telegram.ui.Cells.r1) && (messageObject2 = (r1Var2 = (org.telegram.ui.Cells.r1) childAt3).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                            org.telegram.messenger.fj fjVar2 = MediaController.B().f22838v0;
                            if (fjVar2 != null) {
                                messageObject2.f24033b0 = fjVar2.f24033b0;
                                messageObject2.f24065i0 = fjVar2.f24065i0;
                                messageObject2.f24070j0 = fjVar2.f24070j0;
                                r1Var2.U3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.C4 && this.fragmentView != null) {
                this.Y.U(org.telegram.ui.ActionBar.n6.s0());
                this.f49700r.invalidate();
                di.xb xbVar = this.M;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                this.f49707w.g1();
            }
        } else {
            di.b1 b1Var4 = this.f49707w;
            if (b1Var4 != null) {
                int childCount4 = b1Var4.getChildCount();
                for (int i14 = 0; i14 < childCount4; i14++) {
                    View childAt4 = this.f49707w.getChildAt(i14);
                    if ((childAt4 instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt4).getMessageObject()) != null) {
                        if (!org.telegram.messenger.fj.R4(messageObject.f24073k) && !messageObject.I3()) {
                            if (messageObject.h4() && !MediaController.B().I(messageObject)) {
                                r1Var.p0(null, true);
                            }
                        } else {
                            r1Var.Q3(false, true, false);
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
        if (!TextUtils.isEmpty(this.f49708w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748008, null)));
        } else if (this.f49710x0 == null && this.f49706v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            if (this.f49687f.megagroup) {
                di.xb xbVar = this.M;
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131751000, null));
                f1(W2);
                xbVar.setText(W2);
                return;
            }
            di.xb xbVar2 = this.M;
            SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750999, null));
            f1(W22);
            xbVar2.setText(W22);
        } else {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748007, null)));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29399ac));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29639nc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29677pc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29657oc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29515gf));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49707w, 131072, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29832xf));
        View view = this.f49700r;
        int i7 = org.telegram.ui.ActionBar.n6.f29440cd;
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.M, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    public final void h1() {
        org.telegram.ui.Cells.v0 v0Var;
        org.telegram.messenger.fj messageObject;
        int i7;
        di.b1 b1Var = this.f49707w;
        if (b1Var == null) {
            return;
        }
        int childCount = b1Var.getChildCount();
        int measuredHeight = this.f49707w.getMeasuredHeight();
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.r1 r1Var = null;
        View view = null;
        View view2 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f49707w.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                z1Var.f32587f = y10;
                z1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                int top = r1Var2.getTop();
                r1Var2.getBottom();
                if (top >= 0) {
                    i7 = 0;
                } else {
                    i7 = -top;
                }
                int measuredHeight2 = r1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i7 + measuredHeight;
                }
                r1Var2.C3(i7, measuredHeight2 - i7, (this.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - this.f49707w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.fj messageObject2 = r1Var2.getMessageObject();
                if (this.f49686e0 != null && messageObject2.h4() && MediaController.B().I(messageObject2)) {
                    ImageReceiver photoImage = r1Var2.getPhotoImage();
                    this.f49686e0.setTranslationX(photoImage.L0);
                    this.f49686e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.f49686e0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) childAt;
                v0Var2.m0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (v0Var2.U()) {
                    v0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.f49707w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.r1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        r1Var = childAt;
                    }
                    i10 = bottom;
                    view2 = childAt;
                }
                cb cbVar = this.D0;
                if ((cbVar == null || (!cbVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().f24079l0) {
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
        k0 k0Var = this.f49686e0;
        if (k0Var != null) {
            if (!z11) {
                k0Var.setTranslationY((-org.telegram.messenger.g0.f24230u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                if (fjVar != null && fjVar.h4() && this.W) {
                    MediaController.B().k0(false);
                }
            } else {
                MediaController.B().k0(true);
            }
        }
        if (r1Var != null) {
            if (r1Var instanceof org.telegram.ui.Cells.r1) {
                messageObject = r1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.v0) r1Var).getMessageObject();
            }
            this.N.j0(messageObject.f24073k.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof org.telegram.ui.Cells.r1) && !(view2 instanceof org.telegram.ui.Cells.v0)) {
            z10 = true;
        }
        this.R = z10;
        if (view != null) {
            if (view.getTop() <= this.f49707w.getPaddingTop() && !this.R) {
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
            int bottom2 = view.getBottom() - this.f49707w.getPaddingTop();
            if (bottom2 > this.N.getMeasuredHeight() && bottom2 < this.N.getMeasuredHeight() * 2) {
                this.N.setTranslationY(((-v0Var.getMeasuredHeight()) * 2) + bottom2);
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
        di.b1 b1Var = this.f49707w;
        if (b1Var != null) {
            int childCount = b1Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f49707w.getChildAt(i7);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.x()) {
                            r1Var.setDrawSelectionBackground(false);
                            r1Var.l3(false, true);
                            r1Var.n3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r1Var.setHighlighted(z10);
                        if (this.H0 != Integer.MAX_VALUE) {
                            qa qaVar = this.J0;
                            if (qaVar != null) {
                                org.telegram.messenger.g0.r(qaVar);
                            }
                            qa qaVar2 = new qa(this, 0);
                            this.J0 = qaVar2;
                            org.telegram.messenger.g0.h3(qaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f49708w0)) {
                            r1Var.u3(this.f49708w0);
                        } else {
                            r1Var.u3(null);
                        }
                        if (this.f49707w.getScrollState() == 0) {
                            z11 = false;
                        }
                        r1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    v0Var.setMessageObject(v0Var.getMessageObject());
                    if (this.f49707w.getScrollState() == 0) {
                        z11 = false;
                    }
                    v0Var.setSpoilersSuppressed(z11);
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
        UndoView undoView = this.f49709x;
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
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25223h2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25217g2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25211f2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25205e2);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.C4);
        Z0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.mp.k1(this.f49687f);
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
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25223h2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25217g2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25211f2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25205e2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.C4);
        this.f49712y0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        jb jbVar = this.Y;
        if (jbVar != null) {
            org.telegram.ui.Components.n71 n71Var = jbVar.f34146w;
            if (n71Var != null) {
                n71Var.c(false);
            }
            jbVar.G = true;
        }
        UndoView undoView = this.f49709x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f49692j0 = true;
        this.f49693k0 = true;
        ab.q qVar = ab.q.f986e;
        if (qVar != null && qVar.f987a) {
            ab.q p10 = ab.q.p();
            if (p10.f987a) {
                int i7 = b5.G;
                ((r4) p10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.f49689g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        jb jbVar = this.Y;
        if (jbVar != null) {
            org.telegram.ui.Components.n71 n71Var = jbVar.f34146w;
            if (n71Var != null) {
                n71Var.c(true);
            }
            jbVar.G = false;
        }
        this.f49692j0 = false;
        T0(false);
        if (this.f49693k0) {
            this.f49693k0 = false;
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
            RadialProgressView radialProgressView = this.f49702s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zc, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f49712y0.e();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f49712y0.d();
        }
    }
}
