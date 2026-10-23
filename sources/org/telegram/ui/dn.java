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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
public final class dn implements org.telegram.ui.Cells.k1 {
    public final sn f36660a;

    public dn(sn snVar) {
        this.f36660a = snVar;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            t1Var.s2();
            t1Var.requestLayout();
            this.f36660a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        sn snVar = this.f36660a;
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
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(snVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = snVar.getMessagesController().conferenceCallSizeLimit;
                c2Var.setOnCancelListener(new ai.e0(this, snVar.getConnectionsManager().sendRequest(getgroupcall, new ai.s9(this, c2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                c2Var.r(600L);
                return;
            }
            TLRPC.User user = snVar.f41512f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = snVar.f41604m8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, i11, snVar.getParentActivity(), snVar.getMessagesController().getUserFull(snVar.f41512f.f20490id), snVar.getAccountInstance());
                return;
            }
            return;
        }
        snVar.L7(t1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        sn snVar = this.f36660a;
        if (!snVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (snVar.getParentActivity() != null) {
                if (snVar.f41449a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) snVar.getParentActivity(), (org.telegram.ui.ActionBar.g6) snVar.f41654qa, false);
                        h3Var.fixNavigationBar();
                        h3Var.title = str;
                        h3Var.bigTitle = false;
                        h3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        mg.j jVar = new mg.j(3, snVar, str);
                        h3Var.items = charSequenceArr;
                        h3Var.onClickListener = jVar;
                        snVar.showDialog(h3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        snVar.ea(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
                        try {
                            t1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void B(org.telegram.ui.Cells.t1 t1Var) {
        sn snVar = this.f36660a;
        if (!snVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(snVar.getParentActivity(), 3, null);
            c2Var.r(200L);
            snVar.getMessagesController().getContentSettings(new y(this, c2Var, t1Var, 6));
            return;
        }
        if (t1Var.getMessageObject() != null) {
            t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        t1Var.g4();
    }

    @Override
    public final boolean B1() {
        sn snVar = this.f36660a;
        if (snVar.f41561j1.getKeyboardHeight() + snVar.Aa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
        h(t1Var, true, false, true);
    }

    @Override
    public final void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int dp;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i13 = buttonCustom.f17849id;
            TL_stars.StarsAmount starsAmount = null;
            sn snVar = this.f36660a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3(19, this, message);
                Pattern pattern = org.telegram.ui.Components.f5.f26167a;
                Activity parentActivity = snVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.r6.W(editText, org.telegram.ui.ActionBar.k6.G6, null);
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                org.telegram.ui.ActionBar.r6.F(editText, org.telegram.ui.ActionBar.k6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.k6.T(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.t4(parentActivity)});
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
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new m4.w0(28, m3Var, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c2Var.N = new org.telegram.ui.Components.q1(editText, 0);
                frameLayout.addView(editText, w7.z5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
                snVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, snVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, snVar.e, 5);
                    }
                    ai.x9 x9Var = new ai.x9(this, message, canManageMonoForum, messageObject, 12);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    snVar.j7(x9Var, ag.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                snVar.L7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                snVar.f41490d2.n(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        sn snVar = this.f36660a;
        snVar.p5 = messageObject;
        snVar.i9();
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            sn snVar = this.f36660a;
            if ((snVar.Jb != id2 || snVar.Kb != 7) && (inputPeer = snVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f20560id = id2;
                pf.c cVar = snVar.Nb;
                if (cVar != null) {
                    cVar.a(true);
                    snVar.Nb = null;
                }
                ri riVar = new ri(snVar, id2, t1Var, 2);
                riVar.f44707b = new h0(26, snVar, r3);
                snVar.Nb = riVar;
                riVar.d();
                int[] iArr = {snVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new ai.x3(snVar, riVar, iArr, t1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        sn snVar = this.f36660a;
        snVar.Ja.k(t1Var, snVar, true);
        snVar.f41737x0.I0(false);
    }

    @Override
    public final void F1(MessageObject messageObject) {
        this.f36660a.f41671s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new mi.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.sl.p(R.string.CodeCopied, org.telegram.ui.Components.xc.a0(this.f36660a));
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        sn snVar = this.f36660a;
        snVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        snVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        h(t1Var, true, false, true);
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        zm zmVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && pf.d.g(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        sn snVar = this.f36660a;
        pf.c cVar = snVar.Nb;
        if (cVar != null) {
            cVar.a(true);
        }
        if (t1Var.getMessageObject() == null) {
            zmVar = null;
        } else {
            zmVar = new zm(this, t1Var);
        }
        snVar.Nb = zmVar;
        if (!z11 && !pf.d.e(parse, false, null)) {
            org.telegram.ui.Components.f5.r0(snVar, str, true, true, true, !z11, snVar.Nb, webPage, snVar.f41654qa);
        } else {
            pf.d.q(snVar.getParentActivity(), parse, true, true, false, snVar.Nb, null, false, true, false);
        }
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        sn snVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (snVar = this.f36660a).Jb) != 0 && i10 == t1Var.getMessageObject().getId() && snVar.Kb == 1) {
            return snVar.Lb;
        }
        return null;
    }

    @Override
    public final void I(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f36660a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            sn snVar = this.f36660a;
            org.telegram.ui.Components.cv.I(snVar, messageObject, snVar.Sa, str2, str3, str4, str, i10, i11, -1, snVar.C9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean J0(long j10) {
        sn snVar = this.f36660a;
        TLRPC.Chat chat = snVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return snVar.getMessagesController().isOwner(snVar.e.f20343id, j10);
        }
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        se seVar;
        a3.i0 i0Var;
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        ah.v vVar;
        int i10;
        boolean z11;
        int i11;
        z31 z31Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f36660a.A0.L();
                    sn snVar = this.f36660a;
                    return mediaController.setPlaylist(L, messageObject, snVar.X6, true ^ snVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f36660a.U7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            b41 b41Var = this.f36660a.f41594la;
            if (b41Var == null || b41Var.f35859b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.xc.a0(this.f36660a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f36660a.f41594la = new b41(this.f36660a.getParentActivity());
                b41 b41Var2 = this.f36660a.f41594la;
                if (!messageObject.isOutOwner()) {
                    seVar = this.f36660a.lb(messageObject, true);
                } else {
                    seVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    i0Var = sn.P4(this.f36660a, messageObject);
                } else {
                    i0Var = null;
                }
                Context context = b41Var2.f35856a;
                ah.v vVar2 = b41Var2.f35860c;
                b41Var2.X = seVar;
                b41Var2.Y = i0Var;
                z31 z31Var2 = b41Var2.N;
                if (z31Var2 != null) {
                    vVar2.removeView(z31Var2);
                    b41Var2.N = null;
                }
                b41Var2.O = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                b41Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b41Var2.S = z10;
                org.telegram.ui.Cells.t1 t1Var2 = b41Var2.O;
                if (t1Var2 != null) {
                    g6Var = t1Var2.getResourcesProvider();
                } else {
                    g6Var = null;
                }
                b41Var2.L = g6Var;
                if (b41Var2.O != null) {
                    b41Var2.T = 0.0f;
                    b41Var2.U = t1Var.f23491n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        b41Var2.T = view.getY() + b41Var2.T;
                        b41Var2.U = view.getY() + b41Var2.U;
                    }
                    int width = b41Var2.O.getWidth();
                    int height = b41Var2.O.getHeight();
                    if (b41Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    b41Var2.K = i14 - b41Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    vVar = vVar2;
                    z31 z31Var3 = new z31(b41Var2, b41Var2.getContext(), UserConfig.selectedAccount, b41Var2.O.getResourcesProvider(), width, i14);
                    b41Var2.N = z31Var3;
                    b41Var2.O.i1(z31Var3);
                    b41Var2.N.h1(b41Var2.O);
                    b41Var2.N.setDelegate(new pb.a(18));
                    z31 z31Var4 = b41Var2.N;
                    MessageObject messageObject3 = b41Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = b41Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = b41Var2.O;
                    z31Var4.W3(messageObject3, currentMessagesGroup, t1Var3.F, t1Var3.E, false, false);
                    if (!b41Var2.S) {
                        org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8();
                        b41Var2.V = l8Var;
                        z31 z31Var5 = b41Var2.N;
                        l8Var.f28265i = z31Var5;
                        z31Var5.f23378ee = l8Var;
                        if (z31Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.kp0 seekBarWaveform = b41Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = b41Var2.f35867s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.f28112n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    b41Var2.H = false;
                    vVar.addView(b41Var2.N, new FrameLayout.LayoutParams(b41Var2.O.getWidth(), i14, 17));
                } else {
                    vVar = vVar2;
                    i10 = 360;
                }
                TextureView textureView = b41Var2.P;
                if (textureView != null) {
                    vVar.removeView(textureView);
                    b41Var2.P = null;
                }
                if (b41Var2.S) {
                    b41Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    b41Var2.P = textureView2;
                    vVar.addView(textureView2, 0, w7.z5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.j81 j81Var = b41Var2.f35868w;
                if (j81Var != null) {
                    j81Var.B();
                    b41Var2.f35868w.H();
                    b41Var2.f35868w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = b41Var2.O;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(b41Var2.O.getMessageObject().currentAccount).getPathToAttach(b41Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(b41Var2.O.getMessageObject().currentAccount).getPathToMessage(b41Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && b41Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(b41Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.j81 j81Var2 = new org.telegram.ui.Components.j81();
                        b41Var2.f35868w = j81Var2;
                        j81Var2.J = new a41(b41Var2);
                        if (b41Var2.V != null) {
                            j81Var2.K = new a41(b41Var2);
                        }
                        if (b41Var2.S) {
                            j81Var2.V(b41Var2.P);
                        }
                        b41Var2.f35868w.D(Uri.fromFile(pathToAttach), "other");
                        b41Var2.f35868w.C();
                        org.telegram.ui.Components.rt rtVar = b41Var2.E;
                        if (rtVar != null) {
                            rtVar.f30268s = b41Var2.f35868w;
                            rtVar.a();
                        }
                    }
                    sn snVar2 = this.f36660a;
                    snVar2.showDialog(snVar2.f41594la);
                    return false;
                }
                ei.x3 x3Var = b41Var2.f35869x;
                if (x3Var != null) {
                    vVar.removeView(x3Var);
                    b41Var2.f35869x = null;
                }
                MessageObject messageObject4 = b41Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = b41Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(b41Var2.M.currentAccount).getClientUserId()) {
                    ei.x3 x3Var2 = new ei.x3(context, 3);
                    b41Var2.f35869x = x3Var2;
                    x3Var2.p(true);
                    if (z11) {
                        long dialogId = b41Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(b41Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(b41Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        ei.x3 x3Var3 = b41Var2.f35869x;
                        if (b41Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        x3Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ei.x3 x3Var4 = b41Var2.f35869x;
                        if (b41Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        x3Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    b41Var2.f35869x.q(12.0f);
                    ei.x3 x3Var5 = b41Var2.f35869x;
                    if (!z11 && !b41Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    x3Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (b41Var2.S) {
                        b41Var2.f35869x.m(0.5f, 0.0f);
                        b41Var2.f35869x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        b41Var2.f35869x.m(0.0f, AndroidUtilities.dp(34.0f));
                        b41Var2.f35869x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    b41Var2.f35869x.t(14.0f);
                    ei.x3 x3Var6 = b41Var2.f35869x;
                    x3Var6.h = ei.x3.a(x3Var6.getText(), b41Var2.f35869x.getTextPaint());
                    if (b41Var2.S) {
                        vVar.addView(b41Var2.f35869x, w7.z5.d((int) ((b41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((b41Var2.O.getHeight() + b41Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        vVar.addView(b41Var2.f35869x, w7.z5.d((int) ((b41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((b41Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + b41Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((b41Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    b41Var2.f35869x.u();
                }
                TextView textView = b41Var2.f35870y;
                if (textView != null) {
                    vVar.removeView(textView);
                    b41Var2.f35870y = null;
                }
                TextView textView2 = new TextView(context);
                b41Var2.f35870y = textView2;
                textView2.setTextColor(-1);
                b41Var2.f35870y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    b41Var2.f35870y.setBackground(org.telegram.ui.ActionBar.k6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    b41Var2.f35870y.setBackground(org.telegram.ui.ActionBar.k6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                b41Var2.f35870y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.b6.a(b41Var2.f35870y);
                TextView textView3 = b41Var2.f35870y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                b41Var2.f35870y.setOnClickListener(new x31(b41Var2, 1));
                vVar.addView(b41Var2.f35870y, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (z31Var = b41Var2.N) != null && z31Var.getMessageObject() != null && b41Var2.N.getMessageObject().messageOwner != null) {
                    b41Var2.N.getMessageObject().messageOwner.media_unread = false;
                    b41Var2.N.invalidate();
                }
                sn snVar22 = this.f36660a;
                snVar22.showDialog(snVar22.f41594la);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void K(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        sn snVar = this.f36660a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (snVar.f41519f6 != j10) {
                snVar.presentFragment(sn.W9(j10));
            } else {
                snVar.f41597m1.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            snVar.presentFragment(ProfileActivity.o4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void K0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        ArrayList<MessageObject> arrayList;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        sn snVar = this.f36660a;
        vh.i iVar = snVar.f41570ja;
        if (iVar != null) {
            HashMap hashMap = iVar.f48889a;
            vh.h hVar = (vh.h) hashMap.get(vh.i.b(t1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            vh.h hVar2 = (vh.h) snVar.f41570ja.f48889a.get(vh.i.b(t1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j10 = hVar2.f48886w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = snVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.f5.h(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) snVar.J6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.v0.k(messageObject);
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
                    qcVar = org.telegram.ui.Components.xc.v(snVar.getParentActivity(), snVar, null, 1, j11, 1, snVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), snVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi), 5000, false, i0Var);
                    qcVar.f29833k = true;
                    qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
                }
            }
            vh.h hVar3 = (vh.h) hashMap.get(vh.i.b(t1Var));
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
                ybVar.f32862a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new yl(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void K1(org.telegram.ui.Cells.t1 t1Var, ah.t tVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            tVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f36660a;
            o2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, o2Var, true);
            return;
        }
        tVar.run();
    }

    @Override
    public final void L1() {
        org.telegram.ui.ActionBar.g6 g6Var;
        sn snVar = this.f36660a;
        if (snVar.f41561j1 != null && snVar.getParentActivity() != null) {
            Context context = snVar.f41561j1.getContext();
            g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
            x21.T(context, snVar, false, g6Var, null);
        }
    }

    @Override
    public final void M(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f36660a.lb(messageObject, true);
        }
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.t1 t1Var) {
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
        MessageObject messageObject = t1Var.getMessageObject();
        boolean z11 = false;
        wm wmVar = null;
        wm wmVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        wm wmVar3 = null;
        wm wmVar4 = null;
        sn snVar = this.f36660a;
        if (i10 == 19) {
            pf.c cVar = snVar.Nb;
            if (cVar != null) {
                cVar.a(true);
            }
            if (t1Var.getMessageObject() != null) {
                wmVar2 = new wm(this, t1Var, 2);
            }
            final wm wmVar5 = wmVar2;
            snVar.Nb = wmVar5;
            final Activity parentActivity = snVar.getParentActivity();
            final org.telegram.ui.ActionBar.g6 resourceProvider = snVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            wmVar5.d();
            wmVar5.f44707b = new ug.c(atomicBoolean, 0);
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
            final String b10 = ug.h.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.messageOwner.date * 1000;
            ug.q.d(messageObject, new Utilities.Callback(atomicBoolean, wmVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f48110a;
                public final pf.c f48111b;
                public final boolean f48112c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f48113f;
                public final g6 f48114g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f48113f = parentActivity;
                    this.f48114g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f48110a.get()) {
                        this.f48111b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f48112c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f48113f;
                        g6 g6Var = this.f48114g;
                        if (z12) {
                            h.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, g6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            h.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, g6Var);
                        }
                    }
                }
            }, new ug.e(atomicBoolean, wmVar5, 0));
        } else if (i10 == 21) {
            d();
        } else if (i10 == 84) {
            snVar.ya(t1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.oh0.R;
            if (snVar.getParentActivity() != null) {
                snVar.showDialog(new org.telegram.ui.Components.oh0(snVar.getContext(), snVar.getCurrentAccount(), messageObject, snVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.J1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.J1.P().l(messageObject) == null) {
                    snVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
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
                bundle.putLong("user_id", user.f20490id);
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
                snVar.showDialog(new org.telegram.ui.Components.mf0(snVar, null, user, null, file, jf.b.d(str, false), str3, str4, snVar.f41654qa));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            snVar.presentFragment(new sn(si.o0.e(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.sl.h(new StringBuilder("+"), user2.phone, jf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = jf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f20490id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                snVar.presentFragment(new hs(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                snVar.O9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    pf.c cVar2 = snVar.Nb;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        wmVar3 = new wm(this, t1Var, 4);
                    }
                    snVar.Nb = wmVar3;
                    pf.d.q(snVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, snVar.Nb, null, false, snVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            snVar.getOrCreateStoryViewer().F(snVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ci.q7.a(snVar.f41737x0));
                            return;
                        }
                    }
                }
                if (!snVar.ja(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
                    pf.c cVar3 = snVar.Nb;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        wmVar4 = new wm(this, t1Var, 5);
                    }
                    snVar.Nb = wmVar4;
                    pf.d.q(snVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, snVar.Nb, null, false, true, false);
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
                pf.c cVar4 = snVar.Nb;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (t1Var.getMessageObject() != null) {
                    wmVar = new wm(this, t1Var, 3);
                }
                snVar.Nb = wmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        snVar.Nb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        snVar.Nb.f44707b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ei.o3(4, this, z11)), 29);
                        return;
                    }
                }
                pf.d.q(snVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, snVar.Nb, null, false, true, false);
            }
        }
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ri riVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        ah.g gVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            sn snVar = this.f36660a;
            pf.c cVar = snVar.Nb;
            if (cVar != null) {
                cVar.a(true);
                snVar.Nb = null;
            }
            if (t1Var.getMessageObject() == null) {
                snVar.Nb = null;
                riVar = null;
            } else {
                riVar = new ri(snVar, t1Var.getMessageObject().getId(), t1Var, 1);
                snVar.Nb = riVar;
            }
            i10 = ((org.telegram.ui.ActionBar.o2) this.f36660a).currentAccount;
            ai.ha y3 = ai.ha.y(i10, false);
            Objects.requireNonNull(riVar);
            ti tiVar = new ti(riVar, 8);
            Context context = LaunchActivity.J1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.g6 I = ai.ha.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f1413a).getInputPeer(dialogId);
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
                gVar = new ah.g(y3, ConnectionsManager.getInstance(y3.f1413a).sendRequest(tL_payments_getPaymentForm, new ai.k2(y3, messageObject, tL_inputInvoiceMessage, tiVar, 3)), 2);
            }
            if (gVar != null) {
                riVar.f44707b = gVar;
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
                PhotoViewer u12 = PhotoViewer.u1();
                sn snVar2 = this.f36660a;
                u12.M2(null, snVar2, snVar2.f41654qa);
                PhotoViewer.u1().d2(arrayList, i11, this.f36660a.a(), 0L, 0L, this.f36660a.Ta);
            }
        }
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        sn snVar = this.f36660a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!t1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(snVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!snVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new om(this, 9))).k(true);
            return false;
        } else {
            snVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(snVar.e, snVar.f41592l8, true), t1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        sn snVar = this.f36660a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            sg.m1 m1Var = new sg.m1(snVar, i10, user, null, null, snVar.f41654qa);
            t1Var.getLocationOnScreen(new int[2]);
            m1Var.f46775v0 = t1Var.getNameStatusX();
            m1Var.f46776w0 = t1Var.getNameStatusY();
            m1Var.f46779z0 = t1Var.getScaleX();
            m1Var.f46777x0 = t1Var.getLeft();
            m1Var.f46778y0 = t1Var.getTop();
            m1Var.A0 = t1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
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
                m1Var.f46774u0 = num;
            } else {
                m1Var.f46774u0 = Integer.valueOf(snVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21442r8[colorId]));
            }
            org.telegram.ui.Components.p5 p5Var = t1Var.fc;
            if (p5Var != null && (p5Var.f29416f[0] instanceof org.telegram.ui.Components.r5)) {
                m1Var.f46779z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(snVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21346m6, 0.2f);
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
                        Integer num2 = m1Var.f46774u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = snVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21516v6);
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
            snVar.showDialog(m1Var);
            return;
        }
        pf.d.r(snVar.getParentActivity(), "https://" + snVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final void O0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        sn snVar = this.f36660a;
        snVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, snVar);
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 r44, org.telegram.tgnet.TLRPC.PollAnswer r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dn.O1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean P() {
        sn snVar = this.f36660a;
        if (snVar.f41554i6[1].size() + snVar.f41554i6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final yu0 P1() {
        return this.f36660a.Ia;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var != null) {
            sn snVar = this.f36660a;
            if (snVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
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
        sn snVar = this.f36660a;
        TLRPC.Chat chat = snVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return snVar.getMessagesController().isAdmin(snVar.e.f20343id, j10);
        }
        return false;
    }

    @Override
    public final boolean R() {
        sn snVar = this.f36660a;
        if (!UserObject.isReplyUser(snVar.f41512f) && !UserObject.isUserSelf(snVar.f41512f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.f36660a.X7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    @Override
    public final void R1(org.telegram.ui.Cells.t1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dn.R1(org.telegram.ui.Cells.t1, int, float, float, boolean):void");
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        sn snVar = this.f36660a;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (!kVar.s() && !snVar.F9()) {
            if (!z10 && chat.signature_profiles && (messageObject = t1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                snVar.sa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                o(t1Var, chat, i10, z10);
                return;
            }
        }
        sn.c2(snVar, t1Var, true, f7, f10);
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null) {
            sn snVar = this.f36660a;
            if (!snVar.f41735wc && messageObject.getId() == snVar.f41722vc) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - snVar.f41749xc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.t1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dn.S1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
        h(t1Var, true, true, false);
    }

    @Override
    public final void T0(org.telegram.ui.Cells.t1 t1Var) {
        sn snVar = this.f36660a;
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(snVar.f41519f6), t1Var);
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        sn snVar = this.f36660a;
        if (AndroidUtilities.isContextSafe(snVar.getParentActivity()) && (chat = snVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            c(t1Var, snVar.getMessagesController().getParticipant(snVar.e.f20343id, currentUser.f20490id));
        }
    }

    @Override
    public final int V() {
        return this.f36660a.f41492d4;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.PsaMessageInfoDefault);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            MessageObject.addLinks(false, spannableStringBuilder);
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            sn snVar = this.f36660a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = snVar.f41737x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = snVar.f41737x0.getChildAt(i11);
                                if (childAt instanceof org.telegram.ui.Cells.t1) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                                    if (messageObject2.equals(t1Var2.getMessageObject())) {
                                        t1Var = t1Var2;
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
            snVar.Pb(messageObject, spannableStringBuilder, 1);
            t1Var.f4(1, false, true);
        }
    }

    @Override
    public final ih.a W() {
        return this.f36660a.f41499dc;
    }

    @Override
    public final void W1(org.telegram.ui.Cells.t1 t1Var, long j10) {
        Bundle e = si.o0.e(j10, "user_id");
        org.telegram.ui.ActionBar.o2 o2Var = this.f36660a;
        if (o2Var.getMessagesController().checkCanOpenChat(e, o2Var, t1Var.getMessageObject())) {
            o2Var.presentFragment(new sn(e));
        }
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null) {
            messageObject = null;
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            sn snVar = this.f36660a;
            if (snVar.f41492d4 != 1 && !snVar.D9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        sn snVar = this.f36660a;
        if (snVar.Jb != 0 && t1Var.getMessageObject() != null && snVar.Jb == t1Var.getMessageObject().getId() && snVar.Kb == i10) {
            return true;
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        sn snVar = this.f36660a;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            CharSequence fieldText = gkVar.getFieldText();
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
                AndroidUtilities.runOnUIThread(new om(this, 6), 200L);
            }
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        sn snVar = this.f36660a;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            CharSequence fieldText = gkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(si.o0.u(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.t61("" + user.f20490id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            snVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new om(this, 7), 200L);
        }
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var != null && pageBlock != null) {
            sn snVar = this.f36660a;
            if (snVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer u12 = PhotoViewer.u1();
                    u12.M2(null, snVar, null);
                    return u12.g2(null, null, null, null, null, null, null, indexOf, new nm(snVar, arrayList), null, 0L, 0L, 0L, true, new mm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void c(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        sn snVar = this.f36660a;
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
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
                org.telegram.ui.Components.a11.b(parentActivity, i10, -snVar.e.f20343id, currentUser, str2, z15, z16, z12, g6Var);
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
                tL_channels_getParticipant.participant = snVar.getMessagesController().getInputPeer(currentUser.f20490id);
                snVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new ai.r5(11, this, t1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = snVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
            org.telegram.ui.Components.a11.b(parentActivity2, i10, -snVar.e.f20343id, currentUser, str2, z152, z162, z12, g6Var);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        b5 b10;
        int i11;
        kk kkVar;
        jk jkVar;
        if (!k()) {
            return false;
        }
        sn snVar = this.f36660a;
        if (snVar.e != null && (((kkVar = snVar.f41449a1) == null || kkVar.getVisibility() != 0) && ((jkVar = snVar.R) == null || jkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat != null && ((snVar.f41638p4 == 0 || snVar.f41689t4) && (!ChatObject.isChannel(chat) || snVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        h5[] h5VarArr = new h5[r22 + 2 + r42];
        h5VarArr[0] = h5.d;
        h5VarArr[1] = h5.h;
        char c10 = 2;
        if (r22 != 0) {
            h5VarArr[2] = h5.f37738n;
            c10 = 3;
        }
        if (r42 != 0) {
            h5VarArr[c10] = h5.f37739r;
        }
        TLRPC.UserFull userFull = snVar.getMessagesController().getUserFull(user.f20490id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
            b10 = b5.b(user, i10, h5VarArr);
        } else {
            b10 = b5.c(user, userFull, h5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
                b10 = b5.b(user, i11, h5VarArr);
            }
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) snVar.fragmentView, snVar.f41654qa, b10, new e7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(snVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final dn f40866b;

            {
                this.f40866b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40866b.v(user, false);
                        return;
                    case 1:
                        this.f40866b.b(user);
                        return;
                    default:
                        this.f40866b.f36660a.ra(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new s1(this, t1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final dn f40866b;

            {
                this.f40866b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40866b.v(user, false);
                        return;
                    case 1:
                        this.f40866b.b(user);
                        return;
                    default:
                        this.f40866b.f36660a.ra(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final dn f40866b;

            {
                this.f40866b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40866b.v(user, false);
                        return;
                    case 1:
                        this.f40866b.b(user);
                        return;
                    default:
                        this.f40866b.f36660a.ra(user);
                        return;
                }
            }
        }, r42);
        H.f27581t = false;
        H.f27562i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void c2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f36660a.yc(primaryMessageObject, false);
    }

    public final void d() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        sn snVar = this.f36660a;
        if (isHuaweiStoreApp) {
            pf.d.r(snVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(snVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void d0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        sn snVar = this.f36660a;
        try {
            if (i10 == 0) {
                snVar.k7();
                cl clVar = snVar.L3;
                if (clVar != null) {
                    clVar.l(0L, 84, null, new om(this, 1));
                    snVar.L3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(snVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (snVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.e41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.e41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.xc.a0(snVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                snVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(snVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", snVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new om(this, 2));
                } else if (snVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new om(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), a02.f32517c);
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
                ybVar.f32863b.setText(append2);
                ybVar.f32863b.setSingleLine(false);
                ybVar.f32863b.setMaxLines(6);
                a02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        em emVar;
        int i10 = (messageObject.getDialogId() > 1271266957L ? 1 : (messageObject.getDialogId() == 1271266957L ? 0 : -1));
        sn snVar = this.f36660a;
        if ((i10 == 0 || ((emVar = snVar.A0) != null && emVar.N)) && snVar.f41492d4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        sn snVar = this.f36660a;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            if (!kVar2.s() && !snVar.F9()) {
                z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
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
    public final boolean e0() {
        if (this.f36660a.f41492d4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        this.f36660a.L7(t1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final void f1() {
        sn snVar = this.f36660a;
        snVar.T7();
        UndoView undoView = snVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, snVar.f41519f6, null);
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        sn snVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (snVar = this.f36660a).Jb) != 0 && i10 == t1Var.getMessageObject().getId() && snVar.Kb == 3) {
            return snVar.Mb;
        }
        return null;
    }

    @Override
    public final void g2() {
        this.f36660a.w9();
    }

    public final void h(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        qj qjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        sn snVar = this.f36660a;
        nj njVar = snVar.f41737x0;
        if (njVar != null && (qjVar = snVar.f41762z0) != null && qjVar.f46340y < 0) {
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = snVar.f41737x0.getChildAt(childCount);
                snVar.f41737x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = snVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i11 = snVar.Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                qj qjVar2 = snVar.f41762z0;
                snVar.f41737x0.getClass();
                qjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) snVar.E9), false);
            } else {
                snVar.f41762z0.h1(i10, i11);
            }
        }
        snVar.Z0 = z11;
        snVar.yc(primaryMessageObject, false);
        snVar.Z0 = false;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar;
        sn snVar = this.f36660a;
        if (snVar.Kc.f17447f && (cVar = snVar.Qc) != null && cVar.f46171n == t1Var && cVar.f46167a.getWidth() > 0) {
            return snVar.Qc.f46167a.getHeight();
        }
        return 0;
    }

    @Override
    public final void h1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        sn snVar = this.f36660a;
        if (!snVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (snVar.getParentActivity() != null) {
                if (snVar.f41449a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    gk gkVar = snVar.Y;
                    MessageObject messageObject = t1Var.getMessageObject();
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    qi qiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    pf.c cVar = snVar.Nb;
                    if (cVar != null) {
                        cVar.a(true);
                        snVar.Nb = null;
                    }
                    if (str != null && t1Var.getMessageObject() != null) {
                        qi qiVar2 = new qi(snVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                        snVar.Nb = qiVar2;
                        qiVar = qiVar2;
                    } else {
                        snVar.Nb = null;
                    }
                    gkVar.Z(keyboardButtonProto, messageObject, messageObject2, qiVar);
                }
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = rh.i.a(messageObject);
            boolean a10 = w7.j6.a(a2, 7);
            sn snVar = this.f36660a;
            if (a10) {
                org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                snVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                t1Var.R0(true);
            } else if (snVar.getParentActivity() != null) {
                if (snVar.f41764z2 == null) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(5, snVar.getParentActivity(), snVar.f41654qa, false);
                    snVar.f41764z2 = r40Var;
                    r40Var.setAlpha(0.0f);
                    snVar.f41764z2.setVisibility(4);
                    int indexOfChild = snVar.f41561j1.indexOfChild(snVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    snVar.f41561j1.addView(snVar.f41764z2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i16);
                            float y3 = ((t1Var.getY() + r1Var.f23061b) - AndroidUtilities.dp(4.0f)) - snVar.E9;
                            snVar.C2 = AndroidUtilities.dp(13.3f) + r1Var.f23060a;
                            int D = org.telegram.messenger.sl.D(6.0f, r1Var.f23061b, i12);
                            snVar.D2 = D;
                            if (y3 > 0.0f) {
                                i15 = snVar.C2;
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
                        snVar.f41737x0.v0(0, (int) f7, null);
                        snVar.B2 = t1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                snVar.f41764z2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        sn snVar = this.f36660a;
        if (snVar.getParentActivity() != null) {
            if (snVar.f41570ja == null) {
                vh.i iVar = new vh.i(snVar.getParentActivity());
                snVar.f41570ja = iVar;
                snVar.f41561j1.addView(iVar, w7.z5.e(-1, -1, 48));
            }
            vh.i iVar2 = snVar.f41570ja;
            HashMap hashMap = iVar2.f48889a;
            ArrayList arrayList = iVar2.f48891c;
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
                    long j12 = dialog.f20347id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f20347id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f20347id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20490id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f20347id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f20347id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f20347id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f20347id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f20347id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = vh.i.b(t1Var);
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
                vh.h hVar = new vh.h(iVar2, t1Var, arrayList4, new u2.k0(10, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void i2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f36660a.Z7(t1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void j() {
        d();
    }

    public final boolean k() {
        sn snVar = this.f36660a;
        if (!UserObject.isUserSelf(snVar.f41512f)) {
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
    public final void k1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var != null && document != null) {
            sn snVar = this.f36660a;
            if (snVar.getParentLayout() != null && Z(t1Var)) {
                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(snVar, t1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new s1(this, t1Var, document, 24), false);
                H.f27581t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                G1(t1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            sn snVar = this.f36660a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(snVar)) {
                    sc0 sc0Var = new sc0(3);
                    g6Var2 = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
                    sc0Var.setResourceProvider(g6Var2);
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
                    sc0Var.O0 = false;
                    sc0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    snVar.presentFragment(sc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                ht.o().u(snVar.getParentActivity());
                ht.o().t(new bn(this, tL_messageMediaPoll, pollAnswer, t1Var));
                ht o10 = ht.o();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = t1Var.getMessageObject();
                g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
                o10.r(document4, null, "", null, null, i18, false, messageObject2, g6Var, 200);
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
                    i17 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f46163g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = t1Var.f23659y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            rh.g gVar = t1Var.f23343c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            rh.g gVar2 = t1Var.f23328b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f46162f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = t1Var.f23659y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            rh.g gVar3 = t1Var.f23343c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            rh.g gVar4 = t1Var.f23328b6;
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
                        i16 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, F72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.u1().M2(null, snVar, snVar.f41654qa);
                            PhotoViewer u12 = PhotoViewer.u1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = snVar.f41519f6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = snVar.X6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = snVar.d();
                            }
                            u12.h2(messageObject6, snVar, j10, j11, j12, snVar.Sa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, snVar.getParentActivity(), snVar.f41654qa, false);
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
                    i14 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
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
                    i13 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, F74, false, true));
                    arrayList2.add(-3);
                }
                ag.d.b(tL_messageMediaPoll.poll, snVar.getUserConfig().getClientUserId());
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
                        i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, F75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.u1().M2(null, snVar, snVar.f41654qa);
                    PhotoViewer.u1().d2(arrayList3, i11, snVar.a(), 0L, 0L, snVar.Ta);
                }
            }
        }
    }

    @Override
    public final boolean l0() {
        boolean z10;
        sn snVar = this.f36660a;
        if (!snVar.F9()) {
            z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
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
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        sn snVar = this.f36660a;
        z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
        if (z10 && snVar.V9) {
            h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
            if (h5Var != null) {
                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                ((ActionBarLayout) h5Var2).r();
            }
            return true;
        }
        return !e();
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            f1();
            return;
        }
        sn snVar = this.f36660a;
        if (!snVar.f41740x3 && snVar.f41737x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
            if (snVar.G2 == null) {
                km kmVar = snVar.f41561j1;
                int indexOfChild = kmVar.indexOfChild(snVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(1, snVar.getParentActivity(), snVar.f41654qa, false);
                    snVar.G2 = r40Var;
                    kmVar.addView(r40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    snVar.G2.setAlpha(0.0f);
                    snVar.G2.setVisibility(4);
                } else {
                    return;
                }
            }
            snVar.G2.e(t1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void n() {
        this.f36660a.f41561j1.getClass();
    }

    @Override
    public final void n0(String str) {
        sn snVar = this.f36660a;
        kk kkVar = snVar.f41449a1;
        if (kkVar == null || kkVar.getVisibility() != 0) {
            jk jkVar = snVar.R;
            if ((jkVar == null || jkVar.getVisibility() != 0) && snVar.Y != null && str != null && str.length() > 0) {
                gk gkVar = snVar.Y;
                gkVar.setFieldText("@" + str + " ");
                snVar.Y.F0();
            }
        }
    }

    @Override
    public final void n2() {
        sn snVar = this.f36660a;
        if (snVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", snVar.f41519f6);
            bundle.putInt("start_from", 10);
            snVar.presentFragment(new org.telegram.ui.Components.xa0(bundle, snVar.f41597m1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", snVar.getMessagesController().recommendedChannelsLimitPremium), new om(this, 4))).j();
    }

    public final void o(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z10) {
        sn snVar = this.f36660a;
        TLRPC.Chat chat2 = snVar.e;
        if (chat2 != null && chat.f20343id == chat2.f20343id) {
            hj hjVar = snVar.f41597m1;
            if (hjVar != null && i10 == 0) {
                hjVar.e(false, false);
            } else if (t1Var.getMessageObject() != null) {
                snVar.j(i10, t1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f20343id != chat2.f20343id || snVar.K9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20343id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ri riVar = null;
            if (z10) {
                pf.c cVar = snVar.Nb;
                if (cVar != null) {
                    cVar.a(true);
                    snVar.Nb = null;
                }
                if (t1Var.getMessageObject() == null) {
                    snVar.Nb = null;
                } else {
                    ri riVar2 = new ri(snVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    snVar.Nb = riVar2;
                    riVar = riVar2;
                }
            }
            if (snVar.getMessagesController().checkCanOpenChat(bundle, snVar, t1Var.getMessageObject(), riVar)) {
                sn snVar2 = new sn(bundle);
                if (riVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new ai.vb(this, riVar, chat, i10, snVar2, 18), 5000L);
                    riVar.d();
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
        sn snVar = this.f36660a;
        if (!snVar.getMessagesController().premiumFeaturesBlocked() && a6Var != null && !a6Var.standard) {
            long documentId = a6Var.getDocumentId();
            TLRPC.Document document = a6Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                document = org.telegram.ui.Components.r5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(snVar, snVar.getParentActivity(), snVar.f41654qa, arrayList);
                org.telegram.ui.Components.qv qvVar = awVar.f24856f;
                qvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(qvVar);
                qvVar.v = imageReceiver;
                if (qvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                qvVar.f30016w = true;
                qvVar.f30017x.d(1.0f, true);
                qvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21346m6, 0.2f, true), 0L, null, null, 0);
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
    public final void o2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        sn snVar = this.f36660a;
        ei.x3 x3Var = snVar.M1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (snVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
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
            snVar.M1 = x3Var2;
            x3Var2.f10097l0 = new eh(9, this, x3Var2);
            x3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            snVar.f41561j1.addView(snVar.M1, w7.z5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            snVar.f41561j1.post(new i2.z(this, t1Var, i11, i10, 4));
        }
    }

    @Override
    public final void p(org.telegram.ui.Cells.t1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dn.p(org.telegram.ui.Cells.t1):void");
    }

    @Override
    public final void p1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        vh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        vh.i iVar = this.f36660a.f41570ja;
        if (iVar != null && (hVar = (vh.h) iVar.f48889a.get(vh.i.b(t1Var))) != null) {
            vh.d[] dVarArr = hVar.f48886w;
            RectF rectF = hVar.f48884r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = vh.g.f48871a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.f48871a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.r.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f48878a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        vh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f48850p != z10) {
                            ValueAnimator valueAnimator = dVar.f48848n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f48850p = z10;
                            float f15 = dVar.f48849o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f48848n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f48848n.addUpdateListener(dVar);
                            dVar.f48848n.setInterpolator(vh.f.f48854a);
                            dVar.f48848n.start();
                        }
                        vh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f48847m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f48845k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f48847m = z11;
                            float f16 = dVar2.f48846l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f48845k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f48845k.addUpdateListener(dVar2);
                            dVar2.f48845k.setInterpolator(vh.f.f48854a);
                            dVar2.f48845k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.p9 p2() {
        return this.f36660a.f41632o9;
    }

    @Override
    public final void q() {
        this.f36660a.ec();
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        sn snVar = this.f36660a;
        snVar.L7(t1Var, false, false, f7, f10, true, false, false);
        snVar.f41737x0.getClass();
        sn.d2(snVar, RecyclerView.R(t1Var));
    }

    public final void r(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20490id);
            org.telegram.ui.ActionBar.o2 o2Var = this.f36660a;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var, t1Var.getMessageObject())) {
                o2Var.presentFragment(new sn(bundle));
            }
        }
    }

    @Override
    public final void s(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        qj qjVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            sn snVar = this.f36660a;
            nj njVar = snVar.f41737x0;
            if (njVar != null && (qjVar = snVar.f41762z0) != null && qjVar.f46340y < 0) {
                for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = snVar.f41737x0.getChildAt(childCount);
                    snVar.f41737x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = snVar.Q8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = snVar.Q8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            snVar.yc(primaryMessageObject, false);
            ei.x3 x3Var = snVar.M1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            if (i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
                snVar.f41762z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        int i10;
        long j10;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = t1Var.getMessageObject();
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
        sn snVar = this.f36660a;
        snVar.fa(snVar.e.f20343id, messageObject2, messageObject2.getId(), j11, i11, 0, null);
    }

    public final void u(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20343id);
            bundle.putBoolean("expandPhoto", false);
            this.f36660a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.f36660a;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        boolean z10 = true;
        if (!kVar.s() && !snVar.F9()) {
            if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
                M0(10, t1Var);
                return;
            }
            if (!ChatObject.isForum(snVar.e) && !snVar.K9()) {
                z10 = false;
            }
            v(user, z10);
            return;
        }
        sn.c2(snVar, t1Var, true, f7, f10);
    }

    public final void v(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f20490id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20490id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            sn snVar = this.f36660a;
            TLRPC.User user2 = snVar.f41512f;
            if (user2 != null && user2.f20490id == user.f20490id) {
                i11 = 1;
            }
            profileActivity.Q4(i11);
            Activity parentActivity = snVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            snVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t1 r45, float r46, float r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dn.v0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final boolean v1() {
        sn snVar = this.f36660a;
        if (snVar.f41561j1.getMeasuredWidth() > snVar.f41561j1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        sn snVar = this.f36660a;
        if (UserObject.isBotForum(snVar.f41512f)) {
            return null;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = snVar.getMessagesController().getAdminRank(snVar.e.f20343id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = snVar.f41627o4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f36660a.f41671s.containsKey(messageObject);
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var) {
        sn.U4(this.f36660a, t1Var);
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar = this.f36660a.Qc;
        if (cVar != null && cVar.f46171n == t1Var) {
            cVar.f46174w.getClass();
        }
    }

    @Override
    public final void x1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        h(t1Var, z10, false, false);
    }

    @Override
    public final void y0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.e6 animation;
        sn snVar = this.f36660a;
        if (!snVar.f41740x3 && !SharedConfig.noSoundHintShowed && snVar.f41737x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
            org.telegram.ui.Components.r40 r40Var = snVar.F2;
            if (r40Var == null || r40Var.getTag() == null) {
                if (snVar.F2 == null) {
                    km kmVar = snVar.f41561j1;
                    int indexOfChild = kmVar.indexOfChild(snVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(0, snVar.getParentActivity(), snVar.f41654qa, false);
                        snVar.F2 = r40Var2;
                        r40Var2.setShowingDuration(10000L);
                        kmVar.addView(snVar.F2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        snVar.F2.setAlpha(0.0f);
                        snVar.F2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = snVar.f41737x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = snVar.f41737x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && snVar.F2.e(t1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        sn snVar = this.f36660a;
        if (snVar.getParentActivity() != null && tLObject != null) {
            h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
            if (h5Var != null) {
                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                if (((ActionBarLayout) h5Var2).x()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20343id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f20490id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, snVar.getParentActivity(), snVar.getResourceProvider());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, snVar.getResourceProvider());
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(snVar.getParentActivity(), false, false);
                e1Var.j(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                e1Var.setMinimumWidth(160);
                e1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(snVar.getParentActivity(), false, false);
                e1Var2.j(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, t1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                sn snVar2 = new sn(bundle);
                snVar2.V9 = true;
                snVar.presentFragmentAsPreviewWithMenu(snVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                snVar.g7();
                return;
            }
            snVar.presentFragment(new sn(bundle));
        }
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
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
        b5 b5Var;
        int i17;
        int i18;
        h5 h5Var;
        kk kkVar;
        jk jkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        sn snVar = this.f36660a;
        if (!isEmpty && snVar.e != null && (((kkVar = snVar.f41449a1) == null || kkVar.getVisibility() != 0) && ((jkVar = snVar.R) == null || jkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = snVar.e;
        if (chat2 != null && ((snVar.f41638p4 == 0 || snVar.f41689t4) && (!ChatObject.isChannel(chat2) || snVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = snVar.e;
        if (chat3 != null && chat3.f20343id == chat.f20343id && !snVar.K9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        h5[] h5VarArr = new h5[i12 + 1 + i10 + i11];
        h5VarArr[0] = h5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                h5Var = h5.e;
            } else {
                h5Var = h5.f37737f;
            }
            h5VarArr[1] = h5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            h5VarArr[i13] = h5.f37738n;
            i13++;
        }
        if (i11 != 0) {
            h5VarArr[i13] = h5.f37739r;
        }
        TLRPC.ChatFull chatFull = snVar.getMessagesController().getChatFull(chat.f20343id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
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
            b5Var = new b5(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, h5VarArr, new d5(i14, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            b5Var = b5.a(chat, chatFull, h5VarArr);
            i16 = i11;
            i15 = i12;
            z10 = true;
            z11 = i10;
        }
        if (c2.b.g(b5Var)) {
            c2.b.m().y((ViewGroup) snVar.fragmentView, snVar.f41654qa, b5Var, new e7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(snVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new rm(this, chat, 0), false);
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
        H.l(i17, LocaleController.getString(i18), new s1(this, t1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new rm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new rm(this, chat, 2), i16);
        H.f27581t = false;
        H.f27562i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }
}
