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
import java.util.Iterator;
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
public final class ob extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static int T0 = 10;
    public static final int[] U0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public db A;
    public boolean A0;
    public UndoView B;
    public final za B0;
    public k C;
    public eb C0;
    public c2.z D;
    public final ArrayList D0;
    public kb E;
    public final a0.h E0;
    public TextView F;
    public xa F0;
    public ug.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.xn I;
    public ra I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.s1 J0;
    public ImageView K;
    public int K0;
    public eg.r L;
    public final nb L0;
    public org.telegram.ui.Cells.v0 M;
    public long M0;
    public org.telegram.ui.ActionBar.w0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public jf.e0 P0;
    public boolean Q;
    public final ArrayList Q0;
    public AnimatorSet R;
    public final ArrayList R0;
    public boolean S;
    public final RectF S0;
    public final int[] T;
    public boolean U;
    public boolean V;
    public ug.f W;
    public lb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final qg.e f41042a;
    public FrameLayout f41043a0;
    public final lg.a f41044b;
    public ImageView f41045b0;
    public final qg.d f41046c;
    public org.telegram.ui.ActionBar.h5 f41047c0;
    public final qg.d d;
    public n0 f41048d0;
    public final lg.a f41049e;
    public e5.c f41050e0;
    public final lg.a f41051f;
    public TextureView f41052f0;
    public int f41053g0;
    public final zd.b h;
    public int f41054h0;
    public boolean f41055i0;
    public boolean f41056j0;
    public final a0.h f41057k0;
    public final a0.h f41058l0;
    public final HashMap m0;
    public final lg.e f41059n;
    public final ArrayList f41060n0;
    public final ArrayList f41061o0;
    public final HashSet f41062p0;
    public boolean f41063q0;
    public final int f41064r;
    public boolean f41065r0;
    public final TLRPC.Chat f41066s;
    public boolean f41067s0;
    public ArrayList f41068t0;
    public TLRPC.TL_channelAdminLogEventsFilter f41069u0;
    public final ArrayList v;
    public String f41070v0;
    public FrameLayout f41071w;
    public a0.h f41072w0;
    public View f41073x;
    public final AnimationNotificationsLocker f41074x0;
    public RadialProgressView f41075y;
    public final HashMap f41076y0;
    public HashMap f41077z0;

    public ob(TLRPC.Chat chat) {
        super(null);
        zd.b bVar = new zd.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.T = new int[]{2};
        this.f41053g0 = -1;
        this.f41054h0 = 0;
        this.f41055i0 = true;
        this.f41056j0 = false;
        this.f41057k0 = new a0.h();
        this.f41058l0 = new a0.h();
        this.m0 = new HashMap();
        this.f41060n0 = new ArrayList();
        this.f41061o0 = new ArrayList();
        this.f41062p0 = new HashSet();
        this.f41069u0 = null;
        this.f41070v0 = "";
        this.f41074x0 = new AnimationNotificationsLocker(U0);
        this.f41076y0 = new HashMap();
        this.B0 = new za(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new nb(this);
        this.N0 = -1;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new RectF();
        ?? obj = new Object();
        this.f41042a = obj;
        lg.a aVar = new lg.a(obj);
        this.f41044b = aVar;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            lg.e eVar = new lg.e(false);
            this.f41059n = eVar;
            qg.d dVar = new qg.d(obj);
            this.d = dVar;
            dVar.v = new ra(this, 3);
            dVar.d = eVar;
            dVar.f46671e = -3;
            dVar.f46672f = obj;
            lg.a aVar2 = new lg.a(dVar);
            this.f41051f = aVar2;
            aVar2.f15225f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                qg.d dVar2 = new qg.d(obj);
                this.f41046c = dVar2;
                dVar2.v = new ra(this, 3);
                dVar2.d = eVar;
                dVar2.f46671e = -2;
                dVar2.f46672f = obj;
                lg.a aVar3 = new lg.a(dVar2);
                this.f41049e = aVar3;
                aVar3.f15225f = LiteMode.isEnabled(262144);
                this.f41064r = 0;
            } else {
                this.f41046c = null;
                this.f41049e = aVar2;
                this.f41064r = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.f41059n = null;
            this.f41064r = 0;
            this.f41046c = null;
            this.d = null;
            this.f41049e = new lg.a(obj);
            this.f41051f = new lg.a(obj);
        }
        aVar.f15223c = bVar;
        this.f41049e.f15223c = bVar;
        this.f41051f.f15223c = bVar;
        this.f41066s = chat;
    }

    public static void A0(ob obVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = obVar.getMessagesController();
        TLRPC.Chat chat = obVar.f41066s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f22392id);
        org.telegram.ui.Components.n60 n60Var = new org.telegram.ui.Components.n60(obVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, obVar, chatFull.f22393id, false, ChatObject.isChannel(chat));
        n60Var.f30893f0 = new ab(obVar);
        n60Var.show();
    }

    public static org.telegram.ui.ActionBar.l G0(ob obVar) {
        return obVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l H0(ob obVar) {
        return obVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l I0(ob obVar) {
        return obVar.actionBar;
    }

    public static void K0(ob obVar) {
        if (obVar.A != null && !obVar.f41060n0.isEmpty()) {
            obVar.C.h1(obVar.f41061o0.size() - 1, (-100000) - obVar.A.getPaddingTop());
        }
    }

    public static int L0(ob obVar) {
        return obVar.currentAccount;
    }

    public static h01 S0(CharSequence charSequence) {
        org.telegram.ui.Components.iq[] iqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.iq iqVar : (org.telegram.ui.Components.iq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.iq.class)) {
                if (iqVar != null) {
                    Drawable drawable = iqVar.drawable;
                    if (drawable instanceof h01) {
                        return (h01) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void U(ob obVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = obVar.f41057k0;
        int i10 = 0;
        obVar.C0.N = false;
        obVar.X0(false);
        MessagesController.getInstance(obVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(obVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = obVar.f41060n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f22424id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                obVar.O = Math.min(obVar.O, tL_channelAdminLogEvent.f22424id);
                MessageObject messageObject2 = new MessageObject(obVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) obVar.m0, obVar.f41066s, obVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f22424id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                obVar.f41058l0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(obVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -obVar.f41066s.f22392id, 0, 0L, new ra(obVar, 1), obVar.getClassGuid(), null);
        }
        obVar.R0();
        obVar.f41065r0 = false;
        if (!z10) {
            obVar.f41063q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(obVar.f41071w, false, 0.3f, true);
        obVar.A.setEmptyView(obVar.H);
        kb kbVar = obVar.E;
        if (kbVar != null) {
            kbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = obVar.N;
        if (w0Var != null) {
            if (obVar.f41061o0.isEmpty() && TextUtils.isEmpty(obVar.f41070v0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(ob obVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f9, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && obVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, obVar.getParentActivity(), obVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            obVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(obVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(obVar.getParentActivity(), obVar.getResourceProvider()), i7.f6.n(-1, 8));
                } else {
                    Activity parentActivity = obVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, parentActivity, obVar.getResourceProvider(), z10, z11);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        g1Var.c(obVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7), obVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    g1Var.setOnClickListener(new lh.n5(obVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            wa waVar = new wa(0, obVar.X.getContext(), obVar);
            waVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            waVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            xa xaVar = new xa(obVar, waVar);
            obVar.F0 = xaVar;
            xaVar.f23712e = true;
            xaVar.f23711c = 220;
            xaVar.setOutsideTouchable(true);
            obVar.F0.setClippingEnabled(true);
            obVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
            obVar.F0.setFocusable(true);
            waVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            obVar.F0.setInputMethodMode(2);
            obVar.F0.setSoftInputMode(48);
            obVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f9)) - waVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (obVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - waVar.getMeasuredWidth()) {
                left = (obVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - waVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                obVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = obVar.X.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + waVar.getMeasuredHeight();
            int R = obVar.X.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y8 = (int) (obVar.A.getY() + view.getTop() + f10);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y8;
                } else {
                    i10 = y8;
                }
                if (i10 < obVar.A.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (obVar.A.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!obVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            waVar.setMaxHeight(height - i10);
            obVar.F0.showAtLocation(obVar.A, 51, left, i10);
            obVar.F0.b();
        }
    }

    public static void W(org.telegram.ui.ob r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob.W(org.telegram.ui.ob, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(ob obVar, int i10) {
        int i11;
        RectF rectF;
        qg.d dVar = obVar.f41046c;
        qg.d dVar2 = obVar.d;
        ArrayList arrayList = obVar.R0;
        lg.e eVar = obVar.f41059n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            if (i7.n8.a(i10, 2)) {
                ArrayList arrayList2 = obVar.Q0;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, obVar.X.getMeasuredWidth(), obVar.A.getY() + obVar.A.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.c(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.c(arrayList2, i11, AndroidUtilities.dp(8.0f));
                    }
                } else {
                    i11 = 0;
                }
                int a2 = jf.l0.a(arrayList2, i11, arrayList);
                int measuredWidth = obVar.X.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f9 = measuredWidth;
                    rectF2.left = i7.w.a(rectF2.left, 0.0f, f9);
                    rectF2.top = Math.max(obVar.A.getY(), rectF2.top);
                    rectF2.right = i7.w.a(rectF2.right, 0.0f, f9);
                    rectF2.bottom = Math.min(obVar.A.getY() + obVar.A.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            lb lbVar = obVar.X;
            Objects.requireNonNull(lbVar);
            if (eVar.e(new qa(lbVar, 0), obVar.X.getWidth(), obVar.X.getHeight())) {
                if (dVar != null) {
                    dVar.d();
                }
                if (dVar2 != null) {
                    dVar2.d();
                }
                org.telegram.ui.ActionBar.l lVar = obVar.actionBar;
                if (lVar != null) {
                    lVar.invalidate();
                }
                obVar.X.invalidate();
                Iterator it = obVar.h.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    public static void Y(ob obVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = obVar.f41057k0;
        obVar.f41067s0 = false;
        obVar.C0.N = false;
        obVar.X0(false);
        MessagesController.getInstance(obVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(obVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f22424id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                obVar.O = Math.min(obVar.O, tL_channelAdminLogEvent2.f22424id);
                MessageObject messageObject = new MessageObject(obVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, obVar.f41066s, obVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f22424id))) {
                    obVar.f41060n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f22424id);
                    z10 = true;
                }
            }
        }
        if (obVar.E != null && z10) {
            obVar.R0();
            obVar.E.l();
        }
    }

    public static void Z(ob obVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = obVar.f41066s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            obVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            obVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            obVar.f41068t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = obVar.getMessagesController().getChatFull(chat.f22392id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = obVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = obVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = obVar.getMessagesController().telegramAntispamUserId;
                if (obVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f22533id.add(tL_inputUser);
                    ConnectionsManager.getInstance(obVar.currentAccount).sendRequest(tL_users_getUsers, new ma(obVar, 2));
                }
                obVar.f41068t0.add(0, channelParticipant);
            }
            Dialog dialog = obVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.i0) {
                ((org.telegram.ui.Components.i0) dialog).S(obVar.f41068t0);
            }
        }
    }

    public static void a1(MessageObject messageObject, int i10) {
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

    public static CharSequence b1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.recaptcha.internal.a.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.z.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.z.f(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int l0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int m0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int n0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int o0(ob obVar) {
        return obVar.classGuid;
    }

    public static void p0(org.telegram.ui.ob r6, android.os.Bundle r7, long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob.p0(org.telegram.ui.ob, android.os.Bundle, long):void");
    }

    public static int q0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int r0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int s0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int t0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int u0(ob obVar) {
        return obVar.currentAccount;
    }

    public static void v0(ob obVar, MessageObject messageObject) {
        if (obVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.P = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.P = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        obVar.showDialog(c2Var);
    }

    public static int w0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int x0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int y0(ob obVar) {
        return obVar.currentAccount;
    }

    public static int z0(ob obVar) {
        return obVar.classGuid;
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f41061o0;
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
            tL_message.dialog_id = -this.f41066s.f22392id;
            tL_message.f22413id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e10) {
                FileLog.e(e10);
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
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new j8(1)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                ob obVar = ob.this;
                obVar.getClass();
                if (l10.longValue() < 0) {
                    TLRPC.Chat chat = obVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(obVar.getMessagesController().getUser(l10));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new ih.d1(1)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            h01 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new h01(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.n6 n6Var = S0.f38711a;
                n6Var.u(bold);
                n6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.f38713c != -1) {
                    S0.f38713c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.n6 n6Var2 = S0.f38711a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                n6Var2.q(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) j7.l1.i(1, arrayList);
        }
        if (messageObject != null) {
            long j12 = messageObject.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject.eventId;
                int i13 = T0;
                T0 = i13 + 1;
                hVar.k(Integer.valueOf(i13), j13);
            }
            messageObject2.stableId = ((Integer) hVar.f(messageObject.eventId)).intValue();
        }
        return messageObject2;
    }

    public final void O0(boolean z10) {
        int abs;
        k kVar = this.C;
        if (kVar != null && !this.f41055i0) {
            int L0 = kVar.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.C.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f41065r0 && !this.f41063q0) {
                    V0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f41048d0 == null) {
            n0 n0Var = new n0(this, getParentActivity(), 4);
            this.f41048d0 = n0Var;
            n0Var.setOutlineProvider(new eg.k1(8));
            this.f41048d0.setClipToOutline(true);
            this.f41048d0.setWillNotDraw(false);
            this.f41048d0.setVisibility(4);
            e5.c cVar = new e5.c(getParentActivity());
            this.f41050e0 = cVar;
            cVar.setBackgroundColor(0);
            if (z10) {
                this.f41048d0.addView(this.f41050e0, i7.f6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f41052f0 = textureView;
            textureView.setOpaque(false);
            this.f41050e0.addView(this.f41052f0, i7.f6.c(-1.0f, -1));
        }
        if (this.f41048d0.getParent() == null) {
            lb lbVar = this.X;
            n0 n0Var2 = this.f41048d0;
            int i10 = AndroidUtilities.roundMessageSize;
            lbVar.addView(n0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f41048d0.setVisibility(4);
        this.f41050e0.setDrawingReady(false);
        return this.f41052f0;
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
            ArrayList arrayList4 = this.f41060n0;
            if (i12 < arrayList4.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                if (messageObject2 != null && (tL_channelAdminLogEvent2 = messageObject2.currentEvent) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j10 = 0;
                }
                if (messageObject2.stableId <= 0) {
                    int i13 = T0;
                    T0 = i13 + 1;
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
                        MessageObject messageObject3 = (MessageObject) j7.l1.i(1, arrayList3);
                        if (TextUtils.isEmpty(this.f41070v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f41062p0;
                        if (!hashSet.contains(valueOf) && z11) {
                            a1(messageObject3, arrayList3.size() - 1);
                            arrayList2.add(messageObject3);
                        } else {
                            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                a1((MessageObject) arrayList3.get(i15), 0);
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
                            kb kbVar = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            kbVar.m(i10 + size);
                            kb kbVar2 = this.E;
                            if (z10) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            kbVar2.m(size + i11 + 1);
                        }
                        long j12 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j12, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) j7.l1.i(1, arrayList5);
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
                ArrayList arrayList6 = this.f41061o0;
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
                    this.R.addListener(new nh.q5(this, 23));
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

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f41059n != null) {
            jf.e0 e0Var = this.P0;
            if (e0Var.f11581c == 0) {
                e0Var.invalidate();
            }
            e0Var.f11581c = i10 | e0Var.f11581c;
        }
    }

    public final void V0(boolean z10) {
        kb kbVar;
        if (!this.f41065r0) {
            ArrayList arrayList = this.f41060n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f41071w;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.A.setEmptyView(null);
                }
                this.f41057k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f41065r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41066s);
            tL_channels_getAdminLog.f22427q = this.f41070v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41069u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f41072w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f41072w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41072w0.n(i10)));
                }
            }
            c1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ma(this, 4));
            if (z10 && (kbVar = this.E) != null) {
                kbVar.l();
            }
        }
    }

    public final void W0() {
        if (this.f41067s0) {
            return;
        }
        this.f41067s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41066s);
        tL_channels_getAdminLog.f22427q = this.f41070v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41069u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f41072w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f41072w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41072w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ma(this, 1));
    }

    public final void X0(boolean z10) {
        int i10;
        long j10;
        db dbVar = this.A;
        if (dbVar != null && this.C != null && dbVar.getChildCount() > 0) {
            if (z10) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.s1 s1Var = null;
            int i11 = -1;
            for (int i12 = 0; i12 < this.A.getChildCount(); i12++) {
                View childAt = this.A.getChildAt(i12);
                this.A.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i10) {
                        }
                        i10 = childAt.getTop();
                        s1Var = childAt;
                        i11 = R;
                    } else {
                        if (top <= i10) {
                        }
                        i10 = childAt.getTop();
                        s1Var = childAt;
                        i11 = R;
                    }
                }
            }
            if (s1Var != null) {
                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                    j10 = s1Var.getMessageObject().eventId;
                } else if (s1Var instanceof org.telegram.ui.Cells.v0) {
                    j10 = s1Var.getMessageObject().eventId;
                } else {
                    j10 = 0;
                }
                this.M0 = j10;
                this.N0 = i11;
                this.O0 = (this.A.getMeasuredHeight() - s1Var.getBottom()) - this.A.getPaddingBottom();
            }
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f9;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (s1Var = this.J0) != null && (textLayoutBlocks = s1Var.Y3) != null) {
                i10 = (int) s1Var.f25439m4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var2 = this.J0;
                if (s1Var2 != null && s1Var2.f25480p1) {
                    i10 = s1Var2.f25381i2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.s1 s1Var3 = this.J0;
            if (s1Var3 != null) {
                s1Var3.f25533se = 0;
                s1Var3.f25548te = null;
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
                            f9 = 0.7f;
                        } else {
                            f9 = 0.5f;
                        }
                        if (lineTop > f10 * f9) {
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
            org.telegram.ui.Cells.s1 s1Var4 = this.J0;
            if (s1Var4 != null) {
                s1Var4.f25533se = 0;
                s1Var4.f25548te = null;
            }
        }
        return 0;
    }

    public final void Z0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob.Z0(org.telegram.messenger.MessageObject):void");
    }

    public final void c1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f41070v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f41072w0 == null && this.f41069u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f41066s.megagroup) {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        } else {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.s1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.g6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 15));
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, null, false, null);
        this.I = xnVar;
        cl clVar = xnVar.h;
        if (clVar != null) {
            clVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        cl clVar2 = xnVar.f34805r;
        if (clVar2 != null) {
            clVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        xnVar.f34794g0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, i7.f6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 0);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.xn xnVar2 = this.I;
        TLRPC.Chat chat = this.f41066s;
        xnVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        cb cbVar = new cb(this, context);
        this.fragmentView = cbVar;
        this.X = cbVar;
        jf.e0 e0Var = new jf.e0(context, new sa(this));
        this.P0 = e0Var;
        this.X.addView(e0Var);
        sg.i iVar = new sg.i(this.X);
        lb lbVar = this.X;
        lg.a aVar = this.f41049e;
        aVar.d = iVar;
        aVar.f15224e = lbVar;
        lg.a aVar2 = this.f41051f;
        aVar2.d = iVar;
        aVar2.f15224e = lbVar;
        lg.a aVar3 = this.f41044b;
        aVar3.d = iVar;
        aVar3.f15224e = lbVar;
        lbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.g6.r0());
        this.actionBar.L(aVar, pg.a.n(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, i7.f6.e(-1, -2, 17));
        this.H.setOnTouchListener(new mh.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.t5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.f23095f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, i7.f6.t(54, 54, 17, 16, 20, 16, -4));
        eg.r rVar = new eg.r(context, 8);
        this.L = rVar;
        rVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        eg.r rVar2 = this.L;
        int i11 = org.telegram.ui.ActionBar.g6.f23158ic;
        rVar2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, i7.f6.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, i7.f6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        db dbVar = new db(this, context);
        this.A = dbVar;
        dbVar.setOnItemClickListener(new h(this, 9));
        this.A.setTag(1);
        this.A.setVerticalScrollBarEnabled(true);
        db dbVar2 = this.A;
        kb kbVar = new kb(this, context);
        this.E = kbVar;
        dbVar2.setAdapter(kbVar);
        this.A.setClipToPadding(false);
        db dbVar3 = this.A;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f41064r;
        dbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        db dbVar4 = this.A;
        eb ebVar = new eb(this, this.A, this.resourceProvider);
        this.C0 = ebVar;
        dbVar4.setItemAnimator(ebVar);
        this.C0.Q = true;
        this.A.setLayoutAnimation(null);
        k kVar = new k(this);
        this.C = kVar;
        kVar.j1(1);
        this.C.l1(true);
        this.A.setLayoutManager(this.C);
        c2.z zVar = new c2.z(this.A, this.C);
        this.D = zVar;
        zVar.h = new sa(this);
        zVar.f2938i = this.L0;
        this.X.addView(this.A, i7.f6.c(-1.0f, -1));
        this.A.setOnScrollListener(new m3(this));
        int i14 = this.f41053g0;
        if (i14 != -1) {
            this.C.h1(i14, this.f41054h0);
            this.f41053g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(aVar3);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41071w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f41071w, i7.f6.e(-1, -1, 51));
        View view2 = new View(context);
        this.f41073x = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.t5(this.f41073x, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f23095f2));
        this.f41071w.addView(this.f41073x, i7.f6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f41075y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f41075y.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f41071w.addView(this.f41075y, i7.f6.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.M = v0Var;
        v0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, i7.f6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        ug.e eVar = new ug.e(context, aVar, pg.a.b(c6Var), c6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        ug.e eVar2 = this.G;
        ng.d c3 = eVar2.f49221n.c(eVar2, null, false);
        c3.n(eVar2.f49222r);
        c3.p(AndroidUtilities.dp(22.0f));
        c3.o(AndroidUtilities.dp(6.0f));
        eVar2.f49223s = c3;
        this.X.addView(this.G, i7.f6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ob f43207b;

            {
                this.f43207b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ob obVar = this.f43207b;
                        if (obVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(obVar, obVar.f41069u0, obVar.f41072w0, obVar.f41066s.megagroup);
                            i0Var.S(obVar.f41068t0);
                            i0Var.f29291c0 = new sa(obVar);
                            obVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        ob obVar2 = this.f43207b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar2.getParentActivity());
                        if (obVar2.f41066s.megagroup) {
                            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        obVar2.showDialog(c2Var);
                        return;
                    default:
                        ob obVar3 = this.f43207b;
                        if (obVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(obVar3.N.getSearchField());
                            obVar3.showDialog(org.telegram.ui.Components.c5.p(obVar3.getParentActivity(), new pa(obVar3, 0), null).f22729a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, i7.f6.e(-2, -2, 17));
        ug.e eVar3 = this.G;
        eVar3.f49220f.add(this.F);
        this.G.d(false);
        ug.e eVar4 = this.G;
        eVar4.f49217b[4] = new View.OnClickListener(this) {
            public final ob f43207b;

            {
                this.f43207b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ob obVar = this.f43207b;
                        if (obVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(obVar, obVar.f41069u0, obVar.f41072w0, obVar.f41066s.megagroup);
                            i0Var.S(obVar.f41068t0);
                            i0Var.f29291c0 = new sa(obVar);
                            obVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        ob obVar2 = this.f43207b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar2.getParentActivity());
                        if (obVar2.f41066s.megagroup) {
                            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        obVar2.showDialog(c2Var);
                        return;
                    default:
                        ob obVar3 = this.f43207b;
                        if (obVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(obVar3.N.getSearchField());
                            obVar3.showDialog(org.telegram.ui.Components.c5.p(obVar3.getParentActivity(), new pa(obVar3, 0), null).f22729a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41043a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f41043a0.setVisibility(4);
        this.f41043a0.setFocusable(true);
        this.f41043a0.setFocusableInTouchMode(true);
        this.f41043a0.setClickable(true);
        this.f41043a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f41043a0, i7.f6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f41045b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f41045b0.setImageResource(R.drawable.msg_calendar);
        this.f41045b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423xe, false), PorterDuff.Mode.MULTIPLY));
        this.f41043a0.addView(this.f41045b0, i7.f6.e(48, 48, 53));
        this.f41045b0.setOnClickListener(new View.OnClickListener(this) {
            public final ob f43207b;

            {
                this.f43207b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ob obVar = this.f43207b;
                        if (obVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(obVar, obVar.f41069u0, obVar.f41072w0, obVar.f41066s.megagroup);
                            i0Var.S(obVar.f41068t0);
                            i0Var.f29291c0 = new sa(obVar);
                            obVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        ob obVar2 = this.f43207b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar2.getParentActivity());
                        if (obVar2.f41066s.megagroup) {
                            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        obVar2.showDialog(c2Var);
                        return;
                    default:
                        ob obVar3 = this.f43207b;
                        if (obVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(obVar3.N.getSearchField());
                            obVar3.showDialog(org.telegram.ui.Components.c5.p(obVar3.getParentActivity(), new pa(obVar3, 0), null).f22729a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41047c0 = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23440ye, false));
        this.f41047c0.setTextSize(15);
        this.f41047c0.setTypeface(AndroidUtilities.bold());
        this.f41043a0.addView(this.f41047c0, i7.f6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f41065r0 && this.f41060n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41071w, true, 0.3f, true);
            this.A.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41071w, false, 0.3f, true);
            this.A.setEmptyView(this.H);
        }
        db dbVar5 = this.A;
        dbVar5.U1 = true;
        dbVar5.V1 = 1;
        UndoView undoView = new UndoView(context);
        this.B = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.B, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        MessageObject messageObject;
        int i10;
        db dbVar = this.A;
        if (dbVar == null) {
            return;
        }
        int childCount = dbVar.getChildCount();
        int measuredHeight = this.A.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.s1 s1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.A.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                float y8 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                t1Var.f25689f = y8;
                t1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                int top = s1Var2.getTop();
                s1Var2.getBottom();
                if (top >= 0) {
                    i10 = 0;
                } else {
                    i10 = -top;
                }
                int measuredHeight2 = s1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                s1Var2.b4(i10, measuredHeight2 - i10, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.A.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = s1Var2.getMessageObject();
                if (this.f41048d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = s1Var2.getPhotoImage();
                    this.f41048d0.setTranslationX(photoImage.getImageX());
                    this.f41048d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f41048d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (v0Var.I()) {
                    v0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.A.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.s1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        s1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                eb ebVar = this.C0;
                if ((ebVar == null || (!ebVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        n0 n0Var = this.f41048d0;
        if (n0Var != null) {
            if (!z11) {
                n0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            } else {
                MediaController.getInstance().setCurrentVideoVisible(true);
            }
        }
        if (s1Var != null) {
            if (s1Var instanceof org.telegram.ui.Cells.s1) {
                messageObject = s1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.v0) s1Var).getMessageObject();
            }
            this.M.T(messageObject.messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.s1) && !(view2 instanceof org.telegram.ui.Cells.v0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view != null) {
            if (view.getTop() <= this.A.getPaddingTop() && !this.Q) {
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
            int bottom2 = view.getBottom() - this.A.getPaddingTop();
            if (bottom2 > this.M.getMeasuredHeight() && bottom2 < this.M.getMeasuredHeight() * 2) {
                org.telegram.ui.Cells.v0 v0Var2 = this.M;
                v0Var2.setTranslationY(((-v0Var2.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.M.setTranslationY(0.0f);
            return;
        }
        T0(true);
        this.M.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.s1 s1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i10 == NotificationCenter.emojiLoaded) {
            db dbVar = this.A;
            if (dbVar != null) {
                dbVar.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f41050e0, this.f41048d0, true);
                int childCount = this.A.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.A.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt;
                            MessageObject messageObject4 = s1Var4.getMessageObject();
                            if (this.f41048d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = s1Var4.getPhotoImage();
                                this.f41048d0.setTranslationX(photoImage.getImageX());
                                this.f41048d0.setTranslationY(photoImage.getImageY() + s1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f41048d0.invalidate();
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
                if (this.f41048d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f41048d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.V || PipRoundVideoView.B != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            db dbVar2 = this.A;
            if (dbVar2 != null) {
                int childCount2 = dbVar2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.A.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject3 = (s1Var3 = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null) {
                        if (!messageObject3.isVoice() && !messageObject3.isMusic()) {
                            if (messageObject3.isRoundVideo()) {
                                s1Var3.e1(null, false);
                                if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                    messageObject3.resetPlayingProgress();
                                    s1Var3.invalidate();
                                }
                            }
                        } else {
                            s1Var3.m4(false, true, false);
                        }
                    }
                }
            }
        } else if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                db dbVar3 = this.A;
                if (dbVar3 != null) {
                    int childCount3 = dbVar3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.A.getChildAt(i14);
                        if ((childAt3 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = (s1Var2 = (org.telegram.ui.Cells.s1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                s1Var2.q4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.X.V(org.telegram.ui.ActionBar.g6.r0());
                this.f41073x.invalidate();
                eg.r rVar = this.L;
                if (rVar != null) {
                    rVar.invalidate();
                }
                this.A.f1();
            }
        } else {
            db dbVar4 = this.A;
            if (dbVar4 != null) {
                int childCount4 = dbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.A.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                s1Var.e1(null, true);
                            }
                        } else {
                            s1Var.m4(false, true, false);
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

    public final void e1() {
        boolean z10;
        db dbVar = this.A;
        if (dbVar != null) {
            int childCount = dbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.A.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.s()) {
                            s1Var.setDrawSelectionBackground(false);
                            s1Var.J3(false, true);
                            s1Var.L3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            ra raVar = this.I0;
                            if (raVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(raVar);
                            }
                            ra raVar2 = new ra(this, 0);
                            this.I0 = raVar2;
                            AndroidUtilities.runOnUIThread(raVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f41070v0)) {
                            s1Var.S3(this.f41070v0);
                        } else {
                            s1Var.S3(null);
                        }
                        if (this.A.getScrollState() == 0) {
                            z11 = false;
                        }
                        s1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    v0Var.setMessageObject(v0Var.getMessageObject());
                    if (this.A.getScrollState() == 0) {
                        z11 = false;
                    }
                    v0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Nd));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23385v8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f23348t8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.g6.f23042c2, org.telegram.ui.ActionBar.g6.f23058d2}, org.telegram.ui.ActionBar.g6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23154i8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23172j8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23191k8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23208l8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23225m8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23243n8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23262o8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23220m3, org.telegram.ui.ActionBar.g6.f23292q3}, null, org.telegram.ui.ActionBar.g6.f23313ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23238n3, org.telegram.ui.ActionBar.g6.f23308r3}, null, org.telegram.ui.ActionBar.g6.f23067dc));
        Drawable[] k9 = org.telegram.ui.ActionBar.g6.f23220m3.k();
        int i13 = org.telegram.ui.ActionBar.g6.f23350ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k9, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23292q3.k(), null, i13));
        Drawable[] k10 = org.telegram.ui.ActionBar.g6.f23257o3.k();
        int i14 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k10, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23324s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23275p3, org.telegram.ui.ActionBar.g6.f23343t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.f23323s2;
        int i15 = org.telegram.ui.ActionBar.g6.f23158ic;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, new Class[]{org.telegram.ui.Cells.v0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.v0.class}, org.telegram.ui.ActionBar.g6.f23323s2, null, null, org.telegram.ui.ActionBar.g6.f23176jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23399w4, org.telegram.ui.ActionBar.g6.f23293q4, org.telegram.ui.ActionBar.g6.x4, org.telegram.ui.ActionBar.g6.f23381v4, org.telegram.ui.ActionBar.g6.f23363u4, org.telegram.ui.ActionBar.g6.C4}, null, org.telegram.ui.ActionBar.g6.f23194kc));
        int i16 = org.telegram.ui.ActionBar.g6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23228mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23086ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23104fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23430y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23447z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23333sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O3, org.telegram.ui.ActionBar.g6.S3, org.telegram.ui.ActionBar.g6.W3}, null, org.telegram.ui.ActionBar.g6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P3, org.telegram.ui.ActionBar.g6.T3, org.telegram.ui.ActionBar.g6.X3}, null, org.telegram.ui.ActionBar.g6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.M3, org.telegram.ui.ActionBar.g6.Q3, org.telegram.ui.ActionBar.g6.U3}, null, org.telegram.ui.ActionBar.g6.f23422xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.N3, org.telegram.ui.ActionBar.g6.R3, org.telegram.ui.ActionBar.g6.V3}, null, org.telegram.ui.ActionBar.g6.f23438yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23006a4, org.telegram.ui.ActionBar.g6.f23025b4, org.telegram.ui.ActionBar.g6.Z3}, null, org.telegram.ui.ActionBar.g6.f23456zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23078e4}, null, org.telegram.ui.ActionBar.g6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23097f4}, null, org.telegram.ui.ActionBar.g6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23043c4}, null, org.telegram.ui.ActionBar.g6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23060d4}, null, org.telegram.ui.ActionBar.g6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23115g4}, null, org.telegram.ui.ActionBar.g6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.f23150i4};
        int i17 = org.telegram.ui.ActionBar.g6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.g6.f23132h4, org.telegram.ui.ActionBar.g6.B4, org.telegram.ui.ActionBar.g6.D4};
        int i18 = org.telegram.ui.ActionBar.g6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.J4, null, org.telegram.ui.ActionBar.g6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.H4, null, org.telegram.ui.ActionBar.g6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O4}, null, org.telegram.ui.ActionBar.g6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P4}, null, org.telegram.ui.ActionBar.g6.f23311r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Q4}, null, org.telegram.ui.ActionBar.g6.f23297qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.f23023b2, null, null, org.telegram.ui.ActionBar.g6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23168j4}, null, org.telegram.ui.ActionBar.g6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.J2, null, null, org.telegram.ui.ActionBar.g6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.K2, null, null, org.telegram.ui.ActionBar.g6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.T1, null, null, org.telegram.ui.ActionBar.g6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.Q2, null, null, org.telegram.ui.ActionBar.g6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Rc));
        int i19 = org.telegram.ui.ActionBar.g6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.f23013ab;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23032bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23049cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23066db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23085eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23015ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23103fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23034bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23051cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23122gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23068dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23139hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23087ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23157ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23105fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23175jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23140hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23159id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23177jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23314rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23195kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23248nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23332sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23266od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23246nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23211lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23316rd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23351tb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23334sd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23370ub));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23353td));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23388vb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23372ud));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23406wb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23408wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23437yb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23390vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23455zb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23439yd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23457zd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23160ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23371uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23178je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23389vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.g6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.re));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.f23335se));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23285pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.g6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.g6.f23300qe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.g6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41075y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.g6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 8, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.g6.De));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41073x, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i21 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.B;
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
        V0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f41066s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ma(this, 0)), this.classGuid);
        setBulletinDelegate(new eg.x(8));
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
        this.f41074x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lb lbVar = this.X;
        if (lbVar != null) {
            org.telegram.ui.Components.c81 c81Var = lbVar.v;
            if (c81Var != null) {
                c81Var.c(false);
            }
            lbVar.B = true;
        }
        UndoView undoView = this.B;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f41055i0 = true;
        this.f41056j0 = true;
        ab.m mVar = ab.m.f323e;
        if (mVar != null && mVar.f324a) {
            ab.m i10 = ab.m.i();
            if (i10.f324a) {
                int i11 = c5.B;
                ((s4) i10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f41052f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        lb lbVar = this.X;
        if (lbVar != null) {
            org.telegram.ui.Components.c81 c81Var = lbVar.v;
            if (c81Var != null) {
                c81Var.c(true);
            }
            lbVar.B = false;
        }
        this.f41055i0 = false;
        O0(false);
        if (this.f41056j0) {
            this.f41056j0 = false;
            kb kbVar = this.E;
            if (kbVar != null) {
                kbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f41074x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f41074x0.lock();
        }
    }
}
