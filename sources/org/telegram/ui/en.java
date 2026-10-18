package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.UndoView;
public final class en implements org.telegram.ui.Cells.l1 {
    public final sn f36573a;

    public en(sn snVar) {
        this.f36573a = snVar;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            u1Var.t2();
            u1Var.requestLayout();
            this.f36573a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        sn snVar = this.f36573a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(snVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(snVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = snVar.getMessagesController().conferenceCallSizeLimit;
                b2Var.setOnCancelListener(new ai.e0(this, snVar.getConnectionsManager().sendRequest(getgroupcall, new ai.s9(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                b2Var.q(600L);
                return;
            }
            TLRPC.User user = snVar.f41229f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = snVar.f41172a8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, i11, snVar.getParentActivity(), snVar.getMessagesController().getUserFull(snVar.f41229f.f20426id), snVar.getAccountInstance());
                return;
            }
            return;
        }
        snVar.L7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        sn snVar = this.f36573a;
        if (!snVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.d.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ag.d.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (snVar.getParentActivity() != null) {
                if (snVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) snVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) snVar.f41226ea, false);
                        f3Var.fixNavigationBar();
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        f3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        mg.j jVar = new mg.j(3, snVar, str);
                        f3Var.items = charSequenceArr;
                        f3Var.onClickListener = jVar;
                        snVar.showDialog(f3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        snVar.ea(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
                        try {
                            u1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
        sn snVar = this.f36573a;
        if (!snVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(snVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            snVar.getMessagesController().getContentSettings(new z(this, b2Var, u1Var, 6));
            return;
        }
        if (u1Var.getMessageObject() != null) {
            u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        u1Var.h4();
    }

    @Override
    public final boolean B1() {
        sn snVar = this.f36573a;
        if (snVar.X0.getKeyboardHeight() + snVar.f41350oa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, false, true);
    }

    @Override
    public final void D(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int dp;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i13 = buttonCustom.f17789id;
            TL_stars.StarsAmount starsAmount = null;
            sn snVar = this.f36573a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(19, this, message);
                Pattern pattern = org.telegram.ui.Components.f5.f26087a;
                Activity parentActivity = snVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                editText.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                editText.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.h6.T(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.u4(parentActivity)});
                if (LocaleController.isRTL) {
                    i12 = AndroidUtilities.dp(24.0f);
                } else {
                    i12 = 0;
                }
                int dp2 = AndroidUtilities.dp(8.0f);
                if (LocaleController.isRTL) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(24.0f);
                }
                editText.setPadding(i12, dp2, dp, AndroidUtilities.dp(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new m4.w0(28, j3Var, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b2Var.N = new org.telegram.ui.Components.q1(editText, 0);
                frameLayout.addView(editText, w7.z5.a(-2.0f, 23.0f, 0.0f, 23.0f, 21.0f, -1, 0));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
                snVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, snVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, snVar.e, 5);
                    }
                    ai.x9 x9Var = new ai.x9(this, message, canManageMonoForum, messageObject, 11);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    snVar.j7(x9Var, ag.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                snVar.L7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                snVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        sn snVar = this.f36573a;
        snVar.f41210d5 = messageObject;
        snVar.i9();
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            sn snVar = this.f36573a;
            if ((snVar.f41451wb != id2 || snVar.f41465xb != 7) && (inputPeer = snVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f20496id = id2;
                pf.c cVar = snVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    snVar.Ab = null;
                }
                ti tiVar = new ti(snVar, id2, u1Var, 2);
                tiVar.f44328b = new i0(27, snVar, r3);
                snVar.Ab = tiVar;
                tiVar.d();
                int[] iArr = {snVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new ai.t3(snVar, tiVar, iArr, u1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        sn snVar = this.f36573a;
        snVar.f41464xa.k(u1Var, snVar, true);
        snVar.f41454x0.I0(false);
    }

    @Override
    public final void F1(MessageObject messageObject) {
        this.f36573a.f41388s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new mi.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.kk.p(R.string.CodeCopied, org.telegram.ui.Components.xc.a0(this.f36573a));
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        sn snVar = this.f36573a;
        snVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        snVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        h(u1Var, true, false, true);
    }

    @Override
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        an anVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && pf.d.g(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        sn snVar = this.f36573a;
        pf.c cVar = snVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        if (u1Var.getMessageObject() == null) {
            anVar = null;
        } else {
            anVar = new an(this, u1Var);
        }
        snVar.Ab = anVar;
        if (!z11 && !pf.d.e(parse, false, null)) {
            org.telegram.ui.Components.f5.q0(snVar, str, true, true, true, !z11, snVar.Ab, webPage, snVar.f41226ea);
        } else {
            pf.d.q(snVar.getParentActivity(), parse, true, true, false, snVar.Ab, null, false, true, false);
        }
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        sn snVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (snVar = this.f36573a).f41451wb) != 0 && i10 == u1Var.getMessageObject().getId() && snVar.f41465xb == 1) {
            return snVar.f41478yb;
        }
        return null;
    }

    @Override
    public final void I(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f36573a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            sn snVar = this.f36573a;
            org.telegram.ui.Components.cv.J(snVar, messageObject, snVar.Ga, str2, str3, str4, str, i10, i11, -1, snVar.C9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean J0(long j10) {
        sn snVar = this.f36573a;
        TLRPC.Chat chat = snVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return snVar.getMessagesController().isOwner(snVar.e.f20279id, j10);
        }
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        ue ueVar;
        a3.i0 i0Var;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        ah.v vVar;
        int i10;
        boolean z11;
        int i11;
        x31 x31Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f36573a.A0.L();
                    sn snVar = this.f36573a;
                    return mediaController.setPlaylist(L, messageObject, snVar.L6, true ^ snVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f36573a.U7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            z31 z31Var = this.f36573a.Z9;
            if (z31Var == null || z31Var.f43569b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.xc.a0(this.f36573a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f36573a.Z9 = new z31(this.f36573a.getParentActivity());
                z31 z31Var2 = this.f36573a.Z9;
                if (!messageObject.isOutOwner()) {
                    ueVar = this.f36573a.jb(messageObject, true);
                } else {
                    ueVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    i0Var = sn.P4(this.f36573a, messageObject);
                } else {
                    i0Var = null;
                }
                Context context = z31Var2.f43566a;
                ah.v vVar2 = z31Var2.f43570c;
                z31Var2.X = ueVar;
                z31Var2.Y = i0Var;
                x31 x31Var2 = z31Var2.N;
                if (x31Var2 != null) {
                    vVar2.removeView(x31Var2);
                    z31Var2.N = null;
                }
                z31Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                z31Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z31Var2.S = z10;
                org.telegram.ui.Cells.u1 u1Var2 = z31Var2.O;
                if (u1Var2 != null) {
                    d6Var = u1Var2.getResourcesProvider();
                } else {
                    d6Var = null;
                }
                z31Var2.L = d6Var;
                if (z31Var2.O != null) {
                    z31Var2.T = 0.0f;
                    z31Var2.U = u1Var.f23403n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        z31Var2.T = view.getY() + z31Var2.T;
                        z31Var2.U = view.getY() + z31Var2.U;
                    }
                    int width = z31Var2.O.getWidth();
                    int height = z31Var2.O.getHeight();
                    if (z31Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    z31Var2.K = i14 - z31Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    vVar = vVar2;
                    x31 x31Var3 = new x31(z31Var2, z31Var2.getContext(), UserConfig.selectedAccount, z31Var2.O.getResourcesProvider(), width, i14);
                    z31Var2.N = x31Var3;
                    z31Var2.O.j1(x31Var3);
                    z31Var2.N.i1(z31Var2.O);
                    z31Var2.N.setDelegate(new pb.a(18));
                    x31 x31Var4 = z31Var2.N;
                    MessageObject messageObject3 = z31Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = z31Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = z31Var2.O;
                    x31Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!z31Var2.S) {
                        org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8();
                        z31Var2.V = l8Var;
                        x31 x31Var5 = z31Var2.N;
                        l8Var.f28157i = x31Var5;
                        x31Var5.f23290ee = l8Var;
                        if (x31Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.fp0 seekBarWaveform = z31Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = z31Var2.f43577s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.f26349n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    z31Var2.H = false;
                    vVar.addView(z31Var2.N, new FrameLayout.LayoutParams(z31Var2.O.getWidth(), i14, 17));
                } else {
                    vVar = vVar2;
                    i10 = 360;
                }
                TextureView textureView = z31Var2.P;
                if (textureView != null) {
                    vVar.removeView(textureView);
                    z31Var2.P = null;
                }
                if (z31Var2.S) {
                    z31Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    z31Var2.P = textureView2;
                    vVar.addView(textureView2, 0, w7.z5.d(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.a81 a81Var = z31Var2.f43578w;
                if (a81Var != null) {
                    a81Var.B();
                    z31Var2.f43578w.H();
                    z31Var2.f43578w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = z31Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(z31Var2.O.getMessageObject().currentAccount).getPathToAttach(z31Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(z31Var2.O.getMessageObject().currentAccount).getPathToMessage(z31Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && z31Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(z31Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.a81 a81Var2 = new org.telegram.ui.Components.a81();
                        z31Var2.f43578w = a81Var2;
                        a81Var2.J = new y31(z31Var2);
                        if (z31Var2.V != null) {
                            a81Var2.K = new y31(z31Var2);
                        }
                        if (z31Var2.S) {
                            a81Var2.V(z31Var2.P);
                        }
                        z31Var2.f43578w.D(Uri.fromFile(pathToAttach), "other");
                        z31Var2.f43578w.C();
                        org.telegram.ui.Components.rt rtVar = z31Var2.E;
                        if (rtVar != null) {
                            rtVar.f30053s = z31Var2.f43578w;
                            rtVar.a();
                        }
                    }
                    sn snVar2 = this.f36573a;
                    snVar2.showDialog(snVar2.Z9);
                    return false;
                }
                ei.x3 x3Var = z31Var2.f43579x;
                if (x3Var != null) {
                    vVar.removeView(x3Var);
                    z31Var2.f43579x = null;
                }
                MessageObject messageObject4 = z31Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = z31Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(z31Var2.M.currentAccount).getClientUserId()) {
                    ei.x3 x3Var2 = new ei.x3(context, 3);
                    z31Var2.f43579x = x3Var2;
                    x3Var2.p(true);
                    if (z11) {
                        long dialogId = z31Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(z31Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(z31Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        ei.x3 x3Var3 = z31Var2.f43579x;
                        if (z31Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        x3Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ei.x3 x3Var4 = z31Var2.f43579x;
                        if (z31Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        x3Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    z31Var2.f43579x.q(12.0f);
                    ei.x3 x3Var5 = z31Var2.f43579x;
                    if (!z11 && !z31Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    x3Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (z31Var2.S) {
                        z31Var2.f43579x.m(0.5f, 0.0f);
                        z31Var2.f43579x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        z31Var2.f43579x.m(0.0f, AndroidUtilities.dp(34.0f));
                        z31Var2.f43579x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    z31Var2.f43579x.t(14.0f);
                    ei.x3 x3Var6 = z31Var2.f43579x;
                    x3Var6.h = ei.x3.a(x3Var6.getText(), z31Var2.f43579x.getTextPaint());
                    if (z31Var2.S) {
                        vVar.addView(z31Var2.f43579x, w7.z5.a(150.0f, 0.0f, (-75.0f) - (((z31Var2.O.getHeight() + z31Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f, (int) ((z31Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 17));
                    } else {
                        vVar.addView(z31Var2.f43579x, w7.z5.a(150.0f, ((((z31Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + z31Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((z31Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f, (int) ((z31Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 17));
                    }
                    z31Var2.f43579x.u();
                }
                TextView textView = z31Var2.f43580y;
                if (textView != null) {
                    vVar.removeView(textView);
                    z31Var2.f43580y = null;
                }
                TextView textView2 = new TextView(context);
                z31Var2.f43580y = textView2;
                textView2.setTextColor(-1);
                z31Var2.f43580y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    z31Var2.f43580y.setBackground(org.telegram.ui.ActionBar.h6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    z31Var2.f43580y.setBackground(org.telegram.ui.ActionBar.h6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                z31Var2.f43580y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.b6.a(z31Var2.f43580y);
                TextView textView3 = z31Var2.f43580y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                z31Var2.f43580y.setOnClickListener(new v31(z31Var2, 1));
                vVar.addView(z31Var2.f43580y, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 18.0f, -2, 81));
                if (!z11 && (x31Var = z31Var2.N) != null && x31Var.getMessageObject() != null && z31Var2.N.getMessageObject().messageOwner != null) {
                    z31Var2.N.getMessageObject().messageOwner.media_unread = false;
                    z31Var2.N.invalidate();
                }
                sn snVar22 = this.f36573a;
                snVar22.showDialog(snVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        sn snVar = this.f36573a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (snVar.T5 != j10) {
                snVar.presentFragment(sn.W9(j10));
            } else {
                snVar.f41166a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            snVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void K0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        ArrayList<MessageObject> arrayList;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        sn snVar = this.f36573a;
        vh.i iVar = snVar.X9;
        if (iVar != null) {
            HashMap hashMap = iVar.f48487a;
            vh.h hVar = (vh.h) hashMap.get(vh.i.b(u1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            vh.h hVar2 = (vh.h) snVar.X9.f48487a.get(vh.i.b(u1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j10 = hVar2.f48484w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = snVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.f5.g(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) snVar.f41460x6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.g0.k(messageObject);
                    }
                    if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j11 = j10;
                    a3.i0 i0Var2 = new a3.i0(this, arrayList, j11, 17);
                    if (z10) {
                        i0Var2.run();
                        i0Var = null;
                    } else {
                        i0Var = i0Var2;
                    }
                    qcVar = org.telegram.ui.Components.xc.v(snVar.getParentActivity(), snVar, null, 1, j11, 1, snVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), snVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, false, i0Var);
                    qcVar.f29646k = true;
                    qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
                }
            }
            vh.h hVar3 = (vh.h) hashMap.get(vh.i.b(u1Var));
            if (hVar3 != null) {
                if (qcVar == null) {
                    hVar3.R = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (!(ubVar instanceof org.telegram.ui.Components.yb)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ubVar;
                hVar3.W = ybVar;
                ybVar.f32605a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new zl(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
        TLRPC.Message message;
        if (u1Var == null) {
            tVar.run();
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f36573a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
            return;
        }
        tVar.run();
    }

    @Override
    public final void L1() {
        org.telegram.ui.ActionBar.d6 d6Var;
        sn snVar = this.f36573a;
        if (snVar.X0 != null && snVar.getParentActivity() != null) {
            Context context = snVar.X0.getContext();
            d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
            v21.U(context, snVar, false, d6Var, null);
        }
    }

    @Override
    public final void M(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f36573a.jb(messageObject, true);
        }
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String string;
        int i13;
        TLRPC.User user;
        int i14;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        MessageObject messageObject = u1Var.getMessageObject();
        boolean z11 = false;
        xm xmVar = null;
        xm xmVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        xm xmVar3 = null;
        xm xmVar4 = null;
        sn snVar = this.f36573a;
        if (i10 == 19) {
            pf.c cVar = snVar.Ab;
            if (cVar != null) {
                cVar.a(true);
            }
            if (u1Var.getMessageObject() != null) {
                xmVar2 = new xm(this, u1Var, 2);
            }
            final xm xmVar5 = xmVar2;
            snVar.Ab = xmVar5;
            final Activity parentActivity = snVar.getParentActivity();
            final org.telegram.ui.ActionBar.d6 resourceProvider = snVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            xmVar5.d();
            xmVar5.f44328b = new ug.d(atomicBoolean, 0);
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
            final String b10 = ug.i.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.messageOwner.date * 1000;
            ug.r.d(messageObject, new Utilities.Callback(atomicBoolean, xmVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f47713a;
                public final pf.c f47714b;
                public final boolean f47715c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f47716f;
                public final d6 f47717g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f47716f = parentActivity;
                    this.f47717g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f47713a.get()) {
                        this.f47714b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f47715c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f47716f;
                        d6 d6Var = this.f47717g;
                        if (z12) {
                            i.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            i.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                        }
                    }
                }
            }, new ug.f(atomicBoolean, xmVar5, 0));
        } else if (i10 == 21) {
            f();
        } else if (i10 == 84) {
            snVar.ya(u1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.s8 s8Var = org.telegram.ui.Components.kh0.O;
            if (snVar.getParentActivity() != null) {
                snVar.showDialog(new org.telegram.ui.Components.kh0(snVar.getContext(), snVar.getCurrentAccount(), messageObject, snVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                    snVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                user = MessagesController.getInstance(i14).getUser(Long.valueOf(j11));
            } else {
                user = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f20426id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                snVar.presentFragment(new ProfileActivity(bundle, null));
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
                snVar.showDialog(new org.telegram.ui.Components.if0(snVar, null, user, null, file, jf.b.d(str, false), str3, str4, snVar.f41226ea));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            snVar.presentFragment(new sn(zf.d0.b(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.kk.g(new StringBuilder("+"), user2.phone, jf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = jf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f20426id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                snVar.presentFragment(new hs(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                snVar.O9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    pf.c cVar2 = snVar.Ab;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        xmVar3 = new xm(this, u1Var, 4);
                    }
                    snVar.Ab = xmVar3;
                    pf.d.q(snVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, snVar.Ab, null, false, snVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage storyMentionWebpage = messageObject.getStoryMentionWebpage();
            if (storyMentionWebpage == null && (message = messageObject.messageOwner) != null && (messageMedia2 = message.media) != null) {
                storyMentionWebpage = messageMedia2.webpage;
            }
            if (storyMentionWebpage != null) {
                if (storyMentionWebpage.attributes != null) {
                    for (int i15 = 0; i15 < storyMentionWebpage.attributes.size(); i15++) {
                        if ((storyMentionWebpage.attributes.get(i15) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i15)).storyItem) != null) {
                            storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            snVar.getOrCreateStoryViewer().F(snVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ci.r7.a(snVar.f41454x0));
                            return;
                        }
                    }
                }
                if (!snVar.ja(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
                    pf.c cVar3 = snVar.Ab;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        xmVar4 = new xm(this, u1Var, 5);
                    }
                    snVar.Ab = xmVar4;
                    pf.d.q(snVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, snVar.Ab, null, false, true, false);
                }
            }
        } else {
            if (i10 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                pf.c cVar4 = snVar.Ab;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (u1Var.getMessageObject() != null) {
                    xmVar = new xm(this, u1Var, 3);
                }
                snVar.Ab = xmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        snVar.Ab.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        snVar.Ab.f44328b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ei.o3(4, this, z11)), 29);
                        return;
                    }
                }
                pf.d.q(snVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, snVar.Ab, null, false, true, false);
            }
        }
    }

    @Override
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ti tiVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        ah.g gVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            sn snVar = this.f36573a;
            pf.c cVar = snVar.Ab;
            if (cVar != null) {
                cVar.a(true);
                snVar.Ab = null;
            }
            if (u1Var.getMessageObject() == null) {
                snVar.Ab = null;
                tiVar = null;
            } else {
                tiVar = new ti(snVar, u1Var.getMessageObject().getId(), u1Var, 1);
                snVar.Ab = tiVar;
            }
            i10 = ((org.telegram.ui.ActionBar.n2) this.f36573a).currentAccount;
            ai.ga y3 = ai.ga.y(i10, false);
            Objects.requireNonNull(tiVar);
            vi viVar = new vi(tiVar, 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.d6 I = ai.ga.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f1354a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject q6 = gi.d3.q(I, false);
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                gVar = new ah.g(y3, ConnectionsManager.getInstance(y3.f1354a).sendRequest(tL_payments_getPaymentForm, new ai.y2(y3, messageObject, tL_inputInvoiceMessage, viVar, 3)), 2);
            }
            if (gVar != null) {
                tiVar.f44328b = gVar;
                tiVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i11 = -1;
            for (int i12 = 0; i12 < tL_messageMediaPaidMedia.extended_media.size(); i12++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i12);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i11 = arrayList.size();
                    }
                    TLRPC.TL_message F7 = sn.F7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        F7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        F7.attachPath = message.attachPath;
                    }
                    F7.media = tL_messageExtendedMedia.media;
                    F7.noforwards = true;
                    arrayList.add(new MessageObject(messageObject.currentAccount, F7, false, true));
                }
            }
            if (i11 > -1 && !arrayList.isEmpty()) {
                PhotoViewer t12 = PhotoViewer.t1();
                sn snVar2 = this.f36573a;
                t12.K2(null, snVar2, snVar2.f41226ea);
                PhotoViewer.t1().b2(arrayList, i11, this.f36573a.a(), 0L, 0L, this.f36573a.Ha);
            }
        }
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        sn snVar = this.f36573a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!u1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(snVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!snVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new pm(this, 9))).k(true);
            return false;
        } else {
            snVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(snVar.e, snVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        sn snVar = this.f36573a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            sg.l1 l1Var = new sg.l1(snVar, i10, user, null, null, snVar.f41226ea);
            u1Var.getLocationOnScreen(new int[2]);
            l1Var.f46363v0 = u1Var.getNameStatusX();
            l1Var.f46364w0 = u1Var.getNameStatusY();
            l1Var.f46367z0 = u1Var.getScaleX();
            l1Var.f46365x0 = u1Var.getLeft();
            l1Var.f46366y0 = u1Var.getTop();
            l1Var.A0 = u1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
                Integer num = null;
                if (peerColors != null) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor != null) {
                    num = Integer.valueOf(peerColor.getColor1());
                }
                l1Var.f46362u0 = num;
            } else {
                l1Var.f46362u0 = Integer.valueOf(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21252r8[colorId]));
            }
            org.telegram.ui.Components.p5 p5Var = u1Var.fc;
            if (p5Var != null && (p5Var.f29185f[0] instanceof org.telegram.ui.Components.r5)) {
                l1Var.f46367z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(snVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f21156m6, 0.2f);
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
                    w9Var.setLayerNum(7);
                    w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    w9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = l1Var.f46362u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = snVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21326v6);
                        }
                        w9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        l1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        l1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    l1Var.B0 = w9Var;
                    l1Var.E0 = true;
                }
            }
            snVar.showDialog(l1Var);
            return;
        }
        pf.d.r(snVar.getParentActivity(), "https://" + snVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        sn snVar = this.f36573a;
        snVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, snVar);
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.u1 r44, org.telegram.tgnet.TLRPC.PollAnswer r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.en.O1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean P() {
        sn snVar = this.f36573a;
        if (snVar.W5[1].size() + snVar.W5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final xu0 P1() {
        return this.f36573a.f41450wa;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var != null) {
            sn snVar = this.f36573a;
            if (snVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(snVar.e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Q1(long j10) {
        sn snVar = this.f36573a;
        TLRPC.Chat chat = snVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return snVar.getMessagesController().isAdmin(snVar.e.f20279id, j10);
        }
        return false;
    }

    @Override
    public final boolean R() {
        sn snVar = this.f36573a;
        if (!UserObject.isReplyUser(snVar.f41229f) && !UserObject.isUserSelf(snVar.f41229f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.f36573a.X7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    @Override
    public final void R1(org.telegram.ui.Cells.u1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.en.R1(org.telegram.ui.Cells.u1, int, float, float, boolean):void");
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        sn snVar = this.f36573a;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        if (!kVar.s() && !snVar.F9()) {
            if (!z10 && chat.signature_profiles && (messageObject = u1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                snVar.sa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                o(u1Var, chat, i10, z10);
                return;
            }
        }
        sn.c2(snVar, u1Var, true, f7, f10);
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = u1Var.getMessageObject();
        }
        if (messageObject != null) {
            sn snVar = this.f36573a;
            if (!snVar.f41289jc && messageObject.getId() == snVar.f41276ic) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - snVar.f41302kc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.u1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.en.S1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, true, false);
    }

    @Override
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
        sn snVar = this.f36573a;
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(snVar.T5), u1Var);
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        sn snVar = this.f36573a;
        if (AndroidUtilities.isContextSafe(snVar.getParentActivity()) && (chat = snVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(u1Var, snVar.getMessagesController().getParticipant(snVar.e.f20279id, currentUser.f20426id));
        }
    }

    @Override
    public final int V() {
        return this.f36573a.R3;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.PsaMessageInfoDefault);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            MessageObject.addLinks(false, spannableStringBuilder);
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            sn snVar = this.f36573a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = snVar.f41454x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = snVar.f41454x0.getChildAt(i11);
                                if (childAt instanceof org.telegram.ui.Cells.u1) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                    if (messageObject2.equals(u1Var2.getMessageObject())) {
                                        u1Var = u1Var2;
                                    }
                                }
                            }
                            messageObject = messageObject2;
                        }
                    } else {
                        i10++;
                    }
                }
            }
            snVar.Nb(messageObject, spannableStringBuilder, 1);
            u1Var.g4(1, false, true);
        }
    }

    @Override
    public final ih.a W() {
        return this.f36573a.Qb;
    }

    @Override
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
        Bundle b10 = zf.d0.b(j10, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.f36573a;
        if (n2Var.getMessagesController().checkCanOpenChat(b10, n2Var, u1Var.getMessageObject())) {
            n2Var.presentFragment(new sn(b10));
        }
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null) {
            messageObject = null;
        } else {
            messageObject = u1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            sn snVar = this.f36573a;
            if (snVar.R3 != 1 && !snVar.D9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        sn snVar = this.f36573a;
        if (snVar.f41451wb != 0 && u1Var.getMessageObject() != null && snVar.f41451wb == u1Var.getMessageObject().getId() && snVar.f41465xb == i10) {
            return true;
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        sn snVar = this.f36573a;
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            CharSequence fieldText = hkVar.getFieldText();
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
                snVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new pm(this, 6), 200L);
            }
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        sn snVar = this.f36573a;
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            CharSequence fieldText = hkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(r4.c.u(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.m61("" + user.f20426id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            snVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new pm(this, 7), 200L);
        }
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var != null && pageBlock != null) {
            sn snVar = this.f36573a;
            if (snVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, snVar, null);
                    return t12.f2(null, null, null, null, null, null, null, indexOf, new om(snVar, arrayList), null, 0L, 0L, 0L, true, new nm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        sn snVar = this.f36573a;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
            if (!kVar2.s() && !snVar.F9()) {
                z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
                if (!z10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        c5 b10;
        int i11;
        lk lkVar;
        kk kkVar;
        if (!k()) {
            return false;
        }
        sn snVar = this.f36573a;
        if (snVar.e != null && (((lkVar = snVar.O0) == null || lkVar.getVisibility() != 0) && ((kkVar = snVar.R) == null || kkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat != null && ((snVar.f41209d4 == 0 || snVar.f41258h4) && (!ChatObject.isChannel(chat) || snVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        i5[] i5VarArr = new i5[r22 + 2 + r42];
        i5VarArr[0] = i5.d;
        i5VarArr[1] = i5.h;
        char c10 = 2;
        if (r22 != 0) {
            i5VarArr[2] = i5.f37756n;
            c10 = 3;
        }
        if (r42 != 0) {
            i5VarArr[c10] = i5.f37757r;
        }
        TLRPC.UserFull userFull = snVar.getMessagesController().getUserFull(user.f20426id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
            b10 = c5.b(user, i10, i5VarArr);
        } else {
            b10 = c5.c(user, userFull, i5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                b10 = c5.b(user, i11, i5VarArr);
            }
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) snVar.fragmentView, snVar.f41226ea, b10, new e7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(snVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final en f40794b;

            {
                this.f40794b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40794b.v(user, false);
                        return;
                    case 1:
                        this.f40794b.b(user);
                        return;
                    default:
                        this.f40794b.f36573a.ra(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new t1(this, u1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final en f40794b;

            {
                this.f40794b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40794b.v(user, false);
                        return;
                    case 1:
                        this.f40794b.b(user);
                        return;
                    default:
                        this.f40794b.f36573a.ra(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final en f40794b;

            {
                this.f40794b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40794b.v(user, false);
                        return;
                    case 1:
                        this.f40794b.b(user);
                        return;
                    default:
                        this.f40794b.f36573a.ra(user);
                        return;
                }
            }
        }, r42);
        H.f27142t = false;
        H.f27123i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void c2(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f36573a.vc(primaryMessageObject, false);
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        sn snVar = this.f36573a;
        snVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(snVar.getParentActivity()) && (chat = snVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == snVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == snVar.getUserConfig().getClientUserId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = snVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                org.telegram.ui.Components.v01.b(parentActivity, i10, -snVar.e.f20279id, currentUser, str2, z15, z16, z12, d6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == snVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(snVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                snVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(snVar.e);
                tL_channels_getParticipant.participant = snVar.getMessagesController().getInputPeer(currentUser.f20426id);
                snVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new ai.q5(11, this, u1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = snVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
            org.telegram.ui.Components.v01.b(parentActivity2, i10, -snVar.e.f20279id, currentUser, str2, z152, z162, z12, d6Var);
        }
    }

    @Override
    public final void d0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        sn snVar = this.f36573a;
        try {
            if (i10 == 0) {
                snVar.k7();
                dl dlVar = snVar.f41482z3;
                if (dlVar != null) {
                    dlVar.l(0L, 84, null, new pm(this, 1));
                    snVar.f41482z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(snVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (snVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.y31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.y31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.xc.a0(snVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                snVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(snVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", snVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new pm(this, 2));
                } else if (snVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new pm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), a02.f32369c);
                ybVar.c(i13, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i14 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i14 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i14++;
                    }
                }
                ybVar.f32606b.setText(append2);
                ybVar.f32606b.setSingleLine(false);
                ybVar.f32606b.setMaxLines(6);
                a02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        fm fmVar;
        int i10 = (messageObject.getDialogId() > 1271266957L ? 1 : (messageObject.getDialogId() == 1271266957L ? 0 : -1));
        sn snVar = this.f36573a;
        if ((i10 == 0 || ((fmVar = snVar.A0) != null && fmVar.N)) && snVar.R3 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean e0() {
        if (this.f36573a.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        sn snVar = this.f36573a;
        if (isHuaweiStoreApp) {
            pf.d.r(snVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(snVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.f36573a.L7(u1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final void f1() {
        sn snVar = this.f36573a;
        snVar.T7();
        UndoView undoView = snVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, snVar.T5, null);
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        sn snVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (snVar = this.f36573a).f41451wb) != 0 && i10 == u1Var.getMessageObject().getId() && snVar.f41465xb == 3) {
            return snVar.f41490zb;
        }
        return null;
    }

    @Override
    public final void g2() {
        this.f36573a.w9();
    }

    public final void h(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        sj sjVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        sn snVar = this.f36573a;
        pj pjVar = snVar.f41454x0;
        if (pjVar != null && (sjVar = snVar.f41479z0) != null && sjVar.f45955y < 0) {
            for (int childCount = pjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = snVar.f41454x0.getChildAt(childCount);
                snVar.f41454x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = snVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i11 = snVar.Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                sj sjVar2 = snVar.f41479z0;
                snVar.f41454x0.getClass();
                sjVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) snVar.f41398s9), false);
            } else {
                snVar.f41479z0.h1(i10, i11);
            }
        }
        snVar.N0 = z11;
        snVar.vc(primaryMessageObject, false);
        snVar.N0 = false;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar;
        sn snVar = this.f36573a;
        if (snVar.f41452wc.f17387f && (cVar = snVar.Cc) != null && cVar.f45784n == u1Var && cVar.f45780a.getWidth() > 0) {
            return snVar.Cc.f45780a.getHeight();
        }
        return 0;
    }

    @Override
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        sn snVar = this.f36573a;
        if (!snVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.d.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (snVar.getParentActivity() != null) {
                if (snVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ag.d.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    hk hkVar = snVar.Y;
                    MessageObject messageObject = u1Var.getMessageObject();
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    si siVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    pf.c cVar = snVar.Ab;
                    if (cVar != null) {
                        cVar.a(true);
                        snVar.Ab = null;
                    }
                    if (str != null && u1Var.getMessageObject() != null) {
                        si siVar2 = new si(snVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                        snVar.Ab = siVar2;
                        siVar = siVar2;
                    } else {
                        snVar.Ab = null;
                    }
                    hkVar.a0(keyboardButtonProto, messageObject, messageObject2, siVar);
                }
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = rh.i.a(messageObject);
            boolean a10 = w7.m6.a(a2, 7);
            sn snVar = this.f36573a;
            if (a10) {
                org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                snVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                u1Var.S0(true);
            } else if (snVar.getParentActivity() != null) {
                if (snVar.f41329n2 == null) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(5, snVar.getParentActivity(), snVar.f41226ea, false);
                    snVar.f41329n2 = r40Var;
                    r40Var.setAlpha(0.0f);
                    snVar.f41329n2.setVisibility(4);
                    int indexOfChild = snVar.X0.indexOfChild(snVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    snVar.X0.addView(snVar.f41329n2, indexOfChild + 1, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.s1> pollButtons = u1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.s1 s1Var = pollButtons.get(i16);
                            float y3 = ((u1Var.getY() + s1Var.f22972b) - AndroidUtilities.dp(4.0f)) - snVar.f41398s9;
                            snVar.f41364q2 = AndroidUtilities.dp(13.3f) + s1Var.f22971a;
                            int D = org.telegram.messenger.kk.D(6.0f, s1Var.f22972b, i12);
                            snVar.f41377r2 = D;
                            if (y3 > 0.0f) {
                                i15 = snVar.f41364q2;
                                i13 = D;
                                f7 = 0.0f;
                                break;
                            }
                            i16++;
                            f7 = y3;
                        } else {
                            i13 = i12;
                            i15 = i11;
                            break;
                        }
                    }
                    if (f7 != 0.0f) {
                        snVar.f41454x0.v0(0, (int) f7, null);
                        snVar.f41353p2 = u1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                snVar.f41329n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        sn snVar = this.f36573a;
        if (snVar.getParentActivity() != null) {
            if (snVar.X9 == null) {
                vh.i iVar = new vh.i(snVar.getParentActivity());
                snVar.X9 = iVar;
                snVar.X0.addView(iVar, w7.z5.e(-1, -1, 48));
            }
            vh.i iVar2 = snVar.X9;
            HashMap hashMap = iVar2.f48487a;
            ArrayList arrayList = iVar2.f48489c;
            arrayList.clear();
            int i10 = iVar2.d;
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
                    long j12 = dialog.f20283id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f20283id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f20283id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20426id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f20283id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f20283id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f20283id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f20283id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f20283id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = vh.i.b(u1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    Long l4 = (Long) obj;
                    if (hashSet.add(l4) && DialogObject.isUserDialog(l4.longValue())) {
                        arrayList4.add(l4);
                    }
                }
                vh.h hVar = new vh.h(iVar2, u1Var, arrayList4, new uf.c(8, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f36573a.Z7(u1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void j() {
        f();
    }

    public final boolean k() {
        sn snVar = this.f36573a;
        if (!UserObject.isUserSelf(snVar.f41229f)) {
            TLRPC.Chat chat = snVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !snVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var != null && document != null) {
            sn snVar = this.f36573a;
            if (snVar.getParentLayout() != null && Z(u1Var)) {
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(snVar, u1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new t1(this, u1Var, document, 24), false);
                H.f27142t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Document document;
        int i12;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i13;
        TLRPC.Document document3;
        int i14;
        int i15;
        int i16;
        long j10;
        long j11;
        int i17;
        boolean z10;
        boolean z11;
        int i18;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                G1(u1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            sn snVar = this.f36573a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(snVar)) {
                    pc0 pc0Var = new pc0(3);
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                    pc0Var.setResourceProvider(d6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = snVar.getMessagesController().getPeer(snVar.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    pc0Var.O0 = false;
                    pc0Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    snVar.presentFragment(pc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                gt.q().w(snVar.getParentActivity());
                gt.q().v(new cn(this, tL_messageMediaPoll, pollAnswer, u1Var));
                gt q6 = gt.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = u1Var.getMessageObject();
                d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                q6.t(document4, null, "", null, null, i18, false, messageObject2, d6Var, 200);
            } else {
                long j12 = 0;
                if (MessageObject.isMusicDocument(messageMedia.document)) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                        boolean z12 = playingMessageObject.isPlayingExplanationObject;
                        if (i10 == -3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 == z11) {
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
                    TLRPC.TL_message F7 = sn.F7(message);
                    F7.media = messageMedia;
                    F7.attachPath = rh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    MessageObject messageObject3 = new MessageObject(i17, F7, false, true);
                    if (i10 == -3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageObject3.isPlayingExplanationObject = z10;
                    arrayList.add(messageObject3);
                    if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                        MediaController.getInstance().cleanupPlayer(false, true);
                    }
                    MediaController.getInstance().setPlaylist(arrayList, messageObject3, 0L);
                    return;
                }
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !MessageObject.isVideoDocument(document5)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f45776g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = u1Var.f23571y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            rh.g gVar = u1Var.f23255c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            rh.g gVar2 = u1Var.f23240b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f45775f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = u1Var.f23571y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            rh.g gVar3 = u1Var.f23255c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            rh.g gVar4 = u1Var.f23240b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message F72 = sn.F7(message2);
                        F72.media = messageMedia;
                        F72.attachPath = rh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, F72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, snVar, snVar.f41226ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = snVar.T5;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = snVar.L6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = snVar.d();
                            }
                            t12.d2(messageObject6, snVar, j10, j11, j12, snVar.Ga);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, snVar.getParentActivity(), snVar.f41226ea, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            snVar.C6(messageObject6);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.messageOwner;
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i11 = arrayList3.size();
                    } else {
                        i11 = -1;
                    }
                    TLRPC.TL_message F73 = sn.F7(message3);
                    F73.media = messageMedia3;
                    F73.attachPath = rh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, F73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message F74 = sn.F7(message3);
                    F74.media = messageMedia2;
                    F74.attachPath = rh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    F74.message = pollResults2.solution;
                    F74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, F74, false, true));
                    arrayList2.add(-3);
                }
                ag.e.b(tL_messageMediaPoll.poll, snVar.getUserConfig().getClientUserId());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i20);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                        if (pollAnswer2.unshuffled_index == i10) {
                            i11 = arrayList3.size();
                        }
                        TLRPC.TL_message F75 = sn.F7(message3);
                        F75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        F75.message = tL_textWithEntities2.text;
                        F75.entities = tL_textWithEntities2.entities;
                        F75.attachPath = rh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, F75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, snVar, snVar.f41226ea);
                    PhotoViewer.t1().b2(arrayList3, i11, snVar.a(), 0L, 0L, snVar.Ha);
                }
            }
        }
    }

    @Override
    public final boolean l0() {
        boolean z10;
        sn snVar = this.f36573a;
        if (!snVar.F9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        sn snVar = this.f36573a;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
        if (z10 && snVar.J9) {
            d5Var = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                ((ActionBarLayout) d5Var2).r();
            }
            return true;
        }
        return !c();
    }

    @Override
    public final void m(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            f1();
            return;
        }
        sn snVar = this.f36573a;
        if (!snVar.f41305l3 && snVar.f41454x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
            if (snVar.f41417u2 == null) {
                lm lmVar = snVar.X0;
                int indexOfChild = lmVar.indexOfChild(snVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(1, snVar.getParentActivity(), snVar.f41226ea, false);
                    snVar.f41417u2 = r40Var;
                    lmVar.addView(r40Var, indexOfChild + 1, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                    snVar.f41417u2.setAlpha(0.0f);
                    snVar.f41417u2.setVisibility(4);
                } else {
                    return;
                }
            }
            snVar.f41417u2.e(u1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void n() {
        this.f36573a.X0.getClass();
    }

    @Override
    public final void n0(String str) {
        sn snVar = this.f36573a;
        lk lkVar = snVar.O0;
        if (lkVar == null || lkVar.getVisibility() != 0) {
            kk kkVar = snVar.R;
            if ((kkVar == null || kkVar.getVisibility() != 0) && snVar.Y != null && str != null && str.length() > 0) {
                hk hkVar = snVar.Y;
                hkVar.setFieldText("@" + str + " ");
                snVar.Y.F0();
            }
        }
    }

    @Override
    public final void n2() {
        sn snVar = this.f36573a;
        if (snVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", snVar.T5);
            bundle.putInt("start_from", 10);
            snVar.presentFragment(new org.telegram.ui.Components.wa0(bundle, snVar.f41166a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", snVar.getMessagesController().recommendedChannelsLimitPremium), new pm(this, 4))).j();
    }

    public final void o(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        sn snVar = this.f36573a;
        TLRPC.Chat chat2 = snVar.e;
        if (chat2 != null && chat.f20279id == chat2.f20279id) {
            jj jjVar = snVar.f41166a1;
            if (jjVar != null && i10 == 0) {
                jjVar.e(false, false);
            } else if (u1Var.getMessageObject() != null) {
                snVar.j(i10, u1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f20279id != chat2.f20279id || snVar.K9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20279id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ti tiVar = null;
            if (z10) {
                pf.c cVar = snVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    snVar.Ab = null;
                }
                if (u1Var.getMessageObject() == null) {
                    snVar.Ab = null;
                } else {
                    ti tiVar2 = new ti(snVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    snVar.Ab = tiVar2;
                    tiVar = tiVar2;
                }
            }
            if (snVar.getMessagesController().checkCanOpenChat(bundle, snVar, u1Var.getMessageObject(), tiVar)) {
                sn snVar2 = new sn(bundle);
                if (tiVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new ai.ub(this, tiVar, chat, i10, snVar2, 18), 5000L);
                    tiVar.d();
                    return;
                }
                snVar.presentFragment(snVar2);
            }
        }
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.a6 a6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        sn snVar = this.f36573a;
        if (!snVar.getMessagesController().premiumFeaturesBlocked() && a6Var != null && !a6Var.standard) {
            long documentId = a6Var.getDocumentId();
            TLRPC.Document document = a6Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                document = org.telegram.ui.Components.r5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(snVar, snVar.getParentActivity(), snVar.f41226ea, arrayList);
                org.telegram.ui.Components.qv qvVar = awVar.f24728f;
                qvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(qvVar);
                qvVar.v = imageReceiver;
                if (qvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                qvVar.f29769w = true;
                qvVar.f29770x.d(1.0f, true);
                qvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f21156m6, 0.2f, true), 0L, null, null, 0);
                qvVar.v.setLayerNum(7);
                qvVar.v.setAllowStartLottieAnimation(true);
                qvVar.v.setAllowStartAnimation(true);
                qvVar.v.setAutoRepeat(1);
                qvVar.v.setAllowDecodeSingleFrame(true);
                qvVar.v.setParentView(qvVar);
                awVar.setCalcMandatoryInsets(snVar.C9());
                snVar.showDialog(awVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        sn snVar = this.f36573a;
        ei.x3 x3Var = snVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (snVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            ei.x3 x3Var2 = new ei.x3(snVar.getParentActivity(), 3);
            x3Var2.p(true);
            x3Var2.K = Layout.Alignment.ALIGN_NORMAL;
            x3Var2.d = -1L;
            x3Var2.T = true;
            x3Var2.e = true;
            x3Var2.q(12.0f);
            snVar.A1 = x3Var2;
            x3Var2.f10083l0 = new gh(9, this, x3Var2);
            x3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            snVar.X0.addView(snVar.A1, w7.z5.a(520.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
            snVar.X0.post(new i2.z(this, u1Var, i11, i10, 4));
        }
    }

    @Override
    public final void p(org.telegram.ui.Cells.u1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.en.p(org.telegram.ui.Cells.u1):void");
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        vh.i iVar = this.f36573a.X9;
        if (iVar != null && (hVar = (vh.h) iVar.f48487a.get(vh.i.b(u1Var))) != null) {
            vh.d[] dVarArr = hVar.f48484w;
            RectF rectF = hVar.f48482r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = vh.g.f48469a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.f48469a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.r.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f48476a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        vh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f48448p != z10) {
                            ValueAnimator valueAnimator = dVar.f48446n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f48448p = z10;
                            float f15 = dVar.f48447o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f48446n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f48446n.addUpdateListener(dVar);
                            dVar.f48446n.setInterpolator(vh.f.f48452a);
                            dVar.f48446n.start();
                        }
                        vh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f48445m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f48443k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f48445m = z11;
                            float f16 = dVar2.f48444l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f48443k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f48443k.addUpdateListener(dVar2);
                            dVar2.f48443k.setInterpolator(vh.f.f48452a);
                            dVar2.f48443k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.o9 p2() {
        return this.f36573a.f41201c9;
    }

    @Override
    public final void q() {
        this.f36573a.cc();
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        sn snVar = this.f36573a;
        snVar.L7(u1Var, false, false, f7, f10, true, false, false);
        snVar.f41454x0.getClass();
        sn.d2(snVar, RecyclerView.R(u1Var));
    }

    public final void r(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20426id);
            org.telegram.ui.ActionBar.n2 n2Var = this.f36573a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, u1Var.getMessageObject())) {
                n2Var.presentFragment(new sn(bundle));
            }
        }
    }

    @Override
    public final void s(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        sj sjVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            sn snVar = this.f36573a;
            pj pjVar = snVar.f41454x0;
            if (pjVar != null && (sjVar = snVar.f41479z0) != null && sjVar.f45955y < 0) {
                for (int childCount = pjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = snVar.f41454x0.getChildAt(childCount);
                    snVar.f41454x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = snVar.Q8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = snVar.Q8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            snVar.vc(primaryMessageObject, false);
            ei.x3 x3Var = snVar.A1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            if (i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
                snVar.f41479z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        int i10;
        long j10;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = u1Var.getMessageObject();
        }
        MessageObject messageObject2 = messageObject;
        TLRPC.MessageReplies messageReplies = messageObject2.messageOwner.replies;
        if (messageReplies != null) {
            i10 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
        } else {
            i10 = -1;
            j10 = 0;
        }
        int i11 = i10;
        long j11 = j10;
        sn snVar = this.f36573a;
        snVar.fa(snVar.e.f20279id, messageObject2, messageObject2.getId(), j11, i11, 0, null);
    }

    public final void u(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20279id);
            bundle.putBoolean("expandPhoto", false);
            this.f36573a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.f36573a;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        boolean z10 = true;
        if (!kVar.s() && !snVar.F9()) {
            if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
                M0(10, u1Var);
                return;
            }
            if (!ChatObject.isForum(snVar.e) && !snVar.K9()) {
                z10 = false;
            }
            v(user, z10);
            return;
        }
        sn.c2(snVar, u1Var, true, f7, f10);
    }

    public final void v(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f20426id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20426id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            sn snVar = this.f36573a;
            TLRPC.User user2 = snVar.f41229f;
            if (user2 != null && user2.f20426id == user.f20426id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = snVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            snVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r44, float r45, float r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.en.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v1() {
        sn snVar = this.f36573a;
        if (snVar.X0.getMeasuredWidth() > snVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        sn snVar = this.f36573a;
        if (UserObject.isBotForum(snVar.f41229f)) {
            return null;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = snVar.getMessagesController().getAdminRank(snVar.e.f20279id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = snVar.f41196c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f36573a.f41388s.containsKey(messageObject);
    }

    @Override
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
        sn.U4(this.f36573a, u1Var);
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar = this.f36573a.Cc;
        if (cVar != null && cVar.f45784n == u1Var) {
            cVar.f45787w.getClass();
        }
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        h(u1Var, z10, false, false);
    }

    @Override
    public final void y0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.e6 animation;
        sn snVar = this.f36573a;
        if (!snVar.f41305l3 && !SharedConfig.noSoundHintShowed && snVar.f41454x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
            org.telegram.ui.Components.r40 r40Var = snVar.f41404t2;
            if (r40Var == null || r40Var.getTag() == null) {
                if (snVar.f41404t2 == null) {
                    lm lmVar = snVar.X0;
                    int indexOfChild = lmVar.indexOfChild(snVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(0, snVar.getParentActivity(), snVar.f41226ea, false);
                        snVar.f41404t2 = r40Var2;
                        r40Var2.setShowingDuration(10000L);
                        lmVar.addView(snVar.f41404t2, indexOfChild + 1, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                        snVar.f41404t2.setAlpha(0.0f);
                        snVar.f41404t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = snVar.f41454x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = snVar.f41454x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && snVar.f41404t2.e(u1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        sn snVar = this.f36573a;
        if (snVar.getParentActivity() != null && tLObject != null) {
            d5Var = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                if (((ActionBarLayout) d5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20279id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f20426id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, snVar.getParentActivity(), snVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(snVar.getParentActivity(), false, false);
                e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                e1Var.setMinimumWidth(160);
                e1Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(snVar.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                sn snVar2 = new sn(bundle);
                snVar2.J9 = true;
                snVar.presentFragmentAsPreviewWithMenu(snVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                snVar.g7();
                return;
            }
            snVar.presentFragment(new sn(bundle));
        }
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        c5 c5Var;
        int i17;
        int i18;
        i5 i5Var;
        lk lkVar;
        kk kkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        sn snVar = this.f36573a;
        if (!isEmpty && snVar.e != null && (((lkVar = snVar.O0) == null || lkVar.getVisibility() != 0) && ((kkVar = snVar.R) == null || kkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = snVar.e;
        if (chat2 != null && ((snVar.f41209d4 == 0 || snVar.f41258h4) && (!ChatObject.isChannel(chat2) || snVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = snVar.e;
        if (chat3 != null && chat3.f20279id == chat.f20279id && !snVar.K9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        i5[] i5VarArr = new i5[i12 + 1 + i10 + i11];
        i5VarArr[0] = i5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                i5Var = i5.e;
            } else {
                i5Var = i5.f37755f;
            }
            i5VarArr[1] = i5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            i5VarArr[i13] = i5.f37756n;
            i13++;
        }
        if (i11 != 0) {
            i5VarArr[i13] = i5.f37757r;
        }
        TLRPC.ChatFull chatFull = snVar.getMessagesController().getChatFull(chat.f20279id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
            int i19 = i11;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i20 = i12;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            BitmapDrawable bitmapDrawable = null;
            if (forUserOrChat2 != null && (forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            }
            z10 = true;
            i15 = i20;
            z11 = i10;
            i16 = i19;
            c5Var = new c5(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, i5VarArr, new e5(i14, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            c5Var = c5.a(chat, chatFull, i5VarArr);
            i16 = i11;
            i15 = i12;
            z10 = true;
            z11 = i10;
        }
        if (c2.b.g(c5Var)) {
            c2.b.m().y((ViewGroup) snVar.fragmentView, snVar.f41226ea, c5Var, new e7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(snVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new sm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i17 = R.drawable.msg_channel;
        } else {
            i17 = R.drawable.msg_discussion;
        }
        if (z12) {
            i18 = R.string.OpenChannel2;
        } else {
            i18 = R.string.OpenGroup2;
        }
        H.l(i17, LocaleController.getString(i18), new t1(this, u1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new sm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new sm(this, chat, 2), i16);
        H.f27142t = false;
        H.f27123i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }
}
