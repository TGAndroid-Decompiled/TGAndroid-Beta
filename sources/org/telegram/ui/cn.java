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
public final class cn implements org.telegram.ui.Cells.l1 {
    public final qn f36004a;

    public cn(qn qnVar) {
        this.f36004a = qnVar;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            u1Var.t2();
            u1Var.requestLayout();
            this.f36004a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        qn qnVar = this.f36004a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(qnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qnVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = qnVar.getMessagesController().conferenceCallSizeLimit;
                b2Var.setOnCancelListener(new ai.e0(this, qnVar.getConnectionsManager().sendRequest(getgroupcall, new ai.s9(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                b2Var.r(600L);
                return;
            }
            TLRPC.User user = qnVar.f40670f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = qnVar.f40613a8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, i11, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f40670f.f20420id), qnVar.getAccountInstance());
                return;
            }
            return;
        }
        qnVar.L7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        qn qnVar = this.f36004a;
        if (!qnVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (qnVar.getParentActivity() != null) {
                if (qnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) qnVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) qnVar.f40667ea, false);
                        f3Var.fixNavigationBar();
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        f3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        mg.j jVar = new mg.j(3, qnVar, str);
                        f3Var.items = charSequenceArr;
                        f3Var.onClickListener = jVar;
                        qnVar.showDialog(f3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        qnVar.ea(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
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
        qn qnVar = this.f36004a;
        if (!qnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qnVar.getParentActivity(), 3, null);
            b2Var.r(200L);
            qnVar.getMessagesController().getContentSettings(new z(this, b2Var, u1Var, 6));
            return;
        }
        if (u1Var.getMessageObject() != null) {
            u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        u1Var.h4();
    }

    @Override
    public final boolean B1() {
        qn qnVar = this.f36004a;
        if (qnVar.X0.getKeyboardHeight() + qnVar.f40791oa >= AndroidUtilities.dp(20.0f)) {
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
            int i13 = buttonCustom.f17786id;
            TL_stars.StarsAmount starsAmount = null;
            qn qnVar = this.f36004a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(19, this, message);
                Pattern pattern = org.telegram.ui.Components.f5.f26099a;
                Activity parentActivity = qnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
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
                frameLayout.addView(editText, w7.z5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
                qnVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21225q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, qnVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, qnVar.e, 5);
                    }
                    ai.x9 x9Var = new ai.x9(this, message, canManageMonoForum, messageObject, 11);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    qnVar.j7(x9Var, ag.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                qnVar.L7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                qnVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        qn qnVar = this.f36004a;
        qnVar.f40651d5 = messageObject;
        qnVar.i9();
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            qn qnVar = this.f36004a;
            if ((qnVar.f40892wb != id2 || qnVar.f40906xb != 7) && (inputPeer = qnVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f20490id = id2;
                pf.c cVar = qnVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    qnVar.Ab = null;
                }
                ri riVar = new ri(qnVar, id2, u1Var, 2);
                riVar.f44282b = new i0(27, qnVar, r3);
                qnVar.Ab = riVar;
                riVar.d();
                int[] iArr = {qnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new ai.x3(qnVar, riVar, iArr, u1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar = this.f36004a;
        qnVar.f40905xa.k(u1Var, qnVar, true);
        qnVar.f40895x0.I0(false);
    }

    @Override
    public final void F1(MessageObject messageObject) {
        this.f36004a.f40829s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new mi.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.kk.p(R.string.CodeCopied, org.telegram.ui.Components.xc.a0(this.f36004a));
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        qn qnVar = this.f36004a;
        qnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        h(u1Var, true, false, true);
    }

    @Override
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        ym ymVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && pf.d.g(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        qn qnVar = this.f36004a;
        pf.c cVar = qnVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        if (u1Var.getMessageObject() == null) {
            ymVar = null;
        } else {
            ymVar = new ym(this, u1Var);
        }
        qnVar.Ab = ymVar;
        if (!z11 && !pf.d.e(parse, false, null)) {
            org.telegram.ui.Components.f5.q0(qnVar, str, true, true, true, !z11, qnVar.Ab, webPage, qnVar.f40667ea);
        } else {
            pf.d.q(qnVar.getParentActivity(), parse, true, true, false, qnVar.Ab, null, false, true, false);
        }
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (qnVar = this.f36004a).f40892wb) != 0 && i10 == u1Var.getMessageObject().getId() && qnVar.f40906xb == 1) {
            return qnVar.f40919yb;
        }
        return null;
    }

    @Override
    public final void I(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f36004a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            qn qnVar = this.f36004a;
            org.telegram.ui.Components.cv.J(qnVar, messageObject, qnVar.Ga, str2, str3, str4, str, i10, i11, -1, qnVar.C9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean J0(long j10) {
        qn qnVar = this.f36004a;
        TLRPC.Chat chat = qnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return qnVar.getMessagesController().isOwner(qnVar.e.f20273id, j10);
        }
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        se seVar;
        a3.i0 i0Var;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        ah.v vVar;
        int i10;
        boolean z11;
        int i11;
        v31 v31Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f36004a.A0.L();
                    qn qnVar = this.f36004a;
                    return mediaController.setPlaylist(L, messageObject, qnVar.L6, true ^ qnVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f36004a.U7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            x31 x31Var = this.f36004a.Z9;
            if (x31Var == null || x31Var.f43017b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.xc.a0(this.f36004a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f36004a.Z9 = new x31(this.f36004a.getParentActivity());
                x31 x31Var2 = this.f36004a.Z9;
                if (!messageObject.isOutOwner()) {
                    seVar = this.f36004a.jb(messageObject, true);
                } else {
                    seVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    i0Var = qn.P4(this.f36004a, messageObject);
                } else {
                    i0Var = null;
                }
                Context context = x31Var2.f43014a;
                ah.v vVar2 = x31Var2.f43018c;
                x31Var2.X = seVar;
                x31Var2.Y = i0Var;
                v31 v31Var2 = x31Var2.N;
                if (v31Var2 != null) {
                    vVar2.removeView(v31Var2);
                    x31Var2.N = null;
                }
                x31Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                x31Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x31Var2.S = z10;
                org.telegram.ui.Cells.u1 u1Var2 = x31Var2.O;
                if (u1Var2 != null) {
                    d6Var = u1Var2.getResourcesProvider();
                } else {
                    d6Var = null;
                }
                x31Var2.L = d6Var;
                if (x31Var2.O != null) {
                    x31Var2.T = 0.0f;
                    x31Var2.U = u1Var.f23397n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        x31Var2.T = view.getY() + x31Var2.T;
                        x31Var2.U = view.getY() + x31Var2.U;
                    }
                    int width = x31Var2.O.getWidth();
                    int height = x31Var2.O.getHeight();
                    if (x31Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    x31Var2.K = i14 - x31Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    vVar = vVar2;
                    v31 v31Var3 = new v31(x31Var2, x31Var2.getContext(), UserConfig.selectedAccount, x31Var2.O.getResourcesProvider(), width, i14);
                    x31Var2.N = v31Var3;
                    x31Var2.O.j1(v31Var3);
                    x31Var2.N.i1(x31Var2.O);
                    x31Var2.N.setDelegate(new pb.a(18));
                    v31 v31Var4 = x31Var2.N;
                    MessageObject messageObject3 = x31Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = x31Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = x31Var2.O;
                    v31Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!x31Var2.S) {
                        org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8();
                        x31Var2.V = l8Var;
                        v31 v31Var5 = x31Var2.N;
                        l8Var.f28149i = v31Var5;
                        v31Var5.f23284ee = l8Var;
                        if (v31Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.fp0 seekBarWaveform = x31Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = x31Var2.f43025s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.f26327n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    x31Var2.H = false;
                    vVar.addView(x31Var2.N, new FrameLayout.LayoutParams(x31Var2.O.getWidth(), i14, 17));
                } else {
                    vVar = vVar2;
                    i10 = 360;
                }
                TextureView textureView = x31Var2.P;
                if (textureView != null) {
                    vVar.removeView(textureView);
                    x31Var2.P = null;
                }
                if (x31Var2.S) {
                    x31Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    x31Var2.P = textureView2;
                    vVar.addView(textureView2, 0, w7.z5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.b81 b81Var = x31Var2.f43026w;
                if (b81Var != null) {
                    b81Var.B();
                    x31Var2.f43026w.H();
                    x31Var2.f43026w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = x31Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(x31Var2.O.getMessageObject().currentAccount).getPathToAttach(x31Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(x31Var2.O.getMessageObject().currentAccount).getPathToMessage(x31Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && x31Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(x31Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.b81 b81Var2 = new org.telegram.ui.Components.b81();
                        x31Var2.f43026w = b81Var2;
                        b81Var2.J = new w31(x31Var2);
                        if (x31Var2.V != null) {
                            b81Var2.K = new w31(x31Var2);
                        }
                        if (x31Var2.S) {
                            b81Var2.V(x31Var2.P);
                        }
                        x31Var2.f43026w.D(Uri.fromFile(pathToAttach), "other");
                        x31Var2.f43026w.C();
                        org.telegram.ui.Components.rt rtVar = x31Var2.E;
                        if (rtVar != null) {
                            rtVar.f30043s = x31Var2.f43026w;
                            rtVar.a();
                        }
                    }
                    qn qnVar2 = this.f36004a;
                    qnVar2.showDialog(qnVar2.Z9);
                    return false;
                }
                ei.x3 x3Var = x31Var2.f43027x;
                if (x3Var != null) {
                    vVar.removeView(x3Var);
                    x31Var2.f43027x = null;
                }
                MessageObject messageObject4 = x31Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = x31Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(x31Var2.M.currentAccount).getClientUserId()) {
                    ei.x3 x3Var2 = new ei.x3(context, 3);
                    x31Var2.f43027x = x3Var2;
                    x3Var2.p(true);
                    if (z11) {
                        long dialogId = x31Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(x31Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(x31Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        ei.x3 x3Var3 = x31Var2.f43027x;
                        if (x31Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        x3Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ei.x3 x3Var4 = x31Var2.f43027x;
                        if (x31Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        x3Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    x31Var2.f43027x.q(12.0f);
                    ei.x3 x3Var5 = x31Var2.f43027x;
                    if (!z11 && !x31Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    x3Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (x31Var2.S) {
                        x31Var2.f43027x.m(0.5f, 0.0f);
                        x31Var2.f43027x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        x31Var2.f43027x.m(0.0f, AndroidUtilities.dp(34.0f));
                        x31Var2.f43027x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    x31Var2.f43027x.t(14.0f);
                    ei.x3 x3Var6 = x31Var2.f43027x;
                    x3Var6.h = ei.x3.a(x3Var6.getText(), x31Var2.f43027x.getTextPaint());
                    if (x31Var2.S) {
                        vVar.addView(x31Var2.f43027x, w7.z5.d((int) ((x31Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((x31Var2.O.getHeight() + x31Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        vVar.addView(x31Var2.f43027x, w7.z5.d((int) ((x31Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((x31Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + x31Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((x31Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    x31Var2.f43027x.u();
                }
                TextView textView = x31Var2.f43028y;
                if (textView != null) {
                    vVar.removeView(textView);
                    x31Var2.f43028y = null;
                }
                TextView textView2 = new TextView(context);
                x31Var2.f43028y = textView2;
                textView2.setTextColor(-1);
                x31Var2.f43028y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    x31Var2.f43028y.setBackground(org.telegram.ui.ActionBar.h6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    x31Var2.f43028y.setBackground(org.telegram.ui.ActionBar.h6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                x31Var2.f43028y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.b6.a(x31Var2.f43028y);
                TextView textView3 = x31Var2.f43028y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                x31Var2.f43028y.setOnClickListener(new t31(x31Var2, 1));
                vVar.addView(x31Var2.f43028y, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (v31Var = x31Var2.N) != null && v31Var.getMessageObject() != null && x31Var2.N.getMessageObject().messageOwner != null) {
                    x31Var2.N.getMessageObject().messageOwner.media_unread = false;
                    x31Var2.N.invalidate();
                }
                qn qnVar22 = this.f36004a;
                qnVar22.showDialog(qnVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        qn qnVar = this.f36004a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (qnVar.T5 != j10) {
                qnVar.presentFragment(qn.W9(j10));
            } else {
                qnVar.f40607a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            qnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
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
        qn qnVar = this.f36004a;
        vh.i iVar = qnVar.X9;
        if (iVar != null) {
            HashMap hashMap = iVar.f48442a;
            vh.h hVar = (vh.h) hashMap.get(vh.i.b(u1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            vh.h hVar2 = (vh.h) qnVar.X9.f48442a.get(vh.i.b(u1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j10 = hVar2.f48439w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = qnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.f5.g(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) qnVar.f40901x6.f(messageObject.getGroupId())) != null) {
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
                    qcVar = org.telegram.ui.Components.xc.v(qnVar.getParentActivity(), qnVar, null, 1, j11, 1, qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, false, i0Var);
                    qcVar.f29595k = true;
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
                ybVar.f32590a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new xl(2, hVar3, viewTreeObserver));
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
            org.telegram.ui.ActionBar.n2 n2Var = this.f36004a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
            return;
        }
        tVar.run();
    }

    @Override
    public final void L1() {
        org.telegram.ui.ActionBar.d6 d6Var;
        qn qnVar = this.f36004a;
        if (qnVar.X0 != null && qnVar.getParentActivity() != null) {
            Context context = qnVar.X0.getContext();
            d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
            t21.U(context, qnVar, false, d6Var, null);
        }
    }

    @Override
    public final void M(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f36004a.jb(messageObject, true);
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
        vm vmVar = null;
        vm vmVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        vm vmVar3 = null;
        vm vmVar4 = null;
        qn qnVar = this.f36004a;
        if (i10 == 19) {
            pf.c cVar = qnVar.Ab;
            if (cVar != null) {
                cVar.a(true);
            }
            if (u1Var.getMessageObject() != null) {
                vmVar2 = new vm(this, u1Var, 2);
            }
            final vm vmVar5 = vmVar2;
            qnVar.Ab = vmVar5;
            final Activity parentActivity = qnVar.getParentActivity();
            final org.telegram.ui.ActionBar.d6 resourceProvider = qnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vmVar5.d();
            vmVar5.f44282b = new ug.d(atomicBoolean, 0);
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
            ug.r.d(messageObject, new Utilities.Callback(atomicBoolean, vmVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f47668a;
                public final pf.c f47669b;
                public final boolean f47670c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f47671f;
                public final d6 f47672g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f47671f = parentActivity;
                    this.f47672g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f47668a.get()) {
                        this.f47669b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f47670c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f47671f;
                        d6 d6Var = this.f47672g;
                        if (z12) {
                            i.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            i.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                        }
                    }
                }
            }, new ug.f(atomicBoolean, vmVar5, 0));
        } else if (i10 == 21) {
            f();
        } else if (i10 == 84) {
            qnVar.ya(u1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.s8 s8Var = org.telegram.ui.Components.kh0.O;
            if (qnVar.getParentActivity() != null) {
                qnVar.showDialog(new org.telegram.ui.Components.kh0(qnVar.getContext(), qnVar.getCurrentAccount(), messageObject, qnVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                    qnVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
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
                bundle.putLong("user_id", user.f20420id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                qnVar.presentFragment(new ProfileActivity(bundle, null));
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
                qnVar.showDialog(new org.telegram.ui.Components.if0(qnVar, null, user, null, file, jf.b.d(str, false), str3, str4, qnVar.f40667ea));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            qnVar.presentFragment(new qn(zf.d0.b(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
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
                bundle2.putLong("user_id", user2.f20420id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                qnVar.presentFragment(new fs(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                qnVar.O9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    pf.c cVar2 = qnVar.Ab;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        vmVar3 = new vm(this, u1Var, 4);
                    }
                    qnVar.Ab = vmVar3;
                    pf.d.q(qnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, qnVar.Ab, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            qnVar.getOrCreateStoryViewer().F(qnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ci.r7.a(qnVar.f40895x0));
                            return;
                        }
                    }
                }
                if (!qnVar.ja(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
                    pf.c cVar3 = qnVar.Ab;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        vmVar4 = new vm(this, u1Var, 5);
                    }
                    qnVar.Ab = vmVar4;
                    pf.d.q(qnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, qnVar.Ab, null, false, true, false);
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
                pf.c cVar4 = qnVar.Ab;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (u1Var.getMessageObject() != null) {
                    vmVar = new vm(this, u1Var, 3);
                }
                qnVar.Ab = vmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        qnVar.Ab.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        qnVar.Ab.f44282b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ei.o3(4, this, z11)), 29);
                        return;
                    }
                }
                pf.d.q(qnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, qnVar.Ab, null, false, true, false);
            }
        }
    }

    @Override
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ri riVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        ah.g gVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            qn qnVar = this.f36004a;
            pf.c cVar = qnVar.Ab;
            if (cVar != null) {
                cVar.a(true);
                qnVar.Ab = null;
            }
            if (u1Var.getMessageObject() == null) {
                qnVar.Ab = null;
                riVar = null;
            } else {
                riVar = new ri(qnVar, u1Var.getMessageObject().getId(), u1Var, 1);
                qnVar.Ab = riVar;
            }
            i10 = ((org.telegram.ui.ActionBar.n2) this.f36004a).currentAccount;
            ai.ga y3 = ai.ga.y(i10, false);
            Objects.requireNonNull(riVar);
            ti tiVar = new ti(riVar, 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.d6 I = ai.ga.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f1363a).getInputPeer(dialogId);
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
                gVar = new ah.g(y3, ConnectionsManager.getInstance(y3.f1363a).sendRequest(tL_payments_getPaymentForm, new ai.k2(y3, messageObject, tL_inputInvoiceMessage, tiVar, 3)), 2);
            }
            if (gVar != null) {
                riVar.f44282b = gVar;
                riVar.d();
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
                    TLRPC.TL_message F7 = qn.F7(message);
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
                qn qnVar2 = this.f36004a;
                t12.K2(null, qnVar2, qnVar2.f40667ea);
                PhotoViewer.t1().b2(arrayList, i11, this.f36004a.a(), 0L, 0L, this.f36004a.Ha);
            }
        }
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        qn qnVar = this.f36004a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!u1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(qnVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!qnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new nm(this, 9))).k(true);
            return false;
        } else {
            qnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(qnVar.e, qnVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
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
        qn qnVar = this.f36004a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            sg.m1 m1Var = new sg.m1(qnVar, i10, user, null, null, qnVar.f40667ea);
            u1Var.getLocationOnScreen(new int[2]);
            m1Var.f46342v0 = u1Var.getNameStatusX();
            m1Var.f46343w0 = u1Var.getNameStatusY();
            m1Var.f46346z0 = u1Var.getScaleX();
            m1Var.f46344x0 = u1Var.getLeft();
            m1Var.f46345y0 = u1Var.getTop();
            m1Var.A0 = u1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
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
                m1Var.f46341u0 = num;
            } else {
                m1Var.f46341u0 = Integer.valueOf(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21246r8[colorId]));
            }
            org.telegram.ui.Components.p5 p5Var = u1Var.fc;
            if (p5Var != null && (p5Var.f29165f[0] instanceof org.telegram.ui.Components.r5)) {
                m1Var.f46346z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(qnVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f21150m6, 0.2f);
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
                        Integer num2 = m1Var.f46341u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21320v6);
                        }
                        w9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = w9Var;
                    m1Var.E0 = true;
                }
            }
            qnVar.showDialog(m1Var);
            return;
        }
        pf.d.r(qnVar.getParentActivity(), "https://" + qnVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        qn qnVar = this.f36004a;
        qnVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, qnVar);
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.u1 r44, org.telegram.tgnet.TLRPC.PollAnswer r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.O1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean P() {
        qn qnVar = this.f36004a;
        if (qnVar.W5[1].size() + qnVar.W5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final vu0 P1() {
        return this.f36004a.f40891wa;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var != null) {
            qn qnVar = this.f36004a;
            if (qnVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(qnVar.e);
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
        qn qnVar = this.f36004a;
        TLRPC.Chat chat = qnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return qnVar.getMessagesController().isAdmin(qnVar.e.f20273id, j10);
        }
        return false;
    }

    @Override
    public final boolean R() {
        qn qnVar = this.f36004a;
        if (!UserObject.isReplyUser(qnVar.f40670f) && !UserObject.isUserSelf(qnVar.f40670f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.f36004a.X7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    @Override
    public final void R1(org.telegram.ui.Cells.u1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.R1(org.telegram.ui.Cells.u1, int, float, float, boolean):void");
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        qn qnVar = this.f36004a;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (!kVar.t() && !qnVar.F9()) {
            if (!z10 && chat.signature_profiles && (messageObject = u1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                qnVar.sa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                o(u1Var, chat, i10, z10);
                return;
            }
        }
        qn.c2(qnVar, u1Var, true, f7, f10);
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
            qn qnVar = this.f36004a;
            if (!qnVar.f40730jc && messageObject.getId() == qnVar.f40717ic) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - qnVar.f40743kc > 1000) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.S1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, true, false);
    }

    @Override
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar = this.f36004a;
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.T5), u1Var);
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        qn qnVar = this.f36004a;
        if (AndroidUtilities.isContextSafe(qnVar.getParentActivity()) && (chat = qnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(u1Var, qnVar.getMessagesController().getParticipant(qnVar.e.f20273id, currentUser.f20420id));
        }
    }

    @Override
    public final int V() {
        return this.f36004a.R3;
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
            qn qnVar = this.f36004a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = qnVar.f40895x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = qnVar.f40895x0.getChildAt(i11);
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
            qnVar.Nb(messageObject, spannableStringBuilder, 1);
            u1Var.g4(1, false, true);
        }
    }

    @Override
    public final ih.a W() {
        return this.f36004a.Qb;
    }

    @Override
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
        Bundle b10 = zf.d0.b(j10, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.f36004a;
        if (n2Var.getMessagesController().checkCanOpenChat(b10, n2Var, u1Var.getMessageObject())) {
            n2Var.presentFragment(new qn(b10));
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
            qn qnVar = this.f36004a;
            if (qnVar.R3 != 1 && !qnVar.D9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar = this.f36004a;
        if (qnVar.f40892wb != 0 && u1Var.getMessageObject() != null && qnVar.f40892wb == u1Var.getMessageObject().getId() && qnVar.f40906xb == i10) {
            return true;
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.f36004a;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            CharSequence fieldText = fkVar.getFieldText();
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
                qnVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new nm(this, 6), 200L);
            }
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.f36004a;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            CharSequence fieldText = fkVar.getFieldText();
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
                spannableString.setSpan(new org.telegram.ui.Components.n61("" + user.f20420id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            qnVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new nm(this, 7), 200L);
        }
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var != null && pageBlock != null) {
            qn qnVar = this.f36004a;
            if (qnVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, qnVar, null);
                    return t12.f2(null, null, null, null, null, null, null, indexOf, new mm(qnVar, arrayList), null, 0L, 0L, 0L, true, new lm(richMessage, arrayList, messageObject), null);
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
        qn qnVar = this.f36004a;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            if (!kVar2.t() && !qnVar.F9()) {
                z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
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
        jk jkVar;
        ik ikVar;
        if (!k()) {
            return false;
        }
        qn qnVar = this.f36004a;
        if (qnVar.e != null && (((jkVar = qnVar.O0) == null || jkVar.getVisibility() != 0) && ((ikVar = qnVar.R) == null || ikVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat != null && ((qnVar.f40650d4 == 0 || qnVar.f40699h4) && (!ChatObject.isChannel(chat) || qnVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        i5[] i5VarArr = new i5[r22 + 2 + r42];
        i5VarArr[0] = i5.d;
        i5VarArr[1] = i5.h;
        char c10 = 2;
        if (r22 != 0) {
            i5VarArr[2] = i5.f37848n;
            c10 = 3;
        }
        if (r42 != 0) {
            i5VarArr[c10] = i5.f37849r;
        }
        TLRPC.UserFull userFull = qnVar.getMessagesController().getUserFull(user.f20420id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            b10 = c5.b(user, i10, i5VarArr);
        } else {
            b10 = c5.c(user, userFull, i5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                b10 = c5.b(user, i11, i5VarArr);
            }
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) qnVar.fragmentView, qnVar.f40667ea, b10, new e7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(qnVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final cn f40253b;

            {
                this.f40253b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40253b.v(user, false);
                        return;
                    case 1:
                        this.f40253b.b(user);
                        return;
                    default:
                        this.f40253b.f36004a.ra(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new t1(this, u1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final cn f40253b;

            {
                this.f40253b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40253b.v(user, false);
                        return;
                    case 1:
                        this.f40253b.b(user);
                        return;
                    default:
                        this.f40253b.f36004a.ra(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final cn f40253b;

            {
                this.f40253b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40253b.v(user, false);
                        return;
                    case 1:
                        this.f40253b.b(user);
                        return;
                    default:
                        this.f40253b.f36004a.ra(user);
                        return;
                }
            }
        }, r42);
        H.f27135t = false;
        H.f27116i = 3;
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
        this.f36004a.vc(primaryMessageObject, false);
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
        qn qnVar = this.f36004a;
        qnVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(qnVar.getParentActivity()) && (chat = qnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == qnVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == qnVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = qnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                org.telegram.ui.Components.w01.b(parentActivity, i10, -qnVar.e.f20273id, currentUser, str2, z15, z16, z12, d6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == qnVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(qnVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                qnVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(qnVar.e);
                tL_channels_getParticipant.participant = qnVar.getMessagesController().getInputPeer(currentUser.f20420id);
                qnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new ai.r5(11, this, u1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
            org.telegram.ui.Components.w01.b(parentActivity2, i10, -qnVar.e.f20273id, currentUser, str2, z152, z162, z12, d6Var);
        }
    }

    @Override
    public final void d0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        qn qnVar = this.f36004a;
        try {
            if (i10 == 0) {
                qnVar.k7();
                bl blVar = qnVar.f40923z3;
                if (blVar != null) {
                    blVar.l(0L, 84, null, new nm(this, 1));
                    qnVar.f40923z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (qnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.z31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.z31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.xc.a0(qnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                qnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new nm(this, 2));
                } else if (qnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new nm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), a02.f32364c);
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
                ybVar.f32591b.setText(append2);
                ybVar.f32591b.setSingleLine(false);
                ybVar.f32591b.setMaxLines(6);
                a02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        dm dmVar;
        int i10 = (messageObject.getDialogId() > 1271266957L ? 1 : (messageObject.getDialogId() == 1271266957L ? 0 : -1));
        qn qnVar = this.f36004a;
        if ((i10 == 0 || ((dmVar = qnVar.A0) != null && dmVar.N)) && qnVar.R3 != 7) {
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
        if (this.f36004a.R3 == 0) {
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
        qn qnVar = this.f36004a;
        if (isHuaweiStoreApp) {
            pf.d.r(qnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(qnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.f36004a.L7(u1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final void f1() {
        qn qnVar = this.f36004a;
        qnVar.T7();
        UndoView undoView = qnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, qnVar.T5, null);
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (qnVar = this.f36004a).f40892wb) != 0 && i10 == u1Var.getMessageObject().getId() && qnVar.f40906xb == 3) {
            return qnVar.f40931zb;
        }
        return null;
    }

    @Override
    public final void g2() {
        this.f36004a.w9();
    }

    public final void h(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        qj qjVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        qn qnVar = this.f36004a;
        nj njVar = qnVar.f40895x0;
        if (njVar != null && (qjVar = qnVar.f40920z0) != null && qjVar.f45909y < 0) {
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = qnVar.f40895x0.getChildAt(childCount);
                qnVar.f40895x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = qnVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i11 = qnVar.Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                qj qjVar2 = qnVar.f40920z0;
                qnVar.f40895x0.getClass();
                qjVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) qnVar.f40839s9), false);
            } else {
                qnVar.f40920z0.h1(i10, i11);
            }
        }
        qnVar.N0 = z11;
        qnVar.vc(primaryMessageObject, false);
        qnVar.N0 = false;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar;
        qn qnVar = this.f36004a;
        if (qnVar.f40907xc.f17384f && (cVar = qnVar.Dc) != null && cVar.f45738n == u1Var && cVar.f45734a.getWidth() > 0) {
            return qnVar.Dc.f45734a.getHeight();
        }
        return 0;
    }

    @Override
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        qn qnVar = this.f36004a;
        if (!qnVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (qnVar.getParentActivity() != null) {
                if (qnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    fk fkVar = qnVar.Y;
                    MessageObject messageObject = u1Var.getMessageObject();
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    qi qiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    pf.c cVar = qnVar.Ab;
                    if (cVar != null) {
                        cVar.a(true);
                        qnVar.Ab = null;
                    }
                    if (str != null && u1Var.getMessageObject() != null) {
                        qi qiVar2 = new qi(qnVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                        qnVar.Ab = qiVar2;
                        qiVar = qiVar2;
                    } else {
                        qnVar.Ab = null;
                    }
                    fkVar.a0(keyboardButtonProto, messageObject, messageObject2, qiVar);
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
            boolean a10 = w7.j6.a(a2, 7);
            qn qnVar = this.f36004a;
            if (a10) {
                org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                qnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                u1Var.S0(true);
            } else if (qnVar.getParentActivity() != null) {
                if (qnVar.f40770n2 == null) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(5, qnVar.getParentActivity(), qnVar.f40667ea, false);
                    qnVar.f40770n2 = r40Var;
                    r40Var.setAlpha(0.0f);
                    qnVar.f40770n2.setVisibility(4);
                    int indexOfChild = qnVar.X0.indexOfChild(qnVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    qnVar.X0.addView(qnVar.f40770n2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.s1> pollButtons = u1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.s1 s1Var = pollButtons.get(i16);
                            float y3 = ((u1Var.getY() + s1Var.f22966b) - AndroidUtilities.dp(4.0f)) - qnVar.f40839s9;
                            qnVar.f40805q2 = AndroidUtilities.dp(13.3f) + s1Var.f22965a;
                            int D = org.telegram.messenger.kk.D(6.0f, s1Var.f22966b, i12);
                            qnVar.f40818r2 = D;
                            if (y3 > 0.0f) {
                                i15 = qnVar.f40805q2;
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
                        qnVar.f40895x0.v0(0, (int) f7, null);
                        qnVar.f40794p2 = u1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                qnVar.f40770n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        qn qnVar = this.f36004a;
        if (qnVar.getParentActivity() != null) {
            if (qnVar.X9 == null) {
                vh.i iVar = new vh.i(qnVar.getParentActivity());
                qnVar.X9 = iVar;
                qnVar.X0.addView(iVar, w7.z5.e(-1, -1, 48));
            }
            vh.i iVar2 = qnVar.X9;
            HashMap hashMap = iVar2.f48442a;
            ArrayList arrayList = iVar2.f48444c;
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
                    long j12 = dialog.f20277id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f20277id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f20277id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20420id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f20277id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f20277id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f20277id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f20277id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f20277id));
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
        this.f36004a.Z7(u1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void j() {
        f();
    }

    public final boolean k() {
        qn qnVar = this.f36004a;
        if (!UserObject.isUserSelf(qnVar.f40670f)) {
            TLRPC.Chat chat = qnVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !qnVar.e.megagroup) {
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
            qn qnVar = this.f36004a;
            if (qnVar.getParentLayout() != null && Z(u1Var)) {
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(qnVar, u1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new t1(this, u1Var, document, 24), false);
                H.f27135t = false;
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
            qn qnVar = this.f36004a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(qnVar)) {
                    nc0 nc0Var = new nc0(3);
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                    nc0Var.setResourceProvider(d6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = qnVar.getMessagesController().getPeer(qnVar.a());
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
                    nc0Var.O0 = false;
                    nc0Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    qnVar.presentFragment(nc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                et.q().w(qnVar.getParentActivity());
                et.q().v(new an(this, tL_messageMediaPoll, pollAnswer, u1Var));
                et q6 = et.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = u1Var.getMessageObject();
                d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
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
                    TLRPC.TL_message F7 = qn.F7(message);
                    F7.media = messageMedia;
                    F7.attachPath = rh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f45730g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = u1Var.f23565y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            rh.g gVar = u1Var.f23249c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            rh.g gVar2 = u1Var.f23234b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f45729f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = u1Var.f23565y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            rh.g gVar3 = u1Var.f23249c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            rh.g gVar4 = u1Var.f23234b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message F72 = qn.F7(message2);
                        F72.media = messageMedia;
                        F72.attachPath = rh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, F72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, qnVar, qnVar.f40667ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = qnVar.T5;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = qnVar.L6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = qnVar.d();
                            }
                            t12.d2(messageObject6, qnVar, j10, j11, j12, qnVar.Ga);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, qnVar.getParentActivity(), qnVar.f40667ea, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            qnVar.C6(messageObject6);
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
                    TLRPC.TL_message F73 = qn.F7(message3);
                    F73.media = messageMedia3;
                    F73.attachPath = rh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, F73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message F74 = qn.F7(message3);
                    F74.media = messageMedia2;
                    F74.attachPath = rh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    F74.message = pollResults2.solution;
                    F74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, F74, false, true));
                    arrayList2.add(-3);
                }
                ag.d.b(tL_messageMediaPoll.poll, qnVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message F75 = qn.F7(message3);
                        F75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        F75.message = tL_textWithEntities2.text;
                        F75.entities = tL_textWithEntities2.entities;
                        F75.attachPath = rh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, F75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, qnVar, qnVar.f40667ea);
                    PhotoViewer.t1().b2(arrayList3, i11, qnVar.a(), 0L, 0L, qnVar.Ha);
                }
            }
        }
    }

    @Override
    public final boolean l0() {
        boolean z10;
        qn qnVar = this.f36004a;
        if (!qnVar.F9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
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
        qn qnVar = this.f36004a;
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        if (z10 && qnVar.J9) {
            d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
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
        qn qnVar = this.f36004a;
        if (!qnVar.f40746l3 && qnVar.f40895x0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
            if (qnVar.f40858u2 == null) {
                jm jmVar = qnVar.X0;
                int indexOfChild = jmVar.indexOfChild(qnVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(1, qnVar.getParentActivity(), qnVar.f40667ea, false);
                    qnVar.f40858u2 = r40Var;
                    jmVar.addView(r40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    qnVar.f40858u2.setAlpha(0.0f);
                    qnVar.f40858u2.setVisibility(4);
                } else {
                    return;
                }
            }
            qnVar.f40858u2.e(u1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void n() {
        this.f36004a.X0.getClass();
    }

    @Override
    public final void n0(String str) {
        qn qnVar = this.f36004a;
        jk jkVar = qnVar.O0;
        if (jkVar == null || jkVar.getVisibility() != 0) {
            ik ikVar = qnVar.R;
            if ((ikVar == null || ikVar.getVisibility() != 0) && qnVar.Y != null && str != null && str.length() > 0) {
                fk fkVar = qnVar.Y;
                fkVar.setFieldText("@" + str + " ");
                qnVar.Y.F0();
            }
        }
    }

    @Override
    public final void n2() {
        qn qnVar = this.f36004a;
        if (qnVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", qnVar.T5);
            bundle.putInt("start_from", 10);
            qnVar.presentFragment(new org.telegram.ui.Components.wa0(bundle, qnVar.f40607a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", qnVar.getMessagesController().recommendedChannelsLimitPremium), new nm(this, 4))).j();
    }

    public final void o(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        qn qnVar = this.f36004a;
        TLRPC.Chat chat2 = qnVar.e;
        if (chat2 != null && chat.f20273id == chat2.f20273id) {
            hj hjVar = qnVar.f40607a1;
            if (hjVar != null && i10 == 0) {
                hjVar.e(false, false);
            } else if (u1Var.getMessageObject() != null) {
                qnVar.j(i10, u1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f20273id != chat2.f20273id || qnVar.K9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20273id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ri riVar = null;
            if (z10) {
                pf.c cVar = qnVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    qnVar.Ab = null;
                }
                if (u1Var.getMessageObject() == null) {
                    qnVar.Ab = null;
                } else {
                    ri riVar2 = new ri(qnVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    qnVar.Ab = riVar2;
                    riVar = riVar2;
                }
            }
            if (qnVar.getMessagesController().checkCanOpenChat(bundle, qnVar, u1Var.getMessageObject(), riVar)) {
                qn qnVar2 = new qn(bundle);
                if (riVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new ai.ub(this, riVar, chat, i10, qnVar2, 18), 5000L);
                    riVar.d();
                    return;
                }
                qnVar.presentFragment(qnVar2);
            }
        }
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.a6 a6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        qn qnVar = this.f36004a;
        if (!qnVar.getMessagesController().premiumFeaturesBlocked() && a6Var != null && !a6Var.standard) {
            long documentId = a6Var.getDocumentId();
            TLRPC.Document document = a6Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                document = org.telegram.ui.Components.r5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(qnVar, qnVar.getParentActivity(), qnVar.f40667ea, arrayList);
                org.telegram.ui.Components.qv qvVar = awVar.f24714f;
                qvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(qvVar);
                qvVar.v = imageReceiver;
                if (qvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                qvVar.f29716w = true;
                qvVar.f29717x.d(1.0f, true);
                qvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f21150m6, 0.2f, true), 0L, null, null, 0);
                qvVar.v.setLayerNum(7);
                qvVar.v.setAllowStartLottieAnimation(true);
                qvVar.v.setAllowStartAnimation(true);
                qvVar.v.setAutoRepeat(1);
                qvVar.v.setAllowDecodeSingleFrame(true);
                qvVar.v.setParentView(qvVar);
                awVar.setCalcMandatoryInsets(qnVar.C9());
                qnVar.showDialog(awVar);
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
        qn qnVar = this.f36004a;
        ei.x3 x3Var = qnVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (qnVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            ei.x3 x3Var2 = new ei.x3(qnVar.getParentActivity(), 3);
            x3Var2.p(true);
            x3Var2.K = Layout.Alignment.ALIGN_NORMAL;
            x3Var2.d = -1L;
            x3Var2.T = true;
            x3Var2.e = true;
            x3Var2.q(12.0f);
            qnVar.A1 = x3Var2;
            x3Var2.f10080l0 = new eh(9, this, x3Var2);
            x3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            qnVar.X0.addView(qnVar.A1, w7.z5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            qnVar.X0.post(new i2.a0(this, u1Var, i11, i10, 4));
        }
    }

    @Override
    public final void p(org.telegram.ui.Cells.u1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.p(org.telegram.ui.Cells.u1):void");
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        vh.i iVar = this.f36004a.X9;
        if (iVar != null && (hVar = (vh.h) iVar.f48442a.get(vh.i.b(u1Var))) != null) {
            vh.d[] dVarArr = hVar.f48439w;
            RectF rectF = hVar.f48437r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = vh.g.f48424a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.f48424a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.r.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f48431a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        vh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f48403p != z10) {
                            ValueAnimator valueAnimator = dVar.f48401n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f48403p = z10;
                            float f15 = dVar.f48402o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f48401n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f48401n.addUpdateListener(dVar);
                            dVar.f48401n.setInterpolator(vh.f.f48407a);
                            dVar.f48401n.start();
                        }
                        vh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f48400m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f48398k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f48400m = z11;
                            float f16 = dVar2.f48399l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f48398k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f48398k.addUpdateListener(dVar2);
                            dVar2.f48398k.setInterpolator(vh.f.f48407a);
                            dVar2.f48398k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.o9 p2() {
        return this.f36004a.f40642c9;
    }

    @Override
    public final void q() {
        this.f36004a.cc();
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        qn qnVar = this.f36004a;
        qnVar.L7(u1Var, false, false, f7, f10, true, false, false);
        qnVar.f40895x0.getClass();
        qn.d2(qnVar, RecyclerView.R(u1Var));
    }

    public final void r(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20420id);
            org.telegram.ui.ActionBar.n2 n2Var = this.f36004a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, u1Var.getMessageObject())) {
                n2Var.presentFragment(new qn(bundle));
            }
        }
    }

    @Override
    public final void s(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        qj qjVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            qn qnVar = this.f36004a;
            nj njVar = qnVar.f40895x0;
            if (njVar != null && (qjVar = qnVar.f40920z0) != null && qjVar.f45909y < 0) {
                for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = qnVar.f40895x0.getChildAt(childCount);
                    qnVar.f40895x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = qnVar.Q8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = qnVar.Q8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            qnVar.vc(primaryMessageObject, false);
            ei.x3 x3Var = qnVar.A1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            if (i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
                qnVar.f40920z0.h1(i10, i11);
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
        qn qnVar = this.f36004a;
        qnVar.fa(qnVar.e.f20273id, messageObject2, messageObject2.getId(), j11, i11, 0, null);
    }

    public final void u(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20273id);
            bundle.putBoolean("expandPhoto", false);
            this.f36004a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f36004a;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        boolean z10 = true;
        if (!kVar.t() && !qnVar.F9()) {
            if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
                M0(10, u1Var);
                return;
            }
            if (!ChatObject.isForum(qnVar.e) && !qnVar.K9()) {
                z10 = false;
            }
            v(user, z10);
            return;
        }
        qn.c2(qnVar, u1Var, true, f7, f10);
    }

    public final void v(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f20420id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20420id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            qn qnVar = this.f36004a;
            TLRPC.User user2 = qnVar.f40670f;
            if (user2 != null && user2.f20420id == user.f20420id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            qnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r44, float r45, float r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v1() {
        qn qnVar = this.f36004a;
        if (qnVar.X0.getMeasuredWidth() > qnVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        qn qnVar = this.f36004a;
        if (UserObject.isBotForum(qnVar.f40670f)) {
            return null;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = qnVar.getMessagesController().getAdminRank(qnVar.e.f20273id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = qnVar.f40637c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f36004a.f40829s.containsKey(messageObject);
    }

    @Override
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
        qn.U4(this.f36004a, u1Var);
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar = this.f36004a.Dc;
        if (cVar != null && cVar.f45738n == u1Var) {
            cVar.f45741w.getClass();
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
        qn qnVar = this.f36004a;
        if (!qnVar.f40746l3 && !SharedConfig.noSoundHintShowed && qnVar.f40895x0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
            org.telegram.ui.Components.r40 r40Var = qnVar.f40845t2;
            if (r40Var == null || r40Var.getTag() == null) {
                if (qnVar.f40845t2 == null) {
                    jm jmVar = qnVar.X0;
                    int indexOfChild = jmVar.indexOfChild(qnVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(0, qnVar.getParentActivity(), qnVar.f40667ea, false);
                        qnVar.f40845t2 = r40Var2;
                        r40Var2.setShowingDuration(10000L);
                        jmVar.addView(qnVar.f40845t2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        qnVar.f40845t2.setAlpha(0.0f);
                        qnVar.f40845t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = qnVar.f40895x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = qnVar.f40895x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && qnVar.f40845t2.e(u1Var, null, 0, 0, true)) {
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
        qn qnVar = this.f36004a;
        if (qnVar.getParentActivity() != null && tLObject != null) {
            d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                if (((ActionBarLayout) d5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20273id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f20420id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, qnVar.getParentActivity(), qnVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(qnVar.getParentActivity(), false, false);
                e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                e1Var.setMinimumWidth(160);
                e1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(qnVar.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                qn qnVar2 = new qn(bundle);
                qnVar2.J9 = true;
                qnVar.presentFragmentAsPreviewWithMenu(qnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                qnVar.g7();
                return;
            }
            qnVar.presentFragment(new qn(bundle));
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
        jk jkVar;
        ik ikVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        qn qnVar = this.f36004a;
        if (!isEmpty && qnVar.e != null && (((jkVar = qnVar.O0) == null || jkVar.getVisibility() != 0) && ((ikVar = qnVar.R) == null || ikVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = qnVar.e;
        if (chat2 != null && ((qnVar.f40650d4 == 0 || qnVar.f40699h4) && (!ChatObject.isChannel(chat2) || qnVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = qnVar.e;
        if (chat3 != null && chat3.f20273id == chat.f20273id && !qnVar.K9()) {
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
                i5Var = i5.f37847f;
            }
            i5VarArr[1] = i5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            i5VarArr[i13] = i5.f37848n;
            i13++;
        }
        if (i11 != 0) {
            i5VarArr[i13] = i5.f37849r;
        }
        TLRPC.ChatFull chatFull = qnVar.getMessagesController().getChatFull(chat.f20273id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
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
            c2.b.m().y((ViewGroup) qnVar.fragmentView, qnVar.f40667ea, c5Var, new e7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(qnVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new qm(this, chat, 0), false);
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
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new qm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new qm(this, chat, 2), i16);
        H.f27135t = false;
        H.f27116i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }
}
