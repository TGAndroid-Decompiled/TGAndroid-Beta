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
public final class pb extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static int T0 = 10;
    public static final int[] U0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public eb A;
    public boolean A0;
    public UndoView B;
    public final ab B0;
    public of.y C;
    public fb C0;
    public c2.y D;
    public final ArrayList D0;
    public lb E;
    public final a0.h E0;
    public TextView F;
    public ya F0;
    public rg.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.tn I;
    public sa I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.t1 J0;
    public ImageView K;
    public int K0;
    public bg.t L;
    public final ob L0;
    public org.telegram.ui.Cells.w0 M;
    public long M0;
    public org.telegram.ui.ActionBar.w0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public ff.f0 P0;
    public boolean Q;
    public final ArrayList Q0;
    public AnimatorSet R;
    public final ArrayList R0;
    public boolean S;
    public final RectF S0;
    public final int[] T;
    public boolean U;
    public boolean V;
    public rg.f W;
    public mb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final ng.e f41394a;
    public FrameLayout f41395a0;
    public final ig.a f41396b;
    public ImageView f41397b0;
    public final ng.d f41398c;
    public org.telegram.ui.ActionBar.h5 f41399c0;
    public final ng.d d;
    public m0 f41400d0;
    public final ig.a f41401e;
    public c5.c f41402e0;
    public final ig.a f41403f;
    public TextureView f41404f0;
    public int f41405g0;
    public final xd.b h;
    public int f41406h0;
    public boolean f41407i0;
    public boolean f41408j0;
    public final a0.h f41409k0;
    public final a0.h f41410l0;
    public final HashMap m0;
    public final ig.e f41411n;
    public final ArrayList f41412n0;
    public final ArrayList f41413o0;
    public final HashSet f41414p0;
    public boolean f41415q0;
    public final int f41416r;
    public boolean f41417r0;
    public final TLRPC.Chat f41418s;
    public boolean f41419s0;
    public ArrayList f41420t0;
    public TLRPC.TL_channelAdminLogEventsFilter f41421u0;
    public final ArrayList v;
    public String f41422v0;
    public FrameLayout f41423w;
    public a0.h f41424w0;
    public View f41425x;
    public final AnimationNotificationsLocker f41426x0;
    public RadialProgressView f41427y;
    public final HashMap f41428y0;
    public HashMap f41429z0;

    public pb(TLRPC.Chat chat) {
        super(null);
        xd.b bVar = new xd.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.T = new int[]{2};
        this.f41405g0 = -1;
        this.f41406h0 = 0;
        this.f41407i0 = true;
        this.f41408j0 = false;
        this.f41409k0 = new a0.h();
        this.f41410l0 = new a0.h();
        this.m0 = new HashMap();
        this.f41412n0 = new ArrayList();
        this.f41413o0 = new ArrayList();
        this.f41414p0 = new HashSet();
        this.f41421u0 = null;
        this.f41422v0 = "";
        this.f41426x0 = new AnimationNotificationsLocker(U0);
        this.f41428y0 = new HashMap();
        this.B0 = new ab(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new ob(this);
        this.N0 = -1;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new RectF();
        ?? obj = new Object();
        this.f41394a = obj;
        ig.a aVar = new ig.a(obj);
        this.f41396b = aVar;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ig.e eVar = new ig.e(false);
            this.f41411n = eVar;
            ng.d dVar = new ng.d(obj);
            this.d = dVar;
            dVar.v = new sa(this, 3);
            dVar.d = eVar;
            dVar.f18604e = -3;
            dVar.f18605f = obj;
            ig.a aVar2 = new ig.a(dVar);
            this.f41403f = aVar2;
            aVar2.f11132f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                ng.d dVar2 = new ng.d(obj);
                this.f41398c = dVar2;
                dVar2.v = new sa(this, 3);
                dVar2.d = eVar;
                dVar2.f18604e = -2;
                dVar2.f18605f = obj;
                ig.a aVar3 = new ig.a(dVar2);
                this.f41401e = aVar3;
                aVar3.f11132f = LiteMode.isEnabled(262144);
                this.f41416r = 0;
            } else {
                this.f41398c = null;
                this.f41401e = aVar2;
                this.f41416r = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.f41411n = null;
            this.f41416r = 0;
            this.f41398c = null;
            this.d = null;
            this.f41401e = new ig.a(obj);
            this.f41403f = new ig.a(obj);
        }
        aVar.f11130c = bVar;
        this.f41401e.f11130c = bVar;
        this.f41403f.f11130c = bVar;
        this.f41418s = chat;
    }

    public static org.telegram.ui.ActionBar.k F0(pb pbVar) {
        return pbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k G0(pb pbVar) {
        return pbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k H0(pb pbVar) {
        return pbVar.actionBar;
    }

    public static void K0(pb pbVar) {
        if (pbVar.A != null && !pbVar.f41412n0.isEmpty()) {
            pbVar.C.h1(pbVar.f41413o0.size() - 1, (-100000) - pbVar.A.getPaddingTop());
        }
    }

    public static int L0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static g01 S0(CharSequence charSequence) {
        org.telegram.ui.Components.eq[] eqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.eq eqVar : (org.telegram.ui.Components.eq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.eq.class)) {
                if (eqVar != null) {
                    Drawable drawable = eqVar.drawable;
                    if (drawable instanceof g01) {
                        return (g01) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void T(pb pbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = pbVar.f41409k0;
        int i9 = 0;
        pbVar.C0.N = false;
        pbVar.X0(false);
        MessagesController.getInstance(pbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(pbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = pbVar.f41412n0;
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.f22412id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                pbVar.O = Math.min(pbVar.O, tL_channelAdminLogEvent.f22412id);
                MessageObject messageObject2 = new MessageObject(pbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) pbVar.m0, pbVar.f41418s, pbVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f22412id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                pbVar.f41410l0.k(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (size != i11) {
                                messageObject = (MessageObject) arrayList.get(i11);
                                if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i11++;
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
            MediaDataController.getInstance(pbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -pbVar.f41418s.f22380id, 0, 0L, new sa(pbVar, 1), pbVar.getClassGuid(), null);
        }
        pbVar.R0();
        pbVar.f41417r0 = false;
        if (!z10) {
            pbVar.f41415q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(pbVar.f41423w, false, 0.3f, true);
        pbVar.A.setEmptyView(pbVar.H);
        lb lbVar = pbVar.E;
        if (lbVar != null) {
            lbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = pbVar.N;
        if (w0Var != null) {
            if (pbVar.f41413o0.isEmpty() && TextUtils.isEmpty(pbVar.f41422v0)) {
                i9 = 8;
            }
            w0Var.setVisibility(i9);
        }
    }

    public static void U(pb pbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && pbVar.getParentActivity() != null) {
            int i9 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, pbVar.getParentActivity(), pbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            pbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(pbVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                if (arrayList4.get(i10) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(pbVar.getParentActivity(), pbVar.getResourceProvider()), g7.e6.n(-1, 8));
                } else {
                    Activity parentActivity = pbVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, parentActivity, pbVar.getResourceProvider(), z10, z11);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.g((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                    if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                        g1Var.c(pbVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7), pbVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    g1Var.setOnClickListener(new ih.p5(pbVar, i10, arrayList4, (Integer) arrayList4.get(i10), 1));
                }
                i10++;
                arrayList4 = arrayList;
            }
            xa xaVar = new xa(0, pbVar.X.getContext(), pbVar);
            xaVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, g7.e6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            xaVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            ya yaVar = new ya(pbVar, xaVar);
            pbVar.F0 = yaVar;
            yaVar.f23690e = true;
            yaVar.f23689c = 220;
            yaVar.setOutsideTouchable(true);
            pbVar.F0.setClippingEnabled(true);
            pbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
            pbVar.F0.setFocusable(true);
            xaVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            pbVar.F0.setInputMethodMode(2);
            pbVar.F0.setSoftInputMode(48);
            pbVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f10)) - xaVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (pbVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - xaVar.getMeasuredWidth()) {
                left = (pbVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - xaVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                pbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = pbVar.X.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + xaVar.getMeasuredHeight();
            int R = pbVar.X.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y10 = (int) (pbVar.A.getY() + view.getTop() + f11);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i9 = (AndroidUtilities.dp(240.0f) - dp) + y10;
                } else {
                    i9 = y10;
                }
                if (i9 < pbVar.A.getY() + AndroidUtilities.dp(24.0f)) {
                    i9 = (int) (pbVar.A.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i11 = height - dp;
                    if (i9 > i11 - AndroidUtilities.dp(8.0f)) {
                        i9 = i11 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!pbVar.inBubbleMode) {
                i9 = AndroidUtilities.statusBarHeight;
            }
            xaVar.setMaxHeight(height - i9);
            pbVar.F0.showAtLocation(pbVar.A, 51, left, i9);
            pbVar.F0.b();
        }
    }

    public static void V(org.telegram.ui.pb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb.V(org.telegram.ui.pb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void W(pb pbVar, int i9) {
        int i10;
        RectF rectF;
        ng.d dVar = pbVar.f41398c;
        ng.d dVar2 = pbVar.d;
        ArrayList arrayList = pbVar.R0;
        ig.e eVar = pbVar.f41411n;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && eVar != null) {
            if (g7.z7.a(i9, 2)) {
                ArrayList arrayList2 = pbVar.Q0;
                if (i11 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, pbVar.X.getMeasuredWidth(), pbVar.A.getY() + pbVar.A.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i10 = dVar2.c(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                    } else {
                        i10 = 0;
                    }
                    if (dVar != null) {
                        i10 += dVar.c(arrayList2, i10, AndroidUtilities.dp(8.0f));
                    }
                } else {
                    i10 = 0;
                }
                int a2 = ff.m0.a(arrayList2, i10, arrayList);
                int measuredWidth = pbVar.X.getMeasuredWidth();
                for (int i12 = 0; i12 < a2; i12++) {
                    RectF rectF2 = (RectF) arrayList.get(i12);
                    float f10 = measuredWidth;
                    rectF2.left = g7.n.a(rectF2.left, 0.0f, f10);
                    rectF2.top = Math.max(pbVar.A.getY(), rectF2.top);
                    rectF2.right = g7.n.a(rectF2.right, 0.0f, f10);
                    rectF2.bottom = Math.min(pbVar.A.getY() + pbVar.A.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            mb mbVar = pbVar.X;
            Objects.requireNonNull(mbVar);
            if (eVar.e(new ra(mbVar, 0), pbVar.X.getWidth(), pbVar.X.getHeight())) {
                if (dVar != null) {
                    dVar.d();
                }
                if (dVar2 != null) {
                    dVar2.d();
                }
                org.telegram.ui.ActionBar.k kVar = pbVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                pbVar.X.invalidate();
                Iterator it = pbVar.h.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    public static void X(pb pbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = pbVar.f41409k0;
        pbVar.f41419s0 = false;
        pbVar.C0.N = false;
        pbVar.X0(false);
        MessagesController.getInstance(pbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(pbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i9 = 0; i9 < tL_channels_adminLogResults.events.size(); i9++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i9);
            if (hVar.h(tL_channelAdminLogEvent2.f22412id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                pbVar.O = Math.min(pbVar.O, tL_channelAdminLogEvent2.f22412id);
                MessageObject messageObject = new MessageObject(pbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, pbVar.f41418s, pbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f22412id))) {
                    pbVar.f41412n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f22412id);
                    z10 = true;
                }
            }
        }
        if (pbVar.E != null && z10) {
            pbVar.R0();
            pbVar.E.l();
        }
    }

    public static void Y(pb pbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = pbVar.f41418s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            pbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            pbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            pbVar.f41420t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = pbVar.getMessagesController().getChatFull(chat.f22380id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = pbVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = pbVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = pbVar.getMessagesController().telegramAntispamUserId;
                if (pbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f22521id.add(tL_inputUser);
                    ConnectionsManager.getInstance(pbVar.currentAccount).sendRequest(tL_users_getUsers, new na(pbVar, 2));
                }
                pbVar.f41420t0.add(0, channelParticipant);
            }
            Dialog dialog = pbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).R(pbVar.f41420t0);
            }
        }
    }

    public static void a1(MessageObject messageObject, int i9) {
        if (messageObject == null) {
            return;
        }
        if (i9 <= 0) {
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
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i9, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public static CharSequence b1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!e2.c.v(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.z.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.z.f(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int k0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int l0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int m0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int n0(pb pbVar) {
        return pbVar.classGuid;
    }

    public static void o0(org.telegram.ui.pb r6, android.os.Bundle r7, long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb.o0(org.telegram.ui.pb, android.os.Bundle, long):void");
    }

    public static int p0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int q0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int r0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int s0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int t0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static void u0(pb pbVar, MessageObject messageObject) {
        if (pbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.P = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.P = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        pbVar.showDialog(c2Var);
    }

    public static int v0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int w0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int x0(pb pbVar) {
        return pbVar.currentAccount;
    }

    public static int y0(pb pbVar) {
        return pbVar.classGuid;
    }

    public static void z0(pb pbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = pbVar.getMessagesController();
        TLRPC.Chat chat = pbVar.f41418s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f22380id);
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(pbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, pbVar, chatFull.f22381id, false, ChatObject.isChannel(chat));
        a60Var.f26685f0 = new bb(pbVar);
        a60Var.show();
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i9;
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f41413o0;
            messageObject = null;
            if (i11 < arrayList2.size()) {
                messageObject2 = (MessageObject) arrayList2.get(i11);
                if (messageObject2 != null && messageObject2.contentType == 1 && messageObject2.actionDeleteGroupEventId == j10) {
                    break;
                }
                i11++;
            } else {
                messageObject2 = null;
                break;
            }
        }
        if (messageObject2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f41418s.f22380id;
            tL_message.f22401id = -1;
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
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new k8(1)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                pb pbVar = pb.this;
                pbVar.getClass();
                if (l10.longValue() < 0) {
                    TLRPC.Chat chat = pbVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(pbVar.getMessagesController().getUser(l10));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new fh.i1(1)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            g01 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new g01(LocaleController.getString(i10));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.i6 i6Var = S0.f38402a;
                i6Var.u(bold);
                i6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.f38404c != -1) {
                    S0.f38404c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.i6 i6Var2 = S0.f38402a;
                if (z10) {
                    i9 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i9 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                i6Var2.q(LocaleController.getString(i9), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) j3.r0.j(1, arrayList);
        }
        if (messageObject != null) {
            long j12 = messageObject.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject.eventId;
                int i12 = T0;
                T0 = i12 + 1;
                hVar.k(Integer.valueOf(i12), j13);
            }
            messageObject2.stableId = ((Integer) hVar.f(messageObject.eventId)).intValue();
        }
        return messageObject2;
    }

    public final void O0(boolean z10) {
        int abs;
        of.y yVar = this.C;
        if (yVar != null && !this.f41407i0) {
            int L0 = yVar.L0();
            int i9 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.C.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i9 = 4;
                }
                if (L0 <= i9 && !this.f41417r0 && !this.f41415q0) {
                    V0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f41400d0 == null) {
            m0 m0Var = new m0(this, getParentActivity(), 4);
            this.f41400d0 = m0Var;
            m0Var.setOutlineProvider(new bg.q1(8));
            this.f41400d0.setClipToOutline(true);
            this.f41400d0.setWillNotDraw(false);
            this.f41400d0.setVisibility(4);
            c5.c cVar = new c5.c(getParentActivity());
            this.f41402e0 = cVar;
            cVar.setBackgroundColor(0);
            if (z10) {
                this.f41400d0.addView(this.f41402e0, g7.e6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f41404f0 = textureView;
            textureView.setOpaque(false);
            this.f41402e0.addView(this.f41404f0, g7.e6.c(-1.0f, -1));
        }
        if (this.f41400d0.getParent() == null) {
            mb mbVar = this.X;
            m0 m0Var2 = this.f41400d0;
            int i9 = AndroidUtilities.roundMessageSize;
            mbVar.addView(m0Var2, 1, new FrameLayout.LayoutParams(i9, i9));
        }
        this.f41400d0.setVisibility(4);
        this.f41402e0.setDrawingReady(false);
        return this.f41404f0;
    }

    public final void R0() {
        long j10;
        MessageObject messageObject;
        long j11;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        int i10;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = this.f41412n0;
            if (i11 < arrayList4.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i11);
                if (messageObject2 != null && (tL_channelAdminLogEvent2 = messageObject2.currentEvent) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j10 = 0;
                }
                if (messageObject2.stableId <= 0) {
                    int i12 = T0;
                    T0 = i12 + 1;
                    messageObject2.stableId = i12;
                }
                int i13 = i11 + 1;
                if (i13 < arrayList4.size()) {
                    messageObject = (MessageObject) arrayList4.get(i13);
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
                        MessageObject messageObject3 = (MessageObject) j3.r0.j(1, arrayList3);
                        if (TextUtils.isEmpty(this.f41422v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f41414p0;
                        if (!hashSet.contains(valueOf) && z11) {
                            a1(messageObject3, arrayList3.size() - 1);
                            arrayList2.add(messageObject3);
                        } else {
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                a1((MessageObject) arrayList3.get(i14), 0);
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
                            lb lbVar = this.E;
                            if (z10) {
                                i9 = arrayList3.size() - 1;
                            } else {
                                i9 = 0;
                            }
                            lbVar.m(i9 + size);
                            lb lbVar2 = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            lbVar2.m(size + i10 + 1);
                        }
                        long j12 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j12, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) j3.r0.j(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i11 = i13;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f41413o0;
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
                    this.R.addListener(new mh.x(this, 21));
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

    public final void U0(int i9) {
        if (Build.VERSION.SDK_INT >= 31 && this.f41411n != null) {
            ff.f0 f0Var = this.P0;
            if (f0Var.f6167c == 0) {
                f0Var.invalidate();
            }
            f0Var.f6167c = i9 | f0Var.f6167c;
        }
    }

    public final void V0(boolean z10) {
        lb lbVar;
        if (!this.f41417r0) {
            ArrayList arrayList = this.f41412n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f41423w;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.A.setEmptyView(null);
                }
                this.f41409k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f41417r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41418s);
            tL_channels_getAdminLog.f22415q = this.f41422v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41421u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f41424w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i9 = 0; i9 < this.f41424w0.m(); i9++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41424w0.n(i9)));
                }
            }
            c1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new na(this, 4));
            if (z10 && (lbVar = this.E) != null) {
                lbVar.l();
            }
        }
    }

    public final void W0() {
        if (this.f41419s0) {
            return;
        }
        this.f41419s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41418s);
        tL_channels_getAdminLog.f22415q = this.f41422v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41421u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f41424w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i9 = 0; i9 < this.f41424w0.m(); i9++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41424w0.n(i9)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new na(this, 1));
    }

    public final void X0(boolean z10) {
        int i9;
        long j10;
        eb ebVar = this.A;
        if (ebVar != null && this.C != null && ebVar.getChildCount() > 0) {
            if (z10) {
                i9 = Integer.MAX_VALUE;
            } else {
                i9 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.t1 t1Var = null;
            int i10 = -1;
            for (int i11 = 0; i11 < this.A.getChildCount(); i11++) {
                View childAt = this.A.getChildAt(i11);
                this.A.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i9) {
                        }
                        i9 = childAt.getTop();
                        t1Var = childAt;
                        i10 = R;
                    } else {
                        if (top <= i9) {
                        }
                        i9 = childAt.getTop();
                        t1Var = childAt;
                        i10 = R;
                    }
                }
            }
            if (t1Var != null) {
                if (t1Var instanceof org.telegram.ui.Cells.t1) {
                    j10 = t1Var.getMessageObject().eventId;
                } else if (t1Var instanceof org.telegram.ui.Cells.w0) {
                    j10 = t1Var.getMessageObject().eventId;
                } else {
                    j10 = 0;
                }
                this.M0 = j10;
                this.N0 = i10;
                this.O0 = (this.A.getMeasuredHeight() - t1Var.getBottom()) - this.A.getPaddingBottom();
            }
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i9;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.J0) != null && (textLayoutBlocks = t1Var.Y3) != null) {
                i9 = (int) t1Var.f25475m4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var2 = this.J0;
                if (t1Var2 != null && t1Var2.f25512p1) {
                    i9 = t1Var2.f25418i2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i9 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = this.J0;
            if (t1Var3 != null) {
                t1Var3.f25570se = 0;
                t1Var3.f25585te = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.H0)) >= 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                    String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                    int i11 = textLayoutBlock.charactersOffset;
                    if (findQuoteStart > i11) {
                        if (findQuoteStart - i11 > charSequence3.length() - 1) {
                            lineTop = i9 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height));
                        } else {
                            lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i9 + textLayoutBlock.padTop;
                        }
                        float f11 = AndroidUtilities.displaySize.y;
                        float f12 = 0.5f;
                        if (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                            f10 = 0.7f;
                        } else {
                            f10 = 0.5f;
                        }
                        if (lineTop > f11 * f10) {
                            float f13 = AndroidUtilities.displaySize.y;
                            if (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                                f12 = 0.7f;
                            }
                            return (int) (lineTop - (f13 * f12));
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            org.telegram.ui.Cells.t1 t1Var4 = this.J0;
            if (t1Var4 != null) {
                t1Var4.f25570se = 0;
                t1Var4.f25585te = null;
            }
        }
        return 0;
    }

    public final void Z0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb.Z0(org.telegram.messenger.MessageObject):void");
    }

    public final void c1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f41422v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f41424w0 == null && this.f41421u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f41418s.megagroup) {
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
            for (int i9 = 0; i9 < 8; i9++) {
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.f6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 23));
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, null, false, null);
        this.I = tnVar;
        zk zkVar = tnVar.h;
        if (zkVar != null) {
            zkVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        zk zkVar2 = tnVar.f32746r;
        if (zkVar2 != null) {
            zkVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        tnVar.f32735g0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, g7.e6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 0);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.tn tnVar2 = this.I;
        TLRPC.Chat chat = this.f41418s;
        tnVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        db dbVar = new db(this, context);
        this.fragmentView = dbVar;
        this.X = dbVar;
        ff.f0 f0Var = new ff.f0(context, new ta(this));
        this.P0 = f0Var;
        this.X.addView(f0Var);
        pg.i iVar = new pg.i(this.X);
        mb mbVar = this.X;
        ig.a aVar = this.f41401e;
        aVar.d = iVar;
        aVar.f11131e = mbVar;
        ig.a aVar2 = this.f41403f;
        aVar2.d = iVar;
        aVar2.f11131e = mbVar;
        ig.a aVar3 = this.f41396b;
        aVar3.d = iVar;
        aVar3.f11131e = mbVar;
        mbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.f6.r0());
        this.actionBar.L(aVar, mg.c.n(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, g7.e6.e(-1, -2, 17));
        this.H.setOnTouchListener(new jh.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.s5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.f6.f23033f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, g7.e6.t(54, 54, 17, 16, 20, 16, -4));
        bg.t tVar = new bg.t(context, 10);
        this.L = tVar;
        tVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        bg.t tVar2 = this.L;
        int i10 = org.telegram.ui.ActionBar.f6.f23097ic;
        tVar2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, g7.e6.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, g7.e6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        eb ebVar = new eb(this, context);
        this.A = ebVar;
        ebVar.setOnItemClickListener(new g(this, 9));
        this.A.setTag(1);
        this.A.setVerticalScrollBarEnabled(true);
        eb ebVar2 = this.A;
        lb lbVar = new lb(this, context);
        this.E = lbVar;
        ebVar2.setAdapter(lbVar);
        this.A.setClipToPadding(false);
        eb ebVar3 = this.A;
        int i11 = AndroidUtilities.statusBarHeight;
        int i12 = this.f41416r;
        ebVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + i12, 0, AndroidUtilities.dp(60.0f) + i12 + AndroidUtilities.navigationBarHeight);
        eb ebVar4 = this.A;
        fb fbVar = new fb(this, this.A, this.resourceProvider);
        this.C0 = fbVar;
        ebVar4.setItemAnimator(fbVar);
        this.C0.Q = true;
        this.A.setLayoutAnimation(null);
        of.y yVar = new of.y(this);
        this.C = yVar;
        yVar.j1(1);
        this.C.l1(true);
        this.A.setLayoutManager(this.C);
        c2.y yVar2 = new c2.y(this.A, this.C);
        this.D = yVar2;
        yVar2.h = new ta(this);
        yVar2.f2260i = this.L0;
        this.X.addView(this.A, g7.e6.c(-1.0f, -1));
        this.A.setOnScrollListener(new l3(this));
        int i13 = this.f41405g0;
        if (i13 != -1) {
            this.C.h1(i13, this.f41406h0);
            this.f41405g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(aVar3);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41423w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f41423w, g7.e6.e(-1, -1, 51));
        View view2 = new View(context);
        this.f41425x = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.s5(this.f41425x, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.f23033f2));
        this.f41423w.addView(this.f41425x, g7.e6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f41427y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f41427y.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f41423w.addView(this.f41427y, g7.e6.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, g7.e6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.b6 b6Var = this.resourceProvider;
        rg.e eVar = new rg.e(context, aVar, mg.c.b(b6Var), b6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        rg.e eVar2 = this.G;
        kg.d c10 = eVar2.f47184n.c(eVar2, null, false);
        c10.n(eVar2.f47185r);
        c10.p(AndroidUtilities.dp(22.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        eVar2.f47186s = c10;
        this.X.addView(this.G, g7.e6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final pb f43417b;

            {
                this.f43417b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        pb pbVar = this.f43417b;
                        if (pbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pbVar, pbVar.f41421u0, pbVar.f41424w0, pbVar.f41418s.megagroup);
                            g0Var.R(pbVar.f41420t0);
                            g0Var.f28618c0 = new ta(pbVar);
                            pbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        pb pbVar2 = this.f43417b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar2.getParentActivity());
                        if (pbVar2.f41418s.megagroup) {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        pbVar2.showDialog(c2Var);
                        return;
                    default:
                        pb pbVar3 = this.f43417b;
                        if (pbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(pbVar3.N.getSearchField());
                            pbVar3.showDialog(org.telegram.ui.Components.y4.p(pbVar3.getParentActivity(), new qa(pbVar3, 0), null).f22713a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, g7.e6.e(-2, -2, 17));
        rg.e eVar3 = this.G;
        eVar3.f47183f.add(this.F);
        this.G.d(false);
        rg.e eVar4 = this.G;
        eVar4.f47180b[4] = new View.OnClickListener(this) {
            public final pb f43417b;

            {
                this.f43417b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        pb pbVar = this.f43417b;
                        if (pbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pbVar, pbVar.f41421u0, pbVar.f41424w0, pbVar.f41418s.megagroup);
                            g0Var.R(pbVar.f41420t0);
                            g0Var.f28618c0 = new ta(pbVar);
                            pbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        pb pbVar2 = this.f43417b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar2.getParentActivity());
                        if (pbVar2.f41418s.megagroup) {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        pbVar2.showDialog(c2Var);
                        return;
                    default:
                        pb pbVar3 = this.f43417b;
                        if (pbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(pbVar3.N.getSearchField());
                            pbVar3.showDialog(org.telegram.ui.Components.y4.p(pbVar3.getParentActivity(), new qa(pbVar3, 0), null).f22713a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41395a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f41395a0.setVisibility(4);
        this.f41395a0.setFocusable(true);
        this.f41395a0.setFocusableInTouchMode(true);
        this.f41395a0.setClickable(true);
        this.f41395a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f41395a0, g7.e6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f41397b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f41397b0.setImageResource(R.drawable.msg_calendar);
        this.f41397b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23359xe, false), PorterDuff.Mode.MULTIPLY));
        this.f41395a0.addView(this.f41397b0, g7.e6.e(48, 48, 53));
        this.f41397b0.setOnClickListener(new View.OnClickListener(this) {
            public final pb f43417b;

            {
                this.f43417b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        pb pbVar = this.f43417b;
                        if (pbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pbVar, pbVar.f41421u0, pbVar.f41424w0, pbVar.f41418s.megagroup);
                            g0Var.R(pbVar.f41420t0);
                            g0Var.f28618c0 = new ta(pbVar);
                            pbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        pb pbVar2 = this.f43417b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar2.getParentActivity());
                        if (pbVar2.f41418s.megagroup) {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        pbVar2.showDialog(c2Var);
                        return;
                    default:
                        pb pbVar3 = this.f43417b;
                        if (pbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(pbVar3.N.getSearchField());
                            pbVar3.showDialog(org.telegram.ui.Components.y4.p(pbVar3.getParentActivity(), new qa(pbVar3, 0), null).f22713a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41399c0 = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23376ye, false));
        this.f41399c0.setTextSize(15);
        this.f41399c0.setTypeface(AndroidUtilities.bold());
        this.f41395a0.addView(this.f41399c0, g7.e6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f41417r0 && this.f41412n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41423w, true, 0.3f, true);
            this.A.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41423w, false, 0.3f, true);
            this.A.setEmptyView(this.H);
        }
        eb ebVar5 = this.A;
        ebVar5.U1 = true;
        ebVar5.V1 = 1;
        UndoView undoView = new UndoView(context);
        this.B = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.B, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        MessageObject messageObject;
        int i9;
        eb ebVar = this.A;
        if (ebVar == null) {
            return;
        }
        int childCount = ebVar.getChildCount();
        int measuredHeight = this.A.getMeasuredHeight();
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.t1 t1Var = null;
        View view = null;
        View view2 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.A.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                u1Var.f25731f = y10;
                u1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                int top = t1Var2.getTop();
                t1Var2.getBottom();
                if (top >= 0) {
                    i9 = 0;
                } else {
                    i9 = -top;
                }
                int measuredHeight2 = t1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i9 + measuredHeight;
                }
                t1Var2.b4(i9, measuredHeight2 - i9, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.A.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = t1Var2.getMessageObject();
                if (this.f41400d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = t1Var2.getPhotoImage();
                    this.f41400d0.setTranslationX(photoImage.getImageX());
                    this.f41400d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f41400d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.V((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (w0Var.I()) {
                    w0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.A.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        t1Var = childAt;
                    }
                    i10 = bottom;
                    view2 = childAt;
                }
                fb fbVar = this.C0;
                if ((fbVar == null || (!fbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
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
        m0 m0Var = this.f41400d0;
        if (m0Var != null) {
            if (!z11) {
                m0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            } else {
                MediaController.getInstance().setCurrentVideoVisible(true);
            }
        }
        if (t1Var != null) {
            if (t1Var instanceof org.telegram.ui.Cells.t1) {
                messageObject = t1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.w0) t1Var).getMessageObject();
            }
            this.M.S(messageObject.messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.t1) && !(view2 instanceof org.telegram.ui.Cells.w0)) {
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
                org.telegram.ui.Cells.w0 w0Var2 = this.M;
                w0Var2.setTranslationY(((-w0Var2.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.M.setTranslationY(0.0f);
            return;
        }
        T0(true);
        this.M.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.t1 t1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i9 == NotificationCenter.emojiLoaded) {
            eb ebVar = this.A;
            if (ebVar != null) {
                ebVar.f1();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f41402e0, this.f41400d0, true);
                int childCount = this.A.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        View childAt = this.A.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt;
                            MessageObject messageObject4 = t1Var4.getMessageObject();
                            if (this.f41400d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = t1Var4.getPhotoImage();
                                this.f41400d0.setTranslationX(photoImage.getImageX());
                                this.f41400d0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f41400d0.invalidate();
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
                if (this.f41400d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f41400d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.V || PipRoundVideoView.B != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            eb ebVar2 = this.A;
            if (ebVar2 != null) {
                int childCount2 = ebVar2.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.A.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject3 = (t1Var3 = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null) {
                        if (!messageObject3.isVoice() && !messageObject3.isMusic()) {
                            if (messageObject3.isRoundVideo()) {
                                t1Var3.e1(null, false);
                                if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                    messageObject3.resetPlayingProgress();
                                    t1Var3.invalidate();
                                }
                            }
                        } else {
                            t1Var3.m4(false, true, false);
                        }
                    }
                }
            }
        } else if (i9 != NotificationCenter.messagePlayingDidReset && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                eb ebVar3 = this.A;
                if (ebVar3 != null) {
                    int childCount3 = ebVar3.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = this.A.getChildAt(i13);
                        if ((childAt3 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = (t1Var2 = (org.telegram.ui.Cells.t1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                t1Var2.q4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i9 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.X.V(org.telegram.ui.ActionBar.f6.r0());
                this.f41425x.invalidate();
                bg.t tVar = this.L;
                if (tVar != null) {
                    tVar.invalidate();
                }
                this.A.f1();
            }
        } else {
            eb ebVar4 = this.A;
            if (ebVar4 != null) {
                int childCount4 = ebVar4.getChildCount();
                for (int i14 = 0; i14 < childCount4; i14++) {
                    View childAt4 = this.A.getChildAt(i14);
                    if ((childAt4 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                t1Var.e1(null, true);
                            }
                        } else {
                            t1Var.m4(false, true, false);
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
        eb ebVar = this.A;
        if (ebVar != null) {
            int childCount = ebVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = this.A.getChildAt(i9);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.s()) {
                            t1Var.setDrawSelectionBackground(false);
                            t1Var.J3(false, true);
                            t1Var.L3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            sa saVar = this.I0;
                            if (saVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(saVar);
                            }
                            sa saVar2 = new sa(this, 0);
                            this.I0 = saVar2;
                            AndroidUtilities.runOnUIThread(saVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f41422v0)) {
                            t1Var.S3(this.f41422v0);
                        } else {
                            t1Var.S3(null);
                        }
                        if (this.A.getScrollState() == 0) {
                            z11 = false;
                        }
                        t1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    w0Var.setMessageObject(w0Var.getMessageObject());
                    if (this.A.getScrollState() == 0) {
                        z11 = false;
                    }
                    w0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32768, null, null, null, null, i9));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.f23321v8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar2, 64, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.f23287t8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar3, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.f6.f22979c2, org.telegram.ui.ActionBar.f6.f22997d2}, org.telegram.ui.ActionBar.f6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23094i8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23111j8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23129k8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23146l8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23164m8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23181n8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23198o8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23159m3, org.telegram.ui.ActionBar.f6.f23226q3}, null, org.telegram.ui.ActionBar.f6.f23252ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23176n3, org.telegram.ui.ActionBar.f6.f23245r3}, null, org.telegram.ui.ActionBar.f6.f23006dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.f6.f23159m3.k();
        int i12 = org.telegram.ui.ActionBar.f6.f23289ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.f23226q3.k(), null, i12));
        Drawable[] k11 = org.telegram.ui.ActionBar.f6.f23194o3.k();
        int i13 = org.telegram.ui.ActionBar.f6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.f23264s3.k(), null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23209p3, org.telegram.ui.ActionBar.f6.f23282t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.f6.f23263s2;
        int i14 = org.telegram.ui.ActionBar.f6.f23097ic;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.f6.f23263s2, null, null, org.telegram.ui.ActionBar.f6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23332w4, org.telegram.ui.ActionBar.f6.f23227q4, org.telegram.ui.ActionBar.f6.f23349x4, org.telegram.ui.ActionBar.f6.v4, org.telegram.ui.ActionBar.f6.f23301u4, org.telegram.ui.ActionBar.f6.C4}, null, org.telegram.ui.ActionBar.f6.f23132kc));
        int i15 = org.telegram.ui.ActionBar.f6.f23150lc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23167mc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.f6.f23061gc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.f6.f23079hc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23366y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23383z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.f23273sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.O3, org.telegram.ui.ActionBar.f6.S3, org.telegram.ui.ActionBar.f6.W3}, null, org.telegram.ui.ActionBar.f6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.P3, org.telegram.ui.ActionBar.f6.T3, org.telegram.ui.ActionBar.f6.X3}, null, org.telegram.ui.ActionBar.f6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.M3, org.telegram.ui.ActionBar.f6.Q3, org.telegram.ui.ActionBar.f6.U3}, null, org.telegram.ui.ActionBar.f6.f23357xc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.N3, org.telegram.ui.ActionBar.f6.R3, org.telegram.ui.ActionBar.f6.V3}, null, org.telegram.ui.ActionBar.f6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22944a4, org.telegram.ui.ActionBar.f6.f22963b4, org.telegram.ui.ActionBar.f6.Z3}, null, org.telegram.ui.ActionBar.f6.f23392zc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23017e4}, null, org.telegram.ui.ActionBar.f6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23035f4}, null, org.telegram.ui.ActionBar.f6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22981c4}, null, org.telegram.ui.ActionBar.f6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22999d4}, null, org.telegram.ui.ActionBar.f6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23053g4}, null, org.telegram.ui.ActionBar.f6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.f6.f23090i4};
        int i16 = org.telegram.ui.ActionBar.f6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i16));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.f6.f23071h4, org.telegram.ui.ActionBar.f6.B4, org.telegram.ui.ActionBar.f6.D4};
        int i17 = org.telegram.ui.ActionBar.f6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.I4, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.J4, null, org.telegram.ui.ActionBar.f6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.G4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.H4, null, org.telegram.ui.ActionBar.f6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.O4}, null, org.telegram.ui.ActionBar.f6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.P4}, null, org.telegram.ui.ActionBar.f6.f23249r7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.Q4}, null, org.telegram.ui.ActionBar.f6.f23233qa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.f22961b2, null, null, org.telegram.ui.ActionBar.f6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23107j4}, null, org.telegram.ui.ActionBar.f6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.J2, null, null, org.telegram.ui.ActionBar.f6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.K2, null, null, org.telegram.ui.ActionBar.f6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.T1, null, null, org.telegram.ui.ActionBar.f6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.Q2, null, null, org.telegram.ui.ActionBar.f6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Rc));
        int i18 = org.telegram.ui.ActionBar.f6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i18));
        int i19 = org.telegram.ui.ActionBar.f6.f22951ab;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22969bb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22988cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23005db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23024eb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22953ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23042fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22971bd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22990cd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23060gb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23007dd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23078hb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23025ed));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23096ib));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23043fd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23114jb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23080hd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23098id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23234qb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23115jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23253rb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23133kd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23272sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23201od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23184nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23217pd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23149lb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23255rd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23290tb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23274sd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23308ub));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23292td));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23310ud));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23338wb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23340wd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23374yb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23358xd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23391zb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23356xb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23375yd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23393zd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.U1, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.W1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23099ie));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23309uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23116je));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23323vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.f6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.f6.f23256re));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.f6.f23275se));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.f6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.f6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23218pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.f6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.f6.f23237qe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.f6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41427y, 2048, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.f6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.f6.De));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.f6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41425x, 536870912, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, 536870912, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        int i20 = org.telegram.ui.ActionBar.f6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i20));
        int i21 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i21));
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f41418s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new na(this, 0)), this.classGuid);
        setBulletinDelegate(new bg.z(10));
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
        this.f41426x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        mb mbVar = this.X;
        if (mbVar != null) {
            org.telegram.ui.Components.q71 q71Var = mbVar.v;
            if (q71Var != null) {
                q71Var.c(false);
            }
            mbVar.B = true;
        }
        UndoView undoView = this.B;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f41407i0 = true;
        this.f41408j0 = true;
        com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.f4156e;
        if (lVar != null && lVar.f4157a) {
            com.google.firebase.messaging.l i9 = com.google.firebase.messaging.l.i();
            if (i9.f4157a) {
                int i10 = b5.B;
                ((r4) i9.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f41404f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        mb mbVar = this.X;
        if (mbVar != null) {
            org.telegram.ui.Components.q71 q71Var = mbVar.v;
            if (q71Var != null) {
                q71Var.c(true);
            }
            mbVar.B = false;
        }
        this.f41407i0 = false;
        O0(false);
        if (this.f41408j0) {
            this.f41408j0 = false;
            lb lbVar = this.E;
            if (lbVar != null) {
                lbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f41426x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f41426x0.lock();
        }
    }
}
