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
import android.os.Build;
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
import org.telegram.messenger.CodeHighlighting;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.UndoView;
public final class nn implements org.telegram.ui.Cells.k1 {
    public final bo f36017a;

    public nn(bo boVar) {
        this.f36017a = boVar;
    }

    public static void a(nn nnVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        bo boVar = nnVar.f36017a;
        if (boVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && boVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                boVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            if (t1Var == null) {
                messageObject = null;
            } else {
                messageObject = t1Var.getMessageObject();
            }
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.isOutOwner();
                tL_message.f18130id = messageObject.getId();
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
                int i12 = tL_message.flags;
                tL_message.flags = i12 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i12 | 768;
                }
                ArrayList arrayList = new ArrayList();
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(boVar.getParentActivity(), boVar.getAccountInstance(), arrayList, new ua(nnVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        bo boVar = this.f36017a;
        if (!boVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(boVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            boVar.getMessagesController().getContentSettings(new y(this, b2Var, t1Var, 5));
            return;
        }
        if (t1Var.getMessageObject() != null) {
            t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        t1Var.h4();
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        bo boVar = this.f36017a;
        if (boVar.getParentActivity() != null && tLObject != null) {
            d5Var = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                if (((ActionBarLayout) d5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18109id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f18256id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, boVar.getParentActivity(), boVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(boVar.getParentActivity(), false, false);
                f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                f1Var.setMinimumWidth(160);
                f1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(boVar.getParentActivity(), false, false);
                f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                f1Var2.setMinimumWidth(160);
                f1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, t1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                bo boVar2 = new bo(bundle);
                boVar2.J9 = true;
                boVar.presentFragmentAsPreviewWithMenu(boVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                boVar.d7();
                return;
            }
            boVar.presentFragment(new bo(bundle));
        }
    }

    @Override
    public final boolean A1() {
        bo boVar = this.f36017a;
        if (boVar.X0.getMeasuredWidth() > boVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        boolean z10;
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        bo boVar = this.f36017a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(boVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(boVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = boVar.getMessagesController().conferenceCallSizeLimit;
                b2Var.setOnCancelListener(new ba(this, boVar.getConnectionsManager().sendRequest(getgroupcall, new ci.kd(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
                b2Var.q(600L);
                return;
            }
            TLRPC.User user = boVar.f32295f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = boVar.f32239a8;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.f2.m(user, isVideoCall, z10, boVar.getParentActivity(), boVar.getMessagesController().getUserFull(boVar.f32295f.f18256id), boVar.getAccountInstance());
                return;
            }
            return;
        }
        boVar.I7(t1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void C1(org.telegram.ui.Cells.t1 t1Var) {
        bo.U4(this.f36017a, t1Var);
    }

    @Override
    public final void D0(org.telegram.ui.Cells.t1 t1Var) {
        l(t1Var, true, false, true);
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        l(t1Var, z10, false, false);
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int dp;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i13 = buttonCustom.f15587id;
            TL_stars.StarsAmount starsAmount = null;
            bo boVar = this.f36017a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                nf nfVar = new nf(8, this, message);
                Pattern pattern = org.telegram.ui.Components.c5.f22944a;
                Activity parentActivity = boVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                editText.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.i6.S(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.r4(parentActivity)});
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new x5(21, nfVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b2Var.N = new org.telegram.ui.Components.p1(editText, 0);
                frameLayout.addView(editText, w7.x5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ng(editText, 3), 100L);
                boVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, boVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, boVar.e, 5);
                    }
                    ai.s4 s4Var = new ai.s4(this, message, canManageMonoForum, messageObject, 11);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    boVar.g7(s4Var, zf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                boVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                boVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        bo boVar = this.f36017a;
        boVar.f32529xa.l(t1Var, boVar, true);
        boVar.f32519x0.I0(false);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            bo boVar = this.f36017a;
            if ((boVar.f32503vb != id2 || boVar.f32517wb != 7) && (inputPeer = boVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f18327id = id2;
                nf.e eVar = boVar.f32555zb;
                if (eVar != null) {
                    eVar.a(true);
                    boVar.f32555zb = null;
                }
                aj ajVar = new aj(boVar, id2, t1Var, 2);
                ajVar.f15208b = new l4(24, boVar, r3);
                boVar.f32555zb = ajVar;
                ajVar.d();
                int[] iArr = {boVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new mg(boVar, ajVar, iArr, t1Var, messageObject))};
            }
        }
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
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
        x4 x4Var;
        int i17;
        int i18;
        d5 d5Var;
        rk rkVar;
        qk qkVar;
        if (!m()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        bo boVar = this.f36017a;
        if (!isEmpty && boVar.e != null && (((rkVar = boVar.O0) == null || rkVar.getVisibility() != 0) && ((qkVar = boVar.R) == null || qkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = boVar.e;
        if (chat2 != null && ((boVar.f32275d4 == 0 || boVar.f32323h4) && (!ChatObject.isChannel(chat2) || boVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = boVar.e;
        if (chat3 != null && chat3.f18109id == chat.f18109id && !boVar.F9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        d5[] d5VarArr = new d5[i12 + 1 + i10 + i11];
        d5VarArr[0] = d5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                d5Var = d5.e;
            } else {
                d5Var = d5.f32933f;
            }
            d5VarArr[1] = d5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            d5VarArr[i13] = d5.f32934n;
            i13++;
        }
        if (i11 != 0) {
            d5VarArr[i13] = d5.f32935r;
        }
        TLRPC.ChatFull chatFull = boVar.getMessagesController().getChatFull(chat.f18109id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
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
            x4Var = new x4(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, d5VarArr, new z4(i14, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            x4Var = x4.a(chat, chatFull, d5VarArr);
            z11 = i10;
            i16 = i11;
            i15 = i12;
            z10 = true;
        }
        if (com.google.firebase.messaging.m.e(x4Var)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) boVar.fragmentView, boVar.f32293ea, x4Var, new b7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(boVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new bn(this, chat, 0), false);
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
        H.l(i17, LocaleController.getString(i18), new q1(this, t1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new bn(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new bn(this, chat, 2), i16);
        H.f26368t = false;
        H.f26349i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void H1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        bo boVar = this.f36017a;
        if (!boVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (boVar.getParentActivity() != null) {
                if (boVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) boVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) boVar.f32293ea, false);
                        f3Var.fixNavigationBar();
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        f3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        lg.j jVar = new lg.j(3, boVar, str);
                        f3Var.items = charSequenceArr;
                        f3Var.onClickListener = jVar;
                        boVar.showDialog(f3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        boVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.vl.p(R.string.CodeCopied, org.telegram.ui.Components.vc.a0(this.f36017a));
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        bo boVar = this.f36017a;
        boVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        boVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        l(t1Var, true, false, true);
    }

    @Override
    public final boolean I1() {
        bo boVar = this.f36017a;
        if (boVar.X0.getKeyboardHeight() + boVar.f32413oa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        bo boVar = this.f36017a;
        boVar.f32276d5 = messageObject;
        boVar.d9();
    }

    @Override
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f36017a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        bo boVar = this.f36017a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (boVar.T5 != j3) {
                boVar.presentFragment(bo.R9(j3));
            } else {
                boVar.f32233a1.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            boVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final boolean M0(long j3) {
        bo boVar = this.f36017a;
        TLRPC.Chat chat = boVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return boVar.getMessagesController().isOwner(boVar.e.f18109id, j3);
        }
        return false;
    }

    @Override
    public final void M1(MessageObject messageObject) {
        this.f36017a.f32454s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f36017a.fb(messageObject, true);
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j3;
        int i10;
        ArrayList<MessageObject> arrayList;
        a3.h0 h0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        bo boVar = this.f36017a;
        uh.j jVar = boVar.X9;
        if (jVar != null) {
            HashMap hashMap = jVar.f43801a;
            uh.h hVar = (uh.h) hashMap.get(uh.j.b(t1Var));
            org.telegram.ui.Components.oc ocVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            uh.h hVar2 = (uh.h) boVar.X9.f43801a.get(uh.j.b(t1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j3 = hVar2.f43795w[i11].d;
            } else {
                j3 = 0;
            }
            if (messageObject != null && j3 != 0) {
                Activity parentActivity = boVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.c5.h(parentActivity, i10, j3, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) boVar.f32525x6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.y0.k(messageObject);
                    }
                    if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j10 = j3;
                    a3.h0 h0Var2 = new a3.h0(this, arrayList, j10, 15);
                    if (z10) {
                        h0Var2.run();
                        h0Var = null;
                    } else {
                        h0Var = h0Var2;
                    }
                    ocVar = org.telegram.ui.Components.vc.v(boVar.getParentActivity(), boVar, null, 1, j10, 1, boVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), boVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, false, h0Var);
                    ocVar.f26752k = true;
                    ocVar.k(ocVar.e instanceof org.telegram.ui.Components.zb);
                }
            }
            uh.h hVar3 = (uh.h) hashMap.get(uh.j.b(t1Var));
            if (hVar3 != null) {
                if (ocVar == null) {
                    hVar3.R = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.sb sbVar = ocVar.e;
                if (!(sbVar instanceof org.telegram.ui.Components.wb)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) sbVar;
                hVar3.W = wbVar;
                wbVar.f29678a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new hm(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        jn jnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && nf.f.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        bo boVar = this.f36017a;
        nf.e eVar = boVar.f32555zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (t1Var.getMessageObject() == null) {
            jnVar = null;
        } else {
            jnVar = new jn(this, t1Var);
        }
        boVar.f32555zb = jnVar;
        if (!z11 && !nf.f.f(parse, false, null)) {
            org.telegram.ui.Components.c5.r0(boVar, str, true, true, true, !z11, boVar.f32555zb, webPage, boVar.f32293ea);
        } else {
            nf.f.r(boVar.getParentActivity(), parse, true, true, false, boVar.f32555zb, null, false, true, false);
        }
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        bo boVar = this.f36017a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!t1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(boVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!boVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.vc.a0(boVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new ym(this, 9))).k(true);
            return false;
        } else {
            boVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(boVar.e, boVar.Z7, true), t1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final CharacterStyle O1(org.telegram.ui.Cells.t1 t1Var) {
        bo boVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (boVar = this.f36017a).f32503vb) != 0 && i10 == t1Var.getMessageObject().getId() && boVar.f32517wb == 1) {
            return boVar.f32530xb;
        }
        return null;
    }

    @Override
    public final boolean P() {
        bo boVar = this.f36017a;
        if (boVar.W5[1].size() + boVar.W5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
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
        gn gnVar = null;
        gn gnVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        gn gnVar3 = null;
        gn gnVar4 = null;
        bo boVar = this.f36017a;
        if (i10 == 19) {
            nf.e eVar = boVar.f32555zb;
            if (eVar != null) {
                eVar.a(true);
            }
            if (t1Var.getMessageObject() != null) {
                gnVar2 = new gn(this, t1Var, 2);
            }
            final gn gnVar5 = gnVar2;
            boVar.f32555zb = gnVar5;
            final Activity parentActivity = boVar.getParentActivity();
            final org.telegram.ui.ActionBar.e6 resourceProvider = boVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            gnVar5.d();
            gnVar5.f15208b = new tg.f(atomicBoolean, 0);
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
            final String b10 = tg.k.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.messageOwner.date * 1000;
            tg.t.d(messageObject, new Utilities.Callback(atomicBoolean, gnVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f43138a;
                public final nf.e f43139b;
                public final boolean f43140c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f43141f;
                public final e6 f43142g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f43141f = parentActivity;
                    this.f43142g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f43138a.get()) {
                        this.f43139b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f43140c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f43141f;
                        e6 e6Var = this.f43142g;
                        if (z12) {
                            k.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            k.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        }
                    }
                }
            }, new tg.h(atomicBoolean, gnVar5, 0));
        } else if (i10 == 21) {
            g();
        } else if (i10 == 84) {
            boVar.ua(t1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.pg0.O;
            if (boVar.getParentActivity() != null) {
                boVar.showDialog(new org.telegram.ui.Components.pg0(boVar.getContext(), boVar.getCurrentAccount(), messageObject, boVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    boVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                user = MessagesController.getInstance(i14).getUser(Long.valueOf(j10));
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
                bundle.putLong("user_id", user.f18256id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                boVar.presentFragment(new ProfileActivity(bundle, null));
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
                boVar.showDialog(new org.telegram.ui.Components.pe0(boVar, null, user, null, file, gf.b.d(str, false), str3, str4, boVar.f32293ea));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            boVar.presentFragment(new bo(w.c.e(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.vl.h(new StringBuilder("+"), user2.phone, gf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = gf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f18256id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                boVar.presentFragment(new ss(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                boVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    nf.e eVar2 = boVar.f32555zb;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        gnVar3 = new gn(this, t1Var, 4);
                    }
                    boVar.f32555zb = gnVar3;
                    nf.f.r(boVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, boVar.f32555zb, null, false, boVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            boVar.getOrCreateStoryViewer().F(boVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ai.u9.a(boVar.f32519x0));
                            return;
                        }
                    }
                }
                if (!boVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
                    nf.e eVar3 = boVar.f32555zb;
                    if (eVar3 != null) {
                        eVar3.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        gnVar4 = new gn(this, t1Var, 5);
                    }
                    boVar.f32555zb = gnVar4;
                    nf.f.r(boVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, boVar.f32555zb, null, false, true, false);
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
                nf.e eVar4 = boVar.f32555zb;
                if (eVar4 != null) {
                    eVar4.a(true);
                }
                if (t1Var.getMessageObject() != null) {
                    gnVar = new gn(this, t1Var, 3);
                }
                boVar.f32555zb = gnVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        boVar.f32555zb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                        boVar.f32555zb.f15208b = new ai.n8(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ci.u3(4, this, z11)), 26);
                        return;
                    }
                }
                nf.f.r(boVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, boVar.f32555zb, null, false, true, false);
            }
        }
    }

    @Override
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            bo boVar = this.f36017a;
            org.telegram.ui.Components.vu.J(boVar, messageObject, boVar.Fa, str2, str3, str4, str, i10, i11, -1, boVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var != null) {
            bo boVar = this.f36017a;
            if (boVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(boVar.e);
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
    public final boolean Q1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        se seVar;
        a3.h0 h0Var;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        ci.n6 n6Var;
        int i10;
        boolean z11;
        int i11;
        g51 g51Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f36017a.A0.L();
                    bo boVar = this.f36017a;
                    return mediaController.setPlaylist(L, messageObject, boVar.L6, true ^ boVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f36017a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            i51 i51Var = this.f36017a.Z9;
            if (i51Var == null || i51Var.f34415b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.vc.a0(this.f36017a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f36017a.Z9 = new i51(this.f36017a.getParentActivity());
                i51 i51Var2 = this.f36017a.Z9;
                if (!messageObject.isOutOwner()) {
                    seVar = this.f36017a.fb(messageObject, true);
                } else {
                    seVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    h0Var = bo.O4(this.f36017a, messageObject);
                } else {
                    h0Var = null;
                }
                Context context = i51Var2.f34412a;
                ci.n6 n6Var2 = i51Var2.f34416c;
                i51Var2.X = seVar;
                i51Var2.Y = h0Var;
                g51 g51Var2 = i51Var2.N;
                if (g51Var2 != null) {
                    n6Var2.removeView(g51Var2);
                    i51Var2.N = null;
                }
                i51Var2.O = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                i51Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i51Var2.S = z10;
                org.telegram.ui.Cells.t1 t1Var2 = i51Var2.O;
                if (t1Var2 != null) {
                    e6Var = t1Var2.getResourcesProvider();
                } else {
                    e6Var = null;
                }
                i51Var2.L = e6Var;
                if (i51Var2.O != null) {
                    i51Var2.T = 0.0f;
                    i51Var2.U = t1Var.f21138n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        i51Var2.T = view.getY() + i51Var2.T;
                        i51Var2.U = view.getY() + i51Var2.U;
                    }
                    int width = i51Var2.O.getWidth();
                    int height = i51Var2.O.getHeight();
                    if (i51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    i51Var2.K = i14 - i51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    n6Var = n6Var2;
                    g51 g51Var3 = new g51(i51Var2, i51Var2.getContext(), UserConfig.selectedAccount, i51Var2.O.getResourcesProvider(), width, i14);
                    i51Var2.N = g51Var3;
                    i51Var2.O.j1(g51Var3);
                    i51Var2.N.i1(i51Var2.O);
                    i51Var2.N.setDelegate(new Object());
                    g51 g51Var4 = i51Var2.N;
                    MessageObject messageObject3 = i51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = i51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = i51Var2.O;
                    g51Var4.X3(messageObject3, currentMessagesGroup, t1Var3.F, t1Var3.E, false, false);
                    if (!i51Var2.S) {
                        org.telegram.ui.Components.i8 i8Var = new org.telegram.ui.Components.i8();
                        i51Var2.V = i8Var;
                        g51 g51Var5 = i51Var2.N;
                        i8Var.f24949i = g51Var5;
                        g51Var5.f21025ee = i8Var;
                        if (g51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.io0 seekBarWaveform = i51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = i51Var2.f34423s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.f25100n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    i51Var2.H = false;
                    n6Var.addView(i51Var2.N, new FrameLayout.LayoutParams(i51Var2.O.getWidth(), i14, 17));
                } else {
                    n6Var = n6Var2;
                    i10 = 360;
                }
                TextureView textureView = i51Var2.P;
                if (textureView != null) {
                    n6Var.removeView(textureView);
                    i51Var2.P = null;
                }
                if (i51Var2.S) {
                    i51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    i51Var2.P = textureView2;
                    n6Var.addView(textureView2, 0, w7.x5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.g71 g71Var = i51Var2.f34424w;
                if (g71Var != null) {
                    g71Var.B();
                    i51Var2.f34424w.H();
                    i51Var2.f34424w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = i51Var2.O;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(i51Var2.O.getMessageObject().currentAccount).getPathToAttach(i51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(i51Var2.O.getMessageObject().currentAccount).getPathToMessage(i51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && i51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(i51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.g71 g71Var2 = new org.telegram.ui.Components.g71();
                        i51Var2.f34424w = g71Var2;
                        g71Var2.J = new h51(i51Var2);
                        if (i51Var2.V != null) {
                            g71Var2.K = new h51(i51Var2);
                        }
                        if (i51Var2.S) {
                            g71Var2.V(i51Var2.P);
                        }
                        i51Var2.f34424w.D(Uri.fromFile(pathToAttach), "other");
                        i51Var2.f34424w.C();
                        org.telegram.ui.Components.jt jtVar = i51Var2.E;
                        if (jtVar != null) {
                            jtVar.f25412s = i51Var2.f34424w;
                            jtVar.a();
                        }
                    }
                    bo boVar2 = this.f36017a;
                    boVar2.showDialog(boVar2.Z9);
                    return false;
                }
                ci.f4 f4Var = i51Var2.f34425x;
                if (f4Var != null) {
                    n6Var.removeView(f4Var);
                    i51Var2.f34425x = null;
                }
                MessageObject messageObject4 = i51Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = i51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(i51Var2.M.currentAccount).getClientUserId()) {
                    ci.f4 f4Var2 = new ci.f4(context, 3);
                    i51Var2.f34425x = f4Var2;
                    f4Var2.p(true);
                    if (z11) {
                        long dialogId = i51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(i51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        ci.f4 f4Var3 = i51Var2.f34425x;
                        if (i51Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        f4Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ci.f4 f4Var4 = i51Var2.f34425x;
                        if (i51Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        f4Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    i51Var2.f34425x.q(12.0f);
                    ci.f4 f4Var5 = i51Var2.f34425x;
                    if (!z11 && !i51Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    f4Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (i51Var2.S) {
                        i51Var2.f34425x.m(0.5f, 0.0f);
                        i51Var2.f34425x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        i51Var2.f34425x.m(0.0f, AndroidUtilities.dp(34.0f));
                        i51Var2.f34425x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    i51Var2.f34425x.t(14.0f);
                    ci.f4 f4Var6 = i51Var2.f34425x;
                    f4Var6.h = ci.f4.a(f4Var6.getText(), i51Var2.f34425x.getTextPaint());
                    if (i51Var2.S) {
                        n6Var.addView(i51Var2.f34425x, w7.x5.d((int) ((i51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((i51Var2.O.getHeight() + i51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        n6Var.addView(i51Var2.f34425x, w7.x5.d((int) ((i51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((i51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + i51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((i51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    i51Var2.f34425x.u();
                }
                TextView textView = i51Var2.f34426y;
                if (textView != null) {
                    n6Var.removeView(textView);
                    i51Var2.f34426y = null;
                }
                TextView textView2 = new TextView(context);
                i51Var2.f34426y = textView2;
                textView2.setTextColor(-1);
                i51Var2.f34426y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    i51Var2.f34426y.setBackground(org.telegram.ui.ActionBar.i6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    i51Var2.f34426y.setBackground(org.telegram.ui.ActionBar.i6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                i51Var2.f34426y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.z5.a(i51Var2.f34426y);
                TextView textView3 = i51Var2.f34426y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                i51Var2.f34426y.setOnClickListener(new e51(i51Var2, 1));
                n6Var.addView(i51Var2.f34426y, w7.x5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (g51Var = i51Var2.N) != null && g51Var.getMessageObject() != null && i51Var2.N.getMessageObject().messageOwner != null) {
                    i51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    i51Var2.N.invalidate();
                }
                bo boVar22 = this.f36017a;
                boVar22.showDialog(boVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean R() {
        bo boVar = this.f36017a;
        if (!UserObject.isReplyUser(boVar.f32295f) && !UserObject.isUserSelf(boVar.f32295f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        bo boVar = this.f36017a;
        boVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, boVar);
    }

    @Override
    public final void R1() {
        org.telegram.ui.ActionBar.e6 e6Var;
        bo boVar = this.f36017a;
        if (boVar.X0 != null && boVar.getParentActivity() != null) {
            Context context = boVar.X0.getContext();
            e6Var = ((org.telegram.ui.ActionBar.n2) boVar).resourceProvider;
            i41.T(context, boVar, false, e6Var, null);
        }
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        bo boVar = this.f36017a;
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        if (!kVar.s() && !boVar.A9()) {
            if (!z10 && chat.signature_profiles && (messageObject = t1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                boVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                q(t1Var, chat, i10, z10);
                return;
            }
        }
        bo.b2(boVar, t1Var, true, f7, f10);
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
        l(t1Var, true, true, false);
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        aj ajVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        qg.v vVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            bo boVar = this.f36017a;
            nf.e eVar = boVar.f32555zb;
            if (eVar != null) {
                eVar.a(true);
                boVar.f32555zb = null;
            }
            if (t1Var.getMessageObject() == null) {
                boVar.f32555zb = null;
                ajVar = null;
            } else {
                ajVar = new aj(boVar, t1Var.getMessageObject().getId(), t1Var, 1);
                boVar.f32555zb = ajVar;
            }
            i10 = ((org.telegram.ui.ActionBar.n2) this.f36017a).currentAccount;
            yh.u5 y3 = yh.u5.y(i10, false);
            Objects.requireNonNull(ajVar);
            dj djVar = new dj(ajVar, 7);
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.e6 I = yh.u5.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f47801a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject p5 = ei.k3.p(I, false);
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                vVar = new qg.v(y3, ConnectionsManager.getInstance(y3.f47801a).sendRequest(tL_payments_getPaymentForm, new ai.p3(y3, messageObject, tL_inputInvoiceMessage, djVar, 19)), 5);
            }
            if (vVar != null) {
                ajVar.f15208b = vVar;
                ajVar.d();
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
                    TLRPC.TL_message C7 = bo.C7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        C7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        C7.attachPath = message.attachPath;
                    }
                    C7.media = tL_messageExtendedMedia.media;
                    C7.noforwards = true;
                    arrayList.add(new MessageObject(messageObject.currentAccount, C7, false, true));
                }
            }
            if (i11 > -1 && !arrayList.isEmpty()) {
                PhotoViewer t12 = PhotoViewer.t1();
                bo boVar2 = this.f36017a;
                t12.J2(null, boVar2, boVar2.f32293ea);
                PhotoViewer.t1().a2(arrayList, i11, this.f36017a.a(), 0L, 0L, this.f36017a.Ga);
            }
        }
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        bo boVar = this.f36017a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            rg.k1 k1Var = new rg.k1(boVar, i10, user, null, null, boVar.f32293ea);
            t1Var.getLocationOnScreen(new int[2]);
            k1Var.f42360v0 = t1Var.getNameStatusX();
            k1Var.f42361w0 = t1Var.getNameStatusY();
            k1Var.f42364z0 = t1Var.getScaleX();
            k1Var.f42362x0 = t1Var.getLeft();
            k1Var.f42363y0 = t1Var.getTop();
            k1Var.A0 = t1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
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
                k1Var.f42359u0 = num;
            } else {
                k1Var.f42359u0 = Integer.valueOf(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19091r8[colorId]));
            }
            org.telegram.ui.Components.m5 m5Var = t1Var.f21038fc;
            if (m5Var != null && (m5Var.f26072f[0] instanceof org.telegram.ui.Components.o5)) {
                k1Var.f42364z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(boVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f);
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
                    u9Var.setLayerNum(7);
                    u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    u9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = k1Var.f42359u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = boVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19163v6);
                        }
                        u9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        k1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        k1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    k1Var.B0 = u9Var;
                    k1Var.E0 = true;
                }
            }
            boVar.showDialog(k1Var);
            return;
        }
        nf.f.s(boVar.getParentActivity(), "https://" + boVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final int V() {
        return this.f36017a.R3;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.f36017a.U7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.t1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nn.V1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null) {
            bo boVar = this.f36017a;
            if (!boVar.f32343ic && messageObject.getId() == boVar.f32330hc) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - boVar.f32355jc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void X0(org.telegram.ui.Cells.t1 t1Var) {
        bo boVar = this.f36017a;
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(boVar.T5), t1Var);
    }

    @Override
    public final hh.a Y() {
        return this.f36017a.Pb;
    }

    @Override
    public final pv0 Y1() {
        return this.f36017a.f32516wa;
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
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
            bo boVar = this.f36017a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = boVar.f32519x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = boVar.f32519x0.getChildAt(i11);
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
            boVar.Jb(messageObject, spannableStringBuilder, 1);
            t1Var.g4(1, false, true);
        }
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null) {
            messageObject = null;
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            bo boVar = this.f36017a;
            if (boVar.R3 != 1 && !boVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a2(long j3) {
        bo boVar = this.f36017a;
        TLRPC.Chat chat = boVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return boVar.getMessagesController().isAdmin(boVar.e.f18109id, j3);
        }
        return false;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        bo boVar = this.f36017a;
        mk mkVar = boVar.Y;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
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
                boVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new ym(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        x4 b10;
        int i11;
        rk rkVar;
        qk qkVar;
        if (!m()) {
            return false;
        }
        bo boVar = this.f36017a;
        if (boVar.e != null && (((rkVar = boVar.O0) == null || rkVar.getVisibility() != 0) && ((qkVar = boVar.R) == null || qkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = boVar.e;
        if (chat != null && ((boVar.f32275d4 == 0 || boVar.f32323h4) && (!ChatObject.isChannel(chat) || boVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c10 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.f32934n;
            c10 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c10] = d5.f32935r;
        }
        TLRPC.UserFull userFull = boVar.getMessagesController().getUserFull(user.f18256id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        } else {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) boVar.fragmentView, boVar.f32293ea, b10, new b7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(boVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final nn f31858b;

            {
                this.f31858b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f31858b.y(user, false);
                        return;
                    case 1:
                        this.f31858b.c(user);
                        return;
                    default:
                        this.f31858b.f36017a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new q1(this, t1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final nn f31858b;

            {
                this.f31858b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f31858b.y(user, false);
                        return;
                    case 1:
                        this.f31858b.c(user);
                        return;
                    default:
                        this.f31858b.f36017a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final nn f31858b;

            {
                this.f31858b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f31858b.y(user, false);
                        return;
                    case 1:
                        this.f31858b.c(user);
                        return;
                    default:
                        this.f31858b.f36017a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f26368t = false;
        H.f26349i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.t1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nn.b2(org.telegram.ui.Cells.t1, int, float, float, boolean):void");
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        bo boVar = this.f36017a;
        mk mkVar = boVar.Y;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(w.c.g(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.p51("" + user.f18256id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            boVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new ym(this, 7), 200L);
        }
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        bo boVar = this.f36017a;
        if (boVar.f32503vb != 0 && t1Var.getMessageObject() != null && boVar.f32503vb == t1Var.getMessageObject().getId() && boVar.f32517wb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.t1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nn.c2(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        bo boVar = this.f36017a;
        boVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(boVar.getParentActivity()) && (chat = boVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == boVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == boVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = boVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) boVar).resourceProvider;
                org.telegram.ui.Components.b01.b(parentActivity, i10, -boVar.e.f18109id, currentUser, str2, z15, z16, z12, e6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == boVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(boVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                boVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(boVar.e);
                tL_channels_getParticipant.participant = boVar.getMessagesController().getInputPeer(currentUser.f18256id);
                boVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new ai.m0(7, this, t1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = boVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            e6Var = ((org.telegram.ui.ActionBar.n2) boVar).resourceProvider;
            org.telegram.ui.Components.b01.b(parentActivity2, i10, -boVar.e.f18109id, currentUser, str2, z152, z162, z12, e6Var);
        }
    }

    @Override
    public final void d0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        bo boVar = this.f36017a;
        try {
            if (i10 == 0) {
                boVar.h7();
                jl jlVar = boVar.f32547z3;
                if (jlVar != null) {
                    jlVar.l(0L, 84, null, new ym(this, 1));
                    boVar.f32547z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(boVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (boVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.e31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.e31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.vc.a0(boVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                boVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(boVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", boVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new ym(this, 2));
                } else if (boVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new ym(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), a02.f28687c);
                wbVar.c(i13, 36, 36, new String[0]);
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
                wbVar.f29679b.setText(append2);
                wbVar.f29679b.setSingleLine(false);
                wbVar.f29679b.setMaxLines(6);
                a02.b(wbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        bo boVar = this.f36017a;
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            if (!kVar2.s() && !boVar.A9()) {
                z10 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
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
        if (this.f36017a.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        bo boVar = this.f36017a;
        if (AndroidUtilities.isContextSafe(boVar.getParentActivity()) && (chat = boVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(t1Var, boVar.getMessagesController().getParticipant(boVar.e.f18109id, currentUser.f18256id));
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        this.f36017a.I7(t1Var, true, false, f7, f10, false, false, false);
    }

    public final void g() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        bo boVar = this.f36017a;
        if (isHuaweiStoreApp) {
            nf.f.s(boVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(boVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void g2(org.telegram.ui.Cells.t1 t1Var, long j3) {
        Bundle e = w.c.e(j3, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.f36017a;
        if (n2Var.getMessagesController().checkCanOpenChat(e, n2Var, t1Var.getMessageObject())) {
            n2Var.presentFragment(new bo(e));
        }
    }

    @Override
    public final String h(org.telegram.ui.Cells.t1 t1Var) {
        bo boVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (boVar = this.f36017a).f32503vb) != 0 && i10 == t1Var.getMessageObject().getId() && boVar.f32517wb == 3) {
            return boVar.f32542yb;
        }
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        qh.c cVar;
        bo boVar = this.f36017a;
        if (boVar.f32504vc.f13973f && (cVar = boVar.Bc) != null && cVar.f41752n == t1Var && cVar.f41748a.getWidth() > 0) {
            return boVar.Bc.f41748a.getHeight();
        }
        return 0;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        nm nmVar;
        long dialogId = messageObject.getDialogId();
        bo boVar = this.f36017a;
        if ((dialogId == 1271266957 || ((nmVar = boVar.A0) != null && nmVar.N)) && boVar.R3 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, bi.f fVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f36017a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
            return;
        }
        fVar.run();
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        bo boVar = this.f36017a;
        if (boVar.getParentActivity() != null) {
            if (boVar.X9 == null) {
                uh.j jVar = new uh.j(boVar.getParentActivity());
                boVar.X9 = jVar;
                boVar.X0.addView(jVar, w7.x5.e(-1, -1, 48));
            }
            uh.j jVar2 = boVar.X9;
            HashMap hashMap = jVar2.f43801a;
            ArrayList arrayList = jVar2.f43803c;
            arrayList.clear();
            int i10 = jVar2.d;
            UserConfig userConfig = UserConfig.getInstance(i10);
            long j3 = userConfig.clientUserId;
            arrayList.add(Long.valueOf(j3));
            if (userConfig.suggestContacts) {
                ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i10).hints;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                    long j10 = tL_topPeer2.peer.user_id;
                    if (j10 != 0) {
                        int i12 = size;
                        if (MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j10));
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
                    long j11 = dialog.f18113id;
                    if (j11 != j3 && !DialogObject.isEncryptedDialog(j11)) {
                        if (DialogObject.isUserDialog(dialog.f18113id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f18113id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f18256id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f18113id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f18113id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f18113id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f18113id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f18113id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = uh.j.b(t1Var);
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
                uh.h hVar = new uh.h(jVar2, t1Var, arrayList4, new uh.i(0, jVar2, b10));
                hVar.setBounds(0, 0, jVar2.getMeasuredWidth(), jVar2.getMeasuredHeight());
                hVar.setCallback(jVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void j(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = qh.i.a(messageObject);
            boolean a10 = w7.c0.a(a2, 7);
            bo boVar = this.f36017a;
            if (a10) {
                org.telegram.ui.Components.vc.a0(boVar).Q(R.raw.e_hand_2, 36, qh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                boVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                t1Var.S0(true);
            } else if (boVar.getParentActivity() != null) {
                if (boVar.f32395n2 == null) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(5, boVar.getParentActivity(), boVar.f32293ea, false);
                    boVar.f32395n2 = i40Var;
                    i40Var.setAlpha(0.0f);
                    boVar.f32395n2.setVisibility(4);
                    int indexOfChild = boVar.X0.indexOfChild(boVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    boVar.X0.addView(boVar.f32395n2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i16);
                            float y3 = ((t1Var.getY() + r1Var.f20636b) - AndroidUtilities.dp(4.0f)) - boVar.f32464s9;
                            boVar.f32430q2 = AndroidUtilities.dp(13.3f) + r1Var.f20635a;
                            int D = org.telegram.messenger.vl.D(6.0f, r1Var.f20636b, i12);
                            boVar.f32443r2 = D;
                            if (y3 > 0.0f) {
                                i15 = boVar.f32430q2;
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
                        boVar.f32519x0.v0(0, (int) f7, null);
                        boVar.f32418p2 = t1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                boVar.f32395n2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void k() {
        g();
    }

    @Override
    public final void k1() {
        bo boVar = this.f36017a;
        boVar.Q7();
        UndoView undoView = boVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, boVar.T5, null);
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        xj xjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        bo boVar = this.f36017a;
        uj ujVar = boVar.f32519x0;
        if (ujVar != null && (xjVar = boVar.f32544z0) != null && xjVar.f42668y < 0) {
            for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = boVar.f32519x0.getChildAt(childCount);
                boVar.f32519x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = boVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i11 = boVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                xj xjVar2 = boVar.f32544z0;
                boVar.f32519x0.getClass();
                xjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) boVar.f32464s9), false);
            } else {
                boVar.f32544z0.h1(i10, i11);
            }
        }
        boVar.N0 = z11;
        boVar.rc(primaryMessageObject, false);
        boVar.N0 = false;
    }

    @Override
    public final boolean l0() {
        boolean z10;
        bo boVar = this.f36017a;
        if (!boVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var != null && pageBlock != null) {
            bo boVar = this.f36017a;
            if (boVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.J2(null, boVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new wm(boVar, arrayList), null, 0L, 0L, 0L, true, new vm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean m() {
        bo boVar = this.f36017a;
        if (!UserObject.isUserSelf(boVar.f32295f)) {
            TLRPC.Chat chat = boVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !boVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void m1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        bo boVar = this.f36017a;
        if (!boVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (boVar.getParentActivity() != null) {
                if (boVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    mk mkVar = boVar.Y;
                    MessageObject messageObject = t1Var.getMessageObject();
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    zi ziVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    nf.e eVar = boVar.f32555zb;
                    if (eVar != null) {
                        eVar.a(true);
                        boVar.f32555zb = null;
                    }
                    if (str != null && t1Var.getMessageObject() != null) {
                        zi ziVar2 = new zi(boVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                        boVar.f32555zb = ziVar2;
                        ziVar = ziVar2;
                    } else {
                        boVar.f32555zb = null;
                    }
                    mkVar.d0(keyboardButtonProto, messageObject, messageObject2, ziVar);
                }
            }
        }
    }

    @Override
    public final void m2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f36017a.rc(primaryMessageObject, false);
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        long j3;
        long j10;
        int i17;
        boolean z10;
        boolean z11;
        int i18;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                N1(t1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            bo boVar = this.f36017a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(boVar)) {
                    id0 id0Var = new id0(3);
                    e6Var2 = ((org.telegram.ui.ActionBar.n2) boVar).resourceProvider;
                    id0Var.setResourceProvider(e6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = boVar.getMessagesController().getPeer(boVar.a());
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
                    id0Var.O0 = false;
                    id0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    boVar.presentFragment(id0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                st.q().w(boVar.getParentActivity());
                st.q().v(new ln(this, tL_messageMediaPoll, pollAnswer, t1Var));
                st q6 = st.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = t1Var.getMessageObject();
                e6Var = ((org.telegram.ui.ActionBar.n2) boVar).resourceProvider;
                q6.t(document4, null, "", null, null, i18, false, messageObject2, e6Var, 200);
            } else {
                long j11 = 0;
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
                    TLRPC.TL_message C7 = bo.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = qh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    MessageObject messageObject3 = new MessageObject(i17, C7, false, true);
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
                    i15 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    qh.a aVar = new qh.a(i15, messageObject, document6, qh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f41744g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = t1Var.f21305y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            qh.g gVar = t1Var.f20990c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            qh.g gVar2 = t1Var.f20976b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f41743f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = t1Var.f21305y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            qh.g gVar3 = t1Var.f20990c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            qh.g gVar4 = t1Var.f20976b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = bo.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = qh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().J2(null, boVar, boVar.f32293ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j3 = boVar.T5;
                            } else {
                                j3 = 0;
                            }
                            if (i19 != 0) {
                                j10 = boVar.L6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = boVar.d();
                            }
                            t12.c2(messageObject6, boVar, j3, j10, j11, boVar.Fa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, boVar.getParentActivity(), boVar.f32293ea, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            boVar.z6(messageObject6);
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
                    TLRPC.TL_message C73 = bo.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = qh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = bo.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = qh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                zf.d.b(tL_messageMediaPoll.poll, boVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message C75 = bo.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = qh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().J2(null, boVar, boVar.f32293ea);
                    PhotoViewer.t1().a2(arrayList3, i11, boVar.a(), 0L, 0L, boVar.Ga);
                }
            }
        }
    }

    @Override
    public final void n0(String str) {
        bo boVar = this.f36017a;
        rk rkVar = boVar.O0;
        if (rkVar == null || rkVar.getVisibility() != 0) {
            qk qkVar = boVar.R;
            if ((qkVar == null || qkVar.getVisibility() != 0) && boVar.Y != null && str != null && str.length() > 0) {
                mk mkVar = boVar.Y;
                mkVar.setFieldText("@" + str + " ");
                boVar.Y.I0();
            }
        }
    }

    @Override
    public final void o(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            k1();
            return;
        }
        bo boVar = this.f36017a;
        if (!boVar.f32371l3 && boVar.f32519x0 != null && boVar.getParentActivity() != null && boVar.fragmentView != null) {
            if (boVar.f32482u2 == null) {
                tm tmVar = boVar.X0;
                int indexOfChild = tmVar.indexOfChild(boVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(1, boVar.getParentActivity(), boVar.f32293ea, false);
                    boVar.f32482u2 = i40Var;
                    tmVar.addView(i40Var, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    boVar.f32482u2.setAlpha(0.0f);
                    boVar.f32482u2.setVisibility(4);
                } else {
                    return;
                }
            }
            boVar.f32482u2.e(t1Var, null, 0, 0, true);
        }
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.x5 x5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        bo boVar = this.f36017a;
        if (!boVar.getMessagesController().premiumFeaturesBlocked() && x5Var != null && !x5Var.standard) {
            long documentId = x5Var.getDocumentId();
            TLRPC.Document document = x5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                document = org.telegram.ui.Components.o5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.sv svVar = new org.telegram.ui.Components.sv(boVar, boVar.getParentActivity(), boVar.f32293ea, arrayList);
                org.telegram.ui.Components.iv ivVar = svVar.f27973f;
                ivVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(ivVar);
                ivVar.v = imageReceiver;
                if (ivVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                ivVar.f25148w = true;
                ivVar.f25149x.d(1.0f, true);
                ivVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f, true), 0L, null, null, 0);
                ivVar.v.setLayerNum(7);
                ivVar.v.setAllowStartLottieAnimation(true);
                ivVar.v.setAllowStartAnimation(true);
                ivVar.v.setAutoRepeat(1);
                ivVar.v.setAllowDecodeSingleFrame(true);
                ivVar.v.setParentView(ivVar);
                svVar.setCalcMandatoryInsets(boVar.x9());
                boVar.showDialog(svVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p() {
        this.f36017a.X0.getClass();
    }

    @Override
    public final void p1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var != null && document != null) {
            bo boVar = this.f36017a;
            if (boVar.getParentLayout() != null && a0(t1Var)) {
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(boVar, t1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new q1(this, t1Var, document, 24), false);
                H.f26368t = false;
                H.Z();
            }
        }
    }

    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z10) {
        bo boVar = this.f36017a;
        TLRPC.Chat chat2 = boVar.e;
        if (chat2 != null && chat.f18109id == chat2.f18109id) {
            pj pjVar = boVar.f32233a1;
            if (pjVar != null && i10 == 0) {
                pjVar.e(false, false);
            } else if (t1Var.getMessageObject() != null) {
                boVar.F(i10, t1Var.getMessageObject().getId(), 0, 0, true, false);
            }
        } else if (chat2 == null || chat.f18109id != chat2.f18109id || boVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18109id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            aj ajVar = null;
            if (z10) {
                nf.e eVar = boVar.f32555zb;
                if (eVar != null) {
                    eVar.a(true);
                    boVar.f32555zb = null;
                }
                if (t1Var.getMessageObject() == null) {
                    boVar.f32555zb = null;
                } else {
                    aj ajVar2 = new aj(boVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    boVar.f32555zb = ajVar2;
                    ajVar = ajVar2;
                }
            }
            if (boVar.getMessagesController().checkCanOpenChat(bundle, boVar, t1Var.getMessageObject(), ajVar)) {
                bo boVar2 = new bo(bundle);
                if (ajVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new ei.l3(this, ajVar, chat, i10, boVar2, 16), 5000L);
                    ajVar.d();
                    return;
                }
                boVar.presentFragment(boVar2);
            }
        }
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        bo boVar = this.f36017a;
        boVar.I7(t1Var, false, false, f7, f10, true, false, false);
        boVar.f32519x0.getClass();
        bo.c2(boVar, RecyclerView.R(t1Var));
    }

    @Override
    public final void q2() {
        this.f36017a.r9();
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nn.r(org.telegram.ui.Cells.t1):void");
    }

    @Override
    public final void s() {
        this.f36017a.Yb();
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        xj xjVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            bo boVar = this.f36017a;
            uj ujVar = boVar.f32519x0;
            if (ujVar != null && (xjVar = boVar.f32544z0) != null && xjVar.f42668y < 0) {
                for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = boVar.f32519x0.getChildAt(childCount);
                    boVar.f32519x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = boVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = boVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            boVar.rc(primaryMessageObject, false);
            ci.f4 f4Var = boVar.A1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            if (i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
                boVar.f32544z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.f36017a;
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        boolean z10 = true;
        if (!kVar.s() && !boVar.A9()) {
            if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
                P0(10, t1Var);
                return;
            }
            if (!ChatObject.isForum(boVar.e) && !boVar.F9()) {
                z10 = false;
            }
            y(user, z10);
            return;
        }
        bo.b2(boVar, t1Var, true, f7, f10);
    }

    @Override
    public final void t2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f36017a.W7(t1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j3;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = t1Var.getMessageObject();
        }
        MessageObject messageObject2 = messageObject;
        TLRPC.MessageReplies messageReplies = messageObject2.messageOwner.replies;
        if (messageReplies != null) {
            int i11 = messageReplies.read_max_id;
            j3 = messageReplies.channel_id;
            i10 = i11;
        } else {
            j3 = 0;
            i10 = -1;
        }
        long j10 = j3;
        bo boVar = this.f36017a;
        boVar.aa(boVar.e.f18109id, messageObject2, messageObject2.getId(), j10, i10, 0, null);
    }

    @Override
    public final void u1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        uh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        uh.j jVar = this.f36017a.X9;
        if (jVar != null && (hVar = (uh.h) jVar.f43801a.get(uh.j.b(t1Var))) != null) {
            uh.d[] dVarArr = hVar.f43795w;
            RectF rectF = hVar.f43793r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = uh.g.f43780a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(uh.g.f43780a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.p.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f43787a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        uh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f43759p != z10) {
                            ValueAnimator valueAnimator = dVar.f43757n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f43759p = z10;
                            float f15 = dVar.f43758o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f43757n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f43757n.addUpdateListener(dVar);
                            dVar.f43757n.setInterpolator(uh.f.f43763a);
                            dVar.f43757n.start();
                        }
                        uh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f43756m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f43754k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f43756m = z11;
                            float f16 = dVar2.f43755l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f43754k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f43754k.addUpdateListener(dVar2);
                            dVar2.f43754k.setInterpolator(uh.f.f43763a);
                            dVar2.f43754k.start();
                        }
                    }
                }
            }
        }
    }

    public final void v(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f18256id);
            org.telegram.ui.ActionBar.n2 n2Var = this.f36017a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, t1Var.getMessageObject())) {
                n2Var.presentFragment(new bo(bundle));
            }
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t1 r46, float r47, float r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nn.v0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final boolean v2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        bo boVar = this.f36017a;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
        if (z10 && boVar.J9) {
            d5Var = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                ((ActionBarLayout) d5Var2).r();
            }
            return true;
        }
        return !e();
    }

    @Override
    public final String w(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        bo boVar = this.f36017a;
        if (UserObject.isBotForum(boVar.f32295f)) {
            return null;
        }
        TLRPC.Chat chat = boVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = boVar.getMessagesController().getAdminRank(boVar.e.f18109id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = boVar.f32263c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f36017a.f32454s.containsKey(messageObject);
    }

    public final void x(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18109id);
            bundle.putBoolean("expandPhoto", false);
            this.f36017a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void x2() {
        bo boVar = this.f36017a;
        if (boVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", boVar.T5);
            bundle.putInt("start_from", 10);
            boVar.presentFragment(new org.telegram.ui.Components.ba0(bundle, boVar.f32233a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.vc.a0(boVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", boVar.getMessagesController().recommendedChannelsLimitPremium), new ym(this, 4))).j();
    }

    public final void y(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f18256id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z10 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f18256id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            bo boVar = this.f36017a;
            TLRPC.User user2 = boVar.f32295f;
            if (user2 != null && user2.f18256id == user.f18256id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = boVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            boVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var) {
        qh.c cVar = this.f36017a.Bc;
        if (cVar != null && cVar.f41752n == t1Var) {
            cVar.f41755w.getClass();
        }
    }

    @Override
    public final void y2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        bo boVar = this.f36017a;
        ci.f4 f4Var = boVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (boVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            ci.f4 f4Var2 = new ci.f4(boVar.getParentActivity(), 3);
            f4Var2.p(true);
            f4Var2.K = Layout.Alignment.ALIGN_NORMAL;
            f4Var2.d = -1L;
            f4Var2.T = true;
            f4Var2.e = true;
            f4Var2.q(12.0f);
            boVar.A1 = f4Var2;
            f4Var2.f4635l0 = new uh(6, this, f4Var2);
            f4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            boVar.X0.addView(boVar.A1, w7.x5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            boVar.X0.post(new i2.z(this, t1Var, i11, i10, 4));
        }
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            t1Var.t2();
            t1Var.requestLayout();
            this.f36017a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void z0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.b6 animation;
        bo boVar = this.f36017a;
        if (!boVar.f32371l3 && !SharedConfig.noSoundHintShowed && boVar.f32519x0 != null && boVar.getParentActivity() != null && boVar.fragmentView != null) {
            org.telegram.ui.Components.i40 i40Var = boVar.f32470t2;
            if (i40Var == null || i40Var.getTag() == null) {
                if (boVar.f32470t2 == null) {
                    tm tmVar = boVar.X0;
                    int indexOfChild = tmVar.indexOfChild(boVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(0, boVar.getParentActivity(), boVar.f32293ea, false);
                        boVar.f32470t2 = i40Var2;
                        i40Var2.setShowingDuration(10000L);
                        tmVar.addView(boVar.f32470t2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        boVar.f32470t2.setAlpha(0.0f);
                        boVar.f32470t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = boVar.f32519x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = boVar.f32519x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && boVar.f32470t2.e(t1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.r9 z2() {
        return this.f36017a.f32268c9;
    }
}
