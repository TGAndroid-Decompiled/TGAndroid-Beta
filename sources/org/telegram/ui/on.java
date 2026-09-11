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
public final class on implements org.telegram.ui.Cells.k1 {
    public final co f39283a;

    public on(co coVar) {
        this.f39283a = coVar;
    }

    public static void a(on onVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i10;
        co coVar = onVar.f39283a;
        if (coVar.getParentActivity() != null && document != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && coVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                coVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
                tL_message.f19890id = messageObject.getId();
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
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                arrayList.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(coVar.getParentActivity(), coVar.getAccountInstance(), arrayList, new va(onVar, 1));
            }
        }
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.f39283a;
        if (!coVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(coVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            coVar.getMessagesController().getContentSettings(new y(this, b2Var, t1Var, 5));
            return;
        }
        if (t1Var.getMessageObject() != null) {
            t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        t1Var.h4();
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, false, true);
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        co coVar = this.f39283a;
        if (!coVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (coVar.getParentActivity() != null) {
                if (coVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) coVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) coVar.f35247ea, false);
                        f3Var.fixNavigationBar();
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        f3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        mg.j jVar = new mg.j(3, coVar, str);
                        f3Var.items = charSequenceArr;
                        f3Var.onClickListener = jVar;
                        coVar.showDialog(f3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        coVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
    public final boolean B1() {
        co coVar = this.f39283a;
        if (coVar.X0.getKeyboardHeight() + coVar.f35367oa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            co coVar = this.f39283a;
            if ((coVar.f35471wb != id2 || coVar.f35484xb != 7) && (inputPeer = coVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f20090id = id2;
                of.e eVar = coVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    coVar.Ab = null;
                }
                aj ajVar = new aj(coVar, id2, t1Var, 2);
                ajVar.f17004b = new fh(0, coVar, r3);
                coVar.Ab = ajVar;
                ajVar.d();
                int[] iArr = {coVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new mg(coVar, ajVar, iArr, t1Var, messageObject))};
            }
        }
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        co coVar = this.f39283a;
        coVar.f35229d5 = messageObject;
        coVar.d9();
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
            int i13 = buttonCustom.f17066id;
            TL_stars.StarsAmount starsAmount = null;
            co coVar = this.f39283a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                nf nfVar = new nf(8, this, message);
                Pattern pattern = org.telegram.ui.Components.e5.f25557a;
                Activity parentActivity = coVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new m4(22, nfVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b2Var.N = new org.telegram.ui.Components.q1(editText, 0);
                frameLayout.addView(editText, w7.x5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
                coVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, coVar.f35237e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, coVar.f35237e, 5);
                    }
                    bi.e4 e4Var = new bi.e4(this, message, canManageMonoForum, messageObject, 11);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    coVar.g7(e4Var, zf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                coVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                coVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.f39283a;
        coVar.f35483xa.l(t1Var, coVar, true);
        coVar.f35473x0.I0(false);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        co coVar = this.f39283a;
        coVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        coVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(t1Var, true, false, true);
    }

    @Override
    public final void F1(MessageObject messageObject) {
        this.f39283a.f35408s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        kn knVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && of.f.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        co coVar = this.f39283a;
        of.e eVar = coVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        if (t1Var.getMessageObject() == null) {
            knVar = null;
        } else {
            knVar = new kn(this, t1Var);
        }
        coVar.Ab = knVar;
        if (!z11 && !of.f.f(parse, false, null)) {
            org.telegram.ui.Components.e5.r0(coVar, str, true, true, true, !z11, coVar.Ab, webPage, coVar.f35247ea);
        } else {
            of.f.r(coVar.getParentActivity(), parse, true, true, false, coVar.Ab, null, false, true, false);
        }
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        co coVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (coVar = this.f39283a).f35471wb) != 0 && i10 == t1Var.getMessageObject().getId() && coVar.f35484xb == 1) {
            return coVar.f35496yb;
        }
        return null;
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.vl.o(R.string.CodeCopied, org.telegram.ui.Components.yc.a0(this.f39283a));
        }
    }

    @Override
    public final boolean I0(long j3) {
        co coVar = this.f39283a;
        TLRPC.Chat chat = coVar.f35237e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return coVar.getMessagesController().isOwner(coVar.f35237e.f19869id, j3);
        }
        return false;
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            co coVar = this.f39283a;
            org.telegram.ui.Components.tu.J(coVar, messageObject, coVar.Fa, str2, str3, str4, str, i10, i11, -1, coVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void J0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j3;
        int i10;
        ArrayList<MessageObject> arrayList;
        a3.g0 g0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        co coVar = this.f39283a;
        vh.i iVar = coVar.X9;
        if (iVar != null) {
            HashMap hashMap = iVar.f47894a;
            vh.h hVar = (vh.h) hashMap.get(vh.i.b(t1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            vh.h hVar2 = (vh.h) coVar.X9.f47894a.get(vh.i.b(t1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j3 = hVar2.f47891w[i11].d;
            } else {
                j3 = 0;
            }
            if (messageObject != null && j3 != 0) {
                Activity parentActivity = coVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.e5.h(parentActivity, i10, j3, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) coVar.f35479x6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.w1.l(messageObject);
                    }
                    if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j10 = j3;
                    a3.g0 g0Var2 = new a3.g0(this, arrayList, j10, 15);
                    if (z10) {
                        g0Var2.run();
                        g0Var = null;
                    } else {
                        g0Var = g0Var2;
                    }
                    qcVar = org.telegram.ui.Components.yc.v(coVar.getParentActivity(), coVar, null, 1, j10, 1, coVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), coVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, g0Var);
                    qcVar.f29680k = true;
                    qcVar.k(qcVar.f29675e instanceof org.telegram.ui.Components.bc);
                }
            }
            vh.h hVar3 = (vh.h) hashMap.get(vh.i.b(t1Var));
            if (hVar3 != null) {
                if (qcVar == null) {
                    hVar3.R = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.ub ubVar = qcVar.f29675e;
                if (!(ubVar instanceof org.telegram.ui.Components.yb)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ubVar;
                hVar3.W = ybVar;
                ybVar.f32875a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new im(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        te teVar;
        a3.g0 g0Var;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        ah.w wVar;
        int i10;
        boolean z11;
        int i11;
        i51 i51Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f39283a.A0.L();
                    co coVar = this.f39283a;
                    return mediaController.setPlaylist(L, messageObject, coVar.L6, true ^ coVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f39283a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            k51 k51Var = this.f39283a.Z9;
            if (k51Var == null || k51Var.f37920b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.yc.a0(this.f39283a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f39283a.Z9 = new k51(this.f39283a.getParentActivity());
                k51 k51Var2 = this.f39283a.Z9;
                if (!messageObject.isOutOwner()) {
                    teVar = this.f39283a.fb(messageObject, true);
                } else {
                    teVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    g0Var = co.O4(this.f39283a, messageObject);
                } else {
                    g0Var = null;
                }
                Context context = k51Var2.f37917a;
                ah.w wVar2 = k51Var2.f37921c;
                k51Var2.X = teVar;
                k51Var2.Y = g0Var;
                i51 i51Var2 = k51Var2.N;
                if (i51Var2 != null) {
                    wVar2.removeView(i51Var2);
                    k51Var2.N = null;
                }
                k51Var2.O = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                k51Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k51Var2.S = z10;
                org.telegram.ui.Cells.t1 t1Var2 = k51Var2.O;
                if (t1Var2 != null) {
                    f6Var = t1Var2.getResourcesProvider();
                } else {
                    f6Var = null;
                }
                k51Var2.L = f6Var;
                if (k51Var2.O != null) {
                    k51Var2.T = 0.0f;
                    k51Var2.U = t1Var.f23038n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        k51Var2.T = view.getY() + k51Var2.T;
                        k51Var2.U = view.getY() + k51Var2.U;
                    }
                    int width = k51Var2.O.getWidth();
                    int height = k51Var2.O.getHeight();
                    if (k51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    k51Var2.K = i14 - k51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    wVar = wVar2;
                    i51 i51Var3 = new i51(k51Var2, k51Var2.getContext(), UserConfig.selectedAccount, k51Var2.O.getResourcesProvider(), width, i14);
                    k51Var2.N = i51Var3;
                    k51Var2.O.j1(i51Var3);
                    k51Var2.N.i1(k51Var2.O);
                    k51Var2.N.setDelegate(new Object());
                    i51 i51Var4 = k51Var2.N;
                    MessageObject messageObject3 = k51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = k51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = k51Var2.O;
                    i51Var4.X3(messageObject3, currentMessagesGroup, t1Var3.F, t1Var3.E, false, false);
                    if (!k51Var2.S) {
                        org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8();
                        k51Var2.V = l8Var;
                        i51 i51Var5 = k51Var2.N;
                        l8Var.f28093i = i51Var5;
                        i51Var5.f22925ee = l8Var;
                        if (i51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.io0 seekBarWaveform = k51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = k51Var2.f37929s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.f27219n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    k51Var2.H = false;
                    wVar.addView(k51Var2.N, new FrameLayout.LayoutParams(k51Var2.O.getWidth(), i14, 17));
                } else {
                    wVar = wVar2;
                    i10 = 360;
                }
                TextureView textureView = k51Var2.P;
                if (textureView != null) {
                    wVar.removeView(textureView);
                    k51Var2.P = null;
                }
                if (k51Var2.S) {
                    k51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    k51Var2.P = textureView2;
                    wVar.addView(textureView2, 0, w7.x5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.g71 g71Var = k51Var2.f37930w;
                if (g71Var != null) {
                    g71Var.B();
                    k51Var2.f37930w.H();
                    k51Var2.f37930w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = k51Var2.O;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(k51Var2.O.getMessageObject().currentAccount).getPathToAttach(k51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(k51Var2.O.getMessageObject().currentAccount).getPathToMessage(k51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && k51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(k51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.g71 g71Var2 = new org.telegram.ui.Components.g71();
                        k51Var2.f37930w = g71Var2;
                        g71Var2.J = new j51(k51Var2);
                        if (k51Var2.V != null) {
                            g71Var2.K = new j51(k51Var2);
                        }
                        if (k51Var2.S) {
                            g71Var2.V(k51Var2.P);
                        }
                        k51Var2.f37930w.D(Uri.fromFile(pathToAttach), "other");
                        k51Var2.f37930w.C();
                        org.telegram.ui.Components.ht htVar = k51Var2.E;
                        if (htVar != null) {
                            htVar.f26840s = k51Var2.f37930w;
                            htVar.a();
                        }
                    }
                    co coVar2 = this.f39283a;
                    coVar2.showDialog(coVar2.Z9);
                    return false;
                }
                di.f4 f4Var = k51Var2.f37931x;
                if (f4Var != null) {
                    wVar.removeView(f4Var);
                    k51Var2.f37931x = null;
                }
                MessageObject messageObject4 = k51Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = k51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(k51Var2.M.currentAccount).getClientUserId()) {
                    di.f4 f4Var2 = new di.f4(context, 3);
                    k51Var2.f37931x = f4Var2;
                    f4Var2.p(true);
                    if (z11) {
                        long dialogId = k51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(k51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(k51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        di.f4 f4Var3 = k51Var2.f37931x;
                        if (k51Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        f4Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        di.f4 f4Var4 = k51Var2.f37931x;
                        if (k51Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        f4Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    k51Var2.f37931x.q(12.0f);
                    di.f4 f4Var5 = k51Var2.f37931x;
                    if (!z11 && !k51Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    f4Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (k51Var2.S) {
                        k51Var2.f37931x.m(0.5f, 0.0f);
                        k51Var2.f37931x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        k51Var2.f37931x.m(0.0f, AndroidUtilities.dp(34.0f));
                        k51Var2.f37931x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    k51Var2.f37931x.t(14.0f);
                    di.f4 f4Var6 = k51Var2.f37931x;
                    f4Var6.h = di.f4.a(f4Var6.getText(), k51Var2.f37931x.getTextPaint());
                    if (k51Var2.S) {
                        wVar.addView(k51Var2.f37931x, w7.x5.d((int) ((k51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((k51Var2.O.getHeight() + k51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        wVar.addView(k51Var2.f37931x, w7.x5.d((int) ((k51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((k51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + k51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((k51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    k51Var2.f37931x.u();
                }
                TextView textView = k51Var2.f37932y;
                if (textView != null) {
                    wVar.removeView(textView);
                    k51Var2.f37932y = null;
                }
                TextView textView2 = new TextView(context);
                k51Var2.f37932y = textView2;
                textView2.setTextColor(-1);
                k51Var2.f37932y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    k51Var2.f37932y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    k51Var2.f37932y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                k51Var2.f37932y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.z5.a(k51Var2.f37932y);
                TextView textView3 = k51Var2.f37932y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                k51Var2.f37932y.setOnClickListener(new g51(k51Var2, 1));
                wVar.addView(k51Var2.f37932y, w7.x5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (i51Var = k51Var2.N) != null && i51Var.getMessageObject() != null && k51Var2.N.getMessageObject().messageOwner != null) {
                    k51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    k51Var2.N.invalidate();
                }
                co coVar22 = this.f39283a;
                coVar22.showDialog(coVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void K1(org.telegram.ui.Cells.t1 t1Var, ah.u uVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            uVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f39283a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
            return;
        }
        uVar.run();
    }

    @Override
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f39283a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void L0(int i10, org.telegram.ui.Cells.t1 t1Var) {
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
        hn hnVar = null;
        hn hnVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        hn hnVar3 = null;
        hn hnVar4 = null;
        co coVar = this.f39283a;
        if (i10 == 19) {
            of.e eVar = coVar.Ab;
            if (eVar != null) {
                eVar.a(true);
            }
            if (t1Var.getMessageObject() != null) {
                hnVar2 = new hn(this, t1Var, 2);
            }
            final hn hnVar5 = hnVar2;
            coVar.Ab = hnVar5;
            final Activity parentActivity = coVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = coVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            hnVar5.d();
            hnVar5.f17004b = new ug.e(atomicBoolean, 0);
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
            final String b10 = ug.j.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.messageOwner.date * 1000;
            ug.t.d(messageObject, new Utilities.Callback(atomicBoolean, hnVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f47116a;
                public final of.e f47117b;
                public final boolean f47118c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f47119e;
                public final Context f47120f;
                public final f6 f47121g;

                {
                    this.f47119e = tL_messageMediaGiveaway2;
                    this.f47120f = parentActivity;
                    this.f47121g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f47116a.get()) {
                        this.f47117b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f47118c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f47119e;
                        Context context = this.f47120f;
                        f6 f6Var = this.f47121g;
                        if (z12) {
                            j.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            j.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                        }
                    }
                }
            }, new ug.g(atomicBoolean, hnVar5, 0));
        } else if (i10 == 21) {
            h();
        } else if (i10 == 84) {
            coVar.ua(t1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.pg0.O;
            if (coVar.getParentActivity() != null) {
                coVar.showDialog(new org.telegram.ui.Components.pg0(coVar.getContext(), coVar.getCurrentAccount(), messageObject, coVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    coVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
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
                bundle.putLong("user_id", user.f20016id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                coVar.presentFragment(new ProfileActivity(bundle, null));
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
                coVar.showDialog(new org.telegram.ui.Components.pe0(coVar, null, user, null, file, gf.b.d(str, false), str3, str4, coVar.f35247ea));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if (i10 == 30) {
            coVar.presentFragment(new co(w.f.e(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.w1.j(new StringBuilder("+"), user2.phone, gf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = gf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f20016id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                coVar.presentFragment(new ss(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                coVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    of.e eVar2 = coVar.Ab;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        hnVar3 = new hn(this, t1Var, 4);
                    }
                    coVar.Ab = hnVar3;
                    of.f.r(coVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, coVar.Ab, null, false, coVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            coVar.getOrCreateStoryViewer().F(coVar.getParentActivity(), tL_webPageAttributeStory.storyItem, bi.d9.a(coVar.f35473x0));
                            return;
                        }
                    }
                }
                if (!coVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
                    of.e eVar3 = coVar.Ab;
                    if (eVar3 != null) {
                        eVar3.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        hnVar4 = new hn(this, t1Var, 5);
                    }
                    coVar.Ab = hnVar4;
                    of.f.r(coVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, coVar.Ab, null, false, true, false);
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
                of.e eVar4 = coVar.Ab;
                if (eVar4 != null) {
                    eVar4.a(true);
                }
                if (t1Var.getMessageObject() != null) {
                    hnVar = new hn(this, t1Var, 3);
                }
                coVar.Ab = hnVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        coVar.Ab.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        coVar.Ab.f17004b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new di.u3(4, this, z11)), 27);
                        return;
                    }
                }
                of.f.r(coVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, coVar.Ab, null, false, true, false);
            }
        }
    }

    @Override
    public final void L1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        co coVar = this.f39283a;
        if (coVar.X0 != null && coVar.getParentActivity() != null) {
            Context context = coVar.X0.getContext();
            f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
            k41.T(context, coVar, false, f6Var, null);
        }
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        co coVar = this.f39283a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (coVar.T5 != j3) {
                coVar.presentFragment(co.R9(j3));
            } else {
                coVar.f35186a1.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            coVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        aj ajVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        rg.f fVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            co coVar = this.f39283a;
            of.e eVar = coVar.Ab;
            if (eVar != null) {
                eVar.a(true);
                coVar.Ab = null;
            }
            if (t1Var.getMessageObject() == null) {
                coVar.Ab = null;
                ajVar = null;
            } else {
                ajVar = new aj(coVar, t1Var.getMessageObject().getId(), t1Var, 1);
                coVar.Ab = ajVar;
            }
            i10 = ((org.telegram.ui.ActionBar.n2) this.f39283a).currentAccount;
            zh.s5 y3 = zh.s5.y(i10, false);
            Objects.requireNonNull(ajVar);
            dj djVar = new dj(ajVar, 7);
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.f6 I = zh.s5.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f52566a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject p5 = fi.k3.p(I, false);
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                fVar = new rg.f(y3, ConnectionsManager.getInstance(y3.f52566a).sendRequest(tL_payments_getPaymentForm, new bi.c3(y3, messageObject, tL_inputInvoiceMessage, djVar, 19)), 6);
            }
            if (fVar != null) {
                ajVar.f17004b = fVar;
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
                    TLRPC.TL_message C7 = co.C7(message);
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
                co coVar2 = this.f39283a;
                t12.K2(null, coVar2, coVar2.f35247ea);
                PhotoViewer.t1().a2(arrayList, i11, this.f39283a.a(), 0L, 0L, this.f39283a.Ga);
            }
        }
    }

    @Override
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f39283a.fb(messageObject, true);
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        co coVar = this.f39283a;
        coVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, coVar);
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
        co coVar = this.f39283a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            sg.o1 o1Var = new sg.o1(coVar, i10, user, null, null, coVar.f35247ea);
            t1Var.getLocationOnScreen(new int[2]);
            o1Var.f46214v0 = t1Var.getNameStatusX();
            o1Var.f46215w0 = t1Var.getNameStatusY();
            o1Var.f46218z0 = t1Var.getScaleX();
            o1Var.f46216x0 = t1Var.getLeft();
            o1Var.f46217y0 = t1Var.getTop();
            o1Var.A0 = t1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
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
                o1Var.f46213u0 = num;
            } else {
                o1Var.f46213u0 = Integer.valueOf(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20918r8[colorId]));
            }
            org.telegram.ui.Components.o5 o5Var = t1Var.f22938fc;
            if (o5Var != null && (o5Var.f28961f[0] instanceof org.telegram.ui.Components.q5)) {
                o1Var.f46218z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(coVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20827m6, 0.2f);
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
                    x9Var.setLayerNum(7);
                    x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    x9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = o1Var.f46213u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = coVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20990v6);
                        }
                        x9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        o1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        o1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    o1Var.B0 = x9Var;
                    o1Var.E0 = true;
                }
            }
            coVar.showDialog(o1Var);
            return;
        }
        of.f.s(coVar.getParentActivity(), "https://" + coVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        co coVar = this.f39283a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!t1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(coVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!coVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new zm(this, 9))).k(true);
            return false;
        } else {
            coVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(coVar.f35237e, coVar.Z7, true), t1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 r40, org.telegram.tgnet.TLRPC.PollAnswer r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.O1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean P() {
        co coVar = this.f39283a;
        if (coVar.W5[1].size() + coVar.W5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var != null) {
            co coVar = this.f39283a;
            if (coVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(coVar.f35237e);
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
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.f39283a.U7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    @Override
    public final ov0 Q1() {
        return this.f39283a.f35470wa;
    }

    @Override
    public final boolean R() {
        co coVar = this.f39283a;
        if (!UserObject.isReplyUser(coVar.f35249f) && !UserObject.isUserSelf(coVar.f35249f)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean R0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null) {
            co coVar = this.f39283a;
            if (!coVar.f35309jc && messageObject.getId() == coVar.f35297ic) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - coVar.f35322kc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        co coVar = this.f39283a;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (!kVar.s() && !coVar.A9()) {
            if (!z10 && chat.signature_profiles && (messageObject = t1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                coVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                p(t1Var, chat, i10, z10);
                return;
            }
        }
        co.b2(coVar, t1Var, true, f7, f10);
    }

    @Override
    public final void S0(org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.f39283a;
        coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(coVar.T5), t1Var);
    }

    @Override
    public final boolean S1(long j3) {
        co coVar = this.f39283a;
        TLRPC.Chat chat = coVar.f35237e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return coVar.getMessagesController().isAdmin(coVar.f35237e.f19869id, j3);
        }
        return false;
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, true, false);
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.T1(org.telegram.ui.Cells.t1, int, float, float, boolean):void");
    }

    @Override
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
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
            co coVar = this.f39283a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = coVar.f35473x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = coVar.f35473x0.getChildAt(i11);
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
            coVar.Jb(messageObject, spannableStringBuilder, 1);
            t1Var.g4(1, false, true);
        }
    }

    @Override
    public final boolean U1(org.telegram.ui.Cells.t1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.U1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final int V() {
        return this.f39283a.R3;
    }

    @Override
    public final void W1(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        co coVar = this.f39283a;
        if (AndroidUtilities.isContextSafe(coVar.getParentActivity()) && (chat = coVar.f35237e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            e(t1Var, coVar.getMessagesController().getParticipant(coVar.f35237e.f19869id, currentUser.f20016id));
        }
    }

    @Override
    public final boolean X0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.f39283a;
        if (coVar.f35471wb != 0 && t1Var.getMessageObject() != null && coVar.f35471wb == t1Var.getMessageObject().getId() && coVar.f35484xb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final ih.a Y() {
        return this.f39283a.Qb;
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, long j3) {
        Bundle e7 = w.f.e(j3, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.f39283a;
        if (n2Var.getMessagesController().checkCanOpenChat(e7, n2Var, t1Var.getMessageObject())) {
            n2Var.presentFragment(new co(e7));
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
            co coVar = this.f39283a;
            if (coVar.R3 != 1 && !coVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        x4 b10;
        int i11;
        rk rkVar;
        qk qkVar;
        if (!l()) {
            return false;
        }
        co coVar = this.f39283a;
        if (coVar.f35237e != null && (((rkVar = coVar.O0) == null || rkVar.getVisibility() != 0) && ((qkVar = coVar.R) == null || qkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = coVar.f35237e;
        if (chat != null && ((coVar.f35228d4 == 0 || coVar.f35277h4) && (!ChatObject.isChannel(chat) || coVar.f35237e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c10 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.f35655n;
            c10 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c10] = d5.f35656r;
        }
        TLRPC.UserFull userFull = coVar.getMessagesController().getUserFull(user.f20016id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        } else {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) coVar.fragmentView, coVar.f35247ea, b10, new b7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(coVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final on f34844b;

            {
                this.f34844b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f34844b.x(user, false);
                        return;
                    case 1:
                        this.f34844b.d(user);
                        return;
                    default:
                        this.f34844b.f39283a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new r1(this, t1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final on f34844b;

            {
                this.f34844b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f34844b.x(user, false);
                        return;
                    case 1:
                        this.f34844b.d(user);
                        return;
                    default:
                        this.f34844b.f39283a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final on f34844b;

            {
                this.f34844b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f34844b.x(user, false);
                        return;
                    case 1:
                        this.f34844b.d(user);
                        return;
                    default:
                        this.f34844b.f39283a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f28661t = false;
        H.f28642i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        co coVar = this.f39283a;
        mk mkVar = coVar.Y;
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
                coVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new zm(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        co coVar = this.f39283a;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (!kVar2.s() && !coVar.A9()) {
                z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
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
        co coVar = this.f39283a;
        try {
            if (i10 == 0) {
                coVar.h7();
                jl jlVar = coVar.f35501z3;
                if (jlVar != null) {
                    jlVar.l(0L, 84, null, new zm(this, 1));
                    coVar.f35501z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(coVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (coVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.d31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.d31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.yc.a0(coVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                coVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(coVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", coVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new zm(this, 2));
                } else if (coVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new zm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), a02.f32883c);
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
                ybVar.f32876b.setText(append2);
                ybVar.f32876b.setSingleLine(false);
                ybVar.f32876b.setMaxLines(6);
                a02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean c1(MessageObject messageObject) {
        om omVar;
        long dialogId = messageObject.getDialogId();
        co coVar = this.f39283a;
        if ((dialogId == 1271266957 || ((omVar = coVar.A0) != null && omVar.N)) && coVar.R3 != 7) {
            return true;
        }
        return false;
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        co coVar = this.f39283a;
        mk mkVar = coVar.Y;
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
                SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.p6.t(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.o51("" + user.f20016id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            coVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new zm(this, 7), 200L);
        }
    }

    @Override
    public final boolean d0() {
        if (this.f39283a.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var != null && pageBlock != null) {
            co coVar = this.f39283a;
            if (coVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, coVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new xm(coVar, arrayList), null, 0L, 0L, 0L, true, new wm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        co coVar = this.f39283a;
        coVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(coVar.getParentActivity()) && (chat = coVar.f35237e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == coVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == coVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = coVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                org.telegram.ui.Components.a01.b(parentActivity, i10, -coVar.f35237e.f19869id, currentUser, str2, z15, z16, z12, f6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == coVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(coVar.f35237e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                coVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(coVar.f35237e);
                tL_channels_getParticipant.participant = coVar.getMessagesController().getInputPeer(currentUser.f20016id);
                coVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new bi.f0(7, this, t1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = coVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
            org.telegram.ui.Components.a01.b(parentActivity2, i10, -coVar.f35237e.f19869id, currentUser, str2, z152, z162, z12, f6Var);
        }
    }

    @Override
    public final void e0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        this.f39283a.I7(t1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final void e1() {
        co coVar = this.f39283a;
        coVar.Q7();
        UndoView undoView = coVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, coVar.T5, null);
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f39283a.rc(primaryMessageObject, false);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar;
        co coVar = this.f39283a;
        if (coVar.wc.f15369f && (cVar = coVar.Cc) != null && cVar.f45608n == t1Var && cVar.f45603a.getWidth() > 0) {
            return coVar.Cc.f45603a.getHeight();
        }
        return 0;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        co coVar;
        int i10;
        if (t1Var.getMessageObject() != null && (i10 = (coVar = this.f39283a).f35471wb) != 0 && i10 == t1Var.getMessageObject().getId() && coVar.f35484xb == 3) {
            return coVar.f35509zb;
        }
        return null;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        co coVar = this.f39283a;
        if (coVar.getParentActivity() != null) {
            if (coVar.X9 == null) {
                vh.i iVar = new vh.i(coVar.getParentActivity());
                coVar.X9 = iVar;
                coVar.X0.addView(iVar, w7.x5.e(-1, -1, 48));
            }
            vh.i iVar2 = coVar.X9;
            HashMap hashMap = iVar2.f47894a;
            ArrayList arrayList = iVar2.f47896c;
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
                    long j11 = dialog.f19873id;
                    if (j11 != j3 && !DialogObject.isEncryptedDialog(j11)) {
                        if (DialogObject.isUserDialog(dialog.f19873id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f19873id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20016id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19873id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19873id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f19873id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19873id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19873id));
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
                vh.h hVar = new vh.h(iVar2, t1Var, arrayList4, new ug.r(6, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        co coVar = this.f39283a;
        if (!coVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (coVar.getParentActivity() != null) {
                if (coVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    mk mkVar = coVar.Y;
                    MessageObject messageObject = t1Var.getMessageObject();
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    zi ziVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    of.e eVar = coVar.Ab;
                    if (eVar != null) {
                        eVar.a(true);
                        coVar.Ab = null;
                    }
                    if (str != null && t1Var.getMessageObject() != null) {
                        zi ziVar2 = new zi(coVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                        coVar.Ab = ziVar2;
                        ziVar = ziVar2;
                    } else {
                        coVar.Ab = null;
                    }
                    mkVar.c0(keyboardButtonProto, messageObject, messageObject2, ziVar);
                }
            }
        }
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
        co coVar = this.f39283a;
        if (isHuaweiStoreApp) {
            of.f.s(coVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(coVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
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
            boolean a10 = w7.b0.a(a2, 7);
            co coVar = this.f39283a;
            if (a10) {
                org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                coVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                t1Var.S0(true);
            } else if (coVar.getParentActivity() != null) {
                if (coVar.f35349n2 == null) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(5, coVar.getParentActivity(), coVar.f35247ea, false);
                    coVar.f35349n2 = i40Var;
                    i40Var.setAlpha(0.0f);
                    coVar.f35349n2.setVisibility(4);
                    int indexOfChild = coVar.X0.indexOfChild(coVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    coVar.X0.addView(coVar.f35349n2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i16);
                            float y3 = ((t1Var.getY() + r1Var.f22512b) - AndroidUtilities.dp(4.0f)) - coVar.f35418s9;
                            coVar.f35384q2 = AndroidUtilities.dp(13.3f) + r1Var.f22511a;
                            int D = org.telegram.messenger.vl.D(6.0f, r1Var.f22512b, i12);
                            coVar.f35397r2 = D;
                            if (y3 > 0.0f) {
                                i15 = coVar.f35384q2;
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
                        coVar.f35473x0.v0(0, (int) f7, null);
                        coVar.f35372p2 = t1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                coVar.f35349n2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i2() {
        this.f39283a.r9();
    }

    @Override
    public final void j() {
        h();
    }

    @Override
    public final boolean j0() {
        boolean z10;
        co coVar = this.f39283a;
        if (!coVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void j1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var != null && document != null) {
            co coVar = this.f39283a;
            if (coVar.getParentLayout() != null && Z(t1Var)) {
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(coVar, t1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new r1(this, t1Var, document, 24), false);
                H.f28661t = false;
                H.Z();
            }
        }
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        xj xjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        co coVar = this.f39283a;
        uj ujVar = coVar.f35473x0;
        if (ujVar != null && (xjVar = coVar.f35498z0) != null && xjVar.f45735y < 0) {
            for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = coVar.f35473x0.getChildAt(childCount);
                coVar.f35473x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = coVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i11 = coVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                xj xjVar2 = coVar.f35498z0;
                coVar.f35473x0.getClass();
                xjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) coVar.f35418s9), false);
            } else {
                coVar.f35498z0.h1(i10, i11);
            }
        }
        coVar.N0 = z11;
        coVar.rc(primaryMessageObject, false);
        coVar.N0 = false;
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f39283a.W7(t1Var, reactionCount, z10, f7, f10);
    }

    public final boolean l() {
        co coVar = this.f39283a;
        if (!UserObject.isUserSelf(coVar.f35249f)) {
            TLRPC.Chat chat = coVar.f35237e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !coVar.f35237e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
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
                G1(t1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            co coVar = this.f39283a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(coVar)) {
                    id0 id0Var = new id0(3);
                    f6Var2 = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                    id0Var.setResourceProvider(f6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = coVar.getMessagesController().getPeer(coVar.a());
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
                    coVar.presentFragment(id0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                st.q().w(coVar.getParentActivity());
                st.q().v(new mn(this, tL_messageMediaPoll, pollAnswer, t1Var));
                st q6 = st.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = t1Var.getMessageObject();
                f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
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
                    TLRPC.TL_message C7 = co.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = rh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
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
                    i15 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f45599g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = t1Var.f23205y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            rh.g gVar = t1Var.f22890c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            rh.g gVar2 = t1Var.f22876b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f45598f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = t1Var.f23205y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            rh.g gVar3 = t1Var.f22890c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            rh.g gVar4 = t1Var.f22876b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = co.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = rh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, coVar, coVar.f35247ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j3 = coVar.T5;
                            } else {
                                j3 = 0;
                            }
                            if (i19 != 0) {
                                j10 = coVar.L6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = coVar.d();
                            }
                            t12.c2(messageObject6, coVar, j3, j10, j11, coVar.Fa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, coVar.getParentActivity(), coVar.f35247ea, false);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            coVar.z6(messageObject6);
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
                    TLRPC.TL_message C73 = co.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = rh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = co.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = rh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C74, false, true));
                    arrayList2.add(-3);
                }
                zf.d.b(tL_messageMediaPoll.poll, coVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message C75 = co.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = rh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, coVar, coVar.f35247ea);
                    PhotoViewer.t1().a2(arrayList3, i11, coVar.a(), 0L, 0L, coVar.Ga);
                }
            }
        }
    }

    @Override
    public final void m0(String str) {
        co coVar = this.f39283a;
        rk rkVar = coVar.O0;
        if (rkVar == null || rkVar.getVisibility() != 0) {
            qk qkVar = coVar.R;
            if ((qkVar == null || qkVar.getVisibility() != 0) && coVar.Y != null && str != null && str.length() > 0) {
                mk mkVar = coVar.Y;
                mkVar.setFieldText("@" + str + " ");
                coVar.Y.H0();
            }
        }
    }

    @Override
    public final boolean m2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        co coVar = this.f39283a;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        if (z10 && coVar.J9) {
            d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                ((ActionBarLayout) d5Var2).r();
            }
            return true;
        }
        return !c();
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            e1();
            return;
        }
        co coVar = this.f39283a;
        if (!coVar.f35325l3 && coVar.f35473x0 != null && coVar.getParentActivity() != null && coVar.fragmentView != null) {
            if (coVar.f35436u2 == null) {
                um umVar = coVar.X0;
                int indexOfChild = umVar.indexOfChild(coVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(1, coVar.getParentActivity(), coVar.f35247ea, false);
                    coVar.f35436u2 = i40Var;
                    umVar.addView(i40Var, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    coVar.f35436u2.setAlpha(0.0f);
                    coVar.f35436u2.setVisibility(4);
                } else {
                    return;
                }
            }
            coVar.f35436u2.e(t1Var, null, 0, 0, true);
        }
    }

    @Override
    public final boolean n0(org.telegram.ui.Components.z5 z5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        co coVar = this.f39283a;
        if (!coVar.getMessagesController().premiumFeaturesBlocked() && z5Var != null && !z5Var.standard) {
            long documentId = z5Var.getDocumentId();
            TLRPC.Document document = z5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                document = org.telegram.ui.Components.q5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.rv rvVar = new org.telegram.ui.Components.rv(coVar, coVar.getParentActivity(), coVar.f35247ea, arrayList);
                org.telegram.ui.Components.hv hvVar = rvVar.f30096f;
                hvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(hvVar);
                hvVar.v = imageReceiver;
                if (hvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                hvVar.f26874w = true;
                hvVar.f26875x.d(1.0f, true);
                hvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20827m6, 0.2f, true), 0L, null, null, 0);
                hvVar.v.setLayerNum(7);
                hvVar.v.setAllowStartLottieAnimation(true);
                hvVar.v.setAllowStartAnimation(true);
                hvVar.v.setAutoRepeat(1);
                hvVar.v.setAllowDecodeSingleFrame(true);
                hvVar.v.setParentView(hvVar);
                rvVar.setCalcMandatoryInsets(coVar.x9());
                coVar.showDialog(rvVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o() {
        this.f39283a.X0.getClass();
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        vh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        vh.i iVar = this.f39283a.X9;
        if (iVar != null && (hVar = (vh.h) iVar.f47894a.get(vh.i.b(t1Var))) != null) {
            vh.d[] dVarArr = hVar.f47891w;
            RectF rectF = hVar.f47889r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = vh.g.f47875a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.f47875a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.p.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f47882a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        vh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f47853p != z10) {
                            ValueAnimator valueAnimator = dVar.f47851n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f47853p = z10;
                            float f15 = dVar.f47852o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f47851n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f47851n.addUpdateListener(dVar);
                            dVar.f47851n.setInterpolator(vh.f.f47857a);
                            dVar.f47851n.start();
                        }
                        vh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f47850m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f47848k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f47850m = z11;
                            float f16 = dVar2.f47849l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f47848k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f47848k.addUpdateListener(dVar2);
                            dVar2.f47848k.setInterpolator(vh.f.f47857a);
                            dVar2.f47848k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void o2() {
        co coVar = this.f39283a;
        if (coVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", coVar.T5);
            bundle.putInt("start_from", 10);
            coVar.presentFragment(new org.telegram.ui.Components.ca0(bundle, coVar.f35186a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", coVar.getMessagesController().recommendedChannelsLimitPremium), new zm(this, 4))).j();
    }

    public final void p(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z10) {
        co coVar = this.f39283a;
        TLRPC.Chat chat2 = coVar.f35237e;
        if (chat2 != null && chat.f19869id == chat2.f19869id) {
            pj pjVar = coVar.f35186a1;
            if (pjVar != null && i10 == 0) {
                pjVar.e(false, false);
            } else if (t1Var.getMessageObject() != null) {
                coVar.F(i10, t1Var.getMessageObject().getId(), 0, 0, true, false);
            }
        } else if (chat2 == null || chat.f19869id != chat2.f19869id || coVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19869id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            aj ajVar = null;
            if (z10) {
                of.e eVar = coVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    coVar.Ab = null;
                }
                if (t1Var.getMessageObject() == null) {
                    coVar.Ab = null;
                } else {
                    aj ajVar2 = new aj(coVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    coVar.Ab = ajVar2;
                    ajVar = ajVar2;
                }
            }
            if (coVar.getMessagesController().checkCanOpenChat(bundle, coVar, t1Var.getMessageObject(), ajVar)) {
                co coVar2 = new co(bundle);
                if (ajVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new fi.l3(this, ajVar, chat, i10, coVar2, 16), 5000L);
                    ajVar.d();
                    return;
                }
                coVar.presentFragment(coVar2);
            }
        }
    }

    @Override
    public final void p0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        co coVar = this.f39283a;
        coVar.I7(t1Var, false, false, f7, f10, true, false, false);
        coVar.f35473x0.getClass();
        co.c2(coVar, RecyclerView.R(t1Var));
    }

    @Override
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        co coVar = this.f39283a;
        di.f4 f4Var = coVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (coVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e7) {
                FileLog.e(e7);
                str = factCheck.country;
            }
            di.f4 f4Var2 = new di.f4(coVar.getParentActivity(), 3);
            f4Var2.p(true);
            f4Var2.K = Layout.Alignment.ALIGN_NORMAL;
            f4Var2.d = -1L;
            f4Var2.T = true;
            f4Var2.f7201e = true;
            f4Var2.q(12.0f);
            coVar.A1 = f4Var2;
            f4Var2.f7210l0 = new fh(12, this, f4Var2);
            f4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            coVar.X0.addView(coVar.A1, w7.x5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            coVar.X0.post(new i2.a0(this, t1Var, i11, i10, 4));
        }
    }

    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20016id);
            org.telegram.ui.ActionBar.n2 n2Var = this.f39283a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, t1Var.getMessageObject())) {
                n2Var.presentFragment(new co(bundle));
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.r9 q2() {
        return this.f39283a.f35221c9;
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.r(org.telegram.ui.Cells.t1):void");
    }

    @Override
    public final void s() {
        this.f39283a.Yb();
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.f39283a;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        boolean z10 = true;
        if (!kVar.s() && !coVar.A9()) {
            if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
                L0(10, t1Var);
                return;
            }
            if (!ChatObject.isForum(coVar.f35237e) && !coVar.F9()) {
                z10 = false;
            }
            x(user, z10);
            return;
        }
        co.b2(coVar, t1Var, true, f7, f10);
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
            co coVar = this.f39283a;
            uj ujVar = coVar.f35473x0;
            if (ujVar != null && (xjVar = coVar.f35498z0) != null && xjVar.f45735y < 0) {
                for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = coVar.f35473x0.getChildAt(childCount);
                    coVar.f35473x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = coVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = coVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            coVar.rc(primaryMessageObject, false);
            di.f4 f4Var = coVar.A1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            if (i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
                coVar.f35498z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t1 r38, float r39, float r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.t0(org.telegram.ui.Cells.t1, float, float, boolean):void");
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
        co coVar = this.f39283a;
        coVar.aa(coVar.f35237e.f19869id, messageObject2, messageObject2.getId(), j10, i10, 0, null);
    }

    @Override
    public final boolean u0(MessageObject messageObject) {
        return !this.f39283a.f35408s.containsKey(messageObject);
    }

    @Override
    public final boolean u1() {
        co coVar = this.f39283a;
        if (coVar.X0.getMeasuredWidth() > coVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    public final void v(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19869id);
            bundle.putBoolean("expandPhoto", false);
            this.f39283a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar = this.f39283a.Cc;
        if (cVar != null && cVar.f45608n == t1Var) {
            cVar.f45611w.getClass();
        }
    }

    @Override
    public final void v1(org.telegram.ui.Cells.t1 t1Var) {
        co.U4(this.f39283a, t1Var);
    }

    @Override
    public final String w(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        co coVar = this.f39283a;
        if (UserObject.isBotForum(coVar.f35249f)) {
            return null;
        }
        TLRPC.Chat chat = coVar.f35237e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = coVar.getMessagesController().getAdminRank(coVar.f35237e.f19869id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = coVar.f35216c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final void w0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.d6 animation;
        co coVar = this.f39283a;
        if (!coVar.f35325l3 && !SharedConfig.noSoundHintShowed && coVar.f35473x0 != null && coVar.getParentActivity() != null && coVar.fragmentView != null) {
            org.telegram.ui.Components.i40 i40Var = coVar.f35424t2;
            if (i40Var == null || i40Var.getTag() == null) {
                if (coVar.f35424t2 == null) {
                    um umVar = coVar.X0;
                    int indexOfChild = umVar.indexOfChild(coVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(0, coVar.getParentActivity(), coVar.f35247ea, false);
                        coVar.f35424t2 = i40Var2;
                        i40Var2.setShowingDuration(10000L);
                        umVar.addView(coVar.f35424t2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        coVar.f35424t2.setAlpha(0.0f);
                        coVar.f35424t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = coVar.f35473x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coVar.f35473x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && coVar.f35424t2.e(t1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        k(t1Var, z10, false, false);
    }

    public final void x(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f20016id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            z10 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20016id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            co coVar = this.f39283a;
            TLRPC.User user2 = coVar.f35249f;
            if (user2 != null && user2.f20016id == user.f20016id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = coVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            coVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        co coVar = this.f39283a;
        if (coVar.getParentActivity() != null && tLObject != null) {
            d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                if (((ActionBarLayout) d5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19869id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f20016id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, coVar.getParentActivity(), coVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(coVar.getParentActivity(), false, false);
                f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                f1Var.setMinimumWidth(160);
                f1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(coVar.getParentActivity(), false, false);
                f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                f1Var2.setMinimumWidth(160);
                f1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, t1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                co coVar2 = new co(bundle);
                coVar2.J9 = true;
                coVar.presentFragmentAsPreviewWithMenu(coVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                coVar.d7();
                return;
            }
            coVar.presentFragment(new co(bundle));
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
            this.f39283a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        boolean z10;
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        co coVar = this.f39283a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(coVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(coVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = coVar.getMessagesController().conferenceCallSizeLimit;
                b2Var.setOnCancelListener(new ba(this, coVar.getConnectionsManager().sendRequest(getgroupcall, new di.kd(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
                b2Var.q(600L);
                return;
            }
            TLRPC.User user = coVar.f35249f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = coVar.f35192a8;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, z10, coVar.getParentActivity(), coVar.getMessagesController().getUserFull(coVar.f35249f.f20016id), coVar.getAccountInstance());
                return;
            }
            return;
        }
        coVar.I7(t1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
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
        x4 x4Var;
        int i17;
        int i18;
        d5 d5Var;
        rk rkVar;
        qk qkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        co coVar = this.f39283a;
        if (!isEmpty && coVar.f35237e != null && (((rkVar = coVar.O0) == null || rkVar.getVisibility() != 0) && ((qkVar = coVar.R) == null || qkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = coVar.f35237e;
        if (chat2 != null && ((coVar.f35228d4 == 0 || coVar.f35277h4) && (!ChatObject.isChannel(chat2) || coVar.f35237e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = coVar.f35237e;
        if (chat3 != null && chat3.f19869id == chat.f19869id && !coVar.F9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        d5[] d5VarArr = new d5[i12 + 1 + i10 + i11];
        d5VarArr[0] = d5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                d5Var = d5.f35653e;
            } else {
                d5Var = d5.f35654f;
            }
            d5VarArr[1] = d5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            d5VarArr[i13] = d5.f35655n;
            i13++;
        }
        if (i11 != 0) {
            d5VarArr[i13] = d5.f35656r;
        }
        TLRPC.ChatFull chatFull = coVar.getMessagesController().getChatFull(chat.f19869id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
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
            com.google.firebase.messaging.m.k().v((ViewGroup) coVar.fragmentView, coVar.f35247ea, x4Var, new b7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(coVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new cn(this, chat, 0), false);
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
        H.l(i17, LocaleController.getString(i18), new r1(this, t1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new cn(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new cn(this, chat, 2), i16);
        H.f28661t = false;
        H.f28642i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }
}
