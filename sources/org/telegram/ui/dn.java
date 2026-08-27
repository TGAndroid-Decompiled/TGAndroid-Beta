package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.Property;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;

public final class dn implements org.telegram.ui.Cells.j1 {

    public final rn f37446a;

    public dn(rn rnVar) {
        this.f37446a = rnVar;
    }

    public static void a(dn dnVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        rn rnVar = dnVar.f37446a;
        if (rnVar.getParentActivity() == null || document == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && rnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            rnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
            return;
        }
        MessageObject messageObject = s1Var == null ? null : s1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = messageObject.isOutOwner();
        tL_message.f22401id = messageObject.getId();
        tL_message.realId = messageObject.getRealId();
        tL_message.dialog_id = messageObject.getDialogId();
        TLRPC.Message message = messageObject.messageOwner;
        tL_message.peer_id = message.peer_id;
        tL_message.from_id = message.from_id;
        tL_message.date = message.date;
        tL_message.message = "";
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = document;
        int i11 = tL_message.flags;
        tL_message.flags = i11 | 512;
        if (tL_message.from_id != null) {
            tL_message.flags = i11 | 768;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, tL_message, false, true));
        MediaController.saveFilesFromMessages(rnVar.getParentActivity(), rnVar.getAccountInstance(), arrayList, new ra(dnVar, 1));
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return !this.f37446a.f42199s.containsKey(messageObject);
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var) {
        zg.c cVar = this.f37446a.f42289yc;
        if (cVar == null || cVar.f50809n != s1Var) {
            return;
        }
        cVar.f50812w.getClass();
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        rn rnVar = this.f37446a;
        rnVar.Z4 = messageObject;
        rnVar.d9();
    }

    @Override
    public final void C0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.x5 animation;
        rn rnVar = this.f37446a;
        if (rnVar.f42067h3 || SharedConfig.noSoundHintShowed || rnVar.f42213t0 == null || rnVar.getParentActivity() == null || rnVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.x30 x30Var = rnVar.f42166p2;
        if (x30Var == null || x30Var.getTag() == null) {
            if (rnVar.f42166p2 == null) {
                jm jmVar = rnVar.T0;
                int iIndexOfChild = jmVar.indexOfChild(rnVar.O);
                if (iIndexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(0, rnVar.getParentActivity(), rnVar.f41983aa, false);
                rnVar.f42166p2 = x30Var2;
                x30Var2.setShowingDuration(10000L);
                jmVar.addView(rnVar.f42166p2, iIndexOfChild + 1, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                rnVar.f42166p2.setAlpha(0.0f);
                rnVar.f42166p2.setVisibility(4);
            }
            int childCount = rnVar.f42213t0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = rnVar.f42213t0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && rnVar.f42166p2.e(s1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.s2();
        s1Var.requestLayout();
        this.f37446a.f42252w0.R(messageObject, false, false);
    }

    @Override
    public final void D1(MessageObject messageObject) {
        this.f37446a.f42199s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
        rn rnVar = this.f37446a;
        if (rnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        if (((org.telegram.ui.ActionBar.n2) rnVar).parentLayout == null || !((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout).y()) {
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
            } else if (!(tLObject instanceof TLRPC.User)) {
                return;
            } else {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
            }
            if (!z10 || !z11) {
                rnVar.presentFragment(new rn(bundle));
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, rnVar.getParentActivity(), rnVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(rnVar.getParentActivity(), false, false);
            f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new a(this, 14));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(rnVar.getParentActivity(), false, false);
            f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
            f1Var2.setMinimumWidth(160);
            f1Var2.setOnClickListener(new c0(this, (TLRPC.Chat) tLObject, s1Var, 7));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
            rn rnVar2 = new rn(bundle);
            rnVar2.F9 = true;
            rnVar.presentFragmentAsPreviewWithMenu(rnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
            rnVar.d7();
        }
    }

    @Override
    public final void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri uri;
        if (str == null || (uri = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !we.e.h(str, false, false)) ? z10 : true;
        rn rnVar = this.f37446a;
        we.d dVar = rnVar.wb;
        if (dVar != null) {
            dVar.a(true);
        }
        rnVar.wb = s1Var.getMessageObject() == null ? null : new zm(this, s1Var);
        if (z11 || we.e.f(uri, false, null)) {
            we.e.r(rnVar.getParentActivity(), uri, true, true, false, rnVar.wb, null, false, true, false);
        } else {
            org.telegram.ui.Components.y4.r0(rnVar, str, true, true, true, !z11, rnVar.wb, webPage, rnVar.f41983aa);
        }
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        rn rnVar = this.f37446a;
        if (i10 != 16) {
            rnVar.I7(s1Var, true, false, f10, f11, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = rnVar.f42039f;
            if (user != null) {
                boolean zIsVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = rnVar.W7;
                org.telegram.ui.Components.voip.e2.n(user, zIsVideoCall, userFull != null && userFull.video_calls_available, rnVar.getParentActivity(), rnVar.getMessagesController().getUserFull(rnVar.f42039f.f22527id), rnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(rnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(rnVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = rnVar.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new hh.x(this, rnVar.getConnectionsManager().sendRequest(getgroupcall, new cg.e0(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 7)), 2));
        b2Var.q(600L);
    }

    @Override
    public final CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        rn rnVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (rnVar = this.f37446a).f42211sb) == 0 || i10 != s1Var.getMessageObject().getId() || rnVar.f42224tb != 1) {
            return null;
        }
        return rnVar.f42237ub;
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s1 s1Var) {
        i(s1Var, true, false, true);
    }

    @Override
    public final void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            rn rnVar = this.f37446a;
            org.telegram.ui.Components.fu.J(rnVar, messageObject, rnVar.Ba, str2, str3, str4, str, i10, i11, -1, rnVar.x9());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final void H(org.telegram.ui.Cells.s1 s1Var) {
        rn rnVar = this.f37446a;
        if (!rnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(rnVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            rnVar.getMessagesController().getContentSettings(new b0(this, b2Var, s1Var, 5));
        } else {
            if (s1Var.getMessageObject() != null) {
                s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            s1Var.g4();
        }
    }

    @Override
    public final void H0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        if (s1Var == null || (messageObject = s1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        rn rnVar = this.f37446a;
        if (rnVar.f42211sb == id2 && rnVar.f42224tb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = rnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.f22600id = id2;
        we.d dVar = rnVar.wb;
        if (dVar != null) {
            dVar.a(true);
            rnVar.wb = null;
        }
        int[] iArr = new int[1];
        qi qiVar = new qi(rnVar, id2, s1Var, 2);
        qiVar.f49293b = new rd(6, rnVar, iArr);
        rnVar.wb = qiVar;
        qiVar.d();
        iArr[0] = rnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new cg(rnVar, qiVar, iArr, s1Var, messageObject));
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int iCeil;
        lh.w3 w3Var;
        MessageObject messageObject2;
        boolean z10;
        MessageObject messageObject3;
        TextView textView;
        int i10;
        a41 a41Var;
        int i11;
        float f10;
        long dialogId;
        String firstName;
        TLRPC.Chat chat;
        int i12;
        TLRPC.User user;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            c41 c41Var = this.f37446a.V9;
            if (c41Var == null || c41Var.X) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.mc.a0(this.f37446a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f37446a.V9 = new c41(this.f37446a.getParentActivity());
                c41 c41Var2 = this.f37446a.V9;
                me meVarFb = !messageObject.isOutOwner() ? this.f37446a.fb(messageObject, true) : null;
                e5.u uVarO4 = !messageObject.isOutOwner() ? rn.O4(this.f37446a, messageObject) : null;
                Context context = c41Var2.f36936a;
                ag.y1 y1Var = c41Var2.f36939c;
                c41Var2.T = meVarFb;
                c41Var2.U = uVarO4;
                a41 a41Var2 = c41Var2.J;
                if (a41Var2 != null) {
                    y1Var.removeView(a41Var2);
                    c41Var2.J = null;
                }
                c41Var2.K = s1Var;
                MessageObject messageObject4 = s1Var.getMessageObject();
                c41Var2.I = messageObject4;
                c41Var2.O = messageObject4 != null && messageObject4.isRoundVideo();
                org.telegram.ui.Cells.s1 s1Var2 = c41Var2.K;
                c41Var2.H = s1Var2 != null ? s1Var2.getResourcesProvider() : null;
                if (c41Var2.K != null) {
                    c41Var2.P = 0.0f;
                    c41Var2.Q = s1Var.f25439n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        c41Var2.P = view.getY() + c41Var2.P;
                        c41Var2.Q = view.getY() + c41Var2.Q;
                    }
                    int width = c41Var2.K.getWidth();
                    int height = c41Var2.K.getHeight();
                    if (c41Var2.O) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i13 = height;
                    c41Var2.G = i13 - c41Var2.K.getHeight();
                    iCeil = (int) Math.ceil((Math.min(width, i13) * 0.92f) / AndroidUtilities.density);
                    viewGroup = y1Var;
                    a41 a41Var3 = new a41(c41Var2, c41Var2.getContext(), UserConfig.selectedAccount, c41Var2.K.getResourcesProvider(), width, i13);
                    c41Var2.J = a41Var3;
                    c41Var2.K.i1(a41Var3);
                    c41Var2.J.h1(c41Var2.K);
                    c41Var2.J.setDelegate(new za.b(19));
                    a41 a41Var4 = c41Var2.J;
                    MessageObject messageObject5 = c41Var2.I;
                    MessageObject.GroupedMessages currentMessagesGroup = c41Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = c41Var2.K;
                    a41Var4.W3(messageObject5, currentMessagesGroup, s1Var3.B, s1Var3.A, false, false);
                    if (!c41Var2.O) {
                        org.telegram.ui.Components.c8 c8Var = new org.telegram.ui.Components.c8();
                        c41Var2.R = c8Var;
                        a41 a41Var5 = c41Var2.J;
                        c8Var.f27363i = a41Var5;
                        a41Var5.f25265ae = c8Var;
                        if (a41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.sn0 seekBarWaveform = c41Var2.J.getSeekBarWaveform();
                            seekBarWaveform.L = c41Var2.f36944s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.f32501n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    c41Var2.D = false;
                    viewGroup.addView(c41Var2.J, new FrameLayout.LayoutParams(c41Var2.K.getWidth(), i13, 17));
                } else {
                    viewGroup = y1Var;
                    iCeil = 360;
                }
                TextureView textureView = c41Var2.L;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    c41Var2.L = null;
                }
                if (c41Var2.O) {
                    c41Var2.M = false;
                    TextureView textureView2 = new TextureView(context);
                    c41Var2.L = textureView2;
                    viewGroup.addView(textureView2, 0, h7.z5.c(iCeil, iCeil));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.m61 m61Var = c41Var2.f36945w;
                if (m61Var != null) {
                    m61Var.C();
                    c41Var2.f36945w.I();
                    c41Var2.f36945w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = c41Var2.K;
                if (s1Var5 == null || s1Var5.getMessageObject() == null) {
                    w3Var = c41Var2.f36946x;
                    if (w3Var != null) {
                        viewGroup.removeView(w3Var);
                        c41Var2.f36946x = null;
                    }
                    messageObject2 = c41Var2.I;
                    if (messageObject2 == null && messageObject2.isOutOwner()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageObject3 = c41Var2.I;
                    if (messageObject3 != null && messageObject3.getDialogId() != UserConfig.getInstance(c41Var2.I.currentAccount).getClientUserId()) {
                        lh.w3 w3Var2 = new lh.w3(context, 3);
                        c41Var2.f36946x = w3Var2;
                        w3Var2.q(true);
                        if (z10) {
                            dialogId = c41Var2.I.getDialogId();
                            firstName = "";
                            if (dialogId > 0) {
                                user = MessagesController.getInstance(c41Var2.I.currentAccount).getUser(Long.valueOf(dialogId));
                                if (user != null) {
                                    firstName = UserObject.getFirstName(user);
                                }
                            } else {
                                chat = MessagesController.getInstance(c41Var2.I.currentAccount).getChat(Long.valueOf(-dialogId));
                                if (chat != null) {
                                    firstName = chat.title;
                                }
                            }
                            lh.w3 w3Var3 = c41Var2.f36946x;
                            if (c41Var2.O) {
                                i12 = R.string.VideoOnceOutHint;
                            } else {
                                i12 = R.string.VoiceOnceOutHint;
                            }
                            w3Var3.t(AndroidUtilities.replaceTags(LocaleController.formatString(i12, firstName)));
                        } else {
                            lh.w3 w3Var4 = c41Var2.f36946x;
                            if (c41Var2.O) {
                                i11 = R.string.VideoOnceHint;
                            } else {
                                i11 = R.string.VoiceOnceHint;
                            }
                            w3Var4.t(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                        }
                        c41Var2.f36946x.r(12.0f);
                        lh.w3 w3Var5 = c41Var2.f36946x;
                        if (!z10 || c41Var2.K.B) {
                            f10 = 0.0f;
                        } else {
                            f10 = 6.0f;
                        }
                        w3Var5.setPadding(AndroidUtilities.dp(f10), 0, 0, 0);
                        if (c41Var2.O) {
                            c41Var2.f36946x.n(0.5f, 0.0f);
                            c41Var2.f36946x.G = Layout.Alignment.ALIGN_CENTER;
                        } else {
                            c41Var2.f36946x.n(0.0f, AndroidUtilities.dp(34.0f));
                            c41Var2.f36946x.G = Layout.Alignment.ALIGN_NORMAL;
                        }
                        c41Var2.f36946x.u(14.0f);
                        lh.w3 w3Var6 = c41Var2.f36946x;
                        w3Var6.h = lh.w3.a(w3Var6.getText(), c41Var2.f36946x.getTextPaint());
                        if (c41Var2.O) {
                            viewGroup.addView(c41Var2.f36946x, h7.z5.d((int) ((c41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((c41Var2.K.getHeight() + c41Var2.G) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                        } else {
                            viewGroup.addView(c41Var2.f36946x, h7.z5.d((int) ((c41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((c41Var2.K.getWidth() * (-0.39999998f)) / 2.0f) + c41Var2.K.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((c41Var2.K.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                        }
                        c41Var2.f36946x.v();
                    }
                    textView = c41Var2.f36947y;
                    if (textView != null) {
                        viewGroup.removeView(textView);
                        c41Var2.f36947y = null;
                    }
                    TextView textView2 = new TextView(context);
                    c41Var2.f36947y = textView2;
                    textView2.setTextColor(-1);
                    c41Var2.f36947y.setTypeface(AndroidUtilities.bold());
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        c41Var2.f36947y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                    } else {
                        c41Var2.f36947y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                    }
                    c41Var2.f36947y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                    h7.b6.a(c41Var2.f36947y);
                    TextView textView3 = c41Var2.f36947y;
                    if (z10) {
                        i10 = R.string.VoiceOnceClose;
                    } else {
                        i10 = R.string.VoiceOnceDeleteClose;
                    }
                    textView3.setText(LocaleController.getString(i10));
                    c41Var2.f36947y.setOnClickListener(new y31(c41Var2, 1));
                    viewGroup.addView(c41Var2.f36947y, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                    if (!z10 && (a41Var = c41Var2.J) != null && a41Var.getMessageObject() != null && c41Var2.J.getMessageObject().messageOwner != null) {
                        c41Var2.J.getMessageObject().messageOwner.media_unread = false;
                        c41Var2.J.invalidate();
                    }
                } else {
                    File pathToAttach = FileLoader.getInstance(c41Var2.K.getMessageObject().currentAccount).getPathToAttach(c41Var2.K.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(c41Var2.K.getMessageObject().currentAccount).getPathToMessage(c41Var2.K.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && c41Var2.K.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(c41Var2.K.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.m61 m61Var2 = new org.telegram.ui.Components.m61();
                        c41Var2.f36945w = m61Var2;
                        m61Var2.F = new b41(c41Var2);
                        if (c41Var2.R != null) {
                            m61Var2.G = new b41(c41Var2);
                        }
                        if (c41Var2.O) {
                            m61Var2.W(c41Var2.L);
                        }
                        c41Var2.f36945w.E(Uri.fromFile(pathToAttach), "other");
                        c41Var2.f36945w.D();
                        org.telegram.ui.Components.vs vsVar = c41Var2.A;
                        if (vsVar != null) {
                            vsVar.f34046s = c41Var2.f36945w;
                            vsVar.a();
                        }
                        w3Var = c41Var2.f36946x;
                        if (w3Var != null) {
                            viewGroup.removeView(w3Var);
                            c41Var2.f36946x = null;
                        }
                        messageObject2 = c41Var2.I;
                        if (messageObject2 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        messageObject3 = c41Var2.I;
                        if (messageObject3 != null) {
                            lh.w3 w3Var7 = new lh.w3(context, 3);
                            c41Var2.f36946x = w3Var7;
                            w3Var7.q(true);
                            if (z10) {
                                dialogId = c41Var2.I.getDialogId();
                                firstName = "";
                                if (dialogId > 0) {
                                    user = MessagesController.getInstance(c41Var2.I.currentAccount).getUser(Long.valueOf(dialogId));
                                    if (user != null) {
                                        firstName = UserObject.getFirstName(user);
                                    }
                                } else {
                                    chat = MessagesController.getInstance(c41Var2.I.currentAccount).getChat(Long.valueOf(-dialogId));
                                    if (chat != null) {
                                        firstName = chat.title;
                                    }
                                }
                                lh.w3 w3Var8 = c41Var2.f36946x;
                                if (c41Var2.O) {
                                    i12 = R.string.VideoOnceOutHint;
                                } else {
                                    i12 = R.string.VoiceOnceOutHint;
                                }
                                w3Var8.t(AndroidUtilities.replaceTags(LocaleController.formatString(i12, firstName)));
                            } else {
                                lh.w3 w3Var9 = c41Var2.f36946x;
                                if (c41Var2.O) {
                                    i11 = R.string.VideoOnceHint;
                                } else {
                                    i11 = R.string.VoiceOnceHint;
                                }
                                w3Var9.t(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                            }
                            c41Var2.f36946x.r(12.0f);
                            lh.w3 w3Var10 = c41Var2.f36946x;
                            if (z10) {
                                f10 = 0.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            w3Var10.setPadding(AndroidUtilities.dp(f10), 0, 0, 0);
                            if (c41Var2.O) {
                                c41Var2.f36946x.n(0.5f, 0.0f);
                                c41Var2.f36946x.G = Layout.Alignment.ALIGN_CENTER;
                            } else {
                                c41Var2.f36946x.n(0.0f, AndroidUtilities.dp(34.0f));
                                c41Var2.f36946x.G = Layout.Alignment.ALIGN_NORMAL;
                            }
                            c41Var2.f36946x.u(14.0f);
                            lh.w3 w3Var11 = c41Var2.f36946x;
                            w3Var11.h = lh.w3.a(w3Var11.getText(), c41Var2.f36946x.getTextPaint());
                            if (c41Var2.O) {
                                viewGroup.addView(c41Var2.f36946x, h7.z5.d((int) ((c41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((c41Var2.K.getHeight() + c41Var2.G) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                            } else {
                                viewGroup.addView(c41Var2.f36946x, h7.z5.d((int) ((c41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((c41Var2.K.getWidth() * (-0.39999998f)) / 2.0f) + c41Var2.K.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((c41Var2.K.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                            }
                            c41Var2.f36946x.v();
                        }
                        textView = c41Var2.f36947y;
                        if (textView != null) {
                            viewGroup.removeView(textView);
                            c41Var2.f36947y = null;
                        }
                        TextView textView4 = new TextView(context);
                        c41Var2.f36947y = textView4;
                        textView4.setTextColor(-1);
                        c41Var2.f36947y.setTypeface(AndroidUtilities.bold());
                        if (org.telegram.ui.ActionBar.g6.I.q()) {
                            c41Var2.f36947y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                        } else {
                            c41Var2.f36947y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                        }
                        c41Var2.f36947y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                        h7.b6.a(c41Var2.f36947y);
                        TextView textView5 = c41Var2.f36947y;
                        if (z10) {
                            i10 = R.string.VoiceOnceClose;
                        } else {
                            i10 = R.string.VoiceOnceDeleteClose;
                        }
                        textView5.setText(LocaleController.getString(i10));
                        c41Var2.f36947y.setOnClickListener(new y31(c41Var2, 1));
                        viewGroup.addView(c41Var2.f36947y, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                        if (!z10) {
                            c41Var2.J.getMessageObject().messageOwner.media_unread = false;
                            c41Var2.J.invalidate();
                        }
                    }
                }
                rn rnVar = this.f37446a;
                rnVar.showDialog(rnVar.V9);
                return false;
            }
        } else {
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? this.f37446a.R7(messageObject, false) : null, false);
                return zPlayMessage;
            }
            if (messageObject.isMusic()) {
                MediaController mediaController = MediaController.getInstance();
                ArrayList arrayListL = this.f37446a.f42252w0.L();
                rn rnVar2 = this.f37446a;
                return mediaController.setPlaylist(arrayListL, messageObject, rnVar2.H6, true ^ rnVar2.f42252w0.J, null);
            }
        }
        return false;
    }

    @Override
    public final void I1() {
        rn rnVar = this.f37446a;
        if (rnVar.T0 == null || rnVar.getParentActivity() == null) {
            return;
        }
        c31.T(rnVar.T0.getContext(), rnVar, false, ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider, null);
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        rn rnVar = this.f37446a;
        rnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        rnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        i(s1Var, true, false, true);
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        qi qiVar;
        MessageObject messageObject = s1Var.getMessageObject();
        cg.w1 w1Var = null;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int size = -1;
                for (int i10 = 0; i10 < tL_messageMediaPaidMedia.extended_media.size(); i10++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i10);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            size = arrayList.size();
                        }
                        TLRPC.TL_message tL_messageC7 = rn.C7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            tL_messageC7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            tL_messageC7.attachPath = message.attachPath;
                        }
                        tL_messageC7.media = tL_messageExtendedMedia.media;
                        tL_messageC7.noforwards = true;
                        arrayList.add(new MessageObject(messageObject.currentAccount, tL_messageC7, false, true));
                    }
                }
                if (size <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer photoViewerT1 = PhotoViewer.t1();
                rn rnVar = this.f37446a;
                photoViewerT1.K2(null, rnVar, rnVar.f41983aa);
                PhotoViewer.t1().a2(arrayList, size, this.f37446a.a(), 0L, 0L, this.f37446a.Ca);
                return;
            }
            return;
        }
        rn rnVar2 = this.f37446a;
        we.d dVar = rnVar2.wb;
        if (dVar != null) {
            dVar.a(true);
            rnVar2.wb = null;
        }
        if (s1Var.getMessageObject() == null) {
            rnVar2.wb = null;
            qiVar = null;
        } else {
            qiVar = new qi(rnVar2, s1Var.getMessageObject().getId(), s1Var, 1);
            rnVar2.wb = qiVar;
        }
        hh.u7 u7VarY = hh.u7.y(((org.telegram.ui.ActionBar.n2) this.f37446a).currentAccount, false);
        Objects.requireNonNull(qiVar);
        ti tiVar = new ti(qiVar, 7);
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.c6 c6VarI = hh.u7.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(u7VarY.f10151a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectP = nh.b3.p(c6VarI, false);
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectP.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            w1Var = new cg.w1(u7VarY, ConnectionsManager.getInstance(u7VarY.f10151a).sendRequest(tL_payments_getPaymentForm, new gh.f1(u7VarY, messageObject, tL_inputInvoiceMessage, tiVar, 4)), 4);
        }
        if (w1Var != null) {
            qiVar.f49293b = w1Var;
            qiVar.d();
        }
    }

    @Override
    public final void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i10 = buttonCustom.f19608id;
        int i11 = 1;
        rn rnVar = this.f37446a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    rnVar.I7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i10 == 4) {
                        rnVar.N1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                boolean zCanManageMonoForum = ChatObject.canManageMonoForum(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f42026e);
                if (zCanManageMonoForum) {
                    ChatObject.canUserDoChannelDirectAdminAction(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f42026e, 5);
                }
                cg.c cVar = new cg.c(this, message, zCanManageMonoForum, messageObject, 8);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                rnVar.g7(cVar, hf.a.l(suggestedPost != null ? suggestedPost.price : null), !zCanManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        df dfVar = new df(10, this, message);
        Pattern pattern = org.telegram.ui.Components.y4.f34802a;
        Activity parentActivity = rnVar.getParentActivity();
        int i12 = 0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.g6.S(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.n4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.g1(i11, dfVar, editText));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        b2Var.J = new org.telegram.ui.Components.o1(editText, i12);
        frameLayout.addView(editText, h7.z5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bg(editText, 3), 100L);
        rnVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    @Override
    public final boolean L0(long j10) {
        rn rnVar = this.f37446a;
        TLRPC.Chat chat = rnVar.f42026e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return rnVar.getMessagesController().isOwner(rnVar.f42026e.f22380id, j10);
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        ImageLocation forDocument;
        String str2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        rn rnVar = this.f37446a;
        if (!zIsEmpty) {
            we.e.s(rnVar.getParentActivity(), "https://" + rnVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        ag.y2 y2Var = new ag.y2(rnVar, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, user, null, null, rnVar.f41983aa);
        s1Var.getLocationOnScreen(new int[2]);
        y2Var.f724r0 = s1Var.getNameStatusX();
        y2Var.f725s0 = s1Var.getNameStatusY();
        y2Var.f728v0 = s1Var.getScaleX();
        y2Var.f726t0 = s1Var.getLeft();
        y2Var.f727u0 = s1Var.getTop();
        y2Var.f729w0 = s1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            y2Var.f723q0 = Integer.valueOf(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23303r8[colorId]));
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            y2Var.f723q0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.i5 i5Var = s1Var.f25278bc;
        if (i5Var != null && (i5Var.f29229f[0] instanceof org.telegram.ui.Components.k5)) {
            y2Var.f728v0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(rnVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(document);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    str2 = "160_160_g";
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = ImageLocation.getForDocument(document);
                    str2 = "160_160";
                }
                ImageLocation imageLocation = forDocument;
                String str3 = str2;
                n9Var.setLayerNum(7);
                n9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                n9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = y2Var.f723q0;
                    n9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23373v6), PorterDuff.Mode.SRC_IN));
                    y2Var.f731y0 = MessageObject.getInputStickerSet(document);
                } else {
                    y2Var.f731y0 = MessageObject.getInputStickerSet(document);
                }
                y2Var.f730x0 = n9Var;
                y2Var.A0 = true;
            }
        }
        rnVar.showDialog(y2Var);
    }

    @Override
    public final void M(org.telegram.ui.Cells.s1 s1Var) {
        rn rnVar = this.f37446a;
        rnVar.f42223ta.l(s1Var, rnVar, true);
        rnVar.f42213t0.I0(false);
    }

    @Override
    public final void M0(org.telegram.ui.Cells.s1 s1Var) {
        e5.u uVar;
        MessageObject.GroupedMessages groupedMessages;
        int i10;
        rn rnVar = this.f37446a;
        dh.k kVar = rnVar.T9;
        if (kVar == null) {
            return;
        }
        HashMap map = kVar.f5032a;
        dh.j jVar = (dh.j) map.get(dh.k.b(s1Var));
        org.telegram.ui.Components.ec ecVarV = null;
        MessageObject messageObject = jVar != null ? jVar.A : null;
        dh.j jVar2 = (dh.j) rnVar.T9.f5032a.get(dh.k.b(s1Var));
        long j10 = (jVar2 == null || (i10 = jVar2.N) == -1) ? 0L : jVar2.f5029w[i10].d;
        if (messageObject != null && j10 != 0) {
            if (!org.telegram.ui.Components.y4.h(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, j10, false)) {
                ArrayList<MessageObject> arrayListM = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) rnVar.f42219t6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayListM == null) {
                    arrayListM = org.telegram.messenger.y1.m(messageObject);
                }
                boolean z10 = j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j11 = j10;
                e5.u uVar2 = new e5.u(this, arrayListM, j11, 18);
                if (z10) {
                    uVar2.run();
                    uVar = null;
                } else {
                    uVar = uVar2;
                }
                ecVarV = org.telegram.ui.Components.mc.v(rnVar.getParentActivity(), rnVar, null, 1, j11, 1, rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), 5000, false, uVar);
                ecVarV.f28021k = true;
                ecVarV.k(ecVarV.f28016e instanceof org.telegram.ui.Components.pb);
            }
        }
        dh.j jVar3 = (dh.j) map.get(dh.k.b(s1Var));
        if (jVar3 != null) {
            if (ecVarV == null) {
                jVar3.N = -1;
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.jb jbVar = ecVarV.f28016e;
            if (!(jbVar instanceof org.telegram.ui.Components.mb)) {
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.mb mbVar = (org.telegram.ui.Components.mb) jbVar;
            jVar3.S = mbVar;
            mbVar.f30638a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = jVar3.S.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new dh.f(0, jVar3, viewTreeObserver));
        }
    }

    @Override
    public final boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        jv0 jv0Var;
        TLRPC.PollAnswer pollAnswer2;
        jv0 jv0Var2;
        fv0 fv0Var;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.b70 b70VarG;
        MessageObject messageObject;
        rn rnVar;
        org.telegram.ui.Components.b70 b70Var;
        se seVar;
        jv0 jv0Var3;
        MessageObject messageObject2;
        int size;
        int i10;
        ViewGroup viewGroup;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int iDp;
        int iDp2;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        byte[] bArr;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z16;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.PollAnswer pollAnswer3;
        boolean z17;
        boolean z18;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        rn rnVar2 = this.f37446a;
        if (rnVar2.getParentActivity() != null && rnVar2.getParentActivity() != null) {
            lh.w3 w3Var = rnVar2.f42214t1;
            if (w3Var != null && w3Var.R) {
                w3Var.e(true);
            }
            ol olVar = rnVar2.f42265x1;
            if (olVar != null && olVar.R) {
                olVar.e(true);
            }
            MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                rnVar2.Z4 = primaryMessageObject;
                rnVar2.f41978a5 = null;
                jv0 jv0Var4 = new jv0(rnVar2.getParentActivity(), rnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                jv0Var4.H = s1Var;
                jv0Var4.L = bArr3;
                MessageObject messageObject3 = s1Var.getMessageObject();
                jv0Var4.D = messageObject3;
                jv0Var4.E = messageObject3 != null && messageObject3.isOutOwner();
                org.telegram.ui.Cells.s1 s1Var2 = jv0Var4.H;
                fv0 fv0Var2 = jv0Var4.d;
                if (s1Var2 != null) {
                    jv0Var4.I = rnVar2.f42160o9 - AndroidUtilities.dp(4.0f);
                    jv0Var4.J = s1Var.f25439n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        jv0Var4.I = view.getY() + jv0Var4.I;
                        jv0Var4.J = view.getY() + jv0Var4.J;
                    }
                    int width = jv0Var4.H.getWidth();
                    int height = jv0Var4.H.getHeight();
                    jv0Var4.H.getHeight();
                    hv0 hv0Var = new hv0(jv0Var4, jv0Var4.getContext(), UserConfig.selectedAccount, jv0Var4.H.getResourcesProvider(), bArr3, width, height);
                    jv0Var = jv0Var4;
                    jv0Var.F = hv0Var;
                    jv0Var.H.g1(hv0Var);
                    jv0Var.F.h1(jv0Var.H);
                    jv0Var.F.setDelegate(new w9.d(19));
                    hv0 hv0Var2 = jv0Var.F;
                    MessageObject messageObject4 = jv0Var.D;
                    MessageObject.GroupedMessages currentMessagesGroup = jv0Var.H.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = jv0Var.H;
                    hv0Var2.W3(messageObject4, currentMessagesGroup, s1Var3.B, s1Var3.A, s1Var3.C, false);
                    hv0 hv0Var3 = jv0Var.F;
                    hv0Var3.I7 = bArr3;
                    fv0Var2.addView(hv0Var3, new FrameLayout.LayoutParams(jv0Var.H.getWidth(), height, 51));
                    iv0 iv0Var = new iv0(jv0Var.getContext(), UserConfig.selectedAccount, jv0Var.H.getResourcesProvider(), width, height, 0);
                    jv0Var.G = iv0Var;
                    jv0Var.H.i1(iv0Var);
                    jv0Var.H.g1(jv0Var.G);
                    jv0Var.G.h1(jv0Var.H);
                    jv0Var.G.setDelegate(new e7.v(19));
                    iv0 iv0Var2 = jv0Var.G;
                    MessageObject messageObject5 = jv0Var.D;
                    MessageObject.GroupedMessages currentMessagesGroup2 = jv0Var.H.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var4 = jv0Var.H;
                    iv0Var2.W3(messageObject5, currentMessagesGroup2, s1Var4.B, s1Var4.A, s1Var4.C, false);
                    fv0Var2.addView(jv0Var.G, new FrameLayout.LayoutParams(jv0Var.H.getWidth(), height, 51));
                } else {
                    jv0Var = jv0Var4;
                }
                lh.h1 h1Var = jv0Var.f39520f;
                h1Var.bringToFront();
                fv0 fv0Var3 = jv0Var.f39519e;
                fv0Var3.bringToFront();
                jv0Var.f39521n.bringToFront();
                h1Var.w(false);
                Context context = jv0Var.f39513a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.c6 c6Var = jv0Var.f39515b;
                org.telegram.ui.Components.b70 b70VarG2 = org.telegram.ui.Components.b70.G(fv0Var2, c6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(jv0Var.D);
                jv0Var.R = MessageObject.isVoted(tL_messageMediaPoll2);
                int i13 = 0;
                while (true) {
                    if (i13 >= tL_messageMediaPoll2.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll2.poll.answers.get(i13).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll2.poll.answers.get(i13);
                        break;
                    }
                    i13++;
                }
                jg.a aVar = jv0Var.C;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll2.poll;
                    boolean z19 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z20 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll2.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll2;
                        bArr = bArr3;
                        fv0Var = fv0Var2;
                        pollAnswerVoters = null;
                        z16 = false;
                    } else {
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        z16 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i14 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i14);
                            int i15 = i14 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            fv0 fv0Var4 = fv0Var2;
                            boolean zEquals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (zEquals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (zEquals) {
                                    z16 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll2.poll.answers;
                                int size3 = arrayList4.size();
                                int i16 = 0;
                                while (i16 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i16);
                                    int i17 = i16 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i18 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i16 = i17;
                                    size3 = i18;
                                }
                            }
                            fv0Var2 = fv0Var4;
                            i14 = i15;
                            bArr3 = bArr4;
                            tL_messageMediaPoll2 = tL_messageMediaPoll2;
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll2;
                        bArr = bArr3;
                        fv0Var = fv0Var2;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        arrayList = arrayList3;
                        bArr2 = bArr;
                    } else {
                        zg.r rVar = new zg.r(context, rnVar2.getCurrentAccount(), c6Var);
                        org.telegram.ui.Components.b70 b70VarJ = b70VarG2.J();
                        b70VarJ.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        mg.a aVarJ = ng.c.j(c6Var);
                        View view3 = b70VarJ.B;
                        if (view3 != null) {
                            z18 = false;
                            lg.d dVarC = aVar.c(view3, null, false);
                            dVarC.n(aVarJ);
                            view3.setBackground(dVarC);
                        } else {
                            z18 = false;
                        }
                        b70VarJ.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lt0(b70VarG2, 25), z18);
                        b70VarJ.k();
                        arrayList = arrayList3;
                        byte[] bArr5 = bArr;
                        View viewA = rVar.a(rnVar2, jv0Var.D.getDialogId(), jv0Var.D.getId(), bArr5, pollAnswerVoters.voters, new ib0(7, jv0Var, rnVar2));
                        rnVar2 = rnVar2;
                        bArr2 = bArr5;
                        b70VarJ.q(viewA);
                        rVar.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        rVar.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        rVar.f50857a.d(pollAnswerVoters.recent_voters, false);
                        rVar.setLayoutParams(h7.z5.n(-1, 48));
                        rVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 12, 0));
                        rVar.setOnClickListener(new u70(15, b70VarG2, b70VarJ));
                        b70VarG2.q(rVar);
                        b70VarG2.k();
                    }
                    if (!z19) {
                        jv0Var2 = jv0Var;
                        pollAnswer3 = pollAnswer2;
                    } else if (z16) {
                        int i19 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        jv0Var2 = jv0Var;
                        rn rnVar3 = rnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable bv0Var = new bv0(jv0Var2, z20, rnVar3, arrayList, pollAnswer6);
                        rnVar2 = rnVar3;
                        pollAnswer3 = pollAnswer6;
                        b70VarG2.c(i19, string, bv0Var, false);
                    } else {
                        jv0Var2 = jv0Var;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        if (zg.i.a(jv0Var2.D) == 0) {
                            b70VarG2.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new bv0(jv0Var2, z20, pollAnswer3, rnVar2, arrayList6), false);
                        }
                    }
                    if (rnVar2.E6()) {
                        b70VarG2.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new bf0(jv0Var2, rnVar2, pollAnswer3, 21), false);
                    }
                    if (jv0Var2.D.getDialogId() >= 0 || pollAnswer3.option == null) {
                        z17 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(jv0Var2.D.currentAccount);
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(jv0Var2.D.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-jv0Var2.D.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(jv0Var2.D.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z17 = false;
                        b70VarG2.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new zs0(3, jv0Var2, sb2.toString()), false);
                    }
                    b70VarG2.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new zs0(4, jv0Var2, pollAnswer3), z17);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(jv0Var2.D.currentAccount).getClientUserId();
                        long currentTime = ConnectionsManager.getInstance(jv0Var2.D.currentAccount).getCurrentTime();
                        rn rnVar4 = rnVar2;
                        long j10 = MessagesController.getInstance(jv0Var2.D.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + ((long) pollAnswer3.date);
                        if (!jv0Var2.D.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j10))) {
                                b70VarG2.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new zs0(5, jv0Var2, bArr2), true);
                            }
                        }
                        b70VarG2.k();
                        TLObject userOrChat = MessagesController.getInstance(jv0Var2.D.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        rnVar2 = rnVar4;
                        v90 v90Var = new v90(jv0Var2, peerDialogId, rnVar2, 2);
                        Context context2 = b70VarG2.f26967e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i20 = org.telegram.ui.ActionBar.g6.f23144i6;
                        org.telegram.ui.ActionBar.c6 c6Var2 = b70VarG2.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i20, c6Var2), 0, 12));
                        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context2);
                        n9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                        y8Var.p(userOrChat);
                        n9Var.e(userOrChat, y8Var);
                        frameLayout.addView(n9Var, h7.z5.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var2, textView, 1, 14.0f);
                        textView.setText(charSequenceReplaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.q2(25, b70VarG2, v90Var));
                        b70VarG2.r(frameLayout, h7.z5.n(-1, -2));
                    }
                } else {
                    jv0Var2 = jv0Var;
                    fv0Var = fv0Var2;
                    primaryMessageObject = primaryMessageObject;
                }
                b70VarG2.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                b70VarG2.Q(aVar, ng.c.j(c6Var), false);
                b70VarG2.Y();
                ViewGroup viewGroup2 = b70VarG2.A;
                jv0Var2.N = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                jv0Var2.N.setPivotY(0.0f);
                fv0Var3.addView(jv0Var2.N, h7.z5.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                rnVar2.n8(primaryMessageObject, arrayList7, arrayList8, arrayList9);
                se seVar2 = new se(rnVar2, 6);
                MessageObject messageObject6 = jv0Var2.D;
                List<TLRPC.TL_availableReaction> enabledReactionsList = rnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z21 = (rnVar2.x() || rnVar2.c() || rnVar2.f42039f != null || !messageObject6.hasReactions() || (ChatObject.isChannel(rnVar2.f42026e) && !rnVar2.f42026e.megagroup) || ChatObject.isMonoForum(rnVar2.f42026e) || enabledReactionsList.isEmpty() || !messageObject6.messageOwner.reactions.can_see_list || messageObject6.isSecretMedia()) ? false : true;
                boolean z22 = !messageObject6.isForwardedChannelPost() ? messageObject6.isSecretMedia() || rnVar2.N3 == 5 || rnVar2.x() || rnVar2.c() || !messageObject6.isReactionsAvailable() || ((((chatFull = rnVar2.V7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(rnVar2.f42026e)) && rnVar2.f42039f == null && !ChatObject.isMonoForum(rnVar2.f42026e))) || enabledReactionsList.isEmpty()) : (chatFull3 = rnVar2.getMessagesController().getChatFull(-messageObject6.getFromChatId())) != null && (rnVar2.x() || rnVar2.N3 == 5 || rnVar2.c() || !messageObject6.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
                if (!z21 && !rnVar2.c() && rnVar2.f42026e != null && messageObject6.isOutOwner() && messageObject6.isSent() && !messageObject6.isEditing() && !messageObject6.isSending() && !messageObject6.isSendError() && !messageObject6.isContentUnread() && !messageObject6.isUnread() && ConnectionsManager.getInstance(rnVar2.getCurrentAccount()).getCurrentTime() - messageObject6.messageOwner.date < rnVar2.getMessagesController().chatReadMarkExpirePeriod && ((ChatObject.isMegagroup(rnVar2.f42026e) || !ChatObject.isChannel(rnVar2.f42026e)) && (chatFull2 = rnVar2.V7) != null && chatFull2.participants_count <= rnVar2.getMessagesController().chatReadMarkSizeThreshold && !(messageObject6.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                    if (rnVar2.N3 != 3 && messageObject6.canSetReaction() && !ChatObject.isMonoForum(rnVar2.f42026e)) {
                        z10 = true;
                    }
                    if (rnVar2.f42026e == null && !messageObject6.isOut() && ChatObject.isMonoForum(rnVar2.f42026e) && ChatObject.canManageMonoForum(rnVar2.getCurrentAccount(), rnVar2.f42026e)) {
                        int i21 = ((-rnVar2.f42026e.linked_monoforum_id) > messageObject6.getFromChatId() ? 1 : ((-rnVar2.f42026e.linked_monoforum_id) == messageObject6.getFromChatId() ? 0 : -1));
                    }
                    if (!z21 || rnVar2.f42026e != null || rnVar2.h != null || (user = rnVar2.f42039f) == null || UserObject.isUserSelf(user) || UserObject.isReplyUser(rnVar2.f42039f) || UserObject.isAnonymous(rnVar2.f42039f)) {
                        z11 = false;
                    } else {
                        TLRPC.User user2 = rnVar2.f42039f;
                        if (user2.bot || UserObject.isService(user2.f22527id) || (((userFull = rnVar2.W7) != null && userFull.read_dates_private) || rnVar2.c() || !messageObject6.isOutOwner() || !messageObject6.isSent() || messageObject6.isEditing() || messageObject6.isSending() || messageObject6.isSendError() || messageObject6.isContentUnread() || messageObject6.isUnread() || rnVar2.getConnectionsManager().getCurrentTime() - messageObject6.messageOwner.date >= rnVar2.getMessagesController().pmReadDateExpirePeriod || (messageObject6.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                    }
                    TLRPC.User user3 = rnVar2.f42039f;
                    z12 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(rnVar2.f42039f))) || rnVar2.c() || !messageObject6.isEdited() || (messageObject6.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                    org.telegram.ui.ActionBar.c6 resourceProvider = rnVar2.getResourceProvider();
                    if (!z21 || z10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    b70VarG = org.telegram.ui.Components.b70.G(fv0Var, resourceProvider, null, z13);
                    if (z10) {
                        rh0 rh0Var = new rh0(jv0Var2.getContext(), rnVar2.getCurrentAccount(), messageObject6, rnVar2.f42026e);
                        FrameLayout frameLayout2 = new FrameLayout(jv0Var2.getContext());
                        frameLayout2.addView(rh0Var, h7.z5.c(36.0f, -1));
                        org.telegram.ui.Components.b70 b70VarJ2 = b70VarG.J();
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, jv0Var2.getContext(), jv0Var2.f39515b, true, false);
                        f1Var.setItemHeight(44);
                        jv0 jv0Var5 = jv0Var2;
                        f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        org.telegram.ui.Components.s5 textView2 = f1Var.getTextView();
                        if (LocaleController.isRTL) {
                            iDp = 0;
                        } else {
                            iDp = AndroidUtilities.dp(40.0f);
                        }
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(40.0f);
                        } else {
                            iDp2 = 0;
                        }
                        textView2.setPadding(iDp, 0, iDp2, 0);
                        FrameLayout frameLayout3 = new FrameLayout(jv0Var5.getContext());
                        LinearLayout linearLayout = new LinearLayout(jv0Var5.getContext());
                        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                        linearLayout.setOrientation(1);
                        messageObject = messageObject6;
                        rnVar = rnVar2;
                        org.telegram.ui.Components.zk0 zk0VarA = rh0Var.a();
                        frameLayout3.addView(f1Var);
                        linearLayout.addView(frameLayout3);
                        linearLayout.addView(new org.telegram.ui.ActionBar.k1(jv0Var5.getContext(), c6Var), h7.z5.n(-1, 8));
                        frameLayout3.setOnClickListener(new cv0(b70VarG));
                        seVar = seVar2;
                        dv0 dv0Var = new dv0(jv0Var5, rh0Var, rnVar, zk0VarA, linearLayout, b70VarG, b70VarJ2);
                        b70Var = b70VarG;
                        jv0Var3 = jv0Var5;
                        rh0Var.setOnClickListener(dv0Var);
                        linearLayout.addView(zk0VarA, h7.z5.n(-1, -2));
                        b70VarJ2.q(linearLayout);
                        b70Var.q(frameLayout2);
                        b70Var.k();
                    } else {
                        messageObject = messageObject6;
                        rnVar = rnVar2;
                        b70Var = b70VarG;
                        seVar = seVar2;
                        jv0Var3 = jv0Var2;
                        if (z11) {
                            if (z12) {
                                messageObject2 = messageObject;
                                b70Var.r(new org.telegram.ui.Components.kb0(jv0Var3.getContext(), 1, messageObject, new zu0(jv0Var3, 2), jv0Var3.f39515b), h7.z5.n(-1, 36));
                                b70Var.k();
                            }
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                ArrayList arrayList10 = arrayList8;
                                b70Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList10.get(i10), new ol0(jv0Var3, seVar, ((Integer) arrayList9.get(i10)).intValue(), 4), false);
                                i10++;
                                size = size;
                                arrayList7 = arrayList7;
                                arrayList8 = arrayList10;
                            }
                            b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                            b70Var.Q(aVar, ng.c.j(c6Var), false);
                            b70Var.Y();
                            ViewGroup viewGroup3 = b70Var.A;
                            jv0Var3.P = viewGroup3;
                            viewGroup3.setPivotX(0.0f);
                            jv0Var3.P.setPivotY(0.0f);
                            fv0Var3.addView(jv0Var3.P, h7.z5.e(-2, -2, 51));
                            viewGroup = jv0Var3.P;
                            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(jv0Var3, 6));
                                jv0Var3.P.setOnTouchListener(new g0(jv0Var3, 5));
                            }
                            if (z22) {
                                if (rnVar.getUserConfig().getClientUserId() == rnVar.a()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    i11 = 3;
                                } else {
                                    i11 = 0;
                                }
                                rn rnVar5 = rnVar;
                                org.telegram.ui.Components.wj0 wj0Var = new org.telegram.ui.Components.wj0(i11, rnVar5.getCurrentAccount(), jv0Var3.getContext(), rnVar5, jv0Var3.f39515b);
                                wj0Var.f34233a = true;
                                int iDp3 = AndroidUtilities.dp(4.0f);
                                if (LocaleController.isRTL) {
                                    i12 = 0;
                                } else {
                                    i12 = 24;
                                }
                                float f10 = 22;
                                wj0Var.setPadding(iDp3 + i12, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                                wj0Var.setDelegate(new ev0(jv0Var3, rnVar5, messageObject2, wj0Var));
                                jv0Var3.M = wj0Var;
                                fv0Var3.addView(wj0Var, h7.z5.e(-2, (int) ((wj0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                                z14 = true;
                                wj0Var.p(messageObject2, rnVar5.V7, true);
                                jv0Var3.M.setTransitionProgress(1.0f);
                            } else {
                                z14 = true;
                            }
                            jv0Var3.e();
                            jv0Var3.f39514a0 = new om(this, 0);
                            jv0Var3.show();
                            return z14;
                        }
                        b70Var.r(new org.telegram.ui.Components.kb0(jv0Var3.getContext(), 0, messageObject, new zu0(jv0Var3, 1), jv0Var3.f39515b), h7.z5.n(-1, 36));
                        b70Var.k();
                    }
                    messageObject2 = messageObject;
                    size = arrayList7.size();
                    i10 = 0;
                    while (i10 < size) {
                        ArrayList arrayList11 = arrayList8;
                        b70Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList11.get(i10), new ol0(jv0Var3, seVar, ((Integer) arrayList9.get(i10)).intValue(), 4), false);
                        i10++;
                        size = size;
                        arrayList7 = arrayList7;
                        arrayList8 = arrayList11;
                    }
                    b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                    b70Var.Q(aVar, ng.c.j(c6Var), false);
                    b70Var.Y();
                    ViewGroup viewGroup4 = b70Var.A;
                    jv0Var3.P = viewGroup4;
                    viewGroup4.setPivotX(0.0f);
                    jv0Var3.P.setPivotY(0.0f);
                    fv0Var3.addView(jv0Var3.P, h7.z5.e(-2, -2, 51));
                    viewGroup = jv0Var3.P;
                    if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(jv0Var3, 6));
                        jv0Var3.P.setOnTouchListener(new g0(jv0Var3, 5));
                    }
                    if (z22) {
                        if (rnVar.getUserConfig().getClientUserId() == rnVar.a()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            i11 = 3;
                        } else {
                            i11 = 0;
                        }
                        rn rnVar6 = rnVar;
                        org.telegram.ui.Components.wj0 wj0Var2 = new org.telegram.ui.Components.wj0(i11, rnVar6.getCurrentAccount(), jv0Var3.getContext(), rnVar6, jv0Var3.f39515b);
                        wj0Var2.f34233a = true;
                        int iDp4 = AndroidUtilities.dp(4.0f);
                        if (LocaleController.isRTL) {
                            i12 = 0;
                        } else {
                            i12 = 24;
                        }
                        float f11 = 22;
                        wj0Var2.setPadding(iDp4 + i12, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f11));
                        wj0Var2.setDelegate(new ev0(jv0Var3, rnVar6, messageObject2, wj0Var2));
                        jv0Var3.M = wj0Var2;
                        fv0Var3.addView(wj0Var2, h7.z5.e(-2, (int) ((wj0Var2.getTopOffset() / AndroidUtilities.density) + 52.0f + f11), 51));
                        z14 = true;
                        wj0Var2.p(messageObject2, rnVar6.V7, true);
                        jv0Var3.M.setTransitionProgress(1.0f);
                    } else {
                        z14 = true;
                    }
                    jv0Var3.e();
                    jv0Var3.f39514a0 = new om(this, 0);
                    jv0Var3.show();
                    return z14;
                }
                z10 = false;
                if (rnVar2.f42026e == null) {
                }
                if (z21) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                TLRPC.User user4 = rnVar2.f42039f;
                if (user4 == null) {
                }
                org.telegram.ui.ActionBar.c6 resourceProvider2 = rnVar2.getResourceProvider();
                if (z21) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                b70VarG = org.telegram.ui.Components.b70.G(fv0Var, resourceProvider2, null, z13);
                if (z10) {
                    rh0 rh0Var2 = new rh0(jv0Var2.getContext(), rnVar2.getCurrentAccount(), messageObject6, rnVar2.f42026e);
                    FrameLayout frameLayout4 = new FrameLayout(jv0Var2.getContext());
                    frameLayout4.addView(rh0Var2, h7.z5.c(36.0f, -1));
                    org.telegram.ui.Components.b70 b70VarJ3 = b70VarG.J();
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, jv0Var2.getContext(), jv0Var2.f39515b, true, false);
                    f1Var2.setItemHeight(44);
                    jv0 jv0Var6 = jv0Var2;
                    f1Var2.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    org.telegram.ui.Components.s5 textView3 = f1Var2.getTextView();
                    if (LocaleController.isRTL) {
                        iDp = 0;
                    } else {
                        iDp = AndroidUtilities.dp(40.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(40.0f);
                    } else {
                        iDp2 = 0;
                    }
                    textView3.setPadding(iDp, 0, iDp2, 0);
                    FrameLayout frameLayout5 = new FrameLayout(jv0Var6.getContext());
                    LinearLayout linearLayout2 = new LinearLayout(jv0Var6.getContext());
                    linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                    linearLayout2.setOrientation(1);
                    messageObject = messageObject6;
                    rnVar = rnVar2;
                    org.telegram.ui.Components.zk0 zk0VarA2 = rh0Var2.a();
                    frameLayout5.addView(f1Var2);
                    linearLayout2.addView(frameLayout5);
                    linearLayout2.addView(new org.telegram.ui.ActionBar.k1(jv0Var6.getContext(), c6Var), h7.z5.n(-1, 8));
                    frameLayout5.setOnClickListener(new cv0(b70VarG));
                    seVar = seVar2;
                    dv0 dv0Var2 = new dv0(jv0Var6, rh0Var2, rnVar, zk0VarA2, linearLayout2, b70VarG, b70VarJ3);
                    b70Var = b70VarG;
                    jv0Var3 = jv0Var6;
                    rh0Var2.setOnClickListener(dv0Var2);
                    linearLayout2.addView(zk0VarA2, h7.z5.n(-1, -2));
                    b70VarJ3.q(linearLayout2);
                    b70Var.q(frameLayout4);
                    b70Var.k();
                } else {
                    messageObject = messageObject6;
                    rnVar = rnVar2;
                    b70Var = b70VarG;
                    seVar = seVar2;
                    jv0Var3 = jv0Var2;
                    if (z11) {
                        if (z12) {
                            messageObject2 = messageObject;
                            b70Var.r(new org.telegram.ui.Components.kb0(jv0Var3.getContext(), 1, messageObject, new zu0(jv0Var3, 2), jv0Var3.f39515b), h7.z5.n(-1, 36));
                            b70Var.k();
                        }
                        size = arrayList7.size();
                        i10 = 0;
                        while (i10 < size) {
                            ArrayList arrayList12 = arrayList8;
                            b70Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList12.get(i10), new ol0(jv0Var3, seVar, ((Integer) arrayList9.get(i10)).intValue(), 4), false);
                            i10++;
                            size = size;
                            arrayList7 = arrayList7;
                            arrayList8 = arrayList12;
                        }
                        b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        b70Var.Q(aVar, ng.c.j(c6Var), false);
                        b70Var.Y();
                        ViewGroup viewGroup5 = b70Var.A;
                        jv0Var3.P = viewGroup5;
                        viewGroup5.setPivotX(0.0f);
                        jv0Var3.P.setPivotY(0.0f);
                        fv0Var3.addView(jv0Var3.P, h7.z5.e(-2, -2, 51));
                        viewGroup = jv0Var3.P;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(jv0Var3, 6));
                            jv0Var3.P.setOnTouchListener(new g0(jv0Var3, 5));
                        }
                        if (z22) {
                            if (rnVar.getUserConfig().getClientUserId() == rnVar.a()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i11 = 3;
                            } else {
                                i11 = 0;
                            }
                            rn rnVar7 = rnVar;
                            org.telegram.ui.Components.wj0 wj0Var3 = new org.telegram.ui.Components.wj0(i11, rnVar7.getCurrentAccount(), jv0Var3.getContext(), rnVar7, jv0Var3.f39515b);
                            wj0Var3.f34233a = true;
                            int iDp5 = AndroidUtilities.dp(4.0f);
                            if (LocaleController.isRTL) {
                                i12 = 0;
                            } else {
                                i12 = 24;
                            }
                            float f12 = 22;
                            wj0Var3.setPadding(iDp5 + i12, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f12));
                            wj0Var3.setDelegate(new ev0(jv0Var3, rnVar7, messageObject2, wj0Var3));
                            jv0Var3.M = wj0Var3;
                            fv0Var3.addView(wj0Var3, h7.z5.e(-2, (int) ((wj0Var3.getTopOffset() / AndroidUtilities.density) + 52.0f + f12), 51));
                            z14 = true;
                            wj0Var3.p(messageObject2, rnVar7.V7, true);
                            jv0Var3.M.setTransitionProgress(1.0f);
                        } else {
                            z14 = true;
                        }
                        jv0Var3.e();
                        jv0Var3.f39514a0 = new om(this, 0);
                        jv0Var3.show();
                        return z14;
                    }
                    b70Var.r(new org.telegram.ui.Components.kb0(jv0Var3.getContext(), 0, messageObject, new zu0(jv0Var3, 1), jv0Var3.f39515b), h7.z5.n(-1, 36));
                    b70Var.k();
                }
                messageObject2 = messageObject;
                size = arrayList7.size();
                i10 = 0;
                while (i10 < size) {
                    ArrayList arrayList13 = arrayList8;
                    b70Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList13.get(i10), new ol0(jv0Var3, seVar, ((Integer) arrayList9.get(i10)).intValue(), 4), false);
                    i10++;
                    size = size;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList13;
                }
                b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                b70Var.Q(aVar, ng.c.j(c6Var), false);
                b70Var.Y();
                ViewGroup viewGroup6 = b70Var.A;
                jv0Var3.P = viewGroup6;
                viewGroup6.setPivotX(0.0f);
                jv0Var3.P.setPivotY(0.0f);
                fv0Var3.addView(jv0Var3.P, h7.z5.e(-2, -2, 51));
                viewGroup = jv0Var3.P;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(jv0Var3, 6));
                    jv0Var3.P.setOnTouchListener(new g0(jv0Var3, 5));
                }
                if (z22) {
                    if (rnVar.getUserConfig().getClientUserId() == rnVar.a()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    rn rnVar8 = rnVar;
                    org.telegram.ui.Components.wj0 wj0Var4 = new org.telegram.ui.Components.wj0(i11, rnVar8.getCurrentAccount(), jv0Var3.getContext(), rnVar8, jv0Var3.f39515b);
                    wj0Var4.f34233a = true;
                    int iDp6 = AndroidUtilities.dp(4.0f);
                    if (LocaleController.isRTL) {
                        i12 = 0;
                    } else {
                        i12 = 24;
                    }
                    float f13 = 22;
                    wj0Var4.setPadding(iDp6 + i12, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f13));
                    wj0Var4.setDelegate(new ev0(jv0Var3, rnVar8, messageObject2, wj0Var4));
                    jv0Var3.M = wj0Var4;
                    fv0Var3.addView(wj0Var4, h7.z5.e(-2, (int) ((wj0Var4.getTopOffset() / AndroidUtilities.density) + 52.0f + f13), 51));
                    z14 = true;
                    wj0Var4.p(messageObject2, rnVar8.V7, true);
                    jv0Var3.M.setTransitionProgress(1.0f);
                } else {
                    z14 = true;
                }
                jv0Var3.e();
                jv0Var3.f39514a0 = new om(this, 0);
                jv0Var3.show();
                return z14;
            }
        }
        return false;
    }

    @Override
    public final void O(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String string = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, string), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.rl.m(R.string.CodeCopied, org.telegram.ui.Components.mc.a0(this.f37446a));
    }

    @Override
    public final void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String strB;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        MessageObject messageObject = s1Var.getMessageObject();
        File file = null;
        rn rnVar = this.f37446a;
        if (i10 == 19) {
            we.d dVar = rnVar.wb;
            if (dVar != null) {
                dVar.a(true);
            }
            final wm wmVar = s1Var.getMessageObject() != null ? new wm(this, s1Var, 2) : null;
            rnVar.wb = wmVar;
            final Activity parentActivity = rnVar.getParentActivity();
            final org.telegram.ui.ActionBar.c6 resourceProvider = rnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            wmVar.d();
            wmVar.f49293b = new cg.k(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String strB2 = cg.r.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j10 = ((long) messageObject.messageOwner.date) * 1000;
            cg.q0.d(messageObject, new Utilities.Callback(atomicBoolean, wmVar, z10, strB2, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {

                public final AtomicBoolean f2750a;

                public final we.d f2751b;

                public final boolean f2752c;
                public final String d;

                public final TLRPC.TL_messageMediaGiveaway f2753e;

                public final Context f2754f;

                public final c6 f2755g;

                {
                    this.f2753e = tL_messageMediaGiveaway2;
                    this.f2754f = parentActivity;
                    this.f2755g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.f2750a.get()) {
                        return;
                    }
                    this.f2751b.b();
                    boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z12 = this.f2752c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f2753e;
                    Context context = this.f2754f;
                    c6 c6Var = this.f2755g;
                    if (z11) {
                        r.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        r.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                    }
                }
            }, new cg.m(atomicBoolean, wmVar, 0));
            return;
        }
        if (i10 == 21) {
            g();
            return;
        }
        if (i10 == 84) {
            rnVar.ua(s1Var);
            return;
        }
        if (i10 == 80) {
            dh.g gVar = org.telegram.ui.Components.cg0.K;
            if (rnVar.getParentActivity() == null) {
                return;
            }
            rnVar.showDialog(new org.telegram.ui.Components.cg0(rnVar.getContext(), rnVar.getCurrentAccount(), messageObject, rnVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                rnVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i11 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            TLRPC.User user = j11 != 0 ? MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).getUser(Long.valueOf(j11)) : null;
            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f22527id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                rnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File sharingDirectory = AndroidUtilities.getSharingDirectory();
                    sharingDirectory.mkdirs();
                    file = new File(sharingDirectory, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                rnVar.showDialog(new org.telegram.ui.Components.be0(rnVar, null, user, null, file, oe.b.d(str, false), str3, str4, rnVar.f41983aa));
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        if (i10 == 30) {
            rnVar.presentFragment(new rn(com.google.android.recaptcha.internal.a.h(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            TLRPC.User user2 = j12 != 0 ? MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).getUser(Long.valueOf(j12)) : null;
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    strB = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    strB = !TextUtils.isEmpty(str5) ? oe.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    strB = org.telegram.messenger.y1.k(new StringBuilder("+"), user2.phone, oe.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f22527id);
                bundle2.putString("phone", strB);
                bundle2.putBoolean("addContact", true);
                rnVar.presentFragment(new js(bundle2));
                return;
            }
            return;
        }
        int i12 = 4;
        if (i10 == 23 || i10 == 24) {
            boolean z11 = i10 == 24;
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            we.d dVar2 = rnVar.wb;
            if (dVar2 != null) {
                dVar2.a(true);
            }
            rnVar.wb = s1Var.getMessageObject() != null ? new wm(this, s1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String strGroup = matcher.group(1);
                if (MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).getStickerSetByName(strGroup) == null) {
                    rnVar.wb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = strGroup;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    rnVar.wb.f49293b = new cg.w1(this, ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).sendRequest(tL_messages_getStickerSet, new lh.n3(i12, this, z11)), 24);
                    return;
                }
            }
            we.e.r(rnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, rnVar.wb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            rnVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                we.d dVar3 = rnVar.wb;
                if (dVar3 != null) {
                    dVar3.a(true);
                }
                rnVar.wb = s1Var.getMessageObject() != null ? new wm(this, s1Var, i12) : null;
                we.e.r(rnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, rnVar.wb, null, false, rnVar.getMessagesController().sponsoredLinksInappAllow, false);
                return;
            }
            return;
        }
        TLRPC.WebPage storyMentionWebpage = messageObject.getStoryMentionWebpage();
        if (storyMentionWebpage == null && (message = messageObject.messageOwner) != null && (messageMedia2 = message.media) != null) {
            storyMentionWebpage = messageMedia2.webpage;
        }
        if (storyMentionWebpage == null) {
            return;
        }
        if (storyMentionWebpage.attributes != null) {
            for (int i13 = 0; i13 < storyMentionWebpage.attributes.size(); i13++) {
                if ((storyMentionWebpage.attributes.get(i13) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i13)).storyItem) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    rnVar.getOrCreateStoryViewer().G(rnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, jh.b7.a(rnVar.f42213t0));
                    return;
                }
            }
        }
        if (rnVar.ea(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
            return;
        }
        we.d dVar4 = rnVar.wb;
        if (dVar4 != null) {
            dVar4.a(true);
        }
        rnVar.wb = s1Var.getMessageObject() != null ? new wm(this, s1Var, i11) : null;
        we.e.r(rnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, rnVar.wb, null, false, true, false);
    }

    @Override
    public final ou0 O1() {
        return this.f37446a.f42210sa;
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f37446a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        rn rnVar = this.f37446a;
        rnVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, rnVar);
    }

    @Override
    public final boolean Q1(long j10) {
        rn rnVar = this.f37446a;
        TLRPC.Chat chat = rnVar.f42026e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return rnVar.getMessagesController().isAdmin(rnVar.f42026e.f22380id, j10);
    }

    @Override
    public final void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        rn rnVar = this.f37446a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (rnVar.P5 != j10) {
                rnVar.presentFragment(rn.R9(j10));
            } else {
                rnVar.W0.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            rnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        this.f37446a.U7(characterStyle, z10, s1Var.getMessageObject(), s1Var);
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
        Integer numValueOf;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        TLRPC.Message message;
        String str2;
        long peerDialogId;
        boolean z11;
        TLRPC.Chat chat;
        TLRPC.Message message2;
        TLRPC.Message message3;
        int i11;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        Integer num;
        byte[] bArr2;
        we.d dVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        LaunchActivity launchActivity;
        final m0 m0Var;
        ArrayList arrayList;
        String str3;
        int i12;
        Bundle bundle;
        TLRPC.Chat chat2;
        org.telegram.ui.ActionBar.n2 n2Var2;
        TLRPC.Chat chat3;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message4;
        TL_stories.StoryItem storyItem;
        boolean zD = d();
        rn rnVar = this.f37446a;
        if (!zD && !z10) {
            if ((((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) && !rnVar.Y8.A(s1Var.getMessageObject())) {
                rn.b2(rnVar, s1Var, !s1Var.h3(f10), f10, f11);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(rnVar.f42039f)) {
            t(s1Var);
            return;
        }
        MessageObject messageObject2 = s1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message4 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.y1.q(R.string.StoryNotFound, org.telegram.ui.Components.mc.a0(rnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message4.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            jh.l7.b(storyItem, rnVar.f42039f);
            rnVar.getOrCreateStoryViewer().G(rnVar.getParentActivity(), storyItem, jh.b7.a(rnVar.f42213t0));
            return;
        }
        TLRPC.Message message5 = messageObject2.messageOwner;
        int i13 = -1;
        if (message5 == null || (messageReplyHeader7 = message5.reply_to) == null || (messageReplyHeader7.flags & 2048) == 0) {
            if (message5 != null && (messageReplyHeader2 = message5.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                numValueOf = null;
                str = null;
            } else if (message5 == null || (messageReplyHeader = message5.reply_to) == null || !messageReplyHeader.quote) {
                numValueOf = null;
            } else {
                String str4 = messageReplyHeader.quote_text;
                i13 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str4;
                numValueOf = null;
                bArr = null;
            }
            long peerDialogId2 = rnVar.P5;
            message = messageObject2.messageOwner;
            if (message == null && (messageReplyHeader6 = message.reply_to) != null) {
                TLRPC.Peer peer = messageReplyHeader6.reply_to_peer_id;
                if (peer == null) {
                    str2 = str;
                    TLRPC.MessageFwdHeader messageFwdHeader = messageReplyHeader6.reply_from;
                    if (messageFwdHeader != null) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 == null) {
                            TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                            if (peer3 != null) {
                                peerDialogId2 = DialogObject.getPeerDialogId(peer3);
                            } else {
                                peerDialogId = Long.MAX_VALUE;
                            }
                        } else if (peer2 instanceof TLRPC.TL_peerUser) {
                            peerDialogId = Long.MAX_VALUE;
                        } else {
                            peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                        }
                        z11 = false;
                    }
                } else if (peer instanceof TLRPC.TL_peerUser) {
                    str2 = str;
                    if (DialogObject.getPeerDialogId(peer) != rnVar.P5) {
                        peerDialogId = Long.MAX_VALUE;
                    }
                    z11 = false;
                } else {
                    peerDialogId = DialogObject.getPeerDialogId(peer);
                    str2 = str;
                    z11 = true;
                }
                if (peerDialogId < 0) {
                    chat = rnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                } else {
                    chat = null;
                }
                if (peerDialogId != Long.MAX_VALUE) {
                    boolean z12 = z11;
                    if (peerDialogId != rnVar.P5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                        if (((peerDialogId != rnVar.P5 && (!ChatObject.isForum(rnVar.f42026e) || !z12)) || peerDialogId == Long.MAX_VALUE) && (rnVar.N3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == rnVar.b()))) {
                            int i14 = rnVar.N3;
                            if (i14 == 2 || i14 == 1) {
                                rnVar.R8.P0(i10);
                                rnVar.finishFragment();
                                return;
                            }
                            if (bArr != null) {
                                rnVar.N7 = bArr;
                            } else if (numValueOf != null) {
                                rnVar.M7 = numValueOf;
                            } else {
                                TLRPC.Message message6 = messageObject2.messageOwner;
                                if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                    rnVar.J7 = true;
                                    rnVar.L7 = messageReplyHeader5.quote_text;
                                    rnVar.O7 = i13;
                                    rnVar.I7 = true;
                                }
                            }
                            gh.e1 e1Var = new gh.e1(this, i10, messageObject2, numValueOf, bArr, 15);
                            if (!rnVar.f42252w0.J) {
                                e1Var.run();
                                return;
                            }
                            rnVar.f42142n3 = false;
                            rnVar.lb(false, true, false);
                            rnVar.Fc(rnVar.getMediaDataController().getMask(), rnVar.getMediaDataController().getSearchPosition(), rnVar.getMediaDataController().getSearchCount());
                            AndroidUtilities.runOnUIThread(e1Var, 80L);
                            return;
                        }
                        num = numValueOf;
                        bArr2 = bArr;
                        if (LaunchActivity.C1 != null) {
                            dVar = rnVar.wb;
                            if (dVar != null) {
                                dVar.a(false);
                                n2Var = null;
                                rnVar.wb = null;
                            } else {
                                n2Var = null;
                            }
                            launchActivity = LaunchActivity.C1;
                            m0Var = new m0(this, messageObject2, s1Var);
                            rnVar.wb = m0Var;
                            int id2 = messageObject2.getId();
                            arrayList = launchActivity.Z;
                            if (peerDialogId >= 0 && (chat3 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-peerDialogId))) != null && ChatObject.isForum(chat3)) {
                                m0Var.d();
                                final int i15 = 0;
                                launchActivity.k0(peerDialogId, Integer.valueOf(i10), str2, num, bArr2, new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i16 = i15;
                                        m0 m0Var2 = m0Var;
                                        switch (i16) {
                                            case 0:
                                                Pattern pattern = LaunchActivity.f35496x1;
                                                m0Var2.c(false);
                                                break;
                                            default:
                                                Pattern pattern2 = LaunchActivity.f35496x1;
                                                m0Var2.c(false);
                                                break;
                                        }
                                    }
                                }, id2, i13);
                                return;
                            }
                            str3 = str2;
                            i12 = i13;
                            m0Var.d();
                            bundle = new Bundle();
                            if (peerDialogId >= 0) {
                                bundle.putLong("user_id", peerDialogId);
                            } else {
                                long j10 = -peerDialogId;
                                chat2 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(j10));
                                if (chat2 == null && chat2.forum) {
                                    final int i16 = 1;
                                    launchActivity.k0(peerDialogId, Integer.valueOf(i10), str3, num, bArr2, new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i17 = i16;
                                            m0 m0Var2 = m0Var;
                                            switch (i17) {
                                                case 0:
                                                    Pattern pattern = LaunchActivity.f35496x1;
                                                    m0Var2.c(false);
                                                    break;
                                                default:
                                                    Pattern pattern2 = LaunchActivity.f35496x1;
                                                    m0Var2.c(false);
                                                    break;
                                            }
                                        }
                                    }, id2, i12);
                                    return;
                                }
                                bundle.putLong("chat_id", j10);
                            }
                            bundle.putInt("message_id", i10);
                            if (arrayList.isEmpty()) {
                                n2Var2 = n2Var;
                            } else {
                                n2Var2 = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                            }
                            if (n2Var2 != null || MessagesController.getInstance(launchActivity.K).checkCanOpenChat(bundle, n2Var2)) {
                                AndroidUtilities.runOnUIThread(new t80(launchActivity, bundle, bArr2, i10, num, str3, i12, peerDialogId, m0Var, n2Var2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                message2 = messageObject2.messageOwner;
                if (message2 == null && (messageReplyHeader4 = message2.reply_to) != null && !TextUtils.isEmpty(messageReplyHeader4.quote_text) && messageObject2.replyTextEllipsized && !messageObject2.replyTextRevealed && !messageObject2.shouldDrawWithoutBackground()) {
                    messageObject2.replyTextRevealed = true;
                    rnVar.qc(messageObject2, true);
                    return;
                }
                message3 = messageObject2.messageOwner;
                if (message3 == null && (messageReplyHeader3 = message3.reply_to) != null && messageReplyHeader3.quote) {
                    if (chat == null || !chat.megagroup) {
                        i11 = ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate;
                    } else {
                        i11 = R.string.QuotePrivateGroup;
                    }
                } else if (chat == null && chat.megagroup) {
                    i11 = R.string.ReplyPrivateGroup;
                } else if (ChatObject.isChannel(chat)) {
                    i11 = R.string.ReplyPrivateChannel;
                } else {
                    i11 = R.string.ReplyPrivate;
                }
                org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.error, 36, LocaleController.getString(i11)).k(true);
            }
            str2 = str;
            peerDialogId = peerDialogId2;
            z11 = false;
            if (peerDialogId < 0) {
                chat = rnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
            } else {
                chat = null;
            }
            if (peerDialogId != Long.MAX_VALUE) {
                boolean z13 = z11;
                if (peerDialogId != rnVar.P5) {
                }
                if (peerDialogId != rnVar.P5) {
                }
                num = numValueOf;
                bArr2 = bArr;
                if (LaunchActivity.C1 != null) {
                    dVar = rnVar.wb;
                    if (dVar != null) {
                        dVar.a(false);
                        n2Var = null;
                        rnVar.wb = null;
                    } else {
                        n2Var = null;
                    }
                    launchActivity = LaunchActivity.C1;
                    m0Var = new m0(this, messageObject2, s1Var);
                    rnVar.wb = m0Var;
                    int id3 = messageObject2.getId();
                    arrayList = launchActivity.Z;
                    if (peerDialogId >= 0) {
                    }
                    str3 = str2;
                    i12 = i13;
                    m0Var.d();
                    bundle = new Bundle();
                    if (peerDialogId >= 0) {
                        bundle.putLong("user_id", peerDialogId);
                    } else {
                        long j11 = -peerDialogId;
                        chat2 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(j11));
                        if (chat2 == null) {
                        }
                        bundle.putLong("chat_id", j11);
                    }
                    bundle.putInt("message_id", i10);
                    if (arrayList.isEmpty()) {
                        n2Var2 = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                    } else {
                        n2Var2 = n2Var;
                    }
                    if (n2Var2 != null) {
                    }
                    AndroidUtilities.runOnUIThread(new t80(launchActivity, bundle, bArr2, i10, num, str3, i12, peerDialogId, m0Var, n2Var2));
                    return;
                }
                return;
            }
            message2 = messageObject2.messageOwner;
            if (message2 == null) {
            }
            message3 = messageObject2.messageOwner;
            if (message3 == null) {
                if (chat == null) {
                    if (ChatObject.isChannel(chat)) {
                        i11 = R.string.ReplyPrivateChannel;
                    } else {
                        i11 = R.string.ReplyPrivate;
                    }
                } else if (ChatObject.isChannel(chat)) {
                    i11 = R.string.ReplyPrivateChannel;
                } else {
                    i11 = R.string.ReplyPrivate;
                }
            } else if (chat == null) {
                if (ChatObject.isChannel(chat)) {
                    i11 = R.string.ReplyPrivateChannel;
                } else {
                    i11 = R.string.ReplyPrivate;
                }
            } else if (ChatObject.isChannel(chat)) {
                i11 = R.string.ReplyPrivateChannel;
            } else {
                i11 = R.string.ReplyPrivate;
            }
            org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.error, 36, LocaleController.getString(i11)).k(true);
        }
        numValueOf = Integer.valueOf(messageReplyHeader7.todo_item_id);
        bArr = null;
        str = null;
        long peerDialogId3 = rnVar.P5;
        message = messageObject2.messageOwner;
        if (message == null) {
            str2 = str;
            peerDialogId = peerDialogId3;
            z11 = false;
        } else {
            str2 = str;
            peerDialogId = peerDialogId3;
            z11 = false;
        }
        if (peerDialogId < 0) {
            chat = rnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
        } else {
            chat = null;
        }
        if (peerDialogId != Long.MAX_VALUE) {
            boolean z14 = z11;
            if (peerDialogId != rnVar.P5) {
            }
            if (peerDialogId != rnVar.P5) {
            }
            num = numValueOf;
            bArr2 = bArr;
            if (LaunchActivity.C1 != null) {
                dVar = rnVar.wb;
                if (dVar != null) {
                    dVar.a(false);
                    n2Var = null;
                    rnVar.wb = null;
                } else {
                    n2Var = null;
                }
                launchActivity = LaunchActivity.C1;
                m0Var = new m0(this, messageObject2, s1Var);
                rnVar.wb = m0Var;
                int id4 = messageObject2.getId();
                arrayList = launchActivity.Z;
                if (peerDialogId >= 0) {
                }
                str3 = str2;
                i12 = i13;
                m0Var.d();
                bundle = new Bundle();
                if (peerDialogId >= 0) {
                    bundle.putLong("user_id", peerDialogId);
                } else {
                    long j12 = -peerDialogId;
                    chat2 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(j12));
                    if (chat2 == null) {
                    }
                    bundle.putLong("chat_id", j12);
                }
                bundle.putInt("message_id", i10);
                if (arrayList.isEmpty()) {
                    n2Var2 = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                } else {
                    n2Var2 = n2Var;
                }
                if (n2Var2 != null) {
                }
                AndroidUtilities.runOnUIThread(new t80(launchActivity, bundle, bArr2, i10, num, str3, i12, peerDialogId, m0Var, n2Var2));
                return;
            }
            return;
        }
        message2 = messageObject2.messageOwner;
        if (message2 == null) {
        }
        message3 = messageObject2.messageOwner;
        if (message3 == null) {
            if (chat == null) {
                if (ChatObject.isChannel(chat)) {
                    i11 = R.string.ReplyPrivateChannel;
                } else {
                    i11 = R.string.ReplyPrivate;
                }
            } else if (ChatObject.isChannel(chat)) {
                i11 = R.string.ReplyPrivateChannel;
            } else {
                i11 = R.string.ReplyPrivate;
            }
        } else if (chat == null) {
            if (ChatObject.isChannel(chat)) {
                i11 = R.string.ReplyPrivateChannel;
            } else {
                i11 = R.string.ReplyPrivate;
            }
        } else if (ChatObject.isChannel(chat)) {
            i11 = R.string.ReplyPrivateChannel;
        } else {
            i11 = R.string.ReplyPrivate;
        }
        org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.error, 36, LocaleController.getString(i11)).k(true);
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            rn rnVar = this.f37446a;
            boolean z11 = !rnVar.fc && messageObject.getId() == rnVar.f42038ec;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - rnVar.gc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void T(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f37446a.fb(messageObject, true);
        }
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        boolean zIsForwarded = s1Var.getMessageObject().isForwarded();
        rn rnVar = this.f37446a;
        if (zIsForwarded) {
            org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.passcode_lock_close, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TodoCompleteForbiddenForward, DialogObject.getName(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer()))))).k(true);
            return false;
        }
        if (!s1Var.getMessageObject().canCompleteTodo()) {
            org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.passcode_lock_close, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TodoCompleteForbidden, DialogObject.getName(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer()))))).k(true);
            return false;
        }
        if (rnVar.getUserConfig().isPremium()) {
            rnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(rnVar.f42026e, rnVar.V7, true), s1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
        org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new om(this, 9))).k(true);
        return false;
    }

    @Override
    public final void U0(org.telegram.ui.Cells.s1 s1Var) {
        rn rnVar = this.f37446a;
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(rnVar.P5), s1Var);
    }

    @Override
    public final boolean V() {
        rn rnVar = this.f37446a;
        return rnVar.S5[1].size() + rnVar.S5[0].size() > 0;
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        ad1 ad1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        int i10;
        boolean z10;
        TLRPC.ChatFull chatFull;
        boolean z11;
        boolean z12;
        se seVar;
        MessageObject messageObject;
        boolean z13;
        ArrayList arrayList;
        ArrayList arrayList2;
        dd1 dd1Var;
        ArrayList arrayList3;
        rn rnVar;
        MessageObject messageObject2;
        int size;
        int i11;
        ad1 ad1Var2;
        ViewGroup viewGroup;
        boolean z14;
        int i12;
        int i13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        final rn rnVar2 = this.f37446a;
        if (rnVar2.getParentActivity() == null || rnVar2.getParentActivity() == null) {
            return false;
        }
        lh.w3 w3Var = rnVar2.f42214t1;
        if (w3Var != null && w3Var.R) {
            w3Var.e(true);
        }
        ol olVar = rnVar2.f42265x1;
        if (olVar != null && olVar.R) {
            olVar.e(true);
        }
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        rnVar2.Z4 = primaryMessageObject;
        rnVar2.f41978a5 = null;
        final dd1 dd1Var2 = new dd1(rnVar2.getParentActivity(), rnVar2.getResourceProvider());
        final int i14 = todoItem.f22525id;
        dd1Var2.G = s1Var;
        dd1Var2.K = i14;
        MessageObject messageObject3 = s1Var.getMessageObject();
        dd1Var2.C = messageObject3;
        dd1Var2.D = messageObject3 != null && messageObject3.isOutOwner();
        org.telegram.ui.Cells.s1 s1Var2 = dd1Var2.G;
        ad1 ad1Var3 = dd1Var2.f37366c;
        if (s1Var2 != null) {
            dd1Var2.H = rnVar2.f42160o9 - AndroidUtilities.dp(4.0f);
            dd1Var2.I = s1Var.f25439n;
            if (s1Var.getParent() instanceof View) {
                View view = (View) s1Var.getParent();
                dd1Var2.H = view.getY() + dd1Var2.H;
                dd1Var2.I = view.getY() + dd1Var2.I;
            }
            int width = dd1Var2.G.getWidth();
            int height = dd1Var2.G.getHeight();
            dd1Var2.G.getHeight();
            ad1Var = ad1Var3;
            bd1 bd1Var = new bd1(dd1Var2, dd1Var2.getContext(), UserConfig.selectedAccount, dd1Var2.G.getResourcesProvider(), i14, width, height);
            dd1Var2.E = bd1Var;
            dd1Var2.G.g1(bd1Var);
            dd1Var2.E.h1(dd1Var2.G);
            dd1Var2.E.setDelegate(new cd1(dd1Var2));
            bd1 bd1Var2 = dd1Var2.E;
            MessageObject messageObject4 = dd1Var2.C;
            MessageObject.GroupedMessages currentMessagesGroup = dd1Var2.G.getCurrentMessagesGroup();
            org.telegram.ui.Cells.s1 s1Var3 = dd1Var2.G;
            bd1Var2.W3(messageObject4, currentMessagesGroup, s1Var3.B, s1Var3.A, s1Var3.C, false);
            ad1Var.addView(dd1Var2.E, new FrameLayout.LayoutParams(dd1Var2.G.getWidth(), height, 51));
            iv0 iv0Var = new iv0(dd1Var2.getContext(), UserConfig.selectedAccount, dd1Var2.G.getResourcesProvider(), width, height, 1);
            dd1Var2.F = iv0Var;
            dd1Var2.G.i1(iv0Var);
            dd1Var2.G.g1(dd1Var2.F);
            dd1Var2.F.h1(dd1Var2.G);
            dd1Var2.F.setDelegate(new w9.d(20));
            iv0 iv0Var2 = dd1Var2.F;
            MessageObject messageObject5 = dd1Var2.C;
            MessageObject.GroupedMessages currentMessagesGroup2 = dd1Var2.G.getCurrentMessagesGroup();
            org.telegram.ui.Cells.s1 s1Var4 = dd1Var2.G;
            iv0Var2.W3(messageObject5, currentMessagesGroup2, s1Var4.B, s1Var4.A, s1Var4.C, false);
            ad1Var.addView(dd1Var2.F, new FrameLayout.LayoutParams(dd1Var2.G.getWidth(), height, 51));
        } else {
            ad1Var = ad1Var3;
        }
        lh.h1 h1Var = dd1Var2.f37367e;
        h1Var.bringToFront();
        ad1 ad1Var4 = dd1Var2.d;
        ad1Var4.bringToFront();
        dd1Var2.h.bringToFront();
        h1Var.w(false);
        org.telegram.ui.ActionBar.c6 c6Var = dd1Var2.f37363a;
        org.telegram.ui.Components.b70 b70VarF = org.telegram.ui.Components.b70.F(ad1Var, c6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(dd1Var2.C);
        final int i15 = 0;
        while (true) {
            if (i15 >= tL_messageMediaToDo.todo.list.size()) {
                todoItem2 = null;
                i15 = -1;
                break;
            }
            if (tL_messageMediaToDo.todo.list.get(i15).f22525id == i14) {
                todoItem2 = tL_messageMediaToDo.todo.list.get(i15);
                break;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            if (i16 >= tL_messageMediaToDo.completions.size()) {
                todoCompletion = null;
                break;
            }
            if (tL_messageMediaToDo.completions.get(i16).f22524id == i14) {
                todoCompletion = tL_messageMediaToDo.completions.get(i16);
                break;
            }
            i16++;
        }
        if (dd1Var2.C.canCompleteTodo()) {
            if (todoCompletion != null) {
                b70VarF.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
                b70VarF.k();
                final int i17 = 1;
                b70VarF.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i17) {
                            case 0:
                                rn rnVar3 = rnVar2;
                                yu0 yu0Var = new yu0(rnVar3);
                                dd1 dd1Var3 = dd1Var2;
                                yu0Var.p0(MessageObject.getMedia(dd1Var3.C), false, i14);
                                yu0Var.f44917a0 = new nl0(24, dd1Var3, rnVar3);
                                rnVar3.presentFragment(yu0Var);
                                dd1Var3.c(false);
                                break;
                            case 1:
                                boolean zC = rnVar2.c();
                                dd1 dd1Var4 = dd1Var2;
                                if (zC) {
                                    Toast.makeText(dd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                } else {
                                    bd1 bd1Var3 = dd1Var4.E;
                                    bd1Var3.j4(bd1Var3.N2(i14), false);
                                }
                                dd1Var4.c(true);
                                break;
                            default:
                                boolean zC2 = rnVar2.c();
                                dd1 dd1Var5 = dd1Var2;
                                if (zC2) {
                                    Toast.makeText(dd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                } else {
                                    bd1 bd1Var4 = dd1Var5.E;
                                    bd1Var4.j4(bd1Var4.N2(i14), false);
                                }
                                dd1Var5.c(true);
                                break;
                        }
                    }
                }, false);
            } else {
                final int i18 = 2;
                b70VarF.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i18) {
                            case 0:
                                rn rnVar3 = rnVar2;
                                yu0 yu0Var = new yu0(rnVar3);
                                dd1 dd1Var3 = dd1Var2;
                                yu0Var.p0(MessageObject.getMedia(dd1Var3.C), false, i14);
                                yu0Var.f44917a0 = new nl0(24, dd1Var3, rnVar3);
                                rnVar3.presentFragment(yu0Var);
                                dd1Var3.c(false);
                                break;
                            case 1:
                                boolean zC = rnVar2.c();
                                dd1 dd1Var4 = dd1Var2;
                                if (zC) {
                                    Toast.makeText(dd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                } else {
                                    bd1 bd1Var3 = dd1Var4.E;
                                    bd1Var3.j4(bd1Var3.N2(i14), false);
                                }
                                dd1Var4.c(true);
                                break;
                            default:
                                boolean zC2 = rnVar2.c();
                                dd1 dd1Var5 = dd1Var2;
                                if (zC2) {
                                    Toast.makeText(dd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                } else {
                                    bd1 bd1Var4 = dd1Var5.E;
                                    bd1Var4.j4(bd1Var4.N2(i14), false);
                                }
                                dd1Var5.c(true);
                                break;
                        }
                    }
                }, false);
            }
        }
        if (todoItem2 != null) {
            b70VarF.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new pc1(dd1Var2, rnVar2, todoItem2, 2), false);
            if (dd1Var2.C.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(dd1Var2.C.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(dd1Var2.C.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    publicUsername = "c/" + (-dd1Var2.C.getDialogId());
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(dd1Var2.C.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.f22525id);
                b70VarF.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new m21(16, dd1Var2, sb2.toString()), false);
            } else {
                primaryMessageObject = primaryMessageObject;
                ad1Var4 = ad1Var4;
            }
            b70VarF.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new m21(17, dd1Var2, todoItem2), false);
        } else {
            primaryMessageObject = primaryMessageObject;
            ad1Var4 = ad1Var4;
        }
        if (dd1Var2.C.canEditMessage(rnVar2.f42026e)) {
            final int i19 = 0;
            b70VarF.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() {
                @Override
                public final void run() {
                    switch (i19) {
                        case 0:
                            rn rnVar3 = rnVar2;
                            yu0 yu0Var = new yu0(rnVar3);
                            dd1 dd1Var3 = dd1Var2;
                            yu0Var.p0(MessageObject.getMedia(dd1Var3.C), false, i15);
                            yu0Var.f44917a0 = new nl0(24, dd1Var3, rnVar3);
                            rnVar3.presentFragment(yu0Var);
                            dd1Var3.c(false);
                            break;
                        case 1:
                            boolean zC = rnVar2.c();
                            dd1 dd1Var4 = dd1Var2;
                            if (zC) {
                                Toast.makeText(dd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var3 = dd1Var4.E;
                                bd1Var3.j4(bd1Var3.N2(i15), false);
                            }
                            dd1Var4.c(true);
                            break;
                        default:
                            boolean zC2 = rnVar2.c();
                            dd1 dd1Var5 = dd1Var2;
                            if (zC2) {
                                Toast.makeText(dd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var4 = dd1Var5.E;
                                bd1Var4.j4(bd1Var4.N2(i15), false);
                            }
                            dd1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                b70VarF.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new xs(dd1Var2, tL_messageMediaToDo, i14, rnVar2, 10), false);
            } else {
                i10 = 51;
            }
        } else {
            i10 = 51;
        }
        b70VarF.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
        mg.d dVarJ = ng.c.j(c6Var);
        jg.a aVar = dd1Var2.B;
        b70VarF.Q(aVar, dVarJ, false);
        b70VarF.Y();
        ViewGroup viewGroup2 = b70VarF.A;
        dd1Var2.M = viewGroup2;
        viewGroup2.setPivotX(0.0f);
        dd1Var2.M.setPivotY(0.0f);
        ad1Var4.addView(dd1Var2.M, h7.z5.e(-2, -2, i10));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        rnVar2.n8(primaryMessageObject, arrayList4, arrayList5, arrayList6);
        se seVar2 = new se(rnVar2, 7);
        MessageObject messageObject6 = dd1Var2.C;
        List<TLRPC.TL_availableReaction> enabledReactionsList = rnVar2.getMediaDataController().getEnabledReactionsList();
        boolean z15 = (rnVar2.x() || rnVar2.c() || rnVar2.f42039f != null || !messageObject6.hasReactions() || (ChatObject.isChannel(rnVar2.f42026e) && !rnVar2.f42026e.megagroup) || ChatObject.isMonoForum(rnVar2.f42026e) || enabledReactionsList.isEmpty() || !messageObject6.messageOwner.reactions.can_see_list || messageObject6.isSecretMedia()) ? false : true;
        if (messageObject6.isForwardedChannelPost()) {
            z10 = z15;
            TLRPC.ChatFull chatFull3 = rnVar2.getMessagesController().getChatFull(-messageObject6.getFromChatId());
            if (chatFull3 != null && (rnVar2.x() || rnVar2.N3 == 5 || rnVar2.c() || !messageObject6.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()))) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z10 = z15;
            if (messageObject6.isSecretMedia() || rnVar2.N3 == 5 || rnVar2.x() || rnVar2.c() || !messageObject6.isReactionsAvailable() || ((((chatFull = rnVar2.V7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(rnVar2.f42026e)) && rnVar2.f42039f == null && !ChatObject.isMonoForum(rnVar2.f42026e))) || enabledReactionsList.isEmpty())) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        boolean z16 = z11;
        boolean z17 = (z10 || rnVar2.c() || rnVar2.f42026e == null || !messageObject6.isOutOwner() || !messageObject6.isSent() || messageObject6.isEditing() || messageObject6.isSending() || messageObject6.isSendError() || messageObject6.isContentUnread() || messageObject6.isUnread() || ConnectionsManager.getInstance(rnVar2.getCurrentAccount()).getCurrentTime() - messageObject6.messageOwner.date >= rnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(rnVar2.f42026e) && ChatObject.isChannel(rnVar2.f42026e)) || (chatFull2 = rnVar2.V7) == null || chatFull2.participants_count > rnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject6.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || rnVar2.N3 == 3 || !messageObject6.canSetReaction() || ChatObject.isMonoForum(rnVar2.f42026e)) ? false : true;
        if (rnVar2.f42026e != null && !messageObject6.isOut() && ChatObject.isMonoForum(rnVar2.f42026e) && ChatObject.canManageMonoForum(rnVar2.getCurrentAccount(), rnVar2.f42026e)) {
            int i20 = ((-rnVar2.f42026e.linked_monoforum_id) > messageObject6.getFromChatId() ? 1 : ((-rnVar2.f42026e.linked_monoforum_id) == messageObject6.getFromChatId() ? 0 : -1));
        }
        if (z10 || rnVar2.f42026e != null || rnVar2.h != null || (user = rnVar2.f42039f) == null || UserObject.isUserSelf(user) || UserObject.isReplyUser(rnVar2.f42039f) || UserObject.isAnonymous(rnVar2.f42039f)) {
            z12 = false;
        } else {
            TLRPC.User user2 = rnVar2.f42039f;
            if (user2.bot || UserObject.isService(user2.f22527id) || (((userFull = rnVar2.W7) != null && userFull.read_dates_private) || rnVar2.c() || !messageObject6.isOutOwner() || !messageObject6.isSent() || messageObject6.isEditing() || messageObject6.isSending() || messageObject6.isSendError() || messageObject6.isContentUnread() || messageObject6.isUnread() || rnVar2.getConnectionsManager().getCurrentTime() - messageObject6.messageOwner.date >= rnVar2.getMessagesController().pmReadDateExpirePeriod || (messageObject6.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        TLRPC.User user3 = rnVar2.f42039f;
        boolean z18 = (user3 == null || !(UserObject.isReplyUser(user3) || UserObject.isAnonymous(rnVar2.f42039f))) && !rnVar2.c() && messageObject6.isEdited() && !(messageObject6.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest);
        org.telegram.ui.Components.b70 b70VarG = org.telegram.ui.Components.b70.G(dd1Var2.f37366c, rnVar2.getResourceProvider(), null, z10 || z17);
        if (z17) {
            rh0 rh0Var = new rh0(dd1Var2.getContext(), rnVar2.getCurrentAccount(), messageObject6, rnVar2.f42026e);
            FrameLayout frameLayout = new FrameLayout(dd1Var2.getContext());
            frameLayout.addView(rh0Var, h7.z5.c(36.0f, -1));
            org.telegram.ui.Components.b70 b70VarJ = b70VarG.J();
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, dd1Var2.getContext(), dd1Var2.f37363a, true, false);
            f1Var.setItemHeight(44);
            f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
            f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
            FrameLayout frameLayout2 = new FrameLayout(dd1Var2.getContext());
            LinearLayout linearLayout = new LinearLayout(dd1Var2.getContext());
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
            linearLayout.setOrientation(1);
            rnVar = rnVar2;
            org.telegram.ui.Components.zk0 zk0VarA = rh0Var.a();
            frameLayout2.addView(f1Var);
            linearLayout.addView(frameLayout2);
            z13 = z16;
            linearLayout.addView(new org.telegram.ui.ActionBar.k1(dd1Var2.getContext(), c6Var), h7.z5.n(-1, 8));
            frameLayout2.setOnClickListener(new xc1(b70VarG));
            messageObject = messageObject6;
            seVar = seVar2;
            arrayList = arrayList4;
            arrayList2 = arrayList5;
            yc1 yc1Var = new yc1(dd1Var2, rh0Var, rnVar, zk0VarA, linearLayout, b70VarG, b70VarJ);
            b70VarG = b70VarG;
            dd1Var = dd1Var2;
            rh0Var.setOnClickListener(yc1Var);
            linearLayout.addView(zk0VarA, h7.z5.n(-1, -2));
            b70VarJ.q(linearLayout);
            b70VarG.q(frameLayout);
            b70VarG.k();
            arrayList3 = arrayList6;
        } else {
            seVar = seVar2;
            messageObject = messageObject6;
            z13 = z16;
            arrayList = arrayList4;
            arrayList2 = arrayList5;
            dd1Var = dd1Var2;
            arrayList3 = arrayList6;
            rnVar = rnVar2;
            if (!z12) {
                if (z18) {
                    messageObject2 = messageObject;
                    b70VarG.r(new org.telegram.ui.Components.kb0(dd1Var.getContext(), 1, messageObject, new uc1(dd1Var, 2), dd1Var.f37363a), h7.z5.n(-1, 36));
                    b70VarG.k();
                }
                i11 = 0;
                for (size = arrayList.size(); i11 < size; size = size) {
                    b70VarG.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new ol0(dd1Var, seVar, ((Integer) arrayList3.get(i11)).intValue(), 9), false);
                    i11++;
                    arrayList3 = arrayList3;
                }
                b70VarG.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                b70VarG.Q(aVar, ng.c.j(c6Var), false);
                b70VarG.Y();
                ViewGroup viewGroup3 = b70VarG.A;
                dd1Var.O = viewGroup3;
                viewGroup3.setPivotX(0.0f);
                dd1Var.O.setPivotY(0.0f);
                ViewGroup viewGroup4 = dd1Var.O;
                FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-2, -2, 51);
                ad1Var2 = dd1Var.d;
                ad1Var2.addView(viewGroup4, layoutParamsE);
                viewGroup = dd1Var.O;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(dd1Var, 22));
                    dd1Var.O.setOnTouchListener(new g0(dd1Var, 7));
                }
                if (z13) {
                    if (rnVar.getUserConfig().getClientUserId() == rnVar.a()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        i12 = 3;
                    } else {
                        i12 = 0;
                    }
                    rn rnVar3 = rnVar;
                    org.telegram.ui.Components.wj0 wj0Var = new org.telegram.ui.Components.wj0(i12, rnVar3.getCurrentAccount(), dd1Var.getContext(), rnVar3, dd1Var.f37363a);
                    wj0Var.f34233a = true;
                    int iDp = AndroidUtilities.dp(4.0f);
                    if (LocaleController.isRTL) {
                        i13 = 0;
                    } else {
                        i13 = 24;
                    }
                    float f10 = 22;
                    wj0Var.setPadding(iDp + i13, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                    wj0Var.setDelegate(new zc1(dd1Var, rnVar3, messageObject2, wj0Var));
                    dd1Var.L = wj0Var;
                    ad1Var2.addView(wj0Var, h7.z5.e(-2, (int) ((wj0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                    wj0Var.p(messageObject2, rnVar3.V7, true);
                    dd1Var.L.setTransitionProgress(1.0f);
                }
                dd1Var.e();
                dd1Var.Y = new om(this, 5);
                dd1Var.show();
                return true;
            }
            b70VarG.r(new org.telegram.ui.Components.kb0(dd1Var.getContext(), 0, messageObject, new uc1(dd1Var, 0), dd1Var.f37363a), h7.z5.n(-1, 36));
            b70VarG.k();
        }
        messageObject2 = messageObject;
        i11 = 0;
        while (i11 < size) {
            b70VarG.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new ol0(dd1Var, seVar, ((Integer) arrayList3.get(i11)).intValue(), 9), false);
            i11++;
            arrayList3 = arrayList3;
        }
        b70VarG.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
        b70VarG.Q(aVar, ng.c.j(c6Var), false);
        b70VarG.Y();
        ViewGroup viewGroup5 = b70VarG.A;
        dd1Var.O = viewGroup5;
        viewGroup5.setPivotX(0.0f);
        dd1Var.O.setPivotY(0.0f);
        ViewGroup viewGroup6 = dd1Var.O;
        FrameLayout.LayoutParams layoutParamsE2 = h7.z5.e(-2, -2, 51);
        ad1Var2 = dd1Var.d;
        ad1Var2.addView(viewGroup6, layoutParamsE2);
        viewGroup = dd1Var.O;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(dd1Var, 22));
            dd1Var.O.setOnTouchListener(new g0(dd1Var, 7));
        }
        if (z13) {
            if (rnVar.getUserConfig().getClientUserId() == rnVar.a()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                i12 = 3;
            } else {
                i12 = 0;
            }
            rn rnVar4 = rnVar;
            org.telegram.ui.Components.wj0 wj0Var2 = new org.telegram.ui.Components.wj0(i12, rnVar4.getCurrentAccount(), dd1Var.getContext(), rnVar4, dd1Var.f37363a);
            wj0Var2.f34233a = true;
            int iDp2 = AndroidUtilities.dp(4.0f);
            if (LocaleController.isRTL) {
                i13 = 0;
            } else {
                i13 = 24;
            }
            float f11 = 22;
            wj0Var2.setPadding(iDp2 + i13, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f11));
            wj0Var2.setDelegate(new zc1(dd1Var, rnVar4, messageObject2, wj0Var2));
            dd1Var.L = wj0Var2;
            ad1Var2.addView(wj0Var2, h7.z5.e(-2, (int) ((wj0Var2.getTopOffset() / AndroidUtilities.density) + 52.0f + f11), 51));
            wj0Var2.p(messageObject2, rnVar4.V7, true);
            dd1Var.L.setTransitionProgress(1.0f);
        }
        dd1Var.e();
        dd1Var.Y = new om(this, 5);
        dd1Var.show();
        return true;
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var == null) {
            return false;
        }
        rn rnVar = this.f37446a;
        if (rnVar.getParentActivity() == null || !MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).richEditorAllowed() || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(rnVar.f42026e);
        }
        return false;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
        if (TextUtils.isEmpty(string)) {
            string = LocaleController.getString(R.string.PsaMessageInfoDefault);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        MessageObject.addLinks(false, spannableStringBuilder);
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        rn rnVar = this.f37446a;
        if (currentMessagesGroup != null) {
            int size = currentMessagesGroup.posArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                    MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                    if (messageObject2 == messageObject) {
                        break;
                    }
                    int childCount = rnVar.f42213t0.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = rnVar.f42213t0.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (messageObject2.equals(s1Var2.getMessageObject())) {
                                s1Var = s1Var2;
                            }
                        }
                    }
                    messageObject = messageObject2;
                    break;
                }
            }
        }
        rnVar.Jb(messageObject, spannableStringBuilder, 1);
        s1Var.f4(1, false, true);
    }

    @Override
    public final boolean X() {
        rn rnVar = this.f37446a;
        return UserObject.isReplyUser(rnVar.f42039f) || UserObject.isUserSelf(rnVar.f42039f);
    }

    @Override
    public final void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        rn rnVar = this.f37446a;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
            rn.b2(rnVar, s1Var, true, f10, f11);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = s1Var.getMessageObject()) == null || messageObject.getDialogId() == 1271266957) {
            m(s1Var, chat, i10, z10);
        } else {
            rnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override
    public final boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        rn rnVar = this.f37446a;
        return rnVar.f42211sb != 0 && s1Var.getMessageObject() != null && rnVar.f42211sb == s1Var.getMessageObject().getId() && rnVar.f42224tb == i10;
    }

    @Override
    public final void Z(org.telegram.ui.Cells.s1 s1Var) {
        i(s1Var, true, true, false);
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        rn rnVar = this.f37446a;
        if (!AndroidUtilities.isContextSafe(rnVar.getParentActivity()) || (chat = rnVar.f42026e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        e(s1Var, rnVar.getMessagesController().getParticipant(rnVar.f42026e.f22380id, currentUser.f22527id));
    }

    @Override
    public final boolean a1(MessageObject messageObject) {
        dm dmVar;
        long dialogId = messageObject.getDialogId();
        rn rnVar = this.f37446a;
        return (dialogId == 1271266957 || ((dmVar = rnVar.f42252w0) != null && dmVar.J)) && rnVar.N3 != 7;
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
        TLRPC.Message message;
        if (s1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            fVar.run();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f37446a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
        }
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        rn rnVar = this.f37446a;
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            CharSequence fieldText = ckVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = ChatObject.getPublicUsername(chat);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
                rnVar.U.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new om(this, 6), 200L);
            }
        }
    }

    @Override
    public final int b0() {
        return this.f37446a.N3;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle bundleH = com.google.android.recaptcha.internal.a.h(j10, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.f37446a;
        if (n2Var.getMessagesController().checkCanOpenChat(bundleH, n2Var, s1Var.getMessageObject())) {
            n2Var.presentFragment(new rn(bundleH));
        }
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        rn rnVar = this.f37446a;
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            CharSequence fieldText = ckVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(s3.c.l(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.u41("" + user.f22527id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            rnVar.U.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new om(this, 7), 200L);
        }
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (s1Var == null || pageBlock == null) {
            return false;
        }
        rn rnVar = this.f37446a;
        if (rnVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int iIndexOf = arrayList.indexOf(pageBlock);
        if (iIndexOf < 0) {
            return false;
        }
        PhotoViewer photoViewerT1 = PhotoViewer.t1();
        photoViewerT1.K2(null, rnVar, null);
        return photoViewerT1.e2(null, null, null, null, null, null, null, iIndexOf, new mm(rnVar, arrayList), null, 0L, 0L, 0L, true, new lm(richMessage, arrayList, messageObject), null);
    }

    @Override
    public final boolean d() {
        rn rnVar = this.f37446a;
        return (((org.telegram.ui.ActionBar.n2) rnVar).actionBar == null || ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9() || ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode) ? false : true;
    }

    @Override
    public final qg.a d0() {
        return this.f37446a.Mb;
    }

    @Override
    public final void d1() {
        rn rnVar = this.f37446a;
        rnVar.Q7();
        UndoView undoView = rnVar.f42229u3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, rnVar.P5, null);
    }

    @Override
    public final void d2(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f37446a.rc(primaryMessageObject, false);
    }

    public final void e(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        rn rnVar = this.f37446a;
        rnVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(rnVar.getParentActivity()) || (chat = rnVar.f42026e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        boolean z13 = true;
        boolean z14 = false;
        if (!(tLObject instanceof TLRPC.ChannelParticipant)) {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    z11 = channelParticipant.promoted_by == rnVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant.rank;
                z12 = z11;
            } else {
                if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    if (ChatObject.isChannel(rnVar.f42026e)) {
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        rnVar.getMessagesController();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(rnVar.f42026e);
                        tL_channels_getParticipant.participant = rnVar.getMessagesController().getInputPeer(currentUser.f22527id);
                        rnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new cg.u0(13, this, s1Var));
                        return;
                    }
                    return;
                }
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == rnVar.getUserConfig().getClientUserId();
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            }
            org.telegram.ui.Components.kz0.b(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, -rnVar.f42026e.f22380id, currentUser, str2, z13, z14, z12, ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider);
        }
        TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
        if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
            z10 = false;
            z14 = true;
        } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
            z10 = channelParticipant2.promoted_by == rnVar.getUserConfig().getClientUserId();
        } else {
            z10 = false;
            z13 = false;
        }
        str = channelParticipant2.rank;
        z12 = z10;
        str2 = str;
        org.telegram.ui.Components.kz0.b(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, -rnVar.f42026e.f22380id, currentUser, str2, z13, z14, z12, ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider);
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var == null ? null : s1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        rn rnVar = this.f37446a;
        return (rnVar.N3 == 1 || rnVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        rn rnVar = this.f37446a;
        if (rnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) hf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (rnVar.getParentActivity() != null) {
            if (rnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                ck ckVar = rnVar.U;
                MessageObject messageObject = s1Var.getMessageObject();
                MessageObject messageObject2 = s1Var.getMessageObject();
                pi piVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                we.d dVar = rnVar.wb;
                if (dVar != null) {
                    dVar.a(true);
                    rnVar.wb = null;
                }
                if (str == null || s1Var.getMessageObject() == null) {
                    rnVar.wb = null;
                } else {
                    pi piVar2 = new pi(rnVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                    rnVar.wb = piVar2;
                    piVar = piVar2;
                }
                ckVar.c0(keyboardButtonProto, messageObject, messageObject2, piVar);
            }
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean f0(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        x4 x4VarB;
        hk hkVar;
        gk gkVar;
        if (!l()) {
            return false;
        }
        rn rnVar = this.f37446a;
        ?? r10 = (rnVar.f42026e == null || ((hkVar = rnVar.K0) != null && hkVar.getVisibility() == 0) || ((gkVar = rnVar.N) != null && gkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = rnVar.f42026e;
        ?? r11 = (chat == null || !(rnVar.Z3 == 0 || rnVar.f42017d4) || (ChatObject.isChannel(chat) && !rnVar.f42026e.megagroup)) ? 0 : 1;
        d5[] d5VarArr = new d5[r10 + 2 + r11];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c10 = 2;
        if (r10 != 0) {
            d5VarArr[2] = d5.f37259n;
            c10 = 3;
        }
        if (r11 != 0) {
            d5VarArr[c10] = d5.f37260r;
        }
        TLRPC.UserFull userFull = rnVar.getMessagesController().getUserFull(user.f22527id);
        if (userFull != null) {
            x4VarB = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.l.e(x4VarB)) {
                x4VarB = x4.b(user, ((org.telegram.ui.ActionBar.n2) rnVar).classGuid, d5VarArr);
            }
        } else {
            x4VarB = x4.b(user, ((org.telegram.ui.ActionBar.n2) rnVar).classGuid, d5VarArr);
        }
        if (com.google.firebase.messaging.l.e(x4VarB)) {
            com.google.firebase.messaging.l.i().s((ViewGroup) rnVar.fragmentView, rnVar.f41983aa, x4VarB, new b7(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(rnVar, s1Var);
        final int i10 = 0;
        b70VarH.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {

            public final dn f41708b;

            {
                this.f41708b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f41708b.s(user, false);
                        break;
                    case 1:
                        this.f41708b.c(user);
                        break;
                    default:
                        this.f41708b.f37446a.ma(user);
                        break;
                }
            }
        }, false);
        b70VarH.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new u1(this, s1Var, user, 25), false);
        final int i11 = 1;
        b70VarH.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {

            public final dn f41708b;

            {
                this.f41708b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f41708b.s(user, false);
                        break;
                    case 1:
                        this.f41708b.c(user);
                        break;
                    default:
                        this.f41708b.f37446a.ma(user);
                        break;
                }
            }
        }, r10);
        final int i12 = 2;
        b70VarH.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {

            public final dn f41708b;

            {
                this.f41708b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f41708b.s(user, false);
                        break;
                    case 1:
                        this.f41708b.c(user);
                        break;
                    default:
                        this.f41708b.f37446a.ma(user);
                        break;
                }
            }
        }, r11);
        b70VarH.f26993t = false;
        b70VarH.f26974i = 3;
        b70VarH.W = true;
        b70VarH.a0(0.0f, -AndroidUtilities.dp(48.0f));
        b70VarH.Z();
        return true;
    }

    public final void g() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean zIsHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        rn rnVar = this.f37446a;
        if (zIsHuaweiStoreApp) {
            we.e.s(rnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            we.e.s(rnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        rn rnVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (rnVar = this.f37446a).f42211sb) == 0 || i10 != s1Var.getMessageObject().getId() || rnVar.f42224tb != 3) {
            return null;
        }
        return rnVar.f42249vb;
    }

    @Override
    public final void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var == null || document == null) {
            return;
        }
        rn rnVar = this.f37446a;
        if (rnVar.getParentLayout() == null || !e0(s1Var)) {
            return;
        }
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(rnVar, s1Var);
        b70VarH.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new u1(this, s1Var, document, 24), false);
        b70VarH.f26993t = false;
        b70VarH.Z();
    }

    @Override
    public final void h2() {
        this.f37446a.r9();
    }

    public final void i(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int iR;
        int iL8;
        nj njVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        rn rnVar = this.f37446a;
        kj kjVar = rnVar.f42213t0;
        if (kjVar != null && (njVar = rnVar.f42239v0) != null && njVar.f5729y < 0) {
            int childCount = kjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    iR = -1;
                    iL8 = 0;
                    break;
                }
                View childAt = rnVar.f42213t0.getChildAt(childCount);
                rnVar.f42213t0.getClass();
                iR = RecyclerView.R(childAt);
                if (iR >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            iL8 = rnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        iL8 = rnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        } else {
            iR = -1;
            iL8 = 0;
            break;
        }
        if (z10 && iR >= 0 && s1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                nj njVar2 = rnVar.f42239v0;
                rnVar.f42213t0.getClass();
                njVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) rnVar.f42160o9), false);
            } else {
                rnVar.f42239v0.h1(iR, iL8);
            }
        }
        rnVar.J0 = z11;
        rnVar.rc(primaryMessageObject, false);
        rnVar.J0 = false;
    }

    @Override
    public final void i0(int i10) {
        int i11 = 3;
        int i12 = 2;
        int i13 = 1;
        rn rnVar = this.f37446a;
        try {
            if (i10 == 0) {
                rnVar.h7();
                zk zkVar = rnVar.f42242v3;
                if (zkVar == null) {
                    return;
                }
                zkVar.l(0L, 84, null, new om(this, i13));
                rnVar.f42242v3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                org.telegram.ui.Components.mc.a0(rnVar).G(R.raw.transcribe, 6, rnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.k21.h(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount), LocaleController.formatDateTime(rnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true))) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.k21.h(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount), new Object[0]))).k(true);
                rnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String dateTime = LocaleController.formatDateTime(rnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(rnVar);
                int i14 = R.raw.transcribe;
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", rnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new om(this, i12)) : rnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, dateTime), new om(this, i11)));
                mcVarA0.getClass();
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(mcVarA0.W(), mcVarA0.f30645c);
                mbVar.c(i14, 36, 36, new String[0]);
                if (spannableStringBuilderAppend != null) {
                    String string = spannableStringBuilderAppend.toString();
                    int i15 = 0;
                    for (int iIndexOf = string.indexOf(10); iIndexOf >= 0 && iIndexOf < spannableStringBuilderAppend.length(); iIndexOf = string.indexOf(10, iIndexOf + 1)) {
                        if (i15 >= 6) {
                            spannableStringBuilderAppend.replace(iIndexOf, iIndexOf + 1, (CharSequence) " ");
                        }
                        i15++;
                    }
                }
                mbVar.f30639b.setText(spannableStringBuilderAppend);
                mbVar.f30639b.setSingleLine(false);
                mbVar.f30639b.setMaxLines(6);
                mcVarA0.b(mbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f37446a.W7(s1Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int iA = zg.i.a(messageObject);
        boolean zA = h7.a8.a(iA, 7);
        rn rnVar = this.f37446a;
        if (zA) {
            org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.e_hand_2, 36, zg.i.b(messageObject, iA)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            rnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            s1Var.R0(true);
            return;
        }
        if (rnVar.getParentActivity() == null) {
            return;
        }
        if (rnVar.f42092j2 == null) {
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(5, rnVar.getParentActivity(), rnVar.f41983aa, false);
            rnVar.f42092j2 = x30Var;
            x30Var.setAlpha(0.0f);
            rnVar.f42092j2.setVisibility(4);
            int iIndexOfChild = rnVar.T0.indexOfChild(rnVar.O);
            if (iIndexOfChild == -1) {
                return;
            } else {
                rnVar.T0.addView(rnVar.f42092j2, iIndexOfChild + 1, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                float y10 = ((s1Var.getY() + q1Var.f25018b) - AndroidUtilities.dp(4.0f)) - rnVar.f42160o9;
                rnVar.f42127m2 = AndroidUtilities.dp(13.3f) + q1Var.f25017a;
                int iC = org.telegram.messenger.rl.C(6.0f, q1Var.f25018b, i12);
                rnVar.f42141n2 = iC;
                if (y10 > 0.0f) {
                    i15 = rnVar.f42127m2;
                    i13 = iC;
                    f10 = 0.0f;
                    break;
                }
                i16++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                rnVar.f42213t0.v0(0, (int) f10, null);
                rnVar.f42116l2 = s1Var;
                return;
            }
            i14 = i15;
        }
        rnVar.f42092j2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override
    public final boolean j0() {
        return this.f37446a.N3 == 0;
    }

    @Override
    public final void k() {
        g();
    }

    @Override
    public final void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        this.f37446a.I7(s1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final boolean k2(int i10) {
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        rn rnVar = this.f37446a;
        if (!((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode || !rnVar.F9) {
            return !d();
        }
        if (((org.telegram.ui.ActionBar.n2) rnVar).parentLayout != null) {
            ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout).r();
        }
        return true;
    }

    public final boolean l() {
        rn rnVar = this.f37446a;
        if (UserObject.isUserSelf(rnVar.f42039f)) {
            return true;
        }
        TLRPC.Chat chat = rnVar.f42026e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || rnVar.f42026e.megagroup;
        }
        return false;
    }

    @Override
    public final int l0(org.telegram.ui.Cells.s1 s1Var) {
        zg.c cVar;
        rn rnVar = this.f37446a;
        if (!rnVar.f42212sc.f48498f || (cVar = rnVar.f42289yc) == null || cVar.f50809n != s1Var || cVar.f50804a.getWidth() <= 0) {
            return 0;
        }
        return rnVar.f42289yc.f50804a.getHeight();
    }

    public final void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, boolean z10) {
        rn rnVar = this.f37446a;
        TLRPC.Chat chat2 = rnVar.f42026e;
        if (chat2 != null && chat.f22380id == chat2.f22380id) {
            fj fjVar = rnVar.W0;
            if (fjVar != null && i10 == 0) {
                fjVar.e(false, false);
                return;
            } else {
                if (s1Var.getMessageObject() != null) {
                    rnVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.f22380id != chat2.f22380id || rnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22380id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            qi qiVar = null;
            if (z10) {
                we.d dVar = rnVar.wb;
                if (dVar != null) {
                    dVar.a(true);
                    rnVar.wb = null;
                }
                if (s1Var.getMessageObject() == null) {
                    rnVar.wb = null;
                } else {
                    qi qiVar2 = new qi(rnVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    rnVar.wb = qiVar2;
                    qiVar = qiVar2;
                }
            }
            if (rnVar.getMessagesController().checkCanOpenChat(bundle, rnVar, s1Var.getMessageObject(), qiVar)) {
                rn rnVar2 = new rn(bundle);
                if (qiVar == null || i10 == 0) {
                    rnVar.presentFragment(rnVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new gh.e1(this, qiVar, chat, i10, rnVar2, 14), 5000L);
                    qiVar.d();
                }
            }
        }
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        rn rnVar = this.f37446a;
        if (rnVar.getParentActivity() == null) {
            return;
        }
        if (rnVar.T9 == null) {
            dh.k kVar = new dh.k(rnVar.getParentActivity());
            rnVar.T9 = kVar;
            rnVar.T0.addView(kVar, h7.z5.e(-1, -1, 48));
        }
        dh.k kVar2 = rnVar.T9;
        HashMap map = kVar2.f5032a;
        ArrayList arrayList = kVar2.f5034c;
        arrayList.clear();
        int i10 = kVar2.d;
        UserConfig userConfig = UserConfig.getInstance(i10);
        long j10 = userConfig.clientUserId;
        arrayList.add(Long.valueOf(j10));
        if (userConfig.suggestContacts) {
            ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i10).hints;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                long j11 = tL_topPeer2.peer.user_id;
                if (j11 != 0) {
                    int i12 = size;
                    if (MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j11));
                    }
                    size = i12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        for (int i13 = 0; i13 < allDialogs.size(); i13++) {
            TLRPC.Dialog dialog = allDialogs.get(i13);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j12 = dialog.f22384id;
                if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                    if (DialogObject.isUserDialog(dialog.f22384id)) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f22384id));
                        if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f22527id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.f22384id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.f22384id));
                            }
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22384id));
                        if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.f22384id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.f22384id));
                            }
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList3);
        String strB = dh.k.b(s1Var);
        if (strB == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            Long l10 = (Long) obj;
            if (hashSet.add(l10) && DialogObject.isUserDialog(l10.longValue())) {
                arrayList4.add(l10);
            }
        }
        dh.j jVar = new dh.j(kVar2, s1Var, arrayList4, new d5.u(1, kVar2, strB));
        jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
        jVar.setCallback(kVar2);
        if (map.containsKey(strB)) {
            return;
        }
        map.put(strB, jVar);
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        dh.j jVar;
        dh.k kVar = this.f37446a.T9;
        if (kVar == null || (jVar = (dh.j) kVar.f5032a.get(dh.k.b(s1Var))) == null) {
            return;
        }
        dh.d[] dVarArr = jVar.f5029w;
        RectF rectF = jVar.f5027r;
        if (jVar.I) {
            float f12 = (f10 - rectF.left) + jVar.Q;
            float f13 = (f11 - rectF.top) + jVar.R;
            int i10 = dh.i.f5017a;
            int iB = (((float) (-AndroidUtilities.dp((float) 37))) >= f13 || f13 >= rectF.height()) ? -1 : h7.n.b((int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(dh.i.f5017a + 11)), 0, dVarArr.length - 1);
            if (jVar.N == iB) {
                return;
            }
            jVar.f5021a.performHapticFeedback(3, 1);
            jVar.N = iB;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                dh.d dVar = dVarArr[i11];
                boolean z10 = iB == i11;
                if (dVar.f4991p != z10) {
                    ValueAnimator valueAnimator = dVar.f4989n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.f4991p = z10;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dVar.f4990o, z10 ? 1.0f : 0.0f);
                    dVar.f4989n = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(180L);
                    dVar.f4989n.addUpdateListener(dVar);
                    dVar.f4989n.setInterpolator(dh.h.f4999a);
                    dVar.f4989n.start();
                }
                dh.d dVar2 = dVarArr[i11];
                boolean z11 = iB == i11 || iB == -1;
                if (dVar2.f4988m != z11) {
                    ValueAnimator valueAnimator2 = dVar2.f4986k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.f4988m = z11;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(dVar2.f4987l, z11 ? 1.0f : 0.0f);
                    dVar2.f4986k = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.setDuration(180L);
                    dVar2.f4986k.addUpdateListener(dVar2);
                    dVar2.f4986k.setInterpolator(dh.h.f4999a);
                    dVar2.f4986k.start();
                }
                i11++;
            }
        }
    }

    @Override
    public final void m2() {
        rn rnVar = this.f37446a;
        if (!rnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", rnVar.getMessagesController().recommendedChannelsLimitPremium), new om(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", rnVar.P5);
        bundle.putInt("start_from", 10);
        rnVar.presentFragment(new org.telegram.ui.Components.o90(bundle, rnVar.W0.getSharedMediaPreloader()));
    }

    public final void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22527id);
            org.telegram.ui.ActionBar.n2 n2Var = this.f37446a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, s1Var.getMessageObject())) {
                n2Var.presentFragment(new rn(bundle));
            }
        }
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String displayCountry;
        rn rnVar = this.f37446a;
        lh.w3 w3Var = rnVar.f42253w1;
        if (w3Var != null) {
            w3Var.e(true);
        }
        if (rnVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            displayCountry = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e9) {
            FileLog.e(e9);
            displayCountry = factCheck.country;
        }
        lh.w3 w3Var2 = new lh.w3(rnVar.getParentActivity(), 3);
        w3Var2.q(true);
        w3Var2.G = Layout.Alignment.ALIGN_NORMAL;
        w3Var2.d = -1L;
        w3Var2.P = true;
        w3Var2.f16979e = true;
        w3Var2.r(12.0f);
        rnVar.f42253w1 = w3Var2;
        w3Var2.f16984h0 = new rd(18, this, w3Var2);
        w3Var2.t(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, displayCountry)));
        rnVar.T0.addView(rnVar.f42253w1, h7.z5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        rnVar.T0.post(new h3.f0(this, s1Var, i11, i10, 4));
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int size;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            E1(s1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        rn rnVar = this.f37446a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(rnVar)) {
                an anVar = new an(3);
                anVar.setResourceProvider(((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = rnVar.getMessagesController().getPeer(rnVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                anVar.K0 = false;
                anVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                rnVar.presentFragment(anVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            kt.q().w(rnVar.getParentActivity());
            kt.q().v(new bn(this, tL_messageMediaPoll, pollAnswer, s1Var));
            kt ktVarQ = kt.q();
            TLRPC.Document document4 = messageMedia.document;
            ktVarQ.t(document4, null, "", null, null, MessageObject.isAnimatedEmoji(document4) ? 2 : 0, false, s1Var.getMessageObject(), ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider, 200);
            return;
        }
        if (MessageObject.isMusicDocument(messageMedia.document)) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                if (playingMessageObject.isPlayingExplanationObject == (i10 == -3)) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().playMessage(playingMessageObject);
                        return;
                    } else {
                        MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.TL_message tL_messageC7 = rn.C7(message);
            tL_messageC7.media = messageMedia;
            tL_messageC7.attachPath = zg.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            MessageObject messageObject2 = new MessageObject(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, tL_messageC7, false, true);
            messageObject2.isPlayingExplanationObject = i10 == -3;
            arrayList.add(messageObject2);
            if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                MediaController.getInstance().cleanupPlayer(false, true);
            }
            MediaController.getInstance().setPlaylist(arrayList, messageObject2, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !MessageObject.isVideoDocument(document5)) {
            int i11 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            zg.a aVar = new zg.a(i11, messageObject, document6, zg.f.c(messageObject.messageOwner, i10));
            if (aVar.f50800g) {
                FileLoader.getInstance(i11).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject3 = s1Var.f25546u7;
                if (messageObject3 == null || !messageObject3.isPoll()) {
                    return;
                }
                zg.g gVar = s1Var.Y5;
                if (gVar != null) {
                    gVar.d();
                }
                zg.g gVar2 = s1Var.X5;
                if (gVar2 != null) {
                    gVar2.d();
                    return;
                }
                return;
            }
            if (!aVar.f50799f) {
                FileLoader.getInstance(i11).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject4 = s1Var.f25546u7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                zg.g gVar3 = s1Var.Y5;
                if (gVar3 != null) {
                    gVar3.d();
                }
                zg.g gVar4 = s1Var.X5;
                if (gVar4 != null) {
                    gVar4.d();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message tL_messageC8 = rn.C7(message2);
            tL_messageC8.media = messageMedia;
            tL_messageC8.attachPath = zg.f.c(message2, i10);
            cn cnVar = new cn(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, tL_messageC8, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, rnVar, rnVar.f41983aa);
                PhotoViewer photoViewerT1 = PhotoViewer.t1();
                int i12 = cnVar.type;
                photoViewerT1.c2(cnVar, rnVar, i12 != 0 ? rnVar.P5 : 0L, i12 != 0 ? rnVar.H6 : 0L, i12 != 0 ? rnVar.b() : 0L, rnVar.Ba);
                return;
            }
            try {
                AndroidUtilities.openForView(cnVar, rnVar.getParentActivity(), rnVar.f41983aa, false);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                rnVar.z6(cnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            size = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message tL_messageC9 = rn.C7(message3);
            tL_messageC9.media = messageMedia3;
            tL_messageC9.attachPath = zg.f.c(message3, -2);
            arrayList3.add(new tm(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, tL_messageC9, false, true));
            arrayList2.add(-2);
        } else {
            size = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                size = arrayList3.size();
            }
            TLRPC.TL_message tL_messageC10 = rn.C7(message3);
            tL_messageC10.media = messageMedia2;
            tL_messageC10.attachPath = zg.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_messageC10.message = pollResults2.solution;
            tL_messageC10.entities = pollResults2.solution_entities;
            arrayList3.add(new um(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, tL_messageC10, false, true));
            arrayList2.add(-3);
        }
        hf.d.b(tL_messageMediaPoll.poll, rnVar.getUserConfig().getClientUserId());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i13);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                if (pollAnswer2.unshuffled_index == i10) {
                    size = arrayList3.size();
                }
                TLRPC.TL_message tL_messageC11 = rn.C7(message3);
                tL_messageC11.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                tL_messageC11.message = tL_textWithEntities2.text;
                tL_messageC11.entities = tL_textWithEntities2.entities;
                tL_messageC11.attachPath = zg.f.c(message3, pollAnswer2.unshuffled_index);
                arrayList3.add(new vm(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, tL_messageC11, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (size <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, rnVar, rnVar.f41983aa);
        PhotoViewer.t1().a2(arrayList3, size, rnVar.a(), 0L, 0L, rnVar.Ca);
    }

    @Override
    public final org.telegram.ui.Cells.k9 o2() {
        return this.f37446a.Y8;
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
        if (s1Var.getMessageObject().isImportedForward()) {
            d1();
            return;
        }
        rn rnVar = this.f37446a;
        if (rnVar.f42067h3 || rnVar.f42213t0 == null || rnVar.getParentActivity() == null || rnVar.fragmentView == null) {
            return;
        }
        if (rnVar.f42176q2 == null) {
            jm jmVar = rnVar.T0;
            int iIndexOfChild = jmVar.indexOfChild(rnVar.O);
            if (iIndexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(1, rnVar.getParentActivity(), rnVar.f41983aa, false);
            rnVar.f42176q2 = x30Var;
            jmVar.addView(x30Var, iIndexOfChild + 1, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            rnVar.f42176q2.setAlpha(0.0f);
            rnVar.f42176q2.setVisibility(4);
        }
        rnVar.f42176q2.e(s1Var, null, 0, 0, true);
    }

    @Override
    public final boolean p0() {
        rn rnVar = this.f37446a;
        return (rnVar.A9() || ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode) ? false : true;
    }

    @Override
    public final void q() {
        this.f37446a.T0.getClass();
    }

    public final void r(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22380id);
            bundle.putBoolean("expandPhoto", false);
            this.f37446a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void r0(String str) {
        rn rnVar = this.f37446a;
        hk hkVar = rnVar.K0;
        if (hkVar == null || hkVar.getVisibility() != 0) {
            gk gkVar = rnVar.N;
            if ((gkVar == null || gkVar.getVisibility() != 0) && rnVar.U != null && str != null && str.length() > 0) {
                rnVar.U.setFieldText("@" + str + " ");
                rnVar.U.H0();
            }
        }
    }

    public final void s(TLRPC.User user, boolean z10) {
        if (user == null || user.f22527id == 489000) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i10 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f22527id);
        bundle.putBoolean("expandPhoto", z10);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        rn rnVar = this.f37446a;
        TLRPC.User user2 = rnVar.f42039f;
        if (user2 != null && user2.f22527id == user.f22527id) {
            i10 = 1;
        }
        profileActivity.N4(i10);
        AndroidUtilities.setAdjustResizeToNothing(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
        rnVar.presentFragment(profileActivity);
    }

    @Override
    public final boolean s0(org.telegram.ui.Components.t5 t5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        rn rnVar = this.f37446a;
        if (rnVar.getMessagesController().premiumFeaturesBlocked() || t5Var == null || t5Var.standard) {
            return false;
        }
        long documentId = t5Var.getDocumentId();
        TLRPC.Document documentF = t5Var.document;
        if (documentF == null) {
            documentF = org.telegram.ui.Components.k5.f(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, documentId);
        }
        if (documentF == null || (inputStickerSet = MessageObject.getInputStickerSet(documentF)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.cv cvVar = new org.telegram.ui.Components.cv(rnVar, rnVar.getParentActivity(), rnVar.f41983aa, arrayList);
        org.telegram.ui.Components.su suVar = cvVar.f27550f;
        suVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(suVar);
        suVar.v = imageReceiver;
        if (suVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        suVar.f32575w = true;
        suVar.f32576x.d(1.0f, true);
        suVar.v.setImage(ImageLocation.getForDocument(documentF), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(documentF.thumbs, 90), documentF), "140_140", DocumentObject.getSvgThumb(documentF.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f, true), 0L, null, null, 0);
        suVar.v.setLayerNum(7);
        suVar.v.setAllowStartLottieAnimation(true);
        suVar.v.setAllowStartAnimation(true);
        suVar.v.setAutoRepeat(1);
        suVar.v.setAllowDecodeSingleFrame(true);
        suVar.v.setParentView(suVar);
        cvVar.setCalcMandatoryInsets(rnVar.x9());
        rnVar.showDialog(cvVar);
        return true;
    }

    @Override
    public final boolean s1() {
        rn rnVar = this.f37446a;
        return rnVar.T0.getMeasuredWidth() > rnVar.T0.getMeasuredHeight();
    }

    @Override
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z10;
        TLRPC.Message message2;
        int i11;
        TLRPC.Peer peer;
        MessageObject.GroupedMessages groupedMessages;
        rn rnVar = this.f37446a;
        if (rnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.d21 d21Var = rnVar.N1;
        if (d21Var != null && rnVar.Z3 == 0 && (s1Var.P7 || s1Var.Q7)) {
            d21Var.m(s1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (rnVar.getMessagesController().isFrozen()) {
            b.b(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount);
            return;
        }
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            ckVar.P();
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int i12 = rnVar.N3;
        if (i12 == 2) {
            rnVar.R8.P0(messageObject.getId());
            rnVar.finishFragment();
            return;
        }
        if (i12 == 3 || ((i12 == 7 && rnVar.K3 == 2) || !((!UserObject.isReplyUser(rnVar.f42039f) && !UserObject.isUserSelf(rnVar.f42039f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(rnVar.f42039f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                rnVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (rnVar.N3 == 7 && rnVar.K3 == 2) {
                rnVar.fa(messageObject);
                return;
            } else {
                rnVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayListM = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) rnVar.f42219t6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayListM == null) {
            arrayListM = org.telegram.messenger.y1.m(messageObject);
        }
        if (!rnVar.getMessagesController().storiesEnabled() || messageObject.isSponsored() || (((message2 = messageObject.messageOwner) != null && message2.noforwards) || (i11 = messageObject.type) == 17 || i11 == 12)) {
            z10 = false;
        } else {
            long dialogId = messageObject.getDialogId();
            TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat == null || !chat.noforwards) {
                if (dialogId >= 0 || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.messageOwner.fwd_from;
                    if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        if (peerDialogId >= 0 || ((chat2 != null && chat2.noforwards) || !ChatObject.isChannelAndNotMegaGroup(chat2) || !ChatObject.isPublic(chat2))) {
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            } else {
                z10 = false;
            }
        }
        rnVar.showDialog(new xm(this, rnVar.getParentActivity(), rnVar, arrayListM, ChatObject.isChannel(rnVar.f42026e), z10, rnVar.f41983aa, z10, messageObject));
        AndroidUtilities.setAdjustResizeToNothing(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
        rnVar.fragmentView.requestLayout();
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        rn rnVar = this.f37446a;
        rnVar.I7(s1Var, false, false, f10, f11, true, false, false);
        rnVar.f42213t0.getClass();
        rn.c2(rnVar, RecyclerView.R(s1Var));
    }

    @Override
    public final void u() {
        this.f37446a.Yb();
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var) {
        rn.U4(this.f37446a, s1Var);
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
        int iR;
        int iL8;
        nj njVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        rn rnVar = this.f37446a;
        kj kjVar = rnVar.f42213t0;
        if (kjVar != null && (njVar = rnVar.f42239v0) != null && njVar.f5729y < 0) {
            int childCount = kjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    iR = -1;
                    iL8 = 0;
                    break;
                }
                View childAt = rnVar.f42213t0.getChildAt(childCount);
                rnVar.f42213t0.getClass();
                iR = RecyclerView.R(childAt);
                if (iR >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            iL8 = rnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        iL8 = rnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        } else {
            iR = -1;
            iL8 = 0;
            break;
        }
        rnVar.rc(primaryMessageObject, false);
        lh.w3 w3Var = rnVar.f42253w1;
        if (w3Var != null) {
            w3Var.e(true);
        }
        if (iR < 0 || s1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        rnVar.f42239v0.h1(iR, iL8);
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
        rn rnVar = this.f37446a;
        boolean z10 = true;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
            rn.b2(rnVar, s1Var, true, f10, f11);
            return;
        }
        if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
            O0(10, s1Var);
            return;
        }
        if (!ChatObject.isForum(rnVar.f42026e) && !rnVar.F9()) {
            z10 = false;
        }
        s(user, z10);
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        i(s1Var, z10, false, false);
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
        long j10;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        TLRPC.MessageReplies messageReplies = messageObject.messageOwner.replies;
        if (messageReplies != null) {
            int i11 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
            i10 = i11;
        } else {
            j10 = 0;
            i10 = -1;
        }
        long j11 = j10;
        rn rnVar = this.f37446a;
        rnVar.aa(rnVar.f42026e.f22380id, messageObject, messageObject.getId(), j11, i10, 0, null);
    }

    @Override
    public final void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
        int i10;
        MessageObject messageObject;
        boolean z11;
        boolean z12;
        long j10;
        long jB;
        File file;
        TLRPC.Chat chat;
        cu0 cu0VarE;
        char c10;
        cu0 cu0Var;
        int i11;
        char c11;
        MessageObject messageObject2;
        MessageObject messageObject3;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        MessageObject messageObject4 = s1Var.getMessageObject();
        int i12 = messageObject4.type;
        rn rnVar = this.f37446a;
        if (i12 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject4.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject4.getId();
            storyItem.messageType = 2;
            jh.l7.b(storyItem, rnVar.f42039f);
            rnVar.getOrCreateStoryViewer().G(rnVar.getParentActivity(), messageObject4.messageOwner.media.storyItem, jh.b7.a(rnVar.f42213t0));
            return;
        }
        int i13 = 1;
        if (!messageObject4.isVideo() || DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).canDownloadMedia(messageObject4.messageOwner) == 1) {
            messageObject4.putInDownloadsStore = true;
        }
        if (messageObject4.isSendError()) {
            rnVar.I7(s1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject4.isSending()) {
            return;
        }
        int i14 = 0;
        if (z10 && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject4.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (rnVar.ea(str, s1Var, null, messageObject4.getId(), 2)) {
                return;
            }
            we.d dVar = rnVar.wb;
            if (dVar != null) {
                dVar.a(true);
            }
            rnVar.wb = s1Var.getMessageObject() != null ? new wm(this, s1Var, i14) : null;
            we.e.r(rnVar.getParentActivity(), Uri.parse(str), true, false, false, rnVar.wb, null, false, true, false);
            return;
        }
        int i15 = 4;
        if (messageObject4.isDice()) {
            pm pmVar = new pm(this, messageObject4, i14);
            if (messageObject4.isStakeableDice()) {
                rnVar.getMessagesController().loadStakeDiceInfo(new b0(this, messageObject4, pmVar, i15));
                return;
            } else {
                pmVar.run();
                return;
            }
        }
        if ((messageObject4.isAnimatedEmoji() && (!messageObject4.isAnimatedAnimatedEmoji() || (rnVar.f42223ta.f42715e.containsKey(sy.q(MessageObject.findAnimatedEmojiEmoticon(messageObject4.getDocument()))) && rnVar.f42039f != null))) || messageObject4.isPremiumSticker()) {
            rnVar.Na(s1Var);
            rnVar.f42223ta.l(s1Var, rnVar, true);
            rnVar.f42213t0.I0(false);
            return;
        }
        if (messageObject4.needDrawBluredPreview()) {
            me meVarFb = rnVar.fb(messageObject4, false);
            e5.u uVarO4 = rn.O4(rnVar, messageObject4);
            s1Var.invalidate();
            final SecretMediaViewer secretMediaViewerF = SecretMediaViewer.f();
            final Activity parentActivity = rnVar.getParentActivity();
            int i16 = UserConfig.selectedAccount;
            secretMediaViewerF.f36119a = i16;
            ImageReceiver imageReceiver = secretMediaViewerF.h;
            imageReceiver.setCurrentAccount(i16);
            int i17 = 7;
            if (secretMediaViewerF.f36122b != parentActivity) {
                secretMediaViewerF.f36122b = parentActivity;
                secretMediaViewerF.f36127c1 = new org.telegram.ui.Components.bm0(parentActivity, null);
                n0 n0Var = new n0(secretMediaViewerF, parentActivity, 21);
                secretMediaViewerF.d = n0Var;
                n0Var.setBackgroundDrawable(secretMediaViewerF.f36138h0);
                secretMediaViewerF.d.setFocusable(true);
                secretMediaViewerF.d.setFocusableInTouchMode(true);
                secretMediaViewerF.d.setClipChildren(false);
                secretMediaViewerF.d.setClipToPadding(false);
                secretMediaViewerF.f36130e = new ag.y1(secretMediaViewerF, parentActivity);
                View view = new View(parentActivity);
                secretMediaViewerF.f36133f = view;
                view.setBackgroundColor(2130706432);
                secretMediaViewerF.f36130e.addView(secretMediaViewerF.f36133f, h7.z5.e(-1, -2, 80));
                secretMediaViewerF.f36130e.setFocusable(false);
                secretMediaViewerF.d.addView(secretMediaViewerF.f36130e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) secretMediaViewerF.f36130e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                secretMediaViewerF.f36130e.setLayoutParams(layoutParams);
                secretMediaViewerF.f36130e.setFitsSystemWindows(true);
                secretMediaViewerF.f36130e.setOnApplyWindowInsetsListener(new p31(secretMediaViewerF, 0));
                secretMediaViewerF.f36130e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(secretMediaViewerF.f36130e.getContext(), secretMediaViewerF);
                secretMediaViewerF.H0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(secretMediaViewerF);
                ag.d2 d2Var = new ag.d2(secretMediaViewerF, parentActivity, i17);
                secretMediaViewerF.B = d2Var;
                d2Var.setTitleColor(-1);
                secretMediaViewerF.B.setSubtitleColor(-1);
                secretMediaViewerF.B.setBackgroundColor(2130706432);
                secretMediaViewerF.B.setOccupyStatusBar(true);
                secretMediaViewerF.B.C(1090519039, false);
                secretMediaViewerF.B.D(-1, false);
                secretMediaViewerF.B.setBackButtonImage(R.drawable.ic_ab_back);
                secretMediaViewerF.B.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                secretMediaViewerF.f36130e.addView(secretMediaViewerF.B, h7.z5.c(-2.0f, -1));
                secretMediaViewerF.B.setActionBarMenuOnItemClick(new pb0(secretMediaViewerF, 24));
                lh.w3 w3Var = new lh.w3(parentActivity, 1);
                secretMediaViewerF.f36157r = w3Var;
                w3Var.m(1.0f, -26.0f);
                secretMediaViewerF.f36157r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                secretMediaViewerF.f36130e.addView(secretMediaViewerF.f36157r, h7.z5.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                v31 v31Var = new v31(secretMediaViewerF, parentActivity);
                secretMediaViewerF.f36148n = v31Var;
                secretMediaViewerF.f36130e.addView(v31Var, h7.z5.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                gv0 gv0Var = new gv0(secretMediaViewerF, i13);
                secretMediaViewerF.Q = new w31(secretMediaViewerF, parentActivity);
                View view2 = new View(parentActivity);
                secretMediaViewerF.P = view2;
                view2.setBackgroundColor(2130706432);
                secretMediaViewerF.Q.addView(secretMediaViewerF.P, h7.z5.e(-1, -1, 119));
                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(secretMediaViewerF.f36130e.getContext());
                secretMediaViewerF.O = h5Var;
                h5Var.setTextColor(-1);
                secretMediaViewerF.O.setGravity(53);
                secretMediaViewerF.O.setTextSize(14);
                secretMediaViewerF.O.setImportantForAccessibility(2);
                secretMediaViewerF.Q.addView(secretMediaViewerF.O, h7.z5.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                aj0 aj0Var = new aj0(secretMediaViewerF, parentActivity, i17);
                secretMediaViewerF.N = aj0Var;
                org.telegram.ui.Components.o61 o61Var = new org.telegram.ui.Components.o61(aj0Var);
                secretMediaViewerF.M = o61Var;
                o61Var.f31199z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.o61 o61Var2 = secretMediaViewerF.M;
                o61Var2.f31185k = 872415231;
                o61Var2.f31186l = 872415231;
                o61Var2.f31187m = -1;
                o61Var2.f31188n = -1;
                o61Var2.A = 1509949439;
                o61Var2.f31184j = gv0Var;
                secretMediaViewerF.Q.addView(secretMediaViewerF.N);
                secretMediaViewerF.f36130e.addView(secretMediaViewerF.Q, h7.z5.e(-1, 48, 80));
                ur0 ur0Var = new ur0(null, new jh.b());
                secretMediaViewerF.U = ur0Var;
                ur0Var.f25877k0 = true;
                ur0Var.f25873i0 = false;
                qt0 qt0Var = new qt0(secretMediaViewerF.f36130e.getContext());
                secretMediaViewerF.V = qt0Var;
                qt0Var.setFactory(new ViewSwitcher.ViewFactory() {
                    @Override
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = secretMediaViewerF;
                        return new pt0(parentActivity, secretMediaViewer.W, secretMediaViewer.U, new b5(secretMediaViewer, 22), new ag0(secretMediaViewer, 2));
                    }
                });
                secretMediaViewerF.V.setVisibility(4);
                if (!secretMediaViewerF.f36162s1) {
                    secretMediaViewerF.f36162s1 = true;
                    secretMediaViewerF.V.setLayerType(2, null);
                    secretMediaViewerF.V.getCurrentView().setLayerType(2, null);
                    secretMediaViewerF.V.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                secretMediaViewerF.R = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.tf0 tf0Var = new org.telegram.ui.Components.tf0(28);
                secretMediaViewerF.S = tf0Var;
                tf0Var.setCallback(secretMediaViewerF.R);
                secretMediaViewerF.R.setImageDrawable(secretMediaViewerF.S);
                secretMediaViewerF.R.setScaleType(ImageView.ScaleType.CENTER);
                secretMediaViewerF.R.setScaleX(0.6f);
                secretMediaViewerF.R.setScaleY(0.6f);
                secretMediaViewerF.R.setAlpha(0.0f);
                secretMediaViewerF.R.setPivotX(AndroidUtilities.dp(32.0f));
                secretMediaViewerF.R.setPivotY(AndroidUtilities.dp(32.0f));
                secretMediaViewerF.f36130e.addView(secretMediaViewerF.R, h7.z5.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                secretMediaViewerF.f36125c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                AndroidUtilities.logFlagSecure();
                imageReceiver.setParentView(secretMediaViewerF.f36130e);
                imageReceiver.setForceCrossfade(true);
                org.telegram.ui.Cells.v9 v9VarO = secretMediaViewerF.U.o(secretMediaViewerF.d.getContext());
                if (v9VarO != null) {
                    AndroidUtilities.removeFromParent(v9VarO);
                    secretMediaViewerF.f36130e.addView(v9VarO);
                }
                secretMediaViewerF.U.T(secretMediaViewerF.f36130e);
                secretMediaViewerF.U.f25875j0 = true;
            }
            SecretMediaViewer secretMediaViewerF2 = SecretMediaViewer.f();
            gl glVar = rnVar.Ba;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewerF2.f36138h0;
            ImageReceiver imageReceiver2 = secretMediaViewerF2.h;
            if (secretMediaViewerF2.f36122b != null && messageObject4.needDrawBluredPreview()) {
                if (glVar == null || (cu0VarE = glVar.E(messageObject4, null, 0, true, false)) == null) {
                    return;
                }
                secretMediaViewerF2.f36147m1 = messageObject4.messageOwner.ttl == Integer.MAX_VALUE;
                secretMediaViewerF2.l1 = uVarO4;
                secretMediaViewerF2.J = glVar;
                secretMediaViewerF2.G = System.currentTimeMillis();
                secretMediaViewerF2.H = 0L;
                secretMediaViewerF2.f36136g0 = true;
                secretMediaViewerF2.f36134f0 = true;
                secretMediaViewerF2.f36146l0 = false;
                c5.c cVar = secretMediaViewerF2.f36166w;
                if (cVar != null) {
                    cVar.setVisibility(4);
                }
                secretMediaViewerF2.i();
                secretMediaViewerF2.J0 = 0.0f;
                secretMediaViewerF2.K0 = 1.0f;
                secretMediaViewerF2.L0 = 0.0f;
                secretMediaViewerF2.M0 = 0.0f;
                secretMediaViewerF2.N0 = 0.0f;
                secretMediaViewerF2.O0 = 0.0f;
                secretMediaViewerF2.P0 = 0.0f;
                secretMediaViewerF2.Q0 = 0.0f;
                secretMediaViewerF2.V0 = false;
                secretMediaViewerF2.W0 = false;
                secretMediaViewerF2.X0 = false;
                secretMediaViewerF2.Y0 = false;
                secretMediaViewerF2.Z0 = true;
                secretMediaViewerF2.n(secretMediaViewerF2.f36164u0);
                photoBackgroundDrawable.setAlpha(0);
                secretMediaViewerF2.f36130e.setAlpha(1.0f);
                secretMediaViewerF2.f36130e.setVisibility(0);
                secretMediaViewerF2.f36148n.setAlpha(1.0f);
                secretMediaViewerF2.F = false;
                secretMediaViewerF2.D = false;
                secretMediaViewerF2.E = false;
                secretMediaViewerF2.I = true;
                imageReceiver2.setManualAlphaAnimator(false);
                secretMediaViewerF2.K = 0;
                secretMediaViewerF2.L = 0;
                RectF rectF = new RectF(cu0VarE.f37153a.getDrawRegion());
                rectF.left = Math.max(rectF.left, cu0VarE.f37153a.getImageX());
                rectF.top = Math.max(rectF.top, cu0VarE.f37153a.getImageY());
                rectF.right = Math.min(rectF.right, cu0VarE.f37153a.getImageX2());
                rectF.bottom = Math.min(rectF.bottom, cu0VarE.f37153a.getImageY2());
                float fWidth = rectF.width();
                float fHeight = rectF.height();
                Point point = AndroidUtilities.displaySize;
                int i18 = point.x;
                int i19 = point.y + AndroidUtilities.statusBarHeight;
                secretMediaViewerF2.f36164u0 = Math.max(fWidth / i18, fHeight / i19);
                int[] iArr = cu0VarE.h;
                if (iArr != null) {
                    secretMediaViewerF2.D0 = new int[iArr.length];
                    int i20 = 0;
                    while (true) {
                        int[] iArr2 = cu0VarE.h;
                        c10 = 1;
                        if (i20 >= iArr2.length) {
                            break;
                        }
                        secretMediaViewerF2.D0[i20] = iArr2[i20];
                        i20++;
                    }
                } else {
                    c10 = 1;
                    secretMediaViewerF2.D0 = null;
                }
                float f12 = cu0VarE.f37154b;
                float f13 = rectF.left;
                secretMediaViewerF2.f36161s0 = ((fWidth / 2.0f) + (f12 + f13)) - (i18 / 2);
                secretMediaViewerF2.f36163t0 = ((fHeight / 2.0f) + (cu0VarE.f37155c + rectF.top)) - (i19 / 2);
                secretMediaViewerF2.f36158r0 = Math.abs(f13 - cu0VarE.f37153a.getImageX());
                int iAbs = (int) Math.abs(rectF.top - cu0VarE.f37153a.getImageY());
                int[] iArr3 = new int[2];
                cu0VarE.d.getLocationInWindow(iArr3);
                float f14 = (iArr3[c10] - (cu0VarE.f37155c + rectF.top)) + cu0VarE.f37160j;
                secretMediaViewerF2.f36149n0 = f14;
                float f15 = iAbs;
                secretMediaViewerF2.f36149n0 = Math.max(0.0f, Math.max(f14, f15));
                float height = (((cu0VarE.f37155c + rectF.top) + ((int) fHeight)) - (cu0VarE.d.getHeight() + iArr3[c10])) + cu0VarE.f37159i;
                secretMediaViewerF2.f36151o0 = height;
                secretMediaViewerF2.f36151o0 = Math.max(0.0f, Math.max(height, f15));
                secretMediaViewerF2.f36153p0 = 0.0f;
                secretMediaViewerF2.f36153p0 = Math.max(0.0f, Math.max(0.0f, f15));
                secretMediaViewerF2.f36155q0 = 0.0f;
                secretMediaViewerF2.f36155q0 = Math.max(0.0f, Math.max(0.0f, f15));
                secretMediaViewerF2.F0 = System.currentTimeMillis();
                secretMediaViewerF2.f36165v0 = 0.0f;
                secretMediaViewerF2.f36167w0 = 0.0f;
                secretMediaViewerF2.f36172z0 = 0.0f;
                secretMediaViewerF2.B0 = 0.0f;
                secretMediaViewerF2.C0 = 0.0f;
                secretMediaViewerF2.f36171y0 = 0.0f;
                secretMediaViewerF2.A0 = 0.0f;
                secretMediaViewerF2.f36169x0 = 1.0f;
                secretMediaViewerF2.E0 = true;
                secretMediaViewerF2.f36121a1 = true;
                gf.t0 t0Var = secretMediaViewerF2.f36139h1;
                if (t0Var != null) {
                    t0Var.destroy();
                    secretMediaViewerF2.f36139h1 = null;
                }
                LaunchActivity launchActivity = LaunchActivity.C1;
                secretMediaViewerF2.f36139h1 = launchActivity != null ? new gf.t0(launchActivity, true) : null;
                NotificationCenter.getInstance(secretMediaViewerF2.f36119a).addObserver(secretMediaViewerF2, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(secretMediaViewerF2.f36119a).addObserver(secretMediaViewerF2, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(secretMediaViewerF2.f36119a).addObserver(secretMediaViewerF2, NotificationCenter.didCreatedNewDeleteTask);
                secretMediaViewerF2.v = MessageObject.getPeerId(messageObject4.messageOwner.peer_id);
                secretMediaViewerF2.f36128d0 = messageObject4;
                TLRPC.Document document = messageObject4.getDocument();
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewerF2.f36131e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewerF2.f36131e0 = null;
                }
                secretMediaViewerF2.f36131e0 = cu0VarE.f37153a.getThumbBitmapSafe();
                secretMediaViewerF2.Q.setVisibility(8);
                if (document != null) {
                    for (int i21 = 0; i21 < document.attributes.size(); i21++) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i21);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                            secretMediaViewerF2.K = tL_documentAttributeVideo.f22387w;
                            secretMediaViewerF2.L = tL_documentAttributeVideo.h;
                            break;
                        }
                    }
                    if (MessageObject.isGifDocument(document)) {
                        secretMediaViewerF2.B.setTitle(LocaleController.getString(R.string.DisappearingGif));
                        String str2 = messageObject4.messageOwner.attachPath;
                        ImageLocation forDocument = (str2 == null || !messageObject4.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                        cu0Var = cu0VarE;
                        messageObject3 = messageObject4;
                        ImageLocation imageLocation = forDocument;
                        i11 = -1;
                        imageReceiver2.setImage(imageLocation, (String) null, secretMediaViewerF2.f36131e0 != null ? new BitmapDrawable(secretMediaViewerF2.f36131e0.bitmap) : null, -1L, (String) null, messageObject3, 1);
                    } else {
                        cu0Var = cu0VarE;
                        i11 = -1;
                        secretMediaViewerF2.X = 1;
                        secretMediaViewerF2.B.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                        File file2 = new File(messageObject4.messageOwner.attachPath);
                        if (file2.exists()) {
                            secretMediaViewerF2.h(file2);
                        } else {
                            File pathToMessage = FileLoader.getInstance(secretMediaViewerF2.f36119a).getPathToMessage(messageObject4.messageOwner);
                            File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                            if (file3.exists()) {
                                pathToMessage = file3;
                            }
                            secretMediaViewerF2.h(pathToMessage);
                        }
                        secretMediaViewerF2.F = true;
                        secretMediaViewerF2.Q.setVisibility(0);
                        messageObject3 = messageObject4;
                        imageReceiver2.setImage((ImageLocation) null, (String) null, secretMediaViewerF2.f36131e0 != null ? new BitmapDrawable(secretMediaViewerF2.f36131e0.bitmap) : null, -1L, (String) null, messageObject3, 2);
                    }
                    messageObject2 = messageObject3;
                    c11 = 3;
                } else {
                    cu0Var = cu0VarE;
                    i11 = -1;
                    secretMediaViewerF2.B.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, AndroidUtilities.getPhotoSize());
                    c11 = 3;
                    imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject4.photoThumbsObject), (String) null, secretMediaViewerF2.f36131e0 != null ? new BitmapDrawable(secretMediaViewerF2.f36131e0.bitmap) : null, -1L, (String) null, r3, 2);
                    messageObject2 = messageObject4;
                    if (closestPhotoSizeWithSize != null) {
                        secretMediaViewerF2.K = closestPhotoSizeWithSize.f22405w;
                        secretMediaViewerF2.L = closestPhotoSizeWithSize.h;
                    }
                }
                secretMediaViewerF2.j(messageObject2, "", false);
                secretMediaViewerF2.j(messageObject2, messageObject2.caption, true);
                secretMediaViewerF2.m(true, false);
                secretMediaViewerF2.k(false, false);
                secretMediaViewerF2.S.a(true, true);
                if (secretMediaViewerF2.f36147m1) {
                    v31 v31Var2 = secretMediaViewerF2.f36148n;
                    v31Var2.f43343e = true;
                    TextPaint textPaint = v31Var2.f43346r;
                    textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                    textPaint.setColor(i11);
                    StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    v31Var2.f43347s = staticLayout;
                    v31Var2.v = staticLayout.getLineCount() > 0 ? v31Var2.f43347s.getLineWidth(0) : 0.0f;
                    v31Var2.f43348w = v31Var2.f43347s.getHeight();
                    v31Var2.invalidate();
                    secretMediaViewerF2.f36148n.setOnClickListener(new v21(secretMediaViewerF2, 4));
                } else {
                    secretMediaViewerF2.f36148n.setOnClickListener(null);
                }
                try {
                    if (secretMediaViewerF2.d.getParent() != null) {
                        ((WindowManager) secretMediaViewerF2.f36122b.getSystemService("window")).removeView(secretMediaViewerF2.d);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                ((WindowManager) secretMediaViewerF2.f36122b.getSystemService("window")).addView(secretMediaViewerF2.d, secretMediaViewerF2.f36125c);
                secretMediaViewerF2.f36148n.invalidate();
                secretMediaViewerF2.f36160s = true;
                Window window = secretMediaViewerF2.f36122b.getWindow();
                secretMediaViewerF2.f36145k1 = AndroidUtilities.getLightNavigationBar(window);
                AndroidUtilities.setLightNavigationBar(secretMediaViewerF2.f36122b, false);
                AndroidUtilities.setLightNavigationBar((View) secretMediaViewerF2.d, false);
                Activity activity = secretMediaViewerF2.f36122b;
                if (activity instanceof LaunchActivity) {
                    secretMediaViewerF2.f36143j1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                    ((LaunchActivity) secretMediaViewerF2.f36122b).y(-16777216);
                } else {
                    secretMediaViewerF2.f36143j1 = window.getNavigationBarColor();
                    AndroidUtilities.setNavigationBarColor(secretMediaViewerF2.f36122b, -16777216);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                secretMediaViewerF2.G0 = animatorSet;
                ag.d2 d2Var2 = secretMediaViewerF2.B;
                Property property = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(d2Var2, (Property<ag.d2, Float>) property, 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(secretMediaViewerF2.W, (Property<at0, Float>) property, 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(secretMediaViewerF2.f36157r, (Property<lh.w3, Float>) property, 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0, 255);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(secretMediaViewerF2, secretMediaViewerF2.f36159r1, 0.0f, 1.0f);
                w31 w31Var = secretMediaViewerF2.Q;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(w31Var, w31Var.f43596n, 1.0f);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(secretMediaViewerF2.Q, (Property<w31, Float>) property, secretMediaViewerF2.F ? 1.0f : 0.0f);
                Animator[] animatorArr = new Animator[7];
                animatorArr[0] = objectAnimatorOfFloat;
                animatorArr[1] = objectAnimatorOfFloat2;
                animatorArr[2] = objectAnimatorOfFloat3;
                animatorArr[c11] = objectAnimatorOfInt;
                animatorArr[4] = objectAnimatorOfFloat4;
                animatorArr[5] = objectAnimatorOfFloat5;
                animatorArr[6] = objectAnimatorOfFloat6;
                animatorSet.playTogether(animatorArr);
                secretMediaViewerF2.f36140i0 = 3;
                secretMediaViewerF2.f36144k0 = new bf0(secretMediaViewerF2, meVarFb, messageObject2, 26);
                secretMediaViewerF2.G0.setDuration(250L);
                secretMediaViewerF2.G0.addListener(new t31(secretMediaViewerF2, 0));
                secretMediaViewerF2.f36142j0 = System.currentTimeMillis();
                if (SharedConfig.getDevicePerformanceClass() == 0) {
                    secretMediaViewerF2.f36130e.setLayerType(2, null);
                }
                secretMediaViewerF2.G0.setInterpolator(new DecelerateInterpolator());
                photoBackgroundDrawable.f36174b = 0;
                photoBackgroundDrawable.f36173a = new m21(3, secretMediaViewerF2, cu0Var);
                secretMediaViewerF2.G0.start();
            }
        } else {
            if (MessageObject.isAnimatedEmoji(messageObject4.getDocument()) && MessageObject.getInputStickerSet(messageObject4.getDocument()) != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(MessageObject.getInputStickerSet(messageObject4.getDocument()));
                org.telegram.ui.Components.cv cvVar = new org.telegram.ui.Components.cv(rnVar, rnVar.getParentActivity(), rnVar.f41983aa, arrayList);
                cvVar.setCalcMandatoryInsets(rnVar.x9());
                rnVar.showDialog(cvVar);
                return;
            }
            if (messageObject4.getInputStickerSet() != null) {
                org.telegram.ui.Components.ex0 ex0Var = new org.telegram.ui.Components.ex0(rnVar.getParentActivity(), rnVar, messageObject4.getInputStickerSet(), null, (rnVar.K0.getVisibility() == 0 || !((chat = rnVar.f42026e) == null || ChatObject.canSendStickers(chat))) ? null : rnVar.U, rnVar.f41983aa);
                ex0Var.setCalcMandatoryInsets(rnVar.x9());
                rnVar.showDialog(ex0Var);
                return;
            }
            if (messageObject4.isVideo() || (i10 = messageObject4.type) == 1 || ((i10 == 0 && !messageObject4.isWebpageDocument()) || messageObject4.isGif())) {
                wm wmVar = null;
                if (messageObject4.isSponsored()) {
                    if (messageObject4.isGif() || messageObject4.isPhoto()) {
                        int i22 = 1;
                        rnVar.J9(messageObject4, true, false);
                        if (messageObject4.sponsoredUrl != null) {
                            we.d dVar2 = rnVar.wb;
                            if (dVar2 != null) {
                                dVar2.a(true);
                            }
                            if (s1Var.getMessageObject() != null) {
                                wmVar = new wm(this, s1Var, i22);
                            }
                            rnVar.wb = wmVar;
                            we.e.r(rnVar.getParentActivity(), Uri.parse(messageObject4.sponsoredUrl), true, false, false, rnVar.wb, null, false, rnVar.getMessagesController().sponsoredLinksInappAllow, false);
                            return;
                        }
                    } else if (messageObject4.isVideo()) {
                        rnVar.J9(messageObject4, true, false);
                    }
                }
                if (messageObject4.getDuration() > 0.0d && messageObject4.getVideoStartsTimestamp() > 0 && !messageObject4.openedInViewer) {
                    messageObject4.forceSeekTo = (float) (((double) messageObject4.getVideoStartsTimestamp()) / messageObject4.getDuration());
                }
                rnVar.ha(s1Var, messageObject4);
                return;
            }
            int i23 = messageObject4.type;
            if (i23 == 3) {
                rnVar.fb(messageObject4, true);
                try {
                    String str3 = messageObject4.messageOwner.attachPath;
                    File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject4.messageOwner.attachPath);
                    if (file4 == null || !file4.exists()) {
                        file4 = rnVar.getFileLoader().getPathToMessage(messageObject4.messageOwner);
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.setFlags(1);
                        intent.setDataAndType(FileProvider.d(rnVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                    }
                    rnVar.getParentActivity().startActivityForResult(intent, 500);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    rnVar.z6(messageObject4);
                }
            } else if (i23 == 4) {
                if (AndroidUtilities.isMapsInstalled(rnVar)) {
                    if (!messageObject4.isLiveLocation()) {
                        tc0 tc0Var = new tc0(rnVar.h == null ? 3 : 0);
                        tc0Var.B0 = rnVar;
                        tc0Var.u0(messageObject4);
                        rnVar.presentFragment(tc0Var);
                        return;
                    }
                    TLRPC.Chat chat2 = rnVar.f42026e;
                    tc0 tc0Var2 = new tc0((chat2 == null || ChatObject.canSendMessages(chat2) || rnVar.f42026e.megagroup) ? 2 : 6);
                    tc0Var2.B0 = rnVar;
                    tc0Var2.u0(messageObject4);
                    rnVar.presentFragment(tc0Var2);
                }
            } else if (i23 == 9 || i23 == 0) {
                if (messageObject4.getDocumentName().toLowerCase().endsWith("attheme")) {
                    String str4 = messageObject4.messageOwner.attachPath;
                    if (str4 == null || str4.length() == 0) {
                        file = null;
                    } else {
                        file = new File(messageObject4.messageOwner.attachPath);
                        if (!file.exists()) {
                            file = null;
                        }
                    }
                    if (file == null) {
                        File pathToMessage2 = rnVar.getFileLoader().getPathToMessage(messageObject4.messageOwner);
                        if (pathToMessage2.exists()) {
                            file = pathToMessage2;
                        }
                    }
                    org.telegram.ui.ActionBar.f6 f6VarU = org.telegram.ui.ActionBar.g6.u(file, messageObject4.getDocumentName(), null, true);
                    if (f6VarU != null) {
                        rnVar.presentFragment(new nc1(f6VarU));
                        return;
                    }
                    rnVar.f42217t4 = -1;
                }
                if (messageObject4.canPreviewDocument()) {
                    PhotoViewer.t1().K2(null, rnVar, rnVar.f41983aa);
                    PhotoViewer photoViewerT1 = PhotoViewer.t1();
                    int i24 = messageObject4.type;
                    long j11 = i24 != 0 ? rnVar.P5 : 0L;
                    if (i24 != 0) {
                        jB = 0;
                        j10 = rnVar.H6;
                    } else {
                        j10 = 0;
                        jB = 0;
                    }
                    if (i24 != 0) {
                        jB = rnVar.b();
                    }
                    photoViewerT1.c2(messageObject4, rnVar, j11, j10, jB, rnVar.Ba);
                    messageObject = messageObject4;
                    z11 = true;
                } else {
                    messageObject = messageObject4;
                    z11 = false;
                }
                Pattern pattern = org.telegram.ui.Components.d90.f27680a;
                String extension = messageObject.getExtension();
                if ("md".equalsIgnoreCase(extension) || "mkd".equalsIgnoreCase(extension) || "mdwn".equalsIgnoreCase(extension) || "mkdn".equalsIgnoreCase(extension) || "mdown".equalsIgnoreCase(extension) || "markdown".equalsIgnoreCase(extension)) {
                    if (rnVar.getParentActivity() != null) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(rnVar.getParentActivity(), 3, rnVar.f41983aa);
                        b2Var.setCanceledOnTouchOutside(false);
                        boolean[] zArr = {false};
                        b2Var.setOnCancelListener(new xg(0, zArr));
                        b2Var.q(150L);
                        new Thread(new yf(rnVar, messageObject, b2Var, zArr)).start();
                    }
                    z12 = true;
                } else {
                    String mimeType = messageObject.getMimeType();
                    if (mimeType != null) {
                        String lowerCase = mimeType.toLowerCase();
                        if (lowerCase.startsWith("text/markdown") || lowerCase.startsWith("text/x-markdown") || lowerCase.startsWith("text/x-web-markdown")) {
                            if (rnVar.getParentActivity() != null) {
                                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(rnVar.getParentActivity(), 3, rnVar.f41983aa);
                                b2Var2.setCanceledOnTouchOutside(false);
                                boolean[] zArr2 = {false};
                                b2Var2.setOnCancelListener(new xg(0, zArr2));
                                b2Var2.q(150L);
                                new Thread(new yf(rnVar, messageObject, b2Var2, zArr2)).start();
                            }
                            z12 = true;
                        }
                    }
                    z12 = z11;
                }
                if (!z12) {
                    try {
                        AndroidUtilities.openForView(messageObject, rnVar.getParentActivity(), rnVar.f41983aa, false);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        rnVar.z6(messageObject);
                    }
                }
            }
        }
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        x4 x4Var;
        hk hkVar;
        gk gkVar;
        if (!l()) {
            return false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        rn rnVar = this.f37446a;
        int i13 = (zIsEmpty || rnVar.f42026e == null || ((hkVar = rnVar.K0) != null && hkVar.getVisibility() == 0) || ((gkVar = rnVar.N) != null && gkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = rnVar.f42026e;
        int i14 = (chat2 == null || !(rnVar.Z3 == 0 || rnVar.f42017d4) || (ChatObject.isChannel(chat2) && !rnVar.f42026e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = rnVar.f42026e;
        int i15 = (chat3 == null || chat3.f22380id != chat.f22380id || rnVar.F9()) ? 1 : 0;
        d5[] d5VarArr = new d5[i15 + 1 + i13 + i14];
        d5VarArr[0] = d5.d;
        if (i15 != 0) {
            d5VarArr[1] = chat.broadcast ? d5.f37257e : d5.f37258f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i13 != 0) {
            d5VarArr[i10] = d5.f37259n;
            i10++;
        }
        if (i14 != 0) {
            d5VarArr[i10] = d5.f37260r;
        }
        TLRPC.ChatFull chatFull = rnVar.getMessagesController().getChatFull(chat.f22380id);
        if (chatFull != null) {
            x4Var = x4.a(chat, chatFull, d5VarArr);
            z11 = i13;
            i12 = i14;
            i11 = i15;
            z10 = true;
        } else {
            int i16 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
            int i17 = i14;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i18 = i15;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i11 = i18;
            z11 = i13;
            i12 = i17;
            x4Var = new x4(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, d5VarArr, new w4(i16, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (com.google.firebase.messaging.l.e(x4Var)) {
            com.google.firebase.messaging.l.i().s((ViewGroup) rnVar.fragmentView, rnVar.f41983aa, x4Var, new b7(this, chat, s1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(rnVar, s1Var);
        b70VarH.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new rm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        b70VarH.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new u1(this, s1Var, chat, 26), i11);
        b70VarH.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new rm(this, chat, 1), z11);
        b70VarH.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new rm(this, chat, 2), i12);
        b70VarH.f26993t = false;
        b70VarH.f26974i = 3;
        b70VarH.W = true;
        b70VarH.a0(0.0f, -AndroidUtilities.dp(48.0f));
        b70VarH.Z();
        return true;
    }

    @Override
    public final void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        rn rnVar = this.f37446a;
        if (rnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) hf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) hf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (rnVar.getParentActivity() != null) {
            if (rnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        rnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
                        try {
                            s1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(rnVar.getParentActivity(), rnVar.f41983aa, false, false);
                e3Var.fixNavigationBar();
                e3Var.title = str;
                e3Var.bigTitle = false;
                e3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                w wVar = new w(2, rnVar, str);
                e3Var.items = charSequenceArr;
                e3Var.onClickListener = wVar;
                rnVar.showDialog(e3Var);
            }
        }
    }

    @Override
    public final String z(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        rn rnVar = this.f37446a;
        if (UserObject.isBotForum(rnVar.f42039f)) {
            return null;
        }
        TLRPC.Chat chat = rnVar.f42026e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = rnVar.getMessagesController().getAdminRank(rnVar.f42026e.f22380id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = rnVar.Y3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean z1() {
        rn rnVar = this.f37446a;
        return rnVar.T0.getKeyboardHeight() + rnVar.f42113ka >= AndroidUtilities.dp(20.0f);
    }
}
