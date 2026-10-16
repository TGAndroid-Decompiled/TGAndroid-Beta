package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
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
import android.text.TextPaint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class ac extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final lb B0;
    public qb C0;
    public final ArrayList D0;
    public wb E;
    public final a0.h E0;
    public TextView F;
    public jb F0;
    public kh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.ro I;
    public cb I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.u1 J0;
    public ImageView K;
    public int K0;
    public bi.f4 L;
    public final zb L0;
    public org.telegram.ui.Cells.w0 M;
    public long M0;
    public org.telegram.ui.ActionBar.u0 N;
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
    public kh.f W;
    public xb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final gh.e f33834a;
    public FrameLayout f33835a0;
    public final bh.b f33836b;
    public ImageView f33837b0;
    public final bh.b f33838c;
    public org.telegram.ui.ActionBar.h5 f33839c0;
    public final bh.f d;
    public l0 f33840d0;
    public final int e;
    public n4 f33841e0;
    public final TLRPC.Chat f33842f;
    public TextureView f33843f0;
    public int f33844g0;
    public final ArrayList h;
    public int f33845h0;
    public boolean f33846i0;
    public boolean f33847j0;
    public final a0.h f33848k0;
    public final a0.h f33849l0;
    public final HashMap m0;
    public FrameLayout f33850n;
    public final ArrayList f33851n0;
    public final ArrayList f33852o0;
    public final HashSet f33853p0;
    public boolean f33854q0;
    public View f33855r;
    public boolean f33856r0;
    public RadialProgressView f33857s;
    public boolean f33858s0;
    public ArrayList f33859t0;
    public TLRPC.TL_channelAdminLogEventsFilter f33860u0;
    public pb v;
    public String f33861v0;
    public UndoView f33862w;
    public a0.h f33863w0;
    public hg.a0 f33864x;
    public final AnimationNotificationsLocker f33865x0;
    public org.telegram.ui.Components.pl0 f33866y;
    public final HashMap f33867y0;
    public HashMap f33868z0;

    public ac(TLRPC.Chat chat) {
        super(null);
        int dp;
        int dp2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f33844g0 = -1;
        this.f33845h0 = 0;
        this.f33846i0 = true;
        this.f33847j0 = false;
        this.f33848k0 = new a0.h();
        this.f33849l0 = new a0.h();
        this.m0 = new HashMap();
        this.f33851n0 = new ArrayList();
        this.f33852o0 = new ArrayList();
        this.f33853p0 = new HashSet();
        this.f33860u0 = null;
        this.f33861v0 = "";
        this.f33865x0 = new AnimationNotificationsLocker(R0);
        this.f33867y0 = new HashMap();
        this.B0 = new lb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new zb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        mi.e eVar = this.glassEngine;
        eVar.f15590a = new db(this);
        eVar.e = new ni.b(AndroidUtilities.dp(48.0f));
        ?? obj = new Object();
        this.f33834a = obj;
        bh.b bVar = new bh.b(obj);
        this.f33836b = bVar;
        bVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.d = fVar;
            gh.d dVar = new gh.d(obj);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f10156f = obj;
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(obj);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f10156f = obj;
                bh.b bVar2 = new bh.b(dVar2);
                this.f33838c = bVar2;
                bVar2.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                bVar2.f2747b = dp2;
                bVar2.f2748c = dp2;
                bVar2.f2751i = LiteMode.isEnabled(262144);
                this.e = 0;
            } else {
                bh.b bVar3 = new bh.b(dVar);
                this.f33838c = bVar3;
                bVar3.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                bVar3.f2747b = dp;
                bVar3.f2748c = dp;
                this.e = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            bh.b bVar4 = new bh.b(obj);
            this.f33838c = bVar4;
            bVar4.h = this.glassEngine;
        }
        this.f33842f = chat;
    }

    public static void A0(ac acVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = acVar.getMessagesController();
        TLRPC.Chat chat = acVar.f33842f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f18916id);
        org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(acVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, acVar, chatFull.f18917id, false, ChatObject.isChannel(chat));
        p70Var.f27910j0 = new mb(acVar);
        p70Var.show();
    }

    public static void K0(ac acVar) {
        if (acVar.v != null && !acVar.f33851n0.isEmpty()) {
            acVar.f33864x.h1(acVar.f33852o0.size() - 1, (-100000) - acVar.v.getPaddingTop());
        }
    }

    public static q11 S0(CharSequence charSequence) {
        org.telegram.ui.Components.br[] brVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.br brVar : (org.telegram.ui.Components.br[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.br.class)) {
                if (brVar != null) {
                    Drawable drawable = brVar.drawable;
                    if (drawable instanceof q11) {
                        return (q11) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void U(ac acVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = acVar.f33848k0;
        int i10 = 0;
        acVar.C0.N = false;
        acVar.W0(false);
        MessagesController.getInstance(acVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(acVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = acVar.f33851n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f18948id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                acVar.O = Math.min(acVar.O, tL_channelAdminLogEvent.f18948id);
                MessageObject messageObject2 = new MessageObject(acVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) acVar.m0, acVar.f33842f, acVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f18948id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                acVar.f33849l0.k(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (size != i12) {
                                messageObject = (MessageObject) arrayList.get(i12);
                                if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i12++;
                        } else {
                            messageObject = null;
                            break;
                        }
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList2.add(messageObject3);
            }
        }
        if (!arrayList2.isEmpty()) {
            MediaDataController.getInstance(acVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -acVar.f33842f.f18916id, 0, 0L, new cb(acVar, 1), acVar.getClassGuid(), null);
        }
        acVar.R0();
        acVar.f33856r0 = false;
        if (!z10) {
            acVar.f33854q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(acVar.f33850n, false, 0.3f, true);
        acVar.v.setEmptyView(acVar.H);
        wb wbVar = acVar.E;
        if (wbVar != null) {
            wbVar.l();
        }
        org.telegram.ui.ActionBar.u0 u0Var = acVar.N;
        if (u0Var != null) {
            if (acVar.f33852o0.isEmpty() && TextUtils.isEmpty(acVar.f33861v0)) {
                i10 = 8;
            }
            u0Var.setVisibility(i10);
        }
    }

    public static void V(ac acVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && acVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, acVar.getParentActivity(), acVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            acVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(acVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(acVar.getParentActivity(), acVar.getResourceProvider()), w7.z5.n(-1, 8));
                } else {
                    Activity parentActivity = acVar.getParentActivity();
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 == size - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, parentActivity, acVar.getResourceProvider(), z10, z11);
                    e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        e1Var.c(acVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7), acVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19822p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    e1Var.setOnClickListener(new bi.f7(acVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            ib ibVar = new ib(0, acVar.X.getContext(), acVar);
            ibVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            ibVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            jb jbVar = new jb(acVar, ibVar);
            acVar.F0 = jbVar;
            jbVar.e = true;
            jbVar.f20221c = 220;
            jbVar.setOutsideTouchable(true);
            acVar.F0.setClippingEnabled(true);
            acVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
            acVar.F0.setFocusable(true);
            ibVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            acVar.F0.setInputMethodMode(2);
            acVar.F0.setSoftInputMode(48);
            acVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f7)) - ibVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (acVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - ibVar.getMeasuredWidth()) {
                left = (acVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - ibVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                acVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = acVar.X.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + ibVar.getMeasuredHeight();
            int R = acVar.X.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y3 = (int) (acVar.v.getY() + view.getTop() + f10);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y3;
                } else {
                    i10 = y3;
                }
                if (i10 < acVar.v.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (acVar.v.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!acVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            ibVar.setMaxHeight(height - i10);
            acVar.F0.showAtLocation(acVar.v, 51, left, i10);
            acVar.F0.b();
        }
    }

    public static void W(org.telegram.ui.ac r21, int r22, java.util.ArrayList r23, java.lang.Integer r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ac.W(org.telegram.ui.ac, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(ac acVar, int i10) {
        int i11;
        bh.f fVar = acVar.d;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (w7.l6.a(i10, 4)) {
                mi.e eVar = acVar.glassEngine;
                ni.a aVar = eVar.f15604r;
                ni.a aVar2 = eVar.f15603q;
                if (aVar == aVar2) {
                    aVar.getClass();
                } else {
                    aVar.f16096b = 0;
                    int i12 = aVar2.f16096b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        RectF rectF = (RectF) aVar2.f16095a.get(i13);
                        aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    }
                }
                float y3 = acVar.v.getY();
                float width = acVar.X.getWidth();
                float y10 = acVar.v.getY() + acVar.v.getHeight();
                int i14 = 0;
                while (true) {
                    i11 = aVar.f16096b;
                    if (i14 >= i11) {
                        break;
                    }
                    RectF rectF2 = (RectF) aVar.f16095a.get(i14);
                    float f7 = rectF2.right;
                    if (f7 > 0.0f) {
                        float f10 = rectF2.bottom;
                        if (f10 > y3) {
                            float f11 = rectF2.left;
                            if (f11 < width) {
                                float f12 = rectF2.top;
                                if (f12 < y10) {
                                    if (f11 < 0.0f) {
                                        rectF2.left = 0.0f;
                                    }
                                    if (f12 < y3) {
                                        rectF2.top = y3;
                                    }
                                    if (f7 > width) {
                                        rectF2.right = width;
                                    }
                                    if (f10 > y10) {
                                        rectF2.bottom = y10;
                                    }
                                    i14++;
                                }
                            }
                        }
                    }
                    aVar.c(i14);
                }
                ArrayList arrayList = fVar.f2781i;
                fVar.f2782j = i11;
                while (fVar.f2782j > arrayList.size()) {
                    arrayList.add(new bh.e(fVar));
                }
                for (int i15 = 0; i15 < fVar.f2782j; i15++) {
                    bh.e.a((bh.e) arrayList.get(i15), aVar.b(i15));
                }
            }
            xb xbVar = acVar.X;
            Objects.requireNonNull(xbVar);
            fVar.e(new ab(xbVar, 0), acVar.X.getWidth(), acVar.X.getHeight());
        }
    }

    public static void Y(ac acVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = acVar.f33848k0;
        acVar.f33858s0 = false;
        acVar.C0.N = false;
        acVar.W0(false);
        MessagesController.getInstance(acVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(acVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f18948id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                acVar.O = Math.min(acVar.O, tL_channelAdminLogEvent2.f18948id);
                MessageObject messageObject = new MessageObject(acVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, acVar.f33842f, acVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f18948id))) {
                    acVar.f33851n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f18948id);
                    z10 = true;
                }
            }
        }
        if (acVar.E != null && z10) {
            acVar.R0();
            acVar.E.l();
        }
    }

    public static void Z(ac acVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = acVar.f33842f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            acVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            acVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            acVar.f33859t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = acVar.getMessagesController().getChatFull(chat.f18916id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = acVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = acVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = acVar.getMessagesController().telegramAntispamUserId;
                if (acVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f19057id.add(tL_inputUser);
                    ConnectionsManager.getInstance(acVar.currentAccount).sendRequest(tL_users_getUsers, new bb(acVar, 1));
                }
                acVar.f33859t0.add(0, channelParticipant);
            }
            Dialog dialog = acVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).T(acVar.f33859t0);
            }
        }
    }

    public static void Z0(MessageObject messageObject, int i10) {
        if (messageObject == null) {
            return;
        }
        if (i10 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = messageObject.messageOwner.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            messageObject.messageOwner.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i10, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public static CharSequence a1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.gms.internal.play_billing.k3.s(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.x.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.x.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static void p0(org.telegram.ui.ac r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ac.p0(org.telegram.ui.ac, android.os.Bundle, long):void");
    }

    public static void v0(ac acVar, MessageObject messageObject) {
        if (acVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(acVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            a2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            a2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        acVar.showDialog(a2Var);
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f33852o0;
            messageObject = null;
            if (i12 < arrayList2.size()) {
                messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2 != null && messageObject2.contentType == 1 && messageObject2.actionDeleteGroupEventId == j10) {
                    break;
                }
                i12++;
            } else {
                messageObject2 = null;
                break;
            }
        }
        if (messageObject2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f33842f.f18916id;
            tL_message.f18937id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        messageObject2.contentType = 1;
        if (z11 && arrayList.size() > 1) {
            messageObject2.actionDeleteGroupEventId = j10;
        } else {
            messageObject2.actionDeleteGroupEventId = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new k2.f(2)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                ac acVar = ac.this;
                acVar.getClass();
                if (l4.longValue() < 0) {
                    TLRPC.Chat chat = acVar.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(acVar.getMessagesController().getUser(l4));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new fb(0)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            q11 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new q11(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.r6 r6Var = S0.f39045a;
                r6Var.x(bold);
                r6Var.w(AndroidUtilities.dp(10.0f));
                if (S0.f39047c != -1) {
                    S0.f39047c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.r6 r6Var2 = S0.f39045a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                r6Var2.t(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) i2.d.h(1, arrayList);
        }
        if (messageObject != null) {
            long j12 = messageObject.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject.eventId;
                int i13 = Q0;
                Q0 = i13 + 1;
                hVar.k(Integer.valueOf(i13), j13);
            }
            messageObject2.stableId = ((Integer) hVar.f(messageObject.eventId)).intValue();
        }
        return messageObject2;
    }

    public final void O0(boolean z10) {
        int abs;
        hg.a0 a0Var = this.f33864x;
        if (a0Var != null && !this.f33846i0) {
            int L0 = a0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f33864x.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f33856r0 && !this.f33854q0) {
                    U0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ac.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f33840d0 == null) {
            l0 l0Var = new l0(this, getParentActivity(), 4);
            this.f33840d0 = l0Var;
            l0Var.setOutlineProvider(new bi.a2(8));
            this.f33840d0.setClipToOutline(true);
            this.f33840d0.setWillNotDraw(false);
            this.f33840d0.setVisibility(4);
            n4 n4Var = new n4(getParentActivity());
            this.f33841e0 = n4Var;
            n4Var.setBackgroundColor(0);
            if (z10) {
                this.f33840d0.addView(this.f33841e0, w7.z5.d(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f33843f0 = textureView;
            textureView.setOpaque(false);
            this.f33841e0.addView(this.f33843f0, w7.z5.d(-1.0f, -1));
        }
        if (this.f33840d0.getParent() == null) {
            xb xbVar = this.X;
            l0 l0Var2 = this.f33840d0;
            int i10 = AndroidUtilities.roundMessageSize;
            xbVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f33840d0.setVisibility(4);
        this.f33841e0.setDrawingReady(false);
        return this.f33843f0;
    }

    public final void R0() {
        long j10;
        MessageObject messageObject;
        long j11;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList4 = this.f33851n0;
            if (i12 < arrayList4.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                if (messageObject2 != null && (tL_channelAdminLogEvent2 = messageObject2.currentEvent) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j10 = 0;
                }
                if (messageObject2.stableId <= 0) {
                    int i13 = Q0;
                    Q0 = i13 + 1;
                    messageObject2.stableId = i13;
                }
                int i14 = i12 + 1;
                if (i14 < arrayList4.size()) {
                    messageObject = (MessageObject) arrayList4.get(i14);
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (tL_channelAdminLogEvent = messageObject.currentEvent) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j11 = tL_channelAdminLogEvent.user_id;
                } else {
                    j11 = 0;
                }
                if (j10 != 0) {
                    arrayList3.add(messageObject2);
                } else {
                    arrayList2.add(messageObject2);
                }
                if (j10 != j11 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = messageObject2.messageOwner.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((MessageObject) arrayList3.get(size2)).contentType == 1; size2--) {
                        arrayList5.add((MessageObject) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        MessageObject messageObject3 = (MessageObject) i2.d.h(1, arrayList3);
                        if (TextUtils.isEmpty(this.f33861v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f33853p0;
                        if (!hashSet.contains(valueOf) && z11) {
                            Z0(messageObject3, arrayList3.size() - 1);
                            arrayList2.add(messageObject3);
                        } else {
                            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                Z0((MessageObject) arrayList3.get(i15), 0);
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z10 != z12) {
                            messageObject3.forceUpdate = true;
                            wb wbVar = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            wbVar.m(i10 + size);
                            wb wbVar2 = this.E;
                            if (z10) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            wbVar2.m(size + i11 + 1);
                        }
                        long j12 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j12, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) i2.d.h(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i12 = i14;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f33852o0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void T0(boolean z10) {
        if (this.M.getTag() != null && !this.P) {
            if (!this.S || this.Q) {
                this.M.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.R = animatorSet;
                    animatorSet.setDuration(150L);
                    this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
                    this.R.addListener(new u0(this, 18));
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

    public final void U0(boolean z10) {
        wb wbVar;
        if (!this.f33856r0) {
            ArrayList arrayList = this.f33851n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f33850n;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.v.setEmptyView(null);
                }
                this.f33848k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f33856r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f33842f);
            tL_channels_getAdminLog.f18951q = this.f33861v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f33860u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f33863w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f33863w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f33863w0.n(i10)));
                }
            }
            b1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new bb(this, 3));
            if (z10 && (wbVar = this.E) != null) {
                wbVar.l();
            }
        }
    }

    public final void V0() {
        if (this.f33858s0) {
            return;
        }
        this.f33858s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f33842f);
        tL_channels_getAdminLog.f18951q = this.f33861v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f33860u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f33863w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f33863w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f33863w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new bb(this, 0));
    }

    public final void W0(boolean z10) {
        int i10;
        long j10;
        pb pbVar = this.v;
        if (pbVar != null && this.f33864x != null && pbVar.getChildCount() > 0) {
            if (z10) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.u1 u1Var = null;
            int i11 = -1;
            for (int i12 = 0; i12 < this.v.getChildCount(); i12++) {
                View childAt = this.v.getChildAt(i12);
                this.v.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i10) {
                        }
                        i10 = childAt.getTop();
                        u1Var = childAt;
                        i11 = R;
                    } else {
                        if (top <= i10) {
                        }
                        i10 = childAt.getTop();
                        u1Var = childAt;
                        i11 = R;
                    }
                }
            }
            if (u1Var != null) {
                if (u1Var instanceof org.telegram.ui.Cells.u1) {
                    j10 = u1Var.getMessageObject().eventId;
                } else if (u1Var instanceof org.telegram.ui.Cells.w0) {
                    j10 = u1Var.getMessageObject().eventId;
                } else {
                    j10 = 0;
                }
                this.M0 = j10;
                this.N0 = i11;
                this.O0 = (this.v.getMeasuredHeight() - u1Var.getBottom()) - this.v.getPaddingBottom();
            }
        }
    }

    public final int X0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (u1Var = this.J0) != null && (textLayoutBlocks = u1Var.f21879c4) != null) {
                i10 = (int) u1Var.f22074q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.u1 u1Var2 = this.J0;
                if (u1Var2 != null && u1Var2.f22116t1) {
                    i10 = u1Var2.f22016m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.u1 u1Var3 = this.J0;
            if (u1Var3 != null) {
                u1Var3.f22189xe = 0;
                u1Var3.f22203ye = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.H0)) >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                    String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                    int i12 = textLayoutBlock.charactersOffset;
                    if (findQuoteStart > i12) {
                        if (findQuoteStart - i12 > charSequence3.length() - 1) {
                            lineTop = i10 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height));
                        } else {
                            lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i10 + textLayoutBlock.padTop;
                        }
                        float f10 = AndroidUtilities.displaySize.y;
                        float f11 = 0.5f;
                        if (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                            f7 = 0.7f;
                        } else {
                            f7 = 0.5f;
                        }
                        if (lineTop > f10 * f7) {
                            float f12 = AndroidUtilities.displaySize.y;
                            if (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                                f11 = 0.7f;
                            }
                            return (int) (lineTop - (f12 * f11));
                        }
                    } else {
                        i11++;
                    }
                }
            }
        } else {
            org.telegram.ui.Cells.u1 u1Var4 = this.J0;
            if (u1Var4 != null) {
                u1Var4.f22189xe = 0;
                u1Var4.f22203ye = null;
            }
        }
        return 0;
    }

    public final void Y0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ac.Y0(org.telegram.messenger.MessageObject):void");
    }

    public final void b1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f33861v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f33863w0 == null && this.f33860u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f33842f.megagroup) {
                this.L.setText(a1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(a1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        } else {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        }
    }

    public final void c1() {
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject messageObject;
        int i10;
        pb pbVar = this.v;
        if (pbVar == null) {
            return;
        }
        int childCount = pbVar.getChildCount();
        int measuredHeight = this.v.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.u1 u1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.v.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.v1) {
                org.telegram.ui.Cells.v1 v1Var = (org.telegram.ui.Cells.v1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                v1Var.f22265f = y3;
                v1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                int top = u1Var2.getTop();
                u1Var2.getBottom();
                if (top >= 0) {
                    i10 = 0;
                } else {
                    i10 = -top;
                }
                int measuredHeight2 = u1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                u1Var2.b4(i10, measuredHeight2 - i10, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.v.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = u1Var2.getMessageObject();
                if (this.f33840d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = u1Var2.getPhotoImage();
                    this.f33840d0.setTranslationX(photoImage.getImageX());
                    this.f33840d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f33840d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) childAt;
                w0Var2.a0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (w0Var2.K()) {
                    w0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.v.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.u1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        u1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                qb qbVar = this.C0;
                if ((qbVar == null || (!qbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i12) {
                        i12 = bottom;
                        view = childAt;
                    }
                }
            }
        }
        l0 l0Var = this.f33840d0;
        if (l0Var != null) {
            if (!z11) {
                l0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            } else {
                MediaController.getInstance().setCurrentVideoVisible(true);
            }
        }
        if (u1Var != null) {
            if (u1Var instanceof org.telegram.ui.Cells.u1) {
                messageObject = u1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.w0) u1Var).getMessageObject();
            }
            this.M.X(messageObject.messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.u1) && !(view2 instanceof org.telegram.ui.Cells.w0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view != null) {
            if (view.getTop() <= this.v.getPaddingTop() && !this.Q) {
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
                T0(true ^ this.Q);
            }
            int bottom2 = view.getBottom() - this.v.getPaddingTop();
            if (bottom2 > this.M.getMeasuredHeight() && bottom2 < this.M.getMeasuredHeight() * 2) {
                this.M.setTranslationY(((-w0Var.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.M.setTranslationY(0.0f);
            return;
        }
        T0(true);
        this.M.setTranslationY(0.0f);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.u1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.g6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 0));
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(context, null, false, null);
        this.I = roVar;
        ql qlVar = roVar.h;
        if (qlVar != null) {
            qlVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        ql qlVar2 = roVar.f28607r;
        if (qlVar2 != null) {
            qlVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        roVar.f28600k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, w7.z5.a(-1.0f, 54.0f, 0.0f, 52.0f, 0.0f, -2, 51));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.ro roVar2 = this.I;
        TLRPC.Chat chat = this.f33842f;
        roVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        ob obVar = new ob(this, context);
        this.fragmentView = obVar;
        this.X = obVar;
        obVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.g6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        eh.e o10 = fh.b.o(this.resourceProvider);
        bh.b bVar = this.f33838c;
        kVar.M(bVar, o10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.z5.e(-1, -2, 17));
        this.H.setOnTouchListener(new ci.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.t5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.f19633f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.z5.t(54, 54, 17, 16, 20, 16, -4));
        bi.f4 f4Var = new bi.f4(context, 9);
        this.L = f4Var;
        f4Var.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        bi.f4 f4Var2 = this.L;
        int i11 = org.telegram.ui.ActionBar.g6.f19695ic;
        f4Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, w7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.z5.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -2, 17));
        pb pbVar = new pb(this, context);
        this.v = pbVar;
        pbVar.setOnItemClickListener(new g(this, 9));
        this.v.setTag(1);
        this.v.setVerticalScrollBarEnabled(true);
        pb pbVar2 = this.v;
        wb wbVar = new wb(this, context);
        this.E = wbVar;
        pbVar2.setAdapter(wbVar);
        this.v.setClipToPadding(false);
        pb pbVar3 = this.v;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.e;
        pbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        pb pbVar4 = this.v;
        qb qbVar = new qb(this, this.v, this.resourceProvider);
        this.C0 = qbVar;
        pbVar4.setItemAnimator(qbVar);
        this.C0.Q = true;
        this.v.setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(this);
        this.f33864x = a0Var;
        a0Var.j1(1);
        this.f33864x.l1(true);
        this.v.setLayoutManager(this.f33864x);
        org.telegram.ui.Components.pl0 pl0Var = new org.telegram.ui.Components.pl0(this.v, this.f33864x);
        this.f33866y = pl0Var;
        pl0Var.h = new db(this);
        pl0Var.f28055i = this.L0;
        this.X.addView(this.v, w7.z5.d(-1.0f, -1));
        this.v.setOnScrollListener(new k3(this));
        this.glassEngine.a(this.v);
        int i14 = this.f33844g0;
        if (i14 != -1) {
            this.f33864x.h1(i14, this.f33845h0);
            this.f33844g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(this.f33836b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33850n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f33850n, w7.z5.e(-1, -1, 51));
        View view2 = new View(context);
        this.f33855r = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.t5(this.f33855r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f19633f2));
        this.f33850n.addView(this.f33855r, w7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f33857s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f33857s.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.f33850n.addView(this.f33857s, w7.z5.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.z5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -2, 49));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        kh.e eVar = new kh.e(context, bVar, fh.b.b(c6Var), c6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        kh.e eVar2 = this.G;
        dh.d c10 = eVar2.f14272n.c(eVar2, null, false);
        c10.o(eVar2.f14273r);
        c10.q(AndroidUtilities.dp(22.0f));
        c10.p(AndroidUtilities.dp(6.0f));
        eVar2.f14274s = c10;
        this.X.addView(this.G, w7.z5.a(56.0f, 54.0f, 0.0f, 0.0f, 3.0f, -1, 80));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ac f36126b;

            {
                this.f36126b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ac acVar = this.f36126b;
                        if (acVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(acVar, acVar.f33860u0, acVar.f33863w0, acVar.f33842f.megagroup);
                            g0Var.T(acVar.f33859t0);
                            g0Var.f24855g0 = new db(acVar);
                            acVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        ac acVar2 = this.f36126b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(acVar2.getParentActivity());
                        if (acVar2.f33842f.megagroup) {
                            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                        a2Var.R = string;
                        acVar2.showDialog(a2Var);
                        return;
                    default:
                        ac acVar3 = this.f36126b;
                        if (acVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(acVar3.N.getSearchField());
                            acVar3.showDialog(org.telegram.ui.Components.g5.o(acVar3.getParentActivity(), new za(acVar3, 0), null).f20538a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.z5.e(-2, -2, 17));
        this.G.f14271f.add(this.F);
        this.G.d(false);
        this.G.f14269b[4] = new View.OnClickListener(this) {
            public final ac f36126b;

            {
                this.f36126b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ac acVar = this.f36126b;
                        if (acVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(acVar, acVar.f33860u0, acVar.f33863w0, acVar.f33842f.megagroup);
                            g0Var.T(acVar.f33859t0);
                            g0Var.f24855g0 = new db(acVar);
                            acVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        ac acVar2 = this.f36126b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(acVar2.getParentActivity());
                        if (acVar2.f33842f.megagroup) {
                            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                        a2Var.R = string;
                        acVar2.showDialog(a2Var);
                        return;
                    default:
                        ac acVar3 = this.f36126b;
                        if (acVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(acVar3.N.getSearchField());
                            acVar3.showDialog(org.telegram.ui.Components.g5.o(acVar3.getParentActivity(), new za(acVar3, 0), null).f20538a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33835a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f33835a0.setVisibility(4);
        this.f33835a0.setFocusable(true);
        this.f33835a0.setFocusableInTouchMode(true);
        this.f33835a0.setClickable(true);
        this.f33835a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f33835a0, w7.z5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f33837b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f33837b0.setImageResource(R.drawable.msg_calendar);
        this.f33837b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19978xe, false), PorterDuff.Mode.MULTIPLY));
        this.f33835a0.addView(this.f33837b0, w7.z5.e(48, 48, 53));
        this.f33837b0.setOnClickListener(new View.OnClickListener(this) {
            public final ac f36126b;

            {
                this.f36126b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ac acVar = this.f36126b;
                        if (acVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(acVar, acVar.f33860u0, acVar.f33863w0, acVar.f33842f.megagroup);
                            g0Var.T(acVar.f33859t0);
                            g0Var.f24855g0 = new db(acVar);
                            acVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        ac acVar2 = this.f36126b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(acVar2.getParentActivity());
                        if (acVar2.f33842f.megagroup) {
                            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                        a2Var.R = string;
                        acVar2.showDialog(a2Var);
                        return;
                    default:
                        ac acVar3 = this.f36126b;
                        if (acVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(acVar3.N.getSearchField());
                            acVar3.showDialog(org.telegram.ui.Components.g5.o(acVar3.getParentActivity(), new za(acVar3, 0), null).f20538a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f33839c0 = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19995ye, false));
        this.f33839c0.setTextSize(15);
        this.f33839c0.setTypeface(AndroidUtilities.bold());
        this.f33835a0.addView(this.f33839c0, w7.z5.a(-2.0f, 108.0f, 0.0f, 0.0f, 0.0f, -1, 19));
        this.E.D(true);
        if (this.f33856r0 && this.f33851n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33850n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33850n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        pb pbVar5 = this.v;
        pbVar5.W1 = true;
        pbVar5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.f33862w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.f33862w, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        b1();
        return this.fragmentView;
    }

    public final void d1() {
        boolean z10;
        pb pbVar = this.v;
        if (pbVar != null) {
            int childCount = pbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.v.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.t()) {
                            u1Var.setDrawSelectionBackground(false);
                            u1Var.J3(false, true);
                            u1Var.L3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            cb cbVar = this.I0;
                            if (cbVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(cbVar);
                            }
                            cb cbVar2 = new cb(this, 0);
                            this.I0 = cbVar2;
                            AndroidUtilities.runOnUIThread(cbVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f33861v0)) {
                            u1Var.S3(this.f33861v0);
                        } else {
                            u1Var.S3(null);
                        }
                        if (this.v.getScrollState() == 0) {
                            z11 = false;
                        }
                        u1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    w0Var.setMessageObject(w0Var.getMessageObject());
                    if (this.v.getScrollState() == 0) {
                        z11 = false;
                    }
                    w0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.u1 u1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.u1 u1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i10 == NotificationCenter.emojiLoaded) {
            pb pbVar = this.v;
            if (pbVar != null) {
                pbVar.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f33841e0, this.f33840d0, true);
                int childCount = this.v.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.v.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) childAt;
                            MessageObject messageObject4 = u1Var4.getMessageObject();
                            if (this.f33840d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = u1Var4.getPhotoImage();
                                this.f33840d0.setTranslationX(photoImage.getImageX());
                                this.f33840d0.setTranslationY(photoImage.getImageY() + u1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f33840d0.invalidate();
                                z10 = true;
                                break;
                            }
                        }
                        i12++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (this.f33840d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f33840d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.V || PipRoundVideoView.F != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            pb pbVar2 = this.v;
            if (pbVar2 != null) {
                int childCount2 = pbVar2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.v.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject3 = (u1Var3 = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null) {
                        if (!messageObject3.isVoice() && !messageObject3.isMusic()) {
                            if (messageObject3.isRoundVideo()) {
                                u1Var3.e1(null, false);
                                if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                    messageObject3.resetPlayingProgress();
                                    u1Var3.invalidate();
                                }
                            }
                        } else {
                            u1Var3.m4(false, true, false);
                        }
                    }
                }
            }
        } else if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                pb pbVar3 = this.v;
                if (pbVar3 != null) {
                    int childCount3 = pbVar3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.v.getChildAt(i14);
                        if ((childAt3 instanceof org.telegram.ui.Cells.u1) && (messageObject2 = (u1Var2 = (org.telegram.ui.Cells.u1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                u1Var2.q4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.X.V(org.telegram.ui.ActionBar.g6.s0());
                this.f33855r.invalidate();
                bi.f4 f4Var = this.L;
                if (f4Var != null) {
                    f4Var.invalidate();
                }
                this.v.f1();
            }
        } else {
            pb pbVar4 = this.v;
            if (pbVar4 != null) {
                int childCount4 = pbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.v.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                u1Var.e1(null, true);
                            }
                        } else {
                            u1Var.m4(false, true, false);
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

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19880s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f19935v8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f19899t8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.g6.f19578c2, org.telegram.ui.ActionBar.g6.f19597d2}, org.telegram.ui.ActionBar.g6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.g6.f19852r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19692i8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19710j8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19730k8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19747l8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19766m8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19786n8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19806o8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19761m3, org.telegram.ui.ActionBar.g6.f19836q3}, null, org.telegram.ui.ActionBar.g6.f19862ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19781n3, org.telegram.ui.ActionBar.g6.f19855r3}, null, org.telegram.ui.ActionBar.g6.f19606dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.g6.f19761m3.k();
        int i13 = org.telegram.ui.ActionBar.g6.f19901ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.g6.f19836q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.g6.f19801o3.k();
        int i14 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.g6.f19875s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19819p3, org.telegram.ui.ActionBar.g6.f19894t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.f19874s2;
        int i15 = org.telegram.ui.ActionBar.g6.f19695ic;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.g6.f19874s2, null, null, org.telegram.ui.ActionBar.g6.f19714jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19950w4, org.telegram.ui.ActionBar.g6.f19837q4, org.telegram.ui.ActionBar.g6.f19968x4, org.telegram.ui.ActionBar.g6.f19931v4, org.telegram.ui.ActionBar.g6.f19914u4, org.telegram.ui.ActionBar.g6.C4}, null, org.telegram.ui.ActionBar.g6.f19734kc));
        int i16 = org.telegram.ui.ActionBar.g6.f19751lc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19770mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19623ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.f19660gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f20002z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f19884sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O3, org.telegram.ui.ActionBar.g6.S3, org.telegram.ui.ActionBar.g6.W3}, null, org.telegram.ui.ActionBar.g6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P3, org.telegram.ui.ActionBar.g6.T3, org.telegram.ui.ActionBar.g6.X3}, null, org.telegram.ui.ActionBar.g6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.M3, org.telegram.ui.ActionBar.g6.Q3, org.telegram.ui.ActionBar.g6.U3}, null, org.telegram.ui.ActionBar.g6.f19976xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.N3, org.telegram.ui.ActionBar.g6.R3, org.telegram.ui.ActionBar.g6.V3}, null, org.telegram.ui.ActionBar.g6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19540a4, org.telegram.ui.ActionBar.g6.f19560b4, org.telegram.ui.ActionBar.g6.Z3}, null, org.telegram.ui.ActionBar.g6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19616e4}, null, org.telegram.ui.ActionBar.g6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19635f4}, null, org.telegram.ui.ActionBar.g6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19580c4}, null, org.telegram.ui.ActionBar.g6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19599d4}, null, org.telegram.ui.ActionBar.g6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19652g4}, null, org.telegram.ui.ActionBar.g6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.f19688i4};
        int i17 = org.telegram.ui.ActionBar.g6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.g6.f19671h4, org.telegram.ui.ActionBar.g6.B4, org.telegram.ui.ActionBar.g6.D4};
        int i18 = org.telegram.ui.ActionBar.g6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.g6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.g6.J4, null, org.telegram.ui.ActionBar.g6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.g6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.g6.H4, null, org.telegram.ui.ActionBar.g6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O4}, null, org.telegram.ui.ActionBar.g6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P4}, null, org.telegram.ui.ActionBar.g6.f19859r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Q4}, null, org.telegram.ui.ActionBar.g6.f19842qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.g6.f19558b2, null, null, org.telegram.ui.ActionBar.g6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19706j4}, null, org.telegram.ui.ActionBar.g6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.g6.J2, null, null, org.telegram.ui.ActionBar.g6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.g6.K2, null, null, org.telegram.ui.ActionBar.g6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.g6.T1, null, null, org.telegram.ui.ActionBar.g6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.g6.Q2, null, null, org.telegram.ui.ActionBar.g6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Rc));
        int i19 = org.telegram.ui.ActionBar.g6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.f19547ab;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19567bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19587cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19622eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19549ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19641fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19569bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19589cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19659gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19677hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19624ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19694ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19642fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19713jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19678hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19696id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19843qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19715jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19735kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19791nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19883sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19809od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19789nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19827pd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19750lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19865rd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19902tb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19920ub));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19904td));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19938vb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19922ud));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19956wb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19958wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19993yb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19977xd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19940vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f20010zb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19975xb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19994yd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f20011zd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.g6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.g6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19697ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19921uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19716je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19939vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.g6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.f19866re));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.f19885se));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.g6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.g6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.g6.f19846qe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.g6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33857s, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.g6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.g6.De));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33855r, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33862w, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i21 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33862w, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33862w, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33862w, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33862w, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33862w, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33862w, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f33862w;
        if (undoView != null) {
            undoView.e(0, true);
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
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        U0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f33842f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new bb(this, 4)), this.classGuid);
        setBulletinDelegate(new di.z8(6));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.f33865x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        xb xbVar = this.X;
        if (xbVar != null) {
            org.telegram.ui.Components.o91 o91Var = xbVar.v;
            if (o91Var != null) {
                o91Var.c(false);
            }
            xbVar.F = true;
        }
        UndoView undoView = this.f33862w;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f33846i0 = true;
        this.f33847j0 = true;
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f4122a) {
            c2.b m10 = c2.b.m();
            if (m10.f4122a) {
                int i10 = g5.F;
                ((w4) m10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f33843f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        xb xbVar = this.X;
        if (xbVar != null) {
            org.telegram.ui.Components.o91 o91Var = xbVar.v;
            if (o91Var != null) {
                o91Var.c(true);
            }
            xbVar.F = false;
        }
        this.f33846i0 = false;
        O0(false);
        if (this.f33847j0) {
            this.f33847j0 = false;
            wb wbVar = this.E;
            if (wbVar != null) {
                wbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f33865x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f33865x0.lock();
        }
    }
}
