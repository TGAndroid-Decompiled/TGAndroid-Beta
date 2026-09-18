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
public final class ln implements org.telegram.ui.Cells.l1 {
    public final zn f35408a;

    public ln(zn znVar) {
        this.f35408a = znVar;
    }

    public static void a(ln lnVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        zn znVar = lnVar.f35408a;
        if (znVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && znVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                znVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            if (u1Var == null) {
                messageObject = null;
            } else {
                messageObject = u1Var.getMessageObject();
            }
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.isOutOwner();
                tL_message.f18317id = messageObject.getId();
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
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList, new va(lnVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.f35408a;
        if (!znVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            znVar.getMessagesController().getContentSettings(new y(this, b2Var, u1Var, 5));
            return;
        }
        if (u1Var.getMessageObject() != null) {
            u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        u1Var.h4();
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        zn znVar = this.f35408a;
        if (znVar.getParentActivity() != null && tLObject != null) {
            d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                if (((ActionBarLayout) d5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18296id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f18443id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, znVar.getParentActivity(), znVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(znVar.getParentActivity(), false, false);
                f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                f1Var.setMinimumWidth(160);
                f1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(znVar.getParentActivity(), false, false);
                f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                f1Var2.setMinimumWidth(160);
                f1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, u1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                zn znVar2 = new zn(bundle);
                znVar2.J9 = true;
                znVar.presentFragmentAsPreviewWithMenu(znVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                znVar.d7();
                return;
            }
            znVar.presentFragment(new zn(bundle));
        }
    }

    @Override
    public final boolean A1() {
        zn znVar = this.f35408a;
        if (znVar.X0.getMeasuredWidth() > znVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        boolean z10;
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        zn znVar = this.f35408a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(znVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = znVar.getMessagesController().conferenceCallSizeLimit;
                b2Var.setOnCancelListener(new ca(this, znVar.getConnectionsManager().sendRequest(getgroupcall, new ci.kd(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
                b2Var.q(600L);
                return;
            }
            TLRPC.User user = znVar.f40263f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = znVar.f40207a8;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.f2.m(user, isVideoCall, z10, znVar.getParentActivity(), znVar.getMessagesController().getUserFull(znVar.f40263f.f18443id), znVar.getAccountInstance());
                return;
            }
            return;
        }
        znVar.I7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void C1(org.telegram.ui.Cells.u1 u1Var) {
        zn.U4(this.f35408a, u1Var);
    }

    @Override
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
        l(u1Var, true, false, true);
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        l(u1Var, z10, false, false);
    }

    @Override
    public final void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int dp;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i13 = buttonCustom.f15776id;
            TL_stars.StarsAmount starsAmount = null;
            zn znVar = this.f35408a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                of ofVar = new of(8, this, message);
                Pattern pattern = org.telegram.ui.Components.e5.f23785a;
                Activity parentActivity = znVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                editText.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                editText.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.j6.S(parentActivity));
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
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new l4(22, ofVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b2Var.N = new org.telegram.ui.Components.p1(editText, 0);
                frameLayout.addView(editText, w7.y5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.og(editText, 3), 100L);
                znVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, znVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, znVar.e, 5);
                    }
                    ai.s4 s4Var = new ai.s4(this, message, canManageMonoForum, messageObject, 12);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    znVar.g7(s4Var, zf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                znVar.I7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                znVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.f35408a;
        znVar.f40498xa.l(u1Var, znVar, true);
        znVar.f40488x0.J0(false);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            zn znVar = this.f35408a;
            if ((znVar.f40472vb != id2 || znVar.f40486wb != 7) && (inputPeer = znVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f18514id = id2;
                nf.e eVar = znVar.f40524zb;
                if (eVar != null) {
                    eVar.a(true);
                    znVar.f40524zb = null;
                }
                zi ziVar = new zi(znVar, id2, u1Var, 2);
                ziVar.f15394b = new org.telegram.ui.ActionBar.h6(28, znVar, r3);
                znVar.f40524zb = ziVar;
                ziVar.d();
                int[] iArr = {znVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new kg(znVar, ziVar, iArr, u1Var, messageObject))};
            }
        }
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
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
        qk qkVar;
        pk pkVar;
        if (!m()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        zn znVar = this.f35408a;
        if (!isEmpty && znVar.e != null && (((qkVar = znVar.O0) == null || qkVar.getVisibility() != 0) && ((pkVar = znVar.R) == null || pkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = znVar.e;
        if (chat2 != null && ((znVar.f40243d4 == 0 || znVar.f40292h4) && (!ChatObject.isChannel(chat2) || znVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = znVar.e;
        if (chat3 != null && chat3.f18296id == chat.f18296id && !znVar.F9()) {
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
                d5Var = d5.f32865f;
            }
            d5VarArr[1] = d5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            d5VarArr[i13] = d5.f32866n;
            i13++;
        }
        if (i11 != 0) {
            d5VarArr[i13] = d5.f32867r;
        }
        TLRPC.ChatFull chatFull = znVar.getMessagesController().getChatFull(chat.f18296id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
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
            com.google.firebase.messaging.m.k().v((ViewGroup) znVar.fragmentView, znVar.f40261ea, x4Var, new b7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(znVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new zm(this, chat, 0), false);
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
        H.l(i17, LocaleController.getString(i18), new q1(this, u1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new zm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new zm(this, chat, 2), i16);
        H.f29925t = false;
        H.f29906i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zn znVar = this.f35408a;
        if (!znVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (znVar.getParentActivity() != null) {
                if (znVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) znVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) znVar.f40261ea, false);
                        f3Var.fixNavigationBar();
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        f3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        lg.j jVar = new lg.j(3, znVar, str);
                        f3Var.items = charSequenceArr;
                        f3Var.onClickListener = jVar;
                        znVar.showDialog(f3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        znVar.Z9(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
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
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.wh.n(R.string.CodeCopied, org.telegram.ui.Components.xc.a0(this.f35408a));
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        zn znVar = this.f35408a;
        znVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        znVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        l(u1Var, true, false, true);
    }

    @Override
    public final boolean I1() {
        zn znVar = this.f35408a;
        if (znVar.X0.getKeyboardHeight() + znVar.f40382oa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        zn znVar = this.f35408a;
        znVar.f40244d5 = messageObject;
        znVar.d9();
    }

    @Override
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f35408a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        zn znVar = this.f35408a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (znVar.T5 != j3) {
                znVar.presentFragment(zn.R9(j3));
            } else {
                znVar.f40201a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            znVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final boolean M0(long j3) {
        zn znVar = this.f35408a;
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return znVar.getMessagesController().isOwner(znVar.e.f18296id, j3);
        }
        return false;
    }

    @Override
    public final void M1(MessageObject messageObject) {
        this.f35408a.f40423s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f35408a.fb(messageObject, true);
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        long j3;
        int i10;
        ArrayList<MessageObject> arrayList;
        a3.h0 h0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        zn znVar = this.f35408a;
        uh.i iVar = znVar.X9;
        if (iVar != null) {
            HashMap hashMap = iVar.f44060a;
            uh.h hVar = (uh.h) hashMap.get(uh.i.b(u1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            uh.h hVar2 = (uh.h) znVar.X9.f44060a.get(uh.i.b(u1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j3 = hVar2.f44057w[i11].d;
            } else {
                j3 = 0;
            }
            if (messageObject != null && j3 != 0) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.e5.h(parentActivity, i10, j3, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) znVar.f40494x6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.q.l(messageObject);
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
                    qcVar = org.telegram.ui.Components.xc.v(znVar.getParentActivity(), znVar, null, 1, j10, 1, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, h0Var);
                    qcVar.f27551k = true;
                    qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
                }
            }
            uh.h hVar3 = (uh.h) hashMap.get(uh.i.b(u1Var));
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
                ybVar.f30529a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new fm(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        hn hnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && nf.f.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        zn znVar = this.f35408a;
        nf.e eVar = znVar.f40524zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (u1Var.getMessageObject() == null) {
            hnVar = null;
        } else {
            hnVar = new hn(this, u1Var);
        }
        znVar.f40524zb = hnVar;
        if (!z11 && !nf.f.f(parse, false, null)) {
            org.telegram.ui.Components.e5.r0(znVar, str, true, true, true, !z11, znVar.f40524zb, webPage, znVar.f40261ea);
        } else {
            nf.f.r(znVar.getParentActivity(), parse, true, true, false, znVar.f40524zb, null, false, true, false);
        }
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        zn znVar = this.f35408a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!u1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(znVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!znVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new wm(this, 9))).k(true);
            return false;
        } else {
            znVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(znVar.e, znVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (znVar = this.f35408a).f40472vb) != 0 && i10 == u1Var.getMessageObject().getId() && znVar.f40486wb == 1) {
            return znVar.f40499xb;
        }
        return null;
    }

    @Override
    public final boolean P() {
        zn znVar = this.f35408a;
        if (znVar.W5[1].size() + znVar.W5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
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
        en enVar = null;
        en enVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        en enVar3 = null;
        en enVar4 = null;
        zn znVar = this.f35408a;
        if (i10 == 19) {
            nf.e eVar = znVar.f40524zb;
            if (eVar != null) {
                eVar.a(true);
            }
            if (u1Var.getMessageObject() != null) {
                enVar2 = new en(this, u1Var, 2);
            }
            final en enVar5 = enVar2;
            znVar.f40524zb = enVar5;
            final Activity parentActivity = znVar.getParentActivity();
            final org.telegram.ui.ActionBar.e6 resourceProvider = znVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            enVar5.d();
            enVar5.f15394b = new tg.d(atomicBoolean, 0);
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
            final String b10 = tg.i.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.messageOwner.date * 1000;
            tg.s.d(messageObject, new Utilities.Callback(atomicBoolean, enVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f43368a;
                public final nf.e f43369b;
                public final boolean f43370c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f43371f;
                public final e6 f43372g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f43371f = parentActivity;
                    this.f43372g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f43368a.get()) {
                        this.f43369b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f43370c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f43371f;
                        e6 e6Var = this.f43372g;
                        if (z12) {
                            i.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            i.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        }
                    }
                }
            }, new tg.f(atomicBoolean, enVar5, 0));
        } else if (i10 == 21) {
            g();
        } else if (i10 == 84) {
            znVar.ua(u1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.ah0.O;
            if (znVar.getParentActivity() != null) {
                znVar.showDialog(new org.telegram.ui.Components.ah0(znVar.getContext(), znVar.getCurrentAccount(), messageObject, znVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    znVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
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
                bundle.putLong("user_id", user.f18443id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                znVar.presentFragment(new ProfileActivity(bundle, null));
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
                znVar.showDialog(new org.telegram.ui.Components.ye0(znVar, null, user, null, file, gf.b.d(str, false), str3, str4, znVar.f40261ea));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            znVar.presentFragment(new zn(t8.b.f(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.wh.g(new StringBuilder("+"), user2.phone, gf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = gf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f18443id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                znVar.presentFragment(new ss(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                znVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    nf.e eVar2 = znVar.f40524zb;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        enVar3 = new en(this, u1Var, 4);
                    }
                    znVar.f40524zb = enVar3;
                    nf.f.r(znVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, znVar.f40524zb, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            znVar.getOrCreateStoryViewer().F(znVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ai.u9.a(znVar.f40488x0));
                            return;
                        }
                    }
                }
                if (!znVar.ea(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
                    nf.e eVar3 = znVar.f40524zb;
                    if (eVar3 != null) {
                        eVar3.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        enVar4 = new en(this, u1Var, 5);
                    }
                    znVar.f40524zb = enVar4;
                    nf.f.r(znVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, znVar.f40524zb, null, false, true, false);
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
                nf.e eVar4 = znVar.f40524zb;
                if (eVar4 != null) {
                    eVar4.a(true);
                }
                if (u1Var.getMessageObject() != null) {
                    enVar = new en(this, u1Var, 3);
                }
                znVar.f40524zb = enVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        znVar.f40524zb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        znVar.f40524zb.f15394b = new ai.n8(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ci.u3(4, this, z11)), 28);
                        return;
                    }
                }
                nf.f.r(znVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, znVar.f40524zb, null, false, true, false);
            }
        }
    }

    @Override
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            zn znVar = this.f35408a;
            org.telegram.ui.Components.vu.J(znVar, messageObject, znVar.Fa, str2, str3, str4, str, i10, i11, -1, znVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var != null) {
            zn znVar = this.f35408a;
            if (znVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(znVar.e);
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
    public final boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        ue ueVar;
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
                    ArrayList L = this.f35408a.A0.L();
                    zn znVar = this.f35408a;
                    return mediaController.setPlaylist(L, messageObject, znVar.L6, true ^ znVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f35408a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            i51 i51Var = this.f35408a.Z9;
            if (i51Var == null || i51Var.f34316b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.xc.a0(this.f35408a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f35408a.Z9 = new i51(this.f35408a.getParentActivity());
                i51 i51Var2 = this.f35408a.Z9;
                if (!messageObject.isOutOwner()) {
                    ueVar = this.f35408a.fb(messageObject, true);
                } else {
                    ueVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    h0Var = zn.O4(this.f35408a, messageObject);
                } else {
                    h0Var = null;
                }
                Context context = i51Var2.f34313a;
                ci.n6 n6Var2 = i51Var2.f34317c;
                i51Var2.X = ueVar;
                i51Var2.Y = h0Var;
                g51 g51Var2 = i51Var2.N;
                if (g51Var2 != null) {
                    n6Var2.removeView(g51Var2);
                    i51Var2.N = null;
                }
                i51Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                i51Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i51Var2.S = z10;
                org.telegram.ui.Cells.u1 u1Var2 = i51Var2.O;
                if (u1Var2 != null) {
                    e6Var = u1Var2.getResourcesProvider();
                } else {
                    e6Var = null;
                }
                i51Var2.L = e6Var;
                if (i51Var2.O != null) {
                    i51Var2.T = 0.0f;
                    i51Var2.U = u1Var.f21405n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
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
                    org.telegram.ui.Cells.u1 u1Var3 = i51Var2.O;
                    g51Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!i51Var2.S) {
                        org.telegram.ui.Components.k8 k8Var = new org.telegram.ui.Components.k8();
                        i51Var2.V = k8Var;
                        g51 g51Var5 = i51Var2.N;
                        k8Var.f25630i = g51Var5;
                        g51Var5.f21291ee = k8Var;
                        if (g51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.wo0 seekBarWaveform = i51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = i51Var2.f34324s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.f30133n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
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
                    n6Var.addView(textureView2, 0, w7.y5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.u71 u71Var = i51Var2.f34325w;
                if (u71Var != null) {
                    u71Var.B();
                    i51Var2.f34325w.H();
                    i51Var2.f34325w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = i51Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
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
                        org.telegram.ui.Components.u71 u71Var2 = new org.telegram.ui.Components.u71();
                        i51Var2.f34325w = u71Var2;
                        u71Var2.J = new h51(i51Var2);
                        if (i51Var2.V != null) {
                            u71Var2.K = new h51(i51Var2);
                        }
                        if (i51Var2.S) {
                            u71Var2.V(i51Var2.P);
                        }
                        i51Var2.f34325w.D(Uri.fromFile(pathToAttach), "other");
                        i51Var2.f34325w.C();
                        org.telegram.ui.Components.jt jtVar = i51Var2.E;
                        if (jtVar != null) {
                            jtVar.f25443s = i51Var2.f34325w;
                            jtVar.a();
                        }
                    }
                    zn znVar2 = this.f35408a;
                    znVar2.showDialog(znVar2.Z9);
                    return false;
                }
                ci.f4 f4Var = i51Var2.f34326x;
                if (f4Var != null) {
                    n6Var.removeView(f4Var);
                    i51Var2.f34326x = null;
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
                    i51Var2.f34326x = f4Var2;
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
                        ci.f4 f4Var3 = i51Var2.f34326x;
                        if (i51Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        f4Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ci.f4 f4Var4 = i51Var2.f34326x;
                        if (i51Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        f4Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    i51Var2.f34326x.q(12.0f);
                    ci.f4 f4Var5 = i51Var2.f34326x;
                    if (!z11 && !i51Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    f4Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (i51Var2.S) {
                        i51Var2.f34326x.m(0.5f, 0.0f);
                        i51Var2.f34326x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        i51Var2.f34326x.m(0.0f, AndroidUtilities.dp(34.0f));
                        i51Var2.f34326x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    i51Var2.f34326x.t(14.0f);
                    ci.f4 f4Var6 = i51Var2.f34326x;
                    f4Var6.h = ci.f4.a(f4Var6.getText(), i51Var2.f34326x.getTextPaint());
                    if (i51Var2.S) {
                        n6Var.addView(i51Var2.f34326x, w7.y5.d((int) ((i51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((i51Var2.O.getHeight() + i51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        n6Var.addView(i51Var2.f34326x, w7.y5.d((int) ((i51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((i51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + i51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((i51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    i51Var2.f34326x.u();
                }
                TextView textView = i51Var2.f34327y;
                if (textView != null) {
                    n6Var.removeView(textView);
                    i51Var2.f34327y = null;
                }
                TextView textView2 = new TextView(context);
                i51Var2.f34327y = textView2;
                textView2.setTextColor(-1);
                i51Var2.f34327y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    i51Var2.f34327y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    i51Var2.f34327y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                i51Var2.f34327y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.a6.a(i51Var2.f34327y);
                TextView textView3 = i51Var2.f34327y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                i51Var2.f34327y.setOnClickListener(new e51(i51Var2, 1));
                n6Var.addView(i51Var2.f34327y, w7.y5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (g51Var = i51Var2.N) != null && g51Var.getMessageObject() != null && i51Var2.N.getMessageObject().messageOwner != null) {
                    i51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    i51Var2.N.invalidate();
                }
                zn znVar22 = this.f35408a;
                znVar22.showDialog(znVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean R() {
        zn znVar = this.f35408a;
        if (!UserObject.isReplyUser(znVar.f40263f) && !UserObject.isUserSelf(znVar.f40263f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        zn znVar = this.f35408a;
        znVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, znVar);
    }

    @Override
    public final void R1() {
        org.telegram.ui.ActionBar.e6 e6Var;
        zn znVar = this.f35408a;
        if (znVar.X0 != null && znVar.getParentActivity() != null) {
            Context context = znVar.X0.getContext();
            e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
            h41.T(context, znVar, false, e6Var, null);
        }
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        zn znVar = this.f35408a;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.s() && !znVar.A9()) {
            if (!z10 && chat.signature_profiles && (messageObject = u1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                znVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                q(u1Var, chat, i10, z10);
                return;
            }
        }
        zn.b2(znVar, u1Var, true, f7, f10);
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        l(u1Var, true, true, false);
    }

    @Override
    public final void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        zi ziVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        ai1 ai1Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            zn znVar = this.f35408a;
            nf.e eVar = znVar.f40524zb;
            if (eVar != null) {
                eVar.a(true);
                znVar.f40524zb = null;
            }
            if (u1Var.getMessageObject() == null) {
                znVar.f40524zb = null;
                ziVar = null;
            } else {
                ziVar = new zi(znVar, u1Var.getMessageObject().getId(), u1Var, 1);
                znVar.f40524zb = ziVar;
            }
            i10 = ((org.telegram.ui.ActionBar.n2) this.f35408a).currentAccount;
            yh.t5 y3 = yh.t5.y(i10, false);
            Objects.requireNonNull(ziVar);
            cj cjVar = new cj(ziVar, 7);
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.e6 I = yh.t5.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f48042a).getInputPeer(dialogId);
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
                ai1Var = new ai1(y3, ConnectionsManager.getInstance(y3.f48042a).sendRequest(tL_payments_getPaymentForm, new ai.p3(y3, messageObject, tL_inputInvoiceMessage, cjVar, 19)), 7);
            }
            if (ai1Var != null) {
                ziVar.f15394b = ai1Var;
                ziVar.d();
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
                    TLRPC.TL_message C7 = zn.C7(message);
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
                zn znVar2 = this.f35408a;
                t12.J2(null, znVar2, znVar2.f40261ea);
                PhotoViewer.t1().a2(arrayList, i11, this.f35408a.a(), 0L, 0L, this.f35408a.Ga);
            }
        }
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        zn znVar = this.f35408a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            rg.k1 k1Var = new rg.k1(znVar, i10, user, null, null, znVar.f40261ea);
            u1Var.getLocationOnScreen(new int[2]);
            k1Var.f42618v0 = u1Var.getNameStatusX();
            k1Var.f42619w0 = u1Var.getNameStatusY();
            k1Var.f42622z0 = u1Var.getScaleX();
            k1Var.f42620x0 = u1Var.getLeft();
            k1Var.f42621y0 = u1Var.getTop();
            k1Var.A0 = u1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
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
                k1Var.f42617u0 = num;
            } else {
                k1Var.f42617u0 = Integer.valueOf(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19321r8[colorId]));
            }
            org.telegram.ui.Components.o5 o5Var = u1Var.f21304fc;
            if (o5Var != null && (o5Var.f26855f[0] instanceof org.telegram.ui.Components.q5)) {
                k1Var.f42622z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(znVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f19227m6, 0.2f);
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
                        Integer num2 = k1Var.f42617u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19393v6);
                        }
                        w9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        k1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        k1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    k1Var.B0 = w9Var;
                    k1Var.E0 = true;
                }
            }
            znVar.showDialog(k1Var);
            return;
        }
        nf.f.s(znVar.getParentActivity(), "https://" + znVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final int V() {
        return this.f35408a.R3;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.f35408a.U7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.u1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.V1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = u1Var.getMessageObject();
        }
        if (messageObject != null) {
            zn znVar = this.f35408a;
            if (!znVar.f40312ic && messageObject.getId() == znVar.f40299hc) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - znVar.f40324jc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void X0(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.f35408a;
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.T5), u1Var);
    }

    @Override
    public final hh.a Y() {
        return this.f35408a.Pb;
    }

    @Override
    public final pv0 Y1() {
        return this.f35408a.f40485wa;
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.u1 u1Var) {
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
            zn znVar = this.f35408a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = znVar.f40488x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = znVar.f40488x0.getChildAt(i11);
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
            znVar.Jb(messageObject, spannableStringBuilder, 1);
            u1Var.g4(1, false, true);
        }
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null) {
            messageObject = null;
        } else {
            messageObject = u1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            zn znVar = this.f35408a;
            if (znVar.R3 != 1 && !znVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a2(long j3) {
        zn znVar = this.f35408a;
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return znVar.getMessagesController().isAdmin(znVar.e.f18296id, j3);
        }
        return false;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.f35408a;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            CharSequence fieldText = lkVar.getFieldText();
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
                znVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new wm(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.u1 u1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        x4 b10;
        int i11;
        qk qkVar;
        pk pkVar;
        if (!m()) {
            return false;
        }
        zn znVar = this.f35408a;
        if (znVar.e != null && (((qkVar = znVar.O0) == null || qkVar.getVisibility() != 0) && ((pkVar = znVar.R) == null || pkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && ((znVar.f40243d4 == 0 || znVar.f40292h4) && (!ChatObject.isChannel(chat) || znVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c10 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.f32866n;
            c10 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c10] = d5.f32867r;
        }
        TLRPC.UserFull userFull = znVar.getMessagesController().getUserFull(user.f18443id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        } else {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) znVar.fragmentView, znVar.f40261ea, b10, new b7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(znVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final ln f39847b;

            {
                this.f39847b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f39847b.y(user, false);
                        return;
                    case 1:
                        this.f39847b.c(user);
                        return;
                    default:
                        this.f39847b.f35408a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new q1(this, u1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final ln f39847b;

            {
                this.f39847b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f39847b.y(user, false);
                        return;
                    case 1:
                        this.f39847b.c(user);
                        return;
                    default:
                        this.f39847b.f35408a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final ln f39847b;

            {
                this.f39847b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f39847b.y(user, false);
                        return;
                    case 1:
                        this.f39847b.c(user);
                        return;
                    default:
                        this.f39847b.f35408a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f29925t = false;
        H.f29906i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.u1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.b2(org.telegram.ui.Cells.u1, int, float, float, boolean):void");
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.f35408a;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            CharSequence fieldText = lkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(t8.b.v(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.e61("" + user.f18443id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            znVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new wm(this, 7), 200L);
        }
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.f35408a;
        if (znVar.f40472vb != 0 && u1Var.getMessageObject() != null && znVar.f40472vb == u1Var.getMessageObject().getId() && znVar.f40486wb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.u1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.c2(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        zn znVar = this.f35408a;
        znVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(znVar.getParentActivity()) && (chat = znVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == znVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == znVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                org.telegram.ui.Components.n01.b(parentActivity, i10, -znVar.e.f18296id, currentUser, str2, z15, z16, z12, e6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == znVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(znVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                znVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(znVar.e);
                tL_channels_getParticipant.participant = znVar.getMessagesController().getInputPeer(currentUser.f18443id);
                znVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new ai.m0(7, this, u1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
            org.telegram.ui.Components.n01.b(parentActivity2, i10, -znVar.e.f18296id, currentUser, str2, z152, z162, z12, e6Var);
        }
    }

    @Override
    public final void d0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        zn znVar = this.f35408a;
        try {
            if (i10 == 0) {
                znVar.h7();
                gl glVar = znVar.f40516z3;
                if (glVar != null) {
                    glVar.l(0L, 84, null, new wm(this, 1));
                    znVar.f40516z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (znVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.t31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.t31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.xc.a0(znVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                znVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", znVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new wm(this, 2));
                } else if (znVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new wm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), a02.f30305c);
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
                ybVar.f30530b.setText(append2);
                ybVar.f30530b.setSingleLine(false);
                ybVar.f30530b.setMaxLines(6);
                a02.b(ybVar, 7000).k(true);
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
        zn znVar = this.f35408a;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar2.s() && !znVar.A9()) {
                z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
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
        if (this.f35408a.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void e2(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        zn znVar = this.f35408a;
        if (AndroidUtilities.isContextSafe(znVar.getParentActivity()) && (chat = znVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(u1Var, znVar.getMessagesController().getParticipant(znVar.e.f18296id, currentUser.f18443id));
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.f35408a.I7(u1Var, true, false, f7, f10, false, false, false);
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
        zn znVar = this.f35408a;
        if (isHuaweiStoreApp) {
            nf.f.s(znVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(znVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
        Bundle f7 = t8.b.f(j3, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.f35408a;
        if (n2Var.getMessagesController().checkCanOpenChat(f7, n2Var, u1Var.getMessageObject())) {
            n2Var.presentFragment(new zn(f7));
        }
    }

    @Override
    public final String h(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (znVar = this.f35408a).f40472vb) != 0 && i10 == u1Var.getMessageObject().getId() && znVar.f40486wb == 3) {
            return znVar.f40511yb;
        }
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        zn znVar = this.f35408a;
        if (znVar.f40473vc.f14131f && (cVar = znVar.Bc) != null && cVar.f42010n == u1Var && cVar.f42006a.getWidth() > 0) {
            return znVar.Bc.f42006a.getHeight();
        }
        return 0;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        lm lmVar;
        long dialogId = messageObject.getDialogId();
        zn znVar = this.f35408a;
        if ((dialogId == 1271266957 || ((lmVar = znVar.A0) != null && lmVar.N)) && znVar.R3 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
        TLRPC.Message message;
        if (u1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f35408a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
            return;
        }
        fVar.run();
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        zn znVar = this.f35408a;
        if (znVar.getParentActivity() != null) {
            if (znVar.X9 == null) {
                uh.i iVar = new uh.i(znVar.getParentActivity());
                znVar.X9 = iVar;
                znVar.X0.addView(iVar, w7.y5.e(-1, -1, 48));
            }
            uh.i iVar2 = znVar.X9;
            HashMap hashMap = iVar2.f44060a;
            ArrayList arrayList = iVar2.f44062c;
            arrayList.clear();
            int i10 = iVar2.d;
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
                    long j11 = dialog.f18300id;
                    if (j11 != j3 && !DialogObject.isEncryptedDialog(j11)) {
                        if (DialogObject.isUserDialog(dialog.f18300id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f18300id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f18443id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f18300id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f18300id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f18300id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f18300id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f18300id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = uh.i.b(u1Var);
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
                uh.h hVar = new uh.h(iVar2, u1Var, arrayList4, new uf.b(4, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = qh.i.a(messageObject);
            boolean a10 = w7.d0.a(a2, 7);
            zn znVar = this.f35408a;
            if (a10) {
                org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.e_hand_2, 36, qh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                znVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                u1Var.S0(true);
            } else if (znVar.getParentActivity() != null) {
                if (znVar.f40364n2 == null) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(5, znVar.getParentActivity(), znVar.f40261ea, false);
                    znVar.f40364n2 = i40Var;
                    i40Var.setAlpha(0.0f);
                    znVar.f40364n2.setVisibility(4);
                    int indexOfChild = znVar.X0.indexOfChild(znVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    znVar.X0.addView(znVar.f40364n2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.s1> pollButtons = u1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.s1 s1Var = pollButtons.get(i16);
                            float y3 = ((u1Var.getY() + s1Var.f20864b) - AndroidUtilities.dp(4.0f)) - znVar.f40433s9;
                            znVar.f40399q2 = AndroidUtilities.dp(13.3f) + s1Var.f20863a;
                            int D = org.telegram.messenger.wh.D(6.0f, s1Var.f20864b, i12);
                            znVar.f40412r2 = D;
                            if (y3 > 0.0f) {
                                i15 = znVar.f40399q2;
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
                        znVar.f40488x0.w0(0, (int) f7, null);
                        znVar.f40387p2 = u1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                znVar.f40364n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void k() {
        g();
    }

    @Override
    public final void k1() {
        zn znVar = this.f35408a;
        znVar.Q7();
        UndoView undoView = znVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, znVar.T5, null);
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        wj wjVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        zn znVar = this.f35408a;
        tj tjVar = znVar.f40488x0;
        if (tjVar != null && (wjVar = znVar.f40513z0) != null && wjVar.f42926y < 0) {
            for (int childCount = tjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = znVar.f40488x0.getChildAt(childCount);
                znVar.f40488x0.getClass();
                i10 = RecyclerView.S(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i11 = znVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                wj wjVar2 = znVar.f40513z0;
                znVar.f40488x0.getClass();
                wjVar2.i1(RecyclerView.S(u1Var), u1Var.getTop() - ((int) znVar.f40433s9), false);
            } else {
                znVar.f40513z0.h1(i10, i11);
            }
        }
        znVar.N0 = z11;
        znVar.rc(primaryMessageObject, false);
        znVar.N0 = false;
    }

    @Override
    public final boolean l0() {
        boolean z10;
        zn znVar = this.f35408a;
        if (!znVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var != null && pageBlock != null) {
            zn znVar = this.f35408a;
            if (znVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.J2(null, znVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new um(znVar, arrayList), null, 0L, 0L, 0L, true, new tm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean m() {
        zn znVar = this.f35408a;
        if (!UserObject.isUserSelf(znVar.f40263f)) {
            TLRPC.Chat chat = znVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !znVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        zn znVar = this.f35408a;
        if (!znVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (znVar.getParentActivity() != null) {
                if (znVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    lk lkVar = znVar.Y;
                    MessageObject messageObject = u1Var.getMessageObject();
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    yi yiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    nf.e eVar = znVar.f40524zb;
                    if (eVar != null) {
                        eVar.a(true);
                        znVar.f40524zb = null;
                    }
                    if (str != null && u1Var.getMessageObject() != null) {
                        yi yiVar2 = new yi(znVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                        znVar.f40524zb = yiVar2;
                        yiVar = yiVar2;
                    } else {
                        znVar.f40524zb = null;
                    }
                    lkVar.c0(keyboardButtonProto, messageObject, messageObject2, yiVar);
                }
            }
        }
    }

    @Override
    public final void m2(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f35408a.rc(primaryMessageObject, false);
    }

    @Override
    public final void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                N1(u1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            zn znVar = this.f35408a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(znVar)) {
                    jd0 jd0Var = new jd0(3);
                    e6Var2 = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                    jd0Var.setResourceProvider(e6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = znVar.getMessagesController().getPeer(znVar.a());
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
                    jd0Var.O0 = false;
                    jd0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    znVar.presentFragment(jd0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                st.q().w(znVar.getParentActivity());
                st.q().v(new jn(this, tL_messageMediaPoll, pollAnswer, u1Var));
                st q6 = st.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = u1Var.getMessageObject();
                e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
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
                    TLRPC.TL_message C7 = zn.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = qh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    qh.a aVar = new qh.a(i15, messageObject, document6, qh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f42002g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = u1Var.f21572y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            qh.g gVar = u1Var.f21256c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            qh.g gVar2 = u1Var.f21242b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f42001f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = u1Var.f21572y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            qh.g gVar3 = u1Var.f21256c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            qh.g gVar4 = u1Var.f21242b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = zn.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = qh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().J2(null, znVar, znVar.f40261ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j3 = znVar.T5;
                            } else {
                                j3 = 0;
                            }
                            if (i19 != 0) {
                                j10 = znVar.L6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = znVar.d();
                            }
                            t12.c2(messageObject6, znVar, j3, j10, j11, znVar.Fa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, znVar.getParentActivity(), znVar.f40261ea, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            znVar.z6(messageObject6);
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
                    TLRPC.TL_message C73 = zn.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = qh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = zn.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = qh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                zf.d.b(tL_messageMediaPoll.poll, znVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message C75 = zn.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = qh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().J2(null, znVar, znVar.f40261ea);
                    PhotoViewer.t1().a2(arrayList3, i11, znVar.a(), 0L, 0L, znVar.Ga);
                }
            }
        }
    }

    @Override
    public final void n0(String str) {
        zn znVar = this.f35408a;
        qk qkVar = znVar.O0;
        if (qkVar == null || qkVar.getVisibility() != 0) {
            pk pkVar = znVar.R;
            if ((pkVar == null || pkVar.getVisibility() != 0) && znVar.Y != null && str != null && str.length() > 0) {
                lk lkVar = znVar.Y;
                lkVar.setFieldText("@" + str + " ");
                znVar.Y.H0();
            }
        }
    }

    @Override
    public final void o(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            k1();
            return;
        }
        zn znVar = this.f35408a;
        if (!znVar.f40340l3 && znVar.f40488x0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
            if (znVar.f40451u2 == null) {
                rm rmVar = znVar.X0;
                int indexOfChild = rmVar.indexOfChild(znVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(1, znVar.getParentActivity(), znVar.f40261ea, false);
                    znVar.f40451u2 = i40Var;
                    rmVar.addView(i40Var, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    znVar.f40451u2.setAlpha(0.0f);
                    znVar.f40451u2.setVisibility(4);
                } else {
                    return;
                }
            }
            znVar.f40451u2.e(u1Var, null, 0, 0, true);
        }
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.z5 z5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        zn znVar = this.f35408a;
        if (!znVar.getMessagesController().premiumFeaturesBlocked() && z5Var != null && !z5Var.standard) {
            long documentId = z5Var.getDocumentId();
            TLRPC.Document document = z5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                document = org.telegram.ui.Components.q5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.sv svVar = new org.telegram.ui.Components.sv(znVar, znVar.getParentActivity(), znVar.f40261ea, arrayList);
                org.telegram.ui.Components.iv ivVar = svVar.f28233f;
                ivVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(ivVar);
                ivVar.v = imageReceiver;
                if (ivVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                ivVar.f25053w = true;
                ivVar.f25054x.d(1.0f, true);
                ivVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f19227m6, 0.2f, true), 0L, null, null, 0);
                ivVar.v.setLayerNum(7);
                ivVar.v.setAllowStartLottieAnimation(true);
                ivVar.v.setAllowStartAnimation(true);
                ivVar.v.setAutoRepeat(1);
                ivVar.v.setAllowDecodeSingleFrame(true);
                ivVar.v.setParentView(ivVar);
                svVar.setCalcMandatoryInsets(znVar.x9());
                znVar.showDialog(svVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p() {
        this.f35408a.X0.getClass();
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var != null && document != null) {
            zn znVar = this.f35408a;
            if (znVar.getParentLayout() != null && a0(u1Var)) {
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(znVar, u1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new q1(this, u1Var, document, 24), false);
                H.f29925t = false;
                H.Z();
            }
        }
    }

    public final void q(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        zn znVar = this.f35408a;
        TLRPC.Chat chat2 = znVar.e;
        if (chat2 != null && chat.f18296id == chat2.f18296id) {
            oj ojVar = znVar.f40201a1;
            if (ojVar != null && i10 == 0) {
                ojVar.e(false, false);
            } else if (u1Var.getMessageObject() != null) {
                znVar.F(i10, u1Var.getMessageObject().getId(), 0, 0, true, false);
            }
        } else if (chat2 == null || chat.f18296id != chat2.f18296id || znVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18296id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            zi ziVar = null;
            if (z10) {
                nf.e eVar = znVar.f40524zb;
                if (eVar != null) {
                    eVar.a(true);
                    znVar.f40524zb = null;
                }
                if (u1Var.getMessageObject() == null) {
                    znVar.f40524zb = null;
                } else {
                    zi ziVar2 = new zi(znVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    znVar.f40524zb = ziVar2;
                    ziVar = ziVar2;
                }
            }
            if (znVar.getMessagesController().checkCanOpenChat(bundle, znVar, u1Var.getMessageObject(), ziVar)) {
                zn znVar2 = new zn(bundle);
                if (ziVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new ei.l3(this, ziVar, chat, i10, znVar2, 17), 5000L);
                    ziVar.d();
                    return;
                }
                znVar.presentFragment(znVar2);
            }
        }
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        zn znVar = this.f35408a;
        znVar.I7(u1Var, false, false, f7, f10, true, false, false);
        znVar.f40488x0.getClass();
        zn.c2(znVar, RecyclerView.S(u1Var));
    }

    @Override
    public final void q2() {
        this.f35408a.r9();
    }

    @Override
    public final void r(org.telegram.ui.Cells.u1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.r(org.telegram.ui.Cells.u1):void");
    }

    @Override
    public final void s() {
        this.f35408a.Yb();
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        wj wjVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            zn znVar = this.f35408a;
            tj tjVar = znVar.f40488x0;
            if (tjVar != null && (wjVar = znVar.f40513z0) != null && wjVar.f42926y < 0) {
                for (int childCount = tjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = znVar.f40488x0.getChildAt(childCount);
                    znVar.f40488x0.getClass();
                    i10 = RecyclerView.S(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = znVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            znVar.rc(primaryMessageObject, false);
            ci.f4 f4Var = znVar.A1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            if (i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
                znVar.f40513z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f35408a;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        boolean z10 = true;
        if (!kVar.s() && !znVar.A9()) {
            if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
                P0(10, u1Var);
                return;
            }
            if (!ChatObject.isForum(znVar.e) && !znVar.F9()) {
                z10 = false;
            }
            y(user, z10);
            return;
        }
        zn.b2(znVar, u1Var, true, f7, f10);
    }

    @Override
    public final void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f35408a.W7(u1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        long j3;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = u1Var.getMessageObject();
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
        zn znVar = this.f35408a;
        znVar.aa(znVar.e.f18296id, messageObject2, messageObject2.getId(), j10, i10, 0, null);
    }

    @Override
    public final void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        uh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        uh.i iVar = this.f35408a.X9;
        if (iVar != null && (hVar = (uh.h) iVar.f44060a.get(uh.i.b(u1Var))) != null) {
            uh.d[] dVarArr = hVar.f44057w;
            RectF rectF = hVar.f44055r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = uh.g.f44042a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(uh.g.f44042a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.q.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f44049a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        uh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f44021p != z10) {
                            ValueAnimator valueAnimator = dVar.f44019n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f44021p = z10;
                            float f15 = dVar.f44020o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f44019n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f44019n.addUpdateListener(dVar);
                            dVar.f44019n.setInterpolator(uh.f.f44025a);
                            dVar.f44019n.start();
                        }
                        uh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f44018m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f44016k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f44018m = z11;
                            float f16 = dVar2.f44017l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f44016k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f44016k.addUpdateListener(dVar2);
                            dVar2.f44016k.setInterpolator(uh.f.f44025a);
                            dVar2.f44016k.start();
                        }
                    }
                }
            }
        }
    }

    public final void v(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f18443id);
            org.telegram.ui.ActionBar.n2 n2Var = this.f35408a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, u1Var.getMessageObject())) {
                n2Var.presentFragment(new zn(bundle));
            }
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r38, float r39, float r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        zn znVar = this.f35408a;
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (z10 && znVar.J9) {
            d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
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
        zn znVar = this.f35408a;
        if (UserObject.isBotForum(znVar.f40263f)) {
            return null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = znVar.getMessagesController().getAdminRank(znVar.e.f18296id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = znVar.f40231c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f35408a.f40423s.containsKey(messageObject);
    }

    public final void x(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18296id);
            bundle.putBoolean("expandPhoto", false);
            this.f35408a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void x2() {
        zn znVar = this.f35408a;
        if (znVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", znVar.T5);
            bundle.putInt("start_from", 10);
            znVar.presentFragment(new org.telegram.ui.Components.ka0(bundle, znVar.f40201a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", znVar.getMessagesController().recommendedChannelsLimitPremium), new wm(this, 4))).j();
    }

    public final void y(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f18443id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z10 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f18443id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            zn znVar = this.f35408a;
            TLRPC.User user2 = znVar.f40263f;
            if (user2 != null && user2.f18443id == user.f18443id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            znVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void y0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar = this.f35408a.Bc;
        if (cVar != null && cVar.f42010n == u1Var) {
            cVar.f42013w.getClass();
        }
    }

    @Override
    public final void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        zn znVar = this.f35408a;
        ci.f4 f4Var = znVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (znVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            ci.f4 f4Var2 = new ci.f4(znVar.getParentActivity(), 3);
            f4Var2.p(true);
            f4Var2.K = Layout.Alignment.ALIGN_NORMAL;
            f4Var2.d = -1L;
            f4Var2.T = true;
            f4Var2.e = true;
            f4Var2.q(12.0f);
            znVar.A1 = f4Var2;
            f4Var2.f4638l0 = new qh(10, this, f4Var2);
            f4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            znVar.X0.addView(znVar.A1, w7.y5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            znVar.X0.post(new i2.z(this, u1Var, i11, i10, 4));
        }
    }

    @Override
    public final void z(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            u1Var.t2();
            u1Var.requestLayout();
            this.f35408a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void z0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.d6 animation;
        zn znVar = this.f35408a;
        if (!znVar.f40340l3 && !SharedConfig.noSoundHintShowed && znVar.f40488x0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
            org.telegram.ui.Components.i40 i40Var = znVar.f40439t2;
            if (i40Var == null || i40Var.getTag() == null) {
                if (znVar.f40439t2 == null) {
                    rm rmVar = znVar.X0;
                    int indexOfChild = rmVar.indexOfChild(znVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(0, znVar.getParentActivity(), znVar.f40261ea, false);
                        znVar.f40439t2 = i40Var2;
                        i40Var2.setShowingDuration(10000L);
                        rmVar.addView(znVar.f40439t2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        znVar.f40439t2.setAlpha(0.0f);
                        znVar.f40439t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = znVar.f40488x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = znVar.f40488x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && znVar.f40439t2.e(u1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.r9 z2() {
        return this.f35408a.f40236c9;
    }
}
