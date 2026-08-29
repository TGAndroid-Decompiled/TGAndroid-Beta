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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;
public final class fn implements org.telegram.ui.Cells.j1 {
    public final tn f38212a;

    public fn(tn tnVar) {
        this.f38212a = tnVar;
    }

    public static void a(fn fnVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        tn tnVar = fnVar.f38212a;
        if (tnVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && tnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                tnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            if (s1Var == null) {
                messageObject = null;
            } else {
                messageObject = s1Var.getMessageObject();
            }
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.isOutOwner();
                tL_message.f22413id = messageObject.getId();
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
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(tnVar.getParentActivity(), tnVar.getAccountInstance(), arrayList, new pa(fnVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            s1Var.t2();
            s1Var.requestLayout();
            this.f38212a.f43013w0.R(messageObject, false, false);
        }
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        tn tnVar = this.f38212a;
        if (tnVar.getParentActivity() != null && tLObject != null) {
            b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22392id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f22539id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, tnVar.getParentActivity(), tnVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(tnVar.getParentActivity(), false, false);
                g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                g1Var.setMinimumWidth(160);
                g1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(tnVar.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new c0(this, (TLRPC.Chat) tLObject, s1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                tn tnVar2 = new tn(bundle);
                tnVar2.F9 = true;
                tnVar.presentFragmentAsPreviewWithMenu(tnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                tnVar.d7();
                return;
            }
            tnVar.presentFragment(new tn(bundle));
        }
    }

    @Override
    public final boolean A1() {
        tn tnVar = this.f38212a;
        if (tnVar.T0.getMeasuredWidth() > tnVar.T0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        boolean z10;
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        tn tnVar = this.f38212a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(tnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = tnVar.getMessagesController().conferenceCallSizeLimit;
                c2Var.setOnCancelListener(new jh.w(this, tnVar.getConnectionsManager().sendRequest(getgroupcall, new eg.f0(this, c2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 7)), 2));
                c2Var.q(600L);
                return;
            }
            TLRPC.User user = tnVar.f42801f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = tnVar.W7;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.h2.n(user, isVideoCall, z10, tnVar.getParentActivity(), tnVar.getMessagesController().getUserFull(tnVar.f42801f.f22539id), tnVar.getAccountInstance());
                return;
            }
            return;
        }
        tnVar.I7(s1Var, true, false, f9, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.f38212a;
        if (!tnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, null);
            c2Var.q(200L);
            tnVar.getMessagesController().getContentSettings(new b0(this, c2Var, s1Var, 5));
            return;
        }
        if (s1Var.getMessageObject() != null) {
            s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        s1Var.h4();
    }

    @Override
    public final void C1(org.telegram.ui.Cells.s1 s1Var) {
        tn.U4(this.f38212a, s1Var);
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
        i(s1Var, true, false, true);
    }

    @Override
    public final void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int dp;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i13 = buttonCustom.f19606id;
            TL_stars.StarsAmount starsAmount = null;
            tn tnVar = this.f38212a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                tm tmVar = new tm(3, this, message);
                Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                Activity parentActivity = tnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.j1(1, tmVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c2Var.J = new org.telegram.ui.Components.r1(editText, 0);
                frameLayout.addView(editText, i7.f6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ig(editText, 3), 100L);
                tnVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, tnVar.f42787e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, tnVar.f42787e, 5);
                    }
                    ag.w0 w0Var = new ag.w0(this, message, canManageMonoForum, messageObject, 9);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    tnVar.g7(w0Var, kf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                tnVar.I7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                tnVar.N1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.f38212a;
        tnVar.f42983ta.l(s1Var, tnVar, true);
        tnVar.f42973t0.I0(false);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            tn tnVar = this.f38212a;
            if ((tnVar.f42971sb != id2 || tnVar.f42984tb != 7) && (inputPeer = tnVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f22612id = id2;
                ye.c cVar = tnVar.f43024wb;
                if (cVar != null) {
                    cVar.a(true);
                    tnVar.f43024wb = null;
                }
                ri riVar = new ri(tnVar, id2, s1Var, 2);
                riVar.f50515b = new vf(3, tnVar, r3);
                tnVar.f43024wb = riVar;
                riVar.d();
                int[] iArr = {tnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new zf(tnVar, riVar, iArr, s1Var, messageObject))};
            }
        }
    }

    @Override
    public final void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        i(s1Var, z10, false, false);
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            b.n(R.string.CodeCopied, org.telegram.ui.Components.tc.a0(this.f38212a));
        }
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
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
        ik ikVar;
        hk hkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        tn tnVar = this.f38212a;
        if (!isEmpty && tnVar.f42787e != null && (((ikVar = tnVar.K0) == null || ikVar.getVisibility() != 0) && ((hkVar = tnVar.N) == null || hkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = tnVar.f42787e;
        if (chat2 != null && ((tnVar.Z3 == 0 || tnVar.f42779d4) && (!ChatObject.isChannel(chat2) || tnVar.f42787e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = tnVar.f42787e;
        if (chat3 != null && chat3.f22392id == chat.f22392id && !tnVar.F9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        d5[] d5VarArr = new d5[i12 + 1 + i10 + i11];
        d5VarArr[0] = d5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                d5Var = d5.f37291e;
            } else {
                d5Var = d5.f37292f;
            }
            d5VarArr[1] = d5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            d5VarArr[i13] = d5.f37293n;
            i13++;
        }
        if (i11 != 0) {
            d5VarArr[i13] = d5.f37294r;
        }
        TLRPC.ChatFull chatFull = tnVar.getMessagesController().getChatFull(chat.f22392id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
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
        if (ab.m.e(x4Var)) {
            ab.m.i().s((ViewGroup) tnVar.fragmentView, tnVar.f42746aa, x4Var, new z6(this, chat, s1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(tnVar, s1Var);
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
        H.l(i17, LocaleController.getString(i18), new u1(this, s1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new sm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new sm(this, chat, 2), i16);
        H.f29601t = false;
        H.f29582i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        tn tnVar = this.f38212a;
        if (!tnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (tnVar.getParentActivity() != null) {
                if (tnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(tnVar.getParentActivity(), tnVar.f42746aa, false, false);
                        f3Var.fixNavigationBar();
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        f3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        ag.y1 y1Var = new ag.y1(3, tnVar, str);
                        f3Var.items = charSequenceArr;
                        f3Var.onClickListener = y1Var;
                        tnVar.showDialog(f3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        tnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
                        try {
                            s1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        tn tnVar = this.f38212a;
        tnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        tnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        i(s1Var, true, false, true);
    }

    @Override
    public final boolean J1() {
        tn tnVar = this.f38212a;
        if (tnVar.T0.getKeyboardHeight() + tnVar.f42873ka >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f38212a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        tn tnVar = this.f38212a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (tnVar.P5 != j10) {
                tnVar.presentFragment(tn.R9(j10));
            } else {
                tnVar.W0.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            tnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        tn tnVar = this.f38212a;
        tnVar.Z4 = messageObject;
        tnVar.d9();
    }

    @Override
    public final boolean M0(long j10) {
        tn tnVar = this.f38212a;
        TLRPC.Chat chat = tnVar.f42787e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return tnVar.getMessagesController().isOwner(tnVar.f42787e.f22392id, j10);
        }
        return false;
    }

    @Override
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f38212a.fb(messageObject, true);
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        ArrayList<MessageObject> arrayList;
        g5.v vVar;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        tn tnVar = this.f38212a;
        fh.k kVar = tnVar.T9;
        if (kVar != null) {
            HashMap hashMap = kVar.f6827a;
            fh.j jVar = (fh.j) hashMap.get(fh.k.b(s1Var));
            org.telegram.ui.Components.mc mcVar = null;
            if (jVar != null) {
                messageObject = jVar.A;
            } else {
                messageObject = null;
            }
            fh.j jVar2 = (fh.j) tnVar.T9.f6827a.get(fh.k.b(s1Var));
            if (jVar2 != null && (i11 = jVar2.N) != -1) {
                j10 = jVar2.f6824w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = tnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.c5.h(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) tnVar.f42979t6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.x3.n(messageObject);
                    }
                    if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j11 = j10;
                    g5.v vVar2 = new g5.v(this, arrayList, j11, 17);
                    if (z10) {
                        vVar2.run();
                        vVar = null;
                    } else {
                        vVar = vVar2;
                    }
                    mcVar = org.telegram.ui.Components.tc.v(tnVar.getParentActivity(), tnVar, null, 1, j11, 1, tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), 5000, false, vVar);
                    mcVar.f30653k = true;
                    mcVar.k(mcVar.f30648e instanceof org.telegram.ui.Components.xb);
                }
            }
            fh.j jVar3 = (fh.j) hashMap.get(fh.k.b(s1Var));
            if (jVar3 != null) {
                if (mcVar == null) {
                    jVar3.N = -1;
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.rb rbVar = mcVar.f30648e;
                if (!(rbVar instanceof org.telegram.ui.Components.ub)) {
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.ub ubVar = (org.telegram.ui.Components.ub) rbVar;
                jVar3.S = ubVar;
                ubVar.f33184a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = jVar3.S.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new fh.f(0, jVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void N1(MessageObject messageObject) {
        this.f38212a.f42959s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        tn tnVar = this.f38212a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!s1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.tc a03 = org.telegram.ui.Components.tc.a0(tnVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!tnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new pm(this, 9))).k(true);
            return false;
        } else {
            tnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(tnVar.f42787e, tnVar.V7, true), s1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        bn bnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && ye.d.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        tn tnVar = this.f38212a;
        ye.c cVar = tnVar.f43024wb;
        if (cVar != null) {
            cVar.a(true);
        }
        if (s1Var.getMessageObject() == null) {
            bnVar = null;
        } else {
            bnVar = new bn(this, s1Var);
        }
        tnVar.f43024wb = bnVar;
        if (!z11 && !ye.d.f(parse, false, null)) {
            org.telegram.ui.Components.c5.r0(tnVar, str, true, true, true, !z11, tnVar.f43024wb, webPage, tnVar.f42746aa);
        } else {
            ye.d.r(tnVar.getParentActivity(), parse, true, true, false, tnVar.f43024wb, null, false, true, false);
        }
    }

    @Override
    public final boolean P() {
        tn tnVar = this.f38212a;
        if (tnVar.S5[1].size() + tnVar.S5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
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
        MessageObject messageObject = s1Var.getMessageObject();
        boolean z11 = false;
        ym ymVar = null;
        ym ymVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        ym ymVar3 = null;
        ym ymVar4 = null;
        tn tnVar = this.f38212a;
        if (i10 == 19) {
            ye.c cVar = tnVar.f43024wb;
            if (cVar != null) {
                cVar.a(true);
            }
            if (s1Var.getMessageObject() != null) {
                ymVar2 = new ym(this, s1Var, 2);
            }
            final ym ymVar5 = ymVar2;
            tnVar.f43024wb = ymVar5;
            final Activity parentActivity = tnVar.getParentActivity();
            final org.telegram.ui.ActionBar.c6 resourceProvider = tnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ymVar5.d();
            ymVar5.f50515b = new eg.k(atomicBoolean, 0);
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
            final String b10 = eg.s.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.messageOwner.date * 1000;
            eg.q0.d(messageObject, new Utilities.Callback(atomicBoolean, ymVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f6064a;
                public final ye.c f6065b;
                public final boolean f6066c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f6067e;
                public final Context f6068f;
                public final c6 f6069g;

                {
                    this.f6067e = tL_messageMediaGiveaway2;
                    this.f6068f = parentActivity;
                    this.f6069g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f6064a.get()) {
                        this.f6065b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f6066c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f6067e;
                        Context context = this.f6068f;
                        c6 c6Var = this.f6069g;
                        if (z12) {
                            s.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            s.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                        }
                    }
                }
            }, new eg.m(atomicBoolean, ymVar5, 0));
        } else if (i10 == 21) {
            h();
        } else if (i10 == 84) {
            tnVar.ua(s1Var);
        } else if (i10 == 80) {
            fh.g gVar = org.telegram.ui.Components.lg0.K;
            if (tnVar.getParentActivity() != null) {
                tnVar.showDialog(new org.telegram.ui.Components.lg0(tnVar.getContext(), tnVar.getCurrentAccount(), messageObject, tnVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                    tnVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
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
                bundle.putLong("user_id", user.f22539id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                tnVar.presentFragment(new ProfileActivity(bundle, null));
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
                tnVar.showDialog(new org.telegram.ui.Components.ke0(tnVar, null, user, null, file, qe.b.d(str, false), str3, str4, tnVar.f42746aa));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if (i10 == 30) {
            tnVar.presentFragment(new tn(j7.l1.g(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.x3.k(new StringBuilder("+"), user2.phone, qe.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = qe.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f22539id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                tnVar.presentFragment(new hs(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                tnVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    ye.c cVar2 = tnVar.f43024wb;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        ymVar3 = new ym(this, s1Var, 4);
                    }
                    tnVar.f43024wb = ymVar3;
                    ye.d.r(tnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, tnVar.f43024wb, null, false, tnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            tnVar.getOrCreateStoryViewer().G(tnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, lh.b7.a(tnVar.f42973t0));
                            return;
                        }
                    }
                }
                if (!tnVar.ea(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
                    ye.c cVar3 = tnVar.f43024wb;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        ymVar4 = new ym(this, s1Var, 5);
                    }
                    tnVar.f43024wb = ymVar4;
                    ye.d.r(tnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, tnVar.f43024wb, null, false, true, false);
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
                ye.c cVar4 = tnVar.f43024wb;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (s1Var.getMessageObject() != null) {
                    ymVar = new ym(this, s1Var, 3);
                }
                tnVar.f43024wb = ymVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        tnVar.f43024wb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        tnVar.f43024wb.f50515b = new bg.f(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new nh.l3(4, this, z11)), 27);
                        return;
                    }
                }
                ye.d.r(tnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, tnVar.f43024wb, null, false, true, false);
            }
        }
    }

    @Override
    public final CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (tnVar = this.f38212a).f42971sb) != 0 && i10 == s1Var.getMessageObject().getId() && tnVar.f42984tb == 1) {
            return tnVar.f42997ub;
        }
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var != null) {
            tn tnVar = this.f38212a;
            if (tnVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(tnVar.f42787e);
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
    public final void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            tn tnVar = this.f38212a;
            org.telegram.ui.Components.mu.I(tnVar, messageObject, tnVar.Ba, str2, str3, str4, str, i10, i11, -1, tnVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean R() {
        tn tnVar = this.f38212a;
        if (!UserObject.isReplyUser(tnVar.f42801f) && !UserObject.isUserSelf(tnVar.f42801f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        tn tnVar = this.f38212a;
        tnVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, tnVar);
    }

    @Override
    public final boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        ke keVar;
        g5.v vVar;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        bg.d1 d1Var;
        int i10;
        boolean z11;
        int i11;
        d41 d41Var;
        int i12;
        float f9;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f38212a.f43013w0.L();
                    tn tnVar = this.f38212a;
                    return mediaController.setPlaylist(L, messageObject, tnVar.H6, true ^ tnVar.f43013w0.J, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f38212a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            f41 f41Var = this.f38212a.V9;
            if (f41Var == null || f41Var.X) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.tc.a0(this.f38212a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f38212a.V9 = new f41(this.f38212a.getParentActivity());
                f41 f41Var2 = this.f38212a.V9;
                if (!messageObject.isOutOwner()) {
                    keVar = this.f38212a.fb(messageObject, true);
                } else {
                    keVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    vVar = tn.O4(this.f38212a, messageObject);
                } else {
                    vVar = null;
                }
                Context context = f41Var2.f37987a;
                bg.d1 d1Var2 = f41Var2.f37990c;
                f41Var2.T = keVar;
                f41Var2.U = vVar;
                d41 d41Var2 = f41Var2.J;
                if (d41Var2 != null) {
                    d1Var2.removeView(d41Var2);
                    f41Var2.J = null;
                }
                f41Var2.K = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                f41Var2.I = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f41Var2.O = z10;
                org.telegram.ui.Cells.s1 s1Var2 = f41Var2.K;
                if (s1Var2 != null) {
                    c6Var = s1Var2.getResourcesProvider();
                } else {
                    c6Var = null;
                }
                f41Var2.H = c6Var;
                if (f41Var2.K != null) {
                    f41Var2.P = 0.0f;
                    f41Var2.Q = s1Var.f25449n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        f41Var2.P = view.getY() + f41Var2.P;
                        f41Var2.Q = view.getY() + f41Var2.Q;
                    }
                    int width = f41Var2.K.getWidth();
                    int height = f41Var2.K.getHeight();
                    if (f41Var2.O) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    f41Var2.G = i14 - f41Var2.K.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    d1Var = d1Var2;
                    d41 d41Var3 = new d41(f41Var2, f41Var2.getContext(), UserConfig.selectedAccount, f41Var2.K.getResourcesProvider(), width, i14);
                    f41Var2.J = d41Var3;
                    f41Var2.K.j1(d41Var3);
                    f41Var2.J.i1(f41Var2.K);
                    f41Var2.J.setDelegate(new f7.v(18));
                    d41 d41Var4 = f41Var2.J;
                    MessageObject messageObject3 = f41Var2.I;
                    MessageObject.GroupedMessages currentMessagesGroup = f41Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = f41Var2.K;
                    d41Var4.X3(messageObject3, currentMessagesGroup, s1Var3.B, s1Var3.A, false, false);
                    if (!f41Var2.O) {
                        org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8();
                        f41Var2.R = h8Var;
                        d41 d41Var5 = f41Var2.J;
                        h8Var.f29115i = d41Var5;
                        d41Var5.f25278ae = h8Var;
                        if (d41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.co0 seekBarWaveform = f41Var2.J.getSeekBarWaveform();
                            seekBarWaveform.L = f41Var2.f37995s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.f27534n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    f41Var2.D = false;
                    d1Var.addView(f41Var2.J, new FrameLayout.LayoutParams(f41Var2.K.getWidth(), i14, 17));
                } else {
                    d1Var = d1Var2;
                    i10 = 360;
                }
                TextureView textureView = f41Var2.L;
                if (textureView != null) {
                    d1Var.removeView(textureView);
                    f41Var2.L = null;
                }
                if (f41Var2.O) {
                    f41Var2.M = false;
                    TextureView textureView2 = new TextureView(context);
                    f41Var2.L = textureView2;
                    d1Var.addView(textureView2, 0, i7.f6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.x61 x61Var = f41Var2.f37996w;
                if (x61Var != null) {
                    x61Var.C();
                    f41Var2.f37996w.I();
                    f41Var2.f37996w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = f41Var2.K;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(f41Var2.K.getMessageObject().currentAccount).getPathToAttach(f41Var2.K.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(f41Var2.K.getMessageObject().currentAccount).getPathToMessage(f41Var2.K.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && f41Var2.K.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(f41Var2.K.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.x61 x61Var2 = new org.telegram.ui.Components.x61();
                        f41Var2.f37996w = x61Var2;
                        x61Var2.F = new e41(f41Var2);
                        if (f41Var2.R != null) {
                            x61Var2.G = new e41(f41Var2);
                        }
                        if (f41Var2.O) {
                            x61Var2.W(f41Var2.L);
                        }
                        f41Var2.f37996w.E(Uri.fromFile(pathToAttach), "other");
                        f41Var2.f37996w.D();
                        org.telegram.ui.Components.bt btVar = f41Var2.A;
                        if (btVar != null) {
                            btVar.f27223s = f41Var2.f37996w;
                            btVar.a();
                        }
                    }
                    tn tnVar2 = this.f38212a;
                    tnVar2.showDialog(tnVar2.V9);
                    return false;
                }
                nh.t3 t3Var = f41Var2.f37997x;
                if (t3Var != null) {
                    d1Var.removeView(t3Var);
                    f41Var2.f37997x = null;
                }
                MessageObject messageObject4 = f41Var2.I;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = f41Var2.I;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(f41Var2.I.currentAccount).getClientUserId()) {
                    nh.t3 t3Var2 = new nh.t3(context, 3);
                    f41Var2.f37997x = t3Var2;
                    t3Var2.q(true);
                    if (z11) {
                        long dialogId = f41Var2.I.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(f41Var2.I.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(f41Var2.I.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        nh.t3 t3Var3 = f41Var2.f37997x;
                        if (f41Var2.O) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        t3Var3.t(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        nh.t3 t3Var4 = f41Var2.f37997x;
                        if (f41Var2.O) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        t3Var4.t(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    f41Var2.f37997x.r(12.0f);
                    nh.t3 t3Var5 = f41Var2.f37997x;
                    if (!z11 && !f41Var2.K.B) {
                        f9 = 6.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    t3Var5.setPadding(AndroidUtilities.dp(f9), 0, 0, 0);
                    if (f41Var2.O) {
                        f41Var2.f37997x.n(0.5f, 0.0f);
                        f41Var2.f37997x.G = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        f41Var2.f37997x.n(0.0f, AndroidUtilities.dp(34.0f));
                        f41Var2.f37997x.G = Layout.Alignment.ALIGN_NORMAL;
                    }
                    f41Var2.f37997x.u(14.0f);
                    nh.t3 t3Var6 = f41Var2.f37997x;
                    t3Var6.h = nh.t3.a(t3Var6.getText(), f41Var2.f37997x.getTextPaint());
                    if (f41Var2.O) {
                        d1Var.addView(f41Var2.f37997x, i7.f6.d((int) ((f41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((f41Var2.K.getHeight() + f41Var2.G) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        d1Var.addView(f41Var2.f37997x, i7.f6.d((int) ((f41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((f41Var2.K.getWidth() * (-0.39999998f)) / 2.0f) + f41Var2.K.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((f41Var2.K.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    f41Var2.f37997x.v();
                }
                TextView textView = f41Var2.f37998y;
                if (textView != null) {
                    d1Var.removeView(textView);
                    f41Var2.f37998y = null;
                }
                TextView textView2 = new TextView(context);
                f41Var2.f37998y = textView2;
                textView2.setTextColor(-1);
                f41Var2.f37998y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f41Var2.f37998y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    f41Var2.f37998y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                f41Var2.f37998y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                i7.h6.a(f41Var2.f37998y);
                TextView textView3 = f41Var2.f37998y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                f41Var2.f37998y.setOnClickListener(new b41(f41Var2, 1));
                d1Var.addView(f41Var2.f37998y, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (d41Var = f41Var2.J) != null && d41Var.getMessageObject() != null && f41Var2.J.getMessageObject().messageOwner != null) {
                    f41Var2.J.getMessageObject().messageOwner.media_unread = false;
                    f41Var2.J.invalidate();
                }
                tn tnVar22 = this.f38212a;
                tnVar22.showDialog(tnVar22.V9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        tn tnVar = this.f38212a;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (!lVar.s() && !tnVar.A9()) {
            if (!z10 && chat.signature_profiles && (messageObject = s1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                tnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                m(s1Var, chat, i10, z10);
                return;
            }
        }
        tn.b2(tnVar, s1Var, true, f9, f10);
    }

    @Override
    public final void S1() {
        org.telegram.ui.ActionBar.c6 c6Var;
        tn tnVar = this.f38212a;
        if (tnVar.T0 != null && tnVar.getParentActivity() != null) {
            Context context = tnVar.T0.getContext();
            c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
            d31.T(context, tnVar, false, c6Var, null);
        }
    }

    @Override
    public final void T(org.telegram.ui.Cells.s1 s1Var) {
        i(s1Var, true, true, false);
    }

    @Override
    public final void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ri riVar;
        int i10;
        MessageObject messageObject = s1Var.getMessageObject();
        bg.f fVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            tn tnVar = this.f38212a;
            ye.c cVar = tnVar.f43024wb;
            if (cVar != null) {
                cVar.a(true);
                tnVar.f43024wb = null;
            }
            if (s1Var.getMessageObject() == null) {
                tnVar.f43024wb = null;
                riVar = null;
            } else {
                riVar = new ri(tnVar, s1Var.getMessageObject().getId(), s1Var, 1);
                tnVar.f43024wb = riVar;
            }
            i10 = ((org.telegram.ui.ActionBar.o2) this.f38212a).currentAccount;
            jh.s7 y8 = jh.s7.y(i10, false);
            Objects.requireNonNull(riVar);
            ui uiVar = new ui(riVar, 7);
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.c6 I = jh.s7.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y8.f12787a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject p10 = ph.p2.p(I, false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                fVar = new bg.f(y8, ConnectionsManager.getInstance(y8.f12787a).sendRequest(tL_payments_getPaymentForm, new ih.c1(y8, messageObject, tL_inputInvoiceMessage, uiVar, 4)), 7);
            }
            if (fVar != null) {
                riVar.f50515b = fVar;
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
                    TLRPC.TL_message C7 = tn.C7(message);
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
                tn tnVar2 = this.f38212a;
                t12.K2(null, tnVar2, tnVar2.f42746aa);
                PhotoViewer.t1().a2(arrayList, i11, this.f38212a.a(), 0L, 0L, this.f38212a.Ca);
            }
        }
    }

    @Override
    public final int V() {
        return this.f38212a.N3;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        this.f38212a.U7(characterStyle, z10, s1Var.getMessageObject(), s1Var);
    }

    @Override
    public final void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        tn tnVar = this.f38212a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            cg.f2 f2Var = new cg.f2(tnVar, i10, user, null, null, tnVar.f42746aa);
            s1Var.getLocationOnScreen(new int[2]);
            f2Var.f3138r0 = s1Var.getNameStatusX();
            f2Var.f3139s0 = s1Var.getNameStatusY();
            f2Var.f3142v0 = s1Var.getScaleX();
            f2Var.f3140t0 = s1Var.getLeft();
            f2Var.f3141u0 = s1Var.getTop();
            f2Var.f3143w0 = s1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
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
                f2Var.f3137q0 = num;
            } else {
                f2Var.f3137q0 = Integer.valueOf(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23312r8[colorId]));
            }
            org.telegram.ui.Components.n5 n5Var = s1Var.f25291bc;
            if (n5Var != null && (n5Var.f30849f[0] instanceof org.telegram.ui.Components.p5)) {
                f2Var.f3142v0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(tnVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
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
                    t9Var.setLayerNum(7);
                    t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    t9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = f2Var.f3137q0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23383v6);
                        }
                        t9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        f2Var.f3145y0 = MessageObject.getInputStickerSet(document);
                    } else {
                        f2Var.f3145y0 = MessageObject.getInputStickerSet(document);
                    }
                    f2Var.f3144x0 = t9Var;
                    f2Var.A0 = true;
                }
            }
            tnVar.showDialog(f2Var);
            return;
        }
        ye.d.s(tnVar.getParentActivity(), "https://" + tnVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = s1Var.getMessageObject();
        }
        if (messageObject != null) {
            tn tnVar = this.f38212a;
            if (!tnVar.f42813fc && messageObject.getId() == tnVar.f42800ec) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - tnVar.gc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.s1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.W1(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final sg.a X() {
        return this.f38212a.Mb;
    }

    @Override
    public final void X0(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.f38212a;
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(tnVar.P5), s1Var);
    }

    @Override
    public final boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        if (s1Var == null) {
            messageObject = null;
        } else {
            messageObject = s1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            tn tnVar = this.f38212a;
            if (tnVar.N3 != 1 && !tnVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void Y0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.PsaMessageInfoDefault);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            MessageObject.addLinks(false, spannableStringBuilder);
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            tn tnVar = this.f38212a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = tnVar.f42973t0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = tnVar.f42973t0.getChildAt(i11);
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                                    if (messageObject2.equals(s1Var2.getMessageObject())) {
                                        s1Var = s1Var2;
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
            tnVar.Jb(messageObject, spannableStringBuilder, 1);
            s1Var.g4(1, false, true);
        }
    }

    @Override
    public final lu0 Y1() {
        return this.f38212a.f42970sa;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        x4 b10;
        int i11;
        ik ikVar;
        hk hkVar;
        if (!l()) {
            return false;
        }
        tn tnVar = this.f38212a;
        if (tnVar.f42787e != null && (((ikVar = tnVar.K0) == null || ikVar.getVisibility() != 0) && ((hkVar = tnVar.N) == null || hkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = tnVar.f42787e;
        if (chat != null && ((tnVar.Z3 == 0 || tnVar.f42779d4) && (!ChatObject.isChannel(chat) || tnVar.f42787e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c3 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.f37293n;
            c3 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c3] = d5.f37294r;
        }
        TLRPC.UserFull userFull = tnVar.getMessagesController().getUserFull(user.f22539id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        } else {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!ab.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        }
        if (ab.m.e(b10)) {
            ab.m.i().s((ViewGroup) tnVar.fragmentView, tnVar.f42746aa, b10, new z6(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(tnVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final fn f42139b;

            {
                this.f42139b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f42139b.v(user, false);
                        return;
                    case 1:
                        this.f42139b.d(user);
                        return;
                    default:
                        this.f42139b.f38212a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new u1(this, s1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final fn f42139b;

            {
                this.f42139b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f42139b.v(user, false);
                        return;
                    case 1:
                        this.f42139b.d(user);
                        return;
                    default:
                        this.f42139b.f38212a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final fn f42139b;

            {
                this.f42139b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f42139b.v(user, false);
                        return;
                    case 1:
                        this.f42139b.d(user);
                        return;
                    default:
                        this.f42139b.f38212a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f29601t = false;
        H.f29582i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final boolean a2(long j10) {
        tn tnVar = this.f38212a;
        TLRPC.Chat chat = tnVar.f42787e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return tnVar.getMessagesController().isAdmin(tnVar.f42787e.f22392id, j10);
        }
        return false;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        tn tnVar = this.f38212a;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            CharSequence fieldText = dkVar.getFieldText();
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
                tnVar.U.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new pm(this, 6), 200L);
            }
        }
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.b2(org.telegram.ui.Cells.s1, int, float, float, boolean):void");
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        tn tnVar = this.f38212a;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar2.s() && !tnVar.A9()) {
                z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
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
    public final void c0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        tn tnVar = this.f38212a;
        try {
            if (i10 == 0) {
                tnVar.h7();
                al alVar = tnVar.f43002v3;
                if (alVar != null) {
                    alVar.l(0L, 84, null, new pm(this, 1));
                    tnVar.f43002v3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(tnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (tnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.t21.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.t21.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.tc.a0(tnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                tnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(tnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", tnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new pm(this, 2));
                } else if (tnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new pm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a02.W(), a02.f32924c);
                ubVar.c(i13, 36, 36, new String[0]);
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
                ubVar.f33185b.setText(append2);
                ubVar.f33185b.setSingleLine(false);
                ubVar.f33185b.setMaxLines(6);
                a02.b(ubVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.f38212a;
        if (tnVar.f42971sb != 0 && s1Var.getMessageObject() != null && tnVar.f42971sb == s1Var.getMessageObject().getId() && tnVar.f42984tb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.s1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.c2(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        tn tnVar = this.f38212a;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            CharSequence fieldText = dkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(u3.c.k(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.d51("" + user.f22539id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            tnVar.U.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new pm(this, 7), 200L);
        }
    }

    @Override
    public final boolean d0() {
        if (this.f38212a.N3 == 0) {
            return true;
        }
        return false;
    }

    public final void e(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        tn tnVar = this.f38212a;
        tnVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(tnVar.getParentActivity()) && (chat = tnVar.f42787e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == tnVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == tnVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = tnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                org.telegram.ui.Components.uz0.b(parentActivity, i10, -tnVar.f42787e.f22392id, currentUser, str2, z15, z16, z12, c6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == tnVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(tnVar.f42787e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tnVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(tnVar.f42787e);
                tL_channels_getParticipant.participant = tnVar.getMessagesController().getInputPeer(currentUser.f22539id);
                tnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new bh.v(13, this, s1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
            org.telegram.ui.Components.uz0.b(parentActivity2, i10, -tnVar.f42787e.f22392id, currentUser, str2, z152, z162, z12, c6Var);
        }
    }

    @Override
    public final void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        this.f38212a.I7(s1Var, true, false, f9, f10, false, false, false);
    }

    @Override
    public final void e2(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        tn tnVar = this.f38212a;
        if (AndroidUtilities.isContextSafe(tnVar.getParentActivity()) && (chat = tnVar.f42787e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            e(s1Var, tnVar.getMessagesController().getParticipant(tnVar.f42787e.f22392id, currentUser.f22539id));
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.s1 s1Var) {
        bh.f fVar;
        tn tnVar = this.f38212a;
        if (tnVar.f42972sc.f49506f && (fVar = tnVar.f43049yc) != null && fVar.f2659n == s1Var && fVar.f2654a.getWidth() > 0) {
            return tnVar.f43049yc.f2654a.getHeight();
        }
        return 0;
    }

    @Override
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (tnVar = this.f38212a).f42971sb) != 0 && i10 == s1Var.getMessageObject().getId() && tnVar.f42984tb == 3) {
            return tnVar.f43010vb;
        }
        return null;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        tn tnVar = this.f38212a;
        if (tnVar.getParentActivity() != null) {
            if (tnVar.T9 == null) {
                fh.k kVar = new fh.k(tnVar.getParentActivity());
                tnVar.T9 = kVar;
                tnVar.T0.addView(kVar, i7.f6.e(-1, -1, 48));
            }
            fh.k kVar2 = tnVar.T9;
            HashMap hashMap = kVar2.f6827a;
            ArrayList arrayList = kVar2.f6829c;
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
                    long j12 = dialog.f22396id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f22396id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f22396id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f22539id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22396id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22396id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22396id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22396id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22396id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = fh.k.b(s1Var);
            if (b10 != null) {
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
                fh.j jVar = new fh.j(kVar2, s1Var, arrayList4, new ef.c(11, kVar2, b10));
                jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
                jVar.setCallback(kVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, jVar);
                }
            }
        }
    }

    @Override
    public final void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle g10 = j7.l1.g(j10, "user_id");
        org.telegram.ui.ActionBar.o2 o2Var = this.f38212a;
        if (o2Var.getMessagesController().checkCanOpenChat(g10, o2Var, s1Var.getMessageObject())) {
            o2Var.presentFragment(new tn(g10));
        }
    }

    public final void h() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        tn tnVar = this.f38212a;
        if (isHuaweiStoreApp) {
            ye.d.s(tnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ye.d.s(tnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        em emVar;
        long dialogId = messageObject.getDialogId();
        tn tnVar = this.f38212a;
        if ((dialogId == 1271266957 || ((emVar = tnVar.f43013w0) != null && emVar.J)) && tnVar.N3 != 7) {
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        oj ojVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        tn tnVar = this.f38212a;
        lj ljVar = tnVar.f42973t0;
        if (ljVar != null && (ojVar = tnVar.f42999v0) != null && ojVar.f6371y < 0) {
            for (int childCount = ljVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = tnVar.f42973t0.getChildAt(childCount);
                tnVar.f42973t0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = tnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i11 = tnVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                oj ojVar2 = tnVar.f42999v0;
                tnVar.f42973t0.getClass();
                ojVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) tnVar.f42921o9), false);
            } else {
                tnVar.f42999v0.h1(i10, i11);
            }
        }
        tnVar.J0 = z11;
        tnVar.rc(primaryMessageObject, false);
        tnVar.J0 = false;
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = bh.l.a(messageObject);
            boolean a10 = i7.n8.a(a2, 7);
            tn tnVar = this.f38212a;
            if (a10) {
                org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.e_hand_2, 36, bh.l.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                tnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                s1Var.S0(true);
            } else if (tnVar.getParentActivity() != null) {
                if (tnVar.f42853j2 == null) {
                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(5, tnVar.getParentActivity(), tnVar.f42746aa, false);
                    tnVar.f42853j2 = g40Var;
                    g40Var.setAlpha(0.0f);
                    tnVar.f42853j2.setVisibility(4);
                    int indexOfChild = tnVar.T0.indexOfChild(tnVar.O);
                    if (indexOfChild == -1) {
                        return;
                    }
                    tnVar.T0.addView(tnVar.f42853j2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f9 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                            float y8 = ((s1Var.getY() + q1Var.f25029b) - AndroidUtilities.dp(4.0f)) - tnVar.f42921o9;
                            tnVar.f42888m2 = AndroidUtilities.dp(13.3f) + q1Var.f25028a;
                            int C = b.C(6.0f, q1Var.f25029b, i12);
                            tnVar.f42901n2 = C;
                            if (y8 > 0.0f) {
                                i15 = tnVar.f42888m2;
                                i13 = C;
                                f9 = 0.0f;
                                break;
                            }
                            i16++;
                            f9 = y8;
                        } else {
                            i13 = i12;
                            i15 = i11;
                            break;
                        }
                    }
                    if (f9 != 0.0f) {
                        tnVar.f42973t0.v0(0, (int) f9, null);
                        tnVar.f42877l2 = s1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                tnVar.f42853j2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final boolean j0() {
        boolean z10;
        tn tnVar = this.f38212a;
        if (!tnVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
        TLRPC.Message message;
        if (s1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f38212a;
            o2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, o2Var, true);
            return;
        }
        fVar.run();
    }

    @Override
    public final void k() {
        h();
    }

    @Override
    public final void k1() {
        tn tnVar = this.f38212a;
        tnVar.Q7();
        UndoView undoView = tnVar.f42989u3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, tnVar.P5, null);
    }

    public final boolean l() {
        tn tnVar = this.f38212a;
        if (!UserObject.isUserSelf(tnVar.f42801f)) {
            TLRPC.Chat chat = tnVar.f42787e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !tnVar.f42787e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, boolean z10) {
        tn tnVar = this.f38212a;
        TLRPC.Chat chat2 = tnVar.f42787e;
        if (chat2 != null && chat.f22392id == chat2.f22392id) {
            gj gjVar = tnVar.W0;
            if (gjVar != null && i10 == 0) {
                gjVar.e(false, false);
            } else if (s1Var.getMessageObject() != null) {
                tnVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f22392id != chat2.f22392id || tnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22392id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ri riVar = null;
            if (z10) {
                ye.c cVar = tnVar.f43024wb;
                if (cVar != null) {
                    cVar.a(true);
                    tnVar.f43024wb = null;
                }
                if (s1Var.getMessageObject() == null) {
                    tnVar.f43024wb = null;
                } else {
                    ri riVar2 = new ri(tnVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    tnVar.f43024wb = riVar2;
                    riVar = riVar2;
                }
            }
            if (tnVar.getMessagesController().checkCanOpenChat(bundle, tnVar, s1Var.getMessageObject(), riVar)) {
                tn tnVar2 = new tn(bundle);
                if (riVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new bg.j3(this, riVar, chat, i10, tnVar2, 13), 5000L);
                    riVar.d();
                    return;
                }
                tnVar.presentFragment(tnVar2);
            }
        }
    }

    @Override
    public final void m0(String str) {
        tn tnVar = this.f38212a;
        ik ikVar = tnVar.K0;
        if (ikVar == null || ikVar.getVisibility() != 0) {
            hk hkVar = tnVar.N;
            if ((hkVar == null || hkVar.getVisibility() != 0) && tnVar.U != null && str != null && str.length() > 0) {
                dk dkVar = tnVar.U;
                dkVar.setFieldText("@" + str + " ");
                tnVar.U.H0();
            }
        }
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        tn tnVar = this.f38212a;
        if (!tnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tnVar.getParentActivity() != null) {
                if (tnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    dk dkVar = tnVar.U;
                    MessageObject messageObject = s1Var.getMessageObject();
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    qi qiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    ye.c cVar = tnVar.f43024wb;
                    if (cVar != null) {
                        cVar.a(true);
                        tnVar.f43024wb = null;
                    }
                    if (str != null && s1Var.getMessageObject() != null) {
                        qi qiVar2 = new qi(tnVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                        tnVar.f43024wb = qiVar2;
                        qiVar = qiVar2;
                    } else {
                        tnVar.f43024wb = null;
                    }
                    dkVar.c0(keyboardButtonProto, messageObject, messageObject2, qiVar);
                }
            }
        }
    }

    @Override
    public final boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (s1Var != null && pageBlock != null) {
            tn tnVar = this.f38212a;
            if (tnVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, tnVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new nm(tnVar, arrayList), null, 0L, 0L, 0L, true, new mm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                O1(s1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            tn tnVar = this.f38212a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(tnVar)) {
                    rc0 rc0Var = new rc0(3);
                    c6Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                    rc0Var.setResourceProvider(c6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = tnVar.getMessagesController().getPeer(tnVar.a());
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
                    rc0Var.K0 = false;
                    rc0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    tnVar.presentFragment(rc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                ht.q().w(tnVar.getParentActivity());
                ht.q().v(new dn(this, tL_messageMediaPoll, pollAnswer, s1Var));
                ht q6 = ht.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = s1Var.getMessageObject();
                c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                q6.t(document4, null, "", null, null, i18, false, messageObject2, c6Var, 200);
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
                    TLRPC.TL_message C7 = tn.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = bh.i.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    bh.a aVar = new bh.a(i15, messageObject, document6, bh.i.c(messageObject.messageOwner, i10));
                    if (aVar.f2646g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = s1Var.f25556u7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            bh.j jVar = s1Var.Y5;
                            if (jVar != null) {
                                jVar.e();
                            }
                            bh.j jVar2 = s1Var.X5;
                            if (jVar2 != null) {
                                jVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f2645f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = s1Var.f25556u7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            bh.j jVar3 = s1Var.Y5;
                            if (jVar3 != null) {
                                jVar3.e();
                            }
                            bh.j jVar4 = s1Var.X5;
                            if (jVar4 != null) {
                                jVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = tn.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = bh.i.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, tnVar, tnVar.f42746aa);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = tnVar.P5;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = tnVar.H6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = tnVar.b();
                            }
                            t12.c2(messageObject6, tnVar, j10, j11, j12, tnVar.Ba);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, tnVar.getParentActivity(), tnVar.f42746aa, false);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            tnVar.z6(messageObject6);
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
                    TLRPC.TL_message C73 = tn.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = bh.i.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = tn.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = bh.i.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                kf.d.b(tL_messageMediaPoll.poll, tnVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message C75 = tn.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = bh.i.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, tnVar, tnVar.f42746aa);
                    PhotoViewer.t1().a2(arrayList3, i11, tnVar.a(), 0L, 0L, tnVar.Ca);
                }
            }
        }
    }

    @Override
    public final boolean n0(org.telegram.ui.Components.y5 y5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        tn tnVar = this.f38212a;
        if (!tnVar.getMessagesController().premiumFeaturesBlocked() && y5Var != null && !y5Var.standard) {
            long documentId = y5Var.getDocumentId();
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                document = org.telegram.ui.Components.p5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.jv jvVar = new org.telegram.ui.Components.jv(tnVar, tnVar.getParentActivity(), tnVar.f42746aa, arrayList);
                org.telegram.ui.Components.zu zuVar = jvVar.f29826f;
                zuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(zuVar);
                zuVar.v = imageReceiver;
                if (zuVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                zuVar.f35430w = true;
                zuVar.f35431x.d(1.0f, true);
                zuVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f, true), 0L, null, null, 0);
                zuVar.v.setLayerNum(7);
                zuVar.v.setAllowStartLottieAnimation(true);
                zuVar.v.setAllowStartAnimation(true);
                zuVar.v.setAutoRepeat(1);
                zuVar.v.setAllowDecodeSingleFrame(true);
                zuVar.v.setParentView(zuVar);
                jvVar.setCalcMandatoryInsets(tnVar.x9());
                tnVar.showDialog(jvVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f38212a.rc(primaryMessageObject, false);
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var) {
        if (s1Var.getMessageObject().isImportedForward()) {
            k1();
            return;
        }
        tn tnVar = this.f38212a;
        if (!tnVar.f42829h3 && tnVar.f42973t0 != null && tnVar.getParentActivity() != null && tnVar.fragmentView != null) {
            if (tnVar.f42939q2 == null) {
                km kmVar = tnVar.T0;
                int indexOfChild = kmVar.indexOfChild(tnVar.O);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(1, tnVar.getParentActivity(), tnVar.f42746aa, false);
                    tnVar.f42939q2 = g40Var;
                    kmVar.addView(g40Var, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    tnVar.f42939q2.setAlpha(0.0f);
                    tnVar.f42939q2.setVisibility(4);
                } else {
                    return;
                }
            }
            tnVar.f42939q2.e(s1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void p() {
        this.f38212a.T0.getClass();
    }

    @Override
    public final void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        tn tnVar = this.f38212a;
        tnVar.I7(s1Var, false, false, f9, f10, true, false, false);
        tnVar.f42973t0.getClass();
        tn.c2(tnVar, RecyclerView.R(s1Var));
    }

    @Override
    public final void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var != null && document != null) {
            tn tnVar = this.f38212a;
            if (tnVar.getParentLayout() != null && Y(s1Var)) {
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(tnVar, s1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new u1(this, s1Var, document, 24), false);
                H.f29601t = false;
                H.Z();
            }
        }
    }

    public final void q(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22539id);
            org.telegram.ui.ActionBar.o2 o2Var = this.f38212a;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var, s1Var.getMessageObject())) {
                o2Var.presentFragment(new tn(bundle));
            }
        }
    }

    @Override
    public final void q2() {
        this.f38212a.r9();
    }

    public final void r(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22392id);
            bundle.putBoolean("expandPhoto", false);
            this.f38212a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.s(org.telegram.ui.Cells.s1):void");
    }

    @Override
    public final void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        this.f38212a.W7(s1Var, reactionCount, z10, f9, f10);
    }

    @Override
    public final void t() {
        this.f38212a.Yb();
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.f38212a;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        boolean z10 = true;
        if (!lVar.s() && !tnVar.A9()) {
            if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
                P0(10, s1Var);
                return;
            }
            if (!ChatObject.isForum(tnVar.f42787e) && !tnVar.F9()) {
                z10 = false;
            }
            v(user, z10);
            return;
        }
        tn.b2(tnVar, s1Var, true, f9, f10);
    }

    @Override
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        oj ojVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            tn tnVar = this.f38212a;
            lj ljVar = tnVar.f42973t0;
            if (ljVar != null && (ojVar = tnVar.f42999v0) != null && ojVar.f6371y < 0) {
                for (int childCount = ljVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = tnVar.f42973t0.getChildAt(childCount);
                    tnVar.f42973t0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = tnVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = tnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            tnVar.rc(primaryMessageObject, false);
            nh.t3 t3Var = tnVar.f43014w1;
            if (t3Var != null) {
                t3Var.e(true);
            }
            if (i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
                tnVar.f42999v0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        fh.j jVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        fh.k kVar = this.f38212a.T9;
        if (kVar != null && (jVar = (fh.j) kVar.f6827a.get(fh.k.b(s1Var))) != null) {
            fh.d[] dVarArr = jVar.f6824w;
            RectF rectF = jVar.f6822r;
            if (jVar.I) {
                float f12 = (f9 - rectF.left) + jVar.Q;
                float f13 = (f10 - rectF.top) + jVar.R;
                int i11 = fh.i.f6812a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(fh.i.f6812a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = i7.w.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (jVar.N != i10) {
                    jVar.f6816a.performHapticFeedback(3, 1);
                    jVar.N = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        fh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f6786p != z10) {
                            ValueAnimator valueAnimator = dVar.f6784n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f6786p = z10;
                            float f15 = dVar.f6785o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f6784n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f6784n.addUpdateListener(dVar);
                            dVar.f6784n.setInterpolator(fh.h.f6794a);
                            dVar.f6784n.start();
                        }
                        fh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f6783m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f6781k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f6783m = z11;
                            float f16 = dVar2.f6782l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f6781k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f6781k.addUpdateListener(dVar2);
                            dVar2.f6781k.setInterpolator(fh.h.f6794a);
                            dVar2.f6781k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean u2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        tn tnVar = this.f38212a;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        if (z10 && tnVar.F9) {
            b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                ((ActionBarLayout) b5Var2).r();
            }
            return true;
        }
        return !c();
    }

    public final void v(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f22539id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z10 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22539id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            tn tnVar = this.f38212a;
            TLRPC.User user2 = tnVar.f42801f;
            if (user2 != null && user2.f22539id == user.f22539id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            tnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 r37, float r38, float r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.v0(org.telegram.ui.Cells.s1, float, float, boolean):void");
    }

    @Override
    public final void w(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = s1Var.getMessageObject();
        }
        MessageObject messageObject2 = messageObject;
        TLRPC.MessageReplies messageReplies = messageObject2.messageOwner.replies;
        if (messageReplies != null) {
            int i11 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
            i10 = i11;
        } else {
            j10 = 0;
            i10 = -1;
        }
        long j11 = j10;
        tn tnVar = this.f38212a;
        tnVar.aa(tnVar.f42787e.f22392id, messageObject2, messageObject2.getId(), j11, i10, 0, null);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f38212a.f42959s.containsKey(messageObject);
    }

    @Override
    public final void w2() {
        tn tnVar = this.f38212a;
        if (tnVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", tnVar.P5);
            bundle.putInt("start_from", 10);
            tnVar.presentFragment(new org.telegram.ui.Components.y90(bundle, tnVar.W0.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", tnVar.getMessagesController().recommendedChannelsLimitPremium), new pm(this, 4))).j();
    }

    @Override
    public final void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        tn tnVar = this.f38212a;
        nh.t3 t3Var = tnVar.f43014w1;
        if (t3Var != null) {
            t3Var.e(true);
        }
        if (tnVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e10) {
                FileLog.e(e10);
                str = factCheck.country;
            }
            nh.t3 t3Var2 = new nh.t3(tnVar.getParentActivity(), 3);
            t3Var2.q(true);
            t3Var2.G = Layout.Alignment.ALIGN_NORMAL;
            t3Var2.d = -1L;
            t3Var2.P = true;
            t3Var2.f18592e = true;
            t3Var2.r(12.0f);
            tnVar.f43014w1 = t3Var2;
            t3Var2.f18597h0 = new vf(15, this, t3Var2);
            t3Var2.t(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            tnVar.T0.addView(tnVar.f43014w1, i7.f6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            tnVar.T0.post(new j3.f0(this, s1Var, i11, i10, 4));
        }
    }

    @Override
    public final String y(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        tn tnVar = this.f38212a;
        if (UserObject.isBotForum(tnVar.f42801f)) {
            return null;
        }
        TLRPC.Chat chat = tnVar.f42787e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = tnVar.getMessagesController().getAdminRank(tnVar.f42787e.f22392id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = tnVar.Y3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var) {
        bh.f fVar = this.f38212a.f43049yc;
        if (fVar != null && fVar.f2659n == s1Var) {
            fVar.f2662w.getClass();
        }
    }

    @Override
    public final org.telegram.ui.Cells.l9 y2() {
        return this.f38212a.Y8;
    }

    @Override
    public final void z0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.c6 animation;
        tn tnVar = this.f38212a;
        if (!tnVar.f42829h3 && !SharedConfig.noSoundHintShowed && tnVar.f42973t0 != null && tnVar.getParentActivity() != null && tnVar.fragmentView != null) {
            org.telegram.ui.Components.g40 g40Var = tnVar.f42926p2;
            if (g40Var == null || g40Var.getTag() == null) {
                if (tnVar.f42926p2 == null) {
                    km kmVar = tnVar.T0;
                    int indexOfChild = kmVar.indexOfChild(tnVar.O);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.g40 g40Var2 = new org.telegram.ui.Components.g40(0, tnVar.getParentActivity(), tnVar.f42746aa, false);
                        tnVar.f42926p2 = g40Var2;
                        g40Var2.setShowingDuration(10000L);
                        kmVar.addView(tnVar.f42926p2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        tnVar.f42926p2.setAlpha(0.0f);
                        tnVar.f42926p2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = tnVar.f42973t0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = tnVar.f42973t0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && tnVar.f42926p2.e(s1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }
}
