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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.UndoView;
public final class in implements org.telegram.ui.Cells.l1 {
    public final wn f34543a;

    public in(wn wnVar) {
        this.f34543a = wnVar;
    }

    public static void a(in inVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        wn wnVar = inVar.f34543a;
        if (wnVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && wnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                wnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
                tL_message.f18342id = messageObject.getId();
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
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(wnVar.getParentActivity(), wnVar.getAccountInstance(), arrayList, new ua(inVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar = this.f34543a;
        if (!wnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, null);
            a2Var.q(200L);
            wnVar.getMessagesController().getContentSettings(new z(this, a2Var, u1Var, 6));
            return;
        }
        if (u1Var.getMessageObject() != null) {
            u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        u1Var.h4();
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        wn wnVar = this.f34543a;
        if (wnVar.getParentActivity() != null && tLObject != null) {
            b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18321id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f18468id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, wnVar.getParentActivity(), wnVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(wnVar.getParentActivity(), false, false);
                e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                e1Var.setMinimumWidth(160);
                e1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(wnVar.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                wn wnVar2 = new wn(bundle);
                wnVar2.J9 = true;
                wnVar.presentFragmentAsPreviewWithMenu(wnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                wnVar.d7();
                return;
            }
            wnVar.presentFragment(new wn(bundle));
        }
    }

    @Override
    public final boolean A1() {
        wn wnVar = this.f34543a;
        if (wnVar.X0.getMeasuredWidth() > wnVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        boolean z10;
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        wn wnVar = this.f34543a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(wnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = wnVar.getMessagesController().conferenceCallSizeLimit;
                a2Var.setOnCancelListener(new ba(this, wnVar.getConnectionsManager().sendRequest(getgroupcall, new ci.hd(this, a2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
                a2Var.q(600L);
                return;
            }
            TLRPC.User user = wnVar.f39456f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = wnVar.f39400a8;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.g2.m(user, isVideoCall, z10, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f39456f.f18468id), wnVar.getAccountInstance());
                return;
            }
            return;
        }
        wnVar.I7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void C1(org.telegram.ui.Cells.u1 u1Var) {
        wn.U4(this.f34543a, u1Var);
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
            int i13 = buttonCustom.f15804id;
            TL_stars.StarsAmount starsAmount = null;
            wn wnVar = this.f34543a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                oc ocVar = new oc(13, this, message);
                Pattern pattern = org.telegram.ui.Components.e5.f23809a;
                Activity parentActivity = wnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                editText.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                editText.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.h6.S(parentActivity));
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new o(24, ocVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                a2Var.N = new org.telegram.ui.Components.p1(editText, 0);
                frameLayout.addView(editText, w7.y5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
                wnVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, wnVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, wnVar.e, 5);
                    }
                    ai.s4 s4Var = new ai.s4(this, message, canManageMonoForum, messageObject, 12);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    wnVar.g7(s4Var, zf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                wnVar.I7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                wnVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar = this.f34543a;
        wnVar.f39690xa.l(u1Var, wnVar, true);
        wnVar.f39680x0.I0(false);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            wn wnVar = this.f34543a;
            if ((wnVar.f39664vb != id2 || wnVar.f39678wb != 7) && (inputPeer = wnVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f18539id = id2;
                nf.e eVar = wnVar.f39716zb;
                if (eVar != null) {
                    eVar.a(true);
                    wnVar.f39716zb = null;
                }
                xi xiVar = new xi(wnVar, id2, u1Var, 2);
                xiVar.f15422b = new dh(0, wnVar, r3);
                wnVar.f39716zb = xiVar;
                xiVar.d();
                int[] iArr = {wnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new hg(wnVar, xiVar, iArr, u1Var, messageObject))};
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
        ok okVar;
        nk nkVar;
        if (!m()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        wn wnVar = this.f34543a;
        if (!isEmpty && wnVar.e != null && (((okVar = wnVar.O0) == null || okVar.getVisibility() != 0) && ((nkVar = wnVar.R) == null || nkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = wnVar.e;
        if (chat2 != null && ((wnVar.f39436d4 == 0 || wnVar.f39484h4) && (!ChatObject.isChannel(chat2) || wnVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = wnVar.e;
        if (chat3 != null && chat3.f18321id == chat.f18321id && !wnVar.F9()) {
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
                d5Var = d5.f32904f;
            }
            d5VarArr[1] = d5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            d5VarArr[i13] = d5.f32905n;
            i13++;
        }
        if (i11 != 0) {
            d5VarArr[i13] = d5.f32906r;
        }
        TLRPC.ChatFull chatFull = wnVar.getMessagesController().getChatFull(chat.f18321id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
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
            com.google.firebase.messaging.m.k().v((ViewGroup) wnVar.fragmentView, wnVar.f39454ea, x4Var, new b7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(wnVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new wm(this, chat, 0), false);
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
        H.l(i17, LocaleController.getString(i18), new r1(this, u1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new wm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new wm(this, chat, 2), i16);
        H.f30548t = false;
        H.f30529i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wn wnVar = this.f34543a;
        if (!wnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (wnVar.getParentActivity() != null) {
                if (wnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) wnVar.f39454ea, false);
                        e3Var.fixNavigationBar();
                        e3Var.title = str;
                        e3Var.bigTitle = false;
                        e3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        lg.j jVar = new lg.j(3, wnVar, str);
                        e3Var.items = charSequenceArr;
                        e3Var.onClickListener = jVar;
                        wnVar.showDialog(e3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        wnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
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
            org.telegram.messenger.ok.o(R.string.CodeCopied, org.telegram.ui.Components.yc.a0(this.f34543a));
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        wn wnVar = this.f34543a;
        wnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        l(u1Var, true, false, true);
    }

    @Override
    public final boolean I1() {
        wn wnVar = this.f34543a;
        if (wnVar.X0.getKeyboardHeight() + wnVar.f39574oa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        wn wnVar = this.f34543a;
        wnVar.f39437d5 = messageObject;
        wnVar.d9();
    }

    @Override
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f34543a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        wn wnVar = this.f34543a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (wnVar.T5 != j3) {
                wnVar.presentFragment(wn.R9(j3));
            } else {
                wnVar.f39394a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            wnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final boolean M0(long j3) {
        wn wnVar = this.f34543a;
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return wnVar.getMessagesController().isOwner(wnVar.e.f18321id, j3);
        }
        return false;
    }

    @Override
    public final void M1(MessageObject messageObject) {
        this.f34543a.f39615s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f34543a.fb(messageObject, true);
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
        wn wnVar = this.f34543a;
        uh.i iVar = wnVar.X9;
        if (iVar != null) {
            HashMap hashMap = iVar.f44074a;
            uh.h hVar = (uh.h) hashMap.get(uh.i.b(u1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            uh.h hVar2 = (uh.h) wnVar.X9.f44074a.get(uh.i.b(u1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j3 = hVar2.f44071w[i11].d;
            } else {
                j3 = 0;
            }
            if (messageObject != null && j3 != 0) {
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.e5.h(parentActivity, i10, j3, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) wnVar.f39686x6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.f0.k(messageObject);
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
                    qcVar = org.telegram.ui.Components.yc.v(wnVar.getParentActivity(), wnVar, null, 1, j10, 1, wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, false, h0Var);
                    qcVar.f27572k = true;
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
                ybVar.f30574a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new dm(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        en enVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && nf.f.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        wn wnVar = this.f34543a;
        nf.e eVar = wnVar.f39716zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (u1Var.getMessageObject() == null) {
            enVar = null;
        } else {
            enVar = new en(this, u1Var);
        }
        wnVar.f39716zb = enVar;
        if (!z11 && !nf.f.f(parse, false, null)) {
            org.telegram.ui.Components.e5.r0(wnVar, str, true, true, true, !z11, wnVar.f39716zb, webPage, wnVar.f39454ea);
        } else {
            nf.f.r(wnVar.getParentActivity(), parse, true, true, false, wnVar.f39716zb, null, false, true, false);
        }
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        wn wnVar = this.f34543a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(wnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!u1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(wnVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!wnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new tm(this, 9))).k(true);
            return false;
        } else {
            wnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(wnVar.e, wnVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (wnVar = this.f34543a).f39664vb) != 0 && i10 == u1Var.getMessageObject().getId() && wnVar.f39678wb == 1) {
            return wnVar.f39691xb;
        }
        return null;
    }

    @Override
    public final boolean P() {
        wn wnVar = this.f34543a;
        if (wnVar.W5[1].size() + wnVar.W5[0].size() <= 0) {
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
        bn bnVar = null;
        bn bnVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        bn bnVar3 = null;
        bn bnVar4 = null;
        wn wnVar = this.f34543a;
        if (i10 == 19) {
            nf.e eVar = wnVar.f39716zb;
            if (eVar != null) {
                eVar.a(true);
            }
            if (u1Var.getMessageObject() != null) {
                bnVar2 = new bn(this, u1Var, 2);
            }
            final bn bnVar5 = bnVar2;
            wnVar.f39716zb = bnVar5;
            final Activity parentActivity = wnVar.getParentActivity();
            final org.telegram.ui.ActionBar.d6 resourceProvider = wnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            bnVar5.d();
            bnVar5.f15422b = new tg.d(atomicBoolean, 0);
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
            tg.s.d(messageObject, new Utilities.Callback(atomicBoolean, bnVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f43384a;
                public final nf.e f43385b;
                public final boolean f43386c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f43387f;
                public final d6 f43388g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f43387f = parentActivity;
                    this.f43388g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f43384a.get()) {
                        this.f43385b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f43386c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f43387f;
                        d6 d6Var = this.f43388g;
                        if (z12) {
                            i.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            i.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                        }
                    }
                }
            }, new tg.f(atomicBoolean, bnVar5, 0));
        } else if (i10 == 21) {
            g();
        } else if (i10 == 84) {
            wnVar.ua(u1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.ah0.O;
            if (wnVar.getParentActivity() != null) {
                wnVar.showDialog(new org.telegram.ui.Components.ah0(wnVar.getContext(), wnVar.getCurrentAccount(), messageObject, wnVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    wnVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
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
                bundle.putLong("user_id", user.f18468id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                wnVar.presentFragment(new ProfileActivity(bundle, null));
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
                wnVar.showDialog(new org.telegram.ui.Components.ze0(wnVar, null, user, null, file, gf.b.d(str, false), str3, str4, wnVar.f39454ea));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            wnVar.presentFragment(new wn(v7.j.e(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.ok.h(new StringBuilder("+"), user2.phone, gf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = gf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f18468id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                wnVar.presentFragment(new ms(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                wnVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    nf.e eVar2 = wnVar.f39716zb;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        bnVar3 = new bn(this, u1Var, 4);
                    }
                    wnVar.f39716zb = bnVar3;
                    nf.f.r(wnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, wnVar.f39716zb, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            wnVar.getOrCreateStoryViewer().F(wnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ai.u9.a(wnVar.f39680x0));
                            return;
                        }
                    }
                }
                if (!wnVar.ea(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
                    nf.e eVar3 = wnVar.f39716zb;
                    if (eVar3 != null) {
                        eVar3.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        bnVar4 = new bn(this, u1Var, 5);
                    }
                    wnVar.f39716zb = bnVar4;
                    nf.f.r(wnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, wnVar.f39716zb, null, false, true, false);
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
                nf.e eVar4 = wnVar.f39716zb;
                if (eVar4 != null) {
                    eVar4.a(true);
                }
                if (u1Var.getMessageObject() != null) {
                    bnVar = new bn(this, u1Var, 3);
                }
                wnVar.f39716zb = bnVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        wnVar.f39716zb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        wnVar.f39716zb.f15422b = new ai.o8(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ci.t3(4, this, z11)), 26);
                        return;
                    }
                }
                nf.f.r(wnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, wnVar.f39716zb, null, false, true, false);
            }
        }
    }

    @Override
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            wn wnVar = this.f34543a;
            org.telegram.ui.Components.wu.J(wnVar, messageObject, wnVar.Fa, str2, str3, str4, str, i10, i11, -1, wnVar.x9());
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
            wn wnVar = this.f34543a;
            if (wnVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(wnVar.e);
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
        te teVar;
        a3.h0 h0Var;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        ci.m6 m6Var;
        int i10;
        boolean z11;
        int i11;
        z41 z41Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f34543a.A0.L();
                    wn wnVar = this.f34543a;
                    return mediaController.setPlaylist(L, messageObject, wnVar.L6, true ^ wnVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f34543a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            b51 b51Var = this.f34543a.Z9;
            if (b51Var == null || b51Var.f32311b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.yc.a0(this.f34543a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f34543a.Z9 = new b51(this.f34543a.getParentActivity());
                b51 b51Var2 = this.f34543a.Z9;
                if (!messageObject.isOutOwner()) {
                    teVar = this.f34543a.fb(messageObject, true);
                } else {
                    teVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    h0Var = wn.O4(this.f34543a, messageObject);
                } else {
                    h0Var = null;
                }
                Context context = b51Var2.f32308a;
                ci.m6 m6Var2 = b51Var2.f32312c;
                b51Var2.X = teVar;
                b51Var2.Y = h0Var;
                z41 z41Var2 = b51Var2.N;
                if (z41Var2 != null) {
                    m6Var2.removeView(z41Var2);
                    b51Var2.N = null;
                }
                b51Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                b51Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b51Var2.S = z10;
                org.telegram.ui.Cells.u1 u1Var2 = b51Var2.O;
                if (u1Var2 != null) {
                    d6Var = u1Var2.getResourcesProvider();
                } else {
                    d6Var = null;
                }
                b51Var2.L = d6Var;
                if (b51Var2.O != null) {
                    b51Var2.T = 0.0f;
                    b51Var2.U = u1Var.f21426n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        b51Var2.T = view.getY() + b51Var2.T;
                        b51Var2.U = view.getY() + b51Var2.U;
                    }
                    int width = b51Var2.O.getWidth();
                    int height = b51Var2.O.getHeight();
                    if (b51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    b51Var2.K = i14 - b51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    m6Var = m6Var2;
                    z41 z41Var3 = new z41(b51Var2, b51Var2.getContext(), UserConfig.selectedAccount, b51Var2.O.getResourcesProvider(), width, i14);
                    b51Var2.N = z41Var3;
                    b51Var2.O.j1(z41Var3);
                    b51Var2.N.i1(b51Var2.O);
                    b51Var2.N.setDelegate(new Object());
                    z41 z41Var4 = b51Var2.N;
                    MessageObject messageObject3 = b51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = b51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = b51Var2.O;
                    z41Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!b51Var2.S) {
                        org.telegram.ui.Components.k8 k8Var = new org.telegram.ui.Components.k8();
                        b51Var2.V = k8Var;
                        z41 z41Var5 = b51Var2.N;
                        k8Var.f25679i = z41Var5;
                        z41Var5.f21313ee = k8Var;
                        if (z41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.vo0 seekBarWaveform = b51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = b51Var2.f32319s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.f29232n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    b51Var2.H = false;
                    m6Var.addView(b51Var2.N, new FrameLayout.LayoutParams(b51Var2.O.getWidth(), i14, 17));
                } else {
                    m6Var = m6Var2;
                    i10 = 360;
                }
                TextureView textureView = b51Var2.P;
                if (textureView != null) {
                    m6Var.removeView(textureView);
                    b51Var2.P = null;
                }
                if (b51Var2.S) {
                    b51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    b51Var2.P = textureView2;
                    m6Var.addView(textureView2, 0, w7.y5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.s71 s71Var = b51Var2.f32320w;
                if (s71Var != null) {
                    s71Var.B();
                    b51Var2.f32320w.H();
                    b51Var2.f32320w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = b51Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(b51Var2.O.getMessageObject().currentAccount).getPathToAttach(b51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(b51Var2.O.getMessageObject().currentAccount).getPathToMessage(b51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && b51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(b51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.s71 s71Var2 = new org.telegram.ui.Components.s71();
                        b51Var2.f32320w = s71Var2;
                        s71Var2.J = new a51(b51Var2);
                        if (b51Var2.V != null) {
                            s71Var2.K = new a51(b51Var2);
                        }
                        if (b51Var2.S) {
                            s71Var2.V(b51Var2.P);
                        }
                        b51Var2.f32320w.D(Uri.fromFile(pathToAttach), "other");
                        b51Var2.f32320w.C();
                        org.telegram.ui.Components.kt ktVar = b51Var2.E;
                        if (ktVar != null) {
                            ktVar.f25855s = b51Var2.f32320w;
                            ktVar.a();
                        }
                    }
                    wn wnVar2 = this.f34543a;
                    wnVar2.showDialog(wnVar2.Z9);
                    return false;
                }
                ci.e4 e4Var = b51Var2.f32321x;
                if (e4Var != null) {
                    m6Var.removeView(e4Var);
                    b51Var2.f32321x = null;
                }
                MessageObject messageObject4 = b51Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = b51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(b51Var2.M.currentAccount).getClientUserId()) {
                    ci.e4 e4Var2 = new ci.e4(context, 3);
                    b51Var2.f32321x = e4Var2;
                    e4Var2.p(true);
                    if (z11) {
                        long dialogId = b51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(b51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(b51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        ci.e4 e4Var3 = b51Var2.f32321x;
                        if (b51Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        e4Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ci.e4 e4Var4 = b51Var2.f32321x;
                        if (b51Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        e4Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    b51Var2.f32321x.q(12.0f);
                    ci.e4 e4Var5 = b51Var2.f32321x;
                    if (!z11 && !b51Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    e4Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (b51Var2.S) {
                        b51Var2.f32321x.m(0.5f, 0.0f);
                        b51Var2.f32321x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        b51Var2.f32321x.m(0.0f, AndroidUtilities.dp(34.0f));
                        b51Var2.f32321x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    b51Var2.f32321x.t(14.0f);
                    ci.e4 e4Var6 = b51Var2.f32321x;
                    e4Var6.h = ci.e4.a(e4Var6.getText(), b51Var2.f32321x.getTextPaint());
                    if (b51Var2.S) {
                        m6Var.addView(b51Var2.f32321x, w7.y5.d((int) ((b51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((b51Var2.O.getHeight() + b51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        m6Var.addView(b51Var2.f32321x, w7.y5.d((int) ((b51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((b51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + b51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((b51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    b51Var2.f32321x.u();
                }
                TextView textView = b51Var2.f32322y;
                if (textView != null) {
                    m6Var.removeView(textView);
                    b51Var2.f32322y = null;
                }
                TextView textView2 = new TextView(context);
                b51Var2.f32322y = textView2;
                textView2.setTextColor(-1);
                b51Var2.f32322y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    b51Var2.f32322y.setBackground(org.telegram.ui.ActionBar.h6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    b51Var2.f32322y.setBackground(org.telegram.ui.ActionBar.h6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                b51Var2.f32322y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.a6.a(b51Var2.f32322y);
                TextView textView3 = b51Var2.f32322y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                b51Var2.f32322y.setOnClickListener(new x41(b51Var2, 1));
                m6Var.addView(b51Var2.f32322y, w7.y5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (z41Var = b51Var2.N) != null && z41Var.getMessageObject() != null && b51Var2.N.getMessageObject().messageOwner != null) {
                    b51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    b51Var2.N.invalidate();
                }
                wn wnVar22 = this.f34543a;
                wnVar22.showDialog(wnVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean R() {
        wn wnVar = this.f34543a;
        if (!UserObject.isReplyUser(wnVar.f39456f) && !UserObject.isUserSelf(wnVar.f39456f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        wn wnVar = this.f34543a;
        wnVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, wnVar);
    }

    @Override
    public final void R1() {
        org.telegram.ui.ActionBar.d6 d6Var;
        wn wnVar = this.f34543a;
        if (wnVar.X0 != null && wnVar.getParentActivity() != null) {
            Context context = wnVar.X0.getContext();
            d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
            z31.T(context, wnVar, false, d6Var, null);
        }
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        wn wnVar = this.f34543a;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (!kVar.s() && !wnVar.A9()) {
            if (!z10 && chat.signature_profiles && (messageObject = u1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                wnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                q(u1Var, chat, i10, z10);
                return;
            }
        }
        wn.b2(wnVar, u1Var, true, f7, f10);
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        l(u1Var, true, true, false);
    }

    @Override
    public final void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        xi xiVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        qg.v vVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            wn wnVar = this.f34543a;
            nf.e eVar = wnVar.f39716zb;
            if (eVar != null) {
                eVar.a(true);
                wnVar.f39716zb = null;
            }
            if (u1Var.getMessageObject() == null) {
                wnVar.f39716zb = null;
                xiVar = null;
            } else {
                xiVar = new xi(wnVar, u1Var.getMessageObject().getId(), u1Var, 1);
                wnVar.f39716zb = xiVar;
            }
            i10 = ((org.telegram.ui.ActionBar.m2) this.f34543a).currentAccount;
            yh.t5 y3 = yh.t5.y(i10, false);
            Objects.requireNonNull(xiVar);
            aj ajVar = new aj(xiVar, 7);
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.d6 I = yh.t5.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f48028a).getInputPeer(dialogId);
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
                vVar = new qg.v(y3, ConnectionsManager.getInstance(y3.f48028a).sendRequest(tL_payments_getPaymentForm, new ai.p3(y3, messageObject, tL_inputInvoiceMessage, ajVar, 19)), 5);
            }
            if (vVar != null) {
                xiVar.f15422b = vVar;
                xiVar.d();
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
                    TLRPC.TL_message C7 = wn.C7(message);
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
                wn wnVar2 = this.f34543a;
                t12.J2(null, wnVar2, wnVar2.f39454ea);
                PhotoViewer.t1().a2(arrayList, i11, this.f34543a.a(), 0L, 0L, this.f34543a.Ga);
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
        wn wnVar = this.f34543a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            rg.k1 k1Var = new rg.k1(wnVar, i10, user, null, null, wnVar.f39454ea);
            u1Var.getLocationOnScreen(new int[2]);
            k1Var.f42634v0 = u1Var.getNameStatusX();
            k1Var.f42635w0 = u1Var.getNameStatusY();
            k1Var.f42638z0 = u1Var.getScaleX();
            k1Var.f42636x0 = u1Var.getLeft();
            k1Var.f42637y0 = u1Var.getTop();
            k1Var.A0 = u1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
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
                k1Var.f42633u0 = num;
            } else {
                k1Var.f42633u0 = Integer.valueOf(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19304r8[colorId]));
            }
            org.telegram.ui.Components.o5 o5Var = u1Var.f21326fc;
            if (o5Var != null && (o5Var.f26916f[0] instanceof org.telegram.ui.Components.q5)) {
                k1Var.f42638z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(wnVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f19209m6, 0.2f);
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
                        Integer num2 = k1Var.f42633u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19376v6);
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
            wnVar.showDialog(k1Var);
            return;
        }
        nf.f.s(wnVar.getParentActivity(), "https://" + wnVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final int V() {
        return this.f34543a.R3;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.f34543a.U7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.u1 r49, org.telegram.tgnet.TLRPC.PollAnswer r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.in.V1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
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
            wn wnVar = this.f34543a;
            if (!wnVar.f39504ic && messageObject.getId() == wnVar.f39491hc) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - wnVar.f39516jc > 1000) {
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
        wn wnVar = this.f34543a;
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.T5), u1Var);
    }

    @Override
    public final hh.a Y() {
        return this.f34543a.Pb;
    }

    @Override
    public final hv0 Y1() {
        return this.f34543a.f39677wa;
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
            wn wnVar = this.f34543a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = wnVar.f39680x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = wnVar.f39680x0.getChildAt(i11);
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
            wnVar.Jb(messageObject, spannableStringBuilder, 1);
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
            wn wnVar = this.f34543a;
            if (wnVar.R3 != 1 && !wnVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a2(long j3) {
        wn wnVar = this.f34543a;
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return wnVar.getMessagesController().isAdmin(wnVar.e.f18321id, j3);
        }
        return false;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        wn wnVar = this.f34543a;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            CharSequence fieldText = jkVar.getFieldText();
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
                wnVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new tm(this, 6), 200L);
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
        ok okVar;
        nk nkVar;
        if (!m()) {
            return false;
        }
        wn wnVar = this.f34543a;
        if (wnVar.e != null && (((okVar = wnVar.O0) == null || okVar.getVisibility() != 0) && ((nkVar = wnVar.R) == null || nkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && ((wnVar.f39436d4 == 0 || wnVar.f39484h4) && (!ChatObject.isChannel(chat) || wnVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c10 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.f32905n;
            c10 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c10] = d5.f32906r;
        }
        TLRPC.UserFull userFull = wnVar.getMessagesController().getUserFull(user.f18468id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        } else {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) wnVar.fragmentView, wnVar.f39454ea, b10, new b7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(wnVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final in f38764b;

            {
                this.f38764b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f38764b.y(user, false);
                        return;
                    case 1:
                        this.f38764b.c(user);
                        return;
                    default:
                        this.f38764b.f34543a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new r1(this, u1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final in f38764b;

            {
                this.f38764b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f38764b.y(user, false);
                        return;
                    case 1:
                        this.f38764b.c(user);
                        return;
                    default:
                        this.f38764b.f34543a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final in f38764b;

            {
                this.f38764b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f38764b.y(user, false);
                        return;
                    case 1:
                        this.f38764b.c(user);
                        return;
                    default:
                        this.f38764b.f34543a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f30548t = false;
        H.f30529i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.u1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.in.b2(org.telegram.ui.Cells.u1, int, float, float, boolean):void");
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        wn wnVar = this.f34543a;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            CharSequence fieldText = jkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(v7.j.t(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.c61("" + user.f18468id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            wnVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new tm(this, 7), 200L);
        }
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar = this.f34543a;
        if (wnVar.f39664vb != 0 && u1Var.getMessageObject() != null && wnVar.f39664vb == u1Var.getMessageObject().getId() && wnVar.f39678wb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.u1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.in.c2(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
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
        wn wnVar = this.f34543a;
        wnVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(wnVar.getParentActivity()) && (chat = wnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == wnVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == wnVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                org.telegram.ui.Components.l01.b(parentActivity, i10, -wnVar.e.f18321id, currentUser, str2, z15, z16, z12, d6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == wnVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(wnVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                wnVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(wnVar.e);
                tL_channels_getParticipant.participant = wnVar.getMessagesController().getInputPeer(currentUser.f18468id);
                wnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new ai.m0(7, this, u1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
            org.telegram.ui.Components.l01.b(parentActivity2, i10, -wnVar.e.f18321id, currentUser, str2, z152, z162, z12, d6Var);
        }
    }

    @Override
    public final void d0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        wn wnVar = this.f34543a;
        try {
            if (i10 == 0) {
                wnVar.h7();
                fl flVar = wnVar.f39708z3;
                if (flVar != null) {
                    flVar.l(0L, 84, null, new tm(this, 1));
                    wnVar.f39708z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (wnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.r31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.r31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.yc.a0(wnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                wnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(wnVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new tm(this, 2));
                } else if (wnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new tm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), a02.f30580c);
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
                ybVar.f30575b.setText(append2);
                ybVar.f30575b.setSingleLine(false);
                ybVar.f30575b.setMaxLines(6);
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
        wn wnVar = this.f34543a;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (!kVar2.s() && !wnVar.A9()) {
                z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
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
        if (this.f34543a.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void e2(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        wn wnVar = this.f34543a;
        if (AndroidUtilities.isContextSafe(wnVar.getParentActivity()) && (chat = wnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(u1Var, wnVar.getMessagesController().getParticipant(wnVar.e.f18321id, currentUser.f18468id));
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.f34543a.I7(u1Var, true, false, f7, f10, false, false, false);
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
        wn wnVar = this.f34543a;
        if (isHuaweiStoreApp) {
            nf.f.s(wnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(wnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
        Bundle e = v7.j.e(j3, "user_id");
        org.telegram.ui.ActionBar.m2 m2Var = this.f34543a;
        if (m2Var.getMessagesController().checkCanOpenChat(e, m2Var, u1Var.getMessageObject())) {
            m2Var.presentFragment(new wn(e));
        }
    }

    @Override
    public final String h(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (wnVar = this.f34543a).f39664vb) != 0 && i10 == u1Var.getMessageObject().getId() && wnVar.f39678wb == 3) {
            return wnVar.f39703yb;
        }
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        wn wnVar = this.f34543a;
        if (wnVar.f39665vc.f14186f && (cVar = wnVar.Bc) != null && cVar.f42027n == u1Var && cVar.f42023a.getWidth() > 0) {
            return wnVar.Bc.f42023a.getHeight();
        }
        return 0;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        jm jmVar;
        long dialogId = messageObject.getDialogId();
        wn wnVar = this.f34543a;
        if ((dialogId == 1271266957 || ((jmVar = wnVar.A0) != null && jmVar.N)) && wnVar.R3 != 7) {
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
            org.telegram.ui.ActionBar.m2 m2Var = this.f34543a;
            m2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, m2Var, true);
            return;
        }
        fVar.run();
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        wn wnVar = this.f34543a;
        if (wnVar.getParentActivity() != null) {
            if (wnVar.X9 == null) {
                uh.i iVar = new uh.i(wnVar.getParentActivity());
                wnVar.X9 = iVar;
                wnVar.X0.addView(iVar, w7.y5.e(-1, -1, 48));
            }
            uh.i iVar2 = wnVar.X9;
            HashMap hashMap = iVar2.f44074a;
            ArrayList arrayList = iVar2.f44076c;
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
                    long j11 = dialog.f18325id;
                    if (j11 != j3 && !DialogObject.isEncryptedDialog(j11)) {
                        if (DialogObject.isUserDialog(dialog.f18325id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f18325id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f18468id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f18325id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f18325id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f18325id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f18325id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f18325id));
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
                uh.h hVar = new uh.h(iVar2, u1Var, arrayList4, new u2.i0(6, iVar2, b10));
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
            wn wnVar = this.f34543a;
            if (a10) {
                org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.e_hand_2, 36, qh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                wnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                u1Var.S0(true);
            } else if (wnVar.getParentActivity() != null) {
                if (wnVar.f39556n2 == null) {
                    org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(5, wnVar.getParentActivity(), wnVar.f39454ea, false);
                    wnVar.f39556n2 = j40Var;
                    j40Var.setAlpha(0.0f);
                    wnVar.f39556n2.setVisibility(4);
                    int indexOfChild = wnVar.X0.indexOfChild(wnVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    wnVar.X0.addView(wnVar.f39556n2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.s1> pollButtons = u1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.s1 s1Var = pollButtons.get(i16);
                            float y3 = ((u1Var.getY() + s1Var.f20886b) - AndroidUtilities.dp(4.0f)) - wnVar.f39625s9;
                            wnVar.f39591q2 = AndroidUtilities.dp(13.3f) + s1Var.f20885a;
                            int D = org.telegram.messenger.ok.D(6.0f, s1Var.f20886b, i12);
                            wnVar.f39604r2 = D;
                            if (y3 > 0.0f) {
                                i15 = wnVar.f39591q2;
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
                        wnVar.f39680x0.v0(0, (int) f7, null);
                        wnVar.f39579p2 = u1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                wnVar.f39556n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void k() {
        g();
    }

    @Override
    public final void k1() {
        wn wnVar = this.f34543a;
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, wnVar.T5, null);
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        uj ujVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        wn wnVar = this.f34543a;
        rj rjVar = wnVar.f39680x0;
        if (rjVar != null && (ujVar = wnVar.f39705z0) != null && ujVar.f42943y < 0) {
            for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = wnVar.f39680x0.getChildAt(childCount);
                wnVar.f39680x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = wnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i11 = wnVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                uj ujVar2 = wnVar.f39705z0;
                wnVar.f39680x0.getClass();
                ujVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) wnVar.f39625s9), false);
            } else {
                wnVar.f39705z0.h1(i10, i11);
            }
        }
        wnVar.N0 = z11;
        wnVar.rc(primaryMessageObject, false);
        wnVar.N0 = false;
    }

    @Override
    public final boolean l0() {
        boolean z10;
        wn wnVar = this.f34543a;
        if (!wnVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
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
            wn wnVar = this.f34543a;
            if (wnVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.J2(null, wnVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new sm(wnVar, arrayList), null, 0L, 0L, 0L, true, new rm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean m() {
        wn wnVar = this.f34543a;
        if (!UserObject.isUserSelf(wnVar.f39456f)) {
            TLRPC.Chat chat = wnVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !wnVar.e.megagroup) {
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
        wn wnVar = this.f34543a;
        if (!wnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (wnVar.getParentActivity() != null) {
                if (wnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    jk jkVar = wnVar.Y;
                    MessageObject messageObject = u1Var.getMessageObject();
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    wi wiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    nf.e eVar = wnVar.f39716zb;
                    if (eVar != null) {
                        eVar.a(true);
                        wnVar.f39716zb = null;
                    }
                    if (str != null && u1Var.getMessageObject() != null) {
                        wi wiVar2 = new wi(wnVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                        wnVar.f39716zb = wiVar2;
                        wiVar = wiVar2;
                    } else {
                        wnVar.f39716zb = null;
                    }
                    jkVar.c0(keyboardButtonProto, messageObject, messageObject2, wiVar);
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
        this.f34543a.rc(primaryMessageObject, false);
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
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
            wn wnVar = this.f34543a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(wnVar)) {
                    cd0 cd0Var = new cd0(3);
                    d6Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                    cd0Var.setResourceProvider(d6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = wnVar.getMessagesController().getPeer(wnVar.a());
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
                    cd0Var.O0 = false;
                    cd0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    wnVar.presentFragment(cd0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                nt.q().w(wnVar.getParentActivity());
                nt.q().v(new gn(this, tL_messageMediaPoll, pollAnswer, u1Var));
                nt q6 = nt.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = u1Var.getMessageObject();
                d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                q6.t(document4, null, "", null, null, i18, false, messageObject2, d6Var, 200);
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
                    TLRPC.TL_message C7 = wn.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = qh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    qh.a aVar = new qh.a(i15, messageObject, document6, qh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f42019g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = u1Var.f21593y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            qh.g gVar = u1Var.f21278c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            qh.g gVar2 = u1Var.f21264b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f42018f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = u1Var.f21593y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            qh.g gVar3 = u1Var.f21278c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            qh.g gVar4 = u1Var.f21264b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = wn.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = qh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().J2(null, wnVar, wnVar.f39454ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j3 = wnVar.T5;
                            } else {
                                j3 = 0;
                            }
                            if (i19 != 0) {
                                j10 = wnVar.L6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = wnVar.d();
                            }
                            t12.c2(messageObject6, wnVar, j3, j10, j11, wnVar.Fa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, wnVar.getParentActivity(), wnVar.f39454ea, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            wnVar.z6(messageObject6);
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
                    TLRPC.TL_message C73 = wn.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = qh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = wn.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = qh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                zf.d.b(tL_messageMediaPoll.poll, wnVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message C75 = wn.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = qh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().J2(null, wnVar, wnVar.f39454ea);
                    PhotoViewer.t1().a2(arrayList3, i11, wnVar.a(), 0L, 0L, wnVar.Ga);
                }
            }
        }
    }

    @Override
    public final void n0(String str) {
        wn wnVar = this.f34543a;
        ok okVar = wnVar.O0;
        if (okVar == null || okVar.getVisibility() != 0) {
            nk nkVar = wnVar.R;
            if ((nkVar == null || nkVar.getVisibility() != 0) && wnVar.Y != null && str != null && str.length() > 0) {
                jk jkVar = wnVar.Y;
                jkVar.setFieldText("@" + str + " ");
                wnVar.Y.H0();
            }
        }
    }

    @Override
    public final void o(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            k1();
            return;
        }
        wn wnVar = this.f34543a;
        if (!wnVar.f39532l3 && wnVar.f39680x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
            if (wnVar.f39643u2 == null) {
                pm pmVar = wnVar.X0;
                int indexOfChild = pmVar.indexOfChild(wnVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(1, wnVar.getParentActivity(), wnVar.f39454ea, false);
                    wnVar.f39643u2 = j40Var;
                    pmVar.addView(j40Var, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    wnVar.f39643u2.setAlpha(0.0f);
                    wnVar.f39643u2.setVisibility(4);
                } else {
                    return;
                }
            }
            wnVar.f39643u2.e(u1Var, null, 0, 0, true);
        }
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.z5 z5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        wn wnVar = this.f34543a;
        if (!wnVar.getMessagesController().premiumFeaturesBlocked() && z5Var != null && !z5Var.standard) {
            long documentId = z5Var.getDocumentId();
            TLRPC.Document document = z5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                document = org.telegram.ui.Components.q5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.uv uvVar = new org.telegram.ui.Components.uv(wnVar, wnVar.getParentActivity(), wnVar.f39454ea, arrayList);
                org.telegram.ui.Components.kv kvVar = uvVar.f28919f;
                kvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(kvVar);
                kvVar.v = imageReceiver;
                if (kvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                kvVar.f25879w = true;
                kvVar.f25880x.d(1.0f, true);
                kvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f19209m6, 0.2f, true), 0L, null, null, 0);
                kvVar.v.setLayerNum(7);
                kvVar.v.setAllowStartLottieAnimation(true);
                kvVar.v.setAllowStartAnimation(true);
                kvVar.v.setAutoRepeat(1);
                kvVar.v.setAllowDecodeSingleFrame(true);
                kvVar.v.setParentView(kvVar);
                uvVar.setCalcMandatoryInsets(wnVar.x9());
                wnVar.showDialog(uvVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p() {
        this.f34543a.X0.getClass();
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var != null && document != null) {
            wn wnVar = this.f34543a;
            if (wnVar.getParentLayout() != null && a0(u1Var)) {
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(wnVar, u1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new r1(this, u1Var, document, 24), false);
                H.f30548t = false;
                H.Z();
            }
        }
    }

    public final void q(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        wn wnVar = this.f34543a;
        TLRPC.Chat chat2 = wnVar.e;
        if (chat2 != null && chat.f18321id == chat2.f18321id) {
            mj mjVar = wnVar.f39394a1;
            if (mjVar != null && i10 == 0) {
                mjVar.e(false, false);
            } else if (u1Var.getMessageObject() != null) {
                wnVar.F(i10, u1Var.getMessageObject().getId(), 0, 0, true, false);
            }
        } else if (chat2 == null || chat.f18321id != chat2.f18321id || wnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18321id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            xi xiVar = null;
            if (z10) {
                nf.e eVar = wnVar.f39716zb;
                if (eVar != null) {
                    eVar.a(true);
                    wnVar.f39716zb = null;
                }
                if (u1Var.getMessageObject() == null) {
                    wnVar.f39716zb = null;
                } else {
                    xi xiVar2 = new xi(wnVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    wnVar.f39716zb = xiVar2;
                    xiVar = xiVar2;
                }
            }
            if (wnVar.getMessagesController().checkCanOpenChat(bundle, wnVar, u1Var.getMessageObject(), xiVar)) {
                wn wnVar2 = new wn(bundle);
                if (xiVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new ei.l3(this, xiVar, chat, i10, wnVar2, 17), 5000L);
                    xiVar.d();
                    return;
                }
                wnVar.presentFragment(wnVar2);
            }
        }
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        wn wnVar = this.f34543a;
        wnVar.I7(u1Var, false, false, f7, f10, true, false, false);
        wnVar.f39680x0.getClass();
        wn.c2(wnVar, RecyclerView.R(u1Var));
    }

    @Override
    public final void q2() {
        this.f34543a.r9();
    }

    @Override
    public final void r(org.telegram.ui.Cells.u1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.in.r(org.telegram.ui.Cells.u1):void");
    }

    @Override
    public final void s() {
        this.f34543a.Yb();
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        uj ujVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            wn wnVar = this.f34543a;
            rj rjVar = wnVar.f39680x0;
            if (rjVar != null && (ujVar = wnVar.f39705z0) != null && ujVar.f42943y < 0) {
                for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = wnVar.f39680x0.getChildAt(childCount);
                    wnVar.f39680x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = wnVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = wnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            wnVar.rc(primaryMessageObject, false);
            ci.e4 e4Var = wnVar.A1;
            if (e4Var != null) {
                e4Var.e(true);
            }
            if (i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
                wnVar.f39705z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f34543a;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        boolean z10 = true;
        if (!kVar.s() && !wnVar.A9()) {
            if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
                P0(10, u1Var);
                return;
            }
            if (!ChatObject.isForum(wnVar.e) && !wnVar.F9()) {
                z10 = false;
            }
            y(user, z10);
            return;
        }
        wn.b2(wnVar, u1Var, true, f7, f10);
    }

    @Override
    public final void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f34543a.W7(u1Var, reactionCount, z10, f7, f10);
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
        wn wnVar = this.f34543a;
        wnVar.aa(wnVar.e.f18321id, messageObject2, messageObject2.getId(), j10, i10, 0, null);
    }

    @Override
    public final void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        uh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        uh.i iVar = this.f34543a.X9;
        if (iVar != null && (hVar = (uh.h) iVar.f44074a.get(uh.i.b(u1Var))) != null) {
            uh.d[] dVarArr = hVar.f44071w;
            RectF rectF = hVar.f44069r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = uh.g.f44056a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(uh.g.f44056a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.q.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f44063a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        uh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f44035p != z10) {
                            ValueAnimator valueAnimator = dVar.f44033n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f44035p = z10;
                            float f15 = dVar.f44034o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f44033n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f44033n.addUpdateListener(dVar);
                            dVar.f44033n.setInterpolator(uh.f.f44039a);
                            dVar.f44033n.start();
                        }
                        uh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f44032m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f44030k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f44032m = z11;
                            float f16 = dVar2.f44031l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f44030k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f44030k.addUpdateListener(dVar2);
                            dVar2.f44030k.setInterpolator(uh.f.f44039a);
                            dVar2.f44030k.start();
                        }
                    }
                }
            }
        }
    }

    public final void v(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f18468id);
            org.telegram.ui.ActionBar.m2 m2Var = this.f34543a;
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var, u1Var.getMessageObject())) {
                m2Var.presentFragment(new wn(bundle));
            }
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r45, float r46, float r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.in.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        wn wnVar = this.f34543a;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
        if (z10 && wnVar.J9) {
            b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                ((ActionBarLayout) b5Var2).r();
            }
            return true;
        }
        return !e();
    }

    @Override
    public final String w(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        wn wnVar = this.f34543a;
        if (UserObject.isBotForum(wnVar.f39456f)) {
            return null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = wnVar.getMessagesController().getAdminRank(wnVar.e.f18321id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = wnVar.f39424c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f34543a.f39615s.containsKey(messageObject);
    }

    public final void x(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18321id);
            bundle.putBoolean("expandPhoto", false);
            this.f34543a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void x2() {
        wn wnVar = this.f34543a;
        if (wnVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", wnVar.T5);
            bundle.putInt("start_from", 10);
            wnVar.presentFragment(new org.telegram.ui.Components.na0(bundle, wnVar.f39394a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", wnVar.getMessagesController().recommendedChannelsLimitPremium), new tm(this, 4))).j();
    }

    public final void y(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f18468id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z10 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f18468id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            wn wnVar = this.f34543a;
            TLRPC.User user2 = wnVar.f39456f;
            if (user2 != null && user2.f18468id == user.f18468id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            wnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void y0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar = this.f34543a.Bc;
        if (cVar != null && cVar.f42027n == u1Var) {
            cVar.f42030w.getClass();
        }
    }

    @Override
    public final void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        wn wnVar = this.f34543a;
        ci.e4 e4Var = wnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        if (wnVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            ci.e4 e4Var2 = new ci.e4(wnVar.getParentActivity(), 3);
            e4Var2.p(true);
            e4Var2.K = Layout.Alignment.ALIGN_NORMAL;
            e4Var2.d = -1L;
            e4Var2.T = true;
            e4Var2.e = true;
            e4Var2.q(12.0f);
            wnVar.A1 = e4Var2;
            e4Var2.f4615l0 = new dh(12, this, e4Var2);
            e4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            wnVar.X0.addView(wnVar.A1, w7.y5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            wnVar.X0.post(new i2.a0(this, u1Var, i11, i10, 4));
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
            this.f34543a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void z0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.d6 animation;
        wn wnVar = this.f34543a;
        if (!wnVar.f39532l3 && !SharedConfig.noSoundHintShowed && wnVar.f39680x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
            org.telegram.ui.Components.j40 j40Var = wnVar.f39631t2;
            if (j40Var == null || j40Var.getTag() == null) {
                if (wnVar.f39631t2 == null) {
                    pm pmVar = wnVar.X0;
                    int indexOfChild = pmVar.indexOfChild(wnVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.j40 j40Var2 = new org.telegram.ui.Components.j40(0, wnVar.getParentActivity(), wnVar.f39454ea, false);
                        wnVar.f39631t2 = j40Var2;
                        j40Var2.setShowingDuration(10000L);
                        pmVar.addView(wnVar.f39631t2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        wnVar.f39631t2.setAlpha(0.0f);
                        wnVar.f39631t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = wnVar.f39680x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = wnVar.f39680x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && wnVar.f39631t2.e(u1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.r9 z2() {
        return this.f34543a.f39429c9;
    }
}
