package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
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
import org.telegram.messenger.UserConfig;
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

public final class qb extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static int T0 = 10;
    public static final int[] U0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public fb A;
    public boolean A0;
    public UndoView B;
    public final bb B0;
    public j C;
    public gb C0;
    public c2.x D;
    public final ArrayList D0;
    public mb E;
    public final a0.h E0;
    public TextView F;
    public za F0;
    public sg.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.rn I;
    public ta I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.s1 J0;
    public ImageView K;
    public int K0;
    public cg.q L;
    public final pb L0;
    public org.telegram.ui.Cells.v0 M;
    public long M0;
    public org.telegram.ui.ActionBar.v0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public gf.f0 P0;
    public boolean Q;
    public final ArrayList Q0;
    public AnimatorSet R;
    public final ArrayList R0;
    public boolean S;
    public final RectF S0;
    public final int[] T;
    public boolean U;
    public boolean V;
    public sg.f W;
    public nb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;

    public final og.e f41590a;

    public FrameLayout f41591a0;

    public final jg.a f41592b;

    public ImageView f41593b0;

    public final og.d f41594c;

    public org.telegram.ui.ActionBar.h5 f41595c0;
    public final og.d d;

    public n0 f41596d0;

    public final jg.a f41597e;

    public c5.c f41598e0;

    public final jg.a f41599f;

    public TextureView f41600f0;

    public int f41601g0;
    public final yd.b h;

    public int f41602h0;

    public boolean f41603i0;

    public boolean f41604j0;

    public final a0.h f41605k0;

    public final a0.h f41606l0;
    public final HashMap m0;

    public final jg.e f41607n;

    public final ArrayList f41608n0;

    public final ArrayList f41609o0;

    public final HashSet f41610p0;

    public boolean f41611q0;

    public final int f41612r;

    public boolean f41613r0;

    public final TLRPC.Chat f41614s;

    public boolean f41615s0;

    public ArrayList f41616t0;

    public TLRPC.TL_channelAdminLogEventsFilter f41617u0;
    public final ArrayList v;

    public String f41618v0;

    public FrameLayout f41619w;

    public a0.h f41620w0;

    public View f41621x;

    public final AnimationNotificationsLocker f41622x0;

    public RadialProgressView f41623y;

    public final HashMap f41624y0;

    public HashMap f41625z0;

    public qb(TLRPC.Chat chat) {
        super(null);
        yd.b bVar = new yd.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.T = new int[]{2};
        this.f41601g0 = -1;
        this.f41602h0 = 0;
        this.f41603i0 = true;
        this.f41604j0 = false;
        this.f41605k0 = new a0.h();
        this.f41606l0 = new a0.h();
        this.m0 = new HashMap();
        this.f41608n0 = new ArrayList();
        this.f41609o0 = new ArrayList();
        this.f41610p0 = new HashSet();
        this.f41617u0 = null;
        this.f41618v0 = "";
        this.f41622x0 = new AnimationNotificationsLocker(U0);
        this.f41624y0 = new HashMap();
        this.B0 = new bb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new pb(this);
        this.N0 = -1;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new RectF();
        og.e eVar = new og.e();
        this.f41590a = eVar;
        jg.a aVar = new jg.a(eVar);
        this.f41592b = aVar;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.f41607n = null;
            this.f41612r = 0;
            this.f41594c = null;
            this.d = null;
            this.f41597e = new jg.a(eVar);
            this.f41599f = new jg.a(eVar);
        } else {
            jg.e eVar2 = new jg.e(false);
            this.f41607n = eVar2;
            og.d dVar = new og.d(eVar);
            this.d = dVar;
            dVar.v = new ta(this, 3);
            dVar.d = eVar2;
            dVar.f19453e = -3;
            dVar.f19454f = eVar;
            jg.a aVar2 = new jg.a(dVar);
            this.f41599f = aVar2;
            aVar2.f12944f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                og.d dVar2 = new og.d(eVar);
                this.f41594c = dVar2;
                dVar2.v = new ta(this, 3);
                dVar2.d = eVar2;
                dVar2.f19453e = -2;
                dVar2.f19454f = eVar;
                jg.a aVar3 = new jg.a(dVar2);
                this.f41597e = aVar3;
                aVar3.f12944f = LiteMode.isEnabled(262144);
                this.f41612r = 0;
            } else {
                this.f41594c = null;
                this.f41597e = aVar2;
                this.f41612r = AndroidUtilities.dp(48.0f);
            }
        }
        aVar.f12942c = bVar;
        this.f41597e.f12942c = bVar;
        this.f41599f.f12942c = bVar;
        this.f41614s = chat;
    }

    public static void A0(qb qbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap map) {
        MessagesController messagesController = qbVar.getMessagesController();
        TLRPC.Chat chat = qbVar.f41614s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f22380id);
        org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(qbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, map, qbVar, chatFull.f22381id, false, ChatObject.isChannel(chat));
        f60Var.f28279f0 = new cb(qbVar);
        f60Var.show();
    }

    public static void K0(qb qbVar) {
        if (qbVar.A == null || qbVar.f41608n0.isEmpty()) {
            return;
        }
        qbVar.C.h1(qbVar.f41609o0.size() - 1, (-100000) - qbVar.A.getPaddingTop());
    }

    public static h01 S0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.cq cqVar : (org.telegram.ui.Components.cq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.cq.class)) {
            if (cqVar != null) {
                Drawable drawable = cqVar.drawable;
                if (drawable instanceof h01) {
                    return (h01) drawable;
                }
            }
        }
        return null;
    }

    public static void U(qb qbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        MessageObject messageObject2;
        a0.h hVar = qbVar.f41605k0;
        int i10 = 0;
        qbVar.C0.N = false;
        qbVar.X0(false);
        MessagesController.getInstance(qbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(qbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = qbVar.f41608n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f22412id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if (!(tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) || (tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                        qbVar.O = Math.min(qbVar.O, tL_channelAdminLogEvent.f22412id);
                        messageObject2 = new MessageObject(qbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) qbVar.m0, qbVar.f41614s, qbVar.T, false);
                        if (messageObject2.contentType >= 0) {
                            hVar.k(messageObject2, tL_channelAdminLogEvent.f22412id);
                        }
                        z10 = true;
                    }
                } else {
                    qbVar.O = Math.min(qbVar.O, tL_channelAdminLogEvent.f22412id);
                    messageObject2 = new MessageObject(qbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) qbVar.m0, qbVar.f41614s, qbVar.T, false);
                    if (messageObject2.contentType >= 0) {
                        hVar.k(messageObject2, tL_channelAdminLogEvent.f22412id);
                    }
                    z10 = true;
                }
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                qbVar.f41606l0.k(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            messageObject = null;
                            break;
                        }
                        if (size != i12) {
                            messageObject = (MessageObject) arrayList.get(i12);
                            if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i12++;
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList2.add(messageObject3);
            }
        }
        if (!arrayList2.isEmpty()) {
            MediaDataController.getInstance(qbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -qbVar.f41614s.f22380id, 0, 0L, new ta(qbVar, 1), qbVar.getClassGuid(), null);
        }
        qbVar.R0();
        qbVar.f41613r0 = false;
        if (!z10) {
            qbVar.f41611q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(qbVar.f41619w, false, 0.3f, true);
        qbVar.A.setEmptyView(qbVar.H);
        mb mbVar = qbVar.E;
        if (mbVar != null) {
            mbVar.l();
        }
        org.telegram.ui.ActionBar.v0 v0Var = qbVar.N;
        if (v0Var != null) {
            if (qbVar.f41609o0.isEmpty() && TextUtils.isEmpty(qbVar.f41618v0)) {
                i10 = 8;
            }
            v0Var.setVisibility(i10);
        }
    }

    public static void V(qb qbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        int y10;
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || qbVar.getParentActivity() == null) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, qbVar.getParentActivity(), qbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        qbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(qbVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            if (arrayList4.get(i10) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(qbVar.getParentActivity(), qbVar.getResourceProvider()), h7.z5.n(-1, 8));
            } else {
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, qbVar.getParentActivity(), qbVar.getResourceProvider(), i10 == 0, i10 == size + (-1));
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                    f1Var.c(qbVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7), qbVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                }
                Integer num = (Integer) arrayList4.get(i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                f1Var.setOnClickListener(new jh.l5(qbVar, i10, arrayList4, num, 1));
            }
            i10++;
            arrayList4 = arrayList;
        }
        ya yaVar = new ya(0, qbVar.X.getContext(), qbVar);
        yaVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        yaVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        za zaVar = new za(qbVar, yaVar);
        qbVar.F0 = zaVar;
        zaVar.f23684e = true;
        zaVar.f23683c = 220;
        zaVar.setOutsideTouchable(true);
        qbVar.F0.setClippingEnabled(true);
        qbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
        qbVar.F0.setFocusable(true);
        yaVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        qbVar.F0.setInputMethodMode(2);
        qbVar.F0.setSoftInputMode(48);
        qbVar.F0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f10)) - yaVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (qbVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - yaVar.getMeasuredWidth()) {
            left = (qbVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - yaVar.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            qbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = qbVar.X.getHeight();
        int iDp = AndroidUtilities.dp(48.0f) + yaVar.getMeasuredHeight();
        int iR = qbVar.X.R();
        if (iR > AndroidUtilities.dp(20.0f)) {
            height += iR;
        }
        if (iDp < height) {
            y10 = (int) (qbVar.A.getY() + view.getTop() + f11);
            if ((iDp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                y10 += AndroidUtilities.dp(240.0f) - iDp;
            }
            if (y10 < qbVar.A.getY() + AndroidUtilities.dp(24.0f)) {
                y10 = (int) (qbVar.A.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i11 = height - iDp;
                if (y10 > i11 - AndroidUtilities.dp(8.0f)) {
                    y10 = i11 - AndroidUtilities.dp(8.0f);
                }
            }
        } else {
            y10 = qbVar.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
        }
        yaVar.setMaxHeight(height - y10);
        qbVar.F0.showAtLocation(qbVar.A, 51, left, y10);
        qbVar.F0.b();
    }

    public static void W(qb qbVar, int i10, ArrayList arrayList, Integer num) {
        TLRPC.Chat chat;
        File file;
        TLRPC.User user;
        if (qbVar.Y == null || i10 >= arrayList.size()) {
            return;
        }
        int iIntValue = num.intValue();
        TLRPC.Chat chat2 = qbVar.f41614s;
        za zaVar = qbVar.F0;
        if (zaVar != null) {
            zaVar.dismiss();
        }
        MessageObject messageObject = qbVar.Y;
        if (messageObject == null) {
            return;
        }
        if (iIntValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long fromChatId = messageObject.getFromChatId();
            if (0 != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(qbVar.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user2 != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user2.first_name, user2.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(qbVar.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(messageObject.messageText)) {
                spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            } else {
                spannableStringBuilder.append(messageObject.messageText);
            }
            AndroidUtilities.addToClipboard(spannableStringBuilder);
            org.telegram.messenger.rl.m(R.string.MessageCopied, org.telegram.ui.Components.mc.a0(qbVar));
        } else if (iIntValue == 4) {
            String string = messageObject.messageOwner.attachPath;
            if (string != null && string.length() > 0 && !com.google.android.recaptcha.internal.a.v(string)) {
                string = null;
            }
            if (string == null || string.length() == 0) {
                string = qbVar.getFileLoader().getPathToMessage(qbVar.Y.messageOwner).toString();
            }
            int i11 = qbVar.Y.type;
            if (i11 == 3 || i11 == 1) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && qbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    qbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    qbVar.Y = null;
                    qbVar.Z = null;
                    return;
                }
                MediaController.saveFile(string, qbVar.getParentActivity(), qbVar.Y.type == 3 ? 1 : 0, null, null);
            }
        } else if (iIntValue == 5) {
            String str = messageObject.messageOwner.attachPath;
            if (str == null || str.length() == 0) {
                file = null;
            } else {
                file = new File(qbVar.Y.messageOwner.attachPath);
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                File pathToMessage = qbVar.getFileLoader().getPathToMessage(qbVar.Y.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    j jVar = qbVar.C;
                    if (jVar != null) {
                        if (jVar.N0() < qbVar.C.B() - 1) {
                            int iL0 = qbVar.C.L0();
                            qbVar.f41601g0 = iL0;
                            org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) qbVar.A.K(iL0);
                            if (lk0Var != null) {
                                qbVar.f41602h0 = lk0Var.f5789a.getTop();
                            } else {
                                qbVar.f41601g0 = -1;
                            }
                        } else {
                            qbVar.f41601g0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.f6 f6VarU = org.telegram.ui.ActionBar.g6.u(file, qbVar.Y.getDocumentName(), null, true);
                    if (f6VarU != null) {
                        qbVar.presentFragment(new nc1(f6VarU));
                    } else {
                        qbVar.f41601g0 = -1;
                        if (qbVar.getParentActivity() == null) {
                            qbVar.Y = null;
                            qbVar.Z = null;
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qbVar.getParentActivity());
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.IncorrectTheme);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            qbVar.showDialog(alertDialog$Builder.f22702a);
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, qbVar.currentAccount)) {
                    qbVar.presentFragment(new LanguageSelectActivity());
                } else if (qbVar.getParentActivity() == null) {
                    qbVar.Y = null;
                    qbVar.Z = null;
                    return;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qbVar.getParentActivity());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.IncorrectLocalization);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    qbVar.showDialog(alertDialog$Builder2.f22702a);
                }
            }
        } else if (iIntValue == 6) {
            String string2 = messageObject.messageOwner.attachPath;
            if (string2 != null && string2.length() > 0 && !com.google.android.recaptcha.internal.a.v(string2)) {
                string2 = null;
            }
            if (string2 == null || string2.length() == 0) {
                string2 = qbVar.getFileLoader().getPathToMessage(qbVar.Y.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(qbVar.Y.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(qbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(string2)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(string2)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(string2)));
            }
            try {
                qbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (iIntValue != 7) {
            switch (iIntValue) {
                case 9:
                    qbVar.showDialog(new org.telegram.ui.Components.ex0(qbVar.getParentActivity(), qbVar, qbVar.Y.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 23 && ((i13 <= 28 || BuildVars.NO_SCOPED_STORAGE) && qbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        qbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        qbVar.Y = null;
                        qbVar.Z = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(qbVar.Y.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = qbVar.Y.getFileName();
                    }
                    String string3 = qbVar.Y.messageOwner.attachPath;
                    if (string3 != null && string3.length() > 0 && !com.google.android.recaptcha.internal.a.v(string3)) {
                        string3 = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        string3 = qbVar.getFileLoader().getPathToMessage(qbVar.Y.messageOwner).toString();
                    }
                    MediaController.saveFile(string3, qbVar.getParentActivity(), qbVar.Y.isMusic() ? 3 : 2, documentFileName, qbVar.Y.getDocument() != null ? qbVar.Y.getDocument().mime_type : "");
                    break;
                    break;
                case 11:
                    MessagesController.getInstance(qbVar.currentAccount).saveGif(qbVar.Y, messageObject.getDocument());
                    break;
                default:
                    switch (iIntValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", qbVar.Y.messageOwner.media.user_id);
                            bundle.putString("phone", qbVar.Y.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            qbVar.presentFragment(new js(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            org.telegram.messenger.rl.m(R.string.PhoneCopied, org.telegram.ui.Components.mc.a0(qbVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + qbVar.Y.messageOwner.media.phone_number));
                                intent2.addFlags(268435456);
                                qbVar.getParentActivity().startActivityForResult(intent2, 500);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            break;
                        default:
                            switch (iIntValue) {
                                case 33:
                                    if (qbVar.Z != null) {
                                        TLRPC.User user3 = qbVar.getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(qbVar.Z.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = qbVar.Z;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = qbVar.Z.banned_rights;
                                        tL_chatBannedRights.send_plain = true;
                                        tL_chatBannedRights.send_messages = true;
                                        tL_chatBannedRights.send_media = true;
                                        tL_chatBannedRights.send_stickers = true;
                                        tL_chatBannedRights.send_gifs = true;
                                        tL_chatBannedRights.send_games = true;
                                        tL_chatBannedRights.send_inline = true;
                                        tL_chatBannedRights.send_polls = true;
                                        tL_chatBannedRights.send_photos = true;
                                        tL_chatBannedRights.send_videos = true;
                                        tL_chatBannedRights.send_roundvideos = true;
                                        tL_chatBannedRights.send_audios = true;
                                        tL_chatBannedRights.send_voices = true;
                                        tL_chatBannedRights.send_docs = true;
                                        tL_chatBannedRights.send_reactions = true;
                                        qbVar.getMessagesController().setParticipantBannedRole(chat2.f22380id, user3, null, qbVar.Z.banned_rights, true, qbVar.getFragmentForAlert(1), new org.telegram.messenger.voip.l0(22, qbVar, user3));
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = qbVar.getMessagesController().getInputChannel(chat2.f22380id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = qbVar.Y.getRealId();
                                    qbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new oa(qbVar, 3));
                                    break;
                                case 35:
                                    qbVar.getMessagesController().deleteParticipantFromChat(chat2.f22380id, qbVar.getMessagesController().getInputPeer(qbVar.Y.messageOwner.from_id), false, false, (Runnable) new ta(qbVar, 2));
                                    if ((qbVar.Y.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.mc.a(qbVar) && (user = qbVar.getMessagesController().getUser(Long.valueOf(qbVar.Y.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.mc.D(qbVar, user, chat2.title).j();
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            String string4 = messageObject.messageOwner.attachPath;
            if (string4 != null && string4.length() > 0 && !com.google.android.recaptcha.internal.a.v(string4)) {
                string4 = null;
            }
            if (string4 == null || string4.length() == 0) {
                string4 = qbVar.getFileLoader().getPathToMessage(qbVar.Y.messageOwner).toString();
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 23 && ((i14 <= 28 || BuildVars.NO_SCOPED_STORAGE) && qbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                qbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                qbVar.Y = null;
                qbVar.Z = null;
                return;
            }
            MediaController.saveFile(string4, qbVar.getParentActivity(), 0, null, null);
        }
        qbVar.Y = null;
        qbVar.Z = null;
    }

    public static void X(qb qbVar, int i10) {
        int iC;
        RectF rectF;
        og.d dVar = qbVar.f41594c;
        og.d dVar2 = qbVar.d;
        ArrayList arrayList = qbVar.R0;
        jg.e eVar = qbVar.f41607n;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || eVar == null) {
            return;
        }
        if (h7.a8.a(i10, 2)) {
            ArrayList arrayList2 = qbVar.Q0;
            if (i11 >= 29) {
                if (dVar2 != null) {
                    if (arrayList2.isEmpty()) {
                        rectF = new RectF();
                        arrayList2.add(rectF);
                    } else {
                        rectF = (RectF) arrayList2.get(0);
                    }
                    rectF.set(0.0f, 0.0f, qbVar.X.getMeasuredWidth(), qbVar.A.getY() + qbVar.A.getPaddingTop());
                    rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                    iC = dVar2.c(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                } else {
                    iC = 0;
                }
                if (dVar != null) {
                    iC += dVar.c(arrayList2, iC, AndroidUtilities.dp(8.0f));
                }
            } else {
                iC = 0;
            }
            int iA = gf.m0.a(arrayList2, iC, arrayList);
            int measuredWidth = qbVar.X.getMeasuredWidth();
            for (int i12 = 0; i12 < iA; i12++) {
                RectF rectF2 = (RectF) arrayList.get(i12);
                float f10 = measuredWidth;
                rectF2.left = h7.n.a(rectF2.left, 0.0f, f10);
                rectF2.top = Math.max(qbVar.A.getY(), rectF2.top);
                rectF2.right = h7.n.a(rectF2.right, 0.0f, f10);
                rectF2.bottom = Math.min(qbVar.A.getY() + qbVar.A.getMeasuredHeight(), rectF2.bottom);
            }
            eVar.g(iA, arrayList);
        }
        nb nbVar = qbVar.X;
        Objects.requireNonNull(nbVar);
        if (eVar.e(new sa(nbVar, 0), qbVar.X.getWidth(), qbVar.X.getHeight())) {
            if (dVar != null) {
                dVar.d();
            }
            if (dVar2 != null) {
                dVar2.d();
            }
            org.telegram.ui.ActionBar.k kVar = qbVar.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
            qbVar.X.invalidate();
            Iterator it = qbVar.h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public static void Y(qb qbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        MessageObject messageObject;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = qbVar.f41605k0;
        qbVar.f41615s0 = false;
        qbVar.C0.N = false;
        qbVar.X0(false);
        MessagesController.getInstance(qbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(qbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f22412id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if (!(tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) || (tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                        qbVar.O = Math.min(qbVar.O, tL_channelAdminLogEvent2.f22412id);
                        messageObject = new MessageObject(qbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) map, qbVar.f41614s, qbVar.T, false);
                        if (messageObject.contentType < 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f22412id))) {
                            qbVar.f41608n0.add(0, messageObject);
                            hVar.k(messageObject, tL_channelAdminLogEvent2.f22412id);
                            z10 = true;
                        }
                    }
                } else {
                    qbVar.O = Math.min(qbVar.O, tL_channelAdminLogEvent2.f22412id);
                    messageObject = new MessageObject(qbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) map, qbVar.f41614s, qbVar.T, false);
                    if (messageObject.contentType < 0) {
                    }
                }
            }
        }
        if (qbVar.E == null || !z10) {
            return;
        }
        qbVar.R0();
        qbVar.E.l();
    }

    public static void Z(qb qbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = qbVar.f41614s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            qbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            qbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            qbVar.f41616t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = qbVar.getMessagesController().getChatFull(chat.f22380id)) != null && chatFull.antispam) {
                ab abVar = new ab();
                abVar.user_id = qbVar.getMessagesController().telegramAntispamUserId;
                abVar.peer = qbVar.getMessagesController().getPeer(abVar.user_id);
                long j10 = qbVar.getMessagesController().telegramAntispamUserId;
                if (qbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f22521id.add(tL_inputUser);
                    ConnectionsManager.getInstance(qbVar.currentAccount).sendRequest(tL_users_getUsers, new oa(qbVar, 2));
                }
                qbVar.f41616t0.add(0, abVar);
            }
            Dialog dialog = qbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).S(qbVar.f41616t0);
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
        int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (iCharSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.recaptcha.internal.a.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.z.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.z.f(AndroidUtilities.dp(8.0f)), iCharSequenceIndexOf + 1, iCharSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static void p0(qb qbVar, Bundle bundle, long j10) {
        TLRPC.Chat chat = qbVar.f41614s;
        if (chat.megagroup && qbVar.f41616t0 != null && ChatObject.canBlockUsers(chat)) {
            for (int i10 = 0; i10 < qbVar.f41616t0.size(); i10++) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) qbVar.f41616t0.get(i10);
                if (MessageObject.getPeerId(channelParticipant.peer) == j10) {
                    if (channelParticipant.can_edit) {
                        break;
                    } else {
                        return;
                    }
                }
            }
            bundle.putLong("ban_chat_id", chat.f22380id);
        }
    }

    public static void v0(qb qbVar, MessageObject messageObject) {
        if (qbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.P = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.P = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        qbVar.showDialog(b2Var);
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        int i10;
        MessageObject messageObject;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f41609o0;
            i10 = 1;
            if (i11 >= arrayList2.size()) {
                messageObject = null;
                break;
            }
            messageObject = (MessageObject) arrayList2.get(i11);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j10) {
                break;
            }
            i11++;
        }
        if (messageObject == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f41614s.f22380id;
            tL_message.f22401id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        messageObject.contentType = 1;
        if (!z11 || arrayList.size() <= 1) {
            messageObject.actionDeleteGroupEventId = -1L;
        } else {
            messageObject.actionDeleteGroupEventId = j10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.EL.stream(arrayList).map(new l8(i10)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                qb qbVar = this.f43394a;
                qbVar.getClass();
                if (l10.longValue() >= 0) {
                    return UserObject.getForcedFirstName(qbVar.getMessagesController().getUser(l10));
                }
                TLRPC.Chat chat = qbVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new gh.g1(i10)).limit(4L).toArray())), "un1", user));
        if (z11 && arrayList.size() > 1) {
            h01 h01VarS0 = S0(messageObject.messageText);
            if (h01VarS0 == null) {
                h01VarS0 = new h01(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                Typeface typefaceBold = AndroidUtilities.bold();
                org.telegram.ui.Components.i6 i6Var = h01VarS0.f38652a;
                i6Var.u(typefaceBold);
                i6Var.t(AndroidUtilities.dp(10.0f));
                if (h01VarS0.f38654c != -1) {
                    h01VarS0.f38654c = -1;
                    h01VarS0.invalidateSelf();
                }
                h01VarS0.a(503316480);
            } else {
                h01VarS0.f38652a.q(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false, true);
            }
            h01VarS0.setBounds(0, 0, h01VarS0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(0, h01VarS0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) i0.a.i(1, arrayList) : null;
        if (messageObject2 != null) {
            long j12 = messageObject2.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject2.eventId;
                int i12 = T0;
                T0 = i12 + 1;
                hVar.k(Integer.valueOf(i12), j13);
            }
            messageObject.stableId = ((Integer) hVar.f(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void O0(boolean z10) {
        j jVar = this.C;
        if (jVar == null || this.f41603i0) {
            return;
        }
        int iL0 = jVar.L0();
        if ((iL0 == -1 ? 0 : Math.abs(this.C.N0() - iL0) + 1) > 0) {
            this.E.getClass();
            if (iL0 > (z10 ? 4 : 1) || this.f41613r0 || this.f41611q0) {
                return;
            }
            V0(false);
        }
    }

    public final boolean P0(View view, float f10, float f11) {
        MessageObject messageObject;
        Integer num;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.Chat chat;
        boolean z10;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        Integer num2;
        TLRPC.Chat chat2;
        TLRPC.User user;
        MessageObject messageObject2;
        TLRPC.Chat chat3;
        boolean z11;
        Integer num3;
        long j10;
        TLRPC.User user2;
        Integer num4;
        TLRPC.MessageMedia messageMedia;
        pa paVar;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2;
        TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.InputStickerSet inputStickerSet2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4;
        byte b10 = 10;
        if (view instanceof org.telegram.ui.Cells.s1) {
            messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject();
        } else {
            messageObject = view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject() : null;
        }
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 6) {
                num = 10;
            } else {
                if (i10 == 10 || i10 == 11 || i10 == 16) {
                    num = 10;
                    if (messageObject.getId() != 0) {
                        b10 = 1;
                    }
                } else if (messageObject.isVoice()) {
                    num = 10;
                    b10 = 2;
                } else if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                    TLRPC.InputStickerSet inputStickerSet3 = messageObject.getInputStickerSet();
                    if (inputStickerSet3 instanceof TLRPC.TL_inputStickerSetID) {
                        num = 10;
                        if (MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet3.f22400id)) {
                            b10 = 2;
                        } else {
                            b10 = 7;
                        }
                    } else {
                        num = 10;
                        if (!(inputStickerSet3 instanceof TLRPC.TL_inputStickerSetShortName) || MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet3.short_name)) {
                            b10 = 2;
                        } else {
                            b10 = 7;
                        }
                    }
                } else if ((!messageObject.isRoundVideo() || (messageObject.isRoundVideo() && BuildVars.DEBUG_VERSION)) && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                    String str2 = messageObject.messageOwner.attachPath;
                    boolean z12 = (str2 == null || str2.length() == 0 || !new File(messageObject.messageOwner.attachPath).exists()) ? false : true;
                    if (!z12 && getFileLoader().getPathToMessage(messageObject.messageOwner).exists()) {
                        z12 = true;
                    }
                    if (!z12) {
                        num = 10;
                        b10 = 2;
                    } else if (messageObject.getDocument() == null || (str = messageObject.getDocument().mime_type) == null) {
                        num = 10;
                        b10 = 4;
                    } else if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                        num = 10;
                    } else if (str.endsWith("/xml")) {
                        num = 10;
                        b10 = 5;
                    } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                        num = 10;
                        b10 = 6;
                    } else {
                        num = 10;
                        b10 = 4;
                    }
                } else if (messageObject.type == 12) {
                    num = 10;
                    b10 = 8;
                } else if (messageObject.isMediaEmpty()) {
                    num = 10;
                    b10 = 3;
                } else {
                    num = 10;
                    b10 = 2;
                }
                this.Y = messageObject;
                if (getParentActivity() != null) {
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    chat = this.f41614s;
                    if (chat != null || (tL_channelAdminLogEvent4 = messageObject.currentEvent) == null) {
                        z10 = true;
                    } else {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                        z10 = true;
                        if (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                            TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction3;
                            if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                                org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat.f22380id), null, this, chat.f22380id, false, ChatObject.isChannelAndNotMegaGroup(chat));
                                f60Var.f28280g0 = false;
                                f60Var.show();
                                return true;
                            }
                        }
                    }
                    tL_channelAdminLogEvent = messageObject.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        if (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                            num2 = 4;
                            chat2 = chat;
                            if (tL_channelAdminLogEvent.user_id != getMessagesController().telegramAntispamUserId) {
                            }
                            if (view instanceof org.telegram.ui.Cells.v0) {
                                SpannableString spannableString = new SpannableString(">");
                                Drawable drawableMutate = getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                                drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Gi), PorterDuff.Mode.MULTIPLY));
                                drawableMutate.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                                spannableString.setSpan(new ImageSpan(drawableMutate, 2), 0, spannableString.length(), 33);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EventLogFilterGroupInfo)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) LocaleController.getString(R.string.ChannelAdministrators));
                                spannableStringBuilder.setSpan(new ag.x0(this, 4), 0, spannableStringBuilder.length(), 33);
                                org.telegram.ui.Components.ec ecVarM = org.telegram.ui.Components.mc.a0(this).M(LocaleController.getString(R.string.ChannelAntiSpamUser), AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.ChannelAntiSpamInfo2), spannableStringBuilder), R.raw.msg_antispam);
                                ecVarM.f28020j = 5000;
                                ecVarM.j();
                                return z10;
                            }
                            arrayList.add(LocaleController.getString(R.string.ReportFalsePositive));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_notspam, 34, arrayList3, arrayList2);
                            user = null;
                            arrayList.add(null);
                            arrayList3.add(null);
                            arrayList2.add(null);
                            messageObject2 = this.Y;
                            if (messageObject2.type != 0 || messageObject2.caption != null) {
                                arrayList.add(LocaleController.getString(R.string.Copy));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                            }
                            if (b10 == 1) {
                                tL_channelAdminLogEvent3 = this.Y.currentEvent;
                                if (tL_channelAdminLogEvent3 != null) {
                                    channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                                    if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                        tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                                        inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                        if (inputStickerSet != null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                            inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                        }
                                        inputStickerSet2 = inputStickerSet;
                                        if (inputStickerSet2 != null) {
                                            showDialog(new org.telegram.ui.Components.ex0(getParentActivity(), this, inputStickerSet2, null, null, null));
                                            return true;
                                        }
                                        chat3 = chat2;
                                        z11 = false;
                                    }
                                    paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                                    if (ChatObject.canBlockUsers(chat3) && (tL_channelAdminLogEvent2 = messageObject.currentEvent) != null) {
                                        channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                                        if (((channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user3 = getMessagesController().getUser(Long.valueOf(this.Y.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user3)) {
                                            getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                            z11 = true;
                                        }
                                    }
                                    if (!z11) {
                                        paVar = paVar;
                                        return true;
                                    }
                                    paVar = paVar;
                                    paVar.run();
                                    return true;
                                }
                                if (tL_channelAdminLogEvent3 == null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                                    chat3 = chat2;
                                    z11 = false;
                                    c70 c70Var = new c70(chat3.f22380id, 0);
                                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat3.f22380id);
                                    if (chatFull != null) {
                                        c70Var.e0(chatFull);
                                        presentFragment(c70Var);
                                    }
                                } else {
                                    chat3 = chat2;
                                    z11 = false;
                                    if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat3, 13)) {
                                        org.telegram.ui.Components.qp qpVar = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                        qpVar.v = new xa(this);
                                        showDialog(qpVar);
                                    }
                                }
                            } else {
                                chat3 = chat2;
                                z11 = false;
                                if (b10 == 3) {
                                    messageMedia = this.Y.messageOwner.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                                        arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                    }
                                } else if (b10 == 4) {
                                    num3 = num;
                                    if (b10 == 5) {
                                        arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_language, arrayList3, arrayList2, 5);
                                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                    } else if (b10 == 10) {
                                        arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_theme, arrayList3, arrayList2, 5);
                                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                    } else if (b10 == 6) {
                                        arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                    } else if (b10 == 7) {
                                        if (this.Y.isMask()) {
                                            arrayList.add(LocaleController.getString(R.string.AddToMasks));
                                        } else {
                                            arrayList.add(LocaleController.getString(R.string.AddToStickers));
                                        }
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                                    } else if (b10 == 8) {
                                        j10 = this.Y.messageOwner.media.user_id;
                                        if (j10 != 0) {
                                            user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                                        } else {
                                            user2 = user;
                                        }
                                        if (user2 != null && user2.f22527id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user2.f22527id)) == null) {
                                            arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                                            org.telegram.ui.Cells.pa.n(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                                        }
                                        if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                            arrayList.add(LocaleController.getString(R.string.Copy));
                                            org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                                            arrayList.add(LocaleController.getString(R.string.Call));
                                            org.telegram.ui.Cells.pa.n(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                                        }
                                    }
                                } else if (this.Y.isVideo()) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else if (this.Y.isMusic()) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else {
                                    num4 = num;
                                    if (this.Y.getDocument() != null) {
                                        if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                            arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                            org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                        }
                                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num4);
                                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                                    }
                                }
                            }
                            paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                            if (ChatObject.canBlockUsers(chat3)) {
                                channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                    getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                    z11 = true;
                                } else {
                                    getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                paVar = paVar;
                                return true;
                            }
                            paVar = paVar;
                            paVar.run();
                            return true;
                        }
                        num2 = 4;
                        chat2 = chat;
                        if (messageObject.currentEvent.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) {
                            if (view instanceof org.telegram.ui.Cells.v0) {
                                SpannableString spannableString2 = new SpannableString(">");
                                Drawable drawableMutate2 = getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                                drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Gi), PorterDuff.Mode.MULTIPLY));
                                drawableMutate2.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                                spannableString2.setSpan(new ImageSpan(drawableMutate2, 2), 0, spannableString2.length(), 33);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.EventLogFilterGroupInfo)).append((CharSequence) "\u2009").append((CharSequence) spannableString2).append((CharSequence) "\u2009").append((CharSequence) LocaleController.getString(R.string.ChannelAdministrators));
                                spannableStringBuilder2.setSpan(new ag.x0(this, 4), 0, spannableStringBuilder2.length(), 33);
                                org.telegram.ui.Components.ec ecVarM2 = org.telegram.ui.Components.mc.a0(this).M(LocaleController.getString(R.string.ChannelAntiSpamUser), AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.ChannelAntiSpamInfo2), spannableStringBuilder2), R.raw.msg_antispam);
                                ecVarM2.f28020j = 5000;
                                ecVarM2.j();
                                return z10;
                            }
                            arrayList.add(LocaleController.getString(R.string.ReportFalsePositive));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_notspam, 34, arrayList3, arrayList2);
                            user = null;
                            arrayList.add(null);
                            arrayList3.add(null);
                            arrayList2.add(null);
                        }
                        messageObject2 = this.Y;
                        if (messageObject2.type != 0) {
                            arrayList.add(LocaleController.getString(R.string.Copy));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                        } else {
                            arrayList.add(LocaleController.getString(R.string.Copy));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                        }
                        if (b10 == 1) {
                            tL_channelAdminLogEvent3 = this.Y.currentEvent;
                            if (tL_channelAdminLogEvent3 != null) {
                                channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                                if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                    tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                    if (inputStickerSet != null) {
                                        inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                    } else {
                                        inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                    }
                                    inputStickerSet2 = inputStickerSet;
                                    if (inputStickerSet2 != null) {
                                        showDialog(new org.telegram.ui.Components.ex0(getParentActivity(), this, inputStickerSet2, null, null, null));
                                        return true;
                                    }
                                    chat3 = chat2;
                                    z11 = false;
                                }
                                paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                                if (ChatObject.canBlockUsers(chat3)) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                        getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                        z11 = true;
                                    } else {
                                        getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    paVar = paVar;
                                    return true;
                                }
                                paVar = paVar;
                                paVar.run();
                                return true;
                            }
                            if (tL_channelAdminLogEvent3 == null) {
                                chat3 = chat2;
                                z11 = false;
                                if (tL_channelAdminLogEvent3 != null) {
                                    org.telegram.ui.Components.qp qpVar2 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                    qpVar2.v = new xa(this);
                                    showDialog(qpVar2);
                                }
                            } else {
                                chat3 = chat2;
                                z11 = false;
                                if (tL_channelAdminLogEvent3 != null) {
                                    org.telegram.ui.Components.qp qpVar3 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                    qpVar3.v = new xa(this);
                                    showDialog(qpVar3);
                                }
                            }
                        } else {
                            chat3 = chat2;
                            z11 = false;
                            if (b10 == 3) {
                                messageMedia = this.Y.messageOwner.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                }
                            } else if (b10 == 4) {
                                num3 = num;
                                if (b10 == 5) {
                                    arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_language, arrayList3, arrayList2, 5);
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else if (b10 == 10) {
                                    arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_theme, arrayList3, arrayList2, 5);
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else if (b10 == 6) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else if (b10 == 7) {
                                    if (this.Y.isMask()) {
                                        arrayList.add(LocaleController.getString(R.string.AddToMasks));
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.AddToStickers));
                                    }
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                                } else if (b10 == 8) {
                                    j10 = this.Y.messageOwner.media.user_id;
                                    if (j10 != 0) {
                                        user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                                    } else {
                                        user2 = user;
                                    }
                                    if (user2 != null) {
                                        arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                                    }
                                    if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                        arrayList.add(LocaleController.getString(R.string.Copy));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                                        arrayList.add(LocaleController.getString(R.string.Call));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                                    }
                                }
                            } else if (this.Y.isVideo()) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (this.Y.isMusic()) {
                                arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else {
                                num4 = num;
                                if (this.Y.getDocument() != null) {
                                    if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                        arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                    }
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num4);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                                }
                            }
                        }
                        paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                        if (ChatObject.canBlockUsers(chat3)) {
                            channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                z11 = true;
                            } else {
                                getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            paVar = paVar;
                            return true;
                        }
                        paVar = paVar;
                        paVar.run();
                        return true;
                    }
                    num2 = 4;
                    chat2 = chat;
                    user = null;
                    messageObject2 = this.Y;
                    if (messageObject2.type != 0) {
                        arrayList.add(LocaleController.getString(R.string.Copy));
                        org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.Copy));
                        org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                    }
                    if (b10 == 1) {
                        tL_channelAdminLogEvent3 = this.Y.currentEvent;
                        if (tL_channelAdminLogEvent3 != null) {
                            channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                            if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                if (inputStickerSet != null) {
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                } else {
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                }
                                inputStickerSet2 = inputStickerSet;
                                if (inputStickerSet2 != null) {
                                    showDialog(new org.telegram.ui.Components.ex0(getParentActivity(), this, inputStickerSet2, null, null, null));
                                    return true;
                                }
                                chat3 = chat2;
                                z11 = false;
                            }
                            paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                            if (ChatObject.canBlockUsers(chat3)) {
                                channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                    getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                    z11 = true;
                                } else {
                                    getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                paVar = paVar;
                                return true;
                            }
                            paVar = paVar;
                            paVar.run();
                            return true;
                        }
                        if (tL_channelAdminLogEvent3 == null) {
                            chat3 = chat2;
                            z11 = false;
                            if (tL_channelAdminLogEvent3 != null) {
                                org.telegram.ui.Components.qp qpVar4 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                qpVar4.v = new xa(this);
                                showDialog(qpVar4);
                            }
                        } else {
                            chat3 = chat2;
                            z11 = false;
                            if (tL_channelAdminLogEvent3 != null) {
                                org.telegram.ui.Components.qp qpVar5 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                qpVar5.v = new xa(this);
                                showDialog(qpVar5);
                            }
                        }
                    } else {
                        chat3 = chat2;
                        z11 = false;
                        if (b10 == 3) {
                            messageMedia = this.Y.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                            }
                        } else if (b10 == 4) {
                            num3 = num;
                            if (b10 == 5) {
                                arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_language, arrayList3, arrayList2, 5);
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (b10 == 10) {
                                arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_theme, arrayList3, arrayList2, 5);
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (b10 == 6) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (b10 == 7) {
                                if (this.Y.isMask()) {
                                    arrayList.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                            } else if (b10 == 8) {
                                j10 = this.Y.messageOwner.media.user_id;
                                if (j10 != 0) {
                                    user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                                } else {
                                    user2 = user;
                                }
                                if (user2 != null) {
                                    arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                                }
                                if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                    arrayList.add(LocaleController.getString(R.string.Copy));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                                    arrayList.add(LocaleController.getString(R.string.Call));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                                }
                            }
                        } else if (this.Y.isVideo()) {
                            arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else if (this.Y.isMusic()) {
                            arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else {
                            num4 = num;
                            if (this.Y.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                }
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num4);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else {
                                arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                            }
                        }
                    }
                    paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                    if (ChatObject.canBlockUsers(chat3)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                            getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                            z11 = true;
                        } else {
                            getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        paVar = paVar;
                        return true;
                    }
                    paVar = paVar;
                    paVar.run();
                    return true;
                }
            }
            b10 = -1;
            this.Y = messageObject;
            if (getParentActivity() != null) {
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                chat = this.f41614s;
                if (chat != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                tL_channelAdminLogEvent = messageObject.currentEvent;
                if (tL_channelAdminLogEvent != null) {
                    if (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        num2 = 4;
                        chat2 = chat;
                        if (tL_channelAdminLogEvent.user_id != getMessagesController().telegramAntispamUserId) {
                        }
                        if (view instanceof org.telegram.ui.Cells.v0) {
                            SpannableString spannableString3 = new SpannableString(">");
                            Drawable drawableMutate3 = getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                            drawableMutate3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Gi), PorterDuff.Mode.MULTIPLY));
                            drawableMutate3.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                            spannableString3.setSpan(new ImageSpan(drawableMutate3, 2), 0, spannableString3.length(), 33);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.EventLogFilterGroupInfo)).append((CharSequence) "\u2009").append((CharSequence) spannableString3).append((CharSequence) "\u2009").append((CharSequence) LocaleController.getString(R.string.ChannelAdministrators));
                            spannableStringBuilder3.setSpan(new ag.x0(this, 4), 0, spannableStringBuilder3.length(), 33);
                            org.telegram.ui.Components.ec ecVarM3 = org.telegram.ui.Components.mc.a0(this).M(LocaleController.getString(R.string.ChannelAntiSpamUser), AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.ChannelAntiSpamInfo2), spannableStringBuilder3), R.raw.msg_antispam);
                            ecVarM3.f28020j = 5000;
                            ecVarM3.j();
                            return z10;
                        }
                        arrayList.add(LocaleController.getString(R.string.ReportFalsePositive));
                        org.telegram.ui.Cells.pa.n(R.drawable.msg_notspam, 34, arrayList3, arrayList2);
                        user = null;
                        arrayList.add(null);
                        arrayList3.add(null);
                        arrayList2.add(null);
                        messageObject2 = this.Y;
                        if (messageObject2.type != 0) {
                            arrayList.add(LocaleController.getString(R.string.Copy));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                        } else {
                            arrayList.add(LocaleController.getString(R.string.Copy));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                        }
                        if (b10 == 1) {
                            tL_channelAdminLogEvent3 = this.Y.currentEvent;
                            if (tL_channelAdminLogEvent3 != null) {
                                channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                                if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                    tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                    if (inputStickerSet != null) {
                                        inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                    } else {
                                        inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                    }
                                    inputStickerSet2 = inputStickerSet;
                                    if (inputStickerSet2 != null) {
                                        showDialog(new org.telegram.ui.Components.ex0(getParentActivity(), this, inputStickerSet2, null, null, null));
                                        return true;
                                    }
                                    chat3 = chat2;
                                    z11 = false;
                                }
                                paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                                if (ChatObject.canBlockUsers(chat3)) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                        getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                        z11 = true;
                                    } else {
                                        getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    paVar = paVar;
                                    return true;
                                }
                                paVar = paVar;
                                paVar.run();
                                return true;
                            }
                            if (tL_channelAdminLogEvent3 == null) {
                                chat3 = chat2;
                                z11 = false;
                                if (tL_channelAdminLogEvent3 != null) {
                                    org.telegram.ui.Components.qp qpVar6 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                    qpVar6.v = new xa(this);
                                    showDialog(qpVar6);
                                }
                            } else {
                                chat3 = chat2;
                                z11 = false;
                                if (tL_channelAdminLogEvent3 != null) {
                                    org.telegram.ui.Components.qp qpVar7 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                    qpVar7.v = new xa(this);
                                    showDialog(qpVar7);
                                }
                            }
                        } else {
                            chat3 = chat2;
                            z11 = false;
                            if (b10 == 3) {
                                messageMedia = this.Y.messageOwner.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                }
                            } else if (b10 == 4) {
                                num3 = num;
                                if (b10 == 5) {
                                    arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_language, arrayList3, arrayList2, 5);
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else if (b10 == 10) {
                                    arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_theme, arrayList3, arrayList2, 5);
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else if (b10 == 6) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else if (b10 == 7) {
                                    if (this.Y.isMask()) {
                                        arrayList.add(LocaleController.getString(R.string.AddToMasks));
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.AddToStickers));
                                    }
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                                } else if (b10 == 8) {
                                    j10 = this.Y.messageOwner.media.user_id;
                                    if (j10 != 0) {
                                        user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                                    } else {
                                        user2 = user;
                                    }
                                    if (user2 != null) {
                                        arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                                    }
                                    if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                        arrayList.add(LocaleController.getString(R.string.Copy));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                                        arrayList.add(LocaleController.getString(R.string.Call));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                                    }
                                }
                            } else if (this.Y.isVideo()) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (this.Y.isMusic()) {
                                arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else {
                                num4 = num;
                                if (this.Y.getDocument() != null) {
                                    if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                        arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                    }
                                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num4);
                                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                                }
                            }
                        }
                        paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                        if (ChatObject.canBlockUsers(chat3)) {
                            channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                z11 = true;
                            } else {
                                getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            paVar = paVar;
                            return true;
                        }
                        paVar = paVar;
                        paVar.run();
                        return true;
                    }
                    num2 = 4;
                    chat2 = chat;
                    if (messageObject.currentEvent.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) {
                        if (view instanceof org.telegram.ui.Cells.v0) {
                            SpannableString spannableString4 = new SpannableString(">");
                            Drawable drawableMutate4 = getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                            drawableMutate4.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Gi), PorterDuff.Mode.MULTIPLY));
                            drawableMutate4.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                            spannableString4.setSpan(new ImageSpan(drawableMutate4, 2), 0, spannableString4.length(), 33);
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.EventLogFilterGroupInfo)).append((CharSequence) "\u2009").append((CharSequence) spannableString4).append((CharSequence) "\u2009").append((CharSequence) LocaleController.getString(R.string.ChannelAdministrators));
                            spannableStringBuilder4.setSpan(new ag.x0(this, 4), 0, spannableStringBuilder4.length(), 33);
                            org.telegram.ui.Components.ec ecVarM4 = org.telegram.ui.Components.mc.a0(this).M(LocaleController.getString(R.string.ChannelAntiSpamUser), AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.ChannelAntiSpamInfo2), spannableStringBuilder4), R.raw.msg_antispam);
                            ecVarM4.f28020j = 5000;
                            ecVarM4.j();
                            return z10;
                        }
                        arrayList.add(LocaleController.getString(R.string.ReportFalsePositive));
                        org.telegram.ui.Cells.pa.n(R.drawable.msg_notspam, 34, arrayList3, arrayList2);
                        user = null;
                        arrayList.add(null);
                        arrayList3.add(null);
                        arrayList2.add(null);
                    }
                    messageObject2 = this.Y;
                    if (messageObject2.type != 0) {
                        arrayList.add(LocaleController.getString(R.string.Copy));
                        org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.Copy));
                        org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                    }
                    if (b10 == 1) {
                        tL_channelAdminLogEvent3 = this.Y.currentEvent;
                        if (tL_channelAdminLogEvent3 != null) {
                            channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                            if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                if (inputStickerSet != null) {
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                } else {
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                }
                                inputStickerSet2 = inputStickerSet;
                                if (inputStickerSet2 != null) {
                                    showDialog(new org.telegram.ui.Components.ex0(getParentActivity(), this, inputStickerSet2, null, null, null));
                                    return true;
                                }
                                chat3 = chat2;
                                z11 = false;
                            }
                            paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                            if (ChatObject.canBlockUsers(chat3)) {
                                channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                    getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                    z11 = true;
                                } else {
                                    getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                paVar = paVar;
                                return true;
                            }
                            paVar = paVar;
                            paVar.run();
                            return true;
                        }
                        if (tL_channelAdminLogEvent3 == null) {
                            chat3 = chat2;
                            z11 = false;
                            if (tL_channelAdminLogEvent3 != null) {
                                org.telegram.ui.Components.qp qpVar8 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                qpVar8.v = new xa(this);
                                showDialog(qpVar8);
                            }
                        } else {
                            chat3 = chat2;
                            z11 = false;
                            if (tL_channelAdminLogEvent3 != null) {
                                org.telegram.ui.Components.qp qpVar9 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                                qpVar9.v = new xa(this);
                                showDialog(qpVar9);
                            }
                        }
                    } else {
                        chat3 = chat2;
                        z11 = false;
                        if (b10 == 3) {
                            messageMedia = this.Y.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                            }
                        } else if (b10 == 4) {
                            num3 = num;
                            if (b10 == 5) {
                                arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_language, arrayList3, arrayList2, 5);
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (b10 == 10) {
                                arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_theme, arrayList3, arrayList2, 5);
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (b10 == 6) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else if (b10 == 7) {
                                if (this.Y.isMask()) {
                                    arrayList.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                            } else if (b10 == 8) {
                                j10 = this.Y.messageOwner.media.user_id;
                                if (j10 != 0) {
                                    user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                                } else {
                                    user2 = user;
                                }
                                if (user2 != null) {
                                    arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                                }
                                if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                    arrayList.add(LocaleController.getString(R.string.Copy));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                                    arrayList.add(LocaleController.getString(R.string.Call));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                                }
                            }
                        } else if (this.Y.isVideo()) {
                            arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else if (this.Y.isMusic()) {
                            arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else {
                            num4 = num;
                            if (this.Y.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                    arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                                }
                                arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num4);
                                arrayList.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                            } else {
                                arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                            }
                        }
                    }
                    paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                    if (ChatObject.canBlockUsers(chat3)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                            getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                            z11 = true;
                        } else {
                            getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        paVar = paVar;
                        return true;
                    }
                    paVar = paVar;
                    paVar.run();
                    return true;
                }
                num2 = 4;
                chat2 = chat;
                user = null;
                messageObject2 = this.Y;
                if (messageObject2.type != 0) {
                    arrayList.add(LocaleController.getString(R.string.Copy));
                    org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                } else {
                    arrayList.add(LocaleController.getString(R.string.Copy));
                    org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                }
                if (b10 == 1) {
                    tL_channelAdminLogEvent3 = this.Y.currentEvent;
                    if (tL_channelAdminLogEvent3 != null) {
                        channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                        if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                            tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                            inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                            if (inputStickerSet != null) {
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                            } else {
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                            }
                            inputStickerSet2 = inputStickerSet;
                            if (inputStickerSet2 != null) {
                                showDialog(new org.telegram.ui.Components.ex0(getParentActivity(), this, inputStickerSet2, null, null, null));
                                return true;
                            }
                            chat3 = chat2;
                            z11 = false;
                        }
                        paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                        if (ChatObject.canBlockUsers(chat3)) {
                            channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                z11 = true;
                            } else {
                                getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            paVar = paVar;
                            return true;
                        }
                        paVar = paVar;
                        paVar.run();
                        return true;
                    }
                    if (tL_channelAdminLogEvent3 == null) {
                        chat3 = chat2;
                        z11 = false;
                        if (tL_channelAdminLogEvent3 != null) {
                            org.telegram.ui.Components.qp qpVar10 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                            qpVar10.v = new xa(this);
                            showDialog(qpVar10);
                        }
                    } else {
                        chat3 = chat2;
                        z11 = false;
                        if (tL_channelAdminLogEvent3 != null) {
                            org.telegram.ui.Components.qp qpVar11 = new org.telegram.ui.Components.qp(getParentActivity(), chat3);
                            qpVar11.v = new xa(this);
                            showDialog(qpVar11);
                        }
                    }
                } else {
                    chat3 = chat2;
                    z11 = false;
                    if (b10 == 3) {
                        messageMedia = this.Y.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                        }
                    } else if (b10 == 4) {
                        num3 = num;
                        if (b10 == 5) {
                            arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_language, arrayList3, arrayList2, 5);
                            arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else if (b10 == 10) {
                            arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_theme, arrayList3, arrayList2, 5);
                            arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else if (b10 == 6) {
                            arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                            arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num3);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else if (b10 == 7) {
                            if (this.Y.isMask()) {
                                arrayList.add(LocaleController.getString(R.string.AddToMasks));
                            } else {
                                arrayList.add(LocaleController.getString(R.string.AddToStickers));
                            }
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                        } else if (b10 == 8) {
                            j10 = this.Y.messageOwner.media.user_id;
                            if (j10 != 0) {
                                user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                            } else {
                                user2 = user;
                            }
                            if (user2 != null) {
                                arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                            }
                            if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                arrayList.add(LocaleController.getString(R.string.Copy));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                                arrayList.add(LocaleController.getString(R.string.Call));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                            }
                        }
                    } else if (this.Y.isVideo()) {
                        arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                    } else if (this.Y.isMusic()) {
                        arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                    } else {
                        num4 = num;
                        if (this.Y.getDocument() != null) {
                            if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gif, arrayList3, arrayList2, 11);
                            }
                            arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_download, arrayList3, arrayList2, num4);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_share, arrayList3, arrayList2, 6);
                        } else {
                            arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_gallery, arrayList3, arrayList2, num2);
                        }
                    }
                }
                paVar = new pa(this, arrayList2, arrayList, arrayList3, view, f10, f11);
                if (ChatObject.canBlockUsers(chat3)) {
                    channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                        z11 = true;
                    } else {
                        getMessagesController().getChannelParticipant(chat3, user3, new hh.i2(this, arrayList, arrayList3, arrayList2, paVar, 1));
                        z11 = true;
                    }
                }
                if (!z11) {
                    paVar = paVar;
                    return true;
                }
                paVar = paVar;
                paVar.run();
                return true;
            }
        }
        return false;
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f41596d0 == null) {
            n0 n0Var = new n0(this, getParentActivity(), 4);
            this.f41596d0 = n0Var;
            n0Var.setOutlineProvider(new cg.l1(8));
            this.f41596d0.setClipToOutline(true);
            this.f41596d0.setWillNotDraw(false);
            this.f41596d0.setVisibility(4);
            c5.c cVar = new c5.c(getParentActivity());
            this.f41598e0 = cVar;
            cVar.setBackgroundColor(0);
            if (z10) {
                this.f41596d0.addView(this.f41598e0, h7.z5.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f41600f0 = textureView;
            textureView.setOpaque(false);
            this.f41598e0.addView(this.f41600f0, h7.z5.c(-1.0f, -1));
        }
        if (this.f41596d0.getParent() == null) {
            nb nbVar = this.X;
            n0 n0Var2 = this.f41596d0;
            int i10 = AndroidUtilities.roundMessageSize;
            nbVar.addView(n0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f41596d0.setVisibility(4);
        this.f41598e0.setDrawingReady(false);
        return this.f41600f0;
    }

    public final void R0() {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.D0.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.f41608n0;
            if (i10 >= arrayList3.size()) {
                ArrayList arrayList4 = this.f41609o0;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList3.get(i10);
            long j10 = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i11 = T0;
                T0 = i11 + 1;
                messageObject.stableId = i11;
            }
            int i12 = i10 + 1;
            MessageObject messageObject2 = i12 < arrayList3.size() ? (MessageObject) arrayList3.get(i12) : null;
            long j11 = (messageObject2 == null || (tL_channelAdminLogEvent = messageObject2.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j10 != 0) {
                arrayList2.add(messageObject);
            } else {
                arrayList.add(messageObject);
            }
            if (j10 == j11 || arrayList2.isEmpty()) {
                arrayList2 = arrayList2;
            } else {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                boolean z10 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList.size();
                ArrayList arrayList5 = new ArrayList();
                for (int size2 = arrayList2.size() - 1; size2 >= 0 && ((MessageObject) arrayList2.get(size2)).contentType == 1; size2--) {
                    arrayList5.add((MessageObject) arrayList2.remove(size2));
                }
                if (!arrayList2.isEmpty()) {
                    MessageObject messageObject3 = (MessageObject) i0.a.i(1, arrayList2);
                    boolean z11 = TextUtils.isEmpty(this.f41618v0) && arrayList2.size() > 3;
                    Long lValueOf = Long.valueOf(messageObject3.eventId);
                    HashSet hashSet = this.f41610p0;
                    if (hashSet.contains(lValueOf) || !z11) {
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            a1((MessageObject) arrayList2.get(i13), 0);
                        }
                        arrayList.addAll(arrayList2);
                    } else {
                        a1(messageObject3, arrayList2.size() - 1);
                        arrayList.add(messageObject3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                    if (z10 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        messageObject3.forceUpdate = true;
                        this.E.m((z10 ? arrayList2.size() - 1 : 0) + size);
                        this.E.m(size + (z10 ? arrayList2.size() - 1 : 0) + 1);
                    }
                    long j12 = messageObject.eventId;
                    arrayList.add(N0(j12, messageObject.currentEvent.user_id, arrayList2, hashSet.contains(Long.valueOf(j12)), z11));
                }
                if (!arrayList5.isEmpty()) {
                    MessageObject messageObject4 = (MessageObject) i0.a.i(1, arrayList5);
                    arrayList.addAll(arrayList5);
                    arrayList.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList5, true, false));
                }
                arrayList2.clear();
            }
            i10 = i12;
            arrayList2 = arrayList2;
        }
    }

    public final void T0(boolean z10) {
        if (this.M.getTag() == null || this.P) {
            return;
        }
        if (!this.S || this.Q) {
            this.M.setTag(null);
            if (!z10) {
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                this.M.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R = animatorSet2;
            animatorSet2.setDuration(150L);
            this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
            this.R.addListener(new lh.h9(this, 23));
            this.R.setStartDelay(500L);
            this.R.start();
        }
    }

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.f41607n == null) {
            return;
        }
        gf.f0 f0Var = this.P0;
        if (f0Var.f6967c == 0) {
            f0Var.invalidate();
        }
        f0Var.f6967c = i10 | f0Var.f6967c;
    }

    public final void V0(boolean z10) {
        mb mbVar;
        if (this.f41613r0) {
            return;
        }
        ArrayList arrayList = this.f41608n0;
        if (z10) {
            this.O = Long.MAX_VALUE;
            FrameLayout frameLayout = this.f41619w;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.H.setVisibility(4);
                this.A.setEmptyView(null);
            }
            this.f41605k0.b();
            arrayList.clear();
            this.m0.clear();
            R0();
        }
        this.f41613r0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41614s);
        tL_channels_getAdminLog.f22415q = this.f41618v0;
        tL_channels_getAdminLog.limit = 50;
        if (z10 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.O;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41617u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f41620w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f41620w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41620w0.n(i10)));
            }
        }
        c1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new oa(this, 4));
        if (!z10 || (mbVar = this.E) == null) {
            return;
        }
        mbVar.l();
    }

    public final void W0() {
        if (this.f41615s0) {
            return;
        }
        this.f41615s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41614s);
        tL_channels_getAdminLog.f22415q = this.f41618v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41617u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f41620w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f41620w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41620w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new oa(this, 1));
    }

    public final void X0(boolean z10) {
        fb fbVar = this.A;
        if (fbVar == null || this.C == null || fbVar.getChildCount() <= 0) {
            return;
        }
        int top = z10 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < this.A.getChildCount(); i11++) {
            View childAt = this.A.getChildAt(i11);
            this.A.getClass();
            int iR = RecyclerView.R(childAt);
            if (iR >= 0) {
                int top2 = childAt.getTop();
                if (z10) {
                    if (top2 < top) {
                        top = childAt.getTop();
                        view = childAt;
                        i10 = iR;
                    }
                } else if (top2 > top) {
                    top = childAt.getTop();
                    view = childAt;
                    i10 = iR;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject().eventId : 0L;
            this.N0 = i10;
            this.O0 = (this.A.getMeasuredHeight() - view.getBottom()) - this.A.getPaddingBottom();
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int iDp;
        int iFindQuoteStart;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.s1 s1Var2 = this.J0;
            if (s1Var2 != null) {
                s1Var2.f25523se = 0;
                s1Var2.f25538te = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (s1Var = this.J0) == null || (textLayoutBlocks = s1Var.Y3) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var3 = this.J0;
                if (s1Var3 == null || !s1Var3.f25469p1) {
                    charSequence = charSequence2;
                    iDp = 0;
                } else {
                    iDp = s1Var3.f25370i2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                iDp = (int) s1Var.f25428m4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            org.telegram.ui.Cells.s1 s1Var4 = this.J0;
            if (s1Var4 != null) {
                s1Var4.f25523se = 0;
                s1Var4.f25538te = null;
            }
            if (arrayList != null && charSequence != null && (iFindQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.H0)) >= 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                    StaticLayout staticLayout = textLayoutBlock.textLayout;
                    String string = staticLayout.getText().toString();
                    int i11 = textLayoutBlock.charactersOffset;
                    if (iFindQuoteStart > i11) {
                        float fTextYOffset = iFindQuoteStart - i11 > string.length() + (-1) ? iDp + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height)) : staticLayout.getLineTop(staticLayout.getLineForOffset(iFindQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + iDp + textLayoutBlock.padTop;
                        if (fTextYOffset <= AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)) {
                            break;
                        }
                        return (int) (fTextYOffset - (AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)));
                    }
                }
            }
        }
        return 0;
    }

    public final void Z0(MessageObject messageObject) {
        int i10;
        int i11;
        float f10;
        int iF1;
        MessageObject messageObject2;
        ArrayList arrayList = this.f41609o0;
        if (arrayList.size() <= 0) {
            i10 = -1;
            i11 = 0;
            break;
        }
        int iN0 = this.C.N0();
        int iL0 = this.C.L0();
        while (true) {
            if (iL0 > iN0) {
                i10 = -1;
                i11 = 0;
                break;
            }
            mb mbVar = this.E;
            int i12 = mbVar.f40427f;
            if (iL0 >= i12 && iL0 < mbVar.h) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(iL0 - i12);
                if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                    i11 = iL0 - this.E.f40427f;
                    i10 = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                    break;
                }
            }
            iL0++;
        }
        this.D.f2367b = i10;
        int iIndexOf = arrayList.indexOf(messageObject);
        if (iIndexOf != -1) {
            if (i11 > 0) {
                i10 = i11 > iIndexOf ? 0 : 1;
                this.D.f2367b = i10;
            }
            ta taVar = this.I0;
            if (taVar != null) {
                AndroidUtilities.cancelRunOnUIThread(taVar);
                this.I0 = null;
            }
            this.G0 = Integer.MAX_VALUE;
            this.G0 = messageObject.getRealId();
            int iIndexOf2 = arrayList.indexOf(messageObject) + this.E.f40427f;
            e1();
            int childCount = this.A.getChildCount();
            int i13 = 0;
            boolean z10 = false;
            int iY0 = 0;
            while (true) {
                if (i13 >= childCount) {
                    f10 = 2.0f;
                    break;
                }
                View childAt = this.A.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject4 = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    if (messageObject4 != null) {
                        f10 = 2.0f;
                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                            childAt.sendAccessibilityEvent(8);
                            iY0 = Y0(messageObject4);
                            z10 = true;
                        }
                    } else {
                        f10 = 2.0f;
                    }
                } else {
                    f10 = 2.0f;
                    if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = ((org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
                        childAt.sendAccessibilityEvent(8);
                        z10 = true;
                    }
                }
                if (z10) {
                    int top = childAt.getTop() - (Math.max(-AndroidUtilities.dp(f10), (this.A.getMeasuredHeight() - childAt.getHeight()) / 2) - iY0);
                    int iComputeVerticalScrollRange = (this.A.computeVerticalScrollRange() - this.A.computeVerticalScrollOffset()) - this.A.computeVerticalScrollExtent();
                    if (iComputeVerticalScrollRange < 0) {
                        iComputeVerticalScrollRange = 0;
                    }
                    if (top > iComputeVerticalScrollRange) {
                        top = iComputeVerticalScrollRange;
                    }
                    if (top == 0) {
                        break;
                    }
                    this.A.v0(0, top, null);
                    this.A.setOverScrollMode(2);
                    break;
                }
                i13++;
            }
            if (z10) {
                return;
            }
            boolean z11 = !TextUtils.isEmpty(null);
            if (getParentActivity() == null) {
                iF1 = 0;
            } else {
                if (this.J0 == null) {
                    this.J0 = new org.telegram.ui.Cells.s1(getParentActivity(), this.currentAccount);
                }
                org.telegram.ui.Cells.s1 s1Var = this.J0;
                TLRPC.Chat chat = this.f41614s;
                s1Var.J7 = chat != null;
                s1Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
                iF1 = this.J0.f1(messageObject, null, z11);
            }
            int iMax = Math.max(-AndroidUtilities.dp(f10), (this.A.getMeasuredHeight() - iF1) / 2) - Y0(messageObject);
            pb pbVar = this.L0;
            pbVar.f41314a = messageObject;
            pbVar.f41317e = iMax;
            c2.x xVar = this.D;
            xVar.f2367b = i10;
            pbVar.f41315b = iIndexOf2;
            pbVar.d = iMax;
            pbVar.f41316c = false;
            xVar.d(iIndexOf2, iMax, false, false);
        }
    }

    public final void c1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f41618v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f41620w0 != null || this.f41617u0 != null) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        } else {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f41614s.megagroup) {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
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
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 24));
        org.telegram.ui.Components.rn rnVar = new org.telegram.ui.Components.rn(context, null, false, null);
        this.I = rnVar;
        bl blVar = rnVar.h;
        if (blVar != null) {
            blVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        bl blVar2 = rnVar.f32232r;
        if (blVar2 != null) {
            blVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        rnVar.f32221g0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, h7.z5.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 0);
        this.N = v0VarA;
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.rn rnVar2 = this.I;
        TLRPC.Chat chat = this.f41614s;
        rnVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        eb ebVar = new eb(this, context);
        this.fragmentView = ebVar;
        this.X = ebVar;
        gf.f0 f0Var = new gf.f0(context, new ua(this));
        this.P0 = f0Var;
        this.X.addView(f0Var);
        qg.j jVar = new qg.j(this.X);
        nb nbVar = this.X;
        jg.a aVar = this.f41597e;
        aVar.d = jVar;
        aVar.f12943e = nbVar;
        jg.a aVar2 = this.f41599f;
        aVar2.d = jVar;
        aVar2.f12943e = nbVar;
        jg.a aVar3 = this.f41592b;
        aVar3.d = jVar;
        aVar3.f12943e = nbVar;
        nbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.g6.r0());
        this.actionBar.M(aVar, ng.c.n(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, h7.z5.e(-1, -2, 17));
        this.H.setOnTouchListener(new kh.e(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.t5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.f23086f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, h7.z5.t(54, 54, 17, 16, 20, 16, -4));
        cg.q qVar = new cg.q(context, 10);
        this.L = qVar;
        qVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        cg.q qVar2 = this.L;
        int i11 = org.telegram.ui.ActionBar.g6.f23150ic;
        qVar2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, h7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, h7.z5.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        fb fbVar = new fb(this, context);
        this.A = fbVar;
        fbVar.setOnItemClickListener(new g(this, 9));
        this.A.setTag(1);
        this.A.setVerticalScrollBarEnabled(true);
        fb fbVar2 = this.A;
        mb mbVar = new mb(this, context);
        this.E = mbVar;
        fbVar2.setAdapter(mbVar);
        this.A.setClipToPadding(false);
        fb fbVar3 = this.A;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f41612r;
        fbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        fb fbVar4 = this.A;
        gb gbVar = new gb(this, this.A, this.resourceProvider);
        this.C0 = gbVar;
        fbVar4.setItemAnimator(gbVar);
        this.C0.Q = true;
        this.A.setLayoutAnimation(null);
        j jVar2 = new j(this);
        this.C = jVar2;
        jVar2.j1(1);
        this.C.l1(true);
        this.A.setLayoutManager(this.C);
        c2.x xVar = new c2.x(this.A, this.C);
        this.D = xVar;
        xVar.h = new ua(this);
        xVar.f2372i = this.L0;
        this.X.addView(this.A, h7.z5.c(-1.0f, -1));
        this.A.setOnScrollListener(new m3(this));
        int i14 = this.f41601g0;
        if (i14 != -1) {
            this.C.h1(i14, this.f41602h0);
            this.f41601g0 = -1;
        }
        sg.f fVar = new sg.f(context);
        this.W = fVar;
        fVar.setup(aVar3);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41619w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f41619w, h7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.f41621x = view;
        view.setBackground(new org.telegram.ui.ActionBar.t5(this.f41621x, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f23086f2));
        this.f41619w.addView(this.f41621x, h7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f41623y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f41623y.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f41619w.addView(this.f41623y, h7.z5.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.M = v0Var;
        v0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, h7.z5.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        sg.e eVar = new sg.e(context, aVar, ng.c.b(c6Var), c6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        sg.e eVar2 = this.G;
        lg.d dVarC = eVar2.f47905n.c(eVar2, null, false);
        dVarC.n(eVar2.f47906r);
        dVarC.p(AndroidUtilities.dp(22.0f));
        dVarC.o(AndroidUtilities.dp(6.0f));
        eVar2.f47907s = dVarC;
        this.X.addView(this.G, h7.z5.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final qb f43677b;

            {
                this.f43677b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        qb qbVar = this.f43677b;
                        if (qbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(qbVar, qbVar.f41617u0, qbVar.f41620w0, qbVar.f41614s.megagroup);
                            g0Var.S(qbVar.f41616t0);
                            g0Var.f28479c0 = new ua(qbVar);
                            qbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        qb qbVar2 = this.f43677b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qbVar2.getParentActivity());
                        if (qbVar2.f41614s.megagroup) {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        qbVar2.showDialog(b2Var);
                        break;
                    default:
                        qb qbVar3 = this.f43677b;
                        if (qbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(qbVar3.N.getSearchField());
                            qbVar3.showDialog(org.telegram.ui.Components.y4.p(qbVar3.getParentActivity(), new ra(qbVar3, 0), null).f23994a);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, h7.z5.e(-2, -2, 17));
        this.G.f47904f.add(this.F);
        this.G.d(false);
        final int i16 = 1;
        this.G.f47901b[4] = new View.OnClickListener(this) {

            public final qb f43677b;

            {
                this.f43677b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        qb qbVar = this.f43677b;
                        if (qbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(qbVar, qbVar.f41617u0, qbVar.f41620w0, qbVar.f41614s.megagroup);
                            g0Var.S(qbVar.f41616t0);
                            g0Var.f28479c0 = new ua(qbVar);
                            qbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        qb qbVar2 = this.f43677b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qbVar2.getParentActivity());
                        if (qbVar2.f41614s.megagroup) {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        qbVar2.showDialog(b2Var);
                        break;
                    default:
                        qb qbVar3 = this.f43677b;
                        if (qbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(qbVar3.N.getSearchField());
                            qbVar3.showDialog(org.telegram.ui.Components.y4.p(qbVar3.getParentActivity(), new ra(qbVar3, 0), null).f23994a);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41591a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f41591a0.setVisibility(4);
        this.f41591a0.setFocusable(true);
        this.f41591a0.setFocusableInTouchMode(true);
        this.f41591a0.setClickable(true);
        this.f41591a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f41591a0, h7.z5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f41593b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f41593b0.setImageResource(R.drawable.msg_calendar);
        this.f41593b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23413xe, false), PorterDuff.Mode.MULTIPLY));
        this.f41591a0.addView(this.f41593b0, h7.z5.e(48, 48, 53));
        final int i17 = 2;
        this.f41593b0.setOnClickListener(new View.OnClickListener(this) {

            public final qb f43677b;

            {
                this.f43677b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        qb qbVar = this.f43677b;
                        if (qbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(qbVar, qbVar.f41617u0, qbVar.f41620w0, qbVar.f41614s.megagroup);
                            g0Var.S(qbVar.f41616t0);
                            g0Var.f28479c0 = new ua(qbVar);
                            qbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        qb qbVar2 = this.f43677b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qbVar2.getParentActivity());
                        if (qbVar2.f41614s.megagroup) {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        qbVar2.showDialog(b2Var);
                        break;
                    default:
                        qb qbVar3 = this.f43677b;
                        if (qbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(qbVar3.N.getSearchField());
                            qbVar3.showDialog(org.telegram.ui.Components.y4.p(qbVar3.getParentActivity(), new ra(qbVar3, 0), null).f23994a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41595c0 = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23431ye, false));
        this.f41595c0.setTextSize(15);
        this.f41595c0.setTypeface(AndroidUtilities.bold());
        this.f41591a0.addView(this.f41595c0, h7.z5.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f41613r0 && this.f41608n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41619w, true, 0.3f, true);
            this.A.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41619w, false, 0.3f, true);
            this.A.setEmptyView(this.H);
        }
        fb fbVar5 = this.A;
        fbVar5.U1 = true;
        fbVar5.V1 = 1;
        UndoView undoView = new UndoView(context);
        this.B = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.B, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        fb fbVar = this.A;
        if (fbVar == null) {
            return;
        }
        int childCount = fbVar.getChildCount();
        int measuredHeight = this.A.getMeasuredHeight();
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.A.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                t1Var.f25658f = y10;
                t1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                int top = s1Var.getTop();
                s1Var.getBottom();
                int i13 = top >= 0 ? 0 : -top;
                int measuredHeight2 = s1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i13 + measuredHeight;
                }
                s1Var.a4(i13, measuredHeight2 - i13, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.A.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = s1Var.getMessageObject();
                if (this.f41596d0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = s1Var.getPhotoImage();
                    this.f41596d0.setTranslationX(photoImage.getImageX());
                    this.f41596d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f41596d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (v0Var.J()) {
                    v0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.A.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.s1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                gb gbVar = this.C0;
                if ((gbVar == null || (!gbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i11) {
                        i11 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        n0 n0Var = this.f41596d0;
        if (n0Var != null) {
            if (z11) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                n0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.M.T((view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject() : ((org.telegram.ui.Cells.v0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view3 instanceof org.telegram.ui.Cells.s1) && !(view3 instanceof org.telegram.ui.Cells.v0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view2 == null) {
            T0(true);
            this.M.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.A.getPaddingTop() || this.Q) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            T0(true ^ this.Q);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
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
        }
        int bottom2 = view2.getBottom() - this.A.getPaddingTop();
        if (bottom2 <= this.M.getMeasuredHeight() || bottom2 >= this.M.getMeasuredHeight() * 2) {
            this.M.setTranslationY(0.0f);
        } else {
            org.telegram.ui.Cells.v0 v0Var2 = this.M;
            v0Var2.setTranslationY(((-v0Var2.getMeasuredHeight()) * 2) + bottom2);
        }
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
            fb fbVar = this.A;
            if (fbVar != null) {
                fbVar.f1();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagePlayingDidStart) {
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                fb fbVar2 = this.A;
                if (fbVar2 != null) {
                    int childCount = fbVar2.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.A.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null) {
                            if (messageObject.isVoice() || messageObject.isMusic()) {
                                s1Var.l4(false, true, false);
                            } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                s1Var.d1(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.messagePlayingProgressDidChanged) {
                if (i10 != NotificationCenter.didSetNewWallpapper || this.fragmentView == null) {
                    return;
                }
                this.X.V(org.telegram.ui.ActionBar.g6.r0());
                this.f41621x.invalidate();
                cg.q qVar = this.L;
                if (qVar != null) {
                    qVar.invalidate();
                }
                this.A.f1();
                return;
            }
            Integer num = (Integer) objArr[0];
            fb fbVar3 = this.A;
            if (fbVar3 != null) {
                int childCount2 = fbVar3.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.A.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = (s1Var2 = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null) {
                            messageObject2.audioProgress = playingMessageObject.audioProgress;
                            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                            s1Var2.p4();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]).isRoundVideo()) {
            MediaController.getInstance().setTextureView(Q0(true), this.f41598e0, this.f41596d0, true);
            int childCount3 = this.A.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.A.getChildAt(i14);
                if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt3;
                    MessageObject messageObject4 = s1Var4.getMessageObject();
                    if (this.f41596d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = s1Var4.getPhotoImage();
                        this.f41596d0.setTranslationX(photoImage.getImageX());
                        this.f41596d0.setTranslationY(photoImage.getImageY() + s1Var4.getTop() + this.fragmentView.getPaddingTop());
                        this.fragmentView.invalidate();
                        this.f41596d0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i14++;
            }
            if (this.f41596d0 != null) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (z10) {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                } else {
                    this.f41596d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject2 != null && playingMessageObject2.isRoundVideo() && (this.V || PipRoundVideoView.B != null)) {
                        MediaController.getInstance().setCurrentVideoVisible(false);
                    }
                }
            }
        }
        fb fbVar4 = this.A;
        if (fbVar4 != null) {
            int childCount4 = fbVar4.getChildCount();
            for (int i15 = 0; i15 < childCount4; i15++) {
                View childAt4 = this.A.getChildAt(i15);
                if ((childAt4 instanceof org.telegram.ui.Cells.s1) && (messageObject3 = (s1Var3 = (org.telegram.ui.Cells.s1) childAt4).getMessageObject()) != null) {
                    if (messageObject3.isVoice() || messageObject3.isMusic()) {
                        s1Var3.l4(false, true, false);
                    } else if (messageObject3.isRoundVideo()) {
                        s1Var3.d1(null, false);
                        if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                            messageObject3.resetPlayingProgress();
                            s1Var3.invalidate();
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
        fb fbVar = this.A;
        if (fbVar == null) {
            return;
        }
        int childCount = fbVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.t()) {
                        s1Var.setDrawSelectionBackground(false);
                        s1Var.I3(false, true);
                        s1Var.K3(false, false, true);
                    }
                    s1Var.setHighlighted(this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0);
                    if (this.G0 != Integer.MAX_VALUE) {
                        ta taVar = this.I0;
                        if (taVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(taVar);
                        }
                        ta taVar2 = new ta(this, 0);
                        this.I0 = taVar2;
                        AndroidUtilities.runOnUIThread(taVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.f41618v0)) {
                        s1Var.R3(null);
                    } else {
                        s1Var.R3(this.f41618v0);
                    }
                    s1Var.setSpoilersSuppressed(this.A.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.setMessageObject(v0Var.getMessageObject());
                v0Var.setSpoilersSuppressed(this.A.getScrollState() != 0);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23375v8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f23341t8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.g6.f23032c2, org.telegram.ui.ActionBar.g6.f23049d2}, org.telegram.ui.ActionBar.g6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23146i8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23164j8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23183k8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23200l8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23217m8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23236n8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23253o8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23212m3, org.telegram.ui.ActionBar.g6.f23281q3}, null, org.telegram.ui.ActionBar.g6.f23305ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23231n3, org.telegram.ui.ActionBar.g6.f23298r3}, null, org.telegram.ui.ActionBar.g6.f23059dc));
        Drawable[] drawableArrK = org.telegram.ui.ActionBar.g6.f23212m3.k();
        int i13 = org.telegram.ui.ActionBar.g6.f23343ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArrK, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23281q3.k(), null, i13));
        Drawable[] drawableArrK2 = org.telegram.ui.ActionBar.g6.f23248o3.k();
        int i14 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArrK2, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23317s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23266p3, org.telegram.ui.ActionBar.g6.f23336t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.f23316s2;
        int i15 = org.telegram.ui.ActionBar.g6.f23150ic;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, new Class[]{org.telegram.ui.Cells.v0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.v0.class}, org.telegram.ui.ActionBar.g6.f23316s2, null, null, org.telegram.ui.ActionBar.g6.f23168jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23389w4, org.telegram.ui.ActionBar.g6.f23282q4, org.telegram.ui.ActionBar.g6.f23404x4, org.telegram.ui.ActionBar.g6.v4, org.telegram.ui.ActionBar.g6.f23355u4, org.telegram.ui.ActionBar.g6.C4}, null, org.telegram.ui.ActionBar.g6.kc));
        int i16 = org.telegram.ui.ActionBar.g6.f23203lc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23221mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23077ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.f23131hc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23420y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23438z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23326sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O3, org.telegram.ui.ActionBar.g6.S3, org.telegram.ui.ActionBar.g6.W3}, null, org.telegram.ui.ActionBar.g6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P3, org.telegram.ui.ActionBar.g6.T3, org.telegram.ui.ActionBar.g6.X3}, null, org.telegram.ui.ActionBar.g6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.M3, org.telegram.ui.ActionBar.g6.Q3, org.telegram.ui.ActionBar.g6.U3}, null, org.telegram.ui.ActionBar.g6.f23411xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.N3, org.telegram.ui.ActionBar.g6.R3, org.telegram.ui.ActionBar.g6.V3}, null, org.telegram.ui.ActionBar.g6.f23429yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f22996a4, org.telegram.ui.ActionBar.g6.f23015b4, org.telegram.ui.ActionBar.g6.Z3}, null, org.telegram.ui.ActionBar.g6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23070e4}, null, org.telegram.ui.ActionBar.g6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23088f4}, null, org.telegram.ui.ActionBar.g6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23034c4}, null, org.telegram.ui.ActionBar.g6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23051d4}, null, org.telegram.ui.ActionBar.g6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23106g4}, null, org.telegram.ui.ActionBar.g6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.f23142i4};
        int i17 = org.telegram.ui.ActionBar.g6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.g6.f23123h4, org.telegram.ui.ActionBar.g6.B4, org.telegram.ui.ActionBar.g6.D4};
        int i18 = org.telegram.ui.ActionBar.g6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.J4, null, org.telegram.ui.ActionBar.g6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.H4, null, org.telegram.ui.ActionBar.g6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O4}, null, org.telegram.ui.ActionBar.g6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P4}, null, org.telegram.ui.ActionBar.g6.f23302r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Q4}, null, org.telegram.ui.ActionBar.g6.f23286qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.f23013b2, null, null, org.telegram.ui.ActionBar.g6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23160j4}, null, org.telegram.ui.ActionBar.g6.Gc));
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
        int i20 = org.telegram.ui.ActionBar.g6.f23003ab;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23022bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23040cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23058db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23076eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23005ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23095fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23024bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23042cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23113gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23060dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23130hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23078ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23149ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23096fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23167jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23132hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23151id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23287qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23169jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23306rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23187kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23240nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23325sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23273pd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23202lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23308rd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23344tb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23327sd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23362ub));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23346td));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23378vb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23364ud));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23428yb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23412xd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23380vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23446zb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23410xb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23430yd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23447zd));
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23152ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23363uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23170je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23379vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.g6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.f23309re));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.f23328se));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.g6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.g6.f23290qe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.g6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41623y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.g6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 8, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.g6.De));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41621x, 536870912, null, null, null, null, i16));
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f41614s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new oa(this, 0)), this.classGuid);
        setBulletinDelegate(new cg.w(10));
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
        this.f41622x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        nb nbVar = this.X;
        if (nbVar != null) {
            org.telegram.ui.Components.s71 s71Var = nbVar.v;
            if (s71Var != null) {
                s71Var.c(false);
            }
            nbVar.B = true;
        }
        UndoView undoView = this.B;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f41603i0 = true;
        this.f41604j0 = true;
        com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.f4598e;
        if (lVar == null || !lVar.f4599a) {
            return;
        }
        com.google.firebase.messaging.l lVarI = com.google.firebase.messaging.l.i();
        if (lVarI.f4599a) {
            s4 s4Var = (s4) lVarI.d;
            int i10 = c5.B;
            s4Var.b(false);
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f41600f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        nb nbVar = this.X;
        if (nbVar != null) {
            org.telegram.ui.Components.s71 s71Var = nbVar.v;
            if (s71Var != null) {
                s71Var.c(true);
            }
            nbVar.B = false;
        }
        this.f41603i0 = false;
        O0(false);
        if (this.f41604j0) {
            this.f41604j0 = false;
            mb mbVar = this.E;
            if (mbVar != null) {
                mbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f41622x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f41622x0.lock();
        }
    }
}
