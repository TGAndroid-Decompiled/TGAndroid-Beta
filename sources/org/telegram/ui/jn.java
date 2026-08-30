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
public final class jn implements org.telegram.ui.Cells.k1 {
    public final xn f35381a;

    public jn(xn xnVar) {
        this.f35381a = xnVar;
    }

    public static void a(jn jnVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        xn xnVar = jnVar.f35381a;
        if (xnVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && xnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                xnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
                tL_message.f19205id = messageObject.getId();
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
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(xnVar.getParentActivity(), xnVar.getAccountInstance(), arrayList, new ta(jnVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.f35381a;
        if (!xnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(xnVar.getParentActivity(), 3, null);
            d2Var.q(200L);
            xnVar.getMessagesController().getContentSettings(new a0(this, d2Var, t1Var, 5));
            return;
        }
        if (t1Var.getMessageObject() != null) {
            t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        t1Var.h4();
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return !this.f35381a.f40171s.containsKey(messageObject);
    }

    @Override
    public final void A2() {
        xn xnVar = this.f35381a;
        if (xnVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", xnVar.Q5);
            bundle.putInt("start_from", 10);
            xnVar.presentFragment(new org.telegram.ui.Components.da0(bundle, xnVar.X0.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", xnVar.getMessagesController().recommendedChannelsLimitPremium), new um(this, 4))).j();
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var) {
        dh.f fVar = this.f35381a.f40270zc;
        if (fVar != null && fVar.f4895n == t1Var) {
            fVar.f4898w.getClass();
        }
    }

    @Override
    public final void B2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        xn xnVar = this.f35381a;
        ph.f3 f3Var = xnVar.f40235x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (xnVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            ph.f3 f3Var2 = new ph.f3(xnVar.getParentActivity(), 3);
            f3Var2.q(true);
            f3Var2.H = Layout.Alignment.ALIGN_NORMAL;
            f3Var2.d = -1L;
            f3Var2.Q = true;
            f3Var2.e = true;
            f3Var2.r(12.0f);
            xnVar.f40235x1 = f3Var2;
            f3Var2.f41617i0 = new yb(24, this, f3Var2);
            f3Var2.t(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            xnVar.U0.addView(xnVar.f40235x1, k7.b6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            xnVar.U0.post(new j3.b0(this, t1Var, i11, i10, 4));
        }
    }

    @Override
    public final void C0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.y5 animation;
        xn xnVar = this.f35381a;
        if (!xnVar.f40050i3 && !SharedConfig.noSoundHintShowed && xnVar.f40193u0 != null && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
            org.telegram.ui.Components.k40 k40Var = xnVar.f40147q2;
            if (k40Var == null || k40Var.getTag() == null) {
                if (xnVar.f40147q2 == null) {
                    pm pmVar = xnVar.U0;
                    int indexOfChild = pmVar.indexOfChild(xnVar.P);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.k40 k40Var2 = new org.telegram.ui.Components.k40(0, xnVar.getParentActivity(), xnVar.f39968ba, false);
                        xnVar.f40147q2 = k40Var2;
                        k40Var2.setShowingDuration(10000L);
                        pmVar.addView(xnVar.f40147q2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        xnVar.f40147q2.setAlpha(0.0f);
                        xnVar.f40147q2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = xnVar.f40193u0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = xnVar.f40193u0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && xnVar.f40147q2.e(t1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.n9 C2() {
        return this.f35381a.Z8;
    }

    @Override
    public final boolean D1() {
        xn xnVar = this.f35381a;
        if (xnVar.U0.getMeasuredWidth() > xnVar.U0.getMeasuredHeight()) {
            return true;
        }
        return false;
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
            int i13 = buttonCustom.f16655id;
            TL_stars.StarsAmount starsAmount = null;
            xn xnVar = this.f35381a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                kh.a1 a1Var = new kh.a1(25, this, message);
                Pattern pattern = org.telegram.ui.Components.z4.f31230a;
                Activity parentActivity = xnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
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
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.o4(parentActivity)});
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.o1(0, a1Var, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d2Var.K = new org.telegram.ui.Components.p1(editText, 0);
                frameLayout.addView(editText, k7.b6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fg(editText, 3), 100L);
                xnVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, xnVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, xnVar.e, 5);
                    }
                    cg.u0 u0Var = new cg.u0(this, message, canManageMonoForum, messageObject, 7);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    xnVar.g7(u0Var, mf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                xnVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                xnVar.O1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        xn xnVar = this.f35381a;
        if (xnVar.getParentActivity() != null && tLObject != null) {
            e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                if (((ActionBarLayout) e5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z10 = tLObject instanceof TLRPC.Chat;
            if (z10) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19184id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f19331id);
            } else {
                return;
            }
            if (z4 && z10) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, xnVar.getParentActivity(), xnVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(xnVar.getParentActivity(), false, false);
                g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                g1Var.setMinimumWidth(160);
                g1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(xnVar.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, t1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                xn xnVar2 = new xn(bundle);
                xnVar2.G9 = true;
                xnVar.presentFragmentAsPreviewWithMenu(xnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                xnVar.d7();
                return;
            }
            xnVar.presentFragment(new xn(bundle));
        }
    }

    @Override
    public final void E1(org.telegram.ui.Cells.t1 t1Var) {
        xn.U4(this.f35381a, t1Var);
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.f35381a;
        xnVar.f40203ua.l(t1Var, xnVar, true);
        xnVar.f40193u0.I0(false);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        boolean z4;
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        xn xnVar = this.f35381a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(xnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(xnVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = xnVar.getMessagesController().conferenceCallSizeLimit;
                d2Var.setOnCancelListener(new lh.w(this, xnVar.getConnectionsManager().sendRequest(getgroupcall, new gg.e0(this, d2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 6)), 2));
                d2Var.q(600L);
                return;
            }
            TLRPC.User user = xnVar.f40009f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = xnVar.X7;
                if (userFull != null && userFull.video_calls_available) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Components.voip.f2.n(user, isVideoCall, z4, xnVar.getParentActivity(), xnVar.getMessagesController().getUserFull(xnVar.f40009f.f19331id), xnVar.getAccountInstance());
                return;
            }
            return;
        }
        xnVar.I7(t1Var, true, false, f10, f11, messageObject.isMusic(), false, false);
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        k(t1Var, z4, false, false);
    }

    @Override
    public final void H0(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, false, true);
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            b.m(R.string.CodeCopied, org.telegram.ui.Components.qc.a0(this.f35381a));
        }
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        boolean z4;
        int i15;
        boolean z10;
        int i16;
        z4 z4Var;
        int i17;
        int i18;
        f5 f5Var;
        ok okVar;
        nk nkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        xn xnVar = this.f35381a;
        if (!isEmpty && xnVar.e != null && (((okVar = xnVar.L0) == null || okVar.getVisibility() != 0) && ((nkVar = xnVar.O) == null || nkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = xnVar.e;
        if (chat2 != null && ((xnVar.f39948a4 == 0 || xnVar.f40001e4) && (!ChatObject.isChannel(chat2) || xnVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = xnVar.e;
        if (chat3 != null && chat3.f19184id == chat.f19184id && !xnVar.F9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        f5[] f5VarArr = new f5[i12 + 1 + i10 + i11];
        f5VarArr[0] = f5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                f5Var = f5.e;
            } else {
                f5Var = f5.f34160f;
            }
            f5VarArr[1] = f5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            f5VarArr[i13] = f5.f34161n;
            i13++;
        }
        if (i11 != 0) {
            f5VarArr[i13] = f5.f34162r;
        }
        TLRPC.ChatFull chatFull = xnVar.getMessagesController().getChatFull(chat.f19184id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
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
            z4 = true;
            i15 = i20;
            z10 = i10;
            i16 = i19;
            z4Var = new z4(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, f5VarArr, new b5(i14, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            z4Var = z4.a(chat, chatFull, f5VarArr);
            z10 = i10;
            i16 = i11;
            i15 = i12;
            z4 = true;
        }
        if (cb.m.e(z4Var)) {
            cb.m.l().v((ViewGroup) xnVar.fragmentView, xnVar.f39968ba, z4Var, new d7(this, chat, t1Var, 7));
            return z4;
        }
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(xnVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new xm(this, chat, 0), false);
        boolean z11 = chat.broadcast;
        if (z11) {
            i17 = R.drawable.msg_channel;
        } else {
            i17 = R.drawable.msg_discussion;
        }
        if (z11) {
            i18 = R.string.OpenChannel2;
        } else {
            i18 = R.string.OpenGroup2;
        }
        H.l(i17, LocaleController.getString(i18), new s1(this, t1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new xm(this, chat, 1), z10);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new xm(this, chat, 2), i16);
        H.f27490t = false;
        H.f27471i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void J0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            xn xnVar = this.f35381a;
            if ((xnVar.f40191tb != id2 || xnVar.f40204ub != 7) && (inputPeer = xnVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f19402id = id2;
                af.f fVar = xnVar.f40245xb;
                if (fVar != null) {
                    fVar.a(true);
                    xnVar.f40245xb = null;
                }
                wi wiVar = new wi(xnVar, id2, t1Var, 2);
                wiVar.f165b = new yb(12, xnVar, r3);
                xnVar.f40245xb = wiVar;
                wiVar.d();
                int[] iArr = {xnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new fg(xnVar, wiVar, iArr, t1Var, messageObject))};
            }
        }
    }

    @Override
    public final void J1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        xn xnVar = this.f35381a;
        if (!xnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (xnVar.getParentActivity() != null) {
                if (xnVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(xnVar.getParentActivity(), xnVar.f39968ba, false, false);
                        g3Var.fixNavigationBar();
                        g3Var.title = str;
                        g3Var.bigTitle = false;
                        g3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        cg.u1 u1Var = new cg.u1(3, xnVar, str);
                        g3Var.items = charSequenceArr;
                        g3Var.onClickListener = u1Var;
                        xnVar.showDialog(g3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        xnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
    public final boolean K1() {
        xn xnVar = this.f35381a;
        if (xnVar.U0.getKeyboardHeight() + xnVar.f40093la >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f35381a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void L0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        xn xnVar = this.f35381a;
        xnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        xnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(t1Var, true, false, true);
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, jh.f fVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f35381a;
            p2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, p2Var, true);
            return;
        }
        fVar.run();
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        xn xnVar = this.f35381a;
        xnVar.f39949a5 = messageObject;
        xnVar.d9();
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z4 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        xn xnVar = this.f35381a;
        if (z4) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (xnVar.Q5 != j10) {
                xnVar.presentFragment(xn.R9(j10));
            } else {
                xnVar.X0.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            xnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void O(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f35381a.fb(messageObject, true);
        }
    }

    @Override
    public final boolean O0(long j10) {
        xn xnVar = this.f35381a;
        TLRPC.Chat chat = xnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return xnVar.getMessagesController().isOwner(xnVar.e.f19184id, j10);
        }
        return false;
    }

    @Override
    public final void O1(MessageObject messageObject) {
        this.f35381a.f40171s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        xn xnVar = this.f35381a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!t1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(xnVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!xnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new um(this, 9))).k(true);
            return false;
        } else {
            xnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(xnVar.e, xnVar.W7, true), t1Var.getMessageObject(), todoItem, z4, null);
            return true;
        }
    }

    @Override
    public final void P0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        ArrayList<MessageObject> arrayList;
        i5.v vVar;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        xn xnVar = this.f35381a;
        hh.k kVar = xnVar.U9;
        if (kVar != null) {
            HashMap hashMap = kVar.f7168a;
            hh.j jVar = (hh.j) hashMap.get(hh.k.b(t1Var));
            org.telegram.ui.Components.ic icVar = null;
            if (jVar != null) {
                messageObject = jVar.B;
            } else {
                messageObject = null;
            }
            hh.j jVar2 = (hh.j) xnVar.U9.f7168a.get(hh.k.b(t1Var));
            if (jVar2 != null && (i11 = jVar2.O) != -1) {
                j10 = jVar2.f7165w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                boolean z4 = false;
                if (!org.telegram.ui.Components.z4.h(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) xnVar.f40199u6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.y3.m(messageObject);
                    }
                    if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z4 = true;
                    }
                    long j11 = j10;
                    i5.v vVar2 = new i5.v(this, arrayList, j11, 16);
                    if (z4) {
                        vVar2.run();
                        vVar = null;
                    } else {
                        vVar = vVar2;
                    }
                    icVar = org.telegram.ui.Components.qc.v(xnVar.getParentActivity(), xnVar, null, 1, j11, 1, xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, vVar);
                    icVar.f25673k = true;
                    icVar.k(icVar.e instanceof org.telegram.ui.Components.tb);
                }
            }
            hh.j jVar3 = (hh.j) hashMap.get(hh.k.b(t1Var));
            if (jVar3 != null) {
                if (icVar == null) {
                    jVar3.O = -1;
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.nb nbVar = icVar.e;
                if (!(nbVar instanceof org.telegram.ui.Components.qb)) {
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.qb qbVar = (org.telegram.ui.Components.qb) nbVar;
                jVar3.T = qbVar;
                qbVar.f28099a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = jVar3.T.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new hh.f(0, jVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void P1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        Uri parse;
        boolean z10;
        fn fnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z4 && af.g.h(str, false, false)) {
            z10 = true;
        } else {
            z10 = z4;
        }
        xn xnVar = this.f35381a;
        af.f fVar = xnVar.f40245xb;
        if (fVar != null) {
            fVar.a(true);
        }
        if (t1Var.getMessageObject() == null) {
            fnVar = null;
        } else {
            fnVar = new fn(this, t1Var);
        }
        xnVar.f40245xb = fnVar;
        if (!z10 && !af.g.f(parse, false, null)) {
            org.telegram.ui.Components.z4.r0(xnVar, str, true, true, true, !z10, xnVar.f40245xb, webPage, xnVar.f39968ba);
        } else {
            af.g.r(xnVar.getParentActivity(), parse, true, true, false, xnVar.f40245xb, null, false, true, false);
        }
    }

    @Override
    public final boolean Q() {
        xn xnVar = this.f35381a;
        if (xnVar.T5[1].size() + xnVar.T5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var != null) {
            xn xnVar = this.f35381a;
            if (xnVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(xnVar.e);
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
    public final void R0(int i10, org.telegram.ui.Cells.t1 t1Var) {
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
        final boolean z4;
        MessageObject messageObject = t1Var.getMessageObject();
        boolean z10 = false;
        cn cnVar = null;
        cn cnVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        cn cnVar3 = null;
        cn cnVar4 = null;
        xn xnVar = this.f35381a;
        if (i10 == 19) {
            af.f fVar = xnVar.f40245xb;
            if (fVar != null) {
                fVar.a(true);
            }
            if (t1Var.getMessageObject() != null) {
                cnVar2 = new cn(this, t1Var, 2);
            }
            final cn cnVar5 = cnVar2;
            xnVar.f40245xb = cnVar5;
            final Activity parentActivity = xnVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = xnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            cnVar5.d();
            cnVar5.f165b = new gg.k(atomicBoolean, 0);
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
            final String b10 = gg.r.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z4 = true;
            } else {
                z4 = false;
            }
            final long j10 = messageObject.messageOwner.date * 1000;
            gg.p0.d(messageObject, new Utilities.Callback(atomicBoolean, cnVar5, z4, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f6697a;
                public final af.f f6698b;
                public final boolean f6699c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f6700f;
                public final f6 f6701g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f6700f = parentActivity;
                    this.f6701g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f6697a.get()) {
                        this.f6698b.b();
                        boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z12 = this.f6699c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f6700f;
                        f6 f6Var = this.f6701g;
                        if (z11) {
                            r.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            r.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        }
                    }
                }
            }, new gg.m(atomicBoolean, cnVar5, 0));
        } else if (i10 == 21) {
            h();
        } else if (i10 == 84) {
            xnVar.ua(t1Var);
        } else if (i10 == 80) {
            hh.g gVar = org.telegram.ui.Components.vg0.L;
            if (xnVar.getParentActivity() != null) {
                xnVar.showDialog(new org.telegram.ui.Components.vg0(xnVar.getContext(), xnVar.getCurrentAccount(), messageObject, xnVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                    xnVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
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
                bundle.putLong("user_id", user.f19331id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                xnVar.presentFragment(new ProfileActivity(bundle, null));
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
                xnVar.showDialog(new org.telegram.ui.Components.se0(xnVar, null, user, null, file, se.b.d(str, false), str3, str4, xnVar.f39968ba));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            xnVar.presentFragment(new xn(kh.a2.g(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.y3.j(new StringBuilder("+"), user2.phone, se.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = se.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f19331id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                xnVar.presentFragment(new ns(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                xnVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    af.f fVar2 = xnVar.f40245xb;
                    if (fVar2 != null) {
                        fVar2.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        cnVar3 = new cn(this, t1Var, 4);
                    }
                    xnVar.f40245xb = cnVar3;
                    af.g.r(xnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, xnVar.f40245xb, null, false, xnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            xnVar.getOrCreateStoryViewer().G(xnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, nh.c7.a(xnVar.f40193u0));
                            return;
                        }
                    }
                }
                if (!xnVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
                    af.f fVar3 = xnVar.f40245xb;
                    if (fVar3 != null) {
                        fVar3.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        cnVar4 = new cn(this, t1Var, 5);
                    }
                    xnVar.f40245xb = cnVar4;
                    af.g.r(xnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, xnVar.f40245xb, null, false, true, false);
                }
            }
        } else {
            if (i10 == 24) {
                z10 = true;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                af.f fVar4 = xnVar.f40245xb;
                if (fVar4 != null) {
                    fVar4.a(true);
                }
                if (t1Var.getMessageObject() != null) {
                    cnVar = new cn(this, t1Var, 3);
                }
                xnVar.f40245xb = cnVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        xnVar.f40245xb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        xnVar.f40245xb.f165b = new af.b(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new org.telegram.messenger.zd(3, this, z10)), 24);
                        return;
                    }
                }
                af.g.r(xnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, xnVar.f40245xb, null, false, true, false);
            }
        }
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (xnVar = this.f35381a).f40191tb) != 0 && i10 == t1Var.getMessageObject().getId() && xnVar.f40204ub == 1) {
            return xnVar.f40217vb;
        }
        return null;
    }

    @Override
    public final boolean S() {
        xn xnVar = this.f35381a;
        if (!UserObject.isReplyUser(xnVar.f40009f) && !UserObject.isUserSelf(xnVar.f40009f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            xn xnVar = this.f35381a;
            org.telegram.ui.Components.pu.I(xnVar, messageObject, xnVar.Ca, str2, str3, str4, str, i10, i11, -1, xnVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        xn xnVar = this.f35381a;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (!kVar.s() && !xnVar.A9()) {
            if (!z4 && chat.signature_profiles && (messageObject = t1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                xnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                p(t1Var, chat, i10, z4);
                return;
            }
        }
        xn.b2(xnVar, t1Var, true, f10, f11);
    }

    @Override
    public final void T0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        xn xnVar = this.f35381a;
        xnVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, xnVar);
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        re reVar;
        i5.v vVar;
        boolean z4;
        org.telegram.ui.ActionBar.f6 f6Var;
        ah.d dVar;
        int i10;
        boolean z10;
        int i11;
        n41 n41Var;
        int i12;
        float f10;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f35381a.f40234x0.L();
                    xn xnVar = this.f35381a;
                    return mediaController.setPlaylist(L, messageObject, xnVar.I6, true ^ xnVar.f40234x0.K, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f35381a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            p41 p41Var = this.f35381a.W9;
            if (p41Var == null || p41Var.Y) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.qc.a0(this.f35381a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f35381a.W9 = new p41(this.f35381a.getParentActivity());
                p41 p41Var2 = this.f35381a.W9;
                if (!messageObject.isOutOwner()) {
                    reVar = this.f35381a.fb(messageObject, true);
                } else {
                    reVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    vVar = xn.O4(this.f35381a, messageObject);
                } else {
                    vVar = null;
                }
                Context context = p41Var2.f37171a;
                ah.d dVar2 = p41Var2.f37175c;
                p41Var2.U = reVar;
                p41Var2.V = vVar;
                n41 n41Var2 = p41Var2.K;
                if (n41Var2 != null) {
                    dVar2.removeView(n41Var2);
                    p41Var2.K = null;
                }
                p41Var2.L = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                p41Var2.J = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                p41Var2.P = z4;
                org.telegram.ui.Cells.t1 t1Var2 = p41Var2.L;
                if (t1Var2 != null) {
                    f6Var = t1Var2.getResourcesProvider();
                } else {
                    f6Var = null;
                }
                p41Var2.I = f6Var;
                if (p41Var2.L != null) {
                    p41Var2.Q = 0.0f;
                    p41Var2.R = t1Var.f22153n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        p41Var2.Q = view.getY() + p41Var2.Q;
                        p41Var2.R = view.getY() + p41Var2.R;
                    }
                    int width = p41Var2.L.getWidth();
                    int height = p41Var2.L.getHeight();
                    if (p41Var2.P) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    p41Var2.H = i14 - p41Var2.L.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    dVar = dVar2;
                    n41 n41Var3 = new n41(p41Var2, p41Var2.getContext(), UserConfig.selectedAccount, p41Var2.L.getResourcesProvider(), width, i14);
                    p41Var2.K = n41Var3;
                    p41Var2.L.j1(n41Var3);
                    p41Var2.K.i1(p41Var2.L);
                    p41Var2.K.setDelegate(new cb.b(17));
                    n41 n41Var4 = p41Var2.K;
                    MessageObject messageObject3 = p41Var2.J;
                    MessageObject.GroupedMessages currentMessagesGroup = p41Var2.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = p41Var2.L;
                    n41Var4.X3(messageObject3, currentMessagesGroup, t1Var3.C, t1Var3.B, false, false);
                    if (!p41Var2.P) {
                        org.telegram.ui.Components.d8 d8Var = new org.telegram.ui.Components.d8();
                        p41Var2.S = d8Var;
                        n41 n41Var5 = p41Var2.K;
                        d8Var.f24192i = n41Var5;
                        n41Var5.f21995be = d8Var;
                        if (n41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.mo0 seekBarWaveform = p41Var2.K.getSeekBarWaveform();
                            seekBarWaveform.L = p41Var2.f37179s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.f27093n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    p41Var2.E = false;
                    dVar.addView(p41Var2.K, new FrameLayout.LayoutParams(p41Var2.L.getWidth(), i14, 17));
                } else {
                    dVar = dVar2;
                    i10 = 360;
                }
                TextureView textureView = p41Var2.M;
                if (textureView != null) {
                    dVar.removeView(textureView);
                    p41Var2.M = null;
                }
                if (p41Var2.P) {
                    p41Var2.N = false;
                    TextureView textureView2 = new TextureView(context);
                    p41Var2.M = textureView2;
                    dVar.addView(textureView2, 0, k7.b6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.i71 i71Var = p41Var2.f37180w;
                if (i71Var != null) {
                    i71Var.B();
                    p41Var2.f37180w.H();
                    p41Var2.f37180w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = p41Var2.L;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(p41Var2.L.getMessageObject().currentAccount).getPathToAttach(p41Var2.L.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(p41Var2.L.getMessageObject().currentAccount).getPathToMessage(p41Var2.L.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && p41Var2.L.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(p41Var2.L.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.i71 i71Var2 = new org.telegram.ui.Components.i71();
                        p41Var2.f37180w = i71Var2;
                        i71Var2.G = new o41(p41Var2);
                        if (p41Var2.S != null) {
                            i71Var2.H = new o41(p41Var2);
                        }
                        if (p41Var2.P) {
                            i71Var2.V(p41Var2.M);
                        }
                        p41Var2.f37180w.D(Uri.fromFile(pathToAttach), "other");
                        p41Var2.f37180w.C();
                        org.telegram.ui.Components.ft ftVar = p41Var2.B;
                        if (ftVar != null) {
                            ftVar.f24955s = p41Var2.f37180w;
                            ftVar.a();
                        }
                    }
                    xn xnVar2 = this.f35381a;
                    xnVar2.showDialog(xnVar2.W9);
                    return false;
                }
                ph.f3 f3Var = p41Var2.f37181x;
                if (f3Var != null) {
                    dVar.removeView(f3Var);
                    p41Var2.f37181x = null;
                }
                MessageObject messageObject4 = p41Var2.J;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                MessageObject messageObject5 = p41Var2.J;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(p41Var2.J.currentAccount).getClientUserId()) {
                    ph.f3 f3Var2 = new ph.f3(context, 3);
                    p41Var2.f37181x = f3Var2;
                    f3Var2.q(true);
                    if (z10) {
                        long dialogId = p41Var2.J.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(p41Var2.J.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(p41Var2.J.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        ph.f3 f3Var3 = p41Var2.f37181x;
                        if (p41Var2.P) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        f3Var3.t(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ph.f3 f3Var4 = p41Var2.f37181x;
                        if (p41Var2.P) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        f3Var4.t(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    p41Var2.f37181x.r(12.0f);
                    ph.f3 f3Var5 = p41Var2.f37181x;
                    if (!z10 && !p41Var2.L.C) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    f3Var5.setPadding(AndroidUtilities.dp(f10), 0, 0, 0);
                    if (p41Var2.P) {
                        p41Var2.f37181x.n(0.5f, 0.0f);
                        p41Var2.f37181x.H = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        p41Var2.f37181x.n(0.0f, AndroidUtilities.dp(34.0f));
                        p41Var2.f37181x.H = Layout.Alignment.ALIGN_NORMAL;
                    }
                    p41Var2.f37181x.u(14.0f);
                    ph.f3 f3Var6 = p41Var2.f37181x;
                    f3Var6.h = ph.f3.a(f3Var6.getText(), p41Var2.f37181x.getTextPaint());
                    if (p41Var2.P) {
                        dVar.addView(p41Var2.f37181x, k7.b6.d((int) ((p41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((p41Var2.L.getHeight() + p41Var2.H) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        dVar.addView(p41Var2.f37181x, k7.b6.d((int) ((p41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((p41Var2.L.getWidth() * (-0.39999998f)) / 2.0f) + p41Var2.L.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((p41Var2.L.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    p41Var2.f37181x.v();
                }
                TextView textView = p41Var2.f37182y;
                if (textView != null) {
                    dVar.removeView(textView);
                    p41Var2.f37182y = null;
                }
                TextView textView2 = new TextView(context);
                p41Var2.f37182y = textView2;
                textView2.setTextColor(-1);
                p41Var2.f37182y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    p41Var2.f37182y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    p41Var2.f37182y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                p41Var2.f37182y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                k7.d6.a(p41Var2.f37182y);
                TextView textView3 = p41Var2.f37182y;
                if (z10) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                p41Var2.f37182y.setOnClickListener(new l41(p41Var2, 1));
                dVar.addView(p41Var2.f37182y, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (n41Var = p41Var2.K) != null && n41Var.getMessageObject() != null && p41Var2.K.getMessageObject().messageOwner != null) {
                    p41Var2.K.getMessageObject().messageOwner.media_unread = false;
                    p41Var2.K.invalidate();
                }
                xn xnVar22 = this.f35381a;
                xnVar22.showDialog(xnVar22.W9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void U(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, true, false);
    }

    @Override
    public final void V1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        xn xnVar = this.f35381a;
        if (xnVar.U0 != null && xnVar.getParentActivity() != null) {
            Context context = xnVar.U0.getContext();
            f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
            p31.T(context, xnVar, false, f6Var, null);
        }
    }

    @Override
    public final int W() {
        return this.f35381a.O3;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        this.f35381a.U7(characterStyle, z4, t1Var.getMessageObject(), t1Var);
    }

    @Override
    public final void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        wi wiVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        af.b bVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            xn xnVar = this.f35381a;
            af.f fVar = xnVar.f40245xb;
            if (fVar != null) {
                fVar.a(true);
                xnVar.f40245xb = null;
            }
            if (t1Var.getMessageObject() == null) {
                xnVar.f40245xb = null;
                wiVar = null;
            } else {
                wiVar = new wi(xnVar, t1Var.getMessageObject().getId(), t1Var, 1);
                xnVar.f40245xb = wiVar;
            }
            i10 = ((org.telegram.ui.ActionBar.p2) this.f35381a).currentAccount;
            lh.t7 y10 = lh.t7.y(i10, false);
            Objects.requireNonNull(wiVar);
            zi ziVar = new zi(wiVar, 7);
            Context context = LaunchActivity.D1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.f6 I = lh.t7.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y10.f13149a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject p10 = rh.q2.p(I, false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                bVar = new af.b(y10, ConnectionsManager.getInstance(y10.f13149a).sendRequest(tL_payments_getPaymentForm, new kh.b1(y10, messageObject, tL_inputInvoiceMessage, ziVar, 4)), 9);
            }
            if (bVar != null) {
                wiVar.f165b = bVar;
                wiVar.d();
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
                    TLRPC.TL_message C7 = xn.C7(message);
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
                xn xnVar2 = this.f35381a;
                t12.K2(null, xnVar2, xnVar2.f39968ba);
                PhotoViewer.t1().a2(arrayList, i11, this.f35381a.a(), 0L, 0L, this.f35381a.Da);
            }
        }
    }

    @Override
    public final boolean Y0(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        MessageObject messageObject;
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null) {
            xn xnVar = this.f35381a;
            if (!xnVar.f40034gc && messageObject.getId() == xnVar.f40021fc) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4) {
                if (z10 && System.currentTimeMillis() - xnVar.f40046hc > 1000) {
                    return true;
                }
            } else {
                return z10;
            }
        }
        return false;
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        xn xnVar = this.f35381a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            eg.e2 e2Var = new eg.e2(xnVar, i10, user, null, null, xnVar.f39968ba);
            t1Var.getLocationOnScreen(new int[2]);
            e2Var.f5275s0 = t1Var.getNameStatusX();
            e2Var.f5276t0 = t1Var.getNameStatusY();
            e2Var.f5279w0 = t1Var.getScaleX();
            e2Var.f5277u0 = t1Var.getLeft();
            e2Var.f5278v0 = t1Var.getTop();
            e2Var.f5280x0 = t1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
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
                e2Var.f5274r0 = num;
            } else {
                e2Var.f5274r0 = Integer.valueOf(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20160r8[colorId]));
            }
            org.telegram.ui.Components.j5 j5Var = t1Var.f22007cc;
            if (j5Var != null && (j5Var.f25875f[0] instanceof org.telegram.ui.Components.l5)) {
                e2Var.f5279w0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(xnVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f);
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
                    p9Var.setLayerNum(7);
                    p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    p9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = e2Var.f5274r0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20225v6);
                        }
                        p9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        e2Var.f5282z0 = MessageObject.getInputStickerSet(document);
                    } else {
                        e2Var.f5282z0 = MessageObject.getInputStickerSet(document);
                    }
                    e2Var.f5281y0 = p9Var;
                    e2Var.B0 = true;
                }
            }
            xnVar.showDialog(e2Var);
            return;
        }
        af.g.s(xnVar.getParentActivity(), "https://" + xnVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final ug.a Z() {
        return this.f35381a.Nb;
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.f35381a;
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.Q5), t1Var);
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.t1 r46, org.telegram.tgnet.TLRPC.PollAnswer r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jn.Z1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
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
            xn xnVar = this.f35381a;
            if (xnVar.O3 != 1 && !xnVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void a1(org.telegram.ui.Cells.t1 t1Var) {
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
            xn xnVar = this.f35381a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = xnVar.f40193u0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = xnVar.f40193u0.getChildAt(i11);
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
            xnVar.Jb(messageObject, spannableStringBuilder, 1);
            t1Var.g4(1, false, true);
        }
    }

    @Override
    public final vu0 a2() {
        return this.f35381a.f40190ta;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        xn xnVar = this.f35381a;
        jk jkVar = xnVar.V;
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
                xnVar.V.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new um(this, 6), 200L);
            }
        }
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        xn xnVar = this.f35381a;
        jk jkVar = xnVar.V;
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
                SpannableString spannableString = new SpannableString(vh.v2.k(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.p51("" + user.f19331id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            xnVar.V.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new um(this, 7), 200L);
        }
    }

    @Override
    public final boolean d() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z4;
        xn xnVar = this.f35381a;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (!kVar2.s() && !xnVar.A9()) {
                z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
                if (!z4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        z4 b10;
        int i11;
        ok okVar;
        nk nkVar;
        if (!l()) {
            return false;
        }
        xn xnVar = this.f35381a;
        if (xnVar.e != null && (((okVar = xnVar.L0) == null || okVar.getVisibility() != 0) && ((nkVar = xnVar.O) == null || nkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat != null && ((xnVar.f39948a4 == 0 || xnVar.f40001e4) && (!ChatObject.isChannel(chat) || xnVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        f5[] f5VarArr = new f5[r22 + 2 + r42];
        f5VarArr[0] = f5.d;
        f5VarArr[1] = f5.h;
        char c3 = 2;
        if (r22 != 0) {
            f5VarArr[2] = f5.f34161n;
            c3 = 3;
        }
        if (r42 != 0) {
            f5VarArr[c3] = f5.f34162r;
        }
        TLRPC.UserFull userFull = xnVar.getMessagesController().getUserFull(user.f19331id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            b10 = z4.b(user, i10, f5VarArr);
        } else {
            b10 = z4.c(user, userFull, f5VarArr);
            if (!cb.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
                b10 = z4.b(user, i11, f5VarArr);
            }
        }
        if (cb.m.e(b10)) {
            cb.m.l().v((ViewGroup) xnVar.fragmentView, xnVar.f39968ba, b10, new d7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(xnVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final jn f39770b;

            {
                this.f39770b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f39770b.x(user, false);
                        return;
                    case 1:
                        this.f39770b.c(user);
                        return;
                    default:
                        this.f39770b.f35381a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new s1(this, t1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final jn f39770b;

            {
                this.f39770b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f39770b.x(user, false);
                        return;
                    case 1:
                        this.f39770b.c(user);
                        return;
                    default:
                        this.f39770b.f35381a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final jn f39770b;

            {
                this.f39770b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f39770b.x(user, false);
                        return;
                    case 1:
                        this.f39770b.c(user);
                        return;
                    default:
                        this.f39770b.f35381a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f27490t = false;
        H.f27471i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final boolean d1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.f35381a;
        if (xnVar.f40191tb != 0 && t1Var.getMessageObject() != null && xnVar.f40191tb == t1Var.getMessageObject().getId() && xnVar.f40204ub == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d2(long j10) {
        xn xnVar = this.f35381a;
        TLRPC.Chat chat = xnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return xnVar.getMessagesController().isAdmin(xnVar.e.f19184id, j10);
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jn.e2(org.telegram.ui.Cells.t1, int, float, float, boolean):void");
    }

    public final void f(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z4;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        xn xnVar = this.f35381a;
        xnVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(xnVar.getParentActivity()) && (chat = xnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z12 = true;
            boolean z13 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z4 = false;
                    z13 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == xnVar.getUserConfig().getClientUserId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                    z12 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z13 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == xnVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z12 = false;
                }
                str2 = channelParticipant2.rank;
                z11 = z10;
                boolean z14 = z12;
                boolean z15 = z13;
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                org.telegram.ui.Components.f01.b(parentActivity, i10, -xnVar.e.f19184id, currentUser, str2, z14, z15, z11, f6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z4 = false;
                    z13 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == xnVar.getUserConfig().getClientUserId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                    z12 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(xnVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                xnVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(xnVar.e);
                tL_channels_getParticipant.participant = xnVar.getMessagesController().getInputPeer(currentUser.f19331id);
                xnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new dh.v(12, this, t1Var));
                return;
            } else {
                return;
            }
            z11 = z4;
            str2 = str;
            boolean z142 = z12;
            boolean z152 = z13;
            Activity parentActivity2 = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
            org.telegram.ui.Components.f01.b(parentActivity2, i10, -xnVar.e.f19184id, currentUser, str2, z142, z152, z11, f6Var);
        }
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jn.f2(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (xnVar = this.f35381a).f40191tb) != 0 && i10 == t1Var.getMessageObject().getId() && xnVar.f40204ub == 3) {
            return xnVar.f40231wb;
        }
        return null;
    }

    @Override
    public final void g0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        xn xnVar = this.f35381a;
        try {
            if (i10 == 0) {
                xnVar.h7();
                gl glVar = xnVar.f40223w3;
                if (glVar != null) {
                    glVar.l(0L, 84, null, new um(this, 1));
                    xnVar.f40223w3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(xnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (xnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.d31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.d31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.qc.a0(xnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                xnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(xnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", xnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new um(this, 2));
                } else if (xnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new um(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), a02.f28114c);
                qbVar.c(i13, 36, 36, new String[0]);
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
                qbVar.f28100b.setText(append2);
                qbVar.f28100b.setSingleLine(false);
                qbVar.f28100b.setMaxLines(6);
                a02.b(qbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    public final void h() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        xn xnVar = this.f35381a;
        if (isHuaweiStoreApp) {
            af.g.s(xnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            af.g.s(xnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean h0() {
        if (this.f35381a.O3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = dh.l.a(messageObject);
            boolean a10 = k7.w8.a(a2, 7);
            xn xnVar = this.f35381a;
            if (a10) {
                org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.e_hand_2, 36, dh.l.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                xnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                t1Var.S0(true);
            } else if (xnVar.getParentActivity() != null) {
                if (xnVar.f40073k2 == null) {
                    org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(5, xnVar.getParentActivity(), xnVar.f39968ba, false);
                    xnVar.f40073k2 = k40Var;
                    k40Var.setAlpha(0.0f);
                    xnVar.f40073k2.setVisibility(4);
                    int indexOfChild = xnVar.U0.indexOfChild(xnVar.P);
                    if (indexOfChild == -1) {
                        return;
                    }
                    xnVar.U0.addView(xnVar.f40073k2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f10 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i16);
                            float y10 = ((t1Var.getY() + r1Var.f21599b) - AndroidUtilities.dp(4.0f)) - xnVar.f40141p9;
                            xnVar.f40110n2 = AndroidUtilities.dp(13.3f) + r1Var.f21598a;
                            int C = b.C(6.0f, r1Var.f21599b, i12);
                            xnVar.f40122o2 = C;
                            if (y10 > 0.0f) {
                                i15 = xnVar.f40110n2;
                                i13 = C;
                                f10 = 0.0f;
                                break;
                            }
                            i16++;
                            f10 = y10;
                        } else {
                            i13 = i12;
                            i15 = i11;
                            break;
                        }
                    }
                    if (f10 != 0.0f) {
                        xnVar.f40193u0.v0(0, (int) f10, null);
                        xnVar.f40097m2 = t1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                xnVar.f40073k2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        this.f35381a.I7(t1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void i2(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        xn xnVar = this.f35381a;
        if (AndroidUtilities.isContextSafe(xnVar.getParentActivity()) && (chat = xnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            f(t1Var, xnVar.getMessagesController().getParticipant(xnVar.e.f19184id, currentUser.f19331id));
        }
    }

    @Override
    public final void j() {
        h();
    }

    @Override
    public final boolean j1(MessageObject messageObject) {
        jm jmVar;
        long dialogId = messageObject.getDialogId();
        xn xnVar = this.f35381a;
        if ((dialogId == 1271266957 || ((jmVar = xnVar.f40234x0) != null && jmVar.K)) && xnVar.O3 != 7) {
            return true;
        }
        return false;
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, boolean z4, boolean z10, boolean z11) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        tj tjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        xn xnVar = this.f35381a;
        qj qjVar = xnVar.f40193u0;
        if (qjVar != null && (tjVar = xnVar.f40220w0) != null && tjVar.f5740y < 0) {
            for (int childCount = qjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = xnVar.f40193u0.getChildAt(childCount);
                xnVar.f40193u0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = xnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i11 = xnVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z4 && i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z11) {
                tj tjVar2 = xnVar.f40220w0;
                xnVar.f40193u0.getClass();
                tjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) xnVar.f40141p9), false);
            } else {
                xnVar.f40220w0.h1(i10, i11);
            }
        }
        xnVar.K0 = z10;
        xnVar.rc(primaryMessageObject, false);
        xnVar.K0 = false;
    }

    @Override
    public final int k0(org.telegram.ui.Cells.t1 t1Var) {
        dh.f fVar;
        xn xnVar = this.f35381a;
        if (xnVar.f40192tc.f46893f && (fVar = xnVar.f40270zc) != null && fVar.f4895n == t1Var && fVar.f4891a.getWidth() > 0) {
            return xnVar.f40270zc.f4891a.getHeight();
        }
        return 0;
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, long j10) {
        Bundle g10 = kh.a2.g(j10, "user_id");
        org.telegram.ui.ActionBar.p2 p2Var = this.f35381a;
        if (p2Var.getMessagesController().checkCanOpenChat(g10, p2Var, t1Var.getMessageObject())) {
            p2Var.presentFragment(new xn(g10));
        }
    }

    public final boolean l() {
        xn xnVar = this.f35381a;
        if (!UserObject.isUserSelf(xnVar.f40009f)) {
            TLRPC.Chat chat = xnVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !xnVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void l0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        xn xnVar = this.f35381a;
        if (xnVar.getParentActivity() != null) {
            if (xnVar.U9 == null) {
                hh.k kVar = new hh.k(xnVar.getParentActivity());
                xnVar.U9 = kVar;
                xnVar.U0.addView(kVar, k7.b6.e(-1, -1, 48));
            }
            hh.k kVar2 = xnVar.U9;
            HashMap hashMap = kVar2.f7168a;
            ArrayList arrayList = kVar2.f7170c;
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
                    long j12 = dialog.f19188id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f19188id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f19188id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f19331id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19188id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19188id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f19188id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19188id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19188id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = hh.k.b(t1Var);
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
                hh.j jVar = new hh.j(kVar2, t1Var, arrayList4, new gf.c(12, kVar2, b10));
                jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
                jVar.setCallback(kVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, jVar);
                }
            }
        }
    }

    @Override
    public final void l1() {
        xn xnVar = this.f35381a;
        xnVar.Q7();
        UndoView undoView = xnVar.f40209v3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, xnVar.Q5, null);
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
        long j10;
        long j11;
        int i17;
        boolean z4;
        boolean z10;
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
                P1(t1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            xn xnVar = this.f35381a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(xnVar)) {
                    ad0 ad0Var = new ad0(3);
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                    ad0Var.setResourceProvider(f6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = xnVar.getMessagesController().getPeer(xnVar.a());
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
                    ad0Var.L0 = false;
                    ad0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    xnVar.presentFragment(ad0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                pt.q().w(xnVar.getParentActivity());
                pt.q().v(new hn(this, tL_messageMediaPoll, pollAnswer, t1Var));
                pt q10 = pt.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = t1Var.getMessageObject();
                f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                q10.t(document4, null, "", null, null, i18, false, messageObject2, f6Var, 200);
            } else {
                long j12 = 0;
                if (MessageObject.isMusicDocument(messageMedia.document)) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                        boolean z11 = playingMessageObject.isPlayingExplanationObject;
                        if (i10 == -3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z11 == z10) {
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
                    TLRPC.TL_message C7 = xn.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = dh.i.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    MessageObject messageObject3 = new MessageObject(i17, C7, false, true);
                    if (i10 == -3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    messageObject3.isPlayingExplanationObject = z4;
                    arrayList.add(messageObject3);
                    if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                        MediaController.getInstance().cleanupPlayer(false, true);
                    }
                    MediaController.getInstance().setPlaylist(arrayList, messageObject3, 0L);
                    return;
                }
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !MessageObject.isVideoDocument(document5)) {
                    i15 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    dh.a aVar = new dh.a(i15, messageObject, document6, dh.i.c(messageObject.messageOwner, i10));
                    if (aVar.f4883g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = t1Var.f22273v7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            dh.j jVar = t1Var.Z5;
                            if (jVar != null) {
                                jVar.e();
                            }
                            dh.j jVar2 = t1Var.Y5;
                            if (jVar2 != null) {
                                jVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f4882f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = t1Var.f22273v7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            dh.j jVar3 = t1Var.Z5;
                            if (jVar3 != null) {
                                jVar3.e();
                            }
                            dh.j jVar4 = t1Var.Y5;
                            if (jVar4 != null) {
                                jVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = xn.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = dh.i.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, xnVar, xnVar.f39968ba);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = xnVar.Q5;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = xnVar.I6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = xnVar.b();
                            }
                            t12.c2(messageObject6, xnVar, j10, j11, j12, xnVar.Ca);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, xnVar.getParentActivity(), xnVar.f39968ba, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            xnVar.z6(messageObject6);
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
                    TLRPC.TL_message C73 = xn.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = dh.i.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = xn.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = dh.i.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                mf.d.b(tL_messageMediaPoll.poll, xnVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message C75 = xn.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = dh.i.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, xnVar, xnVar.f39968ba);
                    PhotoViewer.t1().a2(arrayList3, i11, xnVar.a(), 0L, 0L, xnVar.Da);
                }
            }
        }
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            l1();
            return;
        }
        xn xnVar = this.f35381a;
        if (!xnVar.f40050i3 && xnVar.f40193u0 != null && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
            if (xnVar.f40160r2 == null) {
                pm pmVar = xnVar.U0;
                int indexOfChild = pmVar.indexOfChild(xnVar.P);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(1, xnVar.getParentActivity(), xnVar.f39968ba, false);
                    xnVar.f40160r2 = k40Var;
                    pmVar.addView(k40Var, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    xnVar.f40160r2.setAlpha(0.0f);
                    xnVar.f40160r2.setVisibility(4);
                } else {
                    return;
                }
            }
            xnVar.f40160r2.e(t1Var, null, 0, 0, true);
        }
    }

    @Override
    public final boolean n0() {
        boolean z4;
        xn xnVar = this.f35381a;
        if (!xnVar.A9()) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (!z4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o() {
        this.f35381a.U0.getClass();
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        xn xnVar = this.f35381a;
        if (!xnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (xnVar.getParentActivity() != null) {
                if (xnVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    jk jkVar = xnVar.V;
                    MessageObject messageObject = t1Var.getMessageObject();
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    vi viVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    af.f fVar = xnVar.f40245xb;
                    if (fVar != null) {
                        fVar.a(true);
                        xnVar.f40245xb = null;
                    }
                    if (str != null && t1Var.getMessageObject() != null) {
                        vi viVar2 = new vi(xnVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                        xnVar.f40245xb = viVar2;
                        viVar = viVar2;
                    } else {
                        xnVar.f40245xb = null;
                    }
                    jkVar.c0(keyboardButtonProto, messageObject, messageObject2, viVar);
                }
            }
        }
    }

    public final void p(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z4) {
        xn xnVar = this.f35381a;
        TLRPC.Chat chat2 = xnVar.e;
        if (chat2 != null && chat.f19184id == chat2.f19184id) {
            lj ljVar = xnVar.X0;
            if (ljVar != null && i10 == 0) {
                ljVar.e(false, false);
            } else if (t1Var.getMessageObject() != null) {
                xnVar.j(i10, t1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f19184id != chat2.f19184id || xnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19184id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            wi wiVar = null;
            if (z4) {
                af.f fVar = xnVar.f40245xb;
                if (fVar != null) {
                    fVar.a(true);
                    xnVar.f40245xb = null;
                }
                if (t1Var.getMessageObject() == null) {
                    xnVar.f40245xb = null;
                } else {
                    wi wiVar2 = new wi(xnVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    xnVar.f40245xb = wiVar2;
                    wiVar = wiVar2;
                }
            }
            if (xnVar.getMessagesController().checkCanOpenChat(bundle, xnVar, t1Var.getMessageObject(), wiVar)) {
                xn xnVar2 = new xn(bundle);
                if (wiVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new dg.f3(this, wiVar, chat, i10, xnVar2, 13), 5000L);
                    wiVar.d();
                    return;
                }
                xnVar.presentFragment(xnVar2);
            }
        }
    }

    @Override
    public final void p0(String str) {
        xn xnVar = this.f35381a;
        ok okVar = xnVar.L0;
        if (okVar == null || okVar.getVisibility() != 0) {
            nk nkVar = xnVar.O;
            if ((nkVar == null || nkVar.getVisibility() != 0) && xnVar.V != null && str != null && str.length() > 0) {
                jk jkVar = xnVar.V;
                jkVar.setFieldText("@" + str + " ");
                xnVar.V.H0();
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var != null && pageBlock != null) {
            xn xnVar = this.f35381a;
            if (xnVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, xnVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new sm(xnVar, arrayList), null, 0L, 0L, 0L, true, new rm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jn.q(org.telegram.ui.Cells.t1):void");
    }

    @Override
    public final boolean q0(org.telegram.ui.Components.u5 u5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        xn xnVar = this.f35381a;
        if (!xnVar.getMessagesController().premiumFeaturesBlocked() && u5Var != null && !u5Var.standard) {
            long documentId = u5Var.getDocumentId();
            TLRPC.Document document = u5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                document = org.telegram.ui.Components.l5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.mv mvVar = new org.telegram.ui.Components.mv(xnVar, xnVar.getParentActivity(), xnVar.f39968ba, arrayList);
                org.telegram.ui.Components.cv cvVar = mvVar.f27125f;
                cvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(cvVar);
                cvVar.v = imageReceiver;
                if (cvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                cvVar.f24059w = true;
                cvVar.f24060x.d(1.0f, true);
                cvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f, true), 0L, null, null, 0);
                cvVar.v.setLayerNum(7);
                cvVar.v.setAllowStartLottieAnimation(true);
                cvVar.v.setAllowStartAnimation(true);
                cvVar.v.setAutoRepeat(1);
                cvVar.v.setAllowDecodeSingleFrame(true);
                cvVar.v.setParentView(cvVar);
                mvVar.setCalcMandatoryInsets(xnVar.x9());
                xnVar.showDialog(mvVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void q2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f35381a.rc(primaryMessageObject, false);
    }

    public final void r(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19331id);
            org.telegram.ui.ActionBar.p2 p2Var = this.f35381a;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var, t1Var.getMessageObject())) {
                p2Var.presentFragment(new xn(bundle));
            }
        }
    }

    @Override
    public final void r1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var != null && document != null) {
            xn xnVar = this.f35381a;
            if (xnVar.getParentLayout() != null && a0(t1Var)) {
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(xnVar, t1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new s1(this, t1Var, document, 24), false);
                H.f27490t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void s() {
        this.f35381a.Yb();
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        xn xnVar = this.f35381a;
        xnVar.I7(t1Var, false, false, f10, f11, true, false, false);
        xnVar.f40193u0.getClass();
        xn.c2(xnVar, RecyclerView.R(t1Var));
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        tj tjVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            xn xnVar = this.f35381a;
            qj qjVar = xnVar.f40193u0;
            if (qjVar != null && (tjVar = xnVar.f40220w0) != null && tjVar.f5740y < 0) {
                for (int childCount = qjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = xnVar.f40193u0.getChildAt(childCount);
                    xnVar.f40193u0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = xnVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = xnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            xnVar.rc(primaryMessageObject, false);
            ph.f3 f3Var = xnVar.f40235x1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            if (i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
                xnVar.f40220w0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t2() {
        this.f35381a.r9();
    }

    @Override
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j10;
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
            j10 = messageReplies.channel_id;
            i10 = i11;
        } else {
            j10 = 0;
            i10 = -1;
        }
        long j11 = j10;
        xn xnVar = this.f35381a;
        xnVar.aa(xnVar.e.f19184id, messageObject2, messageObject2.getId(), j11, i10, 0, null);
    }

    public final void v(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19184id);
            bundle.putBoolean("expandPhoto", false);
            this.f35381a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void v2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.f35381a.W7(t1Var, reactionCount, z4, f10, f11);
    }

    @Override
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        xn xnVar = this.f35381a;
        if (UserObject.isBotForum(xnVar.f40009f)) {
            return null;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = xnVar.getMessagesController().getAdminRank(xnVar.e.f19184id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = xnVar.Z3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    public final void x(TLRPC.User user, boolean z4) {
        int i10;
        if (user != null && user.f19331id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z4 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19331id);
            bundle.putBoolean("expandPhoto", z4);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            xn xnVar = this.f35381a;
            TLRPC.User user2 = xnVar.f40009f;
            if (user2 != null && user2.f19331id == user.f19331id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            xnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void x1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        hh.j jVar;
        int i10;
        boolean z4;
        boolean z10;
        float f12;
        hh.k kVar = this.f35381a.U9;
        if (kVar != null && (jVar = (hh.j) kVar.f7168a.get(hh.k.b(t1Var))) != null) {
            hh.d[] dVarArr = jVar.f7165w;
            RectF rectF = jVar.f7163r;
            if (jVar.J) {
                float f13 = (f10 - rectF.left) + jVar.R;
                float f14 = (f11 - rectF.top) + jVar.S;
                int i11 = hh.i.f7153a;
                int floor = (int) Math.floor((f13 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(hh.i.f7153a + 11));
                if ((-AndroidUtilities.dp(37)) < f14 && f14 < rectF.height()) {
                    i10 = k7.n.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (jVar.O != i10) {
                    jVar.f7158a.performHapticFeedback(3, 1);
                    jVar.O = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        hh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f7128p != z4) {
                            ValueAnimator valueAnimator = dVar.f7126n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f7128p = z4;
                            float f16 = dVar.f7127o;
                            if (z4) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f7126n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f7126n.addUpdateListener(dVar);
                            dVar.f7126n.setInterpolator(hh.h.f7136a);
                            dVar.f7126n.start();
                        }
                        hh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (dVar2.f7125m != z10) {
                            ValueAnimator valueAnimator2 = dVar2.f7123k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f7125m = z10;
                            float f17 = dVar2.f7124l;
                            if (!z10) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f7123k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f7123k.addUpdateListener(dVar2);
                            dVar2.f7123k.setInterpolator(hh.h.f7136a);
                            dVar2.f7123k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            t1Var.t2();
            t1Var.requestLayout();
            this.f35381a.f40234x0.R(messageObject, false, false);
        }
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f35381a;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        boolean z4 = true;
        if (!kVar.s() && !xnVar.A9()) {
            if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
                R0(10, t1Var);
                return;
            }
            if (!ChatObject.isForum(xnVar.e) && !xnVar.F9()) {
                z4 = false;
            }
            x(user, z4);
            return;
        }
        xn.b2(xnVar, t1Var, true, f10, f11);
    }

    @Override
    public final boolean y2(int i10) {
        boolean z4;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        xn xnVar = this.f35381a;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (z4 && xnVar.G9) {
            e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                ((ActionBarLayout) e5Var2).r();
            }
            return true;
        }
        return !d();
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 r44, float r45, float r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jn.z0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }
}
