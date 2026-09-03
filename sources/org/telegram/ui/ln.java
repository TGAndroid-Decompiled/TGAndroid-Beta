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
public final class ln implements org.telegram.ui.Cells.j1 {
    public final zn f35808a;

    public ln(zn znVar) {
        this.f35808a = znVar;
    }

    public static void a(ln lnVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        zn znVar = lnVar.f35808a;
        if (znVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && znVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                znVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
                tL_message.f19180id = messageObject.getId();
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
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList, new va(lnVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.f35808a;
        if (!znVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(znVar.getParentActivity(), 3, null);
            d2Var.q(200L);
            znVar.getMessagesController().getContentSettings(new b0(this, d2Var, s1Var, 5));
            return;
        }
        if (s1Var.getMessageObject() != null) {
            s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        s1Var.h4();
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 r36, float r37, float r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.A0(org.telegram.ui.Cells.s1, float, float, boolean):void");
    }

    @Override
    public final boolean B0(MessageObject messageObject) {
        return !this.f35808a.f40737s.containsKey(messageObject);
    }

    @Override
    public final void B2() {
        zn znVar = this.f35808a;
        if (znVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", znVar.Q5);
            bundle.putInt("start_from", 10);
            znVar.presentFragment(new org.telegram.ui.Components.ea0(bundle, znVar.X0.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", znVar.getMessagesController().recommendedChannelsLimitPremium), new wm(this, 4))).j();
    }

    @Override
    public final void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        zn znVar = this.f35808a;
        ph.f3 f3Var = znVar.f40801x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (znVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            ph.f3 f3Var2 = new ph.f3(znVar.getParentActivity(), 3);
            f3Var2.p(true);
            f3Var2.H = Layout.Alignment.ALIGN_NORMAL;
            f3Var2.d = -1L;
            f3Var2.Q = true;
            f3Var2.e = true;
            f3Var2.q(12.0f);
            znVar.f40801x1 = f3Var2;
            f3Var2.f41662i0 = new hc(23, this, f3Var2);
            f3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            znVar.U0.addView(znVar.f40801x1, k7.b6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            znVar.U0.post(new j3.b0(this, s1Var, i11, i10, 4));
        }
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
        dh.f fVar = this.f35808a.f40836zc;
        if (fVar != null && fVar.f4901n == s1Var) {
            fVar.f4904w.getClass();
        }
    }

    @Override
    public final org.telegram.ui.Cells.m9 D2() {
        return this.f35808a.Z8;
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
            int i13 = buttonCustom.f16635id;
            TL_stars.StarsAmount starsAmount = null;
            zn znVar = this.f35808a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                kh.a1 a1Var = new kh.a1(25, this, message);
                Pattern pattern = org.telegram.ui.Components.z4.f31242a;
                Activity parentActivity = znVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
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
                znVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, znVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, znVar.e, 5);
                    }
                    cg.u0 u0Var = new cg.u0(this, message, canManageMonoForum, messageObject, 7);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    znVar.g7(u0Var, lf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                znVar.I7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                znVar.O1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void E0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.y5 animation;
        zn znVar = this.f35808a;
        if (!znVar.f40616i3 && !SharedConfig.noSoundHintShowed && znVar.f40759u0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
            org.telegram.ui.Components.l40 l40Var = znVar.f40713q2;
            if (l40Var == null || l40Var.getTag() == null) {
                if (znVar.f40713q2 == null) {
                    rm rmVar = znVar.U0;
                    int indexOfChild = rmVar.indexOfChild(znVar.P);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.l40 l40Var2 = new org.telegram.ui.Components.l40(0, znVar.getParentActivity(), znVar.f40534ba, false);
                        znVar.f40713q2 = l40Var2;
                        l40Var2.setShowingDuration(10000L);
                        rmVar.addView(znVar.f40713q2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        znVar.f40713q2.setAlpha(0.0f);
                        znVar.f40713q2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = znVar.f40759u0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = znVar.f40759u0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && znVar.f40713q2.e(s1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.f35808a;
        znVar.f40769ua.l(s1Var, znVar, true);
        znVar.f40759u0.I0(false);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        zn znVar = this.f35808a;
        if (znVar.getParentActivity() != null && tLObject != null) {
            e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                if (((ActionBarLayout) e5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z10 = tLObject instanceof TLRPC.Chat;
            if (z10) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19159id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f19306id);
            } else {
                return;
            }
            if (z4 && z10) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, znVar.getParentActivity(), znVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(znVar.getParentActivity(), false, false);
                g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                g1Var.setMinimumWidth(160);
                g1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(znVar.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new c0(this, (TLRPC.Chat) tLObject, s1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                zn znVar2 = new zn(bundle);
                znVar2.G9 = true;
                znVar.presentFragmentAsPreviewWithMenu(znVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                znVar.d7();
                return;
            }
            znVar.presentFragment(new zn(bundle));
        }
    }

    @Override
    public final boolean F1() {
        zn znVar = this.f35808a;
        if (znVar.U0.getMeasuredWidth() > znVar.U0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        boolean z4;
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        zn znVar = this.f35808a;
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(znVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = znVar.getMessagesController().conferenceCallSizeLimit;
                d2Var.setOnCancelListener(new lh.w(this, znVar.getConnectionsManager().sendRequest(getgroupcall, new gg.e0(this, d2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 6)), 2));
                d2Var.q(600L);
                return;
            }
            TLRPC.User user = znVar.f40575f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = znVar.X7;
                if (userFull != null && userFull.video_calls_available) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Components.voip.f2.m(user, isVideoCall, z4, znVar.getParentActivity(), znVar.getMessagesController().getUserFull(znVar.f40575f.f19306id), znVar.getAccountInstance());
                return;
            }
            return;
        }
        znVar.I7(s1Var, true, false, f10, f11, messageObject.isMusic(), false, false);
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 s1Var) {
        zn.U4(this.f35808a, s1Var);
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            b.m(R.string.CodeCopied, org.telegram.ui.Components.qc.a0(this.f35808a));
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var) {
        k(s1Var, true, false, true);
    }

    @Override
    public final void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        k(s1Var, z4, false, false);
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            zn znVar = this.f35808a;
            if ((znVar.f40757tb != id2 || znVar.f40770ub != 7) && (inputPeer = znVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f19377id = id2;
                ze.c cVar = znVar.f40811xb;
                if (cVar != null) {
                    cVar.a(true);
                    znVar.f40811xb = null;
                }
                yi yiVar = new yi(znVar, id2, s1Var, 2);
                yiVar.f47468b = new hc(11, znVar, r3);
                znVar.f40811xb = yiVar;
                yiVar.d();
                int[] iArr = {znVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new hg(znVar, yiVar, iArr, s1Var, messageObject))};
            }
        }
    }

    @Override
    public final boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
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
        b5 b5Var;
        int i17;
        int i18;
        h5 h5Var;
        qk qkVar;
        pk pkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        zn znVar = this.f35808a;
        if (!isEmpty && znVar.e != null && (((qkVar = znVar.L0) == null || qkVar.getVisibility() != 0) && ((pkVar = znVar.O) == null || pkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = znVar.e;
        if (chat2 != null && ((znVar.f40514a4 == 0 || znVar.f40567e4) && (!ChatObject.isChannel(chat2) || znVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = znVar.e;
        if (chat3 != null && chat3.f19159id == chat.f19159id && !znVar.F9()) {
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
                h5Var = h5.f34573f;
            }
            h5VarArr[1] = h5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            h5VarArr[i13] = h5.f34574n;
            i13++;
        }
        if (i11 != 0) {
            h5VarArr[i13] = h5.f34575r;
        }
        TLRPC.ChatFull chatFull = znVar.getMessagesController().getChatFull(chat.f19159id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
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
            b5Var = new b5(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, h5VarArr, new d5(i14, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            b5Var = b5.a(chat, chatFull, h5VarArr);
            z10 = i10;
            i16 = i11;
            i15 = i12;
            z4 = true;
        }
        if (cb.m.e(b5Var)) {
            cb.m.l().v((ViewGroup) znVar.fragmentView, znVar.f40534ba, b5Var, new f7(this, chat, s1Var, 7));
            return z4;
        }
        org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(znVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new zm(this, chat, 0), false);
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
        H.l(i17, LocaleController.getString(i18), new u1(this, s1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new zm(this, chat, 1), z10);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new zm(this, chat, 2), i16);
        H.f27778t = false;
        H.f27759i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void L(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f35808a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zn znVar = this.f35808a;
        if (!znVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (znVar.getParentActivity() != null) {
                if (znVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(znVar.getParentActivity(), znVar.f40534ba, false, false);
                        g3Var.fixNavigationBar();
                        g3Var.title = str;
                        g3Var.bigTitle = false;
                        g3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        cg.u1 u1Var = new cg.u1(3, znVar, str);
                        g3Var.items = charSequenceArr;
                        g3Var.onClickListener = u1Var;
                        znVar.showDialog(g3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        znVar.Z9(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
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
    public final void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
        TLRPC.Message message;
        if (s1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f35808a;
            p2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, p2Var, true);
            return;
        }
        fVar.run();
    }

    @Override
    public final boolean M1() {
        zn znVar = this.f35808a;
        if (znVar.U0.getKeyboardHeight() + znVar.f40659la >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z4 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        zn znVar = this.f35808a;
        if (z4) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (znVar.Q5 != j10) {
                znVar.presentFragment(zn.R9(j10));
            } else {
                znVar.X0.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            znVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        zn znVar = this.f35808a;
        znVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        znVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(s1Var, true, false, true);
    }

    @Override
    public final void O(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f35808a.fb(messageObject, true);
        }
    }

    @Override
    public final void O1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        zn znVar = this.f35808a;
        znVar.f40515a5 = messageObject;
        znVar.d9();
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        zn znVar = this.f35808a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!s1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(znVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!znVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new wm(this, 9))).k(true);
            return false;
        } else {
            znVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(znVar.e, znVar.W7, true), s1Var.getMessageObject(), todoItem, z4, null);
            return true;
        }
    }

    @Override
    public final boolean Q() {
        zn znVar = this.f35808a;
        if (znVar.T5[1].size() + znVar.T5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void Q1(MessageObject messageObject) {
        this.f35808a.f40737s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var != null) {
            zn znVar = this.f35808a;
            if (znVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
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
    public final boolean R0(long j10) {
        zn znVar = this.f35808a;
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return znVar.getMessagesController().isOwner(znVar.e.f19159id, j10);
        }
        return false;
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        Uri parse;
        boolean z10;
        hn hnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z4 && ze.d.h(str, false, false)) {
            z10 = true;
        } else {
            z10 = z4;
        }
        zn znVar = this.f35808a;
        ze.c cVar = znVar.f40811xb;
        if (cVar != null) {
            cVar.a(true);
        }
        if (s1Var.getMessageObject() == null) {
            hnVar = null;
        } else {
            hnVar = new hn(this, s1Var);
        }
        znVar.f40811xb = hnVar;
        if (!z10 && !ze.d.f(parse, false, null)) {
            org.telegram.ui.Components.z4.r0(znVar, str, true, true, true, !z10, znVar.f40811xb, webPage, znVar.f40534ba);
        } else {
            ze.d.r(znVar.getParentActivity(), parse, true, true, false, znVar.f40811xb, null, false, true, false);
        }
    }

    @Override
    public final boolean S() {
        zn znVar = this.f35808a;
        if (!UserObject.isReplyUser(znVar.f40575f) && !UserObject.isUserSelf(znVar.f40575f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void S0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        ArrayList<MessageObject> arrayList;
        i5.v vVar;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        zn znVar = this.f35808a;
        hh.k kVar = znVar.U9;
        if (kVar != null) {
            HashMap hashMap = kVar.f7151a;
            hh.j jVar = (hh.j) hashMap.get(hh.k.b(s1Var));
            org.telegram.ui.Components.ic icVar = null;
            if (jVar != null) {
                messageObject = jVar.B;
            } else {
                messageObject = null;
            }
            hh.j jVar2 = (hh.j) znVar.U9.f7151a.get(hh.k.b(s1Var));
            if (jVar2 != null && (i11 = jVar2.O) != -1) {
                j10 = jVar2.f7148w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                boolean z4 = false;
                if (!org.telegram.ui.Components.z4.h(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) znVar.f40765u6.f(messageObject.getGroupId())) != null) {
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
                    icVar = org.telegram.ui.Components.qc.v(znVar.getParentActivity(), znVar, null, 1, j11, 1, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, vVar);
                    icVar.f25672k = true;
                    icVar.k(icVar.e instanceof org.telegram.ui.Components.tb);
                }
            }
            hh.j jVar3 = (hh.j) hashMap.get(hh.k.b(s1Var));
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
                qbVar.f28136a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = jVar3.T.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new hh.f(0, jVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (znVar = this.f35808a).f40757tb) != 0 && i10 == s1Var.getMessageObject().getId() && znVar.f40770ub == 1) {
            return znVar.f40783vb;
        }
        return null;
    }

    @Override
    public final void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        zn znVar = this.f35808a;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (!kVar.s() && !znVar.A9()) {
            if (!z4 && chat.signature_profiles && (messageObject = s1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                znVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                p(s1Var, chat, i10, z4);
                return;
            }
        }
        zn.b2(znVar, s1Var, true, f10, f11);
    }

    @Override
    public final void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            zn znVar = this.f35808a;
            org.telegram.ui.Components.ou.I(znVar, messageObject, znVar.Ca, str2, str3, str4, str, i10, i11, -1, znVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void U(org.telegram.ui.Cells.s1 s1Var) {
        k(s1Var, true, true, false);
    }

    @Override
    public final void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
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
        MessageObject messageObject = s1Var.getMessageObject();
        boolean z10 = false;
        en enVar = null;
        en enVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        en enVar3 = null;
        en enVar4 = null;
        zn znVar = this.f35808a;
        if (i10 == 19) {
            ze.c cVar = znVar.f40811xb;
            if (cVar != null) {
                cVar.a(true);
            }
            if (s1Var.getMessageObject() != null) {
                enVar2 = new en(this, s1Var, 2);
            }
            final en enVar5 = enVar2;
            znVar.f40811xb = enVar5;
            final Activity parentActivity = znVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = znVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            enVar5.d();
            enVar5.f47468b = new gg.k(atomicBoolean, 0);
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
            gg.p0.d(messageObject, new Utilities.Callback(atomicBoolean, enVar5, z4, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f6684a;
                public final ze.c f6685b;
                public final boolean f6686c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f6687f;
                public final f6 f6688g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f6687f = parentActivity;
                    this.f6688g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f6684a.get()) {
                        this.f6685b.b();
                        boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z12 = this.f6686c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f6687f;
                        f6 f6Var = this.f6688g;
                        if (z11) {
                            r.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            r.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        }
                    }
                }
            }, new gg.m(atomicBoolean, enVar5, 0));
        } else if (i10 == 21) {
            h();
        } else if (i10 == 84) {
            znVar.ua(s1Var);
        } else if (i10 == 80) {
            hh.g gVar = org.telegram.ui.Components.wg0.L;
            if (znVar.getParentActivity() != null) {
                znVar.showDialog(new org.telegram.ui.Components.wg0(znVar.getContext(), znVar.getCurrentAccount(), messageObject, znVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                    znVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
                bundle.putLong("user_id", user.f19306id);
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
                znVar.showDialog(new org.telegram.ui.Components.te0(znVar, null, user, null, file, se.b.d(str, false), str3, str4, znVar.f40534ba));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            znVar.presentFragment(new zn(kf.k0.g(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
                bundle2.putLong("user_id", user2.f19306id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                znVar.presentFragment(new ps(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                znVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    ze.c cVar2 = znVar.f40811xb;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        enVar3 = new en(this, s1Var, 4);
                    }
                    znVar.f40811xb = enVar3;
                    ze.d.r(znVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, znVar.f40811xb, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            znVar.getOrCreateStoryViewer().G(znVar.getParentActivity(), tL_webPageAttributeStory.storyItem, nh.c7.a(znVar.f40759u0));
                            return;
                        }
                    }
                }
                if (!znVar.ea(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
                    ze.c cVar3 = znVar.f40811xb;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        enVar4 = new en(this, s1Var, 5);
                    }
                    znVar.f40811xb = enVar4;
                    ze.d.r(znVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, znVar.f40811xb, null, false, true, false);
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
                ze.c cVar4 = znVar.f40811xb;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (s1Var.getMessageObject() != null) {
                    enVar = new en(this, s1Var, 3);
                }
                znVar.f40811xb = enVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        znVar.f40811xb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        znVar.f40811xb.f47468b = new ah.b(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new org.telegram.messenger.zd(3, this, z10)), 23);
                        return;
                    }
                }
                ze.d.r(znVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, znVar.f40811xb, null, false, true, false);
            }
        }
    }

    @Override
    public final boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        te teVar;
        i5.v vVar;
        boolean z4;
        org.telegram.ui.ActionBar.f6 f6Var;
        ah.e eVar;
        int i10;
        boolean z10;
        int i11;
        u41 u41Var;
        int i12;
        float f10;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f35808a.f40800x0.L();
                    zn znVar = this.f35808a;
                    return mediaController.setPlaylist(L, messageObject, znVar.I6, true ^ znVar.f40800x0.K, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f35808a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            w41 w41Var = this.f35808a.W9;
            if (w41Var == null || w41Var.Y) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.qc.a0(this.f35808a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f35808a.W9 = new w41(this.f35808a.getParentActivity());
                w41 w41Var2 = this.f35808a.W9;
                if (!messageObject.isOutOwner()) {
                    teVar = this.f35808a.fb(messageObject, true);
                } else {
                    teVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    vVar = zn.O4(this.f35808a, messageObject);
                } else {
                    vVar = null;
                }
                Context context = w41Var2.f39263a;
                ah.e eVar2 = w41Var2.f39267c;
                w41Var2.U = teVar;
                w41Var2.V = vVar;
                u41 u41Var2 = w41Var2.K;
                if (u41Var2 != null) {
                    eVar2.removeView(u41Var2);
                    w41Var2.K = null;
                }
                w41Var2.L = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                w41Var2.J = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                w41Var2.P = z4;
                org.telegram.ui.Cells.s1 s1Var2 = w41Var2.L;
                if (s1Var2 != null) {
                    f6Var = s1Var2.getResourcesProvider();
                } else {
                    f6Var = null;
                }
                w41Var2.I = f6Var;
                if (w41Var2.L != null) {
                    w41Var2.Q = 0.0f;
                    w41Var2.R = s1Var.f22090n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        w41Var2.Q = view.getY() + w41Var2.Q;
                        w41Var2.R = view.getY() + w41Var2.R;
                    }
                    int width = w41Var2.L.getWidth();
                    int height = w41Var2.L.getHeight();
                    if (w41Var2.P) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    w41Var2.H = i14 - w41Var2.L.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    eVar = eVar2;
                    u41 u41Var3 = new u41(w41Var2, w41Var2.getContext(), UserConfig.selectedAccount, w41Var2.L.getResourcesProvider(), width, i14);
                    w41Var2.K = u41Var3;
                    w41Var2.L.j1(u41Var3);
                    w41Var2.K.i1(w41Var2.L);
                    w41Var2.K.setDelegate(new z9.d(17));
                    u41 u41Var4 = w41Var2.K;
                    MessageObject messageObject3 = w41Var2.J;
                    MessageObject.GroupedMessages currentMessagesGroup = w41Var2.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = w41Var2.L;
                    u41Var4.X3(messageObject3, currentMessagesGroup, s1Var3.C, s1Var3.B, false, false);
                    if (!w41Var2.P) {
                        org.telegram.ui.Components.d8 d8Var = new org.telegram.ui.Components.d8();
                        w41Var2.S = d8Var;
                        u41 u41Var5 = w41Var2.K;
                        d8Var.f24217i = u41Var5;
                        u41Var5.f21932be = d8Var;
                        if (u41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.lo0 seekBarWaveform = w41Var2.K.getSeekBarWaveform();
                            seekBarWaveform.L = w41Var2.f39271s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.f26820n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    w41Var2.E = false;
                    eVar.addView(w41Var2.K, new FrameLayout.LayoutParams(w41Var2.L.getWidth(), i14, 17));
                } else {
                    eVar = eVar2;
                    i10 = 360;
                }
                TextureView textureView = w41Var2.M;
                if (textureView != null) {
                    eVar.removeView(textureView);
                    w41Var2.M = null;
                }
                if (w41Var2.P) {
                    w41Var2.N = false;
                    TextureView textureView2 = new TextureView(context);
                    w41Var2.M = textureView2;
                    eVar.addView(textureView2, 0, k7.b6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.i71 i71Var = w41Var2.f39272w;
                if (i71Var != null) {
                    i71Var.B();
                    w41Var2.f39272w.H();
                    w41Var2.f39272w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = w41Var2.L;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(w41Var2.L.getMessageObject().currentAccount).getPathToAttach(w41Var2.L.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(w41Var2.L.getMessageObject().currentAccount).getPathToMessage(w41Var2.L.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && w41Var2.L.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(w41Var2.L.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.i71 i71Var2 = new org.telegram.ui.Components.i71();
                        w41Var2.f39272w = i71Var2;
                        i71Var2.G = new v41(w41Var2);
                        if (w41Var2.S != null) {
                            i71Var2.H = new v41(w41Var2);
                        }
                        if (w41Var2.P) {
                            i71Var2.V(w41Var2.M);
                        }
                        w41Var2.f39272w.D(Uri.fromFile(pathToAttach), "other");
                        w41Var2.f39272w.C();
                        org.telegram.ui.Components.et etVar = w41Var2.B;
                        if (etVar != null) {
                            etVar.f24688s = w41Var2.f39272w;
                            etVar.a();
                        }
                    }
                    zn znVar2 = this.f35808a;
                    znVar2.showDialog(znVar2.W9);
                    return false;
                }
                ph.f3 f3Var = w41Var2.f39273x;
                if (f3Var != null) {
                    eVar.removeView(f3Var);
                    w41Var2.f39273x = null;
                }
                MessageObject messageObject4 = w41Var2.J;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                MessageObject messageObject5 = w41Var2.J;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(w41Var2.J.currentAccount).getClientUserId()) {
                    ph.f3 f3Var2 = new ph.f3(context, 3);
                    w41Var2.f39273x = f3Var2;
                    f3Var2.p(true);
                    if (z10) {
                        long dialogId = w41Var2.J.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(w41Var2.J.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(w41Var2.J.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        ph.f3 f3Var3 = w41Var2.f39273x;
                        if (w41Var2.P) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        f3Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        ph.f3 f3Var4 = w41Var2.f39273x;
                        if (w41Var2.P) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        f3Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    w41Var2.f39273x.q(12.0f);
                    ph.f3 f3Var5 = w41Var2.f39273x;
                    if (!z10 && !w41Var2.L.C) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    f3Var5.setPadding(AndroidUtilities.dp(f10), 0, 0, 0);
                    if (w41Var2.P) {
                        w41Var2.f39273x.m(0.5f, 0.0f);
                        w41Var2.f39273x.H = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        w41Var2.f39273x.m(0.0f, AndroidUtilities.dp(34.0f));
                        w41Var2.f39273x.H = Layout.Alignment.ALIGN_NORMAL;
                    }
                    w41Var2.f39273x.t(14.0f);
                    ph.f3 f3Var6 = w41Var2.f39273x;
                    f3Var6.h = ph.f3.a(f3Var6.getText(), w41Var2.f39273x.getTextPaint());
                    if (w41Var2.P) {
                        eVar.addView(w41Var2.f39273x, k7.b6.d((int) ((w41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((w41Var2.L.getHeight() + w41Var2.H) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        eVar.addView(w41Var2.f39273x, k7.b6.d((int) ((w41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((w41Var2.L.getWidth() * (-0.39999998f)) / 2.0f) + w41Var2.L.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((w41Var2.L.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    w41Var2.f39273x.u();
                }
                TextView textView = w41Var2.f39274y;
                if (textView != null) {
                    eVar.removeView(textView);
                    w41Var2.f39274y = null;
                }
                TextView textView2 = new TextView(context);
                w41Var2.f39274y = textView2;
                textView2.setTextColor(-1);
                w41Var2.f39274y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    w41Var2.f39274y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    w41Var2.f39274y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                w41Var2.f39274y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                k7.d6.a(w41Var2.f39274y);
                TextView textView3 = w41Var2.f39274y;
                if (z10) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                w41Var2.f39274y.setOnClickListener(new s41(w41Var2, 1));
                eVar.addView(w41Var2.f39274y, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (u41Var = w41Var2.K) != null && u41Var.getMessageObject() != null && w41Var2.K.getMessageObject().messageOwner != null) {
                    w41Var2.K.getMessageObject().messageOwner.media_unread = false;
                    w41Var2.K.invalidate();
                }
                zn znVar22 = this.f35808a;
                znVar22.showDialog(znVar22.W9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void V1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        zn znVar = this.f35808a;
        if (znVar.U0 != null && znVar.getParentActivity() != null) {
            Context context = znVar.U0.getContext();
            f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
            w31.T(context, znVar, false, f6Var, null);
        }
    }

    @Override
    public final int W() {
        return this.f35808a.O3;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        zn znVar = this.f35808a;
        znVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, znVar);
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        yi yiVar;
        int i10;
        MessageObject messageObject = s1Var.getMessageObject();
        ah.b bVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            zn znVar = this.f35808a;
            ze.c cVar = znVar.f40811xb;
            if (cVar != null) {
                cVar.a(true);
                znVar.f40811xb = null;
            }
            if (s1Var.getMessageObject() == null) {
                znVar.f40811xb = null;
                yiVar = null;
            } else {
                yiVar = new yi(znVar, s1Var.getMessageObject().getId(), s1Var, 1);
                znVar.f40811xb = yiVar;
            }
            i10 = ((org.telegram.ui.ActionBar.p2) this.f35808a).currentAccount;
            lh.t7 y10 = lh.t7.y(i10, false);
            Objects.requireNonNull(yiVar);
            bj bjVar = new bj(yiVar, 7);
            Context context = LaunchActivity.D1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.f6 I = lh.t7.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y10.f13133a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject p10 = rh.p2.p(I, false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                bVar = new ah.b(y10, ConnectionsManager.getInstance(y10.f13133a).sendRequest(tL_payments_getPaymentForm, new kh.b1(y10, messageObject, tL_inputInvoiceMessage, bjVar, 4)), 8);
            }
            if (bVar != null) {
                yiVar.f47468b = bVar;
                yiVar.d();
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
                zn znVar2 = this.f35808a;
                t12.K2(null, znVar2, znVar2.f40534ba);
                PhotoViewer.t1().a2(arrayList, i11, this.f35808a.a(), 0L, 0L, this.f35808a.Da);
            }
        }
    }

    @Override
    public final ug.a Z() {
        return this.f35808a.Nb;
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        zn znVar = this.f35808a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            eg.e2 e2Var = new eg.e2(znVar, i10, user, null, null, znVar.f40534ba);
            s1Var.getLocationOnScreen(new int[2]);
            e2Var.f5264s0 = s1Var.getNameStatusX();
            e2Var.f5265t0 = s1Var.getNameStatusY();
            e2Var.f5268w0 = s1Var.getScaleX();
            e2Var.f5266u0 = s1Var.getLeft();
            e2Var.f5267v0 = s1Var.getTop();
            e2Var.f5269x0 = s1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
                e2Var.f5263r0 = num;
            } else {
                e2Var.f5263r0 = Integer.valueOf(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20134r8[colorId]));
            }
            org.telegram.ui.Components.j5 j5Var = s1Var.f21944cc;
            if (j5Var != null && (j5Var.f25836f[0] instanceof org.telegram.ui.Components.l5)) {
                e2Var.f5268w0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(znVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f);
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
                        Integer num2 = e2Var.f5263r0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20200v6);
                        }
                        p9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        e2Var.f5271z0 = MessageObject.getInputStickerSet(document);
                    } else {
                        e2Var.f5271z0 = MessageObject.getInputStickerSet(document);
                    }
                    e2Var.f5270y0 = p9Var;
                    e2Var.B0 = true;
                }
            }
            znVar.showDialog(e2Var);
            return;
        }
        ze.d.s(znVar.getParentActivity(), "https://" + znVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        if (s1Var == null) {
            messageObject = null;
        } else {
            messageObject = s1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            zn znVar = this.f35808a;
            if (znVar.O3 != 1 && !znVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.s1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.a2(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.f35808a;
        lk lkVar = znVar.V;
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
                znVar.V.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new wm(this, 6), 200L);
            }
        }
    }

    @Override
    public final void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        this.f35808a.U7(characterStyle, z4, s1Var.getMessageObject(), s1Var);
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.f35808a;
        lk lkVar = znVar.V;
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
                SpannableString spannableString = new SpannableString(vh.w2.k(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.p51("" + user.f19306id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            znVar.V.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new wm(this, 7), 200L);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        b5 b10;
        int i11;
        qk qkVar;
        pk pkVar;
        if (!l()) {
            return false;
        }
        zn znVar = this.f35808a;
        if (znVar.e != null && (((qkVar = znVar.L0) == null || qkVar.getVisibility() != 0) && ((pkVar = znVar.O) == null || pkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && ((znVar.f40514a4 == 0 || znVar.f40567e4) && (!ChatObject.isChannel(chat) || znVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        h5[] h5VarArr = new h5[r22 + 2 + r42];
        h5VarArr[0] = h5.d;
        h5VarArr[1] = h5.h;
        char c3 = 2;
        if (r22 != 0) {
            h5VarArr[2] = h5.f34574n;
            c3 = 3;
        }
        if (r42 != 0) {
            h5VarArr[c3] = h5.f34575r;
        }
        TLRPC.UserFull userFull = znVar.getMessagesController().getUserFull(user.f19306id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            b10 = b5.b(user, i10, h5VarArr);
        } else {
            b10 = b5.c(user, userFull, h5VarArr);
            if (!cb.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
                b10 = b5.b(user, i11, h5VarArr);
            }
        }
        if (cb.m.e(b10)) {
            cb.m.l().v((ViewGroup) znVar.fragmentView, znVar.f40534ba, b10, new f7(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(znVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final ln f40307b;

            {
                this.f40307b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40307b.x(user, false);
                        return;
                    case 1:
                        this.f40307b.c(user);
                        return;
                    default:
                        this.f40307b.f35808a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new u1(this, s1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final ln f40307b;

            {
                this.f40307b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40307b.x(user, false);
                        return;
                    case 1:
                        this.f40307b.c(user);
                        return;
                    default:
                        this.f40307b.f35808a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final ln f40307b;

            {
                this.f40307b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f40307b.x(user, false);
                        return;
                    case 1:
                        this.f40307b.c(user);
                        return;
                    default:
                        this.f40307b.f35808a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f27778t = false;
        H.f27759i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        MessageObject messageObject;
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = s1Var.getMessageObject();
        }
        if (messageObject != null) {
            zn znVar = this.f35808a;
            if (!znVar.f40600gc && messageObject.getId() == znVar.f40587fc) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4) {
                if (z10 && System.currentTimeMillis() - znVar.f40612hc > 1000) {
                    return true;
                }
            } else {
                return z10;
            }
        }
        return false;
    }

    @Override
    public final cv0 c2() {
        return this.f35808a.f40756ta;
    }

    public final void d(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z4;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        zn znVar = this.f35808a;
        znVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(znVar.getParentActivity()) && (chat = znVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z12 = true;
            boolean z13 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z4 = false;
                    z13 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == znVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == znVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                org.telegram.ui.Components.f01.b(parentActivity, i10, -znVar.e.f19159id, currentUser, str2, z14, z15, z11, f6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z4 = false;
                    z13 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == znVar.getUserConfig().getClientUserId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                    z12 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(znVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                znVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(znVar.e);
                tL_channels_getParticipant.participant = znVar.getMessagesController().getInputPeer(currentUser.f19306id);
                znVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new dh.v(12, this, s1Var));
                return;
            } else {
                return;
            }
            z11 = z4;
            str2 = str;
            boolean z142 = z12;
            boolean z152 = z13;
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
            org.telegram.ui.Components.f01.b(parentActivity2, i10, -znVar.e.f19159id, currentUser, str2, z142, z152, z11, f6Var);
        }
    }

    @Override
    public final void d1(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.f35808a;
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.Q5), s1Var);
    }

    @Override
    public final boolean e() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z4;
        zn znVar = this.f35808a;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if (!kVar2.s() && !znVar.A9()) {
                z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
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
    public final void e1(org.telegram.ui.Cells.s1 s1Var) {
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
            zn znVar = this.f35808a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = znVar.f40759u0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = znVar.f40759u0.getChildAt(i11);
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
            znVar.Jb(messageObject, spannableStringBuilder, 1);
            s1Var.g4(1, false, true);
        }
    }

    @Override
    public final boolean e2(long j10) {
        zn znVar = this.f35808a;
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return znVar.getMessagesController().isAdmin(znVar.e.f19159id, j10);
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        zn znVar = this.f35808a;
        try {
            if (i10 == 0) {
                znVar.h7();
                il ilVar = znVar.f40789w3;
                if (ilVar != null) {
                    ilVar.l(0L, 84, null, new wm(this, 1));
                    znVar.f40789w3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (znVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.d31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.d31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.qc.a0(znVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                znVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar);
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
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), a02.f28142c);
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
                qbVar.f28137b.setText(append2);
                qbVar.f28137b.setSingleLine(false);
                qbVar.f28137b.setMaxLines(6);
                a02.b(qbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void f2(org.telegram.ui.Cells.s1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.f2(org.telegram.ui.Cells.s1, int, float, float, boolean):void");
    }

    @Override
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (znVar = this.f35808a).f40757tb) != 0 && i10 == s1Var.getMessageObject().getId() && znVar.f40770ub == 3) {
            return znVar.f40797wb;
        }
        return null;
    }

    @Override
    public final boolean g0() {
        if (this.f35808a.O3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean g2(org.telegram.ui.Cells.s1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.g2(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
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
        zn znVar = this.f35808a;
        if (isHuaweiStoreApp) {
            ze.d.s(znVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ze.d.s(znVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.f35808a;
        if (znVar.f40757tb != 0 && s1Var.getMessageObject() != null && znVar.f40757tb == s1Var.getMessageObject().getId() && znVar.f40770ub == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = dh.l.a(messageObject);
            boolean a10 = k7.w8.a(a2, 7);
            zn znVar = this.f35808a;
            if (a10) {
                org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.e_hand_2, 36, dh.l.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                znVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                s1Var.S0(true);
            } else if (znVar.getParentActivity() != null) {
                if (znVar.f40639k2 == null) {
                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(5, znVar.getParentActivity(), znVar.f40534ba, false);
                    znVar.f40639k2 = l40Var;
                    l40Var.setAlpha(0.0f);
                    znVar.f40639k2.setVisibility(4);
                    int indexOfChild = znVar.U0.indexOfChild(znVar.P);
                    if (indexOfChild == -1) {
                        return;
                    }
                    znVar.U0.addView(znVar.f40639k2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f10 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                            float y10 = ((s1Var.getY() + q1Var.f21532b) - AndroidUtilities.dp(4.0f)) - znVar.f40707p9;
                            znVar.f40676n2 = AndroidUtilities.dp(13.3f) + q1Var.f21531a;
                            int C = b.C(6.0f, q1Var.f21532b, i12);
                            znVar.f40688o2 = C;
                            if (y10 > 0.0f) {
                                i15 = znVar.f40676n2;
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
                        znVar.f40759u0.v0(0, (int) f10, null);
                        znVar.f40663m2 = s1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                znVar.f40639k2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        this.f35808a.I7(s1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void j() {
        h();
    }

    @Override
    public final void j2(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        zn znVar = this.f35808a;
        if (AndroidUtilities.isContextSafe(znVar.getParentActivity()) && (chat = znVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(s1Var, znVar.getMessagesController().getParticipant(znVar.e.f19159id, currentUser.f19306id));
        }
    }

    public final void k(org.telegram.ui.Cells.s1 s1Var, boolean z4, boolean z10, boolean z11) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        vj vjVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        zn znVar = this.f35808a;
        sj sjVar = znVar.f40759u0;
        if (sjVar != null && (vjVar = znVar.f40786w0) != null && vjVar.f5729y < 0) {
            for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = znVar.f40759u0.getChildAt(childCount);
                znVar.f40759u0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i11 = znVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z4 && i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
            if (z11) {
                vj vjVar2 = znVar.f40786w0;
                znVar.f40759u0.getClass();
                vjVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) znVar.f40707p9), false);
            } else {
                znVar.f40786w0.h1(i10, i11);
            }
        }
        znVar.K0 = z10;
        znVar.rc(primaryMessageObject, false);
        znVar.K0 = false;
    }

    @Override
    public final int k0(org.telegram.ui.Cells.s1 s1Var) {
        dh.f fVar;
        zn znVar = this.f35808a;
        if (znVar.f40758tc.f46961f && (fVar = znVar.f40836zc) != null && fVar.f4901n == s1Var && fVar.f4897a.getWidth() > 0) {
            return znVar.f40836zc.f4897a.getHeight();
        }
        return 0;
    }

    public final boolean l() {
        zn znVar = this.f35808a;
        if (!UserObject.isUserSelf(znVar.f40575f)) {
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
    public final void l0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        zn znVar = this.f35808a;
        if (znVar.getParentActivity() != null) {
            if (znVar.U9 == null) {
                hh.k kVar = new hh.k(znVar.getParentActivity());
                znVar.U9 = kVar;
                znVar.U0.addView(kVar, k7.b6.e(-1, -1, 48));
            }
            hh.k kVar2 = znVar.U9;
            HashMap hashMap = kVar2.f7151a;
            ArrayList arrayList = kVar2.f7153c;
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
                    long j12 = dialog.f19163id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f19163id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f19163id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f19306id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19163id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19163id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f19163id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19163id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19163id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = hh.k.b(s1Var);
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
                hh.j jVar = new hh.j(kVar2, s1Var, arrayList4, new ff.c(12, kVar2, b10));
                jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
                jVar.setCallback(kVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, jVar);
                }
            }
        }
    }

    @Override
    public final void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle g10 = kf.k0.g(j10, "user_id");
        org.telegram.ui.ActionBar.p2 p2Var = this.f35808a;
        if (p2Var.getMessagesController().checkCanOpenChat(g10, p2Var, s1Var.getMessageObject())) {
            p2Var.presentFragment(new zn(g10));
        }
    }

    @Override
    public final void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                R1(s1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            zn znVar = this.f35808a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(znVar)) {
                    cd0 cd0Var = new cd0(3);
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                    cd0Var.setResourceProvider(f6Var2);
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
                    cd0Var.L0 = false;
                    cd0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    znVar.presentFragment(cd0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                rt.q().w(znVar.getParentActivity());
                rt.q().v(new jn(this, tL_messageMediaPoll, pollAnswer, s1Var));
                rt q10 = rt.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = s1Var.getMessageObject();
                f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
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
                    TLRPC.TL_message C7 = zn.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = dh.i.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    dh.a aVar = new dh.a(i15, messageObject, document6, dh.i.c(messageObject.messageOwner, i10));
                    if (aVar.f4889g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = s1Var.f22210v7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            dh.j jVar = s1Var.Z5;
                            if (jVar != null) {
                                jVar.e();
                            }
                            dh.j jVar2 = s1Var.Y5;
                            if (jVar2 != null) {
                                jVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f4888f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = s1Var.f22210v7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            dh.j jVar3 = s1Var.Z5;
                            if (jVar3 != null) {
                                jVar3.e();
                            }
                            dh.j jVar4 = s1Var.Y5;
                            if (jVar4 != null) {
                                jVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = zn.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = dh.i.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, znVar, znVar.f40534ba);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = znVar.Q5;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = znVar.I6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = znVar.d();
                            }
                            t12.c2(messageObject6, znVar, j10, j11, j12, znVar.Ca);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, znVar.getParentActivity(), znVar.f40534ba, false);
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
                    C73.attachPath = dh.i.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
                    C74.attachPath = dh.i.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                lf.d.b(tL_messageMediaPoll.poll, znVar.getUserConfig().getClientUserId());
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
                        C75.attachPath = dh.i.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, znVar, znVar.f40534ba);
                    PhotoViewer.t1().a2(arrayList3, i11, znVar.a(), 0L, 0L, znVar.Da);
                }
            }
        }
    }

    @Override
    public final boolean m1(MessageObject messageObject) {
        lm lmVar;
        long dialogId = messageObject.getDialogId();
        zn znVar = this.f35808a;
        if ((dialogId == 1271266957 || ((lmVar = znVar.f40800x0) != null && lmVar.K)) && znVar.O3 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void n(org.telegram.ui.Cells.s1 s1Var) {
        if (s1Var.getMessageObject().isImportedForward()) {
            p1();
            return;
        }
        zn znVar = this.f35808a;
        if (!znVar.f40616i3 && znVar.f40759u0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
            if (znVar.f40726r2 == null) {
                rm rmVar = znVar.U0;
                int indexOfChild = rmVar.indexOfChild(znVar.P);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(1, znVar.getParentActivity(), znVar.f40534ba, false);
                    znVar.f40726r2 = l40Var;
                    rmVar.addView(l40Var, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    znVar.f40726r2.setAlpha(0.0f);
                    znVar.f40726r2.setVisibility(4);
                } else {
                    return;
                }
            }
            znVar.f40726r2.e(s1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void o() {
        this.f35808a.U0.getClass();
    }

    public final void p(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, boolean z4) {
        zn znVar = this.f35808a;
        TLRPC.Chat chat2 = znVar.e;
        if (chat2 != null && chat.f19159id == chat2.f19159id) {
            nj njVar = znVar.X0;
            if (njVar != null && i10 == 0) {
                njVar.e(false, false);
            } else if (s1Var.getMessageObject() != null) {
                znVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f19159id != chat2.f19159id || znVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19159id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            yi yiVar = null;
            if (z4) {
                ze.c cVar = znVar.f40811xb;
                if (cVar != null) {
                    cVar.a(true);
                    znVar.f40811xb = null;
                }
                if (s1Var.getMessageObject() == null) {
                    znVar.f40811xb = null;
                } else {
                    yi yiVar2 = new yi(znVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    znVar.f40811xb = yiVar2;
                    yiVar = yiVar2;
                }
            }
            if (znVar.getMessagesController().checkCanOpenChat(bundle, znVar, s1Var.getMessageObject(), yiVar)) {
                zn znVar2 = new zn(bundle);
                if (yiVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new dg.f3(this, yiVar, chat, i10, znVar2, 13), 5000L);
                    yiVar.d();
                    return;
                }
                znVar.presentFragment(znVar2);
            }
        }
    }

    @Override
    public final boolean p0() {
        boolean z4;
        zn znVar = this.f35808a;
        if (!znVar.A9()) {
            z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
            if (!z4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p1() {
        zn znVar = this.f35808a;
        znVar.Q7();
        UndoView undoView = znVar.f40775v3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, znVar.Q5, null);
    }

    @Override
    public final void q(org.telegram.ui.Cells.s1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.q(org.telegram.ui.Cells.s1):void");
    }

    public final void r(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19306id);
            org.telegram.ui.ActionBar.p2 p2Var = this.f35808a;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var, s1Var.getMessageObject())) {
                p2Var.presentFragment(new zn(bundle));
            }
        }
    }

    @Override
    public final void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        zn znVar = this.f35808a;
        if (!znVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (znVar.getParentActivity() != null) {
                if (znVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    lk lkVar = znVar.V;
                    MessageObject messageObject = s1Var.getMessageObject();
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    xi xiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    ze.c cVar = znVar.f40811xb;
                    if (cVar != null) {
                        cVar.a(true);
                        znVar.f40811xb = null;
                    }
                    if (str != null && s1Var.getMessageObject() != null) {
                        xi xiVar2 = new xi(znVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                        znVar.f40811xb = xiVar2;
                        xiVar = xiVar2;
                    } else {
                        znVar.f40811xb = null;
                    }
                    lkVar.c0(keyboardButtonProto, messageObject, messageObject2, xiVar);
                }
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (s1Var != null && pageBlock != null) {
            zn znVar = this.f35808a;
            if (znVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, znVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new um(znVar, arrayList), null, 0L, 0L, 0L, true, new tm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void s() {
        this.f35808a.Yb();
    }

    @Override
    public final void s0(String str) {
        zn znVar = this.f35808a;
        qk qkVar = znVar.L0;
        if (qkVar == null || qkVar.getVisibility() != 0) {
            pk pkVar = znVar.O;
            if ((pkVar == null || pkVar.getVisibility() != 0) && znVar.V != null && str != null && str.length() > 0) {
                lk lkVar = znVar.V;
                lkVar.setFieldText("@" + str + " ");
                znVar.V.H0();
            }
        }
    }

    @Override
    public final void s2(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f35808a.rc(primaryMessageObject, false);
    }

    @Override
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        vj vjVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            zn znVar = this.f35808a;
            sj sjVar = znVar.f40759u0;
            if (sjVar != null && (vjVar = znVar.f40786w0) != null && vjVar.f5729y < 0) {
                for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = znVar.f40759u0.getChildAt(childCount);
                    znVar.f40759u0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = znVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            znVar.rc(primaryMessageObject, false);
            ph.f3 f3Var = znVar.f40801x1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            if (i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
                znVar.f40786w0.h1(i10, i11);
            }
        }
    }

    @Override
    public final boolean t0(org.telegram.ui.Components.u5 u5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        zn znVar = this.f35808a;
        if (!znVar.getMessagesController().premiumFeaturesBlocked() && u5Var != null && !u5Var.standard) {
            long documentId = u5Var.getDocumentId();
            TLRPC.Document document = u5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                document = org.telegram.ui.Components.l5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.lv lvVar = new org.telegram.ui.Components.lv(znVar, znVar.getParentActivity(), znVar.f40534ba, arrayList);
                org.telegram.ui.Components.bv bvVar = lvVar.f26880f;
                bvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(bvVar);
                bvVar.v = imageReceiver;
                if (bvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                bvVar.f23755w = true;
                bvVar.f23756x.d(1.0f, true);
                bvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f, true), 0L, null, null, 0);
                bvVar.v.setLayerNum(7);
                bvVar.v.setAllowStartLottieAnimation(true);
                bvVar.v.setAllowStartAnimation(true);
                bvVar.v.setAutoRepeat(1);
                bvVar.v.setAllowDecodeSingleFrame(true);
                bvVar.v.setParentView(bvVar);
                lvVar.setCalcMandatoryInsets(znVar.x9());
                znVar.showDialog(lvVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
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
        zn znVar = this.f35808a;
        znVar.aa(znVar.e.f19159id, messageObject2, messageObject2.getId(), j11, i10, 0, null);
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var != null && document != null) {
            zn znVar = this.f35808a;
            if (znVar.getParentLayout() != null && a0(s1Var)) {
                org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(znVar, s1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new u1(this, s1Var, document, 24), false);
                H.f27778t = false;
                H.Z();
            }
        }
    }

    public final void v(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19159id);
            bundle.putBoolean("expandPhoto", false);
            this.f35808a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        zn znVar = this.f35808a;
        znVar.I7(s1Var, false, false, f10, f11, true, false, false);
        znVar.f40759u0.getClass();
        zn.c2(znVar, RecyclerView.R(s1Var));
    }

    @Override
    public final void v2() {
        this.f35808a.r9();
    }

    @Override
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        zn znVar = this.f35808a;
        if (UserObject.isBotForum(znVar.f40575f)) {
            return null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = znVar.getMessagesController().getAdminRank(znVar.e.f19159id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = znVar.Z3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    public final void x(TLRPC.User user, boolean z4) {
        int i10;
        if (user != null && user.f19306id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z4 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19306id);
            bundle.putBoolean("expandPhoto", z4);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            zn znVar = this.f35808a;
            TLRPC.User user2 = znVar.f40575f;
            if (user2 != null && user2.f19306id == user.f19306id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            znVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.f35808a.W7(s1Var, reactionCount, z4, f10, f11);
    }

    @Override
    public final void y(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            s1Var.t2();
            s1Var.requestLayout();
            this.f35808a.f40800x0.R(messageObject, false, false);
        }
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f35808a;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        boolean z4 = true;
        if (!kVar.s() && !znVar.A9()) {
            if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
                U0(10, s1Var);
                return;
            }
            if (!ChatObject.isForum(znVar.e) && !znVar.F9()) {
                z4 = false;
            }
            x(user, z4);
            return;
        }
        zn.b2(znVar, s1Var, true, f10, f11);
    }

    @Override
    public final void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        hh.j jVar;
        int i10;
        boolean z4;
        boolean z10;
        float f12;
        hh.k kVar = this.f35808a.U9;
        if (kVar != null && (jVar = (hh.j) kVar.f7151a.get(hh.k.b(s1Var))) != null) {
            hh.d[] dVarArr = jVar.f7148w;
            RectF rectF = jVar.f7146r;
            if (jVar.J) {
                float f13 = (f10 - rectF.left) + jVar.R;
                float f14 = (f11 - rectF.top) + jVar.S;
                int i11 = hh.i.f7136a;
                int floor = (int) Math.floor((f13 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(hh.i.f7136a + 11));
                if ((-AndroidUtilities.dp(37)) < f14 && f14 < rectF.height()) {
                    i10 = k7.n.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (jVar.O != i10) {
                    jVar.f7141a.performHapticFeedback(3, 1);
                    jVar.O = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        hh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f7111p != z4) {
                            ValueAnimator valueAnimator = dVar.f7109n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f7111p = z4;
                            float f16 = dVar.f7110o;
                            if (z4) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f7109n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f7109n.addUpdateListener(dVar);
                            dVar.f7109n.setInterpolator(hh.h.f7119a);
                            dVar.f7109n.start();
                        }
                        hh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (dVar2.f7108m != z10) {
                            ValueAnimator valueAnimator2 = dVar2.f7106k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f7108m = z10;
                            float f17 = dVar2.f7107l;
                            if (!z10) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f7106k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f7106k.addUpdateListener(dVar2);
                            dVar2.f7106k.setInterpolator(hh.h.f7119a);
                            dVar2.f7106k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean z2(int i10) {
        boolean z4;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        zn znVar = this.f35808a;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        if (z4 && znVar.G9) {
            e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                ((ActionBarLayout) e5Var2).r();
            }
            return true;
        }
        return !e();
    }
}
