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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
public final class pn implements org.telegram.ui.Cells.k1 {
    public final eo f35881a;

    public pn(eo eoVar) {
        this.f35881a = eoVar;
    }

    public static void a(pn pnVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        eo eoVar = pnVar.f35881a;
        if (eoVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && eoVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                eoVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
                tL_message.f17216id = messageObject.getId();
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
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(eoVar.getParentActivity(), eoVar.getAccountInstance(), arrayList, new wa(pnVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.f35881a;
        if (!eoVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(eoVar.getParentActivity(), 3, null);
            d2Var.q(200L);
            eoVar.getMessagesController().getContentSettings(new z(this, d2Var, t1Var, 5));
            return;
        }
        if (t1Var.getMessageObject() != null) {
            t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        t1Var.h4();
    }

    @Override
    public final void A0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.c6 animation;
        eo eoVar = this.f35881a;
        if (!eoVar.f32394l3 && !SharedConfig.noSoundHintShowed && eoVar.f32542x0 != null && eoVar.getParentActivity() != null && eoVar.fragmentView != null) {
            org.telegram.ui.Components.s40 s40Var = eoVar.f32493t2;
            if (s40Var == null || s40Var.getTag() == null) {
                if (eoVar.f32493t2 == null) {
                    vm vmVar = eoVar.X0;
                    int indexOfChild = vmVar.indexOfChild(eoVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.s40 s40Var2 = new org.telegram.ui.Components.s40(0, eoVar.getParentActivity(), eoVar.f32316ea, false);
                        eoVar.f32493t2 = s40Var2;
                        s40Var2.setShowingDuration(10000L);
                        vmVar.addView(eoVar.f32493t2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        eoVar.f32493t2.setAlpha(0.0f);
                        eoVar.f32493t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = eoVar.f32542x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = eoVar.f32542x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && eoVar.f32493t2.e(t1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        eo eoVar = this.f35881a;
        if (eoVar.getParentActivity() != null && tLObject != null) {
            f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                if (((ActionBarLayout) f5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f17195id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f17342id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, eoVar.getParentActivity(), eoVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(eoVar.getParentActivity(), false, false);
                g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                g1Var.setMinimumWidth(160);
                g1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(eoVar.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, t1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                eo eoVar2 = new eo(bundle);
                eoVar2.J9 = true;
                eoVar.presentFragmentAsPreviewWithMenu(eoVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                eoVar.d7();
                return;
            }
            eoVar.presentFragment(new eo(bundle));
        }
    }

    @Override
    public final void B1(org.telegram.ui.Cells.t1 t1Var) {
        eo.U4(this.f35881a, t1Var);
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        boolean z10;
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        eo eoVar = this.f35881a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(eoVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(eoVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = eoVar.getMessagesController().conferenceCallSizeLimit;
                d2Var.setOnCancelListener(new ba(this, eoVar.getConnectionsManager().sendRequest(getgroupcall, new bi.ze(this, d2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
                d2Var.q(600L);
                return;
            }
            TLRPC.User user = eoVar.f32318f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = eoVar.f32262a8;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.e2.m(user, isVideoCall, z10, eoVar.getParentActivity(), eoVar.getMessagesController().getUserFull(eoVar.f32318f.f17342id), eoVar.getAccountInstance());
                return;
            }
            return;
        }
        eoVar.I7(t1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void C1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        k(t1Var, z10, false, false);
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
            int i13 = buttonCustom.f14631id;
            TL_stars.StarsAmount starsAmount = null;
            eo eoVar = this.f35881a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                pf pfVar = new pf(8, this, message);
                Pattern pattern = org.telegram.ui.Components.d5.f22289a;
                Activity parentActivity = eoVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
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
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.s4(parentActivity)});
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new oe(17, pfVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d2Var.N = new org.telegram.ui.Components.r1(editText, 0);
                frameLayout.addView(editText, w7.a6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rg(editText, 3), 100L);
                eoVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, eoVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, eoVar.e, 5);
                    }
                    bi.g2 g2Var = new bi.g2(this, message, canManageMonoForum, messageObject, 11);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    eoVar.g7(g2Var, yf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                eoVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                eoVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.f35881a;
        eoVar.f32552xa.l(t1Var, eoVar, true);
        eoVar.f32542x0.I0(false);
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, false, true);
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
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
        tk tkVar;
        sk skVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        eo eoVar = this.f35881a;
        if (!isEmpty && eoVar.e != null && (((tkVar = eoVar.O0) == null || tkVar.getVisibility() != 0) && ((skVar = eoVar.R) == null || skVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = eoVar.e;
        if (chat2 != null && ((eoVar.f32298d4 == 0 || eoVar.f32346h4) && (!ChatObject.isChannel(chat2) || eoVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = eoVar.e;
        if (chat3 != null && chat3.f17195id == chat.f17195id && !eoVar.F9()) {
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
                d5Var = d5.f31825f;
            }
            d5VarArr[1] = d5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            d5VarArr[i13] = d5.f31826n;
            i13++;
        }
        if (i11 != 0) {
            d5VarArr[i13] = d5.f31827r;
        }
        TLRPC.ChatFull chatFull = eoVar.getMessagesController().getChatFull(chat.f17195id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
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
            com.google.firebase.messaging.m.k().v((ViewGroup) eoVar.fragmentView, eoVar.f32316ea, x4Var, new a7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(eoVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new dn(this, chat, 0), false);
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
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new dn(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new dn(this, chat, 2), i16);
        H.f28702t = false;
        H.f28683i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void F1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        eo eoVar = this.f35881a;
        if (!eoVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (eoVar.getParentActivity() != null) {
                if (eoVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) eoVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) eoVar.f32316ea, false);
                        h3Var.fixNavigationBar();
                        h3Var.title = str;
                        h3Var.bigTitle = false;
                        h3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        kg.j jVar = new kg.j(4, eoVar, str);
                        h3Var.items = charSequenceArr;
                        h3Var.onClickListener = jVar;
                        eoVar.showDialog(h3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        eoVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            eo eoVar = this.f35881a;
            if ((eoVar.f32540wb != id2 || eoVar.f32553xb != 7) && (inputPeer = eoVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f17418id = id2;
                nf.e eVar = eoVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    eoVar.Ab = null;
                }
                cj cjVar = new cj(eoVar, id2, t1Var, 2);
                cjVar.f14040b = new n(27, eoVar, r3);
                eoVar.Ab = cjVar;
                cjVar.d();
                int[] iArr = {eoVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new ng(eoVar, cjVar, iArr, t1Var, messageObject))};
            }
        }
    }

    @Override
    public final boolean G1() {
        eo eoVar = this.f35881a;
        if (eoVar.X0.getKeyboardHeight() + eoVar.f32436oa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.em.o(R.string.CodeCopied, org.telegram.ui.Components.wc.a0(this.f35881a));
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        eo eoVar = this.f35881a;
        eoVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        eoVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(t1Var, true, false, true);
    }

    @Override
    public final void I1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        eo eoVar = this.f35881a;
        eoVar.f32299d5 = messageObject;
        eoVar.d9();
    }

    @Override
    public final void K(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f35881a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void K1(MessageObject messageObject) {
        this.f35881a.f32477s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        eo eoVar = this.f35881a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (eoVar.T5 != j3) {
                eoVar.presentFragment(eo.R9(j3));
            } else {
                eoVar.f32256a1.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            eoVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        ln lnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && nf.f.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        eo eoVar = this.f35881a;
        nf.e eVar = eoVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        if (t1Var.getMessageObject() == null) {
            lnVar = null;
        } else {
            lnVar = new ln(this, t1Var);
        }
        eoVar.Ab = lnVar;
        if (!z11 && !nf.f.f(parse, false, null)) {
            org.telegram.ui.Components.d5.r0(eoVar, str, true, true, true, !z11, eoVar.Ab, webPage, eoVar.f32316ea);
        } else {
            nf.f.r(eoVar.getParentActivity(), parse, true, true, false, eoVar.Ab, null, false, true, false);
        }
    }

    @Override
    public final void M(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f35881a.fb(messageObject, true);
        }
    }

    @Override
    public final boolean M0(long j3) {
        eo eoVar = this.f35881a;
        TLRPC.Chat chat = eoVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return eoVar.getMessagesController().isOwner(eoVar.e.f17195id, j3);
        }
        return false;
    }

    @Override
    public final CharacterStyle M1(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (eoVar = this.f35881a).f32540wb) != 0 && i10 == t1Var.getMessageObject().getId() && eoVar.f32553xb == 1) {
            return eoVar.f32565yb;
        }
        return null;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        eo eoVar = this.f35881a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!t1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc a03 = org.telegram.ui.Components.wc.a0(eoVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!eoVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new an(this, 9))).k(true);
            return false;
        } else {
            eoVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(eoVar.e, eoVar.Z7, true), t1Var.getMessageObject(), todoItem, z10, null);
            return true;
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
        eo eoVar = this.f35881a;
        th.j jVar = eoVar.X9;
        if (jVar != null) {
            HashMap hashMap = jVar.f42239a;
            th.i iVar = (th.i) hashMap.get(th.j.b(t1Var));
            org.telegram.ui.Components.pc pcVar = null;
            if (iVar != null) {
                messageObject = iVar.E;
            } else {
                messageObject = null;
            }
            th.i iVar2 = (th.i) eoVar.X9.f42239a.get(th.j.b(t1Var));
            if (iVar2 != null && (i11 = iVar2.R) != -1) {
                j3 = iVar2.f42236w[i11].d;
            } else {
                j3 = 0;
            }
            if (messageObject != null && j3 != 0) {
                Activity parentActivity = eoVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.d5.h(parentActivity, i10, j3, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) eoVar.f32548x6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.a2.l(messageObject);
                    }
                    if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j10 = j3;
                    a3.h0 h0Var2 = new a3.h0(this, arrayList, j10, 9);
                    if (z10) {
                        h0Var2.run();
                        h0Var = null;
                    } else {
                        h0Var = h0Var2;
                    }
                    pcVar = org.telegram.ui.Components.wc.v(eoVar.getParentActivity(), eoVar, null, 1, j10, 1, eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, h0Var);
                    pcVar.f26082k = true;
                    pcVar.k(pcVar.e instanceof org.telegram.ui.Components.ac);
                }
            }
            th.i iVar3 = (th.i) hashMap.get(th.j.b(t1Var));
            if (iVar3 != null) {
                if (pcVar == null) {
                    iVar3.R = -1;
                    iVar3.c();
                    return;
                }
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                if (!(tbVar instanceof org.telegram.ui.Components.xb)) {
                    iVar3.c();
                    return;
                }
                org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) tbVar;
                iVar3.W = xbVar;
                xbVar.f28999a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = iVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new jm(2, iVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            eo eoVar = this.f35881a;
            org.telegram.ui.Components.zu.J(eoVar, messageObject, eoVar.Fa, str2, str3, str4, str, i10, i11, -1, eoVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean O() {
        eo eoVar = this.f35881a;
        if (eoVar.W5[1].size() + eoVar.W5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        ve veVar;
        a3.h0 h0Var;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        bi.n7 n7Var;
        int i10;
        boolean z11;
        int i11;
        l51 l51Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f35881a.A0.L();
                    eo eoVar = this.f35881a;
                    return mediaController.setPlaylist(L, messageObject, eoVar.L6, true ^ eoVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f35881a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            n51 n51Var = this.f35881a.Z9;
            if (n51Var == null || n51Var.f35123b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.wc.a0(this.f35881a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f35881a.Z9 = new n51(this.f35881a.getParentActivity());
                n51 n51Var2 = this.f35881a.Z9;
                if (!messageObject.isOutOwner()) {
                    veVar = this.f35881a.fb(messageObject, true);
                } else {
                    veVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    h0Var = eo.O4(this.f35881a, messageObject);
                } else {
                    h0Var = null;
                }
                Context context = n51Var2.f35120a;
                bi.n7 n7Var2 = n51Var2.f35124c;
                n51Var2.X = veVar;
                n51Var2.Y = h0Var;
                l51 l51Var2 = n51Var2.N;
                if (l51Var2 != null) {
                    n7Var2.removeView(l51Var2);
                    n51Var2.N = null;
                }
                n51Var2.O = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                n51Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n51Var2.S = z10;
                org.telegram.ui.Cells.t1 t1Var2 = n51Var2.O;
                if (t1Var2 != null) {
                    f6Var = t1Var2.getResourcesProvider();
                } else {
                    f6Var = null;
                }
                n51Var2.L = f6Var;
                if (n51Var2.O != null) {
                    n51Var2.T = 0.0f;
                    n51Var2.U = t1Var.f20236n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        n51Var2.T = view.getY() + n51Var2.T;
                        n51Var2.U = view.getY() + n51Var2.U;
                    }
                    int width = n51Var2.O.getWidth();
                    int height = n51Var2.O.getHeight();
                    if (n51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    n51Var2.K = i14 - n51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    n7Var = n7Var2;
                    l51 l51Var3 = new l51(n51Var2, n51Var2.getContext(), UserConfig.selectedAccount, n51Var2.O.getResourcesProvider(), width, i14);
                    n51Var2.N = l51Var3;
                    n51Var2.O.j1(l51Var3);
                    n51Var2.N.i1(n51Var2.O);
                    n51Var2.N.setDelegate(new Object());
                    l51 l51Var4 = n51Var2.N;
                    MessageObject messageObject3 = n51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = n51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = n51Var2.O;
                    l51Var4.X3(messageObject3, currentMessagesGroup, t1Var3.F, t1Var3.E, false, false);
                    if (!n51Var2.S) {
                        org.telegram.ui.Components.k8 k8Var = new org.telegram.ui.Components.k8();
                        n51Var2.V = k8Var;
                        l51 l51Var5 = n51Var2.N;
                        k8Var.f24658i = l51Var5;
                        l51Var5.f20123ee = k8Var;
                        if (l51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.ro0 seekBarWaveform = n51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = n51Var2.f35131s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.f26721n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    n51Var2.H = false;
                    n7Var.addView(n51Var2.N, new FrameLayout.LayoutParams(n51Var2.O.getWidth(), i14, 17));
                } else {
                    n7Var = n7Var2;
                    i10 = 360;
                }
                TextureView textureView = n51Var2.P;
                if (textureView != null) {
                    n7Var.removeView(textureView);
                    n51Var2.P = null;
                }
                if (n51Var2.S) {
                    n51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    n51Var2.P = textureView2;
                    n7Var.addView(textureView2, 0, w7.a6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.t71 t71Var = n51Var2.f35132w;
                if (t71Var != null) {
                    t71Var.B();
                    n51Var2.f35132w.H();
                    n51Var2.f35132w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = n51Var2.O;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(n51Var2.O.getMessageObject().currentAccount).getPathToAttach(n51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(n51Var2.O.getMessageObject().currentAccount).getPathToMessage(n51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && n51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(n51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.t71 t71Var2 = new org.telegram.ui.Components.t71();
                        n51Var2.f35132w = t71Var2;
                        t71Var2.J = new m51(n51Var2);
                        if (n51Var2.V != null) {
                            t71Var2.K = new m51(n51Var2);
                        }
                        if (n51Var2.S) {
                            t71Var2.V(n51Var2.P);
                        }
                        n51Var2.f35132w.D(Uri.fromFile(pathToAttach), "other");
                        n51Var2.f35132w.C();
                        org.telegram.ui.Components.ot otVar = n51Var2.E;
                        if (otVar != null) {
                            otVar.f25910s = n51Var2.f35132w;
                            otVar.a();
                        }
                    }
                    eo eoVar2 = this.f35881a;
                    eoVar2.showDialog(eoVar2.Z9);
                    return false;
                }
                bi.x4 x4Var = n51Var2.f35133x;
                if (x4Var != null) {
                    n7Var.removeView(x4Var);
                    n51Var2.f35133x = null;
                }
                MessageObject messageObject4 = n51Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = n51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(n51Var2.M.currentAccount).getClientUserId()) {
                    bi.x4 x4Var2 = new bi.x4(context, 3);
                    n51Var2.f35133x = x4Var2;
                    x4Var2.p(true);
                    if (z11) {
                        long dialogId = n51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(n51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(n51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        bi.x4 x4Var3 = n51Var2.f35133x;
                        if (n51Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        x4Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        bi.x4 x4Var4 = n51Var2.f35133x;
                        if (n51Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        x4Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    n51Var2.f35133x.q(12.0f);
                    bi.x4 x4Var5 = n51Var2.f35133x;
                    if (!z11 && !n51Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    x4Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (n51Var2.S) {
                        n51Var2.f35133x.m(0.5f, 0.0f);
                        n51Var2.f35133x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        n51Var2.f35133x.m(0.0f, AndroidUtilities.dp(34.0f));
                        n51Var2.f35133x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    n51Var2.f35133x.t(14.0f);
                    bi.x4 x4Var6 = n51Var2.f35133x;
                    x4Var6.h = bi.x4.a(x4Var6.getText(), n51Var2.f35133x.getTextPaint());
                    if (n51Var2.S) {
                        n7Var.addView(n51Var2.f35133x, w7.a6.d((int) ((n51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((n51Var2.O.getHeight() + n51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        n7Var.addView(n51Var2.f35133x, w7.a6.d((int) ((n51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((n51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + n51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((n51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    n51Var2.f35133x.u();
                }
                TextView textView = n51Var2.f35134y;
                if (textView != null) {
                    n7Var.removeView(textView);
                    n51Var2.f35134y = null;
                }
                TextView textView2 = new TextView(context);
                n51Var2.f35134y = textView2;
                textView2.setTextColor(-1);
                n51Var2.f35134y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    n51Var2.f35134y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    n51Var2.f35134y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                n51Var2.f35134y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.c6.a(n51Var2.f35134y);
                TextView textView3 = n51Var2.f35134y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                n51Var2.f35134y.setOnClickListener(new j51(n51Var2, 1));
                n7Var.addView(n51Var2.f35134y, w7.a6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (l51Var = n51Var2.N) != null && l51Var.getMessageObject() != null && n51Var2.N.getMessageObject().messageOwner != null) {
                    n51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    n51Var2.N.invalidate();
                }
                eo eoVar22 = this.f35881a;
                eoVar22.showDialog(eoVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var != null) {
            eo eoVar = this.f35881a;
            if (eoVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(eoVar.e);
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
        in inVar = null;
        in inVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        in inVar3 = null;
        in inVar4 = null;
        eo eoVar = this.f35881a;
        if (i10 == 19) {
            nf.e eVar = eoVar.Ab;
            if (eVar != null) {
                eVar.a(true);
            }
            if (t1Var.getMessageObject() != null) {
                inVar2 = new in(this, t1Var, 2);
            }
            final in inVar5 = inVar2;
            eoVar.Ab = inVar5;
            final Activity parentActivity = eoVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = eoVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            inVar5.d();
            inVar5.f14040b = new sg.d(atomicBoolean, 0);
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
            final String b10 = sg.i.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.messageOwner.date * 1000;
            sg.s.d(messageObject, new Utilities.Callback(atomicBoolean, inVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f41908a;
                public final nf.e f41909b;
                public final boolean f41910c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f41911f;
                public final f6 f41912g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f41911f = parentActivity;
                    this.f41912g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f41908a.get()) {
                        this.f41909b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f41910c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f41911f;
                        f6 f6Var = this.f41912g;
                        if (z12) {
                            i.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            i.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        }
                    }
                }
            }, new sg.f(atomicBoolean, inVar5, 0));
        } else if (i10 == 21) {
            h();
        } else if (i10 == 84) {
            eoVar.ua(t1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.u8 u8Var = org.telegram.ui.Components.zg0.O;
            if (eoVar.getParentActivity() != null) {
                eoVar.showDialog(new org.telegram.ui.Components.zg0(eoVar.getContext(), eoVar.getCurrentAccount(), messageObject, eoVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    eoVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
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
                bundle.putLong("user_id", user.f17342id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                eoVar.presentFragment(new ProfileActivity(bundle, null));
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
                eoVar.showDialog(new org.telegram.ui.Components.ye0(eoVar, null, user, null, file, gf.b.d(str, false), str3, str4, eoVar.f32316ea));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            eoVar.presentFragment(new eo(w.f.e(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.a2.j(new StringBuilder("+"), user2.phone, gf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = gf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f17342id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                eoVar.presentFragment(new ts(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                eoVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    nf.e eVar2 = eoVar.Ab;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        inVar3 = new in(this, t1Var, 4);
                    }
                    eoVar.Ab = inVar3;
                    nf.f.r(eoVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, eoVar.Ab, null, false, eoVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            eoVar.getOrCreateStoryViewer().G(eoVar.getParentActivity(), tL_webPageAttributeStory.storyItem, zh.s5.a(eoVar.f32542x0));
                            return;
                        }
                    }
                }
                if (!eoVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
                    nf.e eVar3 = eoVar.Ab;
                    if (eVar3 != null) {
                        eVar3.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        inVar4 = new in(this, t1Var, 5);
                    }
                    eoVar.Ab = inVar4;
                    nf.f.r(eoVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, eoVar.Ab, null, false, true, false);
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
                nf.e eVar4 = eoVar.Ab;
                if (eVar4 != null) {
                    eVar4.a(true);
                }
                if (t1Var.getMessageObject() != null) {
                    inVar = new in(this, t1Var, 3);
                }
                eoVar.Ab = inVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        eoVar.Ab.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        eoVar.Ab.f14040b = new bi.s(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new bi.m4(4, this, z11)), 25);
                        return;
                    }
                }
                nf.f.r(eoVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, eoVar.Ab, null, false, true, false);
            }
        }
    }

    @Override
    public final boolean Q() {
        eo eoVar = this.f35881a;
        if (!UserObject.isReplyUser(eoVar.f32318f) && !UserObject.isUserSelf(eoVar.f32318f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void Q1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        eo eoVar = this.f35881a;
        if (eoVar.X0 != null && eoVar.getParentActivity() != null) {
            Context context = eoVar.X0.getContext();
            f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
            n41.T(context, eoVar, false, f6Var, null);
        }
    }

    @Override
    public final void R(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        eo eoVar = this.f35881a;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (!lVar.s() && !eoVar.A9()) {
            if (!z10 && chat.signature_profiles && (messageObject = t1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                eoVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                p(t1Var, chat, i10, z10);
                return;
            }
        }
        eo.b2(eoVar, t1Var, true, f7, f10);
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        eo eoVar = this.f35881a;
        eoVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, eoVar);
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, true, false);
    }

    @Override
    public final void S1(org.telegram.ui.Cells.t1 t1Var, ai.j jVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            jVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f35881a;
            p2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, p2Var, true);
            return;
        }
        jVar.run();
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        cj cjVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        pg.f2 f2Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            eo eoVar = this.f35881a;
            nf.e eVar = eoVar.Ab;
            if (eVar != null) {
                eVar.a(true);
                eoVar.Ab = null;
            }
            if (t1Var.getMessageObject() == null) {
                eoVar.Ab = null;
                cjVar = null;
            } else {
                cjVar = new cj(eoVar, t1Var.getMessageObject().getId(), t1Var, 1);
                eoVar.Ab = cjVar;
            }
            i10 = ((org.telegram.ui.ActionBar.p2) this.f35881a).currentAccount;
            xh.v5 y3 = xh.v5.y(i10, false);
            Objects.requireNonNull(cjVar);
            fj fjVar = new fj(cjVar, 7);
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.f6 I = xh.v5.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f46176a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject p5 = di.n3.p(I, false);
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                f2Var = new pg.f2(y3, ConnectionsManager.getInstance(y3.f46176a).sendRequest(tL_payments_getPaymentForm, new bi.l9(y3, messageObject, tL_inputInvoiceMessage, fjVar, 18)), 4);
            }
            if (f2Var != null) {
                cjVar.f14040b = f2Var;
                cjVar.d();
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
                    TLRPC.TL_message C7 = eo.C7(message);
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
                eo eoVar2 = this.f35881a;
                t12.K2(null, eoVar2, eoVar2.f32316ea);
                PhotoViewer.t1().a2(arrayList, i11, this.f35881a.a(), 0L, 0L, this.f35881a.Ga);
            }
        }
    }

    @Override
    public final int U() {
        return this.f35881a.R3;
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
        eo eoVar = this.f35881a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            qg.m1 m1Var = new qg.m1(eoVar, i10, user, null, null, eoVar.f32316ea);
            t1Var.getLocationOnScreen(new int[2]);
            m1Var.f40832v0 = t1Var.getNameStatusX();
            m1Var.f40833w0 = t1Var.getNameStatusY();
            m1Var.f40836z0 = t1Var.getScaleX();
            m1Var.f40834x0 = t1Var.getLeft();
            m1Var.f40835y0 = t1Var.getTop();
            m1Var.A0 = t1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
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
                m1Var.f40831u0 = num;
            } else {
                m1Var.f40831u0 = Integer.valueOf(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18182r8[colorId]));
            }
            org.telegram.ui.Components.n5 n5Var = t1Var.f20136fc;
            if (n5Var != null && (n5Var.f25412f[0] instanceof org.telegram.ui.Components.p5)) {
                m1Var.f40836z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(eoVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f);
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
                        Integer num2 = m1Var.f40831u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18254v6);
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
            eoVar.showDialog(m1Var);
            return;
        }
        nf.f.s(eoVar.getParentActivity(), "https://" + eoVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.f35881a.U7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.t1 r45, org.telegram.tgnet.TLRPC.PollAnswer r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.V1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
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
            eo eoVar = this.f35881a;
            if (!eoVar.f32378jc && messageObject.getId() == eoVar.f32366ic) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - eoVar.f32391kc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final gh.a X() {
        return this.f35881a.Qb;
    }

    @Override
    public final void X0(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.f35881a;
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(eoVar.T5), t1Var);
    }

    @Override
    public final rv0 X1() {
        return this.f35881a.f32539wa;
    }

    @Override
    public final boolean Y(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null) {
            messageObject = null;
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            eo eoVar = this.f35881a;
            if (eoVar.R3 != 1 && !eoVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Y1(long j3) {
        eo eoVar = this.f35881a;
        TLRPC.Chat chat = eoVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return eoVar.getMessagesController().isAdmin(eoVar.e.f17195id, j3);
        }
        return false;
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
            eo eoVar = this.f35881a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = eoVar.f32542x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = eoVar.f32542x0.getChildAt(i11);
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
            eoVar.Jb(messageObject, spannableStringBuilder, 1);
            t1Var.g4(1, false, true);
        }
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.t1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.Z1(org.telegram.ui.Cells.t1, int, float, float, boolean):void");
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.t1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.a2(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        eo eoVar = this.f35881a;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            CharSequence fieldText = okVar.getFieldText();
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
                eoVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new an(this, 6), 200L);
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
        tk tkVar;
        sk skVar;
        if (!l()) {
            return false;
        }
        eo eoVar = this.f35881a;
        if (eoVar.e != null && (((tkVar = eoVar.O0) == null || tkVar.getVisibility() != 0) && ((skVar = eoVar.R) == null || skVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat != null && ((eoVar.f32298d4 == 0 || eoVar.f32346h4) && (!ChatObject.isChannel(chat) || eoVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c10 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.f31826n;
            c10 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c10] = d5.f31827r;
        }
        TLRPC.UserFull userFull = eoVar.getMessagesController().getUserFull(user.f17342id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        } else {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) eoVar.fragmentView, eoVar.f32316ea, b10, new a7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(eoVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final pn f31745b;

            {
                this.f31745b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f31745b.x(user, false);
                        return;
                    case 1:
                        this.f31745b.c(user);
                        return;
                    default:
                        this.f31745b.f35881a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new s1(this, t1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final pn f31745b;

            {
                this.f31745b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f31745b.x(user, false);
                        return;
                    case 1:
                        this.f31745b.c(user);
                        return;
                    default:
                        this.f31745b.f35881a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final pn f31745b;

            {
                this.f31745b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f31745b.x(user, false);
                        return;
                    case 1:
                        this.f31745b.c(user);
                        return;
                    default:
                        this.f31745b.f35881a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f28702t = false;
        H.f28683i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        eo eoVar = this.f35881a;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            CharSequence fieldText = okVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.r6.t(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.c61("" + user.f17342id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            eoVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new an(this, 7), 200L);
        }
    }

    @Override
    public final void c0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        eo eoVar = this.f35881a;
        try {
            if (i10 == 0) {
                eoVar.h7();
                ll llVar = eoVar.f32570z3;
                if (llVar != null) {
                    llVar.l(0L, 84, null, new an(this, 1));
                    eoVar.f32570z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(eoVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (eoVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.r31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.r31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.wc.a0(eoVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                eoVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(eoVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", eoVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new an(this, 2));
                } else if (eoVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new an(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), a02.f28749c);
                xbVar.c(i13, 36, 36, new String[0]);
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
                xbVar.f29000b.setText(append2);
                xbVar.f29000b.setSingleLine(false);
                xbVar.f29000b.setMaxLines(6);
                a02.b(xbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.f35881a;
        if (eoVar.f32540wb != 0 && t1Var.getMessageObject() != null && eoVar.f32540wb == t1Var.getMessageObject().getId() && eoVar.f32553xb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c2(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        eo eoVar = this.f35881a;
        if (AndroidUtilities.isContextSafe(eoVar.getParentActivity()) && (chat = eoVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(t1Var, eoVar.getMessagesController().getParticipant(eoVar.e.f17195id, currentUser.f17342id));
        }
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        eo eoVar = this.f35881a;
        eoVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(eoVar.getParentActivity()) && (chat = eoVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == eoVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == eoVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = eoVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                org.telegram.ui.Components.n01.b(parentActivity, i10, -eoVar.e.f17195id, currentUser, str2, z15, z16, z12, f6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == eoVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(eoVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                eoVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(eoVar.e);
                tL_channels_getParticipant.participant = eoVar.getMessagesController().getInputPeer(currentUser.f17342id);
                eoVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new bi.k6(5, this, t1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
            org.telegram.ui.Components.n01.b(parentActivity2, i10, -eoVar.e.f17195id, currentUser, str2, z152, z162, z12, f6Var);
        }
    }

    @Override
    public final boolean d0() {
        if (this.f35881a.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        eo eoVar = this.f35881a;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (!lVar2.s() && !eoVar.A9()) {
                z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
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
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j3) {
        Bundle e = w.f.e(j3, "user_id");
        org.telegram.ui.ActionBar.p2 p2Var = this.f35881a;
        if (p2Var.getMessagesController().checkCanOpenChat(e, p2Var, t1Var.getMessageObject())) {
            p2Var.presentFragment(new eo(e));
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        this.f35881a.I7(t1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (eoVar = this.f35881a).f32540wb) != 0 && i10 == t1Var.getMessageObject().getId() && eoVar.f32553xb == 3) {
            return eoVar.f32578zb;
        }
        return null;
    }

    @Override
    public final boolean g1(MessageObject messageObject) {
        pm pmVar;
        long dialogId = messageObject.getDialogId();
        eo eoVar = this.f35881a;
        if ((dialogId == 1271266957 || ((pmVar = eoVar.A0) != null && pmVar.N)) && eoVar.R3 != 7) {
            return true;
        }
        return false;
    }

    public final void h() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        eo eoVar = this.f35881a;
        if (isHuaweiStoreApp) {
            nf.f.s(eoVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(eoVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        ph.c cVar;
        eo eoVar = this.f35881a;
        if (eoVar.wc.f12870f && (cVar = eoVar.Cc) != null && cVar.f40399n == t1Var && cVar.f40395a.getWidth() > 0) {
            return eoVar.Cc.f40395a.getHeight();
        }
        return 0;
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = ph.i.a(messageObject);
            boolean a10 = w7.c0.a(a2, 7);
            eo eoVar = this.f35881a;
            if (a10) {
                org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.e_hand_2, 36, ph.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                eoVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                t1Var.S0(true);
            } else if (eoVar.getParentActivity() != null) {
                if (eoVar.f32418n2 == null) {
                    org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(5, eoVar.getParentActivity(), eoVar.f32316ea, false);
                    eoVar.f32418n2 = s40Var;
                    s40Var.setAlpha(0.0f);
                    eoVar.f32418n2.setVisibility(4);
                    int indexOfChild = eoVar.X0.indexOfChild(eoVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    eoVar.X0.addView(eoVar.f32418n2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i16);
                            float y3 = ((t1Var.getY() + r1Var.f19732b) - AndroidUtilities.dp(4.0f)) - eoVar.f32487s9;
                            eoVar.f32453q2 = AndroidUtilities.dp(13.3f) + r1Var.f19731a;
                            int D = org.telegram.messenger.em.D(6.0f, r1Var.f19732b, i12);
                            eoVar.f32466r2 = D;
                            if (y3 > 0.0f) {
                                i15 = eoVar.f32453q2;
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
                        eoVar.f32542x0.v0(0, (int) f7, null);
                        eoVar.f32441p2 = t1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                eoVar.f32418n2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        eo eoVar = this.f35881a;
        if (eoVar.getParentActivity() != null) {
            if (eoVar.X9 == null) {
                th.j jVar = new th.j(eoVar.getParentActivity());
                eoVar.X9 = jVar;
                eoVar.X0.addView(jVar, w7.a6.e(-1, -1, 48));
            }
            th.j jVar2 = eoVar.X9;
            HashMap hashMap = jVar2.f42239a;
            ArrayList arrayList = jVar2.f42241c;
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
                    long j11 = dialog.f17199id;
                    if (j11 != j3 && !DialogObject.isEncryptedDialog(j11)) {
                        if (DialogObject.isUserDialog(dialog.f17199id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f17199id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f17342id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f17199id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f17199id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f17199id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f17199id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f17199id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = th.j.b(t1Var);
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
                th.i iVar = new th.i(jVar2, t1Var, arrayList4, new org.telegram.ui.web.x1(29, jVar2, b10));
                iVar.setBounds(0, 0, jVar2.getMeasuredWidth(), jVar2.getMeasuredHeight());
                iVar.setCallback(jVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, iVar);
                }
            }
        }
    }

    @Override
    public final void j() {
        h();
    }

    @Override
    public final void j1() {
        eo eoVar = this.f35881a;
        eoVar.Q7();
        UndoView undoView = eoVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, eoVar.T5, null);
    }

    @Override
    public final boolean j2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var != null && pageBlock != null) {
            eo eoVar = this.f35881a;
            if (eoVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, eoVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new ym(eoVar, arrayList), null, 0L, 0L, 0L, true, new xm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        zj zjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        eo eoVar = this.f35881a;
        wj wjVar = eoVar.f32542x0;
        if (wjVar != null && (zjVar = eoVar.f32567z0) != null && zjVar.f41607y < 0) {
            for (int childCount = wjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = eoVar.f32542x0.getChildAt(childCount);
                eoVar.f32542x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = eoVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i11 = eoVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                zj zjVar2 = eoVar.f32567z0;
                eoVar.f32542x0.getClass();
                zjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) eoVar.f32487s9), false);
            } else {
                eoVar.f32567z0.h1(i10, i11);
            }
        }
        eoVar.N0 = z11;
        eoVar.rc(primaryMessageObject, false);
        eoVar.N0 = false;
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f35881a.rc(primaryMessageObject, false);
    }

    public final boolean l() {
        eo eoVar = this.f35881a;
        if (!UserObject.isUserSelf(eoVar.f32318f)) {
            TLRPC.Chat chat = eoVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !eoVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean l0() {
        boolean z10;
        eo eoVar = this.f35881a;
        if (!eoVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        eo eoVar = this.f35881a;
        if (!eoVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (eoVar.getParentActivity() != null) {
                if (eoVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    ok okVar = eoVar.Y;
                    MessageObject messageObject = t1Var.getMessageObject();
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    bj bjVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    nf.e eVar = eoVar.Ab;
                    if (eVar != null) {
                        eVar.a(true);
                        eoVar.Ab = null;
                    }
                    if (str != null && t1Var.getMessageObject() != null) {
                        bj bjVar2 = new bj(eoVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                        eoVar.Ab = bjVar2;
                        bjVar = bjVar2;
                    } else {
                        eoVar.Ab = null;
                    }
                    okVar.c0(keyboardButtonProto, messageObject, messageObject2, bjVar);
                }
            }
        }
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                L1(t1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            eo eoVar = this.f35881a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(eoVar)) {
                    id0 id0Var = new id0(3);
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                    id0Var.setResourceProvider(f6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = eoVar.getMessagesController().getPeer(eoVar.a());
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
                    eoVar.presentFragment(id0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                tt.q().w(eoVar.getParentActivity());
                tt.q().v(new nn(this, tL_messageMediaPoll, pollAnswer, t1Var));
                tt q6 = tt.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = t1Var.getMessageObject();
                f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                q6.t(document4, null, "", null, null, i18, false, messageObject2, f6Var, 200);
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
                    TLRPC.TL_message C7 = eo.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = ph.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    ph.a aVar = new ph.a(i15, messageObject, document6, ph.f.c(messageObject.messageOwner, i10));
                    if (aVar.f40391g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = t1Var.f20403y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            ph.g gVar = t1Var.f20088c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            ph.g gVar2 = t1Var.f20074b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f40390f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = t1Var.f20403y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            ph.g gVar3 = t1Var.f20088c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            ph.g gVar4 = t1Var.f20074b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = eo.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = ph.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, eoVar, eoVar.f32316ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j3 = eoVar.T5;
                            } else {
                                j3 = 0;
                            }
                            if (i19 != 0) {
                                j10 = eoVar.L6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = eoVar.d();
                            }
                            t12.c2(messageObject6, eoVar, j3, j10, j11, eoVar.Fa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, eoVar.getParentActivity(), eoVar.f32316ea, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            eoVar.z6(messageObject6);
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
                    TLRPC.TL_message C73 = eo.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = ph.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = eo.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = ph.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                yf.d.b(tL_messageMediaPoll.poll, eoVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message C75 = eo.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = ph.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, eoVar, eoVar.f32316ea);
                    PhotoViewer.t1().a2(arrayList3, i11, eoVar.a(), 0L, 0L, eoVar.Ga);
                }
            }
        }
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            j1();
            return;
        }
        eo eoVar = this.f35881a;
        if (!eoVar.f32394l3 && eoVar.f32542x0 != null && eoVar.getParentActivity() != null && eoVar.fragmentView != null) {
            if (eoVar.f32505u2 == null) {
                vm vmVar = eoVar.X0;
                int indexOfChild = vmVar.indexOfChild(eoVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(1, eoVar.getParentActivity(), eoVar.f32316ea, false);
                    eoVar.f32505u2 = s40Var;
                    vmVar.addView(s40Var, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    eoVar.f32505u2.setAlpha(0.0f);
                    eoVar.f32505u2.setVisibility(4);
                } else {
                    return;
                }
            }
            eoVar.f32505u2.e(t1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void n0(String str) {
        eo eoVar = this.f35881a;
        tk tkVar = eoVar.O0;
        if (tkVar == null || tkVar.getVisibility() != 0) {
            sk skVar = eoVar.R;
            if ((skVar == null || skVar.getVisibility() != 0) && eoVar.Y != null && str != null && str.length() > 0) {
                ok okVar = eoVar.Y;
                okVar.setFieldText("@" + str + " ");
                eoVar.Y.H0();
            }
        }
    }

    @Override
    public final void o() {
        this.f35881a.X0.getClass();
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.y5 y5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        eo eoVar = this.f35881a;
        if (!eoVar.getMessagesController().premiumFeaturesBlocked() && y5Var != null && !y5Var.standard) {
            long documentId = y5Var.getDocumentId();
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                document = org.telegram.ui.Components.p5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.wv wvVar = new org.telegram.ui.Components.wv(eoVar, eoVar.getParentActivity(), eoVar.f32316ea, arrayList);
                org.telegram.ui.Components.mv mvVar = wvVar.f28843f;
                mvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(mvVar);
                mvVar.v = imageReceiver;
                if (mvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                mvVar.f25296w = true;
                mvVar.f25297x.d(1.0f, true);
                mvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f, true), 0L, null, null, 0);
                mvVar.v.setLayerNum(7);
                mvVar.v.setAllowStartLottieAnimation(true);
                mvVar.v.setAllowStartAnimation(true);
                mvVar.v.setAutoRepeat(1);
                mvVar.v.setAllowDecodeSingleFrame(true);
                mvVar.v.setParentView(mvVar);
                wvVar.setCalcMandatoryInsets(eoVar.x9());
                eoVar.showDialog(wvVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var != null && document != null) {
            eo eoVar = this.f35881a;
            if (eoVar.getParentLayout() != null && Y(t1Var)) {
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(eoVar, t1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new s1(this, t1Var, document, 24), false);
                H.f28702t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void o2() {
        this.f35881a.r9();
    }

    public final void p(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z10) {
        eo eoVar = this.f35881a;
        TLRPC.Chat chat2 = eoVar.e;
        if (chat2 != null && chat.f17195id == chat2.f17195id) {
            rj rjVar = eoVar.f32256a1;
            if (rjVar != null && i10 == 0) {
                rjVar.e(false, false);
            } else if (t1Var.getMessageObject() != null) {
                eoVar.E(i10, t1Var.getMessageObject().getId(), 0, 0, true, false);
            }
        } else if (chat2 == null || chat.f17195id != chat2.f17195id || eoVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f17195id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            cj cjVar = null;
            if (z10) {
                nf.e eVar = eoVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    eoVar.Ab = null;
                }
                if (t1Var.getMessageObject() == null) {
                    eoVar.Ab = null;
                } else {
                    cj cjVar2 = new cj(eoVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    eoVar.Ab = cjVar2;
                    cjVar = cjVar2;
                }
            }
            if (eoVar.getMessagesController().checkCanOpenChat(bundle, eoVar, t1Var.getMessageObject(), cjVar)) {
                eo eoVar2 = new eo(bundle);
                if (cjVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new di.o3(this, cjVar, chat, i10, eoVar2, 16), 5000L);
                    cjVar.d();
                    return;
                }
                eoVar.presentFragment(eoVar2);
            }
        }
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.q(org.telegram.ui.Cells.t1):void");
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        eo eoVar = this.f35881a;
        eoVar.I7(t1Var, false, false, f7, f10, true, false, false);
        eoVar.f32542x0.getClass();
        eo.c2(eoVar, RecyclerView.R(t1Var));
    }

    @Override
    public final void r() {
        this.f35881a.Yb();
    }

    @Override
    public final void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f35881a.W7(t1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void s(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        zj zjVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            eo eoVar = this.f35881a;
            wj wjVar = eoVar.f32542x0;
            if (wjVar != null && (zjVar = eoVar.f32567z0) != null && zjVar.f41607y < 0) {
                for (int childCount = wjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = eoVar.f32542x0.getChildAt(childCount);
                    eoVar.f32542x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = eoVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = eoVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            eoVar.rc(primaryMessageObject, false);
            bi.x4 x4Var = eoVar.A1;
            if (x4Var != null) {
                x4Var.e(true);
            }
            if (i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
                eoVar.f32567z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
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
        eo eoVar = this.f35881a;
        eoVar.aa(eoVar.e.f17195id, messageObject2, messageObject2.getId(), j10, i10, 0, null);
    }

    @Override
    public final void t1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        th.i iVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        th.j jVar = this.f35881a.X9;
        if (jVar != null && (iVar = (th.i) jVar.f42239a.get(th.j.b(t1Var))) != null) {
            th.d[] dVarArr = iVar.f42236w;
            RectF rectF = iVar.f42234r;
            if (iVar.M) {
                float f12 = (f7 - rectF.left) + iVar.U;
                float f13 = (f10 - rectF.top) + iVar.V;
                int i11 = th.h.f42221a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(th.h.f42221a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.q.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (iVar.R != i10) {
                    iVar.f42228a.performHapticFeedback(3, 1);
                    iVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        th.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f42198p != z10) {
                            ValueAnimator valueAnimator = dVar.f42196n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f42198p = z10;
                            float f15 = dVar.f42197o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f42196n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f42196n.addUpdateListener(dVar);
                            dVar.f42196n.setInterpolator(th.g.f42204a);
                            dVar.f42196n.start();
                        }
                        th.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f42195m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f42193k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f42195m = z11;
                            float f16 = dVar2.f42194l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f42193k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f42193k.addUpdateListener(dVar2);
                            dVar2.f42193k.setInterpolator(th.g.f42204a);
                            dVar2.f42193k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean t2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        eo eoVar = this.f35881a;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        if (z10 && eoVar.J9) {
            f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                ((ActionBarLayout) f5Var2).r();
            }
            return true;
        }
        return !e();
    }

    public final void u(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f17342id);
            org.telegram.ui.ActionBar.p2 p2Var = this.f35881a;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var, t1Var.getMessageObject())) {
                p2Var.presentFragment(new eo(bundle));
            }
        }
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.f35881a;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        boolean z10 = true;
        if (!lVar.s() && !eoVar.A9()) {
            if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
                P0(10, t1Var);
                return;
            }
            if (!ChatObject.isForum(eoVar.e) && !eoVar.F9()) {
                z10 = false;
            }
            x(user, z10);
            return;
        }
        eo.b2(eoVar, t1Var, true, f7, f10);
    }

    @Override
    public final String v(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        eo eoVar = this.f35881a;
        if (UserObject.isBotForum(eoVar.f32318f)) {
            return null;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = eoVar.getMessagesController().getAdminRank(eoVar.e.f17195id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = eoVar.f32286c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final void v2() {
        eo eoVar = this.f35881a;
        if (eoVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", eoVar.T5);
            bundle.putInt("start_from", 10);
            eoVar.presentFragment(new org.telegram.ui.Components.la0(bundle, eoVar.f32256a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", eoVar.getMessagesController().recommendedChannelsLimitPremium), new an(this, 4))).j();
    }

    public final void w(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f17195id);
            bundle.putBoolean("expandPhoto", false);
            this.f35881a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void w0(org.telegram.ui.Cells.t1 r39, float r40, float r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.w0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final void w2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        eo eoVar = this.f35881a;
        bi.x4 x4Var = eoVar.A1;
        if (x4Var != null) {
            x4Var.e(true);
        }
        if (eoVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            bi.x4 x4Var2 = new bi.x4(eoVar.getParentActivity(), 3);
            x4Var2.p(true);
            x4Var2.K = Layout.Alignment.ALIGN_NORMAL;
            x4Var2.d = -1L;
            x4Var2.T = true;
            x4Var2.e = true;
            x4Var2.q(12.0f);
            eoVar.A1 = x4Var2;
            x4Var2.f3890l0 = new qh(9, this, x4Var2);
            x4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            eoVar.X0.addView(eoVar.A1, w7.a6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            eoVar.X0.post(new i2.z(this, t1Var, i11, i10, 4));
        }
    }

    public final void x(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f17342id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z10 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f17342id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            eo eoVar = this.f35881a;
            TLRPC.User user2 = eoVar.f32318f;
            if (user2 != null && user2.f17342id == user.f17342id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            eoVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final boolean x0(MessageObject messageObject) {
        return !this.f35881a.f32477s.containsKey(messageObject);
    }

    @Override
    public final org.telegram.ui.Cells.t9 x2() {
        return this.f35881a.f32291c9;
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            t1Var.t2();
            t1Var.requestLayout();
            this.f35881a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var) {
        ph.c cVar = this.f35881a.Cc;
        if (cVar != null && cVar.f40399n == t1Var) {
            cVar.f40402w.getClass();
        }
    }

    @Override
    public final boolean z1() {
        eo eoVar = this.f35881a;
        if (eoVar.X0.getMeasuredWidth() > eoVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }
}
